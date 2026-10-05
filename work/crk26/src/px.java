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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class px extends v2 implements h3 {
   private List h;
   private static final long a = prr.a(8234365181382175653L, -2255750306108753958L, MethodHandles.lookup().lookupClass()).a(81304881397504L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void X(Object[] param1) {
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
      // 004: checkcast com/zelix/fu
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/lqq
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 89519001868478
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 55940588088632
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 83138489201726
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 133926303680501
      // 035: lxor
      // 036: lstore 12
      // 038: dup2
      // 039: ldc2_w 139049003933947
      // 03c: lxor
      // 03d: lstore 14
      // 03f: dup2
      // 040: ldc2_w 122772112358678
      // 043: lxor
      // 044: lstore 16
      // 046: dup2
      // 047: ldc2_w 43182289664863
      // 04a: lxor
      // 04b: lstore 18
      // 04d: dup2
      // 04e: ldc2_w 31915861170491
      // 051: lxor
      // 052: lstore 20
      // 054: dup2
      // 055: ldc2_w 100320377699147
      // 058: lxor
      // 059: lstore 22
      // 05b: dup2
      // 05c: ldc2_w 46764086646781
      // 05f: lxor
      // 060: lstore 24
      // 062: dup2
      // 063: ldc2_w 33399391981948
      // 066: lxor
      // 067: lstore 26
      // 069: dup2
      // 06a: ldc2_w 82576821270364
      // 06d: lxor
      // 06e: lstore 28
      // 070: dup2
      // 071: ldc2_w 91139354325625
      // 074: lxor
      // 075: lstore 30
      // 077: dup2
      // 078: ldc2_w 125916926062133
      // 07b: lxor
      // 07c: lstore 32
      // 07e: dup2
      // 07f: ldc2_w 0
      // 082: lxor
      // 083: lstore 34
      // 085: dup2
      // 086: ldc2_w 133926303680501
      // 089: lxor
      // 08a: lstore 36
      // 08c: dup2
      // 08d: ldc2_w 94038206132601
      // 090: lxor
      // 091: lstore 38
      // 093: pop2
      // 094: ldc2_w -1921333740741510316
      // 097: lload 3
      // 098: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 0
      // 09e: lload 10
      // 0a0: bipush 1
      // 0a1: anewarray 325
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w -1825679945300982289
      // 0b0: lload 3
      // 0b1: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/v0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: astore 41
      // 0b8: astore 40
      // 0ba: aload 41
      // 0bc: aload 40
      // 0be: ifnonnull 0d3
      // 0c1: ifnull 1b0
      // 0c4: goto 0d1
      // 0c7: ldc2_w -491230035487422991
      // 0ca: lload 3
      // 0cb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 41
      // 0d3: instanceof com/zelix/pl
      // 0d6: aload 40
      // 0d8: ifnonnull 1b1
      // 0db: ifeq 1b0
      // 0de: goto 0eb
      // 0e1: ldc2_w -491230035487422991
      // 0e4: lload 3
      // 0e5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 41
      // 0ed: checkcast com/zelix/pl
      // 0f0: astore 42
      // 0f2: aload 2
      // 0f3: new java/lang/StringBuilder
      // 0f6: dup
      // 0f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fa: sipush 20124
      // 0fd: ldc2_w 4688272619963600046
      // 100: lload 3
      // 101: lxor
      // 102: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: aload 42
      // 10c: lload 36
      // 10e: bipush 1
      // 10f: anewarray 325
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w -507055661627637686
      // 11e: lload 3
      // 11f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: sipush 4701
      // 12a: ldc2_w 4614421842065035363
      // 12d: lload 3
      // 12e: lxor
      // 12f: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: aload 42
      // 139: lload 30
      // 13b: bipush 1
      // 13c: anewarray 325
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w -339665425209044149
      // 14b: lload 3
      // 14c: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 154: sipush 22680
      // 157: ldc2_w 2680506352686684847
      // 15a: lload 3
      // 15b: lxor
      // 15c: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: aload 0
      // 165: lload 12
      // 167: bipush 1
      // 168: anewarray 325
      // 16b: dup_x2
      // 16c: dup_x2
      // 16d: pop
      // 16e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 171: bipush 0
      // 172: swap
      // 173: aastore
      // 174: ldc2_w -338011881303087484
      // 177: lload 3
      // 178: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: sipush 9377
      // 183: ldc2_w 715384407264437908
      // 186: lload 3
      // 187: lxor
      // 188: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 193: lload 6
      // 195: bipush 2
      // 196: anewarray 325
      // 199: dup_x2
      // 19a: dup_x2
      // 19b: pop
      // 19c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19f: bipush 1
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 0
      // 1a5: swap
      // 1a6: aastore
      // 1a7: ldc2_w -87657652618287095
      // 1aa: lload 3
      // 1ab: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: bipush 0
      // 1b1: istore 42
      // 1b3: iload 42
      // 1b5: aload 0
      // 1b6: lload 38
      // 1b8: bipush 1
      // 1b9: anewarray 325
      // 1bc: dup_x2
      // 1bd: dup_x2
      // 1be: pop
      // 1bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c2: bipush 0
      // 1c3: swap
      // 1c4: aastore
      // 1c5: ldc2_w -2296489199898713612
      // 1c8: lload 3
      // 1c9: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: if_icmpge 23e
      // 1d1: aload 0
      // 1d2: iload 42
      // 1d4: lload 16
      // 1d6: bipush 2
      // 1d7: anewarray 325
      // 1da: dup_x2
      // 1db: dup_x2
      // 1dc: pop
      // 1dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e0: bipush 1
      // 1e1: swap
      // 1e2: aastore
      // 1e3: dup_x1
      // 1e4: swap
      // 1e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: ldc2_w -1931359190408154321
      // 1ee: lload 3
      // 1ef: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/fu; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: aload 0
      // 1f5: lload 34
      // 1f7: aload 2
      // 1f8: bipush 3
      // 1f9: anewarray 325
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 2
      // 1ff: swap
      // 200: aastore
      // 201: dup_x2
      // 202: dup_x2
      // 203: pop
      // 204: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 207: bipush 1
      // 208: swap
      // 209: aastore
      // 20a: dup_x1
      // 20b: swap
      // 20c: bipush 0
      // 20d: swap
      // 20e: aastore
      // 20f: ldc2_w -1954679020144143401
      // 212: lload 3
      // 213: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: iinc 42 1
      // 21b: aload 40
      // 21d: lload 3
      // 21e: lconst_0
      // 21f: lcmp
      // 220: ifle 228
      // 223: ifnonnull 3ff
      // 226: aload 40
      // 228: ifnull 1b3
      // 22b: lload 3
      // 22c: lconst_0
      // 22d: lcmp
      // 22e: iflt 21b
      // 231: goto 23e
      // 234: ldc2_w -491230035487422991
      // 237: lload 3
      // 238: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: aload 0
      // 23f: ldc2_w -2131115181519409292
      // 242: lload 3
      // 243: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 24d: astore 42
      // 24f: aload 42
      // 251: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 256: ifeq 3de
      // 259: aload 42
      // 25b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 260: checkcast com/zelix/y6
      // 263: astore 43
      // 265: aload 43
      // 267: aload 40
      // 269: lload 3
      // 26a: lconst_0
      // 26b: lcmp
      // 26c: ifle 38e
      // 26f: ifnonnull 37f
      // 272: lload 14
      // 274: bipush 1
      // 275: anewarray 325
      // 278: dup_x2
      // 279: dup_x2
      // 27a: pop
      // 27b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27e: bipush 0
      // 27f: swap
      // 280: aastore
      // 281: ldc2_w -1744289878121812035
      // 284: lload 3
      // 285: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: aload 40
      // 28c: ifnonnull 3fd
      // 28f: goto 29c
      // 292: ldc2_w -491230035487422991
      // 295: lload 3
      // 296: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: athrow
      // 29c: ifeq 37d
      // 29f: goto 2ac
      // 2a2: ldc2_w -491230035487422991
      // 2a5: lload 3
      // 2a6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: athrow
      // 2ac: aload 2
      // 2ad: new java/lang/StringBuilder
      // 2b0: dup
      // 2b1: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b4: sipush 13800
      // 2b7: ldc2_w 1061315939881433048
      // 2ba: lload 3
      // 2bb: lxor
      // 2bc: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c4: aload 43
      // 2c6: lload 28
      // 2c8: bipush 1
      // 2c9: anewarray 325
      // 2cc: dup_x2
      // 2cd: dup_x2
      // 2ce: pop
      // 2cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d2: bipush 0
      // 2d3: swap
      // 2d4: aastore
      // 2d5: ldc2_w -1865376264438521746
      // 2d8: lload 3
      // 2d9: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e1: sipush 4464
      // 2e4: ldc2_w 3432553712730051395
      // 2e7: lload 3
      // 2e8: lxor
      // 2e9: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: aload 0
      // 2f2: lload 12
      // 2f4: bipush 1
      // 2f5: anewarray 325
      // 2f8: dup_x2
      // 2f9: dup_x2
      // 2fa: pop
      // 2fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fe: bipush 0
      // 2ff: swap
      // 300: aastore
      // 301: ldc2_w -338011881303087484
      // 304: lload 3
      // 305: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30d: sipush 32092
      // 310: ldc2_w 3473723098032308072
      // 313: lload 3
      // 314: lxor
      // 315: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31d: aload 0
      // 31e: lload 30
      // 320: bipush 1
      // 321: anewarray 325
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w -339665425209044149
      // 330: lload 3
      // 331: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 339: ldc "."
      // 33b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 341: lload 8
      // 343: bipush 2
      // 344: anewarray 325
      // 347: dup_x2
      // 348: dup_x2
      // 349: pop
      // 34a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34d: bipush 1
      // 34e: swap
      // 34f: aastore
      // 350: dup_x1
      // 351: swap
      // 352: bipush 0
      // 353: swap
      // 354: aastore
      // 355: ldc2_w -22266681956419799
      // 358: lload 3
      // 359: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: aload 42
      // 360: lload 3
      // 361: lconst_0
      // 362: lcmp
      // 363: iflt 251
      // 366: invokeinterface java/util/Iterator.remove ()V 1
      // 36b: aload 40
      // 36d: ifnull 24f
      // 370: goto 37d
      // 373: ldc2_w -491230035487422991
      // 376: lload 3
      // 377: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: athrow
      // 37d: aload 43
      // 37f: lload 28
      // 381: bipush 1
      // 382: anewarray 325
      // 385: dup_x2
      // 386: dup_x2
      // 387: pop
      // 388: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38b: bipush 0
      // 38c: swap
      // 38d: aastore
      // 38e: ldc2_w -1865376264438521746
      // 391: lload 3
      // 392: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: lload 22
      // 399: dup2_x1
      // 39a: pop2
      // 39b: bipush 2
      // 39c: anewarray 325
      // 39f: dup_x1
      // 3a0: swap
      // 3a1: bipush 1
      // 3a2: swap
      // 3a3: aastore
      // 3a4: dup_x2
      // 3a5: dup_x2
      // 3a6: pop
      // 3a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3aa: bipush 0
      // 3ab: swap
      // 3ac: aastore
      // 3ad: ldc2_w -2229347812675542801
      // 3b0: lload 3
      // 3b1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: astore 44
      // 3b8: aload 43
      // 3ba: lload 24
      // 3bc: aload 44
      // 3be: bipush 2
      // 3bf: anewarray 325
      // 3c2: dup_x1
      // 3c3: swap
      // 3c4: bipush 1
      // 3c5: swap
      // 3c6: aastore
      // 3c7: dup_x2
      // 3c8: dup_x2
      // 3c9: pop
      // 3ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3cd: bipush 0
      // 3ce: swap
      // 3cf: aastore
      // 3d0: ldc2_w -94204899710349615
      // 3d3: lload 3
      // 3d4: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: aload 40
      // 3db: ifnull 24f
      // 3de: aload 2
      // 3df: lload 3
      // 3e0: lconst_0
      // 3e1: lcmp
      // 3e2: iflt 260
      // 3e5: lload 32
      // 3e7: bipush 1
      // 3e8: anewarray 325
      // 3eb: dup_x2
      // 3ec: dup_x2
      // 3ed: pop
      // 3ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f1: bipush 0
      // 3f2: swap
      // 3f3: aastore
      // 3f4: ldc2_w -1833922284817724891
      // 3f7: lload 3
      // 3f8: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: istore 42
      // 3ff: aload 2
      // 400: lload 20
      // 402: bipush 1
      // 403: anewarray 325
      // 406: dup_x2
      // 407: dup_x2
      // 408: pop
      // 409: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 40c: bipush 0
      // 40d: swap
      // 40e: aastore
      // 40f: ldc2_w -517526850586149023
      // 412: lload 3
      // 413: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 418: istore 43
      // 41a: aload 2
      // 41b: lload 26
      // 41d: bipush 1
      // 41e: anewarray 325
      // 421: dup_x2
      // 422: dup_x2
      // 423: pop
      // 424: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 427: bipush 0
      // 428: swap
      // 429: aastore
      // 42a: ldc2_w -492721277078738571
      // 42d: lload 3
      // 42e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 433: istore 44
      // 435: aload 0
      // 436: lload 18
      // 438: aload 2
      // 439: iload 42
      // 43b: iload 43
      // 43d: iload 44
      // 43f: bipush 5
      // 440: anewarray 325
      // 443: dup_x1
      // 444: swap
      // 445: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 448: bipush 4
      // 449: swap
      // 44a: aastore
      // 44b: dup_x1
      // 44c: swap
      // 44d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 450: bipush 3
      // 451: swap
      // 452: aastore
      // 453: dup_x1
      // 454: swap
      // 455: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 458: bipush 2
      // 459: swap
      // 45a: aastore
      // 45b: dup_x1
      // 45c: swap
      // 45d: bipush 1
      // 45e: swap
      // 45f: aastore
      // 460: dup_x2
      // 461: dup_x2
      // 462: pop
      // 463: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 466: bipush 0
      // 467: swap
      // 468: aastore
      // 469: ldc2_w -493320474862412561
      // 46c: lload 3
      // 46d: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: return
   }

   protected void O(Object[] param1) {
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
      // 00f: checkcast com/zelix/lqq
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
      // 027: istore 7
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 2
      // 033: pop
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 84543721881838
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 119143517916163
      // 041: lxor
      // 042: lstore 10
      // 044: pop2
      // 045: ldc2_w -2447378320742416373
      // 048: lload 5
      // 04a: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: astore 12
      // 051: aload 0
      // 052: ldc2_w -2795638817290267605
      // 055: lload 5
      // 057: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 12
      // 05e: ifnonnull 0d1
      // 061: invokeinterface java/util/List.size ()I 1
      // 066: ifne 0b8
      // 069: goto 077
      // 06c: ldc2_w -4435505065980313938
      // 06f: lload 5
      // 071: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 4
      // 079: sipush 24652
      // 07c: ldc2_w 2632524071596153125
      // 07f: lload 5
      // 081: lxor
      // 082: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: lload 8
      // 089: bipush 2
      // 08a: anewarray 325
      // 08d: dup_x2
      // 08e: dup_x2
      // 08f: pop
      // 090: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 093: bipush 1
      // 094: swap
      // 095: aastore
      // 096: dup_x1
      // 097: swap
      // 098: bipush 0
      // 099: swap
      // 09a: aastore
      // 09b: ldc2_w -2685246405006630961
      // 09e: lload 5
      // 0a0: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 12
      // 0a7: ifnull 190
      // 0aa: goto 0b8
      // 0ad: ldc2_w -4435505065980313938
      // 0b0: lload 5
      // 0b2: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: ldc2_w -2795638817290267605
      // 0bc: lload 5
      // 0be: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: goto 0d1
      // 0c6: ldc2_w -4435505065980313938
      // 0c9: lload 5
      // 0cb: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d6: astore 13
      // 0d8: aload 13
      // 0da: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0df: ifeq 190
      // 0e2: aload 13
      // 0e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e9: checkcast com/zelix/y6
      // 0ec: astore 14
      // 0ee: lload 5
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: iflt 17d
      // 0f5: aload 14
      // 0f7: lload 10
      // 0f9: bipush 1
      // 0fa: anewarray 325
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w -2502878320732185807
      // 109: lload 5
      // 10b: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: sipush 18449
      // 113: ldc2_w 8361682151528558975
      // 116: lload 5
      // 118: lxor
      // 119: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 121: ifne 18b
      // 124: aload 4
      // 126: new java/lang/StringBuilder
      // 129: dup
      // 12a: invokespecial java/lang/StringBuilder.<init> ()V
      // 12d: aload 14
      // 12f: lload 10
      // 131: bipush 1
      // 132: anewarray 325
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: ldc2_w -2502878320732185807
      // 141: lload 5
      // 143: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: sipush 19254
      // 14e: ldc2_w 5466166187661718100
      // 151: lload 5
      // 153: lxor
      // 154: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/px.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15f: lload 8
      // 161: bipush 2
      // 162: anewarray 325
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: bipush 0
      // 171: swap
      // 172: aastore
      // 173: ldc2_w -2685246405006630961
      // 176: lload 5
      // 178: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: goto 18b
      // 180: ldc2_w -4435505065980313938
      // 183: lload 5
      // 185: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 12
      // 18d: ifnull 0d8
      // 190: return
   }

   public px(int var1, short var2, int var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 32261883981707L;
      super(var7, var3);
      m44.a<"u">(this, new ArrayList(), -4998717663755585608L, var5);
   }

   public void v(Object[] var1) {
      long var2 = (Long)var1[0];
      y6 var4 = (y6)var1[1];
      m44.a<"t">(this, -3718872000721141381L, var2).add(var4);
   }

   public String m(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"p">(28680, 7901357553474975170L ^ var2);
   }

   static {
      long var0 = a ^ 116776540137170L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "o\u0089\u000f\u0082º\u008e\u008c*\u0096Í¹ÿÒ*xð\u0007=Ô~à\u009a\u0096W\u0012\u008fÎÂ¾°Îø\u0010\u001aA\nv¥¾\nÔIØu\u0097PÄ:f8\u009a\b£ë\u0099ñ7\u0001áî®\u0011Å¡Ït\u0006òÖ\tca¼-\u0016ZRm\u008cÜsu\u0091±°,\u001as\u001eÇÏe@Òù;UnßTX\t\u0007!9: oÏp\u0015«&\u0005îõ(ù\u009a\u0098.Ôéá)×Ë:¥°è\u0007Ý\\Mã\u000b\u0080Ã(J\bâP%·:¡ò¶-[¹ð\u0019\u001fÚèÏ¡\n\u001a\u0000+\u0088mÿ \u0017ÇÔ\rk.\u0089\u0012:Ã2\u0097 \u0098#ç\u0013z\u009axP6\u009awÅ\u00973°¹Ã4¬¯\u0012\u009b¶\u0007^R¬²ü`>ñ w\u00adà\u0096Å\u0096\u009cJ\u0094ûÍF\u009a\u008f3t|\u0012}\n¶T¯«8Þã-\u0007Ý\u0091T@¨p·\u0086vx8\u0006ØÍª±\u0019¶\u0093\u009cÌáJ\u008e®\u001a6\u0084\fàõç\u0013÷~5J³ÇXY`{EÎEÝÒ0\u0086q@\u0087\u0093\u001e»\u0004â·\u0098Ä\u0094?~\u0010s'Ú\u0018/Á&\u00adý\u001aê=JM\u001b\u00ade\u0084÷Aÿ8T\u007f\u000bD\u0090\"";
      int var8 = "o\u0089\u000f\u0082º\u008e\u008c*\u0096Í¹ÿÒ*xð\u0007=Ô~à\u009a\u0096W\u0012\u008fÎÂ¾°Îø\u0010\u001aA\nv¥¾\nÔIØu\u0097PÄ:f8\u009a\b£ë\u0099ñ7\u0001áî®\u0011Å¡Ït\u0006òÖ\tca¼-\u0016ZRm\u008cÜsu\u0091±°,\u001as\u001eÇÏe@Òù;UnßTX\t\u0007!9: oÏp\u0015«&\u0005îõ(ù\u009a\u0098.Ôéá)×Ë:¥°è\u0007Ý\\Mã\u000b\u0080Ã(J\bâP%·:¡ò¶-[¹ð\u0019\u001fÚèÏ¡\n\u001a\u0000+\u0088mÿ \u0017ÇÔ\rk.\u0089\u0012:Ã2\u0097 \u0098#ç\u0013z\u009axP6\u009awÅ\u00973°¹Ã4¬¯\u0012\u009b¶\u0007^R¬²ü`>ñ w\u00adà\u0096Å\u0096\u009cJ\u0094ûÍF\u009a\u008f3t|\u0012}\n¶T¯«8Þã-\u0007Ý\u0091T@¨p·\u0086vx8\u0006ØÍª±\u0019¶\u0093\u009cÌáJ\u008e®\u001a6\u0084\fàõç\u0013÷~5J³ÇXY`{EÎEÝÒ0\u0086q@\u0087\u0093\u001e»\u0004â·\u0098Ä\u0094?~\u0010s'Ú\u0018/Á&\u00adý\u001aê=JM\u001b\u00ade\u0084÷Aÿ8T\u007f\u000bD\u0090\""
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[11];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ý\u0080ì\u0000«ó&Ú¢\u009b\u0085aQôÒ\u0083y\u0012¯æø\u0089 \u0018/ªÚ\tY\u0002\u008c¾Â6\u0001[Û°\u0001ð\u0010aÓE[8Á¾\u0014*\u0083\u0015\u0016#çÿi";
                  var8 = "ý\u0080ì\u0000«ó&Ú¢\u009b\u0085aQôÒ\u0083y\u0012¯æø\u0089 \u0018/ªÚ\tY\u0002\u008c¾Â6\u0001[Û°\u0001ð\u0010aÓE[8Á¾\u0014*\u0083\u0015\u0016#çÿi"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30245;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/px", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/px" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
