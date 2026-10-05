package com.zelix;

import java.awt.Dimension;
import java.awt.Point;
import java.lang.invoke.MethodHandles;
import javax.swing.Action;
import javax.swing.JFrame;

public abstract class u_ extends uy {
   private boolean D;
   protected JFrame Y;
   private static final long U = ess.a(-4295382863622060641L, 1361625965901990813L, MethodHandles.lookup().lookupClass()).a(129839058533922L);

   public u_(JFrame var1, char var2, String var3, Object var4, Object var5, Object var6, Object var7, Object var8, int var9, short var10) {
      long var11 = ((long)var2 << 48 | (long)var9 << 32 >>> 16 | (long)var10 << 48 >>> 48) ^ U;
      long var13 = var11 ^ 83975610117326L;
      this(var1, var3, true, var4, var5, var6, var13, var7, var8, null, null);
   }

   public void N(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -4992010998931156329
      // 18: lload 2
      // 19: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: lload 4
      // 21: bipush 1
      // 22: anewarray 70
      // 25: dup_x2
      // 26: dup_x2
      // 27: pop
      // 28: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b: bipush 0
      // 2c: swap
      // 2d: aastore
      // 2e: invokespecial com/zelix/uy.N ([Ljava/lang/Object;)V
      // 31: astore 6
      // 33: aload 0
      // 34: aload 6
      // 36: ifnull 7d
      // 39: ldc2_w -6901987718456037450
      // 3c: lload 2
      // 3d: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: ifeq 86
      // 45: goto 52
      // 48: ldc2_w -5026503875322518571
      // 4b: lload 2
      // 4c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 0
      // 53: ldc2_w -6742950400818946949
      // 56: lload 2
      // 57: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: bipush 1
      // 5d: ldc2_w -6360888359740465237
      // 60: lload 2
      // 61: invokedynamic o (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: aload 0
      // 67: ldc2_w -6742950400818946949
      // 6a: lload 2
      // 6b: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: goto 7d
      // 73: ldc2_w -5026503875322518571
      // 76: lload 2
      // 77: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: ldc2_w -6497115659937347746
      // 80: lload 2
      // 81: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: return
   }

   public u_(long var1, JFrame var3, String var4) {
      var1 = U ^ var1;
      long var5 = var1 ^ 15002188740865L;
      this(var3, var4, true, null, null, null, var5, null, null, null, null);
   }

   protected abstract void M(Object[] var1);

   public u_(JFrame var1, String var2, Object var3, Object var4, Object var5, long var6) {
      var6 = U ^ var6;
      long var8 = var6 ^ 58918221981341L;
      this(var1, var2, true, var3, var4, var5, var8, null, null, null, null);
   }

   public u_(
      JFrame param1,
      String param2,
      boolean param3,
      Object param4,
      Object param5,
      Object param6,
      long param7,
      Object param9,
      Object param10,
      Object param11,
      Object param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/u_.U J
      // 03: lload 7
      // 05: lxor
      // 06: lstore 7
      // 08: lload 7
      // 0a: dup2
      // 0b: ldc2_w 87881220512241
      // 0e: lxor
      // 0f: lstore 13
      // 11: dup2
      // 12: ldc2_w 88274932809869
      // 15: lxor
      // 16: lstore 15
      // 18: pop2
      // 19: aload 0
      // 1a: aload 2
      // 1b: lload 13
      // 1d: invokespecial com/zelix/uy.<init> (Ljava/lang/String;J)V
      // 20: ldc2_w -2354865223635306626
      // 23: lload 7
      // 25: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 0
      // 2b: aload 1
      // 2c: ldc2_w -4069779988699825774
      // 2f: lload 7
      // 31: invokedynamic u (Ljava/lang/Object;Ljavax/swing/JFrame;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: astore 17
      // 38: aload 0
      // 39: iload 3
      // 3a: aload 17
      // 3c: ifnull 6b
      // 3f: ldc2_w -4188857540231574945
      // 42: lload 7
      // 44: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: iload 3
      // 4a: ifeq 75
      // 4d: goto 5b
      // 50: ldc2_w -2317309107850148292
      // 53: lload 7
      // 55: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 1
      // 5c: bipush 0
      // 5d: goto 6b
      // 60: ldc2_w -2317309107850148292
      // 63: lload 7
      // 65: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: ldc2_w -4444890915112814014
      // 6e: lload 7
      // 70: invokedynamic n (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: new com/zelix/_k8
      // 78: dup
      // 79: aload 0
      // 7a: invokespecial com/zelix/_k8.<init> (Lcom/zelix/u_;)V
      // 7d: astore 18
      // 7f: aload 0
      // 80: aload 18
      // 82: ldc2_w -2587443353093895440
      // 85: lload 7
      // 87: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: aload 0
      // 8d: aload 4
      // 8f: aload 5
      // 91: aload 6
      // 93: aload 9
      // 95: aload 10
      // 97: aload 11
      // 99: aload 12
      // 9b: lload 15
      // 9d: bipush 8
      // 9f: anewarray 70
      // a2: dup_x2
      // a3: dup_x2
      // a4: pop
      // a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a8: bipush 7
      // aa: swap
      // ab: aastore
      // ac: dup_x1
      // ad: swap
      // ae: bipush 6
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: bipush 5
      // b5: swap
      // b6: aastore
      // b7: dup_x1
      // b8: swap
      // b9: bipush 4
      // ba: swap
      // bb: aastore
      // bc: dup_x1
      // bd: swap
      // be: bipush 3
      // bf: swap
      // c0: aastore
      // c1: dup_x1
      // c2: swap
      // c3: bipush 2
      // c4: swap
      // c5: aastore
      // c6: dup_x1
      // c7: swap
      // c8: bipush 1
      // c9: swap
      // ca: aastore
      // cb: dup_x1
      // cc: swap
      // cd: bipush 0
      // ce: swap
      // cf: aastore
      // d0: ldc2_w -4529336470953377843
      // d3: lload 7
      // d5: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da: return
   }

