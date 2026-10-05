package com.zelix;

import java.lang.invoke.MethodHandles;

public class o1 extends y1 implements _zg {
   protected String n;
   private static final long a = ess.a(-6588817414387065282L, -317265012201664000L, MethodHandles.lookup().lookupClass()).a(89494598485112L);

   public final void h(rp param1, aa param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 125260297239963
      // 05: lxor
      // 06: lstore 5
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 7
      // 0f: pop2
      // 10: ldc2_w 8264398724260313806
      // 13: lload 3
      // 14: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 0
      // 1a: bipush 0
      // 1b: invokevirtual com/zelix/o1.a (I)Lcom/zelix/rp;
      // 1e: checkcast com/zelix/y1
      // 21: astore 10
      // 23: aload 10
      // 25: aload 0
      // 26: aload 2
      // 27: lload 7
      // 29: ldc2_w 7734811105405869785
      // 2c: lload 3
      // 2d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 9
      // 34: iload 9
      // 36: ifeq 92
      // 39: aload 10
      // 3b: instanceof com/zelix/oe
      // 3e: ifeq 6d
      // 41: goto 4e
      // 44: ldc2_w 8495933587254889163
      // 47: lload 3
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 10
      // 51: checkcast com/zelix/oe
      // 54: invokevirtual com/zelix/oe.v ()Ljava/lang/String;
      // 57: ldc2_w 7922433380606667205
      // 5a: lload 3
      // 5b: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: goto 6d
      // 63: ldc2_w 8495933587254889163
      // 66: lload 3
      // 67: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 1
      // 6f: aload 2
      // 70: lload 5
      // 72: bipush 3
      // 73: anewarray 35
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 2
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x1
      // 80: swap
      // 81: bipush 1
      // 82: swap
      // 83: aastore
      // 84: dup_x1
      // 85: swap
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w 7717585786062986577
      // 8c: lload 3
      // 8d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: return
   }

   public void u(Object[] var1) {
      rp var2 = (rp)var1[0];
      aa var3 = (aa)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 113721637855562L;
      o9 var8 = (o9)var2;
      x44.a<"o">(var8, new Object[]{var6, x44.a<"k">(this, 869309603931916327L, var4)}, 1423519280064030929L, var4);
   }

   public o1(int var1) {
      super(var1);
   }

   public void o(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"s">(this, var2, -6086788181436125264L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
