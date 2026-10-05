package com.zelix;

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

public class fb extends fw {
   int s;
   private static final long a = ess.a(2251597673240911717L, -5133245538025055907L, MethodHandles.lookup().lookupClass()).a(181691180379546L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] k;
   private static final Integer[] l;
   private static final Map m;
   private static final long[] n;
   private static final Long[] p;
   private static final Map q;

   protected void Y(Object[] param1) {
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
      // 004: checkcast com/zelix/_ur
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
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 5
      // 033: pop
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 132123200400598
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 60601649508817
      // 040: lxor
      // 041: lstore 10
      // 043: pop2
      // 044: aload 6
      // 046: lload 10
      // 048: bipush 1
      // 049: anewarray 66
      // 04c: dup_x2
      // 04d: dup_x2
      // 04e: pop
      // 04f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 052: bipush 0
      // 053: swap
      // 054: aastore
      // 055: ldc2_w -8328464867790394533
      // 058: lload 3
      // 059: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: astore 13
      // 060: new java/lang/StringBuilder
      // 063: dup
      // 064: invokespecial java/lang/StringBuilder.<init> ()V
      // 067: lload 8
      // 069: bipush 1
      // 06a: anewarray 66
      // 06d: dup_x2
      // 06e: dup_x2
      // 06f: pop
      // 070: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073: bipush 0
      // 074: swap
      // 075: aastore
      // 076: ldc2_w -7664607665609041399
      // 079: lload 3
      // 07a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 082: sipush 7368
      // 085: ldc2_w 4584617944734832427
      // 088: lload 3
      // 089: lxor
      // 08a: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 092: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 095: astore 14
      // 097: aload 13
      // 099: aload 14
      // 09b: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 09e: ldc2_w -8065044532815547987
      // 0a1: lload 3
      // 0a2: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: ldc2_w -7588631005175905587
      // 0aa: lload 3
      // 0ab: invokedynamic n (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 14
      // 0b2: ldc2_w -8328637349100607116
      // 0b5: lload 3
      // 0b6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: ldc2_w -7730298338754884766
      // 0be: lload 3
      // 0bf: invokedynamic w (JJ)Ljava/lang/Runtime; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: astore 15
      // 0c6: aload 15
      // 0c8: ldc2_w -7631292644902544810
      // 0cb: lload 3
      // 0cc: invokedynamic o (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: aload 15
      // 0d3: ldc2_w -7559432341080864725
      // 0d6: lload 3
      // 0d7: invokedynamic o (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: lsub
      // 0dd: l2i
      // 0de: sipush 27297
      // 0e1: ldc2_w 4959647997720650203
      // 0e4: lload 3
      // 0e5: lxor
      // 0e6: invokedynamic p (IJ)I bsm=com/zelix/fb.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: idiv
      // 0ec: istore 16
      // 0ee: aload 15
      // 0f0: ldc2_w -8420228421299164699
      // 0f3: lload 3
      // 0f4: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: astore 12
      // 0fb: aload 6
      // 0fd: ldc2_w -8368757475082913201
      // 100: lload 3
      // 101: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: aload 12
      // 108: ifnonnull 16e
      // 10b: ifeq 164
      // 10e: goto 11b
      // 111: ldc2_w -8345067272251856034
      // 114: lload 3
      // 115: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 13
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: sipush 11906
      // 127: ldc2_w 8149102241944151396
      // 12a: lload 3
      // 12b: lxor
      // 12c: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: ldc2_w -8468084995669383415
      // 138: lload 3
      // 139: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 141: sipush 12797
      // 144: ldc2_w 1951505084228188696
      // 147: lload 3
      // 148: lxor
      // 149: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 154: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 157: goto 164
      // 15a: ldc2_w -8345067272251856034
      // 15d: lload 3
      // 15e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 0
      // 165: ldc2_w -8468084995669383415
      // 168: lload 3
      // 169: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: i2l
      // 16f: ldc2_w -8436918081122250110
      // 172: lload 3
      // 173: invokedynamic w (JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: goto 17d
      // 17b: astore 17
      // 17d: aload 15
      // 17f: ldc2_w -7631292644902544810
      // 182: lload 3
      // 183: invokedynamic o (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: aload 15
      // 18a: ldc2_w -7559432341080864725
      // 18d: lload 3
      // 18e: invokedynamic o (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: lsub
      // 194: l2i
      // 195: sipush 16723
      // 198: ldc2_w 1928287317300202026
      // 19b: lload 3
      // 19c: lxor
      // 19d: invokedynamic p (IJ)I bsm=com/zelix/fb.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: idiv
      // 1a3: istore 17
      // 1a5: aload 15
      // 1a7: ldc2_w -7607273668219766477
      // 1aa: lload 3
      // 1ab: invokedynamic o (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: lstore 18
      // 1b2: aload 12
      // 1b4: lload 3
      // 1b5: lconst_0
      // 1b6: lcmp
      // 1b7: iflt 266
      // 1ba: ifnonnull 25e
      // 1bd: lload 18
      // 1bf: sipush 7440
      // 1c2: ldc2_w 4160802664111748301
      // 1c5: lload 3
      // 1c6: lxor
      // 1c7: invokedynamic q (IJ)J bsm=com/zelix/fb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: lcmp
      // 1cd: ifle 269
      // 1d0: goto 1dd
      // 1d3: ldc2_w -8345067272251856034
      // 1d6: lload 3
      // 1d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 13
      // 1df: new java/lang/StringBuilder
      // 1e2: dup
      // 1e3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e6: sipush 30663
      // 1e9: ldc2_w 8479876058327776296
      // 1ec: lload 3
      // 1ed: lxor
      // 1ee: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: lload 18
      // 1f8: sipush 31363
      // 1fb: ldc2_w 5118274007417344863
      // 1fe: lload 3
      // 1ff: lxor
      // 200: invokedynamic q (IJ)J bsm=com/zelix/fb.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: ldiv
      // 206: ldc2_w -8242554536331419691
      // 209: lload 3
      // 20a: invokedynamic o (Ljava/lang/Object;JJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: sipush 26889
      // 212: ldc2_w 3412327745086087911
      // 215: lload 3
      // 216: lxor
      // 217: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: iload 17
      // 221: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 224: sipush 18957
      // 227: ldc2_w 4736677929381478892
      // 22a: lload 3
      // 22b: lxor
      // 22c: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: iload 17
      // 236: iload 16
      // 238: isub
      // 239: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 23c: bipush 117
      // 23e: ldc2_w 2449310906623724439
      // 241: lload 3
      // 242: lxor
      // 243: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24e: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 251: goto 25e
      // 254: ldc2_w -8345067272251856034
      // 257: lload 3
      // 258: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: athrow
      // 25e: lload 3
      // 25f: lconst_0
      // 260: lcmp
      // 261: iflt 2aa
      // 264: aload 12
      // 266: ifnull 2b7
      // 269: aload 13
      // 26b: new java/lang/StringBuilder
      // 26e: dup
      // 26f: invokespecial java/lang/StringBuilder.<init> ()V
      // 272: ldc "\t"
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: iload 17
      // 279: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 27c: sipush 10743
      // 27f: ldc2_w 559104896093069843
      // 282: lload 3
      // 283: lxor
      // 284: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28c: iload 17
      // 28e: iload 16
      // 290: isub
      // 291: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 294: sipush 14614
      // 297: ldc2_w 2547600337308791542
      // 29a: lload 3
      // 29b: lxor
      // 29c: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/fb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a7: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2aa: goto 2b7
      // 2ad: ldc2_w -8345067272251856034
      // 2b0: lload 3
      // 2b1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: return
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"f">(21262, 4298266958038684330L ^ var2);
   }

