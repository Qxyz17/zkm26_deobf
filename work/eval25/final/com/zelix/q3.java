package com.zelix;

import java.lang.invoke.MethodHandles;

public class q3 {
   private ig P;
   private int f;
   private _9 Y;
   private boolean L;
   private static final long a = ess.a(2117981446514497335L, -8148915576307828838L, MethodHandles.lookup().lookupClass()).a(173701971214963L);

   _9 R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 1371941014657625555L, var2);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/q3.a J
      // 003: ldc2_w 48561756868619
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 45802252863539
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 111742635203918
      // 014: lxor
      // 015: lstore 6
      // 017: pop2
      // 018: ldc2_w 2075318298226287692
      // 01b: lload 2
      // 01c: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: astore 8
      // 023: aload 1
      // 024: instanceof com/zelix/q3
      // 027: aload 8
      // 029: ifnull 292
      // 02c: ifeq 291
      // 02f: goto 03c
      // 032: ldc2_w 108248243080087759
      // 035: lload 2
      // 036: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: athrow
      // 03c: aload 1
      // 03d: checkcast com/zelix/q3
      // 040: astore 9
      // 042: aload 0
      // 043: ldc2_w 215362913220575206
      // 046: lload 2
      // 047: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 8
      // 04e: ifnull 290
      // 051: aload 9
      // 053: ldc2_w 215362913220575206
      // 056: lload 2
      // 057: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: if_icmpne 28f
      // 05f: goto 06c
      // 062: ldc2_w 108248243080087759
      // 065: lload 2
      // 066: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: aload 0
      // 06d: ldc2_w 463921772159170729
      // 070: lload 2
      // 071: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: aload 8
      // 078: ifnull 0dc
      // 07b: goto 088
      // 07e: ldc2_w 108248243080087759
      // 081: lload 2
      // 082: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: ifnonnull 0c5
      // 08b: goto 098
      // 08e: ldc2_w 108248243080087759
      // 091: lload 2
      // 092: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 9
      // 09a: aload 8
      // 09c: ifnull 189
      // 09f: goto 0ac
      // 0a2: ldc2_w 108248243080087759
      // 0a5: lload 2
      // 0a6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: ldc2_w 463921772159170729
      // 0af: lload 2
      // 0b0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: ifnull 188
      // 0b8: goto 0c5
      // 0bb: ldc2_w 108248243080087759
      // 0be: lload 2
      // 0bf: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: ldc2_w 463921772159170729
      // 0c9: lload 2
      // 0ca: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: goto 0dc
      // 0d2: ldc2_w 108248243080087759
      // 0d5: lload 2
      // 0d6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 8
      // 0de: ifnull 109
      // 0e1: ifnull 28f
      // 0e4: goto 0f1
      // 0e7: ldc2_w 108248243080087759
      // 0ea: lload 2
      // 0eb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 9
      // 0f3: ldc2_w 463921772159170729
      // 0f6: lload 2
      // 0f7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: goto 109
      // 0ff: ldc2_w 108248243080087759
      // 102: lload 2
      // 103: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 8
      // 10b: ifnull 135
      // 10e: ifnull 28f
      // 111: goto 11e
      // 114: ldc2_w 108248243080087759
      // 117: lload 2
      // 118: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 0
      // 11f: ldc2_w 463921772159170729
      // 122: lload 2
      // 123: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: goto 135
      // 12b: ldc2_w 108248243080087759
      // 12e: lload 2
      // 12f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: lload 4
      // 137: bipush 1
      // 138: anewarray 31
      // 13b: dup_x2
      // 13c: dup_x2
      // 13d: pop
      // 13e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: ldc2_w 515183047061694453
      // 147: lload 2
      // 148: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: aload 9
      // 14f: ldc2_w 463921772159170729
      // 152: lload 2
      // 153: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: lload 4
      // 15a: bipush 1
      // 15b: anewarray 31
      // 15e: dup_x2
      // 15f: dup_x2
      // 160: pop
      // 161: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 164: bipush 0
      // 165: swap
      // 166: aastore
      // 167: ldc2_w 515183047061694453
      // 16a: lload 2
      // 16b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 173: aload 8
      // 175: ifnull 290
      // 178: ifeq 28f
      // 17b: goto 188
      // 17e: ldc2_w 108248243080087759
      // 181: lload 2
      // 182: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: aload 0
      // 189: ldc2_w 226236940090248782
      // 18c: lload 2
      // 18d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: aload 8
      // 194: ifnull 1eb
      // 197: ifnonnull 1d4
      // 19a: goto 1a7
      // 19d: ldc2_w 108248243080087759
      // 1a0: lload 2
      // 1a1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: aload 9
      // 1a9: ldc2_w 226236940090248782
      // 1ac: lload 2
      // 1ad: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: aload 8
      // 1b4: ifnull 1eb
      // 1b7: goto 1c4
      // 1ba: ldc2_w 108248243080087759
      // 1bd: lload 2
      // 1be: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: ifnull 281
      // 1c7: goto 1d4
      // 1ca: ldc2_w 108248243080087759
      // 1cd: lload 2
      // 1ce: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: ldc2_w 226236940090248782
      // 1d8: lload 2
      // 1d9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: goto 1eb
      // 1e1: ldc2_w 108248243080087759
      // 1e4: lload 2
      // 1e5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: aload 8
      // 1ed: ifnull 218
      // 1f0: ifnull 28d
      // 1f3: goto 200
      // 1f6: ldc2_w 108248243080087759
      // 1f9: lload 2
      // 1fa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: athrow
      // 200: aload 9
      // 202: ldc2_w 226236940090248782
      // 205: lload 2
      // 206: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: goto 218
      // 20e: ldc2_w 108248243080087759
      // 211: lload 2
      // 212: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 8
      // 21a: ifnull 244
      // 21d: ifnull 28d
      // 220: goto 22d
      // 223: ldc2_w 108248243080087759
      // 226: lload 2
      // 227: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: aload 0
      // 22e: ldc2_w 226236940090248782
      // 231: lload 2
      // 232: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: goto 244
      // 23a: ldc2_w 108248243080087759
      // 23d: lload 2
      // 23e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 9
      // 246: ldc2_w 226236940090248782
      // 249: lload 2
      // 24a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: lload 6
      // 251: bipush 2
      // 252: anewarray 31
      // 255: dup_x2
      // 256: dup_x2
      // 257: pop
      // 258: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25b: bipush 1
      // 25c: swap
      // 25d: aastore
      // 25e: dup_x1
      // 25f: swap
      // 260: bipush 0
      // 261: swap
      // 262: aastore
      // 263: ldc2_w 33384010068582128
      // 266: lload 2
      // 267: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: aload 8
      // 26e: ifnull 28e
      // 271: ifeq 28d
      // 274: goto 281
      // 277: ldc2_w 108248243080087759
      // 27a: lload 2
      // 27b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: bipush 1
      // 282: ireturn
      // 283: ldc2_w 108248243080087759
      // 286: lload 2
      // 287: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: athrow
      // 28d: bipush 0
      // 28e: ireturn
      // 28f: bipush 0
      // 290: ireturn
      // 291: bipush 0
      // 292: ireturn
   }

   q3(long var1, _9 var3, ig var4, boolean var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 21073623913287L;
      long var8 = var1 ^ 101188159118121L;
      long var10 = var1 ^ 47248899908302L;
      super();
      x44.a<"w">(this, false, 450197319006224542L, var1);
      x44.a<"w">(this, var3, 2090819106956698589L, var1);
      x44.a<"w">(this, var4, 1754147445823739194L, var1);
      x44.a<"w">(this, var5, 450197319006224542L, var1);
      x44.a<"w">(
         this,
         x44.a<"l">(var3, new Object[]{var6}, 2040824160182566017L, var1).hashCode()
            ^ x44.a<"l">(var4, new Object[]{var10}, 1741715240285176857L, var1).hashCode()
            ^ var4.k(var8).hashCode(),
         1840043631362385042L,
         var1
      );
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 67852720375881L;
      return x44.a<"n">(this, 1927275594580567972L, var1);
   }

   q3(_9 var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 33499409698427L;
      super();
      x44.a<"s">(this, false, 6558192472894692770L, var3);
      x44.a<"s">(this, var1, 4627476909321928417L, var3);
      x44.a<"s">(this, null, 5002362926545225734L, var3);
      x44.a<"s">(this, var2, 6558192472894692770L, var3);
      x44.a<"s">(this, x44.a<"h">(var1, new Object[]{var5}, 4714841786642801085L, var3).hashCode(), 4950908111124134318L, var3);
   }

   ig J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -5188455737023513965L, var2);
   }

   boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, -7460148986147070247L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
