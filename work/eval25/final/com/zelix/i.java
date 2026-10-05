package com.zelix;

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

public class i extends b {
   private char[] G;
   private List t;
   private char[] h;
   private String C;
   private char[] r;
   private Map q;
   private Map P;
   private char[] E;
   private static final long c = ess.a(7263906269434876761L, 6696848901673710511L, MethodHandles.lookup().lookupClass()).a(216788217065622L);
   private static final String[] l;
   private static final String[] o;
   private static final Map p = new HashMap(13);

   private String S(Object[] param1) {
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
      // 00c: checkcast java/lang/String
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/String
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/String
      // 01e: astore 7
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/util/HashMap
      // 026: astore 2
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 10
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: istore 11
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast java/lang/Boolean
      // 051: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 054: istore 5
      // 056: pop
      // 057: getstatic com/zelix/i.c J
      // 05a: lload 8
      // 05c: lxor
      // 05d: lstore 8
      // 05f: lload 8
      // 061: dup2
      // 062: ldc2_w 30256610507370
      // 065: lxor
      // 066: lstore 12
      // 068: dup2
      // 069: ldc2_w 126861190428158
      // 06c: lxor
      // 06d: lstore 14
      // 06f: dup2
      // 070: ldc2_w 4787249186237
      // 073: lxor
      // 074: lstore 16
      // 076: pop2
      // 077: ldc2_w -3490814056366713962
      // 07a: lload 8
      // 07c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: ldc ""
      // 083: astore 23
      // 085: astore 21
      // 087: aload 4
      // 089: ldc ""
      // 08b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08e: aload 21
      // 090: ifnonnull 0c8
      // 093: ifeq 0c6
      // 096: goto 0a4
      // 099: ldc2_w -4023682473462246171
      // 09c: lload 8
      // 09e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: lload 14
      // 0a7: aload 3
      // 0a8: bipush 2
      // 0a9: anewarray 94
      // 0ac: dup_x1
      // 0ad: swap
      // 0ae: bipush 1
      // 0af: swap
      // 0b0: aastore
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 0
      // 0b8: swap
      // 0b9: aastore
      // 0ba: ldc2_w -3666685368520767434
      // 0bd: lload 8
      // 0bf: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: astore 23
      // 0c6: iload 11
      // 0c8: aload 21
      // 0ca: lload 8
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 101
      // 0d1: ifnonnull 0f8
      // 0d4: ifeq 232
      // 0d7: goto 0e5
      // 0da: ldc2_w -4023682473462246171
      // 0dd: lload 8
      // 0df: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 4
      // 0e7: invokevirtual java/lang/String.length ()I
      // 0ea: goto 0f8
      // 0ed: ldc2_w -4023682473462246171
      // 0f0: lload 8
      // 0f2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: lload 8
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 142
      // 0ff: aload 21
      // 101: ifnonnull 142
      // 104: ifne 232
      // 107: goto 115
      // 10a: ldc2_w -4023682473462246171
      // 10d: lload 8
      // 10f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 6
      // 117: aload 21
      // 119: lload 8
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 167
      // 120: ifnonnull 15e
      // 123: goto 131
      // 126: ldc2_w -4023682473462246171
      // 129: lload 8
      // 12b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: invokevirtual java/lang/String.length ()I
      // 134: goto 142
      // 137: ldc2_w -4023682473462246171
      // 13a: lload 8
      // 13c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: ifne 232
      // 145: aload 0
      // 146: ldc2_w -3518670617458080742
      // 149: lload 8
      // 14b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: goto 15e
      // 153: ldc2_w -4023682473462246171
      // 156: lload 8
      // 158: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: lload 8
      // 160: lconst_0
      // 161: lcmp
      // 162: iflt 194
      // 165: aload 21
      // 167: ifnonnull 194
      // 16a: ifnull 22e
      // 16d: goto 17b
      // 170: ldc2_w -4023682473462246171
      // 173: lload 8
      // 175: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: aload 0
      // 17c: ldc2_w -3518670617458080742
      // 17f: lload 8
      // 181: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: goto 194
      // 189: ldc2_w -4023682473462246171
      // 18c: lload 8
      // 18e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: invokevirtual java/lang/String.length ()I
      // 197: aload 21
      // 199: ifnonnull 22f
      // 19c: ifeq 22e
      // 19f: goto 1ad
      // 1a2: ldc2_w -4023682473462246171
      // 1a5: lload 8
      // 1a7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: ldc2_w -3518670617458080742
      // 1b1: lload 8
      // 1b3: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: bipush 0
      // 1b9: invokevirtual java/lang/String.charAt (I)C
      // 1bc: ldc2_w -3299666704387807104
      // 1bf: lload 8
      // 1c1: invokedynamic r (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: aload 21
      // 1c8: lload 8
      // 1ca: lconst_0
      // 1cb: lcmp
      // 1cc: iflt 21a
      // 1cf: ifnonnull 218
      // 1d2: goto 1e0
      // 1d5: ldc2_w -4023682473462246171
      // 1d8: lload 8
      // 1da: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: ifne 232
      // 1e3: goto 1f1
      // 1e6: ldc2_w -4023682473462246171
      // 1e9: lload 8
      // 1eb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: ldc2_w -3518670617458080742
      // 1f5: lload 8
      // 1f7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: bipush 0
      // 1fd: invokevirtual java/lang/String.charAt (I)C
      // 200: ldc2_w -3875396638996339309
      // 203: lload 8
      // 205: invokedynamic r (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: goto 218
      // 20d: ldc2_w -4023682473462246171
      // 210: lload 8
      // 212: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 21
      // 21a: ifnonnull 22f
      // 21d: ifeq 232
      // 220: goto 22e
      // 223: ldc2_w -4023682473462246171
      // 226: lload 8
      // 228: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: athrow
      // 22e: bipush 1
      // 22f: goto 233
      // 232: bipush 0
      // 233: istore 24
      // 235: aload 0
      // 236: aload 23
      // 238: aload 4
      // 23a: aload 3
      // 23b: aload 2
      // 23c: iload 24
      // 23e: ifeq 245
      // 241: bipush 1
      // 242: goto 247
      // 245: iload 10
      // 247: iload 5
      // 249: istore 18
      // 24b: istore 19
      // 24d: astore 20
      // 24f: lload 16
      // 251: aload 20
      // 253: iload 19
      // 255: iload 18
      // 257: bipush 7
      // 259: anewarray 94
      // 25c: dup_x1
      // 25d: swap
      // 25e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 261: bipush 6
      // 263: swap
      // 264: aastore
      // 265: dup_x1
      // 266: swap
      // 267: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26a: bipush 5
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 4
      // 270: swap
      // 271: aastore
      // 272: dup_x2
      // 273: dup_x2
      // 274: pop
      // 275: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 278: bipush 3
      // 279: swap
      // 27a: aastore
      // 27b: dup_x1
      // 27c: swap
      // 27d: bipush 2
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: bipush 1
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w -2898059059482491394
      // 28d: lload 8
      // 28f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: astore 25
      // 296: iload 24
      // 298: aload 21
      // 29a: ifnonnull 2d1
      // 29d: ifeq 337
      // 2a0: aload 25
      // 2a2: aload 21
      // 2a4: ifnonnull 35a
      // 2a7: goto 2b5
      // 2aa: ldc2_w -4023682473462246171
      // 2ad: lload 8
      // 2af: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: bipush 0
      // 2b6: invokevirtual java/lang/String.charAt (I)C
      // 2b9: ldc2_w -3299666704387807104
      // 2bc: lload 8
      // 2be: invokedynamic r (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: goto 2d1
      // 2c6: ldc2_w -4023682473462246171
      // 2c9: lload 8
      // 2cb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: ifne 337
      // 2d4: aload 25
      // 2d6: aload 21
      // 2d8: ifnonnull 35a
      // 2db: goto 2e9
      // 2de: ldc2_w -4023682473462246171
      // 2e1: lload 8
      // 2e3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: bipush 0
      // 2ea: invokevirtual java/lang/String.charAt (I)C
      // 2ed: ldc2_w -3875396638996339309
      // 2f0: lload 8
      // 2f2: invokedynamic r (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: ifeq 337
      // 2fa: goto 308
      // 2fd: ldc2_w -4023682473462246171
      // 300: lload 8
      // 302: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: new java/lang/StringBuilder
      // 30b: dup
      // 30c: aload 25
      // 30e: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 311: astore 26
      // 313: aload 26
      // 315: bipush 0
      // 316: aload 25
      // 318: bipush 0
      // 319: invokevirtual java/lang/String.charAt (I)C
      // 31c: ldc2_w -3421057750094924666
      // 31f: lload 8
      // 321: invokedynamic r (CJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: ldc2_w -3880205633812501803
      // 329: lload 8
      // 32b: invokedynamic j (Ljava/lang/Object;ICJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: aload 26
      // 332: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 335: astore 25
      // 337: new java/lang/StringBuilder
      // 33a: dup
      // 33b: invokespecial java/lang/StringBuilder.<init> ()V
      // 33e: aload 23
      // 340: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 343: aload 4
      // 345: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 348: aload 6
      // 34a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34d: aload 25
      // 34f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 352: aload 7
      // 354: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 357: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 35a: astore 22
      // 35c: aload 0
      // 35d: lload 12
      // 35f: aload 3
      // 360: aload 22
      // 362: iload 10
      // 364: iload 24
      // 366: bipush 5
      // 367: anewarray 94
      // 36a: dup_x1
      // 36b: swap
      // 36c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36f: bipush 4
      // 370: swap
      // 371: aastore
      // 372: dup_x1
      // 373: swap
      // 374: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 377: bipush 3
      // 378: swap
      // 379: aastore
      // 37a: dup_x1
      // 37b: swap
      // 37c: bipush 2
      // 37d: swap
      // 37e: aastore
      // 37f: dup_x1
      // 380: swap
      // 381: bipush 1
      // 382: swap
      // 383: aastore
      // 384: dup_x2
      // 385: dup_x2
      // 386: pop
      // 387: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38a: bipush 0
      // 38b: swap
      // 38c: aastore
      // 38d: ldc2_w -4004255169894529107
      // 390: lload 8
      // 392: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: ifeq 235
      // 39a: aload 22
      // 39c: aload 21
      // 39e: lload 8
      // 3a0: lconst_0
      // 3a1: lcmp
      // 3a2: ifle 2d8
      // 3a5: ifnonnull 294
      // 3a8: areturn
   }

