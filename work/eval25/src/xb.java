package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class xb extends x3 implements _zv, _u0 {
   private mx Y;
   private static final long a = ess.a(-800495631787968440L, 5061463777903604481L, MethodHandles.lookup().lookupClass()).a(137632091054718L);

   void V(DataOutputStream param1, long param2, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 6273785328803656433
      // 03: lload 2
      // 04: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: aload 1
      // 0a: ldc2_w 6196657204675165765
      // 0d: lload 2
      // 0e: invokedynamic o (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13: invokevirtual com/zelix/w5.l ()I
      // 16: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 19: astore 5
      // 1b: aload 4
      // 1d: aload 0
      // 1e: ldc2_w 6252191348843408458
      // 21: lload 2
      // 22: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2c: checkcast com/zelix/mx
      // 2f: checkcast com/zelix/mx
      // 32: astore 6
      // 34: aload 5
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: iflt 6f
      // 3c: ifnonnull 67
      // 3f: aload 6
      // 41: ifnull 72
      // 44: goto 51
      // 47: ldc2_w 5262495469435050765
      // 4a: lload 2
      // 4b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 1
      // 52: aload 6
      // 54: invokevirtual com/zelix/mx.B ()I
      // 57: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5a: goto 67
      // 5d: ldc2_w 5262495469435050765
      // 60: lload 2
      // 61: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: lload 2
      // 68: lconst_0
      // 69: lcmp
      // 6a: ifle 83
      // 6d: aload 5
      // 6f: ifnull 90
      // 72: aload 1
      // 73: aload 0
      // 74: ldc2_w 6252191348843408458
      // 77: lload 2
      // 78: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: invokevirtual com/zelix/mx.B ()I
      // 80: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 83: goto 90
      // 86: ldc2_w 5262495469435050765
      // 89: lload 2
      // 8a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: return
   }

   void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2880155614980295748L, var1).l());
      var3.writeShort(x44.a<"k">(this, -2648840365035789901L, var1).B());
   }

   public xb(int var1, long var2, _83 var4, mx var5) {
      var2 = a ^ var2;
      super(var1, var4);
      x44.a<"t">(this, var5, -3389771215382287749L, var2);
   }

   public String N(long var1) {
      long var3 = var1 ^ 26473351108015L;
      return x44.a<"m">(this, new Object[]{var3}, -4483249722554227995L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void g(Object[] var1) {
      Set var3 = (Set)var1[0];
      long var4 = (Long)var1[1];
      Set var6 = (Set)var1[2];
      Set var7 = (Set)var1[3];
      Set var2 = (Set)var1[4];
      var4 = a ^ var4;
      long var8 = var4 ^ 50742915238487L;
      long var10001 = var4 ^ 6088888460158L;
      int var10 = (int)((var4 ^ 6088888460158L) >>> 48);
      int var11 = (int)((var4 ^ 6088888460158L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var4 ^ 41466710280860L;
      long var15 = var4 ^ 67144934593479L;
      Object var18 = x44.a<"u">(new Object[]{var15, x44.a<"m">(this, new Object[]{var8}, -7047999189979415267L, var4)}, -9008558518036627434L, var4);
      String[] var10000 = x44.a<"u">(-7348877467215134750L, var4);
      hz var19 = x44.a<"m">(this.j, new Object[0], -8712979420486305592L, var4);
      String[] var17 = var10000;

      label63: {
         try {
            boolean var27 = var19.U((short)var10, (char)var11, var12);
            if (var17 != null) {
               return;
            }

            if (!var27) {
               break label63;
            }
         } catch (gj var25) {
            throw x44.a<"u">(var25, -8927436445562071522L, var4);
         }

         ArrayList var20 = new ArrayList(var18.size());

         label49:
         for (hz var22 : var18) {
            try {
               var20.add((hy)x44.a<"m">(this, new Object[]{var13, var22}, -8845350232362081236L, var4));
            } catch (gj var23) {
               boolean var30 = false;
               throw x44.a<"u">(var23, -8927436445562071522L, var4);
            }

            while (true) {
               try {
                  var10000 = var17;
                  if (var4 >= 0L) {
                     if (var17 != null) {
                        return;
                     }

                     var10000 = var17;
                  }

                  if (var10000 == null) {
                     break;
                  }
               } catch (gj var24) {
                  boolean var31 = false;
                  throw x44.a<"u">(var24, -8927436445562071522L, var4);
               }

               if (var4 > 0L) {
                  break label49;
               }
            }
         }

         var18 = var20;
      }

      var6.addAll((Collection)var18);
   }

   public String c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -7175359947432646942L, var2).u();
   }

   public void Q(Object[] var1) {
      Set var5 = (Set)var1[0];
      Set var2 = (Set)var1[1];
      Set var7 = (Set)var1[2];
      Set var6 = (Set)var1[3];
      long var3 = (Long)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 97250349577999L;
      long var10 = var3 ^ 51010236446537L;
      List var12 = x44.a<"u">(new Object[]{x44.a<"m">(this, new Object[]{var8}, -2060383358391467963L, var3), var10}, -320895882210870943L, var3);
      var2.addAll(var12);
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -6799946151540505536
      // 1e: lload 6
      // 20: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 8
      // 27: aload 0
      // 28: aload 8
      // 2a: ifnonnull 58
      // 2d: ldc2_w -6884467387197416709
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -4631556136376095300
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -4631556136376095300
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -6884467387197416709
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public mx n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 3773223953810624211L, var2);
   }

   void f(Object[] var1) {
      HashMap var2 = (HashMap)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 9396766643935L;
      String var7 = x44.a<"l">(this, 971195730907019252L, var3).u();
      String var8 = x44.a<"p">(var7, var2, var5, 770358980404282487L, var3);

      try {
         if (var8 != var7) {
            x44.a<"l">(this, 971195730907019252L, var3).v(var8);
         }
      } catch (gj var9) {
         throw x44.a<"p">(var9, 1348401510169772211L, var3);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
