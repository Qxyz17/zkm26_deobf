package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _zq implements Map {
   private boolean R;
   private Map E;
   private static final long a = ess.a(8647650942935634721L, -7781867422005978262L, MethodHandles.lookup().lookupClass()).a(149814627179791L);
   private static final long b;

   @Override
   public final Object get(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 6132242244488
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8877062475305935413
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: aload 4
      // 16: ifnonnull 4e
      // 19: ldc2_w 7417128081577223729
      // 1c: lload 2
      // 1d: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: ifeq 3e
      // 25: goto 32
      // 28: ldc2_w 9171342274271154732
      // 2b: lload 2
      // 2c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: ldc2_w 9171342274271154732
      // 37: lload 2
      // 38: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w 7327983224101093264
      // 42: lload 2
      // 43: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 1
      // 49: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4e: areturn
   }

   @Override
   public Object put(Object param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 29449767193317
      // 06: lxor
      // 07: lstore 3
      // 08: ldc2_w 1323132582882708312
      // 0b: lload 3
      // 0c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 5
      // 13: aload 0
      // 14: aload 5
      // 16: ifnonnull 4f
      // 19: ldc2_w 1118003120967470940
      // 1c: lload 3
      // 1d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: ifeq 3e
      // 25: goto 32
      // 28: ldc2_w 1597151071200082753
      // 2b: lload 3
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: ldc2_w 1597151071200082753
      // 37: lload 3
      // 38: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w 927502593274828541
      // 42: lload 3
      // 43: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 1
      // 49: aload 2
      // 4a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4f: areturn
   }

   public _zq(char param1, int param2, short param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic com/zelix/_zq.a J
      // 1a: lxor
      // 1b: lstore 5
      // 1d: lload 5
      // 1f: dup2
      // 20: ldc2_w 105596719458591
      // 23: lxor
      // 24: lstore 7
      // 26: pop2
      // 27: ldc2_w 820687662468960871
      // 2a: lload 5
      // 2c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: aload 0
      // 32: invokespecial java/lang/Object.<init> ()V
      // 35: astore 9
      // 37: aload 0
      // 38: iload 4
      // 3a: aload 9
      // 3c: ifnonnull 6f
      // 3f: ldc2_w 1638444863272867427
      // 42: lload 5
      // 44: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: iload 4
      // 4b: ifne 9a
      // 4e: goto 5c
      // 51: ldc2_w 1086816021001134718
      // 54: lload 5
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: getstatic com/zelix/_zq.b J
      // 60: l2i
      // 61: goto 6f
      // 64: ldc2_w 1086816021001134718
      // 67: lload 5
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: lload 7
      // 71: bipush 2
      // 72: anewarray 79
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 1
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x1
      // 7f: swap
      // 80: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w 1665476633250238639
      // 89: lload 5
      // 8b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: ldc2_w 1576325529162502082
      // 93: lload 5
      // 95: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: return
   }

   @Override
   public Set keySet() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 49829351847717
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 8042445472524236440
      // 0b: lload 1
      // 0c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: aload 3
      // 14: ifnonnull 4e
      // 17: ldc2_w 8233642742080746140
      // 1a: lload 1
      // 1b: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: ifeq 44
      // 23: goto 30
      // 26: ldc2_w 7776045259766269569
      // 29: lload 1
      // 2a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: ldc2_w 7720242827124846182
      // 33: lload 1
      // 34: invokedynamic u (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: areturn
      // 3a: ldc2_w 7776045259766269569
      // 3d: lload 1
      // 3e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w 8151252717455485757
      // 48: lload 1
      // 49: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 53: areturn
   }

   @Override
   public void putAll(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 41928479845893
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 3944180171891027896
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: aload 4
      // 16: ifnonnull 49
      // 19: ldc2_w 3126567969191586748
      // 1c: lload 2
      // 1d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: ifne 53
      // 25: goto 32
      // 28: ldc2_w 3659742616893775777
      // 2b: lload 2
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aload 0
      // 33: ldc2_w 2900065664178483741
      // 36: lload 2
      // 37: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: goto 49
      // 3f: ldc2_w 3659742616893775777
      // 42: lload 2
      // 43: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 1
      // 4a: ldc2_w 4003069600155754665
      // 4d: lload 2
      // 4e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: return
   }

   @Override
   public final synchronized Collection values() {
      long var1 = a ^ 137984521756949L;
      String var3 = x44.a<"u">(-455758955101626200L, var1);

      try {
         if (x44.a<"i">(this, -1985077682223340372L, var1)) {
            return x44.a<"u">(-367479209333076125L, var1);
         }
      } catch (gj var7) {
         throw x44.a<"u">(var7, -154705855285227343L, var1);
      }

      ArrayList var4 = new ArrayList(x44.a<"i">(this, -1788139033001935603L, var1).size());
      Iterator var5 = x44.a<"i">(this, -1788139033001935603L, var1).entrySet().iterator();

      ArrayList var10000;
      while (true) {
         if (var5.hasNext()) {
            try {
               var10000 = var4;
               if (var3 != null) {
                  break;
               }

               var4.add(((Entry)var5.next()).getValue());
               if (var3 == null) {
                  continue;
               }
            } catch (gj var6) {
               throw x44.a<"u">(var6, -154705855285227343L, var1);
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   @Override
   public void clear() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 59724526980730
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -7583047423276707897
      // 0b: lload 1
      // 0c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: aload 3
      // 14: ifnonnull 47
      // 17: ldc2_w -8422613716044493885
      // 1a: lload 1
      // 1b: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: ifne 4c
      // 23: goto 30
      // 26: ldc2_w -7875365324070223906
      // 29: lload 1
      // 2a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: ldc2_w -8628885716078112158
      // 34: lload 1
      // 35: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: goto 47
      // 3d: ldc2_w -7875365324070223906
      // 40: lload 1
      // 41: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: invokeinterface java/util/Map.clear ()V 1
      // 4c: return
   }

   @Override
   public final int size() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 95660028284202
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -3056822805353935721
      // 0b: lload 1
      // 0c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: ldc2_w -4013626313211148141
      // 16: lload 1
      // 17: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 3
      // 1d: ifnonnull 4b
      // 20: ifeq 3c
      // 23: goto 30
      // 26: ldc2_w -3322119786985735026
      // 29: lload 1
      // 2a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
      // 32: ldc2_w -3322119786985735026
      // 35: lload 1
      // 36: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -3814430714522332878
      // 40: lload 1
      // 41: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: invokeinterface java/util/Map.size ()I 1
      // 4b: ireturn
   }

   @Override
   public final boolean isEmpty() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 103964144119937
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -6325039233271549636
      // 0b: lload 1
      // 0c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: ldc2_w -5339099080670579400
      // 16: lload 1
      // 17: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 3
      // 1d: ifnonnull 4f
      // 20: ifeq 3c
      // 23: goto 30
      // 26: ldc2_w -6030746334719688411
      // 29: lload 1
      // 2a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: bipush 1
      // 31: ireturn
      // 32: ldc2_w -6030746334719688411
      // 35: lload 1
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -5279517324906402663
      // 40: lload 1
      // 41: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: ldc2_w -6269570997697736926
      // 49: lload 1
      // 4a: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ireturn
   }

   @Override
   public final boolean containsValue(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 99800181207834
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -1467058441967570265
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -685477441736821085
      // 17: lload 2
      // 18: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 52
      // 22: ifeq 3e
      // 25: goto 32
      // 28: ldc2_w -1164892559068953922
      // 2b: lload 2
      // 2c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: ldc2_w -1164892559068953922
      // 37: lload 2
      // 38: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w -783513370864734462
      // 42: lload 2
      // 43: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 1
      // 49: ldc2_w -1531593416900718799
      // 4c: lload 2
      // 4d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: ireturn
   }

   public _zq(_zq param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 52871764973284
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -698178589308424373
      // 12: lload 2
      // 13: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: invokespecial java/lang/Object.<init> ()V
      // 1c: astore 6
      // 1e: aload 0
      // 1f: aload 1
      // 20: ldc2_w -1472442070423590065
      // 23: lload 2
      // 24: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: ldc2_w -1472442070423590065
      // 2c: lload 2
      // 2d: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: aload 6
      // 35: ifnonnull 5f
      // 38: ldc2_w -1472442070423590065
      // 3b: lload 2
      // 3c: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: ifne 86
      // 44: goto 51
      // 47: ldc2_w -992731213187309742
      // 4a: lload 2
      // 4b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: goto 5f
      // 55: ldc2_w -992731213187309742
      // 58: lload 2
      // 59: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 1
      // 60: lload 4
      // 62: bipush 2
      // 63: anewarray 79
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 1
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: ldc2_w -944382874105652113
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: ldc2_w -1671958172457061650
      // 80: lload 2
      // 81: invokedynamic u (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: return
   }

   @Override
   public Set entrySet() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 80328429253820
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 3172194214686242049
      // 0b: lload 1
      // 0c: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: aload 3
      // 14: ifnonnull 4e
      // 17: ldc2_w 3592361964365377797
      // 1a: lload 1
      // 1b: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: ifeq 44
      // 23: goto 30
      // 26: ldc2_w 2914791760890152216
      // 29: lload 1
      // 2a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: ldc2_w 2934846869876370943
      // 33: lload 1
      // 34: invokedynamic t (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: areturn
      // 3a: ldc2_w 2914791760890152216
      // 3d: lload 1
      // 3e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w 3640726506729269412
      // 48: lload 1
      // 49: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 53: areturn
   }

   @Override
   public final boolean containsKey(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 18236580175588
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -8764642264393474215
      // 0b: lload 2
      // 0c: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -7240948498114225315
      // 17: lload 2
      // 18: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 4e
      // 22: ifeq 3e
      // 25: goto 32
      // 28: ldc2_w -9067098237981659328
      // 2b: lload 2
      // 2c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: ldc2_w -9067098237981659328
      // 37: lload 2
      // 38: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w -7431452929863859460
      // 42: lload 2
      // 43: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 1
      // 49: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 4e: ireturn
   }

   public boolean G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 3980246672895408099L, var2);
   }

   @Override
   public Object remove(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zq.a J
      // 03: ldc2_w 122823853233221
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -3675848314068806152
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: aload 4
      // 16: ifnonnull 4e
      // 19: ldc2_w -3376709508741557764
      // 1c: lload 2
      // 1d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: ifeq 3e
      // 25: goto 32
      // 28: ldc2_w -3996296979409918495
      // 2b: lload 2
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: ldc2_w -3996296979409918495
      // 37: lload 2
      // 38: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w -3278809867281004451
      // 42: lload 2
      // 43: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 1
      // 49: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4e: areturn
   }

   static {
      long var0 = a ^ 56984132203070L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -8814604605861113458L;
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

   private static gj a(gj var0) {
      return var0;
   }
}