   private String u(Object[] var1) {
      String var7 = (String)var1[0];
      String var8 = (String)var1[1];
      String var9 = (String)var1[2];
      long var4 = (Long)var1[3];
      HashMap var6 = (HashMap)var1[4];
      boolean var2 = (Boolean)var1[5];
      boolean var3 = (Boolean)var1[6];
      var4 = c ^ var4;
      long var10 = var4 ^ 126870736958464L;
      long var12 = var4 ^ 111047347682503L;
      hk[] var14 = x44.a<"u">(-6023222867355750287L, var4);

      label117: {
         Object var10000;
         label107: {
            try {
               var10000 = var8;
               if (var14 != null) {
                  break label107;
               }

               if (var8.equals("")) {
                  break label117;
               }
            } catch (gj var20) {
               throw x44.a<"u">(var20, -6066885597614360830L, var4);
            }

            var10000 = x44.a<"i">(this, -6102184038811289198L, var4).get(var8);
         }

         eh var22 = (eh)var10000;

         label96: {
            try {
               if (var14 != null || var22 != null) {
                  break label96;
               }
            } catch (gj var19) {
               throw x44.a<"u">(var19, -6066885597614360830L, var4);
            }

            var22 = x44.a<"m">(
               this,
               new Object[]{
                  x44.a<"i">(this, -5776137815381540219L, var4),
                  x44.a<"i">(this, -5705406734884700321L, var4),
                  x44.a<"i">(this, -5660804247965957242L, var4),
                  x44.a<"i">(this, -6261721821342748467L, var4),
                  x44.a<"i">(this, -6166087485657025890L, var4),
                  var12
               },
               -5346401349464048029L,
               var4
            );
            x44.a<"i">(this, -6102184038811289198L, var4).put(var8, var22);
         }

         String var23 = null;

         label88:
         while (true) {
            String var27 = x44.a<"i">(this, -5995348706006865923L, var4);
            Object[] var29 = new Object[]{null, null, var2};
            var29[1] = var10;
            var29[0] = var27;
            var23 = x44.a<"m">(var22, var29, -5306552978442547553L, var4);
            var10000 = var23;

            label86:
            while (true) {
               if (var10000 != null && x44.a<"l">(-5294234881981516937L, var4)) {
                  var23 = var23 + b<"u">(131, 3107238146338017593L ^ var4);
               }

               var10000 = var23;

               do {
                  hk[] var28 = var14;

                  do {
                     if (var28 != null) {
                        continue label86;
                     }

                     if (var10000 == null) {
                        continue label88;
                     }

                     label78: {
                        label77: {
                           try {
                              var10000 = var6;
                              if (var14 != null) {
                                 break label77;
                              }

                              if (var6 == null) {
                                 break label78;
                              }
                           } catch (gj var18) {
                              throw x44.a<"u">(var18, -6066885597614360830L, var4);
                           }

                           var10000 = var6;
                        }

                        if (x44.a<"m">(var10000, var23, -6246919437226221971L, var4)) {
                           continue label88;
                        }
                     }

                     var10000 = var23;
                     var28 = var14;
                  } while (var4 <= 0L);
               } while (var14 != null);

               return var23;
            }
         }
      }

      eh var15 = (eh)x44.a<"i">(this, -5248957641912834717L, var4).get(var7);

      label58: {
         try {
            if (var14 != null || var15 != null) {
               break label58;
            }
         } catch (gj var17) {
            throw x44.a<"u">(var17, -6066885597614360830L, var4);
         }

         var15 = x44.a<"m">(
            this,
            new Object[]{
               x44.a<"i">(this, -5776137815381540219L, var4),
               x44.a<"i">(this, -5705406734884700321L, var4),
               x44.a<"i">(this, -5660804247965957242L, var4),
               x44.a<"i">(this, -6261721821342748467L, var4),
               x44.a<"i">(this, -6166087485657025890L, var4),
               var12
            },
            -5346401349464048029L,
            var4
         );
         x44.a<"i">(this, -5248957641912834717L, var4).put(var7, var15);
      }

      Object var16 = null;
      String var10001 = x44.a<"i">(this, -5995348706006865923L, var4);
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = var10;
      var10005[0] = var10001;
      return x44.a<"m">(var15, var10005, -5306552978442547553L, var4);
   }

