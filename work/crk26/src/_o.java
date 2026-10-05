package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o {
   private final List P = new ArrayList();
   private Long L;
   private _o N;
   private final List X = new ArrayList();
   private _o R;
   private long x;
   private final bn G;
   private long l;
   private final boolean t;
   private List W;
   private f5 M;
   private f5 D;
   private long I;
   private long B;
   private xk p;
   private long y;
   private final boolean n;
   private int J;
   private static final long a = prr.a(7057231982527367698L, 6632972180499710182L, MethodHandles.lookup().lookupClass()).a(28100502819546L);
   private static final long b;

   public boolean I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (m44.a<"t">(this, 7227358904805109496L, var2) != null) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"j">(var4, 8714312319196590512L, var2);
      }

      return false;
   }

   public List M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.unmodifiableList(m44.a<"q">(this, -6026917647764615277L, var2));
   }

   void L(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      m44.a<"t">(this, var2, 6408529300333954906L, var4);
   }

   void o(Object[] var1) {
      long var2 = (Long)var1[0];
      _o var4 = (_o)var1[1];
      var2 = a ^ var2;
      m44.a<"t">(this, 9167477644356964503L, var2).add(var4);
      m44.a<"v">(var4, this, 8910818286923033526L, var2);
   }

   void q(Object[] var1) {
      List var4 = (List)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      m44.a<"s">(this, var4, 161140480623419891L, var2);
   }

   public long H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 140699865540322L;
      return m44.a<"w">(m44.a<"v">(this, 2892025894139388437L, var2), new Object[]{var4}, 3227411286250456944L, var2);
   }

   public long w(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var3 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      return m44.a<"v">(this, 1862462227953847308L, var5);
   }

   boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      _0[] var4 = m44.a<"j">(-947352217680909711L, var2);

      try {
         boolean var10000 = m44.a<"t">(this, -1177292596359544825L, var2).isEmpty();
         if (var4 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (n9 var5) {
         throw m44.a<"j">(var5, -889707964805711112L, var2);
      }

      return false;
   }

   void B(Object[] var1) {
      long var3 = (Long)var1[0];
      _o var2 = (_o)var1[1];
      var3 = a ^ var3;
      m44.a<"w">(this, 3486358076549601068L, var3).add(var2);
      m44.a<"u">(var2, this, 3699639150108572131L, var3);
   }

   _o(bn var1, boolean var2, boolean var3) {
      this.G = var1;
      this.n = var2;
      this.t = var3;
   }

   List H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new ArrayList(m44.a<"r">(this, 6899325719880232977L, var2));
   }

   _o(bn var1) {
      this(var1, false, false);
   }

   public boolean L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (m44.a<"t">(this, -7889873475328359778L, var2) != null) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"j">(var4, -8494063280555949248L, var2);
      }

      return false;
   }

   public long j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, 6938091199452937322L, var2);
   }

   List A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new ArrayList(m44.a<"w">(this, -7563132004930539452L, var2));
   }

   public boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, 8273310058162735509L, var2);
   }

   _o D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, 1243994068901970268L, var2);
   }

   public long A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, 4672353482686898018L, var2);
   }

   public f5 p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, -8810313410909295876L, var2);
   }

   public xk e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, -2217806249645713612L, var2);
   }

   _o x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, -5551891674647037881L, var2);
   }

   public long J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, -6678182504207428507L, var2);
   }

   public bn X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, -6713245793749516035L, var2);
   }

   public void I(Object[] var1) {
      f5 var9 = (f5)var1[0];
      long var7 = (Long)var1[1];
      f5 var6 = (f5)var1[2];
      long var2 = (Long)var1[3];
      long var4 = (Long)var1[4];
      var7 = a ^ var7;
      long var10 = var7 ^ 68117025411517L;
      m44.a<"r">(this, var9, 201773332604766459L, var7);
      m44.a<"r">(this, var6, 87862344637591167L, var7);
      m44.a<"r">(this, var2, 1987929725109898818L, var7);
      m44.a<"r">(this, var4, 325397409764045747L, var7);
      m44.a<"r">(this, m44.a<"q">(m44.a<"p">(this, 87862344637591167L, var7), new Object[]{var10}, 1874838930096330945L, var7), 1939734928133956164L, var7);
   }

   public f5 z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, 1592804841807338541L, var2);
   }

   void E(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      m44.a<"r">(this, m44.a<"p">(this, 3404363589439240938L, var4), 3238120109998169500L, var4);
      m44.a<"r">(this, var2, 3404363589439240938L, var4);
   }

   public boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"t">(this, -6074983501408857278L, var2);
   }

   public int V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, -5777562119854272845L, var2);
   }

   public void G(Object[] param1) {
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
      // 004: checkcast com/zelix/_f
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_u
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_6
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 8
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/ym
      // 031: astore 6
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/nh
      // 03a: astore 9
      // 03c: pop
      // 03d: getstatic com/zelix/_o.a J
      // 040: lload 2
      // 041: lxor
      // 042: lstore 2
      // 043: lload 2
      // 044: dup2
      // 045: ldc2_w 52003024974854
      // 048: lxor
      // 049: lstore 10
      // 04b: dup2
      // 04c: ldc2_w 22542268174316
      // 04f: lxor
      // 050: lstore 12
      // 052: dup2
      // 053: ldc2_w 75606846375107
      // 056: lxor
      // 057: lstore 14
      // 059: dup2
      // 05a: ldc2_w 232629806346
      // 05d: lxor
      // 05e: lstore 16
      // 060: dup2
      // 061: ldc2_w 106246830077845
      // 064: lxor
      // 065: lstore 18
      // 067: dup2
      // 068: ldc2_w 8194952051594
      // 06b: lxor
      // 06c: lstore 20
      // 06e: dup2
      // 06f: ldc2_w 119720860814993
      // 072: lxor
      // 073: lstore 22
      // 075: pop2
      // 076: ldc2_w 8470470688756854054
      // 079: lload 2
      // 07a: invokedynamic m (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: aload 0
      // 080: aload 0
      // 081: ldc2_w 8543413186968669759
      // 084: lload 2
      // 085: invokedynamic s (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: ldc2_w 8294575699452227391
      // 08d: lload 2
      // 08e: invokedynamic q (Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: astore 24
      // 095: aconst_null
      // 096: astore 25
      // 098: aload 0
      // 099: aload 24
      // 09b: ifnull 0d3
      // 09e: ldc2_w 8181851865029153699
      // 0a1: lload 2
      // 0a2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/bn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: lload 18
      // 0a9: invokevirtual com/zelix/bn.C (J)Z
      // 0ac: ifne 164
      // 0af: goto 0bc
      // 0b2: ldc2_w 8426344072350662063
      // 0b5: lload 2
      // 0b6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: ldc2_w 7517540262399320807
      // 0c0: lload 2
      // 0c1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_o; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: goto 0d3
      // 0c9: ldc2_w 8426344072350662063
      // 0cc: lload 2
      // 0cd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 24
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 107
      // 0db: ifnull 105
      // 0de: ifnull 164
      // 0e1: goto 0ee
      // 0e4: ldc2_w 8426344072350662063
      // 0e7: lload 2
      // 0e8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: ldc2_w 7517540262399320807
      // 0f2: lload 2
      // 0f3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_o; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: goto 105
      // 0fb: ldc2_w 8426344072350662063
      // 0fe: lload 2
      // 0ff: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 24
      // 107: ifnull 162
      // 10a: ldc2_w 8306435767970778037
      // 10d: lload 2
      // 10e: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ifeq 164
      // 116: goto 123
      // 119: ldc2_w 8426344072350662063
      // 11c: lload 2
      // 11d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 0
      // 124: aload 0
      // 125: ldc2_w 8543413186968669759
      // 128: lload 2
      // 129: invokedynamic s (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 0
      // 12f: ldc2_w 7517540262399320807
      // 132: lload 2
      // 133: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_o; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: ldc2_w 8543413186968669759
      // 13b: lload 2
      // 13c: invokedynamic s (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: lxor
      // 142: ldc2_w 8294575699452227391
      // 145: lload 2
      // 146: invokedynamic q (Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 0
      // 14c: ldc2_w 7517540262399320807
      // 14f: lload 2
      // 150: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/_o; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: goto 162
      // 158: ldc2_w 8426344072350662063
      // 15b: lload 2
      // 15c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: astore 25
      // 164: aload 0
      // 165: aload 9
      // 167: aload 7
      // 169: aload 8
      // 16b: aload 0
      // 16c: aload 25
      // 16e: lload 12
      // 170: aload 5
      // 172: aload 4
      // 174: bipush 7
      // 176: anewarray 279
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
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 4
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 3
      // 190: swap
      // 191: aastore
      // 192: dup_x1
      // 193: swap
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
      // 1a1: ldc2_w 7819007418948875647
      // 1a4: lload 2
      // 1a5: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ldc2_w 7962287593504214813
      // 1ad: lload 2
      // 1ae: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: aload 0
      // 1b4: ldc2_w 8153963409345268333
      // 1b7: lload 2
      // 1b8: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: aload 24
      // 1bf: ifnull 1e6
      // 1c2: ifeq 2da
      // 1c5: goto 1d2
      // 1c8: ldc2_w 8426344072350662063
      // 1cb: lload 2
      // 1cc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 7
      // 1d4: lload 10
      // 1d6: invokevirtual com/zelix/_f.t (J)Z
      // 1d9: goto 1e6
      // 1dc: ldc2_w 8426344072350662063
      // 1df: lload 2
      // 1e0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: istore 26
      // 1e8: aload 7
      // 1ea: ldc "J"
      // 1ec: iload 26
      // 1ee: aload 24
      // 1f0: ifnull 204
      // 1f3: ifeq 207
      // 1f6: goto 203
      // 1f9: ldc2_w 8426344072350662063
      // 1fc: lload 2
      // 1fd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: bipush 4
      // 204: goto 208
      // 207: bipush 1
      // 208: bipush 1
      // 209: lload 22
      // 20b: aload 6
      // 20d: aload 5
      // 20f: bipush 5
      // 210: bipush 7
      // 212: anewarray 279
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
      // 223: dup_x1
      // 224: swap
      // 225: bipush 4
      // 226: swap
      // 227: aastore
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 246: ldc2_w 7977461540334958421
      // 249: lload 2
      // 24a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: astore 27
      // 251: aload 0
      // 252: aload 7
      // 254: bipush 0
      // 255: anewarray 279
      // 258: ldc2_w 8471786367778248399
      // 25b: lload 2
      // 25c: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/t6; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: aload 7
      // 263: lload 14
      // 265: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 268: lload 20
      // 26a: dup2_x1
      // 26b: pop2
      // 26c: aload 27
      // 26e: lload 16
      // 270: invokevirtual com/zelix/bf.d (J)Ljava/lang/String;
      // 273: aload 27
      // 275: invokevirtual com/zelix/bf.V ()Ljava/lang/String;
      // 278: aload 8
      // 27a: aload 27
      // 27c: bipush 6
      // 27e: anewarray 279
      // 281: dup_x1
      // 282: swap
      // 283: bipush 5
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 4
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 3
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 2
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 1
      // 298: swap
      // 299: aastore
      // 29a: dup_x2
      // 29b: dup_x2
      // 29c: pop
      // 29d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a0: bipush 0
      // 2a1: swap
      // 2a2: aastore
      // 2a3: ldc2_w 8342605730296303635
      // 2a6: lload 2
      // 2a7: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/xk; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: ldc2_w 7554983084425699028
      // 2af: lload 2
      // 2b0: invokedynamic q (Ljava/lang/Object;Lcom/zelix/xk;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: aload 0
      // 2b6: ldc2_w 8509112907031959001
      // 2b9: lload 2
      // 2ba: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: new com/zelix/i_
      // 2c2: dup
      // 2c3: getstatic com/zelix/_o.b J
      // 2c6: l2i
      // 2c7: aload 0
      // 2c8: ldc2_w 7554983084425699028
      // 2cb: lload 2
      // 2cc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/xk; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: invokespecial com/zelix/i_.<init> (ILcom/zelix/js;)V
      // 2d4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d9: pop
      // 2da: return
   }

   static {
      long var0 = a ^ 24488614720353L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -1658878846193057129L;
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
      b = var7;
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
