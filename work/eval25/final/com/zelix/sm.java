package com.zelix;

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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sm implements _89 {
   private long b;
   private final List i;
   private final int[] z;
   private int K;
   private static int q;
   private sm Q;
   private sm U;
   private final int r;
   private static final long a = ess.a(-5879386670562063725L, 7648986658573753598L, MethodHandles.lookup().lookupClass()).a(78790691979757L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   void L(Object[] var1) {
      long var2 = (Long)var1[0];
      this.i.add(var2);
   }

   public void t(Object[] param1) {
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
      // 04: checkcast com/zelix/_89
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w -6974740388629265287
      // 1f: lload 3
      // 20: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 2
      // 26: checkcast com/zelix/sm
      // 29: astore 8
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 5c
      // 33: aload 8
      // 35: if_acmpeq d1
      // 38: goto 45
      // 3b: ldc2_w -9098201776419056111
      // 3e: lload 3
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w -8808391512367545813
      // 49: lload 3
      // 4a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/sm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w -9098201776419056111
      // 55: lload 3
      // 56: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: iload 7
      // 5e: ifne b2
      // 61: ifnonnull 9b
      // 64: goto 71
      // 67: ldc2_w -9098201776419056111
      // 6a: lload 3
      // 6b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 0
      // 72: aload 8
      // 74: ldc2_w -8808391512367545813
      // 77: lload 3
      // 78: invokedynamic r (Ljava/lang/Object;Lcom/zelix/sm;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: aload 8
      // 7f: aload 0
      // 80: ldc2_w -8848668448991573453
      // 83: lload 3
      // 84: invokedynamic r (Ljava/lang/Object;Lcom/zelix/sm;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: iload 7
      // 8b: ifeq d1
      // 8e: goto 9b
      // 91: ldc2_w -9098201776419056111
      // 94: lload 3
      // 95: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 0
      // 9c: ldc2_w -8808391512367545813
      // 9f: lload 3
      // a0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/sm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: goto b2
      // a8: ldc2_w -9098201776419056111
      // ab: lload 3
      // ac: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 8
      // b4: lload 5
      // b6: bipush 2
      // b7: anewarray 181
      // ba: dup_x2
      // bb: dup_x2
      // bc: pop
      // bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c0: bipush 1
      // c1: swap
      // c2: aastore
      // c3: dup_x1
      // c4: swap
      // c5: bipush 0
      // c6: swap
      // c7: aastore
      // c8: ldc2_w -8701708180598170872
      // cb: lload 3
      // cc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: return
   }

   public long j(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 4820387813950L;
      return _yy.j(this.Q(), a<"l">(24006, 2290463816395704969L ^ var2), a<"l">(7815, 5339189286388074953L ^ var2), var4, this.z);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sm.a J
      // 03: ldc2_w 88218653956637
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 43683679463668
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -193977006972754429
      // 14: lload 2
      // 15: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: istore 6
      // 1c: aload 0
      // 1d: iload 6
      // 1f: ifne 40
      // 22: aload 1
      // 23: if_acmpne 3f
      // 26: goto 33
      // 29: ldc2_w -2033703087309081493
      // 2c: lload 2
      // 2d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: bipush 1
      // 34: ireturn
      // 35: ldc2_w -2033703087309081493
      // 38: lload 2
      // 39: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 1
      // 40: instanceof com/zelix/sm
      // 43: iload 6
      // 45: ifne b5
      // 48: ifeq b4
      // 4b: goto 58
      // 4e: ldc2_w -2033703087309081493
      // 51: lload 2
      // 52: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 1
      // 59: checkcast com/zelix/sm
      // 5c: astore 7
      // 5e: aload 0
      // 5f: invokevirtual com/zelix/sm.Q ()J
      // 62: sipush 26931
      // 65: ldc2_w 3168859488440469965
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic l (IJ)I bsm=com/zelix/sm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: aload 0
      // 70: getfield com/zelix/sm.z [I
      // 73: lload 4
      // 75: invokestatic com/zelix/_yy.K (JI[IJ)J
      // 78: aload 7
      // 7a: invokevirtual com/zelix/sm.Q ()J
      // 7d: sipush 1335
      // 80: ldc2_w 4575547159743079880
      // 83: lload 2
      // 84: lxor
      // 85: invokedynamic l (IJ)I bsm=com/zelix/sm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: aload 7
      // 8c: getfield com/zelix/sm.z [I
      // 8f: lload 4
      // 91: invokestatic com/zelix/_yy.K (JI[IJ)J
      // 94: lcmp
      // 95: iload 6
      // 97: ifne ab
      // 9a: ifne ae
      // 9d: goto aa
      // a0: ldc2_w -2033703087309081493
      // a3: lload 2
      // a4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: athrow
      // aa: bipush 1
      // ab: goto af
      // ae: bipush 0
      // af: istore 8
      // b1: iload 8
      // b3: ireturn
      // b4: bipush 0
      // b5: ireturn
   }

   public int D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 7401383453050631080L, var2);
   }

   public boolean E(Object[] param1) {
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
      // 0a: istore 5
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: istore 3
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast com/zelix/sm
      // 1c: astore 2
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Integer
      // 23: invokevirtual java/lang/Integer.intValue ()I
      // 26: istore 4
      // 28: pop
      // 29: iload 5
      // 2b: i2l
      // 2c: bipush 48
      // 2e: lshl
      // 2f: iload 3
      // 30: i2l
      // 31: bipush 48
      // 33: lshl
      // 34: bipush 16
      // 36: lushr
      // 37: lor
      // 38: iload 4
      // 3a: i2l
      // 3b: bipush 32
      // 3d: lshl
      // 3e: bipush 32
      // 40: lushr
      // 41: lor
      // 42: getstatic com/zelix/sm.a J
      // 45: lxor
      // 46: lstore 6
      // 48: lload 6
      // 4a: dup2
      // 4b: ldc2_w 52830409138262
      // 4e: lxor
      // 4f: lstore 8
      // 51: pop2
      // 52: ldc2_w 1373726253549301402
      // 55: lload 6
      // 57: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: aload 0
      // 5d: lload 8
      // 5f: bipush 1
      // 60: anewarray 181
      // 63: dup_x2
      // 64: dup_x2
      // 65: pop
      // 66: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69: bipush 0
      // 6a: swap
      // 6b: aastore
      // 6c: ldc2_w 1000832318077110708
      // 6f: lload 6
      // 71: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: checkcast com/zelix/sm
      // 79: astore 11
      // 7b: istore 10
      // 7d: aload 11
      // 7f: ifnull d2
      // 82: iload 4
      // 84: ifgt cd
      // 87: aload 11
      // 89: iload 10
      // 8b: ifeq cb
      // 8e: aload 2
      // 8f: if_acmpne ad
      // 92: goto a0
      // 95: ldc2_w 1491217818898219804
      // 98: lload 6
      // 9a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: bipush 1
      // a1: ireturn
      // a2: ldc2_w 1491217818898219804
      // a5: lload 6
      // a7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: aload 11
      // af: lload 8
      // b1: bipush 1
      // b2: anewarray 181
      // b5: dup_x2
      // b6: dup_x2
      // b7: pop
      // b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bb: bipush 0
      // bc: swap
      // bd: aastore
      // be: ldc2_w 1000832318077110708
      // c1: lload 6
      // c3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: checkcast com/zelix/sm
      // cb: astore 11
      // cd: iload 10
      // cf: ifne 7d
      // d2: bipush 0
      // d3: iload 5
      // d5: iflt cf
      // d8: ireturn
   }

   public long Q() {
      return (Long)this.i.get(this.i.size() - 1);
   }

   public long m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 21714054990540L;
      return _yy.K(this.Q(), a<"l">(1335, 4575569136212641776L ^ var2), this.z, var4);
   }

   sm(int var1, long var2, int var4, int[] var5, _y4 var6, Set var7, byte var8, int var9, int var10) {
      long var11 = ((long)var8 << 56 | (long)var9 << 32 >>> 8 | (long)var10 << 40 >>> 40) ^ a;
      long var13 = var11 ^ 58556372393776L;
      long var15 = var11 ^ 103258281096258L;
      super();
      this.i = new ArrayList();
      Object[] var10006 = new Object[]{null, null, null, var4, var5};
      var10006[2] = var2;
      var10006[1] = var1;
      var10006[0] = var15;
      long var17 = x44.a<"t">(var10006, 1676139744721937623L, var11);
      this.z = var5;
      this.i.add(var17);
      int var10001 = x44.a<"m">(1537358244434840481L, var11);
      x44.a<"u">(var10001 + 1, 1537358244434840481L, var11);
      this.r = var10001;
      var6.G(var5, this, var13);
      var7.add(var5);
   }

   sm(sm var1, long var2, int[] var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 105045628085667L;
      long var7 = var2 ^ 116872880917309L;
      long var9 = var2 ^ 130081098105791L;
      super();
      this.i = new ArrayList();
      this.z = var4;
      int var11 = var1.m(var9);
      long var12 = x44.a<"k">(var1, new Object[]{var5}, 3822571963998470158L, var2);
      int var14 = var1.hashCode();
      Object[] var10006 = new Object[]{null, null, null, var14, var4};
      var10006[2] = var12;
      var10006[1] = var11;
      var10006[0] = var7;
      long var15 = x44.a<"s">(var10006, 2899737161441450920L, var2);
      this.i.add(var15);
      int var10001 = x44.a<"j">(3038518592739587294L, var2);
      x44.a<"r">(var10001 + 1, 3038518592739587294L, var2);
      this.r = var10001;
   }

   public long x(Object[] param1) {
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
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 4
      // 16: pop
      // 17: lload 4
      // 19: dup2
      // 1a: ldc2_w 52107009089886
      // 1d: lxor
      // 1e: lstore 6
      // 20: dup2
      // 21: ldc2_w 0
      // 24: lxor
      // 25: lstore 8
      // 27: pop2
      // 28: aload 0
      // 29: invokevirtual com/zelix/sm.Q ()J
      // 2c: lstore 11
      // 2e: ldc2_w 8186888725867735760
      // 31: lload 4
      // 33: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: aload 0
      // 39: getfield com/zelix/sm.z [I
      // 3c: astore 13
      // 3e: lload 11
      // 40: sipush 24006
      // 43: ldc2_w 2290493495865143785
      // 46: lload 4
      // 48: lxor
      // 49: invokedynamic l (IJ)I bsm=com/zelix/sm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: sipush 7815
      // 51: ldc2_w 5339218948678169257
      // 54: lload 4
      // 56: lxor
      // 57: invokedynamic l (IJ)I bsm=com/zelix/sm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: lload 6
      // 5e: aload 13
      // 60: invokestatic com/zelix/_yy.j (JIIJ[I)J
      // 63: lstore 14
      // 65: istore 10
      // 67: lload 11
      // 69: aload 0
      // 6a: ldc2_w 8103019240128408586
      // 6d: lload 4
      // 6f: invokedynamic l (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: lload 2
      // 75: lxor
      // 76: lxor
      // 77: lstore 16
      // 79: aload 0
      // 7a: getfield com/zelix/sm.i Ljava/util/List;
      // 7d: lload 16
      // 7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 87: pop
      // 88: aload 0
      // 89: ldc2_w 7740381457781468290
      // 8c: lload 4
      // 8e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/sm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: iload 10
      // 95: ifne c2
      // 98: ifnull e6
      // 9b: goto a9
      // 9e: ldc2_w 8004485100788463800
      // a1: lload 4
      // a3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: aload 0
      // aa: ldc2_w 7740381457781468290
      // ad: lload 4
      // af: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/sm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: goto c2
      // b7: ldc2_w 8004485100788463800
      // ba: lload 4
      // bc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: lload 2
      // c3: lload 8
      // c5: bipush 2
      // c6: anewarray 181
      // c9: dup_x2
      // ca: dup_x2
      // cb: pop
      // cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cf: bipush 1
      // d0: swap
      // d1: aastore
      // d2: dup_x2
      // d3: dup_x2
      // d4: pop
      // d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d8: bipush 0
      // d9: swap
      // da: aastore
      // db: ldc2_w 7783098448280422995
      // de: lload 4
      // e0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: pop2
      // e6: lload 14
      // e8: lreturn
   }

   public int m(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 72161890979679L;
      return (int)_yy.j(this.Q(), a<"l">(1335, 4575521123249719066L ^ var1), a<"l">(8825, 5411286783478997073L ^ var1), var3, this.z);
   }

   sm(long var1, long var3, int[] var5, _y4 var6, Set var7) {
      var3 = a ^ var3;
      long var8 = var3 ^ 65705177486343L;
      super();
      this.i = new ArrayList();
      this.z = var5;
      this.i.add(var1);
      int var10001 = x44.a<"j">(2189529720206098582L, var3);
      x44.a<"r">(var10001 + 1, 2189529720206098582L, var3);
      this.r = var10001;
      var6.G(var5, this, var8);
      var7.add(var5);
   }

   long D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 4034577835793197956L, var2);
   }

   public long b(Object[] var1) {
      long var4 = (Long)var1[0];
      int var3 = (Integer)var1[1];
      int var2 = (Integer)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 35494434973698L;
      return _yy.j(this.Q(), var3, var2, var6, this.z);
   }

   public boolean k(int param1, short param2, _89 param3, char param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: lstore 5
      // 1a: lload 5
      // 1c: dup2
      // 1d: ldc2_w 3426711555088
      // 20: lxor
      // 21: lstore 7
      // 23: pop2
      // 24: ldc2_w -443587941865569198
      // 27: lload 5
      // 29: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: istore 9
      // 30: aload 0
      // 31: iload 9
      // 33: ifeq 56
      // 36: aload 3
      // 37: if_acmpne 55
      // 3a: goto 48
      // 3d: ldc2_w -109875199013115436
      // 40: lload 5
      // 42: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: bipush 1
      // 49: ireturn
      // 4a: ldc2_w -109875199013115436
      // 4d: lload 5
      // 4f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 3
      // 56: instanceof com/zelix/sm
      // 59: iload 9
      // 5b: ifeq a0
      // 5e: ifeq 9f
      // 61: goto 6f
      // 64: ldc2_w -109875199013115436
      // 67: lload 5
      // 69: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aload 3
      // 70: checkcast com/zelix/sm
      // 73: astore 10
      // 75: aload 0
      // 76: lload 7
      // 78: invokevirtual com/zelix/sm.m (J)I
      // 7b: aload 10
      // 7d: lload 7
      // 7f: invokevirtual com/zelix/sm.m (J)I
      // 82: isub
      // 83: iload 9
      // 85: ifeq 9a
      // 88: ifgt 9d
      // 8b: goto 99
      // 8e: ldc2_w -109875199013115436
      // 91: lload 5
      // 93: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: bipush 1
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: bipush 1
      // a0: ireturn
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 78537470326371L;
      StringBuilder var6 = new StringBuilder();
      x44.a<"k">(var6, x44.a<"k">(this, new Object[]{var4}, -1815909325401304114L, var2), -224930781259944279L, var2);
      var6.append((char)a<"l">(19646, 8579052933053246869L ^ var2));
      var6.append(this.hashCode());
      return var6.toString();
   }

   public boolean V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, -3845196483065363037L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, -3590326070427084415L, var2);
      }

      return false;
   }

   int[] S(Object[] var1) {
      return this.z;
   }

   long L(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 101583858321265L;
      return _yy.j(
         x44.a<"o">(this, new Object[]{var2}, 5305113133078411552L, var3),
         a<"l">(24006, 2290367061524502470L ^ var3),
         a<"l">(31059, 3048269453287879511L ^ var3),
         var5,
         this.z
      );
   }

   public void y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      x44.a<"u">(this, var2, -5927379010664746556L, var4);
   }

   static {
      long var11 = a ^ 50476252205187L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "é}.ÀD\u0084Mm¤îbKºWÃY\u0010\u0093ú\u0082R>\u0010ÿ°Æ{å+vw V@\u0010;\u000b;Z®ö\u0094,Ïv\nú\u0098";
      int var5 = "é}.ÀD\u0084Mm¤îbKºWÃY\u0010\u0093ú\u0082R>\u0010ÿ°Æ{å+vw V@\u0010;\u000b;Z®ö\u0094,Ïv\nú\u0098".length();
      byte var2 = 0;

      label23:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var14 = var6;
         var10001 = var3++;
         long var17 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var8 = var17;
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
            long var21 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[8];
                     x44.a<"t">(0, -962498394480415664L, var11);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var2 < var5) {
                     continue label23;
                  }

                  var4 = "xáÕ³ÿ]\u0091m.ïWy3~\u007f&";
                  var5 = "xáÕ³ÿ]\u0091m.ïWy3~\u007f&".length();
                  var2 = 0;
            }

            byte var16 = var2;
            var2 += 8;
            var7 = var4.substring(var16, var2).getBytes("ISO-8859-1");
            var14 = var6;
            var10001 = var3++;
            var17 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var19 = 0;
         }
      }
   }

   Long c(Object[] var1) {
      int var2 = (Integer)var1[0];
      return (Long)this.i.get(var2);
   }

   public boolean W(Object[] param1) {
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
      // 0e: checkcast java/util/Set
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/sm.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 68958101509171
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 4493711917647488273
      // 26: lload 2
      // 27: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: lload 5
      // 2f: bipush 1
      // 30: anewarray 181
      // 33: dup_x2
      // 34: dup_x2
      // 35: pop
      // 36: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39: bipush 0
      // 3a: swap
      // 3b: aastore
      // 3c: ldc2_w 4145181977065536977
      // 3f: lload 2
      // 40: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: checkcast com/zelix/sm
      // 48: astore 8
      // 4a: istore 7
      // 4c: aload 8
      // 4e: ifnull ad
      // 51: aload 4
      // 53: aload 8
      // 55: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 5a: iload 7
      // 5c: lload 2
      // 5d: lconst_0
      // 5e: lcmp
      // 5f: ifle 67
      // 62: ifne b4
      // 65: iload 7
      // 67: ifne 88
      // 6a: goto 77
      // 6d: ldc2_w 2365744469749888889
      // 70: lload 2
      // 71: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: ifeq 89
      // 7a: goto 87
      // 7d: ldc2_w 2365744469749888889
      // 80: lload 2
      // 81: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: bipush 1
      // 88: ireturn
      // 89: aload 8
      // 8b: lload 5
      // 8d: bipush 1
      // 8e: anewarray 181
      // 91: dup_x2
      // 92: dup_x2
      // 93: pop
      // 94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 97: bipush 0
      // 98: swap
      // 99: aastore
      // 9a: ldc2_w 4145181977065536977
      // 9d: lload 2
      // 9e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: checkcast com/zelix/sm
      // a6: astore 8
      // a8: iload 7
      // aa: ifeq 4c
      // ad: lload 2
      // ae: lconst_0
      // af: lcmp
      // b0: iflt 51
      // b3: bipush 0
      // b4: ireturn
   }

   public void l(Object[] var1) {
      int[] var2 = (int[])var1[0];
      System.arraycopy(var2, 0, this.z, 0, this.z.length);
   }

   public _89 J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -4331198837486844915L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 2225935091046L;
      long var3 = var1 ^ 129195361990543L;
      return (int)_yy.K(this.Q(), a<"l">(10726, 6806363477751436900L ^ var1), this.z, var3);
   }

   public void N(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"p">(this, var2, 1121322291949345425L, var3);
   }

   public boolean x(Object[] var1) {
      return true;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18840;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
            throw new RuntimeException("com/zelix/sm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("com/zelix/sm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
