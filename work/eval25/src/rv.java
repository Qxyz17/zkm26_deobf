package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class rv {
   private boolean k;
   private int a;
   private int b;
   private List f;
   private List w = new ArrayList();
   private static final long c = ess.a(-2206541999248006468L, -2002434127620359749L, MethodHandles.lookup().lookupClass()).a(187551377144128L);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void A(int var1, rp var2, int var3, boolean var4, int var5) {
      long var6 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ c;
      long var8 = var6 ^ 131489090767062L;
      long var10 = var6 ^ 69245971242790L;
      int var12 = x44.a<"s">(5395036225616609952L, var6);

      label96: {
         label83: {
            try {
               if (var12 == 0) {
                  break label96;
               }

               if (!var4) {
                  break label83;
               }
            } catch (gj var19) {
               throw x44.a<"s">(var19, 5905005642086623364L, var6);
            }

            int var13 = this.W();
            this.a = (Integer)this.f.remove(this.f.size() - 1);

            int var22;
            label73: {
               label72:
               while (true) {
                  if (var13-- > 0) {
                     rp var14 = this.D(var10);

                     try {
                        var14.O(var2);
                        var2.x(var8, var14, var13);
                     } catch (gj var16) {
                        boolean var10001 = false;
                        throw x44.a<"s">(var16, 5905005642086623364L, var6);
                     }

                     do {
                        try {
                           var22 = var12;
                           if (var1 < 0) {
                              break label73;
                           }

                           if (var12 == 0) {
                              break label72;
                           }

                           if (var12 != 0) {
                              continue label72;
                           }
                        } catch (gj var20) {
                           boolean var24 = false;
                           throw x44.a<"s">(var20, 5905005642086623364L, var6);
                        }
                     } while (var3 <= 0);
                  }

                  var2.y();
                  this.c(var2);
                  this.k = true;
                  break;
               }

               try {
                  if (var3 < 0) {
                     break label96;
                  }

                  var22 = var12;
               } catch (gj var18) {
                  boolean var25 = false;
                  throw x44.a<"s">(var18, 5905005642086623364L, var6);
               }
            }

            try {
               if (var22 != 0) {
                  return;
               }
            } catch (gj var17) {
               boolean var26 = false;
               throw x44.a<"s">(var17, 5905005642086623364L, var6);
            }
         }

         try {
            this.a = (Integer)this.f.remove(this.f.size() - 1);
         } catch (gj var15) {
            boolean var27 = false;
            throw x44.a<"s">(var15, 5905005642086623364L, var6);
         }
      }

      this.k = false;
   }

   public void c(rp var1) {
      this.w.add(var1);
      this.b++;
   }

   public void q(Object[] var1) {
      this.w.clear();
      this.f.clear();
      this.b = 0;
      this.a = 0;
   }

   public rp D(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/rv.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 6300023098853481
      // 09: lload 1
      // 0a: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: iload 3
      // 12: ifeq 72
      // 15: dup
      // 16: getfield com/zelix/rv.b I
      // 19: bipush 1
      // 1a: isub
      // 1b: dup_x1
      // 1c: putfield com/zelix/rv.b I
      // 1f: aload 0
      // 20: getfield com/zelix/rv.a I
      // 23: if_icmpge 5e
      // 26: goto 33
      // 29: ldc2_w 1962353733914092109
      // 2c: lload 1
      // 2d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: aload 0
      // 34: aload 0
      // 35: getfield com/zelix/rv.f Ljava/util/List;
      // 38: aload 0
      // 39: getfield com/zelix/rv.f Ljava/util/List;
      // 3c: invokeinterface java/util/List.size ()I 1
      // 41: bipush 1
      // 42: isub
      // 43: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 48: checkcast java/lang/Integer
      // 4b: invokevirtual java/lang/Integer.intValue ()I
      // 4e: putfield com/zelix/rv.a I
      // 51: goto 5e
      // 54: ldc2_w 1962353733914092109
      // 57: lload 1
      // 58: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield com/zelix/rv.w Ljava/util/List;
      // 62: aload 0
      // 63: getfield com/zelix/rv.w Ljava/util/List;
      // 66: invokeinterface java/util/List.size ()I 1
      // 6b: bipush 1
      // 6c: isub
      // 6d: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 72: checkcast com/zelix/rp
      // 75: areturn
   }

   public rv() {
      this.f = new ArrayList();
      this.b = 0;
      this.a = 0;
   }

   public int W() {
      return this.b - this.a;
   }

   public void Z(rp var1) {
      this.f.add(this.a);
      this.a = this.b;
      var1.x();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void b(Object[] var1) {
      long var3 = (Long)var1[0];
      rp var2 = (rp)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 122368501502415L;
      int var7 = x44.a<"r">(-8919848084168848311L, var3);

      label41:
      while (this.b > this.a) {
         try {
            this.D(var5);
         } catch (gj var9) {
            boolean var10001 = false;
            throw x44.a<"r">(var9, -6981816468101601683L, var3);
         }

         while (true) {
            try {
               int var11 = var7;
               if (var3 > 0L) {
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
               throw x44.a<"r">(var8, -6981816468101601683L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      this.a = (Integer)this.f.remove(this.f.size() - 1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
