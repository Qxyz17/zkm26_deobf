package com.zelix;

import java.lang.invoke.MethodHandles;

public class oc extends op {
   String u;
   String s;
   boolean p;
   private static final long a = ess.a(-7682340751572991626L, -5836909006618266067L, MethodHandles.lookup().lookupClass()).a(243257564068120L);

   void t(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      x44.a<"p">(this, var4, -6710960184426727293L, var2);
   }

   void Q(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"q">(this, var4, 4972037984869042404L, var2);
   }

   void C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"u">(this, true, -442800564833356736L, var2);
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
      // 16: ldc2_w 66375109288388
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -9081116292456134266
      // 20: lload 2
      // 21: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: ifeq b9
      // 2e: ldc2_w -8882269392028410139
      // 31: lload 2
      // 32: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: ifnonnull b8
      // 3a: goto 47
      // 3d: ldc2_w -9197085809264422573
      // 40: lload 2
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: iload 7
      // 4a: ifeq ad
      // 4d: goto 5a
      // 50: ldc2_w -9197085809264422573
      // 53: lload 2
      // 54: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: lload 2
      // 5b: lconst_0
      // 5c: lcmp
      // 5d: iflt a0
      // 60: ldc2_w -7329046046944946221
      // 63: lload 2
      // 64: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: ifeq 9f
      // 6c: goto 79
      // 6f: ldc2_w -9197085809264422573
      // 72: lload 2
      // 73: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: aload 0
      // 7b: ldc2_w -8960093475433050557
      // 7e: lload 2
      // 7f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: ldc2_w -8882269392028410139
      // 87: lload 2
      // 88: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: iload 7
      // 8f: ifne b8
      // 92: goto 9f
      // 95: ldc2_w -9197085809264422573
      // 98: lload 2
      // 99: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: aload 0
      // a0: goto ad
      // a3: ldc2_w -9197085809264422573
      // a6: lload 2
      // a7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: ldc ""
      // af: ldc2_w -8882269392028410139
      // b2: lload 2
      // b3: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 0
      // b9: ldc2_w -6917772068846374721
      // bc: lload 2
      // bd: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/aa; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: aload 0
      // c3: ldc2_w -8882269392028410139
      // c6: lload 2
      // c7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: aload 0
      // cd: ldc2_w -8960093475433050557
      // d0: lload 2
      // d1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: lload 5
      // d8: dup2_x1
      // d9: pop2
      // da: bipush 3
      // db: anewarray 67
      // de: dup_x1
      // df: swap
      // e0: bipush 2
      // e1: swap
      // e2: aastore
      // e3: dup_x2
      // e4: dup_x2
      // e5: pop
      // e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e9: bipush 1
      // ea: swap
      // eb: aastore
      // ec: dup_x1
      // ed: swap
      // ee: bipush 0
      // ef: swap
      // f0: aastore
      // f1: ldc2_w -7240089926269284687
      // f4: lload 2
      // f5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fa: return
   }

   public oc(int var1) {
      super(var1);
   }

   protected void N(Object[] var1) {
      rp var6 = (rp)var1[0];
      aa var2 = (aa)var1[1];
      int var5 = (Integer)var1[2];
      long var3 = (Long)var1[3];
      long var7 = var3 ^ 130299977244592L;
      x44.a<"n">(var2, new Object[]{var7}, -5647494835423639830L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
