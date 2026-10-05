package com.zelix;

public class _z1 extends _zl {
   final di L;

   _z1(di var1) {
      this.L = var1;
   }

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
      // 025: astore 7
      // 027: aload 0
      // 028: ldc2_w -3077267564882311797
      // 02b: lload 3
      // 02c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aload 7
      // 033: ifnull 104
      // 036: lload 5
      // 038: dup2_x1
      // 039: pop2
      // 03a: bipush 2
      // 03b: anewarray 77
      // 03e: dup_x1
      // 03f: swap
      // 040: bipush 1
      // 041: swap
      // 042: aastore
      // 043: dup_x2
      // 044: dup_x2
      // 045: pop
      // 046: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 049: bipush 0
      // 04a: swap
      // 04b: aastore
      // 04c: ldc2_w -3658408896777029663
      // 04f: lload 3
      // 050: invokedynamic s (Ljava/lang/Object;JJ)Ljavax/swing/JTextField; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: ldc2_w -3482669641815013866
      // 058: lload 3
      // 059: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 061: invokevirtual java/lang/String.length ()I
      // 064: ifle 0ed
      // 067: goto 074
      // 06a: ldc2_w -3322579268271065891
      // 06d: lload 3
      // 06e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: aload 0
      // 075: ldc2_w -3077267564882311797
      // 078: lload 3
      // 079: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: aload 7
      // 080: ifnull 104
      // 083: goto 090
      // 086: ldc2_w -3322579268271065891
      // 089: lload 3
      // 08a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: lload 3
      // 091: lconst_0
      // 092: lcmp
      // 093: iflt 0f7
      // 096: ldc2_w -3408323424860987806
      // 099: lload 3
      // 09a: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: ldc2_w -3926655298862224088
      // 0a2: lload 3
      // 0a3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0ab: invokevirtual java/lang/String.length ()I
      // 0ae: ifle 0ed
      // 0b1: goto 0be
      // 0b4: ldc2_w -3322579268271065891
      // 0b7: lload 3
      // 0b8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w -3077267564882311797
      // 0c2: lload 3
      // 0c3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: ldc2_w -3686892754988695923
      // 0cb: lload 3
      // 0cc: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: bipush 1
      // 0d2: ldc2_w -3651808934771378167
      // 0d5: lload 3
      // 0d6: invokedynamic k (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 7
      // 0dd: ifnonnull 117
      // 0e0: goto 0ed
      // 0e3: ldc2_w -3322579268271065891
      // 0e6: lload 3
      // 0e7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: ldc2_w -3077267564882311797
      // 0f1: lload 3
      // 0f2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/di; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: goto 104
      // 0fa: ldc2_w -3322579268271065891
      // 0fd: lload 3
      // 0fe: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: ldc2_w -3686892754988695923
      // 107: lload 3
      // 108: invokedynamic o (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: bipush 0
      // 10e: ldc2_w -3651808934771378167
      // 111: lload 3
      // 112: invokedynamic k (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
