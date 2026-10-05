package com.zelix;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _rv {
   String S;
   ZipFile B;
   String H;
   int J;
   ZipEntry u;
   String j;
   _f2 I;
   po X;
   Path L;
   File p;
   private static final long a = ess.a(-4994677005171755034L, -3607967309422109183L, MethodHandles.lookup().lookupClass()).a(138581094582308L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public _f2 O(Object[] var1) {
      return this.I;
   }

   @Override
   public String toString() {
      return this.w();
   }

   public String J(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_rv.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 5123327335708166859
      // 09: lload 1
      // 0a: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 0
      // 11: aload 3
      // 12: ifnonnull 3b
      // 15: getfield com/zelix/_rv.I Lcom/zelix/_f2;
      // 18: ifnull 3a
      // 1b: goto 28
      // 1e: ldc2_w 5080575160126870605
      // 21: lload 1
      // 22: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/zelix/_rv.I Lcom/zelix/_f2;
      // 2c: invokevirtual com/zelix/_f2.x ()Ljava/lang/String;
      // 2f: areturn
      // 30: ldc2_w 5080575160126870605
      // 33: lload 1
      // 34: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc2_w 6390679110919117346
      // 3e: lload 1
      // 3f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: areturn
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 1052248702351825510L, var2);
   }

   public boolean M(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_rv.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 1209744147957636379
      // 15: lload 2
      // 16: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 1175336680018345993
      // 21: lload 2
      // 22: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 4b
      // 2c: bipush 2
      // 2d: if_icmpne 4e
      // 30: goto 3d
      // 33: ldc2_w 1247986126908113821
      // 36: lload 2
      // 37: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4b
      // 41: ldc2_w 1247986126908113821
      // 44: lload 2
      // 45: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = x44.a<"q">(-4205364302799533967L, var2);
      x44.a<"r">(this, null, -4251394642480772600L, var2);
      x44.a<"r">(this, null, -2597947851278293516L, var2);
      String var4 = var10000;

      label32: {
         label31: {
            try {
               var10 = x44.a<"m">(this, -2664363991812465591L, var2);
               if (var4 != null) {
                  break label31;
               }

               if (var10 == null) {
                  return;
               }
            } catch (IOException var8) {
               throw x44.a<"q">(var8, -4306593175362824457L, var2);
            }

            try {
               var10 = x44.a<"m">(this, -2664363991812465591L, var2);
            } catch (IOException var7) {
               boolean var10001 = false;
               break label32;
            }
         }

         try {
            x44.a<"i">(var10, -4175137209576452027L, var2);
         } catch (IOException var6) {
            boolean var11 = false;
         }
      }

      x44.a<"r">(this, null, -2664363991812465591L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 92239073078312L;
      long var3 = var1 ^ 123655782254667L;
      return x44.a<"i">(this, new Object[]{var3}, -3088584786556742295L, var1).hashCode();
   }

   public _rv(int var1, String var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      super();
      x44.a<"s">(this, new File(var2), -7752664985759769759L, var4);
      x44.a<"s">(this, 1, -7760557921055570934L, var4);
      this.H = x44.a<"h">(x44.a<"l">(this, -7752664985759769759L, var4), -8423700758992796902L, var4);
   }

   public _rv(long var1, ZipFile var3, ZipEntry var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 14105894438193L;
      this(var3, var5, var4, null);
   }

   public String C(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_rv.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 6320578810305
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: new java/lang/StringBuilder
      // 11: dup
      // 12: invokespecial java/lang/StringBuilder.<init> ()V
      // 15: astore 6
      // 17: ldc2_w 2340960261727153582
      // 1a: lload 1
      // 1b: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: lload 3
      // 22: invokevirtual com/zelix/_rv.J (J)Ljava/lang/String;
      // 25: astore 7
      // 27: astore 5
      // 29: aload 7
      // 2b: aload 5
      // 2d: ifnonnull 6c
      // 30: ifnull 5d
      // 33: goto 40
      // 36: ldc2_w 2442254834467566376
      // 39: lload 1
      // 3a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 6
      // 42: aload 7
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: pop
      // 48: aload 6
      // 4a: ldc "!"
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 2442254834467566376
      // 56: lload 1
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 6
      // 5f: aload 0
      // 60: invokevirtual com/zelix/_rv.w ()Ljava/lang/String;
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: pop
      // 67: aload 6
      // 69: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c: areturn
   }

   public InputStream H(Object[] param1) {
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
      // 00e: checkcast com/zelix/wp
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/_rv.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w 5978991441358233387
      // 01c: lload 3
      // 01d: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 5
      // 024: aload 0
      // 025: ldc2_w 5944708174704951865
      // 028: lload 3
      // 029: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: lookupswitch 313 2 1 26 2 79
      // 048: new java/io/FileInputStream
      // 04b: dup
      // 04c: aload 0
      // 04d: getfield com/zelix/_rv.H Ljava/lang/String;
      // 050: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 053: astore 6
      // 055: aload 2
      // 056: aload 5
      // 058: ifnonnull 06c
      // 05b: ifnull 07a
      // 05e: goto 06b
      // 061: ldc2_w 6008301253587894701
      // 064: lload 3
      // 065: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 2
      // 06c: aload 6
      // 06e: ldc2_w 5762153550991002833
      // 071: lload 3
      // 072: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: invokevirtual com/zelix/wp.V (I)V
      // 07a: aload 6
      // 07c: areturn
      // 07d: aload 0
      // 07e: aload 5
      // 080: lload 3
      // 081: lconst_0
      // 082: lcmp
      // 083: ifle 0cd
      // 086: ifnonnull 0cb
      // 089: ldc2_w 5502388757290650387
      // 08c: lload 3
      // 08d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipFile; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: ifnonnull 0ca
      // 095: goto 0a2
      // 098: ldc2_w 6008301253587894701
      // 09b: lload 3
      // 09c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: new com/zelix/_ux
      // 0a6: dup
      // 0a7: aload 0
      // 0a8: ldc2_w 5571043802270584770
      // 0ab: lload 3
      // 0ac: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: invokespecial com/zelix/_ux.<init> (Ljava/lang/String;)V
      // 0b4: ldc2_w 5502388757290650387
      // 0b7: lload 3
      // 0b8: invokedynamic p (Ljava/lang/Object;Ljava/util/zip/ZipFile;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: goto 0ca
      // 0c0: ldc2_w 6008301253587894701
      // 0c3: lload 3
      // 0c4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: aload 5
      // 0cd: ifnonnull 118
      // 0d0: ldc2_w 5523685055200096942
      // 0d3: lload 3
      // 0d4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: ifnonnull 117
      // 0dc: goto 0e9
      // 0df: ldc2_w 6008301253587894701
      // 0e2: lload 3
      // 0e3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: aload 0
      // 0eb: ldc2_w 5502388757290650387
      // 0ee: lload 3
      // 0ef: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipFile; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: aload 0
      // 0f5: getfield com/zelix/_rv.H Ljava/lang/String;
      // 0f8: ldc2_w 5421009318201440379
      // 0fb: lload 3
      // 0fc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: ldc2_w 5523685055200096942
      // 104: lload 3
      // 105: invokedynamic p (Ljava/lang/Object;Ljava/util/zip/ZipEntry;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: goto 117
      // 10d: ldc2_w 6008301253587894701
      // 110: lload 3
      // 111: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 0
      // 118: ldc2_w 5502388757290650387
      // 11b: lload 3
      // 11c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipFile; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: aload 0
      // 122: ldc2_w 5523685055200096942
      // 125: lload 3
      // 126: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: ldc2_w 5657989385304704592
      // 12e: lload 3
      // 12f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: astore 7
      // 136: aload 2
      // 137: aload 5
      // 139: ifnonnull 14d
      // 13c: ifnull 164
      // 13f: goto 14c
      // 142: ldc2_w 6008301253587894701
      // 145: lload 3
      // 146: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 2
      // 14d: aload 0
      // 14e: ldc2_w 5523685055200096942
      // 151: lload 3
      // 152: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipEntry; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: ldc2_w 5718350634502321136
      // 15a: lload 3
      // 15b: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: l2i
      // 161: invokevirtual com/zelix/wp.V (I)V
      // 164: aload 7
      // 166: areturn
      // 167: new java/lang/RuntimeException
      // 16a: dup
      // 16b: new java/lang/StringBuilder
      // 16e: dup
      // 16f: invokespecial java/lang/StringBuilder.<init> ()V
      // 172: sipush 19213
      // 175: ldc2_w 3091959409890204895
      // 178: lload 3
      // 179: lxor
      // 17a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_rv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 182: aload 0
      // 183: ldc2_w 5944708174704951865
      // 186: lload 3
      // 187: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 18f: sipush 9634
      // 192: ldc2_w 6221084613901087347
      // 195: lload 3
      // 196: lxor
      // 197: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_rv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: aload 0
      // 1a0: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a3: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ac: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1af: athrow
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_rv.a J
      // 03: ldc2_w 66686537973684
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 34309888973783
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -7232290799756781965
      // 14: lload 2
      // 15: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: instanceof com/zelix/_rv
      // 20: aload 6
      // 22: ifnonnull 79
      // 25: ifeq 78
      // 28: goto 35
      // 2b: ldc2_w -7333585363294893835
      // 2e: lload 2
      // 2f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: lload 4
      // 38: bipush 1
      // 39: anewarray 414
      // 3c: dup_x2
      // 3d: dup_x2
      // 3e: pop
      // 3f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w -8737181452982335755
      // 48: lload 2
      // 49: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: aload 1
      // 4f: checkcast com/zelix/_rv
      // 52: lload 4
      // 54: bipush 1
      // 55: anewarray 414
      // 58: dup_x2
      // 59: dup_x2
      // 5a: pop
      // 5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w -8737181452982335755
      // 64: lload 2
      // 65: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6d: ireturn
      // 6e: ldc2_w -7333585363294893835
      // 71: lload 2
      // 72: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: bipush 0
      // 79: ireturn
   }

   public _rv(File var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 46246217451620L;
      int var4 = (int)((var2 ^ 46246217451620L) >>> 56);
      int var5 = (int)((var2 ^ 46246217451620L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      this((byte)var4, null, var5, var1, var6);
   }

   private String K(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_rv.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 24134972753775
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -5272920524871304448
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w -5308425477285108206
      // 2a: lload 2
      // 2b: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: bipush 1
      // 31: aload 6
      // 33: ifnonnull 72
      // 36: if_icmpne 55
      // 39: goto 46
      // 3c: ldc2_w -5239179942301014650
      // 3f: lload 2
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/zelix/_rv.H Ljava/lang/String;
      // 4a: areturn
      // 4b: ldc2_w -5239179942301014650
      // 4e: lload 2
      // 4f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: aload 6
      // 58: ifnonnull 76
      // 5b: ldc2_w -5308425477285108206
      // 5e: lload 2
      // 5f: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: bipush 3
      // 65: goto 72
      // 68: ldc2_w -5239179942301014650
      // 6b: lload 2
      // 6c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: if_icmpne 85
      // 75: aload 0
      // 76: ldc2_w -5476033419828364061
      // 79: lload 2
      // 7a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/nio/file/Path; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: invokeinterface java/nio/file/Path.toString ()Ljava/lang/String; 1
      // 84: areturn
      // 85: new java/lang/StringBuilder
      // 88: dup
      // 89: invokespecial java/lang/StringBuilder.<init> ()V
      // 8c: aload 0
      // 8d: lload 4
      // 8f: invokevirtual com/zelix/_rv.J (J)Ljava/lang/String;
      // 92: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 95: sipush 19243
      // 98: ldc2_w 4205861070335763857
      // 9b: lload 2
      // 9c: lxor
      // 9d: invokedynamic e (IJ)I bsm=com/zelix/_rv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a5: aload 0
      // a6: getfield com/zelix/_rv.H Ljava/lang/String;
      // a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // af: areturn
   }

   public _rv(ZipFile var1, long var2, ZipEntry var4, _f2 var5) {
      var2 = a ^ var2;
      super();
      x44.a<"s">(this, var1, -3285651393055353560L, var2);
      x44.a<"s">(this, x44.a<"h">(var1, -3315482541385561483L, var2), -3212404850868858375L, var2);
      x44.a<"s">(this, var4, -3273133595982074731L, var2);
      x44.a<"s">(this, b<"e">(911, 1271061870887720743L ^ var2), -3727656086524339198L, var2);
      this.H = var4.getName();
      this.I = var5;
   }

   private _rv(long var1, StringBuilder var3) {
      var1 = a ^ var1;
      super();
      x44.a<"s">(this, null, -188851444024577431L, var1);
      x44.a<"s">(this, b<"e">(20232, 3046945314387798691L ^ var1), -196780241105588990L, var1);
      this.H = var3.toString();
   }

   public _rv(Path var1, po var2, long var3) {
      var3 = a ^ var3;
      super();
      x44.a<"v">(this, x44.a<"m">(var1, -1851564499054796517L, var3), -2117768782499599746L, var3);
      x44.a<"v">(this, var2, -2103910715042552535L, var3);
      x44.a<"v">(this, b<"e">(3426, 7556247033205388614L ^ var3), -2249060680448806769L, var3);
      this.H = var1.toString();
   }

   public boolean h(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_rv.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8470861194695293020
      // 15: lload 2
      // 16: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 8433261878747096398
      // 21: lload 2
      // 22: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 4b
      // 2c: bipush 1
      // 2d: if_icmpne 4e
      // 30: goto 3d
      // 33: ldc2_w 8365128727273809626
      // 36: lload 2
      // 37: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4b
      // 41: ldc2_w 8365128727273809626
      // 44: lload 2
      // 45: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public static _rv P(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 97542551710257L;
      return new _rv(var4, new StringBuilder(var1));
   }

   public _rv(byte param1, String param2, int param3, File param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 56
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 8
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 40
      // 13: lshl
      // 14: bipush 40
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/_rv.a J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: ldc2_w 7340548989073762316
      // 21: lload 6
      // 23: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: invokespecial java/lang/Object.<init> ()V
      // 2c: astore 8
      // 2e: aload 0
      // 2f: aload 4
      // 31: ldc2_w 7313095943026502261
      // 34: lload 6
      // 36: invokedynamic w (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 0
      // 3c: bipush 1
      // 3d: ldc2_w 7302767076798395678
      // 40: lload 6
      // 42: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 0
      // 48: aload 4
      // 4a: ldc2_w 8794780808890298894
      // 4d: lload 6
      // 4f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: aload 8
      // 56: ifnonnull 81
      // 59: putfield com/zelix/_rv.H Ljava/lang/String;
      // 5c: aload 2
      // 5d: ifnull 8b
      // 60: goto 6e
      // 63: ldc2_w 7225670771060651658
      // 66: lload 6
      // 68: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 0
      // 6f: aload 2
      // 70: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 73: goto 81
      // 76: ldc2_w 7225670771060651658
      // 79: lload 6
      // 7b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: ldc2_w 7269118352391188509
      // 84: lload 6
      // 86: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: return
   }

   public File a(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_rv.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 4407507336484516088
      // 15: lload 2
      // 16: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 4
      // 20: ifnonnull 60
      // 23: ldc2_w 4444174378391973354
      // 26: lload 2
      // 27: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: lookupswitch 129 2 1 38 2 127
      // 48: ldc2_w 4373839334591196798
      // 4b: lload 2
      // 4c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 0
      // 53: goto 60
      // 56: ldc2_w 4373839334591196798
      // 59: lload 2
      // 5a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: ldc2_w 4434098365428380289
      // 63: lload 2
      // 64: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 4
      // 6b: ifnonnull aa
      // 6e: ifnonnull a0
      // 71: goto 7e
      // 74: ldc2_w 4373839334591196798
      // 77: lload 2
      // 78: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: new java/io/File
      // 82: dup
      // 83: aload 0
      // 84: getfield com/zelix/_rv.H Ljava/lang/String;
      // 87: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 8a: ldc2_w 4434098365428380289
      // 8d: lload 2
      // 8e: invokedynamic s (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: goto a0
      // 96: ldc2_w 4373839334591196798
      // 99: lload 2
      // 9a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: aload 0
      // a1: ldc2_w 4434098365428380289
      // a4: lload 2
      // a5: invokedynamic l (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: areturn
      // ab: aconst_null
      // ac: areturn
      // ad: new java/lang/RuntimeException
      // b0: dup
      // b1: new java/lang/StringBuilder
      // b4: dup
      // b5: invokespecial java/lang/StringBuilder.<init> ()V
      // b8: sipush 7338
      // bb: ldc2_w 386462737500153001
      // be: lload 2
      // bf: lxor
      // c0: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_rv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c8: aload 0
      // c9: ldc2_w 4444174378391973354
      // cc: lload 2
      // cd: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // d5: sipush 27903
      // d8: ldc2_w 5362145320108479743
      // db: lload 2
      // dc: lxor
      // dd: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/_rv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e5: aload 0
      // e6: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // e9: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f2: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // f5: athrow
   }

   public String w() {
      return this.H;
   }

   static {
      long var11 = a ^ 66796156939481L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "\u0095PÕ\u0099)9dç¥ò\u008a0\u001bQïÅ\u0090\u0089\u0088B\u000eÔXÐ\u0082ÞW5\u0019ª\u0016\f\u0010¦ß I<\u0010\u0082¥ÏxH\u0096Hy}ù";
      int var19 = "\u0095PÕ\u0099)9dç¥ò\u008a0\u001bQïÅ\u0090\u0089\u0088B\u000eÔXÐ\u0082ÞW5\u0019ª\u0016\f\u0010¦ß I<\u0010\u0082¥ÏxH\u0096Hy}ù".length();
      char var16 = ' ';
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
                     b = var20;
                     c = new String[4];
                     g = new HashMap(13);
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
                     String var4 = "'N\u0085'é³7Âkc%\u009d5dçw";
                     int var5 = "'N\u0085'é³7Âkc%\u009d5dçw".length();
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
                                    e = var6;
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = " ]-\u0082Ï8I\u008c!waD\t7Oª";
                                 var5 = " ]-\u0082Ï8I\u008c!waD\t7Oª".length();
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

                  var17 = "iå|°k²\u0098äQÄ\u001e\u0016mÚ3¿~\u00adx«G/×m\u0010\u0004w=â\u0010\u0086¨ÿD¸gJ<þWi";
                  var19 = "iå|°k²\u0098äQÄ\u001e\u0016mÚ3¿~\u00adx«G/×m\u0010\u0004w=â\u0010\u0086¨ÿD¸gJ<þWi".length();
                  var16 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6040;
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
            throw new RuntimeException("com/zelix/_rv", var10);
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
         throw new RuntimeException("com/zelix/_rv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2776;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_rv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/_rv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
