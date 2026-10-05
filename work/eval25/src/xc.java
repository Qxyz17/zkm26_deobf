package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xc extends x3 implements _8t {
   final int I;
   private static final long a = ess.a(4543863141617992180L, 8279530356441008180L, MethodHandles.lookup().lookupClass()).a(26031929928837L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xc(int var1, _xx var2, _83 var3) {
      super(var1, var3);
      this.I = var2.readUnsignedShort();
   }

   public xb F(Object[] param1) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_y4
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 7
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_y4
      // 021: astore 5
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_y4
      // 029: astore 2
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/io/PrintWriter
      // 030: astore 4
      // 032: pop
      // 033: getstatic com/zelix/xc.a J
      // 036: lload 7
      // 038: lxor
      // 039: lstore 7
      // 03b: lload 7
      // 03d: dup2
      // 03e: ldc2_w 37516454797920
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 128245104059470
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 97408346054396
      // 04f: lxor
      // 050: lstore 13
      // 052: dup2
      // 053: ldc2_w 39193049732042
      // 056: lxor
      // 057: lstore 15
      // 059: dup2
      // 05a: ldc2_w 69475693719289
      // 05d: lxor
      // 05e: lstore 17
      // 060: dup2
      // 061: ldc2_w 92977176511730
      // 064: lxor
      // 065: dup2
      // 066: bipush 8
      // 068: lushr
      // 069: lstore 19
      // 06b: dup2
      // 06c: bipush 56
      // 06e: lshl
      // 06f: bipush 56
      // 071: lushr
      // 072: l2i
      // 073: istore 21
      // 075: pop2
      // 076: dup2
      // 077: ldc2_w 84919448455139
      // 07a: lxor
      // 07b: lstore 22
      // 07d: pop2
      // 07e: ldc2_w -5605707368139401259
      // 081: lload 7
      // 083: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: astore 24
      // 08a: aload 0
      // 08b: getfield com/zelix/xc.j Lcom/zelix/_83;
      // 08e: aload 0
      // 08f: ldc2_w -6102948627314118762
      // 092: lload 7
      // 094: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: lload 19
      // 09b: dup2_x1
      // 09c: pop2
      // 09d: iload 21
      // 09f: i2b
      // 0a0: invokevirtual com/zelix/_83.N (JIB)Lcom/zelix/xl;
      // 0a3: astore 25
      // 0a5: aload 25
      // 0a7: instanceof com/zelix/mx
      // 0aa: ifeq 234
      // 0ad: new com/zelix/xb
      // 0b0: dup
      // 0b1: aload 0
      // 0b2: invokevirtual com/zelix/xc.B ()I
      // 0b5: aload 0
      // 0b6: getfield com/zelix/xc.j Lcom/zelix/_83;
      // 0b9: lload 17
      // 0bb: dup2_x1
      // 0bc: pop2
      // 0bd: aload 25
      // 0bf: checkcast com/zelix/mx
      // 0c2: invokespecial com/zelix/xb.<init> (IJLcom/zelix/_83;Lcom/zelix/mx;)V
      // 0c5: astore 26
      // 0c7: aload 3
      // 0c8: aload 24
      // 0ca: ifnonnull 0df
      // 0cd: ifnull 0eb
      // 0d0: goto 0de
      // 0d3: ldc2_w -5367239000039697898
      // 0d6: lload 7
      // 0d8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 3
      // 0df: aload 25
      // 0e1: checkcast com/zelix/mx
      // 0e4: aload 26
      // 0e6: lload 11
      // 0e8: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0eb: aload 26
      // 0ed: lload 9
      // 0ef: bipush 1
      // 0f0: anewarray 315
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: ldc2_w -5330161701082950358
      // 0ff: lload 7
      // 101: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: astore 27
      // 108: aload 27
      // 10a: ldc "("
      // 10c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 10f: lload 7
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 141
      // 116: aload 24
      // 118: ifnonnull 141
      // 11b: ifeq 17e
      // 11e: goto 12c
      // 121: ldc2_w -5367239000039697898
      // 124: lload 7
      // 126: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 27
      // 12e: ldc ")"
      // 130: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 133: goto 141
      // 136: ldc2_w -5367239000039697898
      // 139: lload 7
      // 13b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: bipush -1
      // 142: lload 7
      // 144: lconst_0
      // 145: lcmp
      // 146: iflt 17b
      // 149: aload 24
      // 14b: ifnonnull 17b
      // 14e: if_icmpeq 17e
      // 151: goto 15f
      // 154: ldc2_w -5367239000039697898
      // 157: lload 7
      // 159: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 27
      // 161: ldc ")"
      // 163: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 166: aload 27
      // 168: invokevirtual java/lang/String.length ()I
      // 16b: bipush 1
      // 16c: isub
      // 16d: goto 17b
      // 170: ldc2_w -5367239000039697898
      // 173: lload 7
      // 175: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: if_icmplt 231
      // 17e: new com/zelix/_sx
      // 181: dup
      // 182: new java/lang/StringBuilder
      // 185: dup
      // 186: invokespecial java/lang/StringBuilder.<init> ()V
      // 189: aload 0
      // 18a: getfield com/zelix/xc.j Lcom/zelix/_83;
      // 18d: lload 13
      // 18f: invokevirtual com/zelix/_83.M (J)Ljava/lang/String;
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: sipush 4355
      // 198: ldc2_w 6119479577377896670
      // 19b: lload 7
      // 19d: lxor
      // 19e: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: sipush 29710
      // 1a9: ldc2_w 2243917585702067664
      // 1ac: lload 7
      // 1ae: lxor
      // 1af: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: sipush 12477
      // 1ba: ldc2_w 1443038302728804708
      // 1bd: lload 7
      // 1bf: lxor
      // 1c0: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: aload 27
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: sipush 12477
      // 1d0: ldc2_w 1443038302728804708
      // 1d3: lload 7
      // 1d5: lxor
      // 1d6: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1de: aload 0
      // 1df: lload 22
      // 1e1: ldc2_w -5450872926944942248
      // 1e4: lload 7
      // 1e6: invokedynamic j (Ljava/lang/Object;JJJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: lload 15
      // 1ed: dup2_x1
      // 1ee: pop2
      // 1ef: bipush 2
      // 1f0: anewarray 315
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 1
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x2
      // 1f9: dup_x2
      // 1fa: pop
      // 1fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fe: bipush 0
      // 1ff: swap
      // 200: aastore
      // 201: ldc2_w -5811948674736154595
      // 204: lload 7
      // 206: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20e: sipush 20971
      // 211: ldc2_w 984903578004699187
      // 214: lload 7
      // 216: lxor
      // 217: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 222: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 225: athrow
      // 226: ldc2_w -5367239000039697898
      // 229: lload 7
      // 22b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/ArrayIndexOutOfBoundsException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 26
      // 233: areturn
      // 234: new com/zelix/_sx
      // 237: dup
      // 238: new java/lang/StringBuilder
      // 23b: dup
      // 23c: invokespecial java/lang/StringBuilder.<init> ()V
      // 23f: aload 0
      // 240: getfield com/zelix/xc.j Lcom/zelix/_83;
      // 243: lload 13
      // 245: invokevirtual com/zelix/_83.M (J)Ljava/lang/String;
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: sipush 12477
      // 24e: ldc2_w 1443038302728804708
      // 251: lload 7
      // 253: lxor
      // 254: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25c: sipush 5679
      // 25f: ldc2_w 2043833573062475760
      // 262: lload 7
      // 264: lxor
      // 265: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: sipush 12477
      // 270: ldc2_w 1443038302728804708
      // 273: lload 7
      // 275: lxor
      // 276: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27e: aload 0
      // 27f: ldc2_w -6102948627314118762
      // 282: lload 7
      // 284: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 28c: sipush 12477
      // 28f: ldc2_w 1443038302728804708
      // 292: lload 7
      // 294: lxor
      // 295: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29d: aload 0
      // 29e: lload 22
      // 2a0: ldc2_w -5450872926944942248
      // 2a3: lload 7
      // 2a5: invokedynamic j (Ljava/lang/Object;JJJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: lload 15
      // 2ac: dup2_x1
      // 2ad: pop2
      // 2ae: bipush 2
      // 2af: anewarray 315
      // 2b2: dup_x1
      // 2b3: swap
      // 2b4: bipush 1
      // 2b5: swap
      // 2b6: aastore
      // 2b7: dup_x2
      // 2b8: dup_x2
      // 2b9: pop
      // 2ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bd: bipush 0
      // 2be: swap
      // 2bf: aastore
      // 2c0: ldc2_w -5811948674736154595
      // 2c3: lload 7
      // 2c5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cd: sipush 10570
      // 2d0: ldc2_w 4900569188163698833
      // 2d3: lload 7
      // 2d5: lxor
      // 2d6: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e1: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 2e4: athrow
      // 2e5: astore 25
      // 2e7: new java/lang/StringBuilder
      // 2ea: dup
      // 2eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ee: aload 0
      // 2ef: getfield com/zelix/xc.j Lcom/zelix/_83;
      // 2f2: lload 13
      // 2f4: invokevirtual com/zelix/_83.M (J)Ljava/lang/String;
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: sipush 12477
      // 2fd: ldc2_w 1443038302728804708
      // 300: lload 7
      // 302: lxor
      // 303: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30b: sipush 16562
      // 30e: ldc2_w 3274725092504152424
      // 311: lload 7
      // 313: lxor
      // 314: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: sipush 12477
      // 31f: ldc2_w 1443038302728804708
      // 322: lload 7
      // 324: lxor
      // 325: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32d: aload 25
      // 32f: ldc2_w -5894859283946943600
      // 332: lload 7
      // 334: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33c: sipush 12477
      // 33f: ldc2_w 1443038302728804708
      // 342: lload 7
      // 344: lxor
      // 345: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34d: aload 0
      // 34e: lload 22
      // 350: ldc2_w -5450872926944942248
      // 353: lload 7
      // 355: invokedynamic j (Ljava/lang/Object;JJJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: lload 15
      // 35c: dup2_x1
      // 35d: pop2
      // 35e: bipush 2
      // 35f: anewarray 315
      // 362: dup_x1
      // 363: swap
      // 364: bipush 1
      // 365: swap
      // 366: aastore
      // 367: dup_x2
      // 368: dup_x2
      // 369: pop
      // 36a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36d: bipush 0
      // 36e: swap
      // 36f: aastore
      // 370: ldc2_w -5811948674736154595
      // 373: lload 7
      // 375: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37d: sipush 10570
      // 380: ldc2_w 4900569188163698833
      // 383: lload 7
      // 385: lxor
      // 386: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/xc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 391: astore 26
      // 393: new com/zelix/_sx
      // 396: dup
      // 397: aload 26
      // 399: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 39c: athrow
   }

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 55767014122368L;
      return x44.a<"n">(this, new Object[]{var1, var4, var8, var5, var6, var7}, -1794495267040210509L, var2);
   }

   public boolean s() {
      return true;
   }

   void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2880155614980295748L, var1).l());
      var3.writeShort(x44.a<"k">(this, -4354739441607604405L, var1));
   }

   static {
      long var0 = a ^ 30162480878541L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "£~£\u0003ö0V\u0005Ó5Ç®éìG´@'\u0003Zd)¾GÎ½T9\u009bt©nGs´rµU\u0085KÊZ\u008a|æ\u008a¢\u0015°\u0004E\u000b\u001e\u0014_Õ[\u0018\u008dh*d\u0004\u009fºÆ\u008eòCÈxÈ«ªcD\u009aÎü[\u009e\u0010OU\u0093\u009aä?ã».wØ¶À×À\n\u0010H\u009cLb2zvGu»§(\u0087Ò\u0080È@_F¸ÂÃ`Çmû*D¯B9ó\u0013sLýl\u009f;L\u0085âðñúMø\u0085\u0081ºonú\u008aåæzXå/ÓP.\u009e'\u001c\u001efB\bu\u0084ºÄ >Þq\u0007Ëº";
      int var8 = "£~£\u0003ö0V\u0005Ó5Ç®éìG´@'\u0003Zd)¾GÎ½T9\u009bt©nGs´rµU\u0085KÊZ\u008a|æ\u008a¢\u0015°\u0004E\u000b\u001e\u0014_Õ[\u0018\u008dh*d\u0004\u009fºÆ\u008eòCÈxÈ«ªcD\u009aÎü[\u009e\u0010OU\u0093\u009aä?ã».wØ¶À×À\n\u0010H\u009cLb2zvGu»§(\u0087Ò\u0080È@_F¸ÂÃ`Çmû*D¯B9ó\u0013sLýl\u009f;L\u0085âðñúMø\u0085\u0081ºonú\u008aåæzXå/ÓP.\u009e'\u001c\u001efB\bu\u0084ºÄ >Þq\u0007Ëº"
         .length();
      char var5 = 16;
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
                     b = var9;
                     c = new String[7];
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

                  var6 = "´I#Ñk\u0096*\u0099\u008dó\u008c^\u0090\u001fzÔ\u009eò~DÝ33\u0010Ãmú&s/vªÉ\u0095cúf*KÑçê\u008d©=\u0000Ì\u001fÒvîÌÃ4.N\u0010\u0098ÐÛvHÀ\u0094a\u0087KÎ£Ó¹\u0088\u0001";
                  var8 = "´I#Ñk\u0096*\u0099\u008dó\u008c^\u0090\u001fzÔ\u009eò~DÝ33\u0010Ãmú&s/vªÉ\u0095cúf*KÑçê\u008d©=\u0000Ì\u001fÒvîÌÃ4.N\u0010\u0098ÐÛvHÀ\u0094a\u0087KÎ£Ó¹\u0088\u0001"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22186;
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
            throw new RuntimeException("com/zelix/xc", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/xc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
