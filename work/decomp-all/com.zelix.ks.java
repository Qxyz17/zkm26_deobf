package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ks extends kw implements ni {
   bi[] O;
   byte[] E;
   int c;
   boolean F;
   private static final long a = prr.a(7080428522475299323L, -634462087426210541L, MethodHandles.lookup().lookupClass()).a(65415086684624L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;

   void k(Object[] var1) {
      df var2 = (df)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 140714081318610L;
      boolean var7 = m44.a<"k">(4857878629024339853L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"u">(this, 5045589028681757627L, var3);
            if (var7) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var9) {
            throw m44.a<"k">(var9, 6378072139198872114L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.O.length) {
         m44.a<"t">(this.O[var8], new Object[]{var5, var2}, 6601798997699100094L, var3);
         var8++;
         if (var7) {
            break;
         }
      }
   }

   protected void N(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/Map
      // 0e: astore 4
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/lqu
      // 21: astore 2
      // 22: pop
      // 23: lload 5
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w 1083949478671047661
      // 30: lload 5
      // 32: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 0
      // 38: aload 3
      // 39: aload 4
      // 3b: lload 7
      // 3d: aload 2
      // 3e: bipush 4
      // 3f: anewarray 463
      // 42: dup_x1
      // 43: swap
      // 44: bipush 3
      // 45: swap
      // 46: aastore
      // 47: dup_x2
      // 48: dup_x2
      // 49: pop
      // 4a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d: bipush 2
      // 4e: swap
      // 4f: aastore
      // 50: dup_x1
      // 51: swap
      // 52: bipush 1
      // 53: swap
      // 54: aastore
      // 55: dup_x1
      // 56: swap
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: invokespecial com/zelix/kw.N ([Ljava/lang/Object;)V
      // 5d: istore 9
      // 5f: aload 0
      // 60: ldc2_w 749243421611425755
      // 63: lload 5
      // 65: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: iload 9
      // 6c: ifne 97
      // 6f: ifeq e2
      // 72: goto 80
      // 75: ldc2_w 1505088757909354066
      // 78: lload 5
      // 7a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 3
      // 81: aload 0
      // 82: getfield com/zelix/ks.c I
      // 85: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 88: bipush 0
      // 89: goto 97
      // 8c: ldc2_w 1505088757909354066
      // 8f: lload 5
      // 91: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: istore 10
      // 99: iload 10
      // 9b: aload 0
      // 9c: getfield com/zelix/ks.c I
      // 9f: if_icmpge d6
      // a2: aload 0
      // a3: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // a6: iload 10
      // a8: aaload
      // a9: aload 3
      // aa: invokevirtual com/zelix/bi.k (Ljava/io/DataOutputStream;)V
      // ad: iinc 10 1
      // b0: iload 9
      // b2: lload 5
      // b4: lconst_0
      // b5: lcmp
      // b6: ifle be
      // b9: ifne ff
      // bc: iload 9
      // be: ifeq 99
      // c1: lload 5
      // c3: lconst_0
      // c4: lcmp
      // c5: iflt b0
      // c8: goto d6
      // cb: ldc2_w 1505088757909354066
      // ce: lload 5
      // d0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: lload 5
      // d8: lconst_0
      // d9: lcmp
      // da: ifle f1
      // dd: iload 9
      // df: ifeq ff
      // e2: aload 3
      // e3: aload 0
      // e4: ldc2_w 1206783782547144691
      // e7: lload 5
      // e9: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: invokevirtual java/io/DataOutputStream.write ([B)V
      // f1: goto ff
      // f4: ldc2_w 1505088757909354066
      // f7: lload 5
      // f9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fe: athrow
      // ff: return
   }

   protected void c(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w 716282175763740856
      // 1f: lload 3
      // 20: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: lload 5
      // 28: aload 2
      // 29: bipush 2
      // 2a: anewarray 463
      // 2d: dup_x1
      // 2e: swap
      // 2f: bipush 1
      // 30: swap
      // 31: aastore
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: invokespecial com/zelix/kw.c ([Ljava/lang/Object;)V
      // 3e: istore 7
      // 40: aload 0
      // 41: ldc2_w 1497411856566149497
      // 44: lload 3
      // 45: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: iload 7
      // 4c: ifeq 75
      // 4f: ifeq bc
      // 52: goto 5f
      // 55: ldc2_w 738905392875694320
      // 58: lload 3
      // 59: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 2
      // 60: aload 0
      // 61: getfield com/zelix/ks.c I
      // 64: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 67: bipush 0
      // 68: goto 75
      // 6b: ldc2_w 738905392875694320
      // 6e: lload 3
      // 6f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: istore 8
      // 77: iload 8
      // 79: aload 0
      // 7a: getfield com/zelix/ks.c I
      // 7d: if_icmpge b1
      // 80: aload 0
      // 81: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 84: iload 8
      // 86: aaload
      // 87: aload 2
      // 88: invokevirtual com/zelix/bi.k (Ljava/io/DataOutputStream;)V
      // 8b: iinc 8 1
      // 8e: iload 7
      // 90: lload 3
      // 91: lconst_0
      // 92: lcmp
      // 93: iflt 9b
      // 96: ifeq d7
      // 99: iload 7
      // 9b: ifne 77
      // 9e: lload 3
      // 9f: lconst_0
      // a0: lcmp
      // a1: ifle 8e
      // a4: goto b1
      // a7: ldc2_w 738905392875694320
      // aa: lload 3
      // ab: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: lload 3
      // b2: lconst_0
      // b3: lcmp
      // b4: iflt ca
      // b7: iload 7
      // b9: ifne d7
      // bc: aload 2
      // bd: aload 0
      // be: ldc2_w 1017078761453756753
      // c1: lload 3
      // c2: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: invokevirtual java/io/DataOutputStream.write ([B)V
      // ca: goto d7
      // cd: ldc2_w 738905392875694320
      // d0: lload 3
      // d1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: athrow
      // d7: return
   }

   void I(Object[] param1) {
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
      // 00e: checkcast java/util/HashSet
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/df
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/ks.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 6955020291887
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 64193410948000
      // 02e: lxor
      // 02f: lstore 8
      // 031: pop2
      // 032: ldc2_w 4929749674274197646
      // 035: lload 2
      // 036: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: istore 10
      // 03d: aload 0
      // 03e: ldc2_w 4685665109487137976
      // 041: lload 2
      // 042: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: iload 10
      // 049: ifne 074
      // 04c: ifeq 1e0
      // 04f: goto 05c
      // 052: ldc2_w 6881549963029953841
      // 055: lload 2
      // 056: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 5
      // 05e: ldc2_w 6826074404256123972
      // 061: lload 2
      // 062: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: goto 074
      // 06a: ldc2_w 6881549963029953841
      // 06d: lload 2
      // 06e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: ifle 1e0
      // 077: new java/util/ArrayList
      // 07a: dup
      // 07b: aload 0
      // 07c: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 07f: arraylength
      // 080: invokespecial java/util/ArrayList.<init> (I)V
      // 083: astore 11
      // 085: bipush 0
      // 086: istore 12
      // 088: iload 12
      // 08a: aload 0
      // 08b: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 08e: arraylength
      // 08f: if_icmpge 17b
      // 092: aload 0
      // 093: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 096: iload 12
      // 098: aaload
      // 099: bipush 0
      // 09a: anewarray 463
      // 09d: ldc2_w 4876284425236634239
      // 0a0: lload 2
      // 0a1: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: astore 13
      // 0a8: aload 5
      // 0aa: aload 13
      // 0ac: ldc2_w 6688869682522616435
      // 0af: lload 2
      // 0b0: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: iload 10
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: ifle 188
      // 0bd: ifne 186
      // 0c0: iload 10
      // 0c2: ifne 149
      // 0c5: goto 0d2
      // 0c8: ldc2_w 6881549963029953841
      // 0cb: lload 2
      // 0cc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: lload 2
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 13c
      // 0d8: ifne 10d
      // 0db: goto 0e8
      // 0de: ldc2_w 6881549963029953841
      // 0e1: lload 2
      // 0e2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 11
      // 0ea: aload 0
      // 0eb: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 0ee: iload 12
      // 0f0: aaload
      // 0f1: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0f4: pop
      // 0f5: iload 10
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 178
      // 0fd: ifeq 173
      // 100: goto 10d
      // 103: ldc2_w 6881549963029953841
      // 106: lload 2
      // 107: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: aload 4
      // 10f: aload 13
      // 111: aload 0
      // 112: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 115: iload 12
      // 117: aaload
      // 118: lload 6
      // 11a: dup2_x1
      // 11b: pop2
      // 11c: bipush 3
      // 11d: anewarray 463
      // 120: dup_x1
      // 121: swap
      // 122: bipush 2
      // 123: swap
      // 124: aastore
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w 4884743217182780266
      // 136: lload 2
      // 137: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: goto 149
      // 13f: ldc2_w 6881549963029953841
      // 142: lload 2
      // 143: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: istore 14
      // 14b: aload 13
      // 14d: lload 8
      // 14f: ldc2_w 6847701933180036768
      // 152: lload 2
      // 153: invokedynamic l (JJ)Lcom/zelix/ow; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: bipush 2
      // 159: anewarray 463
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
      // 16a: ldc2_w 4973357595147645456
      // 16d: lload 2
      // 16e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: iinc 12 1
      // 176: iload 10
      // 178: ifeq 088
      // 17b: aload 11
      // 17d: lload 2
      // 17e: lconst_0
      // 17f: lcmp
      // 180: iflt 1a8
      // 183: invokevirtual java/util/ArrayList.size ()I
      // 186: iload 10
      // 188: lload 2
      // 189: lconst_0
      // 18a: lcmp
      // 18b: ifle 196
      // 18e: ifne 1b8
      // 191: aload 0
      // 192: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 195: arraylength
      // 196: if_icmpge 1e0
      // 199: goto 1a6
      // 19c: ldc2_w 6881549963029953841
      // 19f: lload 2
      // 1a0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: aload 11
      // 1a8: invokevirtual java/util/ArrayList.size ()I
      // 1ab: goto 1b8
      // 1ae: ldc2_w 6881549963029953841
      // 1b1: lload 2
      // 1b2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: anewarray 287
      // 1bb: astore 12
      // 1bd: aload 0
      // 1be: aload 11
      // 1c0: aload 12
      // 1c2: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c5: checkcast [Lcom/zelix/bi;
      // 1c8: putfield com/zelix/ks.O [Lcom/zelix/bi;
      // 1cb: aload 0
      // 1cc: aload 0
      // 1cd: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 1d0: arraylength
      // 1d1: putfield com/zelix/ks.c I
      // 1d4: aload 0
      // 1d5: aload 0
      // 1d6: getfield com/zelix/ks.c I
      // 1d9: bipush 4
      // 1da: imul
      // 1db: bipush 2
      // 1dc: iadd
      // 1dd: putfield com/zelix/ks.W I
      // 1e0: return
   }

   ks(_4 param1, int param2, String param3, h1 param4, l6q param5, PrintWriter param6, l6q param7, long param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ks.a J
      // 003: lload 8
      // 005: lxor
      // 006: lstore 8
      // 008: lload 8
      // 00a: dup2
      // 00b: ldc2_w 4819919453649
      // 00e: lxor
      // 00f: dup2
      // 010: bipush 32
      // 012: lushr
      // 013: lstore 10
      // 015: dup2
      // 016: bipush 32
      // 018: lshl
      // 019: bipush 32
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 12
      // 01f: pop2
      // 020: dup2
      // 021: ldc2_w 82609078927245
      // 024: lxor
      // 025: lstore 13
      // 027: dup2
      // 028: ldc2_w 77566743346496
      // 02b: lxor
      // 02c: lstore 15
      // 02e: pop2
      // 02f: ldc2_w -7307770348675994659
      // 032: lload 8
      // 034: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: aload 0
      // 03a: aload 1
      // 03b: iload 2
      // 03c: aload 3
      // 03d: lload 15
      // 03f: aload 4
      // 041: aload 5
      // 043: invokespecial com/zelix/kw.<init> (Lcom/zelix/_4;ILjava/lang/String;JLcom/zelix/h1;Lcom/zelix/l6q;)V
      // 046: istore 17
      // 048: aload 0
      // 049: bipush 1
      // 04a: ldc2_w -8673146282957934052
      // 04d: lload 8
      // 04f: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 0
      // 055: getfield com/zelix/ks.W I
      // 058: iload 17
      // 05a: ifeq 2ae
      // 05d: bipush 2
      // 05e: if_icmplt 217
      // 061: goto 06f
      // 064: ldc2_w -7411739969898251371
      // 067: lload 8
      // 069: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 4
      // 072: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 075: putfield com/zelix/ks.c I
      // 078: aload 0
      // 079: getfield com/zelix/ks.c I
      // 07c: bipush 4
      // 07d: imul
      // 07e: bipush 2
      // 07f: iadd
      // 080: lload 8
      // 082: lconst_0
      // 083: lcmp
      // 084: iflt 20d
      // 087: iload 17
      // 089: ifeq 20a
      // 08c: goto 09a
      // 08f: ldc2_w -7411739969898251371
      // 092: lload 8
      // 094: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield com/zelix/ks.W I
      // 09e: if_icmpne 112
      // 0a1: goto 0af
      // 0a4: ldc2_w -7411739969898251371
      // 0a7: lload 8
      // 0a9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: aload 0
      // 0b1: getfield com/zelix/ks.c I
      // 0b4: anewarray 287
      // 0b7: putfield com/zelix/ks.O [Lcom/zelix/bi;
      // 0ba: bipush 0
      // 0bb: istore 18
      // 0bd: iload 18
      // 0bf: aload 0
      // 0c0: getfield com/zelix/ks.c I
      // 0c3: if_icmpge 106
      // 0c6: aload 0
      // 0c7: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 0ca: iload 18
      // 0cc: new com/zelix/bi
      // 0cf: dup
      // 0d0: lload 10
      // 0d2: iload 12
      // 0d4: aload 0
      // 0d5: aload 4
      // 0d7: aload 7
      // 0d9: invokespecial com/zelix/bi.<init> (JILcom/zelix/_4;Lcom/zelix/h1;Lcom/zelix/l6q;)V
      // 0dc: aastore
      // 0dd: iinc 18 1
      // 0e0: iload 17
      // 0e2: lload 8
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifle 0ee
      // 0e9: ifeq 2af
      // 0ec: iload 17
      // 0ee: ifne 0bd
      // 0f1: lload 8
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 0e0
      // 0f8: goto 106
      // 0fb: ldc2_w -7411739969898251371
      // 0fe: lload 8
      // 100: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: iload 17
      // 108: lload 8
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 1fc
      // 10f: ifne 2af
      // 112: aload 0
      // 113: bipush 0
      // 114: ldc2_w -8673146282957934052
      // 117: lload 8
      // 119: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: aload 6
      // 120: new java/lang/StringBuilder
      // 123: dup
      // 124: invokespecial java/lang/StringBuilder.<init> ()V
      // 127: sipush 13497
      // 12a: ldc2_w 7082436587917747371
      // 12d: lload 8
      // 12f: lxor
      // 130: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: aload 0
      // 139: lload 13
      // 13b: invokevirtual com/zelix/ks.f (J)Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: sipush 8880
      // 144: ldc2_w 3328487656859579043
      // 147: lload 8
      // 149: lxor
      // 14a: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 152: sipush 8869
      // 155: ldc2_w 2241052410839577266
      // 158: lload 8
      // 15a: lxor
      // 15b: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: sipush 25802
      // 166: ldc2_w 7724011318301422814
      // 169: lload 8
      // 16b: lxor
      // 16c: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 17a: aload 0
      // 17b: aload 0
      // 17c: getfield com/zelix/ks.W I
      // 17f: newarray 8
      // 181: ldc2_w -7099844614180031948
      // 184: lload 8
      // 186: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: aload 0
      // 18c: ldc2_w -7099844614180031948
      // 18f: lload 8
      // 191: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: bipush 0
      // 197: aload 0
      // 198: getfield com/zelix/ks.c I
      // 19b: sipush 11571
      // 19e: ldc2_w 7368820808367407223
      // 1a1: lload 8
      // 1a3: lxor
      // 1a4: invokedynamic e (IJ)I bsm=com/zelix/ks.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: iushr
      // 1aa: sipush 2869
      // 1ad: ldc2_w 6350207518850131571
      // 1b0: lload 8
      // 1b2: lxor
      // 1b3: invokedynamic e (IJ)I bsm=com/zelix/ks.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: iand
      // 1b9: i2b
      // 1ba: bastore
      // 1bb: aload 0
      // 1bc: ldc2_w -7099844614180031948
      // 1bf: lload 8
      // 1c1: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: bipush 1
      // 1c7: aload 0
      // 1c8: getfield com/zelix/ks.c I
      // 1cb: bipush 0
      // 1cc: iushr
      // 1cd: sipush 9936
      // 1d0: ldc2_w 5493024169552186263
      // 1d3: lload 8
      // 1d5: lxor
      // 1d6: invokedynamic e (IJ)I bsm=com/zelix/ks.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: iand
      // 1dc: i2b
      // 1dd: bastore
      // 1de: aload 4
      // 1e0: aload 0
      // 1e1: ldc2_w -7099844614180031948
      // 1e4: lload 8
      // 1e6: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: bipush 2
      // 1ec: aload 0
      // 1ed: getfield com/zelix/ks.W I
      // 1f0: bipush 2
      // 1f1: isub
      // 1f2: ldc2_w -9027870010239281837
      // 1f5: lload 8
      // 1f7: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: goto 20a
      // 1ff: ldc2_w -7411739969898251371
      // 202: lload 8
      // 204: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: pop
      // 20b: iload 17
      // 20d: lload 8
      // 20f: lconst_0
      // 210: lcmp
      // 211: ifle 2a0
      // 214: ifne 2af
      // 217: aload 0
      // 218: bipush 0
      // 219: ldc2_w -8673146282957934052
      // 21c: lload 8
      // 21e: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: aload 6
      // 225: new java/lang/StringBuilder
      // 228: dup
      // 229: invokespecial java/lang/StringBuilder.<init> ()V
      // 22c: sipush 30538
      // 22f: ldc2_w 9179036059866589019
      // 232: lload 8
      // 234: lxor
      // 235: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23d: aload 0
      // 23e: lload 13
      // 240: invokevirtual com/zelix/ks.f (J)Ljava/lang/String;
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: sipush 1763
      // 249: ldc2_w 4558874141205108470
      // 24c: lload 8
      // 24e: lxor
      // 24f: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 257: sipush 12451
      // 25a: ldc2_w 5100058427677614259
      // 25d: lload 8
      // 25f: lxor
      // 260: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 268: sipush 27290
      // 26b: ldc2_w 8295127472871602828
      // 26e: lload 8
      // 270: lxor
      // 271: invokedynamic r (IJ)Ljava/lang/String; bsm=com/zelix/ks.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 279: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27c: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 27f: aload 0
      // 280: aload 0
      // 281: getfield com/zelix/ks.W I
      // 284: newarray 8
      // 286: ldc2_w -7099844614180031948
      // 289: lload 8
      // 28b: invokedynamic p (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: aload 4
      // 292: aload 0
      // 293: ldc2_w -7099844614180031948
      // 296: lload 8
      // 298: invokedynamic r (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: invokevirtual com/zelix/h1.read ([B)I
      // 2a0: goto 2ae
      // 2a3: ldc2_w -7411739969898251371
      // 2a6: lload 8
      // 2a8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: pop
      // 2af: return
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/ks.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w 6062678571997528261
      // 1f: lload 3
      // 20: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: aload 0
      // 28: ldc2_w 5858576910548935923
      // 2b: lload 3
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: iload 5
      // 33: ifne 53
      // 36: ifne 52
      // 39: goto 46
      // 3c: ldc2_w 5749731150633348474
      // 3f: lload 3
      // 40: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 0
      // 47: ireturn
      // 48: ldc2_w 5749731150633348474
      // 4b: lload 3
      // 4c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: istore 6
      // 55: iload 6
      // 57: aload 0
      // 58: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 5b: arraylength
      // 5c: if_icmpge b4
      // 5f: aload 0
      // 60: getfield com/zelix/ks.O [Lcom/zelix/bi;
      // 63: iload 6
      // 65: aaload
      // 66: invokevirtual com/zelix/bi.q ()I
      // 69: iload 5
      // 6b: lload 3
      // 6c: lconst_0
      // 6d: lcmp
      // 6e: ifle 76
      // 71: ifne bb
      // 74: iload 5
      // 76: ifne ab
      // 79: goto 86
      // 7c: ldc2_w 5749731150633348474
      // 7f: lload 3
      // 80: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: lload 3
      // 87: lconst_0
      // 88: lcmp
      // 89: ifle b1
      // 8c: iload 2
      // 8d: if_icmpne ac
      // 90: goto 9d
      // 93: ldc2_w 5749731150633348474
      // 96: lload 3
      // 97: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto ab
      // a1: ldc2_w 5749731150633348474
      // a4: lload 3
      // a5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: ireturn
      // ac: iinc 6 1
      // af: iload 5
      // b1: ifeq 55
      // b4: lload 3
      // b5: lconst_0
      // b6: lcmp
      // b7: ifle 5f
      // ba: bipush 0
      // bb: ireturn
   }

   void i(Object[] var1) {
      long var2 = (Long)var1[0];
      ArrayList var4 = (ArrayList)var1[1];
      var2 = a ^ var2;
      boolean var5 = m44.a<"j">(4013717470350362363L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"t">(this, 3063793791329722170L, var2);
            if (!var5) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var7) {
            throw m44.a<"j">(var7, 3747617849958323891L, var2);
         }

         var10000 = 0;
      }

      int var6 = var10000;

      while (var6 < this.O.length) {
         var4.add(this.O[var6]);
         var6++;
         if (!var5) {
            break;
         }
      }
   }

   void z(gu var1, long var2) {
      long var4 = var2 ^ 113240848016893L;
      long var6 = var2 ^ 0L;
      byte var10000 = m44.a<"h">(5618762033536375070L, var2);
      var1.K(this.b, this, var4, this.H());
      boolean var8 = (boolean)var10000;

      label28: {
         try {
            var10000 = m44.a<"v">(this, 5230637320741928232L, var2);
            if (var8) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var10) {
            throw m44.a<"h">(var10, 6201467966586205345L, var2);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < this.c) {
         this.O[var9].z(var1, var6);
         var9++;
         if (var8) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public int[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = m44.a<"j">(9192937912551746420L, var2);
      int[] var5 = new int[this.c];
      boolean var4 = var10000;
      int var6 = 0;
      bi[] var7 = this.O;
      int var8 = var7.length;
      int var9 = 0;

      label39:
      while (var9 < var8) {
         bi var10 = var7[var9];

         try {
            if (var2 < 0L) {
               return var5;
            }

            var5[var6++] = var10.q();
            var9++;
         } catch (n9 var12) {
            boolean var10001 = false;
            throw m44.a<"j">(var12, 7240152529959945931L, var2);
         }

         do {
            try {
               if (var4) {
                  return var5;
               }

               if (!var4) {
                  continue label39;
               }
            } catch (n9 var11) {
               boolean var17 = false;
               throw m44.a<"j">(var11, 7240152529959945931L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      m44.a<"j">(var5, 7315793211489142062L, var2);
      return var5;
   }

   static {
      long var11 = a ^ 119768390419890L;
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
      String var17 = "\"ÁtiÎóäãÃW£\u0011@\u001dÜ¨@×\u008f\u0097\u001cÅ6g\u0002AfÈ¾\u009faW.ò\u009f\u0090aÄÊÙz\u0002\u0088ë\u0096Ð\u008f»¨/ ó(\u008e\u00adû\b#tp\u0019\u0014Á©qte>\u000eó=Ë_óÑç\u0093öåÍs\u0010':Ú¥\u009a»5F{\u001e\u0091\u009b\u000eÍµ>\u0010z«ª\u0002ñ7))\u0018ÙNÁ½\u0003\u008cü\u0010ÑM²\u009fXØ\u0015ÿY\"ç¯Ò\nÁÐ\u0010y\u0005A´- ;Káer#\u0091\u0081=ä";
      int var19 = "\"ÁtiÎóäãÃW£\u0011@\u001dÜ¨@×\u008f\u0097\u001cÅ6g\u0002AfÈ¾\u009faW.ò\u009f\u0090aÄÊÙz\u0002\u0088ë\u0096Ð\u008f»¨/ ó(\u008e\u00adû\b#tp\u0019\u0014Á©qte>\u000eó=Ë_óÑç\u0093öåÍs\u0010':Ú¥\u009a»5F{\u001e\u0091\u009b\u000eÍµ>\u0010z«ª\u0002ñ7))\u0018ÙNÁ½\u0003\u008cü\u0010ÑM²\u009fXØ\u0015ÿY\"ç¯Ò\nÁÐ\u0010y\u0005A´- ;Káer#\u0091\u0081=ä"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     d = var20;
                     g = new String[8];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "«Üì\u008fÚÜ[ç\u0005ÒDÊ/óZ\u0084·\u0096\u0093l\u008dV¨3";
                     int var5 = "«Üì\u008fÚÜ[ç\u0005ÒDÊ/óZ\u0084·\u0096\u0093l\u008dV¨3".length();
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

                     i = var6;
                     j = new Integer[3];
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

                  var17 = "Yme\u0011`ó\u0081sü¤ºm\u0088\u001a|\u0018·JÖµ½\u0014sÒ6:'¤Ì\u0091\u0092\u0019V\u0007\u007fo\rOÚRJ\u0006æ\u0094íTq¥\u0007 *s?êHÝË¡dE;0]Ó\u0010c¥xýf\u0001\u0019Ìp\u0094æwd>zÉ";
                  var19 = "Yme\u0011`ó\u0081sü¤ºm\u0088\u001a|\u0018·JÖµ½\u0014sÒ6:'¤Ì\u0091\u0092\u0019V\u0007\u007fo\rOÚRJ\u0006æ\u0094íTq¥\u0007 *s?êHÝË¡dE;0]Ó\u0010c¥xýf\u0001\u0019Ìp\u0094æwd>zÉ"
                     .length();
                  var16 = '@';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6554;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ks", var10);
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
         throw new RuntimeException("com/zelix/ks" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9421;
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
            throw new RuntimeException("com/zelix/ks", var14);
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
         throw new RuntimeException("com/zelix/ks" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
