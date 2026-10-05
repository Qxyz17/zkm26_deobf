package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class is extends h8 implements _zv, sv {
   boolean M;
   mx F;
   int Z;
   byte[] f;
   x7 k;
   x7 p;
   private static final long a = ess.a(-4163485866932679470L, -4728486102358371993L, MethodHandles.lookup().lookupClass()).a(149937557263650L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   void S(Object[] param1) {
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
      // 0c: getstatic com/zelix/is.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 92649202826251
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 3953300416836534936
      // 1e: lload 2
      // 1f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: ldc2_w 3729496919298641274
      // 2a: lload 2
      // 2b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 6
      // 32: ifne 5c
      // 35: ifnull d8
      // 38: goto 45
      // 3b: ldc2_w 3614783985637987314
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w 3729496919298641274
      // 49: lload 2
      // 4a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 3614783985637987314
      // 55: lload 2
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 5f: iload 6
      // 61: ifne 93
      // 64: invokevirtual java/lang/String.length ()I
      // 67: ifle d8
      // 6a: goto 77
      // 6d: ldc2_w 3614783985637987314
      // 70: lload 2
      // 71: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: aload 0
      // 78: ldc2_w 3548426374609613684
      // 7b: lload 2
      // 7c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: lload 4
      // 83: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 86: goto 93
      // 89: ldc2_w 3614783985637987314
      // 8c: lload 2
      // 8d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: astore 7
      // 95: aload 7
      // 97: sipush 16326
      // 9a: ldc2_w 1404603758423282465
      // 9d: lload 2
      // 9e: lxor
      // 9f: invokedynamic j (IJ)I bsm=com/zelix/is.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: invokevirtual java/lang/String.lastIndexOf (I)I
      // a7: istore 9
      // a9: iload 9
      // ab: bipush -1
      // ac: if_icmpeq c5
      // af: aload 7
      // b1: iload 9
      // b3: bipush 1
      // b4: iadd
      // b5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b8: lload 2
      // b9: lconst_0
      // ba: lcmp
      // bb: iflt c7
      // be: astore 8
      // c0: iload 6
      // c2: ifeq c9
      // c5: ldc ""
      // c7: astore 8
      // c9: aload 0
      // ca: ldc2_w 3729496919298641274
      // cd: lload 2
      // ce: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: aload 8
      // d5: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // d8: return
   }

   protected void P(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/is.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w -5708934697705175935
      // 01c: lload 3
      // 01d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 5
      // 024: iload 5
      // 026: ifne 061
      // 029: aload 0
      // 02a: ldc2_w -5749652702979160990
      // 02d: lload 3
      // 02e: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: ifeq 0f6
      // 036: goto 043
      // 039: ldc2_w -5461897638239889941
      // 03c: lload 3
      // 03d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: athrow
      // 043: aload 2
      // 044: aload 0
      // 045: ldc2_w -5249032125773499027
      // 048: lload 3
      // 049: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: invokevirtual com/zelix/x7.B ()I
      // 051: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 054: goto 061
      // 057: ldc2_w -5461897638239889941
      // 05a: lload 3
      // 05b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 2
      // 062: aload 0
      // 063: ldc2_w -5515342631042259315
      // 066: lload 3
      // 067: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: iload 5
      // 06e: ifne 099
      // 071: ifnonnull 08f
      // 074: goto 081
      // 077: ldc2_w -5461897638239889941
      // 07a: lload 3
      // 07b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: bipush 0
      // 082: goto 09c
      // 085: ldc2_w -5461897638239889941
      // 088: lload 3
      // 089: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 0
      // 090: ldc2_w -5515342631042259315
      // 093: lload 3
      // 094: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: invokevirtual com/zelix/x7.B ()I
      // 09c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 09f: aload 2
      // 0a0: aload 0
      // 0a1: ldc2_w -5343258881602221213
      // 0a4: lload 3
      // 0a5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 5
      // 0ac: ifne 0d7
      // 0af: ifnonnull 0cd
      // 0b2: goto 0bf
      // 0b5: ldc2_w -5461897638239889941
      // 0b8: lload 3
      // 0b9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: bipush 0
      // 0c0: goto 0da
      // 0c3: ldc2_w -5461897638239889941
      // 0c6: lload 3
      // 0c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: ldc2_w -5343258881602221213
      // 0d1: lload 3
      // 0d2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: invokevirtual com/zelix/mx.B ()I
      // 0da: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0dd: aload 2
      // 0de: aload 0
      // 0df: ldc2_w -5939390698119761418
      // 0e2: lload 3
      // 0e3: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 104
      // 0f1: iload 5
      // 0f3: ifeq 111
      // 0f6: aload 2
      // 0f7: aload 0
      // 0f8: ldc2_w -5948959029523930485
      // 0fb: lload 3
      // 0fc: invokedynamic o (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual java/io/DataOutputStream.write ([B)V
      // 104: goto 111
      // 107: ldc2_w -5461897638239889941
      // 10a: lload 3
      // 10b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: return
   }

   String K(Object[] param1) {
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
      // 0c: getstatic com/zelix/is.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 54668840520085
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6788604993225125471
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: ldc2_w 4680030602009285898
      // 2a: lload 2
      // 2b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 6
      // 32: ifeq 5c
      // 35: ifnull f9
      // 38: goto 45
      // 3b: ldc2_w 5166806457151809132
      // 3e: lload 2
      // 3f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w 4680030602009285898
      // 49: lload 2
      // 4a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 5166806457151809132
      // 55: lload 2
      // 56: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: lload 4
      // 5e: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 61: astore 7
      // 63: aload 0
      // 64: ldc2_w 4945215207488669418
      // 67: lload 2
      // 68: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: lload 4
      // 6f: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 72: astore 8
      // 74: aload 8
      // 76: ifnull f0
      // 79: aload 7
      // 7b: iload 6
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: ifle 88
      // 83: ifeq f8
      // 86: iload 6
      // 88: ifeq f8
      // 8b: goto 98
      // 8e: ldc2_w 5166806457151809132
      // 91: lload 2
      // 92: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: aload 8
      // 9a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 9d: ifne f0
      // a0: goto ad
      // a3: ldc2_w 5166806457151809132
      // a6: lload 2
      // a7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: aload 8
      // af: ldc "$"
      // b1: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // b4: istore 9
      // b6: iload 6
      // b8: lload 2
      // b9: lconst_0
      // ba: lcmp
      // bb: iflt df
      // be: ifeq dd
      // c1: iload 9
      // c3: ifle e8
      // c6: goto d3
      // c9: ldc2_w 5166806457151809132
      // cc: lload 2
      // cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: athrow
      // d3: aload 8
      // d5: bipush 0
      // d6: iload 9
      // d8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // db: astore 8
      // dd: iload 6
      // df: lload 2
      // e0: lconst_0
      // e1: lcmp
      // e2: iflt ed
      // e5: ifne eb
      // e8: aconst_null
      // e9: astore 8
      // eb: iload 6
      // ed: ifne 74
      // f0: lload 2
      // f1: lconst_0
      // f2: lcmp
      // f3: iflt a0
      // f6: aload 8
      // f8: areturn
      // f9: aconst_null
      // fa: areturn
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -4813852749984134795
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: iload 8
      // 2a: ifne 58
      // 2d: ldc2_w -5175508892168288617
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -5059942309062010849
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -5059942309062010849
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -5175508892168288617
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   is(h8 param1, _xx param2, long param3, _y4 param5, _y4 param6, PrintWriter param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/is.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 42046133452628
      // 00b: lxor
      // 00c: lstore 8
      // 00e: dup2
      // 00f: ldc2_w 16646686070777
      // 012: lxor
      // 013: lstore 10
      // 015: dup2
      // 016: ldc2_w 6670831984616
      // 019: lxor
      // 01a: dup2
      // 01b: bipush 8
      // 01d: lushr
      // 01e: lstore 12
      // 020: dup2
      // 021: bipush 56
      // 023: lshl
      // 024: bipush 56
      // 026: lushr
      // 027: l2i
      // 028: istore 14
      // 02a: pop2
      // 02b: dup2
      // 02c: ldc2_w 94283397033689
      // 02f: lxor
      // 030: lstore 15
      // 032: pop2
      // 033: aload 0
      // 034: aload 1
      // 035: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 038: aload 0
      // 039: bipush 1
      // 03a: ldc2_w -5382293735248166631
      // 03d: lload 3
      // 03e: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 2
      // 044: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 047: istore 18
      // 049: aload 2
      // 04a: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 04d: istore 19
      // 04f: aload 2
      // 050: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 053: istore 20
      // 055: aload 0
      // 056: aload 2
      // 057: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 05a: ldc2_w -6275648802617101171
      // 05d: lload 3
      // 05e: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: lload 12
      // 066: iload 18
      // 068: iload 14
      // 06a: i2b
      // 06b: invokevirtual com/zelix/is.N (JIB)Lcom/zelix/xl;
      // 06e: astore 21
      // 070: ldc2_w -6284272592545539933
      // 073: lload 3
      // 074: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: aload 0
      // 07a: lload 12
      // 07c: iload 19
      // 07e: iload 14
      // 080: i2b
      // 081: invokevirtual com/zelix/is.N (JIB)Lcom/zelix/xl;
      // 084: astore 22
      // 086: aload 0
      // 087: lload 12
      // 089: iload 20
      // 08b: iload 14
      // 08d: i2b
      // 08e: invokevirtual com/zelix/is.N (JIB)Lcom/zelix/xl;
      // 091: astore 23
      // 093: istore 17
      // 095: aload 21
      // 097: instanceof com/zelix/x7
      // 09a: iload 17
      // 09c: ifeq 0b1
      // 09f: ifeq 200
      // 0a2: goto 0af
      // 0a5: ldc2_w -5672266136448429936
      // 0a8: lload 3
      // 0a9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: iload 19
      // 0b1: iload 17
      // 0b3: ifeq 123
      // 0b6: ifeq 0f3
      // 0b9: goto 0c6
      // 0bc: ldc2_w -5672266136448429936
      // 0bf: lload 3
      // 0c0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 22
      // 0c8: instanceof com/zelix/x7
      // 0cb: iload 17
      // 0cd: lload 3
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: iflt 125
      // 0d3: ifeq 123
      // 0d6: goto 0e3
      // 0d9: ldc2_w -5672266136448429936
      // 0dc: lload 3
      // 0dd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: ifeq 200
      // 0e6: goto 0f3
      // 0e9: ldc2_w -5672266136448429936
      // 0ec: lload 3
      // 0ed: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 21
      // 0f6: checkcast com/zelix/x7
      // 0f9: ldc2_w -5594367806880534506
      // 0fc: lload 3
      // 0fd: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: aload 6
      // 104: aload 0
      // 105: ldc2_w -5594367806880534506
      // 108: lload 3
      // 109: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: aload 0
      // 10f: lload 8
      // 111: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 114: iload 19
      // 116: goto 123
      // 119: ldc2_w -5672266136448429936
      // 11c: lload 3
      // 11d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: iload 17
      // 125: lload 3
      // 126: lconst_0
      // 127: lcmp
      // 128: iflt 176
      // 12b: ifeq 16e
      // 12e: ifeq 16c
      // 131: goto 13e
      // 134: ldc2_w -5672266136448429936
      // 137: lload 3
      // 138: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: aload 0
      // 13f: aload 22
      // 141: checkcast com/zelix/x7
      // 144: ldc2_w -5328057357244996618
      // 147: lload 3
      // 148: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: aload 6
      // 14f: aload 0
      // 150: ldc2_w -5328057357244996618
      // 153: lload 3
      // 154: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 0
      // 15a: lload 8
      // 15c: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 15f: goto 16c
      // 162: ldc2_w -5672266136448429936
      // 165: lload 3
      // 166: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: iload 20
      // 16e: lload 3
      // 16f: lconst_0
      // 170: lcmp
      // 171: iflt 234
      // 174: iload 17
      // 176: ifeq 234
      // 179: ifeq 218
      // 17c: goto 189
      // 17f: ldc2_w -5672266136448429936
      // 182: lload 3
      // 183: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 23
      // 18b: instanceof com/zelix/mx
      // 18e: lload 3
      // 18f: lconst_0
      // 190: lcmp
      // 191: ifle 1f0
      // 194: ifeq 1dd
      // 197: goto 1a4
      // 19a: ldc2_w -5672266136448429936
      // 19d: lload 3
      // 19e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: aload 23
      // 1a7: checkcast com/zelix/mx
      // 1aa: ldc2_w -5718569518212641256
      // 1ad: lload 3
      // 1ae: invokedynamic s (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 5
      // 1b5: aload 0
      // 1b6: ldc2_w -5718569518212641256
      // 1b9: lload 3
      // 1ba: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: aload 0
      // 1c0: lload 8
      // 1c2: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1c5: lload 3
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: iflt 218
      // 1cb: iload 17
      // 1cd: ifne 218
      // 1d0: goto 1dd
      // 1d3: ldc2_w -5672266136448429936
      // 1d6: lload 3
      // 1d7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: bipush 0
      // 1df: ldc2_w -5382293735248166631
      // 1e2: lload 3
      // 1e3: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: lload 3
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: ifle 218
      // 1ee: iload 17
      // 1f0: ifne 218
      // 1f3: goto 200
      // 1f6: ldc2_w -5672266136448429936
      // 1f9: lload 3
      // 1fa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: athrow
      // 200: aload 0
      // 201: bipush 0
      // 202: ldc2_w -5382293735248166631
      // 205: lload 3
      // 206: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: goto 218
      // 20e: ldc2_w -5672266136448429936
      // 211: lload 3
      // 212: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 0
      // 219: iload 17
      // 21b: ifeq 3bd
      // 21e: ldc2_w -5382293735248166631
      // 221: lload 3
      // 222: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: goto 234
      // 22a: ldc2_w -5672266136448429936
      // 22d: lload 3
      // 22e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: athrow
      // 234: ifne 3ff
      // 237: aload 0
      // 238: sipush 14312
      // 23b: ldc2_w 4869600052354390124
      // 23e: lload 3
      // 23f: lxor
      // 240: invokedynamic j (IJ)I bsm=com/zelix/is.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: newarray 8
      // 247: ldc2_w -6338134498110691344
      // 24a: lload 3
      // 24b: invokedynamic s (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: aload 0
      // 251: ldc2_w -6338134498110691344
      // 254: lload 3
      // 255: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: bipush 0
      // 25b: lload 10
      // 25d: iload 18
      // 25f: bipush 2
      // 260: anewarray 223
      // 263: dup_x1
      // 264: swap
      // 265: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x2
      // 26c: dup_x2
      // 26d: pop
      // 26e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 271: bipush 0
      // 272: swap
      // 273: aastore
      // 274: ldc2_w -6298621259867561214
      // 277: lload 3
      // 278: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: i2b
      // 27e: bastore
      // 27f: aload 0
      // 280: ldc2_w -6338134498110691344
      // 283: lload 3
      // 284: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: bipush 1
      // 28a: iload 18
      // 28c: lload 15
      // 28e: bipush 2
      // 28f: anewarray 223
      // 292: dup_x2
      // 293: dup_x2
      // 294: pop
      // 295: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 298: bipush 1
      // 299: swap
      // 29a: aastore
      // 29b: dup_x1
      // 29c: swap
      // 29d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a0: bipush 0
      // 2a1: swap
      // 2a2: aastore
      // 2a3: ldc2_w -5416084971973479139
      // 2a6: lload 3
      // 2a7: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: i2b
      // 2ad: bastore
      // 2ae: aload 0
      // 2af: ldc2_w -6338134498110691344
      // 2b2: lload 3
      // 2b3: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: bipush 2
      // 2b9: lload 10
      // 2bb: iload 19
      // 2bd: bipush 2
      // 2be: anewarray 223
      // 2c1: dup_x1
      // 2c2: swap
      // 2c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2c6: bipush 1
      // 2c7: swap
      // 2c8: aastore
      // 2c9: dup_x2
      // 2ca: dup_x2
      // 2cb: pop
      // 2cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cf: bipush 0
      // 2d0: swap
      // 2d1: aastore
      // 2d2: ldc2_w -6298621259867561214
      // 2d5: lload 3
      // 2d6: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: i2b
      // 2dc: bastore
      // 2dd: aload 0
      // 2de: ldc2_w -6338134498110691344
      // 2e1: lload 3
      // 2e2: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: bipush 3
      // 2e8: iload 19
      // 2ea: lload 15
      // 2ec: bipush 2
      // 2ed: anewarray 223
      // 2f0: dup_x2
      // 2f1: dup_x2
      // 2f2: pop
      // 2f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f6: bipush 1
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2fe: bipush 0
      // 2ff: swap
      // 300: aastore
      // 301: ldc2_w -5416084971973479139
      // 304: lload 3
      // 305: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: i2b
      // 30b: bastore
      // 30c: aload 0
      // 30d: ldc2_w -6338134498110691344
      // 310: lload 3
      // 311: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: bipush 4
      // 317: lload 10
      // 319: iload 20
      // 31b: bipush 2
      // 31c: anewarray 223
      // 31f: dup_x1
      // 320: swap
      // 321: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 324: bipush 1
      // 325: swap
      // 326: aastore
      // 327: dup_x2
      // 328: dup_x2
      // 329: pop
      // 32a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: ldc2_w -6298621259867561214
      // 333: lload 3
      // 334: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: i2b
      // 33a: bastore
      // 33b: aload 0
      // 33c: ldc2_w -6338134498110691344
      // 33f: lload 3
      // 340: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: bipush 5
      // 346: iload 20
      // 348: lload 15
      // 34a: bipush 2
      // 34b: anewarray 223
      // 34e: dup_x2
      // 34f: dup_x2
      // 350: pop
      // 351: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 354: bipush 1
      // 355: swap
      // 356: aastore
      // 357: dup_x1
      // 358: swap
      // 359: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 35c: bipush 0
      // 35d: swap
      // 35e: aastore
      // 35f: ldc2_w -5416084971973479139
      // 362: lload 3
      // 363: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: i2b
      // 369: bastore
      // 36a: aload 0
      // 36b: ldc2_w -6338134498110691344
      // 36e: lload 3
      // 36f: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: sipush 5417
      // 377: ldc2_w 7224809478926285487
      // 37a: lload 3
      // 37b: lxor
      // 37c: invokedynamic j (IJ)I bsm=com/zelix/is.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: aload 0
      // 382: ldc2_w -6275648802617101171
      // 385: lload 3
      // 386: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: lload 10
      // 38d: dup2_x1
      // 38e: pop2
      // 38f: bipush 2
      // 390: anewarray 223
      // 393: dup_x1
      // 394: swap
      // 395: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 398: bipush 1
      // 399: swap
      // 39a: aastore
      // 39b: dup_x2
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a1: bipush 0
      // 3a2: swap
      // 3a3: aastore
      // 3a4: ldc2_w -6298621259867561214
      // 3a7: lload 3
      // 3a8: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: i2b
      // 3ae: bastore
      // 3af: aload 0
      // 3b0: goto 3bd
      // 3b3: ldc2_w -5672266136448429936
      // 3b6: lload 3
      // 3b7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: athrow
      // 3bd: ldc2_w -6338134498110691344
      // 3c0: lload 3
      // 3c1: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: sipush 17691
      // 3c9: ldc2_w 7172166312631659163
      // 3cc: lload 3
      // 3cd: lxor
      // 3ce: invokedynamic j (IJ)I bsm=com/zelix/is.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: aload 0
      // 3d4: ldc2_w -6275648802617101171
      // 3d7: lload 3
      // 3d8: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: lload 15
      // 3df: bipush 2
      // 3e0: anewarray 223
      // 3e3: dup_x2
      // 3e4: dup_x2
      // 3e5: pop
      // 3e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e9: bipush 1
      // 3ea: swap
      // 3eb: aastore
      // 3ec: dup_x1
      // 3ed: swap
      // 3ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f1: bipush 0
      // 3f2: swap
      // 3f3: aastore
      // 3f4: ldc2_w -5416084971973479139
      // 3f7: lload 3
      // 3f8: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: i2b
      // 3fe: bastore
      // 3ff: return
   }

   boolean h(Object[] param1) {
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
      // 0e: checkcast com/zelix/_ue
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/is.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 36885358784463
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 92775244667438
      // 25: lxor
      // 26: lstore 7
      // 28: dup2
      // 29: ldc2_w 12038681154208
      // 2c: lxor
      // 2d: lstore 9
      // 2f: pop2
      // 30: ldc2_w 1223274769229554877
      // 33: lload 3
      // 34: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: aload 0
      // 3a: ldc2_w 1665077180770129233
      // 3d: lload 3
      // 3e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: lload 7
      // 45: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 48: astore 12
      // 4a: istore 11
      // 4c: lload 9
      // 4e: aload 12
      // 50: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 53: astore 13
      // 55: aload 13
      // 57: ifnull a6
      // 5a: aload 2
      // 5b: lload 5
      // 5d: aload 13
      // 5f: bipush 2
      // 60: anewarray 223
      // 63: dup_x1
      // 64: swap
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: ldc2_w 1279819246558873398
      // 74: lload 3
      // 75: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: iload 11
      // 7c: ifne 9d
      // 7f: goto 8c
      // 82: ldc2_w 1445456200126379479
      // 85: lload 3
      // 86: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: ifne a0
      // 8f: goto 9c
      // 92: ldc2_w 1445456200126379479
      // 95: lload 3
      // 96: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: bipush 1
      // 9d: goto a1
      // a0: bipush 0
      // a1: istore 14
      // a3: iload 14
      // a5: ireturn
      // a6: bipush 0
      // a7: ireturn
   }

   public void h(Object[] param1) {
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
      // 0e: checkcast com/zelix/x7
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/x7
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 1010662480215095874
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 5
      // 28: aload 0
      // 29: ldc2_w 712944365743410094
      // 2c: lload 3
      // 2d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: lload 3
      // 33: lconst_0
      // 34: lcmp
      // 35: ifle 71
      // 38: iload 6
      // 3a: ifne 71
      // 3d: if_acmpne 65
      // 40: goto 4d
      // 43: ldc2_w 788168423489284904
      // 46: lload 3
      // 47: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 2
      // 4f: ldc2_w 712944365743410094
      // 52: lload 3
      // 53: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: goto 65
      // 5b: ldc2_w 788168423489284904
      // 5e: lload 3
      // 5f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 5
      // 67: aload 0
      // 68: ldc2_w 988191646946482254
      // 6b: lload 3
      // 6c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: if_acmpne 8c
      // 74: aload 0
      // 75: aload 2
      // 76: ldc2_w 988191646946482254
      // 79: lload 3
      // 7a: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: goto 8c
      // 82: ldc2_w 788168423489284904
      // 85: lload 3
      // 86: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: return
   }

   String C(Object[] param1) {
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
      // 0c: getstatic com/zelix/is.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8971403549713190122
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 7271796020068211281
      // 21: lload 2
      // 22: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 53
      // 2c: ifnull 84
      // 2f: goto 3c
      // 32: ldc2_w 7278103566325073113
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 7271796020068211281
      // 40: lload 2
      // 41: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w 7278103566325073113
      // 4c: lload 2
      // 4d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 56: astore 5
      // 58: aload 5
      // 5a: iload 4
      // 5c: ifeq 83
      // 5f: ldc ""
      // 61: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 64: ifne 84
      // 67: goto 74
      // 6a: ldc2_w 7278103566325073113
      // 6d: lload 2
      // 6e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: aload 5
      // 76: goto 83
      // 79: ldc2_w 7278103566325073113
      // 7c: lload 2
      // 7d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: areturn
      // 84: aconst_null
      // 85: areturn
   }

   boolean s(Object[] var1) {
      long var2 = (Long)var1[0];
      HashSet var4 = (HashSet)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 84353662416746L;
      long var7 = var2 ^ 19971812212708L;
      String var9 = x44.a<"o">(this, -405444881352460267L, var2).W(var5);
      hy var10 = yn.Z(var7, var9);
      return var10 != null ? x44.a<"k">(var4, var10, -225140712157409701L, var2) : false;
   }

   public String w(Object[] param1) {
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
      // 0c: getstatic com/zelix/is.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 1815409563723
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 1341127305048041176
      // 1e: lload 2
      // 1f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: ldc2_w 1237644473358271700
      // 2a: lload 2
      // 2b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 6
      // 32: ifne 5c
      // 35: ifnull 8f
      // 38: goto 45
      // 3b: ldc2_w 1615137532226058162
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w 1237644473358271700
      // 49: lload 2
      // 4a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 1615137532226058162
      // 55: lload 2
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: lload 4
      // 5e: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 61: astore 7
      // 63: aload 7
      // 65: iload 6
      // 67: ifne 8e
      // 6a: ldc ""
      // 6c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6f: ifne 8f
      // 72: goto 7f
      // 75: ldc2_w 1615137532226058162
      // 78: lload 2
      // 79: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: aload 7
      // 81: goto 8e
      // 84: ldc2_w 1615137532226058162
      // 87: lload 2
      // 88: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: areturn
      // 8f: aconst_null
      // 90: areturn
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 80221771876344
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -5003033307729260843
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 0
      // 1c: ldc2_w -4795246723480928455
      // 1f: lload 1
      // 20: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 8
      // 27: ifne 7c
      // 2a: ifnull 5a
      // 2d: goto 3a
      // 30: ldc2_w -4726777826805375041
      // 33: lload 1
      // 34: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc2_w -4795246723480928455
      // 3e: lload 1
      // 3f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: lload 6
      // 46: aload 3
      // 47: aload 0
      // 48: aload 0
      // 49: invokevirtual com/zelix/x7.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4c: pop
      // 4d: goto 5a
      // 50: ldc2_w -4726777826805375041
      // 53: lload 1
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: lload 1
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: ifle a6
      // 61: iload 8
      // 63: ifne a6
      // 66: ldc2_w -5106522823127438119
      // 69: lload 1
      // 6a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: goto 7c
      // 72: ldc2_w -4726777826805375041
      // 75: lload 1
      // 76: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: lload 1
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: ifle 8f
      // 82: ifnull a5
      // 85: aload 0
      // 86: ldc2_w -5106522823127438119
      // 89: lload 1
      // 8a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: lload 6
      // 91: aload 3
      // 92: aload 0
      // 93: aload 0
      // 94: invokevirtual com/zelix/x7.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 97: pop
      // 98: goto a5
      // 9b: ldc2_w -4726777826805375041
      // 9e: lload 1
      // 9f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: aload 0
      // a6: ldc2_w -4644192194417262281
      // a9: lload 1
      // aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: iload 8
      // b1: ifne db
      // b4: ifnull e4
      // b7: goto c4
      // ba: ldc2_w -4726777826805375041
      // bd: lload 1
      // be: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: aload 0
      // c5: ldc2_w -4644192194417262281
      // c8: lload 1
      // c9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: goto db
      // d1: ldc2_w -4726777826805375041
      // d4: lload 1
      // d5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: lload 4
      // dd: aload 3
      // de: aload 0
      // df: aload 0
      // e0: invokevirtual com/zelix/mx.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // e3: pop
      // e4: return
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var4 = x44.a<"w">(-4284684064165531443L, var2);

      try {
         int var10000 = x44.a<"k">(this, -2747337573632539206L, var2) & a<"j">(20082, 5272365193937752258L ^ var2);
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, -4575932503362510425L, var2);
      }

      return (boolean)0;
   }

   public String n(Object[] param1) {
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
      // 0c: getstatic com/zelix/is.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 46127180144452
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 5252569413258737806
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: ldc2_w 5940801291462037563
      // 2a: lload 2
      // 2b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 6
      // 32: ifeq 5c
      // 35: ifnull 8f
      // 38: goto 45
      // 3b: ldc2_w 5865154916309561533
      // 3e: lload 2
      // 3f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w 5940801291462037563
      // 49: lload 2
      // 4a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 5865154916309561533
      // 55: lload 2
      // 56: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: lload 4
      // 5e: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 61: astore 7
      // 63: aload 7
      // 65: iload 6
      // 67: ifeq 8e
      // 6a: ldc ""
      // 6c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6f: ifne 8f
      // 72: goto 7f
      // 75: ldc2_w 5865154916309561533
      // 78: lload 2
      // 79: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: aload 7
      // 81: goto 8e
      // 84: ldc2_w 5865154916309561533
      // 87: lload 2
      // 88: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: areturn
      // 8f: aconst_null
      // 90: areturn
   }

   protected void a(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/Map
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/is.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: ldc2_w 5627429502194843250
      // 024: lload 3
      // 025: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: istore 6
      // 02c: aload 0
      // 02d: iload 6
      // 02f: ifeq 069
      // 032: ldc2_w 6025572567207700424
      // 035: lload 3
      // 036: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: ifeq 25c
      // 03e: goto 04b
      // 041: ldc2_w 6312201757275092545
      // 044: lload 3
      // 045: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aload 5
      // 04d: aload 0
      // 04e: ldc2_w 6092721656138618567
      // 051: lload 3
      // 052: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05c: goto 069
      // 05f: ldc2_w 6312201757275092545
      // 062: lload 3
      // 063: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: checkcast com/zelix/xl
      // 06c: astore 7
      // 06e: iload 6
      // 070: lload 3
      // 071: lconst_0
      // 072: lcmp
      // 073: ifle 0a9
      // 076: ifeq 0a1
      // 079: aload 7
      // 07b: ifnull 0ac
      // 07e: goto 08b
      // 081: ldc2_w 6312201757275092545
      // 084: lload 3
      // 085: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 2
      // 08c: aload 7
      // 08e: invokevirtual com/zelix/xl.B ()I
      // 091: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 094: goto 0a1
      // 097: ldc2_w 6312201757275092545
      // 09a: lload 3
      // 09b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: lload 3
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: ifle 0ca
      // 0a7: iload 6
      // 0a9: ifne 0ca
      // 0ac: aload 2
      // 0ad: aload 0
      // 0ae: ldc2_w 6092721656138618567
      // 0b1: lload 3
      // 0b2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual com/zelix/x7.B ()I
      // 0ba: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0bd: goto 0ca
      // 0c0: ldc2_w 6312201757275092545
      // 0c3: lload 3
      // 0c4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: ldc2_w 5827537102198834471
      // 0ce: lload 3
      // 0cf: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: iload 6
      // 0d6: ifeq 10a
      // 0d9: ifnull 173
      // 0dc: goto 0e9
      // 0df: ldc2_w 6312201757275092545
      // 0e2: lload 3
      // 0e3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 5
      // 0eb: aload 0
      // 0ec: ldc2_w 5827537102198834471
      // 0ef: lload 3
      // 0f0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0fa: checkcast com/zelix/xl
      // 0fd: goto 10a
      // 100: ldc2_w 6312201757275092545
      // 103: lload 3
      // 104: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: astore 8
      // 10c: iload 6
      // 10e: lload 3
      // 10f: lconst_0
      // 110: lcmp
      // 111: ifle 141
      // 114: ifeq 13f
      // 117: aload 8
      // 119: ifnull 14a
      // 11c: goto 129
      // 11f: ldc2_w 6312201757275092545
      // 122: lload 3
      // 123: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 2
      // 12a: aload 8
      // 12c: invokevirtual com/zelix/xl.B ()I
      // 12f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 132: goto 13f
      // 135: ldc2_w 6312201757275092545
      // 138: lload 3
      // 139: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: iload 6
      // 141: lload 3
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 170
      // 147: ifne 168
      // 14a: aload 2
      // 14b: aload 0
      // 14c: ldc2_w 5827537102198834471
      // 14f: lload 3
      // 150: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual com/zelix/x7.B ()I
      // 158: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 15b: goto 168
      // 15e: ldc2_w 6312201757275092545
      // 161: lload 3
      // 162: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: lload 3
      // 169: lconst_0
      // 16a: lcmp
      // 16b: iflt 185
      // 16e: iload 6
      // 170: ifne 185
      // 173: aload 2
      // 174: bipush 0
      // 175: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 178: goto 185
      // 17b: ldc2_w 6312201757275092545
      // 17e: lload 3
      // 17f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: aload 0
      // 186: ldc2_w 6229302214921742537
      // 189: lload 3
      // 18a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: iload 6
      // 191: ifeq 1e5
      // 194: ifnonnull 1c1
      // 197: goto 1a4
      // 19a: ldc2_w 6312201757275092545
      // 19d: lload 3
      // 19e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 2
      // 1a5: bipush 0
      // 1a6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 1a9: iload 6
      // 1ab: lload 3
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 259
      // 1b1: ifne 243
      // 1b4: goto 1c1
      // 1b7: ldc2_w 6312201757275092545
      // 1ba: lload 3
      // 1bb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: aload 5
      // 1c3: aload 0
      // 1c4: ldc2_w 6229302214921742537
      // 1c7: lload 3
      // 1c8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d2: checkcast com/zelix/mx
      // 1d5: checkcast com/zelix/mx
      // 1d8: goto 1e5
      // 1db: ldc2_w 6312201757275092545
      // 1de: lload 3
      // 1df: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: astore 8
      // 1e7: iload 6
      // 1e9: lload 3
      // 1ea: lconst_0
      // 1eb: lcmp
      // 1ec: iflt 21c
      // 1ef: ifeq 21a
      // 1f2: aload 8
      // 1f4: ifnull 225
      // 1f7: goto 204
      // 1fa: ldc2_w 6312201757275092545
      // 1fd: lload 3
      // 1fe: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: aload 2
      // 205: aload 8
      // 207: invokevirtual com/zelix/mx.B ()I
      // 20a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 20d: goto 21a
      // 210: ldc2_w 6312201757275092545
      // 213: lload 3
      // 214: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: iload 6
      // 21c: lload 3
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: ifle 259
      // 222: ifne 243
      // 225: aload 2
      // 226: aload 0
      // 227: ldc2_w 6229302214921742537
      // 22a: lload 3
      // 22b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokevirtual com/zelix/mx.B ()I
      // 233: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 236: goto 243
      // 239: ldc2_w 6312201757275092545
      // 23c: lload 3
      // 23d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: athrow
      // 243: aload 2
      // 244: aload 0
      // 245: ldc2_w 5636545924359459420
      // 248: lload 3
      // 249: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 251: lload 3
      // 252: lconst_0
      // 253: lcmp
      // 254: ifle 26a
      // 257: iload 6
      // 259: ifne 277
      // 25c: aload 2
      // 25d: aload 0
      // 25e: ldc2_w 5682151088397959457
      // 261: lload 3
      // 262: invokedynamic m (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: invokevirtual java/io/DataOutputStream.write ([B)V
      // 26a: goto 277
      // 26d: ldc2_w 6312201757275092545
      // 270: lload 3
      // 271: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: return
   }

   public void R(Object[] param1) {
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
      // 004: checkcast java/util/HashSet
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/HashSet
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/HashSet
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/HashSet
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/is.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 98950860842729
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 8164065537639
      // 040: lxor
      // 041: lstore 10
      // 043: pop2
      // 044: ldc2_w -5671843924753743581
      // 047: lload 6
      // 049: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aconst_null
      // 04f: astore 13
      // 051: istore 12
      // 053: aload 0
      // 054: ldc2_w -5796511711619941770
      // 057: lload 6
      // 059: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: iload 12
      // 060: ifeq 08d
      // 063: ifnull 0bc
      // 066: goto 074
      // 069: ldc2_w -6284694805246998256
      // 06c: lload 6
      // 06e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: aload 0
      // 075: ldc2_w -5796511711619941770
      // 078: lload 6
      // 07a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: goto 08d
      // 082: ldc2_w -6284694805246998256
      // 085: lload 6
      // 087: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: lload 8
      // 08f: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 092: lload 10
      // 094: dup2_x1
      // 095: pop2
      // 096: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 099: astore 13
      // 09b: lload 6
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: ifle 0bc
      // 0a2: aload 13
      // 0a4: ifnull 0bc
      // 0a7: aload 3
      // 0a8: aload 13
      // 0aa: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0ad: pop
      // 0ae: goto 0bc
      // 0b1: ldc2_w -6284694805246998256
      // 0b4: lload 6
      // 0b6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: ldc2_w -6062822282521204330
      // 0c0: lload 6
      // 0c2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: iload 12
      // 0c9: ifeq 0f6
      // 0cc: ifnull 125
      // 0cf: goto 0dd
      // 0d2: ldc2_w -6284694805246998256
      // 0d5: lload 6
      // 0d7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: ldc2_w -6062822282521204330
      // 0e1: lload 6
      // 0e3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: goto 0f6
      // 0eb: ldc2_w -6284694805246998256
      // 0ee: lload 6
      // 0f0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: lload 8
      // 0f8: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 0fb: lload 10
      // 0fd: dup2_x1
      // 0fe: pop2
      // 0ff: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 102: astore 14
      // 104: lload 6
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 117
      // 10b: aload 14
      // 10d: ifnull 125
      // 110: aload 3
      // 111: aload 14
      // 113: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 116: pop
      // 117: goto 125
      // 11a: ldc2_w -6284694805246998256
      // 11d: lload 6
      // 11f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: return
   }

   int x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -8971423926781812966L, var2);
   }

   static {
      long var0 = a ^ 68061807813747L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "×\u001f\u001c\u001bMJ¾\u0007ùp\u008e\u0004ÚD\u0087?zoê\u0005KÚè\u0013";
      int var7 = "×\u001f\u001c\u001bMJ¾\u0007ùp\u008e\u0004ÚD\u0087?zoê\u0005KÚè\u0013".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "¤RL\u0091Ú\u0097¾n;ËOP?qç\u0012";
                  var7 = "¤RL\u0091Ú\u0097¾n;ËOP?qç\u0012".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3055;
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
            throw new RuntimeException("com/zelix/is", var14);
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
         throw new RuntimeException("com/zelix/is" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
