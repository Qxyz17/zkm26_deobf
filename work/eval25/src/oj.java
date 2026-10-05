package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class oj extends op implements ws, vz {
   private List M;
   private String U;
   private static final long a = ess.a(-5608432830404734718L, -506990166773329258L, MethodHandles.lookup().lookupClass()).a(144235835593757L);

   public void z(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      x44.a<"n">(this, 7255889964188210647L, var2).add(var4);
   }

   protected void N(Object[] var1) {
      rp var4 = (rp)var1[0];
      aa var6 = (aa)var1[1];
      int var5 = (Integer)var1[2];
      long var2 = (Long)var1[3];
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 79640242969806
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 7347653650357
      // 20: lxor
      // 21: lstore 7
      // 23: pop2
      // 24: ldc2_w -9081116292456134266
      // 27: lload 2
      // 28: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: istore 9
      // 2f: aload 0
      // 30: ldc2_w -7012689284814794193
      // 33: lload 2
      // 34: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: iload 9
      // 3b: ifeq 65
      // 3e: ifnull bd
      // 41: goto 4e
      // 44: ldc2_w -9109333059386654213
      // 47: lload 2
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: ldc2_w -7012689284814794193
      // 52: lload 2
      // 53: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: goto 65
      // 5b: ldc2_w -9109333059386654213
      // 5e: lload 2
      // 5f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: invokevirtual java/lang/String.length ()I
      // 68: lload 2
      // 69: lconst_0
      // 6a: lcmp
      // 6b: iflt ad
      // 6e: ifle bd
      // 71: aload 4
      // 73: aload 0
      // 74: ldc2_w -8953967804949826856
      // 77: lload 2
      // 78: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: lload 7
      // 7f: dup2_x1
      // 80: pop2
      // 81: aload 0
      // 82: ldc2_w -7012689284814794193
      // 85: lload 2
      // 86: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: bipush 3
      // 8c: anewarray 72
      // 8f: dup_x1
      // 90: swap
      // 91: bipush 2
      // 92: swap
      // 93: aastore
      // 94: dup_x1
      // 95: swap
      // 96: bipush 1
      // 97: swap
      // 98: aastore
      // 99: dup_x2
      // 9a: dup_x2
      // 9b: pop
      // 9c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f: bipush 0
      // a0: swap
      // a1: aastore
      // a2: ldc2_w -8880604435986668633
      // a5: lload 2
      // a6: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: iload 9
      // ad: ifne f5
      // b0: goto bd
      // b3: ldc2_w -9109333059386654213
      // b6: lload 2
      // b7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: athrow
      // bd: aload 4
      // bf: aload 0
      // c0: ldc2_w -8953967804949826856
      // c3: lload 2
      // c4: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: lload 5
      // cb: dup2_x1
      // cc: pop2
      // cd: bipush 2
      // ce: anewarray 72
      // d1: dup_x1
      // d2: swap
      // d3: bipush 1
      // d4: swap
      // d5: aastore
      // d6: dup_x2
      // d7: dup_x2
      // d8: pop
      // d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dc: bipush 0
      // dd: swap
      // de: aastore
      // df: ldc2_w -7012183104155805665
      // e2: lload 2
      // e3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e8: goto f5
      // eb: ldc2_w -9109333059386654213
      // ee: lload 2
      // ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f4: athrow
      // f5: return
   }

   public void m(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"r">(this, var4, -1710836472928312125L, var2);
   }

   public oj(int var1, long var2) {
      var2 = a ^ var2;
      super(var1);
      x44.a<"q">(this, new ArrayList(), 4272267550722542127L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
