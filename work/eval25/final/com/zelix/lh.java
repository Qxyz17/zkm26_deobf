package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lh implements Collection {
   Map t;
   private static final long a = ess.a(4073927118871248559L, -7737585918310455996L, MethodHandles.lookup().lookupClass()).a(157683497345339L);
   private static final long b;

   @Override
   public void clear() {
      this.t.clear();
   }

   @Override
   public synchronized Object clone() {
      long var1 = a ^ 36984748671092L;
      long var3 = var1 ^ 100475431643137L;
      long var5 = var1 ^ 130873847839258L;
      long var7 = var1 ^ 108044991135635L;
      String var10000 = x44.a<"v">(5917673882235259675L, var1);
      lh var10 = new lh(var5, this.t.size());
      String var9 = var10000;
      Iterator var11 = this.t.entrySet().iterator();

      while (true) {
         if (var11.hasNext()) {
            Entry var12 = (Entry)var11.next();
            wp var13 = (wp)var12.getValue();

            try {
               var15 = var10;
               if (var9 != null) {
                  break;
               }

               Object var10001 = var12.getKey();
               Object[] var10005 = new Object[]{null, null, var13.C(var7)};
               var10005[1] = var3;
               var10005[0] = var10001;
               x44.a<"n">(var10, var10005, 5754700034385301044L, var1);
               if (var9 == null) {
                  continue;
               }
            } catch (gj var14) {
               throw x44.a<"v">(var14, 5430912309392982535L, var1);
            }
         }

         var15 = var10;
         break;
      }

      return var15;
   }

   public int o(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/lh.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 109656016337044
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 1520190229150632988
      // 26: lload 2
      // 27: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: getfield com/zelix/lh.t Ljava/util/Map;
      // 30: aload 4
      // 32: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 37: checkcast com/zelix/wp
      // 3a: astore 8
      // 3c: astore 7
      // 3e: aload 8
      // 40: aload 7
      // 42: ifnonnull 63
      // 45: ifnonnull 61
      // 48: goto 55
      // 4b: ldc2_w 889874376988296448
      // 4e: lload 2
      // 4f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: ldc2_w 889874376988296448
      // 5a: lload 2
      // 5b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 8
      // 63: lload 5
      // 65: invokevirtual com/zelix/wp.C (J)I
      // 68: ireturn
   }

   @Override
   public synchronized boolean removeAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lh.a J
      // 03: ldc2_w 35732669700101
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 5363449427499832170
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: getfield com/zelix/lh.t Ljava/util/Map;
      // 15: invokeinterface java/util/Map.size ()I 1
      // 1a: istore 5
      // 1c: aload 1
      // 1d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 22: astore 6
      // 24: astore 4
      // 26: aload 6
      // 28: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d: ifeq 58
      // 30: aload 0
      // 31: getfield com/zelix/lh.t Ljava/util/Map;
      // 34: aload 6
      // 36: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 40: pop
      // 41: aload 4
      // 43: ifnonnull 89
      // 46: aload 4
      // 48: ifnull 26
      // 4b: goto 58
      // 4e: ldc2_w 5994141725477657206
      // 51: lload 2
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: iload 5
      // 5a: aload 4
      // 5c: ifnonnull 86
      // 5f: aload 0
      // 60: getfield com/zelix/lh.t Ljava/util/Map;
      // 63: invokeinterface java/util/Map.size ()I 1
      // 68: if_icmpeq 89
      // 6b: goto 78
      // 6e: ldc2_w 5994141725477657206
      // 71: lload 2
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: bipush 1
      // 79: goto 86
      // 7c: ldc2_w 5994141725477657206
      // 7f: lload 2
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: goto 8a
      // 89: bipush 0
      // 8a: ireturn
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 11941843105339L;
      String var3 = x44.a<"q">(2616844776584199508L, var1);

      try {
         int var10000 = this.t.size();
         if (var3 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, 4400389054386156616L, var1);
      }

      return (boolean)0;
   }

   @Override
   public boolean contains(Object var1) {
      return this.t.containsKey(var1);
   }

   @Override
   public synchronized boolean remove(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lh.a J
      // 03: ldc2_w 76154453207232
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 7301826074407
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 8839345519736284079
      // 14: lload 2
      // 15: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: aload 0
      // 1b: getfield com/zelix/lh.t Ljava/util/Map;
      // 1e: aload 1
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast com/zelix/wp
      // 27: astore 7
      // 29: astore 6
      // 2b: aload 7
      // 2d: aload 6
      // 2f: ifnonnull 44
      // 32: ifnull 9b
      // 35: goto 42
      // 38: ldc2_w 7199598946011146931
      // 3b: lload 2
      // 3c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 7
      // 44: lload 4
      // 46: invokevirtual com/zelix/wp.C (J)I
      // 49: aload 6
      // 4b: ifnonnull 98
      // 4e: bipush 1
      // 4f: if_icmpne 7c
      // 52: goto 5f
      // 55: ldc2_w 7199598946011146931
      // 58: lload 2
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/zelix/lh.t Ljava/util/Map;
      // 63: aload 1
      // 64: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 69: pop
      // 6a: aload 6
      // 6c: ifnull 99
      // 6f: goto 7c
      // 72: ldc2_w 7199598946011146931
      // 75: lload 2
      // 76: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 7
      // 7e: bipush 0
      // 7f: anewarray 6
      // 82: ldc2_w 7386466447832274021
      // 85: lload 2
      // 86: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: goto 98
      // 8e: ldc2_w 7199598946011146931
      // 91: lload 2
      // 92: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: pop
      // 99: bipush 1
      // 9a: ireturn
      // 9b: bipush 0
      // 9c: ireturn
   }

   @Override
   public synchronized boolean retainAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lh.a J
      // 03: ldc2_w 123804669028670
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield com/zelix/lh.t Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.size ()I 1
      // 11: istore 5
      // 13: ldc2_w 8887181170809397841
      // 16: lload 2
      // 17: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 0
      // 1d: getfield com/zelix/lh.t Ljava/util/Map;
      // 20: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 25: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2a: astore 6
      // 2c: astore 4
      // 2e: aload 6
      // 30: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 35: ifeq 7b
      // 38: aload 6
      // 3a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3f: astore 7
      // 41: aload 1
      // 42: aload 7
      // 44: ldc2_w 8665321089432333010
      // 47: lload 2
      // 48: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: aload 4
      // 4f: ifnonnull 7d
      // 52: ifne 76
      // 55: goto 62
      // 58: ldc2_w 7067318529815833421
      // 5b: lload 2
      // 5c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 6
      // 64: invokeinterface java/util/Iterator.remove ()V 1
      // 69: goto 76
      // 6c: ldc2_w 7067318529815833421
      // 6f: lload 2
      // 70: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 4
      // 78: ifnull 2e
      // 7b: iload 5
      // 7d: aload 4
      // 7f: ifnonnull a9
      // 82: aload 0
      // 83: getfield com/zelix/lh.t Ljava/util/Map;
      // 86: invokeinterface java/util/Map.size ()I 1
      // 8b: if_icmpeq ac
      // 8e: goto 9b
      // 91: ldc2_w 7067318529815833421
      // 94: lload 2
      // 95: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: bipush 1
      // 9c: goto a9
      // 9f: ldc2_w 7067318529815833421
      // a2: lload 2
      // a3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: goto ad
      // ac: bipush 0
      // ad: ireturn
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 16169333504401L;
      String var10000 = x44.a<"s">(-1442592114447551746L, var1);
      Object[] var4 = new Object[this.t.size()];
      int var5 = 0;
      String var3 = var10000;
      Iterator var6 = this.t.keySet().iterator();

      while (true) {
         if (var6.hasNext()) {
            try {
               var10000 = var4;
               if (var3 != null) {
                  break;
               }

               var4[var5++] = var6.next();
               if (var3 == null) {
                  continue;
               }
            } catch (gj var7) {
               throw x44.a<"s">(var7, -956074911287870494L, var1);
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public synchronized boolean add(Object var1) {
      long var2 = a ^ 67533132661699L;
      long var4 = var2 ^ 101879670885256L;
      String var10000 = x44.a<"q">(-3339188492380813140L, var2);
      wp var7 = (wp)this.t.get(var1);
      String var6 = var10000;

      label46: {
         label41: {
            try {
               var11 = var7;
               if (var6 != null) {
                  break label46;
               }

               if (var7 != null) {
                  break label41;
               }
            } catch (gj var10) {
               throw x44.a<"q">(var10, -3969530337687060048L, var2);
            }

            var7 = new wp(1);

            try {
               this.t.put(var1, var7);
               if (var6 == null) {
                  return true;
               }
            } catch (gj var9) {
               boolean var10001 = false;
               throw x44.a<"q">(var9, -3969530337687060048L, var2);
            }
         }

         try {
            var11 = var7;
         } catch (gj var8) {
            boolean var13 = false;
            throw x44.a<"q">(var8, -3969530337687060048L, var2);
         }
      }

      var11.l(var4);
      return true;
   }

   public lh(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 103512824120251L;
      this(var3, (int)b);
   }

   public synchronized void p(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 4
      // 1e: pop
      // 1f: getstatic com/zelix/lh.a J
      // 22: lload 2
      // 23: lxor
      // 24: lstore 2
      // 25: ldc2_w -382829201891990613
      // 28: lload 2
      // 29: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 0
      // 2f: getfield com/zelix/lh.t Ljava/util/Map;
      // 32: aload 5
      // 34: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 39: checkcast com/zelix/wp
      // 3c: astore 7
      // 3e: astore 6
      // 40: aload 7
      // 42: aload 6
      // 44: ifnonnull 8d
      // 47: ifnonnull 7e
      // 4a: goto 57
      // 4d: ldc2_w -2022575635494081865
      // 50: lload 2
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/zelix/lh.t Ljava/util/Map;
      // 5b: aload 5
      // 5d: new com/zelix/wp
      // 60: dup
      // 61: iload 4
      // 63: invokespecial com/zelix/wp.<init> (I)V
      // 66: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6b: pop
      // 6c: aload 6
      // 6e: ifnull 92
      // 71: goto 7e
      // 74: ldc2_w -2022575635494081865
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 7
      // 80: goto 8d
      // 83: ldc2_w -2022575635494081865
      // 86: lload 2
      // 87: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: iload 4
      // 8f: invokevirtual com/zelix/wp.V (I)V
      // 92: return
   }

   @Override
   public Object[] toArray(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lh.a J
      // 03: ldc2_w 110664848091562
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8917558339119243973
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: arraylength
      // 15: aload 4
      // 17: ifnonnull 4e
      // 1a: aload 0
      // 1b: getfield com/zelix/lh.t Ljava/util/Map;
      // 1e: invokeinterface java/util/Map.size ()I 1
      // 23: if_icmpge 4d
      // 26: goto 33
      // 29: ldc2_w 7097740072670292953
      // 2c: lload 2
      // 2d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 37: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 3a: aload 0
      // 3b: getfield com/zelix/lh.t Ljava/util/Map;
      // 3e: invokeinterface java/util/Map.size ()I 1
      // 43: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 46: checkcast [Ljava/lang/Object;
      // 49: checkcast [Ljava/lang/Object;
      // 4c: astore 1
      // 4d: bipush 0
      // 4e: istore 5
      // 50: aload 0
      // 51: getfield com/zelix/lh.t Ljava/util/Map;
      // 54: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 59: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5e: astore 6
      // 60: aload 6
      // 62: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 67: ifeq 8f
      // 6a: aload 1
      // 6b: iload 5
      // 6d: iinc 5 1
      // 70: aload 6
      // 72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 77: aastore
      // 78: aload 4
      // 7a: ifnonnull c8
      // 7d: aload 4
      // 7f: ifnull 60
      // 82: goto 8f
      // 85: ldc2_w 7097740072670292953
      // 88: lload 2
      // 89: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 1
      // 90: aload 4
      // 92: ifnonnull c9
      // 95: arraylength
      // 96: aload 0
      // 97: getfield com/zelix/lh.t Ljava/util/Map;
      // 9a: invokeinterface java/util/Map.size ()I 1
      // 9f: if_icmple c8
      // a2: goto af
      // a5: ldc2_w 7097740072670292953
      // a8: lload 2
      // a9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: athrow
      // af: aload 1
      // b0: aload 0
      // b1: getfield com/zelix/lh.t Ljava/util/Map;
      // b4: invokeinterface java/util/Map.size ()I 1
      // b9: aconst_null
      // ba: aastore
      // bb: goto c8
      // be: ldc2_w 7097740072670292953
      // c1: lload 2
      // c2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 1
      // c9: areturn
   }

   @Override
   public boolean containsAll(Collection var1) {
      long var2 = a ^ 55666728787816L;
      String var10000 = x44.a<"r">(-8285534758483815417L, var2);
      Iterator var5 = var1.iterator();
      String var4 = var10000;

      while (var5.hasNext()) {
         boolean var6 = this.t.containsKey(var5.next());

         while (!var6) {
            var6 = false;
            if (var4 == null) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public int size() {
      return this.t.size();
   }

   @Override
   public synchronized boolean addAll(Collection var1) {
      long var2 = a ^ 45137428302113L;
      String var10000 = x44.a<"s">(-7256770538678091186L, var2);
      Iterator var5 = var1.iterator();
      String var4 = var10000;

      while (true) {
         if (var5.hasNext()) {
            try {
               var7 = x44.a<"k">(this, var5.next(), -8795976891668945268L, var2);
               if (var4 != null) {
                  break;
               }

               if (var4 == null) {
                  continue;
               }
            } catch (gj var6) {
               throw x44.a<"s">(var6, -9076036006347175086L, var2);
            }
         }

         var7 = true;
         break;
      }

      return var7;
   }

   @Override
   public synchronized Iterator iterator() {
      return this.t.keySet().iterator();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized List j(Object[] var1) {
      byte var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 62516237210031L;
      String var10000 = x44.a<"r">(4333473934586488103L, var3);
      int var8 = this.t.size();
      eb[] var9 = new eb[var8];
      int var10 = 0;
      String var7 = var10000;

      label135: {
         label134:
         for (Object var12 : this.t.keySet()) {
            wp var13 = (wp)this.t.get(var12);

            try {
               var9[var10++] = new eb(var13.C(var5), var12);
            } catch (gj var21) {
               boolean var10001 = false;
               throw x44.a<"r">(var21, 2693754452458220603L, var3);
            }

            while (true) {
               try {
                  var10000 = var7;
                  if (var3 >= 0L) {
                     if (var7 != null) {
                        break label135;
                     }

                     var10000 = var7;
                  }

                  if (var10000 == null) {
                     break;
                  }
               } catch (gj var20) {
                  boolean var34 = false;
                  throw x44.a<"r">(var20, 2693754452458220603L, var3);
               }

               if (var3 >= 0L) {
                  break label134;
               }
            }
         }

         x44.a<"r">(var9, 2813255201494508178L, var3);
      }

      ArrayList var23 = new ArrayList(var8);

      label105: {
         label142: {
            try {
               var28 = var2;
               if (var7 != null) {
                  break label105;
               }

               if (var2 == 0) {
                  break label142;
               }
            } catch (gj var19) {
               throw x44.a<"r">(var19, 2693754452458220603L, var3);
            }

            int var24 = 0;

            label97:
            while (var24 < var8) {
               try {
                  var23.add(var9[var24].V());
                  var24++;
               } catch (gj var15) {
                  boolean var35 = false;
                  throw x44.a<"r">(var15, 2693754452458220603L, var3);
               }

               while (true) {
                  try {
                     var10000 = var7;
                     if (var3 > 0L) {
                        if (var7 != null) {
                           return var23;
                        }

                        var10000 = var7;
                     }

                     if (var10000 == null) {
                        break;
                     }
                  } catch (gj var18) {
                     boolean var36 = false;
                     throw x44.a<"r">(var18, 2693754452458220603L, var3);
                  }

                  if (var3 >= 0L) {
                     break label97;
                  }
               }
            }

            try {
               if (var7 == null) {
                  return var23;
               }
            } catch (gj var17) {
               boolean var37 = false;
               throw x44.a<"r">(var17, 2693754452458220603L, var3);
            }
         }

         try {
            var28 = var8 - 1;
         } catch (gj var16) {
            boolean var38 = false;
            throw x44.a<"r">(var16, 2693754452458220603L, var3);
         }
      }

      int var25 = var28;

      while (var25 >= 0) {
         try {
            Object var39 = var7;
            if (var3 >= 0L) {
               if (var7 != null) {
                  return var23;
               }

               var39 = var9[var25].V();
            }

            var23.add(var39);
            var25--;
            if (var7 == null) {
               continue;
            }
         } catch (gj var14) {
            throw x44.a<"r">(var14, 2693754452458220603L, var3);
         }

         if (var3 > 0L) {
            break;
         }
      }

      return var23;
   }

   public lh(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 15009421298376L;
      long var6 = var1 ^ 83072528237395L;
      super();
      int var10001 = sh.Q(var3, var6);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      this.t = x44.a<"u">(var10004, 8415991302785758072L, var1);
   }

   static {
      long var0 = a ^ 111553376183705L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 2344570351251157115L;
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
