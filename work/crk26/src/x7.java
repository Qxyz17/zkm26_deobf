package com.zelix;

import java.util.List;

public abstract class x7 extends js implements c, m {
   List B;

   public final void F(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 133166016580456L;
      m44.a<"p">(this, -2184408470352194324L, var2);
      m44.a<"p">(this, new Object[]{var4}, -389139401457408305L, var2);
   }

   public void Z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 100844190438144L;
      m44.a<"p">(this, var4, null, null, null, -6187384355785420129L, var2);
   }

   public void T(long param1, Object param3, Object param4, Object param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 26357493570083
      // 05: lxor
      // 06: lstore 6
      // 08: pop2
      // 09: bipush 0
      // 0a: istore 9
      // 0c: ldc2_w -6726063047940244521
      // 0f: lload 1
      // 10: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: aload 0
      // 16: dup
      // 17: astore 11
      // 19: monitorenter
      // 1a: istore 8
      // 1c: aload 0
      // 1d: ldc2_w -4849488547290066469
      // 20: lload 1
      // 21: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: iload 8
      // 28: ifeq 49
      // 2b: ifnonnull 3f
      // 2e: goto 3b
      // 31: ldc2_w -4714396449015272687
      // 34: lload 1
      // 35: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: aload 11
      // 3d: monitorexit
      // 3e: return
      // 3f: aload 0
      // 40: ldc2_w -4849488547290066469
      // 43: lload 1
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: invokeinterface java/util/List.size ()I 1
      // 4e: istore 9
      // 50: iload 9
      // 52: anewarray 110
      // 55: astore 10
      // 57: aload 0
      // 58: ldc2_w -4849488547290066469
      // 5b: lload 1
      // 5c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: aload 10
      // 63: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 68: checkcast [Lcom/zelix/us;
      // 6b: astore 10
      // 6d: aload 11
      // 6f: monitorexit
      // 70: goto 7b
      // 73: astore 12
      // 75: aload 11
      // 77: monitorexit
      // 78: aload 12
      // 7a: athrow
      // 7b: iload 9
      // 7d: bipush 1
      // 7e: isub
      // 7f: istore 11
      // 81: iload 11
      // 83: iflt c7
      // 86: aload 10
      // 88: iload 11
      // 8a: aaload
      // 8b: iload 8
      // 8d: ifeq b2
      // 90: ifnull bf
      // 93: goto a0
      // 96: ldc2_w -4714396449015272687
      // 99: lload 1
      // 9a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: aload 10
      // a2: iload 11
      // a4: aaload
      // a5: goto b2
      // a8: ldc2_w -4714396449015272687
      // ab: lload 1
      // ac: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aload 0
      // b3: aload 3
      // b4: aload 4
      // b6: aload 5
      // b8: lload 6
      // ba: invokeinterface com/zelix/us.x (Lcom/zelix/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V 7
      // bf: iinc 11 -1
      // c2: iload 8
      // c4: ifne 81
      // c7: lload 1
      // c8: lconst_0
      // c9: lcmp
      // ca: iflt 86
      // cd: return
   }

   public x7(int var1, to var2) {
      super(var1, var2);
   }

   public synchronized void I() {
   }

   public synchronized void Y(Object[] var1) {
      us var4 = (us)var1[0];
      long var2 = (Long)var1[1];
      int var5 = m44.a<"k">(-2567178363381368133L, var2);

      List var10000;
      label27: {
         try {
            if (var2 < 0L) {
               return;
            }

            var10000 = m44.a<"u">(this, -2553718038993817113L, var2);
            if (var5 != 0) {
               break label27;
            }

            if (var10000 == null) {
               return;
            }
         } catch (n9 var6) {
            throw m44.a<"k">(var6, -2400594191611360467L, var2);
         }

         var10000 = m44.a<"u">(this, -2553718038993817113L, var2);
      }

      m44.a<"t">(var10000, var4, -4289448557524953229L, var2);
   }

   public final synchronized void y(Object[] param1) {
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
      // 04: checkcast com/zelix/us
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: ldc2_w 4856756773914158466
      // 17: lload 2
      // 18: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: istore 5
      // 1f: aload 0
      // 20: ldc2_w 4879219830859869918
      // 23: lload 2
      // 24: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: lload 2
      // 2a: lconst_0
      // 2b: lcmp
      // 2c: iflt 6d
      // 2f: iload 5
      // 31: ifne 6d
      // 34: ifnonnull 63
      // 37: goto 44
      // 3a: ldc2_w 4726041969960555540
      // 3d: lload 2
      // 3e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: new java/util/ArrayList
      // 48: dup
      // 49: bipush 2
      // 4a: invokespecial java/util/ArrayList.<init> (I)V
      // 4d: ldc2_w 4879219830859869918
      // 50: lload 2
      // 51: invokedynamic v (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: goto 63
      // 59: ldc2_w 4726041969960555540
      // 5c: lload 2
      // 5d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 0
      // 64: ldc2_w 4879219830859869918
      // 67: lload 2
      // 68: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: aload 4
      // 6f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 74: iload 5
      // 76: ifne a7
      // 79: ifne a8
      // 7c: goto 89
      // 7f: ldc2_w 4726041969960555540
      // 82: lload 2
      // 83: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 0
      // 8a: ldc2_w 4879219830859869918
      // 8d: lload 2
      // 8e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: aload 4
      // 95: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9a: goto a7
      // 9d: ldc2_w 4726041969960555540
      // a0: lload 2
      // a1: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: pop
      // a8: return
   }

   public final void A(Object[] var1) {
      us var3 = (us)var1[0];
      long var5 = (Long)var1[1];
      Object var7 = var1[2];
      Object var4 = var1[3];
      Object var2 = var1[4];
      long var8 = var5 ^ 124941045463255L;
      var3.x(this, var7, var4, var2, var8);
   }

   public final void u(Object[] var1) {
      long var3 = (Long)var1[0];
      us var2 = (us)var1[1];
      long var5 = var3 ^ 114985903738194L;
      m44.a<"v">(this, new Object[]{var2, var5, null, null, null}, -7727334488220693083L, var3);
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
