package com.zelix;

import java.awt.Component;
import java.lang.invoke.MethodHandles;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class vq extends DefaultListCellRenderer {
   final rm H;
   qj x;
   _nx B;
   private static final long a = ess.a(-3984399519547514731L, 7886646308910332999L, MethodHandles.lookup().lookupClass()).a(177596615708796L);

   vq(rm var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 66395108694168L;
      int var4 = (int)((var2 ^ 66395108694168L) >>> 32);
      int var5 = (int)((var2 ^ 66395108694168L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      var10001 = var2 ^ 78012349525908L;
      int var7 = (int)((var2 ^ 78012349525908L) >>> 48);
      int var8 = (int)((var2 ^ 78012349525908L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      this.H = var1;
      super();
      x44.a<"s">(this, new qj((char)var7, (char)var8, var9), 497154116284377832L, var2);
      x44.a<"s">(this, new _nx(var4, (char)var5, (short)var6), 433618672963881107L, var2);
   }

   @Override
   public Component getListCellRendererComponent(JList param1, Object param2, int param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/vq.a J
      // 003: ldc2_w 76413362891786
      // 006: lxor
      // 007: lstore 6
      // 009: lload 6
      // 00b: dup2
      // 00c: ldc2_w 122451924119152
      // 00f: lxor
      // 010: lstore 8
      // 012: pop2
      // 013: ldc2_w -5586520042815287214
      // 016: lload 6
      // 018: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: aload 0
      // 01e: aload 1
      // 01f: aload 2
      // 020: iload 3
      // 021: iload 4
      // 023: iload 5
      // 025: invokespecial javax/swing/DefaultListCellRenderer.getListCellRendererComponent (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component;
      // 028: pop
      // 029: astore 10
      // 02b: aload 2
      // 02c: checkcast java/io/File
      // 02f: astore 11
      // 031: aload 10
      // 033: ifnull 064
      // 036: aload 11
      // 038: ifnonnull 066
      // 03b: goto 049
      // 03e: ldc2_w -5561584245091104503
      // 041: lload 6
      // 043: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: athrow
      // 049: aload 0
      // 04a: ldc ""
      // 04c: ldc2_w -5335291344105553898
      // 04f: lload 6
      // 051: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: goto 064
      // 059: ldc2_w -5561584245091104503
      // 05c: lload 6
      // 05e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 0
      // 065: areturn
      // 066: bipush 0
      // 067: istore 12
      // 069: iload 3
      // 06a: bipush -1
      // 06b: if_icmpeq 097
      // 06e: aload 11
      // 070: ldc2_w -5934931008341799585
      // 073: lload 6
      // 075: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: astore 13
      // 07c: aload 13
      // 07e: ifnull 097
      // 081: iinc 12 1
      // 084: aload 13
      // 086: ldc2_w -5934931008341799585
      // 089: lload 6
      // 08b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: astore 13
      // 092: aload 10
      // 094: ifnonnull 07c
      // 097: aload 0
      // 098: ldc2_w -6098242342037379639
      // 09b: lload 6
      // 09d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_nx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: aload 11
      // 0a4: lload 8
      // 0a6: bipush 2
      // 0a7: anewarray 125
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w -5522998412362043963
      // 0bb: lload 6
      // 0bd: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljavax/swing/Icon; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: astore 13
      // 0c4: aload 0
      // 0c5: ldc2_w -6071967150902327374
      // 0c8: lload 6
      // 0ca: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: aload 13
      // 0d1: ldc2_w -5357621001523758107
      // 0d4: lload 6
      // 0d6: invokedynamic q (Ljava/lang/Object;Ljavax/swing/Icon;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 0
      // 0dc: ldc2_w -6071967150902327374
      // 0df: lload 6
      // 0e1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: iload 12
      // 0e8: ldc2_w -5349909252054672331
      // 0eb: lload 6
      // 0ed: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: ldc2_w -6071967150902327374
      // 0f7: lload 6
      // 0f9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: ldc2_w -5375633569340854523
      // 101: lload 6
      // 103: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: aload 0
      // 109: areturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
