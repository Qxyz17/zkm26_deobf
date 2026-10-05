package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;

public class s5 extends _4 {
   private boolean R;
   private int w;
   private l6_ Q;
   private static final long a = prr.a(-8811727637890354754L, 2406560858529088589L, MethodHandles.lookup().lookupClass()).a(130408372844932L);

   s5(_4 param1, long param2, h1 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/s5.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: aload 0
      // 007: aload 1
      // 008: invokespecial com/zelix/_4.<init> (Lcom/zelix/_4;)V
      // 00b: ldc2_w 9178606620957223815
      // 00e: lload 2
      // 00f: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 014: aload 0
      // 015: bipush 1
      // 016: ldc2_w 8689717825114661536
      // 019: lload 2
      // 01a: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: istore 5
      // 021: aload 4
      // 023: invokevirtual com/zelix/h1.readUnsignedByte ()I
      // 026: istore 6
      // 028: iload 5
      // 02a: ifne 076
      // 02d: iload 6
      // 02f: tableswitch 211 0 3 39 82 125 168
      // 04c: ldc2_w 7422445597761204157
      // 04f: lload 2
      // 050: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: athrow
      // 056: aload 0
      // 057: ldc2_w 7416000799646281171
      // 05a: lload 2
      // 05b: invokedynamic m (JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: ldc2_w 6923970944801308914
      // 063: lload 2
      // 064: invokedynamic u (Ljava/lang/Object;Lcom/zelix/l6_;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: goto 076
      // 06c: ldc2_w 7422445597761204157
      // 06f: lload 2
      // 070: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: lload 2
      // 077: lconst_0
      // 078: lcmp
      // 079: ifle 11a
      // 07c: iload 5
      // 07e: ifeq 11a
      // 081: aload 0
      // 082: ldc2_w 7079927341881359248
      // 085: lload 2
      // 086: invokedynamic m (JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ldc2_w 6923970944801308914
      // 08e: lload 2
      // 08f: invokedynamic u (Ljava/lang/Object;Lcom/zelix/l6_;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 11a
      // 09a: iload 5
      // 09c: ifeq 11a
      // 09f: goto 0ac
      // 0a2: ldc2_w 7422445597761204157
      // 0a5: lload 2
      // 0a6: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: ldc2_w 9083968190258435665
      // 0b0: lload 2
      // 0b1: invokedynamic m (JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: ldc2_w 6923970944801308914
      // 0b9: lload 2
      // 0ba: invokedynamic u (Ljava/lang/Object;Lcom/zelix/l6_;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 11a
      // 0c5: iload 5
      // 0c7: ifeq 11a
      // 0ca: goto 0d7
      // 0cd: ldc2_w 7422445597761204157
      // 0d0: lload 2
      // 0d1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w 8728005668393906193
      // 0db: lload 2
      // 0dc: invokedynamic m (JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: ldc2_w 6923970944801308914
      // 0e4: lload 2
      // 0e5: invokedynamic u (Ljava/lang/Object;Lcom/zelix/l6_;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: ifle 11a
      // 0f0: iload 5
      // 0f2: ifeq 11a
      // 0f5: goto 102
      // 0f8: ldc2_w 7422445597761204157
      // 0fb: lload 2
      // 0fc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 0
      // 103: bipush 0
      // 104: ldc2_w 8689717825114661536
      // 107: lload 2
      // 108: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: goto 11a
      // 110: ldc2_w 7422445597761204157
      // 113: lload 2
      // 114: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: aload 0
      // 11b: lload 2
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: iflt 135
      // 121: aload 4
      // 123: invokevirtual com/zelix/h1.readUnsignedByte ()I
      // 126: iload 5
      // 128: ifne 185
      // 12b: ldc2_w 6996371301734917940
      // 12e: lload 2
      // 12f: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: aload 0
      // 135: aload 0
      // 136: ldc2_w 6923970944801308914
      // 139: lload 2
      // 13a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: ldc2_w 8728005668393906193
      // 142: lload 2
      // 143: invokedynamic m (JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: if_acmpeq 184
      // 14b: goto 158
      // 14e: ldc2_w 7422445597761204157
      // 151: lload 2
      // 152: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 0
      // 159: ldc2_w 6996371301734917940
      // 15c: lload 2
      // 15d: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: iload 5
      // 164: ifne 185
      // 167: goto 174
      // 16a: ldc2_w 7422445597761204157
      // 16d: lload 2
      // 16e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: ifne 188
      // 177: goto 184
      // 17a: ldc2_w 7422445597761204157
      // 17d: lload 2
      // 17e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: bipush 1
      // 185: goto 189
      // 188: bipush 0
      // 189: ldc2_w 8689717825114661536
      // 18c: lload 2
      // 18d: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: return
   }

   boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, 4786234489716070484L, var2);
   }

   protected void t(Object[] var1) {
      DataOutputStream var4 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 71644075779856L;
      var4.writeByte(m44.a<"s">(m44.a<"r">(this, 4853619432802296767L, var2), new Object[]{var5}, 6555982450191735628L, var2));
      var4.writeByte(m44.a<"r">(this, 4779864474879951993L, var2));
   }

   boolean b(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/s5.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3985074434950783914
      // 15: lload 2
      // 16: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: ldc2_w 2884871828150955744
      // 20: lload 2
      // 21: invokedynamic h (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: ldc2_w 2899122859581196511
      // 2a: lload 2
      // 2b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/l6_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: invokevirtual com/zelix/l6_.ordinal ()I
      // 33: iaload
      // 34: iload 4
      // 36: ifne 71
      // 39: tableswitch 55 1 4 41 41 53 53
      // 58: ldc2_w 3399356735943124880
      // 5b: lload 2
      // 5c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: ldc2_w 3399356735943124880
      // 67: lload 2
      // 68: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: bipush 0
      // 71: ireturn
   }

   void z(gu var1, long var2) {
   }

   int U(Object[] var1) {
      return 2;
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
