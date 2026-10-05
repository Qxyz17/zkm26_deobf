package com.zelix;

import java.lang.invoke.MethodHandles;

public class cv extends jf implements _un {
   private String M;
   private fk X;
   private static final long a = ess.a(-2222105509112593297L, -8153542704649108974L, MethodHandles.lookup().lookupClass()).a(95508529189566L);

   public cv(short var1, long var2, int var4) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var7 = var5 ^ 137115798476007L;
      super(var7, var4);
   }

   void P(Object[] var1) {
      long var3 = (Long)var1[0];
      fk var2 = (fk)var1[1];
      var3 = a ^ var3;
      x44.a<"t">(this, var2, -1191026974692084619L, var3);
   }

   public void t(Object[] param1) {
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
      // 00f: checkcast com/zelix/_za
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 0
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 134528422017690
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 93891924661874
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 104862837440181
      // 036: lxor
      // 037: lstore 12
      // 039: pop2
      // 03a: ldc2_w 9148277501292601163
      // 03d: lload 4
      // 03f: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 3
      // 045: checkcast com/zelix/m
      // 048: astore 15
      // 04a: aload 0
      // 04b: lload 8
      // 04d: bipush 1
      // 04e: anewarray 61
      // 051: dup_x2
      // 052: dup_x2
      // 053: pop
      // 054: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 057: bipush 0
      // 058: swap
      // 059: aastore
      // 05a: ldc2_w 7145691849331111744
      // 05d: lload 4
      // 05f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: istore 16
      // 066: astore 14
      // 068: bipush 0
      // 069: istore 17
      // 06b: iload 17
      // 06d: iload 16
      // 06f: if_icmpge 0c6
      // 072: aload 0
      // 073: iload 17
      // 075: invokevirtual com/zelix/cv.e (I)Lcom/zelix/_za;
      // 078: lload 6
      // 07a: aload 0
      // 07b: aload 2
      // 07c: bipush 3
      // 07d: anewarray 61
      // 080: dup_x1
      // 081: swap
      // 082: bipush 2
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: bipush 1
      // 088: swap
      // 089: aastore
      // 08a: dup_x2
      // 08b: dup_x2
      // 08c: pop
      // 08d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 8818198965911889370
      // 096: lload 4
      // 098: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: iinc 17 1
      // 0a0: aload 14
      // 0a2: lload 4
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: iflt 0ae
      // 0a9: ifnonnull 127
      // 0ac: aload 14
      // 0ae: ifnull 06b
      // 0b1: lload 4
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 0a0
      // 0b8: goto 0c6
      // 0bb: ldc2_w 8912834298863242356
      // 0be: lload 4
      // 0c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: lload 4
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 128
      // 0ce: aload 14
      // 0d0: ifnonnull 128
      // 0d3: ldc2_w 7149051917373241403
      // 0d6: lload 4
      // 0d8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: ifnull 127
      // 0e0: goto 0ee
      // 0e3: ldc2_w 8912834298863242356
      // 0e6: lload 4
      // 0e8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 15
      // 0f0: aload 0
      // 0f1: ldc2_w 7149051917373241403
      // 0f4: lload 4
      // 0f6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/fk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: lload 12
      // 0fd: bipush 2
      // 0fe: anewarray 61
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w 7423026190805500415
      // 112: lload 4
      // 114: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: goto 127
      // 11c: ldc2_w 8912834298863242356
      // 11f: lload 4
      // 121: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 0
      // 128: ldc2_w 8931572489503498540
      // 12b: lload 4
      // 12d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: ifnull 16e
      // 135: aload 15
      // 137: aload 0
      // 138: ldc2_w 8931572489503498540
      // 13b: lload 4
      // 13d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: lload 10
      // 144: bipush 2
      // 145: anewarray 61
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x1
      // 152: swap
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w 9030387884467938828
      // 159: lload 4
      // 15b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: goto 16e
      // 163: ldc2_w 8912834298863242356
      // 166: lload 4
      // 168: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: return
   }

   public void m(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"r">(this, var2, 8062311131899950396L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