   i(
      _s9 param1,
      boolean param2,
      boolean param3,
      String param4,
      int param5,
      int param6,
      long param7,
      boolean param9,
      zy param10,
      HashMap param11,
      _y4 param12,
      Map param13,
      List param14
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i.c J
      // 003: lload 7
      // 005: lxor
      // 006: lstore 7
      // 008: lload 7
      // 00a: dup2
      // 00b: ldc2_w 20874561771070
      // 00e: lxor
      // 00f: lstore 15
      // 011: dup2
      // 012: ldc2_w 65889249935219
      // 015: lxor
      // 016: lstore 17
      // 018: dup2
      // 019: ldc2_w 101623210579454
      // 01c: lxor
      // 01d: lstore 19
      // 01f: dup2
      // 020: ldc2_w 2403268120662
      // 023: lxor
      // 024: lstore 21
      // 026: pop2
      // 027: ldc2_w 8500385718219106799
      // 02a: lload 7
      // 02c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aload 0
      // 032: aload 1
      // 033: aload 11
      // 035: lload 21
      // 037: aload 12
      // 039: aload 13
      // 03b: iload 5
      // 03d: iload 6
      // 03f: iload 9
      // 041: invokespecial com/zelix/b.<init> (Lcom/zelix/_s9;Ljava/util/HashMap;JLcom/zelix/_y4;Ljava/util/Map;IIZ)V
      // 044: aload 0
      // 045: lload 17
      // 047: bipush 1
      // 048: anewarray 94
      // 04b: dup_x2
      // 04c: dup_x2
      // 04d: pop
      // 04e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 051: bipush 0
      // 052: swap
      // 053: aastore
      // 054: ldc2_w 8254980969008633056
      // 057: lload 7
      // 059: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: ldc2_w 7978599140130454781
      // 061: lload 7
      // 063: invokedynamic p (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: lload 17
      // 06b: bipush 1
      // 06c: anewarray 94
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w 8254980969008633056
      // 07b: lload 7
      // 07d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: ldc2_w 8272820605688537100
      // 085: lload 7
      // 087: invokedynamic p (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: astore 23
      // 08e: aload 10
      // 090: ldc2_w 7565451473411956218
      // 093: lload 7
      // 095: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: aload 23
      // 09c: ifnonnull 68a
      // 09f: tableswitch 1437 0 2 36 507 978
      // 0b8: ldc2_w 8237170312203202204
      // 0bb: lload 7
      // 0bd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: iload 2
      // 0c4: lload 7
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 18b
      // 0cb: aload 23
      // 0cd: ifnonnull 18b
      // 0d0: goto 0de
      // 0d3: ldc2_w 8237170312203202204
      // 0d6: lload 7
      // 0d8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: lload 7
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: iflt 17d
      // 0e5: ifne 17c
      // 0e8: goto 0f6
      // 0eb: ldc2_w 8237170312203202204
      // 0ee: lload 7
      // 0f0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: ldc2_w 8534993437339526777
      // 0fa: lload 7
      // 0fc: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual [C.clone ()Ljava/lang/Object;
      // 104: checkcast [C
      // 107: ldc2_w 8523431947139767067
      // 10a: lload 7
      // 10c: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: aload 0
      // 112: ldc2_w 8534993437339526777
      // 115: lload 7
      // 117: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: invokevirtual [C.clone ()Ljava/lang/Object;
      // 11f: checkcast [C
      // 122: ldc2_w 7587452380268177089
      // 125: lload 7
      // 127: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: aload 0
      // 12d: ldc2_w 8534993437339526777
      // 130: lload 7
      // 132: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: invokevirtual [C.clone ()Ljava/lang/Object;
      // 13a: checkcast [C
      // 13d: ldc2_w 7561141317145156120
      // 140: lload 7
      // 142: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 0
      // 148: ldc2_w 8534993437339526777
      // 14b: lload 7
      // 14d: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokevirtual [C.clone ()Ljava/lang/Object;
      // 155: checkcast [C
      // 158: ldc2_w 8108656761932441939
      // 15b: lload 7
      // 15d: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: aload 23
      // 164: lload 7
      // 166: lconst_0
      // 167: lcmp
      // 168: iflt 658
      // 16b: ifnull 63c
      // 16e: goto 17c
      // 171: ldc2_w 8237170312203202204
      // 174: lload 7
      // 176: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: iload 3
      // 17d: goto 18b
      // 180: ldc2_w 8237170312203202204
      // 183: lload 7
      // 185: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: ifeq 214
      // 18e: aload 0
      // 18f: ldc2_w 7559944094913668501
      // 192: lload 7
      // 194: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: invokevirtual [C.clone ()Ljava/lang/Object;
      // 19c: checkcast [C
      // 19f: ldc2_w 8523431947139767067
      // 1a2: lload 7
      // 1a4: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: aload 0
      // 1aa: ldc2_w 7822767495621795318
      // 1ad: lload 7
      // 1af: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual [C.clone ()Ljava/lang/Object;
      // 1b7: checkcast [C
      // 1ba: ldc2_w 7587452380268177089
      // 1bd: lload 7
      // 1bf: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: aload 0
      // 1c5: ldc2_w 7559944094913668501
      // 1c8: lload 7
      // 1ca: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: invokevirtual [C.clone ()Ljava/lang/Object;
      // 1d2: checkcast [C
      // 1d5: ldc2_w 7561141317145156120
      // 1d8: lload 7
      // 1da: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: aload 0
      // 1e0: ldc2_w 7822767495621795318
      // 1e3: lload 7
      // 1e5: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: invokevirtual [C.clone ()Ljava/lang/Object;
      // 1ed: checkcast [C
      // 1f0: ldc2_w 8108656761932441939
      // 1f3: lload 7
      // 1f5: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: aload 23
      // 1fc: lload 7
      // 1fe: lconst_0
      // 1ff: lcmp
      // 200: ifle 658
      // 203: ifnull 63c
      // 206: goto 214
      // 209: ldc2_w 8237170312203202204
      // 20c: lload 7
      // 20e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 0
      // 215: ldc2_w 7886000091486422427
      // 218: lload 7
      // 21a: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: invokevirtual [C.clone ()Ljava/lang/Object;
      // 222: checkcast [C
      // 225: ldc2_w 8523431947139767067
      // 228: lload 7
      // 22a: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: aload 0
      // 230: ldc2_w 7822767495621795318
      // 233: lload 7
      // 235: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: invokevirtual [C.clone ()Ljava/lang/Object;
      // 23d: checkcast [C
      // 240: ldc2_w 7587452380268177089
      // 243: lload 7
      // 245: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: aload 0
      // 24b: ldc2_w 7886000091486422427
      // 24e: lload 7
      // 250: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: invokevirtual [C.clone ()Ljava/lang/Object;
      // 258: checkcast [C
      // 25b: ldc2_w 7561141317145156120
      // 25e: lload 7
      // 260: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: aload 0
      // 266: ldc2_w 7822767495621795318
      // 269: lload 7
      // 26b: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: invokevirtual [C.clone ()Ljava/lang/Object;
      // 273: checkcast [C
      // 276: ldc2_w 8108656761932441939
      // 279: lload 7
      // 27b: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: aload 23
      // 282: lload 7
      // 284: lconst_0
      // 285: lcmp
      // 286: ifle 658
      // 289: ifnull 63c
      // 28c: goto 29a
      // 28f: ldc2_w 8237170312203202204
      // 292: lload 7
      // 294: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: iload 2
      // 29b: lload 7
      // 29d: lconst_0
      // 29e: lcmp
      // 29f: iflt 362
      // 2a2: aload 23
      // 2a4: ifnonnull 362
      // 2a7: goto 2b5
      // 2aa: ldc2_w 8237170312203202204
      // 2ad: lload 7
      // 2af: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: lload 7
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: ifle 354
      // 2bc: ifne 353
      // 2bf: goto 2cd
      // 2c2: ldc2_w 8237170312203202204
      // 2c5: lload 7
      // 2c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: aload 0
      // 2ce: ldc2_w 8507709260781522542
      // 2d1: lload 7
      // 2d3: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: invokevirtual [C.clone ()Ljava/lang/Object;
      // 2db: checkcast [C
      // 2de: ldc2_w 8523431947139767067
      // 2e1: lload 7
      // 2e3: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: aload 0
      // 2e9: ldc2_w 8507709260781522542
      // 2ec: lload 7
      // 2ee: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual [C.clone ()Ljava/lang/Object;
      // 2f6: checkcast [C
      // 2f9: ldc2_w 7587452380268177089
      // 2fc: lload 7
      // 2fe: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: aload 0
      // 304: ldc2_w 8507709260781522542
      // 307: lload 7
      // 309: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: invokevirtual [C.clone ()Ljava/lang/Object;
      // 311: checkcast [C
      // 314: ldc2_w 7561141317145156120
      // 317: lload 7
      // 319: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: aload 0
      // 31f: ldc2_w 8507709260781522542
      // 322: lload 7
      // 324: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: invokevirtual [C.clone ()Ljava/lang/Object;
      // 32c: checkcast [C
      // 32f: ldc2_w 8108656761932441939
      // 332: lload 7
      // 334: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: aload 23
      // 33b: lload 7
      // 33d: lconst_0
      // 33e: lcmp
      // 33f: ifle 658
      // 342: ifnull 63c
      // 345: goto 353
      // 348: ldc2_w 8237170312203202204
      // 34b: lload 7
      // 34d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: athrow
      // 353: iload 3
      // 354: goto 362
      // 357: ldc2_w 8237170312203202204
      // 35a: lload 7
      // 35c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: ifeq 3eb
      // 365: aload 0
      // 366: ldc2_w 7819701266857572536
      // 369: lload 7
      // 36b: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: invokevirtual [C.clone ()Ljava/lang/Object;
      // 373: checkcast [C
      // 376: ldc2_w 8523431947139767067
      // 379: lload 7
      // 37b: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: aload 0
      // 381: ldc2_w 7853649952478539091
      // 384: lload 7
      // 386: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: invokevirtual [C.clone ()Ljava/lang/Object;
      // 38e: checkcast [C
      // 391: ldc2_w 7587452380268177089
      // 394: lload 7
      // 396: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: aload 0
      // 39c: ldc2_w 7819701266857572536
      // 39f: lload 7
      // 3a1: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: invokevirtual [C.clone ()Ljava/lang/Object;
      // 3a9: checkcast [C
      // 3ac: ldc2_w 7561141317145156120
      // 3af: lload 7
      // 3b1: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: aload 0
      // 3b7: ldc2_w 7853649952478539091
      // 3ba: lload 7
      // 3bc: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c1: invokevirtual [C.clone ()Ljava/lang/Object;
      // 3c4: checkcast [C
      // 3c7: ldc2_w 8108656761932441939
      // 3ca: lload 7
      // 3cc: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d1: aload 23
      // 3d3: lload 7
      // 3d5: lconst_0
      // 3d6: lcmp
      // 3d7: ifle 658
      // 3da: ifnull 63c
      // 3dd: goto 3eb
      // 3e0: ldc2_w 8237170312203202204
      // 3e3: lload 7
      // 3e5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: athrow
      // 3eb: aload 0
      // 3ec: ldc2_w 7886000091486422427
      // 3ef: lload 7
      // 3f1: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f6: invokevirtual [C.clone ()Ljava/lang/Object;
      // 3f9: checkcast [C
      // 3fc: ldc2_w 8523431947139767067
      // 3ff: lload 7
      // 401: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: aload 0
      // 407: ldc2_w 7853649952478539091
      // 40a: lload 7
      // 40c: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 411: invokevirtual [C.clone ()Ljava/lang/Object;
      // 414: checkcast [C
      // 417: ldc2_w 7587452380268177089
      // 41a: lload 7
      // 41c: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: aload 0
      // 422: ldc2_w 7886000091486422427
      // 425: lload 7
      // 427: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42c: invokevirtual [C.clone ()Ljava/lang/Object;
      // 42f: checkcast [C
      // 432: ldc2_w 7561141317145156120
      // 435: lload 7
      // 437: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43c: aload 0
      // 43d: ldc2_w 7853649952478539091
      // 440: lload 7
      // 442: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 447: invokevirtual [C.clone ()Ljava/lang/Object;
      // 44a: checkcast [C
      // 44d: ldc2_w 8108656761932441939
      // 450: lload 7
      // 452: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: aload 23
      // 459: lload 7
      // 45b: lconst_0
      // 45c: lcmp
      // 45d: iflt 658
      // 460: ifnull 63c
      // 463: goto 471
      // 466: ldc2_w 8237170312203202204
      // 469: lload 7
      // 46b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: athrow
      // 471: iload 2
      // 472: lload 7
      // 474: lconst_0
      // 475: lcmp
      // 476: ifle 539
      // 479: aload 23
      // 47b: ifnonnull 539
      // 47e: goto 48c
      // 481: ldc2_w 8237170312203202204
      // 484: lload 7
      // 486: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: lload 7
      // 48e: lconst_0
      // 48f: lcmp
      // 490: iflt 52b
      // 493: ifne 52a
      // 496: goto 4a4
      // 499: ldc2_w 8237170312203202204
      // 49c: lload 7
      // 49e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: athrow
      // 4a4: aload 0
      // 4a5: ldc2_w 8507709260781522542
      // 4a8: lload 7
      // 4aa: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4af: invokevirtual [C.clone ()Ljava/lang/Object;
      // 4b2: checkcast [C
      // 4b5: ldc2_w 8523431947139767067
      // 4b8: lload 7
      // 4ba: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: aload 0
      // 4c0: ldc2_w 8507709260781522542
      // 4c3: lload 7
      // 4c5: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: invokevirtual [C.clone ()Ljava/lang/Object;
      // 4cd: checkcast [C
      // 4d0: ldc2_w 7587452380268177089
      // 4d3: lload 7
      // 4d5: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: aload 0
      // 4db: ldc2_w 8534993437339526777
      // 4de: lload 7
      // 4e0: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e5: invokevirtual [C.clone ()Ljava/lang/Object;
      // 4e8: checkcast [C
      // 4eb: ldc2_w 7561141317145156120
      // 4ee: lload 7
      // 4f0: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f5: aload 0
      // 4f6: ldc2_w 8534993437339526777
      // 4f9: lload 7
      // 4fb: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 500: invokevirtual [C.clone ()Ljava/lang/Object;
      // 503: checkcast [C
      // 506: ldc2_w 8108656761932441939
      // 509: lload 7
      // 50b: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: aload 23
      // 512: lload 7
      // 514: lconst_0
      // 515: lcmp
      // 516: iflt 658
      // 519: ifnull 63c
      // 51c: goto 52a
      // 51f: ldc2_w 8237170312203202204
      // 522: lload 7
      // 524: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 529: athrow
      // 52a: iload 3
      // 52b: goto 539
      // 52e: ldc2_w 8237170312203202204
      // 531: lload 7
      // 533: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 538: athrow
      // 539: ifeq 5c2
      // 53c: aload 0
      // 53d: ldc2_w 7819701266857572536
      // 540: lload 7
      // 542: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 547: invokevirtual [C.clone ()Ljava/lang/Object;
      // 54a: checkcast [C
      // 54d: ldc2_w 8523431947139767067
      // 550: lload 7
      // 552: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 557: aload 0
      // 558: ldc2_w 7853649952478539091
      // 55b: lload 7
      // 55d: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 562: invokevirtual [C.clone ()Ljava/lang/Object;
      // 565: checkcast [C
      // 568: ldc2_w 7587452380268177089
      // 56b: lload 7
      // 56d: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 572: aload 0
      // 573: ldc2_w 7559944094913668501
      // 576: lload 7
      // 578: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57d: invokevirtual [C.clone ()Ljava/lang/Object;
      // 580: checkcast [C
      // 583: ldc2_w 7561141317145156120
      // 586: lload 7
      // 588: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58d: aload 0
      // 58e: ldc2_w 7822767495621795318
      // 591: lload 7
      // 593: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 598: invokevirtual [C.clone ()Ljava/lang/Object;
      // 59b: checkcast [C
      // 59e: ldc2_w 8108656761932441939
      // 5a1: lload 7
      // 5a3: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a8: aload 23
      // 5aa: lload 7
      // 5ac: lconst_0
      // 5ad: lcmp
      // 5ae: iflt 658
      // 5b1: ifnull 63c
      // 5b4: goto 5c2
      // 5b7: ldc2_w 8237170312203202204
      // 5ba: lload 7
      // 5bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: athrow
      // 5c2: aload 0
      // 5c3: ldc2_w 7886000091486422427
      // 5c6: lload 7
      // 5c8: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: invokevirtual [C.clone ()Ljava/lang/Object;
      // 5d0: checkcast [C
      // 5d3: ldc2_w 8523431947139767067
      // 5d6: lload 7
      // 5d8: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5dd: aload 0
      // 5de: ldc2_w 7853649952478539091
      // 5e1: lload 7
      // 5e3: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e8: invokevirtual [C.clone ()Ljava/lang/Object;
      // 5eb: checkcast [C
      // 5ee: ldc2_w 7587452380268177089
      // 5f1: lload 7
      // 5f3: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f8: aload 0
      // 5f9: ldc2_w 7886000091486422427
      // 5fc: lload 7
      // 5fe: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 603: invokevirtual [C.clone ()Ljava/lang/Object;
      // 606: checkcast [C
      // 609: ldc2_w 7561141317145156120
      // 60c: lload 7
      // 60e: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 613: aload 0
      // 614: ldc2_w 7822767495621795318
      // 617: lload 7
      // 619: invokedynamic j (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61e: invokevirtual [C.clone ()Ljava/lang/Object;
      // 621: checkcast [C
      // 624: ldc2_w 8108656761932441939
      // 627: lload 7
      // 629: invokedynamic p (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62e: goto 63c
      // 631: ldc2_w 8237170312203202204
      // 634: lload 7
      // 636: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63b: athrow
      // 63c: aload 0
      // 63d: aload 4
      // 63f: ldc2_w 8453933168945020515
      // 642: lload 7
      // 644: invokedynamic p (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 649: aload 0
      // 64a: aload 14
      // 64c: ldc2_w 8355287167436499712
      // 64f: lload 7
      // 651: invokedynamic p (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 656: aload 23
      // 658: lload 7
      // 65a: lconst_0
      // 65b: lcmp
      // 65c: ifle 6e7
      // 65f: ifnonnull 6c6
      // 662: aload 1
      // 663: lload 19
      // 665: bipush 1
      // 666: anewarray 94
      // 669: dup_x2
      // 66a: dup_x2
      // 66b: pop
      // 66c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66f: bipush 0
      // 670: swap
      // 671: aastore
      // 672: ldc2_w 7860082742413844232
      // 675: lload 7
      // 677: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67c: goto 68a
      // 67f: ldc2_w 8237170312203202204
      // 682: lload 7
      // 684: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 689: athrow
      // 68a: ifeq 6f1
      // 68d: aload 0
      // 68e: ldc2_w 7587452380268177089
      // 691: lload 7
      // 693: invokedynamic o (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 698: lload 15
      // 69a: dup2_x1
      // 69b: pop2
      // 69c: bipush 2
      // 69d: anewarray 94
      // 6a0: dup_x1
      // 6a1: swap
      // 6a2: bipush 1
      // 6a3: swap
      // 6a4: aastore
      // 6a5: dup_x2
      // 6a6: dup_x2
      // 6a7: pop
      // 6a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6ab: bipush 0
      // 6ac: swap
      // 6ad: aastore
      // 6ae: ldc2_w 7844485645388814857
      // 6b1: lload 7
      // 6b3: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b8: goto 6c6
      // 6bb: ldc2_w 8237170312203202204
      // 6be: lload 7
      // 6c0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c5: athrow
      // 6c6: aload 0
      // 6c7: ldc2_w 8108656761932441939
      // 6ca: lload 7
      // 6cc: invokedynamic o (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d1: lload 15
      // 6d3: dup2_x1
      // 6d4: pop2
      // 6d5: bipush 2
      // 6d6: anewarray 94
      // 6d9: dup_x1
      // 6da: swap
      // 6db: bipush 1
      // 6dc: swap
      // 6dd: aastore
      // 6de: dup_x2
      // 6df: dup_x2
      // 6e0: pop
      // 6e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e4: bipush 0
      // 6e5: swap
      // 6e6: aastore
      // 6e7: ldc2_w 7844485645388814857
      // 6ea: lload 7
      // 6ec: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f1: return
   }

