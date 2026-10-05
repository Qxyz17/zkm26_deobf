package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class lv {
   private int g;
   private int F;
   private List S;
   private List H;
   private boolean y;
   private static final long a = ess.a(2529543092368959914L, 7911693594572113141L, MethodHandles.lookup().lookupClass()).a(29847988555984L);

   public void I(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      var3 = a ^ var3;
      x44.a<"m">(this, -725950621199841270L, var3).add(var2);
      x44.a<"r">(this, x44.a<"m">(this, -761459474757879150L, var3) + 1, -761459474757879150L, var3);
   }

   public void d(Object[] var1) {
      az var2 = (az)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"m">(this, -7154505082200329755L, var3).add(x44.a<"m">(this, -9082150706330333272L, var3));
      x44.a<"r">(this, x44.a<"m">(this, -9165156956706042062L, var3), -9082150706330333272L, var3);
      x44.a<"i">(var2, new Object[0], -7473587256201512364L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void x(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 30656928725554L;
      int var7 = x44.a<"q">(-395211074369335007L, var3);

      label41:
      while (x44.a<"m">(this, -2035962457087906750L, var3) > x44.a<"m">(this, -2124110584328327976L, var3)) {
         try {
            x44.a<"i">(this, new Object[]{var5}, -2277149910106125065L, var3);
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"q">(var9, -359706069554816118L, var3);
         }

         while (true) {
            try {
               int var11 = var7;
               if (var3 >= 0L) {
                  if (var7 == 0) {
                     return;
                  }

                  var11 = var7;
               }

               if (var11 != 0) {
                  break;
               }
            } catch (gj var8) {
               boolean var12 = false;
               throw x44.a<"q">(var8, -359706069554816118L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"r">(
         this, (Integer)x44.a<"m">(this, -16313279767866731L, var3).remove(x44.a<"m">(this, -16313279767866731L, var3).size() - 1), -2124110584328327976L, var3
      );
   }

   public az G(Object[] param1) {
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
      // 0c: getstatic com/zelix/lv.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 1316954710208383078
      // 15: lload 2
      // 16: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: iload 4
      // 20: ifne b0
      // 23: dup
      // 24: ldc2_w 728911750037800417
      // 27: lload 2
      // 28: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: bipush 1
      // 2e: isub
      // 2f: dup_x1
      // 30: ldc2_w 728911750037800417
      // 33: lload 2
      // 34: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: aload 0
      // 3a: ldc2_w 803601283999368571
      // 3d: lload 2
      // 3e: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: if_icmpge 90
      // 46: goto 53
      // 49: ldc2_w 1342427337425220137
      // 4c: lload 2
      // 4d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: aload 0
      // 55: ldc2_w 1613793459241646902
      // 58: lload 2
      // 59: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 0
      // 5f: ldc2_w 1613793459241646902
      // 62: lload 2
      // 63: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: invokeinterface java/util/List.size ()I 1
      // 6d: bipush 1
      // 6e: isub
      // 6f: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 74: checkcast java/lang/Integer
      // 77: invokevirtual java/lang/Integer.intValue ()I
      // 7a: ldc2_w 803601283999368571
      // 7d: lload 2
      // 7e: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: goto 90
      // 86: ldc2_w 1342427337425220137
      // 89: lload 2
      // 8a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 0
      // 91: ldc2_w 765535220337686393
      // 94: lload 2
      // 95: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: aload 0
      // 9b: ldc2_w 765535220337686393
      // 9e: lload 2
      // 9f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: invokeinterface java/util/List.size ()I 1
      // a9: bipush 1
      // aa: isub
      // ab: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // b0: checkcast com/zelix/az
      // b3: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void J(Object[] var1) {
      az var5 = (az)var1[0];
      long var3 = (Long)var1[1];
      boolean var2 = (Boolean)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 111696165527420L;
      long var8 = var3 ^ 62044156665871L;
      long var10 = var3 ^ 102738236437506L;
      long var12 = var3 ^ 82075981230864L;
      long var14 = var3 ^ 47140102990939L;
      int var16 = x44.a<"w">(-7013249683757661045L, var3);

      label96: {
         label83: {
            try {
               if (var16 != 0) {
                  break label96;
               }

               if (!var2) {
                  break label83;
               }
            } catch (gj var23) {
               throw x44.a<"w">(var23, -7040129745920557372L, var3);
            }

            int var17 = x44.a<"o">(this, new Object[]{var10}, -6984169209142353191L, var3);
            x44.a<"t">(
               this,
               (Integer)x44.a<"k">(this, -7311464944031172645L, var3).remove(x44.a<"k">(this, -7311464944031172645L, var3).size() - 1),
               -8661588824714245738L,
               var3
            );

            int var27;
            label73: {
               label72:
               while (true) {
                  if (var17-- > 0) {
                     az var18 = x44.a<"o">(this, new Object[]{var6}, -8850824171927393863L, var3);

                     try {
                        x44.a<"o">(var18, new Object[]{var14, var5}, -8847947818082995007L, var3);
                        Object[] var10005 = new Object[]{null, null, var17};
                        var10005[1] = var12;
                        var10005[0] = var18;
                        x44.a<"o">(var5, var10005, -7192076071044171847L, var3);
                     } catch (gj var20) {
                        boolean var10001 = false;
                        throw x44.a<"w">(var20, -7040129745920557372L, var3);
                     }

                     do {
                        try {
                           var27 = var16;
                           if (var3 <= 0L) {
                              break label73;
                           }

                           if (var16 != 0) {
                              break label72;
                           }

                           if (var16 == 0) {
                              continue label72;
                           }
                        } catch (gj var24) {
                           boolean var29 = false;
                           throw x44.a<"w">(var24, -7040129745920557372L, var3);
                        }
                     } while (var3 <= 0L);
                  }

                  x44.a<"o">(var5, new Object[0], -7398284952247966283L, var3);
                  x44.a<"o">(this, new Object[]{var8, var5}, -9219413067384092584L, var3);
                  x44.a<"t">(this, true, -8973815026934992714L, var3);
                  break;
               }

               try {
                  if (var3 < 0L) {
                     break label96;
                  }

                  var27 = var16;
               } catch (gj var22) {
                  boolean var30 = false;
                  throw x44.a<"w">(var22, -7040129745920557372L, var3);
               }
            }

            try {
               if (var27 == 0) {
                  return;
               }
            } catch (gj var21) {
               boolean var31 = false;
               throw x44.a<"w">(var21, -7040129745920557372L, var3);
            }
         }

         try {
            x44.a<"t">(
               this,
               (Integer)x44.a<"k">(this, -7311464944031172645L, var3).remove(x44.a<"k">(this, -7311464944031172645L, var3).size() - 1),
               -8661588824714245738L,
               var3
            );
         } catch (gj var19) {
            boolean var32 = false;
            throw x44.a<"w">(var19, -7040129745920557372L, var3);
         }
      }

      x44.a<"t">(this, false, -8973815026934992714L, var3);
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -6817423195917898081L, var2) - x44.a<"h">(this, -6892530553157439995L, var2);
   }

   public lv(long var1) {
      var1 = a ^ var1;
      super();
      x44.a<"q">(this, new ArrayList(), 8279843977356791553L, var1);
      x44.a<"q">(this, new ArrayList(), 7934507573258421070L, var1);
      x44.a<"q">(this, 0, 8243220502502047129L, var1);
      x44.a<"q">(this, 0, 8313265704037121283L, var1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
