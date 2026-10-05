package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class j1 extends j0 {
   private ArrayList Z;
   private boolean c;
   private static final long b = ess.a(-509318214750377359L, -5199143342056962976L, MethodHandles.lookup().lookupClass()).a(68959510253851L);

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var3 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var4 ^ 134528422017690L;
      int var9 = x44.a<"i">(this, new Object[]{var6}, 7145691849331111744L, var4);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      int var10 = 0;
      int[] var8 = var10000;

      while (var10 < var9) {
         g7 var11 = (g7)this.e(var10);
         x44.a<"m">(this, 8783693848098137453L, var4).add(x44.a<"i">(var11, new Object[0], 7328816409459435145L, var4));
         var10++;
         if (var8 != null) {
            break;
         }
      }
   }

   public j1(int var1, long var2) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 104012317911846L;
      int var4 = (int)((var2 ^ 104012317911846L) >>> 32);
      int var5 = (int)((var2 ^ 104012317911846L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
      x44.a<"q">(this, new ArrayList(), -4058059696592856282L, var2);
      x44.a<"q">(this, false, -4543011572271498488L, var2);
   }

   protected int b(Object[] param1) {
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
      // 0c: ldc2_w 6446141514275190987
      // 0f: lload 2
      // 10: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: astore 4
      // 17: aload 0
      // 18: ldc2_w 6801998270279664365
      // 1b: lload 2
      // 1c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: aload 4
      // 23: ifnonnull 4d
      // 26: ifnull 53
      // 29: goto 36
      // 2c: ldc2_w 4762194947082857500
      // 2f: lload 2
      // 30: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: ldc2_w 6801998270279664365
      // 3a: lload 2
      // 3b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: goto 4d
      // 43: ldc2_w 4762194947082857500
      // 46: lload 2
      // 47: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: invokevirtual java/util/ArrayList.size ()I
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   void M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      x44.a<"q">(this, true, -5907649852250335752L, var2);
   }

   protected String F(Object[] var1) {
      Object var10000 = var1;
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];

      try {
         if (var3 > 0L) {
            if (var2 >= x44.a<"o">(this, 9133288721582875191L, var3).size()) {
               throw new IllegalArgumentException(x44.a<"s">(var2, 8796888957198489728L, var3));
            }

            var10000 = x44.a<"o">(this, 9133288721582875191L, var3).get(var2);
         }

         return (String)var10000;
      } catch (IllegalArgumentException var5) {
         throw x44.a<"s">(var5, 7119293544771652806L, var3);
      }
   }

   private static IllegalArgumentException b(IllegalArgumentException var0) {
      return var0;
   }
}
