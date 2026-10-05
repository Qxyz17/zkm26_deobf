package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.List;

public class e3 implements Enumeration {
   private int i;
   private boolean R;
   final _y4 W;
   private final a3 p;
   private static final long a = ess.a(2968887586466553507L, 4033608194552005281L, MethodHandles.lookup().lookupClass()).a(85405705608808L);

   e3(_y4 var1, _fi var2, long var3) {
      var3 = a ^ var3;
      long var5 = (var3 ^ 71015747694354L) >>> 32;
      int var7 = (int)((var3 ^ 71015747694354L) << 32 >>> 32);
      this(var5, var1, var7);
   }

   @Override
   public boolean hasMoreElements() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/e3.a J
      // 03: ldc2_w 137095602607411
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 5108935575993737186
      // 0b: lload 1
      // 0c: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: ldc2_w 5108151873894926008
      // 16: lload 1
      // 17: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 3
      // 1d: ifnonnull 4c
      // 20: ifeq 42
      // 23: goto 30
      // 26: ldc2_w 6607037888547285139
      // 29: lload 1
      // 2a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: new java/util/ConcurrentModificationException
      // 33: dup
      // 34: invokespecial java/util/ConcurrentModificationException.<init> ()V
      // 37: athrow
      // 38: ldc2_w 6607037888547285139
      // 3b: lload 1
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: ldc2_w 6617431463373573951
      // 46: lload 1
      // 47: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: aload 3
      // 4d: ifnonnull 81
      // 50: aload 0
      // 51: ldc2_w 4901212061480642268
      // 54: lload 1
      // 55: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: ldc2_w 4652014095323833473
      // 5d: lload 1
      // 5e: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: if_icmpge 84
      // 66: goto 73
      // 69: ldc2_w 6607037888547285139
      // 6c: lload 1
      // 6d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: bipush 1
      // 74: goto 81
      // 77: ldc2_w 6607037888547285139
      // 7a: lload 1
      // 7b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: goto 85
      // 84: bipush 0
      // 85: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private e3(long var1, _y4 var3, int var4) {
      long var5 = (var1 << 32 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 3355212022260L;
      long var9 = var5 ^ 31745858410630L;
      this.W = var3;
      String var10000 = x44.a<"u">(8098844146261846368L, var5);
      super();
      x44.a<"v">(this, false, 8097902113281470522L, var5);
      this.p = new a3(var3.v.size() * 5, var7);
      String var11 = var10000;

      label43:
      for (List var13 : var3.v.values()) {
         try {
            x44.a<"m">(x44.a<"i">(this, 8252512508325122142L, var5), var13, 7788055874530953668L, var5);
         } catch (ConcurrentModificationException var15) {
            boolean var10001 = false;
            throw x44.a<"u">(var15, 7868531775292464657L, var5);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var1 >= 0L) {
                  if (var11 != null) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (ConcurrentModificationException var14) {
               boolean var18 = false;
               throw x44.a<"u">(var14, 7868531775292464657L, var5);
            }

            if (var1 > 0L) {
               break label43;
            }
         }
      }

      x44.a<"k">(this, new Object[]{var9}, 7542225047524123574L, var5);
   }

   private void l(Object[] param1) {
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
      // 0c: getstatic com/zelix/e3.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6202096109014634263
      // 15: lload 2
      // 16: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 4
      // 20: ifnonnull 4f
      // 23: ldc2_w -6203459220584584781
      // 26: lload 2
      // 27: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifeq 4e
      // 2f: goto 3c
      // 32: ldc2_w -5423523277856864360
      // 35: lload 2
      // 36: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: new java/util/ConcurrentModificationException
      // 3f: dup
      // 40: invokespecial java/util/ConcurrentModificationException.<init> ()V
      // 43: athrow
      // 44: ldc2_w -5423523277856864360
      // 47: lload 2
      // 48: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: bipush 0
      // 50: ldc2_w -5413615379944579020
      // 53: lload 2
      // 54: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: return
   }

   static void f(Object[] var0) {
      long var2 = (Long)var0[0];
      e3 var1 = (e3)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 26719468860664L;
      x44.a<"m">(var1, new Object[]{var4}, 4959968601832722376L, var2);
   }

   static void d(Object[] var0) {
      long var2 = (Long)var0[0];
      e3 var1 = (e3)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 64884387187647L;
      x44.a<"i">(var1, new Object[]{var4}, 1656483865381365287L, var2);
   }

   @Override
   public Object nextElement() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/e3.a J
      // 03: ldc2_w 56076597655812
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 18393286548070
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w 3085487355044901845
      // 13: lload 1
      // 14: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 5
      // 1b: aload 0
      // 1c: aload 5
      // 1e: ifnonnull 8e
      // 21: ldc2_w 3086235272545806991
      // 24: lload 1
      // 25: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: ifeq 4c
      // 2d: goto 3a
      // 30: ldc2_w 4001349606732924068
      // 33: lload 1
      // 34: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: new java/util/ConcurrentModificationException
      // 3d: dup
      // 3e: invokespecial java/util/ConcurrentModificationException.<init> ()V
      // 41: athrow
      // 42: ldc2_w 4001349606732924068
      // 45: lload 1
      // 46: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/ConcurrentModificationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: ldc2_w 2896894103154756331
      // 50: lload 1
      // 51: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/a3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: aload 0
      // 57: dup
      // 58: ldc2_w 4026949700136428296
      // 5b: lload 1
      // 5c: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: dup_x1
      // 62: bipush 1
      // 63: iadd
      // 64: ldc2_w 4026949700136428296
      // 67: lload 1
      // 68: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: lload 3
      // 6e: dup2_x1
      // 6f: pop2
      // 70: bipush 2
      // 71: anewarray 187
      // 74: dup_x1
      // 75: swap
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: bipush 1
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x2
      // 7d: dup_x2
      // 7e: pop
      // 7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82: bipush 0
      // 83: swap
      // 84: aastore
      // 85: ldc2_w 3223245384341847235
      // 88: lload 1
      // 89: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: areturn
   }

   private void e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"t">(this, true, 4655585628344074432L, var2);
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
