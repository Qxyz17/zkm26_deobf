package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xg extends xu {
   final String H;
   final xu L;
   private boolean m;
   private static final long b = ess.a(4622247641957851900L, -6697238706112970477L, MethodHandles.lookup().lookupClass()).a(31346651439602L);
   private static final long c;

   void D(Object[] var1) {
      Map var2 = (Map)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 92282891222712L;
      String var7 = x44.a<"j">(this, new Object[]{var5}, -9078890380955183021L, var3);
      var2.put(var7, this);
   }

   void N(Object[] param1) {
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
      // 004: checkcast java/util/Map
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_uw
      // 00e: astore 7
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/a9
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
      // 026: checkcast java/lang/String
      // 029: astore 2
      // 02a: pop
      // 02b: getstatic com/zelix/xg.b J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 111697388481490
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 76581728815846
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 42506872683001
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 67630348593141
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 35776231136371
      // 055: lxor
      // 056: lstore 16
      // 058: pop2
      // 059: ldc2_w -5690218154004370160
      // 05c: lload 4
      // 05e: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: ldc2_w -5413887513105570344
      // 067: lload 4
      // 069: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 073: astore 19
      // 075: astore 18
      // 077: aload 19
      // 079: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07e: ifeq 205
      // 081: aload 2
      // 082: astore 20
      // 084: aload 19
      // 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08b: checkcast com/zelix/xg
      // 08e: astore 21
      // 090: aload 21
      // 092: lload 10
      // 094: bipush 1
      // 095: anewarray 103
      // 098: dup_x2
      // 099: dup_x2
      // 09a: pop
      // 09b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: ldc2_w -5305421762572735475
      // 0a4: lload 4
      // 0a6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: astore 22
      // 0ad: aload 6
      // 0af: aload 18
      // 0b1: lload 4
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 0e4
      // 0b8: ifnonnull 0ce
      // 0bb: ifnull 16e
      // 0be: goto 0cc
      // 0c1: ldc2_w -6170636858568687130
      // 0c4: lload 4
      // 0c6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 6
      // 0ce: lload 16
      // 0d0: aload 22
      // 0d2: bipush 2
      // 0d3: anewarray 103
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
      // 0e4: ldc2_w -6213296036799890793
      // 0e7: lload 4
      // 0e9: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: aload 18
      // 0f0: ifnonnull 1b8
      // 0f3: ifeq 16e
      // 0f6: goto 104
      // 0f9: ldc2_w -6170636858568687130
      // 0fc: lload 4
      // 0fe: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 6
      // 106: lload 12
      // 108: aload 22
      // 10a: bipush 2
      // 10b: anewarray 103
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 1
      // 111: swap
      // 112: aastore
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w -6295252455613775492
      // 11f: lload 4
      // 121: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: astore 23
      // 128: aload 23
      // 12a: aload 18
      // 12c: ifnonnull 160
      // 12f: ifnull 150
      // 132: goto 140
      // 135: ldc2_w -6170636858568687130
      // 138: lload 4
      // 13a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 23
      // 142: astore 20
      // 144: aload 18
      // 146: lload 4
      // 148: lconst_0
      // 149: lcmp
      // 14a: iflt 16b
      // 14d: ifnull 162
      // 150: aload 22
      // 152: goto 160
      // 155: ldc2_w -6170636858568687130
      // 158: lload 4
      // 15a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: astore 20
      // 162: lload 4
      // 164: lconst_0
      // 165: lcmp
      // 166: iflt 16e
      // 169: aload 18
      // 16b: ifnull 1bf
      // 16e: lload 4
      // 170: lconst_0
      // 171: lcmp
      // 172: ifle 200
      // 175: aload 7
      // 177: aload 18
      // 179: ifnonnull 1c9
      // 17c: goto 18a
      // 17f: ldc2_w -6170636858568687130
      // 182: lload 4
      // 184: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: lload 8
      // 18c: aload 22
      // 18e: bipush 2
      // 18f: anewarray 103
      // 192: dup_x1
      // 193: swap
      // 194: bipush 1
      // 195: swap
      // 196: aastore
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: ldc2_w -5262940314375963240
      // 1a3: lload 4
      // 1a5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: goto 1b8
      // 1ad: ldc2_w -6170636858568687130
      // 1b0: lload 4
      // 1b2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: ifeq 1bf
      // 1bb: aload 22
      // 1bd: astore 20
      // 1bf: aload 3
      // 1c0: aload 22
      // 1c2: aload 20
      // 1c4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1c9: pop
      // 1ca: aload 21
      // 1cc: aload 3
      // 1cd: aload 7
      // 1cf: aload 6
      // 1d1: lload 14
      // 1d3: aload 20
      // 1d5: bipush 5
      // 1d6: anewarray 103
      // 1d9: dup_x1
      // 1da: swap
      // 1db: bipush 4
      // 1dc: swap
      // 1dd: aastore
      // 1de: dup_x2
      // 1df: dup_x2
      // 1e0: pop
      // 1e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e4: bipush 3
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 2
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x1
      // 1ed: swap
      // 1ee: bipush 1
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 0
      // 1f4: swap
      // 1f5: aastore
      // 1f6: ldc2_w -5372600221502591898
      // 1f9: lload 4
      // 1fb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: aload 18
      // 202: ifnull 077
      // 205: return
   }

   public void d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      x44.a<"w">(this, true, -7365625343919794787L, var2);
   }

   public xg z(Object[] param1) {
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
      // 0c: getstatic com/zelix/xg.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 67630348593141
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 9202606941424575406
      // 1e: lload 2
      // 1f: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w 8669861229555379522
      // 2a: lload 2
      // 2b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnonnull 68
      // 35: bipush 0
      // 36: anewarray 103
      // 39: ldc2_w 8683309685317024273
      // 3c: lload 2
      // 3d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: ifeq 5e
      // 45: goto 52
      // 48: ldc2_w 7269667991764340568
      // 4b: lload 2
      // 4c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 0
      // 53: areturn
      // 54: ldc2_w 7269667991764340568
      // 57: lload 2
      // 58: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: ldc2_w 8669861229555379522
      // 62: lload 2
      // 63: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: checkcast com/zelix/xg
      // 6b: lload 4
      // 6d: bipush 1
      // 6e: anewarray 103
      // 71: dup_x2
      // 72: dup_x2
      // 73: pop
      // 74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: ldc2_w 7384911298055878969
      // 7d: lload 2
      // 7e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/xg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: areturn
   }

   public String U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"i">(this, -86713767591823992L, var2);
   }

   void P(Object[] param1) {
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
      // 004: checkcast com/zelix/_uw
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/a9
      // 01a: astore 11
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/rs
      // 022: astore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Map
      // 029: astore 6
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_y4
      // 031: astore 10
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_8z
      // 03a: astore 8
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/_y4
      // 043: astore 7
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast java/lang/Boolean
      // 04c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04f: istore 3
      // 050: pop
      // 051: getstatic com/zelix/xg.b J
      // 054: lload 4
      // 056: lxor
      // 057: lstore 4
      // 059: lload 4
      // 05b: dup2
      // 05c: ldc2_w 43252304053229
      // 05f: lxor
      // 060: lstore 12
      // 062: dup2
      // 063: ldc2_w 36508669979498
      // 066: lxor
      // 067: lstore 14
      // 069: dup2
      // 06a: ldc2_w 41324139852147
      // 06d: lxor
      // 06e: lstore 16
      // 070: dup2
      // 071: ldc2_w 36433649929149
      // 074: lxor
      // 075: lstore 18
      // 077: dup2
      // 078: ldc2_w 79320300394309
      // 07b: lxor
      // 07c: lstore 20
      // 07e: dup2
      // 07f: ldc2_w 88316856057190
      // 082: lxor
      // 083: lstore 22
      // 085: dup2
      // 086: ldc2_w 16339967461288
      // 089: lxor
      // 08a: lstore 24
      // 08c: dup2
      // 08d: ldc2_w 50038930175142
      // 090: lxor
      // 091: lstore 26
      // 093: dup2
      // 094: ldc2_w 67630348593141
      // 097: lxor
      // 098: lstore 28
      // 09a: pop2
      // 09b: ldc2_w -5187255838677326821
      // 09e: lload 4
      // 0a0: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: lload 22
      // 0a7: bipush 1
      // 0a8: anewarray 103
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: ldc2_w -4800118588229733202
      // 0b7: lload 4
      // 0b9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: astore 31
      // 0c0: aload 7
      // 0c2: aload 0
      // 0c3: ldc2_w -4619399267379664137
      // 0c6: lload 4
      // 0c8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: lload 12
      // 0cf: bipush 1
      // 0d0: anewarray 103
      // 0d3: dup_x2
      // 0d4: dup_x2
      // 0d5: pop
      // 0d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: ldc2_w -6885982469121734368
      // 0df: lload 4
      // 0e1: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: lload 18
      // 0e8: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 0eb: astore 32
      // 0ed: astore 30
      // 0ef: aload 30
      // 0f1: ifnonnull 1f6
      // 0f4: aload 32
      // 0f6: ifnull 1a2
      // 0f9: goto 107
      // 0fc: ldc2_w -6677118024613181203
      // 0ff: lload 4
      // 101: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: bipush 0
      // 108: istore 33
      // 10a: iload 33
      // 10c: aload 32
      // 10e: invokeinterface java/util/List.size ()I 1
      // 113: if_icmpge 1a2
      // 116: aload 32
      // 118: iload 33
      // 11a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11f: checkcast com/zelix/hy
      // 122: astore 34
      // 124: aload 30
      // 126: lload 4
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 132
      // 12d: ifnonnull 1f6
      // 130: aload 30
      // 132: lload 4
      // 134: lconst_0
      // 135: lcmp
      // 136: ifle 19f
      // 139: ifnonnull 19d
      // 13c: goto 14a
      // 13f: ldc2_w -6677118024613181203
      // 142: lload 4
      // 144: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 9
      // 14c: lload 26
      // 14e: aload 34
      // 150: bipush 2
      // 151: anewarray 103
      // 154: dup_x1
      // 155: swap
      // 156: bipush 1
      // 157: swap
      // 158: aastore
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w -4684920479003283363
      // 165: lload 4
      // 167: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: ifeq 19a
      // 16f: goto 17d
      // 172: ldc2_w -6677118024613181203
      // 175: lload 4
      // 177: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 31
      // 17f: aload 34
      // 181: lload 14
      // 183: invokevirtual com/zelix/hy.H (J)Ljava/lang/String;
      // 186: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 18b: pop
      // 18c: goto 19a
      // 18f: ldc2_w -6677118024613181203
      // 192: lload 4
      // 194: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: iinc 33 1
      // 19d: aload 30
      // 19f: ifnull 10a
      // 1a2: aload 0
      // 1a3: lload 16
      // 1a5: aload 9
      // 1a7: aload 11
      // 1a9: aload 2
      // 1aa: aload 6
      // 1ac: aload 10
      // 1ae: aload 8
      // 1b0: aload 31
      // 1b2: bipush 8
      // 1b4: anewarray 103
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: bipush 7
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 6
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: bipush 5
      // 1c6: swap
      // 1c7: aastore
      // 1c8: dup_x1
      // 1c9: swap
      // 1ca: bipush 4
      // 1cb: swap
      // 1cc: aastore
      // 1cd: dup_x1
      // 1ce: swap
      // 1cf: bipush 3
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: bipush 2
      // 1d5: swap
      // 1d6: aastore
      // 1d7: dup_x1
      // 1d8: swap
      // 1d9: bipush 1
      // 1da: swap
      // 1db: aastore
      // 1dc: dup_x2
      // 1dd: dup_x2
      // 1de: pop
      // 1df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e2: bipush 0
      // 1e3: swap
      // 1e4: aastore
      // 1e5: ldc2_w -6692509140956197101
      // 1e8: lload 4
      // 1ea: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: lload 4
      // 1f1: lconst_0
      // 1f2: lcmp
      // 1f3: ifle 1f6
      // 1f6: aload 0
      // 1f7: ldc2_w -4767795721876443949
      // 1fa: lload 4
      // 1fc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: aload 0
      // 202: ldc2_w -4767795721876443949
      // 205: lload 4
      // 207: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: invokeinterface java/util/Set.size ()I 1
      // 211: anewarray 54
      // 214: ldc2_w -4989658282146238658
      // 217: lload 4
      // 219: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: checkcast [Lcom/zelix/xg;
      // 221: astore 33
      // 223: aload 30
      // 225: lload 4
      // 227: lconst_0
      // 228: lcmp
      // 229: iflt 2d0
      // 22c: ifnonnull 2c7
      // 22f: iload 3
      // 230: ifne 263
      // 233: goto 241
      // 236: ldc2_w -6677118024613181203
      // 239: lload 4
      // 23b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: athrow
      // 241: lload 4
      // 243: lconst_0
      // 244: lcmp
      // 245: ifle 2df
      // 248: ldc2_w -5009077580574119009
      // 24b: lload 4
      // 24d: invokedynamic n (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: ifeq 2d3
      // 255: goto 263
      // 258: ldc2_w -6677118024613181203
      // 25b: lload 4
      // 25d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: athrow
      // 263: aload 33
      // 265: ldc2_w -6809590149035262954
      // 268: lload 4
      // 26a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: getstatic com/zelix/xg.c J
      // 272: l2i
      // 273: lload 20
      // 275: bipush 2
      // 276: anewarray 103
      // 279: dup_x2
      // 27a: dup_x2
      // 27b: pop
      // 27c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27f: bipush 1
      // 280: swap
      // 281: aastore
      // 282: dup_x1
      // 283: swap
      // 284: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w -4802067391123012996
      // 28d: lload 4
      // 28f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: lload 24
      // 296: dup2_x1
      // 297: pop2
      // 298: bipush 3
      // 299: anewarray 103
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 2
      // 29f: swap
      // 2a0: aastore
      // 2a1: dup_x2
      // 2a2: dup_x2
      // 2a3: pop
      // 2a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a7: bipush 1
      // 2a8: swap
      // 2a9: aastore
      // 2aa: dup_x1
      // 2ab: swap
      // 2ac: bipush 0
      // 2ad: swap
      // 2ae: aastore
      // 2af: ldc2_w -4808810741467637182
      // 2b2: lload 4
      // 2b4: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: goto 2c7
      // 2bc: ldc2_w -6677118024613181203
      // 2bf: lload 4
      // 2c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: lload 4
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: ifle 2df
      // 2ce: aload 30
      // 2d0: ifnull 2ed
      // 2d3: aload 33
      // 2d5: ldc2_w -5150000482223309537
      // 2d8: lload 4
      // 2da: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: goto 2ed
      // 2e2: ldc2_w -6677118024613181203
      // 2e5: lload 4
      // 2e7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: athrow
      // 2ed: bipush 0
      // 2ee: istore 34
      // 2f0: iload 34
      // 2f2: aload 33
      // 2f4: arraylength
      // 2f5: if_icmpge 35f
      // 2f8: aload 33
      // 2fa: iload 34
      // 2fc: aaload
      // 2fd: astore 35
      // 2ff: aload 35
      // 301: aload 9
      // 303: lload 28
      // 305: aload 11
      // 307: aload 2
      // 308: aload 6
      // 30a: aload 10
      // 30c: aload 8
      // 30e: aload 7
      // 310: iload 3
      // 311: bipush 9
      // 313: anewarray 103
      // 316: dup_x1
      // 317: swap
      // 318: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 31b: bipush 8
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 7
      // 323: swap
      // 324: aastore
      // 325: dup_x1
      // 326: swap
      // 327: bipush 6
      // 329: swap
      // 32a: aastore
      // 32b: dup_x1
      // 32c: swap
      // 32d: bipush 5
      // 32e: swap
      // 32f: aastore
      // 330: dup_x1
      // 331: swap
      // 332: bipush 4
      // 333: swap
      // 334: aastore
      // 335: dup_x1
      // 336: swap
      // 337: bipush 3
      // 338: swap
      // 339: aastore
      // 33a: dup_x1
      // 33b: swap
      // 33c: bipush 2
      // 33d: swap
      // 33e: aastore
      // 33f: dup_x2
      // 340: dup_x2
      // 341: pop
      // 342: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 345: bipush 1
      // 346: swap
      // 347: aastore
      // 348: dup_x1
      // 349: swap
      // 34a: bipush 0
      // 34b: swap
      // 34c: aastore
      // 34d: ldc2_w -6670000445092843387
      // 350: lload 4
      // 352: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: iinc 34 1
      // 35a: aload 30
      // 35c: ifnull 2f0
      // 35f: return
   }

   public xg(long param1, xu param3, String param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/xg.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 3666206792745
      // 0b: lxor
      // 0c: lstore 6
      // 0e: dup2
      // 0f: ldc2_w 19402019780356
      // 12: lxor
      // 13: lstore 8
      // 15: pop2
      // 16: ldc2_w 5206231182441108568
      // 19: lload 1
      // 1a: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: aload 0
      // 20: lload 6
      // 22: invokespecial com/zelix/xu.<init> (J)V
      // 25: astore 10
      // 27: aload 0
      // 28: aload 3
      // 29: putfield com/zelix/xg.L Lcom/zelix/xu;
      // 2c: aload 0
      // 2d: aload 10
      // 2f: ifnonnull 57
      // 32: aload 4
      // 34: putfield com/zelix/xg.H Ljava/lang/String;
      // 37: iload 5
      // 39: ifne 78
      // 3c: goto 49
      // 3f: ldc2_w 5986701630210652334
      // 42: lload 1
      // 43: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 57
      // 4d: ldc2_w 5986701630210652334
      // 50: lload 1
      // 51: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: lload 8
      // 59: bipush 0
      // 5a: bipush 2
      // 5b: anewarray 103
      // 5e: dup_x1
      // 5f: swap
      // 60: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: ldc2_w 6155689340145333874
      // 72: lload 1
      // 73: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: return
   }

   public String v(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -4904968537788307466
      // 18: lload 2
      // 19: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: astore 6
      // 20: aload 0
      // 21: ldc2_w -4897172557975082726
      // 24: lload 2
      // 25: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 6
      // 2c: ifnonnull 57
      // 2f: ifnonnull 4d
      // 32: goto 3f
      // 35: ldc2_w -6864827378474235136
      // 38: lload 2
      // 39: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aconst_null
      // 40: goto 6f
      // 43: ldc2_w -6864827378474235136
      // 46: lload 2
      // 47: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: ldc2_w -4897172557975082726
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: lload 4
      // 59: bipush 1
      // 5a: anewarray 103
      // 5d: dup_x2
      // 5e: dup_x2
      // 5f: pop
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: bipush 0
      // 64: swap
      // 65: aastore
      // 66: ldc2_w -6657107242143806771
      // 69: lload 2
      // 6a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: astore 7
      // 71: aload 7
      // 73: aload 6
      // 75: ifnonnull e5
      // 78: ifnull db
      // 7b: goto 88
      // 7e: ldc2_w -6864827378474235136
      // 81: lload 2
      // 82: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: aload 7
      // 8a: aload 6
      // 8c: ifnonnull e5
      // 8f: goto 9c
      // 92: ldc2_w -6864827378474235136
      // 95: lload 2
      // 96: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: invokevirtual java/lang/String.length ()I
      // 9f: ifle db
      // a2: goto af
      // a5: ldc2_w -6864827378474235136
      // a8: lload 2
      // a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: athrow
      // af: new java/lang/StringBuilder
      // b2: dup
      // b3: invokespecial java/lang/StringBuilder.<init> ()V
      // b6: aload 7
      // b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bb: ldc "/"
      // bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c0: aload 0
      // c1: ldc2_w -4842296174451165297
      // c4: lload 2
      // c5: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d0: areturn
      // d1: ldc2_w -6864827378474235136
      // d4: lload 2
      // d5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: athrow
      // db: aload 0
      // dc: ldc2_w -4842296174451165297
      // df: lload 2
      // e0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: areturn
   }

   private void y(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_uw
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/a9
      // 019: astore 9
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/rs
      // 021: astore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Map
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/_y4
      // 030: astore 10
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/_8z
      // 039: astore 8
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast java/util/Set
      // 042: astore 4
      // 044: pop
      // 045: getstatic com/zelix/xg.b J
      // 048: lload 5
      // 04a: lxor
      // 04b: lstore 5
      // 04d: lload 5
      // 04f: dup2
      // 050: ldc2_w 39635346028749
      // 053: lxor
      // 054: lstore 11
      // 056: dup2
      // 057: ldc2_w 69550996608363
      // 05a: lxor
      // 05b: lstore 13
      // 05d: dup2
      // 05e: ldc2_w 111402745508000
      // 061: lxor
      // 062: lstore 15
      // 064: dup2
      // 065: ldc2_w 19492192156877
      // 068: lxor
      // 069: lstore 17
      // 06b: dup2
      // 06c: ldc2_w 69550996608363
      // 06f: lxor
      // 070: lstore 19
      // 072: dup2
      // 073: ldc2_w 43772856806061
      // 076: lxor
      // 077: lstore 21
      // 079: pop2
      // 07a: ldc2_w -1259545151590927715
      // 07d: lload 5
      // 07f: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: aload 0
      // 085: lload 19
      // 087: bipush 1
      // 088: anewarray 103
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 0
      // 092: swap
      // 093: aastore
      // 094: ldc2_w -1598177658335267968
      // 097: lload 5
      // 099: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: astore 24
      // 0a0: astore 23
      // 0a2: aload 0
      // 0a3: lload 11
      // 0a5: bipush 1
      // 0a6: anewarray 103
      // 0a9: dup_x2
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: ldc2_w -754312778319526125
      // 0b5: lload 5
      // 0b7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: aload 23
      // 0be: ifnonnull 0eb
      // 0c1: ifeq 105
      // 0c4: goto 0d2
      // 0c7: ldc2_w -734081656170176917
      // 0ca: lload 5
      // 0cc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: ldc2_w -586287098285737080
      // 0d6: lload 5
      // 0d8: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: goto 0eb
      // 0e0: ldc2_w -734081656170176917
      // 0e3: lload 5
      // 0e5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 23
      // 0ed: ifnonnull 102
      // 0f0: ifeq 105
      // 0f3: goto 101
      // 0f6: ldc2_w -734081656170176917
      // 0f9: lload 5
      // 0fb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: bipush 1
      // 102: goto 106
      // 105: bipush 0
      // 106: istore 25
      // 108: aload 7
      // 10a: lload 5
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 167
      // 111: aload 24
      // 113: aload 23
      // 115: ifnonnull 162
      // 118: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11d: ifne 28d
      // 120: goto 12e
      // 123: ldc2_w -734081656170176917
      // 126: lload 5
      // 128: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 7
      // 130: aload 0
      // 131: ldc2_w -1629598550274278287
      // 134: lload 5
      // 136: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: lload 13
      // 13d: bipush 1
      // 13e: anewarray 103
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: ldc2_w -651320475713740890
      // 14d: lload 5
      // 14f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: goto 162
      // 157: ldc2_w -734081656170176917
      // 15a: lload 5
      // 15c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 167: checkcast java/lang/String
      // 16a: astore 26
      // 16c: aload 26
      // 16e: aload 23
      // 170: ifnonnull 21d
      // 173: ifnonnull 1aa
      // 176: goto 184
      // 179: ldc2_w -734081656170176917
      // 17c: lload 5
      // 17e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 0
      // 185: ldc2_w -1629598550274278287
      // 188: lload 5
      // 18a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: lload 13
      // 191: bipush 1
      // 192: anewarray 103
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: ldc2_w -651320475713740890
      // 1a1: lload 5
      // 1a3: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: astore 26
      // 1aa: aload 3
      // 1ab: lload 21
      // 1ad: aload 26
      // 1af: aload 0
      // 1b0: lload 15
      // 1b2: bipush 1
      // 1b3: anewarray 103
      // 1b6: dup_x2
      // 1b7: dup_x2
      // 1b8: pop
      // 1b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: ldc2_w -1708338904085785770
      // 1c2: lload 5
      // 1c4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: iload 25
      // 1cb: aload 10
      // 1cd: aload 8
      // 1cf: aload 4
      // 1d1: aload 9
      // 1d3: aload 2
      // 1d4: bipush 9
      // 1d6: anewarray 103
      // 1d9: dup_x1
      // 1da: swap
      // 1db: bipush 8
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: bipush 7
      // 1e3: swap
      // 1e4: aastore
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 6
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: bipush 5
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 4
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1fa: bipush 3
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x1
      // 1fe: swap
      // 1ff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 202: bipush 2
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 1
      // 208: swap
      // 209: aastore
      // 20a: dup_x2
      // 20b: dup_x2
      // 20c: pop
      // 20d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 210: bipush 0
      // 211: swap
      // 212: aastore
      // 213: ldc2_w -1373321808656211039
      // 216: lload 5
      // 218: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: astore 27
      // 21f: new java/lang/StringBuilder
      // 222: dup
      // 223: invokespecial java/lang/StringBuilder.<init> ()V
      // 226: aload 26
      // 228: aload 23
      // 22a: ifnonnull 263
      // 22d: invokevirtual java/lang/String.length ()I
      // 230: ifle 266
      // 233: goto 241
      // 236: ldc2_w -734081656170176917
      // 239: lload 5
      // 23b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: athrow
      // 241: new java/lang/StringBuilder
      // 244: dup
      // 245: invokespecial java/lang/StringBuilder.<init> ()V
      // 248: aload 26
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: ldc "/"
      // 24f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 252: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 255: goto 263
      // 258: ldc2_w -734081656170176917
      // 25b: lload 5
      // 25d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: athrow
      // 263: goto 268
      // 266: ldc ""
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: aload 27
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 273: astore 28
      // 275: aload 7
      // 277: aload 24
      // 279: aload 28
      // 27b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 280: astore 29
      // 282: aload 10
      // 284: aload 28
      // 286: aload 24
      // 288: lload 17
      // 28a: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 28d: return
   }

   public boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"i">(x44.a<"m">(this, -695074629567913143L, var2), new Object[0], -681660152249306086L, var2);
   }

   public boolean N(Object[] var1) {
      return false;
   }

   void f(Object[] var1) {
      long var2 = (Long)var1[0];
      ArrayList var4 = (ArrayList)var1[1];
      long var5 = var2 ^ 119835200326288L;
      String var7 = x44.a<"j">(this, new Object[]{var5}, -5320595728286110597L, var2);
      var4.add(var7);
   }

   static {
      long var0 = b ^ 73456457041977L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 826403359708534476L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      c = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
