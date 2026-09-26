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

public class lk1 {
   private static boolean w;
   private static final long a = prr.a(5884345499685647344L, 4947394325692683017L, MethodHandles.lookup().lookupClass()).a(187547528443800L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static void C(boolean var0) {
      w = var0;
   }

   public static boolean U() {
      return w;
   }

   public lk1(int param1, File param2, lb6 param3, byte param4, lb6 param5, lb6 param6, String param7, int param8, File param9, v8 param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 56
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 8
      // 011: i2l
      // 012: bipush 40
      // 014: lshl
      // 015: bipush 40
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/lk1.a J
      // 01c: lxor
      // 01d: lstore 11
      // 01f: lload 11
      // 021: dup2
      // 022: ldc2_w 15884634907105
      // 025: lxor
      // 026: dup2
      // 027: bipush 32
      // 029: lushr
      // 02a: l2i
      // 02b: istore 13
      // 02d: dup2
      // 02e: bipush 32
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 14
      // 037: dup2
      // 038: bipush 48
      // 03a: lshl
      // 03b: bipush 48
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 15
      // 041: pop2
      // 042: dup2
      // 043: ldc2_w 57831335201880
      // 046: lxor
      // 047: lstore 16
      // 049: dup2
      // 04a: ldc2_w 56933078852468
      // 04d: lxor
      // 04e: lstore 18
      // 050: pop2
      // 051: aload 0
      // 052: invokespecial java/lang/Object.<init> ()V
      // 055: ldc2_w -792272913131787064
      // 058: lload 11
      // 05a: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 9
      // 061: ldc2_w -634328898602830131
      // 064: lload 11
      // 066: invokedynamic u (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: astore 21
      // 06d: istore 20
      // 06f: aload 21
      // 071: iload 20
      // 073: ifeq 089
      // 076: ifnull 0c4
      // 079: goto 087
      // 07c: ldc2_w -1191952648098482595
      // 07f: lload 11
      // 081: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 21
      // 089: ldc2_w -1067694090135014154
      // 08c: lload 11
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: iload 20
      // 095: ifeq 0c3
      // 098: ifne 0c4
      // 09b: goto 0a9
      // 09e: ldc2_w -1191952648098482595
      // 0a1: lload 11
      // 0a3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 21
      // 0ab: ldc2_w -696499020672142577
      // 0ae: lload 11
      // 0b0: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: goto 0c3
      // 0b8: ldc2_w -1191952648098482595
      // 0bb: lload 11
      // 0bd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: pop
      // 0c4: aconst_null
      // 0c5: astore 22
      // 0c7: aconst_null
      // 0c8: astore 23
      // 0ca: new java/io/FileInputStream
      // 0cd: dup
      // 0ce: aload 2
      // 0cf: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0d2: astore 22
      // 0d4: new java/io/FileOutputStream
      // 0d7: dup
      // 0d8: aload 9
      // 0da: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0dd: astore 23
      // 0df: aload 0
      // 0e0: aload 22
      // 0e2: aload 23
      // 0e4: aload 7
      // 0e6: aload 3
      // 0e7: lload 16
      // 0e9: invokevirtual com/zelix/lb6.U (J)I
      // 0ec: aload 5
      // 0ee: lload 16
      // 0f0: invokevirtual com/zelix/lb6.U (J)I
      // 0f3: aload 6
      // 0f5: lload 16
      // 0f7: invokevirtual com/zelix/lb6.U (J)I
      // 0fa: aload 2
      // 0fb: ldc2_w -1055698783492633566
      // 0fe: lload 11
      // 100: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: aload 10
      // 107: new com/zelix/sz
      // 10a: dup
      // 10b: iload 13
      // 10d: iload 14
      // 10f: i2s
      // 110: iload 15
      // 112: i2c
      // 113: invokespecial com/zelix/sz.<init> (ISC)V
      // 116: lload 18
      // 118: bipush 10
      // 11a: anewarray 401
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 9
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 8
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 7
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 6
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13e: bipush 5
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 146: bipush 4
      // 147: swap
      // 148: aastore
      // 149: dup_x1
      // 14a: swap
      // 14b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14e: bipush 3
      // 14f: swap
      // 150: aastore
      // 151: dup_x1
      // 152: swap
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
      // 160: ldc2_w -601955724507016717
      // 163: lload 11
      // 165: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 22
      // 16c: iload 20
      // 16e: ifeq 176
      // 171: ifnull 180
      // 174: aload 22
      // 176: ldc2_w -1366366955906293287
      // 179: lload 11
      // 17b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: goto 1b6
      // 183: astore 24
      // 185: goto 1b6
      // 188: astore 25
      // 18a: aload 22
      // 18c: iload 20
      // 18e: ifeq 1a4
      // 191: ifnull 1ae
      // 194: goto 1a2
      // 197: ldc2_w -1191952648098482595
      // 19a: lload 11
      // 19c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aload 22
      // 1a4: ldc2_w -1366366955906293287
      // 1a7: lload 11
      // 1a9: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: goto 1b3
      // 1b1: astore 26
      // 1b3: aload 25
      // 1b5: athrow
      // 1b6: aload 23
      // 1b8: iload 20
      // 1ba: ifeq 1d0
      // 1bd: ifnull 1da
      // 1c0: goto 1ce
      // 1c3: ldc2_w -1191952648098482595
      // 1c6: lload 11
      // 1c8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 23
      // 1d0: ldc2_w -1000676070167424303
      // 1d3: lload 11
      // 1d5: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: goto 1df
      // 1dd: astore 24
      // 1df: return
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public lk1(
      ZipFile var1, ZipEntry var2, Long var3, lb6 var4, long var5, lb6 var7, lb6 var8, String var9, ZipOutputStream var10, _x var11, boolean var12, v8 var13
   ) {
      var5 = a ^ var5;
      long var10001 = var5 ^ 127498351776011L;
      int var14 = (int)((var5 ^ 127498351776011L) >>> 32);
      int var15 = (int)((var5 ^ 127498351776011L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var5 ^ 80397555989682L;
      long var19 = var5 ^ 90546565612602L;
      long var21 = var5 ^ 92643687576624L;
      long var23 = var5 ^ 8497152026401L;
      long var25 = var5 ^ 86037456098206L;
      long var27 = var5 ^ 64968923870199L;
      boolean var10000 = m44.a<"h">(406984929317678558L, var5);
      super();
      boolean var29 = var10000;
      InputStream var30 = null;
      boolean var39 = false /* VF: Semaphore variable */;

      try {
         var39 = true;
         var30 = m44.a<"w">(var1, var2, 287503731578709557L, var5);
         String var31 = m44.a<"w">(var11, new Object[]{var23, var2.getName()}, 285182308434462874L, var5);
         y5 var32 = new y5(var27, var10, var31, var12);
         OutputStream var10002 = m44.a<"w">(var32, new Object[]{var19}, 2093187684308426810L, var5);
         int var10004 = var4.U(var17);
         int var10005 = var7.U(var17);
         int var10006 = var8.U(var17);
         Object[] var10012 = new Object[]{null, null, null, null, null, null, var2.getName(), var13, new sz(var14, (short)var15, (char)var16), var25};
         var10012[5] = var10006;
         var10012[4] = var10005;
         var10012[3] = var10004;
         var10012[2] = var9;
         var10012[1] = var10002;
         var10012[0] = var30;
         m44.a<"i">(this, var10012, 526659416226652441L, var5);
         m44.a<"w">(var32, new Object[]{var3, var21}, 95548343929404373L, var5);
         var39 = false;
      } finally {
         if (var39) {
            try {
               label61: {
                  label60: {
                     try {
                        var47 = var30;
                        if (var29) {
                           break label60;
                        }

                        if (var30 == null) {
                           break label61;
                        }
                     } catch (IOException var40) {
                        throw m44.a<"h">(var40, 2278584906239051447L, var5);
                     }

                     var47 = var30;
                  }

                  m44.a<"w">(var47, 1734545423561670322L, var5);
               }
            } catch (IOException var41) {
            }
         }
      }

      try {
         InputStream var48 = var30;
         if (!var29) {
            if (var30 == null) {
               return;
            }

            var48 = var30;
         }

         m44.a<"w">(var48, 1734545423561670322L, var5);
      } catch (IOException var43) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public lk1(long var1, File var3, lb6 var4, lb6 var5, lb6 var6, String var7, ZipOutputStream var8, boolean var9, v8 var10, sz var11) {
      var1 = a ^ var1;
      long var12 = var1 ^ 1522257796552L;
      long var14 = var1 ^ 28756643177792L;
      long var16 = var1 ^ 6860243694308L;
      long var18 = var1 ^ 126906347393677L;
      long var20 = var1 ^ 118531221705808L;
      boolean var10000 = m44.a<"j">(7268720593758555300L, var1);
      super();
      FileInputStream var23 = null;
      boolean var22 = var10000;
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         var23 = new FileInputStream(var3);
         y5 var24 = new y5(var18, var8, m44.a<"u">(var3, 7492465716124650274L, var1), var9);
         OutputStream var10002 = m44.a<"u">(var24, new Object[]{var14}, 8968416622352810304L, var1);
         int var10004 = var4.U(var12);
         int var10005 = var5.U(var12);
         int var10006 = var6.U(var12);
         Object[] var10012 = new Object[]{null, null, null, null, null, null, m44.a<"u">(var3, 6974196165685255602L, var1), var10, var11, var16};
         var10012[5] = var10006;
         var10012[4] = var10005;
         var10012[3] = var10004;
         var10012[2] = var7;
         var10012[1] = var10002;
         var10012[0] = var23;
         m44.a<"k">(this, var10012, 7364891239363936355L, var1);
         m44.a<"u">(var24, new Object[]{var20}, 8754054409374586605L, var1);
         var31 = false;
      } finally {
         if (var31) {
            try {
               label61: {
                  label60: {
                     try {
                        var39 = var23;
                        if (var22) {
                           break label60;
                        }

                        if (var23 == null) {
                           break label61;
                        }
                     } catch (IOException var32) {
                        throw m44.a<"j">(var32, 9143820838231041997L, var1);
                     }

                     var39 = var23;
                  }

                  m44.a<"u">(var39, 8978354137172029513L, var1);
               }
            } catch (IOException var33) {
            }
         }
      }

      try {
         FileInputStream var40 = var23;
         if (!var22) {
            if (var23 == null) {
               return;
            }

            var40 = var23;
         }

         m44.a<"u">(var40, 8978354137172029513L, var1);
      } catch (IOException var35) {
      }
   }

   private void b(Object[] param1) {
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
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/io/OutputStream
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/String
      // 017: astore 12
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Integer
      // 01f: invokevirtual java/lang/Integer.intValue ()I
      // 022: istore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 5
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Integer
      // 034: invokevirtual java/lang/Integer.intValue ()I
      // 037: istore 7
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast java/lang/String
      // 040: astore 8
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast com/zelix/v8
      // 049: astore 6
      // 04b: dup
      // 04c: bipush 8
      // 04e: aaload
      // 04f: checkcast com/zelix/sz
      // 052: astore 11
      // 054: dup
      // 055: bipush 9
      // 057: aaload
      // 058: checkcast java/lang/Long
      // 05b: invokevirtual java/lang/Long.longValue ()J
      // 05e: lstore 3
      // 05f: pop
      // 060: getstatic com/zelix/lk1.a J
      // 063: lload 3
      // 064: lxor
      // 065: lstore 3
      // 066: lload 3
      // 067: dup2
      // 068: ldc2_w 29098061082023
      // 06b: lxor
      // 06c: lstore 13
      // 06e: dup2
      // 06f: ldc2_w 135679432734291
      // 072: lxor
      // 073: dup2
      // 074: bipush 32
      // 076: lushr
      // 077: l2i
      // 078: istore 15
      // 07a: dup2
      // 07b: bipush 32
      // 07d: lshl
      // 07e: bipush 48
      // 080: lushr
      // 081: l2i
      // 082: istore 16
      // 084: dup2
      // 085: bipush 48
      // 087: lshl
      // 088: bipush 48
      // 08a: lushr
      // 08b: l2i
      // 08c: istore 17
      // 08e: pop2
      // 08f: dup2
      // 090: ldc2_w 28583381916324
      // 093: lxor
      // 094: lstore 18
      // 096: pop2
      // 097: iload 15
      // 099: aload 10
      // 09b: iload 16
      // 09d: i2c
      // 09e: iload 2
      // 09f: iload 17
      // 0a1: i2s
      // 0a2: bipush 5
      // 0a3: anewarray 401
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ab: bipush 4
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b3: bipush 3
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w 2037411630808374525
      // 0ce: lload 3
      // 0cf: invokedynamic n (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: pop
      // 0d5: ldc2_w 2239746136329897692
      // 0d8: lload 3
      // 0d9: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: aconst_null
      // 0df: astore 21
      // 0e1: aconst_null
      // 0e2: astore 22
      // 0e4: istore 20
      // 0e6: aconst_null
      // 0e7: astore 23
      // 0e9: new java/io/BufferedReader
      // 0ec: dup
      // 0ed: new java/io/InputStreamReader
      // 0f0: dup
      // 0f1: aload 10
      // 0f3: aload 12
      // 0f5: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0f8: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0fb: astore 21
      // 0fd: new java/io/ByteArrayOutputStream
      // 100: dup
      // 101: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 104: astore 22
      // 106: aload 12
      // 108: sipush 11569
      // 10b: ldc2_w 7020394648902353177
      // 10e: lload 3
      // 10f: lxor
      // 110: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/lk1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 118: iload 20
      // 11a: ifeq 12f
      // 11d: ifeq 141
      // 120: goto 12d
      // 123: ldc2_w 387661019094326345
      // 126: lload 3
      // 127: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: iload 7
      // 12f: ifne 141
      // 132: sipush 25764
      // 135: ldc2_w 3046697527516366991
      // 138: lload 3
      // 139: lxor
      // 13a: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/lk1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: astore 12
      // 141: new java/io/PrintWriter
      // 144: dup
      // 145: new java/io/BufferedWriter
      // 148: dup
      // 149: new java/io/OutputStreamWriter
      // 14c: dup
      // 14d: aload 22
      // 14f: aload 12
      // 151: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 154: invokespecial java/io/BufferedWriter.<init> (Ljava/io/Writer;)V
      // 157: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 15a: astore 23
      // 15c: aload 21
      // 15e: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 161: dup
      // 162: astore 24
      // 164: ifnull 30b
      // 167: aload 24
      // 169: getstatic com/zelix/lk1.e J
      // 16c: l2i
      // 16d: invokevirtual java/lang/String.indexOf (I)I
      // 170: istore 27
      // 172: iload 20
      // 174: lload 3
      // 175: lconst_0
      // 176: lcmp
      // 177: iflt 17f
      // 17a: ifeq 31c
      // 17d: iload 27
      // 17f: bipush -1
      // 180: goto 18d
      // 183: ldc2_w 387661019094326345
      // 186: lload 3
      // 187: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: if_icmple 1ae
      // 190: aload 24
      // 192: bipush 0
      // 193: iload 27
      // 195: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 198: astore 26
      // 19a: aload 24
      // 19c: iload 27
      // 19e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1a1: astore 25
      // 1a3: lload 3
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 1b2
      // 1a9: iload 20
      // 1ab: ifne 1b5
      // 1ae: aload 24
      // 1b0: astore 26
      // 1b2: aconst_null
      // 1b3: astore 25
      // 1b5: new java/util/StringTokenizer
      // 1b8: dup
      // 1b9: aload 26
      // 1bb: sipush 12106
      // 1be: ldc2_w 2205755215193523040
      // 1c1: lload 3
      // 1c2: lxor
      // 1c3: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/lk1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: bipush 1
      // 1c9: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 1cc: astore 28
      // 1ce: aload 28
      // 1d0: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 1d3: ifeq 2c2
      // 1d6: aload 28
      // 1d8: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 1db: astore 29
      // 1dd: aload 29
      // 1df: iload 20
      // 1e1: ifeq 224
      // 1e4: invokevirtual java/lang/String.length ()I
      // 1e7: bipush 1
      // 1e8: iload 20
      // 1ea: ifeq 18d
      // 1ed: lload 3
      // 1ee: lconst_0
      // 1ef: lcmp
      // 1f0: ifle 180
      // 1f3: goto 200
      // 1f6: ldc2_w 387661019094326345
      // 1f9: lload 3
      // 1fa: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: athrow
      // 200: if_icmple 2a3
      // 203: aload 29
      // 205: bipush 1
      // 206: anewarray 401
      // 209: dup_x1
      // 20a: swap
      // 20b: bipush 0
      // 20c: swap
      // 20d: aastore
      // 20e: ldc2_w 2139802223606012276
      // 211: lload 3
      // 212: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: goto 224
      // 21a: ldc2_w 387661019094326345
      // 21d: lload 3
      // 21e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: astore 30
      // 226: lload 13
      // 228: aload 30
      // 22a: aload 6
      // 22c: invokestatic com/zelix/cf.J (JLjava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
      // 22f: checkcast java/lang/String
      // 232: astore 31
      // 234: iload 20
      // 236: lload 3
      // 237: lconst_0
      // 238: lcmp
      // 239: ifle 275
      // 23c: ifeq 273
      // 23f: aload 30
      // 241: aload 31
      // 243: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 246: ifne 27e
      // 249: goto 256
      // 24c: ldc2_w 387661019094326345
      // 24f: lload 3
      // 250: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 23
      // 258: aload 31
      // 25a: invokestatic com/zelix/cf.a (Ljava/lang/String;)Ljava/lang/String;
      // 25d: ldc2_w 2068613186181694527
      // 260: lload 3
      // 261: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: goto 273
      // 269: ldc2_w 387661019094326345
      // 26c: lload 3
      // 26d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: iload 20
      // 275: lload 3
      // 276: lconst_0
      // 277: lcmp
      // 278: iflt 29a
      // 27b: ifne 298
      // 27e: aload 23
      // 280: aload 29
      // 282: ldc2_w 2068613186181694527
      // 285: lload 3
      // 286: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: goto 298
      // 28e: ldc2_w 387661019094326345
      // 291: lload 3
      // 292: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: iload 20
      // 29a: lload 3
      // 29b: lconst_0
      // 29c: lcmp
      // 29d: ifle 2bf
      // 2a0: ifne 2bd
      // 2a3: aload 23
      // 2a5: aload 29
      // 2a7: ldc2_w 2068613186181694527
      // 2aa: lload 3
      // 2ab: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: goto 2bd
      // 2b3: ldc2_w 387661019094326345
      // 2b6: lload 3
      // 2b7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: athrow
      // 2bd: iload 20
      // 2bf: ifne 1ce
      // 2c2: lload 3
      // 2c3: lconst_0
      // 2c4: lcmp
      // 2c5: iflt 2f9
      // 2c8: aload 25
      // 2ca: lload 3
      // 2cb: lconst_0
      // 2cc: lcmp
      // 2cd: iflt 1db
      // 2d0: ifnull 2f2
      // 2d3: aload 23
      // 2d5: aload 25
      // 2d7: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2da: iload 20
      // 2dc: lload 3
      // 2dd: lconst_0
      // 2de: lcmp
      // 2df: ifle 308
      // 2e2: ifne 306
      // 2e5: goto 2f2
      // 2e8: ldc2_w 387661019094326345
      // 2eb: lload 3
      // 2ec: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: aload 23
      // 2f4: ldc ""
      // 2f6: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2f9: goto 306
      // 2fc: ldc2_w 387661019094326345
      // 2ff: lload 3
      // 300: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: iload 20
      // 308: ifne 15c
      // 30b: aload 23
      // 30d: ldc2_w 2268561205614685452
      // 310: lload 3
      // 311: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: lload 3
      // 317: lconst_0
      // 318: lcmp
      // 319: ifle 31c
      // 31c: aconst_null
      // 31d: astore 23
      // 31f: aload 22
      // 321: ldc2_w 2031366178032050110
      // 324: lload 3
      // 325: invokedynamic q (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: astore 25
      // 32c: aload 11
      // 32e: lload 18
      // 330: aload 25
      // 332: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 335: aload 9
      // 337: aload 25
      // 339: ldc2_w 1935271084495675531
      // 33c: lload 3
      // 33d: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: aload 9
      // 344: ldc2_w 567084443702754487
      // 347: lload 3
      // 348: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: lload 3
      // 34e: lconst_0
      // 34f: lcmp
      // 350: ifle 368
      // 353: aload 21
      // 355: iload 20
      // 357: ifeq 35f
      // 35a: ifnull 36d
      // 35d: aload 21
      // 35f: ldc2_w 241119910909391642
      // 362: lload 3
      // 363: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: goto 36d
      // 36b: astore 24
      // 36d: aload 23
      // 36f: iload 20
      // 371: ifeq 386
      // 374: ifnull 38f
      // 377: goto 384
      // 37a: ldc2_w 387661019094326345
      // 37d: lload 3
      // 37e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: athrow
      // 384: aload 23
      // 386: ldc2_w 2268561205614685452
      // 389: lload 3
      // 38a: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: aload 22
      // 391: iload 20
      // 393: ifeq 3a8
      // 396: ifnull 3b1
      // 399: goto 3a6
      // 39c: ldc2_w 387661019094326345
      // 39f: lload 3
      // 3a0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: aload 22
      // 3a8: ldc2_w 218343154334734425
      // 3ab: lload 3
      // 3ac: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: goto 434
      // 3b4: astore 24
      // 3b6: goto 434
      // 3b9: astore 32
      // 3bb: lload 3
      // 3bc: lconst_0
      // 3bd: lcmp
      // 3be: iflt 3e3
      // 3c1: aload 21
      // 3c3: iload 20
      // 3c5: ifeq 3da
      // 3c8: ifnull 3e8
      // 3cb: goto 3d8
      // 3ce: ldc2_w 387661019094326345
      // 3d1: lload 3
      // 3d2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: aload 21
      // 3da: ldc2_w 241119910909391642
      // 3dd: lload 3
      // 3de: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: goto 3e8
      // 3e6: astore 33
      // 3e8: aload 23
      // 3ea: iload 20
      // 3ec: ifeq 401
      // 3ef: ifnull 40a
      // 3f2: goto 3ff
      // 3f5: ldc2_w 387661019094326345
      // 3f8: lload 3
      // 3f9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fe: athrow
      // 3ff: aload 23
      // 401: ldc2_w 2268561205614685452
      // 404: lload 3
      // 405: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: aload 22
      // 40c: iload 20
      // 40e: ifeq 423
      // 411: ifnull 42c
      // 414: goto 421
      // 417: ldc2_w 387661019094326345
      // 41a: lload 3
      // 41b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: athrow
      // 421: aload 22
      // 423: ldc2_w 218343154334734425
      // 426: lload 3
      // 427: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42c: goto 431
      // 42f: astore 33
      // 431: aload 32
      // 433: athrow
      // 434: return
   }

   public static boolean f() {
      boolean var0 = U();
      return !var0;
   }

   static {
      long var14 = a ^ 69650647493232L;
      m44.a<"o">(true, 3012553908649855478L, var14);
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
      String var9 = "ÅA\u008aø;Ìn\u00adæÕ¨ç¬v\u008eÓ\u0018g\u0000t\u0015\fhº\u000b1º\"îCí¶þ~\u0092R\u007fNus\n\u0010~PØE\u0086óUV\u0098YA\u009eqÀ~0";
      int var11 = "ÅA\u008aø;Ìn\u00adæÕ¨ç¬v\u008eÓ\u0018g\u0000t\u0015\fhº\u000b1º\"îCí¶þ~\u0092R\u007fNus\n\u0010~PØE\u0086óUV\u0098YA\u009eqÀ~0".length();
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
            long var2 = -6558956323895656613L;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25955;
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
            throw new RuntimeException("com/zelix/lk1", var10);
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
         throw new RuntimeException("com/zelix/lk1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
