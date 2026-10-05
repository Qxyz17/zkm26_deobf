package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class _o2 extends _og implements l4 {
   int Z;
   _op[] N;
   int V;
   List t;
   private static final long b = ess.a(-8785838697727731122L, -5034322005012364578L, MethodHandles.lookup().lookupClass()).a(193570398858784L);

   _o2(int var1, int var2, char var3, int var4, _xx var5, int var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      super(var1);
      x44.a<"q">(this, var6, 2289427735793344972L, var7);
      x44.a<"q">(this, x44.a<"r">(new Object[]{var6}, 394666124252165060L, var7), 1947358306679947286L, var7);
      x44.a<"j">(var5, (long)x44.a<"n">(this, 1947358306679947286L, var7), 371988721207672673L, var7);
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 96074081906204L;
      return x44.a<"j">(this, new Object[]{var4}, -9087406469332222055L, var2);
   }

   public final boolean Y(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/n
      // 11: astore 6
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Long
      // 24: invokevirtual java/lang/Long.longValue ()J
      // 27: lstore 3
      // 28: pop
      // 29: ldc2_w 5084457588552424266
      // 2c: lload 3
      // 2d: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: astore 7
      // 34: iload 2
      // 35: aload 7
      // 37: ifnonnull 5a
      // 3a: iload 5
      // 3c: if_icmplt 5d
      // 3f: goto 4c
      // 42: ldc2_w 4695545124434894330
      // 45: lload 3
      // 46: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 5a
      // 50: ldc2_w 4695545124434894330
      // 53: lload 3
      // 54: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-7119551323723930366L, var4);
   }

   public boolean T() {
      return true;
   }

   public final _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 118237195067467L;
      long var12 = var2 ^ 37585498234552L;
      n[] var14 = var1.m();
      n[] var15 = var1.r();
      int var16 = var14.length;
      n[] var17 = n.S(var16 - 1, var10);
      System.arraycopy(var14, 0, var17, 0, var16 - 1);
      return new _kz(var17, var15, var12, var1.z(), var1.C(var8));
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public final void g(long var1, Map var3, _y4 var4, List var5) {
      long var6 = var1 ^ 79505257116800L;
      this.t = null;
      int[] var10000 = x44.a<"t">(2498889497285672808L, var1);
      int var9 = 0;
      int[] var8 = var10000;

      while (var9 < this.N.length) {
         _op var10 = this.N[var9];
         Object var11 = null;
         dm var15 = (dm)(var11 = (dm)var3.get(var10));

         label27: {
            try {
               if (var8 != null || var15 != null) {
                  break label27;
               }
            } catch (gj var13) {
               throw x44.a<"t">(var13, 2669408173858503128L, var1);
            }

            var11 = new dm();
            var5.add(var11);
            dm var16 = (dm)var3.put(var10, var11);
         }

         var4.G(this, var11, var6);
         var9++;
         if (var8 != null) {
            break;
         }
      }
   }

   static int p(Object[] var0) {
      int var1 = (Integer)var0[0];
      return (4 - (var1 + 1) % 4) % 4;
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public final boolean N(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 8037225787695755852
      // 03: lload 3
      // 04: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 5
      // 0b: iload 1
      // 0c: aload 5
      // 0e: ifnonnull 30
      // 11: iload 2
      // 12: if_icmplt 33
      // 15: goto 22
      // 18: ldc2_w 7507364308351743228
      // 1b: lload 3
      // 1c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: athrow
      // 22: bipush 1
      // 23: goto 30
      // 26: ldc2_w 7507364308351743228
      // 29: lload 3
      // 2a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public void o(int var1, long var2) {
      x44.a<"v">(this, var1, -7830989808258306725L, var2);
      int var4 = x44.a<"u">(new Object[]{var1}, -8508090689206960301L, var2);
      x44.a<"v">(this, var4, -7525099186552042367L, var2);
   }

   public List B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      int[] var10000 = x44.a<"s">(-6646602880588104185L, var2);
      ArrayList var5 = new ArrayList(this.N.length);
      int[] var4 = var10000;
      _op[] var6 = this.N;
      int var7 = var6.length;
      int var8 = 0;

      label34:
      while (var8 < var7) {
         _op var9 = var6[var8];

         do {
            try {
               if (var2 > 0L) {
                  if (var4 != null) {
                     return var5;
                  }

                  var5.add(var9);
                  var8++;
               }

               if (var4 == null) {
                  continue label34;
               }
            } catch (gj var10) {
               throw x44.a<"s">(var10, -6600878816744982345L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var5;
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      long var5 = var3 ^ 11807521485311L;
      int[] var10000 = x44.a<"s">(1586011436523555783L, var3);
      _op[] var8 = this.N;
      int[] var7 = var10000;

      for (_op var11 : var8) {
         var2.u(var5, var11, this);
         if (var7 != null) {
            break;
         }
      }
   }

   public void W(int param1, DataOutputStream param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: lstore 4
      // 10: lload 4
      // 12: dup2
      // 13: ldc2_w 0
      // 16: lxor
      // 17: dup2
      // 18: bipush 32
      // 1a: lushr
      // 1b: l2i
      // 1c: istore 6
      // 1e: dup2
      // 1f: bipush 32
      // 21: lshl
      // 22: bipush 32
      // 24: lushr
      // 25: l2i
      // 26: istore 7
      // 28: pop2
      // 29: pop2
      // 2a: ldc2_w 3436678178989978228
      // 2d: lload 4
      // 2f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 0
      // 35: iload 6
      // 37: aload 2
      // 38: iload 7
      // 3a: invokespecial com/zelix/_og.W (ILjava/io/DataOutputStream;I)V
      // 3d: astore 8
      // 3f: bipush 0
      // 40: istore 9
      // 42: iload 9
      // 44: aload 0
      // 45: ldc2_w 3743635573582309604
      // 48: lload 4
      // 4a: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: if_icmpge 5f
      // 52: aload 2
      // 53: bipush 0
      // 54: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 57: iinc 9 1
      // 5a: aload 8
      // 5c: ifnull 42
      // 5f: iload 3
      // 60: iflt 5a
      // 63: aload 0
      // 64: getfield com/zelix/_o2.N [Lcom/zelix/_op;
      // 67: aload 0
      // 68: getfield com/zelix/_o2.N [Lcom/zelix/_op;
      // 6b: arraylength
      // 6c: bipush 1
      // 6d: isub
      // 6e: aaload
      // 6f: astore 9
      // 71: aload 2
      // 72: aload 9
      // 74: invokevirtual com/zelix/_op.W ()I
      // 77: aload 0
      // 78: ldc2_w 3978884995804596542
      // 7b: lload 4
      // 7d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: isub
      // 83: ldc2_w 3974921034981549113
      // 86: lload 4
      // 88: invokedynamic h (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: return
   }

   public _o2(int var1) {
      super(var1);
   }

   public final boolean I(long var1) {
      return false;
   }

   public void e(Integer param1, long param2, _op param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 125353107609026
      // 05: lxor
      // 06: lstore 5
      // 08: pop2
      // 09: ldc2_w -7512601927523300744
      // 0c: lload 2
      // 0d: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: getfield com/zelix/_o2.N [Lcom/zelix/_op;
      // 16: arraylength
      // 17: istore 8
      // 19: astore 7
      // 1b: aload 4
      // 1d: bipush 1
      // 1e: lload 5
      // 20: bipush 2
      // 21: anewarray 42
      // 24: dup_x2
      // 25: dup_x2
      // 26: pop
      // 27: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a: bipush 1
      // 2b: swap
      // 2c: aastore
      // 2d: dup_x1
      // 2e: swap
      // 2f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 32: bipush 0
      // 33: swap
      // 34: aastore
      // 35: ldc2_w -7646876929206351648
      // 38: lload 2
      // 39: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: bipush 0
      // 3f: istore 9
      // 41: iload 9
      // 43: iload 8
      // 45: if_icmpge c0
      // 48: aload 0
      // 49: getfield com/zelix/_o2.t Ljava/util/List;
      // 4c: iload 9
      // 4e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 53: checkcast java/lang/Integer
      // 56: astore 10
      // 58: aload 7
      // 5a: lload 2
      // 5b: lconst_0
      // 5c: lcmp
      // 5d: ifle bd
      // 60: ifnonnull bb
      // 63: aload 10
      // 65: aload 1
      // 66: invokevirtual java/lang/Integer.equals (Ljava/lang/Object;)Z
      // 69: ifeq b8
      // 6c: goto 79
      // 6f: ldc2_w -8062690123697255224
      // 72: lload 2
      // 73: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: getfield com/zelix/_o2.N [Lcom/zelix/_op;
      // 7d: iload 9
      // 7f: aload 7
      // 81: ifnonnull b5
      // 84: goto 91
      // 87: ldc2_w -8062690123697255224
      // 8a: lload 2
      // 8b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: aaload
      // 92: ifnonnull b8
      // 95: goto a2
      // 98: ldc2_w -8062690123697255224
      // 9b: lload 2
      // 9c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: aload 0
      // a3: getfield com/zelix/_o2.N [Lcom/zelix/_op;
      // a6: iload 9
      // a8: goto b5
      // ab: ldc2_w -8062690123697255224
      // ae: lload 2
      // af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: aload 4
      // b7: aastore
      // b8: iinc 9 1
      // bb: aload 7
      // bd: ifnull 41
      // c0: return
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   private static gj b(gj var0) {
      return var0;
   }
}