   String Z(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: lload 4
      // 020: dup2
      // 021: ldc2_w 122395436116587
      // 024: lxor
      // 025: lstore 6
      // 027: dup2
      // 028: ldc2_w 12322395081052
      // 02b: lxor
      // 02c: lstore 8
      // 02e: dup2
      // 02f: ldc2_w 53065318635412
      // 032: lxor
      // 033: dup2
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 10
      // 03a: dup2
      // 03b: bipush 16
      // 03d: lshl
      // 03e: bipush 32
      // 040: lushr
      // 041: l2i
      // 042: istore 11
      // 044: dup2
      // 045: bipush 48
      // 047: lshl
      // 048: bipush 48
      // 04a: lushr
      // 04b: l2i
      // 04c: istore 12
      // 04e: pop2
      // 04f: dup2
      // 050: ldc2_w 74227774945971
      // 053: lxor
      // 054: lstore 13
      // 056: dup2
      // 057: ldc2_w 70486047050384
      // 05a: lxor
      // 05b: lstore 15
      // 05d: dup2
      // 05e: ldc2_w 65308375800773
      // 061: lxor
      // 062: lstore 17
      // 064: pop2
      // 065: ldc2_w 8219361282038689289
      // 068: lload 4
      // 06a: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 2
      // 070: iload 10
      // 072: i2s
      // 073: iload 11
      // 075: iload 12
      // 077: i2s
      // 078: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 07b: astore 20
      // 07d: aload 0
      // 07e: ldc2_w 7869255279974282982
      // 081: lload 4
      // 083: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: lload 6
      // 08a: aload 20
      // 08c: bipush 2
      // 08d: anewarray 94
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
      // 09e: ldc2_w 8061728996433925455
      // 0a1: lload 4
      // 0a3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/e1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: astore 23
      // 0aa: astore 19
      // 0ac: aload 23
      // 0ae: aload 19
      // 0b0: ifnonnull 0ed
      // 0b3: ifnull 11e
      // 0b6: goto 0c4
      // 0b9: ldc2_w 8482011538574600570
      // 0bc: lload 4
      // 0be: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: aload 23
      // 0c6: lload 15
      // 0c8: bipush 1
      // 0c9: anewarray 94
      // 0cc: dup_x2
      // 0cd: dup_x2
      // 0ce: pop
      // 0cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w 7758509494071554174
      // 0d8: lload 4
      // 0da: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: goto 0ed
      // 0e2: ldc2_w 8482011538574600570
      // 0e5: lload 4
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: checkcast java/lang/String
      // 0f0: astore 21
      // 0f2: aload 23
      // 0f4: lload 8
      // 0f6: bipush 1
      // 0f7: anewarray 94
      // 0fa: dup_x2
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: ldc2_w 8448493116103041680
      // 106: lload 4
      // 108: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: checkcast java/lang/String
      // 110: astore 22
      // 112: lload 4
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 122
      // 119: aload 19
      // 11b: ifnull 126
      // 11e: ldc ""
      // 120: astore 21
      // 122: ldc ""
      // 124: astore 22
      // 126: aload 0
      // 127: ldc ""
      // 129: aload 2
      // 12a: ldc2_w 8000797862880893085
      // 12d: lload 4
      // 12f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: aload 21
      // 136: aload 22
      // 138: aconst_null
      // 139: lload 17
      // 13b: iload 3
      // 13c: aload 20
      // 13e: lload 13
      // 140: bipush 1
      // 141: anewarray 94
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w 8420257464482550183
      // 150: lload 4
      // 152: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: aload 0
      // 158: ldc2_w 7580676099892818643
      // 15b: lload 4
      // 15d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: bipush 9
      // 164: anewarray 94
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16c: bipush 8
      // 16e: swap
      // 16f: aastore
      // 170: dup_x1
      // 171: swap
      // 172: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 175: bipush 7
      // 177: swap
      // 178: aastore
      // 179: dup_x1
      // 17a: swap
      // 17b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 17e: bipush 6
      // 180: swap
      // 181: aastore
      // 182: dup_x2
      // 183: dup_x2
      // 184: pop
      // 185: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 188: bipush 5
      // 189: swap
      // 18a: aastore
      // 18b: dup_x1
      // 18c: swap
      // 18d: bipush 4
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 3
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: bipush 2
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 1
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 0
      // 1a2: swap
      // 1a3: aastore
      // 1a4: ldc2_w 8185763192691886202
      // 1a7: lload 4
      // 1a9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: areturn
   }

