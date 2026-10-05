package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class _86 implements Set {
   private final Set P;
   private static final long a = ess.a(-5550802790905323465L, 2194974836618762944L, MethodHandles.lookup().lookupClass()).a(85469882484846L);

   @Override
   public int hashCode() {
      long var1 = a ^ 115417029335002L;
      return System.identityHashCode(x44.a<"n">(this, 3933542262519868351L, var1));
   }

   @Override
   public Object[] toArray(Object[] var1) {
      long var2 = a ^ 25482282926449L;
      return x44.a<"i">(x44.a<"m">(this, -2288461872441098988L, var2), var1, -475342336145806184L, var2);
   }

   @Override
   public boolean contains(Object var1) {
      long var2 = a ^ 31542569306790L;
      return x44.a<"j">(this, 7776251527535064771L, var2).contains(var1);
   }

   @Override
   public boolean retainAll(Collection var1) {
      long var2 = a ^ 95679732822050L;
      return x44.a<"j">(x44.a<"n">(this, 5867768262540905543L, var2), var1, 5616356551216795414L, var2);
   }

   @Override
   public Iterator iterator() {
      long var1 = a ^ 25864195575189L;
      return x44.a<"i">(this, 7843512044019249648L, var1).iterator();
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 134556813102966L;
      return x44.a<"n">(x44.a<"j">(this, -1280520650447949037L, var1), -623018203889454853L, var1);
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 90231287683668L;
      return x44.a<"l">(x44.a<"h">(this, 8869985910912640561L, var1), 7395115410440603394L, var1);
   }

   @Override
   public boolean remove(Object var1) {
      long var2 = a ^ 35074020827232L;
      return x44.a<"l">(this, -9138708791045514235L, var2).remove(var1);
   }

   @Override
   public void clear() {
      long var1 = a ^ 37076274642084L;
      x44.a<"h">(this, 2155243555254075585L, var1).clear();
   }

   @Override
   public boolean add(Object var1) {
      long var2 = a ^ 134697775671142L;
      return x44.a<"j">(this, -4167327595888551165L, var2).add(var1);
   }

   @Override
   public boolean containsAll(Collection var1) {
      long var2 = a ^ 69636475279238L;
      return x44.a<"n">(x44.a<"j">(this, -5275148420876850205L, var2), var1, -5435316331009431326L, var2);
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
      // 00: getstatic com/zelix/_86.a J
      // 03: ldc2_w 131429764424672
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 129054392919531
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 187410418222177181
      // 14: lload 2
      // 15: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: aload 6
      // 1f: ifnonnull 3f
      // 22: ifnonnull 3e
      // 25: goto 32
      // 28: ldc2_w 2008480086970644442
      // 2b: lload 2
      // 2c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: ldc2_w 2008480086970644442
      // 37: lload 2
      // 38: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 1
      // 3f: instanceof com/zelix/_86
      // 42: aload 6
      // 44: ifnonnull 58
      // 47: ifne 59
      // 4a: goto 57
      // 4d: ldc2_w 2008480086970644442
      // 50: lload 2
      // 51: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 0
      // 58: ireturn
      // 59: aload 0
      // 5a: ldc2_w 192705530389110661
      // 5d: lload 2
      // 5e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 1
      // 64: checkcast com/zelix/_86
      // 67: lload 4
      // 69: bipush 1
      // 6a: anewarray 73
      // 6d: dup_x2
      // 6e: dup_x2
      // 6f: pop
      // 70: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73: bipush 0
      // 74: swap
      // 75: aastore
      // 76: ldc2_w 236639532672651264
      // 79: lload 2
      // 7a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: if_acmpne 90
      // 82: bipush 1
      // 83: goto 91
      // 86: ldc2_w 2008480086970644442
      // 89: lload 2
      // 8a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
   }

   public _86(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 112248075568003L;
      super();
      this.P = x44.a<"r">(new Object[]{var3}, 4866064456245824075L, var1);
   }

   @Override
   public int size() {
      long var1 = a ^ 134538206082786L;
      return x44.a<"n">(this, -7516879976448652665L, var1).size();
   }

   @Override
   public boolean addAll(Collection var1) {
      long var2 = a ^ 94106762214161L;
      return x44.a<"m">(this, 1899818339192178548L, var2).addAll(var1);
   }

   @Override
   public boolean removeAll(Collection var1) {
      long var2 = a ^ 43984794917575L;
      return x44.a<"o">(x44.a<"k">(this, 8902489606958671522L, var2), var1, 8771693376443099511L, var2);
   }

   private Set r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -3106108615721203251L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
