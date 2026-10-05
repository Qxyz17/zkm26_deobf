package com.zelix;

import java.awt.event.ActionEvent;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class d5 extends AbstractAction {
   final u_ Z;
   private static final long a = ess.a(9124012937825035133L, 2771976524923077643L, MethodHandles.lookup().lookupClass()).a(271112906408109L);

   d5(u_ var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/d5.a J
      // 03: ldc2_w 99081872698582
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 48191024567916
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -3972566143013166863
      // 14: lload 2
      // 15: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 0
      // 1d: ldc2_w -3159615288767312296
      // 20: lload 2
      // 21: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/u_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 6
      // 28: ifnull 5b
      // 2b: ldc2_w -3727250657139377651
      // 2e: lload 2
      // 2f: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: ifeq 73
      // 37: goto 44
      // 3a: ldc2_w -3260653178486851184
      // 3d: lload 2
      // 3e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w -3159615288767312296
      // 48: lload 2
      // 49: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/u_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: goto 5b
      // 51: ldc2_w -3260653178486851184
      // 54: lload 2
      // 55: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: lload 4
      // 5d: bipush 1
      // 5e: anewarray 56
      // 61: dup_x2
      // 62: dup_x2
      // 63: pop
      // 64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67: bipush 0
      // 68: swap
      // 69: aastore
      // 6a: ldc2_w -3884731133893164196
      // 6d: lload 2
      // 6e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
