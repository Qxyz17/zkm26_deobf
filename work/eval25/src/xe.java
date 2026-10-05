package com.zelix;

import java.util.List;

public abstract class xe extends xl implements ab, v_ {
   List y;

   public final void u(Object[] var1) {
      long var2 = (Long)var1[0];
      w2 var4 = (w2)var1[1];
      long var5 = var2 ^ 17363814013309L;
      x44.a<"h">(this, new Object[]{var4, var5, null, null, null}, 6109529354820950374L, var2);
   }

   public synchronized void o() {
   }

   public void y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 70497549808725L;
      x44.a<"k">(this, var4, null, null, null, -2611658688144534199L, var2);
   }

   public final void K(Object[] var1) {
      w2 var5 = (w2)var1[0];
      long var2 = (Long)var1[1];
      Object var6 = var1[2];
      Object var7 = var1[3];
      Object var4 = var1[4];
      long var8 = var2 ^ 38750014580938L;
      var5.G(var8, this, var6, var7, var4);
   }

   public final synchronized void V(Object[] param1) {
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
      // 04: checkcast com/zelix/w2
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: ldc2_w -5039247815475535887
      // 17: lload 2
      // 18: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 5
      // 1f: aload 0
      // 20: ldc2_w -4836901471961748067
      // 23: lload 2
      // 24: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: lload 2
      // 2a: lconst_0
      // 2b: lcmp
      // 2c: iflt 6d
      // 2f: aload 5
      // 31: ifnonnull 6d
      // 34: ifnonnull 63
      // 37: goto 44
      // 3a: ldc2_w -6602793914247081728
      // 3d: lload 2
      // 3e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: new java/util/ArrayList
      // 48: dup
      // 49: bipush 2
      // 4a: invokespecial java/util/ArrayList.<init> (I)V
      // 4d: ldc2_w -4836901471961748067
      // 50: lload 2
      // 51: invokedynamic u (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: goto 63
      // 59: ldc2_w -6602793914247081728
      // 5c: lload 2
      // 5d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 0
      // 64: ldc2_w -4836901471961748067
      // 67: lload 2
      // 68: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: aload 4
      // 6f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 74: aload 5
      // 76: ifnonnull a7
      // 79: ifne a8
      // 7c: goto 89
      // 7f: ldc2_w -6602793914247081728
      // 82: lload 2
      // 83: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 0
      // 8a: ldc2_w -4836901471961748067
      // 8d: lload 2
      // 8e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: aload 4
      // 95: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9a: goto a7
      // 9d: ldc2_w -6602793914247081728
      // a0: lload 2
      // a1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: pop
      // a8: return
   }

   public synchronized void F(Object[] var1) {
      w2 var2 = (w2)var1[0];
      long var3 = (Long)var1[1];
      String[] var5 = x44.a<"s">(-4098952910533057796L, var3);

      List var10000;
      label27: {
         try {
            if (var3 <= 0L) {
               return;
            }

            var10000 = x44.a<"o">(this, -4480314750444334960L, var3);
            if (var5 != null) {
               break label27;
            }

            if (var10000 == null) {
               return;
            }
         } catch (gj var6) {
            throw x44.a<"s">(var6, -2786796680731399155L, var3);
         }

         var10000 = x44.a<"o">(this, -4480314750444334960L, var3);
      }

      x44.a<"k">(var10000, var2, -2760472726926461086L, var3);
   }

   public final void d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 116257502347733L;
      x44.a<"n">(this, -8814759884942964592L, var2);
      x44.a<"n">(this, new Object[]{var4}, -8771652821425546728L, var2);
   }

   public xe(int var1, _83 var2) {
      super(var1, var2);
   }

   public void e(long param1, Object param3, Object param4, Object param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 129910742289337
      // 05: lxor
      // 06: lstore 6
      // 08: pop2
      // 09: ldc2_w 3215816013906069825
      // 0c: lload 1
      // 0d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: bipush 0
      // 13: istore 9
      // 15: astore 8
      // 17: aload 0
      // 18: dup
      // 19: astore 11
      // 1b: monitorenter
      // 1c: aload 0
      // 1d: ldc2_w 3057942854378683181
      // 20: lload 1
      // 21: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 8
      // 28: ifnonnull 3c
      // 2b: ifnonnull 32
      // 2e: aload 11
      // 30: monitorexit
      // 31: return
      // 32: aload 0
      // 33: ldc2_w 3057942854378683181
      // 36: lload 1
      // 37: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: invokeinterface java/util/List.size ()I 1
      // 41: istore 9
      // 43: iload 9
      // 45: anewarray 73
      // 48: astore 10
      // 4a: aload 0
      // 4b: ldc2_w 3057942854378683181
      // 4e: lload 1
      // 4f: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: aload 10
      // 56: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 5b: checkcast [Lcom/zelix/w2;
      // 5e: astore 10
      // 60: aload 11
      // 62: monitorexit
      // 63: goto 6e
      // 66: astore 12
      // 68: aload 11
      // 6a: monitorexit
      // 6b: aload 12
      // 6d: athrow
      // 6e: iload 9
      // 70: bipush 1
      // 71: isub
      // 72: istore 11
      // 74: iload 11
      // 76: iflt ba
      // 79: aload 10
      // 7b: iload 11
      // 7d: aaload
      // 7e: aload 8
      // 80: ifnonnull a5
      // 83: ifnull b2
      // 86: goto 93
      // 89: ldc2_w 3669880113622255536
      // 8c: lload 1
      // 8d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: aload 10
      // 95: iload 11
      // 97: aaload
      // 98: goto a5
      // 9b: ldc2_w 3669880113622255536
      // 9e: lload 1
      // 9f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: lload 6
      // a7: aload 0
      // a8: aload 3
      // a9: aload 4
      // ab: aload 5
      // ad: invokeinterface com/zelix/w2.G (JLcom/zelix/v_;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V 7
      // b2: iinc 11 -1
      // b5: aload 8
      // b7: ifnull 74
      // ba: lload 1
      // bb: lconst_0
      // bc: lcmp
      // bd: ifle 79
      // c0: return
   }

   private static gj b(gj var0) {
      return var0;
   }
}
