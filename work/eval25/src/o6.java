package com.zelix;

import java.lang.invoke.MethodHandles;

public class o6 extends o7 {
   private static final long a = ess.a(4580822824834531157L, -8049774064739894064L, MethodHandles.lookup().lookupClass()).a(204484016435972L);

   protected void x(Object[] param1) {
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
      // 04: checkcast com/zelix/aa
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 111967373976178
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -9200718734728878147
      // 20: lload 2
      // 21: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: ifne 55
      // 2e: ldc2_w -8688945072053168005
      // 31: lload 2
      // 32: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: ifnull 96
      // 3a: goto 47
      // 3d: ldc2_w -7032509402531433380
      // 40: lload 2
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -7032509402531433380
      // 4e: lload 2
      // 4f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ldc2_w -6917772068846374721
      // 58: lload 2
      // 59: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/aa; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 0
      // 5f: ldc2_w -8688945072053168005
      // 62: lload 2
      // 63: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: aload 0
      // 69: ldc2_w -7188528707080098882
      // 6c: lload 2
      // 6d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: lload 5
      // 74: dup2_x1
      // 75: pop2
      // 76: bipush 3
      // 77: anewarray 51
      // 7a: dup_x1
      // 7b: swap
      // 7c: bipush 2
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x2
      // 80: dup_x2
      // 81: pop
      // 82: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 85: bipush 1
      // 86: swap
      // 87: aastore
      // 88: dup_x1
      // 89: swap
      // 8a: bipush 0
      // 8b: swap
      // 8c: aastore
      // 8d: ldc2_w -8707263570556867920
      // 90: lload 2
      // 91: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: return
   }

   public o6(int var1, byte var2, int var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 7155439920414L;
      super(var3, var7);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
