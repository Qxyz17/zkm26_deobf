package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class l7a {
   private List Q;
   private int W;
   private List T = new ArrayList();
   private int I;
   private boolean f;
   private static final long a = prr.a(6398639800856286308L, -5315289816304316017L, MethodHandles.lookup().lookupClass()).a(80122822693159L);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void C(Object[] var1) {
      long var2 = (Long)var1[0];
      zn var4 = (zn)var1[1];
      var2 = a ^ var2;
      int var5 = (int)((var2 ^ 42721336027283L) >>> 32);
      long var6 = (var2 ^ 42721336027283L) << 32 >>> 32;
      int[] var8 = m44.a<"i">(-3394224319206963029L, var2);

      label41:
      while (this.I > this.W) {
         try {
            this.R(var5, var6);
         } catch (n9 var10) {
            boolean var10001 = false;
            throw m44.a<"i">(var10, -3498290933255532315L, var2);
         }

         while (true) {
            try {
               int[] var12 = var8;
               if (var2 > 0L) {
                  if (var8 != null) {
                     return;
                  }

                  var12 = var8;
               }

               if (var12 == null) {
                  break;
               }
            } catch (n9 var9) {
               boolean var13 = false;
               throw m44.a<"i">(var9, -3498290933255532315L, var2);
            }

            if (var2 > 0L) {
               break label41;
            }
         }
      }

      this.W = (Integer)this.Q.remove(this.Q.size() - 1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void K(zn var1, boolean var2, long var3) {
      var3 = a ^ var3;
      int var5 = (int)((var3 ^ 49160649161539L) >>> 32);
      long var6 = (var3 ^ 49160649161539L) << 32 >>> 32;
      long var10001 = var3 ^ 99011448050174L;
      int var8 = (int)((var3 ^ 99011448050174L) >>> 48);
      int var9 = (int)((var3 ^ 99011448050174L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      int[] var11 = m44.a<"i">(-8992210043279238277L, var3);

      label96: {
         label83: {
            try {
               if (var11 != null) {
                  break label96;
               }

               if (!var2) {
                  break label83;
               }
            } catch (n9 var18) {
               throw m44.a<"i">(var18, -7159711295802129611L, var3);
            }

            int var12 = this.N();
            this.W = (Integer)this.Q.remove(this.Q.size() - 1);

            int[] var22;
            label73: {
               label72:
               while (true) {
                  if (var12-- > 0) {
                     zn var13 = this.R(var5, var6);

                     try {
                        var13.m(var1);
                        var1.w((char)var8, var9, var13, var12, var10);
                     } catch (n9 var15) {
                        boolean var24 = false;
                        throw m44.a<"i">(var15, -7159711295802129611L, var3);
                     }

                     do {
                        try {
                           var22 = var11;
                           if (var3 < 0L) {
                              break label73;
                           }

                           if (var11 != null) {
                              break label72;
                           }

                           if (var11 == null) {
                              continue label72;
                           }
                        } catch (n9 var19) {
                           boolean var25 = false;
                           throw m44.a<"i">(var19, -7159711295802129611L, var3);
                        }
                     } while (var3 < 0L);
                  }

                  var1.z();
                  this.U(var1);
                  this.f = true;
                  break;
               }

               try {
                  if (var3 < 0L) {
                     break label96;
                  }

                  var22 = var11;
               } catch (n9 var17) {
                  boolean var26 = false;
                  throw m44.a<"i">(var17, -7159711295802129611L, var3);
               }
            }

            try {
               if (var22 == null) {
                  return;
               }
            } catch (n9 var16) {
               boolean var27 = false;
               throw m44.a<"i">(var16, -7159711295802129611L, var3);
            }
         }

         try {
            this.W = (Integer)this.Q.remove(this.Q.size() - 1);
         } catch (n9 var14) {
            boolean var28 = false;
            throw m44.a<"i">(var14, -7159711295802129611L, var3);
         }
      }

      this.f = false;
   }

   public void j(Object[] var1) {
      this.T.clear();
      this.Q.clear();
      this.I = 0;
      this.W = 0;
   }

   public int N() {
      return this.I - this.W;
   }

   public void T(zn var1) {
      this.Q.add(this.W);
      this.W = this.I;
      var1.n();
   }

   public zn R(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: lload 2
      // 06: bipush 32
      // 08: lshl
      // 09: bipush 32
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/l7a.a J
      // 10: lxor
      // 11: lstore 4
      // 13: ldc2_w -8090329810576467977
      // 16: lload 4
      // 18: invokedynamic m (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: astore 6
      // 1f: aload 0
      // 20: aload 6
      // 22: ifnonnull 84
      // 25: dup
      // 26: getfield com/zelix/l7a.I I
      // 29: bipush 1
      // 2a: isub
      // 2b: dup_x1
      // 2c: putfield com/zelix/l7a.I I
      // 2f: aload 0
      // 30: getfield com/zelix/l7a.W I
      // 33: if_icmpge 70
      // 36: goto 44
      // 39: ldc2_w -8057071676721016903
      // 3c: lload 4
      // 3e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: getfield com/zelix/l7a.Q Ljava/util/List;
      // 49: aload 0
      // 4a: getfield com/zelix/l7a.Q Ljava/util/List;
      // 4d: invokeinterface java/util/List.size ()I 1
      // 52: bipush 1
      // 53: isub
      // 54: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 59: checkcast java/lang/Integer
      // 5c: invokevirtual java/lang/Integer.intValue ()I
      // 5f: putfield com/zelix/l7a.W I
      // 62: goto 70
      // 65: ldc2_w -8057071676721016903
      // 68: lload 4
      // 6a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/zelix/l7a.T Ljava/util/List;
      // 74: aload 0
      // 75: getfield com/zelix/l7a.T Ljava/util/List;
      // 78: invokeinterface java/util/List.size ()I 1
      // 7d: bipush 1
      // 7e: isub
      // 7f: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 84: checkcast com/zelix/zn
      // 87: areturn
   }

   public l7a() {
      this.Q = new ArrayList();
      this.I = 0;
      this.W = 0;
   }

   public void U(zn var1) {
      this.T.add(var1);
      this.I++;
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