   eh K(Object[] var1) {
      char[] var2 = (char[])var1[0];
      char[] var8 = (char[])var1[1];
      char[] var5 = (char[])var1[2];
      char[] var7 = (char[])var1[3];
      List var6 = (List)var1[4];
      long var3 = (Long)var1[5];
      long var9 = var3 ^ 50618648372052L;
      return new eh(var2, var8, var5, var7, var6, var9, x44.a<"n">(this, -8391152236518813588L, var3));
   }

   String g(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 9
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 7
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/HashMap
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 4
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/e1
      // 030: astore 6
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 5
      // 03e: pop
      // 03f: lload 7
      // 041: dup2
      // 042: ldc2_w 28490717709756
      // 045: lxor
      // 046: lstore 10
      // 048: dup2
      // 049: ldc2_w 126960392487926
      // 04c: lxor
      // 04d: lstore 12
      // 04f: dup2
      // 050: ldc2_w 38069509495668
      // 053: lxor
      // 054: dup2
      // 055: bipush 48
      // 057: lushr
      // 058: l2i
      // 059: istore 14
      // 05b: dup2
      // 05c: bipush 16
      // 05e: lshl
      // 05f: bipush 32
      // 061: lushr
      // 062: l2i
      // 063: istore 15
      // 065: dup2
      // 066: bipush 48
      // 068: lshl
      // 069: bipush 48
      // 06b: lushr
      // 06c: l2i
      // 06d: istore 16
      // 06f: pop2
      // 070: dup2
      // 071: ldc2_w 89464249054803
      // 074: lxor
      // 075: lstore 17
      // 077: dup2
      // 078: ldc2_w 91018060580464
      // 07b: lxor
      // 07c: lstore 19
      // 07e: dup2
      // 07f: ldc2_w 45875861313317
      // 082: lxor
      // 083: lstore 21
      // 085: pop2
      // 086: ldc2_w -76249665789271319
      // 089: lload 7
      // 08b: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: astore 23
      // 092: aload 6
      // 094: aload 23
      // 096: ifnonnull 0d3
      // 099: ifnull 157
      // 09c: goto 0aa
      // 09f: ldc2_w -480132184168962662
      // 0a2: lload 7
      // 0a4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 6
      // 0ac: lload 19
      // 0ae: bipush 1
      // 0af: anewarray 94
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w -1780098760684995426
      // 0be: lload 7
      // 0c0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: goto 0d3
      // 0c8: ldc2_w -480132184168962662
      // 0cb: lload 7
      // 0cd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: checkcast java/lang/String
      // 0d6: astore 24
      // 0d8: aload 6
      // 0da: lload 10
      // 0dc: bipush 1
      // 0dd: anewarray 94
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: ldc2_w -441632698104598928
      // 0ec: lload 7
      // 0ee: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: checkcast java/lang/String
      // 0f6: astore 25
      // 0f8: aload 23
      // 0fa: lload 7
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 154
      // 101: ifnonnull 152
      // 104: aload 6
      // 106: lload 12
      // 108: bipush 1
      // 109: anewarray 94
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w -395285543069185056
      // 118: lload 7
      // 11a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: ifnonnull 15f
      // 122: goto 130
      // 125: ldc2_w -480132184168962662
      // 128: lload 7
      // 12a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: new java/lang/StringBuilder
      // 133: dup
      // 134: invokespecial java/lang/StringBuilder.<init> ()V
      // 137: aload 24
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: sipush 16742
      // 13f: ldc2_w 9098194612077019717
      // 142: lload 7
      // 144: lxor
      // 145: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/i.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: astore 24
      // 152: aload 23
      // 154: ifnull 15f
      // 157: ldc ""
      // 159: astore 24
      // 15b: ldc ""
      // 15d: astore 25
      // 15f: aload 0
      // 160: aload 9
      // 162: aload 4
      // 164: aload 24
      // 166: aload 25
      // 168: aload 2
      // 169: lload 21
      // 16b: iload 5
      // 16d: aload 3
      // 16e: iload 14
      // 170: i2s
      // 171: iload 15
      // 173: iload 16
      // 175: i2s
      // 176: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 179: lload 17
      // 17b: bipush 1
      // 17c: anewarray 94
      // 17f: dup_x2
      // 180: dup_x2
      // 181: pop
      // 182: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 185: bipush 0
      // 186: swap
      // 187: aastore
      // 188: ldc2_w -559905054959542969
      // 18b: lload 7
      // 18d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: aload 0
      // 193: ldc2_w -1885906107218051533
      // 196: lload 7
      // 198: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: bipush 9
      // 19f: anewarray 94
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a7: bipush 8
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x1
      // 1ac: swap
      // 1ad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b0: bipush 7
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x1
      // 1b5: swap
      // 1b6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b9: bipush 6
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x2
      // 1be: dup_x2
      // 1bf: pop
      // 1c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c3: bipush 5
      // 1c4: swap
      // 1c5: aastore
      // 1c6: dup_x1
      // 1c7: swap
      // 1c8: bipush 4
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 3
      // 1ce: swap
      // 1cf: aastore
      // 1d0: dup_x1
      // 1d1: swap
      // 1d2: bipush 2
      // 1d3: swap
      // 1d4: aastore
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -181904730707032934
      // 1e2: lload 7
      // 1e4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: astore 26
      // 1eb: aload 26
      // 1ed: areturn
   }

   static {
      long var0 = c ^ 34766740161958L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "x\u0083ÌÜ\u0011«Ûè+uµôý§\u0017w\u0010L\u0018x²Íù\"RÌ¸\u0019»±\u0014/S";
      int var8 = "x\u0083ÌÜ\u0011«Ûè+uµôý§\u0017w\u0010L\u0018x²Íù\"RÌ¸\u0019»±\u0014/S".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            l = var9;
            o = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29861;
      if (o[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])p.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/i", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = l[var5].getBytes("ISO-8859-1");
         o[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return o[var5];
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
         throw new RuntimeException("com/zelix/i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
