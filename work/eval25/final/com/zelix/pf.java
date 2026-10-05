package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;

public class pf extends h8 {
   private boolean j;
   private _y g;
   private int G;
   private static final long a = ess.a(-1380822398892310903L, -5209241713036834817L, MethodHandles.lookup().lookupClass()).a(115640440335949L);

   protected void g(Object[] var1) {
      DataOutputStream var2 = (DataOutputStream)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 2366304519832L;
      var2.writeByte(x44.a<"k">(x44.a<"o">(this, 7766426774130030677L, var3), new Object[]{var5}, 7846943902848692994L, var3));
      var2.writeByte(x44.a<"o">(this, 8593030342657151572L, var3));
   }

   boolean Q(Object[] param1) {
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
      // 0c: getstatic com/zelix/pf.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8437182569367553404
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: ldc2_w 7665576007970063518
      // 20: lload 2
      // 21: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: ldc2_w 8580395895406421121
      // 2a: lload 2
      // 2b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: invokevirtual com/zelix/_y.ordinal ()I
      // 33: iaload
      // 34: iload 4
      // 36: ifeq 71
      // 39: tableswitch 55 1 4 41 41 53 53
      // 58: ldc2_w 8596911031896718849
      // 5b: lload 2
      // 5c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: ldc2_w 8596911031896718849
      // 67: lload 2
      // 68: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: bipush 0
      // 71: ireturn
   }

   pf(h8 param1, int param2, char param3, _xx param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 5
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/pf.a J
      // 01b: lxor
      // 01c: lstore 6
      // 01e: ldc2_w 6820621656952696525
      // 021: lload 6
      // 023: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: aload 0
      // 029: aload 1
      // 02a: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 02d: aload 0
      // 02e: bipush 1
      // 02f: ldc2_w 6475334610833136097
      // 032: lload 6
      // 034: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: istore 8
      // 03b: aload 4
      // 03d: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 040: istore 9
      // 042: iload 8
      // 044: ifeq 096
      // 047: iload 9
      // 049: tableswitch 218 0 3 42 86 130 174
      // 068: ldc2_w 6701090791845139888
      // 06b: lload 6
      // 06d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 0
      // 074: ldc2_w 5126447617060948145
      // 077: lload 6
      // 079: invokedynamic o (JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: ldc2_w 6675147194970820400
      // 081: lload 6
      // 083: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_y;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 096
      // 08b: ldc2_w 6701090791845139888
      // 08e: lload 6
      // 090: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: iload 2
      // 097: ifle 13d
      // 09a: iload 8
      // 09c: ifne 13d
      // 09f: aload 0
      // 0a0: ldc2_w 6842207533981796191
      // 0a3: lload 6
      // 0a5: invokedynamic o (JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ldc2_w 6675147194970820400
      // 0ad: lload 6
      // 0af: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_y;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: iload 2
      // 0b5: iflt 13d
      // 0b8: iload 8
      // 0ba: ifne 13d
      // 0bd: goto 0cb
      // 0c0: ldc2_w 6701090791845139888
      // 0c3: lload 6
      // 0c5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: ldc2_w 6882336171995066081
      // 0cf: lload 6
      // 0d1: invokedynamic o (JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: ldc2_w 6675147194970820400
      // 0d9: lload 6
      // 0db: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_y;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: iload 2
      // 0e1: iflt 13d
      // 0e4: iload 8
      // 0e6: ifne 13d
      // 0e9: goto 0f7
      // 0ec: ldc2_w 6701090791845139888
      // 0ef: lload 6
      // 0f1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: ldc2_w 4615045963841358389
      // 0fb: lload 6
      // 0fd: invokedynamic o (JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: ldc2_w 6675147194970820400
      // 105: lload 6
      // 107: invokedynamic u (Ljava/lang/Object;Lcom/zelix/_y;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: iload 2
      // 10d: ifle 13d
      // 110: iload 8
      // 112: ifne 13d
      // 115: goto 123
      // 118: ldc2_w 6701090791845139888
      // 11b: lload 6
      // 11d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 0
      // 124: bipush 0
      // 125: ldc2_w 6475334610833136097
      // 128: lload 6
      // 12a: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: goto 13d
      // 132: ldc2_w 6701090791845139888
      // 135: lload 6
      // 137: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 0
      // 13e: iload 3
      // 13f: iflt 157
      // 142: aload 4
      // 144: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 147: iload 8
      // 149: ifeq 1ad
      // 14c: ldc2_w 4622263942177072433
      // 14f: lload 6
      // 151: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: aload 0
      // 157: aload 0
      // 158: ldc2_w 6675147194970820400
      // 15b: lload 6
      // 15d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: ldc2_w 4615045963841358389
      // 165: lload 6
      // 167: invokedynamic o (JJ)Lcom/zelix/_y; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: if_acmpeq 1ac
      // 16f: goto 17d
      // 172: ldc2_w 6701090791845139888
      // 175: lload 6
      // 177: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 0
      // 17e: ldc2_w 4622263942177072433
      // 181: lload 6
      // 183: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: iload 8
      // 18a: ifeq 1ad
      // 18d: goto 19b
      // 190: ldc2_w 6701090791845139888
      // 193: lload 6
      // 195: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: ifne 1b0
      // 19e: goto 1ac
      // 1a1: ldc2_w 6701090791845139888
      // 1a4: lload 6
      // 1a6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: bipush 1
      // 1ad: goto 1b1
      // 1b0: bipush 0
      // 1b1: ldc2_w 6475334610833136097
      // 1b4: lload 6
      // 1b6: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: return
   }

   void N(long var1, _8l var3) {
   }

   boolean G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -2041455556953513065L, var2);
   }

   int r(Object[] var1) {
      return 2;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
