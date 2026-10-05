package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class tu implements Comparator {
   private static final tu o = new tu();
   private static final long a = ess.a(-5540403060407682259L, 8033589896375150883L, MethodHandles.lookup().lookupClass()).a(272162496776476L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 54465319186554L;
      long var5 = var3 ^ 54383890190717L;
      return x44.a<"l">(this, new Object[]{var5, (File)var1, (File)var2}, 3466464699794258870L, var3);
   }

   public int I(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/File
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/io/File
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/tu.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: ldc2_w 8338117659460583012
      // 25: lload 2
      // 26: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 4
      // 2d: ldc2_w 8442133354425063605
      // 30: lload 2
      // 31: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 39: astore 7
      // 3b: astore 6
      // 3d: aload 5
      // 3f: ldc2_w 8442133354425063605
      // 42: lload 2
      // 43: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 4b: astore 8
      // 4d: aload 4
      // 4f: ldc2_w 8412542987175196510
      // 52: lload 2
      // 53: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: aload 6
      // 5a: ifnonnull b9
      // 5d: ifeq ae
      // 60: goto 6d
      // 63: ldc2_w 7766683787900182143
      // 66: lload 2
      // 67: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 5
      // 6f: ldc2_w 8412542987175196510
      // 72: lload 2
      // 73: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: aload 6
      // 7a: ifnonnull ad
      // 7d: goto 8a
      // 80: ldc2_w 7766683787900182143
      // 83: lload 2
      // 84: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: ifne a6
      // 8d: goto 9a
      // 90: ldc2_w 7766683787900182143
      // 93: lload 2
      // 94: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: bipush -1
      // 9b: ireturn
      // 9c: ldc2_w 7766683787900182143
      // 9f: lload 2
      // a0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: aload 7
      // a8: aload 8
      // aa: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // ad: ireturn
      // ae: aload 5
      // b0: ldc2_w 8412542987175196510
      // b3: lload 2
      // b4: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: aload 6
      // bb: ifnonnull e1
      // be: ifeq da
      // c1: goto ce
      // c4: ldc2_w 7766683787900182143
      // c7: lload 2
      // c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: bipush 1
      // cf: ireturn
      // d0: ldc2_w 7766683787900182143
      // d3: lload 2
      // d4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d9: athrow
      // da: aload 7
      // dc: aload 8
      // de: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // e1: ireturn
   }

   public static tu c(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return x44.a<"n">(-5773742777257390980L, var1);
   }

   private tu() {
   }

   private static gj a(gj var0) {
      return var0;
   }
}
