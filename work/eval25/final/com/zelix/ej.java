package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.AbstractMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ej {
   boolean D;
   int x;
   int i;
   AbstractMap N;
   int W;
   private static final long a = ess.a(-4994144364693289352L, -9070256375000956306L, MethodHandles.lookup().lookupClass()).a(257791908384158L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public Enumeration q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 113703123200308L;
      int var4 = (int)((var2 ^ 113703123200308L) >>> 48);
      int var5 = (int)((var2 ^ 113703123200308L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return new _8g((short)var4, var5, (short)var6, x44.a<"j">(x44.a<"n">(this, 6523606470705343508L, var2), 6555939604308564483L, var2));
   }

   public int e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(x44.a<"k">(this, 2307485714816931481L, var2), 2309538221355668371L, var2);
   }

   public ej(int param1, int param2, int param3, int param4, long param5, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ej.a J
      // 03: lload 5
      // 05: lxor
      // 06: lstore 5
      // 08: lload 5
      // 0a: dup2
      // 0b: ldc2_w 26147353279398
      // 0e: lxor
      // 0f: lstore 8
      // 11: pop2
      // 12: ldc2_w 1171387742332193093
      // 15: lload 5
      // 17: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 0
      // 1d: invokespecial java/lang/Object.<init> ()V
      // 20: aload 0
      // 21: iload 2
      // 22: ldc2_w 1384564401067434984
      // 25: lload 5
      // 27: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: astore 10
      // 2e: aload 0
      // 2f: iload 3
      // 30: ldc2_w 1020446021098672142
      // 33: lload 5
      // 35: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 0
      // 3b: aload 10
      // 3d: ifnonnull 99
      // 40: iload 4
      // 42: ldc2_w 1305507165047792396
      // 45: lload 5
      // 47: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: iload 7
      // 4e: ifeq 8a
      // 51: goto 5f
      // 54: ldc2_w 1412155559871948744
      // 57: lload 5
      // 59: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: new java/util/concurrent/ConcurrentHashMap
      // 63: dup
      // 64: iload 1
      // 65: lload 8
      // 67: invokestatic com/zelix/sh.Q (IJ)I
      // 6a: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 6d: ldc2_w 1592748362069745798
      // 70: lload 5
      // 72: invokedynamic s (Ljava/lang/Object;Ljava/util/AbstractMap;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: aload 10
      // 79: ifnull b0
      // 7c: goto 8a
      // 7f: ldc2_w 1412155559871948744
      // 82: lload 5
      // 84: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 99
      // 8e: ldc2_w 1412155559871948744
      // 91: lload 5
      // 93: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: new java/util/LinkedHashMap
      // 9c: dup
      // 9d: iload 1
      // 9e: lload 8
      // a0: invokestatic com/zelix/sh.Q (IJ)I
      // a3: invokespecial java/util/LinkedHashMap.<init> (I)V
      // a6: ldc2_w 1592748362069745798
      // a9: lload 5
      // ab: invokedynamic s (Ljava/lang/Object;Ljava/util/AbstractMap;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized void a(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var6 = var1[1];
      Object var2 = var1[2];
      Object var7 = var1[3];
      Object var5 = var1[4];
      var3 = a ^ var3;
      long var10001 = var3 ^ 28324264465768L;
      int var8 = (int)((var3 ^ 28324264465768L) >>> 32);
      int var9 = (int)((var3 ^ 28324264465768L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var3 ^ 29737564898421L;
      String var10000 = x44.a<"t">(-2975281330308591695L, var3);
      ax var14 = (ax)x44.a<"l">(x44.a<"h">(this, -3391593542409296270L, var3), var6, -2925698199484886985L, var3);
      String var13 = var10000;

      label49: {
         label44: {
            try {
               var19 = var14;
               if (var13 != null) {
                  break label49;
               }

               if (var14 != null) {
                  break label44;
               }
            } catch (gj var17) {
               throw x44.a<"t">(var17, -3067852494229118660L, var3);
            }

            var14 = new ax(
               x44.a<"h">(this, -3043656635518458596L, var3),
               x44.a<"h">(this, -3972898722649221382L, var3),
               x44.a<"h">(this, -3104633467908299272L, var3),
               x44.a<"h">(this, -2953231260360146365L, var3),
               var8,
               (char)var9,
               (short)var10
            );

            try {
               var19 = var14;
               if (var3 <= 0L) {
                  break label49;
               }

               var14.b(var11, var2, var7, var5);
               x44.a<"l">(x44.a<"h">(this, -3391593542409296270L, var3), var6, var14, -3026511852551760296L, var3);
               if (var13 == null) {
                  return;
               }
            } catch (gj var16) {
               boolean var21 = false;
               throw x44.a<"t">(var16, -3067852494229118660L, var3);
            }
         }

         try {
            var19 = var14;
         } catch (gj var15) {
            boolean var22 = false;
            throw x44.a<"t">(var15, -3067852494229118660L, var3);
         }
      }

      var19.b(var11, var2, var7, var5);
   }

   public ej(int var1, int var2, int var3, int var4, long var5) {
      var5 = a ^ var5;
      long var7 = var5 ^ 119574242407649L;
      this(var1, var2, var3, var4, var7, true);
   }

   public synchronized boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return x44.a<"k">(x44.a<"o">(this, 1865030770175291261L, var2), var4, 551197906188572378L, var2);
   }

   public ax y(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return (ax)x44.a<"k">(x44.a<"o">(this, -5144857564258234875L, var2), var4, -4678470267189364672L, var2);
   }

   public ej(int var1, short var2, int var3, char var4, int var5, int var6) {
      long var7 = ((long)var2 << 48 | (long)var4 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 44607968417582L;
      this(var1, var3, var5, 5, var9);
   }

   public synchronized Set B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 5342390904507L;
      LinkedHashSet var7 = new LinkedHashSet();
      String var10000 = x44.a<"v">(-7807046119753217373L, var2);
      Iterator var8 = x44.a<"n">(x44.a<"j">(this, -7639017379242892448L, var2), -8224764511229448782L, var2).iterator();
      String var6 = var10000;

      label34:
      while (var8.hasNext()) {
         Entry var9 = (Entry)var8.next();

         do {
            try {
               if (var2 >= 0L) {
                  if (var6 != null) {
                     return var7;
                  }

                  var7.add(new e4(var4, var9.getKey(), var9.getValue()));
               }

               if (var6 == null) {
                  continue label34;
               }
            } catch (gj var10) {
               throw x44.a<"v">(var10, -8034793477177662418L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return x44.a<"v">(var7, -7769319245385207935L, var2);
   }

   public ej(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 110779603639490L;
      this(var3, a<"o">(15624, 7455536306835963141L ^ var1), 5, 5, var4);
   }

   public synchronized List h(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Object
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Object
      // 17: astore 6
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast java/lang/Long
      // 1f: invokevirtual java/lang/Long.longValue ()J
      // 22: lstore 2
      // 23: pop
      // 24: getstatic com/zelix/ej.a J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: lload 2
      // 2b: dup2
      // 2c: ldc2_w 83957067122976
      // 2f: lxor
      // 30: lstore 7
      // 32: pop2
      // 33: ldc2_w 2392484009549445175
      // 36: lload 2
      // 37: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: aload 0
      // 3d: ldc2_w 2839732078122799604
      // 40: lload 2
      // 41: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/AbstractMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: aload 4
      // 48: ldc2_w 2369938069367416753
      // 4b: lload 2
      // 4c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: checkcast com/zelix/ax
      // 54: astore 10
      // 56: astore 9
      // 58: aload 10
      // 5a: aload 9
      // 5c: ifnonnull 7d
      // 5f: ifnonnull 7b
      // 62: goto 6f
      // 65: ldc2_w 2516015250336683706
      // 68: lload 2
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aconst_null
      // 70: areturn
      // 71: ldc2_w 2516015250336683706
      // 74: lload 2
      // 75: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 10
      // 7d: aload 5
      // 7f: bipush 1
      // 80: anewarray 214
      // 83: dup_x1
      // 84: swap
      // 85: bipush 0
      // 86: swap
      // 87: aastore
      // 88: ldc2_w 2754593105211238825
      // 8b: lload 2
      // 8c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: astore 11
      // 93: aload 11
      // 95: aload 9
      // 97: lload 2
      // 98: lconst_0
      // 99: lcmp
      // 9a: ifle c0
      // 9d: ifnonnull be
      // a0: ifnonnull bc
      // a3: goto b0
      // a6: ldc2_w 2516015250336683706
      // a9: lload 2
      // aa: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: aconst_null
      // b1: areturn
      // b2: ldc2_w 2516015250336683706
      // b5: lload 2
      // b6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: aload 11
      // be: aload 6
      // c0: lload 7
      // c2: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // c5: areturn
   }

   public ej(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var10001 = var4 ^ 10436486759544L;
      int var6 = (int)((var4 ^ 10436486759544L) >>> 48);
      int var7 = (int)((var4 ^ 10436486759544L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      this(a<"o">(16417, 3817772679611188333L ^ var4), (short)var6, a<"o">(5573, 5281317043389976971L ^ var4), (char)var7, 5, var8);
   }

   public synchronized boolean h(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/Object
      // 21: astore 3
      // 22: pop
      // 23: getstatic com/zelix/ej.a J
      // 26: lload 5
      // 28: lxor
      // 29: lstore 5
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 63451588574088
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w 2451295937546107648
      // 38: lload 5
      // 3a: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: ldc2_w 2621040466019128003
      // 43: lload 5
      // 45: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/AbstractMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: aload 2
      // 4b: ldc2_w 2581892115879814278
      // 4e: lload 5
      // 50: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: checkcast com/zelix/ax
      // 58: astore 10
      // 5a: astore 9
      // 5c: aload 10
      // 5e: aload 9
      // 60: ifnonnull 83
      // 63: ifnonnull 81
      // 66: goto 74
      // 69: ldc2_w 2440284312256157069
      // 6c: lload 5
      // 6e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: bipush 0
      // 75: ireturn
      // 76: ldc2_w 2440284312256157069
      // 79: lload 5
      // 7b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: aload 10
      // 83: lload 7
      // 85: aload 4
      // 87: aload 3
      // 88: bipush 3
      // 89: anewarray 214
      // 8c: dup_x1
      // 8d: swap
      // 8e: bipush 2
      // 8f: swap
      // 90: aastore
      // 91: dup_x1
      // 92: swap
      // 93: bipush 1
      // 94: swap
      // 95: aastore
      // 96: dup_x2
      // 97: dup_x2
      // 98: pop
      // 99: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9c: bipush 0
      // 9d: swap
      // 9e: aastore
      // 9f: ldc2_w 4280629201968136198
      // a2: lload 5
      // a4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: ireturn
   }

   static {
      long var0 = a ^ 93754801739217L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "&SôM7(ä\u0081NEAþ¨¥\u001bà\u001b<\u0094Á(d.õ";
      int var7 = "&SôM7(ä\u0081NEAþ¨¥\u001bà\u001b<\u0094Á(d.õ".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
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
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[3];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27316;
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ej", var14);
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
         throw new RuntimeException("com/zelix/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
