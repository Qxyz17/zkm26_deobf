package com.zelix;

import java.lang.invoke.MethodHandles;

public class c6 extends jf implements _un {
   private String v;
   private String D;
   private static final long a = ess.a(8554998731016440172L, 1518995625453772422L, MethodHandles.lookup().lookupClass()).a(74830525244629L);

   public void m(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: ldc2_w 7702687477700315995
      // 16: lload 3
      // 17: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: astore 5
      // 1e: aload 0
      // 1f: aload 5
      // 21: ifnonnull 68
      // 24: ldc2_w 7995813109482955850
      // 27: lload 3
      // 28: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: ifnonnull 5a
      // 30: goto 3d
      // 33: ldc2_w 7921587234802055043
      // 36: lload 3
      // 37: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 2
      // 3f: ldc2_w 7995813109482955850
      // 42: lload 3
      // 43: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: aload 5
      // 4a: ifnull 72
      // 4d: goto 5a
      // 50: ldc2_w 7921587234802055043
      // 53: lload 3
      // 54: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: goto 68
      // 5e: ldc2_w 7921587234802055043
      // 61: lload 3
      // 62: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 2
      // 69: ldc2_w 7631961224999989767
      // 6c: lload 3
      // 6d: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: return
   }

   public c6(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 38527405858152L;
      super(var4, var1);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var4 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var2 ^ 6715907306961L;
      long var8 = var2 ^ 0L;
      long var10 = var2 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var2);
      int var13 = x44.a<"i">(this, new Object[]{var10}, 7145691849331111744L, var2);
      int var14 = 0;
      int[] var12 = var10000;

      label34: {
         while (var14 < var13) {
            try {
               if (var2 > 0L) {
                  var17 = this.e(var14);
                  if (var12 != null) {
                     break label34;
                  }

                  x44.a<"i">(var17, new Object[]{var8, this, var5}, 8818198965911889370L, var2);
                  var14++;
               }

               if (var12 == null) {
                  continue;
               }
            } catch (gj var15) {
               throw x44.a<"q">(var15, 8790856078871372691L, var2);
            }

            if (var2 >= 0L) {
               break;
            }
         }

         var17 = var4;
      }

      f_ var16 = (f_)var17;
      x44.a<"i">(
         var16, new Object[]{var6, x44.a<"m">(this, 8855925358759227482L, var2), x44.a<"m">(this, 9077683266793694743L, var2)}, 9059506839930888199L, var2
      );
   }

   private static gj a(gj var0) {
      return var0;
   }
}
