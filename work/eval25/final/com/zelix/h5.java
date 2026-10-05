package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class h5 extends hq {
   final int s;
   private static final long a = ess.a(7304572156968225381L, 3784794614605602916L, MethodHandles.lookup().lookupClass()).a(69304954861325L);

   public int z(long var1) {
      return 1;
   }

   public h5(h6 var1, int var2, _op var3) {
      super(var1);
      this.s = var2;
      this.W = var3;
      this.c = var3.W();
      this.P = true;
   }

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      var1.writeByte(x44.a<"m">(this, -8956053150426045867L, var4));
   }

   h5(int param1, h8 param2, _xx param3, _y4 param4, _y4 param5, long param6, PrintWriter param8, wp param9, Map param10, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/h5.a J
      // 03: lload 6
      // 05: lxor
      // 06: lstore 6
      // 08: lload 6
      // 0a: dup2
      // 0b: ldc2_w 86026081876993
      // 0e: lxor
      // 0f: lstore 12
      // 11: dup2
      // 12: ldc2_w 40289191954249
      // 15: lxor
      // 16: lstore 14
      // 18: dup2
      // 19: ldc2_w 121097956715087
      // 1c: lxor
      // 1d: dup2
      // 1e: bipush 32
      // 20: lushr
      // 21: l2i
      // 22: istore 16
      // 24: dup2
      // 25: bipush 32
      // 27: lshl
      // 28: bipush 48
      // 2a: lushr
      // 2b: l2i
      // 2c: istore 17
      // 2e: dup2
      // 2f: bipush 48
      // 31: lshl
      // 32: bipush 48
      // 34: lushr
      // 35: l2i
      // 36: istore 18
      // 38: pop2
      // 39: dup2
      // 3a: ldc2_w 35979041415968
      // 3d: lxor
      // 3e: lstore 19
      // 40: pop2
      // 41: aload 0
      // 42: aload 2
      // 43: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 46: aload 0
      // 47: iload 1
      // 48: putfield com/zelix/h5.s I
      // 4b: ldc2_w 982815733315025383
      // 4e: lload 6
      // 50: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: iload 16
      // 57: iload 17
      // 59: i2s
      // 5a: iload 18
      // 5c: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 5f: astore 23
      // 61: aload 0
      // 62: ldc2_w 714350293767612425
      // 65: lload 6
      // 67: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: istore 22
      // 6e: aload 9
      // 70: lload 19
      // 72: invokevirtual com/zelix/wp.C (J)I
      // 75: istore 24
      // 77: istore 21
      // 79: iload 21
      // 7b: ifne a6
      // 7e: iload 24
      // 80: bipush -1
      // 81: if_icmpne b2
      // 84: goto 92
      // 87: ldc2_w 1415742817812347627
      // 8a: lload 6
      // 8c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 0
      // 93: iload 22
      // 95: putfield com/zelix/h5.c I
      // 98: goto a6
      // 9b: ldc2_w 1415742817812347627
      // 9e: lload 6
      // a0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: lload 6
      // a8: lconst_0
      // a9: lcmp
      // aa: iflt e7
      // ad: iload 21
      // af: ifeq cb
      // b2: aload 0
      // b3: iload 24
      // b5: bipush 1
      // b6: iadd
      // b7: iload 22
      // b9: iadd
      // ba: putfield com/zelix/h5.c I
      // bd: goto cb
      // c0: ldc2_w 1415742817812347627
      // c3: lload 6
      // c5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: athrow
      // cb: aload 9
      // cd: aload 0
      // ce: getfield com/zelix/h5.c I
      // d1: invokevirtual com/zelix/wp.V (I)V
      // d4: aload 4
      // d6: aload 23
      // d8: aload 0
      // d9: getfield com/zelix/h5.c I
      // dc: lload 12
      // de: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // e1: aload 0
      // e2: lload 14
      // e4: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // e7: return
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"o">(this, 5170062081750247007L, var2);
   }

   final void N(long var1, _8l var3) {
   }

   private static gj a(gj var0) {
      return var0;
   }
}
