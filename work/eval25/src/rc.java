package com.zelix;

import java.lang.invoke.MethodHandles;

public class rc implements Comparable {
   public float g;
   public Object V;
   private static final long a = ess.a(5073032866091141750L, 3914201232738484115L, MethodHandles.lookup().lookupClass()).a(225949085097939L);

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 110046990265234L;
      long var4 = var2 ^ 5910267171666L;
      return x44.a<"o">(this, var4, (rc)var1, -962177991630624830L, var2);
   }

   public int x(long param1, rc param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/rc.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 7645688755915879198
      // 09: lload 1
      // 0a: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 4
      // 11: aload 0
      // 12: getfield com/zelix/rc.g F
      // 15: aload 3
      // 16: getfield com/zelix/rc.g F
      // 19: fcmpg
      // 1a: aload 4
      // 1c: ifnonnull 44
      // 1f: ifge 3b
      // 22: goto 2f
      // 25: ldc2_w 8498140174586375592
      // 28: lload 1
      // 29: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: athrow
      // 2f: bipush -1
      // 30: ireturn
      // 31: ldc2_w 8498140174586375592
      // 34: lload 1
      // 35: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield com/zelix/rc.g F
      // 3f: aload 3
      // 40: getfield com/zelix/rc.g F
      // 43: fcmpl
      // 44: aload 4
      // 46: ifnonnull 66
      // 49: ifne 65
      // 4c: goto 59
      // 4f: ldc2_w 8498140174586375592
      // 52: lload 1
      // 53: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
      // 5b: ldc2_w 8498140174586375592
      // 5e: lload 1
      // 5f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: bipush 1
      // 66: ireturn
   }

   public rc(float var1, long var2, Object var4) {
      var2 = a ^ var2;
      super();
      this.g = var1;
      x44.a<"w">(this, var4, -113334731672782911L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
