package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class es {
   private Long X;
   private es m;
   private final ig L;
   private mr b;
   private long A;
   private int u;
   private final boolean S;
   private final List j = new ArrayList();
   private sm o;
   private final boolean J;
   private long f;
   private sm h;
   private long F;
   private long P;
   private final List l = new ArrayList();
   private long I;
   private es z;
   private List D;
   private static final long a = ess.a(-5337429581183453059L, -8319520099344187588L, MethodHandles.lookup().lookupClass()).a(51208392698005L);
   private static final long c;

   public void j(Object[] param1) {
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
      // 004: checkcast com/zelix/hy
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_yv
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_ug
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 6
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_xi
      // 031: astore 8
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_yy
      // 03a: astore 9
      // 03c: pop
      // 03d: getstatic com/zelix/es.a J
      // 040: lload 2
      // 041: lxor
      // 042: lstore 2
      // 043: lload 2
      // 044: dup2
      // 045: ldc2_w 29634557694047
      // 048: lxor
      // 049: lstore 10
      // 04b: dup2
      // 04c: ldc2_w 76314123029302
      // 04f: lxor
      // 050: lstore 12
      // 052: dup2
      // 053: ldc2_w 116596614476314
      // 056: lxor
      // 057: lstore 14
      // 059: dup2
      // 05a: ldc2_w 103613516909873
      // 05d: lxor
      // 05e: lstore 16
      // 060: dup2
      // 061: ldc2_w 121170208293172
      // 064: lxor
      // 065: lstore 18
      // 067: dup2
      // 068: ldc2_w 94592777804215
      // 06b: lxor
      // 06c: lstore 20
      // 06e: dup2
      // 06f: ldc2_w 25902492250726
      // 072: lxor
      // 073: lstore 22
      // 075: pop2
      // 076: ldc2_w 3817542594410082231
      // 079: lload 2
      // 07a: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: aload 0
      // 080: aload 0
      // 081: ldc2_w 3105967224245457149
      // 084: lload 2
      // 085: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: ldc2_w 3805913489095134112
      // 08d: lload 2
      // 08e: invokedynamic t (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aconst_null
      // 094: astore 25
      // 096: istore 24
      // 098: aload 0
      // 099: iload 24
      // 09b: ifne 0d3
      // 09e: ldc2_w 3425793778779045670
      // 0a1: lload 2
      // 0a2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: lload 22
      // 0a9: invokevirtual com/zelix/ig.V (J)Z
      // 0ac: ifne 164
      // 0af: goto 0bc
      // 0b2: ldc2_w 3442137188707966364
      // 0b5: lload 2
      // 0b6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: ldc2_w 3226933608377910878
      // 0c0: lload 2
      // 0c1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/es; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: goto 0d3
      // 0c9: ldc2_w 3442137188707966364
      // 0cc: lload 2
      // 0cd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: iload 24
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 107
      // 0db: ifne 105
      // 0de: ifnull 164
      // 0e1: goto 0ee
      // 0e4: ldc2_w 3442137188707966364
      // 0e7: lload 2
      // 0e8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: ldc2_w 3226933608377910878
      // 0f2: lload 2
      // 0f3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/es; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: goto 105
      // 0fb: ldc2_w 3442137188707966364
      // 0fe: lload 2
      // 0ff: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: iload 24
      // 107: ifne 162
      // 10a: ldc2_w 3376431861262209932
      // 10d: lload 2
      // 10e: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ifeq 164
      // 116: goto 123
      // 119: ldc2_w 3442137188707966364
      // 11c: lload 2
      // 11d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 0
      // 124: aload 0
      // 125: ldc2_w 3105967224245457149
      // 128: lload 2
      // 129: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 0
      // 12f: ldc2_w 3226933608377910878
      // 132: lload 2
      // 133: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/es; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: ldc2_w 3105967224245457149
      // 13b: lload 2
      // 13c: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: lxor
      // 142: ldc2_w 3805913489095134112
      // 145: lload 2
      // 146: invokedynamic t (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 0
      // 14c: ldc2_w 3226933608377910878
      // 14f: lload 2
      // 150: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/es; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: goto 162
      // 158: ldc2_w 3442137188707966364
      // 15b: lload 2
      // 15c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: astore 25
      // 164: aload 0
      // 165: aload 9
      // 167: aload 4
      // 169: aload 6
      // 16b: lload 12
      // 16d: aload 0
      // 16e: aload 25
      // 170: aload 5
      // 172: aload 7
      // 174: bipush 7
      // 176: anewarray 115
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 6
      // 17d: swap
      // 17e: aastore
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 5
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 4
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 3
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x2
      // 18f: dup_x2
      // 190: pop
      // 191: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 194: bipush 2
      // 195: swap
      // 196: aastore
      // 197: dup_x1
      // 198: swap
      // 199: bipush 1
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x1
      // 19d: swap
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: ldc2_w 3128870207909735376
      // 1a4: lload 2
      // 1a5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ldc2_w 3711850683084556626
      // 1ad: lload 2
      // 1ae: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 0
      // 1b4: ldc2_w 3707441764972486446
      // 1b7: lload 2
      // 1b8: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: iload 24
      // 1bf: ifne 1e6
      // 1c2: ifeq 2d8
      // 1c5: goto 1d2
      // 1c8: ldc2_w 3442137188707966364
      // 1cb: lload 2
      // 1cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 4
      // 1d4: lload 16
      // 1d6: invokevirtual com/zelix/hy.d (J)Z
      // 1d9: goto 1e6
      // 1dc: ldc2_w 3442137188707966364
      // 1df: lload 2
      // 1e0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: istore 26
      // 1e8: aload 4
      // 1ea: ldc "J"
      // 1ec: iload 26
      // 1ee: iload 24
      // 1f0: ifne 204
      // 1f3: ifeq 207
      // 1f6: goto 203
      // 1f9: ldc2_w 3442137188707966364
      // 1fc: lload 2
      // 1fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: bipush 4
      // 204: goto 208
      // 207: bipush 1
      // 208: bipush 1
      // 209: aload 8
      // 20b: lload 18
      // 20d: aload 5
      // 20f: bipush 5
      // 210: bipush 7
      // 212: anewarray 115
      // 215: dup_x1
      // 216: swap
      // 217: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21a: bipush 6
      // 21c: swap
      // 21d: aastore
      // 21e: dup_x1
      // 21f: swap
      // 220: bipush 5
      // 221: swap
      // 222: aastore
      // 223: dup_x2
      // 224: dup_x2
      // 225: pop
      // 226: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 229: bipush 4
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x1
      // 22d: swap
      // 22e: bipush 3
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 236: bipush 2
      // 237: swap
      // 238: aastore
      // 239: dup_x1
      // 23a: swap
      // 23b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23e: bipush 1
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: bipush 0
      // 244: swap
      // 245: aastore
      // 246: ldc2_w 3499549459408360364
      // 249: lload 2
      // 24a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: astore 27
      // 251: aload 0
      // 252: aload 4
      // 254: bipush 0
      // 255: anewarray 115
      // 258: ldc2_w 3196659966843839077
      // 25b: lload 2
      // 25c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_8c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: aload 4
      // 263: lload 14
      // 265: invokevirtual com/zelix/hy.k (J)Ljava/lang/String;
      // 268: aload 27
      // 26a: lload 10
      // 26c: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // 26f: aload 27
      // 271: invokevirtual com/zelix/ir.H ()Ljava/lang/String;
      // 274: aload 6
      // 276: aload 27
      // 278: lload 20
      // 27a: bipush 6
      // 27c: anewarray 115
      // 27f: dup_x2
      // 280: dup_x2
      // 281: pop
      // 282: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 285: bipush 5
      // 286: swap
      // 287: aastore
      // 288: dup_x1
      // 289: swap
      // 28a: bipush 4
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x1
      // 28e: swap
      // 28f: bipush 3
      // 290: swap
      // 291: aastore
      // 292: dup_x1
      // 293: swap
      // 294: bipush 2
      // 295: swap
      // 296: aastore
      // 297: dup_x1
      // 298: swap
      // 299: bipush 1
      // 29a: swap
      // 29b: aastore
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 0
      // 29f: swap
      // 2a0: aastore
      // 2a1: ldc2_w 3468839181039919010
      // 2a4: lload 2
      // 2a5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: ldc2_w 3706540853943398747
      // 2ad: lload 2
      // 2ae: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mr;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: aload 0
      // 2b4: ldc2_w 2960563035968212670
      // 2b7: lload 2
      // 2b8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: new com/zelix/_ow
      // 2c0: dup
      // 2c1: getstatic com/zelix/es.c J
      // 2c4: l2i
      // 2c5: aload 0
      // 2c6: ldc2_w 3706540853943398747
      // 2c9: lload 2
      // 2ca: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: invokespecial com/zelix/_ow.<init> (ILcom/zelix/xl;)V
      // 2d2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d7: pop
      // 2d8: return
   }

   List D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new ArrayList(x44.a<"j">(this, -1884584774904100061L, var2));
   }

   void D(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      x44.a<"v">(this, var2, -1333246362007694460L, var4);
   }

   public long M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 84020726563185L;
      return x44.a<"j">(x44.a<"n">(this, 6666847466137835830L, var2), new Object[]{var4}, 6840027850795073311L, var2);
   }

   es(ig var1, boolean var2, boolean var3) {
      this.L = var1;
      this.J = var2;
      this.S = var3;
   }

   public boolean t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"o">(this, -2667186413564628886L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, -2742425426784654424L, var2);
      }

      return false;
   }

   public long o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -1261226507573800690L, var2);
   }

   void t(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      x44.a<"s">(this, x44.a<"l">(this, 1830900278286209588L, var4), 2288114158715331348L, var4);
      x44.a<"s">(this, var2, 1830900278286209588L, var4);
   }

   public void r(Object[] var1) {
      long var8 = (Long)var1[0];
      sm var2 = (sm)var1[1];
      sm var3 = (sm)var1[2];
      long var4 = (Long)var1[3];
      long var6 = (Long)var1[4];
      var8 = a ^ var8;
      long var10 = var8 ^ 10841442109669L;
      x44.a<"v">(this, var2, -7313174005175869647L, var8);
      x44.a<"v">(this, var3, -8662035700143660502L, var8);
      x44.a<"v">(this, var4, -8870434181944488007L, var8);
      x44.a<"v">(this, var6, -7409792471235961513L, var8);
      x44.a<"v">(this, x44.a<"m">(x44.a<"i">(this, -8662035700143660502L, var8), new Object[]{var10}, -7472924618292351672L, var8), -7063694489400793569L, var8);
   }

   public boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -1853744024915240175L, var2);
   }

   public boolean O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"k">(this, -3567299261513260301L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"w">(var4, -3169187274477377956L, var2);
      }

      return false;
   }

   void R(Object[] var1) {
      List var2 = (List)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"p">(this, var2, -5266279940957466302L, var3);
   }

   void o(Object[] var1) {
      es var4 = (es)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"o">(this, -4919197106578149284L, var2).add(var4);
      x44.a<"p">(var4, this, -6536375200523335225L, var2);
   }

   public long n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 5994167102520924275L, var2);
   }

   public List z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.unmodifiableList(x44.a<"o">(this, -2519173731720398174L, var2));
   }

   public sm W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 5525445267331656014L, var2);
   }

   public long e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 4073031919657666173L, var2);
   }

   boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = x44.a<"u">(-3767029866187091723L, var2);

      try {
         boolean var10000 = x44.a<"i">(this, -3166702444477751318L, var2).isEmpty();
         if (var4 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"u">(var5, -3420874235965054242L, var2);
      }

      return false;
   }

   es o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -6637909287548483209L, var2);
   }

   public mr v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -2567600000858186123L, var2);
   }

   es(ig var1) {
      this(var1, false, false);
   }

   es y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 963051434670350800L, var2);
   }

   public ig l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 6915174201476534107L, var2);
   }

   public boolean u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 147028129181068887L, var2);
   }

   List g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new ArrayList(x44.a<"h">(this, -1162903334033562565L, var2));
   }

   public long E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -3455851084559575946L, var2);
   }

   public int e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -8695241385820455547L, var2);
   }

   public sm i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 1728884233115439693L, var2);
   }

   void G(Object[] var1) {
      es var4 = (es)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"h">(this, 1396909831800536473L, var2).add(var4);
      x44.a<"w">(var4, this, 883646446969857749L, var2);
   }

   static {
      long var0 = a ^ 52747798333816L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 2871392624684976546L;
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
