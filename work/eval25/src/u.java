package com.zelix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u {
   private StringBuilder P;
   private StringBuilder I;
   private boolean w;
   private StringBuilder C;
   private int f;
   private int G;
   private static final String[] H;
   private final String e;
   private _n8 S;
   private String E;
   private Map l;
   private Map b;
   private Map g;
   private StringBuilder J;
   private boolean x;
   private boolean m;
   private final _x7 n;
   private char F;
   private StringBuilder p;
   private _8z Y;
   private static final long a = ess.a(7371350235827049020L, 6121351859100668696L, MethodHandles.lookup().lookupClass()).a(108148624965371L);
   private static final String[] c;
   private static final String[] d;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;

   public final void C(Object[] param1) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/List
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/io/PrintWriter
      // 020: astore 4
      // 022: pop
      // 023: getstatic com/zelix/u.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 341352404781
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 106903162543462
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 58467940416713
      // 03f: lxor
      // 040: lstore 11
      // 042: pop2
      // 043: ldc2_w -8756356541146090512
      // 046: lload 5
      // 048: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: astore 13
      // 04f: aload 13
      // 051: ifnonnull 0c1
      // 054: aload 3
      // 055: invokevirtual java/lang/String.length ()I
      // 058: ifle 149
      // 05b: goto 069
      // 05e: ldc2_w -7324622789071418619
      // 061: lload 5
      // 063: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: aload 0
      // 06a: ldc2_w -9065470924964075197
      // 06d: lload 5
      // 06f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: aload 13
      // 076: lload 5
      // 078: lconst_0
      // 079: lcmp
      // 07a: iflt 107
      // 07d: ifnonnull 0f8
      // 080: goto 08e
      // 083: ldc2_w -7324622789071418619
      // 086: lload 5
      // 088: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 3
      // 08f: lload 9
      // 091: aload 2
      // 092: bipush 3
      // 093: anewarray 656
      // 096: dup_x1
      // 097: swap
      // 098: bipush 2
      // 099: swap
      // 09a: aastore
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 1
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 0
      // 0a7: swap
      // 0a8: aastore
      // 0a9: ldc2_w -8719327855817522584
      // 0ac: lload 5
      // 0ae: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: goto 0c1
      // 0b6: ldc2_w -7324622789071418619
      // 0b9: lload 5
      // 0bb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 2
      // 0c2: ifnull 149
      // 0c5: aload 0
      // 0c6: aload 13
      // 0c8: lload 5
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: ifle 13f
      // 0cf: ifnonnull 123
      // 0d2: goto 0e0
      // 0d5: ldc2_w -7324622789071418619
      // 0d8: lload 5
      // 0da: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: ldc2_w -9065470924964075197
      // 0e3: lload 5
      // 0e5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: goto 0f8
      // 0ed: ldc2_w -7324622789071418619
      // 0f0: lload 5
      // 0f2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: lload 7
      // 0fa: bipush 1
      // 0fb: anewarray 656
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w -8751040125159866286
      // 10a: lload 5
      // 10c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: ifeq 149
      // 114: aload 0
      // 115: goto 123
      // 118: ldc2_w -7324622789071418619
      // 11b: lload 5
      // 11d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 2
      // 124: aload 4
      // 126: lload 11
      // 128: bipush 3
      // 129: anewarray 656
      // 12c: dup_x2
      // 12d: dup_x2
      // 12e: pop
      // 12f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 132: bipush 2
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: ldc2_w -8651960211817142796
      // 142: lload 5
      // 144: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: return
   }

   final void f(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 2
      // 015: pop
      // 016: getstatic com/zelix/u.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 1795785232877
      // 021: lxor
      // 022: dup2
      // 023: bipush 32
      // 025: lushr
      // 026: lstore 5
      // 028: dup2
      // 029: bipush 32
      // 02b: lshl
      // 02c: bipush 32
      // 02e: lushr
      // 02f: l2i
      // 030: istore 7
      // 032: pop2
      // 033: pop2
      // 034: ldc2_w -8377809895648149961
      // 037: lload 3
      // 038: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: iload 2
      // 03f: putfield com/zelix/u.G I
      // 042: astore 8
      // 044: aload 0
      // 045: aload 8
      // 047: ifnonnull 114
      // 04a: getfield com/zelix/u.G I
      // 04d: lookupswitch 198 3 1 45 2 113 7 145
      // 070: ldc2_w -7521415763377731902
      // 073: lload 3
      // 074: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 0
      // 07b: ldc2_w -8197409861623181463
      // 07e: lload 3
      // 07f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: bipush 0
      // 085: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 088: aload 0
      // 089: bipush 0
      // 08a: ldc2_w -7693117683504596145
      // 08d: lload 3
      // 08e: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 0
      // 094: bipush 0
      // 095: ldc2_w -7550619201891056113
      // 098: lload 3
      // 099: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: aload 0
      // 09f: ldc2_w -8425260778341386809
      // 0a2: lload 3
      // 0a3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: bipush 0
      // 0a9: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0ac: aload 8
      // 0ae: ifnull 121
      // 0b1: goto 0be
      // 0b4: ldc2_w -7521415763377731902
      // 0b7: lload 3
      // 0b8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w -8136502801862296143
      // 0c2: lload 3
      // 0c3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: bipush 0
      // 0c9: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0cc: aload 8
      // 0ce: ifnull 121
      // 0d1: goto 0de
      // 0d4: ldc2_w -7521415763377731902
      // 0d7: lload 3
      // 0d8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 0
      // 0df: bipush 1
      // 0e0: ldc2_w -8569955547085297472
      // 0e3: lload 3
      // 0e4: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aload 0
      // 0ea: new com/zelix/_n8
      // 0ed: dup
      // 0ee: lload 5
      // 0f0: iload 7
      // 0f2: invokespecial com/zelix/_n8.<init> (JI)V
      // 0f5: ldc2_w -8513709013975512200
      // 0f8: lload 3
      // 0f9: invokedynamic t (Ljava/lang/Object;Lcom/zelix/_n8;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: aload 0
      // 0ff: getfield com/zelix/u.P Ljava/lang/StringBuilder;
      // 102: bipush 0
      // 103: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 106: goto 113
      // 109: ldc2_w -7521415763377731902
      // 10c: lload 3
      // 10d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 0
      // 114: ldc2_w -8573650033313626374
      // 117: lload 3
      // 118: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: bipush 0
      // 11e: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 121: return
   }

   public static byte[] n(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 6
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast [B
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 3
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 1
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/lang/Integer
      // 039: invokevirtual java/lang/Integer.intValue ()I
      // 03c: istore 2
      // 03d: pop
      // 03e: iload 4
      // 040: i2l
      // 041: bipush 32
      // 043: lshl
      // 044: iload 6
      // 046: i2l
      // 047: bipush 48
      // 049: lshl
      // 04a: bipush 32
      // 04c: lushr
      // 04d: lor
      // 04e: iload 1
      // 04f: i2l
      // 050: bipush 48
      // 052: lshl
      // 053: bipush 48
      // 055: lushr
      // 056: lor
      // 057: getstatic com/zelix/u.a J
      // 05a: lxor
      // 05b: lstore 7
      // 05d: ldc2_w 3422486865574959860
      // 060: lload 7
      // 062: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 9
      // 069: iload 3
      // 06a: aload 9
      // 06c: ifnonnull 081
      // 06f: ifle 2d9
      // 072: goto 080
      // 075: ldc2_w 3701263816709005825
      // 078: lload 7
      // 07a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: iload 3
      // 081: aload 9
      // 083: iload 4
      // 085: ifle 0c2
      // 088: ifnonnull 0c0
      // 08b: lookupswitch 590 2 2 36 3 391
      // 0a4: ldc2_w 3701263816709005825
      // 0a7: lload 7
      // 0a9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: arraylength
      // 0b2: goto 0c0
      // 0b5: ldc2_w 3701263816709005825
      // 0b8: lload 7
      // 0ba: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 9
      // 0c2: ifnonnull 145
      // 0c5: bipush 2
      // 0c6: if_icmplt 136
      // 0c9: goto 0d7
      // 0cc: ldc2_w 3701263816709005825
      // 0cf: lload 7
      // 0d1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 5
      // 0d9: aload 9
      // 0db: ifnonnull 2db
      // 0de: goto 0ec
      // 0e1: ldc2_w 3701263816709005825
      // 0e4: lload 7
      // 0e6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: bipush 0
      // 0ed: baload
      // 0ee: sipush 6704
      // 0f1: ldc2_w 668227905324549840
      // 0f4: lload 7
      // 0f6: lxor
      // 0f7: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: if_icmpeq 2d9
      // 0ff: goto 10d
      // 102: ldc2_w 3701263816709005825
      // 105: lload 7
      // 107: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: aload 5
      // 10f: aload 9
      // 111: ifnonnull 2db
      // 114: goto 122
      // 117: ldc2_w 3701263816709005825
      // 11a: lload 7
      // 11c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: bipush 0
      // 123: baload
      // 124: bipush -1
      // 125: if_icmpeq 2d9
      // 128: goto 136
      // 12b: ldc2_w 3701263816709005825
      // 12e: lload 7
      // 130: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: bipush 2
      // 137: goto 145
      // 13a: ldc2_w 3701263816709005825
      // 13d: lload 7
      // 13f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: newarray 8
      // 147: astore 10
      // 149: iload 2
      // 14a: aload 9
      // 14c: iload 4
      // 14e: ifle 1a6
      // 151: ifnonnull 1a4
      // 154: bipush 1
      // 155: if_icmpne 195
      // 158: goto 166
      // 15b: ldc2_w 3701263816709005825
      // 15e: lload 7
      // 160: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: aload 10
      // 168: bipush 0
      // 169: sipush 9448
      // 16c: ldc2_w 7510787758159673514
      // 16f: lload 7
      // 171: lxor
      // 172: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: bastore
      // 178: aload 10
      // 17a: iload 4
      // 17c: iflt 1e1
      // 17f: bipush 1
      // 180: bipush -1
      // 181: bastore
      // 182: aload 9
      // 184: ifnull 1df
      // 187: goto 195
      // 18a: ldc2_w 3701263816709005825
      // 18d: lload 7
      // 18f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: iload 2
      // 196: goto 1a4
      // 199: ldc2_w 3701263816709005825
      // 19c: lload 7
      // 19e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 9
      // 1a6: ifnonnull 1e4
      // 1a9: ifne 1df
      // 1ac: goto 1ba
      // 1af: ldc2_w 3701263816709005825
      // 1b2: lload 7
      // 1b4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 10
      // 1bc: bipush 0
      // 1bd: bipush -1
      // 1be: bastore
      // 1bf: aload 10
      // 1c1: bipush 1
      // 1c2: sipush 9448
      // 1c5: ldc2_w 7510787758159673514
      // 1c8: lload 7
      // 1ca: lxor
      // 1cb: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: bastore
      // 1d1: goto 1df
      // 1d4: ldc2_w 3701263816709005825
      // 1d7: lload 7
      // 1d9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 5
      // 1e1: arraylength
      // 1e2: bipush 2
      // 1e3: iadd
      // 1e4: newarray 8
      // 1e6: astore 11
      // 1e8: aload 11
      // 1ea: bipush 0
      // 1eb: aload 10
      // 1ed: bipush 0
      // 1ee: baload
      // 1ef: bastore
      // 1f0: aload 11
      // 1f2: bipush 1
      // 1f3: aload 10
      // 1f5: bipush 1
      // 1f6: baload
      // 1f7: bastore
      // 1f8: aload 5
      // 1fa: bipush 0
      // 1fb: aload 11
      // 1fd: bipush 2
      // 1fe: aload 5
      // 200: arraylength
      // 201: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 204: aload 11
      // 206: astore 5
      // 208: iload 6
      // 20a: ifle 212
      // 20d: aload 9
      // 20f: ifnull 2d9
      // 212: aload 5
      // 214: arraylength
      // 215: iload 1
      // 216: ifgt 28c
      // 219: bipush 3
      // 21a: aload 9
      // 21c: ifnonnull 28b
      // 21f: goto 22d
      // 222: ldc2_w 3701263816709005825
      // 225: lload 7
      // 227: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: iload 6
      // 22f: iflt 27d
      // 232: if_icmplt 279
      // 235: goto 243
      // 238: ldc2_w 3701263816709005825
      // 23b: lload 7
      // 23d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: athrow
      // 243: aload 5
      // 245: aload 9
      // 247: ifnonnull 2db
      // 24a: goto 258
      // 24d: ldc2_w 3701263816709005825
      // 250: lload 7
      // 252: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: bipush 0
      // 259: baload
      // 25a: sipush 15247
      // 25d: ldc2_w 5724738146154031095
      // 260: lload 7
      // 262: lxor
      // 263: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: if_icmpeq 2d9
      // 26b: goto 279
      // 26e: ldc2_w 3701263816709005825
      // 271: lload 7
      // 273: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: athrow
      // 279: aload 5
      // 27b: arraylength
      // 27c: bipush 3
      // 27d: goto 28b
      // 280: ldc2_w 3701263816709005825
      // 283: lload 7
      // 285: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: athrow
      // 28b: iadd
      // 28c: newarray 8
      // 28e: astore 10
      // 290: aload 10
      // 292: bipush 0
      // 293: sipush 29330
      // 296: ldc2_w 3760637572142001838
      // 299: lload 7
      // 29b: lxor
      // 29c: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: bastore
      // 2a2: aload 10
      // 2a4: bipush 1
      // 2a5: sipush 10852
      // 2a8: ldc2_w 4178131665715377671
      // 2ab: lload 7
      // 2ad: lxor
      // 2ae: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: bastore
      // 2b4: aload 10
      // 2b6: bipush 2
      // 2b7: sipush 20034
      // 2ba: ldc2_w 9207898347851960993
      // 2bd: lload 7
      // 2bf: lxor
      // 2c0: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: bastore
      // 2c6: aload 5
      // 2c8: bipush 0
      // 2c9: aload 10
      // 2cb: bipush 3
      // 2cc: aload 5
      // 2ce: arraylength
      // 2cf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2d2: aload 10
      // 2d4: astore 5
      // 2d6: goto 2d9
      // 2d9: aload 5
      // 2db: areturn
   }

   public static String J(Object[] var0) {
      long var4 = (Long)var0[0];
      File var7 = (File)var0[1];
      pg var1 = (pg)var0[2];
      wp var2 = (wp)var0[3];
      wp var3 = (wp)var0[4];
      wp var6 = (wp)var0[5];
      var4 = a ^ var4;
      long var8 = var4 ^ 88238471989183L;
      long var10 = var4 ^ 136774250519568L;
      long var12 = var4 ^ 115974704365043L;
      String var14 = x44.a<"p">(new Object[]{new FileInputStream(var7), var2, var3, var6, var12}, -5072889941654569551L, var4);
      var1.G(var10, var14);
      return x44.a<"p">(new Object[]{var7, var14, var8}, -4779463728997574843L, var4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void G(Object[] var1) {
      List var2 = (List)var1[0];
      PrintWriter var3 = (PrintWriter)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      String[] var10000 = x44.a<"w">(-8411560945143005489L, var4);
      Iterator var7 = var2.iterator();
      String[] var6 = var10000;

      label43:
      while (var7.hasNext()) {
         Object var8 = var7.next();

         try {
            x44.a<"o">(var3, var8, -7943788490779456234L, var4);
         } catch (gj var10) {
            boolean var10001 = false;
            throw x44.a<"w">(var10, -7537130647470946758L, var4);
         }

         while (true) {
            try {
               var10000 = var6;
               if (var4 > 0L) {
                  if (var6 != null) {
                     return;
                  }

                  var10000 = var6;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var9) {
               boolean var14 = false;
               throw x44.a<"w">(var9, -7537130647470946758L, var4);
            }

            if (var4 > 0L) {
               break label43;
            }
         }
      }

      var2.clear();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public u(InputStream var1, _x7 var2, String var3, int var4, int var5, long var6, int var8, Map var9, Map var10, Map var11, _8z var12, String var13) {
      var6 = a ^ var6;
      long var14 = var6 ^ 43915763610614L;
      long var16 = var6 ^ 10835247381879L;
      super();
      this.G = 1;
      x44.a<"u">(this, 1, -6018932314998600279L, var6);
      String[] var10000 = x44.a<"v">(-5848741678057809058L, var6);
      this.F = (char)b<"a">(10981, 2727012074732337041L ^ var6);
      x44.a<"u">(this, new StringBuilder(), -6022064083343809645L, var6);
      x44.a<"u">(this, new StringBuilder(), -6100722667778823680L, var6);
      x44.a<"u">(this, false, -5740510501291778522L, var6);
      x44.a<"u">(this, false, -5593508188713491610L, var6);
      this.P = new StringBuilder();
      String[] var18 = var10000;

      String var19;
      label68: {
         label56: {
            label55: {
               label62: {
                  try {
                     x44.a<"u">(this, new StringBuilder(), -6161971125917919016L, var6);
                     this.m = false;
                     x44.a<"u">(this, new StringBuilder(), -5874268616192814930L, var6);
                     var10000 = var3;
                     if (var18 != null) {
                        break label55;
                     }

                     if (var3 != null) {
                        break label62;
                     }
                  } catch (gj var24) {
                     throw x44.a<"v">(var24, -5550825004009200725L, var6);
                  }

                  var19 = a<"u">(6124, 3265930892160786521L ^ var6);

                  try {
                     var10000 = var18;
                     if (var6 <= 0L) {
                        break label68;
                     }

                     if (var18 == null) {
                        break label56;
                     }
                  } catch (gj var23) {
                     boolean var10001 = false;
                     throw x44.a<"v">(var23, -5550825004009200725L, var6);
                  }
               }

               try {
                  var10000 = var3;
               } catch (gj var22) {
                  boolean var30 = false;
                  throw x44.a<"v">(var22, -5550825004009200725L, var6);
               }
            }

            var19 = var10000;
         }

         Object[] var10004 = new Object[]{null, var1, var4};
         var10000 = var10004;
         var10004[0] = var16;
      }

      x44.a<"v">(var10000, -5408318916162697972L, var6);
      PushbackReader var20 = new PushbackReader(new BufferedReader(new InputStreamReader(var1, var19)), b<"a">(4070, 1757188469888684593L ^ var6));

      try {
         this.n = var2;
         this.e = var13;
         x44.a<"u">(this, var9, -5514595602317987566L, var6);
         x44.a<"u">(this, var10, -5367037507072578332L, var6);
         x44.a<"u">(this, var11, -5565683022404388065L, var6);
         x44.a<"u">(this, var12, -6036788662153150746L, var6);
         Object[] var10007 = new Object[]{null, null, null, null, false};
         var10007[2] = var14;
         var10007[1] = null;
         var10007[0] = var20;
         x44.a<"h">(this, var10007, -5339887537018126586L, var6);
         var10000 = x44.a<"v">(-5823881579459098750L, var6);
         if (var6 > 0L) {
            if (var10000 != null) {
               return;
            }

            var10000 = new String[4];
         }

         x44.a<"v">(var10000, -6290564447200652093L, var6);
      } catch (gj var21) {
         throw x44.a<"v">(var21, -5550825004009200725L, var6);
      }
   }

   private void E(Object[] var1) {
      PushbackReader var7 = (PushbackReader)var1[0];
      List var3 = (List)var1[1];
      long var4 = (Long)var1[2];
      PrintWriter var6 = (PrintWriter)var1[3];
      boolean var2 = (Boolean)var1[4];
      var4 = a ^ var4;
      long var8 = var4 ^ 48336769344277L;
      long var10 = var4 ^ 130434805953415L;
      long var12 = var4 ^ 110775564558887L;
      long var14 = var4 ^ 112163479204545L;
      long var16 = var4 ^ 24802052438894L;
      long var18 = var4 ^ 72333235444592L;
      long var20 = var4 ^ 99048772779460L;
      long var22 = var4 ^ 59201578161823L;
      long var24 = var4 ^ 37599634125812L;
      boolean var26 = false;
      int var27 = 0;

      while (var27 != -1 && (var27 = var7.read()) != -1) {
         char var28 = (char)var27;
         boolean var29 = var28 == b<"a">(31492, 7793753177396552925L ^ var4)
            || var28 == b<"a">(11837, 2677291451252175242L ^ var4)
            || var28 == b<"a">(19661, 1238529071232357178L ^ var4)
            || var28 == b<"a">(14617, 3408985902380377707L ^ var4);
         label475:
         switch (this.G) {
            case 1:
               if (var28 == b<"a">(12197, 8862903737849278698L ^ var4)) {
                  this.m = false;
                  String var43 = this.J.toString();
                  if (var43.length() > 0) {
                     this.j(new Object[]{var43, this.E, var3, var20, var6});
                     this.J.setLength(0);
                  }

                  if (var3 != null) {
                     var3.add(this.C.toString());
                     this.C.setLength(0);
                     var3.add(H[var28]);
                  }

                  if ((var27 = var7.read()) != -1) {
                     char var45 = (char)var27;
                     if (var45 == b<"a">(280, 5676712260108541643L ^ var4)) {
                        if (var3 != null) {
                           var3.add(H[var45]);
                        }

                        if ((var27 = var7.read()) != -1) {
                           char var32 = (char)var27;
                           if (var32 == b<"a">(7031, 4322877419680973865L ^ var4)) {
                              if ((var27 = var7.read()) != -1) {
                                 char var33 = (char)var27;
                                 if (var33 == b<"a">(7031, 4322877419680973865L ^ var4)) {
                                    if (var3 != null) {
                                       var3.add(a<"u">(17202, 814952196737365646L ^ var4));
                                    }

                                    StringBuilder var34 = new StringBuilder();
                                    this.W(new Object[]{var34, var14, var7});
                                    if (var3 != null) {
                                       if (!var2) {
                                          var3.add(var34.toString());
                                       } else {
                                          Object var35 = var3.remove(var3.size() - 1);
                                          var35 = var3.remove(var3.size() - 1);
                                          var35 = var3.remove(var3.size() - 1);
                                       }
                                    }
                                 } else {
                                    var7.unread(var33);
                                    var7.unread(var32);
                                    Object[] var68 = new Object[]{null, 3};
                                    var68[0] = var22;
                                    this.f(var68);
                                 }
                              } else if (var3 != null) {
                                 var3.add(H[var32]);
                              }
                           } else if (var32 == b<"a">(24650, 1933999904658112265L ^ var4)) {
                              if ((var27 = var7.read()) != -1) {
                                 char var47 = (char)var27;
                                 if (var47 == b<"a">(15622, 5386745922288018076L ^ var4)) {
                                    if ((var27 = var7.read()) != -1) {
                                       char var49 = (char)var27;
                                       if (var49 == b<"a">(27469, 1479675364530205899L ^ var4)) {
                                          if ((var27 = var7.read()) != -1) {
                                             char var53 = (char)var27;
                                             if (var53 == b<"a">(9170, 9005136461972012060L ^ var4)) {
                                                if ((var27 = var7.read()) != -1) {
                                                   char var36 = (char)var27;
                                                   if (var36 == b<"a">(11222, 7138120076738851951L ^ var4)) {
                                                      if ((var27 = var7.read()) != -1) {
                                                         char var37 = (char)var27;
                                                         if (var37 == b<"a">(9170, 9005136461972012060L ^ var4)) {
                                                            if ((var27 = var7.read()) != -1) {
                                                               char var38 = (char)var27;
                                                               if (var38 == b<"a">(24650, 1933999904658112265L ^ var4)) {
                                                                  if (var3 != null) {
                                                                     var3.add(a<"u">(20707, 609949416673928528L ^ var4));
                                                                  }

                                                                  Object[] var69 = new Object[]{null, b<"a">(1722, 819683479969225077L ^ var4)};
                                                                  var69[0] = var22;
                                                                  this.f(var69);
                                                               } else {
                                                                  var7.unread(var38);
                                                                  var7.unread(var37);
                                                                  var7.unread(var36);
                                                                  var7.unread(var53);
                                                                  var7.unread(var49);
                                                                  var7.unread(var47);
                                                                  var7.unread(var32);
                                                                  Object[] var70 = new Object[]{null, 3};
                                                                  var70[0] = var22;
                                                                  this.f(var70);
                                                               }
                                                            } else if (var3 != null) {
                                                               var3.add(a<"u">(1920, 7947166005283795518L ^ var4));
                                                            }
                                                         } else {
                                                            var7.unread(var37);
                                                            var7.unread(var36);
                                                            var7.unread(var53);
                                                            var7.unread(var49);
                                                            var7.unread(var47);
                                                            var7.unread(var32);
                                                            Object[] var71 = new Object[]{null, 3};
                                                            var71[0] = var22;
                                                            this.f(var71);
                                                         }
                                                      } else if (var3 != null) {
                                                         var3.add(a<"u">(30009, 4588619974636290204L ^ var4));
                                                      }
                                                   } else {
                                                      var7.unread(var36);
                                                      var7.unread(var53);
                                                      var7.unread(var49);
                                                      var7.unread(var47);
                                                      var7.unread(var32);
                                                      Object[] var72 = new Object[]{null, 3};
                                                      var72[0] = var22;
                                                      this.f(var72);
                                                   }
                                                } else if (var3 != null) {
                                                   var3.add(a<"u">(15884, 151973016373660600L ^ var4));
                                                }
                                             } else {
                                                var7.unread(var53);
                                                var7.unread(var49);
                                                var7.unread(var47);
                                                var7.unread(var32);
                                                Object[] var73 = new Object[]{null, 3};
                                                var73[0] = var22;
                                                this.f(var73);
                                             }
                                          } else if (var3 != null) {
                                             var3.add(a<"u">(6292, 7222887295673543994L ^ var4));
                                          }
                                       } else {
                                          var7.unread(var49);
                                          var7.unread(var47);
                                          var7.unread(var32);
                                          Object[] var74 = new Object[]{null, 3};
                                          var74[0] = var22;
                                          this.f(var74);
                                       }
                                    } else if (var3 != null) {
                                       var3.add(a<"u">(24458, 3951547252138633784L ^ var4));
                                    }
                                 } else {
                                    var7.unread(var47);
                                    var7.unread(var32);
                                    Object[] var75 = new Object[]{null, 3};
                                    var75[0] = var22;
                                    this.f(var75);
                                 }
                              } else if (var3 != null) {
                                 var3.add(var32);
                              }
                           } else if (var32 == b<"a">(27469, 1479675364530205899L ^ var4)) {
                              if ((var27 = var7.read()) != -1) {
                                 char var48 = (char)var27;
                                 if (var48 == b<"a">(17329, 6956938377531858033L ^ var4)) {
                                    if ((var27 = var7.read()) != -1) {
                                       char var50 = (char)var27;
                                       if (var50 == b<"a">(15622, 5386745922288018076L ^ var4)) {
                                          if ((var27 = var7.read()) != -1) {
                                             char var54 = (char)var27;
                                             if (var54 == b<"a">(11222, 7138120076738851951L ^ var4)) {
                                                if ((var27 = var7.read()) != -1) {
                                                   char var55 = (char)var27;
                                                   if (var55 == b<"a">(10483, 7907865008166401975L ^ var4)) {
                                                      if ((var27 = var7.read()) != -1) {
                                                         char var56 = (char)var27;
                                                         if (var56 == b<"a">(30514, 845274204013963380L ^ var4)) {
                                                            if ((var27 = var7.read()) != -1) {
                                                               char var57 = (char)var27;
                                                               if (var57 == b<"a">(22972, 7184275197448062529L ^ var4)) {
                                                                  if (var3 != null) {
                                                                     var3.add(a<"u">(12399, 1895360900639327705L ^ var4));
                                                                  }

                                                                  Object[] var76 = new Object[]{null, 4};
                                                                  var76[0] = var22;
                                                                  this.f(var76);
                                                               } else {
                                                                  var7.unread(var57);
                                                                  var7.unread(var56);
                                                                  var7.unread(var55);
                                                                  var7.unread(var54);
                                                                  var7.unread(var50);
                                                                  var7.unread(var48);
                                                                  var7.unread(var32);
                                                                  Object[] var77 = new Object[]{null, 3};
                                                                  var77[0] = var22;
                                                                  this.f(var77);
                                                               }
                                                            } else if (var3 != null) {
                                                               var3.add(a<"u">(18202, 3720192714822808252L ^ var4));
                                                            }
                                                         } else {
                                                            var7.unread(var56);
                                                            var7.unread(var55);
                                                            var7.unread(var54);
                                                            var7.unread(var50);
                                                            var7.unread(var48);
                                                            var7.unread(var32);
                                                            Object[] var78 = new Object[]{null, 3};
                                                            var78[0] = var22;
                                                            this.f(var78);
                                                         }
                                                      } else if (var3 != null) {
                                                         var3.add(a<"u">(5747, 2155003772153799627L ^ var4));
                                                      }
                                                   } else {
                                                      var7.unread(var55);
                                                      var7.unread(var54);
                                                      var7.unread(var50);
                                                      var7.unread(var48);
                                                      var7.unread(var32);
                                                      Object[] var79 = new Object[]{null, 3};
                                                      var79[0] = var22;
                                                      this.f(var79);
                                                   }
                                                } else if (var3 != null) {
                                                   var3.add(a<"u">(8096, 4047904631695288845L ^ var4));
                                                }
                                             } else {
                                                var7.unread(var54);
                                                var7.unread(var50);
                                                var7.unread(var48);
                                                var7.unread(var32);
                                                Object[] var80 = new Object[]{null, 3};
                                                var80[0] = var22;
                                                this.f(var80);
                                             }
                                          } else if (var3 != null) {
                                             var3.add(a<"u">(9049, 1490234019447903968L ^ var4));
                                          }
                                       } else {
                                          var7.unread(var50);
                                          var7.unread(var48);
                                          var7.unread(var32);
                                          Object[] var81 = new Object[]{null, 3};
                                          var81[0] = var22;
                                          this.f(var81);
                                       }
                                    } else if (var3 != null) {
                                       var3.add(a<"u">(1987, 8753223956075524728L ^ var4));
                                    }
                                 } else {
                                    var7.unread(var48);
                                    var7.unread(var32);
                                    Object[] var82 = new Object[]{null, 3};
                                    var82[0] = var22;
                                    this.f(var82);
                                 }
                              } else if (var3 != null) {
                                 var3.add(H[var32]);
                              }
                           } else {
                              var7.unread(var32);
                              Object[] var83 = new Object[]{null, 3};
                              var83[0] = var22;
                              this.f(var83);
                           }
                        }
                     } else if (var45 == b<"a">(19662, 2334546632654721899L ^ var4)) {
                        if (var3 != null) {
                           var3.add(H[var45]);
                        }

                        Object[] var84 = new Object[]{null, 2};
                        var84[0] = var22;
                        this.f(var84);
                     } else if (var45 == b<"a">(17301, 3412689240181218419L ^ var4)) {
                        if (var3 != null) {
                           var3.add(H[var45]);
                        }

                        Object[] var85 = new Object[]{null, b<"a">(3305, 1604049798249861978L ^ var4)};
                        var85[0] = var22;
                        this.f(var85);
                     } else {
                        var7.unread(var45);
                        Object[] var86 = new Object[]{null, b<"a">(4070, 1757202902418346033L ^ var4)};
                        var86[0] = var22;
                        this.f(var86);
                     }
                  }
               } else if (var29) {
                  if (!this.m) {
                     if (var3 != null) {
                        var3.add(H[var28]);
                     }
                  } else {
                     StringBuffer var44 = new StringBuffer();
                     var44.append(var28);

                     do {
                        var27 = var7.read();
                        if (var27 != -1) {
                           char var46 = (char)var27;
                           if (var46 != b<"a">(31492, 7793753177396552925L ^ var4)
                              && var46 != b<"a">(11837, 2677291451252175242L ^ var4)
                              && var46 != b<"a">(19661, 1238529071232357178L ^ var4)
                              && var46 != b<"a">(14617, 3408985902380377707L ^ var4)) {
                              if (var46 == b<"a">(12197, 8862903737849278698L ^ var4)) {
                                 var7.unread(var46);
                                 this.C.setLength(0);
                                 this.C.append(var44.toString());
                              } else {
                                 var44.append(var46);
                                 this.J.append(var44);
                              }
                              break label475;
                           }

                           var44.append(var46);
                        } else {
                           this.J.append(var44);
                        }
                     } while (var27 != -1);
                  }
               } else {
                  this.m = true;
                  this.J.append(var28);
               }
               break;
            case 2:
               if (var28 == b<"a">(19662, 2334546632654721899L ^ var4)) {
                  if ((var27 = var7.read()) != -1) {
                     char var42 = (char)var27;
                     if (var42 == b<"a">(28257, 719056493627650453L ^ var4)) {
                        this.T(new Object[]{this.I, var10, var3});
                        if (var3 != null) {
                           var3.add(a<"u">(5837, 1073379186358592375L ^ var4));
                        }

                        Object[] var67 = new Object[]{null, 1};
                        var67[0] = var22;
                        this.f(var67);
                     } else {
                        this.I.append(var28);
                        var7.unread(var42);
                     }
                  }
               } else {
                  this.I.append(var28);
               }
               break;
            case 3:
               if (var3 != null) {
                  var3.add(var28 < H.length ? H[var28] : var28);
               }

               if (var28 == b<"a">(28257, 719056493627650453L ^ var4)) {
                  Object[] var66 = new Object[]{null, 1};
                  var66[0] = var22;
                  this.f(var66);
               }
               break;
            case 4:
               if (var3 != null) {
                  var3.add(var28 < H.length ? H[var28] : var28);
               }

               if (var28 == b<"a">(28257, 719056493627650453L ^ var4)) {
                  Object[] var64 = new Object[]{null, 1};
                  var64[0] = var22;
                  this.f(var64);
               } else if (var28 == b<"a">(24650, 1933999904658112265L ^ var4)) {
                  Object[] var65 = new Object[]{null, 5};
                  var65[0] = var22;
                  this.f(var65);
               }
               break;
            case 5:
               if (var3 != null) {
                  var3.add(var28 < H.length ? H[var28] : var28);
               }

               Object[] var62 = new Object[]{null, var12};
               var62[0] = Integer.valueOf(var28);
               if (this.i(var62)) {
                  var26 = !var26;
                  if (var26) {
                     this.F = var28;
                  }
               } else if (!var26 && var28 == b<"a">(14987, 3172962326782829831L ^ var4)) {
                  var62 = new Object[]{null, 4};
                  var62[0] = var22;
                  this.f(var62);
               }
               break;
            case 6:
               if (var3 != null) {
                  var3.add(var28 < H.length ? H[var28] : var28);
               }

               if (var28 == b<"a">(14987, 3172962326782829831L ^ var4) && (var27 = var7.read()) != -1) {
                  char var41 = (char)var27;
                  if (var41 == b<"a">(14987, 3172962326782829831L ^ var4)) {
                     if ((var27 = var7.read()) != -1) {
                        char var31 = (char)var27;
                        if (var31 == b<"a">(28257, 719056493627650453L ^ var4)) {
                           if (var3 != null) {
                              var3.add(a<"u">(1179, 179605544832774463L ^ var4));
                           }

                           Object[] var61 = new Object[]{null, 1};
                           var61[0] = var22;
                           this.f(var61);
                        } else {
                           var7.unread(var31);
                           var7.unread(var41);
                        }
                     } else if (var3 != null) {
                        var3.add(var41 < H.length ? H[var41] : var41);
                     }
                  } else {
                     var7.unread(var41);
                  }
               }
               break;
            case 7:
               Object[] var58 = new Object[]{null, var12};
               var58[0] = Integer.valueOf(var28);
               if (this.i(var58)) {
                  var26 = !var26;
                  if (var26) {
                     this.F = var28;
                  }
               }

               if (var28 == b<"a">(28257, 719056493627650453L ^ var4) && !var26) {
                  switch (this.f) {
                     case 1:
                        this.P.append(var28);
                        this.S.h(new Object[]{var18, this.P.toString()});
                        this.P.setLength(0);
                        break;
                     case 2:
                        this.S.N(new Object[]{this.P.toString(), var8});
                        if (!this.w) {
                           this.w = true;
                           this.p.append((CharSequence)this.P);
                        }

                        this.P.setLength(0);
                        this.P.append(var28);
                        this.S.h(new Object[]{var18, this.P.toString()});
                        this.P.setLength(0);
                  }

                  Object[] var88 = new Object[]{null, 1, var3, var6};
                  var88[0] = var16;
                  this.S(var88);
                  var58 = new Object[]{null, 1};
                  var58[0] = var22;
                  this.f(var58);
               } else if (var28 == b<"a">(17301, 3412689240181218419L ^ var4) && !var26) {
                  if ((var27 = var7.read()) != -1) {
                     char var40 = (char)var27;
                     if (var40 == b<"a">(28257, 719056493627650453L ^ var4)) {
                        switch (this.f) {
                           case 1:
                              this.P.append(var28);
                              this.P.append(var40);
                              this.S.h(new Object[]{var18, this.P.toString()});
                              this.P.setLength(0);
                              break;
                           case 2:
                              this.S.N(new Object[]{this.P.toString(), var8});
                              if (!this.w) {
                                 this.w = true;
                                 this.p.append((CharSequence)this.P);
                              }

                              this.P.setLength(0);
                              this.P.append(var28);
                              this.P.append(var40);
                              this.S.h(new Object[]{var18, this.P.toString()});
                              this.P.setLength(0);
                        }

                        Object[] var87 = new Object[]{null, 3, var3, var6};
                        var87[0] = var16;
                        this.S(var87);
                        var58 = new Object[]{null, 1};
                        var58[0] = var22;
                        this.f(var58);
                     } else {
                        this.P.append(var28);
                        var7.unread(var40);
                     }
                  }
               } else {
                  switch (this.f) {
                     case 1:
                        if (!var29 && var28 != b<"a">(55, 8492188101700739047L ^ var4) && var28 != this.F) {
                           this.S.h(new Object[]{var18, this.P.toString()});
                           this.P.setLength(0);
                           this.P.append(var28);
                           this.f = b<"a">(884, 258696284385303588L ^ var4);
                        } else {
                           this.P.append(var28);
                           if (var28 == this.F) {
                              this.S.h(new Object[]{var18, this.P.toString()});
                              this.P.setLength(0);
                              this.f = b<"a">(19340, 8471202902942094410L ^ var4);
                           }
                        }
                        break;
                     case 2:
                        if (!var29 && var28 != b<"a">(55, 8492188101700739047L ^ var4)) {
                           this.P.append(var28);
                           break;
                        }

                        this.S.N(new Object[]{this.P.toString(), var8});
                        if (!this.w) {
                           this.w = true;
                           this.p.append((CharSequence)this.P);
                        }

                        this.P.setLength(0);
                        this.P.append(var28);
                        this.f = 1;
                        break;
                     case 3:
                        if (var28 == this.F) {
                           this.S.I(new Object[]{var24, this.P.toString()});
                           this.P.setLength(0);
                           this.P.append(var28);
                           this.f = 1;
                        } else {
                           this.P.append(var28);
                        }
                  }

                  if (this.P.length() == a<"u">(887, 2621293234739001052L ^ var4).length()
                     && this.P.toString().equals(a<"u">(3137, 3034612739586963966L ^ var4))) {
                     this.W(new Object[]{this.P, var14, var7});
                     this.S.h(new Object[]{var18, this.P.toString()});
                     this.P.setLength(0);
                     this.f = 1;
                  }
               }
               break;
            case 8:
               if (var28 == b<"a">(28257, 719056493627650453L ^ var4)) {
                  Object[] var10006 = new Object[]{null, 2, var3, var6};
                  var10006[0] = var16;
                  this.S(var10006);
                  if (var3 != null) {
                     if (this.C.length() > 0) {
                        var3.add(this.C.toString());
                        this.C.setLength(0);
                     }

                     var3.add(var28 < H.length ? H[var28] : var28);
                  }

                  Object[] var10004 = new Object[]{null, 1};
                  var10004[0] = var22;
                  this.f(var10004);
               } else if (var29) {
                  if (this.x && !this.w) {
                     this.w = true;
                     this.C.setLength(0);
                  }

                  if (var3 != null) {
                     if (this.x) {
                        this.C.append(var28);
                     } else {
                        var3.add(var28 < H.length ? H[var28] : var28);
                     }
                  }
               } else if (var28 == b<"a">(12197, 8862903737849278698L ^ var4)) {
                  StringBuilder var30 = new StringBuilder();
                  var30.append(var28);
                  this.W(new Object[]{var30, var14, var7});
                  this.C.append(var30.toString());
               } else {
                  this.x = true;
                  if (!this.w) {
                     this.p.append(var28);
                  }
               }
         }

         if (!var26 && this.F != b<"a">(10981, 2727022105807943057L ^ var4)) {
            this.F = (char)b<"a">(10981, 2727022105807943057L ^ var4);
         }
      }

      if (this.G == 1 && this.J.length() > 0) {
         this.j(new Object[]{this.J.toString(), null, var3, var20, var6});
      }
   }

   void T(Object[] param1) {
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
      // 004: checkcast java/lang/StringBuilder
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/List
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/u.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 6723989559007
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 103092800937278
      // 02d: lxor
      // 02e: lstore 8
      // 030: pop2
      // 031: ldc2_w -5862480278396822737
      // 034: lload 3
      // 035: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: astore 10
      // 03c: aload 10
      // 03e: ifnonnull 097
      // 041: aload 5
      // 043: ifnull 0a2
      // 046: goto 053
      // 049: ldc2_w -5582542414794988582
      // 04c: lload 3
      // 04d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: ldc2_w -6129505639533166180
      // 057: lload 3
      // 058: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 2
      // 05e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 061: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 064: lload 6
      // 066: dup2_x1
      // 067: pop2
      // 068: aload 5
      // 06a: bipush 3
      // 06b: anewarray 656
      // 06e: dup_x1
      // 06f: swap
      // 070: bipush 2
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 0
      // 07f: swap
      // 080: aastore
      // 081: ldc2_w -6068130189382516074
      // 084: lload 3
      // 085: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: goto 097
      // 08d: ldc2_w -5582542414794988582
      // 090: lload 3
      // 091: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: lload 3
      // 098: lconst_0
      // 099: lcmp
      // 09a: ifle 10f
      // 09d: aload 10
      // 09f: ifnull 11c
      // 0a2: aload 0
      // 0a3: ldc2_w -6129505639533166180
      // 0a6: lload 3
      // 0a7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: aload 2
      // 0ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b0: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b3: aload 0
      // 0b4: ldc2_w -5545785099412524701
      // 0b7: lload 3
      // 0b8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: aload 0
      // 0be: ldc2_w -5335320235878208363
      // 0c1: lload 3
      // 0c2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aload 0
      // 0c8: ldc2_w -5569851482295829650
      // 0cb: lload 3
      // 0cc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: lload 8
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: aload 0
      // 0d6: ldc2_w -6032477263533277545
      // 0d9: lload 3
      // 0da: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: bipush 6
      // 0e1: anewarray 656
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 5
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 4
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 3
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: bipush 2
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w -5538365173236692681
      // 109: lload 3
      // 10a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: goto 11c
      // 112: ldc2_w -5582542414794988582
      // 115: lload 3
      // 116: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: return
   }

   private void W(Object[] param1) {
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
      // 004: checkcast java/lang/StringBuilder
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/io/PushbackReader
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/u.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: ldc2_w 8062104815930399337
      // 024: lload 3
      // 025: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: bipush 0
      // 02b: istore 7
      // 02d: astore 6
      // 02f: aload 5
      // 031: invokevirtual java/io/PushbackReader.read ()I
      // 034: dup
      // 035: istore 7
      // 037: bipush -1
      // 038: if_icmpeq 1a4
      // 03b: iload 7
      // 03d: i2c
      // 03e: istore 8
      // 040: aload 2
      // 041: iload 8
      // 043: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 046: pop
      // 047: iload 8
      // 049: sipush 32238
      // 04c: ldc2_w 411556038301917472
      // 04f: lload 3
      // 050: lxor
      // 051: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: lload 3
      // 057: lconst_0
      // 058: lcmp
      // 059: ifle 092
      // 05c: aload 6
      // 05e: ifnonnull 092
      // 061: if_icmpne 19f
      // 064: goto 071
      // 067: ldc2_w 8340881887308554908
      // 06a: lload 3
      // 06b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 5
      // 073: invokevirtual java/io/PushbackReader.read ()I
      // 076: dup
      // 077: lload 3
      // 078: lconst_0
      // 079: lcmp
      // 07a: iflt 085
      // 07d: istore 7
      // 07f: aload 6
      // 081: ifnonnull 0a5
      // 084: bipush -1
      // 085: goto 092
      // 088: ldc2_w 8340881887308554908
      // 08b: lload 3
      // 08c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: if_icmpeq 19f
      // 095: iload 7
      // 097: i2c
      // 098: goto 0a5
      // 09b: ldc2_w 8340881887308554908
      // 09e: lload 3
      // 09f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: istore 9
      // 0a7: iload 9
      // 0a9: sipush 7031
      // 0ac: ldc2_w 4322801223532168990
      // 0af: lload 3
      // 0b0: lxor
      // 0b1: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: aload 6
      // 0b8: ifnonnull 0ec
      // 0bb: if_icmpne 185
      // 0be: goto 0cb
      // 0c1: ldc2_w 8340881887308554908
      // 0c4: lload 3
      // 0c5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: lload 3
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 16f
      // 0d3: aload 6
      // 0d5: ifnonnull 16f
      // 0d8: goto 0e5
      // 0db: ldc2_w 8340881887308554908
      // 0de: lload 3
      // 0df: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: invokevirtual java/io/PushbackReader.read ()I
      // 0e8: dup
      // 0e9: istore 7
      // 0eb: bipush -1
      // 0ec: if_icmpeq 160
      // 0ef: iload 7
      // 0f1: i2c
      // 0f2: istore 10
      // 0f4: aload 6
      // 0f6: lload 3
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 157
      // 0fc: ifnonnull 155
      // 0ff: iload 10
      // 101: sipush 14229
      // 104: ldc2_w 8308407795499461463
      // 107: lload 3
      // 108: lxor
      // 109: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: if_icmpne 13b
      // 111: goto 11e
      // 114: ldc2_w 8340881887308554908
      // 117: lload 3
      // 118: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 2
      // 11f: sipush 8933
      // 122: ldc2_w 6044751625849181298
      // 125: lload 3
      // 126: lxor
      // 127: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: pop
      // 130: return
      // 131: ldc2_w 8340881887308554908
      // 134: lload 3
      // 135: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 5
      // 13d: iload 10
      // 13f: ldc2_w 7813965305902058640
      // 142: lload 3
      // 143: invokedynamic i (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: aload 5
      // 14a: iload 9
      // 14c: ldc2_w 7813965305902058640
      // 14f: lload 3
      // 150: invokedynamic i (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: aload 6
      // 157: lload 3
      // 158: lconst_0
      // 159: lcmp
      // 15a: iflt 1a1
      // 15d: ifnull 19f
      // 160: aload 5
      // 162: goto 16f
      // 165: ldc2_w 8340881887308554908
      // 168: lload 3
      // 169: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: iload 9
      // 171: ldc2_w 7813965305902058640
      // 174: lload 3
      // 175: invokedynamic i (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: aload 6
      // 17c: lload 3
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 1a1
      // 182: ifnull 19f
      // 185: aload 5
      // 187: iload 9
      // 189: ldc2_w 7813965305902058640
      // 18c: lload 3
      // 18d: invokedynamic i (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: goto 19f
      // 195: ldc2_w 8340881887308554908
      // 198: lload 3
      // 199: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: aload 6
      // 1a1: ifnull 02f
      // 1a4: new com/zelix/_s2
      // 1a7: dup
      // 1a8: new java/lang/StringBuilder
      // 1ab: dup
      // 1ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 1af: sipush 17461
      // 1b2: ldc2_w 4966456458092507827
      // 1b5: lload 3
      // 1b6: lxor
      // 1b7: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: aload 0
      // 1c0: ldc2_w 8347061915527055853
      // 1c3: lload 3
      // 1c4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: ldc "'"
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d4: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // 1d7: athrow
   }

   public void L(Object[] param1) {
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
      // 004: checkcast com/zelix/_n8
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/List
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/io/PrintWriter
      // 020: astore 5
      // 022: pop
      // 023: getstatic com/zelix/u.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 43906241917294
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 116766596949817
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 82269757295894
      // 03c: lxor
      // 03d: lstore 11
      // 03f: dup2
      // 040: ldc2_w 104799574527197
      // 043: lxor
      // 044: lstore 13
      // 046: pop2
      // 047: ldc2_w -5300940841686563868
      // 04a: lload 3
      // 04b: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: astore 15
      // 052: aload 15
      // 054: ifnonnull 0a4
      // 057: aload 2
      // 058: ifnull 11f
      // 05b: goto 068
      // 05e: ldc2_w -6175037497713427695
      // 061: lload 3
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: ldc2_w -5610200613286946473
      // 06c: lload 3
      // 06d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 6
      // 074: lload 11
      // 076: aload 2
      // 077: bipush 3
      // 078: anewarray 656
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 2
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 1
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: ldc2_w -5829281970671698900
      // 091: lload 3
      // 092: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: goto 0a4
      // 09a: ldc2_w -6175037497713427695
      // 09d: lload 3
      // 09e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: aload 15
      // 0a7: lload 3
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: iflt 10b
      // 0ad: ifnonnull 0ef
      // 0b0: ldc2_w -5610200613286946473
      // 0b3: lload 3
      // 0b4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: lload 9
      // 0bb: bipush 1
      // 0bc: anewarray 656
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w -5288803612853522362
      // 0cb: lload 3
      // 0cc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: ifeq 192
      // 0d4: goto 0e1
      // 0d7: ldc2_w -6175037497713427695
      // 0da: lload 3
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: goto 0ef
      // 0e5: ldc2_w -6175037497713427695
      // 0e8: lload 3
      // 0e9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: aload 2
      // 0f0: aload 5
      // 0f2: lload 13
      // 0f4: bipush 3
      // 0f5: anewarray 656
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 2
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 1
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 0
      // 109: swap
      // 10a: aastore
      // 10b: ldc2_w -5189700953260206624
      // 10e: lload 3
      // 10f: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: lload 3
      // 115: lconst_0
      // 116: lcmp
      // 117: iflt 185
      // 11a: aload 15
      // 11c: ifnull 192
      // 11f: aload 0
      // 120: ldc2_w -5610200613286946473
      // 123: lload 3
      // 124: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: aload 6
      // 12b: aload 0
      // 12c: ldc2_w -6070176608200054360
      // 12f: lload 3
      // 130: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: aload 0
      // 136: ldc2_w -5963278416948775842
      // 139: lload 3
      // 13a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 0
      // 140: ldc2_w -6162922331198463067
      // 143: lload 3
      // 144: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: aload 0
      // 14a: ldc2_w -5439404146870491556
      // 14d: lload 3
      // 14e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: lload 7
      // 155: bipush 6
      // 157: anewarray 656
      // 15a: dup_x2
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 160: bipush 5
      // 161: swap
      // 162: aastore
      // 163: dup_x1
      // 164: swap
      // 165: bipush 4
      // 166: swap
      // 167: aastore
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 3
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 2
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 1
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: ldc2_w -5296983603776837525
      // 17f: lload 3
      // 180: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: goto 192
      // 188: ldc2_w -6175037497713427695
      // 18b: lload 3
      // 18c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: return
   }

   public static String h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/io/InputStream
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/wp
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast com/zelix/wp
      // 015: astore 1
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast com/zelix/wp
      // 01c: astore 4
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 5
      // 029: pop
      // 02a: getstatic com/zelix/u.a J
      // 02d: lload 5
      // 02f: lxor
      // 030: lstore 5
      // 032: lload 5
      // 034: dup2
      // 035: ldc2_w 55673654426669
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 86946444934220
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 25622297559200
      // 046: lxor
      // 047: lstore 11
      // 049: pop2
      // 04a: aconst_null
      // 04b: astore 14
      // 04d: ldc2_w 8065488056246032997
      // 050: lload 5
      // 052: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: aconst_null
      // 058: astore 15
      // 05a: astore 13
      // 05c: aconst_null
      // 05d: astore 16
      // 05f: new java/io/PushbackInputStream
      // 062: dup
      // 063: aload 2
      // 064: bipush 4
      // 065: invokespecial java/io/PushbackInputStream.<init> (Ljava/io/InputStream;I)V
      // 068: astore 17
      // 06a: bipush 1
      // 06b: istore 18
      // 06d: new java/lang/StringBuffer
      // 070: dup
      // 071: invokespecial java/lang/StringBuffer.<init> ()V
      // 074: astore 19
      // 076: aload 17
      // 078: lload 7
      // 07a: aload 3
      // 07b: aload 1
      // 07c: aload 4
      // 07e: bipush 5
      // 07f: anewarray 656
      // 082: dup_x1
      // 083: swap
      // 084: bipush 4
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 3
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: bipush 2
      // 08f: swap
      // 090: aastore
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 1
      // 098: swap
      // 099: aastore
      // 09a: dup_x1
      // 09b: swap
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: ldc2_w 8374201145575224741
      // 0a2: lload 5
      // 0a4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: astore 14
      // 0ab: lload 9
      // 0ad: aload 17
      // 0af: aload 3
      // 0b0: lload 11
      // 0b2: invokevirtual com/zelix/wp.C (J)I
      // 0b5: bipush 3
      // 0b6: anewarray 656
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be: bipush 2
      // 0bf: swap
      // 0c0: aastore
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: bipush 1
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 0
      // 0cd: swap
      // 0ce: aastore
      // 0cf: ldc2_w 8487750725759927351
      // 0d2: lload 5
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: pop
      // 0da: new java/io/InputStreamReader
      // 0dd: dup
      // 0de: aload 17
      // 0e0: aload 14
      // 0e2: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0e5: astore 20
      // 0e7: new java/io/PushbackReader
      // 0ea: dup
      // 0eb: new java/io/BufferedReader
      // 0ee: dup
      // 0ef: aload 20
      // 0f1: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0f4: sipush 4070
      // 0f7: ldc2_w 1757124393349436170
      // 0fa: lload 5
      // 0fc: lxor
      // 0fd: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: invokespecial java/io/PushbackReader.<init> (Ljava/io/Reader;I)V
      // 105: astore 16
      // 107: bipush 0
      // 108: istore 21
      // 10a: aload 16
      // 10c: invokevirtual java/io/PushbackReader.read ()I
      // 10f: dup
      // 110: istore 21
      // 112: bipush -1
      // 113: if_icmpeq 353
      // 116: iload 21
      // 118: i2c
      // 119: istore 22
      // 11b: iload 22
      // 11d: sipush 31492
      // 120: ldc2_w 7793655976600610790
      // 123: lload 5
      // 125: lxor
      // 126: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: aload 13
      // 12d: lload 5
      // 12f: lconst_0
      // 130: lcmp
      // 131: ifle 15a
      // 134: ifnonnull 158
      // 137: if_icmpeq 10a
      // 13a: goto 148
      // 13d: ldc2_w 8344260643972981392
      // 140: lload 5
      // 142: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: iload 22
      // 14a: sipush 11837
      // 14d: ldc2_w 2677389473531654833
      // 150: lload 5
      // 152: lxor
      // 153: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: aload 13
      // 15a: lload 5
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: ifle 18e
      // 161: ifnonnull 185
      // 164: if_icmpeq 10a
      // 167: goto 175
      // 16a: ldc2_w 8344260643972981392
      // 16d: lload 5
      // 16f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: iload 22
      // 177: sipush 19661
      // 17a: ldc2_w 1238624353120587777
      // 17d: lload 5
      // 17f: lxor
      // 180: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: lload 5
      // 187: lconst_0
      // 188: lcmp
      // 189: iflt 1cc
      // 18c: aload 13
      // 18e: ifnonnull 1cc
      // 191: if_icmpeq 10a
      // 194: goto 1a2
      // 197: ldc2_w 8344260643972981392
      // 19a: lload 5
      // 19c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: iload 22
      // 1a4: aload 13
      // 1a6: lload 5
      // 1a8: lconst_0
      // 1a9: lcmp
      // 1aa: iflt 1ed
      // 1ad: ifnonnull 1e4
      // 1b0: sipush 14617
      // 1b3: ldc2_w 3409083580957615440
      // 1b6: lload 5
      // 1b8: lxor
      // 1b9: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: goto 1cc
      // 1c1: ldc2_w 8344260643972981392
      // 1c4: lload 5
      // 1c6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: if_icmpne 1e2
      // 1cf: aload 13
      // 1d1: ifnull 10a
      // 1d4: goto 1e2
      // 1d7: ldc2_w 8344260643972981392
      // 1da: lload 5
      // 1dc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: iload 18
      // 1e4: lload 5
      // 1e6: lconst_0
      // 1e7: lcmp
      // 1e8: ifle 292
      // 1eb: aload 13
      // 1ed: ifnonnull 292
      // 1f0: ifeq 290
      // 1f3: goto 201
      // 1f6: ldc2_w 8344260643972981392
      // 1f9: lload 5
      // 1fb: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: bipush 0
      // 202: istore 18
      // 204: iload 22
      // 206: sipush 12197
      // 209: ldc2_w 8862804878151840721
      // 20c: lload 5
      // 20e: lxor
      // 20f: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: lload 5
      // 216: lconst_0
      // 217: lcmp
      // 218: ifle 254
      // 21b: aload 13
      // 21d: ifnonnull 254
      // 220: if_icmpne 353
      // 223: goto 231
      // 226: ldc2_w 8344260643972981392
      // 229: lload 5
      // 22b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 16
      // 233: invokevirtual java/io/PushbackReader.read ()I
      // 236: dup
      // 237: lload 5
      // 239: lconst_0
      // 23a: lcmp
      // 23b: iflt 246
      // 23e: istore 21
      // 240: aload 13
      // 242: ifnonnull 268
      // 245: bipush -1
      // 246: goto 254
      // 249: ldc2_w 8344260643972981392
      // 24c: lload 5
      // 24e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: if_icmpeq 353
      // 257: iload 21
      // 259: i2c
      // 25a: goto 268
      // 25d: ldc2_w 8344260643972981392
      // 260: lload 5
      // 262: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: istore 23
      // 26a: iload 23
      // 26c: sipush 19662
      // 26f: ldc2_w 2334448052599918672
      // 272: lload 5
      // 274: lxor
      // 275: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: if_icmpne 353
      // 27d: aload 13
      // 27f: ifnull 10a
      // 282: goto 290
      // 285: ldc2_w 8344260643972981392
      // 288: lload 5
      // 28a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: athrow
      // 290: iload 22
      // 292: sipush 19662
      // 295: ldc2_w 2334448052599918672
      // 298: lload 5
      // 29a: lxor
      // 29b: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: lload 5
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: ifle 2e0
      // 2a7: aload 13
      // 2a9: ifnonnull 2e0
      // 2ac: if_icmpne 33f
      // 2af: goto 2bd
      // 2b2: ldc2_w 8344260643972981392
      // 2b5: lload 5
      // 2b7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: athrow
      // 2bd: aload 16
      // 2bf: invokevirtual java/io/PushbackReader.read ()I
      // 2c2: dup
      // 2c3: lload 5
      // 2c5: lconst_0
      // 2c6: lcmp
      // 2c7: iflt 2d2
      // 2ca: istore 21
      // 2cc: aload 13
      // 2ce: ifnonnull 2f4
      // 2d1: bipush -1
      // 2d2: goto 2e0
      // 2d5: ldc2_w 8344260643972981392
      // 2d8: lload 5
      // 2da: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: athrow
      // 2e0: if_icmpeq 33f
      // 2e3: iload 21
      // 2e5: i2c
      // 2e6: goto 2f4
      // 2e9: ldc2_w 8344260643972981392
      // 2ec: lload 5
      // 2ee: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: athrow
      // 2f4: istore 23
      // 2f6: lload 5
      // 2f8: lconst_0
      // 2f9: lcmp
      // 2fa: ifle 331
      // 2fd: iload 23
      // 2ff: sipush 28257
      // 302: ldc2_w 719102575658873518
      // 305: lload 5
      // 307: lxor
      // 308: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: if_icmpne 323
      // 310: aload 13
      // 312: ifnull 353
      // 315: goto 323
      // 318: ldc2_w 8344260643972981392
      // 31b: lload 5
      // 31d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: athrow
      // 323: aload 16
      // 325: iload 23
      // 327: ldc2_w 7817350863949188252
      // 32a: lload 5
      // 32c: invokedynamic m (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: goto 33f
      // 334: ldc2_w 8344260643972981392
      // 337: lload 5
      // 339: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: athrow
      // 33f: aload 19
      // 341: iload 22
      // 343: ldc2_w 8327965460438751250
      // 346: lload 5
      // 348: invokedynamic m (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: pop
      // 34e: aload 13
      // 350: ifnull 10a
      // 353: aload 19
      // 355: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 358: astore 22
      // 35a: aload 22
      // 35c: sipush 16539
      // 35f: ldc2_w 8558135934474450444
      // 362: lload 5
      // 364: lxor
      // 365: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 36d: istore 23
      // 36f: iload 23
      // 371: lload 5
      // 373: lconst_0
      // 374: lcmp
      // 375: ifle 3b8
      // 378: bipush -1
      // 379: lload 5
      // 37b: lconst_0
      // 37c: lcmp
      // 37d: ifle 113
      // 380: aload 13
      // 382: ifnonnull 3b7
      // 385: if_icmple 422
      // 388: goto 396
      // 38b: ldc2_w 8344260643972981392
      // 38e: lload 5
      // 390: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: athrow
      // 396: iload 23
      // 398: sipush 18651
      // 39b: ldc2_w 8214320256656113245
      // 39e: lload 5
      // 3a0: lxor
      // 3a1: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: invokevirtual java/lang/String.length ()I
      // 3a9: goto 3b7
      // 3ac: ldc2_w 8344260643972981392
      // 3af: lload 5
      // 3b1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: iadd
      // 3b8: istore 24
      // 3ba: iload 24
      // 3bc: aload 13
      // 3be: ifnonnull 3fa
      // 3c1: aload 22
      // 3c3: invokevirtual java/lang/String.length ()I
      // 3c6: if_icmpge 422
      // 3c9: goto 3d7
      // 3cc: ldc2_w 8344260643972981392
      // 3cf: lload 5
      // 3d1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d6: athrow
      // 3d7: aload 22
      // 3d9: sipush 7501
      // 3dc: ldc2_w 1147876305432396238
      // 3df: lload 5
      // 3e1: lxor
      // 3e2: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: iload 24
      // 3e9: invokevirtual java/lang/String.indexOf (II)I
      // 3ec: goto 3fa
      // 3ef: ldc2_w 8344260643972981392
      // 3f2: lload 5
      // 3f4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f9: athrow
      // 3fa: istore 25
      // 3fc: iload 25
      // 3fe: bipush -1
      // 3ff: if_icmple 422
      // 402: aload 22
      // 404: iload 24
      // 406: iload 25
      // 408: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 40b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 40e: astore 15
      // 410: lload 5
      // 412: lconst_0
      // 413: lcmp
      // 414: ifle 422
      // 417: aload 15
      // 419: invokevirtual java/lang/String.length ()I
      // 41c: ifne 422
      // 41f: aconst_null
      // 420: astore 15
      // 422: lload 5
      // 424: lconst_0
      // 425: lcmp
      // 426: ifle 44d
      // 429: aload 16
      // 42b: aload 13
      // 42d: ifnonnull 443
      // 430: ifnull 455
      // 433: goto 441
      // 436: ldc2_w 8344260643972981392
      // 439: lload 5
      // 43b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 440: athrow
      // 441: aload 16
      // 443: ldc2_w 7643068721100604845
      // 446: lload 5
      // 448: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44d: goto 580
      // 450: astore 18
      // 452: goto 580
      // 455: lload 5
      // 457: lconst_0
      // 458: lcmp
      // 459: ifle 47e
      // 45c: aload 2
      // 45d: aload 13
      // 45f: ifnonnull 474
      // 462: ifnull 580
      // 465: goto 473
      // 468: ldc2_w 8344260643972981392
      // 46b: lload 5
      // 46d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: athrow
      // 473: aload 2
      // 474: ldc2_w 8500436853468400622
      // 477: lload 5
      // 479: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: goto 580
      // 481: astore 18
      // 483: goto 580
      // 486: astore 18
      // 488: lload 5
      // 48a: lconst_0
      // 48b: lcmp
      // 48c: ifle 4b3
      // 48f: aload 16
      // 491: aload 13
      // 493: ifnonnull 4a9
      // 496: ifnull 4c4
      // 499: goto 4a7
      // 49c: ldc2_w 8344260643972981392
      // 49f: lload 5
      // 4a1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a6: athrow
      // 4a7: aload 16
      // 4a9: ldc2_w 7643068721100604845
      // 4ac: lload 5
      // 4ae: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b3: goto 580
      // 4b6: astore 18
      // 4b8: lload 5
      // 4ba: lconst_0
      // 4bb: lcmp
      // 4bc: ifle 580
      // 4bf: aload 13
      // 4c1: ifnull 580
      // 4c4: lload 5
      // 4c6: lconst_0
      // 4c7: lcmp
      // 4c8: iflt 4fb
      // 4cb: aload 2
      // 4cc: aload 13
      // 4ce: ifnonnull 4f1
      // 4d1: goto 4df
      // 4d4: ldc2_w 8344260643972981392
      // 4d7: lload 5
      // 4d9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: ifnull 580
      // 4e2: goto 4f0
      // 4e5: ldc2_w 8344260643972981392
      // 4e8: lload 5
      // 4ea: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ef: athrow
      // 4f0: aload 2
      // 4f1: ldc2_w 8500436853468400622
      // 4f4: lload 5
      // 4f6: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: goto 580
      // 4fe: astore 18
      // 500: goto 580
      // 503: astore 26
      // 505: lload 5
      // 507: lconst_0
      // 508: lcmp
      // 509: iflt 530
      // 50c: aload 16
      // 50e: aload 13
      // 510: ifnonnull 526
      // 513: ifnull 541
      // 516: goto 524
      // 519: ldc2_w 8344260643972981392
      // 51c: lload 5
      // 51e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 523: athrow
      // 524: aload 16
      // 526: ldc2_w 7643068721100604845
      // 529: lload 5
      // 52b: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 530: goto 57d
      // 533: astore 27
      // 535: lload 5
      // 537: lconst_0
      // 538: lcmp
      // 539: ifle 541
      // 53c: aload 13
      // 53e: ifnull 57d
      // 541: lload 5
      // 543: lconst_0
      // 544: lcmp
      // 545: iflt 578
      // 548: aload 2
      // 549: aload 13
      // 54b: ifnonnull 56e
      // 54e: goto 55c
      // 551: ldc2_w 8344260643972981392
      // 554: lload 5
      // 556: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: athrow
      // 55c: ifnull 57d
      // 55f: goto 56d
      // 562: ldc2_w 8344260643972981392
      // 565: lload 5
      // 567: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56c: athrow
      // 56d: aload 2
      // 56e: ldc2_w 8500436853468400622
      // 571: lload 5
      // 573: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 578: goto 57d
      // 57b: astore 27
      // 57d: aload 26
      // 57f: athrow
      // 580: aload 15
      // 582: aload 13
      // 584: lload 5
      // 586: lconst_0
      // 587: lcmp
      // 588: ifle 5a7
      // 58b: ifnonnull 5a5
      // 58e: ifnonnull 5a3
      // 591: goto 59f
      // 594: ldc2_w 8344260643972981392
      // 597: lload 5
      // 599: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: athrow
      // 59f: aload 14
      // 5a1: astore 15
      // 5a3: aload 15
      // 5a5: aload 13
      // 5a7: ifnonnull 675
      // 5aa: sipush 17296
      // 5ad: ldc2_w 8470731857066325276
      // 5b0: lload 5
      // 5b2: lxor
      // 5b3: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5bb: ifeq 673
      // 5be: goto 5cc
      // 5c1: ldc2_w 8344260643972981392
      // 5c4: lload 5
      // 5c6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: aload 1
      // 5cd: lload 11
      // 5cf: invokevirtual com/zelix/wp.C (J)I
      // 5d2: aload 13
      // 5d4: lload 5
      // 5d6: lconst_0
      // 5d7: lcmp
      // 5d8: iflt 61a
      // 5db: ifnonnull 618
      // 5de: goto 5ec
      // 5e1: ldc2_w 8344260643972981392
      // 5e4: lload 5
      // 5e6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5eb: athrow
      // 5ec: bipush 2
      // 5ed: if_icmpne 611
      // 5f0: goto 5fe
      // 5f3: ldc2_w 8344260643972981392
      // 5f6: lload 5
      // 5f8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fd: athrow
      // 5fe: aload 3
      // 5ff: bipush 2
      // 600: invokevirtual com/zelix/wp.V (I)V
      // 603: goto 611
      // 606: ldc2_w 8344260643972981392
      // 609: lload 5
      // 60b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 610: athrow
      // 611: aload 4
      // 613: lload 11
      // 615: invokevirtual com/zelix/wp.C (J)I
      // 618: aload 13
      // 61a: ifnonnull 65f
      // 61d: ifne 64a
      // 620: goto 62e
      // 623: ldc2_w 8344260643972981392
      // 626: lload 5
      // 628: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62d: athrow
      // 62e: sipush 16068
      // 631: lload 5
      // 633: lconst_0
      // 634: lcmp
      // 635: ifle 651
      // 638: ldc2_w 8753740349058680920
      // 63b: lload 5
      // 63d: lxor
      // 63e: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 643: astore 15
      // 645: aload 13
      // 647: ifnull 673
      // 64a: aload 4
      // 64c: lload 11
      // 64e: invokevirtual com/zelix/wp.C (J)I
      // 651: goto 65f
      // 654: ldc2_w 8344260643972981392
      // 657: lload 5
      // 659: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65e: athrow
      // 65f: bipush 1
      // 660: if_icmpne 673
      // 663: sipush 3981
      // 666: ldc2_w 8294885700609751316
      // 669: lload 5
      // 66b: lxor
      // 66c: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 671: astore 15
      // 673: aload 15
      // 675: areturn
   }

   private static String g(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/io/PushbackInputStream
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/wp
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/wp
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/wp
      // 029: astore 3
      // 02a: pop
      // 02b: getstatic com/zelix/u.a J
      // 02e: lload 1
      // 02f: lxor
      // 030: lstore 1
      // 031: lload 1
      // 032: dup2
      // 033: ldc2_w 65399337480855
      // 036: lxor
      // 037: lstore 7
      // 039: pop2
      // 03a: ldc2_w -2146716372084336706
      // 03d: lload 1
      // 03e: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: aload 6
      // 045: bipush 0
      // 046: invokevirtual com/zelix/wp.V (I)V
      // 049: astore 9
      // 04b: aload 4
      // 04d: bipush 0
      // 04e: invokevirtual com/zelix/wp.V (I)V
      // 051: aload 3
      // 052: sipush 15837
      // 055: ldc2_w 404170247456386258
      // 058: lload 1
      // 059: lxor
      // 05a: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokevirtual com/zelix/wp.V (I)V
      // 062: sipush 6124
      // 065: ldc2_w 3265855662852517049
      // 068: lload 1
      // 069: lxor
      // 06a: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: astore 10
      // 071: bipush 4
      // 072: newarray 8
      // 074: astore 11
      // 076: lload 7
      // 078: aload 5
      // 07a: aload 11
      // 07c: bipush 3
      // 07d: anewarray 656
      // 080: dup_x1
      // 081: swap
      // 082: bipush 2
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: bipush 1
      // 088: swap
      // 089: aastore
      // 08a: dup_x2
      // 08b: dup_x2
      // 08c: pop
      // 08d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w -100132583329138991
      // 096: lload 1
      // 097: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: istore 12
      // 09e: iload 12
      // 0a0: bipush -1
      // 0a1: aload 9
      // 0a3: ifnonnull 0c9
      // 0a6: if_icmpne 0b9
      // 0a9: goto 0b6
      // 0ac: ldc2_w -137414032702394549
      // 0af: lload 1
      // 0b0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: bipush 0
      // 0b7: istore 12
      // 0b9: aload 5
      // 0bb: aload 11
      // 0bd: ldc2_w -509695876362098226
      // 0c0: lload 1
      // 0c1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: iload 12
      // 0c8: bipush 1
      // 0c9: aload 9
      // 0cb: ifnonnull 0fc
      // 0ce: if_icmple 553
      // 0d1: goto 0de
      // 0d4: ldc2_w -137414032702394549
      // 0d7: lload 1
      // 0d8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 11
      // 0e0: bipush 0
      // 0e1: baload
      // 0e2: sipush 9672
      // 0e5: ldc2_w 7967555342379611264
      // 0e8: lload 1
      // 0e9: lxor
      // 0ea: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: goto 0fc
      // 0f2: ldc2_w -137414032702394549
      // 0f5: lload 1
      // 0f6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: iand
      // 0fd: istore 13
      // 0ff: aload 11
      // 101: bipush 1
      // 102: baload
      // 103: sipush 7264
      // 106: ldc2_w 5581121208533503429
      // 109: lload 1
      // 10a: lxor
      // 10b: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: iand
      // 111: istore 14
      // 113: aload 11
      // 115: bipush 2
      // 116: baload
      // 117: sipush 7264
      // 11a: ldc2_w 5581121208533503429
      // 11d: lload 1
      // 11e: lxor
      // 11f: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: iand
      // 125: istore 15
      // 127: aload 11
      // 129: bipush 3
      // 12a: baload
      // 12b: sipush 7264
      // 12e: ldc2_w 5581121208533503429
      // 131: lload 1
      // 132: lxor
      // 133: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iand
      // 139: istore 16
      // 13b: iload 13
      // 13d: sipush 12197
      // 140: ldc2_w 8862811828133068298
      // 143: lload 1
      // 144: lxor
      // 145: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: aload 9
      // 14c: ifnonnull 219
      // 14f: if_icmpne 20a
      // 152: goto 15f
      // 155: ldc2_w -137414032702394549
      // 158: lload 1
      // 159: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: iload 14
      // 161: sipush 19662
      // 164: ldc2_w 2334459244398812555
      // 167: lload 1
      // 168: lxor
      // 169: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: aload 9
      // 170: ifnonnull 219
      // 173: goto 180
      // 176: ldc2_w -137414032702394549
      // 179: lload 1
      // 17a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: lload 1
      // 181: lconst_0
      // 182: lcmp
      // 183: iflt 20f
      // 186: if_icmpne 20a
      // 189: goto 196
      // 18c: ldc2_w -137414032702394549
      // 18f: lload 1
      // 190: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: iload 15
      // 198: sipush 21835
      // 19b: ldc2_w 8171541862359368807
      // 19e: lload 1
      // 19f: lxor
      // 1a0: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: aload 9
      // 1a7: ifnonnull 219
      // 1aa: goto 1b7
      // 1ad: ldc2_w -137414032702394549
      // 1b0: lload 1
      // 1b1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: lload 1
      // 1b8: lconst_0
      // 1b9: lcmp
      // 1ba: iflt 20f
      // 1bd: if_icmpne 20a
      // 1c0: goto 1cd
      // 1c3: ldc2_w -137414032702394549
      // 1c6: lload 1
      // 1c7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: iload 16
      // 1cf: sipush 1384
      // 1d2: ldc2_w 7466376337388590201
      // 1d5: lload 1
      // 1d6: lxor
      // 1d7: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: aload 9
      // 1de: lload 1
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: ifle 21b
      // 1e4: ifnonnull 219
      // 1e7: goto 1f4
      // 1ea: ldc2_w -137414032702394549
      // 1ed: lload 1
      // 1ee: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: if_icmpne 20a
      // 1f7: goto 204
      // 1fa: ldc2_w -137414032702394549
      // 1fd: lload 1
      // 1fe: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: lload 1
      // 205: lconst_0
      // 206: lcmp
      // 207: ifge 553
      // 20a: iload 13
      // 20c: sipush 28175
      // 20f: ldc2_w 3297026295949442999
      // 212: lload 1
      // 213: lxor
      // 214: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: aload 9
      // 21b: ifnonnull 2dc
      // 21e: if_icmpne 2c0
      // 221: goto 22e
      // 224: ldc2_w -137414032702394549
      // 227: lload 1
      // 228: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: athrow
      // 22e: iload 14
      // 230: sipush 30365
      // 233: ldc2_w 5314529337055258607
      // 236: lload 1
      // 237: lxor
      // 238: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: aload 9
      // 23f: ifnonnull 2dc
      // 242: goto 24f
      // 245: ldc2_w -137414032702394549
      // 248: lload 1
      // 249: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: athrow
      // 24f: lload 1
      // 250: lconst_0
      // 251: lcmp
      // 252: iflt 2cf
      // 255: if_icmpne 2c0
      // 258: goto 265
      // 25b: ldc2_w -137414032702394549
      // 25e: lload 1
      // 25f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: iload 15
      // 267: sipush 2926
      // 26a: ldc2_w 470563778102843992
      // 26d: lload 1
      // 26e: lxor
      // 26f: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: aload 9
      // 276: lload 1
      // 277: lconst_0
      // 278: lcmp
      // 279: ifle 2de
      // 27c: ifnonnull 2dc
      // 27f: goto 28c
      // 282: ldc2_w -137414032702394549
      // 285: lload 1
      // 286: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: athrow
      // 28c: lload 1
      // 28d: lconst_0
      // 28e: lcmp
      // 28f: ifle 2cf
      // 292: if_icmpne 2c0
      // 295: goto 2a2
      // 298: ldc2_w -137414032702394549
      // 29b: lload 1
      // 29c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: aload 6
      // 2a4: bipush 3
      // 2a5: invokevirtual com/zelix/wp.V (I)V
      // 2a8: aload 4
      // 2aa: bipush 3
      // 2ab: invokevirtual com/zelix/wp.V (I)V
      // 2ae: aload 9
      // 2b0: ifnull 553
      // 2b3: goto 2c0
      // 2b6: ldc2_w -137414032702394549
      // 2b9: lload 1
      // 2ba: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: iload 13
      // 2c2: sipush 7264
      // 2c5: ldc2_w 5581121208533503429
      // 2c8: lload 1
      // 2c9: lxor
      // 2ca: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: goto 2dc
      // 2d2: ldc2_w -137414032702394549
      // 2d5: lload 1
      // 2d6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: aload 9
      // 2de: ifnonnull 369
      // 2e1: if_icmpne 34d
      // 2e4: goto 2f1
      // 2e7: ldc2_w -137414032702394549
      // 2ea: lload 1
      // 2eb: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: athrow
      // 2f1: iload 14
      // 2f3: sipush 32247
      // 2f6: ldc2_w 4775441324255784168
      // 2f9: lload 1
      // 2fa: lxor
      // 2fb: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: aload 9
      // 302: lload 1
      // 303: lconst_0
      // 304: lcmp
      // 305: iflt 36b
      // 308: ifnonnull 369
      // 30b: goto 318
      // 30e: ldc2_w -137414032702394549
      // 311: lload 1
      // 312: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: athrow
      // 318: if_icmpne 34d
      // 31b: goto 328
      // 31e: ldc2_w -137414032702394549
      // 321: lload 1
      // 322: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: sipush 32434
      // 32b: ldc2_w 9152810768035235298
      // 32e: lload 1
      // 32f: lxor
      // 330: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: lload 1
      // 336: lconst_0
      // 337: lcmp
      // 338: iflt 555
      // 33b: astore 10
      // 33d: aload 6
      // 33f: bipush 2
      // 340: invokevirtual com/zelix/wp.V (I)V
      // 343: aload 3
      // 344: bipush 0
      // 345: invokevirtual com/zelix/wp.V (I)V
      // 348: aload 9
      // 34a: ifnull 553
      // 34d: iload 13
      // 34f: sipush 24237
      // 352: ldc2_w 6834777111297134496
      // 355: lload 1
      // 356: lxor
      // 357: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: goto 369
      // 35f: ldc2_w -137414032702394549
      // 362: lload 1
      // 363: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: athrow
      // 369: aload 9
      // 36b: ifnonnull 408
      // 36e: if_icmpne 3da
      // 371: goto 37e
      // 374: ldc2_w -137414032702394549
      // 377: lload 1
      // 378: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: athrow
      // 37e: iload 14
      // 380: sipush 7264
      // 383: ldc2_w 5581121208533503429
      // 386: lload 1
      // 387: lxor
      // 388: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: lload 1
      // 38e: lconst_0
      // 38f: lcmp
      // 390: ifle 408
      // 393: aload 9
      // 395: ifnonnull 408
      // 398: goto 3a5
      // 39b: ldc2_w -137414032702394549
      // 39e: lload 1
      // 39f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: athrow
      // 3a5: if_icmpne 3da
      // 3a8: goto 3b5
      // 3ab: ldc2_w -137414032702394549
      // 3ae: lload 1
      // 3af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: athrow
      // 3b5: sipush 32434
      // 3b8: ldc2_w 9152810768035235298
      // 3bb: lload 1
      // 3bc: lxor
      // 3bd: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c2: lload 1
      // 3c3: lconst_0
      // 3c4: lcmp
      // 3c5: iflt 555
      // 3c8: astore 10
      // 3ca: aload 6
      // 3cc: bipush 2
      // 3cd: invokevirtual com/zelix/wp.V (I)V
      // 3d0: aload 3
      // 3d1: bipush 1
      // 3d2: invokevirtual com/zelix/wp.V (I)V
      // 3d5: aload 9
      // 3d7: ifnull 553
      // 3da: iload 13
      // 3dc: aload 9
      // 3de: ifnonnull 4c4
      // 3e1: goto 3ee
      // 3e4: ldc2_w -137414032702394549
      // 3e7: lload 1
      // 3e8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: athrow
      // 3ee: sipush 12197
      // 3f1: ldc2_w 8862811828133068298
      // 3f4: lload 1
      // 3f5: lxor
      // 3f6: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: goto 408
      // 3fe: ldc2_w -137414032702394549
      // 401: lload 1
      // 402: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: athrow
      // 408: if_icmpne 4b5
      // 40b: iload 14
      // 40d: aload 9
      // 40f: ifnonnull 4c4
      // 412: goto 41f
      // 415: ldc2_w -137414032702394549
      // 418: lload 1
      // 419: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41e: athrow
      // 41f: lload 1
      // 420: lconst_0
      // 421: lcmp
      // 422: iflt 4b7
      // 425: ifne 4b5
      // 428: goto 435
      // 42b: ldc2_w -137414032702394549
      // 42e: lload 1
      // 42f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: athrow
      // 435: iload 15
      // 437: aload 9
      // 439: ifnonnull 4c4
      // 43c: goto 449
      // 43f: ldc2_w -137414032702394549
      // 442: lload 1
      // 443: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: athrow
      // 449: lload 1
      // 44a: lconst_0
      // 44b: lcmp
      // 44c: iflt 4b7
      // 44f: sipush 19662
      // 452: ldc2_w 2334459244398812555
      // 455: lload 1
      // 456: lxor
      // 457: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45c: if_icmpne 4b5
      // 45f: goto 46c
      // 462: ldc2_w -137414032702394549
      // 465: lload 1
      // 466: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: athrow
      // 46c: iload 16
      // 46e: aload 9
      // 470: lload 1
      // 471: lconst_0
      // 472: lcmp
      // 473: iflt 4c6
      // 476: ifnonnull 4c4
      // 479: goto 486
      // 47c: ldc2_w -137414032702394549
      // 47f: lload 1
      // 480: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 485: athrow
      // 486: ifne 4b5
      // 489: goto 496
      // 48c: ldc2_w -137414032702394549
      // 48f: lload 1
      // 490: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 495: athrow
      // 496: sipush 20565
      // 499: ldc2_w 5374112705619979034
      // 49c: lload 1
      // 49d: lxor
      // 49e: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: lload 1
      // 4a4: lconst_0
      // 4a5: lcmp
      // 4a6: ifle 555
      // 4a9: astore 10
      // 4ab: aload 3
      // 4ac: bipush 0
      // 4ad: invokevirtual com/zelix/wp.V (I)V
      // 4b0: aload 9
      // 4b2: ifnull 553
      // 4b5: iload 13
      // 4b7: goto 4c4
      // 4ba: ldc2_w -137414032702394549
      // 4bd: lload 1
      // 4be: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c3: athrow
      // 4c4: aload 9
      // 4c6: lload 1
      // 4c7: lconst_0
      // 4c8: lcmp
      // 4c9: iflt 4e3
      // 4cc: ifnonnull 4e1
      // 4cf: ifne 553
      // 4d2: goto 4df
      // 4d5: ldc2_w -137414032702394549
      // 4d8: lload 1
      // 4d9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: iload 14
      // 4e1: aload 9
      // 4e3: lload 1
      // 4e4: lconst_0
      // 4e5: lcmp
      // 4e6: ifle 51a
      // 4e9: ifnonnull 518
      // 4ec: sipush 12197
      // 4ef: ldc2_w 8862811828133068298
      // 4f2: lload 1
      // 4f3: lxor
      // 4f4: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f9: if_icmpne 553
      // 4fc: goto 509
      // 4ff: ldc2_w -137414032702394549
      // 502: lload 1
      // 503: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 508: athrow
      // 509: iload 15
      // 50b: goto 518
      // 50e: ldc2_w -137414032702394549
      // 511: lload 1
      // 512: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 517: athrow
      // 518: aload 9
      // 51a: ifnonnull 52f
      // 51d: ifne 553
      // 520: goto 52d
      // 523: ldc2_w -137414032702394549
      // 526: lload 1
      // 527: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52c: athrow
      // 52d: iload 16
      // 52f: sipush 19662
      // 532: ldc2_w 2334459244398812555
      // 535: lload 1
      // 536: lxor
      // 537: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53c: if_icmpne 553
      // 53f: sipush 32722
      // 542: ldc2_w 1889057325434487953
      // 545: lload 1
      // 546: lxor
      // 547: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: astore 10
      // 54e: aload 3
      // 54f: bipush 1
      // 550: invokevirtual com/zelix/wp.V (I)V
      // 553: aload 10
      // 555: areturn
   }

   static {
      long var20 = a ^ 60864877463652L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[30];
      int var16 = 0;
      String var15 = "÷vÅ²6\u0090xÿ\u0093\u0095ÐÊzyëÕ\u0010CK\b\u0090Ï$\u009cU<ÞÐ\u0002\u0092Vb0\u0010\u0081I.\u0000x\u0004¢ä¶\u0013G\"Ø+&\u0014\u0010ûT2\u0003ÇøjÆt\u0013¯Ê\u008a4\f®\u0010\u009aRë\u009a\u001cA#\u0081\u0088²\u00145X9\u00811\u0010\u0093´£j\u009bTcRDJ¨\u000fK\u000fú|8lîûkPNI\u0001¶ c;\u0088\u0014\u0019ÃÕ\u009c\u008c\u00940\u00adi ÚgÎòâ\u0006\u0097\u0004j½\u0090ûÜ·ø¸Ñ0u\u0093½Ó\u007f\u0090Ö\u001f\u0002\u0093ê\u008bm\u0080\u0010\u0094ç\u0000\u0083\u0000ßQ\u0091ª\u009d;Eò7\b\u0099\u0010!BÛ÷#&\u0084?\u0011iLWS7O \u0010uUy\u009a\u0003Sûi\f1ÕÆã¨\u009c\u0011 \u0092\u009b\u0011æCU8x°ðDGRÇ\u0000vò\u0007Z\u0019l\u0090]\\ó\u0099b\u0001ú\u0005A\u0098\u0010\u001aìvºÃía@\u0093æ\u0081#X;RN\u0010Þ\u00ad4å=\u008a\u0094æÍ\u000f6móÈ\\Í\u0010\u008bX?\u008f¼\"ENo¶õ\u008d!Ò\u0097\u000b\u0010dr\u009b¡ÙÓf§\u008eÍÀ.Ä\b\u0092¾\u0010µ±}Ú×²\u001cv~\u0011Ï¯hôÍ: \u00191¾þ\u0004\u0006$\rc;fu_èÒBâ\u0016BÍ\u0099Wþ\u0088>\u001a\u0000\u001c\u0090\u0014Me\u0010°¬!\u0085\u009b\u0081\u0005°]\u0013´r\u0013Ì×\u001c\u00107¦%·a\u009d\u0014IR¦\u0017ö±Á\u0082Ø\u0010iÔ ¥ g¼\u0018V:\nçø\u000b³Í ½z\u009c\u0095\u0003µºÀïÂJ\u0011\u009eMàD©k\u0001/©àã</«ù«\u008c/á2\u0018Â\u008c3û¦\u001a´\u0087\u0097]\u0089à1E\u00172\u0096#«kÖÞ§\u0004\u0010\u0007Ô|\u0014.À\u00ad\u0011;ÌáÔxAÅ\u0097\u0010=ðÿé\tYóÏÕò±\u000f\u0007ÐyU \f@¾ÔÄ\u0081ûe\u0019-lRW\u008ay0*.É\u0087òçB©/b£\u000f\\ÂÎæ\u0010\fGî@\u0007@Ð¨;\u001br¬\u001cÿñ¢\u0010\u0084\u0083\u0001\u0083Î\u00ad½3ú\u009a8¾¢;Vø 0¾j{fÙØÌHI|Á´\u001fNÃX5Ç¨NÐoâÇ!¡>Éo\u0014V";
      int var17 = "÷vÅ²6\u0090xÿ\u0093\u0095ÐÊzyëÕ\u0010CK\b\u0090Ï$\u009cU<ÞÐ\u0002\u0092Vb0\u0010\u0081I.\u0000x\u0004¢ä¶\u0013G\"Ø+&\u0014\u0010ûT2\u0003ÇøjÆt\u0013¯Ê\u008a4\f®\u0010\u009aRë\u009a\u001cA#\u0081\u0088²\u00145X9\u00811\u0010\u0093´£j\u009bTcRDJ¨\u000fK\u000fú|8lîûkPNI\u0001¶ c;\u0088\u0014\u0019ÃÕ\u009c\u008c\u00940\u00adi ÚgÎòâ\u0006\u0097\u0004j½\u0090ûÜ·ø¸Ñ0u\u0093½Ó\u007f\u0090Ö\u001f\u0002\u0093ê\u008bm\u0080\u0010\u0094ç\u0000\u0083\u0000ßQ\u0091ª\u009d;Eò7\b\u0099\u0010!BÛ÷#&\u0084?\u0011iLWS7O \u0010uUy\u009a\u0003Sûi\f1ÕÆã¨\u009c\u0011 \u0092\u009b\u0011æCU8x°ðDGRÇ\u0000vò\u0007Z\u0019l\u0090]\\ó\u0099b\u0001ú\u0005A\u0098\u0010\u001aìvºÃía@\u0093æ\u0081#X;RN\u0010Þ\u00ad4å=\u008a\u0094æÍ\u000f6móÈ\\Í\u0010\u008bX?\u008f¼\"ENo¶õ\u008d!Ò\u0097\u000b\u0010dr\u009b¡ÙÓf§\u008eÍÀ.Ä\b\u0092¾\u0010µ±}Ú×²\u001cv~\u0011Ï¯hôÍ: \u00191¾þ\u0004\u0006$\rc;fu_èÒBâ\u0016BÍ\u0099Wþ\u0088>\u001a\u0000\u001c\u0090\u0014Me\u0010°¬!\u0085\u009b\u0081\u0005°]\u0013´r\u0013Ì×\u001c\u00107¦%·a\u009d\u0014IR¦\u0017ö±Á\u0082Ø\u0010iÔ ¥ g¼\u0018V:\nçø\u000b³Í ½z\u009c\u0095\u0003µºÀïÂJ\u0011\u009eMàD©k\u0001/©àã</«ù«\u008c/á2\u0018Â\u008c3û¦\u001a´\u0087\u0097]\u0089à1E\u00172\u0096#«kÖÞ§\u0004\u0010\u0007Ô|\u0014.À\u00ad\u0011;ÌáÔxAÅ\u0097\u0010=ðÿé\tYóÏÕò±\u000f\u0007ÐyU \f@¾ÔÄ\u0081ûe\u0019-lRW\u008ay0*.É\u0087òçB©/b£\u000f\\ÂÎæ\u0010\fGî@\u0007@Ð¨;\u001br¬\u001cÿñ¢\u0010\u0084\u0083\u0001\u0083Î\u00ad½3ú\u009a8¾¢;Vø 0¾j{fÙØÌHI|Á´\u001fNÃX5Ç¨NÐoâÇ!¡>Éo\u0014V"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     c = var18;
                     d = new String[30];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[170];
                     int var3 = 0;
                     String var4 = "\u0019qq\u0004\u0085#-q¹¤\u0093/m²ßQéfÌÕ0H\u0085\u0098k/5\u001d)áèÜ\u0017M\u0093\u009e\u009f\u0004áÍ;|¿\u0098d;£Ïç³ÙÄ@\u000b±¥Í3\u0081K8\u0094ý¶\u0086l¦\u000e\u0014ÆýÃ5fÙV×2(\u0007[líûýng8 ó¢1÷Ï\u0000\u0011~¡·î\u0018n\u009f¸t]ÓMB\u009f`áè\u0015ºÊ:/\u0082TêÞZÁ½ÒÍî\u0088\u0083^|lÒ\u001a(\u0081ÍÇ%\u0002\u0096íB\u0090\u007f\u000e?\u001eRõJN§À\u0015^¾>\u0015¢·\u0085ÃOÉzå\u007f¡\u0092\u009bãåè^b½M\u0019îâC\u00156ê¨r\u0096:\u00108.XC·M\u0015¿Û½d\u009a>ËÃ±o\u000fÄÔ/ö·¦³K\u0084ÐôÐÈ«\u001b~\f°Ì[\u0092»\u008d0\u0086\u008c¢´Ð3X\u0091\u0080E\u0083ôÐSt¿\u0012ú\u0098B' \u000eTà\u000bçÌ)\u0003\u0013\"6×\u0015C7\u0016\u000fF*|\u001dwÂ¼ô\r)d\u000b\u0098ðáÙ]Ëè\u0089Ã>\u0089»P:ê¥ê\u009füTÙÌ\u0092Ø0Ôw!mºÆ¡Y\u0001F>¤ä\u0086ã\u0007~3\u0095ËÖyÑ\u00911^\u001bµ\u0006W½\u009aÊLv& R»»RéI«i\u0003öÛ¬\u001bèC}lÞ4Ô×Ïw\u0094\u0002ð¹2\u0092\u000e-¤\u0095LÁb\u0001ëW4c\u0017\u008eÎSê<\u009cOîßQ¢\u000b£#\u0099õ\u0080\u008f9\bw\f\u009c\u0094\u0095#A®Øó!þH\u009bGÀt\u00ad\u0085=\u0081:þ\"\u0096ï$çíja-Ù§ä\u0083Y~3Á\u0018\u00ad\u00021e»Ø\\¯!\u0007OÛ\u0085ÞÖ[A=\u008cßÎ\u0094mõÿI²\u0016ª{,É\" ]\u0000.Ú\u00888øºíE\u0097¹\u008fñÔX;Ó\u0080\u0094N>@\u001f±\u0010\u00172f(\u0005v\u0087çs¨\u0003Ø\u0083¯¹_o\u0012p\u00020\u0080\u0080\u0083®Tjàê½¬\u00900\u0081~Ò¥\u001eÅ\u009f]¦r\u009dÍ\u008dÚ4\u0002Ä\u0007\u009eÔåÅ\u0012íà2`È\u00adµ¬î\u0000#ç\u001c\u0002\tÇNésâ¡¸\u009c\\\u0014Ë\u0016\u001bíXÓ\u0095\u0003Rv¨\u000e+\u009c8\u0081wü\u0097ô\u0016z£ÖÞKW\t\u0013=\n{\föpÝ\u000e=;Dÿ\u0094%\u0000¨ãÜèäÿ%b¨Ö\tÑ:\u001fq\u0012Ò\u0089¥ð¬y\u0087RnV4¬\u0002Súl\u0099¼IÒÜ\t÷9o·\u001c\u009c®¸Ê\u001a0Ñy@\u0081ö\u0085[£¼\u0014yWÈÆyÔ¯(\u0086Êcôÿúòï\u00918©ÌåZ4j\u00044\u0080TVA\u0088B£D(È\u0090G\u001f\u0097\u00adÖ\u007fyG\u008a+\u007fØ%\u007f;\u0093è³ï~ Qfs\u0018à\u00adËÑ\u007f\u001a\u0099pþe\u001e\u008b]«\u0007H^o¤\u001f÷\u000eÅÊV [>a\t+\u009d\u001eWøõ´ß¬\u000e\u0005Üí~\u0017\u0013)ÛïÄ\u000bÀ'¦Á\u008eaz[\u0090/\u0093\u009bÎ\u0014=e&\u0081\u0089¢g>óVûL³\u0019\rÉnÅr3÷x§Ü2X\u008f\u0017\u000eV\u0087þçÔ\u0081\u0089'ydÜ\u0095»\u0005G\u0001`\u000bócõ|\u009dL-N\u0084EU¬+\u00983®\t\u0088J?ëO[Æo\u009e?}ûpÀMªÐ\u0014]¯©\\é¦úu\u0092.:?õ\u008eËW\u000e\n\u009aíãm\u008bæâåCê«·\u008c\"\u0001Á\u0010åö\u009båïÇ;\u001c4ç:zV\u00981\u0005v\u0010¤Â°Ú(6øÉUxE®Ég\u0015\r³&ln\u000bIÍZ\u0017êåù\u0010!f±ü7\\+dàsýWÜoÕQêøË1ég! 3ªJ\u0011\rºØ`Ô\u009eí\u0019J\u0015\u001b\u008c2\u000b\u000f1î;Þ¸\u0098n©\u0087ã\u0082\u000b\u009aÍ#Ô\u0089an²®\u008dÙ\u0001²Nô¶S\u0097\u0082j]Á/\u001cÂMr\n\t\u0011¿û\u000e\b\u0089\u0011K\u009e©é²\u0097øÏÐ2s£ò|Ö ,]Â9\u000bôxÝÜ\u0099[8üª,w\f\u008fAG\u008c4ÉÐHømæù\u0011n çbäk\u0089øiå½Ü\u00161IB@ÌeÛ4C<l¼;ïÅä=æG\u0099Ú<\u0017\u0084 \u0017°Ã3\"óK}\f¬/\u0001¨u\u00007\u0091\u0097*e°¿\r\fà\u0007\u009d£ó?j¿³\u0083Þ\u0016\u0092@_ÚÜ¶ÄÅøâ\\Cè\u001a\u0007_¾\u000eâc\u0018Ê\u00803«\u0017aå[íÍaå!ãÉÂ\u009a`mc>NÑóÍ\u0013`®HGp»àò\u0016\u0089f,\u0089\u009f8\u0015\u0097\"[e»PZ\u0080çWÔ/,í\u0017Y±µ{t\u001f\u008c\f±<g\u00938\u009b\u008f\u0089\u0082áQ\u0098²µÝ1tµ¬wDÞOôä³Ù3Å]§Îª;íîºà\u0095)±ÉÚ\u0000\u001b\u0000\r\f\t\u001b²YI½Õ\u008dý\u0084¸Ù±&¶";
                     int var5 = "\u0019qq\u0004\u0085#-q¹¤\u0093/m²ßQéfÌÕ0H\u0085\u0098k/5\u001d)áèÜ\u0017M\u0093\u009e\u009f\u0004áÍ;|¿\u0098d;£Ïç³ÙÄ@\u000b±¥Í3\u0081K8\u0094ý¶\u0086l¦\u000e\u0014ÆýÃ5fÙV×2(\u0007[líûýng8 ó¢1÷Ï\u0000\u0011~¡·î\u0018n\u009f¸t]ÓMB\u009f`áè\u0015ºÊ:/\u0082TêÞZÁ½ÒÍî\u0088\u0083^|lÒ\u001a(\u0081ÍÇ%\u0002\u0096íB\u0090\u007f\u000e?\u001eRõJN§À\u0015^¾>\u0015¢·\u0085ÃOÉzå\u007f¡\u0092\u009bãåè^b½M\u0019îâC\u00156ê¨r\u0096:\u00108.XC·M\u0015¿Û½d\u009a>ËÃ±o\u000fÄÔ/ö·¦³K\u0084ÐôÐÈ«\u001b~\f°Ì[\u0092»\u008d0\u0086\u008c¢´Ð3X\u0091\u0080E\u0083ôÐSt¿\u0012ú\u0098B' \u000eTà\u000bçÌ)\u0003\u0013\"6×\u0015C7\u0016\u000fF*|\u001dwÂ¼ô\r)d\u000b\u0098ðáÙ]Ëè\u0089Ã>\u0089»P:ê¥ê\u009füTÙÌ\u0092Ø0Ôw!mºÆ¡Y\u0001F>¤ä\u0086ã\u0007~3\u0095ËÖyÑ\u00911^\u001bµ\u0006W½\u009aÊLv& R»»RéI«i\u0003öÛ¬\u001bèC}lÞ4Ô×Ïw\u0094\u0002ð¹2\u0092\u000e-¤\u0095LÁb\u0001ëW4c\u0017\u008eÎSê<\u009cOîßQ¢\u000b£#\u0099õ\u0080\u008f9\bw\f\u009c\u0094\u0095#A®Øó!þH\u009bGÀt\u00ad\u0085=\u0081:þ\"\u0096ï$çíja-Ù§ä\u0083Y~3Á\u0018\u00ad\u00021e»Ø\\¯!\u0007OÛ\u0085ÞÖ[A=\u008cßÎ\u0094mõÿI²\u0016ª{,É\" ]\u0000.Ú\u00888øºíE\u0097¹\u008fñÔX;Ó\u0080\u0094N>@\u001f±\u0010\u00172f(\u0005v\u0087çs¨\u0003Ø\u0083¯¹_o\u0012p\u00020\u0080\u0080\u0083®Tjàê½¬\u00900\u0081~Ò¥\u001eÅ\u009f]¦r\u009dÍ\u008dÚ4\u0002Ä\u0007\u009eÔåÅ\u0012íà2`È\u00adµ¬î\u0000#ç\u001c\u0002\tÇNésâ¡¸\u009c\\\u0014Ë\u0016\u001bíXÓ\u0095\u0003Rv¨\u000e+\u009c8\u0081wü\u0097ô\u0016z£ÖÞKW\t\u0013=\n{\föpÝ\u000e=;Dÿ\u0094%\u0000¨ãÜèäÿ%b¨Ö\tÑ:\u001fq\u0012Ò\u0089¥ð¬y\u0087RnV4¬\u0002Súl\u0099¼IÒÜ\t÷9o·\u001c\u009c®¸Ê\u001a0Ñy@\u0081ö\u0085[£¼\u0014yWÈÆyÔ¯(\u0086Êcôÿúòï\u00918©ÌåZ4j\u00044\u0080TVA\u0088B£D(È\u0090G\u001f\u0097\u00adÖ\u007fyG\u008a+\u007fØ%\u007f;\u0093è³ï~ Qfs\u0018à\u00adËÑ\u007f\u001a\u0099pþe\u001e\u008b]«\u0007H^o¤\u001f÷\u000eÅÊV [>a\t+\u009d\u001eWøõ´ß¬\u000e\u0005Üí~\u0017\u0013)ÛïÄ\u000bÀ'¦Á\u008eaz[\u0090/\u0093\u009bÎ\u0014=e&\u0081\u0089¢g>óVûL³\u0019\rÉnÅr3÷x§Ü2X\u008f\u0017\u000eV\u0087þçÔ\u0081\u0089'ydÜ\u0095»\u0005G\u0001`\u000bócõ|\u009dL-N\u0084EU¬+\u00983®\t\u0088J?ëO[Æo\u009e?}ûpÀMªÐ\u0014]¯©\\é¦úu\u0092.:?õ\u008eËW\u000e\n\u009aíãm\u008bæâåCê«·\u008c\"\u0001Á\u0010åö\u009båïÇ;\u001c4ç:zV\u00981\u0005v\u0010¤Â°Ú(6øÉUxE®Ég\u0015\r³&ln\u000bIÍZ\u0017êåù\u0010!f±ü7\\+dàsýWÜoÕQêøË1ég! 3ªJ\u0011\rºØ`Ô\u009eí\u0019J\u0015\u001b\u008c2\u000b\u000f1î;Þ¸\u0098n©\u0087ã\u0082\u000b\u009aÍ#Ô\u0089an²®\u008dÙ\u0001²Nô¶S\u0097\u0082j]Á/\u001cÂMr\n\t\u0011¿û\u000e\b\u0089\u0011K\u009e©é²\u0097øÏÐ2s£ò|Ö ,]Â9\u000bôxÝÜ\u0099[8üª,w\f\u008fAG\u008c4ÉÐHømæù\u0011n çbäk\u0089øiå½Ü\u00161IB@ÌeÛ4C<l¼;ïÅä=æG\u0099Ú<\u0017\u0084 \u0017°Ã3\"óK}\f¬/\u0001¨u\u00007\u0091\u0097*e°¿\r\fà\u0007\u009d£ó?j¿³\u0083Þ\u0016\u0092@_ÚÜ¶ÄÅøâ\\Cè\u001a\u0007_¾\u000eâc\u0018Ê\u00803«\u0017aå[íÍaå!ãÉÂ\u009a`mc>NÑóÍ\u0013`®HGp»àò\u0016\u0089f,\u0089\u009f8\u0015\u0097\"[e»PZ\u0080çWÔ/,í\u0017Y±µ{t\u001f\u008c\f±<g\u00938\u009b\u008f\u0089\u0082áQ\u0098²µÝ1tµ¬wDÞOôä³Ù3Å]§Îª;íîºà\u0095)±ÉÚ\u0000\u001b\u0000\r\f\t\u001b²YI½Õ\u008dý\u0084¸Ù±&¶"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
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
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    i = var6;
                                    j = new Integer[170];
                                    String[] var29 = new String[b<"a">(6159, 2119342574021116570L ^ var20)];
                                    var29[0] = "\u0000";
                                    var29[1] = "\u0001";
                                    var29[2] = "\u0002";
                                    var29[3] = "\u0003";
                                    var29[4] = "\u0004";
                                    var29[5] = "\u0005";
                                    var29[b<"a">(32155, 5339441134253729582L ^ var20)] = "\u0006";
                                    var29[b<"a">(16522, 1089136891093834322L ^ var20)] = "\u0007";
                                    var29[b<"a">(23763, 6530983972155704946L ^ var20)] = "\b";
                                    var29[b<"a">(1526, 1563137963814494077L ^ var20)] = "\t";
                                    var29[b<"a">(16297, 1559938606992893229L ^ var20)] = "\n";
                                    var29[b<"a">(21898, 29501940611665816L ^ var20)] = "\u000b";
                                    var29[b<"a">(8806, 1749356963953784936L ^ var20)] = "\f";
                                    var29[b<"a">(4372, 6371698730732784384L ^ var20)] = "\r";
                                    var29[b<"a">(27068, 189890951265874785L ^ var20)] = "\u000e";
                                    var29[b<"a">(9169, 1193497224209545512L ^ var20)] = "\u000f";
                                    var29[b<"a">(29985, 7917915692662648618L ^ var20)] = "\u0010";
                                    var29[b<"a">(25737, 2370883548706143781L ^ var20)] = "\u0011";
                                    var29[b<"a">(32110, 1946828706476582879L ^ var20)] = "\u0012";
                                    var29[b<"a">(395, 4992167078009772950L ^ var20)] = "\u0013";
                                    var29[b<"a">(3478, 5524771310297716603L ^ var20)] = "\u0014";
                                    var29[b<"a">(20425, 6034215354353931581L ^ var20)] = "\u0015";
                                    var29[b<"a">(11590, 8109334893300299704L ^ var20)] = "\u0016";
                                    var29[b<"a">(5302, 1287162885075570269L ^ var20)] = "\u0017";
                                    var29[b<"a">(25125, 9049186733099415768L ^ var20)] = "\u0018";
                                    var29[b<"a">(32705, 6231343128034141562L ^ var20)] = "\u0019";
                                    var29[b<"a">(30699, 41106190237625713L ^ var20)] = "\u001a";
                                    var29[b<"a">(12310, 5696624512942451372L ^ var20)] = "\u001b";
                                    var29[b<"a">(18755, 9020818624599446503L ^ var20)] = "\u001c";
                                    var29[b<"a">(26337, 3229067674312965143L ^ var20)] = "\u001d";
                                    var29[b<"a">(23601, 439380987641021993L ^ var20)] = "\u001e";
                                    var29[b<"a">(32316, 3060623102634648799L ^ var20)] = "\u001f";
                                    var29[b<"a">(28732, 8535017651036580410L ^ var20)] = " ";
                                    var29[b<"a">(26259, 395205138796084365L ^ var20)] = "!";
                                    var29[b<"a">(7501, 1147913226694461354L ^ var20)] = "\"";
                                    var29[b<"a">(10903, 5042275537480757314L ^ var20)] = "#";
                                    var29[b<"a">(2339, 7598882556094452721L ^ var20)] = "$";
                                    var29[b<"a">(23769, 4122116620126799415L ^ var20)] = "%";
                                    var29[b<"a">(25953, 9111261282414919542L ^ var20)] = "&";
                                    var29[b<"a">(11609, 8166988066533717918L ^ var20)] = "'";
                                    var29[b<"a">(9532, 2849883854221066179L ^ var20)] = "(";
                                    var29[b<"a">(9328, 7849957935117418076L ^ var20)] = ")";
                                    var29[b<"a">(32215, 5081830355009464277L ^ var20)] = "*";
                                    var29[b<"a">(18959, 8945245279231135951L ^ var20)] = "+";
                                    var29[b<"a">(24127, 6057284277207909564L ^ var20)] = ",";
                                    var29[b<"a">(7031, 4322765569107689846L ^ var20)] = "-";
                                    var29[b<"a">(1308, 5074358790565306140L ^ var20)] = ".";
                                    var29[b<"a">(9547, 5671487040370327441L ^ var20)] = "/";
                                    var29[b<"a">(25047, 2346736331871353822L ^ var20)] = "0";
                                    var29[b<"a">(22960, 3531623835416380304L ^ var20)] = "1";
                                    var29[b<"a">(12719, 7337816523160759149L ^ var20)] = "2";
                                    var29[b<"a">(14131, 7601503550374653439L ^ var20)] = "3";
                                    var29[b<"a">(3536, 8660423624870893336L ^ var20)] = "4";
                                    var29[b<"a">(31217, 388144721911604023L ^ var20)] = "5";
                                    var29[b<"a">(20796, 8800828111103937410L ^ var20)] = "6";
                                    var29[b<"a">(15877, 784861620805379278L ^ var20)] = "7";
                                    var29[b<"a">(5592, 7893440571271778143L ^ var20)] = "8";
                                    var29[b<"a">(11136, 3867936217091453343L ^ var20)] = "9";
                                    var29[b<"a">(26369, 279609537809382702L ^ var20)] = ":";
                                    var29[b<"a">(19999, 7814107599249691885L ^ var20)] = ";";
                                    var29[b<"a">(10346, 2400938072697778916L ^ var20)] = "<";
                                    var29[b<"a">(25075, 1681080045694089999L ^ var20)] = "=";
                                    var29[b<"a">(28257, 719138259708245194L ^ var20)] = ">";
                                    var29[b<"a">(27965, 2852752262421149663L ^ var20)] = "?";
                                    var29[b<"a">(29418, 6175609794267539497L ^ var20)] = "@";
                                    var29[b<"a">(1971, 8666654175173582146L ^ var20)] = "A";
                                    var29[b<"a">(5229, 5635331790738132716L ^ var20)] = "B";
                                    var29[b<"a">(26233, 2459026681778666579L ^ var20)] = "C";
                                    var29[b<"a">(11371, 2991768750781773423L ^ var20)] = "D";
                                    var29[b<"a">(17288, 7664090608009828711L ^ var20)] = "E";
                                    var29[b<"a">(31356, 8688055438886854881L ^ var20)] = "F";
                                    var29[b<"a">(17659, 4169281448509398612L ^ var20)] = "G";
                                    var29[b<"a">(21462, 6917254271599724813L ^ var20)] = "H";
                                    var29[b<"a">(24147, 5173292146038555826L ^ var20)] = "I";
                                    var29[b<"a">(14945, 8792623846751314147L ^ var20)] = "J";
                                    var29[b<"a">(12812, 747053984185034963L ^ var20)] = "K";
                                    var29[b<"a">(15255, 550149576533090694L ^ var20)] = "L";
                                    var29[b<"a">(20293, 2468110777980966325L ^ var20)] = "M";
                                    var29[b<"a">(15616, 6129746411505460997L ^ var20)] = "N";
                                    var29[b<"a">(22966, 919396576248742696L ^ var20)] = "O";
                                    var29[b<"a">(22259, 3723854509068274735L ^ var20)] = "P";
                                    var29[b<"a">(28624, 5193674226966295908L ^ var20)] = "Q";
                                    var29[b<"a">(3921, 7358862525781186004L ^ var20)] = "R";
                                    var29[b<"a">(5859, 8803344054964161627L ^ var20)] = "S";
                                    var29[b<"a">(8142, 5764134177271678432L ^ var20)] = "T";
                                    var29[b<"a">(27300, 6958852173402370129L ^ var20)] = "U";
                                    var29[b<"a">(27883, 189760023063361254L ^ var20)] = "V";
                                    var29[b<"a">(8658, 8211235625639000910L ^ var20)] = "W";
                                    var29[b<"a">(19571, 3233468559960430286L ^ var20)] = "X";
                                    var29[b<"a">(24799, 4093682087926659611L ^ var20)] = "Y";
                                    var29[b<"a">(32731, 5289462807438878019L ^ var20)] = "Z";
                                    var29[b<"a">(25125, 7116717714592954612L ^ var20)] = "[";
                                    var29[b<"a">(26805, 71936597875978941L ^ var20)] = "\\";
                                    var29[b<"a">(13740, 37034606055436192L ^ var20)] = "]";
                                    var29[b<"a">(25040, 8159606778789296902L ^ var20)] = "^";
                                    var29[b<"a">(20255, 4019164191338911115L ^ var20)] = "_";
                                    var29[b<"a">(24905, 4777542635193531337L ^ var20)] = "`";
                                    var29[b<"a">(20346, 756702143519839686L ^ var20)] = "a";
                                    var29[b<"a">(23124, 842586880980336847L ^ var20)] = "b";
                                    var29[b<"a">(11088, 6951405019058516383L ^ var20)] = "c";
                                    var29[b<"a">(24119, 3043679264378111187L ^ var20)] = "d";
                                    var29[b<"a">(22780, 8906326218840097371L ^ var20)] = "e";
                                    var29[b<"a">(2537, 1414448516385870668L ^ var20)] = "f";
                                    var29[b<"a">(2581, 5717690953831977190L ^ var20)] = "g";
                                    var29[b<"a">(6278, 7677523474324587065L ^ var20)] = "h";
                                    var29[b<"a">(9187, 8664800714331306267L ^ var20)] = "i";
                                    var29[b<"a">(18715, 8071552968703267835L ^ var20)] = "j";
                                    var29[b<"a">(14150, 6226936491031997807L ^ var20)] = "k";
                                    var29[b<"a">(7992, 4749333876035257775L ^ var20)] = "l";
                                    var29[b<"a">(32655, 8156175309186885004L ^ var20)] = "m";
                                    var29[b<"a">(11776, 3871839398103758032L ^ var20)] = "n";
                                    var29[b<"a">(27764, 5355983529650747050L ^ var20)] = "o";
                                    var29[b<"a">(30286, 3337075152824429670L ^ var20)] = "p";
                                    var29[b<"a">(15147, 6823943977527091662L ^ var20)] = "q";
                                    var29[b<"a">(11402, 7258109296403658315L ^ var20)] = "r";
                                    var29[b<"a">(11757, 7860540531945158478L ^ var20)] = "s";
                                    var29[b<"a">(5761, 2985015145806400616L ^ var20)] = "t";
                                    var29[b<"a">(8200, 8438076626193464028L ^ var20)] = "u";
                                    var29[b<"a">(3429, 5059283955180705783L ^ var20)] = "v";
                                    var29[b<"a">(20282, 3687143533851268589L ^ var20)] = "w";
                                    var29[b<"a">(16200, 4403070268039308769L ^ var20)] = "x";
                                    var29[b<"a">(2769, 2493582715707134146L ^ var20)] = "y";
                                    var29[b<"a">(13779, 376333267940749145L ^ var20)] = "z";
                                    var29[b<"a">(22402, 798525852962147688L ^ var20)] = "{";
                                    var29[b<"a">(19733, 6324462261175015406L ^ var20)] = "|";
                                    var29[b<"a">(29000, 2927773032766663678L ^ var20)] = "}";
                                    var29[b<"a">(10981, 2726976123111059662L ^ var20)] = "~";
                                    var29[b<"a">(27595, 7173664797369627000L ^ var20)] = "\u007f";
                                    H = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "F\bYëÿ¾x\u00831w²ò\u0096\u008c=+";
                                 var5 = "F\bYëÿ¾x\u00831w²ò\u0096\u008c=+".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "dí:ôüH\u0092·\u0092\u0087°Ïß#ªÝ\u0010\\7\u0087)twºð\u0085\u0007\u009b6ÃC\u0087\u009a";
                  var17 = "dí:ôüH\u0092·\u0092\u0087°Ïß#ªÝ\u0010\\7\u0087)twºð\u0085\u0007\u009b6ÃC\u0087\u009a".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private boolean i(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/u.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 4540854524088552079
      // 1f: lload 3
      // 20: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 5
      // 27: aload 0
      // 28: getfield com/zelix/u.F C
      // 2b: sipush 21264
      // 2e: ldc2_w 4037524698934239056
      // 31: lload 3
      // 32: lxor
      // 33: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: aload 5
      // 3a: ifnonnull dd
      // 3d: if_icmpne c6
      // 40: goto 4d
      // 43: ldc2_w 2532924452547424890
      // 46: lload 3
      // 47: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: iload 2
      // 4e: aload 5
      // 50: ifnonnull c1
      // 53: goto 60
      // 56: ldc2_w 2532924452547424890
      // 59: lload 3
      // 5a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: lload 3
      // 61: lconst_0
      // 62: lcmp
      // 63: ifle b4
      // 66: sipush 9248
      // 69: ldc2_w 5025590177211787267
      // 6c: lload 3
      // 6d: lxor
      // 6e: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: if_icmpeq b3
      // 76: goto 83
      // 79: ldc2_w 2532924452547424890
      // 7c: lload 3
      // 7d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: iload 2
      // 84: aload 5
      // 86: ifnonnull c1
      // 89: goto 96
      // 8c: ldc2_w 2532924452547424890
      // 8f: lload 3
      // 90: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: sipush 22908
      // 99: ldc2_w 637034976057677112
      // 9c: lload 3
      // 9d: lxor
      // 9e: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: if_icmpne c4
      // a6: goto b3
      // a9: ldc2_w 2532924452547424890
      // ac: lload 3
      // ad: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: bipush 1
      // b4: goto c1
      // b7: ldc2_w 2532924452547424890
      // ba: lload 3
      // bb: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: athrow
      // c1: goto c5
      // c4: bipush 0
      // c5: ireturn
      // c6: iload 2
      // c7: aload 5
      // c9: ifnonnull e1
      // cc: aload 0
      // cd: getfield com/zelix/u.F C
      // d0: goto dd
      // d3: ldc2_w 2532924452547424890
      // d6: lload 3
      // d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: athrow
      // dd: if_icmpne e4
      // e0: bipush 1
      // e1: goto e5
      // e4: bipush 0
      // e5: ireturn
   }

   void S(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 5
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/util/List
      // 01c: astore 2
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/io/PrintWriter
      // 023: astore 6
      // 025: pop
      // 026: getstatic com/zelix/u.a J
      // 029: lload 3
      // 02a: lxor
      // 02b: lstore 3
      // 02c: lload 3
      // 02d: dup2
      // 02e: ldc2_w 90658307766640
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 68027589497280
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 96358765076948
      // 03f: lxor
      // 040: lstore 11
      // 042: pop2
      // 043: aload 0
      // 044: bipush 1
      // 045: ldc2_w -4987757966023889922
      // 048: lload 3
      // 049: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: ldc2_w -6463464738110270522
      // 051: lload 3
      // 052: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: aload 0
      // 058: aload 0
      // 059: ldc2_w -6643424692572675432
      // 05c: lload 3
      // 05d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 065: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 068: ldc2_w -5159155300588798441
      // 06b: lload 3
      // 06c: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: astore 13
      // 073: aload 13
      // 075: ifnonnull 0e2
      // 078: iload 5
      // 07a: tableswitch 252 1 3 36 115 186
      // 094: ldc2_w -5012590567640011981
      // 097: lload 3
      // 098: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 0
      // 09f: aload 0
      // 0a0: ldc2_w -6618011497962543479
      // 0a3: lload 3
      // 0a4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_n8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: lload 7
      // 0ab: dup2_x1
      // 0ac: pop2
      // 0ad: aload 2
      // 0ae: aload 6
      // 0b0: bipush 4
      // 0b1: anewarray 656
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 3
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x2
      // 0c4: dup_x2
      // 0c5: pop
      // 0c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9: bipush 0
      // 0ca: swap
      // 0cb: aastore
      // 0cc: ldc2_w -6564672990146930248
      // 0cf: lload 3
      // 0d0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: goto 0e2
      // 0d8: ldc2_w -5012590567640011981
      // 0db: lload 3
      // 0dc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 13
      // 0e4: lload 3
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: ifle 124
      // 0ea: ifnull 176
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: ldc2_w -5159155300588798441
      // 0f2: lload 3
      // 0f3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: lload 9
      // 0fa: aload 2
      // 0fb: aload 6
      // 0fd: bipush 4
      // 0fe: anewarray 656
      // 101: dup_x1
      // 102: swap
      // 103: bipush 3
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w -5171572987534063520
      // 11c: lload 3
      // 11d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: aload 13
      // 124: ifnull 176
      // 127: goto 134
      // 12a: ldc2_w -5012590567640011981
      // 12d: lload 3
      // 12e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 0
      // 135: aload 0
      // 136: ldc2_w -6618011497962543479
      // 139: lload 3
      // 13a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_n8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 2
      // 140: lload 11
      // 142: aload 6
      // 144: bipush 4
      // 145: anewarray 656
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 3
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x2
      // 14e: dup_x2
      // 14f: pop
      // 150: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153: bipush 2
      // 154: swap
      // 155: aastore
      // 156: dup_x1
      // 157: swap
      // 158: bipush 1
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: bipush 0
      // 15e: swap
      // 15f: aastore
      // 160: ldc2_w -6525917058838690119
      // 163: lload 3
      // 164: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: goto 176
      // 16c: ldc2_w -5012590567640011981
      // 16f: lload 3
      // 170: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: return
   }

   public static String D(Object[] var0) {
      ZipFile var3 = (ZipFile)var0[0];
      long var7 = (Long)var0[1];
      ZipEntry var6 = (ZipEntry)var0[2];
      pg var1 = (pg)var0[3];
      wp var4 = (wp)var0[4];
      wp var5 = (wp)var0[5];
      wp var2 = (wp)var0[6];
      var7 = a ^ var7;
      long var9 = var7 ^ 45480478225773L;
      long var11 = var7 ^ 55939355387091L;
      long var13 = var7 ^ 43976958379312L;
      String var15 = x44.a<"s">(new Object[]{x44.a<"k">(var3, var6, 5043279847688408360L, var7), var4, var5, var2, var13}, 4709137919782356338L, var7);
      var1.G(var11, var15);
      return x44.a<"s">(new Object[]{var3, var9, var6, var15}, 4613735733381311292L, var7);
   }

   private void j(Object[] param1) {
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
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/List
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/io/PrintWriter
      // 029: astore 7
      // 02b: pop
      // 02c: getstatic com/zelix/u.a J
      // 02f: lload 2
      // 030: lxor
      // 031: lstore 2
      // 032: lload 2
      // 033: dup2
      // 034: ldc2_w 49796407532745
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 81204906930609
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 134373108131528
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 137132521839189
      // 04c: lxor
      // 04d: lstore 14
      // 04f: pop2
      // 050: ldc2_w 6982661398992016748
      // 053: lload 2
      // 054: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: astore 16
      // 05b: aload 6
      // 05d: aload 16
      // 05f: ifnonnull 084
      // 062: ifnonnull 126
      // 065: goto 072
      // 068: ldc2_w 8990873658716794265
      // 06b: lload 2
      // 06c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 4
      // 074: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 077: goto 084
      // 07a: ldc2_w 8990873658716794265
      // 07d: lload 2
      // 07e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: astore 17
      // 086: aload 17
      // 088: invokevirtual java/lang/String.length ()I
      // 08b: bipush 1
      // 08c: aload 16
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: iflt 0c9
      // 094: ifnonnull 0c7
      // 097: if_icmple 126
      // 09a: goto 0a7
      // 09d: ldc2_w 8990873658716794265
      // 0a0: lload 2
      // 0a1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 17
      // 0a9: bipush 0
      // 0aa: invokevirtual java/lang/String.charAt (I)C
      // 0ad: sipush 20247
      // 0b0: ldc2_w 1398314556044844144
      // 0b3: lload 2
      // 0b4: lxor
      // 0b5: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: goto 0c7
      // 0bd: ldc2_w 8990873658716794265
      // 0c0: lload 2
      // 0c1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 16
      // 0c9: ifnonnull 114
      // 0cc: if_icmpne 126
      // 0cf: goto 0dc
      // 0d2: ldc2_w 8990873658716794265
      // 0d5: lload 2
      // 0d6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 17
      // 0de: aload 16
      // 0e0: ifnonnull 124
      // 0e3: goto 0f0
      // 0e6: ldc2_w 8990873658716794265
      // 0e9: lload 2
      // 0ea: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 17
      // 0f2: invokevirtual java/lang/String.length ()I
      // 0f5: bipush 1
      // 0f6: isub
      // 0f7: invokevirtual java/lang/String.charAt (I)C
      // 0fa: sipush 1109
      // 0fd: ldc2_w 1344866790712137497
      // 100: lload 2
      // 101: lxor
      // 102: invokedynamic a (IJ)I bsm=com/zelix/u.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: goto 114
      // 10a: ldc2_w 8990873658716794265
      // 10d: lload 2
      // 10e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: if_icmpne 126
      // 117: sipush 9894
      // 11a: ldc2_w 3154954827027488565
      // 11d: lload 2
      // 11e: lxor
      // 11f: invokedynamic u (IJ)Ljava/lang/String; bsm=com/zelix/u.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: astore 6
      // 126: lload 2
      // 127: lconst_0
      // 128: lcmp
      // 129: ifle 261
      // 12c: aload 5
      // 12e: ifnull 1f1
      // 131: aload 0
      // 132: ldc2_w 7254370651177455583
      // 135: lload 2
      // 136: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 4
      // 13d: aload 6
      // 13f: lload 8
      // 141: aload 5
      // 143: bipush 4
      // 144: anewarray 656
      // 147: dup_x1
      // 148: swap
      // 149: bipush 3
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w 7166977513218070666
      // 162: lload 2
      // 163: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: aload 0
      // 169: aload 16
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: ifle 1dd
      // 171: ifnonnull 1c0
      // 174: goto 181
      // 177: ldc2_w 8990873658716794265
      // 17a: lload 2
      // 17b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: ldc2_w 7254370651177455583
      // 184: lload 2
      // 185: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: lload 10
      // 18c: bipush 1
      // 18d: anewarray 656
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 0
      // 197: swap
      // 198: aastore
      // 199: ldc2_w 6922673412820821710
      // 19c: lload 2
      // 19d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: ifeq 26e
      // 1a5: goto 1b2
      // 1a8: ldc2_w 8990873658716794265
      // 1ab: lload 2
      // 1ac: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: athrow
      // 1b2: aload 0
      // 1b3: goto 1c0
      // 1b6: ldc2_w 8990873658716794265
      // 1b9: lload 2
      // 1ba: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: aload 5
      // 1c2: aload 7
      // 1c4: lload 14
      // 1c6: bipush 3
      // 1c7: anewarray 656
      // 1ca: dup_x2
      // 1cb: dup_x2
      // 1cc: pop
      // 1cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d0: bipush 2
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x1
      // 1d4: swap
      // 1d5: bipush 1
      // 1d6: swap
      // 1d7: aastore
      // 1d8: dup_x1
      // 1d9: swap
      // 1da: bipush 0
      // 1db: swap
      // 1dc: aastore
      // 1dd: ldc2_w 7021773254843073384
      // 1e0: lload 2
      // 1e1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: lload 2
      // 1e7: lconst_0
      // 1e8: lcmp
      // 1e9: ifle 261
      // 1ec: aload 16
      // 1ee: ifnull 26e
      // 1f1: aload 0
      // 1f2: ldc2_w 7254370651177455583
      // 1f5: lload 2
      // 1f6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: aload 4
      // 1fd: aload 6
      // 1ff: aload 0
      // 200: ldc2_w 9028104686241087264
      // 203: lload 2
      // 204: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: aload 0
      // 20a: ldc2_w 8914328145288127190
      // 20d: lload 2
      // 20e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: lload 12
      // 215: dup2_x1
      // 216: pop2
      // 217: aload 0
      // 218: ldc2_w 9002912409173505325
      // 21b: lload 2
      // 21c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: aload 0
      // 222: ldc2_w 7064873856268677332
      // 225: lload 2
      // 226: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: bipush 7
      // 22d: anewarray 656
      // 230: dup_x1
      // 231: swap
      // 232: bipush 6
      // 234: swap
      // 235: aastore
      // 236: dup_x1
      // 237: swap
      // 238: bipush 5
      // 239: swap
      // 23a: aastore
      // 23b: dup_x1
      // 23c: swap
      // 23d: bipush 4
      // 23e: swap
      // 23f: aastore
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 3
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 2
      // 24c: swap
      // 24d: aastore
      // 24e: dup_x1
      // 24f: swap
      // 250: bipush 1
      // 251: swap
      // 252: aastore
      // 253: dup_x1
      // 254: swap
      // 255: bipush 0
      // 256: swap
      // 257: aastore
      // 258: ldc2_w 9214477278653233216
      // 25b: lload 2
      // 25c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: goto 26e
      // 264: ldc2_w 8990873658716794265
      // 267: lload 2
      // 268: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: return
   }

   public void I(Object[] param1) {
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
      // 00e: checkcast com/zelix/_n8
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/List
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 4
      // 023: pop
      // 024: getstatic com/zelix/u.a J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 123031926357917
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 78668004897576
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 26053980461749
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 99539099178105
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w -1239822829518202048
      // 04b: lload 2
      // 04c: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: astore 15
      // 053: aload 15
      // 055: ifnonnull 0a7
      // 058: aload 6
      // 05a: ifnull 123
      // 05d: goto 06a
      // 060: ldc2_w -942983178373651531
      // 063: lload 2
      // 064: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: aload 0
      // 06b: ldc2_w -1549073811551944205
      // 06e: lload 2
      // 06f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: aload 5
      // 076: aload 6
      // 078: lload 9
      // 07a: bipush 3
      // 07b: anewarray 656
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 2
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 1
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: bipush 0
      // 08f: swap
      // 090: aastore
      // 091: ldc2_w -1406344246914591810
      // 094: lload 2
      // 095: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: goto 0a7
      // 09d: ldc2_w -942983178373651531
      // 0a0: lload 2
      // 0a1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: aload 15
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 10f
      // 0b0: ifnonnull 0f2
      // 0b3: ldc2_w -1549073811551944205
      // 0b6: lload 2
      // 0b7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: lload 7
      // 0be: bipush 1
      // 0bf: anewarray 656
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w -1279478634903738142
      // 0ce: lload 2
      // 0cf: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: ifeq 198
      // 0d7: goto 0e4
      // 0da: ldc2_w -942983178373651531
      // 0dd: lload 2
      // 0de: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: goto 0f2
      // 0e8: ldc2_w -942983178373651531
      // 0eb: lload 2
      // 0ec: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 6
      // 0f4: aload 4
      // 0f6: lload 13
      // 0f8: bipush 3
      // 0f9: anewarray 656
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 2
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -1198380066008527548
      // 112: lload 2
      // 113: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: lload 2
      // 119: lconst_0
      // 11a: lcmp
      // 11b: ifle 18b
      // 11e: aload 15
      // 120: ifnull 198
      // 123: aload 0
      // 124: ldc2_w -1549073811551944205
      // 127: lload 2
      // 128: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: aload 5
      // 12f: aload 0
      // 130: ldc2_w -907929017517739764
      // 133: lload 2
      // 134: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: lload 11
      // 13b: dup2_x1
      // 13c: pop2
      // 13d: aload 0
      // 13e: ldc2_w -749242370346717958
      // 141: lload 2
      // 142: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 0
      // 148: ldc2_w -946632105354609919
      // 14b: lload 2
      // 14c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: aload 0
      // 152: ldc2_w -1430069455610495240
      // 155: lload 2
      // 156: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: bipush 6
      // 15d: anewarray 656
      // 160: dup_x1
      // 161: swap
      // 162: bipush 5
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 4
      // 168: swap
      // 169: aastore
      // 16a: dup_x1
      // 16b: swap
      // 16c: bipush 3
      // 16d: swap
      // 16e: aastore
      // 16f: dup_x1
      // 170: swap
      // 171: bipush 2
      // 172: swap
      // 173: aastore
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 1
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x1
      // 17e: swap
      // 17f: bipush 0
      // 180: swap
      // 181: aastore
      // 182: ldc2_w -1500123537066639843
      // 185: lload 2
      // 186: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: goto 198
      // 18e: ldc2_w -942983178373651531
      // 191: lload 2
      // 192: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: return
   }

   public u(long var1, InputStream var3, OutputStream var4, _x7 var5, String var6, int var7, int var8, int var9, String var10, boolean var11) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 40411190448116L;
      int var12 = (int)((var1 ^ 40411190448116L) >>> 32);
      int var13 = (int)((var1 ^ 40411190448116L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var1 ^ 68328806059102L;
      long var17 = var1 ^ 17657186861791L;
      long var19 = var1 ^ 26973394725839L;
      super();
      String[] var10000 = x44.a<"v">(5871851393662084342L, var1);
      this.G = 1;
      x44.a<"u">(this, 1, 6039447114980291073L, var1);
      this.F = (char)b<"a">(10981, 2727020685558073401L ^ var1);
      x44.a<"u">(this, new StringBuilder(), 6036315858952559675L, var1);
      x44.a<"u">(this, new StringBuilder(), 6124324689462777256L, var1);
      x44.a<"u">(this, false, 5763910196175921550L, var1);
      x44.a<"u">(this, false, 5618174726686219470L, var1);
      this.P = new StringBuilder();
      x44.a<"u">(this, new StringBuilder(), 6184671806356006768L, var1);
      this.m = false;
      String[] var21 = var10000;

      String var22;
      label39: {
         label38: {
            label37: {
               label43: {
                  try {
                     x44.a<"u">(this, new StringBuilder(), 5895913422084763398L, var1);
                     var10000 = var6;
                     if (var21 != null) {
                        break label37;
                     }

                     if (var6 != null) {
                        break label43;
                     }
                  } catch (gj var29) {
                     throw x44.a<"v">(var29, 5575346131516726275L, var1);
                  }

                  var22 = a<"u">(560, 3985841012560071218L ^ var1);

                  try {
                     var10000 = var21;
                     if (var1 < 0L) {
                        break label39;
                     }

                     if (var21 == null) {
                        break label38;
                     }

                     x44.a<"v">(new String[4], 5337466126294740644L, var1);
                  } catch (gj var28) {
                     throw x44.a<"v">(var28, 5575346131516726275L, var1);
                  }
               }

               var10000 = var6;
            }

            var22 = var10000;
         }

         Object[] var10004 = new Object[]{null, var3, var7};
         var10000 = var10004;
         var10004[0] = var17;
      }

      x44.a<"v">(var10000, 5429603150473673380L, var1);
      PushbackReader var23 = new PushbackReader(new BufferedReader(new InputStreamReader(var3, var22)), b<"a">(4070, 1757195844805422489L ^ var1));
      ByteArrayOutputStream var24 = new ByteArrayOutputStream();
      this.n = var5;
      this.e = var10;
      PrintWriter var25 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(var24, var22)));
      ArrayList var26 = new ArrayList();
      Object[] var10007 = new Object[]{null, null, null, var25, var11};
      var10007[2] = var15;
      var10007[1] = var26;
      var10007[0] = var23;
      x44.a<"h">(this, var10007, 5353919341365837998L, var1);
      x44.a<"h">(this, new Object[]{var26, var25, var19}, 5829977484038157042L, var1);
      x44.a<"n">(var25, 5464334227241990268L, var1);
      byte[] var27 = x44.a<"n">(var24, 5845830171332522779L, var1);
      char var34 = (char)var13;
      short var35 = (short)var14;
      var10007 = new Object[]{null, null, null, null, null, var9};
      var10007[4] = Integer.valueOf(var35);
      var10007[3] = var8;
      var10007[2] = var27;
      var10007[1] = Integer.valueOf(var34);
      var10007[0] = var12;
      var27 = x44.a<"v">(var10007, 5919362723994677240L, var1);
      x44.a<"n">(var4, var27, 5570563808049031171L, var1);
      x44.a<"n">(var4, 5827744172758391304L, var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18810;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/u", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8987;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/u", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
