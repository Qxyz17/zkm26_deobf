package com.zelix;

public class ob extends op implements ws, vz {
   private String b;
   private String T;

   public void m(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"r">(this, var4, -1406663338923525806L, var2);
   }

   public void z(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      x44.a<"q">(this, var2, 9051869691398643882L, var3);
   }

   public ob(int var1) {
      super(var1);
   }

   protected void N(Object[] var1) {
      rp var4 = (rp)var1[0];
      aa var3 = (aa)var1[1];
      int var2 = (Integer)var1[2];
      long var5 = (Long)var1[3];
   }

   protected void x(Object[] param1) {
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
      // 04: checkcast com/zelix/aa
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 95047264896214
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 69615922768868
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w -9200718734728878147
      // 26: lload 3
      // 27: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 9
      // 2e: aload 0
      // 2f: ldc2_w -7307503607151358018
      // 32: lload 3
      // 33: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: iload 9
      // 3a: ifne 64
      // 3d: ifnull bb
      // 40: goto 4d
      // 43: ldc2_w -7387232858490062938
      // 46: lload 3
      // 47: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: ldc2_w -7307503607151358018
      // 51: lload 3
      // 52: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: goto 64
      // 5a: ldc2_w -7387232858490062938
      // 5d: lload 3
      // 5e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: invokevirtual java/lang/String.length ()I
      // 67: lload 3
      // 68: lconst_0
      // 69: lcmp
      // 6a: ifle ab
      // 6d: ifle bb
      // 70: aload 2
      // 71: aload 0
      // 72: ldc2_w -7308859215016360027
      // 75: lload 3
      // 76: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: lload 5
      // 7d: dup2_x1
      // 7e: pop2
      // 7f: aload 0
      // 80: ldc2_w -7307503607151358018
      // 83: lload 3
      // 84: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: bipush 3
      // 8a: anewarray 74
      // 8d: dup_x1
      // 8e: swap
      // 8f: bipush 2
      // 90: swap
      // 91: aastore
      // 92: dup_x1
      // 93: swap
      // 94: bipush 1
      // 95: swap
      // 96: aastore
      // 97: dup_x2
      // 98: dup_x2
      // 99: pop
      // 9a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d: bipush 0
      // 9e: swap
      // 9f: aastore
      // a0: ldc2_w -7488485084904353704
      // a3: lload 3
      // a4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: iload 9
      // ab: ifeq f2
      // ae: goto bb
      // b1: ldc2_w -7387232858490062938
      // b4: lload 3
      // b5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: aload 2
      // bc: aload 0
      // bd: ldc2_w -7308859215016360027
      // c0: lload 3
      // c1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: lload 7
      // c8: dup2_x1
      // c9: pop2
      // ca: bipush 2
      // cb: anewarray 74
      // ce: dup_x1
      // cf: swap
      // d0: bipush 1
      // d1: swap
      // d2: aastore
      // d3: dup_x2
      // d4: dup_x2
      // d5: pop
      // d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d9: bipush 0
      // da: swap
      // db: aastore
      // dc: ldc2_w -7015735380084794269
      // df: lload 3
      // e0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: goto f2
      // e8: ldc2_w -7387232858490062938
      // eb: lload 3
      // ec: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: athrow
      // f2: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
