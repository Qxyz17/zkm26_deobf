package com.zelix;

import java.lang.invoke.MethodHandles;

public class lox extends loc {
   private final int F;
   private final String r;
   private static final long b = prr.a(-6582496491087842112L, -4332444234725100013L, MethodHandles.lookup().lookupClass()).a(31150583461768L);

   public final String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      return m44.a<"p">(this, -5442522438348925445L, var2);
   }

   public boolean o(Object[] var1) {
      loe var4 = (loe)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 6386018631813L;
      return this.equals(var4.M(var5));
   }

   public lox(String param1, long param2, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lox.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: aload 0
      // 07: aload 1
      // 08: aload 4
      // 0a: invokespecial com/zelix/loc.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0d: ldc2_w 1450834475917931630
      // 10: lload 2
      // 11: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: aload 4
      // 18: aload 0
      // 19: getfield com/zelix/lox.d Ljava/lang/String;
      // 1c: invokevirtual java/lang/String.length ()I
      // 1f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 22: astore 6
      // 24: astore 5
      // 26: aload 5
      // 28: ifnonnull 52
      // 2b: aload 6
      // 2d: invokevirtual java/lang/String.length ()I
      // 30: ifne 5d
      // 33: goto 40
      // 36: ldc2_w 1147324190968019750
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: aconst_null
      // 42: putfield com/zelix/lox.r Ljava/lang/String;
      // 45: goto 52
      // 48: ldc2_w 1147324190968019750
      // 4b: lload 2
      // 4c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: lload 2
      // 53: lconst_0
      // 54: lcmp
      // 55: iflt 8f
      // 58: aload 5
      // 5a: ifnull 73
      // 5d: aload 0
      // 5e: aload 6
      // 60: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 63: putfield com/zelix/lox.r Ljava/lang/String;
      // 66: goto 73
      // 69: ldc2_w 1147324190968019750
      // 6c: lload 2
      // 6d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: aload 0
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: aload 1
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: aload 0
      // 80: getfield com/zelix/lox.d Ljava/lang/String;
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokevirtual java/lang/String.hashCode ()I
      // 8c: putfield com/zelix/lox.F I
      // 8f: return
   }

   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lox.b J
      // 03: ldc2_w 100613592251035
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 3999576541848360909
      // 0b: lload 2
      // 0c: invokedynamic h (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: aload 4
      // 16: ifnonnull 2a
      // 19: ifnull 42
      // 1c: goto 29
      // 1f: ldc2_w 3192808789753288837
      // 22: lload 2
      // 23: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 1
      // 2a: aload 4
      // 2c: ifnonnull 4f
      // 2f: instanceof com/zelix/lox
      // 32: ifne 4e
      // 35: goto 42
      // 38: ldc2_w 3192808789753288837
      // 3b: lload 2
      // 3c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: ldc2_w 3192808789753288837
      // 47: lload 2
      // 48: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 1
      // 4f: checkcast com/zelix/lox
      // 52: astore 5
      // 54: aload 0
      // 55: aload 4
      // 57: ifnonnull 80
      // 5a: getfield com/zelix/lox.F I
      // 5d: aload 5
      // 5f: getfield com/zelix/lox.F I
      // 62: if_icmpne c4
      // 65: goto 72
      // 68: ldc2_w 3192808789753288837
      // 6b: lload 2
      // 6c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: goto 80
      // 76: ldc2_w 3192808789753288837
      // 79: lload 2
      // 7a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: getfield com/zelix/lox.O Ljava/lang/String;
      // 83: aload 5
      // 85: getfield com/zelix/lox.O Ljava/lang/String;
      // 88: aload 4
      // 8a: ifnonnull b3
      // 8d: if_acmpne c4
      // 90: goto 9d
      // 93: ldc2_w 3192808789753288837
      // 96: lload 2
      // 97: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: aload 0
      // 9e: getfield com/zelix/lox.d Ljava/lang/String;
      // a1: aload 5
      // a3: getfield com/zelix/lox.d Ljava/lang/String;
      // a6: goto b3
      // a9: ldc2_w 3192808789753288837
      // ac: lload 2
      // ad: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: if_acmpne c4
      // b6: bipush 1
      // b7: goto c5
      // ba: ldc2_w 3192808789753288837
      // bd: lload 2
      // be: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: bipush 0
      // c5: ireturn
   }

   public lox(char param1, String param2, String param3, String param4, int param5, short param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 5
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 6
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: getstatic com/zelix/lox.b J
      // 1c: lxor
      // 1d: lstore 7
      // 1f: ldc2_w -2257652604329819929
      // 22: lload 7
      // 24: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: aload 0
      // 2a: aload 2
      // 2b: aload 3
      // 2c: invokespecial com/zelix/loc.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2f: astore 9
      // 31: aload 4
      // 33: aload 9
      // 35: ifnonnull 4b
      // 38: ifnull 8f
      // 3b: goto 49
      // 3e: ldc2_w -331771122569080913
      // 41: lload 7
      // 43: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 4
      // 4b: invokevirtual java/lang/String.length ()I
      // 4e: ifne 6e
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield com/zelix/lox.r Ljava/lang/String;
      // 56: iload 6
      // 58: iflt bb
      // 5b: aload 9
      // 5d: ifnull a2
      // 60: goto 6e
      // 63: ldc2_w -331771122569080913
      // 66: lload 7
      // 68: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 0
      // 6f: aload 4
      // 71: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 74: putfield com/zelix/lox.r Ljava/lang/String;
      // 77: iload 5
      // 79: ifle bb
      // 7c: aload 9
      // 7e: ifnull a2
      // 81: goto 8f
      // 84: ldc2_w -331771122569080913
      // 87: lload 7
      // 89: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 0
      // 90: aconst_null
      // 91: putfield com/zelix/lox.r Ljava/lang/String;
      // 94: goto a2
      // 97: ldc2_w -331771122569080913
      // 9a: lload 7
      // 9c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: aload 0
      // a3: new java/lang/StringBuilder
      // a6: dup
      // a7: invokespecial java/lang/StringBuilder.<init> ()V
      // aa: aload 2
      // ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ae: aload 3
      // af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b5: invokevirtual java/lang/String.hashCode ()I
      // b8: putfield com/zelix/lox.F I
      // bb: return
   }

   public int hashCode() {
      return this.F;
   }

   public boolean p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;

      try {
         if (m44.a<"u">(this, -5335301897571625866L, var2) != null) {
            return true;
         }
      } catch (n9 var4) {
         throw m44.a<"k">(var4, -5704801547777227746L, var2);
      }

      return false;
   }

   private static n9 b(n9 var0) {
      return var0;
   }
}
