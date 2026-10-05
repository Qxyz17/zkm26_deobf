package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class wp implements qm, Comparable, Serializable {
   private int A;
   private static final long a = ess.a(297382161603262185L, 5051563001270248711L, MethodHandles.lookup().lookupClass()).a(131368231229940L);

   public int L(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      this.A += var2;
      return this.A;
   }

   public int C(long var1) {
      return this.A;
   }

   public int l(long var1) {
      return ++this.A;
   }

   @Override
   public int hashCode() {
      return this.A;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/wp.a J
      // 03: ldc2_w 54863603785599
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -7336440308222491861
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: aload 4
      // 16: ifnonnull 2a
      // 19: ifnull 82
      // 1c: goto 29
      // 1f: ldc2_w -7098835220030369291
      // 22: lload 2
      // 23: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 1
      // 2a: instanceof com/zelix/wp
      // 2d: aload 4
      // 2f: ifnonnull 83
      // 32: ifeq 82
      // 35: goto 42
      // 38: ldc2_w -7098835220030369291
      // 3b: lload 2
      // 3c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/zelix/wp.A I
      // 46: aload 4
      // 48: ifnonnull 7d
      // 4b: goto 58
      // 4e: ldc2_w -7098835220030369291
      // 51: lload 2
      // 52: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 1
      // 59: checkcast com/zelix/wp
      // 5c: getfield com/zelix/wp.A I
      // 5f: if_icmpne 80
      // 62: goto 6f
      // 65: ldc2_w -7098835220030369291
      // 68: lload 2
      // 69: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: bipush 1
      // 70: goto 7d
      // 73: ldc2_w -7098835220030369291
      // 76: lload 2
      // 77: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
      // 82: bipush 0
      // 83: ireturn
   }

   public wp() {
      this(0);
   }

   public int C(Object[] param1) {
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
      // 04: checkcast com/zelix/wp
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/wp.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -4635386667821193553
      // 1c: lload 3
      // 1d: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 5
      // 24: aload 0
      // 25: getfield com/zelix/wp.A I
      // 28: aload 2
      // 29: getfield com/zelix/wp.A I
      // 2c: aload 5
      // 2e: ifnonnull 67
      // 31: if_icmpge 4d
      // 34: goto 41
      // 37: ldc2_w -5116184899091696527
      // 3a: lload 3
      // 3b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: bipush -1
      // 42: ireturn
      // 43: ldc2_w -5116184899091696527
      // 46: lload 3
      // 47: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield com/zelix/wp.A I
      // 51: aload 5
      // 53: ifnonnull 77
      // 56: aload 2
      // 57: getfield com/zelix/wp.A I
      // 5a: goto 67
      // 5d: ldc2_w -5116184899091696527
      // 60: lload 3
      // 61: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: if_icmpne 76
      // 6a: bipush 0
      // 6b: ireturn
      // 6c: ldc2_w -5116184899091696527
      // 6f: lload 3
      // 70: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: bipush 1
      // 77: ireturn
   }

   public int g(Object[] var1) {
      this.A--;
      return this.A;
   }

   public wp(int var1) {
      this.A = var1;
   }

   public int D(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.A++;
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 83034062706162L;
      long var4 = var2 ^ 26363500394627L;
      return x44.a<"k">(this, new Object[]{(wp)var1, var4}, 1350412011324657890L, var2);
   }

   public void V(int var1) {
      this.A = var1;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
