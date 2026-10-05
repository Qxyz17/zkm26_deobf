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

public class b9 extends hv implements _zv, sv {
   private x7[] H;
   private static final long a = ess.a(3546229523054760312L, -3611047551547437712L, MethodHandles.lookup().lookupClass()).a(181353021733097L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void j(Object[] param1) {
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 4
      // 022: pop
      // 023: lload 5
      // 025: dup2
      // 026: ldc2_w 70438289693953
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: ldc2_w -3106497998795710297
      // 030: lload 5
      // 032: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 0
      // 038: lload 7
      // 03a: aload 2
      // 03b: bipush 2
      // 03c: anewarray 116
      // 03f: dup_x1
      // 040: swap
      // 041: bipush 1
      // 042: swap
      // 043: aastore
      // 044: dup_x2
      // 045: dup_x2
      // 046: pop
      // 047: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04a: bipush 0
      // 04b: swap
      // 04c: aastore
      // 04d: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 050: istore 9
      // 052: aload 0
      // 053: iload 9
      // 055: ifne 092
      // 058: ldc2_w -3795817549990238860
      // 05b: lload 5
      // 05d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: ifeq 156
      // 065: goto 073
      // 068: ldc2_w -3372983047931099203
      // 06b: lload 5
      // 06d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 2
      // 074: aload 0
      // 075: ldc2_w -3888027842209892338
      // 078: lload 5
      // 07a: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: arraylength
      // 080: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 083: aload 0
      // 084: goto 092
      // 087: ldc2_w -3372983047931099203
      // 08a: lload 5
      // 08c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: ldc2_w -3888027842209892338
      // 095: lload 5
      // 097: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: astore 10
      // 09e: aload 10
      // 0a0: arraylength
      // 0a1: istore 11
      // 0a3: bipush 0
      // 0a4: istore 12
      // 0a6: iload 12
      // 0a8: iload 11
      // 0aa: if_icmpge 143
      // 0ad: aload 10
      // 0af: iload 12
      // 0b1: aaload
      // 0b2: astore 13
      // 0b4: aload 3
      // 0b5: aload 13
      // 0b7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0bc: checkcast com/zelix/xl
      // 0bf: astore 14
      // 0c1: iload 9
      // 0c3: lload 5
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 0cf
      // 0ca: ifne 173
      // 0cd: iload 9
      // 0cf: lload 5
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: iflt 11a
      // 0d6: ifne 118
      // 0d9: goto 0e7
      // 0dc: ldc2_w -3372983047931099203
      // 0df: lload 5
      // 0e1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: lload 5
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 12d
      // 0ee: aload 14
      // 0f0: ifnull 124
      // 0f3: goto 101
      // 0f6: ldc2_w -3372983047931099203
      // 0f9: lload 5
      // 0fb: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: aload 2
      // 102: aload 14
      // 104: invokevirtual com/zelix/xl.B ()I
      // 107: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 10a: goto 118
      // 10d: ldc2_w -3372983047931099203
      // 110: lload 5
      // 112: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: iload 9
      // 11a: lload 5
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 140
      // 121: ifeq 13b
      // 124: aload 2
      // 125: aload 13
      // 127: invokevirtual com/zelix/x7.B ()I
      // 12a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 12d: goto 13b
      // 130: ldc2_w -3372983047931099203
      // 133: lload 5
      // 135: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: iinc 12 1
      // 13e: iload 9
      // 140: ifeq 0a6
      // 143: lload 5
      // 145: lconst_0
      // 146: lcmp
      // 147: ifle 173
      // 14a: lload 5
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 165
      // 151: iload 9
      // 153: ifeq 173
      // 156: aload 2
      // 157: aload 0
      // 158: ldc2_w -4010137101812909442
      // 15b: lload 5
      // 15d: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: invokevirtual java/io/DataOutputStream.write ([B)V
      // 165: goto 173
      // 168: ldc2_w -3372983047931099203
      // 16b: lload 5
      // 16d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: return
   }

   public b9(h8 param1, int param2, String param3, _xx param4, _y4 param5, _y4 param6, long param7, PrintWriter param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/b9.a J
      // 003: lload 7
      // 005: lxor
      // 006: lstore 7
      // 008: lload 7
      // 00a: dup2
      // 00b: ldc2_w 133614411232162
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 99115455661527
      // 015: lxor
      // 016: lstore 12
      // 018: dup2
      // 019: ldc2_w 98582582498078
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 8
      // 020: lushr
      // 021: lstore 14
      // 023: dup2
      // 024: bipush 56
      // 026: lshl
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: istore 16
      // 02d: pop2
      // 02e: dup2
      // 02f: ldc2_w 93114229030040
      // 032: lxor
      // 033: lstore 17
      // 035: dup2
      // 036: ldc2_w 23452888056834
      // 039: lxor
      // 03a: lstore 19
      // 03c: dup2
      // 03d: ldc2_w 74150228266144
      // 040: lxor
      // 041: lstore 21
      // 043: pop2
      // 044: ldc2_w 4127817969853336844
      // 047: lload 7
      // 049: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: lload 12
      // 051: aload 1
      // 052: iload 2
      // 053: aload 3
      // 054: aload 4
      // 056: aload 5
      // 058: invokespecial com/zelix/hv.<init> (JLcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 05b: aload 0
      // 05c: getfield com/zelix/b9.C I
      // 05f: newarray 8
      // 061: astore 24
      // 063: istore 23
      // 065: aload 4
      // 067: aload 24
      // 069: invokevirtual com/zelix/_xx.read ([B)I
      // 06c: pop
      // 06d: aload 24
      // 06f: lload 17
      // 071: bipush 0
      // 072: bipush 3
      // 073: anewarray 116
      // 076: dup_x1
      // 077: swap
      // 078: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b: bipush 2
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w 2384109126430185061
      // 08f: lload 7
      // 091: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: astore 25
      // 098: aconst_null
      // 099: astore 26
      // 09b: aload 25
      // 09d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0a0: istore 27
      // 0a2: aload 0
      // 0a3: iload 27
      // 0a5: anewarray 237
      // 0a8: ldc2_w 2855712430699632037
      // 0ab: lload 7
      // 0ad: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: bipush 0
      // 0b3: istore 28
      // 0b5: iload 28
      // 0b7: iload 27
      // 0b9: if_icmpge 1d9
      // 0bc: aload 25
      // 0be: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c1: istore 29
      // 0c3: aload 0
      // 0c4: lload 14
      // 0c6: iload 29
      // 0c8: iload 16
      // 0ca: i2b
      // 0cb: invokevirtual com/zelix/b9.N (JIB)Lcom/zelix/xl;
      // 0ce: astore 30
      // 0d0: iload 23
      // 0d2: lload 7
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 0e1
      // 0d9: ifne 16f
      // 0dc: aload 30
      // 0de: instanceof com/zelix/x7
      // 0e1: iload 23
      // 0e3: ifne 2b9
      // 0e6: goto 0f4
      // 0e9: ldc2_w 4367284221411322390
      // 0ec: lload 7
      // 0ee: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: ifeq 148
      // 0f7: goto 105
      // 0fa: ldc2_w 4367284221411322390
      // 0fd: lload 7
      // 0ff: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 0
      // 106: ldc2_w 2855712430699632037
      // 109: lload 7
      // 10b: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: iload 28
      // 112: aload 30
      // 114: checkcast com/zelix/x7
      // 117: aastore
      // 118: aload 6
      // 11a: aload 0
      // 11b: ldc2_w 2855712430699632037
      // 11e: lload 7
      // 120: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: iload 28
      // 127: aaload
      // 128: aload 0
      // 129: lload 10
      // 12b: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 12e: iload 23
      // 130: lload 7
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 1d6
      // 137: ifeq 1d1
      // 13a: goto 148
      // 13d: ldc2_w 4367284221411322390
      // 140: lload 7
      // 142: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: aload 0
      // 149: bipush 0
      // 14a: ldc2_w 2808548628973979871
      // 14d: lload 7
      // 14f: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: aload 0
      // 155: aload 24
      // 157: ldc2_w 2734342038598670293
      // 15a: lload 7
      // 15c: invokedynamic u (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: goto 16f
      // 164: ldc2_w 4367284221411322390
      // 167: lload 7
      // 169: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: aload 9
      // 171: new java/lang/StringBuilder
      // 174: dup
      // 175: invokespecial java/lang/StringBuilder.<init> ()V
      // 178: sipush 9248
      // 17b: ldc2_w 7097233712425797507
      // 17e: lload 7
      // 180: lxor
      // 181: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/b9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: aload 0
      // 18a: lload 19
      // 18c: invokevirtual com/zelix/b9.o (J)Ljava/lang/String;
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: sipush 2328
      // 195: ldc2_w 337620361132747449
      // 198: lload 7
      // 19a: lxor
      // 19b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/b9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: aload 0
      // 1a4: bipush 0
      // 1a5: anewarray 116
      // 1a8: ldc2_w 2673223489787238317
      // 1ab: lload 7
      // 1ad: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b5: sipush 22867
      // 1b8: ldc2_w 4990243411591690995
      // 1bb: lload 7
      // 1bd: lxor
      // 1be: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/b9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: iload 29
      // 1c8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ce: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1d1: iinc 28 1
      // 1d4: iload 23
      // 1d6: ifeq 0b5
      // 1d9: lload 7
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 29b
      // 1e0: aload 25
      // 1e2: lload 7
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: iflt 0be
      // 1e9: ifnull 29b
      // 1ec: aload 26
      // 1ee: ifnull 221
      // 1f1: goto 1ff
      // 1f4: ldc2_w 4367284221411322390
      // 1f7: lload 7
      // 1f9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: aload 25
      // 201: ldc2_w 2435924589871205915
      // 204: lload 7
      // 206: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: goto 29b
      // 20e: astore 27
      // 210: aload 26
      // 212: aload 27
      // 214: ldc2_w 2400366263406180425
      // 217: lload 7
      // 219: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: goto 29b
      // 221: aload 25
      // 223: ldc2_w 2435924589871205915
      // 226: lload 7
      // 228: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: goto 29b
      // 230: astore 27
      // 232: aload 27
      // 234: astore 26
      // 236: aload 27
      // 238: athrow
      // 239: astore 31
      // 23b: aload 25
      // 23d: ifnull 298
      // 240: aload 26
      // 242: ifnull 27e
      // 245: goto 253
      // 248: ldc2_w 4367284221411322390
      // 24b: lload 7
      // 24d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 25
      // 255: ldc2_w 2435924589871205915
      // 258: lload 7
      // 25a: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: goto 298
      // 262: astore 32
      // 264: aload 26
      // 266: lload 7
      // 268: lconst_0
      // 269: lcmp
      // 26a: iflt 29a
      // 26d: aload 32
      // 26f: ldc2_w 2400366263406180425
      // 272: lload 7
      // 274: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: iload 23
      // 27b: ifeq 298
      // 27e: aload 25
      // 280: ldc2_w 2435924589871205915
      // 283: lload 7
      // 285: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: goto 298
      // 28d: ldc2_w 4367284221411322390
      // 290: lload 7
      // 292: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: aload 31
      // 29a: athrow
      // 29b: aload 0
      // 29c: iload 23
      // 29e: ifne 2bd
      // 2a1: ldc2_w 2808548628973979871
      // 2a4: lload 7
      // 2a6: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: goto 2b9
      // 2ae: ldc2_w 4367284221411322390
      // 2b1: lload 7
      // 2b3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: ifeq 2e2
      // 2bc: aload 1
      // 2bd: checkcast com/zelix/hz
      // 2c0: lload 21
      // 2c2: bipush 1
      // 2c3: bipush 2
      // 2c4: anewarray 116
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2cc: bipush 1
      // 2cd: swap
      // 2ce: aastore
      // 2cf: dup_x2
      // 2d0: dup_x2
      // 2d1: pop
      // 2d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d5: bipush 0
      // 2d6: swap
      // 2d7: aastore
      // 2d8: ldc2_w 4423958590222817152
      // 2db: lload 7
      // 2dd: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: return
   }

   public int B(Object[] param1) {
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
      // 00e: checkcast com/zelix/_ue
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/b9.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 8925162911467
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 138482297045770
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 38899498830724
      // 02c: lxor
      // 02d: lstore 9
      // 02f: pop2
      // 030: ldc2_w 710962334243175833
      // 033: lload 3
      // 034: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: istore 11
      // 03b: aload 0
      // 03c: ldc2_w 1615900502968350794
      // 03f: lload 3
      // 040: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: iload 11
      // 047: ifne 18d
      // 04a: ifeq 182
      // 04d: goto 05a
      // 050: ldc2_w 868800241271954051
      // 053: lload 3
      // 054: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: new java/util/ArrayList
      // 05d: dup
      // 05e: aload 0
      // 05f: ldc2_w 1672150170557408560
      // 062: lload 3
      // 063: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: arraylength
      // 069: invokespecial java/util/ArrayList.<init> (I)V
      // 06c: astore 12
      // 06e: aload 0
      // 06f: ldc2_w 1672150170557408560
      // 072: lload 3
      // 073: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: astore 13
      // 07a: aload 13
      // 07c: arraylength
      // 07d: istore 14
      // 07f: bipush 0
      // 080: istore 15
      // 082: iload 15
      // 084: iload 14
      // 086: if_icmpge 124
      // 089: aload 13
      // 08b: lload 3
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 18c
      // 091: iload 15
      // 093: aaload
      // 094: astore 16
      // 096: aload 16
      // 098: lload 7
      // 09a: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 09d: lload 9
      // 09f: dup2_x1
      // 0a0: pop2
      // 0a1: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 0a4: astore 17
      // 0a6: iload 11
      // 0a8: ifne 182
      // 0ab: aload 17
      // 0ad: ifnull 105
      // 0b0: goto 0bd
      // 0b3: ldc2_w 868800241271954051
      // 0b6: lload 3
      // 0b7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 2
      // 0be: lload 5
      // 0c0: aload 17
      // 0c2: bipush 2
      // 0c3: anewarray 116
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 0
      // 0d2: swap
      // 0d3: aastore
      // 0d4: ldc2_w 641478452163550738
      // 0d7: lload 3
      // 0d8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: iload 11
      // 0df: ifne 11b
      // 0e2: goto 0ef
      // 0e5: ldc2_w 868800241271954051
      // 0e8: lload 3
      // 0e9: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: lload 3
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 121
      // 0f5: ifeq 11c
      // 0f8: goto 105
      // 0fb: ldc2_w 868800241271954051
      // 0fe: lload 3
      // 0ff: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 12
      // 107: aload 16
      // 109: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 10e: goto 11b
      // 111: ldc2_w 868800241271954051
      // 114: lload 3
      // 115: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: pop
      // 11c: iinc 15 1
      // 11f: iload 11
      // 121: ifeq 082
      // 124: aload 12
      // 126: invokeinterface java/util/List.size ()I 1
      // 12b: lload 3
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 18d
      // 131: iload 11
      // 133: lload 3
      // 134: lconst_0
      // 135: lcmp
      // 136: ifle 147
      // 139: ifne 18d
      // 13c: aload 0
      // 13d: ldc2_w 1672150170557408560
      // 140: lload 3
      // 141: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: arraylength
      // 147: if_icmpge 182
      // 14a: goto 157
      // 14d: ldc2_w 868800241271954051
      // 150: lload 3
      // 151: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: aload 12
      // 15a: aload 12
      // 15c: invokeinterface java/util/List.size ()I 1
      // 161: anewarray 237
      // 164: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 169: checkcast [Lcom/zelix/x7;
      // 16c: ldc2_w 1672150170557408560
      // 16f: lload 3
      // 170: invokedynamic p (Ljava/lang/Object;[Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: goto 182
      // 178: ldc2_w 868800241271954051
      // 17b: lload 3
      // 17c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 0
      // 183: ldc2_w 1672150170557408560
      // 186: lload 3
      // 187: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: arraylength
      // 18d: ireturn
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
      long var6 = (long)var2 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48;
      long var10001 = var6 ^ 0L;
      int var8 = (int)((var6 ^ 0L) >>> 48);
      int var9 = (int)((var6 ^ 0L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      super.b(var1, (short)var8, var3, var9, (short)var10);
   }

   public void h(Object[] param1) {
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
      // 0e: checkcast com/zelix/x7
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/x7
      // 19: astore 4
      // 1b: pop
      // 1c: ldc2_w 1401169644749333275
      // 1f: lload 2
      // 20: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: bipush 0
      // 26: istore 7
      // 28: istore 6
      // 2a: iload 7
      // 2c: aload 0
      // 2d: ldc2_w 1220453415689708267
      // 30: lload 2
      // 31: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: arraylength
      // 37: if_icmpge a6
      // 3a: aload 0
      // 3b: ldc2_w 1220453415689708267
      // 3e: lload 2
      // 3f: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: iload 7
      // 46: lload 2
      // 47: lconst_0
      // 48: lcmp
      // 49: ifle 7d
      // 4c: iload 6
      // 4e: ifeq 7d
      // 51: aaload
      // 52: aload 5
      // 54: if_acmpne 8b
      // 57: goto 64
      // 5a: ldc2_w 852826733580115288
      // 5d: lload 2
      // 5e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 0
      // 65: ldc2_w 1220453415689708267
      // 68: lload 2
      // 69: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: iload 7
      // 70: goto 7d
      // 73: ldc2_w 852826733580115288
      // 76: lload 2
      // 77: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 4
      // 7f: aastore
      // 80: iload 6
      // 82: lload 2
      // 83: lconst_0
      // 84: lcmp
      // 85: ifle 90
      // 88: ifne a6
      // 8b: iinc 7 1
      // 8e: iload 6
      // 90: ifne 2a
      // 93: lload 2
      // 94: lconst_0
      // 95: lcmp
      // 96: iflt 3a
      // 99: goto a6
      // 9c: ldc2_w 852826733580115288
      // 9f: lload 2
      // a0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 10727274753381L;
      boolean var10000 = x44.a<"w">(-6348162585463318644L, var1);
      var3.H(this.c, this, this.x(), var6);
      boolean var8 = var10000;

      for (x7 var12 : x44.a<"k">(this, -6595288046058842500L, var1)) {
         var12.O(var4, var3, this, this);
         if (!var8) {
            break;
         }
      }
   }

   public void O(Object[] param1) {
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
      // 1d: ldc2_w -7740090294292667137
      // 20: lload 2
      // 21: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: lload 5
      // 29: aload 4
      // 2b: bipush 2
      // 2c: anewarray 116
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
      // 3d: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 40: istore 7
      // 42: aload 0
      // 43: iload 7
      // 45: ifeq 7f
      // 48: ldc2_w -7614518121811986315
      // 4b: lload 2
      // 4c: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: ifeq db
      // 54: goto 61
      // 57: ldc2_w -8344745861848540484
      // 5a: lload 2
      // 5b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 4
      // 63: aload 0
      // 64: ldc2_w -7562753963976792817
      // 67: lload 2
      // 68: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: arraylength
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: aload 0
      // 72: goto 7f
      // 75: ldc2_w -8344745861848540484
      // 78: lload 2
      // 79: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: ldc2_w -7562753963976792817
      // 82: lload 2
      // 83: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: astore 8
      // 8a: aload 8
      // 8c: arraylength
      // 8d: istore 9
      // 8f: bipush 0
      // 90: istore 10
      // 92: iload 10
      // 94: iload 9
      // 96: if_icmpge d0
      // 99: aload 8
      // 9b: iload 10
      // 9d: aaload
      // 9e: astore 11
      // a0: aload 4
      // a2: aload 11
      // a4: invokevirtual com/zelix/x7.B ()I
      // a7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // aa: iinc 10 1
      // ad: iload 7
      // af: lload 2
      // b0: lconst_0
      // b1: lcmp
      // b2: ifle ba
      // b5: ifeq f7
      // b8: iload 7
      // ba: ifne 92
      // bd: lload 2
      // be: lconst_0
      // bf: lcmp
      // c0: ifle ad
      // c3: goto d0
      // c6: ldc2_w -8344745861848540484
      // c9: lload 2
      // ca: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: lload 2
      // d1: lconst_0
      // d2: lcmp
      // d3: ifle ea
      // d6: iload 7
      // d8: ifne f7
      // db: aload 4
      // dd: aload 0
      // de: ldc2_w -7685285436080527489
      // e1: lload 2
      // e2: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: invokevirtual java/io/DataOutputStream.write ([B)V
      // ea: goto f7
      // ed: ldc2_w -8344745861848540484
      // f0: lload 2
      // f1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f6: athrow
      // f7: return
   }

   int x(long var1) {
      int var3 = 2 + x44.a<"k">(this, 1319810517939249236L, var1).length * 2;
      x44.a<"o">(this, new Object[]{var3}, 1368298949984740814L, var1);
      return var3;
   }

   void i(Object[] var1) {
      int var7 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      HashMap var2 = (HashMap)var1[2];
      HashMap var5 = (HashMap)var1[3];
      long var3 = (Long)var1[4];
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
      // 04: checkcast java/util/HashSet
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/HashSet
      // 0f: astore 6
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/util/HashSet
      // 17: astore 2
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/util/HashSet
      // 1e: astore 5
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast java/lang/Long
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lstore 3
      // 2a: pop
      // 2b: getstatic com/zelix/b9.a J
      // 2e: lload 3
      // 2f: lxor
      // 30: lstore 3
      // 31: lload 3
      // 32: dup2
      // 33: ldc2_w 64370793779376
      // 36: lxor
      // 37: lstore 8
      // 39: dup2
      // 3a: ldc2_w 110060359178302
      // 3d: lxor
      // 3e: lstore 10
      // 40: pop2
      // 41: ldc2_w -7320707844915024349
      // 44: lload 3
      // 45: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: istore 12
      // 4c: aload 0
      // 4d: iload 12
      // 4f: ifne 79
      // 52: ldc2_w -8802686193258058768
      // 55: lload 3
      // 56: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: ifeq e4
      // 5e: goto 6b
      // 61: ldc2_w -6938676695195301575
      // 64: lload 3
      // 65: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: goto 79
      // 6f: ldc2_w -6938676695195301575
      // 72: lload 3
      // 73: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: ldc2_w -8894911896352885110
      // 7c: lload 3
      // 7d: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: astore 13
      // 84: aload 13
      // 86: arraylength
      // 87: istore 14
      // 89: bipush 0
      // 8a: istore 15
      // 8c: iload 15
      // 8e: iload 14
      // 90: if_icmpge e4
      // 93: aload 13
      // 95: iload 15
      // 97: aaload
      // 98: astore 16
      // 9a: aload 16
      // 9c: lload 8
      // 9e: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // a1: lload 10
      // a3: dup2_x1
      // a4: pop2
      // a5: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // a8: astore 17
      // aa: iload 12
      // ac: lload 3
      // ad: lconst_0
      // ae: lcmp
      // af: ifle e1
      // b2: ifne df
      // b5: aload 17
      // b7: ifnull dc
      // ba: goto c7
      // bd: ldc2_w -6938676695195301575
      // c0: lload 3
      // c1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: aload 6
      // c9: aload 17
      // cb: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // ce: pop
      // cf: goto dc
      // d2: ldc2_w -6938676695195301575
      // d5: lload 3
      // d6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: iinc 15 1
      // df: iload 12
      // e1: ifeq 8c
      // e4: return
   }

   static {
      long var0 = a ^ 102207987690572L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0090±¦Æv\u0095À\u008c¯/ïè©\u0010Â\u009a@p¨ÐÇ\u001e\u0084½\u0093\u0099<\\\u0087ÁN\u009eZïä¬©ª\u0098úÇmS%\u0015ùÄ\u009f\u0017t\u008er0Øi\u0088\u0003A\nÀô\u00883ÿë\u008b\u0083ñ÷·å\u0014³ÌS´³\u0013\\Ì\u0087\u0010:\u00adRîH¼Ç\u0003L?°¡:õ2ë";
      int var8 = "\u0090±¦Æv\u0095À\u008c¯/ïè©\u0010Â\u009a@p¨ÐÇ\u001e\u0084½\u0093\u0099<\\\u0087ÁN\u009eZïä¬©ª\u0098úÇmS%\u0015ùÄ\u009f\u0017t\u008er0Øi\u0088\u0003A\nÀô\u00883ÿë\u008b\u0083ñ÷·å\u0014³ÌS´³\u0013\\Ì\u0087\u0010:\u00adRîH¼Ç\u0003L?°¡:õ2ë"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2876;
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
            throw new RuntimeException("com/zelix/b9", var10);
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
         throw new RuntimeException("com/zelix/b9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
