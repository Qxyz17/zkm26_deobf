package com.zelix;

import java.io.DataOutputStream;
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

public class bw extends kx implements ni {
   private x8 D;
   private static final long a = prr.a(-5923672588911462869L, -4885082978473725188L, MethodHandles.lookup().lookupClass()).a(126167404116780L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g = new HashMap(13);

   bw(_4 param1, int param2, String param3, h1 param4, l6q param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bw.a J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 58790364631718
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 26182878551874
      // 015: lxor
      // 016: lstore 10
      // 018: dup2
      // 019: ldc2_w 60467016923596
      // 01c: lxor
      // 01d: lstore 12
      // 01f: dup2
      // 020: ldc2_w 52582183504573
      // 023: lxor
      // 024: lstore 14
      // 026: dup2
      // 027: ldc2_w 127730119916783
      // 02a: lxor
      // 02b: lstore 16
      // 02d: dup2
      // 02e: ldc2_w 22530696862120
      // 031: lxor
      // 032: lstore 18
      // 034: pop2
      // 035: ldc2_w -5206464841328769290
      // 038: lload 6
      // 03a: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 0
      // 040: aload 1
      // 041: iload 2
      // 042: lload 14
      // 044: aload 3
      // 045: aload 4
      // 047: aload 5
      // 049: invokespecial com/zelix/kx.<init> (Lcom/zelix/_4;IJLjava/lang/String;Lcom/zelix/h1;Lcom/zelix/l6q;)V
      // 04c: aload 0
      // 04d: aload 0
      // 04e: getfield com/zelix/bw.W I
      // 051: newarray 8
      // 053: ldc2_w -5956966467069961909
      // 056: lload 6
      // 058: invokedynamic s (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 4
      // 05f: aload 0
      // 060: ldc2_w -5956966467069961909
      // 063: lload 6
      // 065: invokedynamic q (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: invokevirtual com/zelix/h1.read ([B)I
      // 06d: pop
      // 06e: istore 20
      // 070: aload 0
      // 071: ldc2_w -5956966467069961909
      // 074: lload 6
      // 076: invokedynamic q (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: bipush 0
      // 07c: lload 10
      // 07e: bipush 3
      // 07f: anewarray 327
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 2
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 090: bipush 1
      // 091: swap
      // 092: aastore
      // 093: dup_x1
      // 094: swap
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: ldc2_w -5963347596875968011
      // 09b: lload 6
      // 09d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/h1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: astore 21
      // 0a4: aconst_null
      // 0a5: astore 22
      // 0a7: aload 21
      // 0a9: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0ac: istore 23
      // 0ae: aload 1
      // 0af: lload 16
      // 0b1: iload 23
      // 0b3: invokevirtual com/zelix/_4.m (JI)Lcom/zelix/js;
      // 0b6: astore 24
      // 0b8: aload 24
      // 0ba: iload 20
      // 0bc: ifeq 137
      // 0bf: ifnonnull 135
      // 0c2: goto 0d0
      // 0c5: ldc2_w -5757871733810709836
      // 0c8: lload 6
      // 0ca: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: bipush 0
      // 0d2: ldc2_w -5841222549495126983
      // 0d5: lload 6
      // 0d7: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: new com/zelix/aw
      // 0df: dup
      // 0e0: new java/lang/StringBuilder
      // 0e3: dup
      // 0e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e7: aload 1
      // 0e8: lload 12
      // 0ea: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 0ed: lload 8
      // 0ef: ldc2_w -5333918364416195238
      // 0f2: lload 6
      // 0f4: invokedynamic p (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: sipush 28438
      // 0ff: ldc2_w 6068729843703208683
      // 102: lload 6
      // 104: lxor
      // 105: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: iload 23
      // 10f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 112: sipush 29357
      // 115: ldc2_w 6024627171372549974
      // 118: lload 6
      // 11a: lxor
      // 11b: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 126: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 129: athrow
      // 12a: ldc2_w -5757871733810709836
      // 12d: lload 6
      // 12f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 24
      // 137: instanceof com/zelix/x8
      // 13a: ifne 1be
      // 13d: aload 0
      // 13e: bipush 0
      // 13f: ldc2_w -5841222549495126983
      // 142: lload 6
      // 144: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: new com/zelix/aw
      // 14c: dup
      // 14d: new java/lang/StringBuilder
      // 150: dup
      // 151: invokespecial java/lang/StringBuilder.<init> ()V
      // 154: aload 1
      // 155: lload 12
      // 157: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 15a: lload 8
      // 15c: ldc2_w -5333918364416195238
      // 15f: lload 6
      // 161: invokedynamic p (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: sipush 27242
      // 16c: ldc2_w 5477615983056412566
      // 16f: lload 6
      // 171: lxor
      // 172: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: iload 23
      // 17c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 17f: sipush 9457
      // 182: ldc2_w 1355130027443982606
      // 185: lload 6
      // 187: lxor
      // 188: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 24
      // 192: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 195: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: sipush 18976
      // 19e: ldc2_w 7832921545922248670
      // 1a1: lload 6
      // 1a3: lxor
      // 1a4: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 1b2: athrow
      // 1b3: ldc2_w -5757871733810709836
      // 1b6: lload 6
      // 1b8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: aload 24
      // 1c1: checkcast com/zelix/x8
      // 1c4: ldc2_w -5312216559296712897
      // 1c7: lload 6
      // 1c9: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: aload 5
      // 1d0: aload 0
      // 1d1: ldc2_w -5312216559296712897
      // 1d4: lload 6
      // 1d6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: aload 0
      // 1dc: lload 18
      // 1de: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1e1: aload 21
      // 1e3: ifnull 287
      // 1e6: aload 22
      // 1e8: ifnull 20d
      // 1eb: aload 21
      // 1ed: ldc2_w -5684097051215283147
      // 1f0: lload 6
      // 1f2: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: goto 287
      // 1fa: astore 23
      // 1fc: aload 22
      // 1fe: aload 23
      // 200: ldc2_w -5836800675298143609
      // 203: lload 6
      // 205: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: goto 287
      // 20d: aload 21
      // 20f: ldc2_w -5684097051215283147
      // 212: lload 6
      // 214: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: goto 287
      // 21c: astore 23
      // 21e: aload 23
      // 220: astore 22
      // 222: aload 23
      // 224: athrow
      // 225: astore 25
      // 227: aload 21
      // 229: ifnull 284
      // 22c: aload 22
      // 22e: ifnull 26a
      // 231: goto 23f
      // 234: ldc2_w -5757871733810709836
      // 237: lload 6
      // 239: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: aload 21
      // 241: ldc2_w -5684097051215283147
      // 244: lload 6
      // 246: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: goto 284
      // 24e: astore 26
      // 250: aload 22
      // 252: lload 6
      // 254: lconst_0
      // 255: lcmp
      // 256: iflt 286
      // 259: aload 26
      // 25b: ldc2_w -5836800675298143609
      // 25e: lload 6
      // 260: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: iload 20
      // 267: ifne 284
      // 26a: aload 21
      // 26c: ldc2_w -5684097051215283147
      // 26f: lload 6
      // 271: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: goto 284
      // 279: ldc2_w -5757871733810709836
      // 27c: lload 6
      // 27e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: aload 25
      // 286: athrow
      // 287: return
   }

   public void c(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 716282175763740856
      // 20: lload 2
      // 21: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: lload 5
      // 29: aload 4
      // 2b: bipush 2
      // 2c: anewarray 327
      // 2f: dup_x1
      // 30: swap
      // 31: bipush 1
      // 32: swap
      // 33: aastore
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: invokespecial com/zelix/kx.c ([Ljava/lang/Object;)V
      // 40: istore 7
      // 42: iload 7
      // 44: ifeq 80
      // 47: aload 0
      // 48: ldc2_w 1198408428474194551
      // 4b: lload 2
      // 4c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: ifeq 8b
      // 54: goto 61
      // 57: ldc2_w 1034063464213873914
      // 5a: lload 2
      // 5b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 4
      // 63: aload 0
      // 64: ldc2_w 579102022259003761
      // 67: lload 2
      // 68: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: invokevirtual com/zelix/x8.E ()I
      // 70: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 73: goto 80
      // 76: ldc2_w 1034063464213873914
      // 79: lload 2
      // 7a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: lload 2
      // 81: lconst_0
      // 82: lcmp
      // 83: iflt 9a
      // 86: iload 7
      // 88: ifne a7
      // 8b: aload 4
      // 8d: aload 0
      // 8e: ldc2_w 1376640891870979845
      // 91: lload 2
      // 92: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/io/DataOutputStream.write ([B)V
      // 9a: goto a7
      // 9d: ldc2_w 1034063464213873914
      // a0: lload 2
      // a1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: return
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 120816807025025
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w 6170399952317654249
      // 0c: lload 2
      // 0d: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: getfield com/zelix/bw.b Lcom/zelix/x8;
      // 16: lload 4
      // 18: aload 1
      // 19: aload 0
      // 1a: aload 0
      // 1b: invokevirtual com/zelix/bw.H ()Lcom/zelix/_4;
      // 1e: invokevirtual com/zelix/x8.e (JLcom/zelix/gu;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 21: pop
      // 22: istore 6
      // 24: aload 0
      // 25: ldc2_w 5544088189886891558
      // 28: lload 2
      // 29: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: iload 6
      // 30: ifeq 65
      // 33: ifeq 66
      // 36: goto 43
      // 39: ldc2_w 5911167980024223915
      // 3c: lload 2
      // 3d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: ldc2_w 6077738474324692256
      // 47: lload 2
      // 48: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: lload 4
      // 4f: aload 1
      // 50: aload 0
      // 51: aload 0
      // 52: invokevirtual com/zelix/bw.H ()Lcom/zelix/_4;
      // 55: invokevirtual com/zelix/x8.e (JLcom/zelix/gu;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 58: goto 65
      // 5b: ldc2_w 5911167980024223915
      // 5e: lload 2
      // 5f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: pop
      // 66: return
   }

   public void W(Object[] var1) {
      long var3 = (Long)var1[0];
      int var5 = (Integer)var1[1];
      int var7 = (Integer)var1[2];
      HashMap var6 = (HashMap)var1[3];
      HashMap var2 = (HashMap)var1[4];
   }

   public void N(Object[] var1) {
      DataOutputStream var3 = (DataOutputStream)var1[0];
      Map var2 = (Map)var1[1];
      long var5 = (Long)var1[2];
      lqu var4 = (lqu)var1[3];
      long var7 = var5 ^ 62442288127650L;
      m44.a<"t">(this, new Object[]{var7, var3}, 593294161513379226L, var5);
   }

   public void q(x8 param1, long param2, x8 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 5
      // 08: pop2
      // 09: ldc2_w -5231047857311529425
      // 0c: lload 2
      // 0d: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: istore 7
      // 14: aload 0
      // 15: iload 7
      // 17: ifeq 60
      // 1a: ldc2_w -5287708300416978970
      // 1d: lload 2
      // 1e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: aload 1
      // 24: if_acmpne 52
      // 27: goto 34
      // 2a: ldc2_w -5706464980617250195
      // 2d: lload 2
      // 2e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: aload 0
      // 35: aload 4
      // 37: ldc2_w -5287708300416978970
      // 3a: lload 2
      // 3b: invokedynamic r (Ljava/lang/Object;Lcom/zelix/x8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: iload 7
      // 42: ifne 68
      // 45: goto 52
      // 48: ldc2_w -5706464980617250195
      // 4b: lload 2
      // 4c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 0
      // 53: goto 60
      // 56: ldc2_w -5706464980617250195
      // 59: lload 2
      // 5a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 1
      // 61: lload 5
      // 63: aload 4
      // 65: invokespecial com/zelix/kx.q (Lcom/zelix/x8;JLcom/zelix/x8;)V
      // 68: return
   }

   static {
      long var0 = a ^ 105794012359974L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Ô\u008b\u0002 \u0092p¨ÇêV:õ\b,ýs@\u0081\u0000T\u008c\\í?ë\u0098À\u0084©\u0098\u0095YKW%Òr\u007fDRà½v¹èFÜÇJ\u000eí\u0017\u0092\u008eÈ:U÷ö\u00ad\u00923ÞX\u0015»sÿìor\u008f\u0084Á\bÖ\u008d(\u0019åÛ@\u0094ªf3\u0097ê¥\u0012çA-ïqô\u0017*\u0011·Çß\u0017?aæ¬¦î?¦!\u0014÷\u0081z\u0015½;Ú2²\u009cfÂÔß$«~\u009dÒþq±\u0086\\z+üé¥Â\u0012\u008f'";
      int var8 = "Ô\u008b\u0002 \u0092p¨ÇêV:õ\b,ýs@\u0081\u0000T\u008c\\í?ë\u0098À\u0084©\u0098\u0095YKW%Òr\u007fDRà½v¹èFÜÇJ\u000eí\u0017\u0092\u008eÈ:U÷ö\u00ad\u00923ÞX\u0015»sÿìor\u008f\u0084Á\bÖ\u008d(\u0019åÛ@\u0094ªf3\u0097ê¥\u0012çA-ïqô\u0017*\u0011·Çß\u0017?aæ¬¦î?¦!\u0014÷\u0081z\u0015½;Ú2²\u009cfÂÔß$«~\u009dÒþq±\u0086\\z+üé¥Â\u0012\u008f'"
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
                     c = var9;
                     d = new String[5];
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

                  var6 = ".UíÒ\u009aYGY©Hä?À\n\u0081C¨¤\"Õl\u000ey@Ñ\u009bçÄ¾·\u0015ë¡\u0013MjÂh\u0091CHüqÑ\u000e§¬\u0087\u0087\u0011/P=°>\u0098\u0098ÌªÙ÷ók\u008e¡)\u0090cPú¥2a\tv\u0085Dêd'éÐk\u0004Sr\u0081\u0011\u0003ýúW®\r¨íah\u009b¼\u0002ûÐÞ\u000fD À¿´Xl\u0091";
                  var8 = ".UíÒ\u009aYGY©Hä?À\n\u0081C¨¤\"Õl\u000ey@Ñ\u009bçÄ¾·\u0015ë¡\u0013MjÂh\u0091CHüqÑ\u000e§¬\u0087\u0087\u0011/P=°>\u0098\u0098ÌªÙ÷ók\u008e¡)\u0090cPú¥2a\tv\u0085Dêd'éÐk\u0004Sr\u0081\u0011\u0003ýúW®\r¨íah\u009b¼\u0002ûÐÞ\u000fD À¿´Xl\u0091"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4447;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bw", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/bw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
