package com.zelix;

public class _z4 extends _zl {
   final di R;

   public void K(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast javax/swing/event/DocumentEvent
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 16456669736739
      // 018: lxor
      // 019: lstore 5
      // 01b: pop2
      // 01c: ldc2_w -3793894231001319741
      // 01f: lload 3
      // 020: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: aload 0
      // 026: ldc2_w -2969261071086702186
      // 029: lload 3
      // 02a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: bipush 1
      // 030: ldc2_w -3179687467124287129
      // 033: lload 3
      // 034: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 7
      // 03b: aload 0
      // 03c: ldc2_w -2969261071086702186
      // 03f: lload 3
      // 040: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aload 7
      // 047: ifnull 0d5
      // 04a: lload 5
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: bipush 2
      // 04f: anewarray 65
      // 052: dup_x1
      // 053: swap
      // 054: bipush 1
      // 055: swap
      // 056: aastore
      // 057: dup_x2
      // 058: dup_x2
      // 059: pop
      // 05a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w -3658408896777029663
      // 063: lload 3
      // 064: invokedynamic s (Ljava/lang/Object;JJ)Ljavax/swing/JTextField; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: ldc2_w -3482669641815013866
      // 06c: lload 3
      // 06d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 075: invokevirtual java/lang/String.length ()I
      // 078: ifle 0be
      // 07b: goto 088
      // 07e: ldc2_w -3316202603463363853
      // 081: lload 3
      // 082: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 0
      // 089: ldc2_w -2969261071086702186
      // 08c: lload 3
      // 08d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: ldc2_w -3438752948642214764
      // 095: lload 3
      // 096: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: ldc " "
      // 09d: ldc2_w -3322792871759288515
      // 0a0: lload 3
      // 0a1: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: lload 3
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 0f0
      // 0ac: aload 7
      // 0ae: ifnonnull 0f0
      // 0b1: goto 0be
      // 0b4: ldc2_w -3316202603463363853
      // 0b7: lload 3
      // 0b8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w -2969261071086702186
      // 0c2: lload 3
      // 0c3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: goto 0d5
      // 0cb: ldc2_w -3316202603463363853
      // 0ce: lload 3
      // 0cf: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: ldc2_w -3438752948642214764
      // 0d8: lload 3
      // 0d9: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: ldc2_w -3366905598974420914
      // 0e1: lload 3
      // 0e2: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: ldc2_w -3322792871759288515
      // 0ea: lload 3
      // 0eb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: aload 0
      // 0f1: ldc2_w -2969261071086702186
      // 0f4: lload 3
      // 0f5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: aload 7
      // 0fc: ifnull 1cd
      // 0ff: lload 5
      // 101: dup2_x1
      // 102: pop2
      // 103: bipush 2
      // 104: anewarray 65
      // 107: dup_x1
      // 108: swap
      // 109: bipush 1
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w -3658408896777029663
      // 118: lload 3
      // 119: invokedynamic s (Ljava/lang/Object;JJ)Ljavax/swing/JTextField; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: ldc2_w -3482669641815013866
      // 121: lload 3
      // 122: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 12a: invokevirtual java/lang/String.length ()I
      // 12d: ifle 1b6
      // 130: goto 13d
      // 133: ldc2_w -3316202603463363853
      // 136: lload 3
      // 137: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 0
      // 13e: ldc2_w -2969261071086702186
      // 141: lload 3
      // 142: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 7
      // 149: ifnull 1cd
      // 14c: goto 159
      // 14f: ldc2_w -3316202603463363853
      // 152: lload 3
      // 153: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: lload 3
      // 15a: lconst_0
      // 15b: lcmp
      // 15c: iflt 1c0
      // 15f: ldc2_w -3408323424860987806
      // 162: lload 3
      // 163: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: ldc2_w -3926655298862224088
      // 16b: lload 3
      // 16c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 174: invokevirtual java/lang/String.length ()I
      // 177: ifle 1b6
      // 17a: goto 187
      // 17d: ldc2_w -3316202603463363853
      // 180: lload 3
      // 181: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 0
      // 188: ldc2_w -2969261071086702186
      // 18b: lload 3
      // 18c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: ldc2_w -3686892754988695923
      // 194: lload 3
      // 195: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: bipush 1
      // 19b: ldc2_w -3651808934771378167
      // 19e: lload 3
      // 19f: invokedynamic k (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: aload 7
      // 1a6: ifnonnull 1e0
      // 1a9: goto 1b6
      // 1ac: ldc2_w -3316202603463363853
      // 1af: lload 3
      // 1b0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: aload 0
      // 1b7: ldc2_w -2969261071086702186
      // 1ba: lload 3
      // 1bb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: goto 1cd
      // 1c3: ldc2_w -3316202603463363853
      // 1c6: lload 3
      // 1c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: ldc2_w -3686892754988695923
      // 1d0: lload 3
      // 1d1: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: bipush 0
      // 1d7: ldc2_w -3651808934771378167
      // 1da: lload 3
      // 1db: invokedynamic k (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: return
   }

   _z4(di var1) {
      this.R = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
