package com.zelix;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.invoke.MethodHandles;

public class _f implements FilenameFilter {
   private String S;
   private String q;
   private static final long a = ess.a(4008293309657138853L, 5108039175486774863L, MethodHandles.lookup().lookupClass()).a(41408001441410L);

   @Override
   public boolean accept(File param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_f.a J
      // 03: ldc2_w 110092071267475
      // 06: lxor
      // 07: lstore 3
      // 08: ldc2_w 6445410625317442720
      // 0b: lload 3
      // 0c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: new java/io/File
      // 14: dup
      // 15: aload 1
      // 16: aload 2
      // 17: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1a: astore 6
      // 1c: astore 5
      // 1e: aload 6
      // 20: ldc2_w 6808061939795352986
      // 23: lload 3
      // 24: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: aload 5
      // 2b: ifnonnull a5
      // 2e: ifne a4
      // 31: goto 3e
      // 34: ldc2_w 6401706860695423486
      // 37: lload 3
      // 38: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 0
      // 40: ldc2_w 4759469819440187407
      // 43: lload 3
      // 44: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 4c: aload 5
      // 4e: ifnonnull 89
      // 51: goto 5e
      // 54: ldc2_w 6401706860695423486
      // 57: lload 3
      // 58: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: ifeq a2
      // 61: goto 6e
      // 64: ldc2_w 6401706860695423486
      // 67: lload 3
      // 68: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 2
      // 6f: aload 0
      // 70: ldc2_w 5155372160826976426
      // 73: lload 3
      // 74: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 7c: goto 89
      // 7f: ldc2_w 6401706860695423486
      // 82: lload 3
      // 83: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 5
      // 8b: ifnonnull 9f
      // 8e: ifeq a2
      // 91: goto 9e
      // 94: ldc2_w 6401706860695423486
      // 97: lload 3
      // 98: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: bipush 1
      // 9f: goto a3
      // a2: bipush 0
      // a3: ireturn
      // a4: bipush 0
      // a5: ireturn
   }

   public _f(String var1, String var2, int var3, int var4, byte var5) {
      long var6 = ((long)var3 << 32 | (long)var4 << 40 >>> 32 | (long)var5 << 56 >>> 56) ^ a;
      super();
      x44.a<"p">(this, var1, -2664343129987854076L, var6);
      x44.a<"p">(this, var2, -2413686176931565151L, var6);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
