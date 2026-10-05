package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class fr extends fy implements _ng {
   private static final long c = ess.a(-1284467802777880172L, -1475083899947599375L, MethodHandles.lookup().lookupClass()).a(280654713599617L);

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
      // 3d: aload 0
      // 3e: getfield com/zelix/fr.O [Lcom/zelix/_za;
      // 41: arraylength
      // 42: istore 11
      // 44: ldc2_w -6605049255937145368
      // 47: lload 5
      // 49: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: bipush 0
      // 4f: istore 12
      // 51: astore 10
      // 53: iload 12
      // 55: iload 11
      // 57: if_icmpge b7
      // 5a: aload 0
      // 5b: getfield com/zelix/fr.O [Lcom/zelix/_za;
      // 5e: iload 12
      // 60: aaload
      // 61: checkcast com/zelix/_ng
      // 64: astore 13
      // 66: aload 10
      // 68: iload 2
      // 69: iflt b4
      // 6c: ifnonnull b2
      // 6f: aload 13
      // 71: iload 7
      // 73: iload 8
      // 75: iload 9
      // 77: aload 4
      // 79: invokeinterface com/zelix/_ng.B (IIILjava/util/Set;)Z 5
      // 7e: aload 10
      // 80: ifnonnull b8
      // 83: goto 91
      // 86: ldc2_w -5160353266360214795
      // 89: lload 5
      // 8b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: ifne af
      // 94: goto a2
      // 97: ldc2_w -5160353266360214795
      // 9a: lload 5
      // 9c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: bipush 0
      // a3: ireturn
      // a4: ldc2_w -5160353266360214795
      // a7: lload 5
      // a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: athrow
      // af: iinc 12 1
      // b2: aload 10
      // b4: ifnull 53
      // b7: bipush 1
      // b8: ireturn
   }

   public fr(int var1, long var2) {
      var2 = c ^ var2;
      long var4 = var2 ^ 34671028915890L;
      super(var4, var1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
