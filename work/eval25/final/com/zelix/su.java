package com.zelix;

import java.io.BufferedReader;
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

public abstract class su {
   qd W;
   boolean R;
   private static String p;
   private static final long b = ess.a(4396943981699637327L, 7848370465410252569L, MethodHandles.lookup().lookupClass()).a(205891809868966L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;

   abstract String q(Object[] var1);

   final boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 32210906059503L;
      String[] var6 = x44.a<"u">(5683780829625539427L, var2);

      try {
         int var10000 = x44.a<"m">(x44.a<"i">(this, 5226792970318191249L, var2), new Object[]{var4}, 5247599936099281028L, var2);
         if (var6 == null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var7) {
         throw x44.a<"u">(var7, 5459024713655823966L, var2);
      }

      return (boolean)0;
   }

   final String s(Object[] var1) {
      String var4 = (String)var1[0];
      _8s var8 = (_8s)var1[1];
      _8s var7 = (_8s)var1[2];
      xx var2 = (xx)var1[3];
      String var3 = (String)var1[4];
      boolean var10 = (Boolean)var1[5];
      _zk var9 = (_zk)var1[6];
      long var5 = (Long)var1[7];
      var5 = b ^ var5;
      long var11 = var5 ^ 120883110473454L;
      long var13 = var5 ^ 93381032274473L;
      long var15 = var5 ^ 53249388383490L;
      String var17 = x44.a<"l">(this, new Object[]{var4, var11}, 3690858500828638642L, var5);
      Object[] var10011 = new Object[]{null, null, null, null, null, null, null, var13, var9};
      var10011[6] = var10;
      var10011[5] = var3;
      var10011[4] = var2;
      var10011[3] = var7;
      var10011[2] = var8;
      var10011[1] = var17;
      var10011[0] = var4;
      return x44.a<"l">(this, new Object[]{x44.a<"t">(var10011, 3951824015911707669L, var5), var15}, 3339497701211775663L, var5);
   }

   static String C(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_8s
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/xx
      // 021: astore 3
      // 022: pop
      // 023: getstatic com/zelix/su.b J
      // 026: lload 1
      // 027: lxor
      // 028: lstore 1
      // 029: lload 1
      // 02a: dup2
      // 02b: ldc2_w 32985585648724
      // 02e: lxor
      // 02f: lstore 6
      // 031: pop2
      // 032: ldc2_w -2246191782933826224
      // 035: lload 1
      // 036: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: astore 12
      // 03d: aload 4
      // 03f: sipush 9919
      // 042: ldc2_w 1592654481666859719
      // 045: lload 1
      // 046: lxor
      // 047: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: invokevirtual java/lang/String.indexOf (I)I
      // 04f: aload 12
      // 051: ifnull 0bd
      // 054: ifle 0bc
      // 057: goto 064
      // 05a: ldc2_w -1877597556757102483
      // 05d: lload 1
      // 05e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 4
      // 066: aload 12
      // 068: ifnull 0bb
      // 06b: goto 078
      // 06e: ldc2_w -1877597556757102483
      // 071: lload 1
      // 072: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: sipush 20024
      // 07b: ldc2_w 8745258426039437894
      // 07e: lload 1
      // 07f: lxor
      // 080: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: invokevirtual java/lang/String.indexOf (I)I
      // 088: bipush -1
      // 089: if_icmpne 0a7
      // 08c: goto 099
      // 08f: ldc2_w -1877597556757102483
      // 092: lload 1
      // 093: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: bipush 1
      // 09a: istore 13
      // 09c: lload 1
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: iflt 0bf
      // 0a2: aload 12
      // 0a4: ifnonnull 0bf
      // 0a7: aload 3
      // 0a8: bipush 0
      // 0a9: invokevirtual com/zelix/xx.Q (Z)V
      // 0ac: aload 4
      // 0ae: goto 0bb
      // 0b1: ldc2_w -1877597556757102483
      // 0b4: lload 1
      // 0b5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: areturn
      // 0bc: bipush 0
      // 0bd: istore 13
      // 0bf: aload 4
      // 0c1: aload 5
      // 0c3: iload 13
      // 0c5: aload 12
      // 0c7: ifnull 0db
      // 0ca: ifne 0de
      // 0cd: goto 0da
      // 0d0: ldc2_w -1877597556757102483
      // 0d3: lload 1
      // 0d4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: bipush 1
      // 0db: goto 0df
      // 0de: bipush 0
      // 0df: aload 3
      // 0e0: astore 8
      // 0e2: istore 9
      // 0e4: astore 10
      // 0e6: astore 11
      // 0e8: lload 6
      // 0ea: aload 11
      // 0ec: aload 10
      // 0ee: iload 9
      // 0f0: aload 8
      // 0f2: bipush 5
      // 0f3: anewarray 544
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 4
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 100: bipush 3
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 2
      // 106: swap
      // 107: aastore
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
      // 116: ldc2_w -123027676240080764
      // 119: lload 1
      // 11a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: areturn
   }

   private static String T(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      _8s var5 = (_8s)var0[2];
      xx var4 = (xx)var0[3];
      var2 = b ^ var2;
      long var6 = var2 ^ 112508909252514L;
      Object[] var10006 = new Object[]{null, var1, var5, true, var4};
      var10006[0] = var6;
      return x44.a<"p">(var10006, -7657084009747874958L, var2);
   }

   static String W(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/_8s
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/vm
      // 020: astore 4
      // 022: pop
      // 023: getstatic com/zelix/su.b J
      // 026: lload 2
      // 027: lxor
      // 028: lstore 2
      // 029: lload 2
      // 02a: dup2
      // 02b: ldc2_w 35573378677790
      // 02e: lxor
      // 02f: lstore 6
      // 031: dup2
      // 032: ldc2_w 69952235103149
      // 035: lxor
      // 036: lstore 8
      // 038: dup2
      // 039: ldc2_w 44783468234844
      // 03c: lxor
      // 03d: lstore 10
      // 03f: dup2
      // 040: ldc2_w 21566431937366
      // 043: lxor
      // 044: lstore 12
      // 046: pop2
      // 047: ldc2_w -1842340983414852627
      // 04a: lload 2
      // 04b: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: astore 14
      // 052: aload 1
      // 053: sipush 8368
      // 056: ldc2_w 4736269836259239034
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 063: aload 14
      // 065: ifnull 0de
      // 068: ifeq 0aa
      // 06b: goto 078
      // 06e: ldc2_w -2068223006204754224
      // 071: lload 2
      // 072: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 4
      // 07a: aload 1
      // 07b: lload 6
      // 07d: aload 5
      // 07f: bipush 3
      // 080: anewarray 544
      // 083: dup_x1
      // 084: swap
      // 085: bipush 2
      // 086: swap
      // 087: aastore
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: ldc2_w -1792198958253262945
      // 099: lload 2
      // 09a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: areturn
      // 0a0: ldc2_w -2068223006204754224
      // 0a3: lload 2
      // 0a4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 4
      // 0ac: aload 1
      // 0ad: aload 14
      // 0af: ifnull 10f
      // 0b2: lload 12
      // 0b4: dup2_x1
      // 0b5: pop2
      // 0b6: bipush 2
      // 0b7: anewarray 544
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w -46172225799171264
      // 0cb: lload 2
      // 0cc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: goto 0de
      // 0d4: ldc2_w -2068223006204754224
      // 0d7: lload 2
      // 0d8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ifeq 10c
      // 0e1: aload 4
      // 0e3: aload 1
      // 0e4: lload 10
      // 0e6: bipush 2
      // 0e7: anewarray 544
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 1
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 0
      // 0f6: swap
      // 0f7: aastore
      // 0f8: ldc2_w -289907862506444889
      // 0fb: lload 2
      // 0fc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: areturn
      // 102: ldc2_w -2068223006204754224
      // 105: lload 2
      // 106: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: aload 4
      // 10e: aload 1
      // 10f: lload 8
      // 111: dup2_x1
      // 112: pop2
      // 113: bipush 2
      // 114: anewarray 544
      // 117: dup_x1
      // 118: swap
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w -326502787942561812
      // 128: lload 2
      // 129: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: areturn
   }

   public static String h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 1
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast com/zelix/_8s
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast com/zelix/_8s
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast com/zelix/xx
      // 024: astore 4
      // 026: dup
      // 027: bipush 5
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 10
      // 02e: dup
      // 02f: bipush 6
      // 031: aaload
      // 032: checkcast java/lang/Boolean
      // 035: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 038: istore 6
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast java/lang/Long
      // 041: invokevirtual java/lang/Long.longValue ()J
      // 044: lstore 8
      // 046: dup
      // 047: bipush 8
      // 049: aaload
      // 04a: checkcast com/zelix/_zk
      // 04d: astore 7
      // 04f: pop
      // 050: getstatic com/zelix/su.b J
      // 053: lload 8
      // 055: lxor
      // 056: lstore 8
      // 058: lload 8
      // 05a: dup2
      // 05b: ldc2_w 140087686688937
      // 05e: lxor
      // 05f: lstore 11
      // 061: dup2
      // 062: ldc2_w 17825617005817
      // 065: lxor
      // 066: lstore 13
      // 068: dup2
      // 069: ldc2_w 46903299017486
      // 06c: lxor
      // 06d: lstore 15
      // 06f: dup2
      // 070: ldc2_w 58616429028579
      // 073: lxor
      // 074: lstore 17
      // 076: dup2
      // 077: ldc2_w 114083696965533
      // 07a: lxor
      // 07b: lstore 19
      // 07d: dup2
      // 07e: ldc2_w 100367330713606
      // 081: lxor
      // 082: lstore 21
      // 084: dup2
      // 085: ldc2_w 84783608778517
      // 088: lxor
      // 089: lstore 23
      // 08b: dup2
      // 08c: ldc2_w 129180206034919
      // 08f: lxor
      // 090: lstore 25
      // 092: pop2
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: aload 2
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: ldc ":"
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: ldc " "
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ab: astore 28
      // 0ad: aload 4
      // 0af: bipush 0
      // 0b0: invokevirtual com/zelix/xx.Q (Z)V
      // 0b3: aload 1
      // 0b4: sipush 30996
      // 0b7: ldc2_w 5740066396693001201
      // 0ba: lload 8
      // 0bc: lxor
      // 0bd: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: ldc2_w 7955279900032517052
      // 0c5: lload 8
      // 0c7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: astore 29
      // 0ce: ldc2_w 7515273233292623304
      // 0d1: lload 8
      // 0d3: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: new com/zelix/xx
      // 0db: dup
      // 0dc: invokespecial com/zelix/xx.<init> ()V
      // 0df: astore 30
      // 0e1: lload 21
      // 0e3: bipush 1
      // 0e4: anewarray 544
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w 7924916775581420437
      // 0f3: lload 8
      // 0f5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: astore 31
      // 0fc: astore 27
      // 0fe: new java/util/ArrayList
      // 101: dup
      // 102: invokespecial java/util/ArrayList.<init> ()V
      // 105: astore 32
      // 107: aload 29
      // 109: astore 33
      // 10b: aload 33
      // 10d: arraylength
      // 10e: istore 34
      // 110: bipush 0
      // 111: istore 35
      // 113: iload 35
      // 115: iload 34
      // 117: if_icmpge 368
      // 11a: aload 33
      // 11c: iload 35
      // 11e: aaload
      // 11f: astore 36
      // 121: aload 36
      // 123: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 126: astore 37
      // 128: aload 37
      // 12a: sipush 32421
      // 12d: ldc2_w 8342682770838499906
      // 130: lload 8
      // 132: lxor
      // 133: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/String.indexOf (I)I
      // 13b: istore 38
      // 13d: aload 27
      // 13f: ifnull 363
      // 142: aload 37
      // 144: invokevirtual java/lang/String.length ()I
      // 147: ldc2_w 8192430700796744189
      // 14a: lload 8
      // 14c: invokedynamic o (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: if_icmplt 360
      // 154: goto 162
      // 157: ldc2_w 7883867468209424629
      // 15a: lload 8
      // 15c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: iload 38
      // 164: lload 8
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 191
      // 16b: aload 27
      // 16d: ifnull 191
      // 170: goto 17e
      // 173: ldc2_w 7883867468209424629
      // 176: lload 8
      // 178: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: ifle 360
      // 181: goto 18f
      // 184: ldc2_w 7883867468209424629
      // 187: lload 8
      // 189: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: iload 38
      // 191: aload 37
      // 193: invokevirtual java/lang/String.length ()I
      // 196: bipush 1
      // 197: isub
      // 198: lload 8
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 1f1
      // 19f: aload 27
      // 1a1: ifnull 1f1
      // 1a4: if_icmpge 360
      // 1a7: goto 1b5
      // 1aa: ldc2_w 7883867468209424629
      // 1ad: lload 8
      // 1af: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 37
      // 1b7: sipush 8349
      // 1ba: ldc2_w 3202907017139383420
      // 1bd: lload 8
      // 1bf: lxor
      // 1c0: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: invokevirtual java/lang/String.indexOf (I)I
      // 1c8: lload 8
      // 1ca: lconst_0
      // 1cb: lcmp
      // 1cc: iflt 23c
      // 1cf: aload 27
      // 1d1: ifnull 23c
      // 1d4: goto 1e2
      // 1d7: ldc2_w 7883867468209424629
      // 1da: lload 8
      // 1dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: bipush -1
      // 1e3: goto 1f1
      // 1e6: ldc2_w 7883867468209424629
      // 1e9: lload 8
      // 1eb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: if_icmpne 360
      // 1f4: aload 37
      // 1f6: aload 27
      // 1f8: ifnull 27b
      // 1fb: goto 209
      // 1fe: ldc2_w 7883867468209424629
      // 201: lload 8
      // 203: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: ldc "."
      // 20b: lload 13
      // 20d: bipush 3
      // 20e: anewarray 544
      // 211: dup_x2
      // 212: dup_x2
      // 213: pop
      // 214: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 217: bipush 2
      // 218: swap
      // 219: aastore
      // 21a: dup_x1
      // 21b: swap
      // 21c: bipush 1
      // 21d: swap
      // 21e: aastore
      // 21f: dup_x1
      // 220: swap
      // 221: bipush 0
      // 222: swap
      // 223: aastore
      // 224: ldc2_w 8558713531875010703
      // 227: lload 8
      // 229: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: goto 23c
      // 231: ldc2_w 7883867468209424629
      // 234: lload 8
      // 236: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: athrow
      // 23c: ifeq 360
      // 23f: aload 37
      // 241: lload 17
      // 243: aload 5
      // 245: aload 30
      // 247: bipush 4
      // 248: anewarray 544
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 3
      // 24e: swap
      // 24f: aastore
      // 250: dup_x1
      // 251: swap
      // 252: bipush 2
      // 253: swap
      // 254: aastore
      // 255: dup_x2
      // 256: dup_x2
      // 257: pop
      // 258: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25b: bipush 1
      // 25c: swap
      // 25d: aastore
      // 25e: dup_x1
      // 25f: swap
      // 260: bipush 0
      // 261: swap
      // 262: aastore
      // 263: ldc2_w 8176911347246203073
      // 266: lload 8
      // 268: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: goto 27b
      // 270: ldc2_w 7883867468209424629
      // 273: lload 8
      // 275: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: astore 39
      // 27d: aload 30
      // 27f: invokevirtual com/zelix/xx.S ()Z
      // 282: lload 8
      // 284: lconst_0
      // 285: lcmp
      // 286: ifle 2c2
      // 289: aload 27
      // 28b: ifnull 2c2
      // 28e: ifeq 2eb
      // 291: goto 29f
      // 294: ldc2_w 7883867468209424629
      // 297: lload 8
      // 299: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: athrow
      // 29f: aload 31
      // 2a1: aload 37
      // 2a3: aload 39
      // 2a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2aa: pop
      // 2ab: aload 32
      // 2ad: aload 37
      // 2af: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b4: goto 2c2
      // 2b7: ldc2_w 7883867468209424629
      // 2ba: lload 8
      // 2bc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: pop
      // 2c3: aload 27
      // 2c5: lload 8
      // 2c7: lconst_0
      // 2c8: lcmp
      // 2c9: iflt 2d3
      // 2cc: ifnonnull 360
      // 2cf: bipush 4
      // 2d0: anewarray 2
      // 2d3: ldc2_w 7530614405441211444
      // 2d6: lload 8
      // 2d8: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: goto 2eb
      // 2e0: ldc2_w 7883867468209424629
      // 2e3: lload 8
      // 2e5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: athrow
      // 2eb: lload 23
      // 2ed: aload 37
      // 2ef: aload 3
      // 2f0: aload 30
      // 2f2: bipush 4
      // 2f3: anewarray 544
      // 2f6: dup_x1
      // 2f7: swap
      // 2f8: bipush 3
      // 2f9: swap
      // 2fa: aastore
      // 2fb: dup_x1
      // 2fc: swap
      // 2fd: bipush 2
      // 2fe: swap
      // 2ff: aastore
      // 300: dup_x1
      // 301: swap
      // 302: bipush 1
      // 303: swap
      // 304: aastore
      // 305: dup_x2
      // 306: dup_x2
      // 307: pop
      // 308: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30b: bipush 0
      // 30c: swap
      // 30d: aastore
      // 30e: ldc2_w 7817849920682081311
      // 311: lload 8
      // 313: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: astore 40
      // 31a: aload 27
      // 31c: lload 8
      // 31e: lconst_0
      // 31f: lcmp
      // 320: ifle 365
      // 323: ifnull 363
      // 326: aload 30
      // 328: invokevirtual com/zelix/xx.S ()Z
      // 32b: ifeq 360
      // 32e: goto 33c
      // 331: ldc2_w 7883867468209424629
      // 334: lload 8
      // 336: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: athrow
      // 33c: aload 31
      // 33e: aload 37
      // 340: aload 40
      // 342: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 347: pop
      // 348: aload 32
      // 34a: aload 37
      // 34c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 351: pop
      // 352: goto 360
      // 355: ldc2_w 7883867468209424629
      // 358: lload 8
      // 35a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: athrow
      // 360: iinc 35 1
      // 363: aload 27
      // 365: ifnonnull 113
      // 368: new java/util/ArrayList
      // 36b: dup
      // 36c: invokespecial java/util/ArrayList.<init> ()V
      // 36f: astore 33
      // 371: bipush 0
      // 372: istore 34
      // 374: aload 32
      // 376: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 37b: astore 35
      // 37d: aload 35
      // 37f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 384: ifeq 41b
      // 387: aload 35
      // 389: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 38e: checkcast java/lang/String
      // 391: astore 36
      // 393: aload 1
      // 394: aload 36
      // 396: iload 34
      // 398: ldc2_w 8616542173726539803
      // 39b: lload 8
      // 39d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: istore 37
      // 3a4: aload 1
      // 3a5: iload 34
      // 3a7: iload 37
      // 3a9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3ac: astore 38
      // 3ae: aload 38
      // 3b0: invokevirtual java/lang/String.length ()I
      // 3b3: aload 27
      // 3b5: lload 8
      // 3b7: lconst_0
      // 3b8: lcmp
      // 3b9: ifle 3c1
      // 3bc: ifnull 424
      // 3bf: aload 27
      // 3c1: ifnull 414
      // 3c4: goto 3d2
      // 3c7: ldc2_w 7883867468209424629
      // 3ca: lload 8
      // 3cc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d1: athrow
      // 3d2: lload 8
      // 3d4: lconst_0
      // 3d5: lcmp
      // 3d6: iflt 40e
      // 3d9: ifle 402
      // 3dc: goto 3ea
      // 3df: ldc2_w 7883867468209424629
      // 3e2: lload 8
      // 3e4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: athrow
      // 3ea: aload 33
      // 3ec: aload 38
      // 3ee: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3f3: pop
      // 3f4: goto 402
      // 3f7: ldc2_w 7883867468209424629
      // 3fa: lload 8
      // 3fc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: athrow
      // 402: aload 33
      // 404: aload 36
      // 406: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 40b: pop
      // 40c: iload 37
      // 40e: aload 36
      // 410: invokevirtual java/lang/String.length ()I
      // 413: iadd
      // 414: istore 34
      // 416: aload 27
      // 418: ifnonnull 37d
      // 41b: lload 8
      // 41d: lconst_0
      // 41e: lcmp
      // 41f: iflt 441
      // 422: iload 34
      // 424: aload 1
      // 425: invokevirtual java/lang/String.length ()I
      // 428: if_icmpge 441
      // 42b: aload 1
      // 42c: iload 34
      // 42e: aload 1
      // 42f: invokevirtual java/lang/String.length ()I
      // 432: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 435: astore 35
      // 437: aload 33
      // 439: aload 35
      // 43b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 440: pop
      // 441: lload 25
      // 443: bipush 1
      // 444: anewarray 544
      // 447: dup_x2
      // 448: dup_x2
      // 449: pop
      // 44a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44d: bipush 0
      // 44e: swap
      // 44f: aastore
      // 450: ldc2_w 8062473286523479599
      // 453: lload 8
      // 455: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45a: astore 35
      // 45c: lload 25
      // 45e: bipush 1
      // 45f: anewarray 544
      // 462: dup_x2
      // 463: dup_x2
      // 464: pop
      // 465: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 468: bipush 0
      // 469: swap
      // 46a: aastore
      // 46b: ldc2_w 8062473286523479599
      // 46e: lload 8
      // 470: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 475: astore 36
      // 477: new java/lang/StringBuilder
      // 47a: dup
      // 47b: invokespecial java/lang/StringBuilder.<init> ()V
      // 47e: astore 37
      // 480: bipush 0
      // 481: istore 38
      // 483: aconst_null
      // 484: astore 39
      // 486: bipush 0
      // 487: istore 40
      // 489: bipush 0
      // 48a: istore 41
      // 48c: bipush 0
      // 48d: istore 42
      // 48f: aload 33
      // 491: invokeinterface java/util/List.size ()I 1
      // 496: istore 43
      // 498: bipush 0
      // 499: istore 44
      // 49b: iload 44
      // 49d: iload 43
      // 49f: if_icmpge 932
      // 4a2: aload 33
      // 4a4: iload 44
      // 4a6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4ab: checkcast java/lang/String
      // 4ae: aload 27
      // 4b0: ifnull 93e
      // 4b3: astore 45
      // 4b5: aload 31
      // 4b7: aload 45
      // 4b9: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 4be: aload 27
      // 4c0: ifnull 4d5
      // 4c3: ifne 4d8
      // 4c6: goto 4d4
      // 4c9: ldc2_w 7883867468209424629
      // 4cc: lload 8
      // 4ce: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: athrow
      // 4d4: bipush 1
      // 4d5: goto 4d9
      // 4d8: bipush 0
      // 4d9: istore 46
      // 4db: iload 46
      // 4dd: aload 27
      // 4df: lload 8
      // 4e1: lconst_0
      // 4e2: lcmp
      // 4e3: iflt 73e
      // 4e6: ifnull 73c
      // 4e9: ifne 72c
      // 4ec: goto 4fa
      // 4ef: ldc2_w 7883867468209424629
      // 4f2: lload 8
      // 4f4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f9: athrow
      // 4fa: aload 45
      // 4fc: aload 31
      // 4fe: lload 15
      // 500: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 503: checkcast java/lang/String
      // 506: astore 47
      // 508: aload 35
      // 50a: aload 45
      // 50c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 511: istore 48
      // 513: aload 36
      // 515: aload 47
      // 517: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 51c: istore 49
      // 51e: iload 49
      // 520: aload 27
      // 522: lload 8
      // 524: lconst_0
      // 525: lcmp
      // 526: ifle 541
      // 529: ifnull 53f
      // 52c: ifne 580
      // 52f: goto 53d
      // 532: ldc2_w 7883867468209424629
      // 535: lload 8
      // 537: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53c: athrow
      // 53d: iload 48
      // 53f: aload 27
      // 541: lload 8
      // 543: lconst_0
      // 544: lcmp
      // 545: ifle 568
      // 548: ifnull 566
      // 54b: ifeq 580
      // 54e: goto 55c
      // 551: ldc2_w 7883867468209424629
      // 554: lload 8
      // 556: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: athrow
      // 55c: ldc2_w 8113479718751488684
      // 55f: lload 8
      // 561: invokedynamic o (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 566: aload 27
      // 568: ifnull 57d
      // 56b: ifne 580
      // 56e: goto 57c
      // 571: ldc2_w 7883867468209424629
      // 574: lload 8
      // 576: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: athrow
      // 57c: bipush 1
      // 57d: goto 581
      // 580: bipush 0
      // 581: istore 50
      // 583: iload 41
      // 585: aload 27
      // 587: ifnull 5c2
      // 58a: ifne 5c1
      // 58d: goto 59b
      // 590: ldc2_w 7883867468209424629
      // 593: lload 8
      // 595: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59a: athrow
      // 59b: iload 50
      // 59d: aload 27
      // 59f: ifnull 5c2
      // 5a2: goto 5b0
      // 5a5: ldc2_w 7883867468209424629
      // 5a8: lload 8
      // 5aa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5af: athrow
      // 5b0: ifeq 5c5
      // 5b3: goto 5c1
      // 5b6: ldc2_w 7883867468209424629
      // 5b9: lload 8
      // 5bb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c0: athrow
      // 5c1: bipush 1
      // 5c2: goto 5c6
      // 5c5: bipush 0
      // 5c6: istore 41
      // 5c8: aload 47
      // 5ca: invokevirtual java/lang/String.length ()I
      // 5cd: aload 27
      // 5cf: ifnull 5e4
      // 5d2: ifne 5e7
      // 5d5: goto 5e3
      // 5d8: ldc2_w 7883867468209424629
      // 5db: lload 8
      // 5dd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e2: athrow
      // 5e3: bipush 1
      // 5e4: goto 5e8
      // 5e7: bipush 0
      // 5e8: istore 51
      // 5ea: iload 40
      // 5ec: aload 27
      // 5ee: ifnull 629
      // 5f1: ifne 628
      // 5f4: goto 602
      // 5f7: ldc2_w 7883867468209424629
      // 5fa: lload 8
      // 5fc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 601: athrow
      // 602: iload 51
      // 604: aload 27
      // 606: ifnull 629
      // 609: goto 617
      // 60c: ldc2_w 7883867468209424629
      // 60f: lload 8
      // 611: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 616: athrow
      // 617: ifeq 62c
      // 61a: goto 628
      // 61d: ldc2_w 7883867468209424629
      // 620: lload 8
      // 622: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 627: athrow
      // 628: bipush 1
      // 629: goto 62d
      // 62c: bipush 0
      // 62d: istore 40
      // 62f: iload 51
      // 631: lload 8
      // 633: lconst_0
      // 634: lcmp
      // 635: ifle 650
      // 638: aload 27
      // 63a: ifnull 650
      // 63d: ifne 720
      // 640: goto 64e
      // 643: ldc2_w 7883867468209424629
      // 646: lload 8
      // 648: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64d: athrow
      // 64e: iload 50
      // 650: ifne 720
      // 653: aload 39
      // 655: lload 8
      // 657: lconst_0
      // 658: lcmp
      // 659: iflt 682
      // 65c: aload 27
      // 65e: ifnull 682
      // 661: goto 66f
      // 664: ldc2_w 7883867468209424629
      // 667: lload 8
      // 669: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66e: athrow
      // 66f: ifnull 715
      // 672: goto 680
      // 675: ldc2_w 7883867468209424629
      // 678: lload 8
      // 67a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67f: athrow
      // 680: aload 39
      // 682: sipush 19426
      // 685: ldc2_w 1498835330687338253
      // 688: lload 8
      // 68a: lxor
      // 68b: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 690: invokevirtual java/lang/String.indexOf (I)I
      // 693: aload 27
      // 695: lload 8
      // 697: lconst_0
      // 698: lcmp
      // 699: ifle 6c3
      // 69c: ifnull 6c1
      // 69f: bipush -1
      // 6a0: if_icmpgt 707
      // 6a3: goto 6b1
      // 6a6: ldc2_w 7883867468209424629
      // 6a9: lload 8
      // 6ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b0: athrow
      // 6b1: iload 38
      // 6b3: goto 6c1
      // 6b6: ldc2_w 7883867468209424629
      // 6b9: lload 8
      // 6bb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c0: athrow
      // 6c1: aload 27
      // 6c3: lload 8
      // 6c5: lconst_0
      // 6c6: lcmp
      // 6c7: iflt 6f3
      // 6ca: ifnull 6f1
      // 6cd: ifne 707
      // 6d0: goto 6de
      // 6d3: ldc2_w 7883867468209424629
      // 6d6: lload 8
      // 6d8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6dd: athrow
      // 6de: aload 37
      // 6e0: invokevirtual java/lang/StringBuilder.length ()I
      // 6e3: goto 6f1
      // 6e6: ldc2_w 7883867468209424629
      // 6e9: lload 8
      // 6eb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f0: athrow
      // 6f1: aload 27
      // 6f3: ifnull 71e
      // 6f6: ifne 715
      // 6f9: goto 707
      // 6fc: ldc2_w 7883867468209424629
      // 6ff: lload 8
      // 701: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 706: athrow
      // 707: aload 37
      // 709: aload 39
      // 70b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70e: pop
      // 70f: aconst_null
      // 710: astore 39
      // 712: bipush 0
      // 713: istore 38
      // 715: aload 37
      // 717: aload 47
      // 719: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71c: pop
      // 71d: bipush 1
      // 71e: istore 38
      // 720: aload 27
      // 722: lload 8
      // 724: lconst_0
      // 725: lcmp
      // 726: iflt 92f
      // 729: ifnonnull 92a
      // 72c: iload 44
      // 72e: goto 73c
      // 731: ldc2_w 7883867468209424629
      // 734: lload 8
      // 736: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73b: athrow
      // 73c: aload 27
      // 73e: ifnull 765
      // 741: iload 43
      // 743: bipush 1
      // 744: isub
      // 745: if_icmpge 777
      // 748: goto 756
      // 74b: ldc2_w 7883867468209424629
      // 74e: lload 8
      // 750: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 755: athrow
      // 756: bipush 1
      // 757: goto 765
      // 75a: ldc2_w 7883867468209424629
      // 75d: lload 8
      // 75f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 764: athrow
      // 765: istore 42
      // 767: aload 45
      // 769: astore 39
      // 76b: aload 27
      // 76d: lload 8
      // 76f: lconst_0
      // 770: lcmp
      // 771: ifle 92f
      // 774: ifnonnull 92a
      // 777: aload 39
      // 779: lload 8
      // 77b: lconst_0
      // 77c: lcmp
      // 77d: iflt 7a6
      // 780: aload 27
      // 782: ifnull 7a6
      // 785: goto 793
      // 788: ldc2_w 7883867468209424629
      // 78b: lload 8
      // 78d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 792: athrow
      // 793: ifnull 922
      // 796: goto 7a4
      // 799: ldc2_w 7883867468209424629
      // 79c: lload 8
      // 79e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a3: athrow
      // 7a4: aload 39
      // 7a6: sipush 24575
      // 7a9: ldc2_w 3422174626988004114
      // 7ac: lload 8
      // 7ae: lxor
      // 7af: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b4: invokevirtual java/lang/String.indexOf (I)I
      // 7b7: aload 27
      // 7b9: ifnull 84a
      // 7bc: bipush -1
      // 7bd: if_icmpgt 832
      // 7c0: goto 7ce
      // 7c3: ldc2_w 7883867468209424629
      // 7c6: lload 8
      // 7c8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cd: athrow
      // 7ce: iload 38
      // 7d0: aload 27
      // 7d2: lload 8
      // 7d4: lconst_0
      // 7d5: lcmp
      // 7d6: ifle 84c
      // 7d9: ifnull 84a
      // 7dc: goto 7ea
      // 7df: ldc2_w 7883867468209424629
      // 7e2: lload 8
      // 7e4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e9: athrow
      // 7ea: lload 8
      // 7ec: lconst_0
      // 7ed: lcmp
      // 7ee: iflt 83c
      // 7f1: ifne 832
      // 7f4: goto 802
      // 7f7: ldc2_w 7883867468209424629
      // 7fa: lload 8
      // 7fc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 801: athrow
      // 802: aload 37
      // 804: aload 27
      // 806: ifnull 929
      // 809: goto 817
      // 80c: ldc2_w 7883867468209424629
      // 80f: lload 8
      // 811: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 816: athrow
      // 817: lload 8
      // 819: lconst_0
      // 81a: lcmp
      // 81b: ifle 924
      // 81e: invokevirtual java/lang/StringBuilder.length ()I
      // 821: ifne 922
      // 824: goto 832
      // 827: ldc2_w 7883867468209424629
      // 82a: lload 8
      // 82c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 831: athrow
      // 832: aload 39
      // 834: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 837: ldc ","
      // 839: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 83c: goto 84a
      // 83f: ldc2_w 7883867468209424629
      // 842: lload 8
      // 844: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 849: athrow
      // 84a: aload 27
      // 84c: lload 8
      // 84e: lconst_0
      // 84f: lcmp
      // 850: ifle 881
      // 853: ifnull 87f
      // 856: ifeq 914
      // 859: goto 867
      // 85c: ldc2_w 7883867468209424629
      // 85f: lload 8
      // 861: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 866: athrow
      // 867: aload 45
      // 869: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 86c: ldc ","
      // 86e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 871: goto 87f
      // 874: ldc2_w 7883867468209424629
      // 877: lload 8
      // 879: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87e: athrow
      // 87f: aload 27
      // 881: ifnull 8b6
      // 884: ifeq 914
      // 887: goto 895
      // 88a: ldc2_w 7883867468209424629
      // 88d: lload 8
      // 88f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 894: athrow
      // 895: aload 39
      // 897: sipush 27859
      // 89a: ldc2_w 6434609052575965245
      // 89d: lload 8
      // 89f: lxor
      // 8a0: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a5: invokevirtual java/lang/String.lastIndexOf (I)I
      // 8a8: goto 8b6
      // 8ab: ldc2_w 7883867468209424629
      // 8ae: lload 8
      // 8b0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b5: athrow
      // 8b6: istore 47
      // 8b8: new java/lang/StringBuilder
      // 8bb: dup
      // 8bc: invokespecial java/lang/StringBuilder.<init> ()V
      // 8bf: lload 8
      // 8c1: lconst_0
      // 8c2: lcmp
      // 8c3: iflt 8d6
      // 8c6: aload 39
      // 8c8: bipush 0
      // 8c9: iload 47
      // 8cb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 8ce: aload 27
      // 8d0: ifnull 907
      // 8d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d6: iload 47
      // 8d8: aload 39
      // 8da: invokevirtual java/lang/String.length ()I
      // 8dd: bipush 2
      // 8de: isub
      // 8df: if_icmpge 90a
      // 8e2: goto 8f0
      // 8e5: ldc2_w 7883867468209424629
      // 8e8: lload 8
      // 8ea: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ef: athrow
      // 8f0: aload 39
      // 8f2: iload 47
      // 8f4: bipush 1
      // 8f5: iadd
      // 8f6: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 8f9: goto 907
      // 8fc: ldc2_w 7883867468209424629
      // 8ff: lload 8
      // 901: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 906: athrow
      // 907: goto 90c
      // 90a: ldc ""
      // 90c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 912: astore 39
      // 914: aload 37
      // 916: aload 39
      // 918: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91b: pop
      // 91c: aconst_null
      // 91d: astore 39
      // 91f: bipush 0
      // 920: istore 38
      // 922: aload 37
      // 924: aload 45
      // 926: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 929: pop
      // 92a: iinc 44 1
      // 92d: aload 27
      // 92f: ifnonnull 49b
      // 932: aload 37
      // 934: lload 8
      // 936: lconst_0
      // 937: lcmp
      // 938: ifle 4ab
      // 93b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93e: astore 44
      // 940: aload 4
      // 942: aload 44
      // 944: invokevirtual java/lang/String.length ()I
      // 947: aload 27
      // 949: ifnull 9ba
      // 94c: ifeq 9b9
      // 94f: goto 95d
      // 952: ldc2_w 7883867468209424629
      // 955: lload 8
      // 957: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95c: athrow
      // 95d: aload 44
      // 95f: invokevirtual java/lang/String.length ()I
      // 962: aload 27
      // 964: lload 8
      // 966: lconst_0
      // 967: lcmp
      // 968: ifle 9a5
      // 96b: ifnull 9a3
      // 96e: goto 97c
      // 971: ldc2_w 7883867468209424629
      // 974: lload 8
      // 976: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97b: athrow
      // 97c: bipush 1
      // 97d: if_icmpne 9bd
      // 980: goto 98e
      // 983: ldc2_w 7883867468209424629
      // 986: lload 8
      // 988: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98d: athrow
      // 98e: aload 44
      // 990: ldc ";"
      // 992: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 995: goto 9a3
      // 998: ldc2_w 7883867468209424629
      // 99b: lload 8
      // 99d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a2: athrow
      // 9a3: aload 27
      // 9a5: ifnull 9ba
      // 9a8: ifeq 9bd
      // 9ab: goto 9b9
      // 9ae: ldc2_w 7883867468209424629
      // 9b1: lload 8
      // 9b3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b8: athrow
      // 9b9: bipush 1
      // 9ba: goto 9be
      // 9bd: bipush 0
      // 9be: invokevirtual com/zelix/xx.Q (Z)V
      // 9c1: iload 6
      // 9c3: aload 27
      // 9c5: lload 8
      // 9c7: lconst_0
      // 9c8: lcmp
      // 9c9: iflt 9e4
      // 9cc: ifnull 9e2
      // 9cf: ifeq b1e
      // 9d2: goto 9e0
      // 9d5: ldc2_w 7883867468209424629
      // 9d8: lload 8
      // 9da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9df: athrow
      // 9e0: iload 42
      // 9e2: aload 27
      // 9e4: lload 8
      // 9e6: lconst_0
      // 9e7: lcmp
      // 9e8: iflt a0a
      // 9eb: ifnull a01
      // 9ee: ifeq b1e
      // 9f1: goto 9ff
      // 9f4: ldc2_w 7883867468209424629
      // 9f7: lload 8
      // 9f9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9fe: athrow
      // 9ff: iload 40
      // a01: lload 8
      // a03: lconst_0
      // a04: lcmp
      // a05: ifle a20
      // a08: aload 27
      // a0a: ifnull a20
      // a0d: ifne a23
      // a10: goto a1e
      // a13: ldc2_w 7883867468209424629
      // a16: lload 8
      // a18: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1d: athrow
      // a1e: iload 41
      // a20: ifeq b1e
      // a23: aload 7
      // a25: sipush 2462
      // a28: ldc2_w 8133436203930321783
      // a2b: lload 8
      // a2d: lxor
      // a2e: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a33: new java/lang/StringBuilder
      // a36: dup
      // a37: invokespecial java/lang/StringBuilder.<init> ()V
      // a3a: sipush 13108
      // a3d: ldc2_w 3949011742384568798
      // a40: lload 8
      // a42: lxor
      // a43: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a48: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a4b: aload 2
      // a4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a4f: sipush 6229
      // a52: ldc2_w 1305221012967461554
      // a55: lload 8
      // a57: lxor
      // a58: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a60: lload 19
      // a62: aload 10
      // a64: invokestatic com/zelix/lr.X (JLjava/lang/String;)Ljava/lang/String;
      // a67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6a: sipush 25821
      // a6d: ldc2_w 3390195915217792574
      // a70: lload 8
      // a72: lxor
      // a73: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a7b: aload 1
      // a7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a7f: aload 44
      // a81: aload 27
      // a83: ifnull ae2
      // a86: goto a94
      // a89: ldc2_w 7883867468209424629
      // a8c: lload 8
      // a8e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a93: athrow
      // a94: invokevirtual java/lang/String.length ()I
      // a97: lload 8
      // a99: lconst_0
      // a9a: lcmp
      // a9b: ifle ae8
      // a9e: ifle ae5
      // aa1: goto aaf
      // aa4: ldc2_w 7883867468209424629
      // aa7: lload 8
      // aa9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aae: athrow
      // aaf: new java/lang/StringBuilder
      // ab2: dup
      // ab3: invokespecial java/lang/StringBuilder.<init> ()V
      // ab6: sipush 3007
      // ab9: ldc2_w 333300831523701081
      // abc: lload 8
      // abe: lxor
      // abf: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ac7: aload 44
      // ac9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // acc: ldc "'"
      // ace: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ad1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ad4: goto ae2
      // ad7: ldc2_w 7883867468209424629
      // ada: lload 8
      // adc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae1: athrow
      // ae2: goto af3
      // ae5: sipush 26762
      // ae8: ldc2_w 994606072879800938
      // aeb: lload 8
      // aed: lxor
      // aee: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // af9: lload 11
      // afb: dup2_x2
      // afc: pop2
      // afd: bipush 3
      // afe: anewarray 544
      // b01: dup_x1
      // b02: swap
      // b03: bipush 2
      // b04: swap
      // b05: aastore
      // b06: dup_x1
      // b07: swap
      // b08: bipush 1
      // b09: swap
      // b0a: aastore
      // b0b: dup_x2
      // b0c: dup_x2
      // b0d: pop
      // b0e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b11: bipush 0
      // b12: swap
      // b13: aastore
      // b14: ldc2_w 8178492447962872295
      // b17: lload 8
      // b19: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1e: new java/lang/StringBuilder
      // b21: dup
      // b22: invokespecial java/lang/StringBuilder.<init> ()V
      // b25: aload 28
      // b27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2a: aload 44
      // b2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b32: areturn
   }

