package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class js implements Comparable {
   static final Map A;
   private static _0[] R;
   static final Map Y;
   static final Map U;
   int t;
   to l;
   private static final long bb = prr.a(-1818119810875311160L, -7774037473382919306L, MethodHandles.lookup().lookupClass()).a(39357358203398L);
   private static final String[] eb;
   private static final String[] fb;
   private static final Map gb = new HashMap(13);
   private static final long[] nb;
   private static final Integer[] ob;
   private static final Map pb;

   public static String r(Object[] param0) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/zr
      // 017: astore 1
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 2
      // 022: pop
      // 023: getstatic com/zelix/js.bb J
      // 026: lload 2
      // 027: lxor
      // 028: lstore 2
      // 029: ldc2_w -3983241909528056228
      // 02c: lload 2
      // 02d: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: aload 1
      // 033: bipush 0
      // 034: invokevirtual com/zelix/zr.I (Z)V
      // 037: istore 6
      // 039: aload 4
      // 03b: astore 7
      // 03d: aload 7
      // 03f: invokevirtual java/lang/String.length ()I
      // 042: istore 8
      // 044: aconst_null
      // 045: astore 9
      // 047: aconst_null
      // 048: astore 10
      // 04a: aload 7
      // 04c: ldc ";"
      // 04e: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 051: ifeq 200
      // 054: new java/lang/StringBuilder
      // 057: dup
      // 058: invokespecial java/lang/StringBuilder.<init> ()V
      // 05b: astore 9
      // 05d: aload 7
      // 05f: ldc "["
      // 061: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 064: lload 2
      // 065: lconst_0
      // 066: lcmp
      // 067: iflt 1ae
      // 06a: iload 6
      // 06c: ifne 1ae
      // 06f: ifeq 188
      // 072: goto 07f
      // 075: ldc2_w -3913695704197762200
      // 078: lload 2
      // 079: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 9
      // 081: sipush 5382
      // 084: ldc2_w 2920327502926155619
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 091: pop
      // 092: bipush 1
      // 093: istore 11
      // 095: iload 11
      // 097: iload 8
      // 099: if_icmpge 177
      // 09c: aload 7
      // 09e: lload 2
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: ifle 1ee
      // 0a4: iload 11
      // 0a6: invokevirtual java/lang/String.charAt (I)C
      // 0a9: istore 12
      // 0ab: iload 6
      // 0ad: ifne 1ec
      // 0b0: iload 12
      // 0b2: sipush 31617
      // 0b5: ldc2_w 5537920887849050601
      // 0b8: lload 2
      // 0b9: lxor
      // 0ba: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: iflt 134
      // 0c5: iload 6
      // 0c7: ifne 134
      // 0ca: goto 0d7
      // 0cd: ldc2_w -3913695704197762200
      // 0d0: lload 2
      // 0d1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: lload 2
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 127
      // 0dd: if_icmpne 118
      // 0e0: goto 0ed
      // 0e3: ldc2_w -3913695704197762200
      // 0e6: lload 2
      // 0e7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 9
      // 0ef: sipush 31617
      // 0f2: ldc2_w 5537920887849050601
      // 0f5: lload 2
      // 0f6: lxor
      // 0f7: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ff: pop
      // 100: iload 6
      // 102: lload 2
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 174
      // 108: ifeq 16f
      // 10b: goto 118
      // 10e: ldc2_w -3913695704197762200
      // 111: lload 2
      // 112: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: iload 12
      // 11a: sipush 3080
      // 11d: ldc2_w 7918276605638678120
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: goto 134
      // 12a: ldc2_w -3913695704197762200
      // 12d: lload 2
      // 12e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: if_icmpne 162
      // 137: aload 9
      // 139: sipush 16554
      // 13c: ldc2_w 5250351824158907081
      // 13f: lload 2
      // 140: lxor
      // 141: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 149: pop
      // 14a: iload 6
      // 14c: lload 2
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: ifle 185
      // 152: ifeq 177
      // 155: goto 162
      // 158: ldc2_w -3913695704197762200
      // 15b: lload 2
      // 15c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 4
      // 164: areturn
      // 165: ldc2_w -3913695704197762200
      // 168: lload 2
      // 169: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: iinc 11 1
      // 172: iload 6
      // 174: ifeq 095
      // 177: lload 2
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 188
      // 17d: iload 6
      // 17f: lload 2
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 0a9
      // 185: ifeq 1ec
      // 188: aload 7
      // 18a: iload 6
      // 18c: ifne 1eb
      // 18f: goto 19c
      // 192: ldc2_w -3913695704197762200
      // 195: lload 2
      // 196: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: ldc "L"
      // 19e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1a1: goto 1ae
      // 1a4: ldc2_w -3913695704197762200
      // 1a7: lload 2
      // 1a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: lload 2
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: iflt 1cc
      // 1b4: ifeq 1dc
      // 1b7: aload 9
      // 1b9: sipush 16554
      // 1bc: ldc2_w 5250351824158907081
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c9: pop
      // 1ca: iload 6
      // 1cc: ifeq 1ec
      // 1cf: goto 1dc
      // 1d2: ldc2_w -3913695704197762200
      // 1d5: lload 2
      // 1d6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 4
      // 1de: goto 1eb
      // 1e1: ldc2_w -3913695704197762200
      // 1e4: lload 2
      // 1e5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: areturn
      // 1ec: ldc ";"
      // 1ee: astore 10
      // 1f0: aload 7
      // 1f2: aload 9
      // 1f4: invokevirtual java/lang/StringBuilder.length ()I
      // 1f7: iload 8
      // 1f9: bipush 1
      // 1fa: isub
      // 1fb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1fe: astore 7
      // 200: bipush 0
      // 201: istore 11
      // 203: aload 7
      // 205: iload 6
      // 207: lload 2
      // 208: lconst_0
      // 209: lcmp
      // 20a: ifle 21d
      // 20d: ifne 2a4
      // 210: sipush 26350
      // 213: ldc2_w 8055423452102327445
      // 216: lload 2
      // 217: lxor
      // 218: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: invokevirtual java/lang/String.indexOf (I)I
      // 220: bipush -1
      // 221: if_icmpeq 295
      // 224: goto 231
      // 227: ldc2_w -3913695704197762200
      // 22a: lload 2
      // 22b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 7
      // 233: iload 6
      // 235: ifne 2a4
      // 238: goto 245
      // 23b: ldc2_w -3913695704197762200
      // 23e: lload 2
      // 23f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: athrow
      // 245: sipush 11284
      // 248: ldc2_w 1039533776106403448
      // 24b: lload 2
      // 24c: lxor
      // 24d: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: invokevirtual java/lang/String.indexOf (I)I
      // 255: bipush -1
      // 256: if_icmpne 295
      // 259: goto 266
      // 25c: ldc2_w -3913695704197762200
      // 25f: lload 2
      // 260: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: athrow
      // 266: aload 7
      // 268: sipush 20457
      // 26b: ldc2_w 4753168731495126413
      // 26e: lload 2
      // 26f: lxor
      // 270: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: sipush 7325
      // 278: ldc2_w 7371076641577436919
      // 27b: lload 2
      // 27c: lxor
      // 27d: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 285: lload 2
      // 286: lconst_0
      // 287: lcmp
      // 288: ifle 297
      // 28b: astore 12
      // 28d: bipush 1
      // 28e: istore 11
      // 290: iload 6
      // 292: ifeq 2a6
      // 295: aload 7
      // 297: goto 2a4
      // 29a: ldc2_w -3913695704197762200
      // 29d: lload 2
      // 29e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: astore 12
      // 2a6: aload 5
      // 2a8: aload 12
      // 2aa: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2af: checkcast java/lang/String
      // 2b2: astore 13
      // 2b4: aload 1
      // 2b5: aload 13
      // 2b7: ifnull 2c8
      // 2ba: bipush 1
      // 2bb: goto 2c9
      // 2be: ldc2_w -3913695704197762200
      // 2c1: lload 2
      // 2c2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: bipush 0
      // 2c9: invokevirtual com/zelix/zr.I (Z)V
      // 2cc: aload 7
      // 2ce: invokevirtual java/lang/String.length ()I
      // 2d1: istore 14
      // 2d3: aload 7
      // 2d5: sipush 20457
      // 2d8: ldc2_w 4753168731495126413
      // 2db: lload 2
      // 2dc: lxor
      // 2dd: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: invokevirtual java/lang/String.indexOf (I)I
      // 2e5: istore 15
      // 2e7: aload 7
      // 2e9: sipush 20457
      // 2ec: ldc2_w 4753168731495126413
      // 2ef: lload 2
      // 2f0: lxor
      // 2f1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: invokevirtual java/lang/String.lastIndexOf (I)I
      // 2f9: istore 16
      // 2fb: aload 7
      // 2fd: sipush 7325
      // 300: ldc2_w 7371076641577436919
      // 303: lload 2
      // 304: lxor
      // 305: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: invokevirtual java/lang/String.indexOf (I)I
      // 30d: istore 17
      // 30f: aload 7
      // 311: sipush 7325
      // 314: ldc2_w 7371076641577436919
      // 317: lload 2
      // 318: lxor
      // 319: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: invokevirtual java/lang/String.lastIndexOf (I)I
      // 321: istore 18
      // 323: aload 13
      // 325: iload 6
      // 327: ifne 555
      // 32a: ifnull 553
      // 32d: goto 33a
      // 330: ldc2_w -3913695704197762200
      // 333: lload 2
      // 334: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: athrow
      // 33a: aload 13
      // 33c: iload 6
      // 33e: ifne 555
      // 341: goto 34e
      // 344: ldc2_w -3913695704197762200
      // 347: lload 2
      // 348: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: aload 12
      // 350: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 353: ifne 553
      // 356: goto 363
      // 359: ldc2_w -3913695704197762200
      // 35c: lload 2
      // 35d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: athrow
      // 363: aload 12
      // 365: iload 6
      // 367: ifne 555
      // 36a: goto 377
      // 36d: ldc2_w -3913695704197762200
      // 370: lload 2
      // 371: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: athrow
      // 377: invokevirtual java/lang/String.length ()I
      // 37a: ldc2_w -3526234121733703089
      // 37d: lload 2
      // 37e: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: if_icmplt 553
      // 386: goto 393
      // 389: ldc2_w -3913695704197762200
      // 38c: lload 2
      // 38d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: aload 12
      // 395: iload 6
      // 397: ifne 555
      // 39a: goto 3a7
      // 39d: ldc2_w -3913695704197762200
      // 3a0: lload 2
      // 3a1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: bipush 0
      // 3a8: invokevirtual java/lang/String.charAt (I)C
      // 3ab: ldc2_w -3309055957479309284
      // 3ae: lload 2
      // 3af: invokedynamic l (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: ifeq 553
      // 3b7: goto 3c4
      // 3ba: ldc2_w -3913695704197762200
      // 3bd: lload 2
      // 3be: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: athrow
      // 3c4: iload 15
      // 3c6: iload 6
      // 3c8: ifne 456
      // 3cb: goto 3d8
      // 3ce: ldc2_w -3913695704197762200
      // 3d1: lload 2
      // 3d2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: lload 2
      // 3d9: lconst_0
      // 3da: lcmp
      // 3db: ifle 449
      // 3de: ifle 447
      // 3e1: goto 3ee
      // 3e4: ldc2_w -3913695704197762200
      // 3e7: lload 2
      // 3e8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: athrow
      // 3ee: iload 16
      // 3f0: iload 6
      // 3f2: lload 2
      // 3f3: lconst_0
      // 3f4: lcmp
      // 3f5: ifle 458
      // 3f8: ifne 456
      // 3fb: goto 408
      // 3fe: ldc2_w -3913695704197762200
      // 401: lload 2
      // 402: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: athrow
      // 408: lload 2
      // 409: lconst_0
      // 40a: lcmp
      // 40b: iflt 449
      // 40e: iload 14
      // 410: bipush 1
      // 411: isub
      // 412: if_icmpge 447
      // 415: goto 422
      // 418: ldc2_w -3913695704197762200
      // 41b: lload 2
      // 41c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: athrow
      // 422: iload 17
      // 424: iload 6
      // 426: ifne 4b3
      // 429: goto 436
      // 42c: ldc2_w -3913695704197762200
      // 42f: lload 2
      // 430: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: athrow
      // 436: bipush -1
      // 437: if_icmpeq 4b1
      // 43a: goto 447
      // 43d: ldc2_w -3913695704197762200
      // 440: lload 2
      // 441: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: iload 17
      // 449: goto 456
      // 44c: ldc2_w -3913695704197762200
      // 44f: lload 2
      // 450: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: athrow
      // 456: iload 6
      // 458: lload 2
      // 459: lconst_0
      // 45a: lcmp
      // 45b: iflt 477
      // 45e: ifne 473
      // 461: ifle 553
      // 464: goto 471
      // 467: ldc2_w -3913695704197762200
      // 46a: lload 2
      // 46b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: athrow
      // 471: iload 18
      // 473: iload 14
      // 475: bipush 1
      // 476: isub
      // 477: iload 6
      // 479: ifne 4ae
      // 47c: if_icmpge 553
      // 47f: goto 48c
      // 482: ldc2_w -3913695704197762200
      // 485: lload 2
      // 486: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: iload 15
      // 48e: iload 6
      // 490: ifne 4b3
      // 493: goto 4a0
      // 496: ldc2_w -3913695704197762200
      // 499: lload 2
      // 49a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49f: athrow
      // 4a0: bipush -1
      // 4a1: goto 4ae
      // 4a4: ldc2_w -3913695704197762200
      // 4a7: lload 2
      // 4a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ad: athrow
      // 4ae: if_icmpne 553
      // 4b1: iload 11
      // 4b3: ifeq 4d7
      // 4b6: aload 13
      // 4b8: sipush 7325
      // 4bb: ldc2_w 7371076641577436919
      // 4be: lload 2
      // 4bf: lxor
      // 4c0: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: sipush 20457
      // 4c8: ldc2_w 4753168731495126413
      // 4cb: lload 2
      // 4cc: lxor
      // 4cd: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d2: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 4d5: astore 13
      // 4d7: new java/lang/StringBuilder
      // 4da: dup
      // 4db: invokespecial java/lang/StringBuilder.<init> ()V
      // 4de: astore 19
      // 4e0: aload 9
      // 4e2: lload 2
      // 4e3: lconst_0
      // 4e4: lcmp
      // 4e5: ifle 51c
      // 4e8: iload 6
      // 4ea: ifne 51c
      // 4ed: ifnull 515
      // 4f0: goto 4fd
      // 4f3: ldc2_w -3913695704197762200
      // 4f6: lload 2
      // 4f7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fc: athrow
      // 4fd: aload 19
      // 4ff: aload 9
      // 501: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 504: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 507: pop
      // 508: goto 515
      // 50b: ldc2_w -3913695704197762200
      // 50e: lload 2
      // 50f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 514: athrow
      // 515: aload 19
      // 517: aload 13
      // 519: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51c: pop
      // 51d: aload 10
      // 51f: iload 6
      // 521: ifne 54e
      // 524: ifnull 549
      // 527: goto 534
      // 52a: ldc2_w -3913695704197762200
      // 52d: lload 2
      // 52e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 533: athrow
      // 534: aload 19
      // 536: aload 10
      // 538: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53b: pop
      // 53c: goto 549
      // 53f: ldc2_w -3913695704197762200
      // 542: lload 2
      // 543: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 548: athrow
      // 549: aload 19
      // 54b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 54e: astore 20
      // 550: aload 20
      // 552: areturn
      // 553: aload 4
      // 555: areturn
   }

   public static String h(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = bb ^ var1;
      int var4 = m44.a<"l">(5283649558138196012L, var1);

      try {
         if (var4 == 0) {
            return var3;
         }

         switch (var3.charAt(0)) {
            case 'B':
            case 'C':
            case 'S':
               break;
            default:
               return (String)m44.a<"h">(5949961778389906401L, var1).get(var3);
         }
      } catch (n9 var5) {
         throw m44.a<"l">(var5, 6237462533113605192L, var1);
      }

      var3 = "I";
      return (String)m44.a<"h">(5949961778389906401L, var1).get(var3);
   }

   public boolean G() {
      return false;
   }

   public static List u(Object[] param0) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/js.bb J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: lload 1
      // 1a: dup2
      // 1b: ldc2_w 33641830204296
      // 1e: lxor
      // 1f: lstore 4
      // 21: dup2
      // 22: ldc2_w 107050503042121
      // 25: lxor
      // 26: dup2
      // 27: bipush 16
      // 29: lushr
      // 2a: lstore 6
      // 2c: dup2
      // 2d: bipush 48
      // 2f: lshl
      // 30: bipush 48
      // 32: lushr
      // 33: l2i
      // 34: istore 8
      // 36: pop2
      // 37: pop2
      // 38: ldc2_w -9015981016907914236
      // 3b: lload 1
      // 3c: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: new java/util/ArrayList
      // 44: dup
      // 45: invokespecial java/util/ArrayList.<init> ()V
      // 48: astore 10
      // 4a: istore 9
      // 4c: aload 3
      // 4d: lload 4
      // 4f: bipush 2
      // 50: anewarray 583
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w -8965652330967232800
      // 64: lload 1
      // 65: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: astore 11
      // 6c: bipush 0
      // 6d: istore 12
      // 6f: iload 12
      // 71: aload 11
      // 73: invokeinterface java/util/List.size ()I 1
      // 78: if_icmpge cf
      // 7b: aload 11
      // 7d: iload 12
      // 7f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 84: checkcast java/lang/String
      // 87: astore 13
      // 89: aload 13
      // 8b: lload 6
      // 8d: iload 8
      // 8f: i2c
      // 90: invokestatic com/zelix/js.m (Ljava/lang/String;JC)Lcom/zelix/_f;
      // 93: astore 14
      // 95: iload 9
      // 97: lload 1
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt cc
      // 9d: ifne ca
      // a0: aload 14
      // a2: ifnull c7
      // a5: goto b2
      // a8: ldc2_w -8937496948123256528
      // ab: lload 1
      // ac: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 10
      // b4: aload 14
      // b6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // b9: pop
      // ba: goto c7
      // bd: ldc2_w -8937496948123256528
      // c0: lload 1
      // c1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: iinc 12 1
      // ca: iload 9
      // cc: ifeq 6f
      // cf: aload 10
      // d1: lload 1
      // d2: lconst_0
      // d3: lcmp
      // d4: ifle 84
      // d7: areturn
   }

   public static void F(_0[] var0) {
      R = var0;
   }

   public int H(js param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/js.bb J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w 3603423953654273253
      // 09: lload 2
      // 0a: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/js.t I
      // 15: aload 1
      // 16: getfield com/zelix/js.t I
      // 19: iload 4
      // 1b: ifne 5a
      // 1e: if_icmpge 3a
      // 21: goto 2e
      // 24: ldc2_w 3681272777442200017
      // 27: lload 2
      // 28: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: bipush -1
      // 2f: ireturn
      // 30: ldc2_w 3681272777442200017
      // 33: lload 2
      // 34: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/js.t I
      // 3e: iload 4
      // 40: lload 2
      // 41: lconst_0
      // 42: lcmp
      // 43: iflt 4d
      // 46: ifne 6a
      // 49: aload 1
      // 4a: getfield com/zelix/js.t I
      // 4d: goto 5a
      // 50: ldc2_w 3681272777442200017
      // 53: lload 2
      // 54: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: if_icmpne 69
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: ldc2_w 3681272777442200017
      // 62: lload 2
      // 63: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 1
      // 6a: ireturn
   }

   public final String f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var4 = var2 ^ 54769465653001L;
      return m44.a<"t">(this.l, new Object[]{var4}, -8844021784423225929L, var2);
   }

   public static _0[] P() {
      return R;
   }

   public static boolean j(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/js.bb J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w -1225677442584377319
      // 09: lload 0
      // 0a: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 2
      // 11: bipush 0
      // 12: invokevirtual java/lang/String.charAt (I)C
      // 15: iload 3
      // 16: ifne 49
      // 19: sipush 17302
      // 1c: ldc2_w 1862064197089099690
      // 1f: lload 0
      // 20: lxor
      // 21: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: if_icmpne 61
      // 29: goto 36
      // 2c: ldc2_w -1158858642414578387
      // 2f: lload 0
      // 30: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 2
      // 37: ldc ")"
      // 39: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 3c: goto 49
      // 3f: ldc2_w -1158858642414578387
      // 42: lload 0
      // 43: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: iload 3
      // 4a: ifne 5e
      // 4d: ifle 61
      // 50: goto 5d
      // 53: ldc2_w -1158858642414578387
      // 56: lload 0
      // 57: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public static String X(Object[] param0) {
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
      // 016: checkcast java/util/Map
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 1
      // 025: pop
      // 026: getstatic com/zelix/js.bb J
      // 029: lload 2
      // 02a: lxor
      // 02b: lstore 2
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 90253847388813
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 93828092484128
      // 038: lxor
      // 039: lstore 8
      // 03b: pop2
      // 03c: ldc2_w 5481739787619538284
      // 03f: lload 2
      // 040: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: istore 10
      // 047: aload 5
      // 049: iload 10
      // 04b: ifeq 087
      // 04e: ifnull 085
      // 051: goto 05e
      // 054: ldc2_w 6039236030693992712
      // 057: lload 2
      // 058: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 5
      // 060: invokevirtual java/lang/String.length ()I
      // 063: iload 10
      // 065: ifeq 089
      // 068: goto 075
      // 06b: ldc2_w 6039236030693992712
      // 06e: lload 2
      // 06f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: ifne 088
      // 078: goto 085
      // 07b: ldc2_w 6039236030693992712
      // 07e: lload 2
      // 07f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: aload 5
      // 087: areturn
      // 088: bipush 0
      // 089: istore 11
      // 08b: aload 5
      // 08d: ldc "."
      // 08f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 092: iload 10
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 09e
      // 09a: ifeq 0e3
      // 09d: bipush -1
      // 09e: if_icmple 0e1
      // 0a1: goto 0ae
      // 0a4: ldc2_w 6039236030693992712
      // 0a7: lload 2
      // 0a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 5
      // 0b0: ldc "/"
      // 0b2: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 0e3
      // 0bb: iload 10
      // 0bd: ifeq 0e3
      // 0c0: goto 0cd
      // 0c3: ldc2_w 6039236030693992712
      // 0c6: lload 2
      // 0c7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: bipush -1
      // 0ce: if_icmpne 0e1
      // 0d1: goto 0de
      // 0d4: ldc2_w 6039236030693992712
      // 0d7: lload 2
      // 0d8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: bipush 1
      // 0df: istore 11
      // 0e1: iload 11
      // 0e3: ifeq 102
      // 0e6: aload 5
      // 0e8: ldc "."
      // 0ea: ldc "/"
      // 0ec: ldc2_w 6294387042773776411
      // 0ef: lload 2
      // 0f0: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: goto 104
      // 0f8: ldc2_w 6039236030693992712
      // 0fb: lload 2
      // 0fc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 5
      // 104: astore 13
      // 106: iload 1
      // 107: iload 10
      // 109: lload 2
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 150
      // 10f: ifeq 14f
      // 112: ifeq 13b
      // 115: goto 122
      // 118: ldc2_w 6039236030693992712
      // 11b: lload 2
      // 11c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: lload 6
      // 124: aload 13
      // 126: aload 4
      // 128: invokestatic com/zelix/cf.J (JLjava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
      // 12b: checkcast java/lang/String
      // 12e: astore 12
      // 130: iload 10
      // 132: lload 2
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 418
      // 138: ifne 416
      // 13b: aload 5
      // 13d: ldc "."
      // 13f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 142: goto 14f
      // 145: ldc2_w 6039236030693992712
      // 148: lload 2
      // 149: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: bipush -1
      // 150: iload 10
      // 152: lload 2
      // 153: lconst_0
      // 154: lcmp
      // 155: ifle 1b8
      // 158: ifeq 1b0
      // 15b: if_icmpne 19b
      // 15e: goto 16b
      // 161: ldc2_w 6039236030693992712
      // 164: lload 2
      // 165: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 5
      // 16d: iload 10
      // 16f: ifeq 414
      // 172: goto 17f
      // 175: ldc2_w 6039236030693992712
      // 178: lload 2
      // 179: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: lload 2
      // 180: lconst_0
      // 181: lcmp
      // 182: ifle 407
      // 185: ldc "/"
      // 187: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 18a: bipush -1
      // 18b: if_icmpeq 405
      // 18e: goto 19b
      // 191: ldc2_w 6039236030693992712
      // 194: lload 2
      // 195: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: aload 5
      // 19d: ldc "."
      // 19f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1a2: bipush -1
      // 1a3: goto 1b0
      // 1a6: ldc2_w 6039236030693992712
      // 1a9: lload 2
      // 1aa: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 22d
      // 1b6: iload 10
      // 1b8: ifeq 22d
      // 1bb: if_icmpeq 1fb
      // 1be: goto 1cb
      // 1c1: ldc2_w 6039236030693992712
      // 1c4: lload 2
      // 1c5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 5
      // 1cd: iload 10
      // 1cf: ifeq 414
      // 1d2: goto 1df
      // 1d5: ldc2_w 6039236030693992712
      // 1d8: lload 2
      // 1d9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: lload 2
      // 1e0: lconst_0
      // 1e1: lcmp
      // 1e2: ifle 407
      // 1e5: ldc "/"
      // 1e7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1ea: bipush -1
      // 1eb: if_icmpne 405
      // 1ee: goto 1fb
      // 1f1: ldc2_w 6039236030693992712
      // 1f4: lload 2
      // 1f5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: aload 5
      // 1fd: iload 10
      // 1ff: ifeq 414
      // 202: goto 20f
      // 205: ldc2_w 6039236030693992712
      // 208: lload 2
      // 209: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: bipush 0
      // 210: invokevirtual java/lang/String.charAt (I)C
      // 213: sipush 20457
      // 216: ldc2_w 4753209198879330285
      // 219: lload 2
      // 21a: lxor
      // 21b: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: goto 22d
      // 223: ldc2_w 6039236030693992712
      // 226: lload 2
      // 227: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: if_icmpeq 405
      // 230: aload 5
      // 232: iload 10
      // 234: ifeq 414
      // 237: goto 244
      // 23a: ldc2_w 6039236030693992712
      // 23d: lload 2
      // 23e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: lload 2
      // 245: lconst_0
      // 246: lcmp
      // 247: ifle 407
      // 24a: bipush 0
      // 24b: invokevirtual java/lang/String.charAt (I)C
      // 24e: sipush 7325
      // 251: ldc2_w 7371051688154078359
      // 254: lload 2
      // 255: lxor
      // 256: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: if_icmpeq 405
      // 25e: goto 26b
      // 261: ldc2_w 6039236030693992712
      // 264: lload 2
      // 265: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: athrow
      // 26b: aload 5
      // 26d: iload 10
      // 26f: ifeq 414
      // 272: goto 27f
      // 275: ldc2_w 6039236030693992712
      // 278: lload 2
      // 279: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: athrow
      // 27f: lload 2
      // 280: lconst_0
      // 281: lcmp
      // 282: ifle 407
      // 285: aload 5
      // 287: invokevirtual java/lang/String.length ()I
      // 28a: bipush 1
      // 28b: isub
      // 28c: invokevirtual java/lang/String.charAt (I)C
      // 28f: sipush 20457
      // 292: ldc2_w 4753209198879330285
      // 295: lload 2
      // 296: lxor
      // 297: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: if_icmpeq 405
      // 29f: goto 2ac
      // 2a2: ldc2_w 6039236030693992712
      // 2a5: lload 2
      // 2a6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: athrow
      // 2ac: aload 5
      // 2ae: iload 10
      // 2b0: ifeq 414
      // 2b3: goto 2c0
      // 2b6: ldc2_w 6039236030693992712
      // 2b9: lload 2
      // 2ba: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: aload 5
      // 2c2: invokevirtual java/lang/String.length ()I
      // 2c5: bipush 1
      // 2c6: isub
      // 2c7: invokevirtual java/lang/String.charAt (I)C
      // 2ca: sipush 7325
      // 2cd: ldc2_w 7371051688154078359
      // 2d0: lload 2
      // 2d1: lxor
      // 2d2: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: if_icmpeq 405
      // 2da: goto 2e7
      // 2dd: ldc2_w 6039236030693992712
      // 2e0: lload 2
      // 2e1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: aload 5
      // 2e9: ldc "."
      // 2eb: ldc "/"
      // 2ed: ldc2_w 6294387042773776411
      // 2f0: lload 2
      // 2f1: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: astore 12
      // 2f8: new java/util/StringTokenizer
      // 2fb: dup
      // 2fc: aload 12
      // 2fe: ldc "/"
      // 300: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 303: astore 14
      // 305: bipush 1
      // 306: istore 15
      // 308: aload 14
      // 30a: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 30d: ifeq 3d8
      // 310: aload 14
      // 312: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 315: astore 16
      // 317: aload 16
      // 319: lload 8
      // 31b: bipush 2
      // 31c: anewarray 583
      // 31f: dup_x2
      // 320: dup_x2
      // 321: pop
      // 322: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 325: bipush 1
      // 326: swap
      // 327: aastore
      // 328: dup_x1
      // 329: swap
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w 5480837809658109309
      // 330: lload 2
      // 331: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: iload 10
      // 338: lload 2
      // 339: lconst_0
      // 33a: lcmp
      // 33b: ifle 343
      // 33e: ifeq 3da
      // 341: iload 10
      // 343: lload 2
      // 344: lconst_0
      // 345: lcmp
      // 346: ifle 391
      // 349: ifeq 389
      // 34c: goto 359
      // 34f: ldc2_w 6039236030693992712
      // 352: lload 2
      // 353: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: athrow
      // 359: ifne 377
      // 35c: goto 369
      // 35f: ldc2_w 6039236030693992712
      // 362: lload 2
      // 363: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: athrow
      // 369: bipush 0
      // 36a: istore 15
      // 36c: iload 10
      // 36e: lload 2
      // 36f: lconst_0
      // 370: lcmp
      // 371: ifle 37c
      // 374: ifne 3d8
      // 377: aload 16
      // 379: invokevirtual java/lang/String.length ()I
      // 37c: goto 389
      // 37f: ldc2_w 6039236030693992712
      // 382: lload 2
      // 383: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: athrow
      // 389: lload 2
      // 38a: lconst_0
      // 38b: lcmp
      // 38c: iflt 3b7
      // 38f: iload 10
      // 391: ifeq 3b3
      // 394: bipush 2
      // 395: if_icmpge 3c0
      // 398: goto 3a5
      // 39b: ldc2_w 6039236030693992712
      // 39e: lload 2
      // 39f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: athrow
      // 3a5: bipush 0
      // 3a6: goto 3b3
      // 3a9: ldc2_w 6039236030693992712
      // 3ac: lload 2
      // 3ad: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b2: athrow
      // 3b3: istore 15
      // 3b5: iload 10
      // 3b7: lload 2
      // 3b8: lconst_0
      // 3b9: lcmp
      // 3ba: ifle 3c2
      // 3bd: ifne 3d8
      // 3c0: iload 10
      // 3c2: ifne 308
      // 3c5: lload 2
      // 3c6: lconst_0
      // 3c7: lcmp
      // 3c8: ifle 317
      // 3cb: goto 3d8
      // 3ce: ldc2_w 6039236030693992712
      // 3d1: lload 2
      // 3d2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: iload 15
      // 3da: ifeq 3f6
      // 3dd: lload 6
      // 3df: aload 13
      // 3e1: aload 4
      // 3e3: invokestatic com/zelix/cf.J (JLjava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
      // 3e6: checkcast java/lang/String
      // 3e9: astore 12
      // 3eb: iload 10
      // 3ed: lload 2
      // 3ee: lconst_0
      // 3ef: lcmp
      // 3f0: ifle 3fc
      // 3f3: ifne 3fa
      // 3f6: aload 5
      // 3f8: astore 12
      // 3fa: iload 10
      // 3fc: lload 2
      // 3fd: lconst_0
      // 3fe: lcmp
      // 3ff: ifle 418
      // 402: ifne 416
      // 405: aload 5
      // 407: goto 414
      // 40a: ldc2_w 6039236030693992712
      // 40d: lload 2
      // 40e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 413: athrow
      // 414: astore 12
      // 416: iload 11
      // 418: ifeq 437
      // 41b: aload 12
      // 41d: ldc "/"
      // 41f: ldc "."
      // 421: ldc2_w 6294387042773776411
      // 424: lload 2
      // 425: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: goto 439
      // 42d: ldc2_w 6039236030693992712
      // 430: lload 2
      // 431: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: athrow
      // 437: aload 12
      // 439: areturn
   }

   public final String L(long var1) {
      var1 = bb ^ var1;
      int var3 = (int)((var1 ^ 19612030185485L) >>> 56);
      long var4 = (var1 ^ 19612030185485L) << 8 >>> 8;
      return this.l.I((byte)var3, var4);
   }

   public static List A(String var0, long var1) {
      var1 = bb ^ var1;
      long var3 = (var1 ^ 67860581007436L) >>> 16;
      int var5 = (int)((var1 ^ 67860581007436L) << 48 >>> 48);
      return E(var0, var3, (short)var5, false);
   }

   public static final String O(Object[] param0) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 1
      // 019: pop
      // 01a: getstatic com/zelix/js.bb J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 91898218439788
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 39423880810391
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 7
      // 034: dup2
      // 035: bipush 16
      // 037: lshl
      // 038: bipush 48
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 8
      // 03e: dup2
      // 03f: bipush 32
      // 041: lshl
      // 042: bipush 32
      // 044: lushr
      // 045: l2i
      // 046: istore 9
      // 048: pop2
      // 049: pop2
      // 04a: ldc2_w -7433470977184185944
      // 04d: lload 3
      // 04e: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: new java/lang/StringBuilder
      // 056: dup
      // 057: invokespecial java/lang/StringBuilder.<init> ()V
      // 05a: astore 11
      // 05c: istore 10
      // 05e: aload 1
      // 05f: sipush 3541
      // 062: ldc2_w 8126242483178395920
      // 065: lload 3
      // 066: lxor
      // 067: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/lang/String.indexOf (I)I
      // 06f: istore 12
      // 071: iload 10
      // 073: ifeq 1cd
      // 076: iload 12
      // 078: bipush -1
      // 079: if_icmple 19b
      // 07c: goto 089
      // 07f: ldc2_w -8715694666630840884
      // 082: lload 3
      // 083: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 11
      // 08b: aload 1
      // 08c: iload 12
      // 08e: bipush 1
      // 08f: iadd
      // 090: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 093: iload 7
      // 095: i2c
      // 096: swap
      // 097: iload 8
      // 099: i2s
      // 09a: swap
      // 09b: iload 9
      // 09d: invokestatic com/zelix/js.E (CSLjava/lang/String;I)Ljava/lang/String;
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: pop
      // 0a4: aload 11
      // 0a6: sipush 30993
      // 0a9: ldc2_w 3559188774772551132
      // 0ac: lload 3
      // 0ad: lxor
      // 0ae: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b6: pop
      // 0b7: aload 11
      // 0b9: aload 2
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bd: pop
      // 0be: aload 11
      // 0c0: sipush 16265
      // 0c3: ldc2_w 6434481408143747904
      // 0c6: lload 3
      // 0c7: lxor
      // 0c8: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: lload 5
      // 0d3: aload 1
      // 0d4: bipush 2
      // 0d5: anewarray 583
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: bipush 1
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: ldc2_w -7112128224475103411
      // 0e9: lload 3
      // 0ea: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: astore 13
      // 0f1: aload 13
      // 0f3: invokeinterface java/util/List.size ()I 1
      // 0f8: istore 14
      // 0fa: bipush 0
      // 0fb: istore 15
      // 0fd: iload 15
      // 0ff: iload 14
      // 101: if_icmpge 177
      // 104: aload 11
      // 106: aload 13
      // 108: iload 15
      // 10a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10f: checkcast java/lang/String
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: pop
      // 116: iload 10
      // 118: lload 3
      // 119: lconst_0
      // 11a: lcmp
      // 11b: ifle 198
      // 11e: ifeq 190
      // 121: iload 10
      // 123: lload 3
      // 124: lconst_0
      // 125: lcmp
      // 126: iflt 174
      // 129: ifeq 172
      // 12c: goto 139
      // 12f: ldc2_w -8715694666630840884
      // 132: lload 3
      // 133: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: iload 15
      // 13b: iload 14
      // 13d: bipush 1
      // 13e: isub
      // 13f: if_icmpge 16f
      // 142: goto 14f
      // 145: ldc2_w -8715694666630840884
      // 148: lload 3
      // 149: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 11
      // 151: sipush 21196
      // 154: ldc2_w 2975353288489775366
      // 157: lload 3
      // 158: lxor
      // 159: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/js.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: goto 16f
      // 165: ldc2_w -8715694666630840884
      // 168: lload 3
      // 169: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: iinc 15 1
      // 172: iload 10
      // 174: ifne 0fd
      // 177: aload 11
      // 179: sipush 6053
      // 17c: ldc2_w 6981111255645242223
      // 17f: lload 3
      // 180: lxor
      // 181: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 189: pop
      // 18a: lload 3
      // 18b: lconst_0
      // 18c: lcmp
      // 18d: iflt 116
      // 190: lload 3
      // 191: lconst_0
      // 192: lcmp
      // 193: ifle 1c0
      // 196: iload 10
      // 198: ifne 1d4
      // 19b: aload 11
      // 19d: iload 7
      // 19f: i2c
      // 1a0: iload 8
      // 1a2: i2s
      // 1a3: aload 1
      // 1a4: iload 9
      // 1a6: invokestatic com/zelix/js.E (CSLjava/lang/String;I)Ljava/lang/String;
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: pop
      // 1ad: aload 11
      // 1af: sipush 11029
      // 1b2: ldc2_w 6210061858363834323
      // 1b5: lload 3
      // 1b6: lxor
      // 1b7: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1bf: pop
      // 1c0: goto 1cd
      // 1c3: ldc2_w -8715694666630840884
      // 1c6: lload 3
      // 1c7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: aload 11
      // 1cf: aload 2
      // 1d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d3: pop
      // 1d4: aload 11
      // 1d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d9: areturn
   }

   public static boolean I(Object[] param0) {
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
      // 13: getstatic com/zelix/js.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -5274447453842706510
      // 1c: lload 2
      // 1d: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: ldc "J"
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: iload 4
      // 2c: ifeq 68
      // 2f: ifne 67
      // 32: goto 3f
      // 35: ldc2_w -6264008335921736746
      // 38: lload 2
      // 39: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 1
      // 40: ldc "D"
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: iload 4
      // 47: ifeq 68
      // 4a: goto 57
      // 4d: ldc2_w -6264008335921736746
      // 50: lload 2
      // 51: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: ifeq 6b
      // 5a: goto 67
      // 5d: ldc2_w -6264008335921736746
      // 60: lload 2
      // 61: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: bipush 0
      // 6c: ireturn
   }

   public static String u(String param0, boolean param1, long param2, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/js.bb J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: ldc2_w 1126613201243498822
      // 009: lload 2
      // 00a: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: aload 0
      // 010: ldc ")"
      // 012: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 015: istore 7
      // 017: istore 5
      // 019: iload 7
      // 01b: bipush -1
      // 01c: if_icmple 034
      // 01f: aload 0
      // 020: iload 7
      // 022: bipush 1
      // 023: iadd
      // 024: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 027: astore 6
      // 029: iload 5
      // 02b: lload 2
      // 02c: lconst_0
      // 02d: lcmp
      // 02e: ifle 038
      // 031: ifeq 037
      // 034: aload 0
      // 035: astore 6
      // 037: bipush 0
      // 038: istore 8
      // 03a: bipush 0
      // 03b: istore 9
      // 03d: iload 9
      // 03f: aload 6
      // 041: invokevirtual java/lang/String.length ()I
      // 044: if_icmpge 0a6
      // 047: aload 6
      // 049: iload 9
      // 04b: invokevirtual java/lang/String.charAt (I)C
      // 04e: sipush 31617
      // 051: ldc2_w 5537883408467142387
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: iload 5
      // 05d: lload 2
      // 05e: lconst_0
      // 05f: lcmp
      // 060: ifle 068
      // 063: ifne 0da
      // 066: iload 5
      // 068: ifne 0da
      // 06b: goto 078
      // 06e: ldc2_w 1060004339077231730
      // 071: lload 2
      // 072: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: if_icmpne 0a6
      // 07b: goto 088
      // 07e: ldc2_w 1060004339077231730
      // 081: lload 2
      // 082: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: iinc 8 1
      // 08b: iinc 9 1
      // 08e: iload 5
      // 090: ifeq 03d
      // 093: lload 2
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 047
      // 099: goto 0a6
      // 09c: ldc2_w 1060004339077231730
      // 09f: lload 2
      // 0a0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: aload 6
      // 0a8: iload 8
      // 0aa: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ad: astore 6
      // 0af: aload 6
      // 0b1: iload 5
      // 0b3: lload 2
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: ifle 0bd
      // 0b9: ifne 1f4
      // 0bc: bipush 0
      // 0bd: invokevirtual java/lang/String.charAt (I)C
      // 0c0: sipush 16554
      // 0c3: ldc2_w 5250309859824573907
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w 1060004339077231730
      // 0d3: lload 2
      // 0d4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 0e6
      // 0e0: if_icmpne 1d3
      // 0e3: iload 1
      // 0e4: iload 5
      // 0e6: ifne 192
      // 0e9: goto 0f6
      // 0ec: ldc2_w 1060004339077231730
      // 0ef: lload 2
      // 0f0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: ifeq 181
      // 0f9: goto 106
      // 0fc: ldc2_w 1060004339077231730
      // 0ff: lload 2
      // 100: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 6
      // 108: invokevirtual java/lang/String.length ()I
      // 10b: bipush 2
      // 10c: lload 2
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 172
      // 112: iload 5
      // 114: ifne 172
      // 117: goto 124
      // 11a: ldc2_w 1060004339077231730
      // 11d: lload 2
      // 11e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: if_icmple 175
      // 127: goto 134
      // 12a: ldc2_w 1060004339077231730
      // 12d: lload 2
      // 12e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 6
      // 136: aload 6
      // 138: invokevirtual java/lang/String.length ()I
      // 13b: bipush 1
      // 13c: isub
      // 13d: invokevirtual java/lang/String.charAt (I)C
      // 140: iload 5
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 194
      // 148: ifne 192
      // 14b: goto 158
      // 14e: ldc2_w 1060004339077231730
      // 151: lload 2
      // 152: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: sipush 10524
      // 15b: ldc2_w 4177932924894311521
      // 15e: lload 2
      // 15f: lxor
      // 160: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: goto 172
      // 168: ldc2_w 1060004339077231730
      // 16b: lload 2
      // 16c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: if_icmpeq 181
      // 175: aconst_null
      // 176: areturn
      // 177: ldc2_w 1060004339077231730
      // 17a: lload 2
      // 17b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 6
      // 183: bipush 1
      // 184: aload 6
      // 186: invokevirtual java/lang/String.length ()I
      // 189: bipush 1
      // 18a: isub
      // 18b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 18e: astore 6
      // 190: iload 4
      // 192: iload 5
      // 194: ifne 22f
      // 197: ifeq 22e
      // 19a: goto 1a7
      // 19d: ldc2_w 1060004339077231730
      // 1a0: lload 2
      // 1a1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 6
      // 1a9: sipush 7325
      // 1ac: ldc2_w 7371113910765928941
      // 1af: lload 2
      // 1b0: lxor
      // 1b1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: sipush 20457
      // 1b9: ldc2_w 4753131513032282775
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1c6: lload 2
      // 1c7: lconst_0
      // 1c8: lcmp
      // 1c9: iflt 1e7
      // 1cc: astore 6
      // 1ce: iload 5
      // 1d0: ifeq 22e
      // 1d3: getstatic com/zelix/js.A Ljava/util/Map;
      // 1d6: aload 6
      // 1d8: bipush 0
      // 1d9: invokevirtual java/lang/String.charAt (I)C
      // 1dc: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 1df: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1e4: checkcast java/lang/String
      // 1e7: goto 1f4
      // 1ea: ldc2_w 1060004339077231730
      // 1ed: lload 2
      // 1ee: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: astore 9
      // 1f6: iload 1
      // 1f7: ifeq 22a
      // 1fa: aload 9
      // 1fc: iload 5
      // 1fe: ifne 22c
      // 201: goto 20e
      // 204: ldc2_w 1060004339077231730
      // 207: lload 2
      // 208: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: ifnonnull 22a
      // 211: goto 21e
      // 214: ldc2_w 1060004339077231730
      // 217: lload 2
      // 218: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: aconst_null
      // 21f: areturn
      // 220: ldc2_w 1060004339077231730
      // 223: lload 2
      // 224: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 9
      // 22c: astore 6
      // 22e: bipush 0
      // 22f: istore 9
      // 231: iload 9
      // 233: iload 8
      // 235: if_icmpge 266
      // 238: new java/lang/StringBuilder
      // 23b: dup
      // 23c: invokespecial java/lang/StringBuilder.<init> ()V
      // 23f: aload 6
      // 241: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 244: sipush 22537
      // 247: ldc2_w 8135023894653973109
      // 24a: lload 2
      // 24b: lxor
      // 24c: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/js.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 257: iload 5
      // 259: ifne 26e
      // 25c: astore 6
      // 25e: iinc 9 1
      // 261: iload 5
      // 263: ifeq 231
      // 266: lload 2
      // 267: lconst_0
      // 268: lcmp
      // 269: ifle 261
      // 26c: aload 6
      // 26e: areturn
   }

   public static String A(Object[] var0) {
      va var3 = (va)var0[0];
      long var1 = (Long)var0[1];
      var1 = bb ^ var1;

      try {
         switch (m44.a<"o">(-3217511403286419770L, var1)[var3.ordinal()]) {
            case 1:
               return a<"y">(25212, 2824626376121864933L ^ var1);
            case 2:
               return a<"y">(31182, 6281784974831995253L ^ var1);
            case 3:
               return a<"y">(11299, 986592371747953845L ^ var1);
            case 4:
               return a<"y">(30953, 2506229107023759459L ^ var1);
            case 5:
               return a<"y">(6487, 1659446752351168968L ^ var1);
            case 6:
               return a<"y">(26007, 4425616205814256948L ^ var1);
            case 7:
               return a<"y">(25039, 5800070787167801692L ^ var1);
            case 8:
               return a<"y">(17832, 2843250525065508101L ^ var1);
            case 9:
               return a<"y">(11120, 1857229620449975258L ^ var1);
            case 10:
               return a<"y">(13767, 3528187454735091055L ^ var1);
            case 11:
               return a<"y">(7016, 8928193054684326855L ^ var1);
            case 12:
               return a<"y">(31318, 1233875481014520560L ^ var1);
            case 13:
               return a<"y">(13458, 9027313845815641150L ^ var1);
            case 14:
               return a<"y">(741, 8660294322714718810L ^ var1);
            case 15:
               return a<"y">(27775, 2048955027330817245L ^ var1);
            case 16:
               return a<"y">(641, 7124770756064391730L ^ var1);
            case 17:
               return a<"y">(4495, 8656220805473902855L ^ var1);
            default:
               return "";
         }
      } catch (n9 var4) {
         throw m44.a<"k">(var4, -3141113371781632337L, var1);
      }
   }

   public static String M(Object[] param0) {
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
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: aload 3
      // 01a: sipush 20457
      // 01d: ldc2_w 4753223273118370776
      // 020: lload 1
      // 021: lxor
      // 022: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: sipush 7325
      // 02a: ldc2_w 7371022065328117922
      // 02d: lload 1
      // 02e: lxor
      // 02f: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 037: astore 5
      // 039: ldc2_w 1652218751429668873
      // 03c: lload 1
      // 03d: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: new java/lang/StringBuilder
      // 045: dup
      // 046: invokespecial java/lang/StringBuilder.<init> ()V
      // 049: astore 6
      // 04b: istore 4
      // 04d: bipush 0
      // 04e: istore 7
      // 050: bipush 0
      // 051: istore 8
      // 053: iload 8
      // 055: aload 3
      // 056: invokevirtual java/lang/String.length ()I
      // 059: if_icmpge 0ba
      // 05c: aload 3
      // 05d: iload 8
      // 05f: invokevirtual java/lang/String.charAt (I)C
      // 062: sipush 31617
      // 065: ldc2_w 5537975163718516668
      // 068: lload 1
      // 069: lxor
      // 06a: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 4
      // 071: lload 1
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07c
      // 077: ifne 0e9
      // 07a: iload 4
      // 07c: ifne 0e9
      // 07f: goto 08c
      // 082: ldc2_w 1727887862135008573
      // 085: lload 1
      // 086: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: if_icmpne 0ba
      // 08f: goto 09c
      // 092: ldc2_w 1727887862135008573
      // 095: lload 1
      // 096: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: iinc 7 1
      // 09f: iinc 8 1
      // 0a2: iload 4
      // 0a4: ifeq 053
      // 0a7: lload 1
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: iflt 05c
      // 0ad: goto 0ba
      // 0b0: ldc2_w 1727887862135008573
      // 0b3: lload 1
      // 0b4: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 6
      // 0bc: aload 5
      // 0be: bipush 0
      // 0bf: iload 7
      // 0c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: iload 4
      // 0c9: ifne 1bb
      // 0cc: pop
      // 0cd: aload 5
      // 0cf: iload 7
      // 0d1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0d4: astore 5
      // 0d6: aload 5
      // 0d8: bipush 0
      // 0d9: invokevirtual java/lang/String.charAt (I)C
      // 0dc: sipush 16554
      // 0df: ldc2_w 5250226913523598492
      // 0e2: lload 1
      // 0e3: lxor
      // 0e4: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: lload 1
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 0f8
      // 0ef: if_icmpne 1a3
      // 0f2: aload 5
      // 0f4: invokevirtual java/lang/String.length ()I
      // 0f7: bipush 2
      // 0f8: lload 1
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 158
      // 0fe: iload 4
      // 100: ifne 158
      // 103: goto 110
      // 106: ldc2_w 1727887862135008573
      // 109: lload 1
      // 10a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: if_icmple 15b
      // 113: goto 120
      // 116: ldc2_w 1727887862135008573
      // 119: lload 1
      // 11a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 5
      // 122: aload 5
      // 124: invokevirtual java/lang/String.length ()I
      // 127: bipush 1
      // 128: isub
      // 129: invokevirtual java/lang/String.charAt (I)C
      // 12c: iload 4
      // 12e: ifne 169
      // 131: goto 13e
      // 134: ldc2_w 1727887862135008573
      // 137: lload 1
      // 138: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: sipush 10524
      // 141: ldc2_w 4177839979909475630
      // 144: lload 1
      // 145: lxor
      // 146: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: goto 158
      // 14e: ldc2_w 1727887862135008573
      // 151: lload 1
      // 152: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: if_icmpeq 167
      // 15b: aconst_null
      // 15c: areturn
      // 15d: ldc2_w 1727887862135008573
      // 160: lload 1
      // 161: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: iload 7
      // 169: ifne 16f
      // 16c: goto 190
      // 16f: aload 5
      // 171: sipush 7325
      // 174: ldc2_w 7371022065328117922
      // 177: lload 1
      // 178: lxor
      // 179: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: sipush 20457
      // 181: ldc2_w 4753223273118370776
      // 184: lload 1
      // 185: lxor
      // 186: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 18e: astore 5
      // 190: aload 6
      // 192: aload 5
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: lload 1
      // 198: lconst_0
      // 199: lcmp
      // 19a: iflt 1be
      // 19d: pop
      // 19e: iload 4
      // 1a0: ifeq 1bc
      // 1a3: aload 6
      // 1a5: aload 5
      // 1a7: bipush 0
      // 1a8: invokevirtual java/lang/String.charAt (I)C
      // 1ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1ae: goto 1bb
      // 1b1: ldc2_w 1727887862135008573
      // 1b4: lload 1
      // 1b5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: pop
      // 1bc: aload 6
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: areturn
   }

   public final String F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var4 = var2 ^ 1431861191158L;
      return m44.a<"r">(this.l, new Object[]{var4}, -5135514200631424345L, var2);
   }

   public final int E() {
      return this.t;
   }

   public static _f m(String var0, long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ bb;
      long var6 = var4 ^ 112397596708572L;
      long var8 = var4 ^ 132183051704864L;
      int var10000 = m44.a<"l">(2628707421743709444L, var4);
      String var11 = _v.H(var0, var6);
      int var10 = var10000;

      label35: {
         try {
            var15 = var11;
            if (var10 == 0) {
               break label35;
            }

            if (var11 == null) {
               return null;
            }
         } catch (n9 var14) {
            throw m44.a<"l">(var14, 4298592522588258656L, var4);
         }

         var15 = var11;
      }

      _f var12 = l62.B(var15, var8);

      try {
         if (var10 == 0) {
            return var12;
         }

         if (var12 == null) {
            return null;
         }
      } catch (n9 var13) {
         throw m44.a<"l">(var13, 4298592522588258656L, var4);
      }

      return var12;
   }

   public static String z(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = bb ^ var1;
      return (String)m44.a<"n">(1638393857611577295L, var1).get(var3);
   }

   public static List G(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = bb ^ var2;
      long var4 = var2 ^ 53389036572589L;
      long var10001 = var2 ^ 30701282420706L;
      int var6 = (int)((var2 ^ 30701282420706L) >>> 48);
      int var7 = (int)((var2 ^ 30701282420706L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      int var10000 = m44.a<"m">(-5718945144810247715L, var2);
      List var10 = A(var1, var4);
      int var9 = var10000;
      int var11 = var10.size();
      int var12 = 0;

      label34:
      while (var12 < var11) {
         String var13 = (String)var10.get(var12);

         do {
            try {
               int var17 = var9;
               if (var2 >= 0L) {
                  if (var9 == 0) {
                     return var10;
                  }

                  var17 = var12;
               }

               var10.set(var17, E((char)var6, (short)var7, var13, var8));
               var12++;
               if (var9 != 0) {
                  continue label34;
               }
            } catch (n9 var14) {
               throw m44.a<"m">(var14, -5801030117990689351L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var10;
   }

   public static String T(xb param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/js.bb J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 36783414750
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -55468750267115042
      // 011: lload 1
      // 012: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: aload 0
      // 018: invokevirtual com/zelix/xb.X ()Ljava/lang/String;
      // 01b: astore 6
      // 01d: istore 5
      // 01f: aload 6
      // 021: iload 5
      // 023: ifne 05d
      // 026: lload 3
      // 027: dup2_x1
      // 028: pop2
      // 029: invokestatic com/zelix/js.j (JLjava/lang/String;)Z
      // 02c: ifeq 04e
      // 02f: goto 03c
      // 032: ldc2_w -131304093384588054
      // 035: lload 1
      // 036: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: aload 6
      // 03e: invokestatic com/zelix/js.Z (Ljava/lang/String;)Ljava/lang/String;
      // 041: astore 7
      // 043: iload 5
      // 045: lload 1
      // 046: lconst_0
      // 047: lcmp
      // 048: ifle 066
      // 04b: ifeq 05f
      // 04e: aload 6
      // 050: goto 05d
      // 053: ldc2_w -131304093384588054
      // 056: lload 1
      // 057: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: astore 7
      // 05f: aload 7
      // 061: ldc "V"
      // 063: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 066: lload 1
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 0a6
      // 06c: iload 5
      // 06e: ifne 0a6
      // 071: ifeq 08d
      // 074: goto 081
      // 077: ldc2_w -131304093384588054
      // 07a: lload 1
      // 07b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aconst_null
      // 082: areturn
      // 083: ldc2_w -131304093384588054
      // 086: lload 1
      // 087: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 7
      // 08f: iload 5
      // 091: ifne 13f
      // 094: ldc "B"
      // 096: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 099: goto 0a6
      // 09c: ldc2_w -131304093384588054
      // 09f: lload 1
      // 0a0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: ifne 130
      // 0a9: aload 7
      // 0ab: iload 5
      // 0ad: ifne 13f
      // 0b0: goto 0bd
      // 0b3: ldc2_w -131304093384588054
      // 0b6: lload 1
      // 0b7: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 1
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: iflt 132
      // 0c3: ldc "C"
      // 0c5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c8: ifne 130
      // 0cb: goto 0d8
      // 0ce: ldc2_w -131304093384588054
      // 0d1: lload 1
      // 0d2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 7
      // 0da: iload 5
      // 0dc: ifne 13f
      // 0df: goto 0ec
      // 0e2: ldc2_w -131304093384588054
      // 0e5: lload 1
      // 0e6: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: lload 1
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 132
      // 0f2: ldc "S"
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: ifne 130
      // 0fa: goto 107
      // 0fd: ldc2_w -131304093384588054
      // 100: lload 1
      // 101: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 7
      // 109: iload 5
      // 10b: ifne 142
      // 10e: goto 11b
      // 111: ldc2_w -131304093384588054
      // 114: lload 1
      // 115: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: ldc "Z"
      // 11d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 120: ifeq 140
      // 123: goto 130
      // 126: ldc2_w -131304093384588054
      // 129: lload 1
      // 12a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: ldc "I"
      // 132: goto 13f
      // 135: ldc2_w -131304093384588054
      // 138: lload 1
      // 139: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: areturn
      // 140: aload 7
      // 142: areturn
   }

   public abstract va A(long var1);

   public static String Y(String param0, HashMap param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/js.bb J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: ldc2_w -2937296237058805288
      // 009: lload 2
      // 00a: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f: bipush 0
      // 010: istore 5
      // 012: istore 4
      // 014: aload 0
      // 015: sipush 16554
      // 018: ldc2_w 5250336377948980557
      // 01b: lload 2
      // 01c: lxor
      // 01d: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: iload 5
      // 024: invokevirtual java/lang/String.indexOf (II)I
      // 027: dup
      // 028: istore 5
      // 02a: bipush -1
      // 02b: if_icmpeq 239
      // 02e: aload 0
      // 02f: iload 4
      // 031: lload 2
      // 032: lconst_0
      // 033: lcmp
      // 034: iflt 047
      // 037: ifne 23a
      // 03a: sipush 10524
      // 03d: ldc2_w 4177888833752083711
      // 040: lload 2
      // 041: lxor
      // 042: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: iload 5
      // 049: invokevirtual java/lang/String.indexOf (II)I
      // 04c: istore 6
      // 04e: iload 6
      // 050: lload 2
      // 051: lconst_0
      // 052: lcmp
      // 053: ifle 05c
      // 056: bipush -1
      // 057: if_icmpne 06c
      // 05a: iload 4
      // 05c: ifeq 239
      // 05f: goto 06c
      // 062: ldc2_w -3014090904065217300
      // 065: lload 2
      // 066: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: aload 0
      // 06d: iload 5
      // 06f: bipush 1
      // 070: iadd
      // 071: iload 6
      // 073: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 076: astore 7
      // 078: aconst_null
      // 079: astore 8
      // 07b: aload 7
      // 07d: sipush 20457
      // 080: ldc2_w 4753175520129567241
      // 083: lload 2
      // 084: lxor
      // 085: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: invokevirtual java/lang/String.indexOf (I)I
      // 08d: iload 4
      // 08f: lload 2
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 0cc
      // 095: ifne 0c7
      // 098: ifle 150
      // 09b: goto 0a8
      // 09e: ldc2_w -3014090904065217300
      // 0a1: lload 2
      // 0a2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 7
      // 0aa: sipush 20457
      // 0ad: ldc2_w 4753175520129567241
      // 0b0: lload 2
      // 0b1: lxor
      // 0b2: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual java/lang/String.lastIndexOf (I)I
      // 0ba: goto 0c7
      // 0bd: ldc2_w -3014090904065217300
      // 0c0: lload 2
      // 0c1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 7
      // 0c9: invokevirtual java/lang/String.length ()I
      // 0cc: lload 2
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 11f
      // 0d2: iload 4
      // 0d4: ifne 11f
      // 0d7: if_icmpge 150
      // 0da: goto 0e7
      // 0dd: ldc2_w -3014090904065217300
      // 0e0: lload 2
      // 0e1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: sipush 7325
      // 0ec: ldc2_w 7371087547134515571
      // 0ef: lload 2
      // 0f0: lxor
      // 0f1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: iload 4
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: ifle 14b
      // 0fe: ifne 13e
      // 101: goto 10e
      // 104: ldc2_w -3014090904065217300
      // 107: lload 2
      // 108: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: invokevirtual java/lang/String.indexOf (I)I
      // 111: bipush -1
      // 112: goto 11f
      // 115: ldc2_w -3014090904065217300
      // 118: lload 2
      // 119: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: if_icmpne 150
      // 122: aload 7
      // 124: sipush 20457
      // 127: ldc2_w 4753175520129567241
      // 12a: lload 2
      // 12b: lxor
      // 12c: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: goto 13e
      // 134: ldc2_w -3014090904065217300
      // 137: lload 2
      // 138: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: sipush 7325
      // 141: ldc2_w 7371087547134515571
      // 144: lload 2
      // 145: lxor
      // 146: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 14e: astore 8
      // 150: aload 1
      // 151: aload 8
      // 153: iload 4
      // 155: ifne 16a
      // 158: ifnonnull 16d
      // 15b: goto 168
      // 15e: ldc2_w -3014090904065217300
      // 161: lload 2
      // 162: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 7
      // 16a: goto 16f
      // 16d: aload 8
      // 16f: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 172: checkcast java/lang/String
      // 175: astore 9
      // 177: iload 4
      // 179: lload 2
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: ifle 236
      // 17f: ifne 234
      // 182: aload 9
      // 184: ifnull 230
      // 187: goto 194
      // 18a: ldc2_w -3014090904065217300
      // 18d: lload 2
      // 18e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aload 8
      // 196: lload 2
      // 197: lconst_0
      // 198: lcmp
      // 199: ifle 1e1
      // 19c: iload 4
      // 19e: ifne 1e1
      // 1a1: goto 1ae
      // 1a4: ldc2_w -3014090904065217300
      // 1a7: lload 2
      // 1a8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: ifnull 1df
      // 1b1: goto 1be
      // 1b4: ldc2_w -3014090904065217300
      // 1b7: lload 2
      // 1b8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: aload 9
      // 1c0: sipush 7325
      // 1c3: ldc2_w 7371087547134515571
      // 1c6: lload 2
      // 1c7: lxor
      // 1c8: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: sipush 20457
      // 1d0: ldc2_w 4753175520129567241
      // 1d3: lload 2
      // 1d4: lxor
      // 1d5: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1dd: astore 9
      // 1df: aload 9
      // 1e1: aload 7
      // 1e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e6: iload 4
      // 1e8: ifne 232
      // 1eb: ifne 230
      // 1ee: goto 1fb
      // 1f1: ldc2_w -3014090904065217300
      // 1f4: lload 2
      // 1f5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: new java/lang/StringBuilder
      // 1fe: dup
      // 1ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 202: aload 0
      // 203: bipush 0
      // 204: iload 5
      // 206: bipush 1
      // 207: iadd
      // 208: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 20b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20e: aload 9
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: aload 0
      // 214: iload 6
      // 216: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 219: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21f: astore 0
      // 220: iload 6
      // 222: aload 9
      // 224: invokevirtual java/lang/String.length ()I
      // 227: iadd
      // 228: aload 7
      // 22a: invokevirtual java/lang/String.length ()I
      // 22d: isub
      // 22e: istore 6
      // 230: iload 6
      // 232: istore 5
      // 234: iload 4
      // 236: ifeq 014
      // 239: aload 0
      // 23a: areturn
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   public static js a(int var0, char var1, h1 var2, int var3, int var4, to var5) {
      long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ bb;
      long var8 = var6 ^ 17149055964917L;
      long var10001 = var6 ^ 84131556588983L;
      int var10 = (int)((var6 ^ 84131556588983L) >>> 32);
      int var11 = (int)((var6 ^ 84131556588983L) << 32 >>> 40);
      int var12 = (int)(var10001 << 56 >>> 56);
      long var13 = var6 ^ 75967996367268L;
      long var15 = var6 ^ 60415082964725L;
      long var17 = var6 ^ 117722960629920L;
      var10001 = var6 ^ 83221035460568L;
      int var19 = (int)((var6 ^ 83221035460568L) >>> 32);
      int var20 = (int)((var6 ^ 83221035460568L) << 32 >>> 48);
      int var21 = (int)(var10001 << 48 >>> 48);
      long var22 = var6 ^ 7415246261201L;
      long var24 = var6 ^ 75329117880133L;
      long var26 = var6 ^ 51647188436736L;
      long var28 = var6 ^ 84665824871041L;
      int var30 = var2.readUnsignedByte();

      try {
         switch (var30) {
            case 1:
               return new x8(var0, var2, var5, var24);
            case 2:
            case 13:
            case 14:
            default:
               break;
            case 3:
               return new xp(var0, var26, var2, var5);
            case 4:
               return new xy(var0, var2, var17, var5);
            case 5:
               return new xa(var0, var2, var5, var13);
            case 6:
               return new xj(var0, var2, var22, var5);
            case 7:
               return new jr(var19, (char)var20, var0, var2, var5, var21);
            case 8:
               return new xh(var0, var2, var15, var5);
            case 9:
               return new xe(var0, var2, var5);
            case 10:
               return new xi(var0, var2, var5);
            case 11:
               return new xs(var0, var2, var5);
            case 12:
               return new xd(var0, var2, var5);
            case 15:
               return new jn(var0, var2, var5);
            case 16:
               return new j3(var0, var2, var5);
            case 17:
               return new jh(var0, var2, var5);
            case 18:
               return new j4(var0, var2, var5);
            case 19:
               return new x5(var0, var8, var2, var5);
            case 20:
               return new x0(var28, var0, var2, var5);
         }
      } catch (n9 var31) {
         throw m44.a<"n">(var31, -282128703141263662L, var6);
      }

      StringBuilder var10002 = new StringBuilder().append(a<"y">(31833, 2073709445133657237L ^ var6));
      Object[] var10008 = new Object[]{null, null, Integer.valueOf((byte)var12)};
      var10008[1] = var11;
      var10008[0] = var10;
      throw new aw(
         var10002.append(m44.a<"q">(var5, var10008, -32408400023601271L, var6))
            .append(a<"y">(13759, 2819194435263999355L ^ var6))
            .append(var30)
            .append(a<"y">(24764, 5907443649407219828L ^ var6))
            .append(var0)
            .append(a<"y">(28224, 4573795458389046947L ^ var6))
            .toString()
      );
   }

   public static js G(int var0, short var1, h1 var2, t6 var3, long var4) {
      long var6 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ bb;
      long var8 = var6 ^ 13584196348136L;
      long var10001 = var6 ^ 87163775108010L;
      int var10 = (int)((var6 ^ 87163775108010L) >>> 32);
      int var11 = (int)((var6 ^ 87163775108010L) << 32 >>> 40);
      int var12 = (int)(var10001 << 56 >>> 56);
      long var13 = var6 ^ 77883580166073L;
      long var15 = var6 ^ 58482319300840L;
      long var17 = var6 ^ 115257612775101L;
      var10001 = var6 ^ 79656242944453L;
      int var19 = (int)((var6 ^ 79656242944453L) >>> 32);
      int var20 = (int)((var6 ^ 79656242944453L) << 32 >>> 48);
      int var21 = (int)(var10001 << 48 >>> 48);
      long var22 = var6 ^ 6032236459468L;
      long var24 = var6 ^ 78344215249240L;
      long var26 = var6 ^ 49731661412637L;
      long var28 = var6 ^ 86598590643356L;
      int var30 = var2.readUnsignedByte();

      try {
         switch (var30) {
            case 1:
               return new x8(var0, var2, var3, var24);
            case 2:
            case 13:
            case 14:
            default:
               break;
            case 3:
               return new xp(var0, var26, var2, var3);
            case 4:
               return new xy(var0, var2, var17, var3);
            case 5:
               return new xa(var0, var2, var3, var13);
            case 6:
               return new xj(var0, var2, var22, var3);
            case 7:
               return new jr(var19, (char)var20, var0, var2, var3, var21);
            case 8:
               return new xh(var0, var2, var15, var3);
            case 9:
               return new xe(var0, var2, var3);
            case 10:
               return new xi(var0, var2, var3);
            case 11:
               return new xs(var0, var2, var3);
            case 12:
               return new xd(var0, var2, var3);
            case 15:
               return new jn(var0, var2, var3);
            case 16:
               return new j3(var0, var2, var3);
            case 17:
               return new jh(var0, var2, var3);
            case 18:
               return new j4(var0, var2, var3);
            case 19:
               return new x5(var0, var8, var2, var3);
            case 20:
               return new x0(var28, var0, var2, var3);
         }
      } catch (n9 var31) {
         throw m44.a<"k">(var31, -4465126949030463281L, var6);
      }

      StringBuilder var10002 = new StringBuilder().append(a<"y">(12686, 7289851869242988411L ^ var6));
      Object[] var10008 = new Object[]{null, null, Integer.valueOf((byte)var12)};
      var10008[1] = var11;
      var10008[0] = var10;
      throw new aw(
         var10002.append(m44.a<"t">(var3, var10008, -4498568840396177004L, var6))
            .append(a<"y">(427, 6609459746908546907L ^ var6))
            .append(var30)
            .append(a<"y">(13430, 4554356119958262410L ^ var6))
            .append(var0)
            .append(a<"y">(24655, 7584365588732855995L ^ var6))
            .toString()
      );
   }

   public static String W(Object[] param0) {
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
      // 13: getstatic com/zelix/js.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 5557646785084271556
      // 1c: lload 2
      // 1d: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 1
      // 23: invokevirtual java/lang/String.length ()I
      // 26: istore 5
      // 28: istore 4
      // 2a: iload 5
      // 2c: bipush 2
      // 2d: iload 4
      // 2f: ifne 73
      // 32: if_icmple c1
      // 35: goto 42
      // 38: ldc2_w 5492094280874489584
      // 3b: lload 2
      // 3c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 1
      // 43: iload 4
      // 45: ifne c2
      // 48: goto 55
      // 4b: ldc2_w 5492094280874489584
      // 4e: lload 2
      // 4f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: bipush 0
      // 56: invokevirtual java/lang/String.charAt (I)C
      // 59: sipush 16554
      // 5c: ldc2_w 5250330694197665617
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: goto 73
      // 69: ldc2_w 5492094280874489584
      // 6c: lload 2
      // 6d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: if_icmpne c1
      // 76: aload 1
      // 77: iload 4
      // 79: ifne c2
      // 7c: goto 89
      // 7f: ldc2_w 5492094280874489584
      // 82: lload 2
      // 83: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: iload 5
      // 8b: bipush 1
      // 8c: isub
      // 8d: invokevirtual java/lang/String.charAt (I)C
      // 90: sipush 824
      // 93: ldc2_w 2810636342484933835
      // 96: lload 2
      // 97: lxor
      // 98: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: if_icmpne c1
      // a0: goto ad
      // a3: ldc2_w 5492094280874489584
      // a6: lload 2
      // a7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: aload 1
      // ae: bipush 1
      // af: iload 5
      // b1: bipush 1
      // b2: isub
      // b3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // b6: areturn
      // b7: ldc2_w 5492094280874489584
      // ba: lload 2
      // bb: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: athrow
      // c1: aload 1
      // c2: areturn
   }

   public static String o(Object[] param0) {
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
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w 4861737068858448391
      // 01c: lload 1
      // 01d: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: astore 5
      // 025: aload 5
      // 027: invokevirtual java/lang/String.length ()I
      // 02a: istore 6
      // 02c: istore 4
      // 02e: aconst_null
      // 02f: astore 7
      // 031: aload 5
      // 033: ldc ";"
      // 035: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 038: ifeq 1e4
      // 03b: new java/lang/StringBuffer
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuffer.<init> ()V
      // 042: astore 7
      // 044: aload 5
      // 046: ldc "["
      // 048: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 04b: lload 1
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: ifle 18e
      // 051: iload 4
      // 053: ifeq 18e
      // 056: ifeq 17a
      // 059: goto 066
      // 05c: ldc2_w 6675738157861398115
      // 05f: lload 1
      // 060: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: aload 7
      // 068: sipush 31617
      // 06b: ldc2_w 5537909901465875682
      // 06e: lload 1
      // 06f: lxor
      // 070: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w 6363316866643965443
      // 078: lload 1
      // 079: invokedynamic p (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: pop
      // 07f: bipush 1
      // 080: istore 8
      // 082: iload 8
      // 084: iload 6
      // 086: if_icmpge 169
      // 089: aload 5
      // 08b: iload 8
      // 08d: invokevirtual java/lang/String.charAt (I)C
      // 090: istore 9
      // 092: iload 9
      // 094: sipush 31617
      // 097: ldc2_w 5537909901465875682
      // 09a: lload 1
      // 09b: lxor
      // 09c: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: iload 4
      // 0a3: lload 1
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: iflt 0ae
      // 0a9: ifeq 20f
      // 0ac: iload 4
      // 0ae: ifeq 121
      // 0b1: goto 0be
      // 0b4: ldc2_w 6675738157861398115
      // 0b7: lload 1
      // 0b8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: lload 1
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 114
      // 0c4: if_icmpne 105
      // 0c7: goto 0d4
      // 0ca: ldc2_w 6675738157861398115
      // 0cd: lload 1
      // 0ce: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 7
      // 0d6: sipush 31617
      // 0d9: ldc2_w 5537909901465875682
      // 0dc: lload 1
      // 0dd: lxor
      // 0de: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: ldc2_w 6363316866643965443
      // 0e6: lload 1
      // 0e7: invokedynamic p (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: pop
      // 0ed: iload 4
      // 0ef: lload 1
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 166
      // 0f5: ifne 161
      // 0f8: goto 105
      // 0fb: ldc2_w 6675738157861398115
      // 0fe: lload 1
      // 0ff: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: iload 9
      // 107: sipush 16554
      // 10a: ldc2_w 5250283645974368194
      // 10d: lload 1
      // 10e: lxor
      // 10f: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: goto 121
      // 117: ldc2_w 6675738157861398115
      // 11a: lload 1
      // 11b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: if_icmpne 155
      // 124: aload 7
      // 126: sipush 16554
      // 129: ldc2_w 5250283645974368194
      // 12c: lload 1
      // 12d: lxor
      // 12e: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: ldc2_w 6363316866643965443
      // 136: lload 1
      // 137: invokedynamic p (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: pop
      // 13d: iload 4
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: iflt 171
      // 145: ifne 169
      // 148: goto 155
      // 14b: ldc2_w 6675738157861398115
      // 14e: lload 1
      // 14f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aconst_null
      // 156: areturn
      // 157: ldc2_w 6675738157861398115
      // 15a: lload 1
      // 15b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: iinc 8 1
      // 164: iload 4
      // 166: ifne 082
      // 169: iload 4
      // 16b: lload 1
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 090
      // 171: lload 1
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 181
      // 177: ifne 1ce
      // 17a: aload 5
      // 17c: ldc "L"
      // 17e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 181: goto 18e
      // 184: ldc2_w 6675738157861398115
      // 187: lload 1
      // 188: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: lload 1
      // 18f: lconst_0
      // 190: lcmp
      // 191: ifle 1b2
      // 194: ifeq 1c2
      // 197: aload 7
      // 199: sipush 16554
      // 19c: ldc2_w 5250283645974368194
      // 19f: lload 1
      // 1a0: lxor
      // 1a1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: ldc2_w 6363316866643965443
      // 1a9: lload 1
      // 1aa: invokedynamic p (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: pop
      // 1b0: iload 4
      // 1b2: ifne 1ce
      // 1b5: goto 1c2
      // 1b8: ldc2_w 6675738157861398115
      // 1bb: lload 1
      // 1bc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aconst_null
      // 1c3: areturn
      // 1c4: ldc2_w 6675738157861398115
      // 1c7: lload 1
      // 1c8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 5
      // 1d0: aload 7
      // 1d2: ldc2_w 6629083282251280067
      // 1d5: lload 1
      // 1d6: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: iload 6
      // 1dd: bipush 1
      // 1de: isub
      // 1df: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1e2: astore 5
      // 1e4: aload 5
      // 1e6: iload 4
      // 1e8: lload 1
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: ifle 1fe
      // 1ee: ifeq 24d
      // 1f1: sipush 20457
      // 1f4: ldc2_w 4753157727932006534
      // 1f7: lload 1
      // 1f8: lxor
      // 1f9: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: invokevirtual java/lang/String.indexOf (I)I
      // 201: bipush -1
      // 202: goto 20f
      // 205: ldc2_w 6675738157861398115
      // 208: lload 1
      // 209: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: if_icmpeq 23e
      // 212: aload 5
      // 214: sipush 20457
      // 217: ldc2_w 4753157727932006534
      // 21a: lload 1
      // 21b: lxor
      // 21c: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: sipush 7325
      // 224: ldc2_w 7371105220432991228
      // 227: lload 1
      // 228: lxor
      // 229: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 231: astore 8
      // 233: iload 4
      // 235: lload 1
      // 236: lconst_0
      // 237: lcmp
      // 238: ifle 254
      // 23b: ifne 24f
      // 23e: aload 5
      // 240: goto 24d
      // 243: ldc2_w 6675738157861398115
      // 246: lload 1
      // 247: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: astore 8
      // 24f: aload 5
      // 251: invokevirtual java/lang/String.length ()I
      // 254: istore 9
      // 256: aload 5
      // 258: sipush 20457
      // 25b: ldc2_w 4753157727932006534
      // 25e: lload 1
      // 25f: lxor
      // 260: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: invokevirtual java/lang/String.indexOf (I)I
      // 268: istore 10
      // 26a: aload 5
      // 26c: sipush 20457
      // 26f: ldc2_w 4753157727932006534
      // 272: lload 1
      // 273: lxor
      // 274: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: invokevirtual java/lang/String.lastIndexOf (I)I
      // 27c: istore 11
      // 27e: aload 5
      // 280: sipush 7325
      // 283: ldc2_w 7371105220432991228
      // 286: lload 1
      // 287: lxor
      // 288: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: invokevirtual java/lang/String.indexOf (I)I
      // 290: istore 12
      // 292: aload 5
      // 294: sipush 7325
      // 297: ldc2_w 7371105220432991228
      // 29a: lload 1
      // 29b: lxor
      // 29c: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: invokevirtual java/lang/String.lastIndexOf (I)I
      // 2a4: istore 13
      // 2a6: aload 8
      // 2a8: invokevirtual java/lang/String.length ()I
      // 2ab: iload 4
      // 2ad: lload 1
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: iflt 2e5
      // 2b3: ifeq 2e3
      // 2b6: bipush 3
      // 2b7: if_icmplt 3d9
      // 2ba: goto 2c7
      // 2bd: ldc2_w 6675738157861398115
      // 2c0: lload 1
      // 2c1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: aload 8
      // 2c9: bipush 0
      // 2ca: invokevirtual java/lang/String.charAt (I)C
      // 2cd: ldc2_w 5123092110132040983
      // 2d0: lload 1
      // 2d1: invokedynamic o (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: goto 2e3
      // 2d9: ldc2_w 6675738157861398115
      // 2dc: lload 1
      // 2dd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: iload 4
      // 2e5: lload 1
      // 2e6: lconst_0
      // 2e7: lcmp
      // 2e8: iflt 302
      // 2eb: ifeq 300
      // 2ee: ifeq 3d9
      // 2f1: goto 2fe
      // 2f4: ldc2_w 6675738157861398115
      // 2f7: lload 1
      // 2f8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: iload 10
      // 300: iload 4
      // 302: ifeq 37d
      // 305: ifle 36e
      // 308: goto 315
      // 30b: ldc2_w 6675738157861398115
      // 30e: lload 1
      // 30f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: athrow
      // 315: iload 11
      // 317: iload 4
      // 319: ifeq 37d
      // 31c: goto 329
      // 31f: ldc2_w 6675738157861398115
      // 322: lload 1
      // 323: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: athrow
      // 329: lload 1
      // 32a: lconst_0
      // 32b: lcmp
      // 32c: iflt 370
      // 32f: iload 9
      // 331: bipush 1
      // 332: isub
      // 333: if_icmpge 36e
      // 336: goto 343
      // 339: ldc2_w 6675738157861398115
      // 33c: lload 1
      // 33d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: athrow
      // 343: iload 12
      // 345: iload 4
      // 347: lload 1
      // 348: lconst_0
      // 349: lcmp
      // 34a: ifle 37f
      // 34d: ifeq 37d
      // 350: goto 35d
      // 353: ldc2_w 6675738157861398115
      // 356: lload 1
      // 357: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: athrow
      // 35d: bipush -1
      // 35e: if_icmpeq 3cc
      // 361: goto 36e
      // 364: ldc2_w 6675738157861398115
      // 367: lload 1
      // 368: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: iload 12
      // 370: goto 37d
      // 373: ldc2_w 6675738157861398115
      // 376: lload 1
      // 377: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: athrow
      // 37d: iload 4
      // 37f: lload 1
      // 380: lconst_0
      // 381: lcmp
      // 382: ifle 39e
      // 385: ifeq 39a
      // 388: ifle 3d9
      // 38b: goto 398
      // 38e: ldc2_w 6675738157861398115
      // 391: lload 1
      // 392: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: athrow
      // 398: iload 13
      // 39a: iload 9
      // 39c: bipush 1
      // 39d: isub
      // 39e: lload 1
      // 39f: lconst_0
      // 3a0: lcmp
      // 3a1: ifle 3c9
      // 3a4: iload 4
      // 3a6: ifeq 3c9
      // 3a9: if_icmpge 3d9
      // 3ac: goto 3b9
      // 3af: ldc2_w 6675738157861398115
      // 3b2: lload 1
      // 3b3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: athrow
      // 3b9: iload 10
      // 3bb: bipush -1
      // 3bc: goto 3c9
      // 3bf: ldc2_w 6675738157861398115
      // 3c2: lload 1
      // 3c3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: athrow
      // 3c9: if_icmpne 3d9
      // 3cc: aload 8
      // 3ce: areturn
      // 3cf: ldc2_w 6675738157861398115
      // 3d2: lload 1
      // 3d3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d8: athrow
      // 3d9: aconst_null
      // 3da: areturn
   }

   void w(long var1, DataOutputStream var3, Map var4) {
      long var5 = var1 ^ 108918228228897L;
      this.O(var3, var5);
   }

   boolean Z(Object[] var1) {
      return true;
   }

   public static String k(Object[] param0) {
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
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 58267447932127
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 999149124000
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: ldc2_w -2967592931583807436
      // 02c: lload 2
      // 02d: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: istore 8
      // 034: aload 1
      // 035: invokevirtual java/lang/String.length ()I
      // 038: iload 8
      // 03a: ifne 0c4
      // 03d: bipush 1
      // 03e: if_icmpne 0b3
      // 041: goto 04e
      // 044: ldc2_w -2898188286238593792
      // 047: lload 2
      // 048: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: aload 1
      // 04f: iload 8
      // 051: ifne 0b2
      // 054: goto 061
      // 057: ldc2_w -2898188286238593792
      // 05a: lload 2
      // 05b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: lload 4
      // 063: bipush 2
      // 064: anewarray 583
      // 067: dup_x2
      // 068: dup_x2
      // 069: pop
      // 06a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06d: bipush 1
      // 06e: swap
      // 06f: aastore
      // 070: dup_x1
      // 071: swap
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w -3430713003815042671
      // 078: lload 2
      // 079: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: ifeq 09a
      // 081: goto 08e
      // 084: ldc2_w -2898188286238593792
      // 087: lload 2
      // 088: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 1
      // 08f: areturn
      // 090: ldc2_w -2898188286238593792
      // 093: lload 2
      // 094: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: new java/lang/StringBuilder
      // 09d: dup
      // 09e: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a1: ldc "L"
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: aload 1
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: ldc ";"
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b2: areturn
      // 0b3: aload 1
      // 0b4: sipush 13582
      // 0b7: ldc2_w 8232524669267510811
      // 0ba: lload 2
      // 0bb: lxor
      // 0bc: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/js.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0c4: istore 10
      // 0c6: iload 10
      // 0c8: bipush -1
      // 0c9: if_icmple 0e0
      // 0cc: aload 1
      // 0cd: bipush 0
      // 0ce: iload 10
      // 0d0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d3: astore 9
      // 0d5: iload 8
      // 0d7: lload 2
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 0f5
      // 0dd: ifeq 0e3
      // 0e0: aload 1
      // 0e1: astore 9
      // 0e3: aload 9
      // 0e5: sipush 31617
      // 0e8: ldc2_w 5538010069593522049
      // 0eb: lload 2
      // 0ec: lxor
      // 0ed: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: invokevirtual java/lang/String.lastIndexOf (I)I
      // 0f5: istore 11
      // 0f7: iload 11
      // 0f9: bipush -1
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: iflt 13e
      // 100: iload 8
      // 102: ifne 13e
      // 105: if_icmple 120
      // 108: goto 115
      // 10b: ldc2_w -2898188286238593792
      // 10e: lload 2
      // 10f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 9
      // 117: iload 11
      // 119: bipush 1
      // 11a: iadd
      // 11b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 11e: astore 9
      // 120: aload 9
      // 122: invokevirtual java/lang/String.length ()I
      // 125: lload 2
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 1e8
      // 12b: iload 8
      // 12d: ifne 1e8
      // 130: bipush 1
      // 131: goto 13e
      // 134: ldc2_w -2898188286238593792
      // 137: lload 2
      // 138: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: lload 2
      // 13f: lconst_0
      // 140: lcmp
      // 141: ifle 168
      // 144: if_icmpne 1ae
      // 147: aload 9
      // 149: lload 4
      // 14b: bipush 2
      // 14c: anewarray 583
      // 14f: dup_x2
      // 150: dup_x2
      // 151: pop
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: bipush 1
      // 156: swap
      // 157: aastore
      // 158: dup_x1
      // 159: swap
      // 15a: bipush 0
      // 15b: swap
      // 15c: aastore
      // 15d: ldc2_w -3430713003815042671
      // 160: lload 2
      // 161: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: iload 8
      // 168: ifne 243
      // 16b: goto 178
      // 16e: ldc2_w -2898188286238593792
      // 171: lload 2
      // 172: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: ifne 242
      // 17b: goto 188
      // 17e: ldc2_w -2898188286238593792
      // 181: lload 2
      // 182: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: new java/lang/StringBuilder
      // 18b: dup
      // 18c: invokespecial java/lang/StringBuilder.<init> ()V
      // 18f: ldc "L"
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 194: aload 9
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: ldc ";"
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a1: astore 9
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 1cf
      // 1a9: iload 8
      // 1ab: ifeq 242
      // 1ae: aload 9
      // 1b0: sipush 20457
      // 1b3: ldc2_w 4753257636216949733
      // 1b6: lload 2
      // 1b7: lxor
      // 1b8: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: sipush 7325
      // 1c0: ldc2_w 7370985503484156063
      // 1c3: lload 2
      // 1c4: lxor
      // 1c5: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1cd: astore 9
      // 1cf: aload 9
      // 1d1: iload 8
      // 1d3: ifne 240
      // 1d6: ldc "L"
      // 1d8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1db: goto 1e8
      // 1de: ldc2_w -2898188286238593792
      // 1e1: lload 2
      // 1e2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: lload 2
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: iflt 1f8
      // 1ee: ifeq 21a
      // 1f1: aload 9
      // 1f3: ldc ";"
      // 1f5: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1f8: iload 8
      // 1fa: ifne 243
      // 1fd: goto 20a
      // 200: ldc2_w -2898188286238593792
      // 203: lload 2
      // 204: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: ifne 242
      // 20d: goto 21a
      // 210: ldc2_w -2898188286238593792
      // 213: lload 2
      // 214: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: new java/lang/StringBuilder
      // 21d: dup
      // 21e: invokespecial java/lang/StringBuilder.<init> ()V
      // 221: ldc "L"
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: aload 9
      // 228: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22b: ldc ";"
      // 22d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 230: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 233: goto 240
      // 236: ldc2_w -2898188286238593792
      // 239: lload 2
      // 23a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: astore 9
      // 242: bipush 0
      // 243: istore 12
      // 245: iload 10
      // 247: bipush -1
      // 248: iload 8
      // 24a: ifne 2bc
      // 24d: if_icmple 29a
      // 250: goto 25d
      // 253: ldc2_w -2898188286238593792
      // 256: lload 2
      // 257: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: aload 1
      // 25e: sipush 22537
      // 261: ldc2_w 8134939564473379591
      // 264: lload 2
      // 265: lxor
      // 266: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/js.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: lload 6
      // 26d: bipush 3
      // 26e: anewarray 583
      // 271: dup_x2
      // 272: dup_x2
      // 273: pop
      // 274: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 277: bipush 2
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 1
      // 27d: swap
      // 27e: aastore
      // 27f: dup_x1
      // 280: swap
      // 281: bipush 0
      // 282: swap
      // 283: aastore
      // 284: ldc2_w -3159879666998663279
      // 287: lload 2
      // 288: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: istore 12
      // 28f: iload 8
      // 291: lload 2
      // 292: lconst_0
      // 293: lcmp
      // 294: iflt 29c
      // 297: ifeq 2c5
      // 29a: iload 11
      // 29c: iload 8
      // 29e: ifne 2c6
      // 2a1: goto 2ae
      // 2a4: ldc2_w -2898188286238593792
      // 2a7: lload 2
      // 2a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: bipush -1
      // 2af: goto 2bc
      // 2b2: ldc2_w -2898188286238593792
      // 2b5: lload 2
      // 2b6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: athrow
      // 2bc: if_icmple 2c5
      // 2bf: iload 11
      // 2c1: bipush 1
      // 2c2: iadd
      // 2c3: istore 12
      // 2c5: bipush 0
      // 2c6: istore 13
      // 2c8: iload 13
      // 2ca: iload 12
      // 2cc: if_icmpge 2fd
      // 2cf: new java/lang/StringBuilder
      // 2d2: dup
      // 2d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d6: sipush 31617
      // 2d9: ldc2_w 5538010069593522049
      // 2dc: lload 2
      // 2dd: lxor
      // 2de: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2e6: aload 9
      // 2e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ee: iload 8
      // 2f0: ifne 305
      // 2f3: astore 9
      // 2f5: iinc 13 1
      // 2f8: iload 8
      // 2fa: ifeq 2c8
      // 2fd: lload 2
      // 2fe: lconst_0
      // 2ff: lcmp
      // 300: ifle 2f8
      // 303: aload 9
      // 305: areturn
   }

   static {
      long var20 = bb ^ 40033980486974L;
      long var22 = var20 ^ 10100499894714L;
      _0[] var10000 = new _0[1];
      m44.a<"h">(var10000, -3226869880301075131L, var20);
      Cipher var11;
      Cipher var27 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[56];
      int var16 = 0;
      String var15 = "\u0006\u000bìÒ\u0092KvëÎëXæt\u0092+)ï\u008aè%±¥'\u0099n\u0010¤RF¦ç0B;h\u001b>s\fÃ\u0010\u001a·'\u0001ªs\u0019y\u007f\u0085\u0098®\u0001Úàé(S(vL[)Ãgø\u00ad\u008b/\u0017\u009a$UY\u0087Z¶HÜ¨\u008f^üØ\u0002(vG,\u0007·g\u0095D\u0097Pû\u0010\u0085Ú\u000f±\u001a\u008b\u009cÎáDC\u001cQ|qÈ(«Í¡÷ÀÉ¨µJ\u001a\u009bý\u0085¨ÆlÙæÀN\u0080øÉ2¶]\fÇs¼H)°\u001dªJ0U61\u0010m4TÅ\u0004~VÑÎI \u0084Ä¬êÔ(8\u0099g \u0093Ü\u008da\u009d\t\u0082²aÁ.ïHî\u0019GQÇÖá°Ð\u0012\u0085×§á'Ù&\u0081Q\u0016\u009c\u001e\u0000\u0018v\u0088=èjÞ\u0014\në\u008a)\b\u008bJõó\u0002½¨SXªqî\u0018\u001c\u009c=Sy\u0095ýSYÖYñN\u00982)é©ÃÃõ»ÚÆ \u0085Ûg¸±ÞáH¹ô(@·¡ËQÔcz[#Â\u00ad5\u0084(5N\u0012è¨\u000e Q\u0019\u0007\u0002¢\\Û\u0099\u0086Ð_uÐÛP\u008aÒp\u001d³%¼Ù\u000b\u0003ã@ó%p08(\u00ad\u0099q<³ì\u0018£gÙ¾\u0013\u008f\u0006\u0094=\u0085ê\u0016kÇ\u0090# ¹Ü\u0017Ã¾±\u0083kòíÿ\u0012.\u0012ÿ\u0002\u0010çgxZª:L\u0096zR\u008a*\u0010-Wa Í¦\u008bK\u0017û\u0006\u0007Ã\u008eJA=M±\u0004\u0016\u001b\u009a5\u0094Í\u009e\u008f\u001cè2\u009arkh#\u0010£êºëýùQ\u000ey\u0085\u0090ôÛX×?\u0010\"\u008b\u008dig¦ò\u0003ÿôL\u008cûN\u001e\u0080\u0018ÓEÜ\u0006,\u0095\u00adÈùCvö×(\u0013nBÐª\n1i\u009c\u008a(-\u0099äß\u0001lïo\u007f\u0098~{\u001cH ªãcoÁ¾\u0007ã°Òù/ôÅ â\u0011H%\u0007$ëü\u0007\u001b\u0010e&þòó.@Õëù[\u0084.\u001fü48M\u009f\u009cÂ\u00adxÝ».\u00159;Ç\u0005n$nSÜní|Â\u008b?v2³§i^=\u0004hûp\"\u008c\u008aô\u0094O|\u007f·\u00840«9²R\u0099Y<èz(Kå 5À:\u001e¾rG\u0015)-\u0082\u001fËúda\u0017A\u001b\u0096¹zWÞ¹à_Ã\u0088È\f\rÛ\u0096?K$\u0010\u0093\n¶tÂÓ\u0095hÖ'\u009eä¤ìd\u0019(¸\u0011Þ\\H\u0013Ô\u0097Zê\u0094\u0099z£\u0089QF!\u0085V\u008fn3¨\u0085rU\u008c¿\u0015}eÃà\u0013{þÄ¹\u0086(10©`\n\u0083#¶¹ÇÍ¨\u008fií¼x'b\u0005å\u0099ê}ýÂçû1ÒS\u0000&HÂ\u0080\u009cef\u0003 í¼'ºè7ì·}\u0084>÷õë\u000eÒ\u0017L&v\u0095\n`\u008f¶Î&ÔÀ\u0088eQ(ÇëçøK½ Õ\u0094yôþCM\n/mN\u009c\re\u0085Ñ|\u001b«,´Nf\u0014ýÂåLÈ\u0088EÂ\u0099\u0010@\u0019Õ´\u0018Qúéï\u0082ë7\u0082¼<Ø\u0010²\u0088o7Þü\u0010\t¥ \r\u00adHÒ@\u0012 Âä\u0095·\u001b\u001bÊ\u0007\u0094Î£àÓ\u0084,ÌÒ`äù\u0088pÓÄ\u0087å\u0003ã\u001agüG(\u009b8×D¹\u0005\u009eÝ¬³zÞÛW\u0001Þän\u0017Á\u0098\u0096\u0019\\\\M¸íf¬ð\u0092\u0019^]\u0018ê#¹°\u0018ßjF\u0082»$\u0017úÃ5ÀÚ;S»\u0003Ö<|\u00adÊg\u000e_(vÍ³® ÿ|¦°P;v\u000e+Òº$\u0098\u009b\u0084¡E7kz5¢£\u009a\u0097øË\u0084¤\u000e²²¼çë \u0092>¥³*vpKkS\u0089ËÂNÏ\u001bÀn\u0002Qí4\t^±ä44íG)'0\u009f½0§!\u001cª{\u0092;u\nS#p:\u0092qf\u0012\u008a:\u0091`\u0093 É\\Ð|3ú£ZôMÔ¤\u009d\u0019¦ù)·k&\u0091> \u0098\u009f\u0082\u0088ÇpÕ+\u0088\u0096\u008eýTG \u008dRðn,BªÙ^=}\u0080ÿÔ:á\u0013\u0010ÆÂa¤ù\u0099\u009d<\u007f.\u008a\u0088\u0007cx¡\u0018úË¸ÐX\u0014VsL\næº$üÔO\u0006nZG<±m. D¹\u0086\u0091àÇ®ü\u009d\u0006©·\u0014âWÅ\u0018¥\u0003¿Þl,\u0010*\u000b\u009fv½zqY\u0010Ð¢\u001diü=bÿ0\u009flô²É\u0087+\u0010!¯\u0010÷7Ç_\u0014hOÉñà!¨© ð§\bÄ[dõÃ\u009ea\b0\u0087\u0083¤0\u00878»rH4þ¯\u001dn~¶,>ÎL\u0018\fUaúf\u001aÀ\u0007êÏÑYi)E¦§K\u009a\u0017ÓÑrñ(;0i¹Ü\u0098òÓÖ\u000f·¨v©\u0085÷@bbG\tß8ûr\u0084\tÝÉ×\u001ev\u008a]ø|\u000b/\t³(À¾ãÏ\u000fÐ\u0084\u0092\u009d©ýµ\fS:g¸Wë*\u0001û|tîý²Ö\u000f]1®\u0011þÂÍû\u009f\u0090Â\u0010Ð®KÂîô\b\u009cìI\u0006\u0012hòä\u0091 -FY\u0093\u0082\u0010ùÎ¥\u0090Ê\u007fá\u009dÑ;oRìwV:Ê\u001e\u00194\u0082\u001a÷O)m >Þ\u0002ü+æþJ*\u008f·¾ó'õ9ÃÞ\u0004aÄBÃ\u0001ÜíCÚ\u009f\u0095eÄ\u0018Ñ2eýÌ9Ôr\u0005ù<ç§\u0004Ó¢ML\u0002Fx\u0098·~\u0018\u0089]°Ðo$Aö^»ã¬§ú\u0003Uë\u0010l.Ö\u0011¢æ\u0018}ómÑ÷\u008b\u0005ÇÛbæÇîÓÅ¨ù©\u009eS1·æ§(\u0089Ùj/¦o\u0091²\u008d*£\u008e5M®\u0007:\rÌx\u0018;äµ§\u0086Î5\u008cR\u0090Ý\u0087Ù['^³q>0`4F,óu·³àr \\P2\u0095T÷J\u009aßÒ\u000fä_èØ7zjërnbâ-¥æ\u0083ÖÞf\u0090\u0003\u00885S\u0082Á(Ë±ÖÒoJXg´oÝ\u0095A@ê8áï¸\u0004íl\u0016K\u0096õû4\u0091Æ\u008eUi\u0014^úwËË\u0010 Àôeðô\u009f¶=à´e\u0097g\u0099{\u001cès7>\u0005Rv\u0087\u009dtM\u008e\u0011\u00127§";
      int var17 = "\u0006\u000bìÒ\u0092KvëÎëXæt\u0092+)ï\u008aè%±¥'\u0099n\u0010¤RF¦ç0B;h\u001b>s\fÃ\u0010\u001a·'\u0001ªs\u0019y\u007f\u0085\u0098®\u0001Úàé(S(vL[)Ãgø\u00ad\u008b/\u0017\u009a$UY\u0087Z¶HÜ¨\u008f^üØ\u0002(vG,\u0007·g\u0095D\u0097Pû\u0010\u0085Ú\u000f±\u001a\u008b\u009cÎáDC\u001cQ|qÈ(«Í¡÷ÀÉ¨µJ\u001a\u009bý\u0085¨ÆlÙæÀN\u0080øÉ2¶]\fÇs¼H)°\u001dªJ0U61\u0010m4TÅ\u0004~VÑÎI \u0084Ä¬êÔ(8\u0099g \u0093Ü\u008da\u009d\t\u0082²aÁ.ïHî\u0019GQÇÖá°Ð\u0012\u0085×§á'Ù&\u0081Q\u0016\u009c\u001e\u0000\u0018v\u0088=èjÞ\u0014\në\u008a)\b\u008bJõó\u0002½¨SXªqî\u0018\u001c\u009c=Sy\u0095ýSYÖYñN\u00982)é©ÃÃõ»ÚÆ \u0085Ûg¸±ÞáH¹ô(@·¡ËQÔcz[#Â\u00ad5\u0084(5N\u0012è¨\u000e Q\u0019\u0007\u0002¢\\Û\u0099\u0086Ð_uÐÛP\u008aÒp\u001d³%¼Ù\u000b\u0003ã@ó%p08(\u00ad\u0099q<³ì\u0018£gÙ¾\u0013\u008f\u0006\u0094=\u0085ê\u0016kÇ\u0090# ¹Ü\u0017Ã¾±\u0083kòíÿ\u0012.\u0012ÿ\u0002\u0010çgxZª:L\u0096zR\u008a*\u0010-Wa Í¦\u008bK\u0017û\u0006\u0007Ã\u008eJA=M±\u0004\u0016\u001b\u009a5\u0094Í\u009e\u008f\u001cè2\u009arkh#\u0010£êºëýùQ\u000ey\u0085\u0090ôÛX×?\u0010\"\u008b\u008dig¦ò\u0003ÿôL\u008cûN\u001e\u0080\u0018ÓEÜ\u0006,\u0095\u00adÈùCvö×(\u0013nBÐª\n1i\u009c\u008a(-\u0099äß\u0001lïo\u007f\u0098~{\u001cH ªãcoÁ¾\u0007ã°Òù/ôÅ â\u0011H%\u0007$ëü\u0007\u001b\u0010e&þòó.@Õëù[\u0084.\u001fü48M\u009f\u009cÂ\u00adxÝ».\u00159;Ç\u0005n$nSÜní|Â\u008b?v2³§i^=\u0004hûp\"\u008c\u008aô\u0094O|\u007f·\u00840«9²R\u0099Y<èz(Kå 5À:\u001e¾rG\u0015)-\u0082\u001fËúda\u0017A\u001b\u0096¹zWÞ¹à_Ã\u0088È\f\rÛ\u0096?K$\u0010\u0093\n¶tÂÓ\u0095hÖ'\u009eä¤ìd\u0019(¸\u0011Þ\\H\u0013Ô\u0097Zê\u0094\u0099z£\u0089QF!\u0085V\u008fn3¨\u0085rU\u008c¿\u0015}eÃà\u0013{þÄ¹\u0086(10©`\n\u0083#¶¹ÇÍ¨\u008fií¼x'b\u0005å\u0099ê}ýÂçû1ÒS\u0000&HÂ\u0080\u009cef\u0003 í¼'ºè7ì·}\u0084>÷õë\u000eÒ\u0017L&v\u0095\n`\u008f¶Î&ÔÀ\u0088eQ(ÇëçøK½ Õ\u0094yôþCM\n/mN\u009c\re\u0085Ñ|\u001b«,´Nf\u0014ýÂåLÈ\u0088EÂ\u0099\u0010@\u0019Õ´\u0018Qúéï\u0082ë7\u0082¼<Ø\u0010²\u0088o7Þü\u0010\t¥ \r\u00adHÒ@\u0012 Âä\u0095·\u001b\u001bÊ\u0007\u0094Î£àÓ\u0084,ÌÒ`äù\u0088pÓÄ\u0087å\u0003ã\u001agüG(\u009b8×D¹\u0005\u009eÝ¬³zÞÛW\u0001Þän\u0017Á\u0098\u0096\u0019\\\\M¸íf¬ð\u0092\u0019^]\u0018ê#¹°\u0018ßjF\u0082»$\u0017úÃ5ÀÚ;S»\u0003Ö<|\u00adÊg\u000e_(vÍ³® ÿ|¦°P;v\u000e+Òº$\u0098\u009b\u0084¡E7kz5¢£\u009a\u0097øË\u0084¤\u000e²²¼çë \u0092>¥³*vpKkS\u0089ËÂNÏ\u001bÀn\u0002Qí4\t^±ä44íG)'0\u009f½0§!\u001cª{\u0092;u\nS#p:\u0092qf\u0012\u008a:\u0091`\u0093 É\\Ð|3ú£ZôMÔ¤\u009d\u0019¦ù)·k&\u0091> \u0098\u009f\u0082\u0088ÇpÕ+\u0088\u0096\u008eýTG \u008dRðn,BªÙ^=}\u0080ÿÔ:á\u0013\u0010ÆÂa¤ù\u0099\u009d<\u007f.\u008a\u0088\u0007cx¡\u0018úË¸ÐX\u0014VsL\næº$üÔO\u0006nZG<±m. D¹\u0086\u0091àÇ®ü\u009d\u0006©·\u0014âWÅ\u0018¥\u0003¿Þl,\u0010*\u000b\u009fv½zqY\u0010Ð¢\u001diü=bÿ0\u009flô²É\u0087+\u0010!¯\u0010÷7Ç_\u0014hOÉñà!¨© ð§\bÄ[dõÃ\u009ea\b0\u0087\u0083¤0\u00878»rH4þ¯\u001dn~¶,>ÎL\u0018\fUaúf\u001aÀ\u0007êÏÑYi)E¦§K\u009a\u0017ÓÑrñ(;0i¹Ü\u0098òÓÖ\u000f·¨v©\u0085÷@bbG\tß8ûr\u0084\tÝÉ×\u001ev\u008a]ø|\u000b/\t³(À¾ãÏ\u000fÐ\u0084\u0092\u009d©ýµ\fS:g¸Wë*\u0001û|tîý²Ö\u000f]1®\u0011þÂÍû\u009f\u0090Â\u0010Ð®KÂîô\b\u009cìI\u0006\u0012hòä\u0091 -FY\u0093\u0082\u0010ùÎ¥\u0090Ê\u007fá\u009dÑ;oRìwV:Ê\u001e\u00194\u0082\u001a÷O)m >Þ\u0002ü+æþJ*\u008f·¾ó'õ9ÃÞ\u0004aÄBÃ\u0001ÜíCÚ\u009f\u0095eÄ\u0018Ñ2eýÌ9Ôr\u0005ù<ç§\u0004Ó¢ML\u0002Fx\u0098·~\u0018\u0089]°Ðo$Aö^»ã¬§ú\u0003Uë\u0010l.Ö\u0011¢æ\u0018}ómÑ÷\u008b\u0005ÇÛbæÇîÓÅ¨ù©\u009eS1·æ§(\u0089Ùj/¦o\u0091²\u008d*£\u008e5M®\u0007:\rÌx\u0018;äµ§\u0086Î5\u008cR\u0090Ý\u0087Ù['^³q>0`4F,óu·³àr \\P2\u0095T÷J\u009aßÒ\u000fä_èØ7zjërnbâ-¥æ\u0083ÖÞf\u0090\u0003\u00885S\u0082Á(Ë±ÖÒoJXg´oÝ\u0095A@ê8áï¸\u0004íl\u0016K\u0096õû4\u0091Æ\u008eUi\u0014^úwËË\u0010 Àôeðô\u009f¶=à´e\u0097g\u0099{\u001cès7>\u0005Rv\u0087\u009dtM\u008e\u0011\u00127§"
         .length();
      char var14 = '(';
      int var26 = -1;

      label54:
      while (true) {
         String var28 = var15.substring(++var26, var26 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var42 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var42;
                  if ((var26 += var14) >= var17) {
                     eb = var18;
                     fb = new String[56];
                     pb = new HashMap(13);
                     Cipher var0;
                     Cipher var30 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var30.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[19];
                     int var3 = 0;
                     String var4 = "Èà·ò\u0012\u0091R\u0097É\u0097¾0²:êî\u000e?üÝè¹\u0080»-ßÕ§\u0097\u009c\u001fA¹Ô,\rÀë?\u0003\u0088ÀÑpv\u0096R$\u008aiH~Ã¡ÓìC5\u0081@ú@a;\u001f×\u001c\u0082|;Ò\u008dU\\dÆ¼pV1Ð¬ÁÐÃýTI\u000fà\bó\u0018:\u008c\u009fb\u001bG_\u000fN\u0087Ò\u000eËþÚqÈW\u00157AcÖ¤K®\u0019\u009d>\u0081\u0095¯hð\u008aïã1ó¶#]^";
                     int var5 = "Èà·ò\u0012\u0091R\u0097É\u0097¾0²:êî\u000e?üÝè¹\u0080»-ßÕ§\u0097\u009c\u001fA¹Ô,\rÀë?\u0003\u0088ÀÑpv\u0096R$\u008aiH~Ã¡ÓìC5\u0081@ú@a;\u001f×\u001c\u0082|;Ò\u008dU\\dÆ¼pV1Ð¬ÁÐÃýTI\u000fà\bó\u0018:\u008c\u009fb\u001bG_\u000fN\u0087Ò\u000eËþÚqÈW\u00157AcÖ¤K®\u0019\u009d>\u0081\u0095¯hð\u008aïã1ó¶#]^"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var31 = var6;
                        var10001 = var3++;
                        long var46 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var8 = var46;
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
                           long var54 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var49) {
                              case 0:
                                 var31[var10001] = var54;
                                 if (var2 >= var5) {
                                    nb = var6;
                                    ob = new Integer[19];
                                    int var32 = d<"e">(8232, 8912328751653175139L ^ var20);
                                    Object[] var51 = new Object[]{null, var22};
                                    var51[0] = var32;
                                    A = m44.a<"h">(var51, -3063779227911696229L, var20);
                                    int var33 = d<"e">(2382, 6390073243198232082L ^ var20);
                                    Object[] var52 = new Object[]{null, var22};
                                    var52[0] = var33;
                                    U = m44.a<"h">(var52, -3063779227911696229L, var20);
                                    int var34 = d<"e">(2382, 6390073243198232082L ^ var20);
                                    Object[] var53 = new Object[]{null, var22};
                                    var53[0] = var34;
                                    Y = m44.a<"h">(var53, -3063779227911696229L, var20);
                                    A.put("B", a<"y">(12328, 7796474624438802524L ^ var20));
                                    A.put("C", a<"y">(25081, 6515649583333919162L ^ var20));
                                    A.put("D", a<"y">(6821, 2983246170721596126L ^ var20));
                                    A.put("F", a<"y">(21748, 9220005792156581039L ^ var20));
                                    A.put("I", a<"y">(16082, 2296483707910264492L ^ var20));
                                    A.put("J", a<"y">(14016, 7840955251003104909L ^ var20));
                                    A.put("S", a<"y">(17803, 2369671900236639716L ^ var20));
                                    A.put("Z", a<"y">(28126, 5605835795006571907L ^ var20));
                                    A.put("V", a<"y">(30994, 4610101889860030790L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("B", a<"y">(10418, 2554822191739240679L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("C", a<"y">(13622, 7827841826535873871L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("D", a<"y">(10275, 4081028803694755965L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("F", a<"y">(160, 8655716639546386648L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("I", a<"y">(10124, 8997346440710230014L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("J", a<"y">(13939, 7774599948352331317L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("S", a<"y">(23076, 6420945718084825723L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("Z", a<"y">(25024, 7302535701281294727L ^ var20));
                                    m44.a<"l">(-3992740630093796891L, var20).put("V", a<"y">(29616, 5259824027078089665L ^ var20));
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(29120, 8938997205415647624L ^ var20), "B");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(8219, 6082198000057190472L ^ var20), "C");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(10338, 655294853316313102L ^ var20), "D");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(5529, 6514613859208052212L ^ var20), "F");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(20523, 4247217183645104193L ^ var20), "I");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(31216, 7334177471699866008L ^ var20), "J");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(18504, 4073132480989847577L ^ var20), "S");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(23701, 8010100011446826235L ^ var20), "Z");
                                    m44.a<"l">(-3729624002584368281L, var20).put(a<"y">(31443, 2488223065764090519L ^ var20), "V");
                                    return;
                                 }
                                 break;
                              default:
                                 var31[var10001] = var54;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "-ãÐü¶6SÑ\u0000´\u0082Ã0\u0094!Æ";
                                 var5 = "-ãÐü¶6SÑ\u0000´\u0082Ã0\u0094!Æ".length();
                                 var2 = 0;
                           }

                           byte var40 = var2;
                           var2 += 8;
                           var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                           var31 = var6;
                           var10001 = var3++;
                           var46 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var26);
                  break;
               default:
                  var18[var16++] = var42;
                  if ((var26 += var14) < var17) {
                     var14 = var15.charAt(var26);
                     continue label54;
                  }

                  var15 = "²bõ¾\u0012\u0096±»;g:F\u0090e>ªÃ\u008eX)Þb¾åÍg\u0083\u009b`Ré\u0004ÈÏ\u0087\u0010x¬wÞ\u0010Íf}\"¨c\u0012Ñ\u009dÝkß¬\u0090Î®";
                  var17 = "²bõ¾\u0012\u0096±»;g:F\u0090e>ªÃ\u008eX)Þb¾åÍg\u0083\u009b`Ré\u0004ÈÏ\u0087\u0010x¬wÞ\u0010Íf}\"¨c\u0012Ñ\u009dÝkß¬\u0090Î®"
                     .length();
                  var14 = '(';
                  var26 = -1;
            }

            var28 = var15.substring(++var26, var26 + var14);
            var10001 = 0;
         }
      }
   }

   final _v W(Object[] param1) {
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
      // 00e: checkcast com/zelix/_v
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 12525775595472
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 96764599855964
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 82112428862628
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 102058380173170
      // 033: lxor
      // 034: dup2
      // 035: bipush 48
      // 037: lushr
      // 038: l2i
      // 039: istore 11
      // 03b: dup2
      // 03c: bipush 16
      // 03e: lshl
      // 03f: bipush 48
      // 041: lushr
      // 042: l2i
      // 043: istore 12
      // 045: dup2
      // 046: bipush 32
      // 048: lshl
      // 049: bipush 32
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 13
      // 04f: pop2
      // 050: pop2
      // 051: ldc2_w -6824295303180978124
      // 054: lload 3
      // 055: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: aload 0
      // 05b: lload 9
      // 05d: bipush 1
      // 05e: anewarray 583
      // 061: dup_x2
      // 062: dup_x2
      // 063: pop
      // 064: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 067: bipush 0
      // 068: swap
      // 069: aastore
      // 06a: ldc2_w -6341342813119074485
      // 06d: lload 3
      // 06e: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: astore 16
      // 075: istore 14
      // 077: aload 16
      // 079: iload 14
      // 07b: ifeq 10b
      // 07e: lload 5
      // 080: invokevirtual com/zelix/_v.n (J)Z
      // 083: ifeq 0fd
      // 086: goto 093
      // 089: ldc2_w -4713127015967456176
      // 08c: lload 3
      // 08d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 2
      // 094: iload 14
      // 096: ifeq 10b
      // 099: goto 0a6
      // 09c: ldc2_w -4713127015967456176
      // 09f: lload 3
      // 0a0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: iload 11
      // 0a8: i2c
      // 0a9: iload 12
      // 0ab: i2s
      // 0ac: iload 13
      // 0ae: invokevirtual com/zelix/_v.P (CSI)Z
      // 0b1: ifeq 0fd
      // 0b4: goto 0c1
      // 0b7: ldc2_w -4713127015967456176
      // 0ba: lload 3
      // 0bb: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 2
      // 0c2: aload 16
      // 0c4: bipush 0
      // 0c5: anewarray 583
      // 0c8: ldc2_w -6819160372536105532
      // 0cb: lload 3
      // 0cc: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: lload 7
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: bipush 2
      // 0d6: anewarray 583
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -5062292092636125751
      // 0ea: lload 3
      // 0eb: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: lload 3
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: ifle 0fe
      // 0f6: astore 15
      // 0f8: iload 14
      // 0fa: ifne 10d
      // 0fd: aload 2
      // 0fe: goto 10b
      // 101: ldc2_w -4713127015967456176
      // 104: lload 3
      // 105: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: astore 15
      // 10d: aload 15
      // 10f: areturn
   }

   public static boolean y(Object[] param0) {
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
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w -7638343054470558592
      // 01c: lload 1
      // 01d: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 3
      // 025: invokevirtual java/lang/String.length ()I
      // 028: iload 4
      // 02a: ifeq 0a2
      // 02d: bipush 2
      // 02e: if_icmplt 0a1
      // 031: goto 03e
      // 034: ldc2_w -8492795965176762140
      // 037: lload 1
      // 038: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: aload 3
      // 03f: bipush 0
      // 040: invokevirtual java/lang/String.charAt (I)C
      // 043: iload 4
      // 045: ifeq 0a2
      // 048: goto 055
      // 04b: ldc2_w -8492795965176762140
      // 04e: lload 1
      // 04f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: athrow
      // 055: sipush 16265
      // 058: ldc2_w 6434509507446204008
      // 05b: lload 1
      // 05c: lxor
      // 05d: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: if_icmpne 0a1
      // 065: goto 072
      // 068: ldc2_w -8492795965176762140
      // 06b: lload 1
      // 06c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 3
      // 073: ldc ")"
      // 075: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 078: bipush -1
      // 079: lload 1
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 0c2
      // 07f: iload 4
      // 081: ifeq 0c2
      // 084: goto 091
      // 087: ldc2_w -8492795965176762140
      // 08a: lload 1
      // 08b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: if_icmpne 0a3
      // 094: goto 0a1
      // 097: ldc2_w -8492795965176762140
      // 09a: lload 1
      // 09b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: ireturn
      // 0a3: aload 3
      // 0a4: ldc ","
      // 0a6: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0a9: iload 4
      // 0ab: lload 1
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: ifle 0b5
      // 0b1: ifeq 137
      // 0b4: bipush -1
      // 0b5: goto 0c2
      // 0b8: ldc2_w -8492795965176762140
      // 0bb: lload 1
      // 0bc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: lload 1
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: ifle 0d3
      // 0c8: if_icmpgt 129
      // 0cb: aload 3
      // 0cc: ldc "]"
      // 0ce: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0d1: iload 4
      // 0d3: ifeq 137
      // 0d6: goto 0e3
      // 0d9: ldc2_w -8492795965176762140
      // 0dc: lload 1
      // 0dd: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: lload 1
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifle 12a
      // 0e9: bipush -1
      // 0ea: if_icmpgt 129
      // 0ed: goto 0fa
      // 0f0: ldc2_w -8492795965176762140
      // 0f3: lload 1
      // 0f4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: iload 4
      // 0fd: ifeq 143
      // 100: goto 10d
      // 103: ldc2_w -8492795965176762140
      // 106: lload 1
      // 107: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: lload 1
      // 10e: lconst_0
      // 10f: lcmp
      // 110: ifle 139
      // 113: ldc " "
      // 115: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 118: bipush -1
      // 119: if_icmple 138
      // 11c: goto 129
      // 11f: ldc2_w -8492795965176762140
      // 122: lload 1
      // 123: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: bipush 0
      // 12a: goto 137
      // 12d: ldc2_w -8492795965176762140
      // 130: lload 1
      // 131: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: ireturn
      // 138: aload 3
      // 139: bipush 1
      // 13a: aload 3
      // 13b: ldc ")"
      // 13d: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 140: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 143: astore 5
      // 145: aload 3
      // 146: ldc ")"
      // 148: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 14b: lload 1
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 191
      // 151: iload 4
      // 153: ifeq 191
      // 156: aload 3
      // 157: invokevirtual java/lang/String.length ()I
      // 15a: bipush 1
      // 15b: isub
      // 15c: if_icmpge 18c
      // 15f: goto 16c
      // 162: ldc2_w -8492795965176762140
      // 165: lload 1
      // 166: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: new java/lang/StringBuilder
      // 16f: dup
      // 170: invokespecial java/lang/StringBuilder.<init> ()V
      // 173: aload 5
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: aload 3
      // 179: aload 3
      // 17a: ldc ")"
      // 17c: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 17f: bipush 1
      // 180: iadd
      // 181: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18a: astore 5
      // 18c: aload 5
      // 18e: invokevirtual java/lang/String.length ()I
      // 191: lload 1
      // 192: lconst_0
      // 193: lcmp
      // 194: ifle 19b
      // 197: ifeq 300
      // 19a: bipush 0
      // 19b: iload 4
      // 19d: ifeq 307
      // 1a0: goto 1ad
      // 1a3: ldc2_w -8492795965176762140
      // 1a6: lload 1
      // 1a7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: istore 6
      // 1af: aload 5
      // 1b1: iload 6
      // 1b3: invokevirtual java/lang/String.charAt (I)C
      // 1b6: sipush 31617
      // 1b9: ldc2_w 5537985927099458149
      // 1bc: lload 1
      // 1bd: lxor
      // 1be: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: if_icmpne 1ec
      // 1c6: iinc 6 1
      // 1c9: iload 4
      // 1cb: lload 1
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 1d6
      // 1d1: ifeq 284
      // 1d4: iload 4
      // 1d6: ifne 1af
      // 1d9: lload 1
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: iflt 1c9
      // 1df: goto 1ec
      // 1e2: ldc2_w -8492795965176762140
      // 1e5: lload 1
      // 1e6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aload 5
      // 1ee: iload 6
      // 1f0: invokevirtual java/lang/String.charAt (I)C
      // 1f3: iload 4
      // 1f5: lload 1
      // 1f6: lconst_0
      // 1f7: lcmp
      // 1f8: ifle 20b
      // 1fb: ifeq 286
      // 1fe: sipush 16554
      // 201: ldc2_w 5250276073291487557
      // 204: lload 1
      // 205: lxor
      // 206: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: if_icmpne 284
      // 20e: goto 21b
      // 211: ldc2_w -8492795965176762140
      // 214: lload 1
      // 215: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: athrow
      // 21b: aload 5
      // 21d: sipush 10524
      // 220: ldc2_w 4177823787454918903
      // 223: lload 1
      // 224: lxor
      // 225: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: invokevirtual java/lang/String.indexOf (I)I
      // 22d: istore 7
      // 22f: iload 7
      // 231: iload 4
      // 233: lload 1
      // 234: lconst_0
      // 235: lcmp
      // 236: iflt 23d
      // 239: ifeq 283
      // 23c: bipush -1
      // 23d: if_icmpeq 275
      // 240: goto 24d
      // 243: ldc2_w -8492795965176762140
      // 246: lload 1
      // 247: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: iload 7
      // 24f: iload 4
      // 251: ifeq 283
      // 254: goto 261
      // 257: ldc2_w -8492795965176762140
      // 25a: lload 1
      // 25b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: iload 6
      // 263: bipush 1
      // 264: iadd
      // 265: if_icmpne 288
      // 268: goto 275
      // 26b: ldc2_w -8492795965176762140
      // 26e: lload 1
      // 26f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: athrow
      // 275: bipush 0
      // 276: goto 283
      // 279: ldc2_w -8492795965176762140
      // 27c: lload 1
      // 27d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: ireturn
      // 284: iload 6
      // 286: istore 7
      // 288: aload 5
      // 28a: bipush 0
      // 28b: iload 7
      // 28d: bipush 1
      // 28e: iadd
      // 28f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 292: astore 8
      // 294: aload 8
      // 296: invokevirtual java/lang/String.length ()I
      // 299: bipush 1
      // 29a: iload 4
      // 29c: ifeq 2de
      // 29f: if_icmpne 2d5
      // 2a2: goto 2af
      // 2a5: ldc2_w -8492795965176762140
      // 2a8: lload 1
      // 2a9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: getstatic com/zelix/js.A Ljava/util/Map;
      // 2b2: aload 8
      // 2b4: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b9: ifnonnull 2d5
      // 2bc: goto 2c9
      // 2bf: ldc2_w -8492795965176762140
      // 2c2: lload 1
      // 2c3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: bipush 0
      // 2ca: ireturn
      // 2cb: ldc2_w -8492795965176762140
      // 2ce: lload 1
      // 2cf: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: iload 7
      // 2d7: aload 5
      // 2d9: invokevirtual java/lang/String.length ()I
      // 2dc: bipush 1
      // 2dd: isub
      // 2de: if_icmpne 2f0
      // 2e1: ldc ""
      // 2e3: astore 5
      // 2e5: iload 4
      // 2e7: lload 1
      // 2e8: lconst_0
      // 2e9: lcmp
      // 2ea: ifle 2fd
      // 2ed: ifne 2fb
      // 2f0: aload 5
      // 2f2: iload 7
      // 2f4: bipush 1
      // 2f5: iadd
      // 2f6: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2f9: astore 5
      // 2fb: iload 4
      // 2fd: ifne 18c
      // 300: lload 1
      // 301: lconst_0
      // 302: lcmp
      // 303: iflt 19a
      // 306: bipush 1
      // 307: ireturn
   }

   public static _v Q(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = bb ^ var2;
      long var4 = var2 ^ 115146886797785L;
      long var6 = var2 ^ 140334267579808L;
      int var10000 = m44.a<"h">(5317869815783632680L, var2);
      String var9 = _v.H(var1, var6);
      int var8 = var10000;

      label35: {
         try {
            var14 = var9;
            if (var8 != 0) {
               break label35;
            }

            if (var9 == null) {
               return null;
            }
         } catch (n9 var12) {
            throw m44.a<"h">(var12, 5249986072045056540L, var2);
         }

         var14 = var9;
      }

      _v var10 = l62.G(var4, var14);

      try {
         if (var8 != 0) {
            return var10;
         }

         if (var10 == null) {
            return null;
         }
      } catch (n9 var11) {
         throw m44.a<"h">(var11, 5249986072045056540L, var2);
      }

      return var10;
   }

   public String e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 14405184366523L;
      int var4 = (int)((var2 ^ 14405184366523L) >>> 48);
      int var5 = (int)((var2 ^ 14405184366523L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return m44.a<"q">(this, (char)var4, var5, (short)var6, 5520947662033063077L, var2);
   }

   public boolean U(Object[] param1) {
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
      // 0c: getstatic com/zelix/js.bb J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 97351259875515
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2809494495812861978
      // 1e: lload 2
      // 1f: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: lload 4
      // 27: invokevirtual com/zelix/js.A (J)Lcom/zelix/va;
      // 2a: astore 7
      // 2c: istore 6
      // 2e: aload 7
      // 30: ldc2_w -4065257126315531478
      // 33: lload 2
      // 34: invokedynamic j (JJ)Lcom/zelix/va; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokevirtual com/zelix/va.equals (Ljava/lang/Object;)Z
      // 3c: iload 6
      // 3e: ifne 82
      // 41: ifne 81
      // 44: goto 51
      // 47: ldc2_w -2876173655847935278
      // 4a: lload 2
      // 4b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 7
      // 53: ldc2_w -4499669366237043075
      // 56: lload 2
      // 57: invokedynamic j (JJ)Lcom/zelix/va; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual com/zelix/va.equals (Ljava/lang/Object;)Z
      // 5f: iload 6
      // 61: ifne 82
      // 64: goto 71
      // 67: ldc2_w -2876173655847935278
      // 6a: lload 2
      // 6b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: ifeq 85
      // 74: goto 81
      // 77: ldc2_w -2876173655847935278
      // 7a: lload 2
      // 7b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static String E(char var0, short var1, String var2, int var3) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ bb;
      long var6 = var4 ^ 112629037712937L;
      return u(var2, false, var6, true);
   }

   public static List h(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = bb ^ var2;
      long var4 = var2 ^ 138001363102901L;
      List var6 = A(var1, var4);
      String var7 = Z(var1);
      var6.add(var7);
      return var6;
   }

   abstract void O(DataOutputStream var1, long var2);

   public static int u(Object[] param0) {
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
      // 04: checkcast java/util/List
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/js.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 59131151958206
      // 1e: lxor
      // 1f: lstore 4
      // 21: pop2
      // 22: ldc2_w 4209242327660126997
      // 25: lload 2
      // 26: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 7
      // 2e: istore 6
      // 30: aload 1
      // 31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36: astore 8
      // 38: aload 8
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq bd
      // 42: aload 8
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast java/lang/String
      // 4c: astore 9
      // 4e: iload 6
      // 50: lload 2
      // 51: lconst_0
      // 52: lcmp
      // 53: ifle 9f
      // 56: ifeq 9d
      // 59: lload 4
      // 5b: aload 9
      // 5d: bipush 2
      // 5e: anewarray 583
      // 61: dup_x1
      // 62: swap
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w 4341402674771445390
      // 72: lload 2
      // 73: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: iload 6
      // 7a: ifeq bf
      // 7d: goto 8a
      // 80: ldc2_w 2717530946257100657
      // 83: lload 2
      // 84: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: ifeq a8
      // 8d: goto 9a
      // 90: ldc2_w 2717530946257100657
      // 93: lload 2
      // 94: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: iinc 7 2
      // 9d: iload 6
      // 9f: lload 2
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle ba
      // a5: ifne b8
      // a8: iinc 7 1
      // ab: goto b8
      // ae: ldc2_w 2717530946257100657
      // b1: lload 2
      // b2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: iload 6
      // ba: ifne 38
      // bd: iload 7
      // bf: ireturn
   }

   public static boolean l(Object[] param0) {
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
      // 13: getstatic com/zelix/js.bb J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -5702280464601978462
      // 1c: lload 2
      // 1d: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: invokevirtual java/lang/String.length ()I
      // 28: iload 4
      // 2a: ifeq 54
      // 2d: bipush 1
      // 2e: if_icmpne 6d
      // 31: goto 3e
      // 34: ldc2_w -5836156841820777018
      // 37: lload 2
      // 38: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: getstatic com/zelix/js.A Ljava/util/Map;
      // 41: aload 1
      // 42: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 47: goto 54
      // 4a: ldc2_w -5836156841820777018
      // 4d: lload 2
      // 4e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: iload 4
      // 56: ifeq 6a
      // 59: ifeq 6d
      // 5c: goto 69
      // 5f: ldc2_w -5836156841820777018
      // 62: lload 2
      // 63: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 1
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: ireturn
   }

   public final void r(int var1) {
      this.t = var1;
   }

   public static String l(Object[] var0) {
      String var1 = (String)var0[0];
      return (String)A.get(var1);
   }

   public static List E(String param0, long param1, short param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: bipush 16
      // 003: lshl
      // 004: iload 3
      // 005: i2l
      // 006: bipush 48
      // 008: lshl
      // 009: bipush 48
      // 00b: lushr
      // 00c: lor
      // 00d: getstatic com/zelix/js.bb J
      // 010: lxor
      // 011: lstore 5
      // 013: lload 5
      // 015: dup2
      // 016: ldc2_w 39088145929223
      // 019: lxor
      // 01a: lstore 7
      // 01c: pop2
      // 01d: ldc2_w -6806918118779205780
      // 020: lload 5
      // 022: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 0
      // 028: invokestatic com/zelix/loe.B (Ljava/lang/String;)Ljava/lang/String;
      // 02b: astore 10
      // 02d: istore 9
      // 02f: iload 4
      // 031: iload 9
      // 033: ifne 105
      // 036: ifeq 100
      // 039: goto 047
      // 03c: ldc2_w -6872610810736240040
      // 03f: lload 5
      // 041: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: aload 10
      // 049: invokevirtual java/lang/String.length ()I
      // 04c: bipush 2
      // 04d: iload 9
      // 04f: lload 1
      // 050: lconst_0
      // 051: lcmp
      // 052: ifle 09b
      // 055: ifne 099
      // 058: goto 066
      // 05b: ldc2_w -6872610810736240040
      // 05e: lload 5
      // 060: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: if_icmplt 0f3
      // 069: goto 077
      // 06c: ldc2_w -6872610810736240040
      // 06f: lload 5
      // 071: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 10
      // 079: bipush 0
      // 07a: invokevirtual java/lang/String.charAt (I)C
      // 07d: sipush 16265
      // 080: ldc2_w 6434495695725415636
      // 083: lload 5
      // 085: lxor
      // 086: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: goto 099
      // 08e: ldc2_w -6872610810736240040
      // 091: lload 5
      // 093: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: iload 9
      // 09b: lload 1
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 0df
      // 0a1: ifne 0dd
      // 0a4: if_icmpne 0f3
      // 0a7: goto 0b5
      // 0aa: ldc2_w -6872610810736240040
      // 0ad: lload 5
      // 0af: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 10
      // 0b7: aload 10
      // 0b9: invokevirtual java/lang/String.length ()I
      // 0bc: bipush 1
      // 0bd: isub
      // 0be: invokevirtual java/lang/String.charAt (I)C
      // 0c1: sipush 6053
      // 0c4: ldc2_w 6981096960212755707
      // 0c7: lload 5
      // 0c9: lxor
      // 0ca: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: goto 0dd
      // 0d2: ldc2_w -6872610810736240040
      // 0d5: lload 5
      // 0d7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: iload 9
      // 0df: ifne 11d
      // 0e2: if_icmpeq 100
      // 0e5: goto 0f3
      // 0e8: ldc2_w -6872610810736240040
      // 0eb: lload 5
      // 0ed: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aconst_null
      // 0f4: areturn
      // 0f5: ldc2_w -6872610810736240040
      // 0f8: lload 5
      // 0fa: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 10
      // 102: invokevirtual java/lang/String.length ()I
      // 105: iload 9
      // 107: iload 3
      // 108: ifge 10f
      // 10b: ifne 121
      // 10e: bipush 2
      // 10f: goto 11d
      // 112: ldc2_w -6872610810736240040
      // 115: lload 5
      // 117: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: if_icmplt 124
      // 120: bipush 1
      // 121: goto 125
      // 124: bipush 0
      // 125: bipush 1
      // 126: anewarray 5
      // 129: dup
      // 12a: bipush 0
      // 12b: new java/lang/StringBuilder
      // 12e: dup
      // 12f: invokespecial java/lang/StringBuilder.<init> ()V
      // 132: ldc "'"
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: aload 10
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: sipush 578
      // 13f: ldc2_w 916692948453443073
      // 142: lload 5
      // 144: lxor
      // 145: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/js.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: aload 0
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: ldc "'"
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 159: aastore
      // 15a: lload 7
      // 15c: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 15f: aload 10
      // 161: bipush 1
      // 162: aload 10
      // 164: sipush 6053
      // 167: ldc2_w 6981096960212755707
      // 16a: lload 5
      // 16c: lxor
      // 16d: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: invokevirtual java/lang/String.indexOf (I)I
      // 175: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 178: astore 10
      // 17a: new java/util/ArrayList
      // 17d: dup
      // 17e: invokespecial java/util/ArrayList.<init> ()V
      // 181: astore 11
      // 183: aload 10
      // 185: invokevirtual java/lang/String.length ()I
      // 188: ifeq 32c
      // 18b: iload 9
      // 18d: lload 1
      // 18e: lconst_0
      // 18f: lcmp
      // 190: iflt 197
      // 193: ifne 337
      // 196: bipush 0
      // 197: istore 12
      // 199: aload 10
      // 19b: iload 12
      // 19d: invokevirtual java/lang/String.charAt (I)C
      // 1a0: sipush 31617
      // 1a3: ldc2_w 5538006060644305113
      // 1a6: lload 5
      // 1a8: lxor
      // 1a9: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: if_icmpne 1d6
      // 1b1: iinc 12 1
      // 1b4: iload 9
      // 1b6: lload 1
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: iflt 1c1
      // 1bc: ifne 27d
      // 1bf: iload 9
      // 1c1: ifeq 199
      // 1c4: iload 3
      // 1c5: ifgt 1b4
      // 1c8: goto 1d6
      // 1cb: ldc2_w -6872610810736240040
      // 1ce: lload 5
      // 1d0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: aload 10
      // 1d8: iload 12
      // 1da: invokevirtual java/lang/String.charAt (I)C
      // 1dd: iload 9
      // 1df: lload 1
      // 1e0: lconst_0
      // 1e1: lcmp
      // 1e2: ifle 1f6
      // 1e5: ifne 27f
      // 1e8: sipush 16554
      // 1eb: ldc2_w 5250257864119792633
      // 1ee: lload 5
      // 1f0: lxor
      // 1f1: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: if_icmpne 27d
      // 1f9: goto 207
      // 1fc: ldc2_w -6872610810736240040
      // 1ff: lload 5
      // 201: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 10
      // 209: sipush 10524
      // 20c: ldc2_w 4177809289133906507
      // 20f: lload 5
      // 211: lxor
      // 212: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: invokevirtual java/lang/String.indexOf (I)I
      // 21a: istore 13
      // 21c: iload 4
      // 21e: iload 9
      // 220: lload 1
      // 221: lconst_0
      // 222: lcmp
      // 223: ifle 23d
      // 226: ifne 23c
      // 229: ifeq 281
      // 22c: goto 23a
      // 22f: ldc2_w -6872610810736240040
      // 232: lload 5
      // 234: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: iload 13
      // 23c: bipush -1
      // 23d: lload 1
      // 23e: lconst_0
      // 23f: lcmp
      // 240: iflt 26d
      // 243: iload 9
      // 245: ifne 26d
      // 248: if_icmpeq 270
      // 24b: goto 259
      // 24e: ldc2_w -6872610810736240040
      // 251: lload 5
      // 253: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: iload 13
      // 25b: iload 12
      // 25d: bipush 1
      // 25e: iadd
      // 25f: goto 26d
      // 262: ldc2_w -6872610810736240040
      // 265: lload 5
      // 267: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: if_icmpne 281
      // 270: aconst_null
      // 271: areturn
      // 272: ldc2_w -6872610810736240040
      // 275: lload 5
      // 277: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: iload 12
      // 27f: istore 13
      // 281: aload 10
      // 283: bipush 0
      // 284: iload 13
      // 286: bipush 1
      // 287: iadd
      // 288: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 28b: astore 14
      // 28d: aload 11
      // 28f: aload 14
      // 291: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 294: pop
      // 295: iload 4
      // 297: iload 9
      // 299: iload 3
      // 29a: ifge 30a
      // 29d: ifne 305
      // 2a0: ifeq 303
      // 2a3: goto 2b1
      // 2a6: ldc2_w -6872610810736240040
      // 2a9: lload 5
      // 2ab: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: aload 14
      // 2b3: invokevirtual java/lang/String.length ()I
      // 2b6: bipush 1
      // 2b7: iload 9
      // 2b9: ifne 30c
      // 2bc: goto 2ca
      // 2bf: ldc2_w -6872610810736240040
      // 2c2: lload 5
      // 2c4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: athrow
      // 2ca: if_icmpne 303
      // 2cd: goto 2db
      // 2d0: ldc2_w -6872610810736240040
      // 2d3: lload 5
      // 2d5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: getstatic com/zelix/js.A Ljava/util/Map;
      // 2de: aload 14
      // 2e0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2e5: ifnonnull 303
      // 2e8: goto 2f6
      // 2eb: ldc2_w -6872610810736240040
      // 2ee: lload 5
      // 2f0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: aconst_null
      // 2f7: areturn
      // 2f8: ldc2_w -6872610810736240040
      // 2fb: lload 5
      // 2fd: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: iload 13
      // 305: aload 10
      // 307: invokevirtual java/lang/String.length ()I
      // 30a: bipush 1
      // 30b: isub
      // 30c: if_icmpne 31c
      // 30f: ldc ""
      // 311: astore 10
      // 313: iload 9
      // 315: iload 3
      // 316: ifge 329
      // 319: ifeq 327
      // 31c: aload 10
      // 31e: iload 13
      // 320: bipush 1
      // 321: iadd
      // 322: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 325: astore 10
      // 327: iload 9
      // 329: ifeq 183
      // 32c: aload 11
      // 32e: invokevirtual java/util/ArrayList.trimToSize ()V
      // 331: lload 1
      // 332: lconst_0
      // 333: lcmp
      // 334: ifle 337
      // 337: aload 11
      // 339: areturn
   }

   public static List I(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = bb ^ var2;
      long var4 = var2 ^ 102471843686405L;
      long var6 = var2 ^ 51759943062325L;
      int var10000 = m44.a<"m">(-940712864259730411L, var2);
      List var9 = A(var1, var6);
      int var8 = var10000;
      int var10 = var9.size();
      int var11 = 0;

      label34:
      while (var11 < var10) {
         String var12 = (String)var9.get(var11);

         do {
            try {
               int var10001 = var8;
               if (var2 >= 0L) {
                  if (var8 != 0) {
                     return var9;
                  }

                  var10001 = var11;
               }

               var9.set(var10001, m44.a<"m">(new Object[]{var12, var4}, -1428243541116703330L, var2));
               var11++;
               if (var8 == 0) {
                  continue label34;
               }
            } catch (n9 var13) {
               throw m44.a<"m">(var13, -871861825156101855L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var9;
   }

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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w -5235537150268943949
      // 01c: lload 2
      // 01d: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 1
      // 025: ldc ","
      // 027: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 02a: iload 4
      // 02c: ifne 0eb
      // 02f: bipush -1
      // 030: if_icmpgt 0dd
      // 033: goto 040
      // 036: ldc2_w -5314020669293622137
      // 039: lload 2
      // 03a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: athrow
      // 040: aload 1
      // 041: sipush 221
      // 044: ldc2_w 2745354008568587604
      // 047: lload 2
      // 048: lxor
      // 049: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: invokevirtual java/lang/String.indexOf (I)I
      // 051: iload 4
      // 053: ifne 0eb
      // 056: goto 063
      // 059: ldc2_w -5314020669293622137
      // 05c: lload 2
      // 05d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: lload 2
      // 064: lconst_0
      // 065: lcmp
      // 066: ifle 0de
      // 069: bipush -1
      // 06a: if_icmpgt 0dd
      // 06d: goto 07a
      // 070: ldc2_w -5314020669293622137
      // 073: lload 2
      // 074: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 1
      // 07b: sipush 20457
      // 07e: ldc2_w 4753173245597362786
      // 081: lload 2
      // 082: lxor
      // 083: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: invokevirtual java/lang/String.indexOf (I)I
      // 08b: iload 4
      // 08d: ifne 0eb
      // 090: goto 09d
      // 093: ldc2_w -5314020669293622137
      // 096: lload 2
      // 097: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: ifle 0de
      // 0a3: bipush -1
      // 0a4: if_icmpgt 0dd
      // 0a7: goto 0b4
      // 0aa: ldc2_w -5314020669293622137
      // 0ad: lload 2
      // 0ae: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 1
      // 0b5: ldc " "
      // 0b7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0ba: iload 4
      // 0bc: ifne 0ed
      // 0bf: goto 0cc
      // 0c2: ldc2_w -5314020669293622137
      // 0c5: lload 2
      // 0c6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: bipush -1
      // 0cd: if_icmple 0ec
      // 0d0: goto 0dd
      // 0d3: ldc2_w -5314020669293622137
      // 0d6: lload 2
      // 0d7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: bipush 0
      // 0de: goto 0eb
      // 0e1: ldc2_w -5314020669293622137
      // 0e4: lload 2
      // 0e5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: ireturn
      // 0ec: bipush 0
      // 0ed: istore 5
      // 0ef: aload 1
      // 0f0: iload 5
      // 0f2: invokevirtual java/lang/String.charAt (I)C
      // 0f5: sipush 31617
      // 0f8: ldc2_w 5537925135791496710
      // 0fb: lload 2
      // 0fc: lxor
      // 0fd: invokedynamic e (IJ)I bsm=com/zelix/js.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: if_icmpne 10d
      // 105: iinc 5 1
      // 108: iload 4
      // 10a: ifeq 0ef
      // 10d: aload 1
      // 10e: iload 5
      // 110: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 113: astore 6
      // 115: aload 6
      // 117: ldc "L"
      // 119: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 11c: lload 2
      // 11d: lconst_0
      // 11e: lcmp
      // 11f: ifle 10a
      // 122: iload 4
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 1a3
      // 12a: ifne 1a1
      // 12d: ifeq 19c
      // 130: goto 13d
      // 133: ldc2_w -5314020669293622137
      // 136: lload 2
      // 137: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 6
      // 13f: ldc ";"
      // 141: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 144: iload 4
      // 146: ifne 19b
      // 149: goto 156
      // 14c: ldc2_w -5314020669293622137
      // 14f: lload 2
      // 150: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: ifne 19a
      // 159: goto 166
      // 15c: ldc2_w -5314020669293622137
      // 15f: lload 2
      // 160: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: aload 6
      // 168: invokevirtual java/lang/String.length ()I
      // 16b: iload 4
      // 16d: ifne 19b
      // 170: goto 17d
      // 173: ldc2_w -5314020669293622137
      // 176: lload 2
      // 177: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: bipush 2
      // 17e: if_icmpgt 19a
      // 181: goto 18e
      // 184: ldc2_w -5314020669293622137
      // 187: lload 2
      // 188: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: bipush 0
      // 18f: ireturn
      // 190: ldc2_w -5314020669293622137
      // 193: lload 2
      // 194: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: bipush 1
      // 19b: ireturn
      // 19c: aload 6
      // 19e: invokevirtual java/lang/String.length ()I
      // 1a1: iload 4
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 1ad
      // 1a9: ifne 1d3
      // 1ac: bipush 1
      // 1ad: if_icmpne 1d2
      // 1b0: goto 1bd
      // 1b3: ldc2_w -5314020669293622137
      // 1b6: lload 2
      // 1b7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: getstatic com/zelix/js.A Ljava/util/Map;
      // 1c0: aload 6
      // 1c2: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1c7: ireturn
      // 1c8: ldc2_w -5314020669293622137
      // 1cb: lload 2
      // 1cc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: bipush 0
      // 1d3: ireturn
   }

   public final String K(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      long var10001 = var2 ^ 57143962660546L;
      int var4 = (int)((var2 ^ 57143962660546L) >>> 32);
      int var5 = (int)((var2 ^ 57143962660546L) << 32 >>> 40);
      int var6 = (int)(var10001 << 56 >>> 56);
      to var10000 = this.l;
      Object[] var10005 = new Object[]{null, null, Integer.valueOf((byte)var6)};
      var10005[1] = var5;
      var10005[0] = var4;
      return m44.a<"t">(var10000, var10005, -1370884532591809284L, var2);
   }

   public static String y(String var0, boolean var1, long var2) {
      var2 = bb ^ var2;
      long var4 = var2 ^ 56043625355094L;
      return u(var0, var1, var4, true);
   }

   public String z(char var1, int var2, short var3) {
      return "";
   }

   int x(long var1) {
      return 1;
   }

   final _f Q(Object[] var1) {
      _f var2 = (_f)var1[0];
      long var3 = (Long)var1[1];
      var3 = bb ^ var3;
      long var5 = var3 ^ 81511918662122L;
      return (_f)m44.a<"p">(this, new Object[]{var5, var2}, 267614859851092470L, var3);
   }

   public js(int var1, to var2) {
      this.t = var1;
      this.l = var2;
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = bb ^ 79254344706005L;
      long var4 = var2 ^ 4207957770607L;
      return this.H((js)var1, var4);
   }

   public final _v I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = bb ^ var2;
      return m44.a<"v">(this.l, new Object[0], -8888994015646534892L, var2);
   }

   public static List a(long param0, xb param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/js.bb J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: lload 0
      // 007: dup2
      // 008: ldc2_w 133592282720204
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -8788567752032657172
      // 011: lload 0
      // 012: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: aload 2
      // 018: invokevirtual com/zelix/xb.X ()Ljava/lang/String;
      // 01b: lload 3
      // 01c: invokestatic com/zelix/js.A (Ljava/lang/String;J)Ljava/util/List;
      // 01f: astore 6
      // 021: aload 6
      // 023: invokeinterface java/util/List.size ()I 1
      // 028: istore 7
      // 02a: bipush 0
      // 02b: istore 8
      // 02d: istore 5
      // 02f: iload 8
      // 031: iload 7
      // 033: if_icmpge 119
      // 036: aload 6
      // 038: iload 5
      // 03a: lload 0
      // 03b: lconst_0
      // 03c: lcmp
      // 03d: ifle 045
      // 040: ifne 11b
      // 043: iload 8
      // 045: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04a: checkcast java/lang/String
      // 04d: astore 9
      // 04f: aload 9
      // 051: iload 5
      // 053: ifne 110
      // 056: ldc "B"
      // 058: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05b: ifne 0f8
      // 05e: goto 06b
      // 061: ldc2_w -8710013522813927976
      // 064: lload 0
      // 065: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 9
      // 06d: iload 5
      // 06f: ifne 110
      // 072: goto 07f
      // 075: ldc2_w -8710013522813927976
      // 078: lload 0
      // 079: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: lload 0
      // 080: lconst_0
      // 081: lcmp
      // 082: ifle 103
      // 085: ldc "C"
      // 087: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08a: ifne 0f8
      // 08d: goto 09a
      // 090: ldc2_w -8710013522813927976
      // 093: lload 0
      // 094: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 9
      // 09c: iload 5
      // 09e: ifne 110
      // 0a1: goto 0ae
      // 0a4: ldc2_w -8710013522813927976
      // 0a7: lload 0
      // 0a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: lload 0
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 103
      // 0b4: ldc "S"
      // 0b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b9: ifne 0f8
      // 0bc: goto 0c9
      // 0bf: ldc2_w -8710013522813927976
      // 0c2: lload 0
      // 0c3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 9
      // 0cb: iload 5
      // 0cd: ifne 110
      // 0d0: goto 0dd
      // 0d3: ldc2_w -8710013522813927976
      // 0d6: lload 0
      // 0d7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: ldc "Z"
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: lload 0
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 116
      // 0e8: ifeq 111
      // 0eb: goto 0f8
      // 0ee: ldc2_w -8710013522813927976
      // 0f1: lload 0
      // 0f2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 6
      // 0fa: iload 8
      // 0fc: ldc "I"
      // 0fe: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 103: goto 110
      // 106: ldc2_w -8710013522813927976
      // 109: lload 0
      // 10a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: pop
      // 111: iinc 8 1
      // 114: iload 5
      // 116: ifeq 02f
      // 119: aload 6
      // 11b: areturn
   }

   public String J(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 17211076579607L;
      int var4 = (int)((var2 ^ 17211076579607L) >>> 48);
      int var5 = (int)((var2 ^ 17211076579607L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return m44.a<"u">(this, (char)var4, var5, (short)var6, -418172743230440951L, var2);
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static String L(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = bb ^ var2;
      return (String)m44.a<"l">(4651606526149830615L, var2).get(var1);
   }

   public static List i(Object[] param0) {
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
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/js.bb J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 106930222738084
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 122933926339809
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 69478670443154
      // 02c: lxor
      // 02d: lstore 8
      // 02f: dup2
      // 030: ldc2_w 7831326256665
      // 033: lxor
      // 034: lstore 10
      // 036: pop2
      // 037: ldc2_w 8432847776935521400
      // 03a: lload 1
      // 03b: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: new java/util/ArrayList
      // 043: dup
      // 044: invokespecial java/util/ArrayList.<init> ()V
      // 047: astore 13
      // 049: istore 12
      // 04b: aload 3
      // 04c: lload 4
      // 04e: bipush 2
      // 04f: anewarray 583
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w 7692118946927634380
      // 063: lload 1
      // 064: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: astore 14
      // 06b: bipush 0
      // 06c: istore 15
      // 06e: iload 15
      // 070: aload 14
      // 072: invokeinterface java/util/List.size ()I 1
      // 077: if_icmpge 148
      // 07a: aload 14
      // 07c: iload 15
      // 07e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 083: checkcast java/lang/String
      // 086: astore 16
      // 088: lload 10
      // 08a: aload 16
      // 08c: bipush 2
      // 08d: anewarray 583
      // 090: dup_x1
      // 091: swap
      // 092: bipush 1
      // 093: swap
      // 094: aastore
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: ldc2_w 8397734524324899990
      // 0a1: lload 1
      // 0a2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: astore 17
      // 0a9: iload 12
      // 0ab: lload 1
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: iflt 145
      // 0b1: ifeq 143
      // 0b4: aload 17
      // 0b6: ifnull 140
      // 0b9: goto 0c6
      // 0bc: ldc2_w 7699992322458406940
      // 0bf: lload 1
      // 0c0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 17
      // 0c8: lload 6
      // 0ca: invokevirtual com/zelix/_v.N (J)Z
      // 0cd: iload 12
      // 0cf: ifeq 13f
      // 0d2: goto 0df
      // 0d5: ldc2_w 7699992322458406940
      // 0d8: lload 1
      // 0d9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: lload 1
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: ifle 132
      // 0e5: ifeq 129
      // 0e8: goto 0f5
      // 0eb: ldc2_w 7699992322458406940
      // 0ee: lload 1
      // 0ef: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 13
      // 0f7: aload 17
      // 0f9: lload 8
      // 0fb: bipush 1
      // 0fc: anewarray 583
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w 7772218015350682498
      // 10b: lload 1
      // 10c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 116: pop
      // 117: iload 12
      // 119: ifne 140
      // 11c: goto 129
      // 11f: ldc2_w 7699992322458406940
      // 122: lload 1
      // 123: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 13
      // 12b: aload 17
      // 12d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 132: goto 13f
      // 135: ldc2_w 7699992322458406940
      // 138: lload 1
      // 139: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: pop
      // 140: iinc 15 1
      // 143: iload 12
      // 145: ifne 06e
      // 148: aload 13
      // 14a: lload 1
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: iflt 083
      // 150: areturn
   }

   public static String Z(String var0) {
      return var0.substring(var0.indexOf(")") + 1);
   }

   private static n9 c(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29055;
      if (fb[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])gb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               gb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/js", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = eb[var5].getBytes("ISO-8859-1");
         fb[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return fb[var5];
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
         throw new RuntimeException("com/zelix/js" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18026;
      if (ob[var3] == null) {
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
         long var5 = nb[var3];
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
         Object[] var9 = (Object[])pb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               pb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/js", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ob[var3] = var15;
      }

      return ob[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/js" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
