package com.zelix;

public class u_ extends u6 {
   final wd R;

   u_(wd var1) {
      this.R = var1;
   }

   public void B(Object[] param1) {
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
      // 0e: checkcast javax/swing/event/DocumentEvent
      // 11: astore 4
      // 13: pop
      // 14: ldc2_w -8285448744989295628
      // 17: lload 2
      // 18: invokedynamic i (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 5
      // 1f: aload 0
      // 20: ldc2_w -7753706451580959046
      // 23: lload 2
      // 24: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/wd; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: aload 5
      // 2b: ifnonnull 9c
      // 2e: ldc2_w -8536051275407155000
      // 31: lload 2
      // 32: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JTextArea; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: ldc2_w -8635802925193769609
      // 3a: lload 2
      // 3b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 43: invokevirtual java/lang/String.length ()I
      // 46: ifle 85
      // 49: goto 56
      // 4c: ldc2_w -7858731502659749866
      // 4f: lload 2
      // 50: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 0
      // 57: ldc2_w -7753706451580959046
      // 5a: lload 2
      // 5b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/wd; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: ldc2_w -7965400687306424987
      // 63: lload 2
      // 64: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: bipush 1
      // 6a: ldc2_w -8013359239977934292
      // 6d: lload 2
      // 6e: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: aload 5
      // 75: ifnull af
      // 78: goto 85
      // 7b: ldc2_w -7858731502659749866
      // 7e: lload 2
      // 7f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 0
      // 86: ldc2_w -7753706451580959046
      // 89: lload 2
      // 8a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/wd; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: goto 9c
      // 92: ldc2_w -7858731502659749866
      // 95: lload 2
      // 96: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: ldc2_w -7965400687306424987
      // 9f: lload 2
      // a0: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: bipush 0
      // a6: ldc2_w -8013359239977934292
      // a9: lload 2
      // aa: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: return
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
