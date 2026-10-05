package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class wz implements ActionListener, ListSelectionListener {
   u6 L;
   private static final long a = ess.a(8402164820351366328L, -3415277384262721890L, MethodHandles.lookup().lookupClass()).a(67678548209773L);

   wz(char var1, int var2, u6 var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      super();
      x44.a<"s">(this, var3, 7708270352933108763L, var5);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
   }

   @Override
   public void valueChanged(ListSelectionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/wz.a J
      // 03: ldc2_w 119368472615256
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 95965180148328
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -8398807030215706901
      // 14: lload 2
      // 15: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnull 50
      // 22: ldc2_w -8090492573615254977
      // 25: lload 2
      // 26: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: ifeq 46
      // 2e: goto 3b
      // 31: ldc2_w -8391141945569396304
      // 34: lload 2
      // 35: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: return
      // 3c: ldc2_w -8391141945569396304
      // 3f: lload 2
      // 40: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 1
      // 47: ldc2_w -8054878795804701032
      // 4a: lload 2
      // 4b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: checkcast com/zelix/q0
      // 53: astore 7
      // 55: aload 7
      // 57: ldc2_w -8243137627713138518
      // 5a: lload 2
      // 5b: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: istore 8
      // 62: iload 8
      // 64: bipush -1
      // 65: if_icmple b0
      // 68: aload 0
      // 69: ldc2_w -8263509055256044624
      // 6c: lload 2
      // 6d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: aload 7
      // 74: ldc2_w -8243137627713138518
      // 77: lload 2
      // 78: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: lload 4
      // 7f: aload 1
      // 80: bipush 3
      // 81: anewarray 19
      // 84: dup_x1
      // 85: swap
      // 86: bipush 2
      // 87: swap
      // 88: aastore
      // 89: dup_x2
      // 8a: dup_x2
      // 8b: pop
      // 8c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8f: bipush 1
      // 90: swap
      // 91: aastore
      // 92: dup_x1
      // 93: swap
      // 94: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 97: bipush 0
      // 98: swap
      // 99: aastore
      // 9a: ldc2_w -7660139097051713772
      // 9d: lload 2
      // 9e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: goto b0
      // a6: ldc2_w -8391141945569396304
      // a9: lload 2
      // aa: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
