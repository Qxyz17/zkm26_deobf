package com.zelix;

import java.io.File;
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

public class lr {
   private static File v;
   public static final String P;
   private static Map D;
   private static final long a = ess.a(-7971255242294081751L, 6763744103017023928L, MethodHandles.lookup().lookupClass()).a(153119710644229L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static String E(Object[] param0) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 1
      // 12: pop
      // 13: getstatic com/zelix/lr.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w 6113498878412658949
      // 1c: lload 1
      // 1d: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: getstatic com/zelix/lr.D Ljava/util/Map;
      // 25: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 2a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 5
      // 31: astore 4
      // 33: aload 5
      // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a: ifeq 8f
      // 3d: aload 5
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: checkcast java/util/Map$Entry
      // 47: astore 6
      // 49: aload 6
      // 4b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 50: checkcast java/lang/String
      // 53: aload 4
      // 55: lload 1
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle 5f
      // 5b: ifnonnull 89
      // 5e: aload 3
      // 5f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 62: ifeq 8a
      // 65: goto 72
      // 68: ldc2_w 5985314879056423281
      // 6b: lload 1
      // 6c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 6
      // 74: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 79: checkcast java/lang/String
      // 7c: goto 89
      // 7f: ldc2_w 5985314879056423281
      // 82: lload 1
      // 83: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: areturn
      // 8a: aload 4
      // 8c: ifnull 33
      // 8f: aconst_null
      // 90: areturn
   }

   public static String X(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lr.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: ldc2_w -4211472332172326817
      // 009: lload 0
      // 00a: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: astore 3
      // 010: getstatic com/zelix/lr.D Ljava/util/Map;
      // 013: invokeinterface java/util/Map.size ()I 1
      // 018: aload 3
      // 019: ifnonnull 05b
      // 01c: ifeq 05f
      // 01f: goto 02c
      // 022: ldc2_w -4446663860506183637
      // 025: lload 0
      // 026: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 2
      // 02d: aload 3
      // 02e: ifnonnull 06d
      // 031: goto 03e
      // 034: ldc2_w -4446663860506183637
      // 037: lload 0
      // 038: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: sipush 5458
      // 041: ldc2_w 2303373030293292963
      // 044: lload 0
      // 045: lxor
      // 046: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 04e: goto 05b
      // 051: ldc2_w -4446663860506183637
      // 054: lload 0
      // 055: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: bipush -1
      // 05c: if_icmpne 06e
      // 05f: aload 2
      // 060: goto 06d
      // 063: ldc2_w -4446663860506183637
      // 066: lload 0
      // 067: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: areturn
      // 06e: getstatic com/zelix/lr.D Ljava/util/Map;
      // 071: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 076: astore 4
      // 078: aload 4
      // 07a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 07f: astore 5
      // 081: aload 5
      // 083: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 088: ifeq 101
      // 08b: aload 5
      // 08d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 092: checkcast java/util/Map$Entry
      // 095: astore 6
      // 097: aload 6
      // 099: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 09e: checkcast java/lang/String
      // 0a1: astore 7
      // 0a3: aload 6
      // 0a5: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0aa: checkcast java/lang/String
      // 0ad: astore 8
      // 0af: aload 2
      // 0b0: aload 3
      // 0b1: lload 0
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0bc
      // 0b7: ifnonnull 102
      // 0ba: aload 7
      // 0bc: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0bf: istore 9
      // 0c1: iload 9
      // 0c3: bipush -1
      // 0c4: if_icmple 0fd
      // 0c7: new java/lang/StringBuilder
      // 0ca: dup
      // 0cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ce: astore 10
      // 0d0: aload 10
      // 0d2: aload 2
      // 0d3: bipush 0
      // 0d4: iload 9
      // 0d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 10
      // 0df: aload 8
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: pop
      // 0e5: aload 10
      // 0e7: aload 2
      // 0e8: iload 9
      // 0ea: aload 7
      // 0ec: invokevirtual java/lang/String.length ()I
      // 0ef: iadd
      // 0f0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f6: pop
      // 0f7: aload 10
      // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc: areturn
      // 0fd: aload 3
      // 0fe: ifnull 081
      // 101: aload 2
      // 102: areturn
   }

   public static File h(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      long var3 = var1 ^ 78810640965236L;
      return x44.a<"s">(new Object[]{null, var3}, 5373798487207335303L, var1);
   }

