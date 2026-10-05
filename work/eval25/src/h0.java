package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class h0 extends hq {
   private final int a;
   private final int C;
   private static final long b = ess.a(-1691206412630470529L, -7411754258129007239L, MethodHandles.lookup().lookupClass()).a(125808039017635L);

   final void N(long var1, _8l var3) {
   }

   public int z(long var1) {
      byte var3 = 1;
      return var3 + 2;
   }

   h0(int param1, long param2, h8 param4, _xx param5, _y4 param6, _y4 param7, PrintWriter param8, wp param9, Map param10, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/h0.b J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 1717623615307
      // 0b: lxor
      // 0c: lstore 12
      // 0e: dup2
      // 0f: ldc2_w 117746103538691
      // 12: lxor
      // 13: lstore 14
      // 15: dup2
      // 16: ldc2_w 36907608455429
      // 19: lxor
      // 1a: dup2
      // 1b: bipush 32
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 16
      // 21: dup2
      // 22: bipush 32
      // 24: lshl
      // 25: bipush 48
      // 27: lushr
      // 28: l2i
      // 29: istore 17
      // 2b: dup2
      // 2c: bipush 48
      // 2e: lshl
      // 2f: bipush 48
      // 31: lushr
      // 32: l2i
      // 33: istore 18
      // 35: pop2
      // 36: dup2
      // 37: ldc2_w 122094875504746
      // 3a: lxor
      // 3b: lstore 19
      // 3d: pop2
      // 3e: aload 0
      // 3f: aload 4
      // 41: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 44: aload 0
      // 45: iload 1
      // 46: putfield com/zelix/h0.C I
      // 49: ldc2_w 6839250404056591021
      // 4c: lload 2
      // 4d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: iload 16
      // 54: iload 17
      // 56: i2s
      // 57: iload 18
      // 59: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 5c: astore 22
      // 5e: aload 0
      // 5f: aload 5
      // 61: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 64: putfield com/zelix/h0.a I
      // 67: istore 21
      // 69: aload 9
      // 6b: lload 19
      // 6d: invokevirtual com/zelix/wp.C (J)I
      // 70: istore 23
      // 72: iload 21
      // 74: ifne a5
      // 77: iload 23
      // 79: bipush -1
      // 7a: if_icmpne b0
      // 7d: goto 8a
      // 80: ldc2_w 4850675932270082095
      // 83: lload 2
      // 84: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 0
      // 8b: aload 0
      // 8c: ldc2_w 6522423637063097600
      // 8f: lload 2
      // 90: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: putfield com/zelix/h0.c I
      // 98: goto a5
      // 9b: ldc2_w 4850675932270082095
      // 9e: lload 2
      // 9f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: lload 2
      // a6: lconst_0
      // a7: lcmp
      // a8: ifle ec
      // ab: iload 21
      // ad: ifeq d0
      // b0: aload 0
      // b1: iload 23
      // b3: bipush 1
      // b4: iadd
      // b5: aload 0
      // b6: ldc2_w 6522423637063097600
      // b9: lload 2
      // ba: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: iadd
      // c0: putfield com/zelix/h0.c I
      // c3: goto d0
      // c6: ldc2_w 4850675932270082095
      // c9: lload 2
      // ca: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: aload 9
      // d2: aload 0
      // d3: getfield com/zelix/h0.c I
      // d6: invokevirtual com/zelix/wp.V (I)V
      // d9: aload 6
      // db: aload 22
      // dd: aload 0
      // de: getfield com/zelix/h0.c I
      // e1: lload 12
      // e3: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // e6: aload 0
      // e7: lload 14
      // e9: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // ec: return
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"o">(this, 4780340523724712682L, var2);
   }

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      var1.writeByte(x44.a<"m">(this, -8764748765947826464L, var4));
      var1.writeShort(x44.a<"m">(this, -8966008400350280682L, var4));
   }

   public h0(h6 var1, int var2, int var3, _op var4) {
      super(var1);
      this.C = var2;
      this.W = var4;
      this.a = var3;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
