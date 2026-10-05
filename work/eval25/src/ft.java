package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class ft extends f5 implements _ng {
   private static final long d = ess.a(1586039479411927858L, -379354032459553484L, MethodHandles.lookup().lookupClass()).a(120283559409019L);

   public boolean B(int param1, int param2, int param3, Set param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: lstore 5
      // 19: lload 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: dup2
      // 21: bipush 32
      // 23: lushr
      // 24: l2i
      // 25: istore 7
      // 27: dup2
      // 28: bipush 32
      // 2a: lshl
      // 2b: bipush 48
      // 2d: lushr
      // 2e: l2i
      // 2f: istore 8
      // 31: dup2
      // 32: bipush 48
      // 34: lshl
      // 35: bipush 48
      // 37: lushr
      // 38: l2i
      // 39: istore 9
      // 3b: pop2
      // 3c: pop2
      // 3d: ldc2_w -6605049255937145368
      // 40: lload 5
      // 42: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: bipush 0
      // 48: istore 11
      // 4a: aload 0
      // 4b: getfield com/zelix/ft.O [Lcom/zelix/_za;
      // 4e: arraylength
      // 4f: istore 12
      // 51: astore 10
      // 53: bipush 0
      // 54: istore 13
      // 56: iload 13
      // 58: iload 12
      // 5a: if_icmpge c7
      // 5d: aload 0
      // 5e: getfield com/zelix/ft.O [Lcom/zelix/_za;
      // 61: iload 13
      // 63: aaload
      // 64: checkcast com/zelix/_ng
      // 67: astore 14
      // 69: aload 10
      // 6b: iload 1
      // 6c: iflt c4
      // 6f: ifnonnull c2
      // 72: aload 14
      // 74: iload 7
      // 76: iload 8
      // 78: iload 9
      // 7a: aload 4
      // 7c: invokeinterface com/zelix/_ng.B (IIILjava/util/Set;)Z 5
      // 81: aload 10
      // 83: ifnonnull d9
      // 86: goto 94
      // 89: ldc2_w -5164304928465647514
      // 8c: lload 5
      // 8e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: ifeq b1
      // 97: goto a5
      // 9a: ldc2_w -5164304928465647514
      // 9d: lload 5
      // 9f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: bipush 1
      // a6: iload 1
      // a7: ifle d6
      // aa: istore 11
      // ac: aload 10
      // ae: ifnull c7
      // b1: iinc 13 1
      // b4: goto c2
      // b7: ldc2_w -5164304928465647514
      // ba: lload 5
      // bc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: aload 10
      // c4: ifnull 56
      // c7: aload 0
      // c8: ldc2_w -4689785867235388389
      // cb: lload 5
      // cd: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: iload 2
      // d3: ifle d9
      // d6: iload 11
      // d8: ixor
      // d9: ireturn
   }

   public ft(long var1, int var3) {
      var1 = d ^ var1;
      long var10001 = var1 ^ 97545473270845L;
      int var4 = (int)((var1 ^ 97545473270845L) >>> 48);
      int var5 = (int)((var1 ^ 97545473270845L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      super((short)var4, (short)var5, var3, var6);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