   public static boolean X(Object[] param0) {
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
      // 04: checkcast java/io/File
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lr.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -2879552673922509349
      // 1c: lload 2
      // 1d: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 1
      // 23: ldc2_w -2407371628286168310
      // 26: lload 2
      // 27: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: astore 5
      // 2e: aload 1
      // 2f: ldc2_w -2808626534943494168
      // 32: lload 2
      // 33: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: astore 6
      // 3a: astore 4
      // 3c: aload 5
      // 3e: sipush 19294
      // 41: ldc2_w 2790421041379116073
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 4e: aload 4
      // 50: ifnonnull 9a
      // 53: ifeq d7
      // 56: goto 63
      // 59: ldc2_w -2319819019972041297
      // 5c: lload 2
      // 5d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 5
      // 65: lload 2
      // 66: lconst_0
      // 67: lcmp
      // 68: iflt 9f
      // 6b: aload 4
      // 6d: ifnonnull 9f
      // 70: goto 7d
      // 73: ldc2_w -2319819019972041297
      // 76: lload 2
      // 77: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: sipush 5458
      // 80: ldc2_w 2303353381532588583
      // 83: lload 2
      // 84: lxor
      // 85: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 8d: goto 9a
      // 90: ldc2_w -2319819019972041297
      // 93: lload 2
      // 94: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: ifeq d7
      // 9d: aload 6
      // 9f: ifnull d7
      // a2: new java/io/File
      // a5: dup
      // a6: aload 6
      // a8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // ab: new java/io/File
      // ae: dup
      // af: ldc2_w -4090719168881619162
      // b2: lload 2
      // b3: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // bb: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // be: aload 4
      // c0: ifnonnull d4
      // c3: goto d0
      // c6: ldc2_w -2319819019972041297
      // c9: lload 2
      // ca: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: ifeq d7
      // d3: bipush 1
      // d4: goto d8
      // d7: bipush 0
      // d8: ireturn
   }

   public static void E(Object[] param0) {
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
      // 00c: getstatic com/zelix/lr.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 81597067030878
      // 017: lxor
      // 018: dup2
      // 019: bipush 32
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 3
      // 01e: dup2
      // 01f: bipush 32
      // 021: lshl
      // 022: bipush 40
      // 024: lushr
      // 025: l2i
      // 026: istore 4
      // 028: dup2
      // 029: bipush 56
      // 02b: lshl
      // 02c: bipush 56
      // 02e: lushr
      // 02f: l2i
      // 030: istore 5
      // 032: pop2
      // 033: pop2
      // 034: ldc2_w -7604453711674811483
      // 037: lload 1
      // 038: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 6
      // 03f: ldc2_w -7989850707793103175
      // 042: lload 1
      // 043: invokedynamic u (JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: lstore 7
      // 04a: ldc2_w -7670556208034549184
      // 04d: lload 1
      // 04e: invokedynamic l (JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: new com/zelix/_f
      // 056: dup
      // 057: sipush 23734
      // 05a: ldc2_w 7757692769545477563
      // 05d: lload 1
      // 05e: lxor
      // 05f: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: sipush 1699
      // 067: ldc2_w 2963466414995081129
      // 06a: lload 1
      // 06b: lxor
      // 06c: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 3
      // 072: iload 4
      // 074: iload 5
      // 076: i2b
      // 077: invokespecial com/zelix/_f.<init> (Ljava/lang/String;Ljava/lang/String;IIB)V
      // 07a: ldc2_w -7706632647335685849
      // 07d: lload 1
      // 07e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: astore 9
      // 085: aload 9
      // 087: ifnull 10a
      // 08a: bipush 0
      // 08b: istore 10
      // 08d: iload 10
      // 08f: aload 9
      // 091: arraylength
      // 092: if_icmpge 10a
      // 095: new java/io/File
      // 098: dup
      // 099: ldc2_w -7670556208034549184
      // 09c: lload 1
      // 09d: invokedynamic l (JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: aload 9
      // 0a4: iload 10
      // 0a6: aaload
      // 0a7: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0aa: astore 11
      // 0ac: aload 11
      // 0ae: ldc2_w -8005400629942869828
      // 0b1: lload 1
      // 0b2: invokedynamic m (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: lstore 12
      // 0b9: aload 6
      // 0bb: lload 1
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 0c6
      // 0c1: ifnonnull 120
      // 0c4: aload 6
      // 0c6: lload 1
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: ifle 107
      // 0cc: ifnonnull 105
      // 0cf: goto 0dc
      // 0d2: ldc2_w -7948832044753785903
      // 0d5: lload 1
      // 0d6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: lload 7
      // 0de: lload 12
      // 0e0: lsub
      // 0e1: getstatic com/zelix/lr.e J
      // 0e4: lcmp
      // 0e5: ifle 102
      // 0e8: goto 0f5
      // 0eb: ldc2_w -7948832044753785903
      // 0ee: lload 1
      // 0ef: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 11
      // 0f7: ldc2_w -8444299494318745261
      // 0fa: lload 1
      // 0fb: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: istore 14
      // 102: iinc 10 1
      // 105: aload 6
      // 107: ifnull 08d
      // 10a: lload 1
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: ifle 120
      // 110: goto 120
      // 113: astore 7
      // 115: aload 7
      // 117: ldc2_w -7675721068606567155
      // 11a: lload 1
      // 11b: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: return
   }

