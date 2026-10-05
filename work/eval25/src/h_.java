package com.zelix;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h_ extends h4 {
   private int d;
   private bv[] o;
   private int j;
   private int m;
   private int e;
   private be O;
   private h4[] D;
   private static final long a = ess.a(-6337382149530155298L, -462569788241503097L, MethodHandles.lookup().lookupClass()).a(202891109012698L);
   private static final String[] b;
   private static final String[] f;
   private static final Map g = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map n;

   bv[] A() {
      return this.o;
   }

   void n(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 121787894211494L;
      x44.a<"h">(this.O, new Object[]{var4, var5}, 6086433918317261856L, var2);
   }

   void k(Object[] param1) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/we
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Integer
      // 017: invokevirtual java/lang/Integer.intValue ()I
      // 01a: istore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Integer
      // 021: invokevirtual java/lang/Integer.intValue ()I
      // 024: istore 8
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/Integer
      // 02c: invokevirtual java/lang/Integer.intValue ()I
      // 02f: istore 3
      // 030: dup
      // 031: bipush 5
      // 032: aaload
      // 033: checkcast com/zelix/_8c
      // 036: astore 4
      // 038: dup
      // 039: bipush 6
      // 03b: aaload
      // 03c: checkcast java/util/List
      // 03f: astore 7
      // 041: pop
      // 042: iload 2
      // 043: i2l
      // 044: bipush 48
      // 046: lshl
      // 047: iload 8
      // 049: i2l
      // 04a: bipush 48
      // 04c: lshl
      // 04d: bipush 16
      // 04f: lushr
      // 050: lor
      // 051: iload 3
      // 052: i2l
      // 053: bipush 32
      // 055: lshl
      // 056: bipush 32
      // 058: lushr
      // 059: lor
      // 05a: getstatic com/zelix/h_.a J
      // 05d: lxor
      // 05e: lstore 9
      // 060: lload 9
      // 062: dup2
      // 063: ldc2_w 137140256282310
      // 066: lxor
      // 067: lstore 11
      // 069: dup2
      // 06a: ldc2_w 90916939260930
      // 06d: lxor
      // 06e: lstore 13
      // 070: dup2
      // 071: ldc2_w 105770798580517
      // 074: lxor
      // 075: lstore 15
      // 077: dup2
      // 078: ldc2_w 92090551089518
      // 07b: lxor
      // 07c: lstore 17
      // 07e: dup2
      // 07f: ldc2_w 53548545561981
      // 082: lxor
      // 083: dup2
      // 084: bipush 48
      // 086: lushr
      // 087: l2i
      // 088: istore 19
      // 08a: dup2
      // 08b: bipush 16
      // 08d: lshl
      // 08e: bipush 48
      // 090: lushr
      // 091: l2i
      // 092: istore 20
      // 094: dup2
      // 095: bipush 32
      // 097: lshl
      // 098: bipush 32
      // 09a: lushr
      // 09b: l2i
      // 09c: istore 21
      // 09e: pop2
      // 09f: dup2
      // 0a0: ldc2_w 4680885900891
      // 0a3: lxor
      // 0a4: lstore 22
      // 0a6: dup2
      // 0a7: ldc2_w 63551234311128
      // 0aa: lxor
      // 0ab: lstore 24
      // 0ad: dup2
      // 0ae: ldc2_w 107222189706044
      // 0b1: lxor
      // 0b2: lstore 26
      // 0b4: dup2
      // 0b5: ldc2_w 51902593190109
      // 0b8: lxor
      // 0b9: lstore 28
      // 0bb: dup2
      // 0bc: ldc2_w 93600359255465
      // 0bf: lxor
      // 0c0: lstore 30
      // 0c2: dup2
      // 0c3: ldc2_w 116601968480295
      // 0c6: lxor
      // 0c7: dup2
      // 0c8: bipush 32
      // 0ca: lushr
      // 0cb: l2i
      // 0cc: istore 32
      // 0ce: dup2
      // 0cf: bipush 32
      // 0d1: lshl
      // 0d2: bipush 48
      // 0d4: lushr
      // 0d5: l2i
      // 0d6: istore 33
      // 0d8: dup2
      // 0d9: bipush 48
      // 0db: lshl
      // 0dc: bipush 48
      // 0de: lushr
      // 0df: l2i
      // 0e0: istore 34
      // 0e2: pop2
      // 0e3: dup2
      // 0e4: ldc2_w 164562053180
      // 0e7: lxor
      // 0e8: lstore 35
      // 0ea: pop2
      // 0eb: ldc2_w 3195263308602742803
      // 0ee: lload 9
      // 0f0: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: istore 37
      // 0f7: aload 0
      // 0f8: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0fb: iload 37
      // 0fd: ifne 123
      // 100: ifnull 5c1
      // 103: goto 111
      // 106: ldc2_w 3170864317529610981
      // 109: lload 9
      // 10b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: getfield com/zelix/h_.O Lcom/zelix/be;
      // 115: goto 123
      // 118: ldc2_w 3170864317529610981
      // 11b: lload 9
      // 11d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: iload 32
      // 125: iload 33
      // 127: aload 6
      // 129: aload 5
      // 12b: bipush 1
      // 12c: iload 34
      // 12e: i2s
      // 12f: invokevirtual com/zelix/be.N (IILcom/zelix/_fm;Lcom/zelix/we;ZS)Lcom/zelix/yg;
      // 132: astore 38
      // 134: aload 38
      // 136: lload 24
      // 138: bipush 1
      // 139: anewarray 709
      // 13c: dup_x2
      // 13d: dup_x2
      // 13e: pop
      // 13f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 142: bipush 0
      // 143: swap
      // 144: aastore
      // 145: ldc2_w 3509145139972149938
      // 148: lload 9
      // 14a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: iload 8
      // 151: ifle 1b6
      // 154: iload 37
      // 156: ifne 1b6
      // 159: ifne 191
      // 15c: goto 16a
      // 15f: ldc2_w 3170864317529610981
      // 162: lload 9
      // 164: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield com/zelix/h_.O Lcom/zelix/be;
      // 16e: bipush 0
      // 16f: bipush 1
      // 170: anewarray 709
      // 173: dup_x1
      // 174: swap
      // 175: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 178: bipush 0
      // 179: swap
      // 17a: aastore
      // 17b: ldc2_w 3617628313746480388
      // 17e: lload 9
      // 180: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: return
      // 186: ldc2_w 3170864317529610981
      // 189: lload 9
      // 18b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aload 0
      // 192: iload 37
      // 194: ifne 1e5
      // 197: getfield com/zelix/h_.O Lcom/zelix/be;
      // 19a: bipush 0
      // 19b: anewarray 709
      // 19e: ldc2_w 3499214526627549939
      // 1a1: lload 9
      // 1a3: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: goto 1b6
      // 1ab: ldc2_w 3170864317529610981
      // 1ae: lload 9
      // 1b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: iload 2
      // 1b7: iflt 1c7
      // 1ba: ifne 1e4
      // 1bd: ldc2_w 4025107242484253498
      // 1c0: lload 9
      // 1c2: invokedynamic h (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: ifne 1e4
      // 1ca: goto 1d8
      // 1cd: ldc2_w 3170864317529610981
      // 1d0: lload 9
      // 1d2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: return
      // 1d9: ldc2_w 3170864317529610981
      // 1dc: lload 9
      // 1de: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: lload 26
      // 1e7: bipush 1
      // 1e8: anewarray 709
      // 1eb: dup_x2
      // 1ec: dup_x2
      // 1ed: pop
      // 1ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w 3518236620418219217
      // 1f7: lload 9
      // 1f9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/h7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: astore 39
      // 200: aload 39
      // 202: iload 37
      // 204: iload 2
      // 205: iflt 21f
      // 208: ifne 21e
      // 20b: ifnull 2a2
      // 20e: goto 21c
      // 211: ldc2_w 3170864317529610981
      // 214: lload 9
      // 216: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: aload 39
      // 21e: bipush 0
      // 21f: anewarray 709
      // 222: ldc2_w 3284834188749624533
      // 225: lload 9
      // 227: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: astore 41
      // 22e: new com/zelix/_8l
      // 231: dup
      // 232: iload 19
      // 234: i2s
      // 235: sipush 9913
      // 238: ldc2_w 4437637512237311989
      // 23b: lload 9
      // 23d: lxor
      // 23e: invokedynamic o (IJ)I bsm=com/zelix/h_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: iload 20
      // 245: i2s
      // 246: iload 21
      // 248: invokespecial com/zelix/_8l.<init> (SISI)V
      // 24b: astore 42
      // 24d: aload 39
      // 24f: lload 11
      // 251: aload 42
      // 253: ldc2_w 3558950534241312866
      // 256: lload 9
      // 258: invokedynamic i (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: aload 42
      // 25f: lload 15
      // 261: bipush 1
      // 262: anewarray 709
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 0
      // 26c: swap
      // 26d: aastore
      // 26e: ldc2_w 3709373360487089918
      // 271: lload 9
      // 273: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: lload 17
      // 27a: bipush 2
      // 27b: anewarray 709
      // 27e: dup_x2
      // 27f: dup_x2
      // 280: pop
      // 281: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 284: bipush 1
      // 285: swap
      // 286: aastore
      // 287: dup_x1
      // 288: swap
      // 289: bipush 0
      // 28a: swap
      // 28b: aastore
      // 28c: ldc2_w 3990000528176864516
      // 28f: lload 9
      // 291: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: astore 40
      // 298: iload 8
      // 29a: ifle 2b9
      // 29d: iload 37
      // 29f: ifeq 2c5
      // 2a2: aload 4
      // 2a4: sipush 8865
      // 2a7: ldc2_w 2892616572555104413
      // 2aa: lload 9
      // 2ac: lxor
      // 2ad: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: aload 7
      // 2b4: invokevirtual com/zelix/_8c.Y (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/mx;
      // 2b7: astore 41
      // 2b9: ldc2_w 3727571640393273032
      // 2bc: lload 9
      // 2be: invokedynamic h (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: astore 40
      // 2c5: new com/zelix/h7
      // 2c8: dup
      // 2c9: aload 0
      // 2ca: lload 13
      // 2cc: aload 41
      // 2ce: bipush 0
      // 2cf: invokespecial com/zelix/h7.<init> (Lcom/zelix/h8;JLcom/zelix/mx;I)V
      // 2d2: astore 42
      // 2d4: ldc2_w 3564468547601434227
      // 2d7: lload 9
      // 2d9: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: ldc "1"
      // 2e0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e3: iload 37
      // 2e5: ifne 362
      // 2e8: ifeq 345
      // 2eb: goto 2f9
      // 2ee: ldc2_w 3170864317529610981
      // 2f1: lload 9
      // 2f3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: athrow
      // 2f9: aload 38
      // 2fb: aload 42
      // 2fd: aload 4
      // 2ff: lload 28
      // 301: aload 40
      // 303: aload 7
      // 305: bipush 0
      // 306: bipush 6
      // 308: anewarray 709
      // 30b: dup_x1
      // 30c: swap
      // 30d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 310: bipush 5
      // 311: swap
      // 312: aastore
      // 313: dup_x1
      // 314: swap
      // 315: bipush 4
      // 316: swap
      // 317: aastore
      // 318: dup_x1
      // 319: swap
      // 31a: bipush 3
      // 31b: swap
      // 31c: aastore
      // 31d: dup_x2
      // 31e: dup_x2
      // 31f: pop
      // 320: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 323: bipush 2
      // 324: swap
      // 325: aastore
      // 326: dup_x1
      // 327: swap
      // 328: bipush 1
      // 329: swap
      // 32a: aastore
      // 32b: dup_x1
      // 32c: swap
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: ldc2_w 2969213709468987580
      // 333: lload 9
      // 335: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: astore 43
      // 33c: iload 3
      // 33d: ifle 4ca
      // 340: iload 37
      // 342: ifeq 4b3
      // 345: ldc2_w 3564468547601434227
      // 348: lload 9
      // 34a: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34f: ldc "2"
      // 351: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 354: goto 362
      // 357: ldc2_w 3170864317529610981
      // 35a: lload 9
      // 35c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: ifeq 3b2
      // 365: aload 38
      // 367: aload 42
      // 369: aload 4
      // 36b: lload 28
      // 36d: aload 40
      // 36f: aload 7
      // 371: bipush 1
      // 372: bipush 6
      // 374: anewarray 709
      // 377: dup_x1
      // 378: swap
      // 379: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37c: bipush 5
      // 37d: swap
      // 37e: aastore
      // 37f: dup_x1
      // 380: swap
      // 381: bipush 4
      // 382: swap
      // 383: aastore
      // 384: dup_x1
      // 385: swap
      // 386: bipush 3
      // 387: swap
      // 388: aastore
      // 389: dup_x2
      // 38a: dup_x2
      // 38b: pop
      // 38c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38f: bipush 2
      // 390: swap
      // 391: aastore
      // 392: dup_x1
      // 393: swap
      // 394: bipush 1
      // 395: swap
      // 396: aastore
      // 397: dup_x1
      // 398: swap
      // 399: bipush 0
      // 39a: swap
      // 39b: aastore
      // 39c: ldc2_w 2969213709468987580
      // 39f: lload 9
      // 3a1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: astore 43
      // 3a8: iload 8
      // 3aa: ifle 4ca
      // 3ad: iload 37
      // 3af: ifeq 4b3
      // 3b2: aload 38
      // 3b4: aload 42
      // 3b6: aload 4
      // 3b8: lload 28
      // 3ba: aload 40
      // 3bc: aload 7
      // 3be: bipush 0
      // 3bf: bipush 6
      // 3c1: anewarray 709
      // 3c4: dup_x1
      // 3c5: swap
      // 3c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3c9: bipush 5
      // 3ca: swap
      // 3cb: aastore
      // 3cc: dup_x1
      // 3cd: swap
      // 3ce: bipush 4
      // 3cf: swap
      // 3d0: aastore
      // 3d1: dup_x1
      // 3d2: swap
      // 3d3: bipush 3
      // 3d4: swap
      // 3d5: aastore
      // 3d6: dup_x2
      // 3d7: dup_x2
      // 3d8: pop
      // 3d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dc: bipush 2
      // 3dd: swap
      // 3de: aastore
      // 3df: dup_x1
      // 3e0: swap
      // 3e1: bipush 1
      // 3e2: swap
      // 3e3: aastore
      // 3e4: dup_x1
      // 3e5: swap
      // 3e6: bipush 0
      // 3e7: swap
      // 3e8: aastore
      // 3e9: ldc2_w 2969213709468987580
      // 3ec: lload 9
      // 3ee: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: astore 44
      // 3f5: aload 38
      // 3f7: aload 42
      // 3f9: aload 4
      // 3fb: lload 28
      // 3fd: aload 40
      // 3ff: aload 7
      // 401: bipush 1
      // 402: bipush 6
      // 404: anewarray 709
      // 407: dup_x1
      // 408: swap
      // 409: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 40c: bipush 5
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x1
      // 410: swap
      // 411: bipush 4
      // 412: swap
      // 413: aastore
      // 414: dup_x1
      // 415: swap
      // 416: bipush 3
      // 417: swap
      // 418: aastore
      // 419: dup_x2
      // 41a: dup_x2
      // 41b: pop
      // 41c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41f: bipush 2
      // 420: swap
      // 421: aastore
      // 422: dup_x1
      // 423: swap
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x1
      // 428: swap
      // 429: bipush 0
      // 42a: swap
      // 42b: aastore
      // 42c: ldc2_w 2969213709468987580
      // 42f: lload 9
      // 431: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: astore 45
      // 438: aload 45
      // 43a: iload 3
      // 43b: ifle 459
      // 43e: iload 37
      // 440: ifne 4b1
      // 443: lload 30
      // 445: dup2_x1
      // 446: pop2
      // 447: bipush 2
      // 448: anewarray 709
      // 44b: dup_x1
      // 44c: swap
      // 44d: bipush 1
      // 44e: swap
      // 44f: aastore
      // 450: dup_x2
      // 451: dup_x2
      // 452: pop
      // 453: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 456: bipush 0
      // 457: swap
      // 458: aastore
      // 459: ldc2_w 3105029880146505053
      // 45c: lload 9
      // 45e: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: lload 30
      // 465: aload 44
      // 467: bipush 2
      // 468: anewarray 709
      // 46b: dup_x1
      // 46c: swap
      // 46d: bipush 1
      // 46e: swap
      // 46f: aastore
      // 470: dup_x2
      // 471: dup_x2
      // 472: pop
      // 473: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 476: bipush 0
      // 477: swap
      // 478: aastore
      // 479: ldc2_w 3105029880146505053
      // 47c: lload 9
      // 47e: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 483: if_icmpge 4a1
      // 486: goto 494
      // 489: ldc2_w 3170864317529610981
      // 48c: lload 9
      // 48e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: athrow
      // 494: aload 45
      // 496: astore 43
      // 498: iload 2
      // 499: iflt 4ca
      // 49c: iload 37
      // 49e: ifeq 4b3
      // 4a1: aload 44
      // 4a3: goto 4b1
      // 4a6: ldc2_w 3170864317529610981
      // 4a9: lload 9
      // 4ab: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: athrow
      // 4b1: astore 43
      // 4b3: aload 42
      // 4b5: aload 43
      // 4b7: bipush 1
      // 4b8: anewarray 709
      // 4bb: dup_x1
      // 4bc: swap
      // 4bd: bipush 0
      // 4be: swap
      // 4bf: aastore
      // 4c0: ldc2_w 3451374873177476345
      // 4c3: lload 9
      // 4c5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: aload 39
      // 4cc: iload 37
      // 4ce: iload 8
      // 4d0: iflt 527
      // 4d3: ifne 526
      // 4d6: ifnull 516
      // 4d9: goto 4e7
      // 4dc: ldc2_w 3170864317529610981
      // 4df: lload 9
      // 4e1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e6: athrow
      // 4e7: aload 0
      // 4e8: lload 35
      // 4ea: bipush 1
      // 4eb: anewarray 709
      // 4ee: dup_x2
      // 4ef: dup_x2
      // 4f0: pop
      // 4f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f4: bipush 0
      // 4f5: swap
      // 4f6: aastore
      // 4f7: ldc2_w 3318859998842238334
      // 4fa: lload 9
      // 4fc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: istore 44
      // 503: aload 0
      // 504: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 507: iload 44
      // 509: aload 42
      // 50b: aastore
      // 50c: iload 8
      // 50e: iflt 5a6
      // 511: iload 37
      // 513: ifeq 58b
      // 516: aload 42
      // 518: goto 526
      // 51b: ldc2_w 3170864317529610981
      // 51e: lload 9
      // 520: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 525: athrow
      // 526: bipush 0
      // 527: anewarray 709
      // 52a: ldc2_w 3482550173424831127
      // 52d: lload 9
      // 52f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 534: iload 37
      // 536: ifne 55e
      // 539: ifle 58b
      // 53c: goto 54a
      // 53f: ldc2_w 3170864317529610981
      // 542: lload 9
      // 544: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 549: athrow
      // 54a: aload 0
      // 54b: getfield com/zelix/h_.m I
      // 54e: bipush 1
      // 54f: iadd
      // 550: goto 55e
      // 553: ldc2_w 3170864317529610981
      // 556: lload 9
      // 558: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55d: athrow
      // 55e: anewarray 259
      // 561: astore 44
      // 563: aload 0
      // 564: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 567: bipush 0
      // 568: aload 44
      // 56a: bipush 0
      // 56b: aload 0
      // 56c: getfield com/zelix/h_.m I
      // 56f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 572: aload 44
      // 574: aload 0
      // 575: getfield com/zelix/h_.m I
      // 578: aload 42
      // 57a: aastore
      // 57b: aload 0
      // 57c: aload 44
      // 57e: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 581: aload 0
      // 582: dup
      // 583: getfield com/zelix/h_.m I
      // 586: bipush 1
      // 587: iadd
      // 588: putfield com/zelix/h_.m I
      // 58b: aload 0
      // 58c: getfield com/zelix/h_.O Lcom/zelix/be;
      // 58f: bipush 0
      // 590: bipush 1
      // 591: anewarray 709
      // 594: dup_x1
      // 595: swap
      // 596: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 599: bipush 0
      // 59a: swap
      // 59b: aastore
      // 59c: ldc2_w 3617628313746480388
      // 59f: lload 9
      // 5a1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a6: aload 38
      // 5a8: lload 22
      // 5aa: bipush 1
      // 5ab: anewarray 709
      // 5ae: dup_x2
      // 5af: dup_x2
      // 5b0: pop
      // 5b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b4: bipush 0
      // 5b5: swap
      // 5b6: aastore
      // 5b7: ldc2_w 3554175760009172224
      // 5ba: lload 9
      // 5bc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: return
   }

   h7 H(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -2382524879351780693
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifne 63
      // 36: instanceof com/zelix/h7
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w -2397773752373893027
      // 48: lload 2
      // 49: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w -2397773752373893027
      // 5c: lload 2
      // 5d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/h7
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifeq 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: iflt 2a
      // 75: aconst_null
      // 76: areturn
   }

   public int[] D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 75884427049244L;
      long var6 = var2 ^ 95662366377763L;
      boolean var10000 = x44.a<"t">(3838652715336992047L, var2);
      hh var9 = x44.a<"l">(this, new Object[]{var4}, 3783415931848163056L, var2);
      boolean var8 = var10000;

      try {
         if (!var8) {
            return x44.a<"l">(var9, new Object[]{var6}, 3494838422252769294L, var2);
         }

         if (var9 == null) {
            return new int[0];
         }
      } catch (g3 var10) {
         throw x44.a<"t">(var10, 2910514467246333568L, var2);
      }

      return x44.a<"l">(var9, new Object[]{var6}, 3494838422252769294L, var2);
   }

   int M(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      long var5 = ((long)var4 << 32 | var2 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 109297377444088L;
      return x44.a<"m">(this.O, new Object[]{var7}, -1583260171838286374L, var5);
   }

   protected void j(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Map
      // 01a: astore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 3
      // 022: pop
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 0
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 113923369132373
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 127792143372358
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 72722979724699
      // 03e: lxor
      // 03f: lstore 13
      // 041: dup2
      // 042: ldc2_w 139794604487682
      // 045: lxor
      // 046: lstore 15
      // 048: dup2
      // 049: ldc2_w 113719335739804
      // 04c: lxor
      // 04d: lstore 17
      // 04f: dup2
      // 050: ldc2_w 135857754914273
      // 053: lxor
      // 054: lstore 19
      // 056: dup2
      // 057: ldc2_w 30694266361946
      // 05a: lxor
      // 05b: lstore 21
      // 05d: pop2
      // 05e: aload 0
      // 05f: aload 6
      // 061: lload 7
      // 063: aload 2
      // 064: aload 3
      // 065: bipush 4
      // 066: anewarray 709
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 3
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: bipush 2
      // 071: swap
      // 072: aastore
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
      // 081: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 084: aload 6
      // 086: aload 0
      // 087: getfield com/zelix/h_.e I
      // 08a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 08d: aload 6
      // 08f: aload 0
      // 090: getfield com/zelix/h_.j I
      // 093: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 096: ldc2_w -3921248847547794946
      // 099: lload 4
      // 09b: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: aload 0
      // 0a1: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0a4: lload 13
      // 0a6: aload 6
      // 0a8: aload 2
      // 0a9: bipush 3
      // 0aa: anewarray 709
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: bipush 2
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x2
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w -3341248352122359670
      // 0c3: lload 4
      // 0c5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: aload 6
      // 0cc: aload 0
      // 0cd: getfield com/zelix/h_.d I
      // 0d0: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0d3: istore 23
      // 0d5: bipush 0
      // 0d6: istore 24
      // 0d8: iload 24
      // 0da: aload 0
      // 0db: getfield com/zelix/h_.d I
      // 0de: if_icmpge 119
      // 0e1: aload 0
      // 0e2: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0e5: iload 24
      // 0e7: aaload
      // 0e8: aload 6
      // 0ea: aload 2
      // 0eb: lload 19
      // 0ed: invokevirtual com/zelix/bv.U (Ljava/io/DataOutputStream;Ljava/util/Map;J)V
      // 0f0: iinc 24 1
      // 0f3: iload 23
      // 0f5: lload 4
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 123
      // 0fc: ifeq 122
      // 0ff: iload 23
      // 101: ifne 0d8
      // 104: lload 4
      // 106: lconst_0
      // 107: lcmp
      // 108: iflt 0f3
      // 10b: goto 119
      // 10e: ldc2_w -3119455498855079343
      // 111: lload 4
      // 113: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 6
      // 11b: aload 0
      // 11c: getfield com/zelix/h_.m I
      // 11f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 122: bipush 0
      // 123: istore 24
      // 125: iload 24
      // 127: aload 0
      // 128: getfield com/zelix/h_.m I
      // 12b: if_icmpge 344
      // 12e: aload 0
      // 12f: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 132: iload 24
      // 134: aaload
      // 135: iload 23
      // 137: ifeq 310
      // 13a: instanceof com/zelix/bb
      // 13d: ifeq 309
      // 140: goto 14e
      // 143: ldc2_w -3119455498855079343
      // 146: lload 4
      // 148: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: lload 4
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 33f
      // 155: aload 0
      // 156: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 159: iload 24
      // 15b: aaload
      // 15c: iload 23
      // 15e: ifeq 310
      // 161: goto 16f
      // 164: ldc2_w -3119455498855079343
      // 167: lload 4
      // 169: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: lload 21
      // 171: invokevirtual com/zelix/h4.x (J)I
      // 174: ifle 309
      // 177: goto 185
      // 17a: ldc2_w -3119455498855079343
      // 17d: lload 4
      // 17f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: aload 0
      // 186: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 189: iload 24
      // 18b: aaload
      // 18c: checkcast com/zelix/bb
      // 18f: astore 25
      // 191: iload 23
      // 193: lload 4
      // 195: lconst_0
      // 196: lcmp
      // 197: ifle 23e
      // 19a: ifeq 235
      // 19d: aload 25
      // 19f: lload 15
      // 1a1: bipush 1
      // 1a2: anewarray 709
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w -3696334501150176749
      // 1b1: lload 4
      // 1b3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: ifeq 241
      // 1bb: goto 1c9
      // 1be: ldc2_w -3119455498855079343
      // 1c1: lload 4
      // 1c3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 3
      // 1ca: new java/lang/StringBuilder
      // 1cd: dup
      // 1ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d1: sipush 25182
      // 1d4: ldc2_w 3652732217140357333
      // 1d7: lload 4
      // 1d9: lxor
      // 1da: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: aload 25
      // 1e4: bipush 0
      // 1e5: anewarray 709
      // 1e8: ldc2_w -3985045151528814074
      // 1eb: lload 4
      // 1ed: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f5: sipush 26749
      // 1f8: ldc2_w 6895789580682371811
      // 1fb: lload 4
      // 1fd: lxor
      // 1fe: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 206: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 209: lload 9
      // 20b: bipush 2
      // 20c: anewarray 709
      // 20f: dup_x2
      // 210: dup_x2
      // 211: pop
      // 212: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 215: bipush 1
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: bipush 0
      // 21b: swap
      // 21c: aastore
      // 21d: ldc2_w -4004799434657204672
      // 220: lload 4
      // 222: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: goto 235
      // 22a: ldc2_w -3119455498855079343
      // 22d: lload 4
      // 22f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: lload 4
      // 237: lconst_0
      // 238: lcmp
      // 239: iflt 2fb
      // 23c: iload 23
      // 23e: ifne 309
      // 241: aload 3
      // 242: new java/lang/StringBuilder
      // 245: dup
      // 246: invokespecial java/lang/StringBuilder.<init> ()V
      // 249: sipush 9799
      // 24c: ldc2_w 3675516265655200979
      // 24f: lload 4
      // 251: lxor
      // 252: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25a: aload 0
      // 25b: lload 17
      // 25d: bipush 1
      // 25e: anewarray 709
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 0
      // 268: swap
      // 269: aastore
      // 26a: ldc2_w -3485300443724361225
      // 26d: lload 4
      // 26f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: sipush 19265
      // 27a: ldc2_w 2982277859587654107
      // 27d: lload 4
      // 27f: lxor
      // 280: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 288: aload 0
      // 289: lload 11
      // 28b: bipush 1
      // 28c: anewarray 709
      // 28f: dup_x2
      // 290: dup_x2
      // 291: pop
      // 292: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 295: bipush 0
      // 296: swap
      // 297: aastore
      // 298: ldc2_w -3138053621086453035
      // 29b: lload 4
      // 29d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a5: sipush 13403
      // 2a8: ldc2_w 3060713605588713159
      // 2ab: lload 4
      // 2ad: lxor
      // 2ae: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b6: aload 25
      // 2b8: bipush 0
      // 2b9: anewarray 709
      // 2bc: ldc2_w -3985045151528814074
      // 2bf: lload 4
      // 2c1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c9: sipush 13927
      // 2cc: ldc2_w 8781125473292483819
      // 2cf: lload 4
      // 2d1: lxor
      // 2d2: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2dd: lload 9
      // 2df: bipush 2
      // 2e0: anewarray 709
      // 2e3: dup_x2
      // 2e4: dup_x2
      // 2e5: pop
      // 2e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e9: bipush 1
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: bipush 0
      // 2ef: swap
      // 2f0: aastore
      // 2f1: ldc2_w -4004799434657204672
      // 2f4: lload 4
      // 2f6: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: goto 309
      // 2fe: ldc2_w -3119455498855079343
      // 301: lload 4
      // 303: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: aload 0
      // 30a: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 30d: iload 24
      // 30f: aaload
      // 310: aload 6
      // 312: lload 7
      // 314: aload 2
      // 315: aload 3
      // 316: bipush 4
      // 317: anewarray 709
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 3
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 2
      // 322: swap
      // 323: aastore
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 1
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x1
      // 32e: swap
      // 32f: bipush 0
      // 330: swap
      // 331: aastore
      // 332: ldc2_w -3429333663311609397
      // 335: lload 4
      // 337: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: iinc 24 1
      // 33f: iload 23
      // 341: ifne 125
      // 344: lload 4
      // 346: lconst_0
      // 347: lcmp
      // 348: ifle 12e
      // 34b: return
   }

   void I6(Object[] var1) {
      Set var5 = (Set)var1[0];
      long var2 = (Long)var1[1];
      _u_ var4 = (_u_)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 42256349833747L;
      x44.a<"n">(this.O, new Object[]{var5, var6, var4}, 4686292728080781865L, var2);
   }

   void P(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 11
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Set
      // 01a: astore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/qg
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/qg
      // 029: astore 15
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/ax
      // 031: astore 7
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/util/ArrayList
      // 03a: astore 3
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/_8c
      // 042: astore 13
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast com/zelix/_y4
      // 04b: astore 5
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/util/Map
      // 054: astore 8
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/_yv
      // 05d: astore 10
      // 05f: dup
      // 060: bipush 11
      // 062: aaload
      // 063: checkcast com/zelix/_fm
      // 066: astore 9
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast com/zelix/_ug
      // 06f: astore 16
      // 071: dup
      // 072: bipush 13
      // 074: aaload
      // 075: checkcast java/util/Random
      // 078: astore 14
      // 07a: pop
      // 07b: getstatic com/zelix/h_.a J
      // 07e: lload 11
      // 080: lxor
      // 081: lstore 11
      // 083: lload 11
      // 085: dup2
      // 086: ldc2_w 72941425144017
      // 089: lxor
      // 08a: lstore 17
      // 08c: pop2
      // 08d: ldc2_w -7090465276689339939
      // 090: lload 11
      // 092: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: istore 19
      // 099: aload 0
      // 09a: getfield com/zelix/h_.O Lcom/zelix/be;
      // 09d: iload 19
      // 09f: ifne 0c5
      // 0a2: ifnull 140
      // 0a5: goto 0b3
      // 0a8: ldc2_w -7075317592415802581
      // 0ab: lload 11
      // 0ad: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0b7: goto 0c5
      // 0ba: ldc2_w -7075317592415802581
      // 0bd: lload 11
      // 0bf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 6
      // 0c7: aload 2
      // 0c8: aload 4
      // 0ca: lload 17
      // 0cc: aload 15
      // 0ce: aload 7
      // 0d0: aload 3
      // 0d1: aload 13
      // 0d3: aload 5
      // 0d5: aload 8
      // 0d7: aload 10
      // 0d9: aload 9
      // 0db: aload 16
      // 0dd: aload 14
      // 0df: bipush 14
      // 0e1: anewarray 709
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 13
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 12
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 11
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 10
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 9
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: bipush 8
      // 106: swap
      // 107: aastore
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 7
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 6
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 5
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 4
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 3
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 2
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 1
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w -7122983097852239441
      // 139: lload 11
      // 13b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: return
   }

   boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 112380260090409L;
      return x44.a<"o">(this.O, new Object[]{var4}, 3838151890514333756L, var2);
   }

   void H(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 128320230074242L;
      x44.a<"k">(this.O, new Object[]{var2, var5}, -434650328190852059L, var3);
   }

   boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 43837593031312L;
      return ((iu)this.x()).C(var4);
   }

   public xl i(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 41504355438977
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 7129970857707394742
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/h_.O Lcom/zelix/be;
      // 2a: iload 6
      // 2c: ifne 50
      // 2f: ifnull 69
      // 32: goto 3f
      // 35: ldc2_w 7107887472482325568
      // 38: lload 2
      // 39: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/h_.O Lcom/zelix/be;
      // 43: goto 50
      // 46: ldc2_w 7107887472482325568
      // 49: lload 2
      // 4a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 709
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 7088467627893917885
      // 62: lload 2
      // 63: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: areturn
      // 69: aconst_null
      // 6a: areturn
   }

   boolean d(Object[] param1) {
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
      // 0e: checkcast com/zelix/ir
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/h_.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 51438022367165
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -8838613908616530628
      // 26: lload 2
      // 27: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 32: iload 7
      // 34: ifeq 58
      // 37: ifnull 78
      // 3a: goto 47
      // 3d: ldc2_w -7460366404692218221
      // 40: lload 2
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/h_.O Lcom/zelix/be;
      // 4b: goto 58
      // 4e: ldc2_w -7460366404692218221
      // 51: lload 2
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: lload 5
      // 5a: aload 4
      // 5c: bipush 2
      // 5d: anewarray 709
      // 60: dup_x1
      // 61: swap
      // 62: bipush 1
      // 63: swap
      // 64: aastore
      // 65: dup_x2
      // 66: dup_x2
      // 67: pop
      // 68: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6b: bipush 0
      // 6c: swap
      // 6d: aastore
      // 6e: ldc2_w -9005340282781643600
      // 71: lload 2
      // 72: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: ireturn
      // 78: bipush 0
      // 79: ireturn
   }

   void D(Object[] param1) {
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
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/h_.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 41184119513930
      // 22: lxor
      // 23: dup2
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 5
      // 2a: dup2
      // 2b: bipush 32
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 6
      // 34: dup2
      // 35: bipush 48
      // 37: lshl
      // 38: bipush 48
      // 3a: lushr
      // 3b: l2i
      // 3c: istore 7
      // 3e: pop2
      // 3f: pop2
      // 40: ldc2_w -385749737179984159
      // 43: lload 2
      // 44: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 8
      // 4b: iload 8
      // 4d: ifne 82
      // 50: iload 4
      // 52: sipush 2160
      // 55: ldc2_w 1841140372759060429
      // 58: lload 2
      // 59: lxor
      // 5a: invokedynamic o (IJ)I bsm=com/zelix/h_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: if_icmpgt 87
      // 62: goto 6f
      // 65: ldc2_w -363808678037124073
      // 68: lload 2
      // 69: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aload 0
      // 70: iload 4
      // 72: putfield com/zelix/h_.j I
      // 75: goto 82
      // 78: ldc2_w -363808678037124073
      // 7b: lload 2
      // 7c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: iload 8
      // 84: ifeq dc
      // 87: new com/zelix/_sk
      // 8a: dup
      // 8b: new java/lang/StringBuilder
      // 8e: dup
      // 8f: invokespecial java/lang/StringBuilder.<init> ()V
      // 92: sipush 8374
      // 95: ldc2_w 7805507922722473061
      // 98: lload 2
      // 99: lxor
      // 9a: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a2: aload 0
      // a3: iload 5
      // a5: iload 6
      // a7: i2s
      // a8: iload 7
      // aa: i2c
      // ab: invokevirtual com/zelix/h_.r (ISC)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: sipush 662
      // b4: ldc2_w 291874020176127561
      // b7: lload 2
      // b8: lxor
      // b9: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: iload 4
      // c3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c6: ldc ")"
      // c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ce: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // d1: athrow
      // d2: ldc2_w -363808678037124073
      // d5: lload 2
      // d6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: return
   }

   public void wV(Object[] param1) {
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
      // 00a: istore 8
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/List
      // 012: astore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_fm
      // 01a: astore 4
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/we
      // 022: astore 6
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast com/zelix/_ur
      // 02a: astore 7
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/lang/Long
      // 032: invokevirtual java/lang/Long.longValue ()J
      // 035: lstore 2
      // 036: pop
      // 037: getstatic com/zelix/h_.a J
      // 03a: lload 2
      // 03b: lxor
      // 03c: lstore 2
      // 03d: lload 2
      // 03e: dup2
      // 03f: ldc2_w 37625637081138
      // 042: lxor
      // 043: lstore 9
      // 045: dup2
      // 046: ldc2_w 4214814771332
      // 049: lxor
      // 04a: lstore 11
      // 04c: dup2
      // 04d: ldc2_w 101447915497742
      // 050: lxor
      // 051: lstore 13
      // 053: dup2
      // 054: ldc2_w 111466836688416
      // 057: lxor
      // 058: lstore 15
      // 05a: dup2
      // 05b: ldc2_w 61237615133992
      // 05e: lxor
      // 05f: lstore 17
      // 061: dup2
      // 062: ldc2_w 87471298990780
      // 065: lxor
      // 066: lstore 19
      // 068: pop2
      // 069: ldc2_w 6530179795553053429
      // 06c: lload 2
      // 06d: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: istore 21
      // 074: aload 5
      // 076: invokeinterface java/util/List.size ()I 1
      // 07b: iload 21
      // 07d: ifeq 0a4
      // 080: ifle 52e
      // 083: goto 090
      // 086: ldc2_w 5169640745656987994
      // 089: lload 2
      // 08a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 0
      // 091: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 094: arraylength
      // 095: bipush 1
      // 096: iadd
      // 097: goto 0a4
      // 09a: ldc2_w 5169640745656987994
      // 09d: lload 2
      // 09e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: anewarray 852
      // 0a7: astore 22
      // 0a9: aload 5
      // 0ab: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b0: astore 23
      // 0b2: aload 23
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 2d1
      // 0bc: aload 23
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast com/zelix/bv
      // 0c6: astore 24
      // 0c8: aload 0
      // 0c9: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0cc: arraylength
      // 0cd: istore 25
      // 0cf: bipush 0
      // 0d0: istore 26
      // 0d2: iload 21
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 0e4
      // 0da: ifeq 52e
      // 0dd: aload 0
      // 0de: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0e1: arraylength
      // 0e2: bipush 1
      // 0e3: isub
      // 0e4: istore 27
      // 0e6: iload 27
      // 0e8: iflt 286
      // 0eb: aload 0
      // 0ec: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0ef: iload 27
      // 0f1: aaload
      // 0f2: astore 28
      // 0f4: aload 24
      // 0f6: aload 28
      // 0f8: bipush 0
      // 0f9: invokevirtual com/zelix/bv.l (I)I
      // 0fc: aload 28
      // 0fe: bipush 1
      // 0ff: invokevirtual com/zelix/bv.l (I)I
      // 102: lload 17
      // 104: invokevirtual com/zelix/bv.s (IIJ)Z
      // 107: lload 2
      // 108: lconst_0
      // 109: lcmp
      // 10a: iflt 2ce
      // 10d: iload 21
      // 10f: ifeq 2cb
      // 112: iload 21
      // 114: lload 2
      // 115: lconst_0
      // 116: lcmp
      // 117: ifle 1f2
      // 11a: ifeq 1f0
      // 11d: goto 12a
      // 120: ldc2_w 5169640745656987994
      // 123: lload 2
      // 124: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: lload 2
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: ifle 1e3
      // 130: ifeq 1c8
      // 133: goto 140
      // 136: ldc2_w 5169640745656987994
      // 139: lload 2
      // 13a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: iload 26
      // 142: iload 21
      // 144: ifeq 1bb
      // 147: goto 154
      // 14a: ldc2_w 5169640745656987994
      // 14d: lload 2
      // 14e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: lload 2
      // 155: lconst_0
      // 156: lcmp
      // 157: iflt 1ae
      // 15a: ifne 1ad
      // 15d: goto 16a
      // 160: ldc2_w 5169640745656987994
      // 163: lload 2
      // 164: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 24
      // 16c: bipush 0
      // 16d: invokevirtual com/zelix/bv.l (I)I
      // 170: lload 2
      // 171: lconst_0
      // 172: lcmp
      // 173: iflt 1bf
      // 176: iload 21
      // 178: ifeq 1bb
      // 17b: goto 188
      // 17e: ldc2_w 5169640745656987994
      // 181: lload 2
      // 182: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 28
      // 18a: bipush 0
      // 18b: invokevirtual com/zelix/bv.l (I)I
      // 18e: if_icmpge 1ad
      // 191: goto 19e
      // 194: ldc2_w 5169640745656987994
      // 197: lload 2
      // 198: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: iload 27
      // 1a0: istore 25
      // 1a2: iload 21
      // 1a4: lload 2
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: iflt 283
      // 1aa: ifne 27e
      // 1ad: bipush 1
      // 1ae: goto 1bb
      // 1b1: ldc2_w 5169640745656987994
      // 1b4: lload 2
      // 1b5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: istore 26
      // 1bd: iload 21
      // 1bf: lload 2
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 283
      // 1c5: ifne 27e
      // 1c8: aload 24
      // 1ca: aload 28
      // 1cc: bipush 0
      // 1cd: invokevirtual com/zelix/bv.l (I)I
      // 1d0: aload 28
      // 1d2: bipush 1
      // 1d3: invokevirtual com/zelix/bv.l (I)I
      // 1d6: lload 19
      // 1d8: dup2_x1
      // 1d9: pop2
      // 1da: ldc2_w 4940592294682203039
      // 1dd: lload 2
      // 1de: invokedynamic n (Ljava/lang/Object;IJIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: goto 1f0
      // 1e6: ldc2_w 5169640745656987994
      // 1e9: lload 2
      // 1ea: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: iload 21
      // 1f2: lload 2
      // 1f3: lconst_0
      // 1f4: lcmp
      // 1f5: ifle 220
      // 1f8: ifeq 21e
      // 1fb: ifeq 286
      // 1fe: goto 20b
      // 201: ldc2_w 5169640745656987994
      // 204: lload 2
      // 205: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: aload 24
      // 20d: bipush 0
      // 20e: invokevirtual com/zelix/bv.l (I)I
      // 211: goto 21e
      // 214: ldc2_w 5169640745656987994
      // 217: lload 2
      // 218: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: iload 21
      // 220: lload 2
      // 221: lconst_0
      // 222: lcmp
      // 223: ifle 22f
      // 226: ifeq 27c
      // 229: aload 28
      // 22b: bipush 0
      // 22c: invokevirtual com/zelix/bv.l (I)I
      // 22f: if_icmpne 26d
      // 232: goto 23f
      // 235: ldc2_w 5169640745656987994
      // 238: lload 2
      // 239: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: aload 24
      // 241: bipush 1
      // 242: invokevirtual com/zelix/bv.l (I)I
      // 245: iload 21
      // 247: ifeq 27c
      // 24a: goto 257
      // 24d: ldc2_w 5169640745656987994
      // 250: lload 2
      // 251: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: aload 28
      // 259: bipush 1
      // 25a: invokevirtual com/zelix/bv.l (I)I
      // 25d: if_icmpeq 286
      // 260: goto 26d
      // 263: ldc2_w 5169640745656987994
      // 266: lload 2
      // 267: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: iload 27
      // 26f: goto 27c
      // 272: ldc2_w 5169640745656987994
      // 275: lload 2
      // 276: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: istore 25
      // 27e: iinc 27 -1
      // 281: iload 21
      // 283: ifne 0e6
      // 286: aload 22
      // 288: iload 25
      // 28a: aaload
      // 28b: lload 2
      // 28c: lconst_0
      // 28d: lcmp
      // 28e: ifle 0c3
      // 291: iload 21
      // 293: ifeq 2c4
      // 296: ifnonnull 2bf
      // 299: goto 2a6
      // 29c: ldc2_w 5169640745656987994
      // 29f: lload 2
      // 2a0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: aload 22
      // 2a8: iload 25
      // 2aa: new java/util/ArrayList
      // 2ad: dup
      // 2ae: invokespecial java/util/ArrayList.<init> ()V
      // 2b1: aastore
      // 2b2: goto 2bf
      // 2b5: ldc2_w 5169640745656987994
      // 2b8: lload 2
      // 2b9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: aload 22
      // 2c1: iload 25
      // 2c3: aaload
      // 2c4: aload 24
      // 2c6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2cb: pop
      // 2cc: iload 21
      // 2ce: ifne 0b2
      // 2d1: new java/util/LinkedList
      // 2d4: dup
      // 2d5: invokespecial java/util/LinkedList.<init> ()V
      // 2d8: astore 23
      // 2da: aload 0
      // 2db: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 2de: astore 24
      // 2e0: aload 24
      // 2e2: arraylength
      // 2e3: istore 25
      // 2e5: lload 2
      // 2e6: lconst_0
      // 2e7: lcmp
      // 2e8: iflt 52e
      // 2eb: bipush 0
      // 2ec: istore 26
      // 2ee: iload 26
      // 2f0: iload 25
      // 2f2: if_icmpge 32c
      // 2f5: aload 24
      // 2f7: iload 26
      // 2f9: aaload
      // 2fa: astore 27
      // 2fc: aload 23
      // 2fe: aload 27
      // 300: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 305: pop
      // 306: iinc 26 1
      // 309: iload 21
      // 30b: lload 2
      // 30c: lconst_0
      // 30d: lcmp
      // 30e: iflt 316
      // 311: ifeq 52e
      // 314: iload 21
      // 316: ifne 2ee
      // 319: lload 2
      // 31a: lconst_0
      // 31b: lcmp
      // 31c: iflt 309
      // 31f: goto 32c
      // 322: ldc2_w 5169640745656987994
      // 325: lload 2
      // 326: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: athrow
      // 32c: aload 22
      // 32e: arraylength
      // 32f: bipush 1
      // 330: isub
      // 331: istore 24
      // 333: iload 24
      // 335: iflt 434
      // 338: aload 22
      // 33a: iload 24
      // 33c: aaload
      // 33d: astore 25
      // 33f: iload 21
      // 341: lload 2
      // 342: lconst_0
      // 343: lcmp
      // 344: ifle 34c
      // 347: ifeq 45b
      // 34a: iload 21
      // 34c: lload 2
      // 34d: lconst_0
      // 34e: lcmp
      // 34f: iflt 431
      // 352: ifeq 42f
      // 355: goto 362
      // 358: ldc2_w 5169640745656987994
      // 35b: lload 2
      // 35c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 25
      // 364: ifnull 426
      // 367: goto 374
      // 36a: ldc2_w 5169640745656987994
      // 36d: lload 2
      // 36e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: athrow
      // 374: aload 25
      // 376: lload 13
      // 378: bipush 1
      // 379: anewarray 709
      // 37c: dup_x2
      // 37d: dup_x2
      // 37e: pop
      // 37f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 382: bipush 0
      // 383: swap
      // 384: aastore
      // 385: ldc2_w 6542324489039120323
      // 388: lload 2
      // 389: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/Comparator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: ldc2_w 6498999769400338401
      // 391: lload 2
      // 392: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: aload 25
      // 399: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 39e: astore 26
      // 3a0: aload 26
      // 3a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a7: ifeq 426
      // 3aa: aload 26
      // 3ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b1: checkcast com/zelix/bv
      // 3b4: astore 27
      // 3b6: iload 24
      // 3b8: iload 21
      // 3ba: ifeq 335
      // 3bd: iload 21
      // 3bf: lload 2
      // 3c0: lconst_0
      // 3c1: lcmp
      // 3c2: iflt 3ba
      // 3c5: lload 2
      // 3c6: lconst_0
      // 3c7: lcmp
      // 3c8: ifle 3d3
      // 3cb: ifeq 3f9
      // 3ce: aload 22
      // 3d0: arraylength
      // 3d1: bipush 1
      // 3d2: isub
      // 3d3: if_icmpne 405
      // 3d6: goto 3e3
      // 3d9: ldc2_w 5169640745656987994
      // 3dc: lload 2
      // 3dd: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: athrow
      // 3e3: aload 23
      // 3e5: aload 27
      // 3e7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3ec: goto 3f9
      // 3ef: ldc2_w 5169640745656987994
      // 3f2: lload 2
      // 3f3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: athrow
      // 3f9: pop
      // 3fa: iload 21
      // 3fc: lload 2
      // 3fd: lconst_0
      // 3fe: lcmp
      // 3ff: iflt 423
      // 402: ifne 421
      // 405: aload 23
      // 407: iload 24
      // 409: aload 27
      // 40b: ldc2_w 6762132302352138194
      // 40e: lload 2
      // 40f: invokedynamic n (Ljava/lang/Object;ILjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: goto 421
      // 417: ldc2_w 5169640745656987994
      // 41a: lload 2
      // 41b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: athrow
      // 421: iload 21
      // 423: ifne 3a0
      // 426: lload 2
      // 427: lconst_0
      // 428: lcmp
      // 429: ifle 45b
      // 42c: iinc 24 -1
      // 42f: iload 21
      // 431: ifne 333
      // 434: aload 0
      // 435: aload 23
      // 437: aload 23
      // 439: invokeinterface java/util/List.size ()I 1
      // 43e: anewarray 927
      // 441: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 446: checkcast [Lcom/zelix/bv;
      // 449: putfield com/zelix/h_.o [Lcom/zelix/bv;
      // 44c: aload 0
      // 44d: aload 0
      // 44e: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 451: arraylength
      // 452: putfield com/zelix/h_.d I
      // 455: lload 2
      // 456: lconst_0
      // 457: lcmp
      // 458: ifle 338
      // 45b: new java/lang/StringBuilder
      // 45e: dup
      // 45f: invokespecial java/lang/StringBuilder.<init> ()V
      // 462: astore 24
      // 464: iload 8
      // 466: iload 21
      // 468: ifeq 4a5
      // 46b: ifeq 52e
      // 46e: goto 47b
      // 471: ldc2_w 5169640745656987994
      // 474: lload 2
      // 475: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47a: athrow
      // 47b: aload 7
      // 47d: iload 21
      // 47f: ifeq 4aa
      // 482: goto 48f
      // 485: ldc2_w 5169640745656987994
      // 488: lload 2
      // 489: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: athrow
      // 48f: ldc2_w 4912689521834292670
      // 492: lload 2
      // 493: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 498: goto 4a5
      // 49b: ldc2_w 5169640745656987994
      // 49e: lload 2
      // 49f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: athrow
      // 4a5: ifeq 52e
      // 4a8: aload 7
      // 4aa: lload 15
      // 4ac: bipush 1
      // 4ad: anewarray 709
      // 4b0: dup_x2
      // 4b1: dup_x2
      // 4b2: pop
      // 4b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b6: bipush 0
      // 4b7: swap
      // 4b8: aastore
      // 4b9: ldc2_w 4871218218245989546
      // 4bc: lload 2
      // 4bd: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: astore 25
      // 4c4: aload 25
      // 4c6: new java/lang/StringBuilder
      // 4c9: dup
      // 4ca: invokespecial java/lang/StringBuilder.<init> ()V
      // 4cd: sipush 21150
      // 4d0: ldc2_w 2465165544160725788
      // 4d3: lload 2
      // 4d4: lxor
      // 4d5: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4dd: aload 0
      // 4de: invokevirtual com/zelix/h_.x ()Lcom/zelix/h8;
      // 4e1: checkcast com/zelix/ig
      // 4e4: lload 11
      // 4e6: ldc2_w 5048298616091550215
      // 4e9: lload 2
      // 4ea: invokedynamic n (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f2: sipush 17794
      // 4f5: ldc2_w 6928620669149551640
      // 4f8: lload 2
      // 4f9: lxor
      // 4fa: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 502: aload 0
      // 503: lload 9
      // 505: bipush 1
      // 506: anewarray 709
      // 509: dup_x2
      // 50a: dup_x2
      // 50b: pop
      // 50c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50f: bipush 0
      // 510: swap
      // 511: aastore
      // 512: ldc2_w 6727217188159890069
      // 515: lload 2
      // 516: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51e: ldc "'"
      // 520: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 523: ldc ""
      // 525: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 528: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52b: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 52e: return
   }

   final void U(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 33111785116638
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 4430653150407298326
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifeq 6c
      // 3f: instanceof com/zelix/_yl
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: ifle 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w 2332104442543101625
      // 51: lload 2
      // 52: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w 2332104442543101625
      // 65: lload 2
      // 66: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/_yl
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 709
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 2561161605305547025
      // 81: lload 2
      // 82: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifne 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: ifle 33
      // 95: return
   }

   int b(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -148632410842805845
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26: arraylength
      // 27: if_icmpge 6c
      // 2a: aload 0
      // 2b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2e: iload 5
      // 30: aaload
      // 31: instanceof com/zelix/h7
      // 34: iload 4
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: ifle 41
      // 3c: ifne 73
      // 3f: iload 4
      // 41: ifne 63
      // 44: goto 51
      // 47: ldc2_w -164094572076364963
      // 4a: lload 2
      // 4b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: ifeq 64
      // 54: goto 61
      // 57: ldc2_w -164094572076364963
      // 5a: lload 2
      // 5b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: iload 5
      // 63: ireturn
      // 64: iinc 5 1
      // 67: iload 4
      // 69: ifeq 20
      // 6c: lload 2
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: ifle 2a
      // 72: bipush -1
      // 73: ireturn
   }

   boolean y(Object[] param1) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/we
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 7
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/_ur
      // 02c: astore 2
      // 02d: pop
      // 02e: getstatic com/zelix/h_.a J
      // 031: lload 4
      // 033: lxor
      // 034: lstore 4
      // 036: lload 4
      // 038: dup2
      // 039: ldc2_w 33277674863892
      // 03c: lxor
      // 03d: lstore 8
      // 03f: dup2
      // 040: ldc2_w 37573547368980
      // 043: lxor
      // 044: lstore 10
      // 046: dup2
      // 047: ldc2_w 4382040658818
      // 04a: lxor
      // 04b: lstore 12
      // 04d: pop2
      // 04e: ldc2_w -5406095518093114221
      // 051: lload 4
      // 053: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: bipush 0
      // 059: istore 15
      // 05b: istore 14
      // 05d: aload 0
      // 05e: getfield com/zelix/h_.O Lcom/zelix/be;
      // 061: iload 14
      // 063: ifeq 089
      // 066: ifnull 115
      // 069: goto 077
      // 06c: ldc2_w -6208163749121958084
      // 06f: lload 4
      // 071: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 0
      // 078: getfield com/zelix/h_.O Lcom/zelix/be;
      // 07b: goto 089
      // 07e: ldc2_w -6208163749121958084
      // 081: lload 4
      // 083: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 3
      // 08a: aload 6
      // 08c: lload 8
      // 08e: invokevirtual com/zelix/be.l (Lcom/zelix/_fm;Lcom/zelix/we;J)Lcom/zelix/yg;
      // 091: astore 16
      // 093: aload 0
      // 094: aload 16
      // 096: iload 7
      // 098: lload 10
      // 09a: aload 2
      // 09b: bipush 4
      // 09c: anewarray 709
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 3
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 2
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b2: bipush 1
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x1
      // 0b6: swap
      // 0b7: bipush 0
      // 0b8: swap
      // 0b9: aastore
      // 0ba: ldc2_w -6313484968714381677
      // 0bd: lload 4
      // 0bf: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: istore 15
      // 0c6: aload 16
      // 0c8: bipush 0
      // 0c9: anewarray 709
      // 0cc: ldc2_w -6222898767675556425
      // 0cf: lload 4
      // 0d1: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: iload 14
      // 0d8: ifeq 117
      // 0db: ifne 115
      // 0de: goto 0ec
      // 0e1: ldc2_w -6208163749121958084
      // 0e4: lload 4
      // 0e6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 16
      // 0ee: lload 12
      // 0f0: bipush 1
      // 0f1: anewarray 709
      // 0f4: dup_x2
      // 0f5: dup_x2
      // 0f6: pop
      // 0f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: ldc2_w -5436970958242574119
      // 100: lload 4
      // 102: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: goto 115
      // 10a: ldc2_w -6208163749121958084
      // 10d: lload 4
      // 10f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: iload 15
      // 117: ireturn
   }

   Map H(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 94614424339746
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -3110917790764703593
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2f: arraylength
      // 30: if_icmpge 90
      // 33: aload 0
      // 34: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifne 6c
      // 3f: instanceof com/zelix/hp
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: ifle 8d
      // 48: ifeq 88
      // 4b: goto 58
      // 4e: ldc2_w -3133032513278205343
      // 51: lload 2
      // 52: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w -3133032513278205343
      // 65: lload 2
      // 66: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/hp
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 709
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -3933551809244383446
      // 81: lload 2
      // 82: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: areturn
      // 88: iinc 7 1
      // 8b: iload 6
      // 8d: ifeq 29
      // 90: lload 2
      // 91: lconst_0
      // 92: lcmp
      // 93: ifle 33
      // 96: aconst_null
      // 97: areturn
   }

   h6 z(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 6615139925782260647
      // 15: lload 2
      // 16: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifeq 63
      // 36: instanceof com/zelix/h6
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w 5110505326149054472
      // 48: lload 2
      // 49: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w 5110505326149054472
      // 5c: lload 2
      // 5d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/h6
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifne 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 2a
      // 75: aconst_null
      // 76: areturn
   }

   public void l(Object[] var1) {
      Set var5 = (Set)var1[0];
      Set var2 = (Set)var1[1];
      long var3 = (Long)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 59489845648625L;
      x44.a<"o">(this.O, new Object[]{var6, var5, var2}, -5000699334427410581L, var3);
   }

   public void W(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
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
      // 025: checkcast java/util/Set
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/h_.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 120682822372721
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 6010483915148
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 55523349330427
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 26491215504643
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 18717284837253
      // 055: lxor
      // 056: lstore 16
      // 058: pop2
      // 059: ldc2_w -7627780422461316512
      // 05c: lload 6
      // 05e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: getfield com/zelix/h_.O Lcom/zelix/be;
      // 067: aload 3
      // 068: aload 4
      // 06a: aload 2
      // 06b: lload 14
      // 06d: aload 5
      // 06f: bipush 5
      // 070: anewarray 709
      // 073: dup_x1
      // 074: swap
      // 075: bipush 4
      // 076: swap
      // 077: aastore
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 3
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: bipush 2
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w -8602325823090926252
      // 093: lload 6
      // 095: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: istore 18
      // 09c: bipush 0
      // 09d: istore 19
      // 09f: iload 19
      // 0a1: aload 0
      // 0a2: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0a5: arraylength
      // 0a6: if_icmpge 169
      // 0a9: aload 0
      // 0aa: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0ad: iload 19
      // 0af: aaload
      // 0b0: astore 20
      // 0b2: aload 20
      // 0b4: lload 16
      // 0b6: invokevirtual com/zelix/bv.W (J)Ljava/lang/String;
      // 0b9: astore 21
      // 0bb: lload 12
      // 0bd: aload 21
      // 0bf: invokestatic com/zelix/yn.x (JLjava/lang/String;)Lcom/zelix/hz;
      // 0c2: astore 22
      // 0c4: iload 18
      // 0c6: lload 6
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 166
      // 0cd: ifne 164
      // 0d0: aload 22
      // 0d2: ifnull 161
      // 0d5: goto 0e3
      // 0d8: ldc2_w -7605918579157311338
      // 0db: lload 6
      // 0dd: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 22
      // 0e5: lload 10
      // 0e7: invokevirtual com/zelix/hz.n (J)Z
      // 0ea: iload 18
      // 0ec: ifne 160
      // 0ef: goto 0fd
      // 0f2: ldc2_w -7605918579157311338
      // 0f5: lload 6
      // 0f7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 6
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 152
      // 104: ifeq 14a
      // 107: goto 115
      // 10a: ldc2_w -7605918579157311338
      // 10d: lload 6
      // 10f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 3
      // 116: aload 22
      // 118: lload 8
      // 11a: bipush 1
      // 11b: anewarray 709
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 0
      // 125: swap
      // 126: aastore
      // 127: ldc2_w -8349153632042263716
      // 12a: lload 6
      // 12c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 136: pop
      // 137: iload 18
      // 139: ifeq 161
      // 13c: goto 14a
      // 13f: ldc2_w -7605918579157311338
      // 142: lload 6
      // 144: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 3
      // 14b: aload 22
      // 14d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 152: goto 160
      // 155: ldc2_w -7605918579157311338
      // 158: lload 6
      // 15a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: pop
      // 161: iinc 19 1
      // 164: iload 18
      // 166: ifeq 09f
      // 169: return
   }

   void v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 124714660420719L;
      x44.a<"k">(this, new Object[]{h9.class, var4}, -1276920428513254942L, var2);
   }

   void c(Object[] var1) {
      ax var3 = (ax)var1[0];
      ax var6 = (ax)var1[1];
      long var4 = (Long)var1[2];
      ax var7 = (ax)var1[3];
      _uo var2 = (_uo)var1[4];
      var4 = a ^ var4;
      long var8 = var4 ^ 133403191947879L;
      x44.a<"o">(this.O, new Object[]{var3, var6, var7, var2, var8}, -3766273149185863219L, var4);
   }

   void N(Object[] param1) {
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
      // 04: checkcast java/io/PrintWriter
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: pop
      // 1e: getstatic com/zelix/h_.a J
      // 21: lload 4
      // 23: lxor
      // 24: lstore 4
      // 26: lload 4
      // 28: dup2
      // 29: ldc2_w 91230784166547
      // 2c: lxor
      // 2d: lstore 6
      // 2f: pop2
      // 30: ldc2_w -8088791258399589382
      // 33: lload 4
      // 35: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 3
      // 3b: ldc ""
      // 3d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 40: istore 8
      // 42: new java/lang/StringBuffer
      // 45: dup
      // 46: iload 2
      // 47: invokespecial java/lang/StringBuffer.<init> (I)V
      // 4a: astore 9
      // 4c: bipush 0
      // 4d: istore 10
      // 4f: iload 10
      // 51: iload 2
      // 52: if_icmpge 92
      // 55: aload 9
      // 57: sipush 9399
      // 5a: ldc2_w 9202609176458736992
      // 5d: lload 4
      // 5f: lxor
      // 60: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 68: pop
      // 69: iinc 10 1
      // 6c: iload 8
      // 6e: lload 4
      // 70: lconst_0
      // 71: lcmp
      // 72: iflt 97
      // 75: ifne 95
      // 78: iload 8
      // 7a: ifeq 4f
      // 7d: lload 4
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt 6c
      // 84: goto 92
      // 87: ldc2_w -8077170249762998004
      // 8a: lload 4
      // 8c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: bipush 0
      // 93: istore 10
      // 95: iload 10
      // 97: lload 4
      // 99: lconst_0
      // 9a: lcmp
      // 9b: iflt d8
      // 9e: aload 0
      // 9f: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // a2: arraylength
      // a3: if_icmpge f0
      // a6: aload 0
      // a7: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // aa: iload 10
      // ac: aaload
      // ad: aload 3
      // ae: aload 9
      // b0: lload 6
      // b2: bipush 3
      // b3: anewarray 709
      // b6: dup_x2
      // b7: dup_x2
      // b8: pop
      // b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bc: bipush 2
      // bd: swap
      // be: aastore
      // bf: dup_x1
      // c0: swap
      // c1: bipush 1
      // c2: swap
      // c3: aastore
      // c4: dup_x1
      // c5: swap
      // c6: bipush 0
      // c7: swap
      // c8: aastore
      // c9: ldc2_w -7494493256792689918
      // cc: lload 4
      // ce: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: iinc 10 1
      // d6: iload 8
      // d8: ifeq 95
      // db: lload 4
      // dd: lconst_0
      // de: lcmp
      // df: ifle 95
      // e2: goto f0
      // e5: ldc2_w -8077170249762998004
      // e8: lload 4
      // ea: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: athrow
      // f0: return
   }

   final void i(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: istore 3
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/util/HashMap
      // 1c: astore 2
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/util/HashMap
      // 23: astore 7
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Long
      // 2b: invokevirtual java/lang/Long.longValue ()J
      // 2e: lstore 4
      // 30: pop
      // 31: lload 4
      // 33: dup2
      // 34: ldc2_w 0
      // 37: lxor
      // 38: lstore 8
      // 3a: pop2
      // 3b: ldc2_w 2390003288020881728
      // 3e: lload 4
      // 40: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: bipush 0
      // 46: istore 11
      // 48: istore 10
      // 4a: iload 11
      // 4c: aload 0
      // 4d: getfield com/zelix/h_.m I
      // 50: if_icmpge 9b
      // 53: aload 0
      // 54: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 57: iload 11
      // 59: aaload
      // 5a: iload 6
      // 5c: iload 3
      // 5d: aload 2
      // 5e: aload 7
      // 60: lload 8
      // 62: bipush 5
      // 63: anewarray 709
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 4
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 3
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 2
      // 77: swap
      // 78: aastore
      // 79: dup_x1
      // 7a: swap
      // 7b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7e: bipush 1
      // 7f: swap
      // 80: aastore
      // 81: dup_x1
      // 82: swap
      // 83: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w 4449096680962010888
      // 8c: lload 4
      // 8e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: iinc 11 1
      // 96: iload 10
      // 98: ifne 4a
      // 9b: lload 4
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: ifle 96
      // a2: return
   }

   static int V(Object[] var0) {
      long var1 = (Long)var0[0];
      hn[] var3 = (hn[])var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 40770671065191L;
      int var10000 = x44.a<"t">(6375591408305794110L, var1);
      int var7 = 0;
      hn[] var8 = var3;
      byte var6 = (byte)var10000;
      int var9 = var3.length;
      int var10 = 0;

      while (true) {
         if (var10 < var9) {
            hn var11 = var8[var10];
            var10000 = var7 + var11.z(var4);
            if (var1 > 0L) {
               if (var6 != 0) {
                  break;
               }

               var7 = var10000;
               var10++;
               var10000 = var6;
            }

            if (var10000 == 0) {
               continue;
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   h_(
      h8 param1,
      int param2,
      int param3,
      String param4,
      _xx param5,
      _y4 param6,
      int param7,
      _y4 param8,
      _y4 param9,
      _y4 param10,
      _y4 param11,
      _y4 param12,
      _y4 param13,
      _y4 param14,
      PrintWriter param15,
      ej param16,
      _y4 param17
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 7
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: getstatic com/zelix/h_.a J
      // 012: lxor
      // 013: lstore 18
      // 015: lload 18
      // 017: dup2
      // 018: ldc2_w 6200483549822
      // 01b: lxor
      // 01c: lstore 20
      // 01e: dup2
      // 01f: ldc2_w 17645760377261
      // 022: lxor
      // 023: lstore 22
      // 025: dup2
      // 026: ldc2_w 44709003903019
      // 029: lxor
      // 02a: lstore 24
      // 02c: dup2
      // 02d: ldc2_w 58090654881394
      // 030: lxor
      // 031: lstore 26
      // 033: dup2
      // 034: ldc2_w 120505855214682
      // 037: lxor
      // 038: lstore 28
      // 03a: dup2
      // 03b: ldc2_w 92351227987646
      // 03e: lxor
      // 03f: dup2
      // 040: bipush 48
      // 042: lushr
      // 043: l2i
      // 044: istore 30
      // 046: dup2
      // 047: bipush 16
      // 049: lshl
      // 04a: bipush 32
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 31
      // 050: dup2
      // 051: bipush 48
      // 053: lshl
      // 054: bipush 48
      // 056: lushr
      // 057: l2i
      // 058: istore 32
      // 05a: pop2
      // 05b: dup2
      // 05c: ldc2_w 58022345962436
      // 05f: lxor
      // 060: lstore 33
      // 062: pop2
      // 063: ldc2_w 5605207625250471331
      // 066: lload 18
      // 068: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 0
      // 06e: aload 1
      // 06f: iload 2
      // 070: aload 4
      // 072: lload 22
      // 074: aload 5
      // 076: aload 6
      // 078: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 07b: aload 0
      // 07c: aload 5
      // 07e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 081: putfield com/zelix/h_.e I
      // 084: aload 0
      // 085: aload 5
      // 087: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 08a: putfield com/zelix/h_.j I
      // 08d: aload 0
      // 08e: new com/zelix/be
      // 091: dup
      // 092: aload 0
      // 093: aload 5
      // 095: aload 17
      // 097: iload 30
      // 099: i2s
      // 09a: aload 9
      // 09c: aload 10
      // 09e: aload 11
      // 0a0: aload 12
      // 0a2: iload 31
      // 0a4: aload 13
      // 0a6: iload 32
      // 0a8: i2c
      // 0a9: aload 14
      // 0ab: invokespecial com/zelix/be.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;SLcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;ILcom/zelix/_y4;CLcom/zelix/_y4;)V
      // 0ae: putfield com/zelix/h_.O Lcom/zelix/be;
      // 0b1: aload 0
      // 0b2: aload 5
      // 0b4: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0b7: putfield com/zelix/h_.d I
      // 0ba: istore 35
      // 0bc: aload 0
      // 0bd: aload 0
      // 0be: getfield com/zelix/h_.d I
      // 0c1: anewarray 927
      // 0c4: putfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0c7: bipush 0
      // 0c8: istore 36
      // 0ca: iload 36
      // 0cc: aload 0
      // 0cd: getfield com/zelix/h_.d I
      // 0d0: if_icmpge 10f
      // 0d3: aload 0
      // 0d4: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0d7: iload 36
      // 0d9: new com/zelix/bv
      // 0dc: dup
      // 0dd: lload 24
      // 0df: aload 0
      // 0e0: aload 5
      // 0e2: aload 17
      // 0e4: aload 12
      // 0e6: invokespecial com/zelix/bv.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;)V
      // 0e9: aastore
      // 0ea: iinc 36 1
      // 0ed: iload 35
      // 0ef: iload 7
      // 0f1: iflt 124
      // 0f4: ifeq 123
      // 0f7: iload 35
      // 0f9: ifne 0ca
      // 0fc: iload 7
      // 0fe: iflt 0ed
      // 101: goto 10f
      // 104: ldc2_w 5829955422781908492
      // 107: lload 18
      // 109: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: aload 5
      // 112: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 115: putfield com/zelix/h_.m I
      // 118: aload 0
      // 119: aload 0
      // 11a: getfield com/zelix/h_.m I
      // 11d: anewarray 259
      // 120: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 123: bipush 0
      // 124: istore 36
      // 126: iload 36
      // 128: aload 0
      // 129: getfield com/zelix/h_.m I
      // 12c: if_icmpge 28d
      // 12f: aload 0
      // 130: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 133: iload 36
      // 135: aload 0
      // 136: aload 5
      // 138: aload 0
      // 139: getfield com/zelix/h_.O Lcom/zelix/be;
      // 13c: bipush 0
      // 13d: anewarray 709
      // 140: ldc2_w 5553250216970222635
      // 143: lload 18
      // 145: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/te; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: aload 6
      // 14c: aload 8
      // 14e: aload 9
      // 150: aload 10
      // 152: aload 11
      // 154: lload 26
      // 156: aload 12
      // 158: aload 13
      // 15a: aload 14
      // 15c: aload 15
      // 15e: aload 17
      // 160: aload 16
      // 162: bipush 15
      // 164: anewarray 709
      // 167: dup_x1
      // 168: swap
      // 169: bipush 14
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 13
      // 171: swap
      // 172: aastore
      // 173: dup_x1
      // 174: swap
      // 175: bipush 12
      // 177: swap
      // 178: aastore
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 11
      // 17d: swap
      // 17e: aastore
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 10
      // 183: swap
      // 184: aastore
      // 185: dup_x1
      // 186: swap
      // 187: bipush 9
      // 189: swap
      // 18a: aastore
      // 18b: dup_x2
      // 18c: dup_x2
      // 18d: pop
      // 18e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 191: bipush 8
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: bipush 7
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 6
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 5
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: bipush 4
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x1
      // 1ac: swap
      // 1ad: bipush 3
      // 1ae: swap
      // 1af: aastore
      // 1b0: dup_x1
      // 1b1: swap
      // 1b2: bipush 2
      // 1b3: swap
      // 1b4: aastore
      // 1b5: dup_x1
      // 1b6: swap
      // 1b7: bipush 1
      // 1b8: swap
      // 1b9: aastore
      // 1ba: dup_x1
      // 1bb: swap
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: ldc2_w 5522574848843522449
      // 1c2: lload 18
      // 1c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/h4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: aastore
      // 1ca: aload 0
      // 1cb: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 1ce: iload 36
      // 1d0: aaload
      // 1d1: instanceof com/zelix/h9
      // 1d4: iload 35
      // 1d6: ifeq 257
      // 1d9: ifeq 22c
      // 1dc: goto 1ea
      // 1df: ldc2_w 5829955422781908492
      // 1e2: lload 18
      // 1e4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: lload 28
      // 1ed: invokevirtual com/zelix/h_.d (J)Lcom/zelix/hz;
      // 1f0: checkcast com/zelix/hy
      // 1f3: lload 20
      // 1f5: bipush 1
      // 1f6: bipush 2
      // 1f7: anewarray 709
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ff: bipush 1
      // 200: swap
      // 201: aastore
      // 202: dup_x2
      // 203: dup_x2
      // 204: pop
      // 205: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 208: bipush 0
      // 209: swap
      // 20a: aastore
      // 20b: ldc2_w 6030313739720497709
      // 20e: lload 18
      // 210: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: iload 35
      // 217: iload 3
      // 218: iflt 28a
      // 21b: ifne 285
      // 21e: goto 22c
      // 221: ldc2_w 5829955422781908492
      // 224: lload 18
      // 226: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: athrow
      // 22c: aload 0
      // 22d: iload 35
      // 22f: ifeq 25b
      // 232: goto 240
      // 235: ldc2_w 5829955422781908492
      // 238: lload 18
      // 23a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 243: iload 36
      // 245: aaload
      // 246: instanceof com/zelix/hh
      // 249: goto 257
      // 24c: ldc2_w 5829955422781908492
      // 24f: lload 18
      // 251: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: ifeq 285
      // 25a: aload 0
      // 25b: lload 28
      // 25d: invokevirtual com/zelix/h_.d (J)Lcom/zelix/hz;
      // 260: checkcast com/zelix/hy
      // 263: bipush 1
      // 264: lload 33
      // 266: bipush 2
      // 267: anewarray 709
      // 26a: dup_x2
      // 26b: dup_x2
      // 26c: pop
      // 26d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 270: bipush 1
      // 271: swap
      // 272: aastore
      // 273: dup_x1
      // 274: swap
      // 275: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 278: bipush 0
      // 279: swap
      // 27a: aastore
      // 27b: ldc2_w 6047711850482640879
      // 27e: lload 18
      // 280: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: iinc 36 1
      // 288: iload 35
      // 28a: ifne 126
      // 28d: iload 3
      // 28e: iflt 1ca
      // 291: return
   }

   private boolean x(Object[] param1) {
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
      // 004: checkcast com/zelix/yg
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 4
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/_ur
      // 024: astore 2
      // 025: pop
      // 026: getstatic com/zelix/h_.a J
      // 029: lload 4
      // 02b: lxor
      // 02c: lstore 4
      // 02e: lload 4
      // 030: dup2
      // 031: ldc2_w 44010287970250
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 48830354686047
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 106987989989595
      // 042: lxor
      // 043: lstore 11
      // 045: dup2
      // 046: ldc2_w 10335908251666
      // 049: lxor
      // 04a: lstore 13
      // 04c: dup2
      // 04d: ldc2_w 108345544093238
      // 050: lxor
      // 051: lstore 15
      // 053: dup2
      // 054: ldc2_w 140357531776566
      // 057: lxor
      // 058: lstore 17
      // 05a: dup2
      // 05b: ldc2_w 78286417286585
      // 05e: lxor
      // 05f: lstore 19
      // 061: dup2
      // 062: ldc2_w 118454443872684
      // 065: lxor
      // 066: lstore 21
      // 068: dup2
      // 069: ldc2_w 137990308499959
      // 06c: lxor
      // 06d: lstore 23
      // 06f: dup2
      // 070: ldc2_w 135777903776822
      // 073: lxor
      // 074: lstore 25
      // 076: dup2
      // 077: ldc2_w 6055648682237
      // 07a: lxor
      // 07b: lstore 27
      // 07d: dup2
      // 07e: ldc2_w 94923122638430
      // 081: lxor
      // 082: dup2
      // 083: bipush 48
      // 085: lushr
      // 086: l2i
      // 087: istore 29
      // 089: dup2
      // 08a: bipush 16
      // 08c: lshl
      // 08d: bipush 32
      // 08f: lushr
      // 090: l2i
      // 091: istore 30
      // 093: dup2
      // 094: bipush 48
      // 096: lshl
      // 097: bipush 48
      // 099: lushr
      // 09a: l2i
      // 09b: istore 31
      // 09d: pop2
      // 09e: dup2
      // 09f: ldc2_w 122793956243943
      // 0a2: lxor
      // 0a3: lstore 32
      // 0a5: dup2
      // 0a6: ldc2_w 4383907047506
      // 0a9: lxor
      // 0aa: lstore 34
      // 0ac: dup2
      // 0ad: ldc2_w 90937902263330
      // 0b0: lxor
      // 0b1: lstore 36
      // 0b3: dup2
      // 0b4: ldc2_w 99574946854574
      // 0b7: lxor
      // 0b8: lstore 38
      // 0ba: pop2
      // 0bb: ldc2_w 8028152724189306627
      // 0be: lload 4
      // 0c0: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: aload 6
      // 0c7: lload 34
      // 0c9: bipush 1
      // 0ca: anewarray 709
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w 8185460332658326799
      // 0d9: lload 4
      // 0db: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: astore 41
      // 0e2: istore 40
      // 0e4: aload 41
      // 0e6: arraylength
      // 0e7: iload 40
      // 0e9: ifeq 752
      // 0ec: ifle 751
      // 0ef: goto 0fd
      // 0f2: ldc2_w 8234868669138142380
      // 0f5: lload 4
      // 0f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: new com/zelix/w
      // 100: dup
      // 101: lload 27
      // 103: invokespecial com/zelix/w.<init> (J)V
      // 106: astore 42
      // 108: aconst_null
      // 109: astore 43
      // 10b: aconst_null
      // 10c: astore 44
      // 10e: aconst_null
      // 10f: astore 45
      // 111: aconst_null
      // 112: astore 46
      // 114: aconst_null
      // 115: astore 47
      // 117: aload 0
      // 118: getfield com/zelix/h_.O Lcom/zelix/be;
      // 11b: aload 42
      // 11d: lload 36
      // 11f: bipush 2
      // 120: anewarray 709
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 1
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 0
      // 12f: swap
      // 130: aastore
      // 131: ldc2_w 8086632098968959784
      // 134: lload 4
      // 136: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: bipush 0
      // 13c: istore 48
      // 13e: iload 48
      // 140: aload 0
      // 141: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 144: arraylength
      // 145: if_icmpge 3b8
      // 148: aload 0
      // 149: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 14c: iload 48
      // 14e: aaload
      // 14f: instanceof com/zelix/hh
      // 152: iload 40
      // 154: lload 4
      // 156: lconst_0
      // 157: lcmp
      // 158: ifle 160
      // 15b: ifeq 3c0
      // 15e: iload 40
      // 160: lload 4
      // 162: lconst_0
      // 163: lcmp
      // 164: ifle 1dd
      // 167: ifeq 1db
      // 16a: goto 178
      // 16d: ldc2_w 8234868669138142380
      // 170: lload 4
      // 172: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: ifeq 1c3
      // 17b: goto 189
      // 17e: ldc2_w 8234868669138142380
      // 181: lload 4
      // 183: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: aload 0
      // 18a: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 18d: iload 48
      // 18f: aaload
      // 190: checkcast com/zelix/hh
      // 193: astore 43
      // 195: aload 43
      // 197: aload 42
      // 199: lload 21
      // 19b: bipush 2
      // 19c: anewarray 709
      // 19f: dup_x2
      // 1a0: dup_x2
      // 1a1: pop
      // 1a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a5: bipush 1
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x1
      // 1a9: swap
      // 1aa: bipush 0
      // 1ab: swap
      // 1ac: aastore
      // 1ad: ldc2_w 7543857152356224599
      // 1b0: lload 4
      // 1b2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: iload 40
      // 1b9: lload 4
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: iflt 3b5
      // 1c0: ifne 3b0
      // 1c3: aload 0
      // 1c4: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 1c7: iload 48
      // 1c9: aaload
      // 1ca: instanceof com/zelix/hp
      // 1cd: goto 1db
      // 1d0: ldc2_w 8234868669138142380
      // 1d3: lload 4
      // 1d5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: iload 40
      // 1dd: lload 4
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: iflt 24c
      // 1e4: ifeq 24a
      // 1e7: ifeq 232
      // 1ea: goto 1f8
      // 1ed: ldc2_w 8234868669138142380
      // 1f0: lload 4
      // 1f2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 1fc: iload 48
      // 1fe: aaload
      // 1ff: checkcast com/zelix/hp
      // 202: astore 44
      // 204: aload 44
      // 206: lload 25
      // 208: aload 42
      // 20a: bipush 2
      // 20b: anewarray 709
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 1
      // 211: swap
      // 212: aastore
      // 213: dup_x2
      // 214: dup_x2
      // 215: pop
      // 216: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 219: bipush 0
      // 21a: swap
      // 21b: aastore
      // 21c: ldc2_w 8542097149444715561
      // 21f: lload 4
      // 221: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: iload 40
      // 228: lload 4
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: iflt 3b5
      // 22f: ifne 3b0
      // 232: aload 0
      // 233: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 236: iload 48
      // 238: aaload
      // 239: instanceof com/zelix/ha
      // 23c: goto 24a
      // 23f: ldc2_w 8234868669138142380
      // 242: lload 4
      // 244: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: iload 40
      // 24c: lload 4
      // 24e: lconst_0
      // 24f: lcmp
      // 250: iflt 2c2
      // 253: ifeq 2b9
      // 256: ifeq 2a1
      // 259: goto 267
      // 25c: ldc2_w 8234868669138142380
      // 25f: lload 4
      // 261: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: aload 0
      // 268: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26b: iload 48
      // 26d: aaload
      // 26e: checkcast com/zelix/ha
      // 271: astore 45
      // 273: aload 44
      // 275: lload 25
      // 277: aload 42
      // 279: bipush 2
      // 27a: anewarray 709
      // 27d: dup_x1
      // 27e: swap
      // 27f: bipush 1
      // 280: swap
      // 281: aastore
      // 282: dup_x2
      // 283: dup_x2
      // 284: pop
      // 285: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 288: bipush 0
      // 289: swap
      // 28a: aastore
      // 28b: ldc2_w 8542097149444715561
      // 28e: lload 4
      // 290: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: iload 40
      // 297: lload 4
      // 299: lconst_0
      // 29a: lcmp
      // 29b: ifle 3b5
      // 29e: ifne 3b0
      // 2a1: aload 0
      // 2a2: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2a5: iload 48
      // 2a7: aaload
      // 2a8: instanceof com/zelix/h6
      // 2ab: goto 2b9
      // 2ae: ldc2_w 8234868669138142380
      // 2b1: lload 4
      // 2b3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: lload 4
      // 2bb: lconst_0
      // 2bc: lcmp
      // 2bd: iflt 356
      // 2c0: iload 40
      // 2c2: ifeq 356
      // 2c5: ifeq 324
      // 2c8: goto 2d6
      // 2cb: ldc2_w 8234868669138142380
      // 2ce: lload 4
      // 2d0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: aload 0
      // 2d7: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2da: iload 48
      // 2dc: aaload
      // 2dd: checkcast com/zelix/h6
      // 2e0: astore 47
      // 2e2: aload 47
      // 2e4: iload 29
      // 2e6: i2c
      // 2e7: iload 30
      // 2e9: aload 42
      // 2eb: iload 31
      // 2ed: bipush 4
      // 2ee: anewarray 709
      // 2f1: dup_x1
      // 2f2: swap
      // 2f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f6: bipush 3
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: bipush 2
      // 2fc: swap
      // 2fd: aastore
      // 2fe: dup_x1
      // 2ff: swap
      // 300: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 303: bipush 1
      // 304: swap
      // 305: aastore
      // 306: dup_x1
      // 307: swap
      // 308: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30b: bipush 0
      // 30c: swap
      // 30d: aastore
      // 30e: ldc2_w 8085810028241208119
      // 311: lload 4
      // 313: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: iload 40
      // 31a: lload 4
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: ifle 3b5
      // 321: ifne 3b0
      // 324: lload 4
      // 326: lconst_0
      // 327: lcmp
      // 328: ifle 37a
      // 32b: aload 0
      // 32c: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 32f: iload 48
      // 331: aaload
      // 332: iload 40
      // 334: ifeq 375
      // 337: goto 345
      // 33a: ldc2_w 8234868669138142380
      // 33d: lload 4
      // 33f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: athrow
      // 345: instanceof com/zelix/h7
      // 348: goto 356
      // 34b: ldc2_w 8234868669138142380
      // 34e: lload 4
      // 350: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: athrow
      // 356: lload 4
      // 358: lconst_0
      // 359: lcmp
      // 35a: ifle 3b5
      // 35d: ifeq 3b0
      // 360: aload 0
      // 361: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 364: iload 48
      // 366: aaload
      // 367: goto 375
      // 36a: ldc2_w 8234868669138142380
      // 36d: lload 4
      // 36f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: athrow
      // 375: checkcast com/zelix/h7
      // 378: astore 46
      // 37a: aload 46
      // 37c: iload 29
      // 37e: i2c
      // 37f: iload 30
      // 381: aload 42
      // 383: iload 31
      // 385: bipush 4
      // 386: anewarray 709
      // 389: dup_x1
      // 38a: swap
      // 38b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 38e: bipush 3
      // 38f: swap
      // 390: aastore
      // 391: dup_x1
      // 392: swap
      // 393: bipush 2
      // 394: swap
      // 395: aastore
      // 396: dup_x1
      // 397: swap
      // 398: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 39b: bipush 1
      // 39c: swap
      // 39d: aastore
      // 39e: dup_x1
      // 39f: swap
      // 3a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a3: bipush 0
      // 3a4: swap
      // 3a5: aastore
      // 3a6: ldc2_w 8085810028241208119
      // 3a9: lload 4
      // 3ab: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: iinc 48 1
      // 3b3: iload 40
      // 3b5: ifne 13e
      // 3b8: lload 4
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: ifle 148
      // 3bf: bipush 0
      // 3c0: istore 48
      // 3c2: iload 48
      // 3c4: aload 0
      // 3c5: getfield com/zelix/h_.d I
      // 3c8: if_icmpge 41b
      // 3cb: aload 0
      // 3cc: lload 4
      // 3ce: lconst_0
      // 3cf: lcmp
      // 3d0: ifle 445
      // 3d3: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 3d6: iload 48
      // 3d8: aaload
      // 3d9: lload 11
      // 3db: aload 42
      // 3dd: bipush 2
      // 3de: anewarray 709
      // 3e1: dup_x1
      // 3e2: swap
      // 3e3: bipush 1
      // 3e4: swap
      // 3e5: aastore
      // 3e6: dup_x2
      // 3e7: dup_x2
      // 3e8: pop
      // 3e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ec: bipush 0
      // 3ed: swap
      // 3ee: aastore
      // 3ef: ldc2_w 8456659460272445890
      // 3f2: lload 4
      // 3f4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f9: iinc 48 1
      // 3fc: iload 40
      // 3fe: ifeq 444
      // 401: iload 40
      // 403: ifne 3c2
      // 406: lload 4
      // 408: lconst_0
      // 409: lcmp
      // 40a: ifle 3fc
      // 40d: goto 41b
      // 410: ldc2_w 8234868669138142380
      // 413: lload 4
      // 415: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: athrow
      // 41b: aload 0
      // 41c: invokevirtual com/zelix/h_.x ()Lcom/zelix/h8;
      // 41f: checkcast com/zelix/ig
      // 422: lload 32
      // 424: aload 42
      // 426: bipush 2
      // 427: anewarray 709
      // 42a: dup_x1
      // 42b: swap
      // 42c: bipush 1
      // 42d: swap
      // 42e: aastore
      // 42f: dup_x2
      // 430: dup_x2
      // 431: pop
      // 432: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 435: bipush 0
      // 436: swap
      // 437: aastore
      // 438: ldc2_w 8211614516850384968
      // 43b: lload 4
      // 43d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 442: istore 48
      // 444: aload 0
      // 445: getfield com/zelix/h_.O Lcom/zelix/be;
      // 448: lload 17
      // 44a: aload 41
      // 44c: bipush 2
      // 44d: anewarray 709
      // 450: dup_x1
      // 451: swap
      // 452: bipush 1
      // 453: swap
      // 454: aastore
      // 455: dup_x2
      // 456: dup_x2
      // 457: pop
      // 458: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45b: bipush 0
      // 45c: swap
      // 45d: aastore
      // 45e: ldc2_w 8138453451058627096
      // 461: lload 4
      // 463: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: astore 49
      // 46a: aload 43
      // 46c: iload 40
      // 46e: ifeq 484
      // 471: ifnull 4ab
      // 474: goto 482
      // 477: ldc2_w 8234868669138142380
      // 47a: lload 4
      // 47c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: athrow
      // 482: aload 43
      // 484: aload 49
      // 486: lload 38
      // 488: aload 42
      // 48a: bipush 3
      // 48b: anewarray 709
      // 48e: dup_x1
      // 48f: swap
      // 490: bipush 2
      // 491: swap
      // 492: aastore
      // 493: dup_x2
      // 494: dup_x2
      // 495: pop
      // 496: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 499: bipush 1
      // 49a: swap
      // 49b: aastore
      // 49c: dup_x1
      // 49d: swap
      // 49e: bipush 0
      // 49f: swap
      // 4a0: aastore
      // 4a1: ldc2_w 8258496233276530130
      // 4a4: lload 4
      // 4a6: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ab: aload 44
      // 4ad: iload 40
      // 4af: ifeq 4c5
      // 4b2: ifnull 4ec
      // 4b5: goto 4c3
      // 4b8: ldc2_w 8234868669138142380
      // 4bb: lload 4
      // 4bd: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: athrow
      // 4c3: aload 44
      // 4c5: lload 19
      // 4c7: aload 49
      // 4c9: aload 42
      // 4cb: bipush 3
      // 4cc: anewarray 709
      // 4cf: dup_x1
      // 4d0: swap
      // 4d1: bipush 2
      // 4d2: swap
      // 4d3: aastore
      // 4d4: dup_x1
      // 4d5: swap
      // 4d6: bipush 1
      // 4d7: swap
      // 4d8: aastore
      // 4d9: dup_x2
      // 4da: dup_x2
      // 4db: pop
      // 4dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4df: bipush 0
      // 4e0: swap
      // 4e1: aastore
      // 4e2: ldc2_w 8133036577542758325
      // 4e5: lload 4
      // 4e7: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ec: aload 45
      // 4ee: iload 40
      // 4f0: ifeq 506
      // 4f3: ifnull 52d
      // 4f6: goto 504
      // 4f9: ldc2_w 8234868669138142380
      // 4fc: lload 4
      // 4fe: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: aload 45
      // 506: lload 19
      // 508: aload 49
      // 50a: aload 42
      // 50c: bipush 3
      // 50d: anewarray 709
      // 510: dup_x1
      // 511: swap
      // 512: bipush 2
      // 513: swap
      // 514: aastore
      // 515: dup_x1
      // 516: swap
      // 517: bipush 1
      // 518: swap
      // 519: aastore
      // 51a: dup_x2
      // 51b: dup_x2
      // 51c: pop
      // 51d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 520: bipush 0
      // 521: swap
      // 522: aastore
      // 523: ldc2_w 8133036577542758325
      // 526: lload 4
      // 528: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52d: aload 46
      // 52f: iload 40
      // 531: ifeq 547
      // 534: ifnull 56e
      // 537: goto 545
      // 53a: ldc2_w 8234868669138142380
      // 53d: lload 4
      // 53f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 544: athrow
      // 545: aload 46
      // 547: lload 7
      // 549: aload 49
      // 54b: aload 42
      // 54d: bipush 3
      // 54e: anewarray 709
      // 551: dup_x1
      // 552: swap
      // 553: bipush 2
      // 554: swap
      // 555: aastore
      // 556: dup_x1
      // 557: swap
      // 558: bipush 1
      // 559: swap
      // 55a: aastore
      // 55b: dup_x2
      // 55c: dup_x2
      // 55d: pop
      // 55e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 561: bipush 0
      // 562: swap
      // 563: aastore
      // 564: ldc2_w 7622830840745743355
      // 567: lload 4
      // 569: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56e: aload 47
      // 570: iload 40
      // 572: ifeq 588
      // 575: ifnull 5af
      // 578: goto 586
      // 57b: ldc2_w 8234868669138142380
      // 57e: lload 4
      // 580: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 585: athrow
      // 586: aload 47
      // 588: lload 7
      // 58a: aload 49
      // 58c: aload 42
      // 58e: bipush 3
      // 58f: anewarray 709
      // 592: dup_x1
      // 593: swap
      // 594: bipush 2
      // 595: swap
      // 596: aastore
      // 597: dup_x1
      // 598: swap
      // 599: bipush 1
      // 59a: swap
      // 59b: aastore
      // 59c: dup_x2
      // 59d: dup_x2
      // 59e: pop
      // 59f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a2: bipush 0
      // 5a3: swap
      // 5a4: aastore
      // 5a5: ldc2_w 7622830840745743355
      // 5a8: lload 4
      // 5aa: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5af: new java/util/ArrayList
      // 5b2: dup
      // 5b3: aload 0
      // 5b4: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 5b7: arraylength
      // 5b8: invokespecial java/util/ArrayList.<init> (I)V
      // 5bb: astore 50
      // 5bd: bipush 0
      // 5be: istore 51
      // 5c0: iload 51
      // 5c2: aload 0
      // 5c3: getfield com/zelix/h_.d I
      // 5c6: if_icmpge 65f
      // 5c9: aload 0
      // 5ca: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 5cd: iload 51
      // 5cf: aaload
      // 5d0: aload 49
      // 5d2: aload 41
      // 5d4: aload 42
      // 5d6: lload 23
      // 5d8: aload 6
      // 5da: bipush 5
      // 5db: anewarray 709
      // 5de: dup_x1
      // 5df: swap
      // 5e0: bipush 4
      // 5e1: swap
      // 5e2: aastore
      // 5e3: dup_x2
      // 5e4: dup_x2
      // 5e5: pop
      // 5e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e9: bipush 3
      // 5ea: swap
      // 5eb: aastore
      // 5ec: dup_x1
      // 5ed: swap
      // 5ee: bipush 2
      // 5ef: swap
      // 5f0: aastore
      // 5f1: dup_x1
      // 5f2: swap
      // 5f3: bipush 1
      // 5f4: swap
      // 5f5: aastore
      // 5f6: dup_x1
      // 5f7: swap
      // 5f8: bipush 0
      // 5f9: swap
      // 5fa: aastore
      // 5fb: ldc2_w 8190736335689143964
      // 5fe: lload 4
      // 600: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 605: iload 40
      // 607: lload 4
      // 609: lconst_0
      // 60a: lcmp
      // 60b: ifle 66c
      // 60e: ifeq 66a
      // 611: iload 40
      // 613: ifeq 656
      // 616: goto 624
      // 619: ldc2_w 8234868669138142380
      // 61c: lload 4
      // 61e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 623: athrow
      // 624: lload 4
      // 626: lconst_0
      // 627: lcmp
      // 628: ifle 65c
      // 62b: ifne 657
      // 62e: goto 63c
      // 631: ldc2_w 8234868669138142380
      // 634: lload 4
      // 636: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63b: athrow
      // 63c: aload 50
      // 63e: aload 0
      // 63f: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 642: iload 51
      // 644: aaload
      // 645: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 648: goto 656
      // 64b: ldc2_w 8234868669138142380
      // 64e: lload 4
      // 650: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 655: athrow
      // 656: pop
      // 657: iinc 51 1
      // 65a: iload 40
      // 65c: ifne 5c0
      // 65f: aload 0
      // 660: lload 4
      // 662: lconst_0
      // 663: lcmp
      // 664: iflt 5ca
      // 667: getfield com/zelix/h_.d I
      // 66a: iload 40
      // 66c: lload 4
      // 66e: lconst_0
      // 66f: lcmp
      // 670: ifle 6b1
      // 673: ifeq 6af
      // 676: aload 50
      // 678: invokevirtual java/util/ArrayList.size ()I
      // 67b: if_icmple 6ad
      // 67e: goto 68c
      // 681: ldc2_w 8234868669138142380
      // 684: lload 4
      // 686: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68b: athrow
      // 68c: aload 50
      // 68e: invokevirtual java/util/ArrayList.size ()I
      // 691: anewarray 927
      // 694: astore 51
      // 696: aload 0
      // 697: aload 50
      // 699: aload 51
      // 69b: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 69e: checkcast [Lcom/zelix/bv;
      // 6a1: putfield com/zelix/h_.o [Lcom/zelix/bv;
      // 6a4: aload 0
      // 6a5: aload 0
      // 6a6: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 6a9: arraylength
      // 6aa: putfield com/zelix/h_.d I
      // 6ad: iload 48
      // 6af: iload 40
      // 6b1: ifeq 750
      // 6b4: ifeq 701
      // 6b7: goto 6c5
      // 6ba: ldc2_w 8234868669138142380
      // 6bd: lload 4
      // 6bf: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c4: athrow
      // 6c5: aload 0
      // 6c6: invokevirtual com/zelix/h_.x ()Lcom/zelix/h8;
      // 6c9: checkcast com/zelix/ig
      // 6cc: aload 49
      // 6ce: aload 42
      // 6d0: lload 15
      // 6d2: bipush 3
      // 6d3: anewarray 709
      // 6d6: dup_x2
      // 6d7: dup_x2
      // 6d8: pop
      // 6d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6dc: bipush 2
      // 6dd: swap
      // 6de: aastore
      // 6df: dup_x1
      // 6e0: swap
      // 6e1: bipush 1
      // 6e2: swap
      // 6e3: aastore
      // 6e4: dup_x1
      // 6e5: swap
      // 6e6: bipush 0
      // 6e7: swap
      // 6e8: aastore
      // 6e9: ldc2_w 8118006428406736020
      // 6ec: lload 4
      // 6ee: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f3: goto 701
      // 6f6: ldc2_w 8234868669138142380
      // 6f9: lload 4
      // 6fb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 700: athrow
      // 701: aload 0
      // 702: getfield com/zelix/h_.O Lcom/zelix/be;
      // 705: lload 9
      // 707: aload 41
      // 709: iload 3
      // 70a: aload 2
      // 70b: bipush 4
      // 70c: anewarray 709
      // 70f: dup_x1
      // 710: swap
      // 711: bipush 3
      // 712: swap
      // 713: aastore
      // 714: dup_x1
      // 715: swap
      // 716: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 719: bipush 2
      // 71a: swap
      // 71b: aastore
      // 71c: dup_x1
      // 71d: swap
      // 71e: bipush 1
      // 71f: swap
      // 720: aastore
      // 721: dup_x2
      // 722: dup_x2
      // 723: pop
      // 724: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 727: bipush 0
      // 728: swap
      // 729: aastore
      // 72a: ldc2_w 7571689363862359239
      // 72d: lload 4
      // 72f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 734: aload 6
      // 736: lload 13
      // 738: bipush 1
      // 739: anewarray 709
      // 73c: dup_x2
      // 73d: dup_x2
      // 73e: pop
      // 73f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 742: bipush 0
      // 743: swap
      // 744: aastore
      // 745: ldc2_w 8006262291140954953
      // 748: lload 4
      // 74a: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74f: bipush 1
      // 750: ireturn
      // 751: bipush 0
      // 752: ireturn
   }

   void M6(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 13
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 8
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/util/Map
      // 024: astore 5
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/_y4
      // 02c: astore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Long
      // 034: astore 14
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast com/zelix/lu
      // 03d: astore 10
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast com/zelix/qm
      // 046: astore 4
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast com/zelix/_8c
      // 04f: astore 2
      // 050: dup
      // 051: bipush 9
      // 053: aaload
      // 054: checkcast java/util/List
      // 057: astore 6
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast com/zelix/_fm
      // 060: astore 12
      // 062: dup
      // 063: bipush 11
      // 065: aaload
      // 066: checkcast com/zelix/we
      // 069: astore 11
      // 06b: pop
      // 06c: getstatic com/zelix/h_.a J
      // 06f: lload 8
      // 071: lxor
      // 072: lstore 8
      // 074: lload 8
      // 076: dup2
      // 077: ldc2_w 110199905194292
      // 07a: lxor
      // 07b: lstore 15
      // 07d: dup2
      // 07e: ldc2_w 71673747547004
      // 081: lxor
      // 082: lstore 17
      // 084: dup2
      // 085: ldc2_w 14089735136760
      // 088: lxor
      // 089: lstore 19
      // 08b: dup2
      // 08c: ldc2_w 43725530875994
      // 08f: lxor
      // 090: lstore 21
      // 092: pop2
      // 093: ldc2_w -1812225173530619235
      // 096: lload 8
      // 098: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: istore 23
      // 09f: aload 0
      // 0a0: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0a3: ifnull 361
      // 0a6: bipush 0
      // 0a7: istore 24
      // 0a9: aload 0
      // 0aa: getfield com/zelix/h_.d I
      // 0ad: iload 23
      // 0af: lload 8
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 13c
      // 0b6: ifne 13a
      // 0b9: ifle 131
      // 0bc: goto 0ca
      // 0bf: ldc2_w -1833148076980400021
      // 0c2: lload 8
      // 0c4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0ce: astore 25
      // 0d0: aload 25
      // 0d2: arraylength
      // 0d3: istore 26
      // 0d5: bipush 0
      // 0d6: istore 27
      // 0d8: iload 27
      // 0da: iload 26
      // 0dc: if_icmpge 131
      // 0df: aload 25
      // 0e1: iload 27
      // 0e3: aaload
      // 0e4: astore 28
      // 0e6: iload 23
      // 0e8: lload 8
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 12e
      // 0ef: ifne 12c
      // 0f2: aload 28
      // 0f4: bipush 0
      // 0f5: anewarray 709
      // 0f8: ldc2_w -2024536105112909686
      // 0fb: lload 8
      // 0fd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iload 23
      // 104: ifne 13a
      // 107: goto 115
      // 10a: ldc2_w -1833148076980400021
      // 10d: lload 8
      // 10f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 129
      // 118: goto 126
      // 11b: ldc2_w -1833148076980400021
      // 11e: lload 8
      // 120: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 24 1
      // 129: iinc 27 1
      // 12c: iload 23
      // 12e: ifeq 0d8
      // 131: lload 8
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 361
      // 138: iload 24
      // 13a: iload 23
      // 13c: lload 8
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 247
      // 143: ifne 246
      // 146: ifle 237
      // 149: goto 157
      // 14c: ldc2_w -1833148076980400021
      // 14f: lload 8
      // 151: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/h_.O Lcom/zelix/be;
      // 15b: lload 17
      // 15d: bipush 1
      // 15e: anewarray 709
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w -2221729047558933810
      // 16d: lload 8
      // 16f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: pop
      // 175: bipush 0
      // 176: istore 26
      // 178: iload 24
      // 17a: bipush 2
      // 17b: multianewarray 174 2
      // 17f: astore 25
      // 181: bipush 0
      // 182: istore 27
      // 184: iload 27
      // 186: aload 0
      // 187: getfield com/zelix/h_.d I
      // 18a: if_icmpge 224
      // 18d: aload 0
      // 18e: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 191: iload 27
      // 193: aaload
      // 194: astore 28
      // 196: iload 23
      // 198: lload 8
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: ifle 221
      // 19f: ifne 21f
      // 1a2: aload 28
      // 1a4: bipush 0
      // 1a5: anewarray 709
      // 1a8: ldc2_w -2024536105112909686
      // 1ab: lload 8
      // 1ad: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 23
      // 1b4: lload 8
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 2cb
      // 1bb: ifne 2c9
      // 1be: goto 1cc
      // 1c1: ldc2_w -1833148076980400021
      // 1c4: lload 8
      // 1c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 21c
      // 1cf: goto 1dd
      // 1d2: ldc2_w -1833148076980400021
      // 1d5: lload 8
      // 1d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 25
      // 1df: iload 26
      // 1e1: aaload
      // 1e2: bipush 0
      // 1e3: aload 28
      // 1e5: bipush 0
      // 1e6: anewarray 709
      // 1e9: ldc2_w -153547838179870672
      // 1ec: lload 8
      // 1ee: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iastore
      // 1f4: aload 25
      // 1f6: iload 26
      // 1f8: aaload
      // 1f9: bipush 1
      // 1fa: aload 28
      // 1fc: bipush 0
      // 1fd: anewarray 709
      // 200: ldc2_w -545353393368964526
      // 203: lload 8
      // 205: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: iastore
      // 20b: iinc 26 1
      // 20e: goto 21c
      // 211: ldc2_w -1833148076980400021
      // 214: lload 8
      // 216: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: iinc 27 1
      // 21f: iload 23
      // 221: ifeq 184
      // 224: lload 8
      // 226: lconst_0
      // 227: lcmp
      // 228: ifle 2c7
      // 22b: iload 23
      // 22d: lload 8
      // 22f: lconst_0
      // 230: lcmp
      // 231: iflt 2c9
      // 234: ifeq 24d
      // 237: bipush 0
      // 238: goto 246
      // 23b: ldc2_w -1833148076980400021
      // 23e: lload 8
      // 240: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: bipush 0
      // 247: multianewarray 174 2
      // 24b: astore 25
      // 24d: aload 0
      // 24e: getfield com/zelix/h_.O Lcom/zelix/be;
      // 251: aload 3
      // 252: iload 13
      // 254: lload 15
      // 256: aload 5
      // 258: aload 25
      // 25a: aload 7
      // 25c: aload 14
      // 25e: aload 10
      // 260: aload 4
      // 262: aload 2
      // 263: aload 6
      // 265: aload 12
      // 267: aload 11
      // 269: bipush 13
      // 26b: anewarray 709
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 12
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 11
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 10
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: bipush 9
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 8
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 7
      // 290: swap
      // 291: aastore
      // 292: dup_x1
      // 293: swap
      // 294: bipush 6
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 5
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 4
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: bipush 3
      // 2a5: swap
      // 2a6: aastore
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 2
      // 2ae: swap
      // 2af: aastore
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b5: bipush 1
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: ldc2_w -517556428721612684
      // 2c0: lload 8
      // 2c2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: iload 13
      // 2c9: iload 23
      // 2cb: lload 8
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: ifle 320
      // 2d2: ifne 312
      // 2d5: ifne 361
      // 2d8: goto 2e6
      // 2db: ldc2_w -1833148076980400021
      // 2de: lload 8
      // 2e0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: aload 0
      // 2e7: iload 23
      // 2e9: lload 8
      // 2eb: lconst_0
      // 2ec: lcmp
      // 2ed: iflt 340
      // 2f0: ifne 332
      // 2f3: goto 301
      // 2f6: ldc2_w -1833148076980400021
      // 2f9: lload 8
      // 2fb: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: getfield com/zelix/h_.j I
      // 304: goto 312
      // 307: ldc2_w -1833148076980400021
      // 30a: lload 8
      // 30c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: athrow
      // 312: aload 4
      // 314: lload 21
      // 316: ldc2_w -1882743122340938817
      // 319: lload 8
      // 31b: invokedynamic o (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: if_icmpge 361
      // 323: aload 0
      // 324: goto 332
      // 327: ldc2_w -1833148076980400021
      // 32a: lload 8
      // 32c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: aload 4
      // 334: lload 21
      // 336: ldc2_w -1882743122340938817
      // 339: lload 8
      // 33b: invokedynamic o (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: lload 19
      // 342: bipush 2
      // 343: anewarray 709
      // 346: dup_x2
      // 347: dup_x2
      // 348: pop
      // 349: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34c: bipush 1
      // 34d: swap
      // 34e: aastore
      // 34f: dup_x1
      // 350: swap
      // 351: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 354: bipush 0
      // 355: swap
      // 356: aastore
      // 357: ldc2_w -1895582552413938586
      // 35a: lload 8
      // 35c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: return
   }

   int i(Object[] param1) {
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
      // 04: checkcast com/zelix/_og
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/h_.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -1723556407523026818
      // 1d: lload 2
      // 1e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: aload 0
      // 26: getfield com/zelix/h_.O Lcom/zelix/be;
      // 29: iload 5
      // 2b: ifeq 4f
      // 2e: ifnull 64
      // 31: goto 3e
      // 34: ldc2_w -777669563429452847
      // 37: lload 2
      // 38: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 42: goto 4f
      // 45: ldc2_w -777669563429452847
      // 48: lload 2
      // 49: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 4
      // 51: bipush 1
      // 52: anewarray 709
      // 55: dup_x1
      // 56: swap
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w -1029527123475617213
      // 5d: lload 2
      // 5e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: ireturn
      // 64: bipush -1
      // 65: ireturn
   }

   public void E(Object[] var1) {
      r6[] var2 = (r6[])var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 132425091146257L;
      long var7 = var3 ^ 101106034072674L;
      long var9 = var3 ^ 6967150906259L;
      long var11 = var3 ^ 64580100394336L;
      this.d = var2.length;
      boolean var10000 = x44.a<"u">(3227916904603457679L, var3);
      this.o = new bv[this.d];
      int var14 = 0;
      boolean var13 = var10000;

      while (var14 < this.d) {
         r6 var15 = var2[var14];
         this.o[var14] = new bv(
            this,
            x44.a<"m">(var15, new Object[]{var7}, 4028358271117217542L, var3),
            x44.a<"m">(var15, new Object[]{var11}, 3777393573231592573L, var3),
            x44.a<"m">(var15, new Object[]{var5}, 3224503725795312497L, var3),
            x44.a<"m">(var15, new Object[]{var9}, 3464860368052996408L, var3)
         );
         var14++;
         if (var13) {
            break;
         }
      }
   }

   boolean i(Object[] param1) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/we
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/List
      // 017: astore 13
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/List
      // 01f: astore 7
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/util/List
      // 027: astore 10
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/util/List
      // 02f: astore 5
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast com/zelix/vx
      // 038: astore 12
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast java/lang/Boolean
      // 041: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 044: istore 4
      // 046: dup
      // 047: bipush 8
      // 049: aaload
      // 04a: checkcast java/lang/Boolean
      // 04d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 050: istore 11
      // 052: dup
      // 053: bipush 9
      // 055: aaload
      // 056: checkcast com/zelix/ei
      // 059: astore 6
      // 05b: dup
      // 05c: bipush 10
      // 05e: aaload
      // 05f: checkcast java/lang/Long
      // 062: invokevirtual java/lang/Long.longValue ()J
      // 065: lstore 2
      // 066: pop
      // 067: getstatic com/zelix/h_.a J
      // 06a: lload 2
      // 06b: lxor
      // 06c: lstore 2
      // 06d: lload 2
      // 06e: dup2
      // 06f: ldc2_w 67522022357680
      // 072: lxor
      // 073: lstore 14
      // 075: dup2
      // 076: ldc2_w 92396988288803
      // 079: lxor
      // 07a: dup2
      // 07b: bipush 32
      // 07d: lushr
      // 07e: l2i
      // 07f: istore 16
      // 081: dup2
      // 082: bipush 32
      // 084: lshl
      // 085: bipush 48
      // 087: lushr
      // 088: l2i
      // 089: istore 17
      // 08b: dup2
      // 08c: bipush 48
      // 08e: lshl
      // 08f: bipush 48
      // 091: lushr
      // 092: l2i
      // 093: istore 18
      // 095: pop2
      // 096: dup2
      // 097: ldc2_w 120940765736299
      // 09a: lxor
      // 09b: lstore 19
      // 09d: pop2
      // 09e: ldc2_w 1366163507402056351
      // 0a1: lload 2
      // 0a2: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: bipush 0
      // 0a8: istore 22
      // 0aa: istore 21
      // 0ac: aload 0
      // 0ad: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0b0: ifnull 1e2
      // 0b3: new java/util/ArrayList
      // 0b6: dup
      // 0b7: invokespecial java/util/ArrayList.<init> ()V
      // 0ba: astore 23
      // 0bc: new java/util/ArrayList
      // 0bf: dup
      // 0c0: invokespecial java/util/ArrayList.<init> ()V
      // 0c3: astore 24
      // 0c5: aload 0
      // 0c6: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0c9: aload 8
      // 0cb: aload 9
      // 0cd: aload 13
      // 0cf: lload 19
      // 0d1: aload 7
      // 0d3: aload 10
      // 0d5: new java/util/ArrayList
      // 0d8: dup
      // 0d9: new com/zelix/wm
      // 0dc: dup
      // 0dd: aload 0
      // 0de: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0e1: iload 16
      // 0e3: swap
      // 0e4: iload 17
      // 0e6: swap
      // 0e7: iload 18
      // 0e9: invokespecial com/zelix/wm.<init> (II[Ljava/lang/Object;I)V
      // 0ec: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0ef: aload 5
      // 0f1: aload 23
      // 0f3: aload 24
      // 0f5: iload 4
      // 0f7: iload 11
      // 0f9: aload 6
      // 0fb: bipush 13
      // 0fd: anewarray 709
      // 100: dup_x1
      // 101: swap
      // 102: bipush 12
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 10b: bipush 11
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 114: bipush 10
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 9
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 8
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 7
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 6
      // 12e: swap
      // 12f: aastore
      // 130: dup_x1
      // 131: swap
      // 132: bipush 5
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 4
      // 138: swap
      // 139: aastore
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 3
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 2
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 1243938697784124268
      // 155: lload 2
      // 156: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 24
      // 15d: invokeinterface java/util/List.size ()I 1
      // 162: iload 21
      // 164: ifeq 1e0
      // 167: ifgt 1a0
      // 16a: goto 177
      // 16d: ldc2_w 1140551219255146800
      // 170: lload 2
      // 171: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: aload 23
      // 179: invokeinterface java/util/List.size ()I 1
      // 17e: iload 21
      // 180: ifeq 1e4
      // 183: goto 190
      // 186: ldc2_w 1140551219255146800
      // 189: lload 2
      // 18a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: ifle 1e2
      // 193: goto 1a0
      // 196: ldc2_w 1140551219255146800
      // 199: lload 2
      // 19a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: aload 12
      // 1a2: aload 0
      // 1a3: getfield com/zelix/h_.O Lcom/zelix/be;
      // 1a6: aload 24
      // 1a8: aload 23
      // 1aa: lload 14
      // 1ac: bipush 4
      // 1ad: anewarray 709
      // 1b0: dup_x2
      // 1b1: dup_x2
      // 1b2: pop
      // 1b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b6: bipush 3
      // 1b7: swap
      // 1b8: aastore
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 2
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: bipush 1
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: ldc2_w 1381632451488193118
      // 1cb: lload 2
      // 1cc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/wo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: pop
      // 1d2: bipush 1
      // 1d3: goto 1e0
      // 1d6: ldc2_w 1140551219255146800
      // 1d9: lload 2
      // 1da: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: istore 22
      // 1e2: iload 22
      // 1e4: ireturn
   }

   void w(Object[] param1) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/we
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_ur
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: pop
      // 024: getstatic com/zelix/h_.a J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 83782664458032
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 116729515833364
      // 036: lxor
      // 037: lstore 9
      // 039: pop2
      // 03a: ldc2_w -8728571240149436745
      // 03d: lload 2
      // 03e: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: istore 11
      // 045: aload 0
      // 046: getfield com/zelix/h_.O Lcom/zelix/be;
      // 049: iload 11
      // 04b: ifeq 06f
      // 04e: ifnull 116
      // 051: goto 05e
      // 054: ldc2_w -7206751707564741352
      // 057: lload 2
      // 058: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 062: goto 06f
      // 065: ldc2_w -7206751707564741352
      // 068: lload 2
      // 069: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: iload 11
      // 071: lload 2
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07b
      // 077: ifeq 09b
      // 07a: bipush 0
      // 07b: anewarray 709
      // 07e: ldc2_w -8686633511853218546
      // 081: lload 2
      // 082: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: ifeq 116
      // 08a: goto 097
      // 08d: ldc2_w -7206751707564741352
      // 090: lload 2
      // 091: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: aload 0
      // 098: getfield com/zelix/h_.O Lcom/zelix/be;
      // 09b: aload 6
      // 09d: aload 5
      // 09f: lload 7
      // 0a1: invokevirtual com/zelix/be.l (Lcom/zelix/_fm;Lcom/zelix/we;J)Lcom/zelix/yg;
      // 0a4: pop
      // 0a5: goto 116
      // 0a8: astore 12
      // 0aa: aload 4
      // 0ac: new java/lang/StringBuilder
      // 0af: dup
      // 0b0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b3: aload 12
      // 0b5: ldc2_w -7324829682153883518
      // 0b8: lload 2
      // 0b9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c1: sipush 22221
      // 0c4: ldc2_w 2892640864190649110
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d4: lload 9
      // 0d6: bipush 2
      // 0d7: anewarray 709
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 1
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w -7430324374842203014
      // 0eb: lload 2
      // 0ec: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: goto 116
      // 0f4: astore 12
      // 0f6: aload 12
      // 0f8: ldc2_w -6943189211287887391
      // 0fb: lload 2
      // 0fc: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: new com/zelix/_sk
      // 104: dup
      // 105: aload 12
      // 107: ldc2_w -8703700129914390237
      // 10a: lload 2
      // 10b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 12
      // 112: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 115: athrow
      // 116: return
   }

   public void Q(Object[] var1) {
      List var9 = (List)var1[0];
      Map var11 = (Map)var1[1];
      _8c var4 = (_8c)var1[2];
      List var10 = (List)var1[3];
      _yv var8 = (_yv)var1[4];
      _ug var7 = (_ug)var1[5];
      String var5 = (String)var1[6];
      long var2 = (Long)var1[7];
      boolean var6 = (Boolean)var1[8];
      var2 = a ^ var2;
      long var12 = var2 ^ 767844631375L;
      be var10000 = this.O;
      Object[] var10011 = new Object[]{null, null, null, null, null, null, null, null, var12};
      var10011[7] = var6;
      var10011[6] = var5;
      var10011[5] = var7;
      var10011[4] = var8;
      var10011[3] = var10;
      var10011[2] = var4;
      var10011[1] = var11;
      var10011[0] = var9;
      x44.a<"j">(var10000, var10011, -1507669713486805048L, var2);
   }

   public void mO(Object[] var1) {
      long var4 = (Long)var1[0];
      Set var2 = (Set)var1[1];
      _uj var3 = (_uj)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 130633469740224L;
      x44.a<"j">(this.O, new Object[]{var2, var3, var6}, 2549727489846990825L, var4);
   }

   void X(Object[] var1) {
      long var4 = (Long)var1[0];
      _y4 var2 = (_y4)var1[1];
      PrintWriter var3 = (PrintWriter)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 107331133770575L;
      x44.a<"k">(this.O, new Object[]{var2, var6, var3}, 6251731431601083199L, var4);
   }

   public void MN(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 12
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 13
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_y4
      // 021: astore 11
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: astore 10
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/lu
      // 031: astore 3
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/qm
      // 039: astore 9
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/_8c
      // 042: astore 4
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/util/List
      // 04b: astore 8
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/lang/Long
      // 054: invokevirtual java/lang/Long.longValue ()J
      // 057: lstore 6
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast com/zelix/_fm
      // 060: astore 14
      // 062: dup
      // 063: bipush 11
      // 065: aaload
      // 066: checkcast com/zelix/we
      // 069: astore 5
      // 06b: pop
      // 06c: getstatic com/zelix/h_.a J
      // 06f: lload 6
      // 071: lxor
      // 072: lstore 6
      // 074: lload 6
      // 076: dup2
      // 077: ldc2_w 120947837672361
      // 07a: lxor
      // 07b: lstore 15
      // 07d: dup2
      // 07e: ldc2_w 17031452792419
      // 081: lxor
      // 082: lstore 17
      // 084: dup2
      // 085: ldc2_w 73126857330919
      // 088: lxor
      // 089: lstore 19
      // 08b: dup2
      // 08c: ldc2_w 116093189291333
      // 08f: lxor
      // 090: lstore 21
      // 092: pop2
      // 093: ldc2_w 5670468339383434971
      // 096: lload 6
      // 098: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: istore 23
      // 09f: aload 0
      // 0a0: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0a3: ifnull 360
      // 0a6: bipush 0
      // 0a7: istore 24
      // 0a9: aload 0
      // 0aa: getfield com/zelix/h_.d I
      // 0ad: iload 23
      // 0af: lload 6
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 13c
      // 0b6: ifeq 13a
      // 0b9: ifle 131
      // 0bc: goto 0ca
      // 0bf: ldc2_w 6021338935372162420
      // 0c2: lload 6
      // 0c4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0ce: astore 25
      // 0d0: aload 25
      // 0d2: arraylength
      // 0d3: istore 26
      // 0d5: bipush 0
      // 0d6: istore 27
      // 0d8: iload 27
      // 0da: iload 26
      // 0dc: if_icmpge 131
      // 0df: aload 25
      // 0e1: iload 27
      // 0e3: aaload
      // 0e4: astore 28
      // 0e6: iload 23
      // 0e8: lload 6
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 12e
      // 0ef: ifeq 12c
      // 0f2: aload 28
      // 0f4: bipush 0
      // 0f5: anewarray 709
      // 0f8: ldc2_w 6266804447368215957
      // 0fb: lload 6
      // 0fd: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iload 23
      // 104: ifeq 13a
      // 107: goto 115
      // 10a: ldc2_w 6021338935372162420
      // 10d: lload 6
      // 10f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 129
      // 118: goto 126
      // 11b: ldc2_w 6021338935372162420
      // 11e: lload 6
      // 120: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 24 1
      // 129: iinc 27 1
      // 12c: iload 23
      // 12e: ifne 0d8
      // 131: lload 6
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 360
      // 138: iload 24
      // 13a: iload 23
      // 13c: lload 6
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 247
      // 143: ifeq 246
      // 146: ifle 237
      // 149: goto 157
      // 14c: ldc2_w 6021338935372162420
      // 14f: lload 6
      // 151: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/h_.O Lcom/zelix/be;
      // 15b: lload 17
      // 15d: bipush 1
      // 15e: anewarray 709
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w 6067926915961292753
      // 16d: lload 6
      // 16f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: pop
      // 175: bipush 0
      // 176: istore 26
      // 178: iload 24
      // 17a: bipush 2
      // 17b: multianewarray 174 2
      // 17f: astore 25
      // 181: bipush 0
      // 182: istore 27
      // 184: iload 27
      // 186: aload 0
      // 187: getfield com/zelix/h_.d I
      // 18a: if_icmpge 224
      // 18d: aload 0
      // 18e: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 191: iload 27
      // 193: aaload
      // 194: astore 28
      // 196: iload 23
      // 198: lload 6
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: ifle 221
      // 19f: ifeq 21f
      // 1a2: aload 28
      // 1a4: bipush 0
      // 1a5: anewarray 709
      // 1a8: ldc2_w 6266804447368215957
      // 1ab: lload 6
      // 1ad: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 23
      // 1b4: lload 6
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 2ca
      // 1bb: ifeq 2c8
      // 1be: goto 1cc
      // 1c1: ldc2_w 6021338935372162420
      // 1c4: lload 6
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 21c
      // 1cf: goto 1dd
      // 1d2: ldc2_w 6021338935372162420
      // 1d5: lload 6
      // 1d7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 25
      // 1df: iload 26
      // 1e1: aaload
      // 1e2: bipush 0
      // 1e3: aload 28
      // 1e5: bipush 0
      // 1e6: anewarray 709
      // 1e9: ldc2_w 5242527914296134959
      // 1ec: lload 6
      // 1ee: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iastore
      // 1f4: aload 25
      // 1f6: iload 26
      // 1f8: aaload
      // 1f9: bipush 1
      // 1fa: aload 28
      // 1fc: bipush 0
      // 1fd: anewarray 709
      // 200: ldc2_w 5580467538195830605
      // 203: lload 6
      // 205: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: iastore
      // 20b: iinc 26 1
      // 20e: goto 21c
      // 211: ldc2_w 6021338935372162420
      // 214: lload 6
      // 216: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: iinc 27 1
      // 21f: iload 23
      // 221: ifne 184
      // 224: lload 6
      // 226: lconst_0
      // 227: lcmp
      // 228: ifle 2c7
      // 22b: iload 23
      // 22d: lload 6
      // 22f: lconst_0
      // 230: lcmp
      // 231: ifle 2c8
      // 234: ifne 24d
      // 237: bipush 0
      // 238: goto 246
      // 23b: ldc2_w 6021338935372162420
      // 23e: lload 6
      // 240: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: bipush 0
      // 247: multianewarray 174 2
      // 24b: astore 25
      // 24d: aload 0
      // 24e: getfield com/zelix/h_.O Lcom/zelix/be;
      // 251: aload 12
      // 253: lload 15
      // 255: iload 2
      // 256: aload 13
      // 258: aload 25
      // 25a: aload 11
      // 25c: aload 10
      // 25e: aload 3
      // 25f: aload 9
      // 261: aload 4
      // 263: aload 8
      // 265: aload 14
      // 267: aload 5
      // 269: bipush 13
      // 26b: anewarray 709
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 12
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 11
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 10
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: bipush 9
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 8
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 7
      // 290: swap
      // 291: aastore
      // 292: dup_x1
      // 293: swap
      // 294: bipush 6
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 5
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 4
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: bipush 3
      // 2a5: swap
      // 2a6: aastore
      // 2a7: dup_x1
      // 2a8: swap
      // 2a9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ac: bipush 2
      // 2ad: swap
      // 2ae: aastore
      // 2af: dup_x2
      // 2b0: dup_x2
      // 2b1: pop
      // 2b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b5: bipush 1
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: ldc2_w 6289997674372458993
      // 2c0: lload 6
      // 2c2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: iload 2
      // 2c8: iload 23
      // 2ca: lload 6
      // 2cc: lconst_0
      // 2cd: lcmp
      // 2ce: ifle 31f
      // 2d1: ifeq 311
      // 2d4: ifne 360
      // 2d7: goto 2e5
      // 2da: ldc2_w 6021338935372162420
      // 2dd: lload 6
      // 2df: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: athrow
      // 2e5: aload 0
      // 2e6: iload 23
      // 2e8: lload 6
      // 2ea: lconst_0
      // 2eb: lcmp
      // 2ec: iflt 33f
      // 2ef: ifeq 331
      // 2f2: goto 300
      // 2f5: ldc2_w 6021338935372162420
      // 2f8: lload 6
      // 2fa: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: athrow
      // 300: getfield com/zelix/h_.j I
      // 303: goto 311
      // 306: ldc2_w 6021338935372162420
      // 309: lload 6
      // 30b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: aload 9
      // 313: lload 21
      // 315: ldc2_w 5818766477938675360
      // 318: lload 6
      // 31a: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: if_icmpge 360
      // 322: aload 0
      // 323: goto 331
      // 326: ldc2_w 6021338935372162420
      // 329: lload 6
      // 32b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: athrow
      // 331: aload 9
      // 333: lload 21
      // 335: ldc2_w 5818766477938675360
      // 338: lload 6
      // 33a: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: lload 19
      // 341: bipush 2
      // 342: anewarray 709
      // 345: dup_x2
      // 346: dup_x2
      // 347: pop
      // 348: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34b: bipush 1
      // 34c: swap
      // 34d: aastore
      // 34e: dup_x1
      // 34f: swap
      // 350: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 353: bipush 0
      // 354: swap
      // 355: aastore
      // 356: ldc2_w 5813803953481247097
      // 359: lload 6
      // 35b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: return
   }

   int P(Object[] param1) {
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
      // 004: checkcast com/zelix/_y4
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_fm
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/we
      // 029: astore 12
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Integer
      // 031: invokevirtual java/lang/Integer.intValue ()I
      // 034: istore 4
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/lang/Integer
      // 03d: invokevirtual java/lang/Integer.intValue ()I
      // 040: istore 10
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast java/lang/Boolean
      // 049: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04c: istore 8
      // 04e: dup
      // 04f: bipush 8
      // 051: aaload
      // 052: checkcast java/lang/Boolean
      // 055: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 058: istore 11
      // 05a: dup
      // 05b: bipush 9
      // 05d: aaload
      // 05e: checkcast java/util/Map
      // 061: astore 5
      // 063: pop
      // 064: getstatic com/zelix/h_.a J
      // 067: lload 2
      // 068: lxor
      // 069: lstore 2
      // 06a: lload 2
      // 06b: dup2
      // 06c: ldc2_w 130029313735478
      // 06f: lxor
      // 070: lstore 13
      // 072: pop2
      // 073: ldc2_w 2809544748347560633
      // 076: lload 2
      // 077: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: istore 15
      // 07e: aload 0
      // 07f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 082: iload 15
      // 084: ifne 0a8
      // 087: ifnull 111
      // 08a: goto 097
      // 08d: ldc2_w 2786449811343757391
      // 090: lload 2
      // 091: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: aload 0
      // 098: getfield com/zelix/h_.O Lcom/zelix/be;
      // 09b: goto 0a8
      // 09e: ldc2_w 2786449811343757391
      // 0a1: lload 2
      // 0a2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 9
      // 0aa: aload 6
      // 0ac: aload 7
      // 0ae: lload 13
      // 0b0: aload 12
      // 0b2: iload 4
      // 0b4: iload 10
      // 0b6: iload 8
      // 0b8: iload 11
      // 0ba: aload 5
      // 0bc: bipush 10
      // 0be: anewarray 709
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: bipush 9
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x1
      // 0c8: swap
      // 0c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0cc: bipush 8
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d5: bipush 7
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de: bipush 6
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e7: bipush 5
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 4
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x2
      // 0f0: dup_x2
      // 0f1: pop
      // 0f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5: bipush 3
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 2
      // 0fb: swap
      // 0fc: aastore
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 1
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w 2378709573997153504
      // 10a: lload 2
      // 10b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: ireturn
      // 111: bipush 0
      // 112: ireturn
   }

   public boolean v(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 120452005502770L;
      return ((iu)this.x()).n(var3);
   }

   void a(Object[] var1) {
      vl var7 = (vl)var1[0];
      ig var5 = (ig)var1[1];
      Set var9 = (Set)var1[2];
      _u_ var10 = (_u_)var1[3];
      long var2 = (Long)var1[4];
      boolean var8 = (Boolean)var1[5];
      List var6 = (List)var1[6];
      _8c var4 = (_8c)var1[7];
      var2 = a ^ var2;
      long var11 = var2 ^ 86328580440899L;
      be var10000 = this.O;
      Object[] var10010 = new Object[]{null, null, null, null, null, var6, var4, var11};
      var10010[4] = var8;
      var10010[3] = var10;
      var10010[2] = var9;
      var10010[1] = var5;
      var10010[0] = var7;
      x44.a<"o">(var10000, var10010, 3740163811357980420L, var2);
   }

   public void _l(Object[] param1) {
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
      // 16: getstatic com/zelix/h_.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 3926845386278569492
      // 1f: lload 3
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: aload 0
      // 28: getfield com/zelix/h_.O Lcom/zelix/be;
      // 2b: iload 5
      // 2d: ifeq 51
      // 30: ifnull 67
      // 33: goto 40
      // 36: ldc2_w 3125337751967129019
      // 39: lload 3
      // 3a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/h_.O Lcom/zelix/be;
      // 44: goto 51
      // 47: ldc2_w 3125337751967129019
      // 4a: lload 3
      // 4b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: iload 2
      // 52: bipush 1
      // 53: anewarray 709
      // 56: dup_x1
      // 57: swap
      // 58: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w 3848932414085601882
      // 61: lload 3
      // 62: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int x(long var1) {
      long var3 = var1 ^ 3028605775979L;
      byte var10000 = x44.a<"w">(1283234628292256164L, var1);
      int var6 = 4 + x44.a<"o">(this.O, new Object[0], 1367521715740065272L, var1) + 2 + this.d * c<"o">(16662, 4888747438197973171L ^ var1) + 2;
      byte var5 = var10000;
      int var7 = 0;

      label39:
      while (var7 < this.m) {
         var6 += x44.a<"o">(this.D[var7], var3, 648668168768891666L, var1);

         try {
            var7++;
         } catch (g3 var9) {
            boolean var10001 = false;
            throw x44.a<"w">(var9, 932082578935872011L, var1);
         }

         do {
            try {
               if (var1 < 0L) {
                  return var5;
               }

               if (var5 == 0) {
                  return var6;
               }

               if (var5 != 0) {
                  continue label39;
               }
            } catch (g3 var8) {
               boolean var12 = false;
               throw x44.a<"w">(var8, 932082578935872011L, var1);
            }
         } while (var1 <= 0L);
         break;
      }

      this.C = var6;
      return var6;
   }

   void B(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_yv
      // 19: astore 2
      // 1a: pop
      // 1b: getstatic com/zelix/h_.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 55071144898729
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w 1110687395245932291
      // 2d: lload 3
      // 2e: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 8
      // 35: aload 0
      // 36: getfield com/zelix/h_.O Lcom/zelix/be;
      // 39: iload 8
      // 3b: ifeq 5f
      // 3e: ifnull 84
      // 41: goto 4e
      // 44: ldc2_w 1317425484911961260
      // 47: lload 3
      // 48: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 52: goto 5f
      // 55: ldc2_w 1317425484911961260
      // 58: lload 3
      // 59: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 5
      // 61: aload 2
      // 62: lload 6
      // 64: bipush 3
      // 65: anewarray 709
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 2
      // 6f: swap
      // 70: aastore
      // 71: dup_x1
      // 72: swap
      // 73: bipush 1
      // 74: swap
      // 75: aastore
      // 76: dup_x1
      // 77: swap
      // 78: bipush 0
      // 79: swap
      // 7a: aastore
      // 7b: ldc2_w 983004146323441235
      // 7e: lload 3
      // 7f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: return
   }

   void vm(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 1252834850082L;
      x44.a<"n">(this, new Object[]{hh.class, var4}, 507226620034664623L, var2);
   }

   boolean t(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_fm
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/we
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_8c
      // 021: astore 8
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 10
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Map
      // 031: astore 9
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/lang/Boolean
      // 03a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03d: istore 3
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 7
      // 04a: pop
      // 04b: getstatic com/zelix/h_.a J
      // 04e: lload 5
      // 050: lxor
      // 051: lstore 5
      // 053: lload 5
      // 055: dup2
      // 056: ldc2_w 82711515151919
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 48
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 11
      // 061: dup2
      // 062: bipush 16
      // 064: lshl
      // 065: bipush 48
      // 067: lushr
      // 068: l2i
      // 069: istore 12
      // 06b: dup2
      // 06c: bipush 32
      // 06e: lshl
      // 06f: bipush 32
      // 071: lushr
      // 072: l2i
      // 073: istore 13
      // 075: pop2
      // 076: dup2
      // 077: ldc2_w 25528073428516
      // 07a: lxor
      // 07b: dup2
      // 07c: bipush 56
      // 07e: lushr
      // 07f: l2i
      // 080: istore 14
      // 082: dup2
      // 083: bipush 8
      // 085: lshl
      // 086: bipush 32
      // 088: lushr
      // 089: l2i
      // 08a: istore 15
      // 08c: dup2
      // 08d: bipush 40
      // 08f: lshl
      // 090: bipush 40
      // 092: lushr
      // 093: l2i
      // 094: istore 16
      // 096: pop2
      // 097: dup2
      // 098: ldc2_w 16737335751025
      // 09b: lxor
      // 09c: lstore 17
      // 09e: dup2
      // 09f: ldc2_w 96079318429273
      // 0a2: lxor
      // 0a3: lstore 19
      // 0a5: pop2
      // 0a6: ldc2_w -681216765537499423
      // 0a9: lload 5
      // 0ab: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: istore 21
      // 0b2: aload 0
      // 0b3: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0b6: iload 21
      // 0b8: ifeq 0de
      // 0bb: ifnull 277
      // 0be: goto 0cc
      // 0c1: ldc2_w -1465271022318871218
      // 0c4: lload 5
      // 0c6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0d0: goto 0de
      // 0d3: ldc2_w -1465271022318871218
      // 0d6: lload 5
      // 0d8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 9
      // 0e0: lload 17
      // 0e2: bipush 2
      // 0e3: anewarray 709
      // 0e6: dup_x2
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ec: bipush 1
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: bipush 0
      // 0f2: swap
      // 0f3: aastore
      // 0f4: ldc2_w -1197210287798423475
      // 0f7: lload 5
      // 0f9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: istore 22
      // 100: iload 22
      // 102: iload 21
      // 104: lload 5
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 184
      // 10b: ifeq 182
      // 10e: ifne 155
      // 111: goto 11f
      // 114: ldc2_w -1465271022318871218
      // 117: lload 5
      // 119: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield com/zelix/h_.O Lcom/zelix/be;
      // 123: bipush 0
      // 124: anewarray 709
      // 127: ldc2_w -638149274045557416
      // 12a: lload 5
      // 12c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: iload 21
      // 133: ifeq 276
      // 136: goto 144
      // 139: ldc2_w -1465271022318871218
      // 13c: lload 5
      // 13e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: ifeq 275
      // 147: goto 155
      // 14a: ldc2_w -1465271022318871218
      // 14d: lload 5
      // 14f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 0
      // 156: getfield com/zelix/h_.O Lcom/zelix/be;
      // 159: lload 19
      // 15b: bipush 1
      // 15c: anewarray 709
      // 15f: dup_x2
      // 160: dup_x2
      // 161: pop
      // 162: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 165: bipush 0
      // 166: swap
      // 167: aastore
      // 168: ldc2_w -1436714809219137557
      // 16b: lload 5
      // 16d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: pop
      // 173: iload 3
      // 174: goto 182
      // 177: ldc2_w -1465271022318871218
      // 17a: lload 5
      // 17c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: iload 21
      // 184: ifeq 274
      // 187: ifeq 273
      // 18a: goto 198
      // 18d: ldc2_w -1465271022318871218
      // 190: lload 5
      // 192: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: lload 5
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 263
      // 19f: iload 7
      // 1a1: ifeq 218
      // 1a4: goto 1b2
      // 1a7: ldc2_w -1465271022318871218
      // 1aa: lload 5
      // 1ac: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: athrow
      // 1b2: aload 0
      // 1b3: aload 2
      // 1b4: aload 4
      // 1b6: iload 11
      // 1b8: i2s
      // 1b9: iload 12
      // 1bb: i2s
      // 1bc: iload 13
      // 1be: aload 8
      // 1c0: aload 10
      // 1c2: bipush 7
      // 1c4: anewarray 709
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: bipush 6
      // 1cb: swap
      // 1cc: aastore
      // 1cd: dup_x1
      // 1ce: swap
      // 1cf: bipush 5
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d7: bipush 4
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1df: bipush 3
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e7: bipush 2
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w -1020583264250260895
      // 1f7: lload 5
      // 1f9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: iload 21
      // 200: lload 5
      // 202: lconst_0
      // 203: lcmp
      // 204: iflt 272
      // 207: ifne 271
      // 20a: goto 218
      // 20d: ldc2_w -1465271022318871218
      // 210: lload 5
      // 212: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 0
      // 219: aload 2
      // 21a: iload 14
      // 21c: i2b
      // 21d: iload 15
      // 21f: aload 4
      // 221: aload 8
      // 223: aload 10
      // 225: iload 16
      // 227: bipush 7
      // 229: anewarray 709
      // 22c: dup_x1
      // 22d: swap
      // 22e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 231: bipush 6
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 5
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 4
      // 23d: swap
      // 23e: aastore
      // 23f: dup_x1
      // 240: swap
      // 241: bipush 3
      // 242: swap
      // 243: aastore
      // 244: dup_x1
      // 245: swap
      // 246: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 249: bipush 2
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x1
      // 24d: swap
      // 24e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 251: bipush 1
      // 252: swap
      // 253: aastore
      // 254: dup_x1
      // 255: swap
      // 256: bipush 0
      // 257: swap
      // 258: aastore
      // 259: ldc2_w -1104523876936560707
      // 25c: lload 5
      // 25e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: goto 271
      // 266: ldc2_w -1465271022318871218
      // 269: lload 5
      // 26b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: athrow
      // 271: bipush 1
      // 272: ireturn
      // 273: bipush 0
      // 274: ireturn
      // 275: bipush 0
      // 276: ireturn
      // 277: bipush 0
      // 278: ireturn
   }

   public void A(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/h_.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 74500522264053
      // 21: lxor
      // 22: dup2
      // 23: bipush 32
      // 25: lushr
      // 26: l2i
      // 27: istore 5
      // 29: dup2
      // 2a: bipush 32
      // 2c: lshl
      // 2d: bipush 48
      // 2f: lushr
      // 30: l2i
      // 31: istore 6
      // 33: dup2
      // 34: bipush 48
      // 36: lshl
      // 37: bipush 48
      // 39: lushr
      // 3a: l2i
      // 3b: istore 7
      // 3d: pop2
      // 3e: pop2
      // 3f: ldc2_w -4508806454835875577
      // 42: lload 3
      // 43: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: istore 8
      // 4a: iload 8
      // 4c: ifeq 7f
      // 4f: iload 2
      // 50: sipush 15617
      // 53: ldc2_w 3580602789646076933
      // 56: lload 3
      // 57: lxor
      // 58: invokedynamic o (IJ)I bsm=com/zelix/h_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: if_icmpgt 84
      // 60: goto 6d
      // 63: ldc2_w -2572651214871287128
      // 66: lload 3
      // 67: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: iload 2
      // 6f: putfield com/zelix/h_.e I
      // 72: goto 7f
      // 75: ldc2_w -2572651214871287128
      // 78: lload 3
      // 79: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: iload 8
      // 81: ifne d8
      // 84: new com/zelix/_sk
      // 87: dup
      // 88: new java/lang/StringBuilder
      // 8b: dup
      // 8c: invokespecial java/lang/StringBuilder.<init> ()V
      // 8f: sipush 24291
      // 92: ldc2_w 2705551458628738181
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9f: aload 0
      // a0: iload 5
      // a2: iload 6
      // a4: i2s
      // a5: iload 7
      // a7: i2c
      // a8: invokevirtual com/zelix/h_.r (ISC)Ljava/lang/String;
      // ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ae: sipush 3860
      // b1: ldc2_w 4879590876719304058
      // b4: lload 3
      // b5: lxor
      // b6: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be: iload 2
      // bf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c2: ldc ")"
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ca: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // cd: athrow
      // ce: ldc2_w -2572651214871287128
      // d1: lload 3
      // d2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: athrow
      // d8: return
   }

   boolean H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 12007602096501L;
      return x44.a<"h">(this.O, new Object[]{var4}, -6991544710821633698L, var2);
   }

   public void T(Object[] var1) {
      long var8 = (Long)var1[0];
      es var5 = (es)var1[1];
      Long var2 = (Long)var1[2];
      pg var3 = (pg)var1[3];
      List var4 = (List)var1[4];
      _8c var10 = (_8c)var1[5];
      String var6 = (String)var1[6];
      int var7 = (Integer)var1[7];
      var8 = a ^ var8;
      long var11 = var8 ^ 2973679681631L;
      be var10000 = this.O;
      ig var10003 = (ig)x44.a<"o">(this, new Object[0], 3482745490369919715L, var8);
      Object[] var10011 = new Object[]{null, null, null, null, null, null, var10, var6, var7};
      var10011[5] = var11;
      var10011[4] = var4;
      var10011[3] = var3;
      var10011[2] = var10003;
      var10011[1] = var2;
      var10011[0] = var5;
      x44.a<"o">(var10000, var10011, 2944766090440900565L, var8);
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 78635276897578L;
      return x44.a<"j">(this.O, new Object[]{var4}, 2857650176682134482L, var2);
   }

   _y4 u(Object[] var1) {
      Map var14 = (Map)var1[0];
      qx var24 = (qx)var1[1];
      ax var4 = (ax)var1[2];
      ax var8 = (ax)var1[3];
      ax var6 = (ax)var1[4];
      _fm var20 = (_fm)var1[5];
      Map var17 = (Map)var1[6];
      Map var22 = (Map)var1[7];
      Map var11 = (Map)var1[8];
      Map var9 = (Map)var1[9];
      _yv var5 = (_yv)var1[10];
      Map var23 = (Map)var1[11];
      _8z var18 = (_8z)var1[12];
      _y4 var2 = (_y4)var1[13];
      _8z var13 = (_8z)var1[14];
      _8z var10 = (_8z)var1[15];
      _8z var7 = (_8z)var1[16];
      Set var19 = (Set)var1[17];
      List var12 = (List)var1[18];
      List var3 = (List)var1[19];
      long var15 = (Long)var1[20];
      boolean var21 = (Boolean)var1[21];
      var15 = a ^ var15;
      long var25 = var15 ^ 96215020147530L;
      be var10000 = this.O;
      Object[] var10024 = new Object[]{
         null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var13, var10, var19, var12, var3, var21
      };
      var10024[15] = var25;
      var10024[14] = var2;
      var10024[13] = var18;
      var10024[12] = var23;
      var10024[11] = var5;
      var10024[10] = var9;
      var10024[9] = var11;
      var10024[8] = var22;
      var10024[7] = var17;
      var10024[6] = var20;
      var10024[5] = var7;
      var10024[4] = var6;
      var10024[3] = var8;
      var10024[2] = var4;
      var10024[1] = var24;
      var10024[0] = var14;
      return x44.a<"m">(var10000, var10024, -8927220927297208956L, var15);
   }

   void hU(Object[] var1) {
      ArrayList var2 = (ArrayList)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 135929482731396L;
      long var7 = var3 ^ 82242708140018L;
      boolean var10000 = x44.a<"t">(1056921629424630510L, var3);
      hh var10 = x44.a<"l">(this, new Object[]{var5}, 1304172635546310760L, var3);
      boolean var9 = var10000;

      label20: {
         try {
            var13 = var10;
            if (var9) {
               break label20;
            }

            if (var10 == null) {
               return;
            }
         } catch (g3 var11) {
            throw x44.a<"t">(var11, 1079746636852459544L, var3);
         }

         var13 = var10;
      }

      x44.a<"l">(var13, new Object[]{var2, var7}, 990005839914659153L, var3);
   }

   public List E(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 54665179876585L;
      return ((iu)this.x()).N(var3);
   }

   public int C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this.O, new Object[0], -4605744508371767529L, var2);
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
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: dup2
      // 10: ldc2_w 10727274753381
      // 13: lxor
      // 14: lstore 8
      // 16: dup2
      // 17: ldc2_w 0
      // 1a: lxor
      // 1b: lstore 10
      // 1d: pop2
      // 1e: ldc2_w -5003033307729260843
      // 21: lload 1
      // 22: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 3
      // 28: aload 0
      // 29: getfield com/zelix/h_.c Lcom/zelix/mx;
      // 2c: aload 0
      // 2d: aload 0
      // 2e: invokevirtual com/zelix/h_.x ()Lcom/zelix/h8;
      // 31: lload 8
      // 33: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 36: pop
      // 37: bipush 0
      // 38: istore 13
      // 3a: istore 12
      // 3c: iload 13
      // 3e: aload 0
      // 3f: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 42: arraylength
      // 43: if_icmpge 79
      // 46: aload 0
      // 47: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 4a: iload 13
      // 4c: aaload
      // 4d: lload 4
      // 4f: aload 3
      // 50: invokevirtual com/zelix/bv.N (JLcom/zelix/_8l;)V
      // 53: iinc 13 1
      // 56: iload 12
      // 58: lload 1
      // 59: lconst_0
      // 5a: lcmp
      // 5b: iflt 84
      // 5e: ifne 7c
      // 61: iload 12
      // 63: ifeq 3c
      // 66: lload 1
      // 67: lconst_0
      // 68: lcmp
      // 69: iflt 56
      // 6c: goto 79
      // 6f: ldc2_w -4987929063972484061
      // 72: lload 1
      // 73: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: bipush 0
      // 7a: istore 13
      // 7c: lload 1
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: iflt c6
      // 82: iload 13
      // 84: aload 0
      // 85: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 88: arraylength
      // 89: if_icmpge c6
      // 8c: aload 0
      // 8d: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 90: iload 13
      // 92: aaload
      // 93: lload 10
      // 95: aload 3
      // 96: invokevirtual com/zelix/h4.N (JLcom/zelix/_8l;)V
      // 99: iinc 13 1
      // 9c: iload 12
      // 9e: ifne fc
      // a1: goto ae
      // a4: ldc2_w -4987929063972484061
      // a7: lload 1
      // a8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: iload 12
      // b0: ifeq 7c
      // b3: lload 1
      // b4: lconst_0
      // b5: lcmp
      // b6: iflt 7c
      // b9: goto c6
      // bc: ldc2_w -4987929063972484061
      // bf: lload 1
      // c0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: aload 0
      // c7: getfield com/zelix/h_.O Lcom/zelix/be;
      // ca: iload 12
      // cc: ifne f0
      // cf: ifnull fc
      // d2: goto df
      // d5: ldc2_w -4987929063972484061
      // d8: lload 1
      // d9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: athrow
      // df: aload 0
      // e0: getfield com/zelix/h_.O Lcom/zelix/be;
      // e3: goto f0
      // e6: ldc2_w -4987929063972484061
      // e9: lload 1
      // ea: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: athrow
      // f0: lload 6
      // f2: aload 3
      // f3: ldc2_w -6451550220861479976
      // f6: lload 1
      // f7: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fc: return
   }

   public void MA(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 8
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Map
      // 01a: astore 7
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_y4
      // 022: astore 14
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Long
      // 02a: astore 12
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast com/zelix/lu
      // 032: astore 4
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast java/lang/Long
      // 03b: invokevirtual java/lang/Long.longValue ()J
      // 03e: lstore 5
      // 040: dup
      // 041: bipush 7
      // 043: aaload
      // 044: checkcast com/zelix/qm
      // 047: astore 2
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast com/zelix/_8c
      // 04f: astore 9
      // 051: dup
      // 052: bipush 9
      // 054: aaload
      // 055: checkcast java/util/List
      // 058: astore 11
      // 05a: dup
      // 05b: bipush 10
      // 05d: aaload
      // 05e: checkcast com/zelix/_fm
      // 061: astore 13
      // 063: dup
      // 064: bipush 11
      // 066: aaload
      // 067: checkcast com/zelix/we
      // 06a: astore 3
      // 06b: pop
      // 06c: getstatic com/zelix/h_.a J
      // 06f: lload 5
      // 071: lxor
      // 072: lstore 5
      // 074: lload 5
      // 076: dup2
      // 077: ldc2_w 70799333640582
      // 07a: lxor
      // 07b: lstore 15
      // 07d: dup2
      // 07e: ldc2_w 33058125452467
      // 081: lxor
      // 082: lstore 17
      // 084: dup2
      // 085: ldc2_w 92288851661367
      // 088: lxor
      // 089: lstore 19
      // 08b: dup2
      // 08c: ldc2_w 133021800628117
      // 08f: lxor
      // 090: lstore 21
      // 092: pop2
      // 093: ldc2_w -3719518623624135669
      // 096: lload 5
      // 098: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: istore 23
      // 09f: aload 0
      // 0a0: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0a3: ifnull 35f
      // 0a6: bipush 0
      // 0a7: istore 24
      // 0a9: aload 0
      // 0aa: getfield com/zelix/h_.d I
      // 0ad: iload 23
      // 0af: lload 5
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: iflt 13c
      // 0b6: ifeq 13a
      // 0b9: ifle 131
      // 0bc: goto 0ca
      // 0bf: ldc2_w -3368685140448073820
      // 0c2: lload 5
      // 0c4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0ce: astore 25
      // 0d0: aload 25
      // 0d2: arraylength
      // 0d3: istore 26
      // 0d5: bipush 0
      // 0d6: istore 27
      // 0d8: iload 27
      // 0da: iload 26
      // 0dc: if_icmpge 131
      // 0df: aload 25
      // 0e1: iload 27
      // 0e3: aaload
      // 0e4: astore 28
      // 0e6: iload 23
      // 0e8: lload 5
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 12e
      // 0ef: ifeq 12c
      // 0f2: aload 28
      // 0f4: bipush 0
      // 0f5: anewarray 709
      // 0f8: ldc2_w -3159213442966290619
      // 0fb: lload 5
      // 0fd: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iload 23
      // 104: ifeq 13a
      // 107: goto 115
      // 10a: ldc2_w -3368685140448073820
      // 10d: lload 5
      // 10f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 129
      // 118: goto 126
      // 11b: ldc2_w -3368685140448073820
      // 11e: lload 5
      // 120: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 24 1
      // 129: iinc 27 1
      // 12c: iload 23
      // 12e: ifne 0d8
      // 131: lload 5
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 35f
      // 138: iload 24
      // 13a: iload 23
      // 13c: lload 5
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 247
      // 143: ifeq 246
      // 146: ifle 237
      // 149: goto 157
      // 14c: ldc2_w -3368685140448073820
      // 14f: lload 5
      // 151: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/h_.O Lcom/zelix/be;
      // 15b: lload 17
      // 15d: bipush 1
      // 15e: anewarray 709
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w -2961809391545416447
      // 16d: lload 5
      // 16f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: pop
      // 175: bipush 0
      // 176: istore 26
      // 178: iload 24
      // 17a: bipush 2
      // 17b: multianewarray 174 2
      // 17f: astore 25
      // 181: bipush 0
      // 182: istore 27
      // 184: iload 27
      // 186: aload 0
      // 187: getfield com/zelix/h_.d I
      // 18a: if_icmpge 224
      // 18d: aload 0
      // 18e: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 191: iload 27
      // 193: aaload
      // 194: astore 28
      // 196: iload 23
      // 198: lload 5
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 221
      // 19f: ifeq 21f
      // 1a2: aload 28
      // 1a4: bipush 0
      // 1a5: anewarray 709
      // 1a8: ldc2_w -3159213442966290619
      // 1ab: lload 5
      // 1ad: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 23
      // 1b4: lload 5
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 2cb
      // 1bb: ifeq 2c9
      // 1be: goto 1cc
      // 1c1: ldc2_w -3368685140448073820
      // 1c4: lload 5
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 21c
      // 1cf: goto 1dd
      // 1d2: ldc2_w -3368685140448073820
      // 1d5: lload 5
      // 1d7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 25
      // 1df: iload 26
      // 1e1: aaload
      // 1e2: bipush 0
      // 1e3: aload 28
      // 1e5: bipush 0
      // 1e6: anewarray 709
      // 1e9: ldc2_w -3886287408910413825
      // 1ec: lload 5
      // 1ee: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iastore
      // 1f4: aload 25
      // 1f6: iload 26
      // 1f8: aaload
      // 1f9: bipush 1
      // 1fa: aload 28
      // 1fc: bipush 0
      // 1fd: anewarray 709
      // 200: ldc2_w -3485261896622254691
      // 203: lload 5
      // 205: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: iastore
      // 20b: iinc 26 1
      // 20e: goto 21c
      // 211: ldc2_w -3368685140448073820
      // 214: lload 5
      // 216: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: iinc 27 1
      // 21f: iload 23
      // 221: ifne 184
      // 224: lload 5
      // 226: lconst_0
      // 227: lcmp
      // 228: ifle 2c7
      // 22b: iload 23
      // 22d: lload 5
      // 22f: lconst_0
      // 230: lcmp
      // 231: ifle 2c9
      // 234: ifne 24d
      // 237: bipush 0
      // 238: goto 246
      // 23b: ldc2_w -3368685140448073820
      // 23e: lload 5
      // 240: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: bipush 0
      // 247: multianewarray 174 2
      // 24b: astore 25
      // 24d: aload 0
      // 24e: getfield com/zelix/h_.O Lcom/zelix/be;
      // 251: lload 15
      // 253: aload 10
      // 255: aload 7
      // 257: iload 8
      // 259: aload 25
      // 25b: aload 14
      // 25d: aload 12
      // 25f: aload 4
      // 261: aload 2
      // 262: aload 9
      // 264: aload 11
      // 266: aload 13
      // 268: aload 3
      // 269: bipush 13
      // 26b: anewarray 709
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 12
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 11
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 10
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: bipush 9
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 8
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 7
      // 290: swap
      // 291: aastore
      // 292: dup_x1
      // 293: swap
      // 294: bipush 6
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 5
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 4
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a7: bipush 3
      // 2a8: swap
      // 2a9: aastore
      // 2aa: dup_x1
      // 2ab: swap
      // 2ac: bipush 2
      // 2ad: swap
      // 2ae: aastore
      // 2af: dup_x1
      // 2b0: swap
      // 2b1: bipush 1
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x2
      // 2b5: dup_x2
      // 2b6: pop
      // 2b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: ldc2_w -3947388989210043907
      // 2c0: lload 5
      // 2c2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: iload 8
      // 2c9: iload 23
      // 2cb: lload 5
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: iflt 31f
      // 2d2: ifeq 312
      // 2d5: ifne 35f
      // 2d8: goto 2e6
      // 2db: ldc2_w -3368685140448073820
      // 2de: lload 5
      // 2e0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: aload 0
      // 2e7: iload 23
      // 2e9: lload 5
      // 2eb: lconst_0
      // 2ec: lcmp
      // 2ed: ifle 33e
      // 2f0: ifeq 331
      // 2f3: goto 301
      // 2f6: ldc2_w -3368685140448073820
      // 2f9: lload 5
      // 2fb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: getfield com/zelix/h_.j I
      // 304: goto 312
      // 307: ldc2_w -3368685140448073820
      // 30a: lload 5
      // 30c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: athrow
      // 312: aload 2
      // 313: lload 21
      // 315: ldc2_w -3310013622249403280
      // 318: lload 5
      // 31a: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: if_icmpge 35f
      // 322: aload 0
      // 323: goto 331
      // 326: ldc2_w -3368685140448073820
      // 329: lload 5
      // 32b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: athrow
      // 331: aload 2
      // 332: lload 21
      // 334: ldc2_w -3310013622249403280
      // 337: lload 5
      // 339: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: lload 19
      // 340: bipush 2
      // 341: anewarray 709
      // 344: dup_x2
      // 345: dup_x2
      // 346: pop
      // 347: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34a: bipush 1
      // 34b: swap
      // 34c: aastore
      // 34d: dup_x1
      // 34e: swap
      // 34f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 352: bipush 0
      // 353: swap
      // 354: aastore
      // 355: ldc2_w -3278947594488747095
      // 358: lload 5
      // 35a: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: return
   }

   void S(Object[] param1) {
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
      // 00c: getstatic com/zelix/h_.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 66016548547887
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 67063246590336
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 93541888586701
      // 025: lxor
      // 026: lstore 8
      // 028: pop2
      // 029: aload 0
      // 02a: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 02d: arraylength
      // 02e: istore 11
      // 030: ldc2_w 7062666809276453481
      // 033: lload 2
      // 034: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: new java/util/Vector
      // 03c: dup
      // 03d: invokespecial java/util/Vector.<init> ()V
      // 040: astore 12
      // 042: bipush 0
      // 043: istore 13
      // 045: istore 10
      // 047: iload 13
      // 049: iload 11
      // 04b: if_icmpge 151
      // 04e: aload 0
      // 04f: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 052: iload 13
      // 054: aaload
      // 055: instanceof com/zelix/ha
      // 058: iload 10
      // 05a: lload 2
      // 05b: lconst_0
      // 05c: lcmp
      // 05d: iflt 17c
      // 060: ifeq 17a
      // 063: iload 10
      // 065: lload 2
      // 066: lconst_0
      // 067: lcmp
      // 068: ifle 09d
      // 06b: ifeq 09b
      // 06e: goto 07b
      // 071: ldc2_w 9160947511715105222
      // 074: lload 2
      // 075: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: ifeq 091
      // 07e: goto 08b
      // 081: ldc2_w 9160947511715105222
      // 084: lload 2
      // 085: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: lload 2
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifgt 149
      // 091: aload 0
      // 092: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 095: iload 13
      // 097: aaload
      // 098: instanceof com/zelix/by
      // 09b: iload 10
      // 09d: ifeq 148
      // 0a0: ifeq 12d
      // 0a3: goto 0b0
      // 0a6: ldc2_w 9160947511715105222
      // 0a9: lload 2
      // 0aa: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0b4: iload 13
      // 0b6: aaload
      // 0b7: checkcast com/zelix/by
      // 0ba: astore 14
      // 0bc: aload 14
      // 0be: lload 4
      // 0c0: bipush 1
      // 0c1: anewarray 709
      // 0c4: dup_x2
      // 0c5: dup_x2
      // 0c6: pop
      // 0c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: ldc2_w 8700966031771335248
      // 0d0: lload 2
      // 0d1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: pop
      // 0d7: aload 14
      // 0d9: lload 6
      // 0db: bipush 1
      // 0dc: anewarray 709
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 9093041985966025830
      // 0eb: lload 2
      // 0ec: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: iload 10
      // 0f3: ifeq 121
      // 0f6: ifne 122
      // 0f9: goto 106
      // 0fc: ldc2_w 9160947511715105222
      // 0ff: lload 2
      // 100: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 12
      // 108: aload 0
      // 109: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 10c: iload 13
      // 10e: aaload
      // 10f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 114: goto 121
      // 117: ldc2_w 9160947511715105222
      // 11a: lload 2
      // 11b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: pop
      // 122: iload 10
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: ifle 14e
      // 12a: ifne 149
      // 12d: aload 12
      // 12f: aload 0
      // 130: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 133: iload 13
      // 135: aaload
      // 136: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13b: goto 148
      // 13e: ldc2_w 9160947511715105222
      // 141: lload 2
      // 142: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: pop
      // 149: iinc 13 1
      // 14c: iload 10
      // 14e: ifne 047
      // 151: aload 12
      // 153: invokeinterface java/util/List.size ()I 1
      // 158: istore 13
      // 15a: iload 10
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 058
      // 162: lload 2
      // 163: lconst_0
      // 164: lcmp
      // 165: iflt 16d
      // 168: ifeq 1c0
      // 16b: iload 13
      // 16d: goto 17a
      // 170: ldc2_w 9160947511715105222
      // 173: lload 2
      // 174: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: iload 11
      // 17c: if_icmpge 1a7
      // 17f: aload 0
      // 180: iload 13
      // 182: anewarray 259
      // 185: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 188: aload 0
      // 189: aload 12
      // 18b: aload 0
      // 18c: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 18f: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 194: checkcast [Lcom/zelix/h4;
      // 197: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 19a: goto 1a7
      // 19d: ldc2_w 9160947511715105222
      // 1a0: lload 2
      // 1a1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: aload 0
      // 1a9: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 1ac: arraylength
      // 1ad: putfield com/zelix/h_.m I
      // 1b0: aload 0
      // 1b1: aload 0
      // 1b2: lload 8
      // 1b4: ldc2_w 6943060442441103384
      // 1b7: lload 2
      // 1b8: invokedynamic j (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: putfield com/zelix/h_.C I
      // 1c0: return
   }

   boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 46041447295908L;
      return x44.a<"m">(this.O, new Object[]{var4}, -6758968563944925397L, var2);
   }

   public boolean p(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/h_.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 6888497386658
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: ldc2_w -5415298621946298212
      // 28: lload 3
      // 29: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: bipush 0
      // 2f: istore 8
      // 31: istore 7
      // 33: iload 8
      // 35: aload 0
      // 36: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 39: arraylength
      // 3a: if_icmpge bb
      // 3d: aload 0
      // 3e: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 41: iload 8
      // 43: aaload
      // 44: instanceof com/zelix/hh
      // 47: iload 7
      // 49: lload 3
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: ifle 54
      // 4f: ifne c2
      // 52: iload 7
      // 54: ifne b2
      // 57: goto 64
      // 5a: ldc2_w -5436396844887195030
      // 5d: lload 3
      // 5e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: lload 3
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt b8
      // 6a: ifeq b3
      // 6d: goto 7a
      // 70: ldc2_w -5436396844887195030
      // 73: lload 3
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 7e: iload 8
      // 80: aaload
      // 81: checkcast com/zelix/hh
      // 84: lload 5
      // 86: iload 2
      // 87: bipush 2
      // 88: anewarray 709
      // 8b: dup_x1
      // 8c: swap
      // 8d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 90: bipush 1
      // 91: swap
      // 92: aastore
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 0
      // 9a: swap
      // 9b: aastore
      // 9c: ldc2_w -6276769922082099311
      // 9f: lload 3
      // a0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: goto b2
      // a8: ldc2_w -5436396844887195030
      // ab: lload 3
      // ac: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: ireturn
      // b3: iinc 8 1
      // b6: iload 7
      // b8: ifeq 33
      // bb: lload 3
      // bc: lconst_0
      // bd: lcmp
      // be: iflt 3d
      // c1: bipush 0
      // c2: ireturn
   }

   int I(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 2657324520339476644
      // 15: lload 2
      // 16: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26: arraylength
      // 27: if_icmpge 6c
      // 2a: aload 0
      // 2b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2e: iload 5
      // 30: aaload
      // 31: instanceof com/zelix/h6
      // 34: iload 4
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: ifle 41
      // 3c: ifne 73
      // 3f: iload 4
      // 41: ifne 63
      // 44: goto 51
      // 47: ldc2_w 2645374215343985234
      // 4a: lload 2
      // 4b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: ifeq 64
      // 54: goto 61
      // 57: ldc2_w 2645374215343985234
      // 5a: lload 2
      // 5b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: iload 5
      // 63: ireturn
      // 64: iinc 5 1
      // 67: iload 4
      // 69: ifeq 20
      // 6c: lload 2
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: iflt 2a
      // 72: bipush -1
      // 73: ireturn
   }

   void C(Object[] param1) {
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
      // 004: checkcast java/lang/Class
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/h_.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 61587736216399
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: aload 0
      // 023: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 026: arraylength
      // 027: istore 8
      // 029: new java/util/ArrayList
      // 02c: dup
      // 02d: invokespecial java/util/ArrayList.<init> ()V
      // 030: astore 9
      // 032: ldc2_w -3461399568637887566
      // 035: lload 3
      // 036: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: bipush 0
      // 03c: istore 10
      // 03e: istore 7
      // 040: iload 10
      // 042: iload 8
      // 044: if_icmpge 09c
      // 047: aload 2
      // 048: aload 0
      // 049: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 04c: iload 10
      // 04e: aaload
      // 04f: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 052: iload 7
      // 054: lload 3
      // 055: lconst_0
      // 056: lcmp
      // 057: ifle 0c7
      // 05a: ifne 0c5
      // 05d: iload 7
      // 05f: ifne 093
      // 062: goto 06f
      // 065: ldc2_w -3485693575273989820
      // 068: lload 3
      // 069: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: ifeq 085
      // 072: goto 07f
      // 075: ldc2_w -3485693575273989820
      // 078: lload 3
      // 079: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: lload 3
      // 080: lconst_0
      // 081: lcmp
      // 082: ifgt 094
      // 085: aload 9
      // 087: aload 0
      // 088: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 08b: iload 10
      // 08d: aaload
      // 08e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 093: pop
      // 094: iinc 10 1
      // 097: iload 7
      // 099: ifeq 040
      // 09c: aload 9
      // 09e: invokeinterface java/util/List.size ()I 1
      // 0a3: istore 10
      // 0a5: iload 7
      // 0a7: lload 3
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: iflt 052
      // 0ad: lload 3
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: iflt 0b8
      // 0b3: ifne 10b
      // 0b6: iload 10
      // 0b8: goto 0c5
      // 0bb: ldc2_w -3485693575273989820
      // 0be: lload 3
      // 0bf: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: iload 8
      // 0c7: if_icmpge 0f2
      // 0ca: aload 0
      // 0cb: iload 10
      // 0cd: anewarray 259
      // 0d0: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0d3: aload 0
      // 0d4: aload 9
      // 0d6: aload 0
      // 0d7: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0da: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0df: checkcast [Lcom/zelix/h4;
      // 0e2: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0e5: goto 0f2
      // 0e8: ldc2_w -3485693575273989820
      // 0eb: lload 3
      // 0ec: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0f7: arraylength
      // 0f8: putfield com/zelix/h_.m I
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: lload 5
      // 0ff: ldc2_w -3397726503047460710
      // 102: lload 3
      // 103: invokedynamic h (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: putfield com/zelix/h_.C I
      // 10b: return
   }

   void p(Object[] var1) {
      qg var4 = (qg)var1[0];
      ax var5 = (ax)var1[1];
      long var2 = (Long)var1[2];
      List var6 = (List)var1[3];
      _fm var9 = (_fm)var1[4];
      _yv var8 = (_yv)var1[5];
      Random var7 = (Random)var1[6];
      var2 = a ^ var2;
      long var10 = var2 ^ 86001770727336L;
      x44.a<"l">(this.O, new Object[]{var4, var5, var10, var6, var9, var8, var7}, 6570633367406183559L, var2);
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 43966934429093L;
      return x44.a<"m">((iu)this.x(), var4, -3785315099841498040L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public h_(mx var1, int var2, long var3, int var5, be var6, r6[] var7) {
      var3 = a ^ var3;
      long var8 = var3 ^ 43267780897937L;
      long var10 = var3 ^ 5351983239906L;
      long var12 = var3 ^ 98391874831635L;
      long var14 = var3 ^ 111698002314208L;
      boolean var10000 = x44.a<"u">(-4666593371958112426L, var3);
      super(null, var1, var6.H(new Object[0]) + var7.length * c<"o">(27271, 4069999997468157393L ^ var3));
      boolean var16 = var10000;
      this.e = var2;
      this.j = var5;
      this.O = var6;
      x44.a<"m">(this.O, new Object[]{this}, -6719377186054214346L, var3);
      this.d = var7.length;
      this.o = new bv[this.d];
      int var17 = 0;

      label43:
      while (var17 < this.d) {
         r6 var18 = var7[var17];

         try {
            this.o[var17] = new bv(
               this,
               x44.a<"m">(var18, new Object[]{var10}, -5086879912912797306L, var3),
               x44.a<"m">(var18, new Object[]{var14}, -4977708652784678147L, var3),
               x44.a<"m">(var18, new Object[]{var8}, -6755432256773976591L, var3),
               x44.a<"m">(var18, new Object[]{var12}, -4713589790571673672L, var3)
            );
            var17++;
         } catch (g3 var20) {
            boolean var10001 = false;
            throw x44.a<"u">(var20, -6765122150905621255L, var3);
         }

         while (true) {
            try {
               var10000 = var16;
               if (var3 > 0L) {
                  if (!var16) {
                     return;
                  }

                  var10000 = var16;
               }

               if (var10000) {
                  break;
               }
            } catch (g3 var19) {
               boolean var24 = false;
               throw x44.a<"u">(var19, -6765122150905621255L, var3);
            }

            if (var3 >= 0L) {
               break label43;
            }
         }
      }

      this.m = 0;
      this.D = new h4[this.m];
   }

   void q(Object[] var1) {
      long var3 = (Long)var1[0];
      _y4 var2 = (_y4)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 106628841345430L;
      x44.a<"o">(this.O, new Object[]{var2, var5}, 1520695116127572185L, var3);
   }

   be P(Object[] var1) {
      return this.O;
   }

   public void b(Object[] var1) {
      int var5 = (Integer)var1[0];
      _uf var4 = (_uf)var1[1];
      _8c var8 = (_8c)var1[2];
      Map var3 = (Map)var1[3];
      _y4 var2 = (_y4)var1[4];
      List var11 = (List)var1[5];
      int var6 = (Integer)var1[6];
      _fm var10 = (_fm)var1[7];
      int var7 = (Integer)var1[8];
      we var9 = (we)var1[9];
      long var12 = ((long)var5 << 32 | (long)var6 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var14 = var12 ^ 138228391279108L;
      x44.a<"k">(this.O, new Object[]{var4, var8, var3, var2, var11, var10, var9, var14}, 6743882746821402092L, var12);
   }

   public void o(Object[] var1) {
      w var2 = (w)var1[0];
      long var4 = (Long)var1[1];
      Set var3 = (Set)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 122232171907924L;
      x44.a<"h">(this.O, new Object[]{var6, var2, var3}, 6563015941578709919L, var4);
   }

   public void f(Object[] param1) {
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
      // 004: checkcast com/zelix/es
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Map
      // 01f: astore 14
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/lang/Boolean
      // 027: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02a: istore 15
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/lang/Long
      // 032: invokevirtual java/lang/Long.longValue ()J
      // 035: lstore 10
      // 037: dup
      // 038: bipush 6
      // 03a: aaload
      // 03b: checkcast java/util/Map
      // 03e: astore 8
      // 040: dup
      // 041: bipush 7
      // 043: aaload
      // 044: checkcast com/zelix/_fm
      // 047: astore 18
      // 049: dup
      // 04a: bipush 8
      // 04c: aaload
      // 04d: checkcast com/zelix/we
      // 050: astore 3
      // 051: dup
      // 052: bipush 9
      // 054: aaload
      // 055: checkcast java/util/List
      // 058: astore 17
      // 05a: dup
      // 05b: bipush 10
      // 05d: aaload
      // 05e: checkcast com/zelix/qg
      // 061: astore 13
      // 063: dup
      // 064: bipush 11
      // 066: aaload
      // 067: checkcast java/util/Random
      // 06a: astore 16
      // 06c: dup
      // 06d: bipush 12
      // 06f: aaload
      // 070: checkcast com/zelix/_8c
      // 073: astore 7
      // 075: dup
      // 076: bipush 13
      // 078: aaload
      // 079: checkcast com/zelix/_ye
      // 07c: astore 12
      // 07e: dup
      // 07f: bipush 14
      // 081: aaload
      // 082: checkcast java/util/Set
      // 085: astore 2
      // 086: dup
      // 087: bipush 15
      // 089: aaload
      // 08a: checkcast com/zelix/_ur
      // 08d: astore 5
      // 08f: pop
      // 090: getstatic com/zelix/h_.a J
      // 093: lload 10
      // 095: lxor
      // 096: lstore 10
      // 098: lload 10
      // 09a: dup2
      // 09b: ldc2_w 54993001532623
      // 09e: lxor
      // 09f: lstore 19
      // 0a1: pop2
      // 0a2: ldc2_w -3716953920449808338
      // 0a5: lload 10
      // 0a7: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: istore 21
      // 0ae: aload 0
      // 0af: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0b2: iload 21
      // 0b4: ifne 0da
      // 0b7: ifnull 168
      // 0ba: goto 0c8
      // 0bd: ldc2_w -3730021327640413480
      // 0c0: lload 10
      // 0c2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0cc: goto 0da
      // 0cf: ldc2_w -3730021327640413480
      // 0d2: lload 10
      // 0d4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 6
      // 0dc: aload 9
      // 0de: aload 4
      // 0e0: aload 14
      // 0e2: iload 15
      // 0e4: aload 8
      // 0e6: aload 18
      // 0e8: aload 3
      // 0e9: aload 17
      // 0eb: aload 13
      // 0ed: lload 19
      // 0ef: aload 16
      // 0f1: aload 7
      // 0f3: aload 12
      // 0f5: aload 2
      // 0f6: aload 5
      // 0f8: bipush 16
      // 0fa: anewarray 709
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 15
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 14
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 13
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 12
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 11
      // 119: swap
      // 11a: aastore
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 10
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 9
      // 129: swap
      // 12a: aastore
      // 12b: dup_x1
      // 12c: swap
      // 12d: bipush 8
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 7
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: bipush 6
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 5
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 147: bipush 4
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 3
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 2
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 1
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w -3622051076980419386
      // 161: lload 10
      // 163: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: return
   }

   void z(Object[] var1) {
      Set var2 = (Set)var1[0];
      _uc var3 = (_uc)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 95468566277197L;
      x44.a<"n">(this.O, new Object[]{var2, var3, var6}, -5450284787557118098L, var4);
   }

   void M(Object[] var1) {
      long var6 = (Long)var1[0];
      ls var5 = (ls)var1[1];
      _z9 var4 = (_z9)var1[2];
      _fm var3 = (_fm)var1[3];
      we var2 = (we)var1[4];
      var6 = a ^ var6;
      long var8 = var6 ^ 127295808129678L;
      x44.a<"h">(this.O, new Object[]{var5, var4, var8, var3, var2}, -7528750217828141211L, var6);
   }

   boolean I(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      long var5 = var3 ^ 3746796556417L;
      return ((iu)this.x()).Q(var5);
   }

   public int L() {
      return this.e;
   }

   void g(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 83042928184101L;
      x44.a<"l">(this.O, new Object[]{var4, var5}, -742993658848594088L, var2);
   }

   void I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 93509958707519L;
      x44.a<"k">(this, new Object[]{h1.class, var4}, -7271250971503602510L, var2);
   }

   public void x(Object[] var1) {
      vl var3 = (vl)var1[0];
      ig var4 = (ig)var1[1];
      Set var5 = (Set)var1[2];
      _uj var8 = (_uj)var1[3];
      List var9 = (List)var1[4];
      long var6 = (Long)var1[5];
      _8c var2 = (_8c)var1[6];
      var6 = a ^ var6;
      long var10 = var6 ^ 42720801890058L;
      x44.a<"k">(this.O, new Object[]{var3, var4, var5, var8, var9, var2, var10}, -8253909355290138373L, var6);
   }

   final void J(Object[] param1) {
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
      // 04: checkcast com/zelix/_yv
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/_ug
      // 0f: astore 3
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/ei
      // 16: astore 2
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast com/zelix/_ur
      // 28: astore 4
      // 2a: pop
      // 2b: getstatic com/zelix/h_.a J
      // 2e: lload 5
      // 30: lxor
      // 31: lstore 5
      // 33: lload 5
      // 35: dup2
      // 36: ldc2_w 114888427623008
      // 39: lxor
      // 3a: lstore 8
      // 3c: pop2
      // 3d: ldc2_w 5659813349423807183
      // 40: lload 5
      // 42: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: bipush 0
      // 48: istore 11
      // 4a: istore 10
      // 4c: iload 11
      // 4e: aload 0
      // 4f: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 52: arraylength
      // 53: if_icmpge d0
      // 56: aload 0
      // 57: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 5a: iload 11
      // 5c: aaload
      // 5d: iload 10
      // 5f: ifne 92
      // 62: instanceof com/zelix/_yl
      // 65: lload 5
      // 67: lconst_0
      // 68: lcmp
      // 69: ifle cd
      // 6c: ifeq c8
      // 6f: goto 7d
      // 72: ldc2_w 5682774197674195001
      // 75: lload 5
      // 77: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 81: iload 11
      // 83: aaload
      // 84: goto 92
      // 87: ldc2_w 5682774197674195001
      // 8a: lload 5
      // 8c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: checkcast com/zelix/_yl
      // 95: aload 7
      // 97: aload 3
      // 98: lload 8
      // 9a: aload 2
      // 9b: aload 4
      // 9d: bipush 5
      // 9e: anewarray 709
      // a1: dup_x1
      // a2: swap
      // a3: bipush 4
      // a4: swap
      // a5: aastore
      // a6: dup_x1
      // a7: swap
      // a8: bipush 3
      // a9: swap
      // aa: aastore
      // ab: dup_x2
      // ac: dup_x2
      // ad: pop
      // ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b1: bipush 2
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: bipush 0
      // bc: swap
      // bd: aastore
      // be: ldc2_w 5704579338218934285
      // c1: lload 5
      // c3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: iinc 11 1
      // cb: iload 10
      // cd: ifeq 4c
      // d0: lload 5
      // d2: lconst_0
      // d3: lcmp
      // d4: ifle 56
      // d7: return
   }

   void Y(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 119601122061043
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 7469388452187953090
      // 1e: lload 2
      // 1f: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 28: arraylength
      // 29: istore 7
      // 2b: istore 6
      // 2d: bipush 0
      // 2e: istore 8
      // 30: iload 8
      // 32: iload 7
      // 34: if_icmpge 97
      // 37: aload 0
      // 38: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 3b: iload 8
      // 3d: aaload
      // 3e: iload 6
      // 40: ifeq 70
      // 43: instanceof com/zelix/h1
      // 46: lload 2
      // 47: lconst_0
      // 48: lcmp
      // 49: ifle 94
      // 4c: ifeq 8f
      // 4f: goto 5c
      // 52: ldc2_w 8829590793825750125
      // 55: lload 2
      // 56: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 60: iload 8
      // 62: aaload
      // 63: goto 70
      // 66: ldc2_w 8829590793825750125
      // 69: lload 2
      // 6a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: checkcast com/zelix/h1
      // 73: astore 9
      // 75: aload 9
      // 77: lload 4
      // 79: bipush 1
      // 7a: anewarray 709
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w 9197617823324258068
      // 89: lload 2
      // 8a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: iinc 8 1
      // 92: iload 6
      // 94: ifne 30
      // 97: lload 2
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt 37
      // 9d: return
   }

   void dM(Object[] var1) {
      ea var2 = (ea)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 34151140042394L;
      x44.a<"l">(this.O, new Object[]{var5, var2}, 6201052688024222713L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   h_(long var1, hc var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 3522043932763L;
      long var6 = var1 ^ 50089922098847L;
      long var8 = var1 ^ 12450652618869L;
      long var10 = var1 ^ 25486539920940L;
      long var12 = var1 ^ 61531862621726L;
      long var14 = var1 ^ 116699635760419L;
      long var16 = var1 ^ 20668474283333L;
      long var18 = var1 ^ 1887575718657L;
      long var20 = var1 ^ 38376557956492L;
      long var22 = var1 ^ 112425088818265L;
      int var24 = (int)((var1 ^ 13969502905369L) >>> 48);
      long var25 = (var1 ^ 13969502905369L) << 16 >>> 16;
      long var27 = var1 ^ 96996643541216L;
      long var29 = var1 ^ 102327224882480L;
      long var31 = var1 ^ 110102783185071L;
      long var33 = var1 ^ 35669623834772L;
      long var35 = var1 ^ 90155878449987L;
      super(var3.x(), var3.O(new Object[0]), var3.x(var22));
      this.e = x44.a<"n">(var3, new Object[]{var35}, -7763697198518340651L, var1);
      boolean var10000 = x44.a<"v">(-8243960783727444483L, var1);
      this.j = x44.a<"n">(var3, new Object[]{var6}, -7962944907679534503L, var1);
      _y4 var38 = new _y4(var20);
      boolean var37 = var10000;
      _y4 var39 = new _y4(var20);
      _y4 var40 = new _y4(var20);
      _y4 var41 = new _y4(var20);
      _y4 var42 = new _y4(var20);
      _y4 var43 = new _y4(var20);
      _y4 var44 = new _y4(var20);
      _y4 var45 = new _y4(var20);
      _y4 var46 = new _y4(var20);
      ej var47 = new ej((char)var24, var25);
      PrintWriter var48 = new PrintWriter(new StringWriter());

      try {
         this.O = new be(this, x44.a<"n">(var3, new Object[]{var27}, -7652693574015448547L, var1), var38, var39, var40, var41, var33, var42, var43, var44);
      } catch (IOException var52) {
      }

      this.d = x44.a<"n">(var3, new Object[]{var4}, -8228116169123952377L, var1);
      this.o = new bv[this.d];
      byte[] var59 = x44.a<"n">(var3, new Object[]{var12}, -7881762633004384814L, var1);
      Object[] var10004 = new Object[]{null, null, false};
      var10004[1] = var29;
      var10004[0] = var59;
      _xx var49 = x44.a<"v">(var10004, -8593423199523569715L, var1);
      int var50 = 0;

      label104: {
         label84:
         while (true) {
            if (var50 < this.d) {
               try {
                  var61 = this.o;
                  if (var1 < 0L) {
                     break label104;
                  }

                  this.o[var50] = new bv(var8, this, var49, var38, var42);
                  var50++;
               } catch (IOException var56) {
                  boolean var10001 = false;
                  throw x44.a<"v">(var56, -8019210632686016942L, var1);
               }

               do {
                  try {
                     if (!var37) {
                        break label84;
                     }

                     if (var37) {
                        continue label84;
                     }
                  } catch (IOException var55) {
                     boolean var65 = false;
                     throw x44.a<"v">(var55, -8019210632686016942L, var1);
                  }
               } while (var1 <= 0L);
            }

            this.m = x44.a<"n">(var3, new Object[]{var31}, -8171435245558164358L, var1);
            this.D = new h4[this.m];
            break;
         }

         byte[] var62 = x44.a<"n">(var3, new Object[]{var14}, -8268153567476901660L, var1);
         var10004 = new Object[]{null, null, false};
         var10004[1] = var29;
         var61 = var10004;
         var10004[0] = var62;
      }

      _xx var58 = x44.a<"v">(var61, -8593423199523569715L, var1);
      int var51 = 0;

      label63:
      while (var51 < this.m) {
         try {
            this.D[var51] = x44.a<"v">(
               new Object[]{
                  this,
                  var58,
                  x44.a<"n">(this.O, new Object[0], -8264324818452661131L, var1),
                  var45,
                  var46,
                  var39,
                  var40,
                  var41,
                  var10,
                  var42,
                  var43,
                  var44,
                  var48,
                  var38,
                  var47
               },
               -8288308402197438001L,
               var1
            );
            var51++;
         } catch (IOException var54) {
            boolean var67 = false;
            throw x44.a<"v">(var54, -8019210632686016942L, var1);
         }

         while (true) {
            try {
               var10000 = var37;
               if (var1 > 0L) {
                  if (!var37) {
                     return;
                  }

                  var10000 = var37;
               }

               if (var10000) {
                  break;
               }
            } catch (IOException var53) {
               boolean var68 = false;
               throw x44.a<"v">(var53, -8019210632686016942L, var1);
            }

            if (var1 >= 0L) {
               break label63;
            }
         }
      }

      x44.a<"n">(this, new Object[]{var18, var38, var48}, -8459025720364369018L, var1);
      x44.a<"n">(this.O, new Object[]{var16}, -7560551120233872137L, var1);
   }

   public int D() {
      return this.j;
   }

   void e(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 116222419461778L;
      x44.a<"j">(this.O, new Object[]{var5, var4}, -1945720222588742650L, var2);
   }

   public void m(Object[] param1) {
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
      // 004: checkcast com/zelix/_xp
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 7
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 3
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/String
      // 02e: astore 5
      // 030: pop
      // 031: getstatic com/zelix/h_.a J
      // 034: lload 3
      // 035: lxor
      // 036: lstore 3
      // 037: lload 3
      // 038: dup2
      // 039: ldc2_w 66211440553624
      // 03c: lxor
      // 03d: lstore 8
      // 03f: dup2
      // 040: ldc2_w 34609355744611
      // 043: lxor
      // 044: lstore 10
      // 046: dup2
      // 047: ldc2_w 133921167688668
      // 04a: lxor
      // 04b: lstore 12
      // 04d: pop2
      // 04e: ldc2_w 4683140882804208825
      // 051: lload 3
      // 052: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: istore 14
      // 059: aload 0
      // 05a: iload 14
      // 05c: ifne 080
      // 05f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 062: ifnull 13f
      // 065: goto 072
      // 068: ldc2_w 4659867258526119503
      // 06b: lload 3
      // 06c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: goto 080
      // 076: ldc2_w 4659867258526119503
      // 079: lload 3
      // 07a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: invokevirtual com/zelix/h_.L ()I
      // 083: istore 15
      // 085: iload 15
      // 087: iload 14
      // 089: lload 3
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: ifle 093
      // 08f: ifne 0d6
      // 092: iload 2
      // 093: if_icmpge 0d2
      // 096: goto 0a3
      // 099: ldc2_w 4659867258526119503
      // 09c: lload 3
      // 09d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: lload 10
      // 0a6: iload 2
      // 0a7: bipush 2
      // 0a8: anewarray 709
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: ldc2_w 6772609390886942740
      // 0bf: lload 3
      // 0c0: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: goto 0d2
      // 0c8: ldc2_w 4659867258526119503
      // 0cb: lload 3
      // 0cc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: invokevirtual com/zelix/h_.D ()I
      // 0d6: istore 16
      // 0d8: lload 3
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: ifle 108
      // 0de: iload 16
      // 0e0: iload 7
      // 0e2: if_icmpge 115
      // 0e5: aload 0
      // 0e6: iload 7
      // 0e8: lload 12
      // 0ea: bipush 2
      // 0eb: anewarray 709
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 1
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w 4870076380470639170
      // 102: lload 3
      // 103: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: goto 115
      // 10b: ldc2_w 4659867258526119503
      // 10e: lload 3
      // 10f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 0
      // 116: getfield com/zelix/h_.O Lcom/zelix/be;
      // 119: aload 6
      // 11b: aload 5
      // 11d: lload 8
      // 11f: bipush 3
      // 120: anewarray 709
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 2
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 1
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w 6504856409760628867
      // 139: lload 3
      // 13a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: return
   }

   String v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 109521815217113L;
      return x44.a<"k">((iu)this.x(), var4, -1345933548970440358L, var2);
   }

   void Z(Object[] param1) {
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
      // 00c: getstatic com/zelix/h_.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 30041983418203
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 11791599937584
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 96400849626641
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 10598540941040
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 73431912577477
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 36429410532405
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 32069119500352
      // 041: lxor
      // 042: lstore 16
      // 044: pop2
      // 045: ldc2_w -3532514406772835651
      // 048: lload 2
      // 049: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: lload 10
      // 051: invokevirtual com/zelix/h_.E (J)Ljava/util/List;
      // 054: astore 19
      // 056: istore 18
      // 058: aload 19
      // 05a: iload 18
      // 05c: ifne 071
      // 05f: ifnull 219
      // 062: goto 06f
      // 065: ldc2_w -3553608817401808821
      // 068: lload 2
      // 069: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: aload 19
      // 071: invokeinterface java/util/List.size ()I 1
      // 076: iload 18
      // 078: lload 2
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 0a6
      // 07e: ifne 0a4
      // 081: ifle 219
      // 084: goto 091
      // 087: ldc2_w -3553608817401808821
      // 08a: lload 2
      // 08b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 0
      // 092: lload 16
      // 094: invokevirtual com/zelix/h_.v (J)Z
      // 097: goto 0a4
      // 09a: ldc2_w -3553608817401808821
      // 09d: lload 2
      // 09e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 18
      // 0a6: ifne 0ba
      // 0a9: ifeq 0bd
      // 0ac: goto 0b9
      // 0af: ldc2_w -3553608817401808821
      // 0b2: lload 2
      // 0b3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: bipush 0
      // 0ba: goto 0be
      // 0bd: bipush 1
      // 0be: istore 20
      // 0c0: aload 19
      // 0c2: invokeinterface java/util/List.size ()I 1
      // 0c7: lload 8
      // 0c9: invokestatic com/zelix/sh.Q (IJ)I
      // 0cc: lload 12
      // 0ce: dup2_x1
      // 0cf: pop2
      // 0d0: bipush 2
      // 0d1: anewarray 709
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d9: bipush 1
      // 0da: swap
      // 0db: aastore
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w -3807793147156149700
      // 0e8: lload 2
      // 0e9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: astore 21
      // 0f0: bipush 0
      // 0f1: istore 22
      // 0f3: iload 22
      // 0f5: aload 19
      // 0f7: invokeinterface java/util/List.size ()I 1
      // 0fc: if_icmpge 178
      // 0ff: aload 19
      // 101: iload 22
      // 103: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 108: checkcast java/lang/String
      // 10b: astore 23
      // 10d: aload 21
      // 10f: getstatic com/zelix/h_.z Lcom/zelix/_uo;
      // 112: iload 20
      // 114: lload 4
      // 116: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 119: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 11e: pop
      // 11f: iinc 20 1
      // 122: aload 23
      // 124: ldc "D"
      // 126: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 129: iload 18
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 136
      // 131: ifne 186
      // 134: iload 18
      // 136: ifne 16a
      // 139: goto 146
      // 13c: ldc2_w -3553608817401808821
      // 13f: lload 2
      // 140: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: ifne 16d
      // 149: goto 156
      // 14c: ldc2_w -3553608817401808821
      // 14f: lload 2
      // 150: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: aload 23
      // 158: ldc "J"
      // 15a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15d: goto 16a
      // 160: ldc2_w -3553608817401808821
      // 163: lload 2
      // 164: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: ifeq 170
      // 16d: iinc 20 1
      // 170: iinc 22 1
      // 173: iload 18
      // 175: ifeq 0f3
      // 178: aload 0
      // 179: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 17c: arraylength
      // 17d: istore 22
      // 17f: lload 2
      // 180: lconst_0
      // 181: lcmp
      // 182: ifle 23f
      // 185: bipush 0
      // 186: istore 23
      // 188: iload 23
      // 18a: iload 22
      // 18c: if_icmpge 208
      // 18f: iload 18
      // 191: ifne 23f
      // 194: aload 0
      // 195: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 198: iload 23
      // 19a: aaload
      // 19b: iload 18
      // 19d: ifne 1da
      // 1a0: goto 1ad
      // 1a3: ldc2_w -3553608817401808821
      // 1a6: lload 2
      // 1a7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: instanceof com/zelix/h1
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: ifle 205
      // 1b6: ifeq 200
      // 1b9: goto 1c6
      // 1bc: ldc2_w -3553608817401808821
      // 1bf: lload 2
      // 1c0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 1ca: iload 23
      // 1cc: aaload
      // 1cd: goto 1da
      // 1d0: ldc2_w -3553608817401808821
      // 1d3: lload 2
      // 1d4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: checkcast com/zelix/h1
      // 1dd: astore 24
      // 1df: aload 24
      // 1e1: aload 21
      // 1e3: lload 14
      // 1e5: bipush 2
      // 1e6: anewarray 709
      // 1e9: dup_x2
      // 1ea: dup_x2
      // 1eb: pop
      // 1ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ef: bipush 1
      // 1f0: swap
      // 1f1: aastore
      // 1f2: dup_x1
      // 1f3: swap
      // 1f4: bipush 0
      // 1f5: swap
      // 1f6: aastore
      // 1f7: ldc2_w -3713089753051281577
      // 1fa: lload 2
      // 1fb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: iinc 23 1
      // 203: iload 18
      // 205: ifeq 188
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: iflt 232
      // 20e: iload 18
      // 210: lload 2
      // 211: lconst_0
      // 212: lcmp
      // 213: ifle 191
      // 216: ifeq 23f
      // 219: aload 0
      // 21a: lload 6
      // 21c: bipush 1
      // 21d: anewarray 709
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 0
      // 227: swap
      // 228: aastore
      // 229: ldc2_w -3837352042240684673
      // 22c: lload 2
      // 22d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: goto 23f
      // 235: ldc2_w -3553608817401808821
      // 238: lload 2
      // 239: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: return
   }

   public final void KD(Object[] param1) {
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
      // 04: checkcast java/util/Set
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/h_.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 103732723377445
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 1420317776547161055
      // 25: lload 3
      // 26: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 8
      // 2e: istore 7
      // 30: iload 8
      // 32: aload 0
      // 33: getfield com/zelix/h_.m I
      // 36: if_icmpge 9f
      // 39: aload 0
      // 3a: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 3d: iload 8
      // 3f: aaload
      // 40: iload 7
      // 42: ifeq 72
      // 45: instanceof com/zelix/_yl
      // 48: lload 3
      // 49: lconst_0
      // 4a: lcmp
      // 4b: ifle 9c
      // 4e: ifeq 97
      // 51: goto 5e
      // 54: ldc2_w 1050570495425935472
      // 57: lload 3
      // 58: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 62: iload 8
      // 64: aaload
      // 65: goto 72
      // 68: ldc2_w 1050570495425935472
      // 6b: lload 3
      // 6c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: checkcast com/zelix/_yl
      // 75: astore 9
      // 77: aload 9
      // 79: aload 2
      // 7a: lload 5
      // 7c: bipush 2
      // 7d: anewarray 709
      // 80: dup_x2
      // 81: dup_x2
      // 82: pop
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: bipush 1
      // 87: swap
      // 88: aastore
      // 89: dup_x1
      // 8a: swap
      // 8b: bipush 0
      // 8c: swap
      // 8d: aastore
      // 8e: ldc2_w 683692343796430143
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

   public void YT(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/qr
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 4
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/io/PrintWriter
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic com/zelix/h_.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 54592720025486
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 59386717414115
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 58506301582657
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 137036936681520
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 81027898348679
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 108582011185576
      // 05c: lxor
      // 05d: lstore 18
      // 05f: pop2
      // 060: aload 4
      // 062: lload 14
      // 064: bipush 1
      // 065: anewarray 709
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w -6518376707434724678
      // 074: lload 5
      // 076: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: astore 21
      // 07d: ldc2_w -4859451968046396187
      // 080: lload 5
      // 082: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: aload 0
      // 088: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 08b: arraylength
      // 08c: istore 22
      // 08e: new java/util/ArrayList
      // 091: dup
      // 092: invokespecial java/util/ArrayList.<init> ()V
      // 095: astore 23
      // 097: bipush 0
      // 098: istore 24
      // 09a: istore 20
      // 09c: iload 24
      // 09e: iload 22
      // 0a0: if_icmpge 39f
      // 0a3: aload 0
      // 0a4: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0a7: iload 24
      // 0a9: aaload
      // 0aa: instanceof com/zelix/bb
      // 0ad: iload 20
      // 0af: lload 5
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: iflt 3cd
      // 0b6: ifeq 3cb
      // 0b9: iload 20
      // 0bb: ifeq 27d
      // 0be: goto 0cc
      // 0c1: ldc2_w -6796396807545956534
      // 0c4: lload 5
      // 0c6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: lload 5
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: iflt 26f
      // 0d3: ifeq 265
      // 0d6: goto 0e4
      // 0d9: ldc2_w -6796396807545956534
      // 0dc: lload 5
      // 0de: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 3
      // 0e5: ldc2_w -6529827211122723589
      // 0e8: lload 5
      // 0ea: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: iload 20
      // 0f1: lload 5
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 27f
      // 0f8: ifeq 27d
      // 0fb: goto 109
      // 0fe: ldc2_w -6796396807545956534
      // 101: lload 5
      // 103: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: ifeq 265
      // 10c: goto 11a
      // 10f: ldc2_w -6796396807545956534
      // 112: lload 5
      // 114: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 0
      // 11b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 11e: iload 24
      // 120: aaload
      // 121: checkcast com/zelix/bb
      // 124: astore 25
      // 126: iload 20
      // 128: lload 5
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 25b
      // 12f: ifeq 259
      // 132: aload 4
      // 134: ldc2_w -6756111005728795730
      // 137: lload 5
      // 139: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: ifeq 1db
      // 141: goto 14f
      // 144: ldc2_w -6796396807545956534
      // 147: lload 5
      // 149: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 21
      // 151: new java/lang/StringBuilder
      // 154: dup
      // 155: invokespecial java/lang/StringBuilder.<init> ()V
      // 158: sipush 7105
      // 15b: ldc2_w 5624695030093620300
      // 15e: lload 5
      // 160: lxor
      // 161: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: aload 25
      // 16b: bipush 0
      // 16c: anewarray 709
      // 16f: ldc2_w -4780174832396529891
      // 172: lload 5
      // 174: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: sipush 5179
      // 17f: ldc2_w 2646279064829176755
      // 182: lload 5
      // 184: lxor
      // 185: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: aload 0
      // 18e: lload 16
      // 190: bipush 1
      // 191: anewarray 709
      // 194: dup_x2
      // 195: dup_x2
      // 196: pop
      // 197: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19a: bipush 0
      // 19b: swap
      // 19c: aastore
      // 19d: ldc2_w -4991510752179706644
      // 1a0: lload 5
      // 1a2: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: sipush 30056
      // 1ad: ldc2_w 8125378614349908718
      // 1b0: lload 5
      // 1b2: lxor
      // 1b3: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bb: aload 0
      // 1bc: lload 10
      // 1be: invokevirtual com/zelix/h_.k (J)Ljava/lang/String;
      // 1c1: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ca: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1cd: goto 1db
      // 1d0: ldc2_w -6796396807545956534
      // 1d3: lload 5
      // 1d5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: aload 7
      // 1dd: new java/lang/StringBuilder
      // 1e0: dup
      // 1e1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e4: sipush 8911
      // 1e7: ldc2_w 1929582317051747652
      // 1ea: lload 5
      // 1ec: lxor
      // 1ed: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f5: aload 25
      // 1f7: bipush 0
      // 1f8: anewarray 709
      // 1fb: ldc2_w -4780174832396529891
      // 1fe: lload 5
      // 200: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 208: sipush 20295
      // 20b: ldc2_w 8061946289247580356
      // 20e: lload 5
      // 210: lxor
      // 211: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: aload 0
      // 21a: lload 16
      // 21c: bipush 1
      // 21d: anewarray 709
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 0
      // 227: swap
      // 228: aastore
      // 229: ldc2_w -4991510752179706644
      // 22c: lload 5
      // 22e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: sipush 17286
      // 239: ldc2_w 8040031582490360838
      // 23c: lload 5
      // 23e: lxor
      // 23f: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: aload 0
      // 248: lload 10
      // 24a: invokevirtual com/zelix/h_.k (J)Ljava/lang/String;
      // 24d: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 250: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 253: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 256: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 259: iload 20
      // 25b: lload 5
      // 25d: lconst_0
      // 25e: lcmp
      // 25f: iflt 39c
      // 262: ifne 397
      // 265: aload 0
      // 266: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 269: iload 24
      // 26b: aaload
      // 26c: instanceof com/zelix/_yl
      // 26f: goto 27d
      // 272: ldc2_w -6796396807545956534
      // 275: lload 5
      // 277: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: iload 20
      // 27f: ifeq 396
      // 282: ifeq 37a
      // 285: goto 293
      // 288: ldc2_w -6796396807545956534
      // 28b: lload 5
      // 28d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: athrow
      // 293: aload 3
      // 294: ldc2_w -5063500800617578396
      // 297: lload 5
      // 299: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: iload 20
      // 2a0: ifeq 396
      // 2a3: goto 2b1
      // 2a6: ldc2_w -6796396807545956534
      // 2a9: lload 5
      // 2ab: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: ifeq 37a
      // 2b4: goto 2c2
      // 2b7: ldc2_w -6796396807545956534
      // 2ba: lload 5
      // 2bc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: aload 0
      // 2c3: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2c6: iload 24
      // 2c8: aaload
      // 2c9: checkcast com/zelix/_yl
      // 2cc: astore 25
      // 2ce: aload 2
      // 2cf: lload 18
      // 2d1: bipush 1
      // 2d2: anewarray 709
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: ldc2_w -6473423171436526138
      // 2e1: lload 5
      // 2e3: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: iload 20
      // 2ea: lload 5
      // 2ec: lconst_0
      // 2ed: lcmp
      // 2ee: ifle 344
      // 2f1: ifeq 342
      // 2f4: ifeq 36e
      // 2f7: goto 305
      // 2fa: ldc2_w -6796396807545956534
      // 2fd: lload 5
      // 2ff: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: athrow
      // 305: aload 25
      // 307: aload 2
      // 308: aload 4
      // 30a: lload 8
      // 30c: aload 7
      // 30e: bipush 4
      // 30f: anewarray 709
      // 312: dup_x1
      // 313: swap
      // 314: bipush 3
      // 315: swap
      // 316: aastore
      // 317: dup_x2
      // 318: dup_x2
      // 319: pop
      // 31a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31d: bipush 2
      // 31e: swap
      // 31f: aastore
      // 320: dup_x1
      // 321: swap
      // 322: bipush 1
      // 323: swap
      // 324: aastore
      // 325: dup_x1
      // 326: swap
      // 327: bipush 0
      // 328: swap
      // 329: aastore
      // 32a: ldc2_w -6805855662632841338
      // 32d: lload 5
      // 32f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: goto 342
      // 337: ldc2_w -6796396807545956534
      // 33a: lload 5
      // 33c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: iload 20
      // 344: ifeq 36d
      // 347: ifeq 35f
      // 34a: goto 358
      // 34d: ldc2_w -6796396807545956534
      // 350: lload 5
      // 352: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: athrow
      // 358: lload 5
      // 35a: lconst_0
      // 35b: lcmp
      // 35c: ifge 36e
      // 35f: aload 23
      // 361: aload 0
      // 362: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 365: iload 24
      // 367: aaload
      // 368: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 36d: pop
      // 36e: iload 20
      // 370: lload 5
      // 372: lconst_0
      // 373: lcmp
      // 374: ifle 39c
      // 377: ifne 397
      // 37a: aload 23
      // 37c: aload 0
      // 37d: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 380: iload 24
      // 382: aaload
      // 383: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 388: goto 396
      // 38b: ldc2_w -6796396807545956534
      // 38e: lload 5
      // 390: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: athrow
      // 396: pop
      // 397: iinc 24 1
      // 39a: iload 20
      // 39c: ifne 09c
      // 39f: aload 23
      // 3a1: invokeinterface java/util/List.size ()I 1
      // 3a6: istore 24
      // 3a8: iload 20
      // 3aa: lload 5
      // 3ac: lconst_0
      // 3ad: lcmp
      // 3ae: iflt 0ad
      // 3b1: lload 5
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: iflt 3bd
      // 3b8: ifeq 40b
      // 3bb: iload 24
      // 3bd: goto 3cb
      // 3c0: ldc2_w -6796396807545956534
      // 3c3: lload 5
      // 3c5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: athrow
      // 3cb: iload 22
      // 3cd: if_icmpge 3f1
      // 3d0: aload 0
      // 3d1: aload 23
      // 3d3: iload 24
      // 3d5: anewarray 259
      // 3d8: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 3dd: checkcast [Lcom/zelix/h4;
      // 3e0: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // 3e3: goto 3f1
      // 3e6: ldc2_w -6796396807545956534
      // 3e9: lload 5
      // 3eb: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: athrow
      // 3f1: aload 0
      // 3f2: aload 0
      // 3f3: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 3f6: arraylength
      // 3f7: putfield com/zelix/h_.m I
      // 3fa: aload 0
      // 3fb: aload 0
      // 3fc: lload 12
      // 3fe: ldc2_w -4695331868665682284
      // 401: lload 5
      // 403: invokedynamic n (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: putfield com/zelix/h_.C I
      // 40b: return
   }

   hh S(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 2930334317670833390
      // 15: lload 2
      // 16: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifne 63
      // 36: instanceof com/zelix/hh
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w 2953328701428948504
      // 48: lload 2
      // 49: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w 2953328701428948504
      // 5c: lload 2
      // 5d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/hh
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifeq 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 2a
      // 75: aconst_null
      // 76: areturn
   }

   int[] X(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 8
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
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/lang/String
      // 039: astore 4
      // 03b: dup
      // 03c: bipush 6
      // 03e: aaload
      // 03f: checkcast java/util/List
      // 042: astore 5
      // 044: pop
      // 045: getstatic com/zelix/h_.a J
      // 048: lload 8
      // 04a: lxor
      // 04b: lstore 8
      // 04d: lload 8
      // 04f: dup2
      // 050: ldc2_w 6231446529814
      // 053: lxor
      // 054: lstore 10
      // 056: dup2
      // 057: ldc2_w 49971370050654
      // 05a: lxor
      // 05b: lstore 12
      // 05d: dup2
      // 05e: ldc2_w 83305994707681
      // 061: lxor
      // 062: lstore 14
      // 064: pop2
      // 065: ldc2_w 7043886943263741316
      // 068: lload 8
      // 06a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: istore 16
      // 071: aload 0
      // 072: iload 16
      // 074: ifne 09a
      // 077: getfield com/zelix/h_.O Lcom/zelix/be;
      // 07a: ifnull 15a
      // 07d: goto 08b
      // 080: ldc2_w 7031841531727452018
      // 083: lload 8
      // 085: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 0
      // 08c: goto 09a
      // 08f: ldc2_w 7031841531727452018
      // 092: lload 8
      // 094: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: invokevirtual com/zelix/h_.L ()I
      // 09d: istore 17
      // 09f: iload 17
      // 0a1: iload 16
      // 0a3: lload 8
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: ifle 0af
      // 0aa: ifne 0f6
      // 0ad: iload 6
      // 0af: if_icmpge 0f2
      // 0b2: goto 0c0
      // 0b5: ldc2_w 7031841531727452018
      // 0b8: lload 8
      // 0ba: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: lload 12
      // 0c3: iload 6
      // 0c5: bipush 2
      // 0c6: anewarray 709
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ce: bipush 1
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w 8989209403879217449
      // 0dd: lload 8
      // 0df: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 0f2
      // 0e7: ldc2_w 7031841531727452018
      // 0ea: lload 8
      // 0ec: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: invokevirtual com/zelix/h_.D ()I
      // 0f6: istore 18
      // 0f8: aload 0
      // 0f9: iload 18
      // 0fb: iload 3
      // 0fc: iadd
      // 0fd: lload 14
      // 0ff: bipush 2
      // 100: anewarray 709
      // 103: dup_x2
      // 104: dup_x2
      // 105: pop
      // 106: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 109: bipush 1
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w 7109159209356286847
      // 117: lload 8
      // 119: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: aload 0
      // 11f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 122: aload 7
      // 124: lload 10
      // 126: iload 2
      // 127: aload 4
      // 129: aload 5
      // 12b: bipush 5
      // 12c: anewarray 709
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 4
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 3
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13e: bipush 2
      // 13f: swap
      // 140: aastore
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 1
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w 7277073589199844235
      // 152: lload 8
      // 154: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: areturn
      // 15a: aconst_null
      // 15b: areturn
   }

   void R(Object[] var1) {
      long var4 = (Long)var1[0];
      vl var2 = (vl)var1[1];
      ig var6 = (ig)var1[2];
      Set var3 = (Set)var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 85903227704754L;
      x44.a<"m">(this.O, new Object[]{var2, var6, var3, var7}, 8460277092443060730L, var4);
   }

   public void L(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Set
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/Set
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic com/zelix/h_.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 55745864949360
      // 039: lxor
      // 03a: dup2
      // 03b: bipush 48
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 8
      // 041: dup2
      // 042: bipush 16
      // 044: lshl
      // 045: bipush 48
      // 047: lushr
      // 048: l2i
      // 049: istore 9
      // 04b: dup2
      // 04c: bipush 32
      // 04e: lshl
      // 04f: bipush 32
      // 051: lushr
      // 052: l2i
      // 053: istore 10
      // 055: pop2
      // 056: dup2
      // 057: ldc2_w 63426949429700
      // 05a: lxor
      // 05b: lstore 11
      // 05d: dup2
      // 05e: ldc2_w 135123344716671
      // 061: lxor
      // 062: lstore 13
      // 064: dup2
      // 065: ldc2_w 81862349534223
      // 068: lxor
      // 069: lstore 15
      // 06b: dup2
      // 06c: ldc2_w 45168229110433
      // 06f: lxor
      // 070: lstore 17
      // 072: dup2
      // 073: ldc2_w 125316014518137
      // 076: lxor
      // 077: lstore 19
      // 079: dup2
      // 07a: ldc2_w 138185281948220
      // 07d: lxor
      // 07e: lstore 21
      // 080: pop2
      // 081: ldc2_w 7415931889756362368
      // 084: lload 5
      // 086: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: getfield com/zelix/h_.O Lcom/zelix/be;
      // 08f: aload 4
      // 091: aload 3
      // 092: aload 2
      // 093: lload 15
      // 095: aload 7
      // 097: bipush 5
      // 098: anewarray 709
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 4
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 3
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 2
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 8761160907862833522
      // 0bb: lload 5
      // 0bd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: istore 23
      // 0c4: aload 0
      // 0c5: lload 19
      // 0c7: invokevirtual com/zelix/h_.d (J)Lcom/zelix/hz;
      // 0ca: astore 24
      // 0cc: bipush 0
      // 0cd: istore 25
      // 0cf: iload 25
      // 0d1: aload 0
      // 0d2: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0d5: arraylength
      // 0d6: if_icmpge 1b6
      // 0d9: aload 0
      // 0da: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 0dd: iload 25
      // 0df: aaload
      // 0e0: astore 26
      // 0e2: aload 26
      // 0e4: lload 21
      // 0e6: invokevirtual com/zelix/bv.W (J)Ljava/lang/String;
      // 0e9: astore 27
      // 0eb: lload 11
      // 0ed: aload 27
      // 0ef: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 0f2: astore 28
      // 0f4: iload 23
      // 0f6: lload 5
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 1b3
      // 0fd: ifeq 1b1
      // 100: aload 28
      // 102: ifnull 1ae
      // 105: goto 113
      // 108: ldc2_w 8920282798614449455
      // 10b: lload 5
      // 10d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 24
      // 115: iload 8
      // 117: i2s
      // 118: iload 9
      // 11a: i2c
      // 11b: iload 10
      // 11d: invokevirtual com/zelix/hz.U (SCI)Z
      // 120: iload 23
      // 122: ifeq 1ad
      // 125: goto 133
      // 128: ldc2_w 8920282798614449455
      // 12b: lload 5
      // 12d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: ifeq 1a4
      // 136: goto 144
      // 139: ldc2_w 8920282798614449455
      // 13c: lload 5
      // 13e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: aload 28
      // 146: lload 17
      // 148: invokevirtual com/zelix/hy.B (J)Z
      // 14b: iload 23
      // 14d: ifeq 1ad
      // 150: goto 15e
      // 153: ldc2_w 8920282798614449455
      // 156: lload 5
      // 158: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: ifeq 1a4
      // 161: goto 16f
      // 164: ldc2_w 8920282798614449455
      // 167: lload 5
      // 169: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: aload 28
      // 171: aload 24
      // 173: bipush 0
      // 174: anewarray 709
      // 177: ldc2_w 6978464951990738931
      // 17a: lload 5
      // 17c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: lload 13
      // 183: bipush 2
      // 184: anewarray 709
      // 187: dup_x2
      // 188: dup_x2
      // 189: pop
      // 18a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18d: bipush 1
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 0
      // 193: swap
      // 194: aastore
      // 195: ldc2_w 8878515542484958758
      // 198: lload 5
      // 19a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: checkcast com/zelix/hy
      // 1a2: astore 28
      // 1a4: aload 4
      // 1a6: aload 28
      // 1a8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1ad: pop
      // 1ae: iinc 25 1
      // 1b1: iload 23
      // 1b3: ifne 0cf
      // 1b6: return
   }

   iu n(Object[] var1) {
      return (iu)this.x();
   }

   void s(Object[] var1) {
      long var3 = (Long)var1[0];
      PrintWriter var2 = (PrintWriter)var1[1];
      int var5 = (Integer)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 35984393540832L;
      boolean var8 = x44.a<"v">(6178924164586890709L, var3);

      be var10000;
      label22: {
         try {
            var10000 = this.O;
            if (!var8) {
               break label22;
            }

            if (this.O == null) {
               return;
            }
         } catch (g3 var9) {
            throw x44.a<"v">(var9, 5232736334822325882L, var3);
         }

         var10000 = this.O;
      }

      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = var5;
      var10005[0] = var2;
      x44.a<"n">(var10000, var10005, 5256881700577085168L, var3);
   }

   boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 53536236841785L;
      return ((iu)this.x()).V(var4);
   }

   public void Lb(Object[] param1) {
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
      // 0e: checkcast java/util/HashMap
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/h_.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 16384622360469
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -5376552641280638682
      // 26: lload 2
      // 27: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 32: iload 7
      // 34: ifne 58
      // 37: ifnull 77
      // 3a: goto 47
      // 3d: ldc2_w -5389592020596767792
      // 40: lload 2
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/h_.O Lcom/zelix/be;
      // 4b: goto 58
      // 4e: ldc2_w -5389592020596767792
      // 51: lload 2
      // 52: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 4
      // 5a: lload 5
      // 5c: bipush 2
      // 5d: anewarray 709
      // 60: dup_x2
      // 61: dup_x2
      // 62: pop
      // 63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66: bipush 1
      // 67: swap
      // 68: aastore
      // 69: dup_x1
      // 6a: swap
      // 6b: bipush 0
      // 6c: swap
      // 6d: aastore
      // 6e: ldc2_w -5230093175649262619
      // 71: lload 2
      // 72: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: return
   }

   void r(Object[] param1) {
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
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_8c
      // 012: astore 6
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/ArrayList
      // 01a: astore 4
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/Long
      // 022: invokevirtual java/lang/Long.longValue ()J
      // 025: lstore 7
      // 027: dup
      // 028: bipush 4
      // 029: aaload
      // 02a: checkcast com/zelix/_fm
      // 02d: astore 3
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/we
      // 034: astore 2
      // 035: pop
      // 036: getstatic com/zelix/h_.a J
      // 039: lload 7
      // 03b: lxor
      // 03c: lstore 7
      // 03e: lload 7
      // 040: dup2
      // 041: ldc2_w 125481997769713
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 73908237952133
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 122699831588199
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 125344694518419
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 122181461135879
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 78887979162746
      // 067: lxor
      // 068: lstore 19
      // 06a: pop2
      // 06b: ldc2_w -8112195873486554321
      // 06e: lload 7
      // 070: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: istore 21
      // 077: aload 0
      // 078: getfield com/zelix/h_.O Lcom/zelix/be;
      // 07b: ifnull 224
      // 07e: new com/zelix/_y4
      // 081: dup
      // 082: lload 17
      // 084: invokespecial com/zelix/_y4.<init> (J)V
      // 087: astore 22
      // 089: aconst_null
      // 08a: astore 23
      // 08c: aload 0
      // 08d: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 090: arraylength
      // 091: istore 24
      // 093: bipush 0
      // 094: istore 25
      // 096: iload 25
      // 098: iload 24
      // 09a: if_icmpge 19a
      // 09d: aload 0
      // 09e: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0a1: iload 25
      // 0a3: aaload
      // 0a4: iload 21
      // 0a6: ifne 0f3
      // 0a9: instanceof com/zelix/hp
      // 0ac: lload 7
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 1ef
      // 0b3: iload 21
      // 0b5: ifne 1ef
      // 0b8: goto 0c6
      // 0bb: ldc2_w -8125259458701231655
      // 0be: lload 7
      // 0c0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: lload 7
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: ifle 197
      // 0cd: ifeq 192
      // 0d0: goto 0de
      // 0d3: ldc2_w -8125259458701231655
      // 0d6: lload 7
      // 0d8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0e2: iload 25
      // 0e4: aaload
      // 0e5: goto 0f3
      // 0e8: ldc2_w -8125259458701231655
      // 0eb: lload 7
      // 0ed: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: checkcast com/zelix/hp
      // 0f6: astore 26
      // 0f8: aload 23
      // 0fa: iload 21
      // 0fc: ifne 129
      // 0ff: ifnonnull 12b
      // 102: goto 110
      // 105: ldc2_w -8125259458701231655
      // 108: lload 7
      // 10a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: aload 0
      // 111: getfield com/zelix/h_.O Lcom/zelix/be;
      // 114: aload 3
      // 115: aload 2
      // 116: lload 9
      // 118: invokevirtual com/zelix/be.l (Lcom/zelix/_fm;Lcom/zelix/we;J)Lcom/zelix/yg;
      // 11b: goto 129
      // 11e: ldc2_w -8125259458701231655
      // 121: lload 7
      // 123: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: astore 23
      // 12b: aload 26
      // 12d: iload 5
      // 12f: aload 0
      // 130: getfield com/zelix/h_.j I
      // 133: lload 15
      // 135: aload 23
      // 137: aload 6
      // 139: aload 4
      // 13b: aload 0
      // 13c: getfield com/zelix/h_.O Lcom/zelix/be;
      // 13f: bipush 0
      // 140: anewarray 709
      // 143: ldc2_w -7871036894855617538
      // 146: lload 7
      // 148: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/te; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: aload 22
      // 14f: bipush 8
      // 151: anewarray 709
      // 154: dup_x1
      // 155: swap
      // 156: bipush 7
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 6
      // 15e: swap
      // 15f: aastore
      // 160: dup_x1
      // 161: swap
      // 162: bipush 5
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 4
      // 168: swap
      // 169: aastore
      // 16a: dup_x1
      // 16b: swap
      // 16c: bipush 3
      // 16d: swap
      // 16e: aastore
      // 16f: dup_x2
      // 170: dup_x2
      // 171: pop
      // 172: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 175: bipush 2
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: bipush 0
      // 186: swap
      // 187: aastore
      // 188: ldc2_w -7545551133860918447
      // 18b: lload 7
      // 18d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: iinc 25 1
      // 195: iload 21
      // 197: ifeq 096
      // 19a: lload 7
      // 19c: lconst_0
      // 19d: lcmp
      // 19e: ifle 09d
      // 1a1: aload 23
      // 1a3: iload 21
      // 1a5: ifne 1bb
      // 1a8: ifnull 1d4
      // 1ab: goto 1b9
      // 1ae: ldc2_w -8125259458701231655
      // 1b1: lload 7
      // 1b3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 23
      // 1bb: lload 13
      // 1bd: bipush 1
      // 1be: anewarray 709
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 0
      // 1c8: swap
      // 1c9: aastore
      // 1ca: ldc2_w -7895210522527910340
      // 1cd: lload 7
      // 1cf: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: aload 22
      // 1d6: lload 11
      // 1d8: bipush 1
      // 1d9: anewarray 709
      // 1dc: dup_x2
      // 1dd: dup_x2
      // 1de: pop
      // 1df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e2: bipush 0
      // 1e3: swap
      // 1e4: aastore
      // 1e5: ldc2_w -8307097108945126916
      // 1e8: lload 7
      // 1ea: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: ifle 224
      // 1f2: aload 0
      // 1f3: getfield com/zelix/h_.O Lcom/zelix/be;
      // 1f6: aload 22
      // 1f8: lload 19
      // 1fa: bipush 2
      // 1fb: anewarray 709
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 1
      // 205: swap
      // 206: aastore
      // 207: dup_x1
      // 208: swap
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: ldc2_w -7771451895272137826
      // 20f: lload 7
      // 211: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: goto 224
      // 219: ldc2_w -8125259458701231655
      // 21c: lload 7
      // 21e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: return
   }

   protected void O(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:31 from source 28_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 109078076250784
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 44435196176126
      // 01f: lxor
      // 020: lstore 7
      // 022: dup2
      // 023: ldc2_w 0
      // 026: lxor
      // 027: lstore 9
      // 029: pop2
      // 02a: aload 0
      // 02b: lload 9
      // 02d: aload 2
      // 02e: bipush 2
      // 02f: anewarray 709
      // 032: dup_x1
      // 033: swap
      // 034: bipush 1
      // 035: swap
      // 036: aastore
      // 037: dup_x2
      // 038: dup_x2
      // 039: pop
      // 03a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03d: bipush 0
      // 03e: swap
      // 03f: aastore
      // 040: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 043: ldc2_w -7740090294292667137
      // 046: lload 3
      // 047: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 2
      // 04d: aload 0
      // 04e: getfield com/zelix/h_.e I
      // 051: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 054: istore 11
      // 056: aload 2
      // 057: aload 0
      // 058: getfield com/zelix/h_.j I
      // 05b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 05e: aload 0
      // 05f: getfield com/zelix/h_.O Lcom/zelix/be;
      // 062: aload 2
      // 063: lload 7
      // 065: bipush 2
      // 066: anewarray 709
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 1
      // 070: swap
      // 071: aastore
      // 072: dup_x1
      // 073: swap
      // 074: bipush 0
      // 075: swap
      // 076: aastore
      // 077: ldc2_w -7936088921415764395
      // 07a: lload 3
      // 07b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: aload 2
      // 081: aload 0
      // 082: getfield com/zelix/h_.d I
      // 085: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 088: bipush 0
      // 089: istore 12
      // 08b: iload 12
      // 08d: aload 0
      // 08e: getfield com/zelix/h_.d I
      // 091: if_icmpge 0df
      // 094: aload 0
      // 095: getfield com/zelix/h_.o [Lcom/zelix/bv;
      // 098: iload 12
      // 09a: aaload
      // 09b: lload 5
      // 09d: aload 2
      // 09e: bipush 2
      // 09f: anewarray 709
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: bipush 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w -7537313195363092294
      // 0b3: lload 3
      // 0b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: iinc 12 1
      // 0bc: iload 11
      // 0be: lload 3
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 0e8
      // 0c4: ifeq 0e7
      // 0c7: iload 11
      // 0c9: ifne 08b
      // 0cc: lload 3
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 0bc
      // 0d2: goto 0df
      // 0d5: ldc2_w -8524126826415063216
      // 0d8: lload 3
      // 0d9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 2
      // 0e0: aload 0
      // 0e1: getfield com/zelix/h_.m I
      // 0e4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e7: bipush 0
      // 0e8: istore 12
      // 0ea: iload 12
      // 0ec: aload 0
      // 0ed: getfield com/zelix/h_.m I
      // 0f0: if_icmpge 120
      // 0f3: aload 0
      // 0f4: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 0f7: iload 12
      // 0f9: aaload
      // 0fa: lload 9
      // 0fc: aload 2
      // 0fd: bipush 2
      // 0fe: anewarray 709
      // 101: dup_x1
      // 102: swap
      // 103: bipush 1
      // 104: swap
      // 105: aastore
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -7824040374515325303
      // 112: lload 3
      // 113: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: iinc 12 1
      // 11b: iload 11
      // 11d: ifne 0ea
      // 120: lload 3
      // 121: lconst_0
      // 122: lcmp
      // 123: iflt 11b
      // 126: return
   }

   final void G(Object[] param1) {
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
      // 0c: getstatic com/zelix/h_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 42299427004861
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -1607858559338948155
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifeq 6c
      // 3f: instanceof com/zelix/_yl
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w -824679788557008278
      // 51: lload 2
      // 52: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w -824679788557008278
      // 65: lload 2
      // 66: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/_yl
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 709
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -759497795024470674
      // 81: lload 2
      // 82: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifne 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: ifle 33
      // 95: return
   }

   String r(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 112890200530209L;
      long var8 = var4 ^ 2012907873216L;
      return this.o(var6) + " " + ((iu)this.x()).Z(var8);
   }

   void h(Object[] param1) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 8
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 4
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/we
      // 024: astore 5
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/_8c
      // 02c: astore 2
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/util/List
      // 033: astore 7
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast java/lang/Integer
      // 03c: invokevirtual java/lang/Integer.intValue ()I
      // 03f: istore 6
      // 041: pop
      // 042: iload 8
      // 044: i2l
      // 045: bipush 56
      // 047: lshl
      // 048: iload 4
      // 04a: i2l
      // 04b: bipush 32
      // 04d: lshl
      // 04e: bipush 8
      // 050: lushr
      // 051: lor
      // 052: iload 6
      // 054: i2l
      // 055: bipush 40
      // 057: lshl
      // 058: bipush 40
      // 05a: lushr
      // 05b: lor
      // 05c: getstatic com/zelix/h_.a J
      // 05f: lxor
      // 060: lstore 9
      // 062: lload 9
      // 064: dup2
      // 065: ldc2_w 24988668205355
      // 068: lxor
      // 069: lstore 11
      // 06b: dup2
      // 06c: ldc2_w 35957558982349
      // 06f: lxor
      // 070: lstore 13
      // 072: dup2
      // 073: ldc2_w 66232139490094
      // 076: lxor
      // 077: lstore 15
      // 079: dup2
      // 07a: ldc2_w 17385781238117
      // 07d: lxor
      // 07e: lstore 17
      // 080: dup2
      // 081: ldc2_w 73119100077049
      // 084: lxor
      // 085: lstore 19
      // 087: dup2
      // 088: ldc2_w 64450044647147
      // 08b: lxor
      // 08c: lstore 21
      // 08e: dup2
      // 08f: ldc2_w 119562490901878
      // 092: lxor
      // 093: dup2
      // 094: bipush 48
      // 096: lushr
      // 097: l2i
      // 098: istore 23
      // 09a: dup2
      // 09b: bipush 16
      // 09d: lshl
      // 09e: bipush 48
      // 0a0: lushr
      // 0a1: l2i
      // 0a2: istore 24
      // 0a4: dup2
      // 0a5: bipush 32
      // 0a7: lshl
      // 0a8: bipush 32
      // 0aa: lushr
      // 0ab: l2i
      // 0ac: istore 25
      // 0ae: pop2
      // 0af: dup2
      // 0b0: ldc2_w 124757851124578
      // 0b3: lxor
      // 0b4: lstore 26
      // 0b6: dup2
      // 0b7: ldc2_w 105564385698990
      // 0ba: lxor
      // 0bb: lstore 28
      // 0bd: dup2
      // 0be: ldc2_w 97099199788624
      // 0c1: lxor
      // 0c2: lstore 30
      // 0c4: dup2
      // 0c5: ldc2_w 113540355406956
      // 0c8: lxor
      // 0c9: lstore 32
      // 0cb: dup2
      // 0cc: ldc2_w 32657798208385
      // 0cf: lxor
      // 0d0: lstore 34
      // 0d2: dup2
      // 0d3: ldc2_w 10099513830818
      // 0d6: lxor
      // 0d7: lstore 36
      // 0d9: dup2
      // 0da: ldc2_w 27652261105976
      // 0dd: lxor
      // 0de: lstore 38
      // 0e0: dup2
      // 0e1: ldc2_w 59386297610284
      // 0e4: lxor
      // 0e5: dup2
      // 0e6: bipush 32
      // 0e8: lushr
      // 0e9: l2i
      // 0ea: istore 40
      // 0ec: dup2
      // 0ed: bipush 32
      // 0ef: lshl
      // 0f0: bipush 48
      // 0f2: lushr
      // 0f3: l2i
      // 0f4: istore 41
      // 0f6: dup2
      // 0f7: bipush 48
      // 0f9: lshl
      // 0fa: bipush 48
      // 0fc: lushr
      // 0fd: l2i
      // 0fe: istore 42
      // 100: pop2
      // 101: dup2
      // 102: ldc2_w 18915143187687
      // 105: lxor
      // 106: lstore 43
      // 108: dup2
      // 109: ldc2_w 134184788421924
      // 10c: lxor
      // 10d: lstore 45
      // 10f: dup2
      // 110: ldc2_w 111887613830099
      // 113: lxor
      // 114: lstore 47
      // 116: dup2
      // 117: ldc2_w 26138851709228
      // 11a: lxor
      // 11b: lstore 49
      // 11d: dup2
      // 11e: ldc2_w 14618434486266
      // 121: lxor
      // 122: lstore 51
      // 124: dup2
      // 125: ldc2_w 32241638992391
      // 128: lxor
      // 129: lstore 53
      // 12b: pop2
      // 12c: ldc2_w 1237341419791655233
      // 12f: lload 9
      // 131: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: istore 55
      // 138: aload 0
      // 139: getfield com/zelix/h_.O Lcom/zelix/be;
      // 13c: iload 55
      // 13e: ifeq 164
      // 141: ifnull c1e
      // 144: goto 152
      // 147: ldc2_w 867629322235902702
      // 14a: lload 9
      // 14c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 0
      // 153: getfield com/zelix/h_.O Lcom/zelix/be;
      // 156: goto 164
      // 159: ldc2_w 867629322235902702
      // 15c: lload 9
      // 15e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: iload 40
      // 166: iload 41
      // 168: aload 3
      // 169: aload 5
      // 16b: bipush 1
      // 16c: iload 42
      // 16e: i2s
      // 16f: invokevirtual com/zelix/be.N (IILcom/zelix/_fm;Lcom/zelix/we;ZS)Lcom/zelix/yg;
      // 172: astore 56
      // 174: aload 56
      // 176: lload 47
      // 178: bipush 1
      // 179: anewarray 709
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w 1205171293265146553
      // 188: lload 9
      // 18a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: iload 8
      // 191: iflt 1f6
      // 194: iload 55
      // 196: ifeq 1f6
      // 199: ifne 1d1
      // 19c: goto 1aa
      // 19f: ldc2_w 867629322235902702
      // 1a2: lload 9
      // 1a4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield com/zelix/h_.O Lcom/zelix/be;
      // 1ae: bipush 0
      // 1af: bipush 1
      // 1b0: anewarray 709
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b8: bipush 0
      // 1b9: swap
      // 1ba: aastore
      // 1bb: ldc2_w 1314833141927787791
      // 1be: lload 9
      // 1c0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: return
      // 1c6: ldc2_w 867629322235902702
      // 1c9: lload 9
      // 1cb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: iload 55
      // 1d4: ifeq 226
      // 1d7: getfield com/zelix/h_.O Lcom/zelix/be;
      // 1da: bipush 0
      // 1db: anewarray 709
      // 1de: ldc2_w 1190332512115667704
      // 1e1: lload 9
      // 1e3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: goto 1f6
      // 1eb: ldc2_w 867629322235902702
      // 1ee: lload 9
      // 1f0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: iload 6
      // 1f8: ifle 208
      // 1fb: ifne 225
      // 1fe: ldc2_w 1717931635642819377
      // 201: lload 9
      // 203: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: ifne 225
      // 20b: goto 219
      // 20e: ldc2_w 867629322235902702
      // 211: lload 9
      // 213: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: return
      // 21a: ldc2_w 867629322235902702
      // 21d: lload 9
      // 21f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: aload 0
      // 226: lload 26
      // 228: bipush 1
      // 229: anewarray 709
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 0
      // 233: swap
      // 234: aastore
      // 235: ldc2_w 1185742131507420100
      // 238: lload 9
      // 23a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/h6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: astore 57
      // 241: aload 57
      // 243: ifnull 2cc
      // 246: new com/zelix/_8l
      // 249: dup
      // 24a: iload 23
      // 24c: i2s
      // 24d: sipush 29538
      // 250: ldc2_w 5461185223310905889
      // 253: lload 9
      // 255: lxor
      // 256: invokedynamic o (IJ)I bsm=com/zelix/h_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: iload 24
      // 25d: i2s
      // 25e: iload 25
      // 260: invokespecial com/zelix/_8l.<init> (SISI)V
      // 263: astore 60
      // 265: aload 57
      // 267: lload 13
      // 269: aload 60
      // 26b: ldc2_w 1254448939158388841
      // 26e: lload 9
      // 270: invokedynamic j (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: aload 60
      // 277: lload 15
      // 279: bipush 1
      // 27a: anewarray 709
      // 27d: dup_x2
      // 27e: dup_x2
      // 27f: pop
      // 280: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: ldc2_w 1400913489167673077
      // 289: lload 9
      // 28b: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: lload 17
      // 292: bipush 2
      // 293: anewarray 709
      // 296: dup_x2
      // 297: dup_x2
      // 298: pop
      // 299: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29c: bipush 1
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x1
      // 2a0: swap
      // 2a1: bipush 0
      // 2a2: swap
      // 2a3: aastore
      // 2a4: ldc2_w 1680977740710247695
      // 2a7: lload 9
      // 2a9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: astore 59
      // 2b0: aload 57
      // 2b2: bipush 0
      // 2b3: anewarray 709
      // 2b6: ldc2_w 981027447443027166
      // 2b9: lload 9
      // 2bb: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: astore 58
      // 2c2: iload 8
      // 2c4: iflt 2e2
      // 2c7: iload 55
      // 2c9: ifne 2ee
      // 2cc: aload 2
      // 2cd: sipush 25484
      // 2d0: ldc2_w 1779433099249054142
      // 2d3: lload 9
      // 2d5: lxor
      // 2d6: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/h_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: aload 7
      // 2dd: invokevirtual com/zelix/_8c.Y (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/mx;
      // 2e0: astore 58
      // 2e2: ldc2_w 859324686195609257
      // 2e5: lload 9
      // 2e7: invokedynamic r (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: astore 59
      // 2ee: new com/zelix/h6
      // 2f1: dup
      // 2f2: aload 0
      // 2f3: aload 58
      // 2f5: lload 11
      // 2f7: bipush 0
      // 2f8: invokespecial com/zelix/h6.<init> (Lcom/zelix/h8;Lcom/zelix/mx;JI)V
      // 2fb: astore 60
      // 2fd: bipush 0
      // 2fe: istore 61
      // 300: new com/zelix/wq
      // 303: dup
      // 304: aload 0
      // 305: getfield com/zelix/h_.O Lcom/zelix/be;
      // 308: aload 56
      // 30a: lload 19
      // 30c: invokespecial com/zelix/wq.<init> (Lcom/zelix/be;Lcom/zelix/yg;J)V
      // 30f: astore 62
      // 311: ldc2_w 1260116519377118840
      // 314: lload 9
      // 316: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: ldc "1"
      // 31d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 320: iload 55
      // 322: iload 4
      // 324: iflt 34f
      // 327: ifeq 34d
      // 32a: ifne 3c9
      // 32d: goto 33b
      // 330: ldc2_w 867629322235902702
      // 333: lload 9
      // 335: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: athrow
      // 33b: aload 0
      // 33c: getfield com/zelix/h_.j I
      // 33f: goto 34d
      // 342: ldc2_w 867629322235902702
      // 345: lload 9
      // 347: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: athrow
      // 34d: iload 55
      // 34f: iload 8
      // 351: iflt 393
      // 354: ifeq 391
      // 357: ifeq 3c9
      // 35a: goto 368
      // 35d: ldc2_w 867629322235902702
      // 360: lload 9
      // 362: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: athrow
      // 368: aload 56
      // 36a: lload 43
      // 36c: bipush 1
      // 36d: anewarray 709
      // 370: dup_x2
      // 371: dup_x2
      // 372: pop
      // 373: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 376: bipush 0
      // 377: swap
      // 378: aastore
      // 379: ldc2_w 909106138382290053
      // 37c: lload 9
      // 37e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: goto 391
      // 386: ldc2_w 867629322235902702
      // 389: lload 9
      // 38b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: athrow
      // 391: iload 55
      // 393: iload 6
      // 395: ifle 3b0
      // 398: ifeq 3ae
      // 39b: ifeq 3c9
      // 39e: goto 3ac
      // 3a1: ldc2_w 867629322235902702
      // 3a4: lload 9
      // 3a6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ab: athrow
      // 3ac: iload 61
      // 3ae: iload 55
      // 3b0: iload 4
      // 3b2: iflt 43e
      // 3b5: ifeq 43c
      // 3b8: ifeq 41f
      // 3bb: goto 3c9
      // 3be: ldc2_w 867629322235902702
      // 3c1: lload 9
      // 3c3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: athrow
      // 3c9: aload 62
      // 3cb: aload 60
      // 3cd: aload 2
      // 3ce: aload 59
      // 3d0: aload 7
      // 3d2: bipush 0
      // 3d3: lload 32
      // 3d5: bipush 0
      // 3d6: bipush 7
      // 3d8: anewarray 709
      // 3db: dup_x1
      // 3dc: swap
      // 3dd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3e0: bipush 6
      // 3e2: swap
      // 3e3: aastore
      // 3e4: dup_x2
      // 3e5: dup_x2
      // 3e6: pop
      // 3e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ea: bipush 5
      // 3eb: swap
      // 3ec: aastore
      // 3ed: dup_x1
      // 3ee: swap
      // 3ef: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f2: bipush 4
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x1
      // 3f6: swap
      // 3f7: bipush 3
      // 3f8: swap
      // 3f9: aastore
      // 3fa: dup_x1
      // 3fb: swap
      // 3fc: bipush 2
      // 3fd: swap
      // 3fe: aastore
      // 3ff: dup_x1
      // 400: swap
      // 401: bipush 1
      // 402: swap
      // 403: aastore
      // 404: dup_x1
      // 405: swap
      // 406: bipush 0
      // 407: swap
      // 408: aastore
      // 409: ldc2_w 926260699938530145
      // 40c: lload 9
      // 40e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 413: astore 63
      // 415: iload 4
      // 417: iflt b27
      // 41a: iload 55
      // 41c: ifne b10
      // 41f: ldc2_w 1260116519377118840
      // 422: lload 9
      // 424: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: ldc "2"
      // 42b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42e: goto 43c
      // 431: ldc2_w 867629322235902702
      // 434: lload 9
      // 436: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: athrow
      // 43c: iload 55
      // 43e: iload 8
      // 440: iflt 4cc
      // 443: ifeq 4ca
      // 446: ifeq 4ad
      // 449: goto 457
      // 44c: ldc2_w 867629322235902702
      // 44f: lload 9
      // 451: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: aload 62
      // 459: aload 60
      // 45b: aload 2
      // 45c: aload 59
      // 45e: aload 7
      // 460: bipush 1
      // 461: lload 32
      // 463: bipush 0
      // 464: bipush 7
      // 466: anewarray 709
      // 469: dup_x1
      // 46a: swap
      // 46b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46e: bipush 6
      // 470: swap
      // 471: aastore
      // 472: dup_x2
      // 473: dup_x2
      // 474: pop
      // 475: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 478: bipush 5
      // 479: swap
      // 47a: aastore
      // 47b: dup_x1
      // 47c: swap
      // 47d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 480: bipush 4
      // 481: swap
      // 482: aastore
      // 483: dup_x1
      // 484: swap
      // 485: bipush 3
      // 486: swap
      // 487: aastore
      // 488: dup_x1
      // 489: swap
      // 48a: bipush 2
      // 48b: swap
      // 48c: aastore
      // 48d: dup_x1
      // 48e: swap
      // 48f: bipush 1
      // 490: swap
      // 491: aastore
      // 492: dup_x1
      // 493: swap
      // 494: bipush 0
      // 495: swap
      // 496: aastore
      // 497: ldc2_w 926260699938530145
      // 49a: lload 9
      // 49c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a1: astore 63
      // 4a3: iload 8
      // 4a5: iflt b27
      // 4a8: iload 55
      // 4aa: ifne b10
      // 4ad: ldc2_w 1260116519377118840
      // 4b0: lload 9
      // 4b2: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b7: ldc "5"
      // 4b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4bc: goto 4ca
      // 4bf: ldc2_w 867629322235902702
      // 4c2: lload 9
      // 4c4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c9: athrow
      // 4ca: iload 55
      // 4cc: iload 6
      // 4ce: ifle 4f8
      // 4d1: ifeq 4f7
      // 4d4: ifeq 582
      // 4d7: goto 4e5
      // 4da: ldc2_w 867629322235902702
      // 4dd: lload 9
      // 4df: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e4: athrow
      // 4e5: aload 0
      // 4e6: getfield com/zelix/h_.j I
      // 4e9: goto 4f7
      // 4ec: ldc2_w 867629322235902702
      // 4ef: lload 9
      // 4f1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f6: athrow
      // 4f7: bipush 1
      // 4f8: iload 55
      // 4fa: ifeq 52e
      // 4fd: if_icmple 582
      // 500: goto 50e
      // 503: ldc2_w 867629322235902702
      // 506: lload 9
      // 508: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50d: athrow
      // 50e: aload 0
      // 50f: getfield com/zelix/h_.j I
      // 512: sipush 4866
      // 515: ldc2_w 7164116912847254087
      // 518: lload 9
      // 51a: lxor
      // 51b: invokedynamic o (IJ)I bsm=com/zelix/h_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 520: goto 52e
      // 523: ldc2_w 867629322235902702
      // 526: lload 9
      // 528: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52d: athrow
      // 52e: if_icmpgt 582
      // 531: aload 62
      // 533: aload 0
      // 534: getfield com/zelix/h_.j I
      // 537: lload 51
      // 539: dup2_x1
      // 53a: pop2
      // 53b: aload 60
      // 53d: aload 2
      // 53e: aload 59
      // 540: aload 7
      // 542: bipush 6
      // 544: anewarray 709
      // 547: dup_x1
      // 548: swap
      // 549: bipush 5
      // 54a: swap
      // 54b: aastore
      // 54c: dup_x1
      // 54d: swap
      // 54e: bipush 4
      // 54f: swap
      // 550: aastore
      // 551: dup_x1
      // 552: swap
      // 553: bipush 3
      // 554: swap
      // 555: aastore
      // 556: dup_x1
      // 557: swap
      // 558: bipush 2
      // 559: swap
      // 55a: aastore
      // 55b: dup_x1
      // 55c: swap
      // 55d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 560: bipush 1
      // 561: swap
      // 562: aastore
      // 563: dup_x2
      // 564: dup_x2
      // 565: pop
      // 566: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 569: bipush 0
      // 56a: swap
      // 56b: aastore
      // 56c: ldc2_w 1111917223038737481
      // 56f: lload 9
      // 571: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 576: astore 63
      // 578: iload 4
      // 57a: iflt b27
      // 57d: iload 55
      // 57f: ifne b10
      // 582: new java/util/ArrayList
      // 585: dup
      // 586: aload 7
      // 588: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 58b: astore 64
      // 58d: aload 62
      // 58f: aload 60
      // 591: aload 2
      // 592: aload 59
      // 594: lload 17
      // 596: bipush 2
      // 597: anewarray 709
      // 59a: dup_x2
      // 59b: dup_x2
      // 59c: pop
      // 59d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a0: bipush 1
      // 5a1: swap
      // 5a2: aastore
      // 5a3: dup_x1
      // 5a4: swap
      // 5a5: bipush 0
      // 5a6: swap
      // 5a7: aastore
      // 5a8: ldc2_w 1680977740710247695
      // 5ab: lload 9
      // 5ad: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b2: aload 64
      // 5b4: bipush 0
      // 5b5: lload 32
      // 5b7: bipush 0
      // 5b8: bipush 7
      // 5ba: anewarray 709
      // 5bd: dup_x1
      // 5be: swap
      // 5bf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c2: bipush 6
      // 5c4: swap
      // 5c5: aastore
      // 5c6: dup_x2
      // 5c7: dup_x2
      // 5c8: pop
      // 5c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5cc: bipush 5
      // 5cd: swap
      // 5ce: aastore
      // 5cf: dup_x1
      // 5d0: swap
      // 5d1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d4: bipush 4
      // 5d5: swap
      // 5d6: aastore
      // 5d7: dup_x1
      // 5d8: swap
      // 5d9: bipush 3
      // 5da: swap
      // 5db: aastore
      // 5dc: dup_x1
      // 5dd: swap
      // 5de: bipush 2
      // 5df: swap
      // 5e0: aastore
      // 5e1: dup_x1
      // 5e2: swap
      // 5e3: bipush 1
      // 5e4: swap
      // 5e5: aastore
      // 5e6: dup_x1
      // 5e7: swap
      // 5e8: bipush 0
      // 5e9: swap
      // 5ea: aastore
      // 5eb: ldc2_w 926260699938530145
      // 5ee: lload 9
      // 5f0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f5: astore 65
      // 5f7: goto 5ff
      // 5fa: astore 66
      // 5fc: aload 66
      // 5fe: athrow
      // 5ff: new java/util/ArrayList
      // 602: dup
      // 603: aload 7
      // 605: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 608: astore 66
      // 60a: aload 62
      // 60c: aload 60
      // 60e: aload 2
      // 60f: aload 59
      // 611: lload 17
      // 613: bipush 2
      // 614: anewarray 709
      // 617: dup_x2
      // 618: dup_x2
      // 619: pop
      // 61a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61d: bipush 1
      // 61e: swap
      // 61f: aastore
      // 620: dup_x1
      // 621: swap
      // 622: bipush 0
      // 623: swap
      // 624: aastore
      // 625: ldc2_w 1680977740710247695
      // 628: lload 9
      // 62a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62f: aload 66
      // 631: bipush 1
      // 632: lload 32
      // 634: bipush 0
      // 635: bipush 7
      // 637: anewarray 709
      // 63a: dup_x1
      // 63b: swap
      // 63c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 63f: bipush 6
      // 641: swap
      // 642: aastore
      // 643: dup_x2
      // 644: dup_x2
      // 645: pop
      // 646: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 649: bipush 5
      // 64a: swap
      // 64b: aastore
      // 64c: dup_x1
      // 64d: swap
      // 64e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 651: bipush 4
      // 652: swap
      // 653: aastore
      // 654: dup_x1
      // 655: swap
      // 656: bipush 3
      // 657: swap
      // 658: aastore
      // 659: dup_x1
      // 65a: swap
      // 65b: bipush 2
      // 65c: swap
      // 65d: aastore
      // 65e: dup_x1
      // 65f: swap
      // 660: bipush 1
      // 661: swap
      // 662: aastore
      // 663: dup_x1
      // 664: swap
      // 665: bipush 0
      // 666: swap
      // 667: aastore
      // 668: ldc2_w 926260699938530145
      // 66b: lload 9
      // 66d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 672: astore 67
      // 674: lload 36
      // 676: aload 65
      // 678: bipush 2
      // 679: anewarray 709
      // 67c: dup_x1
      // 67d: swap
      // 67e: bipush 1
      // 67f: swap
      // 680: aastore
      // 681: dup_x2
      // 682: dup_x2
      // 683: pop
      // 684: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 687: bipush 0
      // 688: swap
      // 689: aastore
      // 68a: ldc2_w 800537064496827734
      // 68d: lload 9
      // 68f: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 694: istore 68
      // 696: lload 36
      // 698: aload 67
      // 69a: bipush 2
      // 69b: anewarray 709
      // 69e: dup_x1
      // 69f: swap
      // 6a0: bipush 1
      // 6a1: swap
      // 6a2: aastore
      // 6a3: dup_x2
      // 6a4: dup_x2
      // 6a5: pop
      // 6a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a9: bipush 0
      // 6aa: swap
      // 6ab: aastore
      // 6ac: ldc2_w 800537064496827734
      // 6af: lload 9
      // 6b1: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b6: istore 69
      // 6b8: aload 65
      // 6ba: aload 65
      // 6bc: arraylength
      // 6bd: bipush 1
      // 6be: isub
      // 6bf: aaload
      // 6c0: astore 70
      // 6c2: aload 70
      // 6c4: lload 21
      // 6c6: bipush 1
      // 6c7: anewarray 709
      // 6ca: dup_x2
      // 6cb: dup_x2
      // 6cc: pop
      // 6cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d0: bipush 0
      // 6d1: swap
      // 6d2: aastore
      // 6d3: ldc2_w 1171961341795663223
      // 6d6: lload 9
      // 6d8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6dd: astore 71
      // 6df: aload 56
      // 6e1: aload 70
      // 6e3: bipush 0
      // 6e4: anewarray 709
      // 6e7: ldc2_w 1342241050192318675
      // 6ea: lload 9
      // 6ec: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f1: invokevirtual com/zelix/_op.m ()I
      // 6f4: lload 45
      // 6f6: bipush 2
      // 6f7: anewarray 709
      // 6fa: dup_x2
      // 6fb: dup_x2
      // 6fc: pop
      // 6fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 700: bipush 1
      // 701: swap
      // 702: aastore
      // 703: dup_x1
      // 704: swap
      // 705: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 708: bipush 0
      // 709: swap
      // 70a: aastore
      // 70b: ldc2_w 1723843305088119166
      // 70e: lload 9
      // 710: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/dm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 715: astore 72
      // 717: aload 72
      // 719: aload 0
      // 71a: getfield com/zelix/h_.O Lcom/zelix/be;
      // 71d: lload 49
      // 71f: bipush 1
      // 720: anewarray 709
      // 723: dup_x2
      // 724: dup_x2
      // 725: pop
      // 726: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 729: bipush 0
      // 72a: swap
      // 72b: aastore
      // 72c: ldc2_w 1251413599563493749
      // 72f: lload 9
      // 731: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_ov; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 736: lload 28
      // 738: dup2_x1
      // 739: pop2
      // 73a: bipush 2
      // 73b: anewarray 709
      // 73e: dup_x1
      // 73f: swap
      // 740: bipush 1
      // 741: swap
      // 742: aastore
      // 743: dup_x2
      // 744: dup_x2
      // 745: pop
      // 746: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 749: bipush 0
      // 74a: swap
      // 74b: aastore
      // 74c: ldc2_w 1476619727004924057
      // 74f: lload 9
      // 751: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 756: astore 73
      // 758: ldc2_w 1260116519377118840
      // 75b: lload 9
      // 75d: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 762: ldc "3"
      // 764: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 767: iload 55
      // 769: ifeq 8a0
      // 76c: ifne 89e
      // 76f: goto 77d
      // 772: ldc2_w 867629322235902702
      // 775: lload 9
      // 777: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77c: athrow
      // 77d: aload 71
      // 77f: ldc2_w 1715409430704232014
      // 782: lload 9
      // 784: invokedynamic k (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 789: iload 55
      // 78b: iload 8
      // 78d: iflt 7ce
      // 790: ifeq 7cc
      // 793: goto 7a1
      // 796: ldc2_w 867629322235902702
      // 799: lload 9
      // 79b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a0: athrow
      // 7a1: if_acmpeq 89e
      // 7a4: goto 7b2
      // 7a7: ldc2_w 867629322235902702
      // 7aa: lload 9
      // 7ac: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b1: athrow
      // 7b2: aload 71
      // 7b4: ldc2_w 1183398833709152869
      // 7b7: lload 9
      // 7b9: invokedynamic k (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7be: goto 7cc
      // 7c1: ldc2_w 867629322235902702
      // 7c4: lload 9
      // 7c6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cb: athrow
      // 7cc: iload 55
      // 7ce: iload 4
      // 7d0: ifle 803
      // 7d3: ifeq 801
      // 7d6: if_acmpeq 89e
      // 7d9: goto 7e7
      // 7dc: ldc2_w 867629322235902702
      // 7df: lload 9
      // 7e1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e6: athrow
      // 7e7: aload 71
      // 7e9: ldc2_w 1275773308548308243
      // 7ec: lload 9
      // 7ee: invokedynamic k (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f3: goto 801
      // 7f6: ldc2_w 867629322235902702
      // 7f9: lload 9
      // 7fb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 800: athrow
      // 801: iload 55
      // 803: iload 4
      // 805: ifle 83d
      // 808: ifeq 836
      // 80b: if_acmpeq 89e
      // 80e: goto 81c
      // 811: ldc2_w 867629322235902702
      // 814: lload 9
      // 816: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81b: athrow
      // 81c: aload 71
      // 81e: ldc2_w 1264237571756292249
      // 821: lload 9
      // 823: invokedynamic k (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 828: goto 836
      // 82b: ldc2_w 867629322235902702
      // 82e: lload 9
      // 830: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 835: athrow
      // 836: iload 6
      // 838: ifle 86b
      // 83b: iload 55
      // 83d: ifeq 86b
      // 840: if_acmpeq 89e
      // 843: goto 851
      // 846: ldc2_w 867629322235902702
      // 849: lload 9
      // 84b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 850: athrow
      // 851: aload 71
      // 853: ldc2_w 1194480052533078928
      // 856: lload 9
      // 858: invokedynamic k (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85d: goto 86b
      // 860: ldc2_w 867629322235902702
      // 863: lload 9
      // 865: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86a: athrow
      // 86b: if_acmpeq 89e
      // 86e: aload 73
      // 870: lload 34
      // 872: invokevirtual com/zelix/_og.t (J)Z
      // 875: iload 55
      // 877: iload 6
      // 879: ifle 8a2
      // 87c: ifeq 8a0
      // 87f: goto 88d
      // 882: ldc2_w 867629322235902702
      // 885: lload 9
      // 887: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88c: athrow
      // 88d: ifne 937
      // 890: goto 89e
      // 893: ldc2_w 867629322235902702
      // 896: lload 9
      // 898: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89d: athrow
      // 89e: iload 69
      // 8a0: iload 55
      // 8a2: iload 6
      // 8a4: ifle 8ac
      // 8a7: ifeq 928
      // 8aa: iload 68
      // 8ac: if_icmpge 8f3
      // 8af: goto 8bd
      // 8b2: ldc2_w 867629322235902702
      // 8b5: lload 9
      // 8b7: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8bc: athrow
      // 8bd: lload 53
      // 8bf: aload 66
      // 8c1: aload 7
      // 8c3: bipush 3
      // 8c4: anewarray 709
      // 8c7: dup_x1
      // 8c8: swap
      // 8c9: bipush 2
      // 8ca: swap
      // 8cb: aastore
      // 8cc: dup_x1
      // 8cd: swap
      // 8ce: bipush 1
      // 8cf: swap
      // 8d0: aastore
      // 8d1: dup_x2
      // 8d2: dup_x2
      // 8d3: pop
      // 8d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d7: bipush 0
      // 8d8: swap
      // 8d9: aastore
      // 8da: ldc2_w 659403339493832564
      // 8dd: lload 9
      // 8df: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e4: pop
      // 8e5: aload 67
      // 8e7: astore 63
      // 8e9: iload 6
      // 8eb: ifle b27
      // 8ee: iload 55
      // 8f0: ifne b10
      // 8f3: lload 53
      // 8f5: aload 64
      // 8f7: aload 7
      // 8f9: bipush 3
      // 8fa: anewarray 709
      // 8fd: dup_x1
      // 8fe: swap
      // 8ff: bipush 2
      // 900: swap
      // 901: aastore
      // 902: dup_x1
      // 903: swap
      // 904: bipush 1
      // 905: swap
      // 906: aastore
      // 907: dup_x2
      // 908: dup_x2
      // 909: pop
      // 90a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90d: bipush 0
      // 90e: swap
      // 90f: aastore
      // 910: ldc2_w 659403339493832564
      // 913: lload 9
      // 915: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91a: goto 928
      // 91d: ldc2_w 867629322235902702
      // 920: lload 9
      // 922: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 927: athrow
      // 928: pop
      // 929: aload 65
      // 92b: astore 63
      // 92d: iload 8
      // 92f: iflt b27
      // 932: iload 55
      // 934: ifne b10
      // 937: new java/util/ArrayList
      // 93a: dup
      // 93b: aload 7
      // 93d: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 940: astore 74
      // 942: aload 62
      // 944: aload 60
      // 946: aload 2
      // 947: aload 59
      // 949: lload 17
      // 94b: bipush 2
      // 94c: anewarray 709
      // 94f: dup_x2
      // 950: dup_x2
      // 951: pop
      // 952: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 955: bipush 1
      // 956: swap
      // 957: aastore
      // 958: dup_x1
      // 959: swap
      // 95a: bipush 0
      // 95b: swap
      // 95c: aastore
      // 95d: ldc2_w 1680977740710247695
      // 960: lload 9
      // 962: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 967: aload 74
      // 969: bipush 0
      // 96a: lload 32
      // 96c: bipush 1
      // 96d: bipush 7
      // 96f: anewarray 709
      // 972: dup_x1
      // 973: swap
      // 974: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 977: bipush 6
      // 979: swap
      // 97a: aastore
      // 97b: dup_x2
      // 97c: dup_x2
      // 97d: pop
      // 97e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 981: bipush 5
      // 982: swap
      // 983: aastore
      // 984: dup_x1
      // 985: swap
      // 986: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 989: bipush 4
      // 98a: swap
      // 98b: aastore
      // 98c: dup_x1
      // 98d: swap
      // 98e: bipush 3
      // 98f: swap
      // 990: aastore
      // 991: dup_x1
      // 992: swap
      // 993: bipush 2
      // 994: swap
      // 995: aastore
      // 996: dup_x1
      // 997: swap
      // 998: bipush 1
      // 999: swap
      // 99a: aastore
      // 99b: dup_x1
      // 99c: swap
      // 99d: bipush 0
      // 99e: swap
      // 99f: aastore
      // 9a0: ldc2_w 926260699938530145
      // 9a3: lload 9
      // 9a5: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9aa: astore 75
      // 9ac: lload 36
      // 9ae: aload 75
      // 9b0: bipush 2
      // 9b1: anewarray 709
      // 9b4: dup_x1
      // 9b5: swap
      // 9b6: bipush 1
      // 9b7: swap
      // 9b8: aastore
      // 9b9: dup_x2
      // 9ba: dup_x2
      // 9bb: pop
      // 9bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9bf: bipush 0
      // 9c0: swap
      // 9c1: aastore
      // 9c2: ldc2_w 800537064496827734
      // 9c5: lload 9
      // 9c7: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9cc: istore 76
      // 9ce: iload 68
      // 9d0: iload 69
      // 9d2: iload 55
      // 9d4: ifeq a70
      // 9d7: if_icmpge a4b
      // 9da: goto 9e8
      // 9dd: ldc2_w 867629322235902702
      // 9e0: lload 9
      // 9e2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e7: athrow
      // 9e8: iload 68
      // 9ea: iload 76
      // 9ec: iload 6
      // 9ee: iflt a70
      // 9f1: iload 55
      // 9f3: ifeq a70
      // 9f6: goto a04
      // 9f9: ldc2_w 867629322235902702
      // 9fc: lload 9
      // 9fe: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a03: athrow
      // a04: if_icmpge a4b
      // a07: goto a15
      // a0a: ldc2_w 867629322235902702
      // a0d: lload 9
      // a0f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a14: athrow
      // a15: lload 53
      // a17: aload 64
      // a19: aload 7
      // a1b: bipush 3
      // a1c: anewarray 709
      // a1f: dup_x1
      // a20: swap
      // a21: bipush 2
      // a22: swap
      // a23: aastore
      // a24: dup_x1
      // a25: swap
      // a26: bipush 1
      // a27: swap
      // a28: aastore
      // a29: dup_x2
      // a2a: dup_x2
      // a2b: pop
      // a2c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a2f: bipush 0
      // a30: swap
      // a31: aastore
      // a32: ldc2_w 659403339493832564
      // a35: lload 9
      // a37: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3c: pop
      // a3d: aload 65
      // a3f: astore 63
      // a41: iload 6
      // a43: iflt b27
      // a46: iload 55
      // a48: ifne b10
      // a4b: iload 69
      // a4d: iload 55
      // a4f: ifeq b0b
      // a52: goto a60
      // a55: ldc2_w 867629322235902702
      // a58: lload 9
      // a5a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5f: athrow
      // a60: iload 68
      // a62: goto a70
      // a65: ldc2_w 867629322235902702
      // a68: lload 9
      // a6a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6f: athrow
      // a70: iload 6
      // a72: iflt a7c
      // a75: if_icmpge ad6
      // a78: iload 69
      // a7a: iload 55
      // a7c: ifeq b0b
      // a7f: goto a8d
      // a82: ldc2_w 867629322235902702
      // a85: lload 9
      // a87: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8c: athrow
      // a8d: iload 76
      // a8f: if_icmpge ad6
      // a92: goto aa0
      // a95: ldc2_w 867629322235902702
      // a98: lload 9
      // a9a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9f: athrow
      // aa0: lload 53
      // aa2: aload 66
      // aa4: aload 7
      // aa6: bipush 3
      // aa7: anewarray 709
      // aaa: dup_x1
      // aab: swap
      // aac: bipush 2
      // aad: swap
      // aae: aastore
      // aaf: dup_x1
      // ab0: swap
      // ab1: bipush 1
      // ab2: swap
      // ab3: aastore
      // ab4: dup_x2
      // ab5: dup_x2
      // ab6: pop
      // ab7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // aba: bipush 0
      // abb: swap
      // abc: aastore
      // abd: ldc2_w 659403339493832564
      // ac0: lload 9
      // ac2: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac7: pop
      // ac8: aload 67
      // aca: astore 63
      // acc: iload 8
      // ace: iflt b27
      // ad1: iload 55
      // ad3: ifne b10
      // ad6: lload 53
      // ad8: aload 74
      // ada: aload 7
      // adc: bipush 3
      // add: anewarray 709
      // ae0: dup_x1
      // ae1: swap
      // ae2: bipush 2
      // ae3: swap
      // ae4: aastore
      // ae5: dup_x1
      // ae6: swap
      // ae7: bipush 1
      // ae8: swap
      // ae9: aastore
      // aea: dup_x2
      // aeb: dup_x2
      // aec: pop
      // aed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // af0: bipush 0
      // af1: swap
      // af2: aastore
      // af3: ldc2_w 659403339493832564
      // af6: lload 9
      // af8: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // afd: goto b0b
      // b00: ldc2_w 867629322235902702
      // b03: lload 9
      // b05: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0a: athrow
      // b0b: pop
      // b0c: aload 75
      // b0e: astore 63
      // b10: aload 60
      // b12: aload 63
      // b14: bipush 1
      // b15: anewarray 709
      // b18: dup_x1
      // b19: swap
      // b1a: bipush 0
      // b1b: swap
      // b1c: aastore
      // b1d: ldc2_w 1148104712872455410
      // b20: lload 9
      // b22: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b27: aload 57
      // b29: iload 55
      // b2b: iload 4
      // b2d: ifle b84
      // b30: ifeq b83
      // b33: ifnull b73
      // b36: goto b44
      // b39: ldc2_w 867629322235902702
      // b3c: lload 9
      // b3e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b43: athrow
      // b44: aload 0
      // b45: lload 38
      // b47: bipush 1
      // b48: anewarray 709
      // b4b: dup_x2
      // b4c: dup_x2
      // b4d: pop
      // b4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b51: bipush 0
      // b52: swap
      // b53: aastore
      // b54: ldc2_w 973141577663695669
      // b57: lload 9
      // b59: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5e: istore 64
      // b60: aload 0
      // b61: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // b64: iload 64
      // b66: aload 60
      // b68: aastore
      // b69: iload 8
      // b6b: iflt c03
      // b6e: iload 55
      // b70: ifne be8
      // b73: aload 60
      // b75: goto b83
      // b78: ldc2_w 867629322235902702
      // b7b: lload 9
      // b7d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b82: athrow
      // b83: bipush 0
      // b84: anewarray 709
      // b87: ldc2_w 1179904482540219036
      // b8a: lload 9
      // b8c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b91: iload 55
      // b93: ifeq bbb
      // b96: ifle be8
      // b99: goto ba7
      // b9c: ldc2_w 867629322235902702
      // b9f: lload 9
      // ba1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba6: athrow
      // ba7: aload 0
      // ba8: getfield com/zelix/h_.m I
      // bab: bipush 1
      // bac: iadd
      // bad: goto bbb
      // bb0: ldc2_w 867629322235902702
      // bb3: lload 9
      // bb5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bba: athrow
      // bbb: anewarray 259
      // bbe: astore 64
      // bc0: aload 0
      // bc1: getfield com/zelix/h_.D [Lcom/zelix/h4;
      // bc4: bipush 0
      // bc5: aload 64
      // bc7: bipush 0
      // bc8: aload 0
      // bc9: getfield com/zelix/h_.m I
      // bcc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // bcf: aload 64
      // bd1: aload 0
      // bd2: getfield com/zelix/h_.m I
      // bd5: aload 60
      // bd7: aastore
      // bd8: aload 0
      // bd9: aload 64
      // bdb: putfield com/zelix/h_.D [Lcom/zelix/h4;
      // bde: aload 0
      // bdf: dup
      // be0: getfield com/zelix/h_.m I
      // be3: bipush 1
      // be4: iadd
      // be5: putfield com/zelix/h_.m I
      // be8: aload 0
      // be9: getfield com/zelix/h_.O Lcom/zelix/be;
      // bec: bipush 0
      // bed: bipush 1
      // bee: anewarray 709
      // bf1: dup_x1
      // bf2: swap
      // bf3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // bf6: bipush 0
      // bf7: swap
      // bf8: aastore
      // bf9: ldc2_w 1314833141927787791
      // bfc: lload 9
      // bfe: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c03: aload 56
      // c05: lload 30
      // c07: bipush 1
      // c08: anewarray 709
      // c0b: dup_x2
      // c0c: dup_x2
      // c0d: pop
      // c0e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c11: bipush 0
      // c12: swap
      // c13: aastore
      // c14: ldc2_w 1250210741632611595
      // c17: lload 9
      // c19: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1e: return
   }

   public boolean m(Object[] param1) {
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
      // 00a: lstore 7
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/List
      // 012: astore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/String
      // 01a: astore 9
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/util/List
      // 022: astore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Boolean
      // 02a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02d: istore 13
      // 02f: dup
      // 030: bipush 5
      // 031: aaload
      // 032: checkcast java/lang/Boolean
      // 035: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 038: istore 12
      // 03a: dup
      // 03b: bipush 6
      // 03d: aaload
      // 03e: checkcast java/lang/Boolean
      // 041: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 044: istore 11
      // 046: dup
      // 047: bipush 7
      // 049: aaload
      // 04a: checkcast com/zelix/_fm
      // 04d: astore 2
      // 04e: dup
      // 04f: bipush 8
      // 051: aaload
      // 052: checkcast com/zelix/_yv
      // 055: astore 10
      // 057: dup
      // 058: bipush 9
      // 05a: aaload
      // 05b: checkcast java/lang/Boolean
      // 05e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 061: istore 3
      // 062: dup
      // 063: bipush 10
      // 065: aaload
      // 066: checkcast com/zelix/_ur
      // 069: astore 6
      // 06b: pop
      // 06c: getstatic com/zelix/h_.a J
      // 06f: lload 7
      // 071: lxor
      // 072: lstore 7
      // 074: lload 7
      // 076: dup2
      // 077: ldc2_w 18751897024103
      // 07a: lxor
      // 07b: lstore 14
      // 07d: pop2
      // 07e: ldc2_w 1056240234840407746
      // 081: lload 7
      // 083: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: istore 16
      // 08a: aload 0
      // 08b: getfield com/zelix/h_.O Lcom/zelix/be;
      // 08e: iload 16
      // 090: ifeq 0b6
      // 093: ifnull 126
      // 096: goto 0a4
      // 099: ldc2_w 1407691366929622381
      // 09c: lload 7
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield com/zelix/h_.O Lcom/zelix/be;
      // 0a8: goto 0b6
      // 0ab: ldc2_w 1407691366929622381
      // 0ae: lload 7
      // 0b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: aload 4
      // 0b8: aload 9
      // 0ba: aload 5
      // 0bc: iload 13
      // 0be: iload 12
      // 0c0: lload 14
      // 0c2: iload 11
      // 0c4: aload 2
      // 0c5: aload 10
      // 0c7: iload 3
      // 0c8: aload 6
      // 0ca: bipush 11
      // 0cc: anewarray 709
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 10
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0da: bipush 9
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: bipush 8
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 7
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ef: bipush 6
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 5
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 101: bipush 4
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 109: bipush 3
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 2
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w 896426565497694746
      // 11e: lload 7
      // 120: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: ireturn
      // 126: bipush 0
      // 127: ireturn
   }

   static {
      long var11 = a ^ 96422856738744L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[22];
      int var18 = 0;
      String var17 = "\b\u000fñ]\"tùo:õÍ\u0002Íj\u0082]\u000e¸(\u0091¾}Ë=\u0010þw\u0015\u000b[¨¨*\u00943k¦¦\u0098î¤ Ô\u0002\u0012 Q§ÑQ¹æa\u0019§ÊÉ\rçïK?ÔövÃQ¨&$A³6s $%\u0090½5Üøp\u0093\u00884Oaù\u000b\u0083µÃ\u001e\u0016E¼{ò¸]ØC7±Òö8ÂØê\u0016\"!tð\u000e\u0099\u0088³ÚFýÄ6\u0086âtElF[\u0092\u008bÇ®$fÙHó\u009c÷Ooð#¸Vb÷0½cÎö£a&{$Ê2C L\u0096Ãd\u009eê\t\u0017H\u0096)@m¹\u0098\u008aOg´¯~ê*\u0092VÜêDÇ;2§hkm%Ð\u0085¦\u001c\u0085ñy\u0095\u0015¦ÐAqõ<\u0095'¡¼\u000e¿Æ\"Þ÷ä\u0086\u0082yààÏ¼c\u0090¹%z\u0007\u0095\u0006#\u008fáe\u008f\u009bÑk§<t\u0004¤YoÃ%\u0010\u0094\u001c\u0088ê\u008fO\u0099&¤§\u0006ü·ry«?»F÷c*¼úÀ0ï\u0014ºÊkÍ{_n¬Cþ8l\u008aæ@\u0094©¥4¯Ìxå\u0089\u0099ËÁ\u00192 ¯\u001b©\u0015¬£+#r`B\u0080¼ÙïA\u0085,;¨4j\u001cfÏää¶ÅfT]M[\u0013\u008d¦0\u0016õ\u0093ªg\u0086mþ;fE8RÑð\u0081\u0007\u0002Ã\u0085wÁ*¶È³\u0007]Ï\u009c¸P¥¡ò9Óp\u009fÏ\u0016¶\u00865A½\u0007\u0088\u0095¯\u0098\u0087Ð\u0019ë>Q¶\u0015k\u0007IÙ\u00935\u0001<¦ Í²Y\u0090\t_2<¨Ñ\u0010\u0085m¯?0àÏô\bôYá\u001fH\u0099ýY#\u0085\u001bh\u0010\u0001Â3\u0099ÿñ\u001f§\u0099Wÿ\u009a~»>n \u007fAh\u001b\u0091\u008dþurn\u001e>,Ýó\u000eî5fQÃ,Óu\u0087á½\u0082xÍ\u0097« Út¬Ú\u0088`Q×|*0>%5õ~YJ%äXÓTx\f\u0090ûSí \u0002CP\u0018ã\u0012ª\u008awÉ\u0010\u0083äQ=4\u001eìü\u0083Äé¹\u008e])á\u00ad\u0081qíå6aGÇ,k\\¾Ç\u000esq\\·½bóüqÇ²%µ\u0012àI¦~\u0088Òø6\u007fÃ\u009brÎß'´t^\u0004v\u0011\u009dºÿ»g\u001a0Ý¡¿\u0099°3zÇ\u008dÇï\u0099'8}´f|:\u0000\u0096\u0098:\u0018\u0095\u0005>Àé\u0007?n´|WXØÇ\u0090hyZö\u0016\u0004ÞÛm\u0010\u001cäB?ÐÎLµ_\u009dë\u008f\u0092~¯E\u0018kz¨\u0084çÖ\u0015ô.\u0013è\u009cD\u008er\u0083\u001f*\u009f\u00982Ûl®0\u0091ÂØ¦\u000bâJ\u0000É°\u0013/aâÃhÚ'\\¸U\u0087\u0099o7w§\u0090)[¥\u0006{C\u0013¢gW\u009f¬\u008eGè¸\u0004\u008cNf\u0010+Sú§áæw\u0007±õ\u0001Ë\u0097OÍJ@{y3X/aÁÃîm\u0018Õ\u0094<¨q\u0016\u009fJS]kÇ\u0092\u009c²ÏH\u009d§Á¶%÷\u001f\u0086Álã¯\u000f;d>M\u0089oØbàD\u001d\u0015\u009aò\u0099»Äy:&Þ\\«";
      int var19 = "\b\u000fñ]\"tùo:õÍ\u0002Íj\u0082]\u000e¸(\u0091¾}Ë=\u0010þw\u0015\u000b[¨¨*\u00943k¦¦\u0098î¤ Ô\u0002\u0012 Q§ÑQ¹æa\u0019§ÊÉ\rçïK?ÔövÃQ¨&$A³6s $%\u0090½5Üøp\u0093\u00884Oaù\u000b\u0083µÃ\u001e\u0016E¼{ò¸]ØC7±Òö8ÂØê\u0016\"!tð\u000e\u0099\u0088³ÚFýÄ6\u0086âtElF[\u0092\u008bÇ®$fÙHó\u009c÷Ooð#¸Vb÷0½cÎö£a&{$Ê2C L\u0096Ãd\u009eê\t\u0017H\u0096)@m¹\u0098\u008aOg´¯~ê*\u0092VÜêDÇ;2§hkm%Ð\u0085¦\u001c\u0085ñy\u0095\u0015¦ÐAqõ<\u0095'¡¼\u000e¿Æ\"Þ÷ä\u0086\u0082yààÏ¼c\u0090¹%z\u0007\u0095\u0006#\u008fáe\u008f\u009bÑk§<t\u0004¤YoÃ%\u0010\u0094\u001c\u0088ê\u008fO\u0099&¤§\u0006ü·ry«?»F÷c*¼úÀ0ï\u0014ºÊkÍ{_n¬Cþ8l\u008aæ@\u0094©¥4¯Ìxå\u0089\u0099ËÁ\u00192 ¯\u001b©\u0015¬£+#r`B\u0080¼ÙïA\u0085,;¨4j\u001cfÏää¶ÅfT]M[\u0013\u008d¦0\u0016õ\u0093ªg\u0086mþ;fE8RÑð\u0081\u0007\u0002Ã\u0085wÁ*¶È³\u0007]Ï\u009c¸P¥¡ò9Óp\u009fÏ\u0016¶\u00865A½\u0007\u0088\u0095¯\u0098\u0087Ð\u0019ë>Q¶\u0015k\u0007IÙ\u00935\u0001<¦ Í²Y\u0090\t_2<¨Ñ\u0010\u0085m¯?0àÏô\bôYá\u001fH\u0099ýY#\u0085\u001bh\u0010\u0001Â3\u0099ÿñ\u001f§\u0099Wÿ\u009a~»>n \u007fAh\u001b\u0091\u008dþurn\u001e>,Ýó\u000eî5fQÃ,Óu\u0087á½\u0082xÍ\u0097« Út¬Ú\u0088`Q×|*0>%5õ~YJ%äXÓTx\f\u0090ûSí \u0002CP\u0018ã\u0012ª\u008awÉ\u0010\u0083äQ=4\u001eìü\u0083Äé¹\u008e])á\u00ad\u0081qíå6aGÇ,k\\¾Ç\u000esq\\·½bóüqÇ²%µ\u0012àI¦~\u0088Òø6\u007fÃ\u009brÎß'´t^\u0004v\u0011\u009dºÿ»g\u001a0Ý¡¿\u0099°3zÇ\u008dÇï\u0099'8}´f|:\u0000\u0096\u0098:\u0018\u0095\u0005>Àé\u0007?n´|WXØÇ\u0090hyZö\u0016\u0004ÞÛm\u0010\u001cäB?ÐÎLµ_\u009dë\u008f\u0092~¯E\u0018kz¨\u0084çÖ\u0015ô.\u0013è\u009cD\u008er\u0083\u001f*\u009f\u00982Ûl®0\u0091ÂØ¦\u000bâJ\u0000É°\u0013/aâÃhÚ'\\¸U\u0087\u0099o7w§\u0090)[¥\u0006{C\u0013¢gW\u009f¬\u008eGè¸\u0004\u008cNf\u0010+Sú§áæw\u0007±õ\u0001Ë\u0097OÍJ@{y3X/aÁÃîm\u0018Õ\u0094<¨q\u0016\u009fJS]kÇ\u0092\u009c²ÏH\u009d§Á¶%÷\u001f\u0086Álã¯\u000f;d>M\u0089oØbàD\u001d\u0015\u009aò\u0099»Äy:&Þ\\«"
         .length();
      char var16 = 24;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     f = new String[22];
                     n = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "Ü>ÂI'ÎÅÌa\u009bY\"\u008c\u000ei\u0016pL»®µ\u0010\u001b\u0083D~Å\u0091z_\u0016Ë=\u0010ú\u0089ÃC¬A";
                     int var5 = "Ü>ÂI'ÎÅÌa\u009bY\"\u008c\u000ei\u0016pL»®µ\u0010\u001b\u0083D~Å\u0091z_\u0016Ë=\u0010ú\u0089ÃC¬A".length();
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
                                    h = var6;
                                    i = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "·Ä\u0019\u0089\u008e>'\u0012Ë\u0095¤ÉvÃÃë";
                                 var5 = "·Ä\u0019\u0089\u008e>'\u0012Ë\u0095¤ÉvÃÃë".length();
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

                  var17 = "ÒhG'¿ä\u0097ÚÍb\u0013\u001a\\nL\u0007ÿz\u0007Ë\u008bÉ\u00071,dtÑ\u008f\"ñIpLºQøÀÝ=üÓ¬ÝÂý3×ÍRT5î?Z\u008c8¾\u0099\u0006òÌñâÊú°éNB\u0090\u0087°vÃàT0×d\u0091j9sËjß|\u0090×ðGù=±Á} IB\u009a÷Ñº\u001añ\u0098ÅH\rÂÈNk\u0098/m/%-\u0002E\u0085}\u0091µ\u0013î6\r\u009cb ÁÒXKOúÕÞqF}\u001eò\u0006\u008eKÒôb;jlX\u0089\u0014\u008dxpÉ'3Lh>~èw#!ÀÔ!7~\tù\u001bQËõ\u0099}ïÕ_\u0084¼ª¹\u0018\u0085\u001d\u0091N\u0082FLû\n\u0098K\u0099l\u0014ù\u0002W\u0096JþiøM×";
                  var19 = "ÒhG'¿ä\u0097ÚÍb\u0013\u001a\\nL\u0007ÿz\u0007Ë\u008bÉ\u00071,dtÑ\u008f\"ñIpLºQøÀÝ=üÓ¬ÝÂý3×ÍRT5î?Z\u008c8¾\u0099\u0006òÌñâÊú°éNB\u0090\u0087°vÃàT0×d\u0091j9sËjß|\u0090×ðGù=±Á} IB\u009a÷Ñº\u001añ\u0098ÅH\rÂÈNk\u0098/m/%-\u0002E\u0085}\u0091µ\u0013î6\r\u009cb ÁÒXKOúÕÞqF}\u001eò\u0006\u008eKÒôb;jlX\u0089\u0014\u008dxpÉ'3Lh>~èw#!ÀÔ!7~\tù\u001bQËõ\u0099}ïÕ_\u0084¼ª¹\u0018\u0085\u001d\u0091N\u0082FLû\n\u0098K\u0099l\u0014ù\u0002W\u0096JþiøM×"
                     .length();
                  var16 = 192;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4014;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/h_", var10);
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
         f[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/h_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31944;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/h_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/h_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
