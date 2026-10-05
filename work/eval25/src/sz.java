package com.zelix;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.invoke.MethodHandles;

public class sz implements ItemListener {
   mp X;
   private static final long a = ess.a(-843241451125660169L, -341699740658920677L, MethodHandles.lookup().lookupClass()).a(261291397067703L);

   sz(int var1, short var2, char var3, mp var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      super();
      x44.a<"w">(this, var4, 8030313748041020083L, var5);
   }

   @Override
   public void itemStateChanged(ItemEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sz.a J
      // 03: ldc2_w 76723024964477
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 53887091647183
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 159409812457324460
      // 14: lload 2
      // 15: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnull 53
      // 22: ldc2_w 1922249828440546394
      // 25: lload 2
      // 26: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 1
      // 2c: if_icmpne 90
      // 2f: goto 3c
      // 32: ldc2_w 64266922788677719
      // 35: lload 2
      // 36: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 1
      // 3d: ldc2_w 513148570592147696
      // 40: lload 2
      // 41: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w 64266922788677719
      // 4c: lload 2
      // 4d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: checkcast javax/swing/JComboBox
      // 56: checkcast javax/swing/JComboBox
      // 59: astore 7
      // 5b: aload 0
      // 5c: ldc2_w 2069733310967103867
      // 5f: lload 2
      // 60: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: aload 7
      // 67: ldc2_w 233773151310050203
      // 6a: lload 2
      // 6b: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: lload 4
      // 72: bipush 2
      // 73: anewarray 48
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 1
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x1
      // 80: swap
      // 81: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: ldc2_w 496354473879977748
      // 8a: lload 2
      // 8b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