   public static boolean T(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 139201123726146L;
      File var6 = new File(var3);
      return x44.a<"u">(new Object[]{var6, var4}, 3159101522216679371L, var1);
   }

   static {
      long var14 = a ^ 77625586270685L;
      long var16 = var14 ^ 91274545545594L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "ä¶º÷M\u008fµ\u007f\u0092\u0080\u0095¨sl³D\u001a\u0084s¨5Ë\u0090\u0097\u0010ÏRLkÂ¶±¿îiû¸û\u000b\u0019\\\u0010¬\u0014³\u000e\u001d~øk\u0096¬bÝÄx\u0011¸\u0010\u0096tðRj\u000b\u0010Z/,¬\u0007X¼m\n";
      int var11 = "ä¶º÷M\u008fµ\u007f\u0092\u0080\u0095¨sl³D\u001a\u0084s¨5Ë\u0090\u0097\u0010ÏRLkÂ¶±¿îiû¸û\u000b\u0019\\\u0010¬\u0014³\u000e\u001d~øk\u0096¬bÝÄx\u0011¸\u0010\u0096tðRj\u000b\u0010Z/,¬\u0007X¼m\n"
         .length();
      char var8 = 24;
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var9.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var5.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var12[var10++] = var28;
                  if ((var19 += var8) >= var11) {
                     b = var12;
                     c = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -7773691229583639990L;
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
                     long var32 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     e = var32;
                     P = x44.a<"r">(
                        a<"b">(27581, 6114596021075275002L ^ var14),
                        x44.a<"r">(a<"b">(6579, 4875797349555347184L ^ var14), 647307314387290091L, var14),
                        1648570108638800328L,
                        var14
                     );
                     x44.a<"s">(new File(x44.a<"k">(1084224170234726167L, var14)), 1424218077655036943L, var14);
                     D = x44.a<"r">(new Object[]{var16}, 902687616805497577L, var14);
                     return;
                  }

                  var8 = var9.charAt(var19);
                  break;
               default:
                  var12[var10++] = var28;
                  if ((var19 += var8) < var11) {
                     var8 = var9.charAt(var19);
                     continue label37;
                  }

                  var9 = "¿\u0007û\u0091y\u009a\u0098QèÂ:ÊK\u001e(ù9Ô\u0005L¼Ö´õ\u0010Ô;\u009dK9z0N@Ë\u001bÇò~\u0097Ý";
                  var11 = "¿\u0007û\u0091y\u009a\u0098QèÂ:ÊK\u001e(ù9Ô\u0005L¼Ö´õ\u0010Ô;\u009dK9z0N@Ë\u001bÇò~\u0097Ý".length();
                  var8 = 24;
                  var19 = -1;
            }

            var20 = var9.substring(++var19, var19 + var8);
            var10001 = 0;
         }
      }
   }

   public static String p(Object[] var0) {
      String var1 = (String)var0[0];
      return (String)D.get(var1);
   }

   public static File C(Object[] param0) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 1
      // 12: pop
      // 13: getstatic com/zelix/lr.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -3775726299875932597
      // 1c: lload 1
      // 1d: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: sipush 19294
      // 25: ldc2_w 2790467950609733561
      // 28: lload 1
      // 29: lxor
      // 2a: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: sipush 5458
      // 32: ldc2_w 2303324321380616631
      // 35: lload 1
      // 36: lxor
      // 37: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/lr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: ldc2_w -4007407037353971794
      // 3f: lload 1
      // 40: invokedynamic j (JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: ldc2_w -3255397003510624957
      // 48: lload 1
      // 49: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: astore 5
      // 50: astore 4
      // 52: aload 5
      // 54: aload 4
      // 56: ifnonnull 97
      // 59: ldc2_w -2960837969734343369
      // 5c: lload 1
      // 5d: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: aload 3
      // 63: ifnull 95
      // 66: goto 73
      // 69: ldc2_w -3720410819397798337
      // 6c: lload 1
      // 6d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: getstatic com/zelix/lr.D Ljava/util/Map;
      // 76: aload 5
      // 78: ldc2_w -3149594994348155831
      // 7b: lload 1
      // 7c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: aload 3
      // 82: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 87: pop
      // 88: goto 95
      // 8b: ldc2_w -3720410819397798337
      // 8e: lload 1
      // 8f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 5
      // 97: areturn
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1486;
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
            throw new RuntimeException("com/zelix/lr", var10);
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
         throw new RuntimeException("com/zelix/lr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
