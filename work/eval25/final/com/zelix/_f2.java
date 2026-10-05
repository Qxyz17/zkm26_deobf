package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Vector;

public class _f2 implements Comparable {
   private String T;
   private long x;
   private _f2 f;
   private String P;
   private Vector l;
   private String U;
   private wt t;
   private String O;
   private String e;
   private String J;
   private static final long a = ess.a(4323686223993078377L, -4399027935518797484L, MethodHandles.lookup().lookupClass()).a(269128874797329L);

   public _f2 I(Object[] param1) {
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
      // 13: getstatic com/zelix/_f2.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 28316852918762
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -548894291586009677
      // 25: lload 3
      // 26: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 0
      // 2e: ldc2_w -430470677961124713
      // 31: lload 3
      // 32: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 7
      // 39: ifnonnull 63
      // 3c: ifnull d2
      // 3f: goto 4c
      // 42: ldc2_w -367369243302132323
      // 45: lload 3
      // 46: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: ldc2_w -430470677961124713
      // 50: lload 3
      // 51: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: goto 63
      // 59: ldc2_w -367369243302132323
      // 5c: lload 3
      // 5d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: ldc2_w -1798217468313945419
      // 66: lload 3
      // 67: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: astore 8
      // 6e: aload 8
      // 70: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 75: ifeq d2
      // 78: aload 8
      // 7a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7f: checkcast com/zelix/_f2
      // 82: astore 9
      // 84: aload 9
      // 86: aload 7
      // 88: ifnonnull cc
      // 8b: lload 5
      // 8d: bipush 1
      // 8e: anewarray 172
      // 91: dup_x2
      // 92: dup_x2
      // 93: pop
      // 94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 97: bipush 0
      // 98: swap
      // 99: aastore
      // 9a: ldc2_w -429170523567315269
      // 9d: lload 3
      // 9e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: lload 3
      // a4: lconst_0
      // a5: lcmp
      // a6: ifle cf
      // a9: aload 2
      // aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ad: ifeq cd
      // b0: goto bd
      // b3: ldc2_w -367369243302132323
      // b6: lload 3
      // b7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: athrow
      // bd: aload 9
      // bf: goto cc
      // c2: ldc2_w -367369243302132323
      // c5: lload 3
      // c6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: athrow
      // cc: areturn
      // cd: aload 7
      // cf: ifnull 6e
      // d2: aconst_null
      // d3: areturn
   }

   private void j(Object[] var1) {
      long var2 = (Long)var1[0];
      _f2 var4 = (_f2)var1[1];
      var2 = a ^ var2;
      x44.a<"k">(this, 5443440222291518747L, var2).addElement(var4);
   }

   public boolean C(Object[] param1) {
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
      // 0c: getstatic com/zelix/_f2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 777551022766
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -401765611475191874
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w -472540969992051185
      // 2a: lload 2
      // 2b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/wt; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnonnull 5c
      // 35: ifnull 75
      // 38: goto 45
      // 3b: ldc2_w -510142212745885808
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w -472540969992051185
      // 49: lload 2
      // 4a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/wt; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w -510142212745885808
      // 55: lload 2
      // 56: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 172
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -193250455591953159
      // 6e: lload 2
      // 6f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: ireturn
      // 75: bipush 0
      // 76: ireturn
   }

