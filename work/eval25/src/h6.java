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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h6 extends h9 {
   private static final long b = ess.a(-1548953268456062756L, 3049236117996283512L, MethodHandles.lookup().lookupClass()).a(183722551398817L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   h6(h8 param1, int param2, String param3, _xx param4, _y4 param5, _y4 param6, PrintWriter param7, long param8, _y4 param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/h6.b J
      // 003: lload 8
      // 005: lxor
      // 006: lstore 8
      // 008: lload 8
      // 00a: dup2
      // 00b: ldc2_w 121824563655470
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 41373741222983
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 139919646530481
      // 01c: lxor
      // 01d: lstore 15
      // 01f: dup2
      // 020: ldc2_w 7007836685544
      // 023: lxor
      // 024: dup2
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 17
      // 02b: dup2
      // 02c: bipush 16
      // 02e: lshl
      // 02f: bipush 32
      // 031: lushr
      // 032: l2i
      // 033: istore 18
      // 035: dup2
      // 036: bipush 48
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 19
      // 03f: pop2
      // 040: dup2
      // 041: ldc2_w 26837593002376
      // 044: lxor
      // 045: lstore 20
      // 047: pop2
      // 048: ldc2_w 6116145483278279818
      // 04b: lload 8
      // 04d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: aload 0
      // 053: aload 1
      // 054: iload 2
      // 055: iload 17
      // 057: i2c
      // 058: aload 3
      // 059: aload 4
      // 05b: aload 5
      // 05d: iload 18
      // 05f: iload 19
      // 061: i2s
      // 062: invokespecial com/zelix/h9.<init> (Lcom/zelix/h8;ICLjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;IS)V
      // 065: istore 22
      // 067: aload 0
      // 068: getfield com/zelix/h6.C I
      // 06b: newarray 8
      // 06d: astore 23
      // 06f: aload 4
      // 071: aload 23
      // 073: invokevirtual com/zelix/_xx.read ([B)I
      // 076: pop
      // 077: aload 23
      // 079: lload 13
      // 07b: bipush 0
      // 07c: bipush 3
      // 07d: anewarray 96
      // 080: dup_x1
      // 081: swap
      // 082: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 085: bipush 2
      // 086: swap
      // 087: aastore
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: ldc2_w 5893381846947735226
      // 099: lload 8
      // 09b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: astore 24
      // 0a2: aload 0
      // 0a3: getfield com/zelix/h6.C I
      // 0a6: iload 22
      // 0a8: ifeq 2b7
      // 0ab: bipush 2
      // 0ac: if_icmplt 220
      // 0af: goto 0bd
      // 0b2: ldc2_w 5420883295843425367
      // 0b5: lload 8
      // 0b7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 24
      // 0c0: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c3: putfield com/zelix/h6.t I
      // 0c6: lload 15
      // 0c8: bipush 1
      // 0c9: anewarray 96
      // 0cc: dup_x2
      // 0cd: dup_x2
      // 0ce: pop
      // 0cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w 6218857389347352610
      // 0d8: lload 8
      // 0da: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: astore 25
      // 0e1: lload 15
      // 0e3: bipush 1
      // 0e4: anewarray 96
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w 6218857389347352610
      // 0f3: lload 8
      // 0f5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: astore 26
      // 0fc: new com/zelix/wp
      // 0ff: dup
      // 100: bipush -1
      // 101: invokespecial com/zelix/wp.<init> (I)V
      // 104: astore 27
      // 106: aload 0
      // 107: aload 0
      // 108: getfield com/zelix/h6.t I
      // 10b: anewarray 49
      // 10e: putfield com/zelix/h6.w [Lcom/zelix/hn;
      // 111: bipush 0
      // 112: istore 28
      // 114: iload 28
      // 116: aload 0
      // 117: getfield com/zelix/h6.t I
      // 11a: if_icmpge 1df
      // 11d: aload 0
      // 11e: getfield com/zelix/h6.w [Lcom/zelix/hn;
      // 121: iload 28
      // 123: aload 0
      // 124: aload 24
      // 126: aload 10
      // 128: aload 6
      // 12a: lload 20
      // 12c: aload 7
      // 12e: aload 27
      // 130: aload 25
      // 132: aload 26
      // 134: bipush 9
      // 136: anewarray 96
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 8
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 7
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 6
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 5
      // 14e: swap
      // 14f: aastore
      // 150: dup_x2
      // 151: dup_x2
      // 152: pop
      // 153: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 156: bipush 4
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 3
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 2
      // 161: swap
      // 162: aastore
      // 163: dup_x1
      // 164: swap
      // 165: bipush 1
      // 166: swap
      // 167: aastore
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: ldc2_w 5501288262524116606
      // 170: lload 8
      // 172: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: aastore
      // 178: iload 22
      // 17a: lload 8
      // 17c: lconst_0
      // 17d: lcmp
      // 17e: iflt 1dc
      // 181: ifeq 1da
      // 184: aload 0
      // 185: getfield com/zelix/h6.w [Lcom/zelix/hn;
      // 188: iload 28
      // 18a: aaload
      // 18b: bipush 0
      // 18c: anewarray 96
      // 18f: ldc2_w 5434367831807810563
      // 192: lload 8
      // 194: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: iload 22
      // 19b: ifeq 204
      // 19e: goto 1ac
      // 1a1: ldc2_w 5420883295843425367
      // 1a4: lload 8
      // 1a6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: ifne 1d7
      // 1af: goto 1bd
      // 1b2: ldc2_w 5420883295843425367
      // 1b5: lload 8
      // 1b7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: bipush 0
      // 1bf: ldc2_w 5577573393345835853
      // 1c2: lload 8
      // 1c4: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: goto 1d7
      // 1cc: ldc2_w 5420883295843425367
      // 1cf: lload 8
      // 1d1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: iinc 28 1
      // 1da: iload 22
      // 1dc: ifne 114
      // 1df: aload 0
      // 1e0: iload 22
      // 1e2: lload 8
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 28d
      // 1e9: ifeq 208
      // 1ec: ldc2_w 5577573393345835853
      // 1ef: lload 8
      // 1f1: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: goto 204
      // 1f9: ldc2_w 5420883295843425367
      // 1fc: lload 8
      // 1fe: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: ifne 214
      // 207: aload 0
      // 208: aload 23
      // 20a: ldc2_w 5400415718257499561
      // 20d: lload 8
      // 20f: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: iload 22
      // 216: lload 8
      // 218: lconst_0
      // 219: lcmp
      // 21a: ifle 2a9
      // 21d: ifne 2b8
      // 220: aload 0
      // 221: bipush 0
      // 222: ldc2_w 5577573393345835853
      // 225: lload 8
      // 227: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 7
      // 22e: new java/lang/StringBuilder
      // 231: dup
      // 232: invokespecial java/lang/StringBuilder.<init> ()V
      // 235: sipush 28315
      // 238: ldc2_w 8023070447733852758
      // 23b: lload 8
      // 23d: lxor
      // 23e: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/h6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: aload 0
      // 247: lload 11
      // 249: invokevirtual com/zelix/h6.j (J)Ljava/lang/String;
      // 24c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24f: sipush 18962
      // 252: ldc2_w 1000942893101706974
      // 255: lload 8
      // 257: lxor
      // 258: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/h6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 260: sipush 17392
      // 263: ldc2_w 6687889784029013822
      // 266: lload 8
      // 268: lxor
      // 269: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/h6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 271: sipush 13911
      // 274: ldc2_w 3569987577146053272
      // 277: lload 8
      // 279: lxor
      // 27a: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/h6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 282: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 285: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 288: aload 0
      // 289: aload 0
      // 28a: getfield com/zelix/h6.C I
      // 28d: newarray 8
      // 28f: ldc2_w 5400415718257499561
      // 292: lload 8
      // 294: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: aload 24
      // 29b: aload 0
      // 29c: ldc2_w 5400415718257499561
      // 29f: lload 8
      // 2a1: invokedynamic m (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: invokevirtual com/zelix/_xx.read ([B)I
      // 2a9: goto 2b7
      // 2ac: ldc2_w 5420883295843425367
      // 2af: lload 8
      // 2b1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: pop
      // 2b8: return
   }

   protected void z(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/Map
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 39129388726393
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: aload 3
      // 26: aload 0
      // 27: getfield com/zelix/h6.t I
      // 2a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2d: ldc2_w 2517989938503946907
      // 30: lload 4
      // 32: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: new com/zelix/wp
      // 3a: dup
      // 3b: bipush -1
      // 3c: invokespecial com/zelix/wp.<init> (I)V
      // 3f: astore 9
      // 41: bipush 0
      // 42: istore 10
      // 44: istore 8
      // 46: iload 10
      // 48: aload 0
      // 49: getfield com/zelix/h6.t I
      // 4c: if_icmpge 6a
      // 4f: aload 0
      // 50: getfield com/zelix/h6.w [Lcom/zelix/hn;
      // 53: iload 10
      // 55: aaload
      // 56: checkcast com/zelix/hq
      // 59: aload 3
      // 5a: aload 9
      // 5c: aload 2
      // 5d: lload 6
      // 5f: invokevirtual com/zelix/hq.W (Ljava/io/DataOutputStream;Lcom/zelix/wp;Ljava/util/Map;J)V
      // 62: iinc 10 1
      // 65: iload 8
      // 67: ifne 46
      // 6a: lload 4
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: ifle 65
      // 71: return
   }

   protected void a(Object[] param1) {
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
      // 16: ldc2_w 82904182235273
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -6454243008544009687
      // 20: lload 2
      // 21: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 4
      // 28: aload 0
      // 29: getfield com/zelix/h6.t I
      // 2c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2f: new com/zelix/wp
      // 32: dup
      // 33: bipush -1
      // 34: invokespecial com/zelix/wp.<init> (I)V
      // 37: astore 8
      // 39: istore 7
      // 3b: bipush 0
      // 3c: istore 9
      // 3e: iload 9
      // 40: aload 0
      // 41: getfield com/zelix/h6.t I
      // 44: if_icmpge 7f
      // 47: aload 0
      // 48: getfield com/zelix/h6.w [Lcom/zelix/hn;
      // 4b: iload 9
      // 4d: aaload
      // 4e: checkcast com/zelix/hq
      // 51: aload 4
      // 53: lload 5
      // 55: aload 8
      // 57: bipush 3
      // 58: anewarray 96
      // 5b: dup_x1
      // 5c: swap
      // 5d: bipush 2
      // 5e: swap
      // 5f: aastore
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
      // 6e: ldc2_w -6667075354065786931
      // 71: lload 2
      // 72: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: iinc 9 1
      // 7a: iload 7
      // 7c: ifeq 3e
      // 7f: lload 2
      // 80: lconst_0
      // 81: lcmp
      // 82: iflt 7a
      // 85: return
   }

   String J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var10001 = var2 ^ 97619804954639L;
      int var4 = (int)((var2 ^ 97619804954639L) >>> 32);
      int var5 = (int)((var2 ^ 97619804954639L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return ((h_)this.x()).r(var4, (short)var5, (char)var6);
   }

   h6(h8 var1, mx var2, long var3, int var5) {
      var3 = b ^ var3;
      long var6 = var3 ^ 106219984671751L;
      super(var1, var6, var2, var5);
   }

   static {
      long var0 = b ^ 6665241852508L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "zi\u000ei\u0088áE8\u0096\u0099\u0086'OyÊM\u0010ÿ©\u0016\u0080ï¢r\u0013F\u0010äÌ@Ê\u0084£";
      int var8 = "zi\u000ei\u0088áE8\u0096\u0099\u0086'OyÊM\u0010ÿ©\u0016\u0080ï¢r\u0013F\u0010äÌ@Ê\u0084£".length();
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
                     d = var9;
                     e = new String[4];
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

                  var6 = "gÍç\u0093\u0018v±Ã\u001b uî@æ\u0006\u009f±õ\u0087N\u001729uÆn\u0096Â5ô?U\u008av\u001fßf{v\u0018\u0085Z_\u008f»¦þÄ\u0010Û\n³\u008a\u00023·¬×ÖÏ:FDÄä";
                  var8 = "gÍç\u0093\u0018v±Ã\u001b uî@æ\u0006\u009f±õ\u0087N\u001729uÆn\u0096Â5ô?U\u008av\u001fßf{v\u0018\u0085Z_\u008f»¦þÄ\u0010Û\n³\u008a\u00023·¬×ÖÏ:FDÄä"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31886;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/h6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/h6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
