package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class f2 extends f5 implements _f6 {
   private static final long d = ess.a(6991787985650609266L, -4900362899023282121L, MethodHandles.lookup().lookupClass()).a(73697639168584L);

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
      // 09: bipush 0
      // 0a: istore 7
      // 0c: ldc2_w 1379340358887420570
      // 0f: lload 1
      // 10: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: aload 0
      // 16: getfield com/zelix/f2.O [Lcom/zelix/_za;
      // 19: arraylength
      // 1a: istore 8
      // 1c: astore 6
      // 1e: bipush 0
      // 1f: istore 9
      // 21: iload 9
      // 23: iload 8
      // 25: if_icmpge 8e
      // 28: aload 0
      // 29: getfield com/zelix/f2.O [Lcom/zelix/_za;
      // 2c: iload 9
      // 2e: aaload
      // 2f: checkcast com/zelix/_f6
      // 32: astore 10
      // 34: aload 6
      // 36: lload 1
      // 37: lconst_0
      // 38: lcmp
      // 39: iflt 8b
      // 3c: ifnonnull 89
      // 3f: aload 10
      // 41: lload 4
      // 43: aload 3
      // 44: invokeinterface com/zelix/_f6.R (JLjava/lang/String;)Z 4
      // 49: aload 6
      // 4b: ifnonnull a1
      // 4e: goto 5b
      // 51: ldc2_w 1633599551070431730
      // 54: lload 1
      // 55: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: ifeq 79
      // 5e: goto 6b
      // 61: ldc2_w 1633599551070431730
      // 64: lload 1
      // 65: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: bipush 1
      // 6c: lload 1
      // 6d: lconst_0
      // 6e: lcmp
      // 6f: ifle 9e
      // 72: istore 7
      // 74: aload 6
      // 76: ifnull 8e
      // 79: iinc 9 1
      // 7c: goto 89
      // 7f: ldc2_w 1633599551070431730
      // 82: lload 1
      // 83: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 6
      // 8b: ifnull 21
      // 8e: aload 0
      // 8f: ldc2_w 691523081368839017
      // 92: lload 1
      // 93: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: lload 1
      // 99: lconst_0
      // 9a: lcmp
      // 9b: iflt a1
      // 9e: iload 7
      // a0: ixor
      // a1: ireturn
   }

   public f2(long var1, int var3, int var4) {
      long var5 = (var1 << 32 | (long)var4 << 32 >>> 32) ^ d;
      long var10001 = var5 ^ 65607174799828L;
      int var7 = (int)((var5 ^ 65607174799828L) >>> 48);
      int var8 = (int)((var5 ^ 65607174799828L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      super((short)var7, (short)var8, var3, var9);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
