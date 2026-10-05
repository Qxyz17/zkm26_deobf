package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class ay implements Comparator {
   final _88 F;
   private static final long a = ess.a(-1822429284309122522L, 628815946045016826L, MethodHandles.lookup().lookupClass()).a(97053008018580L);

   ay(_88 var1) {
      this.F = var1;
   }

   public int e(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 4
      // 1b: pop
      // 1c: getstatic com/zelix/ay.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: ldc2_w -3638607831293341287
      // 25: lload 2
      // 26: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 6
      // 2d: aload 5
      // 2f: invokevirtual java/lang/String.length ()I
      // 32: aload 4
      // 34: invokevirtual java/lang/String.length ()I
      // 37: aload 6
      // 39: ifnonnull 74
      // 3c: if_icmpne 58
      // 3f: goto 4c
      // 42: ldc2_w -3803084553502549919
      // 45: lload 2
      // 46: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: ldc2_w -3803084553502549919
      // 51: lload 2
      // 52: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 5
      // 5a: invokevirtual java/lang/String.length ()I
      // 5d: aload 6
      // 5f: ifnonnull 84
      // 62: aload 4
      // 64: invokevirtual java/lang/String.length ()I
      // 67: goto 74
      // 6a: ldc2_w -3803084553502549919
      // 6d: lload 2
      // 6e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: if_icmpge 83
      // 77: bipush -1
      // 78: ireturn
      // 79: ldc2_w -3803084553502549919
      // 7c: lload 2
      // 7d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: bipush 1
      // 84: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 114652407726210L;
      long var5 = var3 ^ 107326324393076L;
      return x44.a<"j">(this, new Object[]{var5, (String)var1, (String)var2}, -5257839021750849025L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
