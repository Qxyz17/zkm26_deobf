package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class v0 implements Comparator {
   final _yz d;
   private static final long a = ess.a(22635154695613598L, -4571156025302747511L, MethodHandles.lookup().lookupClass()).a(67248470821729L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 139549091844172L;
      long var5 = var3 ^ 121625760122223L;
      return x44.a<"j">(this, new Object[]{var5, (ig)var1, (ig)var2}, -1606794952157876045L, var3);
   }

   public int o(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/ig
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/ig
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/v0.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: ldc2_w 2041266270405492812
      // 26: lload 4
      // 28: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 2
      // 2e: invokevirtual com/zelix/ig.z ()Ljava/lang/String;
      // 31: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 34: aload 3
      // 35: invokevirtual com/zelix/ig.z ()Ljava/lang/String;
      // 38: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 3b: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 3e: istore 7
      // 40: astore 6
      // 42: iload 7
      // 44: aload 6
      // 46: ifnonnull 79
      // 49: ifne 77
      // 4c: goto 5a
      // 4f: ldc2_w 1768255847520776544
      // 52: lload 4
      // 54: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 2
      // 5b: invokevirtual com/zelix/ig.A ()Ljava/lang/String;
      // 5e: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 61: aload 3
      // 62: invokevirtual com/zelix/ig.A ()Ljava/lang/String;
      // 65: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 68: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 6b: ireturn
      // 6c: ldc2_w 1768255847520776544
      // 6f: lload 4
      // 71: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: iload 7
      // 79: ireturn
   }

   v0(_yz var1) {
      this.d = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
