package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class l9 implements Iterator {
   private int x;
   final wm J;
   private static final long a = ess.a(-6658242813479400115L, 8210963652370954117L, MethodHandles.lookup().lookupClass()).a(2507802575950L);

   @Override
   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l9.a J
      // 03: ldc2_w 20502481306432
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 129974357418824
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w 2159070334637638898
      // 13: lload 1
      // 14: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 5
      // 1b: aload 0
      // 1c: ldc2_w 309912051641416680
      // 1f: lload 1
      // 20: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 5
      // 27: ifnonnull 71
      // 2a: aload 0
      // 2b: ldc2_w 359206883550673432
      // 2e: lload 1
      // 2f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/wm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: lload 3
      // 35: dup2_x1
      // 36: pop2
      // 37: bipush 2
      // 38: anewarray 74
      // 3b: dup_x1
      // 3c: swap
      // 3d: bipush 1
      // 3e: swap
      // 3f: aastore
      // 40: dup_x2
      // 41: dup_x2
      // 42: pop
      // 43: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 46: bipush 0
      // 47: swap
      // 48: aastore
      // 49: ldc2_w 2129975787911556495
      // 4c: lload 1
      // 4d: invokedynamic w (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: arraylength
      // 53: if_icmpge 74
      // 56: goto 63
      // 59: ldc2_w 264880388701524680
      // 5c: lload 1
      // 5d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: bipush 1
      // 64: goto 71
      // 67: ldc2_w 264880388701524680
      // 6a: lload 1
      // 6b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   l9(wm var1) {
      this.J = var1;
   }

   @Override
   public Object next() {
      long var1 = a ^ 35679155668996L;
      long var3 = var1 ^ 75731734145036L;
      Object[] var10000 = x44.a<"s">(new Object[]{var3, x44.a<"o">(this, -3479002024738918052L, var1)}, -2969275788356131125L, var1);
      int var10003 = x44.a<"o">(this, -3528229971115298644L, var1);
      x44.a<"p">(this, var10003 + 1, -3528229971115298644L, var1);
      return var10000[var10003];
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
