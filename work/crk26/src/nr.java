package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nr implements Map {
   private SoftReference U;
   private PrintWriter[] N;
   private int B;
   private String J;
   private static final long a = prr.a(1801558322325492046L, -7845138549360953863L, MethodHandles.lookup().lookupClass()).a(221061677227859L);
   private static final String b;
   private static final long c;

   @Override
   public synchronized Object put(Object var1, Object var2) {
      long var3 = a ^ 1032195566296L;
      long var5 = var3 ^ 24054413796967L;
      Map var7 = (Map)this.U.get();
      if (var7 == null) {
         var7 = m44.a<"k">(this, new Object[]{var5}, 7507969734897916167L, var3);
      }

      return var7.put(var1, var2);
   }

   @Override
   public synchronized int size() {
      long var1 = a ^ 73395026153376L;
      long var3 = var1 ^ 96552292582175L;
      String var10000 = m44.a<"j">(5655415627130294346L, var1);
      Map var6 = (Map)this.U.get();
      String var5 = var10000;

      try {
         if (var5 != null) {
            return var6.size();
         }

         if (var6 != null) {
            return var6.size();
         }
      } catch (n9 var7) {
         throw m44.a<"j">(var7, 5762864954311978989L, var1);
      }

      var6 = m44.a<"k">(this, new Object[]{var3}, 5569238055625784447L, var1);
      return var6.size();
   }

   public nr(short var1, String var2, int var3, long var4) {
      long var6 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ a;
      long var8 = var6 ^ 14678890976368L;
      super();
      m44.a<"s">(this, var3, 921342104477537834L, var6);
      m44.a<"s">(this, var2, 847535555625017921L, var6);
      m44.a<"n">(this, new Object[]{var8}, 1488974846328242441L, var6);
   }

   @Override
   public synchronized boolean containsValue(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/nr.a J
      // 03: ldc2_w 125433704018346
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 113266981518613
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -1119669692590199232
      // 14: lload 2
      // 15: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: aload 0
      // 1b: getfield com/zelix/nr.U Ljava/lang/ref/SoftReference;
      // 1e: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 21: checkcast java/util/Map
      // 24: astore 7
      // 26: astore 6
      // 28: aload 7
      // 2a: aload 6
      // 2c: ifnonnull 67
      // 2f: ifnonnull 65
      // 32: goto 3f
      // 35: ldc2_w -1012184081590873625
      // 38: lload 2
      // 39: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 15
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w -917652037523357067
      // 52: lload 2
      // 53: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: pop
      // 59: bipush 0
      // 5a: ireturn
      // 5b: ldc2_w -1012184081590873625
      // 5e: lload 2
      // 5f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 7
      // 67: aload 1
      // 68: ldc2_w -1536233427804153307
      // 6b: lload 2
      // 6c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: ireturn
   }

   @Override
   public synchronized Set entrySet() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/nr.a J
      // 03: ldc2_w 17128288134132
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 29150830915403
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 55577766728145
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w -6762049424924689378
      // 1a: lload 1
      // 1b: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/nr.U Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w -6652517622721952839
      // 3e: lload 1
      // 3f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 15
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w -6837126336728231893
      // 57: lload 1
      // 58: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 15
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w -4758623211676515210
      // 70: lload 1
      // 71: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w -6346290266823461439
      // 79: lload 1
      // 7a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w -6652517622721952839
      // 83: lload 1
      // 84: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 91: ldc2_w -6346290266823461439
      // 94: lload 1
      // 95: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
   }

   @Override
   public synchronized Collection values() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/nr.a J
      // 03: ldc2_w 10336927769810
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 31293291374701
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 57694436513527
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w 7281855687730494264
      // 1a: lload 1
      // 1b: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/nr.U Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w 7245030122771580063
      // 3e: lload 1
      // 3f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 15
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 7366661005469243149
      // 57: lload 1
      // 58: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 15
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w 8850698701777666896
      // 70: lload 1
      // 71: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w 6974796357963363047
      // 79: lload 1
      // 7a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w 7245030122771580063
      // 83: lload 1
      // 84: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 91: ldc2_w 9032737011916696345
      // 94: lload 1
      // 95: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Collection; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
   }

   @Override
   public synchronized void putAll(Map var1) {
      long var2 = a ^ 112503996968458L;
      long var4 = var2 ^ 126730151535285L;
      String var10000 = m44.a<"h">(8058688087397200352L, var2);
      Map var7 = (Map)this.U.get();
      String var6 = var10000;

      label21: {
         label20: {
            try {
               var9 = var7;
               if (var6 != null) {
                  break label21;
               }

               if (var7 != null) {
                  break label20;
               }
            } catch (n9 var8) {
               throw m44.a<"h">(var8, 7949956935881592391L, var2);
            }

            var7 = m44.a<"i">(this, new Object[]{var4}, 7846339361470242261L, var2);
         }

         var9 = var7;
      }

      m44.a<"w">(var9, var1, 7735145002870179615L, var2);
   }

   public nr(String var1, long var2) {
      var2 = a ^ var2;
      int var4 = (int)((var2 ^ 100863032871015L) >>> 48);
      long var5 = (var2 ^ 100863032871015L) << 16 >>> 16;
      this((short)var4, var1, (int)c, var5);
   }

   @Override
   public synchronized boolean isEmpty() {
      long var1 = a ^ 131540536627863L;
      long var3 = var1 ^ 108518314729000L;
      String var10000 = m44.a<"m">(-7833123220792767107L, var1);
      Map var6 = (Map)this.U.get();
      String var5 = var10000;

      try {
         if (var5 != null) {
            return m44.a<"r">(var6, -8013781475703638904L, var1);
         }

         if (var6 != null) {
            return m44.a<"r">(var6, -8013781475703638904L, var1);
         }
      } catch (n9 var7) {
         throw m44.a<"m">(var7, -7868076317515451686L, var1);
      }

      var6 = m44.a<"l">(this, new Object[]{var3}, -8034740717858676408L, var1);
      return m44.a<"r">(var6, -8013781475703638904L, var1);
   }

   @Override
   public synchronized Object get(Object var1) {
      long var2 = a ^ 62941734845170L;
      long var4 = var2 ^ 48576261748301L;
      Map var6 = (Map)this.U.get();
      if (var6 == null) {
         var6 = m44.a<"i">(this, new Object[]{var4}, 4042987266193230125L, var2);
      }

      return var6.get(var1);
   }

   @Override
   public synchronized void clear() {
      long var1 = a ^ 44619002660617L;
      long var3 = var1 ^ 67638799731638L;
      String var10000 = m44.a<"k">(-4119253412100384541L, var1);
      Map var6 = (Map)this.U.get();
      String var5 = var10000;

      label21: {
         label20: {
            try {
               var8 = var6;
               if (var5 != null) {
                  break label21;
               }

               if (var6 != null) {
                  break label20;
               }
            } catch (n9 var7) {
               throw m44.a<"k">(var7, -4084582958652217532L, var1);
            }

            var6 = m44.a<"j">(this, new Object[]{var3}, -4188203801836849962L, var1);
         }

         var8 = var6;
      }

      var8.clear();
   }

   @Override
   public synchronized Set keySet() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/nr.a J
      // 03: ldc2_w 108509577834144
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 131531556987423
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 105207679409285
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w 8033351894827692362
      // 1a: lload 1
      // 1b: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/nr.U Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w 7996685758988619501
      // 3e: lload 1
      // 3f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 15
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 7802988770592578943
      // 57: lload 1
      // 58: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 15
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w 8115931028096747810
      // 70: lload 1
      // 71: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w 7690212490426661013
      // 79: lload 1
      // 7a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w 7996685758988619501
      // 83: lload 1
      // 84: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 91: ldc2_w 7690212490426661013
      // 94: lload 1
      // 95: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
   }

   @Override
   public synchronized Object remove(Object var1) {
      long var2 = a ^ 57170742115714L;
      long var4 = var2 ^ 42811439853885L;
      String var10000 = m44.a<"h">(8961709929467175528L, var2);
      Map var7 = (Map)this.U.get();
      String var6 = var10000;

      try {
         if (var6 != null) {
            return var7;
         }

         if (var7 != null) {
            return var7.remove(var1);
         }
      } catch (n9 var8) {
         throw m44.a<"h">(var8, 9069051298348801487L, var2);
      }

      var7 = m44.a<"i">(this, new Object[]{var4}, 9181601309375680093L, var2);
      return var7.remove(var1);
   }

   private Map B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 115221229420799L;
      m44.a<"i">(this, new Object[]{var4}, 4622526281278641542L, var2);
      Map var6 = (Map)this.U.get();
      if (m44.a<"v">(this, 5104145023441450881L, var2) != null) {
         int var7 = 0;

         try {
            while (var7 < m44.a<"v">(this, 5104145023441450881L, var2).length) {
               m44.a<"v">(this, 5104145023441450881L, var2)[var7].println(m44.a<"v">(this, 6866978475189515982L, var2) + b);
               if (var2 <= 0L) {
                  return this;
               }

               m44.a<"w">(m44.a<"v">(this, 5104145023441450881L, var2)[var7], 6725401615005913528L, var2);
               var7++;
            }
         } catch (n9 var8) {
            throw m44.a<"h">(var8, 4862738449889764207L, var2);
         }
      }

      return var6;
   }

   private void H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 80338190895936L;
      long var10001 = var2 ^ 15364128302240L;
      int var6 = (int)((var2 ^ 15364128302240L) >>> 32);
      int var7 = (int)((var2 ^ 15364128302240L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      int var10003 = cf.x(m44.a<"t">(this, 1667524512233655751L, var2), var6, (char)var7, (short)var8);
      Object[] var10006 = new Object[]{null, var4};
      var10006[0] = var10003;
      this.U = new SoftReference<>(m44.a<"j">(var10006, 1117179924398705249L, var2));
   }

   @Override
   public synchronized boolean containsKey(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/nr.a J
      // 03: ldc2_w 45000755581853
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 68158033583906
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 1315465201372367991
      // 14: lload 2
      // 15: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: aload 0
      // 1b: getfield com/zelix/nr.U Ljava/lang/ref/SoftReference;
      // 1e: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 21: checkcast java/util/Map
      // 24: astore 7
      // 26: astore 6
      // 28: aload 7
      // 2a: aload 6
      // 2c: ifnonnull 67
      // 2f: ifnonnull 65
      // 32: goto 3f
      // 35: ldc2_w 1424444842513757136
      // 38: lload 2
      // 39: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 15
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w 1257773872083771458
      // 52: lload 2
      // 53: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: pop
      // 59: bipush 0
      // 5a: ireturn
      // 5b: ldc2_w 1424444842513757136
      // 5e: lload 2
      // 5f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 7
      // 67: aload 1
      // 68: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 6d: ireturn
   }

   static {
      long var5 = a ^ 126949323301035L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("Á+ÞT,¨ØåÃI&ö_\t\f¶\u0002h\u008bôÖc1à\u008a0ÔÍ\"¨òD`ÞnKÿIs^".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -8725069770927305046L;
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
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      c = var14;
   }

   private static n9 a(n9 var0) {
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
}
