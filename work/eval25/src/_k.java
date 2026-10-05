package com.zelix;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _k {
   private File X;
   private Properties o;
   private final String D;
   private final String N;
   private final String l;
   private static final String Y;
   private String S;
   private static final long a = ess.a(5183381433611229090L, -6497948774265396003L, MethodHandles.lookup().lookupClass()).a(204633609516939L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private String O(Object[] param1) {
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
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/ArrayList
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/_k.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 105205049883721
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 103202819429337
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 45555677769577
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 44952617628736
      // 03b: lxor
      // 03c: lstore 12
      // 03e: pop2
      // 03f: ldc2_w -1664892912889334531
      // 042: lload 3
      // 043: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 2
      // 049: aload 5
      // 04b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 04e: pop
      // 04f: new java/lang/StringBuffer
      // 052: dup
      // 053: sipush 22732
      // 056: ldc2_w 6988417493607105584
      // 059: lload 3
      // 05a: lxor
      // 05b: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokespecial java/lang/StringBuffer.<init> (I)V
      // 063: astore 15
      // 065: aconst_null
      // 066: astore 16
      // 068: astore 14
      // 06a: aload 5
      // 06c: lload 6
      // 06e: ldc2_w -797372652831685661
      // 071: lload 3
      // 072: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: bipush 3
      // 078: anewarray 135
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 2
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 1
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: ldc2_w -858634542887060569
      // 091: lload 3
      // 092: invokedynamic q (Ljava/lang/Object;JJ)Ljava/io/BufferedReader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: astore 16
      // 099: new java/lang/StringBuffer
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuffer.<init> ()V
      // 0a0: astore 17
      // 0a2: bipush 0
      // 0a3: istore 18
      // 0a5: aload 16
      // 0a7: ldc2_w -1222148586179065206
      // 0aa: lload 3
      // 0ab: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: dup
      // 0b1: istore 18
      // 0b3: bipush -1
      // 0b4: if_icmpeq 0e9
      // 0b7: lload 3
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: ifle 0d1
      // 0bd: aload 17
      // 0bf: iload 18
      // 0c1: i2c
      // 0c2: ldc2_w -1299626657147124106
      // 0c5: lload 3
      // 0c6: invokedynamic i (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: aload 14
      // 0cd: ifnonnull 0eb
      // 0d0: pop
      // 0d1: aload 14
      // 0d3: ifnull 0a5
      // 0d6: lload 3
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: ifle 0b7
      // 0dc: goto 0e9
      // 0df: ldc2_w -1077034037555058122
      // 0e2: lload 3
      // 0e3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 17
      // 0eb: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 0ee: astore 19
      // 0f0: aload 0
      // 0f1: aload 19
      // 0f3: lload 8
      // 0f5: bipush 2
      // 0f6: anewarray 135
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 1
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w -1490984522545392452
      // 10a: lload 3
      // 10b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: astore 19
      // 112: bipush 0
      // 113: istore 20
      // 115: aload 19
      // 117: aload 0
      // 118: ldc2_w -982762466312808786
      // 11b: lload 3
      // 11c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: iload 20
      // 123: ldc2_w -724225629356031364
      // 126: lload 3
      // 127: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: dup
      // 12d: istore 21
      // 12f: bipush -1
      // 130: if_icmple 26a
      // 133: aload 15
      // 135: aload 19
      // 137: iload 20
      // 139: iload 21
      // 13b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 141: pop
      // 142: aload 19
      // 144: aload 0
      // 145: ldc2_w -1029544550231563847
      // 148: lload 3
      // 149: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: iload 21
      // 150: ldc2_w -724225629356031364
      // 153: lload 3
      // 154: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: istore 22
      // 15b: lload 3
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: iflt 295
      // 161: aload 14
      // 163: ifnonnull 295
      // 166: iload 22
      // 168: bipush -1
      // 169: if_icmple 1dd
      // 16c: goto 179
      // 16f: ldc2_w -1077034037555058122
      // 172: lload 3
      // 173: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 0
      // 17a: aload 19
      // 17c: iload 21
      // 17e: aload 0
      // 17f: ldc2_w -982762466312808786
      // 182: lload 3
      // 183: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/lang/String.length ()I
      // 18b: iadd
      // 18c: iload 22
      // 18e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 191: lload 12
      // 193: dup2_x1
      // 194: pop2
      // 195: aload 2
      // 196: bipush 3
      // 197: anewarray 135
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 2
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 1
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 0
      // 1ab: swap
      // 1ac: aastore
      // 1ad: ldc2_w -605367088599934274
      // 1b0: lload 3
      // 1b1: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: astore 23
      // 1b8: aload 15
      // 1ba: aload 23
      // 1bc: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1bf: pop
      // 1c0: iload 22
      // 1c2: aload 0
      // 1c3: ldc2_w -1029544550231563847
      // 1c6: lload 3
      // 1c7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/String.length ()I
      // 1cf: iadd
      // 1d0: istore 20
      // 1d2: aload 14
      // 1d4: lload 3
      // 1d5: lconst_0
      // 1d6: lcmp
      // 1d7: iflt 267
      // 1da: ifnull 265
      // 1dd: new com/zelix/_sk
      // 1e0: dup
      // 1e1: new java/lang/StringBuilder
      // 1e4: dup
      // 1e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e8: sipush 16736
      // 1eb: ldc2_w 785802301404170760
      // 1ee: lload 3
      // 1ef: lxor
      // 1f0: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f8: aload 0
      // 1f9: ldc2_w -982762466312808786
      // 1fc: lload 3
      // 1fd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 205: sipush 29493
      // 208: ldc2_w 7741857469707319374
      // 20b: lload 3
      // 20c: lxor
      // 20d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: aload 0
      // 216: ldc2_w -1029544550231563847
      // 219: lload 3
      // 21a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 222: sipush 16707
      // 225: ldc2_w 1537809147216841266
      // 228: lload 3
      // 229: lxor
      // 22a: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: aload 0
      // 233: aload 2
      // 234: lload 10
      // 236: bipush 2
      // 237: anewarray 135
      // 23a: dup_x2
      // 23b: dup_x2
      // 23c: pop
      // 23d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 240: bipush 1
      // 241: swap
      // 242: aastore
      // 243: dup_x1
      // 244: swap
      // 245: bipush 0
      // 246: swap
      // 247: aastore
      // 248: ldc2_w -995138512347602446
      // 24b: lload 3
      // 24c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 257: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 25a: athrow
      // 25b: ldc2_w -1077034037555058122
      // 25e: lload 3
      // 25f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 14
      // 267: ifnull 115
      // 26a: lload 3
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: ifle 288
      // 270: aload 15
      // 272: aload 19
      // 274: iload 20
      // 276: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 279: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 27c: lload 3
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 141
      // 282: aload 14
      // 284: ifnonnull 39b
      // 287: pop
      // 288: goto 295
      // 28b: ldc2_w -1077034037555058122
      // 28e: lload 3
      // 28f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: aload 16
      // 297: lload 3
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2a2
      // 29d: ifnull 399
      // 2a0: aload 16
      // 2a2: ldc2_w -1323232025384349054
      // 2a5: lload 3
      // 2a6: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: goto 399
      // 2ae: ldc2_w -1077034037555058122
      // 2b1: lload 3
      // 2b2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: astore 17
      // 2ba: goto 399
      // 2bd: astore 17
      // 2bf: new com/zelix/_sk
      // 2c2: dup
      // 2c3: new java/lang/StringBuilder
      // 2c6: dup
      // 2c7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ca: sipush 392
      // 2cd: ldc2_w 541353313320241909
      // 2d0: lload 3
      // 2d1: lxor
      // 2d2: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2da: aload 0
      // 2db: aload 2
      // 2dc: lload 10
      // 2de: bipush 2
      // 2df: anewarray 135
      // 2e2: dup_x2
      // 2e3: dup_x2
      // 2e4: pop
      // 2e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e8: bipush 1
      // 2e9: swap
      // 2ea: aastore
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 0
      // 2ee: swap
      // 2ef: aastore
      // 2f0: ldc2_w -995138512347602446
      // 2f3: lload 3
      // 2f4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ff: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 302: athrow
      // 303: astore 17
      // 305: new com/zelix/_sk
      // 308: dup
      // 309: new java/lang/StringBuilder
      // 30c: dup
      // 30d: invokespecial java/lang/StringBuilder.<init> ()V
      // 310: sipush 24074
      // 313: ldc2_w 7828184724391646565
      // 316: lload 3
      // 317: lxor
      // 318: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 320: aload 17
      // 322: ldc2_w -1280010819073907079
      // 325: lload 3
      // 326: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32e: sipush 11161
      // 331: ldc2_w 8485341792990208242
      // 334: lload 3
      // 335: lxor
      // 336: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33e: aload 0
      // 33f: aload 2
      // 340: lload 10
      // 342: bipush 2
      // 343: anewarray 135
      // 346: dup_x2
      // 347: dup_x2
      // 348: pop
      // 349: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34c: bipush 1
      // 34d: swap
      // 34e: aastore
      // 34f: dup_x1
      // 350: swap
      // 351: bipush 0
      // 352: swap
      // 353: aastore
      // 354: ldc2_w -995138512347602446
      // 357: lload 3
      // 358: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 360: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 363: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 366: athrow
      // 367: astore 24
      // 369: lload 3
      // 36a: lconst_0
      // 36b: lcmp
      // 36c: ifle 391
      // 36f: aload 16
      // 371: aload 14
      // 373: ifnonnull 388
      // 376: ifnull 396
      // 379: goto 386
      // 37c: ldc2_w -1077034037555058122
      // 37f: lload 3
      // 380: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 16
      // 388: ldc2_w -1323232025384349054
      // 38b: lload 3
      // 38c: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: goto 396
      // 394: astore 25
      // 396: aload 24
      // 398: athrow
      // 399: aload 15
      // 39b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 39e: areturn
   }

   private String e(Object[] param1) {
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
      // 014: getstatic com/zelix/_k.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: ldc2_w 1787961062153618632
      // 01d: lload 2
      // 01e: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: new java/lang/StringBuffer
      // 026: dup
      // 027: aload 4
      // 029: invokevirtual java/lang/String.length ()I
      // 02c: i2d
      // 02d: ldc2_w 1.2
      // 030: dmul
      // 031: d2i
      // 032: invokespecial java/lang/StringBuffer.<init> (I)V
      // 035: astore 6
      // 037: bipush 0
      // 038: istore 7
      // 03a: astore 5
      // 03c: aload 4
      // 03e: aload 0
      // 03f: ldc2_w 108023242342802928
      // 042: lload 2
      // 043: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: iload 7
      // 04a: ldc2_w 416029958541931081
      // 04d: lload 2
      // 04e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: dup
      // 054: istore 8
      // 056: bipush -1
      // 057: if_icmple 3fb
      // 05a: aload 6
      // 05c: aload 4
      // 05e: iload 7
      // 060: iload 8
      // 062: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 065: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 068: lload 2
      // 069: lconst_0
      // 06a: lcmp
      // 06b: ifle 410
      // 06e: pop
      // 06f: aload 5
      // 071: ifnonnull 40e
      // 074: iload 8
      // 076: lload 2
      // 077: lconst_0
      // 078: lcmp
      // 079: iflt 0d8
      // 07c: aload 5
      // 07e: ifnonnull 0d8
      // 081: goto 08e
      // 084: ldc2_w 87990154711095811
      // 087: lload 2
      // 088: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: ifeq 0d6
      // 091: goto 09e
      // 094: ldc2_w 87990154711095811
      // 097: lload 2
      // 098: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 4
      // 0a0: iload 8
      // 0a2: bipush 1
      // 0a3: isub
      // 0a4: invokevirtual java/lang/String.charAt (I)C
      // 0a7: sipush 30095
      // 0aa: ldc2_w 7422045817598286146
      // 0ad: lload 2
      // 0ae: lxor
      // 0af: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 5
      // 0b6: ifnonnull 3f3
      // 0b9: goto 0c6
      // 0bc: ldc2_w 87990154711095811
      // 0bf: lload 2
      // 0c0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: if_icmpeq 3d4
      // 0c9: goto 0d6
      // 0cc: ldc2_w 87990154711095811
      // 0cf: lload 2
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: iload 8
      // 0d8: aload 4
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: bipush 3
      // 0de: isub
      // 0df: aload 5
      // 0e1: ifnonnull 3f3
      // 0e4: if_icmpge 3d4
      // 0e7: goto 0f4
      // 0ea: ldc2_w 87990154711095811
      // 0ed: lload 2
      // 0ee: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 4
      // 0f6: iload 8
      // 0f8: bipush 1
      // 0f9: iadd
      // 0fa: invokevirtual java/lang/String.charAt (I)C
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 3f4
      // 103: sipush 4852
      // 106: ldc2_w 9077478352914120255
      // 109: lload 2
      // 10a: lxor
      // 10b: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 5
      // 112: ifnonnull 3f3
      // 115: goto 122
      // 118: ldc2_w 87990154711095811
      // 11b: lload 2
      // 11c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: if_icmpeq 3d4
      // 125: goto 132
      // 128: ldc2_w 87990154711095811
      // 12b: lload 2
      // 12c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 4
      // 134: aload 0
      // 135: ldc2_w 108023242342802928
      // 138: lload 2
      // 139: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: iload 8
      // 140: aload 0
      // 141: ldc2_w 108023242342802928
      // 144: lload 2
      // 145: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/String.length ()I
      // 14d: iadd
      // 14e: ldc2_w 416029958541931081
      // 151: lload 2
      // 152: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: istore 9
      // 159: iload 9
      // 15b: bipush -1
      // 15c: aload 5
      // 15e: ifnonnull 3cc
      // 161: if_icmple 3a0
      // 164: goto 171
      // 167: ldc2_w 87990154711095811
      // 16a: lload 2
      // 16b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: iload 9
      // 173: iload 8
      // 175: aload 0
      // 176: ldc2_w 108023242342802928
      // 179: lload 2
      // 17a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: invokevirtual java/lang/String.length ()I
      // 182: iadd
      // 183: aload 5
      // 185: ifnonnull 3cc
      // 188: goto 195
      // 18b: ldc2_w 87990154711095811
      // 18e: lload 2
      // 18f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: lload 2
      // 196: lconst_0
      // 197: lcmp
      // 198: ifle 3bf
      // 19b: if_icmple 3a0
      // 19e: goto 1ab
      // 1a1: ldc2_w 87990154711095811
      // 1a4: lload 2
      // 1a5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: iload 8
      // 1ad: aload 0
      // 1ae: ldc2_w 108023242342802928
      // 1b1: lload 2
      // 1b2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: invokevirtual java/lang/String.length ()I
      // 1ba: lload 2
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: ifle 229
      // 1c0: aload 5
      // 1c2: ifnonnull 229
      // 1c5: goto 1d2
      // 1c8: ldc2_w 87990154711095811
      // 1cb: lload 2
      // 1cc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: if_icmple 2b9
      // 1d5: goto 1e2
      // 1d8: ldc2_w 87990154711095811
      // 1db: lload 2
      // 1dc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: aload 4
      // 1e4: iload 8
      // 1e6: aload 0
      // 1e7: ldc2_w 108023242342802928
      // 1ea: lload 2
      // 1eb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: invokevirtual java/lang/String.length ()I
      // 1f3: lload 2
      // 1f4: lconst_0
      // 1f5: lcmp
      // 1f6: ifle 2da
      // 1f9: isub
      // 1fa: aload 5
      // 1fc: ifnonnull 2d8
      // 1ff: goto 20c
      // 202: ldc2_w 87990154711095811
      // 205: lload 2
      // 206: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: invokevirtual java/lang/String.charAt (I)C
      // 20f: sipush 15082
      // 212: ldc2_w 1913383543134311968
      // 215: lload 2
      // 216: lxor
      // 217: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: goto 229
      // 21f: ldc2_w 87990154711095811
      // 222: lload 2
      // 223: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: if_icmpne 2b9
      // 22c: aload 4
      // 22e: aload 5
      // 230: ifnonnull 2dd
      // 233: goto 240
      // 236: ldc2_w 87990154711095811
      // 239: lload 2
      // 23a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 2bb
      // 246: invokevirtual java/lang/String.length ()I
      // 249: iload 9
      // 24b: isub
      // 24c: aload 0
      // 24d: ldc2_w 108023242342802928
      // 250: lload 2
      // 251: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: invokevirtual java/lang/String.length ()I
      // 259: if_icmplt 2b9
      // 25c: goto 269
      // 25f: ldc2_w 87990154711095811
      // 262: lload 2
      // 263: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: aload 4
      // 26b: iload 9
      // 26d: aload 0
      // 26e: ldc2_w 108023242342802928
      // 271: lload 2
      // 272: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: invokevirtual java/lang/String.length ()I
      // 27a: iadd
      // 27b: invokevirtual java/lang/String.charAt (I)C
      // 27e: lload 2
      // 27f: lconst_0
      // 280: lcmp
      // 281: ifle 3cd
      // 284: sipush 15244
      // 287: ldc2_w 8711541049082042176
      // 28a: lload 2
      // 28b: lxor
      // 28c: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: aload 5
      // 293: ifnonnull 3cc
      // 296: goto 2a3
      // 299: ldc2_w 87990154711095811
      // 29c: lload 2
      // 29d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: athrow
      // 2a3: lload 2
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: iflt 3bf
      // 2a9: if_icmpeq 3a0
      // 2ac: goto 2b9
      // 2af: ldc2_w 87990154711095811
      // 2b2: lload 2
      // 2b3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: aload 4
      // 2bb: iload 8
      // 2bd: aload 0
      // 2be: ldc2_w 108023242342802928
      // 2c1: lload 2
      // 2c2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: invokevirtual java/lang/String.length ()I
      // 2ca: iadd
      // 2cb: goto 2d8
      // 2ce: ldc2_w 87990154711095811
      // 2d1: lload 2
      // 2d2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: athrow
      // 2d8: iload 9
      // 2da: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2dd: astore 10
      // 2df: aconst_null
      // 2e0: astore 11
      // 2e2: aload 0
      // 2e3: ldc2_w 2220598246793504275
      // 2e6: lload 2
      // 2e7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Properties; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: aload 5
      // 2ee: ifnonnull 318
      // 2f1: ifnull 325
      // 2f4: goto 301
      // 2f7: ldc2_w 87990154711095811
      // 2fa: lload 2
      // 2fb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: aload 0
      // 302: ldc2_w 2220598246793504275
      // 305: lload 2
      // 306: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Properties; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: goto 318
      // 30e: ldc2_w 87990154711095811
      // 311: lload 2
      // 312: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: athrow
      // 318: aload 10
      // 31a: ldc2_w 1958029829971382062
      // 31d: lload 2
      // 31e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: astore 11
      // 325: aload 11
      // 327: aload 5
      // 329: ifnonnull 34b
      // 32c: ifnonnull 349
      // 32f: goto 33c
      // 332: ldc2_w 87990154711095811
      // 335: lload 2
      // 336: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: athrow
      // 33c: aload 10
      // 33e: ldc2_w 2005694643550753989
      // 341: lload 2
      // 342: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: astore 11
      // 349: aload 11
      // 34b: ifnull 373
      // 34e: aload 6
      // 350: aload 11
      // 352: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 355: pop
      // 356: iload 9
      // 358: aload 0
      // 359: ldc2_w 108023242342802928
      // 35c: lload 2
      // 35d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: invokevirtual java/lang/String.length ()I
      // 365: iadd
      // 366: istore 7
      // 368: aload 5
      // 36a: lload 2
      // 36b: lconst_0
      // 36c: lcmp
      // 36d: ifle 397
      // 370: ifnull 395
      // 373: aload 6
      // 375: aload 0
      // 376: ldc2_w 108023242342802928
      // 379: lload 2
      // 37a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 382: pop
      // 383: iload 8
      // 385: aload 0
      // 386: ldc2_w 108023242342802928
      // 389: lload 2
      // 38a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: invokevirtual java/lang/String.length ()I
      // 392: iadd
      // 393: istore 7
      // 395: aload 5
      // 397: lload 2
      // 398: lconst_0
      // 399: lcmp
      // 39a: ifle 3d1
      // 39d: ifnull 3cf
      // 3a0: aload 6
      // 3a2: aload 0
      // 3a3: ldc2_w 108023242342802928
      // 3a6: lload 2
      // 3a7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3af: pop
      // 3b0: iload 8
      // 3b2: aload 0
      // 3b3: ldc2_w 108023242342802928
      // 3b6: lload 2
      // 3b7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: invokevirtual java/lang/String.length ()I
      // 3bf: goto 3cc
      // 3c2: ldc2_w 87990154711095811
      // 3c5: lload 2
      // 3c6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: athrow
      // 3cc: iadd
      // 3cd: istore 7
      // 3cf: aload 5
      // 3d1: ifnull 03c
      // 3d4: aload 6
      // 3d6: aload 0
      // 3d7: ldc2_w 108023242342802928
      // 3da: lload 2
      // 3db: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3e3: pop
      // 3e4: iload 8
      // 3e6: aload 0
      // 3e7: ldc2_w 108023242342802928
      // 3ea: lload 2
      // 3eb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: invokevirtual java/lang/String.length ()I
      // 3f3: iadd
      // 3f4: istore 7
      // 3f6: aload 5
      // 3f8: ifnull 03c
      // 3fb: aload 6
      // 3fd: aload 4
      // 3ff: iload 7
      // 401: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 404: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 407: pop
      // 408: lload 2
      // 409: lconst_0
      // 40a: lcmp
      // 40b: ifle 06f
      // 40e: aload 6
      // 410: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 413: areturn
   }

   public _k(String param1, String param2, long param3, Properties param5, String param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_k.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 89878122859064
      // 00b: lxor
      // 00c: lstore 8
      // 00e: dup2
      // 00f: ldc2_w 27972810627505
      // 012: lxor
      // 013: lstore 10
      // 015: dup2
      // 016: ldc2_w 23865850542390
      // 019: lxor
      // 01a: lstore 12
      // 01c: dup2
      // 01d: ldc2_w 79295225671727
      // 020: lxor
      // 021: lstore 14
      // 023: dup2
      // 024: ldc2_w 86092797612465
      // 027: lxor
      // 028: lstore 16
      // 02a: pop2
      // 02b: ldc2_w -7874445332653732192
      // 02e: lload 3
      // 02f: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: aload 0
      // 035: invokespecial java/lang/Object.<init> ()V
      // 038: astore 18
      // 03a: aload 18
      // 03c: ifnonnull 064
      // 03f: aload 6
      // 041: ifnonnull 06f
      // 044: goto 051
      // 047: ldc2_w -8407976170299207573
      // 04a: lload 3
      // 04b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 0
      // 052: ldc "%"
      // 054: putfield com/zelix/_k.N Ljava/lang/String;
      // 057: goto 064
      // 05a: ldc2_w -8407976170299207573
      // 05d: lload 3
      // 05e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: lload 3
      // 065: lconst_0
      // 066: lcmp
      // 067: ifle 0d8
      // 06a: aload 18
      // 06c: ifnull 082
      // 06f: aload 0
      // 070: aload 6
      // 072: putfield com/zelix/_k.N Ljava/lang/String;
      // 075: goto 082
      // 078: ldc2_w -8407976170299207573
      // 07b: lload 3
      // 07c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 0
      // 083: new java/lang/StringBuilder
      // 086: dup
      // 087: invokespecial java/lang/StringBuilder.<init> ()V
      // 08a: sipush 15082
      // 08d: ldc2_w 1913449977251486792
      // 090: lload 3
      // 091: lxor
      // 092: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 09a: aload 0
      // 09b: ldc2_w -8424121378910720104
      // 09e: lload 3
      // 09f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0aa: putfield com/zelix/_k.l Ljava/lang/String;
      // 0ad: aload 0
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: aload 0
      // 0b6: ldc2_w -8424121378910720104
      // 0b9: lload 3
      // 0ba: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: sipush 15244
      // 0c5: ldc2_w 8711607379920182568
      // 0c8: lload 3
      // 0c9: lxor
      // 0ca: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d5: putfield com/zelix/_k.D Ljava/lang/String;
      // 0d8: aload 2
      // 0d9: aload 18
      // 0db: ifnonnull 285
      // 0de: ifnull 236
      // 0e1: goto 0ee
      // 0e4: ldc2_w -8407976170299207573
      // 0e7: lload 3
      // 0e8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 2
      // 0ef: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0f2: invokevirtual java/lang/String.length ()I
      // 0f5: aload 18
      // 0f7: ifnonnull 295
      // 0fa: goto 107
      // 0fd: ldc2_w -8407976170299207573
      // 100: lload 3
      // 101: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: ifle 236
      // 10a: goto 117
      // 10d: ldc2_w -8407976170299207573
      // 110: lload 3
      // 111: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 0
      // 118: new java/io/File
      // 11b: dup
      // 11c: aload 2
      // 11d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 120: ldc2_w -7915994413340903560
      // 123: lload 3
      // 124: invokedynamic w (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: aload 0
      // 12a: ldc2_w -7915994413340903560
      // 12d: lload 3
      // 12e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: ldc2_w -8086692135688349382
      // 136: lload 3
      // 137: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: aload 18
      // 13e: lload 3
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 1cb
      // 144: ifnonnull 1c9
      // 147: goto 154
      // 14a: ldc2_w -8407976170299207573
      // 14d: lload 3
      // 14e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: ifne 1b6
      // 157: goto 164
      // 15a: ldc2_w -8407976170299207573
      // 15d: lload 3
      // 15e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: new com/zelix/_sk
      // 167: dup
      // 168: new java/lang/StringBuilder
      // 16b: dup
      // 16c: invokespecial java/lang/StringBuilder.<init> ()V
      // 16f: sipush 30947
      // 172: ldc2_w 4255391017776908767
      // 175: lload 3
      // 176: lxor
      // 177: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: aload 0
      // 180: ldc2_w -7915994413340903560
      // 183: lload 3
      // 184: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: ldc2_w -7589347323345248594
      // 18c: lload 3
      // 18d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: sipush 30264
      // 198: ldc2_w 2017160383875745555
      // 19b: lload 3
      // 19c: lxor
      // 19d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a8: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 1ab: athrow
      // 1ac: ldc2_w -8407976170299207573
      // 1af: lload 3
      // 1b0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: aload 0
      // 1b7: ldc2_w -7915994413340903560
      // 1ba: lload 3
      // 1bb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: ldc2_w -8181040892183507562
      // 1c3: lload 3
      // 1c4: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: aload 18
      // 1cb: lload 3
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: iflt 297
      // 1d1: ifnonnull 295
      // 1d4: ifne 236
      // 1d7: goto 1e4
      // 1da: ldc2_w -8407976170299207573
      // 1dd: lload 3
      // 1de: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: athrow
      // 1e4: new com/zelix/_sk
      // 1e7: dup
      // 1e8: new java/lang/StringBuilder
      // 1eb: dup
      // 1ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ef: sipush 3194
      // 1f2: ldc2_w 23776723382369618
      // 1f5: lload 3
      // 1f6: lxor
      // 1f7: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ff: aload 0
      // 200: ldc2_w -7915994413340903560
      // 203: lload 3
      // 204: invokedynamic h (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: ldc2_w -7589347323345248594
      // 20c: lload 3
      // 20d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: sipush 15272
      // 218: ldc2_w 3598767688172849807
      // 21b: lload 3
      // 21c: lxor
      // 21d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 228: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 22b: athrow
      // 22c: ldc2_w -8407976170299207573
      // 22f: lload 3
      // 230: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 0
      // 237: aload 5
      // 239: ldc2_w -7730038454373847941
      // 23c: lload 3
      // 23d: invokedynamic w (Ljava/lang/Object;Ljava/util/Properties;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: lload 8
      // 244: sipush 27553
      // 247: ldc2_w 4089269388678208136
      // 24a: lload 3
      // 24b: lxor
      // 24c: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: sipush 26890
      // 254: ldc2_w 4408935510977124407
      // 257: lload 3
      // 258: lxor
      // 259: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: aload 5
      // 260: bipush 4
      // 261: anewarray 135
      // 264: dup_x1
      // 265: swap
      // 266: bipush 3
      // 267: swap
      // 268: aastore
      // 269: dup_x1
      // 26a: swap
      // 26b: bipush 2
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 1
      // 271: swap
      // 272: aastore
      // 273: dup_x2
      // 274: dup_x2
      // 275: pop
      // 276: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 279: bipush 0
      // 27a: swap
      // 27b: aastore
      // 27c: ldc2_w -7891978101344685889
      // 27f: lload 3
      // 280: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: sipush 30619
      // 288: ldc2_w 869349109339883173
      // 28b: lload 3
      // 28c: lxor
      // 28d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 295: aload 18
      // 297: ifnonnull 2ab
      // 29a: ifne 2ae
      // 29d: goto 2aa
      // 2a0: ldc2_w -8407976170299207573
      // 2a3: lload 3
      // 2a4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: bipush 1
      // 2ab: goto 2af
      // 2ae: bipush 0
      // 2af: ldc2_w -8094122535233861915
      // 2b2: lload 3
      // 2b3: invokedynamic u (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: new java/util/ArrayList
      // 2bb: dup
      // 2bc: invokespecial java/util/ArrayList.<init> ()V
      // 2bf: astore 19
      // 2c1: aload 0
      // 2c2: aload 0
      // 2c3: lload 10
      // 2c5: aload 1
      // 2c6: aload 19
      // 2c8: bipush 3
      // 2c9: anewarray 135
      // 2cc: dup_x1
      // 2cd: swap
      // 2ce: bipush 2
      // 2cf: swap
      // 2d0: aastore
      // 2d1: dup_x1
      // 2d2: swap
      // 2d3: bipush 1
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x2
      // 2d7: dup_x2
      // 2d8: pop
      // 2d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dc: bipush 0
      // 2dd: swap
      // 2de: aastore
      // 2df: ldc2_w -8205916746066347162
      // 2e2: lload 3
      // 2e3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: ldc2_w -8261244764382999023
      // 2eb: lload 3
      // 2ec: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: aload 7
      // 2f3: aload 18
      // 2f5: ifnonnull 30a
      // 2f8: ifnull 3a0
      // 2fb: goto 308
      // 2fe: ldc2_w -8407976170299207573
      // 301: lload 3
      // 302: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: aload 7
      // 30a: invokevirtual java/lang/String.length ()I
      // 30d: ifle 3a0
      // 310: new com/zelix/pg
      // 313: dup
      // 314: lload 16
      // 316: invokespecial com/zelix/pg.<init> (J)V
      // 319: astore 20
      // 31b: aload 0
      // 31c: ldc2_w -8261244764382999023
      // 31f: lload 3
      // 320: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 325: new java/io/File
      // 328: dup
      // 329: aload 7
      // 32b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 32e: aload 20
      // 330: lload 12
      // 332: dup2_x2
      // 333: pop2
      // 334: bipush 4
      // 335: anewarray 135
      // 338: dup_x1
      // 339: swap
      // 33a: bipush 3
      // 33b: swap
      // 33c: aastore
      // 33d: dup_x1
      // 33e: swap
      // 33f: bipush 2
      // 340: swap
      // 341: aastore
      // 342: dup_x2
      // 343: dup_x2
      // 344: pop
      // 345: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 348: bipush 1
      // 349: swap
      // 34a: aastore
      // 34b: dup_x1
      // 34c: swap
      // 34d: bipush 0
      // 34e: swap
      // 34f: aastore
      // 350: ldc2_w -7892027820058433441
      // 353: lload 3
      // 354: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: pop
      // 35a: aload 20
      // 35c: lload 14
      // 35e: invokevirtual com/zelix/pg.n (J)Z
      // 361: ifne 3a0
      // 364: new com/zelix/_sk
      // 367: dup
      // 368: new java/lang/StringBuilder
      // 36b: dup
      // 36c: invokespecial java/lang/StringBuilder.<init> ()V
      // 36f: sipush 1748
      // 372: ldc2_w 1969668840587032558
      // 375: lload 3
      // 376: lxor
      // 377: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37f: aload 20
      // 381: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 384: checkcast java/lang/String
      // 387: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38a: ldc "'"
      // 38c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 392: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 395: athrow
      // 396: ldc2_w -8407976170299207573
      // 399: lload 3
      // 39a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: return
   }

   public _k(long var1, String var3, Properties var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 68503138666494L;
      this(var3, null, var4, null, var5);
   }

   private String r(Object[] param1) {
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
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/ArrayList
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/_k.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 21139219617301
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 44952617628736
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 103336000370885
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 123153193474928
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 95880583659425
      // 045: lxor
      // 046: lstore 14
      // 048: pop2
      // 049: ldc2_w 9171976613272740689
      // 04c: lload 4
      // 04e: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: aload 3
      // 054: sipush 11266
      // 057: ldc2_w 9113790117226590411
      // 05a: lload 4
      // 05c: lxor
      // 05d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 065: istore 17
      // 067: astore 16
      // 069: iload 17
      // 06b: aload 16
      // 06d: ifnonnull 12c
      // 070: bipush -1
      // 071: if_icmpne 104
      // 074: goto 082
      // 077: ldc2_w 7395455579845770650
      // 07a: lload 4
      // 07c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: new com/zelix/_sk
      // 085: dup
      // 086: new java/lang/StringBuilder
      // 089: dup
      // 08a: invokespecial java/lang/StringBuilder.<init> ()V
      // 08d: sipush 27455
      // 090: ldc2_w 8857600013887535097
      // 093: lload 4
      // 095: lxor
      // 096: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 0
      // 09f: ldc2_w 7345637260361138434
      // 0a2: lload 4
      // 0a4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: aload 3
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: aload 0
      // 0b1: ldc2_w 7357234974957221397
      // 0b4: lload 4
      // 0b6: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: sipush 17650
      // 0c1: ldc2_w 6825777047925741623
      // 0c4: lload 4
      // 0c6: lxor
      // 0c7: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: aload 0
      // 0d0: aload 2
      // 0d1: lload 10
      // 0d3: bipush 2
      // 0d4: anewarray 135
      // 0d7: dup_x2
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w 7322002378739185246
      // 0e8: lload 4
      // 0ea: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f5: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 0f8: athrow
      // 0f9: ldc2_w 7395455579845770650
      // 0fc: lload 4
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 0
      // 105: aload 3
      // 106: bipush 0
      // 107: iload 17
      // 109: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 10c: lload 12
      // 10e: dup2_x1
      // 10f: pop2
      // 110: bipush 2
      // 111: anewarray 135
      // 114: dup_x1
      // 115: swap
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: ldc2_w 8797909531166994982
      // 125: lload 4
      // 127: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: aload 16
      // 12e: ifnonnull 200
      // 131: ifne 1df
      // 134: goto 142
      // 137: ldc2_w 7395455579845770650
      // 13a: lload 4
      // 13c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: new com/zelix/_sk
      // 145: dup
      // 146: new java/lang/StringBuilder
      // 149: dup
      // 14a: invokespecial java/lang/StringBuilder.<init> ()V
      // 14d: sipush 19140
      // 150: ldc2_w 4373707622391174662
      // 153: lload 4
      // 155: lxor
      // 156: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: aload 0
      // 15f: ldc2_w 7345637260361138434
      // 162: lload 4
      // 164: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16c: aload 3
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: aload 0
      // 171: ldc2_w 7357234974957221397
      // 174: lload 4
      // 176: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17e: sipush 11029
      // 181: ldc2_w 856525005199816667
      // 184: lload 4
      // 186: lxor
      // 187: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18f: aload 3
      // 190: bipush 0
      // 191: iload 17
      // 193: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: sipush 1990
      // 19c: ldc2_w 7101282616896953110
      // 19f: lload 4
      // 1a1: lxor
      // 1a2: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: aload 0
      // 1ab: aload 2
      // 1ac: lload 10
      // 1ae: bipush 2
      // 1af: anewarray 135
      // 1b2: dup_x2
      // 1b3: dup_x2
      // 1b4: pop
      // 1b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b8: bipush 1
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x1
      // 1bc: swap
      // 1bd: bipush 0
      // 1be: swap
      // 1bf: aastore
      // 1c0: ldc2_w 7322002378739185246
      // 1c3: lload 4
      // 1c5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d0: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 1d3: athrow
      // 1d4: ldc2_w 7395455579845770650
      // 1d7: lload 4
      // 1d9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 3
      // 1e0: ldc "\""
      // 1e2: iload 17
      // 1e4: sipush 24497
      // 1e7: ldc2_w 6616178357051999076
      // 1ea: lload 4
      // 1ec: lxor
      // 1ed: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: invokevirtual java/lang/String.length ()I
      // 1f5: iadd
      // 1f6: ldc2_w 7088520908153132496
      // 1f9: lload 4
      // 1fb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: istore 18
      // 202: iload 18
      // 204: aload 16
      // 206: lload 4
      // 208: lconst_0
      // 209: lcmp
      // 20a: ifle 26d
      // 20d: ifnonnull 26b
      // 210: bipush -1
      // 211: if_icmple 753
      // 214: goto 222
      // 217: ldc2_w 7395455579845770650
      // 21a: lload 4
      // 21c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 0
      // 223: aload 3
      // 224: iload 17
      // 226: sipush 24497
      // 229: ldc2_w 6616178357051999076
      // 22c: lload 4
      // 22e: lxor
      // 22f: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: invokevirtual java/lang/String.length ()I
      // 237: iadd
      // 238: iload 18
      // 23a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 23d: lload 12
      // 23f: dup2_x1
      // 240: pop2
      // 241: bipush 2
      // 242: anewarray 135
      // 245: dup_x1
      // 246: swap
      // 247: bipush 1
      // 248: swap
      // 249: aastore
      // 24a: dup_x2
      // 24b: dup_x2
      // 24c: pop
      // 24d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 250: bipush 0
      // 251: swap
      // 252: aastore
      // 253: ldc2_w 8797909531166994982
      // 256: lload 4
      // 258: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: goto 26b
      // 260: ldc2_w 7395455579845770650
      // 263: lload 4
      // 265: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: athrow
      // 26b: aload 16
      // 26d: ifnonnull 2a4
      // 270: ifeq 6ae
      // 273: goto 281
      // 276: ldc2_w 7395455579845770650
      // 279: lload 4
      // 27b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: aload 3
      // 282: ldc "\""
      // 284: iload 18
      // 286: ldc "\""
      // 288: invokevirtual java/lang/String.length ()I
      // 28b: iadd
      // 28c: ldc2_w 7088520908153132496
      // 28f: lload 4
      // 291: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: goto 2a4
      // 299: ldc2_w 7395455579845770650
      // 29c: lload 4
      // 29e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: istore 19
      // 2a6: iload 19
      // 2a8: bipush -1
      // 2a9: if_icmple 637
      // 2ac: aload 3
      // 2ad: iload 18
      // 2af: ldc "\""
      // 2b1: invokevirtual java/lang/String.length ()I
      // 2b4: iadd
      // 2b5: iload 19
      // 2b7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2ba: astore 20
      // 2bc: aload 0
      // 2bd: aload 3
      // 2be: iload 19
      // 2c0: ldc "\""
      // 2c2: invokevirtual java/lang/String.length ()I
      // 2c5: iadd
      // 2c6: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2c9: lload 12
      // 2cb: dup2_x1
      // 2cc: pop2
      // 2cd: bipush 2
      // 2ce: anewarray 135
      // 2d1: dup_x1
      // 2d2: swap
      // 2d3: bipush 1
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x2
      // 2d7: dup_x2
      // 2d8: pop
      // 2d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dc: bipush 0
      // 2dd: swap
      // 2de: aastore
      // 2df: ldc2_w 8797909531166994982
      // 2e2: lload 4
      // 2e4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: lload 4
      // 2eb: lconst_0
      // 2ec: lcmp
      // 2ed: iflt 3e2
      // 2f0: aload 16
      // 2f2: ifnonnull 3e2
      // 2f5: ifne 3a8
      // 2f8: goto 306
      // 2fb: ldc2_w 7395455579845770650
      // 2fe: lload 4
      // 300: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: new com/zelix/_sk
      // 309: dup
      // 30a: new java/lang/StringBuilder
      // 30d: dup
      // 30e: invokespecial java/lang/StringBuilder.<init> ()V
      // 311: sipush 2223
      // 314: ldc2_w 1709705120581358695
      // 317: lload 4
      // 319: lxor
      // 31a: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 322: aload 0
      // 323: ldc2_w 7345637260361138434
      // 326: lload 4
      // 328: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 330: aload 3
      // 331: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 334: aload 0
      // 335: ldc2_w 7357234974957221397
      // 338: lload 4
      // 33a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 342: sipush 9099
      // 345: ldc2_w 6170232098010578775
      // 348: lload 4
      // 34a: lxor
      // 34b: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 353: aload 3
      // 354: iload 19
      // 356: ldc "\""
      // 358: invokevirtual java/lang/String.length ()I
      // 35b: iadd
      // 35c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 35f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 362: sipush 18537
      // 365: ldc2_w 4364958642647127227
      // 368: lload 4
      // 36a: lxor
      // 36b: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 373: aload 0
      // 374: aload 2
      // 375: lload 10
      // 377: bipush 2
      // 378: anewarray 135
      // 37b: dup_x2
      // 37c: dup_x2
      // 37d: pop
      // 37e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 381: bipush 1
      // 382: swap
      // 383: aastore
      // 384: dup_x1
      // 385: swap
      // 386: bipush 0
      // 387: swap
      // 388: aastore
      // 389: ldc2_w 7322002378739185246
      // 38c: lload 4
      // 38e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 393: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 396: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 399: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 39c: athrow
      // 39d: ldc2_w 7395455579845770650
      // 3a0: lload 4
      // 3a2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: aload 20
      // 3aa: aload 16
      // 3ac: lload 4
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: iflt 3c5
      // 3b3: ifnonnull 5ef
      // 3b6: lload 14
      // 3b8: bipush 2
      // 3b9: anewarray 135
      // 3bc: dup_x2
      // 3bd: dup_x2
      // 3be: pop
      // 3bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c2: bipush 1
      // 3c3: swap
      // 3c4: aastore
      // 3c5: dup_x1
      // 3c6: swap
      // 3c7: bipush 0
      // 3c8: swap
      // 3c9: aastore
      // 3ca: ldc2_w 7489469156037955453
      // 3cd: lload 4
      // 3cf: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d4: goto 3e2
      // 3d7: ldc2_w 7395455579845770650
      // 3da: lload 4
      // 3dc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e1: athrow
      // 3e2: ifeq 5df
      // 3e5: aload 0
      // 3e6: ldc2_w 9211423193584654985
      // 3e9: lload 4
      // 3eb: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: aload 16
      // 3f2: ifnonnull 5c3
      // 3f5: goto 403
      // 3f8: ldc2_w 7395455579845770650
      // 3fb: lload 4
      // 3fd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: ifnull 5a2
      // 406: goto 414
      // 409: ldc2_w 7395455579845770650
      // 40c: lload 4
      // 40e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 413: athrow
      // 414: new java/io/File
      // 417: dup
      // 418: aload 0
      // 419: ldc2_w 9211423193584654985
      // 41c: lload 4
      // 41e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: aload 20
      // 425: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 428: astore 22
      // 42a: aload 22
      // 42c: aload 16
      // 42e: ifnonnull 591
      // 431: ldc2_w 7077263653252576459
      // 434: lload 4
      // 436: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: ifne 581
      // 43e: goto 44c
      // 441: ldc2_w 7395455579845770650
      // 444: lload 4
      // 446: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: athrow
      // 44c: new java/io/File
      // 44f: dup
      // 450: ldc2_w 7301415744215313297
      // 453: lload 4
      // 455: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45a: aload 20
      // 45c: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 45f: astore 23
      // 461: aload 23
      // 463: aload 16
      // 465: ifnonnull 569
      // 468: ldc2_w 7077263653252576459
      // 46b: lload 4
      // 46d: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: ifne 567
      // 475: goto 483
      // 478: ldc2_w 7395455579845770650
      // 47b: lload 4
      // 47d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 482: athrow
      // 483: new com/zelix/_sk
      // 486: dup
      // 487: new java/lang/StringBuilder
      // 48a: dup
      // 48b: invokespecial java/lang/StringBuilder.<init> ()V
      // 48e: sipush 20078
      // 491: ldc2_w 1197938871931294372
      // 494: lload 4
      // 496: lxor
      // 497: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49f: aload 22
      // 4a1: ldc2_w 8888989950025872223
      // 4a4: lload 4
      // 4a6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ae: sipush 14808
      // 4b1: ldc2_w 6041817199874975001
      // 4b4: lload 4
      // 4b6: lxor
      // 4b7: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bf: aload 23
      // 4c1: ldc2_w 8888989950025872223
      // 4c4: lload 4
      // 4c6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4ce: sipush 25718
      // 4d1: ldc2_w 3828733973904423074
      // 4d4: lload 4
      // 4d6: lxor
      // 4d7: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4df: sipush 24497
      // 4e2: ldc2_w 6616178357051999076
      // 4e5: lload 4
      // 4e7: lxor
      // 4e8: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f0: sipush 31104
      // 4f3: ldc2_w 2136878175237006656
      // 4f6: lload 4
      // 4f8: lxor
      // 4f9: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 501: aload 0
      // 502: ldc2_w 7345637260361138434
      // 505: lload 4
      // 507: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50f: aload 3
      // 510: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 513: aload 0
      // 514: ldc2_w 7357234974957221397
      // 517: lload 4
      // 519: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 521: sipush 16707
      // 524: ldc2_w 1537717385376652702
      // 527: lload 4
      // 529: lxor
      // 52a: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 532: aload 0
      // 533: aload 2
      // 534: lload 10
      // 536: bipush 2
      // 537: anewarray 135
      // 53a: dup_x2
      // 53b: dup_x2
      // 53c: pop
      // 53d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 540: bipush 1
      // 541: swap
      // 542: aastore
      // 543: dup_x1
      // 544: swap
      // 545: bipush 0
      // 546: swap
      // 547: aastore
      // 548: ldc2_w 7322002378739185246
      // 54b: lload 4
      // 54d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 552: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 555: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 558: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 55b: athrow
      // 55c: ldc2_w 7395455579845770650
      // 55f: lload 4
      // 561: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 566: athrow
      // 567: aload 23
      // 569: ldc2_w 8888989950025872223
      // 56c: lload 4
      // 56e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 573: astore 21
      // 575: aload 16
      // 577: lload 4
      // 579: lconst_0
      // 57a: lcmp
      // 57b: iflt 59f
      // 57e: ifnull 59d
      // 581: aload 22
      // 583: goto 591
      // 586: ldc2_w 7395455579845770650
      // 589: lload 4
      // 58b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 590: athrow
      // 591: ldc2_w 8888989950025872223
      // 594: lload 4
      // 596: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59b: astore 21
      // 59d: aload 16
      // 59f: ifnull 5f1
      // 5a2: new java/io/File
      // 5a5: dup
      // 5a6: ldc2_w 7301415744215313297
      // 5a9: lload 4
      // 5ab: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b0: aload 20
      // 5b2: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 5b5: goto 5c3
      // 5b8: ldc2_w 7395455579845770650
      // 5bb: lload 4
      // 5bd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c2: athrow
      // 5c3: astore 22
      // 5c5: aload 22
      // 5c7: ldc2_w 8888989950025872223
      // 5ca: lload 4
      // 5cc: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d1: lload 4
      // 5d3: lconst_0
      // 5d4: lcmp
      // 5d5: ifle 5e1
      // 5d8: astore 21
      // 5da: aload 16
      // 5dc: ifnull 5f1
      // 5df: aload 20
      // 5e1: goto 5ef
      // 5e4: ldc2_w 7395455579845770650
      // 5e7: lload 4
      // 5e9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ee: athrow
      // 5ef: astore 21
      // 5f1: aload 0
      // 5f2: lload 8
      // 5f4: aload 21
      // 5f6: lload 6
      // 5f8: aload 2
      // 5f9: bipush 2
      // 5fa: anewarray 135
      // 5fd: dup_x1
      // 5fe: swap
      // 5ff: bipush 1
      // 600: swap
      // 601: aastore
      // 602: dup_x2
      // 603: dup_x2
      // 604: pop
      // 605: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 608: bipush 0
      // 609: swap
      // 60a: aastore
      // 60b: ldc2_w 7400617302863338161
      // 60e: lload 4
      // 610: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: bipush 3
      // 616: anewarray 135
      // 619: dup_x1
      // 61a: swap
      // 61b: bipush 2
      // 61c: swap
      // 61d: aastore
      // 61e: dup_x1
      // 61f: swap
      // 620: bipush 1
      // 621: swap
      // 622: aastore
      // 623: dup_x2
      // 624: dup_x2
      // 625: pop
      // 626: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 629: bipush 0
      // 62a: swap
      // 62b: aastore
      // 62c: ldc2_w 7201127850848016023
      // 62f: lload 4
      // 631: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 636: areturn
      // 637: new com/zelix/_sk
      // 63a: dup
      // 63b: new java/lang/StringBuilder
      // 63e: dup
      // 63f: invokespecial java/lang/StringBuilder.<init> ()V
      // 642: sipush 5785
      // 645: ldc2_w 753039495871498826
      // 648: lload 4
      // 64a: lxor
      // 64b: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 650: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 653: aload 0
      // 654: ldc2_w 7345637260361138434
      // 657: lload 4
      // 659: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 661: aload 3
      // 662: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 665: aload 0
      // 666: ldc2_w 7357234974957221397
      // 669: lload 4
      // 66b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 670: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 673: sipush 16707
      // 676: ldc2_w 1537717385376652702
      // 679: lload 4
      // 67b: lxor
      // 67c: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 681: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 684: aload 0
      // 685: aload 2
      // 686: lload 10
      // 688: bipush 2
      // 689: anewarray 135
      // 68c: dup_x2
      // 68d: dup_x2
      // 68e: pop
      // 68f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 692: bipush 1
      // 693: swap
      // 694: aastore
      // 695: dup_x1
      // 696: swap
      // 697: bipush 0
      // 698: swap
      // 699: aastore
      // 69a: ldc2_w 7322002378739185246
      // 69d: lload 4
      // 69f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6aa: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 6ad: athrow
      // 6ae: new com/zelix/_sk
      // 6b1: dup
      // 6b2: new java/lang/StringBuilder
      // 6b5: dup
      // 6b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 6b9: sipush 2223
      // 6bc: ldc2_w 1709705120581358695
      // 6bf: lload 4
      // 6c1: lxor
      // 6c2: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ca: aload 0
      // 6cb: ldc2_w 7345637260361138434
      // 6ce: lload 4
      // 6d0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d8: aload 3
      // 6d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6dc: aload 0
      // 6dd: ldc2_w 7357234974957221397
      // 6e0: lload 4
      // 6e2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ea: sipush 9099
      // 6ed: ldc2_w 6170232098010578775
      // 6f0: lload 4
      // 6f2: lxor
      // 6f3: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6fb: aload 3
      // 6fc: iload 17
      // 6fe: sipush 24497
      // 701: ldc2_w 6616178357051999076
      // 704: lload 4
      // 706: lxor
      // 707: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70c: invokevirtual java/lang/String.length ()I
      // 70f: iadd
      // 710: iload 18
      // 712: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 715: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 718: sipush 18537
      // 71b: ldc2_w 4364958642647127227
      // 71e: lload 4
      // 720: lxor
      // 721: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 726: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 729: aload 0
      // 72a: aload 2
      // 72b: lload 10
      // 72d: bipush 2
      // 72e: anewarray 135
      // 731: dup_x2
      // 732: dup_x2
      // 733: pop
      // 734: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 737: bipush 1
      // 738: swap
      // 739: aastore
      // 73a: dup_x1
      // 73b: swap
      // 73c: bipush 0
      // 73d: swap
      // 73e: aastore
      // 73f: ldc2_w 7322002378739185246
      // 742: lload 4
      // 744: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 749: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 74f: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 752: athrow
      // 753: new com/zelix/_sk
      // 756: dup
      // 757: new java/lang/StringBuilder
      // 75a: dup
      // 75b: invokespecial java/lang/StringBuilder.<init> ()V
      // 75e: sipush 3248
      // 761: ldc2_w 8263993748855394414
      // 764: lload 4
      // 766: lxor
      // 767: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76f: aload 0
      // 770: ldc2_w 7345637260361138434
      // 773: lload 4
      // 775: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77d: aload 3
      // 77e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 781: aload 0
      // 782: ldc2_w 7357234974957221397
      // 785: lload 4
      // 787: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78f: sipush 16707
      // 792: ldc2_w 1537717385376652702
      // 795: lload 4
      // 797: lxor
      // 798: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a0: aload 0
      // 7a1: aload 2
      // 7a2: lload 10
      // 7a4: bipush 2
      // 7a5: anewarray 135
      // 7a8: dup_x2
      // 7a9: dup_x2
      // 7aa: pop
      // 7ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7ae: bipush 1
      // 7af: swap
      // 7b0: aastore
      // 7b1: dup_x1
      // 7b2: swap
      // 7b3: bipush 0
      // 7b4: swap
      // 7b5: aastore
      // 7b6: ldc2_w 7322002378739185246
      // 7b9: lload 4
      // 7bb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7c6: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 7c9: athrow
   }

   public BufferedReader A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new BufferedReader(new StringReader(x44.a<"m">(this, -732056268774623588L, var2)));
   }

   private String D(Object[] param1) {
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
      // 04: checkcast java/util/ArrayList
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/_k.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: new java/lang/StringBuffer
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuffer.<init> ()V
      // 20: astore 6
      // 22: ldc2_w -1990474835301730184
      // 25: lload 3
      // 26: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 2
      // 2c: invokevirtual java/util/ArrayList.size ()I
      // 2f: bipush 1
      // 30: isub
      // 31: istore 7
      // 33: astore 5
      // 35: iload 7
      // 37: iflt e3
      // 3a: aload 2
      // 3b: iload 7
      // 3d: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 40: checkcast java/lang/String
      // 43: aload 5
      // 45: ifnonnull ee
      // 48: astore 8
      // 4a: aload 5
      // 4c: lload 3
      // 4d: lconst_0
      // 4e: lcmp
      // 4f: ifle 9b
      // 52: ifnonnull 99
      // 55: iload 7
      // 57: aload 2
      // 58: invokevirtual java/util/ArrayList.size ()I
      // 5b: bipush 1
      // 5c: isub
      // 5d: if_icmpne a4
      // 60: goto 6d
      // 63: ldc2_w -177630336731011405
      // 66: lload 3
      // 67: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 6
      // 6f: new java/lang/StringBuilder
      // 72: dup
      // 73: invokespecial java/lang/StringBuilder.<init> ()V
      // 76: ldc "'"
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: aload 8
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: ldc "'"
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 8b: pop
      // 8c: goto 99
      // 8f: ldc2_w -177630336731011405
      // 92: lload 3
      // 93: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 5
      // 9b: lload 3
      // 9c: lconst_0
      // 9d: lcmp
      // 9e: ifle e0
      // a1: ifnull db
      // a4: aload 6
      // a6: new java/lang/StringBuilder
      // a9: dup
      // aa: invokespecial java/lang/StringBuilder.<init> ()V
      // ad: sipush 3812
      // b0: ldc2_w 2612645740909725974
      // b3: lload 3
      // b4: lxor
      // b5: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bd: aload 8
      // bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c2: ldc "'"
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ca: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // cd: pop
      // ce: goto db
      // d1: ldc2_w -177630336731011405
      // d4: lload 3
      // d5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: iinc 7 -1
      // de: aload 5
      // e0: ifnull 35
      // e3: aload 6
      // e5: lload 3
      // e6: lconst_0
      // e7: lcmp
      // e8: ifle 40
      // eb: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // ee: areturn
   }

   private boolean B(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/_k.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 5176118478406278093
      // 1c: lload 3
      // 1d: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 2
      // 23: invokevirtual java/lang/String.length ()I
      // 26: istore 6
      // 28: astore 5
      // 2a: bipush 0
      // 2b: istore 7
      // 2d: iload 7
      // 2f: iload 6
      // 31: if_icmpge 8b
      // 34: aload 2
      // 35: iload 7
      // 37: invokevirtual java/lang/String.charAt (I)C
      // 3a: aload 5
      // 3c: lload 3
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: iflt 47
      // 42: ifnonnull 92
      // 45: aload 5
      // 47: ifnonnull 82
      // 4a: goto 57
      // 4d: ldc2_w 6790799163913209094
      // 50: lload 3
      // 51: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: sipush 5284
      // 5a: ldc2_w 6280110011453286249
      // 5d: lload 3
      // 5e: lxor
      // 5f: invokedynamic u (IJ)I bsm=com/zelix/_k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: if_icmpeq 83
      // 67: goto 74
      // 6a: ldc2_w 6790799163913209094
      // 6d: lload 3
      // 6e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: bipush 0
      // 75: goto 82
      // 78: ldc2_w 6790799163913209094
      // 7b: lload 3
      // 7c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: ireturn
      // 83: iinc 7 1
      // 86: aload 5
      // 88: ifnull 2d
      // 8b: lload 3
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: iflt 34
      // 91: bipush 1
      // 92: ireturn
   }

   public _k(String var1, String var2, Properties var3, String var4, long var5) {
      var5 = a ^ var5;
      long var7 = var5 ^ 88993178564299L;
      this(var1, var2, var7, var3, var4, null);
   }

   static {
      long var20 = a ^ 44235170816249L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[32];
      int var16 = 0;
      String var15 = " ù®b\u0085\u0088Jh¤\u0006»\t<\u0016«\u001a'\u008b®rÜÐ\u0094\u0096#û\u009dê\u0085\u009ce\u009fÆ£!N\u0089\u008cá¬\u0004ß\u0007\u001e4\n\u0086TtºóöuÅ\u0085\u000b\u009dpP\u001c\u000eðZ©kÏûò\u001fc\b²\u0010OI\u001bÃF<Ýf\u0004¹\\Q\u0098û\u008eË(\u0082}y\u001dà]ªz, J\u00066úÑ}±\u009a¤ê\u0004\u0016@924¸×Çå±\u001fõ\u0005¡å«U+\u0003\u0018_\u0084\u001bY=ÒÚ<\u009dÂ\u0019ý(ûz{ë»&8]Ç\u0010¯`&\u0092\u0092ºM\u0005ji\r\u009aWñ\u0087á$3Æ}÷#ßéïñ\u008dyÌBqËª\u008bß\nó\u0086\"uy\nñh>\u0014-\u008eàÀ3ú9÷]\u001cKi¹\rk\u008e> \u00ad¹Ì\u0080¦Mq\u0086@læ\"\u000b\u0082ã\n\u007fÊ¢q!\u0017\u008fä\u0081àÌ)õd\u008bB\u0013P(\u001eÖ\nsì¬è²\u00ad\u001e:&É\u0087(²E\u000fuòJ_\u0095\u0084$\nhûizÚ!#\u0019õá\u0098¡0\u0017 7\r\u0099\u00042\u009f,\u0012\u0089rfúb\u000e!¿ ewÐ\u000f,\u0086\u0097^Ù¿x\u008f\u0012w\u0018\u0010¬\\>Ê0\u001a\u0017§\u008eîú¨\u0013\f\u0012\u0003 \u001dB\u000fs\u0096\u0086 d¦3ÅÎ\u008d\u009d\u0094°1Zy;\u009e!\u000e\u0013\u0014¼3Ái\u0014\u001eµ\u0010m¡mm\u000fMtó\u008að\rì\u000fÛRz\u0010X¢Jo\"\u0019J9\u0017\u000bí8fì\u009fþP»7Î\u008e@ÉJã\u008cIv\u001a\u0084%9\u009aÝ\u0081¦¥#%,-K×Øçª*8Wr5[Ïã®à?ÅÇ\u0013D(\u007f×ÂêQË77\u008aâëÔ\u000e\u000b\u009fÔ\u009dhoW4úhÃ[Ïbt \u0097÷\u0091h\u009cQHãËnvo\f}\u009cöæ\b2}iËè+í\u007f|ø\u00ad\u009cy¸:Î\u0094n'k\u0094\u0014\u0086ÈKi\"\u008a\u0085£R\u0014o@÷*\u0083XÖ\u009d\u00975-í½rc¶\u008a\u0085÷Cù\u000f\u0017¢ \u0084^4D(ôüÂDJ\u001dé>Z\u0010á\u0089=µó¢\u0091\fË\u0092Í\u009a~ù#¼À«\u0086Duåú\u001e\u0005ù\u009cíÇ{X8Q`¼\u0001£\u0093È|mê®\u0081¦Êåd\u0016ú¦§_\u0093i\u008e\u0013)\u0084â\u0085\\Cq±z©\b¾ýï \u0082õ¤]Y\u0090\u0084\u0083\u000fÿèd\u000b6\u0094´;\u0001zÞ<Qüa¥ëp\u000b\u0084\u0006\u0000Z\u00910|+°:3cÝ\u0082\u009d¢ÕÎx\u0010æ\u0018Î[Ø,U%\"OK¨ó\u008bEK(aö\u0012/\u0004(I\u001bÎÌ)n\u008cxé- :ø\u001d¾.\u001d69}+\u0004½¤µ\u0003x]\u009fï\u009c\u009cy\u009b(Ð&ÖØ\u0018ùÚ6Lp)Ö;\u0087¯êUí\u0081'\u0011\u009cãJO\u008e\u00852@°yäYû\rÇ¤\u0095\u0003\u0010(^\u0017p9â\u0000þ'µ\u0017\u0080(¼qÂre\u009e\u0005ï6\u00144%\u0003Å[\u007fÕuÂ`\u0087 æ\u0001pã²ë\u0010C\u0086¸ÛGjªúZ/ñáæjGÁ8§Àþo\u0091K0¦¸\u0086KRD\u0086±¥\u008b¾a{\u0003'\u0007\u0018»á â³\u0000°\u0015-mèÍ¾\u0081fmß½Å\u0082Ù\u0015\u0003ãå¨\rè\fÙZ¼p,`\u0092Z z'¤\u008dÍ\u0089 H}\u0005\u0089-_¬w \u0082ª¢oö\u0095\u008e}ÛO\tÃª\u0094Q\u008eÂw\u0089¥¤\u001cÒEÎob×¥Åá4Ô\u0012ù<ÛU@À\u001czÑ¸:pã>i\t\r¦W}\u009cyº\u0093\u0099\u008d\u0086E`;½O\u008e\u0018s¥Ñ©ùÚØñ<GÇDNq(Rã12è¬\u0099\u000b0ª;ÅeC\u000b\u009br{á½ø9[=9ñú\u0011\u000f\u0091\u0095\u0088Õ\u00961\u009dÜ\u0019\u001ds<pÝ\rø[9/K\u0097äæ\u0082É\u0019\u008fh@±ëå\u0015À\b+¯àõÀvÒ\u00ad\u0089²»¹~|³CÐ\u001aÿh¼Y\u0097¤Ózù÷»ÜÓª\u007f\u0016Â^\u008bÃ\u008e¼\u001doèâï6Ñ6JD|#,I\u001a](²p\u0010\u008c\u0015l\u0092ªQÅ\b3\u0080Góç\u0013\u009bl\u0013ÔS\u008eY\u0012Ô\u0019Å\u0004¼L\u0000é¹F\u008e\u001f\u009bD6%\u0091\u008fC\u007føË½_\u0083Xêùå)6Óh p$·p\u009b)à\u009a\u0080K\u0080\u0080\u0095â\u0002AáÌ\u001a\u0093%¨-ð¡/½\u00152§aÝ\u001b4!1\u0085SQ\u001b¯C¶\u009b)ª\u0015\u0082Cæ+¿Y\u009fi \u0098hCÊ%ñÞÑ\u000b\u001bª\n1å\u0017ÈÐ\u0018\u0015ù\u001b`\u008aæ¿{:©\u0018,©\t u\u0004û\u008e\u009b\u0097À$º\u00986-«\u0015·¦oaëÝ¿õ\u0001,Âú¤´\f}$Y ¶\u0089l\u0092)ÃOà \u008eõ\u0084½K¸x§\u0092\u0010¡\u008f=<P(\nã×^v\rd(Ú¡>x$Y}#æ\u008cÚÒ\u0092ØO}ë\u001eÓô\u001a9vÊ\u0080s%·fv²4~ûMÞÎìD¹ \u009f2ÔBWAF\u0085\b\rø§:*ÇösÁ\u009fo=Ä\u009fø\u00107÷À\u008cãÃy";
      int var17 = " ù®b\u0085\u0088Jh¤\u0006»\t<\u0016«\u001a'\u008b®rÜÐ\u0094\u0096#û\u009dê\u0085\u009ce\u009fÆ£!N\u0089\u008cá¬\u0004ß\u0007\u001e4\n\u0086TtºóöuÅ\u0085\u000b\u009dpP\u001c\u000eðZ©kÏûò\u001fc\b²\u0010OI\u001bÃF<Ýf\u0004¹\\Q\u0098û\u008eË(\u0082}y\u001dà]ªz, J\u00066úÑ}±\u009a¤ê\u0004\u0016@924¸×Çå±\u001fõ\u0005¡å«U+\u0003\u0018_\u0084\u001bY=ÒÚ<\u009dÂ\u0019ý(ûz{ë»&8]Ç\u0010¯`&\u0092\u0092ºM\u0005ji\r\u009aWñ\u0087á$3Æ}÷#ßéïñ\u008dyÌBqËª\u008bß\nó\u0086\"uy\nñh>\u0014-\u008eàÀ3ú9÷]\u001cKi¹\rk\u008e> \u00ad¹Ì\u0080¦Mq\u0086@læ\"\u000b\u0082ã\n\u007fÊ¢q!\u0017\u008fä\u0081àÌ)õd\u008bB\u0013P(\u001eÖ\nsì¬è²\u00ad\u001e:&É\u0087(²E\u000fuòJ_\u0095\u0084$\nhûizÚ!#\u0019õá\u0098¡0\u0017 7\r\u0099\u00042\u009f,\u0012\u0089rfúb\u000e!¿ ewÐ\u000f,\u0086\u0097^Ù¿x\u008f\u0012w\u0018\u0010¬\\>Ê0\u001a\u0017§\u008eîú¨\u0013\f\u0012\u0003 \u001dB\u000fs\u0096\u0086 d¦3ÅÎ\u008d\u009d\u0094°1Zy;\u009e!\u000e\u0013\u0014¼3Ái\u0014\u001eµ\u0010m¡mm\u000fMtó\u008að\rì\u000fÛRz\u0010X¢Jo\"\u0019J9\u0017\u000bí8fì\u009fþP»7Î\u008e@ÉJã\u008cIv\u001a\u0084%9\u009aÝ\u0081¦¥#%,-K×Øçª*8Wr5[Ïã®à?ÅÇ\u0013D(\u007f×ÂêQË77\u008aâëÔ\u000e\u000b\u009fÔ\u009dhoW4úhÃ[Ïbt \u0097÷\u0091h\u009cQHãËnvo\f}\u009cöæ\b2}iËè+í\u007f|ø\u00ad\u009cy¸:Î\u0094n'k\u0094\u0014\u0086ÈKi\"\u008a\u0085£R\u0014o@÷*\u0083XÖ\u009d\u00975-í½rc¶\u008a\u0085÷Cù\u000f\u0017¢ \u0084^4D(ôüÂDJ\u001dé>Z\u0010á\u0089=µó¢\u0091\fË\u0092Í\u009a~ù#¼À«\u0086Duåú\u001e\u0005ù\u009cíÇ{X8Q`¼\u0001£\u0093È|mê®\u0081¦Êåd\u0016ú¦§_\u0093i\u008e\u0013)\u0084â\u0085\\Cq±z©\b¾ýï \u0082õ¤]Y\u0090\u0084\u0083\u000fÿèd\u000b6\u0094´;\u0001zÞ<Qüa¥ëp\u000b\u0084\u0006\u0000Z\u00910|+°:3cÝ\u0082\u009d¢ÕÎx\u0010æ\u0018Î[Ø,U%\"OK¨ó\u008bEK(aö\u0012/\u0004(I\u001bÎÌ)n\u008cxé- :ø\u001d¾.\u001d69}+\u0004½¤µ\u0003x]\u009fï\u009c\u009cy\u009b(Ð&ÖØ\u0018ùÚ6Lp)Ö;\u0087¯êUí\u0081'\u0011\u009cãJO\u008e\u00852@°yäYû\rÇ¤\u0095\u0003\u0010(^\u0017p9â\u0000þ'µ\u0017\u0080(¼qÂre\u009e\u0005ï6\u00144%\u0003Å[\u007fÕuÂ`\u0087 æ\u0001pã²ë\u0010C\u0086¸ÛGjªúZ/ñáæjGÁ8§Àþo\u0091K0¦¸\u0086KRD\u0086±¥\u008b¾a{\u0003'\u0007\u0018»á â³\u0000°\u0015-mèÍ¾\u0081fmß½Å\u0082Ù\u0015\u0003ãå¨\rè\fÙZ¼p,`\u0092Z z'¤\u008dÍ\u0089 H}\u0005\u0089-_¬w \u0082ª¢oö\u0095\u008e}ÛO\tÃª\u0094Q\u008eÂw\u0089¥¤\u001cÒEÎob×¥Åá4Ô\u0012ù<ÛU@À\u001czÑ¸:pã>i\t\r¦W}\u009cyº\u0093\u0099\u008d\u0086E`;½O\u008e\u0018s¥Ñ©ùÚØñ<GÇDNq(Rã12è¬\u0099\u000b0ª;ÅeC\u000b\u009br{á½ø9[=9ñú\u0011\u000f\u0091\u0095\u0088Õ\u00961\u009dÜ\u0019\u001ds<pÝ\rø[9/K\u0097äæ\u0082É\u0019\u008fh@±ëå\u0015À\b+¯àõÀvÒ\u00ad\u0089²»¹~|³CÐ\u001aÿh¼Y\u0097¤Ózù÷»ÜÓª\u007f\u0016Â^\u008bÃ\u008e¼\u001doèâï6Ñ6JD|#,I\u001a](²p\u0010\u008c\u0015l\u0092ªQÅ\b3\u0080Góç\u0013\u009bl\u0013ÔS\u008eY\u0012Ô\u0019Å\u0004¼L\u0000é¹F\u008e\u001f\u009bD6%\u0091\u008fC\u007føË½_\u0083Xêùå)6Óh p$·p\u009b)à\u009a\u0080K\u0080\u0080\u0095â\u0002AáÌ\u001a\u0093%¨-ð¡/½\u00152§aÝ\u001b4!1\u0085SQ\u001b¯C¶\u009b)ª\u0015\u0082Cæ+¿Y\u009fi \u0098hCÊ%ñÞÑ\u000b\u001bª\n1å\u0017ÈÐ\u0018\u0015ù\u001b`\u008aæ¿{:©\u0018,©\t u\u0004û\u008e\u009b\u0097À$º\u00986-«\u0015·¦oaëÝ¿õ\u0001,Âú¤´\f}$Y ¶\u0089l\u0092)ÃOà \u008eõ\u0084½K¸x§\u0092\u0010¡\u008f=<P(\nã×^v\rd(Ú¡>x$Y}#æ\u008cÚÒ\u0092ØO}ë\u001eÓô\u001a9vÊ\u0080s%·fv²4~ûMÞÎìD¹ \u009f2ÔBWAF\u0085\b\rø§:*ÇösÁ\u009fo=Ä\u009fø\u00107÷À\u008cãÃy"
         .length();
      char var14 = 'H';
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
                     c = new String[32];
                     g = new HashMap(13);
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
                     String var4 = "¦.Õ\u001a£0Oõ\u0081_\u0088ñõ_vBûyS%Öh\b·%7)ê{\u008cº\u0086";
                     int var5 = "¦.Õ\u001a£0Oõ\u0081_\u0088ñõ_vBûyS%Öh\b·%7)ê{\u008cº\u0086".length();
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
                                    f = new Integer[6];
                                    Y = x44.a<"v">(a<"y">(6576, 5723326566553743428L ^ var20), 677749244242822775L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u00940[\u0099ñÆ)05\u0087\u0085jd½´\u009a";
                                 var5 = "\u00940[\u0099ñÆ)05\u0087\u0085jd½´\u009a".length();
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

                  var15 = "\u0003N×\u009c}&q\u0014\u009e¸&¹\u001f\u008d\u001d&\u007f\u0012/Õ~\u009fÃ6ê+ß\u0087Lt rQ¢äG7ãÒ>±QJ>#\u007fB\u0007\u0088\u0014ÂÓ\u001f¯<*0qàT|\u008d¨þÐ 9ûD\u0010ª6IÔTí6.o\u000b\u0017\u0003\nz\nZ§S÷\u0097Dq\u0087,¤W\u0004sc\u009c\u0085Å\u0087V\u0002]Î|\u009b\u007fe#k$\u0018¦à\u008bó,ß\u0015QùôûÓÁnÓ'ÌûðT\u000f\u0007 ^ÂQÖä\u000e³5¦\u0098×!R\u007f\u0098Ç\u0099\u008b£@\u008a\u001edë ý0±kûßz©åÛd¹ñ\u0007\u0087 ?î¬í\u0082H\u008c\u0095\u0094Dg\u0004}\u0092R4fÃÙÉ\"²GS.Ýc¾Jn(Ý\u0016>L\u0097JH8¦?GTÛ9r0åã#]\u001fs\u001c§\u0017@rXÅ\u009dOGFê\u0097¡\u0004ãl\u001dÇ\u0090\u001aús*\u001a8ÆÕçã:\nÿ\u0006ª\u0000\u001d\u0094\u0006x\u00ad\u0007UûÎ\u001c=ï\u0001'+1\rÿ\u001c3é";
                  var17 = "\u0003N×\u009c}&q\u0014\u009e¸&¹\u001f\u008d\u001d&\u007f\u0012/Õ~\u009fÃ6ê+ß\u0087Lt rQ¢äG7ãÒ>±QJ>#\u007fB\u0007\u0088\u0014ÂÓ\u001f¯<*0qàT|\u008d¨þÐ 9ûD\u0010ª6IÔTí6.o\u000b\u0017\u0003\nz\nZ§S÷\u0097Dq\u0087,¤W\u0004sc\u009c\u0085Å\u0087V\u0002]Î|\u009b\u007fe#k$\u0018¦à\u008bó,ß\u0015QùôûÓÁnÓ'ÌûðT\u000f\u0007 ^ÂQÖä\u000e³5¦\u0098×!R\u007f\u0098Ç\u0099\u008b£@\u008a\u001edë ý0±kûßz©åÛd¹ñ\u0007\u0087 ?î¬í\u0082H\u008c\u0095\u0094Dg\u0004}\u0092R4fÃÙÉ\"²GS.Ýc¾Jn(Ý\u0016>L\u0097JH8¦?GTÛ9r0åã#]\u001fs\u001c§\u0017@rXÅ\u009dOGFê\u0097¡\u0004ãl\u001dÇ\u0090\u001aús*\u001a8ÆÕçã:\nÿ\u0006ª\u0000\u001d\u0094\u0006x\u00ad\u0007UûÎ\u001c=ï\u0001'+1\rÿ\u001c3é"
                     .length();
                  var14 = 216;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public String V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -6139528231964219001L, var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27384;
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
            throw new RuntimeException("com/zelix/_k", var10);
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
         throw new RuntimeException("com/zelix/_k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32111;
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
            throw new RuntimeException("com/zelix/_k", var14);
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
         throw new RuntimeException("com/zelix/_k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
