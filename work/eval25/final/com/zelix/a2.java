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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a2 {
   private final lx l;
   private final boolean z;
   private final String e;
   private final int r;
   private final _r1 q;
   private final boolean M;
   private final _rd v;
   private final th T;
   private List p;
   private static final long a = ess.a(5633435589235969194L, -471659541594979505L, MethodHandles.lookup().lookupClass()).a(273689125376346L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long f;

   public _r1 i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 4702530072473074195L, var2);
   }

   public boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"o">(this, 1429246432468965446L, var2) == x44.a<"j">(661235222806433927L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"s">(var4, 1441349974068926100L, var2);
      }

      return false;
   }

   public boolean Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, -1585364760337816980L, var2) == x44.a<"h">(-1600896516775575764L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"q">(var4, -1285031114178597698L, var2);
      }

      return false;
   }

   public List f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.unmodifiableList(x44.a<"n">(this, -9048973437781204749L, var2));
   }

   a2(int var1, lx var2, th var3, boolean var4, boolean var5, long var6, byte var8, String var9) {
      long var10 = (var6 << 8 | (long)var8 << 56 >>> 56) ^ a;
      long var12 = var10 ^ 3771447195380L;
      this(var1, var2, var3, var4, var12, var5, var9, null, x44.a<"n">(8336042504684067858L, var10));
   }

   a2(int var1, lx var2, th var3, boolean var4, long var5, boolean var7, String var8, _rd var9, _r1 var10) {
      var5 = a ^ var5;
      super();
      x44.a<"t">(this, new ArrayList(), 2832365483308451286L, var5);
      this.r = var1;
      this.l = var2;
      this.T = var3;
      this.z = var4;
      this.M = var7;
      this.v = var9;
      this.q = var10;
      this.e = var8;
   }

   a2(int var1, long var2, lx var4, th var5, boolean var6, String var7, _rd var8, _r1 var9) {
      var2 = a ^ var2;
      long var10 = var2 ^ 7201020404979L;
      this(var1, var4, var5, var6, var10, true, var7, var8, var9);
   }

   public boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -3547256321099696144L, var2);
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"h">(this, -508090412475452575L, var2) == x44.a<"m">(-39732364246636427L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"t">(var4, -60826826792665677L, var2);
      }

      return false;
   }

   public boolean V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, -3906910602576903596L, var2) == x44.a<"h">(-2979081193971247861L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"q">(var4, -3597569450324702074L, var2);
      }

      return false;
   }

   public boolean p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, 4275235024425038023L, var2) == x44.a<"k">(2734898662186439915L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"r">(var4, 4359959146938940949L, var2);
      }

      return false;
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, -9065814982972136719L, var2) != null) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"q">(var4, -7128412458308526202L, var2);
      }

      return false;
   }

   public boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"j">(this, 1245443582787099355L, var2) == x44.a<"o">(715003959021572333L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"v">(var4, 1629657050444960777L, var2);
      }

      return false;
   }

   public String I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -6032677522326566102L, var2);
   }

   public boolean N(Object[] param1) {
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
      // 0a: istore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 4
      // 17: dup
      // 18: bipush 2
      // 19: aaload
      // 1a: checkcast java/lang/Boolean
      // 1d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 20: istore 2
      // 21: dup
      // 22: bipush 3
      // 23: aaload
      // 24: checkcast java/lang/Boolean
      // 27: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a: istore 3
      // 2b: pop
      // 2c: getstatic com/zelix/a2.a J
      // 2f: lload 4
      // 31: lxor
      // 32: lstore 4
      // 34: ldc2_w 878458954197068241
      // 37: lload 4
      // 39: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: astore 7
      // 40: ldc2_w 1213716895196036515
      // 43: lload 4
      // 45: invokedynamic o (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: aload 0
      // 4b: ldc2_w 647835324978181036
      // 4e: lload 4
      // 50: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_r1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: invokevirtual com/zelix/_r1.ordinal ()I
      // 58: iaload
      // 59: aload 7
      // 5b: ifnonnull bc
      // 5e: tableswitch 93 1 12 73 73 87 87 87 87 87 89 89 89 89 91
      // 9c: ldc2_w 1363948037877698681
      // 9f: lload 4
      // a1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: iload 6
      // a9: ireturn
      // aa: ldc2_w 1363948037877698681
      // ad: lload 4
      // af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iload 2
      // b6: ireturn
      // b7: iload 3
      // b8: ireturn
      // b9: bipush 0
      // ba: ireturn
      // bb: bipush 0
      // bc: ireturn
   }

   public boolean t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 2193676858616357805L, var2);
   }

   public boolean r(Object[] param1) {
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
      // 0c: getstatic com/zelix/a2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 11323852026073
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 2182430475378195368
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: ldc2_w 1821424012333333470
      // 28: lload 2
      // 29: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 33: astore 7
      // 35: astore 6
      // 37: aload 7
      // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e: ifeq 9b
      // 41: aload 7
      // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48: checkcast com/zelix/_yo
      // 4b: astore 8
      // 4d: aload 8
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 486
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w 511723580689077644
      // 61: lload 2
      // 62: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: aload 6
      // 69: lload 2
      // 6a: lconst_0
      // 6b: lcmp
      // 6c: ifle 74
      // 6f: ifnonnull 9c
      // 72: aload 6
      // 74: ifnonnull 95
      // 77: goto 84
      // 7a: ldc2_w 41889968775266816
      // 7d: lload 2
      // 7e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: ifeq 96
      // 87: goto 94
      // 8a: ldc2_w 41889968775266816
      // 8d: lload 2
      // 8e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: bipush 1
      // 95: ireturn
      // 96: aload 6
      // 98: ifnull 37
      // 9b: bipush 0
      // 9c: ireturn
   }

   public static boolean c(Object[] param0) {
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
      // 04: checkcast com/zelix/a2
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/a2.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 8621231094962197061
      // 1c: lload 2
      // 1d: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 1
      // 25: ldc2_w 7607201746061013540
      // 28: lload 2
      // 29: invokedynamic k (JJ)Lcom/zelix/a2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 4
      // 30: ifnonnull 5a
      // 33: if_acmpeq 5d
      // 36: goto 43
      // 39: ldc2_w 7600275449165507565
      // 3c: lload 2
      // 3d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 1
      // 44: ldc2_w 7644276638707796760
      // 47: lload 2
      // 48: invokedynamic k (JJ)Lcom/zelix/a2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: goto 5a
      // 50: ldc2_w 7600275449165507565
      // 53: lload 2
      // 54: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: if_acmpne 6b
      // 5d: bipush 1
      // 5e: goto 6c
      // 61: ldc2_w 7600275449165507565
      // 64: lload 2
      // 65: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
   }

   public boolean z(Object[] param1) {
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
      // 0c: getstatic com/zelix/a2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 79011387801397
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6026581350471120451
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: ldc2_w 5896931665059676013
      // 29: lload 2
      // 2a: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: ldc2_w 5380369621354266937
      // 33: lload 2
      // 34: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/th; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokevirtual com/zelix/th.ordinal ()I
      // 3c: iaload
      // 3d: aload 6
      // 3f: ifnonnull c3
      // 42: tableswitch 128 1 4 40 40 40 52
      // 60: ldc2_w 5584438863213154283
      // 63: lload 2
      // 64: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: bipush 1
      // 6b: ireturn
      // 6c: ldc2_w 5584438863213154283
      // 6f: lload 2
      // 70: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 0
      // 77: lload 4
      // 79: bipush 1
      // 7a: anewarray 486
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w 5592244836878278100
      // 89: lload 2
      // 8a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: sipush 20278
      // 92: ldc2_w 5565310480551092389
      // 95: lload 2
      // 96: lxor
      // 97: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/a2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9f: aload 6
      // a1: ifnonnull c1
      // a4: ifeq c0
      // a7: goto b4
      // aa: ldc2_w 5584438863213154283
      // ad: lload 2
      // ae: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: bipush 1
      // b5: ireturn
      // b6: ldc2_w 5584438863213154283
      // b9: lload 2
      // ba: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: bipush 0
      // c1: ireturn
      // c2: bipush 0
      // c3: ireturn
   }

   public static int E(Object[] param0) {
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
      // 004: checkcast com/zelix/a2
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/a2.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 29110487209207
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 41907779572372
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 109415236461124
      // 02c: lxor
      // 02d: lstore 8
      // 02f: dup2
      // 030: ldc2_w 37815966789155
      // 033: lxor
      // 034: lstore 10
      // 036: pop2
      // 037: ldc2_w -3597910654756606992
      // 03a: lload 2
      // 03b: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: astore 12
      // 042: aload 1
      // 043: lload 8
      // 045: bipush 1
      // 046: anewarray 486
      // 049: dup_x2
      // 04a: dup_x2
      // 04b: pop
      // 04c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04f: bipush 0
      // 050: swap
      // 051: aastore
      // 052: ldc2_w -3970379171042345517
      // 055: lload 2
      // 056: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 12
      // 05d: ifnonnull 095
      // 060: ifeq 094
      // 063: goto 070
      // 066: ldc2_w -3401069761344023976
      // 069: lload 2
      // 06a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 1
      // 071: lload 10
      // 073: bipush 1
      // 074: anewarray 486
      // 077: dup_x2
      // 078: dup_x2
      // 079: pop
      // 07a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: ldc2_w -2985341578792202432
      // 083: lload 2
      // 084: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: ireturn
      // 08a: ldc2_w -3401069761344023976
      // 08d: lload 2
      // 08e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: bipush 0
      // 095: istore 13
      // 097: iload 13
      // 099: aload 1
      // 09a: lload 10
      // 09c: bipush 1
      // 09d: anewarray 486
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 0
      // 0a7: swap
      // 0a8: aastore
      // 0a9: ldc2_w -2985341578792202432
      // 0ac: lload 2
      // 0ad: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: if_icmpge 136
      // 0b5: aload 1
      // 0b6: lload 4
      // 0b8: iload 13
      // 0ba: bipush 2
      // 0bb: anewarray 486
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: bipush 1
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 0
      // 0cd: swap
      // 0ce: aastore
      // 0cf: ldc2_w -3073044844514875848
      // 0d2: lload 2
      // 0d3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_yo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: astore 14
      // 0da: aload 12
      // 0dc: lload 2
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: iflt 133
      // 0e2: ifnonnull 131
      // 0e5: aload 14
      // 0e7: lload 6
      // 0e9: bipush 1
      // 0ea: anewarray 486
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w -3840869711659110259
      // 0f9: lload 2
      // 0fa: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: aload 12
      // 101: ifnonnull 137
      // 104: goto 111
      // 107: ldc2_w -3401069761344023976
      // 10a: lload 2
      // 10b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: ifeq 12e
      // 114: goto 121
      // 117: ldc2_w -3401069761344023976
      // 11a: lload 2
      // 11b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: iload 13
      // 123: ireturn
      // 124: ldc2_w -3401069761344023976
      // 127: lload 2
      // 128: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: iinc 13 1
      // 131: aload 12
      // 133: ifnull 097
      // 136: bipush -1
      // 137: ireturn
   }

   public boolean L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"k">(this, 8832068629881417986L, var2) == x44.a<"n">(9218208365887319373L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"w">(var4, 9026567955715522512L, var2);
      }

      return false;
   }

   public static int b(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/a2
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/a2.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: lload 1
      // 1a: dup2
      // 1b: ldc2_w 21663317675630
      // 1e: lxor
      // 1f: lstore 4
      // 21: dup2
      // 22: ldc2_w 34867765776492
      // 25: lxor
      // 26: lstore 6
      // 28: dup2
      // 29: ldc2_w 48028557866170
      // 2c: lxor
      // 2d: lstore 8
      // 2f: pop2
      // 30: ldc2_w -3132061571840822935
      // 33: lload 1
      // 34: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: bipush 0
      // 3a: istore 11
      // 3c: astore 10
      // 3e: iload 11
      // 40: aload 3
      // 41: lload 8
      // 43: bipush 1
      // 44: anewarray 486
      // 47: dup_x2
      // 48: dup_x2
      // 49: pop
      // 4a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d: bipush 0
      // 4e: swap
      // 4f: aastore
      // 50: ldc2_w -3744489736001677863
      // 53: lload 1
      // 54: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: if_icmpge dd
      // 5c: aload 3
      // 5d: lload 4
      // 5f: iload 11
      // 61: bipush 2
      // 62: anewarray 486
      // 65: dup_x1
      // 66: swap
      // 67: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6a: bipush 1
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x2
      // 6e: dup_x2
      // 6f: pop
      // 70: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73: bipush 0
      // 74: swap
      // 75: aastore
      // 76: ldc2_w -3475846299142751071
      // 79: lload 1
      // 7a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_yo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: astore 12
      // 81: aload 10
      // 83: lload 1
      // 84: lconst_0
      // 85: lcmp
      // 86: iflt da
      // 89: ifnonnull d8
      // 8c: aload 12
      // 8e: lload 6
      // 90: bipush 1
      // 91: anewarray 486
      // 94: dup_x2
      // 95: dup_x2
      // 96: pop
      // 97: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9a: bipush 0
      // 9b: swap
      // 9c: aastore
      // 9d: ldc2_w -3946155589034620615
      // a0: lload 1
      // a1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: aload 10
      // a8: ifnonnull de
      // ab: goto b8
      // ae: ldc2_w -3866919892768700223
      // b1: lload 1
      // b2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: ifeq d5
      // bb: goto c8
      // be: ldc2_w -3866919892768700223
      // c1: lload 1
      // c2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: iload 11
      // ca: ireturn
      // cb: ldc2_w -3866919892768700223
      // ce: lload 1
      // cf: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: iinc 11 1
      // d8: aload 10
      // da: ifnull 3e
      // dd: bipush -1
      // de: ireturn
   }

   void p(Object[] var1) {
      long var5 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      _8p var3 = (_8p)var1[2];
      boolean var2 = (Boolean)var1[3];
      var5 = a ^ var5;
      long var7 = var5 ^ 18165164258565L;
      Object[] var10008 = new Object[]{null, null, null, null, null, false};
      var10008[4] = false;
      var10008[3] = var7;
      var10008[2] = var2;
      var10008[1] = var3;
      var10008[0] = var4;
      x44.a<"o">(this, var10008, -4033185072795262912L, var5);
   }

   public String D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -3385096452133833112L, var2).substring(0, x44.a<"i">(this, -3385096452133833112L, var2).indexOf((int)f));
   }

   public _rd P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 4977472961988453837L, var2);
   }

   public _yo t(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      return (_yo)x44.a<"h">(this, 6959625425493213709L, var3).get(var2);
   }

   void h(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      _8p var6 = (_8p)var1[2];
      boolean var7 = (Boolean)var1[3];
      boolean var5 = (Boolean)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 46145698525607L;
      Object[] var10008 = new Object[]{null, null, null, null, null, false};
      var10008[4] = var5;
      var10008[3] = var8;
      var10008[2] = var7;
      var10008[1] = var6;
      var10008[0] = var2;
      x44.a<"m">(this, var10008, -8312229880129444638L, var3);
   }

   void E(Object[] var1) {
      int var5 = (Integer)var1[0];
      _8p var3 = (_8p)var1[1];
      boolean var6 = (Boolean)var1[2];
      long var7 = (Long)var1[3];
      boolean var4 = (Boolean)var1[4];
      boolean var2 = (Boolean)var1[5];
      var7 = a ^ var7;
      long var9 = var7 ^ 21153377951187L;
      if (x44.a<"j">(this, 574203526073787759L, var7).size() > 0) {
         _yo var11 = (_yo)x44.a<"j">(this, 574203526073787759L, var7).get(x44.a<"j">(this, 574203526073787759L, var7).size() - 1);

         try {
            int var10000 = x44.a<"n">(var11, new Object[]{var9}, 1736274496274188042L, var7);
            if (var7 <= 0L) {
               return;
            }

            if (var10000 >= var5) {
               throw new IllegalArgumentException(
                  a<"j">(17237, 1933749709399883679L ^ var7)
                     + x44.a<"n">(var11, new Object[]{var9}, 1736274496274188042L, var7)
                     + a<"j">(24543, 2635044082604008215L ^ var7)
                     + var5
               );
            }
         } catch (IllegalArgumentException var12) {
            throw x44.a<"v">(var12, 2172378626473434289L, var7);
         }
      }

      x44.a<"j">(this, 574203526073787759L, var7).add(new _yo(var5, var3, var6, var4, var2, null));
   }

   public static String p(Object[] param0) {
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
      // 04: checkcast com/zelix/a2
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/a2.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w 8065010343812270605
      // 1c: lload 2
      // 1d: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 1
      // 25: ldc2_w 8203972490339068524
      // 28: lload 2
      // 29: invokedynamic k (JJ)Lcom/zelix/a2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 4
      // 30: ifnonnull 5a
      // 33: if_acmpne 50
      // 36: goto 43
      // 39: ldc2_w 8156566951312749477
      // 3c: lload 2
      // 3d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: ldc "I"
      // 45: areturn
      // 46: ldc2_w 8156566951312749477
      // 49: lload 2
      // 4a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 1
      // 51: ldc2_w 8240889366842495824
      // 54: lload 2
      // 55: invokedynamic k (JJ)Lcom/zelix/a2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: if_acmpne 6a
      // 5d: ldc "J"
      // 5f: areturn
      // 60: ldc2_w 8156566951312749477
      // 63: lload 2
      // 64: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aconst_null
      // 6b: areturn
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"l">(this, 7698487796618289477L, var2) == x44.a<"i">(7932038406107047020L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"p">(var4, 7855269475929026455L, var2);
      }

      return false;
   }

   public boolean O(Object[] param1) {
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
      // 0c: getstatic com/zelix/a2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 37057329890618
      // 17: lxor
      // 18: dup2
      // 19: bipush 32
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 32
      // 22: lshl
      // 23: bipush 48
      // 25: lushr
      // 26: l2i
      // 27: istore 5
      // 29: dup2
      // 2a: bipush 48
      // 2c: lshl
      // 2d: bipush 48
      // 2f: lushr
      // 30: l2i
      // 31: istore 6
      // 33: pop2
      // 34: pop2
      // 35: ldc2_w 4256681346980929267
      // 38: lload 2
      // 39: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: aload 0
      // 3f: ldc2_w 4331819252480581253
      // 42: lload 2
      // 43: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4d: astore 8
      // 4f: astore 7
      // 51: aload 8
      // 53: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 58: ifeq ca
      // 5b: aload 8
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast com/zelix/_yo
      // 65: astore 9
      // 67: aload 9
      // 69: iload 4
      // 6b: iload 5
      // 6d: i2s
      // 6e: iload 6
      // 70: i2c
      // 71: bipush 3
      // 72: anewarray 486
      // 75: dup_x1
      // 76: swap
      // 77: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7a: bipush 2
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x1
      // 7e: swap
      // 7f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 82: bipush 1
      // 83: swap
      // 84: aastore
      // 85: dup_x1
      // 86: swap
      // 87: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8a: bipush 0
      // 8b: swap
      // 8c: aastore
      // 8d: ldc2_w 4462801453636192751
      // 90: lload 2
      // 91: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: aload 7
      // 98: lload 2
      // 99: lconst_0
      // 9a: lcmp
      // 9b: ifle a3
      // 9e: ifnonnull cb
      // a1: aload 7
      // a3: ifnonnull c4
      // a6: goto b3
      // a9: ldc2_w 2724567144585209691
      // ac: lload 2
      // ad: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: ifeq c5
      // b6: goto c3
      // b9: ldc2_w 2724567144585209691
      // bc: lload 2
      // bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: athrow
      // c3: bipush 1
      // c4: ireturn
      // c5: aload 7
      // c7: ifnull 51
      // ca: bipush 0
      // cb: ireturn
   }

   public int o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 104748240047983L;
      return x44.a<"h">(x44.a<"l">(this, -5803881177629333285L, var2), new Object[]{var4}, -5577316501185087566L, var2);
   }

   public boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, 8799130594228236687L, var2) == x44.a<"k">(9192167296652491005L, var2)) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"r">(var4, 9063998389713502045L, var2);
      }

      return false;
   }

   a2(long var1, int var3, lx var4, th var5, boolean var6, String var7) {
      var1 = a ^ var1;
      long var8 = (var1 ^ 114219254612887L) >>> 8;
      int var10 = (int)((var1 ^ 114219254612887L) << 56 >>> 56);
      this(var3, var4, var5, var6, true, var8, (byte)var10, var7);
   }

   public static int d(Object[] param0) {
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
      // 004: checkcast com/zelix/a2
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/a2.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 124581556450134
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 45011439638424
      // 025: lxor
      // 026: dup2
      // 027: bipush 32
      // 029: lushr
      // 02a: l2i
      // 02b: istore 6
      // 02d: dup2
      // 02e: bipush 32
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 7
      // 037: dup2
      // 038: bipush 48
      // 03a: lshl
      // 03b: bipush 48
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 8
      // 041: pop2
      // 042: dup2
      // 043: ldc2_w 82313102526240
      // 046: lxor
      // 047: lstore 9
      // 049: dup2
      // 04a: ldc2_w 80620832246146
      // 04d: lxor
      // 04e: lstore 11
      // 050: pop2
      // 051: ldc2_w -1607560329469457327
      // 054: lload 1
      // 055: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: bipush 0
      // 05b: istore 14
      // 05d: astore 13
      // 05f: iload 14
      // 061: aload 3
      // 062: lload 11
      // 064: bipush 1
      // 065: anewarray 486
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w -1067207352950314783
      // 074: lload 1
      // 075: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: if_icmpge 145
      // 07d: aload 3
      // 07e: lload 4
      // 080: iload 14
      // 082: bipush 2
      // 083: anewarray 486
      // 086: dup_x1
      // 087: swap
      // 088: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x2
      // 08f: dup_x2
      // 090: pop
      // 091: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w -938100256752713319
      // 09a: lload 1
      // 09b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_yo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: astore 15
      // 0a2: aload 15
      // 0a4: lload 9
      // 0a6: bipush 1
      // 0a7: anewarray 486
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -1088954722125602187
      // 0b6: lload 1
      // 0b7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: aload 13
      // 0be: lload 1
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 0c9
      // 0c4: ifnonnull 146
      // 0c7: aload 13
      // 0c9: ifnonnull 13c
      // 0cc: goto 0d9
      // 0cf: ldc2_w -617676882282711559
      // 0d2: lload 1
      // 0d3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: ifne 13a
      // 0dc: goto 0e9
      // 0df: ldc2_w -617676882282711559
      // 0e2: lload 1
      // 0e3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 15
      // 0eb: iload 6
      // 0ed: iload 7
      // 0ef: i2s
      // 0f0: iload 8
      // 0f2: i2c
      // 0f3: bipush 3
      // 0f4: anewarray 486
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc: bipush 2
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 1
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -1203297816286864563
      // 112: lload 1
      // 113: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: aload 13
      // 11a: ifnonnull 13c
      // 11d: goto 12a
      // 120: ldc2_w -617676882282711559
      // 123: lload 1
      // 124: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: ifeq 13d
      // 12d: goto 13a
      // 130: ldc2_w -617676882282711559
      // 133: lload 1
      // 134: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: iload 14
      // 13c: ireturn
      // 13d: iinc 14 1
      // 140: aload 13
      // 142: ifnull 05f
      // 145: bipush -1
      // 146: ireturn
   }

   public int B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -2719692116137117479L, var2).size();
   }

   static {
      long var5 = a ^ 113842446400531L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "'\u009b\\\u001aÜ,Áß\u0003\rç\u008eE²å\u0015\u0018\u0012î%\u0004f0eù\u00023=\nÆ~\u001fü\u001fl¦dÞ\u0014\u0097¦`ç\u0002\u001fp\u0094\u0090By\u008b\u009b«²X\u001e\u0083¦é\u001fÅ\u0016XTýå¶8èu\u001b¾/ÇpV#ÂL\u0087+!i³/\u0010b\u009d%$j\f8TÇWÀûh¼ùn}à·\\T%&\u0099{¢\fìN'\u0081ÔÈûÁ\u00945ÔÍ\u0019=·Úé9=Ïfm²Ò¡";
      int var13 = "'\u009b\\\u001aÜ,Áß\u0003\rç\u008eE²å\u0015\u0018\u0012î%\u0004f0eù\u00023=\nÆ~\u001fü\u001fl¦dÞ\u0014\u0097¦`ç\u0002\u001fp\u0094\u0090By\u008b\u009b«²X\u001e\u0083¦é\u001fÅ\u0016XTýå¶8èu\u001b¾/ÇpV#ÂL\u0087+!i³/\u0010b\u009d%$j\f8TÇWÀûh¼ùn}à·\\T%&\u0099{¢\fìN'\u0081ÔÈûÁ\u00945ÔÍ\u0019=·Úé9=Ïfm²Ò¡"
         .length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 5078521500835829918L;
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
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            f = var23;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12661;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/a2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/a2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
