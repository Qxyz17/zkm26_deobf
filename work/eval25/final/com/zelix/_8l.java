package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8l {
   private Set g;
   private Set J;
   private Set Q;
   private w t;
   private Set m;
   private Set f;
   private w O;
   private w n;
   private Set Y;
   private Set F;
   private Set W;
   private Set a;
   private Set P;
   private Set E;
   private boolean u;
   private Set e;
   private w o;
   private static final long b = ess.a(-1792675263930674729L, -8764083810156345205L, MethodHandles.lookup().lookupClass()).a(102128394599042L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map h = new HashMap(13);

   private boolean s(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Object
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/md
      // 20: astore 5
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: ldc2_w 2202477937996561265
      // 2c: lload 3
      // 2d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: ldc2_w 2058865933850406791
      // 36: lload 3
      // 37: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: aload 5
      // 3e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 43: istore 8
      // 45: aload 0
      // 46: getfield com/zelix/_8l.a Ljava/util/Set;
      // 49: aload 5
      // 4b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 50: istore 9
      // 52: astore 7
      // 54: iload 9
      // 56: aload 7
      // 58: ifnonnull 87
      // 5b: ifeq 85
      // 5e: goto 6b
      // 61: ldc2_w 270321838699088609
      // 64: lload 3
      // 65: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: aload 6
      // 6e: aload 2
      // 6f: aload 5
      // 71: invokevirtual com/zelix/md.U ()Lcom/zelix/mx;
      // 74: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 77: pop
      // 78: goto 85
      // 7b: ldc2_w 270321838699088609
      // 7e: lload 3
      // 7f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: iload 9
      // 87: ireturn
   }

   public boolean D(ms var1) {
      return this.a.contains(var1);
   }

   private boolean z(Object[] var1) {
      xh var2 = (xh)var1[0];
      return this.a.add(var2);
   }

   private boolean H(Object var1, Object var2, mx var3) {
      return this.Q.add(var3);
   }

   public boolean g(Object[] var1) {
      long var2 = (Long)var1[0];
      md var4 = (md)var1[1];
      var2 = b ^ var2;
      return x44.a<"h">(this, -5847771060246815283L, var2).contains(var4);
   }

   public boolean b(Object[] var1) {
      mf var2 = (mf)var1[0];
      return this.a.contains(var2);
   }

   private boolean j(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Object
      // 0f: astore 3
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/mq
      // 16: astore 2
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 4
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 4
      // 28: lxor
      // 29: lstore 4
      // 2b: lload 4
      // 2d: dup2
      // 2e: ldc2_w 21234059882625
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w 5178504075825914428
      // 38: lload 4
      // 3a: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: ldc2_w 6389045080517369783
      // 43: lload 4
      // 45: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: aload 2
      // 4b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 50: istore 10
      // 52: astore 9
      // 54: iload 10
      // 56: aload 9
      // 58: ifnonnull 9e
      // 5b: ifeq 9c
      // 5e: goto 6c
      // 61: ldc2_w 6524898104710255532
      // 64: lload 4
      // 66: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 6
      // 6f: aload 3
      // 70: aload 2
      // 71: lload 7
      // 73: bipush 1
      // 74: anewarray 295
      // 77: dup_x2
      // 78: dup_x2
      // 79: pop
      // 7a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7d: bipush 0
      // 7e: swap
      // 7f: aastore
      // 80: ldc2_w 4839667940876814293
      // 83: lload 4
      // 85: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 8d: pop
      // 8e: goto 9c
      // 91: ldc2_w 6524898104710255532
      // 94: lload 4
      // 96: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: iload 10
      // 9e: ireturn
   }

   public boolean f(Object[] var1) {
      mu var2 = (mu)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      return x44.a<"j">(this, -1948153342251527124L, var3).contains(var2);
   }

   public Set F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 97634565211491L;
      return new sq(var4, this.e);
   }

   private boolean t(ms var1) {
      return this.a.add(var1);
   }

   public boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      xb var4 = (xb)var1[1];
      var2 = b ^ var2;
      return x44.a<"n">(this, -6323853304552762433L, var2).contains(var4);
   }

   public Set h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 124976825196716L;
      return new sq(var4, x44.a<"h">(this, -7756602310249746471L, var2));
   }

   public Set e(Object[] param1) {
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
      // 0e: checkcast com/zelix/xl
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_8l.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 10079911550372
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 80429625211298
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: ldc2_w -507250192830980844
      // 2d: lload 2
      // 2e: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: lload 7
      // 35: bipush 1
      // 36: anewarray 295
      // 39: dup_x2
      // 3a: dup_x2
      // 3b: pop
      // 3c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: ldc2_w -457514588628750230
      // 45: lload 2
      // 46: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: astore 10
      // 4d: astore 9
      // 4f: aload 0
      // 50: ldc2_w -436201906753584266
      // 53: lload 2
      // 54: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: lload 5
      // 5b: aload 4
      // 5d: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 60: astore 11
      // 62: aload 11
      // 64: aload 9
      // 66: ifnonnull a5
      // 69: ifnull 94
      // 6c: goto 79
      // 6f: ldc2_w -1899035907842610044
      // 72: lload 2
      // 73: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 10
      // 7b: aload 11
      // 7d: ldc2_w -1743484519596303259
      // 80: lload 2
      // 81: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: pop
      // 87: goto 94
      // 8a: ldc2_w -1899035907842610044
      // 8d: lload 2
      // 8e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: aload 0
      // 95: ldc2_w -429103568434305801
      // 98: lload 2
      // 99: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: lload 5
      // a0: aload 4
      // a2: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // a5: astore 12
      // a7: lload 2
      // a8: lconst_0
      // a9: lcmp
      // aa: ifle c0
      // ad: aload 12
      // af: ifnull cd
      // b2: aload 10
      // b4: aload 12
      // b6: ldc2_w -1743484519596303259
      // b9: lload 2
      // ba: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: pop
      // c0: goto cd
      // c3: ldc2_w -1899035907842610044
      // c6: lload 2
      // c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: aload 10
      // cf: areturn
   }

   private boolean d(Object[] var1) {
      mf var2 = (mf)var1[0];
      return this.a.add(var2);
   }

   public boolean X(mo var1) {
      return this.W.contains(var1);
   }

   public Set W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 51904174289920L;
      return new sq(var4, this.m);
   }

   private boolean A(Object param1, Object param2, char param3, short param4, mo param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 48
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 6
      // 11: i2l
      // 12: bipush 32
      // 14: lshl
      // 15: bipush 32
      // 17: lushr
      // 18: lor
      // 19: getstatic com/zelix/_8l.b J
      // 1c: lxor
      // 1d: lstore 7
      // 1f: lload 7
      // 21: dup2
      // 22: ldc2_w 21768728169491
      // 25: lxor
      // 26: lstore 9
      // 28: dup2
      // 29: ldc2_w 61233441518416
      // 2c: lxor
      // 2d: lstore 11
      // 2f: pop2
      // 30: ldc2_w -3417796783962671760
      // 33: lload 7
      // 35: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 0
      // 3b: getfield com/zelix/_8l.W Ljava/util/Set;
      // 3e: aload 5
      // 40: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 45: istore 14
      // 47: astore 13
      // 49: iload 14
      // 4b: aload 13
      // 4d: ifnonnull 8d
      // 50: ifeq 8b
      // 53: goto 61
      // 56: ldc2_w -3620562414238087968
      // 59: lload 7
      // 5b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: aload 1
      // 63: lload 9
      // 65: aload 2
      // 66: aload 5
      // 68: invokevirtual com/zelix/mo.R ()Lcom/zelix/x7;
      // 6b: invokespecial com/zelix/_8l.i (Ljava/lang/Object;JLjava/lang/Object;Lcom/zelix/x7;)Z
      // 6e: pop
      // 6f: aload 0
      // 70: aload 1
      // 71: aload 2
      // 72: aload 5
      // 74: invokevirtual com/zelix/mo.z ()Lcom/zelix/mn;
      // 77: lload 11
      // 79: invokespecial com/zelix/_8l.m (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mn;J)Z
      // 7c: pop
      // 7d: goto 8b
      // 80: ldc2_w -3620562414238087968
      // 83: lload 7
      // 85: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: iload 14
      // 8d: ireturn
   }

   public boolean l(long param1, xl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_8l.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 114790426885625
      // 00b: lxor
      // 00c: lstore 4
      // 00e: dup2
      // 00f: ldc2_w 57598239516197
      // 012: lxor
      // 013: lstore 6
      // 015: dup2
      // 016: ldc2_w 94159137531183
      // 019: lxor
      // 01a: lstore 8
      // 01c: dup2
      // 01d: ldc2_w 62750463293881
      // 020: lxor
      // 021: lstore 10
      // 023: dup2
      // 024: ldc2_w 118069045157235
      // 027: lxor
      // 028: lstore 12
      // 02a: dup2
      // 02b: ldc2_w 138150260354501
      // 02e: lxor
      // 02f: lstore 14
      // 031: dup2
      // 032: ldc2_w 21237630265897
      // 035: lxor
      // 036: lstore 16
      // 038: dup2
      // 039: ldc2_w 80479179941314
      // 03c: lxor
      // 03d: lstore 18
      // 03f: pop2
      // 040: ldc2_w -3174193861378001389
      // 043: lload 1
      // 044: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: astore 20
      // 04b: getstatic com/zelix/v1.Y [I
      // 04e: aload 3
      // 04f: lload 6
      // 051: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 054: invokevirtual com/zelix/w5.ordinal ()I
      // 057: iaload
      // 058: aload 20
      // 05a: ifnonnull 247
      // 05d: tableswitch 489 1 17 93 112 136 160 169 193 208 243 252 261 270 279 314 349 384 419 454
      // 0b0: ldc2_w -3557182055424112765
      // 0b3: lload 1
      // 0b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: aload 3
      // 0bc: checkcast com/zelix/mx
      // 0bf: invokevirtual com/zelix/_8l.W (Lcom/zelix/mx;)Z
      // 0c2: ireturn
      // 0c3: ldc2_w -3557182055424112765
      // 0c6: lload 1
      // 0c7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: aload 3
      // 0cf: checkcast com/zelix/mf
      // 0d2: bipush 1
      // 0d3: anewarray 295
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 0
      // 0d9: swap
      // 0da: aastore
      // 0db: ldc2_w -3833993590006613688
      // 0de: lload 1
      // 0df: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: ireturn
      // 0e5: aload 0
      // 0e6: aload 3
      // 0e7: checkcast com/zelix/xv
      // 0ea: bipush 1
      // 0eb: anewarray 295
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: ldc2_w -3060063734613127475
      // 0f6: lload 1
      // 0f7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: ireturn
      // 0fd: aload 0
      // 0fe: aload 3
      // 0ff: checkcast com/zelix/ms
      // 102: invokevirtual com/zelix/_8l.D (Lcom/zelix/ms;)Z
      // 105: ireturn
      // 106: aload 0
      // 107: aload 3
      // 108: checkcast com/zelix/xh
      // 10b: bipush 1
      // 10c: anewarray 295
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w -3492772866400800995
      // 117: lload 1
      // 118: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: ireturn
      // 11e: aload 0
      // 11f: aload 3
      // 120: checkcast com/zelix/x7
      // 123: ldc2_w -4027538719686971528
      // 126: lload 1
      // 127: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: ireturn
      // 12d: aload 0
      // 12e: lload 8
      // 130: aload 3
      // 131: checkcast com/zelix/md
      // 134: bipush 2
      // 135: anewarray 295
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 1
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x2
      // 13e: dup_x2
      // 13f: pop
      // 140: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 143: bipush 0
      // 144: swap
      // 145: aastore
      // 146: ldc2_w -3802328732700639493
      // 149: lload 1
      // 14a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: ireturn
      // 150: aload 0
      // 151: aload 3
      // 152: checkcast com/zelix/mo
      // 155: invokevirtual com/zelix/_8l.X (Lcom/zelix/mo;)Z
      // 158: ireturn
      // 159: aload 0
      // 15a: aload 3
      // 15b: checkcast com/zelix/mo
      // 15e: invokevirtual com/zelix/_8l.X (Lcom/zelix/mo;)Z
      // 161: ireturn
      // 162: aload 0
      // 163: aload 3
      // 164: checkcast com/zelix/mo
      // 167: invokevirtual com/zelix/_8l.X (Lcom/zelix/mo;)Z
      // 16a: ireturn
      // 16b: aload 0
      // 16c: aload 3
      // 16d: checkcast com/zelix/mn
      // 170: invokevirtual com/zelix/_8l.F (Lcom/zelix/mn;)Z
      // 173: ireturn
      // 174: aload 0
      // 175: lload 4
      // 177: aload 3
      // 178: checkcast com/zelix/x_
      // 17b: bipush 2
      // 17c: anewarray 295
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 0
      // 18b: swap
      // 18c: aastore
      // 18d: ldc2_w -3291894102844864836
      // 190: lload 1
      // 191: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: ireturn
      // 197: aload 0
      // 198: lload 10
      // 19a: aload 3
      // 19b: checkcast com/zelix/xb
      // 19e: bipush 2
      // 19f: anewarray 295
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 1
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x2
      // 1a8: dup_x2
      // 1a9: pop
      // 1aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ad: bipush 0
      // 1ae: swap
      // 1af: aastore
      // 1b0: ldc2_w -3886412886308188973
      // 1b3: lload 1
      // 1b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: ireturn
      // 1ba: aload 0
      // 1bb: lload 16
      // 1bd: aload 3
      // 1be: checkcast com/zelix/x2
      // 1c1: bipush 2
      // 1c2: anewarray 295
      // 1c5: dup_x1
      // 1c6: swap
      // 1c7: bipush 1
      // 1c8: swap
      // 1c9: aastore
      // 1ca: dup_x2
      // 1cb: dup_x2
      // 1cc: pop
      // 1cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d0: bipush 0
      // 1d1: swap
      // 1d2: aastore
      // 1d3: ldc2_w -3554724445808470866
      // 1d6: lload 1
      // 1d7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: ireturn
      // 1dd: aload 0
      // 1de: aload 3
      // 1df: checkcast com/zelix/x4
      // 1e2: lload 12
      // 1e4: bipush 2
      // 1e5: anewarray 295
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 1
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 0
      // 1f4: swap
      // 1f5: aastore
      // 1f6: ldc2_w -3309584482534745863
      // 1f9: lload 1
      // 1fa: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: ireturn
      // 200: aload 0
      // 201: aload 3
      // 202: checkcast com/zelix/mu
      // 205: lload 14
      // 207: bipush 2
      // 208: anewarray 295
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x1
      // 215: swap
      // 216: bipush 0
      // 217: swap
      // 218: aastore
      // 219: ldc2_w -3565817664864913762
      // 21c: lload 1
      // 21d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: ireturn
      // 223: aload 0
      // 224: aload 3
      // 225: checkcast com/zelix/mq
      // 228: lload 18
      // 22a: bipush 2
      // 22b: anewarray 295
      // 22e: dup_x2
      // 22f: dup_x2
      // 230: pop
      // 231: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 234: bipush 1
      // 235: swap
      // 236: aastore
      // 237: dup_x1
      // 238: swap
      // 239: bipush 0
      // 23a: swap
      // 23b: aastore
      // 23c: ldc2_w -3317310910990309145
      // 23f: lload 1
      // 240: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: ireturn
      // 246: bipush 0
      // 247: ireturn
   }

   public List h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 37984751012206L;

      try {
         return this.u ? new ArrayList(x44.a<"i">(x44.a<"m">(this, -454852020441595084L, var2), new Object[]{var4}, -142923998279808931L, var2)) : null;
      } catch (gj var6) {
         throw x44.a<"q">(var6, -1880531891254498106L, var2);
      }
   }

   public Set N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 80531326568556L;
      return new sq(var4, this.a);
   }

   public boolean Z(Object[] var1) {
      xh var2 = (xh)var1[0];
      return this.a.contains(var2);
   }

   public Set L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 27868638948530L;
      return new sq(var4, x44.a<"n">(this, -2595182134303958199L, var2));
   }

   public boolean H(xl param1, Object param2, Object param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_8l.b J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 36853180599777
      // 00e: lxor
      // 00f: lstore 6
      // 011: dup2
      // 012: ldc2_w 100006348315637
      // 015: lxor
      // 016: dup2
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 8
      // 01d: dup2
      // 01e: bipush 16
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 9
      // 027: dup2
      // 028: bipush 32
      // 02a: lshl
      // 02b: bipush 32
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 10
      // 031: pop2
      // 032: dup2
      // 033: ldc2_w 82667837863236
      // 036: lxor
      // 037: lstore 11
      // 039: dup2
      // 03a: ldc2_w 125638636823732
      // 03d: lxor
      // 03e: lstore 13
      // 040: dup2
      // 041: ldc2_w 25398496204276
      // 044: lxor
      // 045: lstore 15
      // 047: dup2
      // 048: ldc2_w 131026256464411
      // 04b: lxor
      // 04c: lstore 17
      // 04e: dup2
      // 04f: ldc2_w 6570837930658
      // 052: lxor
      // 053: lstore 19
      // 055: dup2
      // 056: ldc2_w 92643221502123
      // 059: lxor
      // 05a: lstore 21
      // 05c: dup2
      // 05d: ldc2_w 103469631985924
      // 060: lxor
      // 061: lstore 23
      // 063: dup2
      // 064: ldc2_w 123415592084655
      // 067: lxor
      // 068: lstore 25
      // 06a: dup2
      // 06b: ldc2_w 135325034624713
      // 06e: lxor
      // 06f: lstore 27
      // 071: dup2
      // 072: ldc2_w 122180012035257
      // 075: lxor
      // 076: lstore 29
      // 078: pop2
      // 079: ldc2_w -7970322792755432318
      // 07c: lload 4
      // 07e: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: astore 31
      // 085: aload 0
      // 086: getfield com/zelix/_8l.u Z
      // 089: aload 31
      // 08b: ifnonnull 1e7
      // 08e: ifeq 1da
      // 091: goto 09f
      // 094: ldc2_w -8344290627625220846
      // 097: lload 4
      // 099: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: aload 2
      // 0a0: instanceof com/zelix/_og
      // 0a3: aload 31
      // 0a5: ifnonnull 1e7
      // 0a8: goto 0b6
      // 0ab: ldc2_w -8344290627625220846
      // 0ae: lload 4
      // 0b0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ifeq 1da
      // 0b9: goto 0c7
      // 0bc: ldc2_w -8344290627625220846
      // 0bf: lload 4
      // 0c1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: instanceof com/zelix/be
      // 0cb: aload 31
      // 0cd: ifnonnull 1e7
      // 0d0: goto 0de
      // 0d3: ldc2_w -8344290627625220846
      // 0d6: lload 4
      // 0d8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ifeq 1da
      // 0e1: goto 0ef
      // 0e4: ldc2_w -8344290627625220846
      // 0e7: lload 4
      // 0e9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: aload 2
      // 0f0: checkcast com/zelix/_og
      // 0f3: astore 32
      // 0f5: aload 3
      // 0f6: checkcast com/zelix/be
      // 0f9: astore 33
      // 0fb: aload 32
      // 0fd: invokevirtual com/zelix/_og.l ()I
      // 100: sipush 2934
      // 103: ldc2_w 1926739045645755757
      // 106: lload 4
      // 108: lxor
      // 109: invokedynamic d (IJ)I bsm=com/zelix/_8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: lload 4
      // 110: lconst_0
      // 111: lcmp
      // 112: iflt 1a1
      // 115: aload 31
      // 117: ifnonnull 1a1
      // 11a: if_icmpne 166
      // 11d: goto 12b
      // 120: ldc2_w -8344290627625220846
      // 123: lload 4
      // 125: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 0
      // 12c: ldc2_w -8042277022694004000
      // 12f: lload 4
      // 131: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: lload 27
      // 138: aload 1
      // 139: aload 33
      // 13b: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 13e: pop
      // 13f: aload 0
      // 140: ldc2_w -8241630123903681912
      // 143: lload 4
      // 145: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: lload 27
      // 14c: aload 33
      // 14e: aload 1
      // 14f: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 152: pop
      // 153: aload 31
      // 155: ifnull 1da
      // 158: goto 166
      // 15b: ldc2_w -8344290627625220846
      // 15e: lload 4
      // 160: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: aload 32
      // 168: invokevirtual com/zelix/_og.l ()I
      // 16b: aload 31
      // 16d: lload 4
      // 16f: lconst_0
      // 170: lcmp
      // 171: iflt 1e9
      // 174: ifnonnull 1e7
      // 177: goto 185
      // 17a: ldc2_w -8344290627625220846
      // 17d: lload 4
      // 17f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: sipush 2117
      // 188: ldc2_w 6512446296014595679
      // 18b: lload 4
      // 18d: lxor
      // 18e: invokedynamic d (IJ)I bsm=com/zelix/_8l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: goto 1a1
      // 196: ldc2_w -8344290627625220846
      // 199: lload 4
      // 19b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: if_icmpne 1da
      // 1a4: aload 0
      // 1a5: ldc2_w -7809840339643167391
      // 1a8: lload 4
      // 1aa: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: lload 27
      // 1b1: aload 1
      // 1b2: aload 33
      // 1b4: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 1b7: pop
      // 1b8: aload 0
      // 1b9: ldc2_w -8505698020788763095
      // 1bc: lload 4
      // 1be: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: lload 27
      // 1c5: aload 33
      // 1c7: aload 1
      // 1c8: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 1cb: pop
      // 1cc: goto 1da
      // 1cf: ldc2_w -8344290627625220846
      // 1d2: lload 4
      // 1d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: getstatic com/zelix/v1.Y [I
      // 1dd: aload 1
      // 1de: lload 13
      // 1e0: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 1e3: invokevirtual com/zelix/w5.ordinal ()I
      // 1e6: iaload
      // 1e7: aload 31
      // 1e9: ifnonnull 459
      // 1ec: tableswitch 620 1 17 95 117 142 167 176 201 214 262 281 300 319 332 380 428 476 524 572
      // 240: ldc2_w -8344290627625220846
      // 243: lload 4
      // 245: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: aload 0
      // 24c: aload 2
      // 24d: aload 3
      // 24e: aload 1
      // 24f: checkcast com/zelix/mx
      // 252: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 255: ireturn
      // 256: ldc2_w -8344290627625220846
      // 259: lload 4
      // 25b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: aload 0
      // 262: aload 1
      // 263: checkcast com/zelix/mf
      // 266: bipush 1
      // 267: anewarray 295
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 0
      // 26d: swap
      // 26e: aastore
      // 26f: ldc2_w -8312924506365500694
      // 272: lload 4
      // 274: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: ireturn
      // 27a: aload 0
      // 27b: aload 1
      // 27c: checkcast com/zelix/xv
      // 27f: bipush 1
      // 280: anewarray 295
      // 283: dup_x1
      // 284: swap
      // 285: bipush 0
      // 286: swap
      // 287: aastore
      // 288: ldc2_w -7983873290012630339
      // 28b: lload 4
      // 28d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: ireturn
      // 293: aload 0
      // 294: aload 1
      // 295: checkcast com/zelix/ms
      // 298: invokespecial com/zelix/_8l.t (Lcom/zelix/ms;)Z
      // 29b: ireturn
      // 29c: aload 0
      // 29d: aload 1
      // 29e: checkcast com/zelix/xh
      // 2a1: bipush 1
      // 2a2: anewarray 295
      // 2a5: dup_x1
      // 2a6: swap
      // 2a7: bipush 0
      // 2a8: swap
      // 2a9: aastore
      // 2aa: ldc2_w -7502213511467339226
      // 2ad: lload 4
      // 2af: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: ireturn
      // 2b5: aload 0
      // 2b6: aload 2
      // 2b7: lload 6
      // 2b9: aload 3
      // 2ba: aload 1
      // 2bb: checkcast com/zelix/x7
      // 2be: invokespecial com/zelix/_8l.i (Ljava/lang/Object;JLjava/lang/Object;Lcom/zelix/x7;)Z
      // 2c1: ireturn
      // 2c2: aload 0
      // 2c3: aload 2
      // 2c4: aload 3
      // 2c5: lload 15
      // 2c7: aload 1
      // 2c8: checkcast com/zelix/md
      // 2cb: bipush 4
      // 2cc: anewarray 295
      // 2cf: dup_x1
      // 2d0: swap
      // 2d1: bipush 3
      // 2d2: swap
      // 2d3: aastore
      // 2d4: dup_x2
      // 2d5: dup_x2
      // 2d6: pop
      // 2d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2da: bipush 2
      // 2db: swap
      // 2dc: aastore
      // 2dd: dup_x1
      // 2de: swap
      // 2df: bipush 1
      // 2e0: swap
      // 2e1: aastore
      // 2e2: dup_x1
      // 2e3: swap
      // 2e4: bipush 0
      // 2e5: swap
      // 2e6: aastore
      // 2e7: ldc2_w -8532193572378369710
      // 2ea: lload 4
      // 2ec: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: ireturn
      // 2f2: aload 0
      // 2f3: aload 2
      // 2f4: aload 3
      // 2f5: iload 8
      // 2f7: i2c
      // 2f8: iload 9
      // 2fa: i2s
      // 2fb: aload 1
      // 2fc: checkcast com/zelix/mo
      // 2ff: iload 10
      // 301: invokespecial com/zelix/_8l.A (Ljava/lang/Object;Ljava/lang/Object;CSLcom/zelix/mo;I)Z
      // 304: ireturn
      // 305: aload 0
      // 306: aload 2
      // 307: aload 3
      // 308: iload 8
      // 30a: i2c
      // 30b: iload 9
      // 30d: i2s
      // 30e: aload 1
      // 30f: checkcast com/zelix/mo
      // 312: iload 10
      // 314: invokespecial com/zelix/_8l.A (Ljava/lang/Object;Ljava/lang/Object;CSLcom/zelix/mo;I)Z
      // 317: ireturn
      // 318: aload 0
      // 319: aload 2
      // 31a: aload 3
      // 31b: iload 8
      // 31d: i2c
      // 31e: iload 9
      // 320: i2s
      // 321: aload 1
      // 322: checkcast com/zelix/mo
      // 325: iload 10
      // 327: invokespecial com/zelix/_8l.A (Ljava/lang/Object;Ljava/lang/Object;CSLcom/zelix/mo;I)Z
      // 32a: ireturn
      // 32b: aload 0
      // 32c: aload 2
      // 32d: aload 3
      // 32e: aload 1
      // 32f: checkcast com/zelix/mn
      // 332: lload 19
      // 334: invokespecial com/zelix/_8l.m (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mn;J)Z
      // 337: ireturn
      // 338: aload 0
      // 339: aload 2
      // 33a: lload 17
      // 33c: aload 3
      // 33d: aload 1
      // 33e: checkcast com/zelix/x_
      // 341: bipush 4
      // 342: anewarray 295
      // 345: dup_x1
      // 346: swap
      // 347: bipush 3
      // 348: swap
      // 349: aastore
      // 34a: dup_x1
      // 34b: swap
      // 34c: bipush 2
      // 34d: swap
      // 34e: aastore
      // 34f: dup_x2
      // 350: dup_x2
      // 351: pop
      // 352: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 355: bipush 1
      // 356: swap
      // 357: aastore
      // 358: dup_x1
      // 359: swap
      // 35a: bipush 0
      // 35b: swap
      // 35c: aastore
      // 35d: ldc2_w -7783440237547480845
      // 360: lload 4
      // 362: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: ireturn
      // 368: aload 0
      // 369: aload 2
      // 36a: aload 3
      // 36b: aload 1
      // 36c: checkcast com/zelix/xb
      // 36f: lload 23
      // 371: bipush 4
      // 372: anewarray 295
      // 375: dup_x2
      // 376: dup_x2
      // 377: pop
      // 378: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37b: bipush 3
      // 37c: swap
      // 37d: aastore
      // 37e: dup_x1
      // 37f: swap
      // 380: bipush 2
      // 381: swap
      // 382: aastore
      // 383: dup_x1
      // 384: swap
      // 385: bipush 1
      // 386: swap
      // 387: aastore
      // 388: dup_x1
      // 389: swap
      // 38a: bipush 0
      // 38b: swap
      // 38c: aastore
      // 38d: ldc2_w -8213718694866064007
      // 390: lload 4
      // 392: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: ireturn
      // 398: aload 0
      // 399: aload 2
      // 39a: aload 3
      // 39b: aload 1
      // 39c: checkcast com/zelix/x2
      // 39f: lload 21
      // 3a1: bipush 4
      // 3a2: anewarray 295
      // 3a5: dup_x2
      // 3a6: dup_x2
      // 3a7: pop
      // 3a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ab: bipush 3
      // 3ac: swap
      // 3ad: aastore
      // 3ae: dup_x1
      // 3af: swap
      // 3b0: bipush 2
      // 3b1: swap
      // 3b2: aastore
      // 3b3: dup_x1
      // 3b4: swap
      // 3b5: bipush 1
      // 3b6: swap
      // 3b7: aastore
      // 3b8: dup_x1
      // 3b9: swap
      // 3ba: bipush 0
      // 3bb: swap
      // 3bc: aastore
      // 3bd: ldc2_w -8148983112669248199
      // 3c0: lload 4
      // 3c2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: ireturn
      // 3c8: aload 0
      // 3c9: aload 2
      // 3ca: lload 11
      // 3cc: aload 3
      // 3cd: aload 1
      // 3ce: checkcast com/zelix/x4
      // 3d1: bipush 4
      // 3d2: anewarray 295
      // 3d5: dup_x1
      // 3d6: swap
      // 3d7: bipush 3
      // 3d8: swap
      // 3d9: aastore
      // 3da: dup_x1
      // 3db: swap
      // 3dc: bipush 2
      // 3dd: swap
      // 3de: aastore
      // 3df: dup_x2
      // 3e0: dup_x2
      // 3e1: pop
      // 3e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e5: bipush 1
      // 3e6: swap
      // 3e7: aastore
      // 3e8: dup_x1
      // 3e9: swap
      // 3ea: bipush 0
      // 3eb: swap
      // 3ec: aastore
      // 3ed: ldc2_w -7787956053113507417
      // 3f0: lload 4
      // 3f2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: ireturn
      // 3f8: aload 0
      // 3f9: aload 2
      // 3fa: lload 25
      // 3fc: aload 3
      // 3fd: aload 1
      // 3fe: checkcast com/zelix/mu
      // 401: bipush 4
      // 402: anewarray 295
      // 405: dup_x1
      // 406: swap
      // 407: bipush 3
      // 408: swap
      // 409: aastore
      // 40a: dup_x1
      // 40b: swap
      // 40c: bipush 2
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x2
      // 410: dup_x2
      // 411: pop
      // 412: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 415: bipush 1
      // 416: swap
      // 417: aastore
      // 418: dup_x1
      // 419: swap
      // 41a: bipush 0
      // 41b: swap
      // 41c: aastore
      // 41d: ldc2_w -8225875507333480900
      // 420: lload 4
      // 422: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: ireturn
      // 428: aload 0
      // 429: aload 2
      // 42a: aload 3
      // 42b: aload 1
      // 42c: checkcast com/zelix/mq
      // 42f: lload 29
      // 431: bipush 4
      // 432: anewarray 295
      // 435: dup_x2
      // 436: dup_x2
      // 437: pop
      // 438: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43b: bipush 3
      // 43c: swap
      // 43d: aastore
      // 43e: dup_x1
      // 43f: swap
      // 440: bipush 2
      // 441: swap
      // 442: aastore
      // 443: dup_x1
      // 444: swap
      // 445: bipush 1
      // 446: swap
      // 447: aastore
      // 448: dup_x1
      // 449: swap
      // 44a: bipush 0
      // 44b: swap
      // 44c: aastore
      // 44d: ldc2_w -7619759950878194312
      // 450: lload 4
      // 452: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: ireturn
      // 458: bipush 0
      // 459: ireturn
   }

   public Set i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 21385827642347L;
      return new sq(var4, x44.a<"o">(this, 1901878635122685986L, var2));
   }

   private boolean R(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Object
      // 18: astore 6
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/mu
      // 20: astore 5
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 9807970954307
      // 2e: lxor
      // 2f: lstore 7
      // 31: pop2
      // 32: ldc2_w -5779348518439892438
      // 35: lload 3
      // 36: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 0
      // 3c: ldc2_w -5832848273246330921
      // 3f: lload 3
      // 40: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: aload 5
      // 47: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4c: istore 10
      // 4e: astore 9
      // 50: iload 10
      // 52: aload 9
      // 54: ifnonnull 98
      // 57: ifeq 96
      // 5a: goto 67
      // 5d: ldc2_w -5576855601173087302
      // 60: lload 3
      // 61: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 0
      // 68: aload 2
      // 69: aload 6
      // 6b: aload 5
      // 6d: lload 7
      // 6f: bipush 1
      // 70: anewarray 295
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -5217773827080619310
      // 7f: lload 3
      // 80: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 88: pop
      // 89: goto 96
      // 8c: ldc2_w -5576855601173087302
      // 8f: lload 3
      // 90: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: iload 10
      // 98: ireturn
   }

   public _8l(short var1, int var2, short var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var7 = var5 ^ 66496232441229L;
      this(var7, var2, false);
   }

   public boolean C(Object[] var1) {
      long var3 = (Long)var1[0];
      x_ var2 = (x_)var1[1];
      var3 = b ^ var3;
      return x44.a<"n">(this, 8141175072592571195L, var3).contains(var2);
   }

   public boolean x(Object[] var1) {
      mq var4 = (mq)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      return x44.a<"m">(this, -918713789507799971L, var2).contains(var4);
   }

   private boolean o(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 5
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Object
      // 1a: astore 2
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/x_
      // 21: astore 3
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 5
      // 28: lxor
      // 29: lstore 5
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 76287419567081
      // 31: lxor
      // 32: dup2
      // 33: bipush 48
      // 35: lushr
      // 36: l2i
      // 37: istore 7
      // 39: dup2
      // 3a: bipush 16
      // 3c: lshl
      // 3d: bipush 48
      // 3f: lushr
      // 40: l2i
      // 41: istore 8
      // 43: dup2
      // 44: bipush 32
      // 46: lshl
      // 47: bipush 32
      // 49: lushr
      // 4a: l2i
      // 4b: istore 9
      // 4d: pop2
      // 4e: dup2
      // 4f: ldc2_w 117536995884617
      // 52: lxor
      // 53: lstore 10
      // 55: pop2
      // 56: ldc2_w 107987643564450974
      // 59: lload 5
      // 5b: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: aload 0
      // 61: ldc2_w 398598194562883144
      // 64: lload 5
      // 66: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: aload 3
      // 6c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 71: istore 13
      // 73: astore 12
      // 75: iload 13
      // 77: aload 12
      // 79: ifnonnull c9
      // 7c: ifeq c7
      // 7f: goto 8d
      // 82: ldc2_w 2030842458733122830
      // 85: lload 5
      // 87: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 0
      // 8e: aload 4
      // 90: aload 2
      // 91: aload 3
      // 92: lload 10
      // 94: bipush 1
      // 95: anewarray 295
      // 98: dup_x2
      // 99: dup_x2
      // 9a: pop
      // 9b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9e: bipush 0
      // 9f: swap
      // a0: aastore
      // a1: ldc2_w 2233110978330863360
      // a4: lload 5
      // a6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: iload 7
      // ad: i2c
      // ae: swap
      // af: iload 8
      // b1: i2s
      // b2: swap
      // b3: iload 9
      // b5: invokespecial com/zelix/_8l.A (Ljava/lang/Object;Ljava/lang/Object;CSLcom/zelix/mo;I)Z
      // b8: pop
      // b9: goto c7
      // bc: ldc2_w 2030842458733122830
      // bf: lload 5
      // c1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: iload 13
      // c9: ireturn
   }

   public boolean W(mx var1) {
      return this.Q.contains(var1);
   }

   public boolean M(Object[] var1) {
      xv var2 = (xv)var1[0];
      return this.a.contains(var2);
   }

   private boolean E(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Object
      // 0e: astore 6
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/xb
      // 16: astore 5
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 3
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 5300089907717
      // 2e: lxor
      // 2f: lstore 7
      // 31: pop2
      // 32: ldc2_w -3287470495584503935
      // 35: lload 3
      // 36: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 0
      // 3c: ldc2_w -3886314273491406445
      // 3f: lload 3
      // 40: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: aload 5
      // 47: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4c: istore 10
      // 4e: astore 9
      // 50: iload 10
      // 52: aload 9
      // 54: ifnonnull 98
      // 57: ifeq 96
      // 5a: goto 67
      // 5d: ldc2_w -3517265933313751535
      // 60: lload 3
      // 61: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 0
      // 68: aload 2
      // 69: aload 6
      // 6b: aload 5
      // 6d: lload 7
      // 6f: bipush 1
      // 70: anewarray 295
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -3256845544143770071
      // 7f: lload 3
      // 80: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 88: pop
      // 89: goto 96
      // 8c: ldc2_w -3517265933313751535
      // 8f: lload 3
      // 90: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: iload 10
      // 98: ireturn
   }

   private boolean m(Object param1, Object param2, mn param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_8l.b J
      // 03: lload 4
      // 05: lxor
      // 06: lstore 4
      // 08: ldc2_w -448437039176180697
      // 0b: lload 4
      // 0d: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: getfield com/zelix/_8l.m Ljava/util/Set;
      // 16: aload 3
      // 17: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1c: istore 7
      // 1e: astore 6
      // 20: iload 7
      // 22: aload 6
      // 24: ifnonnull 5e
      // 27: ifeq 5c
      // 2a: goto 38
      // 2d: ldc2_w -1975265321302528585
      // 30: lload 4
      // 32: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: aload 3
      // 3c: invokevirtual com/zelix/mn.C ()Lcom/zelix/mx;
      // 3f: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 42: pop
      // 43: aload 0
      // 44: aload 1
      // 45: aload 2
      // 46: aload 3
      // 47: invokevirtual com/zelix/mn.X ()Lcom/zelix/mx;
      // 4a: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 4d: pop
      // 4e: goto 5c
      // 51: ldc2_w -1975265321302528585
      // 54: lload 4
      // 56: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: iload 7
      // 5e: ireturn
   }

   public Set K(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 56127337830248L;
      return new sq(var4, this.W);
   }

   private boolean i(Object param1, long param2, Object param4, x7 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_8l.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w 470046301536281444
      // 09: lload 2
      // 0a: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: getfield com/zelix/_8l.e Ljava/util/Set;
      // 13: aload 5
      // 15: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1a: istore 7
      // 1c: astore 6
      // 1e: iload 7
      // 20: aload 6
      // 22: ifnonnull 51
      // 25: ifeq 4f
      // 28: goto 35
      // 2b: ldc2_w 2005604706358235892
      // 2e: lload 2
      // 2f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: aload 4
      // 39: aload 5
      // 3b: invokevirtual com/zelix/x7.i ()Lcom/zelix/mx;
      // 3e: invokespecial com/zelix/_8l.H (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mx;)Z
      // 41: pop
      // 42: goto 4f
      // 45: ldc2_w 2005604706358235892
      // 48: lload 2
      // 49: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: iload 7
      // 51: ireturn
   }

   public boolean V(Object[] var1) {
      x4 var2 = (x4)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      return x44.a<"l">(this, -8120519282720239621L, var3).contains(var2);
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      x2 var4 = (x2)var1[1];
      var2 = b ^ var2;
      return x44.a<"n">(this, 4527726993241169043L, var2).contains(var4);
   }

   public Set j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 67322925039373L;
      return new sq(var4, x44.a<"i">(this, -2919328873743020868L, var2));
   }

   private boolean Y(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 2
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/x4
      // 20: astore 5
      // 22: pop
      // 23: getstatic com/zelix/_8l.b J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 114946530399278
      // 2e: lxor
      // 2f: lstore 7
      // 31: dup2
      // 32: ldc2_w 42237048544737
      // 35: lxor
      // 36: lstore 9
      // 38: pop2
      // 39: ldc2_w 4476747586202459073
      // 3c: lload 3
      // 3d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: aload 0
      // 43: ldc2_w 2731566039642449245
      // 46: lload 3
      // 47: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: aload 5
      // 4e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 53: istore 12
      // 55: astore 11
      // 57: iload 12
      // 59: aload 11
      // 5b: ifnonnull a1
      // 5e: ifeq 9f
      // 61: goto 6e
      // 64: ldc2_w 2553607447532317265
      // 67: lload 3
      // 68: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 0
      // 6f: aload 6
      // 71: aload 2
      // 72: aload 5
      // 74: lload 7
      // 76: bipush 1
      // 77: anewarray 295
      // 7a: dup_x2
      // 7b: dup_x2
      // 7c: pop
      // 7d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 80: bipush 0
      // 81: swap
      // 82: aastore
      // 83: ldc2_w 4180980555779422161
      // 86: lload 3
      // 87: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: lload 9
      // 8e: invokespecial com/zelix/_8l.m (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mn;J)Z
      // 91: pop
      // 92: goto 9f
      // 95: ldc2_w 2553607447532317265
      // 98: lload 3
      // 99: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: iload 12
      // a1: ireturn
   }

   public List r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 55973335971475L;

      try {
         return this.u ? new ArrayList(x44.a<"l">(x44.a<"h">(this, 411184525094689608L, var2), new Object[]{var4}, 142192164552488864L, var2)) : null;
      } catch (gj var6) {
         throw x44.a<"t">(var6, 1880835933845230395L, var2);
      }
   }

   public _8l(long param1, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_8l.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 137115983483983
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 65444399184645
      // 012: lxor
      // 013: dup2
      // 014: bipush 56
      // 016: lushr
      // 017: l2i
      // 018: istore 7
      // 01a: dup2
      // 01b: bipush 8
      // 01d: lshl
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 8
      // 024: dup2
      // 025: bipush 40
      // 027: lshl
      // 028: bipush 40
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 9
      // 02e: pop2
      // 02f: dup2
      // 030: ldc2_w 4876066729540
      // 033: lxor
      // 034: lstore 10
      // 036: dup2
      // 037: ldc2_w 116346034097051
      // 03a: lxor
      // 03b: lstore 12
      // 03d: pop2
      // 03e: aload 0
      // 03f: invokespecial java/lang/Object.<init> ()V
      // 042: iload 3
      // 043: lload 5
      // 045: invokestatic com/zelix/sh.Q (IJ)I
      // 048: istore 15
      // 04a: aload 0
      // 04b: lload 12
      // 04d: iload 15
      // 04f: bipush 2
      // 050: anewarray 295
      // 053: dup_x1
      // 054: swap
      // 055: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x2
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061: bipush 0
      // 062: swap
      // 063: aastore
      // 064: ldc2_w 4140544562132138082
      // 067: lload 1
      // 068: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: putfield com/zelix/_8l.Q Ljava/util/Set;
      // 070: aload 0
      // 071: lload 12
      // 073: iload 15
      // 075: bipush 2
      // 076: anewarray 295
      // 079: dup_x1
      // 07a: swap
      // 07b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: ldc2_w 4140544562132138082
      // 08d: lload 1
      // 08e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: putfield com/zelix/_8l.m Ljava/util/Set;
      // 096: aload 0
      // 097: lload 12
      // 099: iload 15
      // 09b: bipush 2
      // 09c: anewarray 295
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a4: bipush 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 4140544562132138082
      // 0b3: lload 1
      // 0b4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: putfield com/zelix/_8l.W Ljava/util/Set;
      // 0bc: aload 0
      // 0bd: lload 12
      // 0bf: iload 15
      // 0c1: bipush 2
      // 0c2: anewarray 295
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w 4140544562132138082
      // 0d9: lload 1
      // 0da: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: putfield com/zelix/_8l.e Ljava/util/Set;
      // 0e2: aload 0
      // 0e3: lload 12
      // 0e5: iload 15
      // 0e7: bipush 2
      // 0e8: anewarray 295
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f0: bipush 1
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: ldc2_w 4140544562132138082
      // 0ff: lload 1
      // 100: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: ldc2_w 2465123774768042272
      // 108: lload 1
      // 109: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: ldc2_w 2321509573897110998
      // 111: lload 1
      // 112: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: aload 0
      // 118: lload 12
      // 11a: iload 15
      // 11c: bipush 2
      // 11d: anewarray 295
      // 120: dup_x1
      // 121: swap
      // 122: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 125: bipush 1
      // 126: swap
      // 127: aastore
      // 128: dup_x2
      // 129: dup_x2
      // 12a: pop
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: bipush 0
      // 12f: swap
      // 130: aastore
      // 131: ldc2_w 4140544562132138082
      // 134: lload 1
      // 135: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: putfield com/zelix/_8l.a Ljava/util/Set;
      // 13d: astore 14
      // 13f: aload 0
      // 140: lload 12
      // 142: iload 15
      // 144: bipush 2
      // 145: anewarray 295
      // 148: dup_x1
      // 149: swap
      // 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14d: bipush 1
      // 14e: swap
      // 14f: aastore
      // 150: dup_x2
      // 151: dup_x2
      // 152: pop
      // 153: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w 4140544562132138082
      // 15c: lload 1
      // 15d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: ldc2_w 4413135602905079672
      // 165: lload 1
      // 166: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: aload 0
      // 16c: lload 12
      // 16e: iload 15
      // 170: bipush 2
      // 171: anewarray 295
      // 174: dup_x1
      // 175: swap
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w 4140544562132138082
      // 188: lload 1
      // 189: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: ldc2_w 4323255851655215946
      // 191: lload 1
      // 192: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: aload 0
      // 198: lload 12
      // 19a: iload 15
      // 19c: bipush 2
      // 19d: anewarray 295
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a5: bipush 1
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: ldc2_w 4140544562132138082
      // 1b4: lload 1
      // 1b5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: ldc2_w 4054979549725082564
      // 1bd: lload 1
      // 1be: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: aload 0
      // 1c4: lload 12
      // 1c6: iload 15
      // 1c8: bipush 2
      // 1c9: anewarray 295
      // 1cc: dup_x1
      // 1cd: swap
      // 1ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x2
      // 1d5: dup_x2
      // 1d6: pop
      // 1d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1da: bipush 0
      // 1db: swap
      // 1dc: aastore
      // 1dd: ldc2_w 4140544562132138082
      // 1e0: lload 1
      // 1e1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: ldc2_w 2648139030336405248
      // 1e9: lload 1
      // 1ea: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: aload 0
      // 1f0: lload 12
      // 1f2: iload 15
      // 1f4: bipush 2
      // 1f5: anewarray 295
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fd: bipush 1
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x2
      // 201: dup_x2
      // 202: pop
      // 203: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 206: bipush 0
      // 207: swap
      // 208: aastore
      // 209: ldc2_w 4140544562132138082
      // 20c: lload 1
      // 20d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: ldc2_w 2373826822201495595
      // 215: lload 1
      // 216: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 0
      // 21c: lload 12
      // 21e: iload 15
      // 220: bipush 2
      // 221: anewarray 295
      // 224: dup_x1
      // 225: swap
      // 226: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 229: bipush 1
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 0
      // 233: swap
      // 234: aastore
      // 235: ldc2_w 4140544562132138082
      // 238: lload 1
      // 239: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: ldc2_w 4557752821767452765
      // 241: lload 1
      // 242: invokedynamic r (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: aload 0
      // 248: iload 4
      // 24a: putfield com/zelix/_8l.u Z
      // 24d: aload 14
      // 24f: ifnonnull 2b8
      // 252: iload 4
      // 254: ifeq 2cb
      // 257: goto 264
      // 25a: ldc2_w 4424521565884232774
      // 25d: lload 1
      // 25e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: athrow
      // 264: aload 0
      // 265: new com/zelix/w
      // 268: dup
      // 269: iload 15
      // 26b: iload 7
      // 26d: i2b
      // 26e: iload 8
      // 270: iload 9
      // 272: invokespecial com/zelix/w.<init> (IBII)V
      // 275: ldc2_w 2391418712224373684
      // 278: lload 1
      // 279: invokedynamic r (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: aload 0
      // 27f: new com/zelix/w
      // 282: dup
      // 283: iload 15
      // 285: iload 7
      // 287: i2b
      // 288: iload 8
      // 28a: iload 9
      // 28c: invokespecial com/zelix/w.<init> (IBII)V
      // 28f: ldc2_w 2506761823015877685
      // 292: lload 1
      // 293: invokedynamic r (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: aload 0
      // 299: new com/zelix/w
      // 29c: dup
      // 29d: lload 10
      // 29f: invokespecial com/zelix/w.<init> (J)V
      // 2a2: ldc2_w 4380815098568854492
      // 2a5: lload 1
      // 2a6: invokedynamic r (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: goto 2b8
      // 2ae: ldc2_w 4424521565884232774
      // 2b1: lload 1
      // 2b2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: new com/zelix/w
      // 2bc: dup
      // 2bd: lload 10
      // 2bf: invokespecial com/zelix/w.<init> (J)V
      // 2c2: ldc2_w 4080720554497554301
      // 2c5: lload 1
      // 2c6: invokedynamic r (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: return
   }

   public Set p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 68217358572500L;
      return new sq(var4, this.Q);
   }

   public boolean F(mn var1) {
      return this.m.contains(var1);
   }

   public boolean g(x7 var1) {
      return this.e.contains(var1);
   }

   private boolean U(Object[] var1) {
      xv var2 = (xv)var1[0];
      return this.a.add(var2);
   }

   private boolean n(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Object
      // 0f: astore 6
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/x2
      // 17: astore 5
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast java/lang/Long
      // 1f: invokevirtual java/lang/Long.longValue ()J
      // 22: lstore 2
      // 23: pop
      // 24: getstatic com/zelix/_8l.b J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: lload 2
      // 2b: dup2
      // 2c: ldc2_w 131832516319681
      // 2f: lxor
      // 30: lstore 7
      // 32: dup2
      // 33: ldc2_w 62704930033678
      // 36: lxor
      // 37: lstore 9
      // 39: pop2
      // 3a: ldc2_w -878336788001876434
      // 3d: lload 2
      // 3e: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: aload 0
      // 44: ldc2_w -1241103973805814656
      // 47: lload 2
      // 48: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: aload 5
      // 4f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 54: istore 12
      // 56: astore 11
      // 58: iload 12
      // 5a: aload 11
      // 5c: ifnonnull a3
      // 5f: ifeq a1
      // 62: goto 6f
      // 65: ldc2_w -1252243567940311106
      // 68: lload 2
      // 69: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aload 0
      // 70: aload 4
      // 72: aload 6
      // 74: aload 5
      // 76: lload 7
      // 78: bipush 1
      // 79: anewarray 295
      // 7c: dup_x2
      // 7d: dup_x2
      // 7e: pop
      // 7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82: bipush 0
      // 83: swap
      // 84: aastore
      // 85: ldc2_w -582428058038896066
      // 88: lload 2
      // 89: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: lload 9
      // 90: invokespecial com/zelix/_8l.m (Ljava/lang/Object;Ljava/lang/Object;Lcom/zelix/mn;J)Z
      // 93: pop
      // 94: goto a1
      // 97: ldc2_w -1252243567940311106
      // 9a: lload 2
      // 9b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: iload 12
      // a3: ireturn
   }

   static {
      long var0 = b ^ 23230493888925L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\\îÅÅ¼mÞ\u0097Ä±&F\u0007\u008bC\u0083";
      int var7 = "\\îÅÅ¼mÞ\u0097Ä±&F\u0007\u008bC\u0083".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      c = var8;
      d = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12861;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = c[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_8l", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_8l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