   public void t(Object[] param1) {
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
      // 00e: checkcast com/zelix/_za
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 0
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 114633185681979
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 29791420647726
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 1445808893670
      // 035: lxor
      // 036: lstore 12
      // 038: dup2
      // 039: ldc2_w 134528422017690
      // 03c: lxor
      // 03d: lstore 14
      // 03f: dup2
      // 040: ldc2_w 80521838856410
      // 043: lxor
      // 044: lstore 16
      // 046: pop2
      // 047: ldc2_w 9148277501292601163
      // 04a: lload 3
      // 04b: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: aload 0
      // 051: lload 14
      // 053: bipush 1
      // 054: anewarray 66
      // 057: dup_x2
      // 058: dup_x2
      // 059: pop
      // 05a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w 7145691849331111744
      // 063: lload 3
      // 064: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: istore 19
      // 06b: astore 18
      // 06d: aload 2
      // 06e: lload 16
      // 070: bipush 1
      // 071: anewarray 66
      // 074: dup_x2
      // 075: dup_x2
      // 076: pop
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: ldc2_w 8706655031326303606
      // 080: lload 3
      // 081: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: istore 20
      // 088: aload 2
      // 089: lload 8
      // 08b: bipush 1
      // 08c: anewarray 66
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: ldc2_w 7309659849235451010
      // 09b: lload 3
      // 09c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: istore 21
      // 0a3: aload 2
      // 0a4: lload 10
      // 0a6: bipush 1
      // 0a7: anewarray 66
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w 7191208742915394367
      // 0b6: lload 3
      // 0b7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: istore 22
      // 0be: iload 19
      // 0c0: bipush 1
      // 0c1: if_icmpne 184
      // 0c4: aload 0
      // 0c5: bipush 0
      // 0c6: invokevirtual com/zelix/fb.e (I)Lcom/zelix/_za;
      // 0c9: checkcast com/zelix/gk
      // 0cc: astore 23
      // 0ce: aload 23
      // 0d0: lload 6
      // 0d2: aload 0
      // 0d3: aload 2
      // 0d4: bipush 3
      // 0d5: anewarray 66
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: bipush 2
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 1
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x2
      // 0e3: dup_x2
      // 0e4: pop
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: bipush 0
      // 0e9: swap
      // 0ea: aastore
      // 0eb: ldc2_w 8685215943301595427
      // 0ee: lload 3
      // 0ef: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: aload 23
      // 0f6: bipush 0
      // 0f7: anewarray 66
      // 0fa: ldc2_w 7328816409459435145
      // 0fd: lload 3
      // 0fe: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: astore 24
      // 105: aload 0
      // 106: aload 24
      // 108: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 10b: ldc2_w 7250039895213951471
      // 10e: lload 3
      // 10f: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: goto 179
      // 117: astore 25
      // 119: aload 0
      // 11a: sipush 428
      // 11d: ldc2_w 4836159822205412402
      // 120: lload 3
      // 121: lxor
      // 122: invokedynamic p (IJ)I bsm=com/zelix/fb.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: ldc2_w 7250039895213951471
      // 12a: lload 3
      // 12b: lload 3
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 174
      // 131: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: aload 0
      // 137: aload 18
      // 139: ifnonnull 163
      // 13c: ldc2_w 7250039895213951471
      // 13f: lload 3
      // 140: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: ifge 179
      // 148: goto 155
      // 14b: ldc2_w 7121981939394561464
      // 14e: lload 3
      // 14f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 0
      // 156: goto 163
      // 159: ldc2_w 7121981939394561464
      // 15c: lload 3
      // 15d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: sipush 19877
      // 166: ldc2_w 811728800446490680
      // 169: lload 3
      // 16a: lxor
      // 16b: invokedynamic p (IJ)I bsm=com/zelix/fb.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: ldc2_w 7250039895213951471
      // 173: lload 3
      // 174: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: lload 3
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: iflt 1e5
      // 17f: aload 18
      // 181: ifnull 1a8
      // 184: aload 0
      // 185: sipush 19877
      // 188: ldc2_w 811728800446490680
      // 18b: lload 3
      // 18c: lxor
      // 18d: invokedynamic p (IJ)I bsm=com/zelix/fb.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: ldc2_w 7250039895213951471
      // 195: lload 3
      // 196: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: goto 1a8
      // 19e: ldc2_w 7121981939394561464
      // 1a1: lload 3
      // 1a2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: aload 2
      // 1aa: iload 20
      // 1ac: iload 21
      // 1ae: lload 12
      // 1b0: iload 22
      // 1b2: bipush 5
      // 1b3: anewarray 66
      // 1b6: dup_x1
      // 1b7: swap
      // 1b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1bb: bipush 4
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 3
      // 1c5: swap
      // 1c6: aastore
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cc: bipush 2
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: bipush 1
      // 1d5: swap
      // 1d6: aastore
      // 1d7: dup_x1
      // 1d8: swap
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: ldc2_w 8657577667673724898
      // 1df: lload 3
      // 1e0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: return
   }

