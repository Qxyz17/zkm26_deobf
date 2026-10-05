package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _yb implements Comparator {
   final _ue I;
   private static final long a = ess.a(7562319241050195865L, 4299432971581246606L, MethodHandles.lookup().lookupClass()).a(281177710083227L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 29531394635612L;
      long var5 = var3 ^ 40744090354585L;
      return x44.a<"o">(this, new Object[]{var5, (h8)var1, (h8)var2}, 2297395154382900919L, var3);
   }

   public int X(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/h8
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/h8
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/_yb.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: ldc2_w 4445659192626684330
      // 025: lload 2
      // 026: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 6
      // 02d: aload 5
      // 02f: instanceof com/zelix/hy
      // 032: aload 6
      // 034: ifnonnull 085
      // 037: ifeq 080
      // 03a: goto 047
      // 03d: ldc2_w 4598777916252167157
      // 040: lload 2
      // 041: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: aload 4
      // 049: instanceof com/zelix/hy
      // 04c: aload 6
      // 04e: lload 2
      // 04f: lconst_0
      // 050: lcmp
      // 051: iflt 087
      // 054: ifnonnull 085
      // 057: goto 064
      // 05a: ldc2_w 4598777916252167157
      // 05d: lload 2
      // 05e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: ifne 080
      // 067: goto 074
      // 06a: ldc2_w 4598777916252167157
      // 06d: lload 2
      // 06e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: bipush -1
      // 075: ireturn
      // 076: ldc2_w 4598777916252167157
      // 079: lload 2
      // 07a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 5
      // 082: instanceof com/zelix/hy
      // 085: aload 6
      // 087: lload 2
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 0db
      // 08d: ifnonnull 0d9
      // 090: ifeq 0c7
      // 093: goto 0a0
      // 096: ldc2_w 4598777916252167157
      // 099: lload 2
      // 09a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 4
      // 0a2: instanceof com/zelix/hy
      // 0a5: aload 6
      // 0a7: ifnonnull 116
      // 0aa: goto 0b7
      // 0ad: ldc2_w 4598777916252167157
      // 0b0: lload 2
      // 0b1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: ifne 115
      // 0ba: goto 0c7
      // 0bd: ldc2_w 4598777916252167157
      // 0c0: lload 2
      // 0c1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 5
      // 0c9: instanceof com/zelix/hy
      // 0cc: goto 0d9
      // 0cf: ldc2_w 4598777916252167157
      // 0d2: lload 2
      // 0d3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: aload 6
      // 0db: ifnonnull 118
      // 0de: ifne 117
      // 0e1: goto 0ee
      // 0e4: ldc2_w 4598777916252167157
      // 0e7: lload 2
      // 0e8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: instanceof com/zelix/hy
      // 0f3: aload 6
      // 0f5: ifnonnull 118
      // 0f8: goto 105
      // 0fb: ldc2_w 4598777916252167157
      // 0fe: lload 2
      // 0ff: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: ifne 117
      // 108: goto 115
      // 10b: ldc2_w 4598777916252167157
      // 10e: lload 2
      // 10f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: bipush 0
      // 116: ireturn
      // 117: bipush 1
      // 118: ireturn
   }

   _yb(_ue var1) {
      this.I = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
