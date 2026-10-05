package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map.Entry;

public class _y5 implements Comparator {
   final _ue H;
   private static final long a = ess.a(6820377106563421256L, -6871625808445580867L, MethodHandles.lookup().lookupClass()).a(144277951566405L);

   public int t(Object[] param1) {
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map$Entry
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/_y5.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 20282947864520
      // 27: lxor
      // 28: lstore 6
      // 2a: dup2
      // 2b: ldc2_w 36771673569607
      // 2e: lxor
      // 2f: lstore 8
      // 31: dup2
      // 32: ldc2_w 63469684361923
      // 35: lxor
      // 36: lstore 10
      // 38: pop2
      // 39: ldc2_w -5403971244656875239
      // 3c: lload 2
      // 3d: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: aload 4
      // 44: astore 13
      // 46: aload 5
      // 48: astore 14
      // 4a: astore 12
      // 4c: aload 13
      // 4e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 53: checkcast java/lang/String
      // 56: aload 14
      // 58: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 5d: checkcast java/lang/String
      // 60: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 63: istore 15
      // 65: iload 15
      // 67: aload 12
      // 69: ifnonnull f9
      // 6c: ifne f7
      // 6f: goto 7c
      // 72: ldc2_w -6277637839908805959
      // 75: lload 2
      // 76: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 13
      // 7e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 83: checkcast com/zelix/i8
      // 86: astore 16
      // 88: aload 14
      // 8a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 8f: checkcast com/zelix/i8
      // 92: astore 17
      // 94: aload 16
      // 96: lload 8
      // 98: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 9b: aload 17
      // 9d: lload 8
      // 9f: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // a2: lload 10
      // a4: dup2_x1
      // a5: pop2
      // a6: ldc2_w -6274097993877448713
      // a9: lload 2
      // aa: invokedynamic m (Ljava/lang/Object;JLjava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: istore 18
      // b1: iload 18
      // b3: aload 12
      // b5: ifnonnull f6
      // b8: ifne f4
      // bb: goto c8
      // be: ldc2_w -6277637839908805959
      // c1: lload 2
      // c2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 16
      // ca: lload 6
      // cc: aload 17
      // ce: bipush 2
      // cf: anewarray 64
      // d2: dup_x1
      // d3: swap
      // d4: bipush 1
      // d5: swap
      // d6: aastore
      // d7: dup_x2
      // d8: dup_x2
      // d9: pop
      // da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dd: bipush 0
      // de: swap
      // df: aastore
      // e0: ldc2_w -5615144443362612904
      // e3: lload 2
      // e4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: ireturn
      // ea: ldc2_w -6277637839908805959
      // ed: lload 2
      // ee: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f3: athrow
      // f4: iload 18
      // f6: ireturn
      // f7: iload 15
      // f9: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 90320269172067L;
      long var5 = var3 ^ 130031811944725L;
      return x44.a<"h">(this, new Object[]{(Entry)var1, var5, (Entry)var2}, -7560018194364483529L, var3);
   }

   _y5(_ue var1) {
      this.H = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
