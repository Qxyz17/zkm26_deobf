package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map.Entry;

public class r0 implements Comparator {
   final _ue h;
   private static final long a = ess.a(-3741003988685595215L, 3553392934642187576L, MethodHandles.lookup().lookupClass()).a(148315244483560L);

   public int G(Object[] param1) {
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
      // 04: checkcast java/util/Map$Entry
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/util/Map$Entry
      // 18: astore 5
      // 1a: pop
      // 1b: getstatic com/zelix/r0.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 128529716388481
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w -7114718102253338277
      // 2d: lload 3
      // 2e: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 2
      // 34: astore 9
      // 36: astore 8
      // 38: aload 5
      // 3a: astore 10
      // 3c: aload 9
      // 3e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 43: checkcast java/lang/String
      // 46: aload 10
      // 48: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4d: checkcast java/lang/String
      // 50: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 53: istore 11
      // 55: iload 11
      // 57: aload 8
      // 59: ifnonnull 9a
      // 5c: ifne 98
      // 5f: goto 6c
      // 62: ldc2_w -8688558975067090477
      // 65: lload 3
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 9
      // 6e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 73: checkcast com/zelix/hy
      // 76: aload 10
      // 78: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 7d: lload 6
      // 7f: dup2_x1
      // 80: pop2
      // 81: checkcast com/zelix/hz
      // 84: ldc2_w -9173937711758000203
      // 87: lload 3
      // 88: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: ireturn
      // 8e: ldc2_w -8688558975067090477
      // 91: lload 3
      // 92: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: iload 11
      // 9a: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 21108485259715L;
      long var5 = var3 ^ 134176998528503L;
      return x44.a<"k">(this, new Object[]{(Entry)var1, var5, (Entry)var2}, -470282594618936437L, var3);
   }

   r0(_ue var1) {
      this.h = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
