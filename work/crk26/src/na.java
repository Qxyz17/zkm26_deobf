package com.zelix;

import java.lang.invoke.MethodHandles;

public class na extends ez {
   private static final long b = prr.a(6811963044370406800L, -8129632706172490338L, MethodHandles.lookup().lookupClass()).a(208063558645954L);

   public na(short param1, short param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 32
      // 12: lshl
      // 13: bipush 32
      // 15: lushr
      // 16: lor
      // 17: getstatic com/zelix/na.b J
      // 1a: lxor
      // 1b: lstore 5
      // 1d: lload 5
      // 1f: dup2
      // 20: ldc2_w 113786866116125
      // 23: lxor
      // 24: lstore 7
      // 26: pop2
      // 27: ldc2_w 6813938846097863147
      // 2a: lload 5
      // 2c: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: aload 0
      // 32: lload 7
      // 34: invokespecial com/zelix/ez.<init> (J)V
      // 37: astore 9
      // 39: aload 9
      // 3b: ifnull 74
      // 3e: iload 4
      // 40: ifeq 7d
      // 43: goto 51
      // 46: ldc2_w 4757815931604759050
      // 49: lload 5
      // 4b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w 6598670043205501786
      // 55: lload 5
      // 57: invokedynamic n (JJ)Ljavax/swing/border/Border; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: ldc2_w 6510890016594587123
      // 5f: lload 5
      // 61: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: goto 74
      // 69: ldc2_w 4757815931604759050
      // 6c: lload 5
      // 6e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: iload 1
      // 75: iflt 92
      // 78: aload 9
      // 7a: ifnonnull a0
      // 7d: aload 0
      // 7e: ldc2_w 6636145562625368790
      // 81: lload 5
      // 83: invokedynamic n (JJ)Ljavax/swing/border/Border; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: ldc2_w 6510890016594587123
      // 8b: lload 5
      // 8d: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: goto a0
      // 95: ldc2_w 4757815931604759050
      // 98: lload 5
      // 9a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: return
   }

   public void removeAll() {
      long var1 = b ^ 47201101066790L;
      super.removeAll();
      m44.a<"v">(this, 2736014202911237992L, var1);
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
