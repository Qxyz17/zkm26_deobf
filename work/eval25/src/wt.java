package com.zelix;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wt {
   private List a;
   private boolean c;
   private String k;
   private sg u;
   private static final long b = ess.a(3255852569234226623L, -1409657443691618880L, MethodHandles.lookup().lookupClass()).a(61780044415479L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public static boolean R(Object[] param0) {
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 1
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/wp
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/wt.b J
      // 1e: lload 1
      // 1f: lxor
      // 20: lstore 1
      // 21: ldc2_w 8223543286137579420
      // 24: lload 1
      // 25: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 3
      // 2b: bipush -1
      // 2c: invokevirtual com/zelix/wp.V (I)V
      // 2f: astore 5
      // 31: aload 4
      // 33: sipush 26935
      // 36: ldc2_w 1410678156394782574
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/wt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 43: aload 5
      // 45: ifnull f1
      // 48: ifeq f0
      // 4b: goto 58
      // 4e: ldc2_w 7499745289738979946
      // 51: lload 1
      // 52: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 4
      // 5a: invokevirtual java/lang/String.length ()I
      // 5d: aload 5
      // 5f: ifnull f1
      // 62: goto 6f
      // 65: ldc2_w 7499745289738979946
      // 68: lload 1
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: sipush 23172
      // 72: ldc2_w 7912755476510665944
      // 75: lload 1
      // 76: lxor
      // 77: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/wt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: invokevirtual java/lang/String.length ()I
      // 7f: if_icmple f0
      // 82: goto 8f
      // 85: ldc2_w 7499745289738979946
      // 88: lload 1
      // 89: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 4
      // 91: sipush 23172
      // 94: ldc2_w 7912755476510665944
      // 97: lload 1
      // 98: lxor
      // 99: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/wt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: invokevirtual java/lang/String.length ()I
      // a1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // a4: astore 6
      // a6: aload 6
      // a8: sipush 5433
      // ab: ldc2_w 1955007707303438340
      // ae: lload 1
      // af: lxor
      // b0: invokedynamic o (IJ)I bsm=com/zelix/wt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: invokevirtual java/lang/String.indexOf (I)I
      // b8: istore 7
      // ba: iload 7
      // bc: aload 5
      // be: ifnull ef
      // c1: ifle ee
      // c4: goto d1
      // c7: ldc2_w 7499745289738979946
      // ca: lload 1
      // cb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: athrow
      // d1: aload 6
      // d3: bipush 0
      // d4: iload 7
      // d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // d9: astore 8
      // db: aload 8
      // dd: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // e0: istore 9
      // e2: aload 3
      // e3: iload 9
      // e5: invokevirtual com/zelix/wp.V (I)V
      // e8: bipush 1
      // e9: ireturn
      // ea: astore 9
      // ec: bipush 0
      // ed: ireturn
      // ee: bipush 0
      // ef: ireturn
      // f0: bipush 0
      // f1: ireturn
   }

   public String U(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 27064102437658L;
      return x44.a<"h">(x44.a<"l">(this, -8739512844301015227L, var3), new Object[]{var2, var5}, -7003971341398147002L, var3);
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 64162364999912L;
      return x44.a<"m">(x44.a<"i">(this, 5582912759712165000L, var2), new Object[]{var4}, 5974410233106399750L, var2);
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 71036554327086L;
      return x44.a<"k">(x44.a<"o">(this, -5959278407433106242L, var2), new Object[]{var4}, -5727928702595081931L, var2);
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"o">(this, -2951347526548890338L, var2);
   }

   static boolean J(Object[] param0) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_8s
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/wt.b J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: lload 1
      // 1a: dup2
      // 1b: ldc2_w 28796725101129
      // 1e: lxor
      // 1f: lstore 4
      // 21: dup2
      // 22: ldc2_w 16857275276701
      // 25: lxor
      // 26: lstore 6
      // 28: pop2
      // 29: ldc2_w 3515778469612037449
      // 2c: lload 1
      // 2d: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: bipush 0
      // 33: istore 9
      // 35: astore 8
      // 37: aload 3
      // 38: ldc2_w 4017363199320368468
      // 3b: lload 1
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: lload 4
      // 43: invokestatic com/zelix/sh.Q (IJ)I
      // 46: lload 6
      // 48: dup2_x1
      // 49: pop2
      // 4a: bipush 2
      // 4b: anewarray 477
      // 4e: dup_x1
      // 4f: swap
      // 50: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 53: bipush 1
      // 54: swap
      // 55: aastore
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 3418317687776915044
      // 62: lload 1
      // 63: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: astore 10
      // 6a: aload 3
      // 6b: ldc2_w 3958818611014579186
      // 6e: lload 1
      // 6f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 79: astore 11
      // 7b: aload 11
      // 7d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 82: ifeq f2
      // 85: aload 11
      // 87: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8c: checkcast java/util/Map$Entry
      // 8f: astore 12
      // 91: aload 10
      // 93: aload 12
      // 95: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 9a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 9f: aload 8
      // a1: lload 1
      // a2: lconst_0
      // a3: lcmp
      // a4: ifle ac
      // a7: ifnull f4
      // aa: aload 8
      // ac: ifnull cd
      // af: goto bc
      // b2: ldc2_w 3080772703062018239
      // b5: lload 1
      // b6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: ifne da
      // bf: goto cc
      // c2: ldc2_w 3080772703062018239
      // c5: lload 1
      // c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: athrow
      // cc: bipush 1
      // cd: istore 9
      // cf: aload 8
      // d1: lload 1
      // d2: lconst_0
      // d3: lcmp
      // d4: ifle dc
      // d7: ifnonnull f2
      // da: aload 8
      // dc: ifnonnull 7b
      // df: lload 1
      // e0: lconst_0
      // e1: lcmp
      // e2: ifle 91
      // e5: goto f2
      // e8: ldc2_w 3080772703062018239
      // eb: lload 1
      // ec: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: athrow
      // f2: iload 9
      // f4: ireturn
   }

   public wt(ZipFile param1, ZipEntry param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/wt.b J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 114729126128071
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 72428396262772
      // 012: lxor
      // 013: dup2
      // 014: bipush 48
      // 016: lushr
      // 017: l2i
      // 018: istore 7
      // 01a: dup2
      // 01b: bipush 16
      // 01d: lshl
      // 01e: bipush 48
      // 020: lushr
      // 021: l2i
      // 022: istore 8
      // 024: dup2
      // 025: bipush 32
      // 027: lshl
      // 028: bipush 32
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 9
      // 02e: pop2
      // 02f: dup2
      // 030: ldc2_w 37829451749339
      // 033: lxor
      // 034: lstore 10
      // 036: dup2
      // 037: ldc2_w 25381403668761
      // 03a: lxor
      // 03b: lstore 12
      // 03d: dup2
      // 03e: ldc2_w 30315800412663
      // 041: lxor
      // 042: lstore 14
      // 044: pop2
      // 045: aload 0
      // 046: invokespecial java/lang/Object.<init> ()V
      // 049: ldc2_w 2552563628080838383
      // 04c: lload 3
      // 04d: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: aload 0
      // 053: new java/util/ArrayList
      // 056: dup
      // 057: invokespecial java/util/ArrayList.<init> ()V
      // 05a: ldc2_w 4539616348512954490
      // 05d: lload 3
      // 05e: invokedynamic r (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aconst_null
      // 064: astore 17
      // 066: aconst_null
      // 067: astore 18
      // 069: aload 0
      // 06a: aload 1
      // 06b: ldc2_w 2836212145963252948
      // 06e: lload 3
      // 06f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: ldc2_w 4524069834444354490
      // 077: lload 3
      // 078: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: astore 16
      // 07f: aload 0
      // 080: aload 2
      // 081: ldc2_w 4132172866174090171
      // 084: lload 3
      // 085: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: aload 16
      // 08c: ifnull 0ba
      // 08f: sipush 26175
      // 092: ldc2_w 6624486788764060272
      // 095: lload 3
      // 096: lxor
      // 097: invokedynamic o (IJ)I bsm=com/zelix/wt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: if_icmpne 0bd
      // 09f: goto 0ac
      // 0a2: ldc2_w 4136292989664058137
      // 0a5: lload 3
      // 0a6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: bipush 1
      // 0ad: goto 0ba
      // 0b0: ldc2_w 4136292989664058137
      // 0b3: lload 3
      // 0b4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: goto 0be
      // 0bd: bipush 0
      // 0be: ldc2_w 2402814447170267980
      // 0c1: lload 3
      // 0c2: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aload 1
      // 0c8: aload 2
      // 0c9: ldc2_w 2747035898229812938
      // 0cc: lload 3
      // 0cd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: astore 17
      // 0d4: aload 17
      // 0d6: sipush 3495
      // 0d9: ldc2_w 3897955549374573199
      // 0dc: lload 3
      // 0dd: lxor
      // 0de: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/wt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: aconst_null
      // 0e4: lload 5
      // 0e6: bipush 4
      // 0e7: anewarray 477
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 3
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 2
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 1
      // 0fb: swap
      // 0fc: aastore
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: ldc2_w 2871666983483072014
      // 105: lload 3
      // 106: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/BufferedReader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: astore 18
      // 10d: aload 0
      // 10e: new com/zelix/sg
      // 111: dup
      // 112: iload 7
      // 114: i2c
      // 115: iload 8
      // 117: i2c
      // 118: aload 18
      // 11a: iload 9
      // 11c: invokespecial com/zelix/sg.<init> (CCLjava/io/BufferedReader;I)V
      // 11f: ldc2_w 2753525594552518596
      // 122: lload 3
      // 123: invokedynamic r (Ljava/lang/Object;Lcom/zelix/sg;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: aload 0
      // 129: ldc2_w 2753525594552518596
      // 12c: lload 3
      // 12d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/sg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: lload 10
      // 134: bipush 1
      // 135: anewarray 477
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: ldc2_w 4404194406677509061
      // 144: lload 3
      // 145: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: istore 19
      // 14c: iload 19
      // 14e: ifne 1e5
      // 151: new com/zelix/sn
      // 154: dup
      // 155: aload 18
      // 157: lload 12
      // 159: invokespecial com/zelix/sn.<init> (Ljava/io/BufferedReader;J)V
      // 15c: astore 20
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 21b
      // 164: aload 16
      // 166: ifnull 21b
      // 169: aload 20
      // 16b: lload 14
      // 16d: bipush 1
      // 16e: anewarray 477
      // 171: dup_x2
      // 172: dup_x2
      // 173: pop
      // 174: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 177: bipush 0
      // 178: swap
      // 179: aastore
      // 17a: ldc2_w 2537053266471681616
      // 17d: lload 3
      // 17e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: aload 16
      // 185: ifnull 1de
      // 188: goto 195
      // 18b: ldc2_w 4136292989664058137
      // 18e: lload 3
      // 18f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: ifne 1c4
      // 198: goto 1a5
      // 19b: ldc2_w 4136292989664058137
      // 19e: lload 3
      // 19f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: ldc2_w 4539616348512954490
      // 1a9: lload 3
      // 1aa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: aload 20
      // 1b1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b6: pop
      // 1b7: goto 1c4
      // 1ba: ldc2_w 4136292989664058137
      // 1bd: lload 3
      // 1be: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 20
      // 1c6: lload 10
      // 1c8: bipush 1
      // 1c9: anewarray 477
      // 1cc: dup_x2
      // 1cd: dup_x2
      // 1ce: pop
      // 1cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d2: bipush 0
      // 1d3: swap
      // 1d4: aastore
      // 1d5: ldc2_w 4404194406677509061
      // 1d8: lload 3
      // 1d9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: istore 19
      // 1e0: aload 16
      // 1e2: ifnonnull 14c
      // 1e5: lload 3
      // 1e6: lconst_0
      // 1e7: lcmp
      // 1e8: ifle 21b
      // 1eb: lload 3
      // 1ec: lconst_0
      // 1ed: lcmp
      // 1ee: ifle 213
      // 1f1: aload 18
      // 1f3: aload 16
      // 1f5: ifnull 20a
      // 1f8: ifnull 21b
      // 1fb: goto 208
      // 1fe: ldc2_w 4136292989664058137
      // 201: lload 3
      // 202: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: aload 18
      // 20a: ldc2_w 2657940199636491202
      // 20d: lload 3
      // 20e: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: goto 2c2
      // 216: astore 19
      // 218: goto 2c2
      // 21b: lload 3
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: ifle 243
      // 221: aload 17
      // 223: aload 16
      // 225: ifnull 23a
      // 228: ifnull 2c2
      // 22b: goto 238
      // 22e: ldc2_w 4136292989664058137
      // 231: lload 3
      // 232: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: aload 17
      // 23a: ldc2_w 2509555841417796810
      // 23d: lload 3
      // 23e: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: goto 2c2
      // 246: astore 19
      // 248: goto 2c2
      // 24b: astore 21
      // 24d: lload 3
      // 24e: lconst_0
      // 24f: lcmp
      // 250: iflt 275
      // 253: aload 18
      // 255: aload 16
      // 257: ifnull 26c
      // 25a: ifnull 285
      // 25d: goto 26a
      // 260: ldc2_w 4136292989664058137
      // 263: lload 3
      // 264: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: aload 18
      // 26c: ldc2_w 2657940199636491202
      // 26f: lload 3
      // 270: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: goto 2bf
      // 278: astore 22
      // 27a: lload 3
      // 27b: lconst_0
      // 27c: lcmp
      // 27d: iflt 285
      // 280: aload 16
      // 282: ifnonnull 2bf
      // 285: lload 3
      // 286: lconst_0
      // 287: lcmp
      // 288: ifle 2ba
      // 28b: aload 17
      // 28d: aload 16
      // 28f: ifnull 2b1
      // 292: goto 29f
      // 295: ldc2_w 4136292989664058137
      // 298: lload 3
      // 299: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: athrow
      // 29f: ifnull 2bf
      // 2a2: goto 2af
      // 2a5: ldc2_w 4136292989664058137
      // 2a8: lload 3
      // 2a9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 17
      // 2b1: ldc2_w 2509555841417796810
      // 2b4: lload 3
      // 2b5: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: goto 2bf
      // 2bd: astore 22
      // 2bf: aload 21
      // 2c1: athrow
      // 2c2: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void Q(Object[] var1) {
      long var7 = (Long)var1[0];
      ZipOutputStream var2 = (ZipOutputStream)var1[1];
      Long var4 = (Long)var1[2];
      _8s var10 = (_8s)var1[3];
      _8s var9 = (_8s)var1[4];
      vm var5 = (vm)var1[5];
      boolean var3 = (Boolean)var1[6];
      _zk var6 = (_zk)var1[7];
      var7 = b ^ var7;
      long var11 = var7 ^ 106034493289658L;
      long var13 = var7 ^ 89928264818288L;
      long var15 = var7 ^ 55403663186560L;
      long var17 = var7 ^ 55403663186560L;
      long var19 = var7 ^ 42947827361627L;
      long var21 = var7 ^ 58030760440391L;
      sk var24 = new sk(var11, var2, a<"r">(13320, 845423481381691182L ^ var7), var3);
      PrintWriter var25 = new PrintWriter(
         new OutputStreamWriter(x44.a<"l">(var24, new Object[]{var21}, -1663604276295336056L, var7), a<"r">(29332, 5237252316343556528L ^ var7))
      );
      String[] var10000 = x44.a<"t">(-1197505367646012702L, var7);
      boolean var26 = x44.a<"t">(new Object[]{var13, var10}, -1627925937623182173L, var7);
      sg var10001 = x44.a<"h">(this, -1568553536567047223L, var7);
      Object[] var10011 = new Object[]{null, var25, var10, var9, var5, x44.a<"h">(this, -953173615956754505L, var7), var26, var6};
      var10011[0] = var15;
      x44.a<"l">(var10001, var10011, -591227224382344931L, var7);
      int var27 = 0;
      String[] var23 = var10000;

      label43:
      while (var27 < x44.a<"h">(this, -940433004039674761L, var7).size()) {
         sn var28 = (sn)x44.a<"h">(this, -940433004039674761L, var7).get(var27);

         try {
            Object[] var10010 = new Object[]{null, var25, var10, var9, var5, x44.a<"h">(this, -953173615956754505L, var7), var26, var6};
            var10010[0] = var17;
            x44.a<"l">(var28, var10010, -944814739116358634L, var7);
            var27++;
         } catch (NumberFormatException var30) {
            boolean var34 = false;
            throw x44.a<"t">(var30, -762783300830914796L, var7);
         }

         while (true) {
            try {
               var10000 = var23;
               if (var7 > 0L) {
                  if (var23 == null) {
                     return;
                  }

                  var10000 = var23;
               }

               if (var10000 != null) {
                  break;
               }
            } catch (NumberFormatException var29) {
               boolean var35 = false;
               throw x44.a<"t">(var29, -762783300830914796L, var7);
            }

            if (var7 >= 0L) {
               break label43;
            }
         }
      }

      x44.a<"l">(var25, -1112854711139929825L, var7);
      x44.a<"l">(var24, new Object[]{var4, var19}, -1073580306319049632L, var7);
   }

   public void h(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      Map var6 = (Map)var1[2];
      Map var5 = (Map)var1[3];
      Map var7 = (Map)var1[4];
      var3 = b ^ var3;
      long var8 = var3 ^ 35725388637204L;
      x44.a<"m">(x44.a<"i">(this, 2788358840688756544L, var3), new Object[]{var2, var6, var8, var5, var7}, 2642780353450487100L, var3);
      String[] var10000 = x44.a<"u">(2587536237321139819L, var3);
      int var11 = 0;
      String[] var10 = var10000;

      while (var11 < x44.a<"i">(this, 4502390592986589438L, var3).size()) {
         sn var12 = (sn)x44.a<"i">(this, 4502390592986589438L, var3).get(var11);
         x44.a<"m">(var12, new Object[]{var2, var6}, 4532841338705399582L, var3);
         var11++;
         if (var10 == null) {
            break;
         }
      }
   }

   static {
      long var11 = b ^ 117133946707500L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "Û#µ'x\u0099,Ëì_\u0082d:\u001eâþmOb½Nû(\u0012\u0001Z\u0097Òçé\u0017cKÇ\u0012¦/\u0099XÖ(ðPÏu\u0091[\u0000tJC¼HËþ$È0\u009eÇácØ±\u008c\u0012æ\u00989\rê\u009e\u0096\u0007fÖf\u0014D\fß\u0010î¤Â\u0098¬ñGB?\u0090Rò\u0081xâ\u008f";
      int var19 = "Û#µ'x\u0099,Ëì_\u0082d:\u001eâþmOb½Nû(\u0012\u0001Z\u0097Òçé\u0017cKÇ\u0012¦/\u0099XÖ(ðPÏu\u0091[\u0000tJC¼HËþ$È0\u009eÇácØ±\u008c\u0012æ\u00989\rê\u009e\u0096\u0007fÖf\u0014D\fß\u0010î¤Â\u0098¬ñGB?\u0090Rò\u0081xâ\u008f"
         .length();
      char var16 = '(';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     d = var20;
                     e = new String[5];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ÌÙ\u0099J-eèb\u0092áé\u00038nË|";
                     int var5 = "ÌÙ\u0099J-eèb\u0092áé\u00038nË|".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     g = var6;
                     h = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "|V\u009aÍªç4½ªè1\u000e\u0083Ê8R0¢\u0019\u0096ö\u00ad\u0089mñÏ·\u0004á!\u0093Äã+?Æ\u0006ßosOV¾ø\u0010Jn\u001c~Øp0W\u0092oª5~\u001a}\u0015g«\u00153";
                  var19 = "|V\u009aÍªç4½ªè1\u000e\u0083Ê8R0¢\u0019\u0096ö\u00ad\u0089mñÏ·\u0004á!\u0093Äã+?Æ\u0006ßosOV¾ø\u0010Jn\u001c~Øp0W\u0092oª5~\u001a}\u0015g«\u00153"
                     .length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20473;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/wt", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/wt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1181;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/wt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/wt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