   protected static String M(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      _8s var4 = (_8s)var0[2];
      var2 = b ^ var2;
      long var5 = var2 ^ 97664551170652L;
      return x44.a<"q">(new Object[]{var1, var5, var4, new xx()}, 7477475187973658238L, var2);
   }

   final String g(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/su.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 133248445053368
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 7821807164304029967
      // 25: lload 3
      // 26: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 0
      // 2c: ldc2_w 7702615668539013373
      // 2f: lload 3
      // 30: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/qd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: lload 5
      // 37: aload 2
      // 38: bipush 2
      // 39: anewarray 544
      // 3c: dup_x1
      // 3d: swap
      // 3e: bipush 1
      // 3f: swap
      // 40: aastore
      // 41: dup_x2
      // 42: dup_x2
      // 43: pop
      // 44: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47: bipush 0
      // 48: swap
      // 49: aastore
      // 4a: ldc2_w 8630655804381109123
      // 4d: lload 3
      // 4e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: astore 8
      // 55: astore 7
      // 57: aload 8
      // 59: ifnull c8
      // 5c: new java/lang/StringBuilder
      // 5f: dup
      // 60: invokespecial java/lang/StringBuilder.<init> ()V
      // 63: astore 9
      // 65: bipush 0
      // 66: istore 10
      // 68: iload 10
      // 6a: aload 8
      // 6c: invokeinterface java/util/List.size ()I 1
      // 71: if_icmpge bc
      // 74: aload 8
      // 76: iload 10
      // 78: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7d: checkcast java/lang/String
      // 80: aload 7
      // 82: ifnull c7
      // 85: astore 11
      // 87: aload 7
      // 89: lload 3
      // 8a: lconst_0
      // 8b: lcmp
      // 8c: ifle b9
      // 8f: ifnull b7
      // 92: iload 10
      // 94: ifle ac
      // 97: goto a4
      // 9a: ldc2_w 7615066547211177010
      // 9d: lload 3
      // 9e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 11
      // a6: bipush 1
      // a7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // aa: astore 11
      // ac: aload 9
      // ae: aload 11
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: pop
      // b4: iinc 10 1
      // b7: aload 7
      // b9: ifnonnull 68
      // bc: aload 9
      // be: lload 3
      // bf: lconst_0
      // c0: lcmp
      // c1: iflt 7d
      // c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c7: areturn
      // c8: aconst_null
      // c9: areturn
   }

