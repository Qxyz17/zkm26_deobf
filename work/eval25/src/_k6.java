package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class _k6 implements t9 {
   private static boolean j;
   protected t9 g;
   protected t9[] t;
   protected int P;
   private static final long d = ess.a(3001471555710387075L, 799090627649905770L, MethodHandles.lookup().lookupClass()).a(243860622028232L);

   public static boolean B() {
      return j;
   }

   @Override
   public String toString() {
      long var1 = d ^ 95106055428623L;
      return x44.a<"k">(1259432202297725400L, var1)[x44.a<"n">(this, 778638276931055794L, var1)];
   }

   public void k(Object[] var1) {
   }

   public static void v(boolean var0) {
      j = var0;
   }

   public static boolean T() {
      boolean var0 = B();
      return !var0;
   }

   public void X(Object[] param1) {
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
      // 004: checkcast com/zelix/t9
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: ldc2_w -2144320036593040707
      // 021: lload 4
      // 023: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: istore 6
      // 02a: aload 0
      // 02b: iload 6
      // 02d: lload 4
      // 02f: lconst_0
      // 030: lcmp
      // 031: iflt 064
      // 034: ifne 061
      // 037: ldc2_w -1827920377179794842
      // 03a: lload 4
      // 03c: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: ifnonnull 07d
      // 044: goto 052
      // 047: ldc2_w -436574452001300928
      // 04a: lload 4
      // 04c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: aload 0
      // 053: goto 061
      // 056: ldc2_w -436574452001300928
      // 059: lload 4
      // 05b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: iload 2
      // 062: bipush 1
      // 063: iadd
      // 064: anewarray 69
      // 067: ldc2_w -1827920377179794842
      // 06a: lload 4
      // 06c: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/t9;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: lload 4
      // 073: lconst_0
      // 074: lcmp
      // 075: ifle 104
      // 078: iload 6
      // 07a: ifeq 0f6
      // 07d: iload 2
      // 07e: lload 4
      // 080: lconst_0
      // 081: lcmp
      // 082: ifle 0c6
      // 085: aload 0
      // 086: ldc2_w -1827920377179794842
      // 089: lload 4
      // 08b: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: arraylength
      // 091: iload 6
      // 093: ifne 0c5
      // 096: goto 0a4
      // 099: ldc2_w -436574452001300928
      // 09c: lload 4
      // 09e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: if_icmplt 0f6
      // 0a7: goto 0b5
      // 0aa: ldc2_w -436574452001300928
      // 0ad: lload 4
      // 0af: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: iload 2
      // 0b6: bipush 1
      // 0b7: goto 0c5
      // 0ba: ldc2_w -436574452001300928
      // 0bd: lload 4
      // 0bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: iadd
      // 0c6: anewarray 69
      // 0c9: astore 7
      // 0cb: aload 0
      // 0cc: ldc2_w -1827920377179794842
      // 0cf: lload 4
      // 0d1: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: bipush 0
      // 0d7: aload 7
      // 0d9: bipush 0
      // 0da: aload 0
      // 0db: ldc2_w -1827920377179794842
      // 0de: lload 4
      // 0e0: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: arraylength
      // 0e6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e9: aload 0
      // 0ea: aload 7
      // 0ec: ldc2_w -1827920377179794842
      // 0ef: lload 4
      // 0f1: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/t9;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: aload 0
      // 0f7: ldc2_w -1827920377179794842
      // 0fa: lload 4
      // 0fc: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: iload 2
      // 102: aload 3
      // 103: aastore
      // 104: return
   }

   public void u(Object[] var1) {
      t9 var2 = (t9)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"w">(this, var2, 8888584199677475572L, var3);
   }

   public void B(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/t9
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_fs
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 96730145793794
      // 28: lxor
      // 29: lstore 8
      // 2b: dup2
      // 2c: ldc2_w 39984333814216
      // 2f: lxor
      // 30: lstore 10
      // 32: pop2
      // 33: ldc2_w -7081916324337484489
      // 36: lload 4
      // 38: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: aload 0
      // 3e: lload 8
      // 40: bipush 1
      // 41: anewarray 104
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w -9008633734365849112
      // 50: lload 4
      // 52: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: istore 13
      // 59: istore 12
      // 5b: bipush 0
      // 5c: istore 14
      // 5e: iload 14
      // 60: iload 13
      // 62: if_icmpge b6
      // 65: aload 0
      // 66: iload 14
      // 68: lload 10
      // 6a: bipush 2
      // 6b: anewarray 104
      // 6e: dup_x2
      // 6f: dup_x2
      // 70: pop
      // 71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74: bipush 1
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7c: bipush 0
      // 7d: swap
      // 7e: aastore
      // 7f: ldc2_w -7167700983208906369
      // 82: lload 4
      // 84: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: lload 6
      // 8b: aload 0
      // 8c: aload 2
      // 8d: bipush 3
      // 8e: anewarray 104
      // 91: dup_x1
      // 92: swap
      // 93: bipush 2
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 1
      // 99: swap
      // 9a: aastore
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 0
      // a2: swap
      // a3: aastore
      // a4: ldc2_w -9173668538400364768
      // a7: lload 4
      // a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: iinc 14 1
      // b1: iload 12
      // b3: ifeq 5e
      // b6: lload 4
      // b8: lconst_0
      // b9: lcmp
      // ba: ifle b1
      // bd: return
   }

   public t9 S(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      return x44.a<"k">(this, -2241690277447265244L, var2)[var4];
   }

   public int G(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: ldc2_w 4230478080112089653
      // 0f: lload 2
      // 10: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: ldc2_w 4479279761565600494
      // 1b: lload 2
      // 1c: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: iload 4
      // 23: ifne 4e
      // 26: ifnonnull 44
      // 29: goto 36
      // 2c: ldc2_w 2411832591385970376
      // 2f: lload 2
      // 30: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: bipush 0
      // 37: goto 4f
      // 3a: ldc2_w 2411832591385970376
      // 3d: lload 2
      // 3e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w 4479279761565600494
      // 48: lload 2
      // 49: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/t9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: arraylength
      // 4f: ireturn
   }

   public _k6(long var1, char var3, int var4) {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ d;
      super();
      x44.a<"q">(this, var4, -2889511299335672422L, var5);
   }

   public void A(Object[] var1) {
   }

   static {
      long var0 = d ^ 116530482623740L;
      if (!x44.a<"q">(-376015931581702665L, var0)) {
         x44.a<"q">(true, -98199485683374261L, var0);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
