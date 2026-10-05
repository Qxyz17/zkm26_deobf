package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class iu extends i8 {
   String m;
   String k;
   boolean D;
   private int M;
   int H;
   int d;
   private boolean i;
   List V;
   String o;
   private static final long a = ess.a(6671426755338568891L, -4213233208255963418L, MethodHandles.lookup().lookupClass()).a(32631531124164L);
   private static final String[] s;
   private static final String[] t;
   private static final Map u = new HashMap(13);
   private static final long[] O;
   private static final Integer[] Q;
   private static final Map R;

   public int v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 872581096296767435L, var2);
   }

   public final boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 69062769171173L;
      return this.V(var4, e<"a">(21552, 7753811280638739003L ^ var2));
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = this.m.lastIndexOf(e<"a">(1234, 1732227424910152950L ^ var2));
      return this.m.substring(0, var4 + 1);
   }

   public final String x(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      long var10001 = var3 ^ 7791951988420L;
      int var5 = (int)((var3 ^ 7791951988420L) >>> 32);
      int var6 = (int)((var3 ^ 7791951988420L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Object[] var10007 = new Object[]{null, null, null, null, var7};
      var10007[3] = var6;
      var10007[2] = var5;
      var10007[1] = null;
      var10007[0] = var2;
      return x44.a<"m">(this, var10007, -1128653850114774800L, var3);
   }

   public final void E(Object[] param1) {
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
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/iu.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 6094736640813458686
      // 1f: lload 3
      // 20: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: iload 5
      // 29: ifeq 61
      // 2c: iload 2
      // 2d: ifeq 6c
      // 30: goto 3d
      // 33: ldc2_w 5940574871805436664
      // 36: lload 3
      // 37: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 2
      // 3f: bipush 1
      // 40: anewarray 576
      // 43: dup_x1
      // 44: swap
      // 45: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: ldc2_w 5907826289300964620
      // 4e: lload 3
      // 4f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: goto 61
      // 57: ldc2_w 5940574871805436664
      // 5a: lload 3
      // 5b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: lload 3
      // 62: lconst_0
      // 63: lcmp
      // 64: ifle 83
      // 67: iload 5
      // 69: ifne 90
      // 6c: aload 0
      // 6d: bipush 2
      // 6e: bipush 1
      // 6f: anewarray 576
      // 72: dup_x1
      // 73: swap
      // 74: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: ldc2_w 6282472944316463668
      // 7d: lload 3
      // 7e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: goto 90
      // 86: ldc2_w 5940574871805436664
      // 89: lload 3
      // 8a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: return
   }

   public final String G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 102827851553864L;
      return x44.a<"h">(this, var4, 8834551196595570085L, var2) + this.H();
   }

   iu(long var1, h8 var3, _xx var4, _y4 var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 1635112066395L;
      long var10001 = var1 ^ 108790794074015L;
      int var8 = (int)((var1 ^ 108790794074015L) >>> 48);
      int var9 = (int)((var1 ^ 108790794074015L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      super(var3, var4, var6, var5);
      this.H = -1;
      this.d = -1;
      x44.a<"r">(this, -1, 3487773575240180656L, var1);
      char var12 = (char)var8;
      short var10002 = (short)var9;
      Object[] var10005 = new Object[]{null, null, var10};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = Integer.valueOf(var12);
      x44.a<"o">(this, var10005, 3004407148046718483L, var1);
   }

   public final boolean O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 49264494548668L;
      return x44.a<"n">(this.T, new Object[]{var4}, -4278305756017859924L, var2);
   }

   iu(h8 var1, _xx var2, _y4 var3, long var4, PrintWriter var6) {
      var4 = a ^ var4;
      long var7 = var4 ^ 122150181894071L;
      long var10001 = var4 ^ 84308460649562L;
      int var9 = (int)((var4 ^ 84308460649562L) >>> 48);
      int var10 = (int)((var4 ^ 84308460649562L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      super(var7, var1, var2, var3, var6);
      this.H = -1;
      this.d = -1;
      x44.a<"w">(this, -1, -4926337890078365579L, var4);
      char var13 = (char)var9;
      short var10002 = (short)var10;
      Object[] var10005 = new Object[]{null, null, var11};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = Integer.valueOf(var13);
      x44.a<"j">(this, var10005, -6740513985000137258L, var4);
   }

   public String t(long var1) {
      return this.k;
   }

   public final String w(Object[] param1) {
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
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/Map
      // 012: astore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Integer
      // 01a: invokevirtual java/lang/Integer.intValue ()I
      // 01d: istore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 6
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 2
      // 033: pop
      // 034: iload 3
      // 035: i2l
      // 036: bipush 32
      // 038: lshl
      // 039: iload 6
      // 03b: i2l
      // 03c: bipush 48
      // 03e: lshl
      // 03f: bipush 32
      // 041: lushr
      // 042: lor
      // 043: iload 2
      // 044: i2l
      // 045: bipush 48
      // 047: lshl
      // 048: bipush 48
      // 04a: lushr
      // 04b: lor
      // 04c: getstatic com/zelix/iu.a J
      // 04f: lxor
      // 050: lstore 7
      // 052: lload 7
      // 054: dup2
      // 055: ldc2_w 118788786388711
      // 058: lxor
      // 059: lstore 9
      // 05b: dup2
      // 05c: ldc2_w 42318389365542
      // 05f: lxor
      // 060: lstore 11
      // 062: dup2
      // 063: ldc2_w 26751625562954
      // 066: lxor
      // 067: lstore 13
      // 069: dup2
      // 06a: ldc2_w 38847994294277
      // 06d: lxor
      // 06e: dup2
      // 06f: bipush 48
      // 071: lushr
      // 072: l2i
      // 073: istore 15
      // 075: dup2
      // 076: bipush 16
      // 078: lshl
      // 079: bipush 48
      // 07b: lushr
      // 07c: l2i
      // 07d: istore 16
      // 07f: dup2
      // 080: bipush 32
      // 082: lshl
      // 083: bipush 32
      // 085: lushr
      // 086: l2i
      // 087: istore 17
      // 089: pop2
      // 08a: dup2
      // 08b: ldc2_w 50805649394913
      // 08e: lxor
      // 08f: lstore 18
      // 091: pop2
      // 092: ldc2_w 7698223935755345553
      // 095: lload 7
      // 097: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aconst_null
      // 09d: astore 21
      // 09f: istore 20
      // 0a1: aload 4
      // 0a3: ifnull 16b
      // 0a6: bipush 0
      // 0a7: istore 22
      // 0a9: aload 4
      // 0ab: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0b0: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0b5: astore 23
      // 0b7: aload 23
      // 0b9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0be: ifeq 11b
      // 0c1: aload 23
      // 0c3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c8: checkcast java/lang/Integer
      // 0cb: astore 24
      // 0cd: aload 24
      // 0cf: invokevirtual java/lang/Integer.intValue ()I
      // 0d2: iload 20
      // 0d4: iload 3
      // 0d5: iflt 0dd
      // 0d8: ifne 114
      // 0db: iload 22
      // 0dd: iload 20
      // 0df: ifne 122
      // 0e2: goto 0f0
      // 0e5: ldc2_w 8162504281038455246
      // 0e8: lload 7
      // 0ea: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: if_icmple 116
      // 0f3: goto 101
      // 0f6: ldc2_w 8162504281038455246
      // 0f9: lload 7
      // 0fb: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: aload 24
      // 103: invokevirtual java/lang/Integer.intValue ()I
      // 106: goto 114
      // 109: ldc2_w 8162504281038455246
      // 10c: lload 7
      // 10e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: istore 22
      // 116: iload 20
      // 118: ifeq 0b7
      // 11b: iload 22
      // 11d: iload 3
      // 11e: iflt 123
      // 121: bipush 1
      // 122: iadd
      // 123: anewarray 25
      // 126: astore 21
      // 128: aload 4
      // 12a: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 12f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 134: astore 23
      // 136: aload 23
      // 138: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13d: ifeq 16b
      // 140: aload 23
      // 142: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 147: checkcast java/util/Map$Entry
      // 14a: astore 24
      // 14c: aload 21
      // 14e: aload 24
      // 150: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 155: checkcast java/lang/Integer
      // 158: invokevirtual java/lang/Integer.intValue ()I
      // 15b: aload 24
      // 15d: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 162: checkcast java/lang/String
      // 165: aastore
      // 166: iload 20
      // 168: ifeq 136
      // 16b: sipush 16800
      // 16e: ldc2_w 1436853178835443249
      // 171: lload 7
      // 173: lxor
      // 174: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: astore 22
      // 17b: new java/lang/StringBuilder
      // 17e: dup
      // 17f: invokespecial java/lang/StringBuilder.<init> ()V
      // 182: astore 24
      // 184: aload 0
      // 185: getfield com/zelix/iu.T Lcom/zelix/h2;
      // 188: iload 15
      // 18a: i2s
      // 18b: iload 16
      // 18d: i2s
      // 18e: iload 17
      // 190: invokevirtual com/zelix/h2.B (SSI)Z
      // 193: iload 20
      // 195: ifne 1aa
      // 198: ifeq 1ad
      // 19b: goto 1a9
      // 19e: ldc2_w 8162504281038455246
      // 1a1: lload 7
      // 1a3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: bipush 0
      // 1aa: goto 1ae
      // 1ad: bipush 1
      // 1ae: istore 25
      // 1b0: bipush 0
      // 1b1: istore 26
      // 1b3: iload 26
      // 1b5: aload 0
      // 1b6: getfield com/zelix/iu.V Ljava/util/List;
      // 1b9: invokeinterface java/util/List.size ()I 1
      // 1be: if_icmpge 3b7
      // 1c1: iload 5
      // 1c3: iload 20
      // 1c5: iload 3
      // 1c6: iflt 3d3
      // 1c9: ifne 3d1
      // 1cc: ifeq 33e
      // 1cf: goto 1dd
      // 1d2: ldc2_w 8162504281038455246
      // 1d5: lload 7
      // 1d7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 24
      // 1df: aload 0
      // 1e0: getfield com/zelix/iu.V Ljava/util/List;
      // 1e3: iload 26
      // 1e5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1ea: checkcast java/lang/String
      // 1ed: lload 9
      // 1ef: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f5: pop
      // 1f6: aload 24
      // 1f8: ldc " "
      // 1fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fd: pop
      // 1fe: iload 20
      // 200: iload 2
      // 201: ifle 29a
      // 204: ifne 298
      // 207: goto 215
      // 20a: ldc2_w 8162504281038455246
      // 20d: lload 7
      // 20f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: iload 3
      // 216: ifle 28a
      // 219: aload 21
      // 21b: ifnull 270
      // 21e: goto 22c
      // 221: ldc2_w 8162504281038455246
      // 224: lload 7
      // 226: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: athrow
      // 22c: aload 21
      // 22e: iload 20
      // 230: iload 6
      // 232: ifle 26c
      // 235: ifne 26a
      // 238: goto 246
      // 23b: ldc2_w 8162504281038455246
      // 23e: lload 7
      // 240: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: arraylength
      // 247: iload 25
      // 249: if_icmple 270
      // 24c: goto 25a
      // 24f: ldc2_w 8162504281038455246
      // 252: lload 7
      // 254: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 21
      // 25c: goto 26a
      // 25f: ldc2_w 8162504281038455246
      // 262: lload 7
      // 264: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: iload 25
      // 26c: aaload
      // 26d: ifnonnull 2a2
      // 270: aload 24
      // 272: new java/lang/StringBuilder
      // 275: dup
      // 276: invokespecial java/lang/StringBuilder.<init> ()V
      // 279: aload 22
      // 27b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27e: iload 25
      // 280: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 283: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 286: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 289: pop
      // 28a: goto 298
      // 28d: ldc2_w 8162504281038455246
      // 290: lload 7
      // 292: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: iload 20
      // 29a: iload 6
      // 29c: iflt 2bd
      // 29f: ifeq 2bb
      // 2a2: aload 24
      // 2a4: aload 21
      // 2a6: iload 25
      // 2a8: aaload
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: pop
      // 2ad: goto 2bb
      // 2b0: ldc2_w 8162504281038455246
      // 2b3: lload 7
      // 2b5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: athrow
      // 2bb: iload 26
      // 2bd: iload 3
      // 2be: iflt 337
      // 2c1: aload 0
      // 2c2: getfield com/zelix/iu.V Ljava/util/List;
      // 2c5: invokeinterface java/util/List.size ()I 1
      // 2ca: bipush 1
      // 2cb: isub
      // 2cc: iload 20
      // 2ce: ifne 332
      // 2d1: if_icmpge 304
      // 2d4: goto 2e2
      // 2d7: ldc2_w 8162504281038455246
      // 2da: lload 7
      // 2dc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: athrow
      // 2e2: aload 24
      // 2e4: sipush 16863
      // 2e7: ldc2_w 6100109688468545097
      // 2ea: lload 7
      // 2ec: lxor
      // 2ed: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: pop
      // 2f6: goto 304
      // 2f9: ldc2_w 8162504281038455246
      // 2fc: lload 7
      // 2fe: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: athrow
      // 304: iload 25
      // 306: aload 0
      // 307: getfield com/zelix/iu.V Ljava/util/List;
      // 30a: iload 26
      // 30c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 311: checkcast java/lang/String
      // 314: lload 18
      // 316: bipush 2
      // 317: anewarray 576
      // 31a: dup_x2
      // 31b: dup_x2
      // 31c: pop
      // 31d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 320: bipush 1
      // 321: swap
      // 322: aastore
      // 323: dup_x1
      // 324: swap
      // 325: bipush 0
      // 326: swap
      // 327: aastore
      // 328: ldc2_w 7672408459200744146
      // 32b: lload 7
      // 32d: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 332: iadd
      // 333: istore 25
      // 335: iload 20
      // 337: iload 2
      // 338: ifle 3b4
      // 33b: ifeq 3af
      // 33e: aload 24
      // 340: aload 0
      // 341: getfield com/zelix/iu.V Ljava/util/List;
      // 344: iload 26
      // 346: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 34b: checkcast java/lang/String
      // 34e: lload 9
      // 350: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 353: iload 20
      // 355: ifne 3a6
      // 358: goto 366
      // 35b: ldc2_w 8162504281038455246
      // 35e: lload 7
      // 360: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 365: athrow
      // 366: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 369: pop
      // 36a: aload 24
      // 36c: iload 26
      // 36e: aload 0
      // 36f: getfield com/zelix/iu.V Ljava/util/List;
      // 372: invokeinterface java/util/List.size ()I 1
      // 377: bipush 1
      // 378: isub
      // 379: if_icmpge 3a9
      // 37c: goto 38a
      // 37f: ldc2_w 8162504281038455246
      // 382: lload 7
      // 384: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: athrow
      // 38a: sipush 16863
      // 38d: ldc2_w 6100109688468545097
      // 390: lload 7
      // 392: lxor
      // 393: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: goto 3a6
      // 39b: ldc2_w 8162504281038455246
      // 39e: lload 7
      // 3a0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: goto 3ab
      // 3a9: ldc ""
      // 3ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ae: pop
      // 3af: iinc 26 1
      // 3b2: iload 20
      // 3b4: ifeq 1b3
      // 3b7: aload 0
      // 3b8: getfield com/zelix/iu.k Ljava/lang/String;
      // 3bb: sipush 27634
      // 3be: ldc2_w 8456152084359296103
      // 3c1: lload 7
      // 3c3: lxor
      // 3c4: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: iload 6
      // 3cb: iflt 459
      // 3ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3d1: iload 20
      // 3d3: ifne 46a
      // 3d6: ifeq 434
      // 3d9: goto 3e7
      // 3dc: ldc2_w 8162504281038455246
      // 3df: lload 7
      // 3e1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: athrow
      // 3e7: new java/lang/StringBuilder
      // 3ea: dup
      // 3eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ee: aload 0
      // 3ef: getfield com/zelix/iu.T Lcom/zelix/h2;
      // 3f2: lload 13
      // 3f4: invokevirtual com/zelix/h2.E (J)Ljava/lang/String;
      // 3f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fa: aload 0
      // 3fb: lload 11
      // 3fd: bipush 1
      // 3fe: anewarray 576
      // 401: dup_x2
      // 402: dup_x2
      // 403: pop
      // 404: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 407: bipush 0
      // 408: swap
      // 409: aastore
      // 40a: ldc2_w 7941252357908073295
      // 40d: lload 7
      // 40f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 417: ldc "("
      // 419: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41c: aload 24
      // 41e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 421: ldc ")"
      // 423: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 426: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 429: astore 23
      // 42b: iload 3
      // 42c: ifle 434
      // 42f: iload 20
      // 431: ifeq 4ce
      // 434: aload 0
      // 435: getfield com/zelix/iu.k Ljava/lang/String;
      // 438: iload 20
      // 43a: ifne 4cc
      // 43d: goto 44b
      // 440: ldc2_w 8162504281038455246
      // 443: lload 7
      // 445: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: athrow
      // 44b: sipush 31276
      // 44e: ldc2_w 7644078725482587580
      // 451: lload 7
      // 453: lxor
      // 454: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45c: goto 46a
      // 45f: ldc2_w 8162504281038455246
      // 462: lload 7
      // 464: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: athrow
      // 46a: ifeq 481
      // 46d: aload 0
      // 46e: getfield com/zelix/iu.T Lcom/zelix/h2;
      // 471: lload 13
      // 473: invokevirtual com/zelix/h2.E (J)Ljava/lang/String;
      // 476: iload 2
      // 477: iflt 4be
      // 47a: astore 23
      // 47c: iload 20
      // 47e: ifeq 4ce
      // 481: new java/lang/StringBuilder
      // 484: dup
      // 485: invokespecial java/lang/StringBuilder.<init> ()V
      // 488: aload 0
      // 489: getfield com/zelix/iu.T Lcom/zelix/h2;
      // 48c: lload 13
      // 48e: invokevirtual com/zelix/h2.E (J)Ljava/lang/String;
      // 491: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 494: aload 0
      // 495: getfield com/zelix/iu.m Ljava/lang/String;
      // 498: lload 9
      // 49a: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 49d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a0: ldc " "
      // 4a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a5: aload 0
      // 4a6: getfield com/zelix/iu.k Ljava/lang/String;
      // 4a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ac: ldc "("
      // 4ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b1: aload 24
      // 4b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4b6: ldc ")"
      // 4b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4be: goto 4cc
      // 4c1: ldc2_w 8162504281038455246
      // 4c4: lload 7
      // 4c6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cb: athrow
      // 4cc: astore 23
      // 4ce: aload 23
      // 4d0: areturn
   }

   public String v(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 85368799419230
      // 005: lxor
      // 006: lstore 3
      // 007: dup2
      // 008: ldc2_w 1572400324599
      // 00b: lxor
      // 00c: lstore 5
      // 00e: pop2
      // 00f: new java/lang/StringBuilder
      // 012: dup
      // 013: invokespecial java/lang/StringBuilder.<init> ()V
      // 016: astore 8
      // 018: aload 8
      // 01a: aload 0
      // 01b: invokevirtual com/zelix/iu.A ()Ljava/lang/String;
      // 01e: lload 3
      // 01f: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 022: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 025: pop
      // 026: aload 8
      // 028: ldc " "
      // 02a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02d: pop
      // 02e: ldc2_w -3306811759098666383
      // 031: lload 1
      // 032: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 8
      // 039: aload 0
      // 03a: invokevirtual com/zelix/iu.z ()Ljava/lang/String;
      // 03d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 040: pop
      // 041: aload 8
      // 043: sipush 4342
      // 046: ldc2_w 8211592136494946692
      // 049: lload 1
      // 04a: lxor
      // 04b: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 053: pop
      // 054: istore 7
      // 056: aload 0
      // 057: invokevirtual com/zelix/iu.A ()Ljava/lang/String;
      // 05a: lload 5
      // 05c: bipush 0
      // 05d: invokestatic com/zelix/xl.L (Ljava/lang/String;JZ)Ljava/util/List;
      // 060: astore 9
      // 062: bipush 0
      // 063: istore 10
      // 065: iload 10
      // 067: aload 9
      // 069: invokeinterface java/util/List.size ()I 1
      // 06e: if_icmpge 0f2
      // 071: aload 8
      // 073: lload 1
      // 074: lconst_0
      // 075: lcmp
      // 076: ifle 094
      // 079: aload 9
      // 07b: iload 10
      // 07d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 082: checkcast java/lang/String
      // 085: lload 3
      // 086: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 089: iload 7
      // 08b: ifeq 0e1
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 091: pop
      // 092: aload 8
      // 094: lload 1
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 10d
      // 09a: iload 10
      // 09c: iload 7
      // 09e: ifeq 107
      // 0a1: goto 0ae
      // 0a4: ldc2_w -3098991354391583625
      // 0a7: lload 1
      // 0a8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 9
      // 0b0: invokeinterface java/util/List.size ()I 1
      // 0b5: bipush 1
      // 0b6: isub
      // 0b7: if_icmpge 0e4
      // 0ba: goto 0c7
      // 0bd: ldc2_w -3098991354391583625
      // 0c0: lload 1
      // 0c1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: sipush 16863
      // 0ca: ldc2_w 6100073867693964272
      // 0cd: lload 1
      // 0ce: lxor
      // 0cf: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: goto 0e1
      // 0d7: ldc2_w -3098991354391583625
      // 0da: lload 1
      // 0db: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: goto 0e6
      // 0e4: ldc ""
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: pop
      // 0ea: iinc 10 1
      // 0ed: iload 7
      // 0ef: ifne 065
      // 0f2: aload 8
      // 0f4: sipush 1234
      // 0f7: ldc2_w 1732249501913976232
      // 0fa: lload 1
      // 0fb: lxor
      // 0fc: lload 1
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: ifle 0cf
      // 102: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 10a: pop
      // 10b: aload 8
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: areturn
   }

   public final String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 78712676696210L;
      Object[] var10004 = new Object[]{null, true};
      var10004[0] = var4;
      return x44.a<"m">(this, var10004, -1623651682846794142L, var2);
   }

   public final void M(Object[] param1) {
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
      // 17: getstatic com/zelix/iu.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w -2276126793728077821
      // 20: lload 2
      // 21: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 5
      // 28: iload 5
      // 2a: ifeq 63
      // 2d: iload 4
      // 2f: ifeq 6e
      // 32: goto 3f
      // 35: ldc2_w -1833983967108557307
      // 38: lload 2
      // 39: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 4
      // 41: bipush 1
      // 42: anewarray 576
      // 45: dup_x1
      // 46: swap
      // 47: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w -1945105721434099215
      // 50: lload 2
      // 51: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: goto 63
      // 59: ldc2_w -1833983967108557307
      // 5c: lload 2
      // 5d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: lload 2
      // 64: lconst_0
      // 65: lcmp
      // 66: iflt 85
      // 69: iload 5
      // 6b: ifne 92
      // 6e: aload 0
      // 6f: bipush 4
      // 70: bipush 1
      // 71: anewarray 576
      // 74: dup_x1
      // 75: swap
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -2030389197825339703
      // 7f: lload 2
      // 80: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: goto 92
      // 88: ldc2_w -1833983967108557307
      // 8b: lload 2
      // 8c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: return
   }

   public static iu y(Object[] param0) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast [Lcom/zelix/iu;
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/_yv
      // 018: astore 2
      // 019: pop
      // 01a: getstatic com/zelix/iu.a J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 41120552208865
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 103256783769715
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 16
      // 030: lushr
      // 031: lstore 7
      // 033: dup2
      // 034: bipush 48
      // 036: lshl
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 9
      // 03d: pop2
      // 03e: dup2
      // 03f: ldc2_w 40179181195688
      // 042: lxor
      // 043: lstore 10
      // 045: dup2
      // 046: ldc2_w 117782482740235
      // 049: lxor
      // 04a: lstore 12
      // 04c: dup2
      // 04d: ldc2_w 123990744354618
      // 050: lxor
      // 051: lstore 14
      // 053: pop2
      // 054: ldc2_w -4355299322762430518
      // 057: lload 3
      // 058: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: istore 16
      // 05f: aload 1
      // 060: iload 16
      // 062: ifne 076
      // 065: ifnull 092
      // 068: goto 075
      // 06b: ldc2_w -2874350087662557035
      // 06e: lload 3
      // 06f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: aload 1
      // 076: arraylength
      // 077: iload 16
      // 079: lload 3
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: ifle 0b9
      // 07f: ifne 0b8
      // 082: ifne 09e
      // 085: goto 092
      // 088: ldc2_w -2874350087662557035
      // 08b: lload 3
      // 08c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: aconst_null
      // 093: areturn
      // 094: ldc2_w -2874350087662557035
      // 097: lload 3
      // 098: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 1
      // 09f: iload 16
      // 0a1: lload 3
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: iflt 0cb
      // 0a7: ifne 0ca
      // 0aa: arraylength
      // 0ab: goto 0b8
      // 0ae: ldc2_w -2874350087662557035
      // 0b1: lload 3
      // 0b2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: bipush 1
      // 0b9: if_icmpne 0cd
      // 0bc: aload 1
      // 0bd: goto 0ca
      // 0c0: ldc2_w -2874350087662557035
      // 0c3: lload 3
      // 0c4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: bipush 0
      // 0cb: aaload
      // 0cc: areturn
      // 0cd: lload 10
      // 0cf: bipush 1
      // 0d0: anewarray 576
      // 0d3: dup_x2
      // 0d4: dup_x2
      // 0d5: pop
      // 0d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: ldc2_w -2570277670330156485
      // 0df: lload 3
      // 0e0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: astore 17
      // 0e7: bipush 0
      // 0e8: istore 18
      // 0ea: aload 1
      // 0eb: arraylength
      // 0ec: anewarray 25
      // 0ef: astore 19
      // 0f1: bipush 0
      // 0f2: istore 20
      // 0f4: iload 20
      // 0f6: aload 1
      // 0f7: arraylength
      // 0f8: if_icmpge 222
      // 0fb: aload 1
      // 0fc: iload 20
      // 0fe: aaload
      // 0ff: lload 12
      // 101: bipush 1
      // 102: anewarray 576
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 0
      // 10c: swap
      // 10d: aastore
      // 10e: ldc2_w -4112945058641506560
      // 111: lload 3
      // 112: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: astore 21
      // 119: bipush 0
      // 11a: iload 16
      // 11c: ifne 24e
      // 11f: istore 22
      // 121: aload 21
      // 123: iload 22
      // 125: invokevirtual java/lang/String.charAt (I)C
      // 128: sipush 12574
      // 12b: ldc2_w 1061504375893243011
      // 12e: lload 3
      // 12f: lxor
      // 130: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: if_icmpne 15e
      // 138: iinc 22 1
      // 13b: iload 16
      // 13d: lload 3
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 148
      // 143: ifne 184
      // 146: iload 16
      // 148: ifeq 121
      // 14b: lload 3
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: iflt 13b
      // 151: goto 15e
      // 154: ldc2_w -2874350087662557035
      // 157: lload 3
      // 158: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: iload 20
      // 160: iload 16
      // 162: lload 3
      // 163: lconst_0
      // 164: lcmp
      // 165: iflt 188
      // 168: ifne 186
      // 16b: ifne 184
      // 16e: goto 17b
      // 171: ldc2_w -2874350087662557035
      // 174: lload 3
      // 175: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: iload 22
      // 17d: istore 18
      // 17f: iload 16
      // 181: ifeq 1af
      // 184: iload 22
      // 186: iload 16
      // 188: lload 3
      // 189: lconst_0
      // 18a: lcmp
      // 18b: iflt 1b9
      // 18e: ifne 1b1
      // 191: iload 18
      // 193: if_icmpeq 1af
      // 196: goto 1a3
      // 199: ldc2_w -2874350087662557035
      // 19c: lload 3
      // 19d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: aconst_null
      // 1a4: areturn
      // 1a5: ldc2_w -2874350087662557035
      // 1a8: lload 3
      // 1a9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: iload 22
      // 1b1: lload 3
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: ifle 1ee
      // 1b7: iload 16
      // 1b9: ifne 1ee
      // 1bc: ifle 1d5
      // 1bf: goto 1cc
      // 1c2: ldc2_w -2874350087662557035
      // 1c5: lload 3
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 21
      // 1ce: iload 22
      // 1d0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d3: astore 21
      // 1d5: aload 21
      // 1d7: iload 16
      // 1d9: ifne 211
      // 1dc: ldc ";"
      // 1de: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1e1: goto 1ee
      // 1e4: ldc2_w -2874350087662557035
      // 1e7: lload 3
      // 1e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: lload 3
      // 1ef: lconst_0
      // 1f0: lcmp
      // 1f1: ifle 21f
      // 1f4: ifeq 213
      // 1f7: aload 21
      // 1f9: bipush 1
      // 1fa: aload 21
      // 1fc: invokevirtual java/lang/String.length ()I
      // 1ff: bipush 1
      // 200: isub
      // 201: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 204: goto 211
      // 207: ldc2_w -2874350087662557035
      // 20a: lload 3
      // 20b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: astore 21
      // 213: aload 19
      // 215: iload 20
      // 217: aload 21
      // 219: aastore
      // 21a: iinc 20 1
      // 21d: iload 16
      // 21f: ifeq 0f4
      // 222: aload 19
      // 224: lload 5
      // 226: aload 2
      // 227: bipush 3
      // 228: anewarray 576
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 2
      // 22e: swap
      // 22f: aastore
      // 230: dup_x2
      // 231: dup_x2
      // 232: pop
      // 233: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 236: bipush 1
      // 237: swap
      // 238: aastore
      // 239: dup_x1
      // 23a: swap
      // 23b: bipush 0
      // 23c: swap
      // 23d: aastore
      // 23e: ldc2_w -2851509650869080197
      // 241: lload 3
      // 242: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: lload 3
      // 248: lconst_0
      // 249: lcmp
      // 24a: iflt 250
      // 24d: bipush 0
      // 24e: istore 20
      // 250: iload 20
      // 252: aload 19
      // 254: arraylength
      // 255: bipush 1
      // 256: isub
      // 257: if_icmpge 2cf
      // 25a: aload 2
      // 25b: iload 16
      // 25d: ifne 2e5
      // 260: aload 19
      // 262: iload 20
      // 264: aaload
      // 265: lload 7
      // 267: dup2_x1
      // 268: pop2
      // 269: iload 9
      // 26b: i2s
      // 26c: swap
      // 26d: aload 19
      // 26f: iload 20
      // 271: bipush 1
      // 272: iadd
      // 273: aaload
      // 274: invokeinterface com/zelix/_yv.m (JSLjava/lang/String;Ljava/lang/String;)Z 6
      // 279: iload 16
      // 27b: ifne 2c2
      // 27e: goto 28b
      // 281: ldc2_w -2874350087662557035
      // 284: lload 3
      // 285: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: athrow
      // 28b: lload 3
      // 28c: lconst_0
      // 28d: lcmp
      // 28e: ifle 2cc
      // 291: ifne 2c7
      // 294: goto 2a1
      // 297: ldc2_w -2874350087662557035
      // 29a: lload 3
      // 29b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aload 2
      // 2a2: aload 19
      // 2a4: iload 20
      // 2a6: aaload
      // 2a7: aload 19
      // 2a9: iload 20
      // 2ab: bipush 1
      // 2ac: iadd
      // 2ad: aaload
      // 2ae: lload 14
      // 2b0: invokeinterface com/zelix/_yv.l (Ljava/lang/String;Ljava/lang/String;J)Z 5
      // 2b5: goto 2c2
      // 2b8: ldc2_w -2874350087662557035
      // 2bb: lload 3
      // 2bc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: ifne 2c7
      // 2c5: aconst_null
      // 2c6: areturn
      // 2c7: iinc 20 1
      // 2ca: iload 16
      // 2cc: ifeq 250
      // 2cf: lload 3
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: ifle 25a
      // 2d5: goto 2dc
      // 2d8: astore 20
      // 2da: aconst_null
      // 2db: areturn
      // 2dc: aload 17
      // 2de: aload 19
      // 2e0: bipush 0
      // 2e1: aaload
      // 2e2: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e5: checkcast com/zelix/iu
      // 2e8: areturn
   }

   void x(Object[] param1) {
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
      // 004: checkcast com/zelix/_ye
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 7
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/hz
      // 02c: astore 2
      // 02d: pop
      // 02e: getstatic com/zelix/iu.a J
      // 031: lload 3
      // 032: lxor
      // 033: lstore 3
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 10074791146037
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 130553355118371
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 35444291657364
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 6268891104911
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 137468933044911
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 106849820268028
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 4191812599435
      // 063: lxor
      // 064: lstore 20
      // 066: pop2
      // 067: ldc2_w -8364054749012313210
      // 06a: lload 3
      // 06b: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: istore 22
      // 072: aload 0
      // 073: lload 14
      // 075: invokevirtual com/zelix/iu.Q (J)Z
      // 078: iload 22
      // 07a: ifeq 0a0
      // 07d: ifne 1d9
      // 080: goto 08d
      // 083: ldc2_w -8284059850990748288
      // 086: lload 3
      // 087: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 0
      // 08e: lload 18
      // 090: invokevirtual com/zelix/iu.V (J)Z
      // 093: goto 0a0
      // 096: ldc2_w -8284059850990748288
      // 099: lload 3
      // 09a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: iload 22
      // 0a2: lload 3
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: ifle 0d6
      // 0a8: ifeq 0ce
      // 0ab: ifne 1d9
      // 0ae: goto 0bb
      // 0b1: ldc2_w -8284059850990748288
      // 0b4: lload 3
      // 0b5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: lload 12
      // 0be: invokevirtual com/zelix/iu.n (J)Z
      // 0c1: goto 0ce
      // 0c4: ldc2_w -8284059850990748288
      // 0c7: lload 3
      // 0c8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: lload 3
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 121
      // 0d4: iload 22
      // 0d6: ifeq 121
      // 0d9: ifne 1d9
      // 0dc: goto 0e9
      // 0df: ldc2_w -8284059850990748288
      // 0e2: lload 3
      // 0e3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: iload 22
      // 0ec: ifeq 15a
      // 0ef: goto 0fc
      // 0f2: ldc2_w -8284059850990748288
      // 0f5: lload 3
      // 0f6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: lload 10
      // 0fe: bipush 1
      // 0ff: anewarray 576
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 0
      // 109: swap
      // 10a: aastore
      // 10b: ldc2_w -8478252899594620248
      // 10e: lload 3
      // 10f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: goto 121
      // 117: ldc2_w -8284059850990748288
      // 11a: lload 3
      // 11b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: ifne 14c
      // 124: aload 0
      // 125: iload 22
      // 127: ifeq 15a
      // 12a: goto 137
      // 12d: ldc2_w -8284059850990748288
      // 130: lload 3
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: lload 20
      // 139: invokevirtual com/zelix/iu.C (J)Z
      // 13c: ifne 1d9
      // 13f: goto 14c
      // 142: ldc2_w -8284059850990748288
      // 145: lload 3
      // 146: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 0
      // 14d: goto 15a
      // 150: ldc2_w -8284059850990748288
      // 153: lload 3
      // 154: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: lload 16
      // 15c: invokevirtual com/zelix/iu.G (J)Lcom/zelix/_fz;
      // 15f: astore 23
      // 161: aload 6
      // 163: aload 23
      // 165: aload 2
      // 166: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 16b: checkcast com/zelix/hz
      // 16e: astore 24
      // 170: aload 24
      // 172: iload 22
      // 174: ifeq 19f
      // 177: ifnull 1a0
      // 17a: goto 187
      // 17d: ldc2_w -8284059850990748288
      // 180: lload 3
      // 181: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 6
      // 189: aload 23
      // 18b: aload 24
      // 18d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 192: goto 19f
      // 195: ldc2_w -8284059850990748288
      // 198: lload 3
      // 199: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: pop
      // 1a0: lload 3
      // 1a1: lconst_0
      // 1a2: lcmp
      // 1a3: iflt 1cc
      // 1a6: iload 7
      // 1a8: ifeq 1d9
      // 1ab: aload 5
      // 1ad: aload 23
      // 1af: lload 8
      // 1b1: bipush 2
      // 1b2: anewarray 576
      // 1b5: dup_x2
      // 1b6: dup_x2
      // 1b7: pop
      // 1b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: ldc2_w -7842998099132476310
      // 1c6: lload 3
      // 1c7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: goto 1d9
      // 1cf: ldc2_w -8284059850990748288
      // 1d2: lload 3
      // 1d3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: return
   }

   public void i(Object[] param1) {
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
      // 004: checkcast com/zelix/_3
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_83
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/util/List
      // 015: astore 6
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 4
      // 022: pop
      // 023: getstatic com/zelix/iu.a J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 67317826910214
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 88992338467332
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 26673678745455
      // 03f: lxor
      // 040: lstore 11
      // 042: pop2
      // 043: ldc2_w -7922970580562500017
      // 046: lload 4
      // 048: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: bipush 0
      // 04e: istore 14
      // 050: istore 13
      // 052: iload 14
      // 054: aload 0
      // 055: getfield com/zelix/iu.F I
      // 058: if_icmpge 111
      // 05b: aload 0
      // 05c: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 05f: iload 14
      // 061: aaload
      // 062: iload 13
      // 064: ifne 097
      // 067: instanceof com/zelix/bi
      // 06a: lload 4
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 0f9
      // 071: ifeq 0f4
      // 074: goto 082
      // 077: ldc2_w -8531669579123918576
      // 07a: lload 4
      // 07c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 0
      // 083: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 086: iload 14
      // 088: aaload
      // 089: goto 097
      // 08c: ldc2_w -8531669579123918576
      // 08f: lload 4
      // 091: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: checkcast com/zelix/bi
      // 09a: astore 15
      // 09c: aload 0
      // 09d: lload 11
      // 09f: invokevirtual com/zelix/iu.N (J)Ljava/util/List;
      // 0a2: astore 16
      // 0a4: aload 15
      // 0a6: aload 3
      // 0a7: aload 0
      // 0a8: lload 9
      // 0aa: invokevirtual com/zelix/iu.n (J)Z
      // 0ad: aload 16
      // 0af: lload 7
      // 0b1: aload 2
      // 0b2: aload 6
      // 0b4: bipush 6
      // 0b6: anewarray 576
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 5
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 4
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x2
      // 0c4: dup_x2
      // 0c5: pop
      // 0c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9: bipush 3
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 2
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w -8013398657179992609
      // 0e1: lload 4
      // 0e3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: iload 13
      // 0ea: lload 4
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: ifle 0f9
      // 0f1: ifeq 111
      // 0f4: iinc 14 1
      // 0f7: iload 13
      // 0f9: ifeq 052
      // 0fc: lload 4
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 05b
      // 103: goto 111
      // 106: ldc2_w -8531669579123918576
      // 109: lload 4
      // 10b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: return
   }

   public String I(Object[] var1) {
      long var3 = (Long)var1[0];
      HashMap var2 = (HashMap)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 106812502861209L;
      long var7 = var3 ^ 90571851076895L;
      long var9 = var3 ^ 48745083223845L;
      return x44.a<"o">(this, var7, 8344517394236361970L, var3) + _fz.T(var9, x44.a<"o">(this, new Object[]{var5}, 8213605363114406225L, var3), var2);
   }

   iu(int var1, char var2, short var3, hz var4, mx var5, mx var6, h4[] var7, int var8) {
      long var9 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var9 ^ 136222333563528L;
      int var11 = (int)((var9 ^ 136222333563528L) >>> 48);
      int var12 = (int)((var9 ^ 136222333563528L) << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      super(var4, var5, var6, var7, var8);
      this.H = -1;
      this.d = -1;
      x44.a<"u">(this, -1, -761083584621533529L, var9);
      char var14 = (char)var11;
      short var10002 = (short)var12;
      Object[] var10005 = new Object[]{null, null, var13};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = Integer.valueOf(var14);
      x44.a<"h">(this, var10005, -1394192325456440572L, var9);
   }

   public abstract void o(Object[] var1);

   public final String H() {
      return this.m;
   }

   public boolean J(Object[] param1) {
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
      // 0c: getstatic com/zelix/iu.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 86746122444560
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 118103895607051
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w 749997070211496450
      // 25: lload 2
      // 26: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 8
      // 2d: aload 0
      // 2e: lload 4
      // 30: invokevirtual com/zelix/iu.n (J)Z
      // 33: iload 8
      // 35: ifeq 5b
      // 38: ifne 74
      // 3b: goto 48
      // 3e: ldc2_w 904508487942765572
      // 41: lload 2
      // 42: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: lload 6
      // 4b: invokevirtual com/zelix/iu.Q (J)Z
      // 4e: goto 5b
      // 51: ldc2_w 904508487942765572
      // 54: lload 2
      // 55: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: iload 8
      // 5d: ifeq 71
      // 60: ifne 74
      // 63: goto 70
      // 66: ldc2_w 904508487942765572
      // 69: lload 2
      // 6a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   public Enumeration g(Object[] param1) {
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
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: getstatic com/zelix/iu.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 117985532374761
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 120903210732248
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: ldc2_w 4459922491097680288
      // 030: lload 2
      // 031: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: aconst_null
      // 037: astore 10
      // 039: bipush 0
      // 03a: istore 11
      // 03c: istore 9
      // 03e: iload 11
      // 040: aload 0
      // 041: getfield com/zelix/iu.F I
      // 044: if_icmpge 151
      // 047: aload 10
      // 049: iload 9
      // 04b: lload 2
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: ifle 15b
      // 051: ifne 159
      // 054: iload 9
      // 056: ifne 0b0
      // 059: goto 066
      // 05c: ldc2_w 2771486614673381119
      // 05f: lload 2
      // 060: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: ifnonnull 0b2
      // 069: goto 076
      // 06c: ldc2_w 2771486614673381119
      // 06f: lload 2
      // 070: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: lload 7
      // 078: sipush 6971
      // 07b: ldc2_w 3454013936248807629
      // 07e: lload 2
      // 07f: lxor
      // 080: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: bipush 2
      // 086: anewarray 576
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w 4050195608414894369
      // 09d: lload 2
      // 09e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: goto 0b0
      // 0a6: ldc2_w 2771486614673381119
      // 0a9: lload 2
      // 0aa: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: astore 10
      // 0b2: aload 0
      // 0b3: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 0b6: iload 11
      // 0b8: aaload
      // 0b9: iload 9
      // 0bb: ifne 0e5
      // 0be: instanceof com/zelix/bo
      // 0c1: ifeq 149
      // 0c4: goto 0d1
      // 0c7: ldc2_w 2771486614673381119
      // 0ca: lload 2
      // 0cb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 0d5: iload 11
      // 0d7: aaload
      // 0d8: goto 0e5
      // 0db: ldc2_w 2771486614673381119
      // 0de: lload 2
      // 0df: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: checkcast com/zelix/bo
      // 0e8: iload 4
      // 0ea: lload 5
      // 0ec: bipush 2
      // 0ed: anewarray 576
      // 0f0: dup_x2
      // 0f1: dup_x2
      // 0f2: pop
      // 0f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f6: bipush 1
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 2445630574109148004
      // 104: lload 2
      // 105: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: astore 12
      // 10c: bipush 0
      // 10d: istore 13
      // 10f: iload 13
      // 111: aload 12
      // 113: arraylength
      // 114: if_icmpge 149
      // 117: aload 10
      // 119: aload 12
      // 11b: iload 13
      // 11d: aaload
      // 11e: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 121: istore 14
      // 123: iinc 13 1
      // 126: iload 9
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 14e
      // 12e: ifne 14c
      // 131: iload 9
      // 133: ifeq 10f
      // 136: lload 2
      // 137: lconst_0
      // 138: lcmp
      // 139: ifle 126
      // 13c: goto 149
      // 13f: ldc2_w 2771486614673381119
      // 142: lload 2
      // 143: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: iinc 11 1
      // 14c: iload 9
      // 14e: ifeq 03e
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 047
      // 157: aload 10
      // 159: iload 9
      // 15b: ifne 182
      // 15e: ifnonnull 180
      // 161: goto 16e
      // 164: ldc2_w 2771486614673381119
      // 167: lload 2
      // 168: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: new com/zelix/ri
      // 171: dup
      // 172: invokespecial com/zelix/ri.<init> ()V
      // 175: areturn
      // 176: ldc2_w 2771486614673381119
      // 179: lload 2
      // 17a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 10
      // 182: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 185: areturn
   }

   public final String T(Object[] var1) {
      return this.k + this.m;
   }

   public void h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"r">(this, true, 8030960376517807111L, var2);
   }

   final void s(Object[] param1) {
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
      // 04: checkcast com/zelix/ea
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/iu.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 25365751252614
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -1686383396448707364
      // 25: lload 3
      // 26: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 55
      // 33: getfield com/zelix/iu.H I
      // 36: bipush -1
      // 37: if_icmpeq 82
      // 3a: goto 47
      // 3d: ldc2_w -933832026384858237
      // 40: lload 3
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -933832026384858237
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/iu.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: astore 8
      // 62: aload 8
      // 64: aload 2
      // 65: lload 5
      // 67: bipush 2
      // 68: anewarray 576
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 1
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 0
      // 77: swap
      // 78: aastore
      // 79: ldc2_w -1453610863227682397
      // 7c: lload 3
      // 7d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: return
   }

   public final String w(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 100315872116909
      // 05: lxor
      // 06: lstore 3
      // 07: pop2
      // 08: ldc2_w -2207070991670586086
      // 0b: lload 1
      // 0c: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 5
      // 13: aload 0
      // 14: getfield com/zelix/iu.k Ljava/lang/String;
      // 17: sipush 1339
      // 1a: ldc2_w 3009251317266075938
      // 1d: lload 1
      // 1e: lxor
      // 1f: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27: iload 5
      // 29: ifne 8b
      // 2c: ifeq 5f
      // 2f: goto 3c
      // 32: ldc2_w -374793672281322939
      // 35: lload 1
      // 36: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: lload 3
      // 3e: bipush 1
      // 3f: anewarray 576
      // 42: dup_x2
      // 43: dup_x2
      // 44: pop
      // 45: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: ldc2_w -1891648524527566652
      // 4e: lload 1
      // 4f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: areturn
      // 55: ldc2_w -374793672281322939
      // 58: lload 1
      // 59: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/zelix/iu.k Ljava/lang/String;
      // 63: iload 5
      // 65: lload 1
      // 66: lconst_0
      // 67: lcmp
      // 68: iflt 71
      // 6b: ifne b0
      // 6e: sipush 27388
      // 71: ldc2_w 6980178588643213024
      // 74: lload 1
      // 75: lxor
      // 76: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7e: goto 8b
      // 81: ldc2_w -374793672281322939
      // 84: lload 1
      // 85: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: lload 1
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: iflt 97
      // 91: ifeq ac
      // 94: sipush 9184
      // 97: ldc2_w 2218896104057370623
      // 9a: lload 1
      // 9b: lxor
      // 9c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: areturn
      // a2: ldc2_w -374793672281322939
      // a5: lload 1
      // a6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: aload 0
      // ad: getfield com/zelix/iu.k Ljava/lang/String;
      // b0: areturn
   }

   public List q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 77261126890159L;
      String var10001 = this.m;
      return x44.a<"w">(new Object[]{var4, var10001}, 2617759087291522248L, var2);
   }

   public final List N(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/iu.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 135399241471594
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -6156781344284893494
      // 011: lload 1
      // 012: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: aload 0
      // 018: getfield com/zelix/iu.m Ljava/lang/String;
      // 01b: lload 3
      // 01c: dup2_x1
      // 01d: pop2
      // 01e: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 021: astore 6
      // 023: istore 5
      // 025: aload 6
      // 027: invokeinterface java/util/List.size ()I 1
      // 02c: istore 7
      // 02e: bipush 0
      // 02f: istore 8
      // 031: iload 8
      // 033: iload 7
      // 035: if_icmpge 11b
      // 038: aload 6
      // 03a: iload 5
      // 03c: lload 1
      // 03d: lconst_0
      // 03e: lcmp
      // 03f: iflt 047
      // 042: ifne 11d
      // 045: iload 8
      // 047: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04c: checkcast java/lang/String
      // 04f: astore 9
      // 051: aload 9
      // 053: iload 5
      // 055: ifne 112
      // 058: ldc "B"
      // 05a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05d: ifne 0fa
      // 060: goto 06d
      // 063: ldc2_w -5684624130987933291
      // 066: lload 1
      // 067: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: aload 9
      // 06f: iload 5
      // 071: ifne 112
      // 074: goto 081
      // 077: ldc2_w -5684624130987933291
      // 07a: lload 1
      // 07b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: lload 1
      // 082: lconst_0
      // 083: lcmp
      // 084: ifle 105
      // 087: ldc "C"
      // 089: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08c: ifne 0fa
      // 08f: goto 09c
      // 092: ldc2_w -5684624130987933291
      // 095: lload 1
      // 096: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 9
      // 09e: iload 5
      // 0a0: ifne 112
      // 0a3: goto 0b0
      // 0a6: ldc2_w -5684624130987933291
      // 0a9: lload 1
      // 0aa: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: lload 1
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 105
      // 0b6: ldc "S"
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: ifne 0fa
      // 0be: goto 0cb
      // 0c1: ldc2_w -5684624130987933291
      // 0c4: lload 1
      // 0c5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 9
      // 0cd: iload 5
      // 0cf: ifne 112
      // 0d2: goto 0df
      // 0d5: ldc2_w -5684624130987933291
      // 0d8: lload 1
      // 0d9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: ldc "Z"
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: lload 1
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 118
      // 0ea: ifeq 113
      // 0ed: goto 0fa
      // 0f0: ldc2_w -5684624130987933291
      // 0f3: lload 1
      // 0f4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 6
      // 0fc: iload 8
      // 0fe: ldc "I"
      // 100: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 105: goto 112
      // 108: ldc2_w -5684624130987933291
      // 10b: lload 1
      // 10c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: pop
      // 113: iinc 8 1
      // 116: iload 5
      // 118: ifeq 031
      // 11b: aload 6
      // 11d: areturn
   }

   public _fz H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new _fz(x44.a<"i">(this, new Object[0], 5093237262755250244L, var2), this.A());
   }

   public _fr s(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 88507018138857L;
      int var3 = (int)((var1 ^ 88507018138857L) >>> 32);
      int var4 = (int)((var1 ^ 88507018138857L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 121965913102631L;
      return new _fr(this.t(var6), var3, (char)var4, var5, this.H());
   }

   public final int o(Object[] param1) {
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
      // 00c: getstatic com/zelix/iu.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 73810597423833
      // 017: lxor
      // 018: dup2
      // 019: bipush 48
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 4
      // 01f: dup2
      // 020: bipush 16
      // 022: lshl
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 5
      // 029: dup2
      // 02a: bipush 32
      // 02c: lshl
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 6
      // 033: pop2
      // 034: pop2
      // 035: ldc2_w -5945145270145868524
      // 038: lload 2
      // 039: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: istore 7
      // 040: aload 0
      // 041: getfield com/zelix/iu.T Lcom/zelix/h2;
      // 044: iload 4
      // 046: i2s
      // 047: iload 5
      // 049: i2s
      // 04a: iload 6
      // 04c: invokevirtual com/zelix/h2.B (SSI)Z
      // 04f: iload 7
      // 051: ifeq 065
      // 054: ifeq 068
      // 057: goto 064
      // 05a: ldc2_w -6081150247190275310
      // 05d: lload 2
      // 05e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: bipush 0
      // 065: goto 069
      // 068: bipush 1
      // 069: istore 8
      // 06b: bipush 0
      // 06c: istore 9
      // 06e: iload 9
      // 070: aload 0
      // 071: getfield com/zelix/iu.V Ljava/util/List;
      // 074: invokeinterface java/util/List.size ()I 1
      // 079: if_icmpge 139
      // 07c: aload 0
      // 07d: getfield com/zelix/iu.V Ljava/util/List;
      // 080: iload 9
      // 082: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 087: checkcast java/lang/String
      // 08a: ldc "D"
      // 08c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08f: iload 7
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: iflt 09c
      // 097: ifeq 141
      // 09a: iload 7
      // 09c: ifeq 0fd
      // 09f: goto 0ac
      // 0a2: ldc2_w -6081150247190275310
      // 0a5: lload 2
      // 0a6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 0f0
      // 0b2: ifeq 0dd
      // 0b5: goto 0c2
      // 0b8: ldc2_w -6081150247190275310
      // 0bb: lload 2
      // 0bc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: iinc 8 2
      // 0c5: iload 7
      // 0c7: lload 2
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: ifle 136
      // 0cd: ifne 131
      // 0d0: goto 0dd
      // 0d3: ldc2_w -6081150247190275310
      // 0d6: lload 2
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield com/zelix/iu.V Ljava/util/List;
      // 0e1: iload 9
      // 0e3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e8: checkcast java/lang/String
      // 0eb: ldc "J"
      // 0ed: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f0: goto 0fd
      // 0f3: ldc2_w -6081150247190275310
      // 0f6: lload 2
      // 0f7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 10b
      // 103: ifeq 121
      // 106: iinc 8 2
      // 109: iload 7
      // 10b: lload 2
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 136
      // 111: ifne 131
      // 114: goto 121
      // 117: ldc2_w -6081150247190275310
      // 11a: lload 2
      // 11b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: iinc 8 1
      // 124: goto 131
      // 127: ldc2_w -6081150247190275310
      // 12a: lload 2
      // 12b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: iinc 9 1
      // 134: iload 7
      // 136: ifne 06e
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: ifle 07c
      // 13f: iload 8
      // 141: ireturn
   }

   public String Z(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 32781127651369L;
      long var5 = var1 ^ 83111223742245L;
      return this.z() + _fz.T(var5, this.K(var3), null);
   }

   public final void H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 114008204357241L;
      x44.a<"i">(this.T, new Object[]{var4}, -3151593087562327980L, var2);
   }

   public static String D(Object[] param0) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/iu.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 96242782745305
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 29970924222064
      // 02d: lxor
      // 02e: lstore 7
      // 030: pop2
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: invokespecial java/lang/StringBuilder.<init> ()V
      // 038: astore 10
      // 03a: aload 10
      // 03c: aload 4
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: pop
      // 042: ldc2_w -6418845116083891537
      // 045: lload 1
      // 046: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 10
      // 04d: sipush 13109
      // 050: ldc2_w 4530316900782330826
      // 053: lload 1
      // 054: lxor
      // 055: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 05d: pop
      // 05e: aload 3
      // 05f: lload 7
      // 061: bipush 1
      // 062: invokestatic com/zelix/xl.L (Ljava/lang/String;JZ)Ljava/util/List;
      // 065: astore 11
      // 067: aload 11
      // 069: invokeinterface java/util/List.size ()I 1
      // 06e: istore 12
      // 070: istore 9
      // 072: bipush 0
      // 073: istore 13
      // 075: iload 13
      // 077: iload 12
      // 079: if_icmpge 0f8
      // 07c: aload 11
      // 07e: iload 13
      // 080: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 085: checkcast java/lang/String
      // 088: astore 14
      // 08a: aload 10
      // 08c: aload 14
      // 08e: lload 5
      // 090: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: lload 1
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 113
      // 09c: pop
      // 09d: iload 9
      // 09f: ifne 111
      // 0a2: iload 9
      // 0a4: lload 1
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: iflt 0f5
      // 0aa: ifne 0f3
      // 0ad: goto 0ba
      // 0b0: ldc2_w -4793745470966084112
      // 0b3: lload 1
      // 0b4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: iload 13
      // 0bc: iload 12
      // 0be: bipush 1
      // 0bf: isub
      // 0c0: if_icmpge 0f0
      // 0c3: goto 0d0
      // 0c6: ldc2_w -4793745470966084112
      // 0c9: lload 1
      // 0ca: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 10
      // 0d2: sipush 26403
      // 0d5: ldc2_w 2258314539393152142
      // 0d8: lload 1
      // 0d9: lxor
      // 0da: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: pop
      // 0e3: goto 0f0
      // 0e6: ldc2_w -4793745470966084112
      // 0e9: lload 1
      // 0ea: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: iinc 13 1
      // 0f3: iload 9
      // 0f5: ifeq 075
      // 0f8: aload 10
      // 0fa: sipush 19479
      // 0fd: ldc2_w 2817861279355841769
      // 100: lload 1
      // 101: lxor
      // 102: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 10a: pop
      // 10b: lload 1
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 111
      // 111: aload 10
      // 113: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 116: areturn
   }

   static int e(Object[] param0) {
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
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/iu.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 7052320727789688218
      // 1c: lload 2
      // 1d: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: ldc "D"
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: iload 4
      // 2c: ifne 51
      // 2f: ifeq 4b
      // 32: goto 3f
      // 35: ldc2_w 8812559111565281989
      // 38: lload 2
      // 39: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: bipush 2
      // 40: ireturn
      // 41: ldc2_w 8812559111565281989
      // 44: lload 2
      // 45: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 1
      // 4c: ldc "J"
      // 4e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 51: iload 4
      // 53: ifne 73
      // 56: ifeq 72
      // 59: goto 66
      // 5c: ldc2_w 8812559111565281989
      // 5f: lload 2
      // 60: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: bipush 2
      // 67: ireturn
      // 68: ldc2_w 8812559111565281989
      // 6b: lload 2
      // 6c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 1
      // 73: ireturn
   }

   public int c(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/iu.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -2948513366524958850
      // 09: lload 1
      // 0a: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/zelix/iu.V Ljava/util/List;
      // 14: iload 3
      // 15: ifeq 39
      // 18: ifnull 3f
      // 1b: goto 28
      // 1e: ldc2_w -3318812871799561864
      // 21: lload 1
      // 22: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/zelix/iu.V Ljava/util/List;
      // 2c: goto 39
      // 2f: ldc2_w -3318812871799561864
      // 32: lload 1
      // 33: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: invokeinterface java/util/List.size ()I 1
      // 3e: ireturn
      // 3f: bipush 0
      // 40: ireturn
   }

   public final boolean e(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 50199240044706L;
      return this.V(var6, 4);
   }

   public void C(Object[] param1) {
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
      // 04: checkcast com/zelix/_3
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/iu.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 27302849801485
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 3782360938755916823
      // 25: lload 3
      // 26: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 8
      // 2e: istore 7
      // 30: iload 8
      // 32: aload 0
      // 33: getfield com/zelix/iu.F I
      // 36: if_icmpge 9f
      // 39: aload 0
      // 3a: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 3d: iload 8
      // 3f: aaload
      // 40: iload 7
      // 42: ifeq 72
      // 45: instanceof com/zelix/bo
      // 48: lload 3
      // 49: lconst_0
      // 4a: lcmp
      // 4b: ifle 9c
      // 4e: ifeq 97
      // 51: goto 5e
      // 54: ldc2_w 3645759324182102545
      // 57: lload 3
      // 58: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 62: iload 8
      // 64: aaload
      // 65: goto 72
      // 68: ldc2_w 3645759324182102545
      // 6b: lload 3
      // 6c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: checkcast com/zelix/bo
      // 75: astore 9
      // 77: aload 9
      // 79: lload 5
      // 7b: aload 2
      // 7c: bipush 2
      // 7d: anewarray 576
      // 80: dup_x1
      // 81: swap
      // 82: bipush 1
      // 83: swap
      // 84: aastore
      // 85: dup_x2
      // 86: dup_x2
      // 87: pop
      // 88: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b: bipush 0
      // 8c: swap
      // 8d: aastore
      // 8e: ldc2_w 3740076871997705876
      // 91: lload 3
      // 92: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: iinc 8 1
      // 9a: iload 7
      // 9c: ifne 30
      // 9f: lload 3
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle 39
      // a5: return
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 30955029529925L;
      return xl.m(this.m, false, var4, true);
   }

   public final _fz G(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 66698380293327L;
      return new _fz(this.t(var3), this.H());
   }

   public String K(long var1) {
      var1 = a ^ var1;
      int var3 = this.g.lastIndexOf(e<"a">(1234, 1732197679081886022L ^ var1));
      return this.g.substring(0, var3 + 1);
   }

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      x44.a<"s">(this, var4, -1741182821454990335L, var2);
   }

   public boolean K() {
      return false;
   }

   public ArrayList N(Object[] param1) {
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
      // 00c: getstatic com/zelix/iu.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 55139666885877
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 36630918742667
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
      // 03c: ldc2_w 72136213133605
      // 03f: lxor
      // 040: lstore 9
      // 042: pop2
      // 043: ldc2_w 8354991018453190582
      // 046: lload 2
      // 047: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: new java/util/ArrayList
      // 04f: dup
      // 050: invokespecial java/util/ArrayList.<init> ()V
      // 053: astore 12
      // 055: istore 11
      // 057: aconst_null
      // 058: astore 13
      // 05a: aload 0
      // 05b: iload 11
      // 05d: ifne 082
      // 060: getfield com/zelix/iu.d I
      // 063: bipush -1
      // 064: if_icmpeq 092
      // 067: goto 074
      // 06a: ldc2_w 7521147257262381289
      // 06d: lload 2
      // 06e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: aload 0
      // 075: goto 082
      // 078: ldc2_w 7521147257262381289
      // 07b: lload 2
      // 07c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 085: aload 0
      // 086: getfield com/zelix/iu.d I
      // 089: aaload
      // 08a: checkcast com/zelix/hb
      // 08d: checkcast com/zelix/hb
      // 090: astore 13
      // 092: aload 13
      // 094: ifnull 123
      // 097: bipush 0
      // 098: istore 14
      // 09a: iload 14
      // 09c: aload 13
      // 09e: lload 4
      // 0a0: bipush 1
      // 0a1: anewarray 576
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w 8205902204293616922
      // 0b0: lload 2
      // 0b1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: if_icmpge 123
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 10b
      // 0bf: aload 12
      // 0c1: iload 11
      // 0c3: ifne 125
      // 0c6: aload 13
      // 0c8: iload 14
      // 0ca: iload 6
      // 0cc: i2c
      // 0cd: iload 7
      // 0cf: i2s
      // 0d0: iload 8
      // 0d2: bipush 4
      // 0d3: anewarray 576
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 3
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: bipush 2
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 7849279765304126693
      // 0f9: lload 2
      // 0fa: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: lload 9
      // 101: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 104: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 107: pop
      // 108: iinc 14 1
      // 10b: iload 11
      // 10d: ifeq 09a
      // 110: lload 2
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 0b9
      // 116: goto 123
      // 119: ldc2_w 7521147257262381289
      // 11c: lload 2
      // 11d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 12
      // 125: areturn
   }

   public final void m(Object[] param1) {
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
      // 04: checkcast java/lang/Boolean
      // 07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/iu.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 1242926664943214933
      // 1f: lload 3
      // 20: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: iload 5
      // 29: ifeq 6d
      // 2c: iload 2
      // 2d: ifeq 78
      // 30: goto 3d
      // 33: ldc2_w 1718739836927502163
      // 36: lload 3
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: sipush 14445
      // 41: ldc2_w 3453691850604769845
      // 44: lload 3
      // 45: lxor
      // 46: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: bipush 1
      // 4c: anewarray 576
      // 4f: dup_x1
      // 50: swap
      // 51: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 54: bipush 0
      // 55: swap
      // 56: aastore
      // 57: ldc2_w 1465861394993561767
      // 5a: lload 3
      // 5b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: goto 6d
      // 63: ldc2_w 1718739836927502163
      // 66: lload 3
      // 67: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: lload 3
      // 6e: lconst_0
      // 6f: lcmp
      // 70: ifle 9b
      // 73: iload 5
      // 75: ifne a8
      // 78: aload 0
      // 79: sipush 21552
      // 7c: ldc2_w 7753911033740303977
      // 7f: lload 3
      // 80: lxor
      // 81: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: bipush 1
      // 87: anewarray 576
      // 8a: dup_x1
      // 8b: swap
      // 8c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8f: bipush 0
      // 90: swap
      // 91: aastore
      // 92: ldc2_w 1334413777882283935
      // 95: lload 3
      // 96: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: goto a8
      // 9e: ldc2_w 1718739836927502163
      // a1: lload 3
      // a2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: athrow
      // a8: return
   }

   public final boolean Q(long var1) {
      var1 = a ^ var1;
      return this.k.equals(b<"o">(27634, 8456078555345291596L ^ var1));
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 109097027835370L;
      int var4 = (int)((var2 ^ 109097027835370L) >>> 48);
      int var5 = (int)((var2 ^ 109097027835370L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 21200984083701L;
      long var9 = var2 ^ 63169150900102L;
      return this.D((char)var4, var5, (short)var6) + x44.a<"o">(this.G(var7), new Object[]{var9}, 7234823184473395204L, var2);
   }

   public abstract be N(Object[] var1);

   public abstract void p(Object[] var1);

   public final boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 8024568415952L;
      return x44.a<"o">(this.T, new Object[]{var4}, -376609825799745349L, var2);
   }

   public int t(Object[] var1) {
      return this.j;
   }

   public final void W(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 102699693251770L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var2};
      var10004[0] = var5;
      x44.a<"i">(var10000, var10004, -3128912184372836343L, var3);
   }

   public boolean H(Object[] param1) {
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
      // 0c: getstatic com/zelix/iu.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 6660972426208110644
      // 15: lload 2
      // 16: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 6453701198089947719
      // 21: lload 2
      // 22: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifne 4b
      // 2c: bipush -1
      // 2d: if_icmple 4e
      // 30: goto 3d
      // 33: ldc2_w 5179729619354531691
      // 36: lload 2
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4b
      // 41: ldc2_w 5179729619354531691
      // 44: lload 2
      // 45: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   private void b(Object[] param1) {
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
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 4
      // 20: pop
      // 21: iload 3
      // 22: i2l
      // 23: bipush 48
      // 25: lshl
      // 26: iload 2
      // 27: i2l
      // 28: bipush 48
      // 2a: lshl
      // 2b: bipush 16
      // 2d: lushr
      // 2e: lor
      // 2f: iload 4
      // 31: i2l
      // 32: bipush 32
      // 34: lshl
      // 35: bipush 32
      // 37: lushr
      // 38: lor
      // 39: getstatic com/zelix/iu.a J
      // 3c: lxor
      // 3d: lstore 5
      // 3f: lload 5
      // 41: dup2
      // 42: ldc2_w 86830358482959
      // 45: lxor
      // 46: lstore 7
      // 48: dup2
      // 49: ldc2_w 39503003768169
      // 4c: lxor
      // 4d: lstore 9
      // 4f: dup2
      // 50: ldc2_w 139018767246508
      // 53: lxor
      // 54: lstore 11
      // 56: pop2
      // 57: ldc2_w -4183115284860964426
      // 5a: lload 5
      // 5c: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: istore 13
      // 63: aload 0
      // 64: iload 13
      // 66: ifne d3
      // 69: lload 7
      // 6b: bipush 1
      // 6c: anewarray 576
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -2412052551526710490
      // 7b: lload 5
      // 7d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: ifeq e0
      // 85: goto 93
      // 88: ldc2_w -2422926378045886743
      // 8b: lload 5
      // 8d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: aload 0
      // 94: aload 0
      // 95: getfield com/zelix/iu.w Lcom/zelix/mx;
      // 98: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 9b: putfield com/zelix/iu.m Ljava/lang/String;
      // 9e: aload 0
      // 9f: aload 0
      // a0: getfield com/zelix/iu.C Lcom/zelix/mx;
      // a3: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // a6: putfield com/zelix/iu.k Ljava/lang/String;
      // a9: aload 0
      // aa: aload 0
      // ab: lload 11
      // ad: ldc2_w -4431961583677506239
      // b0: lload 5
      // b2: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // ba: ldc2_w -4586843225087323993
      // bd: lload 5
      // bf: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: aload 0
      // c5: goto d3
      // c8: ldc2_w -2422926378045886743
      // cb: lload 5
      // cd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: athrow
      // d3: aload 0
      // d4: getfield com/zelix/iu.m Ljava/lang/String;
      // d7: lload 9
      // d9: bipush 1
      // da: invokestatic com/zelix/xl.L (Ljava/lang/String;JZ)Ljava/util/List;
      // dd: putfield com/zelix/iu.V Ljava/util/List;
      // e0: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void Y(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 128634616892080L;
      long var7 = var2 ^ 93940307913364L;
      long var9 = var2 ^ 0L;
      long var11 = var2 ^ 66603696561118L;
      boolean var16 = x44.a<"v">(7491659118132483997L, var2);

      label40: {
         iu var10000;
         label39: {
            label46: {
               try {
                  var10000 = this;
                  if (!var16) {
                     break label39;
                  }

                  if (!this.Q(var7)) {
                     break label46;
                  }
               } catch (gj var19) {
                  throw x44.a<"v">(var19, 6994736422392893851L, var2);
               }

               x44.a<"n">(this, 8735201708506267347L, var2);
               var10000 = this;
               wp var10001 = new wp(0);
               Object var13 = null;
               iu var14 = this;
               wp var15 = var10001;

               try {
                  x44.a<"n">(var10000, var5, var15, var14, var13, 8775273573294917789L, var2);
                  if (var2 < 0L) {
                     return;
                  }

                  if (var16) {
                     break label40;
                  }
               } catch (gj var18) {
                  boolean var22 = false;
                  throw x44.a<"v">(var18, 6994736422392893851L, var2);
               }
            }

            try {
               this.k = var4;
               var10000 = this;
            } catch (gj var17) {
               boolean var23 = false;
               throw x44.a<"v">(var17, 6994736422392893851L, var2);
            }
         }

         var10000.Y(new Object[]{var4, var9});
      }

      x44.a<"u">(this, x44.a<"n">(this, var11, 9010788710964838963L, var2).toLowerCase(), 9163137075373076437L, var2);
   }

   public boolean D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -7854961832544358007L, var2);
   }

   public final boolean V(long var1) {
      var1 = a ^ var1;
      return this.k.equals(b<"o">(31276, 7644036454286150628L ^ var1));
   }

   public final String v(Object[] var1) {
      Map var2 = (Map)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var10001 = var3 ^ 30254032337972L;
      int var5 = (int)((var3 ^ 30254032337972L) >>> 32);
      int var6 = (int)((var3 ^ 30254032337972L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Object[] var10007 = new Object[]{null, null, null, null, var7};
      var10007[3] = var6;
      var10007[2] = var5;
      var10007[1] = var2;
      var10007[0] = true;
      return x44.a<"m">(this, var10007, -8456023010445995520L, var3);
   }

   public final String F(Object[] param1) {
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
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/iu.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 80949216253917
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 97681537065649
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 51310503075070
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: ldc2_w -7018618115384168718
      // 036: lload 3
      // 037: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: new java/lang/StringBuilder
      // 03f: dup
      // 040: invokespecial java/lang/StringBuilder.<init> ()V
      // 043: astore 12
      // 045: istore 11
      // 047: iload 11
      // 049: ifeq 076
      // 04c: iload 2
      // 04d: ifeq 081
      // 050: goto 05d
      // 053: ldc2_w -7458752685877303052
      // 056: lload 3
      // 057: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 12
      // 05f: aload 0
      // 060: lload 9
      // 062: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: pop
      // 069: goto 076
      // 06c: ldc2_w -7458752685877303052
      // 06f: lload 3
      // 070: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: iload 11
      // 078: lload 3
      // 079: lconst_0
      // 07a: lcmp
      // 07b: ifle 0bc
      // 07e: ifne 0a0
      // 081: aload 12
      // 083: aload 0
      // 084: lload 7
      // 086: ldc2_w -8907094410658497700
      // 089: lload 3
      // 08a: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 092: pop
      // 093: goto 0a0
      // 096: ldc2_w -7458752685877303052
      // 099: lload 3
      // 09a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 12
      // 0a2: sipush 4342
      // 0a5: ldc2_w 8211587906177684743
      // 0a8: lload 3
      // 0a9: lxor
      // 0aa: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b2: pop
      // 0b3: aload 0
      // 0b4: getfield com/zelix/iu.V Ljava/util/List;
      // 0b7: invokeinterface java/util/List.size ()I 1
      // 0bc: istore 13
      // 0be: bipush 0
      // 0bf: istore 14
      // 0c1: iload 14
      // 0c3: iload 13
      // 0c5: if_icmpge 146
      // 0c8: aload 0
      // 0c9: getfield com/zelix/iu.V Ljava/util/List;
      // 0cc: iload 14
      // 0ce: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d3: checkcast java/lang/String
      // 0d6: astore 15
      // 0d8: aload 12
      // 0da: aload 15
      // 0dc: lload 5
      // 0de: invokestatic com/zelix/xl.b (Ljava/lang/String;J)Ljava/lang/String;
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: lload 3
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: ifle 161
      // 0ea: pop
      // 0eb: iload 11
      // 0ed: ifeq 15f
      // 0f0: iload 11
      // 0f2: lload 3
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 143
      // 0f8: ifeq 141
      // 0fb: goto 108
      // 0fe: ldc2_w -7458752685877303052
      // 101: lload 3
      // 102: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: iload 14
      // 10a: iload 13
      // 10c: bipush 1
      // 10d: isub
      // 10e: if_icmpge 13e
      // 111: goto 11e
      // 114: ldc2_w -7458752685877303052
      // 117: lload 3
      // 118: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 12
      // 120: sipush 16863
      // 123: ldc2_w 6100078313164502899
      // 126: lload 3
      // 127: lxor
      // 128: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: pop
      // 131: goto 13e
      // 134: ldc2_w -7458752685877303052
      // 137: lload 3
      // 138: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: iinc 14 1
      // 141: iload 11
      // 143: ifne 0c1
      // 146: aload 12
      // 148: sipush 1234
      // 14b: ldc2_w 1732244858826866987
      // 14e: lload 3
      // 14f: lxor
      // 150: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 158: pop
      // 159: lload 3
      // 15a: lconst_0
      // 15b: lcmp
      // 15c: ifle 15f
      // 15f: aload 12
      // 161: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 164: areturn
   }

   public final boolean u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 79656557187477L;
      return this.V(var4, 2);
   }

   public boolean g(Object[] param1) {
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
      // 04: checkcast com/zelix/iu
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/iu.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 97472944413433
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -7358106642709434970
      // 26: lload 2
      // 27: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: getfield com/zelix/iu.k Ljava/lang/String;
      // 32: aload 4
      // 34: getfield com/zelix/iu.k Ljava/lang/String;
      // 37: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a: iload 7
      // 3c: ifne bc
      // 3f: ifeq bb
      // 42: goto 4f
      // 45: ldc2_w -9047626673039543559
      // 48: lload 2
      // 49: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/iu.m Ljava/lang/String;
      // 53: aload 4
      // 55: getfield com/zelix/iu.m Ljava/lang/String;
      // 58: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b: iload 7
      // 5d: ifne bc
      // 60: goto 6d
      // 63: ldc2_w -9047626673039543559
      // 66: lload 2
      // 67: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: ifeq bb
      // 70: goto 7d
      // 73: ldc2_w -9047626673039543559
      // 76: lload 2
      // 77: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 0
      // 7e: lload 5
      // 80: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 83: aload 4
      // 85: lload 5
      // 87: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 8a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8d: iload 7
      // 8f: ifne bc
      // 92: goto 9f
      // 95: ldc2_w -9047626673039543559
      // 98: lload 2
      // 99: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: ifeq bb
      // a2: goto af
      // a5: ldc2_w -9047626673039543559
      // a8: lload 2
      // a9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: athrow
      // af: bipush 1
      // b0: ireturn
      // b1: ldc2_w -9047626673039543559
      // b4: lload 2
      // b5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: bipush 0
      // bc: ireturn
   }

   public List C(Object[] param1) {
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
      // 0c: getstatic com/zelix/iu.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -4744919223195627956
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/iu.V Ljava/util/List;
      // 21: iload 4
      // 23: ifeq 51
      // 26: ifnull 48
      // 29: goto 36
      // 2c: ldc2_w -5133159185895274422
      // 2f: lload 2
      // 30: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/iu.V Ljava/util/List;
      // 3a: invokestatic java/util/Collections.unmodifiableList (Ljava/util/List;)Ljava/util/List;
      // 3d: areturn
      // 3e: ldc2_w -5133159185895274422
      // 41: lload 2
      // 42: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: ldc2_w -6695655188901587311
      // 4b: lload 2
      // 4c: invokedynamic w (JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: areturn
   }

   public String h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = this.m.lastIndexOf(e<"a">(1234, 1732325893309670059L ^ var2));
      return this.m.substring(var4 + 1);
   }

   protected String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -5176505513388660522L, var2);
   }

   public _y0 u(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 113535974811826L;
      long var5 = var1 ^ 115839500091809L;
      return new _y0(this.L(var3), this.t(var5), this.H());
   }

   public final void g(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 135378319520994L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var2};
      var10004[0] = var5;
      x44.a<"l">(var10000, var10004, -7808030906758857545L, var3);
   }

   private static void j(Object[] param0) {
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
      // 004: checkcast [Ljava/lang/String;
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
      // 015: checkcast com/zelix/_yv
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/iu.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 38542746181240
      // 026: lxor
      // 027: dup2
      // 028: bipush 16
      // 02a: lushr
      // 02b: lstore 5
      // 02d: dup2
      // 02e: bipush 48
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 7
      // 037: pop2
      // 038: dup2
      // 039: ldc2_w 15532231147825
      // 03c: lxor
      // 03d: lstore 8
      // 03f: pop2
      // 040: ldc2_w -3390422417318551400
      // 043: lload 2
      // 044: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: bipush 0
      // 04a: istore 11
      // 04c: istore 10
      // 04e: iload 11
      // 050: aload 1
      // 051: arraylength
      // 052: bipush 1
      // 053: isub
      // 054: if_icmpge 12c
      // 057: iload 11
      // 059: istore 12
      // 05b: aload 1
      // 05c: iload 11
      // 05e: aaload
      // 05f: astore 13
      // 061: iload 11
      // 063: bipush 1
      // 064: iadd
      // 065: istore 14
      // 067: iload 14
      // 069: aload 1
      // 06a: arraylength
      // 06b: if_icmpge 0f6
      // 06e: aload 1
      // 06f: iload 14
      // 071: aaload
      // 072: astore 15
      // 074: aload 4
      // 076: lload 5
      // 078: iload 7
      // 07a: i2s
      // 07b: aload 15
      // 07d: aload 13
      // 07f: invokeinterface com/zelix/_yv.m (JSLjava/lang/String;Ljava/lang/String;)Z 6
      // 084: iload 10
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: iflt 106
      // 08c: ifeq 0fe
      // 08f: iload 10
      // 091: ifeq 0e8
      // 094: goto 0a1
      // 097: ldc2_w -3019875516559022434
      // 09a: lload 2
      // 09b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: ifne 0e6
      // 0a4: goto 0b1
      // 0a7: ldc2_w -3019875516559022434
      // 0aa: lload 2
      // 0ab: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0ea
      // 0b7: aload 4
      // 0b9: aload 15
      // 0bb: aload 13
      // 0bd: lload 8
      // 0bf: invokeinterface com/zelix/_yv.l (Ljava/lang/String;Ljava/lang/String;J)Z 5
      // 0c4: iload 10
      // 0c6: ifeq 0e8
      // 0c9: goto 0d6
      // 0cc: ldc2_w -3019875516559022434
      // 0cf: lload 2
      // 0d0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: ifeq 0ee
      // 0d9: goto 0e6
      // 0dc: ldc2_w -3019875516559022434
      // 0df: lload 2
      // 0e0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: iload 14
      // 0e8: istore 12
      // 0ea: aload 15
      // 0ec: astore 13
      // 0ee: iinc 14 1
      // 0f1: iload 10
      // 0f3: ifne 067
      // 0f6: lload 2
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 127
      // 0fc: iload 12
      // 0fe: lload 2
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 129
      // 104: iload 11
      // 106: if_icmple 124
      // 109: aload 1
      // 10a: iload 12
      // 10c: aload 1
      // 10d: iload 11
      // 10f: aaload
      // 110: aastore
      // 111: aload 1
      // 112: iload 11
      // 114: aload 13
      // 116: aastore
      // 117: goto 124
      // 11a: ldc2_w -3019875516559022434
      // 11d: lload 2
      // 11e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: iinc 11 1
      // 127: iload 10
      // 129: ifne 04e
      // 12c: return
   }

   public final void B(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 122224269163745L;
      long var7 = var2 ^ 0L;
      this.m = var4;
      this.V = xl.L(this.m, var5, true);
      super.B(new Object[]{var7, var4});
   }

   public Enumeration G(Object[] param1) {
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
      // 017: getstatic com/zelix/iu.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 62481994341629
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 104107627753851
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: ldc2_w 7764635419644878725
      // 030: lload 2
      // 031: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: aconst_null
      // 037: astore 10
      // 039: bipush 0
      // 03a: istore 11
      // 03c: istore 9
      // 03e: iload 11
      // 040: aload 0
      // 041: getfield com/zelix/iu.F I
      // 044: if_icmpge 151
      // 047: aload 10
      // 049: iload 9
      // 04b: lload 2
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: ifle 15b
      // 051: ifne 159
      // 054: iload 9
      // 056: ifne 0b0
      // 059: goto 066
      // 05c: ldc2_w 8093840727087579354
      // 05f: lload 2
      // 060: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: ifnonnull 0b2
      // 069: goto 076
      // 06c: ldc2_w 8093840727087579354
      // 06f: lload 2
      // 070: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: lload 5
      // 078: sipush 23386
      // 07b: ldc2_w 3019600939275482764
      // 07e: lload 2
      // 07f: lxor
      // 080: invokedynamic a (IJ)I bsm=com/zelix/iu.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: bipush 2
      // 086: anewarray 576
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w 7930973445793574660
      // 09d: lload 2
      // 09e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: goto 0b0
      // 0a6: ldc2_w 8093840727087579354
      // 0a9: lload 2
      // 0aa: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: astore 10
      // 0b2: aload 0
      // 0b3: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 0b6: iload 11
      // 0b8: aaload
      // 0b9: iload 9
      // 0bb: ifne 0e5
      // 0be: instanceof com/zelix/bo
      // 0c1: ifeq 149
      // 0c4: goto 0d1
      // 0c7: ldc2_w 8093840727087579354
      // 0ca: lload 2
      // 0cb: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield com/zelix/iu.J [Lcom/zelix/h4;
      // 0d5: iload 11
      // 0d7: aaload
      // 0d8: goto 0e5
      // 0db: ldc2_w 8093840727087579354
      // 0de: lload 2
      // 0df: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: checkcast com/zelix/bo
      // 0e8: lload 7
      // 0ea: iload 4
      // 0ec: bipush 2
      // 0ed: anewarray 576
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 8178262128873388023
      // 104: lload 2
      // 105: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: astore 12
      // 10c: bipush 0
      // 10d: istore 13
      // 10f: iload 13
      // 111: aload 12
      // 113: arraylength
      // 114: if_icmpge 149
      // 117: aload 10
      // 119: aload 12
      // 11b: iload 13
      // 11d: aaload
      // 11e: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 121: istore 14
      // 123: iinc 13 1
      // 126: iload 9
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 14e
      // 12e: ifne 14c
      // 131: iload 9
      // 133: ifeq 10f
      // 136: lload 2
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 126
      // 13c: goto 149
      // 13f: ldc2_w 8093840727087579354
      // 142: lload 2
      // 143: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: iinc 11 1
      // 14c: iload 9
      // 14e: ifeq 03e
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 047
      // 157: aload 10
      // 159: iload 9
      // 15b: ifne 182
      // 15e: ifnonnull 180
      // 161: goto 16e
      // 164: ldc2_w 8093840727087579354
      // 167: lload 2
      // 168: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: new com/zelix/ri
      // 171: dup
      // 172: invokespecial com/zelix/ri.<init> ()V
      // 175: areturn
      // 176: ldc2_w 8093840727087579354
      // 179: lload 2
      // 17a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 10
      // 182: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 185: areturn
   }

   static {
      long var11 = a ^ 103287514357659L;
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
      String var17 = "¯\u0003\u0018Þ\u0089kc\u0097k0\\V\u009b>¼z $9¼;\u0011Ì\u0014\u0013I£íªL\u0099¹i5\ng\u0005íÐ7\u001e\u0090R*ÃRÿ\u0086û\u0010\u0006\u0011cê¿s\"\u000fP\u0088ëý<\u0015ÖB\u0010}£\u0005P\u0011 «ãðôY6µc\u009db\u0010ü§ªI[¸\u009frÇK¦-Áx\n\u0084\u0010Qº\u0082æ_<E\"#ñZ\u001f\u0011u\u0010G";
      int var19 = "¯\u0003\u0018Þ\u0089kc\u0097k0\\V\u009b>¼z $9¼;\u0011Ì\u0014\u0013I£íªL\u0099¹i5\ng\u0005íÐ7\u001e\u0090R*ÃRÿ\u0086û\u0010\u0006\u0011cê¿s\"\u000fP\u0088ëý<\u0015ÖB\u0010}£\u0005P\u0011 «ãðôY6µc\u009db\u0010ü§ªI[¸\u009frÇK¦-Áx\n\u0084\u0010Qº\u0082æ_<E\"#ñZ\u001f\u0011u\u0010G"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     s = var20;
                     t = new String[8];
                     R = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = " ÷\u008aÑØ v\n\u0099ö\u0090\u0017GÌñ¡\u001fÅ\u0089õO\u0096R3\u0093oÐfpP~%Ö\u009e=K\u0093®Ä\u0002¦\u001b\u0013¦\u0014{ôös×ÓÍ\u0000ËGB";
                     int var5 = " ÷\u008aÑØ v\n\u0099ö\u0090\u0017GÌñ¡\u001fÅ\u0089õO\u0096R3\u0093oÐfpP~%Ö\u009e=K\u0093®Ä\u0002¦\u001b\u0013¦\u0014{ôös×ÓÍ\u0000ËGB"
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
                                    O = var6;
                                    Q = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ò\u001ebà¢j\u008aoM\u000f¸Æ&äËd";
                                 var5 = "ò\u001ebà¢j\u008aoM\u000f¸Æ&äËd".length();
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

                  var17 = "À\u0095mo#`\u008bô\u009b\u0083\u00840ñÛì¹»\fØáâ\u0012\u0096£\u0083\u0082¨l'OÏ\u0019\u0010²\u0006\u00049û~\u000eÔÒ_\u0097D¤ÒoX";
                  var19 = "À\u0095mo#`\u008bô\u009b\u0083\u00840ñÛì¹»\fØáâ\u0012\u0096£\u0083\u0082¨l'OÏ\u0019\u0010²\u0006\u00049û~\u000eÔÒ_\u0097D¤ÒoX"
                     .length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9366;
      if (t[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])u.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/iu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = s[var5].getBytes("ISO-8859-1");
         t[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return t[var5];
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
         throw new RuntimeException("com/zelix/iu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22467;
      if (Q[var3] == null) {
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
         long var5 = O[var3];
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
         Object[] var9 = (Object[])R.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               R.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/iu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Q[var3] = var15;
      }

      return Q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/iu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
