package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class _ft {
   private List r;
   private int b;
   private boolean Q;
   private List v;
   private int R;
   private static final long a = ess.a(-2978296159030760110L, -5963504738586836634L, MethodHandles.lookup().lookupClass()).a(5124245711236L);

   public void H(Object[] var1) {
      long var2 = (Long)var1[0];
      t9 var4 = (t9)var1[1];
      var2 = a ^ var2;
      x44.a<"l">(this, -7215608001372908490L, var2).add(var4);
      x44.a<"s">(this, x44.a<"l">(this, -9045762760689827033L, var2) + 1, -9045762760689827033L, var2);
   }

   public t9 a(Object[] param1) {
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
      // 0c: getstatic com/zelix/_ft.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -9070795450894047967
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: iload 4
      // 20: ifeq b0
      // 23: dup
      // 24: ldc2_w -9029251352783731744
      // 27: lload 2
      // 28: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: bipush 1
      // 2e: isub
      // 2f: dup_x1
      // 30: ldc2_w -9029251352783731744
      // 33: lload 2
      // 34: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: aload 0
      // 3a: ldc2_w -8880095336783924445
      // 3d: lload 2
      // 3e: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: if_icmpge 90
      // 46: goto 53
      // 49: ldc2_w -7424067355548454739
      // 4c: lload 2
      // 4d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: aload 0
      // 55: ldc2_w -6924926886662298074
      // 58: lload 2
      // 59: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 0
      // 5f: ldc2_w -6924926886662298074
      // 62: lload 2
      // 63: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: invokeinterface java/util/List.size ()I 1
      // 6d: bipush 1
      // 6e: isub
      // 6f: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 74: checkcast java/lang/Integer
      // 77: invokevirtual java/lang/Integer.intValue ()I
      // 7a: ldc2_w -8880095336783924445
      // 7d: lload 2
      // 7e: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: goto 90
      // 86: ldc2_w -7424067355548454739
      // 89: lload 2
      // 8a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 0
      // 91: ldc2_w -7270397727835450127
      // 94: lload 2
      // 95: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: aload 0
      // 9b: ldc2_w -7270397727835450127
      // 9e: lload 2
      // 9f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: invokeinterface java/util/List.size ()I 1
      // a9: bipush 1
      // aa: isub
      // ab: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // b0: checkcast com/zelix/t9
      // b3: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void A(Object[] var1) {
      t9 var4 = (t9)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 3830761208499L;
      boolean var7 = x44.a<"w">(-3587563139525678839L, var2);

      label41:
      while (x44.a<"k">(this, -3559600216419201080L, var2) > x44.a<"k">(this, -3968808602087031029L, var2)) {
         try {
            x44.a<"o">(this, new Object[]{var5}, -2900357720299657001L, var2);
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"w">(var9, -3111969893276730235L, var2);
         }

         while (true) {
            try {
               boolean var11 = var7;
               if (var2 > 0L) {
                  if (!var7) {
                     return;
                  }

                  var11 = var7;
               }

               if (var11) {
                  break;
               }
            } catch (gj var8) {
               boolean var12 = false;
               throw x44.a<"w">(var8, -3111969893276730235L, var2);
            }

            if (var2 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"t">(
         this,
         (Integer)x44.a<"k">(this, -3184658042654070258L, var2).remove(x44.a<"k">(this, -3184658042654070258L, var2).size() - 1),
         -3968808602087031029L,
         var2
      );
   }

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"h">(this, 5240250674566022994L, var2).clear();
      x44.a<"h">(this, 5496344688883201413L, var2).clear();
      x44.a<"w">(this, 0, 5841978282845769795L, var2);
      x44.a<"w">(this, 0, 6296269391733055616L, var2);
   }

   public _ft(long var1) {
      var1 = a ^ var1;
      super();
      x44.a<"p">(this, new ArrayList(), -1986587173011264635L, var1);
      x44.a<"p">(this, new ArrayList(), -2264794825562891950L, var1);
      x44.a<"p">(this, 0, -160505541670257516L, var1);
      x44.a<"p">(this, 0, -308510989547254697L, var1);
   }

   public int A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -6823341384380424161L, var2) - x44.a<"l">(this, -6396051805432704804L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void O(Object[] var1) {
      int var2 = (Integer)var1[0];
      t9 var6 = (t9)var1[1];
      int var4 = (Integer)var1[2];
      boolean var5 = (Boolean)var1[3];
      int var3 = (Integer)var1[4];
      long var7 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 74523209393658L;
      long var11 = var7 ^ 8526120372892L;
      long var13 = var7 ^ 135605039678981L;
      long var15 = var7 ^ 37781837727426L;
      long var17 = var7 ^ 9723556911085L;
      boolean var19 = x44.a<"q">(-6295505026555131871L, var7);

      label96: {
         label83: {
            try {
               if (var19) {
                  break label96;
               }

               if (!var5) {
                  break label83;
               }
            } catch (gj var26) {
               throw x44.a<"q">(var26, -6312225953450377165L, var7);
            }

            int var20 = x44.a<"i">(this, new Object[]{var9}, -6047711492281038034L, var7);
            x44.a<"r">(
               this,
               (Integer)x44.a<"m">(this, -5801856447422523720L, var7).remove(x44.a<"m">(this, -5801856447422523720L, var7).size() - 1),
               -5450044168572828739L,
               var7
            );

            boolean var29;
            label73: {
               label72:
               while (true) {
                  if (var20-- > 0) {
                     t9 var21 = x44.a<"i">(this, new Object[]{var13}, -6122181710371400607L, var7);

                     try {
                        x44.a<"i">(var21, new Object[]{var6, var17}, -6210959743664133831L, var7);
                        Object[] var10005 = new Object[]{null, null, var11};
                        var10005[1] = var20;
                        var10005[0] = var21;
                        x44.a<"i">(var6, var10005, -5786505525724424832L, var7);
                     } catch (gj var23) {
                        boolean var10001 = false;
                        throw x44.a<"q">(var23, -6312225953450377165L, var7);
                     }

                     do {
                        try {
                           var29 = var19;
                           if (var4 > 0) {
                              break label73;
                           }

                           if (var19) {
                              break label72;
                           }

                           if (!var19) {
                              continue label72;
                           }
                        } catch (gj var27) {
                           boolean var31 = false;
                           throw x44.a<"q">(var27, -6312225953450377165L, var7);
                        }
                     } while (var4 > 0);
                  }

                  x44.a<"i">(var6, new Object[0], -6076652848141266512L, var7);
                  x44.a<"i">(this, new Object[]{var15, var6}, -6081742641890671034L, var7);
                  x44.a<"r">(this, true, -5990711296143369447L, var7);
                  break;
               }

               try {
                  if (var3 <= 0) {
                     break label96;
                  }

                  var29 = var19;
               } catch (gj var25) {
                  boolean var32 = false;
                  throw x44.a<"q">(var25, -6312225953450377165L, var7);
               }
            }

            try {
               if (!var29) {
                  return;
               }
            } catch (gj var24) {
               boolean var33 = false;
               throw x44.a<"q">(var24, -6312225953450377165L, var7);
            }
         }

         try {
            x44.a<"r">(
               this,
               (Integer)x44.a<"m">(this, -5801856447422523720L, var7).remove(x44.a<"m">(this, -5801856447422523720L, var7).size() - 1),
               -5450044168572828739L,
               var7
            );
         } catch (gj var22) {
            boolean var34 = false;
            throw x44.a<"q">(var22, -6312225953450377165L, var7);
         }
      }

      x44.a<"r">(this, false, -5990711296143369447L, var7);
   }

   public void G(Object[] var1) {
      t9 var4 = (t9)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"o">(this, 38744526671165770L, var2).add(x44.a<"o">(this, 1994956137978178639L, var2));
      x44.a<"p">(this, x44.a<"o">(this, 2152076194191039628L, var2), 1994956137978178639L, var2);
      x44.a<"k">(var4, new Object[0], 2159357128412452798L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
