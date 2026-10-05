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

public class uz {
   private static String[] g;
   private static final long a = ess.a(6473732123480360573L, 5413431756182593830L, MethodHandles.lookup().lookupClass()).a(125025002412769L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uz(long var1, File var3, wp var4, wp var5, wp var6, String var7, ZipOutputStream var8, boolean var9, _8s var10, pg var11) {
      var1 = a ^ var1;
      long var12 = var1 ^ 66327359672202L;
      long var14 = var1 ^ 110374829358637L;
      long var16 = var1 ^ 123957844142427L;
      long var18 = var1 ^ 115329672186231L;
      long var20 = var1 ^ 126145448272057L;
      String[] var10000 = x44.a<"t">(-3299437851028209205L, var1);
      super();
      FileInputStream var23 = null;
      String[] var22 = var10000;
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         var23 = new FileInputStream(var3);
         sk var24 = new sk(var12, var8, x44.a<"l">(var3, -3764949255048714659L, var1), var9);
         OutputStream var10002 = x44.a<"l">(var24, new Object[]{var18}, -3181251513202752328L, var1);
         int var10004 = var4.C(var20);
         int var10005 = var5.C(var20);
         int var10006 = var6.C(var20);
         Object[] var10012 = new Object[]{null, null, null, null, null, null, x44.a<"l">(var3, -3274904008610047346L, var1), var10, var11, var14};
         var10012[5] = var10006;
         var10012[4] = var10005;
         var10012[3] = var10004;
         var10012[2] = var7;
         var10012[1] = var10002;
         var10012[0] = var23;
         x44.a<"j">(this, var10012, -3167204760474515346L, var1);
         x44.a<"l">(var24, new Object[]{var16}, -3091262388102997679L, var1);
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
                        throw x44.a<"t">(var32, -3257756362818224641L, var1);
                     }

                     var39 = var23;
                  }

                  x44.a<"l">(var39, -3216297402237363280L, var1);
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

