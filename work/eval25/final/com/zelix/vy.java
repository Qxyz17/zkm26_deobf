package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.zip.ZipOutputStream;

public class vy {
   private ZipOutputStream b;
   File U;
   private static final long a = ess.a(8988816610291567289L, 5391388222724460218L, MethodHandles.lookup().lookupClass()).a(70511530345382L);

   public ZipOutputStream K(Object[] param1) {
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
      // 0c: getstatic com/zelix/vy.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 77413223288580
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6551027901744355131
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w 6552819400353618372
      // 2a: lload 2
      // 2b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnonnull a7
      // 35: ifnonnull 9d
      // 38: goto 45
      // 3b: ldc2_w 6470380350515408513
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 4
      // 48: bipush 1
      // 49: anewarray 11
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w 4739961591509683490
      // 58: lload 2
      // 59: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: ldc2_w 6602477470455465313
      // 61: lload 2
      // 62: invokedynamic p (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: aload 0
      // 68: new java/util/zip/ZipOutputStream
      // 6b: dup
      // 6c: new java/io/BufferedOutputStream
      // 6f: dup
      // 70: new java/io/FileOutputStream
      // 73: dup
      // 74: aload 0
      // 75: ldc2_w 6602477470455465313
      // 78: lload 2
      // 79: invokedynamic o (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 81: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;)V
      // 84: invokespecial java/util/zip/ZipOutputStream.<init> (Ljava/io/OutputStream;)V
      // 87: ldc2_w 6552819400353618372
      // 8a: lload 2
      // 8b: invokedynamic p (Ljava/lang/Object;Ljava/util/zip/ZipOutputStream;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: goto 9d
      // 93: ldc2_w 6470380350515408513
      // 96: lload 2
      // 97: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: aload 0
      // 9e: ldc2_w 6552819400353618372
      // a1: lload 2
      // a2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: areturn
   }

   public String f(Object[] param1) {
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
      // 0c: getstatic com/zelix/vy.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 5592576746634018894
      // 15: lload 2
      // 16: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 5536482526733439508
      // 21: lload 2
      // 22: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 53
      // 2c: ifnull 5d
      // 2f: goto 3c
      // 32: ldc2_w 5674068671253543412
      // 35: lload 2
      // 36: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 5536482526733439508
      // 40: lload 2
      // 41: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w 5674068671253543412
      // 4c: lload 2
      // 4d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: ldc2_w 5931058254665161292
      // 56: lload 2
      // 57: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: areturn
      // 5d: aconst_null
      // 5e: areturn
   }

   public void k(Object[] param1) {
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
      // 0c: getstatic com/zelix/vy.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8401040902009141573
      // 15: lload 2
      // 16: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -8399171097826736060
      // 21: lload 2
      // 22: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 53
      // 2c: ifnull 5c
      // 2f: goto 3c
      // 32: ldc2_w -8625795987648954623
      // 35: lload 2
      // 36: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -8399171097826736060
      // 40: lload 2
      // 41: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/zip/ZipOutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: goto 53
      // 49: ldc2_w -8625795987648954623
      // 4c: lload 2
      // 4d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: ldc2_w -8399908020666668121
      // 56: lload 2
      // 57: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: return
   }

   public boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"i">(this, 3575297071384687274L, var2) == null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, 3649362232067622383L, var2);
      }

      return false;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
