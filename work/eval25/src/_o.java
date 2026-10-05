package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o {
   private static String o;
   private static final long a = ess.a(8909758689069309432L, -2938540597727864264L, MethodHandles.lookup().lookupClass()).a(82611826355853L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _o(
      ZipFile var1,
      ZipEntry var2,
      Long var3,
      char var4,
      wp var5,
      wp var6,
      wp var7,
      String var8,
      int var9,
      ZipOutputStream var10,
      vm var11,
      short var12,
      boolean var13,
      _8s var14,
      pg var15
   ) {
      long var16 = ((long)var4 << 48 | (long)var9 << 32 >>> 16 | (long)var12 << 48 >>> 48) ^ a;
      long var18 = var16 ^ 136570633194761L;
      long var20 = var16 ^ 65190383329000L;
      long var22 = var16 ^ 44541336275956L;
      long var24 = var16 ^ 9138599465745L;
      long var26 = var16 ^ 55921950597690L;
      long var28 = var16 ^ 100412966706693L;
      super();
      String var10000 = x44.a<"w">(-7742732091370804576L, var16);
      InputStream var31 = null;
      String var30 = var10000;
      boolean var40 = false /* VF: Semaphore variable */;

      try {
         var40 = true;
         var31 = x44.a<"o">(var1, var2, -7808838286412915852L, var16);
         String var32 = x44.a<"o">(var11, new Object[]{var24, var2.getName()}, -8375515938914289840L, var16);
         sk var33 = new sk(var18, var10, var32, var13);
         OutputStream var10001 = x44.a<"o">(var33, new Object[]{var22}, -7972869990619412933L, var16);
         int var10004 = var5.C(var26);
         int var10005 = var6.C(var26);
         Object[] var10011 = new Object[]{null, null, null, null, null, null, var7.C(var26), var2.getName(), var14, var15};
         var10011[5] = var10005;
         var10011[4] = var10004;
         var10011[3] = var28;
         var10011[2] = var8;
         var10011[1] = var10001;
         var10011[0] = var31;
         x44.a<"w">(var10011, -7873874783352503826L, var16);
         x44.a<"o">(var33, new Object[]{var3, var20}, -8598783309047855661L, var16);
         var40 = false;
      } finally {
         if (var40) {
            try {
               label61: {
                  label60: {
                     try {
                        var47 = var31;
                        if (var30 != null) {
                           break label60;
                        }

                        if (var31 == null) {
                           break label61;
                        }
                     } catch (IOException var41) {
                        throw x44.a<"w">(var41, -8619884612674797791L, var16);
                     }

                     var47 = var31;
                  }

                  x44.a<"o">(var47, -7535160073431127692L, var16);
               }
            } catch (IOException var42) {
            }
         }
      }

      try {
         InputStream var48 = var31;
         if (var30 == null) {
            if (var31 == null) {
               return;
            }

            var48 = var31;
         }

         x44.a<"o">(var48, -7535160073431127692L, var16);
      } catch (IOException var44) {
      }
   }

   public static void D(String var0) {
      o = var0;
   }

   private static void S(Object[] param0) {
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
      // 007: astore 11
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/io/OutputStream
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/String
      // 017: astore 10
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 1
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 6
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Integer
      // 034: invokevirtual java/lang/Integer.intValue ()I
      // 037: istore 8
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast java/lang/Integer
      // 040: invokevirtual java/lang/Integer.intValue ()I
      // 043: istore 9
      // 045: dup
      // 046: bipush 7
      // 048: aaload
      // 049: checkcast java/lang/String
      // 04c: astore 3
      // 04d: dup
      // 04e: bipush 8
      // 050: aaload
      // 051: checkcast com/zelix/_8s
      // 054: astore 7
      // 056: dup
      // 057: bipush 9
      // 059: aaload
      // 05a: checkcast com/zelix/pg
      // 05d: astore 4
      // 05f: pop
      // 060: getstatic com/zelix/_o.a J
      // 063: lload 1
      // 064: lxor
      // 065: lstore 1
      // 066: lload 1
      // 067: dup2
      // 068: ldc2_w 80807533516486
      // 06b: lxor
      // 06c: lstore 12
      // 06e: dup2
      // 06f: ldc2_w 40947284516173
      // 072: lxor
      // 073: lstore 14
      // 075: dup2
      // 076: ldc2_w 125118874948062
      // 079: lxor
      // 07a: lstore 16
      // 07c: dup2
      // 07d: ldc2_w 20990961548679
      // 080: lxor
      // 081: lstore 18
      // 083: pop2
      // 084: ldc2_w -586255498704451087
      // 087: lload 1
      // 088: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: lload 18
      // 08f: aload 11
      // 091: iload 6
      // 093: bipush 3
      // 094: anewarray 267
      // 097: dup_x1
      // 098: swap
      // 099: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09c: bipush 2
      // 09d: swap
      // 09e: aastore
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 1
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w -864180593279859204
      // 0b0: lload 1
      // 0b1: invokedynamic v (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: pop
      // 0b7: astore 20
      // 0b9: aconst_null
      // 0ba: astore 21
      // 0bc: aconst_null
      // 0bd: astore 22
      // 0bf: aconst_null
      // 0c0: astore 23
      // 0c2: new java/io/BufferedReader
      // 0c5: dup
      // 0c6: new java/io/InputStreamReader
      // 0c9: dup
      // 0ca: aload 11
      // 0cc: aload 10
      // 0ce: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0d1: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0d4: astore 21
      // 0d6: new java/io/ByteArrayOutputStream
      // 0d9: dup
      // 0da: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 0dd: astore 22
      // 0df: new java/io/PrintWriter
      // 0e2: dup
      // 0e3: new java/io/BufferedWriter
      // 0e6: dup
      // 0e7: new java/io/OutputStreamWriter
      // 0ea: dup
      // 0eb: aload 22
      // 0ed: aload 10
      // 0ef: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 0f2: invokespecial java/io/BufferedWriter.<init> (Ljava/io/Writer;)V
      // 0f5: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 0f8: astore 23
      // 0fa: aload 21
      // 0fc: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0ff: dup
      // 100: astore 24
      // 102: ifnull 3de
      // 105: lload 14
      // 107: aload 24
      // 109: bipush 0
      // 10a: bipush 3
      // 10b: anewarray 267
      // 10e: dup_x1
      // 10f: swap
      // 110: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 113: bipush 2
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w -912458403204133151
      // 127: lload 1
      // 128: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: istore 25
      // 12f: new java/lang/StringBuilder
      // 132: dup
      // 133: aload 24
      // 135: invokevirtual java/lang/String.length ()I
      // 138: invokespecial java/lang/StringBuilder.<init> (I)V
      // 13b: astore 26
      // 13d: aload 20
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 14a
      // 145: ifnonnull 3ef
      // 148: aload 20
      // 14a: lload 1
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: iflt 194
      // 150: ifnonnull 18d
      // 153: goto 160
      // 156: ldc2_w -1499279727450334096
      // 159: lload 1
      // 15a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: iload 25
      // 162: ifle 1a1
      // 165: goto 172
      // 168: ldc2_w -1499279727450334096
      // 16b: lload 1
      // 16c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: aload 26
      // 174: aload 24
      // 176: bipush 0
      // 177: iload 25
      // 179: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: pop
      // 180: goto 18d
      // 183: ldc2_w -1499279727450334096
      // 186: lload 1
      // 187: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: aload 24
      // 18f: iload 25
      // 191: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 194: astore 27
      // 196: aload 20
      // 198: lload 1
      // 199: lconst_0
      // 19a: lcmp
      // 19b: iflt 1a7
      // 19e: ifnull 1a5
      // 1a1: aload 24
      // 1a3: astore 27
      // 1a5: aload 27
      // 1a7: ldc2_w -1196238751548735729
      // 1aa: lload 1
      // 1ab: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: aload 20
      // 1b2: ifnonnull 1e3
      // 1b5: ifeq 1dd
      // 1b8: goto 1c5
      // 1bb: ldc2_w -1499279727450334096
      // 1be: lload 1
      // 1bf: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 20
      // 1c7: lload 1
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: iflt 102
      // 1cd: ifnull 0fa
      // 1d0: goto 1dd
      // 1d3: ldc2_w -1499279727450334096
      // 1d6: lload 1
      // 1d7: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 27
      // 1df: bipush 0
      // 1e0: invokevirtual java/lang/String.charAt (I)C
      // 1e3: sipush 12510
      // 1e6: ldc2_w 342881793327150251
      // 1e9: lload 1
      // 1ea: lxor
      // 1eb: invokedynamic m (IJ)I bsm=com/zelix/_o.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: aload 20
      // 1f2: ifnonnull 22a
      // 1f5: if_icmpeq 22d
      // 1f8: aload 27
      // 1fa: bipush 0
      // 1fb: invokevirtual java/lang/String.charAt (I)C
      // 1fe: aload 20
      // 200: ifnonnull 25b
      // 203: goto 210
      // 206: ldc2_w -1499279727450334096
      // 209: lload 1
      // 20a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: sipush 4062
      // 213: ldc2_w 6113918579317148586
      // 216: lload 1
      // 217: lxor
      // 218: invokedynamic m (IJ)I bsm=com/zelix/_o.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: goto 22a
      // 220: ldc2_w -1499279727450334096
      // 223: lload 1
      // 224: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: if_icmpne 24d
      // 22d: aload 26
      // 22f: aload 27
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: pop
      // 235: aload 20
      // 237: lload 1
      // 238: lconst_0
      // 239: lcmp
      // 23a: iflt 3db
      // 23d: ifnull 3c9
      // 240: goto 24d
      // 243: ldc2_w -1499279727450334096
      // 246: lload 1
      // 247: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: bipush 0
      // 24e: goto 25b
      // 251: ldc2_w -1499279727450334096
      // 254: lload 1
      // 255: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: istore 28
      // 25d: aconst_null
      // 25e: astore 29
      // 260: new java/util/StringTokenizer
      // 263: dup
      // 264: aload 27
      // 266: getstatic com/zelix/_o.b Ljava/lang/String;
      // 269: bipush 1
      // 26a: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 26d: astore 30
      // 26f: aload 30
      // 271: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 274: ifeq 3c9
      // 277: aload 30
      // 279: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 27c: astore 31
      // 27e: aload 31
      // 280: invokevirtual java/lang/String.length ()I
      // 283: istore 32
      // 285: iload 32
      // 287: aload 20
      // 289: ifnonnull 31f
      // 28c: bipush 1
      // 28d: aload 20
      // 28f: ifnonnull 1f0
      // 292: lload 1
      // 293: lconst_0
      // 294: lcmp
      // 295: ifle 1e6
      // 298: goto 2a5
      // 29b: ldc2_w -1499279727450334096
      // 29e: lload 1
      // 29f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: athrow
      // 2a5: if_icmpne 310
      // 2a8: aload 31
      // 2aa: ldc ":"
      // 2ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2af: aload 20
      // 2b1: ifnonnull 2fb
      // 2b4: goto 2c1
      // 2b7: ldc2_w -1499279727450334096
      // 2ba: lload 1
      // 2bb: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: athrow
      // 2c1: ifne 2fa
      // 2c4: goto 2d1
      // 2c7: ldc2_w -1499279727450334096
      // 2ca: lload 1
      // 2cb: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: aload 31
      // 2d3: ldc "="
      // 2d5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d8: aload 20
      // 2da: ifnonnull 2fb
      // 2dd: goto 2ea
      // 2e0: ldc2_w -1499279727450334096
      // 2e3: lload 1
      // 2e4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: athrow
      // 2ea: ifeq 2fd
      // 2ed: goto 2fa
      // 2f0: ldc2_w -1499279727450334096
      // 2f3: lload 1
      // 2f4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: athrow
      // 2fa: bipush 1
      // 2fb: istore 28
      // 2fd: aload 26
      // 2ff: aload 31
      // 301: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 304: pop
      // 305: aload 20
      // 307: lload 1
      // 308: lconst_0
      // 309: lcmp
      // 30a: ifle 3c6
      // 30d: ifnull 3c0
      // 310: iload 28
      // 312: goto 31f
      // 315: ldc2_w -1499279727450334096
      // 318: lload 1
      // 319: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: ifeq 3ab
      // 322: aload 31
      // 324: bipush 1
      // 325: anewarray 267
      // 328: dup_x1
      // 329: swap
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w -883317634182892043
      // 330: lload 1
      // 331: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: astore 33
      // 338: aload 33
      // 33a: aload 7
      // 33c: lload 12
      // 33e: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 341: checkcast java/lang/String
      // 344: astore 34
      // 346: aload 20
      // 348: lload 1
      // 349: lconst_0
      // 34a: lcmp
      // 34b: ifle 382
      // 34e: ifnonnull 380
      // 351: aload 33
      // 353: aload 34
      // 355: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 358: ifne 38b
      // 35b: goto 368
      // 35e: ldc2_w -1499279727450334096
      // 361: lload 1
      // 362: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: athrow
      // 368: aload 26
      // 36a: aload 34
      // 36c: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 372: pop
      // 373: goto 380
      // 376: ldc2_w -1499279727450334096
      // 379: lload 1
      // 37a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: athrow
      // 380: aload 20
      // 382: lload 1
      // 383: lconst_0
      // 384: lcmp
      // 385: ifle 3a2
      // 388: ifnull 3a0
      // 38b: aload 26
      // 38d: aload 31
      // 38f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 392: pop
      // 393: goto 3a0
      // 396: ldc2_w -1499279727450334096
      // 399: lload 1
      // 39a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: aload 20
      // 3a2: lload 1
      // 3a3: lconst_0
      // 3a4: lcmp
      // 3a5: iflt 3c6
      // 3a8: ifnull 3c0
      // 3ab: aload 26
      // 3ad: aload 31
      // 3af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b2: pop
      // 3b3: goto 3c0
      // 3b6: ldc2_w -1499279727450334096
      // 3b9: lload 1
      // 3ba: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: athrow
      // 3c0: aload 31
      // 3c2: astore 29
      // 3c4: aload 20
      // 3c6: ifnull 26f
      // 3c9: aload 23
      // 3cb: aload 26
      // 3cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d0: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3d3: aload 20
      // 3d5: lload 1
      // 3d6: lconst_0
      // 3d7: lcmp
      // 3d8: iflt 237
      // 3db: ifnull 0fa
      // 3de: aload 23
      // 3e0: ldc2_w -824945848179505372
      // 3e3: lload 1
      // 3e4: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: lload 1
      // 3ea: lconst_0
      // 3eb: lcmp
      // 3ec: ifle 3ef
      // 3ef: aconst_null
      // 3f0: astore 23
      // 3f2: aload 22
      // 3f4: ldc2_w -1263105175185355709
      // 3f7: lload 1
      // 3f8: invokedynamic n (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: astore 25
      // 3ff: aload 4
      // 401: lload 16
      // 403: aload 25
      // 405: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 408: aload 5
      // 40a: aload 25
      // 40c: ldc2_w -1002440846332700837
      // 40f: lload 1
      // 410: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 415: aload 5
      // 417: ldc2_w -1173102582054623920
      // 41a: lload 1
      // 41b: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: lload 1
      // 421: lconst_0
      // 422: lcmp
      // 423: ifle 43b
      // 426: aload 21
      // 428: aload 20
      // 42a: ifnonnull 432
      // 42d: ifnull 440
      // 430: aload 21
      // 432: ldc2_w -1004971796077638355
      // 435: lload 1
      // 436: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: goto 440
      // 43e: astore 24
      // 440: aload 23
      // 442: aload 20
      // 444: ifnonnull 459
      // 447: ifnull 462
      // 44a: goto 457
      // 44d: ldc2_w -1499279727450334096
      // 450: lload 1
      // 451: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: aload 23
      // 459: ldc2_w -824945848179505372
      // 45c: lload 1
      // 45d: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 462: aload 22
      // 464: aload 20
      // 466: ifnonnull 47b
      // 469: ifnull 484
      // 46c: goto 479
      // 46f: ldc2_w -1499279727450334096
      // 472: lload 1
      // 473: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: athrow
      // 479: aload 22
      // 47b: ldc2_w -1381568747166274593
      // 47e: lload 1
      // 47f: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: goto 507
      // 487: astore 24
      // 489: goto 507
      // 48c: astore 35
      // 48e: lload 1
      // 48f: lconst_0
      // 490: lcmp
      // 491: iflt 4b6
      // 494: aload 21
      // 496: aload 20
      // 498: ifnonnull 4ad
      // 49b: ifnull 4bb
      // 49e: goto 4ab
      // 4a1: ldc2_w -1499279727450334096
      // 4a4: lload 1
      // 4a5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4aa: athrow
      // 4ab: aload 21
      // 4ad: ldc2_w -1004971796077638355
      // 4b0: lload 1
      // 4b1: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b6: goto 4bb
      // 4b9: astore 36
      // 4bb: aload 23
      // 4bd: aload 20
      // 4bf: ifnonnull 4d4
      // 4c2: ifnull 4dd
      // 4c5: goto 4d2
      // 4c8: ldc2_w -1499279727450334096
      // 4cb: lload 1
      // 4cc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d1: athrow
      // 4d2: aload 23
      // 4d4: ldc2_w -824945848179505372
      // 4d7: lload 1
      // 4d8: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4dd: aload 22
      // 4df: aload 20
      // 4e1: ifnonnull 4f6
      // 4e4: ifnull 4ff
      // 4e7: goto 4f4
      // 4ea: ldc2_w -1499279727450334096
      // 4ed: lload 1
      // 4ee: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: athrow
      // 4f4: aload 22
      // 4f6: ldc2_w -1381568747166274593
      // 4f9: lload 1
      // 4fa: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: goto 504
      // 502: astore 36
      // 504: aload 35
      // 506: athrow
      // 507: return
   }

   public _o(char param1, File param2, wp param3, wp param4, short param5, int param6, wp param7, String param8, File param9, _8s param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 5
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 32
      // 014: lshl
      // 015: bipush 32
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_o.a J
      // 01c: lxor
      // 01d: lstore 11
      // 01f: lload 11
      // 021: dup2
      // 022: ldc2_w 138036226944251
      // 025: lxor
      // 026: lstore 13
      // 028: dup2
      // 029: ldc2_w 85257579878867
      // 02c: lxor
      // 02d: lstore 15
      // 02f: dup2
      // 030: ldc2_w 22009550721220
      // 033: lxor
      // 034: lstore 17
      // 036: pop2
      // 037: aload 0
      // 038: invokespecial java/lang/Object.<init> ()V
      // 03b: ldc2_w 6506863053040428129
      // 03e: lload 11
      // 040: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aconst_null
      // 046: astore 20
      // 048: aconst_null
      // 049: astore 21
      // 04b: astore 19
      // 04d: aload 9
      // 04f: ldc2_w 6910452904252276507
      // 052: lload 11
      // 054: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: astore 22
      // 05b: aload 22
      // 05d: aload 19
      // 05f: ifnonnull 075
      // 062: ifnull 0b0
      // 065: goto 073
      // 068: ldc2_w 5089432385413214688
      // 06b: lload 11
      // 06d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 22
      // 075: ldc2_w 5162338615531147608
      // 078: lload 11
      // 07a: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: aload 19
      // 081: ifnonnull 0af
      // 084: ifne 0b0
      // 087: goto 095
      // 08a: ldc2_w 5089432385413214688
      // 08d: lload 11
      // 08f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 22
      // 097: ldc2_w 6644795820585595241
      // 09a: lload 11
      // 09c: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: goto 0af
      // 0a4: ldc2_w 5089432385413214688
      // 0a7: lload 11
      // 0a9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: pop
      // 0b0: new java/io/FileInputStream
      // 0b3: dup
      // 0b4: aload 2
      // 0b5: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0b8: astore 20
      // 0ba: new java/io/FileOutputStream
      // 0bd: dup
      // 0be: aload 9
      // 0c0: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0c3: astore 21
      // 0c5: aload 20
      // 0c7: aload 21
      // 0c9: aload 8
      // 0cb: aload 3
      // 0cc: lload 13
      // 0ce: invokevirtual com/zelix/wp.C (J)I
      // 0d1: lload 17
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: aload 4
      // 0d7: lload 13
      // 0d9: invokevirtual com/zelix/wp.C (J)I
      // 0dc: aload 7
      // 0de: lload 13
      // 0e0: invokevirtual com/zelix/wp.C (J)I
      // 0e3: aload 2
      // 0e4: ldc2_w 6831744126823438028
      // 0e7: lload 11
      // 0e9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: aload 10
      // 0f0: new com/zelix/pg
      // 0f3: dup
      // 0f4: lload 15
      // 0f6: invokespecial com/zelix/pg.<init> (J)V
      // 0f9: bipush 10
      // 0fb: anewarray 267
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 9
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 8
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 7
      // 10e: swap
      // 10f: aastore
      // 110: dup_x1
      // 111: swap
      // 112: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 115: bipush 6
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11e: bipush 5
      // 11f: swap
      // 120: aastore
      // 121: dup_x1
      // 122: swap
      // 123: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 126: bipush 4
      // 127: swap
      // 128: aastore
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 3
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 2
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: ldc2_w 6663972632953327407
      // 144: lload 11
      // 146: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 20
      // 14d: aload 19
      // 14f: ifnonnull 157
      // 152: ifnull 161
      // 155: aload 20
      // 157: ldc2_w 6854309016836167666
      // 15a: lload 11
      // 15c: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: goto 197
      // 164: astore 22
      // 166: goto 197
      // 169: astore 23
      // 16b: aload 20
      // 16d: aload 19
      // 16f: ifnonnull 185
      // 172: ifnull 18f
      // 175: goto 183
      // 178: ldc2_w 5089432385413214688
      // 17b: lload 11
      // 17d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 20
      // 185: ldc2_w 6854309016836167666
      // 188: lload 11
      // 18a: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: goto 194
      // 192: astore 24
      // 194: aload 23
      // 196: athrow
      // 197: aload 21
      // 199: aload 19
      // 19b: ifnonnull 1b1
      // 19e: ifnull 1bb
      // 1a1: goto 1af
      // 1a4: ldc2_w 5089432385413214688
      // 1a7: lload 11
      // 1a9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: aload 21
      // 1b1: ldc2_w 6814598755886608303
      // 1b4: lload 11
      // 1b6: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: goto 1c0
      // 1be: astore 22
      // 1c0: return
   }

   public static String t() {
      return o;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _o(File var1, wp var2, wp var3, wp var4, String var5, ZipOutputStream var6, boolean var7, long var8, _8s var10, pg var11) {
      var8 = a ^ var8;
      long var12 = var8 ^ 118372626843788L;
      long var14 = var8 ^ 43185421020765L;
      long var16 = var8 ^ 69404604567153L;
      long var18 = var8 ^ 40962349590463L;
      long var20 = var8 ^ 84448275979136L;
      String var10000 = x44.a<"r">(5839301413441154853L, var8);
      super();
      String var22 = var10000;
      FileInputStream var23 = null;
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         var23 = new FileInputStream(var1);
         sk var24 = new sk(var12, var6, x44.a<"j">(var1, 5532216267208565083L, var8), var7);
         OutputStream var10001 = x44.a<"j">(var24, new Object[]{var16}, 6115812845394969534L, var8);
         int var10004 = var2.C(var18);
         int var10005 = var3.C(var18);
         Object[] var10011 = new Object[]{null, null, null, null, null, null, var4.C(var18), x44.a<"j">(var1, 6164130311692230024L, var8), var10, var11};
         var10011[5] = var10005;
         var10011[4] = var10004;
         var10011[3] = var20;
         var10011[2] = var5;
         var10011[1] = var10001;
         var10011[0] = var23;
         x44.a<"r">(var10011, 6286874477688357995L, var8);
         x44.a<"j">(var24, new Object[]{var14}, 5917719772991184471L, var8);
         var31 = false;
      } finally {
         if (var31) {
            try {
               label61: {
                  label60: {
                     try {
                        var39 = var23;
                        if (var22 != null) {
                           break label60;
                        }

                        if (var23 == null) {
                           break label61;
                        }
                     } catch (IOException var32) {
                        throw x44.a<"r">(var32, 5612913403369781924L, var8);
                     }

                     var39 = var23;
                  }

                  x44.a<"j">(var39, 6078519700881988790L, var8);
               }
            } catch (IOException var33) {
            }
         }
      }

      try {
         FileInputStream var40 = var23;
         if (var22 == null) {
            if (var23 == null) {
               return;
            }

            var40 = var23;
         }

         x44.a<"j">(var40, 6078519700881988790L, var8);
      } catch (IOException var35) {
      }
   }

   static {
      long var14 = a ^ 29014413420684L;
      if (x44.a<"s">(6645200906780189204L, var14) != null) {
         x44.a<"s">("bBcpfb", 5143031316102680928L, var14);
      }

      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var14 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal("íù\u0085\u00adõ,¦I".getBytes("ISO-8859-1"));
      String var19 = a(var13).intern();
      int var10001 = -1;
      b = var19;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "1Âú°nÓóµ$L\u0017\u0019\b\u009a\u0014\u0099";
      int var5 = "1Âú°nÓóµ$L\u0017\u0019\b\u009a\u0014\u0099".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
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
         long var10004 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      c = var6;
      d = new Integer[2];
   }

   private static IOException a(IOException var0) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31304;
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
            throw new RuntimeException("com/zelix/_o", var14);
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
         throw new RuntimeException("com/zelix/_o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
