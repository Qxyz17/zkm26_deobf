package com.zelix;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sk {
   private InputStream a;
   private boolean Z;
   private ZipOutputStream W;
   private String B;
   private String E;
   private BufferedOutputStream N;
   private int C;
   private File f;
   private ByteArrayOutputStream d;
   private static final long b = ess.a(-4967118175732069886L, 2130491417449940995L, MethodHandles.lookup().lookupClass()).a(126372727188153L);
   private static final String[] c;
   private static final String[] e;
   private static final Map g = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;

   public OutputStream o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      String var4 = x44.a<"q">(-9111964150053024679L, var2);

      label20: {
         try {
            BufferedOutputStream var10000 = x44.a<"m">(this, -6968681518883272188L, var2);
            if (var4 != null) {
               return var10000;
            }

            if (var10000 != null) {
               break label20;
            }
         } catch (gj var6) {
            throw x44.a<"q">(var6, -7076820517758206917L, var2);
         }

         x44.a<"r">(this, new ByteArrayOutputStream(), -6982919201211662803L, var2);
         CheckedOutputStream var5 = new CheckedOutputStream(x44.a<"m">(this, -6982919201211662803L, var2), new CRC32());
         x44.a<"r">(this, new BufferedOutputStream(var5), -6968681518883272188L, var2);
      }

      x44.a<"r">(this, x44.a<"m">(this, -6957483402976494888L, var2) + "<", -6957483402976494888L, var2);
      return x44.a<"m">(this, -6968681518883272188L, var2);
   }

   public sk(ZipOutputStream var1, long var2, String var4, boolean var5, InputStream var6, int var7) {
      var2 = b ^ var2;
      super();
      x44.a<"v">(this, var1, -2071895959831329502L, var2);
      x44.a<"v">(this, var4, -2259480919961931406L, var2);
      x44.a<"v">(this, var5, -2080509858969291578L, var2);
      x44.a<"v">(this, var6, -2299097773886881821L, var2);
      x44.a<"v">(this, var7, -1852129693489637997L, var2);
      x44.a<"v">(this, a<"e">(19959, 2157173282539499796L ^ var2), -245943315124545220L, var2);
   }

   public sk(long var1, ZipOutputStream var3, String var4, boolean var5) {
      var1 = b ^ var1;
      super();
      x44.a<"w">(this, var3, 5054805988713652283L, var1);
      x44.a<"w">(this, var4, 5025406727147869291L, var1);
      x44.a<"w">(this, var5, 5060332493678006751L, var1);
      x44.a<"w">(this, a<"e">(25895, 5893332586312236248L ^ var1), 6453474657520204837L, var1);
   }

   public CRC32 Y(Object[] param1) {
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
      // 00e: checkcast java/lang/Long
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 6
      // 022: pop
      // 023: getstatic com/zelix/sk.b J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 89015817337754
      // 02e: lxor
      // 02f: dup2
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 7
      // 036: dup2
      // 037: bipush 32
      // 039: lshl
      // 03a: bipush 32
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 8
      // 040: pop2
      // 041: pop2
      // 042: ldc2_w 3688340382433771261
      // 045: lload 3
      // 046: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aconst_null
      // 04c: astore 12
      // 04e: astore 11
      // 050: new java/util/zip/ZipEntry
      // 053: dup
      // 054: aload 0
      // 055: ldc2_w 3595229940365959218
      // 058: lload 3
      // 059: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokespecial java/util/zip/ZipEntry.<init> (Ljava/lang/String;)V
      // 061: astore 13
      // 063: aload 2
      // 064: aload 11
      // 066: ifnonnull 097
      // 069: ifnull 095
      // 06c: goto 079
      // 06f: ldc2_w 3417748140657004191
      // 072: lload 3
      // 073: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 13
      // 07b: aload 2
      // 07c: invokevirtual java/lang/Long.longValue ()J
      // 07f: ldc2_w 3298751379059800832
      // 082: lload 3
      // 083: invokedynamic m (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w 3417748140657004191
      // 08e: lload 3
      // 08f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 5
      // 097: aload 11
      // 099: ifnonnull 0ae
      // 09c: ifnull 12c
      // 09f: goto 0ac
      // 0a2: ldc2_w 3417748140657004191
      // 0a5: lload 3
      // 0a6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 5
      // 0ae: ldc2_w 2890333648573051360
      // 0b1: lload 3
      // 0b2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: astore 14
      // 0b9: aload 14
      // 0bb: sipush 16596
      // 0be: ldc2_w 7587906890922372467
      // 0c1: lload 3
      // 0c2: lxor
      // 0c3: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/sk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: ldc2_w 3709605920132542040
      // 0cb: lload 3
      // 0cc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: astore 15
      // 0d3: aload 13
      // 0d5: lload 3
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 12e
      // 0db: aload 11
      // 0dd: ifnonnull 12e
      // 0e0: aload 15
      // 0e2: ldc2_w 3525860195567584070
      // 0e5: lload 3
      // 0e6: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 6
      // 0ed: ifnull 12c
      // 0f0: goto 0fd
      // 0f3: ldc2_w 3417748140657004191
      // 0f6: lload 3
      // 0f7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 6
      // 0ff: invokevirtual java/lang/String.length ()I
      // 102: ifle 12c
      // 105: goto 112
      // 108: ldc2_w 3417748140657004191
      // 10b: lload 3
      // 10c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: aload 13
      // 114: aload 6
      // 116: ldc2_w 3144114968938422333
      // 119: lload 3
      // 11a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: goto 12c
      // 122: ldc2_w 3417748140657004191
      // 125: lload 3
      // 126: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 13
      // 12e: aload 0
      // 12f: ldc2_w 3630164943641650566
      // 132: lload 3
      // 133: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: aload 11
      // 13a: ifnonnull 15a
      // 13d: ifeq 15d
      // 140: goto 14d
      // 143: ldc2_w 3417748140657004191
      // 146: lload 3
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: sipush 25561
      // 150: ldc2_w 1200989465446618336
      // 153: lload 3
      // 154: lxor
      // 155: invokedynamic z (IJ)I bsm=com/zelix/sk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: goto 15e
      // 15d: bipush 0
      // 15e: ldc2_w 3104108934752485257
      // 161: lload 3
      // 162: invokedynamic m (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: aload 0
      // 168: aload 11
      // 16a: lload 3
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: ifle 1d4
      // 170: ifnonnull 1d2
      // 173: ldc2_w 3630164943641650566
      // 176: lload 3
      // 177: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: ifeq 1c4
      // 17f: goto 18c
      // 182: ldc2_w 3417748140657004191
      // 185: lload 3
      // 186: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: aload 0
      // 18d: aload 11
      // 18f: lload 3
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 5a0
      // 195: ifnonnull 598
      // 198: goto 1a5
      // 19b: ldc2_w 3417748140657004191
      // 19e: lload 3
      // 19f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: ldc2_w 3293254012476427401
      // 1a8: lload 3
      // 1a9: lload 3
      // 1aa: lconst_0
      // 1ab: lcmp
      // 1ac: ifle 587
      // 1af: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/ByteArrayOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: ifnull 582
      // 1b7: goto 1c4
      // 1ba: ldc2_w 3417748140657004191
      // 1bd: lload 3
      // 1be: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: goto 1d2
      // 1c8: ldc2_w 3417748140657004191
      // 1cb: lload 3
      // 1cc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 11
      // 1d4: lload 3
      // 1d5: lconst_0
      // 1d6: lcmp
      // 1d7: ifle 391
      // 1da: ifnonnull 38f
      // 1dd: ldc2_w 3042176290506610077
      // 1e0: lload 3
      // 1e1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: ifnull 38e
      // 1e9: goto 1f6
      // 1ec: ldc2_w 3417748140657004191
      // 1ef: lload 3
      // 1f0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aconst_null
      // 1f7: astore 14
      // 1f9: new java/io/BufferedInputStream
      // 1fc: dup
      // 1fd: new java/io/FileInputStream
      // 200: dup
      // 201: aload 0
      // 202: ldc2_w 3042176290506610077
      // 205: lload 3
      // 206: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 20e: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 211: astore 14
      // 213: sipush 31118
      // 216: ldc2_w 2559011257089101493
      // 219: lload 3
      // 21a: lxor
      // 21b: invokedynamic z (IJ)I bsm=com/zelix/sk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: newarray 8
      // 222: astore 15
      // 224: lconst_0
      // 225: lstore 17
      // 227: new java/util/zip/CRC32
      // 22a: dup
      // 22b: invokespecial java/util/zip/CRC32.<init> ()V
      // 22e: astore 12
      // 230: aload 14
      // 232: aload 15
      // 234: ldc2_w 3770345655897622390
      // 237: lload 3
      // 238: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: dup
      // 23e: istore 16
      // 240: iflt 27e
      // 243: aload 12
      // 245: aload 15
      // 247: bipush 0
      // 248: iload 16
      // 24a: ldc2_w 3663606630970242012
      // 24d: lload 3
      // 24e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: lload 17
      // 255: iload 16
      // 257: i2l
      // 258: ladd
      // 259: lstore 17
      // 25b: aload 11
      // 25d: lload 3
      // 25e: lconst_0
      // 25f: lcmp
      // 260: ifle 268
      // 263: ifnonnull 2c1
      // 266: aload 11
      // 268: ifnull 230
      // 26b: lload 3
      // 26c: lconst_0
      // 26d: lcmp
      // 26e: ifle 25b
      // 271: goto 27e
      // 274: ldc2_w 3417748140657004191
      // 277: lload 3
      // 278: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: athrow
      // 27e: aload 14
      // 280: ldc2_w 3036463444228283637
      // 283: lload 3
      // 284: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: aload 13
      // 28b: aload 12
      // 28d: ldc2_w 3050101814954198354
      // 290: lload 3
      // 291: invokedynamic m (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: ldc2_w 3042812458302063150
      // 299: lload 3
      // 29a: invokedynamic m (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: aload 13
      // 2a1: lload 17
      // 2a3: ldc2_w 3586594825139838202
      // 2a6: lload 3
      // 2a7: invokedynamic m (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: aload 0
      // 2ad: ldc2_w 3638698612907971682
      // 2b0: lload 3
      // 2b1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: aload 13
      // 2b8: ldc2_w 3757539950671610093
      // 2bb: lload 3
      // 2bc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: new java/io/BufferedInputStream
      // 2c4: dup
      // 2c5: new java/io/FileInputStream
      // 2c8: dup
      // 2c9: aload 0
      // 2ca: ldc2_w 3042176290506610077
      // 2cd: lload 3
      // 2ce: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 2d6: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 2d9: astore 14
      // 2db: aload 14
      // 2dd: aload 15
      // 2df: ldc2_w 3770345655897622390
      // 2e2: lload 3
      // 2e3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: dup
      // 2e9: istore 16
      // 2eb: iflt 329
      // 2ee: aload 0
      // 2ef: ldc2_w 3638698612907971682
      // 2f2: lload 3
      // 2f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: aload 15
      // 2fa: bipush 0
      // 2fb: iload 16
      // 2fd: ldc2_w 3532857323688441337
      // 300: lload 3
      // 301: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: aload 11
      // 308: lload 3
      // 309: lconst_0
      // 30a: lcmp
      // 30b: ifle 313
      // 30e: ifnonnull 38b
      // 311: aload 11
      // 313: ifnull 2db
      // 316: lload 3
      // 317: lconst_0
      // 318: lcmp
      // 319: iflt 306
      // 31c: goto 329
      // 31f: ldc2_w 3417748140657004191
      // 322: lload 3
      // 323: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: athrow
      // 329: lload 3
      // 32a: lconst_0
      // 32b: lcmp
      // 32c: ifle 351
      // 32f: aload 14
      // 331: aload 11
      // 333: ifnonnull 348
      // 336: ifnull 38b
      // 339: goto 346
      // 33c: ldc2_w 3417748140657004191
      // 33f: lload 3
      // 340: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: athrow
      // 346: aload 14
      // 348: ldc2_w 3036463444228283637
      // 34b: lload 3
      // 34c: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: goto 38b
      // 354: astore 15
      // 356: goto 38b
      // 359: astore 19
      // 35b: lload 3
      // 35c: lconst_0
      // 35d: lcmp
      // 35e: iflt 383
      // 361: aload 14
      // 363: aload 11
      // 365: ifnonnull 37a
      // 368: ifnull 388
      // 36b: goto 378
      // 36e: ldc2_w 3417748140657004191
      // 371: lload 3
      // 372: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: athrow
      // 378: aload 14
      // 37a: ldc2_w 3036463444228283637
      // 37d: lload 3
      // 37e: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: goto 388
      // 386: astore 20
      // 388: aload 19
      // 38a: athrow
      // 38b: goto 7e3
      // 38e: aload 0
      // 38f: aload 11
      // 391: ifnonnull 3ee
      // 394: ldc2_w 3293254012476427401
      // 397: lload 3
      // 398: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/ByteArrayOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: ifnull 3ed
      // 3a0: goto 3ad
      // 3a3: ldc2_w 3417748140657004191
      // 3a6: lload 3
      // 3a7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: aload 0
      // 3ae: ldc2_w 3309609148176251040
      // 3b1: lload 3
      // 3b2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/BufferedOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b7: ldc2_w 3639339952658642947
      // 3ba: lload 3
      // 3bb: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: aload 0
      // 3c1: ldc2_w 3293254012476427401
      // 3c4: lload 3
      // 3c5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/ByteArrayOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: ldc2_w 3592631915678749664
      // 3cd: lload 3
      // 3ce: invokedynamic m (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: astore 14
      // 3d5: aload 0
      // 3d6: ldc2_w 3293254012476427401
      // 3d9: lload 3
      // 3da: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/ByteArrayOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: ldc2_w 3706662273755034748
      // 3e2: lload 3
      // 3e3: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e8: aload 11
      // 3ea: ifnull 509
      // 3ed: aload 0
      // 3ee: ldc2_w 3966419328879887571
      // 3f1: lload 3
      // 3f2: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: newarray 8
      // 3f9: astore 14
      // 3fb: bipush 0
      // 3fc: istore 15
      // 3fe: iload 15
      // 400: aload 0
      // 401: ldc2_w 3966419328879887571
      // 404: lload 3
      // 405: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: if_icmpge 477
      // 40d: aload 0
      // 40e: ldc2_w 3555471266455318179
      // 411: lload 3
      // 412: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: lload 3
      // 418: lconst_0
      // 419: lcmp
      // 41a: iflt 499
      // 41d: aload 11
      // 41f: ifnonnull 499
      // 422: aload 14
      // 424: iload 15
      // 426: sipush 18488
      // 429: ldc2_w 8729014357380546306
      // 42c: lload 3
      // 42d: lxor
      // 42e: invokedynamic z (IJ)I bsm=com/zelix/sk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 433: aload 0
      // 434: ldc2_w 3966419328879887571
      // 437: lload 3
      // 438: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43d: iload 15
      // 43f: isub
      // 440: ldc2_w 3521263579700077535
      // 443: lload 3
      // 444: invokedynamic u (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 449: ldc2_w 3242111706488603456
      // 44c: lload 3
      // 44d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 452: dup
      // 453: istore 16
      // 455: aload 11
      // 457: ifnonnull 513
      // 45a: bipush -1
      // 45b: if_icmpeq 477
      // 45e: goto 46b
      // 461: ldc2_w 3417748140657004191
      // 464: lload 3
      // 465: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46a: athrow
      // 46b: iload 15
      // 46d: iload 16
      // 46f: iadd
      // 470: istore 15
      // 472: aload 11
      // 474: ifnull 3fe
      // 477: aload 0
      // 478: lload 3
      // 479: lconst_0
      // 47a: lcmp
      // 47b: ifle 40e
      // 47e: aload 11
      // 480: ifnonnull 50a
      // 483: ldc2_w 3555471266455318179
      // 486: lload 3
      // 487: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48c: goto 499
      // 48f: ldc2_w 3417748140657004191
      // 492: lload 3
      // 493: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 498: athrow
      // 499: lload 3
      // 49a: lconst_0
      // 49b: lcmp
      // 49c: ifle 4ac
      // 49f: ifnull 509
      // 4a2: aload 0
      // 4a3: ldc2_w 3555471266455318179
      // 4a6: lload 3
      // 4a7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: ldc2_w 3143470187944793478
      // 4af: lload 3
      // 4b0: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b5: goto 509
      // 4b8: ldc2_w 3417748140657004191
      // 4bb: lload 3
      // 4bc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c1: athrow
      // 4c2: astore 15
      // 4c4: goto 509
      // 4c7: astore 21
      // 4c9: lload 3
      // 4ca: lconst_0
      // 4cb: lcmp
      // 4cc: iflt 501
      // 4cf: aload 0
      // 4d0: ldc2_w 3555471266455318179
      // 4d3: lload 3
      // 4d4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d9: aload 11
      // 4db: ifnonnull 4f8
      // 4de: ifnull 506
      // 4e1: goto 4ee
      // 4e4: ldc2_w 3417748140657004191
      // 4e7: lload 3
      // 4e8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: athrow
      // 4ee: aload 0
      // 4ef: ldc2_w 3555471266455318179
      // 4f2: lload 3
      // 4f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f8: ldc2_w 3143470187944793478
      // 4fb: lload 3
      // 4fc: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: goto 506
      // 504: astore 22
      // 506: aload 21
      // 508: athrow
      // 509: aload 0
      // 50a: ldc2_w 3630164943641650566
      // 50d: lload 3
      // 50e: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 513: ifne 551
      // 516: new java/util/zip/CRC32
      // 519: dup
      // 51a: invokespecial java/util/zip/CRC32.<init> ()V
      // 51d: astore 12
      // 51f: aload 12
      // 521: aload 14
      // 523: ldc2_w 3043364726671615744
      // 526: lload 3
      // 527: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52c: aload 13
      // 52e: aload 12
      // 530: ldc2_w 3050101814954198354
      // 533: lload 3
      // 534: invokedynamic m (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 539: ldc2_w 3042812458302063150
      // 53c: lload 3
      // 53d: invokedynamic m (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 542: aload 13
      // 544: aload 14
      // 546: arraylength
      // 547: i2l
      // 548: ldc2_w 3586594825139838202
      // 54b: lload 3
      // 54c: invokedynamic m (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 551: aload 0
      // 552: ldc2_w 3638698612907971682
      // 555: lload 3
      // 556: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: aload 13
      // 55d: ldc2_w 3757539950671610093
      // 560: lload 3
      // 561: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 566: aload 0
      // 567: ldc2_w 3638698612907971682
      // 56a: lload 3
      // 56b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 570: aload 14
      // 572: bipush 0
      // 573: aload 14
      // 575: arraylength
      // 576: ldc2_w 3532857323688441337
      // 579: lload 3
      // 57a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57f: goto 7e3
      // 582: aload 0
      // 583: ldc2_w 3638698612907971682
      // 586: lload 3
      // 587: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58c: aload 13
      // 58e: ldc2_w 3757539950671610093
      // 591: lload 3
      // 592: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 597: aload 0
      // 598: lload 3
      // 599: lconst_0
      // 59a: lcmp
      // 59b: ifle 5ca
      // 59e: aload 11
      // 5a0: ifnonnull 5ca
      // 5a3: ldc2_w 3555471266455318179
      // 5a6: lload 3
      // 5a7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ac: ifnonnull 6d1
      // 5af: goto 5bc
      // 5b2: ldc2_w 3417748140657004191
      // 5b5: lload 3
      // 5b6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bb: athrow
      // 5bc: aload 0
      // 5bd: goto 5ca
      // 5c0: ldc2_w 3417748140657004191
      // 5c3: lload 3
      // 5c4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c9: athrow
      // 5ca: ldc2_w 3042176290506610077
      // 5cd: lload 3
      // 5ce: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d3: new java/lang/StringBuilder
      // 5d6: dup
      // 5d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 5da: ldc "("
      // 5dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5df: aload 0
      // 5e0: ldc2_w 3555471266455318179
      // 5e3: lload 3
      // 5e4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e9: ifnonnull 5fa
      // 5ec: bipush 1
      // 5ed: goto 5fb
      // 5f0: ldc2_w 3417748140657004191
      // 5f3: lload 3
      // 5f4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f9: athrow
      // 5fa: bipush 0
      // 5fb: lload 3
      // 5fc: lconst_0
      // 5fd: lcmp
      // 5fe: iflt 61d
      // 601: ldc2_w 3342196967373788166
      // 604: lload 3
      // 605: invokedynamic m (Ljava/lang/Object;ZJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60a: ldc ","
      // 60c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60f: aload 0
      // 610: ldc2_w 3293254012476427401
      // 613: lload 3
      // 614: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/ByteArrayOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 619: ifnonnull 62a
      // 61c: bipush 1
      // 61d: goto 62b
      // 620: ldc2_w 3417748140657004191
      // 623: lload 3
      // 624: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 629: athrow
      // 62a: bipush 0
      // 62b: ldc2_w 3342196967373788166
      // 62e: lload 3
      // 62f: invokedynamic m (Ljava/lang/Object;ZJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 634: sipush 6531
      // 637: ldc2_w 8522002747783476258
      // 63a: lload 3
      // 63b: lxor
      // 63c: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/sk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 641: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 644: aload 0
      // 645: ldc2_w 3302932232689633404
      // 648: lload 3
      // 649: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 651: sipush 29095
      // 654: ldc2_w 5927226565139045381
      // 657: lload 3
      // 658: lxor
      // 659: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/sk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 661: aload 0
      // 662: ldc2_w 3630164943641650566
      // 665: lload 3
      // 666: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66b: ldc2_w 3342196967373788166
      // 66e: lload 3
      // 66f: invokedynamic m (Ljava/lang/Object;ZJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: ldc ")"
      // 676: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 679: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67c: astore 9
      // 67e: astore 10
      // 680: iload 7
      // 682: aload 10
      // 684: iload 8
      // 686: aload 9
      // 688: bipush 4
      // 689: anewarray 124
      // 68c: dup_x1
      // 68d: swap
      // 68e: bipush 3
      // 68f: swap
      // 690: aastore
      // 691: dup_x1
      // 692: swap
      // 693: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 696: bipush 2
      // 697: swap
      // 698: aastore
      // 699: dup_x1
      // 69a: swap
      // 69b: bipush 1
      // 69c: swap
      // 69d: aastore
      // 69e: dup_x1
      // 69f: swap
      // 6a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6a3: bipush 0
      // 6a4: swap
      // 6a5: aastore
      // 6a6: ldc2_w 3718505859822525257
      // 6a9: lload 3
      // 6aa: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6af: aload 0
      // 6b0: new java/io/BufferedInputStream
      // 6b3: dup
      // 6b4: new java/io/FileInputStream
      // 6b7: dup
      // 6b8: aload 0
      // 6b9: ldc2_w 3042176290506610077
      // 6bc: lload 3
      // 6bd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c2: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 6c5: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 6c8: ldc2_w 3555471266455318179
      // 6cb: lload 3
      // 6cc: invokedynamic v (Ljava/lang/Object;Ljava/io/InputStream;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d1: new java/util/zip/CRC32
      // 6d4: dup
      // 6d5: invokespecial java/util/zip/CRC32.<init> ()V
      // 6d8: astore 12
      // 6da: sipush 24194
      // 6dd: ldc2_w 787382989821094330
      // 6e0: lload 3
      // 6e1: lxor
      // 6e2: invokedynamic z (IJ)I bsm=com/zelix/sk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e7: newarray 8
      // 6e9: astore 14
      // 6eb: aload 0
      // 6ec: ldc2_w 3555471266455318179
      // 6ef: lload 3
      // 6f0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f5: aload 14
      // 6f7: ldc2_w 3026773065719812019
      // 6fa: lload 3
      // 6fb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 700: dup
      // 701: istore 15
      // 703: iflt 751
      // 706: aload 0
      // 707: ldc2_w 3638698612907971682
      // 70a: lload 3
      // 70b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 710: aload 14
      // 712: bipush 0
      // 713: iload 15
      // 715: ldc2_w 3532857323688441337
      // 718: lload 3
      // 719: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71e: aload 12
      // 720: lload 3
      // 721: lconst_0
      // 722: lcmp
      // 723: ifle 80b
      // 726: aload 14
      // 728: bipush 0
      // 729: iload 15
      // 72b: ldc2_w 3663606630970242012
      // 72e: lload 3
      // 72f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 734: aload 11
      // 736: ifnonnull 809
      // 739: aload 11
      // 73b: ifnull 6eb
      // 73e: lload 3
      // 73f: lconst_0
      // 740: lcmp
      // 741: iflt 734
      // 744: goto 751
      // 747: ldc2_w 3417748140657004191
      // 74a: lload 3
      // 74b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 750: athrow
      // 751: lload 3
      // 752: lconst_0
      // 753: lcmp
      // 754: iflt 809
      // 757: aload 0
      // 758: aload 11
      // 75a: ifnonnull 7f7
      // 75d: ldc2_w 3555471266455318179
      // 760: lload 3
      // 761: lload 3
      // 762: lconst_0
      // 763: lcmp
      // 764: ifle 7e8
      // 767: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76c: ifnull 7e3
      // 76f: goto 77c
      // 772: ldc2_w 3417748140657004191
      // 775: lload 3
      // 776: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77b: athrow
      // 77c: aload 0
      // 77d: ldc2_w 3555471266455318179
      // 780: lload 3
      // 781: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 786: ldc2_w 3143470187944793478
      // 789: lload 3
      // 78a: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78f: goto 7e3
      // 792: ldc2_w 3417748140657004191
      // 795: lload 3
      // 796: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79b: athrow
      // 79c: astore 14
      // 79e: goto 7e3
      // 7a1: astore 23
      // 7a3: lload 3
      // 7a4: lconst_0
      // 7a5: lcmp
      // 7a6: ifle 7db
      // 7a9: aload 0
      // 7aa: ldc2_w 3555471266455318179
      // 7ad: lload 3
      // 7ae: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b3: aload 11
      // 7b5: ifnonnull 7d2
      // 7b8: ifnull 7e0
      // 7bb: goto 7c8
      // 7be: ldc2_w 3417748140657004191
      // 7c1: lload 3
      // 7c2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c7: athrow
      // 7c8: aload 0
      // 7c9: ldc2_w 3555471266455318179
      // 7cc: lload 3
      // 7cd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d2: ldc2_w 3143470187944793478
      // 7d5: lload 3
      // 7d6: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7db: goto 7e0
      // 7de: astore 24
      // 7e0: aload 23
      // 7e2: athrow
      // 7e3: aload 0
      // 7e4: ldc2_w 3638698612907971682
      // 7e7: lload 3
      // 7e8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ed: ldc2_w 3579832817729705871
      // 7f0: lload 3
      // 7f1: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f6: aload 0
      // 7f7: ldc2_w 3638698612907971682
      // 7fa: lload 3
      // 7fb: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 800: ldc2_w 3464543770951501369
      // 803: lload 3
      // 804: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 809: aload 12
      // 80b: areturn
   }

   public sk(ZipOutputStream var1, String var2, long var3, boolean var5, File var6) {
      var3 = b ^ var3;
      super();
      x44.a<"t">(this, var1, 8062906648051337720L, var3);
      x44.a<"t">(this, var2, 7817863477996223912L, var3);
      x44.a<"t">(this, var5, 8068933433448757276L, var3);
      x44.a<"t">(this, var6, 8623699268536453127L, var3);
      x44.a<"t">(this, a<"e">(20397, 2542800555521605527L ^ var3), 8091891701075744230L, var3);
   }

   public CRC32 v(Object[] var1) {
      Long var5 = (Long)var1[0];
      Long var2 = (Long)var1[1];
      long var3 = (Long)var1[2];
      var3 = b ^ var3;
      long var6 = var3 ^ 52058576000990L;
      return x44.a<"i">(this, new Object[]{var6, var5, var2, null}, -193107374519452535L, var3);
   }

   public CRC32 l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 112051666109782L;
      return x44.a<"m">(this, new Object[]{null, null, var4}, 8728114804084144444L, var2);
   }

   public CRC32 R(Object[] var1) {
      Long var2 = (Long)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 121464619757670L;
      return x44.a<"m">(this, new Object[]{var2, null, var5}, 5481010188636998668L, var3);
   }

   static {
      long var11 = b ^ 46480434418303L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "\u0081ý\u0011\u008b×%{Îñ\u0011CÓ\u0084§5(\u0010Þ|È^¡àªÝ.\u001f\u008aËptï~\u0010(ë¬{sL\u0088É\u0017 ¹Ä\u0091\u0092îD\u00107\u008f&«\u007f\u0089¢ÉôÄ@\u0003ød\u0011ª";
      int var19 = "\u0081ý\u0011\u008b×%{Îñ\u0011CÓ\u0084§5(\u0010Þ|È^¡àªÝ.\u001f\u008aËptï~\u0010(ë¬{sL\u0088É\u0017 ¹Ä\u0091\u0092îD\u00107\u008f&«\u007f\u0089¢ÉôÄ@\u0003ød\u0011ª"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     c = var20;
                     e = new String[6];
                     j = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "¬èÁ\u0099\t4\u009eNÃ{\u0085,\u0003Æ|h";
                     int var5 = "¬èÁ\u0099\t4\u009eNÃ{\u0085,\u0003Æ|h".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    h = var6;
                                    i = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "q\u0015¡Ô\u000e½×ö?\u0011â^p\u0092\u0091\u0013";
                                 var5 = "q\u0015¡Ô\u000e½×ö?\u0011â^p\u0092\u0091\u0013".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "\u0013\u0011P«RYÎ0\u0013o¹\u008aMÆ\u001d\u000f\u0010J¹\u0098r^KH\u0002\u008f\u0012JJ¯\u0018Ýy";
                  var19 = "\u0013\u0011P«RYÎ0\u0013o¹\u008aMÆ\u001d\u000f\u0010J¹\u0098r^KH\u0002\u008f\u0012JJ¯\u0018Ýy".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19517;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/sk", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/sk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22182;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/sk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("com/zelix/sk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
