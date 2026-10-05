package com.zelix;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a3 implements Serializable, Set {
   private List F;
   private Set S;
   private static final long a = ess.a(-2216841505375322072L, -4340618051747060603L, MethodHandles.lookup().lookupClass()).a(14196526009269L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public synchronized boolean add(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/a3.a J
      // 03: ldc2_w 42595242591976
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -8054459275207603908
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -8009755905918344063
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 1
      // 1e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 23: aload 4
      // 25: ifnonnull 50
      // 28: ifeq 4f
      // 2b: goto 38
      // 2e: ldc2_w -8531956691811076158
      // 31: lload 2
      // 32: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/zelix/a3.F Ljava/util/List;
      // 3c: aload 1
      // 3d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 42: pop
      // 43: bipush 1
      // 44: ireturn
      // 45: ldc2_w -8531956691811076158
      // 48: lload 2
      // 49: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
   }

   public a3(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 44770828328573L;
      long var6 = var2 ^ 68015708438953L;
      super();
      Object[] var10004 = new Object[]{null, sh.Q(var1, var4)};
      var10004[0] = var6;
      x44.a<"p">(this, x44.a<"s">(var10004, -5529154410688335280L, var2), -5371163729774755549L, var2);
      this.F = new ArrayList(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized Object e(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      String var5 = x44.a<"t">(-811294944395334215L, var3);

      label33: {
         int var10000;
         label32: {
            try {
               var10000 = var2;
               if (var5 != null) {
                  break label32;
               }

               if (var2 < 0) {
                  break label33;
               }
            } catch (IllegalArgumentException var8) {
               throw x44.a<"t">(var8, -1360901917423889593L, var3);
            }

            var10000 = var2;
         }

         try {
            if (var10000 < this.F.size()) {
               return this.F.get(var2);
            }
         } catch (IllegalArgumentException var7) {
            boolean var10001 = false;
            throw x44.a<"t">(var7, -1360901917423889593L, var3);
         }
      }

      try {
         throw new IllegalArgumentException(a<"a">(10435, 6145777411163120027L ^ var3) + var2 + a<"a">(32187, 1996736785015485666L ^ var3) + this.F.size());
      } catch (IllegalArgumentException var6) {
         boolean var11 = false;
         throw x44.a<"t">(var6, -1360901917423889593L, var3);
      }
   }

   public a3(Collection param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: getstatic com/zelix/a3.a J
      // 11: lxor
      // 12: lstore 4
      // 14: lload 4
      // 16: dup2
      // 17: ldc2_w 130849434313550
      // 1a: lxor
      // 1b: lstore 6
      // 1d: pop2
      // 1e: ldc2_w -3251972921194329126
      // 21: lload 4
      // 23: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: aload 1
      // 2a: invokeinterface java/util/Collection.size ()I 1
      // 2f: lload 6
      // 31: invokespecial com/zelix/a3.<init> (IJ)V
      // 34: astore 8
      // 36: aload 1
      // 37: dup
      // 38: astore 9
      // 3a: monitorenter
      // 3b: aload 1
      // 3c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 41: astore 10
      // 43: aload 10
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq b4
      // 4d: aload 10
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: astore 11
      // 56: aload 0
      // 57: ldc2_w -3300640044967713177
      // 5a: lload 4
      // 5c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: aload 11
      // 63: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 68: istore 12
      // 6a: aload 8
      // 6c: ifnonnull bb
      // 6f: iload 12
      // 71: aload 8
      // 73: ifnonnull ae
      // 76: goto 84
      // 79: ldc2_w -3783583635165792988
      // 7c: lload 4
      // 7e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: ifeq af
      // 87: goto 95
      // 8a: ldc2_w -3783583635165792988
      // 8d: lload 4
      // 8f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 0
      // 96: getfield com/zelix/a3.F Ljava/util/List;
      // 99: aload 11
      // 9b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a0: goto ae
      // a3: ldc2_w -3783583635165792988
      // a6: lload 4
      // a8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: pop
      // af: aload 8
      // b1: ifnull 43
      // b4: aload 9
      // b6: monitorexit
      // b7: iload 3
      // b8: iflt bb
      // bb: goto c6
      // be: astore 13
      // c0: aload 9
      // c2: monitorexit
      // c3: aload 13
      // c5: athrow
      // c6: return
   }

   @Override
   public Iterator iterator() {
      long var1 = a ^ 53789708522365L;
      long var10001 = var1 ^ 41485714323106L;
      int var3 = (int)((var1 ^ 41485714323106L) >>> 32);
      int var4 = (int)((var1 ^ 41485714323106L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      return new t8(var3, var4, (byte)var5, this);
   }

   public a3(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 53706835356532L;
      super();
      x44.a<"v">(this, x44.a<"u">(new Object[]{var3}, 7741948452066812604L, var1), 8454291084130353413L, var1);
      this.F = new ArrayList();
   }

   @Override
   public Object[] toArray(Object[] var1) {
      return this.F.toArray(var1);
   }

   @Override
   public boolean containsAll(Collection var1) {
      long var2 = a ^ 25941632064042L;
      return x44.a<"k">(x44.a<"o">(this, -3740925218270988221L, var2), var1, -3561073663622589721L, var2);
   }

   @Override
   public synchronized void clear() {
      long var1 = a ^ 95490077406176L;
      x44.a<"m">(this, -1882556232899817079L, var1).clear();
      this.F.clear();
   }

   @Override
   public int size() {
      return this.F.size();
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.F.size()];
      return this.F.toArray(var1);
   }

   public a3(long var1, a3 var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 52404423748710L;
      this(var3.size(), var4);
      synchronized (var3) {
         x44.a<"k">(this, 2096880778272565583L, var1).addAll(var3);
         this.F.addAll(var3);
      }
   }

   @Override
   public synchronized boolean contains(Object var1) {
      long var2 = a ^ 3358648737669L;
      return x44.a<"h">(this, -3910667364378919444L, var2).contains(var1);
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 15890556761248L;
      return x44.a<"i">(x44.a<"m">(this, -2116821849117157687L, var1), -349695108377527164L, var1);
   }

   @Override
   public synchronized boolean remove(Object var1) {
      long var2 = a ^ 135749977001009L;
      String var10000 = x44.a<"p">(1936990105705317349L, var2);
      boolean var5 = x44.a<"l">(this, 1877715976112565848L, var2).remove(var1);
      String var4 = var10000;

      try {
         if (var4 != null) {
            return var5;
         }

         if (!var5) {
            return var5;
         }
      } catch (IllegalArgumentException var7) {
         throw x44.a<"p">(var7, 234533923717184795L, var2);
      }

      boolean var6 = x44.a<"h">(this.F, var1, 2005095456946402561L, var2);
      return var5;
   }

   @Override
   public boolean addAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/a3.a J
      // 03: ldc2_w 110017843002263
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 3262731779715904579
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: bipush 0
      // 12: istore 5
      // 14: astore 4
      // 16: aload 1
      // 17: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1c: astore 6
      // 1e: aload 6
      // 20: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25: ifeq 81
      // 28: aload 6
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: astore 7
      // 31: aload 0
      // 32: ldc2_w 3290129950528035326
      // 35: lload 2
      // 36: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 7
      // 3d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 42: istore 8
      // 44: iload 8
      // 46: aload 4
      // 48: ifnonnull 83
      // 4b: aload 4
      // 4d: ifnonnull 7b
      // 50: goto 5d
      // 53: ldc2_w 3812055351691037373
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: ifeq 7c
      // 60: goto 6d
      // 63: ldc2_w 3812055351691037373
      // 66: lload 2
      // 67: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: bipush 1
      // 6e: istore 5
      // 70: aload 0
      // 71: getfield com/zelix/a3.F Ljava/util/List;
      // 74: aload 7
      // 76: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7b: pop
      // 7c: aload 4
      // 7e: ifnull 1e
      // 81: iload 5
      // 83: ireturn
   }

   public int d(Object[] param1) {
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
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/a3.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 6031977905117350577
      // 1c: lload 3
      // 1d: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 5
      // 24: aload 0
      // 25: ldc2_w 6006268584131995404
      // 28: lload 3
      // 29: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 2
      // 2f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 34: aload 5
      // 36: ifnonnull 63
      // 39: ifeq 62
      // 3c: goto 49
      // 3f: ldc2_w 5338254930106233935
      // 42: lload 3
      // 43: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: getfield com/zelix/a3.F Ljava/util/List;
      // 4d: aload 2
      // 4e: ldc2_w 5194310905673936946
      // 51: lload 3
      // 52: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: ireturn
      // 58: ldc2_w 5338254930106233935
      // 5b: lload 3
      // 5c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush -1
      // 63: ireturn
   }

   @Override
   public boolean retainAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/a3.a J
      // 03: ldc2_w 52715313177571
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8445312230239464503
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w 8492847973736087946
      // 15: lload 2
      // 16: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 1
      // 1c: ldc2_w 7609245507090131838
      // 1f: lload 2
      // 20: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: astore 4
      // 29: iload 5
      // 2b: aload 4
      // 2d: ifnonnull 5e
      // 30: ifeq 5c
      // 33: goto 40
      // 36: ldc2_w 7823719964436370121
      // 39: lload 2
      // 3a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/a3.F Ljava/util/List;
      // 44: aload 1
      // 45: ldc2_w 8223490473526452525
      // 48: lload 2
      // 49: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: pop
      // 4f: goto 5c
      // 52: ldc2_w 7823719964436370121
      // 55: lload 2
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: iload 5
      // 5e: ireturn
   }

   @Override
   public synchronized Object clone() {
      long var1 = a ^ 101934534082144L;
      long var3 = var1 ^ 70205812617548L;
      return new a3(var3, this);
   }

   @Override
   public boolean removeAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/a3.a J
      // 03: ldc2_w 79584692922422
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4690884759823144990
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w -4753039592709272993
      // 15: lload 2
      // 16: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 1
      // 1c: ldc2_w -4835882153871643601
      // 1f: lload 2
      // 20: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: astore 4
      // 29: iload 5
      // 2b: aload 4
      // 2d: ifnonnull 5e
      // 30: ifeq 5c
      // 33: goto 40
      // 36: ldc2_w -6393413501003409124
      // 39: lload 2
      // 3a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/a3.F Ljava/util/List;
      // 44: aload 1
      // 45: ldc2_w -5158010984086542339
      // 48: lload 2
      // 49: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: pop
      // 4f: goto 5c
      // 52: ldc2_w -6393413501003409124
      // 55: lload 2
      // 56: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: iload 5
      // 5e: ireturn
   }

   static {
      long var0 = a ^ 120981753973539L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u008b²-\u0086\u0002K±\u0086\u0013\fnû\u0087tg\u007f\u0090Êþ\bÚÚ`bÔÂ\u0012i,åKàî-\u0093Y\u008bi3\u0012\u0010³Á\u0019ñ#\u0002SBû\u008d»\ff\u00adÊÊ";
      int var8 = "\u008b²-\u0086\u0002K±\u0086\u0013\fnû\u0087tg\u007f\u0090Êþ\bÚÚ`bÔÂ\u0012i,åKàî-\u0093Y\u008bi3\u0012\u0010³Á\u0019ñ#\u0002SBû\u008d»\ff\u00adÊÊ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12094;
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
            throw new RuntimeException("com/zelix/a3", var10);
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
         throw new RuntimeException("com/zelix/a3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
