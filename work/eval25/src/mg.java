package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;

public class mg extends xl {
   private int F;
   private static final long a = ess.a(-9097154145586390924L, -1218578500385860324L, MethodHandles.lookup().lookupClass()).a(177680782657013L);

   public w5 m(long var1) {
      return x44.a<"h">(-1689294460696008855L, var1);
   }

   static mg N(long param0, _83 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/mg.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: lload 0
      // 007: dup2
      // 008: ldc2_w 10164118161950
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 32
      // 00f: lushr
      // 010: l2i
      // 011: istore 4
      // 013: dup2
      // 014: bipush 32
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 5
      // 01d: dup2
      // 01e: bipush 48
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 6
      // 027: pop2
      // 028: pop2
      // 029: ldc2_w 4231340390339927897
      // 02c: lload 0
      // 02d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: astore 7
      // 034: iload 3
      // 035: bipush 1
      // 036: aload 7
      // 038: ifnonnull 0b2
      // 03b: if_icmpne 0a3
      // 03e: goto 04b
      // 041: ldc2_w 2756436618490000939
      // 044: lload 0
      // 045: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aload 2
      // 04c: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 04f: bipush 0
      // 050: aaload
      // 051: aload 7
      // 053: ifnonnull 10a
      // 056: goto 063
      // 059: ldc2_w 2756436618490000939
      // 05c: lload 0
      // 05d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: ifnonnull 102
      // 066: goto 073
      // 069: ldc2_w 2756436618490000939
      // 06c: lload 0
      // 06d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 2
      // 074: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 077: bipush 0
      // 078: lload 0
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 109
      // 07e: new com/zelix/mg
      // 081: dup
      // 082: bipush 0
      // 083: iload 4
      // 085: iload 5
      // 087: i2s
      // 088: aload 2
      // 089: iload 6
      // 08b: i2c
      // 08c: bipush 1
      // 08d: invokespecial com/zelix/mg.<init> (IISLcom/zelix/_83;CI)V
      // 090: aastore
      // 091: aload 7
      // 093: ifnull 102
      // 096: goto 0a3
      // 099: ldc2_w 2756436618490000939
      // 09c: lload 0
      // 09d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: iload 3
      // 0a4: bipush 2
      // 0a5: goto 0b2
      // 0a8: ldc2_w 2756436618490000939
      // 0ab: lload 0
      // 0ac: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: if_icmpne 102
      // 0b5: aload 2
      // 0b6: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 0b9: bipush 1
      // 0ba: aaload
      // 0bb: aload 7
      // 0bd: ifnonnull 10a
      // 0c0: goto 0cd
      // 0c3: ldc2_w 2756436618490000939
      // 0c6: lload 0
      // 0c7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: ifnonnull 102
      // 0d0: goto 0dd
      // 0d3: ldc2_w 2756436618490000939
      // 0d6: lload 0
      // 0d7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 2
      // 0de: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 0e1: bipush 1
      // 0e2: new com/zelix/mg
      // 0e5: dup
      // 0e6: bipush 0
      // 0e7: iload 4
      // 0e9: iload 5
      // 0eb: i2s
      // 0ec: aload 2
      // 0ed: iload 6
      // 0ef: i2c
      // 0f0: bipush 2
      // 0f1: invokespecial com/zelix/mg.<init> (IISLcom/zelix/_83;CI)V
      // 0f4: aastore
      // 0f5: goto 102
      // 0f8: ldc2_w 2756436618490000939
      // 0fb: lload 0
      // 0fc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 2
      // 103: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 106: iload 3
      // 107: bipush 1
      // 108: isub
      // 109: aaload
      // 10a: areturn
   }

   protected void T(long var1, DataOutputStream var3) {
   }

   protected int o(long var1) {
      return x44.a<"n">(this, 1281055162516988171L, var1);
   }

   private mg(int var1, int var2, short var3, _83 var4, char var5, int var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      super(var1, var4);
      x44.a<"t">(this, var6, -7777114960983431970L, var7);
   }

   public String N(long var1) {
      return this.getClass().getName();
   }

   private static gj a(gj var0) {
      return var0;
   }
}
