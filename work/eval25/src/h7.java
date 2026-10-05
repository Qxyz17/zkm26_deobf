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

public class h7 extends h9 {
   private static final long b = ess.a(1723236252295162406L, 8140996238809937551L, MethodHandles.lookup().lookupClass()).a(164052885741272L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   h7(h8 param1, int param2, String param3, _xx param4, _y4 param5, _y4 param6, PrintWriter param7, long param8, _y4 param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/h7.b J
      // 003: lload 8
      // 005: lxor
      // 006: lstore 8
      // 008: lload 8
      // 00a: dup2
      // 00b: ldc2_w 81509180929769
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 2089664661632
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 85073244645949
      // 01c: lxor
      // 01d: lstore 15
      // 01f: dup2
      // 020: ldc2_w 41560096660987
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
      // 040: pop2
      // 041: ldc2_w -3421427230043413312
      // 044: lload 8
      // 046: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 0
      // 04c: aload 1
      // 04d: iload 2
      // 04e: iload 17
      // 050: i2c
      // 051: aload 3
      // 052: aload 4
      // 054: aload 5
      // 056: iload 18
      // 058: iload 19
      // 05a: i2s
      // 05b: invokespecial com/zelix/h9.<init> (Lcom/zelix/h8;ICLjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;IS)V
      // 05e: istore 20
      // 060: aload 0
      // 061: getfield com/zelix/h7.C I
      // 064: iload 20
      // 066: ifne 228
      // 069: bipush 2
      // 06a: if_icmplt 191
      // 06d: goto 07b
      // 070: ldc2_w -3225708268280328438
      // 073: lload 8
      // 075: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 0
      // 07c: aload 4
      // 07e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 081: putfield com/zelix/h7.t I
      // 084: aload 0
      // 085: aload 0
      // 086: getfield com/zelix/h7.t I
      // 089: anewarray 267
      // 08c: putfield com/zelix/h7.w [Lcom/zelix/hn;
      // 08f: bipush 0
      // 090: istore 21
      // 092: iload 21
      // 094: aload 0
      // 095: getfield com/zelix/h7.t I
      // 098: if_icmpge 11b
      // 09b: aload 0
      // 09c: getfield com/zelix/h7.w [Lcom/zelix/hn;
      // 09f: iload 21
      // 0a1: new com/zelix/hg
      // 0a4: dup
      // 0a5: lload 13
      // 0a7: aload 0
      // 0a8: aload 4
      // 0aa: aload 10
      // 0ac: aload 6
      // 0ae: aload 7
      // 0b0: invokespecial com/zelix/hg.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;)V
      // 0b3: aastore
      // 0b4: iload 20
      // 0b6: lload 8
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 118
      // 0bd: ifne 116
      // 0c0: aload 0
      // 0c1: getfield com/zelix/h7.w [Lcom/zelix/hn;
      // 0c4: iload 21
      // 0c6: aaload
      // 0c7: bipush 0
      // 0c8: anewarray 44
      // 0cb: ldc2_w -3280340903832107760
      // 0ce: lload 8
      // 0d0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: iload 20
      // 0d7: ifne 12d
      // 0da: goto 0e8
      // 0dd: ldc2_w -3225708268280328438
      // 0e0: lload 8
      // 0e2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: ifne 113
      // 0eb: goto 0f9
      // 0ee: ldc2_w -3225708268280328438
      // 0f1: lload 8
      // 0f3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: bipush 0
      // 0fb: ldc2_w -3137699555502593442
      // 0fe: lload 8
      // 100: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: goto 113
      // 108: ldc2_w -3225708268280328438
      // 10b: lload 8
      // 10d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: iinc 21 1
      // 116: iload 20
      // 118: ifeq 092
      // 11b: aload 0
      // 11c: lload 8
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 09c
      // 123: ldc2_w -3137699555502593442
      // 126: lload 8
      // 128: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: ifne 229
      // 130: new java/io/ByteArrayOutputStream
      // 133: dup
      // 134: aload 0
      // 135: getfield com/zelix/h7.C I
      // 138: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 13b: astore 21
      // 13d: new java/io/DataOutputStream
      // 140: dup
      // 141: aload 21
      // 143: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 146: astore 22
      // 148: aload 0
      // 149: lload 11
      // 14b: aload 22
      // 14d: bipush 2
      // 14e: anewarray 44
      // 151: dup_x1
      // 152: swap
      // 153: bipush 1
      // 154: swap
      // 155: aastore
      // 156: dup_x2
      // 157: dup_x2
      // 158: pop
      // 159: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w -3331072767890547369
      // 162: lload 8
      // 164: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: aload 0
      // 16a: aload 21
      // 16c: ldc2_w -3380821486776503505
      // 16f: lload 8
      // 171: invokedynamic j (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: ldc2_w -3179256664419400518
      // 179: lload 8
      // 17b: invokedynamic q (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: aload 0
      // 181: aconst_null
      // 182: putfield com/zelix/h7.w [Lcom/zelix/hn;
      // 185: iload 20
      // 187: lload 8
      // 189: lconst_0
      // 18a: lcmp
      // 18b: ifle 21a
      // 18e: ifeq 229
      // 191: aload 0
      // 192: bipush 0
      // 193: ldc2_w -3137699555502593442
      // 196: lload 8
      // 198: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: aload 7
      // 19f: new java/lang/StringBuilder
      // 1a2: dup
      // 1a3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a6: sipush 22631
      // 1a9: ldc2_w 7376390409860757182
      // 1ac: lload 8
      // 1ae: lxor
      // 1af: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/h7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: aload 0
      // 1b8: lload 15
      // 1ba: invokevirtual com/zelix/h7.j (J)Ljava/lang/String;
      // 1bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c0: sipush 22464
      // 1c3: ldc2_w 9099982294296181016
      // 1c6: lload 8
      // 1c8: lxor
      // 1c9: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/h7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d1: sipush 30277
      // 1d4: ldc2_w 750088767094823070
      // 1d7: lload 8
      // 1d9: lxor
      // 1da: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/h7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: sipush 11029
      // 1e5: ldc2_w 6541967165040608719
      // 1e8: lload 8
      // 1ea: lxor
      // 1eb: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/h7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f6: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1f9: aload 0
      // 1fa: aload 0
      // 1fb: getfield com/zelix/h7.C I
      // 1fe: newarray 8
      // 200: ldc2_w -3179256664419400518
      // 203: lload 8
      // 205: invokedynamic q (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: aload 4
      // 20c: aload 0
      // 20d: ldc2_w -3179256664419400518
      // 210: lload 8
      // 212: invokedynamic n (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: invokevirtual com/zelix/_xx.read ([B)I
      // 21a: goto 228
      // 21d: ldc2_w -3225708268280328438
      // 220: lload 8
      // 222: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: athrow
      // 228: pop
      // 229: return
   }

   h7(h8 var1, long var2, mx var4, int var5) {
      var2 = b ^ var2;
      long var6 = var2 ^ 67244504713755L;
      super(var1, var6, var4, var5);
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Map
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 77035281653063
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: ldc2_w 4577591226137054146
      // 28: lload 2
      // 29: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 5
      // 30: aload 0
      // 31: getfield com/zelix/h7.t I
      // 34: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 37: istore 8
      // 39: bipush 0
      // 3a: istore 9
      // 3c: iload 9
      // 3e: aload 0
      // 3f: getfield com/zelix/h7.t I
      // 42: if_icmpge 7d
      // 45: aload 0
      // 46: getfield com/zelix/h7.w [Lcom/zelix/hn;
      // 49: iload 9
      // 4b: aaload
      // 4c: checkcast com/zelix/hg
      // 4f: aload 5
      // 51: aload 4
      // 53: lload 6
      // 55: bipush 3
      // 56: anewarray 44
      // 59: dup_x2
      // 5a: dup_x2
      // 5b: pop
      // 5c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f: bipush 2
      // 60: swap
      // 61: aastore
      // 62: dup_x1
      // 63: swap
      // 64: bipush 1
      // 65: swap
      // 66: aastore
      // 67: dup_x1
      // 68: swap
      // 69: bipush 0
      // 6a: swap
      // 6b: aastore
      // 6c: ldc2_w 2538144495382578110
      // 6f: lload 2
      // 70: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: iinc 9 1
      // 78: iload 8
      // 7a: ifeq 3c
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt 78
      // 83: return
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 78728021999003
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w -6454243008544009687
      // 1f: lload 3
      // 20: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 2
      // 26: aload 0
      // 27: getfield com/zelix/h7.t I
      // 2a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2d: istore 7
      // 2f: bipush 0
      // 30: istore 8
      // 32: iload 8
      // 34: aload 0
      // 35: getfield com/zelix/h7.t I
      // 38: if_icmpge 6b
      // 3b: aload 0
      // 3c: getfield com/zelix/h7.w [Lcom/zelix/hn;
      // 3f: iload 8
      // 41: aaload
      // 42: checkcast com/zelix/hg
      // 45: lload 5
      // 47: aload 2
      // 48: bipush 2
      // 49: anewarray 44
      // 4c: dup_x1
      // 4d: swap
      // 4e: bipush 1
      // 4f: swap
      // 50: aastore
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w -6518535348557278976
      // 5d: lload 3
      // 5e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: iinc 8 1
      // 66: iload 7
      // 68: ifeq 32
      // 6b: lload 3
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: iflt 66
      // 71: return
   }

   static {
      long var0 = b ^ 83352735610354L;
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
      String var6 = "Ñ\u009býtk\u009d1¹ÚùÌ\u0002ÿÿ{ÂÆ_\u000f\u009c\u0083\u009aµÛ\u000bÕG>\u0087ñN\u009fÅºò\u0001¥Û\u001di/b'íÙSém}ºËò\u008bS1\u0081\u0010ù\u009d\u008b±[uî\u0089 H=Ûãv[\u0000";
      int var8 = "Ñ\u009býtk\u009d1¹ÚùÌ\u0002ÿÿ{ÂÆ_\u000f\u009c\u0083\u009aµÛ\u000bÕG>\u0087ñN\u009fÅºò\u0001¥Û\u001di/b'íÙSém}ºËò\u008bS1\u0081\u0010ù\u009d\u008b±[uî\u0089 H=Ûãv[\u0000"
         .length();
      char var5 = '8';
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

                  var6 = "êóZ\u000eü\u000b'T\u0001ó\r×O#c\u0089\u0010\u0080 \u008b®í\u0005 V\u001e\u009d\u0092\u0010ß:ÚP";
                  var8 = "êóZ\u000eü\u000b'T\u0001ó\r×O#c\u0089\u0010\u0080 \u008b®í\u0005 V\u001e\u009d\u0092\u0010ß:ÚP".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12170;
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
            throw new RuntimeException("com/zelix/h7", var10);
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
         throw new RuntimeException("com/zelix/h7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
