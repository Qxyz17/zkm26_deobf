package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class y8 {
   private List F;
   private static final long a = ess.a(1382589935027231250L, -9062765982096761556L, MethodHandles.lookup().lookupClass()).a(231146494206582L);

   y8(long var1) {
      var1 = a ^ var1;
      super();
      x44.a<"s">(this, new ArrayList(), -4321883930252031231L, var1);
   }

   @Override
   public Object clone() {
      long var1 = a ^ 15333812386038L;
      long var3 = var1 ^ 29762034693517L;
      y8 var5 = new y8(var3);
      x44.a<"t">(var5, new ArrayList(x44.a<"k">(this, -5200816605237495594L, var1)), -5200816605237495594L, var1);
      return var5;
   }

   void S(Object[] var1) {
      _9 var6 = (_9)var1[0];
      ig var5 = (ig)var1[1];
      long var3 = (Long)var1[2];
      boolean var2 = (Boolean)var1[3];
      var3 = a ^ var3;
      long var7 = var3 ^ 43073444770268L;
      q3 var9 = new q3(var7, var6, var5, var2);
      x44.a<"l">(this, 8349025073804115161L, var3).add(var9);
   }

   void D(Object[] var1) {
      _9 var2 = (_9)var1[0];
      long var3 = (Long)var1[1];
      ig var5 = (ig)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 59397723031430L;
      Object[] var10006 = new Object[]{null, null, null, false};
      var10006[2] = var6;
      var10006[1] = var5;
      var10006[0] = var2;
      x44.a<"l">(this, var10006, -612010572892285053L, var3);
   }

   void k(Object[] var1) {
      long var2 = (Long)var1[0];
      _9 var4 = (_9)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 20805745683556L;
      Object[] var10005 = new Object[]{null, null, false};
      var10005[1] = var5;
      var10005[0] = var4;
      x44.a<"o">(this, var10005, -6554396161993612767L, var2);
   }

   ig j(Object[] param1) {
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
      // 0c: getstatic com/zelix/y8.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 9387134405664
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -1826128925896892887
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w -2195363507755028852
      // 2a: lload 2
      // 2b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnull 77
      // 35: invokeinterface java/util/List.size ()I 1
      // 3a: ifle 97
      // 3d: goto 4a
      // 40: ldc2_w -1986788413404763417
      // 43: lload 2
      // 44: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: ldc2_w -2195363507755028852
      // 4e: lload 2
      // 4f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: aload 0
      // 55: ldc2_w -2195363507755028852
      // 58: lload 2
      // 59: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: invokeinterface java/util/List.size ()I 1
      // 63: bipush 1
      // 64: isub
      // 65: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6a: goto 77
      // 6d: ldc2_w -1986788413404763417
      // 70: lload 2
      // 71: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: checkcast com/zelix/q3
      // 7a: lload 4
      // 7c: bipush 1
      // 7d: anewarray 32
      // 80: dup_x2
      // 81: dup_x2
      // 82: pop
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w -1855422804062311427
      // 8c: lload 2
      // 8d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: astore 7
      // 94: aload 7
      // 96: areturn
      // 97: aconst_null
      // 98: areturn
   }

   void c(Object[] var1) {
      _9 var3 = (_9)var1[0];
      long var4 = (Long)var1[1];
      boolean var2 = (Boolean)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 107991153432337L;
      q3 var8 = new q3(var3, var2, var6);
      x44.a<"m">(this, 589120905034139432L, var4).add(var8);
   }

   Enumeration T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.enumeration(x44.a<"l">(this, -3364780501675483575L, var2));
   }

   private static gj a(gj var0) {
      return var0;
   }
}
