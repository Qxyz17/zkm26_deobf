package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class bo extends bf {
   ij[][] T;
   ij[][] i;
   private static final long d = ess.a(-2257055893622835335L, 2582792460939798305L, MethodHandles.lookup().lookupClass()).a(253410478787967L);
   private static final String[] f;
   private static final String[] g;
   private static final Map j = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void i(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      HashMap var2 = (HashMap)var1[2];
      HashMap var7 = (HashMap)var1[3];
      long var4 = (Long)var1[4];
      long var8 = var4 ^ 101411721701567L;
      boolean var10 = x44.a<"s">(4349794608319891481L, var4);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"o">(this, 2588619453896035786L, var4);
            if (var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var15) {
            throw x44.a<"s">(var15, 4496019013832822895L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"o">(this, 2599727170545117993L, var4).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < x44.a<"o">(this, 2599727170545117993L, var4)[var11].length) {
                  try {
                     x44.a<"k">(x44.a<"o">(this, 2599727170545117993L, var4)[var11][var12], new Object[]{var8, var2, var7}, 2761714781533950609L, var4);
                     var12++;
                  } catch (gj var14) {
                     boolean var10001 = false;
                     throw x44.a<"s">(var14, 4496019013832822895L, var4);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var4 <= 0L) {
                           break label57;
                        }

                        if (var10) {
                           break label56;
                        }

                        if (!var10) {
                           break;
                        }
                     } catch (gj var13) {
                        boolean var18 = false;
                        throw x44.a<"s">(var13, 4496019013832822895L, var4);
                     }

                     if (var4 > 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (var17) {
            break;
         }
      }
   }

   int x(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 9858694472928
      // 05: lxor
      // 06: lstore 3
      // 07: pop2
      // 08: ldc2_w 1283234628292256164
      // 0b: lload 1
      // 0c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 5
      // 13: aload 0
      // 14: ldc2_w 1371513101512654126
      // 17: lload 1
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: iload 5
      // 1f: ifeq e4
      // 22: ifeq d9
      // 25: goto 32
      // 28: ldc2_w 1045144296614748299
      // 2b: lload 1
      // 2c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 1
      // 33: istore 6
      // 35: aload 0
      // 36: ldc2_w 1508739263793126349
      // 39: lload 1
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: arraylength
      // 40: istore 7
      // 42: bipush 0
      // 43: istore 8
      // 45: iload 8
      // 47: iload 7
      // 49: if_icmpge c8
      // 4c: iinc 6 2
      // 4f: aload 0
      // 50: ldc2_w 1508739263793126349
      // 53: lload 1
      // 54: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: iload 8
      // 5b: aaload
      // 5c: arraylength
      // 5d: istore 9
      // 5f: bipush 0
      // 60: iload 5
      // 62: ifeq d8
      // 65: istore 10
      // 67: iload 10
      // 69: iload 9
      // 6b: if_icmpge c0
      // 6e: iload 6
      // 70: aload 0
      // 71: ldc2_w 1508739263793126349
      // 74: lload 1
      // 75: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: iload 8
      // 7c: aaload
      // 7d: iload 10
      // 7f: aaload
      // 80: lload 3
      // 81: bipush 1
      // 82: anewarray 386
      // 85: dup_x2
      // 86: dup_x2
      // 87: pop
      // 88: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b: bipush 0
      // 8c: swap
      // 8d: aastore
      // 8e: ldc2_w 1373687979499687839
      // 91: lload 1
      // 92: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: iadd
      // 98: istore 6
      // 9a: iinc 10 1
      // 9d: iload 5
      // 9f: lload 1
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle c5
      // a5: ifeq c3
      // a8: iload 5
      // aa: ifne 67
      // ad: lload 1
      // ae: lconst_0
      // af: lcmp
      // b0: ifle 9d
      // b3: goto c0
      // b6: ldc2_w 1045144296614748299
      // b9: lload 1
      // ba: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: iinc 8 1
      // c3: iload 5
      // c5: ifne 45
      // c8: aload 0
      // c9: iload 6
      // cb: putfield com/zelix/bo.C I
      // ce: aload 0
      // cf: lload 1
      // d0: lconst_0
      // d1: lcmp
      // d2: ifle 50
      // d5: getfield com/zelix/bo.C I
      // d8: ireturn
      // d9: aload 0
      // da: ldc2_w 1153830147368182308
      // dd: lload 1
      // de: invokedynamic k (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: arraylength
      // e4: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void L(Object[] var1) {
      Set var6 = (Set)var1[0];
      long var4 = (Long)var1[1];
      Set var7 = (Set)var1[2];
      Set var3 = (Set)var1[3];
      Set var2 = (Set)var1[4];
      long var8 = var4 ^ 42185617440804L;
      boolean var10 = x44.a<"q">(-2235837875945746286L, var4);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"m">(this, -2144041409982739432L, var4);
            if (!var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var15) {
            throw x44.a<"q">(var15, -20447175350971971L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"m">(this, -1889721796972369157L, var4).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < x44.a<"m">(this, -1889721796972369157L, var4)[var11].length) {
                  try {
                     x44.a<"i">(
                        x44.a<"m">(this, -1889721796972369157L, var4)[var11][var12], new Object[]{var6, var7, var3, var2, var8}, -573506460239062235L, var4
                     );
                     var12++;
                  } catch (gj var14) {
                     boolean var10001 = false;
                     throw x44.a<"q">(var14, -20447175350971971L, var4);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var4 < 0L) {
                           break label57;
                        }

                        if (!var10) {
                           break label56;
                        }

                        if (var10) {
                           break;
                        }
                     } catch (gj var13) {
                        boolean var18 = false;
                        throw x44.a<"q">(var13, -20447175350971971L, var4);
                     }

                     if (var4 >= 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (!var17) {
            break;
         }
      }
   }

   public boolean z(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_ur
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 6
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 135969088811257
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 84682767183806
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 16041231820442
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 138793644550972
      // 03e: lxor
      // 03f: lstore 13
      // 041: dup2
      // 042: ldc2_w 119829933642006
      // 045: lxor
      // 046: lstore 15
      // 048: dup2
      // 049: ldc2_w 117584872142572
      // 04c: lxor
      // 04d: lstore 17
      // 04f: pop2
      // 050: ldc2_w -7604715011080216014
      // 053: lload 2
      // 054: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: istore 19
      // 05b: aload 0
      // 05c: ldc2_w -8518678031365494815
      // 05f: lload 2
      // 060: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: iload 19
      // 067: ifne 37d
      // 06a: ifeq 37c
      // 06d: goto 07a
      // 070: ldc2_w -7760232519340721596
      // 073: lload 2
      // 074: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 5
      // 07c: lload 9
      // 07e: bipush 1
      // 07f: anewarray 386
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 0
      // 089: swap
      // 08a: aastore
      // 08b: ldc2_w -7925170628590340812
      // 08e: lload 2
      // 08f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: astore 20
      // 096: bipush 0
      // 097: istore 21
      // 099: bipush 1
      // 09a: istore 22
      // 09c: new java/util/ArrayList
      // 09f: dup
      // 0a0: invokespecial java/util/ArrayList.<init> ()V
      // 0a3: astore 23
      // 0a5: bipush 0
      // 0a6: istore 24
      // 0a8: iload 24
      // 0aa: aload 0
      // 0ab: ldc2_w -8196803328182632190
      // 0ae: lload 2
      // 0af: invokedynamic l (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: arraylength
      // 0b5: if_icmpge 2e5
      // 0b8: new java/util/ArrayList
      // 0bb: dup
      // 0bc: invokespecial java/util/ArrayList.<init> ()V
      // 0bf: astore 25
      // 0c1: aload 23
      // 0c3: aload 25
      // 0c5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ca: pop
      // 0cb: bipush 0
      // 0cc: iload 19
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 2ef
      // 0d4: ifne 2ed
      // 0d7: istore 26
      // 0d9: iload 26
      // 0db: aload 0
      // 0dc: ldc2_w -8196803328182632190
      // 0df: lload 2
      // 0e0: invokedynamic l (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: iload 24
      // 0e7: aaload
      // 0e8: arraylength
      // 0e9: if_icmpge 2d7
      // 0ec: aload 0
      // 0ed: ldc2_w -8196803328182632190
      // 0f0: lload 2
      // 0f1: invokedynamic l (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: iload 24
      // 0f8: aaload
      // 0f9: iload 26
      // 0fb: aaload
      // 0fc: astore 27
      // 0fe: aload 27
      // 100: lload 17
      // 102: bipush 1
      // 103: anewarray 386
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -8418494451053547783
      // 112: lload 2
      // 113: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: astore 28
      // 11a: aload 4
      // 11c: aload 28
      // 11e: lload 15
      // 120: bipush 2
      // 121: anewarray 386
      // 124: dup_x2
      // 125: dup_x2
      // 126: pop
      // 127: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12a: bipush 1
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w -8498332937972078430
      // 135: lload 2
      // 136: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: iload 19
      // 13d: ifne 0aa
      // 140: iload 19
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: iflt 0ce
      // 148: ifne 2cd
      // 14b: ifeq 2bf
      // 14e: goto 15b
      // 151: ldc2_w -7760232519340721596
      // 154: lload 2
      // 155: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: bipush 0
      // 15c: istore 22
      // 15e: aload 25
      // 160: aload 27
      // 162: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 167: pop
      // 168: new java/lang/StringBuilder
      // 16b: dup
      // 16c: invokespecial java/lang/StringBuilder.<init> ()V
      // 16f: sipush 4682
      // 172: ldc2_w 1864689558428399862
      // 175: lload 2
      // 176: lxor
      // 177: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: aload 0
      // 180: bipush 0
      // 181: anewarray 386
      // 184: ldc2_w -8491719658665068397
      // 187: lload 2
      // 188: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: sipush 20340
      // 193: lload 2
      // 194: lconst_0
      // 195: lcmp
      // 196: ifle 1b9
      // 199: ldc2_w 1663328549405582797
      // 19c: lload 2
      // 19d: lxor
      // 19e: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: iload 19
      // 1a5: ifne 1d8
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: aload 0
      // 1ac: bipush 0
      // 1ad: anewarray 386
      // 1b0: ldc2_w -8327307875753977279
      // 1b3: lload 2
      // 1b4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: ifeq 1db
      // 1bc: goto 1c9
      // 1bf: ldc2_w -7760232519340721596
      // 1c2: lload 2
      // 1c3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: ldc ""
      // 1cb: goto 1d8
      // 1ce: ldc2_w -7760232519340721596
      // 1d1: lload 2
      // 1d2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: goto 216
      // 1db: new java/lang/StringBuilder
      // 1de: dup
      // 1df: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e2: ldc "'"
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: aload 0
      // 1e8: lload 7
      // 1ea: bipush 1
      // 1eb: anewarray 386
      // 1ee: dup_x2
      // 1ef: dup_x2
      // 1f0: pop
      // 1f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f4: bipush 0
      // 1f5: swap
      // 1f6: aastore
      // 1f7: ldc2_w -8591897758050952770
      // 1fa: lload 2
      // 1fb: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: sipush 6716
      // 206: ldc2_w 423464337520668813
      // 209: lload 2
      // 20a: lxor
      // 20b: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: sipush 5872
      // 21c: ldc2_w 6103203389829299272
      // 21f: lload 2
      // 220: lxor
      // 221: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 229: aload 0
      // 22a: lload 13
      // 22c: invokevirtual com/zelix/bo.o (J)Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: sipush 10774
      // 235: ldc2_w 6343526714085965988
      // 238: lload 2
      // 239: lxor
      // 23a: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 242: aload 28
      // 244: lload 11
      // 246: invokevirtual com/zelix/hz.q (J)Ljava/lang/String;
      // 249: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24c: sipush 18529
      // 24f: ldc2_w 4632942136558641874
      // 252: lload 2
      // 253: lxor
      // 254: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25f: astore 29
      // 261: iload 19
      // 263: lload 2
      // 264: lconst_0
      // 265: lcmp
      // 266: ifle 2b6
      // 269: ifne 2b4
      // 26c: aload 5
      // 26e: ldc2_w -7659697782222838752
      // 271: lload 2
      // 272: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: ifeq 2ad
      // 27a: goto 287
      // 27d: ldc2_w -7760232519340721596
      // 280: lload 2
      // 281: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: athrow
      // 287: aload 20
      // 289: new java/lang/StringBuilder
      // 28c: dup
      // 28d: invokespecial java/lang/StringBuilder.<init> ()V
      // 290: ldc "\t"
      // 292: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 295: aload 29
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2a0: goto 2ad
      // 2a3: ldc2_w -7760232519340721596
      // 2a6: lload 2
      // 2a7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: athrow
      // 2ad: aload 6
      // 2af: aload 29
      // 2b1: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2b4: iload 19
      // 2b6: lload 2
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: iflt 2d4
      // 2bc: ifeq 2cf
      // 2bf: bipush 1
      // 2c0: goto 2cd
      // 2c3: ldc2_w -7760232519340721596
      // 2c6: lload 2
      // 2c7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: istore 21
      // 2cf: iinc 26 1
      // 2d2: iload 19
      // 2d4: ifeq 0d9
      // 2d7: iinc 24 1
      // 2da: iload 19
      // 2dc: lload 2
      // 2dd: lconst_0
      // 2de: lcmp
      // 2df: ifle 0aa
      // 2e2: ifeq 0a8
      // 2e5: lload 2
      // 2e6: lconst_0
      // 2e7: lcmp
      // 2e8: ifle 0b8
      // 2eb: iload 21
      // 2ed: iload 19
      // 2ef: ifne 37b
      // 2f2: ifeq 379
      // 2f5: goto 302
      // 2f8: ldc2_w -7760232519340721596
      // 2fb: lload 2
      // 2fc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: athrow
      // 302: aload 23
      // 304: invokeinterface java/util/List.size ()I 1
      // 309: istore 24
      // 30b: iload 24
      // 30d: anewarray 390
      // 310: astore 25
      // 312: bipush 0
      // 313: istore 26
      // 315: iload 26
      // 317: iload 24
      // 319: if_icmpge 36d
      // 31c: aload 23
      // 31e: iload 26
      // 320: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 325: checkcast java/util/List
      // 328: astore 27
      // 32a: aload 27
      // 32c: invokeinterface java/util/List.size ()I 1
      // 331: anewarray 308
      // 334: astore 28
      // 336: aload 25
      // 338: iload 26
      // 33a: aload 27
      // 33c: aload 28
      // 33e: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 343: checkcast [Lcom/zelix/ij;
      // 346: aastore
      // 347: iinc 26 1
      // 34a: iload 19
      // 34c: lload 2
      // 34d: lconst_0
      // 34e: lcmp
      // 34f: iflt 357
      // 352: ifne 379
      // 355: iload 19
      // 357: ifeq 315
      // 35a: lload 2
      // 35b: lconst_0
      // 35c: lcmp
      // 35d: ifle 34a
      // 360: goto 36d
      // 363: ldc2_w -7760232519340721596
      // 366: lload 2
      // 367: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36c: athrow
      // 36d: aload 0
      // 36e: aload 25
      // 370: ldc2_w -8196803328182632190
      // 373: lload 2
      // 374: invokedynamic s (Ljava/lang/Object;[[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: iload 22
      // 37b: ireturn
      // 37c: bipush 1
      // 37d: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void G(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 31907941211067L;
      boolean var7 = x44.a<"q">(-679861960243362054L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"m">(this, -840266747045520784L, var2);
            if (!var7) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"q">(var12, -1594473223606728747L, var2);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < x44.a<"m">(this, -887688085765014381L, var2).length) {
         int var9 = 0;

         label57: {
            label56: {
               label55:
               while (var9 < x44.a<"m">(this, -887688085765014381L, var2)[var8].length) {
                  try {
                     x44.a<"i">(x44.a<"m">(this, -887688085765014381L, var2)[var8][var9], new Object[]{var5, var4}, -1531721234721476210L, var2);
                     var9++;
                  } catch (gj var11) {
                     boolean var10001 = false;
                     throw x44.a<"q">(var11, -1594473223606728747L, var2);
                  }

                  while (true) {
                     try {
                        var14 = var7;
                        if (var2 <= 0L) {
                           break label57;
                        }

                        if (!var7) {
                           break label56;
                        }

                        if (var7) {
                           break;
                        }
                     } catch (gj var10) {
                        boolean var15 = false;
                        throw x44.a<"q">(var10, -1594473223606728747L, var2);
                     }

                     if (var2 >= 0L) {
                        break label55;
                     }
                  }
               }

               var8++;
            }

            var14 = var7;
         }

         if (!var14) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void Y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 82283159740056L;
      boolean var6 = x44.a<"s">(-4029987948042258312L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"o">(this, -3831160656607419150L, var2);
            if (!var6) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var11) {
            throw x44.a<"s">(var11, -2928055011046999721L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < x44.a<"o">(this, -3662426959485337071L, var2).length) {
         int var8 = 0;

         label57: {
            label56: {
               label55:
               while (var8 < x44.a<"o">(this, -3662426959485337071L, var2)[var7].length) {
                  try {
                     x44.a<"k">(x44.a<"o">(this, -3662426959485337071L, var2)[var7][var8], new Object[]{var4}, -3105469655126740702L, var2);
                     var8++;
                  } catch (gj var10) {
                     boolean var10001 = false;
                     throw x44.a<"s">(var10, -2928055011046999721L, var2);
                  }

                  while (true) {
                     try {
                        var13 = var6;
                        if (var2 <= 0L) {
                           break label57;
                        }

                        if (!var6) {
                           break label56;
                        }

                        if (var6) {
                           break;
                        }
                     } catch (gj var9) {
                        boolean var14 = false;
                        throw x44.a<"s">(var9, -2928055011046999721L, var2);
                     }

                     if (var2 >= 0L) {
                        break label55;
                     }
                  }
               }

               var7++;
            }

            var13 = var6;
         }

         if (!var13) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void E(Object[] var1) {
      _yv var2 = (_yv)var1[0];
      _ug var6 = (_ug)var1[1];
      long var4 = (Long)var1[2];
      ei var3 = (ei)var1[3];
      _ur var7 = (_ur)var1[4];
      long var8 = var4 ^ 69512517282039L;
      boolean var10 = x44.a<"u">(-7139372830608480081L, var4);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"i">(this, -8981630423852176004L, var4);
            if (var10) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var15) {
            throw x44.a<"u">(var15, -7002155817084849959L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"i">(this, -8889438206998262881L, var4).length) {
         int var12 = 0;

         label57: {
            label56: {
               label55:
               while (var12 < x44.a<"i">(this, -8889438206998262881L, var4)[var11].length) {
                  try {
                     x44.a<"m">(x44.a<"i">(this, -8889438206998262881L, var4)[var11][var12], new Object[]{var6, var3, var8, var7}, -7253833923259071475L, var4);
                     var12++;
                  } catch (gj var14) {
                     boolean var10001 = false;
                     throw x44.a<"u">(var14, -7002155817084849959L, var4);
                  }

                  while (true) {
                     try {
                        var17 = var10;
                        if (var4 < 0L) {
                           break label57;
                        }

                        if (var10) {
                           break label56;
                        }

                        if (!var10) {
                           break;
                        }
                     } catch (gj var13) {
                        boolean var18 = false;
                        throw x44.a<"u">(var13, -7002155817084849959L, var4);
                     }

                     if (var4 >= 0L) {
                        break label55;
                     }
                  }
               }

               var11++;
            }

            var17 = var10;
         }

         if (var17) {
            break;
         }
      }
   }

   public String[] m(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: pop
      // 017: getstatic com/zelix/bo.d J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 92130617466643
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 79405902410353
      // 029: lxor
      // 02a: lstore 7
      // 02c: pop2
      // 02d: ldc2_w -739439004483009066
      // 030: lload 2
      // 031: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: istore 9
      // 038: aload 0
      // 039: ldc2_w -614005935205295780
      // 03c: lload 2
      // 03d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: iload 9
      // 044: ifeq 15b
      // 047: ifeq 15a
      // 04a: goto 057
      // 04d: ldc2_w -1516848791296113415
      // 050: lload 2
      // 051: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: aload 0
      // 058: iload 9
      // 05a: ifeq 137
      // 05d: goto 06a
      // 060: ldc2_w -1516848791296113415
      // 063: lload 2
      // 064: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: ldc2_w -766042941329823280
      // 06d: lload 2
      // 06e: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: ifnull 136
      // 076: goto 083
      // 079: ldc2_w -1516848791296113415
      // 07c: lload 2
      // 07d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: aload 0
      // 084: ldc2_w -766042941329823280
      // 087: lload 2
      // 088: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: arraylength
      // 08e: iload 9
      // 090: ifeq 132
      // 093: goto 0a0
      // 096: ldc2_w -1516848791296113415
      // 099: lload 2
      // 09a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: iload 4
      // 0a2: if_icmple 131
      // 0a5: goto 0b2
      // 0a8: ldc2_w -1516848791296113415
      // 0ab: lload 2
      // 0ac: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: ldc2_w -766042941329823280
      // 0b6: lload 2
      // 0b7: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: iload 4
      // 0be: aaload
      // 0bf: arraylength
      // 0c0: anewarray 9
      // 0c3: astore 10
      // 0c5: bipush 0
      // 0c6: istore 11
      // 0c8: iload 11
      // 0ca: aload 0
      // 0cb: ldc2_w -766042941329823280
      // 0ce: lload 2
      // 0cf: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: iload 4
      // 0d6: aaload
      // 0d7: arraylength
      // 0d8: if_icmpge 12e
      // 0db: aload 10
      // 0dd: iload 9
      // 0df: lload 2
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: iflt 0ea
      // 0e5: ifeq 130
      // 0e8: iload 11
      // 0ea: aload 0
      // 0eb: ldc2_w -766042941329823280
      // 0ee: lload 2
      // 0ef: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: iload 4
      // 0f6: aaload
      // 0f7: iload 11
      // 0f9: aaload
      // 0fa: lload 5
      // 0fc: bipush 1
      // 0fd: anewarray 386
      // 100: dup_x2
      // 101: dup_x2
      // 102: pop
      // 103: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w -1517632048793957964
      // 10c: lload 2
      // 10d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: aastore
      // 113: iinc 11 1
      // 116: iload 9
      // 118: ifne 0c8
      // 11b: lload 2
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 0db
      // 121: goto 12e
      // 124: ldc2_w -1516848791296113415
      // 127: lload 2
      // 128: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 10
      // 130: areturn
      // 131: bipush 0
      // 132: anewarray 9
      // 135: areturn
      // 136: aload 0
      // 137: lload 7
      // 139: iload 4
      // 13b: bipush 2
      // 13c: anewarray 386
      // 13f: dup_x1
      // 140: swap
      // 141: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 144: bipush 1
      // 145: swap
      // 146: aastore
      // 147: dup_x2
      // 148: dup_x2
      // 149: pop
      // 14a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w -975855584107055875
      // 153: lload 2
      // 154: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: areturn
      // 15a: bipush 0
      // 15b: anewarray 9
      // 15e: areturn
   }

   public String[] X(Object[] param1) {
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
      // 017: getstatic com/zelix/bo.d J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 56132048590500
      // 022: lxor
      // 023: lstore 5
      // 025: pop2
      // 026: ldc2_w -284961651783644063
      // 029: lload 2
      // 02a: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: istore 7
      // 031: aload 0
      // 032: ldc2_w -86135614479511317
      // 035: lload 2
      // 036: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: iload 7
      // 03d: ifeq 0ff
      // 040: ifeq 0fe
      // 043: goto 050
      // 046: ldc2_w -2070403725117387442
      // 049: lload 2
      // 04a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: aload 0
      // 051: ldc2_w -489355625972222456
      // 054: lload 2
      // 055: invokedynamic n (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: arraylength
      // 05b: iload 7
      // 05d: ifeq 0ff
      // 060: goto 06d
      // 063: ldc2_w -2070403725117387442
      // 066: lload 2
      // 067: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: iload 4
      // 06f: if_icmple 0fe
      // 072: goto 07f
      // 075: ldc2_w -2070403725117387442
      // 078: lload 2
      // 079: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: ldc2_w -489355625972222456
      // 083: lload 2
      // 084: invokedynamic n (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 4
      // 08b: aaload
      // 08c: arraylength
      // 08d: anewarray 9
      // 090: astore 8
      // 092: bipush 0
      // 093: istore 9
      // 095: iload 9
      // 097: aload 0
      // 098: ldc2_w -489355625972222456
      // 09b: lload 2
      // 09c: invokedynamic n (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: iload 4
      // 0a3: aaload
      // 0a4: arraylength
      // 0a5: if_icmpge 0fb
      // 0a8: aload 8
      // 0aa: iload 7
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 0b7
      // 0b2: ifeq 0fd
      // 0b5: iload 9
      // 0b7: aload 0
      // 0b8: ldc2_w -489355625972222456
      // 0bb: lload 2
      // 0bc: invokedynamic n (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 4
      // 0c3: aaload
      // 0c4: iload 9
      // 0c6: aaload
      // 0c7: lload 5
      // 0c9: bipush 1
      // 0ca: anewarray 386
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -2069639914126295037
      // 0d9: lload 2
      // 0da: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: aastore
      // 0e0: iinc 9 1
      // 0e3: iload 7
      // 0e5: ifne 095
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 0a8
      // 0ee: goto 0fb
      // 0f1: ldc2_w -2070403725117387442
      // 0f4: lload 2
      // 0f5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 8
      // 0fd: areturn
      // 0fe: bipush 0
      // 0ff: anewarray 9
      // 102: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      long var6 = var1 ^ 10727274753381L;
      byte var10000 = x44.a<"w">(-5003033307729260843L, var1);
      var3.H(this.c, this, this.x(), var6);
      boolean var8 = (boolean)var10000;

      label66: {
         try {
            var10000 = x44.a<"k">(this, -6548045577707648250L, var1);
            if (var8) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var13) {
            throw x44.a<"w">(var13, -5140535821146728797L, var1);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < x44.a<"k">(this, -6712577282876281371L, var1).length) {
         int var10 = 0;

         label57: {
            label56: {
               label55:
               while (var10 < x44.a<"k">(this, -6712577282876281371L, var1)[var9].length) {
                  try {
                     x44.a<"o">(x44.a<"k">(this, -6712577282876281371L, var1)[var9][var10], var4, var3, -6619829722399573103L, var1);
                     var10++;
                  } catch (gj var12) {
                     boolean var10001 = false;
                     throw x44.a<"w">(var12, -5140535821146728797L, var1);
                  }

                  while (true) {
                     try {
                        var16 = var8;
                        if (var1 <= 0L) {
                           break label57;
                        }

                        if (var8) {
                           break label56;
                        }

                        if (!var8) {
                           break;
                        }
                     } catch (gj var11) {
                        boolean var17 = false;
                        throw x44.a<"w">(var11, -5140535821146728797L, var1);
                     }

                     if (var1 >= 0L) {
                        break label55;
                     }
                  }
               }

               var9++;
            }

            var16 = var8;
         }

         if (var16) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 51011812406161L;
      boolean var6 = x44.a<"s">(-5488298085629065327L, var2);

      byte var10000;
      label66: {
         try {
            var10000 = x44.a<"o">(this, -6024504086329753022L, var2);
            if (var6) {
               break label66;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var11) {
            throw x44.a<"s">(var11, -5625796762969645081L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < x44.a<"o">(this, -6080949352635079519L, var2).length) {
         int var8 = 0;

         label57: {
            label56: {
               label55:
               while (var8 < x44.a<"o">(this, -6080949352635079519L, var2)[var7].length) {
                  try {
                     x44.a<"k">(x44.a<"o">(this, -6080949352635079519L, var2)[var7][var8], new Object[]{var4}, -6324502382300723895L, var2);
                     var8++;
                  } catch (gj var10) {
                     boolean var10001 = false;
                     throw x44.a<"s">(var10, -5625796762969645081L, var2);
                  }

                  while (true) {
                     try {
                        var13 = var6;
                        if (var2 <= 0L) {
                           break label57;
                        }

                        if (var6) {
                           break label56;
                        }

                        if (!var6) {
                           break;
                        }
                     } catch (gj var9) {
                        boolean var14 = false;
                        throw x44.a<"s">(var9, -5625796762969645081L, var2);
                     }

                     if (var2 > 0L) {
                        break label55;
                     }
                  }
               }

               var7++;
            }

            var13 = var6;
         }

         if (var13) {
            break;
         }
      }
   }

   bo(h8 param1, int param2, String param3, _xx param4, _y4 param5, long param6, PrintWriter param8, String param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bo.d J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 24689965708971
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 58242525243580
      // 015: lxor
      // 016: lstore 12
      // 018: dup2
      // 019: ldc2_w 8131720168406
      // 01c: lxor
      // 01d: lstore 14
      // 01f: dup2
      // 020: ldc2_w 83598295940287
      // 023: lxor
      // 024: lstore 16
      // 026: dup2
      // 027: ldc2_w 7086183788496
      // 02a: lxor
      // 02b: lstore 18
      // 02d: dup2
      // 02e: ldc2_w 52728786343453
      // 031: lxor
      // 032: lstore 20
      // 034: pop2
      // 035: aload 0
      // 036: aload 1
      // 037: iload 2
      // 038: aload 3
      // 039: aload 4
      // 03b: lload 18
      // 03d: aload 5
      // 03f: invokespecial com/zelix/bf.<init> (Lcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;JLcom/zelix/_y4;)V
      // 042: ldc2_w -2010716218554264462
      // 045: lload 6
      // 047: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 0
      // 04d: getfield com/zelix/bo.C I
      // 050: newarray 8
      // 052: astore 23
      // 054: istore 22
      // 056: aload 4
      // 058: aload 23
      // 05a: invokevirtual com/zelix/_xx.read ([B)I
      // 05d: pop
      // 05e: aload 23
      // 060: lload 16
      // 062: bipush 0
      // 063: bipush 3
      // 064: anewarray 386
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 06c: bipush 2
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: ldc2_w -2219968704755296702
      // 080: lload 6
      // 082: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: astore 24
      // 089: aload 0
      // 08a: iload 22
      // 08c: ifeq 2e7
      // 08f: getfield com/zelix/bo.C I
      // 092: bipush 1
      // 093: if_icmplt 275
      // 096: goto 0a4
      // 099: ldc2_w -335678238747749027
      // 09c: lload 6
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 24
      // 0a6: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 0a9: istore 25
      // 0ab: aload 0
      // 0ac: iload 25
      // 0ae: anewarray 390
      // 0b1: ldc2_w -2222973895006147045
      // 0b4: lload 6
      // 0b6: invokedynamic r (Ljava/lang/Object;[[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: bipush 0
      // 0bc: istore 26
      // 0be: iload 26
      // 0c0: iload 25
      // 0c2: if_icmpge 262
      // 0c5: aload 24
      // 0c7: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0ca: istore 27
      // 0cc: aload 0
      // 0cd: ldc2_w -2222973895006147045
      // 0d0: lload 6
      // 0d2: invokedynamic m (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: iload 26
      // 0d9: iload 27
      // 0db: anewarray 308
      // 0de: aastore
      // 0df: iload 22
      // 0e1: lload 6
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 0ec
      // 0e8: ifeq 2ff
      // 0eb: bipush 0
      // 0ec: istore 28
      // 0ee: iload 28
      // 0f0: iload 27
      // 0f2: if_icmpge 253
      // 0f5: aload 0
      // 0f6: ldc2_w -2222973895006147045
      // 0f9: lload 6
      // 0fb: invokedynamic m (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: iload 26
      // 102: aaload
      // 103: iload 28
      // 105: aload 0
      // 106: lload 10
      // 108: aload 24
      // 10a: aload 5
      // 10c: bipush 4
      // 10d: anewarray 386
      // 110: dup_x1
      // 111: swap
      // 112: bipush 3
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 2
      // 118: swap
      // 119: aastore
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 1
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: bipush 0
      // 126: swap
      // 127: aastore
      // 128: ldc2_w -107853187836957810
      // 12b: lload 6
      // 12d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: aastore
      // 133: iload 22
      // 135: lload 6
      // 137: lconst_0
      // 138: lcmp
      // 139: ifle 250
      // 13c: ifeq 24e
      // 13f: aload 0
      // 140: ldc2_w -2222973895006147045
      // 143: lload 6
      // 145: invokedynamic m (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: iload 26
      // 14c: aaload
      // 14d: iload 28
      // 14f: aaload
      // 150: lload 12
      // 152: bipush 1
      // 153: anewarray 386
      // 156: dup_x2
      // 157: dup_x2
      // 158: pop
      // 159: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w -2210402269587074672
      // 162: lload 6
      // 164: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: iload 22
      // 16b: ifeq 0c0
      // 16e: lload 6
      // 170: lconst_0
      // 171: lcmp
      // 172: ifle 0e1
      // 175: goto 183
      // 178: ldc2_w -335678238747749027
      // 17b: lload 6
      // 17d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: lload 6
      // 185: lconst_0
      // 186: lcmp
      // 187: iflt 225
      // 18a: ifne 23d
      // 18d: aload 0
      // 18e: bipush 0
      // 18f: ldc2_w -1810762889710581512
      // 192: lload 6
      // 194: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: aload 8
      // 19b: new java/lang/StringBuilder
      // 19e: dup
      // 19f: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a2: sipush 964
      // 1a5: ldc2_w 4781465721580013163
      // 1a8: lload 6
      // 1aa: lxor
      // 1ab: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b3: aload 0
      // 1b4: lload 14
      // 1b6: invokevirtual com/zelix/bo.j (J)Ljava/lang/String;
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: sipush 30501
      // 1bf: ldc2_w 8651412415330660999
      // 1c2: lload 6
      // 1c4: lxor
      // 1c5: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: aload 9
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: sipush 17502
      // 1d5: ldc2_w 6945512533344748029
      // 1d8: lload 6
      // 1da: lxor
      // 1db: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e3: aload 0
      // 1e4: ldc2_w -2222973895006147045
      // 1e7: lload 6
      // 1e9: invokedynamic m (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: iload 26
      // 1f0: aaload
      // 1f1: iload 28
      // 1f3: aaload
      // 1f4: lload 20
      // 1f6: bipush 1
      // 1f7: anewarray 386
      // 1fa: dup_x2
      // 1fb: dup_x2
      // 1fc: pop
      // 1fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: ldc2_w -173204977446328310
      // 206: lload 6
      // 208: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 213: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 216: aload 0
      // 217: aload 23
      // 219: ldc2_w -1885515935081064462
      // 21c: lload 6
      // 21e: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: iload 22
      // 225: lload 6
      // 227: lconst_0
      // 228: lcmp
      // 229: ifle 272
      // 22c: ifne 262
      // 22f: goto 23d
      // 232: ldc2_w -335678238747749027
      // 235: lload 6
      // 237: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: iinc 28 1
      // 240: goto 24e
      // 243: ldc2_w -335678238747749027
      // 246: lload 6
      // 248: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: iload 22
      // 250: ifne 0ee
      // 253: iinc 26 1
      // 256: iload 22
      // 258: lload 6
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: ifle 135
      // 25f: ifne 0be
      // 262: lload 6
      // 264: lconst_0
      // 265: lcmp
      // 266: iflt 2ff
      // 269: iload 22
      // 26b: lload 6
      // 26d: lconst_0
      // 26e: lcmp
      // 26f: ifle 0ca
      // 272: ifne 2f3
      // 275: aload 0
      // 276: bipush 0
      // 277: ldc2_w -1810762889710581512
      // 27a: lload 6
      // 27c: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: aload 8
      // 283: new java/lang/StringBuilder
      // 286: dup
      // 287: invokespecial java/lang/StringBuilder.<init> ()V
      // 28a: sipush 25803
      // 28d: ldc2_w 6220489631904997741
      // 290: lload 6
      // 292: lxor
      // 293: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29b: aload 0
      // 29c: lload 14
      // 29e: invokevirtual com/zelix/bo.j (J)Ljava/lang/String;
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: sipush 21997
      // 2a7: ldc2_w 6038402561930530889
      // 2aa: lload 6
      // 2ac: lxor
      // 2ad: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b5: aload 9
      // 2b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ba: sipush 24796
      // 2bd: ldc2_w 3934645098846725493
      // 2c0: lload 6
      // 2c2: lxor
      // 2c3: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cb: aload 0
      // 2cc: getfield com/zelix/bo.C I
      // 2cf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d5: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2d8: aload 0
      // 2d9: goto 2e7
      // 2dc: ldc2_w -335678238747749027
      // 2df: lload 6
      // 2e1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: aload 23
      // 2e9: ldc2_w -1885515935081064462
      // 2ec: lload 6
      // 2ee: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: aload 24
      // 2f5: ldc2_w -2168135612755259844
      // 2f8: lload 6
      // 2fa: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: goto 392
      // 302: astore 25
      // 304: aload 0
      // 305: bipush 0
      // 306: ldc2_w -1810762889710581512
      // 309: lload 6
      // 30b: invokedynamic r (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: aload 8
      // 312: new java/lang/StringBuilder
      // 315: dup
      // 316: invokespecial java/lang/StringBuilder.<init> ()V
      // 319: sipush 25803
      // 31c: ldc2_w 6220489631904997741
      // 31f: lload 6
      // 321: lxor
      // 322: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32a: aload 0
      // 32b: lload 14
      // 32d: invokevirtual com/zelix/bo.j (J)Ljava/lang/String;
      // 330: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 333: sipush 21997
      // 336: ldc2_w 6038402561930530889
      // 339: lload 6
      // 33b: lxor
      // 33c: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 344: aload 9
      // 346: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 349: sipush 10832
      // 34c: ldc2_w 4852815796314599415
      // 34f: lload 6
      // 351: lxor
      // 352: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/bo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35a: aload 25
      // 35c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 35f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 362: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 365: aload 0
      // 366: aload 23
      // 368: ldc2_w -1885515935081064462
      // 36b: lload 6
      // 36d: invokedynamic r (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: aload 24
      // 374: ldc2_w -2168135612755259844
      // 377: lload 6
      // 379: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: goto 392
      // 381: astore 29
      // 383: aload 24
      // 385: ldc2_w -2168135612755259844
      // 388: lload 6
      // 38a: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: aload 29
      // 391: athrow
      // 392: return
   }

   protected void O(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 63022419844887
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 0
      // 020: lxor
      // 021: lstore 7
      // 023: pop2
      // 024: ldc2_w -7740090294292667137
      // 027: lload 2
      // 028: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: lload 7
      // 030: aload 4
      // 032: bipush 2
      // 033: anewarray 386
      // 036: dup_x1
      // 037: swap
      // 038: bipush 1
      // 039: swap
      // 03a: aastore
      // 03b: dup_x2
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041: bipush 0
      // 042: swap
      // 043: aastore
      // 044: invokespecial com/zelix/bf.O ([Ljava/lang/Object;)V
      // 047: istore 9
      // 049: aload 0
      // 04a: ldc2_w -7614518121811986315
      // 04d: lload 2
      // 04e: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: iload 9
      // 055: ifeq 086
      // 058: ifeq 13a
      // 05b: goto 068
      // 05e: ldc2_w -8369303522510576176
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 4
      // 06a: aload 0
      // 06b: ldc2_w -7950184132473430378
      // 06e: lload 2
      // 06f: invokedynamic h (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: arraylength
      // 075: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 078: bipush 0
      // 079: goto 086
      // 07c: ldc2_w -8369303522510576176
      // 07f: lload 2
      // 080: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: istore 10
      // 088: iload 10
      // 08a: aload 0
      // 08b: ldc2_w -7950184132473430378
      // 08e: lload 2
      // 08f: invokedynamic h (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: arraylength
      // 095: if_icmpge 129
      // 098: aload 4
      // 09a: aload 0
      // 09b: ldc2_w -7950184132473430378
      // 09e: lload 2
      // 09f: invokedynamic h (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: iload 10
      // 0a6: aaload
      // 0a7: arraylength
      // 0a8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ab: iload 9
      // 0ad: lload 2
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 0b7
      // 0b3: ifeq 156
      // 0b6: bipush 0
      // 0b7: istore 11
      // 0b9: iload 11
      // 0bb: aload 0
      // 0bc: ldc2_w -7950184132473430378
      // 0bf: lload 2
      // 0c0: invokedynamic h (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: iload 10
      // 0c7: aaload
      // 0c8: arraylength
      // 0c9: if_icmpge 121
      // 0cc: aload 0
      // 0cd: ldc2_w -7950184132473430378
      // 0d0: lload 2
      // 0d1: invokedynamic h (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: iload 10
      // 0d8: aaload
      // 0d9: iload 11
      // 0db: aaload
      // 0dc: lload 5
      // 0de: aload 4
      // 0e0: bipush 2
      // 0e1: anewarray 386
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 1
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -8276908260505217876
      // 0f5: lload 2
      // 0f6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: iinc 11 1
      // 0fe: iload 9
      // 100: lload 2
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 126
      // 106: ifeq 124
      // 109: iload 9
      // 10b: ifne 0b9
      // 10e: lload 2
      // 10f: lconst_0
      // 110: lcmp
      // 111: iflt 0fe
      // 114: goto 121
      // 117: ldc2_w -8369303522510576176
      // 11a: lload 2
      // 11b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: iinc 10 1
      // 124: iload 9
      // 126: ifne 088
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 149
      // 12f: iload 9
      // 131: lload 2
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 0ad
      // 137: ifne 156
      // 13a: aload 4
      // 13c: aload 0
      // 13d: ldc2_w -7685285436080527489
      // 140: lload 2
      // 141: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/io/DataOutputStream.write ([B)V
      // 149: goto 156
      // 14c: ldc2_w -8369303522510576176
      // 14f: lload 2
      // 150: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ij m(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = d ^ var3;
      long var5 = var3 ^ 24401209826935L;
      byte var7 = x44.a<"q">(8419683871493407922L, var3);

      byte var10000;
      label67: {
         try {
            var10000 = x44.a<"m">(this, 8511479083342813240L, var3);
            if (var7 == 0) {
               break label67;
            }

            if (var10000 == 0) {
               return null;
            }
         } catch (gj var11) {
            throw x44.a<"q">(var11, 7752761989379327389L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      label59:
      do {
         var10000 = var8;

         label56:
         while (var10000 < x44.a<"m">(this, 8207335996417031899L, var3).length) {
            var10000 = 0;

            label54:
            while (true) {
               int var9 = var10000;

               while (true) {
                  if (var9 < x44.a<"m">(this, 8207335996417031899L, var3)[var8].length) {
                     var10000 = var2.equals(
                        x44.a<"i">(x44.a<"m">(this, 8207335996417031899L, var3)[var8][var9], new Object[]{var5}, 7751834373567596752L, var3)
                     );
                  } else {
                     var8++;
                     var10000 = var7;
                     if (var3 >= 0L) {
                        continue label59;
                     }
                  }

                  while (true) {
                     if (var7 == 0) {
                        continue label56;
                     }

                     try {
                        if (var3 < 0L) {
                           continue label54;
                        }

                        if (var10000 != 0) {
                           return x44.a<"m">(this, 8207335996417031899L, var3)[var8][var9];
                        }
                     } catch (gj var10) {
                        throw x44.a<"q">(var10, 7752761989379327389L, var3);
                     }

                     var9++;
                     if (var7 != 0) {
                        break;
                     }

                     var8++;
                     var10000 = var7;
                     if (var3 >= 0L) {
                        continue label59;
                     }
                  }
               }
            }
         }
         break;
      } while (var10000 != 0);

      return null;
   }

   public void k(Object[] param1) {
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
      // 00e: checkcast com/zelix/_3
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/bo.d J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 9422891574990
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 107790095020920
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: aload 4
      // 02c: lload 5
      // 02e: bipush 1
      // 02f: anewarray 386
      // 032: dup_x2
      // 033: dup_x2
      // 034: pop
      // 035: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 038: bipush 0
      // 039: swap
      // 03a: aastore
      // 03b: ldc2_w -48499160886874424
      // 03e: lload 2
      // 03f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: istore 10
      // 046: iload 10
      // 048: anewarray 390
      // 04b: astore 11
      // 04d: aload 4
      // 04f: bipush 0
      // 050: anewarray 386
      // 053: ldc2_w -164478553278443585
      // 056: lload 2
      // 057: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: istore 12
      // 05e: ldc2_w -2110335476731358500
      // 061: lload 2
      // 062: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: bipush 0
      // 068: istore 13
      // 06a: istore 9
      // 06c: bipush 0
      // 06d: istore 14
      // 06f: aload 4
      // 071: iload 14
      // 073: iinc 14 1
      // 076: bipush 1
      // 077: anewarray 386
      // 07a: dup_x1
      // 07b: swap
      // 07c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w -2151864358556420541
      // 085: lload 2
      // 086: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: istore 15
      // 08d: bipush 0
      // 08e: istore 16
      // 090: iload 16
      // 092: iload 10
      // 094: if_icmpge 194
      // 097: lload 2
      // 098: lconst_0
      // 099: lcmp
      // 09a: ifle 1f3
      // 09d: iload 16
      // 09f: iload 9
      // 0a1: ifeq 1f2
      // 0a4: iload 15
      // 0a6: lload 2
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 14c
      // 0ac: iload 9
      // 0ae: ifeq 14c
      // 0b1: goto 0be
      // 0b4: ldc2_w -145950016946727949
      // 0b7: lload 2
      // 0b8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: lload 2
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 13f
      // 0c4: if_icmpne 132
      // 0c7: goto 0d4
      // 0ca: ldc2_w -145950016946727949
      // 0cd: lload 2
      // 0ce: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 11
      // 0d6: iload 16
      // 0d8: bipush 0
      // 0d9: anewarray 308
      // 0dc: aastore
      // 0dd: iload 9
      // 0df: lload 2
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: ifle 191
      // 0e5: ifeq 18f
      // 0e8: goto 0f5
      // 0eb: ldc2_w -145950016946727949
      // 0ee: lload 2
      // 0ef: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: iload 14
      // 0f7: iload 12
      // 0f9: if_icmpge 18c
      // 0fc: goto 109
      // 0ff: ldc2_w -145950016946727949
      // 102: lload 2
      // 103: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 4
      // 10b: iload 14
      // 10d: iinc 14 1
      // 110: bipush 1
      // 111: anewarray 386
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w -2151864358556420541
      // 11f: lload 2
      // 120: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: istore 15
      // 127: iload 9
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 134
      // 12f: ifne 18c
      // 132: iload 13
      // 134: aload 0
      // 135: ldc2_w -1763022548741642059
      // 138: lload 2
      // 139: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: arraylength
      // 13f: goto 14c
      // 142: ldc2_w -145950016946727949
      // 145: lload 2
      // 146: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: if_icmpge 176
      // 14f: aload 11
      // 151: iload 16
      // 153: aload 0
      // 154: ldc2_w -1763022548741642059
      // 157: lload 2
      // 158: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: iload 13
      // 15f: iinc 13 1
      // 162: aaload
      // 163: aastore
      // 164: iload 9
      // 166: ifne 18c
      // 169: goto 176
      // 16c: ldc2_w -145950016946727949
      // 16f: lload 2
      // 170: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 11
      // 178: iload 16
      // 17a: bipush 0
      // 17b: anewarray 308
      // 17e: aastore
      // 17f: goto 18c
      // 182: ldc2_w -145950016946727949
      // 185: lload 2
      // 186: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: iinc 16 1
      // 18f: iload 9
      // 191: ifne 090
      // 194: lload 2
      // 195: lconst_0
      // 196: lcmp
      // 197: ifle 097
      // 19a: aload 0
      // 19b: iload 9
      // 19d: ifeq 1e7
      // 1a0: ldc2_w -2138065004242780454
      // 1a3: lload 2
      // 1a4: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: ifnonnull 1da
      // 1ac: goto 1b9
      // 1af: ldc2_w -145950016946727949
      // 1b2: lload 2
      // 1b3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: aload 0
      // 1bb: ldc2_w -1763022548741642059
      // 1be: lload 2
      // 1bf: invokedynamic k (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: ldc2_w -2138065004242780454
      // 1c7: lload 2
      // 1c8: invokedynamic t (Ljava/lang/Object;[[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1da
      // 1d0: ldc2_w -145950016946727949
      // 1d3: lload 2
      // 1d4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: aload 0
      // 1db: aload 11
      // 1dd: ldc2_w -1763022548741642059
      // 1e0: lload 2
      // 1e1: invokedynamic t (Ljava/lang/Object;[[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: aload 0
      // 1e7: lload 7
      // 1e9: ldc2_w -340240084466197324
      // 1ec: lload 2
      // 1ed: invokedynamic o (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: pop
      // 1f3: return
   }

   protected void j(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 5
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 0
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 116287516140676
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w -3106497998795710297
      // 037: lload 2
      // 038: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: aload 4
      // 040: lload 7
      // 042: aload 6
      // 044: aload 5
      // 046: bipush 4
      // 047: anewarray 386
      // 04a: dup_x1
      // 04b: swap
      // 04c: bipush 3
      // 04d: swap
      // 04e: aastore
      // 04f: dup_x1
      // 050: swap
      // 051: bipush 2
      // 052: swap
      // 053: aastore
      // 054: dup_x2
      // 055: dup_x2
      // 056: pop
      // 057: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a: bipush 1
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: invokespecial com/zelix/bf.j ([Ljava/lang/Object;)V
      // 065: istore 11
      // 067: aload 0
      // 068: ldc2_w -3795817549990238860
      // 06b: lload 2
      // 06c: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 11
      // 073: ifne 0a4
      // 076: ifeq 166
      // 079: goto 086
      // 07c: ldc2_w -2964772794997884719
      // 07f: lload 2
      // 080: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 4
      // 088: aload 0
      // 089: ldc2_w -3699137858418441321
      // 08c: lload 2
      // 08d: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: arraylength
      // 093: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 096: bipush 0
      // 097: goto 0a4
      // 09a: ldc2_w -2964772794997884719
      // 09d: lload 2
      // 09e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: istore 12
      // 0a6: iload 12
      // 0a8: aload 0
      // 0a9: ldc2_w -3699137858418441321
      // 0ac: lload 2
      // 0ad: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: arraylength
      // 0b3: if_icmpge 155
      // 0b6: aload 4
      // 0b8: aload 0
      // 0b9: ldc2_w -3699137858418441321
      // 0bc: lload 2
      // 0bd: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: iload 12
      // 0c4: aaload
      // 0c5: arraylength
      // 0c6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0c9: iload 11
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 0d5
      // 0d1: ifne 182
      // 0d4: bipush 0
      // 0d5: istore 13
      // 0d7: iload 13
      // 0d9: aload 0
      // 0da: ldc2_w -3699137858418441321
      // 0dd: lload 2
      // 0de: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: iload 12
      // 0e5: aaload
      // 0e6: arraylength
      // 0e7: if_icmpge 14d
      // 0ea: aload 0
      // 0eb: ldc2_w -3699137858418441321
      // 0ee: lload 2
      // 0ef: invokedynamic i (Ljava/lang/Object;JJ)[[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: iload 12
      // 0f6: aaload
      // 0f7: iload 13
      // 0f9: aaload
      // 0fa: aload 4
      // 0fc: lload 9
      // 0fe: aload 6
      // 100: aload 5
      // 102: bipush 4
      // 103: anewarray 386
      // 106: dup_x1
      // 107: swap
      // 108: bipush 3
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 2
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: ldc2_w -3042284813290867894
      // 121: lload 2
      // 122: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: iinc 13 1
      // 12a: iload 11
      // 12c: lload 2
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 152
      // 132: ifne 150
      // 135: iload 11
      // 137: ifeq 0d7
      // 13a: lload 2
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: iflt 12a
      // 140: goto 14d
      // 143: ldc2_w -2964772794997884719
      // 146: lload 2
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: iinc 12 1
      // 150: iload 11
      // 152: ifeq 0a6
      // 155: lload 2
      // 156: lconst_0
      // 157: lcmp
      // 158: iflt 175
      // 15b: iload 11
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: ifle 0cb
      // 163: ifeq 182
      // 166: aload 4
      // 168: aload 0
      // 169: ldc2_w -4010137101812909442
      // 16c: lload 2
      // 16d: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: invokevirtual java/io/DataOutputStream.write ([B)V
      // 175: goto 182
      // 178: ldc2_w -2964772794997884719
      // 17b: lload 2
      // 17c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: return
   }

   static {
      long var0 = d ^ 84957028168275L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "nÐÑ^Þsüó\u000f¦»\u007f\u009fÚó\u0000\u0010ä\u0013©ý\u0018\u0018\u0083Ü2*Ì¢Ý¦@\b\u0010Àm é\u0086ÃBà$\u008d>YðkÅÇ zÜÎ3²\u000e6'\u000bÊ>Ó\u008f\u001bxÑ8Äè\u0085¾¿´#9Ñ\u0082,«ö¤0(T\u0016\u0002ÆÒnÜ%Ð¸\u00008\nkÇÏd1úÛ:þ')½\\kG5\u009e\u001bd\u009et¤? \u0085´\u009c\u0010¼\u001fc\u001d\u0083\u008a\u009cgíÂ\u0012Áq|Õ\u008c(\u0013W¥\u0080j\u0084Ç±-\u0012\u0099ò\u009cxÚ;\u0004\u008a`´E± áÄªÏ\u0089 5n<\u009aÒp\u008c¿¿iË\u0010s`+V\u0005\u0001\u000e\u0002ô\u009f\u0083\u0000)\u0010rzXásö¬l¿\u0017ªòi1õJ`\u0090ö^zÓ\u009dT\u009d\u008a\tu\u0093eVõZ\u0015kB}¤1'//Åä\u0007%_+$%\u001e,A\u0017\u0093\u0015Y\u008f\u001c édXÐþ:ÉXL&lä{\u0015i«ØFBÌ9a6YW})·\u000e\u00ad~\u0010öÓí\u0083\u0083]\u0005Ï¸ÔR¾2ä\u0006B «\th@5ÓÍ:¤RË«Ú¾I4\u008cÔ(«\u0015m¦\u0080\u0018Ø)\u009dÂOJÂ";
      int var8 = "nÐÑ^Þsüó\u000f¦»\u007f\u009fÚó\u0000\u0010ä\u0013©ý\u0018\u0018\u0083Ü2*Ì¢Ý¦@\b\u0010Àm é\u0086ÃBà$\u008d>YðkÅÇ zÜÎ3²\u000e6'\u000bÊ>Ó\u008f\u001bxÑ8Äè\u0085¾¿´#9Ñ\u0082,«ö¤0(T\u0016\u0002ÆÒnÜ%Ð¸\u00008\nkÇÏd1úÛ:þ')½\\kG5\u009e\u001bd\u009et¤? \u0085´\u009c\u0010¼\u001fc\u001d\u0083\u008a\u009cgíÂ\u0012Áq|Õ\u008c(\u0013W¥\u0080j\u0084Ç±-\u0012\u0099ò\u009cxÚ;\u0004\u008a`´E± áÄªÏ\u0089 5n<\u009aÒp\u008c¿¿iË\u0010s`+V\u0005\u0001\u000e\u0002ô\u009f\u0083\u0000)\u0010rzXásö¬l¿\u0017ªòi1õJ`\u0090ö^zÓ\u009dT\u009d\u008a\tu\u0093eVõZ\u0015kB}¤1'//Åä\u0007%_+$%\u001e,A\u0017\u0093\u0015Y\u008f\u001c édXÐþ:ÉXL&lä{\u0015i«ØFBÌ9a6YW})·\u000e\u00ad~\u0010öÓí\u0083\u0083]\u0005Ï¸ÔR¾2ä\u0006B «\th@5ÓÍ:¤RË«Ú¾I4\u008cÔ(«\u0015m¦\u0080\u0018Ø)\u009dÂOJÂ"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[13];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "øïæ\u0090\u009b?UA\u0092¬ô\u008bJBé\u000f\u0010Ö»\u0093V¨%V3\u0095©\u0080ä\u0018ÖëO";
                  var8 = "øïæ\u0090\u009b?UA\u0092¬ô\u008bJBé\u000f\u0010Ö»\u0093V¨%V3\u0095©\u0080ä\u0018ÖëO".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11545;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/bo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
