package com.zelix;

import java.lang.invoke.MethodHandles;

public class v {
   private m8 P;
   private final _4 C;
   private int K;
   private int Y;
   private static String[] U;
   private int c;
   private mr m;
   private long b;
   private x4 F;
   private static final long a = ess.a(-7365048619577618625L, 6941273007058607041L, MethodHandles.lookup().lookupClass()).a(4977539155390L);

   public v(char var1, m8 var2, char var3, int var4, int var5) {
      long var6 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      super();
      x44.a<"p">(this, -1, -7749856189807346324L, var6);
      x44.a<"p">(this, -1, -8142392645361518133L, var6);
      this.C = x44.a<"j">(-8176778243246116687L, var6);
      x44.a<"p">(this, var2, -7674688503842817563L, var6);
      x44.a<"p">(this, var4, -8624721787344092818L, var6);
      x44.a<"p">(this, var4, -8142392645361518133L, var6);
   }

   public _4 Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 6648878375537419789L, var2);
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      x44.a<"v">(this, var4, 2389370518187354120L, var2);
   }

   public void L(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      x44.a<"r">(this, var2, -8281093561532510603L, var4);
   }

   public m8 P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -5824507259178155088L, var2);
   }

   public static void n(String[] var0) {
      U = var0;
   }

   public static String[] L() {
      return U;
   }

   public boolean k(Object[] param1) {
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
      // 0c: getstatic com/zelix/v.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8759679014200345566
      // 15: lload 2
      // 16: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 8867473997842510383
      // 21: lload 2
      // 22: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 4b
      // 2c: bipush -1
      // 2d: if_icmple 4e
      // 30: goto 3d
      // 33: ldc2_w 8655133359110391231
      // 36: lload 2
      // 37: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4b
      // 41: ldc2_w 8655133359110391231
      // 44: lload 2
      // 45: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public v(int var1, int var2, long var3) {
      var3 = a ^ var3;
      super();
      x44.a<"s">(this, -1, -4075265693665923473L, var3);
      x44.a<"s">(this, -1, -2593179838375892280L, var3);
      this.C = x44.a<"i">(-4125584372923148020L, var3);
      x44.a<"s">(this, var1, -4075265693665923473L, var3);
      x44.a<"s">(this, var2, -2644298455709134227L, var3);
      x44.a<"s">(this, var2, -2593179838375892280L, var3);
   }

   public x4 G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 5112431864018849704L, var2);
   }

   public boolean F(Object[] param1) {
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
      // 0c: getstatic com/zelix/v.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 5396688506027585706
      // 15: lload 2
      // 16: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 6073092286724930905
      // 21: lload 2
      // 22: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 4b
      // 2c: bipush -1
      // 2d: if_icmple 4e
      // 30: goto 3d
      // 33: ldc2_w 5434006175928989387
      // 36: lload 2
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 4b
      // 41: ldc2_w 5434006175928989387
      // 44: lload 2
      // 45: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public long l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 3305319734523342520L, var2);
   }

   public int B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 6543346692488975342L, var2);
   }

   public int n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -1687515150984756854L, var2);
   }

   public v(x4 var1, int var2, long var3) {
      var3 = a ^ var3;
      super();
      x44.a<"w">(this, -1, 5631161283852920635L, var3);
      x44.a<"w">(this, -1, 6149511936576775068L, var3);
      this.C = x44.a<"m">(6020360379434655040L, var3);
      x44.a<"w">(this, var1, 5662460176804366286L, var3);
      x44.a<"w">(this, var2, 5915980294436903737L, var3);
      x44.a<"w">(this, var2, 6149511936576775068L, var3);
   }

   public v(mr var1, int var2, long var3) {
      var3 = a ^ var3;
      super();
      x44.a<"p">(this, -1, -3102211305802433044L, var3);
      x44.a<"p">(this, -1, -3494748657974806197L, var3);
      this.C = x44.a<"j">(-3984743265692365852L, var3);
      x44.a<"p">(this, var1, -3641598962662002013L, var3);
      x44.a<"p">(this, var2, -3977078001248321042L, var3);
      x44.a<"p">(this, var2, -3494748657974806197L, var3);
   }

   public boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, 3992206313546991794L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, 3588632941032623215L, var2);
      }

      return false;
   }

   public mr i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -2177471599122342371L, var2);
   }

   public v(int var1, m8 var2, long var3) {
      var3 = a ^ var3;
      super();
      x44.a<"v">(this, -1, 5509308960914040170L, var3);
      x44.a<"v">(this, -1, 6270818910052475341L, var3);
      this.C = x44.a<"l">(6263680384740383654L, var3);
      x44.a<"v">(this, var2, 5582214914819187171L, var3);
      x44.a<"v">(this, var1, 5785103169344985448L, var3);
      x44.a<"v">(this, var1, 6270818910052475341L, var3);
   }

   static {
      long var0 = a ^ 88301424224926L;
      if (x44.a<"p">(-4892331821180205484L, var0) != null) {
         x44.a<"p">(new String[1], -5157537322900523140L, var0);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
