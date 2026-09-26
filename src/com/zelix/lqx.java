package com.zelix;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lqx {
   public static final String a;
   private static List Q;
   public static int x;
   public static final String z;
   public static boolean n;
   public static final char m;
   public static final String K;
   public static final String g;
   public static final String N;
   public static final String A;
   public static final File U;
   public static final char P;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;
   private static final long[] j;
   private static final Long[] k;
   private static final Map l;

   public static void a(Object[] param0) {
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
      // 016: checkcast java/lang/String
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Integer
      // 020: astore 4
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Integer
      // 028: astore 2
      // 029: pop
      // 02a: getstatic com/zelix/lqx.b J
      // 02d: lload 5
      // 02f: lxor
      // 030: lstore 5
      // 032: ldc2_w 2644267038925366410
      // 035: lload 5
      // 037: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: istore 7
      // 03e: new java/io/File
      // 041: dup
      // 042: aload 3
      // 043: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 046: ldc2_w 2603465795976747354
      // 049: lload 5
      // 04b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: new java/io/File
      // 053: dup
      // 054: aload 1
      // 055: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 058: ldc2_w 2603465795976747354
      // 05b: lload 5
      // 05d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 065: ifeq 0b0
      // 068: new java/lang/IllegalArgumentException
      // 06b: dup
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 19614
      // 076: ldc2_w 6305436551195856172
      // 079: lload 5
      // 07b: lxor
      // 07c: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: new java/io/File
      // 087: dup
      // 088: aload 3
      // 089: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 08c: ldc2_w 2603465795976747354
      // 08f: lload 5
      // 091: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: ldc "'"
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a1: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: ldc2_w 4132376690166833338
      // 0a8: lload 5
      // 0aa: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aconst_null
      // 0b1: astore 8
      // 0b3: aconst_null
      // 0b4: astore 9
      // 0b6: aload 4
      // 0b8: ifnull 0d4
      // 0bb: new java/io/BufferedInputStream
      // 0be: dup
      // 0bf: new java/io/FileInputStream
      // 0c2: dup
      // 0c3: aload 3
      // 0c4: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0c7: aload 4
      // 0c9: invokevirtual java/lang/Integer.intValue ()I
      // 0cc: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;I)V
      // 0cf: astore 9
      // 0d1: goto 0e5
      // 0d4: new java/io/BufferedInputStream
      // 0d7: dup
      // 0d8: new java/io/FileInputStream
      // 0db: dup
      // 0dc: aload 3
      // 0dd: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0e0: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 0e3: astore 9
      // 0e5: aload 2
      // 0e6: ifnull 101
      // 0e9: new java/io/BufferedOutputStream
      // 0ec: dup
      // 0ed: new java/io/FileOutputStream
      // 0f0: dup
      // 0f1: aload 1
      // 0f2: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 0f5: aload 2
      // 0f6: invokevirtual java/lang/Integer.intValue ()I
      // 0f9: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 0fc: astore 8
      // 0fe: goto 112
      // 101: new java/io/BufferedOutputStream
      // 104: dup
      // 105: new java/io/FileOutputStream
      // 108: dup
      // 109: aload 1
      // 10a: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 10d: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;)V
      // 110: astore 8
      // 112: aload 9
      // 114: ldc2_w 2585322997840852424
      // 117: lload 5
      // 119: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: istore 10
      // 120: iload 10
      // 122: newarray 8
      // 124: astore 11
      // 126: bipush 0
      // 127: istore 12
      // 129: iload 12
      // 12b: iload 10
      // 12d: if_icmpge 1a4
      // 130: aload 9
      // 132: iload 7
      // 134: lload 5
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 1d8
      // 13b: ifne 1d6
      // 13e: aload 11
      // 140: iload 12
      // 142: sipush 12552
      // 145: ldc2_w 5368525305318251924
      // 148: lload 5
      // 14a: lxor
      // 14b: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: iload 10
      // 152: iload 12
      // 154: isub
      // 155: ldc2_w 2313291482797792549
      // 158: lload 5
      // 15a: invokedynamic j (IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: ldc2_w 2655059673779276504
      // 162: lload 5
      // 164: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: dup
      // 16a: istore 13
      // 16c: lload 5
      // 16e: lconst_0
      // 16f: lcmp
      // 170: iflt 1a1
      // 173: bipush -1
      // 174: iload 7
      // 176: ifne 19c
      // 179: if_icmpeq 1a4
      // 17c: goto 18a
      // 17f: ldc2_w 4132376690166833338
      // 182: lload 5
      // 184: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: iload 12
      // 18c: iload 13
      // 18e: goto 19c
      // 191: ldc2_w 4132376690166833338
      // 194: lload 5
      // 196: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: iadd
      // 19d: istore 12
      // 19f: iload 7
      // 1a1: ifeq 129
      // 1a4: aload 8
      // 1a6: aload 11
      // 1a8: invokevirtual java/io/BufferedOutputStream.write ([B)V
      // 1ab: lload 5
      // 1ad: lconst_0
      // 1ae: lcmp
      // 1af: ifle 1f8
      // 1b2: lload 5
      // 1b4: lconst_0
      // 1b5: lcmp
      // 1b6: iflt 1cf
      // 1b9: aload 8
      // 1bb: iload 7
      // 1bd: ifne 1c5
      // 1c0: ifnull 1d4
      // 1c3: aload 8
      // 1c5: ldc2_w 4072427203466009383
      // 1c8: lload 5
      // 1ca: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: goto 1d4
      // 1d2: astore 10
      // 1d4: aload 9
      // 1d6: iload 7
      // 1d8: ifne 1ee
      // 1db: ifnull 265
      // 1de: goto 1ec
      // 1e1: ldc2_w 4132376690166833338
      // 1e4: lload 5
      // 1e6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aload 9
      // 1ee: ldc2_w 2497938476465799280
      // 1f1: lload 5
      // 1f3: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: goto 265
      // 1fb: astore 10
      // 1fd: goto 265
      // 200: astore 14
      // 202: lload 5
      // 204: lconst_0
      // 205: lcmp
      // 206: iflt 22d
      // 209: aload 8
      // 20b: iload 7
      // 20d: ifne 223
      // 210: ifnull 232
      // 213: goto 221
      // 216: ldc2_w 4132376690166833338
      // 219: lload 5
      // 21b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 8
      // 223: ldc2_w 4072427203466009383
      // 226: lload 5
      // 228: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: goto 232
      // 230: astore 15
      // 232: lload 5
      // 234: lconst_0
      // 235: lcmp
      // 236: ifle 25d
      // 239: aload 9
      // 23b: iload 7
      // 23d: ifne 253
      // 240: ifnull 262
      // 243: goto 251
      // 246: ldc2_w 4132376690166833338
      // 249: lload 5
      // 24b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: aload 9
      // 253: ldc2_w 2497938476465799280
      // 256: lload 5
      // 258: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: goto 262
      // 260: astore 15
      // 262: aload 14
      // 264: athrow
      // 265: return
   }

   public static boolean l(String param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lqx.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: aload 0
      // 007: invokevirtual java/lang/String.length ()I
      // 00a: istore 4
      // 00c: ldc2_w 7102028967387652791
      // 00f: lload 1
      // 010: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: aload 0
      // 016: sipush 26591
      // 019: ldc2_w 8583809730448723327
      // 01c: lload 1
      // 01d: lxor
      // 01e: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: invokevirtual java/lang/String.lastIndexOf (I)I
      // 026: istore 5
      // 028: istore 3
      // 029: iload 5
      // 02b: iload 3
      // 02c: ifne 127
      // 02f: ifle 126
      // 032: goto 03f
      // 035: ldc2_w 9179477194143491719
      // 038: lload 1
      // 039: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: athrow
      // 03f: iload 5
      // 041: iload 4
      // 043: bipush 4
      // 044: isub
      // 045: iload 3
      // 046: ifne 08a
      // 049: goto 056
      // 04c: ldc2_w 9179477194143491719
      // 04f: lload 1
      // 050: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: if_icmpeq 08d
      // 059: goto 066
      // 05c: ldc2_w 9179477194143491719
      // 05f: lload 1
      // 060: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: iload 5
      // 068: iload 3
      // 069: ifne 127
      // 06c: goto 079
      // 06f: ldc2_w 9179477194143491719
      // 072: lload 1
      // 073: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: iload 4
      // 07b: bipush 5
      // 07c: isub
      // 07d: goto 08a
      // 080: ldc2_w 9179477194143491719
      // 083: lload 1
      // 084: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: if_icmpne 126
      // 08d: aload 0
      // 08e: iload 5
      // 090: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 093: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 096: astore 6
      // 098: aload 6
      // 09a: sipush 23285
      // 09d: ldc2_w 6133564899361316165
      // 0a0: lload 1
      // 0a1: lxor
      // 0a2: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0aa: iload 3
      // 0ab: ifne 125
      // 0ae: ifne 124
      // 0b1: goto 0be
      // 0b4: ldc2_w 9179477194143491719
      // 0b7: lload 1
      // 0b8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 6
      // 0c0: sipush 17065
      // 0c3: ldc2_w 795282498135278860
      // 0c6: lload 1
      // 0c7: lxor
      // 0c8: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d0: iload 3
      // 0d1: ifne 125
      // 0d4: goto 0e1
      // 0d7: ldc2_w 9179477194143491719
      // 0da: lload 1
      // 0db: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: ifne 124
      // 0e4: goto 0f1
      // 0e7: ldc2_w 9179477194143491719
      // 0ea: lload 1
      // 0eb: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 6
      // 0f3: sipush 16216
      // 0f6: ldc2_w 7027405509840517357
      // 0f9: lload 1
      // 0fa: lxor
      // 0fb: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 103: iload 3
      // 104: ifne 127
      // 107: goto 114
      // 10a: ldc2_w 9179477194143491719
      // 10d: lload 1
      // 10e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: ifeq 126
      // 117: goto 124
      // 11a: ldc2_w 9179477194143491719
      // 11d: lload 1
      // 11e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: bipush 1
      // 125: ireturn
      // 126: bipush 0
      // 127: ireturn
   }

   public static boolean k(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/io/File
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lqx.b J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: lload 2
      // 1a: dup2
      // 1b: ldc2_w 48196567662670
      // 1e: lxor
      // 1f: lstore 4
      // 21: dup2
      // 22: ldc2_w 69448797151211
      // 25: lxor
      // 26: lstore 6
      // 28: dup2
      // 29: ldc2_w 83618873106189
      // 2c: lxor
      // 2d: lstore 8
      // 2f: pop2
      // 30: ldc2_w -835167959174387784
      // 33: lload 2
      // 34: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: aload 1
      // 3a: ldc2_w -799213151688484816
      // 3d: lload 2
      // 3e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: astore 11
      // 45: istore 10
      // 47: lload 6
      // 49: aload 11
      // 4b: bipush 2
      // 4c: anewarray 281
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 1
      // 52: swap
      // 53: aastore
      // 54: dup_x2
      // 55: dup_x2
      // 56: pop
      // 57: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a: bipush 0
      // 5b: swap
      // 5c: aastore
      // 5d: ldc2_w -1537709408268614734
      // 60: lload 2
      // 61: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: iload 10
      // 68: ifeq f1
      // 6b: ifne f0
      // 6e: goto 7b
      // 71: ldc2_w -1251120417489520832
      // 74: lload 2
      // 75: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 11
      // 7d: lload 8
      // 7f: ldc2_w -1356500797868982367
      // 82: lload 2
      // 83: invokedynamic h (Ljava/lang/Object;JJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: iload 10
      // 8a: lload 2
      // 8b: lconst_0
      // 8c: lcmp
      // 8d: ifle dd
      // 90: ifeq db
      // 93: goto a0
      // 96: ldc2_w -1251120417489520832
      // 99: lload 2
      // 9a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: ifeq f4
      // a3: goto b0
      // a6: ldc2_w -1251120417489520832
      // a9: lload 2
      // aa: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: aload 1
      // b1: lload 4
      // b3: bipush 2
      // b4: anewarray 281
      // b7: dup_x2
      // b8: dup_x2
      // b9: pop
      // ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bd: bipush 1
      // be: swap
      // bf: aastore
      // c0: dup_x1
      // c1: swap
      // c2: bipush 0
      // c3: swap
      // c4: aastore
      // c5: ldc2_w -1209765401909692340
      // c8: lload 2
      // c9: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: goto db
      // d1: ldc2_w -1251120417489520832
      // d4: lload 2
      // d5: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: iload 10
      // dd: ifeq f1
      // e0: ifeq f4
      // e3: goto f0
      // e6: ldc2_w -1251120417489520832
      // e9: lload 2
      // ea: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: athrow
      // f0: bipush 1
      // f1: goto f5
      // f4: bipush 0
      // f5: ireturn
   }

   public static String R(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic com/zelix/lqx.b J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 82545378364653
      // 025: lxor
      // 026: lstore 5
      // 028: pop2
      // 029: ldc2_w 1514639761510470973
      // 02c: lload 3
      // 02d: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: istore 7
      // 034: aload 1
      // 035: iload 7
      // 037: ifne 057
      // 03a: ifnonnull 056
      // 03d: goto 04a
      // 040: ldc2_w 643558168849781005
      // 043: lload 3
      // 044: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: aconst_null
      // 04b: areturn
      // 04c: ldc2_w 643558168849781005
      // 04f: lload 3
      // 050: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 2
      // 057: iload 7
      // 059: ifne 0b0
      // 05c: ifnonnull 0ac
      // 05f: goto 06c
      // 062: ldc2_w 643558168849781005
      // 065: lload 3
      // 066: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: new java/lang/IllegalArgumentException
      // 06f: dup
      // 070: new java/lang/StringBuilder
      // 073: dup
      // 074: invokespecial java/lang/StringBuilder.<init> ()V
      // 077: sipush 29306
      // 07a: ldc2_w 8928124171445109328
      // 07d: lload 3
      // 07e: lxor
      // 07f: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 087: aload 1
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: sipush 9253
      // 08e: ldc2_w 5324336313963435025
      // 091: lload 3
      // 092: lxor
      // 093: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a1: athrow
      // 0a2: ldc2_w 643558168849781005
      // 0a5: lload 3
      // 0a6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b0: astore 1
      // 0b1: new java/lang/StringBuilder
      // 0b4: dup
      // 0b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b8: astore 8
      // 0ba: aload 1
      // 0bb: sipush 20639
      // 0be: ldc2_w 1282217126485270671
      // 0c1: lload 3
      // 0c2: lxor
      // 0c3: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0cb: iload 7
      // 0cd: lload 3
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: iflt 2c5
      // 0d3: ifne 2c3
      // 0d6: ifeq 2b0
      // 0d9: goto 0e6
      // 0dc: ldc2_w 643558168849781005
      // 0df: lload 3
      // 0e0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: astore 9
      // 0e9: aload 2
      // 0ea: astore 10
      // 0ec: aload 9
      // 0ee: sipush 20639
      // 0f1: ldc2_w 1282217126485270671
      // 0f4: lload 3
      // 0f5: lxor
      // 0f6: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0fe: ifeq 1f9
      // 101: aload 10
      // 103: lload 5
      // 105: bipush 2
      // 106: anewarray 281
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 1
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: ldc2_w 644399548930962219
      // 11a: lload 3
      // 11b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: astore 11
      // 122: aload 11
      // 124: iload 7
      // 126: lload 3
      // 127: lconst_0
      // 128: lcmp
      // 129: ifle 131
      // 12c: ifne 553
      // 12f: iload 7
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 1b9
      // 137: ifne 1b7
      // 13a: goto 147
      // 13d: ldc2_w 643558168849781005
      // 140: lload 3
      // 141: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: lload 3
      // 148: lconst_0
      // 149: lcmp
      // 14a: ifle 1b3
      // 14d: ifnonnull 1b1
      // 150: goto 15d
      // 153: ldc2_w 643558168849781005
      // 156: lload 3
      // 157: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: new java/lang/IllegalArgumentException
      // 160: dup
      // 161: new java/lang/StringBuilder
      // 164: dup
      // 165: invokespecial java/lang/StringBuilder.<init> ()V
      // 168: sipush 14483
      // 16b: ldc2_w 4769729839303149697
      // 16e: lload 3
      // 16f: lxor
      // 170: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: aload 2
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: sipush 9211
      // 17f: ldc2_w 2994856978742399946
      // 182: lload 3
      // 183: lxor
      // 184: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: aload 1
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: sipush 9253
      // 193: ldc2_w 5324336313963435025
      // 196: lload 3
      // 197: lxor
      // 198: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a3: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1a6: athrow
      // 1a7: ldc2_w 643558168849781005
      // 1aa: lload 3
      // 1ab: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: aload 11
      // 1b3: astore 10
      // 1b5: aload 9
      // 1b7: iload 7
      // 1b9: ifne 1f2
      // 1bc: invokevirtual java/lang/String.length ()I
      // 1bf: bipush 2
      // 1c0: if_icmple 1e3
      // 1c3: goto 1d0
      // 1c6: ldc2_w 643558168849781005
      // 1c9: lload 3
      // 1ca: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: athrow
      // 1d0: aload 9
      // 1d2: bipush 3
      // 1d3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d6: astore 9
      // 1d8: iload 7
      // 1da: lload 3
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: iflt 1f6
      // 1e0: ifeq 1f4
      // 1e3: ldc ""
      // 1e5: goto 1f2
      // 1e8: ldc2_w 643558168849781005
      // 1eb: lload 3
      // 1ec: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: astore 9
      // 1f4: iload 7
      // 1f6: ifeq 0ec
      // 1f9: aload 8
      // 1fb: aload 10
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 200: pop
      // 201: aload 8
      // 203: iload 7
      // 205: ifne 2a4
      // 208: invokevirtual java/lang/StringBuilder.length ()I
      // 20b: ifle 29d
      // 20e: goto 21b
      // 211: ldc2_w 643558168849781005
      // 214: lload 3
      // 215: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: athrow
      // 21b: aload 8
      // 21d: lload 3
      // 21e: lconst_0
      // 21f: lcmp
      // 220: ifle 2a4
      // 223: iload 7
      // 225: ifne 2a4
      // 228: goto 235
      // 22b: ldc2_w 643558168849781005
      // 22e: lload 3
      // 22f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: lload 3
      // 236: lconst_0
      // 237: lcmp
      // 238: iflt 29f
      // 23b: aload 8
      // 23d: invokevirtual java/lang/StringBuilder.length ()I
      // 240: bipush 1
      // 241: isub
      // 242: ldc2_w 1005127942569959511
      // 245: lload 3
      // 246: invokedynamic r (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: sipush 16431
      // 24e: ldc2_w 3858967177742048530
      // 251: lload 3
      // 252: lxor
      // 253: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: if_icmpeq 29d
      // 25b: goto 268
      // 25e: ldc2_w 643558168849781005
      // 261: lload 3
      // 262: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: aload 9
      // 26a: invokevirtual java/lang/String.length ()I
      // 26d: ifle 29d
      // 270: goto 27d
      // 273: ldc2_w 643558168849781005
      // 276: lload 3
      // 277: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: aload 8
      // 27f: sipush 16431
      // 282: ldc2_w 3858967177742048530
      // 285: lload 3
      // 286: lxor
      // 287: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 28f: pop
      // 290: goto 29d
      // 293: ldc2_w 643558168849781005
      // 296: lload 3
      // 297: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: athrow
      // 29d: aload 8
      // 29f: aload 9
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: lload 3
      // 2a5: lconst_0
      // 2a6: lcmp
      // 2a7: ifle 550
      // 2aa: pop
      // 2ab: iload 7
      // 2ad: ifeq 54e
      // 2b0: aload 1
      // 2b1: ldc "."
      // 2b3: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2b6: goto 2c3
      // 2b9: ldc2_w 643558168849781005
      // 2bc: lload 3
      // 2bd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: athrow
      // 2c3: iload 7
      // 2c5: lload 3
      // 2c6: lconst_0
      // 2c7: lcmp
      // 2c8: ifle 48e
      // 2cb: ifne 48c
      // 2ce: ifeq 47a
      // 2d1: goto 2de
      // 2d4: ldc2_w 643558168849781005
      // 2d7: lload 3
      // 2d8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: aload 2
      // 2df: iload 7
      // 2e1: ifne 3ef
      // 2e4: goto 2f1
      // 2e7: ldc2_w 643558168849781005
      // 2ea: lload 3
      // 2eb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: athrow
      // 2f1: lload 3
      // 2f2: lconst_0
      // 2f3: lcmp
      // 2f4: iflt 3e2
      // 2f7: invokevirtual java/lang/String.length ()I
      // 2fa: ifle 3dd
      // 2fd: goto 30a
      // 300: ldc2_w 643558168849781005
      // 303: lload 3
      // 304: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: athrow
      // 30a: aload 8
      // 30c: aload 2
      // 30d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 310: pop
      // 311: aload 1
      // 312: iload 7
      // 314: ifne 553
      // 317: goto 324
      // 31a: ldc2_w 643558168849781005
      // 31d: lload 3
      // 31e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: invokevirtual java/lang/String.length ()I
      // 327: bipush 1
      // 328: if_icmple 54e
      // 32b: goto 338
      // 32e: ldc2_w 643558168849781005
      // 331: lload 3
      // 332: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 337: athrow
      // 338: aload 8
      // 33a: lload 3
      // 33b: lconst_0
      // 33c: lcmp
      // 33d: iflt 3d1
      // 340: iload 7
      // 342: ifne 3d1
      // 345: goto 352
      // 348: ldc2_w 643558168849781005
      // 34b: lload 3
      // 34c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: lload 3
      // 353: lconst_0
      // 354: lcmp
      // 355: ifle 3c9
      // 358: aload 8
      // 35a: invokevirtual java/lang/StringBuilder.length ()I
      // 35d: bipush 1
      // 35e: isub
      // 35f: ldc2_w 1005127942569959511
      // 362: lload 3
      // 363: invokedynamic r (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: sipush 16431
      // 36b: ldc2_w 3858967177742048530
      // 36e: lload 3
      // 36f: lxor
      // 370: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: if_icmpne 3c7
      // 378: goto 385
      // 37b: ldc2_w 643558168849781005
      // 37e: lload 3
      // 37f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: athrow
      // 385: aload 1
      // 386: bipush 1
      // 387: invokevirtual java/lang/String.charAt (I)C
      // 38a: sipush 16431
      // 38d: ldc2_w 3858967177742048530
      // 390: lload 3
      // 391: lxor
      // 392: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: if_icmpne 3c7
      // 39a: goto 3a7
      // 39d: ldc2_w 643558168849781005
      // 3a0: lload 3
      // 3a1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: aload 8
      // 3a9: aload 8
      // 3ab: invokevirtual java/lang/StringBuilder.length ()I
      // 3ae: bipush 1
      // 3af: isub
      // 3b0: ldc2_w 1636678911228409370
      // 3b3: lload 3
      // 3b4: invokedynamic r (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b9: pop
      // 3ba: goto 3c7
      // 3bd: ldc2_w 643558168849781005
      // 3c0: lload 3
      // 3c1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: aload 8
      // 3c9: aload 1
      // 3ca: bipush 1
      // 3cb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d1: lload 3
      // 3d2: lconst_0
      // 3d3: lcmp
      // 3d4: iflt 550
      // 3d7: pop
      // 3d8: iload 7
      // 3da: ifeq 54e
      // 3dd: aload 1
      // 3de: bipush 1
      // 3df: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3e2: goto 3ef
      // 3e5: ldc2_w 643558168849781005
      // 3e8: lload 3
      // 3e9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ee: athrow
      // 3ef: astore 9
      // 3f1: aload 9
      // 3f3: invokevirtual java/lang/String.length ()I
      // 3f6: iload 7
      // 3f8: lload 3
      // 3f9: lconst_0
      // 3fa: lcmp
      // 3fb: iflt 44f
      // 3fe: ifne 43c
      // 401: ifle 46f
      // 404: goto 411
      // 407: ldc2_w 643558168849781005
      // 40a: lload 3
      // 40b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 410: athrow
      // 411: aload 9
      // 413: lload 3
      // 414: lconst_0
      // 415: lcmp
      // 416: iflt 465
      // 419: bipush 0
      // 41a: iload 7
      // 41c: ifne 462
      // 41f: goto 42c
      // 422: ldc2_w 643558168849781005
      // 425: lload 3
      // 426: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42b: athrow
      // 42c: invokevirtual java/lang/String.charAt (I)C
      // 42f: goto 43c
      // 432: ldc2_w 643558168849781005
      // 435: lload 3
      // 436: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: athrow
      // 43c: lload 3
      // 43d: lconst_0
      // 43e: lcmp
      // 43f: iflt 471
      // 442: sipush 16431
      // 445: ldc2_w 3858967177742048530
      // 448: lload 3
      // 449: lxor
      // 44a: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44f: if_icmpne 46f
      // 452: aload 9
      // 454: bipush 1
      // 455: goto 462
      // 458: ldc2_w 643558168849781005
      // 45b: lload 3
      // 45c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 461: athrow
      // 462: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 465: astore 9
      // 467: aload 8
      // 469: aload 9
      // 46b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46e: pop
      // 46f: iload 7
      // 471: lload 3
      // 472: lconst_0
      // 473: lcmp
      // 474: iflt 47f
      // 477: ifeq 54e
      // 47a: aload 1
      // 47b: bipush 0
      // 47c: invokevirtual java/lang/String.charAt (I)C
      // 47f: goto 48c
      // 482: ldc2_w 643558168849781005
      // 485: lload 3
      // 486: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: iload 7
      // 48e: lload 3
      // 48f: lconst_0
      // 490: lcmp
      // 491: ifle 4c6
      // 494: ifne 4c4
      // 497: sipush 16431
      // 49a: ldc2_w 3858967177742048530
      // 49d: lload 3
      // 49e: lxor
      // 49f: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: if_icmpne 4c0
      // 4a7: goto 4b4
      // 4aa: ldc2_w 643558168849781005
      // 4ad: lload 3
      // 4ae: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b3: athrow
      // 4b4: aload 1
      // 4b5: areturn
      // 4b6: ldc2_w 643558168849781005
      // 4b9: lload 3
      // 4ba: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: athrow
      // 4c0: aload 2
      // 4c1: invokevirtual java/lang/String.length ()I
      // 4c4: iload 7
      // 4c6: lload 3
      // 4c7: lconst_0
      // 4c8: lcmp
      // 4c9: ifle 524
      // 4cc: ifne 517
      // 4cf: ifle 547
      // 4d2: goto 4df
      // 4d5: ldc2_w 643558168849781005
      // 4d8: lload 3
      // 4d9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: athrow
      // 4df: aload 8
      // 4e1: aload 2
      // 4e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e5: pop
      // 4e6: aload 8
      // 4e8: iload 7
      // 4ea: ifne 54d
      // 4ed: goto 4fa
      // 4f0: ldc2_w 643558168849781005
      // 4f3: lload 3
      // 4f4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f9: athrow
      // 4fa: aload 8
      // 4fc: invokevirtual java/lang/StringBuilder.length ()I
      // 4ff: bipush 1
      // 500: isub
      // 501: ldc2_w 1005127942569959511
      // 504: lload 3
      // 505: invokedynamic r (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50a: goto 517
      // 50d: ldc2_w 643558168849781005
      // 510: lload 3
      // 511: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 516: athrow
      // 517: sipush 16431
      // 51a: ldc2_w 3858967177742048530
      // 51d: lload 3
      // 51e: lxor
      // 51f: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: if_icmpeq 547
      // 527: aload 8
      // 529: sipush 16431
      // 52c: ldc2_w 3858967177742048530
      // 52f: lload 3
      // 530: lxor
      // 531: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 536: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 539: pop
      // 53a: goto 547
      // 53d: ldc2_w 643558168849781005
      // 540: lload 3
      // 541: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 546: athrow
      // 547: aload 8
      // 549: aload 1
      // 54a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54d: pop
      // 54e: aload 8
      // 550: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 553: areturn
   }

   public static BufferedReader d(Object[] var0) {
      long var3 = (Long)var0[0];
      String var2 = (String)var0[1];
      String var1 = (String)var0[2];
      var3 = b ^ var3;
      long var5 = var3 ^ 33980865307763L;
      FileInputStream var10000 = new FileInputStream(var2.trim());
      Object var7 = null;
      FileInputStream var9 = var10000;
      return m44.a<"l">(new Object[]{var5, var9, var1, var7}, 4523915020940760885L, var3);
   }

   private static List B(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/io/File
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/sz
      // 028: astore 3
      // 029: pop
      // 02a: getstatic com/zelix/lqx.b J
      // 02d: lload 4
      // 02f: lxor
      // 030: lstore 4
      // 032: lload 4
      // 034: dup2
      // 035: ldc2_w 1544140663642
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 83350705424280
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 130485404102514
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 57884942793899
      // 04d: lxor
      // 04e: lstore 13
      // 050: pop2
      // 051: ldc2_w -4768981506508505623
      // 054: lload 4
      // 056: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 1
      // 05c: ldc2_w -6663206912253745944
      // 05f: lload 4
      // 061: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 069: istore 16
      // 06b: istore 15
      // 06d: iload 16
      // 06f: bipush -1
      // 070: if_icmple 092
      // 073: aload 1
      // 074: bipush 0
      // 075: iload 16
      // 077: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 07a: astore 17
      // 07c: aload 1
      // 07d: iload 16
      // 07f: bipush 1
      // 080: iadd
      // 081: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 084: astore 18
      // 086: lload 4
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 098
      // 08d: iload 15
      // 08f: ifeq 098
      // 092: aconst_null
      // 093: astore 17
      // 095: aload 1
      // 096: astore 18
      // 098: aload 17
      // 09a: iload 15
      // 09c: ifne 0c9
      // 09f: ifnonnull 0b9
      // 0a2: goto 0b0
      // 0a5: ldc2_w -6901105629013526055
      // 0a8: lload 4
      // 0aa: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 6
      // 0b2: astore 19
      // 0b4: iload 15
      // 0b6: ifeq 10e
      // 0b9: aload 17
      // 0bb: goto 0c9
      // 0be: ldc2_w -6901105629013526055
      // 0c1: lload 4
      // 0c3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: lload 9
      // 0cb: bipush 2
      // 0cc: anewarray 281
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: bipush 0
      // 0db: swap
      // 0dc: aastore
      // 0dd: ldc2_w -6444122114904004132
      // 0e0: lload 4
      // 0e2: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: ifeq 103
      // 0ea: new java/io/File
      // 0ed: dup
      // 0ee: aload 6
      // 0f0: aload 17
      // 0f2: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0f5: lload 4
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 10c
      // 0fc: astore 19
      // 0fe: iload 15
      // 100: ifeq 10e
      // 103: new java/io/File
      // 106: dup
      // 107: aload 17
      // 109: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 10c: astore 19
      // 10e: new java/util/Vector
      // 111: dup
      // 112: invokespecial java/util/Vector.<init> ()V
      // 115: astore 20
      // 117: aload 19
      // 119: ldc2_w -4812783952459351827
      // 11c: lload 4
      // 11e: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: lload 4
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 1b0
      // 12a: iload 15
      // 12c: ifne 1b0
      // 12f: ifne 191
      // 132: goto 140
      // 135: ldc2_w -6901105629013526055
      // 138: lload 4
      // 13a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 3
      // 141: new java/lang/StringBuilder
      // 144: dup
      // 145: invokespecial java/lang/StringBuilder.<init> ()V
      // 148: sipush 26308
      // 14b: ldc2_w 2747165010815761981
      // 14e: lload 4
      // 150: lxor
      // 151: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: aload 19
      // 15b: ldc2_w -4809246182136201159
      // 15e: lload 4
      // 160: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 168: sipush 14006
      // 16b: ldc2_w 8512310659570724454
      // 16e: lload 4
      // 170: lxor
      // 171: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17c: lload 13
      // 17e: dup2_x1
      // 17f: pop2
      // 180: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 183: aload 20
      // 185: areturn
      // 186: ldc2_w -6901105629013526055
      // 189: lload 4
      // 18b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aload 19
      // 193: iload 15
      // 195: ifne 206
      // 198: ldc2_w -6917184906112832645
      // 19b: lload 4
      // 19d: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: goto 1b0
      // 1a5: ldc2_w -6901105629013526055
      // 1a8: lload 4
      // 1aa: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: ifne 204
      // 1b3: aload 3
      // 1b4: new java/lang/StringBuilder
      // 1b7: dup
      // 1b8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bb: sipush 10190
      // 1be: ldc2_w 5206193288698625833
      // 1c1: lload 4
      // 1c3: lxor
      // 1c4: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: aload 19
      // 1ce: ldc2_w -4809246182136201159
      // 1d1: lload 4
      // 1d3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: sipush 24537
      // 1de: ldc2_w 5444326202650167101
      // 1e1: lload 4
      // 1e3: lxor
      // 1e4: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ef: lload 13
      // 1f1: dup2_x1
      // 1f2: pop2
      // 1f3: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 1f6: aload 20
      // 1f8: areturn
      // 1f9: ldc2_w -6901105629013526055
      // 1fc: lload 4
      // 1fe: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: aload 19
      // 206: ldc2_w -6541170346665322355
      // 209: lload 4
      // 20b: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: astore 21
      // 212: aload 21
      // 214: iload 15
      // 216: ifne 27d
      // 219: ifnonnull 27b
      // 21c: goto 22a
      // 21f: ldc2_w -6901105629013526055
      // 222: lload 4
      // 224: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 3
      // 22b: new java/lang/StringBuilder
      // 22e: dup
      // 22f: invokespecial java/lang/StringBuilder.<init> ()V
      // 232: sipush 30468
      // 235: ldc2_w 3708577810930937844
      // 238: lload 4
      // 23a: lxor
      // 23b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: aload 19
      // 245: ldc2_w -4809246182136201159
      // 248: lload 4
      // 24a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 252: sipush 1768
      // 255: ldc2_w 7501015574232587786
      // 258: lload 4
      // 25a: lxor
      // 25b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 263: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 266: lload 13
      // 268: dup2_x1
      // 269: pop2
      // 26a: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 26d: aload 20
      // 26f: areturn
      // 270: ldc2_w -6901105629013526055
      // 273: lload 4
      // 275: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: aload 21
      // 27d: astore 22
      // 27f: aload 22
      // 281: arraylength
      // 282: istore 23
      // 284: bipush 0
      // 285: istore 24
      // 287: iload 24
      // 289: iload 23
      // 28b: if_icmpge 338
      // 28e: aload 22
      // 290: iload 24
      // 292: aaload
      // 293: astore 25
      // 295: iload 15
      // 297: lload 4
      // 299: lconst_0
      // 29a: lcmp
      // 29b: ifle 335
      // 29e: ifne 333
      // 2a1: aload 25
      // 2a3: ldc2_w -6917184906112832645
      // 2a6: lload 4
      // 2a8: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: ifeq 330
      // 2b0: goto 2be
      // 2b3: ldc2_w -6901105629013526055
      // 2b6: lload 4
      // 2b8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: aload 25
      // 2c0: iload 15
      // 2c2: ifne 305
      // 2c5: goto 2d3
      // 2c8: ldc2_w -6901105629013526055
      // 2cb: lload 4
      // 2cd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: athrow
      // 2d3: ldc2_w -5011970120332421463
      // 2d6: lload 4
      // 2d8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: lload 11
      // 2df: aload 18
      // 2e1: invokestatic com/zelix/mn.R (Ljava/lang/String;JLjava/lang/String;)Z
      // 2e4: ifeq 330
      // 2e7: goto 2f5
      // 2ea: ldc2_w -6901105629013526055
      // 2ed: lload 4
      // 2ef: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: athrow
      // 2f5: aload 25
      // 2f7: goto 305
      // 2fa: ldc2_w -6901105629013526055
      // 2fd: lload 4
      // 2ff: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: athrow
      // 305: aload 2
      // 306: aload 20
      // 308: lload 7
      // 30a: bipush 4
      // 30b: anewarray 281
      // 30e: dup_x2
      // 30f: dup_x2
      // 310: pop
      // 311: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 314: bipush 3
      // 315: swap
      // 316: aastore
      // 317: dup_x1
      // 318: swap
      // 319: bipush 2
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 1
      // 31f: swap
      // 320: aastore
      // 321: dup_x1
      // 322: swap
      // 323: bipush 0
      // 324: swap
      // 325: aastore
      // 326: ldc2_w -6604783434122019429
      // 329: lload 4
      // 32b: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: iinc 24 1
      // 333: iload 15
      // 335: ifeq 287
      // 338: aload 20
      // 33a: areturn
   }

   public static List t(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/io/File
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/sz
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Boolean
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: istore 1
      // 02d: pop
      // 02e: getstatic com/zelix/lqx.b J
      // 031: lload 2
      // 032: lxor
      // 033: lstore 2
      // 034: lload 2
      // 035: dup2
      // 036: ldc2_w 74830811422829
      // 039: lxor
      // 03a: lstore 7
      // 03c: dup2
      // 03d: ldc2_w 89897205126427
      // 040: lxor
      // 041: lstore 9
      // 043: dup2
      // 044: ldc2_w 111582969878946
      // 047: lxor
      // 048: lstore 11
      // 04a: dup2
      // 04b: ldc2_w 111322467778199
      // 04e: lxor
      // 04f: lstore 13
      // 051: dup2
      // 052: ldc2_w 85893976456913
      // 055: lxor
      // 056: lstore 15
      // 058: dup2
      // 059: ldc2_w 110609417566083
      // 05c: lxor
      // 05d: lstore 17
      // 05f: dup2
      // 060: ldc2_w 98933935333225
      // 063: lxor
      // 064: lstore 19
      // 066: dup2
      // 067: ldc2_w 30729304624304
      // 06a: lxor
      // 06b: lstore 21
      // 06d: pop2
      // 06e: aload 6
      // 070: lload 9
      // 072: bipush 1
      // 073: anewarray 281
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: ldc2_w 1289934632055271251
      // 082: lload 2
      // 083: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/sz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: pop
      // 089: ldc2_w 786639103505111354
      // 08c: lload 2
      // 08d: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: new java/util/Vector
      // 095: dup
      // 096: invokespecial java/util/Vector.<init> ()V
      // 099: astore 24
      // 09b: istore 23
      // 09d: iload 23
      // 09f: ifeq 105
      // 0a2: aload 5
      // 0a4: ifnull 0e4
      // 0a7: goto 0b4
      // 0aa: ldc2_w 1162341749306788290
      // 0ad: lload 2
      // 0ae: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 5
      // 0b6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b9: iload 23
      // 0bb: ifeq 10d
      // 0be: goto 0cb
      // 0c1: ldc2_w 1162341749306788290
      // 0c4: lload 2
      // 0c5: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 10a
      // 0d1: invokevirtual java/lang/String.length ()I
      // 0d4: ifne 108
      // 0d7: goto 0e4
      // 0da: ldc2_w 1162341749306788290
      // 0dd: lload 2
      // 0de: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 6
      // 0e6: lload 21
      // 0e8: sipush 28958
      // 0eb: ldc2_w 444162951568824799
      // 0ee: lload 2
      // 0ef: lxor
      // 0f0: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 0f8: goto 105
      // 0fb: ldc2_w 1162341749306788290
      // 0fe: lload 2
      // 0ff: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 24
      // 107: areturn
      // 108: aload 5
      // 10a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 10d: astore 25
      // 10f: aload 25
      // 111: lload 13
      // 113: bipush 2
      // 114: anewarray 281
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 1
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w 923118654409494423
      // 128: lload 2
      // 129: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: astore 25
      // 130: aload 25
      // 132: lload 11
      // 134: aload 4
      // 136: bipush 3
      // 137: anewarray 281
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 2
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w 916633730307021411
      // 150: lload 2
      // 151: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: astore 25
      // 158: aload 25
      // 15a: lload 7
      // 15c: bipush 2
      // 15d: anewarray 281
      // 160: dup_x2
      // 161: dup_x2
      // 162: pop
      // 163: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 166: bipush 1
      // 167: swap
      // 168: aastore
      // 169: dup_x1
      // 16a: swap
      // 16b: bipush 0
      // 16c: swap
      // 16d: aastore
      // 16e: ldc2_w 985871124032064953
      // 171: lload 2
      // 172: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: iload 23
      // 179: ifeq 1a7
      // 17c: ifeq 546
      // 17f: goto 18c
      // 182: ldc2_w 1162341749306788290
      // 185: lload 2
      // 186: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: aload 25
      // 18e: ldc2_w 1413188869247636723
      // 191: lload 2
      // 192: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 19a: goto 1a7
      // 19d: ldc2_w 1162341749306788290
      // 1a0: lload 2
      // 1a1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: istore 28
      // 1a9: iload 28
      // 1ab: ifle 32f
      // 1ae: aload 25
      // 1b0: iload 28
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: aload 25
      // 1b6: invokevirtual java/lang/String.length ()I
      // 1b9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1bc: astore 27
      // 1be: aload 25
      // 1c0: bipush 0
      // 1c1: iload 28
      // 1c3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c6: astore 29
      // 1c8: iload 1
      // 1c9: iload 23
      // 1cb: ifeq 2fe
      // 1ce: ifeq 2df
      // 1d1: goto 1de
      // 1d4: ldc2_w 1162341749306788290
      // 1d7: lload 2
      // 1d8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: aload 29
      // 1e0: lload 7
      // 1e2: bipush 2
      // 1e3: anewarray 281
      // 1e6: dup_x2
      // 1e7: dup_x2
      // 1e8: pop
      // 1e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w 985871124032064953
      // 1f7: lload 2
      // 1f8: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: iload 23
      // 1ff: ifeq 2fe
      // 202: goto 20f
      // 205: ldc2_w 1162341749306788290
      // 208: lload 2
      // 209: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: ifeq 2df
      // 212: goto 21f
      // 215: ldc2_w 1162341749306788290
      // 218: lload 2
      // 219: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: aload 29
      // 221: ldc "*"
      // 223: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 226: istore 30
      // 228: aload 29
      // 22a: ldc2_w 1413188869247636723
      // 22d: lload 2
      // 22e: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 236: istore 31
      // 238: iload 30
      // 23a: iload 23
      // 23c: lload 2
      // 23d: lconst_0
      // 23e: lcmp
      // 23f: iflt 247
      // 242: ifeq 29a
      // 245: iload 31
      // 247: if_icmpge 291
      // 24a: goto 257
      // 24d: ldc2_w 1162341749306788290
      // 250: lload 2
      // 251: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: aload 6
      // 259: new java/lang/StringBuilder
      // 25c: dup
      // 25d: invokespecial java/lang/StringBuilder.<init> ()V
      // 260: sipush 12319
      // 263: ldc2_w 4741621128318310642
      // 266: lload 2
      // 267: lxor
      // 268: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: aload 29
      // 272: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 275: ldc "'"
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27d: lload 21
      // 27f: dup2_x1
      // 280: pop2
      // 281: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 284: aload 24
      // 286: areturn
      // 287: ldc2_w 1162341749306788290
      // 28a: lload 2
      // 28b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: athrow
      // 291: ldc2_w 731597284830665195
      // 294: lload 2
      // 295: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: ifne 2aa
      // 29d: aload 27
      // 29f: ldc2_w 1186141274477199125
      // 2a2: lload 2
      // 2a3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: astore 27
      // 2aa: aload 29
      // 2ac: lload 15
      // 2ae: aload 27
      // 2b0: aload 4
      // 2b2: aload 6
      // 2b4: bipush 5
      // 2b5: anewarray 281
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 4
      // 2bb: swap
      // 2bc: aastore
      // 2bd: dup_x1
      // 2be: swap
      // 2bf: bipush 3
      // 2c0: swap
      // 2c1: aastore
      // 2c2: dup_x1
      // 2c3: swap
      // 2c4: bipush 2
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x2
      // 2c8: dup_x2
      // 2c9: pop
      // 2ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cd: bipush 1
      // 2ce: swap
      // 2cf: aastore
      // 2d0: dup_x1
      // 2d1: swap
      // 2d2: bipush 0
      // 2d3: swap
      // 2d4: aastore
      // 2d5: ldc2_w 1355559474315221530
      // 2d8: lload 2
      // 2d9: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: areturn
      // 2df: aload 29
      // 2e1: lload 17
      // 2e3: bipush 2
      // 2e4: anewarray 281
      // 2e7: dup_x2
      // 2e8: dup_x2
      // 2e9: pop
      // 2ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ed: bipush 1
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x1
      // 2f1: swap
      // 2f2: bipush 0
      // 2f3: swap
      // 2f4: aastore
      // 2f5: ldc2_w 1624337406701525447
      // 2f8: lload 2
      // 2f9: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: ifeq 319
      // 301: new java/io/File
      // 304: dup
      // 305: aload 4
      // 307: aload 29
      // 309: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 30c: astore 26
      // 30e: iload 23
      // 310: lload 2
      // 311: lconst_0
      // 312: lcmp
      // 313: iflt 326
      // 316: ifne 324
      // 319: new java/io/File
      // 31c: dup
      // 31d: aload 29
      // 31f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 322: astore 26
      // 324: iload 23
      // 326: lload 2
      // 327: lconst_0
      // 328: lcmp
      // 329: ifle 340
      // 32c: ifne 337
      // 32f: aload 4
      // 331: astore 26
      // 333: aload 25
      // 335: astore 27
      // 337: ldc2_w 731597284830665195
      // 33a: lload 2
      // 33b: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: iload 23
      // 342: lload 2
      // 343: lconst_0
      // 344: lcmp
      // 345: iflt 375
      // 348: ifeq 373
      // 34b: ifne 368
      // 34e: goto 35b
      // 351: ldc2_w 1162341749306788290
      // 354: lload 2
      // 355: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: athrow
      // 35b: aload 27
      // 35d: ldc2_w 1186141274477199125
      // 360: lload 2
      // 361: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: astore 27
      // 368: aload 26
      // 36a: ldc2_w 1160265889342937952
      // 36d: lload 2
      // 36e: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: iload 23
      // 375: ifeq 3b2
      // 378: ifeq 4ee
      // 37b: goto 388
      // 37e: ldc2_w 1162341749306788290
      // 381: lload 2
      // 382: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: athrow
      // 388: aload 26
      // 38a: iload 23
      // 38c: ifeq 3b7
      // 38f: goto 39c
      // 392: ldc2_w 1162341749306788290
      // 395: lload 2
      // 396: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: athrow
      // 39c: ldc2_w 949873770209675510
      // 39f: lload 2
      // 3a0: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: goto 3b2
      // 3a8: ldc2_w 1162341749306788290
      // 3ab: lload 2
      // 3ac: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: athrow
      // 3b2: ifeq 4ee
      // 3b5: aload 26
      // 3b7: ldc2_w 1522840570488907926
      // 3ba: lload 2
      // 3bb: invokedynamic u (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: astore 29
      // 3c2: lload 2
      // 3c3: lconst_0
      // 3c4: lcmp
      // 3c5: iflt 4d6
      // 3c8: aload 29
      // 3ca: ifnull 48b
      // 3cd: bipush 0
      // 3ce: istore 30
      // 3d0: iload 30
      // 3d2: aload 29
      // 3d4: arraylength
      // 3d5: if_icmpge 47a
      // 3d8: aload 29
      // 3da: iload 30
      // 3dc: aaload
      // 3dd: ldc2_w 750633208991475378
      // 3e0: lload 2
      // 3e1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: astore 31
      // 3e8: iload 23
      // 3ea: lload 2
      // 3eb: lconst_0
      // 3ec: lcmp
      // 3ed: ifle 4e5
      // 3f0: ifeq 4e3
      // 3f3: ldc2_w 731597284830665195
      // 3f6: lload 2
      // 3f7: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fc: iload 23
      // 3fe: lload 2
      // 3ff: lconst_0
      // 400: lcmp
      // 401: iflt 43c
      // 404: ifeq 43a
      // 407: goto 414
      // 40a: ldc2_w 1162341749306788290
      // 40d: lload 2
      // 40e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 413: athrow
      // 414: ifne 431
      // 417: goto 424
      // 41a: ldc2_w 1162341749306788290
      // 41d: lload 2
      // 41e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: athrow
      // 424: aload 31
      // 426: ldc2_w 1186141274477199125
      // 429: lload 2
      // 42a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: astore 31
      // 431: aload 31
      // 433: lload 19
      // 435: aload 27
      // 437: invokestatic com/zelix/mn.R (Ljava/lang/String;JLjava/lang/String;)Z
      // 43a: iload 23
      // 43c: ifeq 471
      // 43f: ifeq 472
      // 442: goto 44f
      // 445: ldc2_w 1162341749306788290
      // 448: lload 2
      // 449: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44e: athrow
      // 44f: aload 24
      // 451: aload 29
      // 453: iload 30
      // 455: aaload
      // 456: ldc2_w 961816781065089058
      // 459: lload 2
      // 45a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 464: goto 471
      // 467: ldc2_w 1162341749306788290
      // 46a: lload 2
      // 46b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: athrow
      // 471: pop
      // 472: iinc 30 1
      // 475: iload 23
      // 477: ifne 3d0
      // 47a: lload 2
      // 47b: lconst_0
      // 47c: lcmp
      // 47d: ifle 4d6
      // 480: iload 23
      // 482: lload 2
      // 483: lconst_0
      // 484: lcmp
      // 485: ifle 4e5
      // 488: ifne 4e3
      // 48b: aload 6
      // 48d: new java/lang/StringBuilder
      // 490: dup
      // 491: invokespecial java/lang/StringBuilder.<init> ()V
      // 494: sipush 1732
      // 497: ldc2_w 573353633208692230
      // 49a: lload 2
      // 49b: lxor
      // 49c: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a4: aload 26
      // 4a6: ldc2_w 961816781065089058
      // 4a9: lload 2
      // 4aa: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b2: sipush 24130
      // 4b5: ldc2_w 3837190465011824281
      // 4b8: lload 2
      // 4b9: lxor
      // 4ba: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c2: aload 25
      // 4c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c7: ldc "'"
      // 4c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4cf: lload 21
      // 4d1: dup2_x1
      // 4d2: pop2
      // 4d3: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 4d6: goto 4e3
      // 4d9: ldc2_w 1162341749306788290
      // 4dc: lload 2
      // 4dd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: athrow
      // 4e3: iload 23
      // 4e5: lload 2
      // 4e6: lconst_0
      // 4e7: lcmp
      // 4e8: ifle 53d
      // 4eb: ifne 53b
      // 4ee: aload 6
      // 4f0: new java/lang/StringBuilder
      // 4f3: dup
      // 4f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f7: ldc "'"
      // 4f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fc: aload 26
      // 4fe: ldc2_w 961816781065089058
      // 501: lload 2
      // 502: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 507: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50a: sipush 30929
      // 50d: ldc2_w 6278304258042892305
      // 510: lload 2
      // 511: lxor
      // 512: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 517: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51a: aload 25
      // 51c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51f: ldc "'"
      // 521: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 524: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 527: lload 21
      // 529: dup2_x1
      // 52a: pop2
      // 52b: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 52e: goto 53b
      // 531: ldc2_w 1162341749306788290
      // 534: lload 2
      // 535: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53a: athrow
      // 53b: iload 23
      // 53d: lload 2
      // 53e: lconst_0
      // 53f: lcmp
      // 540: ifle 563
      // 543: ifne 564
      // 546: new java/io/File
      // 549: dup
      // 54a: aload 25
      // 54c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 54f: astore 26
      // 551: aload 24
      // 553: aload 26
      // 555: ldc2_w 961816781065089058
      // 558: lload 2
      // 559: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 563: pop
      // 564: aload 24
      // 566: areturn
   }

   public static String V(Object[] var0) {
      long var2 = (Long)var0[0];
      File var1 = (File)var0[1];
      var2 = b ^ var2;
      long var4 = var2 ^ 98936190964484L;
      return m44.a<"i">(new Object[]{var1, var4, m44.a<"m">(-4653053604852574702L, var2)}, -6675911129771604870L, var2);
   }

   public static byte[] T(Object[] var0) {
      int var3 = (Integer)var0[0];
      InputStream var5 = (InputStream)var0[1];
      int var4 = (Integer)var0[2];
      int var2 = (Integer)var0[3];
      int var1 = (Integer)var0[4];
      long var6 = ((long)var3 << 32 | (long)var4 << 48 >>> 32 | (long)var1 << 48 >>> 48) ^ b;
      long var8 = var6 ^ 111752455799168L;
      int var10000 = m44.a<"o">(-2069654841970564225L, var6);
      B var11 = null;
      int var10 = var10000;

      label20: {
         try {
            var10000 = var2;
            if (var10 != 0) {
               break label20;
            }

            if (var2 <= 0) {
               return (byte[])var11;
            }
         } catch (IllegalArgumentException var12) {
            throw m44.a<"o">(var12, -95578848254924977L, var6);
         }

         var10000 = var2;
      }

      var11 = new byte[var10000];
      m44.a<"o">(new Object[]{var5, var11, var8}, -171776941261760825L, var6);
      return (byte[])var11;
   }

   public static BufferedReader h(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/InputStream
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/sz
      // 020: astore 2
      // 021: pop
      // 022: getstatic com/zelix/lqx.b J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: lload 4
      // 02c: dup2
      // 02d: ldc2_w 118560896952731
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 118707125677839
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 56893916331672
      // 03e: lxor
      // 03f: dup2
      // 040: bipush 32
      // 042: lushr
      // 043: l2i
      // 044: istore 10
      // 046: dup2
      // 047: bipush 32
      // 049: lshl
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 11
      // 050: dup2
      // 051: bipush 48
      // 053: lshl
      // 054: bipush 48
      // 056: lushr
      // 057: l2i
      // 058: istore 12
      // 05a: pop2
      // 05b: dup2
      // 05c: ldc2_w 89231831290479
      // 05f: lxor
      // 060: lstore 13
      // 062: pop2
      // 063: ldc2_w 1456350213429561317
      // 066: lload 4
      // 068: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: new java/io/PushbackInputStream
      // 070: dup
      // 071: aload 3
      // 072: ldc2_w 585219457037963617
      // 075: lload 4
      // 077: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: invokespecial java/io/PushbackInputStream.<init> (Ljava/io/InputStream;I)V
      // 07f: astore 16
      // 081: istore 15
      // 083: aconst_null
      // 084: astore 17
      // 086: aconst_null
      // 087: astore 18
      // 089: aload 1
      // 08a: iload 15
      // 08c: ifeq 0b2
      // 08f: ifnull 0df
      // 092: goto 0a0
      // 095: ldc2_w 1080368567659763485
      // 098: lload 4
      // 09a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0a4: goto 0b2
      // 0a7: ldc2_w 1080368567659763485
      // 0aa: lload 4
      // 0ac: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: iload 15
      // 0b4: ifeq 0dd
      // 0b7: invokevirtual java/lang/String.length ()I
      // 0ba: ifle 0df
      // 0bd: goto 0cb
      // 0c0: ldc2_w 1080368567659763485
      // 0c3: lload 4
      // 0c5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0cf: goto 0dd
      // 0d2: ldc2_w 1080368567659763485
      // 0d5: lload 4
      // 0d7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: astore 18
      // 0df: bipush 0
      // 0e0: istore 19
      // 0e2: aload 18
      // 0e4: iload 15
      // 0e6: ifeq 1c1
      // 0e9: ifnull 161
      // 0ec: goto 0fa
      // 0ef: ldc2_w 1080368567659763485
      // 0f2: lload 4
      // 0f4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 18
      // 0fc: iload 15
      // 0fe: ifeq 1c1
      // 101: goto 10f
      // 104: ldc2_w 1080368567659763485
      // 107: lload 4
      // 109: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: lload 4
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 1b3
      // 116: invokevirtual java/lang/String.length ()I
      // 119: ifeq 161
      // 11c: goto 12a
      // 11f: ldc2_w 1080368567659763485
      // 122: lload 4
      // 124: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 18
      // 12c: iload 15
      // 12e: ifeq 2c4
      // 131: goto 13f
      // 134: ldc2_w 1080368567659763485
      // 137: lload 4
      // 139: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: sipush 26184
      // 142: ldc2_w 4838403665114107994
      // 145: lload 4
      // 147: lxor
      // 148: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 150: ifeq 2c2
      // 153: goto 161
      // 156: ldc2_w 1080368567659763485
      // 159: lload 4
      // 15b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: lload 8
      // 163: aload 16
      // 165: ldc2_w 585219457037963617
      // 168: lload 4
      // 16a: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: bipush 3
      // 170: anewarray 281
      // 173: dup_x1
      // 174: swap
      // 175: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 178: bipush 2
      // 179: swap
      // 17a: aastore
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x2
      // 181: dup_x2
      // 182: pop
      // 183: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w 1534484738370157520
      // 18c: lload 4
      // 18e: invokedynamic m (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: lload 6
      // 195: dup2_x1
      // 196: pop2
      // 197: bipush 2
      // 198: anewarray 281
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w 1126286827743339328
      // 1ac: lload 4
      // 1ae: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: goto 1c1
      // 1b6: ldc2_w 1080368567659763485
      // 1b9: lload 4
      // 1bb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: astore 20
      // 1c3: aload 20
      // 1c5: iload 15
      // 1c7: lload 4
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: ifle 1e7
      // 1ce: ifeq 1e4
      // 1d1: ifnull 20f
      // 1d4: goto 1e2
      // 1d7: ldc2_w 1080368567659763485
      // 1da: lload 4
      // 1dc: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: aload 20
      // 1e4: sipush 26184
      // 1e7: ldc2_w 4838403665114107994
      // 1ea: lload 4
      // 1ec: lxor
      // 1ed: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f5: iload 15
      // 1f7: ifeq 20c
      // 1fa: ifeq 20f
      // 1fd: goto 20b
      // 200: ldc2_w 1080368567659763485
      // 203: lload 4
      // 205: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: bipush 1
      // 20c: goto 210
      // 20f: bipush 0
      // 210: istore 19
      // 212: aload 20
      // 214: iload 15
      // 216: ifeq 2c4
      // 219: ifnull 2c2
      // 21c: goto 22a
      // 21f: ldc2_w 1080368567659763485
      // 222: lload 4
      // 224: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 20
      // 22c: iload 15
      // 22e: ifeq 2c4
      // 231: goto 23f
      // 234: ldc2_w 1080368567659763485
      // 237: lload 4
      // 239: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: athrow
      // 23f: invokevirtual java/lang/String.length ()I
      // 242: ifle 2c2
      // 245: goto 253
      // 248: ldc2_w 1080368567659763485
      // 24b: lload 4
      // 24d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 18
      // 255: iload 15
      // 257: ifeq 2c0
      // 25a: goto 268
      // 25d: ldc2_w 1080368567659763485
      // 260: lload 4
      // 262: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: lload 4
      // 26a: lconst_0
      // 26b: lcmp
      // 26c: ifle 2b2
      // 26f: ifnull 2b0
      // 272: goto 280
      // 275: ldc2_w 1080368567659763485
      // 278: lload 4
      // 27a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: athrow
      // 280: aload 18
      // 282: iload 15
      // 284: lload 4
      // 286: lconst_0
      // 287: lcmp
      // 288: iflt 2cd
      // 28b: ifeq 2c4
      // 28e: goto 29c
      // 291: ldc2_w 1080368567659763485
      // 294: lload 4
      // 296: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: athrow
      // 29c: invokevirtual java/lang/String.length ()I
      // 29f: ifne 2c2
      // 2a2: goto 2b0
      // 2a5: ldc2_w 1080368567659763485
      // 2a8: lload 4
      // 2aa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: athrow
      // 2b0: aload 20
      // 2b2: goto 2c0
      // 2b5: ldc2_w 1080368567659763485
      // 2b8: lload 4
      // 2ba: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: astore 18
      // 2c2: aload 18
      // 2c4: lload 4
      // 2c6: lconst_0
      // 2c7: lcmp
      // 2c8: iflt 2e3
      // 2cb: iload 15
      // 2cd: ifeq 2e3
      // 2d0: ifnull 2fc
      // 2d3: goto 2e1
      // 2d6: ldc2_w 1080368567659763485
      // 2d9: lload 4
      // 2db: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: athrow
      // 2e1: aload 18
      // 2e3: invokevirtual java/lang/String.length ()I
      // 2e6: iload 15
      // 2e8: ifeq 313
      // 2eb: ifne 311
      // 2ee: goto 2fc
      // 2f1: ldc2_w 1080368567659763485
      // 2f4: lload 4
      // 2f6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: athrow
      // 2fc: new java/io/BufferedReader
      // 2ff: dup
      // 300: new java/io/InputStreamReader
      // 303: dup
      // 304: aload 16
      // 306: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 309: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 30c: astore 17
      // 30e: goto 36a
      // 311: iload 19
      // 313: ifeq 356
      // 316: iload 10
      // 318: aload 16
      // 31a: iload 11
      // 31c: i2c
      // 31d: bipush 3
      // 31e: iload 12
      // 320: i2s
      // 321: bipush 5
      // 322: anewarray 281
      // 325: dup_x1
      // 326: swap
      // 327: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32a: bipush 4
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x1
      // 32e: swap
      // 32f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 332: bipush 3
      // 333: swap
      // 334: aastore
      // 335: dup_x1
      // 336: swap
      // 337: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33a: bipush 2
      // 33b: swap
      // 33c: aastore
      // 33d: dup_x1
      // 33e: swap
      // 33f: bipush 1
      // 340: swap
      // 341: aastore
      // 342: dup_x1
      // 343: swap
      // 344: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 347: bipush 0
      // 348: swap
      // 349: aastore
      // 34a: ldc2_w 1480874820259091510
      // 34d: lload 4
      // 34f: invokedynamic m (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: astore 20
      // 356: new java/io/BufferedReader
      // 359: dup
      // 35a: new java/io/InputStreamReader
      // 35d: dup
      // 35e: aload 16
      // 360: aload 18
      // 362: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 365: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 368: astore 17
      // 36a: aload 2
      // 36b: iload 15
      // 36d: ifeq 382
      // 370: ifnull 389
      // 373: goto 381
      // 376: ldc2_w 1080368567659763485
      // 379: lload 4
      // 37b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: athrow
      // 381: aload 2
      // 382: lload 13
      // 384: aload 18
      // 386: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 389: aload 17
      // 38b: lload 4
      // 38d: lconst_0
      // 38e: lcmp
      // 38f: iflt 3a3
      // 392: iload 15
      // 394: ifne 3b1
      // 397: ldc "VgZBrb"
      // 399: ldc2_w 1446286768586225041
      // 39c: lload 4
      // 39e: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: goto 3b1
      // 3a6: ldc2_w 1080368567659763485
      // 3a9: lload 4
      // 3ab: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: athrow
      // 3b1: areturn
   }

   public static BufferedReader V(Object[] var0) {
      long var2 = (Long)var0[0];
      InputStream var1 = (InputStream)var0[1];
      var2 = b ^ var2;
      long var4 = var2 ^ 72743777659835L;
      return m44.a<"l">(new Object[]{var4, var1, (String)null, null}, 3530945738951055613L, var2);
   }

   public static BufferedReader z(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = b ^ var2;
      long var4 = var2 ^ 49261261707911L;
      FileInputStream var10000 = new FileInputStream(var1.trim());
      String var10001 = (String)null;
      Object var6 = null;
      String var7 = var10001;
      FileInputStream var8 = var10000;
      return m44.a<"h">(new Object[]{var4, var8, var7, var6}, -9206449915497223743L, var2);
   }

   public static boolean J(Object[] var0) {
      long var2 = (Long)var0[0];
      ZipFile var4 = (ZipFile)var0[1];
      ZipEntry var1 = (ZipEntry)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 77831234164410L;
      int var10000 = m44.a<"l">(8359871926286939196L, var2);
      InputStream var8 = null;
      int var7 = var10000;

      boolean var9;
      try {
         var8 = m44.a<"s">(var4, var1, 8563953859860976401L, var2);
         var9 = m44.a<"l">(new Object[]{var8, var5}, 8517205847701558877L, var2);
      } finally {
         try {
            label71: {
               label70: {
                  try {
                     var25 = var8;
                     if (var7 != 0) {
                        break label70;
                     }

                     if (var8 == null) {
                        break label71;
                     }
                  } catch (nn var20) {
                     throw m44.a<"l">(var20, 7633407103985774604L, var2);
                  }

                  var25 = var8;
               }

               m44.a<"s">(var25, 7869611989791427478L, var2);
            }
         } catch (nn var21) {
            throw var21;
         } catch (Exception var22) {
         }
      }

      return var9;
   }

   public static boolean R(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lqx.b J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 2615906797004437405
      // 1c: lload 2
      // 1d: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: ldc "*"
      // 27: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2a: iload 4
      // 2c: ifeq 4e
      // 2f: bipush -1
      // 30: if_icmple 51
      // 33: goto 40
      // 36: ldc2_w 4505379659942831973
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 4e
      // 44: ldc2_w 4505379659942831973
      // 47: lload 2
      // 48: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   public static String Z(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w 8842730383736957287
      // 01c: lload 1
      // 01d: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 026: astore 3
      // 027: istore 4
      // 029: aload 3
      // 02a: iload 4
      // 02c: ifeq 13d
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: bipush 1
      // 033: if_icmple 106
      // 036: goto 043
      // 039: ldc2_w 6952559328765344159
      // 03c: lload 1
      // 03d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: athrow
      // 043: aload 3
      // 044: bipush 0
      // 045: iload 4
      // 047: ifeq 12f
      // 04a: goto 057
      // 04d: ldc2_w 6952559328765344159
      // 050: lload 1
      // 051: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: lload 1
      // 058: lconst_0
      // 059: lcmp
      // 05a: iflt 125
      // 05d: invokevirtual java/lang/String.charAt (I)C
      // 060: ldc2_w 8756173028416881757
      // 063: lload 1
      // 064: invokedynamic o (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: ifeq 106
      // 06c: goto 079
      // 06f: ldc2_w 6952559328765344159
      // 072: lload 1
      // 073: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 3
      // 07a: bipush 1
      // 07b: iload 4
      // 07d: lload 1
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 138
      // 083: ifeq 12f
      // 086: goto 093
      // 089: ldc2_w 6952559328765344159
      // 08c: lload 1
      // 08d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: lload 1
      // 094: lconst_0
      // 095: lcmp
      // 096: iflt 125
      // 099: invokevirtual java/lang/String.charAt (I)C
      // 09c: sipush 13199
      // 09f: ldc2_w 8878912718598882851
      // 0a2: lload 1
      // 0a3: lxor
      // 0a4: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: if_icmpne 106
      // 0ac: goto 0b9
      // 0af: ldc2_w 6952559328765344159
      // 0b2: lload 1
      // 0b3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: ldc2_w 7273918783037247711
      // 0bc: lload 1
      // 0bd: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: sipush 30506
      // 0c5: ldc2_w 6485098184948220567
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: if_icmpne 104
      // 0d2: goto 0df
      // 0d5: ldc2_w 6952559328765344159
      // 0d8: lload 1
      // 0d9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 3
      // 0e0: sipush 16431
      // 0e3: ldc2_w 3858983804098164096
      // 0e6: lload 1
      // 0e7: lxor
      // 0e8: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: ldc2_w 7273918783037247711
      // 0f0: lload 1
      // 0f1: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f9: areturn
      // 0fa: ldc2_w 6952559328765344159
      // 0fd: lload 1
      // 0fe: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 3
      // 105: areturn
      // 106: aload 3
      // 107: sipush 3155
      // 10a: ldc2_w 1022240374243981796
      // 10d: lload 1
      // 10e: lxor
      // 10f: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: ldc2_w 7273918783037247711
      // 117: lload 1
      // 118: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 120: astore 3
      // 121: aload 3
      // 122: sipush 16431
      // 125: ldc2_w 3858983804098164096
      // 128: lload 1
      // 129: lxor
      // 12a: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: ldc2_w 7273918783037247711
      // 132: lload 1
      // 133: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 13b: astore 3
      // 13c: aload 3
      // 13d: areturn
   }

   private static String t(Object[] param0) {
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
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 1
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Long
      // 021: invokevirtual java/lang/Long.longValue ()J
      // 024: lstore 3
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast com/zelix/yv
      // 02b: astore 6
      // 02d: pop
      // 02e: getstatic com/zelix/lqx.b J
      // 031: lload 3
      // 032: lxor
      // 033: lstore 3
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 75974126036248
      // 039: lxor
      // 03a: lstore 8
      // 03c: pop2
      // 03d: ldc2_w -2491187690129043779
      // 040: lload 3
      // 041: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aconst_null
      // 047: astore 11
      // 049: istore 10
      // 04b: lload 1
      // 04c: sipush 25313
      // 04f: ldc2_w 3468788703561277807
      // 052: lload 3
      // 053: lxor
      // 054: invokedynamic b (IJ)J bsm=com/zelix/lqx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: lcmp
      // 05a: iload 10
      // 05c: ifeq 08b
      // 05f: ifle 0b2
      // 062: goto 06f
      // 065: ldc2_w -4060480705474634171
      // 068: lload 3
      // 069: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: lload 1
      // 070: sipush 9405
      // 073: ldc2_w 585531583062058802
      // 076: lload 3
      // 077: lxor
      // 078: invokedynamic b (IJ)J bsm=com/zelix/lqx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: lcmp
      // 07e: goto 08b
      // 081: ldc2_w -4060480705474634171
      // 084: lload 3
      // 085: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: ifge 0b2
      // 08e: new java/io/StringWriter
      // 091: dup
      // 092: lload 1
      // 093: l2i
      // 094: sipush 11620
      // 097: ldc2_w 8465205835153112832
      // 09a: lload 3
      // 09b: lxor
      // 09c: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: iadd
      // 0a2: invokespecial java/io/StringWriter.<init> (I)V
      // 0a5: lload 3
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: iflt 0b9
      // 0ab: astore 12
      // 0ad: iload 10
      // 0af: ifne 0bb
      // 0b2: new java/io/StringWriter
      // 0b5: dup
      // 0b6: invokespecial java/io/StringWriter.<init> ()V
      // 0b9: astore 12
      // 0bb: new java/io/BufferedReader
      // 0be: dup
      // 0bf: new java/io/InputStreamReader
      // 0c2: dup
      // 0c3: aload 7
      // 0c5: aload 5
      // 0c7: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0ca: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0cd: astore 11
      // 0cf: bipush 1
      // 0d0: istore 14
      // 0d2: aload 11
      // 0d4: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0d7: dup
      // 0d8: astore 13
      // 0da: ifnull 188
      // 0dd: iload 10
      // 0df: ifeq 1f0
      // 0e2: aload 6
      // 0e4: iload 10
      // 0e6: ifeq 108
      // 0e9: goto 0f6
      // 0ec: ldc2_w -4060480705474634171
      // 0ef: lload 3
      // 0f0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: ifnull 129
      // 0f9: goto 106
      // 0fc: ldc2_w -4060480705474634171
      // 0ff: lload 3
      // 100: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 6
      // 108: lload 8
      // 10a: aload 13
      // 10c: bipush 2
      // 10d: anewarray 281
      // 110: dup_x1
      // 111: swap
      // 112: bipush 1
      // 113: swap
      // 114: aastore
      // 115: dup_x2
      // 116: dup_x2
      // 117: pop
      // 118: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: ldc2_w -4276611176865552165
      // 121: lload 3
      // 122: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: astore 13
      // 129: iload 14
      // 12b: lload 3
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 14b
      // 131: iload 10
      // 133: ifeq 147
      // 136: ifeq 154
      // 139: goto 146
      // 13c: ldc2_w -4060480705474634171
      // 13f: lload 3
      // 140: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: bipush 0
      // 147: istore 14
      // 149: iload 10
      // 14b: lload 3
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 185
      // 151: ifne 176
      // 154: aload 12
      // 156: ldc2_w -2511568969868573135
      // 159: lload 3
      // 15a: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: ldc2_w -4193302275528397354
      // 162: lload 3
      // 163: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/StringWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: pop
      // 169: goto 176
      // 16c: ldc2_w -4060480705474634171
      // 16f: lload 3
      // 170: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 12
      // 178: aload 13
      // 17a: ldc2_w -2847993811780560107
      // 17d: lload 3
      // 17e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: iload 10
      // 185: ifne 0d2
      // 188: lload 3
      // 189: lconst_0
      // 18a: lcmp
      // 18b: iflt 0dd
      // 18e: lload 3
      // 18f: lconst_0
      // 190: lcmp
      // 191: iflt 1b6
      // 194: aload 11
      // 196: iload 10
      // 198: ifeq 1ad
      // 19b: ifnull 1f0
      // 19e: goto 1ab
      // 1a1: ldc2_w -4060480705474634171
      // 1a4: lload 3
      // 1a5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 11
      // 1ad: ldc2_w -4410270177832209783
      // 1b0: lload 3
      // 1b1: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: goto 1f0
      // 1b9: astore 13
      // 1bb: goto 1f0
      // 1be: astore 15
      // 1c0: lload 3
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: iflt 1e8
      // 1c6: aload 11
      // 1c8: iload 10
      // 1ca: ifeq 1df
      // 1cd: ifnull 1ed
      // 1d0: goto 1dd
      // 1d3: ldc2_w -4060480705474634171
      // 1d6: lload 3
      // 1d7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 11
      // 1df: ldc2_w -4410270177832209783
      // 1e2: lload 3
      // 1e3: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: goto 1ed
      // 1eb: astore 16
      // 1ed: aload 15
      // 1ef: athrow
      // 1f0: aload 12
      // 1f2: ldc2_w -2451808137788808015
      // 1f5: lload 3
      // 1f6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: areturn
   }

   public static void H(Object[] var0) {
      long var3 = (Long)var0[0];
      String var2 = (String)var0[1];
      String var1 = (String)var0[2];
      var3 = b ^ var3;
      long var5 = var3 ^ 132652405085043L;
      m44.a<"k">(new Object[]{var2, var5, var1, (Integer)null, (Integer)null}, 2424286251677058894L, var3);
   }

   public static int w(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/io/InputStream
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast [B
      // 0e: astore 4
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 2
      // 1a: pop
      // 1b: getstatic com/zelix/lqx.b J
      // 1e: lload 2
      // 1f: lxor
      // 20: lstore 2
      // 21: ldc2_w 7785913454309534773
      // 24: lload 2
      // 25: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: bipush 0
      // 2b: istore 6
      // 2d: istore 5
      // 2f: aload 1
      // 30: aload 4
      // 32: iload 6
      // 34: aload 4
      // 36: arraylength
      // 37: iload 6
      // 39: isub
      // 3a: ldc2_w 7758469185338185433
      // 3d: lload 2
      // 3e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: istore 7
      // 45: iload 7
      // 47: bipush -1
      // 48: if_icmpeq 57
      // 4b: iload 6
      // 4d: iload 7
      // 4f: iadd
      // 50: istore 6
      // 52: iload 5
      // 54: ifeq 7c
      // 57: iload 6
      // 59: iload 5
      // 5b: ifne 9e
      // 5e: ifne 97
      // 61: goto 6e
      // 64: ldc2_w 8207365436310415365
      // 67: lload 2
      // 68: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush -1
      // 6f: istore 6
      // 71: iload 5
      // 73: lload 2
      // 74: lconst_0
      // 75: lcmp
      // 76: ifle 99
      // 79: ifeq 97
      // 7c: iload 6
      // 7e: aload 4
      // 80: arraylength
      // 81: if_icmplt 2f
      // 84: lload 2
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle 52
      // 8a: goto 97
      // 8d: ldc2_w 8207365436310415365
      // 90: lload 2
      // 91: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: iload 6
      // 99: iload 5
      // 9b: ifne 50
      // 9e: lload 2
      // 9f: lconst_0
      // a0: lcmp
      // a1: ifle 59
      // a4: ireturn
   }

   public static List h(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = b ^ var1;
      return m44.a<"k">(-3631280078566338408L, var1);
   }

   private static boolean H(Object[] param0) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 112231952548345
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 32
      // 022: lushr
      // 023: l2i
      // 024: istore 4
      // 026: dup2
      // 027: bipush 32
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 5
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 6
      // 03a: pop2
      // 03b: pop2
      // 03c: ldc2_w 3203216817686948940
      // 03f: lload 1
      // 040: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: istore 7
      // 047: aload 3
      // 048: ldc2_w 3644204729756504986
      // 04b: lload 1
      // 04c: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: iload 7
      // 053: ifne 199
      // 056: bipush 4
      // 057: if_icmplt 198
      // 05a: goto 067
      // 05d: ldc2_w 3575691877386397820
      // 060: lload 1
      // 061: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: iload 4
      // 069: aload 3
      // 06a: iload 5
      // 06c: i2c
      // 06d: bipush 4
      // 06e: iload 6
      // 070: i2s
      // 071: bipush 5
      // 072: anewarray 281
      // 075: dup_x1
      // 076: swap
      // 077: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07a: bipush 4
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x1
      // 07e: swap
      // 07f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 082: bipush 3
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08a: bipush 2
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w 3164986415358094167
      // 09d: lload 1
      // 09e: invokedynamic l (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: astore 8
      // 0a5: aload 8
      // 0a7: bipush 0
      // 0a8: baload
      // 0a9: sipush 18260
      // 0ac: ldc2_w 9001662726485500698
      // 0af: lload 1
      // 0b0: lxor
      // 0b1: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: iand
      // 0b7: iload 7
      // 0b9: lload 1
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0cf
      // 0bf: ifne 197
      // 0c2: sipush 11857
      // 0c5: ldc2_w 1833917996803295747
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: if_icmpne 196
      // 0d2: goto 0df
      // 0d5: ldc2_w 3575691877386397820
      // 0d8: lload 1
      // 0d9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 8
      // 0e1: bipush 1
      // 0e2: baload
      // 0e3: sipush 22908
      // 0e6: ldc2_w 7354320434924616996
      // 0e9: lload 1
      // 0ea: lxor
      // 0eb: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iand
      // 0f1: iload 7
      // 0f3: ifne 197
      // 0f6: goto 103
      // 0f9: ldc2_w 3575691877386397820
      // 0fc: lload 1
      // 0fd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: sipush 6803
      // 106: ldc2_w 8141123932360752837
      // 109: lload 1
      // 10a: lxor
      // 10b: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: if_icmpne 196
      // 113: goto 120
      // 116: ldc2_w 3575691877386397820
      // 119: lload 1
      // 11a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 8
      // 122: bipush 2
      // 123: baload
      // 124: sipush 22908
      // 127: ldc2_w 7354320434924616996
      // 12a: lload 1
      // 12b: lxor
      // 12c: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: iand
      // 132: iload 7
      // 134: ifne 197
      // 137: goto 144
      // 13a: ldc2_w 3575691877386397820
      // 13d: lload 1
      // 13e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: bipush 3
      // 145: if_icmpne 196
      // 148: goto 155
      // 14b: ldc2_w 3575691877386397820
      // 14e: lload 1
      // 14f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 8
      // 157: bipush 3
      // 158: baload
      // 159: sipush 22908
      // 15c: ldc2_w 7354320434924616996
      // 15f: lload 1
      // 160: lxor
      // 161: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: iand
      // 167: iload 7
      // 169: ifne 197
      // 16c: goto 179
      // 16f: ldc2_w 3575691877386397820
      // 172: lload 1
      // 173: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: bipush 4
      // 17a: if_icmpne 196
      // 17d: goto 18a
      // 180: ldc2_w 3575691877386397820
      // 183: lload 1
      // 184: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: bipush 1
      // 18b: ireturn
      // 18c: ldc2_w 3575691877386397820
      // 18f: lload 1
      // 190: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: bipush 0
      // 197: ireturn
      // 198: bipush 0
      // 199: ireturn
   }

   public static String O(ZipFile var0, long var1, ZipEntry var3) {
      var1 = b ^ var1;
      return m44.a<"q">(var0, 8879855835469730360L, var1) + "!" + var3.getName();
   }

   public static BufferedReader b(Object[] var0) {
      long var2 = (Long)var0[0];
      File var1 = (File)var0[1];
      var2 = b ^ var2;
      long var4 = var2 ^ 71089457971378L;
      FileInputStream var10000 = new FileInputStream(var1);
      String var10001 = (String)null;
      Object var6 = null;
      String var7 = var10001;
      FileInputStream var8 = var10000;
      return m44.a<"m">(new Object[]{var4, var8, var7, var6}, 1876157155791238132L, var2);
   }

   public static String N(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 6278649605311289114
      // 01c: lload 2
      // 01d: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 1
      // 025: invokevirtual java/lang/String.length ()I
      // 028: bipush 1
      // 029: iload 4
      // 02b: ifne 0e8
      // 02e: if_icmple 0da
      // 031: goto 03e
      // 034: ldc2_w 5388920775940887338
      // 037: lload 2
      // 038: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: athrow
      // 03e: aload 1
      // 03f: aload 1
      // 040: invokevirtual java/lang/String.length ()I
      // 043: bipush 1
      // 044: isub
      // 045: invokevirtual java/lang/String.charAt (I)C
      // 048: istore 5
      // 04a: iload 5
      // 04c: ldc2_w 5293025368686382619
      // 04f: lload 2
      // 050: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: bipush 0
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: iload 4
      // 05b: lload 2
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: ifle 08b
      // 061: ifne 089
      // 064: if_icmpeq 0ce
      // 067: goto 074
      // 06a: ldc2_w 5388920775940887338
      // 06d: lload 2
      // 06e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: iload 5
      // 076: ldc "/"
      // 078: bipush 0
      // 079: invokevirtual java/lang/String.charAt (I)C
      // 07c: goto 089
      // 07f: ldc2_w 5388920775940887338
      // 082: lload 2
      // 083: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: iload 4
      // 08b: lload 2
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 0bb
      // 091: ifne 0b9
      // 094: if_icmpeq 0ce
      // 097: goto 0a4
      // 09a: ldc2_w 5388920775940887338
      // 09d: lload 2
      // 09e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 5
      // 0a6: ldc "\\"
      // 0a8: bipush 0
      // 0a9: invokevirtual java/lang/String.charAt (I)C
      // 0ac: goto 0b9
      // 0af: ldc2_w 5388920775940887338
      // 0b2: lload 2
      // 0b3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: iload 4
      // 0bb: ifne 103
      // 0be: if_icmpne 0da
      // 0c1: goto 0ce
      // 0c4: ldc2_w 5388920775940887338
      // 0c7: lload 2
      // 0c8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: bipush 0
      // 0d0: aload 1
      // 0d1: invokevirtual java/lang/String.length ()I
      // 0d4: bipush 1
      // 0d5: isub
      // 0d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d9: astore 1
      // 0da: aload 1
      // 0db: ldc2_w 5293025368686382619
      // 0de: lload 2
      // 0df: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 0e7: dup
      // 0e8: istore 5
      // 0ea: iload 4
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 0f6
      // 0f2: ifne 15f
      // 0f5: bipush -1
      // 0f6: goto 103
      // 0f9: ldc2_w 5388920775940887338
      // 0fc: lload 2
      // 0fd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: if_icmpgt 150
      // 106: aload 1
      // 107: ldc "/"
      // 109: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 10c: dup
      // 10d: istore 5
      // 10f: iload 4
      // 111: lload 2
      // 112: lconst_0
      // 113: lcmp
      // 114: iflt 161
      // 117: ifne 15f
      // 11a: bipush -1
      // 11b: if_icmpgt 150
      // 11e: goto 12b
      // 121: ldc2_w 5388920775940887338
      // 124: lload 2
      // 125: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 1
      // 12c: ldc "\\"
      // 12e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 131: dup
      // 132: istore 5
      // 134: iload 4
      // 136: lload 2
      // 137: lconst_0
      // 138: lcmp
      // 139: ifle 140
      // 13c: ifne 1d5
      // 13f: bipush -1
      // 140: if_icmple 1bf
      // 143: goto 150
      // 146: ldc2_w 5388920775940887338
      // 149: lload 2
      // 14a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: iload 5
      // 152: goto 15f
      // 155: ldc2_w 5388920775940887338
      // 158: lload 2
      // 159: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: iload 4
      // 161: lload 2
      // 162: lconst_0
      // 163: lcmp
      // 164: ifle 19e
      // 167: ifne 19d
      // 16a: ifne 1b7
      // 16d: goto 17a
      // 170: ldc2_w 5388920775940887338
      // 173: lload 2
      // 174: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 1
      // 17b: iload 4
      // 17d: ifne 1b6
      // 180: goto 18d
      // 183: ldc2_w 5388920775940887338
      // 186: lload 2
      // 187: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: invokevirtual java/lang/String.length ()I
      // 190: goto 19d
      // 193: ldc2_w 5388920775940887338
      // 196: lload 2
      // 197: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: bipush 1
      // 19e: if_icmpne 1ad
      // 1a1: aconst_null
      // 1a2: areturn
      // 1a3: ldc2_w 5388920775940887338
      // 1a6: lload 2
      // 1a7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 1
      // 1ae: bipush 0
      // 1af: iload 5
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1b6: areturn
      // 1b7: aload 1
      // 1b8: bipush 0
      // 1b9: iload 5
      // 1bb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1be: areturn
      // 1bf: aload 1
      // 1c0: iload 4
      // 1c2: ifne 1da
      // 1c5: invokevirtual java/lang/String.length ()I
      // 1c8: goto 1d5
      // 1cb: ldc2_w 5388920775940887338
      // 1ce: lload 2
      // 1cf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: ifle 1db
      // 1d8: ldc ""
      // 1da: areturn
      // 1db: aconst_null
      // 1dc: areturn
   }

   public static boolean Y(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lqx.b J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -7892792138734890417
      // 1c: lload 2
      // 1d: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: ldc2_w -8284617515839517855
      // 27: lload 2
      // 28: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: iload 4
      // 2f: ifne 5f
      // 32: ifne 4e
      // 35: goto 42
      // 38: ldc2_w -8098493343821851009
      // 3b: lload 2
      // 3c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: ldc2_w -8098493343821851009
      // 47: lload 2
      // 48: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 1
      // 4f: sipush 12077
      // 52: ldc2_w 2456161978914911588
      // 55: lload 2
      // 56: lxor
      // 57: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 5f: istore 5
      // 61: iload 5
      // 63: iload 4
      // 65: lload 2
      // 66: lconst_0
      // 67: lcmp
      // 68: iflt 6f
      // 6b: ifne f5
      // 6e: bipush -1
      // 6f: if_icmple f4
      // 72: goto 7f
      // 75: ldc2_w -8098493343821851009
      // 78: lload 2
      // 79: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: aload 1
      // 80: iload 5
      // 82: aload 1
      // 83: invokevirtual java/lang/String.length ()I
      // 86: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 89: astore 6
      // 8b: aload 6
      // 8d: sipush 20754
      // 90: ldc2_w 4051987689579914822
      // 93: lload 2
      // 94: lxor
      // 95: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: ldc2_w -8550384443288607158
      // 9d: lload 2
      // 9e: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: iload 4
      // a5: ifne f3
      // a8: ifne f2
      // ab: goto b8
      // ae: ldc2_w -8098493343821851009
      // b1: lload 2
      // b2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: aload 6
      // ba: sipush 6384
      // bd: ldc2_w 5469945937099222969
      // c0: lload 2
      // c1: lxor
      // c2: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: ldc2_w -8550384443288607158
      // ca: lload 2
      // cb: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: iload 4
      // d2: ifne f5
      // d5: goto e2
      // d8: ldc2_w -8098493343821851009
      // db: lload 2
      // dc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: athrow
      // e2: ifeq f4
      // e5: goto f2
      // e8: ldc2_w -8098493343821851009
      // eb: lload 2
      // ec: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: athrow
      // f2: bipush 1
      // f3: ireturn
      // f4: bipush 0
      // f5: ireturn
   }

   private static void b(Object[] param0) {
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
      // 004: checkcast java/io/File
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/List
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 1
      // 022: pop
      // 023: getstatic com/zelix/lqx.b J
      // 026: lload 1
      // 027: lxor
      // 028: lstore 1
      // 029: lload 1
      // 02a: dup2
      // 02b: ldc2_w 106967868559050
      // 02e: lxor
      // 02f: lstore 6
      // 031: dup2
      // 032: ldc2_w 24755655838434
      // 035: lxor
      // 036: lstore 8
      // 038: pop2
      // 039: ldc2_w -2863923532119844743
      // 03c: lload 1
      // 03d: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: aload 5
      // 044: ldc2_w -4563984706922889955
      // 047: lload 1
      // 048: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: astore 11
      // 04f: istore 10
      // 051: aload 11
      // 053: astore 12
      // 055: aload 12
      // 057: arraylength
      // 058: istore 13
      // 05a: bipush 0
      // 05b: istore 14
      // 05d: iload 14
      // 05f: iload 13
      // 061: if_icmpge 15f
      // 064: aload 12
      // 066: iload 14
      // 068: aaload
      // 069: astore 15
      // 06b: aload 15
      // 06d: iload 10
      // 06f: ifne 0de
      // 072: ldc2_w -4210486505144512789
      // 075: lload 1
      // 076: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: ifeq 0cf
      // 07e: goto 08b
      // 081: ldc2_w -4203484833625056183
      // 084: lload 1
      // 085: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 15
      // 08d: aload 3
      // 08e: aload 4
      // 090: lload 6
      // 092: bipush 4
      // 093: anewarray 281
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 3
      // 09d: swap
      // 09e: aastore
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 2
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 1
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 0
      // 0ac: swap
      // 0ad: aastore
      // 0ae: ldc2_w -4483482570863945717
      // 0b1: lload 1
      // 0b2: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: iload 10
      // 0b9: lload 1
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 15c
      // 0bf: ifeq 157
      // 0c2: goto 0cf
      // 0c5: ldc2_w -4203484833625056183
      // 0c8: lload 1
      // 0c9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 15
      // 0d1: goto 0de
      // 0d4: ldc2_w -4203484833625056183
      // 0d7: lload 1
      // 0d8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ldc2_w -2314419663623376071
      // 0e1: lload 1
      // 0e2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: astore 16
      // 0e9: ldc2_w -2329371855771136928
      // 0ec: lload 1
      // 0ed: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: iload 10
      // 0f4: lload 1
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 124
      // 0fa: ifne 122
      // 0fd: ifne 11a
      // 100: goto 10d
      // 103: ldc2_w -4203484833625056183
      // 106: lload 1
      // 107: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: aload 16
      // 10f: ldc2_w -4180103183002719586
      // 112: lload 1
      // 113: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: astore 16
      // 11a: aload 16
      // 11c: lload 8
      // 11e: aload 3
      // 11f: invokestatic com/zelix/mn.R (Ljava/lang/String;JLjava/lang/String;)Z
      // 122: iload 10
      // 124: ifne 156
      // 127: ifeq 157
      // 12a: goto 137
      // 12d: ldc2_w -4203484833625056183
      // 130: lload 1
      // 131: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: aload 4
      // 139: aload 15
      // 13b: ldc2_w -2823123385462807127
      // 13e: lload 1
      // 13f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 149: goto 156
      // 14c: ldc2_w -4203484833625056183
      // 14f: lload 1
      // 150: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: pop
      // 157: iinc 14 1
      // 15a: iload 10
      // 15c: ifeq 05d
      // 15f: return
   }

   public static byte[] g(Object[] var0) {
      long var1 = (Long)var0[0];
      PushbackInputStream var4 = (PushbackInputStream)var0[1];
      int var3 = (Integer)var0[2];
      var1 = b ^ var1;
      long var5 = var1 ^ 68081284845591L;
      int var7 = m44.a<"h">(3661500898989814504L, var1);

      try {
         byte[] var8 = new byte[var3];
         int var9 = m44.a<"h">(new Object[]{var4, var8, var5}, 3173596828362835792L, var1);

         label24: {
            try {
               if (var7 != 0) {
                  return var8;
               }

               if (var9 != -1) {
                  break label24;
               }
            } catch (IOException var10) {
               throw m44.a<"h">(var10, 3403375254873814744L, var1);
            }

            var9 = 0;
         }

         m44.a<"w">(var4, var8, 0, var9, 3009930862977106519L, var1);
         return var8;
      } catch (IOException var11) {
         return null;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File N(Object[] var0) {
      long var1 = (Long)var0[0];
      String var5 = (String)var0[1];
      File var4 = (File)var0[2];
      sz var3 = (sz)var0[3];
      var1 = b ^ var1;
      long var6 = var1 ^ 110767516627238L;
      int var10000 = m44.a<"l">(8096483176029876324L, var1);
      PrintWriter var9 = null;
      int var8 = var10000;
      boolean var17 = false /* VF: Semaphore variable */;

      label109: {
         Object var11;
         try {
            var17 = true;
            var9 = new PrintWriter(new BufferedWriter(new FileWriter(var4)));
            var9.println(var5);
            m44.a<"s">(var9, 8295958087590494156L, var1);
            var17 = false;
            break label109;
         } catch (IOException var20) {
            var3.Z(var6, m44.a<"s">(var20, 7542075771076544570L, var1));
            var11 = null;
            var17 = false;
         } finally {
            if (var17) {
               label78: {
                  label77: {
                     try {
                        var26 = var9;
                        if (var8 != 0) {
                           break label77;
                        }

                        if (var9 == null) {
                           break label78;
                        }
                     } catch (IOException var18) {
                        throw m44.a<"l">(var18, 7905797450650874964L, var1);
                     }

                     var26 = var9;
                  }

                  m44.a<"s">(var26, 8429033317471176334L, var1);
               }
            }
         }

         label87: {
            try {
               var27 = var9;
               if (var8 != 0) {
                  break label87;
               }

               if (var9 == null) {
                  return (File)var11;
               }
            } catch (IOException var19) {
               throw m44.a<"l">(var19, 7905797450650874964L, var1);
            }

            var27 = var9;
         }

         m44.a<"s">(var27, 8429033317471176334L, var1);
         return (File)var11;
      }

      PrintWriter var28 = var9;
      if (var8 == 0) {
         if (var9 == null) {
            return var4;
         }

         var28 = var9;
      }

      m44.a<"s">(var28, 8429033317471176334L, var1);
      return var4;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File H(Object[] var0) {
      long var2 = (Long)var0[0];
      BufferedInputStream var1 = (BufferedInputStream)var0[1];
      String var4 = (String)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 71264932356046L;
      File var8 = m44.a<"i">(new Object[]{var5, var4}, 251849383490654357L, var2);
      int var10000 = m44.a<"i">(2117125047096282801L, var2);
      BufferedOutputStream var9 = null;
      int var7 = var10000;
      boolean var25 = false /* VF: Semaphore variable */;

      try {
         var25 = true;
         var9 = new BufferedOutputStream(new FileOutputStream(var8));
         int var10 = m44.a<"v">(var1, 2095166235630013243L, var2);
         byte[] var11 = new byte[b<"k">(28587, 519813247800868301L ^ var2)];
         int var12 = 0;
         int var13 = 0;

         label169:
         while (true) {
            if ((var12 = m44.a<"v">(var1, var11, 372295540891356287L, var2)) != -1) {
               var13 += var12;

               try {
                  m44.a<"v">(var9, var11, 0, var12, 545711642007640593L, var2);
               } catch (IOException var33) {
                  boolean var46 = false;
                  throw m44.a<"i">(var33, 552334933168922185L, var2);
               }

               do {
                  try {
                     var10000 = var7;
                     if (var2 > 0L) {
                        if (var7 == 0) {
                           var25 = false;
                           return var8;
                        }

                        var10000 = var7;
                     }

                     if (var10000 != 0) {
                        continue label169;
                     }
                  } catch (IOException var32) {
                     boolean var47 = false;
                     throw m44.a<"i">(var32, 552334933168922185L, var2);
                  }
               } while (var2 <= 0L);

               var25 = false;
               break;
            }

            var25 = false;
            break;
         }
      } finally {
         if (var25) {
            label130: {
               label129: {
                  try {
                     if (var2 <= 0L) {
                        break label130;
                     }

                     var41 = var9;
                     if (var7 == 0) {
                        break label129;
                     }

                     if (var9 == null) {
                        break label130;
                     }
                  } catch (IOException var28) {
                     throw m44.a<"i">(var28, 552334933168922185L, var2);
                  }

                  try {
                     var41 = var9;
                  } catch (IOException var27) {
                     boolean var10001 = false;
                     break label130;
                  }
               }

               try {
                  m44.a<"v">(var41, 465917990325954004L, var2);
               } catch (IOException var26) {
                  boolean var45 = false;
               }
            }
         }
      }

      label146: {
         try {
            if (var2 < 0L) {
               return var8;
            }

            var44 = var9;
            if (var7 == 0) {
               break label146;
            }

            if (var9 == null) {
               return var8;
            }
         } catch (IOException var31) {
            throw m44.a<"i">(var31, 552334933168922185L, var2);
         }

         try {
            var44 = var9;
         } catch (IOException var30) {
            boolean var48 = false;
            return var8;
         }
      }

      try {
         m44.a<"v">(var44, 465917990325954004L, var2);
      } catch (IOException var29) {
         boolean var49 = false;
      }

      return var8;
   }

   public static BufferedReader Q(Object[] var0) {
      File var1 = (File)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 41968897054474L;
      FileInputStream var10000 = new FileInputStream(var1);
      Object var7 = null;
      FileInputStream var9 = var10000;
      return m44.a<"m">(new Object[]{var5, var9, var4, var7}, -8236779762460203956L, var2);
   }

   public static String P(Object[] var0) {
      long var1 = (Long)var0[0];
      byte[] var3 = (byte[])var0[1];
      var1 = b ^ var1;
      long var4 = var1 ^ 139595901452924L;
      lb6 var10001 = new lb6();
      lb6 var6;
      lb6 var7 = var6 = new lb6();
      lb6 var8 = var10001;
      return m44.a<"l">(new Object[]{var3, var4, var8, var7, var6}, 7851759739304660155L, var1);
   }

   public static boolean q(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lqx.b J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 6422415823965968665
      // 1c: lload 2
      // 1d: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: ldc2_w 6625855359471100647
      // 27: lload 2
      // 28: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: iload 4
      // 2f: ifne 5f
      // 32: ifne 4e
      // 35: goto 42
      // 38: ldc2_w 4956903266844859689
      // 3b: lload 2
      // 3c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: ldc2_w 4956903266844859689
      // 47: lload 2
      // 48: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 1
      // 4f: sipush 26591
      // 52: ldc2_w 8583766216475817681
      // 55: lload 2
      // 56: lxor
      // 57: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 5f: istore 5
      // 61: iload 5
      // 63: iload 4
      // 65: lload 2
      // 66: lconst_0
      // 67: lcmp
      // 68: iflt 6f
      // 6b: ifne c5
      // 6e: bipush -1
      // 6f: if_icmple c4
      // 72: goto 7f
      // 75: ldc2_w 4956903266844859689
      // 78: lload 2
      // 79: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: aload 1
      // 80: iload 5
      // 82: aload 1
      // 83: invokevirtual java/lang/String.length ()I
      // 86: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 89: astore 6
      // 8b: aload 6
      // 8d: sipush 32144
      // 90: ldc2_w 4053081057605829025
      // 93: lload 2
      // 94: lxor
      // 95: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: ldc2_w 4756017615193861404
      // 9d: lload 2
      // 9e: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: iload 4
      // a5: ifne c5
      // a8: ifeq c4
      // ab: goto b8
      // ae: ldc2_w 4956903266844859689
      // b1: lload 2
      // b2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: bipush 1
      // b9: ireturn
      // ba: ldc2_w 4956903266844859689
      // bd: lload 2
      // be: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: bipush 0
      // c5: ireturn
   }

   public static String X(Object[] var0) {
      File var4 = (File)var0[0];
      long var2 = (Long)var0[1];
      String var1 = (String)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 122467855693080L;
      FileInputStream var7 = new FileInputStream(var4);
      long var10002 = (long)(m44.a<"p">(var7, -37734889424970127L, var2) + b<"k">(11620, 8465216920987845842L ^ var2));
      Object[] var10006 = new Object[]{null, null, null, var5, null};
      var10006[2] = var10002;
      var10006[1] = var1;
      var10006[0] = var7;
      return m44.a<"o">(var10006, -2155708562135263687L, var2);
   }

   public static String J(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/io/File
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/lqx.b J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: ldc2_w -7304266905037366630
      // 024: lload 1
      // 025: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: istore 5
      // 02c: aload 3
      // 02d: ifnonnull 03c
      // 030: aconst_null
      // 031: areturn
      // 032: ldc2_w -8698294095035031894
      // 035: lload 1
      // 036: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: aload 4
      // 03e: iload 5
      // 040: ifne 083
      // 043: ifnonnull 074
      // 046: goto 053
      // 049: ldc2_w -8698294095035031894
      // 04c: lload 1
      // 04d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: ldc2_w -7032237502431642306
      // 056: lload 1
      // 057: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: astore 6
      // 05e: ldc2_w -8728640740909657077
      // 061: lload 1
      // 062: invokedynamic n (JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 4
      // 069: lload 1
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: iflt 093
      // 06f: iload 5
      // 071: ifeq 08e
      // 074: aload 4
      // 076: goto 083
      // 079: ldc2_w -8698294095035031894
      // 07c: lload 1
      // 07d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: ldc2_w -7336069713406826678
      // 086: lload 1
      // 087: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: astore 6
      // 08e: aload 3
      // 08f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 092: astore 3
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: astore 7
      // 09c: aload 3
      // 09d: new java/lang/StringBuilder
      // 0a0: dup
      // 0a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a4: sipush 20639
      // 0a7: ldc2_w 1282200481288630056
      // 0aa: lload 1
      // 0ab: lxor
      // 0ac: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: ldc2_w -7242551165366193159
      // 0b7: lload 1
      // 0b8: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0c6: lload 1
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: ifle 23e
      // 0cc: iload 5
      // 0ce: ifne 23e
      // 0d1: ifeq 200
      // 0d4: goto 0e1
      // 0d7: ldc2_w -8698294095035031894
      // 0da: lload 1
      // 0db: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: ldc2_w -7180420332606644827
      // 0e6: lload 1
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: astore 8
      // 0ee: iload 5
      // 0f0: lload 1
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: ifle 122
      // 0f6: ifne 120
      // 0f9: aload 8
      // 0fb: ifnonnull 12b
      // 0fe: goto 10b
      // 101: ldc2_w -8698294095035031894
      // 104: lload 1
      // 105: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 7
      // 10d: aload 6
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: goto 120
      // 116: ldc2_w -8698294095035031894
      // 119: lload 1
      // 11a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: iload 5
      // 122: lload 1
      // 123: lconst_0
      // 124: lcmp
      // 125: ifle 14d
      // 128: ifeq 149
      // 12b: aload 7
      // 12d: aload 8
      // 12f: ldc2_w -7336069713406826678
      // 132: lload 1
      // 133: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: goto 149
      // 13f: ldc2_w -8698294095035031894
      // 142: lload 1
      // 143: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 3
      // 14a: invokevirtual java/lang/String.length ()I
      // 14d: bipush 2
      // 14e: lload 1
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifle 1a3
      // 154: iload 5
      // 156: ifne 1a3
      // 159: if_icmple 1f5
      // 15c: goto 169
      // 15f: ldc2_w -8698294095035031894
      // 162: lload 1
      // 163: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 7
      // 16b: iload 5
      // 16d: ifne 1f4
      // 170: goto 17d
      // 173: ldc2_w -8698294095035031894
      // 176: lload 1
      // 177: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 7
      // 17f: invokevirtual java/lang/StringBuilder.length ()I
      // 182: bipush 1
      // 183: isub
      // 184: ldc2_w -9055052559145029648
      // 187: lload 1
      // 188: invokedynamic u (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: ldc2_w -7242551165366193159
      // 190: lload 1
      // 191: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: goto 1a3
      // 199: ldc2_w -8698294095035031894
      // 19c: lload 1
      // 19d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: lload 1
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 1ba
      // 1a9: if_icmpne 1ea
      // 1ac: aload 3
      // 1ad: bipush 2
      // 1ae: invokevirtual java/lang/String.charAt (I)C
      // 1b1: ldc2_w -7242551165366193159
      // 1b4: lload 1
      // 1b5: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: if_icmpne 1ea
      // 1bd: goto 1ca
      // 1c0: ldc2_w -8698294095035031894
      // 1c3: lload 1
      // 1c4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 7
      // 1cc: aload 7
      // 1ce: invokevirtual java/lang/StringBuilder.length ()I
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: ldc2_w -7416947095275505219
      // 1d6: lload 1
      // 1d7: invokedynamic u (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: pop
      // 1dd: goto 1ea
      // 1e0: ldc2_w -8698294095035031894
      // 1e3: lload 1
      // 1e4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 7
      // 1ec: aload 3
      // 1ed: bipush 2
      // 1ee: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f4: pop
      // 1f5: lload 1
      // 1f6: lconst_0
      // 1f7: lcmp
      // 1f8: iflt 200
      // 1fb: iload 5
      // 1fd: ifeq 31c
      // 200: aload 3
      // 201: iload 5
      // 203: ifne 31b
      // 206: goto 213
      // 209: ldc2_w -8698294095035031894
      // 20c: lload 1
      // 20d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: new java/lang/StringBuilder
      // 216: dup
      // 217: invokespecial java/lang/StringBuilder.<init> ()V
      // 21a: ldc "."
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: ldc2_w -7242551165366193159
      // 222: lload 1
      // 223: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 22b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 231: goto 23e
      // 234: ldc2_w -8698294095035031894
      // 237: lload 1
      // 238: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: ifeq 30d
      // 241: aload 7
      // 243: aload 6
      // 245: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 248: pop
      // 249: aload 3
      // 24a: iload 5
      // 24c: ifne 321
      // 24f: goto 25c
      // 252: ldc2_w -8698294095035031894
      // 255: lload 1
      // 256: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: invokevirtual java/lang/String.length ()I
      // 25f: bipush 1
      // 260: if_icmple 31c
      // 263: goto 270
      // 266: ldc2_w -8698294095035031894
      // 269: lload 1
      // 26a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: aload 7
      // 272: lload 1
      // 273: lconst_0
      // 274: lcmp
      // 275: iflt 301
      // 278: iload 5
      // 27a: ifne 301
      // 27d: goto 28a
      // 280: ldc2_w -8698294095035031894
      // 283: lload 1
      // 284: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: athrow
      // 28a: lload 1
      // 28b: lconst_0
      // 28c: lcmp
      // 28d: ifle 2f9
      // 290: aload 7
      // 292: invokevirtual java/lang/StringBuilder.length ()I
      // 295: bipush 1
      // 296: isub
      // 297: ldc2_w -9055052559145029648
      // 29a: lload 1
      // 29b: invokedynamic u (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: ldc2_w -7242551165366193159
      // 2a3: lload 1
      // 2a4: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: if_icmpne 2f7
      // 2ac: goto 2b9
      // 2af: ldc2_w -8698294095035031894
      // 2b2: lload 1
      // 2b3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: aload 3
      // 2ba: bipush 1
      // 2bb: invokevirtual java/lang/String.charAt (I)C
      // 2be: ldc2_w -7242551165366193159
      // 2c1: lload 1
      // 2c2: invokedynamic n (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: if_icmpne 2f7
      // 2ca: goto 2d7
      // 2cd: ldc2_w -8698294095035031894
      // 2d0: lload 1
      // 2d1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: aload 7
      // 2d9: aload 7
      // 2db: invokevirtual java/lang/StringBuilder.length ()I
      // 2de: bipush 1
      // 2df: isub
      // 2e0: ldc2_w -7416947095275505219
      // 2e3: lload 1
      // 2e4: invokedynamic u (Ljava/lang/Object;IJJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: pop
      // 2ea: goto 2f7
      // 2ed: ldc2_w -8698294095035031894
      // 2f0: lload 1
      // 2f1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: athrow
      // 2f7: aload 7
      // 2f9: aload 3
      // 2fa: bipush 1
      // 2fb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 301: lload 1
      // 302: lconst_0
      // 303: lcmp
      // 304: iflt 31e
      // 307: pop
      // 308: iload 5
      // 30a: ifeq 31c
      // 30d: aload 3
      // 30e: goto 31b
      // 311: ldc2_w -8698294095035031894
      // 314: lload 1
      // 315: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: areturn
      // 31c: aload 7
      // 31e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 321: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File T(Object[] var0) {
      long var2 = (Long)var0[0];
      File var1 = (File)var0[1];
      var2 = b ^ var2;
      long var4 = var2 ^ 67682302219886L;
      int var10000 = m44.a<"m">(208679738613203677L, var2);
      BufferedInputStream var7 = null;
      int var6 = var10000;
      boolean var19 = false /* VF: Semaphore variable */;

      File var8;
      try {
         var19 = true;
         var7 = new BufferedInputStream(new FileInputStream(var1));
         var8 = m44.a<"m">(new Object[]{var4, var7, m44.a<"r">(var1, 177449736870428429L, var2)}, 287734382316211792L, var2);
         var19 = false;
      } finally {
         if (var19) {
            label89: {
               label88: {
                  try {
                     if (var2 < 0L) {
                        break label89;
                     }

                     var30 = var7;
                     if (var6 != 0) {
                        break label88;
                     }

                     if (var7 == null) {
                        break label89;
                     }
                  } catch (IOException var22) {
                     throw m44.a<"m">(var22, 2237749660976973549L, var2);
                  }

                  try {
                     var30 = var7;
                  } catch (IOException var21) {
                     boolean var10001 = false;
                     break label89;
                  }
               }

               try {
                  m44.a<"r">(var30, 359520572162532903L, var2);
               } catch (IOException var20) {
                  boolean var32 = false;
               }
            }
         }
      }

      label105: {
         try {
            var31 = var7;
            if (var6 != 0) {
               break label105;
            }

            if (var7 == null) {
               return var8;
            }
         } catch (IOException var26) {
            throw m44.a<"m">(var26, 2237749660976973549L, var2);
         }

         try {
            var31 = var7;
         } catch (IOException var25) {
            boolean var33 = false;
            return var8;
         }
      }

      try {
         m44.a<"r">(var31, 359520572162532903L, var2);
      } catch (IOException var24) {
         boolean var34 = false;
      }

      return var8;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static File l(Object[] var0) {
      ZipFile var4 = (ZipFile)var0[0];
      ZipEntry var1 = (ZipEntry)var0[1];
      long var2 = (Long)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 41786166224476L;
      int var10000 = m44.a<"o">(-948154427950206225L, var2);
      BufferedInputStream var8 = null;
      int var7 = var10000;
      boolean var20 = false /* VF: Semaphore variable */;

      File var9;
      try {
         var20 = true;
         var8 = new BufferedInputStream(m44.a<"p">(var4, var1, -1150099048089332286L, var2));
         var9 = m44.a<"o">(new Object[]{var5, var8, m44.a<"p">(var4, -760288814387700623L, var2) + "!" + var1.getName()}, -879284486904005022L, var2);
         var20 = false;
      } finally {
         if (var20) {
            label89: {
               label88: {
                  try {
                     if (var2 < 0L) {
                        break label89;
                     }

                     var31 = var8;
                     if (var7 != 0) {
                        break label88;
                     }

                     if (var8 == null) {
                        break label89;
                     }
                  } catch (IOException var23) {
                     throw m44.a<"o">(var23, -1208074131044272417L, var2);
                  }

                  try {
                     var31 = var8;
                  } catch (IOException var22) {
                     boolean var10001 = false;
                     break label89;
                  }
               }

               try {
                  m44.a<"p">(var31, -806322996905142763L, var2);
               } catch (IOException var21) {
                  boolean var33 = false;
               }
            }
         }
      }

      label105: {
         try {
            var32 = var8;
            if (var7 != 0) {
               break label105;
            }

            if (var8 == null) {
               return var9;
            }
         } catch (IOException var27) {
            throw m44.a<"o">(var27, -1208074131044272417L, var2);
         }

         try {
            var32 = var8;
         } catch (IOException var26) {
            boolean var34 = false;
            return var9;
         }
      }

      try {
         m44.a<"p">(var32, -806322996905142763L, var2);
      } catch (IOException var25) {
         boolean var35 = false;
      }

      return var9;
   }

   public static String r(Object[] var0) {
      long var3 = (Long)var0[0];
      ZipFile var1 = (ZipFile)var0[1];
      ZipEntry var5 = (ZipEntry)var0[2];
      String var2 = (String)var0[3];
      var3 = b ^ var3;
      long var6 = var3 ^ 51166901135342L;
      InputStream var8 = m44.a<"v">(var1, var5, 8193174136201696380L, var3);
      long var10002 = m44.a<"v">(var5, 7927191976268727565L, var3);
      Object[] var10006 = new Object[]{null, null, null, var6, null};
      var10006[2] = var10002;
      var10006[1] = var2;
      var10006[0] = var8;
      return m44.a<"i">(var10006, 8134384455748371663L, var3);
   }

   public static String A(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/sz
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/sz
      // 17: astore 3
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 1
      // 22: pop
      // 23: getstatic com/zelix/lqx.b J
      // 26: lload 1
      // 27: lxor
      // 28: lstore 1
      // 29: lload 1
      // 2a: dup2
      // 2b: ldc2_w 43699589414737
      // 2e: lxor
      // 2f: lstore 6
      // 31: pop2
      // 32: ldc2_w -5112843053680088357
      // 35: lload 1
      // 36: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: istore 8
      // 3d: aload 5
      // 3f: ldc2_w -6882173654990117102
      // 42: lload 1
      // 43: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 4b: dup
      // 4c: istore 9
      // 4e: bipush -1
      // 4f: iload 8
      // 51: ifeq 81
      // 54: if_icmpgt a4
      // 57: goto 64
      // 5a: ldc2_w -6647229600919176669
      // 5d: lload 1
      // 5e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 5
      // 66: iload 8
      // 68: ifeq de
      // 6b: goto 78
      // 6e: ldc2_w -6647229600919176669
      // 71: lload 1
      // 72: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: ldc "\\"
      // 7a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 7d: dup
      // 7e: istore 9
      // 80: bipush -1
      // 81: if_icmpgt a4
      // 84: aload 5
      // 86: iload 8
      // 88: ifeq f2
      // 8b: goto 98
      // 8e: ldc2_w -6647229600919176669
      // 91: lload 1
      // 92: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: ldc "/"
      // 9a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 9d: dup
      // 9e: istore 9
      // a0: bipush -1
      // a1: if_icmple df
      // a4: aload 4
      // a6: aload 5
      // a8: bipush 0
      // a9: iload 9
      // ab: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // ae: lload 6
      // b0: dup2_x1
      // b1: pop2
      // b2: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // b5: aload 3
      // b6: aload 5
      // b8: iload 9
      // ba: bipush 1
      // bb: iadd
      // bc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // bf: lload 6
      // c1: dup2_x1
      // c2: pop2
      // c3: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // c6: aload 5
      // c8: iload 9
      // ca: iload 9
      // cc: bipush 1
      // cd: iadd
      // ce: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // d1: goto de
      // d4: ldc2_w -6647229600919176669
      // d7: lload 1
      // d8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: athrow
      // de: areturn
      // df: aload 4
      // e1: lload 6
      // e3: ldc ""
      // e5: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // e8: aload 3
      // e9: lload 6
      // eb: aload 5
      // ed: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // f0: ldc ""
      // f2: areturn
   }

   public static String y(Object[] param0) {
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
      // 004: checkcast java/util/zip/ZipFile
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/zip/ZipEntry
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic com/zelix/lqx.b J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 22638124888662
      // 025: lxor
      // 026: lstore 5
      // 028: pop2
      // 029: new java/lang/StringBuilder
      // 02c: dup
      // 02d: invokespecial java/lang/StringBuilder.<init> ()V
      // 030: astore 8
      // 032: aload 8
      // 034: aload 1
      // 035: ldc2_w -6255787966649892819
      // 038: lload 3
      // 039: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: pop
      // 042: ldc2_w -5869480906706899277
      // 045: lload 3
      // 046: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: new java/io/File
      // 04e: dup
      // 04f: aload 1
      // 050: ldc2_w -6255787966649892819
      // 053: lload 3
      // 054: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05c: astore 9
      // 05e: istore 7
      // 060: iload 7
      // 062: ifne 11d
      // 065: aload 9
      // 067: lload 5
      // 069: bipush 2
      // 06a: anewarray 281
      // 06d: dup_x2
      // 06e: dup_x2
      // 06f: pop
      // 070: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073: bipush 1
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: ldc2_w -5510584099461414086
      // 07e: lload 3
      // 07f: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: ifeq 10b
      // 087: goto 094
      // 08a: ldc2_w -5521379751147066749
      // 08d: lload 3
      // 08e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 9
      // 096: ldc2_w -5901854391682116765
      // 099: lload 3
      // 09a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: bipush 1
      // 0a0: anewarray 281
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: bipush 0
      // 0a6: swap
      // 0a7: aastore
      // 0a8: ldc2_w -5962316569394909628
      // 0ab: lload 3
      // 0ac: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: astore 10
      // 0b3: aload 10
      // 0b5: lload 3
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 122
      // 0bb: iload 7
      // 0bd: ifne 122
      // 0c0: ifnull 10b
      // 0c3: goto 0d0
      // 0c6: ldc2_w -5521379751147066749
      // 0c9: lload 3
      // 0ca: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 8
      // 0d2: sipush 17226
      // 0d5: ldc2_w 6559996932317963744
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e2: pop
      // 0e3: aload 8
      // 0e5: aload 10
      // 0e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ea: pop
      // 0eb: aload 8
      // 0ed: sipush 7072
      // 0f0: ldc2_w 4031699246241103119
      // 0f3: lload 3
      // 0f4: lxor
      // 0f5: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: goto 10b
      // 101: ldc2_w -5521379751147066749
      // 104: lload 3
      // 105: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 8
      // 10d: ldc "!"
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: aload 8
      // 115: aload 2
      // 116: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: pop
      // 11d: aload 8
      // 11f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 122: lload 3
      // 123: lconst_0
      // 124: lcmp
      // 125: ifle 142
      // 128: ldc2_w -5786504892114954613
      // 12b: lload 3
      // 12c: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ifnonnull 14f
      // 134: iinc 7 1
      // 137: iload 7
      // 139: ldc2_w -5899437719933665168
      // 13c: lload 3
      // 13d: invokedynamic k (IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: goto 14f
      // 145: ldc2_w -5521379751147066749
      // 148: lload 3
      // 149: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: areturn
   }

   public static boolean F(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w 7091210716869616209
      // 01c: lload 1
      // 01d: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: invokevirtual java/lang/String.length ()I
      // 026: istore 5
      // 028: istore 4
      // 02a: iload 5
      // 02c: iload 4
      // 02e: ifne 282
      // 031: bipush 4
      // 032: if_icmple 281
      // 035: goto 042
      // 038: ldc2_w 9188045807421548129
      // 03b: lload 1
      // 03c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: aload 3
      // 043: iload 5
      // 045: bipush 4
      // 046: isub
      // 047: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 04a: astore 6
      // 04c: aload 6
      // 04e: sipush 1068
      // 051: ldc2_w 4736056795000472424
      // 054: lload 1
      // 055: lxor
      // 056: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: ldc2_w 8739463139508311636
      // 05e: lload 1
      // 05f: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: iload 4
      // 066: ifne 216
      // 069: ifne 215
      // 06c: goto 079
      // 06f: ldc2_w 9188045807421548129
      // 072: lload 1
      // 073: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 6
      // 07b: sipush 9737
      // 07e: ldc2_w 7846426669615260020
      // 081: lload 1
      // 082: lxor
      // 083: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: ldc2_w 8739463139508311636
      // 08b: lload 1
      // 08c: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: iload 4
      // 093: ifne 216
      // 096: goto 0a3
      // 099: ldc2_w 9188045807421548129
      // 09c: lload 1
      // 09d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: ifne 215
      // 0a6: goto 0b3
      // 0a9: ldc2_w 9188045807421548129
      // 0ac: lload 1
      // 0ad: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 6
      // 0b5: sipush 24945
      // 0b8: ldc2_w 8447201917667960378
      // 0bb: lload 1
      // 0bc: lxor
      // 0bd: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: ldc2_w 8739463139508311636
      // 0c5: lload 1
      // 0c6: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: iload 4
      // 0cd: ifne 216
      // 0d0: goto 0dd
      // 0d3: ldc2_w 9188045807421548129
      // 0d6: lload 1
      // 0d7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: ifne 215
      // 0e0: goto 0ed
      // 0e3: ldc2_w 9188045807421548129
      // 0e6: lload 1
      // 0e7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 6
      // 0ef: sipush 12132
      // 0f2: ldc2_w 1328639297219438635
      // 0f5: lload 1
      // 0f6: lxor
      // 0f7: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: ldc2_w 8739463139508311636
      // 0ff: lload 1
      // 100: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: iload 4
      // 107: ifne 216
      // 10a: goto 117
      // 10d: ldc2_w 9188045807421548129
      // 110: lload 1
      // 111: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: ifne 215
      // 11a: goto 127
      // 11d: ldc2_w 9188045807421548129
      // 120: lload 1
      // 121: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 6
      // 129: sipush 24686
      // 12c: ldc2_w 4154102587925129008
      // 12f: lload 1
      // 130: lxor
      // 131: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: ldc2_w 8739463139508311636
      // 139: lload 1
      // 13a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: iload 4
      // 141: ifne 216
      // 144: goto 151
      // 147: ldc2_w 9188045807421548129
      // 14a: lload 1
      // 14b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: ifne 215
      // 154: goto 161
      // 157: ldc2_w 9188045807421548129
      // 15a: lload 1
      // 15b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: aload 6
      // 163: sipush 10743
      // 166: ldc2_w 3620993151266893484
      // 169: lload 1
      // 16a: lxor
      // 16b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: ldc2_w 8739463139508311636
      // 173: lload 1
      // 174: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: iload 4
      // 17b: ifne 216
      // 17e: goto 18b
      // 181: ldc2_w 9188045807421548129
      // 184: lload 1
      // 185: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: ifne 215
      // 18e: goto 19b
      // 191: ldc2_w 9188045807421548129
      // 194: lload 1
      // 195: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: aload 6
      // 19d: sipush 23494
      // 1a0: ldc2_w 1644183278865472685
      // 1a3: lload 1
      // 1a4: lxor
      // 1a5: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ldc2_w 8739463139508311636
      // 1ad: lload 1
      // 1ae: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: iload 4
      // 1b5: ifne 216
      // 1b8: goto 1c5
      // 1bb: ldc2_w 9188045807421548129
      // 1be: lload 1
      // 1bf: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: ifne 215
      // 1c8: goto 1d5
      // 1cb: ldc2_w 9188045807421548129
      // 1ce: lload 1
      // 1cf: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 6
      // 1d7: sipush 6694
      // 1da: ldc2_w 5818921988072217929
      // 1dd: lload 1
      // 1de: lxor
      // 1df: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: ldc2_w 8739463139508311636
      // 1e7: lload 1
      // 1e8: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: iload 4
      // 1ef: lload 1
      // 1f0: lconst_0
      // 1f1: lcmp
      // 1f2: iflt 21b
      // 1f5: ifne 219
      // 1f8: goto 205
      // 1fb: ldc2_w 9188045807421548129
      // 1fe: lload 1
      // 1ff: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: ifeq 217
      // 208: goto 215
      // 20b: ldc2_w 9188045807421548129
      // 20e: lload 1
      // 20f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: bipush 1
      // 216: ireturn
      // 217: iload 5
      // 219: iload 4
      // 21b: lload 1
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: iflt 225
      // 221: ifne 282
      // 224: bipush 5
      // 225: if_icmple 281
      // 228: goto 235
      // 22b: ldc2_w 9188045807421548129
      // 22e: lload 1
      // 22f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: aload 3
      // 236: iload 5
      // 238: bipush 5
      // 239: isub
      // 23a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 23d: sipush 4127
      // 240: ldc2_w 3360418208847107941
      // 243: lload 1
      // 244: lxor
      // 245: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: ldc2_w 8739463139508311636
      // 24d: lload 1
      // 24e: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: iload 4
      // 255: ifne 282
      // 258: goto 265
      // 25b: ldc2_w 9188045807421548129
      // 25e: lload 1
      // 25f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: ifeq 281
      // 268: goto 275
      // 26b: ldc2_w 9188045807421548129
      // 26e: lload 1
      // 26f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: athrow
      // 275: bipush 1
      // 276: ireturn
      // 277: ldc2_w 9188045807421548129
      // 27a: lload 1
      // 27b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: bipush 0
      // 282: ireturn
   }

   public static File u(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      sz var4 = (sz)var0[2];
      var1 = b ^ var1;
      long var5 = var1 ^ 68668534549016L;
      long var7 = var1 ^ 34067039283250L;
      long var9 = var1 ^ 65435239060980L;

      try {
         return m44.a<"n">(new Object[]{var5, var3, m44.a<"n">(new Object[]{var7}, 5984065297515245748L, var1), var4}, 6162772325355096227L, var1);
      } catch (IOException var12) {
         var4.Z(var9, m44.a<"q">(var12, 5510306740019408104L, var1));
         return null;
      }
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 6093571050786677493
      // 003: ldc2_w 9105314479358642005
      // 006: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 009: invokevirtual java/lang/invoke/MethodHandles$Lookup.lookupClass ()Ljava/lang/Class;
      // 00c: invokestatic com/zelix/prr.a (JJLjava/lang/Object;)Lcom/zelix/fpp;
      // 00f: ldc2_w 113181565085658
      // 012: invokeinterface com/zelix/fpp.a (J)J 3
      // 017: putstatic com/zelix/lqx.b J
      // 01a: getstatic com/zelix/lqx.b J
      // 01d: ldc2_w 17070196675196
      // 020: lxor
      // 021: lstore 31
      // 023: new java/util/HashMap
      // 026: dup
      // 027: bipush 13
      // 029: invokespecial java/util/HashMap.<init> (I)V
      // 02c: putstatic com/zelix/lqx.e Ljava/util/Map;
      // 02f: ldc "DES/CBC/PKCS5Padding"
      // 031: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 034: dup
      // 035: astore 22
      // 037: bipush 2
      // 038: ldc "DES"
      // 03a: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 03d: bipush 8
      // 03f: newarray 8
      // 041: dup
      // 042: bipush 0
      // 043: lload 31
      // 045: bipush 56
      // 047: lushr
      // 048: l2i
      // 049: i2b
      // 04a: bastore
      // 04b: bipush 1
      // 04c: istore 23
      // 04e: iload 23
      // 050: bipush 8
      // 052: if_icmpge 06c
      // 055: dup
      // 056: iload 23
      // 058: lload 31
      // 05a: iload 23
      // 05c: bipush 8
      // 05e: imul
      // 05f: lshl
      // 060: bipush 56
      // 062: lushr
      // 063: l2i
      // 064: i2b
      // 065: bastore
      // 066: iinc 23 1
      // 069: goto 04e
      // 06c: new javax/crypto/spec/DESKeySpec
      // 06f: dup_x1
      // 070: swap
      // 071: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 074: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 077: new javax/crypto/spec/IvParameterSpec
      // 07a: dup
      // 07b: bipush 8
      // 07d: newarray 8
      // 07f: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 082: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 085: bipush 56
      // 087: anewarray 21
      // 08a: astore 29
      // 08c: bipush 0
      // 08d: istore 27
      // 08f: ldc "\u0017Õ\u0010\u008fÒÐâôLÓyO½\u009d\u0094Y\u0010\r\rí Âa\u0011Ç~K/\nAþ·í(,,Ïn\u008bTöó+B\u0088Ú¨tÚÎ4rÔàklJ=à{Ïé?ÕþÝä\u000bû\u0005ÒG\u0084¢ ã\u0093\u0092¶b%xôe\u008f\u0011\u0097ÖB}[\u0012\u0018\u0094Ë\u0018ën;ãG-ügha>H\u0011µ>8B\u00adÃ÷#ºKä2@G@-Ö²\u0016i\u000b³\u000fµB<\u000bW'½rñèü\u009e\u0090È&\u009d)pä±í\u000e\u0089\u0007á%(tc×gLsÒü{ñå[x\u009b2ëÊá+vÕ\u0010Q\u0014q\u000bøðÏ$éBµsv\u0007Í<\u0010ÇÄøõ\u0093±\t\u009dÜ[\u008b£\n\u0083}«\u0010ûÐQÀ\u0006JDêoHp\u0000dµ;$\u0010x\u0091,m\u00963%\rEOWòV\u0090\u0097.\u0010F\b\u001fÌ\u0080j)\u0099\u0014ø£\u001c±%\u0015f@¥©f\u0091ÞÉZ1\u008e¯ùµD\u0000\u0017(½\u0019oyN÷.@\u0095\u0006ü\u0099b8îi¼+:ê\naÄ×æµ|²\u0001Þ\u001d\u008bX\u0096\u0090\u0000\u000fÿ\u000eÝ\u0083ZNÌ|>¼k ¬>\u0013=e6ámøI\u0097Ë+§\u0080\u0095\u000ePÊy\u001e\u0094@³ r\u0003Û¿úRuXV±~ÕX!}\u009c\u0083\\:\u001e±Û\nþØeå\u009aa\u001ckå4¡LÂy^Â?úDOp¹ÞÅ<@¥M5]È¢K=\u0005¯NP\u0000éK¬7f@¸ê}\u0006\u001c¶ì\u00956\u0080Ä£÷\u0002£Á&}\n\u000fQ5«F;¿\u0011\u008d\u00187Lt²\u0094uÊ\u0015\u008a5M\u0004µ\u0019Ö\u0000ç,ø\u00ad\u0014ë'_\u0010W\u009c2\u0003ñ\u00036\u009dÝ%\u0019\u001eTïp\u008c\u0010\u0015\u001bQ\u009d}×ÓiZê\u0080ú#\u008c\fN\u0010«\u008b\u008a\u0016aV\u0093ä±\u0080FãU%\u008e\u0096\u0010G\u0080\u008aLs\u0012§ñ\\ï\u0005¶ir2\u0094\u0010\u001d>àxgà\u0092¹\u0084\u0082eÝÑm§µ\u0010ýÝÍ\u0091\u0090éðîú5k8\u008bhPá\u0010¹}\u0080\u001f\u0004^\u0085\u001aË\f£R§\u0005»n\u0010ýÈÃìîßÒ\u0092\u0089Òì²\u0095\u008c¾l(Qq°øl\u001d\u0080\bïùÓ©9\u0081Y\u001dK\u009f!^tÈBvL)`©í\u0091\u0085\u0018Ù«×\u008aêÕà\u0003HL]D/Æîç^ûÞ\u001dÃ¥ÇÙº!´EÅÃ¨«;\u001bG\u009f½±Òí\f´\u0000ÓB\u0081+\u008c\u0006²??\u0005\u009a¬D½å#\u0087Ñ\u009f\u0081\u0011'ùû\u0017C[#[éväA2ü\u009b\u0095ã\u0010b¼P\f8ÌBtÀ\u0010s=j©¨\u0088\u0010v\u0087m©¯{Ð[ÑÀ(©t'u+\u0010ò\u00817 ¢\u0012¥36\u001f\u0011C öó\u001b\u0010èJW\u0098\u0016\"|ãÞ\u0087s:\u0097\u008cÂ\u0011\u00104\u0007Ú\u001fI\u008d\u008eß\u0092E\u0000\u0081\u0011o\u001dM\u0010\u0016\u001c&a\u0006ÕnøòA±\u001d³\u001e2±\u0010n$\u001f½ \u0001Ç\u0015CÞ\u008eS¶vgi\u0018\u0081§.×P#fiçF¾ßÒÍ|¦¦>\u008a\u0000FÔ:G\u0010\u0098v ¢½º\u0002]\u001f\u009f+ëëõ\u0015Þ\u0010_ùÑÝ½\u00061\u0014fÊ\u009e\u001ah\u0010ê¥(%>Zãs\u001d[±\u009e·ÌRíÉ[ÝÑà\u001c¶;\u0002:ð\u0011\u000b\u0080\"\u001fê°»ÊðD]\u001d\u0089\u009e\u000fP\u0015)ÍÕ\u008a¹\u008evÍ\u0091uáS^\u0015\u0014sª\u0019%Ô¨Þ\u000f\u0001ê<\u008eÊ\u009eÊ\u009du@YæDG\u008dCÏÓ\u009b)°|\u0012ë;\fpõQõqkBåfFé¨Áï÷\u00adÚÊ1îgÔ4\u0092\u001a\u001eÌÞà\u008d\u0010;ó<\u0094\u0016\u0094T aÎ\u00110¢\u0087\u00ad\u0001\u0010O\u009cïÛXßÅ-`Ã¢\u000b¸ëÖ\n \u000f\u0095\u001e(\u009anÛÂ^JµcFV\u001aßhOÝ\u0003í%)W³\u0089«idÈ\u001fÎ\u0010eC;\\\u0080\u0084\u0019@\u009d*³¯Ý},u(¨?2x\u0091(èäL\u0097ÜÝ®\u0099s1\u009fÈC<\u0014\u0013\u001dÍ\u0017\u0090þ¥¯¿\u0010\u0017ÐÂ²\u0014\u0095-ß\nPïHþ\u008f¿ui©n\u0082\"L\u001eàÕìÚ\u0017o\u0098_\u007fU¶}6~(p±ª¾6=\u000bÆ\u0087 Bx®\u009a2tÂ×\u009dÝ»Wîñ+^Ü\u008eôoÏ\u000f\u0006Ê\u00051,ÌÙµ\u0017ØÛÅé\\g\u0097û\u0081þÐ\u00105ðû\u0003ûàíÚm\u0096\u001b\u009bæ\u0080êß8ÀGÑ\u007f\tù\u008a\u001c\u00866Â\u008d+\u00122o1\u0012ï0\u0096\u0019:¡£\nÉ0\u001be\u0019TÈm9\u0016\u0010\u001dÈ  \r\u008aR\u001ay\u0004¿$i½u:\u0089T\u008f\u0010¼ûbþuò[¶\u001e\u0099ÿy´à\u0085.\u0010üU\u00196ª>\u0087ö¯úè¼Øÿ±\u009f ïx\u009e.p\u0006\u0013\u0017ÖpLÎH°\u007f\tÄ\u0004¯ÿõtk2ß)D ¸\\ª \u0010\u0017\u0004\u0081à)4üK}¸Ô¥VÛÏ\u0017\u0010A~Ñ\u000b.\u0087D2\u0083%\u0010\u0081\u0098>Ia\u0010úL\u0019±\u009d\bÏúaÃ`\u0090J\u0085áT\u0010ð:\u008d\u0018ì{µ?³7\u0099ð\u0001öþÎ ¨ÚSù\u00adsç¸\u0092h\n\nîèxa\u008c\u000f¶³\u009dÇÒÓ)Ê\u0004§ äµO(>è\u0015?GïHCTÖc½\u00825ÁG¹È6\n+æ½\u009c\u008dp¯\u009c\u0091ú;\u0010 \\JdÈ[ýþ\u0010$*ÙùùS\u008d\u0011Kõ\u0099\u00857®\u0010g"
      // 091: dup
      // 092: astore 26
      // 094: invokevirtual java/lang/String.length ()I
      // 097: istore 28
      // 099: bipush 16
      // 09b: istore 25
      // 09d: bipush -1
      // 09e: istore 24
      // 0a0: iinc 24 1
      // 0a3: aload 26
      // 0a5: iload 24
      // 0a7: dup
      // 0a8: iload 25
      // 0aa: iadd
      // 0ab: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ae: bipush -1
      // 0af: goto 12b
      // 0b2: aload 29
      // 0b4: swap
      // 0b5: iload 27
      // 0b7: iinc 27 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: iload 24
      // 0be: iload 25
      // 0c0: iadd
      // 0c1: dup
      // 0c2: istore 24
      // 0c4: iload 28
      // 0c6: if_icmpge 0d5
      // 0c9: aload 26
      // 0cb: iload 24
      // 0cd: invokevirtual java/lang/String.charAt (I)C
      // 0d0: istore 25
      // 0d2: goto 0a0
      // 0d5: ldc "\u0010\u0093\u001d\u001eÔ²\u009eoù\u0092Ï+P\u0010\u0004\t\u0010\u008cöûnÐÝ\u0012\bë0¢Ü\u0012æ\"Ü"
      // 0d7: dup
      // 0d8: astore 26
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: istore 28
      // 0df: bipush 16
      // 0e1: istore 25
      // 0e3: bipush -1
      // 0e4: istore 24
      // 0e6: iinc 24 1
      // 0e9: aload 26
      // 0eb: iload 24
      // 0ed: dup
      // 0ee: iload 25
      // 0f0: iadd
      // 0f1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0f4: bipush 0
      // 0f5: goto 12b
      // 0f8: aload 29
      // 0fa: swap
      // 0fb: iload 27
      // 0fd: iinc 27 1
      // 100: swap
      // 101: aastore
      // 102: iload 24
      // 104: iload 25
      // 106: iadd
      // 107: dup
      // 108: istore 24
      // 10a: iload 28
      // 10c: if_icmpge 11b
      // 10f: aload 26
      // 111: iload 24
      // 113: invokevirtual java/lang/String.charAt (I)C
      // 116: istore 25
      // 118: goto 0e6
      // 11b: aload 29
      // 11d: putstatic com/zelix/lqx.c [Ljava/lang/String;
      // 120: bipush 56
      // 122: anewarray 21
      // 125: putstatic com/zelix/lqx.d [Ljava/lang/String;
      // 128: goto 154
      // 12b: swap
      // 12c: ldc "ISO-8859-1"
      // 12e: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 131: aload 22
      // 133: swap
      // 134: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 137: astore 30
      // 139: aload 30
      // 13b: invokestatic com/zelix/lqx.a ([B)Ljava/lang/String;
      // 13e: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 141: swap
      // 142: tableswitch -144 0 0 -74
      // 154: new java/util/HashMap
      // 157: dup
      // 158: bipush 13
      // 15a: invokespecial java/util/HashMap.<init> (I)V
      // 15d: putstatic com/zelix/lqx.i Ljava/util/Map;
      // 160: ldc "DES/CBC/NoPadding"
      // 162: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 165: dup
      // 166: astore 11
      // 168: bipush 2
      // 169: ldc "DES"
      // 16b: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 16e: bipush 8
      // 170: newarray 8
      // 172: dup
      // 173: bipush 0
      // 174: lload 31
      // 176: bipush 56
      // 178: lushr
      // 179: l2i
      // 17a: i2b
      // 17b: bastore
      // 17c: bipush 1
      // 17d: istore 12
      // 17f: iload 12
      // 181: bipush 8
      // 183: if_icmpge 19d
      // 186: dup
      // 187: iload 12
      // 189: lload 31
      // 18b: iload 12
      // 18d: bipush 8
      // 18f: imul
      // 190: lshl
      // 191: bipush 56
      // 193: lushr
      // 194: l2i
      // 195: i2b
      // 196: bastore
      // 197: iinc 12 1
      // 19a: goto 17f
      // 19d: new javax/crypto/spec/DESKeySpec
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 1a5: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 1a8: new javax/crypto/spec/IvParameterSpec
      // 1ab: dup
      // 1ac: bipush 8
      // 1ae: newarray 8
      // 1b0: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 1b3: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 1b6: bipush 24
      // 1b8: newarray 11
      // 1ba: astore 17
      // 1bc: bipush 0
      // 1bd: istore 14
      // 1bf: ldc "½K\u0094èì®ÊûÑ\u0012GÙ©¿\u009eÍÆ\u0086g\u0098æ[k¤V\riT\u0091\b@þ\\3F¶¥¤ü,g\u0014\u0086PõÔTPönY\t1âîáÙù lZ|\u001d\u0093]h\u0001\u0012`«5Ö\u0014\u0005\u001f¢Ë\u0087î\u001b\u008f¾J©?BÍ¨\u008cÇH¿\u0005;:\u0091\u0015\u000f^\u0012H¨\fz\u0019EÕBïâÿ#Þ\u0097RóHÒ²$\u0010Lj÷\u0001\u0005®\u0015åÍ¹Íà2\u008f²^E\u0017\\.\u001dÍrÑ`\u009d\u0010=\u0096¸l¨oÃVi\u0087á\u00945g\u000bz<Ý\u0015dÌß\u0092H5 \f\u0098"
      // 1c1: dup
      // 1c2: astore 15
      // 1c4: invokevirtual java/lang/String.length ()I
      // 1c7: istore 16
      // 1c9: bipush 0
      // 1ca: istore 13
      // 1cc: aload 15
      // 1ce: iload 13
      // 1d0: iinc 13 8
      // 1d3: iload 13
      // 1d5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d8: ldc "ISO-8859-1"
      // 1da: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 1dd: astore 18
      // 1df: aload 17
      // 1e1: iload 14
      // 1e3: iinc 14 1
      // 1e6: aload 18
      // 1e8: bipush 0
      // 1e9: baload
      // 1ea: i2l
      // 1eb: ldc2_w 255
      // 1ee: land
      // 1ef: bipush 56
      // 1f1: lshl
      // 1f2: aload 18
      // 1f4: bipush 1
      // 1f5: baload
      // 1f6: i2l
      // 1f7: ldc2_w 255
      // 1fa: land
      // 1fb: bipush 48
      // 1fd: lshl
      // 1fe: lor
      // 1ff: aload 18
      // 201: bipush 2
      // 202: baload
      // 203: i2l
      // 204: ldc2_w 255
      // 207: land
      // 208: bipush 40
      // 20a: lshl
      // 20b: lor
      // 20c: aload 18
      // 20e: bipush 3
      // 20f: baload
      // 210: i2l
      // 211: ldc2_w 255
      // 214: land
      // 215: bipush 32
      // 217: lshl
      // 218: lor
      // 219: aload 18
      // 21b: bipush 4
      // 21c: baload
      // 21d: i2l
      // 21e: ldc2_w 255
      // 221: land
      // 222: bipush 24
      // 224: lshl
      // 225: lor
      // 226: aload 18
      // 228: bipush 5
      // 229: baload
      // 22a: i2l
      // 22b: ldc2_w 255
      // 22e: land
      // 22f: bipush 16
      // 231: lshl
      // 232: lor
      // 233: aload 18
      // 235: bipush 6
      // 237: baload
      // 238: i2l
      // 239: ldc2_w 255
      // 23c: land
      // 23d: bipush 8
      // 23f: lshl
      // 240: lor
      // 241: aload 18
      // 243: bipush 7
      // 245: baload
      // 246: i2l
      // 247: ldc2_w 255
      // 24a: land
      // 24b: lor
      // 24c: bipush -1
      // 24d: goto 301
      // 250: lastore
      // 251: iload 13
      // 253: iload 16
      // 255: if_icmplt 1cc
      // 258: ldc "Êã\u008c$ú\u0097Ùb\u008f\u0087ã¢%O¢l"
      // 25a: dup
      // 25b: astore 15
      // 25d: invokevirtual java/lang/String.length ()I
      // 260: istore 16
      // 262: bipush 0
      // 263: istore 13
      // 265: aload 15
      // 267: iload 13
      // 269: iinc 13 8
      // 26c: iload 13
      // 26e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 271: ldc "ISO-8859-1"
      // 273: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 276: astore 18
      // 278: aload 17
      // 27a: iload 14
      // 27c: iinc 14 1
      // 27f: aload 18
      // 281: bipush 0
      // 282: baload
      // 283: i2l
      // 284: ldc2_w 255
      // 287: land
      // 288: bipush 56
      // 28a: lshl
      // 28b: aload 18
      // 28d: bipush 1
      // 28e: baload
      // 28f: i2l
      // 290: ldc2_w 255
      // 293: land
      // 294: bipush 48
      // 296: lshl
      // 297: lor
      // 298: aload 18
      // 29a: bipush 2
      // 29b: baload
      // 29c: i2l
      // 29d: ldc2_w 255
      // 2a0: land
      // 2a1: bipush 40
      // 2a3: lshl
      // 2a4: lor
      // 2a5: aload 18
      // 2a7: bipush 3
      // 2a8: baload
      // 2a9: i2l
      // 2aa: ldc2_w 255
      // 2ad: land
      // 2ae: bipush 32
      // 2b0: lshl
      // 2b1: lor
      // 2b2: aload 18
      // 2b4: bipush 4
      // 2b5: baload
      // 2b6: i2l
      // 2b7: ldc2_w 255
      // 2ba: land
      // 2bb: bipush 24
      // 2bd: lshl
      // 2be: lor
      // 2bf: aload 18
      // 2c1: bipush 5
      // 2c2: baload
      // 2c3: i2l
      // 2c4: ldc2_w 255
      // 2c7: land
      // 2c8: bipush 16
      // 2ca: lshl
      // 2cb: lor
      // 2cc: aload 18
      // 2ce: bipush 6
      // 2d0: baload
      // 2d1: i2l
      // 2d2: ldc2_w 255
      // 2d5: land
      // 2d6: bipush 8
      // 2d8: lshl
      // 2d9: lor
      // 2da: aload 18
      // 2dc: bipush 7
      // 2de: baload
      // 2df: i2l
      // 2e0: ldc2_w 255
      // 2e3: land
      // 2e4: lor
      // 2e5: bipush 0
      // 2e6: goto 301
      // 2e9: lastore
      // 2ea: iload 13
      // 2ec: iload 16
      // 2ee: if_icmplt 265
      // 2f1: aload 17
      // 2f3: putstatic com/zelix/lqx.f [J
      // 2f6: bipush 24
      // 2f8: anewarray 596
      // 2fb: putstatic com/zelix/lqx.h [Ljava/lang/Integer;
      // 2fe: goto 3dc
      // 301: dup_x2
      // 302: pop
      // 303: lstore 19
      // 305: bipush 8
      // 307: newarray 8
      // 309: dup
      // 30a: bipush 0
      // 30b: lload 19
      // 30d: bipush 56
      // 30f: lushr
      // 310: l2i
      // 311: i2b
      // 312: bastore
      // 313: dup
      // 314: bipush 1
      // 315: lload 19
      // 317: bipush 48
      // 319: lushr
      // 31a: l2i
      // 31b: i2b
      // 31c: bastore
      // 31d: dup
      // 31e: bipush 2
      // 31f: lload 19
      // 321: bipush 40
      // 323: lushr
      // 324: l2i
      // 325: i2b
      // 326: bastore
      // 327: dup
      // 328: bipush 3
      // 329: lload 19
      // 32b: bipush 32
      // 32d: lushr
      // 32e: l2i
      // 32f: i2b
      // 330: bastore
      // 331: dup
      // 332: bipush 4
      // 333: lload 19
      // 335: bipush 24
      // 337: lushr
      // 338: l2i
      // 339: i2b
      // 33a: bastore
      // 33b: dup
      // 33c: bipush 5
      // 33d: lload 19
      // 33f: bipush 16
      // 341: lushr
      // 342: l2i
      // 343: i2b
      // 344: bastore
      // 345: dup
      // 346: bipush 6
      // 348: lload 19
      // 34a: bipush 8
      // 34c: lushr
      // 34d: l2i
      // 34e: i2b
      // 34f: bastore
      // 350: dup
      // 351: bipush 7
      // 353: lload 19
      // 355: l2i
      // 356: i2b
      // 357: bastore
      // 358: aload 11
      // 35a: swap
      // 35b: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 35e: astore 21
      // 360: aload 21
      // 362: bipush 0
      // 363: baload
      // 364: i2l
      // 365: ldc2_w 255
      // 368: land
      // 369: bipush 56
      // 36b: lshl
      // 36c: aload 21
      // 36e: bipush 1
      // 36f: baload
      // 370: i2l
      // 371: ldc2_w 255
      // 374: land
      // 375: bipush 48
      // 377: lshl
      // 378: lor
      // 379: aload 21
      // 37b: bipush 2
      // 37c: baload
      // 37d: i2l
      // 37e: ldc2_w 255
      // 381: land
      // 382: bipush 40
      // 384: lshl
      // 385: lor
      // 386: aload 21
      // 388: bipush 3
      // 389: baload
      // 38a: i2l
      // 38b: ldc2_w 255
      // 38e: land
      // 38f: bipush 32
      // 391: lshl
      // 392: lor
      // 393: aload 21
      // 395: bipush 4
      // 396: baload
      // 397: i2l
      // 398: ldc2_w 255
      // 39b: land
      // 39c: bipush 24
      // 39e: lshl
      // 39f: lor
      // 3a0: aload 21
      // 3a2: bipush 5
      // 3a3: baload
      // 3a4: i2l
      // 3a5: ldc2_w 255
      // 3a8: land
      // 3a9: bipush 16
      // 3ab: lshl
      // 3ac: lor
      // 3ad: aload 21
      // 3af: bipush 6
      // 3b1: baload
      // 3b2: i2l
      // 3b3: ldc2_w 255
      // 3b6: land
      // 3b7: bipush 8
      // 3b9: lshl
      // 3ba: lor
      // 3bb: aload 21
      // 3bd: bipush 7
      // 3bf: baload
      // 3c0: i2l
      // 3c1: ldc2_w 255
      // 3c4: land
      // 3c5: lor
      // 3c6: dup2_x1
      // 3c7: pop2
      // 3c8: tableswitch -376 0 0 -223
      // 3dc: new java/util/HashMap
      // 3df: dup
      // 3e0: bipush 13
      // 3e2: invokespecial java/util/HashMap.<init> (I)V
      // 3e5: putstatic com/zelix/lqx.l Ljava/util/Map;
      // 3e8: ldc "DES/CBC/NoPadding"
      // 3ea: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 3ed: dup
      // 3ee: astore 0
      // 3ef: bipush 2
      // 3f0: ldc "DES"
      // 3f2: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 3f5: bipush 8
      // 3f7: newarray 8
      // 3f9: dup
      // 3fa: bipush 0
      // 3fb: lload 31
      // 3fd: bipush 56
      // 3ff: lushr
      // 400: l2i
      // 401: i2b
      // 402: bastore
      // 403: bipush 1
      // 404: istore 1
      // 405: iload 1
      // 406: bipush 8
      // 408: if_icmpge 420
      // 40b: dup
      // 40c: iload 1
      // 40d: lload 31
      // 40f: iload 1
      // 410: bipush 8
      // 412: imul
      // 413: lshl
      // 414: bipush 56
      // 416: lushr
      // 417: l2i
      // 418: i2b
      // 419: bastore
      // 41a: iinc 1 1
      // 41d: goto 405
      // 420: new javax/crypto/spec/DESKeySpec
      // 423: dup_x1
      // 424: swap
      // 425: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 428: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 42b: new javax/crypto/spec/IvParameterSpec
      // 42e: dup
      // 42f: bipush 8
      // 431: newarray 8
      // 433: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 436: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 439: bipush 2
      // 43a: newarray 11
      // 43c: astore 6
      // 43e: bipush 0
      // 43f: istore 3
      // 440: ldc "\fE!\b\nÆA\u008d\u0002?GQT÷\u0094q"
      // 442: dup
      // 443: astore 4
      // 445: invokevirtual java/lang/String.length ()I
      // 448: istore 5
      // 44a: bipush 0
      // 44b: istore 2
      // 44c: aload 4
      // 44e: iload 2
      // 44f: iinc 2 8
      // 452: iload 2
      // 453: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 456: ldc "ISO-8859-1"
      // 458: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 45b: astore 7
      // 45d: aload 6
      // 45f: iload 3
      // 460: iinc 3 1
      // 463: aload 7
      // 465: bipush 0
      // 466: baload
      // 467: i2l
      // 468: ldc2_w 255
      // 46b: land
      // 46c: bipush 56
      // 46e: lshl
      // 46f: aload 7
      // 471: bipush 1
      // 472: baload
      // 473: i2l
      // 474: ldc2_w 255
      // 477: land
      // 478: bipush 48
      // 47a: lshl
      // 47b: lor
      // 47c: aload 7
      // 47e: bipush 2
      // 47f: baload
      // 480: i2l
      // 481: ldc2_w 255
      // 484: land
      // 485: bipush 40
      // 487: lshl
      // 488: lor
      // 489: aload 7
      // 48b: bipush 3
      // 48c: baload
      // 48d: i2l
      // 48e: ldc2_w 255
      // 491: land
      // 492: bipush 32
      // 494: lshl
      // 495: lor
      // 496: aload 7
      // 498: bipush 4
      // 499: baload
      // 49a: i2l
      // 49b: ldc2_w 255
      // 49e: land
      // 49f: bipush 24
      // 4a1: lshl
      // 4a2: lor
      // 4a3: aload 7
      // 4a5: bipush 5
      // 4a6: baload
      // 4a7: i2l
      // 4a8: ldc2_w 255
      // 4ab: land
      // 4ac: bipush 16
      // 4ae: lshl
      // 4af: lor
      // 4b0: aload 7
      // 4b2: bipush 6
      // 4b4: baload
      // 4b5: i2l
      // 4b6: ldc2_w 255
      // 4b9: land
      // 4ba: bipush 8
      // 4bc: lshl
      // 4bd: lor
      // 4be: aload 7
      // 4c0: bipush 7
      // 4c2: baload
      // 4c3: i2l
      // 4c4: ldc2_w 255
      // 4c7: land
      // 4c8: lor
      // 4c9: bipush -1
      // 4ca: goto 4e3
      // 4cd: lastore
      // 4ce: iload 2
      // 4cf: iload 5
      // 4d1: if_icmplt 44c
      // 4d4: aload 6
      // 4d6: putstatic com/zelix/lqx.j [J
      // 4d9: bipush 2
      // 4da: anewarray 331
      // 4dd: putstatic com/zelix/lqx.k [Ljava/lang/Long;
      // 4e0: goto 5ad
      // 4e3: dup_x2
      // 4e4: pop
      // 4e5: lstore 8
      // 4e7: bipush 8
      // 4e9: newarray 8
      // 4eb: dup
      // 4ec: bipush 0
      // 4ed: lload 8
      // 4ef: bipush 56
      // 4f1: lushr
      // 4f2: l2i
      // 4f3: i2b
      // 4f4: bastore
      // 4f5: dup
      // 4f6: bipush 1
      // 4f7: lload 8
      // 4f9: bipush 48
      // 4fb: lushr
      // 4fc: l2i
      // 4fd: i2b
      // 4fe: bastore
      // 4ff: dup
      // 500: bipush 2
      // 501: lload 8
      // 503: bipush 40
      // 505: lushr
      // 506: l2i
      // 507: i2b
      // 508: bastore
      // 509: dup
      // 50a: bipush 3
      // 50b: lload 8
      // 50d: bipush 32
      // 50f: lushr
      // 510: l2i
      // 511: i2b
      // 512: bastore
      // 513: dup
      // 514: bipush 4
      // 515: lload 8
      // 517: bipush 24
      // 519: lushr
      // 51a: l2i
      // 51b: i2b
      // 51c: bastore
      // 51d: dup
      // 51e: bipush 5
      // 51f: lload 8
      // 521: bipush 16
      // 523: lushr
      // 524: l2i
      // 525: i2b
      // 526: bastore
      // 527: dup
      // 528: bipush 6
      // 52a: lload 8
      // 52c: bipush 8
      // 52e: lushr
      // 52f: l2i
      // 530: i2b
      // 531: bastore
      // 532: dup
      // 533: bipush 7
      // 535: lload 8
      // 537: l2i
      // 538: i2b
      // 539: bastore
      // 53a: aload 0
      // 53b: swap
      // 53c: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 53f: astore 10
      // 541: aload 10
      // 543: bipush 0
      // 544: baload
      // 545: i2l
      // 546: ldc2_w 255
      // 549: land
      // 54a: bipush 56
      // 54c: lshl
      // 54d: aload 10
      // 54f: bipush 1
      // 550: baload
      // 551: i2l
      // 552: ldc2_w 255
      // 555: land
      // 556: bipush 48
      // 558: lshl
      // 559: lor
      // 55a: aload 10
      // 55c: bipush 2
      // 55d: baload
      // 55e: i2l
      // 55f: ldc2_w 255
      // 562: land
      // 563: bipush 40
      // 565: lshl
      // 566: lor
      // 567: aload 10
      // 569: bipush 3
      // 56a: baload
      // 56b: i2l
      // 56c: ldc2_w 255
      // 56f: land
      // 570: bipush 32
      // 572: lshl
      // 573: lor
      // 574: aload 10
      // 576: bipush 4
      // 577: baload
      // 578: i2l
      // 579: ldc2_w 255
      // 57c: land
      // 57d: bipush 24
      // 57f: lshl
      // 580: lor
      // 581: aload 10
      // 583: bipush 5
      // 584: baload
      // 585: i2l
      // 586: ldc2_w 255
      // 589: land
      // 58a: bipush 16
      // 58c: lshl
      // 58d: lor
      // 58e: aload 10
      // 590: bipush 6
      // 592: baload
      // 593: i2l
      // 594: ldc2_w 255
      // 597: land
      // 598: bipush 8
      // 59a: lshl
      // 59b: lor
      // 59c: aload 10
      // 59e: bipush 7
      // 5a0: baload
      // 5a1: i2l
      // 5a2: ldc2_w 255
      // 5a5: land
      // 5a6: lor
      // 5a7: dup2_x1
      // 5a8: pop2
      // 5a9: pop
      // 5aa: goto 4cd
      // 5ad: sipush 27565
      // 5b0: ldc2_w 8891984109965410480
      // 5b3: lload 31
      // 5b5: lxor
      // 5b6: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bb: ldc2_w -7896919434093594153
      // 5be: lload 31
      // 5c0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c5: putstatic com/zelix/lqx.K Ljava/lang/String;
      // 5c8: sipush 20707
      // 5cb: new java/io/File
      // 5ce: dup
      // 5cf: ldc2_w -8436582056272746051
      // 5d2: lload 31
      // 5d4: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5dc: putstatic com/zelix/lqx.U Ljava/io/File;
      // 5df: ldc2_w 6160185930988279527
      // 5e2: lload 31
      // 5e4: lxor
      // 5e5: sipush 15991
      // 5e8: ldc2_w 9195585092190852435
      // 5eb: lload 31
      // 5ed: lxor
      // 5ee: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f3: ldc2_w -7896919434093594153
      // 5f6: lload 31
      // 5f8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fd: putstatic com/zelix/lqx.A Ljava/lang/String;
      // 600: ldc2_w -8036700374821759208
      // 603: lload 31
      // 605: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60a: bipush 0
      // 60b: invokevirtual java/lang/String.charAt (I)C
      // 60e: putstatic com/zelix/lqx.m C
      // 611: sipush 4472
      // 614: ldc2_w 6549205243451734612
      // 617: lload 31
      // 619: lxor
      // 61a: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61f: ldc2_w -7896919434093594153
      // 622: lload 31
      // 624: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 629: putstatic com/zelix/lqx.g Ljava/lang/String;
      // 62c: ldc2_w -7680245115132064108
      // 62f: lload 31
      // 631: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 636: bipush 0
      // 637: invokevirtual java/lang/String.charAt (I)C
      // 63a: putstatic com/zelix/lqx.P C
      // 63d: sipush 27732
      // 640: ldc2_w 5157461592754456405
      // 643: lload 31
      // 645: lxor
      // 646: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64b: ldc "\n"
      // 64d: ldc2_w -7510129362603576102
      // 650: lload 31
      // 652: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 657: putstatic com/zelix/lqx.z Ljava/lang/String;
      // 65a: sipush 19375
      // 65d: ldc2_w 1498862424386445472
      // 660: lload 31
      // 662: lxor
      // 663: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 668: sipush 27212
      // 66b: ldc2_w 347525961539551611
      // 66e: lload 31
      // 670: lxor
      // 671: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 676: ldc2_w -7510129362603576102
      // 679: lload 31
      // 67b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 680: putstatic com/zelix/lqx.a Ljava/lang/String;
      // 683: bipush 1
      // 684: ldc2_w -8517318968691500544
      // 687: lload 31
      // 689: invokedynamic j (ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68e: sipush 14122
      // 691: ldc2_w 9041000615246584840
      // 694: lload 31
      // 696: lxor
      // 697: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69c: ldc2_w -7896919434093594153
      // 69f: lload 31
      // 6a1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a6: putstatic com/zelix/lqx.N Ljava/lang/String;
      // 6a9: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ae: ldc2_w -7698033336408765355
      // 6b1: lload 31
      // 6b3: invokedynamic j (IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b8: sipush 30242
      // 6bb: ldc2_w 8949573292118908216
      // 6be: lload 31
      // 6c0: lxor
      // 6c1: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c6: astore 33
      // 6c8: aload 33
      // 6ca: ldc2_w -7810009863426212610
      // 6cd: lload 31
      // 6cf: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d4: astore 34
      // 6d6: bipush 0
      // 6d7: istore 37
      // 6d9: new java/io/File
      // 6dc: dup
      // 6dd: new java/lang/StringBuilder
      // 6e0: dup
      // 6e1: invokespecial java/lang/StringBuilder.<init> ()V
      // 6e4: aload 33
      // 6e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e9: iload 37
      // 6eb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6ee: sipush 28986
      // 6f1: ldc2_w 9222972863679732245
      // 6f4: lload 31
      // 6f6: lxor
      // 6f7: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 702: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 705: astore 35
      // 707: new java/io/File
      // 70a: dup
      // 70b: new java/lang/StringBuilder
      // 70e: dup
      // 70f: invokespecial java/lang/StringBuilder.<init> ()V
      // 712: aload 34
      // 714: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 717: iload 37
      // 719: iinc 37 1
      // 71c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 71f: sipush 23438
      // 722: ldc2_w 3268756145579208855
      // 725: lload 31
      // 727: lxor
      // 728: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 730: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 733: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 736: astore 36
      // 738: aload 35
      // 73a: ldc2_w -8158867254494786787
      // 73d: lload 31
      // 73f: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 744: ifne 6d9
      // 747: aload 36
      // 749: ldc2_w -8158867254494786787
      // 74c: lload 31
      // 74e: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 753: ifne 6d9
      // 756: new java/io/PrintWriter
      // 759: dup
      // 75a: new java/io/FileWriter
      // 75d: dup
      // 75e: aload 35
      // 760: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 763: bipush 1
      // 764: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;Z)V
      // 767: astore 38
      // 769: aload 38
      // 76b: aload 33
      // 76d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 770: aload 38
      // 772: ldc2_w -8260702340590026319
      // 775: lload 31
      // 777: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77c: aload 38
      // 77e: ldc2_w -8465414672848930573
      // 781: lload 31
      // 783: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: aload 36
      // 78a: ldc2_w -8158867254494786787
      // 78d: lload 31
      // 78f: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 794: ifne 7a6
      // 797: bipush 1
      // 798: goto 7a7
      // 79b: ldc2_w -7797358278165198295
      // 79e: lload 31
      // 7a0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a5: athrow
      // 7a6: bipush 0
      // 7a7: ldc2_w -8517318968691500544
      // 7aa: lload 31
      // 7ac: invokedynamic j (ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b1: goto 846
      // 7b4: astore 38
      // 7b6: ldc2_w -7819590091501717462
      // 7b9: lload 31
      // 7bb: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c0: sipush 1076
      // 7c3: ldc2_w 8705183705700101950
      // 7c6: lload 31
      // 7c8: lxor
      // 7c9: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ce: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 7d1: ifne 83b
      // 7d4: ldc2_w -7819590091501717462
      // 7d7: lload 31
      // 7d9: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7de: sipush 23110
      // 7e1: ldc2_w 8226726110694257006
      // 7e4: lload 31
      // 7e6: lxor
      // 7e7: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ec: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 7ef: ifne 83b
      // 7f2: goto 800
      // 7f5: ldc2_w -7797358278165198295
      // 7f8: lload 31
      // 7fa: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ff: athrow
      // 800: ldc2_w -7819590091501717462
      // 803: lload 31
      // 805: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80a: sipush 29072
      // 80d: ldc2_w 1011910693706144419
      // 810: lload 31
      // 812: lxor
      // 813: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 818: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 81b: ifne 83b
      // 81e: goto 82c
      // 821: ldc2_w -7797358278165198295
      // 824: lload 31
      // 826: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82b: athrow
      // 82c: bipush 1
      // 82d: goto 83c
      // 830: ldc2_w -7797358278165198295
      // 833: lload 31
      // 835: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83a: athrow
      // 83b: bipush 0
      // 83c: ldc2_w -8517318968691500544
      // 83f: lload 31
      // 841: invokedynamic j (ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 846: aload 35
      // 848: ldc2_w -8239743046647401004
      // 84b: lload 31
      // 84d: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 852: pop
      // 853: ldc2_w -7943692072619681506
      // 856: lload 31
      // 858: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85d: ifnull 8be
      // 860: new java/util/ArrayList
      // 863: dup
      // 864: invokespecial java/util/ArrayList.<init> ()V
      // 867: ldc2_w -8314452217615642210
      // 86a: lload 31
      // 86c: invokedynamic j (Ljava/util/List;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 871: new java/util/StringTokenizer
      // 874: dup
      // 875: ldc2_w -7943692072619681506
      // 878: lload 31
      // 87a: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87f: ldc ";"
      // 881: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 884: astore 38
      // 886: aload 38
      // 888: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 88b: ifeq 8be
      // 88e: aload 38
      // 890: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 893: astore 39
      // 895: ldc2_w -8517318968691500544
      // 898: lload 31
      // 89a: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89f: ifne 8a9
      // 8a2: aload 39
      // 8a4: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 8a7: astore 39
      // 8a9: ldc2_w -8314452217615642210
      // 8ac: lload 31
      // 8ae: invokedynamic m (JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b3: aload 39
      // 8b5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8ba: pop
      // 8bb: goto 886
      // 8be: return
   }

   public static boolean i(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 17871613758068
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: ldc2_w -2308097406946227161
      // 025: lload 1
      // 026: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 3
      // 02c: sipush 26591
      // 02f: ldc2_w 8583828683828213543
      // 032: lload 1
      // 033: lxor
      // 034: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokevirtual java/lang/String.lastIndexOf (I)I
      // 03c: istore 7
      // 03e: istore 6
      // 040: iload 7
      // 042: bipush -1
      // 043: if_icmple 12f
      // 046: aload 3
      // 047: iload 7
      // 049: aload 3
      // 04a: invokevirtual java/lang/String.length ()I
      // 04d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 050: astore 8
      // 052: aload 8
      // 054: sipush 14838
      // 057: ldc2_w 3077789708285707281
      // 05a: lload 1
      // 05b: lxor
      // 05c: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: ldc2_w -4326112600257925910
      // 064: lload 1
      // 065: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: iload 6
      // 06c: ifeq 12e
      // 06f: ifne 12d
      // 072: goto 07f
      // 075: ldc2_w -4234441300622222113
      // 078: lload 1
      // 079: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 8
      // 081: sipush 23381
      // 084: ldc2_w 997849897779750534
      // 087: lload 1
      // 088: lxor
      // 089: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: ldc2_w -4326112600257925910
      // 091: lload 1
      // 092: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: iload 6
      // 099: ifeq 12e
      // 09c: goto 0a9
      // 09f: ldc2_w -4234441300622222113
      // 0a2: lload 1
      // 0a3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ifne 12d
      // 0ac: goto 0b9
      // 0af: ldc2_w -4234441300622222113
      // 0b2: lload 1
      // 0b3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 8
      // 0bb: sipush 3389
      // 0be: ldc2_w 8235313344457289934
      // 0c1: lload 1
      // 0c2: lxor
      // 0c3: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: ldc2_w -4326112600257925910
      // 0cb: lload 1
      // 0cc: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: iload 6
      // 0d3: ifeq 12e
      // 0d6: goto 0e3
      // 0d9: ldc2_w -4234441300622222113
      // 0dc: lload 1
      // 0dd: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: ifne 12d
      // 0e6: goto 0f3
      // 0e9: ldc2_w -4234441300622222113
      // 0ec: lload 1
      // 0ed: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 8
      // 0f5: sipush 4691
      // 0f8: ldc2_w 2366214267137175457
      // 0fb: lload 1
      // 0fc: lxor
      // 0fd: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: ldc2_w -4326112600257925910
      // 105: lload 1
      // 106: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: iload 6
      // 10d: ifeq 12e
      // 110: goto 11d
      // 113: ldc2_w -4234441300622222113
      // 116: lload 1
      // 117: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: ifeq 12f
      // 120: goto 12d
      // 123: ldc2_w -4234441300622222113
      // 126: lload 1
      // 127: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: bipush 1
      // 12e: ireturn
      // 12f: ldc2_w -2708026608489871512
      // 132: lload 1
      // 133: invokedynamic k (JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iload 6
      // 13a: ifeq 156
      // 13d: ifnull 1e5
      // 140: goto 14d
      // 143: ldc2_w -4234441300622222113
      // 146: lload 1
      // 147: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: ldc2_w -2708026608489871512
      // 150: lload 1
      // 151: invokedynamic k (JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 15b: astore 8
      // 15d: aload 8
      // 15f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 164: ifeq 1e5
      // 167: aload 8
      // 169: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16e: checkcast java/lang/String
      // 171: astore 9
      // 173: aload 9
      // 175: ldc "*"
      // 177: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 17a: iload 6
      // 17c: lload 1
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 187
      // 182: ifeq 1e6
      // 185: iload 6
      // 187: lload 1
      // 188: lconst_0
      // 189: lcmp
      // 18a: ifle 1cb
      // 18d: ifeq 1c9
      // 190: goto 19d
      // 193: ldc2_w -4234441300622222113
      // 196: lload 1
      // 197: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: lload 1
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: iflt 1e2
      // 1a3: bipush -1
      // 1a4: if_icmple 1e0
      // 1a7: goto 1b4
      // 1aa: ldc2_w -4234441300622222113
      // 1ad: lload 1
      // 1ae: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 3
      // 1b5: lload 4
      // 1b7: aload 9
      // 1b9: invokestatic com/zelix/mn.R (Ljava/lang/String;JLjava/lang/String;)Z
      // 1bc: goto 1c9
      // 1bf: ldc2_w -4234441300622222113
      // 1c2: lload 1
      // 1c3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: iload 6
      // 1cb: ifeq 1df
      // 1ce: ifeq 1e0
      // 1d1: goto 1de
      // 1d4: ldc2_w -4234441300622222113
      // 1d7: lload 1
      // 1d8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: bipush 1
      // 1df: ireturn
      // 1e0: iload 6
      // 1e2: ifne 15d
      // 1e5: bipush 0
      // 1e6: ireturn
   }

   public static boolean P(Object[] var0) {
      File var3 = (File)var0[0];
      long var1 = (Long)var0[1];
      var1 = b ^ var1;
      long var4 = var1 ^ 109535001468786L;
      int var10000 = m44.a<"l">(-4977416887809201860L, var1);
      FileInputStream var7 = null;
      int var6 = var10000;

      boolean var8;
      try {
         var7 = new FileInputStream(var3);
         var8 = m44.a<"l">(new Object[]{var7, var4}, -4613070570879492203L, var1);
      } finally {
         try {
            label71: {
               label70: {
                  try {
                     var24 = var7;
                     if (var6 == 0) {
                        break label70;
                     }

                     if (var7 == null) {
                        break label71;
                     }
                  } catch (nn var19) {
                     throw m44.a<"l">(var19, -6906434924467111484L, var1);
                  }

                  var24 = var7;
               }

               m44.a<"s">(var24, -6841032601144660513L, var1);
            }
         } catch (nn var20) {
            throw var20;
         } catch (Exception var21) {
         }
      }

      return var8;
   }

   public static String e(Object[] param0) {
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
      // 004: checkcast [B
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/lb6
      // 018: astore 2
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/lb6
      // 01f: astore 6
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/lb6
      // 027: astore 5
      // 029: pop
      // 02a: getstatic com/zelix/lqx.b J
      // 02d: lload 3
      // 02e: lxor
      // 02f: lstore 3
      // 030: ldc2_w -508242419180603190
      // 033: lload 3
      // 034: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: istore 7
      // 03b: aload 1
      // 03c: iload 7
      // 03e: ifne 05e
      // 041: ifnonnull 05d
      // 044: goto 051
      // 047: ldc2_w -1938473778973475590
      // 04a: lload 3
      // 04b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aconst_null
      // 052: areturn
      // 053: ldc2_w -1938473778973475590
      // 056: lload 3
      // 057: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 1
      // 05e: arraylength
      // 05f: lload 3
      // 060: lconst_0
      // 061: lcmp
      // 062: iflt 0e1
      // 065: ldc2_w -2019854689937458554
      // 068: lload 3
      // 069: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: iload 7
      // 070: ifne 0e0
      // 073: if_icmpeq 0d0
      // 076: goto 083
      // 079: ldc2_w -1938473778973475590
      // 07c: lload 3
      // 07d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: new java/lang/IllegalArgumentException
      // 086: dup
      // 087: new java/lang/StringBuilder
      // 08a: dup
      // 08b: invokespecial java/lang/StringBuilder.<init> ()V
      // 08e: sipush 19699
      // 091: ldc2_w 8736686383970701608
      // 094: lload 3
      // 095: lxor
      // 096: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: ldc2_w -2019854689937458554
      // 0a1: lload 3
      // 0a2: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0aa: sipush 10930
      // 0ad: ldc2_w 8095495602602948460
      // 0b0: lload 3
      // 0b1: lxor
      // 0b2: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba: aload 1
      // 0bb: arraylength
      // 0bc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0c5: athrow
      // 0c6: ldc2_w -1938473778973475590
      // 0c9: lload 3
      // 0ca: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 1
      // 0d1: bipush 0
      // 0d2: baload
      // 0d3: sipush 22908
      // 0d6: ldc2_w 7354250611710110114
      // 0d9: lload 3
      // 0da: lxor
      // 0db: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: iand
      // 0e1: istore 8
      // 0e3: aload 1
      // 0e4: bipush 1
      // 0e5: baload
      // 0e6: sipush 22908
      // 0e9: ldc2_w 7354250611710110114
      // 0ec: lload 3
      // 0ed: lxor
      // 0ee: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: iand
      // 0f4: istore 9
      // 0f6: aload 1
      // 0f7: bipush 2
      // 0f8: baload
      // 0f9: sipush 22908
      // 0fc: ldc2_w 7354250611710110114
      // 0ff: lload 3
      // 100: lxor
      // 101: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: iand
      // 107: istore 10
      // 109: iload 8
      // 10b: sipush 1290
      // 10e: ldc2_w 3209644410548483541
      // 111: lload 3
      // 112: lxor
      // 113: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: iload 7
      // 11a: ifne 1d3
      // 11d: if_icmpne 1c4
      // 120: goto 12d
      // 123: ldc2_w -1938473778973475590
      // 126: lload 3
      // 127: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: iload 9
      // 12f: sipush 31058
      // 132: ldc2_w 5515633480166738335
      // 135: lload 3
      // 136: lxor
      // 137: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iload 7
      // 13e: ifne 1d3
      // 141: goto 14e
      // 144: ldc2_w -1938473778973475590
      // 147: lload 3
      // 148: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: lload 3
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifle 1c9
      // 154: if_icmpne 1c4
      // 157: goto 164
      // 15a: ldc2_w -1938473778973475590
      // 15d: lload 3
      // 15e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: iload 10
      // 166: sipush 23721
      // 169: ldc2_w 2244604240897354854
      // 16c: lload 3
      // 16d: lxor
      // 16e: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: iload 7
      // 175: lload 3
      // 176: lconst_0
      // 177: lcmp
      // 178: ifle 1d5
      // 17b: ifne 1d3
      // 17e: goto 18b
      // 181: ldc2_w -1938473778973475590
      // 184: lload 3
      // 185: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: lload 3
      // 18c: lconst_0
      // 18d: lcmp
      // 18e: iflt 1c9
      // 191: if_icmpne 1c4
      // 194: goto 1a1
      // 197: ldc2_w -1938473778973475590
      // 19a: lload 3
      // 19b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 2
      // 1a2: bipush 3
      // 1a3: invokevirtual com/zelix/lb6.P (I)V
      // 1a6: sipush 26184
      // 1a9: aload 6
      // 1ab: bipush 3
      // 1ac: invokevirtual com/zelix/lb6.P (I)V
      // 1af: ldc2_w 4838382626620898237
      // 1b2: lload 3
      // 1b3: lxor
      // 1b4: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: areturn
      // 1ba: ldc2_w -1938473778973475590
      // 1bd: lload 3
      // 1be: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: iload 8
      // 1c6: sipush 22908
      // 1c9: ldc2_w 7354250611710110114
      // 1cc: lload 3
      // 1cd: lxor
      // 1ce: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: iload 7
      // 1d5: ifne 258
      // 1d8: if_icmpne 249
      // 1db: goto 1e8
      // 1de: ldc2_w -1938473778973475590
      // 1e1: lload 3
      // 1e2: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: iload 9
      // 1ea: sipush 31867
      // 1ed: ldc2_w 5557193679889992874
      // 1f0: lload 3
      // 1f1: lxor
      // 1f2: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: iload 7
      // 1f9: lload 3
      // 1fa: lconst_0
      // 1fb: lcmp
      // 1fc: ifle 260
      // 1ff: ifne 258
      // 202: goto 20f
      // 205: ldc2_w -1938473778973475590
      // 208: lload 3
      // 209: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: lload 3
      // 210: lconst_0
      // 211: lcmp
      // 212: ifle 24e
      // 215: if_icmpne 249
      // 218: goto 225
      // 21b: ldc2_w -1938473778973475590
      // 21e: lload 3
      // 21f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: aload 6
      // 227: bipush 2
      // 228: invokevirtual com/zelix/lb6.P (I)V
      // 22b: sipush 23919
      // 22e: aload 5
      // 230: bipush 0
      // 231: invokevirtual com/zelix/lb6.P (I)V
      // 234: ldc2_w 3526277308402942112
      // 237: lload 3
      // 238: lxor
      // 239: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: areturn
      // 23f: ldc2_w -1938473778973475590
      // 242: lload 3
      // 243: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: iload 8
      // 24b: sipush 19344
      // 24e: ldc2_w 4553384277256584030
      // 251: lload 3
      // 252: lxor
      // 253: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: lload 3
      // 259: lconst_0
      // 25a: lcmp
      // 25b: iflt 28f
      // 25e: iload 7
      // 260: ifne 28f
      // 263: if_icmpne 2b6
      // 266: goto 273
      // 269: ldc2_w -1938473778973475590
      // 26c: lload 3
      // 26d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: iload 9
      // 275: sipush 22908
      // 278: ldc2_w 7354250611710110114
      // 27b: lload 3
      // 27c: lxor
      // 27d: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: goto 28f
      // 285: ldc2_w -1938473778973475590
      // 288: lload 3
      // 289: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: athrow
      // 28f: if_icmpne 2b6
      // 292: aload 6
      // 294: bipush 2
      // 295: invokevirtual com/zelix/lb6.P (I)V
      // 298: sipush 11300
      // 29b: aload 5
      // 29d: bipush 1
      // 29e: invokevirtual com/zelix/lb6.P (I)V
      // 2a1: ldc2_w 4912934512361255385
      // 2a4: lload 3
      // 2a5: lxor
      // 2a6: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: areturn
      // 2ac: ldc2_w -1938473778973475590
      // 2af: lload 3
      // 2b0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: aconst_null
      // 2b7: areturn
   }

   public static String F(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w 2262952418164575415
      // 01c: lload 1
      // 01d: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 3
      // 025: iload 4
      // 027: ifeq 04a
      // 02a: ifnonnull 046
      // 02d: goto 03a
      // 030: ldc2_w 408803428951432271
      // 033: lload 1
      // 034: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aconst_null
      // 03b: areturn
      // 03c: ldc2_w 408803428951432271
      // 03f: lload 1
      // 040: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: aload 3
      // 047: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 04a: astore 5
      // 04c: ldc2_w 1844335098834596124
      // 04f: lload 1
      // 050: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: sipush 3155
      // 058: ldc2_w 1022199908953857076
      // 05b: lload 1
      // 05c: lxor
      // 05d: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: iload 4
      // 064: ifeq 0da
      // 067: if_icmpne 09f
      // 06a: goto 077
      // 06d: ldc2_w 408803428951432271
      // 070: lload 1
      // 071: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 5
      // 079: sipush 16431
      // 07c: ldc2_w 3859006537645150288
      // 07f: lload 1
      // 080: lxor
      // 081: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: ldc2_w 1844335098834596124
      // 089: lload 1
      // 08a: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 092: lload 1
      // 093: lconst_0
      // 094: lcmp
      // 095: iflt 0fc
      // 098: astore 5
      // 09a: iload 4
      // 09c: ifne 0fa
      // 09f: ldc2_w 1844335098834596124
      // 0a2: lload 1
      // 0a3: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: lload 1
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: iflt 108
      // 0ae: iload 4
      // 0b0: ifeq 108
      // 0b3: goto 0c0
      // 0b6: ldc2_w 408803428951432271
      // 0b9: lload 1
      // 0ba: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: sipush 16431
      // 0c3: ldc2_w 3859006537645150288
      // 0c6: lload 1
      // 0c7: lxor
      // 0c8: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w 408803428951432271
      // 0d3: lload 1
      // 0d4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmpne 0fa
      // 0dd: aload 5
      // 0df: sipush 3155
      // 0e2: ldc2_w 1022199908953857076
      // 0e5: lload 1
      // 0e6: lxor
      // 0e7: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: ldc2_w 1844335098834596124
      // 0ef: lload 1
      // 0f0: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f8: astore 5
      // 0fa: aload 5
      // 0fc: ldc2_w 437285596262531454
      // 0ff: lload 1
      // 100: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 108: ifeq 142
      // 10b: aload 5
      // 10d: bipush 0
      // 10e: aload 5
      // 110: invokevirtual java/lang/String.length ()I
      // 113: ldc2_w 437285596262531454
      // 116: lload 1
      // 117: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: invokevirtual java/lang/String.length ()I
      // 11f: isub
      // 120: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 123: iload 4
      // 125: lload 1
      // 126: lconst_0
      // 127: lcmp
      // 128: iflt 153
      // 12b: ifeq 14a
      // 12e: goto 13b
      // 131: ldc2_w 408803428951432271
      // 134: lload 1
      // 135: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: astore 5
      // 13d: iload 4
      // 13f: ifne 0fa
      // 142: lload 1
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 10b
      // 148: aload 5
      // 14a: ldc2_w 1844335098834596124
      // 14d: lload 1
      // 14e: invokedynamic k (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual java/lang/String.lastIndexOf (I)I
      // 156: istore 6
      // 158: iload 6
      // 15a: bipush -1
      // 15b: lload 1
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: ifle 18c
      // 161: iload 4
      // 163: ifeq 18c
      // 166: if_icmple 1b1
      // 169: goto 176
      // 16c: ldc2_w 408803428951432271
      // 16f: lload 1
      // 170: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: iload 6
      // 178: aload 5
      // 17a: invokevirtual java/lang/String.length ()I
      // 17d: bipush 1
      // 17e: isub
      // 17f: goto 18c
      // 182: ldc2_w 408803428951432271
      // 185: lload 1
      // 186: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: if_icmpne 1a7
      // 18f: aload 5
      // 191: bipush 0
      // 192: aload 5
      // 194: invokevirtual java/lang/String.length ()I
      // 197: bipush 1
      // 198: isub
      // 199: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 19c: areturn
      // 19d: ldc2_w 408803428951432271
      // 1a0: lload 1
      // 1a1: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 5
      // 1a9: iload 6
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1b0: areturn
      // 1b1: aload 5
      // 1b3: areturn
   }

   public static boolean h(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/lqx.b J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 3783874785106834619
      // 01c: lload 2
      // 01d: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 1
      // 025: iload 4
      // 027: ifne 04b
      // 02a: ifnull 069
      // 02d: goto 03a
      // 030: ldc2_w 2983760619394412683
      // 033: lload 2
      // 034: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03e: goto 04b
      // 041: ldc2_w 2983760619394412683
      // 044: lload 2
      // 045: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: invokevirtual java/lang/String.length ()I
      // 04e: iload 4
      // 050: lload 2
      // 051: lconst_0
      // 052: lcmp
      // 053: ifle 088
      // 056: ifne 07f
      // 059: ifne 075
      // 05c: goto 069
      // 05f: ldc2_w 2983760619394412683
      // 062: lload 2
      // 063: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: bipush 0
      // 06a: ireturn
      // 06b: ldc2_w 2983760619394412683
      // 06e: lload 2
      // 06f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: aload 1
      // 076: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 079: astore 1
      // 07a: aload 1
      // 07b: bipush 0
      // 07c: invokevirtual java/lang/String.charAt (I)C
      // 07f: ldc2_w 3307374124276734411
      // 082: lload 2
      // 083: invokedynamic o (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: ifle 0cc
      // 08e: iload 4
      // 090: ifne 0cc
      // 093: if_icmpne 0af
      // 096: goto 0a3
      // 099: ldc2_w 2983760619394412683
      // 09c: lload 2
      // 09d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: bipush 0
      // 0a4: ireturn
      // 0a5: ldc2_w 2983760619394412683
      // 0a8: lload 2
      // 0a9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: invokevirtual java/lang/String.length ()I
      // 0b3: iload 4
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 0bf
      // 0bb: ifne 146
      // 0be: bipush 1
      // 0bf: goto 0cc
      // 0c2: ldc2_w 2983760619394412683
      // 0c5: lload 2
      // 0c6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: lload 2
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 0e5
      // 0d2: if_icmple 145
      // 0d5: aload 1
      // 0d6: bipush 0
      // 0d7: invokevirtual java/lang/String.charAt (I)C
      // 0da: ldc2_w 3499346784391155017
      // 0dd: lload 2
      // 0de: invokedynamic k (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: iload 4
      // 0e5: ifne 146
      // 0e8: goto 0f5
      // 0eb: ldc2_w 2983760619394412683
      // 0ee: lload 2
      // 0ef: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: ifeq 145
      // 0f8: goto 105
      // 0fb: ldc2_w 2983760619394412683
      // 0fe: lload 2
      // 0ff: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 1
      // 106: bipush 1
      // 107: invokevirtual java/lang/String.charAt (I)C
      // 10a: iload 4
      // 10c: ifne 146
      // 10f: goto 11c
      // 112: ldc2_w 2983760619394412683
      // 115: lload 2
      // 116: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: sipush 25033
      // 11f: ldc2_w 6616698313326812513
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: if_icmpne 145
      // 12c: goto 139
      // 12f: ldc2_w 2983760619394412683
      // 132: lload 2
      // 133: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: bipush 0
      // 13a: ireturn
      // 13b: ldc2_w 2983760619394412683
      // 13e: lload 2
      // 13f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: bipush 1
      // 146: ireturn
   }

   public static String E(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 2
      // 019: pop
      // 01a: getstatic com/zelix/lqx.b J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: ldc2_w 4435261812186004917
      // 023: lload 3
      // 024: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: istore 5
      // 02b: aload 1
      // 02c: aload 2
      // 02d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 030: iload 5
      // 032: ifne 05f
      // 035: ifeq 052
      // 038: goto 045
      // 03b: ldc2_w 2334627634080102789
      // 03e: lload 3
      // 03f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: athrow
      // 045: ldc "."
      // 047: areturn
      // 048: ldc2_w 2334627634080102789
      // 04b: lload 3
      // 04c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: sipush 19505
      // 055: ldc2_w 7393766662090193300
      // 058: lload 3
      // 059: lxor
      // 05a: invokedynamic k (IJ)I bsm=com/zelix/lqx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: istore 7
      // 061: aload 1
      // 062: ldc2_w 2583820530018985140
      // 065: lload 3
      // 066: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 06e: dup
      // 06f: istore 6
      // 071: bipush -1
      // 072: iload 5
      // 074: ifne 0f3
      // 077: if_icmpgt 0cb
      // 07a: goto 087
      // 07d: ldc2_w 2334627634080102789
      // 080: lload 3
      // 081: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 1
      // 088: ldc "\\"
      // 08a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 08d: dup
      // 08e: istore 6
      // 090: bipush -1
      // 091: iload 5
      // 093: ifne 0f3
      // 096: if_icmpgt 0cb
      // 099: goto 0a6
      // 09c: ldc2_w 2334627634080102789
      // 09f: lload 3
      // 0a0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: ldc "/"
      // 0a9: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 0ac: dup
      // 0ad: istore 6
      // 0af: iload 5
      // 0b1: lload 3
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0bb
      // 0b7: ifne 100
      // 0ba: bipush -1
      // 0bb: if_icmple 0fe
      // 0be: goto 0cb
      // 0c1: ldc2_w 2334627634080102789
      // 0c4: lload 3
      // 0c5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: iload 6
      // 0cd: iload 5
      // 0cf: lload 3
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: iflt 102
      // 0d5: ifne 100
      // 0d8: goto 0e5
      // 0db: ldc2_w 2334627634080102789
      // 0de: lload 3
      // 0df: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: bipush -1
      // 0e6: goto 0f3
      // 0e9: ldc2_w 2334627634080102789
      // 0ec: lload 3
      // 0ed: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: if_icmple 0fe
      // 0f6: aload 1
      // 0f7: iload 6
      // 0f9: invokevirtual java/lang/String.charAt (I)C
      // 0fc: istore 7
      // 0fe: iload 7
      // 100: iload 5
      // 102: ifne 1b9
      // 105: ifne 1b2
      // 108: goto 115
      // 10b: ldc2_w 2334627634080102789
      // 10e: lload 3
      // 10f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 2
      // 116: ldc2_w 2583820530018985140
      // 119: lload 3
      // 11a: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 122: dup
      // 123: istore 6
      // 125: bipush -1
      // 126: iload 5
      // 128: ifne 1a7
      // 12b: if_icmpgt 17f
      // 12e: goto 13b
      // 131: ldc2_w 2334627634080102789
      // 134: lload 3
      // 135: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 2
      // 13c: ldc "\\"
      // 13e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 141: dup
      // 142: istore 6
      // 144: bipush -1
      // 145: iload 5
      // 147: ifne 1a7
      // 14a: if_icmpgt 17f
      // 14d: goto 15a
      // 150: ldc2_w 2334627634080102789
      // 153: lload 3
      // 154: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 2
      // 15b: ldc "/"
      // 15d: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 160: dup
      // 161: istore 6
      // 163: iload 5
      // 165: lload 3
      // 166: lconst_0
      // 167: lcmp
      // 168: iflt 16f
      // 16b: ifne 1b9
      // 16e: bipush -1
      // 16f: if_icmple 1b2
      // 172: goto 17f
      // 175: ldc2_w 2334627634080102789
      // 178: lload 3
      // 179: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: iload 6
      // 181: iload 5
      // 183: lload 3
      // 184: lconst_0
      // 185: lcmp
      // 186: iflt 1bb
      // 189: ifne 1b9
      // 18c: goto 199
      // 18f: ldc2_w 2334627634080102789
      // 192: lload 3
      // 193: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: bipush -1
      // 19a: goto 1a7
      // 19d: ldc2_w 2334627634080102789
      // 1a0: lload 3
      // 1a1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: if_icmple 1b2
      // 1aa: aload 2
      // 1ab: iload 6
      // 1ad: invokevirtual java/lang/String.charAt (I)C
      // 1b0: istore 7
      // 1b2: aload 1
      // 1b3: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1b6: invokevirtual java/lang/String.length ()I
      // 1b9: iload 5
      // 1bb: ifne 20b
      // 1be: ifne 209
      // 1c1: goto 1ce
      // 1c4: ldc2_w 2334627634080102789
      // 1c7: lload 3
      // 1c8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 2
      // 1cf: iload 5
      // 1d1: ifne 208
      // 1d4: goto 1e1
      // 1d7: ldc2_w 2334627634080102789
      // 1da: lload 3
      // 1db: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: athrow
      // 1e1: bipush 0
      // 1e2: invokevirtual java/lang/String.charAt (I)C
      // 1e5: iload 7
      // 1e7: if_icmpne 207
      // 1ea: goto 1f7
      // 1ed: ldc2_w 2334627634080102789
      // 1f0: lload 3
      // 1f1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: athrow
      // 1f7: aload 2
      // 1f8: bipush 1
      // 1f9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1fc: areturn
      // 1fd: ldc2_w 2334627634080102789
      // 200: lload 3
      // 201: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 2
      // 208: areturn
      // 209: iload 7
      // 20b: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 20e: astore 8
      // 210: new java/util/StringTokenizer
      // 213: dup
      // 214: aload 1
      // 215: aload 8
      // 217: bipush 1
      // 218: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 21b: astore 9
      // 21d: new java/util/StringTokenizer
      // 220: dup
      // 221: aload 2
      // 222: aload 8
      // 224: bipush 1
      // 225: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 228: astore 10
      // 22a: aload 9
      // 22c: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 22f: istore 11
      // 231: aload 10
      // 233: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 236: istore 12
      // 238: new java/lang/StringBuilder
      // 23b: dup
      // 23c: invokespecial java/lang/StringBuilder.<init> ()V
      // 23f: astore 13
      // 241: bipush 0
      // 242: istore 14
      // 244: iload 14
      // 246: iload 11
      // 248: if_icmpge 29f
      // 24b: iload 14
      // 24d: iload 12
      // 24f: if_icmpge 29f
      // 252: aload 9
      // 254: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 257: astore 15
      // 259: aload 10
      // 25b: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 25e: astore 16
      // 260: aload 15
      // 262: iload 5
      // 264: ifne 2a4
      // 267: aload 16
      // 269: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 26c: ifeq 29f
      // 26f: goto 27c
      // 272: ldc2_w 2334627634080102789
      // 275: lload 3
      // 276: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: aload 13
      // 27e: aload 15
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: pop
      // 284: iinc 14 1
      // 287: iload 5
      // 289: ifeq 244
      // 28c: lload 3
      // 28d: lconst_0
      // 28e: lcmp
      // 28f: iflt 29f
      // 292: goto 29f
      // 295: ldc2_w 2334627634080102789
      // 298: lload 3
      // 299: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: athrow
      // 29f: aload 13
      // 2a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a4: astore 14
      // 2a6: aload 14
      // 2a8: invokevirtual java/lang/String.length ()I
      // 2ab: ifne 380
      // 2ae: new java/util/StringTokenizer
      // 2b1: dup
      // 2b2: aload 1
      // 2b3: aload 8
      // 2b5: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2b8: astore 15
      // 2ba: aload 15
      // 2bc: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 2bf: istore 16
      // 2c1: new java/lang/StringBuilder
      // 2c4: dup
      // 2c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c8: astore 17
      // 2ca: bipush 0
      // 2cb: istore 18
      // 2cd: iload 18
      // 2cf: iload 16
      // 2d1: if_icmpge 33d
      // 2d4: aload 17
      // 2d6: sipush 889
      // 2d9: ldc2_w 1988519405662067661
      // 2dc: lload 3
      // 2dd: lxor
      // 2de: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e6: pop
      // 2e7: iload 5
      // 2e9: lload 3
      // 2ea: lconst_0
      // 2eb: lcmp
      // 2ec: iflt 33a
      // 2ef: ifne 338
      // 2f2: iload 18
      // 2f4: lload 3
      // 2f5: lconst_0
      // 2f6: lcmp
      // 2f7: iflt 35b
      // 2fa: iload 5
      // 2fc: ifne 35b
      // 2ff: goto 30c
      // 302: ldc2_w 2334627634080102789
      // 305: lload 3
      // 306: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: athrow
      // 30c: iload 16
      // 30e: bipush 1
      // 30f: isub
      // 310: if_icmpge 335
      // 313: goto 320
      // 316: ldc2_w 2334627634080102789
      // 319: lload 3
      // 31a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: aload 17
      // 322: aload 8
      // 324: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 327: pop
      // 328: goto 335
      // 32b: ldc2_w 2334627634080102789
      // 32e: lload 3
      // 32f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: athrow
      // 335: iinc 18 1
      // 338: iload 5
      // 33a: ifeq 2cd
      // 33d: aload 2
      // 33e: lload 3
      // 33f: lconst_0
      // 340: lcmp
      // 341: iflt 37f
      // 344: iload 5
      // 346: ifne 37f
      // 349: aload 8
      // 34b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 34e: goto 35b
      // 351: ldc2_w 2334627634080102789
      // 354: lload 3
      // 355: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: athrow
      // 35b: ifne 373
      // 35e: aload 17
      // 360: aload 8
      // 362: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 365: pop
      // 366: goto 373
      // 369: ldc2_w 2334627634080102789
      // 36c: lload 3
      // 36d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: athrow
      // 373: aload 17
      // 375: aload 2
      // 376: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 379: pop
      // 37a: aload 17
      // 37c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 37f: areturn
      // 380: new java/util/StringTokenizer
      // 383: dup
      // 384: aload 14
      // 386: aload 8
      // 388: bipush 1
      // 389: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 38c: astore 15
      // 38e: aload 15
      // 390: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 393: istore 16
      // 395: aload 2
      // 396: aload 14
      // 398: invokevirtual java/lang/String.length ()I
      // 39b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 39e: astore 17
      // 3a0: new java/lang/StringBuilder
      // 3a3: dup
      // 3a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a7: astore 18
      // 3a9: iload 11
      // 3ab: lload 3
      // 3ac: lconst_0
      // 3ad: lcmp
      // 3ae: iflt 3fa
      // 3b1: iload 16
      // 3b3: iload 5
      // 3b5: ifne 3f9
      // 3b8: if_icmpne 3e8
      // 3bb: goto 3c8
      // 3be: ldc2_w 2334627634080102789
      // 3c1: lload 3
      // 3c2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: athrow
      // 3c8: aload 18
      // 3ca: ldc "."
      // 3cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3cf: pop
      // 3d0: lload 3
      // 3d1: lconst_0
      // 3d2: lcmp
      // 3d3: ifle 45f
      // 3d6: iload 5
      // 3d8: ifeq 45f
      // 3db: goto 3e8
      // 3de: ldc2_w 2334627634080102789
      // 3e1: lload 3
      // 3e2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: athrow
      // 3e8: iload 11
      // 3ea: iload 16
      // 3ec: goto 3f9
      // 3ef: ldc2_w 2334627634080102789
      // 3f2: lload 3
      // 3f3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: athrow
      // 3f9: isub
      // 3fa: istore 19
      // 3fc: aload 18
      // 3fe: sipush 20639
      // 401: ldc2_w 1282253100905891847
      // 404: lload 3
      // 405: lxor
      // 406: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40e: pop
      // 40f: iinc 19 -1
      // 412: bipush 0
      // 413: istore 20
      // 415: iload 20
      // 417: iload 19
      // 419: bipush 2
      // 41a: idiv
      // 41b: if_icmpge 45f
      // 41e: aload 18
      // 420: aload 8
      // 422: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 425: pop
      // 426: aload 18
      // 428: sipush 20639
      // 42b: ldc2_w 1282253100905891847
      // 42e: lload 3
      // 42f: lxor
      // 430: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 438: lload 3
      // 439: lconst_0
      // 43a: lcmp
      // 43b: ifle 5cb
      // 43e: pop
      // 43f: iinc 20 1
      // 442: iload 5
      // 444: ifne 5c9
      // 447: iload 5
      // 449: ifeq 415
      // 44c: lload 3
      // 44d: lconst_0
      // 44e: lcmp
      // 44f: iflt 442
      // 452: goto 45f
      // 455: ldc2_w 2334627634080102789
      // 458: lload 3
      // 459: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45e: athrow
      // 45f: aload 17
      // 461: iload 5
      // 463: ifne 5ce
      // 466: invokevirtual java/lang/String.length ()I
      // 469: ifle 5c9
      // 46c: goto 479
      // 46f: ldc2_w 2334627634080102789
      // 472: lload 3
      // 473: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: athrow
      // 479: aload 18
      // 47b: invokevirtual java/lang/StringBuilder.length ()I
      // 47e: bipush 1
      // 47f: iload 5
      // 481: lload 3
      // 482: lconst_0
      // 483: lcmp
      // 484: iflt 545
      // 487: ifne 53d
      // 48a: goto 497
      // 48d: ldc2_w 2334627634080102789
      // 490: lload 3
      // 491: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 496: athrow
      // 497: if_icmpne 51c
      // 49a: goto 4a7
      // 49d: ldc2_w 2334627634080102789
      // 4a0: lload 3
      // 4a1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a6: athrow
      // 4a7: aload 18
      // 4a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4ac: ldc "."
      // 4ae: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4b1: iload 5
      // 4b3: ifne 53b
      // 4b6: goto 4c3
      // 4b9: ldc2_w 2334627634080102789
      // 4bc: lload 3
      // 4bd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: athrow
      // 4c3: lload 3
      // 4c4: lconst_0
      // 4c5: lcmp
      // 4c6: ifle 52e
      // 4c9: ifeq 51c
      // 4cc: goto 4d9
      // 4cf: ldc2_w 2334627634080102789
      // 4d2: lload 3
      // 4d3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: athrow
      // 4d9: aload 18
      // 4db: iload 5
      // 4dd: ifne 5c8
      // 4e0: goto 4ed
      // 4e3: ldc2_w 2334627634080102789
      // 4e6: lload 3
      // 4e7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ec: athrow
      // 4ed: bipush 0
      // 4ee: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 4f1: aload 17
      // 4f3: bipush 0
      // 4f4: invokevirtual java/lang/String.charAt (I)C
      // 4f7: iload 7
      // 4f9: if_icmpne 5c1
      // 4fc: goto 509
      // 4ff: ldc2_w 2334627634080102789
      // 502: lload 3
      // 503: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 508: athrow
      // 509: aload 17
      // 50b: bipush 1
      // 50c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 50f: astore 17
      // 511: iload 5
      // 513: lload 3
      // 514: lconst_0
      // 515: lcmp
      // 516: iflt 52e
      // 519: ifeq 5c1
      // 51c: aload 18
      // 51e: aload 18
      // 520: invokevirtual java/lang/StringBuilder.length ()I
      // 523: bipush 1
      // 524: isub
      // 525: ldc2_w 2700696608840059103
      // 528: lload 3
      // 529: invokedynamic r (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52e: goto 53b
      // 531: ldc2_w 2334627634080102789
      // 534: lload 3
      // 535: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53a: athrow
      // 53b: iload 7
      // 53d: lload 3
      // 53e: lconst_0
      // 53f: lcmp
      // 540: ifle 5a9
      // 543: iload 5
      // 545: ifne 5a9
      // 548: if_icmpne 594
      // 54b: goto 558
      // 54e: ldc2_w 2334627634080102789
      // 551: lload 3
      // 552: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 557: athrow
      // 558: aload 17
      // 55a: bipush 0
      // 55b: invokevirtual java/lang/String.charAt (I)C
      // 55e: iload 7
      // 560: if_icmpne 5c1
      // 563: goto 570
      // 566: ldc2_w 2334627634080102789
      // 569: lload 3
      // 56a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56f: athrow
      // 570: aload 18
      // 572: lload 3
      // 573: lconst_0
      // 574: lcmp
      // 575: ifle 5c3
      // 578: aload 18
      // 57a: invokevirtual java/lang/StringBuilder.length ()I
      // 57d: bipush 1
      // 57e: isub
      // 57f: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 582: iload 5
      // 584: ifeq 5c1
      // 587: goto 594
      // 58a: ldc2_w 2334627634080102789
      // 58d: lload 3
      // 58e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 593: athrow
      // 594: aload 17
      // 596: bipush 0
      // 597: invokevirtual java/lang/String.charAt (I)C
      // 59a: iload 7
      // 59c: goto 5a9
      // 59f: ldc2_w 2334627634080102789
      // 5a2: lload 3
      // 5a3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a8: athrow
      // 5a9: if_icmpeq 5c1
      // 5ac: aload 18
      // 5ae: aload 8
      // 5b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b3: pop
      // 5b4: goto 5c1
      // 5b7: ldc2_w 2334627634080102789
      // 5ba: lload 3
      // 5bb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c0: athrow
      // 5c1: aload 18
      // 5c3: aload 17
      // 5c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c8: pop
      // 5c9: aload 18
      // 5cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5ce: areturn
   }

   public static String i(Object[] var0) {
      long var2 = (Long)var0[0];
      File var5 = (File)var0[1];
      String var1 = (String)var0[2];
      yv var4 = (yv)var0[3];
      var2 = b ^ var2;
      long var6 = var2 ^ 127532568797738L;
      FileInputStream var8 = new FileInputStream(var5);
      long var10002 = (long)(m44.a<"r">(var8, -1708011262801966781L, var2) + b<"k">(11060, 5300806896401438112L ^ var2));
      Object[] var10006 = new Object[]{null, null, null, var6, var4};
      var10006[2] = var10002;
      var10006[1] = var1;
      var10006[0] = var8;
      return m44.a<"m">(var10006, -781516489204842229L, var2);
   }

   public static boolean a(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/sz
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/lqx.b J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 164602738685
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w 3929135680327956159
      // 02d: lload 2
      // 02e: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: sipush 8565
      // 036: ldc2_w 8802162650066678526
      // 039: lload 2
      // 03a: lxor
      // 03b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: astore 8
      // 042: istore 7
      // 044: aconst_null
      // 045: astore 9
      // 047: new java/io/PrintWriter
      // 04a: dup
      // 04b: new java/io/FileWriter
      // 04e: dup
      // 04f: aload 1
      // 050: invokespecial java/io/FileWriter.<init> (Ljava/lang/String;)V
      // 053: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 056: astore 9
      // 058: aload 9
      // 05a: aload 8
      // 05c: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 05f: aload 9
      // 061: iload 7
      // 063: ifne 06b
      // 066: ifnull 0f3
      // 069: aload 9
      // 06b: ldc2_w 3612614489794412629
      // 06e: lload 2
      // 06f: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: goto 0f3
      // 077: astore 10
      // 079: aload 4
      // 07b: iload 7
      // 07d: ifne 092
      // 080: ifnull 0a4
      // 083: goto 090
      // 086: ldc2_w 3128995126472782479
      // 089: lload 2
      // 08a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 4
      // 092: aload 10
      // 094: ldc2_w 3504279937949411392
      // 097: lload 2
      // 098: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: lload 5
      // 09f: dup2_x1
      // 0a0: pop2
      // 0a1: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 0a4: bipush 0
      // 0a5: istore 11
      // 0a7: aload 9
      // 0a9: iload 7
      // 0ab: ifne 0c0
      // 0ae: ifnull 0c9
      // 0b1: goto 0be
      // 0b4: ldc2_w 3128995126472782479
      // 0b7: lload 2
      // 0b8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 9
      // 0c0: ldc2_w 3612614489794412629
      // 0c3: lload 2
      // 0c4: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: iload 11
      // 0cb: ireturn
      // 0cc: astore 12
      // 0ce: aload 9
      // 0d0: iload 7
      // 0d2: ifne 0e7
      // 0d5: ifnull 0f0
      // 0d8: goto 0e5
      // 0db: ldc2_w 3128995126472782479
      // 0de: lload 2
      // 0df: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 9
      // 0e7: ldc2_w 3612614489794412629
      // 0ea: lload 2
      // 0eb: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: aload 12
      // 0f2: athrow
      // 0f3: aconst_null
      // 0f4: astore 10
      // 0f6: aconst_null
      // 0f7: astore 11
      // 0f9: new java/io/BufferedReader
      // 0fc: dup
      // 0fd: new java/io/FileReader
      // 100: dup
      // 101: aload 1
      // 102: invokespecial java/io/FileReader.<init> (Ljava/lang/String;)V
      // 105: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 108: astore 10
      // 10a: aload 10
      // 10c: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 10f: astore 11
      // 111: lload 2
      // 112: lconst_0
      // 113: lcmp
      // 114: iflt 139
      // 117: aload 10
      // 119: iload 7
      // 11b: ifne 130
      // 11e: ifnull 1d3
      // 121: goto 12e
      // 124: ldc2_w 3128995126472782479
      // 127: lload 2
      // 128: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 10
      // 130: ldc2_w 3315133734893788739
      // 133: lload 2
      // 134: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: goto 1d3
      // 13c: astore 12
      // 13e: goto 1d3
      // 141: astore 12
      // 143: aload 4
      // 145: iload 7
      // 147: ifne 15c
      // 14a: ifnull 16e
      // 14d: goto 15a
      // 150: ldc2_w 3128995126472782479
      // 153: lload 2
      // 154: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 4
      // 15c: aload 12
      // 15e: ldc2_w 3504279937949411392
      // 161: lload 2
      // 162: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: lload 5
      // 169: dup2_x1
      // 16a: pop2
      // 16b: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 16e: bipush 0
      // 16f: istore 13
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 199
      // 177: aload 10
      // 179: iload 7
      // 17b: ifne 190
      // 17e: ifnull 19e
      // 181: goto 18e
      // 184: ldc2_w 3128995126472782479
      // 187: lload 2
      // 188: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 10
      // 190: ldc2_w 3315133734893788739
      // 193: lload 2
      // 194: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: goto 19e
      // 19c: astore 14
      // 19e: iload 13
      // 1a0: ireturn
      // 1a1: astore 15
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 1cb
      // 1a9: aload 10
      // 1ab: iload 7
      // 1ad: ifne 1c2
      // 1b0: ifnull 1d0
      // 1b3: goto 1c0
      // 1b6: ldc2_w 3128995126472782479
      // 1b9: lload 2
      // 1ba: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: aload 10
      // 1c2: ldc2_w 3315133734893788739
      // 1c5: lload 2
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: goto 1d0
      // 1ce: astore 16
      // 1d0: aload 15
      // 1d2: athrow
      // 1d3: aload 11
      // 1d5: lload 2
      // 1d6: lconst_0
      // 1d7: lcmp
      // 1d8: ifle 1f2
      // 1db: iload 7
      // 1dd: ifne 1f2
      // 1e0: ifnull 210
      // 1e3: goto 1f0
      // 1e6: ldc2_w 3128995126472782479
      // 1e9: lload 2
      // 1ea: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: aload 8
      // 1f2: aload 11
      // 1f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f7: iload 7
      // 1f9: ifne 20d
      // 1fc: ifeq 210
      // 1ff: goto 20c
      // 202: ldc2_w 3128995126472782479
      // 205: lload 2
      // 206: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: bipush 1
      // 20d: goto 211
      // 210: bipush 0
      // 211: ireturn
   }

   public static boolean v(ZipFile param0, ZipEntry param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lqx.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 123949254548425
      // 0b: lxor
      // 0c: lstore 4
      // 0e: dup2
      // 0f: ldc2_w 55206988647746
      // 12: lxor
      // 13: lstore 6
      // 15: pop2
      // 16: ldc2_w 2379917980471435583
      // 19: lload 2
      // 1a: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: istore 8
      // 21: aload 1
      // 22: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 25: lload 6
      // 27: ldc2_w 4567709465842085358
      // 2a: lload 2
      // 2b: invokedynamic o (Ljava/lang/Object;JJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 8
      // 32: ifne 76
      // 35: ifeq 8f
      // 38: goto 45
      // 3b: ldc2_w 4389987790977541391
      // 3e: lload 2
      // 3f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: lload 4
      // 47: aload 0
      // 48: aload 1
      // 49: bipush 3
      // 4a: anewarray 281
      // 4d: dup_x1
      // 4e: swap
      // 4f: bipush 2
      // 50: swap
      // 51: aastore
      // 52: dup_x1
      // 53: swap
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x2
      // 58: dup_x2
      // 59: pop
      // 5a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d: bipush 0
      // 5e: swap
      // 5f: aastore
      // 60: ldc2_w 4065435057310683980
      // 63: lload 2
      // 64: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: goto 76
      // 6c: ldc2_w 4389987790977541391
      // 6f: lload 2
      // 70: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: iload 8
      // 78: ifne 8c
      // 7b: ifeq 8f
      // 7e: goto 8b
      // 81: ldc2_w 4389987790977541391
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 90
      // 8f: bipush 0
      // 90: ireturn
   }

   public static String u(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/lqx.b J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -265624519605715864
      // 1c: lload 2
      // 1d: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aconst_null
      // 23: astore 5
      // 25: istore 4
      // 27: aload 1
      // 28: ldc2_w -41584419677530605
      // 2b: lload 2
      // 2c: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: ldc2_w -159582572258395922
      // 34: lload 2
      // 35: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 5
      // 3c: goto 5f
      // 3f: astore 6
      // 41: aload 1
      // 42: sipush 26184
      // 45: ldc2_w 4838397084679339807
      // 48: lload 2
      // 49: lxor
      // 4a: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/lqx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ldc2_w -159582572258395922
      // 52: lload 2
      // 53: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: astore 5
      // 5a: goto 5f
      // 5d: astore 7
      // 5f: aload 5
      // 61: iload 4
      // 63: ifne 84
      // 66: ifnull 83
      // 69: goto 76
      // 6c: ldc2_w -2181084173113984936
      // 6f: lload 2
      // 70: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 5
      // 78: areturn
      // 79: ldc2_w -2181084173113984936
      // 7c: lload 2
      // 7d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: aload 1
      // 84: areturn
   }

   public static BufferedReader F(Object[] var0) {
      long var3 = (Long)var0[0];
      File var1 = (File)var0[1];
      sz var2 = (sz)var0[2];
      var3 = b ^ var3;
      long var5 = var3 ^ 59780922362844L;
      FileInputStream var10000 = new FileInputStream(var1);
      String var8 = (String)null;
      FileInputStream var9 = var10000;
      return m44.a<"k">(new Object[]{var5, var9, var8, var2}, -7969396586608723814L, var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30644;
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
            throw new RuntimeException("com/zelix/lqx", var10);
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
         throw new RuntimeException("com/zelix/lqx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6844;
      if (h[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lqx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/lqx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19284;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lqx", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/lqx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
