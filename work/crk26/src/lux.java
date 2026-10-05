package com.zelix;

public class lux extends lmc {
   final e_ j;
   final wa i;

   public void r(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 95323265087966
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 138470008473842
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w 5561146463333268445
      // 1f: lload 2
      // 20: invokedynamic h (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: ldc2_w 5271626361121939005
      // 29: lload 2
      // 2a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/wa; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: lload 6
      // 31: bipush 1
      // 32: anewarray 71
      // 35: dup_x2
      // 36: dup_x2
      // 37: pop
      // 38: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b: bipush 0
      // 3c: swap
      // 3d: aastore
      // 3e: ldc2_w 5383093239249358332
      // 41: lload 2
      // 42: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: astore 8
      // 49: aload 0
      // 4a: aload 8
      // 4c: ifnonnull 76
      // 4f: ldc2_w 5744842256383619321
      // 52: lload 2
      // 53: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/e_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: ifnonnull a0
      // 5b: goto 68
      // 5e: ldc2_w 5557251941170941443
      // 61: lload 2
      // 62: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 0
      // 69: goto 76
      // 6c: ldc2_w 5557251941170941443
      // 6f: lload 2
      // 70: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: ldc2_w 5271626361121939005
      // 79: lload 2
      // 7a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/wa; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: bipush 0
      // 80: lload 4
      // 82: bipush 2
      // 83: anewarray 71
      // 86: dup_x2
      // 87: dup_x2
      // 88: pop
      // 89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c: bipush 1
      // 8d: swap
      // 8e: aastore
      // 8f: dup_x1
      // 90: swap
      // 91: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 94: bipush 0
      // 95: swap
      // 96: aastore
      // 97: ldc2_w 6230706247764054053
      // 9a: lload 2
      // 9b: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: return
   }

   lux(wa var1, e_ var2) {
      this.i = var1;
      this.j = var2;
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