   public fb(long var1, int var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 114922120935344L;
      int var4 = (int)((var1 ^ 114922120935344L) >>> 48);
      int var5 = (int)((var1 ^ 114922120935344L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      super((short)var4, (char)var5, var3, var6);
   }

   static {
      long var22 = a ^ 18450487138043L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[10];
      int var29 = 0;
      String var28 = "H\u0093\u0000\u0019gaÙ\u0001SÊø¨Þç\u0082P5¢\u001d(\u009e±t\u0096\u0010\u008a^\u0011  K\u0003/\u008bâr\u001a\u0086ÕúÕ(\u0097\u0014Çy\u0085n¼yùH.\u009aá+¶\u0007·~\u0004²ôÁ\u008d\u0083X²Oñ)\rwLîÝ©Îæ\u0004í\u0014 \u008bA~\u001fðp\u001ddT\u007f\u0088\u0087%\u0084\\%c,î¿òvø!\u0089?Pz\u000b\u0012\u0097\u0089\u0010&µK»Õão=\u0086Ò7/÷Õ;û0:Îgíï\u0007Û0N\u008dðYd¥\u007f1µj{\u0098\u008füXöI\u009cñ°q\u0087æ\u007f>XÌÞUóA5ê°Z{\u008dæü\u0012\u0010ú4éËþ_\u0006óJ@ä¿\u00012\u0090W(:IÈÒ\fa;6Û$8\u008egF¡Þ\u0001\u008f%¿/ÆX\u0015\u0000¹\u0004\ffkzå/èv\u0000óY`Ò";
      int var30 = "H\u0093\u0000\u0019gaÙ\u0001SÊø¨Þç\u0082P5¢\u001d(\u009e±t\u0096\u0010\u008a^\u0011  K\u0003/\u008bâr\u001a\u0086ÕúÕ(\u0097\u0014Çy\u0085n¼yùH.\u009aá+¶\u0007·~\u0004²ôÁ\u008d\u0083X²Oñ)\rwLîÝ©Îæ\u0004í\u0014 \u008bA~\u001fðp\u001ddT\u007f\u0088\u0087%\u0084\\%c,î¿òvø!\u0089?Pz\u000b\u0012\u0097\u0089\u0010&µK»Õão=\u0086Ò7/÷Õ;û0:Îgíï\u0007Û0N\u008dðYd¥\u007f1µj{\u0098\u008füXöI\u009cñ°q\u0087æ\u007f>XÌÞUóA5ê°Z{\u008dæü\u0012\u0010ú4éËþ_\u0006óJ@ä¿\u00012\u0090W(:IÈÒ\fa;6Û$8\u008egF¡Þ\u0001\u008f%¿/ÆX\u0015\u0000¹\u0004\ffkzå/èv\u0000óY`Ò"
         .length();
      char var27 = 24;
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = c(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     c = var31;
                     d = new String[10];
                     m = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[4];
                     int var14 = 0;
                     String var15 = "(PÙ\u009dã|OªÒ\u0081¨ÐëI2\u0092";
                     int var16 = "(PÙ\u009dã|OªÒ\u0081¨ÐëI2\u0092".length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var54 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while (true) {
                           long var19 = var54;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)((int)(var19 >>> 56)),
                                 (byte)((int)(var19 >>> 48)),
                                 (byte)((int)(var19 >>> 40)),
                                 (byte)((int)(var19 >>> 32)),
                                 (byte)((int)(var19 >>> 24)),
                                 (byte)((int)(var19 >>> 16)),
                                 (byte)((int)(var19 >>> 8)),
                                 (byte)((int)var19)
                              }
                           );
                           long var62 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    k = var17;
                                    l = new Integer[4];
                                    q = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "5ìå\u001bÖ±*\u0004\u009e\u000eµ\u0093\u0011]Ð\u0086";
                                    int var5 = "5ìå\u001bÖ±*\u0004\u009e\u000eµ\u0093\u0011]Ð\u0086".length();
                                    byte var2 = 0;

                                    do {
                                       int var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       var47 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
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
                                       var62 = ((long)var10[0] & 255L) << 56
                                          | ((long)var10[1] & 255L) << 48
                                          | ((long)var10[2] & 255L) << 40
                                          | ((long)var10[3] & 255L) << 32
                                          | ((long)var10[4] & 255L) << 24
                                          | ((long)var10[5] & 255L) << 16
                                          | ((long)var10[6] & 255L) << 8
                                          | (long)var10[7] & 255L;
                                       byte var61 = -1;
                                       var6[var47] = var62;
                                    } while (var2 < var5);

                                    n = var6;
                                    p = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "ê\u0084\u0012è\u001fuz^ÆyIsæw\u0087\u001e";
                                 var16 = "ê\u0084\u0012è\u001fuz^ÆyIsæw\u0087\u001e".length();
                                 var13 = 0;
                           }

                           byte var46 = var13;
                           var13 += 8;
                           var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var54 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = "¿f\u0091ióñ#¦N`\u0006È`¡Ñþ(û\u0004¯JÍëâ\u001cÊ\u0093\u0011·`_À3\u001a\u0092¦\u0016èÞh\u008fQn\u008ff\u0011ÊÒÌTæ\u0095HåÆfå";
                  var30 = "¿f\u0091ióñ#¦N`\u0006È`¡Ñþ(û\u0004¯JÍëâ\u001cÊ\u0093\u0011·`_À3\u001a\u0092¦\u0016èÞh\u008fQn\u008ff\u0011ÊÒÌTæ\u0095HåÆfå".length();
                  var27 = 16;
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4650;
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
            throw new RuntimeException("com/zelix/fb", var10);
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
         throw new RuntimeException("com/zelix/fb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4789;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/fb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("com/zelix/fb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12305;
      if (p[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/fb", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         p[var3] = var15;
      }

      return p[var3];
   }

   private static long d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = d(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/fb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
