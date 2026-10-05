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

public class _ro implements Map {
   private int P;
   private String k;
   private SoftReference a;
   private PrintWriter[] h;
   private static final long b = ess.a(770541933712463817L, 613844272687599372L, MethodHandles.lookup().lookupClass()).a(235265708432029L);
   private static final String c;
   private static final long d;

   private Map V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 128728126847041L;
      x44.a<"m">(this, new Object[]{var4}, 3891321101660151849L, var2);
      Map var6 = (Map)this.a.get();
      if (x44.a<"o">(this, 2885640848399371103L, var2) != null) {
         int var7 = 0;

         try {
            while (var7 < x44.a<"o">(this, 2885640848399371103L, var2).length) {
               x44.a<"o">(this, 2885640848399371103L, var2)[var7].println(x44.a<"o">(this, 3397937570925399266L, var2) + c);
               if (var2 < 0L) {
                  return this;
               }

               x44.a<"k">(x44.a<"o">(this, 2885640848399371103L, var2)[var7], 2983986744932608248L, var2);
               var7++;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, 2890015980568823324L, var2);
         }
      }

      return var6;
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
      // 00: getstatic com/zelix/_ro.b J
      // 03: ldc2_w 118189047813802
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 107881172970386
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -8684121856835084673
      // 14: lload 2
      // 15: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: aload 0
      // 1b: getfield com/zelix/_ro.a Ljava/lang/ref/SoftReference;
      // 1e: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 21: checkcast java/util/Map
      // 24: astore 7
      // 26: astore 6
      // 28: aload 7
      // 2a: aload 6
      // 2c: ifnonnull 67
      // 2f: ifnonnull 65
      // 32: goto 3f
      // 35: ldc2_w -9186724859003441531
      // 38: lload 2
      // 39: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 143
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w -6995475944104480115
      // 52: lload 2
      // 53: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: pop
      // 59: bipush 0
      // 5a: ireturn
      // 5b: ldc2_w -9186724859003441531
      // 5e: lload 2
      // 5f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 7
      // 67: aload 1
      // 68: ldc2_w -8762152374909983767
      // 6b: lload 2
      // 6c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: ireturn
   }

   public _ro(String var1, int var2, long var3) {
      var3 = b ^ var3;
      long var5 = var3 ^ 84457186296817L;
      super();
      x44.a<"p">(this, var2, 5295611202705197439L, var3);
      x44.a<"p">(this, var1, 6095586861229881170L, var3);
      x44.a<"m">(this, new Object[]{var5}, 5598121873809087385L, var3);
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
      // 00: getstatic com/zelix/_ro.b J
      // 03: ldc2_w 125861381056179
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 135344622181259
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 3990985492026699366
      // 14: lload 2
      // 15: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: aload 0
      // 1b: getfield com/zelix/_ro.a Ljava/lang/ref/SoftReference;
      // 1e: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 21: checkcast java/util/Map
      // 24: astore 7
      // 26: astore 6
      // 28: aload 7
      // 2a: aload 6
      // 2c: ifnonnull 67
      // 2f: ifnonnull 65
      // 32: goto 3f
      // 35: ldc2_w 3502440879862832796
      // 38: lload 2
      // 39: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: lload 4
      // 42: bipush 1
      // 43: anewarray 143
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w 3382778051975840404
      // 52: lload 2
      // 53: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: pop
      // 59: bipush 0
      // 5a: ireturn
      // 5b: ldc2_w 3502440879862832796
      // 5e: lload 2
      // 5f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 7
      // 67: aload 1
      // 68: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 6d: ireturn
   }

   @Override
   public synchronized int size() {
      long var1 = b ^ 10216434714506L;
      long var3 = var1 ^ 183345511090L;
      String var10000 = x44.a<"r">(-3000612199503507617L, var1);
      Map var6 = (Map)this.a.get();
      String var5 = var10000;

      try {
         if (var5 != null) {
            return var6.size();
         }

         if (var6 != null) {
            return var6.size();
         }
      } catch (gj var7) {
         throw x44.a<"r">(var7, -3341019605759344731L, var1);
      }

      var6 = x44.a<"l">(this, new Object[]{var3}, -3473557867278310483L, var1);
      return var6.size();
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
      // 00: getstatic com/zelix/_ro.b J
      // 03: ldc2_w 41683345525211
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 48967656731875
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 124338109269698
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w 6344027858382700814
      // 1a: lload 1
      // 1b: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/_ro.a Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w 6914007279564993012
      // 3e: lload 1
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 143
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 4727193178378759676
      // 57: lload 1
      // 58: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 143
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w 5099953655026667274
      // 70: lload 1
      // 71: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w 6881669676194374700
      // 79: lload 1
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w 6914007279564993012
      // 83: lload 1
      // 84: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 91: ldc2_w 5049983110300628024
      // 94: lload 1
      // 95: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/Collection; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
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
      // 00: getstatic com/zelix/_ro.b J
      // 03: ldc2_w 6508005841884
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 13792241542884
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 89162761196741
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w -3887270876399938807
      // 1a: lload 1
      // 1b: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/_ro.a Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w -3606155150079613965
      // 3e: lload 1
      // 3f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 143
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w -3198262566530121733
      // 57: lload 1
      // 58: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 143
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w -3116054614522110707
      // 70: lload 1
      // 71: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w -3636733534099196373
      // 79: lload 1
      // 7a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w -3606155150079613965
      // 83: lload 1
      // 84: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 91: ldc2_w -3636733534099196373
      // 94: lload 1
      // 95: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
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
      // 00: getstatic com/zelix/_ro.b J
      // 03: ldc2_w 123318086899011
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 133351084894331
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 40495822051930
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w 329561536653041046
      // 1a: lload 1
      // 1b: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: getfield com/zelix/_ro.a Ljava/lang/ref/SoftReference;
      // 24: invokevirtual java/lang/ref/SoftReference.get ()Ljava/lang/Object;
      // 27: checkcast java/util/Map
      // 2a: astore 8
      // 2c: astore 7
      // 2e: aload 8
      // 30: aload 7
      // 32: ifnonnull 8c
      // 35: ifnonnull 8a
      // 38: goto 45
      // 3b: ldc2_w 246335943155182956
      // 3e: lload 1
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 3
      // 47: bipush 1
      // 48: anewarray 143
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 2090242967266210148
      // 57: lload 1
      // 58: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: pop
      // 5e: lload 5
      // 60: bipush 1
      // 61: anewarray 143
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w 1900229961538769810
      // 70: lload 1
      // 71: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ldc2_w 223156729866090676
      // 79: lload 1
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: areturn
      // 80: ldc2_w 246335943155182956
      // 83: lload 1
      // 84: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 8
      // 8c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 91: ldc2_w 223156729866090676
      // 94: lload 1
      // 95: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: areturn
   }

   @Override
   public synchronized void putAll(Map var1) {
      long var2 = b ^ 131575764656240L;
      long var4 = var2 ^ 139409747778888L;
      String var10000 = x44.a<"p">(3576370452251224229L, var2);
      Map var7 = (Map)this.a.get();
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
            } catch (gj var8) {
               throw x44.a<"p">(var8, 3915931273190299743L, var2);
            }

            var7 = x44.a<"n">(this, new Object[]{var4}, 2896112964297557079L, var2);
         }

         var9 = var7;
      }

      x44.a<"h">(var9, var1, 3499465779259500468L, var2);
   }

   public _ro(long var1, String var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 24596812594379L;
      this(var3, (int)d, var4);
   }

   @Override
   public synchronized Object remove(Object var1) {
      long var2 = b ^ 61077197385250L;
      long var4 = var2 ^ 69186125517594L;
      String var10000 = x44.a<"r">(-3498799851706633L, var2);
      Map var7 = (Map)this.a.get();
      String var6 = var10000;

      try {
         if (var6 != null) {
            return var7;
         }

         if (var7 != null) {
            return var7.remove(var1);
         }
      } catch (gj var8) {
         throw x44.a<"r">(var8, -573524400515049971L, var2);
      }

      var7 = x44.a<"l">(this, new Object[]{var4}, -1845544269212956155L, var2);
      return var7.remove(var1);
   }

   @Override
   public synchronized boolean isEmpty() {
      long var1 = b ^ 35018088795716L;
      long var3 = var1 ^ 24985074037628L;
      String var10000 = x44.a<"t">(-2335756830410815855L, var1);
      Map var6 = (Map)this.a.get();
      String var5 = var10000;

      try {
         if (var5 != null) {
            return x44.a<"l">(var6, -2354457122273888113L, var1);
         }

         if (var6 != null) {
            return x44.a<"l">(var6, -2354457122273888113L, var1);
         }
      } catch (gj var7) {
         throw x44.a<"t">(var7, -2851826616654285205L, var1);
      }

      var6 = x44.a<"j">(this, new Object[]{var3}, -4177819735056651677L, var1);
      return x44.a<"l">(var6, -2354457122273888113L, var1);
   }

   private void E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 18957019494100L;
      long var6 = var2 ^ 95755051827023L;
      int var10003 = sh.Q(x44.a<"m">(this, 5298397859721415045L, var2), var6);
      Object[] var10006 = new Object[]{null, var4};
      var10006[0] = var10003;
      this.a = new SoftReference<>(x44.a<"q">(var10006, 5248812442401787748L, var2));
   }

   @Override
   public synchronized Object put(Object var1, Object var2) {
      long var3 = b ^ 107827051751583L;
      long var5 = var3 ^ 118135018870183L;
      Map var7 = (Map)this.a.get();
      if (var7 == null) {
         var7 = x44.a<"i">(this, new Object[]{var5}, 6980046014295526584L, var3);
      }

      return var7.put(var1, var2);
   }

   @Override
   public synchronized Object get(Object var1) {
      long var2 = b ^ 99625551056184L;
      long var4 = var2 ^ 92341316415488L;
      Map var6 = (Map)this.a.get();
      if (var6 == null) {
         var6 = x44.a<"n">(this, new Object[]{var4}, 5006070207882357023L, var2);
      }

      return var6.get(var1);
   }

   @Override
   public synchronized void clear() {
      long var1 = b ^ 131880926134484L;
      long var3 = var1 ^ 139165145071084L;
      String var10000 = x44.a<"t">(-3385069053821007871L, var1);
      Map var6 = (Map)this.a.get();
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
            } catch (gj var7) {
               throw x44.a<"t">(var7, -2955435690584819461L, var1);
            }

            var6 = x44.a<"j">(this, new Object[]{var3}, -3993268732827015949L, var1);
         }

         var8 = var6;
      }

      var8.clear();
   }

   static {
      long var5 = b ^ 129493454581313L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal(
         "\u0080ª6\u008fOC¾V-\u0088Û\u008d\u0005$å\u009biA'N\u008dÂ.\u0096ßÄQ\u008f8Ä\u008a\u001dð\u0081\u0097nvÇWo".getBytes("ISO-8859-1")
      );
      String var12 = a(var9).intern();
      byte var10001 = -1;
      c = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -4105796126809523628L;
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
      d = var14;
   }

   private static gj a(gj var0) {
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