         x44.a<"l">(var40, -3216297402237363280L, var1);
      } catch (IOException var35) {
      }
   }

   public uz(File param1, wp param2, wp param3, byte param4, int param5, int param6, wp param7, String param8, File param9, _8s param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: i2l
      // 003: bipush 56
      // 005: lshl
      // 006: iload 5
      // 008: i2l
      // 009: bipush 32
      // 00b: lshl
      // 00c: bipush 8
      // 00e: lushr
      // 00f: lor
      // 010: iload 6
      // 012: i2l
      // 013: bipush 40
      // 015: lshl
      // 016: bipush 40
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/uz.a J
      // 01d: lxor
      // 01e: lstore 11
      // 020: lload 11
      // 022: dup2
      // 023: ldc2_w 120502765169499
      // 026: lxor
      // 027: lstore 13
      // 029: dup2
      // 02a: ldc2_w 135517465195983
      // 02d: lxor
      // 02e: lstore 15
      // 030: dup2
      // 031: ldc2_w 82743045718247
      // 034: lxor
      // 035: lstore 17
      // 037: pop2
      // 038: aload 0
      // 039: invokespecial java/lang/Object.<init> ()V
      // 03c: ldc2_w 522421110491419837
      // 03f: lload 11
      // 041: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: aload 9
      // 048: ldc2_w 491695579154327087
      // 04b: lload 11
      // 04d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: astore 20
      // 054: astore 19
      // 056: aload 20
      // 058: aload 19
      // 05a: ifnonnull 070
      // 05d: ifnull 0ab
      // 060: goto 06e
      // 063: ldc2_w 557344794365307017
      // 066: lload 11
      // 068: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: aload 20
      // 070: ldc2_w 2202340847525972076
      // 073: lload 11
      // 075: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: aload 19
      // 07c: ifnonnull 0aa
      // 07f: ifne 0ab
      // 082: goto 090
      // 085: ldc2_w 557344794365307017
      // 088: lload 11
      // 08a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 20
      // 092: ldc2_w 361141587777644637
      // 095: lload 11
      // 097: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: goto 0aa
      // 09f: ldc2_w 557344794365307017
      // 0a2: lload 11
      // 0a4: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: pop
      // 0ab: aconst_null
      // 0ac: astore 21
      // 0ae: aconst_null
      // 0af: astore 22
      // 0b1: new java/io/FileInputStream
      // 0b4: dup
      // 0b5: aload 1
      // 0b6: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0b9: astore 21
      // 0bb: new java/io/FileOutputStream
      // 0be: dup
      // 0bf: aload 9
      // 0c1: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0c4: astore 22
      // 0c6: aload 0
      // 0c7: aload 21
      // 0c9: aload 22
      // 0cb: aload 8
      // 0cd: aload 2
      // 0ce: lload 15
      // 0d0: invokevirtual com/zelix/wp.C (J)I
      // 0d3: aload 3
      // 0d4: lload 15
      // 0d6: invokevirtual com/zelix/wp.C (J)I
      // 0d9: aload 7
      // 0db: lload 15
      // 0dd: invokevirtual com/zelix/wp.C (J)I
      // 0e0: aload 1
      // 0e1: ldc2_w 575121400536649720
      // 0e4: lload 11
      // 0e6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 10
      // 0ed: new com/zelix/pg
      // 0f0: dup
      // 0f1: lload 17
      // 0f3: invokespecial com/zelix/pg.<init> (J)V
      // 0f6: lload 13
      // 0f8: bipush 10
      // 0fa: anewarray 217
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 9
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: bipush 8
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: bipush 7
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
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
      // 129: dup_x1
      // 12a: swap
      // 12b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12e: bipush 3
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 0
      // 13e: swap
      // 13f: aastore
      // 140: ldc2_w 107486019321879832
      // 143: lload 11
      // 145: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: aload 21
      // 14c: aload 19
      // 14e: ifnonnull 156
      // 151: ifnull 160
      // 154: aload 21
      // 156: ldc2_w 444558354188897990
      // 159: lload 11
      // 15b: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: goto 196
      // 163: astore 23
      // 165: goto 196
      // 168: astore 24
      // 16a: aload 21
      // 16c: aload 19
      // 16e: ifnonnull 184
      // 171: ifnull 18e
      // 174: goto 182
      // 177: ldc2_w 557344794365307017
      // 17a: lload 11
      // 17c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 21
      // 184: ldc2_w 444558354188897990
      // 187: lload 11
      // 189: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: goto 193
      // 191: astore 25
      // 193: aload 24
      // 195: athrow
      // 196: aload 22
      // 198: aload 19
      // 19a: ifnonnull 1b0
      // 19d: ifnull 1ba
      // 1a0: goto 1ae
      // 1a3: ldc2_w 557344794365307017
      // 1a6: lload 11
      // 1a8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 22
      // 1b0: ldc2_w 551224474153449115
      // 1b3: lload 11
      // 1b5: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: goto 1bf
      // 1bd: astore 23
      // 1bf: return
   }

   public static String[] c() {
      return g;
   }

   private void l(Object[] param1) {
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
      // 004: checkcast java/io/InputStream
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/io/OutputStream
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 7
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Integer
      // 01d: invokevirtual java/lang/Integer.intValue ()I
      // 020: istore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Integer
      // 028: invokevirtual java/lang/Integer.intValue ()I
      // 02b: istore 6
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/lang/Integer
      // 033: invokevirtual java/lang/Integer.intValue ()I
      // 036: istore 8
      // 038: dup
      // 039: bipush 6
      // 03b: aaload
      // 03c: checkcast java/lang/String
      // 03f: astore 10
      // 041: dup
      // 042: bipush 7
      // 044: aaload
      // 045: checkcast com/zelix/_8s
      // 048: astore 4
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast com/zelix/pg
      // 051: astore 9
      // 053: dup
      // 054: bipush 9
      // 056: aaload
      // 057: checkcast java/lang/Long
      // 05a: invokevirtual java/lang/Long.longValue ()J
      // 05d: lstore 11
      // 05f: pop
      // 060: getstatic com/zelix/uz.a J
      // 063: lload 11
      // 065: lxor
      // 066: lstore 11
      // 068: lload 11
      // 06a: dup2
      // 06b: ldc2_w 118431200875432
      // 06e: lxor
      // 06f: lstore 13
      // 071: dup2
      // 072: ldc2_w 91274831238320
      // 075: lxor
      // 076: lstore 15
      // 078: dup2
      // 079: ldc2_w 54835041958121
      // 07c: lxor
      // 07d: lstore 17
      // 07f: pop2
      // 080: ldc2_w -681712624405355145
      // 083: lload 11
      // 085: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: lload 17
      // 08c: aload 3
      // 08d: iload 5
      // 08f: bipush 3
      // 090: anewarray 217
      // 093: dup_x1
      // 094: swap
      // 095: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 098: bipush 2
      // 099: swap
      // 09a: aastore
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 1
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 0
      // 0a7: swap
      // 0a8: aastore
      // 0a9: ldc2_w -1049353435616870254
      // 0ac: lload 11
      // 0ae: invokedynamic p (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: astore 19
      // 0b6: aconst_null
      // 0b7: astore 20
      // 0b9: aconst_null
      // 0ba: astore 21
      // 0bc: aconst_null
      // 0bd: astore 22
      // 0bf: new java/io/BufferedReader
      // 0c2: dup
      // 0c3: new java/io/InputStreamReader
      // 0c6: dup
      // 0c7: aload 3
      // 0c8: aload 7
      // 0ca: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0cd: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0d0: astore 20
      // 0d2: new java/io/ByteArrayOutputStream
      // 0d5: dup
      // 0d6: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 0d9: astore 21
      // 0db: aload 7
      // 0dd: sipush 29189
      // 0e0: ldc2_w 4779563691100922772
      // 0e3: lload 11
      // 0e5: lxor
      // 0e6: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/uz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ee: aload 19
      // 0f0: ifnonnull 106
      // 0f3: ifeq 119
      // 0f6: goto 104
      // 0f9: ldc2_w -687356522255853245
      // 0fc: lload 11
      // 0fe: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: iload 8
      // 106: ifne 119
      // 109: sipush 22694
      // 10c: ldc2_w 2667757246782163252
      // 10f: lload 11
      // 111: lxor
      // 112: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/uz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: astore 7
      // 119: new java/io/PrintWriter
      // 11c: dup
      // 11d: new java/io/BufferedWriter
      // 120: dup
      // 121: new java/io/OutputStreamWriter
      // 124: dup
      // 125: aload 21
      // 127: aload 7
      // 129: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 12c: invokespecial java/io/BufferedWriter.<init> (Ljava/io/Writer;)V
      // 12f: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 132: astore 22
      // 134: aload 20
      // 136: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 139: dup
      // 13a: astore 23
      // 13c: ifnull 2f3
      // 13f: aload 23
      // 141: getstatic com/zelix/uz.e J
      // 144: l2i
      // 145: invokevirtual java/lang/String.indexOf (I)I
      // 148: istore 26
      // 14a: aload 19
      // 14c: ifnonnull 306
      // 14f: iload 26
      // 151: bipush -1
      // 152: goto 160
      // 155: ldc2_w -687356522255853245
      // 158: lload 11
      // 15a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: if_icmple 182
      // 163: aload 23
      // 165: bipush 0
      // 166: iload 26
      // 168: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 16b: astore 25
      // 16d: aload 23
      // 16f: iload 26
      // 171: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 174: astore 24
      // 176: lload 11
      // 178: lconst_0
      // 179: lcmp
      // 17a: iflt 186
      // 17d: aload 19
      // 17f: ifnull 189
      // 182: aload 23
      // 184: astore 25
      // 186: aconst_null
      // 187: astore 24
      // 189: new java/util/StringTokenizer
      // 18c: dup
      // 18d: aload 25
      // 18f: sipush 14153
      // 192: ldc2_w 420804589654845145
      // 195: lload 11
      // 197: lxor
      // 198: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/uz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: bipush 1
      // 19e: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 1a1: astore 27
      // 1a3: aload 27
      // 1a5: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 1a8: ifeq 2a5
      // 1ab: aload 27
      // 1ad: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 1b0: astore 28
      // 1b2: aload 28
      // 1b4: aload 19
      // 1b6: ifnonnull 1fd
      // 1b9: invokevirtual java/lang/String.length ()I
      // 1bc: bipush 1
      // 1bd: aload 19
      // 1bf: ifnonnull 160
      // 1c2: lload 11
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: ifle 152
      // 1c9: goto 1d7
      // 1cc: ldc2_w -687356522255853245
      // 1cf: lload 11
      // 1d1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: if_icmple 284
      // 1da: aload 28
      // 1dc: bipush 1
      // 1dd: anewarray 217
      // 1e0: dup_x1
      // 1e1: swap
      // 1e2: bipush 0
      // 1e3: swap
      // 1e4: aastore
      // 1e5: ldc2_w -660919176435814245
      // 1e8: lload 11
      // 1ea: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: goto 1fd
      // 1f2: ldc2_w -687356522255853245
      // 1f5: lload 11
      // 1f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: astore 29
      // 1ff: aload 29
      // 201: aload 4
      // 203: lload 13
      // 205: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 208: checkcast java/lang/String
      // 20b: astore 30
      // 20d: aload 19
      // 20f: lload 11
      // 211: lconst_0
      // 212: lcmp
      // 213: ifle 252
      // 216: ifnonnull 250
      // 219: aload 29
      // 21b: aload 30
      // 21d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 220: ifne 25c
      // 223: goto 231
      // 226: ldc2_w -687356522255853245
      // 229: lload 11
      // 22b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 22
      // 233: aload 30
      // 235: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 238: ldc2_w -1550615616406796260
      // 23b: lload 11
      // 23d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: goto 250
      // 245: ldc2_w -687356522255853245
      // 248: lload 11
      // 24a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: aload 19
      // 252: lload 11
      // 254: lconst_0
      // 255: lcmp
      // 256: iflt 27a
      // 259: ifnull 278
      // 25c: aload 22
      // 25e: aload 28
      // 260: ldc2_w -1550615616406796260
      // 263: lload 11
      // 265: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: goto 278
      // 26d: ldc2_w -687356522255853245
      // 270: lload 11
      // 272: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: athrow
      // 278: aload 19
      // 27a: lload 11
      // 27c: lconst_0
      // 27d: lcmp
      // 27e: iflt 2a2
      // 281: ifnull 2a0
      // 284: aload 22
      // 286: aload 28
      // 288: ldc2_w -1550615616406796260
      // 28b: lload 11
      // 28d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: goto 2a0
      // 295: ldc2_w -687356522255853245
      // 298: lload 11
      // 29a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: aload 19
      // 2a2: ifnull 1a3
      // 2a5: lload 11
      // 2a7: lconst_0
      // 2a8: lcmp
      // 2a9: iflt 2e0
      // 2ac: aload 24
      // 2ae: lload 11
      // 2b0: lconst_0
      // 2b1: lcmp
      // 2b2: ifle 1b0
      // 2b5: ifnull 2d9
      // 2b8: aload 22
      // 2ba: aload 24
      // 2bc: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2bf: aload 19
      // 2c1: lload 11
      // 2c3: lconst_0
      // 2c4: lcmp
      // 2c5: ifle 2f0
      // 2c8: ifnull 2ee
      // 2cb: goto 2d9
      // 2ce: ldc2_w -687356522255853245
      // 2d1: lload 11
      // 2d3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: athrow
      // 2d9: aload 22
      // 2db: ldc ""
      // 2dd: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2e0: goto 2ee
      // 2e3: ldc2_w -687356522255853245
      // 2e6: lload 11
      // 2e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: athrow
      // 2ee: aload 19
      // 2f0: ifnull 134
      // 2f3: aload 22
      // 2f5: ldc2_w -1016943977616653750
      // 2f8: lload 11
      // 2fa: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: lload 11
      // 301: lconst_0
      // 302: lcmp
      // 303: ifle 306
      // 306: aconst_null
      // 307: astore 22
      // 309: aload 21
      // 30b: ldc2_w -1506825430594582227
      // 30e: lload 11
      // 310: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: astore 24
      // 317: aload 9
      // 319: lload 15
      // 31b: aload 24
      // 31d: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 320: aload 2
      // 321: aload 24
      // 323: ldc2_w -614530704276762059
      // 326: lload 11
      // 328: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: aload 2
      // 32e: ldc2_w -1524908679315955650
      // 331: lload 11
      // 333: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: lload 11
      // 33a: lconst_0
      // 33b: lcmp
      // 33c: iflt 355
      // 33f: aload 20
      // 341: aload 19
      // 343: ifnonnull 34b
      // 346: ifnull 35a
      // 349: aload 20
      // 34b: ldc2_w -620443752309356477
      // 34e: lload 11
      // 350: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: goto 35a
      // 358: astore 23
      // 35a: aload 22
      // 35c: aload 19
      // 35e: ifnonnull 374
      // 361: ifnull 37e
      // 364: goto 372
      // 367: ldc2_w -687356522255853245
      // 36a: lload 11
      // 36c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: athrow
      // 372: aload 22
      // 374: ldc2_w -1016943977616653750
      // 377: lload 11
      // 379: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: aload 21
      // 380: aload 19
      // 382: ifnonnull 398
      // 385: ifnull 3a2
      // 388: goto 396
      // 38b: ldc2_w -687356522255853245
      // 38e: lload 11
      // 390: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: athrow
      // 396: aload 21
      // 398: ldc2_w -1603971671647883599
      // 39b: lload 11
      // 39d: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: goto 42c
      // 3a5: astore 23
      // 3a7: goto 42c
      // 3aa: astore 31
      // 3ac: lload 11
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: ifle 3d7
      // 3b3: aload 20
      // 3b5: aload 19
      // 3b7: ifnonnull 3cd
      // 3ba: ifnull 3dc
      // 3bd: goto 3cb
      // 3c0: ldc2_w -687356522255853245
      // 3c3: lload 11
      // 3c5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: athrow
      // 3cb: aload 20
      // 3cd: ldc2_w -620443752309356477
      // 3d0: lload 11
      // 3d2: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: goto 3dc
      // 3da: astore 32
      // 3dc: aload 22
      // 3de: aload 19
      // 3e0: ifnonnull 3f6
      // 3e3: ifnull 400
      // 3e6: goto 3f4
      // 3e9: ldc2_w -687356522255853245
      // 3ec: lload 11
      // 3ee: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: athrow
      // 3f4: aload 22
      // 3f6: ldc2_w -1016943977616653750
      // 3f9: lload 11
      // 3fb: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 400: aload 21
      // 402: aload 19
      // 404: ifnonnull 41a
      // 407: ifnull 424
      // 40a: goto 418
      // 40d: ldc2_w -687356522255853245
      // 410: lload 11
      // 412: invokedynamic p (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: athrow
      // 418: aload 21
      // 41a: ldc2_w -1603971671647883599
      // 41d: lload 11
      // 41f: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: goto 429
      // 427: astore 32
      // 429: aload 31
      // 42b: athrow
      // 42c: return
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uz(
      long var1, ZipFile var3, ZipEntry var4, Long var5, wp var6, wp var7, wp var8, String var9, ZipOutputStream var10, vm var11, boolean var12, _8s var13
   ) {
      var1 = a ^ var1;
      long var14 = var1 ^ 41999933873691L;
      long var16 = var1 ^ 138553261240252L;
      long var18 = var1 ^ 106984859995642L;
      long var20 = var1 ^ 125918201862374L;
      long var22 = var1 ^ 90472241299459L;
      long var24 = var1 ^ 115291203285288L;
      long var26 = var1 ^ 97696827376640L;
      String[] var10000 = x44.a<"u">(263197385413988442L, var1);
      super();
      InputStream var29 = null;
      String[] var28 = var10000;
      boolean var38 = false /* VF: Semaphore variable */;

      try {
         var38 = true;
         var29 = x44.a<"m">(var3, var4, 50442246072617062L, var1);
         String var30 = x44.a<"m">(var11, new Object[]{var22, var4.getName()}, 1789735163279942722L, var1);
         sk var31 = new sk(var14, var10, var30, var12);
         OutputStream var10002 = x44.a<"m">(var31, new Object[]{var20}, 164652945839068457L, var1);
         int var10004 = var6.C(var24);
         int var10005 = var7.C(var24);
         int var10006 = var8.C(var24);
         Object[] var10012 = new Object[]{null, null, null, null, null, null, var4.getName(), var13, new pg(var26), var16};
         var10012[5] = var10006;
         var10012[4] = var10005;
         var10012[3] = var10004;
         var10012[2] = var9;
         var10012[1] = var10002;
         var10012[0] = var29;
         x44.a<"k">(this, var10012, 403862083569474047L, var1);
         x44.a<"m">(var31, new Object[]{var5, var18}, 1997529110579156673L, var1);
         var38 = false;
      } finally {
         if (var38) {
            try {
               label61: {
                  label60: {
                     try {
                        var46 = var29;
                        if (var28 != null) {
                           break label60;
                        }

                        if (var29 == null) {
                           break label61;
                        }
                     } catch (IOException var39) {
                        throw x44.a<"u">(var39, 241793297002441838L, var1);
                     }

                     var46 = var29;
                  }

                  x44.a<"m">(var46, 324225986400483942L, var1);
               }
            } catch (IOException var40) {
            }
         }
      }

      try {
         InputStream var47 = var29;
         if (var28 == null) {
            if (var29 == null) {
               return;
            }

            var47 = var29;
         }

         x44.a<"m">(var47, 324225986400483942L, var1);
      } catch (IOException var42) {
      }
   }

   public static void B(String[] var0) {
      g = var0;
   }

   static {
      long var14 = a ^ 49980717319913L;
      x44.a<"s">(null, 603159540420673622L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[3];
      int var10 = 0;
      String var9 = "!\u007f'h\\Wd\u00ad\u0011 j°{¹¿Z\u0010uC¤·R³\u0015\u009b+Á\u0097±\u009a\u0011k\b\u0018«18\u0089\u0093?(hMCá\u0085[b\u00857_\u0002\t3¸\u0017\u009cC";
      int var11 = "!\u007f'h\\Wd\u00ad\u0011 j°{¹¿Z\u0010uC¤·R³\u0015\u009b+Á\u0097±\u009a\u0011k\b\u0018«18\u0089\u0093?(hMCá\u0085[b\u00857_\u0002\t3¸\u0017\u009cC"
         .length();
      char var8 = 16;
      int var7 = -1;

      while (true) {
         byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
         String var20 = a(var13).intern();
         byte var10001 = -1;
         var12[var10++] = var20;
         if ((var7 += var8) >= var11) {
            b = var12;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5315951718947613423L;
            byte[] var4 = var0.doFinal(
               new byte[]{
                  (byte)((int)(var2 >>> 56)),
                  (byte)((int)(var2 >>> 48)),
                  (byte)((int)(var2 >>> 40)),
                  (byte)((int)(var2 >>> 32)),
                  (byte)((int)(var2 >>> 24)),
                  (byte)((int)(var2 >>> 16)),
                  (byte)((int)(var2 >>> 8)),
                  (byte)((int)var2)
               }
            );
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            e = var23;
            return;
         }

         var8 = var9.charAt(var7);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27331;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/uz", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/uz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
