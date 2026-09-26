package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class lqm {
   protected PrintWriter O;
   private gv q;
   private gv X;
   private int l;
   protected boolean H;
   private int p;
   private int R;
   private int v;
   protected boolean e;
   private int k;
   private static final long ab = prr.a(3068597362852472494L, 1187199863827798048L, MethodHandles.lookup().lookupClass()).a(26291311838103L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb = new HashMap(13);

   public int n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"v">(this, -8641393162670045803L, var2);
   }

   public final void Y(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = ab ^ var3;
      long var5 = var3 ^ 80694885898569L;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = false;
      var10005[0] = var2;
      m44.a<"s">(this, var10005, 3153678394782769119L, var3);
   }

   public String P(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqm.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8407018724450301037
      // 15: lload 2
      // 16: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 8272144704163398911
      // 21: lload 2
      // 22: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ifnonnull 36
      // 2a: aconst_null
      // 2b: areturn
      // 2c: ldc2_w 8428623207486087492
      // 2f: lload 2
      // 30: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: astore 5
      // 3f: bipush 0
      // 40: istore 6
      // 42: aload 0
      // 43: ldc2_w 8272144704163398911
      // 46: lload 2
      // 47: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: ldc2_w 7795395425150802936
      // 4f: lload 2
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: astore 7
      // 57: aload 7
      // 59: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e: ifeq 9a
      // 61: iload 6
      // 63: lload 2
      // 64: lconst_0
      // 65: lcmp
      // 66: iflt 97
      // 69: ifle 82
      // 6c: aload 5
      // 6e: getstatic com/zelix/_e.n Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: pop
      // 75: goto 82
      // 78: ldc2_w 8428623207486087492
      // 7b: lload 2
      // 7c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: aload 5
      // 84: aload 7
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast java/lang/String
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: pop
      // 92: iinc 6 1
      // 95: iload 4
      // 97: ifne 57
      // 9a: aload 5
      // 9c: lload 2
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: iflt 91
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: areturn
   }

   public void w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      m44.a<"w">(this, null, -2326807235350728812L, var2);
      m44.a<"w">(this, null, -2770671726498648129L, var2);
   }

   public final void o(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/lqm.ab J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 51273977795387
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 8985787718728396683
      // 25: lload 3
      // 26: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: new java/lang/StringBuilder
      // 2e: dup
      // 2f: invokespecial java/lang/StringBuilder.<init> ()V
      // 32: sipush 4664
      // 35: ldc2_w 2861354620976464186
      // 38: lload 3
      // 39: lxor
      // 3a: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 2
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: aload 0
      // 47: lload 5
      // 49: bipush 1
      // 4a: anewarray 468
      // 4d: dup_x2
      // 4e: dup_x2
      // 4f: pop
      // 50: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53: bipush 0
      // 54: swap
      // 55: aastore
      // 56: ldc2_w 8970785227136875118
      // 59: lload 3
      // 5a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 65: astore 8
      // 67: ldc2_w 7165593746780112640
      // 6a: lload 3
      // 6b: invokedynamic i (JJ)Ljava/io/PrintStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: aload 8
      // 72: ldc2_w 9151078681173320938
      // 75: lload 3
      // 76: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: istore 7
      // 7d: aload 0
      // 7e: ldc2_w 7469977277232182258
      // 81: lload 3
      // 82: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: aload 8
      // 89: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 8c: aload 0
      // 8d: ldc2_w 7469977277232182258
      // 90: lload 3
      // 91: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: ldc2_w 9104288595524930607
      // 99: lload 3
      // 9a: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: aload 0
      // a0: ldc2_w 7359099059781440764
      // a3: lload 3
      // a4: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: iload 7
      // ab: ifne d3
      // ae: ifeq d2
      // b1: goto be
      // b4: ldc2_w 7252594420342223130
      // b7: lload 3
      // b8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: athrow
      // be: new com/zelix/n9
      // c1: dup
      // c2: aload 8
      // c4: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // c7: athrow
      // c8: ldc2_w 7252594420342223130
      // cb: lload 3
      // cc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: athrow
      // d2: bipush 1
      // d3: ldc2_w 8853960078581264584
      // d6: lload 3
      // d7: invokedynamic m (IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: return
   }

   public List D(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqm.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6140765570422265343
      // 15: lload 2
      // 16: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: new java/util/ArrayList
      // 20: dup
      // 21: aload 0
      // 22: ldc2_w -6153686619285939528
      // 25: lload 2
      // 26: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: ifnonnull 3c
      // 2e: bipush 0
      // 2f: goto 4f
      // 32: ldc2_w -6155197046259138776
      // 35: lload 2
      // 36: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -6153686619285939528
      // 40: lload 2
      // 41: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: ldc2_w -5533914923565274532
      // 49: lload 2
      // 4a: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: invokespecial java/util/ArrayList.<init> (I)V
      // 52: astore 5
      // 54: aload 0
      // 55: ldc2_w -6153686619285939528
      // 58: lload 2
      // 59: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: iload 4
      // 60: ifeq 8a
      // 63: ifnull d6
      // 66: goto 73
      // 69: ldc2_w -6155197046259138776
      // 6c: lload 2
      // 6d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: aload 0
      // 74: ldc2_w -6153686619285939528
      // 77: lload 2
      // 78: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: goto 8a
      // 80: ldc2_w -6155197046259138776
      // 83: lload 2
      // 84: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: ldc2_w -5601657609587047020
      // 8d: lload 2
      // 8e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: astore 6
      // 95: aload 6
      // 97: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9c: ifeq d6
      // 9f: aload 6
      // a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a6: checkcast java/lang/String
      // a9: astore 7
      // ab: lload 2
      // ac: lconst_0
      // ad: lcmp
      // ae: ifle be
      // b1: aload 5
      // b3: iload 4
      // b5: ifeq d8
      // b8: aload 7
      // ba: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // bd: pop
      // be: iload 4
      // c0: ifne 95
      // c3: lload 2
      // c4: lconst_0
      // c5: lcmp
      // c6: iflt ab
      // c9: goto d6
      // cc: ldc2_w -6155197046259138776
      // cf: lload 2
      // d0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: aload 5
      // d8: areturn
   }

   public final void X(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/String
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 2
      // 01d: pop
      // 01e: getstatic com/zelix/lqm.ab J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 101631016595386
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 25602228585835
      // 033: lxor
      // 034: lstore 8
      // 036: pop2
      // 037: ldc2_w -9209126082408590582
      // 03a: lload 4
      // 03c: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: istore 10
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: iload 2
      // 04b: ifeq 05e
      // 04e: ldc "\t"
      // 050: goto 060
      // 053: ldc2_w -7482986967154192997
      // 056: lload 4
      // 058: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: ldc ""
      // 060: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 063: sipush 6325
      // 066: ldc2_w 7555707974978172723
      // 069: lload 4
      // 06b: lxor
      // 06c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: ldc " "
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 079: aload 3
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: aload 0
      // 07e: lload 6
      // 080: bipush 1
      // 081: anewarray 468
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -9151363446442342673
      // 090: lload 4
      // 092: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: astore 11
      // 09f: aload 0
      // 0a0: ldc2_w -7481894578481125365
      // 0a3: lload 4
      // 0a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 10
      // 0ac: ifne 0ed
      // 0af: ifnonnull 0e2
      // 0b2: goto 0c0
      // 0b5: ldc2_w -7482986967154192997
      // 0b8: lload 4
      // 0ba: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: new com/zelix/gv
      // 0c4: dup
      // 0c5: lload 8
      // 0c7: invokespecial com/zelix/gv.<init> (J)V
      // 0ca: ldc2_w -7481894578481125365
      // 0cd: lload 4
      // 0cf: invokedynamic p (Ljava/lang/Object;Lcom/zelix/gv;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: goto 0e2
      // 0d7: ldc2_w -7482986967154192997
      // 0da: lload 4
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: ldc2_w -7481894578481125365
      // 0e6: lload 4
      // 0e8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 11
      // 0ef: ldc2_w -7451461095971478331
      // 0f2: lload 4
      // 0f4: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: istore 12
      // 0fb: iload 10
      // 0fd: lload 4
      // 0ff: lconst_0
      // 100: lcmp
      // 101: iflt 109
      // 104: ifne 140
      // 107: iload 12
      // 109: ifeq 150
      // 10c: goto 11a
      // 10f: ldc2_w -7482986967154192997
      // 112: lload 4
      // 114: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 0
      // 11b: dup
      // 11c: ldc2_w -6953983834363253588
      // 11f: lload 4
      // 121: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: bipush 1
      // 127: iadd
      // 128: ldc2_w -6953983834363253588
      // 12b: lload 4
      // 12d: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: goto 140
      // 135: ldc2_w -7482986967154192997
      // 138: lload 4
      // 13a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 0
      // 141: ldc2_w -7265500210624327821
      // 144: lload 4
      // 146: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 11
      // 14d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 150: return
   }

   public int j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"v">(this, -2761447318248838026L, var2);
   }

   public int Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"u">(this, 107153681226534055L, var2);
   }

   public final void M(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 2
      // 01d: pop
      // 01e: getstatic com/zelix/lqm.ab J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 2710515019861
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 80613253126788
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w 548188169836791645
      // 037: lload 3
      // 038: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 10
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: iload 2
      // 047: ifeq 059
      // 04a: ldc "\t"
      // 04c: goto 05b
      // 04f: ldc2_w 560778307294532212
      // 052: lload 3
      // 053: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: athrow
      // 059: ldc ""
      // 05b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05e: sipush 31581
      // 061: ldc2_w 8376141912913218355
      // 064: lload 3
      // 065: lxor
      // 066: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: ldc " "
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 073: aload 5
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 0
      // 079: lload 6
      // 07b: bipush 1
      // 07c: anewarray 468
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w 2238444560057620736
      // 08b: lload 3
      // 08c: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: astore 11
      // 099: aload 0
      // 09a: ldc2_w 560036918920394724
      // 09d: lload 3
      // 09e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: iload 10
      // 0a5: lload 3
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0ea
      // 0ab: ifeq 0e8
      // 0ae: ifnonnull 0de
      // 0b1: goto 0be
      // 0b4: ldc2_w 560778307294532212
      // 0b7: lload 3
      // 0b8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: new com/zelix/gv
      // 0c2: dup
      // 0c3: lload 8
      // 0c5: invokespecial com/zelix/gv.<init> (J)V
      // 0c8: ldc2_w 560036918920394724
      // 0cb: lload 3
      // 0cc: invokedynamic w (Ljava/lang/Object;Lcom/zelix/gv;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: goto 0de
      // 0d4: ldc2_w 560778307294532212
      // 0d7: lload 3
      // 0d8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 0
      // 0df: ldc2_w 143194928545183695
      // 0e2: lload 3
      // 0e3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: iload 10
      // 0ea: ifeq 127
      // 0ed: ifnonnull 11d
      // 0f0: goto 0fd
      // 0f3: ldc2_w 560778307294532212
      // 0f6: lload 3
      // 0f7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: new com/zelix/gv
      // 101: dup
      // 102: lload 8
      // 104: invokespecial com/zelix/gv.<init> (J)V
      // 107: ldc2_w 143194928545183695
      // 10a: lload 3
      // 10b: invokedynamic w (Ljava/lang/Object;Lcom/zelix/gv;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: goto 11d
      // 113: ldc2_w 560778307294532212
      // 116: lload 3
      // 117: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 0
      // 11e: ldc2_w 560036918920394724
      // 121: lload 3
      // 122: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 11
      // 129: ldc2_w 538260991504726826
      // 12c: lload 3
      // 12d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: istore 12
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 183
      // 13a: iload 12
      // 13c: iload 10
      // 13e: ifeq 182
      // 141: ifeq 199
      // 144: goto 151
      // 147: ldc2_w 560778307294532212
      // 14a: lload 3
      // 14b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 0
      // 152: ldc2_w 343571084418388124
      // 155: lload 3
      // 156: invokedynamic u (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 11
      // 15d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 160: aload 0
      // 161: ldc2_w 143194928545183695
      // 164: lload 3
      // 165: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 11
      // 16c: ldc2_w 538260991504726826
      // 16f: lload 3
      // 170: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: goto 182
      // 178: ldc2_w 560778307294532212
      // 17b: lload 3
      // 17c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: pop
      // 183: aload 0
      // 184: dup
      // 185: ldc2_w 553063009740720759
      // 188: lload 3
      // 189: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: bipush 1
      // 18f: iadd
      // 190: ldc2_w 553063009740720759
      // 193: lload 3
      // 194: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: return
   }

   public int D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"w">(this, -5831187278617699135L, var2);
   }

   public final void r(Object[] var1) {
      String var2 = (String)var1[0];
      boolean var3 = (Boolean)var1[1];
      long var4 = (Long)var1[2];
      var4 = ab ^ var4;

      StringBuilder var10000;
      String var10001;
      label17: {
         try {
            var10000 = new StringBuilder();
            if (var3) {
               var10001 = "\t";
               break label17;
            }
         } catch (n9 var7) {
            throw m44.a<"k">(var7, 4337035069346425228L, var4);
         }

         var10001 = "";
      }

      String var6 = var10000.append(var10001).append(var2).toString();
      m44.a<"u">(this, 4556774862539828068L, var4).println(var6);
   }

   public void h(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = ab ^ var2;
      long var5 = var2 ^ 58636352832227L;
      Object[] var10005 = new Object[]{null, var4, false};
      var10005[0] = var5;
      m44.a<"q">(this, var10005, -4936814675083865943L, var2);
   }

   public boolean y() {
      return this.H;
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      m44.a<"p">(m44.a<"q">(this, 7856676476326508880L, var2), 8429290844180530829L, var2);
   }

   public final void V(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic com/zelix/lqm.ab J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 25836340181810
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 101538781008355
      // 033: lxor
      // 034: lstore 8
      // 036: pop2
      // 037: ldc2_w 935793470354328634
      // 03a: lload 4
      // 03c: invokedynamic l (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: istore 10
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: iload 2
      // 04b: ifeq 05e
      // 04e: ldc "\t"
      // 050: goto 060
      // 053: ldc2_w 914052527616497939
      // 056: lload 4
      // 058: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: ldc ""
      // 060: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 063: sipush 1452
      // 066: ldc2_w 2714394566702104227
      // 069: lload 4
      // 06b: lxor
      // 06c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: ldc " "
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 079: aload 3
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: aload 0
      // 07e: lload 6
      // 080: bipush 1
      // 081: anewarray 468
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w 1474815077856825959
      // 090: lload 4
      // 092: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: astore 11
      // 09f: aload 0
      // 0a0: ldc2_w 910487523589012611
      // 0a3: lload 4
      // 0a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 10
      // 0ac: ifeq 0ed
      // 0af: ifnonnull 0e2
      // 0b2: goto 0c0
      // 0b5: ldc2_w 914052527616497939
      // 0b8: lload 4
      // 0ba: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: new com/zelix/gv
      // 0c4: dup
      // 0c5: lload 8
      // 0c7: invokespecial com/zelix/gv.<init> (J)V
      // 0ca: ldc2_w 910487523589012611
      // 0cd: lload 4
      // 0cf: invokedynamic p (Ljava/lang/Object;Lcom/zelix/gv;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: goto 0e2
      // 0d7: ldc2_w 914052527616497939
      // 0da: lload 4
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: ldc2_w 910487523589012611
      // 0e6: lload 4
      // 0e8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 11
      // 0ef: ldc2_w 873518615301632077
      // 0f2: lload 4
      // 0f4: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: istore 12
      // 0fb: iload 10
      // 0fd: lload 4
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 109
      // 104: ifeq 140
      // 107: iload 12
      // 109: ifeq 150
      // 10c: goto 11a
      // 10f: ldc2_w 914052527616497939
      // 112: lload 4
      // 114: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 0
      // 11b: dup
      // 11c: ldc2_w 743447202791712326
      // 11f: lload 4
      // 121: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: bipush 1
      // 127: iadd
      // 128: ldc2_w 743447202791712326
      // 12b: lload 4
      // 12d: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: goto 140
      // 135: ldc2_w 914052527616497939
      // 138: lload 4
      // 13a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 0
      // 141: ldc2_w 1126895088672349179
      // 144: lload 4
      // 146: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 11
      // 14d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 150: return
   }

   public PrintWriter A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"s">(this, 9810968085828730L, var2);
   }

   public String y(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqm.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -7546168356275927938
      // 15: lload 2
      // 16: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -8115772645148508289
      // 21: lload 2
      // 22: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: ifnonnull 36
      // 2a: aconst_null
      // 2b: areturn
      // 2c: ldc2_w -8119121800765072657
      // 2f: lload 2
      // 30: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: astore 5
      // 3f: bipush 0
      // 40: istore 6
      // 42: aload 0
      // 43: ldc2_w -8115772645148508289
      // 46: lload 2
      // 47: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: ldc2_w -7528427249078935469
      // 4f: lload 2
      // 50: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: astore 7
      // 57: aload 7
      // 59: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e: ifeq 9a
      // 61: iload 6
      // 63: lload 2
      // 64: lconst_0
      // 65: lcmp
      // 66: iflt 97
      // 69: ifle 82
      // 6c: aload 5
      // 6e: getstatic com/zelix/_e.n Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: pop
      // 75: goto 82
      // 78: ldc2_w -8119121800765072657
      // 7b: lload 2
      // 7c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: athrow
      // 82: aload 5
      // 84: aload 7
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast java/lang/String
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: pop
      // 92: iinc 6 1
      // 95: iload 4
      // 97: ifeq 57
      // 9a: aload 5
      // 9c: lload 2
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: iflt 91
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: areturn
   }

   public final void v(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = ab ^ var2;
      long var5 = var2 ^ 94398302987789L;
      Object[] var10005 = new Object[]{null, null, false};
      var10005[1] = var5;
      var10005[0] = var4;
      m44.a<"p">(this, var10005, 4642321805510273026L, var2);
   }

   public final void i(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = ab ^ var3;
      long var5 = var3 ^ 67242546285182L;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = false;
      var10005[0] = var2;
      m44.a<"u">(this, var10005, 131535236378650689L, var3);
   }

   public final void u(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic com/zelix/lqm.ab J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 794725735811
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 83146846615378
      // 033: lxor
      // 034: lstore 8
      // 036: pop2
      // 037: ldc2_w -6175124541113554293
      // 03a: lload 4
      // 03c: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: istore 10
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: iload 3
      // 04b: ifeq 05e
      // 04e: ldc "\t"
      // 050: goto 060
      // 053: ldc2_w -6188427301729222750
      // 056: lload 4
      // 058: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: ldc ""
      // 060: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 063: sipush 11882
      // 066: ldc2_w 7552819850614076371
      // 069: lload 4
      // 06b: lxor
      // 06c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: ldc " "
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 079: aload 2
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: aload 0
      // 07e: lload 6
      // 080: bipush 1
      // 081: anewarray 468
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -5564602261923728170
      // 090: lload 4
      // 092: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: astore 11
      // 09f: aload 0
      // 0a0: ldc2_w -6191424389212661198
      // 0a3: lload 4
      // 0a5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 10
      // 0ac: ifeq 0ed
      // 0af: ifnonnull 0e2
      // 0b2: goto 0c0
      // 0b5: ldc2_w -6188427301729222750
      // 0b8: lload 4
      // 0ba: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: new com/zelix/gv
      // 0c4: dup
      // 0c5: lload 8
      // 0c7: invokespecial com/zelix/gv.<init> (J)V
      // 0ca: ldc2_w -6191424389212661198
      // 0cd: lload 4
      // 0cf: invokedynamic q (Ljava/lang/Object;Lcom/zelix/gv;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: goto 0e2
      // 0d7: ldc2_w -6188427301729222750
      // 0da: lload 4
      // 0dc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: ldc2_w -6191424389212661198
      // 0e6: lload 4
      // 0e8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 11
      // 0ef: ldc2_w -6147893655735232772
      // 0f2: lload 4
      // 0f4: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: istore 12
      // 0fb: iload 10
      // 0fd: lload 4
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 109
      // 104: ifeq 138
      // 107: iload 12
      // 109: ifeq 150
      // 10c: goto 11a
      // 10f: ldc2_w -6188427301729222750
      // 112: lload 4
      // 114: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 0
      // 11b: ldc2_w -6263769469763830454
      // 11e: lload 4
      // 120: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: aload 11
      // 127: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 12a: goto 138
      // 12d: ldc2_w -6188427301729222750
      // 130: lload 4
      // 132: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 0
      // 139: dup
      // 13a: ldc2_w -5400202867663423352
      // 13d: lload 4
      // 13f: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: bipush 1
      // 145: iadd
      // 146: ldc2_w -5400202867663423352
      // 149: lload 4
      // 14b: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: return
   }

   public static String C(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = ab ^ var2;
      long var4 = var2 ^ 81779938302787L;
      long var6 = var2 ^ 108732606877147L;
      return m44.a<"h">(
         new Object[]{
            var4, new String[]{a<"n">(16833, 5636097292884214527L ^ var2) + var1 + " " + m44.a<"h">(new Object[]{var6}, -5563760994808715357L, var2)}
         },
         -5539891072429575397L,
         var2
      );
   }

   protected lqm(boolean var1) {
      this.H = var1;
   }

   public String V(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqm.ab J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 135155383944588
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 102153856561478
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w -8543393637781272151
      // 25: lload 2
      // 26: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 8
      // 2d: aload 0
      // 2e: lload 6
      // 30: bipush 1
      // 31: anewarray 468
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w -7998132327550226588
      // 40: lload 2
      // 41: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: iload 8
      // 48: ifeq 8b
      // 4b: ifle b1
      // 4e: goto 5b
      // 51: ldc2_w -8557962881175413632
      // 54: lload 2
      // 55: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 468
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -8457760656484715776
      // 6e: lload 2
      // 6f: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: pop
      // 75: ldc2_w -8552231179680320510
      // 78: lload 2
      // 79: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: goto 8b
      // 81: ldc2_w -8557962881175413632
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: lload 2
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: ifle 97
      // 91: ifeq ae
      // 94: sipush 15566
      // 97: ldc2_w 3333761179568030288
      // 9a: lload 2
      // 9b: lxor
      // 9c: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/lqm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: goto b0
      // a4: ldc2_w -8557962881175413632
      // a7: lload 2
      // a8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: ldc " "
      // b0: areturn
      // b1: ldc ""
      // b3: areturn
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      m44.a<"q">(this, m44.a<"s">(this, 5904266805155144747L, var2) + 1, 5904266805155144747L, var2);
   }

   public int z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"q">(this, -2757769484045077075L, var2);
   }

   public int t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      int var10002 = m44.a<"t">(this, -5951656099078612804L, var2);
      m44.a<"v">(this, var10002 - 1, -5951656099078612804L, var2);
      return var10002;
   }

   static {
      long var0 = ab ^ 16889129147602L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "ZÙG»©Ï\u0089ïÆÔUèo$\u0086{$O[©M\u0010`\u0097@S\u0015å%\u001f2\u0081ò\u008bùi2Gücv»à ö=à;ç·JË\u0019\u009d¶\u000e\u0088àW\u0081\u008e\u0083ÜÉKº{Ý1ÝÕh\u00adM¶Ê¼;Å×\u0084r§z[ãT\f\u000f\u00105#Ö¿n\u0089\u0002\u0007l¬v\u00149c\u001b\u0002\u0010G\u0007U\u000f\u0094+ñd\u0097\u00801\u0093i6\u009dI fiD\u0088\u0015\u009c`-Éz·\u0011\u0000\"ÊD<¦j\u0095HàÊ$LÙ\u0010!á³óÏ";
      int var8 = "ZÙG»©Ï\u0089ïÆÔUèo$\u0086{$O[©M\u0010`\u0097@S\u0015å%\u001f2\u0081ò\u008bùi2Gücv»à ö=à;ç·JË\u0019\u009d¶\u000e\u0088àW\u0081\u008e\u0083ÜÉKº{Ý1ÝÕh\u00adM¶Ê¼;Å×\u0084r§z[ãT\f\u000f\u00105#Ö¿n\u0089\u0002\u0007l¬v\u00149c\u001b\u0002\u0010G\u0007U\u000f\u0094+ñd\u0097\u00801\u0093i6\u009dI fiD\u0088\u0015\u009c`-Éz·\u0011\u0000\"ÊD<¦j\u0095HàÊ$LÙ\u0010!á³óÏ"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     cb = var9;
                     db = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Ò\n¶,+w»òÂ\u0083i 0µ¥ö\u008e%r#'<|1\u0010\t\u008c\u0016\u0017d\u0002¢\u0002t×¢¼¯MÆÞ";
                  var8 = "Ò\n¶,+w»òÂ\u0083i 0µ¥ö\u008e%r#'<|1\u0010\t\u008c\u0016\u0017d\u0002¢\u0002t×¢¼¯MÆÞ".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31592;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lqm", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/lqm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
