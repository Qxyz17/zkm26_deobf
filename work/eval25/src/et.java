package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class et implements Iterator {
   private _y7 s;
   final _y7 K;
   private _x1 r;
   private _x1 q;
   private boolean C;
   private static final long a = ess.a(-6029955646132505770L, 7993923616997681485L, MethodHandles.lookup().lookupClass()).a(61621714575980L);

   et(_y7 var1, _y7 var2) {
      this.K = var1;
      this.s = var2;
   }

   private _x1 o(_x1 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/et.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 126846038845259
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -5828617827929836008
      // 12: lload 2
      // 13: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 1
      // 19: invokestatic com/zelix/_x1.n (Lcom/zelix/_x1;)Lcom/zelix/_x1;
      // 1c: astore 7
      // 1e: astore 6
      // 20: aload 7
      // 22: aload 6
      // 24: ifnonnull 45
      // 27: ifnonnull 43
      // 2a: goto 37
      // 2d: ldc2_w -5862373495890159632
      // 30: lload 2
      // 31: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aconst_null
      // 38: areturn
      // 39: ldc2_w -5862373495890159632
      // 3c: lload 2
      // 3d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 7
      // 45: invokestatic com/zelix/_x1.W (Lcom/zelix/_x1;)Ljava/util/ArrayList;
      // 48: aload 1
      // 49: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 4c: istore 8
      // 4e: iload 8
      // 50: aload 7
      // 52: invokestatic com/zelix/_x1.W (Lcom/zelix/_x1;)Ljava/util/ArrayList;
      // 55: invokevirtual java/util/ArrayList.size ()I
      // 58: bipush 1
      // 59: isub
      // 5a: if_icmpge 77
      // 5d: aload 7
      // 5f: invokestatic com/zelix/_x1.W (Lcom/zelix/_x1;)Ljava/util/ArrayList;
      // 62: iload 8
      // 64: bipush 1
      // 65: iadd
      // 66: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 69: checkcast com/zelix/_x1
      // 6c: areturn
      // 6d: ldc2_w -5862373495890159632
      // 70: lload 2
      // 71: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: aload 0
      // 78: aload 7
      // 7a: lload 4
      // 7c: invokespecial com/zelix/et.o (Lcom/zelix/_x1;J)Lcom/zelix/_x1;
      // 7f: areturn
   }

   public _x1 g(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/et.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 96963238555199
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w 3076966752707556279
      // 11: lload 1
      // 12: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: aload 0
      // 18: aload 0
      // 19: lload 3
      // 1a: invokespecial com/zelix/et.C (J)Lcom/zelix/_x1;
      // 1d: putfield com/zelix/et.q Lcom/zelix/_x1;
      // 20: aload 0
      // 21: bipush 0
      // 22: putfield com/zelix/et.C Z
      // 25: astore 5
      // 27: aload 0
      // 28: aconst_null
      // 29: putfield com/zelix/et.r Lcom/zelix/_x1;
      // 2c: aload 0
      // 2d: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 30: aload 5
      // 32: ifnonnull 5b
      // 35: ifnonnull 57
      // 38: goto 45
      // 3b: ldc2_w 3101757896877462111
      // 3e: lload 1
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: new java/util/NoSuchElementException
      // 48: dup
      // 49: invokespecial java/util/NoSuchElementException.<init> ()V
      // 4c: athrow
      // 4d: ldc2_w 3101757896877462111
      // 50: lload 1
      // 51: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 5b: areturn
   }

   @Override
   public boolean hasNext() {
      long var1 = a ^ 72354803950060L;
      long var3 = var1 ^ 121264844296433L;

      try {
         this.r = this.C(var3);
         if (this.r != null) {
            return true;
         }
      } catch (NoSuchElementException var5) {
         throw x44.a<"t">(var5, 1568833930150341777L, var1);
      }

      return false;
   }

   private _x1 C(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/et.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 99170946542480
      // 00b: lxor
      // 00c: lstore 3
      // 00d: pop2
      // 00e: ldc2_w -2033446046395794749
      // 011: lload 1
      // 012: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: astore 5
      // 019: aload 0
      // 01a: aload 5
      // 01c: ifnonnull 05f
      // 01f: getfield com/zelix/et.C Z
      // 022: ifne 05e
      // 025: goto 032
      // 028: ldc2_w -2125836247504970965
      // 02b: lload 1
      // 02c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: athrow
      // 032: aload 0
      // 033: getfield com/zelix/et.r Lcom/zelix/_x1;
      // 036: aload 5
      // 038: lload 1
      // 039: lconst_0
      // 03a: lcmp
      // 03b: iflt 069
      // 03e: ifnonnull 067
      // 041: goto 04e
      // 044: ldc2_w -2125836247504970965
      // 047: lload 1
      // 048: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: ifnull 063
      // 051: goto 05e
      // 054: ldc2_w -2125836247504970965
      // 057: lload 1
      // 058: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield com/zelix/et.r Lcom/zelix/_x1;
      // 062: areturn
      // 063: aload 0
      // 064: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 067: aload 5
      // 069: lload 1
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: iflt 0c8
      // 06f: ifnonnull 0c6
      // 072: ifnonnull 0c2
      // 075: goto 082
      // 078: ldc2_w -2125836247504970965
      // 07b: lload 1
      // 07c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 0
      // 083: getfield com/zelix/et.s Lcom/zelix/_y7;
      // 086: invokestatic com/zelix/_y7.A (Lcom/zelix/_y7;)Lcom/zelix/_x1;
      // 089: aload 5
      // 08b: ifnonnull 0bf
      // 08e: goto 09b
      // 091: ldc2_w -2125836247504970965
      // 094: lload 1
      // 095: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: ifnull 0c0
      // 09e: goto 0ab
      // 0a1: ldc2_w -2125836247504970965
      // 0a4: lload 1
      // 0a5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield com/zelix/et.s Lcom/zelix/_y7;
      // 0af: invokestatic com/zelix/_y7.A (Lcom/zelix/_y7;)Lcom/zelix/_x1;
      // 0b2: goto 0bf
      // 0b5: ldc2_w -2125836247504970965
      // 0b8: lload 1
      // 0b9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: areturn
      // 0c0: aconst_null
      // 0c1: areturn
      // 0c2: aload 0
      // 0c3: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 0c6: aload 5
      // 0c8: ifnonnull 103
      // 0cb: invokestatic com/zelix/_x1.W (Lcom/zelix/_x1;)Ljava/util/ArrayList;
      // 0ce: invokevirtual java/util/ArrayList.size ()I
      // 0d1: ifle 0fa
      // 0d4: goto 0e1
      // 0d7: ldc2_w -2125836247504970965
      // 0da: lload 1
      // 0db: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 0e5: invokestatic com/zelix/_x1.W (Lcom/zelix/_x1;)Ljava/util/ArrayList;
      // 0e8: bipush 0
      // 0e9: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0ec: checkcast com/zelix/_x1
      // 0ef: areturn
      // 0f0: ldc2_w -2125836247504970965
      // 0f3: lload 1
      // 0f4: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: aload 0
      // 0fc: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 0ff: lload 3
      // 100: invokespecial com/zelix/et.o (Lcom/zelix/_x1;J)Lcom/zelix/_x1;
      // 103: astore 6
      // 105: aload 6
      // 107: areturn
   }

   @Override
   public void remove() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/et.a J
      // 03: ldc2_w 55197634709917
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 112378267717104
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 58103909348443
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: ldc2_w -284622386839558904
      // 1a: lload 1
      // 1b: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: astore 7
      // 22: aload 0
      // 23: aload 7
      // 25: ifnonnull 49
      // 28: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 2b: ifnull bb
      // 2e: goto 3b
      // 31: ldc2_w -165245772605225760
      // 34: lload 1
      // 35: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: aload 0
      // 3c: goto 49
      // 3f: ldc2_w -165245772605225760
      // 42: lload 1
      // 43: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 7
      // 4b: ifnonnull b2
      // 4e: getfield com/zelix/et.C Z
      // 51: ifne bb
      // 54: goto 61
      // 57: ldc2_w -165245772605225760
      // 5a: lload 1
      // 5b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: bipush 1
      // 63: putfield com/zelix/et.C Z
      // 66: aload 0
      // 67: aconst_null
      // 68: putfield com/zelix/et.r Lcom/zelix/_x1;
      // 6b: aload 0
      // 6c: aload 0
      // 6d: aload 0
      // 6e: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 71: lload 5
      // 73: invokespecial com/zelix/et.o (Lcom/zelix/_x1;J)Lcom/zelix/_x1;
      // 76: putfield com/zelix/et.r Lcom/zelix/_x1;
      // 79: aload 0
      // 7a: getfield com/zelix/et.s Lcom/zelix/_y7;
      // 7d: aload 0
      // 7e: getfield com/zelix/et.q Lcom/zelix/_x1;
      // 81: lload 3
      // 82: dup2_x1
      // 83: pop2
      // 84: bipush 3
      // 85: anewarray 11
      // 88: dup_x1
      // 89: swap
      // 8a: bipush 2
      // 8b: swap
      // 8c: aastore
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 1
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 0
      // 99: swap
      // 9a: aastore
      // 9b: ldc2_w -1884560118268005468
      // 9e: lload 1
      // 9f: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: aload 0
      // a5: goto b2
      // a8: ldc2_w -165245772605225760
      // ab: lload 1
      // ac: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: aconst_null
      // b3: putfield com/zelix/et.q Lcom/zelix/_x1;
      // b6: aload 7
      // b8: ifnull cd
      // bb: new java/lang/IllegalStateException
      // be: dup
      // bf: invokespecial java/lang/IllegalStateException.<init> ()V
      // c2: athrow
      // c3: ldc2_w -165245772605225760
      // c6: lload 1
      // c7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: return
   }

   @Override
   public Object next() {
      long var1 = a ^ 59009505983334L;
      long var3 = var1 ^ 54163283460879L;
      return this.g(var3);
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}
