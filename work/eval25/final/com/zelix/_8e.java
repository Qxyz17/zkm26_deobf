package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class _8e extends _83 {
   private final Map F;
   private static final long f = ess.a(-4046047275654241255L, -9060876401650607312L, MethodHandles.lookup().lookupClass()).a(54394136932550L);

   public void E(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_8e.f J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 6572285481757
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: aload 4
      // 25: aload 0
      // 26: getfield com/zelix/_8e.z [Lcom/zelix/xl;
      // 29: arraylength
      // 2a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2d: ldc2_w -8931214761453166100
      // 30: lload 2
      // 31: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: bipush 1
      // 37: istore 8
      // 39: astore 7
      // 3b: iload 8
      // 3d: aload 0
      // 3e: getfield com/zelix/_8e.z [Lcom/zelix/xl;
      // 41: arraylength
      // 42: if_icmpge 8a
      // 45: aload 0
      // 46: getfield com/zelix/_8e.z [Lcom/zelix/xl;
      // 49: iload 8
      // 4b: aaload
      // 4c: aload 7
      // 4e: ifnonnull 75
      // 51: ifnull 82
      // 54: goto 61
      // 57: ldc2_w -8839293874669871725
      // 5a: lload 2
      // 5b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/zelix/_8e.z [Lcom/zelix/xl;
      // 65: iload 8
      // 67: aaload
      // 68: goto 75
      // 6b: ldc2_w -8839293874669871725
      // 6e: lload 2
      // 6f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 4
      // 77: aload 0
      // 78: getfield com/zelix/_8e.F Ljava/util/Map;
      // 7b: lload 5
      // 7d: dup2_x1
      // 7e: pop2
      // 7f: invokevirtual com/zelix/xl.V (Ljava/io/DataOutputStream;JLjava/util/Map;)V
      // 82: iinc 8 1
      // 85: aload 7
      // 87: ifnull 3b
      // 8a: lload 2
      // 8b: lconst_0
      // 8c: lcmp
      // 8d: iflt 45
      // 90: return
   }

   public void R(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
   }

   public void M(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
   }

   public Map n(Object[] var1) {
      return this.F;
   }

   boolean C(Object[] var1) {
      return true;
   }

   public _8e(long var1, _83 var3, xl[] var4, Map var5) {
      var1 = f ^ var1;
      long var6 = var1 ^ 74796488693384L;
      long var8 = var1 ^ 31522020419235L;
      super(var3.c, var8);
      this.z = var4;
      this.F = var5;
      x44.a<"m">(this, new Object[]{var6}, -1093336612288014359L, var1);
   }

   public void w(Object[] var1) {
      long var4 = (Long)var1[0];
      HashMap var3 = (HashMap)var1[1];
      _zk var2 = (_zk)var1[2];
   }

   private static gj b(gj var0) {
      return var0;
   }
}
