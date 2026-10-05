package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _fa implements Comparator {
   private static final long a = ess.a(557245885492238377L, -5685057216682613485L, MethodHandles.lookup().lookupClass()).a(197549557384304L);

   public int w(Object[] param1) {
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
      // 04: checkcast com/zelix/bv
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/bv
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/_fa.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: ldc2_w -9012317868374116695
      // 24: lload 3
      // 25: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 5
      // 2c: bipush 0
      // 2d: invokevirtual com/zelix/bv.l (I)I
      // 30: aload 2
      // 31: bipush 0
      // 32: invokevirtual com/zelix/bv.l (I)I
      // 35: isub
      // 36: istore 7
      // 38: istore 6
      // 3a: iload 7
      // 3c: iload 6
      // 3e: ifne 6a
      // 41: ifne 68
      // 44: goto 51
      // 47: ldc2_w -8993447596870717913
      // 4a: lload 3
      // 4b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 5
      // 53: bipush 1
      // 54: invokevirtual com/zelix/bv.l (I)I
      // 57: aload 2
      // 58: bipush 1
      // 59: invokevirtual com/zelix/bv.l (I)I
      // 5c: isub
      // 5d: ireturn
      // 5e: ldc2_w -8993447596870717913
      // 61: lload 3
      // 62: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: iload 7
      // 6a: ireturn
   }

   _fa() {
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 53387139724403L;
      long var5 = var3 ^ 95054615357259L;
      return x44.a<"h">(this, new Object[]{(bv)var1, (bv)var2, var5}, 4902438669274838041L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
