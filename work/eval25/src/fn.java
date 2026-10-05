package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class fn extends fy implements _f6 {
   private static final long c = ess.a(-4577750643941997883L, -4279608843995518040L, MethodHandles.lookup().lookupClass()).a(71956601942880L);

   public boolean R(long param1, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w 1379340358887420570
      // 0c: lload 1
      // 0d: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: getfield com/zelix/fn.O [Lcom/zelix/_za;
      // 16: arraylength
      // 17: istore 7
      // 19: astore 6
      // 1b: bipush 0
      // 1c: istore 8
      // 1e: iload 8
      // 20: iload 7
      // 22: if_icmpge 7c
      // 25: aload 0
      // 26: getfield com/zelix/fn.O [Lcom/zelix/_za;
      // 29: iload 8
      // 2b: aaload
      // 2c: checkcast com/zelix/_f6
      // 2f: astore 9
      // 31: aload 6
      // 33: lload 1
      // 34: lconst_0
      // 35: lcmp
      // 36: ifle 79
      // 39: ifnonnull 77
      // 3c: aload 9
      // 3e: lload 4
      // 40: aload 3
      // 41: invokeinterface com/zelix/_f6.R (JLjava/lang/String;)Z 4
      // 46: aload 6
      // 48: ifnonnull 7d
      // 4b: goto 58
      // 4e: ldc2_w 1016713282519742481
      // 51: lload 1
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: ifne 74
      // 5b: goto 68
      // 5e: ldc2_w 1016713282519742481
      // 61: lload 1
      // 62: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: bipush 0
      // 69: ireturn
      // 6a: ldc2_w 1016713282519742481
      // 6d: lload 1
      // 6e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: iinc 8 1
      // 77: aload 6
      // 79: ifnull 1e
      // 7c: bipush 1
      // 7d: ireturn
   }

   public fn(long var1, int var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 63155249705980L;
      super(var4, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
