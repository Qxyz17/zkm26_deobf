package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMChangeLog extends _yj {
   int A;
   private _ur o;
   private a9 M;
   int J;
   int i;
   private String K;
   int H;
   private static final long a = ess.a(7213306251229737049L, -4460931978810317231L, MethodHandles.lookup().lookupClass()).a(44931832606238L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public boolean isOldClassPresent(String var1) {
      long var2 = a ^ 136422044758432L;
      long var4 = var2 ^ 11143806725994L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(18098, 1245246872535881496L ^ var2));
         }
      } catch (IllegalArgumentException var6) {
         throw x44.a<"t">(var6, -4661972825057899356L, var2);
      }

      return x44.a<"l">(x44.a<"h">(this, -4818755576002056363L, var2), new Object[]{var4, var1}, -6641967317994854998L, var2);
   }

   public String getNewMethodSignature(String param1, String param2, String[] param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMChangeLog.a J
      // 003: ldc2_w 8175572575533
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 48166865273662
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 90036963912959
      // 016: lxor
      // 017: lstore 9
      // 019: dup2
      // 01a: ldc2_w 104353905780065
      // 01d: lxor
      // 01e: lstore 11
      // 020: dup2
      // 021: ldc2_w 52071830370123
      // 024: lxor
      // 025: lstore 13
      // 027: dup2
      // 028: ldc2_w 96674384507927
      // 02b: lxor
      // 02c: lstore 15
      // 02e: dup2
      // 02f: ldc2_w 8145732302184
      // 032: lxor
      // 033: lstore 17
      // 035: dup2
      // 036: ldc2_w 124649131817959
      // 039: lxor
      // 03a: lstore 19
      // 03c: pop2
      // 03d: ldc2_w -6222147744769354966
      // 040: lload 5
      // 042: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: astore 24
      // 049: aload 1
      // 04a: aload 24
      // 04c: ifnonnull 082
      // 04f: ifnonnull 081
      // 052: goto 060
      // 055: ldc2_w -6070813716868540375
      // 058: lload 5
      // 05a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: new java/lang/IllegalArgumentException
      // 063: dup
      // 064: sipush 9206
      // 067: ldc2_w 6667668372926736080
      // 06a: lload 5
      // 06c: lxor
      // 06d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 075: athrow
      // 076: ldc2_w -6070813716868540375
      // 079: lload 5
      // 07b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 2
      // 082: aload 24
      // 084: ifnonnull 0bb
      // 087: ifnonnull 0b9
      // 08a: goto 098
      // 08d: ldc2_w -6070813716868540375
      // 090: lload 5
      // 092: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: new java/lang/IllegalArgumentException
      // 09b: dup
      // 09c: sipush 14957
      // 09f: ldc2_w 916540590792621902
      // 0a2: lload 5
      // 0a4: lxor
      // 0a5: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ad: athrow
      // 0ae: ldc2_w -6070813716868540375
      // 0b1: lload 5
      // 0b3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: ifnonnull 0df
      // 0be: new java/lang/IllegalArgumentException
      // 0c1: dup
      // 0c2: sipush 32389
      // 0c5: ldc2_w 1042767564891356064
      // 0c8: lload 5
      // 0ca: lxor
      // 0cb: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0d3: athrow
      // 0d4: ldc2_w -6070813716868540375
      // 0d7: lload 5
      // 0d9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: new com/zelix/tr
      // 0e2: dup
      // 0e3: aload 0
      // 0e4: aload 4
      // 0e6: lload 15
      // 0e8: aload 2
      // 0e9: aload 3
      // 0ea: invokespecial com/zelix/tr.<init> (Lcom/zelix/ZKMChangeLog;Ljava/lang/String;JLjava/lang/String;[Ljava/lang/String;)V
      // 0ed: astore 25
      // 0ef: aload 0
      // 0f0: ldc2_w -6220266955229889576
      // 0f3: lload 5
      // 0f5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: lload 19
      // 0fc: aload 1
      // 0fd: bipush 2
      // 0fe: anewarray 529
      // 101: dup_x1
      // 102: swap
      // 103: bipush 1
      // 104: swap
      // 105: aastore
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -5233316260951576281
      // 112: lload 5
      // 114: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 24
      // 11b: ifnonnull 18b
      // 11e: ifeq 279
      // 121: goto 12f
      // 124: ldc2_w -6070813716868540375
      // 127: lload 5
      // 129: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 0
      // 130: ldc2_w -6220266955229889576
      // 133: lload 5
      // 135: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: aload 1
      // 13b: aload 2
      // 13c: aload 3
      // 13d: aload 4
      // 13f: aload 24
      // 141: ifnonnull 1c6
      // 144: goto 152
      // 147: ldc2_w -6070813716868540375
      // 14a: lload 5
      // 14c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: astore 21
      // 154: astore 22
      // 156: astore 23
      // 158: lload 17
      // 15a: aload 23
      // 15c: aload 22
      // 15e: aload 21
      // 160: bipush 5
      // 161: anewarray 529
      // 164: dup_x1
      // 165: swap
      // 166: bipush 4
      // 167: swap
      // 168: aastore
      // 169: dup_x1
      // 16a: swap
      // 16b: bipush 3
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: bipush 2
      // 171: swap
      // 172: aastore
      // 173: dup_x2
      // 174: dup_x2
      // 175: pop
      // 176: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 0
      // 17f: swap
      // 180: aastore
      // 181: ldc2_w -5775224613170025065
      // 184: lload 5
      // 186: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: ifeq 25d
      // 18e: aload 0
      // 18f: lload 7
      // 191: bipush 1
      // 192: anewarray 529
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: ldc2_w -5763048958780618516
      // 1a1: lload 5
      // 1a3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: aload 0
      // 1a9: ldc2_w -6220266955229889576
      // 1ac: lload 5
      // 1ae: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 1
      // 1b4: aload 2
      // 1b5: aload 3
      // 1b6: aload 4
      // 1b8: goto 1c6
      // 1bb: ldc2_w -6070813716868540375
      // 1be: lload 5
      // 1c0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: astore 21
      // 1c8: astore 22
      // 1ca: astore 23
      // 1cc: lload 9
      // 1ce: aload 23
      // 1d0: aload 22
      // 1d2: aload 21
      // 1d4: bipush 5
      // 1d5: anewarray 529
      // 1d8: dup_x1
      // 1d9: swap
      // 1da: bipush 4
      // 1db: swap
      // 1dc: aastore
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 3
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: bipush 2
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x2
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ed: bipush 1
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 0
      // 1f3: swap
      // 1f4: aastore
      // 1f5: ldc2_w -5426541986360141942
      // 1f8: lload 5
      // 1fa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: astore 26
      // 201: aload 0
      // 202: lload 11
      // 204: bipush 1
      // 205: anewarray 529
      // 208: dup_x2
      // 209: dup_x2
      // 20a: pop
      // 20b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20e: bipush 0
      // 20f: swap
      // 210: aastore
      // 211: ldc2_w -5597773622140368455
      // 214: lload 5
      // 216: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 26
      // 21d: aload 24
      // 21f: ifnonnull 25c
      // 222: ifnonnull 25a
      // 225: goto 233
      // 228: ldc2_w -6070813716868540375
      // 22b: lload 5
      // 22d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 25
      // 235: lload 13
      // 237: bipush 1
      // 238: anewarray 529
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: ldc2_w -6087114322979731671
      // 247: lload 5
      // 249: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: areturn
      // 24f: ldc2_w -6070813716868540375
      // 252: lload 5
      // 254: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 26
      // 25c: areturn
      // 25d: aload 25
      // 25f: lload 13
      // 261: bipush 1
      // 262: anewarray 529
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 0
      // 26c: swap
      // 26d: aastore
      // 26e: ldc2_w -6087114322979731671
      // 271: lload 5
      // 273: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: areturn
      // 279: aload 25
      // 27b: lload 13
      // 27d: bipush 1
      // 27e: anewarray 529
      // 281: dup_x2
      // 282: dup_x2
      // 283: pop
      // 284: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w -6087114322979731671
      // 28d: lload 5
      // 28f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: areturn
   }

   public String getLogFileName() {
      long var1 = a ^ 48212322292555L;
      return x44.a<"k">(this, -2770763203707280960L, var1);
   }

   public List getOldMethodSignaturesForClass(String var1) {
      long var2 = a ^ 88672993419950L;
      int var4 = (int)((var2 ^ 32967845146347L) >>> 32);
      long var5 = (var2 ^ 32967845146347L) << 32 >>> 32;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(18098, 1245295703356900374L ^ var2));
         }
      } catch (IllegalArgumentException var7) {
         throw x44.a<"r">(var7, -1422164566927466582L, var2);
      }

      a9 var10000 = x44.a<"n">(this, -1283952627503809445L, var2);
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = var4;
      var10005[0] = var1;
      return x44.a<"j">(var10000, var10005, -671011910664187118L, var2);
   }

   public String getNewFieldName(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMChangeLog.a J
      // 003: ldc2_w 101429428879583
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 46240762191381
      // 00d: lxor
      // 00e: lstore 5
      // 010: pop2
      // 011: ldc2_w -3723308352398477608
      // 014: lload 3
      // 015: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: astore 7
      // 01c: aload 1
      // 01d: ifnonnull 03f
      // 020: new java/lang/IllegalArgumentException
      // 023: dup
      // 024: sipush 18098
      // 027: ldc2_w 1245281864549836391
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 034: athrow
      // 035: ldc2_w -3588673708141167141
      // 038: lload 3
      // 039: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: athrow
      // 03f: aconst_null
      // 040: astore 8
      // 042: aconst_null
      // 043: astore 9
      // 045: aload 2
      // 046: ldc " "
      // 048: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 04b: istore 10
      // 04d: iload 10
      // 04f: aload 7
      // 051: ifnonnull 066
      // 054: ifle 085
      // 057: goto 064
      // 05a: ldc2_w -3588673708141167141
      // 05d: lload 3
      // 05e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: iload 10
      // 066: aload 2
      // 067: invokevirtual java/lang/String.length ()I
      // 06a: bipush 1
      // 06b: isub
      // 06c: if_icmpge 085
      // 06f: aload 2
      // 070: bipush 0
      // 071: iload 10
      // 073: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 076: astore 9
      // 078: aload 2
      // 079: iload 10
      // 07b: bipush 1
      // 07c: iadd
      // 07d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 080: astore 8
      // 082: goto 0b0
      // 085: new java/lang/IllegalArgumentException
      // 088: dup
      // 089: new java/lang/StringBuilder
      // 08c: dup
      // 08d: invokespecial java/lang/StringBuilder.<init> ()V
      // 090: ldc "'"
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: aload 2
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: sipush 22296
      // 09c: ldc2_w 7248727505918474177
      // 09f: lload 3
      // 0a0: lxor
      // 0a1: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ac: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: aload 7
      // 0b3: ifnonnull 0fb
      // 0b6: ldc2_w -3720123403556446678
      // 0b9: lload 3
      // 0ba: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 5
      // 0c1: aload 1
      // 0c2: bipush 2
      // 0c3: anewarray 529
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 0
      // 0d2: swap
      // 0d3: aastore
      // 0d4: ldc2_w -3265710308479871787
      // 0d7: lload 3
      // 0d8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: ifeq 10a
      // 0e0: goto 0ed
      // 0e3: ldc2_w -3588673708141167141
      // 0e6: lload 3
      // 0e7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: goto 0fb
      // 0f1: ldc2_w -3588673708141167141
      // 0f4: lload 3
      // 0f5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 1
      // 0fc: aload 8
      // 0fe: aload 9
      // 100: ldc2_w -3040624826476426722
      // 103: lload 3
      // 104: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: areturn
      // 10a: aload 8
      // 10c: areturn
   }

   public boolean isOldMethodPresent(String var1, String var2) {
      long var3 = a ^ 26004206918680L;
      long var5 = var3 ^ 47696879018664L;
      long var7 = var3 ^ 107302084690642L;
      hk[] var9 = x44.a<"t">(-3417267438652544481L, var3);

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(18098, 1245362787931830944L ^ var3));
         }
      } catch (IllegalArgumentException var11) {
         throw x44.a<"t">(var11, -3245630919924113124L, var3);
      }

      label34: {
         try {
            boolean var10000 = x44.a<"l">(x44.a<"h">(this, -3415913384439807251L, var3), new Object[]{var7, var1}, -3572878017163573230L, var3);
            if (var9 != null) {
               return var10000;
            }

            if (var10000) {
               break label34;
            }
         } catch (IllegalArgumentException var12) {
            throw x44.a<"t">(var12, -3245630919924113124L, var3);
         }

         return false;
      }

      tr var10 = x44.a<"j">(this, new Object[]{var2, var5}, -3372577740983098920L, var3);
      return x44.a<"l">(
         this,
         var1,
         x44.a<"h">(var10, -3376846667324972485L, var3),
         x44.a<"h">(var10, -3086530394621864959L, var3),
         x44.a<"h">(var10, -3866450802588258572L, var3),
         -3086894513698047227L,
         var3
      );
   }

   public boolean isOldMethodPresent(String param1, String param2, String[] param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 41488029600630
      // 06: lxor
      // 07: lstore 5
      // 09: lload 5
      // 0b: dup2
      // 0c: ldc2_w 41492507253555
      // 0f: lxor
      // 10: lstore 7
      // 12: dup2
      // 13: ldc2_w 91852344923580
      // 16: lxor
      // 17: lstore 9
      // 19: pop2
      // 1a: ldc2_w -8647650965893448335
      // 1d: lload 5
      // 1f: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 11
      // 26: aload 1
      // 27: ifnonnull 4b
      // 2a: new java/lang/IllegalArgumentException
      // 2d: dup
      // 2e: sipush 18098
      // 31: ldc2_w 1245342905534180814
      // 34: lload 5
      // 36: lxor
      // 37: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: ldc2_w -8819453508695198094
      // 43: lload 5
      // 45: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: ldc2_w -8649709553652935293
      // 4f: lload 5
      // 51: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: lload 9
      // 58: aload 1
      // 59: bipush 2
      // 5a: anewarray 529
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -7420625679707168900
      // 6e: lload 5
      // 70: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: aload 11
      // 77: ifnonnull fc
      // 7a: ifeq fb
      // 7d: goto 8b
      // 80: ldc2_w -8819453508695198094
      // 83: lload 5
      // 85: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: aload 0
      // 8c: ldc2_w -8649709553652935293
      // 8f: lload 5
      // 91: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: aload 1
      // 97: lload 7
      // 99: aload 2
      // 9a: aload 3
      // 9b: aload 4
      // 9d: bipush 5
      // 9e: anewarray 529
      // a1: dup_x1
      // a2: swap
      // a3: bipush 4
      // a4: swap
      // a5: aastore
      // a6: dup_x1
      // a7: swap
      // a8: bipush 3
      // a9: swap
      // aa: aastore
      // ab: dup_x1
      // ac: swap
      // ad: bipush 2
      // ae: swap
      // af: aastore
      // b0: dup_x2
      // b1: dup_x2
      // b2: pop
      // b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: bipush 0
      // bc: swap
      // bd: aastore
      // be: ldc2_w -9114893102015495220
      // c1: lload 5
      // c3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: aload 11
      // ca: ifnonnull fa
      // cd: goto db
      // d0: ldc2_w -8819453508695198094
      // d3: lload 5
      // d5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: ifeq f9
      // de: goto ec
      // e1: ldc2_w -8819453508695198094
      // e4: lload 5
      // e6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // eb: athrow
      // ec: bipush 1
      // ed: ireturn
      // ee: ldc2_w -8819453508695198094
      // f1: lload 5
      // f3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f8: athrow
      // f9: bipush 0
      // fa: ireturn
      // fb: bipush 0
      // fc: ireturn
   }

   public List getOldFieldSignaturesForClass(String var1) {
      long var2 = a ^ 24972988156513L;
      long var4 = var2 ^ 76913677319032L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(18098, 1245363819119127769L ^ var2));
         }
      } catch (IllegalArgumentException var6) {
         throw x44.a<"u">(var6, 4939378756771166053L, var2);
      }

      return x44.a<"m">(x44.a<"i">(this, 5107431557197730964L, var2), new Object[]{var4, var1}, 4791438205286501478L, var2);
   }

   public String getNewMethodSignature(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 120118700129657
      // 06: lxor
      // 07: lstore 3
      // 08: lload 3
      // 09: dup2
      // 0a: ldc2_w 90127882798025
      // 0d: lxor
      // 0e: lstore 5
      // 10: dup2
      // 11: ldc2_w 29751059407795
      // 14: lxor
      // 15: lstore 7
      // 17: pop2
      // 18: ldc2_w 8210651216186477438
      // 1b: lload 3
      // 1c: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 9
      // 23: aload 1
      // 24: ifnonnull 46
      // 27: new java/lang/IllegalArgumentException
      // 2a: dup
      // 2b: sipush 18098
      // 2e: ldc2_w 1245263175790435265
      // 31: lload 3
      // 32: lxor
      // 33: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3b: athrow
      // 3c: ldc2_w 8328362176348782717
      // 3f: lload 3
      // 40: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: aload 2
      // 48: lload 5
      // 4a: bipush 2
      // 4b: anewarray 529
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w 8093893151089459385
      // 5f: lload 3
      // 60: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: astore 10
      // 67: aload 0
      // 68: aload 9
      // 6a: ifnonnull b2
      // 6d: ldc2_w 8212672884397646732
      // 70: lload 3
      // 71: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: lload 7
      // 78: aload 1
      // 79: bipush 2
      // 7a: anewarray 529
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 0
      // 89: swap
      // 8a: aastore
      // 8b: ldc2_w 8001749499491805555
      // 8e: lload 3
      // 8f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ifeq de
      // 97: goto a4
      // 9a: ldc2_w 8328362176348782717
      // 9d: lload 3
      // 9e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 0
      // a5: goto b2
      // a8: ldc2_w 8328362176348782717
      // ab: lload 3
      // ac: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 1
      // b3: aload 10
      // b5: ldc2_w 8089165599622923098
      // b8: lload 3
      // b9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: aload 10
      // c0: ldc2_w 8379802992033510752
      // c3: lload 3
      // c4: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: aload 10
      // cb: ldc2_w 7725610576843657109
      // ce: lload 3
      // cf: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: ldc2_w 7979490934516562222
      // d7: lload 3
      // d8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: areturn
      // de: aload 2
      // df: areturn
   }

   public List getOldMethodSignatures(String var1, String var2) {
      long var3 = a ^ 47402591825893L;
      long var5 = var3 ^ 70850724613646L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(17652, 6156875900452440860L ^ var3));
         }
      } catch (IllegalArgumentException var7) {
         throw x44.a<"q">(var7, 6991855350320698081L, var3);
      }

      return x44.a<"i">(x44.a<"m">(this, 7162131170524082448L, var3), new Object[]{var5, var1, var2}, 7017896810121548052L, var3);
   }

   public String getOldMethodName(String param1, String param2, String[] param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMChangeLog.a J
      // 003: ldc2_w 111759072434146
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 7242180962879
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 80289333015025
      // 016: lxor
      // 017: lstore 9
      // 019: dup2
      // 01a: ldc2_w 135874438898955
      // 01d: lxor
      // 01e: lstore 11
      // 020: dup2
      // 021: ldc2_w 66123717760942
      // 024: lxor
      // 025: lstore 13
      // 027: dup2
      // 028: ldc2_w 131720850630182
      // 02b: lxor
      // 02c: lstore 15
      // 02e: pop2
      // 02f: ldc2_w -2636541623549353499
      // 032: lload 5
      // 034: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 21
      // 03b: aload 1
      // 03c: ifnonnull 060
      // 03f: new java/lang/IllegalArgumentException
      // 042: dup
      // 043: sipush 17652
      // 046: ldc2_w 6156931666730562331
      // 049: lload 5
      // 04b: lxor
      // 04c: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 054: athrow
      // 055: ldc2_w -2805951622605034778
      // 058: lload 5
      // 05a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: ldc2_w -2638459697159304937
      // 064: lload 5
      // 066: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: aload 1
      // 06c: lload 7
      // 06e: bipush 2
      // 06f: anewarray 529
      // 072: dup_x2
      // 073: dup_x2
      // 074: pop
      // 075: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 078: bipush 1
      // 079: swap
      // 07a: aastore
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: ldc2_w -2540960193024842710
      // 083: lload 5
      // 085: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: aload 21
      // 08c: ifnonnull 0fc
      // 08f: ifeq 1ba
      // 092: goto 0a0
      // 095: ldc2_w -2805951622605034778
      // 098: lload 5
      // 09a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc2_w -2638459697159304937
      // 0a4: lload 5
      // 0a6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 1
      // 0ac: aload 2
      // 0ad: aload 3
      // 0ae: aload 4
      // 0b0: aload 21
      // 0b2: ifnonnull 137
      // 0b5: goto 0c3
      // 0b8: ldc2_w -2805951622605034778
      // 0bb: lload 5
      // 0bd: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: astore 17
      // 0c5: astore 18
      // 0c7: astore 19
      // 0c9: lload 15
      // 0cb: aload 19
      // 0cd: aload 18
      // 0cf: aload 17
      // 0d1: bipush 5
      // 0d2: anewarray 529
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 4
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 3
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 2
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 1
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -2499314995842279105
      // 0f5: lload 5
      // 0f7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: ifeq 1b8
      // 0ff: aload 0
      // 100: lload 9
      // 102: bipush 1
      // 103: anewarray 529
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -4410454178011596253
      // 112: lload 5
      // 114: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 0
      // 11a: ldc2_w -2638459697159304937
      // 11d: lload 5
      // 11f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: aload 1
      // 125: aload 2
      // 126: aload 3
      // 127: aload 4
      // 129: goto 137
      // 12c: ldc2_w -2805951622605034778
      // 12f: lload 5
      // 131: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: astore 17
      // 139: astore 18
      // 13b: astore 19
      // 13d: astore 20
      // 13f: lload 11
      // 141: aload 20
      // 143: aload 19
      // 145: aload 18
      // 147: aload 17
      // 149: bipush 5
      // 14a: anewarray 529
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 4
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: bipush 3
      // 155: swap
      // 156: aastore
      // 157: dup_x1
      // 158: swap
      // 159: bipush 2
      // 15a: swap
      // 15b: aastore
      // 15c: dup_x1
      // 15d: swap
      // 15e: bipush 1
      // 15f: swap
      // 160: aastore
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w -4227089821847377384
      // 16d: lload 5
      // 16f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: astore 22
      // 176: aload 0
      // 177: lload 13
      // 179: bipush 1
      // 17a: anewarray 529
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 0
      // 184: swap
      // 185: aastore
      // 186: ldc2_w -4566698091720410250
      // 189: lload 5
      // 18b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: aload 22
      // 192: aload 21
      // 194: ifnonnull 1b7
      // 197: ifnonnull 1b5
      // 19a: goto 1a8
      // 19d: ldc2_w -2805951622605034778
      // 1a0: lload 5
      // 1a2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 2
      // 1a9: areturn
      // 1aa: ldc2_w -2805951622605034778
      // 1ad: lload 5
      // 1af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 22
      // 1b7: areturn
      // 1b8: aload 2
      // 1b9: areturn
      // 1ba: aload 2
      // 1bb: areturn
   }

   public String getNewPackageName(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 40861779623527
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 70218887358214
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 3669413151759452256
      // 14: lload 2
      // 15: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnonnull 79
      // 22: ifnonnull 51
      // 25: goto 32
      // 28: ldc2_w 3497609506227602275
      // 2b: lload 2
      // 2c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: new java/lang/IllegalArgumentException
      // 35: dup
      // 36: sipush 17652
      // 39: ldc2_w 6156860735077997214
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 46: athrow
      // 47: ldc2_w 3497609506227602275
      // 4a: lload 2
      // 4b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w 3667916292572668050
      // 55: lload 2
      // 56: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: lload 4
      // 5d: aload 1
      // 5e: bipush 2
      // 5f: anewarray 529
      // 62: dup_x1
      // 63: swap
      // 64: bipush 1
      // 65: swap
      // 66: aastore
      // 67: dup_x2
      // 68: dup_x2
      // 69: pop
      // 6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w 3917529466492018563
      // 73: lload 2
      // 74: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: astore 7
      // 7b: aload 7
      // 7d: aload 6
      // 7f: ifnonnull a3
      // 82: ifnonnull 9e
      // 85: goto 92
      // 88: ldc2_w 3497609506227602275
      // 8b: lload 2
      // 8c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 1
      // 93: areturn
      // 94: ldc2_w 3497609506227602275
      // 97: lload 2
      // 98: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: aload 7
      // a0: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // a3: areturn
   }

   private void E(Object[] param1) {
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
      // 00c: getstatic com/zelix/ZKMChangeLog.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 18088896478792
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 109031561352541
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 57204903430791
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 126823248464074
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 72911611117500
      // 033: lxor
      // 034: lstore 12
      // 036: pop2
      // 037: ldc2_w 6061932170494914220
      // 03a: lload 2
      // 03b: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: bipush 0
      // 041: istore 15
      // 043: astore 14
      // 045: bipush 0
      // 046: istore 16
      // 048: aload 0
      // 049: ldc2_w 5977964259578283881
      // 04c: lload 2
      // 04d: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: aload 14
      // 054: ifnonnull 0e1
      // 057: aload 0
      // 058: ldc2_w 5918174446939109096
      // 05b: lload 2
      // 05c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: lload 8
      // 063: bipush 1
      // 064: anewarray 529
      // 067: dup_x2
      // 068: dup_x2
      // 069: pop
      // 06a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06d: bipush 0
      // 06e: swap
      // 06f: aastore
      // 070: ldc2_w 6157855673850033299
      // 073: lload 2
      // 074: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: if_icmplt 0dd
      // 07c: goto 089
      // 07f: ldc2_w 6216675785049220527
      // 082: lload 2
      // 083: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: ldc2_w 5703626988101971708
      // 08d: lload 2
      // 08e: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 0
      // 094: ldc2_w 5918174446939109096
      // 097: lload 2
      // 098: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: lload 4
      // 09f: bipush 1
      // 0a0: anewarray 529
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w 6100764699401649241
      // 0af: lload 2
      // 0b0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 121
      // 0bb: aload 14
      // 0bd: ifnonnull 121
      // 0c0: goto 0cd
      // 0c3: ldc2_w 6216675785049220527
      // 0c6: lload 2
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: if_icmpge 0e3
      // 0d0: goto 0dd
      // 0d3: ldc2_w 6216675785049220527
      // 0d6: lload 2
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: bipush 1
      // 0de: istore 15
      // 0e0: bipush 1
      // 0e1: istore 16
      // 0e3: aload 0
      // 0e4: ldc2_w 5786668522835355306
      // 0e7: lload 2
      // 0e8: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 14
      // 0ef: ifnonnull 186
      // 0f2: aload 0
      // 0f3: ldc2_w 5918174446939109096
      // 0f6: lload 2
      // 0f7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: lload 6
      // 0fe: bipush 1
      // 0ff: anewarray 529
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 0
      // 109: swap
      // 10a: aastore
      // 10b: ldc2_w 5915244517676121060
      // 10e: lload 2
      // 10f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: goto 121
      // 117: ldc2_w 6216675785049220527
      // 11a: lload 2
      // 11b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: if_icmplt 178
      // 124: aload 0
      // 125: ldc2_w 5743909007234921702
      // 128: lload 2
      // 129: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 14
      // 130: lload 2
      // 131: lconst_0
      // 132: lcmp
      // 133: iflt 18c
      // 136: ifnonnull 18a
      // 139: goto 146
      // 13c: ldc2_w 6216675785049220527
      // 13f: lload 2
      // 140: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: aload 0
      // 147: ldc2_w 5918174446939109096
      // 14a: lload 2
      // 14b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: lload 12
      // 152: bipush 1
      // 153: anewarray 529
      // 156: dup_x2
      // 157: dup_x2
      // 158: pop
      // 159: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: ldc2_w 5742735990374945296
      // 162: lload 2
      // 163: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: if_icmpge 188
      // 16b: goto 178
      // 16e: ldc2_w 6216675785049220527
      // 171: lload 2
      // 172: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: bipush 1
      // 179: goto 186
      // 17c: ldc2_w 6216675785049220527
      // 17f: lload 2
      // 180: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: istore 16
      // 188: iload 16
      // 18a: aload 14
      // 18c: lload 2
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: ifle 1ea
      // 192: ifnonnull 1e8
      // 195: ifeq 1e6
      // 198: goto 1a5
      // 19b: ldc2_w 6216675785049220527
      // 19e: lload 2
      // 19f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: ldc2_w 6173130325686782150
      // 1a8: lload 2
      // 1a9: invokedynamic n (JJ)Ljava/io/PrintStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: aload 0
      // 1af: ldc2_w 5918174446939109096
      // 1b2: lload 2
      // 1b3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: lload 10
      // 1ba: bipush 1
      // 1bb: anewarray 529
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: ldc2_w 5647580500034223848
      // 1ca: lload 2
      // 1cb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: ldc2_w 6190961085543510260
      // 1d3: lload 2
      // 1d4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: goto 1e6
      // 1dc: ldc2_w 6216675785049220527
      // 1df: lload 2
      // 1e0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: iload 15
      // 1e8: aload 14
      // 1ea: ifnonnull 1fe
      // 1ed: ifeq 207
      // 1f0: goto 1fd
      // 1f3: ldc2_w 6216675785049220527
      // 1f6: lload 2
      // 1f7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: bipush 1
      // 1fe: ldc2_w 5862953069014529721
      // 201: lload 2
      // 202: invokedynamic w (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: return
   }

   public List getOldClassNames() {
      long var1 = a ^ 16556081114161L;
      long var3 = var1 ^ 28566793806045L;
      long var5 = var1 ^ 139411205477301L;
      return x44.a<"k">(
         this,
         new Object[]{var3, x44.a<"m">(x44.a<"i">(this, -6867668063628037436L, var1), new Object[]{var5}, -6573203961168214971L, var1)},
         -4645520956053722252L,
         var1
      );
   }

   public List getNewClassNames() {
      long var1 = a ^ 136887847909105L;
      long var3 = var1 ^ 26731626035559L;
      long var5 = var1 ^ 117142368418333L;
      return x44.a<"k">(
         this,
         new Object[]{var5, x44.a<"m">(x44.a<"i">(this, -5012129007072778236L, var1), new Object[]{var3}, -6840808669075742061L, var1)},
         -6537053762558496332L,
         var1
      );
   }

   public String getNewFieldName(String param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMChangeLog.a J
      // 003: ldc2_w 13764740712023
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 35347119956036
      // 00f: lxor
      // 010: lstore 6
      // 012: dup2
      // 013: ldc2_w 93473875052059
      // 016: lxor
      // 017: lstore 8
      // 019: dup2
      // 01a: ldc2_w 94332403923223
      // 01d: lxor
      // 01e: lstore 10
      // 020: dup2
      // 021: ldc2_w 101910897255584
      // 024: lxor
      // 025: lstore 12
      // 027: dup2
      // 028: ldc2_w 134919944362141
      // 02b: lxor
      // 02c: lstore 14
      // 02e: pop2
      // 02f: ldc2_w -3829055304173866928
      // 032: lload 4
      // 034: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 16
      // 03b: aload 1
      // 03c: ifnonnull 060
      // 03f: new java/lang/IllegalArgumentException
      // 042: dup
      // 043: sipush 18098
      // 046: ldc2_w 1245370612148707567
      // 049: lload 4
      // 04b: lxor
      // 04c: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 054: athrow
      // 055: ldc2_w -3982825850946372781
      // 058: lload 4
      // 05a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: ldc2_w -3830549242787030878
      // 064: lload 4
      // 066: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: lload 14
      // 06d: aload 1
      // 06e: bipush 2
      // 06f: anewarray 529
      // 072: dup_x1
      // 073: swap
      // 074: bipush 1
      // 075: swap
      // 076: aastore
      // 077: dup_x2
      // 078: dup_x2
      // 079: pop
      // 07a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: ldc2_w -3159963991882149283
      // 083: lload 4
      // 085: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: aload 16
      // 08c: ifnonnull 0f7
      // 08f: ifeq 1a0
      // 092: goto 0a0
      // 095: ldc2_w -3982825850946372781
      // 098: lload 4
      // 09a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc2_w -3830549242787030878
      // 0a4: lload 4
      // 0a6: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 1
      // 0ac: aload 2
      // 0ad: aload 3
      // 0ae: aload 16
      // 0b0: ifnonnull 130
      // 0b3: goto 0c1
      // 0b6: ldc2_w -3982825850946372781
      // 0b9: lload 4
      // 0bb: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: lload 10
      // 0c3: bipush 4
      // 0c4: anewarray 529
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 3
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: bipush 2
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 1
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: ldc2_w -3277897104950100464
      // 0e2: lload 4
      // 0e4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: goto 0f7
      // 0ec: ldc2_w -3982825850946372781
      // 0ef: lload 4
      // 0f1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: ifeq 19e
      // 0fa: aload 0
      // 0fb: lload 6
      // 0fd: bipush 1
      // 0fe: anewarray 529
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w -3206701014248838250
      // 10d: lload 4
      // 10f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: aload 0
      // 115: ldc2_w -3830549242787030878
      // 118: lload 4
      // 11a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: aload 1
      // 120: aload 2
      // 121: aload 3
      // 122: goto 130
      // 125: ldc2_w -3982825850946372781
      // 128: lload 4
      // 12a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: lload 12
      // 132: dup2_x2
      // 133: pop2
      // 134: bipush 4
      // 135: anewarray 529
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 3
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 2
      // 140: swap
      // 141: aastore
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 1
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w -3362248162289076061
      // 153: lload 4
      // 155: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: astore 17
      // 15c: aload 0
      // 15d: lload 8
      // 15f: bipush 1
      // 160: anewarray 529
      // 163: dup_x2
      // 164: dup_x2
      // 165: pop
      // 166: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 169: bipush 0
      // 16a: swap
      // 16b: aastore
      // 16c: ldc2_w -3374676717004657981
      // 16f: lload 4
      // 171: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: aload 17
      // 178: aload 16
      // 17a: ifnonnull 19d
      // 17d: ifnonnull 19b
      // 180: goto 18e
      // 183: ldc2_w -3982825850946372781
      // 186: lload 4
      // 188: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 2
      // 18f: areturn
      // 190: ldc2_w -3982825850946372781
      // 193: lload 4
      // 195: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: aload 17
      // 19d: areturn
      // 19e: aload 2
      // 19f: areturn
      // 1a0: aload 2
      // 1a1: areturn
   }

   public boolean isOldFieldPresent(String param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 97723260671085
      // 06: lxor
      // 07: lstore 4
      // 09: lload 4
      // 0b: dup2
      // 0c: ldc2_w 1852660460333
      // 0f: lxor
      // 10: lstore 6
      // 12: dup2
      // 13: ldc2_w 51476745243303
      // 16: lxor
      // 17: lstore 8
      // 19: pop2
      // 1a: ldc2_w -2817527026856877462
      // 1d: lload 4
      // 1f: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 10
      // 26: aload 1
      // 27: ifnonnull 4b
      // 2a: new java/lang/IllegalArgumentException
      // 2d: dup
      // 2e: sipush 18098
      // 31: ldc2_w 1245286653553259221
      // 34: lload 4
      // 36: lxor
      // 37: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: ldc2_w -2702022776857876119
      // 43: lload 4
      // 45: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: ldc2_w -2815467033568769384
      // 4f: lload 4
      // 51: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: lload 8
      // 58: aload 1
      // 59: bipush 2
      // 5a: anewarray 529
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -4170376024320589721
      // 6e: lload 4
      // 70: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: aload 10
      // 77: ifnonnull f5
      // 7a: ifeq f4
      // 7d: goto 8b
      // 80: ldc2_w -2702022776857876119
      // 83: lload 4
      // 85: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: aload 0
      // 8c: ldc2_w -2815467033568769384
      // 8f: lload 4
      // 91: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: aload 1
      // 97: aload 2
      // 98: aload 3
      // 99: lload 6
      // 9b: bipush 4
      // 9c: anewarray 529
      // 9f: dup_x2
      // a0: dup_x2
      // a1: pop
      // a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a5: bipush 3
      // a6: swap
      // a7: aastore
      // a8: dup_x1
      // a9: swap
      // aa: bipush 2
      // ab: swap
      // ac: aastore
      // ad: dup_x1
      // ae: swap
      // af: bipush 1
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: bipush 0
      // b5: swap
      // b6: aastore
      // b7: ldc2_w -4559677369921770454
      // ba: lload 4
      // bc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: aload 10
      // c3: ifnonnull f3
      // c6: goto d4
      // c9: ldc2_w -2702022776857876119
      // cc: lload 4
      // ce: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: athrow
      // d4: ifeq f2
      // d7: goto e5
      // da: ldc2_w -2702022776857876119
      // dd: lload 4
      // df: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: athrow
      // e5: bipush 1
      // e6: ireturn
      // e7: ldc2_w -2702022776857876119
      // ea: lload 4
      // ec: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: athrow
      // f2: bipush 0
      // f3: ireturn
      // f4: bipush 0
      // f5: ireturn
   }

   public String getNewMethodName(String param1, String param2, String[] param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKMChangeLog.a J
      // 003: ldc2_w 97587372805552
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 29221044178565
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 127957449092003
      // 016: lxor
      // 017: lstore 9
      // 019: dup2
      // 01a: ldc2_w 1400626318844
      // 01d: lxor
      // 01e: lstore 11
      // 020: dup2
      // 021: ldc2_w 97608531140085
      // 024: lxor
      // 025: lstore 13
      // 027: dup2
      // 028: ldc2_w 51612379812730
      // 02b: lxor
      // 02c: lstore 15
      // 02e: pop2
      // 02f: ldc2_w 88702248014576567
      // 032: lload 5
      // 034: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 20
      // 03b: aload 1
      // 03c: ifnonnull 060
      // 03f: new java/lang/IllegalArgumentException
      // 042: dup
      // 043: sipush 18098
      // 046: ldc2_w 1245286789441022728
      // 049: lload 5
      // 04b: lxor
      // 04c: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 054: athrow
      // 055: ldc2_w 242487085180842164
      // 058: lload 5
      // 05a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: ldc2_w 85695420063437637
      // 064: lload 5
      // 066: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: lload 15
      // 06d: aload 1
      // 06e: bipush 2
      // 06f: anewarray 529
      // 072: dup_x1
      // 073: swap
      // 074: bipush 1
      // 075: swap
      // 076: aastore
      // 077: dup_x2
      // 078: dup_x2
      // 079: pop
      // 07a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: ldc2_w 2288630396643776954
      // 083: lload 5
      // 085: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: aload 20
      // 08c: ifnonnull 0fc
      // 08f: ifeq 1ac
      // 092: goto 0a0
      // 095: ldc2_w 242487085180842164
      // 098: lload 5
      // 09a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: ldc2_w 85695420063437637
      // 0a4: lload 5
      // 0a6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 1
      // 0ac: aload 2
      // 0ad: aload 3
      // 0ae: aload 4
      // 0b0: aload 20
      // 0b2: ifnonnull 137
      // 0b5: goto 0c3
      // 0b8: ldc2_w 242487085180842164
      // 0bb: lload 5
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: astore 17
      // 0c5: astore 18
      // 0c7: astore 19
      // 0c9: lload 13
      // 0cb: aload 19
      // 0cd: aload 18
      // 0cf: aload 17
      // 0d1: bipush 5
      // 0d2: anewarray 529
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 4
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 3
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 2
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 1
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w 524414814332765450
      // 0f5: lload 5
      // 0f7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: ifeq 1aa
      // 0ff: aload 0
      // 100: lload 9
      // 102: bipush 1
      // 103: anewarray 529
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w 1772401952166764657
      // 112: lload 5
      // 114: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 0
      // 11a: ldc2_w 85695420063437637
      // 11d: lload 5
      // 11f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: aload 1
      // 125: aload 2
      // 126: aload 3
      // 127: aload 4
      // 129: goto 137
      // 12c: ldc2_w 242487085180842164
      // 12f: lload 5
      // 131: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: lload 7
      // 139: dup2_x2
      // 13a: pop2
      // 13b: bipush 5
      // 13c: anewarray 529
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 4
      // 142: swap
      // 143: aastore
      // 144: dup_x1
      // 145: swap
      // 146: bipush 3
      // 147: swap
      // 148: aastore
      // 149: dup_x2
      // 14a: dup_x2
      // 14b: pop
      // 14c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14f: bipush 2
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: bipush 1
      // 155: swap
      // 156: aastore
      // 157: dup_x1
      // 158: swap
      // 159: bipush 0
      // 15a: swap
      // 15b: aastore
      // 15c: ldc2_w 533302829632035299
      // 15f: lload 5
      // 161: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: astore 21
      // 168: aload 0
      // 169: lload 11
      // 16b: bipush 1
      // 16c: anewarray 529
      // 16f: dup_x2
      // 170: dup_x2
      // 171: pop
      // 172: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 175: bipush 0
      // 176: swap
      // 177: aastore
      // 178: ldc2_w 1931456148891509028
      // 17b: lload 5
      // 17d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: aload 21
      // 184: aload 20
      // 186: ifnonnull 1a9
      // 189: ifnonnull 1a7
      // 18c: goto 19a
      // 18f: ldc2_w 242487085180842164
      // 192: lload 5
      // 194: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 2
      // 19b: areturn
      // 19c: ldc2_w 242487085180842164
      // 19f: lload 5
      // 1a1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 21
      // 1a9: areturn
      // 1aa: aload 2
      // 1ab: areturn
      // 1ac: aload 2
      // 1ad: areturn
   }

   public String getOldMethodName(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 119353430904826
      // 06: lxor
      // 07: lstore 3
      // 08: lload 3
      // 09: dup2
      // 0a: ldc2_w 17317284393511
      // 0d: lxor
      // 0e: lstore 5
      // 10: dup2
      // 11: ldc2_w 88282966389066
      // 14: lxor
      // 15: lstore 7
      // 17: pop2
      // 18: ldc2_w -4363681872014394883
      // 1b: lload 3
      // 1c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 9
      // 23: aload 1
      // 24: ifnonnull 46
      // 27: new java/lang/IllegalArgumentException
      // 2a: dup
      // 2b: sipush 17652
      // 2e: ldc2_w 6156941391661247235
      // 31: lload 3
      // 32: lxor
      // 33: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3b: athrow
      // 3c: ldc2_w -4533074285358992642
      // 3f: lload 3
      // 40: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: aload 2
      // 48: lload 7
      // 4a: bipush 2
      // 4b: anewarray 529
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w -4408943485331295686
      // 5f: lload 3
      // 60: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: astore 10
      // 67: aload 0
      // 68: aload 9
      // 6a: ifnonnull b2
      // 6d: ldc2_w -4361094348836138737
      // 70: lload 3
      // 71: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: aload 1
      // 77: lload 5
      // 79: bipush 2
      // 7a: anewarray 529
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 1
      // 84: swap
      // 85: aastore
      // 86: dup_x1
      // 87: swap
      // 88: bipush 0
      // 89: swap
      // 8a: aastore
      // 8b: ldc2_w -4277088124278752206
      // 8e: lload 3
      // 8f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ifeq e2
      // 97: goto a4
      // 9a: ldc2_w -4533074285358992642
      // 9d: lload 3
      // 9e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 0
      // a5: goto b2
      // a8: ldc2_w -4533074285358992642
      // ab: lload 3
      // ac: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 1
      // b3: aload 10
      // b5: ldc2_w -4413108775175835175
      // b8: lload 3
      // b9: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: aload 10
      // c0: ldc2_w -4123032410189199389
      // c3: lload 3
      // c4: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: aload 10
      // cb: ldc2_w -2759052556932088554
      // ce: lload 3
      // cf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: ldc2_w -4365724916626942075
      // d7: lload 3
      // d8: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: astore 11
      // df: aload 11
      // e1: areturn
      // e2: aload 10
      // e4: ldc2_w -4413108775175835175
      // e7: lload 3
      // e8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: areturn
   }

   private void h(Object[] param1) {
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
      // 00c: getstatic com/zelix/ZKMChangeLog.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 39041238996217
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 105111494689512
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 63497285112671
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 99492853762118
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 9580298892881
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 85496991086084
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 72694736302977
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 10714178672947
      // 048: lxor
      // 049: lstore 18
      // 04b: dup2
      // 04c: ldc2_w 33128134423004
      // 04f: lxor
      // 050: lstore 20
      // 052: dup2
      // 053: ldc2_w 43819010901563
      // 056: lxor
      // 057: lstore 22
      // 059: pop2
      // 05a: ldc2_w 3767676475132268229
      // 05d: lload 2
      // 05e: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aconst_null
      // 064: astore 25
      // 066: aconst_null
      // 067: astore 26
      // 069: astore 24
      // 06b: aload 0
      // 06c: new com/zelix/a9
      // 06f: dup
      // 070: aload 0
      // 071: ldc2_w 3604407337807252041
      // 074: lload 2
      // 075: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: lload 8
      // 07c: dup2_x1
      // 07d: pop2
      // 07e: aload 0
      // 07f: ldc2_w 3623324804911666817
      // 082: lload 2
      // 083: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: invokespecial com/zelix/a9.<init> (JLjava/lang/String;Lcom/zelix/_ur;)V
      // 08b: ldc2_w 3765616719141758519
      // 08e: lload 2
      // 08f: invokedynamic u (Ljava/lang/Object;Lcom/zelix/a9;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: ldc2_w 3518205240094674699
      // 097: lload 2
      // 098: invokedynamic o (JJ)Lcom/zelix/l8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: astore 27
      // 09f: new java/io/File
      // 0a2: dup
      // 0a3: aload 0
      // 0a4: ldc2_w 3604407337807252041
      // 0a7: lload 2
      // 0a8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0b0: lload 10
      // 0b2: dup2_x1
      // 0b3: pop2
      // 0b4: bipush 2
      // 0b5: anewarray 529
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: bipush 1
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x2
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3: bipush 0
      // 0c4: swap
      // 0c5: aastore
      // 0c6: ldc2_w 3427378508964701669
      // 0c9: lload 2
      // 0ca: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: astore 28
      // 0d1: aload 28
      // 0d3: ifnull 0fc
      // 0d6: new java/io/BufferedReader
      // 0d9: dup
      // 0da: new java/io/InputStreamReader
      // 0dd: dup
      // 0de: new java/io/FileInputStream
      // 0e1: dup
      // 0e2: aload 0
      // 0e3: ldc2_w 3604407337807252041
      // 0e6: lload 2
      // 0e7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0ef: aload 28
      // 0f1: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0f4: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0f7: astore 25
      // 0f9: goto 116
      // 0fc: new java/io/BufferedReader
      // 0ff: dup
      // 100: new java/io/FileReader
      // 103: dup
      // 104: aload 0
      // 105: ldc2_w 3604407337807252041
      // 108: lload 2
      // 109: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokespecial java/io/FileReader.<init> (Ljava/lang/String;)V
      // 111: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 114: astore 25
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: iflt 14d
      // 11c: aload 27
      // 11e: aload 24
      // 120: ifnonnull 14b
      // 123: ifnonnull 158
      // 126: goto 133
      // 129: ldc2_w 3904382607875884486
      // 12c: lload 2
      // 12d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: new com/zelix/l8
      // 136: dup
      // 137: lload 22
      // 139: aload 25
      // 13b: invokespecial com/zelix/l8.<init> (JLjava/io/Reader;)V
      // 13e: goto 14b
      // 141: ldc2_w 3904382607875884486
      // 144: lload 2
      // 145: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: astore 27
      // 14d: aload 24
      // 14f: lload 2
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 193
      // 155: ifnull 184
      // 158: lload 16
      // 15a: aload 25
      // 15c: bipush 2
      // 15d: anewarray 529
      // 160: dup_x1
      // 161: swap
      // 162: bipush 1
      // 163: swap
      // 164: aastore
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 0
      // 16c: swap
      // 16d: aastore
      // 16e: ldc2_w 3676636595988669558
      // 171: lload 2
      // 172: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: goto 184
      // 17a: ldc2_w 3904382607875884486
      // 17d: lload 2
      // 17e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: lload 6
      // 186: bipush 1
      // 187: anewarray 529
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: ldc2_w 3886738933815729160
      // 196: lload 2
      // 197: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/y1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: astore 26
      // 19e: aload 26
      // 1a0: aconst_null
      // 1a1: aload 0
      // 1a2: ldc2_w 3765616719141758519
      // 1a5: lload 2
      // 1a6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: lload 18
      // 1ad: ldc2_w 3631194353799972842
      // 1b0: lload 2
      // 1b1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: aload 26
      // 1b8: lload 12
      // 1ba: invokevirtual com/zelix/y1.u (J)I
      // 1bd: lload 2
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: iflt 1d9
      // 1c3: aload 24
      // 1c5: ifnonnull 1d9
      // 1c8: ifne 1ed
      // 1cb: goto 1d8
      // 1ce: ldc2_w 3904382607875884486
      // 1d1: lload 2
      // 1d2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: bipush 1
      // 1d9: ldc2_w 3545549220127954640
      // 1dc: lload 2
      // 1dd: invokedynamic v (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: iflt 23e
      // 1e8: aload 24
      // 1ea: ifnull 21c
      // 1ed: aload 0
      // 1ee: ldc2_w 3765616719141758519
      // 1f1: lload 2
      // 1f2: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: lload 4
      // 1f9: bipush 1
      // 1fa: anewarray 529
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w 3156085103528884801
      // 209: lload 2
      // 20a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: goto 21c
      // 212: ldc2_w 3904382607875884486
      // 215: lload 2
      // 216: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: aload 0
      // 21d: ldc2_w 3765616719141758519
      // 220: lload 2
      // 221: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: lload 14
      // 228: bipush 1
      // 229: anewarray 529
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 0
      // 233: swap
      // 234: aastore
      // 235: ldc2_w 3174420752678852900
      // 238: lload 2
      // 239: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: aload 26
      // 240: aload 24
      // 242: ifnonnull 24a
      // 245: ifnull 255
      // 248: aload 26
      // 24a: lload 20
      // 24c: ldc2_w 3413701010944545929
      // 24f: lload 2
      // 250: invokedynamic n (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: lload 2
      // 256: lconst_0
      // 257: lcmp
      // 258: iflt 27d
      // 25b: aload 25
      // 25d: aload 24
      // 25f: ifnonnull 274
      // 262: ifnull 3b9
      // 265: goto 272
      // 268: ldc2_w 3904382607875884486
      // 26b: lload 2
      // 26c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: athrow
      // 272: aload 25
      // 274: ldc2_w 3176590379876438837
      // 277: lload 2
      // 278: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: goto 3b9
      // 280: astore 27
      // 282: goto 3b9
      // 285: astore 27
      // 287: new java/lang/Exception
      // 28a: dup
      // 28b: new java/lang/StringBuilder
      // 28e: dup
      // 28f: invokespecial java/lang/StringBuilder.<init> ()V
      // 292: sipush 23035
      // 295: ldc2_w 6273748258891448624
      // 298: lload 2
      // 299: lxor
      // 29a: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 0
      // 2a3: ldc2_w 3604407337807252041
      // 2a6: lload 2
      // 2a7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2af: ldc "\""
      // 2b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b7: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 2ba: athrow
      // 2bb: astore 27
      // 2bd: new java/lang/Exception
      // 2c0: dup
      // 2c1: new java/lang/StringBuilder
      // 2c4: dup
      // 2c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c8: sipush 4561
      // 2cb: ldc2_w 1625170872929454343
      // 2ce: lload 2
      // 2cf: lxor
      // 2d0: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d8: aload 0
      // 2d9: ldc2_w 3604407337807252041
      // 2dc: lload 2
      // 2dd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: sipush 28648
      // 2e8: ldc2_w 7968620871726954281
      // 2eb: lload 2
      // 2ec: lxor
      // 2ed: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 27
      // 2f7: ldc2_w 3259009314561962110
      // 2fa: lload 2
      // 2fb: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 303: ldc "\""
      // 305: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 308: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30b: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 30e: athrow
      // 30f: astore 27
      // 311: new java/lang/Exception
      // 314: dup
      // 315: new java/lang/StringBuilder
      // 318: dup
      // 319: invokespecial java/lang/StringBuilder.<init> ()V
      // 31c: sipush 16548
      // 31f: ldc2_w 8109111065824057441
      // 322: lload 2
      // 323: lxor
      // 324: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32c: aload 0
      // 32d: ldc2_w 3604407337807252041
      // 330: lload 2
      // 331: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 339: sipush 18352
      // 33c: ldc2_w 8546262741396512613
      // 33f: lload 2
      // 340: lxor
      // 341: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 349: aload 27
      // 34b: ldc2_w 3705717199726429737
      // 34e: lload 2
      // 34f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 357: ldc "\""
      // 359: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 35f: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 362: athrow
      // 363: astore 29
      // 365: aload 26
      // 367: aload 24
      // 369: ifnonnull 37e
      // 36c: ifnull 389
      // 36f: goto 37c
      // 372: ldc2_w 3904382607875884486
      // 375: lload 2
      // 376: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: athrow
      // 37c: aload 26
      // 37e: lload 20
      // 380: ldc2_w 3413701010944545929
      // 383: lload 2
      // 384: invokedynamic n (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: lload 2
      // 38a: lconst_0
      // 38b: lcmp
      // 38c: ifle 3b1
      // 38f: aload 25
      // 391: aload 24
      // 393: ifnonnull 3a8
      // 396: ifnull 3b6
      // 399: goto 3a6
      // 39c: ldc2_w 3904382607875884486
      // 39f: lload 2
      // 3a0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: aload 25
      // 3a8: ldc2_w 3176590379876438837
      // 3ab: lload 2
      // 3ac: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: goto 3b6
      // 3b4: astore 30
      // 3b6: aload 29
      // 3b8: athrow
      // 3b9: return
   }

   public String getNewMethodName(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 125225778403079
      // 06: lxor
      // 07: lstore 3
      // 08: lload 3
      // 09: dup2
      // 0a: ldc2_w 84815907531191
      // 0d: lxor
      // 0e: lstore 5
      // 10: dup2
      // 11: ldc2_w 8614683707853
      // 14: lxor
      // 15: lstore 7
      // 17: pop2
      // 18: ldc2_w 1984973751943880960
      // 1b: lload 3
      // 1c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 9
      // 23: aload 1
      // 24: ifnonnull 46
      // 27: new java/lang/IllegalArgumentException
      // 2a: dup
      // 2b: sipush 18098
      // 2e: ldc2_w 1245259150563701183
      // 31: lload 3
      // 32: lxor
      // 33: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3b: athrow
      // 3c: ldc2_w 1867399129041988099
      // 3f: lload 3
      // 40: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: aload 2
      // 48: lload 5
      // 4a: bipush 2
      // 4b: anewarray 529
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w 1886256363653163719
      // 5f: lload 3
      // 60: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: astore 10
      // 67: aload 0
      // 68: aload 9
      // 6a: ifnonnull b2
      // 6d: ldc2_w 1983653816963910130
      // 70: lload 3
      // 71: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: lload 7
      // 78: aload 1
      // 79: bipush 2
      // 7a: anewarray 529
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 0
      // 89: swap
      // 8a: aastore
      // 8b: ldc2_w 393484551497974541
      // 8e: lload 3
      // 8f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ifeq de
      // 97: goto a4
      // 9a: ldc2_w 1867399129041988099
      // 9d: lload 3
      // 9e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 0
      // a5: goto b2
      // a8: ldc2_w 1867399129041988099
      // ab: lload 3
      // ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 1
      // b3: aload 10
      // b5: ldc2_w 1890493258055805220
      // b8: lload 3
      // b9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: aload 10
      // c0: ldc2_w 2176670971842518814
      // c3: lload 3
      // c4: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: aload 10
      // cb: ldc2_w 92602209585210859
      // ce: lload 3
      // cf: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: ldc2_w 2290646061245030205
      // d7: lload 3
      // d8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: areturn
      // de: aload 10
      // e0: ldc2_w 1890493258055805220
      // e3: lload 3
      // e4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: areturn
   }

   public ZKMChangeLog(String var1) {
      long var2 = a ^ 84293544904156L;
      long var4 = var2 ^ 105600901014479L;
      long var6 = var2 ^ 39404507637241L;
      long var8 = var2 ^ 92006368605740L;
      long var10 = var2 ^ 23284387693968L;
      long var12 = var2 ^ 33925623722192L;
      super();
      x44.a<"s">(
         this,
         new _ur(
            null,
            null,
            false,
            a<"s">(11069, 2522200058146770659L ^ var2),
            (String)null,
            (String)null,
            var12,
            (String)null,
            (String)null,
            (String)null,
            (String)null,
            false,
            false
         ),
         -3506354475829302369L,
         var2
      );
      x44.a<"h">(x44.a<"l">(this, -3506354475829302369L, var2), new Object[]{var8}, -3175654418559873769L, var2);
      x44.a<"s">(this, var1, -3523183832543463593L, var2);
      x44.a<"n">(this, new Object[]{var4}, -3389871021713119203L, var2);
      x44.a<"n">(this, new Object[]{var6}, -3506291885142004265L, var2);
      x44.a<"n">(this, new Object[]{var10}, -3269053363990173368L, var2);
   }

   public List getOldPackageNames() {
      long var1 = a ^ 49567170876520L;
      long var3 = var1 ^ 97810706838990L;
      long var5 = var1 ^ 65838548867204L;
      return x44.a<"j">(
         this,
         new Object[]{var5, x44.a<"l">(x44.a<"h">(this, 1794691402289793693L, var1), new Object[]{var3}, 202818625088537552L, var1)},
         567147165969896237L,
         var1
      );
   }

   public List getNewPackageNames() {
      long var1 = a ^ 98352504869744L;
      long var3 = var1 ^ 77610691927244L;
      long var5 = var1 ^ 87439105335196L;
      return x44.a<"j">(
         this,
         new Object[]{var5, x44.a<"l">(x44.a<"h">(this, 6913151003754696069L, var1), new Object[]{var3}, 6404380549735895684L, var1)},
         4667590893442700341L,
         var1
      );
   }

   private ArrayList j(Object[] var1) {
      long var3 = (Long)var1[0];
      ArrayList var2 = (ArrayList)var1[1];
      var3 = a ^ var3;
      hk[] var10000 = x44.a<"w">(-7457960691950657012L, var3);
      int var6 = 0;
      hk[] var5 = var10000;

      label34:
      while (var6 < var2.size()) {
         String var7 = sh.b((String)var2.get(var6));

         do {
            try {
               if (var3 >= 0L) {
                  if (var5 != null) {
                     return var2;
                  }

                  x44.a<"o">(var2, var6, var7, -7278211310059818412L, var3);
               }

               var6++;
               if (var5 == null) {
                  continue label34;
               }
            } catch (IllegalArgumentException var8) {
               throw x44.a<"w">(var8, -7285031156183373553L, var3);
            }
         } while (var3 < 0L);
         break;
      }

      return var2;
   }

   public boolean isOldFieldPresent(String var1, String var2) {
      long var3 = a ^ 23703789276427L;
      long var5 = var3 ^ 109673379320769L;
      hk[] var7 = x44.a<"w">(4719894965787802380L, var3);

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(18098, 1245360690313440179L ^ var3));
         }
      } catch (IllegalArgumentException var11) {
         throw x44.a<"w">(var11, 4892652985291812879L, var3);
      }

      label59: {
         try {
            boolean var10000 = x44.a<"o">(x44.a<"k">(this, 4722937664762942462L, var3), new Object[]{var5, var1}, 6879693148723697921L, var3);
            if (var7 != null) {
               return var10000;
            }

            if (var10000) {
               break label59;
            }
         } catch (IllegalArgumentException var13) {
            throw x44.a<"w">(var13, 4892652985291812879L, var3);
         }

         return false;
      }

      int var8 = var2.indexOf(" ");

      int var14;
      label37: {
         try {
            var14 = var8;
            if (var7 != null) {
               break label37;
            }

            if (var8 <= 0) {
               throw new IllegalArgumentException("'" + var2 + a<"s">(31591, 587831409530574445L ^ var3));
            }
         } catch (IllegalArgumentException var12) {
            throw x44.a<"w">(var12, 4892652985291812879L, var3);
         }

         var14 = var8;
      }

      if (var14 < var2.length() - 1) {
         String var9 = var2.substring(0, var8);
         String var10 = var2.substring(var8 + 1);
         return x44.a<"o">(this, var1, var10, var9, 6342624096634115734L, var3);
      } else {
         throw new IllegalArgumentException("'" + var2 + a<"s">(31591, 587831409530574445L ^ var3));
      }
   }

   private tr Y(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 47024748397L;
      hk[] var10000 = x44.a<"s">(-1523295906492182448L, var3);
      var2 = var2.trim();
      hk[] var7 = var10000;
      int var8 = var2.indexOf(" ");
      if (var8 <= -1) {
         throw new IllegalArgumentException("'" + var2 + a<"s">(21538, 8861131457345196656L ^ var3));
      } else {
         String var9 = var2.substring(0, var8);
         String var10 = var2.substring(var8 + 1);
         var10 = var10.trim();
         int var11 = var10.indexOf("(");
         if (var11 > 0) {
            String var12 = var10.substring(0, var11);
            int var13 = x44.a<"k">(var10, ")", var11, -1526385477444297378L, var3);

            label57: {
               try {
                  if (var7 != null) {
                     break label57;
                  }

                  if (var13 <= -1) {
                     throw new IllegalArgumentException("'" + var2 + a<"s">(20850, 3965513445692938017L ^ var3));
                  }
               } catch (IllegalArgumentException var18) {
                  throw x44.a<"s">(var18, -1676899332860208301L, var3);
               }

               var10 = var10.substring(var11 + 1, var13);
            }

            ArrayList var14 = new ArrayList();
            StringTokenizer var15 = new StringTokenizer(var10, ",");

            label47: {
               while (var15.hasMoreTokens()) {
                  try {
                     if (var3 >= 0L) {
                        var23 = var14.add(var15.nextToken().trim());
                        if (var7 != null) {
                           break label47;
                        }
                     }

                     if (var7 == null) {
                        continue;
                     }
                  } catch (IllegalArgumentException var17) {
                     throw x44.a<"s">(var17, -1676899332860208301L, var3);
                  }

                  if (var3 > 0L) {
                     break;
                  }
               }

               var23 = var14.size();
            }

            String[] var16 = new String[var23];
            var16 = var14.toArray(var16);
            return new tr(this, var9, var5, var12, var16);
         } else {
            throw new IllegalArgumentException("'" + var2 + a<"s">(15165, 6736514724548935014L ^ var3));
         }
      }
   }

   private void s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 24256144667394L;
      long var6 = var2 ^ 111419364644887L;
      long var8 = var2 ^ 71612077173976L;
      long var10 = var2 ^ 60982079986147L;
      x44.a<"s">(this, x44.a<"h">(x44.a<"l">(this, 8394394608582283447L, var2), new Object[]{var10}, 7632826017421161551L, var2), 7631635344160346809L, var2);
      x44.a<"s">(this, x44.a<"h">(x44.a<"l">(this, 8394394608582283447L, var2), new Object[]{var4}, 8379051191399636411L, var2), 8507604787914604789L, var2);
      x44.a<"s">(this, x44.a<"h">(x44.a<"l">(this, 8394394608582283447L, var2), new Object[]{var6}, 8283579925492587014L, var2), 7599876738595621027L, var2);
      x44.a<"s">(this, x44.a<"h">(x44.a<"l">(this, 8394394608582283447L, var2), new Object[]{var8}, 8298564261365240524L, var2), 8406685535564472630L, var2);
   }

   public String getOldTypeName(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 45788802227091
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 51662179138311
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 6275857740213890452
      // 14: lload 2
      // 15: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnonnull 79
      // 22: ifnonnull 51
      // 25: goto 32
      // 28: ldc2_w 6160376579960120983
      // 2b: lload 2
      // 2c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: new java/lang/IllegalArgumentException
      // 35: dup
      // 36: sipush 3582
      // 39: ldc2_w 5194258693261489762
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 46: athrow
      // 47: ldc2_w 6160376579960120983
      // 4a: lload 2
      // 4b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w 6274361882291209574
      // 55: lload 2
      // 56: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: aload 1
      // 5c: lload 4
      // 5e: bipush 2
      // 5f: anewarray 529
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w 5787077074208584997
      // 73: lload 2
      // 74: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: astore 7
      // 7b: aload 7
      // 7d: aload 6
      // 7f: ifnonnull a3
      // 82: ifnonnull 9e
      // 85: goto 92
      // 88: ldc2_w 6160376579960120983
      // 8b: lload 2
      // 8c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 1
      // 93: areturn
      // 94: ldc2_w 6160376579960120983
      // 97: lload 2
      // 98: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: aload 7
      // a0: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // a3: areturn
   }

   public String getOldClassName(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 106702572360151
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 107445730165022
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -2496089360631126064
      // 14: lload 2
      // 15: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnonnull 79
      // 22: ifnonnull 51
      // 25: goto 32
      // 28: ldc2_w -2361498694738629421
      // 2b: lload 2
      // 2c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: new java/lang/IllegalArgumentException
      // 35: dup
      // 36: sipush 17652
      // 39: ldc2_w 6156935355118925102
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 46: athrow
      // 47: ldc2_w -2361498694738629421
      // 4a: lload 2
      // 4b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w -2497445772780466398
      // 55: lload 2
      // 56: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: aload 1
      // 5c: lload 4
      // 5e: bipush 2
      // 5f: anewarray 529
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w -4241830785057152278
      // 73: lload 2
      // 74: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: astore 7
      // 7b: aload 7
      // 7d: aload 6
      // 7f: ifnonnull a3
      // 82: ifnonnull 9e
      // 85: goto 92
      // 88: ldc2_w -2361498694738629421
      // 8b: lload 2
      // 8c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 1
      // 93: areturn
      // 94: ldc2_w -2361498694738629421
      // 97: lload 2
      // 98: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: aload 7
      // a0: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // a3: areturn
   }

   public String getNewClassName(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 7334133365433
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 8349416268728
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 3905320525885787326
      // 14: lload 2
      // 15: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnonnull 79
      // 22: ifnonnull 51
      // 25: goto 32
      // 28: ldc2_w 3770677076945520573
      // 2b: lload 2
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: new java/lang/IllegalArgumentException
      // 35: dup
      // 36: sipush 18098
      // 39: ldc2_w 1245381457913273345
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 46: athrow
      // 47: ldc2_w 3770677076945520573
      // 4a: lload 2
      // 4b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w 3907204647770350668
      // 55: lload 2
      // 56: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: aload 1
      // 5c: lload 4
      // 5e: bipush 2
      // 5f: anewarray 529
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: ldc2_w 3486786536407115059
      // 73: lload 2
      // 74: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: astore 7
      // 7b: aload 7
      // 7d: aload 6
      // 7f: ifnonnull a3
      // 82: ifnonnull 9e
      // 85: goto 92
      // 88: ldc2_w 3770677076945520573
      // 8b: lload 2
      // 8c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 1
      // 93: areturn
      // 94: ldc2_w 3770677076945520573
      // 97: lload 2
      // 98: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: aload 7
      // a0: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // a3: areturn
   }

   public String getOldFieldName(String param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKMChangeLog.a J
      // 03: ldc2_w 105870736222597
      // 06: lxor
      // 07: lstore 4
      // 09: lload 4
      // 0b: dup2
      // 0c: ldc2_w 33036190924489
      // 0f: lxor
      // 10: lstore 6
      // 12: pop2
      // 13: ldc2_w 2670100980221140866
      // 16: lload 4
      // 18: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 8
      // 1f: aload 1
      // 20: aload 8
      // 22: ifnonnull 8d
      // 25: ifnonnull 57
      // 28: goto 36
      // 2b: ldc2_w 2839594541126636673
      // 2e: lload 4
      // 30: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: new java/lang/IllegalArgumentException
      // 39: dup
      // 3a: sipush 21488
      // 3d: ldc2_w 6356699515702205027
      // 40: lload 4
      // 42: lxor
      // 43: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/ZKMChangeLog.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4b: athrow
      // 4c: ldc2_w 2839594541126636673
      // 4f: lload 4
      // 51: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 0
      // 58: ldc2_w 2667620883843872624
      // 5b: lload 4
      // 5d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: lload 6
      // 64: aload 1
      // 65: aload 2
      // 66: aload 3
      // 67: bipush 4
      // 68: anewarray 529
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 3
      // 6e: swap
      // 6f: aastore
      // 70: dup_x1
      // 71: swap
      // 72: bipush 2
      // 73: swap
      // 74: aastore
      // 75: dup_x1
      // 76: swap
      // 77: bipush 1
      // 78: swap
      // 79: aastore
      // 7a: dup_x2
      // 7b: dup_x2
      // 7c: pop
      // 7d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 80: bipush 0
      // 81: swap
      // 82: aastore
      // 83: ldc2_w 4584650688166642617
      // 86: lload 4
      // 88: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: areturn
   }

   public boolean isOldPackagePresent(String var1) {
      long var2 = a ^ 235885912717L;
      long var4 = var2 ^ 31761374338662L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"s">(20120, 9127001214680419349L ^ var2));
         }
      } catch (IllegalArgumentException var6) {
         throw x44.a<"q">(var6, -6025776376990703735L, var2);
      }

      return x44.a<"i">(x44.a<"m">(this, -5905015774487511944L, var2), new Object[]{var4, var1}, -6066124095927338878L, var2);
   }

   static {
      long var0 = a ^ 48293579233201L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "ª\u009bO ÓMµ¶1â\u001a\u0013^\u0084-\u001eÃ¥j´¢A6úö*\u0099¹\u008f{ó\u008a*Ö¬\u0002]YeB\u009e÷~ÖsÂ1$¦zQÿfÊ\u0012â{Áé\u0084\u0092ö4Ã8\u00963{S~Â¹¸DÇ(=©ï1l\u001c#reÐ²9\u001a!\u0085p~Äñ\"ðppÊÕ\u0015ëirÞ*®d\u008fvàúð\u0004a\u0096l\u009b»\u0005@\u0091ò7×ÁÀ\b=Ø9Cq\u008fóX\u0088ãÏ8 nK;ô\u000e ?X\u0010'\u0092'\u0003\u0005üå®´*\u0018þ\n§\u0083ý\u0019üð\u0098çp9×pqt0® r\u0011yh¡@\u0097nI(Û\u0080\u0000ü!kF{\u0004$¸¬71RÐ\u0014\u001f/bÛ=\u001f\u00029þÝÓ´C ?ËüÌ\u001c\u008c\u0007.&øc¢ðå\bé\u0011É¦\u00983\u0096\u0095aÐÑ|å\u001b\u0018Ãñ§i\u0000-^â\u0001©\u0085ZPÝej\u009c¡\u0093ú¾°¯ç\u0010hfñ\u0098\u001dvæÍ\u0018;H\u0019Å\u0007\u0081ýHT\u008b\u0086!5^\u009d}·¦ö©\u000eÏ¿Øo\u001b¿ñXÌL¾\u008f\n¥w\u009c\u0012:6\u009a\u0016\tÀ0ù\u001dÆS\u0000O1\nÍ}\u008d\u0001\"\u008fÓ£Xãy2ÁIÕþ\u0092\u0017\u009dK,£¢@\u0087{ý@©È¼nÞv3s\u0002\u00076\u0081È.#´\u0095\"ho\u0082\u000e7äXÕtý{?Ù\u001eènJ\b\u0085ïí*\u0080Òël:\u008eâ\u0000²Òê\u0083r\u0093Þ¬f\u0085\u009ca\u0002Ëaï@J´H\u000e\u0019n«gÌEG/Y´\u0083\u0089Ü\u0097Á\"¾_Ó¤\u0080ji~[#\u0088ÞÚð¦\u001fÆá\u008e?#ZY\u00adòR]\u0090¡VûZ+à\u001d¬\u001d\u0093ô×í\u0003Þd8 ÀHd\u00156,8Ð&~ð©\u0004\u0001!$%ý\u0011H\u009aÀáÇ[\\Ãó5ñ\f©UöÙ£Â\u008dî:_\u00125\r\u0085\u0094\tpWÌ¶Ê¸\u0095Ø@ß\u0081j'8<!sð\u0081¨\u0098\u008e\f\u009b\u0085\u0006\f-Sy¢Ö¨[\u0096rÀ¹,ù\u0010ùåì©Zã\u0004øq:r\u0084Öq\u008a»×k*k]d}\u001cY\u0088ÉÚ»·6'@¥Ùt2\u007f\u000exòw\u0016WT\u000b~Â±à a!µ*ò©Ð7\u0001\u001b2\u0095f@4\u0089\u0011\u008ch\u0084\u0089nZ\u0007á'\u0082x\u007fZÉ\u0080\fà\u001f«}õG³4Yè\u0091\u001aj@,©\u0090®uìÁæá¤\u008bi\u0015tb«\u0081þþ~:kV»Î\u009eçä´\tx\u0013¦M\u007f2gÆ\f±\u0010ëØ\u0099\r½rÎ.\u001fÅ\rM\u0099¨À'j°¤ê\u0084¨\u0013@Z¬Îì\fk\u0097\u0087\u0016\u00ad\u007fÁy*zó$\u008aÞ\u0001|ã\u0093Ð\u0097\"û\u001d/»\u0082,q/ò-\u0092\u0099Ç·\\jêB2\u0089½\u0096Ý\u0083\u0083¦\u0084\"Ú`\u0090\u0098\u0090\u0017\u0097ÿEÏH\u0012È,£×¢Ë\u008e©¯vÙ_s³zµ\u0003\r6§\u009eñ\u0015¤|úæèÎNÊåÕ¹ê\u0084R\u0018ÑËØ\u000f§\u001c>à³¬ãØïV\u009f\u00968`Ë\u0007ÿ\u008c|\u0002ÈÜ.·íJ,&D@mÊµ*q A\u0090 Dß\u0000j\"¥+\u001e\u0013\u009e\u001cKur\u0094\u000b\u007fî<æjã\u0095#Pe¼\u0088ãTÓÁ\u0017>>¬A\bô\u0017õ\u00adã0A_\t'ÿcTb\u0001\u0081\u0015@\u0007ó·ÒwÞÓ¦Ð\u000e\u009c\u000eø7iÝµV\u0090²õt¯\u008c£Ý\u0014u³s\u0001\f\u007fÈ\u009e\n\u0019ìá\u0003åÍ\u0017-Ñ\u000fV^½-ê\u0010ØÇ\u0012\u008d?b\u0094!\u001eI\u0090Y";
      int var8 = "ª\u009bO ÓMµ¶1â\u001a\u0013^\u0084-\u001eÃ¥j´¢A6úö*\u0099¹\u008f{ó\u008a*Ö¬\u0002]YeB\u009e÷~ÖsÂ1$¦zQÿfÊ\u0012â{Áé\u0084\u0092ö4Ã8\u00963{S~Â¹¸DÇ(=©ï1l\u001c#reÐ²9\u001a!\u0085p~Äñ\"ðppÊÕ\u0015ëirÞ*®d\u008fvàúð\u0004a\u0096l\u009b»\u0005@\u0091ò7×ÁÀ\b=Ø9Cq\u008fóX\u0088ãÏ8 nK;ô\u000e ?X\u0010'\u0092'\u0003\u0005üå®´*\u0018þ\n§\u0083ý\u0019üð\u0098çp9×pqt0® r\u0011yh¡@\u0097nI(Û\u0080\u0000ü!kF{\u0004$¸¬71RÐ\u0014\u001f/bÛ=\u001f\u00029þÝÓ´C ?ËüÌ\u001c\u008c\u0007.&øc¢ðå\bé\u0011É¦\u00983\u0096\u0095aÐÑ|å\u001b\u0018Ãñ§i\u0000-^â\u0001©\u0085ZPÝej\u009c¡\u0093ú¾°¯ç\u0010hfñ\u0098\u001dvæÍ\u0018;H\u0019Å\u0007\u0081ýHT\u008b\u0086!5^\u009d}·¦ö©\u000eÏ¿Øo\u001b¿ñXÌL¾\u008f\n¥w\u009c\u0012:6\u009a\u0016\tÀ0ù\u001dÆS\u0000O1\nÍ}\u008d\u0001\"\u008fÓ£Xãy2ÁIÕþ\u0092\u0017\u009dK,£¢@\u0087{ý@©È¼nÞv3s\u0002\u00076\u0081È.#´\u0095\"ho\u0082\u000e7äXÕtý{?Ù\u001eènJ\b\u0085ïí*\u0080Òël:\u008eâ\u0000²Òê\u0083r\u0093Þ¬f\u0085\u009ca\u0002Ëaï@J´H\u000e\u0019n«gÌEG/Y´\u0083\u0089Ü\u0097Á\"¾_Ó¤\u0080ji~[#\u0088ÞÚð¦\u001fÆá\u008e?#ZY\u00adòR]\u0090¡VûZ+à\u001d¬\u001d\u0093ô×í\u0003Þd8 ÀHd\u00156,8Ð&~ð©\u0004\u0001!$%ý\u0011H\u009aÀáÇ[\\Ãó5ñ\f©UöÙ£Â\u008dî:_\u00125\r\u0085\u0094\tpWÌ¶Ê¸\u0095Ø@ß\u0081j'8<!sð\u0081¨\u0098\u008e\f\u009b\u0085\u0006\f-Sy¢Ö¨[\u0096rÀ¹,ù\u0010ùåì©Zã\u0004øq:r\u0084Öq\u008a»×k*k]d}\u001cY\u0088ÉÚ»·6'@¥Ùt2\u007f\u000exòw\u0016WT\u000b~Â±à a!µ*ò©Ð7\u0001\u001b2\u0095f@4\u0089\u0011\u008ch\u0084\u0089nZ\u0007á'\u0082x\u007fZÉ\u0080\fà\u001f«}õG³4Yè\u0091\u001aj@,©\u0090®uìÁæá¤\u008bi\u0015tb«\u0081þþ~:kV»Î\u009eçä´\tx\u0013¦M\u007f2gÆ\f±\u0010ëØ\u0099\r½rÎ.\u001fÅ\rM\u0099¨À'j°¤ê\u0084¨\u0013@Z¬Îì\fk\u0097\u0087\u0016\u00ad\u007fÁy*zó$\u008aÞ\u0001|ã\u0093Ð\u0097\"û\u001d/»\u0082,q/ò-\u0092\u0099Ç·\\jêB2\u0089½\u0096Ý\u0083\u0083¦\u0084\"Ú`\u0090\u0098\u0090\u0017\u0097ÿEÏH\u0012È,£×¢Ë\u008e©¯vÙ_s³zµ\u0003\r6§\u009eñ\u0015¤|úæèÎNÊåÕ¹ê\u0084R\u0018ÑËØ\u000f§\u001c>à³¬ãØïV\u009f\u00968`Ë\u0007ÿ\u008c|\u0002ÈÜ.·íJ,&D@mÊµ*q A\u0090 Dß\u0000j\"¥+\u001e\u0013\u009e\u001cKur\u0094\u000b\u007fî<æjã\u0095#Pe¼\u0088ãTÓÁ\u0017>>¬A\bô\u0017õ\u00adã0A_\t'ÿcTb\u0001\u0081\u0015@\u0007ó·ÒwÞÓ¦Ð\u000e\u009c\u000eø7iÝµV\u0090²õt¯\u008c£Ý\u0014u³s\u0001\f\u007fÈ\u009e\n\u0019ìá\u0003åÍ\u0017-Ñ\u000fV^½-ê\u0010ØÇ\u0012\u008d?b\u0094!\u001eI\u0090Y"
         .length();
      char var5 = '@';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[19];
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

                  var6 = "QÕ0o\u0082;\u0014tu\u0085RòQçÆô8ä-OÈù¯Øv\u0017Ü£@U¥Û\u0006bÖ=£Ú«±Ùoa©§á&C\u00184ñû\u0090\u000e/\u0010  µ\u0017ê³kºhV²Biä¼\u0013Æ";
                  var8 = "QÕ0o\u0082;\u0014tu\u0085RòQçÆô8ä-OÈù¯Øv\u0017Ü£@U¥Û\u0006bÖ=£Ú«±Ùoa©§á&C\u00184ñû\u0090\u000e/\u0010  µ\u0017ê³kºhV²Biä¼\u0013Æ"
                     .length();
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

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14561;
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
            throw new RuntimeException("com/zelix/ZKMChangeLog", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/ZKMChangeLog" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