   public String n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(new File(x44.a<"n">(this, -4354134102256335955L, var2)), -4341916248842031581L, var2);
   }

   public String x() {
      return this.P;
   }

   public String f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 562259676305075764L, var2);
   }

   public int n(Object[] var1) {
      long var3 = (Long)var1[0];
      _f2 var2 = (_f2)var1[1];
      var3 = a ^ var3;
      return x44.a<"i">(this.x(), var2.x(), -3125020290732219864L, var3);
   }

   public String u(Object[] param1) {
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
      // 0c: getstatic com/zelix/_f2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 66218710960177
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 4273232311464851103
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 64
      // 2c: lload 4
      // 2e: bipush 1
      // 2f: anewarray 172
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w 4419399355794753919
      // 3e: lload 2
      // 3f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: ifeq 63
      // 47: goto 54
      // 4a: ldc2_w 4164327962327467697
      // 4d: lload 2
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/_f2.P Ljava/lang/String;
      // 58: areturn
      // 59: ldc2_w 4164327962327467697
      // 5c: lload 2
      // 5d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 0
      // 64: ldc2_w 4467131342609399232
      // 67: lload 2
      // 68: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: areturn
   }

   public boolean K(Object[] param1) {
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
      // 0c: getstatic com/zelix/_f2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 101590007431637
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 5846207579730746611
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w 5925735327318641986
      // 2a: lload 2
      // 2b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/wt; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnonnull 5c
      // 35: ifnull 75
      // 38: goto 45
      // 3b: ldc2_w 6027750084347178205
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w 5925735327318641986
      // 49: lload 2
      // 4a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/wt; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 6027750084347178205
      // 55: lload 2
      // 56: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 172
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w 5820110622138593850
      // 6e: lload 2
      // 6f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: ireturn
      // 75: bipush 0
      // 76: ireturn
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -9221064898177892298L, var2);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 131349602860465L;
      long var4 = var2 ^ 29910844352451L;
      return x44.a<"j">(this, new Object[]{var4, (_f2)var1}, -7930477927474481555L, var2);
   }

   public _f2 F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 8358252253939084144L, var2);
   }

   public String Z(Object[] param1) {
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
      // 0c: getstatic com/zelix/_f2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -3697581323608424067
      // 15: lload 2
      // 16: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -4026794132378906679
      // 21: lload 2
      // 22: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 5b
      // 2c: ifnonnull 51
      // 2f: goto 3c
      // 32: ldc2_w -3591421201003073197
      // 35: lload 2
      // 36: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w -3883106680554534366
      // 40: lload 2
      // 41: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: areturn
      // 47: ldc2_w -3591421201003073197
      // 4a: lload 2
      // 4b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: ldc2_w -4026794132378906679
      // 55: lload 2
      // 56: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: areturn
   }

   public _f2(String param1, int param2, long param3, int param5, String param6, _f2 param7, short param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 5
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 8
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_f2.a J
      // 01c: lxor
      // 01d: lstore 9
      // 01f: lload 9
      // 021: dup2
      // 022: ldc2_w 32350239696102
      // 025: lxor
      // 026: lstore 11
      // 028: pop2
      // 029: aload 0
      // 02a: invokespecial java/lang/Object.<init> ()V
      // 02d: aload 0
      // 02e: new java/util/Vector
      // 031: dup
      // 032: invokespecial java/util/Vector.<init> ()V
      // 035: ldc2_w 602575337189549773
      // 038: lload 9
      // 03a: invokedynamic r (Ljava/lang/Object;Ljava/util/Vector;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: ldc2_w 737325546865248233
      // 042: lload 9
      // 044: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: aload 0
      // 04a: aload 1
      // 04b: ldc2_w 1047642027508320605
      // 04e: lload 9
      // 050: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: astore 13
      // 057: aload 0
      // 058: aload 6
      // 05a: ldc2_w 903081409861848246
      // 05d: lload 9
      // 05f: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 0
      // 065: aload 7
      // 067: ldc2_w 1074159919395624550
      // 06a: lload 9
      // 06c: invokedynamic r (Ljava/lang/Object;Lcom/zelix/_f2;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: aload 7
      // 073: aload 13
      // 075: ifnonnull 0f0
      // 078: ifnull 0e1
      // 07b: goto 089
      // 07e: ldc2_w 629582282175117255
      // 081: lload 9
      // 083: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: new java/lang/StringBuilder
      // 08d: dup
      // 08e: invokespecial java/lang/StringBuilder.<init> ()V
      // 091: aload 7
      // 093: invokevirtual com/zelix/_f2.x ()Ljava/lang/String;
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: ldc "!"
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 6
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a6: putfield com/zelix/_f2.P Ljava/lang/String;
      // 0a9: aload 7
      // 0ab: lload 11
      // 0ad: aload 0
      // 0ae: bipush 2
      // 0af: anewarray 172
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x2
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w 1016304335089480591
      // 0c3: lload 9
      // 0c5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: iload 2
      // 0cb: ifle 101
      // 0ce: aload 13
      // 0d0: ifnull 0f5
      // 0d3: goto 0e1
      // 0d6: ldc2_w 629582282175117255
      // 0d9: lload 9
      // 0db: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: goto 0f0
      // 0e5: ldc2_w 629582282175117255
      // 0e8: lload 9
      // 0ea: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 6
      // 0f2: putfield com/zelix/_f2.P Ljava/lang/String;
      // 0f5: aload 0
      // 0f6: lload 3
      // 0f7: ldc2_w 922507236663885292
      // 0fa: lload 9
      // 0fc: invokedynamic r (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: return
   }

   public _f2(String var1, long var2, short var4, String var5, String var6, int var7, String var8, short var9) {
      long var10 = ((long)var4 << 48 | (long)var7 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
      super();
      x44.a<"v">(this, new Vector(), 7273511860267469409L, var10);
      x44.a<"v">(this, var1, 7072211948425324017L, var10);
      x44.a<"v">(this, var5, 6927680073212256282L, var10);
      x44.a<"v">(this, var2, 6944855061937688896L, var10);
      this.P = var5;
      x44.a<"v">(this, var6, 9025452655907749850L, var10);
      x44.a<"v">(this, var8, 8786669762982039561L, var10);
   }

   public void y(Object[] var1) {
      long var3 = (Long)var1[0];
      wt var2 = (wt)var1[1];
      var3 = a ^ var3;
      x44.a<"r">(this, var2, -8025914490750873632L, var3);
   }

   public void o(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"s">(this, var4, 4629636806460592373L, var2);
   }

   public _f2 H(Object[] param1) {
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
      // 00b: pop
      // 00c: getstatic com/zelix/_f2.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 122344623969314
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 42284470101808
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -8917236696532203027
      // 025: lload 2
      // 026: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 8
      // 02d: aload 0
      // 02e: ldc2_w -9156887778839078814
      // 031: lload 2
      // 032: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 8
      // 039: ifnonnull 0d3
      // 03c: ifnull 0c9
      // 03f: goto 04c
      // 042: ldc2_w -8739054301734045245
      // 045: lload 2
      // 046: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: aload 0
      // 04d: ldc2_w -9156887778839078814
      // 050: lload 2
      // 051: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: lload 4
      // 058: bipush 1
      // 059: anewarray 172
      // 05c: dup_x2
      // 05d: dup_x2
      // 05e: pop
      // 05f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 062: bipush 0
      // 063: swap
      // 064: aastore
      // 065: ldc2_w -8878342419186991990
      // 068: lload 2
      // 069: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: aload 8
      // 070: lload 2
      // 071: lconst_0
      // 072: lcmp
      // 073: iflt 0d5
      // 076: ifnonnull 0d3
      // 079: goto 086
      // 07c: ldc2_w -8739054301734045245
      // 07f: lload 2
      // 080: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: ifle 0ca
      // 08c: ifnull 0c9
      // 08f: goto 09c
      // 092: ldc2_w -8739054301734045245
      // 095: lload 2
      // 096: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 0
      // 09d: ldc2_w -9156887778839078814
      // 0a0: lload 2
      // 0a1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: lload 6
      // 0a8: bipush 1
      // 0a9: anewarray 172
      // 0ac: dup_x2
      // 0ad: dup_x2
      // 0ae: pop
      // 0af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b2: bipush 0
      // 0b3: swap
      // 0b4: aastore
      // 0b5: ldc2_w -8850773640888097933
      // 0b8: lload 2
      // 0b9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: areturn
      // 0bf: ldc2_w -8739054301734045245
      // 0c2: lload 2
      // 0c3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: ldc2_w -9156887778839078814
      // 0cd: lload 2
      // 0ce: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: aload 8
      // 0d5: ifnonnull 0ff
      // 0d8: ifnull 100
      // 0db: goto 0e8
      // 0de: ldc2_w -8739054301734045245
      // 0e1: lload 2
      // 0e2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: ldc2_w -9156887778839078814
      // 0ec: lload 2
      // 0ed: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_f2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: goto 0ff
      // 0f5: ldc2_w -8739054301734045245
      // 0f8: lload 2
      // 0f9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: areturn
      // 100: aconst_null
      // 101: areturn
   }

   public long p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 8963427491518516549L, var2);
   }

   public String O(Object[] var1) {
      String var2 = (String)var1[0];
      return this.P + "!" + var2;
   }

   public _f2(long var1, String var3, long var4, String var6) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 37185430394900L;
      int var7 = (int)((var1 ^ 37185430394900L) >>> 48);
      int var8 = (int)((var1 ^ 37185430394900L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      this(var3, var4, (short)var7, var6, null, var8, null, (short)var9);
   }

   public Enumeration R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(x44.a<"l">(this, 4376858441875788332L, var2), 2734476094773580510L, var2);
   }

   public boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, 513005179189008340L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, 269347579952200903L, var2);
      }

      return false;
   }

   public wt k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -5156291822332909809L, var2);
   }

   public String c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 111194047883002L;
      int var6 = this.P.indexOf("!");

      try {
         if (var6 == -1) {
            return x44.a<"h">(this, new Object[]{var4}, -8888846184840208089L, var2);
         }
      } catch (gj var7) {
         throw x44.a<"p">(var7, -8760175069603366634L, var2);
      }

      return x44.a<"h">(new File(this.P.substring(0, var6)), -9046560150064828439L, var2) + this.P.substring(var6);
   }

   public String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 6464612554015590780L, var2);
   }

   public boolean s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"j">(this, 5809404950732245009L, var2) == null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"v">(var4, 6254286551919765936L, var2);
      }

      return false;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
