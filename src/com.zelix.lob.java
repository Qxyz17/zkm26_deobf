package com.zelix;

import java.io.Reader;
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

public class lob {
   protected boolean w;
   protected int L;
   protected int y;
   protected int[] v;
   int W;
   protected int[] V;
   int k;
   protected int b;
   protected boolean R;
   protected int X;
   int i;
   public int o;
   protected Reader I;
   protected char[] t;
   protected int s;
   private static final long a = prr.a(-4576473966580846800L, 2259959811861740696L, MethodHandles.lookup().lookupClass()).a(262276355494584L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   public char d(Object[] param1) {
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
      // 00c: getstatic com/zelix/lob.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 8978360151409
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 603623231639
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w 176935645334458700
      // 025: lload 2
      // 026: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 8
      // 02d: aload 0
      // 02e: ldc2_w 1889031438968178580
      // 031: lload 2
      // 032: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: iload 8
      // 039: ifne 0c6
      // 03c: ifle 0bb
      // 03f: goto 04c
      // 042: ldc2_w 199287762109417676
      // 045: lload 2
      // 046: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: aload 0
      // 04d: dup
      // 04e: ldc2_w 1889031438968178580
      // 051: lload 2
      // 052: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: bipush 1
      // 058: isub
      // 059: ldc2_w 1889031438968178580
      // 05c: lload 2
      // 05d: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 0
      // 063: dup
      // 064: getfield com/zelix/lob.o I
      // 067: bipush 1
      // 068: iadd
      // 069: dup_x1
      // 06a: putfield com/zelix/lob.o I
      // 06d: iload 8
      // 06f: ifne 0ba
      // 072: goto 07f
      // 075: ldc2_w 199287762109417676
      // 078: lload 2
      // 079: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: ldc2_w 415441654599437579
      // 083: lload 2
      // 084: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: if_icmpne 0ab
      // 08c: goto 099
      // 08f: ldc2_w 199287762109417676
      // 092: lload 2
      // 093: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: bipush 0
      // 09b: putfield com/zelix/lob.o I
      // 09e: goto 0ab
      // 0a1: ldc2_w 199287762109417676
      // 0a4: lload 2
      // 0a5: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: ldc2_w 234287840525203223
      // 0af: lload 2
      // 0b0: invokedynamic t (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 0
      // 0b6: getfield com/zelix/lob.o I
      // 0b9: caload
      // 0ba: ireturn
      // 0bb: aload 0
      // 0bc: dup
      // 0bd: getfield com/zelix/lob.o I
      // 0c0: bipush 1
      // 0c1: iadd
      // 0c2: dup_x1
      // 0c3: putfield com/zelix/lob.o I
      // 0c6: iload 8
      // 0c8: lload 2
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 0db
      // 0ce: ifne 120
      // 0d1: aload 0
      // 0d2: ldc2_w 248329401689853705
      // 0d5: lload 2
      // 0d6: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: if_icmplt 111
      // 0de: goto 0eb
      // 0e1: ldc2_w 199287762109417676
      // 0e4: lload 2
      // 0e5: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: lload 6
      // 0ee: bipush 1
      // 0ef: anewarray 148
      // 0f2: dup_x2
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w 1786362624335676256
      // 0fe: lload 2
      // 0ff: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: goto 111
      // 107: ldc2_w 199287762109417676
      // 10a: lload 2
      // 10b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w 234287840525203223
      // 115: lload 2
      // 116: invokedynamic t (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: aload 0
      // 11c: getfield com/zelix/lob.o I
      // 11f: caload
      // 120: istore 9
      // 122: aload 0
      // 123: lload 4
      // 125: iload 9
      // 127: bipush 2
      // 128: anewarray 148
      // 12b: dup_x1
      // 12c: swap
      // 12d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 130: bipush 1
      // 131: swap
      // 132: aastore
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 0
      // 13a: swap
      // 13b: aastore
      // 13c: ldc2_w 266813452115723340
      // 13f: lload 2
      // 140: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: iload 9
      // 147: ireturn
   }

   protected void P(Object[] param1) {
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
      // 017: getstatic com/zelix/lob.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w -340898324384220286
      // 020: lload 2
      // 021: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 0
      // 027: dup
      // 028: ldc2_w -1835770178030233069
      // 02b: lload 2
      // 02c: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: bipush 1
      // 032: iadd
      // 033: ldc2_w -1835770178030233069
      // 036: lload 2
      // 037: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: istore 5
      // 03e: aload 0
      // 03f: ldc2_w -146446531156354895
      // 042: lload 2
      // 043: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: iload 5
      // 04a: ifeq 0b2
      // 04d: ifeq 09b
      // 050: goto 05d
      // 053: ldc2_w -2039506806546454086
      // 056: lload 2
      // 057: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 0
      // 05e: bipush 0
      // 05f: ldc2_w -146446531156354895
      // 062: lload 2
      // 063: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 0
      // 069: dup
      // 06a: ldc2_w -210345680615858944
      // 06d: lload 2
      // 06e: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 0
      // 074: bipush 1
      // 075: dup_x1
      // 076: ldc2_w -1835770178030233069
      // 079: lload 2
      // 07a: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: iadd
      // 080: ldc2_w -210345680615858944
      // 083: lload 2
      // 084: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 5
      // 08b: ifne 15a
      // 08e: goto 09b
      // 091: ldc2_w -2039506806546454086
      // 094: lload 2
      // 095: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: ldc2_w -299999731249872251
      // 09f: lload 2
      // 0a0: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: goto 0b2
      // 0a8: ldc2_w -2039506806546454086
      // 0ab: lload 2
      // 0ac: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 15c
      // 0b8: iload 5
      // 0ba: ifeq 15c
      // 0bd: ifeq 15a
      // 0c0: goto 0cd
      // 0c3: ldc2_w -2039506806546454086
      // 0c6: lload 2
      // 0c7: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: bipush 0
      // 0cf: iload 5
      // 0d1: ifeq 151
      // 0d4: goto 0e1
      // 0d7: ldc2_w -2039506806546454086
      // 0da: lload 2
      // 0db: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 144
      // 0e7: ldc2_w -299999731249872251
      // 0ea: lload 2
      // 0eb: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iload 4
      // 0f2: sipush 13114
      // 0f5: ldc2_w 1249137208920744514
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: if_icmpne 12c
      // 102: goto 10f
      // 105: ldc2_w -2039506806546454086
      // 108: lload 2
      // 109: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: bipush 1
      // 111: ldc2_w -146446531156354895
      // 114: lload 2
      // 115: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: iload 5
      // 11c: ifne 15a
      // 11f: goto 12c
      // 122: ldc2_w -2039506806546454086
      // 125: lload 2
      // 126: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 0
      // 12d: dup
      // 12e: ldc2_w -210345680615858944
      // 131: lload 2
      // 132: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 0
      // 138: bipush 1
      // 139: dup_x1
      // 13a: ldc2_w -1835770178030233069
      // 13d: lload 2
      // 13e: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: iadd
      // 144: goto 151
      // 147: ldc2_w -2039506806546454086
      // 14a: lload 2
      // 14b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: ldc2_w -210345680615858944
      // 154: lload 2
      // 155: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: iload 4
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 197
      // 162: tableswitch 192 9 13 104 69 192 192 34
      // 184: aload 0
      // 185: bipush 1
      // 186: ldc2_w -299999731249872251
      // 189: lload 2
      // 18a: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: lload 2
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 254
      // 195: iload 5
      // 197: ifne 222
      // 19a: goto 1a7
      // 19d: ldc2_w -2039506806546454086
      // 1a0: lload 2
      // 1a1: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: bipush 1
      // 1a9: ldc2_w -146446531156354895
      // 1ac: lload 2
      // 1ad: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: lload 2
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 254
      // 1b8: iload 5
      // 1ba: ifne 222
      // 1bd: goto 1ca
      // 1c0: ldc2_w -2039506806546454086
      // 1c3: lload 2
      // 1c4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: dup
      // 1cc: ldc2_w -1835770178030233069
      // 1cf: lload 2
      // 1d0: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: bipush 1
      // 1d6: isub
      // 1d7: ldc2_w -1835770178030233069
      // 1da: lload 2
      // 1db: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: aload 0
      // 1e1: dup
      // 1e2: ldc2_w -1835770178030233069
      // 1e5: lload 2
      // 1e6: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: aload 0
      // 1ec: ldc2_w -539265799971353115
      // 1ef: lload 2
      // 1f0: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: aload 0
      // 1f6: ldc2_w -1835770178030233069
      // 1f9: lload 2
      // 1fa: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: aload 0
      // 200: ldc2_w -539265799971353115
      // 203: lload 2
      // 204: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: irem
      // 20a: isub
      // 20b: iadd
      // 20c: ldc2_w -1835770178030233069
      // 20f: lload 2
      // 210: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: goto 222
      // 218: ldc2_w -2039506806546454086
      // 21b: lload 2
      // 21c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 0
      // 223: ldc2_w -213536235974754171
      // 226: lload 2
      // 227: invokedynamic r (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 0
      // 22d: getfield com/zelix/lob.o I
      // 230: aload 0
      // 231: ldc2_w -210345680615858944
      // 234: lload 2
      // 235: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: iastore
      // 23b: aload 0
      // 23c: ldc2_w -405770059272960634
      // 23f: lload 2
      // 240: invokedynamic r (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: aload 0
      // 246: getfield com/zelix/lob.o I
      // 249: aload 0
      // 24a: ldc2_w -1835770178030233069
      // 24d: lload 2
      // 24e: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: iastore
      // 254: return
   }

   protected void e(Object[] param1) {
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
      // 00e: checkcast java/lang/Boolean
      // 011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/lob.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: ldc2_w 8797779483876174127
      // 020: lload 2
      // 021: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 0
      // 027: ldc2_w 9052400315527574888
      // 02a: lload 2
      // 02b: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: sipush 15271
      // 033: ldc2_w 3339092750385198027
      // 036: lload 2
      // 037: lxor
      // 038: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: iadd
      // 03e: newarray 5
      // 040: astore 6
      // 042: istore 5
      // 044: aload 0
      // 045: ldc2_w 9052400315527574888
      // 048: lload 2
      // 049: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: sipush 22637
      // 051: ldc2_w 3860053170589880323
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: iadd
      // 05c: newarray 10
      // 05e: astore 7
      // 060: aload 0
      // 061: ldc2_w 9052400315527574888
      // 064: lload 2
      // 065: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: sipush 22637
      // 06d: ldc2_w 3860053170589880323
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iadd
      // 078: newarray 10
      // 07a: astore 8
      // 07c: iload 5
      // 07e: ifne 2b8
      // 081: iload 4
      // 083: ifeq 1fa
      // 086: goto 093
      // 089: ldc2_w 8838143784961585327
      // 08c: lload 2
      // 08d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 0
      // 094: ldc2_w 8873002037111541620
      // 097: lload 2
      // 098: invokedynamic w (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 0
      // 09e: ldc2_w 9088444470175373312
      // 0a1: lload 2
      // 0a2: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aload 6
      // 0a9: bipush 0
      // 0aa: aload 0
      // 0ab: ldc2_w 9052400315527574888
      // 0ae: lload 2
      // 0af: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 0
      // 0b5: ldc2_w 9088444470175373312
      // 0b8: lload 2
      // 0b9: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: isub
      // 0bf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c2: aload 0
      // 0c3: ldc2_w 8873002037111541620
      // 0c6: lload 2
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: bipush 0
      // 0cd: aload 6
      // 0cf: aload 0
      // 0d0: ldc2_w 9052400315527574888
      // 0d3: lload 2
      // 0d4: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: aload 0
      // 0da: ldc2_w 9088444470175373312
      // 0dd: lload 2
      // 0de: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: isub
      // 0e4: aload 0
      // 0e5: getfield com/zelix/lob.o I
      // 0e8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0eb: aload 0
      // 0ec: aload 6
      // 0ee: ldc2_w 8873002037111541620
      // 0f1: lload 2
      // 0f2: invokedynamic u (Ljava/lang/Object;[CJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: aload 0
      // 0f8: ldc2_w 7213656388004059536
      // 0fb: lload 2
      // 0fc: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: aload 0
      // 102: ldc2_w 9088444470175373312
      // 105: lload 2
      // 106: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: aload 7
      // 10d: bipush 0
      // 10e: aload 0
      // 10f: ldc2_w 9052400315527574888
      // 112: lload 2
      // 113: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: aload 0
      // 119: ldc2_w 9088444470175373312
      // 11c: lload 2
      // 11d: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: isub
      // 123: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 126: aload 0
      // 127: ldc2_w 7213656388004059536
      // 12a: lload 2
      // 12b: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: bipush 0
      // 131: aload 7
      // 133: aload 0
      // 134: ldc2_w 9052400315527574888
      // 137: lload 2
      // 138: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: aload 0
      // 13e: ldc2_w 9088444470175373312
      // 141: lload 2
      // 142: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: isub
      // 148: aload 0
      // 149: getfield com/zelix/lob.o I
      // 14c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 14f: aload 0
      // 150: aload 7
      // 152: ldc2_w 7213656388004059536
      // 155: lload 2
      // 156: invokedynamic u (Ljava/lang/Object;[IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 0
      // 15c: ldc2_w 7154876104727288979
      // 15f: lload 2
      // 160: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: aload 0
      // 166: ldc2_w 9088444470175373312
      // 169: lload 2
      // 16a: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: aload 8
      // 171: bipush 0
      // 172: aload 0
      // 173: ldc2_w 9052400315527574888
      // 176: lload 2
      // 177: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: aload 0
      // 17d: ldc2_w 9088444470175373312
      // 180: lload 2
      // 181: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: isub
      // 187: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 18a: aload 0
      // 18b: ldc2_w 7154876104727288979
      // 18e: lload 2
      // 18f: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: bipush 0
      // 195: aload 8
      // 197: aload 0
      // 198: ldc2_w 9052400315527574888
      // 19b: lload 2
      // 19c: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: aload 0
      // 1a2: ldc2_w 9088444470175373312
      // 1a5: lload 2
      // 1a6: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: isub
      // 1ac: aload 0
      // 1ad: getfield com/zelix/lob.o I
      // 1b0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1b3: aload 0
      // 1b4: aload 8
      // 1b6: ldc2_w 7154876104727288979
      // 1b9: lload 2
      // 1ba: invokedynamic u (Ljava/lang/Object;[IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: aload 0
      // 1c0: aload 0
      // 1c1: dup
      // 1c2: getfield com/zelix/lob.o I
      // 1c5: aload 0
      // 1c6: ldc2_w 9052400315527574888
      // 1c9: lload 2
      // 1ca: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: aload 0
      // 1d0: ldc2_w 9088444470175373312
      // 1d3: lload 2
      // 1d4: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: isub
      // 1da: iadd
      // 1db: dup_x1
      // 1dc: putfield com/zelix/lob.o I
      // 1df: ldc2_w 8867967674998142826
      // 1e2: lload 2
      // 1e3: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: iload 5
      // 1ea: ifeq 2d6
      // 1ed: goto 1fa
      // 1f0: ldc2_w 8838143784961585327
      // 1f3: lload 2
      // 1f4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: ldc2_w 8873002037111541620
      // 1fe: lload 2
      // 1ff: invokedynamic w (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: aload 0
      // 205: ldc2_w 9088444470175373312
      // 208: lload 2
      // 209: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: aload 6
      // 210: bipush 0
      // 211: aload 0
      // 212: ldc2_w 9052400315527574888
      // 215: lload 2
      // 216: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 0
      // 21c: ldc2_w 9088444470175373312
      // 21f: lload 2
      // 220: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: isub
      // 226: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 229: aload 0
      // 22a: aload 6
      // 22c: ldc2_w 8873002037111541620
      // 22f: lload 2
      // 230: invokedynamic u (Ljava/lang/Object;[CJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: aload 0
      // 236: ldc2_w 7213656388004059536
      // 239: lload 2
      // 23a: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: aload 0
      // 240: ldc2_w 9088444470175373312
      // 243: lload 2
      // 244: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: aload 7
      // 24b: bipush 0
      // 24c: aload 0
      // 24d: ldc2_w 9052400315527574888
      // 250: lload 2
      // 251: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: aload 0
      // 257: ldc2_w 9088444470175373312
      // 25a: lload 2
      // 25b: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: isub
      // 261: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 264: aload 0
      // 265: aload 7
      // 267: ldc2_w 7213656388004059536
      // 26a: lload 2
      // 26b: invokedynamic u (Ljava/lang/Object;[IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: aload 0
      // 271: ldc2_w 7154876104727288979
      // 274: lload 2
      // 275: invokedynamic w (Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: aload 0
      // 27b: ldc2_w 9088444470175373312
      // 27e: lload 2
      // 27f: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: aload 8
      // 286: bipush 0
      // 287: aload 0
      // 288: ldc2_w 9052400315527574888
      // 28b: lload 2
      // 28c: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: aload 0
      // 292: ldc2_w 9088444470175373312
      // 295: lload 2
      // 296: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: isub
      // 29c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 29f: aload 0
      // 2a0: aload 8
      // 2a2: ldc2_w 7154876104727288979
      // 2a5: lload 2
      // 2a6: invokedynamic u (Ljava/lang/Object;[IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: goto 2b8
      // 2ae: ldc2_w 8838143784961585327
      // 2b1: lload 2
      // 2b2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: aload 0
      // 2ba: dup
      // 2bb: getfield com/zelix/lob.o I
      // 2be: aload 0
      // 2bf: ldc2_w 9088444470175373312
      // 2c2: lload 2
      // 2c3: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: isub
      // 2c9: dup_x1
      // 2ca: putfield com/zelix/lob.o I
      // 2cd: ldc2_w 8867967674998142826
      // 2d0: lload 2
      // 2d1: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: goto 2ee
      // 2d9: astore 9
      // 2db: new java/lang/Error
      // 2de: dup
      // 2df: aload 9
      // 2e1: ldc2_w 7315298740620514308
      // 2e4: lload 2
      // 2e5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: dup
      // 2f0: ldc2_w 9052400315527574888
      // 2f3: lload 2
      // 2f4: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: sipush 22637
      // 2fc: ldc2_w 3860053170589880323
      // 2ff: lload 2
      // 300: lxor
      // 301: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: iadd
      // 307: ldc2_w 9052400315527574888
      // 30a: lload 2
      // 30b: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: aload 0
      // 311: aload 0
      // 312: ldc2_w 9052400315527574888
      // 315: lload 2
      // 316: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: ldc2_w 8991788515249261466
      // 31e: lload 2
      // 31f: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 324: aload 0
      // 325: bipush 0
      // 326: ldc2_w 9088444470175373312
      // 329: lload 2
      // 32a: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: return
   }

   public lob(Reader var1, int var2, int var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 33575276705680L;
      this(var6, var1, var2, var3, a<"l">(5079, 6678716230234365604L ^ var4));
   }

   protected void J(Object[] param1) {
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
      // 00c: getstatic com/zelix/lob.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 11059782961069
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 113624674003188
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -4133483804234529180
      // 025: lload 2
      // 026: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 8
      // 02d: aload 0
      // 02e: ldc2_w -2314284423432268903
      // 031: lload 2
      // 032: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 0
      // 038: ldc2_w -2865948482413383831
      // 03b: lload 2
      // 03c: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: iload 8
      // 043: ifeq 2f7
      // 046: if_icmpne 2ba
      // 049: goto 056
      // 04c: ldc2_w -2426243949367225252
      // 04f: lload 2
      // 050: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 0
      // 057: ldc2_w -2865948482413383831
      // 05a: lload 2
      // 05b: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 0
      // 061: ldc2_w -2786658165744791141
      // 064: lload 2
      // 065: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: iload 8
      // 06c: lload 2
      // 06d: lconst_0
      // 06e: lcmp
      // 06f: iflt 1d6
      // 072: ifeq 1ce
      // 075: goto 082
      // 078: ldc2_w -2426243949367225252
      // 07b: lload 2
      // 07c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: lload 2
      // 083: lconst_0
      // 084: lcmp
      // 085: iflt 1c1
      // 088: if_icmpne 1ad
      // 08b: goto 098
      // 08e: ldc2_w -2426243949367225252
      // 091: lload 2
      // 092: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: ldc2_w -2678516846921368333
      // 09c: lload 2
      // 09d: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 142
      // 0a8: iload 8
      // 0aa: ifeq 142
      // 0ad: goto 0ba
      // 0b0: ldc2_w -2426243949367225252
      // 0b3: lload 2
      // 0b4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: sipush 22637
      // 0bd: ldc2_w 3860133406177359088
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: if_icmple 113
      // 0ca: goto 0d7
      // 0cd: ldc2_w -2426243949367225252
      // 0d0: lload 2
      // 0d1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 0
      // 0d9: bipush 0
      // 0da: dup_x1
      // 0db: ldc2_w -2314284423432268903
      // 0de: lload 2
      // 0df: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: putfield com/zelix/lob.o I
      // 0e7: aload 0
      // 0e8: aload 0
      // 0e9: ldc2_w -2678516846921368333
      // 0ec: lload 2
      // 0ed: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: ldc2_w -2865948482413383831
      // 0f5: lload 2
      // 0f6: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: iload 8
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 2f6
      // 103: ifne 2ba
      // 106: goto 113
      // 109: ldc2_w -2426243949367225252
      // 10c: lload 2
      // 10d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 0
      // 114: lload 2
      // 115: lconst_0
      // 116: lcmp
      // 117: iflt 181
      // 11a: iload 8
      // 11c: ifeq 181
      // 11f: goto 12c
      // 122: ldc2_w -2426243949367225252
      // 125: lload 2
      // 126: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: ldc2_w -2678516846921368333
      // 12f: lload 2
      // 130: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: goto 142
      // 138: ldc2_w -2426243949367225252
      // 13b: lload 2
      // 13c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 15d
      // 148: ifge 173
      // 14b: aload 0
      // 14c: aload 0
      // 14d: bipush 0
      // 14e: dup_x1
      // 14f: ldc2_w -2314284423432268903
      // 152: lload 2
      // 153: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: putfield com/zelix/lob.o I
      // 15b: iload 8
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 2f6
      // 163: ifne 2ba
      // 166: goto 173
      // 169: ldc2_w -2426243949367225252
      // 16c: lload 2
      // 16d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: aload 0
      // 174: goto 181
      // 177: ldc2_w -2426243949367225252
      // 17a: lload 2
      // 17b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: lload 6
      // 183: bipush 0
      // 184: bipush 2
      // 185: anewarray 148
      // 188: dup_x1
      // 189: swap
      // 18a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18d: bipush 1
      // 18e: swap
      // 18f: aastore
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 0
      // 197: swap
      // 198: aastore
      // 199: ldc2_w -4493298724536746213
      // 19c: lload 2
      // 19d: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: iload 8
      // 1a4: lload 2
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: iflt 2f6
      // 1aa: ifne 2ba
      // 1ad: aload 0
      // 1ae: ldc2_w -2865948482413383831
      // 1b1: lload 2
      // 1b2: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: aload 0
      // 1b8: ldc2_w -2678516846921368333
      // 1bb: lload 2
      // 1bc: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: goto 1ce
      // 1c4: ldc2_w -2426243949367225252
      // 1c7: lload 2
      // 1c8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: lload 2
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 25c
      // 1d4: iload 8
      // 1d6: ifeq 25c
      // 1d9: if_icmple 215
      // 1dc: goto 1e9
      // 1df: ldc2_w -2426243949367225252
      // 1e2: lload 2
      // 1e3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: aload 0
      // 1eb: ldc2_w -2786658165744791141
      // 1ee: lload 2
      // 1ef: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: ldc2_w -2865948482413383831
      // 1f7: lload 2
      // 1f8: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: iload 8
      // 1ff: lload 2
      // 200: lconst_0
      // 201: lcmp
      // 202: ifle 2f6
      // 205: ifne 2ba
      // 208: goto 215
      // 20b: ldc2_w -2426243949367225252
      // 20e: lload 2
      // 20f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: aload 0
      // 216: iload 8
      // 218: lload 2
      // 219: lconst_0
      // 21a: lcmp
      // 21b: iflt 2b1
      // 21e: ifeq 2a7
      // 221: goto 22e
      // 224: ldc2_w -2426243949367225252
      // 227: lload 2
      // 228: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: athrow
      // 22e: ldc2_w -2678516846921368333
      // 231: lload 2
      // 232: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: aload 0
      // 238: ldc2_w -2865948482413383831
      // 23b: lload 2
      // 23c: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: isub
      // 242: sipush 22637
      // 245: ldc2_w 3860133406177359088
      // 248: lload 2
      // 249: lxor
      // 24a: invokedynamic l (IJ)I bsm=com/zelix/lob.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: goto 25c
      // 252: ldc2_w -2426243949367225252
      // 255: lload 2
      // 256: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: if_icmpge 299
      // 25f: aload 0
      // 260: lload 6
      // 262: bipush 1
      // 263: bipush 2
      // 264: anewarray 148
      // 267: dup_x1
      // 268: swap
      // 269: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26c: bipush 1
      // 26d: swap
      // 26e: aastore
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 0
      // 276: swap
      // 277: aastore
      // 278: ldc2_w -4493298724536746213
      // 27b: lload 2
      // 27c: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: iload 8
      // 283: lload 2
      // 284: lconst_0
      // 285: lcmp
      // 286: iflt 2f6
      // 289: ifne 2ba
      // 28c: goto 299
      // 28f: ldc2_w -2426243949367225252
      // 292: lload 2
      // 293: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: athrow
      // 299: aload 0
      // 29a: goto 2a7
      // 29d: ldc2_w -2426243949367225252
      // 2a0: lload 2
      // 2a1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: ldc2_w -2678516846921368333
      // 2ab: lload 2
      // 2ac: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: ldc2_w -2865948482413383831
      // 2b4: lload 2
      // 2b5: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: aload 0
      // 2bb: ldc2_w -2638964424826301051
      // 2be: lload 2
      // 2bf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: aload 0
      // 2c5: ldc2_w -2319240151405335673
      // 2c8: lload 2
      // 2c9: invokedynamic t (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ce: aload 0
      // 2cf: ldc2_w -2314284423432268903
      // 2d2: lload 2
      // 2d3: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: aload 0
      // 2d9: ldc2_w -2865948482413383831
      // 2dc: lload 2
      // 2dd: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: aload 0
      // 2e3: ldc2_w -2314284423432268903
      // 2e6: lload 2
      // 2e7: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: isub
      // 2ed: ldc2_w -2870604649695342715
      // 2f0: lload 2
      // 2f1: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: dup
      // 2f7: istore 9
      // 2f9: bipush -1
      // 2fa: if_icmpne 322
      // 2fd: aload 0
      // 2fe: ldc2_w -2638964424826301051
      // 301: lload 2
      // 302: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: ldc2_w -4250736086195702927
      // 30a: lload 2
      // 30b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: new java/io/IOException
      // 313: dup
      // 314: invokespecial java/io/IOException.<init> ()V
      // 317: athrow
      // 318: ldc2_w -2426243949367225252
      // 31b: lload 2
      // 31c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: athrow
      // 322: aload 0
      // 323: dup
      // 324: ldc2_w -2314284423432268903
      // 327: lload 2
      // 328: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: iload 9
      // 32f: iadd
      // 330: ldc2_w -2314284423432268903
      // 333: lload 2
      // 334: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: return
      // 33a: astore 10
      // 33c: aload 0
      // 33d: dup
      // 33e: getfield com/zelix/lob.o I
      // 341: bipush 1
      // 342: isub
      // 343: putfield com/zelix/lob.o I
      // 346: aload 0
      // 347: lload 4
      // 349: bipush 0
      // 34a: bipush 2
      // 34b: anewarray 148
      // 34e: dup_x1
      // 34f: swap
      // 350: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 353: bipush 1
      // 354: swap
      // 355: aastore
      // 356: dup_x2
      // 357: dup_x2
      // 358: pop
      // 359: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 35c: bipush 0
      // 35d: swap
      // 35e: aastore
      // 35f: ldc2_w -2321347253047110642
      // 362: lload 2
      // 363: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: aload 0
      // 369: iload 8
      // 36b: lload 2
      // 36c: lconst_0
      // 36d: lcmp
      // 36e: iflt 3a0
      // 371: ifeq 39c
      // 374: ldc2_w -2678516846921368333
      // 377: lload 2
      // 378: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: bipush -1
      // 37e: if_icmpne 3a9
      // 381: goto 38e
      // 384: ldc2_w -2426243949367225252
      // 387: lload 2
      // 388: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: athrow
      // 38e: aload 0
      // 38f: goto 39c
      // 392: ldc2_w -2426243949367225252
      // 395: lload 2
      // 396: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: athrow
      // 39c: aload 0
      // 39d: getfield com/zelix/lob.o I
      // 3a0: ldc2_w -2678516846921368333
      // 3a3: lload 2
      // 3a4: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: aload 10
      // 3ab: athrow
   }

   public int l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, 9173869297504256732L, var2)[this.o];
   }

   public String n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (this.o >= m44.a<"v">(this, -7270556608372310727L, var2)) {
            return new String(
               m44.a<"v">(this, -7054234565612000691L, var2),
               m44.a<"v">(this, -7270556608372310727L, var2),
               this.o - m44.a<"v">(this, -7270556608372310727L, var2) + 1
            );
         }
      } catch (n9 var4) {
         throw m44.a<"h">(var4, -6945100738720311914L, var2);
      }

      return new String(
            m44.a<"v">(this, -7054234565612000691L, var2),
            m44.a<"v">(this, -7270556608372310727L, var2),
            m44.a<"v">(this, -7450649784776109999L, var2) - m44.a<"v">(this, -7270556608372310727L, var2)
         )
         + new String(m44.a<"v">(this, -7054234565612000691L, var2), 0, this.o + 1);
   }

   public int f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"w">(this, -8895938413150356653L, var2)[m44.a<"w">(this, -7358641160548352064L, var2)];
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, -6481166685863912574L, var2)[m44.a<"u">(this, -4885579412535027182L, var2)];
   }

   public char g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 87257140429875L;
      m44.a<"r">(this, -1, 5654182259590801495L, var2);
      char var6 = m44.a<"q">(this, new Object[]{var4}, 5641099269837774929L, var2);
      m44.a<"r">(this, this.o, 5654182259590801495L, var2);
      return var6;
   }

   public char[] N(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: pop
      // 17: getstatic com/zelix/lob.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w -2948774042434730965
      // 20: lload 2
      // 21: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: iload 4
      // 28: newarray 5
      // 2a: astore 6
      // 2c: istore 5
      // 2e: aload 0
      // 2f: iload 5
      // 31: ifne b9
      // 34: getfield com/zelix/lob.o I
      // 37: bipush 1
      // 38: iadd
      // 39: iload 4
      // 3b: if_icmplt 7e
      // 3e: goto 4b
      // 41: ldc2_w -2908410014088061525
      // 44: lload 2
      // 45: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: ldc2_w -3015414877499399568
      // 4f: lload 2
      // 50: invokedynamic s (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: lload 2
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle d9
      // 5b: aload 0
      // 5c: getfield com/zelix/lob.o I
      // 5f: iload 4
      // 61: isub
      // 62: bipush 1
      // 63: iadd
      // 64: aload 6
      // 66: bipush 0
      // 67: iload 4
      // 69: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6c: iload 5
      // 6e: ifeq d7
      // 71: goto 7e
      // 74: ldc2_w -2908410014088061525
      // 77: lload 2
      // 78: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: ldc2_w -3015414877499399568
      // 82: lload 2
      // 83: invokedynamic s (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: aload 0
      // 89: ldc2_w -3412406550994216852
      // 8c: lload 2
      // 8d: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: iload 4
      // 94: aload 0
      // 95: getfield com/zelix/lob.o I
      // 98: isub
      // 99: bipush 1
      // 9a: isub
      // 9b: isub
      // 9c: aload 6
      // 9e: bipush 0
      // 9f: iload 4
      // a1: aload 0
      // a2: getfield com/zelix/lob.o I
      // a5: isub
      // a6: bipush 1
      // a7: isub
      // a8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // ab: aload 0
      // ac: goto b9
      // af: ldc2_w -2908410014088061525
      // b2: lload 2
      // b3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: athrow
      // b9: ldc2_w -3015414877499399568
      // bc: lload 2
      // bd: invokedynamic s (Ljava/lang/Object;JJ)[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: bipush 0
      // c3: aload 6
      // c5: iload 4
      // c7: aload 0
      // c8: getfield com/zelix/lob.o I
      // cb: isub
      // cc: bipush 1
      // cd: isub
      // ce: aload 0
      // cf: getfield com/zelix/lob.o I
      // d2: bipush 1
      // d3: iadd
      // d4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // d7: aload 6
      // d9: areturn
   }

   public void f(Object[] param1) {
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
      // 16: getstatic com/zelix/lob.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w -3672443394718806578
      // 1f: lload 3
      // 20: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: dup
      // 27: ldc2_w -3671213703875882834
      // 2a: lload 3
      // 2b: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 2
      // 31: iadd
      // 32: ldc2_w -3671213703875882834
      // 35: lload 3
      // 36: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: istore 5
      // 3d: aload 0
      // 3e: dup
      // 3f: getfield com/zelix/lob.o I
      // 42: iload 2
      // 43: isub
      // 44: iload 5
      // 46: ifeq 7a
      // 49: dup_x1
      // 4a: putfield com/zelix/lob.o I
      // 4d: ifge 7d
      // 50: goto 5d
      // 53: ldc2_w -3026971272047386634
      // 56: lload 3
      // 57: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: dup
      // 5f: getfield com/zelix/lob.o I
      // 62: aload 0
      // 63: ldc2_w -3244285562326345167
      // 66: lload 3
      // 67: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: iadd
      // 6d: goto 7a
      // 70: ldc2_w -3026971272047386634
      // 73: lload 3
      // 74: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: putfield com/zelix/lob.o I
      // 7d: return
   }

   public lob(long var1, Reader var3, int var4, int var5, int var6) {
      var1 = a ^ var1;
      super();
      this.o = -1;
      m44.a<"s">(this, 0, 80227360635714952L, var1);
      m44.a<"s">(this, 1, 1913956535406394011L, var1);
      m44.a<"s">(this, false, 2039322724774864158L, var1);
      m44.a<"s">(this, false, 1904100445142630186L, var1);
      m44.a<"s">(this, 0, 405047787850582500L, var1);
      m44.a<"s">(this, 0, 2078985734028018041L, var1);
      m44.a<"s">(this, a<"l">(3277, 1632519742296685100L ^ var1), 2242557866206898814L, var1);
      m44.a<"s">(this, var3, 80367236323741688L, var1);
      m44.a<"s">(this, var4, 1913956535406394011L, var1);
      m44.a<"s">(this, var5 - 1, 80227360635714952L, var1);
      m44.a<"s">(this, var6, 229344298438151142L, var1);
      m44.a<"s">(this, var6, 164132136944923924L, var1);
      m44.a<"s">(this, new char[var6], 409089914002780666L, var1);
      m44.a<"s">(this, new int[var6], 1914684117198890782L, var1);
      m44.a<"s">(this, new int[var6], 2145231453959365149L, var1);
   }

   public int Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"w">(this, 6441084853588551355L, var2)[this.o];
   }

   static {
      long var0 = a ^ 80509418600919L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "hð\u0095j\u0083lx$ìC^\u008d\u007fÝì<x?;S\u0090QE<";
      int var7 = "hð\u0095j\u0083lx$ìC^\u008d\u007fÝì<x?;S\u0090QE<".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     d = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u001c\b`¸¤A66\u001cÞ+<ñ¨x»";
                  var7 = "\u001c\b`¸¤A66\u001cÞ+<ñ¨x»".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26272;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lob", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/lob" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
