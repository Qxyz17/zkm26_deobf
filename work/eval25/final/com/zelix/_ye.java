package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ye {
   private _8z n;
   private Map R;
   private final boolean C;
   private Set t;
   private final _ug r;
   private _8z s;
   private w b;
   private _rh j;
   private static final rx N;
   private static final rx m;
   private final w V;
   private _8z J;
   private static final rx p;
   private Map d;
   private _8z U;
   private _8z T;
   private final boolean G;
   private static final long a = ess.a(-7363350960424338192L, -5748006034074600693L, MethodHandles.lookup().lookupClass()).a(260475688178606L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   private void J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 80997105013499L;
      long var6 = var2 ^ 53417534774644L;
      iu[] var9 = new iu[this.d.size()];
      x44.a<"h">(this.d.keySet(), var9, -275240961286854191L, var2);
      hk[] var10000 = x44.a<"p">(-77647807164751116L, var2);
      x44.a<"s">(this, new _rh(var9, var4, this.d.values().size()), -538423587023597937L, var2);
      hk[] var8 = var10000;

      for (Entry var11 : this.d.entrySet()) {
         x44.a<"h">(x44.a<"l">(this, -538423587023597937L, var2), var6, var11.getValue(), var11.getKey(), -545056259590706509L, var2);
         if (var8 != null) {
            break;
         }
      }
   }

   public final Map n(Object[] var1) {
      long var2 = (Long)var1[0];
      String var7 = (String)var1[1];
      pg var5 = (pg)var1[2];
      _ur var8 = (_ur)var1[3];
      Random var6 = (Random)var1[4];
      String var4 = (String)var1[5];
      var2 = a ^ var2;
      long var9 = var2 ^ 72833991214140L;
      long var11 = var2 ^ 27228354506035L;
      long var13 = var2 ^ 103602711025538L;
      long var15 = var2 ^ 61335495334778L;
      hk[] var10000 = x44.a<"q">(3651669161912676021L, var2);
      Map var18 = x44.a<"o">(this, new Object[]{var13, var7}, 3636759989741554557L, var2);
      hk[] var17 = var10000;

      try {
         if (var17 != null) {
            return var18;
         }

         if (var18 != null) {
            return var18;
         }
      } catch (_sz var23) {
         throw x44.a<"q">(var23, 2980877244604233406L, var2);
      }

      hz var19;
      try {
         var19 = x44.a<"i">(x44.a<"m">(this, 3510849067696193736L, var2), new Object[]{var7, var4, var11}, 3432945004001237267L, var2);
      } catch (_sz var21) {
         throw new _sg(
            a<"o">(5387, 3594448927862836121L ^ var2)
               + sh.b(x44.a<"i">(var21, new Object[]{var15}, 2922260058602021057L, var2))
               + a<"o">(1880, 7675888556533897679L ^ var2)
               + var4
               + a<"o">(19065, 6099253900984390889L ^ var2)
         );
      } catch (_s8 var22) {
         throw new _sg(x44.a<"i">(var22, 3549235389298165742L, var2));
      }

      return x44.a<"i">(var19, new Object[]{this, var5, var9, var8, var6}, 3311651315025936113L, var2);
   }

   private boolean v(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_f8
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 10
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/util/Set
      // 02a: astore 8
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/util/Set
      // 032: astore 3
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/util/Set
      // 03a: astore 4
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/iu
      // 043: astore 7
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast com/zelix/pg
      // 04c: astore 2
      // 04d: pop
      // 04e: getstatic com/zelix/_ye.a J
      // 051: lload 10
      // 053: lxor
      // 054: lstore 10
      // 056: lload 10
      // 058: dup2
      // 059: ldc2_w 116549949498599
      // 05c: lxor
      // 05d: lstore 12
      // 05f: dup2
      // 060: ldc2_w 75783680529188
      // 063: lxor
      // 064: lstore 14
      // 066: dup2
      // 067: ldc2_w 38316849938686
      // 06a: lxor
      // 06b: lstore 16
      // 06d: dup2
      // 06e: ldc2_w 90316322171093
      // 071: lxor
      // 072: lstore 18
      // 074: dup2
      // 075: ldc2_w 113013500710014
      // 078: lxor
      // 079: lstore 20
      // 07b: dup2
      // 07c: ldc2_w 112688954544955
      // 07f: lxor
      // 080: lstore 22
      // 082: dup2
      // 083: ldc2_w 69376132569496
      // 086: lxor
      // 087: lstore 24
      // 089: dup2
      // 08a: ldc2_w 76476438475556
      // 08d: lxor
      // 08e: lstore 26
      // 090: pop2
      // 091: ldc2_w 4870199102650638222
      // 094: lload 10
      // 096: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 9
      // 09d: ldc2_w 4862174269478688242
      // 0a0: lload 10
      // 0a2: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: astore 29
      // 0a9: astore 28
      // 0ab: aload 29
      // 0ad: ifnull 2fe
      // 0b0: aload 7
      // 0b2: lload 26
      // 0b4: invokevirtual com/zelix/iu.C (J)Z
      // 0b7: aload 28
      // 0b9: lload 10
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 135
      // 0c0: ifnonnull 133
      // 0c3: goto 0d1
      // 0c6: ldc2_w 6369512130723006341
      // 0c9: lload 10
      // 0cb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: ifeq 11e
      // 0d4: goto 0e2
      // 0d7: ldc2_w 6369512130723006341
      // 0da: lload 10
      // 0dc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: aload 29
      // 0e5: lload 14
      // 0e7: aload 5
      // 0e9: aload 2
      // 0ea: bipush 4
      // 0eb: anewarray 302
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 3
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 2
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w 6355714921379189516
      // 109: lload 10
      // 10b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: istore 30
      // 112: lload 10
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 1d1
      // 119: aload 28
      // 11b: ifnull 1d1
      // 11e: aload 7
      // 120: lload 22
      // 122: invokevirtual com/zelix/iu.n (J)Z
      // 125: goto 133
      // 128: ldc2_w 6369512130723006341
      // 12b: lload 10
      // 12d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 28
      // 135: ifnonnull 1cf
      // 138: ifeq 185
      // 13b: goto 149
      // 13e: ldc2_w 6369512130723006341
      // 141: lload 10
      // 143: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 0
      // 14a: lload 24
      // 14c: aload 29
      // 14e: aload 5
      // 150: aload 2
      // 151: bipush 4
      // 152: anewarray 302
      // 155: dup_x1
      // 156: swap
      // 157: bipush 3
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 2
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: bipush 1
      // 162: swap
      // 163: aastore
      // 164: dup_x2
      // 165: dup_x2
      // 166: pop
      // 167: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: ldc2_w 5007898189540224100
      // 170: lload 10
      // 172: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: istore 30
      // 179: lload 10
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: ifle 1d1
      // 180: aload 28
      // 182: ifnull 1d1
      // 185: aload 0
      // 186: aload 29
      // 188: aload 5
      // 18a: lload 12
      // 18c: aload 6
      // 18e: aload 3
      // 18f: aload 2
      // 190: bipush 6
      // 192: anewarray 302
      // 195: dup_x1
      // 196: swap
      // 197: bipush 5
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 4
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 3
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 2
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: ldc2_w 4637152625129566228
      // 1ba: lload 10
      // 1bc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: goto 1cf
      // 1c4: ldc2_w 6369512130723006341
      // 1c7: lload 10
      // 1c9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: istore 30
      // 1d1: iload 30
      // 1d3: aload 28
      // 1d5: lload 10
      // 1d7: lconst_0
      // 1d8: lcmp
      // 1d9: iflt 2dd
      // 1dc: ifnonnull 2db
      // 1df: tableswitch 134 -1 2 40 99 121 121
      // 1fc: ldc2_w 6369512130723006341
      // 1ff: lload 10
      // 201: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 0
      // 208: aload 8
      // 20a: aload 3
      // 20b: aload 5
      // 20d: lload 16
      // 20f: bipush 4
      // 210: anewarray 302
      // 213: dup_x2
      // 214: dup_x2
      // 215: pop
      // 216: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 22b: ldc2_w 6890003368845113483
      // 22e: lload 10
      // 230: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: bipush 0
      // 236: ireturn
      // 237: ldc2_w 6369512130723006341
      // 23a: lload 10
      // 23c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: athrow
      // 242: aload 8
      // 244: aload 29
      // 246: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 24b: pop
      // 24c: lload 10
      // 24e: lconst_0
      // 24f: lcmp
      // 250: ifle 287
      // 253: aload 28
      // 255: ifnull 265
      // 258: bipush 1
      // 259: ireturn
      // 25a: ldc2_w 6369512130723006341
      // 25d: lload 10
      // 25f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 29
      // 267: aload 4
      // 269: lload 20
      // 26b: bipush 2
      // 26c: anewarray 302
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 1
      // 276: swap
      // 277: aastore
      // 278: dup_x1
      // 279: swap
      // 27a: bipush 0
      // 27b: swap
      // 27c: aastore
      // 27d: ldc2_w 4640710939891457882
      // 280: lload 10
      // 282: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: aload 0
      // 288: aload 29
      // 28a: aload 5
      // 28c: aload 6
      // 28e: lload 18
      // 290: aload 8
      // 292: aload 3
      // 293: aload 4
      // 295: aload 7
      // 297: aload 2
      // 298: bipush 9
      // 29a: anewarray 302
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 8
      // 2a1: swap
      // 2a2: aastore
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: bipush 7
      // 2a7: swap
      // 2a8: aastore
      // 2a9: dup_x1
      // 2aa: swap
      // 2ab: bipush 6
      // 2ad: swap
      // 2ae: aastore
      // 2af: dup_x1
      // 2b0: swap
      // 2b1: bipush 5
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 4
      // 2b7: swap
      // 2b8: aastore
      // 2b9: dup_x2
      // 2ba: dup_x2
      // 2bb: pop
      // 2bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bf: bipush 3
      // 2c0: swap
      // 2c1: aastore
      // 2c2: dup_x1
      // 2c3: swap
      // 2c4: bipush 2
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 1
      // 2ca: swap
      // 2cb: aastore
      // 2cc: dup_x1
      // 2cd: swap
      // 2ce: bipush 0
      // 2cf: swap
      // 2d0: aastore
      // 2d1: ldc2_w 4750307727036356269
      // 2d4: lload 10
      // 2d6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: aload 28
      // 2dd: ifnonnull 2ff
      // 2e0: ifne 2fe
      // 2e3: goto 2f1
      // 2e6: ldc2_w 6369512130723006341
      // 2e9: lload 10
      // 2eb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: athrow
      // 2f1: bipush 0
      // 2f2: ireturn
      // 2f3: ldc2_w 6369512130723006341
      // 2f6: lload 10
      // 2f8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: bipush 1
      // 2ff: ireturn
   }

   private boolean f(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 8
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_f8
      // 017: astore 2
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/Set
      // 01e: astore 7
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/util/Set
      // 026: astore 11
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/lang/Long
      // 02e: invokevirtual java/lang/Long.longValue ()J
      // 031: lstore 9
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/util/Set
      // 03a: astore 4
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/iu
      // 043: astore 5
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast com/zelix/pg
      // 04c: astore 3
      // 04d: pop
      // 04e: getstatic com/zelix/_ye.a J
      // 051: lload 9
      // 053: lxor
      // 054: lstore 9
      // 056: lload 9
      // 058: dup2
      // 059: ldc2_w 113030470798374
      // 05c: lxor
      // 05d: lstore 12
      // 05f: dup2
      // 060: ldc2_w 1071064735740
      // 063: lxor
      // 064: lstore 14
      // 066: dup2
      // 067: ldc2_w 50067789896985
      // 06a: lxor
      // 06b: lstore 16
      // 06d: dup2
      // 06e: ldc2_w 75768453698428
      // 071: lxor
      // 072: lstore 18
      // 074: dup2
      // 075: ldc2_w 75167419010105
      // 078: lxor
      // 079: lstore 20
      // 07b: dup2
      // 07c: ldc2_w 32129944176282
      // 07f: lxor
      // 080: lstore 22
      // 082: dup2
      // 083: ldc2_w 1749708637381
      // 086: lxor
      // 087: lstore 24
      // 089: dup2
      // 08a: ldc2_w 107555982529570
      // 08d: lxor
      // 08e: lstore 26
      // 090: dup2
      // 091: ldc2_w 90316322171093
      // 094: lxor
      // 095: lstore 28
      // 097: dup2
      // 098: ldc2_w 113997972433958
      // 09b: lxor
      // 09c: lstore 30
      // 09e: dup2
      // 09f: ldc2_w 5824691963729
      // 0a2: lxor
      // 0a3: lstore 32
      // 0a5: pop2
      // 0a6: ldc2_w 6671043156571504780
      // 0a9: lload 9
      // 0ab: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: astore 34
      // 0b2: aload 5
      // 0b4: lload 30
      // 0b6: invokevirtual com/zelix/iu.C (J)Z
      // 0b9: aload 34
      // 0bb: ifnonnull 144
      // 0be: ifne 108
      // 0c1: goto 0cf
      // 0c4: ldc2_w 5145133502695299207
      // 0c7: lload 9
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 5
      // 0d1: lload 26
      // 0d3: invokevirtual com/zelix/iu.Q (J)Z
      // 0d6: aload 34
      // 0d8: lload 9
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 169
      // 0df: ifnonnull 167
      // 0e2: goto 0f0
      // 0e5: ldc2_w 5145133502695299207
      // 0e8: lload 9
      // 0ea: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: lload 9
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: ifle 159
      // 0f7: ifeq 152
      // 0fa: goto 108
      // 0fd: ldc2_w 5145133502695299207
      // 100: lload 9
      // 102: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 0
      // 109: aload 6
      // 10b: lload 12
      // 10d: aload 8
      // 10f: aload 3
      // 110: bipush 4
      // 111: anewarray 302
      // 114: dup_x1
      // 115: swap
      // 116: bipush 3
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 2
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x2
      // 11f: dup_x2
      // 120: pop
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w 5131336294221270030
      // 12f: lload 9
      // 131: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: goto 144
      // 139: ldc2_w 5145133502695299207
      // 13c: lload 9
      // 13e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: istore 35
      // 146: lload 9
      // 148: lconst_0
      // 149: lcmp
      // 14a: iflt 1fd
      // 14d: aload 34
      // 14f: ifnull 1fd
      // 152: aload 5
      // 154: lload 20
      // 156: invokevirtual com/zelix/iu.n (J)Z
      // 159: goto 167
      // 15c: ldc2_w 5145133502695299207
      // 15f: lload 9
      // 161: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: aload 34
      // 169: ifnonnull 1fb
      // 16c: ifeq 1b9
      // 16f: goto 17d
      // 172: ldc2_w 5145133502695299207
      // 175: lload 9
      // 177: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 0
      // 17e: lload 22
      // 180: aload 6
      // 182: aload 8
      // 184: aload 3
      // 185: bipush 4
      // 186: anewarray 302
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 3
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x1
      // 18f: swap
      // 190: bipush 2
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: bipush 1
      // 196: swap
      // 197: aastore
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: ldc2_w 6520511866769896294
      // 1a4: lload 9
      // 1a6: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: istore 35
      // 1ad: lload 9
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: iflt 1fd
      // 1b4: aload 34
      // 1b6: ifnull 1fd
      // 1b9: aload 0
      // 1ba: aload 6
      // 1bc: lload 16
      // 1be: aload 8
      // 1c0: aload 2
      // 1c1: aload 3
      // 1c2: bipush 5
      // 1c3: anewarray 302
      // 1c6: dup_x1
      // 1c7: swap
      // 1c8: bipush 4
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 3
      // 1ce: swap
      // 1cf: aastore
      // 1d0: dup_x1
      // 1d1: swap
      // 1d2: bipush 2
      // 1d3: swap
      // 1d4: aastore
      // 1d5: dup_x2
      // 1d6: dup_x2
      // 1d7: pop
      // 1d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1db: bipush 1
      // 1dc: swap
      // 1dd: aastore
      // 1de: dup_x1
      // 1df: swap
      // 1e0: bipush 0
      // 1e1: swap
      // 1e2: aastore
      // 1e3: ldc2_w 6370740851809722368
      // 1e6: lload 9
      // 1e8: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: goto 1fb
      // 1f0: ldc2_w 5145133502695299207
      // 1f3: lload 9
      // 1f5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: istore 35
      // 1fd: iload 35
      // 1ff: aload 34
      // 201: lload 9
      // 203: lconst_0
      // 204: lcmp
      // 205: iflt 2be
      // 208: ifnonnull 2bc
      // 20b: tableswitch 136 -1 2 40 100 122 122
      // 228: ldc2_w 5145133502695299207
      // 22b: lload 9
      // 22d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 0
      // 234: aload 7
      // 236: aload 11
      // 238: aload 8
      // 23a: lload 14
      // 23c: bipush 4
      // 23d: anewarray 302
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 3
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 2
      // 24c: swap
      // 24d: aastore
      // 24e: dup_x1
      // 24f: swap
      // 250: bipush 1
      // 251: swap
      // 252: aastore
      // 253: dup_x1
      // 254: swap
      // 255: bipush 0
      // 256: swap
      // 257: aastore
      // 258: ldc2_w 4655622155501168521
      // 25b: lload 9
      // 25d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: bipush 0
      // 263: ireturn
      // 264: ldc2_w 5145133502695299207
      // 267: lload 9
      // 269: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: aload 7
      // 271: aload 6
      // 273: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 278: pop
      // 279: lload 9
      // 27b: lconst_0
      // 27c: lcmp
      // 27d: iflt 2b5
      // 280: aload 34
      // 282: ifnull 293
      // 285: goto 293
      // 288: ldc2_w 5145133502695299207
      // 28b: lload 9
      // 28d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: athrow
      // 293: aload 6
      // 295: aload 4
      // 297: lload 18
      // 299: bipush 2
      // 29a: anewarray 302
      // 29d: dup_x2
      // 29e: dup_x2
      // 29f: pop
      // 2a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a3: bipush 1
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: bipush 0
      // 2a9: swap
      // 2aa: aastore
      // 2ab: ldc2_w 6873966527594086488
      // 2ae: lload 9
      // 2b0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: aload 5
      // 2b7: lload 30
      // 2b9: invokevirtual com/zelix/iu.C (J)Z
      // 2bc: aload 34
      // 2be: ifnonnull 3ff
      // 2c1: ifne 3fe
      // 2c4: goto 2d2
      // 2c7: ldc2_w 5145133502695299207
      // 2ca: lload 9
      // 2cc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: athrow
      // 2d2: aload 5
      // 2d4: lload 20
      // 2d6: invokevirtual com/zelix/iu.n (J)Z
      // 2d9: aload 34
      // 2db: ifnonnull 3ff
      // 2de: goto 2ec
      // 2e1: ldc2_w 5145133502695299207
      // 2e4: lload 9
      // 2e6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: ifne 3fe
      // 2ef: goto 2fd
      // 2f2: ldc2_w 5145133502695299207
      // 2f5: lload 9
      // 2f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: aload 5
      // 2ff: lload 32
      // 301: invokevirtual com/zelix/iu.V (J)Z
      // 304: aload 34
      // 306: ifnonnull 3ff
      // 309: goto 317
      // 30c: ldc2_w 5145133502695299207
      // 30f: lload 9
      // 311: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: athrow
      // 317: ifne 3fe
      // 31a: goto 328
      // 31d: ldc2_w 5145133502695299207
      // 320: lload 9
      // 322: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: aload 6
      // 32a: lload 24
      // 32c: bipush 1
      // 32d: anewarray 302
      // 330: dup_x2
      // 331: dup_x2
      // 332: pop
      // 333: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 336: bipush 0
      // 337: swap
      // 338: aastore
      // 339: ldc2_w 4858408196783641587
      // 33c: lload 9
      // 33e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: astore 36
      // 345: aload 36
      // 347: aload 34
      // 349: ifnonnull 35f
      // 34c: ifnull 3fe
      // 34f: goto 35d
      // 352: ldc2_w 5145133502695299207
      // 355: lload 9
      // 357: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: athrow
      // 35d: aload 36
      // 35f: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 364: ifeq 3fe
      // 367: aload 36
      // 369: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 36e: checkcast com/zelix/yn
      // 371: astore 37
      // 373: aload 0
      // 374: aload 37
      // 376: aload 8
      // 378: aload 2
      // 379: aload 7
      // 37b: aload 11
      // 37d: lload 28
      // 37f: aload 4
      // 381: aload 5
      // 383: aload 3
      // 384: bipush 9
      // 386: anewarray 302
      // 389: dup_x1
      // 38a: swap
      // 38b: bipush 8
      // 38d: swap
      // 38e: aastore
      // 38f: dup_x1
      // 390: swap
      // 391: bipush 7
      // 393: swap
      // 394: aastore
      // 395: dup_x1
      // 396: swap
      // 397: bipush 6
      // 399: swap
      // 39a: aastore
      // 39b: dup_x2
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a1: bipush 5
      // 3a2: swap
      // 3a3: aastore
      // 3a4: dup_x1
      // 3a5: swap
      // 3a6: bipush 4
      // 3a7: swap
      // 3a8: aastore
      // 3a9: dup_x1
      // 3aa: swap
      // 3ab: bipush 3
      // 3ac: swap
      // 3ad: aastore
      // 3ae: dup_x1
      // 3af: swap
      // 3b0: bipush 2
      // 3b1: swap
      // 3b2: aastore
      // 3b3: dup_x1
      // 3b4: swap
      // 3b5: bipush 1
      // 3b6: swap
      // 3b7: aastore
      // 3b8: dup_x1
      // 3b9: swap
      // 3ba: bipush 0
      // 3bb: swap
      // 3bc: aastore
      // 3bd: ldc2_w 6353146140599859229
      // 3c0: lload 9
      // 3c2: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: aload 34
      // 3c9: lload 9
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: ifle 3d5
      // 3d0: ifnonnull 3ff
      // 3d3: aload 34
      // 3d5: ifnonnull 3f8
      // 3d8: goto 3e6
      // 3db: ldc2_w 5145133502695299207
      // 3de: lload 9
      // 3e0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e5: athrow
      // 3e6: ifne 3f9
      // 3e9: goto 3f7
      // 3ec: ldc2_w 5145133502695299207
      // 3ef: lload 9
      // 3f1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f6: athrow
      // 3f7: bipush 0
      // 3f8: ireturn
      // 3f9: aload 34
      // 3fb: ifnull 35d
      // 3fe: bipush 1
      // 3ff: ireturn
   }

   public final boolean o(Object[] var1) {
      long var3 = (Long)var1[0];
      yn var2 = (yn)var1[1];
      _f8 var5 = (_f8)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 18872468395029L;
      return x44.a<"o">(x44.a<"k">(this, -5092634475403662997L, var3), new Object[]{var2, var6, var5}, -6894583690011701709L, var3);
   }

   public final iu Y(Object[] var1) {
      long var3 = (Long)var1[0];
      iu var2 = (iu)var1[1];
      var3 = a ^ var3;
      hk[] var10000 = x44.a<"v">(5200056776433652786L, var3);
      iu var6 = (iu)this.d.get(var2);
      hk[] var5 = var10000;

      try {
         if (var5 != null) {
            return var6;
         }

         if (var6 != null) {
            return var6;
         }
      } catch (gj var7) {
         throw x44.a<"v">(var7, 6041915181721930809L, var3);
      }

      return var2;
   }

   private int n(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_f8
      // 01a: astore 7
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_f8
      // 022: astore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/pg
      // 029: astore 3
      // 02a: pop
      // 02b: getstatic com/zelix/_ye.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 49152446566348
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 23384064903354
      // 040: lxor
      // 041: dup2
      // 042: bipush 32
      // 044: lushr
      // 045: l2i
      // 046: istore 10
      // 048: dup2
      // 049: bipush 32
      // 04b: lshl
      // 04c: bipush 56
      // 04e: lushr
      // 04f: l2i
      // 050: istore 11
      // 052: dup2
      // 053: bipush 40
      // 055: lshl
      // 056: bipush 40
      // 058: lushr
      // 059: l2i
      // 05a: istore 12
      // 05c: pop2
      // 05d: dup2
      // 05e: ldc2_w 92878213218834
      // 061: lxor
      // 062: lstore 13
      // 064: pop2
      // 065: ldc2_w 7590871918877013312
      // 068: lload 5
      // 06a: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: astore 15
      // 071: aload 4
      // 073: lload 13
      // 075: invokevirtual com/zelix/yn.S (J)Z
      // 078: aload 15
      // 07a: ifnonnull 08f
      // 07d: ifeq 090
      // 080: goto 08e
      // 083: ldc2_w 8262785920097676619
      // 086: lload 5
      // 088: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: bipush 2
      // 08f: ireturn
      // 090: new com/zelix/rx
      // 093: dup
      // 094: aload 2
      // 095: invokespecial com/zelix/rx.<init> (Lcom/zelix/_f8;)V
      // 098: astore 16
      // 09a: aload 0
      // 09b: ldc2_w 7710266992295738168
      // 09e: lload 5
      // 0a0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 4
      // 0a7: aload 7
      // 0a9: aload 16
      // 0ab: iload 10
      // 0ad: iload 11
      // 0af: i2b
      // 0b0: iload 12
      // 0b2: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 0b5: checkcast com/zelix/rx
      // 0b8: astore 17
      // 0ba: aload 17
      // 0bc: lload 5
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: iflt 0e8
      // 0c3: aload 15
      // 0c5: ifnonnull 0e8
      // 0c8: ifnonnull 0e6
      // 0cb: goto 0d9
      // 0ce: ldc2_w 8262785920097676619
      // 0d1: lload 5
      // 0d3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: bipush 0
      // 0da: ireturn
      // 0db: ldc2_w 8262785920097676619
      // 0de: lload 5
      // 0e0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 17
      // 0e8: ldc2_w 7937507804915757514
      // 0eb: lload 5
      // 0ed: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: aload 15
      // 0f4: ifnonnull 164
      // 0f7: ifnull 149
      // 0fa: goto 108
      // 0fd: ldc2_w 8262785920097676619
      // 100: lload 5
      // 102: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 17
      // 10a: ldc2_w 7937507804915757514
      // 10d: lload 5
      // 10f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: aload 2
      // 115: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 118: aload 15
      // 11a: ifnonnull 17a
      // 11d: goto 12b
      // 120: ldc2_w 8262785920097676619
      // 123: lload 5
      // 125: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: ifeq 149
      // 12e: goto 13c
      // 131: ldc2_w 8262785920097676619
      // 134: lload 5
      // 136: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: bipush 1
      // 13d: ireturn
      // 13e: ldc2_w 8262785920097676619
      // 141: lload 5
      // 143: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 0
      // 14a: ldc2_w 7710266992295738168
      // 14d: lload 5
      // 14f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: aload 4
      // 156: aload 7
      // 158: aload 17
      // 15a: iload 10
      // 15c: iload 11
      // 15e: i2b
      // 15f: iload 12
      // 161: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 164: pop
      // 165: aload 3
      // 166: aload 17
      // 168: ldc2_w 7937507804915757514
      // 16b: lload 5
      // 16d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: lload 8
      // 174: dup2_x1
      // 175: pop2
      // 176: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 179: bipush -1
      // 17a: ireturn
   }

   private int T(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_f8
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/pg
      // 030: astore 6
      // 032: pop
      // 033: getstatic com/zelix/_ye.a J
      // 036: lload 4
      // 038: lxor
      // 039: lstore 4
      // 03b: lload 4
      // 03d: dup2
      // 03e: ldc2_w 80389754874160
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 124165461356102
      // 048: lxor
      // 049: dup2
      // 04a: bipush 32
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 11
      // 050: dup2
      // 051: bipush 32
      // 053: lshl
      // 054: bipush 56
      // 056: lushr
      // 057: l2i
      // 058: istore 12
      // 05a: dup2
      // 05b: bipush 40
      // 05d: lshl
      // 05e: bipush 40
      // 060: lushr
      // 061: l2i
      // 062: istore 13
      // 064: pop2
      // 065: dup2
      // 066: ldc2_w 54777547220206
      // 069: lxor
      // 06a: lstore 14
      // 06c: pop2
      // 06d: ldc2_w 1127118594232062908
      // 070: lload 4
      // 072: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: astore 16
      // 079: aload 8
      // 07b: aload 16
      // 07d: ifnonnull 0c5
      // 080: lload 14
      // 082: invokevirtual com/zelix/yn.S (J)Z
      // 085: ifeq 0a3
      // 088: goto 096
      // 08b: ldc2_w 1465699221520976823
      // 08e: lload 4
      // 090: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: bipush 2
      // 097: ireturn
      // 098: ldc2_w 1465699221520976823
      // 09b: lload 4
      // 09d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: ldc2_w 1007745646706466244
      // 0a7: lload 4
      // 0a9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: aload 8
      // 0b0: aload 3
      // 0b1: ldc2_w 1726093849314322773
      // 0b4: lload 4
      // 0b6: invokedynamic i (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: iload 11
      // 0bd: iload 12
      // 0bf: i2b
      // 0c0: iload 13
      // 0c2: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 0c5: checkcast com/zelix/rx
      // 0c8: astore 17
      // 0ca: aload 17
      // 0cc: lload 4
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 0f8
      // 0d3: aload 16
      // 0d5: ifnonnull 0f8
      // 0d8: ifnonnull 0f6
      // 0db: goto 0e9
      // 0de: ldc2_w 1465699221520976823
      // 0e1: lload 4
      // 0e3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: bipush 0
      // 0ea: ireturn
      // 0eb: ldc2_w 1465699221520976823
      // 0ee: lload 4
      // 0f0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 17
      // 0f8: ldc2_w 1565289579911124664
      // 0fb: lload 4
      // 0fd: invokedynamic i (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: aload 16
      // 104: lload 4
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 142
      // 10b: ifnonnull 139
      // 10e: if_acmpeq 156
      // 111: goto 11f
      // 114: ldc2_w 1465699221520976823
      // 117: lload 4
      // 119: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 17
      // 121: ldc2_w 1519336220848823061
      // 124: lload 4
      // 126: invokedynamic i (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: goto 139
      // 12e: ldc2_w 1465699221520976823
      // 131: lload 4
      // 133: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: lload 4
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: iflt 19f
      // 140: aload 16
      // 142: ifnonnull 19f
      // 145: if_acmpne 179
      // 148: goto 156
      // 14b: ldc2_w 1465699221520976823
      // 14e: lload 4
      // 150: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: new com/zelix/lp
      // 159: dup
      // 15a: aload 8
      // 15c: aload 17
      // 15e: ldc2_w 1726093849314322773
      // 161: lload 4
      // 163: invokedynamic i (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: invokespecial com/zelix/lp.<init> (Lcom/zelix/yn;Lcom/zelix/rx;Lcom/zelix/rx;)V
      // 16b: astore 18
      // 16d: aload 7
      // 16f: aload 18
      // 171: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 176: pop
      // 177: bipush 0
      // 178: ireturn
      // 179: aload 17
      // 17b: lload 4
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 1b1
      // 182: aload 16
      // 184: ifnonnull 1b1
      // 187: ldc2_w 1726093849314322773
      // 18a: lload 4
      // 18c: invokedynamic i (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: goto 19f
      // 194: ldc2_w 1465699221520976823
      // 197: lload 4
      // 199: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: if_acmpne 1af
      // 1a2: bipush 1
      // 1a3: ireturn
      // 1a4: ldc2_w 1465699221520976823
      // 1a7: lload 4
      // 1a9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: aload 17
      // 1b1: ldc2_w 638337840290371382
      // 1b4: lload 4
      // 1b6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: aload 16
      // 1bd: ifnonnull 247
      // 1c0: ifnull 22d
      // 1c3: goto 1d1
      // 1c6: ldc2_w 1465699221520976823
      // 1c9: lload 4
      // 1cb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 17
      // 1d3: ldc2_w 638337840290371382
      // 1d6: lload 4
      // 1d8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: aload 2
      // 1de: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1e1: aload 16
      // 1e3: ifnonnull 25e
      // 1e6: goto 1f4
      // 1e9: ldc2_w 1465699221520976823
      // 1ec: lload 4
      // 1ee: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: ifeq 22d
      // 1f7: goto 205
      // 1fa: ldc2_w 1465699221520976823
      // 1fd: lload 4
      // 1ff: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: aload 0
      // 206: ldc2_w 1007745646706466244
      // 209: lload 4
      // 20b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: aload 8
      // 212: aload 3
      // 213: aload 17
      // 215: iload 11
      // 217: iload 12
      // 219: i2b
      // 21a: iload 13
      // 21c: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 21f: pop
      // 220: bipush 1
      // 221: ireturn
      // 222: ldc2_w 1465699221520976823
      // 225: lload 4
      // 227: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: aload 0
      // 22e: ldc2_w 1007745646706466244
      // 231: lload 4
      // 233: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: aload 8
      // 23a: aload 3
      // 23b: aload 17
      // 23d: iload 11
      // 23f: iload 12
      // 241: i2b
      // 242: iload 13
      // 244: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 247: pop
      // 248: aload 6
      // 24a: aload 17
      // 24c: ldc2_w 638337840290371382
      // 24f: lload 4
      // 251: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: lload 9
      // 258: dup2_x1
      // 259: pop2
      // 25a: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 25d: bipush -1
      // 25e: ireturn
   }

   public final boolean p(Object[] var1) {
      long var5;
      long var9;
      _fz var10000;
      label16: {
         long var2 = (Long)var1[0];
         _fz var4 = (_fz)var1[1];
         var9 = a ^ var2;
         var5 = var9 ^ 26057234831181L;
         hk[] var7 = x44.a<"w">(624728837078357171L, var9);
         if (x44.a<"k">(this, 1190298352485000158L, var9)) {
            var10000 = var4;
            if (var9 <= 0L) {
               break label16;
            }

            if (var7 == null) {
               return x44.a<"k">(this, 1035698603036835048L, var9).contains(var4);
            }
         }

         var10000 = var4;
      }

      _fr var8 = var10000.C(var5);
      return x44.a<"k">(this, 1035698603036835048L, var9).contains(var8);
   }

   public final hz E(Object[] var1) {
      long var2 = (Long)var1[0];
      iu var4 = (iu)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 4391540980330L;
      hk[] var10000 = x44.a<"p">(-5319843768474916300L, var2);
      iu var8 = (iu)this.d.get(var4);
      hk[] var7 = var10000;

      try {
         if (var7 != null) {
            return var8.d(var5);
         }

         if (var8 == null) {
            return null;
         }
      } catch (gj var9) {
         throw x44.a<"p">(var9, -5917871155232263617L, var2);
      }

      return var8.d(var5);
   }

   private boolean P(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_f8
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Set
      // 01f: astore 6
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/lang/Long
      // 027: invokevirtual java/lang/Long.longValue ()J
      // 02a: lstore 2
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/Set
      // 031: astore 9
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/pg
      // 03a: astore 7
      // 03c: pop
      // 03d: getstatic com/zelix/_ye.a J
      // 040: lload 2
      // 041: lxor
      // 042: lstore 2
      // 043: lload 2
      // 044: dup2
      // 045: ldc2_w 43722416593625
      // 048: lxor
      // 049: lstore 10
      // 04b: dup2
      // 04c: ldc2_w 122161141415616
      // 04f: lxor
      // 050: lstore 12
      // 052: pop2
      // 053: ldc2_w -168848134005300816
      // 056: lload 2
      // 057: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 0
      // 05d: aload 8
      // 05f: aload 4
      // 061: lload 10
      // 063: aload 5
      // 065: aload 9
      // 067: aload 7
      // 069: bipush 6
      // 06b: anewarray 302
      // 06e: dup_x1
      // 06f: swap
      // 070: bipush 5
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 4
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 3
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x2
      // 07e: dup_x2
      // 07f: pop
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: bipush 2
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w -115909975115264470
      // 093: lload 2
      // 094: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: istore 15
      // 09b: astore 14
      // 09d: iload 15
      // 09f: aload 14
      // 0a1: ifnonnull 125
      // 0a4: tableswitch 128 -1 2 42 100 115 115
      // 0c4: ldc2_w -1847812532765197893
      // 0c7: lload 2
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: aload 6
      // 0d1: aload 9
      // 0d3: aload 4
      // 0d5: lload 12
      // 0d7: bipush 4
      // 0d8: anewarray 302
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 3
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 2
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: ldc2_w -2188617148269902155
      // 0f6: lload 2
      // 0f7: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: bipush 0
      // 0fd: ireturn
      // 0fe: ldc2_w -1847812532765197893
      // 101: lload 2
      // 102: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 6
      // 10a: aload 8
      // 10c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 111: pop
      // 112: aload 14
      // 114: ifnull 124
      // 117: goto 124
      // 11a: ldc2_w -1847812532765197893
      // 11d: lload 2
      // 11e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: bipush 1
      // 125: ireturn
   }

   public final iu w(Object[] var1) {
      iu var2 = (iu)var1[0];
      return (iu)this.d.get(var2);
   }

   private boolean w(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      _fz var5 = (_fz)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 24489359062874L;
      return x44.a<"h">(x44.a<"l">(this, -4466621016649724921L, var3), new Object[]{var2, var6, var5}, -4386924098640614020L, var3);
   }

   public final boolean b(Object[] var1) {
      long var6 = (Long)var1[0];
      yn var2 = (yn)var1[1];
      _fz var4 = (_fz)var1[2];
      _fz var3 = (_fz)var1[3];
      pg var5 = (pg)var1[4];
      var6 = a ^ var6;
      long var8 = var6 ^ 57741489198289L;
      Object[] var10008 = new Object[]{null, null, null, var3, false, var5};
      var10008[2] = var8;
      var10008[1] = var4;
      var10008[0] = var2;
      return x44.a<"o">(this, var10008, 338467114765170330L, var6);
   }

   public final boolean q(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_fz
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_fz
      // 016: astore 5
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 3
      // 022: pop
      // 023: getstatic com/zelix/_ye.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 44441510444728
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 118341252790170
      // 035: lxor
      // 036: dup2
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 9
      // 03d: dup2
      // 03e: bipush 16
      // 040: lshl
      // 041: bipush 32
      // 043: lushr
      // 044: l2i
      // 045: istore 10
      // 047: dup2
      // 048: bipush 48
      // 04a: lshl
      // 04b: bipush 48
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 11
      // 051: pop2
      // 052: pop2
      // 053: ldc2_w -6818937707436753594
      // 056: lload 3
      // 057: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: astore 12
      // 05e: aload 0
      // 05f: ldc2_w -5084012221079401941
      // 062: lload 3
      // 063: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: ifeq 07e
      // 06b: aload 5
      // 06d: astore 13
      // 06f: aload 6
      // 071: astore 14
      // 073: aload 12
      // 075: lload 3
      // 076: lconst_0
      // 077: lcmp
      // 078: ifle 0a7
      // 07b: ifnull 090
      // 07e: aload 5
      // 080: lload 7
      // 082: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 085: astore 13
      // 087: aload 6
      // 089: lload 7
      // 08b: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 08e: astore 14
      // 090: aload 0
      // 091: ldc2_w -6699619598022134978
      // 094: lload 3
      // 095: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: aload 2
      // 09b: iload 9
      // 09d: i2c
      // 09e: iload 10
      // 0a0: aload 14
      // 0a2: iload 11
      // 0a4: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 0a7: checkcast com/zelix/rx
      // 0aa: astore 15
      // 0ac: aload 15
      // 0ae: lload 3
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 0d7
      // 0b4: aload 12
      // 0b6: ifnonnull 0d7
      // 0b9: ifnonnull 0d5
      // 0bc: goto 0c9
      // 0bf: ldc2_w -4995295152481983155
      // 0c2: lload 3
      // 0c3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: bipush 0
      // 0ca: ireturn
      // 0cb: ldc2_w -4995295152481983155
      // 0ce: lload 3
      // 0cf: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: aload 15
      // 0d7: ldc2_w -6475678419610420788
      // 0da: lload 3
      // 0db: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: lload 3
      // 0e1: lconst_0
      // 0e2: lcmp
      // 0e3: iflt 113
      // 0e6: aload 12
      // 0e8: ifnonnull 113
      // 0eb: ifnull 12d
      // 0ee: goto 0fb
      // 0f1: ldc2_w -4995295152481983155
      // 0f4: lload 3
      // 0f5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 15
      // 0fd: ldc2_w -6475678419610420788
      // 100: lload 3
      // 101: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: goto 113
      // 109: ldc2_w -4995295152481983155
      // 10c: lload 3
      // 10d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 13
      // 115: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 118: aload 12
      // 11a: ifnonnull 12e
      // 11d: ifne 131
      // 120: goto 12d
      // 123: ldc2_w -4995295152481983155
      // 126: lload 3
      // 127: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 0
      // 132: ireturn
   }

   public final Map o(Object[] var1) {
      long var4 = (Long)var1[0];
      String var2 = (String)var1[1];
      Map var3 = (Map)var1[2];
      var4 = a ^ var4;
      return x44.a<"h">(x44.a<"l">(this, -7788017895565435409L, var4), new Object[]{var2, var3}, -8028096891633897089L, var4);
   }

   public _ye(pk var1, pd var2, _ug var3, _ur var4, int var5, boolean var6, boolean var7, long var8, boolean var10) {
      var8 = a ^ var8;
      long var11 = var8 ^ 120928091927944L;
      long var13 = var8 ^ 8245469969107L;
      long var15 = var8 ^ 50612881930774L;
      long var17 = var8 ^ 264971744759L;
      long var19 = var8 ^ 73415271821380L;
      long var21 = var8 ^ 26819965629503L;
      super();
      this.V = new w(var13);
      x44.a<"u">(this, new _8z(var21), 8552448491274812269L, var8);
      x44.a<"u">(this, x44.a<"v">(new Object[]{var15}, 8640860197181559173L, var8), 7842203235487721499L, var8);
      x44.a<"u">(this, x44.a<"v">(new Object[]{var17}, 8499380996507958335L, var8), 8531660297374565585L, var8);
      x44.a<"u">(this, new w(var13), 7690415340774587594L, var8);
      this.r = var3;
      this.G = var6;
      this.C = var10;
      x44.a<"u">(this, new _8z(var19, var5, b<"o">(5240, 2613476477975083345L ^ var8)), 8271446838794380018L, var8);
      x44.a<"u">(this, new _8z(var19, var5, b<"o">(3053, 6626253073515652803L ^ var8)), 7663471311401529275L, var8);
      x44.a<"u">(this, new _8z(var19, var5, b<"o">(17695, 5363152171920025650L ^ var8)), 7698092433375175889L, var8);
      x44.a<"u">(this, new _8z(var19, b<"o">(10370, 3226445480735835562L ^ var8), b<"o">(4671, 4403556778779393813L ^ var8)), 7745932554607208531L, var8);
      Object[] var10007 = new Object[]{null, null, null, null, var7};
      var10007[3] = var11;
      var10007[2] = var4;
      var10007[1] = var2;
      var10007[0] = var1;
      x44.a<"h">(this, var10007, 8547245858960414623L, var8);
   }

   public final hz O(Object[] var1) {
      long var4 = (Long)var1[0];
      String var6 = (String)var1[1];
      _fz var3 = (_fz)var1[2];
      hz var2 = (hz)var1[3];
      var4 = a ^ var4;
      long var10001 = var4 ^ 18201988311757L;
      int var7 = (int)((var4 ^ 18201988311757L) >>> 32);
      int var8 = (int)((var4 ^ 18201988311757L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      return (hz)x44.a<"o">(this, -7969031129980739732L, var4).s(var6, var3, var2, var7, (byte)var8, var9);
   }

   public final _3 X(Object[] var1) {
      pg var4 = (pg)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return (_3)((pg)x44.a<"j">(this, -910561883449477229L, var2).get(var4)).G();
   }

   static {
      long var11 = a ^ 115529792051539L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "äñ\u008cÝ+¸\u001fÖz\u009aLI\u008cM\u008a\u008e\u0010OáàÊ\u0081\u0018½\u0092\u007fþ\u009e¦4üzÐ8\u0086Qh\u0097&f\u0013Þ2Èª¡kýE\u0094Û\u0003¡\u001bh2\u009b\u000bû\u0090\u0017Ì\u009bÀ\u0080\u0004Ó·\r¶À>Éÿá\u0080\u000bü ©Ç³Ô#TÖA\u001b$k\u0010ý\u0011<ô\u008f\u0005\u0003\u00ad\u0093\u0002fR\t¥\u0082ìP\u009eKã·\u008a\u000f¢\u0091sæR\u00948 \u0003\u000b¸9\u009còbE`\u007fa\u0098KÞ^ù\u0015\u008bC\u001cNÌµ~v\\Ý'Ú\u0015\u0082\u009a¸\"|º \u0018YZ:LS§\u007f;\u008e«ãÛ¼\u0092\u0094Ê\u009b1àcÅ¿\u009e/ÆV~a";
      int var19 = "äñ\u008cÝ+¸\u001fÖz\u009aLI\u008cM\u008a\u008e\u0010OáàÊ\u0081\u0018½\u0092\u007fþ\u009e¦4üzÐ8\u0086Qh\u0097&f\u0013Þ2Èª¡kýE\u0094Û\u0003¡\u001bh2\u009b\u000bû\u0090\u0017Ì\u009bÀ\u0080\u0004Ó·\r¶À>Éÿá\u0080\u000bü ©Ç³Ô#TÖA\u001b$k\u0010ý\u0011<ô\u008f\u0005\u0003\u00ad\u0093\u0002fR\t¥\u0082ìP\u009eKã·\u008a\u000f¢\u0091sæR\u00948 \u0003\u000b¸9\u009còbE`\u007fa\u0098KÞ^ù\u0015\u008bC\u001cNÌµ~v\\Ý'Ú\u0015\u0082\u009a¸\"|º \u0018YZ:LS§\u007f;\u008e«ãÛ¼\u0092\u0094Ê\u009b1àcÅ¿\u009e/ÆV~a"
         .length();
      char var16 = 16;
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
                     c = var20;
                     e = new String[7];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "]0ÏIb=¯çH&ó\u0099S\u008bW¥\u0007»æü°\u001a.¥~s\u0011'&aÏ\u0015%6\u008a)jÀo\u001dÄE\u0019º[\u0091\bÎ";
                     int var5 = "]0ÏIb=¯çH&ó\u0099S\u008bW¥\u0007»æü°\u001a.¥~s\u0011'&aÏ\u0015%6\u008a)jÀo\u001dÄE\u0019º[\u0091\bÎ".length();
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
                                    h = new Integer[8];
                                    N = new rx(1);
                                    p = new rx(2);
                                    m = new rx(3);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\"rër\u0007TZ\u0093\u001f\u0011VM\u0088Ã\u0094×";
                                 var5 = "\"rër\u0007TZ\u0093\u001f\u0011VM\u0088Ã\u0094×".length();
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

                  var17 = "©1\u0097ÙÖ¡ól\u0087\u009cV\fÊ)åæ79\u0010\u0010qYÜ¨YD\u0016\u009f\u0087¯KFEÌ¦x15ô8(I\u009a\u0012fñ5¸\\ã/ .#\u0018M\"`QÛØ\u0099Pûj>GÈ¿äK¨db\u0018\u009e\u0001\u0001dÈ¡";
                  var19 = "©1\u0097ÙÖ¡ól\u0087\u009cV\fÊ)åæ79\u0010\u0010qYÜ¨YD\u0016\u009f\u0087¯KFEÌ¦x15ô8(I\u009a\u0012fñ5¸\\ã/ .#\u0018M\"`QÛØ\u0099Pûj>GÈ¿äK¨db\u0018\u009e\u0001\u0001dÈ¡"
                     .length();
                  var16 = '(';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private void z(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_f8
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/Set
      // 01e: astore 5
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/util/Set
      // 026: astore 8
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/lang/Long
      // 02e: invokevirtual java/lang/Long.longValue ()J
      // 031: lstore 3
      // 032: pop
      // 033: getstatic com/zelix/_ye.a J
      // 036: lload 3
      // 037: lxor
      // 038: lstore 3
      // 039: lload 3
      // 03a: dup2
      // 03b: ldc2_w 7014828099632
      // 03e: lxor
      // 03f: lstore 9
      // 041: dup2
      // 042: ldc2_w 62187939808921
      // 045: lxor
      // 046: lstore 11
      // 048: dup2
      // 049: ldc2_w 48286147328688
      // 04c: lxor
      // 04d: lstore 13
      // 04f: pop2
      // 050: ldc2_w -6716469404570861870
      // 053: lload 3
      // 054: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: aload 0
      // 05a: lload 13
      // 05c: aload 6
      // 05e: new com/zelix/_fz
      // 061: dup
      // 062: lload 11
      // 064: aload 7
      // 066: invokespecial com/zelix/_fz.<init> (JLcom/zelix/_f8;)V
      // 069: bipush 3
      // 06a: anewarray 302
      // 06d: dup_x1
      // 06e: swap
      // 06f: bipush 2
      // 070: swap
      // 071: aastore
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
      // 080: ldc2_w -5110361226981596998
      // 083: lload 3
      // 084: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: astore 16
      // 08b: astore 15
      // 08d: aload 16
      // 08f: aload 15
      // 091: ifnonnull 0b6
      // 094: ifnull 10e
      // 097: goto 0a4
      // 09a: ldc2_w -5099992981152880935
      // 09d: lload 3
      // 09e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 16
      // 0a6: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 0a9: goto 0b6
      // 0ac: ldc2_w -5099992981152880935
      // 0af: lload 3
      // 0b0: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: checkcast java/util/List
      // 0b9: astore 17
      // 0bb: bipush 0
      // 0bc: istore 18
      // 0be: iload 18
      // 0c0: aload 17
      // 0c2: invokeinterface java/util/List.size ()I 1
      // 0c7: if_icmpge 109
      // 0ca: aload 17
      // 0cc: iload 18
      // 0ce: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d3: checkcast com/zelix/yn
      // 0d6: astore 19
      // 0d8: aload 5
      // 0da: lload 3
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: ifle 11b
      // 0e0: aload 19
      // 0e2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0e7: istore 20
      // 0e9: iinc 18 1
      // 0ec: aload 15
      // 0ee: ifnonnull 119
      // 0f1: aload 15
      // 0f3: ifnull 0be
      // 0f6: lload 3
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 0ec
      // 0fc: goto 109
      // 0ff: ldc2_w -5099992981152880935
      // 102: lload 3
      // 103: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 15
      // 10b: ifnull 119
      // 10e: aload 5
      // 110: aload 6
      // 112: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 117: istore 17
      // 119: aload 5
      // 11b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 120: astore 17
      // 122: aload 17
      // 124: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 129: ifeq 164
      // 12c: aload 17
      // 12e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 133: checkcast com/zelix/yn
      // 136: astore 18
      // 138: aload 0
      // 139: lload 9
      // 13b: aload 18
      // 13d: aload 8
      // 13f: bipush 3
      // 140: anewarray 302
      // 143: dup_x1
      // 144: swap
      // 145: bipush 2
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x2
      // 14e: dup_x2
      // 14f: pop
      // 150: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w -4643459052444824130
      // 159: lload 3
      // 15a: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: aload 15
      // 161: ifnull 122
      // 164: return
   }

   private int w(Object[] param1) {
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
      // 00f: checkcast com/zelix/yn
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_f8
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/pg
      // 021: astore 2
      // 022: pop
      // 023: getstatic com/zelix/_ye.a J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 30810872878159
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 41734262084409
      // 038: lxor
      // 039: dup2
      // 03a: bipush 32
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 9
      // 040: dup2
      // 041: bipush 32
      // 043: lshl
      // 044: bipush 56
      // 046: lushr
      // 047: l2i
      // 048: istore 10
      // 04a: dup2
      // 04b: bipush 40
      // 04d: lshl
      // 04e: bipush 40
      // 050: lushr
      // 051: l2i
      // 052: istore 11
      // 054: pop2
      // 055: dup2
      // 056: ldc2_w 110816092494225
      // 059: lxor
      // 05a: lstore 12
      // 05c: pop2
      // 05d: ldc2_w 8276210369108307651
      // 060: lload 4
      // 062: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 14
      // 069: aload 3
      // 06a: aload 14
      // 06c: ifnonnull 0b4
      // 06f: lload 12
      // 071: invokevirtual com/zelix/yn.S (J)Z
      // 074: ifeq 092
      // 077: goto 085
      // 07a: ldc2_w 7577412706303047368
      // 07d: lload 4
      // 07f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: bipush 2
      // 086: ireturn
      // 087: ldc2_w 7577412706303047368
      // 08a: lload 4
      // 08c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: aload 0
      // 093: ldc2_w 8107445022766981307
      // 096: lload 4
      // 098: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 3
      // 09e: aload 6
      // 0a0: ldc2_w 7523985723091740266
      // 0a3: lload 4
      // 0a5: invokedynamic n (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 9
      // 0ac: iload 10
      // 0ae: i2b
      // 0af: iload 11
      // 0b1: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 0b4: checkcast com/zelix/rx
      // 0b7: astore 15
      // 0b9: aload 15
      // 0bb: lload 4
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 0e7
      // 0c2: aload 14
      // 0c4: ifnonnull 0e7
      // 0c7: ifnonnull 0e5
      // 0ca: goto 0d8
      // 0cd: ldc2_w 7577412706303047368
      // 0d0: lload 4
      // 0d2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: ireturn
      // 0da: ldc2_w 7577412706303047368
      // 0dd: lload 4
      // 0df: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 15
      // 0e7: ldc2_w 7549813689865694151
      // 0ea: lload 4
      // 0ec: invokedynamic n (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: aload 14
      // 0f3: lload 4
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 14b
      // 0fa: ifnonnull 142
      // 0fd: if_acmpne 136
      // 100: goto 10e
      // 103: ldc2_w 7577412706303047368
      // 106: lload 4
      // 108: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 0
      // 10f: ldc2_w 8107445022766981307
      // 112: lload 4
      // 114: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 3
      // 11a: aload 6
      // 11c: aload 15
      // 11e: iload 9
      // 120: iload 10
      // 122: i2b
      // 123: iload 11
      // 125: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 128: pop
      // 129: bipush 1
      // 12a: ireturn
      // 12b: ldc2_w 7577412706303047368
      // 12e: lload 4
      // 130: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 15
      // 138: ldc2_w 7523985723091740266
      // 13b: lload 4
      // 13d: invokedynamic n (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: lload 4
      // 144: lconst_0
      // 145: lcmp
      // 146: ifle 192
      // 149: aload 14
      // 14b: ifnonnull 192
      // 14e: if_acmpne 16c
      // 151: goto 15f
      // 154: ldc2_w 7577412706303047368
      // 157: lload 4
      // 159: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: bipush 1
      // 160: ireturn
      // 161: ldc2_w 7577412706303047368
      // 164: lload 4
      // 166: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: lload 4
      // 16e: lconst_0
      // 16f: lcmp
      // 170: iflt 1f4
      // 173: aload 15
      // 175: aload 14
      // 177: ifnonnull 1df
      // 17a: ldc2_w 7677234583061369898
      // 17d: lload 4
      // 17f: invokedynamic n (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: goto 192
      // 187: ldc2_w 7577412706303047368
      // 18a: lload 4
      // 18c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: if_acmpne 1c5
      // 195: aload 0
      // 196: ldc2_w 8107445022766981307
      // 199: lload 4
      // 19b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: aload 3
      // 1a1: aload 6
      // 1a3: ldc2_w 7677234583061369898
      // 1a6: lload 4
      // 1a8: invokedynamic n (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: iload 9
      // 1af: iload 10
      // 1b1: i2b
      // 1b2: iload 11
      // 1b4: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1b7: pop
      // 1b8: bipush 1
      // 1b9: ireturn
      // 1ba: ldc2_w 7577412706303047368
      // 1bd: lload 4
      // 1bf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: ldc2_w 8107445022766981307
      // 1c9: lload 4
      // 1cb: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: aload 3
      // 1d1: aload 6
      // 1d3: aload 15
      // 1d5: iload 9
      // 1d7: iload 10
      // 1d9: i2b
      // 1da: iload 11
      // 1dc: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1df: pop
      // 1e0: aload 2
      // 1e1: aload 15
      // 1e3: ldc2_w 8477043312528255561
      // 1e6: lload 4
      // 1e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: lload 7
      // 1ef: dup2_x1
      // 1f0: pop2
      // 1f1: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 1f4: bipush -1
      // 1f5: ireturn
   }

   public final pg p(Object[] var1) {
      long var2 = (Long)var1[0];
      yn var4 = (yn)var1[1];
      _fz var5 = (_fz)var1[2];
      var2 = a ^ var2;
      long var10001 = var2 ^ 27000710424171L;
      int var6 = (int)((var2 ^ 27000710424171L) >>> 48);
      int var7 = (int)((var2 ^ 27000710424171L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return (pg)x44.a<"o">(this, -680839782205539504L, var2).R(var4, (char)var6, var7, var5, var8);
   }

   public boolean T(Object[] var1) {
      iu var2 = (iu)var1[0];
      return this.d.containsKey(var2);
   }

   public final Map i(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      Map var5 = (Map)var1[2];
      var3 = a ^ var3;
      return x44.a<"h">(x44.a<"l">(this, -435709895412237291L, var3), new Object[]{var2, var5}, -430636393567740945L, var3);
   }

   private final void N(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/yn
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 5
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/util/Set
      // 02c: astore 4
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/_8z
      // 034: astore 3
      // 035: pop
      // 036: getstatic com/zelix/_ye.a J
      // 039: lload 6
      // 03b: lxor
      // 03c: lstore 6
      // 03e: lload 6
      // 040: dup2
      // 041: ldc2_w 59897279311507
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 54511947005990
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 18428592327383
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 92900630190556
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 90316322171093
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 69272482422895
      // 067: lxor
      // 068: dup2
      // 069: bipush 32
      // 06b: lushr
      // 06c: l2i
      // 06d: istore 19
      // 06f: dup2
      // 070: bipush 32
      // 072: lshl
      // 073: bipush 56
      // 075: lushr
      // 076: l2i
      // 077: istore 20
      // 079: dup2
      // 07a: bipush 40
      // 07c: lshl
      // 07d: bipush 40
      // 07f: lushr
      // 080: l2i
      // 081: istore 21
      // 083: pop2
      // 084: dup2
      // 085: ldc2_w 114345337916263
      // 088: lxor
      // 089: lstore 22
      // 08b: pop2
      // 08c: ldc2_w -9111596172196045419
      // 08f: lload 6
      // 091: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: astore 24
      // 098: iload 5
      // 09a: aload 24
      // 09c: ifnonnull 0f2
      // 09f: ifeq 1cb
      // 0a2: goto 0b0
      // 0a5: ldc2_w -7314274327865490018
      // 0a8: lload 6
      // 0aa: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 2
      // 0b1: aload 24
      // 0b3: lload 6
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 1db
      // 0ba: ifnonnull 1cc
      // 0bd: goto 0cb
      // 0c0: ldc2_w -7314274327865490018
      // 0c3: lload 6
      // 0c5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: lload 11
      // 0cd: bipush 1
      // 0ce: anewarray 302
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -7422652275215351514
      // 0dd: lload 6
      // 0df: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 0f2
      // 0e7: ldc2_w -7314274327865490018
      // 0ea: lload 6
      // 0ec: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: ifne 1cb
      // 0f5: bipush 0
      // 0f6: istore 5
      // 0f8: new java/util/ArrayList
      // 0fb: dup
      // 0fc: bipush 5
      // 0fd: invokespecial java/util/ArrayList.<init> (I)V
      // 100: astore 25
      // 102: aload 2
      // 103: aload 25
      // 105: lload 22
      // 107: bipush 2
      // 108: anewarray 302
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w -7491073786624865588
      // 11c: lload 6
      // 11e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: bipush 0
      // 124: istore 26
      // 126: iload 26
      // 128: aload 25
      // 12a: invokevirtual java/util/ArrayList.size ()I
      // 12d: if_icmpge 1cb
      // 130: aload 25
      // 132: iload 26
      // 134: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 137: checkcast com/zelix/yn
      // 13a: aload 24
      // 13c: ifnonnull 1cc
      // 13f: astore 27
      // 141: lload 6
      // 143: lconst_0
      // 144: lcmp
      // 145: iflt 1c6
      // 148: aload 3
      // 149: aload 27
      // 14b: lload 9
      // 14d: aload 8
      // 14f: bipush 3
      // 150: anewarray 302
      // 153: dup_x1
      // 154: swap
      // 155: bipush 2
      // 156: swap
      // 157: aastore
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 1
      // 15f: swap
      // 160: aastore
      // 161: dup_x1
      // 162: swap
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w -7289177176657709899
      // 169: lload 6
      // 16b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: aload 24
      // 172: ifnonnull 1c2
      // 175: ifeq 199
      // 178: goto 186
      // 17b: ldc2_w -7314274327865490018
      // 17e: lload 6
      // 180: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 24
      // 188: ifnull 1cb
      // 18b: goto 199
      // 18e: ldc2_w -7314274327865490018
      // 191: lload 6
      // 193: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: aload 3
      // 19a: aload 27
      // 19c: aload 8
      // 19e: ldc "d"
      // 1a0: iload 19
      // 1a2: iload 20
      // 1a4: i2b
      // 1a5: iload 21
      // 1a7: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1aa: pop
      // 1ab: aload 4
      // 1ad: aload 27
      // 1af: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b4: goto 1c2
      // 1b7: ldc2_w -7314274327865490018
      // 1ba: lload 6
      // 1bc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: pop
      // 1c3: iinc 26 1
      // 1c6: aload 24
      // 1c8: ifnull 126
      // 1cb: aload 2
      // 1cc: lload 15
      // 1ce: bipush 1
      // 1cf: anewarray 302
      // 1d2: dup_x2
      // 1d3: dup_x2
      // 1d4: pop
      // 1d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: ldc2_w -7028468192197587222
      // 1de: lload 6
      // 1e0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: astore 25
      // 1e7: aload 25
      // 1e9: aload 24
      // 1eb: ifnonnull 2b1
      // 1ee: ifnull 290
      // 1f1: goto 1ff
      // 1f4: ldc2_w -7314274327865490018
      // 1f7: lload 6
      // 1f9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: aload 25
      // 201: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 206: ifeq 290
      // 209: goto 217
      // 20c: ldc2_w -7314274327865490018
      // 20f: lload 6
      // 211: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: athrow
      // 217: aload 25
      // 219: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 21e: checkcast com/zelix/yn
      // 221: aload 24
      // 223: lload 6
      // 225: lconst_0
      // 226: lcmp
      // 227: iflt 2a7
      // 22a: ifnonnull 298
      // 22d: astore 26
      // 22f: aload 3
      // 230: aload 26
      // 232: aload 8
      // 234: ldc "i"
      // 236: iload 19
      // 238: iload 20
      // 23a: i2b
      // 23b: iload 21
      // 23d: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 240: pop
      // 241: aload 0
      // 242: aload 8
      // 244: aload 26
      // 246: lload 17
      // 248: iload 5
      // 24a: aload 4
      // 24c: aload 3
      // 24d: bipush 6
      // 24f: anewarray 302
      // 252: dup_x1
      // 253: swap
      // 254: bipush 5
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 4
      // 25a: swap
      // 25b: aastore
      // 25c: dup_x1
      // 25d: swap
      // 25e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 261: bipush 3
      // 262: swap
      // 263: aastore
      // 264: dup_x2
      // 265: dup_x2
      // 266: pop
      // 267: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26a: bipush 2
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 1
      // 270: swap
      // 271: aastore
      // 272: dup_x1
      // 273: swap
      // 274: bipush 0
      // 275: swap
      // 276: aastore
      // 277: ldc2_w -8739950674968985222
      // 27a: lload 6
      // 27c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: aload 4
      // 283: aload 26
      // 285: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 28a: pop
      // 28b: aload 24
      // 28d: ifnull 1ff
      // 290: lload 6
      // 292: lconst_0
      // 293: lcmp
      // 294: ifle 217
      // 297: aload 2
      // 298: lload 13
      // 29a: bipush 1
      // 29b: anewarray 302
      // 29e: dup_x2
      // 29f: dup_x2
      // 2a0: pop
      // 2a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a4: bipush 0
      // 2a5: swap
      // 2a6: aastore
      // 2a7: ldc2_w -7088878402633852816
      // 2aa: lload 6
      // 2ac: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: astore 26
      // 2b3: aload 26
      // 2b5: aload 24
      // 2b7: ifnonnull 2cd
      // 2ba: ifnull 381
      // 2bd: goto 2cb
      // 2c0: ldc2_w -7314274327865490018
      // 2c3: lload 6
      // 2c5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: aload 26
      // 2cd: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 2d2: ifeq 381
      // 2d5: aload 26
      // 2d7: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 2dc: checkcast com/zelix/yn
      // 2df: astore 27
      // 2e1: aload 3
      // 2e2: aload 27
      // 2e4: aload 8
      // 2e6: ldc "i"
      // 2e8: iload 19
      // 2ea: iload 20
      // 2ec: i2b
      // 2ed: iload 21
      // 2ef: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 2f2: pop
      // 2f3: aload 0
      // 2f4: aload 8
      // 2f6: aload 27
      // 2f8: lload 17
      // 2fa: iload 5
      // 2fc: aload 4
      // 2fe: aload 3
      // 2ff: bipush 6
      // 301: anewarray 302
      // 304: dup_x1
      // 305: swap
      // 306: bipush 5
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: bipush 4
      // 30c: swap
      // 30d: aastore
      // 30e: dup_x1
      // 30f: swap
      // 310: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 313: bipush 3
      // 314: swap
      // 315: aastore
      // 316: dup_x2
      // 317: dup_x2
      // 318: pop
      // 319: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31c: bipush 2
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 1
      // 322: swap
      // 323: aastore
      // 324: dup_x1
      // 325: swap
      // 326: bipush 0
      // 327: swap
      // 328: aastore
      // 329: ldc2_w -8739950674968985222
      // 32c: lload 6
      // 32e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: aload 27
      // 335: lload 11
      // 337: bipush 1
      // 338: anewarray 302
      // 33b: dup_x2
      // 33c: dup_x2
      // 33d: pop
      // 33e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 341: bipush 0
      // 342: swap
      // 343: aastore
      // 344: ldc2_w -7422652275215351514
      // 347: lload 6
      // 349: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: aload 24
      // 350: ifnonnull 37b
      // 353: ifne 37c
      // 356: goto 364
      // 359: ldc2_w -7314274327865490018
      // 35c: lload 6
      // 35e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: athrow
      // 364: aload 4
      // 366: aload 27
      // 368: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 36d: goto 37b
      // 370: ldc2_w -7314274327865490018
      // 373: lload 6
      // 375: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: athrow
      // 37b: pop
      // 37c: aload 24
      // 37e: ifnull 2cb
      // 381: lload 6
      // 383: lconst_0
      // 384: lcmp
      // 385: iflt 2d5
      // 388: return
   }

   public Set b(Object[] param1) {
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
      // 004: checkcast com/zelix/iu
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_ye.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 74198696692192
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 22948070429250
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 104807863215384
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 122573072389334
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 84154441643209
      // 03a: lxor
      // 03b: lstore 13
      // 03d: pop2
      // 03e: ldc2_w 322963125978634339
      // 041: lload 3
      // 042: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: astore 15
      // 049: aload 2
      // 04a: lload 11
      // 04c: invokevirtual com/zelix/iu.n (J)Z
      // 04f: aload 15
      // 051: ifnonnull 077
      // 054: ifne 07a
      // 057: goto 064
      // 05a: ldc2_w 2272071022576533608
      // 05d: lload 3
      // 05e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 2
      // 065: lload 13
      // 067: invokevirtual com/zelix/iu.C (J)Z
      // 06a: goto 077
      // 06d: ldc2_w 2272071022576533608
      // 070: lload 3
      // 071: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: ifeq 086
      // 07a: aconst_null
      // 07b: areturn
      // 07c: ldc2_w 2272071022576533608
      // 07f: lload 3
      // 080: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 0
      // 087: aload 15
      // 089: lload 3
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: ifle 0dc
      // 08f: ifnonnull 0d2
      // 092: ldc2_w 148729163113477144
      // 095: lload 3
      // 096: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_rh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: ifnonnull 0d1
      // 09e: goto 0ab
      // 0a1: ldc2_w 2272071022576533608
      // 0a4: lload 3
      // 0a5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: lload 7
      // 0ae: bipush 1
      // 0af: anewarray 302
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w 2272405725408083462
      // 0be: lload 3
      // 0bf: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: goto 0d1
      // 0c7: ldc2_w 2272071022576533608
      // 0ca: lload 3
      // 0cb: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: aload 2
      // 0d3: bipush 1
      // 0d4: anewarray 302
      // 0d7: dup_x1
      // 0d8: swap
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: ldc2_w 1739274961847150004
      // 0df: lload 3
      // 0e0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: astore 16
      // 0e7: aload 16
      // 0e9: aload 15
      // 0eb: ifnonnull 0ff
      // 0ee: ifnonnull 101
      // 0f1: goto 0fe
      // 0f4: ldc2_w 2272071022576533608
      // 0f7: lload 3
      // 0f8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 2
      // 0ff: astore 16
      // 101: aload 0
      // 102: ldc2_w 148729163113477144
      // 105: lload 3
      // 106: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_rh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: lload 9
      // 10d: aload 16
      // 10f: ldc2_w 75770319445726972
      // 112: lload 3
      // 113: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: astore 17
      // 11a: aconst_null
      // 11b: astore 18
      // 11d: aload 17
      // 11f: aload 15
      // 121: lload 3
      // 122: lconst_0
      // 123: lcmp
      // 124: iflt 14b
      // 127: ifnonnull 13c
      // 12a: ifnull 165
      // 12d: goto 13a
      // 130: ldc2_w 2272071022576533608
      // 133: lload 3
      // 134: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 17
      // 13c: lload 5
      // 13e: bipush 2
      // 13f: anewarray 302
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
      // 150: ldc2_w 563307213598911882
      // 153: lload 3
      // 154: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: astore 18
      // 15b: aload 18
      // 15d: aload 16
      // 15f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 164: pop
      // 165: aload 18
      // 167: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void D(Object[] var1) {
      Set var4 = (Set)var1[0];
      Set var6 = (Set)var1[1];
      _f8 var5 = (_f8)var1[2];
      long var2 = (Long)var1[3];
      var2 = a ^ var2;
      long var10001 = var2 ^ 61799048923743L;
      int var7 = (int)((var2 ^ 61799048923743L) >>> 32);
      int var8 = (int)((var2 ^ 61799048923743L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      long var10 = var2 ^ 119547082691772L;
      hk[] var10000 = x44.a<"q">(7763392921950025637L, var2);
      Iterator var13 = var4.iterator();
      hk[] var12 = var10000;

      while (true) {
         if (var13.hasNext()) {
            yn var14 = (yn)var13.next();
            Object var15 = x44.a<"i">(x44.a<"m">(this, 7630632183405672925L, var2), new Object[]{var14, var10, var5}, 7982242720365464892L, var2);
            if (var12 == null) {
               continue;
            }
         }

         do {
            ArrayList var24 = new ArrayList(var6);
            if (var2 >= 0L) {
               ArrayList var19 = var24;
               Collections.reverse(var19);

               label39:
               for (lp var23 : var19) {
                  rx var16 = (rx)x44.a<"m">(this, 7630632183405672925L, var2)
                     .s(x44.a<"m">(var23, 8218730842130710129L, var2), var5, x44.a<"m">(var23, 8512285013782908445L, var2), var7, (byte)var8, var9);

                  do {
                     try {
                        var10000 = var12;
                        if (var2 > 0L) {
                           if (var12 != null) {
                              return;
                           }

                           var10000 = var12;
                        }

                        if (var10000 == null) {
                           continue label39;
                        }
                     } catch (gj var17) {
                        throw x44.a<"q">(var17, 8092543517974294446L, var2);
                     }
                  } while (var2 < 0L);
                  break;
               }

               var4.clear();
               var19.clear();
               return;
            }

            yn var20 = (yn)var24;
            Object var22 = x44.a<"i">(x44.a<"m">(this, 7630632183405672925L, var2), new Object[]{var20, var10, var5}, 7982242720365464892L, var2);
         } while (var12 == null);
      }
   }

   private void S(Object[] var1) {
      _8h var6 = (_8h)var1[0];
      long var4 = (Long)var1[1];
      yn var3 = (yn)var1[2];
      _y4 var2 = (_y4)var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 991367994788L;
      long var9 = var4 ^ 90316322171093L;
      long var11 = var4 ^ 87560093740997L;
      hk[] var10000 = x44.a<"v">(-5901391681823886846L, var4);
      boolean var14 = x44.a<"n">(var6, new Object[]{var3, var11}, -6121862144134361776L, var4);
      hk[] var13 = var10000;

      try {
         if (!var14) {
            return;
         }
      } catch (gj var18) {
         throw x44.a<"v">(var18, -5338619031591933431L, var4);
      }

      List var15 = var2.M(var3, var7);
      if (var15 != null) {
         int var16 = 0;

         while (var16 < var15.size()) {
            yn var17 = (yn)var15.get(var16);
            x44.a<"h">(this, new Object[]{var6, var9, var17, var2}, -5969098959995069035L, var4);
            var16++;
            if (var13 != null) {
               break;
            }
         }
      }
   }

   public final boolean Q(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_fz
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_fz
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: istore 8
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast com/zelix/pg
      // 033: astore 7
      // 035: pop
      // 036: getstatic com/zelix/_ye.a J
      // 039: lload 4
      // 03b: lxor
      // 03c: lstore 4
      // 03e: lload 4
      // 040: dup2
      // 041: ldc2_w 115248829001760
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 125463556382030
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 64608972421463
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 26936907654617
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 125185492257397
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 26056532933554
      // 067: lxor
      // 068: lstore 19
      // 06a: dup2
      // 06b: ldc2_w 15680796475226
      // 06e: lxor
      // 06f: lstore 21
      // 071: dup2
      // 072: ldc2_w 110772134450593
      // 075: lxor
      // 076: lstore 23
      // 078: dup2
      // 079: ldc2_w 90981173902463
      // 07c: lxor
      // 07d: lstore 25
      // 07f: dup2
      // 080: ldc2_w 40718539323076
      // 083: lxor
      // 084: lstore 27
      // 086: pop2
      // 087: ldc2_w 4197201318064530983
      // 08a: lload 4
      // 08c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: astore 29
      // 093: aload 0
      // 094: ldc2_w 2454679254809432394
      // 097: lload 4
      // 099: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: ifeq 0b3
      // 0a1: aload 3
      // 0a2: astore 30
      // 0a4: aload 2
      // 0a5: astore 31
      // 0a7: aload 29
      // 0a9: lload 4
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 0d2
      // 0b0: ifnull 0c3
      // 0b3: aload 3
      // 0b4: lload 15
      // 0b6: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0b9: astore 30
      // 0bb: aload 2
      // 0bc: lload 15
      // 0be: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0c1: astore 31
      // 0c3: lload 21
      // 0c5: bipush 1
      // 0c6: anewarray 302
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w 4566319633309218450
      // 0d5: lload 4
      // 0d7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: astore 32
      // 0de: lload 21
      // 0e0: bipush 1
      // 0e1: anewarray 302
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w 4566319633309218450
      // 0f0: lload 4
      // 0f2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: astore 33
      // 0f9: aload 0
      // 0fa: aload 6
      // 0fc: aload 30
      // 0fe: aload 31
      // 100: aload 32
      // 102: aload 33
      // 104: lload 9
      // 106: bipush 6
      // 108: anewarray 302
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 5
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 4
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 3
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 2
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: bipush 1
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w 4538419185664449511
      // 130: lload 4
      // 132: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 32
      // 139: invokeinterface java/util/Set.size ()I 1
      // 13e: aload 33
      // 140: invokeinterface java/util/Set.size ()I 1
      // 145: iadd
      // 146: lload 17
      // 148: invokestatic com/zelix/sh.Q (IJ)I
      // 14b: lload 23
      // 14d: dup2_x1
      // 14e: pop2
      // 14f: bipush 2
      // 150: anewarray 302
      // 153: dup_x1
      // 154: swap
      // 155: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 158: bipush 1
      // 159: swap
      // 15a: aastore
      // 15b: dup_x2
      // 15c: dup_x2
      // 15d: pop
      // 15e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: ldc2_w 2831680290676450904
      // 167: lload 4
      // 169: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: astore 34
      // 170: new java/util/LinkedHashSet
      // 173: dup
      // 174: invokespecial java/util/LinkedHashSet.<init> ()V
      // 177: astore 35
      // 179: aload 32
      // 17b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 180: astore 36
      // 182: aload 36
      // 184: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 189: ifeq 2e3
      // 18c: aload 36
      // 18e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 193: checkcast com/zelix/yn
      // 196: astore 37
      // 198: aload 0
      // 199: aload 37
      // 19b: lload 19
      // 19d: aload 30
      // 19f: aload 31
      // 1a1: aload 7
      // 1a3: bipush 5
      // 1a4: anewarray 302
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 4
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x1
      // 1ad: swap
      // 1ae: bipush 3
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 2
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x2
      // 1b7: dup_x2
      // 1b8: pop
      // 1b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bc: bipush 1
      // 1bd: swap
      // 1be: aastore
      // 1bf: dup_x1
      // 1c0: swap
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: ldc2_w 4522266270460495531
      // 1c7: lload 4
      // 1c9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: istore 38
      // 1d0: iload 38
      // 1d2: aload 29
      // 1d4: lload 4
      // 1d6: lconst_0
      // 1d7: lcmp
      // 1d8: iflt 1e0
      // 1db: ifnonnull 2fa
      // 1de: aload 29
      // 1e0: lload 4
      // 1e2: lconst_0
      // 1e3: lcmp
      // 1e4: iflt 2c8
      // 1e7: ifnonnull 2c6
      // 1ea: goto 1f8
      // 1ed: ldc2_w 2435345217669971500
      // 1f0: lload 4
      // 1f2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: lload 4
      // 1fa: lconst_0
      // 1fb: lcmp
      // 1fc: ifle 257
      // 1ff: tableswitch 129 -1 2 40 100 115 115
      // 21c: ldc2_w 2435345217669971500
      // 21f: lload 4
      // 221: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: aload 0
      // 228: aload 34
      // 22a: aload 35
      // 22c: aload 30
      // 22e: lload 13
      // 230: bipush 4
      // 231: anewarray 302
      // 234: dup_x2
      // 235: dup_x2
      // 236: pop
      // 237: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23a: bipush 3
      // 23b: swap
      // 23c: aastore
      // 23d: dup_x1
      // 23e: swap
      // 23f: bipush 2
      // 240: swap
      // 241: aastore
      // 242: dup_x1
      // 243: swap
      // 244: bipush 1
      // 245: swap
      // 246: aastore
      // 247: dup_x1
      // 248: swap
      // 249: bipush 0
      // 24a: swap
      // 24b: aastore
      // 24c: ldc2_w 2753719813013668130
      // 24f: lload 4
      // 251: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: bipush 0
      // 257: ireturn
      // 258: ldc2_w 2435345217669971500
      // 25b: lload 4
      // 25d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: athrow
      // 263: aload 34
      // 265: aload 37
      // 267: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 26c: pop
      // 26d: aload 29
      // 26f: ifnull 280
      // 272: goto 280
      // 275: ldc2_w 2435345217669971500
      // 278: lload 4
      // 27a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: athrow
      // 280: aload 0
      // 281: aload 37
      // 283: aload 30
      // 285: aload 31
      // 287: aload 34
      // 289: aload 35
      // 28b: lload 25
      // 28d: aload 7
      // 28f: bipush 7
      // 291: anewarray 302
      // 294: dup_x1
      // 295: swap
      // 296: bipush 6
      // 298: swap
      // 299: aastore
      // 29a: dup_x2
      // 29b: dup_x2
      // 29c: pop
      // 29d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a0: bipush 5
      // 2a1: swap
      // 2a2: aastore
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: bipush 4
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 3
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x1
      // 2ae: swap
      // 2af: bipush 2
      // 2b0: swap
      // 2b1: aastore
      // 2b2: dup_x1
      // 2b3: swap
      // 2b4: bipush 1
      // 2b5: swap
      // 2b6: aastore
      // 2b7: dup_x1
      // 2b8: swap
      // 2b9: bipush 0
      // 2ba: swap
      // 2bb: aastore
      // 2bc: ldc2_w 2439900388447260834
      // 2bf: lload 4
      // 2c1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: aload 29
      // 2c8: ifnonnull 2dd
      // 2cb: ifne 2de
      // 2ce: goto 2dc
      // 2d1: ldc2_w 2435345217669971500
      // 2d4: lload 4
      // 2d6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: bipush 0
      // 2dd: ireturn
      // 2de: aload 29
      // 2e0: ifnull 182
      // 2e3: aload 33
      // 2e5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2ea: lload 4
      // 2ec: lconst_0
      // 2ed: lcmp
      // 2ee: iflt 193
      // 2f1: astore 36
      // 2f3: aload 36
      // 2f5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2fa: ifeq 46f
      // 2fd: aload 36
      // 2ff: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 304: checkcast com/zelix/yn
      // 307: astore 37
      // 309: iload 8
      // 30b: aload 29
      // 30d: lload 4
      // 30f: lconst_0
      // 310: lcmp
      // 311: ifle 319
      // 314: ifnonnull 470
      // 317: aload 29
      // 319: ifnonnull 3d3
      // 31c: goto 32a
      // 31f: ldc2_w 2435345217669971500
      // 322: lload 4
      // 324: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: athrow
      // 32a: ifeq 387
      // 32d: goto 33b
      // 330: ldc2_w 2435345217669971500
      // 333: lload 4
      // 335: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: athrow
      // 33b: aload 0
      // 33c: aload 37
      // 33e: aload 30
      // 340: lload 27
      // 342: aload 31
      // 344: aload 35
      // 346: aload 7
      // 348: bipush 6
      // 34a: anewarray 302
      // 34d: dup_x1
      // 34e: swap
      // 34f: bipush 5
      // 350: swap
      // 351: aastore
      // 352: dup_x1
      // 353: swap
      // 354: bipush 4
      // 355: swap
      // 356: aastore
      // 357: dup_x1
      // 358: swap
      // 359: bipush 3
      // 35a: swap
      // 35b: aastore
      // 35c: dup_x2
      // 35d: dup_x2
      // 35e: pop
      // 35f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 362: bipush 2
      // 363: swap
      // 364: aastore
      // 365: dup_x1
      // 366: swap
      // 367: bipush 1
      // 368: swap
      // 369: aastore
      // 36a: dup_x1
      // 36b: swap
      // 36c: bipush 0
      // 36d: swap
      // 36e: aastore
      // 36f: ldc2_w 4163502082236729686
      // 372: lload 4
      // 374: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: istore 38
      // 37b: lload 4
      // 37d: lconst_0
      // 37e: lcmp
      // 37f: iflt 3d5
      // 382: aload 29
      // 384: ifnull 3d5
      // 387: aload 0
      // 388: aload 37
      // 38a: aload 30
      // 38c: lload 11
      // 38e: aload 31
      // 390: aload 35
      // 392: aload 7
      // 394: bipush 6
      // 396: anewarray 302
      // 399: dup_x1
      // 39a: swap
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
      // 3bb: ldc2_w 4175788644205676989
      // 3be: lload 4
      // 3c0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: goto 3d3
      // 3c8: ldc2_w 2435345217669971500
      // 3cb: lload 4
      // 3cd: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: athrow
      // 3d3: istore 38
      // 3d5: iload 38
      // 3d7: aload 29
      // 3d9: ifnonnull 445
      // 3dc: tableswitch 142 -1 2 43 106 128 128
      // 3fc: ldc2_w 2435345217669971500
      // 3ff: lload 4
      // 401: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: athrow
      // 407: aload 0
      // 408: aload 34
      // 40a: aload 35
      // 40c: aload 30
      // 40e: lload 13
      // 410: bipush 4
      // 411: anewarray 302
      // 414: dup_x2
      // 415: dup_x2
      // 416: pop
      // 417: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41a: bipush 3
      // 41b: swap
      // 41c: aastore
      // 41d: dup_x1
      // 41e: swap
      // 41f: bipush 2
      // 420: swap
      // 421: aastore
      // 422: dup_x1
      // 423: swap
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x1
      // 428: swap
      // 429: bipush 0
      // 42a: swap
      // 42b: aastore
      // 42c: ldc2_w 2753719813013668130
      // 42f: lload 4
      // 431: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 436: bipush 0
      // 437: goto 445
      // 43a: ldc2_w 2435345217669971500
      // 43d: lload 4
      // 43f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 444: athrow
      // 445: ireturn
      // 446: aload 34
      // 448: aload 37
      // 44a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 44f: pop
      // 450: aload 29
      // 452: lload 4
      // 454: lconst_0
      // 455: lcmp
      // 456: ifle 46c
      // 459: ifnull 46a
      // 45c: goto 46a
      // 45f: ldc2_w 2435345217669971500
      // 462: lload 4
      // 464: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: athrow
      // 46a: aload 29
      // 46c: ifnull 2f3
      // 46f: bipush 1
      // 470: ireturn
   }

   final boolean I(Object[] param1) {
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
      // 004: checkcast com/zelix/pg
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_fz
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_fz
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/pg
      // 01f: astore 5
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/_3
      // 027: astore 8
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/lang/Long
      // 02f: invokevirtual java/lang/Long.longValue ()J
      // 032: lstore 2
      // 033: pop
      // 034: getstatic com/zelix/_ye.a J
      // 037: lload 2
      // 038: lxor
      // 039: lstore 2
      // 03a: lload 2
      // 03b: dup2
      // 03c: ldc2_w 12334047540756
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 45676718451354
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 42088771073265
      // 04d: lxor
      // 04e: lstore 13
      // 050: dup2
      // 051: ldc2_w 122852651271739
      // 054: lxor
      // 055: lstore 15
      // 057: dup2
      // 058: ldc2_w 70058232623129
      // 05b: lxor
      // 05c: lstore 17
      // 05e: dup2
      // 05f: ldc2_w 57333898587209
      // 062: lxor
      // 063: lstore 19
      // 065: pop2
      // 066: ldc2_w 3854031973850130788
      // 069: lload 2
      // 06a: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 4
      // 071: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 074: checkcast java/util/List
      // 077: astore 22
      // 079: astore 21
      // 07b: aload 0
      // 07c: ldc2_w 3266222657073569289
      // 07f: lload 2
      // 080: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: ifeq 09b
      // 088: aload 6
      // 08a: astore 23
      // 08c: aload 7
      // 08e: astore 24
      // 090: aload 21
      // 092: lload 2
      // 093: lconst_0
      // 094: lcmp
      // 095: iflt 0bc
      // 098: ifnull 0ad
      // 09b: aload 6
      // 09d: lload 11
      // 09f: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0a2: astore 23
      // 0a4: aload 7
      // 0a6: lload 11
      // 0a8: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0ab: astore 24
      // 0ad: lload 17
      // 0af: bipush 1
      // 0b0: anewarray 302
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: ldc2_w 3467176284949690833
      // 0bf: lload 2
      // 0c0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: astore 25
      // 0c7: new java/util/LinkedHashSet
      // 0ca: dup
      // 0cb: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0ce: astore 26
      // 0d0: bipush 0
      // 0d1: istore 27
      // 0d3: iload 27
      // 0d5: aload 22
      // 0d7: invokeinterface java/util/List.size ()I 1
      // 0dc: if_icmpge 1d4
      // 0df: aload 22
      // 0e1: iload 27
      // 0e3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e8: checkcast com/zelix/yn
      // 0eb: astore 28
      // 0ed: aload 0
      // 0ee: aload 28
      // 0f0: lload 13
      // 0f2: aload 23
      // 0f4: aload 24
      // 0f6: aload 5
      // 0f8: bipush 5
      // 0f9: anewarray 302
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 4
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 3
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w 3567238773892401640
      // 11c: lload 2
      // 11d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: istore 29
      // 124: aload 21
      // 126: lload 2
      // 127: lconst_0
      // 128: lcmp
      // 129: iflt 1d1
      // 12c: ifnonnull 1cf
      // 12f: iload 29
      // 131: lload 2
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 1fc
      // 137: aload 21
      // 139: ifnonnull 1fc
      // 13c: goto 149
      // 13f: ldc2_w 3354940275451900271
      // 142: lload 2
      // 143: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: iflt 1a5
      // 14f: tableswitch 125 -1 2 39 97 112 112
      // 16c: ldc2_w 3354940275451900271
      // 16f: lload 2
      // 170: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 0
      // 177: aload 25
      // 179: aload 26
      // 17b: aload 23
      // 17d: lload 9
      // 17f: bipush 4
      // 180: anewarray 302
      // 183: dup_x2
      // 184: dup_x2
      // 185: pop
      // 186: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 189: bipush 3
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 2
      // 18f: swap
      // 190: aastore
      // 191: dup_x1
      // 192: swap
      // 193: bipush 1
      // 194: swap
      // 195: aastore
      // 196: dup_x1
      // 197: swap
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: ldc2_w 2987043659246898785
      // 19e: lload 2
      // 19f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: bipush 0
      // 1a5: ireturn
      // 1a6: ldc2_w 3354940275451900271
      // 1a9: lload 2
      // 1aa: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: aload 25
      // 1b2: aload 28
      // 1b4: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b9: pop
      // 1ba: aload 21
      // 1bc: ifnull 1cc
      // 1bf: goto 1cc
      // 1c2: ldc2_w 3354940275451900271
      // 1c5: lload 2
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: iinc 27 1
      // 1cf: aload 21
      // 1d1: ifnull 0d3
      // 1d4: aload 0
      // 1d5: aload 21
      // 1d7: lload 2
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: iflt 268
      // 1dd: lload 2
      // 1de: lconst_0
      // 1df: lcmp
      // 1e0: iflt 268
      // 1e3: ifnonnull 24b
      // 1e6: ldc2_w 3378895145582062957
      // 1e9: lload 2
      // 1ea: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: goto 1fc
      // 1f2: ldc2_w 3354940275451900271
      // 1f5: lload 2
      // 1f6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: ifne 23d
      // 1ff: aload 0
      // 200: aload 4
      // 202: aload 23
      // 204: invokevirtual com/zelix/_f8.v ()Ljava/lang/String;
      // 207: lload 19
      // 209: dup2_x1
      // 20a: pop2
      // 20b: bipush 3
      // 20c: anewarray 302
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 2
      // 212: swap
      // 213: aastore
      // 214: dup_x2
      // 215: dup_x2
      // 216: pop
      // 217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21a: bipush 1
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 0
      // 220: swap
      // 221: aastore
      // 222: ldc2_w 3974939758600565027
      // 225: lload 2
      // 226: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: aload 21
      // 22d: ifnull 271
      // 230: goto 23d
      // 233: ldc2_w 3354940275451900271
      // 236: lload 2
      // 237: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: aload 0
      // 23e: goto 24b
      // 241: ldc2_w 3354940275451900271
      // 244: lload 2
      // 245: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: lload 15
      // 24d: aload 4
      // 24f: aload 8
      // 251: bipush 3
      // 252: anewarray 302
      // 255: dup_x1
      // 256: swap
      // 257: bipush 2
      // 258: swap
      // 259: aastore
      // 25a: dup_x1
      // 25b: swap
      // 25c: bipush 1
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x2
      // 260: dup_x2
      // 261: pop
      // 262: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 265: bipush 0
      // 266: swap
      // 267: aastore
      // 268: ldc2_w 3562674454568188140
      // 26b: lload 2
      // 26c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: bipush 1
      // 272: ireturn
   }

   private boolean L(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_f8
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_f8
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/util/Set
      // 01d: astore 6
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/util/Set
      // 025: astore 9
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 7
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/pg
      // 039: astore 5
      // 03b: pop
      // 03c: getstatic com/zelix/_ye.a J
      // 03f: lload 7
      // 041: lxor
      // 042: lstore 7
      // 044: lload 7
      // 046: dup2
      // 047: ldc2_w 32237663084036
      // 04a: lxor
      // 04b: lstore 10
      // 04d: dup2
      // 04e: ldc2_w 125896739785188
      // 051: lxor
      // 052: lstore 12
      // 054: dup2
      // 055: ldc2_w 64156847336957
      // 058: lxor
      // 059: lstore 14
      // 05b: dup2
      // 05c: ldc2_w 25467522543384
      // 05f: lxor
      // 060: lstore 16
      // 062: dup2
      // 063: ldc2_w 22329004062580
      // 066: lxor
      // 067: lstore 18
      // 069: dup2
      // 06a: ldc2_w 3165441329862
      // 06d: lxor
      // 06e: lstore 20
      // 070: pop2
      // 071: ldc2_w -1254968522253503859
      // 074: lload 7
      // 076: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: aload 0
      // 07c: aload 4
      // 07e: lload 18
      // 080: bipush 2
      // 081: anewarray 302
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 1
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 0
      // 090: swap
      // 091: aastore
      // 092: ldc2_w -1459667139638078878
      // 095: lload 7
      // 097: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: astore 23
      // 09e: astore 22
      // 0a0: aload 23
      // 0a2: aload 22
      // 0a4: ifnonnull 0ba
      // 0a7: ifnull 26a
      // 0aa: goto 0b8
      // 0ad: ldc2_w -763899954897098106
      // 0b0: lload 7
      // 0b2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 23
      // 0ba: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0bf: astore 24
      // 0c1: aload 24
      // 0c3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c8: ifeq 26a
      // 0cb: aload 24
      // 0cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d2: checkcast com/zelix/yn
      // 0d5: astore 25
      // 0d7: aload 0
      // 0d8: aload 25
      // 0da: ldc2_w -897071700209581031
      // 0dd: lload 7
      // 0df: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: new com/zelix/_fz
      // 0e7: dup
      // 0e8: lload 20
      // 0ea: aload 2
      // 0eb: invokespecial com/zelix/_fz.<init> (JLcom/zelix/_f8;)V
      // 0ee: lload 10
      // 0f0: dup2_x1
      // 0f1: pop2
      // 0f2: bipush 3
      // 0f3: anewarray 302
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 2
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 101: bipush 1
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w -1418349846739973761
      // 10c: lload 7
      // 10e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: aload 22
      // 115: lload 7
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 121
      // 11c: ifnonnull 26b
      // 11f: aload 22
      // 121: ifnonnull 1cf
      // 124: goto 132
      // 127: ldc2_w -763899954897098106
      // 12a: lload 7
      // 12c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: ifeq 185
      // 135: goto 143
      // 138: ldc2_w -763899954897098106
      // 13b: lload 7
      // 13d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 0
      // 144: aload 25
      // 146: lload 16
      // 148: aload 3
      // 149: aload 2
      // 14a: aload 5
      // 14c: bipush 5
      // 14d: anewarray 302
      // 150: dup_x1
      // 151: swap
      // 152: bipush 4
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 3
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 2
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x2
      // 160: dup_x2
      // 161: pop
      // 162: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 165: bipush 1
      // 166: swap
      // 167: aastore
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: ldc2_w -1555903864123256319
      // 170: lload 7
      // 172: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: istore 26
      // 179: lload 7
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: ifle 1d1
      // 180: aload 22
      // 182: ifnull 1d1
      // 185: aload 0
      // 186: aload 25
      // 188: aload 3
      // 189: lload 12
      // 18b: aload 2
      // 18c: aload 9
      // 18e: aload 5
      // 190: bipush 6
      // 192: anewarray 302
      // 195: dup_x1
      // 196: swap
      // 197: bipush 5
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 4
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 3
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 2
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: ldc2_w -1343936092356961001
      // 1ba: lload 7
      // 1bc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: goto 1cf
      // 1c4: ldc2_w -763899954897098106
      // 1c7: lload 7
      // 1c9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: istore 26
      // 1d1: iload 26
      // 1d3: aload 22
      // 1d5: ifnonnull 240
      // 1d8: tableswitch 141 -1 2 43 105 127 127
      // 1f8: ldc2_w -763899954897098106
      // 1fb: lload 7
      // 1fd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: aload 0
      // 204: aload 6
      // 206: aload 9
      // 208: aload 3
      // 209: lload 14
      // 20b: bipush 4
      // 20c: anewarray 302
      // 20f: dup_x2
      // 210: dup_x2
      // 211: pop
      // 212: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 215: bipush 3
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: bipush 2
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 1
      // 220: swap
      // 221: aastore
      // 222: dup_x1
      // 223: swap
      // 224: bipush 0
      // 225: swap
      // 226: aastore
      // 227: ldc2_w -964565199025384056
      // 22a: lload 7
      // 22c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: bipush 0
      // 232: goto 240
      // 235: ldc2_w -763899954897098106
      // 238: lload 7
      // 23a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: ireturn
      // 241: aload 6
      // 243: aload 4
      // 245: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 24a: pop
      // 24b: aload 22
      // 24d: lload 7
      // 24f: lconst_0
      // 250: lcmp
      // 251: iflt 267
      // 254: ifnull 265
      // 257: goto 265
      // 25a: ldc2_w -763899954897098106
      // 25d: lload 7
      // 25f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 22
      // 267: ifnull 0c1
      // 26a: bipush 1
      // 26b: ireturn
   }

   final boolean A(Object[] var1) {
      long var6 = (Long)var1[0];
      pg var4 = (pg)var1[1];
      _fz var5 = (_fz)var1[2];
      _fz var2 = (_fz)var1[3];
      pg var3 = (pg)var1[4];
      var6 = a ^ var6;
      long var8 = var6 ^ 102681233669966L;
      return x44.a<"k">(this, new Object[]{var4, var5, var2, var3, null, var8}, -567153152298727359L, var6);
   }

   public final hz d(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_fz
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/_ye.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 136652364932664
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 97159345354
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 98981296689695
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 111116580940613
      // 03c: lxor
      // 03d: dup2
      // 03e: bipush 48
      // 040: lushr
      // 041: l2i
      // 042: istore 12
      // 044: dup2
      // 045: bipush 16
      // 047: lshl
      // 048: bipush 32
      // 04a: lushr
      // 04b: l2i
      // 04c: istore 13
      // 04e: dup2
      // 04f: bipush 48
      // 051: lshl
      // 052: bipush 48
      // 054: lushr
      // 055: l2i
      // 056: istore 14
      // 058: pop2
      // 059: pop2
      // 05a: aload 5
      // 05c: lload 6
      // 05e: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 061: astore 16
      // 063: ldc2_w -179780155551030887
      // 066: lload 2
      // 067: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aconst_null
      // 06d: astore 17
      // 06f: aload 0
      // 070: ldc2_w -1745656619648439870
      // 073: lload 2
      // 074: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: aload 16
      // 07b: iload 12
      // 07d: i2c
      // 07e: iload 13
      // 080: aload 4
      // 082: iload 14
      // 084: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 087: checkcast com/zelix/hz
      // 08a: astore 18
      // 08c: astore 15
      // 08e: aconst_null
      // 08f: astore 19
      // 091: aload 18
      // 093: ifnull 225
      // 096: aload 18
      // 098: astore 19
      // 09a: aload 0
      // 09b: ldc2_w -1745656619648439870
      // 09e: lload 2
      // 09f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: aload 18
      // 0a6: lload 6
      // 0a8: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0ab: iload 12
      // 0ad: i2c
      // 0ae: iload 13
      // 0b0: aload 4
      // 0b2: iload 14
      // 0b4: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 0b7: checkcast com/zelix/hz
      // 0ba: astore 18
      // 0bc: aload 18
      // 0be: aload 15
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 0cb
      // 0c6: ifnonnull 22d
      // 0c9: aload 15
      // 0cb: ifnonnull 093
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: ifle 0be
      // 0d4: goto 0e1
      // 0d7: ldc2_w -1841361845633091182
      // 0da: lload 2
      // 0db: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: ifnull 091
      // 0e4: aload 17
      // 0e6: aload 15
      // 0e8: ifnonnull 12c
      // 0eb: ifnonnull 12a
      // 0ee: goto 0fb
      // 0f1: ldc2_w -1841361845633091182
      // 0f4: lload 2
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: lload 10
      // 0fd: sipush 9143
      // 100: ldc2_w 3512459288289870731
      // 103: lload 2
      // 104: lxor
      // 105: invokedynamic o (IJ)I bsm=com/zelix/_ye.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: bipush 2
      // 10b: anewarray 302
      // 10e: dup_x1
      // 10f: swap
      // 110: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -2237699116219997722
      // 122: lload 2
      // 123: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: astore 17
      // 12a: aload 17
      // 12c: aload 18
      // 12e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 133: ifne 091
      // 136: new java/lang/StringBuffer
      // 139: dup
      // 13a: invokespecial java/lang/StringBuffer.<init> ()V
      // 13d: astore 20
      // 13f: aload 17
      // 141: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 146: astore 21
      // 148: aload 21
      // 14a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14f: ifeq 1e1
      // 152: aload 21
      // 154: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 159: checkcast com/zelix/hz
      // 15c: astore 22
      // 15e: lload 2
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 18d
      // 164: aload 20
      // 166: new java/lang/StringBuilder
      // 169: dup
      // 16a: invokespecial java/lang/StringBuilder.<init> ()V
      // 16d: ldc "'"
      // 16f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 172: aload 22
      // 174: lload 6
      // 176: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: ldc "'"
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 184: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 187: aload 15
      // 189: ifnonnull 1db
      // 18c: pop
      // 18d: lload 2
      // 18e: lconst_0
      // 18f: lcmp
      // 190: iflt 220
      // 193: aload 21
      // 195: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19a: aload 15
      // 19c: ifnonnull 1e8
      // 19f: goto 1ac
      // 1a2: ldc2_w -1841361845633091182
      // 1a5: lload 2
      // 1a6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: ifeq 1dc
      // 1af: goto 1bc
      // 1b2: ldc2_w -1841361845633091182
      // 1b5: lload 2
      // 1b6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: aload 20
      // 1be: sipush 639
      // 1c1: ldc2_w 973301612296541122
      // 1c4: lload 2
      // 1c5: lxor
      // 1c6: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_ye.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1ce: goto 1db
      // 1d1: ldc2_w -1841361845633091182
      // 1d4: lload 2
      // 1d5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: pop
      // 1dc: aload 15
      // 1de: ifnull 148
      // 1e1: lload 2
      // 1e2: lconst_0
      // 1e3: lcmp
      // 1e4: iflt 220
      // 1e7: bipush 0
      // 1e8: bipush 1
      // 1e9: anewarray 4
      // 1ec: dup
      // 1ed: bipush 0
      // 1ee: new java/lang/StringBuilder
      // 1f1: dup
      // 1f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f5: sipush 25867
      // 1f8: ldc2_w 1035172140649247923
      // 1fb: lload 2
      // 1fc: lxor
      // 1fd: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_ye.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 205: aload 4
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 20a: getstatic com/zelix/mc.R Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: aload 20
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 215: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 218: aastore
      // 219: lload 8
      // 21b: dup2_x2
      // 21c: pop2
      // 21d: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 220: aload 15
      // 222: ifnull 091
      // 225: lload 2
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 0bc
      // 22b: aload 19
      // 22d: areturn
   }

   public boolean S(Object[] param1) {
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
      // 04: checkcast com/zelix/yn
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/_fz
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/_fz
      // 16: astore 5
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast com/zelix/iu
      // 1e: astore 6
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast com/zelix/pg
      // 26: astore 3
      // 27: dup
      // 28: bipush 5
      // 29: aaload
      // 2a: checkcast java/lang/Long
      // 2d: invokevirtual java/lang/Long.longValue ()J
      // 30: lstore 7
      // 32: pop
      // 33: getstatic com/zelix/_ye.a J
      // 36: lload 7
      // 38: lxor
      // 39: lstore 7
      // 3b: lload 7
      // 3d: dup2
      // 3e: ldc2_w 118845989884964
      // 41: lxor
      // 42: lstore 9
      // 44: dup2
      // 45: ldc2_w 44659715185520
      // 48: lxor
      // 49: lstore 11
      // 4b: pop2
      // 4c: ldc2_w 4942213223730632846
      // 4f: lload 7
      // 51: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: astore 13
      // 58: aload 0
      // 59: ldc2_w 6681641071221780451
      // 5c: lload 7
      // 5e: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: ifeq 75
      // 66: aload 2
      // 67: lload 7
      // 69: lconst_0
      // 6a: lcmp
      // 6b: ifle 76
      // 6e: astore 14
      // 70: aload 13
      // 72: ifnull 7d
      // 75: aload 2
      // 76: lload 11
      // 78: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 7b: astore 14
      // 7d: aload 0
      // 7e: aload 4
      // 80: lload 9
      // 82: aload 14
      // 84: aload 3
      // 85: bipush 4
      // 86: anewarray 302
      // 89: dup_x1
      // 8a: swap
      // 8b: bipush 3
      // 8c: swap
      // 8d: aastore
      // 8e: dup_x1
      // 8f: swap
      // 90: bipush 2
      // 91: swap
      // 92: aastore
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 1
      // 9a: swap
      // 9b: aastore
      // 9c: dup_x1
      // 9d: swap
      // 9e: bipush 0
      // 9f: swap
      // a0: aastore
      // a1: ldc2_w 6860145473780306956
      // a4: lload 7
      // a6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: istore 15
      // ad: iload 15
      // af: aload 13
      // b1: ifnonnull d5
      // b4: bipush -1
      // b5: if_icmpeq d8
      // b8: goto c6
      // bb: ldc2_w 6873941582472560773
      // be: lload 7
      // c0: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: bipush 1
      // c7: goto d5
      // ca: ldc2_w 6873941582472560773
      // cd: lload 7
      // cf: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: goto d9
      // d8: bipush 0
      // d9: ireturn
   }

   final boolean H(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_fz
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_fz
      // 021: astore 8
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/iu
      // 029: astore 7
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/pg
      // 031: astore 2
      // 032: pop
      // 033: getstatic com/zelix/_ye.a J
      // 036: lload 4
      // 038: lxor
      // 039: lstore 4
      // 03b: lload 4
      // 03d: dup2
      // 03e: ldc2_w 45047467323276
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 111307886105010
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 61003893269783
      // 04f: lxor
      // 050: lstore 13
      // 052: dup2
      // 053: ldc2_w 36588153290644
      // 056: lxor
      // 057: lstore 15
      // 059: dup2
      // 05a: ldc2_w 83266700121455
      // 05d: lxor
      // 05e: lstore 17
      // 060: dup2
      // 061: ldc2_w 78184868941488
      // 064: lxor
      // 065: lstore 19
      // 067: dup2
      // 068: ldc2_w 128565168976455
      // 06b: lxor
      // 06c: lstore 21
      // 06e: pop2
      // 06f: ldc2_w -4976095678651095319
      // 072: lload 4
      // 074: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: astore 23
      // 07b: aload 0
      // 07c: ldc2_w -6710668271701241468
      // 07f: lload 4
      // 081: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: ifeq 09c
      // 089: aload 3
      // 08a: astore 24
      // 08c: aload 8
      // 08e: astore 25
      // 090: aload 23
      // 092: lload 4
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 0d2
      // 099: ifnull 0ad
      // 09c: aload 3
      // 09d: lload 13
      // 09f: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0a2: astore 24
      // 0a4: aload 8
      // 0a6: lload 13
      // 0a8: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0ab: astore 25
      // 0ad: lload 17
      // 0af: sipush 20955
      // 0b2: ldc2_w 6484974274750330516
      // 0b5: lload 4
      // 0b7: lxor
      // 0b8: invokedynamic o (IJ)I bsm=com/zelix/_ye.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: bipush 2
      // 0be: anewarray 302
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c6: bipush 1
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w -6376523966473689450
      // 0d5: lload 4
      // 0d7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: astore 26
      // 0de: lload 15
      // 0e0: bipush 1
      // 0e1: anewarray 302
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w -4642933557090240932
      // 0f0: lload 4
      // 0f2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: astore 27
      // 0f9: new java/util/LinkedHashSet
      // 0fc: dup
      // 0fd: invokespecial java/util/LinkedHashSet.<init> ()V
      // 100: astore 28
      // 102: aload 0
      // 103: aload 6
      // 105: aload 24
      // 107: aload 25
      // 109: aload 27
      // 10b: aload 28
      // 10d: lload 19
      // 10f: aload 26
      // 111: aload 7
      // 113: aload 2
      // 114: bipush 9
      // 116: anewarray 302
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 8
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 7
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 6
      // 129: swap
      // 12a: aastore
      // 12b: dup_x2
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 131: bipush 5
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 4
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 3
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 2
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w -4733285413404090760
      // 150: lload 4
      // 152: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: istore 29
      // 159: iload 29
      // 15b: aload 23
      // 15d: ifnonnull 222
      // 160: ifeq 213
      // 163: goto 171
      // 166: ldc2_w -6844844064995098910
      // 169: lload 4
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: lload 4
      // 173: lconst_0
      // 174: lcmp
      // 175: ifle 207
      // 178: aload 7
      // 17a: lload 21
      // 17c: invokevirtual com/zelix/iu.Q (J)Z
      // 17f: aload 23
      // 181: ifnonnull 205
      // 184: goto 192
      // 187: ldc2_w -6844844064995098910
      // 18a: lload 4
      // 18c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: ifeq 1b0
      // 195: goto 1a3
      // 198: ldc2_w -6844844064995098910
      // 19b: lload 4
      // 19d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: bipush 1
      // 1a4: ireturn
      // 1a5: ldc2_w -6844844064995098910
      // 1a8: lload 4
      // 1aa: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: aload 6
      // 1b3: aload 24
      // 1b5: aload 25
      // 1b7: lload 11
      // 1b9: aload 27
      // 1bb: aload 28
      // 1bd: aload 26
      // 1bf: aload 7
      // 1c1: aload 2
      // 1c2: bipush 9
      // 1c4: anewarray 302
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: bipush 8
      // 1cb: swap
      // 1cc: aastore
      // 1cd: dup_x1
      // 1ce: swap
      // 1cf: bipush 7
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x1
      // 1d4: swap
      // 1d5: bipush 6
      // 1d7: swap
      // 1d8: aastore
      // 1d9: dup_x1
      // 1da: swap
      // 1db: bipush 5
      // 1dc: swap
      // 1dd: aastore
      // 1de: dup_x1
      // 1df: swap
      // 1e0: bipush 4
      // 1e1: swap
      // 1e2: aastore
      // 1e3: dup_x2
      // 1e4: dup_x2
      // 1e5: pop
      // 1e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e9: bipush 3
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x1
      // 1ed: swap
      // 1ee: bipush 2
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 0
      // 1f9: swap
      // 1fa: aastore
      // 1fb: ldc2_w -5148937455260110902
      // 1fe: lload 4
      // 200: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: istore 29
      // 207: lload 4
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 223
      // 20e: aload 23
      // 210: ifnull 223
      // 213: bipush 0
      // 214: goto 222
      // 217: ldc2_w -6844844064995098910
      // 21a: lload 4
      // 21c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: ireturn
      // 223: iload 29
      // 225: aload 23
      // 227: ifnonnull 2f1
      // 22a: ifeq 2e2
      // 22d: goto 23b
      // 230: ldc2_w -6844844064995098910
      // 233: lload 4
      // 235: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: athrow
      // 23b: aload 26
      // 23d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 242: astore 30
      // 244: aload 30
      // 246: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24b: ifeq 2d6
      // 24e: aload 30
      // 250: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 255: checkcast com/zelix/yn
      // 258: astore 31
      // 25a: aload 0
      // 25b: aload 31
      // 25d: aload 24
      // 25f: aload 25
      // 261: aload 27
      // 263: lload 9
      // 265: aload 28
      // 267: aload 2
      // 268: bipush 7
      // 26a: anewarray 302
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 6
      // 271: swap
      // 272: aastore
      // 273: dup_x1
      // 274: swap
      // 275: bipush 5
      // 276: swap
      // 277: aastore
      // 278: dup_x2
      // 279: dup_x2
      // 27a: pop
      // 27b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27e: bipush 4
      // 27f: swap
      // 280: aastore
      // 281: dup_x1
      // 282: swap
      // 283: bipush 3
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 2
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 1
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 0
      // 293: swap
      // 294: aastore
      // 295: ldc2_w -4774041255649861297
      // 298: lload 4
      // 29a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: aload 23
      // 2a1: lload 4
      // 2a3: lconst_0
      // 2a4: lcmp
      // 2a5: iflt 2ad
      // 2a8: ifnonnull 2f3
      // 2ab: aload 23
      // 2ad: ifnonnull 2d0
      // 2b0: goto 2be
      // 2b3: ldc2_w -6844844064995098910
      // 2b6: lload 4
      // 2b8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: ifne 2d1
      // 2c1: goto 2cf
      // 2c4: ldc2_w -6844844064995098910
      // 2c7: lload 4
      // 2c9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ce: athrow
      // 2cf: bipush 0
      // 2d0: ireturn
      // 2d1: aload 23
      // 2d3: ifnull 244
      // 2d6: aload 23
      // 2d8: lload 4
      // 2da: lconst_0
      // 2db: lcmp
      // 2dc: iflt 255
      // 2df: ifnull 2f2
      // 2e2: bipush 0
      // 2e3: goto 2f1
      // 2e6: ldc2_w -6844844064995098910
      // 2e9: lload 4
      // 2eb: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: athrow
      // 2f1: ireturn
      // 2f2: bipush 1
      // 2f3: ireturn
   }

   public boolean n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 9157989978911116365L, var2);
   }

   public final void F(Object[] var1) {
      Object var8;
      long var10;
      label17: {
         long var5;
         _fz var10000;
         label16: {
            _fz var4 = (_fz)var1[0];
            long var2 = (Long)var1[1];
            var10 = a ^ var2;
            var5 = var10 ^ 32058664176447L;
            hk[] var7 = x44.a<"u">(-7721015790072493887L, var10);
            if (x44.a<"i">(this, -8289226333550379092L, var10)) {
               var10000 = var4;
               if (var10 < 0L) {
                  break label16;
               }

               var8 = var4;
               if (var7 == null) {
                  break label17;
               }
            }

            var10000 = var4;
         }

         var8 = var10000.C(var5);
      }

      boolean var9 = x44.a<"i">(this, -7913527138839207782L, var10).add(var8);
   }

   private Map l(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      return x44.a<"j">(this, 1671465970507141843L, var2).D(var4);
   }

   public final hz H(Object[] var1) {
      String var5 = (String)var1[0];
      _fz var6 = (_fz)var1[1];
      hz var4 = (hz)var1[2];
      long var2 = (Long)var1[3];
      var2 = a ^ var2;
      long var10001 = var2 ^ 112818809773148L;
      int var7 = (int)((var2 ^ 112818809773148L) >>> 32);
      int var8 = (int)((var2 ^ 112818809773148L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      return (hz)x44.a<"n">(this, 2843502789775090327L, var2).s(var5, var6, var4, var7, (byte)var8, var9);
   }

   private final Set i(Object[] var1) {
      yn var2 = (yn)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 9619622269015L;
      return x44.a<"l">(this, -1401695003788207625L, var3).N(var5, var2);
   }

   private void d(Object[] var1) {
      long var2 = (Long)var1[0];
      yn var4 = (yn)var1[1];
      Set var5 = (Set)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 36276823253836L;
      hk[] var10000 = x44.a<"s">(157374114504154679L, var2);
      Set var9 = x44.a<"o">(this, 1730711354840845943L, var2).N(var6, var4);
      hk[] var8 = var10000;

      label28: {
         try {
            var14 = var9;
            if (var8 != null) {
               break label28;
            }

            if (var9 == null) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"s">(var12, 1863499734962865724L, var2);
         }

         var14 = var9;
      }

      for (yn var11 : var14) {
         var5.add(var11);
         if (var8 != null) {
            break;
         }
      }
   }

   private int g(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_f8
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/pg
      // 021: astore 6
      // 023: pop
      // 024: getstatic com/zelix/_ye.a J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 114287331073779
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 103358979021189
      // 036: lxor
      // 037: dup2
      // 038: bipush 32
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 9
      // 03e: dup2
      // 03f: bipush 32
      // 041: lshl
      // 042: bipush 56
      // 044: lushr
      // 045: l2i
      // 046: istore 10
      // 048: dup2
      // 049: bipush 40
      // 04b: lshl
      // 04c: bipush 40
      // 04e: lushr
      // 04f: l2i
      // 050: istore 11
      // 052: pop2
      // 053: dup2
      // 054: ldc2_w 34347947348781
      // 057: lxor
      // 058: lstore 12
      // 05a: pop2
      // 05b: ldc2_w 4064351944968086655
      // 05e: lload 2
      // 05f: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: astore 14
      // 066: aload 5
      // 068: aload 14
      // 06a: ifnonnull 0af
      // 06d: lload 12
      // 06f: invokevirtual com/zelix/yn.S (J)Z
      // 072: ifeq 08e
      // 075: goto 082
      // 078: ldc2_w 2563704056071470196
      // 07b: lload 2
      // 07c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: bipush 2
      // 083: ireturn
      // 084: ldc2_w 2563704056071470196
      // 087: lload 2
      // 088: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: aload 0
      // 08f: ldc2_w 4197097288535878151
      // 092: lload 2
      // 093: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: aload 5
      // 09a: aload 4
      // 09c: ldc2_w 2484342643534078331
      // 09f: lload 2
      // 0a0: invokedynamic j (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: iload 9
      // 0a7: iload 10
      // 0a9: i2b
      // 0aa: iload 11
      // 0ac: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 0af: checkcast com/zelix/rx
      // 0b2: astore 15
      // 0b4: aload 15
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0df
      // 0bc: aload 14
      // 0be: ifnonnull 0df
      // 0c1: ifnonnull 0dd
      // 0c4: goto 0d1
      // 0c7: ldc2_w 2563704056071470196
      // 0ca: lload 2
      // 0cb: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: ireturn
      // 0d3: ldc2_w 2563704056071470196
      // 0d6: lload 2
      // 0d7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 15
      // 0df: ldc2_w 2484342643534078331
      // 0e2: lload 2
      // 0e3: invokedynamic j (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: aload 14
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 122
      // 0f0: ifnonnull 11a
      // 0f3: if_acmpne 10f
      // 0f6: goto 103
      // 0f9: ldc2_w 2563704056071470196
      // 0fc: lload 2
      // 0fd: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: bipush 1
      // 104: ireturn
      // 105: ldc2_w 2563704056071470196
      // 108: lload 2
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 15
      // 111: ldc2_w 2510452032638889174
      // 114: lload 2
      // 115: invokedynamic j (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: lload 2
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: iflt 17f
      // 120: aload 14
      // 122: ifnonnull 17f
      // 125: if_acmpne 15c
      // 128: goto 135
      // 12b: ldc2_w 2563704056071470196
      // 12e: lload 2
      // 12f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 0
      // 136: ldc2_w 4197097288535878151
      // 139: lload 2
      // 13a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: aload 5
      // 141: aload 4
      // 143: aload 15
      // 145: iload 9
      // 147: iload 10
      // 149: i2b
      // 14a: iload 11
      // 14c: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 14f: pop
      // 150: bipush 1
      // 151: ireturn
      // 152: ldc2_w 2563704056071470196
      // 155: lload 2
      // 156: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 1df
      // 162: aload 15
      // 164: aload 14
      // 166: ifnonnull 1ca
      // 169: ldc2_w 2321464704331996822
      // 16c: lload 2
      // 16d: invokedynamic j (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: goto 17f
      // 175: ldc2_w 2563704056071470196
      // 178: lload 2
      // 179: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: if_acmpne 1b0
      // 182: aload 0
      // 183: ldc2_w 4197097288535878151
      // 186: lload 2
      // 187: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: aload 5
      // 18e: aload 4
      // 190: ldc2_w 2321464704331996822
      // 193: lload 2
      // 194: invokedynamic j (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: iload 9
      // 19b: iload 10
      // 19d: i2b
      // 19e: iload 11
      // 1a0: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1a3: pop
      // 1a4: bipush 1
      // 1a5: ireturn
      // 1a6: ldc2_w 2563704056071470196
      // 1a9: lload 2
      // 1aa: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: ldc2_w 4197097288535878151
      // 1b4: lload 2
      // 1b5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: aload 5
      // 1bc: aload 4
      // 1be: aload 15
      // 1c0: iload 9
      // 1c2: iload 10
      // 1c4: i2b
      // 1c5: iload 11
      // 1c7: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1ca: pop
      // 1cb: aload 6
      // 1cd: aload 15
      // 1cf: ldc2_w 4546658764488417525
      // 1d2: lload 2
      // 1d3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: lload 7
      // 1da: dup2_x1
      // 1db: pop2
      // 1dc: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 1df: bipush -1
      // 1e0: ireturn
   }

   public final String h(Object[] var1) {
      pg var2 = (pg)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return (String)((pg)x44.a<"l">(this, -5477691216908519627L, var3).get(var2)).G();
   }

   private Map a(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"j">(this, 7756676022681216417L, var3).D(var2);
   }

   public final void U(Object[] var1) {
      pg var4 = (pg)var1[0];
      long var2 = (Long)var1[1];
      String var5 = (String)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 69091705034612L;
      pg var8 = (pg)x44.a<"h">(this, 7901358569613961577L, var2).get(var4);
      var8.G(var6, var5);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Map f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 88410760801173L;
      hk[] var10000 = x44.a<"u">(-6840681670389318391L, var2);
      HashMap var7 = x44.a<"u">(new Object[]{var4}, -6455348275792494586L, var2);
      hk[] var6 = var10000;
      Iterator var8 = x44.a<"m">(x44.a<"i">(this, -6398743194088609042L, var2), new Object[0], -4686382250311815092L, var2).iterator();

      while (true) {
         Iterator var10;
         if (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            var10 = ((Map)var9.getValue()).entrySet().iterator();
         } else {
            if (var2 > 0L) {
               return var7;
            }

            Entry var16 = (Entry)var7;
            var10 = ((Map)var16.getValue()).entrySet().iterator();
         }

         label52:
         while (true) {
            label49: {
               if (var10.hasNext()) {
                  var10000 = (hk[])var10.next();
               } else {
                  var10000 = var6;
                  if (var2 >= 0L) {
                     break label49;
                  }
               }

               do {
                  Entry var11 = (Entry)var10000;
                  _fz var12 = (_fz)var11.getKey();
                  pg var13 = (pg)var11.getValue();
                  Object var14 = var7.put(var13, var12);
                  if (var6 != null) {
                     break;
                  }

                  if (var2 <= 0L) {
                     var10 = ((Map)var6).entrySet().iterator();
                     continue label52;
                  }

                  if (var6 == null) {
                     continue label52;
                  }

                  var10000 = var6;
               } while (var2 < 0L);
            }

            if (var10000 == null) {
               break;
            }

            if (var2 > 0L) {
               return var7;
            }

            Entry var17 = (Entry)var7;
            var10 = ((Map)var17.getValue()).entrySet().iterator();
         }
      }
   }

   private void Q(Object[] param1) {
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
      // 004: checkcast com/zelix/_yv
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/pd
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_ur
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: istore 7
      // 02d: pop
      // 02e: getstatic com/zelix/_ye.a J
      // 031: lload 5
      // 033: lxor
      // 034: lstore 5
      // 036: lload 5
      // 038: dup2
      // 039: ldc2_w 83619006739704
      // 03c: lxor
      // 03d: lstore 8
      // 03f: dup2
      // 040: ldc2_w 94858486049984
      // 043: lxor
      // 044: lstore 10
      // 046: dup2
      // 047: ldc2_w 388566667220
      // 04a: lxor
      // 04b: lstore 12
      // 04d: dup2
      // 04e: ldc2_w 40319740795110
      // 051: lxor
      // 052: lstore 14
      // 054: dup2
      // 055: ldc2_w 95462711447127
      // 058: lxor
      // 059: lstore 16
      // 05b: dup2
      // 05c: ldc2_w 43684804208994
      // 05f: lxor
      // 060: lstore 18
      // 062: dup2
      // 063: ldc2_w 37641773268990
      // 066: lxor
      // 067: dup2
      // 068: bipush 48
      // 06a: lushr
      // 06b: l2i
      // 06c: istore 20
      // 06e: dup2
      // 06f: bipush 16
      // 071: lshl
      // 072: bipush 32
      // 074: lushr
      // 075: l2i
      // 076: istore 21
      // 078: dup2
      // 079: bipush 48
      // 07b: lshl
      // 07c: bipush 48
      // 07e: lushr
      // 07f: l2i
      // 080: istore 22
      // 082: pop2
      // 083: dup2
      // 084: ldc2_w 108320109313724
      // 087: lxor
      // 088: dup2
      // 089: bipush 32
      // 08b: lushr
      // 08c: l2i
      // 08d: istore 23
      // 08f: dup2
      // 090: bipush 32
      // 092: lshl
      // 093: bipush 32
      // 095: lushr
      // 096: l2i
      // 097: istore 24
      // 099: pop2
      // 09a: dup2
      // 09b: ldc2_w 26668372724848
      // 09e: lxor
      // 09f: lstore 25
      // 0a1: dup2
      // 0a2: ldc2_w 135791364596484
      // 0a5: lxor
      // 0a6: lstore 27
      // 0a8: dup2
      // 0a9: ldc2_w 31132612078336
      // 0ac: lxor
      // 0ad: lstore 29
      // 0af: dup2
      // 0b0: ldc2_w 3964299878227
      // 0b3: lxor
      // 0b4: lstore 31
      // 0b6: dup2
      // 0b7: ldc2_w 107145721957421
      // 0ba: lxor
      // 0bb: dup2
      // 0bc: bipush 32
      // 0be: lushr
      // 0bf: l2i
      // 0c0: istore 33
      // 0c2: dup2
      // 0c3: bipush 32
      // 0c5: lshl
      // 0c6: bipush 56
      // 0c8: lushr
      // 0c9: l2i
      // 0ca: istore 34
      // 0cc: dup2
      // 0cd: bipush 40
      // 0cf: lshl
      // 0d0: bipush 40
      // 0d2: lushr
      // 0d3: l2i
      // 0d4: istore 35
      // 0d6: pop2
      // 0d7: dup2
      // 0d8: ldc2_w 135381699077282
      // 0db: lxor
      // 0dc: lstore 36
      // 0de: dup2
      // 0df: ldc2_w 64134998295573
      // 0e2: lxor
      // 0e3: lstore 38
      // 0e5: dup2
      // 0e6: ldc2_w 88239025540423
      // 0e9: lxor
      // 0ea: lstore 40
      // 0ec: dup2
      // 0ed: ldc2_w 122266661904326
      // 0f0: lxor
      // 0f1: lstore 42
      // 0f3: dup2
      // 0f4: ldc2_w 102522187348123
      // 0f7: lxor
      // 0f8: lstore 44
      // 0fa: dup2
      // 0fb: ldc2_w 33690965289861
      // 0fe: lxor
      // 0ff: lstore 46
      // 101: dup2
      // 102: ldc2_w 43520747389577
      // 105: lxor
      // 106: lstore 48
      // 108: dup2
      // 109: ldc2_w 19617554868043
      // 10c: lxor
      // 10d: lstore 50
      // 10f: dup2
      // 110: ldc2_w 13565239723159
      // 113: lxor
      // 114: lstore 52
      // 116: dup2
      // 117: ldc2_w 128006474185937
      // 11a: lxor
      // 11b: lstore 54
      // 11d: dup2
      // 11e: ldc2_w 116640550746891
      // 121: lxor
      // 122: dup2
      // 123: bipush 48
      // 125: lushr
      // 126: l2i
      // 127: istore 56
      // 129: dup2
      // 12a: bipush 16
      // 12c: lshl
      // 12d: bipush 32
      // 12f: lushr
      // 130: l2i
      // 131: istore 57
      // 133: dup2
      // 134: bipush 48
      // 136: lshl
      // 137: bipush 48
      // 139: lushr
      // 13a: l2i
      // 13b: istore 58
      // 13d: pop2
      // 13e: dup2
      // 13f: ldc2_w 90165340729030
      // 142: lxor
      // 143: lstore 59
      // 145: dup2
      // 146: ldc2_w 133417060035960
      // 149: lxor
      // 14a: lstore 61
      // 14c: dup2
      // 14d: ldc2_w 126800276059766
      // 150: lxor
      // 151: lstore 63
      // 153: dup2
      // 154: ldc2_w 72677376407479
      // 157: lxor
      // 158: lstore 65
      // 15a: dup2
      // 15b: ldc2_w 78502749423965
      // 15e: lxor
      // 15f: lstore 67
      // 161: dup2
      // 162: ldc2_w 51174171592310
      // 165: lxor
      // 166: lstore 69
      // 168: dup2
      // 169: ldc2_w 70240334604458
      // 16c: lxor
      // 16d: lstore 71
      // 16f: dup2
      // 170: ldc2_w 2020317391888
      // 173: lxor
      // 174: lstore 73
      // 176: dup2
      // 177: ldc2_w 131481768028461
      // 17a: lxor
      // 17b: lstore 75
      // 17d: dup2
      // 17e: ldc2_w 31518210222287
      // 181: lxor
      // 182: lstore 77
      // 184: dup2
      // 185: ldc2_w 35804653980218
      // 188: lxor
      // 189: dup2
      // 18a: bipush 32
      // 18c: lushr
      // 18d: l2i
      // 18e: istore 79
      // 190: dup2
      // 191: bipush 32
      // 193: lshl
      // 194: bipush 48
      // 196: lushr
      // 197: l2i
      // 198: istore 80
      // 19a: dup2
      // 19b: bipush 48
      // 19d: lshl
      // 19e: bipush 48
      // 1a0: lushr
      // 1a1: l2i
      // 1a2: istore 81
      // 1a4: pop2
      // 1a5: dup2
      // 1a6: ldc2_w 35522277508741
      // 1a9: lxor
      // 1aa: lstore 82
      // 1ac: pop2
      // 1ad: ldc2_w -1310752015550942761
      // 1b0: lload 5
      // 1b2: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: aload 2
      // 1b8: lload 46
      // 1ba: bipush 1
      // 1bb: anewarray 302
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: ldc2_w -1472248916804168418
      // 1ca: lload 5
      // 1cc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: astore 85
      // 1d3: aload 85
      // 1d5: invokeinterface java/util/List.size ()I 1
      // 1da: istore 86
      // 1dc: astore 84
      // 1de: iload 7
      // 1e0: aload 84
      // 1e2: ifnonnull 22d
      // 1e5: ifne 21f
      // 1e8: goto 1f6
      // 1eb: ldc2_w -703647642750096932
      // 1ee: lload 5
      // 1f0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: lload 50
      // 1f9: bipush 1
      // 1fa: anewarray 302
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w -1533546803055883048
      // 209: lload 5
      // 20b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: putfield com/zelix/_ye.d Ljava/util/Map;
      // 213: return
      // 214: ldc2_w -703647642750096932
      // 217: lload 5
      // 219: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: sipush 11282
      // 222: ldc2_w 3943477482276723812
      // 225: lload 5
      // 227: lxor
      // 228: invokedynamic o (IJ)I bsm=com/zelix/_ye.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: lload 48
      // 22f: bipush 2
      // 230: anewarray 302
      // 233: dup_x2
      // 234: dup_x2
      // 235: pop
      // 236: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 239: bipush 1
      // 23a: swap
      // 23b: aastore
      // 23c: dup_x1
      // 23d: swap
      // 23e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: ldc2_w -1686652388829292624
      // 247: lload 5
      // 249: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: astore 87
      // 250: new com/zelix/pg
      // 253: dup
      // 254: lload 59
      // 256: invokespecial com/zelix/pg.<init> (J)V
      // 259: astore 88
      // 25b: bipush 0
      // 25c: istore 89
      // 25e: iload 89
      // 260: iload 86
      // 262: if_icmpge 349
      // 265: aload 85
      // 267: iload 89
      // 269: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 26e: checkcast com/zelix/yn
      // 271: astore 90
      // 273: aload 90
      // 275: ldc2_w -796606030660192298
      // 278: lload 5
      // 27a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: astore 91
      // 281: aload 91
      // 283: lload 63
      // 285: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 288: astore 92
      // 28a: new java/lang/StringBuilder
      // 28d: dup
      // 28e: invokespecial java/lang/StringBuilder.<init> ()V
      // 291: sipush 27371
      // 294: ldc2_w 6384712203527809818
      // 297: lload 5
      // 299: lxor
      // 29a: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_ye.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 91
      // 2a4: lload 12
      // 2a6: ldc2_w -1144081254414716131
      // 2a9: lload 5
      // 2ab: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b3: ldc "'"
      // 2b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2bb: astore 93
      // 2bd: aload 0
      // 2be: lload 65
      // 2c0: aload 92
      // 2c2: aload 88
      // 2c4: aload 3
      // 2c5: aload 87
      // 2c7: aload 93
      // 2c9: bipush 6
      // 2cb: anewarray 302
      // 2ce: dup_x1
      // 2cf: swap
      // 2d0: bipush 5
      // 2d1: swap
      // 2d2: aastore
      // 2d3: dup_x1
      // 2d4: swap
      // 2d5: bipush 4
      // 2d6: swap
      // 2d7: aastore
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
      // 2f0: ldc2_w -738651636877344803
      // 2f3: lload 5
      // 2f5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: pop
      // 2fb: aload 90
      // 2fd: lload 27
      // 2ff: aload 0
      // 300: aload 0
      // 301: ldc2_w -1163306813484703830
      // 304: lload 5
      // 306: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ug; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: aload 88
      // 30d: aload 3
      // 30e: aload 87
      // 310: bipush 6
      // 312: anewarray 302
      // 315: dup_x1
      // 316: swap
      // 317: bipush 5
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 4
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 3
      // 322: swap
      // 323: aastore
      // 324: dup_x1
      // 325: swap
      // 326: bipush 2
      // 327: swap
      // 328: aastore
      // 329: dup_x1
      // 32a: swap
      // 32b: bipush 1
      // 32c: swap
      // 32d: aastore
      // 32e: dup_x2
      // 32f: dup_x2
      // 330: pop
      // 331: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 334: bipush 0
      // 335: swap
      // 336: aastore
      // 337: ldc2_w -714920717002351598
      // 33a: lload 5
      // 33c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: iinc 89 1
      // 344: aload 84
      // 346: ifnull 25e
      // 349: new com/zelix/ax
      // 34c: dup
      // 34d: iload 79
      // 34f: iload 80
      // 351: i2s
      // 352: iload 81
      // 354: i2c
      // 355: invokespecial com/zelix/ax.<init> (ISC)V
      // 358: lload 5
      // 35a: lconst_0
      // 35b: lcmp
      // 35c: ifle 26e
      // 35f: astore 89
      // 361: new com/zelix/_8z
      // 364: dup
      // 365: lload 18
      // 367: invokespecial com/zelix/_8z.<init> (J)V
      // 36a: astore 90
      // 36c: new com/zelix/_8z
      // 36f: dup
      // 370: lload 18
      // 372: invokespecial com/zelix/_8z.<init> (J)V
      // 375: astore 91
      // 377: bipush 0
      // 378: istore 92
      // 37a: iload 92
      // 37c: iload 86
      // 37e: if_icmpge 571
      // 381: aload 85
      // 383: iload 92
      // 385: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 38a: checkcast com/zelix/yn
      // 38d: astore 93
      // 38f: aload 93
      // 391: ldc2_w -796606030660192298
      // 394: lload 5
      // 396: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: astore 94
      // 39d: aload 84
      // 39f: ifnonnull 56c
      // 3a2: aload 94
      // 3a4: lload 67
      // 3a6: lload 5
      // 3a8: lconst_0
      // 3a9: lcmp
      // 3aa: ifle 3b7
      // 3ad: invokevirtual com/zelix/hz.d (J)Z
      // 3b0: ifeq 569
      // 3b3: aload 94
      // 3b5: lload 63
      // 3b7: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 3ba: astore 95
      // 3bc: aload 0
      // 3bd: aload 95
      // 3bf: lload 8
      // 3c1: bipush 2
      // 3c2: anewarray 302
      // 3c5: dup_x2
      // 3c6: dup_x2
      // 3c7: pop
      // 3c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3cb: bipush 1
      // 3cc: swap
      // 3cd: aastore
      // 3ce: dup_x1
      // 3cf: swap
      // 3d0: bipush 0
      // 3d1: swap
      // 3d2: aastore
      // 3d3: ldc2_w -1557925071627134577
      // 3d6: lload 5
      // 3d8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: astore 96
      // 3df: aload 96
      // 3e1: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 3e6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3eb: astore 97
      // 3ed: aload 97
      // 3ef: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f4: ifeq 4cb
      // 3f7: aload 97
      // 3f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3fe: checkcast java/util/Map$Entry
      // 401: astore 98
      // 403: aload 98
      // 405: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 40a: checkcast com/zelix/_fz
      // 40d: astore 99
      // 40f: aload 98
      // 411: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 416: checkcast com/zelix/hz
      // 419: astore 100
      // 41b: aload 100
      // 41d: lload 63
      // 41f: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 422: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 425: astore 101
      // 427: aload 101
      // 429: aload 84
      // 42b: ifnonnull 391
      // 42e: aload 84
      // 430: lload 5
      // 432: lconst_0
      // 433: lcmp
      // 434: iflt 42b
      // 437: ifnonnull 4c4
      // 43a: ifnull 4a4
      // 43d: goto 44b
      // 440: ldc2_w -703647642750096932
      // 443: lload 5
      // 445: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: athrow
      // 44b: aload 101
      // 44d: aload 84
      // 44f: ifnonnull 4c4
      // 452: goto 460
      // 455: ldc2_w -703647642750096932
      // 458: lload 5
      // 45a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: athrow
      // 460: lload 5
      // 462: lconst_0
      // 463: lcmp
      // 464: ifle 4b6
      // 467: lload 82
      // 469: invokevirtual com/zelix/yn.S (J)Z
      // 46c: ifne 4a4
      // 46f: goto 47d
      // 472: ldc2_w -703647642750096932
      // 475: lload 5
      // 477: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47c: athrow
      // 47d: aload 89
      // 47f: lload 36
      // 481: aload 99
      // 483: aload 101
      // 485: aload 93
      // 487: invokevirtual com/zelix/ax.b (JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
      // 48a: aload 84
      // 48c: lload 5
      // 48e: lconst_0
      // 48f: lcmp
      // 490: ifle 4c8
      // 493: ifnull 4c6
      // 496: goto 4a4
      // 499: ldc2_w -703647642750096932
      // 49c: lload 5
      // 49e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: athrow
      // 4a4: aload 91
      // 4a6: aload 93
      // 4a8: aload 99
      // 4aa: aload 100
      // 4ac: iload 33
      // 4ae: iload 34
      // 4b0: i2b
      // 4b1: iload 35
      // 4b3: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 4b6: goto 4c4
      // 4b9: ldc2_w -703647642750096932
      // 4bc: lload 5
      // 4be: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c3: athrow
      // 4c4: astore 102
      // 4c6: aload 84
      // 4c8: ifnull 3ed
      // 4cb: lload 71
      // 4cd: bipush 1
      // 4ce: anewarray 302
      // 4d1: dup_x2
      // 4d2: dup_x2
      // 4d3: pop
      // 4d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d7: bipush 0
      // 4d8: swap
      // 4d9: aastore
      // 4da: ldc2_w -1680156967920377502
      // 4dd: lload 5
      // 4df: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e4: astore 98
      // 4e6: aload 0
      // 4e7: ldc2_w -1119326462727912180
      // 4ea: lload 5
      // 4ec: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f1: aload 93
      // 4f3: aload 98
      // 4f5: bipush 2
      // 4f6: anewarray 302
      // 4f9: dup_x1
      // 4fa: swap
      // 4fb: bipush 1
      // 4fc: swap
      // 4fd: aastore
      // 4fe: dup_x1
      // 4ff: swap
      // 500: bipush 0
      // 501: swap
      // 502: aastore
      // 503: ldc2_w -1621024480330510914
      // 506: lload 5
      // 508: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50d: astore 99
      // 50f: aload 0
      // 510: aload 93
      // 512: aload 93
      // 514: lload 52
      // 516: bipush 1
      // 517: aload 98
      // 519: aload 90
      // 51b: bipush 6
      // 51d: anewarray 302
      // 520: dup_x1
      // 521: swap
      // 522: bipush 5
      // 523: swap
      // 524: aastore
      // 525: dup_x1
      // 526: swap
      // 527: bipush 4
      // 528: swap
      // 529: aastore
      // 52a: dup_x1
      // 52b: swap
      // 52c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 52f: bipush 3
      // 530: swap
      // 531: aastore
      // 532: dup_x2
      // 533: dup_x2
      // 534: pop
      // 535: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 538: bipush 2
      // 539: swap
      // 53a: aastore
      // 53b: dup_x1
      // 53c: swap
      // 53d: bipush 1
      // 53e: swap
      // 53f: aastore
      // 540: dup_x1
      // 541: swap
      // 542: bipush 0
      // 543: swap
      // 544: aastore
      // 545: ldc2_w -1515695089021702856
      // 548: lload 5
      // 54a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54f: aload 90
      // 551: aload 93
      // 553: aload 93
      // 555: ldc "s"
      // 557: iload 33
      // 559: iload 34
      // 55b: i2b
      // 55c: iload 35
      // 55e: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 561: lload 5
      // 563: lconst_0
      // 564: lcmp
      // 565: ifle 3fe
      // 568: pop
      // 569: iinc 92 1
      // 56c: aload 84
      // 56e: ifnull 37a
      // 571: aload 89
      // 573: lload 25
      // 575: bipush 1
      // 576: anewarray 302
      // 579: dup_x2
      // 57a: dup_x2
      // 57b: pop
      // 57c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57f: bipush 0
      // 580: swap
      // 581: aastore
      // 582: ldc2_w -656581956746518122
      // 585: lload 5
      // 587: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58c: lload 5
      // 58e: lconst_0
      // 58f: lcmp
      // 590: ifle 38a
      // 593: astore 92
      // 595: aload 92
      // 597: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 59c: ifeq bd1
      // 59f: aload 92
      // 5a1: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 5a6: checkcast com/zelix/_fz
      // 5a9: astore 93
      // 5ab: aload 89
      // 5ad: aload 93
      // 5af: bipush 1
      // 5b0: anewarray 302
      // 5b3: dup_x1
      // 5b4: swap
      // 5b5: bipush 0
      // 5b6: swap
      // 5b7: aastore
      // 5b8: ldc2_w -1050670099656737032
      // 5bb: lload 5
      // 5bd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c2: astore 94
      // 5c4: new java/util/ArrayList
      // 5c7: dup
      // 5c8: invokespecial java/util/ArrayList.<init> ()V
      // 5cb: astore 95
      // 5cd: aload 94
      // 5cf: lload 14
      // 5d1: bipush 1
      // 5d2: anewarray 302
      // 5d5: dup_x2
      // 5d6: dup_x2
      // 5d7: pop
      // 5d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5db: bipush 0
      // 5dc: swap
      // 5dd: aastore
      // 5de: ldc2_w -1209882284741834731
      // 5e1: lload 5
      // 5e3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e8: aload 84
      // 5ea: ifnonnull be8
      // 5ed: astore 96
      // 5ef: aload 96
      // 5f1: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 5f6: ifeq 66d
      // 5f9: aload 96
      // 5fb: lload 5
      // 5fd: lconst_0
      // 5fe: lcmp
      // 5ff: iflt 68c
      // 602: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 607: checkcast com/zelix/yn
      // 60a: astore 97
      // 60c: new com/zelix/_8h
      // 60f: dup
      // 610: lload 42
      // 612: invokespecial com/zelix/_8h.<init> (J)V
      // 615: astore 98
      // 617: aload 0
      // 618: aload 98
      // 61a: lload 29
      // 61c: aload 97
      // 61e: aload 94
      // 620: bipush 4
      // 621: anewarray 302
      // 624: dup_x1
      // 625: swap
      // 626: bipush 3
      // 627: swap
      // 628: aastore
      // 629: dup_x1
      // 62a: swap
      // 62b: bipush 2
      // 62c: swap
      // 62d: aastore
      // 62e: dup_x2
      // 62f: dup_x2
      // 630: pop
      // 631: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 634: bipush 1
      // 635: swap
      // 636: aastore
      // 637: dup_x1
      // 638: swap
      // 639: bipush 0
      // 63a: swap
      // 63b: aastore
      // 63c: ldc2_w -1225878036032561600
      // 63f: lload 5
      // 641: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 646: aload 95
      // 648: aload 98
      // 64a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 64d: pop
      // 64e: aload 84
      // 650: ifnonnull 68a
      // 653: aload 84
      // 655: ifnull 5ef
      // 658: lload 5
      // 65a: lconst_0
      // 65b: lcmp
      // 65c: iflt 64e
      // 65f: goto 66d
      // 662: ldc2_w -703647642750096932
      // 665: lload 5
      // 667: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66c: athrow
      // 66d: aload 94
      // 66f: lload 14
      // 671: bipush 1
      // 672: anewarray 302
      // 675: dup_x2
      // 676: dup_x2
      // 677: pop
      // 678: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67b: bipush 0
      // 67c: swap
      // 67d: aastore
      // 67e: ldc2_w -1209882284741834731
      // 681: lload 5
      // 683: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 688: astore 96
      // 68a: aload 96
      // 68c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 691: ifeq 7e1
      // 694: aload 96
      // 696: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 69b: checkcast com/zelix/yn
      // 69e: astore 97
      // 6a0: aconst_null
      // 6a1: astore 98
      // 6a3: aload 95
      // 6a5: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 6a8: aload 84
      // 6aa: ifnonnull dce
      // 6ad: astore 99
      // 6af: aload 99
      // 6b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6b6: ifeq 7d5
      // 6b9: aload 99
      // 6bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6c0: checkcast com/zelix/_8h
      // 6c3: astore 100
      // 6c5: aload 100
      // 6c7: aload 84
      // 6c9: lload 5
      // 6cb: lconst_0
      // 6cc: lcmp
      // 6cd: ifle 714
      // 6d0: ifnonnull 712
      // 6d3: lload 75
      // 6d5: aload 97
      // 6d7: bipush 2
      // 6d8: anewarray 302
      // 6db: dup_x1
      // 6dc: swap
      // 6dd: bipush 1
      // 6de: swap
      // 6df: aastore
      // 6e0: dup_x2
      // 6e1: dup_x2
      // 6e2: pop
      // 6e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e6: bipush 0
      // 6e7: swap
      // 6e8: aastore
      // 6e9: ldc2_w -1551195416146649602
      // 6ec: lload 5
      // 6ee: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f3: aload 84
      // 6f5: ifnonnull 691
      // 6f8: lload 5
      // 6fa: lconst_0
      // 6fb: lcmp
      // 6fc: iflt 6b6
      // 6ff: goto 70d
      // 702: ldc2_w -703647642750096932
      // 705: lload 5
      // 707: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70c: athrow
      // 70d: ifeq 7d0
      // 710: aload 98
      // 712: aload 84
      // 714: lload 5
      // 716: lconst_0
      // 717: lcmp
      // 718: iflt 75e
      // 71b: ifnonnull 74f
      // 71e: ifnonnull 73f
      // 721: goto 72f
      // 724: ldc2_w -703647642750096932
      // 727: lload 5
      // 729: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72e: athrow
      // 72f: aload 100
      // 731: lload 5
      // 733: lconst_0
      // 734: lcmp
      // 735: iflt 741
      // 738: astore 98
      // 73a: aload 84
      // 73c: ifnull 7d0
      // 73f: aload 100
      // 741: goto 74f
      // 744: ldc2_w -703647642750096932
      // 747: lload 5
      // 749: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74e: athrow
      // 74f: lload 40
      // 751: bipush 1
      // 752: anewarray 302
      // 755: dup_x2
      // 756: dup_x2
      // 757: pop
      // 758: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75b: bipush 0
      // 75c: swap
      // 75d: aastore
      // 75e: ldc2_w -1037661125935437986
      // 761: lload 5
      // 763: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 768: astore 101
      // 76a: aload 101
      // 76c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 771: ifeq 7c9
      // 774: aload 101
      // 776: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 77b: checkcast com/zelix/yn
      // 77e: astore 102
      // 780: aload 98
      // 782: aload 102
      // 784: lload 73
      // 786: bipush 2
      // 787: anewarray 302
      // 78a: dup_x2
      // 78b: dup_x2
      // 78c: pop
      // 78d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 790: bipush 1
      // 791: swap
      // 792: aastore
      // 793: dup_x1
      // 794: swap
      // 795: bipush 0
      // 796: swap
      // 797: aastore
      // 798: ldc2_w -1666463097689108859
      // 79b: lload 5
      // 79d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a2: pop
      // 7a3: aload 84
      // 7a5: lload 5
      // 7a7: lconst_0
      // 7a8: lcmp
      // 7a9: ifle 7d2
      // 7ac: ifnonnull 7d0
      // 7af: aload 84
      // 7b1: ifnull 76a
      // 7b4: lload 5
      // 7b6: lconst_0
      // 7b7: lcmp
      // 7b8: ifle 7a3
      // 7bb: goto 7c9
      // 7be: ldc2_w -703647642750096932
      // 7c1: lload 5
      // 7c3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c8: athrow
      // 7c9: aload 99
      // 7cb: invokeinterface java/util/Iterator.remove ()V 1
      // 7d0: aload 84
      // 7d2: ifnull 6af
      // 7d5: aload 84
      // 7d7: lload 5
      // 7d9: lconst_0
      // 7da: lcmp
      // 7db: iflt 6c0
      // 7de: ifnull 68a
      // 7e1: bipush 0
      // 7e2: lload 5
      // 7e4: lconst_0
      // 7e5: lcmp
      // 7e6: iflt 691
      // 7e9: istore 97
      // 7eb: iload 97
      // 7ed: aload 95
      // 7ef: invokevirtual java/util/ArrayList.size ()I
      // 7f2: if_icmpge bc5
      // 7f5: aload 95
      // 7f7: iload 97
      // 7f9: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 7fc: checkcast com/zelix/_8h
      // 7ff: astore 98
      // 801: new java/util/Vector
      // 804: dup
      // 805: aload 98
      // 807: lload 10
      // 809: bipush 1
      // 80a: anewarray 302
      // 80d: dup_x2
      // 80e: dup_x2
      // 80f: pop
      // 810: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 813: bipush 0
      // 814: swap
      // 815: aastore
      // 816: ldc2_w -590639195539568093
      // 819: lload 5
      // 81b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 820: invokespecial java/util/Vector.<init> (I)V
      // 823: astore 99
      // 825: new com/zelix/pg
      // 828: dup
      // 829: lload 38
      // 82b: aload 99
      // 82d: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 830: astore 100
      // 832: aload 0
      // 833: ldc2_w -1042541990512642746
      // 836: lload 5
      // 838: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83d: aload 100
      // 83f: new com/zelix/pg
      // 842: dup
      // 843: lload 59
      // 845: invokespecial com/zelix/pg.<init> (J)V
      // 848: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 84d: pop
      // 84e: aload 98
      // 850: lload 54
      // 852: bipush 1
      // 853: anewarray 302
      // 856: dup_x2
      // 857: dup_x2
      // 858: pop
      // 859: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 85c: bipush 0
      // 85d: swap
      // 85e: aastore
      // 85f: ldc2_w -754064463597498766
      // 862: lload 5
      // 864: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 869: aload 84
      // 86b: ifnonnull dce
      // 86e: astore 101
      // 870: aload 101
      // 872: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 877: ifeq 8ba
      // 87a: aload 101
      // 87c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 881: checkcast com/zelix/yn
      // 884: astore 102
      // 886: aload 99
      // 888: aload 102
      // 88a: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 88d: aload 0
      // 88e: ldc2_w -1446401736826149328
      // 891: lload 5
      // 893: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 898: aload 102
      // 89a: aload 93
      // 89c: aload 100
      // 89e: iload 33
      // 8a0: iload 34
      // 8a2: i2b
      // 8a3: iload 35
      // 8a5: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 8a8: pop
      // 8a9: aload 84
      // 8ab: ifnonnull 7eb
      // 8ae: aload 84
      // 8b0: lload 5
      // 8b2: lconst_0
      // 8b3: lcmp
      // 8b4: iflt bce
      // 8b7: ifnull 870
      // 8ba: aconst_null
      // 8bb: astore 101
      // 8bd: bipush 0
      // 8be: lload 5
      // 8c0: lconst_0
      // 8c1: lcmp
      // 8c2: iflt 7ed
      // 8c5: istore 102
      // 8c7: iload 102
      // 8c9: aload 99
      // 8cb: invokevirtual java/util/Vector.size ()I
      // 8ce: if_icmpge 931
      // 8d1: aload 99
      // 8d3: iload 102
      // 8d5: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 8d8: checkcast com/zelix/yn
      // 8db: astore 103
      // 8dd: aload 91
      // 8df: aload 103
      // 8e1: iload 56
      // 8e3: i2c
      // 8e4: iload 57
      // 8e6: aload 93
      // 8e8: iload 58
      // 8ea: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 8ed: checkcast com/zelix/hz
      // 8f0: astore 104
      // 8f2: aload 84
      // 8f4: lload 5
      // 8f6: lconst_0
      // 8f7: lcmp
      // 8f8: ifle bce
      // 8fb: ifnonnull 92e
      // 8fe: aload 104
      // 900: aload 84
      // 902: ifnonnull bfb
      // 905: goto 913
      // 908: ldc2_w -703647642750096932
      // 90b: lload 5
      // 90d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 912: athrow
      // 913: ifnull 92b
      // 916: goto 924
      // 919: ldc2_w -703647642750096932
      // 91c: lload 5
      // 91e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 923: athrow
      // 924: aload 104
      // 926: astore 101
      // 928: goto 931
      // 92b: iinc 102 1
      // 92e: goto 8c7
      // 931: aload 101
      // 933: aload 84
      // 935: ifnonnull ae2
      // 938: ifnonnull ae0
      // 93b: goto 949
      // 93e: ldc2_w -703647642750096932
      // 941: lload 5
      // 943: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 948: athrow
      // 949: aconst_null
      // 94a: astore 102
      // 94c: aconst_null
      // 94d: astore 103
      // 94f: bipush 0
      // 950: istore 104
      // 952: iload 104
      // 954: aload 99
      // 956: invokevirtual java/util/Vector.size ()I
      // 959: if_icmpge abd
      // 95c: aload 99
      // 95e: iload 104
      // 960: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 963: checkcast com/zelix/yn
      // 966: astore 105
      // 968: aload 105
      // 96a: ldc2_w -796606030660192298
      // 96d: lload 5
      // 96f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 974: astore 106
      // 976: aload 0
      // 977: aload 106
      // 979: lload 44
      // 97b: aload 93
      // 97d: bipush 3
      // 97e: anewarray 302
      // 981: dup_x1
      // 982: swap
      // 983: bipush 2
      // 984: swap
      // 985: aastore
      // 986: dup_x2
      // 987: dup_x2
      // 988: pop
      // 989: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98c: bipush 1
      // 98d: swap
      // 98e: aastore
      // 98f: dup_x1
      // 990: swap
      // 991: bipush 0
      // 992: swap
      // 993: aastore
      // 994: ldc2_w -1346115248441625990
      // 997: lload 5
      // 999: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99e: astore 102
      // 9a0: aload 106
      // 9a2: invokevirtual com/zelix/hz.b ()Z
      // 9a5: aload 84
      // 9a7: ifnonnull 7ed
      // 9aa: aload 84
      // 9ac: lload 5
      // 9ae: lconst_0
      // 9af: lcmp
      // 9b0: iflt d38
      // 9b3: ifnonnull a44
      // 9b6: ifeq a17
      // 9b9: goto 9c7
      // 9bc: ldc2_w -703647642750096932
      // 9bf: lload 5
      // 9c1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c6: athrow
      // 9c7: aload 4
      // 9c9: aload 93
      // 9cb: lload 61
      // 9cd: aload 106
      // 9cf: checkcast com/zelix/hy
      // 9d2: bipush 3
      // 9d3: anewarray 302
      // 9d6: dup_x1
      // 9d7: swap
      // 9d8: bipush 2
      // 9d9: swap
      // 9da: aastore
      // 9db: dup_x2
      // 9dc: dup_x2
      // 9dd: pop
      // 9de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9e1: bipush 1
      // 9e2: swap
      // 9e3: aastore
      // 9e4: dup_x1
      // 9e5: swap
      // 9e6: bipush 0
      // 9e7: swap
      // 9e8: aastore
      // 9e9: ldc2_w -1196084960173638665
      // 9ec: lload 5
      // 9ee: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f3: aload 84
      // 9f5: ifnonnull a44
      // 9f8: goto a06
      // 9fb: ldc2_w -703647642750096932
      // 9fe: lload 5
      // a00: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a05: athrow
      // a06: ifne a6d
      // a09: goto a17
      // a0c: ldc2_w -703647642750096932
      // a0f: lload 5
      // a11: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a16: athrow
      // a17: aload 106
      // a19: aload 84
      // a1b: lload 5
      // a1d: lconst_0
      // a1e: lcmp
      // a1f: iflt a4b
      // a22: ifnonnull a49
      // a25: goto a33
      // a28: ldc2_w -703647642750096932
      // a2b: lload 5
      // a2d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a32: athrow
      // a33: invokevirtual com/zelix/hz.b ()Z
      // a36: goto a44
      // a39: ldc2_w -703647642750096932
      // a3c: lload 5
      // a3e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a43: athrow
      // a44: ifne ab5
      // a47: aload 106
      // a49: aload 84
      // a4b: lload 5
      // a4d: lconst_0
      // a4e: lcmp
      // a4f: ifle a7f
      // a52: ifnonnull a7d
      // a55: lload 77
      // a57: aload 93
      // a59: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // a5c: ifnull ab5
      // a5f: goto a6d
      // a62: ldc2_w -703647642750096932
      // a65: lload 5
      // a67: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6c: athrow
      // a6d: aload 102
      // a6f: goto a7d
      // a72: ldc2_w -703647642750096932
      // a75: lload 5
      // a77: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7c: athrow
      // a7d: aload 84
      // a7f: ifnonnull ab3
      // a82: ifnonnull aa3
      // a85: goto a93
      // a88: ldc2_w -703647642750096932
      // a8b: lload 5
      // a8d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a92: athrow
      // a93: aload 106
      // a95: astore 101
      // a97: lload 5
      // a99: lconst_0
      // a9a: lcmp
      // a9b: ifle abd
      // a9e: aload 84
      // aa0: ifnull abd
      // aa3: aload 102
      // aa5: goto ab3
      // aa8: ldc2_w -703647642750096932
      // aab: lload 5
      // aad: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab2: athrow
      // ab3: astore 103
      // ab5: iinc 104 1
      // ab8: aload 84
      // aba: ifnull 952
      // abd: aload 101
      // abf: lload 5
      // ac1: lconst_0
      // ac2: lcmp
      // ac3: iflt 963
      // ac6: aload 84
      // ac8: ifnonnull ae2
      // acb: ifnonnull ae0
      // ace: goto adc
      // ad1: ldc2_w -703647642750096932
      // ad4: lload 5
      // ad6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // adb: athrow
      // adc: aload 103
      // ade: astore 101
      // ae0: aload 101
      // ae2: lload 77
      // ae4: aload 93
      // ae6: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // ae9: astore 102
      // aeb: iload 23
      // aed: aload 101
      // aef: new java/lang/StringBuilder
      // af2: dup
      // af3: invokespecial java/lang/StringBuilder.<init> ()V
      // af6: sipush 461
      // af9: ldc2_w 5289678205611376698
      // afc: lload 5
      // afe: lxor
      // aff: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_ye.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b04: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b07: aload 93
      // b09: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b0c: ldc " "
      // b0e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b11: aload 99
      // b13: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b16: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b19: iload 24
      // b1b: swap
      // b1c: bipush 4
      // b1d: anewarray 302
      // b20: dup_x1
      // b21: swap
      // b22: bipush 3
      // b23: swap
      // b24: aastore
      // b25: dup_x1
      // b26: swap
      // b27: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b2a: bipush 2
      // b2b: swap
      // b2c: aastore
      // b2d: dup_x1
      // b2e: swap
      // b2f: bipush 1
      // b30: swap
      // b31: aastore
      // b32: dup_x1
      // b33: swap
      // b34: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b37: bipush 0
      // b38: swap
      // b39: aastore
      // b3a: ldc2_w -667382592640197009
      // b3d: lload 5
      // b3f: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b44: bipush 0
      // b45: istore 103
      // b47: iload 103
      // b49: aload 99
      // b4b: invokevirtual java/util/Vector.size ()I
      // b4e: if_icmpge bbd
      // b51: aload 99
      // b53: iload 103
      // b55: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // b58: checkcast com/zelix/yn
      // b5b: astore 104
      // b5d: aload 0
      // b5e: ldc2_w -710958229629848306
      // b61: lload 5
      // b63: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b68: aload 104
      // b6a: ldc2_w -1092466845848516797
      // b6d: lload 5
      // b6f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b74: aload 93
      // b76: new com/zelix/wo
      // b79: dup
      // b7a: iload 20
      // b7c: i2s
      // b7d: aload 101
      // b7f: iload 21
      // b81: iload 22
      // b83: i2s
      // b84: aload 102
      // b86: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // b89: iload 33
      // b8b: iload 34
      // b8d: i2b
      // b8e: iload 35
      // b90: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // b93: pop
      // b94: iinc 103 1
      // b97: aload 84
      // b99: lload 5
      // b9b: lconst_0
      // b9c: lcmp
      // b9d: ifle bc2
      // ba0: ifnonnull bc0
      // ba3: aload 84
      // ba5: ifnull b47
      // ba8: lload 5
      // baa: lconst_0
      // bab: lcmp
      // bac: iflt b97
      // baf: goto bbd
      // bb2: ldc2_w -703647642750096932
      // bb5: lload 5
      // bb7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bbc: athrow
      // bbd: iinc 97 1
      // bc0: aload 84
      // bc2: ifnull 7eb
      // bc5: aload 84
      // bc7: lload 5
      // bc9: lconst_0
      // bca: lcmp
      // bcb: ifle 7fc
      // bce: ifnull 595
      // bd1: aload 90
      // bd3: bipush 0
      // bd4: anewarray 302
      // bd7: ldc2_w -657449816382117568
      // bda: lload 5
      // bdc: lload 5
      // bde: lconst_0
      // bdf: lcmp
      // be0: iflt db6
      // be3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be8: astore 92
      // bea: aload 92
      // bec: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // bf1: ifeq cdf
      // bf4: aload 92
      // bf6: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // bfb: checkcast java/util/Map
      // bfe: astore 93
      // c00: aload 93
      // c02: aload 84
      // c04: ifnonnull c2c
      // c07: invokeinterface java/util/Map.size ()I 1
      // c0c: bipush 1
      // c0d: lload 5
      // c0f: lconst_0
      // c10: lcmp
      // c11: iflt d57
      // c14: aload 84
      // c16: ifnonnull d57
      // c19: if_icmple cd3
      // c1c: goto c2a
      // c1f: ldc2_w -703647642750096932
      // c22: lload 5
      // c24: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c29: athrow
      // c2a: aload 93
      // c2c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // c31: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // c36: astore 94
      // c38: aload 94
      // c3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // c3f: ifeq cd3
      // c42: aload 94
      // c44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c49: checkcast com/zelix/yn
      // c4c: astore 95
      // c4e: aload 93
      // c50: aload 95
      // c52: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c57: checkcast java/lang/String
      // c5a: astore 96
      // c5c: aload 96
      // c5e: aload 84
      // c60: ifnonnull bfb
      // c63: ldc "d"
      // c65: if_acmpeq cc7
      // c68: aload 93
      // c6a: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // c6f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // c74: astore 97
      // c76: aload 97
      // c78: invokeinterface java/util/Iterator.hasNext ()Z 1
      // c7d: ifeq cc7
      // c80: aload 97
      // c82: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c87: checkcast com/zelix/yn
      // c8a: astore 98
      // c8c: aload 95
      // c8e: aload 84
      // c90: ifnonnull bfb
      // c93: lload 5
      // c95: lconst_0
      // c96: lcmp
      // c97: iflt bfb
      // c9a: aload 98
      // c9c: if_acmpeq cc2
      // c9f: aload 0
      // ca0: ldc2_w -584087109209431657
      // ca3: lload 5
      // ca5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // caa: lload 16
      // cac: aload 95
      // cae: aload 98
      // cb0: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // cb3: pop
      // cb4: goto cc2
      // cb7: ldc2_w -703647642750096932
      // cba: lload 5
      // cbc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc1: athrow
      // cc2: aload 84
      // cc4: ifnull c76
      // cc7: aload 84
      // cc9: lload 5
      // ccb: lconst_0
      // ccc: lcmp
      // ccd: ifle bfb
      // cd0: ifnull c38
      // cd3: aload 84
      // cd5: lload 5
      // cd7: lconst_0
      // cd8: lcmp
      // cd9: iflt bfb
      // cdc: ifnull bea
      // cdf: aload 0
      // ce0: ldc2_w -773250264867758117
      // ce3: lload 5
      // ce5: lconst_0
      // ce6: lcmp
      // ce7: ifle d12
      // cea: lload 5
      // cec: lload 5
      // cee: lconst_0
      // cef: lcmp
      // cf0: iflt da8
      // cf3: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf8: ifeq d10
      // cfb: new java/util/concurrent/ConcurrentHashMap
      // cfe: dup
      // cff: invokespecial java/util/concurrent/ConcurrentHashMap.<init> ()V
      // d02: goto d29
      // d05: ldc2_w -703647642750096932
      // d08: lload 5
      // d0a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0f: athrow
      // d10: lload 50
      // d12: bipush 1
      // d13: anewarray 302
      // d16: dup_x2
      // d17: dup_x2
      // d18: pop
      // d19: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d1c: bipush 0
      // d1d: swap
      // d1e: aastore
      // d1f: ldc2_w -1533546803055883048
      // d22: lload 5
      // d24: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d29: putfield com/zelix/_ye.d Ljava/util/Map;
      // d2c: ldc2_w -773250264867758117
      // d2f: lload 5
      // d31: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d36: aload 84
      // d38: ifnonnull d56
      // d3b: ifeq da2
      // d3e: goto d4c
      // d41: ldc2_w -703647642750096932
      // d44: lload 5
      // d46: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4b: athrow
      // d4c: ldc2_w -1651905982532274933
      // d4f: lload 5
      // d51: invokedynamic j (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d56: bipush 2
      // d57: if_icmplt da2
      // d5a: aload 0
      // d5b: ldc2_w -610200814924220020
      // d5e: lload 5
      // d60: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d65: bipush 0
      // d66: anewarray 302
      // d69: ldc2_w -997299294192419694
      // d6c: lload 5
      // d6e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d73: ldc2_w -1482038552786442191
      // d76: lload 5
      // d78: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/stream/Stream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7d: aload 0
      // d7e: lload 69
      // d80: invokedynamic accept (Lcom/zelix/_ye;J)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, com/zelix/_ye.z (JLjava/util/Map$Entry;)V, (Ljava/util/Map$Entry;)V ]
      // d85: ldc2_w -823447372878647074
      // d88: lload 5
      // d8a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8f: aload 84
      // d91: ifnull e0c
      // d94: goto da2
      // d97: ldc2_w -703647642750096932
      // d9a: lload 5
      // d9c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da1: athrow
      // da2: aload 0
      // da3: ldc2_w -610200814924220020
      // da6: lload 5
      // da8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dad: bipush 0
      // dae: anewarray 302
      // db1: ldc2_w -997299294192419694
      // db4: lload 5
      // db6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dbb: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // dc0: goto dce
      // dc3: ldc2_w -703647642750096932
      // dc6: lload 5
      // dc8: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dcd: athrow
      // dce: astore 93
      // dd0: aload 93
      // dd2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // dd7: ifeq e0c
      // dda: aload 93
      // ddc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // de1: checkcast java/util/Map$Entry
      // de4: astore 94
      // de6: aload 0
      // de7: aload 94
      // de9: lload 31
      // deb: bipush 2
      // dec: anewarray 302
      // def: dup_x2
      // df0: dup_x2
      // df1: pop
      // df2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // df5: bipush 1
      // df6: swap
      // df7: aastore
      // df8: dup_x1
      // df9: swap
      // dfa: bipush 0
      // dfb: swap
      // dfc: aastore
      // dfd: ldc2_w -1457038139823889406
      // e00: lload 5
      // e02: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e07: aload 84
      // e09: ifnull dd0
      // e0c: return
   }

   public boolean M(Object[] param1) {
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
      // 0e: checkcast com/zelix/iu
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_ye.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 62187094803036
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 88284670961692
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: ldc2_w 1469661188414867581
      // 2d: lload 2
      // 2e: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: astore 9
      // 35: aload 0
      // 36: ldc2_w 1301056725351834630
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_rh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 9
      // 41: ifnonnull 84
      // 44: ifnonnull 7a
      // 47: goto 54
      // 4a: ldc2_w 1123130093456461942
      // 4d: lload 2
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: lload 5
      // 57: bipush 1
      // 58: anewarray 302
      // 5b: dup_x2
      // 5c: dup_x2
      // 5d: pop
      // 5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61: bipush 0
      // 62: swap
      // 63: aastore
      // 64: ldc2_w 1123393740755906072
      // 67: lload 2
      // 68: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: goto 7a
      // 70: ldc2_w 1123130093456461942
      // 73: lload 2
      // 74: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: ldc2_w 1301056725351834630
      // 7e: lload 2
      // 7f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_rh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: lload 7
      // 86: aload 4
      // 88: ldc2_w 1050923331807479190
      // 8b: lload 2
      // 8c: invokedynamic i (Ljava/lang/Object;JLjava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: ireturn
   }

   private void r(Object[] param1) {
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
      // 004: checkcast java/util/Map$Entry
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_ye.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 38403844997616
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 25128555331291
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 33506606959332
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 84752813662025
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 125283228774659
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 67663494523643
      // 041: lxor
      // 042: lstore 15
      // 044: dup2
      // 045: ldc2_w 65601673661581
      // 048: lxor
      // 049: dup2
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 17
      // 050: dup2
      // 051: bipush 16
      // 053: lshl
      // 054: bipush 32
      // 056: lushr
      // 057: l2i
      // 058: istore 18
      // 05a: dup2
      // 05b: bipush 48
      // 05d: lshl
      // 05e: bipush 48
      // 060: lushr
      // 061: l2i
      // 062: istore 19
      // 064: pop2
      // 065: pop2
      // 066: ldc2_w -7329304636704815535
      // 069: lload 3
      // 06a: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 2
      // 070: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 075: checkcast java/lang/String
      // 078: astore 21
      // 07a: aload 21
      // 07c: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 07f: astore 22
      // 081: astore 20
      // 083: aload 22
      // 085: aload 20
      // 087: ifnonnull 09c
      // 08a: ifnull 28a
      // 08d: goto 09a
      // 090: ldc2_w -9098830848627204518
      // 093: lload 3
      // 094: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 22
      // 09c: aload 20
      // 09e: ifnonnull 0c5
      // 0a1: lload 13
      // 0a3: invokevirtual com/zelix/yn.S (J)Z
      // 0a6: ifne 28a
      // 0a9: goto 0b6
      // 0ac: ldc2_w -9098830848627204518
      // 0af: lload 3
      // 0b0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: aload 22
      // 0b8: goto 0c5
      // 0bb: ldc2_w -9098830848627204518
      // 0be: lload 3
      // 0bf: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: ldc2_w -8973507236442423216
      // 0c8: lload 3
      // 0c9: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: astore 23
      // 0d0: aload 2
      // 0d1: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0d6: checkcast java/util/Map
      // 0d9: astore 24
      // 0db: aload 24
      // 0dd: aload 20
      // 0df: ifnonnull 0f4
      // 0e2: ifnull 28a
      // 0e5: goto 0f2
      // 0e8: ldc2_w -9098830848627204518
      // 0eb: lload 3
      // 0ec: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 24
      // 0f4: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0f9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0fe: astore 25
      // 100: aload 25
      // 102: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 107: ifeq 28a
      // 10a: aload 25
      // 10c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 111: checkcast com/zelix/_fz
      // 114: astore 26
      // 116: aload 24
      // 118: aload 26
      // 11a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 11f: checkcast com/zelix/hz
      // 122: astore 27
      // 124: aload 23
      // 126: lload 11
      // 128: aload 26
      // 12a: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 12d: astore 28
      // 12f: aload 28
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 14e
      // 137: aload 20
      // 139: ifnonnull 14e
      // 13c: ifnull 285
      // 13f: goto 14c
      // 142: ldc2_w -9098830848627204518
      // 145: lload 3
      // 146: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 28
      // 14e: lload 9
      // 150: invokevirtual com/zelix/iu.n (J)Z
      // 153: lload 3
      // 154: lconst_0
      // 155: lcmp
      // 156: ifle 194
      // 159: aload 20
      // 15b: ifnonnull 194
      // 15e: ifne 285
      // 161: goto 16e
      // 164: ldc2_w -9098830848627204518
      // 167: lload 3
      // 168: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 28
      // 170: aload 20
      // 172: ifnonnull 1ad
      // 175: goto 182
      // 178: ldc2_w -9098830848627204518
      // 17b: lload 3
      // 17c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: lload 15
      // 184: invokevirtual com/zelix/iu.C (J)Z
      // 187: goto 194
      // 18a: ldc2_w -9098830848627204518
      // 18d: lload 3
      // 18e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: ifne 285
      // 197: aload 27
      // 199: lload 11
      // 19b: aload 26
      // 19d: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 1a0: goto 1ad
      // 1a3: ldc2_w -9098830848627204518
      // 1a6: lload 3
      // 1a7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: astore 29
      // 1af: aload 27
      // 1b1: lload 7
      // 1b3: invokevirtual com/zelix/hz.d (J)Z
      // 1b6: aload 20
      // 1b8: ifnonnull 230
      // 1bb: ifeq 222
      // 1be: goto 1cb
      // 1c1: ldc2_w -9098830848627204518
      // 1c4: lload 3
      // 1c5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: ldc2_w -9105017312575569272
      // 1cf: lload 3
      // 1d0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: aload 27
      // 1d7: lload 5
      // 1d9: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 1dc: iload 17
      // 1de: i2c
      // 1df: iload 18
      // 1e1: aload 26
      // 1e3: iload 19
      // 1e5: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 1e8: checkcast com/zelix/wo
      // 1eb: dup
      // 1ec: astore 31
      // 1ee: aload 20
      // 1f0: ifnonnull 212
      // 1f3: ifnull 222
      // 1f6: goto 203
      // 1f9: ldc2_w -9098830848627204518
      // 1fc: lload 3
      // 1fd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: aload 31
      // 205: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 208: checkcast com/zelix/hz
      // 20b: astore 27
      // 20d: aload 31
      // 20f: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 212: checkcast com/zelix/iu
      // 215: astore 29
      // 217: aload 20
      // 219: lload 3
      // 21a: lconst_0
      // 21b: lcmp
      // 21c: ifle 283
      // 21f: ifnull 276
      // 222: bipush 0
      // 223: goto 230
      // 226: ldc2_w -9098830848627204518
      // 229: lload 3
      // 22a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: istore 30
      // 232: aload 0
      // 233: ldc2_w -9219308066151150070
      // 236: lload 3
      // 237: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: aload 27
      // 23e: lload 5
      // 240: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 243: iload 17
      // 245: i2c
      // 246: iload 18
      // 248: aload 26
      // 24a: iload 19
      // 24c: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 24f: checkcast com/zelix/hz
      // 252: astore 32
      // 254: aload 32
      // 256: lload 3
      // 257: lconst_0
      // 258: lcmp
      // 259: iflt 265
      // 25c: ifnull 271
      // 25f: aload 32
      // 261: astore 27
      // 263: aload 27
      // 265: lload 11
      // 267: aload 26
      // 269: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 26c: astore 29
      // 26e: bipush 1
      // 26f: istore 30
      // 271: iload 30
      // 273: ifne 222
      // 276: aload 0
      // 277: getfield com/zelix/_ye.d Ljava/util/Map;
      // 27a: aload 28
      // 27c: aload 29
      // 27e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 283: astore 32
      // 285: aload 20
      // 287: ifnull 100
      // 28a: return
   }

   public final void H(Object[] var1) {
      long var4 = (Long)var1[0];
      pg var2 = (pg)var1[1];
      _3 var3 = (_3)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 111361531198726L;
      pg var8 = (pg)x44.a<"j">(this, 5176070144289342235L, var4).get(var2);
      var8.G(var6, var3);
   }

   private int b(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_f8
      // 00e: astore 8
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_f8
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/pg
      // 031: astore 3
      // 032: pop
      // 033: getstatic com/zelix/_ye.a J
      // 036: lload 5
      // 038: lxor
      // 039: lstore 5
      // 03b: lload 5
      // 03d: dup2
      // 03e: ldc2_w 33047465411258
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 43975139395020
      // 048: lxor
      // 049: dup2
      // 04a: bipush 32
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 11
      // 050: dup2
      // 051: bipush 32
      // 053: lshl
      // 054: bipush 56
      // 056: lushr
      // 057: l2i
      // 058: istore 12
      // 05a: dup2
      // 05b: bipush 40
      // 05d: lshl
      // 05e: bipush 40
      // 060: lushr
      // 061: l2i
      // 062: istore 13
      // 064: pop2
      // 065: dup2
      // 066: ldc2_w 112986104123236
      // 069: lxor
      // 06a: lstore 14
      // 06c: pop2
      // 06d: ldc2_w -6616347020836259786
      // 070: lload 5
      // 072: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: astore 16
      // 079: aload 2
      // 07a: aload 16
      // 07c: ifnonnull 0c4
      // 07f: lload 14
      // 081: invokevirtual com/zelix/yn.S (J)Z
      // 084: ifeq 0a2
      // 087: goto 095
      // 08a: ldc2_w -4621429072768753603
      // 08d: lload 5
      // 08f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: bipush 2
      // 096: ireturn
      // 097: ldc2_w -4621429072768753603
      // 09a: lload 5
      // 09c: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: ldc2_w -6451850390617639346
      // 0a6: lload 5
      // 0a8: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: aload 2
      // 0ae: aload 8
      // 0b0: ldc2_w -4864443784181955873
      // 0b3: lload 5
      // 0b5: invokedynamic k (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: iload 11
      // 0bc: iload 12
      // 0be: i2b
      // 0bf: iload 13
      // 0c1: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 0c4: checkcast com/zelix/rx
      // 0c7: astore 17
      // 0c9: aload 17
      // 0cb: aload 16
      // 0cd: lload 5
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: ifle 0f9
      // 0d4: ifnonnull 0f7
      // 0d7: ifnonnull 0f5
      // 0da: goto 0e8
      // 0dd: ldc2_w -4621429072768753603
      // 0e0: lload 5
      // 0e2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: bipush 0
      // 0e9: ireturn
      // 0ea: ldc2_w -4621429072768753603
      // 0ed: lload 5
      // 0ef: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 17
      // 0f7: aload 16
      // 0f9: ifnonnull 176
      // 0fc: ldc2_w -4741356341864514254
      // 0ff: lload 5
      // 101: invokedynamic k (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: if_acmpeq 14e
      // 109: goto 117
      // 10c: ldc2_w -4621429072768753603
      // 10f: lload 5
      // 111: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 17
      // 119: ldc2_w -4710884861597732705
      // 11c: lload 5
      // 11e: invokedynamic k (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: lload 5
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 1b3
      // 12a: aload 16
      // 12c: ifnonnull 1b3
      // 12f: goto 13d
      // 132: ldc2_w -4621429072768753603
      // 135: lload 5
      // 137: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: if_acmpne 18d
      // 140: goto 14e
      // 143: ldc2_w -4621429072768753603
      // 146: lload 5
      // 148: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: ldc2_w -6451850390617639346
      // 152: lload 5
      // 154: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 2
      // 15a: aload 8
      // 15c: aload 17
      // 15e: iload 11
      // 160: iload 12
      // 162: i2b
      // 163: iload 13
      // 165: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 168: goto 176
      // 16b: ldc2_w -4621429072768753603
      // 16e: lload 5
      // 170: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: pop
      // 177: aload 3
      // 178: aload 17
      // 17a: ldc2_w -6678411699196445508
      // 17d: lload 5
      // 17f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: lload 9
      // 186: dup2_x1
      // 187: pop2
      // 188: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 18b: bipush -1
      // 18c: ireturn
      // 18d: aload 17
      // 18f: lload 5
      // 191: lconst_0
      // 192: lcmp
      // 193: iflt 1f4
      // 196: aload 16
      // 198: ifnonnull 1f4
      // 19b: ldc2_w -4864443784181955873
      // 19e: lload 5
      // 1a0: invokedynamic k (JJ)Lcom/zelix/rx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: goto 1b3
      // 1a8: ldc2_w -4621429072768753603
      // 1ab: lload 5
      // 1ad: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: if_acmpne 1f2
      // 1b6: aload 0
      // 1b7: ldc2_w -6451850390617639346
      // 1ba: lload 5
      // 1bc: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: aload 2
      // 1c2: aload 8
      // 1c4: aload 17
      // 1c6: iload 11
      // 1c8: iload 12
      // 1ca: i2b
      // 1cb: iload 13
      // 1cd: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1d0: pop
      // 1d1: aload 3
      // 1d2: aload 17
      // 1d4: ldc2_w -6678411699196445508
      // 1d7: lload 5
      // 1d9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: lload 9
      // 1e0: dup2_x1
      // 1e1: pop2
      // 1e2: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 1e5: bipush -1
      // 1e6: ireturn
      // 1e7: ldc2_w -4621429072768753603
      // 1ea: lload 5
      // 1ec: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: aload 17
      // 1f4: ldc2_w -6678411699196445508
      // 1f7: lload 5
      // 1f9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: aload 16
      // 200: ifnonnull 28b
      // 203: ifnull 271
      // 206: goto 214
      // 209: ldc2_w -4621429072768753603
      // 20c: lload 5
      // 20e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: aload 17
      // 216: ldc2_w -6678411699196445508
      // 219: lload 5
      // 21b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: aload 7
      // 222: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 225: aload 16
      // 227: ifnonnull 2a1
      // 22a: goto 238
      // 22d: ldc2_w -4621429072768753603
      // 230: lload 5
      // 232: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: ifeq 271
      // 23b: goto 249
      // 23e: ldc2_w -4621429072768753603
      // 241: lload 5
      // 243: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: aload 0
      // 24a: ldc2_w -6451850390617639346
      // 24d: lload 5
      // 24f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: aload 2
      // 255: aload 8
      // 257: aload 17
      // 259: iload 11
      // 25b: iload 12
      // 25d: i2b
      // 25e: iload 13
      // 260: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 263: pop
      // 264: bipush 1
      // 265: ireturn
      // 266: ldc2_w -4621429072768753603
      // 269: lload 5
      // 26b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: athrow
      // 271: aload 0
      // 272: ldc2_w -6451850390617639346
      // 275: lload 5
      // 277: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: aload 2
      // 27d: aload 8
      // 27f: aload 17
      // 281: iload 11
      // 283: iload 12
      // 285: i2b
      // 286: iload 13
      // 288: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 28b: pop
      // 28c: aload 3
      // 28d: aload 17
      // 28f: ldc2_w -6678411699196445508
      // 292: lload 5
      // 294: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_f8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: lload 9
      // 29b: dup2_x1
      // 29c: pop2
      // 29d: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 2a0: bipush -1
      // 2a1: ireturn
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25931;
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
            throw new RuntimeException("com/zelix/_ye", var10);
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
         throw new RuntimeException("com/zelix/_ye" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21704;
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
            throw new RuntimeException("com/zelix/_ye", var14);
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
         throw new RuntimeException("com/zelix/_ye" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
