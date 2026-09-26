package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class k4 extends ki {
   s8[][] k;
   s8[][] O;
   private static final long c = prr.a(5205248799690140182L, 6435689506755319739L, MethodHandles.lookup().lookupClass()).a(38206175655419L);
   private static final String[] g;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   k4(_4 param1, int param2, char param3, int param4, String param5, h1 param6, l6q param7, PrintWriter param8, String param9, int param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 10
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/k4.c J
      // 01c: lxor
      // 01d: lstore 11
      // 01f: lload 11
      // 021: dup2
      // 022: ldc2_w 74816232080823
      // 025: lxor
      // 026: lstore 13
      // 028: dup2
      // 029: ldc2_w 116291259179108
      // 02c: lxor
      // 02d: lstore 15
      // 02f: dup2
      // 030: ldc2_w 134158090196497
      // 033: lxor
      // 034: lstore 17
      // 036: dup2
      // 037: ldc2_w 41069263469849
      // 03a: lxor
      // 03b: lstore 19
      // 03d: dup2
      // 03e: ldc2_w 97495802665973
      // 041: lxor
      // 042: lstore 21
      // 044: dup2
      // 045: ldc2_w 102348358179090
      // 048: lxor
      // 049: lstore 23
      // 04b: pop2
      // 04c: aload 0
      // 04d: aload 1
      // 04e: iload 2
      // 04f: aload 5
      // 051: aload 6
      // 053: lload 23
      // 055: aload 7
      // 057: invokespecial com/zelix/ki.<init> (Lcom/zelix/_4;ILjava/lang/String;Lcom/zelix/h1;JLcom/zelix/l6q;)V
      // 05a: aload 0
      // 05b: getfield com/zelix/k4.W I
      // 05e: newarray 8
      // 060: astore 26
      // 062: ldc2_w 4534427854203146149
      // 065: lload 11
      // 067: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 6
      // 06e: aload 26
      // 070: invokevirtual com/zelix/h1.read ([B)I
      // 073: pop
      // 074: aload 26
      // 076: bipush 0
      // 077: lload 17
      // 079: bipush 3
      // 07a: anewarray 450
      // 07d: dup_x2
      // 07e: dup_x2
      // 07f: pop
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: bipush 2
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 2625179808419862694
      // 096: lload 11
      // 098: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/h1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: astore 27
      // 09f: istore 25
      // 0a1: aload 0
      // 0a2: iload 25
      // 0a4: ifeq 2ec
      // 0a7: getfield com/zelix/k4.W I
      // 0aa: bipush 1
      // 0ab: if_icmplt 27a
      // 0ae: goto 0bc
      // 0b1: ldc2_w 4583006977453836653
      // 0b4: lload 11
      // 0b6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 27
      // 0be: invokevirtual com/zelix/h1.readUnsignedByte ()I
      // 0c1: istore 28
      // 0c3: aload 0
      // 0c4: iload 28
      // 0c6: anewarray 36
      // 0c9: ldc2_w 4341904020267514790
      // 0cc: lload 11
      // 0ce: invokedynamic p (Ljava/lang/Object;[[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: bipush 0
      // 0d4: istore 29
      // 0d6: iload 29
      // 0d8: iload 28
      // 0da: if_icmpge 26b
      // 0dd: aload 27
      // 0df: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0e2: istore 30
      // 0e4: aload 0
      // 0e5: ldc2_w 4341904020267514790
      // 0e8: lload 11
      // 0ea: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: iload 29
      // 0f1: iload 30
      // 0f3: anewarray 430
      // 0f6: aastore
      // 0f7: iload 25
      // 0f9: iload 3
      // 0fa: iflt 101
      // 0fd: ifeq 304
      // 100: bipush 0
      // 101: istore 31
      // 103: iload 31
      // 105: iload 30
      // 107: if_icmpge 25f
      // 10a: aload 0
      // 10b: ldc2_w 4341904020267514790
      // 10e: lload 11
      // 110: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 29
      // 117: aaload
      // 118: iload 31
      // 11a: aload 0
      // 11b: aload 27
      // 11d: aload 7
      // 11f: lload 19
      // 121: bipush 4
      // 122: anewarray 450
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 3
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 2
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 1
      // 136: swap
      // 137: aastore
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w 4580217736711524942
      // 140: lload 11
      // 142: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aastore
      // 148: iload 25
      // 14a: iload 4
      // 14c: iflt 25c
      // 14f: ifeq 25a
      // 152: aload 0
      // 153: ldc2_w 4341904020267514790
      // 156: lload 11
      // 158: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: iload 29
      // 15f: aaload
      // 160: iload 31
      // 162: aaload
      // 163: lload 13
      // 165: bipush 1
      // 166: anewarray 450
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 0
      // 170: swap
      // 171: aastore
      // 172: ldc2_w 4075671721998404744
      // 175: lload 11
      // 177: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: iload 25
      // 17e: ifeq 0d8
      // 181: iload 3
      // 182: iflt 0f9
      // 185: goto 193
      // 188: ldc2_w 4583006977453836653
      // 18b: lload 11
      // 18d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: iload 4
      // 195: ifle 233
      // 198: ifne 249
      // 19b: aload 0
      // 19c: bipush 0
      // 19d: ldc2_w 2863342538057903466
      // 1a0: lload 11
      // 1a2: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: aload 8
      // 1a9: new java/lang/StringBuilder
      // 1ac: dup
      // 1ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b0: sipush 27204
      // 1b3: ldc2_w 9211521921953308886
      // 1b6: lload 11
      // 1b8: lxor
      // 1b9: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: aload 0
      // 1c2: lload 21
      // 1c4: invokevirtual com/zelix/k4.f (J)Ljava/lang/String;
      // 1c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ca: sipush 27965
      // 1cd: ldc2_w 615261682061551525
      // 1d0: lload 11
      // 1d2: lxor
      // 1d3: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: aload 9
      // 1dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e0: sipush 16486
      // 1e3: ldc2_w 8429619931788184314
      // 1e6: lload 11
      // 1e8: lxor
      // 1e9: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 0
      // 1f2: ldc2_w 4341904020267514790
      // 1f5: lload 11
      // 1f7: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: iload 29
      // 1fe: aaload
      // 1ff: iload 31
      // 201: aaload
      // 202: lload 15
      // 204: bipush 1
      // 205: anewarray 450
      // 208: dup_x2
      // 209: dup_x2
      // 20a: pop
      // 20b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20e: bipush 0
      // 20f: swap
      // 210: aastore
      // 211: ldc2_w 4558376913679290083
      // 214: lload 11
      // 216: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 221: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 224: aload 0
      // 225: aload 26
      // 227: ldc2_w 2596315680668258328
      // 22a: lload 11
      // 22c: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: iload 25
      // 233: iload 10
      // 235: ifle 277
      // 238: ifne 26b
      // 23b: goto 249
      // 23e: ldc2_w 4583006977453836653
      // 241: lload 11
      // 243: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: iinc 31 1
      // 24c: goto 25a
      // 24f: ldc2_w 4583006977453836653
      // 252: lload 11
      // 254: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: iload 25
      // 25c: ifne 103
      // 25f: iinc 29 1
      // 262: iload 25
      // 264: iload 3
      // 265: iflt 14a
      // 268: ifne 0d6
      // 26b: iload 10
      // 26d: ifle 304
      // 270: iload 25
      // 272: iload 10
      // 274: iflt 0e2
      // 277: ifne 2f8
      // 27a: aload 0
      // 27b: bipush 0
      // 27c: ldc2_w 2863342538057903466
      // 27f: lload 11
      // 281: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: aload 8
      // 288: new java/lang/StringBuilder
      // 28b: dup
      // 28c: invokespecial java/lang/StringBuilder.<init> ()V
      // 28f: sipush 26996
      // 292: ldc2_w 2726424659138847722
      // 295: lload 11
      // 297: lxor
      // 298: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: aload 0
      // 2a1: lload 21
      // 2a3: invokevirtual com/zelix/k4.f (J)Ljava/lang/String;
      // 2a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a9: sipush 1390
      // 2ac: ldc2_w 4102167451280199674
      // 2af: lload 11
      // 2b1: lxor
      // 2b2: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ba: aload 9
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: sipush 22155
      // 2c2: ldc2_w 6338455851660745750
      // 2c5: lload 11
      // 2c7: lxor
      // 2c8: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d0: aload 0
      // 2d1: getfield com/zelix/k4.W I
      // 2d4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2da: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2dd: aload 0
      // 2de: goto 2ec
      // 2e1: ldc2_w 4583006977453836653
      // 2e4: lload 11
      // 2e6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: aload 26
      // 2ee: ldc2_w 2596315680668258328
      // 2f1: lload 11
      // 2f3: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: aload 27
      // 2fa: ldc2_w 4057015442476381542
      // 2fd: lload 11
      // 2ff: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: goto 397
      // 307: astore 28
      // 309: aload 0
      // 30a: bipush 0
      // 30b: ldc2_w 2863342538057903466
      // 30e: lload 11
      // 310: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: aload 8
      // 317: new java/lang/StringBuilder
      // 31a: dup
      // 31b: invokespecial java/lang/StringBuilder.<init> ()V
      // 31e: sipush 26996
      // 321: ldc2_w 2726424659138847722
      // 324: lload 11
      // 326: lxor
      // 327: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32f: aload 0
      // 330: lload 21
      // 332: invokevirtual com/zelix/k4.f (J)Ljava/lang/String;
      // 335: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 338: sipush 1390
      // 33b: ldc2_w 4102167451280199674
      // 33e: lload 11
      // 340: lxor
      // 341: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 349: aload 9
      // 34b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34e: sipush 1988
      // 351: ldc2_w 875402723966045525
      // 354: lload 11
      // 356: lxor
      // 357: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35f: aload 28
      // 361: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 364: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 367: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 36a: aload 0
      // 36b: aload 26
      // 36d: ldc2_w 2596315680668258328
      // 370: lload 11
      // 372: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: aload 27
      // 379: ldc2_w 4057015442476381542
      // 37c: lload 11
      // 37e: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: goto 397
      // 386: astore 32
      // 388: aload 27
      // 38a: ldc2_w 4057015442476381542
      // 38d: lload 11
      // 38f: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: aload 32
      // 396: athrow
      // 397: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void z(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 33028709459524L;
      boolean var7 = m44.a<"n">(-7259939807516176424L, var3);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"p">(this, -7334437805944123168L, var3);
            if (var7) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"n">(var12, -9074636827604781849L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < m44.a<"p">(this, -9093893816702269908L, var3).length) {
         int var9 = 0;

         label57: {
            label56: {
               label55:
               while (var9 < m44.a<"p">(this, -9093893816702269908L, var3)[var8].length) {
                  try {
                     m44.a<"q">(m44.a<"p">(this, -9093893816702269908L, var3)[var8][var9], new Object[]{var2, var5}, -7009903130217171486L, var3);
                     var9++;
                  } catch (n9 var11) {
                     boolean var10001 = false;
                     throw m44.a<"n">(var11, -9074636827604781849L, var3);
                  }

                  while (true) {
                     try {
                        var14 = var7;
                        if (var3 < 0L) {
                           break label57;
                        }

                        if (var7) {
                           break label56;
                        }

                        if (!var7) {
                           break;
                        }
                     } catch (n9 var10) {
                        boolean var15 = false;
                        throw m44.a<"n">(var10, -9074636827604781849L, var3);
                     }

                     if (var3 > 0L) {
                        break label55;
                     }
                  }
               }

               var8++;
            }

            var14 = var7;
         }

         if (var14) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void z(gu var1, long var2) {
      long var4 = var2 ^ 113240848016893L;
      long var6 = var2 ^ 0L;
      byte var10000 = m44.a<"h">(6170399952317654249L, var2);
      var1.K(this.b, this, var4, this.H());
      boolean var8 = (boolean)var10000;

      label66: {
         try {
            var10000 = m44.a<"v">(this, 5544088189886891558L, var2);
            if (!var8) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var13) {
            throw m44.a<"h">(var13, 6113126990587666977L, var2);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < m44.a<"v">(this, 6272853165779177706L, var2).length) {
         int var10 = 0;

         label57: {
            label56: {
               label55:
               while (var10 < m44.a<"v">(this, 6272853165779177706L, var2)[var9].length) {
                  try {
                     m44.a<"w">(m44.a<"v">(this, 6272853165779177706L, var2)[var9][var10], var1, var6, 5759007463919830180L, var2);
                     var10++;
                  } catch (n9 var12) {
                     boolean var10001 = false;
                     throw m44.a<"h">(var12, 6113126990587666977L, var2);
                  }

                  while (true) {
                     try {
                        var16 = var8;
                        if (var2 < 0L) {
                           break label57;
                        }

                        if (!var8) {
                           break label56;
                        }

                        if (var8) {
                           break;
                        }
                     } catch (n9 var11) {
                        boolean var17 = false;
                        throw m44.a<"h">(var11, 6113126990587666977L, var2);
                     }

                     if (var2 >= 0L) {
                        break label55;
                     }
                  }
               }

               var9++;
            }

            var16 = var8;
         }

         if (!var16) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void K(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 7722732479311L;
      boolean var6 = m44.a<"i">(3880088275935781183L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"w">(this, 3805967349933800967L, var2);
            if (var6) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var11) {
            throw m44.a<"i">(var11, 3240125997474437632L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < m44.a<"w">(this, 3399280171669235915L, var2).length) {
         int var8 = 0;

         label57: {
            label56: {
               label55:
               while (var8 < m44.a<"w">(this, 3399280171669235915L, var2)[var7].length) {
                  try {
                     m44.a<"v">(m44.a<"w">(this, 3399280171669235915L, var2)[var7][var8], new Object[]{var4}, 3671261988123011746L, var2);
                     var8++;
                  } catch (n9 var10) {
                     boolean var10001 = false;
                     throw m44.a<"i">(var10, 3240125997474437632L, var2);
                  }

                  while (true) {
                     try {
                        var13 = var6;
                        if (var2 < 0L) {
                           break label57;
                        }

                        if (var6) {
                           break label56;
                        }

                        if (!var6) {
                           break;
                        }
                     } catch (n9 var9) {
                        boolean var14 = false;
                        throw m44.a<"i">(var9, 3240125997474437632L, var2);
                     }

                     if (var2 > 0L) {
                        break label55;
                     }
                  }
               }

               var7++;
            }

            var13 = var6;
         }

         if (var13) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void W(Object[] var1) {
      long var5 = (Long)var1[0];
      int var7 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      HashMap var2 = (HashMap)var1[3];
      HashMap var4 = (HashMap)var1[4];
      long var8 = var5 ^ 30282754797937L;
      boolean var10 = m44.a<"n">(8223466915102598904L, var5);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"p">(this, 8293039031803492800L, var5);
            if (var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var15) {
            throw m44.a<"n">(var15, 7723802286503861703L, var5);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"p">(this, 7560386409598480140L, var5).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < m44.a<"p">(this, 7560386409598480140L, var5)[var11].length) {
                  try {
                     m44.a<"q">(m44.a<"p">(this, 7560386409598480140L, var5)[var11][var12], new Object[]{var2, var8, var4}, 7642945798677133226L, var5);
                     var12++;
                  } catch (n9 var14) {
                     boolean var10001 = false;
                     throw m44.a<"n">(var14, 7723802286503861703L, var5);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var5 < 0L) {
                           break label57;
                        }

                        if (var10) {
                           break label56;
                        }

                        if (!var10) {
                           break;
                        }
                     } catch (n9 var13) {
                        boolean var18 = false;
                        throw m44.a<"n">(var13, 7723802286503861703L, var5);
                     }

                     if (var5 >= 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (var17) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void J(Object[] var1) {
      long var2 = (Long)var1[0];
      _u var5 = (_u)var1[1];
      _6 var6 = (_6)var1[2];
      l6z var4 = (l6z)var1[3];
      lqu var7 = (lqu)var1[4];
      long var8 = var2 ^ 52524380427751L;
      boolean var10 = m44.a<"o">(6212413212200665809L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"q">(this, 6286946463132720617L, var2);
            if (var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var15) {
            throw m44.a<"o">(var15, 5699593614923774446L, var2);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"q">(this, 5531141700341910309L, var2).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < m44.a<"q">(this, 5531141700341910309L, var2)[var11].length) {
                  try {
                     m44.a<"p">(m44.a<"q">(this, 5531141700341910309L, var2)[var11][var12], new Object[]{var6, var4, var7, var8}, 6112248090225406784L, var2);
                     var12++;
                  } catch (n9 var14) {
                     boolean var10001 = false;
                     throw m44.a<"o">(var14, 5699593614923774446L, var2);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var2 < 0L) {
                           break label57;
                        }

                        if (var10) {
                           break label56;
                        }

                        if (!var10) {
                           break;
                        }
                     } catch (n9 var13) {
                        boolean var18 = false;
                        throw m44.a<"o">(var13, 5699593614923774446L, var2);
                     }

                     if (var2 > 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (var17) {
            break;
         }
      }
   }

   protected void N(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 93420344099345
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 0
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: ldc2_w 1680553024964027930
      // 036: lload 3
      // 037: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 5
      // 03f: aload 6
      // 041: lload 9
      // 043: aload 2
      // 044: bipush 4
      // 045: anewarray 450
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 3
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x2
      // 04e: dup_x2
      // 04f: pop
      // 050: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 053: bipush 2
      // 054: swap
      // 055: aastore
      // 056: dup_x1
      // 057: swap
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokespecial com/zelix/ki.N ([Ljava/lang/Object;)V
      // 063: istore 11
      // 065: aload 0
      // 066: ldc2_w 1009829788873835733
      // 069: lload 3
      // 06a: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 11
      // 071: ifeq 0a2
      // 074: ifeq 163
      // 077: goto 084
      // 07a: ldc2_w 1595713090524012754
      // 07d: lload 3
      // 07e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 5
      // 086: aload 0
      // 087: ldc2_w 1584856650932064793
      // 08a: lload 3
      // 08b: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: arraylength
      // 091: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 094: bipush 0
      // 095: goto 0a2
      // 098: ldc2_w 1595713090524012754
      // 09b: lload 3
      // 09c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: istore 12
      // 0a4: iload 12
      // 0a6: aload 0
      // 0a7: ldc2_w 1584856650932064793
      // 0aa: lload 3
      // 0ab: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: arraylength
      // 0b1: if_icmpge 152
      // 0b4: aload 5
      // 0b6: aload 0
      // 0b7: ldc2_w 1584856650932064793
      // 0ba: lload 3
      // 0bb: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: iload 12
      // 0c2: aaload
      // 0c3: arraylength
      // 0c4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0c7: iload 11
      // 0c9: lload 3
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: ifle 0d3
      // 0cf: ifeq 17f
      // 0d2: bipush 0
      // 0d3: istore 13
      // 0d5: iload 13
      // 0d7: aload 0
      // 0d8: ldc2_w 1584856650932064793
      // 0db: lload 3
      // 0dc: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: iload 12
      // 0e3: aaload
      // 0e4: arraylength
      // 0e5: if_icmpge 14a
      // 0e8: aload 0
      // 0e9: ldc2_w 1584856650932064793
      // 0ec: lload 3
      // 0ed: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: iload 12
      // 0f4: aaload
      // 0f5: iload 13
      // 0f7: aaload
      // 0f8: aload 5
      // 0fa: aload 6
      // 0fc: lload 7
      // 0fe: aload 2
      // 0ff: bipush 4
      // 100: anewarray 450
      // 103: dup_x1
      // 104: swap
      // 105: bipush 3
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 11b: ldc2_w 1581219630668972309
      // 11e: lload 3
      // 11f: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: iinc 13 1
      // 127: iload 11
      // 129: lload 3
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 14f
      // 12f: ifeq 14d
      // 132: iload 11
      // 134: ifne 0d5
      // 137: lload 3
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 127
      // 13d: goto 14a
      // 140: ldc2_w 1595713090524012754
      // 143: lload 3
      // 144: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: iinc 12 1
      // 14d: iload 11
      // 14f: ifne 0a4
      // 152: lload 3
      // 153: lconst_0
      // 154: lcmp
      // 155: iflt 172
      // 158: iload 11
      // 15a: lload 3
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: iflt 0c9
      // 160: ifne 17f
      // 163: aload 5
      // 165: aload 0
      // 166: ldc2_w 988812052272789927
      // 169: lload 3
      // 16a: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: invokevirtual java/io/DataOutputStream.write ([B)V
      // 172: goto 17f
      // 175: ldc2_w 1595713090524012754
      // 178: lload 3
      // 179: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: return
   }

   public String[] m(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/k4.c J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 29451498981353
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 2579012352722
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: ldc2_w 2650525316727068032
      // 030: lload 2
      // 031: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: istore 9
      // 038: aload 0
      // 039: ldc2_w 4438766367066093391
      // 03c: lload 2
      // 03d: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: iload 9
      // 044: ifeq 161
      // 047: ifeq 160
      // 04a: goto 057
      // 04d: ldc2_w 2719914896490615624
      // 050: lload 2
      // 051: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: aload 0
      // 058: iload 9
      // 05a: lload 2
      // 05b: lconst_0
      // 05c: lcmp
      // 05d: ifle 13f
      // 060: ifeq 13d
      // 063: goto 070
      // 066: ldc2_w 2719914896490615624
      // 069: lload 2
      // 06a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: ldc2_w 4112224273827213834
      // 073: lload 2
      // 074: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: ifnull 13c
      // 07c: goto 089
      // 07f: ldc2_w 2719914896490615624
      // 082: lload 2
      // 083: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: ldc2_w 4112224273827213834
      // 08d: lload 2
      // 08e: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: arraylength
      // 094: iload 9
      // 096: ifeq 138
      // 099: goto 0a6
      // 09c: ldc2_w 2719914896490615624
      // 09f: lload 2
      // 0a0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: iload 4
      // 0a8: if_icmple 137
      // 0ab: goto 0b8
      // 0ae: ldc2_w 2719914896490615624
      // 0b1: lload 2
      // 0b2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: ldc2_w 4112224273827213834
      // 0bc: lload 2
      // 0bd: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: iload 4
      // 0c4: aaload
      // 0c5: arraylength
      // 0c6: anewarray 3
      // 0c9: astore 10
      // 0cb: bipush 0
      // 0cc: istore 11
      // 0ce: iload 11
      // 0d0: aload 0
      // 0d1: ldc2_w 4112224273827213834
      // 0d4: lload 2
      // 0d5: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: iload 4
      // 0dc: aaload
      // 0dd: arraylength
      // 0de: if_icmpge 134
      // 0e1: aload 10
      // 0e3: iload 9
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: ifle 0f0
      // 0eb: ifeq 136
      // 0ee: iload 11
      // 0f0: aload 0
      // 0f1: ldc2_w 4112224273827213834
      // 0f4: lload 2
      // 0f5: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: iload 4
      // 0fc: aaload
      // 0fd: iload 11
      // 0ff: aaload
      // 100: lload 7
      // 102: bipush 1
      // 103: anewarray 450
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w 2414356721793522141
      // 112: lload 2
      // 113: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: aastore
      // 119: iinc 11 1
      // 11c: iload 9
      // 11e: ifne 0ce
      // 121: lload 2
      // 122: lconst_0
      // 123: lcmp
      // 124: iflt 0e1
      // 127: goto 134
      // 12a: ldc2_w 2719914896490615624
      // 12d: lload 2
      // 12e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 10
      // 136: areturn
      // 137: bipush 0
      // 138: anewarray 3
      // 13b: areturn
      // 13c: aload 0
      // 13d: iload 4
      // 13f: lload 5
      // 141: bipush 2
      // 142: anewarray 450
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 1
      // 14c: swap
      // 14d: aastore
      // 14e: dup_x1
      // 14f: swap
      // 150: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w 2629700804409430789
      // 159: lload 2
      // 15a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: areturn
      // 160: bipush 0
      // 161: anewarray 3
      // 164: areturn
   }

   public String[] S(Object[] param1) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: getstatic com/zelix/k4.c J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 80885265071831
      // 022: lxor
      // 023: lstore 5
      // 025: pop2
      // 026: ldc2_w -6859609557894508155
      // 029: lload 2
      // 02a: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: istore 7
      // 031: aload 0
      // 032: ldc2_w -5071930905614060726
      // 035: lload 2
      // 036: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: iload 7
      // 03d: ifeq 0ff
      // 040: ifeq 0fe
      // 043: goto 050
      // 046: ldc2_w -6793011565403744435
      // 049: lload 2
      // 04a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: aload 0
      // 051: ldc2_w -6745888823477394042
      // 054: lload 2
      // 055: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: arraylength
      // 05b: iload 7
      // 05d: ifeq 0ff
      // 060: goto 06d
      // 063: ldc2_w -6793011565403744435
      // 066: lload 2
      // 067: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: iload 4
      // 06f: if_icmple 0fe
      // 072: goto 07f
      // 075: ldc2_w -6793011565403744435
      // 078: lload 2
      // 079: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: ldc2_w -6745888823477394042
      // 083: lload 2
      // 084: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 4
      // 08b: aaload
      // 08c: arraylength
      // 08d: anewarray 3
      // 090: astore 8
      // 092: bipush 0
      // 093: istore 9
      // 095: iload 9
      // 097: aload 0
      // 098: ldc2_w -6745888823477394042
      // 09b: lload 2
      // 09c: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: iload 4
      // 0a3: aaload
      // 0a4: arraylength
      // 0a5: if_icmpge 0fb
      // 0a8: aload 8
      // 0aa: iload 7
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: ifle 0b7
      // 0b2: ifeq 0fd
      // 0b5: iload 9
      // 0b7: aload 0
      // 0b8: ldc2_w -6745888823477394042
      // 0bb: lload 2
      // 0bc: invokedynamic r (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 4
      // 0c3: aaload
      // 0c4: iload 9
      // 0c6: aaload
      // 0c7: lload 5
      // 0c9: bipush 1
      // 0ca: anewarray 450
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -6519858291790258728
      // 0d9: lload 2
      // 0da: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: aastore
      // 0e0: iinc 9 1
      // 0e3: iload 7
      // 0e5: ifne 095
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 0a8
      // 0ee: goto 0fb
      // 0f1: ldc2_w -6793011565403744435
      // 0f4: lload 2
      // 0f5: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 8
      // 0fd: areturn
      // 0fe: bipush 0
      // 0ff: anewarray 3
      // 102: areturn
   }

   public boolean l(Object[] param1) {
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
      // 004: checkcast com/zelix/hf
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/lqu
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 6
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 138721227050887
      // 029: lxor
      // 02a: dup2
      // 02b: bipush 32
      // 02d: lushr
      // 02e: lstore 7
      // 030: dup2
      // 031: bipush 32
      // 033: lshl
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 9
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 131438816045646
      // 03f: lxor
      // 040: lstore 10
      // 042: dup2
      // 043: ldc2_w 30774151829103
      // 046: lxor
      // 047: lstore 12
      // 049: dup2
      // 04a: ldc2_w 41473284262212
      // 04d: lxor
      // 04e: lstore 14
      // 050: dup2
      // 051: ldc2_w 99147324161282
      // 054: lxor
      // 055: lstore 16
      // 057: dup2
      // 058: ldc2_w 98160926896858
      // 05b: lxor
      // 05c: lstore 18
      // 05e: pop2
      // 05f: ldc2_w 3105723213626104401
      // 062: lload 2
      // 063: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: istore 20
      // 06a: aload 0
      // 06b: ldc2_w 3623315272531769502
      // 06e: lload 2
      // 06f: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: iload 20
      // 076: ifeq 38e
      // 079: ifeq 38d
      // 07c: goto 089
      // 07f: ldc2_w 3057421077378620569
      // 082: lload 2
      // 083: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 5
      // 08b: lload 14
      // 08d: bipush 1
      // 08e: anewarray 450
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w 3096412178331694126
      // 09d: lload 2
      // 09e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: astore 21
      // 0a5: bipush 0
      // 0a6: istore 22
      // 0a8: bipush 1
      // 0a9: istore 23
      // 0ab: new java/util/ArrayList
      // 0ae: dup
      // 0af: invokespecial java/util/ArrayList.<init> ()V
      // 0b2: astore 24
      // 0b4: bipush 0
      // 0b5: istore 25
      // 0b7: iload 25
      // 0b9: aload 0
      // 0ba: ldc2_w 3005504479833796178
      // 0bd: lload 2
      // 0be: invokedynamic v (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: arraylength
      // 0c4: if_icmpge 2f6
      // 0c7: new java/util/ArrayList
      // 0ca: dup
      // 0cb: invokespecial java/util/ArrayList.<init> ()V
      // 0ce: astore 26
      // 0d0: aload 24
      // 0d2: aload 26
      // 0d4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0d9: pop
      // 0da: bipush 0
      // 0db: iload 20
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: iflt 300
      // 0e3: ifeq 2fe
      // 0e6: istore 27
      // 0e8: iload 27
      // 0ea: aload 0
      // 0eb: ldc2_w 3005504479833796178
      // 0ee: lload 2
      // 0ef: invokedynamic v (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: iload 25
      // 0f6: aaload
      // 0f7: arraylength
      // 0f8: if_icmpge 2e8
      // 0fb: aload 0
      // 0fc: ldc2_w 3005504479833796178
      // 0ff: lload 2
      // 100: invokedynamic v (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: iload 25
      // 107: aaload
      // 108: iload 27
      // 10a: aaload
      // 10b: astore 28
      // 10d: aload 28
      // 10f: lload 18
      // 111: bipush 1
      // 112: anewarray 450
      // 115: dup_x2
      // 116: dup_x2
      // 117: pop
      // 118: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: ldc2_w 3876096921676360311
      // 121: lload 2
      // 122: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: astore 29
      // 129: aload 4
      // 12b: lload 12
      // 12d: aload 29
      // 12f: bipush 2
      // 130: anewarray 450
      // 133: dup_x1
      // 134: swap
      // 135: bipush 1
      // 136: swap
      // 137: aastore
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: ldc2_w 3276387524263984760
      // 144: lload 2
      // 145: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: iload 20
      // 14c: ifeq 0b9
      // 14f: iload 20
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 0dd
      // 157: ifeq 2de
      // 15a: ifeq 2d0
      // 15d: goto 16a
      // 160: ldc2_w 3057421077378620569
      // 163: lload 2
      // 164: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: bipush 0
      // 16b: istore 23
      // 16d: aload 26
      // 16f: aload 28
      // 171: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 176: pop
      // 177: new java/lang/StringBuilder
      // 17a: dup
      // 17b: invokespecial java/lang/StringBuilder.<init> ()V
      // 17e: sipush 6114
      // 181: ldc2_w 4692269968880945285
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18e: aload 0
      // 18f: bipush 0
      // 190: anewarray 450
      // 193: ldc2_w 3989937957937176752
      // 196: lload 2
      // 197: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: sipush 26608
      // 1a2: lload 2
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: ifle 1c8
      // 1a8: ldc2_w 2225135840876574868
      // 1ab: lload 2
      // 1ac: lxor
      // 1ad: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 20
      // 1b4: ifeq 1e7
      // 1b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ba: aload 0
      // 1bb: bipush 0
      // 1bc: anewarray 450
      // 1bf: ldc2_w 3049029394425736856
      // 1c2: lload 2
      // 1c3: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: ifeq 1ea
      // 1cb: goto 1d8
      // 1ce: ldc2_w 3057421077378620569
      // 1d1: lload 2
      // 1d2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: ldc ""
      // 1da: goto 1e7
      // 1dd: ldc2_w 3057421077378620569
      // 1e0: lload 2
      // 1e1: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: goto 225
      // 1ea: new java/lang/StringBuilder
      // 1ed: dup
      // 1ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f1: ldc "'"
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: aload 0
      // 1f7: lload 16
      // 1f9: bipush 1
      // 1fa: anewarray 450
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w 3860856797382688832
      // 209: lload 2
      // 20a: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 212: sipush 28131
      // 215: ldc2_w 1146427474151879296
      // 218: lload 2
      // 219: lxor
      // 21a: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 222: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: sipush 14209
      // 22b: ldc2_w 116420054763268323
      // 22e: lload 2
      // 22f: lxor
      // 230: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 238: aload 0
      // 239: lload 10
      // 23b: invokevirtual com/zelix/k4.j (J)Ljava/lang/String;
      // 23e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 241: sipush 237
      // 244: ldc2_w 1902009444921859974
      // 247: lload 2
      // 248: lxor
      // 249: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 251: aload 29
      // 253: lload 7
      // 255: iload 9
      // 257: invokevirtual com/zelix/_v.O (JI)Ljava/lang/String;
      // 25a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25d: sipush 32540
      // 260: ldc2_w 5185166692045660285
      // 263: lload 2
      // 264: lxor
      // 265: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 270: astore 30
      // 272: iload 20
      // 274: lload 2
      // 275: lconst_0
      // 276: lcmp
      // 277: ifle 2c7
      // 27a: ifeq 2c5
      // 27d: aload 5
      // 27f: ldc2_w 2893779901937840739
      // 282: lload 2
      // 283: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: ifeq 2be
      // 28b: goto 298
      // 28e: ldc2_w 3057421077378620569
      // 291: lload 2
      // 292: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: aload 21
      // 29a: new java/lang/StringBuilder
      // 29d: dup
      // 29e: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a1: ldc "\t"
      // 2a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a6: aload 30
      // 2a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ae: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2b1: goto 2be
      // 2b4: ldc2_w 3057421077378620569
      // 2b7: lload 2
      // 2b8: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: aload 6
      // 2c0: aload 30
      // 2c2: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2c5: iload 20
      // 2c7: lload 2
      // 2c8: lconst_0
      // 2c9: lcmp
      // 2ca: iflt 2e5
      // 2cd: ifne 2e0
      // 2d0: bipush 1
      // 2d1: goto 2de
      // 2d4: ldc2_w 3057421077378620569
      // 2d7: lload 2
      // 2d8: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: istore 22
      // 2e0: iinc 27 1
      // 2e3: iload 20
      // 2e5: ifne 0e8
      // 2e8: iinc 25 1
      // 2eb: iload 20
      // 2ed: lload 2
      // 2ee: lconst_0
      // 2ef: lcmp
      // 2f0: iflt 0b9
      // 2f3: ifne 0b7
      // 2f6: lload 2
      // 2f7: lconst_0
      // 2f8: lcmp
      // 2f9: iflt 0c7
      // 2fc: iload 22
      // 2fe: iload 20
      // 300: ifeq 38c
      // 303: ifeq 38a
      // 306: goto 313
      // 309: ldc2_w 3057421077378620569
      // 30c: lload 2
      // 30d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: athrow
      // 313: aload 24
      // 315: invokeinterface java/util/List.size ()I 1
      // 31a: istore 25
      // 31c: iload 25
      // 31e: anewarray 36
      // 321: astore 26
      // 323: bipush 0
      // 324: istore 27
      // 326: iload 27
      // 328: iload 25
      // 32a: if_icmpge 37e
      // 32d: aload 24
      // 32f: iload 27
      // 331: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 336: checkcast java/util/List
      // 339: astore 28
      // 33b: aload 28
      // 33d: invokeinterface java/util/List.size ()I 1
      // 342: anewarray 430
      // 345: astore 29
      // 347: aload 26
      // 349: iload 27
      // 34b: aload 28
      // 34d: aload 29
      // 34f: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 354: checkcast [Lcom/zelix/s8;
      // 357: aastore
      // 358: iinc 27 1
      // 35b: iload 20
      // 35d: lload 2
      // 35e: lconst_0
      // 35f: lcmp
      // 360: ifle 368
      // 363: ifeq 38a
      // 366: iload 20
      // 368: ifne 326
      // 36b: lload 2
      // 36c: lconst_0
      // 36d: lcmp
      // 36e: iflt 35b
      // 371: goto 37e
      // 374: ldc2_w 3057421077378620569
      // 377: lload 2
      // 378: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: athrow
      // 37e: aload 0
      // 37f: aload 26
      // 381: ldc2_w 3005504479833796178
      // 384: lload 2
      // 385: invokedynamic t (Ljava/lang/Object;[[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: iload 23
      // 38c: ireturn
      // 38d: bipush 1
      // 38e: ireturn
   }

   int g(int param1, byte param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 56
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 40
      // 012: lshl
      // 013: bipush 40
      // 015: lushr
      // 016: lor
      // 017: lstore 4
      // 019: lload 4
      // 01b: dup2
      // 01c: ldc2_w 105521851192230
      // 01f: lxor
      // 020: lstore 6
      // 022: pop2
      // 023: ldc2_w -1731670573547539696
      // 026: lload 4
      // 028: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: istore 8
      // 02f: aload 0
      // 030: ldc2_w -1801850721672025048
      // 033: lload 4
      // 035: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: iload 8
      // 03c: ifne 103
      // 03f: ifeq 0f7
      // 042: goto 050
      // 045: ldc2_w -83259285474899921
      // 048: lload 4
      // 04a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: bipush 1
      // 051: istore 9
      // 053: aload 0
      // 054: ldc2_w -215149973507704092
      // 057: lload 4
      // 059: invokedynamic p (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: arraylength
      // 05f: istore 10
      // 061: bipush 0
      // 062: istore 11
      // 064: iload 11
      // 066: iload 10
      // 068: if_icmpge 0e8
      // 06b: iinc 9 2
      // 06e: aload 0
      // 06f: ldc2_w -215149973507704092
      // 072: lload 4
      // 074: invokedynamic p (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: iload 11
      // 07b: aaload
      // 07c: arraylength
      // 07d: istore 12
      // 07f: bipush 0
      // 080: iload 8
      // 082: ifne 0f6
      // 085: istore 13
      // 087: iload 13
      // 089: iload 12
      // 08b: if_icmpge 0e0
      // 08e: iload 9
      // 090: aload 0
      // 091: ldc2_w -215149973507704092
      // 094: lload 4
      // 096: invokedynamic p (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: iload 11
      // 09d: aaload
      // 09e: iload 13
      // 0a0: aaload
      // 0a1: lload 6
      // 0a3: bipush 1
      // 0a4: anewarray 450
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w -2038153578928318179
      // 0b3: lload 4
      // 0b5: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: iadd
      // 0bb: istore 9
      // 0bd: iinc 13 1
      // 0c0: iload 8
      // 0c2: iload 3
      // 0c3: iflt 0e5
      // 0c6: ifne 0e3
      // 0c9: iload 8
      // 0cb: ifeq 087
      // 0ce: iload 1
      // 0cf: iflt 0c0
      // 0d2: goto 0e0
      // 0d5: ldc2_w -83259285474899921
      // 0d8: lload 4
      // 0da: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: iinc 11 1
      // 0e3: iload 8
      // 0e5: ifeq 064
      // 0e8: aload 0
      // 0e9: iload 9
      // 0eb: putfield com/zelix/k4.W I
      // 0ee: aload 0
      // 0ef: iload 2
      // 0f0: ifle 06f
      // 0f3: getfield com/zelix/k4.W I
      // 0f6: ireturn
      // 0f7: aload 0
      // 0f8: ldc2_w -1925887157155409574
      // 0fb: lload 4
      // 0fd: invokedynamic p (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: arraylength
      // 103: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void s(Object[] var1) {
      Set var3 = (Set)var1[0];
      Set var7 = (Set)var1[1];
      long var4 = (Long)var1[2];
      Set var2 = (Set)var1[3];
      Set var6 = (Set)var1[4];
      long var8 = var4 ^ 84600281795993L;
      boolean var10 = m44.a<"h">(313498970671567038L, var4);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"v">(this, 382965665269731206L, var4);
            if (var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var15) {
            throw m44.a<"h">(var15, 2122936432885754753L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"v">(this, 2210626761669253450L, var4).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < m44.a<"v">(this, 2210626761669253450L, var4)[var11].length) {
                  try {
                     m44.a<"w">(
                        m44.a<"v">(this, 2210626761669253450L, var4)[var11][var12], new Object[]{var3, var7, var8, var2, var6}, 1839233746996432619L, var4
                     );
                     var12++;
                  } catch (n9 var14) {
                     boolean var10001 = false;
                     throw m44.a<"h">(var14, 2122936432885754753L, var4);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var4 <= 0L) {
                           break label57;
                        }

                        if (var10) {
                           break label56;
                        }

                        if (!var10) {
                           break;
                        }
                     } catch (n9 var13) {
                        boolean var18 = false;
                        throw m44.a<"h">(var13, 2122936432885754753L, var4);
                     }

                     if (var4 >= 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (var17) {
            break;
         }
      }
   }

   protected void c(Object[] param1) {
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
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 138122824747950
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w 716282175763740856
      // 026: lload 3
      // 027: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: aload 0
      // 02d: lload 5
      // 02f: aload 2
      // 030: bipush 2
      // 031: anewarray 450
      // 034: dup_x1
      // 035: swap
      // 036: bipush 1
      // 037: swap
      // 038: aastore
      // 039: dup_x2
      // 03a: dup_x2
      // 03b: pop
      // 03c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03f: bipush 0
      // 040: swap
      // 041: aastore
      // 042: invokespecial com/zelix/ki.c ([Ljava/lang/Object;)V
      // 045: istore 9
      // 047: aload 0
      // 048: ldc2_w 1198408428474194551
      // 04b: lload 3
      // 04c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: iload 9
      // 053: ifeq 083
      // 056: ifeq 135
      // 059: goto 066
      // 05c: ldc2_w 614499815450541680
      // 05f: lload 3
      // 060: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: aload 2
      // 067: aload 0
      // 068: ldc2_w 818725427871714491
      // 06b: lload 3
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: arraylength
      // 072: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 075: bipush 0
      // 076: goto 083
      // 079: ldc2_w 614499815450541680
      // 07c: lload 3
      // 07d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: istore 10
      // 085: iload 10
      // 087: aload 0
      // 088: ldc2_w 818725427871714491
      // 08b: lload 3
      // 08c: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: arraylength
      // 092: if_icmpge 124
      // 095: aload 2
      // 096: aload 0
      // 097: ldc2_w 818725427871714491
      // 09a: lload 3
      // 09b: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: iload 10
      // 0a2: aaload
      // 0a3: arraylength
      // 0a4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0a7: iload 9
      // 0a9: lload 3
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 0b3
      // 0af: ifeq 150
      // 0b2: bipush 0
      // 0b3: istore 11
      // 0b5: iload 11
      // 0b7: aload 0
      // 0b8: ldc2_w 818725427871714491
      // 0bb: lload 3
      // 0bc: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 10
      // 0c3: aaload
      // 0c4: arraylength
      // 0c5: if_icmpge 11c
      // 0c8: aload 0
      // 0c9: ldc2_w 818725427871714491
      // 0cc: lload 3
      // 0cd: invokedynamic w (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: iload 10
      // 0d4: aaload
      // 0d5: iload 11
      // 0d7: aaload
      // 0d8: aload 2
      // 0d9: lload 7
      // 0db: bipush 2
      // 0dc: anewarray 450
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 1
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w 1487391503694097298
      // 0f0: lload 3
      // 0f1: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: iinc 11 1
      // 0f9: iload 9
      // 0fb: lload 3
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: ifle 121
      // 101: ifeq 11f
      // 104: iload 9
      // 106: ifne 0b5
      // 109: lload 3
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 0f9
      // 10f: goto 11c
      // 112: ldc2_w 614499815450541680
      // 115: lload 3
      // 116: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: iinc 10 1
      // 11f: iload 9
      // 121: ifne 085
      // 124: lload 3
      // 125: lconst_0
      // 126: lcmp
      // 127: ifle 143
      // 12a: iload 9
      // 12c: lload 3
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 0a9
      // 132: ifne 150
      // 135: aload 2
      // 136: aload 0
      // 137: ldc2_w 1376640891870979845
      // 13a: lload 3
      // 13b: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual java/io/DataOutputStream.write ([B)V
      // 143: goto 150
      // 146: ldc2_w 614499815450541680
      // 149: lload 3
      // 14a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void f(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 59800871386908L;
      boolean var6 = m44.a<"o">(1609736174550729393L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = m44.a<"q">(this, 1684269418671496585L, var2);
            if (var6) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var11) {
            throw m44.a<"o">(var11, 1114927135543720334L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < m44.a<"q">(this, 910451090022042437L, var2).length) {
         int var8 = 0;

         label57: {
            label56: {
               label55:
               while (var8 < m44.a<"q">(this, 910451090022042437L, var2)[var7].length) {
                  try {
                     m44.a<"p">(m44.a<"q">(this, 910451090022042437L, var2)[var7][var8], new Object[]{var4}, 1202945322579644177L, var2);
                     var8++;
                  } catch (n9 var10) {
                     boolean var10001 = false;
                     throw m44.a<"o">(var10, 1114927135543720334L, var2);
                  }

                  while (true) {
                     try {
                        var13 = var6;
                        if (var2 < 0L) {
                           break label57;
                        }

                        if (var6) {
                           break label56;
                        }

                        if (!var6) {
                           break;
                        }
                     } catch (n9 var9) {
                        boolean var14 = false;
                        throw m44.a<"o">(var9, 1114927135543720334L, var2);
                     }

                     if (var2 > 0L) {
                        break label55;
                     }
                  }
               }

               var7++;
            }

            var13 = var6;
         }

         if (var13) {
            break;
         }
      }
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/u5
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/k4.c J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 101171031131920
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 68997554214205
      // 026: lxor
      // 027: dup2
      // 028: bipush 32
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 7
      // 02e: dup2
      // 02f: bipush 32
      // 031: lshl
      // 032: bipush 56
      // 034: lushr
      // 035: l2i
      // 036: istore 8
      // 038: dup2
      // 039: bipush 40
      // 03b: lshl
      // 03c: bipush 40
      // 03e: lushr
      // 03f: l2i
      // 040: istore 9
      // 042: pop2
      // 043: pop2
      // 044: ldc2_w 7679359012799650778
      // 047: lload 2
      // 048: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: aload 4
      // 04f: lload 5
      // 051: bipush 1
      // 052: anewarray 450
      // 055: dup_x2
      // 056: dup_x2
      // 057: pop
      // 058: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: ldc2_w 8327567995154008146
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: istore 11
      // 069: iload 11
      // 06b: anewarray 36
      // 06e: astore 12
      // 070: aload 4
      // 072: bipush 0
      // 073: anewarray 450
      // 076: ldc2_w 7605420689862389000
      // 079: lload 2
      // 07a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: istore 13
      // 081: bipush 0
      // 082: istore 14
      // 084: bipush 0
      // 085: istore 15
      // 087: istore 10
      // 089: aload 4
      // 08b: iload 15
      // 08d: iinc 15 1
      // 090: bipush 1
      // 091: anewarray 450
      // 094: dup_x1
      // 095: swap
      // 096: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 099: bipush 0
      // 09a: swap
      // 09b: aastore
      // 09c: ldc2_w 8078307424038286356
      // 09f: lload 2
      // 0a0: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: istore 16
      // 0a7: bipush 0
      // 0a8: istore 17
      // 0aa: iload 17
      // 0ac: iload 11
      // 0ae: if_icmpge 1ae
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 218
      // 0b7: iload 17
      // 0b9: iload 10
      // 0bb: ifeq 217
      // 0be: iload 16
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: ifle 166
      // 0c6: iload 10
      // 0c8: ifeq 166
      // 0cb: goto 0d8
      // 0ce: ldc2_w 7774632281526869266
      // 0d1: lload 2
      // 0d2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: lload 2
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 159
      // 0de: if_icmpne 14c
      // 0e1: goto 0ee
      // 0e4: ldc2_w 7774632281526869266
      // 0e7: lload 2
      // 0e8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 12
      // 0f0: iload 17
      // 0f2: bipush 0
      // 0f3: anewarray 430
      // 0f6: aastore
      // 0f7: iload 10
      // 0f9: lload 2
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 1ab
      // 0ff: ifeq 1a9
      // 102: goto 10f
      // 105: ldc2_w 7774632281526869266
      // 108: lload 2
      // 109: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 15
      // 111: iload 13
      // 113: if_icmpge 1a6
      // 116: goto 123
      // 119: ldc2_w 7774632281526869266
      // 11c: lload 2
      // 11d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 4
      // 125: iload 15
      // 127: iinc 15 1
      // 12a: bipush 1
      // 12b: anewarray 450
      // 12e: dup_x1
      // 12f: swap
      // 130: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w 8078307424038286356
      // 139: lload 2
      // 13a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: istore 16
      // 141: iload 10
      // 143: lload 2
      // 144: lconst_0
      // 145: lcmp
      // 146: iflt 14e
      // 149: ifne 1a6
      // 14c: iload 14
      // 14e: aload 0
      // 14f: ldc2_w 7511613841375424473
      // 152: lload 2
      // 153: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: arraylength
      // 159: goto 166
      // 15c: ldc2_w 7774632281526869266
      // 15f: lload 2
      // 160: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: if_icmpge 190
      // 169: aload 12
      // 16b: iload 17
      // 16d: aload 0
      // 16e: ldc2_w 7511613841375424473
      // 171: lload 2
      // 172: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: iload 14
      // 179: iinc 14 1
      // 17c: aaload
      // 17d: aastore
      // 17e: iload 10
      // 180: ifne 1a6
      // 183: goto 190
      // 186: ldc2_w 7774632281526869266
      // 189: lload 2
      // 18a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: aload 12
      // 192: iload 17
      // 194: bipush 0
      // 195: anewarray 430
      // 198: aastore
      // 199: goto 1a6
      // 19c: ldc2_w 7774632281526869266
      // 19f: lload 2
      // 1a0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: iinc 17 1
      // 1a9: iload 10
      // 1ab: ifne 0aa
      // 1ae: lload 2
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: iflt 0b1
      // 1b4: aload 0
      // 1b5: iload 10
      // 1b7: lload 2
      // 1b8: lconst_0
      // 1b9: lcmp
      // 1ba: iflt 209
      // 1bd: ifeq 207
      // 1c0: ldc2_w 8596123600297786448
      // 1c3: lload 2
      // 1c4: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: ifnonnull 1fa
      // 1cc: goto 1d9
      // 1cf: ldc2_w 7774632281526869266
      // 1d2: lload 2
      // 1d3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: aload 0
      // 1db: ldc2_w 7511613841375424473
      // 1de: lload 2
      // 1df: invokedynamic u (Ljava/lang/Object;JJ)[[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: ldc2_w 8596123600297786448
      // 1e7: lload 2
      // 1e8: invokedynamic w (Ljava/lang/Object;[[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: goto 1fa
      // 1f0: ldc2_w 7774632281526869266
      // 1f3: lload 2
      // 1f4: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: aload 12
      // 1fd: ldc2_w 7511613841375424473
      // 200: lload 2
      // 201: invokedynamic w (Ljava/lang/Object;[[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: aload 0
      // 207: iload 7
      // 209: iload 8
      // 20b: i2b
      // 20c: iload 9
      // 20e: ldc2_w 7602459643030426114
      // 211: lload 2
      // 212: invokedynamic t (Ljava/lang/Object;IBIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: pop
      // 218: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public s8 w(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = c ^ var2;
      long var5 = var2 ^ 64173241403168L;
      byte var7 = m44.a<"k">(6429652347431757938L, var2);

      byte var10000;
      label67: {
         try {
            var10000 = m44.a<"u">(this, 4641964899049900733L, var2);
            if (var7 == 0) {
               break label67;
            }

            if (var10000 == 0) {
               return null;
            }
         } catch (n9 var11) {
            throw m44.a<"k">(var11, 6362790454936907450L, var2);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      label59:
      do {
         var10000 = var8;

         label56:
         while (var10000 < m44.a<"u">(this, 6599666911240641649L, var2).length) {
            var10000 = 0;

            label54:
            while (true) {
               int var9 = var10000;

               while (true) {
                  if (var9 < m44.a<"u">(this, 6599666911240641649L, var2)[var8].length) {
                     var10000 = var4.equals(
                        m44.a<"t">(m44.a<"u">(this, 6599666911240641649L, var2)[var8][var9], new Object[]{var5}, 6661875671570785327L, var2)
                     );
                  } else {
                     var8++;
                     var10000 = var7;
                     if (var2 > 0L) {
                        continue label59;
                     }
                  }

                  while (true) {
                     if (var7 == 0) {
                        continue label56;
                     }

                     try {
                        if (var2 <= 0L) {
                           continue label54;
                        }

                        if (var10000 != 0) {
                           return m44.a<"u">(this, 6599666911240641649L, var2)[var8][var9];
                        }
                     } catch (n9 var10) {
                        throw m44.a<"k">(var10, 6362790454936907450L, var2);
                     }

                     var9++;
                     if (var7 != 0) {
                        break;
                     }

                     var8++;
                     var10000 = var7;
                     if (var2 > 0L) {
                        continue label59;
                     }
                  }
               }
            }
         }
         break;
      } while (var10000 != 0);

      return null;
   }

   static {
      long var0 = c ^ 137276647532254L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "$ä\u009aà\u0099;U»§F\u0096zXÛ¦î\u0010sØL)ÑKskµCÛª/\u009aªS\u0010\u0094¹&Æ5üÖI2\u008d{Ñ\u0081«Ý¦\u0010\u008e\n\u0090±ã\u001f£ß!H$\u0017\u001f\u000b\u009bþ\u0018æ\u009eS{\u0007fç\t¤FTãIs¼Õ{\u0007·bNr!m(c\u0018íÜ\u007f3Pè·\"Ò.\u0094/oõ®ì8]¯ÔUÞ\u001a!\n\u0015Ý´B½Zñ\u007f[Zc\n\u0019\u0010ñwkB© ý\u0099\u0002¿¿µñß\u001b\u0015(O-Ôuã-ýÃ\t?ì¶2\r\bÜXúQ\u0089¸ÄÀ\u0017_4Ï$Æ¶\u008d`Õ\u0004Ó\u00867âg#\u0010A°,¿\u0016-4ß|ï>Nó9o\u0015 '\u007füµ\u0089$\u008f©,»\u000bå<m\u0089ÌÚÝ\u001e(Wf}[\u007fÒY\u001aCó\u0096 \u0010ÚyÈ}Vd$N{·BÜû\u0002Î ";
      int var8 = "$ä\u009aà\u0099;U»§F\u0096zXÛ¦î\u0010sØL)ÑKskµCÛª/\u009aªS\u0010\u0094¹&Æ5üÖI2\u008d{Ñ\u0081«Ý¦\u0010\u008e\n\u0090±ã\u001f£ß!H$\u0017\u001f\u000b\u009bþ\u0018æ\u009eS{\u0007fç\t¤FTãIs¼Õ{\u0007·bNr!m(c\u0018íÜ\u007f3Pè·\"Ò.\u0094/oõ®ì8]¯ÔUÞ\u001a!\n\u0015Ý´B½Zñ\u007f[Zc\n\u0019\u0010ñwkB© ý\u0099\u0002¿¿µñß\u001b\u0015(O-Ôuã-ýÃ\t?ì¶2\r\bÜXúQ\u0089¸ÄÀ\u0017_4Ï$Æ¶\u008d`Õ\u0004Ó\u00867âg#\u0010A°,¿\u0016-4ß|ï>Nó9o\u0015 '\u007füµ\u0089$\u008f©,»\u000bå<m\u0089ÌÚÝ\u001e(Wf}[\u007fÒY\u001aCó\u0096 \u0010ÚyÈ}Vd$N{·BÜû\u0002Î "
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     i = new String[13];
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

                  var6 = "tNâü\u001eX\u0013\u0089§Yf\u0099ú®\n¤Ô\u0088Oeµ\u0016\u001ey\u0002ùV\u0012êÒ(¡~\u009f¨E`r\u0080\b\rÎ\u0094ÚÆó\u000b^ù\u0092àv)¯Fù½s\u001eË¹ÏFVe\u008cn\u0016lO\nO\u0017E1<y¥N\u0098¯\u0000\u008cN\u0017ùw\u0010aO×\u0096sB·§\u0010æÞë½â`\u0091Í'Ôî\u000bøß\\!";
                  var8 = "tNâü\u001eX\u0013\u0089§Yf\u0099ú®\n¤Ô\u0088Oeµ\u0016\u001ey\u0002ùV\u0012êÒ(¡~\u009f¨E`r\u0080\b\rÎ\u0094ÚÆó\u000b^ù\u0092àv)¯Fù½s\u001eË¹ÏFVe\u008cn\u0016lO\nO\u0017E1<y¥N\u0098¯\u0000\u008cN\u0017ùw\u0010aO×\u0096sB·§\u0010æÞë½â`\u0091Í'Ôî\u000bøß\\!"
                     .length();
                  var5 = '`';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26471;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("com/zelix/k4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
