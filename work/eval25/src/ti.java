package com.zelix;

import java.lang.invoke.MethodHandles;

public class ti {
   private final int k;
   private final String S;
   private final String n;
   private final String f;
   private static final long a = ess.a(1090464292425456753L, 3046089214417135665L, MethodHandles.lookup().lookupClass()).a(1662881539118L);

   @Override
   public int hashCode() {
      return this.k;
   }

   public ti(String var1, String var2, String var3) {
      this.f = var1;
      this.S = var2;
      this.n = var3;
      this.k = var1.hashCode() ^ var2.hashCode() ^ var3.hashCode();
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ti.a J
      // 003: ldc2_w 45320053738804
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -4995608322627197260
      // 00b: lload 2
      // 00c: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: instanceof com/zelix/ti
      // 017: aload 4
      // 019: ifnonnull 105
      // 01c: ifeq 104
      // 01f: goto 02c
      // 022: ldc2_w -5076301206740527966
      // 025: lload 2
      // 026: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/ti
      // 030: astore 5
      // 032: aload 0
      // 033: getfield com/zelix/ti.k I
      // 036: aload 4
      // 038: ifnonnull 075
      // 03b: aload 5
      // 03d: getfield com/zelix/ti.k I
      // 040: if_icmpne 102
      // 043: goto 050
      // 046: ldc2_w -5076301206740527966
      // 049: lload 2
      // 04a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: aload 0
      // 051: ldc2_w -6452414811465371511
      // 054: lload 2
      // 055: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: aload 5
      // 05c: ldc2_w -6452414811465371511
      // 05f: lload 2
      // 060: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 068: goto 075
      // 06b: ldc2_w -5076301206740527966
      // 06e: lload 2
      // 06f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: aload 4
      // 077: ifnonnull 0af
      // 07a: ifeq 102
      // 07d: goto 08a
      // 080: ldc2_w -5076301206740527966
      // 083: lload 2
      // 084: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: aload 0
      // 08b: ldc2_w -4781726305936396146
      // 08e: lload 2
      // 08f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: aload 5
      // 096: ldc2_w -4781726305936396146
      // 099: lload 2
      // 09a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a2: goto 0af
      // 0a5: ldc2_w -5076301206740527966
      // 0a8: lload 2
      // 0a9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 4
      // 0b1: ifnonnull 0e9
      // 0b4: ifeq 102
      // 0b7: goto 0c4
      // 0ba: ldc2_w -5076301206740527966
      // 0bd: lload 2
      // 0be: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: ldc2_w -6720693851453710233
      // 0c8: lload 2
      // 0c9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: aload 5
      // 0d0: ldc2_w -6720693851453710233
      // 0d3: lload 2
      // 0d4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0dc: goto 0e9
      // 0df: ldc2_w -5076301206740527966
      // 0e2: lload 2
      // 0e3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 4
      // 0eb: ifnonnull 0ff
      // 0ee: ifeq 102
      // 0f1: goto 0fe
      // 0f4: ldc2_w -5076301206740527966
      // 0f7: lload 2
      // 0f8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: bipush 1
      // 0ff: goto 103
      // 102: bipush 0
      // 103: ireturn
      // 104: bipush 0
      // 105: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
