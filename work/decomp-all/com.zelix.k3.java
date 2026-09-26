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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k3 extends kx {
   private bz[] o;
   private static final long a = prr.a(-8118939980381019893L, 8072891312540668765L, MethodHandles.lookup().lookupClass()).a(252649764781910L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g = new HashMap(13);
   private static final long i;

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
      // 09: ldc2_w 113240848016893
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w 5618762033536375070
      // 13: lload 2
      // 14: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 1
      // 1a: aload 0
      // 1b: getfield com/zelix/k3.b Lcom/zelix/x8;
      // 1e: aload 0
      // 1f: aload 0
      // 20: invokevirtual com/zelix/k3.H ()Lcom/zelix/_4;
      // 23: lload 6
      // 25: dup2_x1
      // 26: pop2
      // 27: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 2a: pop
      // 2b: istore 8
      // 2d: aload 0
      // 2e: ldc2_w 5544088189886891558
      // 31: lload 2
      // 32: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: iload 8
      // 39: ifne 5e
      // 3c: ifeq 85
      // 3f: goto 4c
      // 42: ldc2_w 6155350523328440613
      // 45: lload 2
      // 46: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 50: arraylength
      // 51: goto 5e
      // 54: ldc2_w 6155350523328440613
      // 57: lload 2
      // 58: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: istore 9
      // 60: bipush 0
      // 61: istore 10
      // 63: iload 10
      // 65: iload 9
      // 67: if_icmpge 85
      // 6a: aload 0
      // 6b: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 6e: iload 10
      // 70: aaload
      // 71: aload 1
      // 72: lload 4
      // 74: ldc2_w 5822427420561165392
      // 77: lload 2
      // 78: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: iinc 10 1
      // 80: iload 8
      // 82: ifeq 63
      // 85: return
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
      // 026: ldc2_w 86058570623411
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 0
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w 1680553024964027930
      // 037: lload 4
      // 039: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 0
      // 03f: aload 6
      // 041: aload 2
      // 042: lload 9
      // 044: aload 3
      // 045: bipush 4
      // 046: anewarray 62
      // 049: dup_x1
      // 04a: swap
      // 04b: bipush 3
      // 04c: swap
      // 04d: aastore
      // 04e: dup_x2
      // 04f: dup_x2
      // 050: pop
      // 051: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 054: bipush 2
      // 055: swap
      // 056: aastore
      // 057: dup_x1
      // 058: swap
      // 059: bipush 1
      // 05a: swap
      // 05b: aastore
      // 05c: dup_x1
      // 05d: swap
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: invokespecial com/zelix/kx.N ([Ljava/lang/Object;)V
      // 064: istore 11
      // 066: aload 0
      // 067: ldc2_w 1009829788873835733
      // 06a: lload 4
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 11
      // 073: ifeq 09a
      // 076: ifeq 115
      // 079: goto 087
      // 07c: ldc2_w 1702112935159720918
      // 07f: lload 4
      // 081: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 0
      // 088: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 08b: arraylength
      // 08c: goto 09a
      // 08f: ldc2_w 1702112935159720918
      // 092: lload 4
      // 094: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: istore 12
      // 09c: aload 6
      // 09e: iload 12
      // 0a0: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0a3: bipush 0
      // 0a4: istore 13
      // 0a6: iload 13
      // 0a8: iload 12
      // 0aa: if_icmpge 109
      // 0ad: aload 0
      // 0ae: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 0b1: iload 13
      // 0b3: aaload
      // 0b4: lload 7
      // 0b6: aload 6
      // 0b8: aload 2
      // 0b9: aload 3
      // 0ba: bipush 4
      // 0bb: anewarray 62
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 3
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 2
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w 857956793085722750
      // 0d9: lload 4
      // 0db: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: iinc 13 1
      // 0e3: iload 11
      // 0e5: lload 4
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: ifle 0f1
      // 0ec: ifeq 133
      // 0ef: iload 11
      // 0f1: ifne 0a6
      // 0f4: lload 4
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 0e3
      // 0fb: goto 109
      // 0fe: ldc2_w 1702112935159720918
      // 101: lload 4
      // 103: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: lload 4
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 125
      // 110: iload 11
      // 112: ifne 133
      // 115: aload 6
      // 117: aload 0
      // 118: ldc2_w 988812052272789927
      // 11b: lload 4
      // 11d: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: invokevirtual java/io/DataOutputStream.write ([B)V
      // 125: goto 133
      // 128: ldc2_w 1702112935159720918
      // 12b: lload 4
      // 12d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int g(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      byte var6 = m44.a<"n">(-22607516224745753L, var4);

      label76: {
         try {
            byte var10000 = m44.a<"p">(this, -1801850721672025048L, var4);
            if (var6 == 0) {
               return var10000;
            }

            if (var10000 != 0) {
               break label76;
            }
         } catch (n9 var12) {
            throw m44.a<"n">(var12, -44413443736796373L, var4);
         }

         return m44.a<"p">(this, -1925887157155409574L, var4).length;
      }

      int var7 = 1;
      int var8 = this.o.length;
      int var9 = 0;

      label47:
      while (var9 < var8) {
         var7 += m44.a<"q">(this.o[var9], new Object[0], -556666900674911338L, var4);

         try {
            var9++;
         } catch (n9 var11) {
            boolean var10001 = false;
            throw m44.a<"n">(var11, -44413443736796373L, var4);
         }

         do {
            try {
               if (var1 <= 0) {
                  return var6;
               }

               if (var6 == 0) {
                  return this.W;
               }

               if (var6 != 0) {
                  continue label47;
               }
            } catch (n9 var10) {
               boolean var15 = false;
               throw m44.a<"n">(var10, -44413443736796373L, var4);
            }
         } while (var3 < 0);
         break;
      }

      this.W = var7;
      return this.W;
   }

   public void M(Object[] param1) {
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
      // 004: checkcast com/zelix/u5
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 7
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/util/List
      // 025: astore 2
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/to
      // 02c: astore 3
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/util/List
      // 033: astore 6
      // 035: pop
      // 036: getstatic com/zelix/k3.a J
      // 039: lload 7
      // 03b: lxor
      // 03c: lstore 7
      // 03e: lload 7
      // 040: dup2
      // 041: ldc2_w 9575439365937
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 121001856143804
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 26303218727649
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 128845729032396
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 32
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 15
      // 061: dup2
      // 062: bipush 32
      // 064: lshl
      // 065: bipush 56
      // 067: lushr
      // 068: l2i
      // 069: istore 16
      // 06b: dup2
      // 06c: bipush 40
      // 06e: lshl
      // 06f: bipush 40
      // 071: lushr
      // 072: l2i
      // 073: istore 17
      // 075: pop2
      // 076: pop2
      // 077: aload 5
      // 079: lload 13
      // 07b: bipush 1
      // 07c: anewarray 62
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w 1035895087169303971
      // 08b: lload 7
      // 08d: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: istore 19
      // 094: ldc2_w 1685432278714639915
      // 097: lload 7
      // 099: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: aload 5
      // 0a0: bipush 0
      // 0a1: anewarray 62
      // 0a4: ldc2_w 1475679011181564153
      // 0a7: lload 7
      // 0a9: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: istore 20
      // 0b0: istore 18
      // 0b2: iload 19
      // 0b4: anewarray 122
      // 0b7: astore 21
      // 0b9: aload 5
      // 0bb: lload 11
      // 0bd: bipush 1
      // 0be: anewarray 62
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w 847518499541393148
      // 0cd: lload 7
      // 0cf: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: astore 22
      // 0d6: bipush 0
      // 0d7: istore 23
      // 0d9: aload 22
      // 0db: iload 23
      // 0dd: iaload
      // 0de: istore 24
      // 0e0: bipush 0
      // 0e1: istore 25
      // 0e3: bipush 0
      // 0e4: istore 26
      // 0e6: iload 26
      // 0e8: iload 19
      // 0ea: if_icmpge 1be
      // 0ed: lload 7
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: iflt 1de
      // 0f4: iload 26
      // 0f6: iload 18
      // 0f8: ifeq 1dd
      // 0fb: iload 24
      // 0fd: iload 18
      // 0ff: ifeq 163
      // 102: goto 110
      // 105: ldc2_w 1706375089734937575
      // 108: lload 7
      // 10a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: if_icmpne 199
      // 113: goto 121
      // 116: ldc2_w 1706375089734937575
      // 119: lload 7
      // 11b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 21
      // 123: iload 26
      // 125: new com/zelix/bz
      // 128: dup
      // 129: aload 0
      // 12a: aload 3
      // 12b: lload 9
      // 12d: aload 6
      // 12f: invokespecial com/zelix/bz.<init> (Lcom/zelix/k3;Lcom/zelix/to;JLjava/util/List;)V
      // 132: aastore
      // 133: iinc 23 1
      // 136: iload 23
      // 138: lload 7
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: iflt 18f
      // 13f: iload 18
      // 141: ifeq 18b
      // 144: goto 152
      // 147: ldc2_w 1706375089734937575
      // 14a: lload 7
      // 14c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 22
      // 154: arraylength
      // 155: goto 163
      // 158: ldc2_w 1706375089734937575
      // 15b: lload 7
      // 15d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: if_icmpge 179
      // 166: aload 22
      // 168: iload 23
      // 16a: iaload
      // 16b: istore 24
      // 16d: iload 18
      // 16f: lload 7
      // 171: lconst_0
      // 172: lcmp
      // 173: iflt 1bb
      // 176: ifne 1b6
      // 179: getstatic com/zelix/k3.i J
      // 17c: l2i
      // 17d: goto 18b
      // 180: ldc2_w 1706375089734937575
      // 183: lload 7
      // 185: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: istore 24
      // 18d: iload 18
      // 18f: lload 7
      // 191: lconst_0
      // 192: lcmp
      // 193: ifle 1bb
      // 196: ifne 1b6
      // 199: aload 21
      // 19b: iload 26
      // 19d: aload 0
      // 19e: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 1a1: iload 25
      // 1a3: iinc 25 1
      // 1a6: aaload
      // 1a7: aastore
      // 1a8: goto 1b6
      // 1ab: ldc2_w 1706375089734937575
      // 1ae: lload 7
      // 1b0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: iinc 26 1
      // 1b9: iload 18
      // 1bb: ifne 0e6
      // 1be: aload 0
      // 1bf: aload 21
      // 1c1: putfield com/zelix/k3.o [Lcom/zelix/bz;
      // 1c4: lload 7
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: iflt 0ed
      // 1cb: aload 0
      // 1cc: iload 15
      // 1ce: iload 16
      // 1d0: i2b
      // 1d1: iload 17
      // 1d3: ldc2_w 1200233845815460271
      // 1d6: lload 7
      // 1d8: invokedynamic u (Ljava/lang/Object;IBIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: pop
      // 1de: return
   }

   protected void c(Object[] param1) {
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
      // 016: ldc2_w 0
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 12374223908362
      // 020: lxor
      // 021: lstore 7
      // 023: pop2
      // 024: ldc2_w 1272493964096652623
      // 027: lload 2
      // 028: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: lload 5
      // 030: aload 4
      // 032: bipush 2
      // 033: anewarray 62
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
      // 044: invokespecial com/zelix/kx.c ([Ljava/lang/Object;)V
      // 047: istore 9
      // 049: aload 0
      // 04a: ldc2_w 1198408428474194551
      // 04d: lload 2
      // 04e: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: iload 9
      // 055: ifne 07a
      // 058: ifeq 0e4
      // 05b: goto 068
      // 05e: ldc2_w 665730617726334324
      // 061: lload 2
      // 062: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 06c: arraylength
      // 06d: goto 07a
      // 070: ldc2_w 665730617726334324
      // 073: lload 2
      // 074: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: istore 10
      // 07c: aload 4
      // 07e: iload 10
      // 080: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 083: bipush 0
      // 084: istore 11
      // 086: iload 11
      // 088: iload 10
      // 08a: if_icmpge 0d9
      // 08d: aload 0
      // 08e: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 091: iload 11
      // 093: aaload
      // 094: aload 4
      // 096: lload 7
      // 098: bipush 2
      // 099: anewarray 62
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 1
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: ldc2_w 1115945276842499428
      // 0ad: lload 2
      // 0ae: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: iinc 11 1
      // 0b6: iload 9
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0c3
      // 0be: ifne 100
      // 0c1: iload 9
      // 0c3: ifeq 086
      // 0c6: lload 2
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 0b6
      // 0cc: goto 0d9
      // 0cf: ldc2_w 665730617726334324
      // 0d2: lload 2
      // 0d3: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: lload 2
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 0f3
      // 0df: iload 9
      // 0e1: ifeq 100
      // 0e4: aload 4
      // 0e6: aload 0
      // 0e7: ldc2_w 1376640891870979845
      // 0ea: lload 2
      // 0eb: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: invokevirtual java/io/DataOutputStream.write ([B)V
      // 0f3: goto 100
      // 0f6: ldc2_w 665730617726334324
      // 0f9: lload 2
      // 0fa: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: return
   }

   k3(_4 param1, int param2, String param3, h1 param4, l6q param5, PrintWriter param6, long param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/k3.a J
      // 003: lload 7
      // 005: lxor
      // 006: lstore 7
      // 008: lload 7
      // 00a: dup2
      // 00b: ldc2_w 96136291610248
      // 00e: lxor
      // 00f: lstore 9
      // 011: dup2
      // 012: ldc2_w 87915222608148
      // 015: lxor
      // 016: dup2
      // 017: bipush 32
      // 019: lushr
      // 01a: l2i
      // 01b: istore 11
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 12
      // 027: dup2
      // 028: bipush 48
      // 02a: lshl
      // 02b: bipush 48
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 13
      // 031: pop2
      // 032: dup2
      // 033: ldc2_w 100722135756696
      // 036: lxor
      // 037: lstore 14
      // 039: dup2
      // 03a: ldc2_w 57643126964444
      // 03d: lxor
      // 03e: lstore 16
      // 040: dup2
      // 041: ldc2_w 1334712510839
      // 044: lxor
      // 045: lstore 18
      // 047: dup2
      // 048: ldc2_w 62896849747080
      // 04b: lxor
      // 04c: lstore 20
      // 04e: pop2
      // 04f: aload 0
      // 050: aload 1
      // 051: iload 2
      // 052: lload 20
      // 054: aload 3
      // 055: aload 4
      // 057: aload 5
      // 059: invokespecial com/zelix/kx.<init> (Lcom/zelix/_4;IJLjava/lang/String;Lcom/zelix/h1;Lcom/zelix/l6q;)V
      // 05c: aload 0
      // 05d: getfield com/zelix/k3.W I
      // 060: newarray 8
      // 062: astore 23
      // 064: ldc2_w -4500225049097817917
      // 067: lload 7
      // 069: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: aload 4
      // 070: aload 23
      // 072: invokevirtual com/zelix/h1.read ([B)I
      // 075: pop
      // 076: aload 23
      // 078: bipush 0
      // 079: lload 18
      // 07b: bipush 3
      // 07c: anewarray 62
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 2
      // 086: swap
      // 087: aastore
      // 088: dup_x1
      // 089: swap
      // 08a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x1
      // 091: swap
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w -2663606421815613504
      // 098: lload 7
      // 09a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/h1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: astore 24
      // 0a1: istore 22
      // 0a3: aload 0
      // 0a4: iload 22
      // 0a6: ifeq 227
      // 0a9: getfield com/zelix/k3.W I
      // 0ac: bipush 2
      // 0ad: if_icmplt 20c
      // 0b0: goto 0be
      // 0b3: ldc2_w -4519813536803767025
      // 0b6: lload 7
      // 0b8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 24
      // 0c0: invokevirtual com/zelix/h1.readUnsignedByte ()I
      // 0c3: istore 25
      // 0c5: aload 0
      // 0c6: iload 25
      // 0c8: anewarray 122
      // 0cb: putfield com/zelix/k3.o [Lcom/zelix/bz;
      // 0ce: bipush 0
      // 0cf: istore 26
      // 0d1: iload 26
      // 0d3: iload 25
      // 0d5: if_icmpge 1f9
      // 0d8: aload 0
      // 0d9: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 0dc: iload 26
      // 0de: new com/zelix/bz
      // 0e1: dup
      // 0e2: aload 0
      // 0e3: aload 24
      // 0e5: aload 5
      // 0e7: iload 11
      // 0e9: iload 12
      // 0eb: i2c
      // 0ec: iload 13
      // 0ee: i2s
      // 0ef: invokespecial com/zelix/bz.<init> (Lcom/zelix/_4;Lcom/zelix/h1;Lcom/zelix/l6q;ICS)V
      // 0f2: aastore
      // 0f3: iload 22
      // 0f5: lload 7
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 101
      // 0fc: ifeq 2a3
      // 0ff: iload 22
      // 101: lload 7
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 1f6
      // 108: ifeq 1f4
      // 10b: goto 119
      // 10e: ldc2_w -4519813536803767025
      // 111: lload 7
      // 113: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 0
      // 11a: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 11d: iload 26
      // 11f: aaload
      // 120: lload 9
      // 122: bipush 1
      // 123: anewarray 62
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w -4154751656291757592
      // 132: lload 7
      // 134: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: ifne 1f1
      // 13c: goto 14a
      // 13f: ldc2_w -4519813536803767025
      // 142: lload 7
      // 144: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 0
      // 14b: bipush 0
      // 14c: ldc2_w -2820702604707032564
      // 14f: lload 7
      // 151: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: aload 0
      // 157: aload 23
      // 159: ldc2_w -2638673520550350978
      // 15c: lload 7
      // 15e: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: aload 6
      // 165: new java/lang/StringBuilder
      // 168: dup
      // 169: invokespecial java/lang/StringBuilder.<init> ()V
      // 16c: sipush 14018
      // 16f: ldc2_w 3389212509021302987
      // 172: lload 7
      // 174: lxor
      // 175: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: aload 0
      // 17e: lload 16
      // 180: invokevirtual com/zelix/k3.j (J)Ljava/lang/String;
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: sipush 19456
      // 189: ldc2_w 5206249360426863117
      // 18c: lload 7
      // 18e: lxor
      // 18f: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: aload 0
      // 198: bipush 0
      // 199: anewarray 62
      // 19c: ldc2_w -2464216075410437598
      // 19f: lload 7
      // 1a1: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: sipush 12551
      // 1ac: ldc2_w 3499089125075154699
      // 1af: lload 7
      // 1b1: lxor
      // 1b2: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ba: aload 0
      // 1bb: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 1be: iload 26
      // 1c0: aaload
      // 1c1: lload 14
      // 1c3: bipush 1
      // 1c4: anewarray 62
      // 1c7: dup_x2
      // 1c8: dup_x2
      // 1c9: pop
      // 1ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: ldc2_w -2366691649130061046
      // 1d3: lload 7
      // 1d5: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e0: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1e3: goto 1f1
      // 1e6: ldc2_w -4519813536803767025
      // 1e9: lload 7
      // 1eb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: iinc 26 1
      // 1f4: iload 22
      // 1f6: ifne 0d1
      // 1f9: lload 7
      // 1fb: lconst_0
      // 1fc: lcmp
      // 1fd: ifle 2a3
      // 200: iload 22
      // 202: lload 7
      // 204: lconst_0
      // 205: lcmp
      // 206: ifle 0f5
      // 209: ifne 297
      // 20c: aload 0
      // 20d: bipush 0
      // 20e: ldc2_w -2820702604707032564
      // 211: lload 7
      // 213: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: aload 0
      // 219: goto 227
      // 21c: ldc2_w -4519813536803767025
      // 21f: lload 7
      // 221: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: aload 23
      // 229: ldc2_w -2638673520550350978
      // 22c: lload 7
      // 22e: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: aload 6
      // 235: new java/lang/StringBuilder
      // 238: dup
      // 239: invokespecial java/lang/StringBuilder.<init> ()V
      // 23c: sipush 28886
      // 23f: ldc2_w 4011947456523712222
      // 242: lload 7
      // 244: lxor
      // 245: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: aload 0
      // 24e: lload 16
      // 250: invokevirtual com/zelix/k3.j (J)Ljava/lang/String;
      // 253: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 256: sipush 13695
      // 259: ldc2_w 2477902904502743921
      // 25c: lload 7
      // 25e: lxor
      // 25f: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 267: aload 0
      // 268: bipush 0
      // 269: anewarray 62
      // 26c: ldc2_w -2464216075410437598
      // 26f: lload 7
      // 271: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 279: sipush 22577
      // 27c: ldc2_w 4811038967661567550
      // 27f: lload 7
      // 281: lxor
      // 282: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28a: aload 0
      // 28b: getfield com/zelix/k3.W I
      // 28e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 291: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 294: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 297: aload 24
      // 299: ldc2_w -4095160477786846720
      // 29c: lload 7
      // 29e: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: goto 343
      // 2a6: astore 25
      // 2a8: aload 0
      // 2a9: bipush 0
      // 2aa: ldc2_w -2820702604707032564
      // 2ad: lload 7
      // 2af: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: aload 0
      // 2b5: aload 23
      // 2b7: ldc2_w -2638673520550350978
      // 2ba: lload 7
      // 2bc: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: aload 6
      // 2c3: new java/lang/StringBuilder
      // 2c6: dup
      // 2c7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ca: sipush 28886
      // 2cd: ldc2_w 4011947456523712222
      // 2d0: lload 7
      // 2d2: lxor
      // 2d3: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2db: aload 0
      // 2dc: lload 16
      // 2de: invokevirtual com/zelix/k3.j (J)Ljava/lang/String;
      // 2e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e4: sipush 13695
      // 2e7: ldc2_w 2477902904502743921
      // 2ea: lload 7
      // 2ec: lxor
      // 2ed: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 0
      // 2f6: bipush 0
      // 2f7: anewarray 62
      // 2fa: ldc2_w -2464216075410437598
      // 2fd: lload 7
      // 2ff: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 307: sipush 1562
      // 30a: ldc2_w 7852902789338841105
      // 30d: lload 7
      // 30f: lxor
      // 310: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/k3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 318: aload 25
      // 31a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 31d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 320: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 323: aload 24
      // 325: ldc2_w -4095160477786846720
      // 328: lload 7
      // 32a: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: goto 343
      // 332: astore 27
      // 334: aload 24
      // 336: ldc2_w -4095160477786846720
      // 339: lload 7
      // 33b: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: aload 27
      // 342: athrow
      // 343: return
   }

   void V(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/k3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 81892369130847
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: aload 0
      // 1c: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 1f: arraylength
      // 20: istore 7
      // 22: ldc2_w 7217493869466824910
      // 25: lload 2
      // 26: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 0
      // 2c: istore 8
      // 2e: istore 6
      // 30: iload 8
      // 32: iload 7
      // 34: if_icmpge 68
      // 37: aload 0
      // 38: getfield com/zelix/k3.o [Lcom/zelix/bz;
      // 3b: iload 8
      // 3d: aaload
      // 3e: lload 4
      // 40: iload 8
      // 42: bipush 2
      // 43: anewarray 62
      // 46: dup_x1
      // 47: swap
      // 48: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4b: bipush 1
      // 4c: swap
      // 4d: aastore
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 0
      // 55: swap
      // 56: aastore
      // 57: ldc2_w 6935720644662819217
      // 5a: lload 2
      // 5b: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: iinc 8 1
      // 63: iload 6
      // 65: ifeq 30
      // 68: lload 2
      // 69: lconst_0
      // 6a: lcmp
      // 6b: iflt 63
      // 6e: return
   }

   static {
      long var5 = a ^ 6877630629504L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[7];
      int var12 = 0;
      String var11 = "¥ü\u0092\u009d\"½\u001d\u0094°g \u009fÇ\u0094q%\u0010&þ\u0081w\u0018QÐ\u009f\u0089¦f\u0096¿Íå\u0082 á\u0081÷\u0086¤@\u0011\u000e\u0012l!\u001bÆW¹ \u008b\u008eªT\u0014:\u00adGãd¤L\u008c\u000bæ1\u0010.øa\u0001A-\u001cÿ\u009b\"±@£Òù\u0011\u0010\u0090\u0017#uû`Û¢üý¦\u0090î\u0080O\u0005";
      int var13 = "¥ü\u0092\u009d\"½\u001d\u0094°g \u009fÇ\u0094q%\u0010&þ\u0081w\u0018QÐ\u009f\u0089¦f\u0096¿Íå\u0082 á\u0081÷\u0086¤@\u0011\u000e\u0012l!\u001bÆW¹ \u008b\u008eªT\u0014:\u00adGãd¤L\u008c\u000bæ1\u0010.øa\u0001A-\u001cÿ\u009b\"±@£Òù\u0011\u0010\u0090\u0017#uû`Û¢üý¦\u0090î\u0080O\u0005"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = c(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     c = var14;
                     d = new String[7];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 2481627223177404701L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     i = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u0082\u008dd7\nÂ4Ø4Áùjª\u0099\u00ada(\u0097Þ£c\u001e\u0088s?\u0086û\u0081íÑ\u0096Ù\u007f\u0096óm§Ý¹¯÷\u0082\u000eG²§<\u000f0Q\u009etµ\u008eM#®";
                  var13 = "\u0082\u008dd7\nÂ4Ø4Áùjª\u0099\u00ada(\u0097Þ£c\u001e\u0088s?\u0086û\u0081íÑ\u0096Ù\u007f\u0096óm§Ý¹¯÷\u0082\u000eG²§<\u000f0Q\u009etµ\u008eM#®"
                     .length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5272;
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
            throw new RuntimeException("com/zelix/k3", var10);
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
         throw new RuntimeException("com/zelix/k3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
