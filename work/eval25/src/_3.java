package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _3 {
   private Map x;
   private final _a[] d;
   private final String I;
   private static final long a = ess.a(-5568240959099781514L, -4471566235955031404L, MethodHandles.lookup().lookupClass()).a(3642094356064L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map e = new HashMap(13);

   public int W(Object[] var1) {
      return this.d.length;
   }

   private int E(Object[] param1) {
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
      // 0c: getstatic com/zelix/_3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 68686744425946
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 98544544685440212
      // 1e: lload 2
      // 1f: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: aload 0
      // 28: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 2b: astore 8
      // 2d: aload 8
      // 2f: arraylength
      // 30: istore 9
      // 32: bipush 0
      // 33: istore 10
      // 35: istore 6
      // 37: iload 10
      // 39: iload 9
      // 3b: if_icmpge b1
      // 3e: aload 8
      // 40: iload 10
      // 42: aaload
      // 43: astore 11
      // 45: iload 6
      // 47: lload 2
      // 48: lconst_0
      // 49: lcmp
      // 4a: iflt ae
      // 4d: ifeq ac
      // 50: aload 11
      // 52: lload 4
      // 54: bipush 1
      // 55: anewarray 296
      // 58: dup_x2
      // 59: dup_x2
      // 5a: pop
      // 5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w 415901109855295609
      // 64: lload 2
      // 65: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: iload 6
      // 6c: ifeq b3
      // 6f: goto 7c
      // 72: ldc2_w 437336934767815473
      // 75: lload 2
      // 76: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: sipush 12169
      // 7f: ldc2_w 1960871890820383169
      // 82: lload 2
      // 83: lxor
      // 84: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: if_icmpne a9
      // 8c: goto 99
      // 8f: ldc2_w 437336934767815473
      // 92: lload 2
      // 93: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: iinc 7 1
      // 9c: goto a9
      // 9f: ldc2_w 437336934767815473
      // a2: lload 2
      // a3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: iinc 10 1
      // ac: iload 6
      // ae: ifne 37
      // b1: iload 7
      // b3: ireturn
   }

   public void N(Object[] param1) {
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
      // 004: checkcast com/zelix/be
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/vi
      // 024: astore 6
      // 026: pop
      // 027: getstatic com/zelix/_3.a J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 35339448614933
      // 032: lxor
      // 033: lstore 7
      // 035: pop2
      // 036: ldc2_w -165444869030232002
      // 039: lload 2
      // 03a: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: istore 9
      // 041: aload 0
      // 042: ldc2_w -2209199372014609168
      // 045: lload 2
      // 046: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: iload 9
      // 04d: ifeq 0fa
      // 050: ifnonnull 0e9
      // 053: goto 060
      // 056: ldc2_w -361525086648035365
      // 059: lload 2
      // 05a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: ldc2_w -2211273397003056176
      // 064: lload 2
      // 065: invokedynamic i (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: iload 9
      // 06c: ifeq 0c0
      // 06f: goto 07c
      // 072: ldc2_w -361525086648035365
      // 075: lload 2
      // 076: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: lload 2
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 0b6
      // 082: ifeq 0b3
      // 085: goto 092
      // 088: ldc2_w -361525086648035365
      // 08b: lload 2
      // 08c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: new java/util/concurrent/ConcurrentHashMap
      // 095: dup
      // 096: sipush 31949
      // 099: ldc2_w 189319977733844582
      // 09c: lload 2
      // 09d: lxor
      // 09e: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 0a6: goto 0e0
      // 0a9: ldc2_w -361525086648035365
      // 0ac: lload 2
      // 0ad: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: sipush 18905
      // 0b6: ldc2_w 5827033558645037922
      // 0b9: lload 2
      // 0ba: lxor
      // 0bb: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: lload 7
      // 0c2: bipush 2
      // 0c3: anewarray 296
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 1
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w -137722615675225691
      // 0da: lload 2
      // 0db: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: ldc2_w -2209199372014609168
      // 0e3: lload 2
      // 0e4: invokedynamic s (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aload 0
      // 0ea: ldc2_w -2209199372014609168
      // 0ed: lload 2
      // 0ee: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: aload 4
      // 0f5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0fa: checkcast [Lcom/zelix/_n0;
      // 0fd: astore 10
      // 0ff: aload 10
      // 101: iload 9
      // 103: lload 2
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 13e
      // 109: ifeq 13c
      // 10c: ifnonnull 13a
      // 10f: goto 11c
      // 112: ldc2_w -361525086648035365
      // 115: lload 2
      // 116: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: aload 0
      // 11d: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 120: arraylength
      // 121: anewarray 56
      // 124: astore 10
      // 126: aload 0
      // 127: ldc2_w -2209199372014609168
      // 12a: lload 2
      // 12b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: aload 4
      // 132: aload 10
      // 134: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 139: pop
      // 13a: aload 10
      // 13c: iload 5
      // 13e: new com/zelix/_n0
      // 141: dup
      // 142: aload 6
      // 144: iload 5
      // 146: invokespecial com/zelix/_n0.<init> (Lcom/zelix/vi;I)V
      // 149: aastore
      // 14a: return
   }

   public int J(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 106123335163423L;
      int var10000 = a<"h">(29109, 1574176380421557358L ^ var2);
      Object[] var10005 = new Object[]{null, var4};
      var10005[0] = var5;
      return var10000 - x44.a<"i">(this, var10005, -3686784433831826294L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public int m(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 53569208293889L;
      int var7 = x44.a<"q">(-8078053049980562263L, var3);

      int var10000;
      label96: {
         label87: {
            try {
               var10000 = var2;
               if (var7 != 0) {
                  break label96;
               }

               if (var2 != 0) {
                  break label87;
               }
            } catch (gj var16) {
               throw x44.a<"q">(var16, -7961525506522547038L, var3);
            }

            byte var8 = 0;

            try {
               if (var3 < 0L) {
                  return var7;
               }

               if (var7 == 0) {
                  return var8;
               }
            } catch (gj var15) {
               boolean var10001 = false;
               throw x44.a<"q">(var15, -7961525506522547038L, var3);
            }
         }

         try {
            Object[] var10004 = new Object[]{null, 0};
            var10004[0] = var5;
            var10000 = x44.a<"o">(this, var10004, -8589568269741725548L, var3);
         } catch (gj var14) {
            boolean var22 = false;
            throw x44.a<"q">(var14, -7961525506522547038L, var3);
         }
      }

      int var9 = var10000;

      label97: {
         label88: {
            try {
               var10000 = var2;
               int var23 = var7;
               if (var3 > 0L) {
                  if (var7 != 0) {
                     break label97;
                  }

                  var23 = 1;
               }

               if (var2 != var23) {
                  break label88;
               }
            } catch (gj var13) {
               throw x44.a<"q">(var13, -7961525506522547038L, var3);
            }

            int var27 = var9;

            try {
               if (var3 <= 0L) {
                  return var7;
               }

               if (var7 == 0) {
                  return var27;
               }
            } catch (gj var12) {
               boolean var24 = false;
               throw x44.a<"q">(var12, -7961525506522547038L, var3);
            }
         }

         try {
            Object[] var26 = new Object[]{null, 1};
            var26[0] = var5;
            var10000 = x44.a<"o">(this, var26, -8589568269741725548L, var3);
         } catch (gj var11) {
            boolean var25 = false;
            throw x44.a<"q">(var11, -7961525506522547038L, var3);
         }
      }

      int var10 = var10000;
      return var9 + var10;
   }

   public int a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 105399771629588L;
      return xl.X(var4, this.I).size();
   }

   public _3(byte param1, int param2, int param3, String param4, _a[] param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 56
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 8
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 40
      // 012: lshl
      // 013: bipush 40
      // 015: lushr
      // 016: lor
      // 017: getstatic com/zelix/_3.a J
      // 01a: lxor
      // 01b: lstore 6
      // 01d: lload 6
      // 01f: dup2
      // 020: ldc2_w 24890366352229
      // 023: lxor
      // 024: lstore 8
      // 026: dup2
      // 027: ldc2_w 8001534954764
      // 02a: lxor
      // 02b: dup2
      // 02c: bipush 32
      // 02e: lushr
      // 02f: lstore 10
      // 031: dup2
      // 032: bipush 32
      // 034: lshl
      // 035: bipush 32
      // 037: lushr
      // 038: l2i
      // 039: istore 12
      // 03b: pop2
      // 03c: pop2
      // 03d: aload 0
      // 03e: invokespecial java/lang/Object.<init> ()V
      // 041: aload 4
      // 043: bipush 1
      // 044: anewarray 296
      // 047: dup_x1
      // 048: swap
      // 049: bipush 0
      // 04a: swap
      // 04b: aastore
      // 04c: ldc2_w 5253788063973179788
      // 04f: lload 6
      // 051: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: astore 14
      // 058: lload 10
      // 05a: aload 4
      // 05c: iload 12
      // 05e: bipush 3
      // 05f: anewarray 296
      // 062: dup_x1
      // 063: swap
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: bipush 2
      // 068: swap
      // 069: aastore
      // 06a: dup_x1
      // 06b: swap
      // 06c: bipush 1
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w 5410578021281909936
      // 07b: lload 6
      // 07d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: astore 15
      // 084: aload 15
      // 086: invokeinterface java/util/List.size ()I 1
      // 08b: aload 5
      // 08d: arraylength
      // 08e: iadd
      // 08f: istore 16
      // 091: ldc2_w 5755936115478917739
      // 094: lload 6
      // 096: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 5
      // 09d: arraylength
      // 09e: istore 17
      // 0a0: istore 13
      // 0a2: bipush 0
      // 0a3: istore 18
      // 0a5: aload 15
      // 0a7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0ac: astore 19
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: astore 20
      // 0b7: aload 20
      // 0b9: sipush 21575
      // 0bc: ldc2_w 7193240736401650877
      // 0bf: lload 6
      // 0c1: lxor
      // 0c2: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ca: pop
      // 0cb: bipush 0
      // 0cc: istore 21
      // 0ce: iload 21
      // 0d0: iload 16
      // 0d2: if_icmpge 1ac
      // 0d5: iload 13
      // 0d7: ifeq 1db
      // 0da: iload 18
      // 0dc: iload 17
      // 0de: iload 2
      // 0df: iflt 0f3
      // 0e2: if_icmpge 161
      // 0e5: aload 5
      // 0e7: iload 18
      // 0e9: aaload
      // 0ea: invokevirtual com/zelix/_a.L ()I
      // 0ed: iload 2
      // 0ee: iflt 17b
      // 0f1: iload 13
      // 0f3: ifeq 17b
      // 0f6: goto 104
      // 0f9: ldc2_w 5237285574771942798
      // 0fc: lload 6
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: iload 21
      // 106: iload 13
      // 108: ifeq 0d2
      // 10b: iload 3
      // 10c: iflt 0de
      // 10f: goto 11d
      // 112: ldc2_w 5237285574771942798
      // 115: lload 6
      // 117: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: if_icmpne 161
      // 120: aload 20
      // 122: aload 5
      // 124: iload 18
      // 126: aaload
      // 127: lload 8
      // 129: bipush 1
      // 12a: anewarray 296
      // 12d: dup_x2
      // 12e: dup_x2
      // 12f: pop
      // 130: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: ldc2_w 5438865109867615942
      // 139: lload 6
      // 13b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 143: pop
      // 144: iinc 18 1
      // 147: iinc 21 1
      // 14a: iload 13
      // 14c: ifne 0d5
      // 14f: iload 1
      // 150: iflt 161
      // 153: goto 161
      // 156: ldc2_w 5237285574771942798
      // 159: lload 6
      // 15b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: aload 19
      // 163: iload 13
      // 165: ifeq 197
      // 168: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16d: goto 17b
      // 170: ldc2_w 5237285574771942798
      // 173: lload 6
      // 175: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: iload 1
      // 17c: iflt 1a9
      // 17f: ifeq 1a4
      // 182: aload 19
      // 184: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 189: goto 197
      // 18c: ldc2_w 5237285574771942798
      // 18f: lload 6
      // 191: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: checkcast java/lang/String
      // 19a: astore 22
      // 19c: aload 20
      // 19e: aload 22
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: pop
      // 1a4: iinc 21 1
      // 1a7: iload 13
      // 1a9: ifne 0ce
      // 1ac: aload 20
      // 1ae: sipush 11425
      // 1b1: ldc2_w 3361706808529587287
      // 1b4: lload 6
      // 1b6: lxor
      // 1b7: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1bf: pop
      // 1c0: aload 20
      // 1c2: aload 14
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: pop
      // 1c8: aload 0
      // 1c9: aload 20
      // 1cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ce: putfield com/zelix/_3.I Ljava/lang/String;
      // 1d1: aload 0
      // 1d2: aload 5
      // 1d4: putfield com/zelix/_3.d [Lcom/zelix/_a;
      // 1d7: iload 3
      // 1d8: ifle 0d5
      // 1db: return
   }

   public boolean C(Object[] param1) {
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
      // 16: getstatic com/zelix/_3.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 103712323812958
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: ldc2_w -5479793620688967490
      // 28: lload 3
      // 29: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: istore 7
      // 30: aload 0
      // 31: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 34: iload 2
      // 35: aaload
      // 36: lload 5
      // 38: bipush 1
      // 39: anewarray 296
      // 3c: dup_x2
      // 3d: dup_x2
      // 3e: pop
      // 3f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w -5890158625176603651
      // 48: lload 3
      // 49: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: iload 7
      // 50: ifne 7e
      // 53: sipush 14328
      // 56: ldc2_w 3794175477012754985
      // 59: lload 3
      // 5a: lxor
      // 5b: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: if_icmpne 81
      // 63: goto 70
      // 66: ldc2_w -5938599143390396235
      // 69: lload 3
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 7e
      // 74: ldc2_w -5938599143390396235
      // 77: lload 3
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: goto 82
      // 81: bipush 0
      // 82: ireturn
   }

   private int O(Object[] param1) {
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
      // 017: getstatic com/zelix/_3.a J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 49660365665719
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 119362142346494
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 126617455988828
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 124946367712658
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 18482038792187
      // 03e: lxor
      // 03f: lstore 13
      // 041: pop2
      // 042: ldc2_w -568949141591448745
      // 045: lload 2
      // 046: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 0
      // 04c: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 04f: iload 4
      // 051: aaload
      // 052: lload 5
      // 054: bipush 1
      // 055: anewarray 296
      // 058: dup_x2
      // 059: dup_x2
      // 05a: pop
      // 05b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: ldc2_w -1898125916770830316
      // 064: lload 2
      // 065: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: istore 17
      // 06c: istore 15
      // 06e: iload 17
      // 070: sipush 10638
      // 073: ldc2_w 4009483736864925604
      // 076: lload 2
      // 077: lxor
      // 078: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: iload 15
      // 07f: ifne 0da
      // 082: if_icmpne 0ac
      // 085: goto 092
      // 088: ldc2_w -1838408790160274596
      // 08b: lload 2
      // 08c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: sipush 28258
      // 095: ldc2_w 4733682321386168399
      // 098: lload 2
      // 099: lxor
      // 09a: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: istore 16
      // 0a1: iload 15
      // 0a3: lload 2
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 3a9
      // 0a9: ifeq 3a7
      // 0ac: iload 17
      // 0ae: iload 15
      // 0b0: ifne 127
      // 0b3: goto 0c0
      // 0b6: ldc2_w -1838408790160274596
      // 0b9: lload 2
      // 0ba: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: sipush 7842
      // 0c3: ldc2_w 1928566107052380301
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0da
      // 0d0: ldc2_w -1838408790160274596
      // 0d3: lload 2
      // 0d4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: lload 2
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: iflt 0f2
      // 0e0: if_icmpeq 11a
      // 0e3: iload 17
      // 0e5: sipush 22917
      // 0e8: ldc2_w 3391487708856178604
      // 0eb: lload 2
      // 0ec: lxor
      // 0ed: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: iload 15
      // 0f4: lload 2
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 152
      // 0fa: ifne 150
      // 0fd: goto 10a
      // 100: ldc2_w -1838408790160274596
      // 103: lload 2
      // 104: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: if_icmpne 134
      // 10d: goto 11a
      // 110: ldc2_w -1838408790160274596
      // 113: lload 2
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: sipush 21280
      // 11d: ldc2_w 5750484994559302937
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: istore 16
      // 129: iload 15
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 3a9
      // 131: ifeq 3a7
      // 134: iload 17
      // 136: sipush 30686
      // 139: ldc2_w 6547108446368266751
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: goto 150
      // 146: ldc2_w -1838408790160274596
      // 149: lload 2
      // 14a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: iload 15
      // 152: ifne 21b
      // 155: if_icmpne 1f0
      // 158: goto 165
      // 15b: ldc2_w -1838408790160274596
      // 15e: lload 2
      // 15f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: sipush 16480
      // 168: ldc2_w 1262805571988442688
      // 16b: lload 2
      // 16c: lxor
      // 16d: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: iload 4
      // 174: iload 15
      // 176: ifne 1c1
      // 179: goto 186
      // 17c: ldc2_w -1838408790160274596
      // 17f: lload 2
      // 180: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: ifne 1c4
      // 189: goto 196
      // 18c: ldc2_w -1838408790160274596
      // 18f: lload 2
      // 190: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 0
      // 197: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 19a: bipush 1
      // 19b: aaload
      // 19c: lload 9
      // 19e: bipush 1
      // 19f: anewarray 296
      // 1a2: dup_x2
      // 1a3: dup_x2
      // 1a4: pop
      // 1a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a8: bipush 0
      // 1a9: swap
      // 1aa: aastore
      // 1ab: ldc2_w -1833184338103548828
      // 1ae: lload 2
      // 1af: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: goto 1c1
      // 1b7: ldc2_w -1838408790160274596
      // 1ba: lload 2
      // 1bb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: goto 1e2
      // 1c4: aload 0
      // 1c5: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 1c8: bipush 0
      // 1c9: aaload
      // 1ca: lload 9
      // 1cc: bipush 1
      // 1cd: anewarray 296
      // 1d0: dup_x2
      // 1d1: dup_x2
      // 1d2: pop
      // 1d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d6: bipush 0
      // 1d7: swap
      // 1d8: aastore
      // 1d9: ldc2_w -1833184338103548828
      // 1dc: lload 2
      // 1dd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: isub
      // 1e3: istore 16
      // 1e5: iload 15
      // 1e7: lload 2
      // 1e8: lconst_0
      // 1e9: lcmp
      // 1ea: ifle 3a9
      // 1ed: ifeq 3a7
      // 1f0: aload 0
      // 1f1: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 1f4: arraylength
      // 1f5: iload 15
      // 1f7: lload 2
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: iflt 249
      // 1fd: ifne 247
      // 200: goto 20d
      // 203: ldc2_w -1838408790160274596
      // 206: lload 2
      // 207: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: athrow
      // 20d: bipush 2
      // 20e: goto 21b
      // 211: ldc2_w -1838408790160274596
      // 214: lload 2
      // 215: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: athrow
      // 21b: if_icmpne 238
      // 21e: sipush 19907
      // 221: ldc2_w 5750350453024539621
      // 224: lload 2
      // 225: lxor
      // 226: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: istore 16
      // 22d: iload 15
      // 22f: lload 2
      // 230: lconst_0
      // 231: lcmp
      // 232: iflt 3a9
      // 235: ifeq 3a7
      // 238: iload 4
      // 23a: goto 247
      // 23d: ldc2_w -1838408790160274596
      // 240: lload 2
      // 241: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: iload 15
      // 249: ifne 29c
      // 24c: ifne 276
      // 24f: goto 25c
      // 252: ldc2_w -1838408790160274596
      // 255: lload 2
      // 256: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: sipush 9889
      // 25f: ldc2_w 7820697880768948380
      // 262: lload 2
      // 263: lxor
      // 264: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: istore 16
      // 26b: iload 15
      // 26d: lload 2
      // 26e: lconst_0
      // 26f: lcmp
      // 270: ifle 3a9
      // 273: ifeq 3a7
      // 276: aload 0
      // 277: lload 7
      // 279: bipush 1
      // 27a: anewarray 296
      // 27d: dup_x2
      // 27e: dup_x2
      // 27f: pop
      // 280: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: ldc2_w -206197778404793707
      // 289: lload 2
      // 28a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: goto 29c
      // 292: ldc2_w -1838408790160274596
      // 295: lload 2
      // 296: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: athrow
      // 29c: istore 18
      // 29e: aload 0
      // 29f: lload 11
      // 2a1: bipush 1
      // 2a2: anewarray 296
      // 2a5: dup_x2
      // 2a6: dup_x2
      // 2a7: pop
      // 2a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ab: bipush 0
      // 2ac: swap
      // 2ad: aastore
      // 2ae: ldc2_w -140326266393430969
      // 2b1: lload 2
      // 2b2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: istore 19
      // 2b9: aload 0
      // 2ba: lload 13
      // 2bc: bipush 1
      // 2bd: anewarray 296
      // 2c0: dup_x2
      // 2c1: dup_x2
      // 2c2: pop
      // 2c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c6: bipush 0
      // 2c7: swap
      // 2c8: aastore
      // 2c9: ldc2_w -2132038041244603381
      // 2cc: lload 2
      // 2cd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: istore 20
      // 2d4: iload 4
      // 2d6: iload 20
      // 2d8: iload 15
      // 2da: lload 2
      // 2db: lconst_0
      // 2dc: lcmp
      // 2dd: ifle 31f
      // 2e0: ifne 31d
      // 2e3: if_icmpne 30d
      // 2e6: goto 2f3
      // 2e9: ldc2_w -1838408790160274596
      // 2ec: lload 2
      // 2ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: athrow
      // 2f3: sipush 9889
      // 2f6: ldc2_w 7820697880768948380
      // 2f9: lload 2
      // 2fa: lxor
      // 2fb: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: istore 16
      // 302: iload 15
      // 304: lload 2
      // 305: lconst_0
      // 306: lcmp
      // 307: ifle 3a9
      // 30a: ifeq 3a7
      // 30d: iload 19
      // 30f: bipush 3
      // 310: goto 31d
      // 313: ldc2_w -1838408790160274596
      // 316: lload 2
      // 317: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: athrow
      // 31d: iload 15
      // 31f: ifne 36e
      // 322: if_icmpne 34c
      // 325: goto 332
      // 328: ldc2_w -1838408790160274596
      // 32b: lload 2
      // 32c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: sipush 22492
      // 335: ldc2_w 964729584573864422
      // 338: lload 2
      // 339: lxor
      // 33a: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: istore 16
      // 341: iload 15
      // 343: lload 2
      // 344: lconst_0
      // 345: lcmp
      // 346: iflt 3a9
      // 349: ifeq 3a7
      // 34c: iload 18
      // 34e: iload 15
      // 350: ifne 3a5
      // 353: goto 360
      // 356: ldc2_w -1838408790160274596
      // 359: lload 2
      // 35a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: athrow
      // 360: bipush 1
      // 361: goto 36e
      // 364: ldc2_w -1838408790160274596
      // 367: lload 2
      // 368: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: if_icmpne 38b
      // 371: sipush 17811
      // 374: ldc2_w 4922633110995258288
      // 377: lload 2
      // 378: lxor
      // 379: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: istore 16
      // 380: iload 15
      // 382: lload 2
      // 383: lconst_0
      // 384: lcmp
      // 385: ifle 3a9
      // 388: ifeq 3a7
      // 38b: sipush 22492
      // 38e: ldc2_w 964729584573864422
      // 391: lload 2
      // 392: lxor
      // 393: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: goto 3a5
      // 39b: ldc2_w -1838408790160274596
      // 39e: lload 2
      // 39f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: athrow
      // 3a5: istore 16
      // 3a7: iload 16
      // 3a9: ireturn
   }

   public int A(Object[] param1) {
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
      // 17: getstatic com/zelix/_3.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 9689712392880
      // 22: lxor
      // 23: lstore 5
      // 25: pop2
      // 26: bipush 0
      // 27: istore 8
      // 29: ldc2_w 8537805434093259766
      // 2c: lload 2
      // 2d: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: lload 5
      // 35: bipush 0
      // 36: bipush 2
      // 37: anewarray 296
      // 3a: dup_x1
      // 3b: swap
      // 3c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f: bipush 1
      // 40: swap
      // 41: aastore
      // 42: dup_x2
      // 43: dup_x2
      // 44: pop
      // 45: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: ldc2_w 7528471854255638565
      // 4e: lload 2
      // 4f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: istore 9
      // 56: istore 7
      // 58: iload 4
      // 5a: bipush 1
      // 5b: iload 7
      // 5d: ifeq a1
      // 60: if_icmpne 7f
      // 63: goto 70
      // 66: ldc2_w 8157077563135368211
      // 69: lload 2
      // 6a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: iload 9
      // 72: istore 8
      // 74: iload 7
      // 76: lload 2
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt 81
      // 7c: ifne cf
      // 7f: iload 4
      // 81: iload 7
      // 83: ifeq d1
      // 86: goto 93
      // 89: ldc2_w 8157077563135368211
      // 8c: lload 2
      // 8d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: bipush 2
      // 94: goto a1
      // 97: ldc2_w 8157077563135368211
      // 9a: lload 2
      // 9b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: if_icmpne cf
      // a4: aload 0
      // a5: lload 5
      // a7: bipush 1
      // a8: bipush 2
      // a9: anewarray 296
      // ac: dup_x1
      // ad: swap
      // ae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b1: bipush 1
      // b2: swap
      // b3: aastore
      // b4: dup_x2
      // b5: dup_x2
      // b6: pop
      // b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ba: bipush 0
      // bb: swap
      // bc: aastore
      // bd: ldc2_w 7528471854255638565
      // c0: lload 2
      // c1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: istore 10
      // c8: iload 9
      // ca: iload 10
      // cc: iadd
      // cd: istore 8
      // cf: iload 8
      // d1: ireturn
   }

   _a T(Object[] var1) {
      return this.d[0];
   }

   public char x(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 41279956937216L;
      return x44.a<"h">(this.d[var2], new Object[]{var5}, -423470133383108701L, var3);
   }

   public _n0[] o(Object[] var1) {
      long var2 = (Long)var1[0];
      be var4 = (be)var1[1];
      var2 = a ^ var2;
      return (_n0[])x44.a<"k">(this, 4391040011747344727L, var2).get(var4);
   }

   public static String I(Object[] param0) {
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
      // 004: checkcast java/util/List
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
      // 016: checkcast [Lcom/zelix/_a;
      // 019: astore 1
      // 01a: pop
      // 01b: getstatic com/zelix/_3.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 51802111012936
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: aload 4
      // 02c: invokeinterface java/util/List.size ()I 1
      // 031: aload 1
      // 032: arraylength
      // 033: iadd
      // 034: istore 8
      // 036: ldc2_w 7263190026000488774
      // 039: lload 2
      // 03a: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 1
      // 040: arraylength
      // 041: istore 9
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: astore 10
      // 04c: bipush 0
      // 04d: istore 11
      // 04f: istore 7
      // 051: bipush 0
      // 052: istore 12
      // 054: aload 1
      // 055: iload 7
      // 057: ifeq 081
      // 05a: arraylength
      // 05b: ifne 073
      // 05e: goto 06b
      // 061: ldc2_w 7170762796879187619
      // 064: lload 2
      // 065: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aconst_null
      // 06c: astore 13
      // 06e: iload 7
      // 070: ifne 086
      // 073: aload 1
      // 074: goto 081
      // 077: ldc2_w 7170762796879187619
      // 07a: lload 2
      // 07b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: iload 12
      // 083: aaload
      // 084: astore 13
      // 086: aload 10
      // 088: sipush 21433
      // 08b: ldc2_w 5050051923933681764
      // 08e: lload 2
      // 08f: lxor
      // 090: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 098: pop
      // 099: bipush 0
      // 09a: istore 14
      // 09c: iload 14
      // 09e: iload 8
      // 0a0: if_icmpge 17c
      // 0a3: iload 7
      // 0a5: ifeq 195
      // 0a8: aload 13
      // 0aa: iload 7
      // 0ac: ifeq 164
      // 0af: goto 0bc
      // 0b2: ldc2_w 7170762796879187619
      // 0b5: lload 2
      // 0b6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: ifnull 15b
      // 0bf: goto 0cc
      // 0c2: ldc2_w 7170762796879187619
      // 0c5: lload 2
      // 0c6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: iload 14
      // 0ce: aload 13
      // 0d0: invokevirtual com/zelix/_a.L ()I
      // 0d3: iload 7
      // 0d5: ifeq 141
      // 0d8: goto 0e5
      // 0db: ldc2_w 7170762796879187619
      // 0de: lload 2
      // 0df: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: if_icmpne 15b
      // 0e8: goto 0f5
      // 0eb: ldc2_w 7170762796879187619
      // 0ee: lload 2
      // 0ef: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 10
      // 0f7: aload 13
      // 0f9: lload 5
      // 0fb: bipush 1
      // 0fc: anewarray 296
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w 6942161104880664043
      // 10b: lload 2
      // 10c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 114: pop
      // 115: iinc 12 1
      // 118: iload 7
      // 11a: lload 2
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 14c
      // 120: ifeq 14a
      // 123: goto 130
      // 126: ldc2_w 7170762796879187619
      // 129: lload 2
      // 12a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: iload 12
      // 132: iload 9
      // 134: goto 141
      // 137: ldc2_w 7170762796879187619
      // 13a: lload 2
      // 13b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: if_icmpge 155
      // 144: aload 1
      // 145: iload 12
      // 147: aaload
      // 148: astore 13
      // 14a: iload 7
      // 14c: lload 2
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: iflt 179
      // 152: ifne 174
      // 155: aconst_null
      // 156: astore 13
      // 158: goto 174
      // 15b: aload 4
      // 15d: iload 11
      // 15f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 164: checkcast java/lang/String
      // 167: astore 15
      // 169: aload 10
      // 16b: aload 15
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: pop
      // 171: iinc 11 1
      // 174: iinc 14 1
      // 177: iload 7
      // 179: ifne 09c
      // 17c: aload 10
      // 17e: sipush 1621
      // 181: ldc2_w 8237984228539927949
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 18e: pop
      // 18f: lload 2
      // 190: lconst_0
      // 191: lcmp
      // 192: iflt 0a3
      // 195: aload 10
      // 197: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19a: areturn
   }

   public int R(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 115978825252642L;
      int var10000 = a<"h">(29109, 1574167414391287123L ^ var2);
      Object[] var10005 = new Object[]{null, var4};
      var10005[0] = var5;
      return var10000 - x44.a<"l">(this, var10005, 3308141217318718903L, var2);
   }

   public boolean N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = x44.a<"q">(6007069830111588055L, var2);

      try {
         int var10000 = this.d.length;
         if (var4 == 0) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, 6058120171078105394L, var2);
      }

      return (boolean)0;
   }

   public String Q() {
      return this.I;
   }

   public boolean s(Object[] param1) {
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
      // 0c: getstatic com/zelix/_3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 5477558467814191502
      // 15: lload 2
      // 16: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 21: arraylength
      // 22: iload 4
      // 24: ifeq 46
      // 27: bipush 1
      // 28: if_icmple 49
      // 2b: goto 38
      // 2e: ldc2_w 5425589031654532715
      // 31: lload 2
      // 32: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: bipush 1
      // 39: goto 46
      // 3c: ldc2_w 5425589031654532715
      // 3f: lload 2
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   public int U(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.d[var2].L();
   }

   public static int[] g(Object[] param0) {
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
      // 004: checkcast com/zelix/_3
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 2
      // 01d: pop
      // 01e: getstatic com/zelix/_3.a J
      // 021: lload 2
      // 022: lxor
      // 023: lstore 2
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 101849915325919
      // 029: lxor
      // 02a: lstore 5
      // 02c: pop2
      // 02d: ldc2_w -8880886359137198195
      // 030: lload 2
      // 031: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: aload 4
      // 038: getfield com/zelix/_3.I Ljava/lang/String;
      // 03b: lload 5
      // 03d: dup2_x1
      // 03e: pop2
      // 03f: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 042: astore 8
      // 044: istore 7
      // 046: aload 8
      // 048: invokeinterface java/util/List.size ()I 1
      // 04d: istore 9
      // 04f: aload 4
      // 051: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 054: arraylength
      // 055: istore 10
      // 057: iload 10
      // 059: newarray 10
      // 05b: astore 11
      // 05d: iload 1
      // 05e: iload 7
      // 060: ifne 074
      // 063: ifeq 077
      // 066: goto 073
      // 069: ldc2_w -7302929980988262522
      // 06c: lload 2
      // 06d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: bipush 0
      // 074: goto 078
      // 077: bipush 1
      // 078: istore 12
      // 07a: bipush 0
      // 07b: istore 13
      // 07d: aload 4
      // 07f: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 082: iload 13
      // 084: aaload
      // 085: invokevirtual com/zelix/_a.L ()I
      // 088: istore 14
      // 08a: bipush 0
      // 08b: istore 15
      // 08d: iload 15
      // 08f: iload 9
      // 091: if_icmpge 154
      // 094: iload 15
      // 096: iload 14
      // 098: iload 7
      // 09a: ifne 0da
      // 09d: if_icmpne 105
      // 0a0: goto 0ad
      // 0a3: ldc2_w -7302929980988262522
      // 0a6: lload 2
      // 0a7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 11
      // 0af: iload 13
      // 0b1: iload 12
      // 0b3: iastore
      // 0b4: iinc 13 1
      // 0b7: iload 13
      // 0b9: iload 7
      // 0bb: ifne 103
      // 0be: goto 0cb
      // 0c1: ldc2_w -7302929980988262522
      // 0c4: lload 2
      // 0c5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: iload 10
      // 0cd: goto 0da
      // 0d0: ldc2_w -7302929980988262522
      // 0d3: lload 2
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmpge 0f5
      // 0dd: aload 4
      // 0df: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 0e2: iload 13
      // 0e4: aaload
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 10e
      // 0eb: invokevirtual com/zelix/_a.L ()I
      // 0ee: istore 14
      // 0f0: iload 7
      // 0f2: ifeq 105
      // 0f5: bipush -1
      // 0f6: goto 103
      // 0f9: ldc2_w -7302929980988262522
      // 0fc: lload 2
      // 0fd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: istore 14
      // 105: aload 8
      // 107: iload 15
      // 109: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10e: checkcast java/lang/String
      // 111: astore 16
      // 113: iinc 12 1
      // 116: aload 16
      // 118: ldc "J"
      // 11a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11d: iload 7
      // 11f: ifne 146
      // 122: ifne 149
      // 125: goto 132
      // 128: ldc2_w -7302929980988262522
      // 12b: lload 2
      // 12c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 16
      // 134: ldc "D"
      // 136: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 139: goto 146
      // 13c: ldc2_w -7302929980988262522
      // 13f: lload 2
      // 140: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: ifeq 14c
      // 149: iinc 12 1
      // 14c: iinc 15 1
      // 14f: iload 7
      // 151: ifeq 08d
      // 154: aload 11
      // 156: lload 2
      // 157: lconst_0
      // 158: lcmp
      // 159: iflt 10e
      // 15c: areturn
   }

   _a H(Object[] var1) {
      return this.d[this.d.length - 1];
   }

   public _a[] z(Object[] var1) {
      return this.d;
   }

   public int[] k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var5 = this.d.length;
      int var10000 = x44.a<"r">(8520332168591264692L, var2);
      int[] var6 = new int[var5];
      int var4 = var10000;
      int var7 = 0;

      while (var7 < var5) {
         try {
            int var10001 = var4;
            if (var2 > 0L) {
               if (var4 == 0) {
                  return var6;
               }

               var10001 = var7;
            }

            var6[var10001] = this.d[var7].L();
            var7++;
            if (var4 != 0) {
               continue;
            }
         } catch (gj var8) {
            throw x44.a<"r">(var8, 8174577492582866001L, var2);
         }

         if (var2 >= 0L) {
            break;
         }
      }

      return var6;
   }

   _3(List param1, String param2, char[] param3, int[] param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_3.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: ldc2_w -7197740253803732586
      // 00b: lload 5
      // 00d: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: aload 0
      // 013: invokespecial java/lang/Object.<init> ()V
      // 016: aload 0
      // 017: aload 3
      // 018: arraylength
      // 019: anewarray 212
      // 01c: putfield com/zelix/_3.d [Lcom/zelix/_a;
      // 01f: bipush 0
      // 020: istore 8
      // 022: istore 7
      // 024: iload 8
      // 026: aload 3
      // 027: arraylength
      // 028: if_icmpge 06b
      // 02b: aload 0
      // 02c: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 02f: iload 8
      // 031: new com/zelix/_a
      // 034: dup
      // 035: aload 4
      // 037: iload 8
      // 039: iaload
      // 03a: aload 3
      // 03b: iload 8
      // 03d: caload
      // 03e: invokespecial com/zelix/_a.<init> (IC)V
      // 041: aastore
      // 042: iinc 8 1
      // 045: iload 7
      // 047: lload 5
      // 049: lconst_0
      // 04a: lcmp
      // 04b: ifle 078
      // 04e: ifeq 06f
      // 051: iload 7
      // 053: ifne 024
      // 056: lload 5
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 045
      // 05d: goto 06b
      // 060: ldc2_w -7254209099715905933
      // 063: lload 5
      // 065: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 3
      // 06c: arraylength
      // 06d: istore 8
      // 06f: aload 1
      // 070: invokeinterface java/util/List.size ()I 1
      // 075: aload 3
      // 076: arraylength
      // 077: iadd
      // 078: istore 9
      // 07a: new java/lang/StringBuilder
      // 07d: dup
      // 07e: invokespecial java/lang/StringBuilder.<init> ()V
      // 081: astore 10
      // 083: aload 10
      // 085: sipush 21575
      // 088: ldc2_w 7193315611682744128
      // 08b: lload 5
      // 08d: lxor
      // 08e: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 096: pop
      // 097: bipush 0
      // 098: istore 11
      // 09a: aload 1
      // 09b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a0: astore 12
      // 0a2: bipush 0
      // 0a3: istore 13
      // 0a5: iload 13
      // 0a7: iload 9
      // 0a9: if_icmpge 175
      // 0ac: iload 7
      // 0ae: ifeq 1a0
      // 0b1: iload 11
      // 0b3: iload 8
      // 0b5: lload 5
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0cd
      // 0bc: if_icmpge 127
      // 0bf: aload 4
      // 0c1: iload 11
      // 0c3: iaload
      // 0c4: lload 5
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 141
      // 0cb: iload 7
      // 0cd: ifeq 141
      // 0d0: goto 0de
      // 0d3: ldc2_w -7254209099715905933
      // 0d6: lload 5
      // 0d8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: iload 13
      // 0e0: iload 7
      // 0e2: ifeq 0a9
      // 0e5: lload 5
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 0b5
      // 0ec: goto 0fa
      // 0ef: ldc2_w -7254209099715905933
      // 0f2: lload 5
      // 0f4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: if_icmpne 127
      // 0fd: aload 10
      // 0ff: aload 3
      // 100: iload 11
      // 102: caload
      // 103: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 106: pop
      // 107: iinc 11 1
      // 10a: iinc 13 1
      // 10d: iload 7
      // 10f: ifne 0ac
      // 112: lload 5
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 127
      // 119: goto 127
      // 11c: ldc2_w -7254209099715905933
      // 11f: lload 5
      // 121: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 12
      // 129: iload 7
      // 12b: ifeq 160
      // 12e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 133: goto 141
      // 136: ldc2_w -7254209099715905933
      // 139: lload 5
      // 13b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: lload 5
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 172
      // 148: ifeq 16d
      // 14b: aload 12
      // 14d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 152: goto 160
      // 155: ldc2_w -7254209099715905933
      // 158: lload 5
      // 15a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: checkcast java/lang/String
      // 163: astore 14
      // 165: aload 10
      // 167: aload 14
      // 169: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16c: pop
      // 16d: iinc 13 1
      // 170: iload 7
      // 172: ifne 0a5
      // 175: aload 10
      // 177: sipush 11425
      // 17a: ldc2_w 3361764160343039914
      // 17d: lload 5
      // 17f: lxor
      // 180: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 188: pop
      // 189: aload 10
      // 18b: aload 2
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18f: pop
      // 190: aload 0
      // 191: aload 10
      // 193: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 196: putfield com/zelix/_3.I Ljava/lang/String;
      // 199: lload 5
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: iflt 0ac
      // 1a0: return
   }

   private int i(Object[] param1) {
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
      // 0c: getstatic com/zelix/_3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 104539932247987
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: bipush 0
      // 1c: istore 7
      // 1e: aload 0
      // 1f: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 22: astore 8
      // 24: aload 8
      // 26: arraylength
      // 27: istore 9
      // 29: ldc2_w 5340950279386763603
      // 2c: lload 2
      // 2d: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: bipush 0
      // 33: istore 10
      // 35: istore 6
      // 37: iload 10
      // 39: iload 9
      // 3b: if_icmpge b1
      // 3e: aload 8
      // 40: iload 10
      // 42: aaload
      // 43: astore 11
      // 45: iload 6
      // 47: lload 2
      // 48: lconst_0
      // 49: lcmp
      // 4a: ifle ae
      // 4d: ifne ac
      // 50: aload 11
      // 52: lload 4
      // 54: bipush 1
      // 55: anewarray 296
      // 58: dup_x2
      // 59: dup_x2
      // 5a: pop
      // 5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w 6317691246732888592
      // 64: lload 2
      // 65: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: iload 6
      // 6c: ifne b2
      // 6f: goto 7c
      // 72: ldc2_w 6086855468170885464
      // 75: lload 2
      // 76: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: sipush 30008
      // 7f: ldc2_w 8215233277614934290
      // 82: lload 2
      // 83: lxor
      // 84: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: if_icmpne a6
      // 8c: goto 99
      // 8f: ldc2_w 6086855468170885464
      // 92: lload 2
      // 93: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: iload 7
      // 9b: ireturn
      // 9c: ldc2_w 6086855468170885464
      // 9f: lload 2
      // a0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: iinc 7 1
      // a9: iinc 10 1
      // ac: iload 6
      // ae: ifeq 37
      // b1: bipush -1
      // b2: ireturn
   }

   private int s(Object[] param1) {
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
      // 0c: getstatic com/zelix/_3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 38844166931638
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 1167000277367270840
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: aload 0
      // 28: getfield com/zelix/_3.d [Lcom/zelix/_a;
      // 2b: astore 8
      // 2d: aload 8
      // 2f: arraylength
      // 30: istore 9
      // 32: istore 6
      // 34: bipush 0
      // 35: istore 10
      // 37: iload 10
      // 39: iload 9
      // 3b: if_icmpge b1
      // 3e: aload 8
      // 40: iload 10
      // 42: aaload
      // 43: astore 11
      // 45: iload 6
      // 47: lload 2
      // 48: lconst_0
      // 49: lcmp
      // 4a: ifle ae
      // 4d: ifeq ac
      // 50: aload 11
      // 52: lload 4
      // 54: bipush 1
      // 55: anewarray 296
      // 58: dup_x2
      // 59: dup_x2
      // 5a: pop
      // 5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: ldc2_w 1488878345064581397
      // 64: lload 2
      // 65: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: iload 6
      // 6c: ifeq b3
      // 6f: goto 7c
      // 72: ldc2_w 1692692157304633949
      // 75: lload 2
      // 76: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: sipush 17428
      // 7f: ldc2_w 839663370126342974
      // 82: lload 2
      // 83: lxor
      // 84: invokedynamic h (IJ)I bsm=com/zelix/_3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: if_icmpne a9
      // 8c: goto 99
      // 8f: ldc2_w 1692692157304633949
      // 92: lload 2
      // 93: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: iinc 7 1
      // 9c: goto a9
      // 9f: ldc2_w 1692692157304633949
      // a2: lload 2
      // a3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: iinc 10 1
      // ac: iload 6
      // ae: ifne 37
      // b1: iload 7
      // b3: ireturn
   }

   static {
      long var0 = a ^ 22533254004457L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[22];
      int var5 = 0;
      String var6 = "[NÔo°#]ÆÊ³_\u0002S\u0003,Y³\u0098º$¸W2\u001buÉ\u0090»Á\u0086\u0099\u0097^d¦zpi\u0093þw×¢ëeòj*Òè+\r379\u001c^|\u008cöAãûåÞ>\r=÷)ª~i\u0000\u000elb7\u0096Õ8¿Ja\u0007D\u008b\n±X\u001bBV©Ð°\u001d\ns\u0092\u0016\u00889µõâ>[&Û@é\fÂ`EM©\u001e6Ô¶\u0004¨éÌ%\u009e\u00058^¾è\u0087\u0088F\nH\u0014ÚÙúðð\u0082À\u0014.¼j\u008bS\b~«è%el(";
      int var7 = "[NÔo°#]ÆÊ³_\u0002S\u0003,Y³\u0098º$¸W2\u001buÉ\u0090»Á\u0086\u0099\u0097^d¦zpi\u0093þw×¢ëeòj*Òè+\r379\u001c^|\u008cöAãûåÞ>\r=÷)ª~i\u0000\u000elb7\u0096Õ8¿Ja\u0007D\u008b\n±X\u001bBV©Ð°\u001d\ns\u0092\u0016\u00889µõâ>[&Û@é\fÂ`EM©\u001e6Ô¶\u0004¨éÌ%\u009e\u00058^¾è\u0087\u0088F\nH\u0014ÚÙúðð\u0082À\u0014.¼j\u008bS\b~«è%el("
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[22];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "-äh\u0084\u0094ú\u0095ì\u008f3 È4\u0085±\u0012";
                  var7 = "-äh\u0084\u0094ú\u0095ì\u008f3 È4\u0085±\u0012".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25117;
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_3", var14);
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
         throw new RuntimeException("com/zelix/_3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
