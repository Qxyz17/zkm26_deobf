package com.zelix;

import java.io.DataOutputStream;
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

public abstract class ji extends jx implements up, gm {
   bg L;
   int S;
   xb b;
   private static final long c = prr.a(-1087223876289712113L, -510676611010076296L, MethodHandles.lookup().lookupClass()).a(168975719377414L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] k;
   private static final Integer[] m;
   private static final Map n;

   public void E(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Set
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 5
      // 02b: pop
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 13477635325569
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 3797679037758
      // 038: lxor
      // 039: lstore 10
      // 03b: pop2
      // 03c: ldc2_w 3122465035675988522
      // 03f: lload 2
      // 040: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: istore 12
      // 047: aload 0
      // 048: iload 12
      // 04a: ifeq 0a6
      // 04d: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 050: ifnull 0a5
      // 053: goto 060
      // 056: ldc2_w 3403787040638171233
      // 059: lload 2
      // 05a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 064: aload 7
      // 066: aload 4
      // 068: lload 8
      // 06a: aload 6
      // 06c: aload 5
      // 06e: bipush 5
      // 06f: anewarray 453
      // 072: dup_x1
      // 073: swap
      // 074: bipush 4
      // 075: swap
      // 076: aastore
      // 077: dup_x1
      // 078: swap
      // 079: bipush 3
      // 07a: swap
      // 07b: aastore
      // 07c: dup_x2
      // 07d: dup_x2
      // 07e: pop
      // 07f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 082: bipush 2
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: bipush 1
      // 088: swap
      // 089: aastore
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: ldc2_w 3499016626979359022
      // 092: lload 2
      // 093: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: goto 0a5
      // 09b: ldc2_w 3403787040638171233
      // 09e: lload 2
      // 09f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: ldc2_w 3598909097609658737
      // 0a9: lload 2
      // 0aa: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: lload 10
      // 0b1: bipush 1
      // 0b2: anewarray 453
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: ldc2_w 3594744571716654192
      // 0c1: lload 2
      // 0c2: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: astore 13
      // 0c9: aload 0
      // 0ca: ldc2_w 3598909097609658737
      // 0cd: lload 2
      // 0ce: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual com/zelix/xb.A ()Ljava/lang/String;
      // 0d6: sipush 3162
      // 0d9: ldc2_w 7757651839520465679
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/ji.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e6: iload 12
      // 0e8: ifeq 12d
      // 0eb: ifeq 117
      // 0ee: goto 0fb
      // 0f1: ldc2_w 3403787040638171233
      // 0f4: lload 2
      // 0f5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 7
      // 0fd: aload 13
      // 0ff: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 104: pop
      // 105: iload 12
      // 107: ifne 12e
      // 10a: goto 117
      // 10d: ldc2_w 3403787040638171233
      // 110: lload 2
      // 111: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 4
      // 119: aload 13
      // 11b: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 120: goto 12d
      // 123: ldc2_w 3403787040638171233
      // 126: lload 2
      // 127: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: pop
      // 12e: return
   }

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      return m44.a<"p">(this, 3183455761110736045L, var2).X();
   }

   public xb y(Object[] var1) {
      xb var4 = (xb)var1[0];
      long var2 = (Long)var1[1];
      xb var5 = m44.a<"p">(this, 5428446479306357717L, var2);
      m44.a<"r">(this, var4, 5428446479306357717L, var2);
      return var5;
   }

   public ji(int var1, to var2, int var3, xb var4, long var5) {
      var5 = c ^ var5;
      super(var1, var2);
      m44.a<"q">(this, var3, 7570766579237393106L, var5);
      m44.a<"q">(this, var4, 8288531459324068742L, var5);
   }

   public js[] b(Object[] param1) {
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
      // 0c: getstatic com/zelix/ji.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8365997889795665255
      // 15: lload 2
      // 16: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 21: iload 4
      // 23: ifeq 47
      // 26: ifnull 57
      // 29: goto 36
      // 2c: ldc2_w -8102092204852094766
      // 2f: lload 2
      // 30: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 3a: goto 47
      // 3d: ldc2_w -8102092204852094766
      // 40: lload 2
      // 41: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: bipush 0
      // 48: anewarray 453
      // 4b: ldc2_w -8063986589991927388
      // 4e: lload 2
      // 4f: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/js; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: goto 58
      // 57: aconst_null
      // 58: areturn
   }

   public String m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var10001 = var2 ^ 59846206245510L;
      int var4 = (int)((var2 ^ 59846206245510L) >>> 48);
      int var5 = (int)((var2 ^ 59846206245510L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return m44.a<"t">(m44.a<"u">(this, -6561548423286582160L, var2), (char)var4, var5, (short)var6, -4944003568933623353L, var2);
   }

   int G(Object[] param1) {
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
      // 0c: getstatic com/zelix/ji.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 20300351044565
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -4742945752180336439
      // 1e: lload 2
      // 1f: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifne 67
      // 2c: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 2f: ifnull 66
      // 32: goto 3f
      // 35: ldc2_w -6588783471839317038
      // 38: lload 2
      // 39: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 43: lload 4
      // 45: bipush 1
      // 46: anewarray 453
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: ldc2_w -4665557174837412751
      // 55: lload 2
      // 56: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: ireturn
      // 5c: ldc2_w -6588783471839317038
      // 5f: lload 2
      // 60: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: ldc2_w -6893680944958481514
      // 6a: lload 2
      // 6b: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: ireturn
   }

   public void Z(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/Set
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 7
      // 02b: pop
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 106390386941352
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 52592986195593
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 67027877001421
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 114829390115521
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 109454147895261
      // 04d: lxor
      // 04e: dup2
      // 04f: bipush 16
      // 051: lushr
      // 052: lstore 16
      // 054: dup2
      // 055: bipush 48
      // 057: lshl
      // 058: bipush 48
      // 05a: lushr
      // 05b: l2i
      // 05c: istore 18
      // 05e: pop2
      // 05f: dup2
      // 060: ldc2_w 123233840088121
      // 063: lxor
      // 064: lstore 19
      // 066: dup2
      // 067: ldc2_w 125814499056208
      // 06a: lxor
      // 06b: lstore 21
      // 06d: dup2
      // 06e: ldc2_w 110025852742022
      // 071: lxor
      // 072: dup2
      // 073: bipush 48
      // 075: lushr
      // 076: l2i
      // 077: istore 23
      // 079: dup2
      // 07a: bipush 16
      // 07c: lshl
      // 07d: bipush 48
      // 07f: lushr
      // 080: l2i
      // 081: istore 24
      // 083: dup2
      // 084: bipush 32
      // 086: lshl
      // 087: bipush 32
      // 089: lushr
      // 08a: l2i
      // 08b: istore 25
      // 08d: pop2
      // 08e: dup2
      // 08f: ldc2_w 6092263193924
      // 092: lxor
      // 093: lstore 26
      // 095: dup2
      // 096: ldc2_w 22392832589051
      // 099: lxor
      // 09a: lstore 28
      // 09c: pop2
      // 09d: ldc2_w -2900595962250096960
      // 0a0: lload 2
      // 0a1: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: istore 30
      // 0a8: aload 0
      // 0a9: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 0ac: iload 30
      // 0ae: ifeq 0d2
      // 0b1: ifnull 106
      // 0b4: goto 0c1
      // 0b7: ldc2_w -3182192840847588213
      // 0ba: lload 2
      // 0bb: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 0c5: goto 0d2
      // 0c8: ldc2_w -3182192840847588213
      // 0cb: lload 2
      // 0cc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 5
      // 0d4: aload 4
      // 0d6: lload 10
      // 0d8: aload 6
      // 0da: aload 7
      // 0dc: bipush 5
      // 0dd: anewarray 453
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 4
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 3
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 2
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: ldc2_w -3704091918601813906
      // 100: lload 2
      // 101: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: aconst_null
      // 107: astore 31
      // 109: aload 0
      // 10a: lload 12
      // 10c: invokevirtual com/zelix/ji.A (J)Lcom/zelix/va;
      // 10f: ldc2_w -3473318886503313023
      // 112: lload 2
      // 113: invokedynamic l (JJ)Lcom/zelix/va; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokevirtual com/zelix/va.equals (Ljava/lang/Object;)Z
      // 11b: iload 30
      // 11d: lload 2
      // 11e: lconst_0
      // 11f: lcmp
      // 120: ifle 171
      // 123: ifeq 16f
      // 126: ifeq 15d
      // 129: goto 136
      // 12c: ldc2_w -3182192840847588213
      // 12f: lload 2
      // 130: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 0
      // 137: ldc2_w -3667092286646256229
      // 13a: lload 2
      // 13b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: lload 26
      // 142: bipush 1
      // 143: anewarray 453
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w -3277576446020060474
      // 152: lload 2
      // 153: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: astore 31
      // 15a: goto 21e
      // 15d: aload 0
      // 15e: lload 12
      // 160: invokevirtual com/zelix/ji.A (J)Lcom/zelix/va;
      // 163: ldc2_w -3667963217596165136
      // 166: lload 2
      // 167: invokedynamic l (JJ)Lcom/zelix/va; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: invokevirtual com/zelix/va.equals (Ljava/lang/Object;)Z
      // 16f: iload 30
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 1d2
      // 177: ifeq 1d1
      // 17a: ifeq 1d0
      // 17d: goto 18a
      // 180: ldc2_w -3182192840847588213
      // 183: lload 2
      // 184: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: new java/util/ArrayList
      // 18d: dup
      // 18e: bipush 1
      // 18f: invokespecial java/util/ArrayList.<init> (I)V
      // 192: astore 31
      // 194: aload 0
      // 195: ldc2_w -3667092286646256229
      // 198: lload 2
      // 199: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokevirtual com/zelix/xb.X ()Ljava/lang/String;
      // 1a1: lload 16
      // 1a3: iload 18
      // 1a5: i2c
      // 1a6: invokestatic com/zelix/js.m (Ljava/lang/String;JC)Lcom/zelix/_f;
      // 1a9: astore 32
      // 1ab: lload 2
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: iflt 1c0
      // 1b1: aload 32
      // 1b3: ifnull 1cd
      // 1b6: aload 31
      // 1b8: aload 32
      // 1ba: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1bf: pop
      // 1c0: goto 1cd
      // 1c3: ldc2_w -3182192840847588213
      // 1c6: lload 2
      // 1c7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: goto 21e
      // 1d0: bipush 0
      // 1d1: bipush 1
      // 1d2: anewarray 7
      // 1d5: dup
      // 1d6: bipush 0
      // 1d7: new java/lang/StringBuilder
      // 1da: dup
      // 1db: invokespecial java/lang/StringBuilder.<init> ()V
      // 1de: sipush 3548
      // 1e1: ldc2_w 9119709198731812455
      // 1e4: lload 2
      // 1e5: lxor
      // 1e6: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/ji.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ee: aload 0
      // 1ef: lload 12
      // 1f1: invokevirtual com/zelix/ji.A (J)Lcom/zelix/va;
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f7: sipush 19655
      // 1fa: ldc2_w 6406579439039930237
      // 1fd: lload 2
      // 1fe: lxor
      // 1ff: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/ji.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: aload 0
      // 208: lload 19
      // 20a: invokevirtual com/zelix/ji.L (J)Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: ldc "'"
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 218: aastore
      // 219: lload 28
      // 21b: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 21e: aload 0
      // 21f: lload 21
      // 221: bipush 1
      // 222: anewarray 453
      // 225: dup_x2
      // 226: dup_x2
      // 227: pop
      // 228: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22b: bipush 0
      // 22c: swap
      // 22d: aastore
      // 22e: ldc2_w -3383541923960661569
      // 231: lload 2
      // 232: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: astore 32
      // 239: aload 32
      // 23b: lload 14
      // 23d: invokevirtual com/zelix/_v.z (J)Z
      // 240: iload 30
      // 242: lload 2
      // 243: lconst_0
      // 244: lcmp
      // 245: iflt 364
      // 248: ifeq 362
      // 24b: ifeq 345
      // 24e: goto 25b
      // 251: ldc2_w -3182192840847588213
      // 254: lload 2
      // 255: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: aload 32
      // 25d: bipush 0
      // 25e: anewarray 453
      // 261: ldc2_w -2906720588415249616
      // 264: lload 2
      // 265: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: astore 33
      // 26c: new java/util/ArrayList
      // 26f: dup
      // 270: aload 31
      // 272: invokeinterface java/util/List.size ()I 1
      // 277: invokespecial java/util/ArrayList.<init> (I)V
      // 27a: astore 34
      // 27c: aload 31
      // 27e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 283: astore 35
      // 285: aload 35
      // 287: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28c: ifeq 33b
      // 28f: aload 35
      // 291: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 296: checkcast com/zelix/_f
      // 299: astore 36
      // 29b: aload 36
      // 29d: iload 23
      // 29f: i2c
      // 2a0: iload 24
      // 2a2: i2s
      // 2a3: iload 25
      // 2a5: invokevirtual com/zelix/_f.P (CSI)Z
      // 2a8: iload 30
      // 2aa: lload 2
      // 2ab: lconst_0
      // 2ac: lcmp
      // 2ad: iflt 2b5
      // 2b0: ifeq 362
      // 2b3: iload 30
      // 2b5: ifeq 335
      // 2b8: goto 2c5
      // 2bb: ldc2_w -3182192840847588213
      // 2be: lload 2
      // 2bf: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: athrow
      // 2c5: lload 2
      // 2c6: lconst_0
      // 2c7: lcmp
      // 2c8: ifle 328
      // 2cb: ifeq 31f
      // 2ce: goto 2db
      // 2d1: ldc2_w -3182192840847588213
      // 2d4: lload 2
      // 2d5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: aload 34
      // 2dd: aload 36
      // 2df: lload 8
      // 2e1: aload 33
      // 2e3: bipush 2
      // 2e4: anewarray 453
      // 2e7: dup_x1
      // 2e8: swap
      // 2e9: bipush 1
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x2
      // 2ed: dup_x2
      // 2ee: pop
      // 2ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f2: bipush 0
      // 2f3: swap
      // 2f4: aastore
      // 2f5: ldc2_w -3509684089029995715
      // 2f8: lload 2
      // 2f9: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: checkcast com/zelix/_f
      // 301: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 306: pop
      // 307: iload 30
      // 309: lload 2
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: iflt 338
      // 30f: ifne 336
      // 312: goto 31f
      // 315: ldc2_w -3182192840847588213
      // 318: lload 2
      // 319: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: aload 34
      // 321: aload 36
      // 323: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 328: goto 335
      // 32b: ldc2_w -3182192840847588213
      // 32e: lload 2
      // 32f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: athrow
      // 335: pop
      // 336: iload 30
      // 338: ifne 285
      // 33b: aload 34
      // 33d: lload 2
      // 33e: lconst_0
      // 33f: lcmp
      // 340: iflt 296
      // 343: astore 31
      // 345: aload 0
      // 346: ldc2_w -3667092286646256229
      // 349: lload 2
      // 34a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34f: invokevirtual com/zelix/xb.A ()Ljava/lang/String;
      // 352: sipush 9322
      // 355: ldc2_w 4865231627518064595
      // 358: lload 2
      // 359: lxor
      // 35a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/ji.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 362: iload 30
      // 364: ifeq 3a9
      // 367: ifeq 393
      // 36a: goto 377
      // 36d: ldc2_w -3182192840847588213
      // 370: lload 2
      // 371: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: athrow
      // 377: aload 5
      // 379: aload 31
      // 37b: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 380: pop
      // 381: iload 30
      // 383: ifne 3aa
      // 386: goto 393
      // 389: ldc2_w -3182192840847588213
      // 38c: lload 2
      // 38d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: aload 4
      // 395: aload 31
      // 397: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 39c: goto 3a9
      // 39f: ldc2_w -3182192840847588213
      // 3a2: lload 2
      // 3a3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: athrow
      // 3a9: pop
      // 3aa: return
   }

   public int j(Object[] param1) {
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
      // 0c: getstatic com/zelix/ji.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6589359131388099991
      // 15: lload 2
      // 16: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 0
      // 1c: ldc2_w -6853645276346150814
      // 1f: lload 2
      // 20: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: invokevirtual com/zelix/xb.X ()Ljava/lang/String;
      // 28: invokestatic com/zelix/js.Z (Ljava/lang/String;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: istore 4
      // 2f: aload 5
      // 31: ldc "V"
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: iload 4
      // 38: ifne 58
      // 3b: ifeq 57
      // 3e: goto 4b
      // 41: ldc2_w -4742361425920890510
      // 44: lload 2
      // 45: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: ldc2_w -4742361425920890510
      // 50: lload 2
      // 51: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 1
      // 58: ireturn
   }

   public String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 121561815039403L;
      return T(m44.a<"r">(this, 785873174889708135L, var2), var4);
   }

   public String z(char param1, int param2, short param3) {
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
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: lstore 4
      // 019: lload 4
      // 01b: dup2
      // 01c: ldc2_w 0
      // 01f: lxor
      // 020: dup2
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 6
      // 027: dup2
      // 028: bipush 16
      // 02a: lshl
      // 02b: bipush 32
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 7
      // 031: dup2
      // 032: bipush 48
      // 034: lshl
      // 035: bipush 48
      // 037: lushr
      // 038: l2i
      // 039: istore 8
      // 03b: pop2
      // 03c: dup2
      // 03d: ldc2_w 927831741151
      // 040: lxor
      // 041: lstore 9
      // 043: pop2
      // 044: new java/lang/StringBuilder
      // 047: dup
      // 048: invokespecial java/lang/StringBuilder.<init> ()V
      // 04b: astore 12
      // 04d: ldc2_w -1578066152563700483
      // 050: lload 4
      // 052: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: aload 12
      // 059: sipush 17837
      // 05c: ldc2_w 3779810060669960673
      // 05f: lload 4
      // 061: lxor
      // 062: invokedynamic q (IJ)I bsm=com/zelix/ji.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 06a: pop
      // 06b: aload 12
      // 06d: aload 0
      // 06e: ldc2_w -1263677410127651082
      // 071: lload 4
      // 073: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: iload 6
      // 07a: i2c
      // 07b: iload 7
      // 07d: iload 8
      // 07f: i2s
      // 080: ldc2_w -1016291118076140735
      // 083: lload 4
      // 085: invokedynamic r (Ljava/lang/Object;CISJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: pop
      // 08e: istore 11
      // 090: aload 12
      // 092: sipush 28126
      // 095: ldc2_w 222656026995779987
      // 098: lload 4
      // 09a: lxor
      // 09b: invokedynamic q (IJ)I bsm=com/zelix/ji.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0a3: pop
      // 0a4: aload 12
      // 0a6: sipush 9953
      // 0a9: ldc2_w 7587255016636814900
      // 0ac: lload 4
      // 0ae: lxor
      // 0af: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/ji.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: iload 11
      // 0b9: ifne 12a
      // 0bc: pop
      // 0bd: aload 0
      // 0be: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 0c1: ifnull 10c
      // 0c4: goto 0d2
      // 0c7: ldc2_w -1100058561410160666
      // 0ca: lload 4
      // 0cc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 12
      // 0d4: aload 0
      // 0d5: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 0d8: lload 9
      // 0da: bipush 1
      // 0db: anewarray 453
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -616116511841925456
      // 0ea: lload 4
      // 0ec: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: iload 1
      // 0f5: iflt 12d
      // 0f8: pop
      // 0f9: iload 11
      // 0fb: ifeq 12b
      // 0fe: goto 10c
      // 101: ldc2_w -1100058561410160666
      // 104: lload 4
      // 106: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: aload 12
      // 10e: aload 0
      // 10f: ldc2_w -837520605974196318
      // 112: lload 4
      // 114: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11c: goto 12a
      // 11f: ldc2_w -1100058561410160666
      // 122: lload 4
      // 124: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: pop
      // 12b: aload 12
      // 12d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 130: areturn
   }

   public bg T(Object[] var1) {
      return this.L;
   }

   public ji(int var1, long var2, xb var4, jd var5) {
      var2 = c ^ var2;
      long var6 = var2 ^ 102740925265306L;
      super(var1, var5.l);
      m44.a<"r">(this, var4, 8362610385819485325L, var2);
      this.L = m44.a<"q">(var5, new Object[0], 7557619589769844608L, var2);
      m44.a<"r">(this, m44.a<"q">(this.L, new Object[]{var6}, 8146962730233279038L, var2), 7934206420553176537L, var2);
   }

   public boolean e(long var1, gu var3, Object var4, Object var5) {
      long var6 = var1 ^ 12215597448316L;
      return var3.K(this, var4, var6, var5);
   }

   boolean Y(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/bg
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/ji.c J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -7173170110686561641
      // 1c: lload 3
      // 1d: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: bipush 0
      // 23: istore 6
      // 25: istore 5
      // 27: aload 0
      // 28: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 2b: iload 5
      // 2d: ifne 69
      // 30: ifnull 6d
      // 33: goto 40
      // 36: ldc2_w -8732026219248660084
      // 39: lload 3
      // 3a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: lload 3
      // 41: lconst_0
      // 42: lcmp
      // 43: iflt 75
      // 46: aload 0
      // 47: iload 5
      // 49: ifne 71
      // 4c: goto 59
      // 4f: ldc2_w -8732026219248660084
      // 52: lload 3
      // 53: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 5c: goto 69
      // 5f: ldc2_w -8732026219248660084
      // 62: lload 3
      // 63: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 2
      // 6a: if_acmpeq 70
      // 6d: bipush 1
      // 6e: istore 6
      // 70: aload 0
      // 71: aload 2
      // 72: putfield com/zelix/ji.L Lcom/zelix/bg;
      // 75: iload 6
      // 77: ireturn
   }

   public j9 v(Object[] param1) {
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
      // 0c: getstatic com/zelix/ji.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 119231999469264
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 5512144917987333376
      // 1e: lload 2
      // 1f: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 2a: iload 6
      // 2c: ifeq 50
      // 2f: ifnull 6b
      // 32: goto 3f
      // 35: ldc2_w 5194486239772254027
      // 38: lload 2
      // 39: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 43: goto 50
      // 46: ldc2_w 5194486239772254027
      // 49: lload 2
      // 4a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 453
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 5780159549518157466
      // 62: lload 2
      // 63: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/j9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: goto 6c
      // 6b: aconst_null
      // 6c: areturn
   }

   protected void O(DataOutputStream param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 37673027190037
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 115363793422676
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -509579923954426359
      // 13: lload 2
      // 14: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 1
      // 1c: aload 0
      // 1d: lload 6
      // 1f: invokevirtual com/zelix/ji.A (J)Lcom/zelix/va;
      // 22: invokevirtual com/zelix/va.g ()I
      // 25: iload 8
      // 27: ifne 91
      // 2a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2d: aload 0
      // 2e: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 31: ifnull 79
      // 34: goto 41
      // 37: ldc2_w -2139279767627877102
      // 3a: lload 2
      // 3b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 1
      // 42: aload 0
      // 43: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 46: lload 4
      // 48: bipush 1
      // 49: anewarray 453
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w -468184961261028687
      // 58: lload 2
      // 59: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 61: lload 2
      // 62: lconst_0
      // 63: lcmp
      // 64: iflt a5
      // 67: iload 8
      // 69: ifeq 94
      // 6c: goto 79
      // 6f: ldc2_w -2139279767627877102
      // 72: lload 2
      // 73: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 1
      // 7a: aload 0
      // 7b: ldc2_w -1831687958796722858
      // 7e: lload 2
      // 7f: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: goto 91
      // 87: ldc2_w -2139279767627877102
      // 8a: lload 2
      // 8b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 94: aload 1
      // 95: aload 0
      // 96: ldc2_w -251485914855977982
      // 99: lload 2
      // 9a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: invokevirtual com/zelix/xb.E ()I
      // a2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // a5: return
   }

   void N(Object[] param1) {
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
      // 0c: getstatic com/zelix/ji.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 121107971217628
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 1793136156639904157
      // 1e: lload 2
      // 1f: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 2a: iload 6
      // 2c: ifeq 50
      // 2f: ifnull 68
      // 32: goto 3f
      // 35: ldc2_w 2056993815284534230
      // 38: lload 2
      // 39: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 43: goto 50
      // 46: ldc2_w 2056993815284534230
      // 49: lload 2
      // 4a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 453
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 2075983359413866921
      // 62: lload 2
      // 63: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: return
   }

   public final xb l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      return m44.a<"s">(this, -8113618416842719258L, var2);
   }

   protected void w(long param1, DataOutputStream param3, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 71798685869620
      // 005: lxor
      // 006: lstore 5
      // 008: dup2
      // 009: ldc2_w 13072699806325
      // 00c: lxor
      // 00d: lstore 7
      // 00f: pop2
      // 010: ldc2_w 7191396267850401064
      // 013: lload 1
      // 014: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: istore 9
      // 01b: aload 3
      // 01c: aload 0
      // 01d: lload 7
      // 01f: invokevirtual com/zelix/ji.A (J)Lcom/zelix/va;
      // 022: invokevirtual com/zelix/va.g ()I
      // 025: iload 9
      // 027: ifne 091
      // 02a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 02d: aload 0
      // 02e: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 031: ifnull 079
      // 034: goto 041
      // 037: ldc2_w 8750110815632338483
      // 03a: lload 1
      // 03b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: athrow
      // 041: aload 3
      // 042: lload 1
      // 043: lconst_0
      // 044: lcmp
      // 045: ifle 0a5
      // 048: aload 0
      // 049: getfield com/zelix/ji.L Lcom/zelix/bg;
      // 04c: lload 5
      // 04e: bipush 1
      // 04f: anewarray 453
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 0
      // 059: swap
      // 05a: aastore
      // 05b: ldc2_w 7107189619247456656
      // 05e: lload 1
      // 05f: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 067: iload 9
      // 069: ifeq 094
      // 06c: goto 079
      // 06f: ldc2_w 8750110815632338483
      // 072: lload 1
      // 073: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 3
      // 07a: aload 0
      // 07b: ldc2_w 9058404121480136311
      // 07e: lload 1
      // 07f: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: goto 091
      // 087: ldc2_w 8750110815632338483
      // 08a: lload 1
      // 08b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 094: aload 4
      // 096: aload 0
      // 097: ldc2_w 7468069802950743843
      // 09a: lload 1
      // 09b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a5: checkcast com/zelix/xb
      // 0a8: checkcast com/zelix/xb
      // 0ab: astore 10
      // 0ad: iload 9
      // 0af: lload 1
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: iflt 0e8
      // 0b5: ifne 0e0
      // 0b8: aload 10
      // 0ba: ifnull 0eb
      // 0bd: goto 0ca
      // 0c0: ldc2_w 8750110815632338483
      // 0c3: lload 1
      // 0c4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 3
      // 0cb: aload 10
      // 0cd: invokevirtual com/zelix/xb.E ()I
      // 0d0: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0d3: goto 0e0
      // 0d6: ldc2_w 8750110815632338483
      // 0d9: lload 1
      // 0da: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: lload 1
      // 0e1: lconst_0
      // 0e2: lcmp
      // 0e3: iflt 0fc
      // 0e6: iload 9
      // 0e8: ifeq 109
      // 0eb: aload 3
      // 0ec: aload 0
      // 0ed: ldc2_w 7468069802950743843
      // 0f0: lload 1
      // 0f1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/xb; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual com/zelix/xb.E ()I
      // 0f9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0fc: goto 109
      // 0ff: ldc2_w 8750110815632338483
      // 102: lload 1
      // 103: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: return
   }

   public ji(int var1, to var2, long var3, xb var5, bg var6) {
      var3 = c ^ var3;
      long var7 = var3 ^ 108005138362005L;
      super(var1, var2);
      m44.a<"u">(this, var5, 3387492645839183746L, var3);
      this.L = var6;
      m44.a<"u">(this, m44.a<"v">(var6, new Object[]{var7}, 3026678690262804785L, var3), 3824904051004231382L, var3);
   }

   static {
      long var11 = c ^ 69078680161129L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "õ|<9\u008d7Ç²a\u0011;\rõ¤\u009fd\u000eCÃÐ\u0011Z¾wÐ\u0086:\u001b/á¿\u0003\u0010Ç£7åJí_\u001b+ëÖ\u009a\u0014[¦«\u0010¡\u0092$ìÜ^®B\u0000\u009b\u0080\u0094E\u0016§Ä";
      int var19 = "õ|<9\u008d7Ç²a\u0011;\rõ¤\u009fd\u000eCÃÐ\u0011Z¾wÐ\u0086:\u001b/á¿\u0003\u0010Ç£7åJí_\u001b+ëÖ\u009a\u0014[¦«\u0010¡\u0092$ìÜ^®B\u0000\u009b\u0080\u0094E\u0016§Ä"
         .length();
      char var16 = ' ';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     d = var20;
                     e = new String[5];
                     n = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "×\u0086\u008c.+dâ)É\u0099öf®öÚ6";
                     int var5 = "×\u0086\u008c.+dâ)É\u0099öf®öÚ6".length();
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
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     k = var6;
                     m = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "6Í},û\u0091\u008f1\u0003ìÅ\u009d\u0087\u0000¹×\u0010kù,%o\u0091ý£ñëÌâ\u0018ã2¤";
                  var19 = "6Í},û\u0091\u008f1\u0003ìÅ\u009d\u0087\u0000¹×\u0010kù,%o\u0091ý£ñëÌâ\u0018ã2¤".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 b(n9 var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20084;
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
            throw new RuntimeException("com/zelix/ji", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/ji" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31470;
      if (m[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ji", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ji" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
