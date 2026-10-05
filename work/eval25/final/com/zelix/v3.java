package com.zelix;

import java.lang.invoke.MethodHandles;

public class v3 extends vj implements Comparable {
   private static final long b = ess.a(-2164465341404490933L, 4118285592565080570L, MethodHandles.lookup().lookupClass()).a(278996175687340L);

   public final int u(Object[] var1) {
      v3 var2 = (v3)var1[0];
      return this.d.compareTo(var2.d);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = b ^ 18448305471889L;
      return x44.a<"i">(this, new Object[]{(v3)var1}, -4617921310380883900L, var2);
   }

   v3(String var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/v3.b J
      // 03: ldc2_w 30508939687314
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 5676354912758400697
      // 0b: lload 1
      // 0c: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 3
      // 12: aload 0
      // 13: getfield com/zelix/v3.p Ljava/lang/String;
      // 16: iload 3
      // 17: ifeq 40
      // 1a: ifnonnull 3c
      // 1d: goto 2a
      // 20: ldc2_w 5712038191188973600
      // 23: lload 1
      // 24: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/zelix/v3.d Ljava/lang/String;
      // 2e: invokevirtual java/lang/String.hashCode ()I
      // 31: ireturn
      // 32: ldc2_w 5712038191188973600
      // 35: lload 1
      // 36: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield com/zelix/v3.d Ljava/lang/String;
      // 40: invokevirtual java/lang/String.hashCode ()I
      // 43: aload 0
      // 44: getfield com/zelix/v3.p Ljava/lang/String;
      // 47: invokevirtual java/lang/String.hashCode ()I
      // 4a: ixor
      // 4b: ireturn
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
      // 000: getstatic com/zelix/v3.b J
      // 003: ldc2_w 105269834587896
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -1897085583288062509
      // 00b: lload 2
      // 00c: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 4
      // 013: aload 1
      // 014: instanceof com/zelix/v3
      // 017: iload 4
      // 019: ifeq 122
      // 01c: ifeq 121
      // 01f: goto 02c
      // 022: ldc2_w -2004250844835138742
      // 025: lload 2
      // 026: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/v3
      // 030: astore 5
      // 032: aload 0
      // 033: getfield com/zelix/v3.d Ljava/lang/String;
      // 036: iload 4
      // 038: ifeq 064
      // 03b: aload 5
      // 03d: getfield com/zelix/v3.d Ljava/lang/String;
      // 040: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 043: ifeq 11f
      // 046: goto 053
      // 049: ldc2_w -2004250844835138742
      // 04c: lload 2
      // 04d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: getfield com/zelix/v3.p Ljava/lang/String;
      // 057: goto 064
      // 05a: ldc2_w -2004250844835138742
      // 05d: lload 2
      // 05e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: iload 4
      // 066: ifeq 0b1
      // 069: ifnonnull 0a0
      // 06c: goto 079
      // 06f: ldc2_w -2004250844835138742
      // 072: lload 2
      // 073: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 5
      // 07b: getfield com/zelix/v3.p Ljava/lang/String;
      // 07e: iload 4
      // 080: ifeq 0b1
      // 083: goto 090
      // 086: ldc2_w -2004250844835138742
      // 089: lload 2
      // 08a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: ifnull 11b
      // 093: goto 0a0
      // 096: ldc2_w -2004250844835138742
      // 099: lload 2
      // 09a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield com/zelix/v3.p Ljava/lang/String;
      // 0a4: goto 0b1
      // 0a7: ldc2_w -2004250844835138742
      // 0aa: lload 2
      // 0ab: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: iload 4
      // 0b3: ifeq 0d8
      // 0b6: ifnull 11f
      // 0b9: goto 0c6
      // 0bc: ldc2_w -2004250844835138742
      // 0bf: lload 2
      // 0c0: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 5
      // 0c8: getfield com/zelix/v3.p Ljava/lang/String;
      // 0cb: goto 0d8
      // 0ce: ldc2_w -2004250844835138742
      // 0d1: lload 2
      // 0d2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: iload 4
      // 0da: ifeq 0fe
      // 0dd: ifnull 11f
      // 0e0: goto 0ed
      // 0e3: ldc2_w -2004250844835138742
      // 0e6: lload 2
      // 0e7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield com/zelix/v3.p Ljava/lang/String;
      // 0f1: goto 0fe
      // 0f4: ldc2_w -2004250844835138742
      // 0f7: lload 2
      // 0f8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 5
      // 100: getfield com/zelix/v3.p Ljava/lang/String;
      // 103: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 106: iload 4
      // 108: ifeq 11c
      // 10b: ifeq 11f
      // 10e: goto 11b
      // 111: ldc2_w -2004250844835138742
      // 114: lload 2
      // 115: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: bipush 1
      // 11c: goto 120
      // 11f: bipush 0
      // 120: ireturn
      // 121: bipush 0
      // 122: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