   final String S(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/su.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 76790383920656
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -3232290630935263577
      // 25: lload 3
      // 26: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 0
      // 2c: ldc2_w -3076788931902732459
      // 2f: lload 3
      // 30: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/qd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: lload 5
      // 37: aload 2
      // 38: bipush 2
      // 39: anewarray 544
      // 3c: dup_x1
      // 3d: swap
      // 3e: bipush 1
      // 3f: swap
      // 40: aastore
      // 41: dup_x2
      // 42: dup_x2
      // 43: pop
      // 44: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47: bipush 0
      // 48: swap
      // 49: aastore
      // 4a: ldc2_w -4004259319050066901
      // 4d: lload 3
      // 4e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: astore 8
      // 55: astore 7
      // 57: aload 8
      // 59: ifnull ec
      // 5c: new java/lang/StringBuilder
      // 5f: dup
      // 60: invokespecial java/lang/StringBuilder.<init> ()V
      // 63: astore 9
      // 65: bipush 0
      // 66: istore 10
      // 68: iload 10
      // 6a: aload 8
      // 6c: invokeinterface java/util/List.size ()I 1
      // 71: if_icmpge e6
      // 74: aload 8
      // 76: iload 10
      // 78: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7d: checkcast java/lang/String
      // 80: lload 3
      // 81: lconst_0
      // 82: lcmp
      // 83: ifle eb
      // 86: astore 11
      // 88: aload 9
      // 8a: aload 11
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: aload 7
      // 91: ifnull e8
      // 94: pop
      // 95: aload 7
      // 97: lload 3
      // 98: lconst_0
      // 99: lcmp
      // 9a: iflt e3
      // 9d: ifnull e1
      // a0: goto ad
      // a3: ldc2_w -3024701191066078310
      // a6: lload 3
      // a7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: iload 10
      // af: aload 8
      // b1: invokeinterface java/util/List.size ()I 1
      // b6: bipush 1
      // b7: isub
      // b8: if_icmpge de
      // bb: goto c8
      // be: ldc2_w -3024701191066078310
      // c1: lload 3
      // c2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 9
      // ca: getstatic com/zelix/mc.R Ljava/lang/String;
      // cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d0: pop
      // d1: goto de
      // d4: ldc2_w -3024701191066078310
      // d7: lload 3
      // d8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: athrow
      // de: iinc 10 1
      // e1: aload 7
      // e3: ifnonnull 68
      // e6: aload 9
      // e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // eb: areturn
      // ec: aconst_null
      // ed: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String N(Object[] var0) {
      long var5 = (Long)var0[0];
      String var1 = (String)var0[1];
      _8s var4 = (_8s)var0[2];
      boolean var2 = (Boolean)var0[3];
      xx var3 = (xx)var0[4];
      var5 = b ^ var5;
      String[] var10000 = x44.a<"q">(-3964092912847037057L, var5);
      String var8 = var1.trim().replace((char)c<"a">(20024, 8745212239836521065L ^ var5), (char)c<"a">(9919, 1592696292346677992L ^ var5));
      String var9 = (String)x44.a<"i">(var4, var8, -3070644589946034182L, var5);
      String[] var7 = var10000;

      label55: {
         label51: {
            label44: {
               try {
                  var10000 = var9;
                  if (var7 == null) {
                     break label44;
                  }

                  if (var9 != null) {
                     break label51;
                  }
               } catch (gj var13) {
                  throw x44.a<"q">(var13, -3612391582766847934L, var5);
               }

               var10000 = var8;
            }

            var9 = var10000;

            try {
               var3.Q(false);
               if (var5 <= 0L || var7 != null) {
                  break label55;
               }
            } catch (gj var12) {
               boolean var10001 = false;
               throw x44.a<"q">(var12, -3612391582766847934L, var5);
            }
         }

         try {
            var3.Q(true);
         } catch (gj var11) {
            boolean var17 = false;
            throw x44.a<"q">(var11, -3612391582766847934L, var5);
         }
      }

      try {
         return var2 ? var9.replace((char)c<"a">(9919, 1592696292346677992L ^ var5), (char)c<"a">(20024, 8745212239836521065L ^ var5)) : var9;
      } catch (gj var10) {
         throw x44.a<"q">(var10, -3612391582766847934L, var5);
      }
   }

