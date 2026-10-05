package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class i2 extends h8 implements _y1, _zv {
   private String Q;
   private boolean U;
   private int T;
   private static final long b = ess.a(7437027019768597922L, -406537013495846608L, MethodHandles.lookup().lookupClass()).a(195564407382991L);

   abstract boolean r(Object[] var1);

   final String A(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/i2.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 85692297552583
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 70258287935595
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w 7004741491682465137
      // 025: lload 2
      // 026: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 0
      // 02c: invokevirtual com/zelix/i2.x ()Lcom/zelix/h8;
      // 02f: astore 9
      // 031: istore 8
      // 033: aload 9
      // 035: ifnull 09e
      // 038: aload 9
      // 03a: instanceof com/zelix/im
      // 03d: lload 2
      // 03e: lconst_0
      // 03f: lcmp
      // 040: iflt 082
      // 043: iload 8
      // 045: ifne 082
      // 048: ifne 09e
      // 04b: goto 058
      // 04e: ldc2_w 8863182924317206778
      // 051: lload 2
      // 052: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: lload 2
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iflt 099
      // 05e: aload 9
      // 060: iload 8
      // 062: ifne 097
      // 065: goto 072
      // 068: ldc2_w 8863182924317206778
      // 06b: lload 2
      // 06c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: instanceof com/zelix/ig
      // 075: goto 082
      // 078: ldc2_w 8863182924317206778
      // 07b: lload 2
      // 07c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: ifne 09e
      // 085: aload 9
      // 087: invokevirtual com/zelix/h8.x ()Lcom/zelix/h8;
      // 08a: goto 097
      // 08d: ldc2_w 8863182924317206778
      // 090: lload 2
      // 091: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: astore 9
      // 099: iload 8
      // 09b: ifeq 033
      // 09e: aconst_null
      // 09f: astore 10
      // 0a1: aload 9
      // 0a3: lload 2
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 03a
      // 0a9: ifnonnull 0ac
      // 0ac: aload 9
      // 0ae: instanceof com/zelix/im
      // 0b1: iload 8
      // 0b3: ifne 0ff
      // 0b6: ifeq 0e8
      // 0b9: goto 0c6
      // 0bc: ldc2_w 8863182924317206778
      // 0bf: lload 2
      // 0c0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 9
      // 0c8: checkcast com/zelix/im
      // 0cb: lload 4
      // 0cd: bipush 1
      // 0ce: anewarray 109
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w 8839861119155123228
      // 0dd: lload 2
      // 0de: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 10
      // 0e5: goto 114
      // 0e8: aload 9
      // 0ea: iload 8
      // 0ec: ifne 104
      // 0ef: instanceof com/zelix/ig
      // 0f2: goto 0ff
      // 0f5: ldc2_w 8863182924317206778
      // 0f8: lload 2
      // 0f9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: ifeq 114
      // 102: aload 9
      // 104: checkcast com/zelix/ig
      // 107: lload 6
      // 109: ldc2_w 7402162839312390534
      // 10c: lload 2
      // 10d: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: astore 10
      // 114: aload 10
      // 116: areturn
   }

   public abstract void Y(Object[] var1);

   final void b(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      x44.a<"q">(this, var2, -5308322395245483578L, var3);
   }

   final String Z(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/i2.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 35292623494492
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 110471860128631
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -5191647653262555239
      // 025: lload 2
      // 026: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 0
      // 02c: invokevirtual com/zelix/i2.x ()Lcom/zelix/h8;
      // 02f: astore 9
      // 031: istore 8
      // 033: aload 9
      // 035: ifnull 09e
      // 038: aload 9
      // 03a: instanceof com/zelix/ij
      // 03d: lload 2
      // 03e: lconst_0
      // 03f: lcmp
      // 040: ifle 082
      // 043: iload 8
      // 045: ifeq 082
      // 048: ifne 09e
      // 04b: goto 058
      // 04e: ldc2_w -5714666407954029749
      // 051: lload 2
      // 052: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: lload 2
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iflt 099
      // 05e: aload 9
      // 060: iload 8
      // 062: ifeq 097
      // 065: goto 072
      // 068: ldc2_w -5714666407954029749
      // 06b: lload 2
      // 06c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: instanceof com/zelix/hy
      // 075: goto 082
      // 078: ldc2_w -5714666407954029749
      // 07b: lload 2
      // 07c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: ifne 09e
      // 085: aload 9
      // 087: invokevirtual com/zelix/h8.x ()Lcom/zelix/h8;
      // 08a: goto 097
      // 08d: ldc2_w -5714666407954029749
      // 090: lload 2
      // 091: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: astore 9
      // 099: iload 8
      // 09b: ifne 033
      // 09e: aconst_null
      // 09f: astore 10
      // 0a1: aload 9
      // 0a3: lload 2
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: iflt 03a
      // 0a9: ifnonnull 0ac
      // 0ac: aload 9
      // 0ae: instanceof com/zelix/ij
      // 0b1: iload 8
      // 0b3: ifeq 0ff
      // 0b6: ifeq 0e8
      // 0b9: goto 0c6
      // 0bc: ldc2_w -5714666407954029749
      // 0bf: lload 2
      // 0c0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 9
      // 0c8: checkcast com/zelix/ij
      // 0cb: lload 4
      // 0cd: bipush 1
      // 0ce: anewarray 109
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -6287242358462346245
      // 0dd: lload 2
      // 0de: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 10
      // 0e5: goto 121
      // 0e8: aload 9
      // 0ea: iload 8
      // 0ec: ifeq 104
      // 0ef: instanceof com/zelix/hy
      // 0f2: goto 0ff
      // 0f5: ldc2_w -5714666407954029749
      // 0f8: lload 2
      // 0f9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: ifeq 121
      // 102: aload 9
      // 104: checkcast com/zelix/hy
      // 107: lload 6
      // 109: bipush 1
      // 10a: anewarray 109
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: ldc2_w -5951692760809514269
      // 119: lload 2
      // 11a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: astore 10
      // 121: aload 10
      // 123: areturn
   }

   public final String H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"n">(this, -8737647662683090367L, var2);
   }

   static i2 J(Object[] var0) {
      long var1 = (Long)var0[0];
      h8 var5 = (h8)var0[1];
      _xx var4 = (_xx)var0[2];
      _y4 var3 = (_y4)var0[3];
      var1 = b ^ var1;
      long var6 = var1 ^ 136289656298105L;
      long var8 = var1 ^ 16244100406756L;
      int var10 = (int)((var1 ^ 112347870793761L) >>> 32);
      int var11 = (int)((var1 ^ 112347870793761L) << 32 >>> 32);
      long var12 = var1 ^ 125637292223347L;
      long var14 = var1 ^ 67528084629080L;
      long var16 = var1 ^ 78792382205135L;
      long var18 = var1 ^ 51275450810227L;
      long var20 = var1 ^ 38791153493435L;
      long var22 = var1 ^ 76913068081993L;
      int var24 = var4.readUnsignedByte();

      try {
         switch (var24) {
            case 64:
               return new iw(var6, var5, var24, var4, var3);
            case 65:
            case 69:
            case 71:
            case 72:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 100:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            default:
               return null;
            case 66:
            case 67:
            case 73:
            case 83:
            case 90:
               return new i7(var5, var8, var24, var4);
            case 68:
               return new ip(var10, var5, var24, var11, var4);
            case 70:
               return new i9(var12, var5, var24, var4);
            case 74:
               return new i6(var5, var24, var4, var18);
            case 91:
               return new i4(var16, var5, var24, var4, var3);
            case 99:
               return new i1(var22, var5, var24, var4, var3);
            case 101:
               return new ia(var5, var14, var24, var4, var3);
            case 115:
               return new i_(var5, var24, var4, var3, var20);
         }
      } catch (gj var25) {
         throw x44.a<"u">(var25, 6196478847421908484L, var1);
      }
   }

   abstract String E(Object[] var1);

   abstract boolean j(Object[] var1);

   i2(h8 var1, int var2, long var3) {
      var3 = b ^ var3;
      super(var1);
      x44.a<"s">(this, true, -6163344549678844444L, var3);
      x44.a<"s">(this, var2, -5287745414004777180L, var3);
   }

   final int r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"k">(this, 8762122148864626723L, var2);
   }

   final void a(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = b ^ var3;
      x44.a<"r">(this, var2, 2704007327752532346L, var3);
   }

   public final boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -3690042122518260903L, var2);
   }

   public abstract void k(Object[] var1);

   abstract String Q(Object[] var1);

   private static gj b(gj var0) {
      return var0;
   }
}
