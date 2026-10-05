package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class t8 implements Iterator {
   private int J;
   final a3 S;
   private Object[] q;
   private static final long a = ess.a(1537713193706456368L, 978964846451087798L, MethodHandles.lookup().lookupClass()).a(208964468325376L);

   @Override
   public Object next() {
      long var1 = a ^ 49695543228385L;
      Object[] var10000 = x44.a<"m">(this, 8570743855469933657L, var1);
      int var10003 = x44.a<"m">(this, 7702021361875664685L, var1);
      x44.a<"r">(this, var10003 + 1, 7702021361875664685L, var1);
      return var10000[var10003];
   }

   t8(int var1, int var2, byte var3, a3 var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      this.S = var4;
      super();
      x44.a<"v">(
         this,
         x44.a<"u">(new Object[]{x44.a<"i">(this, -4780585001883770949L, var5)}, -5051985253428793114L, var5)
            .toArray(new Object[x44.a<"u">(new Object[]{x44.a<"i">(this, -4780585001883770949L, var5)}, -5051985253428793114L, var5).size()]),
         -6862035483192106387L,
         var5
      );
      x44.a<"v">(this, 0, -4839308381183186663L, var5);
   }

   @Override
   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/t8.a J
      // 03: ldc2_w 25476967855203
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 7776190916136825582
      // 0b: lload 1
      // 0c: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: ldc2_w 7593396104033254575
      // 16: lload 1
      // 17: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 3
      // 1d: ifnonnull 49
      // 20: aload 0
      // 21: ldc2_w 8463209524684699611
      // 24: lload 1
      // 25: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: arraylength
      // 2b: if_icmpge 4c
      // 2e: goto 3b
      // 31: ldc2_w 7494150885459337792
      // 34: lload 1
      // 35: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 49
      // 3f: ldc2_w 7494150885459337792
      // 42: lload 1
      // 43: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: goto 4d
      // 4c: bipush 0
      // 4d: ireturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