   static {
      long var20 = b ^ 19238964639068L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "Ef\u00ad¬\u0012}áá\u0002M©ïmNKñ\u0010\u001d³Q\u00994\fêÊ\u0089ùÊ\u0006,,r¾hûhû\u00824À\u0005éû\b,º\u009a\u0089'É\u0019ñåXÉ¢Ú÷È·m\u0005\u0097éh«)\u0089{ò\u0007Ùqó-ïSøàt¨ë&³_½\u0084\tq{¢\u008dçBÍgæáÁZe>Æ\u0011,ôC$û\u009e\u0013î³\u0099I7ªªÈ\u009cÄ\u0081âö\u0000fþÍÛ\u0016\u0098|(\u008e©ªø9(_ý6%ý\u009cÿäïÏ³hªßû/:zF¸7ut¿\u008c\u0084\u008c\u0093\u0092zÓóër\u009cambEÙ@rÂ5±ü_ì¤\u008b\u009a¬¹ \r0<Ú\u0087Ò¾³\bÙ\u001d<¸»\u0007i¸¨É\u0094ðëu\u0013¸\t\u0080=\u0091PJ\u001dy\u0098M+fwÞ'»fTC£?ûÙ¸ü&\u0010ªrì@&þ£\u0013ÆÝ#aà1\u0003\b(o40\u0097ëZÏÿÇIsËL\u009a¬\u001fR£â^\u0016´ zKEÊ\u007fþÙÑ\u009a¸È+0¶þTÂ\u0010r\u0091î0à0ü½\u001c>üPÜÓä+8â\u0002lr\u0003+Ú\u008f[Pl«?Ô\u001c\u0006W\u0086\u008e¹ÞJqSg\u0091ÝêÙÖ\u0014\u0017YQcMr¯\tÜn+\u0011Îbw\u001ao\u009ehQ_×¬&\u0004xæ\u000b6\u0097\u0011?ÁGÞ\u0088\u0086Z\u0090\u0015SÇ#\u0086k\u001b>W3ÿãvJbw´\u001b\u0090.I¦¾Û.Ö\u008d\u0090øq`b+fWýV¸\u0094 0z\u0003K\u0005#w\r=ªé\u00add\u009c\u0002%Û~þp\r*\t\u0006üc2\u0096:\u009e_\u0007\u008f^+»åHBç\u0018\u0099+\n\u0019¶&«DiÚ-\u0003m¹ïÀæ\u0018`\u0081\u0097\u0004Ý§\u0007\u0010 \u0007aÒ]\u0095&Ì\u008d°ß¤âÆÜàjgø\u009eÍ\u001e¤4{»\u0096\tü\u0093\u000703HA«Xªx\u0091µ\u00927>d£©¯«+Î¢§gðl\u0088\u009d&É\u0018&\u001d\u009cP£l\u0091!áúR8õ\u000b=}{\u009e@÷3\u000f\u009bõ±?±\u001cr¯ß¶Üa¨yvËsäì\u0017\u0007\u0013\u0086\u0010«$ÿ\u0010ÏÒn[e¬ñÿk¶úÕ";
      int var17 = "Ef\u00ad¬\u0012}áá\u0002M©ïmNKñ\u0010\u001d³Q\u00994\fêÊ\u0089ùÊ\u0006,,r¾hûhû\u00824À\u0005éû\b,º\u009a\u0089'É\u0019ñåXÉ¢Ú÷È·m\u0005\u0097éh«)\u0089{ò\u0007Ùqó-ïSøàt¨ë&³_½\u0084\tq{¢\u008dçBÍgæáÁZe>Æ\u0011,ôC$û\u009e\u0013î³\u0099I7ªªÈ\u009cÄ\u0081âö\u0000fþÍÛ\u0016\u0098|(\u008e©ªø9(_ý6%ý\u009cÿäïÏ³hªßû/:zF¸7ut¿\u008c\u0084\u008c\u0093\u0092zÓóër\u009cambEÙ@rÂ5±ü_ì¤\u008b\u009a¬¹ \r0<Ú\u0087Ò¾³\bÙ\u001d<¸»\u0007i¸¨É\u0094ðëu\u0013¸\t\u0080=\u0091PJ\u001dy\u0098M+fwÞ'»fTC£?ûÙ¸ü&\u0010ªrì@&þ£\u0013ÆÝ#aà1\u0003\b(o40\u0097ëZÏÿÇIsËL\u009a¬\u001fR£â^\u0016´ zKEÊ\u007fþÙÑ\u009a¸È+0¶þTÂ\u0010r\u0091î0à0ü½\u001c>üPÜÓä+8â\u0002lr\u0003+Ú\u008f[Pl«?Ô\u001c\u0006W\u0086\u008e¹ÞJqSg\u0091ÝêÙÖ\u0014\u0017YQcMr¯\tÜn+\u0011Îbw\u001ao\u009ehQ_×¬&\u0004xæ\u000b6\u0097\u0011?ÁGÞ\u0088\u0086Z\u0090\u0015SÇ#\u0086k\u001b>W3ÿãvJbw´\u001b\u0090.I¦¾Û.Ö\u008d\u0090øq`b+fWýV¸\u0094 0z\u0003K\u0005#w\r=ªé\u00add\u009c\u0002%Û~þp\r*\t\u0006üc2\u0096:\u009e_\u0007\u008f^+»åHBç\u0018\u0099+\n\u0019¶&«DiÚ-\u0003m¹ïÀæ\u0018`\u0081\u0097\u0004Ý§\u0007\u0010 \u0007aÒ]\u0095&Ì\u008d°ß¤âÆÜàjgø\u009eÍ\u001e¤4{»\u0096\tü\u0093\u000703HA«Xªx\u0091µ\u00927>d£©¯«+Î¢§gðl\u0088\u009d&É\u0018&\u001d\u009cP£l\u0091!áúR8õ\u000b=}{\u009e@÷3\u000f\u009bõ±?±\u001cr¯ß¶Üa¨yvËsäì\u0017\u0007\u0013\u0086\u0010«$ÿ\u0010ÏÒn[e¬ñÿk¶úÕ"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     c = var18;
                     d = new String[15];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "C4ä@\t\u0087\u0098ð\u0090ð\u0000Ñd\u0012\u008eë-\u009abæÕô\u0015\u0010á·^ò¼\u0092ê\u008eé\u001cß÷E3\u0099ò/YP§Æ}eº!§tG³õÙ$D\"é\u009a¿oSWI\u001aS°3\u000bÔq\u0006è\u0091Û\u009f\u0000\u0013X";
                     int var5 = "C4ä@\t\u0087\u0098ð\u0090ð\u0000Ñd\u0012\u008eë-\u009abæÕô\u0015\u0010á·^ò¼\u0092ê\u008eé\u001cß÷E3\u0099ò/YP§Æ}eº!§tG³õÙ$D\"é\u009a¿oSWI\u001aS°3\u000bÔq\u0006è\u0091Û\u009f\u0000\u0013X"
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
                                    i = var6;
                                    j = new Integer[12];
                                    x44.a<"u">("&", -8491016422806218479L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "E£W¶üfÙè\u0014\u0019çzV\u0096Ã;";
                                 var5 = "E£W¶üfÙè\u0014\u0019çzV\u0096Ã;".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "\u0082\u00ad\bÓ§ú\u008eäñ\u0082\u009fÏÿi]ú@\u008b¶ÛõÔ¼pWþðfÇ\n RÎÉÈh¸wÌ\r\u0085#H=FT\u0013\tè\u008d\u001c'Oå\u0098Eçì\u001952p¦]\u0017\"\u0087\u009a;nÀØ\u0001Ç>\u0090`(\u008ao=";
                  var17 = "\u0082\u00ad\bÓ§ú\u008eäñ\u0082\u009fÏÿi]ú@\u008b¶ÛõÔ¼pWþðfÇ\n RÎÉÈh¸wÌ\r\u0085#H=FT\u0013\tè\u008d\u001c'Oå\u0098Eçì\u001952p¦]\u0017\"\u0087\u009a;nÀØ\u0001Ç>\u0090`(\u008ao="
                     .length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   final boolean X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"m">(this, 2121910870613797652L, var2);
   }

   final String u(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/su.b J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: ldc2_w -8115211978008913181
      // 01d: lload 2
      // 01e: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 4
      // 025: invokevirtual java/lang/String.length ()I
      // 028: istore 6
      // 02a: astore 5
      // 02c: iload 6
      // 02e: aload 5
      // 030: ifnull 05e
      // 033: sipush 12195
      // 036: ldc2_w 7183816293487084644
      // 039: lload 2
      // 03a: lxor
      // 03b: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: if_icmple 145
      // 043: goto 050
      // 046: ldc2_w -8484083289118642210
      // 049: lload 2
      // 04a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: bipush 0
      // 051: goto 05e
      // 054: ldc2_w -8484083289118642210
      // 057: lload 2
      // 058: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: istore 7
      // 060: sipush 13130
      // 063: ldc2_w 8277941630622668930
      // 066: lload 2
      // 067: lxor
      // 068: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: istore 8
      // 06f: new java/lang/StringBuilder
      // 072: dup
      // 073: aload 4
      // 075: iload 7
      // 077: iload 8
      // 079: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 07c: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 07f: astore 9
      // 081: iload 6
      // 083: iload 8
      // 085: isub
      // 086: sipush 29120
      // 089: ldc2_w 6369970959666043401
      // 08c: lload 2
      // 08d: lxor
      // 08e: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: if_icmple 0fc
      // 096: iload 8
      // 098: istore 7
      // 09a: iload 7
      // 09c: sipush 13130
      // 09f: ldc2_w 8277941630622668930
      // 0a2: lload 2
      // 0a3: lxor
      // 0a4: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: iadd
      // 0aa: bipush 1
      // 0ab: isub
      // 0ac: istore 8
      // 0ae: aload 9
      // 0b0: getstatic com/zelix/mc.R Ljava/lang/String;
      // 0b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b6: pop
      // 0b7: aload 9
      // 0b9: sipush 22866
      // 0bc: ldc2_w 8026256656239358620
      // 0bf: lload 2
      // 0c0: lxor
      // 0c1: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c9: pop
      // 0ca: aload 9
      // 0cc: aload 4
      // 0ce: iload 7
      // 0d0: iload 8
      // 0d2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: lload 2
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: ifle 141
      // 0de: pop
      // 0df: aload 5
      // 0e1: ifnull 13f
      // 0e4: aload 5
      // 0e6: ifnonnull 081
      // 0e9: lload 2
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 0df
      // 0ef: goto 0fc
      // 0f2: ldc2_w -8484083289118642210
      // 0f5: lload 2
      // 0f6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 132
      // 102: iload 8
      // 104: iload 6
      // 106: if_icmpge 13f
      // 109: aload 9
      // 10b: getstatic com/zelix/mc.R Ljava/lang/String;
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: pop
      // 112: aload 9
      // 114: sipush 7942
      // 117: ldc2_w 2130812490725700809
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 124: pop
      // 125: aload 9
      // 127: aload 4
      // 129: iload 8
      // 12b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: pop
      // 132: goto 13f
      // 135: ldc2_w -8484083289118642210
      // 138: lload 2
      // 139: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: aload 9
      // 141: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 144: areturn
      // 145: aload 4
      // 147: areturn
   }

   abstract void O(Object[] var1);

   su(long param1, BufferedReader param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/su.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 130074866063068
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 82296129161160
      // 012: lxor
      // 013: lstore 6
      // 015: dup2
      // 016: ldc2_w 4223395016319
      // 019: lxor
      // 01a: lstore 8
      // 01c: pop2
      // 01d: aload 0
      // 01e: invokespecial java/lang/Object.<init> ()V
      // 021: aload 0
      // 022: new com/zelix/qd
      // 025: dup
      // 026: lload 6
      // 028: invokespecial com/zelix/qd.<init> (J)V
      // 02b: ldc2_w 7806452351454953038
      // 02e: lload 1
      // 02f: invokedynamic q (Ljava/lang/Object;Lcom/zelix/qd;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: ldc2_w 7655981939675791292
      // 037: lload 1
      // 038: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: bipush 0
      // 03e: istore 11
      // 040: astore 10
      // 042: aconst_null
      // 043: astore 12
      // 045: aload 3
      // 046: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 049: dup
      // 04a: astore 13
      // 04c: ifnull 19a
      // 04f: aload 10
      // 051: ifnull 1a5
      // 054: aload 13
      // 056: invokevirtual java/lang/String.length ()I
      // 059: aload 10
      // 05b: lload 1
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: ifle 0c2
      // 061: ifnull 0ba
      // 064: goto 071
      // 067: ldc2_w 8006557378707688065
      // 06a: lload 1
      // 06b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: ifne 0ac
      // 074: goto 081
      // 077: ldc2_w 8006557378707688065
      // 07a: lload 1
      // 07b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: iload 11
      // 083: ifne 0ab
      // 086: goto 093
      // 089: ldc2_w 8006557378707688065
      // 08c: lload 1
      // 08d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 10
      // 095: ifnonnull 045
      // 098: lload 1
      // 099: lconst_0
      // 09a: lcmp
      // 09b: ifle 04f
      // 09e: goto 0ab
      // 0a1: ldc2_w 8006557378707688065
      // 0a4: lload 1
      // 0a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: return
      // 0ac: aload 13
      // 0ae: ldc2_w 8254962924455289271
      // 0b1: lload 1
      // 0b2: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ba: lload 1
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 11b
      // 0c0: aload 10
      // 0c2: ifnull 11b
      // 0c5: ifeq 0fa
      // 0c8: goto 0d5
      // 0cb: ldc2_w 8006557378707688065
      // 0ce: lload 1
      // 0cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iload 11
      // 0d7: ifne 0f9
      // 0da: goto 0e7
      // 0dd: ldc2_w 8006557378707688065
      // 0e0: lload 1
      // 0e1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 10
      // 0e9: ifnonnull 045
      // 0ec: goto 0f9
      // 0ef: ldc2_w 8006557378707688065
      // 0f2: lload 1
      // 0f3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: return
      // 0fa: bipush 1
      // 0fb: istore 11
      // 0fd: lload 1
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 18f
      // 103: aload 13
      // 105: aload 10
      // 107: ifnull 18d
      // 10a: bipush 0
      // 10b: invokevirtual java/lang/String.charAt (I)C
      // 10e: goto 11b
      // 111: ldc2_w 8006557378707688065
      // 114: lload 1
      // 115: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: sipush 7942
      // 11e: ldc2_w 2130853649189786006
      // 121: lload 1
      // 122: lxor
      // 123: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: if_icmpne 16d
      // 12b: aload 0
      // 12c: ldc2_w 7806452351454953038
      // 12f: lload 1
      // 130: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: aload 12
      // 137: lload 4
      // 139: aload 13
      // 13b: bipush 3
      // 13c: anewarray 544
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 2
      // 142: swap
      // 143: aastore
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 8096767351897246889
      // 155: lload 1
      // 156: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 10
      // 15d: ifnonnull 045
      // 160: goto 16d
      // 163: ldc2_w 8006557378707688065
      // 166: lload 1
      // 167: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 0
      // 16e: aload 13
      // 170: lload 8
      // 172: bipush 2
      // 173: anewarray 544
      // 176: dup_x2
      // 177: dup_x2
      // 178: pop
      // 179: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17c: bipush 1
      // 17d: swap
      // 17e: aastore
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 0
      // 182: swap
      // 183: aastore
      // 184: ldc2_w 8263969295761876648
      // 187: lload 1
      // 188: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: astore 12
      // 18f: lload 1
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 1a5
      // 195: aload 10
      // 197: ifnonnull 045
      // 19a: aload 0
      // 19b: bipush 1
      // 19c: ldc2_w 8034959165767932391
      // 19f: lload 1
      // 1a0: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: return
   }

   public static boolean V(Object[] param0) {
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
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 3
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 1
      // 1a: pop
      // 1b: getstatic com/zelix/su.b J
      // 1e: lload 1
      // 1f: lxor
      // 20: lstore 1
      // 21: ldc2_w 633258226643377482
      // 24: lload 1
      // 25: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: new java/util/StringTokenizer
      // 2d: dup
      // 2e: aload 4
      // 30: aload 3
      // 31: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 34: astore 6
      // 36: astore 5
      // 38: aload 6
      // 3a: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 3d: ifeq 8a
      // 40: aload 6
      // 42: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 45: astore 7
      // 47: aload 7
      // 49: bipush 0
      // 4a: invokevirtual java/lang/String.charAt (I)C
      // 4d: ldc2_w 783434740605995016
      // 50: lload 1
      // 51: invokedynamic t (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: aload 5
      // 58: lload 1
      // 59: lconst_0
      // 5a: lcmp
      // 5b: iflt 63
      // 5e: ifnull 8b
      // 61: aload 5
      // 63: ifnull 84
      // 66: goto 73
      // 69: ldc2_w 1002978362607921271
      // 6c: lload 1
      // 6d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: ifne 85
      // 76: goto 83
      // 79: ldc2_w 1002978362607921271
      // 7c: lload 1
      // 7d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: bipush 0
      // 84: ireturn
      // 85: aload 5
      // 87: ifnonnull 38
      // 8a: bipush 1
      // 8b: ireturn
   }

   private String c(Object[] param1) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/su.b J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 792034331068
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 54549306905816
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 79139189558629
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 72790463305117
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: ldc2_w 7510813216152124856
      // 03a: lload 3
      // 03b: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 2
      // 041: ldc ":"
      // 043: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 046: istore 14
      // 048: astore 13
      // 04a: iload 14
      // 04c: aload 13
      // 04e: ifnull 063
      // 051: ifle 06c
      // 054: goto 061
      // 057: ldc2_w 7861391943719684229
      // 05a: lload 3
      // 05b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: iload 14
      // 063: aload 2
      // 064: invokevirtual java/lang/String.length ()I
      // 067: bipush 1
      // 068: isub
      // 069: if_icmpne 0d6
      // 06c: new com/zelix/_sf
      // 06f: dup
      // 070: new java/lang/StringBuilder
      // 073: dup
      // 074: invokespecial java/lang/StringBuilder.<init> ()V
      // 077: sipush 6553
      // 07a: ldc2_w 6320499151271400194
      // 07d: lload 3
      // 07e: lxor
      // 07f: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 087: aload 2
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: sipush 13396
      // 08e: ldc2_w 8042989581108002502
      // 091: lload 3
      // 092: lxor
      // 093: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: aload 2
      // 09c: ldc2_w 8195358644649693087
      // 09f: lload 3
      // 0a0: invokedynamic n (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: lload 11
      // 0a7: bipush 2
      // 0a8: anewarray 544
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: ldc2_w 8278034586205076572
      // 0bc: lload 3
      // 0bd: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c8: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 0cb: athrow
      // 0cc: ldc2_w 7861391943719684229
      // 0cf: lload 3
      // 0d0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 2
      // 0d7: bipush 0
      // 0d8: iload 14
      // 0da: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0e0: astore 15
      // 0e2: aload 0
      // 0e3: lload 3
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifle 110
      // 0e9: aload 15
      // 0eb: lload 9
      // 0ed: bipush 2
      // 0ee: anewarray 544
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 1
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w 8335932345238974804
      // 102: lload 3
      // 103: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: aload 13
      // 10a: ifnull 1eb
      // 10d: astore 15
      // 10f: aload 0
      // 110: ldc2_w 7949505198326299722
      // 113: lload 3
      // 114: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/qd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 15
      // 11b: lload 5
      // 11d: bipush 2
      // 11e: anewarray 544
      // 121: dup_x2
      // 122: dup_x2
      // 123: pop
      // 124: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 127: bipush 1
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w 8197608224096426679
      // 132: lload 3
      // 133: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: lload 3
      // 139: lconst_0
      // 13a: lcmp
      // 13b: iflt 153
      // 13e: ifeq 1e3
      // 141: aload 15
      // 143: sipush 4537
      // 146: ldc2_w 7171843824030587693
      // 149: lload 3
      // 14a: lxor
      // 14b: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 153: ifeq 1a3
      // 156: goto 163
      // 159: ldc2_w 7861391943719684229
      // 15c: lload 3
      // 15d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: new com/zelix/_sf
      // 166: dup
      // 167: new java/lang/StringBuilder
      // 16a: dup
      // 16b: invokespecial java/lang/StringBuilder.<init> ()V
      // 16e: sipush 24392
      // 171: ldc2_w 2163012542783346137
      // 174: lload 3
      // 175: lxor
      // 176: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17e: aload 2
      // 17f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 182: sipush 14991
      // 185: ldc2_w 1667807811393499154
      // 188: lload 3
      // 189: lxor
      // 18a: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 195: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 198: athrow
      // 199: ldc2_w 7861391943719684229
      // 19c: lload 3
      // 19d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: new com/zelix/_sf
      // 1a6: dup
      // 1a7: new java/lang/StringBuilder
      // 1aa: dup
      // 1ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ae: sipush 25230
      // 1b1: ldc2_w 1083615684498778128
      // 1b4: lload 3
      // 1b5: lxor
      // 1b6: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: aload 15
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: sipush 17289
      // 1c6: ldc2_w 2250995614146939153
      // 1c9: lload 3
      // 1ca: lxor
      // 1cb: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/su.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d3: aload 2
      // 1d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d7: ldc "'"
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1df: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 1e2: athrow
      // 1e3: aload 2
      // 1e4: iload 14
      // 1e6: bipush 1
      // 1e7: iadd
      // 1e8: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1eb: astore 16
      // 1ed: aload 16
      // 1ef: aload 13
      // 1f1: ifnull 276
      // 1f4: invokevirtual java/lang/String.length ()I
      // 1f7: ifle 244
      // 1fa: goto 207
      // 1fd: ldc2_w 7861391943719684229
      // 200: lload 3
      // 201: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 16
      // 209: aload 13
      // 20b: ifnull 276
      // 20e: goto 21b
      // 211: ldc2_w 7861391943719684229
      // 214: lload 3
      // 215: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: athrow
      // 21b: bipush 0
      // 21c: invokevirtual java/lang/String.charAt (I)C
      // 21f: sipush 7942
      // 222: ldc2_w 2130791734453293970
      // 225: lload 3
      // 226: lxor
      // 227: invokedynamic a (IJ)I bsm=com/zelix/su.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: if_icmpne 244
      // 22f: goto 23c
      // 232: ldc2_w 7861391943719684229
      // 235: lload 3
      // 236: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: athrow
      // 23c: aload 16
      // 23e: bipush 1
      // 23f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 242: astore 16
      // 244: aload 0
      // 245: ldc2_w 7949505198326299722
      // 248: lload 3
      // 249: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/qd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: aload 15
      // 250: lload 7
      // 252: aload 16
      // 254: bipush 3
      // 255: anewarray 544
      // 258: dup_x1
      // 259: swap
      // 25a: bipush 2
      // 25b: swap
      // 25c: aastore
      // 25d: dup_x2
      // 25e: dup_x2
      // 25f: pop
      // 260: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 263: bipush 1
      // 264: swap
      // 265: aastore
      // 266: dup_x1
      // 267: swap
      // 268: bipush 0
      // 269: swap
      // 26a: aastore
      // 26b: ldc2_w 8239679474907532973
      // 26e: lload 3
      // 26f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: aload 15
      // 276: areturn
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26902;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/su", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/su" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12049;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
            throw new RuntimeException("com/zelix/su", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("com/zelix/su" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
