package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _nd implements Comparator {
   final _zx b;
   private static final long a = ess.a(-5500059186548449220L, -1833592456426405642L, MethodHandles.lookup().lookupClass()).a(23662275355838L);

   public int u(_y3 param1, _y3 param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_nd.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: ldc2_w 7140501634117584117
      // 09: lload 3
      // 0a: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 1
      // 10: astore 6
      // 12: aload 2
      // 13: astore 7
      // 15: istore 5
      // 17: aload 6
      // 19: invokevirtual com/zelix/_y3.t ()Ljava/lang/String;
      // 1c: astore 8
      // 1e: aload 7
      // 20: invokevirtual com/zelix/_y3.t ()Ljava/lang/String;
      // 23: astore 9
      // 25: aload 8
      // 27: aload 8
      // 29: ldc " "
      // 2b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2e: bipush 1
      // 2f: iadd
      // 30: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 33: astore 10
      // 35: aload 9
      // 37: aload 9
      // 39: ldc " "
      // 3b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 3e: bipush 1
      // 3f: iadd
      // 40: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 43: astore 11
      // 45: aload 10
      // 47: aload 11
      // 49: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 4c: istore 12
      // 4e: iload 12
      // 50: iload 5
      // 52: ifne 79
      // 55: ifne 77
      // 58: goto 65
      // 5b: ldc2_w 7430445009881411119
      // 5e: lload 3
      // 5f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 8
      // 67: aload 9
      // 69: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 6c: ireturn
      // 6d: ldc2_w 7430445009881411119
      // 70: lload 3
      // 71: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: iload 12
      // 79: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 58451293931727L;
      long var5 = var3 ^ 121496625144281L;
      return this.u((_y3)var1, (_y3)var2, var5);
   }

   _nd(_zx var1) {
      this.b = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
