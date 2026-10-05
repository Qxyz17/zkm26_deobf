package com.zelix;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.FileSystem;
import java.nio.file.ProviderNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class po extends ps {
   private FileSystem f;
   private boolean D;
   private Integer e;
   private boolean w;
   private static final String Y;
   private qx G;
   private w L;
   static String M;
   private boolean m;
   private String C;
   private static final long a = ess.a(-6275227697104149070L, -7062820905991360340L, MethodHandles.lookup().lookupClass()).a(69442901394186L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public static boolean N(Object[] param0) {
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
      // 00b: checkcast java/io/File
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 6
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/pg
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/_zk
      // 028: astore 1
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast com/zelix/pg
      // 02f: astore 4
      // 031: pop
      // 032: getstatic com/zelix/po.a J
      // 035: lload 6
      // 037: lxor
      // 038: lstore 6
      // 03a: lload 6
      // 03c: dup2
      // 03d: ldc2_w 117701535329148
      // 040: lxor
      // 041: lstore 8
      // 043: dup2
      // 044: ldc2_w 46484018817227
      // 047: lxor
      // 048: lstore 10
      // 04a: dup2
      // 04b: ldc2_w 1508242332963
      // 04e: lxor
      // 04f: lstore 12
      // 051: dup2
      // 052: ldc2_w 112422014910162
      // 055: lxor
      // 056: lstore 14
      // 058: dup2
      // 059: ldc2_w 130408142167120
      // 05c: lxor
      // 05d: lstore 16
      // 05f: pop2
      // 060: lload 12
      // 062: bipush 1
      // 063: anewarray 656
      // 066: dup_x2
      // 067: dup_x2
      // 068: pop
      // 069: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w 2100890324640175339
      // 072: lload 6
      // 074: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: astore 19
      // 07b: ldc2_w 1749221027545318494
      // 07e: lload 6
      // 080: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 2
      // 086: aload 19
      // 088: lload 8
      // 08a: aload 3
      // 08b: aload 1
      // 08c: bipush 5
      // 08d: anewarray 656
      // 090: dup_x1
      // 091: swap
      // 092: bipush 4
      // 093: swap
      // 094: aastore
      // 095: dup_x1
      // 096: swap
      // 097: bipush 3
      // 098: swap
      // 099: aastore
      // 09a: dup_x2
      // 09b: dup_x2
      // 09c: pop
      // 09d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a0: bipush 2
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: bipush 1
      // 0a6: swap
      // 0a7: aastore
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w 76114237876930743
      // 0b0: lload 6
      // 0b2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: astore 20
      // 0b9: astore 18
      // 0bb: new java/lang/StringBuilder
      // 0be: dup
      // 0bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c2: astore 21
      // 0c4: bipush 0
      // 0c5: istore 22
      // 0c7: iload 22
      // 0c9: aload 20
      // 0cb: invokeinterface java/util/List.size ()I 1
      // 0d0: if_icmpge 213
      // 0d3: aload 20
      // 0d5: iload 22
      // 0d7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0dc: astore 23
      // 0de: bipush 0
      // 0df: istore 24
      // 0e1: aload 23
      // 0e3: aload 18
      // 0e5: ifnonnull 151
      // 0e8: instanceof java/io/File
      // 0eb: aload 18
      // 0ed: ifnonnull 21b
      // 0f0: goto 0fe
      // 0f3: ldc2_w 2172714690741900383
      // 0f6: lload 6
      // 0f8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: ifeq 13a
      // 101: goto 10f
      // 104: ldc2_w 2172714690741900383
      // 107: lload 6
      // 109: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 21
      // 111: aload 20
      // 113: iload 22
      // 115: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11a: checkcast java/io/File
      // 11d: ldc2_w 2041003783847892048
      // 120: lload 6
      // 122: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12a: pop
      // 12b: bipush 1
      // 12c: lload 6
      // 12e: lconst_0
      // 12f: lcmp
      // 130: iflt 1b4
      // 133: istore 24
      // 135: aload 18
      // 137: ifnull 1b2
      // 13a: aload 20
      // 13c: iload 22
      // 13e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 143: goto 151
      // 146: ldc2_w 2172714690741900383
      // 149: lload 6
      // 14b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: checkcast com/zelix/_ux
      // 154: astore 25
      // 156: aload 25
      // 158: ldc2_w 523459101265909901
      // 15b: lload 6
      // 15d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: lload 10
      // 164: bipush 2
      // 165: anewarray 656
      // 168: dup_x2
      // 169: dup_x2
      // 16a: pop
      // 16b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16e: bipush 1
      // 16f: swap
      // 170: aastore
      // 171: dup_x1
      // 172: swap
      // 173: bipush 0
      // 174: swap
      // 175: aastore
      // 176: ldc2_w 536580375126524270
      // 179: lload 6
      // 17b: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: aload 18
      // 182: lload 6
      // 184: lconst_0
      // 185: lcmp
      // 186: ifle 1bf
      // 189: ifnonnull 1b6
      // 18c: ifne 1b2
      // 18f: goto 19d
      // 192: ldc2_w 2172714690741900383
      // 195: lload 6
      // 197: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 21
      // 19f: aload 25
      // 1a1: ldc2_w 523459101265909901
      // 1a4: lload 6
      // 1a6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ae: pop
      // 1af: bipush 1
      // 1b0: istore 24
      // 1b2: iload 22
      // 1b4: bipush 1
      // 1b5: iadd
      // 1b6: lload 6
      // 1b8: lconst_0
      // 1b9: lcmp
      // 1ba: iflt 1ea
      // 1bd: aload 18
      // 1bf: ifnonnull 1ea
      // 1c2: aload 20
      // 1c4: invokeinterface java/util/List.size ()I 1
      // 1c9: if_icmpge 20b
      // 1cc: goto 1da
      // 1cf: ldc2_w 2172714690741900383
      // 1d2: lload 6
      // 1d4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: iload 24
      // 1dc: goto 1ea
      // 1df: ldc2_w 2172714690741900383
      // 1e2: lload 6
      // 1e4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: ifeq 20b
      // 1ed: aload 21
      // 1ef: ldc2_w 267361740538778297
      // 1f2: lload 6
      // 1f4: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: pop
      // 1fd: goto 20b
      // 200: ldc2_w 2172714690741900383
      // 203: lload 6
      // 205: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: iinc 22 1
      // 20e: aload 18
      // 210: ifnull 0c7
      // 213: lload 6
      // 215: lconst_0
      // 216: lcmp
      // 217: ifle 21d
      // 21a: bipush 0
      // 21b: istore 22
      // 21d: iload 22
      // 21f: aload 20
      // 221: invokeinterface java/util/List.size ()I 1
      // 226: if_icmpge 29e
      // 229: aload 20
      // 22b: iload 22
      // 22d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 232: astore 23
      // 234: aload 18
      // 236: lload 6
      // 238: lconst_0
      // 239: lcmp
      // 23a: iflt 29b
      // 23d: ifnonnull 299
      // 240: aload 23
      // 242: instanceof com/zelix/_ux
      // 245: aload 18
      // 247: lload 6
      // 249: lconst_0
      // 24a: lcmp
      // 24b: ifle 2bc
      // 24e: ifnonnull 2ba
      // 251: goto 25f
      // 254: ldc2_w 2172714690741900383
      // 257: lload 6
      // 259: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: ifeq 296
      // 262: goto 270
      // 265: ldc2_w 2172714690741900383
      // 268: lload 6
      // 26a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 20
      // 272: iload 22
      // 274: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 279: checkcast com/zelix/_ux
      // 27c: ldc2_w 402798206977556650
      // 27f: lload 6
      // 281: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: goto 296
      // 289: ldc2_w 2172714690741900383
      // 28c: lload 6
      // 28e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: astore 24
      // 296: iinc 22 1
      // 299: aload 18
      // 29b: ifnull 21d
      // 29e: aload 5
      // 2a0: aload 21
      // 2a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a5: lload 14
      // 2a7: dup2_x1
      // 2a8: pop2
      // 2a9: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 2ac: aload 19
      // 2ae: lload 6
      // 2b0: lconst_0
      // 2b1: lcmp
      // 2b2: iflt 232
      // 2b5: invokeinterface java/util/Set.size ()I 1
      // 2ba: aload 18
      // 2bc: ifnonnull 307
      // 2bf: ifle 306
      // 2c2: goto 2d0
      // 2c5: ldc2_w 2172714690741900383
      // 2c8: lload 6
      // 2ca: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: aload 4
      // 2d2: aload 19
      // 2d4: lload 16
      // 2d6: bipush 2
      // 2d7: anewarray 656
      // 2da: dup_x2
      // 2db: dup_x2
      // 2dc: pop
      // 2dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e0: bipush 1
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: ldc2_w 2106467109922310791
      // 2eb: lload 6
      // 2ed: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: lload 14
      // 2f4: dup2_x1
      // 2f5: pop2
      // 2f6: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 2f9: bipush 0
      // 2fa: ireturn
      // 2fb: ldc2_w 2172714690741900383
      // 2fe: lload 6
      // 300: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: bipush 1
      // 307: ireturn
   }

   public boolean Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -5934794997877949555L, var2);
   }

   private static String O(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 39695990293241L;
      long var6 = var2 ^ 44346057165280L;
      return x44.a<"q">(new Object[]{var1, var4, x44.a<"q">(new Object[]{var6}, -8510407376649060312L, var2)}, -7763611345518488566L, var2);
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/po.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 93282498904768
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 64483645139737
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -8610555331590286183
      // 025: lload 2
      // 026: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 0
      // 02c: ldc2_w -8096377262780566795
      // 02f: lload 2
      // 030: invokedynamic i (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: sipush 11947
      // 038: ldc2_w 8725132098533419142
      // 03b: lload 2
      // 03c: lxor
      // 03d: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: bipush 0
      // 043: anewarray 1
      // 046: ldc2_w -8208308197861012314
      // 049: lload 2
      // 04a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/nio/file/Path; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: astore 9
      // 051: astore 8
      // 053: aload 0
      // 054: new com/zelix/w
      // 057: dup
      // 058: lload 4
      // 05a: invokespecial com/zelix/w.<init> (J)V
      // 05d: ldc2_w -7918951333861303856
      // 060: lload 2
      // 061: invokedynamic v (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aload 9
      // 068: ldc2_w -8037538307102004888
      // 06b: lload 2
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/nio/file/DirectoryStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: astore 10
      // 073: aconst_null
      // 074: astore 11
      // 076: aload 10
      // 078: ldc2_w -7885833055413092149
      // 07b: lload 2
      // 07c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: astore 12
      // 083: aload 12
      // 085: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08a: ifeq 156
      // 08d: aload 12
      // 08f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 094: checkcast java/nio/file/Path
      // 097: astore 13
      // 099: aload 13
      // 09b: ldc2_w -8037538307102004888
      // 09e: lload 2
      // 09f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/nio/file/DirectoryStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: astore 14
      // 0a6: aload 14
      // 0a8: ldc2_w -7885833055413092149
      // 0ab: lload 2
      // 0ac: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: astore 15
      // 0b3: aload 15
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 14b
      // 0bd: aload 15
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast java/nio/file/Path
      // 0c7: astore 16
      // 0c9: aload 13
      // 0cb: ldc2_w -7739989961500437329
      // 0ce: lload 2
      // 0cf: invokedynamic m (Ljava/lang/Object;JJ)Ljava/nio/file/Path; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokeinterface java/nio/file/Path.toString ()Ljava/lang/String; 1
      // 0d9: sipush 32721
      // 0dc: ldc2_w 4723211808781865138
      // 0df: lload 2
      // 0e0: lxor
      // 0e1: invokedynamic p (IJ)I bsm=com/zelix/po.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: sipush 23080
      // 0e9: ldc2_w 3726841796725519690
      // 0ec: lload 2
      // 0ed: lxor
      // 0ee: invokedynamic p (IJ)I bsm=com/zelix/po.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f6: astore 17
      // 0f8: new java/lang/StringBuilder
      // 0fb: dup
      // 0fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ff: sipush 28508
      // 102: ldc2_w 6343820527257299314
      // 105: lload 2
      // 106: lxor
      // 107: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: aload 16
      // 111: ldc2_w -7739989961500437329
      // 114: lload 2
      // 115: invokedynamic m (Ljava/lang/Object;JJ)Ljava/nio/file/Path; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: invokeinterface java/nio/file/Path.toString ()Ljava/lang/String; 1
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 125: astore 18
      // 127: aload 0
      // 128: ldc2_w -7918951333861303856
      // 12b: lload 2
      // 12c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: lload 6
      // 133: aload 17
      // 135: aload 18
      // 137: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 13a: pop
      // 13b: aload 8
      // 13d: ifnonnull 083
      // 140: aload 8
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 094
      // 148: ifnull 0b3
      // 14b: aload 8
      // 14d: lload 2
      // 14e: lconst_0
      // 14f: lcmp
      // 150: ifle 0c4
      // 153: ifnull 083
      // 156: bipush 1
      // 157: lload 2
      // 158: lconst_0
      // 159: lcmp
      // 15a: iflt 08a
      // 15d: istore 12
      // 15f: aload 10
      // 161: ifnull 1b6
      // 164: aload 11
      // 166: ifnull 19e
      // 169: goto 176
      // 16c: ldc2_w -8151415588980456296
      // 16f: lload 2
      // 170: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 10
      // 178: ldc2_w -8468805846037934064
      // 17b: lload 2
      // 17c: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: goto 1b6
      // 184: astore 13
      // 186: aload 11
      // 188: aload 13
      // 18a: ldc2_w -8636598373581811422
      // 18d: lload 2
      // 18e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: lload 2
      // 194: lconst_0
      // 195: lcmp
      // 196: iflt 1a9
      // 199: aload 8
      // 19b: ifnull 1b6
      // 19e: aload 10
      // 1a0: ldc2_w -8468805846037934064
      // 1a3: lload 2
      // 1a4: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: goto 1b6
      // 1ac: ldc2_w -8151415588980456296
      // 1af: lload 2
      // 1b0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: iload 12
      // 1b8: ireturn
      // 1b9: astore 12
      // 1bb: aload 12
      // 1bd: astore 11
      // 1bf: aload 12
      // 1c1: athrow
      // 1c2: astore 19
      // 1c4: aload 10
      // 1c6: ifnull 21b
      // 1c9: aload 11
      // 1cb: ifnull 203
      // 1ce: goto 1db
      // 1d1: ldc2_w -8151415588980456296
      // 1d4: lload 2
      // 1d5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: aload 10
      // 1dd: ldc2_w -8468805846037934064
      // 1e0: lload 2
      // 1e1: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: goto 21b
      // 1e9: astore 20
      // 1eb: aload 11
      // 1ed: lload 2
      // 1ee: lconst_0
      // 1ef: lcmp
      // 1f0: iflt 21d
      // 1f3: aload 20
      // 1f5: ldc2_w -8636598373581811422
      // 1f8: lload 2
      // 1f9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: aload 8
      // 200: ifnull 21b
      // 203: aload 10
      // 205: ldc2_w -8468805846037934064
      // 208: lload 2
      // 209: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: goto 21b
      // 211: ldc2_w -8151415588980456296
      // 214: lload 2
      // 215: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: athrow
      // 21b: aload 19
      // 21d: athrow
      // 21e: astore 10
      // 220: bipush 0
      // 221: ireturn
   }

   public po(String var1, long var2, Integer var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 90324084655118L;
      long var7 = var2 ^ 65224562563048L;
      this(var7, var1, var4, sh.j(new Object[]{var5}));
   }

   static String M(Object[] param0) {
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
      // 13: getstatic com/zelix/po.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: new java/lang/StringBuffer
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuffer.<init> ()V
      // 20: astore 5
      // 22: ldc2_w 4648659172697103515
      // 25: lload 2
      // 26: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: new java/util/StringTokenizer
      // 2e: dup
      // 2f: aload 1
      // 30: ldc2_w 6589045207891397244
      // 33: lload 2
      // 34: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 3c: astore 6
      // 3e: astore 4
      // 40: aload 6
      // 42: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 45: ifeq db
      // 48: aload 6
      // 4a: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 4d: aload 4
      // 4f: ifnonnull e0
      // 52: astore 7
      // 54: new java/io/File
      // 57: dup
      // 58: aload 7
      // 5a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5d: astore 8
      // 5f: aload 8
      // 61: ldc2_w 6772656321382583041
      // 64: lload 2
      // 65: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: lload 2
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle af
      // 70: aload 4
      // 72: ifnonnull af
      // 75: ifeq d6
      // 78: goto 85
      // 7b: ldc2_w 5107690956991417498
      // 7e: lload 2
      // 7f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 5
      // 87: aload 4
      // 89: ifnonnull d5
      // 8c: goto 99
      // 8f: ldc2_w 5107690956991417498
      // 92: lload 2
      // 93: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: ldc2_w 4896657289908958506
      // 9c: lload 2
      // 9d: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: goto af
      // a5: ldc2_w 5107690956991417498
      // a8: lload 2
      // a9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: athrow
      // af: ifle ce
      // b2: aload 5
      // b4: ldc2_w 6589045207891397244
      // b7: lload 2
      // b8: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // c0: pop
      // c1: goto ce
      // c4: ldc2_w 5107690956991417498
      // c7: lload 2
      // c8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: aload 5
      // d0: aload 7
      // d2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // d5: pop
      // d6: aload 4
      // d8: ifnull 40
      // db: aload 5
      // dd: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // e0: areturn
   }

   public Integer D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 7965139120831316203L, var2);
   }

   public static boolean S(Object[] param0) {
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
      // 0e: checkcast java/io/File
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/po.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 120934145792536
      // 1e: lxor
      // 1f: lstore 4
      // 21: pop2
      // 22: ldc2_w 5641736161055593043
      // 25: lload 2
      // 26: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 6
      // 2d: aload 1
      // 2e: ldc2_w 5995818104349328841
      // 31: lload 2
      // 32: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 6
      // 39: ifnonnull b4
      // 3c: ifeq b3
      // 3f: goto 4c
      // 42: ldc2_w 5199979834653786706
      // 45: lload 2
      // 46: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 1
      // 4d: ldc2_w 5358747290061308509
      // 50: lload 2
      // 51: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: lload 4
      // 58: sipush 4744
      // 5b: ldc2_w 7881522173389607530
      // 5e: lload 2
      // 5f: lxor
      // 60: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: bipush 3
      // 66: anewarray 656
      // 69: dup_x1
      // 6a: swap
      // 6b: bipush 2
      // 6c: swap
      // 6d: aastore
      // 6e: dup_x2
      // 6f: dup_x2
      // 70: pop
      // 71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74: bipush 1
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w 5305024250581817246
      // 7f: lload 2
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: aload 6
      // 87: ifnonnull b4
      // 8a: goto 97
      // 8d: ldc2_w 5199979834653786706
      // 90: lload 2
      // 91: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: ifeq b3
      // 9a: goto a7
      // 9d: ldc2_w 5199979834653786706
      // a0: lload 2
      // a1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: bipush 1
      // a8: ireturn
      // a9: ldc2_w 5199979834653786706
      // ac: lload 2
      // ad: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: bipush 0
      // b4: ireturn
   }

   private static FileSystem v(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 95698808160553L;
      long var6 = var2 ^ 51967223709706L;
      hk[] var10000 = x44.a<"w">(4169045656341423555L, var2);
      FileSystem var9 = null;
      hk[] var8 = var10000;

      try {
         label34: {
            label25: {
               try {
                  var16 = x44.a<"w">(new Object[]{var4}, 4169362959765513992L, var2);
                  if (var8 != null) {
                     break label34;
                  }

                  if (var16 == 0) {
                     break label25;
                  }
               } catch (IOException var12) {
                  throw x44.a<"w">(var12, 4592017755805824450L, var2);
               }

               var16 = b<"p">(31405, 4090429801438356624L ^ var2);
               break label34;
            }

            URL var10 = x44.a<"o">(
               x44.a<"o">(
                  x44.a<"w">(
                     var1, new String[]{a<"e">(23154, 2069772295547235592L ^ var2), a<"e">(29459, 8353196010407593064L ^ var2)}, 2500327521601488336L, var2
                  ),
                  2569459038468931950L,
                  var2
               ),
               2719730526389468945L,
               var2
            );
            URLClassLoader var11 = new URLClassLoader(new URL[]{var10});
            var9 = x44.a<"w">(
               x44.a<"w">(a<"e">(13983, 3826071289757090279L ^ var2), 4418645640571763468L, var2),
               x44.a<"w">(4335302372870488936L, var2),
               var11,
               2678078136952112263L,
               var2
            );
            return var9;
         }

         Object[] var10003 = new Object[]{null, var6};
         var10003[0] = var16;
         HashMap var15 = x44.a<"w">(var10003, 4470307949314783674L, var2);
         var15.put(a<"e">(7930, 7790979502115809669L ^ var2), var1);
         var9 = x44.a<"w">(x44.a<"w">(a<"e">(5759, 5248881528689385729L ^ var2), 4418645640571763468L, var2), var15, 2453744858573887368L, var2);
      } catch (IOException var13) {
      }

      return var9;
   }

   private String v(Object[] param1) {
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
      // 00c: getstatic com/zelix/po.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: aconst_null
      // 013: astore 5
      // 015: ldc2_w -4289391529423316895
      // 018: lload 2
      // 019: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: ldc2_w -4335995726664972783
      // 021: lload 2
      // 022: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: astore 6
      // 029: aload 0
      // 02a: ldc2_w -2593260550567899426
      // 02d: lload 2
      // 02e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: ldc2_w -2338878425336066426
      // 036: lload 2
      // 037: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: ldc2_w -4567249628409893561
      // 03f: lload 2
      // 040: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: astore 7
      // 047: aload 7
      // 049: astore 8
      // 04b: aload 8
      // 04d: arraylength
      // 04e: istore 9
      // 050: astore 4
      // 052: bipush 0
      // 053: istore 10
      // 055: iload 10
      // 057: iload 9
      // 059: if_icmpge 15a
      // 05c: aload 8
      // 05e: iload 10
      // 060: aaload
      // 061: astore 11
      // 063: ldc2_w -2811151769677064839
      // 066: lload 2
      // 067: invokedynamic l (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 4
      // 06e: ifnonnull 0af
      // 071: ifeq 0a5
      // 074: goto 081
      // 077: ldc2_w -4460685555299170208
      // 07a: lload 2
      // 07b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 11
      // 083: aload 6
      // 085: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 088: ifeq 154
      // 08b: goto 098
      // 08e: ldc2_w -4460685555299170208
      // 091: lload 2
      // 092: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: goto 0b2
      // 09b: ldc2_w -4460685555299170208
      // 09e: lload 2
      // 09f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 11
      // 0a7: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0aa: aload 6
      // 0ac: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0af: ifeq 154
      // 0b2: new java/io/File
      // 0b5: dup
      // 0b6: aload 11
      // 0b8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0bb: astore 12
      // 0bd: aload 4
      // 0bf: ifnonnull 157
      // 0c2: aload 12
      // 0c4: ldc2_w -2808257389020606469
      // 0c7: lload 2
      // 0c8: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ifeq 154
      // 0d0: goto 0dd
      // 0d3: ldc2_w -4460685555299170208
      // 0d6: lload 2
      // 0d7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 12
      // 0df: aload 4
      // 0e1: ifnonnull 12b
      // 0e4: goto 0f1
      // 0e7: ldc2_w -4460685555299170208
      // 0ea: lload 2
      // 0eb: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: ldc2_w -2830998114697782441
      // 0f4: lload 2
      // 0f5: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: ifne 154
      // 0fd: goto 10a
      // 100: ldc2_w -4460685555299170208
      // 103: lload 2
      // 104: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: aload 12
      // 10c: ldc2_w -4520062496063725128
      // 10f: lload 2
      // 110: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: ldc2_w -4520062496063725128
      // 118: lload 2
      // 119: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: goto 12b
      // 121: ldc2_w -4460685555299170208
      // 124: lload 2
      // 125: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: astore 13
      // 12d: aload 4
      // 12f: ifnonnull 157
      // 132: aload 13
      // 134: ifnull 154
      // 137: goto 144
      // 13a: ldc2_w -4460685555299170208
      // 13d: lload 2
      // 13e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: aload 13
      // 146: ldc2_w -4581176493305526161
      // 149: lload 2
      // 14a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: astore 5
      // 151: goto 15a
      // 154: iinc 10 1
      // 157: goto 055
      // 15a: aload 5
      // 15c: areturn
   }

   public String G(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 40794251620846L;
      long var7 = var2 ^ 116744098055550L;
      String var9 = x44.a<"l">(this, -5361673398721140917L, var2);
      x44.a<"s">(this, x44.a<"p">(new Object[]{var4, var5}, -6081569886900650247L, var2), -5361673398721140917L, var2);
      this.o();
      this.e(var7, x44.a<"l">(this, -5361673398721140917L, var2), null, null);
      return var9;
   }

   public static String q(Object[] param0) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/po.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 33631375072474
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: new java/lang/StringBuilder
      // 025: dup
      // 026: invokespecial java/lang/StringBuilder.<init> ()V
      // 029: astore 7
      // 02b: ldc2_w -1416576072769834929
      // 02e: lload 2
      // 02f: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: new java/util/StringTokenizer
      // 037: dup
      // 038: aload 1
      // 039: ldc2_w -602100510138308952
      // 03c: lload 2
      // 03d: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 045: astore 8
      // 047: astore 6
      // 049: aload 8
      // 04b: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 04e: ifeq 128
      // 051: aload 8
      // 053: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 056: astore 9
      // 058: aload 7
      // 05a: aload 9
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: pop
      // 060: aload 9
      // 062: aload 6
      // 064: lload 2
      // 065: lconst_0
      // 066: lcmp
      // 067: ifle 07c
      // 06a: ifnonnull 12d
      // 06d: lload 4
      // 06f: bipush 2
      // 070: anewarray 656
      // 073: dup_x2
      // 074: dup_x2
      // 075: pop
      // 076: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 079: bipush 1
      // 07a: swap
      // 07b: aastore
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 0
      // 07f: swap
      // 080: aastore
      // 081: ldc2_w -908770744738302593
      // 084: lload 2
      // 085: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: lload 2
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: iflt 104
      // 090: aload 6
      // 092: ifnonnull 104
      // 095: goto 0a2
      // 098: ldc2_w -1570000696051867570
      // 09b: lload 2
      // 09c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: ifeq 0ff
      // 0a5: goto 0b2
      // 0a8: ldc2_w -1570000696051867570
      // 0ab: lload 2
      // 0ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 7
      // 0b4: sipush 21183
      // 0b7: ldc2_w 5886483136746707212
      // 0ba: lload 2
      // 0bb: lxor
      // 0bc: invokedynamic p (IJ)I bsm=com/zelix/po.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c4: pop
      // 0c5: aload 7
      // 0c7: aload 9
      // 0c9: bipush 1
      // 0ca: anewarray 656
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w -737962124113065366
      // 0d5: lload 2
      // 0d6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: pop
      // 0df: aload 7
      // 0e1: sipush 376
      // 0e4: ldc2_w 6061503963440057032
      // 0e7: lload 2
      // 0e8: lxor
      // 0e9: invokedynamic p (IJ)I bsm=com/zelix/po.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0f1: pop
      // 0f2: goto 0ff
      // 0f5: ldc2_w -1570000696051867570
      // 0f8: lload 2
      // 0f9: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 8
      // 101: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 104: ifeq 123
      // 107: aload 7
      // 109: ldc2_w -679084340609669243
      // 10c: lload 2
      // 10d: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 115: pop
      // 116: goto 123
      // 119: ldc2_w -1570000696051867570
      // 11c: lload 2
      // 11d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 6
      // 125: ifnull 049
      // 128: aload 7
      // 12a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12d: areturn
   }

   public void J(Object[] param1) {
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
      // 0c: getstatic com/zelix/po.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8852582362370860739
      // 15: lload 2
      // 16: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 4
      // 20: ifnonnull 4a
      // 23: ldc2_w -9077139791348089007
      // 26: lload 2
      // 27: invokedynamic m (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifnull c1
      // 2f: goto 3c
      // 32: ldc2_w -8987992982297441988
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 4a
      // 40: ldc2_w -8987992982297441988
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 4
      // 4c: ifnonnull b7
      // 4f: ldc2_w -9057524704643540814
      // 52: lload 2
      // 53: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: ifeq 8a
      // 5b: goto 68
      // 5e: ldc2_w -8987992982297441988
      // 61: lload 2
      // 62: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 0
      // 69: ldc2_w -9077139791348089007
      // 6c: lload 2
      // 6d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: ldc2_w -6974832541631962821
      // 75: lload 2
      // 76: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: goto 8a
      // 7e: ldc2_w -8987992982297441988
      // 81: lload 2
      // 82: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: astore 5
      // 8a: aload 0
      // 8b: aconst_null
      // 8c: ldc2_w -9077139791348089007
      // 8f: lload 2
      // 90: invokedynamic r (Ljava/lang/Object;Ljava/nio/file/FileSystem;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: aload 0
      // 96: aconst_null
      // 97: ldc2_w -6936004110183345036
      // 9a: lload 2
      // 9b: invokedynamic r (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: aload 0
      // a1: bipush 0
      // a2: ldc2_w -8711182219067501077
      // a5: lload 2
      // a6: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: aload 0
      // ac: bipush 0
      // ad: ldc2_w -9057524704643540814
      // b0: lload 2
      // b1: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: aload 0
      // b7: bipush 0
      // b8: ldc2_w -8861259209996496088
      // bb: lload 2
      // bc: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: return
   }

   public static boolean u(Object[] param0) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/po.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 88180321032292
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 40240862174580
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: ldc2_w -2827315989105785637
      // 02c: lload 2
      // 02d: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: new java/util/StringTokenizer
      // 035: dup
      // 036: aload 1
      // 037: ldc2_w -4381725077323722180
      // 03a: lload 2
      // 03b: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 043: astore 9
      // 045: astore 8
      // 047: aload 9
      // 049: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 04c: ifeq 211
      // 04f: aload 9
      // 051: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 054: astore 10
      // 056: new java/io/File
      // 059: dup
      // 05a: aload 10
      // 05c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05f: astore 11
      // 061: aload 11
      // 063: ldc2_w -4198112417525689535
      // 066: lload 2
      // 067: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 8
      // 06e: lload 2
      // 06f: lconst_0
      // 070: lcmp
      // 071: iflt 079
      // 074: ifnonnull 212
      // 077: aload 8
      // 079: lload 2
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 0b9
      // 07f: ifnonnull 0b7
      // 082: goto 08f
      // 085: ldc2_w -2404315098159295270
      // 088: lload 2
      // 089: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: ifeq 20c
      // 092: goto 09f
      // 095: ldc2_w -2404315098159295270
      // 098: lload 2
      // 099: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: aload 11
      // 0a1: ldc2_w -4320051546120960019
      // 0a4: lload 2
      // 0a5: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: goto 0b7
      // 0ad: ldc2_w -2404315098159295270
      // 0b0: lload 2
      // 0b1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 8
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 1b0
      // 0bf: ifnonnull 1ae
      // 0c2: ifeq 182
      // 0c5: goto 0d2
      // 0c8: ldc2_w -2404315098159295270
      // 0cb: lload 2
      // 0cc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: new java/lang/StringBuilder
      // 0d5: dup
      // 0d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d9: aload 10
      // 0db: aload 8
      // 0dd: ifnonnull 118
      // 0e0: goto 0ed
      // 0e3: ldc2_w -2404315098159295270
      // 0e6: lload 2
      // 0e7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: ldc2_w -2666545250542208647
      // 0f0: lload 2
      // 0f1: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0f9: ifeq 11b
      // 0fc: goto 109
      // 0ff: ldc2_w -2404315098159295270
      // 102: lload 2
      // 103: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 10
      // 10b: goto 118
      // 10e: ldc2_w -2404315098159295270
      // 111: lload 2
      // 112: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: goto 136
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: aload 10
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: ldc2_w -2666545250542208647
      // 12a: lload 2
      // 12b: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: ldc2_w -4447136623160668593
      // 13c: lload 2
      // 13d: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 145: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 148: astore 12
      // 14a: new java/io/File
      // 14d: dup
      // 14e: aload 12
      // 150: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 153: astore 13
      // 155: aload 13
      // 157: ldc2_w -4198112417525689535
      // 15a: lload 2
      // 15b: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: aload 8
      // 162: ifnonnull 176
      // 165: ifeq 177
      // 168: goto 175
      // 16b: ldc2_w -2404315098159295270
      // 16e: lload 2
      // 16f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: bipush 1
      // 176: ireturn
      // 177: aload 8
      // 179: lload 2
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: iflt 20e
      // 17f: ifnull 20c
      // 182: lload 4
      // 184: aload 10
      // 186: bipush 2
      // 187: anewarray 656
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 1
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x2
      // 190: dup_x2
      // 191: pop
      // 192: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 195: bipush 0
      // 196: swap
      // 197: aastore
      // 198: ldc2_w -2313701313694116237
      // 19b: lload 2
      // 19c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: goto 1ae
      // 1a4: ldc2_w -2404315098159295270
      // 1a7: lload 2
      // 1a8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 8
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 1f7
      // 1b6: ifnonnull 1f5
      // 1b9: ifeq 20c
      // 1bc: goto 1c9
      // 1bf: ldc2_w -2404315098159295270
      // 1c2: lload 2
      // 1c3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 10
      // 1cb: lload 6
      // 1cd: bipush 2
      // 1ce: anewarray 656
      // 1d1: dup_x2
      // 1d2: dup_x2
      // 1d3: pop
      // 1d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -4236031370530966098
      // 1e2: lload 2
      // 1e3: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: goto 1f5
      // 1eb: ldc2_w -2404315098159295270
      // 1ee: lload 2
      // 1ef: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 8
      // 1f7: ifnonnull 20b
      // 1fa: ifeq 20c
      // 1fd: goto 20a
      // 200: ldc2_w -2404315098159295270
      // 203: lload 2
      // 204: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: bipush 1
      // 20b: ireturn
      // 20c: aload 8
      // 20e: ifnull 047
      // 211: bipush 0
      // 212: ireturn
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/po.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 92883937971381
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 30019787044901
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: aload 0
      // 02a: ldc2_w 634148913155152400
      // 02d: lload 3
      // 02e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 10
      // 035: ldc2_w 1204455022233554095
      // 038: lload 3
      // 039: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: new java/lang/StringBuilder
      // 041: dup
      // 042: aload 2
      // 043: lload 5
      // 045: bipush 2
      // 046: anewarray 656
      // 049: dup_x2
      // 04a: dup_x2
      // 04b: pop
      // 04c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04f: bipush 1
      // 050: swap
      // 051: aastore
      // 052: dup_x1
      // 053: swap
      // 054: bipush 0
      // 055: swap
      // 056: aastore
      // 057: ldc2_w 1640045875530187682
      // 05a: lload 3
      // 05b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 063: astore 11
      // 065: astore 9
      // 067: aload 11
      // 069: aload 9
      // 06b: ifnonnull 0f5
      // 06e: invokevirtual java/lang/StringBuilder.length ()I
      // 071: ifle 0e6
      // 074: goto 081
      // 077: ldc2_w 1645615174408772782
      // 07a: lload 3
      // 07b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: lload 3
      // 082: lconst_0
      // 083: lcmp
      // 084: ifle 11d
      // 087: aload 11
      // 089: aload 9
      // 08b: ifnonnull 0f5
      // 08e: goto 09b
      // 091: ldc2_w 1645615174408772782
      // 094: lload 3
      // 095: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: lload 3
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 0e8
      // 0a1: aload 11
      // 0a3: invokevirtual java/lang/StringBuilder.length ()I
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: ldc2_w 1518517020986776938
      // 0ab: lload 3
      // 0ac: invokedynamic k (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: ldc2_w 753001108514331493
      // 0b4: lload 3
      // 0b5: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: if_icmpeq 0e6
      // 0bd: goto 0ca
      // 0c0: ldc2_w 1645615174408772782
      // 0c3: lload 3
      // 0c4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 11
      // 0cc: ldc2_w 753001108514331493
      // 0cf: lload 3
      // 0d0: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: goto 0e6
      // 0dc: ldc2_w 1645615174408772782
      // 0df: lload 3
      // 0e0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 11
      // 0e8: aload 0
      // 0e9: ldc2_w 634148913155152400
      // 0ec: lload 3
      // 0ed: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: pop
      // 0f6: aload 0
      // 0f7: aload 11
      // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc: ldc2_w 634148913155152400
      // 0ff: lload 3
      // 100: invokedynamic p (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: aload 0
      // 106: invokevirtual com/zelix/po.o ()V
      // 109: aload 0
      // 10a: aload 0
      // 10b: ldc2_w 634148913155152400
      // 10e: lload 3
      // 10f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: lload 7
      // 116: dup2_x1
      // 117: pop2
      // 118: aconst_null
      // 119: aconst_null
      // 11a: invokevirtual com/zelix/po.e (JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
      // 11d: aload 10
      // 11f: areturn
   }

   public static boolean p(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 7329561644028L;
      File var6 = new File(var1);
      return x44.a<"t">(new Object[]{var4, var6}, 1023477420749774107L, var2);
   }

   byte[] T(Object[] param1) {
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
      // 00c: checkcast com/zelix/pg
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: pop
      // 01b: getstatic com/zelix/po.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 140421985773903
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 97695345225400
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 135895395371887
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 18484791808730
      // 03b: lxor
      // 03c: lstore 12
      // 03e: pop2
      // 03f: ldc2_w 5200608242771809332
      // 042: lload 3
      // 043: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 2
      // 049: lload 12
      // 04b: bipush 1
      // 04c: anewarray 656
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 0
      // 056: swap
      // 057: aastore
      // 058: ldc2_w 5427336933147045619
      // 05b: lload 3
      // 05c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: pop
      // 062: astore 14
      // 064: aload 0
      // 065: ldc2_w 5337508239570802914
      // 068: lload 3
      // 069: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: ifeq 1b1
      // 071: aload 5
      // 073: lload 10
      // 075: bipush 2
      // 076: anewarray 656
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 1
      // 080: swap
      // 081: aastore
      // 082: dup_x1
      // 083: swap
      // 084: bipush 0
      // 085: swap
      // 086: aastore
      // 087: ldc2_w 5861351639839763438
      // 08a: lload 3
      // 08b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: astore 15
      // 092: aload 15
      // 094: aload 14
      // 096: ifnonnull 0ab
      // 099: ifnull 1af
      // 09c: goto 0a9
      // 09f: ldc2_w 5642225946874070069
      // 0a2: lload 3
      // 0a3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 15
      // 0ab: invokevirtual java/lang/String.length ()I
      // 0ae: ifle 1af
      // 0b1: aload 0
      // 0b2: ldc2_w 5960328945353202045
      // 0b5: lload 3
      // 0b6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: lload 6
      // 0bd: aload 15
      // 0bf: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 0c2: astore 16
      // 0c4: aload 16
      // 0c6: ifnull 1ad
      // 0c9: new java/lang/StringBuilder
      // 0cc: dup
      // 0cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d0: astore 17
      // 0d2: aconst_null
      // 0d3: astore 18
      // 0d5: aload 16
      // 0d7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0dc: astore 19
      // 0de: aload 19
      // 0e0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e5: ifeq 173
      // 0e8: aload 19
      // 0ea: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ef: checkcast java/lang/String
      // 0f2: astore 20
      // 0f4: aload 17
      // 0f6: bipush 0
      // 0f7: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0fa: aload 17
      // 0fc: aload 5
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101: pop
      // 102: aload 17
      // 104: sipush 30342
      // 107: ldc2_w 615120977771163660
      // 10a: lload 3
      // 10b: lxor
      // 10c: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: pop
      // 115: aload 0
      // 116: ldc2_w 5696648812911456856
      // 119: lload 3
      // 11a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: aload 20
      // 121: bipush 1
      // 122: anewarray 1
      // 125: dup
      // 126: bipush 0
      // 127: aload 17
      // 129: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12c: aastore
      // 12d: ldc2_w 5673223819964681227
      // 130: lload 3
      // 131: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/nio/file/Path; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: astore 21
      // 138: aload 21
      // 13a: aload 14
      // 13c: ifnonnull 16b
      // 13f: bipush 0
      // 140: anewarray 632
      // 143: ldc2_w 5860799413530165603
      // 146: lload 3
      // 147: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: ifeq 170
      // 14f: goto 15c
      // 152: ldc2_w 5642225946874070069
      // 155: lload 3
      // 156: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 21
      // 15e: goto 16b
      // 161: ldc2_w 5642225946874070069
      // 164: lload 3
      // 165: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: astore 18
      // 16d: goto 173
      // 170: goto 0de
      // 173: aload 18
      // 175: aload 14
      // 177: ifnonnull 1a1
      // 17a: ifnull 1ab
      // 17d: goto 18a
      // 180: ldc2_w 5642225946874070069
      // 183: lload 3
      // 184: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 2
      // 18b: lload 8
      // 18d: aload 18
      // 18f: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 192: aload 18
      // 194: goto 1a1
      // 197: ldc2_w 5642225946874070069
      // 19a: lload 3
      // 19b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: ldc2_w 5995865163883877196
      // 1a4: lload 3
      // 1a5: invokedynamic p (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: areturn
      // 1ab: aconst_null
      // 1ac: areturn
      // 1ad: aconst_null
      // 1ae: areturn
      // 1af: aconst_null
      // 1b0: areturn
      // 1b1: aconst_null
      // 1b2: areturn
   }

   private static String A(Object[] param0) {
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
      // 00c: getstatic com/zelix/po.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 28388878008910
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 63871376444550
      // 01d: lxor
      // 01e: lstore 5
      // 020: dup2
      // 021: ldc2_w 65842005791942
      // 024: lxor
      // 025: lstore 7
      // 027: pop2
      // 028: ldc2_w 6666017614830944410
      // 02b: lload 1
      // 02c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aconst_null
      // 032: astore 10
      // 034: astore 9
      // 036: ldc2_w 4693618046460267503
      // 039: lload 1
      // 03a: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 9
      // 041: ifnonnull 05d
      // 044: ifnull 0fa
      // 047: goto 054
      // 04a: ldc2_w 6549078891031744667
      // 04d: lload 1
      // 04e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: ldc2_w 4693618046460267503
      // 057: lload 1
      // 058: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: invokevirtual java/lang/String.length ()I
      // 060: lload 1
      // 061: lconst_0
      // 062: lcmp
      // 063: iflt 0c2
      // 066: aload 9
      // 068: ifnonnull 0c2
      // 06b: ifle 0fa
      // 06e: goto 07b
      // 071: ldc2_w 6549078891031744667
      // 074: lload 1
      // 075: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: ldc2_w 4693618046460267503
      // 07e: lload 1
      // 07f: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: aload 9
      // 086: ifnonnull 0f8
      // 089: goto 096
      // 08c: ldc2_w 6549078891031744667
      // 08f: lload 1
      // 090: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: lload 7
      // 098: dup2_x1
      // 099: pop2
      // 09a: bipush 2
      // 09b: anewarray 656
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 1
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w 5105303269376086226
      // 0af: lload 1
      // 0b0: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: goto 0c2
      // 0b8: ldc2_w 6549078891031744667
      // 0bb: lload 1
      // 0bc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: ifeq 0fa
      // 0c5: lload 5
      // 0c7: ldc2_w 4693618046460267503
      // 0ca: lload 1
      // 0cb: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: bipush 2
      // 0d1: anewarray 656
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w 6556831259335658488
      // 0e5: lload 1
      // 0e6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: goto 0f8
      // 0ee: ldc2_w 6549078891031744667
      // 0f1: lload 1
      // 0f2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: astore 10
      // 0fa: aload 10
      // 0fc: aload 9
      // 0fe: ifnonnull 339
      // 101: ifnonnull 337
      // 104: goto 111
      // 107: ldc2_w 6549078891031744667
      // 10a: lload 1
      // 10b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: ldc2_w 4729199611943739112
      // 114: lload 1
      // 115: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: aload 9
      // 11c: ifnonnull 339
      // 11f: goto 12c
      // 122: ldc2_w 6549078891031744667
      // 125: lload 1
      // 126: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: ifnull 337
      // 12f: goto 13c
      // 132: ldc2_w 6549078891031744667
      // 135: lload 1
      // 136: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: ldc2_w 4729199611943739112
      // 13f: lload 1
      // 140: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 9
      // 147: ifnonnull 339
      // 14a: goto 157
      // 14d: ldc2_w 6549078891031744667
      // 150: lload 1
      // 151: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: invokevirtual java/lang/String.length ()I
      // 15a: ifle 337
      // 15d: goto 16a
      // 160: ldc2_w 6549078891031744667
      // 163: lload 1
      // 164: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: new java/io/File
      // 16d: dup
      // 16e: ldc2_w 4729199611943739112
      // 171: lload 1
      // 172: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 17a: astore 11
      // 17c: aload 11
      // 17e: ldc2_w 4754787843830060800
      // 181: lload 1
      // 182: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: lload 1
      // 188: lconst_0
      // 189: lcmp
      // 18a: ifle 1ba
      // 18d: aload 9
      // 18f: ifnonnull 1ba
      // 192: ifeq 337
      // 195: goto 1a2
      // 198: ldc2_w 6549078891031744667
      // 19b: lload 1
      // 19c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 11
      // 1a4: ldc2_w 4633413073808049068
      // 1a7: lload 1
      // 1a8: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: goto 1ba
      // 1b0: ldc2_w 6549078891031744667
      // 1b3: lload 1
      // 1b4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: ifeq 337
      // 1bd: new java/lang/StringBuilder
      // 1c0: dup
      // 1c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c4: aload 11
      // 1c6: ldc2_w 6383591693521653908
      // 1c9: lload 1
      // 1ca: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: ldc2_w 6827368650371153208
      // 1d5: lload 1
      // 1d6: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1de: sipush 13044
      // 1e1: ldc2_w 1222024632212857051
      // 1e4: lload 1
      // 1e5: lxor
      // 1e6: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f1: aload 9
      // 1f3: ifnonnull 339
      // 1f6: goto 203
      // 1f9: ldc2_w 6549078891031744667
      // 1fc: lload 1
      // 1fd: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: astore 12
      // 205: new java/io/File
      // 208: dup
      // 209: aload 12
      // 20b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 20e: astore 13
      // 210: aload 13
      // 212: lload 1
      // 213: lconst_0
      // 214: lcmp
      // 215: iflt 226
      // 218: ldc2_w 4754787843830060800
      // 21b: lload 1
      // 21c: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: ifeq 337
      // 224: aload 13
      // 226: aload 9
      // 228: ifnonnull 274
      // 22b: goto 238
      // 22e: ldc2_w 6549078891031744667
      // 231: lload 1
      // 232: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: ldc2_w 4633413073808049068
      // 23b: lload 1
      // 23c: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: ifeq 337
      // 244: goto 251
      // 247: ldc2_w 6549078891031744667
      // 24a: lload 1
      // 24b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: new java/io/File
      // 254: dup
      // 255: aload 13
      // 257: sipush 24444
      // 25a: ldc2_w 1579162863143734614
      // 25d: lload 1
      // 25e: lxor
      // 25f: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 267: goto 274
      // 26a: ldc2_w 6549078891031744667
      // 26d: lload 1
      // 26e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: athrow
      // 274: astore 14
      // 276: aload 14
      // 278: aload 9
      // 27a: ifnonnull 2e6
      // 27d: lload 3
      // 27e: dup2_x1
      // 27f: pop2
      // 280: bipush 2
      // 281: anewarray 656
      // 284: dup_x1
      // 285: swap
      // 286: bipush 1
      // 287: swap
      // 288: aastore
      // 289: dup_x2
      // 28a: dup_x2
      // 28b: pop
      // 28c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28f: bipush 0
      // 290: swap
      // 291: aastore
      // 292: ldc2_w 5153807037858714793
      // 295: lload 1
      // 296: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: ifeq 2c3
      // 29e: goto 2ab
      // 2a1: ldc2_w 6549078891031744667
      // 2a4: lload 1
      // 2a5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: athrow
      // 2ab: aload 14
      // 2ad: lload 1
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: ifle 2d9
      // 2b3: ldc2_w 6383591693521653908
      // 2b6: lload 1
      // 2b7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: astore 10
      // 2be: aload 9
      // 2c0: ifnull 337
      // 2c3: new java/io/File
      // 2c6: dup
      // 2c7: aload 13
      // 2c9: sipush 10930
      // 2cc: ldc2_w 3764663333027264651
      // 2cf: lload 1
      // 2d0: lxor
      // 2d1: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 2d9: goto 2e6
      // 2dc: ldc2_w 6549078891031744667
      // 2df: lload 1
      // 2e0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: astore 15
      // 2e8: aload 15
      // 2ea: aload 9
      // 2ec: ifnonnull 32c
      // 2ef: lload 3
      // 2f0: dup2_x1
      // 2f1: pop2
      // 2f2: bipush 2
      // 2f3: anewarray 656
      // 2f6: dup_x1
      // 2f7: swap
      // 2f8: bipush 1
      // 2f9: swap
      // 2fa: aastore
      // 2fb: dup_x2
      // 2fc: dup_x2
      // 2fd: pop
      // 2fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 301: bipush 0
      // 302: swap
      // 303: aastore
      // 304: ldc2_w 5153807037858714793
      // 307: lload 1
      // 308: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: ifeq 337
      // 310: goto 31d
      // 313: ldc2_w 6549078891031744667
      // 316: lload 1
      // 317: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: athrow
      // 31d: aload 15
      // 31f: goto 32c
      // 322: ldc2_w 6549078891031744667
      // 325: lload 1
      // 326: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: athrow
      // 32c: ldc2_w 6383591693521653908
      // 32f: lload 1
      // 330: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: astore 10
      // 337: aload 10
      // 339: areturn
   }

   public boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 1587191940046963958L, var2);
   }

   public po(long var1, String var3, Set var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 112053346298826L;
      this(var5, var3, null, var4);
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 139903559178769L;
      return x44.a<"u">(new Object[]{var4, x44.a<"i">(this, 4520142393068366950L, var2)}, 2351121943749374759L, var2);
   }

   public po(long var1, String var3, Integer var4, Set var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 130278055086200L;
      super();
      x44.a<"s">(this, x44.a<"p">(new Object[]{var3, var6, var5}, 2216702283964030603L, var1), 2197728343507733667L, var1);
      x44.a<"s">(this, var4, 1903550658439197704L, var1);
   }

   public po(String var1, long var2, int var4) {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 108903815038681L;
      long var9 = var5 ^ 11511941502271L;
      this(var9, var1, null, sh.j(new Object[]{var7}));
   }

   public String m(Object[] param1) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/po.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 46861524529449
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 111778404697529
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 3254813434315780403
      // 02d: lload 2
      // 02e: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 0
      // 034: ldc2_w 3841726575921145740
      // 037: lload 2
      // 038: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 10
      // 03f: astore 9
      // 041: new java/lang/StringBuilder
      // 044: dup
      // 045: aload 0
      // 046: ldc2_w 3841726575921145740
      // 049: lload 2
      // 04a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 052: astore 11
      // 054: aload 11
      // 056: aload 9
      // 058: ifnonnull 0f7
      // 05b: invokevirtual java/lang/StringBuilder.length ()I
      // 05e: ifle 0d3
      // 061: goto 06e
      // 064: ldc2_w 3119332821957976370
      // 067: lload 2
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: lload 2
      // 06f: lconst_0
      // 070: lcmp
      // 071: ifle 11f
      // 074: aload 11
      // 076: aload 9
      // 078: ifnonnull 0f7
      // 07b: goto 088
      // 07e: ldc2_w 3119332821957976370
      // 081: lload 2
      // 082: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: ifle 0d5
      // 08e: aload 11
      // 090: invokevirtual java/lang/StringBuilder.length ()I
      // 093: bipush 1
      // 094: isub
      // 095: ldc2_w 2922455501988438262
      // 098: lload 2
      // 099: invokedynamic o (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: ldc2_w 4030524167573858041
      // 0a1: lload 2
      // 0a2: invokedynamic n (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: if_icmpeq 0d3
      // 0aa: goto 0b7
      // 0ad: ldc2_w 3119332821957976370
      // 0b0: lload 2
      // 0b1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 11
      // 0b9: ldc2_w 4030524167573858041
      // 0bc: lload 2
      // 0bd: invokedynamic n (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c5: pop
      // 0c6: goto 0d3
      // 0c9: ldc2_w 3119332821957976370
      // 0cc: lload 2
      // 0cd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 11
      // 0d5: aload 4
      // 0d7: lload 5
      // 0d9: bipush 2
      // 0da: anewarray 656
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 1
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: bipush 0
      // 0e9: swap
      // 0ea: aastore
      // 0eb: ldc2_w 3125185794813689406
      // 0ee: lload 2
      // 0ef: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f7: pop
      // 0f8: aload 0
      // 0f9: aload 11
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: ldc2_w 3841726575921145740
      // 101: lload 2
      // 102: invokedynamic t (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: aload 0
      // 108: invokevirtual com/zelix/po.o ()V
      // 10b: aload 0
      // 10c: aload 0
      // 10d: ldc2_w 3841726575921145740
      // 110: lload 2
      // 111: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: lload 7
      // 118: dup2_x1
      // 119: pop2
      // 11a: aconst_null
      // 11b: aconst_null
      // 11c: invokevirtual com/zelix/po.e (JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
      // 11f: aload 10
      // 121: areturn
   }

   private static FileSystem s(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      FileSystem var3 = null;

      try {
         var3 = x44.a<"w">(x44.a<"w">(a<"e">(13983, 3825994533376469463L ^ var1), 6152595061502432060L, var1), 6086766490033342576L, var1);
      } catch (ProviderNotFoundException var5) {
      }

      return var3;
   }

   public List Z(Object[] param1) {
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
      // 0c: getstatic com/zelix/po.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 65592144358263
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 2016041020900280290
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: new java/util/ArrayList
      // 27: dup
      // 28: invokespecial java/util/ArrayList.<init> ()V
      // 2b: astore 7
      // 2d: astore 6
      // 2f: new java/util/StringTokenizer
      // 32: dup
      // 33: aload 0
      // 34: ldc2_w 252637832048939357
      // 37: lload 2
      // 38: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: ldc2_w 2759735938060549
      // 40: lload 2
      // 41: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 49: astore 8
      // 4b: aload 8
      // 4d: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 50: ifeq aa
      // 53: aload 8
      // 55: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 58: astore 9
      // 5a: aload 9
      // 5c: lload 4
      // 5e: bipush 2
      // 5f: anewarray 656
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w 346285565723263698
      // 73: lload 2
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: aload 6
      // 7b: ifnonnull a4
      // 7e: ifne a5
      // 81: goto 8e
      // 84: ldc2_w 2133327018390624227
      // 87: lload 2
      // 88: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 7
      // 90: aload 9
      // 92: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 97: goto a4
      // 9a: ldc2_w 2133327018390624227
      // 9d: lload 2
      // 9e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: pop
      // a5: aload 6
      // a7: ifnull 4b
      // aa: aload 7
      // ac: areturn
   }

   public boolean R(Object[] param1) {
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
      // 00f: checkcast com/zelix/pg
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/pg
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/po.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 7157818493154
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 50377578337059
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 130579933636564
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 128496370015818
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 59306206044810
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 131843724707616
      // 04c: lxor
      // 04d: lstore 16
      // 04f: dup2
      // 050: ldc2_w 100347581352920
      // 053: lxor
      // 054: lstore 18
      // 056: dup2
      // 057: ldc2_w 88356056545714
      // 05a: lxor
      // 05b: lstore 20
      // 05d: dup2
      // 05e: ldc2_w 55582132942458
      // 061: lxor
      // 062: lstore 22
      // 064: dup2
      // 065: ldc2_w 130890247653884
      // 068: lxor
      // 069: lstore 24
      // 06b: pop2
      // 06c: ldc2_w 6856252304184951614
      // 06f: lload 4
      // 071: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: aload 0
      // 077: bipush 0
      // 078: ldc2_w 6847012575597218091
      // 07b: lload 4
      // 07d: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: astore 26
      // 084: aload 0
      // 085: bipush 0
      // 086: ldc2_w 6708300724097421288
      // 089: lload 4
      // 08b: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: bipush 0
      // 091: istore 27
      // 093: aload 0
      // 094: ldc2_w 6501028855845864502
      // 097: lload 4
      // 099: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: lload 24
      // 0a0: sipush 4744
      // 0a3: ldc2_w 7881579346061984519
      // 0a6: lload 4
      // 0a8: lxor
      // 0a9: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: aload 0
      // 0af: ldc2_w 4848274761181293866
      // 0b2: lload 4
      // 0b4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: bipush 1
      // 0ba: aconst_null
      // 0bb: bipush 0
      // 0bc: bipush 6
      // 0be: anewarray 656
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c6: bipush 5
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 4
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d3: bipush 3
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 2
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: ldc2_w 6391991792592357209
      // 0ec: lload 4
      // 0ee: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: pop
      // 0f4: bipush 1
      // 0f5: istore 27
      // 0f7: goto 0fc
      // 0fa: astore 28
      // 0fc: iload 27
      // 0fe: aload 26
      // 100: ifnonnull 28b
      // 103: ifne 289
      // 106: goto 114
      // 109: ldc2_w 6433178879999857471
      // 10c: lload 4
      // 10e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: lload 6
      // 116: bipush 1
      // 117: anewarray 656
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w 6714116575609103822
      // 126: lload 4
      // 128: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: aload 26
      // 12f: ifnonnull 28b
      // 132: goto 140
      // 135: ldc2_w 6433178879999857471
      // 138: lload 4
      // 13a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: ifeq 289
      // 143: goto 151
      // 146: ldc2_w 6433178879999857471
      // 149: lload 4
      // 14b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 0
      // 152: lload 18
      // 154: bipush 1
      // 155: anewarray 656
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 0
      // 15f: swap
      // 160: aastore
      // 161: ldc2_w 6902363297280022544
      // 164: lload 4
      // 166: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: astore 28
      // 16d: lload 4
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 1c5
      // 174: aload 26
      // 176: ifnonnull 1c5
      // 179: aload 28
      // 17b: ifnull 289
      // 17e: goto 18c
      // 181: ldc2_w 6433178879999857471
      // 184: lload 4
      // 186: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: aload 0
      // 18d: lload 22
      // 18f: aload 28
      // 191: bipush 2
      // 192: anewarray 656
      // 195: dup_x1
      // 196: swap
      // 197: bipush 1
      // 198: swap
      // 199: aastore
      // 19a: dup_x2
      // 19b: dup_x2
      // 19c: pop
      // 19d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a0: bipush 0
      // 1a1: swap
      // 1a2: aastore
      // 1a3: ldc2_w 6389802255977882879
      // 1a6: lload 4
      // 1a8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: ldc2_w 6342343057076708690
      // 1b0: lload 4
      // 1b2: invokedynamic q (Ljava/lang/Object;Ljava/nio/file/FileSystem;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: goto 1c5
      // 1ba: ldc2_w 6433178879999857471
      // 1bd: lload 4
      // 1bf: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: lload 4
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: ifle 223
      // 1cd: aload 26
      // 1cf: ifnonnull 223
      // 1d2: ldc2_w 6342343057076708690
      // 1d5: lload 4
      // 1d7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: ifnull 289
      // 1df: goto 1ed
      // 1e2: ldc2_w 6433178879999857471
      // 1e5: lload 4
      // 1e7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: lload 16
      // 1f0: bipush 1
      // 1f1: anewarray 656
      // 1f4: dup_x2
      // 1f5: dup_x2
      // 1f6: pop
      // 1f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fa: bipush 0
      // 1fb: swap
      // 1fc: aastore
      // 1fd: ldc2_w 6520259928302864206
      // 200: lload 4
      // 202: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: istore 27
      // 209: aload 0
      // 20a: iload 27
      // 20c: ldc2_w 6708300724097421288
      // 20f: lload 4
      // 211: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: aload 0
      // 217: bipush 1
      // 218: ldc2_w 6363084202602087089
      // 21b: lload 4
      // 21d: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: aload 0
      // 223: ldc2_w 6708300724097421288
      // 226: lload 4
      // 228: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: aload 26
      // 22f: lload 4
      // 231: lconst_0
      // 232: lcmp
      // 233: ifle 28d
      // 236: ifnonnull 28b
      // 239: ifeq 289
      // 23c: goto 24a
      // 23f: ldc2_w 6433178879999857471
      // 242: lload 4
      // 244: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: aload 3
      // 24b: new java/lang/StringBuilder
      // 24e: dup
      // 24f: invokespecial java/lang/StringBuilder.<init> ()V
      // 252: aload 28
      // 254: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 257: ldc2_w 6709115548528656028
      // 25a: lload 4
      // 25c: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 264: ldc2_w 6380539472802962766
      // 267: lload 4
      // 269: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 271: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 274: lload 20
      // 276: dup2_x1
      // 277: pop2
      // 278: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 27b: goto 289
      // 27e: ldc2_w 6433178879999857471
      // 281: lload 4
      // 283: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: iload 27
      // 28b: aload 26
      // 28d: lload 4
      // 28f: lconst_0
      // 290: lcmp
      // 291: iflt 321
      // 294: ifnonnull 31f
      // 297: ifne 31d
      // 29a: goto 2a8
      // 29d: ldc2_w 6433178879999857471
      // 2a0: lload 4
      // 2a2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: lload 8
      // 2aa: bipush 1
      // 2ab: anewarray 656
      // 2ae: dup_x2
      // 2af: dup_x2
      // 2b0: pop
      // 2b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b4: bipush 0
      // 2b5: swap
      // 2b6: aastore
      // 2b7: ldc2_w 6710457794719801427
      // 2ba: lload 4
      // 2bc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: astore 28
      // 2c3: lload 4
      // 2c5: lconst_0
      // 2c6: lcmp
      // 2c7: iflt 31a
      // 2ca: aload 28
      // 2cc: aload 26
      // 2ce: ifnonnull 311
      // 2d1: ifnull 31d
      // 2d4: goto 2e2
      // 2d7: ldc2_w 6433178879999857471
      // 2da: lload 4
      // 2dc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: lload 14
      // 2e5: aload 28
      // 2e7: bipush 2
      // 2e8: anewarray 656
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 1
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x2
      // 2f1: dup_x2
      // 2f2: pop
      // 2f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f6: bipush 0
      // 2f7: swap
      // 2f8: aastore
      // 2f9: ldc2_w 6596201447198885356
      // 2fc: lload 4
      // 2fe: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: goto 311
      // 306: ldc2_w 6433178879999857471
      // 309: lload 4
      // 30b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: pop
      // 312: aload 2
      // 313: lload 20
      // 315: aload 28
      // 317: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 31a: bipush 1
      // 31b: istore 27
      // 31d: iload 27
      // 31f: aload 26
      // 321: ifnonnull 453
      // 324: ifne 444
      // 327: goto 335
      // 32a: ldc2_w 6433178879999857471
      // 32d: lload 4
      // 32f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: athrow
      // 335: lload 10
      // 337: bipush 1
      // 338: anewarray 656
      // 33b: dup_x2
      // 33c: dup_x2
      // 33d: pop
      // 33e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 341: bipush 0
      // 342: swap
      // 343: aastore
      // 344: ldc2_w 6854949563464598005
      // 347: lload 4
      // 349: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: aload 26
      // 350: ifnonnull 453
      // 353: goto 361
      // 356: ldc2_w 6433178879999857471
      // 359: lload 4
      // 35b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: ifeq 444
      // 364: goto 372
      // 367: ldc2_w 6433178879999857471
      // 36a: lload 4
      // 36c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: athrow
      // 372: aload 0
      // 373: lload 12
      // 375: bipush 1
      // 376: anewarray 656
      // 379: dup_x2
      // 37a: dup_x2
      // 37b: pop
      // 37c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37f: bipush 0
      // 380: swap
      // 381: aastore
      // 382: ldc2_w 5152097522993161178
      // 385: lload 4
      // 387: invokedynamic r (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: ldc2_w 6342343057076708690
      // 38f: lload 4
      // 391: invokedynamic q (Ljava/lang/Object;Ljava/nio/file/FileSystem;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 396: lload 4
      // 398: lconst_0
      // 399: lcmp
      // 39a: iflt 451
      // 39d: aload 0
      // 39e: aload 26
      // 3a0: ifnonnull 445
      // 3a3: goto 3b1
      // 3a6: ldc2_w 6433178879999857471
      // 3a9: lload 4
      // 3ab: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: athrow
      // 3b1: ldc2_w 6342343057076708690
      // 3b4: lload 4
      // 3b6: invokedynamic n (Ljava/lang/Object;JJ)Ljava/nio/file/FileSystem; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bb: ifnull 444
      // 3be: goto 3cc
      // 3c1: ldc2_w 6433178879999857471
      // 3c4: lload 4
      // 3c6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: aload 0
      // 3cd: lload 16
      // 3cf: bipush 1
      // 3d0: anewarray 656
      // 3d3: dup_x2
      // 3d4: dup_x2
      // 3d5: pop
      // 3d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d9: bipush 0
      // 3da: swap
      // 3db: aastore
      // 3dc: ldc2_w 6520259928302864206
      // 3df: lload 4
      // 3e1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: istore 27
      // 3e8: aload 0
      // 3e9: iload 27
      // 3eb: ldc2_w 6708300724097421288
      // 3ee: lload 4
      // 3f0: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f5: aload 0
      // 3f6: bipush 0
      // 3f7: ldc2_w 6363084202602087089
      // 3fa: lload 4
      // 3fc: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: aload 0
      // 402: ldc2_w 6708300724097421288
      // 405: lload 4
      // 407: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: aload 26
      // 40e: ifnonnull 453
      // 411: ifeq 444
      // 414: goto 422
      // 417: ldc2_w 6433178879999857471
      // 41a: lload 4
      // 41c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: athrow
      // 422: aload 2
      // 423: lload 20
      // 425: sipush 13983
      // 428: ldc2_w 3826034776116209434
      // 42b: lload 4
      // 42d: lxor
      // 42e: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 433: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 436: goto 444
      // 439: ldc2_w 6433178879999857471
      // 43c: lload 4
      // 43e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 443: athrow
      // 444: aload 0
      // 445: iload 27
      // 447: ldc2_w 6847012575597218091
      // 44a: lload 4
      // 44c: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: iload 27
      // 453: ireturn
   }

   private static String Y(Object[] param0) {
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
      // 004: checkcast java/util/Set
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/po.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 26960457018927
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: new java/lang/StringBuilder
      // 025: dup
      // 026: invokespecial java/lang/StringBuilder.<init> ()V
      // 029: astore 7
      // 02b: aload 1
      // 02c: invokeinterface java/util/Set.size ()I 1
      // 031: istore 8
      // 033: ldc2_w 1481999412446398601
      // 036: lload 2
      // 037: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: bipush 0
      // 03d: istore 9
      // 03f: aload 1
      // 040: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 045: astore 10
      // 047: astore 6
      // 049: aload 10
      // 04b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 050: ifeq 119
      // 053: aload 10
      // 055: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05a: checkcast java/lang/String
      // 05d: astore 11
      // 05f: aload 7
      // 061: ldc "\""
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: pop
      // 067: aload 7
      // 069: aload 11
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: pop
      // 06f: aload 7
      // 071: ldc "\""
      // 073: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 076: pop
      // 077: iload 9
      // 079: bipush 2
      // 07a: iadd
      // 07b: iload 8
      // 07d: lload 2
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 126
      // 083: aload 6
      // 085: ifnonnull 126
      // 088: aload 6
      // 08a: ifnonnull 0ee
      // 08d: goto 09a
      // 090: ldc2_w 1364711235278248072
      // 093: lload 2
      // 094: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: lload 2
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: iflt 0e1
      // 0a0: if_icmpge 0db
      // 0a3: goto 0b0
      // 0a6: ldc2_w 1364711235278248072
      // 0a9: lload 2
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 7
      // 0b2: sipush 6538
      // 0b5: ldc2_w 6003004080715285429
      // 0b8: lload 2
      // 0b9: lxor
      // 0ba: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: pop
      // 0c3: aload 6
      // 0c5: lload 2
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 116
      // 0cb: ifnull 111
      // 0ce: goto 0db
      // 0d1: ldc2_w 1364711235278248072
      // 0d4: lload 2
      // 0d5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: iload 9
      // 0dd: bipush 1
      // 0de: iadd
      // 0df: iload 8
      // 0e1: goto 0ee
      // 0e4: ldc2_w 1364711235278248072
      // 0e7: lload 2
      // 0e8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: if_icmpge 111
      // 0f1: aload 7
      // 0f3: sipush 2708
      // 0f6: ldc2_w 2556868349542092975
      // 0f9: lload 2
      // 0fa: lxor
      // 0fb: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: pop
      // 104: goto 111
      // 107: ldc2_w 1364711235278248072
      // 10a: lload 2
      // 10b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: iinc 9 1
      // 114: aload 6
      // 116: ifnull 049
      // 119: aload 1
      // 11a: invokeinterface java/util/Set.size ()I 1
      // 11f: lload 2
      // 120: lconst_0
      // 121: lcmp
      // 122: iflt 198
      // 125: bipush 1
      // 126: if_icmple 154
      // 129: aload 7
      // 12b: sipush 15915
      // 12e: ldc2_w 274725607264052241
      // 131: lload 2
      // 132: lxor
      // 133: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: aload 6
      // 13e: lload 2
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 18f
      // 144: ifnull 174
      // 147: goto 154
      // 14a: ldc2_w 1364711235278248072
      // 14d: lload 2
      // 14e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: aload 7
      // 156: sipush 9749
      // 159: ldc2_w 2640284870743129149
      // 15c: lload 2
      // 15d: lxor
      // 15e: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 166: pop
      // 167: goto 174
      // 16a: ldc2_w 1364711235278248072
      // 16d: lload 2
      // 16e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: lload 2
      // 175: lconst_0
      // 176: lcmp
      // 177: iflt 1d0
      // 17a: aload 1
      // 17b: lload 4
      // 17d: bipush 2
      // 17e: anewarray 656
      // 181: dup_x2
      // 182: dup_x2
      // 183: pop
      // 184: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 187: bipush 1
      // 188: swap
      // 189: aastore
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: ldc2_w 1160177311075474803
      // 192: lload 2
      // 193: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: ifeq 1dd
      // 19b: aload 7
      // 19d: sipush 7461
      // 1a0: ldc2_w 5702542240384009998
      // 1a3: lload 2
      // 1a4: lxor
      // 1a5: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: pop
      // 1ae: aload 7
      // 1b0: ldc2_w 644117432858771630
      // 1b3: lload 2
      // 1b4: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: pop
      // 1bd: aload 7
      // 1bf: sipush 166
      // 1c2: ldc2_w 4130304297809828495
      // 1c5: lload 2
      // 1c6: lxor
      // 1c7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/po.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: pop
      // 1d0: goto 1dd
      // 1d3: ldc2_w 1364711235278248072
      // 1d6: lload 2
      // 1d7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 7
      // 1df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e2: areturn
   }

   static {
      long var20 = a ^ 50255258985213L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[21];
      int var16 = 0;
      String var15 = "NsaÉ#¨¤v\u008f\u0017'º.ú?½\u0017\u0006÷ù`\b*\u008a\u0011ËÖ¤|§\u000fÂ\u0010\u0094î\u00ad\n\u0082\u001dN\u007fÑÊ\u008bSC\u0081ü\u009d(V\u001d{\u0083B\u009aô¹ur~f8üø¸É\\IíÊçØ-Êr2Ûçñb¼ÓçbÅ\"Þ\u0092O\u0010\u0086¦èå\u0019Â\u00951,\u009e\u0012\nOôU\u0019\u0010÷yóàè\u009ebÁ«µ³±^n\u009d\u009d Ù£\u000bþf'êöÛ\u0001+OÏ¹\u0011\u00814hÍm\u0016½òúOv\u0095X=\u0088Ü« ÈÁGZj\u0090Í/Ù¡r\u0011pÕ\u001f]\u0006½$J\u0019ôl(k¶J\u0006E&\u0088Â\u0010Ù¹\u0014±ÕÂfefl\u009a\u0015{\u0000Eü\u0010?n\u0004!\u001b=E\u0089\u0001ÁAüÞRÅO -\u008a\u0010>\u009a\u0099N\u009b0&\rjö\u0099\u0013²\u0015æÇO\u0086Û3\u0011\u0095\u0000\u0080OnâëÞ\u0010Õ¦»\u0093W¢LÐ\u0085KK\u001c³\u0091-®\u0010j\u0095\n9i\u008b\u0019ßî²»G©²_Z\u0010\u0000\u0012ZãÑ;\u0095¥\u0086\u0089¨\u0084\u0087`4û ac\u001b·y:û\u0015\u008fH8\u007f<Xæð\u000b*\u008e´àSF\u0098ÀDuù\u0081&ÀÆ(w\u0019~¡xØ\u00113g\u0010ð\u0019¶ÈJßvÃ\u0080»æ*\u009eUoÄÐL8\u0081ò·üD\u001b\nz\u0001ìz\u0010;\u008fE¹\u0016Ð\u0081\u0006\u001dy\u000f»w>`@(\u0084ß\bn1É\u0084\u0090n\u000b¨¹z]\u009a\u008cL\u0090K\t(XÙ\u0087=S6«I Æ\u0011on\"\u00ad9.ÄÍ\u0098P¬\u0016\u009a\f \u0005MV\u0090¹\u0004¼ZXzA¨\u009d8w\u0090ª|åPg yEþ?aYó´\nDý½~ö\u0012hºt,@\u0092\u0082<¿´sNd+±·£¬3ÿÑIXò:t»Î´Íù0^Å½\u0019ð%\u001apµç\u0010JAî\u001c¶ÐÇ%nò¿7\r`ç\u0083\u0085\u0098GlÃÂå«øÖ\nðPÄÝ õ¬å4³ï\u0013ò\u001f9f%d\u0000×\bþ;ÈÝG\u0089K}½¿#\u0011\u009fçµô\u008c\u0000\u0018·\n\u0002^¦'\u0000\u008aß,ÿkM¥«\u0088SíU\b\u0003\u001b£G";
      int var17 = "NsaÉ#¨¤v\u008f\u0017'º.ú?½\u0017\u0006÷ù`\b*\u008a\u0011ËÖ¤|§\u000fÂ\u0010\u0094î\u00ad\n\u0082\u001dN\u007fÑÊ\u008bSC\u0081ü\u009d(V\u001d{\u0083B\u009aô¹ur~f8üø¸É\\IíÊçØ-Êr2Ûçñb¼ÓçbÅ\"Þ\u0092O\u0010\u0086¦èå\u0019Â\u00951,\u009e\u0012\nOôU\u0019\u0010÷yóàè\u009ebÁ«µ³±^n\u009d\u009d Ù£\u000bþf'êöÛ\u0001+OÏ¹\u0011\u00814hÍm\u0016½òúOv\u0095X=\u0088Ü« ÈÁGZj\u0090Í/Ù¡r\u0011pÕ\u001f]\u0006½$J\u0019ôl(k¶J\u0006E&\u0088Â\u0010Ù¹\u0014±ÕÂfefl\u009a\u0015{\u0000Eü\u0010?n\u0004!\u001b=E\u0089\u0001ÁAüÞRÅO -\u008a\u0010>\u009a\u0099N\u009b0&\rjö\u0099\u0013²\u0015æÇO\u0086Û3\u0011\u0095\u0000\u0080OnâëÞ\u0010Õ¦»\u0093W¢LÐ\u0085KK\u001c³\u0091-®\u0010j\u0095\n9i\u008b\u0019ßî²»G©²_Z\u0010\u0000\u0012ZãÑ;\u0095¥\u0086\u0089¨\u0084\u0087`4û ac\u001b·y:û\u0015\u008fH8\u007f<Xæð\u000b*\u008e´àSF\u0098ÀDuù\u0081&ÀÆ(w\u0019~¡xØ\u00113g\u0010ð\u0019¶ÈJßvÃ\u0080»æ*\u009eUoÄÐL8\u0081ò·üD\u001b\nz\u0001ìz\u0010;\u008fE¹\u0016Ð\u0081\u0006\u001dy\u000f»w>`@(\u0084ß\bn1É\u0084\u0090n\u000b¨¹z]\u009a\u008cL\u0090K\t(XÙ\u0087=S6«I Æ\u0011on\"\u00ad9.ÄÍ\u0098P¬\u0016\u009a\f \u0005MV\u0090¹\u0004¼ZXzA¨\u009d8w\u0090ª|åPg yEþ?aYó´\nDý½~ö\u0012hºt,@\u0092\u0082<¿´sNd+±·£¬3ÿÑIXò:t»Î´Íù0^Å½\u0019ð%\u001apµç\u0010JAî\u001c¶ÐÇ%nò¿7\r`ç\u0083\u0085\u0098GlÃÂå«øÖ\nðPÄÝ õ¬å4³ï\u0013ò\u001f9f%d\u0000×\bþ;ÈÝG\u0089K}½¿#\u0011\u009fçµô\u008c\u0000\u0018·\n\u0002^¦'\u0000\u008aß,ÿkM¥«\u0088SíU\b\u0003\u001b£G"
         .length();
      char var14 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[21];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0098Ïãfy\u0005¿Ù|\\ë_rn\u0085aF»\u0097 ÊilöTø\u0093`\n%\u0086_";
                     int var5 = "\u0098Ïãfy\u0005¿Ù|\\ë_rn\u0085aF»\u0097 ÊilöTø\u0093`\n%\u0086_".length();
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
                                    g = var6;
                                    h = new Integer[6];
                                    x44.a<"p">(
                                       a<"e">(1712, 8142075996234625818L ^ var20)
                                             .replace((char)b<"p">(21890, 325999031981492586L ^ var20), x44.a<"h">(8904357782458821369L, var20))
                                          + a<"e">(6497, 8021920677701561550L ^ var20),
                                       7027556633801158017L,
                                       var20
                                    );
                                    Y = a<"e">(13044, 1222117086024959828L ^ var20)
                                       + x44.a<"h">(8732755050300283575L, var20)
                                       + a<"e">(7402, 5129163074603395418L ^ var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "¢é%CÔQï)ç\u0003Ë\u007fUãF\"";
                                 var5 = "¢é%CÔQï)ç\u0003Ë\u007fUãF\"".length();
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

                  var15 = "\u000fùeÅ&¹Ke-¥sL¤Ö \u0083Ö´¬Ü\u009eüb\u0019£\u0081Ö\u0093Áa\u0080z¦§\u0089Ñ·C\u0010S\u0018'\u008bÀ\u009b¦Û\n3¤!{\u008f\u0092\"ä\u0018\u0006\u0004¤ò\u0082Úù\u00ad";
                  var17 = "\u000fùeÅ&¹Ke-¥sL¤Ö \u0083Ö´¬Ü\u009eüb\u0019£\u0081Ö\u0093Áa\u0080z¦§\u0089Ñ·C\u0010S\u0018'\u008bÀ\u009b¦Û\n3¤!{\u008f\u0092\"ä\u0018\u0006\u0004¤ò\u0082Úù\u00ad"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public String P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -1974326963569232315L, var2);
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      qx var2 = (qx)var1[1];
      var3 = a ^ var3;
      x44.a<"t">(this, var2, 1647478611155323091L, var3);
   }

   private static String T(Object[] param0) {
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
      // 015: checkcast java/util/Set
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/po.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 57247694237302
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 25868333189640
      // 02d: lxor
      // 02e: lstore 7
      // 030: pop2
      // 031: aload 3
      // 032: aload 4
      // 034: lload 7
      // 036: bipush 3
      // 037: anewarray 656
      // 03a: dup_x2
      // 03b: dup_x2
      // 03c: pop
      // 03d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 040: bipush 2
      // 041: swap
      // 042: aastore
      // 043: dup_x1
      // 044: swap
      // 045: bipush 1
      // 046: swap
      // 047: aastore
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 0
      // 04b: swap
      // 04c: aastore
      // 04d: ldc2_w 6371097359156602595
      // 050: lload 1
      // 051: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: astore 10
      // 058: ldc2_w 6844175205484249827
      // 05b: lload 1
      // 05c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: new java/lang/StringBuilder
      // 064: dup
      // 065: invokespecial java/lang/StringBuilder.<init> ()V
      // 068: astore 11
      // 06a: bipush 0
      // 06b: istore 12
      // 06d: astore 9
      // 06f: iload 12
      // 071: aload 10
      // 073: invokeinterface java/util/List.size ()I 1
      // 078: if_icmpge 1ea
      // 07b: aload 10
      // 07d: iload 12
      // 07f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 084: astore 13
      // 086: bipush 0
      // 087: istore 14
      // 089: aload 13
      // 08b: aload 9
      // 08d: ifnonnull 0f4
      // 090: instanceof java/io/File
      // 093: aload 9
      // 095: ifnonnull 1f1
      // 098: goto 0a5
      // 09b: ldc2_w 6384439782954947298
      // 09e: lload 1
      // 09f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: ifeq 0de
      // 0a8: goto 0b5
      // 0ab: ldc2_w 6384439782954947298
      // 0ae: lload 1
      // 0af: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 11
      // 0b7: aload 10
      // 0b9: iload 12
      // 0bb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c0: checkcast java/io/File
      // 0c3: ldc2_w 6552179418401084141
      // 0c6: lload 1
      // 0c7: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: pop
      // 0d0: bipush 1
      // 0d1: lload 1
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 190
      // 0d7: istore 14
      // 0d9: aload 9
      // 0db: ifnull 18e
      // 0de: aload 10
      // 0e0: iload 12
      // 0e2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e7: goto 0f4
      // 0ea: ldc2_w 6384439782954947298
      // 0ed: lload 1
      // 0ee: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: checkcast com/zelix/_ux
      // 0f7: astore 15
      // 0f9: ldc2_w 5070409769657003389
      // 0fc: lload 1
      // 0fd: invokedynamic n (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: aload 9
      // 104: ifnonnull 18c
      // 107: ifne 16d
      // 10a: goto 117
      // 10d: ldc2_w 6384439782954947298
      // 110: lload 1
      // 111: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 15
      // 119: ldc2_w 4755428543372009008
      // 11c: lload 1
      // 11d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: lload 5
      // 124: bipush 2
      // 125: anewarray 656
      // 128: dup_x2
      // 129: dup_x2
      // 12a: pop
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: bipush 1
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w 4742096163426764755
      // 139: lload 1
      // 13a: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 9
      // 141: lload 1
      // 142: lconst_0
      // 143: lcmp
      // 144: ifle 19a
      // 147: ifnonnull 192
      // 14a: goto 157
      // 14d: ldc2_w 6384439782954947298
      // 150: lload 1
      // 151: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: lload 1
      // 158: lconst_0
      // 159: lcmp
      // 15a: iflt 190
      // 15d: ifne 18e
      // 160: goto 16d
      // 163: ldc2_w 6384439782954947298
      // 166: lload 1
      // 167: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 11
      // 16f: aload 15
      // 171: ldc2_w 4755428543372009008
      // 174: lload 1
      // 175: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: pop
      // 17e: bipush 1
      // 17f: goto 18c
      // 182: ldc2_w 6384439782954947298
      // 185: lload 1
      // 186: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: istore 14
      // 18e: iload 12
      // 190: bipush 1
      // 191: iadd
      // 192: lload 1
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 1c3
      // 198: aload 9
      // 19a: ifnonnull 1c3
      // 19d: aload 10
      // 19f: invokeinterface java/util/List.size ()I 1
      // 1a4: if_icmpge 1e2
      // 1a7: goto 1b4
      // 1aa: ldc2_w 6384439782954947298
      // 1ad: lload 1
      // 1ae: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: iload 14
      // 1b6: goto 1c3
      // 1b9: ldc2_w 6384439782954947298
      // 1bc: lload 1
      // 1bd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: ifeq 1e2
      // 1c6: aload 11
      // 1c8: ldc2_w 4917722867535090985
      // 1cb: lload 1
      // 1cc: invokedynamic n (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1d4: pop
      // 1d5: goto 1e2
      // 1d8: ldc2_w 6384439782954947298
      // 1db: lload 1
      // 1dc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: iinc 12 1
      // 1e5: aload 9
      // 1e7: ifnull 06f
      // 1ea: lload 1
      // 1eb: lconst_0
      // 1ec: lcmp
      // 1ed: ifle 1f3
      // 1f0: bipush 0
      // 1f1: istore 12
      // 1f3: iload 12
      // 1f5: aload 10
      // 1f7: invokeinterface java/util/List.size ()I 1
      // 1fc: if_icmpge 256
      // 1ff: aload 10
      // 201: iload 12
      // 203: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 208: astore 13
      // 20a: aload 9
      // 20c: lload 1
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: ifle 253
      // 212: ifnonnull 251
      // 215: aload 13
      // 217: instanceof com/zelix/_ux
      // 21a: ifeq 24e
      // 21d: goto 22a
      // 220: ldc2_w 6384439782954947298
      // 223: lload 1
      // 224: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 10
      // 22c: iload 12
      // 22e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 233: checkcast com/zelix/_ux
      // 236: ldc2_w 4839707696860530199
      // 239: lload 1
      // 23a: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: goto 24e
      // 242: ldc2_w 6384439782954947298
      // 245: lload 1
      // 246: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: athrow
      // 24c: astore 14
      // 24e: iinc 12 1
      // 251: aload 9
      // 253: ifnull 1f3
      // 256: aload 11
      // 258: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25b: lload 1
      // 25c: lconst_0
      // 25d: lcmp
      // 25e: iflt 208
      // 261: areturn
   }

   public static boolean H(Object[] param0) {
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
      // 04: checkcast java/util/Set
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/po.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -1569199495131924959
      // 1c: lload 2
      // 1d: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 1
      // 25: invokeinterface java/util/Set.size ()I 1
      // 2a: aload 4
      // 2c: ifnonnull a0
      // 2f: ifle 9f
      // 32: goto 3f
      // 35: ldc2_w -1416269512495700448
      // 38: lload 2
      // 39: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 1
      // 40: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 45: astore 5
      // 47: aload 5
      // 49: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4e: ifeq 9f
      // 51: aload 5
      // 53: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 58: checkcast java/lang/String
      // 5b: astore 6
      // 5d: aload 6
      // 5f: ldc2_w -695710867606733306
      // 62: lload 2
      // 63: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 6b: aload 4
      // 6d: lload 2
      // 6e: lconst_0
      // 6f: lcmp
      // 70: iflt 78
      // 73: ifnonnull a0
      // 76: aload 4
      // 78: ifnonnull 99
      // 7b: goto 88
      // 7e: ldc2_w -1416269512495700448
      // 81: lload 2
      // 82: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: ifeq 9a
      // 8b: goto 98
      // 8e: ldc2_w -1416269512495700448
      // 91: lload 2
      // 92: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: bipush 1
      // 99: ireturn
      // 9a: aload 4
      // 9c: ifnull 47
      // 9f: bipush 0
      // a0: ireturn
   }

   public qx E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 7692503467282396367L, var2);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18398;
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
            throw new RuntimeException("com/zelix/po", var10);
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
         c[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/po" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28305;
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
            throw new RuntimeException("com/zelix/po", var14);
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
         throw new RuntimeException("com/zelix/po" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