   public u_(JFrame var1, long var2, String var4, Object var5, Object var6, Object var7, Object var8, Object var9, Object var10) {
      var2 = U ^ var2;
      long var11 = var2 ^ 45904193477103L;
      this(var1, var4, true, var5, var6, var7, var11, var8, var9, var10, null);
   }

   protected abstract void Z(Object[] var1);

   public u_(long var1, JFrame var3, String var4, Object var5, Object var6) {
      var1 = U ^ var1;
      long var7 = var1 ^ 82350818328754L;
      this(var3, var4, true, var5, var6, null, var7, null, null, null, null);
   }

   public void U(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = U ^ var2;
      long var4 = var2 ^ 95039791814436L;
      Object[] var10006 = new Object[]{null, null, null, true};
      var10006[2] = 0;
      var10006[1] = 0;
      var10006[0] = var4;
      x44.a<"i">(this, var10006, -1476687575521886760L, var2);
   }

   public Action a(Object[] var1) {
      return new d5(this);
   }

   public final void a(Object[] var1) {
      long var7;
      long var9;
      long var17;
      int var18;
      int var20;
      label16: {
         long var5 = (Long)var1[0];
         int var2 = (Integer)var1[1];
         int var3 = (Integer)var1[2];
         boolean var4 = (Boolean)var1[3];
         var17 = U ^ var5;
         var7 = var17 ^ 7422373834024L;
         var9 = var17 ^ 138506485832737L;
         String var10000 = x44.a<"q">(6633493082582709281L, var17);
         Dimension var12 = x44.a<"i">(this, 4743840447236703020L, var17);
         String var11 = var10000;
         if (var4) {
            Point var15 = x44.a<"i">(x44.a<"m">(this, 4961292198384253645L, var17), 6388400940190219305L, var17);
            Dimension var16 = x44.a<"i">(x44.a<"m">(this, 4961292198384253645L, var17), 6726066346910562287L, var17);
            var18 = x44.a<"m">(var16, 6665277896806474959L, var17) / 2
               - x44.a<"m">(var12, 6665277896806474959L, var17) / 2
               + x44.a<"m">(var15, 6451837407669521447L, var17);
            var20 = x44.a<"m">(var16, 6877178383912020589L, var17) / 2
               - x44.a<"m">(var12, 6877178383912020589L, var17) / 2
               + x44.a<"m">(var15, 6451224223713666237L, var17);
            var18 = Math.max(0, var18) + var2;
            var20 = Math.max(0, var20) + var3;
            if (var17 <= 0L) {
               return;
            }

            if (var11 != null) {
               break label16;
            }
         }

         Dimension var22 = x44.a<"i">(x44.a<"q">(4943100776910264008L, var17), 6356519543420066772L, var17);
         var18 = x44.a<"m">(var22, 6665277896806474959L, var17) / 2 - x44.a<"m">(var12, 6665277896806474959L, var17) / 2;
         var20 = x44.a<"m">(var22, 6877178383912020589L, var17) / 2 - x44.a<"m">(var12, 6877178383912020589L, var17) / 2;
         var18 = Math.max(0, var18) + var2;
         var20 = Math.max(0, var20) + var3;
      }

      x44.a<"i">(this, var18, var20, 6380557673056264833L, var17);
      Object[] var10004 = new Object[]{null, this, true};
      var10004[0] = var7;
      x44.a<"q">(var10004, 6904537282610006541L, var17);
      x44.a<"i">(this, 6693772612406917037L, var17);
      x44.a<"i">(this, new Object[]{var9}, 5155456185641326963L, var17);
   }

   public u_(JFrame var1, String var2, long var3, Object var5) {
      var3 = U ^ var3;
      long var6 = var3 ^ 13478412140849L;
      this(var1, var2, true, var5, null, null, var6, null, null, null, null);
   }

   public u_(JFrame var1, long var2, String var4, Object var5, Object var6, Object var7, Object var8) {
      var2 = U ^ var2;
      long var9 = var2 ^ 125234725940684L;
      this(var1, var4, true, var5, var6, var7, var9, var8, null, null, null);
   }

   private static gj c(gj var0) {
      return var0;
   }
}
