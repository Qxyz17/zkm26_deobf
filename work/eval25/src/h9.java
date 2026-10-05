package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class h9 extends h4 {
   int t;
   byte[] Z;
   hn[] w;
   boolean V;
   private static final long a = ess.a(-6985773477146713200L, 1189571393112550131L, MethodHandles.lookup().lookupClass()).a(142788868653035L);

   final void N(Object[] var1) {
      hn[] var2 = (hn[])var1[0];
      this.t = var2.length;
      this.w = var2;
   }

   h9(h8 var1, long var2, mx var4, int var5) {
      var2 = a ^ var2;
      super(var1, var4, var5);
      x44.a<"t">(this, true, -5678486283269992677L, var2);
   }

   protected final void O(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 49174603247503
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w -8511028589403193946
      // 26: lload 3
      // 27: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: lload 7
      // 2f: aload 2
      // 30: bipush 2
      // 31: anewarray 55
      // 34: dup_x1
      // 35: swap
      // 36: bipush 1
      // 37: swap
      // 38: aastore
      // 39: dup_x2
      // 3a: dup_x2
      // 3b: pop
      // 3c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 45: istore 9
      // 47: aload 0
      // 48: iload 9
      // 4a: ifne 74
      // 4d: ldc2_w -8281345141384826056
      // 50: lload 3
      // 51: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: ifeq 9d
      // 59: goto 66
      // 5c: ldc2_w -7563265545544817061
      // 5f: lload 3
      // 60: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: goto 74
      // 6a: ldc2_w -7563265545544817061
      // 6d: lload 3
      // 6e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: lload 5
      // 76: aload 2
      // 77: bipush 2
      // 78: anewarray 55
      // 7b: dup_x1
      // 7c: swap
      // 7d: bipush 1
      // 7e: swap
      // 7f: aastore
      // 80: dup_x2
      // 81: dup_x2
      // 82: pop
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w -8202533308333666308
      // 8c: lload 3
      // 8d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: lload 3
      // 93: lconst_0
      // 94: lcmp
      // 95: iflt ab
      // 98: iload 9
      // 9a: ifeq b8
      // 9d: aload 2
      // 9e: aload 0
      // 9f: ldc2_w -8464686538318848548
      // a2: lload 3
      // a3: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: invokevirtual java/io/DataOutputStream.write ([B)V
      // ab: goto b8
      // ae: ldc2_w -7563265545544817061
      // b1: lload 3
      // b2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   final int x(long var1) {
      long var3 = var1 ^ 27359256439972L;
      byte var10000 = x44.a<"w">(916934895870556413L, var1);
      int var6 = 2;
      byte var5 = var10000;
      int var7 = 0;

      label39:
      while (var7 < this.t) {
         var6 += this.w[var7].z(var3);

         try {
            var7++;
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"w">(var9, 1320322099573826304L, var1);
         }

         do {
            try {
               if (var1 < 0L) {
                  return var5;
               }

               if (var5 != 0) {
                  return var6;
               }

               if (var5 == 0) {
                  continue label39;
               }
            } catch (gj var8) {
               boolean var12 = false;
               throw x44.a<"w">(var8, 1320322099573826304L, var1);
            }
         } while (var1 <= 0L);
         break;
      }

      this.C = var6;
      return var6;
   }

   protected final void j(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 6
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 5
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: dup2
      // 2d: ldc2_w 103839399799653
      // 30: lxor
      // 31: lstore 9
      // 33: pop2
      // 34: ldc2_w -3921248847547794946
      // 37: lload 2
      // 38: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: aload 0
      // 3e: aload 4
      // 40: lload 7
      // 42: aload 6
      // 44: aload 5
      // 46: bipush 4
      // 47: anewarray 55
      // 4a: dup_x1
      // 4b: swap
      // 4c: bipush 3
      // 4d: swap
      // 4e: aastore
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 2
      // 52: swap
      // 53: aastore
      // 54: dup_x2
      // 55: dup_x2
      // 56: pop
      // 57: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a: bipush 1
      // 5b: swap
      // 5c: aastore
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 0
      // 60: swap
      // 61: aastore
      // 62: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 65: istore 11
      // 67: aload 0
      // 68: iload 11
      // 6a: ifeq 94
      // 6d: ldc2_w -3453275303615009223
      // 70: lload 2
      // 71: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ifeq c5
      // 79: goto 86
      // 7c: ldc2_w -3888680024896308390
      // 7f: lload 2
      // 80: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 0
      // 87: goto 94
      // 8a: ldc2_w -3888680024896308390
      // 8d: lload 2
      // 8e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: aload 4
      // 96: aload 6
      // 98: lload 9
      // 9a: bipush 3
      // 9b: anewarray 55
      // 9e: dup_x2
      // 9f: dup_x2
      // a0: pop
      // a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a4: bipush 2
      // a5: swap
      // a6: aastore
      // a7: dup_x1
      // a8: swap
      // a9: bipush 1
      // aa: swap
      // ab: aastore
      // ac: dup_x1
      // ad: swap
      // ae: bipush 0
      // af: swap
      // b0: aastore
      // b1: ldc2_w -3580882543131177980
      // b4: lload 2
      // b5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: lload 2
      // bb: lconst_0
      // bc: lcmp
      // bd: iflt d4
      // c0: iload 11
      // c2: ifne e1
      // c5: aload 4
      // c7: aload 0
      // c8: ldc2_w -2916603710630723363
      // cb: lload 2
      // cc: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: invokevirtual java/io/DataOutputStream.write ([B)V
      // d4: goto e1
      // d7: ldc2_w -3888680024896308390
      // da: lload 2
      // db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: athrow
      // e1: return
   }

   final void I(Object[] param1) {
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
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: istore 5
      // 17: dup
      // 18: bipush 2
      // 19: aaload
      // 1a: checkcast com/zelix/w
      // 1d: astore 3
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 2
      // 28: pop
      // 29: iload 4
      // 2b: i2l
      // 2c: bipush 48
      // 2e: lshl
      // 2f: iload 5
      // 31: i2l
      // 32: bipush 32
      // 34: lshl
      // 35: bipush 16
      // 37: lushr
      // 38: lor
      // 39: iload 2
      // 3a: i2l
      // 3b: bipush 48
      // 3d: lshl
      // 3e: bipush 48
      // 40: lushr
      // 41: lor
      // 42: getstatic com/zelix/h9.a J
      // 45: lxor
      // 46: lstore 6
      // 48: lload 6
      // 4a: dup2
      // 4b: ldc2_w 118093405696795
      // 4e: lxor
      // 4f: lstore 8
      // 51: pop2
      // 52: ldc2_w 2641836684961846467
      // 55: lload 6
      // 57: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: bipush 0
      // 5d: istore 11
      // 5f: istore 10
      // 61: iload 11
      // 63: aload 0
      // 64: getfield com/zelix/h9.t I
      // 67: if_icmpge 98
      // 6a: aload 0
      // 6b: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 6e: iload 11
      // 70: aaload
      // 71: lload 8
      // 73: aload 3
      // 74: bipush 2
      // 75: anewarray 55
      // 78: dup_x1
      // 79: swap
      // 7a: bipush 1
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w 2843208907406147593
      // 89: lload 6
      // 8b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: iinc 11 1
      // 93: iload 10
      // 95: ifne 61
      // 98: iload 4
      // 9a: iflt 93
      // 9d: return
   }

   void N(long param1, _8l param3) {
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
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 10727274753381
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -5003033307729260843
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 3
      // 1a: aload 0
      // 1b: getfield com/zelix/h9.c Lcom/zelix/mx;
      // 1e: aload 0
      // 1f: aload 0
      // 20: invokevirtual com/zelix/h9.x ()Lcom/zelix/h8;
      // 23: lload 4
      // 25: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 28: pop
      // 29: istore 8
      // 2b: bipush 0
      // 2c: istore 9
      // 2e: iload 9
      // 30: aload 0
      // 31: getfield com/zelix/h9.t I
      // 34: if_icmpge 4c
      // 37: aload 0
      // 38: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 3b: iload 9
      // 3d: aaload
      // 3e: lload 6
      // 40: aload 3
      // 41: invokevirtual com/zelix/hn.N (JLcom/zelix/_8l;)V
      // 44: iinc 9 1
      // 47: iload 8
      // 49: ifeq 2e
      // 4c: lload 1
      // 4d: lconst_0
      // 4e: lcmp
      // 4f: iflt 47
      // 52: return
   }

   protected abstract void z(Object[] var1);

   public int X(Object[] var1) {
      return this.t;
   }

   void D(Object[] param1) {
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
      // 00f: checkcast java/util/HashSet
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/w
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/h9.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 29945102722952
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 62931169311987
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 63545573037707
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: ldc2_w -1351697658134471337
      // 03e: lload 4
      // 040: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: istore 12
      // 047: aload 0
      // 048: ldc2_w -812157843622868336
      // 04b: lload 4
      // 04d: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: iload 12
      // 054: ifeq 081
      // 057: ifeq 201
      // 05a: goto 068
      // 05d: ldc2_w -1251577624752300045
      // 060: lload 4
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 3
      // 069: ldc2_w -1410571102948251698
      // 06c: lload 4
      // 06e: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: goto 081
      // 076: ldc2_w -1251577624752300045
      // 079: lload 4
      // 07b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: ifle 201
      // 084: new java/util/ArrayList
      // 087: dup
      // 088: aload 0
      // 089: getfield com/zelix/h9.t I
      // 08c: invokespecial java/util/ArrayList.<init> (I)V
      // 08f: astore 13
      // 091: bipush 0
      // 092: istore 14
      // 094: iload 14
      // 096: aload 0
      // 097: getfield com/zelix/h9.t I
      // 09a: if_icmpge 190
      // 09d: aload 0
      // 09e: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 0a1: iload 14
      // 0a3: aaload
      // 0a4: bipush 0
      // 0a5: anewarray 55
      // 0a8: ldc2_w -1245601209431298875
      // 0ab: lload 4
      // 0ad: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: astore 15
      // 0b4: aload 3
      // 0b5: aload 15
      // 0b7: ldc2_w -1074274718993939540
      // 0ba: lload 4
      // 0bc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 12
      // 0c3: lload 4
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 1a0
      // 0ca: ifeq 19e
      // 0cd: iload 12
      // 0cf: ifeq 15c
      // 0d2: goto 0e0
      // 0d5: ldc2_w -1251577624752300045
      // 0d8: lload 4
      // 0da: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: lload 4
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 14e
      // 0e7: ifne 121
      // 0ea: goto 0f8
      // 0ed: ldc2_w -1251577624752300045
      // 0f0: lload 4
      // 0f2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 13
      // 0fa: aload 0
      // 0fb: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 0fe: iload 14
      // 100: aaload
      // 101: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 106: pop
      // 107: iload 12
      // 109: lload 4
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 18d
      // 110: ifne 188
      // 113: goto 121
      // 116: ldc2_w -1251577624752300045
      // 119: lload 4
      // 11b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 2
      // 122: aload 15
      // 124: aload 0
      // 125: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 128: iload 14
      // 12a: aaload
      // 12b: lload 6
      // 12d: bipush 3
      // 12e: anewarray 55
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 2
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 1
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: ldc2_w -1171300445114929589
      // 147: lload 4
      // 149: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: goto 15c
      // 151: ldc2_w -1251577624752300045
      // 154: lload 4
      // 156: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: istore 16
      // 15e: aload 15
      // 160: ldc2_w -854589901148888029
      // 163: lload 4
      // 165: invokedynamic m (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: lload 10
      // 16c: bipush 2
      // 16d: anewarray 55
      // 170: dup_x2
      // 171: dup_x2
      // 172: pop
      // 173: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 176: bipush 1
      // 177: swap
      // 178: aastore
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w -1397752946885324110
      // 181: lload 4
      // 183: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: iinc 14 1
      // 18b: iload 12
      // 18d: ifne 094
      // 190: aload 13
      // 192: lload 4
      // 194: lconst_0
      // 195: lcmp
      // 196: ifle 1c2
      // 199: invokeinterface java/util/List.size ()I 1
      // 19e: iload 12
      // 1a0: lload 4
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: ifle 1af
      // 1a7: ifeq 1d5
      // 1aa: aload 0
      // 1ab: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 1ae: arraylength
      // 1af: if_icmpge 201
      // 1b2: goto 1c0
      // 1b5: ldc2_w -1251577624752300045
      // 1b8: lload 4
      // 1ba: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: aload 13
      // 1c2: invokeinterface java/util/List.size ()I 1
      // 1c7: goto 1d5
      // 1ca: ldc2_w -1251577624752300045
      // 1cd: lload 4
      // 1cf: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: anewarray 216
      // 1d8: astore 14
      // 1da: aload 0
      // 1db: aload 13
      // 1dd: aload 14
      // 1df: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1e4: checkcast [Lcom/zelix/hn;
      // 1e7: putfield com/zelix/h9.w [Lcom/zelix/hn;
      // 1ea: aload 0
      // 1eb: aload 0
      // 1ec: getfield com/zelix/h9.w [Lcom/zelix/hn;
      // 1ef: arraylength
      // 1f0: putfield com/zelix/h9.t I
      // 1f3: aload 0
      // 1f4: lload 8
      // 1f6: ldc2_w -582709204790205065
      // 1f9: lload 4
      // 1fb: invokedynamic l (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: pop
      // 201: return
   }

   final mx O(Object[] var1) {
      return this.c;
   }

   h9(h8 var1, int var2, char var3, String var4, _xx var5, _y4 var6, int var7, short var8) {
      long var9 = ((long)var3 << 48 | (long)var7 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 19128470706674L;
      super(var1, var2, var4, var11, var5, var6);
      x44.a<"t">(this, true, -4894885784113610181L, var9);
   }

   protected abstract void a(Object[] var1);

   private static gj b(gj var0) {
      return var0;
   }
}
