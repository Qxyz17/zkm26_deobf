package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class _z5 {
   private static final long a = ess.a(1087026708320961996L, -2997537835263348710L, MethodHandles.lookup().lookupClass()).a(112382388628043L);

   public _z5(int param1, File param2, wp param3, wp param4, short param5, wp param6, String param7, File param8, _x7 param9, boolean param10, short param11) {
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
      // 005: iload 5
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 11
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_z5.a J
      // 01c: lxor
      // 01d: lstore 12
      // 01f: lload 12
      // 021: dup2
      // 022: ldc2_w 118624517821740
      // 025: lxor
      // 026: lstore 14
      // 028: dup2
      // 029: ldc2_w 30109714242281
      // 02c: lxor
      // 02d: lstore 16
      // 02f: pop2
      // 030: ldc2_w -1683253222929972820
      // 033: lload 12
      // 035: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 0
      // 03b: invokespecial java/lang/Object.<init> ()V
      // 03e: aload 8
      // 040: ldc2_w -1588439551702841079
      // 043: lload 12
      // 045: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: astore 19
      // 04c: astore 18
      // 04e: aload 19
      // 050: aload 18
      // 052: ifnonnull 068
      // 055: ifnull 0a3
      // 058: goto 066
      // 05b: ldc2_w -1071548377728667992
      // 05e: lload 12
      // 060: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: aload 19
      // 068: ldc2_w -1029589869508974774
      // 06b: lload 12
      // 06d: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 18
      // 074: ifnonnull 0a2
      // 077: ifne 0a3
      // 07a: goto 088
      // 07d: ldc2_w -1071548377728667992
      // 080: lload 12
      // 082: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 19
      // 08a: ldc2_w -1574737601140193413
      // 08d: lload 12
      // 08f: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: goto 0a2
      // 097: ldc2_w -1071548377728667992
      // 09a: lload 12
      // 09c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: pop
      // 0a3: aconst_null
      // 0a4: astore 20
      // 0a6: aconst_null
      // 0a7: astore 21
      // 0a9: new java/io/FileInputStream
      // 0ac: dup
      // 0ad: aload 2
      // 0ae: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0b1: astore 20
      // 0b3: new java/io/FileOutputStream
      // 0b6: dup
      // 0b7: aload 8
      // 0b9: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0bc: astore 21
      // 0be: new com/zelix/u
      // 0c1: dup
      // 0c2: lload 14
      // 0c4: aload 20
      // 0c6: aload 21
      // 0c8: aload 9
      // 0ca: aload 7
      // 0cc: aload 3
      // 0cd: lload 16
      // 0cf: invokevirtual com/zelix/wp.C (J)I
      // 0d2: aload 4
      // 0d4: lload 16
      // 0d6: invokevirtual com/zelix/wp.C (J)I
      // 0d9: aload 6
      // 0db: lload 16
      // 0dd: invokevirtual com/zelix/wp.C (J)I
      // 0e0: aload 2
      // 0e1: ldc2_w -1667072936366071586
      // 0e4: lload 12
      // 0e6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: iload 10
      // 0ed: invokespecial com/zelix/u.<init> (JLjava/io/InputStream;Ljava/io/OutputStream;Lcom/zelix/_x7;Ljava/lang/String;IIILjava/lang/String;Z)V
      // 0f0: pop
      // 0f1: aload 20
      // 0f3: aload 18
      // 0f5: ifnonnull 0fd
      // 0f8: ifnull 107
      // 0fb: aload 20
      // 0fd: ldc2_w -1653661823094660640
      // 100: lload 12
      // 102: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: goto 13d
      // 10a: astore 22
      // 10c: goto 13d
      // 10f: astore 23
      // 111: aload 20
      // 113: aload 18
      // 115: ifnonnull 12b
      // 118: ifnull 135
      // 11b: goto 129
      // 11e: ldc2_w -1071548377728667992
      // 121: lload 12
      // 123: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 20
      // 12b: ldc2_w -1653661823094660640
      // 12e: lload 12
      // 130: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: goto 13a
      // 138: astore 24
      // 13a: aload 23
      // 13c: athrow
      // 13d: aload 21
      // 13f: aload 18
      // 141: ifnonnull 157
      // 144: ifnull 161
      // 147: goto 155
      // 14a: ldc2_w -1071548377728667992
      // 14d: lload 12
      // 14f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 21
      // 157: ldc2_w -1693292299726415427
      // 15a: lload 12
      // 15c: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: goto 166
      // 164: astore 22
      // 166: return
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _z5(char var1, File var2, wp var3, wp var4, wp var5, String var6, ZipOutputStream var7, _x7 var8, int var9, boolean var10, boolean var11, short var12) {
      long var13 = ((long)var1 << 48 | (long)var9 << 32 >>> 16 | (long)var12 << 48 >>> 48) ^ a;
      long var15 = var13 ^ 42726552929447L;
      long var17 = var13 ^ 116763667767926L;
      long var19 = var13 ^ 125805221921370L;
      long var21 = var13 ^ 27163990156369L;
      long var23 = var13 ^ 114579008301972L;
      hk[] var10000 = x44.a<"q">(1864087048629956817L, var13);
      super();
      FileInputStream var26 = null;
      hk[] var25 = var10000;
      boolean var34 = false /* VF: Semaphore variable */;

      try {
         var34 = true;
         var26 = new FileInputStream(var2);
         sk var27 = new sk(var15, var7, x44.a<"i">(var2, 66758045044567408L, var13), var10);
         new u(
            var21,
            var26,
            x44.a<"i">(var27, new Object[]{var19}, 1798332723594825621L, var13),
            var8,
            var6,
            var3.C(var23),
            var4.C(var23),
            var5.C(var23),
            x44.a<"i">(var2, 66758045044567408L, var13),
            var11
         );
         x44.a<"i">(var27, new Object[]{var17}, 2176570899517182588L, var13);
         var34 = false;
      } finally {
         if (var34) {
            try {
               label61: {
                  label60: {
                     try {
                        var41 = var26;
                        if (var25 != null) {
                           break label60;
                        }

                        if (var26 == null) {
                           break label61;
                        }
                     } catch (IOException var35) {
                        throw x44.a<"q">(var35, 26013596690603989L, var13);
                     }

                     var41 = var26;
                  }

                  x44.a<"i">(var41, 1761030610879877277L, var13);
               }
            } catch (IOException var36) {
            }
         }
      }

      try {
         FileInputStream var42 = var26;
         if (var25 == null) {
            if (var26 == null) {
               return;
            }

            var42 = var26;
         }

         x44.a<"i">(var42, 1761030610879877277L, var13);
      } catch (IOException var38) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public _z5(
      ZipFile var1,
      ZipEntry var2,
      Long var3,
      wp var4,
      long var5,
      wp var7,
      wp var8,
      String var9,
      ZipOutputStream var10,
      vm var11,
      _x7 var12,
      boolean var13,
      boolean var14
   ) {
      var5 = a ^ var5;
      long var15 = var5 ^ 70450008787670L;
      long var17 = var5 ^ 8166579345719L;
      long var19 = var5 ^ 22701740477483L;
      long var21 = var5 ^ 139064552909344L;
      long var23 = var5 ^ 57623450883278L;
      long var25 = var5 ^ 16472938882533L;
      long var27 = var5 ^ 47915370811923L;
      hk[] var10000 = x44.a<"p">(1706854937574751904L, var5);
      super();
      hk[] var29 = var10000;
      InputStream var30 = null;
      boolean var39 = false /* VF: Semaphore variable */;

      try {
         var39 = true;
         var30 = x44.a<"h">(var1, var2, 1476708801167547563L, var5);
         String var31 = x44.a<"h">(var11, new Object[]{var23, var2.getName()}, 872304723528495247L, var5);
         sk var32 = new sk(var15, var10, var31, var13);
         new u(
            var21,
            var30,
            x44.a<"h">(var32, new Object[]{var19}, 1622862512878354916L, var5),
            var12,
            var9,
            var4.C(var25),
            var7.C(var25),
            var8.C(var25),
            x44.a<"p">(var27, var1, var2, 1275368792173225072L, var5),
            var14
         );
         x44.a<"h">(var32, new Object[]{var3, var17}, 1114007609411535372L, var5);
         var39 = false;
      } finally {
         if (var39) {
            try {
               label61: {
                  label60: {
                     try {
                        var47 = var30;
                        if (var29 != null) {
                           break label60;
                        }

                        if (var30 == null) {
                           break label61;
                        }
                     } catch (IOException var40) {
                        throw x44.a<"p">(var40, 1021488034533593508L, var5);
                     }

                     var47 = var30;
                  }

                  x44.a<"h">(var47, 1203173520402935467L, var5);
               }
            } catch (IOException var41) {
            }
         }
      }

      try {
         InputStream var48 = var30;
         if (var29 == null) {
            if (var30 == null) {
               return;
            }

            var48 = var30;
         }

         x44.a<"h">(var48, 1203173520402935467L, var5);
      } catch (IOException var43) {
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
