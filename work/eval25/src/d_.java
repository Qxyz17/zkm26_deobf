package com.zelix;

import java.lang.invoke.MethodHandles;

public class d_ {
   private final String X;
   private final String P;
   private final li j;
   private final String m;
   private static final long a = ess.a(-7300847522964989934L, 1378507133608820973L, MethodHandles.lookup().lookupClass()).a(76678086243306L);

   public String z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -8974484164888684909L, var2);
   }

   public d_(String param1, li param2, long param3, String param5, String param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/d_.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: ldc2_w 6988529543254310116
      // 09: lload 3
      // 0a: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: astore 7
      // 15: aload 0
      // 16: aload 1
      // 17: putfield com/zelix/d_.m Ljava/lang/String;
      // 1a: aload 0
      // 1b: aload 2
      // 1c: putfield com/zelix/d_.j Lcom/zelix/li;
      // 1f: aload 0
      // 20: aload 5
      // 22: aload 7
      // 24: ifnonnull 49
      // 27: ifnull 4c
      // 2a: goto 37
      // 2d: ldc2_w 9201887156627380992
      // 30: lload 3
      // 31: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 5
      // 39: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 3c: goto 49
      // 3f: ldc2_w 9201887156627380992
      // 42: lload 3
      // 43: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: goto 4d
      // 4c: aconst_null
      // 4d: putfield com/zelix/d_.P Ljava/lang/String;
      // 50: aload 0
      // 51: aload 6
      // 53: aload 7
      // 55: ifnonnull 7a
      // 58: ifnull 7d
      // 5b: goto 68
      // 5e: ldc2_w 9201887156627380992
      // 61: lload 3
      // 62: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 6
      // 6a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 6d: goto 7a
      // 70: ldc2_w 9201887156627380992
      // 73: lload 3
      // 74: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: goto 7e
      // 7d: aconst_null
      // 7e: putfield com/zelix/d_.X Ljava/lang/String;
      // 81: return
   }

   public String c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -1898722867223194848L, var2);
   }

   public String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -227399067731209862L, var2);
   }

   public li a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 8229055072917842207L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
