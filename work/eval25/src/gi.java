package com.zelix;

import java.lang.invoke.MethodHandles;

public class gi extends zw implements _f6 {
   private static final long c = ess.a(-4108587851424872138L, 17313048163693052L, MethodHandles.lookup().lookupClass()).a(252939253295419L);

   boolean b(Object[] param1) {
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
      // 0c: getstatic com/zelix/gi.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5447862434125867557
      // 15: lload 2
      // 16: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/gi.a Ljava/lang/String;
      // 21: ldc "*"
      // 23: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 26: aload 4
      // 28: ifnonnull 4a
      // 2b: bipush -1
      // 2c: if_icmpne 4d
      // 2f: goto 3c
      // 32: ldc2_w -5748784509480004417
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 4a
      // 40: ldc2_w -5748784509480004417
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   public final boolean R(long var1, String var3) {
      long var4 = var1 ^ 10908409034562L;
      return l_.y(var4, var3, this.a);
   }

   public final String o(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.a;
   }

   public gi(long var1, int var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 108958336183168L;
      super(var3, var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
