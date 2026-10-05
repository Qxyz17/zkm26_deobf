package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class wr implements Comparator {
   final _zi G;
   private static final long a = ess.a(1259674280560672741L, -5539674208576954810L, MethodHandles.lookup().lookupClass()).a(217443057168286L);

   public int K(Object[] param1) {
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
      // 04: checkcast com/zelix/iu
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/iu
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/wr.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 13378899964259
      // 26: lxor
      // 27: lstore 6
      // 29: dup2
      // 2a: ldc2_w 11744504933737
      // 2d: lxor
      // 2e: lstore 8
      // 30: pop2
      // 31: ldc2_w -1523841179034552638
      // 34: lload 3
      // 35: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 5
      // 3c: lload 6
      // 3e: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 41: aload 2
      // 42: lload 6
      // 44: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 47: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 4a: istore 11
      // 4c: astore 10
      // 4e: iload 11
      // 50: aload 10
      // 52: ifnonnull 82
      // 55: ifeq 72
      // 58: goto 65
      // 5b: ldc2_w -1162530453387477732
      // 5e: lload 3
      // 5f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: iload 11
      // 67: ireturn
      // 68: ldc2_w -1162530453387477732
      // 6b: lload 3
      // 6c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 5
      // 74: lload 8
      // 76: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // 79: aload 2
      // 7a: lload 8
      // 7c: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // 7f: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 82: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 102236286059275L;
      long var5 = var3 ^ 139432518508710L;
      return x44.a<"i">(this, new Object[]{(iu)var1, (iu)var2, var5}, 5099724662128563152L, var3);
   }

   wr(_zi var1) {
      this.G = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
