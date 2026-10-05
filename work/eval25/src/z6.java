package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Vector;

public class z6 extends jf implements _un {
   Vector a;
   private static final long b = ess.a(-8616663417501608578L, 6977032459960510620L, MethodHandles.lookup().lookupClass()).a(196821149957274L);

   public void t(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:28 from source 25_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 00e: checkcast com/zelix/_za
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 74398442165784
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 0
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 134528422017690
      // 02e: lxor
      // 02f: lstore 10
      // 031: pop2
      // 032: ldc2_w 9148277501292601163
      // 035: lload 3
      // 036: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 0
      // 03c: lload 10
      // 03e: bipush 1
      // 03f: anewarray 15
      // 042: dup_x2
      // 043: dup_x2
      // 044: pop
      // 045: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 048: bipush 0
      // 049: swap
      // 04a: aastore
      // 04b: ldc2_w 7145691849331111744
      // 04e: lload 3
      // 04f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: istore 13
      // 056: bipush 0
      // 057: istore 14
      // 059: astore 12
      // 05b: iload 14
      // 05d: iload 13
      // 05f: if_icmpge 0b2
      // 062: lload 3
      // 063: lconst_0
      // 064: lcmp
      // 065: iflt 09a
      // 068: aload 0
      // 069: iload 14
      // 06b: invokevirtual com/zelix/z6.e (I)Lcom/zelix/_za;
      // 06e: aload 12
      // 070: ifnonnull 0b4
      // 073: lload 8
      // 075: aload 0
      // 076: aload 2
      // 077: bipush 3
      // 078: anewarray 15
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 2
      // 07e: swap
      // 07f: aastore
      // 080: dup_x1
      // 081: swap
      // 082: bipush 1
      // 083: swap
      // 084: aastore
      // 085: dup_x2
      // 086: dup_x2
      // 087: pop
      // 088: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: ldc2_w 8818198965911889370
      // 091: lload 3
      // 092: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: iinc 14 1
      // 09a: aload 12
      // 09c: ifnull 05b
      // 09f: lload 3
      // 0a0: lconst_0
      // 0a1: lcmp
      // 0a2: ifle 062
      // 0a5: goto 0b2
      // 0a8: ldc2_w 7139482458487122957
      // 0ab: lload 3
      // 0ac: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 5
      // 0b4: checkcast com/zelix/jz
      // 0b7: astore 14
      // 0b9: bipush 0
      // 0ba: istore 15
      // 0bc: iload 15
      // 0be: aload 0
      // 0bf: ldc2_w 7225303869985524486
      // 0c2: lload 3
      // 0c3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: invokevirtual java/util/Vector.size ()I
      // 0cb: if_icmpge 107
      // 0ce: aload 14
      // 0d0: aload 0
      // 0d1: ldc2_w 7225303869985524486
      // 0d4: lload 3
      // 0d5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: iload 15
      // 0dc: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0df: checkcast java/lang/String
      // 0e2: lload 6
      // 0e4: bipush 2
      // 0e5: anewarray 15
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 7296993001066377075
      // 0f9: lload 3
      // 0fa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iinc 15 1
      // 102: aload 12
      // 104: ifnull 0bc
      // 107: lload 3
      // 108: lconst_0
      // 109: lcmp
      // 10a: iflt 102
      // 10d: return
   }

   public void m(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"m">(this, 8094423249157168918L, var3).addElement(var2);
   }

   public z6(int var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 76420082360634L;
      super(var4, var1);
      x44.a<"v">(this, new Vector(), 4195415469245420922L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
