package com.zelix;

import java.lang.invoke.MethodHandles;

public class ff extends nv {
   private static final long b = ess.a(4135600953650014843L, -7702011180498224132L, MethodHandles.lookup().lookupClass()).a(208381956754560L);

   public ff(char var1, char var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      int var7 = (int)((var5 ^ 35733743231320L) >>> 48);
      long var8 = (var5 ^ 35733743231320L) << 16 >>> 16;
      super((char)var7, var8, var3);
   }

   boolean A(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 43236354269760
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 6373484469446212045
      // 18: lload 2
      // 19: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: bipush 0
      // 20: invokevirtual com/zelix/ff.e (I)Lcom/zelix/_za;
      // 23: checkcast com/zelix/_f6
      // 26: astore 7
      // 28: astore 6
      // 2a: aload 7
      // 2c: instanceof com/zelix/ca
      // 2f: aload 6
      // 31: ifnonnull 6d
      // 34: ifeq 6c
      // 37: goto 44
      // 3a: ldc2_w 6501650992407458637
      // 3d: lload 2
      // 3e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 7
      // 46: checkcast com/zelix/ca
      // 49: lload 4
      // 4b: bipush 1
      // 4c: anewarray 41
      // 4f: dup_x2
      // 50: dup_x2
      // 51: pop
      // 52: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55: bipush 0
      // 56: swap
      // 57: aastore
      // 58: ldc2_w 4927978526078647236
      // 5b: lload 2
      // 5c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ireturn
      // 62: ldc2_w 6501650992407458637
      // 65: lload 2
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var3 ^ 0L;
      x44.a<"i">(this.e(0), new Object[]{var6, this, var2}, 8818198965911889370L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
