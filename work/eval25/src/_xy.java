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
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xy extends _ni implements _r4, qk, em {
   private List W;
   private boolean v;
   private String U;
   static final Map q;
   private String J;
   private String T;
   static final Set g;
   private boolean l;
   private List G;
   private static final long a = ess.a(5935597713887215332L, 1645246447383444128L, MethodHandles.lookup().lookupClass()).a(141167557145359L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private List v(Object[] param1) {
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
      // 00e: checkcast java/util/List
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/_xy.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 23103610017187
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w 5377497507544883458
      // 025: lload 3
      // 026: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 2
      // 02c: astore 8
      // 02e: istore 7
      // 030: lload 5
      // 032: bipush 1
      // 033: anewarray 423
      // 036: dup_x2
      // 037: dup_x2
      // 038: pop
      // 039: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03c: bipush 0
      // 03d: swap
      // 03e: aastore
      // 03f: ldc2_w 6172122552441494635
      // 042: lload 3
      // 043: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: astore 9
      // 04a: lload 5
      // 04c: bipush 1
      // 04d: anewarray 423
      // 050: dup_x2
      // 051: dup_x2
      // 052: pop
      // 053: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: ldc2_w 6172122552441494635
      // 05c: lload 3
      // 05d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: astore 10
      // 064: lload 5
      // 066: bipush 1
      // 067: anewarray 423
      // 06a: dup_x2
      // 06b: dup_x2
      // 06c: pop
      // 06d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 070: bipush 0
      // 071: swap
      // 072: aastore
      // 073: ldc2_w 6172122552441494635
      // 076: lload 3
      // 077: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: astore 11
      // 07e: aload 2
      // 07f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 084: astore 12
      // 086: aload 12
      // 088: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08d: ifeq 177
      // 090: aload 12
      // 092: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 097: checkcast java/lang/String
      // 09a: astore 13
      // 09c: ldc2_w 6068186083556944206
      // 09f: lload 3
      // 0a0: invokedynamic k (JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 13
      // 0a7: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0ac: iload 7
      // 0ae: lload 3
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: iflt 185
      // 0b4: ifeq 184
      // 0b7: iload 7
      // 0b9: lload 3
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 126
      // 0bf: ifeq 124
      // 0c2: goto 0cf
      // 0c5: ldc2_w 5969079374921419461
      // 0c8: lload 3
      // 0c9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: lload 3
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: ifle 117
      // 0d5: ifeq 107
      // 0d8: goto 0e5
      // 0db: ldc2_w 5969079374921419461
      // 0de: lload 3
      // 0df: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 9
      // 0e7: aload 13
      // 0e9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ee: pop
      // 0ef: iload 7
      // 0f1: lload 3
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: iflt 174
      // 0f7: ifne 172
      // 0fa: goto 107
      // 0fd: ldc2_w 5969079374921419461
      // 100: lload 3
      // 101: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: ldc2_w 6033070911305818630
      // 10a: lload 3
      // 10b: invokedynamic k (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 13
      // 112: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 117: goto 124
      // 11a: ldc2_w 5969079374921419461
      // 11d: lload 3
      // 11e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: iload 7
      // 126: ifeq 171
      // 129: ifeq 15b
      // 12c: goto 139
      // 12f: ldc2_w 5969079374921419461
      // 132: lload 3
      // 133: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: aload 10
      // 13b: aload 13
      // 13d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 142: pop
      // 143: iload 7
      // 145: lload 3
      // 146: lconst_0
      // 147: lcmp
      // 148: ifle 174
      // 14b: ifne 172
      // 14e: goto 15b
      // 151: ldc2_w 5969079374921419461
      // 154: lload 3
      // 155: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: aload 11
      // 15d: aload 13
      // 15f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 164: goto 171
      // 167: ldc2_w 5969079374921419461
      // 16a: lload 3
      // 16b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: pop
      // 172: iload 7
      // 174: ifne 086
      // 177: aload 9
      // 179: lload 3
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: ifle 097
      // 17f: invokeinterface java/util/Set.size ()I 1
      // 184: bipush 1
      // 185: if_icmple 2f2
      // 188: new java/util/ArrayList
      // 18b: dup
      // 18c: invokespecial java/util/ArrayList.<init> ()V
      // 18f: astore 8
      // 191: ldc2_w 6068186083556944206
      // 194: lload 3
      // 195: invokedynamic k (JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 19f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1a4: astore 12
      // 1a6: aload 12
      // 1a8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ad: ifeq 24e
      // 1b0: aload 12
      // 1b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b7: checkcast java/lang/String
      // 1ba: astore 13
      // 1bc: aload 9
      // 1be: iload 7
      // 1c0: ifeq 20f
      // 1c3: aload 13
      // 1c5: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 1ca: iload 7
      // 1cc: ifeq 264
      // 1cf: goto 1dc
      // 1d2: ldc2_w 5969079374921419461
      // 1d5: lload 3
      // 1d6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: lload 3
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: ifle 24b
      // 1e2: ifne 249
      // 1e5: goto 1f2
      // 1e8: ldc2_w 5969079374921419461
      // 1eb: lload 3
      // 1ec: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: ldc2_w 6068186083556944206
      // 1f5: lload 3
      // 1f6: invokedynamic k (JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: aload 13
      // 1fd: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 202: goto 20f
      // 205: ldc2_w 5969079374921419461
      // 208: lload 3
      // 209: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: checkcast java/lang/String
      // 212: astore 14
      // 214: aload 10
      // 216: aload 14
      // 218: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 21d: iload 7
      // 21f: ifeq 248
      // 222: ifne 249
      // 225: goto 232
      // 228: ldc2_w 5969079374921419461
      // 22b: lload 3
      // 22c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: aload 8
      // 234: aload 14
      // 236: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 23b: goto 248
      // 23e: ldc2_w 5969079374921419461
      // 241: lload 3
      // 242: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: athrow
      // 248: pop
      // 249: iload 7
      // 24b: ifne 1a6
      // 24e: aload 10
      // 250: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 255: lload 3
      // 256: lconst_0
      // 257: lcmp
      // 258: iflt 1b7
      // 25b: astore 12
      // 25d: aload 12
      // 25f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 264: ifeq 2a0
      // 267: aload 12
      // 269: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26e: checkcast java/lang/String
      // 271: astore 13
      // 273: aload 8
      // 275: aload 13
      // 277: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27c: pop
      // 27d: iload 7
      // 27f: lload 3
      // 280: lconst_0
      // 281: lcmp
      // 282: iflt 2b6
      // 285: ifeq 2a9
      // 288: iload 7
      // 28a: ifne 25d
      // 28d: lload 3
      // 28e: lconst_0
      // 28f: lcmp
      // 290: ifle 2a0
      // 293: goto 2a0
      // 296: ldc2_w 5969079374921419461
      // 299: lload 3
      // 29a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: aload 11
      // 2a2: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2a7: astore 12
      // 2a9: aload 12
      // 2ab: lload 3
      // 2ac: lconst_0
      // 2ad: lcmp
      // 2ae: iflt 2c0
      // 2b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b6: ifeq 2f2
      // 2b9: aload 12
      // 2bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c0: checkcast java/lang/String
      // 2c3: astore 13
      // 2c5: lload 3
      // 2c6: lconst_0
      // 2c7: lcmp
      // 2c8: ifle 2da
      // 2cb: aload 8
      // 2cd: iload 7
      // 2cf: ifeq 2f4
      // 2d2: aload 13
      // 2d4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d9: pop
      // 2da: iload 7
      // 2dc: ifne 2a9
      // 2df: lload 3
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: iflt 2f2
      // 2e5: goto 2f2
      // 2e8: ldc2_w 5969079374921419461
      // 2eb: lload 3
      // 2ec: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: aload 8
      // 2f4: areturn
   }

   public void J(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"r">(this, var4, 3298279462935861746L, var2);
   }

   public void g(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      x44.a<"t">(this, var4, 4963604663982481789L, var2);
   }

   public void N(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"i">(this, 2899458759769312412L, var3).add(var2);
   }

   void T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"u">(this, true, 3090591148680520409L, var2);
   }

   public _xy(long var1, short var3, int var4) {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 19847035017623L;
      super(var7, var4);
      x44.a<"u">(this, false, -6943478354112997479L, var5);
      x44.a<"u">(this, false, -9066208153397213915L, var5);
      x44.a<"u">(this, new ArrayList(), -7208077160618688681L, var5);
   }

   public final void K(Object[] param1) {
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
      // 00f: checkcast com/zelix/az
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_uu
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 0
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 101216835141935
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 55341335493209
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 90893231976505
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 26606550269691
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 14358101427423
      // 044: lxor
      // 045: lstore 16
      // 047: dup2
      // 048: ldc2_w 96307020250972
      // 04b: lxor
      // 04c: lstore 18
      // 04e: dup2
      // 04f: ldc2_w 109690681948621
      // 052: lxor
      // 053: lstore 20
      // 055: dup2
      // 056: ldc2_w 19174558802632
      // 059: lxor
      // 05a: lstore 22
      // 05c: dup2
      // 05d: ldc2_w 12703793543226
      // 060: lxor
      // 061: lstore 24
      // 063: dup2
      // 064: ldc2_w 89968223186826
      // 067: lxor
      // 068: lstore 26
      // 06a: pop2
      // 06b: ldc2_w 3018414783042270147
      // 06e: lload 4
      // 070: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: bipush 0
      // 076: istore 29
      // 078: istore 28
      // 07a: iload 29
      // 07c: aload 0
      // 07d: lload 8
      // 07f: bipush 1
      // 080: anewarray 423
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w 3459742712771822671
      // 08f: lload 4
      // 091: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: if_icmpge 10b
      // 099: aload 0
      // 09a: iload 29
      // 09c: lload 26
      // 09e: bipush 2
      // 09f: anewarray 423
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w 3156618655040194173
      // 0b6: lload 4
      // 0b8: lload 4
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 0e9
      // 0bf: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: iload 28
      // 0c6: ifne 125
      // 0c9: lload 6
      // 0cb: aload 0
      // 0cc: aload 2
      // 0cd: bipush 3
      // 0ce: anewarray 423
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 2
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: ldc2_w 3570806773825883371
      // 0e7: lload 4
      // 0e9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: iinc 29 1
      // 0f1: iload 28
      // 0f3: ifeq 07a
      // 0f6: lload 4
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 099
      // 0fd: goto 10b
      // 100: ldc2_w 3527222682346924256
      // 103: lload 4
      // 105: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 0
      // 10c: lload 24
      // 10e: bipush 1
      // 10f: anewarray 423
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w 3905488149096465397
      // 11e: lload 4
      // 120: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: checkcast com/zelix/_q4
      // 128: astore 29
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: astore 30
      // 133: aload 0
      // 134: iload 28
      // 136: ifne 1f1
      // 139: ldc2_w 3830416900365141774
      // 13c: lload 4
      // 13e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: ifnull 1b9
      // 146: goto 154
      // 149: ldc2_w 3527222682346924256
      // 14c: lload 4
      // 14e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: aload 30
      // 156: sipush 19739
      // 159: ldc2_w 3861560377648270906
      // 15c: lload 4
      // 15e: lxor
      // 15f: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 167: pop
      // 168: aload 30
      // 16a: aload 0
      // 16b: ldc2_w 3830416900365141774
      // 16e: lload 4
      // 170: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: lload 14
      // 177: bipush 2
      // 178: anewarray 423
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w 3094218454377848937
      // 18c: lload 4
      // 18e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: pop
      // 197: aload 30
      // 199: sipush 23907
      // 19c: ldc2_w 9037155790051958339
      // 19f: lload 4
      // 1a1: lxor
      // 1a2: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1aa: pop
      // 1ab: goto 1b9
      // 1ae: ldc2_w 3527222682346924256
      // 1b1: lload 4
      // 1b3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: aload 0
      // 1bb: aload 0
      // 1bc: ldc2_w 3280524171671357734
      // 1bf: lload 4
      // 1c1: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: lload 10
      // 1c8: dup2_x1
      // 1c9: pop2
      // 1ca: bipush 2
      // 1cb: anewarray 423
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
      // 1dc: ldc2_w 3593156235878834117
      // 1df: lload 4
      // 1e1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: ldc2_w 3280524171671357734
      // 1e9: lload 4
      // 1eb: invokedynamic t (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: aload 0
      // 1f1: ldc2_w 3280524171671357734
      // 1f4: lload 4
      // 1f6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 200: astore 31
      // 202: aload 31
      // 204: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 209: ifeq 25a
      // 20c: aload 31
      // 20e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 213: checkcast java/lang/String
      // 216: astore 32
      // 218: aload 30
      // 21a: aload 32
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: pop
      // 220: aload 30
      // 222: sipush 25907
      // 225: ldc2_w 2178666310751938065
      // 228: lload 4
      // 22a: lxor
      // 22b: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 233: pop
      // 234: iload 28
      // 236: lload 4
      // 238: lconst_0
      // 239: lcmp
      // 23a: ifle 242
      // 23d: ifne 395
      // 240: iload 28
      // 242: ifeq 202
      // 245: lload 4
      // 247: lconst_0
      // 248: lcmp
      // 249: ifle 234
      // 24c: goto 25a
      // 24f: ldc2_w 3527222682346924256
      // 252: lload 4
      // 254: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 0
      // 25b: iload 28
      // 25d: ifne 396
      // 260: ldc2_w 3619633876234667532
      // 263: lload 4
      // 265: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: ifnull 395
      // 26d: goto 27b
      // 270: ldc2_w 3527222682346924256
      // 273: lload 4
      // 275: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: aload 0
      // 27c: ldc2_w 3619633876234667532
      // 27f: lload 4
      // 281: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: ldc "*"
      // 288: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 28b: iload 28
      // 28d: ifne 3a0
      // 290: goto 29e
      // 293: ldc2_w 3527222682346924256
      // 296: lload 4
      // 298: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: bipush -1
      // 29f: if_icmpne 395
      // 2a2: goto 2b0
      // 2a5: ldc2_w 3527222682346924256
      // 2a8: lload 4
      // 2aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: athrow
      // 2b0: aload 0
      // 2b1: ldc2_w 3619633876234667532
      // 2b4: lload 4
      // 2b6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: ldc "?"
      // 2bd: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2c0: iload 28
      // 2c2: ifne 3a0
      // 2c5: goto 2d3
      // 2c8: ldc2_w 3527222682346924256
      // 2cb: lload 4
      // 2cd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: athrow
      // 2d3: bipush -1
      // 2d4: if_icmpne 395
      // 2d7: goto 2e5
      // 2da: ldc2_w 3527222682346924256
      // 2dd: lload 4
      // 2df: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: athrow
      // 2e5: aload 0
      // 2e6: ldc2_w 3619633876234667532
      // 2e9: lload 4
      // 2eb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: ldc "%"
      // 2f2: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2f5: iload 28
      // 2f7: ifne 3a0
      // 2fa: goto 308
      // 2fd: ldc2_w 3527222682346924256
      // 300: lload 4
      // 302: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: bipush -1
      // 309: if_icmpne 395
      // 30c: goto 31a
      // 30f: ldc2_w 3527222682346924256
      // 312: lload 4
      // 314: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: athrow
      // 31a: aload 0
      // 31b: ldc2_w 3619633876234667532
      // 31e: lload 4
      // 320: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 325: sipush 18330
      // 328: ldc2_w 1562474373615699134
      // 32b: lload 4
      // 32d: lxor
      // 32e: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual java/lang/String.indexOf (I)I
      // 336: lload 4
      // 338: lconst_0
      // 339: lcmp
      // 33a: iflt 3a0
      // 33d: iload 28
      // 33f: ifne 3a0
      // 342: goto 350
      // 345: ldc2_w 3527222682346924256
      // 348: lload 4
      // 34a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34f: athrow
      // 350: bipush -1
      // 351: if_icmpne 395
      // 354: goto 362
      // 357: ldc2_w 3527222682346924256
      // 35a: lload 4
      // 35c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 30
      // 364: aload 0
      // 365: ldc2_w 3619633876234667532
      // 368: lload 4
      // 36a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 372: pop
      // 373: aload 30
      // 375: sipush 25907
      // 378: ldc2_w 2178666310751938065
      // 37b: lload 4
      // 37d: lxor
      // 37e: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 386: pop
      // 387: goto 395
      // 38a: ldc2_w 3527222682346924256
      // 38d: lload 4
      // 38f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: athrow
      // 395: aload 0
      // 396: ldc2_w 3013691418985210344
      // 399: lload 4
      // 39b: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a0: lload 4
      // 3a2: lconst_0
      // 3a3: lcmp
      // 3a4: iflt 3db
      // 3a7: ifeq 3f3
      // 3aa: aload 30
      // 3ac: aload 0
      // 3ad: ldc2_w 3479726563516388821
      // 3b0: lload 4
      // 3b2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b7: lload 16
      // 3b9: bipush 2
      // 3ba: anewarray 423
      // 3bd: dup_x2
      // 3be: dup_x2
      // 3bf: pop
      // 3c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c3: bipush 1
      // 3c4: swap
      // 3c5: aastore
      // 3c6: dup_x1
      // 3c7: swap
      // 3c8: bipush 0
      // 3c9: swap
      // 3ca: aastore
      // 3cb: ldc2_w 3944488288494908722
      // 3ce: lload 4
      // 3d0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d8: pop
      // 3d9: iload 28
      // 3db: lload 4
      // 3dd: lconst_0
      // 3de: lcmp
      // 3df: iflt 43d
      // 3e2: ifeq 432
      // 3e5: goto 3f3
      // 3e8: ldc2_w 3527222682346924256
      // 3eb: lload 4
      // 3ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: athrow
      // 3f3: aload 30
      // 3f5: aload 0
      // 3f6: ldc2_w 3479726563516388821
      // 3f9: lload 4
      // 3fb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 400: lload 20
      // 402: dup2_x1
      // 403: pop2
      // 404: bipush 2
      // 405: anewarray 423
      // 408: dup_x1
      // 409: swap
      // 40a: bipush 1
      // 40b: swap
      // 40c: aastore
      // 40d: dup_x2
      // 40e: dup_x2
      // 40f: pop
      // 410: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 413: bipush 0
      // 414: swap
      // 415: aastore
      // 416: ldc2_w 3755795413895025579
      // 419: lload 4
      // 41b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 423: pop
      // 424: goto 432
      // 427: ldc2_w 3527222682346924256
      // 42a: lload 4
      // 42c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 431: athrow
      // 432: aload 0
      // 433: ldc2_w 3013691418985210344
      // 436: lload 4
      // 438: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43d: iload 28
      // 43f: lload 4
      // 441: lconst_0
      // 442: lcmp
      // 443: ifle 49c
      // 446: ifne 49a
      // 449: ifeq 48f
      // 44c: goto 45a
      // 44f: ldc2_w 3527222682346924256
      // 452: lload 4
      // 454: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: athrow
      // 45a: aload 29
      // 45c: aload 30
      // 45e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 461: lload 18
      // 463: dup2_x1
      // 464: pop2
      // 465: bipush 2
      // 466: anewarray 423
      // 469: dup_x1
      // 46a: swap
      // 46b: bipush 1
      // 46c: swap
      // 46d: aastore
      // 46e: dup_x2
      // 46f: dup_x2
      // 470: pop
      // 471: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 474: bipush 0
      // 475: swap
      // 476: aastore
      // 477: ldc2_w 3552808675083817346
      // 47a: lload 4
      // 47c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: goto 48f
      // 484: ldc2_w 3527222682346924256
      // 487: lload 4
      // 489: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: athrow
      // 48f: aload 0
      // 490: ldc2_w 3773837135861838676
      // 493: lload 4
      // 495: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49a: iload 28
      // 49c: ifne 4d3
      // 49f: ifeq 5dc
      // 4a2: goto 4b0
      // 4a5: ldc2_w 3527222682346924256
      // 4a8: lload 4
      // 4aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4af: athrow
      // 4b0: aload 30
      // 4b2: sipush 8250
      // 4b5: ldc2_w 6135209230891918111
      // 4b8: lload 4
      // 4ba: lxor
      // 4bb: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4c3: pop
      // 4c4: bipush 0
      // 4c5: goto 4d3
      // 4c8: ldc2_w 3527222682346924256
      // 4cb: lload 4
      // 4cd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d2: athrow
      // 4d3: istore 31
      // 4d5: iload 31
      // 4d7: aload 0
      // 4d8: ldc2_w 3368440363873564746
      // 4db: lload 4
      // 4dd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: invokeinterface java/util/List.size ()I 1
      // 4e7: if_icmpge 59a
      // 4ea: aload 30
      // 4ec: aload 0
      // 4ed: ldc2_w 3368440363873564746
      // 4f0: lload 4
      // 4f2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: iload 31
      // 4f9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4fe: lload 12
      // 500: dup2_x1
      // 501: pop2
      // 502: checkcast java/lang/String
      // 505: bipush 2
      // 506: anewarray 423
      // 509: dup_x1
      // 50a: swap
      // 50b: bipush 1
      // 50c: swap
      // 50d: aastore
      // 50e: dup_x2
      // 50f: dup_x2
      // 510: pop
      // 511: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 514: bipush 0
      // 515: swap
      // 516: aastore
      // 517: ldc2_w 3850895450834734603
      // 51a: lload 4
      // 51c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 521: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 524: pop
      // 525: iload 28
      // 527: lload 4
      // 529: lconst_0
      // 52a: lcmp
      // 52b: iflt 533
      // 52e: ifne 5b5
      // 531: iload 28
      // 533: lload 4
      // 535: lconst_0
      // 536: lcmp
      // 537: iflt 597
      // 53a: ifne 595
      // 53d: goto 54b
      // 540: ldc2_w 3527222682346924256
      // 543: lload 4
      // 545: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54a: athrow
      // 54b: iload 31
      // 54d: aload 0
      // 54e: ldc2_w 3368440363873564746
      // 551: lload 4
      // 553: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 558: invokeinterface java/util/List.size ()I 1
      // 55d: bipush 1
      // 55e: isub
      // 55f: if_icmpge 592
      // 562: goto 570
      // 565: ldc2_w 3527222682346924256
      // 568: lload 4
      // 56a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56f: athrow
      // 570: aload 30
      // 572: sipush 16069
      // 575: ldc2_w 7778767075098050018
      // 578: lload 4
      // 57a: lxor
      // 57b: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 580: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 583: pop
      // 584: goto 592
      // 587: ldc2_w 3527222682346924256
      // 58a: lload 4
      // 58c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 591: athrow
      // 592: iinc 31 1
      // 595: iload 28
      // 597: ifeq 4d5
      // 59a: aload 30
      // 59c: sipush 1375
      // 59f: ldc2_w 7531909299406702204
      // 5a2: lload 4
      // 5a4: lxor
      // 5a5: invokedynamic c (IJ)I bsm=com/zelix/_xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 5ad: pop
      // 5ae: lload 4
      // 5b0: lconst_0
      // 5b1: lcmp
      // 5b2: ifle 525
      // 5b5: aload 29
      // 5b7: aload 30
      // 5b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5bc: lload 22
      // 5be: dup2_x1
      // 5bf: pop2
      // 5c0: bipush 2
      // 5c1: anewarray 423
      // 5c4: dup_x1
      // 5c5: swap
      // 5c6: bipush 1
      // 5c7: swap
      // 5c8: aastore
      // 5c9: dup_x2
      // 5ca: dup_x2
      // 5cb: pop
      // 5cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5cf: bipush 0
      // 5d0: swap
      // 5d1: aastore
      // 5d2: ldc2_w 3332591981530933101
      // 5d5: lload 4
      // 5d7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5dc: return
   }

   public void I(Object[] var1) {
      long var3 = (Long)var1[0];
      List var2 = (List)var1[1];
      var3 = a ^ var3;
      x44.a<"r">(this, var2, -8335751325848053084L, var3);
   }

   void u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"t">(this, true, -205101598673847764L, var2);
   }

   public void B(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"v">(this, var4, -6018488578966462884L, var2);
   }

   static {
      long var20 = a ^ 27583277720668L;
      long var22 = var20 ^ 69825393983443L;
      long var24 = var20 ^ 19468929413170L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[12];
      int var17 = 0;
      String var16 = "\u009d\u0090ëY\"ú@\u0019\u0012æÒü4V^8\u0010¯¤\u0004R?\u0006Üñ ¹Ù\rAÑ\u001a\f\u0010ÆèàR\u0083?®\u000b\u0094ù\u000eÎ\u0099\u009f£\u009c\bÔ§-±IÇSÓ\u0010\u009d\u0090ëY\"ú@\u0019\u0012æÒü4V^8\u0010¯¤\u0004R?\u0006Üñ ¹Ù\rAÑ\u001a\f\bPî4û%¬\u0081½\u0010\u0083´\u001dMuÛ\u009d+r~ª¾<.×\u0004\bôH¶Ã o)ì\b/r\u009aµ×Â#k";
      int var18 = "\u009d\u0090ëY\"ú@\u0019\u0012æÒü4V^8\u0010¯¤\u0004R?\u0006Üñ ¹Ù\rAÑ\u001a\f\u0010ÆèàR\u0083?®\u000b\u0094ù\u000eÎ\u0099\u009f£\u009c\bÔ§-±IÇSÓ\u0010\u009d\u0090ëY\"ú@\u0019\u0012æÒü4V^8\u0010¯¤\u0004R?\u0006Üñ ¹Ù\rAÑ\u001a\f\bPî4û%¬\u0081½\u0010\u0083´\u001dMuÛ\u009d+r~ª¾<.×\u0004\bôH¶Ã o)ì\b/r\u009aµ×Â#k"
         .length();
      char var15 = 16;
      int var28 = -1;

      label54:
      while (true) {
         String var29 = var16.substring(++var28, var28 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var29.getBytes("ISO-8859-1"));
            String var40 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var40;
                  if ((var28 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "P\u00adß÷Cº\u0098àu\u0012\u0010©\u0004â½CÝ5\u00975ã\u001aDÙ\u0091GIÁ\u0093¤8\u0016ø\f\u0082\t±S1\u0093";
                     int var5 = "P\u00adß÷Cº\u0098àu\u0012\u0010©\u0004â½CÝ5\u00975ã\u001aDÙ\u0091GIÁ\u0093¤8\u0016ø\f\u0082\t±S1\u0093".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var32 = var6;
                        var10001 = var3++;
                        long var44 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var8 = var44;
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
                           long var49 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var47) {
                              case 0:
                                 var32[var10001] = var49;
                                 if (var2 >= var5) {
                                    b = var6;
                                    c = new Integer[7];
                                    q = x44.a<"s">(new Object[]{var22}, -5607103478086937536L, var20);
                                    g = x44.a<"s">(new Object[]{var24}, -5749183069989160454L, var20);
                                    x44.a<"j">(-5645398882896999201L, var20).put(var11[8], var11[11]);
                                    x44.a<"j">(-5645398882896999201L, var20).put(var11[2], var11[1]);
                                    x44.a<"j">(-5645398882896999201L, var20).put(var11[6], var11[4]);
                                    x44.a<"j">(-5645398882896999201L, var20).put(var11[3], var11[10]);
                                    x44.a<"j">(-5320788895585482857L, var20).add(var11[9]);
                                    x44.a<"j">(-5320788895585482857L, var20).add(var11[5]);
                                    x44.a<"j">(-5320788895585482857L, var20).add(var11[0]);
                                    x44.a<"j">(-5320788895585482857L, var20).add(var11[7]);
                                    return;
                                 }
                                 break;
                              default:
                                 var32[var10001] = var49;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u001f\u0084û¨\u0016H\u001dkV56ß\u0090ÒÆY";
                                 var5 = "\u001f\u0084û¨\u0016H\u001dkV56ß\u0090ÒÆY".length();
                                 var2 = 0;
                           }

                           byte var38 = var2;
                           var2 += 8;
                           var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                           var32 = var6;
                           var10001 = var3++;
                           var44 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var28);
                  break;
               default:
                  var11[var17++] = var40;
                  if ((var28 += var15) < var18) {
                     var15 = var16.charAt(var28);
                     continue label54;
                  }

                  var16 = "\u0083´\u001dMuÛ\u009d+r~ª¾<.×\u0004\b/r\u009aµ×Â#k";
                  var18 = "\u0083´\u001dMuÛ\u009d+r~ª¾<.×\u0004\b/r\u009aµ×Â#k".length();
                  var15 = 16;
                  var28 = -1;
            }

            var29 = var16.substring(++var28, var28 + var15);
            var10001 = 0;
         }
      }
   }

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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14517;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_xy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/_xy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
