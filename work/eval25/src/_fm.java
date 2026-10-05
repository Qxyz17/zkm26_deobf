package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fm {
   private final we U;
   private Map s;
   private final _ug b;
   private final _8z c;
   private static final long a = ess.a(7947357578346115812L, -1511232681350281158L, MethodHandles.lookup().lookupClass()).a(191941490987164L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public _fm(we var1, _ug var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 94706883265819L;
      long var7 = var3 ^ 105888433933106L;
      super();
      this.c = new _8z(var7);
      this.s = x44.a<"s">(new Object[]{var5}, -3969931060197052792L, var3);
      this.U = var1;
      this.b = var2;
   }

   we O(Object[] var1) {
      return this.U;
   }

   private String F(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/hz
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 7
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/hz
      // 028: astore 4
      // 02a: pop
      // 02b: getstatic com/zelix/_fm.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 108874083117553
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 69037743837242
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 71666689934934
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 39525420476025
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 127042886369649
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 17538609958145
      // 05c: lxor
      // 05d: lstore 18
      // 05f: pop2
      // 060: aload 0
      // 061: lload 12
      // 063: invokevirtual com/zelix/_fm.H (J)Ljava/lang/Integer;
      // 066: astore 21
      // 068: ldc2_w 694194819685016247
      // 06b: lload 5
      // 06d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aconst_null
      // 073: astore 22
      // 075: istore 20
      // 077: aload 2
      // 078: aload 0
      // 079: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 07c: lload 18
      // 07e: aload 21
      // 080: bipush 3
      // 081: anewarray 134
      // 084: dup_x1
      // 085: swap
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w 824305305982025442
      // 09a: lload 5
      // 09c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: astore 23
      // 0a3: aload 4
      // 0a5: aload 0
      // 0a6: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 0a9: lload 18
      // 0ab: aload 21
      // 0ad: bipush 3
      // 0ae: anewarray 134
      // 0b1: dup_x1
      // 0b2: swap
      // 0b3: bipush 2
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 0
      // 0c2: swap
      // 0c3: aastore
      // 0c4: ldc2_w 824305305982025442
      // 0c7: lload 5
      // 0c9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: astore 24
      // 0d0: aload 23
      // 0d2: ldc2_w 1199992509822301353
      // 0d5: lload 5
      // 0d7: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: istore 25
      // 0de: aload 2
      // 0df: lload 8
      // 0e1: invokevirtual com/zelix/hz.d (J)Z
      // 0e4: iload 20
      // 0e6: ifne 115
      // 0e9: ifeq 139
      // 0ec: goto 0fa
      // 0ef: ldc2_w 1025944273543580384
      // 0f2: lload 5
      // 0f4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 24
      // 0fc: aload 3
      // 0fd: ldc2_w 673380088037335719
      // 100: lload 5
      // 102: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: goto 115
      // 10a: ldc2_w 1025944273543580384
      // 10d: lload 5
      // 10f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 139
      // 118: lload 10
      // 11a: aload 3
      // 11b: bipush 2
      // 11c: anewarray 134
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x2
      // 125: dup_x2
      // 126: pop
      // 127: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w 705961419296903861
      // 130: lload 5
      // 132: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: astore 22
      // 139: aload 22
      // 13b: iload 20
      // 13d: lload 5
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 1c8
      // 144: ifne 1c6
      // 147: ifnonnull 1c4
      // 14a: goto 158
      // 14d: ldc2_w 1025944273543580384
      // 150: lload 5
      // 152: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 4
      // 15a: lload 8
      // 15c: invokevirtual com/zelix/hz.d (J)Z
      // 15f: iload 20
      // 161: ifne 19f
      // 164: goto 172
      // 167: ldc2_w 1025944273543580384
      // 16a: lload 5
      // 16c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: ifeq 1c4
      // 175: goto 183
      // 178: ldc2_w 1025944273543580384
      // 17b: lload 5
      // 17d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 23
      // 185: aload 7
      // 187: ldc2_w 673380088037335719
      // 18a: lload 5
      // 18c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: goto 19f
      // 194: ldc2_w 1025944273543580384
      // 197: lload 5
      // 199: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: ifeq 1c4
      // 1a2: lload 10
      // 1a4: aload 7
      // 1a6: bipush 2
      // 1a7: anewarray 134
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 1
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x2
      // 1b0: dup_x2
      // 1b1: pop
      // 1b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b5: bipush 0
      // 1b6: swap
      // 1b7: aastore
      // 1b8: ldc2_w 705961419296903861
      // 1bb: lload 5
      // 1bd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: astore 22
      // 1c4: aload 22
      // 1c6: iload 20
      // 1c8: ifne 2df
      // 1cb: ifnonnull 2dd
      // 1ce: goto 1dc
      // 1d1: ldc2_w 1025944273543580384
      // 1d4: lload 5
      // 1d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: bipush 0
      // 1dd: istore 26
      // 1df: iload 26
      // 1e1: iload 25
      // 1e3: if_icmpge 2ae
      // 1e6: aload 23
      // 1e8: lload 14
      // 1ea: iload 26
      // 1ec: bipush 2
      // 1ed: anewarray 134
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f5: bipush 1
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x2
      // 1f9: dup_x2
      // 1fa: pop
      // 1fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fe: bipush 0
      // 1ff: swap
      // 200: aastore
      // 201: ldc2_w 1199215141434343644
      // 204: lload 5
      // 206: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: checkcast java/lang/String
      // 20e: astore 27
      // 210: iload 20
      // 212: lload 5
      // 214: lconst_0
      // 215: lcmp
      // 216: ifle 21e
      // 219: ifne 2dd
      // 21c: iload 20
      // 21e: lload 5
      // 220: lconst_0
      // 221: lcmp
      // 222: ifle 2ab
      // 225: ifne 2a9
      // 228: goto 236
      // 22b: ldc2_w 1025944273543580384
      // 22e: lload 5
      // 230: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 24
      // 238: aload 27
      // 23a: lload 16
      // 23c: bipush 2
      // 23d: anewarray 134
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 1
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 0
      // 24c: swap
      // 24d: aastore
      // 24e: ldc2_w 641983879385464102
      // 251: lload 5
      // 253: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: bipush -1
      // 259: if_icmpeq 298
      // 25c: goto 26a
      // 25f: ldc2_w 1025944273543580384
      // 262: lload 5
      // 264: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: lload 10
      // 26c: aload 27
      // 26e: bipush 2
      // 26f: anewarray 134
      // 272: dup_x1
      // 273: swap
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x2
      // 278: dup_x2
      // 279: pop
      // 27a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27d: bipush 0
      // 27e: swap
      // 27f: aastore
      // 280: ldc2_w 705961419296903861
      // 283: lload 5
      // 285: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: astore 22
      // 28c: lload 5
      // 28e: lconst_0
      // 28f: lcmp
      // 290: ifle 2ae
      // 293: iload 20
      // 295: ifeq 2ae
      // 298: iinc 26 1
      // 29b: goto 2a9
      // 29e: ldc2_w 1025944273543580384
      // 2a1: lload 5
      // 2a3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: athrow
      // 2a9: iload 20
      // 2ab: ifeq 1df
      // 2ae: aload 22
      // 2b0: lload 5
      // 2b2: lconst_0
      // 2b3: lcmp
      // 2b4: ifle 20e
      // 2b7: iload 20
      // 2b9: ifne 2df
      // 2bc: ifnonnull 2dd
      // 2bf: goto 2cd
      // 2c2: ldc2_w 1025944273543580384
      // 2c5: lload 5
      // 2c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: sipush 18868
      // 2d0: ldc2_w 2190162155494913771
      // 2d3: lload 5
      // 2d5: lxor
      // 2d6: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: astore 22
      // 2dd: aload 22
      // 2df: areturn
   }

   boolean H(String param1, int param2, char param3, String param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/_fm.a J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: lload 6
      // 20: dup2
      // 21: ldc2_w 96672693978543
      // 24: lxor
      // 25: dup2
      // 26: bipush 16
      // 28: lushr
      // 29: lstore 8
      // 2b: dup2
      // 2c: bipush 48
      // 2e: lshl
      // 2f: bipush 48
      // 31: lushr
      // 32: l2i
      // 33: istore 10
      // 35: pop2
      // 36: pop2
      // 37: ldc2_w -8552169763786909902
      // 3a: lload 6
      // 3c: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: istore 11
      // 43: aload 1
      // 44: aload 4
      // 46: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49: iload 11
      // 4b: ifeq 7d
      // 4e: ifeq 6c
      // 51: goto 5f
      // 54: ldc2_w -8237090482961397389
      // 57: lload 6
      // 59: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: bipush 1
      // 60: ireturn
      // 61: ldc2_w -8237090482961397389
      // 64: lload 6
      // 66: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield com/zelix/_fm.U Lcom/zelix/we;
      // 70: lload 8
      // 72: iload 10
      // 74: i2s
      // 75: aload 1
      // 76: aload 4
      // 78: invokeinterface com/zelix/we.m (JSLjava/lang/String;Ljava/lang/String;)Z 6
      // 7d: ireturn
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 128106020497104L;
      x44.a<"n">(x44.a<"j">(this, -3574007531931197502L, var2), new Object[]{var4}, -3302799771042363764L, var2);
   }

   boolean e(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/_fm.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 72349001644380
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -1519210723076115320
      // 2e: lload 2
      // 2f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: istore 8
      // 36: aload 4
      // 38: aload 5
      // 3a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3d: iload 8
      // 3f: ifeq 6d
      // 42: ifeq 5e
      // 45: goto 52
      // 48: ldc2_w -1290911494751016247
      // 4b: lload 2
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
      // 54: ldc2_w -1290911494751016247
      // 57: lload 2
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield com/zelix/_fm.U Lcom/zelix/we;
      // 62: aload 4
      // 64: aload 5
      // 66: lload 6
      // 68: invokeinterface com/zelix/we.l (Ljava/lang/String;Ljava/lang/String;J)Z 5
      // 6d: ireturn
   }

   public static String O(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/_fm.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -6614115666148836777
      // 1c: lload 2
      // 1d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 4
      // 24: aload 1
      // 25: iload 4
      // 27: ifeq 8a
      // 2a: aload 1
      // 2b: invokevirtual java/lang/String.length ()I
      // 2e: bipush 1
      // 2f: isub
      // 30: invokevirtual java/lang/String.charAt (I)C
      // 33: sipush 3729
      // 36: ldc2_w 6364975927955351234
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: if_icmpeq 89
      // 43: goto 50
      // 46: ldc2_w -6860495261531446250
      // 49: lload 2
      // 4a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: new java/lang/StringBuilder
      // 53: dup
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: sipush 27155
      // 5a: ldc2_w 6374642779364131401
      // 5d: lload 2
      // 5e: lxor
      // 5f: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 67: aload 1
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: sipush 3729
      // 6e: ldc2_w 6364975927955351234
      // 71: lload 2
      // 72: lxor
      // 73: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: areturn
      // 7f: ldc2_w -6860495261531446250
      // 82: lload 2
      // 83: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 1
      // 8a: areturn
   }

   public boolean C(Object[] param1) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/_fm.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 3761106504211
      // 026: lxor
      // 027: dup2
      // 028: bipush 32
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 6
      // 02e: dup2
      // 02f: bipush 32
      // 031: lshl
      // 032: bipush 48
      // 034: lushr
      // 035: l2i
      // 036: istore 7
      // 038: dup2
      // 039: bipush 48
      // 03b: lshl
      // 03c: bipush 48
      // 03e: lushr
      // 03f: l2i
      // 040: istore 8
      // 042: pop2
      // 043: pop2
      // 044: ldc2_w 1453451790718372425
      // 047: lload 3
      // 048: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: istore 9
      // 04f: aload 5
      // 051: aload 2
      // 052: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 055: iload 9
      // 057: ifeq 07b
      // 05a: ifeq 076
      // 05d: goto 06a
      // 060: ldc2_w 1212837757418492936
      // 063: lload 3
      // 064: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: bipush 1
      // 06b: ireturn
      // 06c: ldc2_w 1212837757418492936
      // 06f: lload 3
      // 070: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 5
      // 078: invokevirtual java/lang/String.length ()I
      // 07b: bipush 1
      // 07c: iload 9
      // 07e: ifeq 0fb
      // 081: if_icmple 0dd
      // 084: goto 091
      // 087: ldc2_w 1212837757418492936
      // 08a: lload 3
      // 08b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 2
      // 092: invokevirtual java/lang/String.length ()I
      // 095: bipush 1
      // 096: lload 3
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 0fb
      // 09c: iload 9
      // 09e: ifeq 0fb
      // 0a1: goto 0ae
      // 0a4: ldc2_w 1212837757418492936
      // 0a7: lload 3
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: lload 3
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: iflt 0e4
      // 0b4: if_icmple 0dd
      // 0b7: goto 0c4
      // 0ba: ldc2_w 1212837757418492936
      // 0bd: lload 3
      // 0be: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 5
      // 0c7: iload 6
      // 0c9: aload 2
      // 0ca: aconst_null
      // 0cb: iload 7
      // 0cd: iload 8
      // 0cf: invokevirtual com/zelix/_fm.w (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)Z
      // 0d2: ireturn
      // 0d3: ldc2_w 1212837757418492936
      // 0d6: lload 3
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 5
      // 0df: invokevirtual java/lang/String.length ()I
      // 0e2: iload 9
      // 0e4: lload 3
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 0ee
      // 0ea: ifeq 5c4
      // 0ed: bipush 1
      // 0ee: goto 0fb
      // 0f1: ldc2_w 1212837757418492936
      // 0f4: lload 3
      // 0f5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: lload 3
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: ifle 10a
      // 101: if_icmpne 5c3
      // 104: aload 2
      // 105: invokevirtual java/lang/String.length ()I
      // 108: iload 9
      // 10a: ifeq 5c4
      // 10d: goto 11a
      // 110: ldc2_w 1212837757418492936
      // 113: lload 3
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: bipush 1
      // 11b: if_icmpne 5c3
      // 11e: goto 12b
      // 121: ldc2_w 1212837757418492936
      // 124: lload 3
      // 125: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 5
      // 12d: bipush 0
      // 12e: invokevirtual java/lang/String.charAt (I)C
      // 131: istore 10
      // 133: aload 2
      // 134: bipush 0
      // 135: invokevirtual java/lang/String.charAt (I)C
      // 138: istore 11
      // 13a: iload 10
      // 13c: iload 9
      // 13e: ifeq 5c2
      // 141: tableswitch 1152 66 90 125 419 1030 1152 920 1152 1152 749 859 1152 1152 1152 1152 1152 1152 1152 1152 584 1152 1152 1091 1152 1152 1152 358
      // 1b4: ldc2_w 1212837757418492936
      // 1b7: lload 3
      // 1b8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: iload 11
      // 1c0: iload 9
      // 1c2: ifeq 2a2
      // 1c5: goto 1d2
      // 1c8: ldc2_w 1212837757418492936
      // 1cb: lload 3
      // 1cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: lload 3
      // 1d3: lconst_0
      // 1d4: lcmp
      // 1d5: ifle 295
      // 1d8: sipush 7740
      // 1db: ldc2_w 7534531653993088639
      // 1de: lload 3
      // 1df: lxor
      // 1e0: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: if_icmpeq 294
      // 1e8: goto 1f5
      // 1eb: ldc2_w 1212837757418492936
      // 1ee: lload 3
      // 1ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: iload 11
      // 1f7: iload 9
      // 1f9: ifeq 2a2
      // 1fc: goto 209
      // 1ff: ldc2_w 1212837757418492936
      // 202: lload 3
      // 203: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: lload 3
      // 20a: lconst_0
      // 20b: lcmp
      // 20c: iflt 295
      // 20f: sipush 11741
      // 212: ldc2_w 3565138094810822037
      // 215: lload 3
      // 216: lxor
      // 217: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: if_icmpeq 294
      // 21f: goto 22c
      // 222: ldc2_w 1212837757418492936
      // 225: lload 3
      // 226: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: athrow
      // 22c: iload 11
      // 22e: iload 9
      // 230: ifeq 2a2
      // 233: goto 240
      // 236: ldc2_w 1212837757418492936
      // 239: lload 3
      // 23a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: lload 3
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 295
      // 246: sipush 29659
      // 249: ldc2_w 4802375894230838165
      // 24c: lload 3
      // 24d: lxor
      // 24e: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: if_icmpeq 294
      // 256: goto 263
      // 259: ldc2_w 1212837757418492936
      // 25c: lload 3
      // 25d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: athrow
      // 263: iload 11
      // 265: iload 9
      // 267: ifeq 2a2
      // 26a: goto 277
      // 26d: ldc2_w 1212837757418492936
      // 270: lload 3
      // 271: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: sipush 20223
      // 27a: ldc2_w 5459484967155046068
      // 27d: lload 3
      // 27e: lxor
      // 27f: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: if_icmpne 2a5
      // 287: goto 294
      // 28a: ldc2_w 1212837757418492936
      // 28d: lload 3
      // 28e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: bipush 1
      // 295: goto 2a2
      // 298: ldc2_w 1212837757418492936
      // 29b: lload 3
      // 29c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: goto 2a6
      // 2a5: bipush 0
      // 2a6: ireturn
      // 2a7: iload 11
      // 2a9: iload 9
      // 2ab: lload 3
      // 2ac: lconst_0
      // 2ad: lcmp
      // 2ae: ifle 2c1
      // 2b1: ifeq 2df
      // 2b4: sipush 16897
      // 2b7: ldc2_w 917709822128691803
      // 2ba: lload 3
      // 2bb: lxor
      // 2bc: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: if_icmpne 2e2
      // 2c4: goto 2d1
      // 2c7: ldc2_w 1212837757418492936
      // 2ca: lload 3
      // 2cb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: bipush 1
      // 2d2: goto 2df
      // 2d5: ldc2_w 1212837757418492936
      // 2d8: lload 3
      // 2d9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: athrow
      // 2df: goto 2e3
      // 2e2: bipush 0
      // 2e3: ireturn
      // 2e4: iload 11
      // 2e6: iload 9
      // 2e8: lload 3
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: iflt 2fe
      // 2ee: ifeq 384
      // 2f1: sipush 10798
      // 2f4: ldc2_w 1557963283927757430
      // 2f7: lload 3
      // 2f8: lxor
      // 2f9: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: if_icmpeq 376
      // 301: goto 30e
      // 304: ldc2_w 1212837757418492936
      // 307: lload 3
      // 308: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: athrow
      // 30e: iload 11
      // 310: iload 9
      // 312: ifeq 384
      // 315: goto 322
      // 318: ldc2_w 1212837757418492936
      // 31b: lload 3
      // 31c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: athrow
      // 322: lload 3
      // 323: lconst_0
      // 324: lcmp
      // 325: ifle 377
      // 328: sipush 18681
      // 32b: ldc2_w 5690311750278582448
      // 32e: lload 3
      // 32f: lxor
      // 330: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: if_icmpeq 376
      // 338: goto 345
      // 33b: ldc2_w 1212837757418492936
      // 33e: lload 3
      // 33f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: athrow
      // 345: iload 11
      // 347: iload 9
      // 349: ifeq 384
      // 34c: goto 359
      // 34f: ldc2_w 1212837757418492936
      // 352: lload 3
      // 353: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: athrow
      // 359: sipush 30498
      // 35c: ldc2_w 6930857107456372581
      // 35f: lload 3
      // 360: lxor
      // 361: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: if_icmpne 387
      // 369: goto 376
      // 36c: ldc2_w 1212837757418492936
      // 36f: lload 3
      // 370: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: athrow
      // 376: bipush 1
      // 377: goto 384
      // 37a: ldc2_w 1212837757418492936
      // 37d: lload 3
      // 37e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: athrow
      // 384: goto 388
      // 387: bipush 0
      // 388: ireturn
      // 389: iload 11
      // 38b: iload 9
      // 38d: lload 3
      // 38e: lconst_0
      // 38f: lcmp
      // 390: ifle 3a3
      // 393: ifeq 429
      // 396: sipush 29520
      // 399: ldc2_w 1061739462984510234
      // 39c: lload 3
      // 39d: lxor
      // 39e: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: if_icmpeq 41b
      // 3a6: goto 3b3
      // 3a9: ldc2_w 1212837757418492936
      // 3ac: lload 3
      // 3ad: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b2: athrow
      // 3b3: iload 11
      // 3b5: iload 9
      // 3b7: ifeq 429
      // 3ba: goto 3c7
      // 3bd: ldc2_w 1212837757418492936
      // 3c0: lload 3
      // 3c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: lload 3
      // 3c8: lconst_0
      // 3c9: lcmp
      // 3ca: ifle 41c
      // 3cd: sipush 18681
      // 3d0: ldc2_w 5690311750278582448
      // 3d3: lload 3
      // 3d4: lxor
      // 3d5: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3da: if_icmpeq 41b
      // 3dd: goto 3ea
      // 3e0: ldc2_w 1212837757418492936
      // 3e3: lload 3
      // 3e4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: athrow
      // 3ea: iload 11
      // 3ec: iload 9
      // 3ee: ifeq 429
      // 3f1: goto 3fe
      // 3f4: ldc2_w 1212837757418492936
      // 3f7: lload 3
      // 3f8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: athrow
      // 3fe: sipush 30498
      // 401: ldc2_w 6930857107456372581
      // 404: lload 3
      // 405: lxor
      // 406: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40b: if_icmpne 42c
      // 40e: goto 41b
      // 411: ldc2_w 1212837757418492936
      // 414: lload 3
      // 415: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: athrow
      // 41b: bipush 1
      // 41c: goto 429
      // 41f: ldc2_w 1212837757418492936
      // 422: lload 3
      // 423: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 428: athrow
      // 429: goto 42d
      // 42c: bipush 0
      // 42d: ireturn
      // 42e: iload 11
      // 430: iload 9
      // 432: lload 3
      // 433: lconst_0
      // 434: lcmp
      // 435: ifle 448
      // 438: ifeq 497
      // 43b: sipush 18681
      // 43e: ldc2_w 5690311750278582448
      // 441: lload 3
      // 442: lxor
      // 443: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: if_icmpeq 489
      // 44b: goto 458
      // 44e: ldc2_w 1212837757418492936
      // 451: lload 3
      // 452: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: athrow
      // 458: iload 11
      // 45a: iload 9
      // 45c: ifeq 497
      // 45f: goto 46c
      // 462: ldc2_w 1212837757418492936
      // 465: lload 3
      // 466: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: athrow
      // 46c: sipush 30498
      // 46f: ldc2_w 6930857107456372581
      // 472: lload 3
      // 473: lxor
      // 474: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 479: if_icmpne 49a
      // 47c: goto 489
      // 47f: ldc2_w 1212837757418492936
      // 482: lload 3
      // 483: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 488: athrow
      // 489: bipush 1
      // 48a: goto 497
      // 48d: ldc2_w 1212837757418492936
      // 490: lload 3
      // 491: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 496: athrow
      // 497: goto 49b
      // 49a: bipush 0
      // 49b: ireturn
      // 49c: iload 11
      // 49e: iload 9
      // 4a0: lload 3
      // 4a1: lconst_0
      // 4a2: lcmp
      // 4a3: ifle 4b6
      // 4a6: ifeq 4d4
      // 4a9: sipush 30498
      // 4ac: ldc2_w 6930857107456372581
      // 4af: lload 3
      // 4b0: lxor
      // 4b1: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b6: if_icmpne 4d7
      // 4b9: goto 4c6
      // 4bc: ldc2_w 1212837757418492936
      // 4bf: lload 3
      // 4c0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: athrow
      // 4c6: bipush 1
      // 4c7: goto 4d4
      // 4ca: ldc2_w 1212837757418492936
      // 4cd: lload 3
      // 4ce: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: athrow
      // 4d4: goto 4d8
      // 4d7: bipush 0
      // 4d8: ireturn
      // 4d9: iload 11
      // 4db: iload 9
      // 4dd: lload 3
      // 4de: lconst_0
      // 4df: lcmp
      // 4e0: ifle 4f3
      // 4e3: ifeq 542
      // 4e6: sipush 15123
      // 4e9: ldc2_w 6138077255314924370
      // 4ec: lload 3
      // 4ed: lxor
      // 4ee: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: if_icmpeq 534
      // 4f6: goto 503
      // 4f9: ldc2_w 1212837757418492936
      // 4fc: lload 3
      // 4fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: athrow
      // 503: iload 11
      // 505: iload 9
      // 507: ifeq 542
      // 50a: goto 517
      // 50d: ldc2_w 1212837757418492936
      // 510: lload 3
      // 511: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 516: athrow
      // 517: sipush 3249
      // 51a: ldc2_w 8546432096661329139
      // 51d: lload 3
      // 51e: lxor
      // 51f: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: if_icmpne 545
      // 527: goto 534
      // 52a: ldc2_w 1212837757418492936
      // 52d: lload 3
      // 52e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 533: athrow
      // 534: bipush 1
      // 535: goto 542
      // 538: ldc2_w 1212837757418492936
      // 53b: lload 3
      // 53c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 541: athrow
      // 542: goto 546
      // 545: bipush 0
      // 546: ireturn
      // 547: iload 11
      // 549: iload 9
      // 54b: lload 3
      // 54c: lconst_0
      // 54d: lcmp
      // 54e: ifle 561
      // 551: ifeq 57f
      // 554: sipush 16780
      // 557: ldc2_w 3786030963870243287
      // 55a: lload 3
      // 55b: lxor
      // 55c: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 561: if_icmpne 582
      // 564: goto 571
      // 567: ldc2_w 1212837757418492936
      // 56a: lload 3
      // 56b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 570: athrow
      // 571: bipush 1
      // 572: goto 57f
      // 575: ldc2_w 1212837757418492936
      // 578: lload 3
      // 579: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57e: athrow
      // 57f: goto 583
      // 582: bipush 0
      // 583: ireturn
      // 584: iload 11
      // 586: iload 9
      // 588: lload 3
      // 589: lconst_0
      // 58a: lcmp
      // 58b: ifle 59e
      // 58e: ifeq 5bc
      // 591: sipush 2097
      // 594: ldc2_w 2784097992727875710
      // 597: lload 3
      // 598: lxor
      // 599: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: if_icmpne 5bf
      // 5a1: goto 5ae
      // 5a4: ldc2_w 1212837757418492936
      // 5a7: lload 3
      // 5a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ad: athrow
      // 5ae: bipush 1
      // 5af: goto 5bc
      // 5b2: ldc2_w 1212837757418492936
      // 5b5: lload 3
      // 5b6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bb: athrow
      // 5bc: goto 5c0
      // 5bf: bipush 0
      // 5c0: ireturn
      // 5c1: bipush 0
      // 5c2: ireturn
      // 5c3: bipush 0
      // 5c4: ireturn
   }

   void x(Object[] var1) {
      long var3 = (Long)var1[0];
      Integer var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 70075664181380L;
      this.s.put(x44.a<"u">(new Object[]{var5}, 3579202728511275566L, var3), var2);
   }

   String W(Object[] var1) {
      n var3 = (n)var1[0];
      long var5 = (Long)var1[1];
      n var4 = (n)var1[2];
      String var2 = (String)var1[3];
      var5 = a ^ var5;
      long var7 = var5 ^ 100916423590140L;
      return x44.a<"l">(this, var7, var3.j(), var4.j(), var2, -8148021135437561777L, var5);
   }

   public String J(long param1, String param3, String param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_fm.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 87933813232730
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 122318425555815
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 20025495629201
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 120751481404413
      // 020: lxor
      // 021: lstore 12
      // 023: dup2
      // 024: ldc2_w 116474035278122
      // 027: lxor
      // 028: dup2
      // 029: bipush 32
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 14
      // 02f: dup2
      // 030: bipush 32
      // 032: lshl
      // 033: bipush 56
      // 035: lushr
      // 036: l2i
      // 037: istore 15
      // 039: dup2
      // 03a: bipush 40
      // 03c: lshl
      // 03d: bipush 40
      // 03f: lushr
      // 040: l2i
      // 041: istore 16
      // 043: pop2
      // 044: dup2
      // 045: ldc2_w 21334363221409
      // 048: lxor
      // 049: lstore 17
      // 04b: dup2
      // 04c: ldc2_w 108340706944524
      // 04f: lxor
      // 050: dup2
      // 051: bipush 48
      // 053: lushr
      // 054: l2i
      // 055: istore 19
      // 057: dup2
      // 058: bipush 16
      // 05a: lshl
      // 05b: bipush 32
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 20
      // 061: dup2
      // 062: bipush 48
      // 064: lshl
      // 065: bipush 48
      // 067: lushr
      // 068: l2i
      // 069: istore 21
      // 06b: pop2
      // 06c: dup2
      // 06d: ldc2_w 63011640566052
      // 070: lxor
      // 071: lstore 22
      // 073: dup2
      // 074: ldc2_w 68266604830831
      // 077: lxor
      // 078: lstore 24
      // 07a: dup2
      // 07b: ldc2_w 15898542394897
      // 07e: lxor
      // 07f: lstore 26
      // 081: pop2
      // 082: ldc2_w 3749645254807183132
      // 085: lload 1
      // 086: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: lload 12
      // 08e: invokevirtual com/zelix/_fm.H (J)Ljava/lang/Integer;
      // 091: astore 29
      // 093: istore 28
      // 095: aload 3
      // 096: iload 28
      // 098: ifne 0d6
      // 09b: aload 4
      // 09d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a0: ifeq 0bc
      // 0a3: goto 0b0
      // 0a6: ldc2_w 3717666641792104267
      // 0a9: lload 1
      // 0aa: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 3
      // 0b1: areturn
      // 0b2: ldc2_w 3717666641792104267
      // 0b5: lload 1
      // 0b6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: ldc2_w 3811318820763690304
      // 0c0: lload 1
      // 0c1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: aload 3
      // 0c7: iload 19
      // 0c9: i2c
      // 0ca: iload 20
      // 0cc: aload 4
      // 0ce: iload 21
      // 0d0: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 0d3: checkcast java/lang/String
      // 0d6: astore 30
      // 0d8: aload 30
      // 0da: iload 28
      // 0dc: ifne 0f1
      // 0df: ifnull 0f2
      // 0e2: goto 0ef
      // 0e5: ldc2_w 3717666641792104267
      // 0e8: lload 1
      // 0e9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: aload 30
      // 0f1: areturn
      // 0f2: aconst_null
      // 0f3: astore 31
      // 0f5: aconst_null
      // 0f6: astore 32
      // 0f8: lload 17
      // 0fa: aload 3
      // 0fb: invokestatic com/zelix/_fm.a (JLjava/lang/String;)Ljava/lang/String;
      // 0fe: astore 33
      // 100: lload 17
      // 102: aload 4
      // 104: invokestatic com/zelix/_fm.a (JLjava/lang/String;)Ljava/lang/String;
      // 107: astore 34
      // 109: aload 33
      // 10b: bipush 0
      // 10c: invokevirtual java/lang/String.charAt (I)C
      // 10f: sipush 24630
      // 112: ldc2_w 4790251440546126640
      // 115: lload 1
      // 116: lxor
      // 117: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: iload 28
      // 11e: ifne 28d
      // 121: if_icmpne 27a
      // 124: goto 131
      // 127: ldc2_w 3717666641792104267
      // 12a: lload 1
      // 12b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: lload 1
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 1a9
      // 137: aload 34
      // 139: iload 28
      // 13b: ifne 1a7
      // 13e: goto 14b
      // 141: ldc2_w 3717666641792104267
      // 144: lload 1
      // 145: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: bipush 0
      // 14c: invokevirtual java/lang/String.charAt (I)C
      // 14f: sipush 24630
      // 152: ldc2_w 4790251440546126640
      // 155: lload 1
      // 156: lxor
      // 157: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: if_icmpne 1ae
      // 15f: goto 16c
      // 162: ldc2_w 3717666641792104267
      // 165: lload 1
      // 166: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: aload 0
      // 16d: aload 33
      // 16f: aload 34
      // 171: aload 5
      // 173: lload 22
      // 175: bipush 4
      // 176: anewarray 134
      // 179: dup_x2
      // 17a: dup_x2
      // 17b: pop
      // 17c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f: bipush 3
      // 180: swap
      // 181: aastore
      // 182: dup_x1
      // 183: swap
      // 184: bipush 2
      // 185: swap
      // 186: aastore
      // 187: dup_x1
      // 188: swap
      // 189: bipush 1
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 0
      // 18f: swap
      // 190: aastore
      // 191: ldc2_w 3728551083060153590
      // 194: lload 1
      // 195: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: goto 1a7
      // 19d: ldc2_w 3717666641792104267
      // 1a0: lload 1
      // 1a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: astore 30
      // 1a9: iload 28
      // 1ab: ifeq 64f
      // 1ae: aload 0
      // 1af: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 1b2: aload 34
      // 1b4: aload 29
      // 1b6: aload 5
      // 1b8: lload 26
      // 1ba: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 1bd: astore 32
      // 1bf: iload 28
      // 1c1: lload 1
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: ifle 1d1
      // 1c7: ifne 277
      // 1ca: aload 32
      // 1cc: lload 6
      // 1ce: invokevirtual com/zelix/hz.d (J)Z
      // 1d1: lload 1
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 26b
      // 1d7: ifeq 268
      // 1da: goto 1e7
      // 1dd: ldc2_w 3717666641792104267
      // 1e0: lload 1
      // 1e1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: lload 1
      // 1e8: lconst_0
      // 1e9: lcmp
      // 1ea: ifle 25d
      // 1ed: aload 34
      // 1ef: iload 28
      // 1f1: ifne 25b
      // 1f4: goto 201
      // 1f7: ldc2_w 3717666641792104267
      // 1fa: lload 1
      // 1fb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: sipush 2495
      // 204: ldc2_w 2503673277589244748
      // 207: lload 1
      // 208: lxor
      // 209: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 211: lload 1
      // 212: lconst_0
      // 213: lcmp
      // 214: iflt 244
      // 217: ifeq 241
      // 21a: goto 227
      // 21d: ldc2_w 3717666641792104267
      // 220: lload 1
      // 221: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: sipush 20959
      // 22a: ldc2_w 6588630920165724969
      // 22d: lload 1
      // 22e: lxor
      // 22f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: astore 30
      // 236: iload 28
      // 238: lload 1
      // 239: lconst_0
      // 23a: lcmp
      // 23b: ifle 244
      // 23e: ifeq 64f
      // 241: sipush 26745
      // 244: ldc2_w 1796434324826532494
      // 247: lload 1
      // 248: lxor
      // 249: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: goto 25b
      // 251: ldc2_w 3717666641792104267
      // 254: lload 1
      // 255: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: astore 30
      // 25d: iload 28
      // 25f: lload 1
      // 260: lconst_0
      // 261: lcmp
      // 262: ifle 26b
      // 265: ifeq 64f
      // 268: sipush 26745
      // 26b: ldc2_w 1796434324826532494
      // 26e: lload 1
      // 26f: lxor
      // 270: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: astore 30
      // 277: goto 64f
      // 27a: aload 34
      // 27c: bipush 0
      // 27d: invokevirtual java/lang/String.charAt (I)C
      // 280: sipush 24630
      // 283: ldc2_w 4790251440546126640
      // 286: lload 1
      // 287: lxor
      // 288: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: if_icmpne 35c
      // 290: aload 0
      // 291: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 294: aload 33
      // 296: aload 29
      // 298: aload 5
      // 29a: lload 26
      // 29c: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 29f: astore 31
      // 2a1: iload 28
      // 2a3: lload 1
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: ifle 2b3
      // 2a9: ifne 359
      // 2ac: aload 31
      // 2ae: lload 6
      // 2b0: invokevirtual com/zelix/hz.d (J)Z
      // 2b3: lload 1
      // 2b4: lconst_0
      // 2b5: lcmp
      // 2b6: ifle 34d
      // 2b9: ifeq 34a
      // 2bc: goto 2c9
      // 2bf: ldc2_w 3717666641792104267
      // 2c2: lload 1
      // 2c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: lload 1
      // 2ca: lconst_0
      // 2cb: lcmp
      // 2cc: ifle 33f
      // 2cf: aload 33
      // 2d1: iload 28
      // 2d3: ifne 33d
      // 2d6: goto 2e3
      // 2d9: ldc2_w 3717666641792104267
      // 2dc: lload 1
      // 2dd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: sipush 2495
      // 2e6: ldc2_w 2503673277589244748
      // 2e9: lload 1
      // 2ea: lxor
      // 2eb: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f3: lload 1
      // 2f4: lconst_0
      // 2f5: lcmp
      // 2f6: iflt 326
      // 2f9: ifeq 323
      // 2fc: goto 309
      // 2ff: ldc2_w 3717666641792104267
      // 302: lload 1
      // 303: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: sipush 32079
      // 30c: ldc2_w 2161875434344562618
      // 30f: lload 1
      // 310: lxor
      // 311: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: astore 30
      // 318: iload 28
      // 31a: lload 1
      // 31b: lconst_0
      // 31c: lcmp
      // 31d: ifle 326
      // 320: ifeq 64f
      // 323: sipush 26745
      // 326: ldc2_w 1796434324826532494
      // 329: lload 1
      // 32a: lxor
      // 32b: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: goto 33d
      // 333: ldc2_w 3717666641792104267
      // 336: lload 1
      // 337: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: athrow
      // 33d: astore 30
      // 33f: iload 28
      // 341: lload 1
      // 342: lconst_0
      // 343: lcmp
      // 344: iflt 34d
      // 347: ifeq 64f
      // 34a: sipush 26745
      // 34d: ldc2_w 1796434324826532494
      // 350: lload 1
      // 351: lxor
      // 352: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: astore 30
      // 359: goto 64f
      // 35c: aload 0
      // 35d: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 360: aload 33
      // 362: aload 29
      // 364: aload 5
      // 366: lload 26
      // 368: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 36b: astore 31
      // 36d: aload 0
      // 36e: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 371: aload 34
      // 373: aload 29
      // 375: aload 5
      // 377: lload 26
      // 379: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 37c: astore 32
      // 37e: iload 28
      // 380: lload 1
      // 381: lconst_0
      // 382: lcmp
      // 383: iflt 408
      // 386: ifne 400
      // 389: aload 31
      // 38b: lload 6
      // 38d: invokevirtual com/zelix/hz.d (J)Z
      // 390: ifne 3c9
      // 393: goto 3a0
      // 396: ldc2_w 3717666641792104267
      // 399: lload 1
      // 39a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: aload 32
      // 3a2: iload 28
      // 3a4: ifne 41a
      // 3a7: goto 3b4
      // 3aa: ldc2_w 3717666641792104267
      // 3ad: lload 1
      // 3ae: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b3: athrow
      // 3b4: lload 6
      // 3b6: invokevirtual com/zelix/hz.d (J)Z
      // 3b9: ifeq 40b
      // 3bc: goto 3c9
      // 3bf: ldc2_w 3717666641792104267
      // 3c2: lload 1
      // 3c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: aload 33
      // 3cc: lload 8
      // 3ce: aload 31
      // 3d0: aload 34
      // 3d2: aload 32
      // 3d4: bipush 5
      // 3d5: anewarray 134
      // 3d8: dup_x1
      // 3d9: swap
      // 3da: bipush 4
      // 3db: swap
      // 3dc: aastore
      // 3dd: dup_x1
      // 3de: swap
      // 3df: bipush 3
      // 3e0: swap
      // 3e1: aastore
      // 3e2: dup_x1
      // 3e3: swap
      // 3e4: bipush 2
      // 3e5: swap
      // 3e6: aastore
      // 3e7: dup_x2
      // 3e8: dup_x2
      // 3e9: pop
      // 3ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ed: bipush 1
      // 3ee: swap
      // 3ef: aastore
      // 3f0: dup_x1
      // 3f1: swap
      // 3f2: bipush 0
      // 3f3: swap
      // 3f4: aastore
      // 3f5: ldc2_w 3212843925563764781
      // 3f8: lload 1
      // 3f9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fe: astore 30
      // 400: lload 1
      // 401: lconst_0
      // 402: lcmp
      // 403: ifle 669
      // 406: iload 28
      // 408: ifeq 64f
      // 40b: aload 31
      // 40d: goto 41a
      // 410: ldc2_w 3717666641792104267
      // 413: lload 1
      // 414: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: aload 0
      // 41b: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 41e: aload 29
      // 420: lload 24
      // 422: bipush 3
      // 423: anewarray 134
      // 426: dup_x2
      // 427: dup_x2
      // 428: pop
      // 429: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42c: bipush 2
      // 42d: swap
      // 42e: aastore
      // 42f: dup_x1
      // 430: swap
      // 431: bipush 1
      // 432: swap
      // 433: aastore
      // 434: dup_x1
      // 435: swap
      // 436: bipush 0
      // 437: swap
      // 438: aastore
      // 439: ldc2_w 3167639671001823672
      // 43c: lload 1
      // 43d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 442: astore 35
      // 444: aload 32
      // 446: aload 0
      // 447: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 44a: aload 29
      // 44c: lload 24
      // 44e: bipush 3
      // 44f: anewarray 134
      // 452: dup_x2
      // 453: dup_x2
      // 454: pop
      // 455: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 458: bipush 2
      // 459: swap
      // 45a: aastore
      // 45b: dup_x1
      // 45c: swap
      // 45d: bipush 1
      // 45e: swap
      // 45f: aastore
      // 460: dup_x1
      // 461: swap
      // 462: bipush 0
      // 463: swap
      // 464: aastore
      // 465: ldc2_w 3167639671001823672
      // 468: lload 1
      // 469: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: astore 36
      // 470: aload 35
      // 472: invokevirtual java/util/ArrayList.size ()I
      // 475: istore 37
      // 477: aload 36
      // 479: aload 33
      // 47b: ldc2_w 3830061499541026261
      // 47e: lload 1
      // 47f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: iload 28
      // 486: lload 1
      // 487: lconst_0
      // 488: lcmp
      // 489: ifle 4e7
      // 48c: ifne 4e5
      // 48f: ifeq 4cb
      // 492: goto 49f
      // 495: ldc2_w 3717666641792104267
      // 498: lload 1
      // 499: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49e: athrow
      // 49f: lload 10
      // 4a1: aload 33
      // 4a3: bipush 2
      // 4a4: anewarray 134
      // 4a7: dup_x1
      // 4a8: swap
      // 4a9: bipush 1
      // 4aa: swap
      // 4ab: aastore
      // 4ac: dup_x2
      // 4ad: dup_x2
      // 4ae: pop
      // 4af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b2: bipush 0
      // 4b3: swap
      // 4b4: aastore
      // 4b5: ldc2_w 3776049309463457566
      // 4b8: lload 1
      // 4b9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4be: astore 30
      // 4c0: lload 1
      // 4c1: lconst_0
      // 4c2: lcmp
      // 4c3: ifle 669
      // 4c6: iload 28
      // 4c8: ifeq 64f
      // 4cb: aload 35
      // 4cd: aload 34
      // 4cf: ldc2_w 3830061499541026261
      // 4d2: lload 1
      // 4d3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: goto 4e5
      // 4db: ldc2_w 3717666641792104267
      // 4de: lload 1
      // 4df: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e4: athrow
      // 4e5: iload 28
      // 4e7: ifne 534
      // 4ea: ifeq 526
      // 4ed: goto 4fa
      // 4f0: ldc2_w 3717666641792104267
      // 4f3: lload 1
      // 4f4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f9: athrow
      // 4fa: lload 10
      // 4fc: aload 34
      // 4fe: bipush 2
      // 4ff: anewarray 134
      // 502: dup_x1
      // 503: swap
      // 504: bipush 1
      // 505: swap
      // 506: aastore
      // 507: dup_x2
      // 508: dup_x2
      // 509: pop
      // 50a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50d: bipush 0
      // 50e: swap
      // 50f: aastore
      // 510: ldc2_w 3776049309463457566
      // 513: lload 1
      // 514: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: astore 30
      // 51b: lload 1
      // 51c: lconst_0
      // 51d: lcmp
      // 51e: ifle 669
      // 521: iload 28
      // 523: ifeq 64f
      // 526: bipush 0
      // 527: goto 534
      // 52a: ldc2_w 3717666641792104267
      // 52d: lload 1
      // 52e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 533: athrow
      // 534: istore 38
      // 536: iload 38
      // 538: iload 37
      // 53a: if_icmpge 623
      // 53d: aload 35
      // 53f: iload 38
      // 541: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 544: checkcast java/lang/String
      // 547: astore 39
      // 549: iload 28
      // 54b: lload 1
      // 54c: lconst_0
      // 54d: lcmp
      // 54e: ifle 620
      // 551: ifne 61e
      // 554: aload 36
      // 556: iload 28
      // 558: ifne 682
      // 55b: goto 568
      // 55e: ldc2_w 3717666641792104267
      // 561: lload 1
      // 562: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 567: athrow
      // 568: aload 39
      // 56a: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 56d: bipush -1
      // 56e: if_icmpeq 60e
      // 571: goto 57e
      // 574: ldc2_w 3717666641792104267
      // 577: lload 1
      // 578: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57d: athrow
      // 57e: lload 10
      // 580: aload 39
      // 582: bipush 2
      // 583: anewarray 134
      // 586: dup_x1
      // 587: swap
      // 588: bipush 1
      // 589: swap
      // 58a: aastore
      // 58b: dup_x2
      // 58c: dup_x2
      // 58d: pop
      // 58e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 591: bipush 0
      // 592: swap
      // 593: aastore
      // 594: ldc2_w 3776049309463457566
      // 597: lload 1
      // 598: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59d: astore 30
      // 59f: aload 30
      // 5a1: iload 28
      // 5a3: lload 1
      // 5a4: lconst_0
      // 5a5: lcmp
      // 5a6: iflt 62d
      // 5a9: ifne 62b
      // 5ac: sipush 26745
      // 5af: ldc2_w 1796434324826532494
      // 5b2: lload 1
      // 5b3: lxor
      // 5b4: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5bc: ifeq 623
      // 5bf: goto 5cc
      // 5c2: ldc2_w 3717666641792104267
      // 5c5: lload 1
      // 5c6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: aload 0
      // 5cd: aload 33
      // 5cf: lload 8
      // 5d1: aload 31
      // 5d3: aload 34
      // 5d5: aload 32
      // 5d7: bipush 5
      // 5d8: anewarray 134
      // 5db: dup_x1
      // 5dc: swap
      // 5dd: bipush 4
      // 5de: swap
      // 5df: aastore
      // 5e0: dup_x1
      // 5e1: swap
      // 5e2: bipush 3
      // 5e3: swap
      // 5e4: aastore
      // 5e5: dup_x1
      // 5e6: swap
      // 5e7: bipush 2
      // 5e8: swap
      // 5e9: aastore
      // 5ea: dup_x2
      // 5eb: dup_x2
      // 5ec: pop
      // 5ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f0: bipush 1
      // 5f1: swap
      // 5f2: aastore
      // 5f3: dup_x1
      // 5f4: swap
      // 5f5: bipush 0
      // 5f6: swap
      // 5f7: aastore
      // 5f8: ldc2_w 3212843925563764781
      // 5fb: lload 1
      // 5fc: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 601: astore 30
      // 603: lload 1
      // 604: lconst_0
      // 605: lcmp
      // 606: ifle 611
      // 609: iload 28
      // 60b: ifeq 623
      // 60e: iinc 38 1
      // 611: goto 61e
      // 614: ldc2_w 3717666641792104267
      // 617: lload 1
      // 618: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61d: athrow
      // 61e: iload 28
      // 620: ifeq 536
      // 623: lload 1
      // 624: lconst_0
      // 625: lcmp
      // 626: iflt 683
      // 629: aload 30
      // 62b: iload 28
      // 62d: ifne 685
      // 630: ifnonnull 64f
      // 633: goto 640
      // 636: ldc2_w 3717666641792104267
      // 639: lload 1
      // 63a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63f: athrow
      // 640: sipush 26745
      // 643: ldc2_w 1796434324826532494
      // 646: lload 1
      // 647: lxor
      // 648: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64d: astore 30
      // 64f: aload 0
      // 650: ldc2_w 3811318820763690304
      // 653: lload 1
      // 654: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 659: aload 3
      // 65a: aload 4
      // 65c: aload 30
      // 65e: iload 14
      // 660: iload 15
      // 662: i2b
      // 663: iload 16
      // 665: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 668: pop
      // 669: aload 0
      // 66a: ldc2_w 3811318820763690304
      // 66d: lload 1
      // 66e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 673: aload 4
      // 675: aload 3
      // 676: aload 30
      // 678: iload 14
      // 67a: iload 15
      // 67c: i2b
      // 67d: iload 16
      // 67f: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 682: pop
      // 683: aload 30
      // 685: areturn
   }

   String U(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 6
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 4
      // 022: pop
      // 023: getstatic com/zelix/_fm.a J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 63011640566052
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 11803319704744
      // 038: lxor
      // 039: lstore 9
      // 03b: pop2
      // 03c: aload 2
      // 03d: ldc "["
      // 03f: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 042: bipush 1
      // 043: iadd
      // 044: istore 12
      // 046: aload 3
      // 047: ldc "["
      // 049: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 04c: bipush 1
      // 04d: iadd
      // 04e: istore 13
      // 050: ldc2_w -1693111972248914206
      // 053: lload 4
      // 055: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: aload 2
      // 05b: iload 12
      // 05d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 060: astore 14
      // 062: aload 3
      // 063: iload 13
      // 065: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 068: astore 15
      // 06a: istore 11
      // 06c: iload 12
      // 06e: iload 13
      // 070: iload 11
      // 072: ifeq 20c
      // 075: if_icmpeq 206
      // 078: goto 086
      // 07b: ldc2_w -1405206019560920925
      // 07e: lload 4
      // 080: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: iload 12
      // 088: iload 13
      // 08a: if_icmpge 0ab
      // 08d: goto 09b
      // 090: ldc2_w -1405206019560920925
      // 093: lload 4
      // 095: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 14
      // 09d: astore 16
      // 09f: lload 4
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 0af
      // 0a6: iload 11
      // 0a8: ifne 0af
      // 0ab: aload 15
      // 0ad: astore 16
      // 0af: aload 16
      // 0b1: iload 11
      // 0b3: ifeq 205
      // 0b6: ldc "L"
      // 0b8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0bb: ifeq 183
      // 0be: goto 0cc
      // 0c1: ldc2_w -1405206019560920925
      // 0c4: lload 4
      // 0c6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 16
      // 0ce: iload 11
      // 0d0: ifeq 205
      // 0d3: goto 0e1
      // 0d6: ldc2_w -1405206019560920925
      // 0d9: lload 4
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: ldc ";"
      // 0e3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0e6: ifeq 183
      // 0e9: goto 0f7
      // 0ec: ldc2_w -1405206019560920925
      // 0ef: lload 4
      // 0f1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: new java/lang/StringBuilder
      // 0fa: dup
      // 0fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe: ldc ""
      // 100: sipush 27155
      // 103: ldc2_w 6374683287398141692
      // 106: lload 4
      // 108: lxor
      // 109: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: iload 12
      // 110: iload 13
      // 112: ldc2_w -641962024870550506
      // 115: lload 4
      // 117: invokedynamic t (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: lload 9
      // 11e: sipush 24630
      // 121: ldc2_w 4790174975657821400
      // 124: lload 4
      // 126: lxor
      // 127: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: bipush 5
      // 12d: anewarray 134
      // 130: dup_x1
      // 131: swap
      // 132: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 135: bipush 4
      // 136: swap
      // 137: aastore
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 3
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 146: bipush 2
      // 147: swap
      // 148: aastore
      // 149: dup_x1
      // 14a: swap
      // 14b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x1
      // 152: swap
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w -1350465534422947706
      // 159: lload 4
      // 15b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: sipush 26745
      // 166: ldc2_w 1796458018642621798
      // 169: lload 4
      // 16b: lxor
      // 16c: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: areturn
      // 178: ldc2_w -1405206019560920925
      // 17b: lload 4
      // 17d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: new java/lang/StringBuilder
      // 186: dup
      // 187: invokespecial java/lang/StringBuilder.<init> ()V
      // 18a: ldc ""
      // 18c: sipush 27155
      // 18f: ldc2_w 6374683287398141692
      // 192: lload 4
      // 194: lxor
      // 195: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: iload 12
      // 19c: iload 13
      // 19e: ldc2_w -641962024870550506
      // 1a1: lload 4
      // 1a3: invokedynamic t (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: bipush 1
      // 1a9: isub
      // 1aa: lload 9
      // 1ac: sipush 24630
      // 1af: ldc2_w 4790174975657821400
      // 1b2: lload 4
      // 1b4: lxor
      // 1b5: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: bipush 5
      // 1bb: anewarray 134
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c3: bipush 4
      // 1c4: swap
      // 1c5: aastore
      // 1c6: dup_x2
      // 1c7: dup_x2
      // 1c8: pop
      // 1c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cc: bipush 3
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: bipush 2
      // 1d5: swap
      // 1d6: aastore
      // 1d7: dup_x1
      // 1d8: swap
      // 1d9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1dc: bipush 1
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: bipush 0
      // 1e2: swap
      // 1e3: aastore
      // 1e4: ldc2_w -1350465534422947706
      // 1e7: lload 4
      // 1e9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: sipush 26745
      // 1f4: ldc2_w 1796458018642621798
      // 1f7: lload 4
      // 1f9: lxor
      // 1fa: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 202: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 205: areturn
      // 206: aload 14
      // 208: invokevirtual java/lang/String.length ()I
      // 20b: bipush 1
      // 20c: iload 11
      // 20e: ifeq 349
      // 211: if_icmpne 330
      // 214: goto 222
      // 217: ldc2_w -1405206019560920925
      // 21a: lload 4
      // 21c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 15
      // 224: invokevirtual java/lang/String.length ()I
      // 227: bipush 1
      // 228: lload 4
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: ifle 349
      // 22f: iload 11
      // 231: ifeq 349
      // 234: goto 242
      // 237: ldc2_w -1405206019560920925
      // 23a: lload 4
      // 23c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: athrow
      // 242: if_icmpne 330
      // 245: goto 253
      // 248: ldc2_w -1405206019560920925
      // 24b: lload 4
      // 24d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 14
      // 255: aload 15
      // 257: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25a: iload 11
      // 25c: lload 4
      // 25e: lconst_0
      // 25f: lcmp
      // 260: iflt 29c
      // 263: ifeq 294
      // 266: goto 274
      // 269: ldc2_w -1405206019560920925
      // 26c: lload 4
      // 26e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: athrow
      // 274: ifeq 292
      // 277: goto 285
      // 27a: ldc2_w -1405206019560920925
      // 27d: lload 4
      // 27f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: athrow
      // 285: aload 2
      // 286: areturn
      // 287: ldc2_w -1405206019560920925
      // 28a: lload 4
      // 28c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: iload 12
      // 294: lload 4
      // 296: lconst_0
      // 297: lcmp
      // 298: iflt 2a2
      // 29b: bipush 1
      // 29c: if_icmpne 2b9
      // 29f: sipush 26745
      // 2a2: ldc2_w 1796458018642621798
      // 2a5: lload 4
      // 2a7: lxor
      // 2a8: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: areturn
      // 2ae: ldc2_w -1405206019560920925
      // 2b1: lload 4
      // 2b3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: new java/lang/StringBuilder
      // 2bc: dup
      // 2bd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c0: ldc ""
      // 2c2: sipush 27155
      // 2c5: ldc2_w 6374683287398141692
      // 2c8: lload 4
      // 2ca: lxor
      // 2cb: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: iload 12
      // 2d2: bipush 1
      // 2d3: isub
      // 2d4: lload 9
      // 2d6: sipush 24630
      // 2d9: ldc2_w 4790174975657821400
      // 2dc: lload 4
      // 2de: lxor
      // 2df: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: bipush 5
      // 2e5: anewarray 134
      // 2e8: dup_x1
      // 2e9: swap
      // 2ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ed: bipush 4
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x2
      // 2f1: dup_x2
      // 2f2: pop
      // 2f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f6: bipush 3
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2fe: bipush 2
      // 2ff: swap
      // 300: aastore
      // 301: dup_x1
      // 302: swap
      // 303: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 306: bipush 1
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: bipush 0
      // 30c: swap
      // 30d: aastore
      // 30e: ldc2_w -1350465534422947706
      // 311: lload 4
      // 313: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31b: sipush 26745
      // 31e: ldc2_w 1796458018642621798
      // 321: lload 4
      // 323: lxor
      // 324: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 32f: areturn
      // 330: aload 14
      // 332: iload 11
      // 334: ifeq 392
      // 337: invokevirtual java/lang/String.length ()I
      // 33a: bipush 1
      // 33b: goto 349
      // 33e: ldc2_w -1405206019560920925
      // 341: lload 4
      // 343: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: athrow
      // 349: if_icmpeq 376
      // 34c: aload 15
      // 34e: iload 11
      // 350: ifeq 3a6
      // 353: goto 361
      // 356: ldc2_w -1405206019560920925
      // 359: lload 4
      // 35b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: invokevirtual java/lang/String.length ()I
      // 364: bipush 1
      // 365: if_icmpne 393
      // 368: goto 376
      // 36b: ldc2_w -1405206019560920925
      // 36e: lload 4
      // 370: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: athrow
      // 376: sipush 26745
      // 379: ldc2_w 1796458018642621798
      // 37c: lload 4
      // 37e: lxor
      // 37f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: goto 392
      // 387: ldc2_w -1405206019560920925
      // 38a: lload 4
      // 38c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: athrow
      // 392: areturn
      // 393: aload 0
      // 394: lload 7
      // 396: aload 14
      // 398: aload 15
      // 39a: aload 6
      // 39c: ldc2_w -1210329798921297513
      // 39f: lload 4
      // 3a1: invokedynamic l (Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: astore 16
      // 3a8: aload 16
      // 3aa: sipush 12441
      // 3ad: ldc2_w 5100185492062082155
      // 3b0: lload 4
      // 3b2: lxor
      // 3b3: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: aload 16
      // 3ba: invokevirtual java/lang/String.length ()I
      // 3bd: iload 12
      // 3bf: iadd
      // 3c0: lload 9
      // 3c2: sipush 24630
      // 3c5: ldc2_w 4790174975657821400
      // 3c8: lload 4
      // 3ca: lxor
      // 3cb: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d0: bipush 5
      // 3d1: anewarray 134
      // 3d4: dup_x1
      // 3d5: swap
      // 3d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d9: bipush 4
      // 3da: swap
      // 3db: aastore
      // 3dc: dup_x2
      // 3dd: dup_x2
      // 3de: pop
      // 3df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e2: bipush 3
      // 3e3: swap
      // 3e4: aastore
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3ea: bipush 2
      // 3eb: swap
      // 3ec: aastore
      // 3ed: dup_x1
      // 3ee: swap
      // 3ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f2: bipush 1
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x1
      // 3f6: swap
      // 3f7: bipush 0
      // 3f8: swap
      // 3f9: aastore
      // 3fa: ldc2_w -1350465534422947706
      // 3fd: lload 4
      // 3ff: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: areturn
   }

   private boolean E(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/String
      // 021: astore 2
      // 022: pop
      // 023: getstatic com/zelix/_fm.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 3384720005522
      // 02e: lxor
      // 02f: dup2
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 7
      // 036: dup2
      // 037: bipush 32
      // 039: lshl
      // 03a: bipush 48
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 8
      // 040: dup2
      // 041: bipush 48
      // 043: lshl
      // 044: bipush 48
      // 046: lushr
      // 047: l2i
      // 048: istore 9
      // 04a: pop2
      // 04b: pop2
      // 04c: aload 6
      // 04e: ldc "["
      // 050: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 053: bipush 1
      // 054: iadd
      // 055: istore 11
      // 057: ldc2_w 5164136513345083848
      // 05a: lload 3
      // 05b: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 5
      // 062: ldc "["
      // 064: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 067: bipush 1
      // 068: iadd
      // 069: istore 12
      // 06b: aload 6
      // 06d: iload 11
      // 06f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 072: astore 13
      // 074: istore 10
      // 076: aload 5
      // 078: iload 12
      // 07a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 07d: astore 14
      // 07f: iload 11
      // 081: iload 12
      // 083: iload 10
      // 085: ifeq 0a8
      // 088: if_icmpge 0a4
      // 08b: goto 098
      // 08e: ldc2_w 4852028248357209993
      // 091: lload 3
      // 092: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: bipush 0
      // 099: ireturn
      // 09a: ldc2_w 4852028248357209993
      // 09d: lload 3
      // 09e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 11
      // 0a6: iload 12
      // 0a8: iload 10
      // 0aa: lload 3
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 0e8
      // 0b0: ifeq 0e6
      // 0b3: if_icmple 0e0
      // 0b6: goto 0c3
      // 0b9: ldc2_w 4852028248357209993
      // 0bc: lload 3
      // 0bd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: aload 14
      // 0c5: sipush 26745
      // 0c8: ldc2_w 1796413301198084684
      // 0cb: lload 3
      // 0cc: lxor
      // 0cd: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d5: ireturn
      // 0d6: ldc2_w 4852028248357209993
      // 0d9: lload 3
      // 0da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: aload 13
      // 0e2: invokevirtual java/lang/String.length ()I
      // 0e5: bipush 1
      // 0e6: iload 10
      // 0e8: ifeq 15f
      // 0eb: if_icmpne 141
      // 0ee: goto 0fb
      // 0f1: ldc2_w 4852028248357209993
      // 0f4: lload 3
      // 0f5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 14
      // 0fd: invokevirtual java/lang/String.length ()I
      // 100: bipush 1
      // 101: lload 3
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 15f
      // 107: iload 10
      // 109: ifeq 15f
      // 10c: goto 119
      // 10f: ldc2_w 4852028248357209993
      // 112: lload 3
      // 113: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: lload 3
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: iflt 148
      // 11f: if_icmpne 141
      // 122: goto 12f
      // 125: ldc2_w 4852028248357209993
      // 128: lload 3
      // 129: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 13
      // 131: aload 14
      // 133: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 136: ireturn
      // 137: ldc2_w 4852028248357209993
      // 13a: lload 3
      // 13b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 13
      // 143: invokevirtual java/lang/String.length ()I
      // 146: iload 10
      // 148: lload 3
      // 149: lconst_0
      // 14a: lcmp
      // 14b: iflt 152
      // 14e: ifeq 19e
      // 151: bipush 1
      // 152: goto 15f
      // 155: ldc2_w 4852028248357209993
      // 158: lload 3
      // 159: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: lconst_0
      // 161: lcmp
      // 162: iflt 16f
      // 165: if_icmpeq 190
      // 168: aload 14
      // 16a: invokevirtual java/lang/String.length ()I
      // 16d: iload 10
      // 16f: ifeq 1ae
      // 172: goto 17f
      // 175: ldc2_w 4852028248357209993
      // 178: lload 3
      // 179: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: bipush 1
      // 180: if_icmpne 19f
      // 183: goto 190
      // 186: ldc2_w 4852028248357209993
      // 189: lload 3
      // 18a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: bipush 0
      // 191: goto 19e
      // 194: ldc2_w 4852028248357209993
      // 197: lload 3
      // 198: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: ireturn
      // 19f: aload 0
      // 1a0: aload 13
      // 1a2: iload 7
      // 1a4: aload 14
      // 1a6: aload 2
      // 1a7: iload 8
      // 1a9: iload 9
      // 1ab: invokevirtual com/zelix/_fm.w (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)Z
      // 1ae: ireturn
   }

   Integer B(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 65557299907764L;
      return (Integer)this.s.remove(x44.a<"u">(new Object[]{var3}, -3054595243131869666L, var1));
   }

   public _ug b(Object[] var1) {
      return this.b;
   }

   boolean z(long var1, n var3, n var4, String var5) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 55604581006020L;
      int var6 = (int)((var1 ^ 55604581006020L) >>> 32);
      int var7 = (int)((var1 ^ 55604581006020L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      return this.w(var3.j(), var6, var4.j(), var5, var7, var8);
   }

   public boolean w(String param1, int param2, String param3, String param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
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
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_fm.a J
      // 01c: lxor
      // 01d: lstore 7
      // 01f: lload 7
      // 021: dup2
      // 022: ldc2_w 31676933751750
      // 025: lxor
      // 026: lstore 9
      // 028: dup2
      // 029: ldc2_w 69150432455777
      // 02c: lxor
      // 02d: lstore 11
      // 02f: dup2
      // 030: ldc2_w 31051549455570
      // 033: lxor
      // 034: lstore 13
      // 036: dup2
      // 037: ldc2_w 70719739656765
      // 03a: lxor
      // 03b: lstore 15
      // 03d: dup2
      // 03e: ldc2_w 3384720005522
      // 041: lxor
      // 042: lstore 17
      // 044: dup2
      // 045: ldc2_w 43091442751336
      // 048: lxor
      // 049: dup2
      // 04a: bipush 32
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 19
      // 050: dup2
      // 051: bipush 32
      // 053: lshl
      // 054: bipush 48
      // 056: lushr
      // 057: l2i
      // 058: istore 20
      // 05a: dup2
      // 05b: bipush 48
      // 05d: lshl
      // 05e: bipush 48
      // 060: lushr
      // 061: l2i
      // 062: istore 21
      // 064: pop2
      // 065: dup2
      // 066: ldc2_w 102543840057741
      // 069: lxor
      // 06a: lstore 22
      // 06c: pop2
      // 06d: ldc2_w -2047667470590605184
      // 070: lload 7
      // 072: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: istore 24
      // 079: aload 1
      // 07a: iload 24
      // 07c: ifne 0ae
      // 07f: aload 3
      // 080: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 083: ifeq 0a1
      // 086: goto 094
      // 089: ldc2_w -2014343596374253353
      // 08c: lload 7
      // 08e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: bipush 1
      // 095: ireturn
      // 096: ldc2_w -2014343596374253353
      // 099: lload 7
      // 09b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: lload 15
      // 0a3: aload 1
      // 0a4: invokestatic com/zelix/_fm.a (JLjava/lang/String;)Ljava/lang/String;
      // 0a7: astore 1
      // 0a8: lload 15
      // 0aa: aload 3
      // 0ab: invokestatic com/zelix/_fm.a (JLjava/lang/String;)Ljava/lang/String;
      // 0ae: astore 3
      // 0af: aconst_null
      // 0b0: astore 25
      // 0b2: aconst_null
      // 0b3: astore 26
      // 0b5: aload 0
      // 0b6: lload 11
      // 0b8: invokevirtual com/zelix/_fm.H (J)Ljava/lang/Integer;
      // 0bb: astore 27
      // 0bd: aload 1
      // 0be: bipush 0
      // 0bf: invokevirtual java/lang/String.charAt (I)C
      // 0c2: sipush 7816
      // 0c5: ldc2_w 2976373858723115547
      // 0c8: lload 7
      // 0ca: lxor
      // 0cb: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: iload 24
      // 0d2: ifne 1e2
      // 0d5: if_icmpne 1b7
      // 0d8: goto 0e6
      // 0db: ldc2_w -2014343596374253353
      // 0de: lload 7
      // 0e0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 3
      // 0e7: bipush 0
      // 0e8: invokevirtual java/lang/String.charAt (I)C
      // 0eb: iload 24
      // 0ed: ifne 158
      // 0f0: goto 0fe
      // 0f3: ldc2_w -2014343596374253353
      // 0f6: lload 7
      // 0f8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: sipush 24630
      // 101: ldc2_w 4790202145844481196
      // 104: lload 7
      // 106: lxor
      // 107: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: if_icmpne 159
      // 10f: goto 11d
      // 112: ldc2_w -2014343596374253353
      // 115: lload 7
      // 117: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 0
      // 11e: aload 1
      // 11f: aload 3
      // 120: lload 17
      // 122: aload 4
      // 124: bipush 4
      // 125: anewarray 134
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 3
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x2
      // 12e: dup_x2
      // 12f: pop
      // 130: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 140: ldc2_w -139824444173055383
      // 143: lload 7
      // 145: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: goto 158
      // 14d: ldc2_w -2014343596374253353
      // 150: lload 7
      // 152: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: ireturn
      // 159: aload 0
      // 15a: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 15d: aload 3
      // 15e: aload 27
      // 160: aload 4
      // 162: lload 22
      // 164: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 167: astore 26
      // 169: aload 26
      // 16b: lload 9
      // 16d: invokevirtual com/zelix/hz.d (J)Z
      // 170: iload 24
      // 172: ifne 1b6
      // 175: ifeq 1a4
      // 178: goto 186
      // 17b: ldc2_w -2014343596374253353
      // 17e: lload 7
      // 180: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 3
      // 187: sipush 17627
      // 18a: ldc2_w 5800843645467840950
      // 18d: lload 7
      // 18f: lxor
      // 190: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 198: ireturn
      // 199: ldc2_w -2014343596374253353
      // 19c: lload 7
      // 19e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 3
      // 1a5: sipush 19459
      // 1a8: ldc2_w 5675067124222351725
      // 1ab: lload 7
      // 1ad: lxor
      // 1ae: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b6: ireturn
      // 1b7: aload 3
      // 1b8: bipush 0
      // 1b9: invokevirtual java/lang/String.charAt (I)C
      // 1bc: iload 24
      // 1be: iload 5
      // 1c0: ifle 1d4
      // 1c3: ifne 1e6
      // 1c6: sipush 24630
      // 1c9: ldc2_w 4790202145844481196
      // 1cc: lload 7
      // 1ce: lxor
      // 1cf: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: goto 1e2
      // 1d7: ldc2_w -2014343596374253353
      // 1da: lload 7
      // 1dc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: if_icmpne 1e7
      // 1e5: bipush 0
      // 1e6: ireturn
      // 1e7: aload 0
      // 1e8: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 1eb: aload 1
      // 1ec: aload 27
      // 1ee: aload 4
      // 1f0: lload 22
      // 1f2: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 1f5: astore 25
      // 1f7: aload 0
      // 1f8: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 1fb: aload 3
      // 1fc: aload 27
      // 1fe: aload 4
      // 200: lload 22
      // 202: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 205: astore 26
      // 207: aload 25
      // 209: lload 9
      // 20b: invokevirtual com/zelix/hz.d (J)Z
      // 20e: iload 24
      // 210: iload 2
      // 211: iflt 2a1
      // 214: ifne 29f
      // 217: ifeq 298
      // 21a: goto 228
      // 21d: ldc2_w -2014343596374253353
      // 220: lload 7
      // 222: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: athrow
      // 228: aload 26
      // 22a: lload 9
      // 22c: invokevirtual com/zelix/hz.d (J)Z
      // 22f: iload 24
      // 231: ifne 297
      // 234: goto 242
      // 237: ldc2_w -2014343596374253353
      // 23a: lload 7
      // 23c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: athrow
      // 242: ifeq 285
      // 245: goto 253
      // 248: ldc2_w -2014343596374253353
      // 24b: lload 7
      // 24d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 0
      // 254: aload 1
      // 255: lload 13
      // 257: aload 3
      // 258: bipush 3
      // 259: anewarray 134
      // 25c: dup_x1
      // 25d: swap
      // 25e: bipush 2
      // 25f: swap
      // 260: aastore
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 1
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 0
      // 26d: swap
      // 26e: aastore
      // 26f: ldc2_w -1884358718195065746
      // 272: lload 7
      // 274: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: ireturn
      // 27a: ldc2_w -2014343596374253353
      // 27d: lload 7
      // 27f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: athrow
      // 285: aload 3
      // 286: sipush 19753
      // 289: ldc2_w 8902500391419697221
      // 28c: lload 7
      // 28e: lxor
      // 28f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 297: ireturn
      // 298: aload 26
      // 29a: lload 9
      // 29c: invokevirtual com/zelix/hz.d (J)Z
      // 29f: iload 24
      // 2a1: ifne 382
      // 2a4: ifeq 374
      // 2a7: goto 2b5
      // 2aa: ldc2_w -2014343596374253353
      // 2ad: lload 7
      // 2af: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: ldc2_w -40734474788278692
      // 2b8: lload 7
      // 2ba: invokedynamic i (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: iload 24
      // 2c1: ifne 373
      // 2c4: goto 2d2
      // 2c7: ldc2_w -2014343596374253353
      // 2ca: lload 7
      // 2cc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: athrow
      // 2d2: ifeq 34d
      // 2d5: goto 2e3
      // 2d8: ldc2_w -2014343596374253353
      // 2db: lload 7
      // 2dd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: aload 0
      // 2e4: aload 1
      // 2e5: lload 13
      // 2e7: aload 3
      // 2e8: bipush 3
      // 2e9: anewarray 134
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: bipush 2
      // 2ef: swap
      // 2f0: aastore
      // 2f1: dup_x2
      // 2f2: dup_x2
      // 2f3: pop
      // 2f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f7: bipush 1
      // 2f8: swap
      // 2f9: aastore
      // 2fa: dup_x1
      // 2fb: swap
      // 2fc: bipush 0
      // 2fd: swap
      // 2fe: aastore
      // 2ff: ldc2_w -1884358718195065746
      // 302: lload 7
      // 304: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: iload 24
      // 30b: ifne 34c
      // 30e: goto 31c
      // 311: ldc2_w -2014343596374253353
      // 314: lload 7
      // 316: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: athrow
      // 31c: ifne 34b
      // 31f: goto 32d
      // 322: ldc2_w -2014343596374253353
      // 325: lload 7
      // 327: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: athrow
      // 32d: aload 1
      // 32e: sipush 19753
      // 331: ldc2_w 8902500391419697221
      // 334: lload 7
      // 336: lxor
      // 337: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_fm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33f: ireturn
      // 340: ldc2_w -2014343596374253353
      // 343: lload 7
      // 345: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: athrow
      // 34b: bipush 1
      // 34c: ireturn
      // 34d: aload 0
      // 34e: aload 1
      // 34f: lload 13
      // 351: aload 3
      // 352: bipush 3
      // 353: anewarray 134
      // 356: dup_x1
      // 357: swap
      // 358: bipush 2
      // 359: swap
      // 35a: aastore
      // 35b: dup_x2
      // 35c: dup_x2
      // 35d: pop
      // 35e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 361: bipush 1
      // 362: swap
      // 363: aastore
      // 364: dup_x1
      // 365: swap
      // 366: bipush 0
      // 367: swap
      // 368: aastore
      // 369: ldc2_w -1884358718195065746
      // 36c: lload 7
      // 36e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: ireturn
      // 374: aload 0
      // 375: aload 1
      // 376: iload 19
      // 378: iload 20
      // 37a: i2c
      // 37b: aload 3
      // 37c: iload 21
      // 37e: i2s
      // 37f: invokevirtual com/zelix/_fm.H (Ljava/lang/String;ICLjava/lang/String;S)Z
      // 382: ireturn
   }

   Integer H(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 92253762530364L;
      return (Integer)this.s.get(x44.a<"u">(new Object[]{var3}, -5398815709831985514L, var1));
   }

   boolean O(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/n
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/_fm.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 73413744742385
      // 27: lxor
      // 28: lstore 6
      // 2a: dup2
      // 2b: ldc2_w 106583685685334
      // 2e: lxor
      // 2f: lstore 8
      // 31: dup2
      // 32: ldc2_w 33372377904650
      // 35: lxor
      // 36: lstore 10
      // 38: dup2
      // 39: ldc2_w 3612023854522
      // 3c: lxor
      // 3d: lstore 12
      // 3f: pop2
      // 40: ldc2_w -1179266613059517257
      // 43: lload 2
      // 44: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: aload 4
      // 4b: invokevirtual com/zelix/n.j ()Ljava/lang/String;
      // 4e: lload 10
      // 50: dup2_x1
      // 51: pop2
      // 52: invokestatic com/zelix/_fm.a (JLjava/lang/String;)Ljava/lang/String;
      // 55: astore 15
      // 57: istore 14
      // 59: aload 15
      // 5b: bipush 0
      // 5c: invokevirtual java/lang/String.charAt (I)C
      // 5f: iload 14
      // 61: ifne 8f
      // 64: sipush 24630
      // 67: ldc2_w 4790257098402349211
      // 6a: lload 2
      // 6b: lxor
      // 6c: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: if_icmpne 90
      // 74: goto 81
      // 77: ldc2_w -1712279214779487008
      // 7a: lload 2
      // 7b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 0
      // 82: goto 8f
      // 85: ldc2_w -1712279214779487008
      // 88: lload 2
      // 89: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: ireturn
      // 90: aload 0
      // 91: getfield com/zelix/_fm.b Lcom/zelix/_ug;
      // 94: aload 15
      // 96: aload 0
      // 97: lload 8
      // 99: invokevirtual com/zelix/_fm.H (J)Ljava/lang/Integer;
      // 9c: aload 5
      // 9e: lload 12
      // a0: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // a3: astore 16
      // a5: aload 16
      // a7: lload 6
      // a9: invokevirtual com/zelix/hz.d (J)Z
      // ac: ireturn
   }

   public static String a(long param0, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_fm.a J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w 2595746335130106471
      // 09: lload 0
      // 0a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 2
      // 10: invokevirtual java/lang/String.length ()I
      // 13: istore 4
      // 15: istore 3
      // 16: aload 2
      // 17: iload 3
      // 18: ifeq 7d
      // 1b: bipush 0
      // 1c: invokevirtual java/lang/String.charAt (I)C
      // 1f: sipush 18551
      // 22: ldc2_w 5741583368538333215
      // 25: lload 0
      // 26: lxor
      // 27: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: if_icmpne 7c
      // 2f: goto 3c
      // 32: ldc2_w 2376386273993778214
      // 35: lload 0
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 2
      // 3d: iload 3
      // 3e: ifeq 7d
      // 41: goto 4e
      // 44: ldc2_w 2376386273993778214
      // 47: lload 0
      // 48: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: iload 4
      // 50: bipush 1
      // 51: isub
      // 52: invokevirtual java/lang/String.charAt (I)C
      // 55: sipush 24258
      // 58: ldc2_w 8282119684174558892
      // 5b: lload 0
      // 5c: lxor
      // 5d: invokedynamic r (IJ)I bsm=com/zelix/_fm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: if_icmpne 7c
      // 65: goto 72
      // 68: ldc2_w 2376386273993778214
      // 6b: lload 0
      // 6c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 2
      // 73: bipush 1
      // 74: iload 4
      // 76: bipush 1
      // 77: isub
      // 78: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 7b: astore 2
      // 7c: aload 2
      // 7d: areturn
   }

   static {
      long var11 = a ^ 107597895857339L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "£-ìMÇ\u0090e\u008c5\u000b\u0005wôw~\u0001\u008c}´¼Tô\u000b\u0013v\\\t&ÈPäª\u008b¥*2GEGpT²\u0082SMÌíõ(Ñ\u001a¼Û\u0015\u000e\u0015êgý\u0093@\u0089£¸[Á'\u0082ï\u009aÔ£éQ\u008c¸\u008eõ\u0002ÀîCý\u0083±ÒWh?(UE¸(\u00839Êës¯f í®\u00804ñ\u009a(øBb¿\föË©\u0090eíI\u0081.ß\u0092áO¼\u00944(<A\u009bCçù=£¯-\u0087hØ¬à>ÁI|\u0014.&ÁkýÂ{\u009dÊMnÆ|\u0086ï\u001b=ä¾\b (?ÇÎ\u0019\u008f\u0002.\tyy\u008f{q\u0014à®\u0081\u008crj«Tn·¯ägd÷\u0082Ù( ¨|\u0081ÇïXh\u009fëm]\u009eÛmðrnÇ+#\n÷zR©¡KÑ$ÓfTô\u0017TR\u0001Ú3";
      int var19 = "£-ìMÇ\u0090e\u008c5\u000b\u0005wôw~\u0001\u008c}´¼Tô\u000b\u0013v\\\t&ÈPäª\u008b¥*2GEGpT²\u0082SMÌíõ(Ñ\u001a¼Û\u0015\u000e\u0015êgý\u0093@\u0089£¸[Á'\u0082ï\u009aÔ£éQ\u008c¸\u008eõ\u0002ÀîCý\u0083±ÒWh?(UE¸(\u00839Êës¯f í®\u00804ñ\u009a(øBb¿\föË©\u0090eíI\u0081.ß\u0092áO¼\u00944(<A\u009bCçù=£¯-\u0087hØ¬à>ÁI|\u0014.&ÁkýÂ{\u009dÊMnÆ|\u0086ï\u001b=ä¾\b (?ÇÎ\u0019\u008f\u0002.\tyy\u008f{q\u0014à®\u0081\u008crj«Tn·¯ägd÷\u0082Ù( ¨|\u0081ÇïXh\u009fëm]\u009eÛmðrnÇ+#\n÷zR©¡KÑ$ÓfTô\u0017TR\u0001Ú3"
         .length();
      char var16 = '0';
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
                     d = var20;
                     e = new String[8];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "¬Cùb\u009bjJ3Ôú@\u0006¼W\r³ø¬L\u0018H\u0097I\u0080PdÒ\u0002\u001c\u0080'_îÖ×þ\u0010\nCn-?OV\u0094\u0082ñ,É\u0095\u009eÂ¿~u{ó\u0087\u0083Å×¾\u0086Ói µ\u00ad\u0088oÍ\u0001¥ø+¬[\u0099ôçþ\u008dêYÆ{\u008bØ\u00919\u00adUvQtÈ\u0091q\u0010*«\u0097ut\u0019|>\u0098Îew]{êÉ\u00042 ¸\u0087ØÃ¬\\å¬r\u0010\u001a}jø\u0083+õjOAêÇ3\u0001\u0088\u0019";
                     int var5 = "¬Cùb\u009bjJ3Ôú@\u0006¼W\r³ø¬L\u0018H\u0097I\u0080PdÒ\u0002\u001c\u0080'_îÖ×þ\u0010\nCn-?OV\u0094\u0082ñ,É\u0095\u009eÂ¿~u{ó\u0087\u0083Å×¾\u0086Ói µ\u00ad\u0088oÍ\u0001¥ø+¬[\u0099ôçþ\u008dêYÆ{\u008bØ\u00919\u00adUvQtÈ\u0091q\u0010*«\u0097ut\u0019|>\u0098Îew]{êÉ\u00042 ¸\u0087ØÃ¬\\å¬r\u0010\u001a}jø\u0083+õjOAêÇ3\u0001\u0088\u0019"
                        .length();
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
                                    g = var6;
                                    h = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Té$\u0091áu\"¢4ìÁºK\u0015½À";
                                 var5 = "Té$\u0091áu\"¢4ìÁºK\u0015½À".length();
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

                  var17 = "¬\u0086v\u0099\u001eóh\u0012\u0004+Ô\u0084èXT]\u009d\rÁ¾\u0082v\t\u0085wGO´\u0091\u0007\u0080,él\u001a\u0090RË\u007f®(»p\u008b§ÃÞ]\u0004\u0082/ò\u008aãW};\u0000\nàx2(æÎH\u001fÈÕ\u009e\u008e)eÖ§ðH\u0085È'h";
                  var19 = "¬\u0086v\u0099\u001eóh\u0012\u0004+Ô\u0084èXT]\u009d\rÁ¾\u0082v\t\u0085wGO´\u0091\u0007\u0080,él\u001a\u0090RË\u007f®(»p\u008b§ÃÞ]\u0004\u0082/ò\u008aãW};\u0000\nàx2(æÎH\u001fÈÕ\u009e\u008e)eÖ§ðH\u0085È'h"
                     .length();
                  var16 = '(';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31567;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_fm", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("com/zelix/_fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17076;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_fm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/_fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
