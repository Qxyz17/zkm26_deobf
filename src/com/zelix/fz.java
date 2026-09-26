package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fz {
   private g1 Z;
   public static final int X;
   private boolean u;
   private String m;
   private ArrayList r;
   private static final long a = prr.a(1396205802945032172L, 7820586240721556815L, MethodHandles.lookup().lookupClass()).a(102411057165509L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, 8329770795214085545L, var2);
   }

   public String v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, -2869987220130045043L, var2);
   }

   public void h(Object[] param1) {
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
      // 00e: checkcast com/zelix/fz
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/fz.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 132229685147806
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -2929405691100259522
      // 025: lload 3
      // 026: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 7
      // 02d: aload 0
      // 02e: aload 0
      // 02f: ldc2_w -3723538944052944285
      // 032: lload 3
      // 033: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: aload 7
      // 03a: ifnull 07a
      // 03d: ifne 079
      // 040: goto 04d
      // 043: ldc2_w -3504674201641978295
      // 046: lload 3
      // 047: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 2
      // 04e: ldc2_w -3723538944052944285
      // 051: lload 3
      // 052: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: aload 7
      // 059: ifnull 07a
      // 05c: goto 069
      // 05f: ldc2_w -3504674201641978295
      // 062: lload 3
      // 063: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: ifeq 07d
      // 06c: goto 079
      // 06f: ldc2_w -3504674201641978295
      // 072: lload 3
      // 073: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 07e
      // 07d: bipush 0
      // 07e: ldc2_w -3723538944052944285
      // 081: lload 3
      // 082: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: lload 5
      // 089: bipush 1
      // 08a: anewarray 22
      // 08d: dup_x2
      // 08e: dup_x2
      // 08f: pop
      // 090: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: ldc2_w -3117982251112616647
      // 099: lload 3
      // 09a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: astore 8
      // 0a1: aload 0
      // 0a2: ldc2_w -3055659726402471890
      // 0a5: lload 3
      // 0a6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: ldc2_w -2888778331913262416
      // 0ae: lload 3
      // 0af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0b9: astore 9
      // 0bb: aload 9
      // 0bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c2: ifeq 110
      // 0c5: aload 9
      // 0c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cc: checkcast java/util/Map$Entry
      // 0cf: astore 10
      // 0d1: aload 10
      // 0d3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0d8: checkcast java/lang/String
      // 0db: astore 11
      // 0dd: aload 11
      // 0df: aload 7
      // 0e1: ifnull 15c
      // 0e4: ifnull 10b
      // 0e7: goto 0f4
      // 0ea: ldc2_w -3504674201641978295
      // 0ed: lload 3
      // 0ee: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 8
      // 0f6: aload 11
      // 0f8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0fd: pop
      // 0fe: goto 10b
      // 101: ldc2_w -3504674201641978295
      // 104: lload 3
      // 105: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 7
      // 10d: ifnonnull 0bb
      // 110: aload 2
      // 111: ldc2_w -3055659726402471890
      // 114: lload 3
      // 115: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: ldc2_w -2888778331913262416
      // 11d: lload 3
      // 11e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 128: lload 3
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 0cc
      // 12e: astore 9
      // 130: aload 9
      // 132: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 137: ifeq 230
      // 13a: aload 9
      // 13c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 141: checkcast java/util/Map$Entry
      // 144: astore 10
      // 146: aload 10
      // 148: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 14d: checkcast java/lang/String
      // 150: astore 11
      // 152: aload 10
      // 154: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 159: checkcast java/lang/String
      // 15c: astore 12
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: iflt 1ca
      // 164: aload 12
      // 166: ifnull 1ca
      // 169: aload 8
      // 16b: lload 3
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: ifle 1be
      // 171: aload 7
      // 173: ifnull 1be
      // 176: goto 183
      // 179: ldc2_w -3504674201641978295
      // 17c: lload 3
      // 17d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 12
      // 185: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 18a: ifeq 22b
      // 18d: goto 19a
      // 190: ldc2_w -3504674201641978295
      // 193: lload 3
      // 194: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 0
      // 19b: ldc2_w -3055659726402471890
      // 19e: lload 3
      // 19f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: aload 11
      // 1a6: aload 12
      // 1a8: ldc2_w -3196539299498506685
      // 1ab: lload 3
      // 1ac: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: goto 1be
      // 1b4: ldc2_w -3504674201641978295
      // 1b7: lload 3
      // 1b8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: pop
      // 1bf: aload 7
      // 1c1: lload 3
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: iflt 22d
      // 1c7: ifnonnull 22b
      // 1ca: aload 0
      // 1cb: ldc2_w -3055659726402471890
      // 1ce: lload 3
      // 1cf: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: lload 3
      // 1d5: lconst_0
      // 1d6: lcmp
      // 1d7: ifle 22a
      // 1da: aload 11
      // 1dc: aload 7
      // 1de: ifnull 220
      // 1e1: goto 1ee
      // 1e4: ldc2_w -3504674201641978295
      // 1e7: lload 3
      // 1e8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: ldc2_w -3691577887868357451
      // 1f1: lload 3
      // 1f2: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: ifne 22b
      // 1fa: goto 207
      // 1fd: ldc2_w -3504674201641978295
      // 200: lload 3
      // 201: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 0
      // 208: ldc2_w -3055659726402471890
      // 20b: lload 3
      // 20c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: aload 11
      // 213: goto 220
      // 216: ldc2_w -3504674201641978295
      // 219: lload 3
      // 21a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: athrow
      // 220: aconst_null
      // 221: ldc2_w -3196539299498506685
      // 224: lload 3
      // 225: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: pop
      // 22b: aload 7
      // 22d: ifnonnull 130
      // 230: return
   }

   public void r(Object[] param1) {
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
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/fz.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 128801017604341
      // 027: lxor
      // 028: lstore 6
      // 02a: pop2
      // 02b: new java/lang/StringBuilder
      // 02e: dup
      // 02f: invokespecial java/lang/StringBuilder.<init> ()V
      // 032: sipush 13071
      // 035: ldc2_w 3434356325029976704
      // 038: lload 2
      // 039: lxor
      // 03a: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 042: aload 0
      // 043: ldc2_w 1082198748981769378
      // 046: lload 2
      // 047: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04f: sipush 15674
      // 052: ldc2_w 6337949992452199603
      // 055: lload 2
      // 056: lxor
      // 057: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: aload 4
      // 061: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 064: ldc "'"
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06c: astore 9
      // 06e: aload 0
      // 06f: ldc2_w 1082198748981769378
      // 072: lload 2
      // 073: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: bipush 1
      // 079: anewarray 22
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 0
      // 07f: swap
      // 080: aastore
      // 081: ldc2_w 586973755395116259
      // 084: lload 2
      // 085: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: astore 10
      // 08c: ldc2_w 1054108026714768070
      // 08f: lload 2
      // 090: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: aload 10
      // 097: lload 6
      // 099: invokestatic com/zelix/l62.B (Ljava/lang/String;J)Lcom/zelix/_f;
      // 09c: astore 11
      // 09e: astore 8
      // 0a0: aload 11
      // 0a2: aload 8
      // 0a4: ifnull 0cf
      // 0a7: ifnull 0d0
      // 0aa: goto 0b7
      // 0ad: ldc2_w 1631637601245573041
      // 0b0: lload 2
      // 0b1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 5
      // 0b9: aload 11
      // 0bb: aload 9
      // 0bd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c2: goto 0cf
      // 0c5: ldc2_w 1631637601245573041
      // 0c8: lload 2
      // 0c9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: pop
      // 0d0: bipush 0
      // 0d1: istore 12
      // 0d3: iload 12
      // 0d5: aload 0
      // 0d6: ldc2_w 1535472236627312365
      // 0d9: lload 2
      // 0da: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/util/ArrayList.size ()I
      // 0e2: if_icmpge 152
      // 0e5: aload 0
      // 0e6: ldc2_w 1535472236627312365
      // 0e9: lload 2
      // 0ea: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: iload 12
      // 0f1: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0f4: checkcast java/lang/String
      // 0f7: bipush 1
      // 0f8: anewarray 22
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: ldc2_w 586973755395116259
      // 103: lload 2
      // 104: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: astore 13
      // 10b: aload 13
      // 10d: lload 6
      // 10f: invokestatic com/zelix/l62.B (Ljava/lang/String;J)Lcom/zelix/_f;
      // 112: astore 14
      // 114: aload 8
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 14f
      // 11c: ifnull 14d
      // 11f: aload 14
      // 121: ifnull 14a
      // 124: goto 131
      // 127: ldc2_w 1631637601245573041
      // 12a: lload 2
      // 12b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: aload 5
      // 133: aload 14
      // 135: aload 9
      // 137: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 13c: pop
      // 13d: goto 14a
      // 140: ldc2_w 1631637601245573041
      // 143: lload 2
      // 144: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: iinc 12 1
      // 14d: aload 8
      // 14f: ifnonnull 0d3
      // 152: return
   }

   public fz(ZipFile param1, long param2, ZipEntry param4, byte param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: bipush 8
      // 003: lshl
      // 004: iload 5
      // 006: i2l
      // 007: bipush 56
      // 009: lshl
      // 00a: bipush 56
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic com/zelix/fz.a J
      // 011: lxor
      // 012: lstore 6
      // 014: lload 6
      // 016: dup2
      // 017: ldc2_w 135418505110994
      // 01a: lxor
      // 01b: dup2
      // 01c: bipush 48
      // 01e: lushr
      // 01f: l2i
      // 020: istore 8
      // 022: dup2
      // 023: bipush 16
      // 025: lshl
      // 026: bipush 48
      // 028: lushr
      // 029: l2i
      // 02a: istore 9
      // 02c: dup2
      // 02d: bipush 32
      // 02f: lshl
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 10
      // 036: pop2
      // 037: dup2
      // 038: ldc2_w 90491582352453
      // 03b: lxor
      // 03c: lstore 11
      // 03e: pop2
      // 03f: ldc2_w -3354116043549434603
      // 042: lload 6
      // 044: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: aload 0
      // 04a: invokespecial java/lang/Object.<init> ()V
      // 04d: aload 0
      // 04e: new com/zelix/g1
      // 051: dup
      // 052: iload 8
      // 054: i2s
      // 055: iload 9
      // 057: i2c
      // 058: iload 10
      // 05a: invokespecial com/zelix/g1.<init> (SCI)V
      // 05d: ldc2_w -3192069607151485435
      // 060: lload 6
      // 062: invokedynamic v (Ljava/lang/Object;Lcom/zelix/g1;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: aload 0
      // 068: new java/util/ArrayList
      // 06b: dup
      // 06c: invokespecial java/util/ArrayList.<init> ()V
      // 06f: ldc2_w -3847147970477563586
      // 072: lload 6
      // 074: invokedynamic v (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: astore 13
      // 07b: aload 0
      // 07c: aload 4
      // 07e: ldc2_w -3707194922788577491
      // 081: lload 6
      // 083: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: aload 13
      // 08a: ifnull 0bb
      // 08d: sipush 10821
      // 090: ldc2_w 4827711667876500648
      // 093: lload 6
      // 095: lxor
      // 096: invokedynamic r (IJ)I bsm=com/zelix/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: if_icmpne 0be
      // 09e: goto 0ac
      // 0a1: ldc2_w -3929525570951614366
      // 0a4: lload 6
      // 0a6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: bipush 1
      // 0ad: goto 0bb
      // 0b0: ldc2_w -3929525570951614366
      // 0b3: lload 6
      // 0b5: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: goto 0bf
      // 0be: bipush 0
      // 0bf: ldc2_w -3857274535499914168
      // 0c2: lload 6
      // 0c4: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: aload 0
      // 0ca: aload 4
      // 0cc: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 0cf: ldc2_w -3656571915684748290
      // 0d2: lload 6
      // 0d4: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0dc: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0df: ldc2_w -3398099407800177807
      // 0e2: lload 6
      // 0e4: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aconst_null
      // 0ea: astore 14
      // 0ec: aconst_null
      // 0ed: astore 15
      // 0ef: aload 1
      // 0f0: aload 4
      // 0f2: ldc2_w -3222598759668975985
      // 0f5: lload 6
      // 0f7: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: astore 14
      // 0fe: lload 11
      // 100: aload 14
      // 102: sipush 19045
      // 105: ldc2_w 7240356738153233467
      // 108: lload 6
      // 10a: lxor
      // 10b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aconst_null
      // 111: bipush 4
      // 112: anewarray 22
      // 115: dup_x1
      // 116: swap
      // 117: bipush 3
      // 118: swap
      // 119: aastore
      // 11a: dup_x1
      // 11b: swap
      // 11c: bipush 2
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x2
      // 125: dup_x2
      // 126: pop
      // 127: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w -2954818662889767165
      // 130: lload 6
      // 132: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/BufferedReader; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: astore 15
      // 139: aload 15
      // 13b: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 13e: dup
      // 13f: astore 16
      // 141: ifnull 24d
      // 144: aload 16
      // 146: astore 17
      // 148: aload 16
      // 14a: ldc "#"
      // 14c: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 14f: istore 18
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 284
      // 157: aload 13
      // 159: ifnull 284
      // 15c: iload 18
      // 15e: lload 2
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 1d6
      // 164: aload 13
      // 166: ifnull 1d6
      // 169: goto 177
      // 16c: ldc2_w -3929525570951614366
      // 16f: lload 6
      // 171: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: bipush -1
      // 178: if_icmpeq 1b7
      // 17b: goto 189
      // 17e: ldc2_w -3929525570951614366
      // 181: lload 6
      // 183: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: iload 18
      // 18b: ifle 1b3
      // 18e: goto 19c
      // 191: ldc2_w -3929525570951614366
      // 194: lload 6
      // 196: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: aload 16
      // 19e: bipush 0
      // 19f: iload 18
      // 1a1: bipush 1
      // 1a2: isub
      // 1a3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1a6: astore 17
      // 1a8: lload 2
      // 1a9: lconst_0
      // 1aa: lcmp
      // 1ab: ifle 1be
      // 1ae: aload 13
      // 1b0: ifnonnull 1b7
      // 1b3: ldc ""
      // 1b5: astore 17
      // 1b7: aload 17
      // 1b9: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1bc: astore 17
      // 1be: aload 17
      // 1c0: aload 13
      // 1c2: ifnull 247
      // 1c5: invokevirtual java/lang/String.length ()I
      // 1c8: goto 1d6
      // 1cb: ldc2_w -3929525570951614366
      // 1ce: lload 6
      // 1d0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: iload 5
      // 1d8: iflt 1ee
      // 1db: ifle 221
      // 1de: aload 0
      // 1df: ldc2_w -3847147970477563586
      // 1e2: lload 6
      // 1e4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: aload 17
      // 1eb: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ee: pop
      // 1ef: aload 0
      // 1f0: ldc2_w -3192069607151485435
      // 1f3: lload 6
      // 1f5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: aload 16
      // 1fc: aload 17
      // 1fe: ldc2_w -3059918591954861976
      // 201: lload 6
      // 203: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: pop
      // 209: aload 13
      // 20b: iload 5
      // 20d: ifle 24a
      // 210: ifnonnull 248
      // 213: goto 221
      // 216: ldc2_w -3929525570951614366
      // 219: lload 6
      // 21b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 0
      // 222: ldc2_w -3192069607151485435
      // 225: lload 6
      // 227: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 16
      // 22e: aconst_null
      // 22f: ldc2_w -3059918591954861976
      // 232: lload 6
      // 234: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: goto 247
      // 23c: ldc2_w -3929525570951614366
      // 23f: lload 6
      // 241: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: pop
      // 248: aload 13
      // 24a: ifnonnull 139
      // 24d: iload 5
      // 24f: iflt 284
      // 252: lload 2
      // 253: lconst_0
      // 254: lcmp
      // 255: iflt 27c
      // 258: aload 15
      // 25a: aload 13
      // 25c: ifnull 272
      // 25f: ifnull 284
      // 262: goto 270
      // 265: ldc2_w -3929525570951614366
      // 268: lload 6
      // 26a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 15
      // 272: ldc2_w -3955046040652023458
      // 275: lload 6
      // 277: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: goto 330
      // 27f: astore 16
      // 281: goto 330
      // 284: lload 2
      // 285: lconst_0
      // 286: lcmp
      // 287: iflt 2ae
      // 28a: aload 14
      // 28c: aload 13
      // 28e: ifnull 2a4
      // 291: ifnull 330
      // 294: goto 2a2
      // 297: ldc2_w -3929525570951614366
      // 29a: lload 6
      // 29c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: aload 14
      // 2a4: ldc2_w -3987872319574512120
      // 2a7: lload 6
      // 2a9: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: goto 330
      // 2b1: astore 16
      // 2b3: goto 330
      // 2b6: astore 19
      // 2b8: iload 5
      // 2ba: iflt 2e1
      // 2bd: aload 15
      // 2bf: aload 13
      // 2c1: ifnull 2d7
      // 2c4: ifnull 2f1
      // 2c7: goto 2d5
      // 2ca: ldc2_w -3929525570951614366
      // 2cd: lload 6
      // 2cf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: aload 15
      // 2d7: ldc2_w -3955046040652023458
      // 2da: lload 6
      // 2dc: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: goto 32d
      // 2e4: astore 20
      // 2e6: lload 2
      // 2e7: lconst_0
      // 2e8: lcmp
      // 2e9: iflt 2f1
      // 2ec: aload 13
      // 2ee: ifnonnull 32d
      // 2f1: iload 5
      // 2f3: iflt 328
      // 2f6: aload 14
      // 2f8: aload 13
      // 2fa: ifnull 31e
      // 2fd: goto 30b
      // 300: ldc2_w -3929525570951614366
      // 303: lload 6
      // 305: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: ifnull 32d
      // 30e: goto 31c
      // 311: ldc2_w -3929525570951614366
      // 314: lload 6
      // 316: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: athrow
      // 31c: aload 14
      // 31e: ldc2_w -3987872319574512120
      // 321: lload 6
      // 323: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: goto 32d
      // 32b: astore 20
      // 32d: aload 19
      // 32f: athrow
      // 330: return
   }

   public String U(Object[] var1) {
      v8 var4 = (v8)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 25367623933887L;
      String var7 = m44.a<"p">(this, -6301679165772033235L, var2)
         .replace((char)b<"r">(26611, 1910995016018633031L ^ var2), (char)b<"r">(32210, 4023823297541225312L ^ var2));
      String var8 = (String)cf.J(var5, var7, var4);
      String var9 = var8.replace((char)b<"r">(32210, 4023823297541225312L ^ var2), (char)b<"r">(26611, 1910995016018633031L ^ var2));
      return a<"s">(27790, 7054679403675148937L ^ var2) + var9;
   }

   public void U(Object[] param1) {
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
      // 00a: lstore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/zip/ZipOutputStream
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/v8
      // 021: astore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: istore 5
      // 02d: pop
      // 02e: getstatic com/zelix/fz.a J
      // 031: lload 6
      // 033: lxor
      // 034: lstore 6
      // 036: lload 6
      // 038: dup2
      // 039: ldc2_w 4345069691712
      // 03c: lxor
      // 03d: lstore 8
      // 03f: dup2
      // 040: ldc2_w 122732462193371
      // 043: lxor
      // 044: lstore 10
      // 046: dup2
      // 047: ldc2_w 86522232103426
      // 04a: lxor
      // 04b: lstore 12
      // 04d: dup2
      // 04e: ldc2_w 53814969665976
      // 051: lxor
      // 052: lstore 14
      // 054: dup2
      // 055: ldc2_w 60376768133554
      // 058: lxor
      // 059: lstore 16
      // 05b: dup2
      // 05c: ldc2_w 98668357582453
      // 05f: lxor
      // 060: lstore 18
      // 062: pop2
      // 063: new com/zelix/y5
      // 066: dup
      // 067: lload 18
      // 069: aload 2
      // 06a: aload 0
      // 06b: aload 3
      // 06c: lload 12
      // 06e: bipush 2
      // 06f: anewarray 22
      // 072: dup_x2
      // 073: dup_x2
      // 074: pop
      // 075: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 078: bipush 1
      // 079: swap
      // 07a: aastore
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: ldc2_w -8042867102546956423
      // 083: lload 6
      // 085: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: iload 5
      // 08c: invokespecial com/zelix/y5.<init> (JLjava/util/zip/ZipOutputStream;Ljava/lang/String;Z)V
      // 08f: astore 21
      // 091: ldc2_w -8337351417488326611
      // 094: lload 6
      // 096: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: new java/io/PrintWriter
      // 09e: dup
      // 09f: new java/io/OutputStreamWriter
      // 0a2: dup
      // 0a3: aload 21
      // 0a5: lload 14
      // 0a7: bipush 1
      // 0a8: anewarray 22
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: ldc2_w -8030448443423281736
      // 0b7: lload 6
      // 0b9: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/OutputStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: sipush 28013
      // 0c1: ldc2_w 1189952179138250248
      // 0c4: lload 6
      // 0c6: lxor
      // 0c7: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 0cf: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 0d2: astore 22
      // 0d4: astore 20
      // 0d6: aload 0
      // 0d7: ldc2_w -8175313501248265411
      // 0da: lload 6
      // 0dc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/g1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: ldc2_w -8287870788006923869
      // 0e4: lload 6
      // 0e6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: astore 23
      // 0ed: aload 23
      // 0ef: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0f4: astore 24
      // 0f6: aload 24
      // 0f8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fd: ifeq 207
      // 100: aload 24
      // 102: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 107: checkcast java/util/Map$Entry
      // 10a: astore 25
      // 10c: aload 25
      // 10e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 113: checkcast java/lang/String
      // 116: astore 26
      // 118: aload 25
      // 11a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 11f: checkcast java/lang/String
      // 122: astore 27
      // 124: aload 20
      // 126: lload 6
      // 128: lconst_0
      // 129: lcmp
      // 12a: iflt 132
      // 12d: ifnull 23d
      // 130: aload 20
      // 132: ifnull 202
      // 135: goto 143
      // 138: ldc2_w -7759830364237648550
      // 13b: lload 6
      // 13d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 27
      // 145: ifnull 1fb
      // 148: goto 156
      // 14b: ldc2_w -7759830364237648550
      // 14e: lload 6
      // 150: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: aload 27
      // 158: sipush 22247
      // 15b: ldc2_w 8783639919973250355
      // 15e: lload 6
      // 160: lxor
      // 161: invokedynamic r (IJ)I bsm=com/zelix/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: sipush 7733
      // 169: ldc2_w 5113187362800860642
      // 16c: lload 6
      // 16e: lxor
      // 16f: invokedynamic r (IJ)I bsm=com/zelix/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 177: astore 28
      // 179: lload 10
      // 17b: aload 28
      // 17d: aload 3
      // 17e: invokestatic com/zelix/cf.J (JLjava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
      // 181: checkcast java/lang/String
      // 184: astore 29
      // 186: aload 20
      // 188: lload 6
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 204
      // 18f: ifnull 202
      // 192: aload 28
      // 194: aload 29
      // 196: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 199: ifne 1fb
      // 19c: goto 1aa
      // 19f: ldc2_w -7759830364237648550
      // 1a2: lload 6
      // 1a4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: aload 26
      // 1ac: aload 27
      // 1ae: aload 29
      // 1b0: sipush 32210
      // 1b3: ldc2_w 4023690796109372932
      // 1b6: lload 6
      // 1b8: lxor
      // 1b9: invokedynamic r (IJ)I bsm=com/zelix/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: sipush 26611
      // 1c1: ldc2_w 1911020865486324771
      // 1c4: lload 6
      // 1c6: lxor
      // 1c7: invokedynamic r (IJ)I bsm=com/zelix/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1cf: lload 8
      // 1d1: dup2_x1
      // 1d2: pop2
      // 1d3: bipush 4
      // 1d4: anewarray 22
      // 1d7: dup_x1
      // 1d8: swap
      // 1d9: bipush 3
      // 1da: swap
      // 1db: aastore
      // 1dc: dup_x2
      // 1dd: dup_x2
      // 1de: pop
      // 1df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e2: bipush 2
      // 1e3: swap
      // 1e4: aastore
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 1
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 0
      // 1ed: swap
      // 1ee: aastore
      // 1ef: ldc2_w -8259652012355580789
      // 1f2: lload 6
      // 1f4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: astore 26
      // 1fb: aload 22
      // 1fd: aload 26
      // 1ff: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 202: aload 20
      // 204: ifnonnull 0f6
      // 207: aload 22
      // 209: ldc2_w -8079702624948731086
      // 20c: lload 6
      // 20e: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: aload 21
      // 215: aload 4
      // 217: lload 16
      // 219: bipush 2
      // 21a: anewarray 22
      // 21d: dup_x2
      // 21e: dup_x2
      // 21f: pop
      // 220: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 223: bipush 1
      // 224: swap
      // 225: aastore
      // 226: dup_x1
      // 227: swap
      // 228: bipush 0
      // 229: swap
      // 22a: aastore
      // 22b: ldc2_w -8299828321520290217
      // 22e: lload 6
      // 230: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/CRC32; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: pop
      // 236: lload 6
      // 238: lconst_0
      // 239: lcmp
      // 23a: iflt 23d
      // 23d: return
   }

   static {
      long var20 = a ^ 117923128286052L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "xgi¯\u0000w)ú\u008aôFµ!nGK(&\u0094ÌeòËü\u0011\u001d\u00ad\u000fÍ2|ª8\u0012¾ùáÌø.ã\u0004\u007f'X°Eªéùj{\u0082¿\u0092\u0002*(º!\u009d\u0084!->ø»l¬áç\u0096\u0019|Ã/éf\u0017ü\u0000A\u008b\u008f\u001f7ì$4Z'Àk\t\u00ad(t¨\u0010»\u0018\u001a\u008dØ\u0003UØ¦p\u0087(\u009dô\u0006\n";
      int var17 = "xgi¯\u0000w)ú\u008aôFµ!nGK(&\u0094ÌeòËü\u0011\u001d\u00ad\u000fÍ2|ª8\u0012¾ùáÌø.ã\u0004\u007f'X°Eªéùj{\u0082¿\u0092\u0002*(º!\u009d\u0084!->ø»l¬áç\u0096\u0019|Ã/éf\u0017ü\u0000A\u008b\u008f\u001f7ì$4Z'Àk\t\u00ad(t¨\u0010»\u0018\u001a\u008dØ\u0003UØ¦p\u0087(\u009dô\u0006\n"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[6];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u0081\u001eL\u001aV\u0082\u000b\u0012×¤kùôÙÕn\u009aÛÏþÝ\ba\u000b";
                     int var5 = "\u0081\u001eL\u001aV\u0082\u000b\u0012×¤kùôÙÕn\u009aÛÏþÝ\ba\u000b".length();
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
                                    f = new Integer[5];
                                    X = a<"s">(11128, 1065400531613893160L ^ var20).length();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0084íÝel\u0012ó\u0088X$\u0015öÕÚBÚ";
                                 var5 = "\u0084íÝel\u0012ó\u0088X$\u0015öÕÚBÚ".length();
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

                  var15 = "ç¹¶\rZ¶ÛÈ MOû\u0016\u0095\u009f=(úÕc\u0086;Ó4Jö\"\u0097$W§é\u0081y?\u008e\u008cÄæ>\u0081¾¹ª\u001c\t\u0098n4\u009eÏä\"Ø\u0094fË";
                  var17 = "ç¹¶\rZ¶ÛÈ MOû\u0016\u0095\u009f=(úÕc\u0086;Ó4Jö\"\u0097$W§é\u0081y?\u008e\u008cÄæ>\u0081¾¹ª\u001c\t\u0098n4\u009eÏä\"Ø\u0094fË"
                     .length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13651;
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
            throw new RuntimeException("com/zelix/fz", var10);
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
         throw new RuntimeException("com/zelix/fz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32225;
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
            throw new RuntimeException("com/zelix/fz", var14);
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
         throw new RuntimeException("com/zelix/fz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
