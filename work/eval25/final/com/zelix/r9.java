package com.zelix;

import java.awt.event.ActionEvent;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class r9 extends AbstractAction {
   final gh q;
   private static final long a = ess.a(-7136213649127378846L, -5595640867338641757L, MethodHandles.lookup().lookupClass()).a(156623258817862L);

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/r9.a J
      // 03: ldc2_w 9831097181621
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 20329658768666
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 8730455381767639303
      // 14: lload 2
      // 15: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 0
      // 1d: ldc2_w 8923383851775116262
      // 20: lload 2
      // 21: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/gh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 6
      // 28: ifnull 5b
      // 2b: ldc2_w 8977679755804488646
      // 2e: lload 2
      // 2f: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: ifeq 73
      // 37: goto 44
      // 3a: ldc2_w 7067771344357721617
      // 3d: lload 2
      // 3e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w 8923383851775116262
      // 48: lload 2
      // 49: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/gh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: goto 5b
      // 51: ldc2_w 7067771344357721617
      // 54: lload 2
      // 55: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: lload 4
      // 5d: bipush 1
      // 5e: anewarray 49
      // 61: dup_x2
      // 62: dup_x2
      // 63: pop
      // 64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67: bipush 0
      // 68: swap
      // 69: aastore
      // 6a: ldc2_w 8849302174083106903
      // 6d: lload 2
      // 6e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: return
   }

   r9(gh var1) {
      this.q = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
