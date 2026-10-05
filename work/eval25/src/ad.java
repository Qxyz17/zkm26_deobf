package com.zelix;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class ad {
   private List p;
   private String V;
   private static final long a = ess.a(3752500301210321902L, -8769865798380424328L, MethodHandles.lookup().lookupClass()).a(86884885482980L);

   Enumeration G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      ArrayList var4 = new ArrayList(x44.a<"l">(this, 21941883966172997L, var2));
      Collections.reverse(var4);
      return Collections.enumeration(var4);
   }

   ad(String param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ad.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 26843316581387
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: aload 0
      // 14: aload 1
      // 15: ldc2_w -3334464709061417850
      // 18: lload 2
      // 19: invokedynamic q (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: new java/io/BufferedReader
      // 21: dup
      // 22: new java/io/StringReader
      // 25: dup
      // 26: aload 0
      // 27: ldc2_w -3334464709061417850
      // 2a: lload 2
      // 2b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 33: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 36: astore 7
      // 38: ldc2_w -3708949826998520826
      // 3b: lload 2
      // 3c: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: aload 0
      // 42: new java/util/ArrayList
      // 45: dup
      // 46: invokespecial java/util/ArrayList.<init> ()V
      // 49: ldc2_w -3668304759135903201
      // 4c: lload 2
      // 4d: invokedynamic q (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: astore 6
      // 54: aconst_null
      // 55: astore 8
      // 57: aload 7
      // 59: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 5c: dup
      // 5d: astore 8
      // 5f: ifnull b1
      // 62: aload 6
      // 64: ifnull cf
      // 67: aload 8
      // 69: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6c: invokevirtual java/lang/String.length ()I
      // 6f: aload 6
      // 71: ifnull ab
      // 74: goto 81
      // 77: ldc2_w -3345567757312232139
      // 7a: lload 2
      // 7b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: ifle 57
      // 84: goto 91
      // 87: ldc2_w -3345567757312232139
      // 8a: lload 2
      // 8b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/IOException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: aload 0
      // 92: ldc2_w -3668304759135903201
      // 95: lload 2
      // 96: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: new com/zelix/ae
      // 9e: dup
      // 9f: aload 8
      // a1: lload 4
      // a3: invokespecial com/zelix/ae.<init> (Ljava/lang/String;J)V
      // a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ab: pop
      // ac: aload 6
      // ae: ifnonnull 57
      // b1: lload 2
      // b2: lconst_0
      // b3: lcmp
      // b4: iflt 62
      // b7: goto cf
      // ba: astore 9
      // bc: new com/zelix/_sm
      // bf: dup
      // c0: aload 9
      // c2: ldc2_w -3641411697316903630
      // c5: lload 2
      // c6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: invokespecial com/zelix/_sm.<init> (Ljava/lang/String;)V
      // ce: athrow
      // cf: return
   }

   int F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 8684530902187825037L, var2).size();
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
