package com.zelix;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k_ extends kw {
   private bc F;
   private int P;
   private int A;
   private int j;
   private int m;
   private be[] U;
   private kw[] N;
   private static final long a = prr.a(-6704276425078876948L, 5716527995651196157L, MethodHandles.lookup().lookupClass()).a(99427987442247L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map k;

   int i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 81644265127198L;
      return m44.a<"p">(this.F, new Object[]{var4}, -901648601081543017L, var2);
   }

   l6q t(Object[] var1) {
      Map var21 = (Map)var1[0];
      em var18 = (em)var1[1];
      fr var23 = (fr)var1[2];
      fr var12 = (fr)var1[3];
      fr var22 = (fr)var1[4];
      loj var4 = (loj)var1[5];
      Map var10 = (Map)var1[6];
      Map var7 = (Map)var1[7];
      Map var9 = (Map)var1[8];
      Map var20 = (Map)var1[9];
      _u var8 = (_u)var1[10];
      Map var13 = (Map)var1[11];
      ol var14 = (ol)var1[12];
      l6q var11 = (l6q)var1[13];
      ol var2 = (ol)var1[14];
      ol var17 = (ol)var1[15];
      ol var6 = (ol)var1[16];
      Set var3 = (Set)var1[17];
      List var24 = (List)var1[18];
      List var5 = (List)var1[19];
      boolean var19 = (Boolean)var1[20];
      long var15 = (Long)var1[21];
      var15 = a ^ var15;
      long var25 = var15 ^ 86617546792262L;
      bc var10000 = this.F;
      Object[] var10024 = new Object[]{
         null, null, null, null, null, null, null, null, null, null, var9, var20, var8, var13, var14, var11, var2, var17, var3, var24, var5, var19
      };
      var10024[9] = var25;
      var10024[8] = var7;
      var10024[7] = var10;
      var10024[6] = var4;
      var10024[5] = var6;
      var10024[4] = var22;
      var10024[3] = var12;
      var10024[2] = var23;
      var10024[1] = var18;
      var10024[0] = var21;
      return m44.a<"s">(var10000, var10024, -3338294749074651097L, var15);
   }

   kk Y(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8508552302112285428
      // 15: lload 2
      // 16: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifne 63
      // 36: instanceof com/zelix/kk
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w -7620881634308995675
      // 48: lload 2
      // 49: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w -7620881634308995675
      // 5c: lload 2
      // 5d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/kk
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifeq 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 2a
      // 75: aconst_null
      // 76: areturn
   }

   void U(Object[] var1) {
      Set var5 = (Set)var1[0];
      long var3 = (Long)var1[1];
      hv var2 = (hv)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 31104964104819L;
      m44.a<"u">(this.F, new Object[]{var5, var2, var6}, 7238788957102160876L, var3);
   }

   void M(Object[] var1) {
      long var4 = (Long)var1[0];
      PrintWriter var2 = (PrintWriter)var1[1];
      int var3 = (Integer)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 76265125832777L;
      boolean var8 = m44.a<"j">(-7886962188016688189L, var4);

      bc var10000;
      label22: {
         try {
            var10000 = this.F;
            if (!var8) {
               break label22;
            }

            if (this.F == null) {
               return;
            }
         } catch (nn var9) {
            throw m44.a<"j">(var9, -7708704932639095139L, var4);
         }

         var10000 = this.F;
      }

      Object[] var10005 = new Object[]{null, var2, var3};
      var10005[0] = var6;
      m44.a<"u">(var10000, var10005, -8253616428529602623L, var4);
   }

   boolean I(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 55611436920790L;
      return ((b1)this.H()).T(var6);
   }

   public boolean g(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 13
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 12
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/List
      // 017: astore 3
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Boolean
      // 01e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021: istore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Boolean
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: istore 8
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 11
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast com/zelix/loj
      // 040: astore 2
      // 041: dup
      // 042: bipush 7
      // 044: aaload
      // 045: checkcast com/zelix/_u
      // 048: astore 5
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast java/lang/Boolean
      // 051: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 054: istore 7
      // 056: dup
      // 057: bipush 9
      // 059: aaload
      // 05a: checkcast java/lang/Long
      // 05d: invokevirtual java/lang/Long.longValue ()J
      // 060: lstore 9
      // 062: dup
      // 063: bipush 10
      // 065: aaload
      // 066: checkcast com/zelix/lqu
      // 069: astore 6
      // 06b: pop
      // 06c: getstatic com/zelix/k_.a J
      // 06f: lload 9
      // 071: lxor
      // 072: lstore 9
      // 074: lload 9
      // 076: dup2
      // 077: ldc2_w 70973323672810
      // 07a: lxor
      // 07b: dup2
      // 07c: bipush 48
      // 07e: lushr
      // 07f: l2i
      // 080: istore 14
      // 082: dup2
      // 083: bipush 16
      // 085: lshl
      // 086: bipush 32
      // 088: lushr
      // 089: l2i
      // 08a: istore 15
      // 08c: dup2
      // 08d: bipush 48
      // 08f: lshl
      // 090: bipush 48
      // 092: lushr
      // 093: l2i
      // 094: istore 16
      // 096: pop2
      // 097: pop2
      // 098: ldc2_w 8315572854153085486
      // 09b: lload 9
      // 09d: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: istore 17
      // 0a4: aload 0
      // 0a5: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0a8: iload 17
      // 0aa: ifeq 0d0
      // 0ad: ifnull 156
      // 0b0: goto 0be
      // 0b3: ldc2_w 8424006650058254192
      // 0b6: lload 9
      // 0b8: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0c2: goto 0d0
      // 0c5: ldc2_w 8424006650058254192
      // 0c8: lload 9
      // 0ca: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: iload 14
      // 0d2: i2s
      // 0d3: aload 13
      // 0d5: aload 12
      // 0d7: aload 3
      // 0d8: iload 15
      // 0da: iload 4
      // 0dc: iload 16
      // 0de: iload 8
      // 0e0: iload 11
      // 0e2: aload 2
      // 0e3: aload 5
      // 0e5: iload 7
      // 0e7: aload 6
      // 0e9: bipush 13
      // 0eb: anewarray 384
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 12
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f9: bipush 11
      // 0fb: swap
      // 0fc: aastore
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 10
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 9
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 10e: bipush 8
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 117: bipush 7
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: bipush 6
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 129: bipush 5
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 131: bipush 4
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 3
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 2
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 1
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w 8075151868433854021
      // 14e: lload 9
      // 150: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: ireturn
      // 156: bipush 0
      // 157: ireturn
   }

   b1 H(Object[] var1) {
      return (b1)this.H();
   }

   int c(Object[] param1) {
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
      // 004: checkcast com/zelix/l6q
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/loj
      // 00e: astore 10
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 8
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/ai
      // 028: astore 12
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Integer
      // 030: invokevirtual java/lang/Integer.intValue ()I
      // 033: istore 7
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast java/lang/Integer
      // 03c: invokevirtual java/lang/Integer.intValue ()I
      // 03f: istore 5
      // 041: dup
      // 042: bipush 7
      // 044: aaload
      // 045: checkcast java/lang/Boolean
      // 048: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04b: istore 6
      // 04d: dup
      // 04e: bipush 8
      // 050: aaload
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 11
      // 059: dup
      // 05a: bipush 9
      // 05c: aaload
      // 05d: checkcast java/util/Map
      // 060: astore 4
      // 062: pop
      // 063: getstatic com/zelix/k_.a J
      // 066: lload 8
      // 068: lxor
      // 069: lstore 8
      // 06b: lload 8
      // 06d: dup2
      // 06e: ldc2_w 136026270903597
      // 071: lxor
      // 072: lstore 13
      // 074: pop2
      // 075: ldc2_w -6928530823615558849
      // 078: lload 8
      // 07a: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: istore 15
      // 081: aload 0
      // 082: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 085: iload 15
      // 087: ifne 0ad
      // 08a: ifnull 115
      // 08d: goto 09b
      // 090: ldc2_w -9219337198758145130
      // 093: lload 8
      // 095: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 09f: goto 0ad
      // 0a2: ldc2_w -9219337198758145130
      // 0a5: lload 8
      // 0a7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 3
      // 0ae: aload 10
      // 0b0: aload 2
      // 0b1: aload 12
      // 0b3: iload 7
      // 0b5: iload 5
      // 0b7: iload 6
      // 0b9: iload 11
      // 0bb: lload 13
      // 0bd: aload 4
      // 0bf: bipush 10
      // 0c1: anewarray 384
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 9
      // 0c8: swap
      // 0c9: aastore
      // 0ca: dup_x2
      // 0cb: dup_x2
      // 0cc: pop
      // 0cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d0: bipush 8
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d9: bipush 7
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e2: bipush 6
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: bipush 5
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 4
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 3
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 2
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 1
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w -8910745480775135145
      // 10d: lload 8
      // 10f: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: ireturn
      // 115: bipush 0
      // 116: ireturn
   }

   private boolean m(Object[] param1) {
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
      // 004: checkcast com/zelix/l
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast com/zelix/lqu
      // 023: astore 6
      // 025: pop
      // 026: getstatic com/zelix/k_.a J
      // 029: lload 4
      // 02b: lxor
      // 02c: lstore 4
      // 02e: lload 4
      // 030: dup2
      // 031: ldc2_w 86964641246275
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 35842451018214
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 120544932969984
      // 042: lxor
      // 043: lstore 11
      // 045: dup2
      // 046: ldc2_w 67226414923719
      // 049: lxor
      // 04a: lstore 13
      // 04c: dup2
      // 04d: ldc2_w 12724541780745
      // 050: lxor
      // 051: lstore 15
      // 053: dup2
      // 054: ldc2_w 77807961052184
      // 057: lxor
      // 058: lstore 17
      // 05a: dup2
      // 05b: ldc2_w 78100449983317
      // 05e: lxor
      // 05f: lstore 19
      // 061: dup2
      // 062: ldc2_w 16041213333246
      // 065: lxor
      // 066: lstore 21
      // 068: dup2
      // 069: ldc2_w 97894010939999
      // 06c: lxor
      // 06d: lstore 23
      // 06f: dup2
      // 070: ldc2_w 73475970919487
      // 073: lxor
      // 074: lstore 25
      // 076: dup2
      // 077: ldc2_w 131830529827325
      // 07a: lxor
      // 07b: lstore 27
      // 07d: dup2
      // 07e: ldc2_w 51028716250494
      // 081: lxor
      // 082: lstore 29
      // 084: dup2
      // 085: ldc2_w 122862231474490
      // 088: lxor
      // 089: lstore 31
      // 08b: dup2
      // 08c: ldc2_w 61277083615625
      // 08f: lxor
      // 090: lstore 33
      // 092: dup2
      // 093: ldc2_w 63095599723461
      // 096: lxor
      // 097: lstore 35
      // 099: dup2
      // 09a: ldc2_w 113035298977988
      // 09d: lxor
      // 09e: lstore 37
      // 0a0: pop2
      // 0a1: ldc2_w 7242551929338343525
      // 0a4: lload 4
      // 0a6: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 2
      // 0ac: lload 21
      // 0ae: bipush 1
      // 0af: anewarray 384
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w 7274460780883963138
      // 0be: lload 4
      // 0c0: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: astore 40
      // 0c7: istore 39
      // 0c9: aload 40
      // 0cb: arraylength
      // 0cc: iload 39
      // 0ce: ifne 70e
      // 0d1: ifle 70d
      // 0d4: goto 0e2
      // 0d7: ldc2_w 8886739914784057548
      // 0da: lload 4
      // 0dc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: new com/zelix/df
      // 0e5: dup
      // 0e6: lload 29
      // 0e8: invokespecial com/zelix/df.<init> (J)V
      // 0eb: astore 41
      // 0ed: aconst_null
      // 0ee: astore 42
      // 0f0: aconst_null
      // 0f1: astore 43
      // 0f3: aconst_null
      // 0f4: astore 44
      // 0f6: aconst_null
      // 0f7: astore 45
      // 0f9: aconst_null
      // 0fa: astore 46
      // 0fc: aload 0
      // 0fd: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 100: lload 7
      // 102: aload 41
      // 104: bipush 2
      // 105: anewarray 384
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: ldc2_w 8916372921863865820
      // 119: lload 4
      // 11b: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: bipush 0
      // 121: istore 47
      // 123: iload 47
      // 125: aload 0
      // 126: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 129: arraylength
      // 12a: if_icmpge 375
      // 12d: aload 0
      // 12e: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 131: iload 47
      // 133: aaload
      // 134: instanceof com/zelix/ks
      // 137: iload 39
      // 139: lload 4
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: ifle 145
      // 140: ifne 37d
      // 143: iload 39
      // 145: lload 4
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 1c2
      // 14c: ifne 1c0
      // 14f: goto 15d
      // 152: ldc2_w 8886739914784057548
      // 155: lload 4
      // 157: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: ifeq 1a8
      // 160: goto 16e
      // 163: ldc2_w 8886739914784057548
      // 166: lload 4
      // 168: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 0
      // 16f: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 172: iload 47
      // 174: aaload
      // 175: checkcast com/zelix/ks
      // 178: astore 42
      // 17a: aload 42
      // 17c: aload 41
      // 17e: lload 37
      // 180: bipush 2
      // 181: anewarray 384
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 7258817882962663329
      // 195: lload 4
      // 197: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: iload 39
      // 19e: lload 4
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: ifle 372
      // 1a5: ifeq 36d
      // 1a8: aload 0
      // 1a9: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1ac: iload 47
      // 1ae: aaload
      // 1af: instanceof com/zelix/ku
      // 1b2: goto 1c0
      // 1b5: ldc2_w 8886739914784057548
      // 1b8: lload 4
      // 1ba: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: iload 39
      // 1c2: lload 4
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: iflt 231
      // 1c9: ifne 22f
      // 1cc: ifeq 217
      // 1cf: goto 1dd
      // 1d2: ldc2_w 8886739914784057548
      // 1d5: lload 4
      // 1d7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1e1: iload 47
      // 1e3: aaload
      // 1e4: checkcast com/zelix/ku
      // 1e7: astore 43
      // 1e9: aload 43
      // 1eb: aload 41
      // 1ed: lload 15
      // 1ef: bipush 2
      // 1f0: anewarray 384
      // 1f3: dup_x2
      // 1f4: dup_x2
      // 1f5: pop
      // 1f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f9: bipush 1
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 0
      // 1ff: swap
      // 200: aastore
      // 201: ldc2_w 7290963812592668829
      // 204: lload 4
      // 206: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: iload 39
      // 20d: lload 4
      // 20f: lconst_0
      // 210: lcmp
      // 211: ifle 372
      // 214: ifeq 36d
      // 217: aload 0
      // 218: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 21b: iload 47
      // 21d: aaload
      // 21e: instanceof com/zelix/kq
      // 221: goto 22f
      // 224: ldc2_w 8886739914784057548
      // 227: lload 4
      // 229: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: athrow
      // 22f: iload 39
      // 231: lload 4
      // 233: lconst_0
      // 234: lcmp
      // 235: ifle 2a7
      // 238: ifne 29e
      // 23b: ifeq 286
      // 23e: goto 24c
      // 241: ldc2_w 8886739914784057548
      // 244: lload 4
      // 246: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: athrow
      // 24c: aload 0
      // 24d: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 250: iload 47
      // 252: aaload
      // 253: checkcast com/zelix/kq
      // 256: astore 44
      // 258: aload 43
      // 25a: aload 41
      // 25c: lload 15
      // 25e: bipush 2
      // 25f: anewarray 384
      // 262: dup_x2
      // 263: dup_x2
      // 264: pop
      // 265: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x1
      // 26c: swap
      // 26d: bipush 0
      // 26e: swap
      // 26f: aastore
      // 270: ldc2_w 7290963812592668829
      // 273: lload 4
      // 275: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: iload 39
      // 27c: lload 4
      // 27e: lconst_0
      // 27f: lcmp
      // 280: ifle 372
      // 283: ifeq 36d
      // 286: aload 0
      // 287: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 28a: iload 47
      // 28c: aaload
      // 28d: instanceof com/zelix/k6
      // 290: goto 29e
      // 293: ldc2_w 8886739914784057548
      // 296: lload 4
      // 298: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: lload 4
      // 2a0: lconst_0
      // 2a1: lcmp
      // 2a2: iflt 327
      // 2a5: iload 39
      // 2a7: ifne 327
      // 2aa: ifeq 2f5
      // 2ad: goto 2bb
      // 2b0: ldc2_w 8886739914784057548
      // 2b3: lload 4
      // 2b5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2bf: iload 47
      // 2c1: aaload
      // 2c2: checkcast com/zelix/k6
      // 2c5: astore 46
      // 2c7: aload 46
      // 2c9: aload 41
      // 2cb: lload 9
      // 2cd: bipush 2
      // 2ce: anewarray 384
      // 2d1: dup_x2
      // 2d2: dup_x2
      // 2d3: pop
      // 2d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d7: bipush 1
      // 2d8: swap
      // 2d9: aastore
      // 2da: dup_x1
      // 2db: swap
      // 2dc: bipush 0
      // 2dd: swap
      // 2de: aastore
      // 2df: ldc2_w 8740639957632593353
      // 2e2: lload 4
      // 2e4: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: iload 39
      // 2eb: lload 4
      // 2ed: lconst_0
      // 2ee: lcmp
      // 2ef: iflt 372
      // 2f2: ifeq 36d
      // 2f5: lload 4
      // 2f7: lconst_0
      // 2f8: lcmp
      // 2f9: iflt 34b
      // 2fc: aload 0
      // 2fd: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 300: iload 47
      // 302: aaload
      // 303: iload 39
      // 305: ifne 346
      // 308: goto 316
      // 30b: ldc2_w 8886739914784057548
      // 30e: lload 4
      // 310: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: athrow
      // 316: instanceof com/zelix/kk
      // 319: goto 327
      // 31c: ldc2_w 8886739914784057548
      // 31f: lload 4
      // 321: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: athrow
      // 327: lload 4
      // 329: lconst_0
      // 32a: lcmp
      // 32b: iflt 372
      // 32e: ifeq 36d
      // 331: aload 0
      // 332: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 335: iload 47
      // 337: aaload
      // 338: goto 346
      // 33b: ldc2_w 8886739914784057548
      // 33e: lload 4
      // 340: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: athrow
      // 346: checkcast com/zelix/kk
      // 349: astore 45
      // 34b: aload 45
      // 34d: aload 41
      // 34f: lload 9
      // 351: bipush 2
      // 352: anewarray 384
      // 355: dup_x2
      // 356: dup_x2
      // 357: pop
      // 358: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 35b: bipush 1
      // 35c: swap
      // 35d: aastore
      // 35e: dup_x1
      // 35f: swap
      // 360: bipush 0
      // 361: swap
      // 362: aastore
      // 363: ldc2_w 8740639957632593353
      // 366: lload 4
      // 368: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: iinc 47 1
      // 370: iload 39
      // 372: ifeq 123
      // 375: lload 4
      // 377: lconst_0
      // 378: lcmp
      // 379: ifle 12d
      // 37c: bipush 0
      // 37d: istore 47
      // 37f: iload 47
      // 381: aload 0
      // 382: getfield com/zelix/k_.m I
      // 385: if_icmpge 3d8
      // 388: aload 0
      // 389: lload 4
      // 38b: lconst_0
      // 38c: lcmp
      // 38d: iflt 402
      // 390: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 393: iload 47
      // 395: aaload
      // 396: lload 31
      // 398: aload 41
      // 39a: bipush 2
      // 39b: anewarray 384
      // 39e: dup_x1
      // 39f: swap
      // 3a0: bipush 1
      // 3a1: swap
      // 3a2: aastore
      // 3a3: dup_x2
      // 3a4: dup_x2
      // 3a5: pop
      // 3a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a9: bipush 0
      // 3aa: swap
      // 3ab: aastore
      // 3ac: ldc2_w 7281515577702213319
      // 3af: lload 4
      // 3b1: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: iinc 47 1
      // 3b9: iload 39
      // 3bb: ifne 401
      // 3be: iload 39
      // 3c0: ifeq 37f
      // 3c3: lload 4
      // 3c5: lconst_0
      // 3c6: lcmp
      // 3c7: iflt 3b9
      // 3ca: goto 3d8
      // 3cd: ldc2_w 8886739914784057548
      // 3d0: lload 4
      // 3d2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: invokevirtual com/zelix/k_.H ()Lcom/zelix/_4;
      // 3dc: checkcast com/zelix/bn
      // 3df: lload 19
      // 3e1: aload 41
      // 3e3: bipush 2
      // 3e4: anewarray 384
      // 3e7: dup_x1
      // 3e8: swap
      // 3e9: bipush 1
      // 3ea: swap
      // 3eb: aastore
      // 3ec: dup_x2
      // 3ed: dup_x2
      // 3ee: pop
      // 3ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f2: bipush 0
      // 3f3: swap
      // 3f4: aastore
      // 3f5: ldc2_w 7355077117990951827
      // 3f8: lload 4
      // 3fa: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: istore 47
      // 401: aload 0
      // 402: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 405: lload 33
      // 407: aload 40
      // 409: bipush 2
      // 40a: anewarray 384
      // 40d: dup_x1
      // 40e: swap
      // 40f: bipush 1
      // 410: swap
      // 411: aastore
      // 412: dup_x2
      // 413: dup_x2
      // 414: pop
      // 415: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 418: bipush 0
      // 419: swap
      // 41a: aastore
      // 41b: ldc2_w 7115274533090547371
      // 41e: lload 4
      // 420: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 425: astore 48
      // 427: aload 42
      // 429: iload 39
      // 42b: ifne 441
      // 42e: ifnull 468
      // 431: goto 43f
      // 434: ldc2_w 8886739914784057548
      // 437: lload 4
      // 439: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43e: athrow
      // 43f: aload 42
      // 441: lload 13
      // 443: aload 48
      // 445: aload 41
      // 447: bipush 3
      // 448: anewarray 384
      // 44b: dup_x1
      // 44c: swap
      // 44d: bipush 2
      // 44e: swap
      // 44f: aastore
      // 450: dup_x1
      // 451: swap
      // 452: bipush 1
      // 453: swap
      // 454: aastore
      // 455: dup_x2
      // 456: dup_x2
      // 457: pop
      // 458: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45b: bipush 0
      // 45c: swap
      // 45d: aastore
      // 45e: ldc2_w 7357943746455256842
      // 461: lload 4
      // 463: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: aload 43
      // 46a: iload 39
      // 46c: ifne 482
      // 46f: ifnull 4a9
      // 472: goto 480
      // 475: ldc2_w 8886739914784057548
      // 478: lload 4
      // 47a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47f: athrow
      // 480: aload 43
      // 482: lload 17
      // 484: aload 48
      // 486: aload 41
      // 488: bipush 3
      // 489: anewarray 384
      // 48c: dup_x1
      // 48d: swap
      // 48e: bipush 2
      // 48f: swap
      // 490: aastore
      // 491: dup_x1
      // 492: swap
      // 493: bipush 1
      // 494: swap
      // 495: aastore
      // 496: dup_x2
      // 497: dup_x2
      // 498: pop
      // 499: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 49c: bipush 0
      // 49d: swap
      // 49e: aastore
      // 49f: ldc2_w 7020806561743864827
      // 4a2: lload 4
      // 4a4: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a9: aload 44
      // 4ab: iload 39
      // 4ad: ifne 4c3
      // 4b0: ifnull 4ea
      // 4b3: goto 4c1
      // 4b6: ldc2_w 8886739914784057548
      // 4b9: lload 4
      // 4bb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: athrow
      // 4c1: aload 44
      // 4c3: lload 17
      // 4c5: aload 48
      // 4c7: aload 41
      // 4c9: bipush 3
      // 4ca: anewarray 384
      // 4cd: dup_x1
      // 4ce: swap
      // 4cf: bipush 2
      // 4d0: swap
      // 4d1: aastore
      // 4d2: dup_x1
      // 4d3: swap
      // 4d4: bipush 1
      // 4d5: swap
      // 4d6: aastore
      // 4d7: dup_x2
      // 4d8: dup_x2
      // 4d9: pop
      // 4da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4dd: bipush 0
      // 4de: swap
      // 4df: aastore
      // 4e0: ldc2_w 7020806561743864827
      // 4e3: lload 4
      // 4e5: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ea: aload 45
      // 4ec: iload 39
      // 4ee: ifne 504
      // 4f1: ifnull 52b
      // 4f4: goto 502
      // 4f7: ldc2_w 8886739914784057548
      // 4fa: lload 4
      // 4fc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: athrow
      // 502: aload 45
      // 504: lload 23
      // 506: aload 48
      // 508: aload 41
      // 50a: bipush 3
      // 50b: anewarray 384
      // 50e: dup_x1
      // 50f: swap
      // 510: bipush 2
      // 511: swap
      // 512: aastore
      // 513: dup_x1
      // 514: swap
      // 515: bipush 1
      // 516: swap
      // 517: aastore
      // 518: dup_x2
      // 519: dup_x2
      // 51a: pop
      // 51b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51e: bipush 0
      // 51f: swap
      // 520: aastore
      // 521: ldc2_w 7290273446803746553
      // 524: lload 4
      // 526: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52b: aload 46
      // 52d: iload 39
      // 52f: ifne 545
      // 532: ifnull 56c
      // 535: goto 543
      // 538: ldc2_w 8886739914784057548
      // 53b: lload 4
      // 53d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 542: athrow
      // 543: aload 46
      // 545: lload 23
      // 547: aload 48
      // 549: aload 41
      // 54b: bipush 3
      // 54c: anewarray 384
      // 54f: dup_x1
      // 550: swap
      // 551: bipush 2
      // 552: swap
      // 553: aastore
      // 554: dup_x1
      // 555: swap
      // 556: bipush 1
      // 557: swap
      // 558: aastore
      // 559: dup_x2
      // 55a: dup_x2
      // 55b: pop
      // 55c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55f: bipush 0
      // 560: swap
      // 561: aastore
      // 562: ldc2_w 7290273446803746553
      // 565: lload 4
      // 567: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56c: new java/util/ArrayList
      // 56f: dup
      // 570: aload 0
      // 571: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 574: arraylength
      // 575: invokespecial java/util/ArrayList.<init> (I)V
      // 578: astore 49
      // 57a: bipush 0
      // 57b: istore 50
      // 57d: iload 50
      // 57f: aload 0
      // 580: getfield com/zelix/k_.m I
      // 583: if_icmpge 61b
      // 586: aload 0
      // 587: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 58a: iload 50
      // 58c: aaload
      // 58d: lload 11
      // 58f: aload 48
      // 591: aload 40
      // 593: aload 41
      // 595: aload 2
      // 596: bipush 5
      // 597: anewarray 384
      // 59a: dup_x1
      // 59b: swap
      // 59c: bipush 4
      // 59d: swap
      // 59e: aastore
      // 59f: dup_x1
      // 5a0: swap
      // 5a1: bipush 3
      // 5a2: swap
      // 5a3: aastore
      // 5a4: dup_x1
      // 5a5: swap
      // 5a6: bipush 2
      // 5a7: swap
      // 5a8: aastore
      // 5a9: dup_x1
      // 5aa: swap
      // 5ab: bipush 1
      // 5ac: swap
      // 5ad: aastore
      // 5ae: dup_x2
      // 5af: dup_x2
      // 5b0: pop
      // 5b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b4: bipush 0
      // 5b5: swap
      // 5b6: aastore
      // 5b7: ldc2_w 7213244226295851060
      // 5ba: lload 4
      // 5bc: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: iload 39
      // 5c3: lload 4
      // 5c5: lconst_0
      // 5c6: lcmp
      // 5c7: iflt 628
      // 5ca: ifne 626
      // 5cd: iload 39
      // 5cf: ifne 612
      // 5d2: goto 5e0
      // 5d5: ldc2_w 8886739914784057548
      // 5d8: lload 4
      // 5da: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5df: athrow
      // 5e0: lload 4
      // 5e2: lconst_0
      // 5e3: lcmp
      // 5e4: ifle 618
      // 5e7: ifne 613
      // 5ea: goto 5f8
      // 5ed: ldc2_w 8886739914784057548
      // 5f0: lload 4
      // 5f2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f7: athrow
      // 5f8: aload 49
      // 5fa: aload 0
      // 5fb: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 5fe: iload 50
      // 600: aaload
      // 601: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 604: goto 612
      // 607: ldc2_w 8886739914784057548
      // 60a: lload 4
      // 60c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 611: athrow
      // 612: pop
      // 613: iinc 50 1
      // 616: iload 39
      // 618: ifeq 57d
      // 61b: aload 0
      // 61c: lload 4
      // 61e: lconst_0
      // 61f: lcmp
      // 620: ifle 587
      // 623: getfield com/zelix/k_.m I
      // 626: iload 39
      // 628: lload 4
      // 62a: lconst_0
      // 62b: lcmp
      // 62c: iflt 66d
      // 62f: ifne 66b
      // 632: aload 49
      // 634: invokevirtual java/util/ArrayList.size ()I
      // 637: if_icmple 669
      // 63a: goto 648
      // 63d: ldc2_w 8886739914784057548
      // 640: lload 4
      // 642: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 647: athrow
      // 648: aload 49
      // 64a: invokevirtual java/util/ArrayList.size ()I
      // 64d: anewarray 280
      // 650: astore 50
      // 652: aload 0
      // 653: aload 49
      // 655: aload 50
      // 657: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 65a: checkcast [Lcom/zelix/be;
      // 65d: putfield com/zelix/k_.U [Lcom/zelix/be;
      // 660: aload 0
      // 661: aload 0
      // 662: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 665: arraylength
      // 666: putfield com/zelix/k_.m I
      // 669: iload 47
      // 66b: iload 39
      // 66d: ifne 70c
      // 670: ifeq 6bd
      // 673: goto 681
      // 676: ldc2_w 8886739914784057548
      // 679: lload 4
      // 67b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 680: athrow
      // 681: aload 0
      // 682: invokevirtual com/zelix/k_.H ()Lcom/zelix/_4;
      // 685: checkcast com/zelix/bn
      // 688: aload 48
      // 68a: lload 25
      // 68c: aload 41
      // 68e: bipush 3
      // 68f: anewarray 384
      // 692: dup_x1
      // 693: swap
      // 694: bipush 2
      // 695: swap
      // 696: aastore
      // 697: dup_x2
      // 698: dup_x2
      // 699: pop
      // 69a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69d: bipush 1
      // 69e: swap
      // 69f: aastore
      // 6a0: dup_x1
      // 6a1: swap
      // 6a2: bipush 0
      // 6a3: swap
      // 6a4: aastore
      // 6a5: ldc2_w 7051422452696870026
      // 6a8: lload 4
      // 6aa: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6af: goto 6bd
      // 6b2: ldc2_w 8886739914784057548
      // 6b5: lload 4
      // 6b7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6bc: athrow
      // 6bd: aload 0
      // 6be: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 6c1: aload 40
      // 6c3: iload 3
      // 6c4: lload 27
      // 6c6: aload 6
      // 6c8: bipush 4
      // 6c9: anewarray 384
      // 6cc: dup_x1
      // 6cd: swap
      // 6ce: bipush 3
      // 6cf: swap
      // 6d0: aastore
      // 6d1: dup_x2
      // 6d2: dup_x2
      // 6d3: pop
      // 6d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d7: bipush 2
      // 6d8: swap
      // 6d9: aastore
      // 6da: dup_x1
      // 6db: swap
      // 6dc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6df: bipush 1
      // 6e0: swap
      // 6e1: aastore
      // 6e2: dup_x1
      // 6e3: swap
      // 6e4: bipush 0
      // 6e5: swap
      // 6e6: aastore
      // 6e7: ldc2_w 7312175491416800881
      // 6ea: lload 4
      // 6ec: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f1: aload 2
      // 6f2: lload 35
      // 6f4: bipush 1
      // 6f5: anewarray 384
      // 6f8: dup_x2
      // 6f9: dup_x2
      // 6fa: pop
      // 6fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6fe: bipush 0
      // 6ff: swap
      // 700: aastore
      // 701: ldc2_w 6953685879325832971
      // 704: lload 4
      // 706: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70b: bipush 1
      // 70c: ireturn
      // 70d: bipush 0
      // 70e: ireturn
   }

   boolean X(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/ai
      // 00e: astore 9
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/List
      // 016: astore 10
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/List
      // 028: astore 12
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/util/List
      // 030: astore 11
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/List
      // 039: astore 7
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/lw2
      // 042: astore 5
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/lang/Boolean
      // 04b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04e: istore 6
      // 050: dup
      // 051: bipush 9
      // 053: aaload
      // 054: checkcast java/lang/Boolean
      // 057: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05a: istore 8
      // 05c: dup
      // 05d: bipush 10
      // 05f: aaload
      // 060: checkcast com/zelix/l6z
      // 063: astore 13
      // 065: pop
      // 066: getstatic com/zelix/k_.a J
      // 069: lload 3
      // 06a: lxor
      // 06b: lstore 3
      // 06c: lload 3
      // 06d: dup2
      // 06e: ldc2_w 14469624767291
      // 071: lxor
      // 072: lstore 14
      // 074: dup2
      // 075: ldc2_w 36030297330812
      // 078: lxor
      // 079: lstore 16
      // 07b: dup2
      // 07c: ldc2_w 60764968240701
      // 07f: lxor
      // 080: lstore 18
      // 082: pop2
      // 083: ldc2_w 1876009734568897344
      // 086: lload 3
      // 087: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: bipush 0
      // 08d: istore 21
      // 08f: istore 20
      // 091: aload 0
      // 092: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 095: ifnull 1c4
      // 098: new java/util/ArrayList
      // 09b: dup
      // 09c: invokespecial java/util/ArrayList.<init> ()V
      // 09f: astore 22
      // 0a1: new java/util/ArrayList
      // 0a4: dup
      // 0a5: invokespecial java/util/ArrayList.<init> ()V
      // 0a8: astore 23
      // 0aa: aload 0
      // 0ab: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0ae: lload 14
      // 0b0: aload 2
      // 0b1: aload 9
      // 0b3: aload 10
      // 0b5: aload 12
      // 0b7: aload 11
      // 0b9: new java/util/ArrayList
      // 0bc: dup
      // 0bd: new com/zelix/ts
      // 0c0: dup
      // 0c1: aload 0
      // 0c2: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0c5: lload 18
      // 0c7: dup2_x1
      // 0c8: pop2
      // 0c9: invokespecial com/zelix/ts.<init> (J[Ljava/lang/Object;)V
      // 0cc: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0cf: aload 7
      // 0d1: aload 22
      // 0d3: aload 23
      // 0d5: iload 6
      // 0d7: iload 8
      // 0d9: aload 13
      // 0db: bipush 13
      // 0dd: anewarray 384
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 12
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0eb: bipush 11
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f4: bipush 10
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 9
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 8
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 7
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 6
      // 10e: swap
      // 10f: aastore
      // 110: dup_x1
      // 111: swap
      // 112: bipush 5
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 4
      // 118: swap
      // 119: aastore
      // 11a: dup_x1
      // 11b: swap
      // 11c: bipush 3
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 2
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 1
      // 127: swap
      // 128: aastore
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w 356433766455394894
      // 135: lload 3
      // 136: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 23
      // 13d: invokeinterface java/util/List.size ()I 1
      // 142: iload 20
      // 144: ifeq 1c2
      // 147: ifgt 180
      // 14a: goto 157
      // 14d: ldc2_w 2127424104205798942
      // 150: lload 3
      // 151: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 22
      // 159: invokeinterface java/util/List.size ()I 1
      // 15e: iload 20
      // 160: ifeq 1c6
      // 163: goto 170
      // 166: ldc2_w 2127424104205798942
      // 169: lload 3
      // 16a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: ifle 1c4
      // 173: goto 180
      // 176: ldc2_w 2127424104205798942
      // 179: lload 3
      // 17a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 5
      // 182: aload 0
      // 183: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 186: lload 16
      // 188: dup2_x1
      // 189: pop2
      // 18a: aload 23
      // 18c: aload 22
      // 18e: bipush 4
      // 18f: anewarray 384
      // 192: dup_x1
      // 193: swap
      // 194: bipush 3
      // 195: swap
      // 196: aastore
      // 197: dup_x1
      // 198: swap
      // 199: bipush 2
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x1
      // 19d: swap
      // 19e: bipush 1
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x2
      // 1a2: dup_x2
      // 1a3: pop
      // 1a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a7: bipush 0
      // 1a8: swap
      // 1a9: aastore
      // 1aa: ldc2_w 1867619845987438952
      // 1ad: lload 3
      // 1ae: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lq0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: pop
      // 1b4: bipush 1
      // 1b5: goto 1c2
      // 1b8: ldc2_w 2127424104205798942
      // 1bb: lload 3
      // 1bc: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: istore 21
      // 1c4: iload 21
      // 1c6: ireturn
   }

   final void W(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: istore 3
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 2
      // 20: dup
      // 21: bipush 3
      // 22: aaload
      // 23: checkcast java/util/HashMap
      // 26: astore 4
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/util/HashMap
      // 2e: astore 5
      // 30: pop
      // 31: lload 6
      // 33: dup2
      // 34: ldc2_w 0
      // 37: lxor
      // 38: lstore 8
      // 3a: pop2
      // 3b: ldc2_w 8223466915102598904
      // 3e: lload 6
      // 40: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: bipush 0
      // 46: istore 11
      // 48: istore 10
      // 4a: iload 11
      // 4c: aload 0
      // 4d: getfield com/zelix/k_.P I
      // 50: if_icmpge 9b
      // 53: aload 0
      // 54: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 57: iload 11
      // 59: aaload
      // 5a: lload 8
      // 5c: iload 3
      // 5d: iload 2
      // 5e: aload 4
      // 60: aload 5
      // 62: bipush 5
      // 63: anewarray 384
      // 66: dup_x1
      // 67: swap
      // 68: bipush 4
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 3
      // 6e: swap
      // 6f: aastore
      // 70: dup_x1
      // 71: swap
      // 72: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 75: bipush 2
      // 76: swap
      // 77: aastore
      // 78: dup_x1
      // 79: swap
      // 7a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7d: bipush 1
      // 7e: swap
      // 7f: aastore
      // 80: dup_x2
      // 81: dup_x2
      // 82: pop
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w 7824655337855832434
      // 8c: lload 6
      // 8e: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: iinc 11 1
      // 96: iload 10
      // 98: ifeq 4a
      // 9b: lload 6
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: iflt 96
      // a2: return
   }

   public boolean L(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 29036359324169L;
      return ((b1)this.H()).D(var3);
   }

   String l(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 25498554002344L;
      long var8 = var4 ^ 3436684672655L;
      return this.j(var6) + " " + ((b1)this.H()).a(var8);
   }

   public void k(Object[] var1) {
      nw var5 = (nw)var1[0];
      t6 var8 = (t6)var1[1];
      long var6 = (Long)var1[2];
      Map var9 = (Map)var1[3];
      l6q var2 = (l6q)var1[4];
      List var10 = (List)var1[5];
      loj var4 = (loj)var1[6];
      ai var3 = (ai)var1[7];
      var6 = a ^ var6;
      long var11 = var6 ^ 82924725664919L;
      m44.a<"v">(this.F, new Object[]{var5, var8, var9, var2, var10, var4, var11, var3}, 481543761346931249L, var6);
   }

   void R(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 117656906517217L;
      m44.a<"v">(this.F, new Object[]{var5, var4}, 2883576649541856468L, var2);
   }

   public void Fq(Object[] param1) {
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
      // 004: checkcast com/zelix/_o
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Map
      // 01f: astore 2
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Boolean
      // 026: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 029: istore 12
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Map
      // 031: astore 7
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/loj
      // 03a: astore 3
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/ai
      // 042: astore 18
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/lang/Long
      // 04b: invokevirtual java/lang/Long.longValue ()J
      // 04e: lstore 9
      // 050: dup
      // 051: bipush 9
      // 053: aaload
      // 054: checkcast java/util/List
      // 057: astore 17
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast com/zelix/rg
      // 060: astore 14
      // 062: dup
      // 063: bipush 11
      // 065: aaload
      // 066: checkcast java/util/Random
      // 069: astore 15
      // 06b: dup
      // 06c: bipush 12
      // 06e: aaload
      // 06f: checkcast com/zelix/t6
      // 072: astore 11
      // 074: dup
      // 075: bipush 13
      // 077: aaload
      // 078: checkcast com/zelix/ee
      // 07b: astore 13
      // 07d: dup
      // 07e: bipush 14
      // 080: aaload
      // 081: checkcast java/util/Set
      // 084: astore 8
      // 086: dup
      // 087: bipush 15
      // 089: aaload
      // 08a: checkcast com/zelix/lqu
      // 08d: astore 16
      // 08f: pop
      // 090: getstatic com/zelix/k_.a J
      // 093: lload 9
      // 095: lxor
      // 096: lstore 9
      // 098: lload 9
      // 09a: dup2
      // 09b: ldc2_w 91130470405873
      // 09e: lxor
      // 09f: lstore 19
      // 0a1: pop2
      // 0a2: ldc2_w -3555712336184164369
      // 0a5: lload 9
      // 0a7: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: istore 21
      // 0ae: aload 0
      // 0af: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0b2: iload 21
      // 0b4: ifeq 0da
      // 0b7: ifnull 168
      // 0ba: goto 0c8
      // 0bd: ldc2_w -3951523424657368399
      // 0c0: lload 9
      // 0c2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0cc: goto 0da
      // 0cf: ldc2_w -3951523424657368399
      // 0d2: lload 9
      // 0d4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 4
      // 0dc: aload 5
      // 0de: aload 6
      // 0e0: aload 2
      // 0e1: iload 12
      // 0e3: aload 7
      // 0e5: aload 3
      // 0e6: aload 18
      // 0e8: aload 17
      // 0ea: aload 14
      // 0ec: aload 15
      // 0ee: aload 11
      // 0f0: aload 13
      // 0f2: aload 8
      // 0f4: aload 16
      // 0f6: lload 19
      // 0f8: bipush 16
      // 0fa: anewarray 384
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 15
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: bipush 14
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: bipush 13
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 12
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 11
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 10
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 9
      // 129: swap
      // 12a: aastore
      // 12b: dup_x1
      // 12c: swap
      // 12d: bipush 8
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 7
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: bipush 6
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 5
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 147: bipush 4
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 3
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 2
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 1
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w -3544489230863262974
      // 161: lload 9
      // 163: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: return
   }

   void G(Object[] param1) {
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
      // 00e: checkcast java/util/List
      // 011: astore 11
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 4
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/util/Map
      // 024: astore 5
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/l6q
      // 02c: astore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Long
      // 034: astore 14
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast com/zelix/d1
      // 03d: astore 8
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast com/zelix/lk7
      // 046: astore 9
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast com/zelix/t6
      // 04f: astore 10
      // 051: dup
      // 052: bipush 9
      // 054: aaload
      // 055: checkcast java/util/List
      // 058: astore 12
      // 05a: dup
      // 05b: bipush 10
      // 05d: aaload
      // 05e: checkcast com/zelix/loj
      // 061: astore 13
      // 063: dup
      // 064: bipush 11
      // 066: aaload
      // 067: checkcast com/zelix/ai
      // 06a: astore 6
      // 06c: pop
      // 06d: getstatic com/zelix/k_.a J
      // 070: lload 2
      // 071: lxor
      // 072: lstore 2
      // 073: lload 2
      // 074: dup2
      // 075: ldc2_w 24143591057229
      // 078: lxor
      // 079: lstore 15
      // 07b: dup2
      // 07c: ldc2_w 74071726001035
      // 07f: lxor
      // 080: lstore 17
      // 082: dup2
      // 083: ldc2_w 137357409757157
      // 086: lxor
      // 087: lstore 19
      // 089: dup2
      // 08a: ldc2_w 134209810731990
      // 08d: lxor
      // 08e: lstore 21
      // 090: pop2
      // 091: ldc2_w 4874733791570368321
      // 094: lload 2
      // 095: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: istore 23
      // 09c: aload 0
      // 09d: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0a0: ifnull 343
      // 0a3: bipush 0
      // 0a4: istore 24
      // 0a6: aload 0
      // 0a7: getfield com/zelix/k_.m I
      // 0aa: iload 23
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: ifle 132
      // 0b2: ifne 130
      // 0b5: ifle 128
      // 0b8: goto 0c5
      // 0bb: ldc2_w 6660881897063714792
      // 0be: lload 2
      // 0bf: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0c9: astore 25
      // 0cb: aload 25
      // 0cd: arraylength
      // 0ce: istore 26
      // 0d0: bipush 0
      // 0d1: istore 27
      // 0d3: iload 27
      // 0d5: iload 26
      // 0d7: if_icmpge 128
      // 0da: aload 25
      // 0dc: iload 27
      // 0de: aaload
      // 0df: astore 28
      // 0e1: iload 23
      // 0e3: lload 2
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: iflt 125
      // 0e9: ifne 123
      // 0ec: aload 28
      // 0ee: bipush 0
      // 0ef: anewarray 384
      // 0f2: ldc2_w 4689968185969572080
      // 0f5: lload 2
      // 0f6: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: iload 23
      // 0fd: ifne 130
      // 100: goto 10d
      // 103: ldc2_w 6660881897063714792
      // 106: lload 2
      // 107: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: ifeq 120
      // 110: goto 11d
      // 113: ldc2_w 6660881897063714792
      // 116: lload 2
      // 117: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: iinc 24 1
      // 120: iinc 27 1
      // 123: iload 23
      // 125: ifeq 0d3
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 343
      // 12e: iload 24
      // 130: iload 23
      // 132: lload 2
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 22f
      // 138: ifne 22e
      // 13b: ifle 220
      // 13e: goto 14b
      // 141: ldc2_w 6660881897063714792
      // 144: lload 2
      // 145: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: aload 0
      // 14c: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 14f: lload 17
      // 151: bipush 1
      // 152: anewarray 384
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w 5036995078782715193
      // 161: lload 2
      // 162: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: pop
      // 168: bipush 0
      // 169: istore 26
      // 16b: iload 24
      // 16d: bipush 2
      // 16e: multianewarray 252 2
      // 172: astore 25
      // 174: bipush 0
      // 175: istore 27
      // 177: iload 27
      // 179: aload 0
      // 17a: getfield com/zelix/k_.m I
      // 17d: if_icmpge 20f
      // 180: aload 0
      // 181: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 184: iload 27
      // 186: aaload
      // 187: astore 28
      // 189: iload 23
      // 18b: lload 2
      // 18c: lconst_0
      // 18d: lcmp
      // 18e: iflt 20c
      // 191: ifne 20a
      // 194: aload 28
      // 196: bipush 0
      // 197: anewarray 384
      // 19a: ldc2_w 4689968185969572080
      // 19d: lload 2
      // 19e: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: iload 23
      // 1a5: lload 2
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: ifle 2b4
      // 1ab: ifne 2b2
      // 1ae: goto 1bb
      // 1b1: ldc2_w 6660881897063714792
      // 1b4: lload 2
      // 1b5: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: ifeq 207
      // 1be: goto 1cb
      // 1c1: ldc2_w 6660881897063714792
      // 1c4: lload 2
      // 1c5: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 25
      // 1cd: iload 26
      // 1cf: aaload
      // 1d0: bipush 0
      // 1d1: aload 28
      // 1d3: bipush 0
      // 1d4: anewarray 384
      // 1d7: ldc2_w 4842026841148176621
      // 1da: lload 2
      // 1db: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: iastore
      // 1e1: aload 25
      // 1e3: iload 26
      // 1e5: aaload
      // 1e6: bipush 1
      // 1e7: aload 28
      // 1e9: bipush 0
      // 1ea: anewarray 384
      // 1ed: ldc2_w 6479824963790003589
      // 1f0: lload 2
      // 1f1: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: iastore
      // 1f7: iinc 26 1
      // 1fa: goto 207
      // 1fd: ldc2_w 6660881897063714792
      // 200: lload 2
      // 201: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: iinc 27 1
      // 20a: iload 23
      // 20c: ifeq 177
      // 20f: lload 2
      // 210: lconst_0
      // 211: lcmp
      // 212: iflt 2b0
      // 215: iload 23
      // 217: lload 2
      // 218: lconst_0
      // 219: lcmp
      // 21a: iflt 2b2
      // 21d: ifeq 235
      // 220: bipush 0
      // 221: goto 22e
      // 224: ldc2_w 6660881897063714792
      // 227: lload 2
      // 228: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: athrow
      // 22e: bipush 0
      // 22f: multianewarray 252 2
      // 233: astore 25
      // 235: aload 0
      // 236: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 239: aload 11
      // 23b: iload 4
      // 23d: aload 5
      // 23f: aload 25
      // 241: aload 7
      // 243: aload 14
      // 245: aload 8
      // 247: aload 9
      // 249: aload 10
      // 24b: aload 12
      // 24d: aload 13
      // 24f: lload 15
      // 251: aload 6
      // 253: bipush 13
      // 255: anewarray 384
      // 258: dup_x1
      // 259: swap
      // 25a: bipush 12
      // 25c: swap
      // 25d: aastore
      // 25e: dup_x2
      // 25f: dup_x2
      // 260: pop
      // 261: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 264: bipush 11
      // 266: swap
      // 267: aastore
      // 268: dup_x1
      // 269: swap
      // 26a: bipush 10
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 9
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 8
      // 278: swap
      // 279: aastore
      // 27a: dup_x1
      // 27b: swap
      // 27c: bipush 7
      // 27e: swap
      // 27f: aastore
      // 280: dup_x1
      // 281: swap
      // 282: bipush 6
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 5
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 4
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 3
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 2
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 29f: bipush 1
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: bipush 0
      // 2a5: swap
      // 2a6: aastore
      // 2a7: ldc2_w 6363813118416149531
      // 2aa: lload 2
      // 2ab: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: iload 4
      // 2b2: iload 23
      // 2b4: lload 2
      // 2b5: lconst_0
      // 2b6: lcmp
      // 2b7: iflt 303
      // 2ba: ifne 2f6
      // 2bd: ifne 343
      // 2c0: goto 2cd
      // 2c3: ldc2_w 6660881897063714792
      // 2c6: lload 2
      // 2c7: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: aload 0
      // 2ce: iload 23
      // 2d0: lload 2
      // 2d1: lconst_0
      // 2d2: lcmp
      // 2d3: ifle 321
      // 2d6: ifne 314
      // 2d9: goto 2e6
      // 2dc: ldc2_w 6660881897063714792
      // 2df: lload 2
      // 2e0: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: getfield com/zelix/k_.j I
      // 2e9: goto 2f6
      // 2ec: ldc2_w 6660881897063714792
      // 2ef: lload 2
      // 2f0: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: aload 9
      // 2f8: lload 19
      // 2fa: ldc2_w 6822813700752099834
      // 2fd: lload 2
      // 2fe: invokedynamic p (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: if_icmpge 343
      // 306: aload 0
      // 307: goto 314
      // 30a: ldc2_w 6660881897063714792
      // 30d: lload 2
      // 30e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: athrow
      // 314: aload 9
      // 316: lload 19
      // 318: ldc2_w 6822813700752099834
      // 31b: lload 2
      // 31c: invokedynamic p (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: lload 21
      // 323: dup2_x1
      // 324: pop2
      // 325: bipush 2
      // 326: anewarray 384
      // 329: dup_x1
      // 32a: swap
      // 32b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32e: bipush 1
      // 32f: swap
      // 330: aastore
      // 331: dup_x2
      // 332: dup_x2
      // 333: pop
      // 334: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 337: bipush 0
      // 338: swap
      // 339: aastore
      // 33a: ldc2_w 6711439985206205253
      // 33d: lload 2
      // 33e: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: return
   }

   boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 39279853070854L;
      return ((b1)this.H()).f(var4);
   }

   void K(Object[] param1) {
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
      // 00a: istore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/t6
      // 012: astore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/ArrayList
      // 01a: astore 4
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/loj
      // 022: astore 3
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: invokevirtual java/lang/Long.longValue ()J
      // 02c: lstore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/ai
      // 034: astore 2
      // 035: pop
      // 036: getstatic com/zelix/k_.a J
      // 039: lload 7
      // 03b: lxor
      // 03c: lstore 7
      // 03e: lload 7
      // 040: dup2
      // 041: ldc2_w 95546436856641
      // 044: lxor
      // 045: dup2
      // 046: bipush 32
      // 048: lushr
      // 049: l2i
      // 04a: istore 9
      // 04c: dup2
      // 04d: bipush 32
      // 04f: lshl
      // 050: bipush 48
      // 052: lushr
      // 053: l2i
      // 054: istore 10
      // 056: dup2
      // 057: bipush 48
      // 059: lshl
      // 05a: bipush 48
      // 05c: lushr
      // 05d: l2i
      // 05e: istore 11
      // 060: pop2
      // 061: dup2
      // 062: ldc2_w 137601630563786
      // 065: lxor
      // 066: dup2
      // 067: bipush 48
      // 069: lushr
      // 06a: l2i
      // 06b: istore 12
      // 06d: dup2
      // 06e: bipush 16
      // 070: lshl
      // 071: bipush 32
      // 073: lushr
      // 074: l2i
      // 075: istore 13
      // 077: dup2
      // 078: bipush 48
      // 07a: lshl
      // 07b: bipush 48
      // 07d: lushr
      // 07e: l2i
      // 07f: istore 14
      // 081: pop2
      // 082: dup2
      // 083: ldc2_w 104875449654709
      // 086: lxor
      // 087: lstore 15
      // 089: dup2
      // 08a: ldc2_w 129134535999321
      // 08d: lxor
      // 08e: lstore 17
      // 090: dup2
      // 091: ldc2_w 34531242434251
      // 094: lxor
      // 095: lstore 19
      // 097: dup2
      // 098: ldc2_w 102804290421277
      // 09b: lxor
      // 09c: lstore 21
      // 09e: pop2
      // 09f: ldc2_w -3326787097960996708
      // 0a2: lload 7
      // 0a4: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: istore 23
      // 0ab: aload 0
      // 0ac: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0af: ifnull 262
      // 0b2: new com/zelix/l6q
      // 0b5: dup
      // 0b6: iload 12
      // 0b8: i2s
      // 0b9: iload 13
      // 0bb: iload 14
      // 0bd: invokespecial com/zelix/l6q.<init> (SII)V
      // 0c0: astore 24
      // 0c2: aconst_null
      // 0c3: astore 25
      // 0c5: aload 0
      // 0c6: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0c9: arraylength
      // 0ca: istore 26
      // 0cc: bipush 0
      // 0cd: istore 27
      // 0cf: iload 27
      // 0d1: iload 26
      // 0d3: if_icmpge 1d8
      // 0d6: aload 0
      // 0d7: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0da: iload 27
      // 0dc: aaload
      // 0dd: iload 23
      // 0df: ifeq 12c
      // 0e2: instanceof com/zelix/ku
      // 0e5: lload 7
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 22d
      // 0ec: iload 23
      // 0ee: ifeq 22d
      // 0f1: goto 0ff
      // 0f4: ldc2_w -3001036881786599998
      // 0f7: lload 7
      // 0f9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: lload 7
      // 101: lconst_0
      // 102: lcmp
      // 103: iflt 1d5
      // 106: ifeq 1d0
      // 109: goto 117
      // 10c: ldc2_w -3001036881786599998
      // 10f: lload 7
      // 111: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 0
      // 118: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 11b: iload 27
      // 11d: aaload
      // 11e: goto 12c
      // 121: ldc2_w -3001036881786599998
      // 124: lload 7
      // 126: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: checkcast com/zelix/ku
      // 12f: astore 28
      // 131: aload 25
      // 133: iload 23
      // 135: ifeq 167
      // 138: ifnonnull 169
      // 13b: goto 149
      // 13e: ldc2_w -3001036881786599998
      // 141: lload 7
      // 143: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 0
      // 14a: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 14d: aload 3
      // 14e: iload 9
      // 150: iload 10
      // 152: aload 2
      // 153: iload 11
      // 155: i2c
      // 156: invokevirtual com/zelix/bc.n (Lcom/zelix/loj;IILcom/zelix/ai;C)Lcom/zelix/l;
      // 159: goto 167
      // 15c: ldc2_w -3001036881786599998
      // 15f: lload 7
      // 161: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: astore 25
      // 169: aload 28
      // 16b: iload 6
      // 16d: aload 0
      // 16e: getfield com/zelix/k_.j I
      // 171: lload 21
      // 173: aload 25
      // 175: aload 5
      // 177: aload 4
      // 179: aload 0
      // 17a: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 17d: bipush 0
      // 17e: anewarray 384
      // 181: ldc2_w -3738510001962987270
      // 184: lload 7
      // 186: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lkv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: aload 24
      // 18d: bipush 8
      // 18f: anewarray 384
      // 192: dup_x1
      // 193: swap
      // 194: bipush 7
      // 196: swap
      // 197: aastore
      // 198: dup_x1
      // 199: swap
      // 19a: bipush 6
      // 19c: swap
      // 19d: aastore
      // 19e: dup_x1
      // 19f: swap
      // 1a0: bipush 5
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: bipush 4
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x1
      // 1a9: swap
      // 1aa: bipush 3
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 2
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x1
      // 1b7: swap
      // 1b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c3: bipush 0
      // 1c4: swap
      // 1c5: aastore
      // 1c6: ldc2_w -3530119388170470516
      // 1c9: lload 7
      // 1cb: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: iinc 27 1
      // 1d3: iload 23
      // 1d5: ifne 0cf
      // 1d8: lload 7
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: ifle 0d6
      // 1df: aload 25
      // 1e1: iload 23
      // 1e3: ifeq 1f9
      // 1e6: ifnull 212
      // 1e9: goto 1f7
      // 1ec: ldc2_w -3001036881786599998
      // 1ef: lload 7
      // 1f1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: athrow
      // 1f7: aload 25
      // 1f9: lload 19
      // 1fb: bipush 1
      // 1fc: anewarray 384
      // 1ff: dup_x2
      // 200: dup_x2
      // 201: pop
      // 202: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: ldc2_w -3634877197709010427
      // 20b: lload 7
      // 20d: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: aload 24
      // 214: lload 15
      // 216: bipush 1
      // 217: anewarray 384
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 0
      // 221: swap
      // 222: aastore
      // 223: ldc2_w -3729797519616544963
      // 226: lload 7
      // 228: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: ifle 262
      // 230: aload 0
      // 231: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 234: aload 24
      // 236: lload 17
      // 238: bipush 2
      // 239: anewarray 384
      // 23c: dup_x2
      // 23d: dup_x2
      // 23e: pop
      // 23f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 242: bipush 1
      // 243: swap
      // 244: aastore
      // 245: dup_x1
      // 246: swap
      // 247: bipush 0
      // 248: swap
      // 249: aastore
      // 24a: ldc2_w -3693023924842190004
      // 24d: lload 7
      // 24f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: goto 262
      // 257: ldc2_w -3001036881786599998
      // 25a: lload 7
      // 25c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: athrow
      // 262: return
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: dup2
      // 10: ldc2_w 113240848016893
      // 13: lxor
      // 14: lstore 8
      // 16: dup2
      // 17: ldc2_w 0
      // 1a: lxor
      // 1b: lstore 10
      // 1d: pop2
      // 1e: ldc2_w 6170399952317654249
      // 21: lload 2
      // 22: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 1
      // 28: aload 0
      // 29: getfield com/zelix/k_.b Lcom/zelix/x8;
      // 2c: aload 0
      // 2d: aload 0
      // 2e: invokevirtual com/zelix/k_.H ()Lcom/zelix/_4;
      // 31: lload 8
      // 33: dup2_x1
      // 34: pop2
      // 35: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 38: pop
      // 39: istore 12
      // 3b: bipush 0
      // 3c: istore 13
      // 3e: iload 13
      // 40: aload 0
      // 41: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 44: arraylength
      // 45: if_icmpge 7b
      // 48: aload 0
      // 49: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 4c: iload 13
      // 4e: aaload
      // 4f: aload 1
      // 50: lload 6
      // 52: invokevirtual com/zelix/be.z (Lcom/zelix/gu;J)V
      // 55: iinc 13 1
      // 58: iload 12
      // 5a: lload 2
      // 5b: lconst_0
      // 5c: lcmp
      // 5d: ifle 86
      // 60: ifeq 7e
      // 63: iload 12
      // 65: ifne 3e
      // 68: lload 2
      // 69: lconst_0
      // 6a: lcmp
      // 6b: iflt 58
      // 6e: goto 7b
      // 71: ldc2_w 5922064228119085495
      // 74: lload 2
      // 75: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: bipush 0
      // 7c: istore 13
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt c8
      // 84: iload 13
      // 86: aload 0
      // 87: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 8a: arraylength
      // 8b: if_icmpge c8
      // 8e: aload 0
      // 8f: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 92: iload 13
      // 94: aaload
      // 95: aload 1
      // 96: lload 4
      // 98: invokevirtual com/zelix/kw.z (Lcom/zelix/gu;J)V
      // 9b: iinc 13 1
      // 9e: iload 12
      // a0: ifeq fe
      // a3: goto b0
      // a6: ldc2_w 5922064228119085495
      // a9: lload 2
      // aa: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: iload 12
      // b2: ifne 7e
      // b5: lload 2
      // b6: lconst_0
      // b7: lcmp
      // b8: iflt 7e
      // bb: goto c8
      // be: ldc2_w 5922064228119085495
      // c1: lload 2
      // c2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 0
      // c9: getfield com/zelix/k_.F Lcom/zelix/bc;
      // cc: iload 12
      // ce: ifeq f2
      // d1: ifnull fe
      // d4: goto e1
      // d7: ldc2_w 5922064228119085495
      // da: lload 2
      // db: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: athrow
      // e1: aload 0
      // e2: getfield com/zelix/k_.F Lcom/zelix/bc;
      // e5: goto f2
      // e8: ldc2_w 5922064228119085495
      // eb: lload 2
      // ec: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: athrow
      // f2: aload 1
      // f3: lload 10
      // f5: ldc2_w 6211591946659033538
      // f8: lload 2
      // f9: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fe: return
   }

   String L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 5913532278928L;
      return m44.a<"p">((b1)this.H(), var4, -285102134142074827L, var2);
   }

   static int m(Object[] var0) {
      _9[] var1 = (_9[])var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      int var4 = (int)((var2 ^ 139397003592937L) >>> 48);
      long var5 = (var2 ^ 139397003592937L) << 16 >>> 16;
      int var10000 = m44.a<"l">(2435790206996149546L, var2);
      int var8 = 0;
      _9[] var9 = var1;
      int var10 = var1.length;
      int var11 = 0;
      byte var7 = (byte)var10000;

      while (true) {
         if (var11 < var10) {
            _9 var12 = var9[var11];
            var10000 = var8 + var12.y((char)var4, var5);
            if (var2 > 0L) {
               if (var7 != 0) {
                  break;
               }

               var8 = var10000;
               var11++;
               var10000 = var7;
            }

            if (var10000 == 0) {
               continue;
            }
         }

         var10000 = var8;
         break;
      }

      return var10000;
   }

   public int[] I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 85628687606431L;
      long var6 = var2 ^ 20284847895527L;
      boolean var10000 = m44.a<"i">(-3217676062182635585L, var2);
      ks var9 = m44.a<"v">(this, new Object[]{var4}, -3100983514058744039L, var2);
      boolean var8 = var10000;

      try {
         if (var8) {
            return m44.a<"v">(var9, new Object[]{var6}, -2974406674314235705L, var2);
         }

         if (var9 == null) {
            return new int[0];
         }
      } catch (nn var10) {
         throw m44.a<"i">(var10, -3706962846561165546L, var2);
      }

      return m44.a<"v">(var9, new Object[]{var6}, -2974406674314235705L, var2);
   }

   public void e(Object[] var1) {
      ii var7 = (ii)var1[0];
      long var4 = (Long)var1[1];
      bn var2 = (bn)var1[2];
      Set var3 = (Set)var1[3];
      h0 var9 = (h0)var1[4];
      List var8 = (List)var1[5];
      t6 var6 = (t6)var1[6];
      var4 = a ^ var4;
      long var10 = var4 ^ 114475654126597L;
      m44.a<"v">(this.F, new Object[]{var7, var10, var2, var3, var9, var8, var6}, -5122398854752703102L, var4);
   }

   void j(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/ai
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/t6
      // 016: astore 5
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 2
      // 02a: pop
      // 02b: getstatic com/zelix/k_.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 96002252445658
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 110907526679682
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 74097021494201
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 72936985306276
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 96298605326895
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 30875498840252
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 73865130055866
      // 063: lxor
      // 064: lstore 20
      // 066: dup2
      // 067: ldc2_w 84733166603278
      // 06a: lxor
      // 06b: lstore 22
      // 06d: dup2
      // 06e: ldc2_w 34745946008622
      // 071: lxor
      // 072: lstore 24
      // 074: dup2
      // 075: ldc2_w 65948330496205
      // 078: lxor
      // 079: lstore 26
      // 07b: dup2
      // 07c: ldc2_w 43424556822582
      // 07f: lxor
      // 080: lstore 28
      // 082: dup2
      // 083: ldc2_w 81556410545808
      // 086: lxor
      // 087: lstore 30
      // 089: pop2
      // 08a: ldc2_w -6784736794359892688
      // 08d: lload 6
      // 08f: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: istore 32
      // 096: aload 0
      // 097: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 09a: iload 32
      // 09c: ifne 0c2
      // 09f: ifnull 566
      // 0a2: goto 0b0
      // 0a5: ldc2_w -4755386071778136679
      // 0a8: lload 6
      // 0aa: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0b4: goto 0c2
      // 0b7: ldc2_w -4755386071778136679
      // 0ba: lload 6
      // 0bc: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 3
      // 0c3: aload 4
      // 0c5: bipush 1
      // 0c6: lload 8
      // 0c8: invokevirtual com/zelix/bc.N (Lcom/zelix/loj;Lcom/zelix/ai;ZJ)Lcom/zelix/l;
      // 0cb: astore 33
      // 0cd: aload 33
      // 0cf: lload 18
      // 0d1: bipush 1
      // 0d2: anewarray 384
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w -6877141293122014015
      // 0e1: lload 6
      // 0e3: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: lload 6
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 151
      // 0ef: iload 32
      // 0f1: ifne 151
      // 0f4: ifne 12c
      // 0f7: goto 105
      // 0fa: ldc2_w -4755386071778136679
      // 0fd: lload 6
      // 0ff: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 0
      // 106: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 109: bipush 0
      // 10a: bipush 1
      // 10b: anewarray 384
      // 10e: dup_x1
      // 10f: swap
      // 110: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: ldc2_w -6447551197179744671
      // 119: lload 6
      // 11b: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: return
      // 121: ldc2_w -4755386071778136679
      // 124: lload 6
      // 126: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 0
      // 12d: iload 32
      // 12f: ifne 183
      // 132: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 135: bipush 0
      // 136: anewarray 384
      // 139: ldc2_w -6523288048780295439
      // 13c: lload 6
      // 13e: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: goto 151
      // 146: ldc2_w -4755386071778136679
      // 149: lload 6
      // 14b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: lload 6
      // 153: lconst_0
      // 154: lcmp
      // 155: iflt 165
      // 158: ifne 182
      // 15b: ldc2_w -5163016820734291353
      // 15e: lload 6
      // 160: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: ifne 182
      // 168: goto 176
      // 16b: ldc2_w -4755386071778136679
      // 16e: lload 6
      // 170: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: return
      // 177: ldc2_w -4755386071778136679
      // 17a: lload 6
      // 17c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 0
      // 183: lload 10
      // 185: bipush 1
      // 186: anewarray 384
      // 189: dup_x2
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w -6579985623548776874
      // 195: lload 6
      // 197: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/kk; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: astore 34
      // 19e: aload 34
      // 1a0: iload 32
      // 1a2: lload 6
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 1c0
      // 1a9: ifne 1bf
      // 1ac: ifnull 23f
      // 1af: goto 1bd
      // 1b2: ldc2_w -4755386071778136679
      // 1b5: lload 6
      // 1b7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 34
      // 1bf: bipush 0
      // 1c0: anewarray 384
      // 1c3: ldc2_w -4938336499924549386
      // 1c6: lload 6
      // 1c8: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: astore 36
      // 1cf: new com/zelix/gu
      // 1d2: dup
      // 1d3: sipush 32400
      // 1d6: ldc2_w 7804595505326954612
      // 1d9: lload 6
      // 1db: lxor
      // 1dc: invokedynamic n (IJ)I bsm=com/zelix/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: lload 22
      // 1e3: invokespecial com/zelix/gu.<init> (IJ)V
      // 1e6: astore 37
      // 1e8: aload 34
      // 1ea: aload 37
      // 1ec: lload 24
      // 1ee: ldc2_w -6510233165805380891
      // 1f1: lload 6
      // 1f3: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: aload 37
      // 1fa: lload 28
      // 1fc: bipush 1
      // 1fd: anewarray 384
      // 200: dup_x2
      // 201: dup_x2
      // 202: pop
      // 203: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 206: bipush 0
      // 207: swap
      // 208: aastore
      // 209: ldc2_w -6821457194123818363
      // 20c: lload 6
      // 20e: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: lload 12
      // 215: bipush 2
      // 216: anewarray 384
      // 219: dup_x2
      // 21a: dup_x2
      // 21b: pop
      // 21c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21f: bipush 1
      // 220: swap
      // 221: aastore
      // 222: dup_x1
      // 223: swap
      // 224: bipush 0
      // 225: swap
      // 226: aastore
      // 227: ldc2_w -4721757066452750742
      // 22a: lload 6
      // 22c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: astore 35
      // 233: lload 6
      // 235: lconst_0
      // 236: lcmp
      // 237: ifle 255
      // 23a: iload 32
      // 23c: ifeq 261
      // 23f: aload 5
      // 241: sipush 21041
      // 244: ldc2_w 7906928158944376439
      // 247: lload 6
      // 249: lxor
      // 24a: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: aload 2
      // 250: invokevirtual com/zelix/t6.t (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/x8;
      // 253: astore 36
      // 255: ldc2_w -5078217598676352155
      // 258: lload 6
      // 25a: invokedynamic j (JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: astore 35
      // 261: new com/zelix/kk
      // 264: dup
      // 265: lload 20
      // 267: aload 0
      // 268: aload 36
      // 26a: bipush 0
      // 26b: invokespecial com/zelix/kk.<init> (JLcom/zelix/_4;Lcom/zelix/x8;I)V
      // 26e: astore 37
      // 270: ldc2_w -6394800920154004007
      // 273: lload 6
      // 275: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: ldc "1"
      // 27c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27f: iload 32
      // 281: ifne 300
      // 284: ifeq 2e3
      // 287: goto 295
      // 28a: ldc2_w -4755386071778136679
      // 28d: lload 6
      // 28f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: aload 33
      // 297: aload 37
      // 299: aload 5
      // 29b: aload 35
      // 29d: lload 26
      // 29f: aload 2
      // 2a0: bipush 0
      // 2a1: bipush 6
      // 2a3: anewarray 384
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ab: bipush 5
      // 2ac: swap
      // 2ad: aastore
      // 2ae: dup_x1
      // 2af: swap
      // 2b0: bipush 4
      // 2b1: swap
      // 2b2: aastore
      // 2b3: dup_x2
      // 2b4: dup_x2
      // 2b5: pop
      // 2b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b9: bipush 3
      // 2ba: swap
      // 2bb: aastore
      // 2bc: dup_x1
      // 2bd: swap
      // 2be: bipush 2
      // 2bf: swap
      // 2c0: aastore
      // 2c1: dup_x1
      // 2c2: swap
      // 2c3: bipush 1
      // 2c4: swap
      // 2c5: aastore
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: bipush 0
      // 2c9: swap
      // 2ca: aastore
      // 2cb: ldc2_w -5168290300524004706
      // 2ce: lload 6
      // 2d0: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_n; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: astore 38
      // 2d7: lload 6
      // 2d9: lconst_0
      // 2da: lcmp
      // 2db: ifle 46b
      // 2de: iload 32
      // 2e0: ifeq 454
      // 2e3: ldc2_w -6394800920154004007
      // 2e6: lload 6
      // 2e8: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: ldc "2"
      // 2ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f2: goto 300
      // 2f5: ldc2_w -4755386071778136679
      // 2f8: lload 6
      // 2fa: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: athrow
      // 300: ifeq 351
      // 303: aload 33
      // 305: aload 37
      // 307: aload 5
      // 309: aload 35
      // 30b: lload 26
      // 30d: aload 2
      // 30e: bipush 1
      // 30f: bipush 6
      // 311: anewarray 384
      // 314: dup_x1
      // 315: swap
      // 316: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 319: bipush 5
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 4
      // 31f: swap
      // 320: aastore
      // 321: dup_x2
      // 322: dup_x2
      // 323: pop
      // 324: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 327: bipush 3
      // 328: swap
      // 329: aastore
      // 32a: dup_x1
      // 32b: swap
      // 32c: bipush 2
      // 32d: swap
      // 32e: aastore
      // 32f: dup_x1
      // 330: swap
      // 331: bipush 1
      // 332: swap
      // 333: aastore
      // 334: dup_x1
      // 335: swap
      // 336: bipush 0
      // 337: swap
      // 338: aastore
      // 339: ldc2_w -5168290300524004706
      // 33c: lload 6
      // 33e: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_n; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: astore 38
      // 345: lload 6
      // 347: lconst_0
      // 348: lcmp
      // 349: ifle 46b
      // 34c: iload 32
      // 34e: ifeq 454
      // 351: aload 33
      // 353: aload 37
      // 355: aload 5
      // 357: aload 35
      // 359: lload 26
      // 35b: aload 2
      // 35c: bipush 0
      // 35d: bipush 6
      // 35f: anewarray 384
      // 362: dup_x1
      // 363: swap
      // 364: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 367: bipush 5
      // 368: swap
      // 369: aastore
      // 36a: dup_x1
      // 36b: swap
      // 36c: bipush 4
      // 36d: swap
      // 36e: aastore
      // 36f: dup_x2
      // 370: dup_x2
      // 371: pop
      // 372: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 375: bipush 3
      // 376: swap
      // 377: aastore
      // 378: dup_x1
      // 379: swap
      // 37a: bipush 2
      // 37b: swap
      // 37c: aastore
      // 37d: dup_x1
      // 37e: swap
      // 37f: bipush 1
      // 380: swap
      // 381: aastore
      // 382: dup_x1
      // 383: swap
      // 384: bipush 0
      // 385: swap
      // 386: aastore
      // 387: ldc2_w -5168290300524004706
      // 38a: lload 6
      // 38c: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_n; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: astore 39
      // 393: aload 33
      // 395: aload 37
      // 397: aload 5
      // 399: aload 35
      // 39b: lload 26
      // 39d: aload 2
      // 39e: bipush 1
      // 39f: bipush 6
      // 3a1: anewarray 384
      // 3a4: dup_x1
      // 3a5: swap
      // 3a6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a9: bipush 5
      // 3aa: swap
      // 3ab: aastore
      // 3ac: dup_x1
      // 3ad: swap
      // 3ae: bipush 4
      // 3af: swap
      // 3b0: aastore
      // 3b1: dup_x2
      // 3b2: dup_x2
      // 3b3: pop
      // 3b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b7: bipush 3
      // 3b8: swap
      // 3b9: aastore
      // 3ba: dup_x1
      // 3bb: swap
      // 3bc: bipush 2
      // 3bd: swap
      // 3be: aastore
      // 3bf: dup_x1
      // 3c0: swap
      // 3c1: bipush 1
      // 3c2: swap
      // 3c3: aastore
      // 3c4: dup_x1
      // 3c5: swap
      // 3c6: bipush 0
      // 3c7: swap
      // 3c8: aastore
      // 3c9: ldc2_w -5168290300524004706
      // 3cc: lload 6
      // 3ce: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_n; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: astore 40
      // 3d5: aload 40
      // 3d7: lload 6
      // 3d9: lconst_0
      // 3da: lcmp
      // 3db: ifle 3f7
      // 3de: iload 32
      // 3e0: ifne 452
      // 3e3: lload 14
      // 3e5: bipush 2
      // 3e6: anewarray 384
      // 3e9: dup_x2
      // 3ea: dup_x2
      // 3eb: pop
      // 3ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ef: bipush 1
      // 3f0: swap
      // 3f1: aastore
      // 3f2: dup_x1
      // 3f3: swap
      // 3f4: bipush 0
      // 3f5: swap
      // 3f6: aastore
      // 3f7: ldc2_w -4737352131700859160
      // 3fa: lload 6
      // 3fc: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: aload 39
      // 403: lload 14
      // 405: bipush 2
      // 406: anewarray 384
      // 409: dup_x2
      // 40a: dup_x2
      // 40b: pop
      // 40c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 40f: bipush 1
      // 410: swap
      // 411: aastore
      // 412: dup_x1
      // 413: swap
      // 414: bipush 0
      // 415: swap
      // 416: aastore
      // 417: ldc2_w -4737352131700859160
      // 41a: lload 6
      // 41c: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: if_icmpge 442
      // 424: goto 432
      // 427: ldc2_w -4755386071778136679
      // 42a: lload 6
      // 42c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 431: athrow
      // 432: aload 40
      // 434: astore 38
      // 436: lload 6
      // 438: lconst_0
      // 439: lcmp
      // 43a: ifle 46b
      // 43d: iload 32
      // 43f: ifeq 454
      // 442: aload 39
      // 444: goto 452
      // 447: ldc2_w -4755386071778136679
      // 44a: lload 6
      // 44c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: athrow
      // 452: astore 38
      // 454: aload 37
      // 456: aload 38
      // 458: bipush 1
      // 459: anewarray 384
      // 45c: dup_x1
      // 45d: swap
      // 45e: bipush 0
      // 45f: swap
      // 460: aastore
      // 461: ldc2_w -6884456402709343563
      // 464: lload 6
      // 466: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: aload 34
      // 46d: iload 32
      // 46f: lload 6
      // 471: lconst_0
      // 472: lcmp
      // 473: ifle 4cc
      // 476: ifne 4cb
      // 479: ifnull 4bb
      // 47c: goto 48a
      // 47f: ldc2_w -4755386071778136679
      // 482: lload 6
      // 484: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 489: athrow
      // 48a: aload 0
      // 48b: lload 16
      // 48d: bipush 1
      // 48e: anewarray 384
      // 491: dup_x2
      // 492: dup_x2
      // 493: pop
      // 494: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 497: bipush 0
      // 498: swap
      // 499: aastore
      // 49a: ldc2_w -6391654496638595777
      // 49d: lload 6
      // 49f: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: istore 39
      // 4a6: aload 0
      // 4a7: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 4aa: iload 39
      // 4ac: aload 37
      // 4ae: aastore
      // 4af: lload 6
      // 4b1: lconst_0
      // 4b2: lcmp
      // 4b3: ifle 54b
      // 4b6: iload 32
      // 4b8: ifeq 530
      // 4bb: aload 37
      // 4bd: goto 4cb
      // 4c0: ldc2_w -4755386071778136679
      // 4c3: lload 6
      // 4c5: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: athrow
      // 4cb: bipush 0
      // 4cc: anewarray 384
      // 4cf: ldc2_w -6870971464505580762
      // 4d2: lload 6
      // 4d4: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d9: iload 32
      // 4db: ifne 503
      // 4de: ifle 530
      // 4e1: goto 4ef
      // 4e4: ldc2_w -4755386071778136679
      // 4e7: lload 6
      // 4e9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: athrow
      // 4ef: aload 0
      // 4f0: getfield com/zelix/k_.P I
      // 4f3: bipush 1
      // 4f4: iadd
      // 4f5: goto 503
      // 4f8: ldc2_w -4755386071778136679
      // 4fb: lload 6
      // 4fd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: athrow
      // 503: anewarray 537
      // 506: astore 39
      // 508: aload 0
      // 509: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 50c: bipush 0
      // 50d: aload 39
      // 50f: bipush 0
      // 510: aload 0
      // 511: getfield com/zelix/k_.P I
      // 514: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 517: aload 39
      // 519: aload 0
      // 51a: getfield com/zelix/k_.P I
      // 51d: aload 37
      // 51f: aastore
      // 520: aload 0
      // 521: aload 39
      // 523: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 526: aload 0
      // 527: dup
      // 528: getfield com/zelix/k_.P I
      // 52b: bipush 1
      // 52c: iadd
      // 52d: putfield com/zelix/k_.P I
      // 530: aload 0
      // 531: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 534: bipush 0
      // 535: bipush 1
      // 536: anewarray 384
      // 539: dup_x1
      // 53a: swap
      // 53b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 53e: bipush 0
      // 53f: swap
      // 540: aastore
      // 541: ldc2_w -6447551197179744671
      // 544: lload 6
      // 546: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54b: aload 33
      // 54d: lload 30
      // 54f: bipush 1
      // 550: anewarray 384
      // 553: dup_x2
      // 554: dup_x2
      // 555: pop
      // 556: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 559: bipush 0
      // 55a: swap
      // 55b: aastore
      // 55c: ldc2_w -6497278944693030306
      // 55f: lload 6
      // 561: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 566: return
   }

   k_(
      _4 param1,
      int param2,
      String param3,
      h1 param4,
      l6q param5,
      l6q param6,
      l6q param7,
      l6q param8,
      l6q param9,
      l6q param10,
      l6q param11,
      l6q param12,
      PrintWriter param13,
      long param14,
      f8 param16,
      l6q param17
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/k_.a J
      // 003: lload 14
      // 005: lxor
      // 006: lstore 14
      // 008: lload 14
      // 00a: dup2
      // 00b: ldc2_w 34786355164710
      // 00e: lxor
      // 00f: dup2
      // 010: bipush 48
      // 012: lushr
      // 013: l2i
      // 014: istore 18
      // 016: dup2
      // 017: bipush 16
      // 019: lshl
      // 01a: bipush 16
      // 01c: lushr
      // 01d: lstore 19
      // 01f: pop2
      // 020: dup2
      // 021: ldc2_w 33073120197484
      // 024: lxor
      // 025: lstore 21
      // 027: dup2
      // 028: ldc2_w 130096098194910
      // 02b: lxor
      // 02c: lstore 23
      // 02e: dup2
      // 02f: ldc2_w 77737971803043
      // 032: lxor
      // 033: lstore 25
      // 035: dup2
      // 036: ldc2_w 123454076709043
      // 039: lxor
      // 03a: lstore 27
      // 03c: dup2
      // 03d: ldc2_w 79849600207364
      // 040: lxor
      // 041: lstore 29
      // 043: dup2
      // 044: ldc2_w 14786819881924
      // 047: lxor
      // 048: lstore 31
      // 04a: pop2
      // 04b: ldc2_w 3301590986872347801
      // 04e: lload 14
      // 050: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 0
      // 056: aload 1
      // 057: iload 2
      // 058: aload 3
      // 059: lload 29
      // 05b: aload 4
      // 05d: aload 5
      // 05f: invokespecial com/zelix/kw.<init> (Lcom/zelix/_4;ILjava/lang/String;JLcom/zelix/h1;Lcom/zelix/l6q;)V
      // 062: aload 0
      // 063: aload 4
      // 065: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 068: putfield com/zelix/k_.A I
      // 06b: aload 0
      // 06c: aload 4
      // 06e: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 071: putfield com/zelix/k_.j I
      // 074: aload 0
      // 075: new com/zelix/bc
      // 078: dup
      // 079: aload 0
      // 07a: iload 18
      // 07c: i2s
      // 07d: aload 4
      // 07f: aload 17
      // 081: aload 7
      // 083: lload 19
      // 085: aload 8
      // 087: aload 9
      // 089: aload 10
      // 08b: aload 11
      // 08d: aload 12
      // 08f: invokespecial com/zelix/bc.<init> (Lcom/zelix/_4;SLcom/zelix/h1;Lcom/zelix/l6q;Lcom/zelix/l6q;JLcom/zelix/l6q;Lcom/zelix/l6q;Lcom/zelix/l6q;Lcom/zelix/l6q;Lcom/zelix/l6q;)V
      // 092: putfield com/zelix/k_.F Lcom/zelix/bc;
      // 095: aload 0
      // 096: aload 4
      // 098: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 09b: putfield com/zelix/k_.m I
      // 09e: aload 0
      // 09f: aload 0
      // 0a0: getfield com/zelix/k_.m I
      // 0a3: anewarray 280
      // 0a6: putfield com/zelix/k_.U [Lcom/zelix/be;
      // 0a9: istore 33
      // 0ab: bipush 0
      // 0ac: istore 34
      // 0ae: iload 34
      // 0b0: aload 0
      // 0b1: getfield com/zelix/k_.m I
      // 0b4: if_icmpge 0f7
      // 0b7: aload 0
      // 0b8: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0bb: iload 34
      // 0bd: new com/zelix/be
      // 0c0: dup
      // 0c1: lload 27
      // 0c3: aload 0
      // 0c4: aload 4
      // 0c6: aload 17
      // 0c8: aload 10
      // 0ca: invokespecial com/zelix/be.<init> (JLcom/zelix/_4;Lcom/zelix/h1;Lcom/zelix/l6q;Lcom/zelix/l6q;)V
      // 0cd: aastore
      // 0ce: iinc 34 1
      // 0d1: iload 33
      // 0d3: lload 14
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 10c
      // 0da: ifeq 10b
      // 0dd: iload 33
      // 0df: ifne 0ae
      // 0e2: lload 14
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifle 0d1
      // 0e9: goto 0f7
      // 0ec: ldc2_w 3053255395876633031
      // 0ef: lload 14
      // 0f1: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 4
      // 0fa: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0fd: putfield com/zelix/k_.P I
      // 100: aload 0
      // 101: aload 0
      // 102: getfield com/zelix/k_.P I
      // 105: anewarray 537
      // 108: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 10b: bipush 0
      // 10c: istore 34
      // 10e: iload 34
      // 110: aload 0
      // 111: getfield com/zelix/k_.P I
      // 114: if_icmpge 278
      // 117: aload 0
      // 118: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 11b: iload 34
      // 11d: aload 0
      // 11e: lload 21
      // 120: aload 4
      // 122: aload 0
      // 123: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 126: bipush 0
      // 127: anewarray 384
      // 12a: ldc2_w 3466469572662963455
      // 12d: lload 14
      // 12f: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lkv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: aload 5
      // 136: aload 6
      // 138: aload 7
      // 13a: aload 8
      // 13c: aload 9
      // 13e: aload 10
      // 140: aload 11
      // 142: aload 12
      // 144: aload 13
      // 146: aload 17
      // 148: aload 16
      // 14a: bipush 15
      // 14c: anewarray 384
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 14
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 13
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: bipush 12
      // 15f: swap
      // 160: aastore
      // 161: dup_x1
      // 162: swap
      // 163: bipush 11
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: bipush 10
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 9
      // 171: swap
      // 172: aastore
      // 173: dup_x1
      // 174: swap
      // 175: bipush 8
      // 177: swap
      // 178: aastore
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 7
      // 17d: swap
      // 17e: aastore
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 6
      // 183: swap
      // 184: aastore
      // 185: dup_x1
      // 186: swap
      // 187: bipush 5
      // 188: swap
      // 189: aastore
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 4
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x1
      // 190: swap
      // 191: bipush 3
      // 192: swap
      // 193: aastore
      // 194: dup_x1
      // 195: swap
      // 196: bipush 2
      // 197: swap
      // 198: aastore
      // 199: dup_x2
      // 19a: dup_x2
      // 19b: pop
      // 19c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19f: bipush 1
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 0
      // 1a5: swap
      // 1a6: aastore
      // 1a7: ldc2_w 3488024671431214751
      // 1aa: lload 14
      // 1ac: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/kw; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: aastore
      // 1b2: aload 0
      // 1b3: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1b6: iload 34
      // 1b8: aaload
      // 1b9: instanceof com/zelix/ko
      // 1bc: iload 33
      // 1be: ifeq 242
      // 1c1: ifeq 217
      // 1c4: goto 1d2
      // 1c7: ldc2_w 3053255395876633031
      // 1ca: lload 14
      // 1cc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: lload 25
      // 1d5: invokevirtual com/zelix/k_.G (J)Lcom/zelix/_v;
      // 1d8: checkcast com/zelix/_f
      // 1db: bipush 1
      // 1dc: lload 23
      // 1de: bipush 2
      // 1df: anewarray 384
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 1
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1f0: bipush 0
      // 1f1: swap
      // 1f2: aastore
      // 1f3: ldc2_w 3309367866256010685
      // 1f6: lload 14
      // 1f8: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: iload 33
      // 1ff: lload 14
      // 201: lconst_0
      // 202: lcmp
      // 203: iflt 275
      // 206: ifne 270
      // 209: goto 217
      // 20c: ldc2_w 3053255395876633031
      // 20f: lload 14
      // 211: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: athrow
      // 217: aload 0
      // 218: iload 33
      // 21a: ifeq 246
      // 21d: goto 22b
      // 220: ldc2_w 3053255395876633031
      // 223: lload 14
      // 225: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 22e: iload 34
      // 230: aaload
      // 231: instanceof com/zelix/ks
      // 234: goto 242
      // 237: ldc2_w 3053255395876633031
      // 23a: lload 14
      // 23c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: athrow
      // 242: ifeq 270
      // 245: aload 0
      // 246: lload 25
      // 248: invokevirtual com/zelix/k_.G (J)Lcom/zelix/_v;
      // 24b: checkcast com/zelix/_f
      // 24e: lload 31
      // 250: bipush 1
      // 251: bipush 2
      // 252: anewarray 384
      // 255: dup_x1
      // 256: swap
      // 257: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 25a: bipush 1
      // 25b: swap
      // 25c: aastore
      // 25d: dup_x2
      // 25e: dup_x2
      // 25f: pop
      // 260: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 263: bipush 0
      // 264: swap
      // 265: aastore
      // 266: ldc2_w 3826902039356887394
      // 269: lload 14
      // 26b: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: iinc 34 1
      // 273: iload 33
      // 275: ifne 10e
      // 278: lload 14
      // 27a: lconst_0
      // 27b: lcmp
      // 27c: iflt 1b2
      // 27f: return
   }

   void sX(Object[] var1) {
      rg var3 = (rg)var1[0];
      fr var9 = (fr)var1[1];
      List var4 = (List)var1[2];
      loj var7 = (loj)var1[3];
      long var5 = (Long)var1[4];
      _u var8 = (_u)var1[5];
      Random var2 = (Random)var1[6];
      var5 = a ^ var5;
      long var10001 = var5 ^ 63672077846720L;
      int var10 = (int)((var5 ^ 63672077846720L) >>> 32);
      int var11 = (int)((var5 ^ 63672077846720L) << 32 >>> 40);
      int var12 = (int)(var10001 << 56 >>> 56);
      bc var10000 = this.F;
      Object[] var10011 = new Object[]{null, null, null, null, null, null, null, Integer.valueOf((byte)var12), var2};
      var10011[6] = var11;
      var10011[5] = var8;
      var10011[4] = var7;
      var10011[3] = var4;
      var10011[2] = var10;
      var10011[1] = var9;
      var10011[0] = var3;
      m44.a<"q">(var10000, var10011, -2096752458507953637L, var5);
   }

   ks x(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 946201079884119145
      // 15: lload 2
      // 16: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifeq 63
      // 36: instanceof com/zelix/ks
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w 769931677143685431
      // 48: lload 2
      // 49: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w 769931677143685431
      // 5c: lload 2
      // 5d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/ks
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifne 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 2a
      // 75: aconst_null
      // 76: areturn
   }

   final void DL(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 35343083753913
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2326180684913529089
      // 1e: lload 2
      // 1f: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifeq 6c
      // 3f: instanceof com/zelix/e9
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w -2866133362627081311
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w -2866133362627081311
      // 65: lload 2
      // 66: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/e9
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 384
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -2525804454999604703
      // 81: lload 2
      // 82: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifne 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt 33
      // 95: return
   }

   public List I(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 114016451744202L;
      int var6 = (int)((var4 ^ 114016451744202L) >>> 32);
      int var7 = (int)((var4 ^ 114016451744202L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      return ((b1)this.H()).v(var6, var7, var8);
   }

   void zM(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 134091093741569L;
      m44.a<"u">(this.F, new Object[]{var5, var2}, 7731043383208429699L, var3);
   }

   void B(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: getstatic com/zelix/k_.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 101937723417303
      // 21: lxor
      // 22: dup2
      // 23: bipush 32
      // 25: lushr
      // 26: l2i
      // 27: istore 5
      // 29: dup2
      // 2a: bipush 32
      // 2c: lshl
      // 2d: bipush 48
      // 2f: lushr
      // 30: l2i
      // 31: istore 6
      // 33: dup2
      // 34: bipush 48
      // 36: lshl
      // 37: bipush 48
      // 39: lushr
      // 3a: l2i
      // 3b: istore 7
      // 3d: pop2
      // 3e: pop2
      // 3f: ldc2_w 8416910318841765929
      // 42: lload 3
      // 43: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: istore 8
      // 4a: iload 8
      // 4c: ifne 7f
      // 4f: iload 2
      // 50: sipush 23035
      // 53: ldc2_w 390599837943884289
      // 56: lload 3
      // 57: lxor
      // 58: invokedynamic n (IJ)I bsm=com/zelix/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: if_icmpgt 84
      // 60: goto 6d
      // 63: ldc2_w 7717026891208013952
      // 66: lload 3
      // 67: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: iload 2
      // 6f: putfield com/zelix/k_.j I
      // 72: goto 7f
      // 75: ldc2_w 7717026891208013952
      // 78: lload 3
      // 79: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: iload 8
      // 81: ifeq d8
      // 84: new com/zelix/un
      // 87: dup
      // 88: new java/lang/StringBuilder
      // 8b: dup
      // 8c: invokespecial java/lang/StringBuilder.<init> ()V
      // 8f: sipush 23403
      // 92: ldc2_w 6088054886983363123
      // 95: lload 3
      // 96: lxor
      // 97: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9f: aload 0
      // a0: iload 5
      // a2: iload 6
      // a4: i2c
      // a5: iload 7
      // a7: i2s
      // a8: invokevirtual com/zelix/k_.l (ICS)Ljava/lang/String;
      // ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ae: sipush 30410
      // b1: ldc2_w 6983102659644868500
      // b4: lload 3
      // b5: lxor
      // b6: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be: iload 2
      // bf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c2: ldc ")"
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ca: invokespecial com/zelix/un.<init> (Ljava/lang/String;)V
      // cd: athrow
      // ce: ldc2_w 7717026891208013952
      // d1: lload 3
      // d2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: athrow
      // d8: return
   }

   public boolean Q(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/k_.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 8843741466880
      // 22: lxor
      // 23: lstore 5
      // 25: pop2
      // 26: ldc2_w 6489274246772166377
      // 29: lload 2
      // 2a: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: bipush 0
      // 30: istore 8
      // 32: istore 7
      // 34: iload 8
      // 36: aload 0
      // 37: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 3a: arraylength
      // 3b: if_icmpge bd
      // 3e: aload 0
      // 3f: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 42: iload 8
      // 44: aaload
      // 45: instanceof com/zelix/ks
      // 48: iload 7
      // 4a: lload 2
      // 4b: lconst_0
      // 4c: lcmp
      // 4d: ifle 55
      // 50: ifne c4
      // 53: iload 7
      // 55: ifne b4
      // 58: goto 65
      // 5b: ldc2_w 5032830645244991040
      // 5e: lload 2
      // 5f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: lload 2
      // 66: lconst_0
      // 67: lcmp
      // 68: ifle ba
      // 6b: ifeq b5
      // 6e: goto 7b
      // 71: ldc2_w 5032830645244991040
      // 74: lload 2
      // 75: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 7f: iload 8
      // 81: aaload
      // 82: checkcast com/zelix/ks
      // 85: iload 4
      // 87: lload 5
      // 89: bipush 2
      // 8a: anewarray 384
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 1
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9b: bipush 0
      // 9c: swap
      // 9d: aastore
      // 9e: ldc2_w 6498630038415337368
      // a1: lload 2
      // a2: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: goto b4
      // aa: ldc2_w 5032830645244991040
      // ad: lload 2
      // ae: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: ireturn
      // b5: iinc 8 1
      // b8: iload 7
      // ba: ifeq 34
      // bd: lload 2
      // be: lconst_0
      // bf: lcmp
      // c0: ifle 3e
      // c3: bipush 0
      // c4: ireturn
   }

   public void xz(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 12
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/util/Map
      // 024: astore 9
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/l6q
      // 02c: astore 13
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Long
      // 034: astore 14
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast com/zelix/d1
      // 03d: astore 10
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast com/zelix/lk7
      // 046: astore 11
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast com/zelix/t6
      // 04f: astore 3
      // 050: dup
      // 051: bipush 9
      // 053: aaload
      // 054: checkcast java/util/List
      // 057: astore 6
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast com/zelix/loj
      // 060: astore 7
      // 062: dup
      // 063: bipush 11
      // 065: aaload
      // 066: checkcast com/zelix/ai
      // 069: astore 8
      // 06b: pop
      // 06c: getstatic com/zelix/k_.a J
      // 06f: lload 4
      // 071: lxor
      // 072: lstore 4
      // 074: lload 4
      // 076: dup2
      // 077: ldc2_w 2954445245782
      // 07a: lxor
      // 07b: lstore 15
      // 07d: dup2
      // 07e: ldc2_w 67193888825656
      // 081: lxor
      // 082: lstore 17
      // 084: dup2
      // 085: ldc2_w 10395489156073
      // 088: lxor
      // 089: lstore 19
      // 08b: dup2
      // 08c: ldc2_w 65841317696779
      // 08f: lxor
      // 090: lstore 21
      // 092: pop2
      // 093: ldc2_w 395130942263873948
      // 096: lload 4
      // 098: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: istore 23
      // 09f: aload 0
      // 0a0: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0a3: ifnull 363
      // 0a6: bipush 0
      // 0a7: istore 24
      // 0a9: aload 0
      // 0aa: getfield com/zelix/k_.m I
      // 0ad: iload 23
      // 0af: lload 4
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 13c
      // 0b6: ifne 13a
      // 0b9: ifle 131
      // 0bc: goto 0ca
      // 0bf: ldc2_w 1922321510829279541
      // 0c2: lload 4
      // 0c4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0ce: astore 25
      // 0d0: aload 25
      // 0d2: arraylength
      // 0d3: istore 26
      // 0d5: bipush 0
      // 0d6: istore 27
      // 0d8: iload 27
      // 0da: iload 26
      // 0dc: if_icmpge 131
      // 0df: aload 25
      // 0e1: iload 27
      // 0e3: aaload
      // 0e4: astore 28
      // 0e6: iload 23
      // 0e8: lload 4
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 12e
      // 0ef: ifne 12c
      // 0f2: aload 28
      // 0f4: bipush 0
      // 0f5: anewarray 384
      // 0f8: ldc2_w 561644587179523629
      // 0fb: lload 4
      // 0fd: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iload 23
      // 104: ifne 13a
      // 107: goto 115
      // 10a: ldc2_w 1922321510829279541
      // 10d: lload 4
      // 10f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 129
      // 118: goto 126
      // 11b: ldc2_w 1922321510829279541
      // 11e: lload 4
      // 120: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 24 1
      // 129: iinc 27 1
      // 12c: iload 23
      // 12e: ifeq 0d8
      // 131: lload 4
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 363
      // 138: iload 24
      // 13a: iload 23
      // 13c: lload 4
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 247
      // 143: ifne 246
      // 146: ifle 237
      // 149: goto 157
      // 14c: ldc2_w 1922321510829279541
      // 14f: lload 4
      // 151: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 15b: lload 15
      // 15d: bipush 1
      // 15e: anewarray 384
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w 232570518668985316
      // 16d: lload 4
      // 16f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: pop
      // 175: bipush 0
      // 176: istore 26
      // 178: iload 24
      // 17a: bipush 2
      // 17b: multianewarray 252 2
      // 17f: astore 25
      // 181: bipush 0
      // 182: istore 27
      // 184: iload 27
      // 186: aload 0
      // 187: getfield com/zelix/k_.m I
      // 18a: if_icmpge 224
      // 18d: aload 0
      // 18e: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 191: iload 27
      // 193: aaload
      // 194: astore 28
      // 196: iload 23
      // 198: lload 4
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 221
      // 19f: ifne 21f
      // 1a2: aload 28
      // 1a4: bipush 0
      // 1a5: anewarray 384
      // 1a8: ldc2_w 561644587179523629
      // 1ab: lload 4
      // 1ad: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 23
      // 1b4: lload 4
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 2cb
      // 1bb: ifne 2c9
      // 1be: goto 1cc
      // 1c1: ldc2_w 1922321510829279541
      // 1c4: lload 4
      // 1c6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 21c
      // 1cf: goto 1dd
      // 1d2: ldc2_w 1922321510829279541
      // 1d5: lload 4
      // 1d7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 25
      // 1df: iload 26
      // 1e1: aaload
      // 1e2: bipush 0
      // 1e3: aload 28
      // 1e5: bipush 0
      // 1e6: anewarray 384
      // 1e9: ldc2_w 427582702318353968
      // 1ec: lload 4
      // 1ee: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iastore
      // 1f4: aload 25
      // 1f6: iload 26
      // 1f8: aaload
      // 1f9: bipush 1
      // 1fa: aload 28
      // 1fc: bipush 0
      // 1fd: anewarray 384
      // 200: ldc2_w 2247779487488613208
      // 203: lload 4
      // 205: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: iastore
      // 20b: iinc 26 1
      // 20e: goto 21c
      // 211: ldc2_w 1922321510829279541
      // 214: lload 4
      // 216: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: iinc 27 1
      // 21f: iload 23
      // 221: ifeq 184
      // 224: lload 4
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 2c7
      // 22b: iload 23
      // 22d: lload 4
      // 22f: lconst_0
      // 230: lcmp
      // 231: ifle 2c9
      // 234: ifeq 24d
      // 237: bipush 0
      // 238: goto 246
      // 23b: ldc2_w 1922321510829279541
      // 23e: lload 4
      // 240: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: bipush 0
      // 247: multianewarray 252 2
      // 24b: astore 25
      // 24d: aload 0
      // 24e: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 251: aload 2
      // 252: iload 12
      // 254: aload 9
      // 256: aload 25
      // 258: aload 13
      // 25a: aload 14
      // 25c: aload 10
      // 25e: aload 11
      // 260: aload 3
      // 261: aload 6
      // 263: lload 19
      // 265: aload 7
      // 267: aload 8
      // 269: bipush 13
      // 26b: anewarray 384
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 12
      // 272: swap
      // 273: aastore
      // 274: dup_x1
      // 275: swap
      // 276: bipush 11
      // 278: swap
      // 279: aastore
      // 27a: dup_x2
      // 27b: dup_x2
      // 27c: pop
      // 27d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 280: bipush 10
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 9
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 8
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 7
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 6
      // 29a: swap
      // 29b: aastore
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 5
      // 29f: swap
      // 2a0: aastore
      // 2a1: dup_x1
      // 2a2: swap
      // 2a3: bipush 4
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: bipush 3
      // 2a9: swap
      // 2aa: aastore
      // 2ab: dup_x1
      // 2ac: swap
      // 2ad: bipush 2
      // 2ae: swap
      // 2af: aastore
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b5: bipush 1
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: ldc2_w 2246021297080928726
      // 2c0: lload 4
      // 2c2: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: iload 12
      // 2c9: iload 23
      // 2cb: lload 4
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: iflt 320
      // 2d2: ifne 312
      // 2d5: ifne 363
      // 2d8: goto 2e6
      // 2db: ldc2_w 1922321510829279541
      // 2de: lload 4
      // 2e0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: aload 0
      // 2e7: iload 23
      // 2e9: lload 4
      // 2eb: lconst_0
      // 2ec: lcmp
      // 2ed: iflt 340
      // 2f0: ifne 332
      // 2f3: goto 301
      // 2f6: ldc2_w 1922321510829279541
      // 2f9: lload 4
      // 2fb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: getfield com/zelix/k_.j I
      // 304: goto 312
      // 307: ldc2_w 1922321510829279541
      // 30a: lload 4
      // 30c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: athrow
      // 312: aload 11
      // 314: lload 17
      // 316: ldc2_w 1761682716060618535
      // 319: lload 4
      // 31b: invokedynamic u (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: if_icmpge 363
      // 323: aload 0
      // 324: goto 332
      // 327: ldc2_w 1922321510829279541
      // 32a: lload 4
      // 32c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: aload 11
      // 334: lload 17
      // 336: ldc2_w 1761682716060618535
      // 339: lload 4
      // 33b: invokedynamic u (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: lload 21
      // 342: dup2_x1
      // 343: pop2
      // 344: bipush 2
      // 345: anewarray 384
      // 348: dup_x1
      // 349: swap
      // 34a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34d: bipush 1
      // 34e: swap
      // 34f: aastore
      // 350: dup_x2
      // 351: dup_x2
      // 352: pop
      // 353: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 356: bipush 0
      // 357: swap
      // 358: aastore
      // 359: ldc2_w 2017211218201402776
      // 35c: lload 4
      // 35e: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: return
   }

   public int X() {
      return this.A;
   }

   void i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 122755492479590L;
      m44.a<"r">(this, new Object[]{var4, ko.class}, 6667663793756975147L, var2);
   }

   be[] K() {
      return this.U;
   }

   void m(Object[] var1) {
      long var2 = (Long)var1[0];
      l6q var5 = (l6q)var1[1];
      PrintWriter var4 = (PrintWriter)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 135743202791718L;
      m44.a<"p">(this.F, new Object[]{var5, var6, var4}, 5133661929757162566L, var2);
   }

   public boolean w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 64745268249290L;
      return m44.a<"t">(this.F, new Object[]{var4}, -2512251304827855924L, var2);
   }

   void zF(Object[] param1) {
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
      // 0e: checkcast java/io/PrintWriter
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 5
      // 1d: pop
      // 1e: getstatic com/zelix/k_.a J
      // 21: lload 3
      // 22: lxor
      // 23: lstore 3
      // 24: lload 3
      // 25: dup2
      // 26: ldc2_w 24637458782871
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w 5624988081994668776
      // 30: lload 3
      // 31: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 2
      // 37: ldc ""
      // 39: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3c: istore 8
      // 3e: new java/lang/StringBuffer
      // 41: dup
      // 42: iload 5
      // 44: invokespecial java/lang/StringBuffer.<init> (I)V
      // 47: astore 9
      // 49: bipush 0
      // 4a: istore 10
      // 4c: iload 10
      // 4e: iload 5
      // 50: if_icmpge 8c
      // 53: aload 9
      // 55: sipush 24283
      // 58: ldc2_w 699638223009240404
      // 5b: lload 3
      // 5c: lxor
      // 5d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 65: pop
      // 66: iinc 10 1
      // 69: iload 8
      // 6b: lload 3
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: iflt 91
      // 71: ifne 8f
      // 74: iload 8
      // 76: ifeq 4c
      // 79: lload 3
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: iflt 69
      // 7f: goto 8c
      // 82: ldc2_w 5897820635054998081
      // 85: lload 3
      // 86: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: bipush 0
      // 8d: istore 10
      // 8f: iload 10
      // 91: lload 3
      // 92: lconst_0
      // 93: lcmp
      // 94: ifle d0
      // 97: aload 0
      // 98: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 9b: arraylength
      // 9c: if_icmpge e6
      // 9f: aload 0
      // a0: getfield com/zelix/k_.U [Lcom/zelix/be;
      // a3: iload 10
      // a5: aaload
      // a6: lload 6
      // a8: aload 2
      // a9: aload 9
      // ab: bipush 3
      // ac: anewarray 384
      // af: dup_x1
      // b0: swap
      // b1: bipush 2
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x2
      // ba: dup_x2
      // bb: pop
      // bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bf: bipush 0
      // c0: swap
      // c1: aastore
      // c2: ldc2_w 5906034730942432098
      // c5: lload 3
      // c6: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: iinc 10 1
      // ce: iload 8
      // d0: ifeq 8f
      // d3: lload 3
      // d4: lconst_0
      // d5: lcmp
      // d6: iflt 8f
      // d9: goto e6
      // dc: ldc2_w 5897820635054998081
      // df: lload 3
      // e0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: athrow
      // e6: return
   }

   void x(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/ai
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/lqu
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: pop
      // 023: getstatic com/zelix/k_.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 57454989101
      // 031: lxor
      // 032: dup2
      // 033: bipush 32
      // 035: lushr
      // 036: l2i
      // 037: istore 7
      // 039: dup2
      // 03a: bipush 32
      // 03c: lshl
      // 03d: bipush 48
      // 03f: lushr
      // 040: l2i
      // 041: istore 8
      // 043: dup2
      // 044: bipush 48
      // 046: lshl
      // 047: bipush 48
      // 049: lushr
      // 04a: l2i
      // 04b: istore 9
      // 04d: pop2
      // 04e: dup2
      // 04f: ldc2_w 80863383728302
      // 052: lxor
      // 053: lstore 10
      // 055: pop2
      // 056: ldc2_w -1305825684566918905
      // 059: lload 5
      // 05b: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: istore 12
      // 062: aload 0
      // 063: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 066: iload 12
      // 068: ifne 08e
      // 06b: ifnull 142
      // 06e: goto 07c
      // 071: ldc2_w -993472319387360850
      // 074: lload 5
      // 076: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 080: goto 08e
      // 083: ldc2_w -993472319387360850
      // 086: lload 5
      // 088: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: iload 12
      // 090: lload 5
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 09b
      // 097: ifne 0bd
      // 09a: bipush 0
      // 09b: anewarray 384
      // 09e: ldc2_w -1634908143445143866
      // 0a1: lload 5
      // 0a3: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: ifeq 142
      // 0ab: goto 0b9
      // 0ae: ldc2_w -993472319387360850
      // 0b1: lload 5
      // 0b3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0bd: aload 2
      // 0be: iload 7
      // 0c0: iload 8
      // 0c2: aload 4
      // 0c4: iload 9
      // 0c6: i2c
      // 0c7: invokevirtual com/zelix/bc.n (Lcom/zelix/loj;IILcom/zelix/ai;C)Lcom/zelix/l;
      // 0ca: pop
      // 0cb: goto 142
      // 0ce: astore 13
      // 0d0: aload 3
      // 0d1: new java/lang/StringBuilder
      // 0d4: dup
      // 0d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d8: aload 13
      // 0da: ldc2_w -1223219367478263096
      // 0dd: lload 5
      // 0df: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e7: sipush 15922
      // 0ea: ldc2_w 4009337794979599959
      // 0ed: lload 5
      // 0ef: lxor
      // 0f0: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fb: lload 10
      // 0fd: dup2_x1
      // 0fe: pop2
      // 0ff: bipush 2
      // 100: anewarray 384
      // 103: dup_x1
      // 104: swap
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w -699488207275370302
      // 114: lload 5
      // 116: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 142
      // 11e: astore 13
      // 120: aload 13
      // 122: ldc2_w -775163606919748534
      // 125: lload 5
      // 127: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: new com/zelix/un
      // 12f: dup
      // 130: aload 13
      // 132: ldc2_w -1710587781630972510
      // 135: lload 5
      // 137: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: aload 13
      // 13e: invokespecial com/zelix/un.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 141: athrow
      // 142: return
   }

   boolean j(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/ai
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Boolean
      // 017: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01a: istore 4
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/lqu
      // 022: astore 6
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Long
      // 02a: invokevirtual java/lang/Long.longValue ()J
      // 02d: lstore 2
      // 02e: pop
      // 02f: getstatic com/zelix/k_.a J
      // 032: lload 2
      // 033: lxor
      // 034: lstore 2
      // 035: lload 2
      // 036: dup2
      // 037: ldc2_w 76240906231
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lushr
      // 03f: l2i
      // 040: istore 8
      // 042: dup2
      // 043: bipush 32
      // 045: lshl
      // 046: bipush 48
      // 048: lushr
      // 049: l2i
      // 04a: istore 9
      // 04c: dup2
      // 04d: bipush 48
      // 04f: lshl
      // 050: bipush 48
      // 052: lushr
      // 053: l2i
      // 054: istore 10
      // 056: pop2
      // 057: dup2
      // 058: ldc2_w 102512183198982
      // 05b: lxor
      // 05c: lstore 11
      // 05e: dup2
      // 05f: ldc2_w 80883047600765
      // 062: lxor
      // 063: lstore 13
      // 065: pop2
      // 066: ldc2_w -8846540359512829475
      // 069: lload 2
      // 06a: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: bipush 0
      // 070: istore 16
      // 072: istore 15
      // 074: aload 0
      // 075: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 078: iload 15
      // 07a: ifne 09e
      // 07d: ifnull 12c
      // 080: goto 08d
      // 083: ldc2_w -7283312164538824332
      // 086: lload 2
      // 087: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 091: goto 09e
      // 094: ldc2_w -7283312164538824332
      // 097: lload 2
      // 098: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 7
      // 0a0: iload 8
      // 0a2: iload 9
      // 0a4: aload 5
      // 0a6: iload 10
      // 0a8: i2c
      // 0a9: invokevirtual com/zelix/bc.n (Lcom/zelix/loj;IILcom/zelix/ai;C)Lcom/zelix/l;
      // 0ac: astore 17
      // 0ae: aload 0
      // 0af: aload 17
      // 0b1: iload 4
      // 0b3: lload 11
      // 0b5: aload 6
      // 0b7: bipush 4
      // 0b8: anewarray 384
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 3
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 2
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ce: bipush 1
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -9182813606222218349
      // 0d9: lload 2
      // 0da: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: istore 16
      // 0e1: aload 17
      // 0e3: bipush 0
      // 0e4: anewarray 384
      // 0e7: ldc2_w -8651098123351383878
      // 0ea: lload 2
      // 0eb: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iload 15
      // 0f2: ifne 12e
      // 0f5: ifne 12c
      // 0f8: goto 105
      // 0fb: ldc2_w -7283312164538824332
      // 0fe: lload 2
      // 0ff: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 17
      // 107: lload 13
      // 109: bipush 1
      // 10a: anewarray 384
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: ldc2_w -9135546872306248013
      // 119: lload 2
      // 11a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: goto 12c
      // 122: ldc2_w -7283312164538824332
      // 125: lload 2
      // 126: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: iload 16
      // 12e: ireturn
   }

   void w(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 63431834209471
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -5623425765141266243
      // 1e: lload 2
      // 1f: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 28: arraylength
      // 29: istore 7
      // 2b: bipush 0
      // 2c: istore 8
      // 2e: istore 6
      // 30: iload 8
      // 32: iload 7
      // 34: if_icmpge 97
      // 37: aload 0
      // 38: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 3b: iload 8
      // 3d: aaload
      // 3e: iload 6
      // 40: ifeq 70
      // 43: instanceof com/zelix/km
      // 46: lload 2
      // 47: lconst_0
      // 48: lcmp
      // 49: iflt 94
      // 4c: ifeq 8f
      // 4f: goto 5c
      // 52: ldc2_w -5297543684922481181
      // 55: lload 2
      // 56: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 60: iload 8
      // 62: aaload
      // 63: goto 70
      // 66: ldc2_w -5297543684922481181
      // 69: lload 2
      // 6a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: checkcast com/zelix/km
      // 73: astore 9
      // 75: aload 9
      // 77: lload 4
      // 79: bipush 1
      // 7a: anewarray 384
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w -6050703363874496346
      // 89: lload 2
      // 8a: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: iinc 8 1
      // 92: iload 6
      // 94: ifne 30
      // 97: lload 2
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt 37
      // 9d: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   k_(long var1, kc var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 2205991921777L;
      long var6 = var1 ^ 56961729922733L;
      long var8 = var1 ^ 94525332582222L;
      long var10 = var1 ^ 109434889114554L;
      long var12 = var1 ^ 93999056549463L;
      long var14 = var1 ^ 5733680603329L;
      long var16 = var1 ^ 67152908268064L;
      long var18 = var1 ^ 61479688802732L;
      long var20 = var1 ^ 87148856990423L;
      long var10001 = var1 ^ 23802425371334L;
      int var22 = (int)((var1 ^ 23802425371334L) >>> 48);
      int var23 = (int)((var1 ^ 23802425371334L) << 16 >>> 32);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var1 ^ 75867788917076L;
      var10001 = var1 ^ 42708413557111L;
      int var27 = (int)((var1 ^ 42708413557111L) >>> 32);
      int var28 = (int)((var1 ^ 42708413557111L) << 32 >>> 56);
      int var29 = (int)(var10001 << 40 >>> 40);
      long var30 = var1 ^ 127944288583204L;
      long var32 = var1 ^ 15205262606437L;
      long var34 = var1 ^ 58821141484492L;
      long var36 = var1 ^ 108218864264205L;
      super(var3.H(), var3.x(new Object[0]), var3.g(var27, (byte)var28, var29));
      boolean var10000 = m44.a<"i">(6257901501998049168L, var1);
      this.A = m44.a<"v">(var3, new Object[]{var25}, 5321943896668913720L, var1);
      this.j = m44.a<"v">(var3, new Object[]{var18}, 5429505373951779831L, var1);
      l6q var39 = new l6q((short)var22, var23, var24);
      l6q var40 = new l6q((short)var22, var23, var24);
      l6q var41 = new l6q((short)var22, var23, var24);
      l6q var42 = new l6q((short)var22, var23, var24);
      l6q var43 = new l6q((short)var22, var23, var24);
      boolean var38 = var10000;
      l6q var44 = new l6q((short)var22, var23, var24);
      l6q var45 = new l6q((short)var22, var23, var24);
      l6q var46 = new l6q((short)var22, var23, var24);
      l6q var47 = new l6q((short)var22, var23, var24);
      f8 var48 = new f8(var4);
      PrintWriter var49 = new PrintWriter(new StringWriter());

      try {
         this.F = new bc(this, m44.a<"v">(var3, new Object[]{var20}, 5239205260952666696L, var1), var39, var40, var12, var41, var42, var43, var44, var45);
      } catch (IOException var53) {
      }

      this.m = m44.a<"v">(var3, new Object[]{var8}, 5521879256445854126L, var1);
      this.U = new be[this.m];
      byte[] var60 = m44.a<"v">(var3, new Object[]{var14}, 6005157672694743641L, var1);
      Object[] var10004 = new Object[]{null, null, var30};
      var10004[1] = false;
      var10004[0] = var60;
      h1 var50 = m44.a<"i">(var10004, 5502146923898122387L, var1);
      int var51 = 0;

      label104: {
         label84:
         while (true) {
            if (var51 < this.m) {
               try {
                  var62 = this.U;
                  if (var1 <= 0L) {
                     break label104;
                  }

                  this.U[var51] = new be(var10, this, var50, var39, var43);
                  var51++;
               } catch (IOException var57) {
                  boolean var67 = false;
                  throw m44.a<"i">(var57, 5860947123240370894L, var1);
               }

               do {
                  try {
                     if (!var38) {
                        break label84;
                     }

                     if (var38) {
                        continue label84;
                     }
                  } catch (IOException var56) {
                     boolean var68 = false;
                     throw m44.a<"i">(var56, 5860947123240370894L, var1);
                  }
               } while (var1 <= 0L);
            }

            this.P = m44.a<"v">(var3, new Object[]{var36}, 6003737151731447574L, var1);
            this.N = new kw[this.P];
            break;
         }

         byte[] var63 = m44.a<"v">(var3, new Object[]{var34}, 6226812830051037533L, var1);
         var10004 = new Object[]{null, null, var30};
         var10004[1] = false;
         var62 = var10004;
         var10004[0] = var63;
      }

      h1 var59 = m44.a<"i">(var62, 5502146923898122387L, var1);
      int var52 = 0;

      label63:
      while (var52 < this.P) {
         try {
            this.N[var52] = m44.a<"i">(
               new Object[]{
                  this,
                  var32,
                  var59,
                  m44.a<"v">(this.F, new Object[0], 5409470171588122614L, var1),
                  var46,
                  var47,
                  var40,
                  var41,
                  var42,
                  var43,
                  var44,
                  var45,
                  var49,
                  var39,
                  var48
               },
               5435528320595180950L,
               var1
            );
            var52++;
         } catch (IOException var55) {
            boolean var70 = false;
            throw m44.a<"i">(var55, 5860947123240370894L, var1);
         }

         while (true) {
            try {
               var10000 = var38;
               if (var1 > 0L) {
                  if (!var38) {
                     return;
                  }

                  var10000 = var38;
               }

               if (var10000) {
                  break;
               }
            } catch (IOException var54) {
               boolean var71 = false;
               throw m44.a<"i">(var54, 5860947123240370894L, var1);
            }

            if (var1 >= 0L) {
               break label63;
            }
         }
      }

      m44.a<"v">(this, new Object[]{var16, var39, var49}, 5518445876006505443L, var1);
      m44.a<"v">(this.F, new Object[]{var6}, 5242595437000198175L, var1);
   }

   final void Dy(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 4007002748216
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -9160088415487208441
      // 1e: lload 2
      // 1f: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifne 6c
      // 3f: instanceof com/zelix/e9
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w -6974272230808892242
      // 51: lload 2
      // 52: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w -6974272230808892242
      // 65: lload 2
      // 66: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/e9
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 384
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -9198579716801527311
      // 81: lload 2
      // 82: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifeq 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt 33
      // 95: return
   }

   void f(Object[] var1) {
      ed var2 = (ed)var1[0];
      long var4 = (Long)var1[1];
      v_ var3 = (v_)var1[2];
      loj var6 = (loj)var1[3];
      ai var7 = (ai)var1[4];
      var4 = a ^ var4;
      long var8 = var4 ^ 42767934474566L;
      m44.a<"r">(this.F, new Object[]{var8, var2, var3, var6, var7}, -2024662841311399199L, var4);
   }

   int f(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3983081515592541089
      // 15: lload 2
      // 16: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 26: arraylength
      // 27: if_icmpge 6c
      // 2a: aload 0
      // 2b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e: iload 5
      // 30: aaload
      // 31: instanceof com/zelix/kk
      // 34: iload 4
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: ifle 41
      // 3c: ifne 73
      // 3f: iload 4
      // 41: ifne 63
      // 44: goto 51
      // 47: ldc2_w 2922840333679360776
      // 4a: lload 2
      // 4b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: ifeq 64
      // 54: goto 61
      // 57: ldc2_w 2922840333679360776
      // 5a: lload 2
      // 5b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: iload 5
      // 63: ireturn
      // 64: iinc 5 1
      // 67: iload 4
      // 69: ifeq 20
      // 6c: lload 2
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: iflt 2a
      // 72: bipush -1
      // 73: ireturn
   }

   String g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 29698345561915L;
      return m44.a<"w">((b1)this.H(), var4, 3797987860152306084L, var2);
   }

   k6 u(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 6372484640882043175
      // 15: lload 2
      // 16: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 26: arraylength
      // 27: if_icmpge 6f
      // 2a: aload 0
      // 2b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e: iload 5
      // 30: aaload
      // 31: iload 4
      // 33: ifeq 63
      // 36: instanceof com/zelix/k6
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 6c
      // 3f: ifeq 67
      // 42: goto 4f
      // 45: ldc2_w 6908892488854211705
      // 48: lload 2
      // 49: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 53: iload 5
      // 55: aaload
      // 56: goto 63
      // 59: ldc2_w 6908892488854211705
      // 5c: lload 2
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: checkcast com/zelix/k6
      // 66: areturn
      // 67: iinc 5 1
      // 6a: iload 4
      // 6c: ifne 20
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 2a
      // 75: aconst_null
      // 76: areturn
   }

   boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 91683385783621L;
      return m44.a<"v">(this.F, new Object[]{var4}, -8999020043928027168L, var2);
   }

   public void sC(Object[] var1) {
      List var11 = (List)var1[0];
      Map var2 = (Map)var1[1];
      t6 var3 = (t6)var1[2];
      List var6 = (List)var1[3];
      _u var9 = (_u)var1[4];
      long var4 = (Long)var1[5];
      _6 var7 = (_6)var1[6];
      String var8 = (String)var1[7];
      boolean var10 = (Boolean)var1[8];
      var4 = a ^ var4;
      long var12 = var4 ^ 112924369780198L;
      bc var10000 = this.F;
      Object[] var10011 = new Object[]{null, null, var2, var3, var6, var9, var7, var8, var10};
      var10011[1] = var12;
      var10011[0] = var11;
      m44.a<"s">(var10000, var10011, 4094235562487180185L, var4);
   }

   void qv(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_u
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/k_.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 4195225528383
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w 7428918024600237055
      // 30: lload 4
      // 32: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 3d: iload 8
      // 3f: ifne 65
      // 42: ifnull 8a
      // 45: goto 53
      // 48: ldc2_w 8705015871514225494
      // 4b: lload 4
      // 4d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 57: goto 65
      // 5a: ldc2_w 8705015871514225494
      // 5d: lload 4
      // 5f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 2
      // 66: lload 6
      // 68: aload 3
      // 69: bipush 3
      // 6a: anewarray 384
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 2
      // 70: swap
      // 71: aastore
      // 72: dup_x2
      // 73: dup_x2
      // 74: pop
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: bipush 1
      // 79: swap
      // 7a: aastore
      // 7b: dup_x1
      // 7c: swap
      // 7d: bipush 0
      // 7e: swap
      // 7f: aastore
      // 80: ldc2_w 7024493889293967826
      // 83: lload 4
      // 85: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: return
   }

   public void L(Object[] param1) {
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
      // 04: checkcast java/util/HashMap
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/k_.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 50146116344884
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -7036437055620780271
      // 25: lload 3
      // 26: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 31: iload 7
      // 33: ifeq 57
      // 36: ifnull 75
      // 39: goto 46
      // 3c: ldc2_w -7361342640706631089
      // 3f: lload 3
      // 40: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 4a: goto 57
      // 4d: ldc2_w -7361342640706631089
      // 50: lload 3
      // 51: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 2
      // 58: lload 5
      // 5a: bipush 2
      // 5b: anewarray 384
      // 5e: dup_x2
      // 5f: dup_x2
      // 60: pop
      // 61: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64: bipush 1
      // 65: swap
      // 66: aastore
      // 67: dup_x1
      // 68: swap
      // 69: bipush 0
      // 6a: swap
      // 6b: aastore
      // 6c: ldc2_w -8988642437968975304
      // 6f: lload 3
      // 70: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: return
   }

   public void C(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 5
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 2
      // 02a: pop
      // 02b: getstatic com/zelix/k_.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 135090960103595
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 45874299155495
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 9167105534252
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 63142896910443
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 104272368984526
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 106943823715396
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 49939256754185
      // 063: lxor
      // 064: dup2
      // 065: bipush 48
      // 067: lushr
      // 068: l2i
      // 069: istore 20
      // 06b: dup2
      // 06c: bipush 16
      // 06e: lshl
      // 06f: bipush 48
      // 071: lushr
      // 072: l2i
      // 073: istore 21
      // 075: dup2
      // 076: bipush 32
      // 078: lshl
      // 079: bipush 32
      // 07b: lushr
      // 07c: l2i
      // 07d: istore 22
      // 07f: pop2
      // 080: pop2
      // 081: ldc2_w 7448625472680236566
      // 084: lload 6
      // 086: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 08f: aload 4
      // 091: aload 3
      // 092: aload 5
      // 094: aload 2
      // 095: lload 18
      // 097: bipush 5
      // 098: anewarray 384
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 4
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 3
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 2
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 9197441578087047906
      // 0bb: lload 6
      // 0bd: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: aload 0
      // 0c3: lload 12
      // 0c5: invokevirtual com/zelix/k_.G (J)Lcom/zelix/_v;
      // 0c8: astore 24
      // 0ca: bipush 0
      // 0cb: istore 25
      // 0cd: istore 23
      // 0cf: iload 25
      // 0d1: aload 0
      // 0d2: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0d5: arraylength
      // 0d6: if_icmpge 1b8
      // 0d9: aload 0
      // 0da: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0dd: iload 25
      // 0df: aaload
      // 0e0: astore 26
      // 0e2: aload 26
      // 0e4: lload 16
      // 0e6: invokevirtual com/zelix/be.i (J)Ljava/lang/String;
      // 0e9: astore 27
      // 0eb: aload 27
      // 0ed: lload 14
      // 0ef: invokestatic com/zelix/l62.B (Ljava/lang/String;J)Lcom/zelix/_f;
      // 0f2: astore 28
      // 0f4: iload 23
      // 0f6: lload 6
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 1b5
      // 0fd: ifeq 1b3
      // 100: aload 28
      // 102: ifnull 1b0
      // 105: goto 113
      // 108: ldc2_w 6976103854536733512
      // 10b: lload 6
      // 10d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 24
      // 115: lload 8
      // 117: invokevirtual com/zelix/_v.n (J)Z
      // 11a: iload 23
      // 11c: ifeq 1af
      // 11f: goto 12d
      // 122: ldc2_w 6976103854536733512
      // 125: lload 6
      // 127: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: ifeq 1a6
      // 130: goto 13e
      // 133: ldc2_w 6976103854536733512
      // 136: lload 6
      // 138: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: aload 28
      // 140: iload 20
      // 142: i2c
      // 143: iload 21
      // 145: i2s
      // 146: iload 22
      // 148: invokevirtual com/zelix/_f.P (CSI)Z
      // 14b: iload 23
      // 14d: ifeq 1af
      // 150: goto 15e
      // 153: ldc2_w 6976103854536733512
      // 156: lload 6
      // 158: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: ifeq 1a6
      // 161: goto 16f
      // 164: ldc2_w 6976103854536733512
      // 167: lload 6
      // 169: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: aload 28
      // 171: aload 24
      // 173: bipush 0
      // 174: anewarray 384
      // 177: ldc2_w 9089962228614396607
      // 17a: lload 6
      // 17c: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: lload 10
      // 183: dup2_x1
      // 184: pop2
      // 185: bipush 2
      // 186: anewarray 384
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 1
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x2
      // 18f: dup_x2
      // 190: pop
      // 191: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 194: bipush 0
      // 195: swap
      // 196: aastore
      // 197: ldc2_w 7405133368501762738
      // 19a: lload 6
      // 19c: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: checkcast com/zelix/_f
      // 1a4: astore 28
      // 1a6: aload 4
      // 1a8: aload 28
      // 1aa: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1af: pop
      // 1b0: iinc 25 1
      // 1b3: iload 23
      // 1b5: ifne 0cf
      // 1b8: return
   }

   void a(Object[] param1) {
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
      // 007: astore 13
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/rg
      // 017: astore 2
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/rg
      // 01e: astore 14
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/fr
      // 026: astore 3
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/util/ArrayList
      // 02d: astore 16
      // 02f: dup
      // 030: bipush 6
      // 032: aaload
      // 033: checkcast com/zelix/t6
      // 036: astore 4
      // 038: dup
      // 039: bipush 7
      // 03b: aaload
      // 03c: checkcast java/lang/Long
      // 03f: invokevirtual java/lang/Long.longValue ()J
      // 042: lstore 9
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast com/zelix/l6q
      // 04b: astore 15
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/util/Map
      // 054: astore 8
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/_u
      // 05d: astore 7
      // 05f: dup
      // 060: bipush 11
      // 062: aaload
      // 063: checkcast com/zelix/loj
      // 066: astore 12
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast com/zelix/_6
      // 06f: astore 11
      // 071: dup
      // 072: bipush 13
      // 074: aaload
      // 075: checkcast java/util/Random
      // 078: astore 6
      // 07a: pop
      // 07b: getstatic com/zelix/k_.a J
      // 07e: lload 9
      // 080: lxor
      // 081: lstore 9
      // 083: lload 9
      // 085: dup2
      // 086: ldc2_w 25391649280019
      // 089: lxor
      // 08a: lstore 17
      // 08c: pop2
      // 08d: ldc2_w -6260584402502091270
      // 090: lload 9
      // 092: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: istore 19
      // 099: aload 0
      // 09a: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 09d: iload 19
      // 09f: ifne 0c5
      // 0a2: ifnull 140
      // 0a5: goto 0b3
      // 0a8: ldc2_w -5275030304733010605
      // 0ab: lload 9
      // 0ad: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0b7: goto 0c5
      // 0ba: ldc2_w -5275030304733010605
      // 0bd: lload 9
      // 0bf: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 13
      // 0c7: aload 5
      // 0c9: aload 2
      // 0ca: aload 14
      // 0cc: aload 3
      // 0cd: aload 16
      // 0cf: aload 4
      // 0d1: aload 15
      // 0d3: lload 17
      // 0d5: aload 8
      // 0d7: aload 7
      // 0d9: aload 12
      // 0db: aload 11
      // 0dd: aload 6
      // 0df: bipush 14
      // 0e1: anewarray 384
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 13
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 12
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 11
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 10
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 9
      // 100: swap
      // 101: aastore
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 8
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 7
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 6
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 5
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 4
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 3
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 2
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 1
      // 12f: swap
      // 130: aastore
      // 131: dup_x1
      // 132: swap
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w -5842157583018045491
      // 139: lload 9
      // 13b: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: return
   }

   public void T(Object[] var1) {
      _o var5 = (_o)var1[0];
      long var9 = (Long)var1[1];
      Long var3 = (Long)var1[2];
      sz var8 = (sz)var1[3];
      List var7 = (List)var1[4];
      t6 var6 = (t6)var1[5];
      String var2 = (String)var1[6];
      int var4 = (Integer)var1[7];
      var9 = a ^ var9;
      long var11 = var9 ^ 5217882105151L;
      bc var10000 = this.F;
      bn var10003 = (bn)m44.a<"t">(this, new Object[0], 1505128327833003695L, var9);
      Object[] var10011 = new Object[]{null, null, null, null, null, null, var6, var2, var4};
      var10011[5] = var11;
      var10011[4] = var7;
      var10011[3] = var8;
      var10011[2] = var10003;
      var10011[1] = var3;
      var10011[0] = var5;
      m44.a<"t">(var10000, var10011, 1521702108178013791L, var9);
   }

   void t(Object[] var1) {
      fr var6 = (fr)var1[0];
      fr var7 = (fr)var1[1];
      fr var2 = (fr)var1[2];
      o9 var5 = (o9)var1[3];
      long var3 = (Long)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 102077210174346L;
      m44.a<"p">(this.F, new Object[]{var6, var7, var2, var5, var8}, -79293377890490908L, var3);
   }

   void l(Object[] var1) {
      ii var6 = (ii)var1[0];
      bn var2 = (bn)var1[1];
      long var4 = (Long)var1[2];
      Set var3 = (Set)var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 25567225175386L;
      m44.a<"t">(this.F, new Object[]{var6, var2, var7, var3}, 2692671079981272783L, var4);
   }

   int x(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3950415528161789850
      // 15: lload 2
      // 16: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: bipush 0
      // 1c: istore 5
      // 1e: istore 4
      // 20: iload 5
      // 22: aload 0
      // 23: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 26: arraylength
      // 27: if_icmpge 6c
      // 2a: aload 0
      // 2b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e: iload 5
      // 30: aaload
      // 31: instanceof com/zelix/k6
      // 34: iload 4
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: iflt 41
      // 3c: ifeq 73
      // 3f: iload 4
      // 41: ifeq 63
      // 44: goto 51
      // 47: ldc2_w 3556856239468602052
      // 4a: lload 2
      // 4b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: ifeq 64
      // 54: goto 61
      // 57: ldc2_w 3556856239468602052
      // 5a: lload 2
      // 5b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: iload 5
      // 63: ireturn
      // 64: iinc 5 1
      // 67: iload 4
      // 69: ifne 20
      // 6c: lload 2
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: ifle 2a
      // 72: bipush -1
      // 73: ireturn
   }

   public void s(Object[] var1) {
      df var5 = (df)var1[0];
      Set var2 = (Set)var1[1];
      long var3 = (Long)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 117487922224665L;
      m44.a<"u">(this.F, new Object[]{var6, var5, var2}, 8872675438614844607L, var3);
   }

   public int p() {
      return this.j;
   }

   protected void N(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 3
      // 022: pop
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 86385458961766
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 44560505628925
      // 030: lxor
      // 031: dup2
      // 032: bipush 32
      // 034: lushr
      // 035: l2i
      // 036: istore 9
      // 038: dup2
      // 039: bipush 32
      // 03b: lshl
      // 03c: bipush 56
      // 03e: lushr
      // 03f: l2i
      // 040: istore 10
      // 042: dup2
      // 043: bipush 40
      // 045: lshl
      // 046: bipush 40
      // 048: lushr
      // 049: l2i
      // 04a: istore 11
      // 04c: pop2
      // 04d: dup2
      // 04e: ldc2_w 106626050250779
      // 051: lxor
      // 052: dup2
      // 053: bipush 56
      // 055: lushr
      // 056: l2i
      // 057: istore 12
      // 059: dup2
      // 05a: bipush 8
      // 05c: lshl
      // 05d: bipush 32
      // 05f: lushr
      // 060: l2i
      // 061: istore 13
      // 063: dup2
      // 064: bipush 40
      // 066: lshl
      // 067: bipush 40
      // 069: lushr
      // 06a: l2i
      // 06b: istore 14
      // 06d: pop2
      // 06e: dup2
      // 06f: ldc2_w 0
      // 072: lxor
      // 073: lstore 15
      // 075: dup2
      // 076: ldc2_w 62892579083674
      // 079: lxor
      // 07a: lstore 17
      // 07c: dup2
      // 07d: ldc2_w 82353903545116
      // 080: lxor
      // 081: lstore 19
      // 083: dup2
      // 084: ldc2_w 31354391474595
      // 087: lxor
      // 088: dup2
      // 089: bipush 32
      // 08b: lushr
      // 08c: l2i
      // 08d: istore 21
      // 08f: dup2
      // 090: bipush 32
      // 092: lshl
      // 093: bipush 48
      // 095: lushr
      // 096: l2i
      // 097: istore 22
      // 099: dup2
      // 09a: bipush 48
      // 09c: lshl
      // 09d: bipush 48
      // 09f: lushr
      // 0a0: l2i
      // 0a1: istore 23
      // 0a3: pop2
      // 0a4: dup2
      // 0a5: ldc2_w 16235402626172
      // 0a8: lxor
      // 0a9: lstore 24
      // 0ab: pop2
      // 0ac: ldc2_w 1680553024964027930
      // 0af: lload 4
      // 0b1: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: aload 0
      // 0b7: aload 6
      // 0b9: aload 2
      // 0ba: lload 15
      // 0bc: aload 3
      // 0bd: bipush 4
      // 0be: anewarray 384
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: bipush 3
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 2
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 1
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 0
      // 0d7: swap
      // 0d8: aastore
      // 0d9: invokespecial com/zelix/kw.N ([Ljava/lang/Object;)V
      // 0dc: istore 26
      // 0de: aload 6
      // 0e0: aload 0
      // 0e1: getfield com/zelix/k_.A I
      // 0e4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e7: aload 6
      // 0e9: aload 0
      // 0ea: getfield com/zelix/k_.j I
      // 0ed: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0f0: aload 0
      // 0f1: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0f4: aload 6
      // 0f6: aload 2
      // 0f7: lload 24
      // 0f9: bipush 3
      // 0fa: anewarray 384
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 2
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 0
      // 10e: swap
      // 10f: aastore
      // 110: ldc2_w 1020181703361814247
      // 113: lload 4
      // 115: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: aload 6
      // 11c: aload 0
      // 11d: getfield com/zelix/k_.m I
      // 120: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 123: bipush 0
      // 124: istore 27
      // 126: iload 27
      // 128: aload 0
      // 129: getfield com/zelix/k_.m I
      // 12c: if_icmpge 16c
      // 12f: aload 0
      // 130: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 133: iload 27
      // 135: aaload
      // 136: iload 12
      // 138: i2b
      // 139: aload 6
      // 13b: aload 2
      // 13c: iload 13
      // 13e: iload 14
      // 140: invokevirtual com/zelix/be.b (BLjava/io/DataOutputStream;Ljava/util/Map;II)V
      // 143: iinc 27 1
      // 146: iload 26
      // 148: lload 4
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 176
      // 14f: ifeq 175
      // 152: iload 26
      // 154: ifne 126
      // 157: lload 4
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 146
      // 15e: goto 16c
      // 161: ldc2_w 1214927414864200516
      // 164: lload 4
      // 166: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: aload 6
      // 16e: aload 0
      // 16f: getfield com/zelix/k_.P I
      // 172: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 175: bipush 0
      // 176: istore 27
      // 178: iload 27
      // 17a: aload 0
      // 17b: getfield com/zelix/k_.P I
      // 17e: if_icmpge 3b1
      // 181: aload 0
      // 182: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 185: iload 27
      // 187: aaload
      // 188: iload 26
      // 18a: ifeq 37d
      // 18d: instanceof com/zelix/b8
      // 190: ifeq 376
      // 193: goto 1a1
      // 196: ldc2_w 1214927414864200516
      // 199: lload 4
      // 19b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: lload 4
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: ifle 3ac
      // 1a8: aload 0
      // 1a9: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1ac: iload 27
      // 1ae: aaload
      // 1af: iload 26
      // 1b1: ifeq 37d
      // 1b4: goto 1c2
      // 1b7: ldc2_w 1214927414864200516
      // 1ba: lload 4
      // 1bc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: iload 9
      // 1c4: iload 10
      // 1c6: i2b
      // 1c7: iload 11
      // 1c9: invokevirtual com/zelix/kw.g (IBI)I
      // 1cc: ifle 376
      // 1cf: goto 1dd
      // 1d2: ldc2_w 1214927414864200516
      // 1d5: lload 4
      // 1d7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1e1: iload 27
      // 1e3: aaload
      // 1e4: checkcast com/zelix/b8
      // 1e7: astore 28
      // 1e9: iload 26
      // 1eb: lload 4
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: ifle 2ab
      // 1f2: ifeq 2a2
      // 1f5: aload 28
      // 1f7: iload 21
      // 1f9: iload 22
      // 1fb: i2c
      // 1fc: iload 23
      // 1fe: i2s
      // 1ff: bipush 3
      // 200: anewarray 384
      // 203: dup_x1
      // 204: swap
      // 205: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 208: bipush 2
      // 209: swap
      // 20a: aastore
      // 20b: dup_x1
      // 20c: swap
      // 20d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 210: bipush 1
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 218: bipush 0
      // 219: swap
      // 21a: aastore
      // 21b: ldc2_w 730040518840136172
      // 21e: lload 4
      // 220: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: ifeq 2ae
      // 228: goto 236
      // 22b: ldc2_w 1214927414864200516
      // 22e: lload 4
      // 230: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 3
      // 237: new java/lang/StringBuilder
      // 23a: dup
      // 23b: invokespecial java/lang/StringBuilder.<init> ()V
      // 23e: sipush 12860
      // 241: ldc2_w 4741236403277396153
      // 244: lload 4
      // 246: lxor
      // 247: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24f: aload 28
      // 251: bipush 0
      // 252: anewarray 384
      // 255: ldc2_w 798302282627112187
      // 258: lload 4
      // 25a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 262: sipush 22740
      // 265: ldc2_w 8607970871785427543
      // 268: lload 4
      // 26a: lxor
      // 26b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 273: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 276: lload 7
      // 278: bipush 2
      // 279: anewarray 384
      // 27c: dup_x2
      // 27d: dup_x2
      // 27e: pop
      // 27f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 282: bipush 1
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w 1148023058365204343
      // 28d: lload 4
      // 28f: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: goto 2a2
      // 297: ldc2_w 1214927414864200516
      // 29a: lload 4
      // 29c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: lload 4
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: iflt 368
      // 2a9: iload 26
      // 2ab: ifne 376
      // 2ae: aload 3
      // 2af: new java/lang/StringBuilder
      // 2b2: dup
      // 2b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b6: sipush 9567
      // 2b9: ldc2_w 1533411956796026817
      // 2bc: lload 4
      // 2be: lxor
      // 2bf: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c7: aload 0
      // 2c8: lload 17
      // 2ca: bipush 1
      // 2cb: anewarray 384
      // 2ce: dup_x2
      // 2cf: dup_x2
      // 2d0: pop
      // 2d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d4: bipush 0
      // 2d5: swap
      // 2d6: aastore
      // 2d7: ldc2_w 1720451059024364886
      // 2da: lload 4
      // 2dc: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e4: sipush 7988
      // 2e7: ldc2_w 3701189282098697663
      // 2ea: lload 4
      // 2ec: lxor
      // 2ed: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 0
      // 2f6: lload 19
      // 2f8: bipush 1
      // 2f9: anewarray 384
      // 2fc: dup_x2
      // 2fd: dup_x2
      // 2fe: pop
      // 2ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 302: bipush 0
      // 303: swap
      // 304: aastore
      // 305: ldc2_w 690904327524114202
      // 308: lload 4
      // 30a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 312: sipush 19364
      // 315: ldc2_w 8240356680206090536
      // 318: lload 4
      // 31a: lxor
      // 31b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 323: aload 28
      // 325: bipush 0
      // 326: anewarray 384
      // 329: ldc2_w 798302282627112187
      // 32c: lload 4
      // 32e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 336: sipush 26699
      // 339: ldc2_w 4175292721877492421
      // 33c: lload 4
      // 33e: lxor
      // 33f: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 347: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34a: lload 7
      // 34c: bipush 2
      // 34d: anewarray 384
      // 350: dup_x2
      // 351: dup_x2
      // 352: pop
      // 353: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 356: bipush 1
      // 357: swap
      // 358: aastore
      // 359: dup_x1
      // 35a: swap
      // 35b: bipush 0
      // 35c: swap
      // 35d: aastore
      // 35e: ldc2_w 1148023058365204343
      // 361: lload 4
      // 363: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: goto 376
      // 36b: ldc2_w 1214927414864200516
      // 36e: lload 4
      // 370: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: athrow
      // 376: aload 0
      // 377: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 37a: iload 27
      // 37c: aaload
      // 37d: aload 6
      // 37f: aload 2
      // 380: lload 15
      // 382: aload 3
      // 383: bipush 4
      // 384: anewarray 384
      // 387: dup_x1
      // 388: swap
      // 389: bipush 3
      // 38a: swap
      // 38b: aastore
      // 38c: dup_x2
      // 38d: dup_x2
      // 38e: pop
      // 38f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 392: bipush 2
      // 393: swap
      // 394: aastore
      // 395: dup_x1
      // 396: swap
      // 397: bipush 1
      // 398: swap
      // 399: aastore
      // 39a: dup_x1
      // 39b: swap
      // 39c: bipush 0
      // 39d: swap
      // 39e: aastore
      // 39f: ldc2_w 1589996610441052542
      // 3a2: lload 4
      // 3a4: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: iinc 27 1
      // 3ac: iload 26
      // 3ae: ifne 178
      // 3b1: lload 4
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: iflt 181
      // 3b8: return
   }

   public int Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this.F, new Object[0], 6113629848930754039L, var2);
   }

   void z(Object[] var1) {
      long var3 = (Long)var1[0];
      Set var2 = (Set)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 105837856256516L;
      m44.a<"u">(this.F, new Object[]{var5, var2}, 4929161762352405395L, var3);
   }

   public void xp(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 12
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 11
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Map
      // 01a: astore 13
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/l6q
      // 022: astore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Long
      // 02a: astore 4
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast com/zelix/d1
      // 032: astore 7
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast com/zelix/lk7
      // 03b: astore 14
      // 03d: dup
      // 03e: bipush 7
      // 040: aaload
      // 041: checkcast com/zelix/t6
      // 044: astore 6
      // 046: dup
      // 047: bipush 8
      // 049: aaload
      // 04a: checkcast java/lang/Long
      // 04d: invokevirtual java/lang/Long.longValue ()J
      // 050: lstore 9
      // 052: dup
      // 053: bipush 9
      // 055: aaload
      // 056: checkcast java/util/List
      // 059: astore 2
      // 05a: dup
      // 05b: bipush 10
      // 05d: aaload
      // 05e: checkcast com/zelix/loj
      // 061: astore 3
      // 062: dup
      // 063: bipush 11
      // 065: aaload
      // 066: checkcast com/zelix/ai
      // 069: astore 8
      // 06b: pop
      // 06c: getstatic com/zelix/k_.a J
      // 06f: lload 9
      // 071: lxor
      // 072: lstore 9
      // 074: lload 9
      // 076: dup2
      // 077: ldc2_w 93304454399030
      // 07a: lxor
      // 07b: lstore 15
      // 07d: dup2
      // 07e: ldc2_w 80863373117419
      // 081: lxor
      // 082: lstore 17
      // 084: dup2
      // 085: ldc2_w 118124681324632
      // 088: lxor
      // 089: lstore 19
      // 08b: dup2
      // 08c: ldc2_w 120474372594795
      // 08f: lxor
      // 090: lstore 21
      // 092: pop2
      // 093: ldc2_w -8350906208578447108
      // 096: lload 9
      // 098: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: istore 23
      // 09f: aload 0
      // 0a0: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0a3: ifnull 363
      // 0a6: bipush 0
      // 0a7: istore 24
      // 0a9: aload 0
      // 0aa: getfield com/zelix/k_.m I
      // 0ad: iload 23
      // 0af: lload 9
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: iflt 13c
      // 0b6: ifne 13a
      // 0b9: ifle 131
      // 0bc: goto 0ca
      // 0bf: ldc2_w -7796536581633425323
      // 0c2: lload 9
      // 0c4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0ce: astore 25
      // 0d0: aload 25
      // 0d2: arraylength
      // 0d3: istore 26
      // 0d5: bipush 0
      // 0d6: istore 27
      // 0d8: iload 27
      // 0da: iload 26
      // 0dc: if_icmpge 131
      // 0df: aload 25
      // 0e1: iload 27
      // 0e3: aaload
      // 0e4: astore 28
      // 0e6: iload 23
      // 0e8: lload 9
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 12e
      // 0ef: ifne 12c
      // 0f2: aload 28
      // 0f4: bipush 0
      // 0f5: anewarray 384
      // 0f8: ldc2_w -8166421724709013683
      // 0fb: lload 9
      // 0fd: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: iload 23
      // 104: ifne 13a
      // 107: goto 115
      // 10a: ldc2_w -7796536581633425323
      // 10d: lload 9
      // 10f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 129
      // 118: goto 126
      // 11b: ldc2_w -7796536581633425323
      // 11e: lload 9
      // 120: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iinc 24 1
      // 129: iinc 27 1
      // 12c: iload 23
      // 12e: ifeq 0d8
      // 131: lload 9
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 363
      // 138: iload 24
      // 13a: iload 23
      // 13c: lload 9
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 247
      // 143: ifne 246
      // 146: ifle 237
      // 149: goto 157
      // 14c: ldc2_w -7796536581633425323
      // 14f: lload 9
      // 151: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 15b: lload 15
      // 15d: bipush 1
      // 15e: anewarray 384
      // 161: dup_x2
      // 162: dup_x2
      // 163: pop
      // 164: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w -8477437147961701756
      // 16d: lload 9
      // 16f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: pop
      // 175: bipush 0
      // 176: istore 26
      // 178: iload 24
      // 17a: bipush 2
      // 17b: multianewarray 252 2
      // 17f: astore 25
      // 181: bipush 0
      // 182: istore 27
      // 184: iload 27
      // 186: aload 0
      // 187: getfield com/zelix/k_.m I
      // 18a: if_icmpge 224
      // 18d: aload 0
      // 18e: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 191: iload 27
      // 193: aaload
      // 194: astore 28
      // 196: iload 23
      // 198: lload 9
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 221
      // 19f: ifne 21f
      // 1a2: aload 28
      // 1a4: bipush 0
      // 1a5: anewarray 384
      // 1a8: ldc2_w -8166421724709013683
      // 1ab: lload 9
      // 1ad: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: iload 23
      // 1b4: lload 9
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: iflt 2cb
      // 1bb: ifne 2c9
      // 1be: goto 1cc
      // 1c1: ldc2_w -7796536581633425323
      // 1c4: lload 9
      // 1c6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: ifeq 21c
      // 1cf: goto 1dd
      // 1d2: ldc2_w -7796536581633425323
      // 1d5: lload 9
      // 1d7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 25
      // 1df: iload 26
      // 1e1: aaload
      // 1e2: bipush 0
      // 1e3: aload 28
      // 1e5: bipush 0
      // 1e6: anewarray 384
      // 1e9: ldc2_w -8318357143887677616
      // 1ec: lload 9
      // 1ee: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iastore
      // 1f4: aload 25
      // 1f6: iload 26
      // 1f8: aaload
      // 1f9: bipush 1
      // 1fa: aload 28
      // 1fc: bipush 0
      // 1fd: anewarray 384
      // 200: ldc2_w -7615057026260954568
      // 203: lload 9
      // 205: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: iastore
      // 20b: iinc 26 1
      // 20e: goto 21c
      // 211: ldc2_w -7796536581633425323
      // 214: lload 9
      // 216: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: iinc 27 1
      // 21f: iload 23
      // 221: ifeq 184
      // 224: lload 9
      // 226: lconst_0
      // 227: lcmp
      // 228: ifle 2c7
      // 22b: iload 23
      // 22d: lload 9
      // 22f: lconst_0
      // 230: lcmp
      // 231: iflt 2c9
      // 234: ifeq 24d
      // 237: bipush 0
      // 238: goto 246
      // 23b: ldc2_w -7796536581633425323
      // 23e: lload 9
      // 240: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: bipush 0
      // 247: multianewarray 252 2
      // 24b: astore 25
      // 24d: aload 0
      // 24e: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 251: aload 12
      // 253: aload 13
      // 255: iload 11
      // 257: aload 25
      // 259: aload 5
      // 25b: aload 4
      // 25d: aload 7
      // 25f: aload 14
      // 261: aload 6
      // 263: aload 2
      // 264: aload 3
      // 265: aload 8
      // 267: lload 17
      // 269: bipush 13
      // 26b: anewarray 384
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 12
      // 276: swap
      // 277: aastore
      // 278: dup_x1
      // 279: swap
      // 27a: bipush 11
      // 27c: swap
      // 27d: aastore
      // 27e: dup_x1
      // 27f: swap
      // 280: bipush 10
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 9
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 8
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 7
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 6
      // 29a: swap
      // 29b: aastore
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 5
      // 29f: swap
      // 2a0: aastore
      // 2a1: dup_x1
      // 2a2: swap
      // 2a3: bipush 4
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: bipush 3
      // 2a9: swap
      // 2aa: aastore
      // 2ab: dup_x1
      // 2ac: swap
      // 2ad: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2b0: bipush 2
      // 2b1: swap
      // 2b2: aastore
      // 2b3: dup_x1
      // 2b4: swap
      // 2b5: bipush 1
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: ldc2_w -7883196440882901739
      // 2c0: lload 9
      // 2c2: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: iload 11
      // 2c9: iload 23
      // 2cb: lload 9
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: iflt 320
      // 2d2: ifne 312
      // 2d5: ifne 363
      // 2d8: goto 2e6
      // 2db: ldc2_w -7796536581633425323
      // 2de: lload 9
      // 2e0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: aload 0
      // 2e7: iload 23
      // 2e9: lload 9
      // 2eb: lconst_0
      // 2ec: lcmp
      // 2ed: iflt 340
      // 2f0: ifne 332
      // 2f3: goto 301
      // 2f6: ldc2_w -7796536581633425323
      // 2f9: lload 9
      // 2fb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: getfield com/zelix/k_.j I
      // 304: goto 312
      // 307: ldc2_w -7796536581633425323
      // 30a: lload 9
      // 30c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: athrow
      // 312: aload 14
      // 314: lload 19
      // 316: ldc2_w -7993159900902881721
      // 319: lload 9
      // 31b: invokedynamic u (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: if_icmpge 363
      // 323: aload 0
      // 324: goto 332
      // 327: ldc2_w -7796536581633425323
      // 32a: lload 9
      // 32c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: aload 14
      // 334: lload 19
      // 336: ldc2_w -7993159900902881721
      // 339: lload 9
      // 33b: invokedynamic u (Ljava/lang/Object;JJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: lload 21
      // 342: dup2_x1
      // 343: pop2
      // 344: bipush 2
      // 345: anewarray 384
      // 348: dup_x1
      // 349: swap
      // 34a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34d: bipush 1
      // 34e: swap
      // 34f: aastore
      // 350: dup_x2
      // 351: dup_x2
      // 352: pop
      // 353: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 356: bipush 0
      // 357: swap
      // 358: aastore
      // 359: ldc2_w -7881646133999086344
      // 35c: lload 9
      // 35e: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: return
   }

   void S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 53343337631604L;
      m44.a<"p">(this, new Object[]{var4, km.class}, -7955024067589243591L, var2);
   }

   void n(Object[] var1) {
      long var3 = (Long)var1[0];
      ArrayList var2 = (ArrayList)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 139279154579203L;
      long var7 = var3 ^ 43946095609347L;
      boolean var10000 = m44.a<"m">(3430791704987393748L, var3);
      ks var10 = m44.a<"r">(this, new Object[]{var7}, 3489020855244389253L, var3);
      boolean var9 = var10000;

      label20: {
         try {
            var13 = var10;
            if (!var9) {
               break label20;
            }

            if (var10 == null) {
               return;
            }
         } catch (nn var11) {
            throw m44.a<"m">(var11, 2887461542306806666L, var3);
         }

         var13 = var10;
      }

      m44.a<"r">(var13, new Object[]{var5, var2}, 3225009168392879473L, var3);
   }

   public js P(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 5603509627048
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -7377245453454677802
      // 1e: lload 2
      // 1f: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 2a: iload 6
      // 2c: ifeq 50
      // 2f: ifnull 69
      // 32: goto 3f
      // 35: ldc2_w -7057124943013950072
      // 38: lload 2
      // 39: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 43: goto 50
      // 46: ldc2_w -7057124943013950072
      // 49: lload 2
      // 4a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 384
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w -8705193442789541327
      // 62: lload 2
      // 63: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/js; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: areturn
      // 69: aconst_null
      // 6a: areturn
   }

   boolean q(Object[] param1) {
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
      // 04: checkcast com/zelix/bf
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/k_.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 785401900224
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 880100176677263569
      // 26: lload 2
      // 27: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 32: iload 7
      // 34: ifne 58
      // 37: ifnull 78
      // 3a: goto 47
      // 3d: ldc2_w 1432147119668347000
      // 40: lload 2
      // 41: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 4b: goto 58
      // 4e: ldc2_w 1432147119668347000
      // 51: lload 2
      // 52: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 4
      // 5a: lload 5
      // 5c: bipush 2
      // 5d: anewarray 384
      // 60: dup_x2
      // 61: dup_x2
      // 62: pop
      // 63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66: bipush 1
      // 67: swap
      // 68: aastore
      // 69: dup_x1
      // 6a: swap
      // 6b: bipush 0
      // 6c: swap
      // 6d: aastore
      // 6e: ldc2_w 920936275026015340
      // 71: lload 2
      // 72: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: ireturn
      // 78: bipush 0
      // 79: ireturn
   }

   public void v(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 6
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/util/List
      // 01d: astore 2
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/loj
      // 024: astore 3
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast com/zelix/ai
      // 02b: astore 4
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast com/zelix/lqu
      // 033: astore 8
      // 035: pop
      // 036: getstatic com/zelix/k_.a J
      // 039: lload 6
      // 03b: lxor
      // 03c: lstore 6
      // 03e: lload 6
      // 040: dup2
      // 041: ldc2_w 113921332081723
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 25416865168481
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 80233325429517
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 56333831177741
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 73767955905410
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 85344702365413
      // 067: lxor
      // 068: lstore 19
      // 06a: pop2
      // 06b: ldc2_w -4501444321112189600
      // 06e: lload 6
      // 070: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: istore 21
      // 077: aload 2
      // 078: invokeinterface java/util/List.size ()I 1
      // 07d: iload 21
      // 07f: ifne 0a8
      // 082: ifle 567
      // 085: goto 093
      // 088: ldc2_w -2427136216808976951
      // 08b: lload 6
      // 08d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 0
      // 094: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 097: arraylength
      // 098: bipush 1
      // 099: iadd
      // 09a: goto 0a8
      // 09d: ldc2_w -2427136216808976951
      // 0a0: lload 6
      // 0a2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: anewarray 431
      // 0ab: astore 22
      // 0ad: aload 2
      // 0ae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b3: astore 23
      // 0b5: aload 23
      // 0b7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bc: ifeq 2ee
      // 0bf: aload 23
      // 0c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c6: checkcast com/zelix/be
      // 0c9: astore 24
      // 0cb: aload 0
      // 0cc: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0cf: arraylength
      // 0d0: istore 25
      // 0d2: bipush 0
      // 0d3: istore 26
      // 0d5: iload 21
      // 0d7: lload 6
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 0e8
      // 0de: ifne 567
      // 0e1: aload 0
      // 0e2: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0e5: arraylength
      // 0e6: bipush 1
      // 0e7: isub
      // 0e8: istore 27
      // 0ea: iload 27
      // 0ec: iflt 2a0
      // 0ef: aload 0
      // 0f0: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0f3: iload 27
      // 0f5: aaload
      // 0f6: astore 28
      // 0f8: aload 24
      // 0fa: aload 28
      // 0fc: bipush 0
      // 0fd: invokevirtual com/zelix/be.t (I)I
      // 100: aload 28
      // 102: bipush 1
      // 103: invokevirtual com/zelix/be.t (I)I
      // 106: lload 9
      // 108: invokevirtual com/zelix/be.h (IIJ)Z
      // 10b: lload 6
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 2eb
      // 112: iload 21
      // 114: ifne 2e8
      // 117: iload 21
      // 119: lload 6
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 204
      // 120: ifne 202
      // 123: goto 131
      // 126: ldc2_w -2427136216808976951
      // 129: lload 6
      // 12b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: lload 6
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 1f4
      // 138: ifeq 1da
      // 13b: goto 149
      // 13e: ldc2_w -2427136216808976951
      // 141: lload 6
      // 143: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: iload 26
      // 14b: iload 21
      // 14d: ifne 1cc
      // 150: goto 15e
      // 153: ldc2_w -2427136216808976951
      // 156: lload 6
      // 158: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: lload 6
      // 160: lconst_0
      // 161: lcmp
      // 162: ifle 1be
      // 165: ifne 1bd
      // 168: goto 176
      // 16b: ldc2_w -2427136216808976951
      // 16e: lload 6
      // 170: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 24
      // 178: bipush 0
      // 179: invokevirtual com/zelix/be.t (I)I
      // 17c: lload 6
      // 17e: lconst_0
      // 17f: lcmp
      // 180: iflt 1d0
      // 183: iload 21
      // 185: ifne 1cc
      // 188: goto 196
      // 18b: ldc2_w -2427136216808976951
      // 18e: lload 6
      // 190: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 28
      // 198: bipush 0
      // 199: invokevirtual com/zelix/be.t (I)I
      // 19c: if_icmpge 1bd
      // 19f: goto 1ad
      // 1a2: ldc2_w -2427136216808976951
      // 1a5: lload 6
      // 1a7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: iload 27
      // 1af: istore 25
      // 1b1: iload 21
      // 1b3: lload 6
      // 1b5: lconst_0
      // 1b6: lcmp
      // 1b7: iflt 29d
      // 1ba: ifeq 298
      // 1bd: bipush 1
      // 1be: goto 1cc
      // 1c1: ldc2_w -2427136216808976951
      // 1c4: lload 6
      // 1c6: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: istore 26
      // 1ce: iload 21
      // 1d0: lload 6
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: iflt 29d
      // 1d7: ifeq 298
      // 1da: aload 24
      // 1dc: aload 28
      // 1de: bipush 0
      // 1df: invokevirtual com/zelix/be.t (I)I
      // 1e2: aload 28
      // 1e4: bipush 1
      // 1e5: invokevirtual com/zelix/be.t (I)I
      // 1e8: lload 15
      // 1ea: ldc2_w -4173304855682792559
      // 1ed: lload 6
      // 1ef: invokedynamic q (Ljava/lang/Object;IIJJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: goto 202
      // 1f7: ldc2_w -2427136216808976951
      // 1fa: lload 6
      // 1fc: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: iload 21
      // 204: lload 6
      // 206: lconst_0
      // 207: lcmp
      // 208: iflt 235
      // 20b: ifne 233
      // 20e: ifeq 2a0
      // 211: goto 21f
      // 214: ldc2_w -2427136216808976951
      // 217: lload 6
      // 219: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: aload 24
      // 221: bipush 0
      // 222: invokevirtual com/zelix/be.t (I)I
      // 225: goto 233
      // 228: ldc2_w -2427136216808976951
      // 22b: lload 6
      // 22d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: iload 21
      // 235: lload 6
      // 237: lconst_0
      // 238: lcmp
      // 239: ifle 245
      // 23c: ifne 296
      // 23f: aload 28
      // 241: bipush 0
      // 242: invokevirtual com/zelix/be.t (I)I
      // 245: if_icmpne 286
      // 248: goto 256
      // 24b: ldc2_w -2427136216808976951
      // 24e: lload 6
      // 250: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 24
      // 258: bipush 1
      // 259: invokevirtual com/zelix/be.t (I)I
      // 25c: iload 21
      // 25e: ifne 296
      // 261: goto 26f
      // 264: ldc2_w -2427136216808976951
      // 267: lload 6
      // 269: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: aload 28
      // 271: bipush 1
      // 272: invokevirtual com/zelix/be.t (I)I
      // 275: if_icmpeq 2a0
      // 278: goto 286
      // 27b: ldc2_w -2427136216808976951
      // 27e: lload 6
      // 280: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: athrow
      // 286: iload 27
      // 288: goto 296
      // 28b: ldc2_w -2427136216808976951
      // 28e: lload 6
      // 290: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: istore 25
      // 298: iinc 27 -1
      // 29b: iload 21
      // 29d: ifeq 0ea
      // 2a0: aload 22
      // 2a2: iload 25
      // 2a4: aaload
      // 2a5: lload 6
      // 2a7: lconst_0
      // 2a8: lcmp
      // 2a9: iflt 0c6
      // 2ac: iload 21
      // 2ae: ifne 2e1
      // 2b1: ifnonnull 2dc
      // 2b4: goto 2c2
      // 2b7: ldc2_w -2427136216808976951
      // 2ba: lload 6
      // 2bc: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: aload 22
      // 2c4: iload 25
      // 2c6: new java/util/ArrayList
      // 2c9: dup
      // 2ca: invokespecial java/util/ArrayList.<init> ()V
      // 2cd: aastore
      // 2ce: goto 2dc
      // 2d1: ldc2_w -2427136216808976951
      // 2d4: lload 6
      // 2d6: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: aload 22
      // 2de: iload 25
      // 2e0: aaload
      // 2e1: aload 24
      // 2e3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2e8: pop
      // 2e9: iload 21
      // 2eb: ifeq 0b5
      // 2ee: new java/util/LinkedList
      // 2f1: dup
      // 2f2: invokespecial java/util/LinkedList.<init> ()V
      // 2f5: astore 23
      // 2f7: aload 0
      // 2f8: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 2fb: astore 24
      // 2fd: aload 24
      // 2ff: arraylength
      // 300: istore 25
      // 302: lload 6
      // 304: lconst_0
      // 305: lcmp
      // 306: ifle 567
      // 309: bipush 0
      // 30a: istore 26
      // 30c: iload 26
      // 30e: iload 25
      // 310: if_icmpge 34d
      // 313: aload 24
      // 315: iload 26
      // 317: aaload
      // 318: astore 27
      // 31a: aload 23
      // 31c: aload 27
      // 31e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 323: pop
      // 324: iinc 26 1
      // 327: iload 21
      // 329: lload 6
      // 32b: lconst_0
      // 32c: lcmp
      // 32d: iflt 335
      // 330: ifne 567
      // 333: iload 21
      // 335: ifeq 30c
      // 338: lload 6
      // 33a: lconst_0
      // 33b: lcmp
      // 33c: ifle 327
      // 33f: goto 34d
      // 342: ldc2_w -2427136216808976951
      // 345: lload 6
      // 347: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: athrow
      // 34d: aload 22
      // 34f: arraylength
      // 350: bipush 1
      // 351: isub
      // 352: istore 24
      // 354: iload 24
      // 356: iflt 463
      // 359: aload 22
      // 35b: iload 24
      // 35d: aaload
      // 35e: astore 25
      // 360: iload 21
      // 362: lload 6
      // 364: lconst_0
      // 365: lcmp
      // 366: iflt 36e
      // 369: ifne 48b
      // 36c: iload 21
      // 36e: lload 6
      // 370: lconst_0
      // 371: lcmp
      // 372: iflt 460
      // 375: ifne 45e
      // 378: goto 386
      // 37b: ldc2_w -2427136216808976951
      // 37e: lload 6
      // 380: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 25
      // 388: ifnull 454
      // 38b: goto 399
      // 38e: ldc2_w -2427136216808976951
      // 391: lload 6
      // 393: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: athrow
      // 399: aload 25
      // 39b: lload 11
      // 39d: bipush 1
      // 39e: anewarray 384
      // 3a1: dup_x2
      // 3a2: dup_x2
      // 3a3: pop
      // 3a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a7: bipush 0
      // 3a8: swap
      // 3a9: aastore
      // 3aa: ldc2_w -2374355328399971996
      // 3ad: lload 6
      // 3af: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Comparator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: ldc2_w -4563340926765402816
      // 3b7: lload 6
      // 3b9: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: aload 25
      // 3c0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3c5: astore 26
      // 3c7: aload 26
      // 3c9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3ce: ifeq 454
      // 3d1: aload 26
      // 3d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3d8: checkcast com/zelix/be
      // 3db: astore 27
      // 3dd: iload 24
      // 3df: iload 21
      // 3e1: ifne 356
      // 3e4: iload 21
      // 3e6: lload 6
      // 3e8: lconst_0
      // 3e9: lcmp
      // 3ea: iflt 3e1
      // 3ed: lload 6
      // 3ef: lconst_0
      // 3f0: lcmp
      // 3f1: iflt 3fc
      // 3f4: ifne 424
      // 3f7: aload 22
      // 3f9: arraylength
      // 3fa: bipush 1
      // 3fb: isub
      // 3fc: if_icmpne 431
      // 3ff: goto 40d
      // 402: ldc2_w -2427136216808976951
      // 405: lload 6
      // 407: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: athrow
      // 40d: aload 23
      // 40f: aload 27
      // 411: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 416: goto 424
      // 419: ldc2_w -2427136216808976951
      // 41c: lload 6
      // 41e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: athrow
      // 424: pop
      // 425: iload 21
      // 427: lload 6
      // 429: lconst_0
      // 42a: lcmp
      // 42b: ifle 451
      // 42e: ifeq 44f
      // 431: aload 23
      // 433: iload 24
      // 435: aload 27
      // 437: ldc2_w -4189857981955157785
      // 43a: lload 6
      // 43c: invokedynamic q (Ljava/lang/Object;ILjava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 441: goto 44f
      // 444: ldc2_w -2427136216808976951
      // 447: lload 6
      // 449: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44e: athrow
      // 44f: iload 21
      // 451: ifeq 3c7
      // 454: lload 6
      // 456: lconst_0
      // 457: lcmp
      // 458: iflt 48b
      // 45b: iinc 24 -1
      // 45e: iload 21
      // 460: ifeq 354
      // 463: aload 0
      // 464: aload 23
      // 466: aload 23
      // 468: invokeinterface java/util/List.size ()I 1
      // 46d: anewarray 280
      // 470: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 475: checkcast [Lcom/zelix/be;
      // 478: putfield com/zelix/k_.U [Lcom/zelix/be;
      // 47b: aload 0
      // 47c: aload 0
      // 47d: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 480: arraylength
      // 481: putfield com/zelix/k_.m I
      // 484: lload 6
      // 486: lconst_0
      // 487: lcmp
      // 488: ifle 359
      // 48b: new java/lang/StringBuilder
      // 48e: dup
      // 48f: invokespecial java/lang/StringBuilder.<init> ()V
      // 492: astore 24
      // 494: iload 5
      // 496: iload 21
      // 498: ifne 4d9
      // 49b: ifeq 567
      // 49e: goto 4ac
      // 4a1: ldc2_w -2427136216808976951
      // 4a4: lload 6
      // 4a6: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ab: athrow
      // 4ac: aload 8
      // 4ae: iload 21
      // 4b0: ifne 4de
      // 4b3: goto 4c1
      // 4b6: ldc2_w -2427136216808976951
      // 4b9: lload 6
      // 4bb: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: athrow
      // 4c1: ldc2_w -2671017406217486171
      // 4c4: lload 6
      // 4c6: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cb: goto 4d9
      // 4ce: ldc2_w -2427136216808976951
      // 4d1: lload 6
      // 4d3: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: athrow
      // 4d9: ifeq 567
      // 4dc: aload 8
      // 4de: lload 17
      // 4e0: bipush 1
      // 4e1: anewarray 384
      // 4e4: dup_x2
      // 4e5: dup_x2
      // 4e6: pop
      // 4e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ea: bipush 0
      // 4eb: swap
      // 4ec: aastore
      // 4ed: ldc2_w -2864627087844997400
      // 4f0: lload 6
      // 4f2: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: astore 25
      // 4f9: aload 25
      // 4fb: new java/lang/StringBuilder
      // 4fe: dup
      // 4ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 502: sipush 911
      // 505: ldc2_w 5438689423339784075
      // 508: lload 6
      // 50a: lxor
      // 50b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 513: aload 0
      // 514: invokevirtual com/zelix/k_.H ()Lcom/zelix/_4;
      // 517: checkcast com/zelix/bn
      // 51a: lload 13
      // 51c: ldc2_w -2845296208156220014
      // 51f: lload 6
      // 521: invokedynamic q (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 529: sipush 15271
      // 52c: ldc2_w 1118771495669481390
      // 52f: lload 6
      // 531: lxor
      // 532: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 537: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53a: aload 0
      // 53b: lload 19
      // 53d: bipush 1
      // 53e: anewarray 384
      // 541: dup_x2
      // 542: dup_x2
      // 543: pop
      // 544: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 547: bipush 0
      // 548: swap
      // 549: aastore
      // 54a: ldc2_w -2363670528836706140
      // 54d: lload 6
      // 54f: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 554: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 557: ldc "'"
      // 559: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55c: ldc ""
      // 55e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 561: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 564: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 567: return
   }

   Map M(Object[] param1) {
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
      // 0c: getstatic com/zelix/k_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 128441557184101
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2536787958710958036
      // 1e: lload 2
      // 1f: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2f: arraylength
      // 30: if_icmpge 90
      // 33: aload 0
      // 34: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifne 6c
      // 3f: instanceof com/zelix/ku
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: ifle 8d
      // 48: ifeq 88
      // 4b: goto 58
      // 4e: ldc2_w -4387288271080746875
      // 51: lload 2
      // 52: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w -4387288271080746875
      // 65: lload 2
      // 66: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/ku
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 384
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w -2561892301096429067
      // 81: lload 2
      // 82: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: areturn
      // 88: iinc 7 1
      // 8b: iload 6
      // 8d: ifeq 29
      // 90: lload 2
      // 91: lconst_0
      // 92: lcmp
      // 93: iflt 33
      // 96: aconst_null
      // 97: areturn
   }

   boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 17169260258548L;
      return m44.a<"p">(this.F, new Object[]{var4}, 7885088442314539680L, var2);
   }

   boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 9785540749261L;
      return ((b1)this.H()).C(var4);
   }

   void D(Object[] param1) {
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
      // 00c: getstatic com/zelix/k_.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 83751566857697
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 131498142836179
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 121022877133950
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 45608343776496
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 6550798431643
      // 033: lxor
      // 034: dup2
      // 035: bipush 32
      // 037: lushr
      // 038: l2i
      // 039: istore 12
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lshl
      // 03f: bipush 48
      // 041: lushr
      // 042: l2i
      // 043: istore 13
      // 045: dup2
      // 046: bipush 48
      // 048: lshl
      // 049: bipush 48
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 14
      // 04f: pop2
      // 050: dup2
      // 051: ldc2_w 12530110016368
      // 054: lxor
      // 055: lstore 15
      // 057: dup2
      // 058: ldc2_w 71356457050016
      // 05b: lxor
      // 05c: dup2
      // 05d: bipush 16
      // 05f: lushr
      // 060: lstore 17
      // 062: dup2
      // 063: bipush 48
      // 065: lshl
      // 066: bipush 48
      // 068: lushr
      // 069: l2i
      // 06a: istore 19
      // 06c: pop2
      // 06d: pop2
      // 06e: ldc2_w -7376753970601407161
      // 071: lload 2
      // 072: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 0
      // 078: lload 17
      // 07a: iload 19
      // 07c: i2c
      // 07d: invokevirtual com/zelix/k_.I (JC)Ljava/util/List;
      // 080: astore 21
      // 082: istore 20
      // 084: aload 21
      // 086: iload 20
      // 088: ifne 09d
      // 08b: ifnull 249
      // 08e: goto 09b
      // 091: ldc2_w -8757745227345898002
      // 094: lload 2
      // 095: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 21
      // 09d: invokeinterface java/util/List.size ()I 1
      // 0a2: iload 20
      // 0a4: lload 2
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: ifle 0d2
      // 0aa: ifne 0d0
      // 0ad: ifle 249
      // 0b0: goto 0bd
      // 0b3: ldc2_w -8757745227345898002
      // 0b6: lload 2
      // 0b7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: lload 8
      // 0c0: invokevirtual com/zelix/k_.L (J)Z
      // 0c3: goto 0d0
      // 0c6: ldc2_w -8757745227345898002
      // 0c9: lload 2
      // 0ca: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: iload 20
      // 0d2: ifne 0e6
      // 0d5: ifeq 0e9
      // 0d8: goto 0e5
      // 0db: ldc2_w -8757745227345898002
      // 0de: lload 2
      // 0df: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: bipush 0
      // 0e6: goto 0ea
      // 0e9: bipush 1
      // 0ea: istore 22
      // 0ec: aload 21
      // 0ee: invokeinterface java/util/List.size ()I 1
      // 0f3: iload 12
      // 0f5: iload 13
      // 0f7: i2c
      // 0f8: iload 14
      // 0fa: i2s
      // 0fb: invokestatic com/zelix/cf.x (IICS)I
      // 0fe: lload 4
      // 100: bipush 2
      // 101: anewarray 384
      // 104: dup_x2
      // 105: dup_x2
      // 106: pop
      // 107: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w -7358224860621140310
      // 118: lload 2
      // 119: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: astore 23
      // 120: bipush 0
      // 121: istore 24
      // 123: iload 24
      // 125: aload 21
      // 127: invokeinterface java/util/List.size ()I 1
      // 12c: if_icmpge 1a8
      // 12f: aload 21
      // 131: iload 24
      // 133: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 138: checkcast java/lang/String
      // 13b: astore 25
      // 13d: aload 23
      // 13f: getstatic com/zelix/k_.S Lcom/zelix/o9;
      // 142: lload 6
      // 144: iload 22
      // 146: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // 149: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: iinc 22 1
      // 152: aload 25
      // 154: ldc "D"
      // 156: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 159: iload 20
      // 15b: lload 2
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: iflt 166
      // 161: ifne 1b6
      // 164: iload 20
      // 166: ifne 19a
      // 169: goto 176
      // 16c: ldc2_w -8757745227345898002
      // 16f: lload 2
      // 170: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: ifne 19d
      // 179: goto 186
      // 17c: ldc2_w -8757745227345898002
      // 17f: lload 2
      // 180: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 25
      // 188: ldc "J"
      // 18a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18d: goto 19a
      // 190: ldc2_w -8757745227345898002
      // 193: lload 2
      // 194: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: ifeq 1a0
      // 19d: iinc 22 1
      // 1a0: iinc 24 1
      // 1a3: iload 20
      // 1a5: ifeq 123
      // 1a8: aload 0
      // 1a9: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1ac: arraylength
      // 1ad: istore 24
      // 1af: lload 2
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: iflt 26f
      // 1b5: bipush 0
      // 1b6: istore 25
      // 1b8: iload 25
      // 1ba: iload 24
      // 1bc: if_icmpge 238
      // 1bf: iload 20
      // 1c1: ifne 26f
      // 1c4: aload 0
      // 1c5: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1c8: iload 25
      // 1ca: aaload
      // 1cb: iload 20
      // 1cd: ifne 20a
      // 1d0: goto 1dd
      // 1d3: ldc2_w -8757745227345898002
      // 1d6: lload 2
      // 1d7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: instanceof com/zelix/km
      // 1e0: lload 2
      // 1e1: lconst_0
      // 1e2: lcmp
      // 1e3: ifle 235
      // 1e6: ifeq 230
      // 1e9: goto 1f6
      // 1ec: ldc2_w -8757745227345898002
      // 1ef: lload 2
      // 1f0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1fa: iload 25
      // 1fc: aaload
      // 1fd: goto 20a
      // 200: ldc2_w -8757745227345898002
      // 203: lload 2
      // 204: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: checkcast com/zelix/km
      // 20d: astore 26
      // 20f: aload 26
      // 211: lload 15
      // 213: aload 23
      // 215: bipush 2
      // 216: anewarray 384
      // 219: dup_x1
      // 21a: swap
      // 21b: bipush 1
      // 21c: swap
      // 21d: aastore
      // 21e: dup_x2
      // 21f: dup_x2
      // 220: pop
      // 221: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 224: bipush 0
      // 225: swap
      // 226: aastore
      // 227: ldc2_w -8912519667173428115
      // 22a: lload 2
      // 22b: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: iinc 25 1
      // 233: iload 20
      // 235: ifeq 1b8
      // 238: lload 2
      // 239: lconst_0
      // 23a: lcmp
      // 23b: ifle 262
      // 23e: iload 20
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 1c1
      // 246: ifeq 26f
      // 249: aload 0
      // 24a: lload 10
      // 24c: bipush 1
      // 24d: anewarray 384
      // 250: dup_x2
      // 251: dup_x2
      // 252: pop
      // 253: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 256: bipush 0
      // 257: swap
      // 258: aastore
      // 259: ldc2_w -7233992874061658779
      // 25c: lload 2
      // 25d: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: goto 26f
      // 265: ldc2_w -8757745227345898002
      // 268: lload 2
      // 269: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: return
   }

   public void d(Object[] param1) {
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
      // 004: checkcast com/zelix/r_
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 7
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 6
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/String
      // 024: astore 3
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Long
      // 02b: invokevirtual java/lang/Long.longValue ()J
      // 02e: lstore 4
      // 030: pop
      // 031: getstatic com/zelix/k_.a J
      // 034: lload 4
      // 036: lxor
      // 037: lstore 4
      // 039: lload 4
      // 03b: dup2
      // 03c: ldc2_w 112174468274538
      // 03f: lxor
      // 040: lstore 8
      // 042: dup2
      // 043: ldc2_w 98643445731168
      // 046: lxor
      // 047: lstore 10
      // 049: dup2
      // 04a: ldc2_w 38658497933946
      // 04d: lxor
      // 04e: lstore 12
      // 050: pop2
      // 051: ldc2_w 2453003529341925101
      // 054: lload 4
      // 056: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: istore 14
      // 05d: aload 0
      // 05e: iload 14
      // 060: ifne 086
      // 063: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 066: ifnull 14d
      // 069: goto 077
      // 06c: ldc2_w 4457558624574729796
      // 06f: lload 4
      // 071: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 0
      // 078: goto 086
      // 07b: ldc2_w 4457558624574729796
      // 07e: lload 4
      // 080: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: invokevirtual com/zelix/k_.X ()I
      // 089: istore 15
      // 08b: iload 15
      // 08d: iload 14
      // 08f: lload 4
      // 091: lconst_0
      // 092: lcmp
      // 093: ifle 09b
      // 096: ifne 0e2
      // 099: iload 7
      // 09b: if_icmpge 0de
      // 09e: goto 0ac
      // 0a1: ldc2_w 4457558624574729796
      // 0a4: lload 4
      // 0a6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: iload 7
      // 0af: lload 8
      // 0b1: bipush 2
      // 0b2: anewarray 384
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 1
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: bipush 0
      // 0c4: swap
      // 0c5: aastore
      // 0c6: ldc2_w 2829456882545862890
      // 0c9: lload 4
      // 0cb: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: goto 0de
      // 0d3: ldc2_w 4457558624574729796
      // 0d6: lload 4
      // 0d8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 0
      // 0df: invokevirtual com/zelix/k_.p ()I
      // 0e2: istore 16
      // 0e4: lload 4
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: ifle 116
      // 0eb: iload 16
      // 0ed: iload 6
      // 0ef: if_icmpge 124
      // 0f2: aload 0
      // 0f3: lload 12
      // 0f5: iload 6
      // 0f7: bipush 2
      // 0f8: anewarray 384
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: bipush 1
      // 101: swap
      // 102: aastore
      // 103: dup_x2
      // 104: dup_x2
      // 105: pop
      // 106: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 109: bipush 0
      // 10a: swap
      // 10b: aastore
      // 10c: ldc2_w 4363858448274750185
      // 10f: lload 4
      // 111: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: goto 124
      // 119: ldc2_w 4457558624574729796
      // 11c: lload 4
      // 11e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 0
      // 125: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 128: lload 10
      // 12a: aload 2
      // 12b: aload 3
      // 12c: bipush 3
      // 12d: anewarray 384
      // 130: dup_x1
      // 131: swap
      // 132: bipush 2
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w 2519637754451962629
      // 146: lload 4
      // 148: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public k_(x8 var1, int var2, int var3, bc var4, l6c[] var5, long var6) {
      var6 = a ^ var6;
      long var8 = var6 ^ 34385076700653L;
      long var10 = var6 ^ 23271929240488L;
      long var12 = var6 ^ 3708117504952L;
      long var14 = var6 ^ 27537816647025L;
      boolean var10000 = m44.a<"k">(4063014834946534533L, var6);
      super(null, var1, var4.A(new Object[0]) + var5.length * c<"n">(21614, 4123307865913142073L ^ var6));
      this.A = var2;
      this.j = var3;
      this.F = var4;
      m44.a<"t">(this.F, new Object[]{this}, 2479125926735266899L, var6);
      this.m = var5.length;
      boolean var16 = var10000;
      this.U = new be[this.m];
      int var17 = 0;

      label43:
      while (var17 < this.m) {
         l6c var18 = var5[var17];

         try {
            this.U[var17] = new be(
               this,
               m44.a<"t">(var18, new Object[]{var10}, 4573850742420481001L, var6),
               m44.a<"t">(var18, new Object[]{var8}, 2533924007463417099L, var6),
               m44.a<"t">(var18, new Object[]{var14}, 4051436453397087770L, var6),
               m44.a<"t">(var18, new Object[]{var12}, 2797383837249131743L, var6)
            );
            var17++;
         } catch (nn var20) {
            boolean var10001 = false;
            throw m44.a<"k">(var20, 2860918475144328236L, var6);
         }

         while (true) {
            try {
               var10000 = var16;
               if (var6 > 0L) {
                  if (var16) {
                     return;
                  }

                  var10000 = var16;
               }

               if (!var10000) {
                  break;
               }
            } catch (nn var19) {
               boolean var24 = false;
               throw m44.a<"k">(var19, 2860918475144328236L, var6);
            }

            if (var6 > 0L) {
               break label43;
            }
         }
      }

      this.P = 0;
      this.N = new kw[this.P];
   }

   public void Cs(Object[] param1) {
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
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/util/Set
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 6
      // 02a: pop
      // 02b: getstatic com/zelix/k_.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 84561537702301
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 43032191747749
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 131792094544086
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 37704150419645
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 102251814992632
      // 055: lxor
      // 056: lstore 16
      // 058: pop2
      // 059: aload 0
      // 05a: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 05d: aload 5
      // 05f: aload 3
      // 060: aload 2
      // 061: aload 4
      // 063: lload 16
      // 065: bipush 5
      // 066: anewarray 384
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 4
      // 070: swap
      // 071: aastore
      // 072: dup_x1
      // 073: swap
      // 074: bipush 3
      // 075: swap
      // 076: aastore
      // 077: dup_x1
      // 078: swap
      // 079: bipush 2
      // 07a: swap
      // 07b: aastore
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: bipush 0
      // 084: swap
      // 085: aastore
      // 086: ldc2_w 1388336011255110308
      // 089: lload 6
      // 08b: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: ldc2_w 1021659574307225445
      // 093: lload 6
      // 095: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: bipush 0
      // 09b: istore 19
      // 09d: istore 18
      // 09f: iload 19
      // 0a1: aload 0
      // 0a2: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0a5: arraylength
      // 0a6: if_icmpge 16b
      // 0a9: aload 0
      // 0aa: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 0ad: iload 19
      // 0af: aaload
      // 0b0: astore 20
      // 0b2: aload 20
      // 0b4: lload 14
      // 0b6: invokevirtual com/zelix/be.i (J)Ljava/lang/String;
      // 0b9: astore 21
      // 0bb: lload 8
      // 0bd: aload 21
      // 0bf: invokestatic com/zelix/l62.G (JLjava/lang/String;)Lcom/zelix/_v;
      // 0c2: astore 22
      // 0c4: iload 18
      // 0c6: lload 6
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 168
      // 0cd: ifeq 166
      // 0d0: aload 22
      // 0d2: ifnull 163
      // 0d5: goto 0e3
      // 0d8: ldc2_w 694510787910720059
      // 0db: lload 6
      // 0dd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 22
      // 0e5: lload 10
      // 0e7: invokevirtual com/zelix/_v.N (J)Z
      // 0ea: iload 18
      // 0ec: ifeq 162
      // 0ef: goto 0fd
      // 0f2: ldc2_w 694510787910720059
      // 0f5: lload 6
      // 0f7: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 6
      // 0ff: lconst_0
      // 100: lcmp
      // 101: iflt 154
      // 104: ifeq 14b
      // 107: goto 115
      // 10a: ldc2_w 694510787910720059
      // 10d: lload 6
      // 10f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 5
      // 117: aload 22
      // 119: lload 12
      // 11b: bipush 1
      // 11c: anewarray 384
      // 11f: dup_x2
      // 120: dup_x2
      // 121: pop
      // 122: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125: bipush 0
      // 126: swap
      // 127: aastore
      // 128: ldc2_w 691372872326451654
      // 12b: lload 6
      // 12d: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 137: pop
      // 138: iload 18
      // 13a: ifne 163
      // 13d: goto 14b
      // 140: ldc2_w 694510787910720059
      // 143: lload 6
      // 145: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: aload 5
      // 14d: aload 22
      // 14f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 154: goto 162
      // 157: ldc2_w 694510787910720059
      // 15a: lload 6
      // 15c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: pop
      // 163: iinc 19 1
      // 166: iload 18
      // 168: ifne 09f
      // 16b: return
   }

   public void b(Object[] param1) {
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
      // 04: checkcast java/lang/Boolean
      // 07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/k_.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w 4038001922462402881
      // 20: lload 2
      // 21: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 5
      // 28: aload 0
      // 29: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 2c: iload 5
      // 2e: ifeq 52
      // 31: ifnull 69
      // 34: goto 41
      // 37: ldc2_w 4577646526500334623
      // 3a: lload 2
      // 3b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 45: goto 52
      // 48: ldc2_w 4577646526500334623
      // 4b: lload 2
      // 4c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: iload 4
      // 54: bipush 1
      // 55: anewarray 384
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d: bipush 0
      // 5e: swap
      // 5f: aastore
      // 60: ldc2_w 2811330887214198759
      // 63: lload 2
      // 64: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: return
   }

   int l(Object[] param1) {
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
      // 0e: checkcast com/zelix/oz
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/k_.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -8883740140721605122
      // 1c: lload 3
      // 1d: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 0
      // 25: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 28: iload 5
      // 2a: ifeq 4e
      // 2d: ifnull 62
      // 30: goto 3d
      // 33: ldc2_w -8991347108216450912
      // 36: lload 3
      // 37: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 41: goto 4e
      // 44: ldc2_w -8991347108216450912
      // 47: lload 3
      // 48: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 2
      // 4f: bipush 1
      // 50: anewarray 384
      // 53: dup_x1
      // 54: swap
      // 55: bipush 0
      // 56: swap
      // 57: aastore
      // 58: ldc2_w -7317725101272670649
      // 5b: lload 3
      // 5c: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ireturn
      // 62: bipush -1
      // 63: ireturn
   }

   final void gr(Object[] param1) {
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
      // 04: checkcast com/zelix/_u
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/_6
      // 0e: astore 6
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/l6z
      // 16: astore 7
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 4
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast com/zelix/lqu
      // 29: astore 3
      // 2a: pop
      // 2b: getstatic com/zelix/k_.a J
      // 2e: lload 4
      // 30: lxor
      // 31: lstore 4
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 93884381984200
      // 39: lxor
      // 3a: lstore 8
      // 3c: pop2
      // 3d: ldc2_w -4925027207303214354
      // 40: lload 4
      // 42: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: bipush 0
      // 48: istore 11
      // 4a: istore 10
      // 4c: iload 11
      // 4e: aload 0
      // 4f: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 52: arraylength
      // 53: if_icmpge d0
      // 56: aload 0
      // 57: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 5a: iload 11
      // 5c: aaload
      // 5d: iload 10
      // 5f: ifeq 92
      // 62: instanceof com/zelix/e9
      // 65: lload 4
      // 67: lconst_0
      // 68: lcmp
      // 69: ifle cd
      // 6c: ifeq c8
      // 6f: goto 7d
      // 72: ldc2_w -4888651069856157776
      // 75: lload 4
      // 77: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 81: iload 11
      // 83: aaload
      // 84: goto 92
      // 87: ldc2_w -4888651069856157776
      // 8a: lload 4
      // 8c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: checkcast com/zelix/e9
      // 95: lload 8
      // 97: aload 2
      // 98: aload 6
      // 9a: aload 7
      // 9c: aload 3
      // 9d: bipush 5
      // 9e: anewarray 384
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
      // b0: dup_x1
      // b1: swap
      // b2: bipush 1
      // b3: swap
      // b4: aastore
      // b5: dup_x2
      // b6: dup_x2
      // b7: pop
      // b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bb: bipush 0
      // bc: swap
      // bd: aastore
      // be: ldc2_w -4849956972480142785
      // c1: lload 4
      // c3: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: iinc 11 1
      // cb: iload 10
      // cd: ifne 4c
      // d0: lload 4
      // d2: lconst_0
      // d3: lcmp
      // d4: iflt 56
      // d7: return
   }

   public void h(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/k_.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 28155600947655
      // 22: lxor
      // 23: dup2
      // 24: bipush 32
      // 26: lushr
      // 27: l2i
      // 28: istore 5
      // 2a: dup2
      // 2b: bipush 32
      // 2d: lshl
      // 2e: bipush 48
      // 30: lushr
      // 31: l2i
      // 32: istore 6
      // 34: dup2
      // 35: bipush 48
      // 37: lshl
      // 38: bipush 48
      // 3a: lushr
      // 3b: l2i
      // 3c: istore 7
      // 3e: pop2
      // 3f: pop2
      // 40: ldc2_w -8680993778885527858
      // 43: lload 2
      // 44: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 8
      // 4b: iload 8
      // 4d: ifeq 82
      // 50: iload 4
      // 52: sipush 2515
      // 55: ldc2_w 7683803287657107775
      // 58: lload 2
      // 59: lxor
      // 5a: invokedynamic n (IJ)I bsm=com/zelix/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: if_icmpgt 87
      // 62: goto 6f
      // 65: ldc2_w -9221078183241329776
      // 68: lload 2
      // 69: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aload 0
      // 70: iload 4
      // 72: putfield com/zelix/k_.A I
      // 75: goto 82
      // 78: ldc2_w -9221078183241329776
      // 7b: lload 2
      // 7c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: iload 8
      // 84: ifne dc
      // 87: new com/zelix/un
      // 8a: dup
      // 8b: new java/lang/StringBuilder
      // 8e: dup
      // 8f: invokespecial java/lang/StringBuilder.<init> ()V
      // 92: sipush 21501
      // 95: ldc2_w 7741194570289187241
      // 98: lload 2
      // 99: lxor
      // 9a: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a2: aload 0
      // a3: iload 5
      // a5: iload 6
      // a7: i2c
      // a8: iload 7
      // aa: i2s
      // ab: invokevirtual com/zelix/k_.l (ICS)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: sipush 28267
      // b4: ldc2_w 8843016723051983928
      // b7: lload 2
      // b8: lxor
      // b9: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: iload 4
      // c3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c6: ldc ")"
      // c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ce: invokespecial com/zelix/un.<init> (Ljava/lang/String;)V
      // d1: athrow
      // d2: ldc2_w -9221078183241329776
      // d5: lload 2
      // d6: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: return
   }

   public void jV(Object[] var1) {
      l6c[] var4 = (l6c[])var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 43529697670787L;
      long var7 = var2 ^ 50545346848966L;
      long var9 = var2 ^ 65479853220054L;
      long var11 = var2 ^ 37217227867679L;
      boolean var10000 = m44.a<"m">(-3218680680626281956L, var2);
      this.m = var4.length;
      this.U = new be[this.m];
      boolean var13 = var10000;
      int var14 = 0;

      while (var14 < this.m) {
         l6c var15 = var4[var14];
         this.U[var14] = new be(
            this,
            m44.a<"r">(var15, new Object[]{var7}, -3740329827656019833L, var2),
            m44.a<"r">(var15, new Object[]{var5}, -3439493754517322139L, var2),
            m44.a<"r">(var15, new Object[]{var11}, -3794371541405289100L, var2),
            m44.a<"r">(var15, new Object[]{var9}, -3045430511904905295L, var2)
         );
         var14++;
         if (!var13) {
            break;
         }
      }
   }

   void p(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 28171064860998L;
      m44.a<"q">(this.F, new Object[]{var5, var4}, 2774227935611297806L, var2);
   }

   void P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 127022162758416L;
      m44.a<"t">(this, new Object[]{var4, ks.class}, -7638579100734719651L, var2);
   }

   public final void E(Object[] param1) {
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
      // 04: checkcast java/util/Set
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/k_.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 104972053979198
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -4971450290105815066
      // 26: lload 2
      // 27: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: bipush 0
      // 2d: istore 8
      // 2f: istore 7
      // 31: iload 8
      // 33: aload 0
      // 34: getfield com/zelix/k_.P I
      // 37: if_icmpge a1
      // 3a: aload 0
      // 3b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 3e: iload 8
      // 40: aaload
      // 41: iload 7
      // 43: ifne 73
      // 46: instanceof com/zelix/e9
      // 49: lload 2
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: iflt 9e
      // 4f: ifeq 99
      // 52: goto 5f
      // 55: ldc2_w -6568675942949980337
      // 58: lload 2
      // 59: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 63: iload 8
      // 65: aaload
      // 66: goto 73
      // 69: ldc2_w -6568675942949980337
      // 6c: lload 2
      // 6d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: checkcast com/zelix/e9
      // 76: astore 9
      // 78: aload 9
      // 7a: aload 4
      // 7c: lload 5
      // 7e: bipush 2
      // 7f: anewarray 384
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 1
      // 89: swap
      // 8a: aastore
      // 8b: dup_x1
      // 8c: swap
      // 8d: bipush 0
      // 8e: swap
      // 8f: aastore
      // 90: ldc2_w -6864454217823481075
      // 93: lload 2
      // 94: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: iinc 8 1
      // 9c: iload 7
      // 9e: ifeq 31
      // a1: lload 2
      // a2: lconst_0
      // a3: lcmp
      // a4: ifle 3a
      // a7: return
   }

   public void V(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var4 = (Long)var1[1];
      h0 var3 = (h0)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 108744074130207L;
      m44.a<"q">(this.F, new Object[]{var6, var2, var3}, -6701245197424485414L, var4);
   }

   public void q(Object[] param1) {
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
      // 004: checkcast com/zelix/hf
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/qr
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast com/zelix/lqu
      // 015: astore 6
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/io/PrintWriter
      // 01d: astore 7
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 4
      // 02a: pop
      // 02b: getstatic com/zelix/k_.a J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 91902742099231
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 50289012078779
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 72433893135708
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 70433911323789
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 88324001130555
      // 055: lxor
      // 056: dup2
      // 057: bipush 32
      // 059: lushr
      // 05a: l2i
      // 05b: istore 16
      // 05d: dup2
      // 05e: bipush 32
      // 060: lshl
      // 061: bipush 56
      // 063: lushr
      // 064: l2i
      // 065: istore 17
      // 067: dup2
      // 068: bipush 40
      // 06a: lshl
      // 06b: bipush 40
      // 06d: lushr
      // 06e: l2i
      // 06f: istore 18
      // 071: pop2
      // 072: dup2
      // 073: ldc2_w 111838467716553
      // 076: lxor
      // 077: lstore 19
      // 079: pop2
      // 07a: aload 6
      // 07c: lload 19
      // 07e: bipush 1
      // 07f: anewarray 384
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 0
      // 089: swap
      // 08a: aastore
      // 08b: ldc2_w -7604914597515704157
      // 08e: lload 4
      // 090: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 22
      // 097: ldc2_w -7524108968342460708
      // 09a: lload 4
      // 09c: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: aload 0
      // 0a2: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0a5: arraylength
      // 0a6: istore 23
      // 0a8: new java/util/ArrayList
      // 0ab: dup
      // 0ac: invokespecial java/util/ArrayList.<init> ()V
      // 0af: astore 24
      // 0b1: istore 21
      // 0b3: bipush 0
      // 0b4: istore 25
      // 0b6: iload 25
      // 0b8: iload 23
      // 0ba: if_icmpge 3b9
      // 0bd: aload 0
      // 0be: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0c1: iload 25
      // 0c3: aaload
      // 0c4: instanceof com/zelix/b8
      // 0c7: iload 21
      // 0c9: lload 4
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 3e7
      // 0d0: ifeq 3e5
      // 0d3: iload 21
      // 0d5: ifeq 297
      // 0d8: goto 0e6
      // 0db: ldc2_w -8063076277488139390
      // 0de: lload 4
      // 0e0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: lload 4
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: iflt 289
      // 0ed: ifeq 27f
      // 0f0: goto 0fe
      // 0f3: ldc2_w -8063076277488139390
      // 0f6: lload 4
      // 0f8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 2
      // 0ff: ldc2_w -7565707475623272942
      // 102: lload 4
      // 104: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: iload 21
      // 10b: lload 4
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 299
      // 112: ifeq 297
      // 115: goto 123
      // 118: ldc2_w -8063076277488139390
      // 11b: lload 4
      // 11d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: ifeq 27f
      // 126: goto 134
      // 129: ldc2_w -8063076277488139390
      // 12c: lload 4
      // 12e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 0
      // 135: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 138: iload 25
      // 13a: aaload
      // 13b: checkcast com/zelix/b8
      // 13e: astore 26
      // 140: iload 21
      // 142: lload 4
      // 144: lconst_0
      // 145: lcmp
      // 146: iflt 275
      // 149: ifeq 273
      // 14c: aload 6
      // 14e: ldc2_w -7735630060175438098
      // 151: lload 4
      // 153: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: ifeq 1f5
      // 15b: goto 169
      // 15e: ldc2_w -8063076277488139390
      // 161: lload 4
      // 163: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 22
      // 16b: new java/lang/StringBuilder
      // 16e: dup
      // 16f: invokespecial java/lang/StringBuilder.<init> ()V
      // 172: sipush 18257
      // 175: ldc2_w 7168730639194295569
      // 178: lload 4
      // 17a: lxor
      // 17b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 183: aload 26
      // 185: bipush 0
      // 186: anewarray 384
      // 189: ldc2_w -8371528281686352835
      // 18c: lload 4
      // 18e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: sipush 17252
      // 199: ldc2_w 2884211701365147965
      // 19c: lload 4
      // 19e: lxor
      // 19f: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 0
      // 1a8: lload 12
      // 1aa: bipush 1
      // 1ab: anewarray 384
      // 1ae: dup_x2
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: ldc2_w -7555283374337030768
      // 1ba: lload 4
      // 1bc: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c4: sipush 3059
      // 1c7: ldc2_w 30371405936050621
      // 1ca: lload 4
      // 1cc: lxor
      // 1cd: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d5: aload 0
      // 1d6: lload 10
      // 1d8: invokevirtual com/zelix/k_.h (J)Ljava/lang/String;
      // 1db: invokestatic com/zelix/cf.a (Ljava/lang/String;)Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e4: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1e7: goto 1f5
      // 1ea: ldc2_w -8063076277488139390
      // 1ed: lload 4
      // 1ef: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: aload 7
      // 1f7: new java/lang/StringBuilder
      // 1fa: dup
      // 1fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fe: sipush 18360
      // 201: ldc2_w 946510489099931132
      // 204: lload 4
      // 206: lxor
      // 207: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20f: aload 26
      // 211: bipush 0
      // 212: anewarray 384
      // 215: ldc2_w -8371528281686352835
      // 218: lload 4
      // 21a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 222: sipush 9694
      // 225: ldc2_w 2852711260479909781
      // 228: lload 4
      // 22a: lxor
      // 22b: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 233: aload 0
      // 234: lload 12
      // 236: bipush 1
      // 237: anewarray 384
      // 23a: dup_x2
      // 23b: dup_x2
      // 23c: pop
      // 23d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 240: bipush 0
      // 241: swap
      // 242: aastore
      // 243: ldc2_w -7555283374337030768
      // 246: lload 4
      // 248: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 250: sipush 18340
      // 253: ldc2_w 1852652816301985279
      // 256: lload 4
      // 258: lxor
      // 259: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 261: aload 0
      // 262: lload 10
      // 264: invokevirtual com/zelix/k_.h (J)Ljava/lang/String;
      // 267: invokestatic com/zelix/cf.a (Ljava/lang/String;)Ljava/lang/String;
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 270: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 273: iload 21
      // 275: lload 4
      // 277: lconst_0
      // 278: lcmp
      // 279: iflt 3b6
      // 27c: ifne 3b1
      // 27f: aload 0
      // 280: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 283: iload 25
      // 285: aaload
      // 286: instanceof com/zelix/e9
      // 289: goto 297
      // 28c: ldc2_w -8063076277488139390
      // 28f: lload 4
      // 291: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: iload 21
      // 299: ifeq 3b0
      // 29c: ifeq 394
      // 29f: goto 2ad
      // 2a2: ldc2_w -8063076277488139390
      // 2a5: lload 4
      // 2a7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: athrow
      // 2ad: aload 2
      // 2ae: ldc2_w -7570655440071654569
      // 2b1: lload 4
      // 2b3: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: iload 21
      // 2ba: ifeq 3b0
      // 2bd: goto 2cb
      // 2c0: ldc2_w -8063076277488139390
      // 2c3: lload 4
      // 2c5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: ifeq 394
      // 2ce: goto 2dc
      // 2d1: ldc2_w -8063076277488139390
      // 2d4: lload 4
      // 2d6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: aload 0
      // 2dd: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 2e0: iload 25
      // 2e2: aaload
      // 2e3: checkcast com/zelix/e9
      // 2e6: astore 26
      // 2e8: aload 3
      // 2e9: lload 8
      // 2eb: bipush 1
      // 2ec: anewarray 384
      // 2ef: dup_x2
      // 2f0: dup_x2
      // 2f1: pop
      // 2f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f5: bipush 0
      // 2f6: swap
      // 2f7: aastore
      // 2f8: ldc2_w -7736235092922012256
      // 2fb: lload 4
      // 2fd: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: iload 21
      // 304: lload 4
      // 306: lconst_0
      // 307: lcmp
      // 308: ifle 35e
      // 30b: ifeq 35c
      // 30e: ifeq 388
      // 311: goto 31f
      // 314: ldc2_w -8063076277488139390
      // 317: lload 4
      // 319: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: aload 26
      // 321: aload 3
      // 322: aload 6
      // 324: lload 14
      // 326: aload 7
      // 328: bipush 4
      // 329: anewarray 384
      // 32c: dup_x1
      // 32d: swap
      // 32e: bipush 3
      // 32f: swap
      // 330: aastore
      // 331: dup_x2
      // 332: dup_x2
      // 333: pop
      // 334: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 337: bipush 2
      // 338: swap
      // 339: aastore
      // 33a: dup_x1
      // 33b: swap
      // 33c: bipush 1
      // 33d: swap
      // 33e: aastore
      // 33f: dup_x1
      // 340: swap
      // 341: bipush 0
      // 342: swap
      // 343: aastore
      // 344: ldc2_w -8369499730135763907
      // 347: lload 4
      // 349: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: goto 35c
      // 351: ldc2_w -8063076277488139390
      // 354: lload 4
      // 356: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35b: athrow
      // 35c: iload 21
      // 35e: ifeq 387
      // 361: ifeq 379
      // 364: goto 372
      // 367: ldc2_w -8063076277488139390
      // 36a: lload 4
      // 36c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: athrow
      // 372: lload 4
      // 374: lconst_0
      // 375: lcmp
      // 376: ifge 388
      // 379: aload 24
      // 37b: aload 0
      // 37c: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 37f: iload 25
      // 381: aaload
      // 382: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 387: pop
      // 388: iload 21
      // 38a: lload 4
      // 38c: lconst_0
      // 38d: lcmp
      // 38e: iflt 3b6
      // 391: ifne 3b1
      // 394: aload 24
      // 396: aload 0
      // 397: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 39a: iload 25
      // 39c: aaload
      // 39d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3a2: goto 3b0
      // 3a5: ldc2_w -8063076277488139390
      // 3a8: lload 4
      // 3aa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3af: athrow
      // 3b0: pop
      // 3b1: iinc 25 1
      // 3b4: iload 21
      // 3b6: ifne 0b6
      // 3b9: aload 24
      // 3bb: invokeinterface java/util/List.size ()I 1
      // 3c0: istore 25
      // 3c2: iload 21
      // 3c4: lload 4
      // 3c6: lconst_0
      // 3c7: lcmp
      // 3c8: iflt 0c7
      // 3cb: lload 4
      // 3cd: lconst_0
      // 3ce: lcmp
      // 3cf: ifle 3d7
      // 3d2: ifeq 42a
      // 3d5: iload 25
      // 3d7: goto 3e5
      // 3da: ldc2_w -8063076277488139390
      // 3dd: lload 4
      // 3df: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e4: athrow
      // 3e5: iload 23
      // 3e7: if_icmpge 40b
      // 3ea: aload 0
      // 3eb: aload 24
      // 3ed: iload 25
      // 3ef: anewarray 537
      // 3f2: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 3f7: checkcast [Lcom/zelix/kw;
      // 3fa: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 3fd: goto 40b
      // 400: ldc2_w -8063076277488139390
      // 403: lload 4
      // 405: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: athrow
      // 40b: aload 0
      // 40c: aload 0
      // 40d: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 410: arraylength
      // 411: putfield com/zelix/k_.P I
      // 414: aload 0
      // 415: aload 0
      // 416: iload 16
      // 418: iload 17
      // 41a: i2b
      // 41b: iload 18
      // 41d: ldc2_w -8470126972618407344
      // 420: lload 4
      // 422: invokedynamic r (Ljava/lang/Object;IBIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: putfield com/zelix/k_.W I
      // 42a: return
   }

   boolean V(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/ai
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/t6
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 8
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 6
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Map
      // 031: astore 4
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/lang/Boolean
      // 03a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03d: istore 10
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast java/lang/Boolean
      // 046: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 049: istore 3
      // 04a: pop
      // 04b: getstatic com/zelix/k_.a J
      // 04e: lload 8
      // 050: lxor
      // 051: lstore 8
      // 053: lload 8
      // 055: dup2
      // 056: ldc2_w 121344211420118
      // 059: lxor
      // 05a: lstore 11
      // 05c: dup2
      // 05d: ldc2_w 86480722728472
      // 060: lxor
      // 061: lstore 13
      // 063: dup2
      // 064: ldc2_w 31900364593195
      // 067: lxor
      // 068: lstore 15
      // 06a: dup2
      // 06b: ldc2_w 69060294415727
      // 06e: lxor
      // 06f: lstore 17
      // 071: pop2
      // 072: ldc2_w -8620269500682340074
      // 075: lload 8
      // 077: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: istore 19
      // 07e: aload 0
      // 07f: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 082: iload 19
      // 084: ifeq 0aa
      // 087: ifnull 216
      // 08a: goto 098
      // 08d: ldc2_w -8083844137874564024
      // 090: lload 8
      // 092: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 09c: goto 0aa
      // 09f: ldc2_w -8083844137874564024
      // 0a2: lload 8
      // 0a4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: lload 11
      // 0ac: aload 4
      // 0ae: bipush 2
      // 0af: anewarray 384
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x2
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w -7582559718307316004
      // 0c3: lload 8
      // 0c5: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: istore 20
      // 0cc: iload 20
      // 0ce: iload 19
      // 0d0: lload 8
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 151
      // 0d7: ifeq 14f
      // 0da: ifne 121
      // 0dd: goto 0eb
      // 0e0: ldc2_w -8083844137874564024
      // 0e3: lload 8
      // 0e5: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0ef: bipush 0
      // 0f0: anewarray 384
      // 0f3: ldc2_w -7734453991258950880
      // 0f6: lload 8
      // 0f8: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: iload 19
      // 0ff: ifeq 215
      // 102: goto 110
      // 105: ldc2_w -8083844137874564024
      // 108: lload 8
      // 10a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: ifeq 214
      // 113: goto 121
      // 116: ldc2_w -8083844137874564024
      // 119: lload 8
      // 11b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 0
      // 122: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 125: lload 15
      // 127: bipush 1
      // 128: anewarray 384
      // 12b: dup_x2
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 131: bipush 0
      // 132: swap
      // 133: aastore
      // 134: ldc2_w -7618016843114948967
      // 137: lload 8
      // 139: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: pop
      // 13f: iload 10
      // 141: goto 14f
      // 144: ldc2_w -8083844137874564024
      // 147: lload 8
      // 149: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: iload 19
      // 151: ifeq 213
      // 154: ifeq 212
      // 157: goto 165
      // 15a: ldc2_w -8083844137874564024
      // 15d: lload 8
      // 15f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: lload 8
      // 167: lconst_0
      // 168: lcmp
      // 169: ifle 202
      // 16c: iload 3
      // 16d: ifeq 1cd
      // 170: goto 17e
      // 173: ldc2_w -8083844137874564024
      // 176: lload 8
      // 178: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 0
      // 17f: aload 2
      // 180: aload 5
      // 182: aload 7
      // 184: lload 17
      // 186: aload 6
      // 188: bipush 5
      // 189: anewarray 384
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 4
      // 18f: swap
      // 190: aastore
      // 191: dup_x2
      // 192: dup_x2
      // 193: pop
      // 194: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 197: bipush 3
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 2
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 1
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x1
      // 1a5: swap
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w -8108771300631531995
      // 1ac: lload 8
      // 1ae: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: iload 19
      // 1b5: lload 8
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: ifle 211
      // 1bc: ifne 210
      // 1bf: goto 1cd
      // 1c2: ldc2_w -8083844137874564024
      // 1c5: lload 8
      // 1c7: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: aload 2
      // 1cf: aload 5
      // 1d1: aload 7
      // 1d3: aload 6
      // 1d5: lload 13
      // 1d7: bipush 5
      // 1d8: anewarray 384
      // 1db: dup_x2
      // 1dc: dup_x2
      // 1dd: pop
      // 1de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e1: bipush 4
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 3
      // 1e7: swap
      // 1e8: aastore
      // 1e9: dup_x1
      // 1ea: swap
      // 1eb: bipush 2
      // 1ec: swap
      // 1ed: aastore
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: bipush 1
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: ldc2_w -7916058548135234465
      // 1fb: lload 8
      // 1fd: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: goto 210
      // 205: ldc2_w -8083844137874564024
      // 208: lload 8
      // 20a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: bipush 1
      // 211: ireturn
      // 212: bipush 0
      // 213: ireturn
      // 214: bipush 0
      // 215: ireturn
      // 216: bipush 0
      // 217: ireturn
   }

   void DM(Object[] param1) {
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
      // 00c: getstatic com/zelix/k_.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 89710527011314
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 42599284665429
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 6
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 32
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 7
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 71672937442417
      // 03f: lxor
      // 040: dup2
      // 041: bipush 32
      // 043: lushr
      // 044: l2i
      // 045: istore 9
      // 047: dup2
      // 048: bipush 32
      // 04a: lshl
      // 04b: bipush 56
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 10
      // 051: dup2
      // 052: bipush 40
      // 054: lshl
      // 055: bipush 40
      // 057: lushr
      // 058: l2i
      // 059: istore 11
      // 05b: pop2
      // 05c: pop2
      // 05d: aload 0
      // 05e: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 061: arraylength
      // 062: istore 13
      // 064: new java/util/Vector
      // 067: dup
      // 068: invokespecial java/util/Vector.<init> ()V
      // 06b: astore 14
      // 06d: ldc2_w 830526993170325345
      // 070: lload 2
      // 071: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: bipush 0
      // 077: istore 15
      // 079: istore 12
      // 07b: iload 15
      // 07d: iload 13
      // 07f: if_icmpge 19a
      // 082: aload 0
      // 083: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 086: iload 15
      // 088: aaload
      // 089: instanceof com/zelix/kq
      // 08c: iload 12
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 1c5
      // 094: ifne 1c3
      // 097: iload 12
      // 099: lload 2
      // 09a: lconst_0
      // 09b: lcmp
      // 09c: ifle 0d1
      // 09f: ifne 0cf
      // 0a2: goto 0af
      // 0a5: ldc2_w 1463709063295485896
      // 0a8: lload 2
      // 0a9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: ifeq 0c5
      // 0b2: goto 0bf
      // 0b5: ldc2_w 1463709063295485896
      // 0b8: lload 2
      // 0b9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifge 192
      // 0c5: aload 0
      // 0c6: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0c9: iload 15
      // 0cb: aaload
      // 0cc: instanceof com/zelix/kr
      // 0cf: iload 12
      // 0d1: ifne 191
      // 0d4: ifeq 176
      // 0d7: goto 0e4
      // 0da: ldc2_w 1463709063295485896
      // 0dd: lload 2
      // 0de: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0e8: iload 15
      // 0ea: aaload
      // 0eb: checkcast com/zelix/kr
      // 0ee: astore 16
      // 0f0: aload 16
      // 0f2: lload 4
      // 0f4: bipush 1
      // 0f5: anewarray 384
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 670708399590248344
      // 104: lload 2
      // 105: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: pop
      // 10b: aload 16
      // 10d: iload 6
      // 10f: i2c
      // 110: iload 7
      // 112: iload 8
      // 114: i2s
      // 115: bipush 3
      // 116: anewarray 384
      // 119: dup_x1
      // 11a: swap
      // 11b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11e: bipush 2
      // 11f: swap
      // 120: aastore
      // 121: dup_x1
      // 122: swap
      // 123: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 126: bipush 1
      // 127: swap
      // 128: aastore
      // 129: dup_x1
      // 12a: swap
      // 12b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12e: bipush 0
      // 12f: swap
      // 130: aastore
      // 131: ldc2_w 1139068907166755868
      // 134: lload 2
      // 135: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: iload 12
      // 13c: ifne 16a
      // 13f: ifne 16b
      // 142: goto 14f
      // 145: ldc2_w 1463709063295485896
      // 148: lload 2
      // 149: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 14
      // 151: aload 0
      // 152: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 155: iload 15
      // 157: aaload
      // 158: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15d: goto 16a
      // 160: ldc2_w 1463709063295485896
      // 163: lload 2
      // 164: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: pop
      // 16b: iload 12
      // 16d: lload 2
      // 16e: lconst_0
      // 16f: lcmp
      // 170: ifle 197
      // 173: ifeq 192
      // 176: aload 14
      // 178: aload 0
      // 179: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 17c: iload 15
      // 17e: aaload
      // 17f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 184: goto 191
      // 187: ldc2_w 1463709063295485896
      // 18a: lload 2
      // 18b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: pop
      // 192: iinc 15 1
      // 195: iload 12
      // 197: ifeq 07b
      // 19a: aload 14
      // 19c: invokeinterface java/util/List.size ()I 1
      // 1a1: istore 15
      // 1a3: iload 12
      // 1a5: lload 2
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: iflt 08c
      // 1ab: lload 2
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 1b6
      // 1b1: ifne 20e
      // 1b4: iload 15
      // 1b6: goto 1c3
      // 1b9: ldc2_w 1463709063295485896
      // 1bc: lload 2
      // 1bd: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: iload 13
      // 1c5: if_icmpge 1f0
      // 1c8: aload 0
      // 1c9: iload 15
      // 1cb: anewarray 537
      // 1ce: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1d1: aload 0
      // 1d2: aload 14
      // 1d4: aload 0
      // 1d5: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1d8: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1dd: checkcast [Lcom/zelix/kw;
      // 1e0: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1e3: goto 1f0
      // 1e6: ldc2_w 1463709063295485896
      // 1e9: lload 2
      // 1ea: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: aload 0
      // 1f2: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 1f5: arraylength
      // 1f6: putfield com/zelix/k_.P I
      // 1f9: aload 0
      // 1fa: aload 0
      // 1fb: iload 9
      // 1fd: iload 10
      // 1ff: i2b
      // 200: iload 11
      // 202: ldc2_w 1026258993681499674
      // 205: lload 2
      // 206: invokedynamic p (Ljava/lang/Object;IBIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: putfield com/zelix/k_.W I
      // 20e: return
   }

   protected void c(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:31 from source 28_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 35424716580641
      // 01f: lxor
      // 020: lstore 7
      // 022: dup2
      // 023: ldc2_w 99991372433887
      // 026: lxor
      // 027: lstore 9
      // 029: pop2
      // 02a: aload 0
      // 02b: lload 5
      // 02d: aload 2
      // 02e: bipush 2
      // 02f: anewarray 384
      // 032: dup_x1
      // 033: swap
      // 034: bipush 1
      // 035: swap
      // 036: aastore
      // 037: dup_x2
      // 038: dup_x2
      // 039: pop
      // 03a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03d: bipush 0
      // 03e: swap
      // 03f: aastore
      // 040: invokespecial com/zelix/kw.c ([Ljava/lang/Object;)V
      // 043: aload 2
      // 044: aload 0
      // 045: getfield com/zelix/k_.A I
      // 048: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 04b: ldc2_w 716282175763740856
      // 04e: lload 3
      // 04f: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 2
      // 055: aload 0
      // 056: getfield com/zelix/k_.j I
      // 059: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 05c: aload 0
      // 05d: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 060: lload 7
      // 062: aload 2
      // 063: bipush 2
      // 064: anewarray 384
      // 067: dup_x1
      // 068: swap
      // 069: bipush 1
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x2
      // 06d: dup_x2
      // 06e: pop
      // 06f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w 1162868536856682706
      // 078: lload 3
      // 079: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: istore 11
      // 080: aload 2
      // 081: aload 0
      // 082: getfield com/zelix/k_.m I
      // 085: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 088: bipush 0
      // 089: istore 12
      // 08b: iload 12
      // 08d: aload 0
      // 08e: getfield com/zelix/k_.m I
      // 091: if_icmpge 0df
      // 094: aload 0
      // 095: getfield com/zelix/k_.U [Lcom/zelix/be;
      // 098: iload 12
      // 09a: aaload
      // 09b: aload 2
      // 09c: lload 9
      // 09e: bipush 2
      // 09f: anewarray 384
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 1507872818761520005
      // 0b3: lload 3
      // 0b4: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: iinc 12 1
      // 0bc: iload 11
      // 0be: lload 3
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 0e8
      // 0c4: ifeq 0e7
      // 0c7: iload 11
      // 0c9: ifne 08b
      // 0cc: lload 3
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: iflt 0bc
      // 0d2: goto 0df
      // 0d5: ldc2_w 1044398339077594598
      // 0d8: lload 3
      // 0d9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 2
      // 0e0: aload 0
      // 0e1: getfield com/zelix/k_.P I
      // 0e4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e7: bipush 0
      // 0e8: istore 12
      // 0ea: iload 12
      // 0ec: aload 0
      // 0ed: getfield com/zelix/k_.P I
      // 0f0: if_icmpge 120
      // 0f3: aload 0
      // 0f4: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0f7: iload 12
      // 0f9: aaload
      // 0fa: lload 5
      // 0fc: aload 2
      // 0fd: bipush 2
      // 0fe: anewarray 384
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
      // 10f: ldc2_w 1080251819490009328
      // 112: lload 3
      // 113: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: iinc 12 1
      // 11b: iload 11
      // 11d: ifne 0ea
      // 120: lload 3
      // 121: lconst_0
      // 122: lcmp
      // 123: iflt 11b
      // 126: return
   }

   bc i(Object[] var1) {
      return this.F;
   }

   void o(Object[] param1) {
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
      // 00e: checkcast java/lang/Class
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/k_.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 77420056780243
      // 01f: lxor
      // 020: dup2
      // 021: bipush 32
      // 023: lushr
      // 024: l2i
      // 025: istore 5
      // 027: dup2
      // 028: bipush 32
      // 02a: lshl
      // 02b: bipush 56
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 6
      // 031: dup2
      // 032: bipush 40
      // 034: lshl
      // 035: bipush 40
      // 037: lushr
      // 038: l2i
      // 039: istore 7
      // 03b: pop2
      // 03c: pop2
      // 03d: aload 0
      // 03e: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 041: arraylength
      // 042: istore 9
      // 044: ldc2_w 8801327384772488899
      // 047: lload 2
      // 048: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: new java/util/ArrayList
      // 050: dup
      // 051: invokespecial java/util/ArrayList.<init> ()V
      // 054: astore 10
      // 056: istore 8
      // 058: bipush 0
      // 059: istore 11
      // 05b: iload 11
      // 05d: iload 9
      // 05f: if_icmpge 0b8
      // 062: aload 4
      // 064: aload 0
      // 065: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 068: iload 11
      // 06a: aaload
      // 06b: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 06e: iload 8
      // 070: lload 2
      // 071: lconst_0
      // 072: lcmp
      // 073: iflt 0e3
      // 076: ifne 0e1
      // 079: iload 8
      // 07b: ifne 0af
      // 07e: goto 08b
      // 081: ldc2_w 7345974508986906218
      // 084: lload 2
      // 085: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: ifeq 0a1
      // 08e: goto 09b
      // 091: ldc2_w 7345974508986906218
      // 094: lload 2
      // 095: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: lload 2
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: ifge 0b0
      // 0a1: aload 10
      // 0a3: aload 0
      // 0a4: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0a7: iload 11
      // 0a9: aaload
      // 0aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0af: pop
      // 0b0: iinc 11 1
      // 0b3: iload 8
      // 0b5: ifeq 05b
      // 0b8: aload 10
      // 0ba: invokeinterface java/util/List.size ()I 1
      // 0bf: istore 11
      // 0c1: iload 8
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 06e
      // 0c9: lload 2
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: iflt 0d4
      // 0cf: ifne 12c
      // 0d2: iload 11
      // 0d4: goto 0e1
      // 0d7: ldc2_w 7345974508986906218
      // 0da: lload 2
      // 0db: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: iload 9
      // 0e3: if_icmpge 10e
      // 0e6: aload 0
      // 0e7: iload 11
      // 0e9: anewarray 537
      // 0ec: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0ef: aload 0
      // 0f0: aload 10
      // 0f2: aload 0
      // 0f3: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 0f6: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0fb: checkcast [Lcom/zelix/kw;
      // 0fe: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // 101: goto 10e
      // 104: ldc2_w 7345974508986906218
      // 107: lload 2
      // 108: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 0
      // 10f: aload 0
      // 110: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // 113: arraylength
      // 114: putfield com/zelix/k_.P I
      // 117: aload 0
      // 118: aload 0
      // 119: iload 5
      // 11b: iload 6
      // 11d: i2b
      // 11e: iload 7
      // 120: ldc2_w 9195231515971024824
      // 123: lload 2
      // 124: invokedynamic r (Ljava/lang/Object;IBIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: putfield com/zelix/k_.W I
      // 12c: return
   }

   void Q(Object[] var1) {
      long var3 = (Long)var1[0];
      l6q var2 = (l6q)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 50523541039901L;
      m44.a<"v">(this.F, new Object[]{var2, var5}, -712291390647553023L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int g(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      long var6 = var4 ^ 17966898828093L;
      byte var10000 = m44.a<"n">(-22607516224745753L, var4);
      int var9 = 4 + m44.a<"q">(this.F, new Object[0], -159713852163509016L, var4) + 2 + this.m * c<"n">(19664, 8482351310131096599L ^ var4) + 2;
      byte var8 = var10000;
      int var10 = 0;

      label39:
      while (var10 < this.P) {
         var9 += m44.a<"q">(this.N[var10], var6, -2143259918788884473L, var4);

         try {
            var10++;
         } catch (nn var12) {
            boolean var10001 = false;
            throw m44.a<"n">(var12, -567063720547144775L, var4);
         }

         do {
            try {
               if (var3 <= 0) {
                  return var8;
               }

               if (var8 == 0) {
                  return var9;
               }

               if (var8 != 0) {
                  continue label39;
               }
            } catch (nn var11) {
               boolean var15 = false;
               throw m44.a<"n">(var11, -567063720547144775L, var4);
            }
         } while (var3 < 0);
         break;
      }

      this.W = var9;
      return var9;
   }

   void g(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      hd var5 = (hd)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 95846535587940L;
      m44.a<"q">(this.F, new Object[]{var6, var4, var5}, -4535165572796112219L, var2);
   }

   void J(Object[] param1) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/ai
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/t6
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/util/List
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 5
      // 02a: pop
      // 02b: getstatic com/zelix/k_.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 43122590782637
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 36584732332008
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 67587699953529
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 123084859764569
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 124849641754966
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 95754548654913
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 92115911735004
      // 063: lxor
      // 064: lstore 20
      // 066: dup2
      // 067: ldc2_w 140348800992744
      // 06a: lxor
      // 06b: lstore 22
      // 06d: dup2
      // 06e: ldc2_w 128833703101993
      // 071: lxor
      // 072: lstore 24
      // 074: dup2
      // 075: ldc2_w 71264710191823
      // 078: lxor
      // 079: lstore 26
      // 07b: dup2
      // 07c: ldc2_w 5974273615870
      // 07f: lxor
      // 080: lstore 28
      // 082: dup2
      // 083: ldc2_w 56126770389198
      // 086: lxor
      // 087: lstore 30
      // 089: dup2
      // 08a: ldc2_w 98779620878484
      // 08d: lxor
      // 08e: lstore 32
      // 090: dup2
      // 091: ldc2_w 55241626789843
      // 094: lxor
      // 095: lstore 34
      // 097: dup2
      // 098: ldc2_w 119283148850123
      // 09b: lxor
      // 09c: lstore 36
      // 09e: dup2
      // 09f: ldc2_w 5436891109415
      // 0a2: lxor
      // 0a3: dup2
      // 0a4: bipush 48
      // 0a6: lushr
      // 0a7: l2i
      // 0a8: istore 38
      // 0aa: dup2
      // 0ab: bipush 16
      // 0ad: lshl
      // 0ae: bipush 16
      // 0b0: lushr
      // 0b1: lstore 39
      // 0b3: pop2
      // 0b4: dup2
      // 0b5: ldc2_w 101003686773020
      // 0b8: lxor
      // 0b9: lstore 41
      // 0bb: dup2
      // 0bc: ldc2_w 72649469898212
      // 0bf: lxor
      // 0c0: lstore 43
      // 0c2: dup2
      // 0c3: ldc2_w 64067262887399
      // 0c6: lxor
      // 0c7: lstore 45
      // 0c9: dup2
      // 0ca: ldc2_w 116668199023291
      // 0cd: lxor
      // 0ce: lstore 47
      // 0d0: dup2
      // 0d1: ldc2_w 40436819113313
      // 0d4: lxor
      // 0d5: lstore 49
      // 0d7: pop2
      // 0d8: ldc2_w -6728178019347401145
      // 0db: lload 5
      // 0dd: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: istore 51
      // 0e4: aload 0
      // 0e5: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 0e8: iload 51
      // 0ea: ifne 110
      // 0ed: ifnull bfa
      // 0f0: goto 0fe
      // 0f3: ldc2_w -4794633792209686802
      // 0f6: lload 5
      // 0f8: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 102: goto 110
      // 105: ldc2_w -4794633792209686802
      // 108: lload 5
      // 10a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: aload 7
      // 112: aload 2
      // 113: bipush 1
      // 114: lload 8
      // 116: invokevirtual com/zelix/bc.N (Lcom/zelix/loj;Lcom/zelix/ai;ZJ)Lcom/zelix/l;
      // 119: astore 52
      // 11b: aload 52
      // 11d: lload 36
      // 11f: bipush 1
      // 120: anewarray 384
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -6631537230322485322
      // 12f: lload 5
      // 131: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: lload 5
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 19f
      // 13d: iload 51
      // 13f: ifne 19f
      // 142: ifne 17a
      // 145: goto 153
      // 148: ldc2_w -4794633792209686802
      // 14b: lload 5
      // 14d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: aload 0
      // 154: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 157: bipush 0
      // 158: bipush 1
      // 159: anewarray 384
      // 15c: dup_x1
      // 15d: swap
      // 15e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: ldc2_w -6488910598411653866
      // 167: lload 5
      // 169: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: return
      // 16f: ldc2_w -4794633792209686802
      // 172: lload 5
      // 174: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 0
      // 17b: iload 51
      // 17d: ifne 1d1
      // 180: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 183: bipush 0
      // 184: anewarray 384
      // 187: ldc2_w -6480732104103214714
      // 18a: lload 5
      // 18c: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: goto 19f
      // 194: ldc2_w -4794633792209686802
      // 197: lload 5
      // 199: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: lload 5
      // 1a1: lconst_0
      // 1a2: lcmp
      // 1a3: iflt 1b3
      // 1a6: ifne 1d0
      // 1a9: ldc2_w -4958964676955795184
      // 1ac: lload 5
      // 1ae: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: ifne 1d0
      // 1b6: goto 1c4
      // 1b9: ldc2_w -4794633792209686802
      // 1bc: lload 5
      // 1be: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: return
      // 1c5: ldc2_w -4794633792209686802
      // 1c8: lload 5
      // 1ca: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: lload 24
      // 1d3: bipush 1
      // 1d4: anewarray 384
      // 1d7: dup_x2
      // 1d8: dup_x2
      // 1d9: pop
      // 1da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dd: bipush 0
      // 1de: swap
      // 1df: aastore
      // 1e0: ldc2_w -5038422976775689561
      // 1e3: lload 5
      // 1e5: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/k6; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: astore 53
      // 1ec: aload 53
      // 1ee: ifnull 273
      // 1f1: new com/zelix/gu
      // 1f4: dup
      // 1f5: sipush 14115
      // 1f8: ldc2_w 5723389529048896180
      // 1fb: lload 5
      // 1fd: lxor
      // 1fe: invokedynamic n (IJ)I bsm=com/zelix/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: lload 12
      // 205: invokespecial com/zelix/gu.<init> (IJ)V
      // 208: astore 56
      // 20a: aload 53
      // 20c: aload 56
      // 20e: lload 14
      // 210: ldc2_w -6426512399055513198
      // 213: lload 5
      // 215: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: aload 56
      // 21c: lload 18
      // 21e: bipush 1
      // 21f: anewarray 384
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 0
      // 229: swap
      // 22a: aastore
      // 22b: ldc2_w -6763807703578670606
      // 22e: lload 5
      // 230: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: lload 30
      // 237: bipush 2
      // 238: anewarray 384
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 1
      // 242: swap
      // 243: aastore
      // 244: dup_x1
      // 245: swap
      // 246: bipush 0
      // 247: swap
      // 248: aastore
      // 249: ldc2_w -4823493056261542627
      // 24c: lload 5
      // 24e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: astore 55
      // 255: aload 53
      // 257: bipush 0
      // 258: anewarray 384
      // 25b: ldc2_w -5187881281048427647
      // 25e: lload 5
      // 260: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: astore 54
      // 267: lload 5
      // 269: lconst_0
      // 26a: lcmp
      // 26b: iflt 289
      // 26e: iload 51
      // 270: ifeq 295
      // 273: aload 3
      // 274: sipush 21165
      // 277: ldc2_w 372997053049845126
      // 27a: lload 5
      // 27c: lxor
      // 27d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: aload 4
      // 284: invokevirtual com/zelix/t6.t (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/x8;
      // 287: astore 54
      // 289: ldc2_w -4801290174123078848
      // 28c: lload 5
      // 28e: invokedynamic i (JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: astore 55
      // 295: new com/zelix/k6
      // 298: dup
      // 299: iload 38
      // 29b: i2c
      // 29c: aload 0
      // 29d: aload 54
      // 29f: lload 39
      // 2a1: bipush 0
      // 2a2: invokespecial com/zelix/k6.<init> (CLcom/zelix/_4;Lcom/zelix/x8;JI)V
      // 2a5: astore 56
      // 2a7: bipush 0
      // 2a8: istore 57
      // 2aa: new com/zelix/lom
      // 2ad: dup
      // 2ae: aload 0
      // 2af: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 2b2: lload 16
      // 2b4: aload 52
      // 2b6: invokespecial com/zelix/lom.<init> (Lcom/zelix/bc;JLcom/zelix/l;)V
      // 2b9: astore 58
      // 2bb: ldc2_w -6613982343945115986
      // 2be: lload 5
      // 2c0: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: ldc "1"
      // 2c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ca: iload 51
      // 2cc: lload 5
      // 2ce: lconst_0
      // 2cf: lcmp
      // 2d0: ifle 2fb
      // 2d3: ifne 2f9
      // 2d6: ifne 37b
      // 2d9: goto 2e7
      // 2dc: ldc2_w -4794633792209686802
      // 2df: lload 5
      // 2e1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: aload 0
      // 2e8: getfield com/zelix/k_.j I
      // 2eb: goto 2f9
      // 2ee: ldc2_w -4794633792209686802
      // 2f1: lload 5
      // 2f3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: athrow
      // 2f9: iload 51
      // 2fb: lload 5
      // 2fd: lconst_0
      // 2fe: lcmp
      // 2ff: ifle 341
      // 302: ifne 33f
      // 305: ifeq 37b
      // 308: goto 316
      // 30b: ldc2_w -4794633792209686802
      // 30e: lload 5
      // 310: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: athrow
      // 316: aload 52
      // 318: lload 26
      // 31a: bipush 1
      // 31b: anewarray 384
      // 31e: dup_x2
      // 31f: dup_x2
      // 320: pop
      // 321: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 324: bipush 0
      // 325: swap
      // 326: aastore
      // 327: ldc2_w -6571871855717390711
      // 32a: lload 5
      // 32c: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: goto 33f
      // 334: ldc2_w -4794633792209686802
      // 337: lload 5
      // 339: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: athrow
      // 33f: iload 51
      // 341: lload 5
      // 343: lconst_0
      // 344: lcmp
      // 345: ifle 360
      // 348: ifne 35e
      // 34b: ifeq 37b
      // 34e: goto 35c
      // 351: ldc2_w -4794633792209686802
      // 354: lload 5
      // 356: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35b: athrow
      // 35c: iload 57
      // 35e: iload 51
      // 360: lload 5
      // 362: lconst_0
      // 363: lcmp
      // 364: iflt 3f2
      // 367: ifne 3f0
      // 36a: ifeq 3d3
      // 36d: goto 37b
      // 370: ldc2_w -4794633792209686802
      // 373: lload 5
      // 375: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: athrow
      // 37b: aload 58
      // 37d: aload 56
      // 37f: aload 3
      // 380: lload 28
      // 382: aload 55
      // 384: aload 4
      // 386: bipush 0
      // 387: bipush 0
      // 388: bipush 7
      // 38a: anewarray 384
      // 38d: dup_x1
      // 38e: swap
      // 38f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 392: bipush 6
      // 394: swap
      // 395: aastore
      // 396: dup_x1
      // 397: swap
      // 398: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 39b: bipush 5
      // 39c: swap
      // 39d: aastore
      // 39e: dup_x1
      // 39f: swap
      // 3a0: bipush 4
      // 3a1: swap
      // 3a2: aastore
      // 3a3: dup_x1
      // 3a4: swap
      // 3a5: bipush 3
      // 3a6: swap
      // 3a7: aastore
      // 3a8: dup_x2
      // 3a9: dup_x2
      // 3aa: pop
      // 3ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ae: bipush 2
      // 3af: swap
      // 3b0: aastore
      // 3b1: dup_x1
      // 3b2: swap
      // 3b3: bipush 1
      // 3b4: swap
      // 3b5: aastore
      // 3b6: dup_x1
      // 3b7: swap
      // 3b8: bipush 0
      // 3b9: swap
      // 3ba: aastore
      // 3bb: ldc2_w -4928890575113270194
      // 3be: lload 5
      // 3c0: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: astore 59
      // 3c7: lload 5
      // 3c9: lconst_0
      // 3ca: lcmp
      // 3cb: iflt aff
      // 3ce: iload 51
      // 3d0: ifeq ae8
      // 3d3: ldc2_w -6613982343945115986
      // 3d6: lload 5
      // 3d8: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: ldc "2"
      // 3df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3e2: goto 3f0
      // 3e5: ldc2_w -4794633792209686802
      // 3e8: lload 5
      // 3ea: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ef: athrow
      // 3f0: iload 51
      // 3f2: lload 5
      // 3f4: lconst_0
      // 3f5: lcmp
      // 3f6: iflt 484
      // 3f9: ifne 482
      // 3fc: ifeq 465
      // 3ff: goto 40d
      // 402: ldc2_w -4794633792209686802
      // 405: lload 5
      // 407: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: athrow
      // 40d: aload 58
      // 40f: aload 56
      // 411: aload 3
      // 412: lload 28
      // 414: aload 55
      // 416: aload 4
      // 418: bipush 1
      // 419: bipush 0
      // 41a: bipush 7
      // 41c: anewarray 384
      // 41f: dup_x1
      // 420: swap
      // 421: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 424: bipush 6
      // 426: swap
      // 427: aastore
      // 428: dup_x1
      // 429: swap
      // 42a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 42d: bipush 5
      // 42e: swap
      // 42f: aastore
      // 430: dup_x1
      // 431: swap
      // 432: bipush 4
      // 433: swap
      // 434: aastore
      // 435: dup_x1
      // 436: swap
      // 437: bipush 3
      // 438: swap
      // 439: aastore
      // 43a: dup_x2
      // 43b: dup_x2
      // 43c: pop
      // 43d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 440: bipush 2
      // 441: swap
      // 442: aastore
      // 443: dup_x1
      // 444: swap
      // 445: bipush 1
      // 446: swap
      // 447: aastore
      // 448: dup_x1
      // 449: swap
      // 44a: bipush 0
      // 44b: swap
      // 44c: aastore
      // 44d: ldc2_w -4928890575113270194
      // 450: lload 5
      // 452: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: astore 59
      // 459: lload 5
      // 45b: lconst_0
      // 45c: lcmp
      // 45d: iflt aff
      // 460: iload 51
      // 462: ifeq ae8
      // 465: ldc2_w -6613982343945115986
      // 468: lload 5
      // 46a: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46f: ldc "5"
      // 471: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 474: goto 482
      // 477: ldc2_w -4794633792209686802
      // 47a: lload 5
      // 47c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: athrow
      // 482: iload 51
      // 484: lload 5
      // 486: lconst_0
      // 487: lcmp
      // 488: ifle 4b2
      // 48b: ifne 4b1
      // 48e: ifeq 53c
      // 491: goto 49f
      // 494: ldc2_w -4794633792209686802
      // 497: lload 5
      // 499: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49e: athrow
      // 49f: aload 0
      // 4a0: getfield com/zelix/k_.j I
      // 4a3: goto 4b1
      // 4a6: ldc2_w -4794633792209686802
      // 4a9: lload 5
      // 4ab: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: athrow
      // 4b1: bipush 1
      // 4b2: iload 51
      // 4b4: ifne 4e8
      // 4b7: if_icmple 53c
      // 4ba: goto 4c8
      // 4bd: ldc2_w -4794633792209686802
      // 4c0: lload 5
      // 4c2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c7: athrow
      // 4c8: aload 0
      // 4c9: getfield com/zelix/k_.j I
      // 4cc: sipush 11181
      // 4cf: ldc2_w 400722235114999355
      // 4d2: lload 5
      // 4d4: lxor
      // 4d5: invokedynamic n (IJ)I bsm=com/zelix/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: goto 4e8
      // 4dd: ldc2_w -4794633792209686802
      // 4e0: lload 5
      // 4e2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e7: athrow
      // 4e8: if_icmpgt 53c
      // 4eb: aload 58
      // 4ed: aload 0
      // 4ee: getfield com/zelix/k_.j I
      // 4f1: aload 56
      // 4f3: aload 3
      // 4f4: lload 47
      // 4f6: aload 55
      // 4f8: aload 4
      // 4fa: bipush 6
      // 4fc: anewarray 384
      // 4ff: dup_x1
      // 500: swap
      // 501: bipush 5
      // 502: swap
      // 503: aastore
      // 504: dup_x1
      // 505: swap
      // 506: bipush 4
      // 507: swap
      // 508: aastore
      // 509: dup_x2
      // 50a: dup_x2
      // 50b: pop
      // 50c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50f: bipush 3
      // 510: swap
      // 511: aastore
      // 512: dup_x1
      // 513: swap
      // 514: bipush 2
      // 515: swap
      // 516: aastore
      // 517: dup_x1
      // 518: swap
      // 519: bipush 1
      // 51a: swap
      // 51b: aastore
      // 51c: dup_x1
      // 51d: swap
      // 51e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 521: bipush 0
      // 522: swap
      // 523: aastore
      // 524: ldc2_w -4982438508559813913
      // 527: lload 5
      // 529: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52e: astore 59
      // 530: lload 5
      // 532: lconst_0
      // 533: lcmp
      // 534: iflt aff
      // 537: iload 51
      // 539: ifeq ae8
      // 53c: new java/util/ArrayList
      // 53f: dup
      // 540: aload 4
      // 542: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 545: astore 60
      // 547: aload 58
      // 549: aload 56
      // 54b: aload 3
      // 54c: aload 55
      // 54e: lload 30
      // 550: bipush 2
      // 551: anewarray 384
      // 554: dup_x2
      // 555: dup_x2
      // 556: pop
      // 557: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55a: bipush 1
      // 55b: swap
      // 55c: aastore
      // 55d: dup_x1
      // 55e: swap
      // 55f: bipush 0
      // 560: swap
      // 561: aastore
      // 562: ldc2_w -4823493056261542627
      // 565: lload 5
      // 567: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56c: lload 28
      // 56e: dup2_x1
      // 56f: pop2
      // 570: aload 60
      // 572: bipush 0
      // 573: bipush 0
      // 574: bipush 7
      // 576: anewarray 384
      // 579: dup_x1
      // 57a: swap
      // 57b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 57e: bipush 6
      // 580: swap
      // 581: aastore
      // 582: dup_x1
      // 583: swap
      // 584: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 587: bipush 5
      // 588: swap
      // 589: aastore
      // 58a: dup_x1
      // 58b: swap
      // 58c: bipush 4
      // 58d: swap
      // 58e: aastore
      // 58f: dup_x1
      // 590: swap
      // 591: bipush 3
      // 592: swap
      // 593: aastore
      // 594: dup_x2
      // 595: dup_x2
      // 596: pop
      // 597: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59a: bipush 2
      // 59b: swap
      // 59c: aastore
      // 59d: dup_x1
      // 59e: swap
      // 59f: bipush 1
      // 5a0: swap
      // 5a1: aastore
      // 5a2: dup_x1
      // 5a3: swap
      // 5a4: bipush 0
      // 5a5: swap
      // 5a6: aastore
      // 5a7: ldc2_w -4928890575113270194
      // 5aa: lload 5
      // 5ac: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b1: astore 61
      // 5b3: goto 5bb
      // 5b6: astore 62
      // 5b8: aload 62
      // 5ba: athrow
      // 5bb: new java/util/ArrayList
      // 5be: dup
      // 5bf: aload 4
      // 5c1: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 5c4: astore 62
      // 5c6: aload 58
      // 5c8: aload 56
      // 5ca: aload 3
      // 5cb: aload 55
      // 5cd: lload 30
      // 5cf: bipush 2
      // 5d0: anewarray 384
      // 5d3: dup_x2
      // 5d4: dup_x2
      // 5d5: pop
      // 5d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d9: bipush 1
      // 5da: swap
      // 5db: aastore
      // 5dc: dup_x1
      // 5dd: swap
      // 5de: bipush 0
      // 5df: swap
      // 5e0: aastore
      // 5e1: ldc2_w -4823493056261542627
      // 5e4: lload 5
      // 5e6: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5eb: lload 28
      // 5ed: dup2_x1
      // 5ee: pop2
      // 5ef: aload 62
      // 5f1: bipush 1
      // 5f2: bipush 0
      // 5f3: bipush 7
      // 5f5: anewarray 384
      // 5f8: dup_x1
      // 5f9: swap
      // 5fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5fd: bipush 6
      // 5ff: swap
      // 600: aastore
      // 601: dup_x1
      // 602: swap
      // 603: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 606: bipush 5
      // 607: swap
      // 608: aastore
      // 609: dup_x1
      // 60a: swap
      // 60b: bipush 4
      // 60c: swap
      // 60d: aastore
      // 60e: dup_x1
      // 60f: swap
      // 610: bipush 3
      // 611: swap
      // 612: aastore
      // 613: dup_x2
      // 614: dup_x2
      // 615: pop
      // 616: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 619: bipush 2
      // 61a: swap
      // 61b: aastore
      // 61c: dup_x1
      // 61d: swap
      // 61e: bipush 1
      // 61f: swap
      // 620: aastore
      // 621: dup_x1
      // 622: swap
      // 623: bipush 0
      // 624: swap
      // 625: aastore
      // 626: ldc2_w -4928890575113270194
      // 629: lload 5
      // 62b: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 630: astore 63
      // 632: aload 61
      // 634: lload 34
      // 636: bipush 2
      // 637: anewarray 384
      // 63a: dup_x2
      // 63b: dup_x2
      // 63c: pop
      // 63d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 640: bipush 1
      // 641: swap
      // 642: aastore
      // 643: dup_x1
      // 644: swap
      // 645: bipush 0
      // 646: swap
      // 647: aastore
      // 648: ldc2_w -4812382908350931553
      // 64b: lload 5
      // 64d: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 652: istore 64
      // 654: aload 63
      // 656: lload 34
      // 658: bipush 2
      // 659: anewarray 384
      // 65c: dup_x2
      // 65d: dup_x2
      // 65e: pop
      // 65f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 662: bipush 1
      // 663: swap
      // 664: aastore
      // 665: dup_x1
      // 666: swap
      // 667: bipush 0
      // 668: swap
      // 669: aastore
      // 66a: ldc2_w -4812382908350931553
      // 66d: lload 5
      // 66f: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: istore 65
      // 676: aload 61
      // 678: aload 61
      // 67a: arraylength
      // 67b: bipush 1
      // 67c: isub
      // 67d: aaload
      // 67e: astore 66
      // 680: aload 66
      // 682: lload 22
      // 684: bipush 1
      // 685: anewarray 384
      // 688: dup_x2
      // 689: dup_x2
      // 68a: pop
      // 68b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68e: bipush 0
      // 68f: swap
      // 690: aastore
      // 691: ldc2_w -6909015282681485389
      // 694: lload 5
      // 696: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69b: astore 67
      // 69d: aload 52
      // 69f: aload 66
      // 6a1: bipush 0
      // 6a2: anewarray 384
      // 6a5: ldc2_w -4972930103494712826
      // 6a8: lload 5
      // 6aa: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6af: invokevirtual com/zelix/iq.c ()I
      // 6b2: lload 43
      // 6b4: bipush 2
      // 6b5: anewarray 384
      // 6b8: dup_x2
      // 6b9: dup_x2
      // 6ba: pop
      // 6bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6be: bipush 1
      // 6bf: swap
      // 6c0: aastore
      // 6c1: dup_x1
      // 6c2: swap
      // 6c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c6: bipush 0
      // 6c7: swap
      // 6c8: aastore
      // 6c9: ldc2_w -4832570217805669998
      // 6cc: lload 5
      // 6ce: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/nc; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d3: astore 68
      // 6d5: aload 68
      // 6d7: aload 0
      // 6d8: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 6db: lload 10
      // 6dd: bipush 1
      // 6de: anewarray 384
      // 6e1: dup_x2
      // 6e2: dup_x2
      // 6e3: pop
      // 6e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e7: bipush 0
      // 6e8: swap
      // 6e9: aastore
      // 6ea: ldc2_w -6510265457251198863
      // 6ed: lload 5
      // 6ef: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/e; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f4: lload 20
      // 6f6: dup2_x1
      // 6f7: pop2
      // 6f8: bipush 2
      // 6f9: anewarray 384
      // 6fc: dup_x1
      // 6fd: swap
      // 6fe: bipush 1
      // 6ff: swap
      // 700: aastore
      // 701: dup_x2
      // 702: dup_x2
      // 703: pop
      // 704: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 707: bipush 0
      // 708: swap
      // 709: aastore
      // 70a: ldc2_w -6385502014051636472
      // 70d: lload 5
      // 70f: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/oz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 714: astore 69
      // 716: ldc2_w -6613982343945115986
      // 719: lload 5
      // 71b: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 720: ldc "3"
      // 722: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 725: iload 51
      // 727: ifne 868
      // 72a: ifne 866
      // 72d: goto 73b
      // 730: ldc2_w -4794633792209686802
      // 733: lload 5
      // 735: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73a: athrow
      // 73b: aload 67
      // 73d: ldc2_w -5044106112842975766
      // 740: lload 5
      // 742: invokedynamic m (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 747: iload 51
      // 749: lload 5
      // 74b: lconst_0
      // 74c: lcmp
      // 74d: iflt 78e
      // 750: ifne 78c
      // 753: goto 761
      // 756: ldc2_w -4794633792209686802
      // 759: lload 5
      // 75b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 760: athrow
      // 761: if_acmpeq 866
      // 764: goto 772
      // 767: ldc2_w -4794633792209686802
      // 76a: lload 5
      // 76c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 771: athrow
      // 772: aload 67
      // 774: ldc2_w -4918578723757639739
      // 777: lload 5
      // 779: invokedynamic m (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77e: goto 78c
      // 781: ldc2_w -4794633792209686802
      // 784: lload 5
      // 786: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78b: athrow
      // 78c: iload 51
      // 78e: lload 5
      // 790: lconst_0
      // 791: lcmp
      // 792: iflt 7c5
      // 795: ifne 7c3
      // 798: if_acmpeq 866
      // 79b: goto 7a9
      // 79e: ldc2_w -4794633792209686802
      // 7a1: lload 5
      // 7a3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a8: athrow
      // 7a9: aload 67
      // 7ab: ldc2_w -4760386685768503141
      // 7ae: lload 5
      // 7b0: invokedynamic m (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b5: goto 7c3
      // 7b8: ldc2_w -4794633792209686802
      // 7bb: lload 5
      // 7bd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c2: athrow
      // 7c3: iload 51
      // 7c5: lload 5
      // 7c7: lconst_0
      // 7c8: lcmp
      // 7c9: iflt 803
      // 7cc: ifne 7fa
      // 7cf: if_acmpeq 866
      // 7d2: goto 7e0
      // 7d5: ldc2_w -4794633792209686802
      // 7d8: lload 5
      // 7da: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7df: athrow
      // 7e0: aload 67
      // 7e2: ldc2_w -6740759465323234505
      // 7e5: lload 5
      // 7e7: invokedynamic m (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ec: goto 7fa
      // 7ef: ldc2_w -4794633792209686802
      // 7f2: lload 5
      // 7f4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f9: athrow
      // 7fa: lload 5
      // 7fc: lconst_0
      // 7fd: lcmp
      // 7fe: ifle 831
      // 801: iload 51
      // 803: ifne 831
      // 806: if_acmpeq 866
      // 809: goto 817
      // 80c: ldc2_w -4794633792209686802
      // 80f: lload 5
      // 811: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 816: athrow
      // 817: aload 67
      // 819: ldc2_w -6521120687652141654
      // 81c: lload 5
      // 81e: invokedynamic m (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 823: goto 831
      // 826: ldc2_w -4794633792209686802
      // 829: lload 5
      // 82b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 830: athrow
      // 831: if_acmpeq 866
      // 834: aload 69
      // 836: lload 41
      // 838: invokevirtual com/zelix/oz.U (J)Z
      // 83b: iload 51
      // 83d: lload 5
      // 83f: lconst_0
      // 840: lcmp
      // 841: iflt 86a
      // 844: ifne 868
      // 847: goto 855
      // 84a: ldc2_w -4794633792209686802
      // 84d: lload 5
      // 84f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 854: athrow
      // 855: ifne 905
      // 858: goto 866
      // 85b: ldc2_w -4794633792209686802
      // 85e: lload 5
      // 860: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 865: athrow
      // 866: iload 65
      // 868: iload 51
      // 86a: lload 5
      // 86c: lconst_0
      // 86d: lcmp
      // 86e: ifle 876
      // 871: ifne 8f4
      // 874: iload 64
      // 876: if_icmpge 8bf
      // 879: goto 887
      // 87c: ldc2_w -4794633792209686802
      // 87f: lload 5
      // 881: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 886: athrow
      // 887: aload 62
      // 889: aload 4
      // 88b: lload 49
      // 88d: bipush 3
      // 88e: anewarray 384
      // 891: dup_x2
      // 892: dup_x2
      // 893: pop
      // 894: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 897: bipush 2
      // 898: swap
      // 899: aastore
      // 89a: dup_x1
      // 89b: swap
      // 89c: bipush 1
      // 89d: swap
      // 89e: aastore
      // 89f: dup_x1
      // 8a0: swap
      // 8a1: bipush 0
      // 8a2: swap
      // 8a3: aastore
      // 8a4: ldc2_w -4628953677039325673
      // 8a7: lload 5
      // 8a9: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ae: pop
      // 8af: aload 63
      // 8b1: astore 59
      // 8b3: lload 5
      // 8b5: lconst_0
      // 8b6: lcmp
      // 8b7: ifle aff
      // 8ba: iload 51
      // 8bc: ifeq ae8
      // 8bf: aload 60
      // 8c1: aload 4
      // 8c3: lload 49
      // 8c5: bipush 3
      // 8c6: anewarray 384
      // 8c9: dup_x2
      // 8ca: dup_x2
      // 8cb: pop
      // 8cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8cf: bipush 2
      // 8d0: swap
      // 8d1: aastore
      // 8d2: dup_x1
      // 8d3: swap
      // 8d4: bipush 1
      // 8d5: swap
      // 8d6: aastore
      // 8d7: dup_x1
      // 8d8: swap
      // 8d9: bipush 0
      // 8da: swap
      // 8db: aastore
      // 8dc: ldc2_w -4628953677039325673
      // 8df: lload 5
      // 8e1: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e6: goto 8f4
      // 8e9: ldc2_w -4794633792209686802
      // 8ec: lload 5
      // 8ee: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f3: athrow
      // 8f4: pop
      // 8f5: aload 61
      // 8f7: astore 59
      // 8f9: lload 5
      // 8fb: lconst_0
      // 8fc: lcmp
      // 8fd: ifle aff
      // 900: iload 51
      // 902: ifeq ae8
      // 905: new java/util/ArrayList
      // 908: dup
      // 909: aload 4
      // 90b: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 90e: astore 70
      // 910: aload 58
      // 912: aload 56
      // 914: aload 3
      // 915: aload 55
      // 917: lload 30
      // 919: bipush 2
      // 91a: anewarray 384
      // 91d: dup_x2
      // 91e: dup_x2
      // 91f: pop
      // 920: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 923: bipush 1
      // 924: swap
      // 925: aastore
      // 926: dup_x1
      // 927: swap
      // 928: bipush 0
      // 929: swap
      // 92a: aastore
      // 92b: ldc2_w -4823493056261542627
      // 92e: lload 5
      // 930: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 935: lload 28
      // 937: dup2_x1
      // 938: pop2
      // 939: aload 70
      // 93b: bipush 0
      // 93c: bipush 1
      // 93d: bipush 7
      // 93f: anewarray 384
      // 942: dup_x1
      // 943: swap
      // 944: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 947: bipush 6
      // 949: swap
      // 94a: aastore
      // 94b: dup_x1
      // 94c: swap
      // 94d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 950: bipush 5
      // 951: swap
      // 952: aastore
      // 953: dup_x1
      // 954: swap
      // 955: bipush 4
      // 956: swap
      // 957: aastore
      // 958: dup_x1
      // 959: swap
      // 95a: bipush 3
      // 95b: swap
      // 95c: aastore
      // 95d: dup_x2
      // 95e: dup_x2
      // 95f: pop
      // 960: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 963: bipush 2
      // 964: swap
      // 965: aastore
      // 966: dup_x1
      // 967: swap
      // 968: bipush 1
      // 969: swap
      // 96a: aastore
      // 96b: dup_x1
      // 96c: swap
      // 96d: bipush 0
      // 96e: swap
      // 96f: aastore
      // 970: ldc2_w -4928890575113270194
      // 973: lload 5
      // 975: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97a: astore 71
      // 97c: aload 71
      // 97e: lload 34
      // 980: bipush 2
      // 981: anewarray 384
      // 984: dup_x2
      // 985: dup_x2
      // 986: pop
      // 987: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98a: bipush 1
      // 98b: swap
      // 98c: aastore
      // 98d: dup_x1
      // 98e: swap
      // 98f: bipush 0
      // 990: swap
      // 991: aastore
      // 992: ldc2_w -4812382908350931553
      // 995: lload 5
      // 997: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99c: istore 72
      // 99e: iload 64
      // 9a0: iload 65
      // 9a2: iload 51
      // 9a4: ifne a44
      // 9a7: if_icmpge a1f
      // 9aa: goto 9b8
      // 9ad: ldc2_w -4794633792209686802
      // 9b0: lload 5
      // 9b2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b7: athrow
      // 9b8: iload 64
      // 9ba: iload 72
      // 9bc: lload 5
      // 9be: lconst_0
      // 9bf: lcmp
      // 9c0: ifle a44
      // 9c3: iload 51
      // 9c5: ifne a44
      // 9c8: goto 9d6
      // 9cb: ldc2_w -4794633792209686802
      // 9ce: lload 5
      // 9d0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d5: athrow
      // 9d6: if_icmpge a1f
      // 9d9: goto 9e7
      // 9dc: ldc2_w -4794633792209686802
      // 9df: lload 5
      // 9e1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e6: athrow
      // 9e7: aload 60
      // 9e9: aload 4
      // 9eb: lload 49
      // 9ed: bipush 3
      // 9ee: anewarray 384
      // 9f1: dup_x2
      // 9f2: dup_x2
      // 9f3: pop
      // 9f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f7: bipush 2
      // 9f8: swap
      // 9f9: aastore
      // 9fa: dup_x1
      // 9fb: swap
      // 9fc: bipush 1
      // 9fd: swap
      // 9fe: aastore
      // 9ff: dup_x1
      // a00: swap
      // a01: bipush 0
      // a02: swap
      // a03: aastore
      // a04: ldc2_w -4628953677039325673
      // a07: lload 5
      // a09: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0e: pop
      // a0f: aload 61
      // a11: astore 59
      // a13: lload 5
      // a15: lconst_0
      // a16: lcmp
      // a17: iflt aff
      // a1a: iload 51
      // a1c: ifeq ae8
      // a1f: iload 65
      // a21: iload 51
      // a23: ifne ae3
      // a26: goto a34
      // a29: ldc2_w -4794633792209686802
      // a2c: lload 5
      // a2e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a33: athrow
      // a34: iload 64
      // a36: goto a44
      // a39: ldc2_w -4794633792209686802
      // a3c: lload 5
      // a3e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a43: athrow
      // a44: lload 5
      // a46: lconst_0
      // a47: lcmp
      // a48: iflt a52
      // a4b: if_icmpge aae
      // a4e: iload 65
      // a50: iload 51
      // a52: ifne ae3
      // a55: goto a63
      // a58: ldc2_w -4794633792209686802
      // a5b: lload 5
      // a5d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a62: athrow
      // a63: iload 72
      // a65: if_icmpge aae
      // a68: goto a76
      // a6b: ldc2_w -4794633792209686802
      // a6e: lload 5
      // a70: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a75: athrow
      // a76: aload 62
      // a78: aload 4
      // a7a: lload 49
      // a7c: bipush 3
      // a7d: anewarray 384
      // a80: dup_x2
      // a81: dup_x2
      // a82: pop
      // a83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a86: bipush 2
      // a87: swap
      // a88: aastore
      // a89: dup_x1
      // a8a: swap
      // a8b: bipush 1
      // a8c: swap
      // a8d: aastore
      // a8e: dup_x1
      // a8f: swap
      // a90: bipush 0
      // a91: swap
      // a92: aastore
      // a93: ldc2_w -4628953677039325673
      // a96: lload 5
      // a98: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9d: pop
      // a9e: aload 63
      // aa0: astore 59
      // aa2: lload 5
      // aa4: lconst_0
      // aa5: lcmp
      // aa6: iflt aff
      // aa9: iload 51
      // aab: ifeq ae8
      // aae: aload 70
      // ab0: aload 4
      // ab2: lload 49
      // ab4: bipush 3
      // ab5: anewarray 384
      // ab8: dup_x2
      // ab9: dup_x2
      // aba: pop
      // abb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // abe: bipush 2
      // abf: swap
      // ac0: aastore
      // ac1: dup_x1
      // ac2: swap
      // ac3: bipush 1
      // ac4: swap
      // ac5: aastore
      // ac6: dup_x1
      // ac7: swap
      // ac8: bipush 0
      // ac9: swap
      // aca: aastore
      // acb: ldc2_w -4628953677039325673
      // ace: lload 5
      // ad0: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad5: goto ae3
      // ad8: ldc2_w -4794633792209686802
      // adb: lload 5
      // add: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae2: athrow
      // ae3: pop
      // ae4: aload 71
      // ae6: astore 59
      // ae8: aload 56
      // aea: aload 59
      // aec: bipush 1
      // aed: anewarray 384
      // af0: dup_x1
      // af1: swap
      // af2: bipush 0
      // af3: swap
      // af4: aastore
      // af5: ldc2_w -6700776766219513406
      // af8: lload 5
      // afa: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aff: aload 53
      // b01: iload 51
      // b03: lload 5
      // b05: lconst_0
      // b06: lcmp
      // b07: iflt b60
      // b0a: ifne b5f
      // b0d: ifnull b4f
      // b10: goto b1e
      // b13: ldc2_w -4794633792209686802
      // b16: lload 5
      // b18: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1d: athrow
      // b1e: aload 0
      // b1f: lload 32
      // b21: bipush 1
      // b22: anewarray 384
      // b25: dup_x2
      // b26: dup_x2
      // b27: pop
      // b28: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b2b: bipush 0
      // b2c: swap
      // b2d: aastore
      // b2e: ldc2_w -4803862988227885432
      // b31: lload 5
      // b33: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b38: istore 60
      // b3a: aload 0
      // b3b: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // b3e: iload 60
      // b40: aload 56
      // b42: aastore
      // b43: lload 5
      // b45: lconst_0
      // b46: lcmp
      // b47: iflt bdf
      // b4a: iload 51
      // b4c: ifeq bc4
      // b4f: aload 56
      // b51: goto b5f
      // b54: ldc2_w -4794633792209686802
      // b57: lload 5
      // b59: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5e: athrow
      // b5f: bipush 0
      // b60: anewarray 384
      // b63: ldc2_w -6642220441192652719
      // b66: lload 5
      // b68: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6d: iload 51
      // b6f: ifne b97
      // b72: ifle bc4
      // b75: goto b83
      // b78: ldc2_w -4794633792209686802
      // b7b: lload 5
      // b7d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b82: athrow
      // b83: aload 0
      // b84: getfield com/zelix/k_.P I
      // b87: bipush 1
      // b88: iadd
      // b89: goto b97
      // b8c: ldc2_w -4794633792209686802
      // b8f: lload 5
      // b91: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b96: athrow
      // b97: anewarray 537
      // b9a: astore 60
      // b9c: aload 0
      // b9d: getfield com/zelix/k_.N [Lcom/zelix/kw;
      // ba0: bipush 0
      // ba1: aload 60
      // ba3: bipush 0
      // ba4: aload 0
      // ba5: getfield com/zelix/k_.P I
      // ba8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // bab: aload 60
      // bad: aload 0
      // bae: getfield com/zelix/k_.P I
      // bb1: aload 56
      // bb3: aastore
      // bb4: aload 0
      // bb5: aload 60
      // bb7: putfield com/zelix/k_.N [Lcom/zelix/kw;
      // bba: aload 0
      // bbb: dup
      // bbc: getfield com/zelix/k_.P I
      // bbf: bipush 1
      // bc0: iadd
      // bc1: putfield com/zelix/k_.P I
      // bc4: aload 0
      // bc5: getfield com/zelix/k_.F Lcom/zelix/bc;
      // bc8: bipush 0
      // bc9: bipush 1
      // bca: anewarray 384
      // bcd: dup_x1
      // bce: swap
      // bcf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // bd2: bipush 0
      // bd3: swap
      // bd4: aastore
      // bd5: ldc2_w -6488910598411653866
      // bd8: lload 5
      // bda: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bdf: aload 52
      // be1: lload 45
      // be3: bipush 1
      // be4: anewarray 384
      // be7: dup_x2
      // be8: dup_x2
      // be9: pop
      // bea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bed: bipush 0
      // bee: swap
      // bef: aastore
      // bf0: ldc2_w -6439453326195986135
      // bf3: lload 5
      // bf5: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bfa: return
   }

   public void I(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var3 = (Long)var1[1];
      Set var5 = (Set)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 3464000435628L;
      m44.a<"r">(this.F, new Object[]{var2, var6, var5}, 4420447488973747835L, var3);
   }

   void O(Object[] var1) {
      long var5 = (Long)var1[0];
      ii var10 = (ii)var1[1];
      bn var8 = (bn)var1[2];
      Set var3 = (Set)var1[3];
      hd var9 = (hd)var1[4];
      boolean var7 = (Boolean)var1[5];
      List var2 = (List)var1[6];
      t6 var4 = (t6)var1[7];
      var5 = a ^ var5;
      long var11 = var5 ^ 77704770365844L;
      bc var10000 = this.F;
      Object[] var10010 = new Object[]{null, null, var8, var3, var9, var7, var2, var4};
      var10010[1] = var11;
      var10010[0] = var10;
      m44.a<"t">(var10000, var10010, -5370057991338504382L, var5);
   }

   boolean n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 49713658346894L;
      return m44.a<"t">(this.F, new Object[]{var4}, -8435819986279620781L, var2);
   }

   int[] k(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/List
      // 012: astore 9
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Integer
      // 01a: invokevirtual java/lang/Integer.intValue ()I
      // 01d: istore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 7
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 8
      // 034: dup
      // 035: bipush 5
      // 036: aaload
      // 037: checkcast java/lang/String
      // 03a: astore 6
      // 03c: dup
      // 03d: bipush 6
      // 03f: aaload
      // 040: checkcast java/util/List
      // 043: astore 2
      // 044: pop
      // 045: getstatic com/zelix/k_.a J
      // 048: lload 4
      // 04a: lxor
      // 04b: lstore 4
      // 04d: lload 4
      // 04f: dup2
      // 050: ldc2_w 133076427551083
      // 053: lxor
      // 054: lstore 10
      // 056: dup2
      // 057: ldc2_w 78589639919700
      // 05a: lxor
      // 05b: lstore 12
      // 05d: dup2
      // 05e: ldc2_w 2574141809476
      // 061: lxor
      // 062: lstore 14
      // 064: pop2
      // 065: ldc2_w -6094354815709881820
      // 068: lload 4
      // 06a: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: istore 16
      // 071: aload 0
      // 072: iload 16
      // 074: ifeq 09a
      // 077: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 07a: ifnull 15c
      // 07d: goto 08b
      // 080: ldc2_w -5989140389808373894
      // 083: lload 4
      // 085: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 0
      // 08c: goto 09a
      // 08f: ldc2_w -5989140389808373894
      // 092: lload 4
      // 094: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: invokevirtual com/zelix/k_.X ()I
      // 09d: istore 17
      // 09f: iload 17
      // 0a1: iload 16
      // 0a3: lload 4
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: iflt 0af
      // 0aa: ifeq 0f6
      // 0ad: iload 7
      // 0af: if_icmpge 0f2
      // 0b2: goto 0c0
      // 0b5: ldc2_w -5989140389808373894
      // 0b8: lload 4
      // 0ba: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: iload 7
      // 0c3: lload 12
      // 0c5: bipush 2
      // 0c6: anewarray 384
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 1
      // 0d0: swap
      // 0d1: aastore
      // 0d2: dup_x1
      // 0d3: swap
      // 0d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -5297814858326492716
      // 0dd: lload 4
      // 0df: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 0f2
      // 0e7: ldc2_w -5989140389808373894
      // 0ea: lload 4
      // 0ec: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: invokevirtual com/zelix/k_.p ()I
      // 0f6: istore 18
      // 0f8: aload 0
      // 0f9: iload 18
      // 0fb: iload 3
      // 0fc: iadd
      // 0fd: lload 14
      // 0ff: dup2_x1
      // 100: pop2
      // 101: bipush 2
      // 102: anewarray 384
      // 105: dup_x1
      // 106: swap
      // 107: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: ldc2_w -5930770818764674089
      // 119: lload 4
      // 11b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: aload 0
      // 121: getfield com/zelix/k_.F Lcom/zelix/bc;
      // 124: aload 9
      // 126: lload 10
      // 128: iload 8
      // 12a: aload 6
      // 12c: aload 2
      // 12d: bipush 5
      // 12e: anewarray 384
      // 131: dup_x1
      // 132: swap
      // 133: bipush 4
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 3
      // 139: swap
      // 13a: aastore
      // 13b: dup_x1
      // 13c: swap
      // 13d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 140: bipush 2
      // 141: swap
      // 142: aastore
      // 143: dup_x2
      // 144: dup_x2
      // 145: pop
      // 146: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 149: bipush 1
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 0
      // 14f: swap
      // 150: aastore
      // 151: ldc2_w -5299503132825257942
      // 154: lload 4
      // 156: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: areturn
      // 15c: aconst_null
      // 15d: areturn
   }

   void X(Object[] var1) {
      y_ var2 = (y_)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 1811574909446L;
      m44.a<"w">(this.F, new Object[]{var2, var5}, -6529063404788176271L, var3);
   }

   static {
      long var11 = a ^ 65061435062661L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[22];
      int var18 = 0;
      String var17 = "ê×aanwñÇ]2\u0001ðH\u0017p.AòØ»Þu©öÉà#¦M~¶\u0087Vó¼ÂH2©\u0080\u0081WûW· Ì=@DWL\u0080\u0004Ít\u0010\u001f3¹Í\u001c\u0011í¼Þ\u008d&\u009c \u008aÞ\u000f`Û(êË\n\u0000\u007fçßu\u00adxËÔLR\u008f!GmÐ&¼¼\u001cÓ10Lê1}\u0091Gzª3\u0082×Q\fvÑq&ãéa\u008bæýÙZ\u008eÈø\u0081S$²~\bZc\u000f\u0082u:3ä\u0007y\u0017ú\u0005jq OXÌ\r\u0016ú«2\u008dqÌ\u0085\u0006ay)_\u001f\u0097/B\u008aU\u009d\u0010\u0006\u0080\u0081+>;&I¶(\u0007J\u007f\u001a÷»0\u0098YïÖÜw(Þ\u0089ì¦\u0091>É$»oÜ\u0095ÂjõªVúC1\u0087Ã\u0012o{$rÑVPK+£\u0084~t_|/\u000b\n\u0018úa;k;\u0003w\u009cÞT:ï\u0083)Ú&ö\u009f(\u0086¼\u001c4N\u0010:©\\Í\u0088Ëb\n¾\u001aJZø@«\u0082\u0018B\u0098¾zøþãD7Wò\u0006po÷\u009e\u0013ºpÕÜC¼` ²$W|½ÉP\u0093Àì\u000f²\u0011\u0011ÝÓ\u0085\u0014£}\u001f\u0098Wå±v\u0012µK9µ\u00998\u008d°Uã\"\u008c:âË3\u0000&\u009d \f\u009e\u0097\u0083ü\u008fÉ%ÙãMÎÆÑd\u0081 IJz ÊYÂÙ«\\(+\u0089\u009aÊÎo¡qfâ\u009cÕÂÆ8q}*'ñ<\u0010\u001b\u0082Ã³ké\nVç÷ö\u0019\u0014!~\u0081Ñª\u0095L~\u009b\u001f?\u0084Ð\u0017áÎÃÒX\u009dçW~\u0013\u0081ðy\u0084\u0001ÏÐét¨©q\u0010t3\u00adA'\u0092\u0011sàùaØS}z}\u0018Ç\u00960ÇI;á\u0018Õ\"\u0093e\\/®ñÅ\u0018\u0089ÿ#°\u0012h@ÁP\u0005j\u001d^ø;Õ^½Çé«K»\u001d2ôêå@\u001a\u0014\u0019\u0005[÷9uÆïbìb##URÙ~Eð<C\u0002}\u0093Â\u007f¹ýy\u007f\u000bÛr+èu\u0090+Ò\u000f8\u00819zÔ\u0011§C\rµ\u008eyÝs\u0003\u0018S¤\u0007D¡zfÐè\u0092\u0005õT \u009cÚ¥\u008a¦èÚ½®Ák\u0081©½ï.ÌõdlÚ\u0088\u00841\u0083IUxQ\u0087\u0005dú\u0097Ã\u001eZÊù\u008da\u00ad\u000b\tT37_\u009fµ-(>¡*;§³_û(æt¬Ðd_å]÷Ð|<\u0001sh\u0095XZÚÕy\u0011M\u0094Q\u001e\ns®\u0083¬á\u001bþÞøäÌOíÎñ~Rr³\u007f\u0015¸kuÆqF\u008dk¡ùöÕXB\rJ¨\u009a¯\u001cÓd(¶J\f\u0001Åkù\rRÔ:PCÅ \rH1\u0095\tT\u0098Ìó\u0018 P¸YÕÚÖ\u000f\\ý\\a4¯U\u0003\u0094ÆGlß\u0010¾ÔXO,\u001bAö\u001a\tØZb/¨[\u0092ÇÄÅ\u0013E\u001cÏ¨[\u009d\u0094j\u0084õ\"ø\u008ah®N,,$á¹\u0018=\u0091·¿Áy¬[ëXâ¶O;c¹rO\u0014Å\u0002ß\u0002õ\u0018Ø|©qÑ8\u0002[â·Þ\u008f\u0083É#*\u0096u/£8ûuÿ GÎ}8Fôì ñ&Ô\u0098Ì;äº\u0002Ó\u0088Aøm\"\u0003j²Fpã`\r¨H4\u009c-¢_\u001d\u001aä.n9`\u008fÜ\f#Oã/¸åÕ\u0088Î*\u0081Ó\u0092ér®]½\u0088\u0018¥èÂè\bå\u008c§+Ó3·ÌH\u00879oüi\u001e\u0098\u008e\u000e\u0094ýÍ[¯|µçAÉ\u0082CsÎ\u0018p[Øþ\rî\u0095s\u0099Ô¡û\u0011Ù\u0080kW¦%kÞ\u0013Ún";
      int var19 = "ê×aanwñÇ]2\u0001ðH\u0017p.AòØ»Þu©öÉà#¦M~¶\u0087Vó¼ÂH2©\u0080\u0081WûW· Ì=@DWL\u0080\u0004Ít\u0010\u001f3¹Í\u001c\u0011í¼Þ\u008d&\u009c \u008aÞ\u000f`Û(êË\n\u0000\u007fçßu\u00adxËÔLR\u008f!GmÐ&¼¼\u001cÓ10Lê1}\u0091Gzª3\u0082×Q\fvÑq&ãéa\u008bæýÙZ\u008eÈø\u0081S$²~\bZc\u000f\u0082u:3ä\u0007y\u0017ú\u0005jq OXÌ\r\u0016ú«2\u008dqÌ\u0085\u0006ay)_\u001f\u0097/B\u008aU\u009d\u0010\u0006\u0080\u0081+>;&I¶(\u0007J\u007f\u001a÷»0\u0098YïÖÜw(Þ\u0089ì¦\u0091>É$»oÜ\u0095ÂjõªVúC1\u0087Ã\u0012o{$rÑVPK+£\u0084~t_|/\u000b\n\u0018úa;k;\u0003w\u009cÞT:ï\u0083)Ú&ö\u009f(\u0086¼\u001c4N\u0010:©\\Í\u0088Ëb\n¾\u001aJZø@«\u0082\u0018B\u0098¾zøþãD7Wò\u0006po÷\u009e\u0013ºpÕÜC¼` ²$W|½ÉP\u0093Àì\u000f²\u0011\u0011ÝÓ\u0085\u0014£}\u001f\u0098Wå±v\u0012µK9µ\u00998\u008d°Uã\"\u008c:âË3\u0000&\u009d \f\u009e\u0097\u0083ü\u008fÉ%ÙãMÎÆÑd\u0081 IJz ÊYÂÙ«\\(+\u0089\u009aÊÎo¡qfâ\u009cÕÂÆ8q}*'ñ<\u0010\u001b\u0082Ã³ké\nVç÷ö\u0019\u0014!~\u0081Ñª\u0095L~\u009b\u001f?\u0084Ð\u0017áÎÃÒX\u009dçW~\u0013\u0081ðy\u0084\u0001ÏÐét¨©q\u0010t3\u00adA'\u0092\u0011sàùaØS}z}\u0018Ç\u00960ÇI;á\u0018Õ\"\u0093e\\/®ñÅ\u0018\u0089ÿ#°\u0012h@ÁP\u0005j\u001d^ø;Õ^½Çé«K»\u001d2ôêå@\u001a\u0014\u0019\u0005[÷9uÆïbìb##URÙ~Eð<C\u0002}\u0093Â\u007f¹ýy\u007f\u000bÛr+èu\u0090+Ò\u000f8\u00819zÔ\u0011§C\rµ\u008eyÝs\u0003\u0018S¤\u0007D¡zfÐè\u0092\u0005õT \u009cÚ¥\u008a¦èÚ½®Ák\u0081©½ï.ÌõdlÚ\u0088\u00841\u0083IUxQ\u0087\u0005dú\u0097Ã\u001eZÊù\u008da\u00ad\u000b\tT37_\u009fµ-(>¡*;§³_û(æt¬Ðd_å]÷Ð|<\u0001sh\u0095XZÚÕy\u0011M\u0094Q\u001e\ns®\u0083¬á\u001bþÞøäÌOíÎñ~Rr³\u007f\u0015¸kuÆqF\u008dk¡ùöÕXB\rJ¨\u009a¯\u001cÓd(¶J\f\u0001Åkù\rRÔ:PCÅ \rH1\u0095\tT\u0098Ìó\u0018 P¸YÕÚÖ\u000f\\ý\\a4¯U\u0003\u0094ÆGlß\u0010¾ÔXO,\u001bAö\u001a\tØZb/¨[\u0092ÇÄÅ\u0013E\u001cÏ¨[\u009d\u0094j\u0084õ\"ø\u008ah®N,,$á¹\u0018=\u0091·¿Áy¬[ëXâ¶O;c¹rO\u0014Å\u0002ß\u0002õ\u0018Ø|©qÑ8\u0002[â·Þ\u008f\u0083É#*\u0096u/£8ûuÿ GÎ}8Fôì ñ&Ô\u0098Ì;äº\u0002Ó\u0088Aøm\"\u0003j²Fpã`\r¨H4\u009c-¢_\u001d\u001aä.n9`\u008fÜ\f#Oã/¸åÕ\u0088Î*\u0081Ó\u0092ér®]½\u0088\u0018¥èÂè\bå\u008c§+Ó3·ÌH\u00879oüi\u001e\u0098\u008e\u000e\u0094ýÍ[¯|µçAÉ\u0082CsÎ\u0018p[Øþ\rî\u0095s\u0099Ô¡û\u0011Ù\u0080kW¦%kÞ\u0013Ún"
         .length();
      char var16 = 176;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     c = var20;
                     d = new String[22];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "(ae>æB#5©`h¢(Ñù¨úZ\u008aÞ]Üâµv%x\u0019<£.Dd%Z4þ\u0000÷\u001d";
                     int var5 = "(ae>æB#5©`h¢(Ñù¨úZ\u008aÞ]Üâµv%x\u0019<£.Dd%Z4þ\u0000÷\u001d".length();
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
                                    h = var6;
                                    i = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "<\u0002S¦C\u000bÖÛ\nJë\u001do\u000eÐd";
                                 var5 = "<\u0002S¦C\u000bÖÛ\nJë\u001do\u000eÐd".length();
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

                  var17 = "û_ïV\u0098we\u0087\u0010ÜÅ\u001dì\u0090Gl\u0018Ý~EKVúñMIú\u008bLIP\u007fÉ\u0092pêªûÇ·º";
                  var19 = "û_ïV\u0098we\u0087\u0010ÜÅ\u001dì\u0090Gl\u0018Ý~EKVúñMIú\u008bLIP\u007fÉ\u0092pêªûÇ·º".length();
                  var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20162;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/k_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19568;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/k_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/k_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
