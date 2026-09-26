package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lbw {
   private final boolean x;
   private final Random z;
   private final n0 y;
   private final ee l;
   private static final long a = prr.a(6311893171325124999L, -7754800316800425343L, MethodHandles.lookup().lookupClass()).a(143824884353707L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public u5 s(Object[] var1) {
      l62 var4 = (l62)var1[0];
      String var8 = (String)var1[1];
      bn var12 = (bn)var1[2];
      df var7 = (df)var1[3];
      boolean var2 = (Boolean)var1[4];
      Map var3 = (Map)var1[5];
      Map var11 = (Map)var1[6];
      long var5 = (Long)var1[7];
      boolean var9 = (Boolean)var1[8];
      boolean var10 = (Boolean)var1[9];
      var5 = a ^ var5;
      long var13 = var5 ^ 32423025338714L;
      long var15 = var5 ^ 134664599129647L;
      boolean var10006 = m44.a<"s">(var4, new Object[]{var15}, 3724780201137187764L, var5);
      Object[] var10012 = new Object[]{null, null, null, null, null, null, null, null, null, var10};
      var10012[8] = var9;
      var10012[7] = var11;
      var10012[6] = var3;
      var10012[5] = var10006;
      var10012[4] = var7;
      var10012[3] = var13;
      var10012[2] = var12;
      var10012[1] = var8;
      var10012[0] = var4;
      return m44.a<"s">(this, var10012, 3269503045991950794L, var5);
   }

   boolean J(Object[] param1) {
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
      // 004: checkcast com/zelix/bn
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
      // 015: checkcast com/zelix/u5
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/lbw.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 133764362511425
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 11029871045263
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 3371883646654
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: ldc2_w -8672126423841169651
      // 03b: lload 3
      // 03c: invokedynamic n (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: astore 12
      // 043: aload 2
      // 044: lload 6
      // 046: bipush 1
      // 047: anewarray 275
      // 04a: dup_x2
      // 04b: dup_x2
      // 04c: pop
      // 04d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 050: bipush 0
      // 051: swap
      // 052: aastore
      // 053: ldc2_w -7019259531749932860
      // 056: lload 3
      // 057: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 12
      // 05e: ifnull 096
      // 061: ifne 07d
      // 064: goto 071
      // 067: ldc2_w -7218441435605911686
      // 06a: lload 3
      // 06b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: bipush 1
      // 072: ireturn
      // 073: ldc2_w -7218441435605911686
      // 076: lload 3
      // 077: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: aload 2
      // 07e: lload 8
      // 080: bipush 1
      // 081: anewarray 275
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -7011141993682511938
      // 090: lload 3
      // 091: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: istore 13
      // 098: iload 13
      // 09a: aload 12
      // 09c: ifnull 124
      // 09f: ifle 123
      // 0a2: goto 0af
      // 0a5: ldc2_w -7218441435605911686
      // 0a8: lload 3
      // 0a9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: bipush 0
      // 0b2: anewarray 275
      // 0b5: ldc2_w -8956617900441864885
      // 0b8: lload 3
      // 0b9: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/ui; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: astore 14
      // 0c0: aload 14
      // 0c2: aload 14
      // 0c4: arraylength
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: aaload
      // 0c8: astore 15
      // 0ca: aload 2
      // 0cb: invokevirtual com/zelix/bn.V ()Ljava/lang/String;
      // 0ce: lload 10
      // 0d0: dup2_x1
      // 0d1: pop2
      // 0d2: bipush 2
      // 0d3: anewarray 275
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: ldc2_w -6940092220623026265
      // 0e7: lload 3
      // 0e8: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: astore 16
      // 0ef: aload 15
      // 0f1: invokevirtual com/zelix/ui.R ()I
      // 0f4: aload 12
      // 0f6: ifnull 124
      // 0f9: aload 16
      // 0fb: invokeinterface java/util/List.size ()I 1
      // 100: aload 14
      // 102: arraylength
      // 103: iadd
      // 104: iload 13
      // 106: isub
      // 107: if_icmplt 123
      // 10a: goto 117
      // 10d: ldc2_w -7218441435605911686
      // 110: lload 3
      // 111: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: bipush 0
      // 118: ireturn
      // 119: ldc2_w -7218441435605911686
      // 11c: lload 3
      // 11d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: bipush 1
      // 124: ireturn
   }

   public lbw(hr var1, n0 var2, long var3, boolean var5, Random var6) {
      var3 = a ^ var3;
      long var7 = var3 ^ 99062917025407L;
      super();
      this.l = m44.a<"r">(var2, new Object[]{var7}, 5256077405033797980L, var3);
      this.y = var2;
      this.x = var5;
      this.z = var6;
   }

   final boolean m(Object[] param1) {
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
      // 004: checkcast com/zelix/l62
      // 007: astore 13
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/bn
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/u5
      // 017: astore 12
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/loe
      // 01f: astore 9
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/loe
      // 027: astore 10
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/lang/Long
      // 02f: invokevirtual java/lang/Long.longValue ()J
      // 032: lstore 5
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast com/zelix/df
      // 03b: astore 8
      // 03d: dup
      // 03e: bipush 7
      // 040: aaload
      // 041: checkcast java/util/Map
      // 044: astore 2
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast java/util/Map
      // 04c: astore 3
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 11
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast java/lang/Boolean
      // 060: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 063: istore 7
      // 065: pop
      // 066: getstatic com/zelix/lbw.a J
      // 069: lload 5
      // 06b: lxor
      // 06c: lstore 5
      // 06e: lload 5
      // 070: dup2
      // 071: ldc2_w 79245566757537
      // 074: lxor
      // 075: lstore 14
      // 077: dup2
      // 078: ldc2_w 49583059958822
      // 07b: lxor
      // 07c: dup2
      // 07d: bipush 48
      // 07f: lushr
      // 080: l2i
      // 081: istore 16
      // 083: dup2
      // 084: bipush 16
      // 086: lshl
      // 087: bipush 32
      // 089: lushr
      // 08a: l2i
      // 08b: istore 17
      // 08d: dup2
      // 08e: bipush 48
      // 090: lshl
      // 091: bipush 48
      // 093: lushr
      // 094: l2i
      // 095: istore 18
      // 097: pop2
      // 098: dup2
      // 099: ldc2_w 44567398693799
      // 09c: lxor
      // 09d: lstore 19
      // 09f: dup2
      // 0a0: ldc2_w 2979897651226
      // 0a3: lxor
      // 0a4: dup2
      // 0a5: bipush 32
      // 0a7: lushr
      // 0a8: l2i
      // 0a9: istore 21
      // 0ab: dup2
      // 0ac: bipush 32
      // 0ae: lshl
      // 0af: bipush 48
      // 0b1: lushr
      // 0b2: l2i
      // 0b3: istore 22
      // 0b5: dup2
      // 0b6: bipush 48
      // 0b8: lshl
      // 0b9: bipush 48
      // 0bb: lushr
      // 0bc: l2i
      // 0bd: istore 23
      // 0bf: pop2
      // 0c0: dup2
      // 0c1: ldc2_w 37043814561272
      // 0c4: lxor
      // 0c5: lstore 24
      // 0c7: dup2
      // 0c8: ldc2_w 57242227118197
      // 0cb: lxor
      // 0cc: lstore 26
      // 0ce: dup2
      // 0cf: ldc2_w 132998436713530
      // 0d2: lxor
      // 0d3: lstore 28
      // 0d5: dup2
      // 0d6: ldc2_w 119764503175617
      // 0d9: lxor
      // 0da: lstore 30
      // 0dc: pop2
      // 0dd: ldc2_w 4600712791753140082
      // 0e0: lload 5
      // 0e2: invokedynamic i (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: aload 9
      // 0e9: lload 28
      // 0eb: invokevirtual com/zelix/loe.M (J)Lcom/zelix/lox;
      // 0ee: astore 33
      // 0f0: astore 32
      // 0f2: iload 11
      // 0f4: ifeq 107
      // 0f7: aload 9
      // 0f9: goto 109
      // 0fc: ldc2_w 2570879033749147397
      // 0ff: lload 5
      // 101: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 33
      // 109: astore 34
      // 10b: aload 9
      // 10d: bipush 0
      // 10e: anewarray 275
      // 111: ldc2_w 2444042485082130550
      // 114: lload 5
      // 116: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: aload 10
      // 11d: bipush 0
      // 11e: anewarray 275
      // 121: ldc2_w 2444042485082130550
      // 124: lload 5
      // 126: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12e: aload 32
      // 130: lload 5
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 15c
      // 137: ifnull 15a
      // 13a: ifeq 158
      // 13d: goto 14b
      // 140: ldc2_w 2570879033749147397
      // 143: lload 5
      // 145: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: bipush 0
      // 14c: ireturn
      // 14d: ldc2_w 2570879033749147397
      // 150: lload 5
      // 152: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: iload 11
      // 15a: aload 32
      // 15c: lload 5
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 1a7
      // 163: ifnull 1a5
      // 166: ifeq 1a3
      // 169: goto 177
      // 16c: ldc2_w 2570879033749147397
      // 16f: lload 5
      // 171: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: aload 2
      // 178: aload 9
      // 17a: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 17f: aload 32
      // 181: ifnull 1f4
      // 184: goto 192
      // 187: ldc2_w 2570879033749147397
      // 18a: lload 5
      // 18c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: ifne 1f3
      // 195: goto 1a3
      // 198: ldc2_w 2570879033749147397
      // 19b: lload 5
      // 19d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: iload 11
      // 1a5: aload 32
      // 1a7: ifnull 210
      // 1aa: ifne 1f5
      // 1ad: goto 1bb
      // 1b0: ldc2_w 2570879033749147397
      // 1b3: lload 5
      // 1b5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 3
      // 1bc: aload 9
      // 1be: lload 28
      // 1c0: invokevirtual com/zelix/loe.M (J)Lcom/zelix/lox;
      // 1c3: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1c8: aload 32
      // 1ca: lload 5
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 212
      // 1d1: ifnull 210
      // 1d4: goto 1e2
      // 1d7: ldc2_w 2570879033749147397
      // 1da: lload 5
      // 1dc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: ifeq 1f5
      // 1e5: goto 1f3
      // 1e8: ldc2_w 2570879033749147397
      // 1eb: lload 5
      // 1ed: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: bipush 0
      // 1f4: ireturn
      // 1f5: aload 10
      // 1f7: lload 19
      // 1f9: bipush 1
      // 1fa: anewarray 275
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w 2567281072787760452
      // 209: lload 5
      // 20b: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: aload 32
      // 212: ifnull 297
      // 215: ifne 26c
      // 218: goto 226
      // 21b: ldc2_w 2570879033749147397
      // 21e: lload 5
      // 220: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: athrow
      // 226: aload 8
      // 228: iload 16
      // 22a: i2c
      // 22b: iload 17
      // 22d: iload 18
      // 22f: aload 34
      // 231: invokevirtual com/zelix/df.A (CIILjava/lang/Object;)Z
      // 234: aload 32
      // 236: lload 5
      // 238: lconst_0
      // 239: lcmp
      // 23a: iflt 299
      // 23d: ifnull 297
      // 240: goto 24e
      // 243: ldc2_w 2570879033749147397
      // 246: lload 5
      // 248: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: ifeq 26c
      // 251: goto 25f
      // 254: ldc2_w 2570879033749147397
      // 257: lload 5
      // 259: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: bipush 0
      // 260: ireturn
      // 261: ldc2_w 2570879033749147397
      // 264: lload 5
      // 266: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 0
      // 26d: ldc2_w 4100026398958200811
      // 270: lload 5
      // 272: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: lload 26
      // 279: aload 9
      // 27b: bipush 2
      // 27c: anewarray 275
      // 27f: dup_x1
      // 280: swap
      // 281: bipush 1
      // 282: swap
      // 283: aastore
      // 284: dup_x2
      // 285: dup_x2
      // 286: pop
      // 287: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28a: bipush 0
      // 28b: swap
      // 28c: aastore
      // 28d: ldc2_w 2554736533339243985
      // 290: lload 5
      // 292: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: aload 32
      // 299: lload 5
      // 29b: lconst_0
      // 29c: lcmp
      // 29d: iflt 2fc
      // 2a0: ifnull 2fa
      // 2a3: ifeq 2c1
      // 2a6: goto 2b4
      // 2a9: ldc2_w 2570879033749147397
      // 2ac: lload 5
      // 2ae: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: athrow
      // 2b4: bipush 0
      // 2b5: ireturn
      // 2b6: ldc2_w 2570879033749147397
      // 2b9: lload 5
      // 2bb: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: ldc2_w 4100026398958200811
      // 2c5: lload 5
      // 2c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: lload 30
      // 2ce: aload 13
      // 2d0: aload 9
      // 2d2: aload 10
      // 2d4: bipush 4
      // 2d5: anewarray 275
      // 2d8: dup_x1
      // 2d9: swap
      // 2da: bipush 3
      // 2db: swap
      // 2dc: aastore
      // 2dd: dup_x1
      // 2de: swap
      // 2df: bipush 2
      // 2e0: swap
      // 2e1: aastore
      // 2e2: dup_x1
      // 2e3: swap
      // 2e4: bipush 1
      // 2e5: swap
      // 2e6: aastore
      // 2e7: dup_x2
      // 2e8: dup_x2
      // 2e9: pop
      // 2ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ed: bipush 0
      // 2ee: swap
      // 2ef: aastore
      // 2f0: ldc2_w 4587948710019069004
      // 2f3: lload 5
      // 2f5: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: aload 32
      // 2fc: lload 5
      // 2fe: lconst_0
      // 2ff: lcmp
      // 300: iflt 328
      // 303: ifnull 326
      // 306: ifeq 324
      // 309: goto 317
      // 30c: ldc2_w 2570879033749147397
      // 30f: lload 5
      // 311: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: athrow
      // 317: bipush 0
      // 318: ireturn
      // 319: ldc2_w 2570879033749147397
      // 31c: lload 5
      // 31e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: iload 7
      // 326: aload 32
      // 328: ifnull 3f3
      // 32b: ifeq 3cb
      // 32e: goto 33c
      // 331: ldc2_w 2570879033749147397
      // 334: lload 5
      // 336: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: athrow
      // 33c: aload 0
      // 33d: ldc2_w 4100026398958200811
      // 340: lload 5
      // 342: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: lload 14
      // 349: aload 13
      // 34b: aload 9
      // 34d: aload 10
      // 34f: bipush 1
      // 350: new com/zelix/sz
      // 353: dup
      // 354: iload 21
      // 356: iload 22
      // 358: i2s
      // 359: iload 23
      // 35b: i2c
      // 35c: invokespecial com/zelix/sz.<init> (ISC)V
      // 35f: bipush 6
      // 361: anewarray 275
      // 364: dup_x1
      // 365: swap
      // 366: bipush 5
      // 367: swap
      // 368: aastore
      // 369: dup_x1
      // 36a: swap
      // 36b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36e: bipush 4
      // 36f: swap
      // 370: aastore
      // 371: dup_x1
      // 372: swap
      // 373: bipush 3
      // 374: swap
      // 375: aastore
      // 376: dup_x1
      // 377: swap
      // 378: bipush 2
      // 379: swap
      // 37a: aastore
      // 37b: dup_x1
      // 37c: swap
      // 37d: bipush 1
      // 37e: swap
      // 37f: aastore
      // 380: dup_x2
      // 381: dup_x2
      // 382: pop
      // 383: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 386: bipush 0
      // 387: swap
      // 388: aastore
      // 389: ldc2_w 4173231563654065215
      // 38c: lload 5
      // 38e: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 393: aload 32
      // 395: lload 5
      // 397: lconst_0
      // 398: lcmp
      // 399: iflt 3f5
      // 39c: ifnull 3f3
      // 39f: goto 3ad
      // 3a2: ldc2_w 2570879033749147397
      // 3a5: lload 5
      // 3a7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: ifne 3cb
      // 3b0: goto 3be
      // 3b3: ldc2_w 2570879033749147397
      // 3b6: lload 5
      // 3b8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: athrow
      // 3be: bipush 0
      // 3bf: ireturn
      // 3c0: ldc2_w 2570879033749147397
      // 3c3: lload 5
      // 3c5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: athrow
      // 3cb: aload 0
      // 3cc: aload 4
      // 3ce: lload 24
      // 3d0: aload 12
      // 3d2: bipush 3
      // 3d3: anewarray 275
      // 3d6: dup_x1
      // 3d7: swap
      // 3d8: bipush 2
      // 3d9: swap
      // 3da: aastore
      // 3db: dup_x2
      // 3dc: dup_x2
      // 3dd: pop
      // 3de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e1: bipush 1
      // 3e2: swap
      // 3e3: aastore
      // 3e4: dup_x1
      // 3e5: swap
      // 3e6: bipush 0
      // 3e7: swap
      // 3e8: aastore
      // 3e9: ldc2_w 4429628985238899940
      // 3ec: lload 5
      // 3ee: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: aload 32
      // 3f5: ifnull 417
      // 3f8: ifne 416
      // 3fb: goto 409
      // 3fe: ldc2_w 2570879033749147397
      // 401: lload 5
      // 403: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: athrow
      // 409: bipush 0
      // 40a: ireturn
      // 40b: ldc2_w 2570879033749147397
      // 40e: lload 5
      // 410: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 415: athrow
      // 416: bipush 1
      // 417: ireturn
   }

   private u5 A(Object[] param1) {
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
      // 004: checkcast com/zelix/l62
      // 007: astore 12
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/bn
      // 00f: astore 11
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/loe
      // 017: astore 2
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Boolean
      // 01e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021: istore 10
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/df
      // 029: astore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: istore 13
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/lang/Long
      // 03d: invokevirtual java/lang/Long.longValue ()J
      // 040: lstore 8
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast java/util/Map
      // 049: astore 7
      // 04b: dup
      // 04c: bipush 8
      // 04e: aaload
      // 04f: checkcast java/util/Map
      // 052: astore 6
      // 054: dup
      // 055: bipush 9
      // 057: aaload
      // 058: checkcast java/lang/Boolean
      // 05b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05e: istore 3
      // 05f: dup
      // 060: bipush 10
      // 062: aaload
      // 063: checkcast [[C
      // 066: astore 5
      // 068: pop
      // 069: getstatic com/zelix/lbw.a J
      // 06c: lload 8
      // 06e: lxor
      // 06f: lstore 8
      // 071: lload 8
      // 073: dup2
      // 074: ldc2_w 39628489119922
      // 077: lxor
      // 078: lstore 14
      // 07a: dup2
      // 07b: ldc2_w 109322635123961
      // 07e: lxor
      // 07f: lstore 16
      // 081: dup2
      // 082: ldc2_w 49709128954180
      // 085: lxor
      // 086: lstore 18
      // 088: dup2
      // 089: ldc2_w 51057850605152
      // 08c: lxor
      // 08d: lstore 20
      // 08f: dup2
      // 090: ldc2_w 130254734331865
      // 093: lxor
      // 094: lstore 22
      // 096: pop2
      // 097: ldc2_w -6035275220207586155
      // 09a: lload 8
      // 09c: invokedynamic n (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: aload 2
      // 0a2: invokevirtual com/zelix/loe.v ()Ljava/lang/String;
      // 0a5: astore 25
      // 0a7: lload 16
      // 0a9: bipush 1
      // 0aa: anewarray 275
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 0
      // 0b4: swap
      // 0b5: aastore
      // 0b6: ldc2_w -5702216254773147298
      // 0b9: lload 8
      // 0bb: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: astore 26
      // 0c2: astore 24
      // 0c4: bipush 0
      // 0c5: istore 27
      // 0c7: iload 27
      // 0c9: aload 5
      // 0cb: arraylength
      // 0cc: if_icmpge 25a
      // 0cf: aload 5
      // 0d1: iload 27
      // 0d3: aaload
      // 0d4: astore 28
      // 0d6: aload 11
      // 0d8: lload 22
      // 0da: bipush 1
      // 0db: anewarray 275
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -5400207954787865764
      // 0ea: lload 8
      // 0ec: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: aload 2
      // 0f2: lload 18
      // 0f4: iload 10
      // 0f6: aload 28
      // 0f8: bipush 5
      // 0f9: anewarray 275
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 4
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 106: bipush 3
      // 107: swap
      // 108: aastore
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 2
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 1
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -5569905892593648683
      // 122: lload 8
      // 124: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: astore 29
      // 12b: aload 29
      // 12d: aload 24
      // 12f: ifnull 189
      // 132: invokeinterface java/util/List.size ()I 1
      // 137: bipush 1
      // 138: if_icmple 187
      // 13b: goto 149
      // 13e: ldc2_w -5743498972558025502
      // 141: lload 8
      // 143: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 29
      // 14b: aload 0
      // 14c: ldc2_w -5651381038911121754
      // 14f: lload 8
      // 151: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: lload 14
      // 158: bipush 3
      // 159: anewarray 275
      // 15c: dup_x2
      // 15d: dup_x2
      // 15e: pop
      // 15f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 162: bipush 2
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 1
      // 168: swap
      // 169: aastore
      // 16a: dup_x1
      // 16b: swap
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: ldc2_w -6064183246117072972
      // 172: lload 8
      // 174: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: goto 187
      // 17c: ldc2_w -5743498972558025502
      // 17f: lload 8
      // 181: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 29
      // 189: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 18e: astore 30
      // 190: aload 30
      // 192: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 197: ifeq 24b
      // 19a: aload 30
      // 19c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a1: checkcast com/zelix/u5
      // 1a4: astore 31
      // 1a6: aload 31
      // 1a8: invokevirtual com/zelix/u5.v ()Ljava/lang/String;
      // 1ab: astore 32
      // 1ad: aload 26
      // 1af: aload 32
      // 1b1: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b6: aload 24
      // 1b8: ifnull 0c9
      // 1bb: ifeq 246
      // 1be: new com/zelix/loe
      // 1c1: dup
      // 1c2: aload 25
      // 1c4: aload 32
      // 1c6: invokespecial com/zelix/loe.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1c9: astore 33
      // 1cb: aload 0
      // 1cc: aload 12
      // 1ce: aload 11
      // 1d0: aload 31
      // 1d2: aload 33
      // 1d4: aload 2
      // 1d5: lload 20
      // 1d7: aload 4
      // 1d9: aload 7
      // 1db: aload 6
      // 1dd: iload 3
      // 1de: iload 13
      // 1e0: bipush 11
      // 1e2: anewarray 275
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ea: bipush 10
      // 1ec: swap
      // 1ed: aastore
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1f3: bipush 9
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x1
      // 1f8: swap
      // 1f9: bipush 8
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x1
      // 1fe: swap
      // 1ff: bipush 7
      // 201: swap
      // 202: aastore
      // 203: dup_x1
      // 204: swap
      // 205: bipush 6
      // 207: swap
      // 208: aastore
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 5
      // 210: swap
      // 211: aastore
      // 212: dup_x1
      // 213: swap
      // 214: bipush 4
      // 215: swap
      // 216: aastore
      // 217: dup_x1
      // 218: swap
      // 219: bipush 3
      // 21a: swap
      // 21b: aastore
      // 21c: dup_x1
      // 21d: swap
      // 21e: bipush 2
      // 21f: swap
      // 220: aastore
      // 221: dup_x1
      // 222: swap
      // 223: bipush 1
      // 224: swap
      // 225: aastore
      // 226: dup_x1
      // 227: swap
      // 228: bipush 0
      // 229: swap
      // 22a: aastore
      // 22b: ldc2_w -5825931703642877016
      // 22e: lload 8
      // 230: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: ifeq 246
      // 238: aload 31
      // 23a: areturn
      // 23b: ldc2_w -5743498972558025502
      // 23e: lload 8
      // 240: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: aload 24
      // 248: ifnonnull 190
      // 24b: iinc 27 1
      // 24e: aload 24
      // 250: lload 8
      // 252: lconst_0
      // 253: lcmp
      // 254: ifle 1a1
      // 257: ifnonnull 0c7
      // 25a: lload 8
      // 25c: lconst_0
      // 25d: lcmp
      // 25e: ifle 0cf
      // 261: aconst_null
      // 262: areturn
   }

   public u5 c(Object[] var1) {
      l62 var6 = (l62)var1[0];
      String var9 = (String)var1[1];
      bn var11 = (bn)var1[2];
      df var8 = (df)var1[3];
      Map var5 = (Map)var1[4];
      Map var7 = (Map)var1[5];
      boolean var2 = (Boolean)var1[6];
      boolean var10 = (Boolean)var1[7];
      long var3 = (Long)var1[8];
      var3 = a ^ var3;
      long var12 = var3 ^ 32267136576405L;
      long var14 = var3 ^ 134552169647328L;
      boolean var10006 = m44.a<"t">(var6, new Object[]{var14}, -1045376080133854853L, var3);
      Object[] var10012 = new Object[]{null, null, null, null, null, null, null, null, null, var10};
      var10012[8] = var2;
      var10012[7] = var7;
      var10012[6] = var5;
      var10012[5] = var10006;
      var10012[4] = var8;
      var10012[3] = var12;
      var10012[2] = var11;
      var10012[1] = var9;
      var10012[0] = var6;
      return m44.a<"t">(this, var10012, -1184275627181167867L, var3);
   }

   private static List I(Object[] var0) {
      boolean var5 = (Boolean)var0[0];
      loe var3 = (loe)var0[1];
      long var1 = (Long)var0[2];
      boolean var6 = (Boolean)var0[3];
      char[] var4 = (char[])var0[4];
      var1 = a ^ var1;
      long var7 = var1 ^ 98170637399233L;
      long var9 = var1 ^ 7657807536186L;
      long var11 = var1 ^ 115815835343333L;
      ArrayList var14 = new ArrayList();
      _0[] var10000 = m44.a<"m">(5835821458961451094L, var1);
      String var15 = var3.v();
      String var16 = m44.a<"r">(var3, new Object[0], 5678749868105787218L, var1);
      String var17 = m44.a<"m">(new Object[]{var16}, 5852357030338185503L, var1);
      List var18 = m44.a<"m">(new Object[]{var11, var16}, 5257034065445703932L, var1);
      _0[] var13 = var10000;
      u5 var19 = null;
      lbk var20 = new lbk();
      HashSet var21 = m44.a<"m">(new Object[]{var9}, 5485046918305887645L, var1);

      label38:
      while (true) {
         Object[] var10010 = new Object[]{null, null, null, var18, var17, var4, var19, var6};
         var10010[2] = var5;
         var10010[1] = var7;
         var10010[0] = var15;
         var19 = m44.a<"r">(var20, var10010, 5627193692809638021L, var1);

         while (true) {
            label34:
            while (true) {
               if (var19 == null) {
                  var10000 = var13;

                  do {
                     if (var10000 == null) {
                        continue label34;
                     }

                     var10000 = var13;
                  } while (var1 <= 0L);

                  if (var13 != null) {
                     break;
                  }
               }

               String var22 = var19.v();
               if (var13 != null) {
                  if (!var21.add(var22)) {
                     continue label38;
                  }

                  new loe(var15, var22);
                  var14.add(var19);
                  if (var13 != null) {
                     continue label38;
                  }
                  break;
               }
            }

            if (var1 >= 0L) {
               return var14;
            }
         }
      }
   }

   private u5 P(Object[] var1) {
      l62 var9 = (l62)var1[0];
      long var5 = (Long)var1[1];
      bn var10 = (bn)var1[2];
      loe var12 = (loe)var1[3];
      boolean var8 = (Boolean)var1[4];
      df var7 = (df)var1[5];
      boolean var2 = (Boolean)var1[6];
      Map var4 = (Map)var1[7];
      Map var11 = (Map)var1[8];
      boolean var13 = (Boolean)var1[9];
      char[][] var3 = (char[][])var1[10];
      var5 = a ^ var5;
      long var14 = var5 ^ 50536396876876L;
      long var16 = var5 ^ 10586152979312L;
      long var18 = var5 ^ 75465699756521L;
      long var20 = var5 ^ 112164257870511L;
      long var22 = var5 ^ 31585795430480L;
      String var25 = var12.v();
      String var26 = m44.a<"p">(var12, new Object[0], -1908127951787176936L, var5);
      String var27 = m44.a<"o">(new Object[]{var26}, -396966713954409899L, var5);
      List var28 = m44.a<"o">(new Object[]{var20, var26}, -2035992107750884426L, var5);
      u5 var29 = null;
      _0[] var10000 = m44.a<"o">(-308760574454832356L, var5);
      lb6 var30 = new lb6();
      lbk var31 = new lbk();
      HashSet var32 = m44.a<"o">(new Object[]{var16}, -1777582328562868521L, var5);
      _0[] var24 = var10000;

      label29:
      while (true) {
         boolean var10002 = m44.a<"p">(var10, new Object[]{var22}, -2123462929212293931L, var5);
         Object[] var10011 = new Object[]{null, null, null, null, null, null, var29, var8, var3};
         var10011[5] = var14;
         var10011[4] = var30;
         var10011[3] = var27;
         var10011[2] = var28;
         var10011[1] = var10002;
         var10011[0] = var25;
         var29 = m44.a<"p">(var31, var10011, -2056961936571560702L, var5);

         label27:
         while (true) {
            u5 var36 = var29;

            while (var36 != null) {
               String var33 = var29.v();
               if (var24 == null) {
                  continue label27;
               }

               if (!var32.add(var33)) {
                  continue label29;
               }

               loe var34 = new loe(var25, var33);
               Object[] var10013 = new Object[]{null, null, null, null, null, null, null, null, null, null, var2};
               var10013[9] = var13;
               var10013[8] = var11;
               var10013[7] = var4;
               var10013[6] = var7;
               var10013[5] = var18;
               var10013[4] = var12;
               var10013[3] = var34;
               var10013[2] = var29;
               var10013[1] = var10;
               var10013[0] = var9;
               if (!m44.a<"p">(this, var10013, -527119932293888991L, var5)) {
                  continue label29;
               }

               var36 = var29;
               if (var5 >= 0L) {
                  return var29;
               }
            }

            return null;
         }
      }
   }

   final u5 w(Object[] param1) {
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
      // 004: checkcast com/zelix/l62
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 9
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/bn
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/df
      // 029: astore 11
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: istore 7
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/util/Map
      // 03d: astore 2
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/util/Map
      // 045: astore 10
      // 047: dup
      // 048: bipush 8
      // 04a: aaload
      // 04b: checkcast java/lang/Boolean
      // 04e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 051: istore 8
      // 053: dup
      // 054: bipush 9
      // 056: aaload
      // 057: checkcast java/lang/Boolean
      // 05a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05d: istore 12
      // 05f: pop
      // 060: getstatic com/zelix/lbw.a J
      // 063: lload 4
      // 065: lxor
      // 066: lstore 4
      // 068: lload 4
      // 06a: dup2
      // 06b: ldc2_w 56818509928361
      // 06e: lxor
      // 06f: dup2
      // 070: bipush 32
      // 072: lushr
      // 073: l2i
      // 074: istore 13
      // 076: dup2
      // 077: bipush 32
      // 079: lshl
      // 07a: bipush 32
      // 07c: lushr
      // 07d: l2i
      // 07e: istore 14
      // 080: pop2
      // 081: dup2
      // 082: ldc2_w 19003082973369
      // 085: lxor
      // 086: lstore 15
      // 088: dup2
      // 089: ldc2_w 135815174092592
      // 08c: lxor
      // 08d: lstore 17
      // 08f: dup2
      // 090: ldc2_w 93304966761495
      // 093: lxor
      // 094: lstore 19
      // 096: dup2
      // 097: ldc2_w 16384375623330
      // 09a: lxor
      // 09b: lstore 21
      // 09d: dup2
      // 09e: ldc2_w 70254264082321
      // 0a1: lxor
      // 0a2: lstore 23
      // 0a4: dup2
      // 0a5: ldc2_w 92962843503164
      // 0a8: lxor
      // 0a9: lstore 25
      // 0ab: pop2
      // 0ac: ldc2_w -7599448326799225310
      // 0af: lload 4
      // 0b1: invokedynamic i (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: bipush 0
      // 0b7: istore 28
      // 0b9: astore 27
      // 0bb: bipush 0
      // 0bc: istore 29
      // 0be: aload 0
      // 0bf: ldc2_w -7573896840034085554
      // 0c2: lload 4
      // 0c4: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: aload 27
      // 0cb: ifnull 0e0
      // 0ce: ifeq 27f
      // 0d1: goto 0df
      // 0d4: ldc2_w -8431357295200917931
      // 0d7: lload 4
      // 0d9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: bipush 1
      // 0e0: istore 30
      // 0e2: lload 4
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: iflt 118
      // 0e9: ldc2_w -7718364377487849221
      // 0ec: lload 4
      // 0ee: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: aload 27
      // 0f5: ifnull 113
      // 0f8: ifnull 11d
      // 0fb: goto 109
      // 0fe: ldc2_w -8431357295200917931
      // 101: lload 4
      // 103: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: ldc2_w -7718364377487849221
      // 10c: lload 4
      // 10e: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 116: istore 30
      // 118: goto 11d
      // 11b: astore 31
      // 11d: iload 8
      // 11f: aload 27
      // 121: ifnull 198
      // 124: ifne 197
      // 127: goto 135
      // 12a: ldc2_w -8431357295200917931
      // 12d: lload 4
      // 12f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: ldc2_w -8420703975407347485
      // 138: lload 4
      // 13a: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 27
      // 141: ifnull 198
      // 144: goto 152
      // 147: ldc2_w -8431357295200917931
      // 14a: lload 4
      // 14c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: ifne 197
      // 155: goto 163
      // 158: ldc2_w -8431357295200917931
      // 15b: lload 4
      // 15d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: aload 0
      // 164: ldc2_w -8420198822936957935
      // 167: lload 4
      // 169: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: iload 30
      // 170: invokevirtual java/util/Random.nextInt (I)I
      // 173: aload 27
      // 175: ifnull 19b
      // 178: goto 186
      // 17b: ldc2_w -8431357295200917931
      // 17e: lload 4
      // 180: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: ifne 19a
      // 189: goto 197
      // 18c: ldc2_w -8431357295200917931
      // 18f: lload 4
      // 191: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: bipush 1
      // 198: istore 28
      // 19a: bipush 4
      // 19b: istore 31
      // 19d: lload 4
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 1d3
      // 1a4: ldc2_w -8360476473060181517
      // 1a7: lload 4
      // 1a9: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: aload 27
      // 1b0: ifnull 1ce
      // 1b3: ifnull 1e4
      // 1b6: goto 1c4
      // 1b9: ldc2_w -8431357295200917931
      // 1bc: lload 4
      // 1be: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: ldc2_w -8360476473060181517
      // 1c7: lload 4
      // 1c9: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1d1: istore 31
      // 1d3: goto 256
      // 1d6: astore 32
      // 1d8: lload 4
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: ifle 1e4
      // 1df: aload 27
      // 1e1: ifnonnull 256
      // 1e4: iload 8
      // 1e6: aload 27
      // 1e8: ifnull 254
      // 1eb: goto 1f9
      // 1ee: ldc2_w -8431357295200917931
      // 1f1: lload 4
      // 1f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: athrow
      // 1f9: lload 4
      // 1fb: lconst_0
      // 1fc: lcmp
      // 1fd: ifle 249
      // 200: ifne 246
      // 203: goto 211
      // 206: ldc2_w -8431357295200917931
      // 209: lload 4
      // 20b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: ldc2_w -8420703975407347485
      // 214: lload 4
      // 216: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 27
      // 21d: lload 4
      // 21f: lconst_0
      // 220: lcmp
      // 221: ifle 268
      // 224: ifnull 266
      // 227: goto 235
      // 22a: ldc2_w -8431357295200917931
      // 22d: lload 4
      // 22f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: ifeq 256
      // 238: goto 246
      // 23b: ldc2_w -8431357295200917931
      // 23e: lload 4
      // 240: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: sipush 20158
      // 249: ldc2_w 5925583310067688800
      // 24c: lload 4
      // 24e: lxor
      // 24f: invokedynamic e (IJ)I bsm=com/zelix/lbw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: istore 31
      // 256: aload 0
      // 257: ldc2_w -8420198822936957935
      // 25a: lload 4
      // 25c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: iload 31
      // 263: invokevirtual java/util/Random.nextInt (I)I
      // 266: aload 27
      // 268: ifnull 27d
      // 26b: ifne 27f
      // 26e: goto 27c
      // 271: ldc2_w -8431357295200917931
      // 274: lload 4
      // 276: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: bipush 1
      // 27d: istore 29
      // 27f: aconst_null
      // 280: checkcast [[C
      // 283: astore 30
      // 285: lload 4
      // 287: lconst_0
      // 288: lcmp
      // 289: iflt 342
      // 28c: iload 29
      // 28e: aload 27
      // 290: ifnull 2bd
      // 293: ifeq 347
      // 296: goto 2a4
      // 299: ldc2_w -8431357295200917931
      // 29c: lload 4
      // 29e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: ldc2_w -8601967108651639446
      // 2a7: lload 4
      // 2a9: invokedynamic m (JJ)[[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: arraylength
      // 2af: goto 2bd
      // 2b2: ldc2_w -8431357295200917931
      // 2b5: lload 4
      // 2b7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: athrow
      // 2bd: anewarray 414
      // 2c0: astore 30
      // 2c2: ldc2_w -8601967108651639446
      // 2c5: lload 4
      // 2c7: invokedynamic m (JJ)[[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: bipush 0
      // 2cd: aload 30
      // 2cf: bipush 0
      // 2d0: ldc2_w -8601967108651639446
      // 2d3: lload 4
      // 2d5: invokedynamic m (JJ)[[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: arraylength
      // 2db: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2de: aload 30
      // 2e0: lload 4
      // 2e2: lconst_0
      // 2e3: lcmp
      // 2e4: iflt 351
      // 2e7: sipush 8970
      // 2ea: ldc2_w 7933299756146690261
      // 2ed: lload 4
      // 2ef: lxor
      // 2f0: invokedynamic e (IJ)I bsm=com/zelix/lbw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: lload 25
      // 2f7: bipush 2
      // 2f8: anewarray 275
      // 2fb: dup_x2
      // 2fc: dup_x2
      // 2fd: pop
      // 2fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 301: bipush 1
      // 302: swap
      // 303: aastore
      // 304: dup_x1
      // 305: swap
      // 306: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 309: bipush 0
      // 30a: swap
      // 30b: aastore
      // 30c: ldc2_w -8444230217345839637
      // 30f: lload 4
      // 311: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: iload 13
      // 318: iload 14
      // 31a: bipush 4
      // 31b: anewarray 275
      // 31e: dup_x1
      // 31f: swap
      // 320: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 323: bipush 3
      // 324: swap
      // 325: aastore
      // 326: dup_x1
      // 327: swap
      // 328: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32b: bipush 2
      // 32c: swap
      // 32d: aastore
      // 32e: dup_x1
      // 32f: swap
      // 330: bipush 1
      // 331: swap
      // 332: aastore
      // 333: dup_x1
      // 334: swap
      // 335: bipush 0
      // 336: swap
      // 337: aastore
      // 338: ldc2_w -7677382359475108371
      // 33b: lload 4
      // 33d: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: aload 27
      // 344: ifnonnull 353
      // 347: ldc2_w -8601967108651639446
      // 34a: lload 4
      // 34c: invokedynamic m (JJ)[[C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: astore 30
      // 353: aload 6
      // 355: lload 19
      // 357: invokevirtual com/zelix/bn.B (J)Lcom/zelix/loe;
      // 35a: astore 31
      // 35c: aload 6
      // 35e: lload 21
      // 360: bipush 1
      // 361: anewarray 275
      // 364: dup_x2
      // 365: dup_x2
      // 366: pop
      // 367: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36a: bipush 0
      // 36b: swap
      // 36c: aastore
      // 36d: ldc2_w -8256643789054268810
      // 370: lload 4
      // 372: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: istore 32
      // 379: iload 32
      // 37b: ifeq 3c7
      // 37e: aload 31
      // 380: bipush 0
      // 381: anewarray 275
      // 384: ldc2_w -8594365233799093978
      // 387: lload 4
      // 389: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: lload 23
      // 390: dup2_x1
      // 391: pop2
      // 392: bipush 2
      // 393: anewarray 275
      // 396: dup_x1
      // 397: swap
      // 398: bipush 1
      // 399: swap
      // 39a: aastore
      // 39b: dup_x2
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a1: bipush 0
      // 3a2: swap
      // 3a3: aastore
      // 3a4: ldc2_w -8178279564388526456
      // 3a7: lload 4
      // 3a9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ae: astore 33
      // 3b0: aload 33
      // 3b2: invokeinterface java/util/List.size ()I 1
      // 3b7: ifne 3c7
      // 3ba: aconst_null
      // 3bb: areturn
      // 3bc: ldc2_w -8431357295200917931
      // 3bf: lload 4
      // 3c1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: aconst_null
      // 3c8: astore 33
      // 3ca: iload 28
      // 3cc: aload 27
      // 3ce: ifnull 3ec
      // 3d1: ifne 3ef
      // 3d4: goto 3e2
      // 3d7: ldc2_w -8431357295200917931
      // 3da: lload 4
      // 3dc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e1: athrow
      // 3e2: ldc2_w -7506880529077500505
      // 3e5: lload 4
      // 3e7: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ec: ifeq 461
      // 3ef: aload 0
      // 3f0: aload 3
      // 3f1: aload 6
      // 3f3: aload 31
      // 3f5: iload 32
      // 3f7: aload 11
      // 3f9: iload 7
      // 3fb: lload 17
      // 3fd: aload 2
      // 3fe: aload 10
      // 400: iload 12
      // 402: aload 30
      // 404: bipush 11
      // 406: anewarray 275
      // 409: dup_x1
      // 40a: swap
      // 40b: bipush 10
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x1
      // 410: swap
      // 411: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 414: bipush 9
      // 416: swap
      // 417: aastore
      // 418: dup_x1
      // 419: swap
      // 41a: bipush 8
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: bipush 7
      // 422: swap
      // 423: aastore
      // 424: dup_x2
      // 425: dup_x2
      // 426: pop
      // 427: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42a: bipush 6
      // 42c: swap
      // 42d: aastore
      // 42e: dup_x1
      // 42f: swap
      // 430: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 433: bipush 5
      // 434: swap
      // 435: aastore
      // 436: dup_x1
      // 437: swap
      // 438: bipush 4
      // 439: swap
      // 43a: aastore
      // 43b: dup_x1
      // 43c: swap
      // 43d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 440: bipush 3
      // 441: swap
      // 442: aastore
      // 443: dup_x1
      // 444: swap
      // 445: bipush 2
      // 446: swap
      // 447: aastore
      // 448: dup_x1
      // 449: swap
      // 44a: bipush 1
      // 44b: swap
      // 44c: aastore
      // 44d: dup_x1
      // 44e: swap
      // 44f: bipush 0
      // 450: swap
      // 451: aastore
      // 452: ldc2_w -7699180592104191768
      // 455: lload 4
      // 457: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45c: astore 33
      // 45e: goto 4d0
      // 461: aload 0
      // 462: aload 3
      // 463: lload 15
      // 465: aload 6
      // 467: aload 31
      // 469: iload 32
      // 46b: aload 11
      // 46d: iload 7
      // 46f: aload 2
      // 470: aload 10
      // 472: iload 12
      // 474: aload 30
      // 476: bipush 11
      // 478: anewarray 275
      // 47b: dup_x1
      // 47c: swap
      // 47d: bipush 10
      // 47f: swap
      // 480: aastore
      // 481: dup_x1
      // 482: swap
      // 483: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 486: bipush 9
      // 488: swap
      // 489: aastore
      // 48a: dup_x1
      // 48b: swap
      // 48c: bipush 8
      // 48e: swap
      // 48f: aastore
      // 490: dup_x1
      // 491: swap
      // 492: bipush 7
      // 494: swap
      // 495: aastore
      // 496: dup_x1
      // 497: swap
      // 498: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 49b: bipush 6
      // 49d: swap
      // 49e: aastore
      // 49f: dup_x1
      // 4a0: swap
      // 4a1: bipush 5
      // 4a2: swap
      // 4a3: aastore
      // 4a4: dup_x1
      // 4a5: swap
      // 4a6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4a9: bipush 4
      // 4aa: swap
      // 4ab: aastore
      // 4ac: dup_x1
      // 4ad: swap
      // 4ae: bipush 3
      // 4af: swap
      // 4b0: aastore
      // 4b1: dup_x1
      // 4b2: swap
      // 4b3: bipush 2
      // 4b4: swap
      // 4b5: aastore
      // 4b6: dup_x2
      // 4b7: dup_x2
      // 4b8: pop
      // 4b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4bc: bipush 1
      // 4bd: swap
      // 4be: aastore
      // 4bf: dup_x1
      // 4c0: swap
      // 4c1: bipush 0
      // 4c2: swap
      // 4c3: aastore
      // 4c4: ldc2_w -8592158306800724800
      // 4c7: lload 4
      // 4c9: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ce: astore 33
      // 4d0: aload 33
      // 4d2: areturn
   }

   public u5 K(Object[] param1) {
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
      // 004: checkcast com/zelix/l62
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 9
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/bn
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/df
      // 029: astore 11
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: istore 8
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/util/Map
      // 03d: astore 5
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast java/util/Map
      // 046: astore 12
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/lang/Boolean
      // 04f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 052: istore 2
      // 053: dup
      // 054: bipush 9
      // 056: aaload
      // 057: checkcast java/lang/Boolean
      // 05a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05d: istore 10
      // 05f: pop
      // 060: getstatic com/zelix/lbw.a J
      // 063: lload 3
      // 064: lxor
      // 065: lstore 3
      // 066: lload 3
      // 067: dup2
      // 068: ldc2_w 33077011606897
      // 06b: lxor
      // 06c: lstore 13
      // 06e: dup2
      // 06f: ldc2_w 104974248200354
      // 072: lxor
      // 073: lstore 15
      // 075: dup2
      // 076: ldc2_w 3339920018840
      // 079: lxor
      // 07a: lstore 17
      // 07c: dup2
      // 07d: ldc2_w 103322299111761
      // 080: lxor
      // 081: lstore 19
      // 083: dup2
      // 084: ldc2_w 56983029199489
      // 087: lxor
      // 088: lstore 21
      // 08a: dup2
      // 08b: ldc2_w 91223751481868
      // 08e: lxor
      // 08f: lstore 23
      // 091: dup2
      // 092: ldc2_w 52371666842385
      // 095: lxor
      // 096: lstore 25
      // 098: dup2
      // 099: ldc2_w 38003318134932
      // 09c: lxor
      // 09d: lstore 27
      // 09f: dup2
      // 0a0: ldc2_w 79880551732324
      // 0a3: lxor
      // 0a4: lstore 29
      // 0a6: dup2
      // 0a7: ldc2_w 58659286198789
      // 0aa: lxor
      // 0ab: dup2
      // 0ac: bipush 48
      // 0ae: lushr
      // 0af: l2i
      // 0b0: istore 31
      // 0b2: dup2
      // 0b3: bipush 16
      // 0b5: lshl
      // 0b6: bipush 16
      // 0b8: lushr
      // 0b9: lstore 32
      // 0bb: pop2
      // 0bc: pop2
      // 0bd: aload 6
      // 0bf: lload 21
      // 0c1: invokevirtual com/zelix/bn.B (J)Lcom/zelix/loe;
      // 0c4: astore 35
      // 0c6: ldc2_w 7502769438482165940
      // 0c9: lload 3
      // 0ca: invokedynamic o (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: aconst_null
      // 0d0: astore 36
      // 0d2: aconst_null
      // 0d3: astore 37
      // 0d5: astore 34
      // 0d7: aload 7
      // 0d9: lload 29
      // 0db: bipush 1
      // 0dc: anewarray 275
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 7636452432565891583
      // 0eb: lload 3
      // 0ec: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: ifeq 126
      // 0f4: aload 0
      // 0f5: ldc2_w 8007411873090170925
      // 0f8: lload 3
      // 0f9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: aload 7
      // 100: aload 35
      // 102: lload 17
      // 104: bipush 3
      // 105: anewarray 275
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 2
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w 7740105599062695828
      // 11e: lload 3
      // 11f: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/sz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: astore 37
      // 126: aload 37
      // 128: ifnull 367
      // 12b: aload 0
      // 12c: ldc2_w 8007411873090170925
      // 12f: lload 3
      // 130: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: aload 37
      // 137: lload 15
      // 139: bipush 2
      // 13a: anewarray 275
      // 13d: dup_x2
      // 13e: dup_x2
      // 13f: pop
      // 140: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 143: bipush 1
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w 8134981427312898564
      // 14e: lload 3
      // 14f: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: astore 36
      // 156: aload 36
      // 158: aload 34
      // 15a: ifnull 480
      // 15d: ifnonnull 47e
      // 160: goto 16d
      // 163: ldc2_w 8388985893527378115
      // 166: lload 3
      // 167: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 0
      // 16e: ldc2_w 8007411873090170925
      // 171: lload 3
      // 172: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: aload 6
      // 179: bipush 1
      // 17a: anewarray 275
      // 17d: dup_x1
      // 17e: swap
      // 17f: bipush 0
      // 180: swap
      // 181: aastore
      // 182: ldc2_w 7639507811815333563
      // 185: lload 3
      // 186: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/b1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: astore 38
      // 18d: aload 38
      // 18f: aload 34
      // 191: ifnull 1a6
      // 194: ifnull 2b5
      // 197: goto 1a4
      // 19a: ldc2_w 8388985893527378115
      // 19d: lload 3
      // 19e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 38
      // 1a6: lload 19
      // 1a8: invokevirtual com/zelix/b1.h (J)Ljava/lang/String;
      // 1ab: astore 39
      // 1ad: aload 39
      // 1af: invokestatic com/zelix/l62.t (Ljava/lang/String;)Lcom/zelix/l62;
      // 1b2: astore 40
      // 1b4: aload 40
      // 1b6: lload 3
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: iflt 1d3
      // 1bc: aload 34
      // 1be: ifnull 1d3
      // 1c1: ifnull 1f0
      // 1c4: goto 1d1
      // 1c7: ldc2_w 8388985893527378115
      // 1ca: lload 3
      // 1cb: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 40
      // 1d3: iload 31
      // 1d5: i2s
      // 1d6: lload 32
      // 1d8: invokevirtual com/zelix/l62.c (SJ)Z
      // 1db: aload 34
      // 1dd: ifnull 210
      // 1e0: ifeq 1f6
      // 1e3: goto 1f0
      // 1e6: ldc2_w 8388985893527378115
      // 1e9: lload 3
      // 1ea: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: aconst_null
      // 1f1: astore 36
      // 1f3: goto 2b0
      // 1f6: aload 40
      // 1f8: lload 13
      // 1fa: bipush 1
      // 1fb: anewarray 275
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 0
      // 205: swap
      // 206: aastore
      // 207: ldc2_w 7824814608074827896
      // 20a: lload 3
      // 20b: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: ifne 249
      // 213: aload 0
      // 214: ldc2_w 7734199687053009271
      // 217: lload 3
      // 218: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/n0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: lload 23
      // 21f: aload 38
      // 221: bipush 2
      // 222: anewarray 275
      // 225: dup_x1
      // 226: swap
      // 227: bipush 1
      // 228: swap
      // 229: aastore
      // 22a: dup_x2
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 230: bipush 0
      // 231: swap
      // 232: aastore
      // 233: ldc2_w 7630418433779620241
      // 236: lload 3
      // 237: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: astore 36
      // 23e: aload 34
      // 240: lload 3
      // 241: lconst_0
      // 242: lcmp
      // 243: ifle 2b2
      // 246: ifnonnull 2b0
      // 249: aload 0
      // 24a: aload 7
      // 24c: aload 9
      // 24e: aload 6
      // 250: lload 25
      // 252: aload 11
      // 254: iload 8
      // 256: aload 5
      // 258: aload 12
      // 25a: iload 2
      // 25b: iload 10
      // 25d: bipush 10
      // 25f: anewarray 275
      // 262: dup_x1
      // 263: swap
      // 264: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 267: bipush 9
      // 269: swap
      // 26a: aastore
      // 26b: dup_x1
      // 26c: swap
      // 26d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 270: bipush 8
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 7
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 6
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 285: bipush 5
      // 286: swap
      // 287: aastore
      // 288: dup_x1
      // 289: swap
      // 28a: bipush 4
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 3
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 2
      // 299: swap
      // 29a: aastore
      // 29b: dup_x1
      // 29c: swap
      // 29d: bipush 1
      // 29e: swap
      // 29f: aastore
      // 2a0: dup_x1
      // 2a1: swap
      // 2a2: bipush 0
      // 2a3: swap
      // 2a4: aastore
      // 2a5: ldc2_w 8580669480095003521
      // 2a8: lload 3
      // 2a9: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: astore 36
      // 2b0: aload 34
      // 2b2: ifnonnull 31c
      // 2b5: aload 0
      // 2b6: aload 7
      // 2b8: aload 9
      // 2ba: aload 6
      // 2bc: lload 25
      // 2be: aload 11
      // 2c0: iload 8
      // 2c2: aload 5
      // 2c4: aload 12
      // 2c6: iload 2
      // 2c7: iload 10
      // 2c9: bipush 10
      // 2cb: anewarray 275
      // 2ce: dup_x1
      // 2cf: swap
      // 2d0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2d3: bipush 9
      // 2d5: swap
      // 2d6: aastore
      // 2d7: dup_x1
      // 2d8: swap
      // 2d9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2dc: bipush 8
      // 2de: swap
      // 2df: aastore
      // 2e0: dup_x1
      // 2e1: swap
      // 2e2: bipush 7
      // 2e4: swap
      // 2e5: aastore
      // 2e6: dup_x1
      // 2e7: swap
      // 2e8: bipush 6
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2f1: bipush 5
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: bipush 4
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x2
      // 2fa: dup_x2
      // 2fb: pop
      // 2fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ff: bipush 3
      // 300: swap
      // 301: aastore
      // 302: dup_x1
      // 303: swap
      // 304: bipush 2
      // 305: swap
      // 306: aastore
      // 307: dup_x1
      // 308: swap
      // 309: bipush 1
      // 30a: swap
      // 30b: aastore
      // 30c: dup_x1
      // 30d: swap
      // 30e: bipush 0
      // 30f: swap
      // 310: aastore
      // 311: ldc2_w 8580669480095003521
      // 314: lload 3
      // 315: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: astore 36
      // 31c: lload 3
      // 31d: lconst_0
      // 31e: lcmp
      // 31f: iflt 357
      // 322: aload 36
      // 324: ifnull 364
      // 327: aload 0
      // 328: ldc2_w 8007411873090170925
      // 32b: lload 3
      // 32c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: lload 27
      // 333: aload 37
      // 335: aload 36
      // 337: bipush 3
      // 338: anewarray 275
      // 33b: dup_x1
      // 33c: swap
      // 33d: bipush 2
      // 33e: swap
      // 33f: aastore
      // 340: dup_x1
      // 341: swap
      // 342: bipush 1
      // 343: swap
      // 344: aastore
      // 345: dup_x2
      // 346: dup_x2
      // 347: pop
      // 348: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34b: bipush 0
      // 34c: swap
      // 34d: aastore
      // 34e: ldc2_w 8043994929440581597
      // 351: lload 3
      // 352: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: goto 364
      // 35a: ldc2_w 8388985893527378115
      // 35d: lload 3
      // 35e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: athrow
      // 364: goto 47e
      // 367: aload 0
      // 368: ldc2_w 8007411873090170925
      // 36b: lload 3
      // 36c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ee; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: aload 6
      // 373: bipush 1
      // 374: anewarray 275
      // 377: dup_x1
      // 378: swap
      // 379: bipush 0
      // 37a: swap
      // 37b: aastore
      // 37c: ldc2_w 7639507811815333563
      // 37f: lload 3
      // 380: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/b1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: astore 38
      // 387: aload 38
      // 389: aload 34
      // 38b: ifnull 3a0
      // 38e: ifnull 417
      // 391: goto 39e
      // 394: ldc2_w 8388985893527378115
      // 397: lload 3
      // 398: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: athrow
      // 39e: aload 38
      // 3a0: lload 19
      // 3a2: invokevirtual com/zelix/b1.h (J)Ljava/lang/String;
      // 3a5: invokestatic com/zelix/l62.t (Ljava/lang/String;)Lcom/zelix/l62;
      // 3a8: astore 39
      // 3aa: aload 34
      // 3ac: lload 3
      // 3ad: lconst_0
      // 3ae: lcmp
      // 3af: iflt 3e6
      // 3b2: ifnull 3e4
      // 3b5: aload 39
      // 3b7: ifnull 3e1
      // 3ba: goto 3c7
      // 3bd: ldc2_w 8388985893527378115
      // 3c0: lload 3
      // 3c1: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: aload 39
      // 3c9: iload 31
      // 3cb: i2s
      // 3cc: lload 32
      // 3ce: invokevirtual com/zelix/l62.c (SJ)Z
      // 3d1: ifeq 3e9
      // 3d4: goto 3e1
      // 3d7: ldc2_w 8388985893527378115
      // 3da: lload 3
      // 3db: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e0: athrow
      // 3e1: aconst_null
      // 3e2: astore 36
      // 3e4: aload 34
      // 3e6: ifnonnull 414
      // 3e9: aload 0
      // 3ea: ldc2_w 7734199687053009271
      // 3ed: lload 3
      // 3ee: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/n0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: lload 23
      // 3f5: aload 38
      // 3f7: bipush 2
      // 3f8: anewarray 275
      // 3fb: dup_x1
      // 3fc: swap
      // 3fd: bipush 1
      // 3fe: swap
      // 3ff: aastore
      // 400: dup_x2
      // 401: dup_x2
      // 402: pop
      // 403: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 406: bipush 0
      // 407: swap
      // 408: aastore
      // 409: ldc2_w 7630418433779620241
      // 40c: lload 3
      // 40d: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: astore 36
      // 414: goto 47e
      // 417: aload 0
      // 418: aload 7
      // 41a: aload 9
      // 41c: aload 6
      // 41e: lload 25
      // 420: aload 11
      // 422: iload 8
      // 424: aload 5
      // 426: aload 12
      // 428: iload 2
      // 429: iload 10
      // 42b: bipush 10
      // 42d: anewarray 275
      // 430: dup_x1
      // 431: swap
      // 432: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 435: bipush 9
      // 437: swap
      // 438: aastore
      // 439: dup_x1
      // 43a: swap
      // 43b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 43e: bipush 8
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 7
      // 446: swap
      // 447: aastore
      // 448: dup_x1
      // 449: swap
      // 44a: bipush 6
      // 44c: swap
      // 44d: aastore
      // 44e: dup_x1
      // 44f: swap
      // 450: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 453: bipush 5
      // 454: swap
      // 455: aastore
      // 456: dup_x1
      // 457: swap
      // 458: bipush 4
      // 459: swap
      // 45a: aastore
      // 45b: dup_x2
      // 45c: dup_x2
      // 45d: pop
      // 45e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 461: bipush 3
      // 462: swap
      // 463: aastore
      // 464: dup_x1
      // 465: swap
      // 466: bipush 2
      // 467: swap
      // 468: aastore
      // 469: dup_x1
      // 46a: swap
      // 46b: bipush 1
      // 46c: swap
      // 46d: aastore
      // 46e: dup_x1
      // 46f: swap
      // 470: bipush 0
      // 471: swap
      // 472: aastore
      // 473: ldc2_w 8580669480095003521
      // 476: lload 3
      // 477: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47c: astore 36
      // 47e: aload 36
      // 480: areturn
   }

   static {
      long var0 = a ^ 130237145629263L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\u0080lt\u009f\u0097Mk\u008aÔ\u0098úF\u00182ÖZ";
      int var7 = "\u0080lt\u009f\u0097Mk\u008aÔ\u0098úF\u00182ÖZ".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12328;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lbw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/lbw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
