package com.zelix;

import java.lang.invoke.MethodHandles;

public class zz extends jf {
   private static final long a = ess.a(5859057275856260256L, -5421074894485217328L, MethodHandles.lookup().lookupClass()).a(261325285723671L);

   public void t(Object[] param1) {
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
      // 0e: checkcast com/zelix/_za
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 5
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: aload 0
      // 26: bipush 0
      // 27: invokevirtual com/zelix/zz.e (I)Lcom/zelix/_za;
      // 2a: astore 9
      // 2c: ldc2_w 9148277501292601163
      // 2f: lload 2
      // 30: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 9
      // 37: lload 6
      // 39: aload 0
      // 3a: aload 5
      // 3c: bipush 3
      // 3d: anewarray 38
      // 40: dup_x1
      // 41: swap
      // 42: bipush 2
      // 43: swap
      // 44: aastore
      // 45: dup_x1
      // 46: swap
      // 47: bipush 1
      // 48: swap
      // 49: aastore
      // 4a: dup_x2
      // 4b: dup_x2
      // 4c: pop
      // 4d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50: bipush 0
      // 51: swap
      // 52: aastore
      // 53: ldc2_w 8818198965911889370
      // 56: lload 2
      // 57: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: astore 8
      // 5e: aload 0
      // 5f: ldc2_w 9125528338416075833
      // 62: lload 2
      // 63: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_za; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: aload 8
      // 6a: ifnonnull 97
      // 6d: instanceof com/zelix/za
      // 70: ifeq b1
      // 73: goto 80
      // 76: ldc2_w 8904300195245708022
      // 79: lload 2
      // 7a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 9125528338416075833
      // 84: lload 2
      // 85: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_za; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: goto 97
      // 8d: ldc2_w 8904300195245708022
      // 90: lload 2
      // 91: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: checkcast com/zelix/za
      // 9a: aload 9
      // 9c: checkcast com/zelix/ff
      // 9f: bipush 1
      // a0: anewarray 38
      // a3: dup_x1
      // a4: swap
      // a5: bipush 0
      // a6: swap
      // a7: aastore
      // a8: ldc2_w 7438253189935696629
      // ab: lload 2
      // ac: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: return
   }

   public zz(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 6997719865356L;
      super(var4, var1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
