package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Map;

public class r {
   final yg U;
   final Map V;
   final _yv a;
   final boolean O;
   final ax n;
   HashSet j;
   final boolean C;
   final ax R;
   final HashSet S;
   private xx B;
   final ax u;
   final _fm K;
   final Map W;
   final lh G;
   Map E;
   int v;
   final Map L;
   final Map x;
   final Map s;
   final q8 P;
   boolean T;
   private static final long b = ess.a(8865089241633012125L, 1686350653192099740L, MethodHandles.lookup().lookupClass()).a(276821658162679L);

   HashSet S(Object[] var1) {
      HashSet var4 = (HashSet)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      HashSet var5 = x44.a<"j">(this, 6773413965004682395L, var2);
      x44.a<"u">(this, var4, 6773413965004682395L, var2);
      return var5;
   }

   boolean E(Object[] var1) {
      _y0 var2 = (_y0)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      return x44.a<"h">(x44.a<"l">(this, -3496514677534491605L, var3), var2, -3571071794945835992L, var3);
   }

   void V(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = b ^ var2;
      x44.a<"l">(this, -722900360856950922L, var2).Q(var4);
   }

   boolean J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"o">(this, 2133792383869472541L, var2).S();
   }

   r(
      yg var1,
      HashSet var2,
      boolean var3,
      q8 var4,
      ax var5,
      ax var6,
      ax var7,
      _fm var8,
      _yv var9,
      Map var10,
      boolean var11,
      Map var12,
      Map var13,
      long var14,
      Map var16,
      Map var17,
      int var18,
      Map var19
   ) {
      var14 = b ^ var14;
      long var20 = var14 ^ 73473776954201L;
      long var22 = var14 ^ 44951923875486L;
      this.U = var1;
      super();
      this.G = new lh(var20);
      x44.a<"t">(this, new xx(true), -2465500353816981687L, var14);
      x44.a<"t">(this, var2, -4138479170148520950L, var14);
      this.O = var3;
      this.P = var4;
      this.n = var5;
      this.R = var6;
      this.u = var7;
      this.K = var8;
      this.a = var9;
      this.W = var10;
      this.S = x44.a<"w">(new Object[]{var22}, -2406341517830498474L, var14);
      this.C = var11;
      this.L = var12;
      this.s = var13;
      this.V = var16;
      this.x = var17;
      x44.a<"t">(this, var18, -4494835016650060763L, var14);
      x44.a<"t">(this, var19, -2426810683000960009L, var14);
   }

   int w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"m">(this, -8781708142772925541L, var2);
   }

   r(
      yg var1,
      HashSet var2,
      boolean var3,
      q8 var4,
      ax var5,
      ax var6,
      ax var7,
      _fm var8,
      _yv var9,
      Map var10,
      long var11,
      boolean var13,
      Map var14,
      Map var15,
      Map var16,
      Map var17,
      Map var18
   ) {
      var11 = b ^ var11;
      long var19 = var11 ^ 65806867824527L;
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var13, var14, var15, var19, var16, var17, 0, var18);
   }

   r(yg param1, r param2, boolean param3, int param4, short param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: i2l
      // 003: bipush 32
      // 005: lshl
      // 006: iload 5
      // 008: i2l
      // 009: bipush 48
      // 00b: lshl
      // 00c: bipush 32
      // 00e: lushr
      // 00f: lor
      // 010: iload 6
      // 012: i2l
      // 013: bipush 48
      // 015: lshl
      // 016: bipush 48
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/r.b J
      // 01d: lxor
      // 01e: lstore 7
      // 020: lload 7
      // 022: dup2
      // 023: ldc2_w 60661013938997
      // 026: lxor
      // 027: lstore 9
      // 029: dup2
      // 02a: ldc2_w 62056915536951
      // 02d: lxor
      // 02e: lstore 11
      // 030: pop2
      // 031: aload 0
      // 032: aload 1
      // 033: putfield com/zelix/r.U Lcom/zelix/yg;
      // 036: aload 0
      // 037: invokespecial java/lang/Object.<init> ()V
      // 03a: aload 0
      // 03b: new com/zelix/lh
      // 03e: dup
      // 03f: lload 9
      // 041: invokespecial com/zelix/lh.<init> (J)V
      // 044: putfield com/zelix/r.G Lcom/zelix/lh;
      // 047: ldc2_w -624311381703123901
      // 04a: lload 7
      // 04c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 0
      // 052: new com/zelix/xx
      // 055: dup
      // 056: bipush 1
      // 057: invokespecial com/zelix/xx.<init> (Z)V
      // 05a: ldc2_w -746263259351111899
      // 05d: lload 7
      // 05f: invokedynamic p (Ljava/lang/Object;Lcom/zelix/xx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 0
      // 065: aload 2
      // 066: ldc2_w -1225719180085328794
      // 069: lload 7
      // 06b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: ldc2_w -1225719180085328794
      // 073: lload 7
      // 075: invokedynamic p (Ljava/lang/Object;Ljava/util/HashSet;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: aload 0
      // 07b: aload 2
      // 07c: ldc2_w -797589546868372125
      // 07f: lload 7
      // 081: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: putfield com/zelix/r.O Z
      // 089: aload 0
      // 08a: aload 2
      // 08b: ldc2_w -788189274092339668
      // 08e: lload 7
      // 090: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: putfield com/zelix/r.P Lcom/zelix/q8;
      // 098: aload 0
      // 099: aload 2
      // 09a: ldc2_w -1150511438581265664
      // 09d: lload 7
      // 09f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ax; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: putfield com/zelix/r.n Lcom/zelix/ax;
      // 0a7: aload 0
      // 0a8: aload 2
      // 0a9: ldc2_w -1505038774340743755
      // 0ac: lload 7
      // 0ae: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ax; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: putfield com/zelix/r.R Lcom/zelix/ax;
      // 0b6: aload 0
      // 0b7: aload 2
      // 0b8: ldc2_w -1158165125946146518
      // 0bb: lload 7
      // 0bd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ax; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: putfield com/zelix/r.u Lcom/zelix/ax;
      // 0c5: aload 0
      // 0c6: aload 2
      // 0c7: ldc2_w -836650048270194105
      // 0ca: lload 7
      // 0cc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_fm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: putfield com/zelix/r.K Lcom/zelix/_fm;
      // 0d4: aload 0
      // 0d5: aload 2
      // 0d6: ldc2_w -1107444005753431498
      // 0d9: lload 7
      // 0db: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_yv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: putfield com/zelix/r.a Lcom/zelix/_yv;
      // 0e3: aload 0
      // 0e4: aload 2
      // 0e5: ldc2_w -1091871850485339088
      // 0e8: lload 7
      // 0ea: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: putfield com/zelix/r.W Ljava/util/Map;
      // 0f2: aload 0
      // 0f3: aload 2
      // 0f4: ldc2_w -1170162731261436784
      // 0f7: lload 7
      // 0f9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: lload 11
      // 100: dup2_x1
      // 101: pop2
      // 102: bipush 2
      // 103: anewarray 60
      // 106: dup_x1
      // 107: swap
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w -1261678033892261604
      // 117: lload 7
      // 119: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: putfield com/zelix/r.S Ljava/util/HashSet;
      // 121: aload 0
      // 122: iload 3
      // 123: putfield com/zelix/r.C Z
      // 126: aload 0
      // 127: aload 2
      // 128: ldc2_w -1441323673915033409
      // 12b: lload 7
      // 12d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: putfield com/zelix/r.L Ljava/util/Map;
      // 135: aload 0
      // 136: aload 2
      // 137: ldc2_w -637570888482282577
      // 13a: lload 7
      // 13c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: putfield com/zelix/r.s Ljava/util/Map;
      // 144: istore 13
      // 146: aload 0
      // 147: aload 2
      // 148: ldc2_w -1723899621246252889
      // 14b: lload 7
      // 14d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: putfield com/zelix/r.V Ljava/util/Map;
      // 155: aload 0
      // 156: aload 2
      // 157: ldc2_w -1572849335221774089
      // 15a: lload 7
      // 15c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: putfield com/zelix/r.x Ljava/util/Map;
      // 164: aload 0
      // 165: aload 2
      // 166: ldc2_w -1588830978057034679
      // 169: lload 7
      // 16b: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: bipush 1
      // 171: iadd
      // 172: ldc2_w -1588830978057034679
      // 175: lload 7
      // 177: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: aload 0
      // 17d: aload 2
      // 17e: ldc2_w -703043729613986917
      // 181: lload 7
      // 183: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: ldc2_w -703043729613986917
      // 18b: lload 7
      // 18d: invokedynamic p (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: aload 0
      // 193: aload 2
      // 194: ldc2_w -746263259351111899
      // 197: lload 7
      // 199: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: ldc2_w -746263259351111899
      // 1a1: lload 7
      // 1a3: invokedynamic p (Ljava/lang/Object;Lcom/zelix/xx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: ldc2_w -1513143562702027857
      // 1ab: lload 7
      // 1ad: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: ifnonnull 1e2
      // 1b5: iload 13
      // 1b7: ifeq 1d7
      // 1ba: goto 1c8
      // 1bd: ldc2_w -1592462126423598640
      // 1c0: lload 7
      // 1c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: bipush 0
      // 1c9: goto 1d8
      // 1cc: ldc2_w -1592462126423598640
      // 1cf: lload 7
      // 1d1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: bipush 1
      // 1d8: ldc2_w -1279745139858238058
      // 1db: lload 7
      // 1dd: invokedynamic s (ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: return
   }

   r(yg var1, r var2, long var3, q8 var5) {
      var3 = b ^ var3;
      long var6 = var3 ^ 119827505397325L;
      this(var6, var1, var2, var5, x44.a<"j">(var2, -7564246749865747780L, var3) + 1);
   }

   boolean N(Object[] var1) {
      long var2 = (Long)var1[0];
      _y0 var4 = (_y0)var1[1];
      var2 = b ^ var2;
      return x44.a<"n">(this, -6571935579294885991L, var2).add(var4);
   }

   r(long var1, yg var3, r var4, q8 var5, int var6) {
      var1 = b ^ var1;
      long var7 = var1 ^ 57609360979920L;
      this(var3, var4, var5, var7, var6, false);
   }

   r(yg var1, r var2, q8 var3, long var4, int var6, boolean var7) {
      var4 = b ^ var4;
      long var8 = var4 ^ 101952938898525L;
      long var10 = var4 ^ 92233263807327L;
      this.U = var1;
      boolean var10000 = x44.a<"s">(17569686101093163L, var4);
      super();
      this.G = new lh(var8);
      x44.a<"p">(this, new xx(true), 201771475583586381L, var4);
      x44.a<"p">(this, x44.a<"o">(var2, 1843438395450553102L, var4), 1843438395450553102L, var4);
      this.O = x44.a<"o">(var2, 253907033686571531L, var4);
      this.P = var3;
      this.n = x44.a<"o">(var2, 531675871020579944L, var4);
      this.R = x44.a<"o">(var2, 2050664669999266525L, var4);
      this.u = x44.a<"o">(var2, 1766877142059644482L, var4);
      this.K = x44.a<"o">(var2, 219537995375467823L, var4);
      this.a = x44.a<"o">(var2, 561254614652595550L, var4);
      this.W = x44.a<"o">(var2, 554100827100699480L, var4);
      this.S = x44.a<"s">(new Object[]{var10, x44.a<"o">(var2, 1777466788276481016L, var4)}, 1807620279668881012L, var4);
      this.C = x44.a<"o">(var2, 311020705386901690L, var4);
      this.L = x44.a<"o">(var2, 2060124507983187927L, var4);
      this.s = x44.a<"o">(var2, 22112509509424327L, var4);
      boolean var12 = var10000;

      try {
         this.V = x44.a<"o">(var2, 2268426628212932559L, var4);
         this.x = x44.a<"o">(var2, 2108940605351620511L, var4);
         x44.a<"p">(this, var6, 2205423747924677409L, var4);
         x44.a<"p">(this, var7, 84559136270776375L, var4);
         x44.a<"p">(this, x44.a<"o">(var2, 96302794219066611L, var4), 96302794219066611L, var4);
         x44.a<"p">(this, x44.a<"o">(var2, 201771475583586381L, var4), 201771475583586381L, var4);
         if (var12) {
            x44.a<"s">(new String[4], 504225119609627209L, var4);
         }
      } catch (gj var13) {
         throw x44.a<"s">(var13, 2201727712283258552L, var4);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
