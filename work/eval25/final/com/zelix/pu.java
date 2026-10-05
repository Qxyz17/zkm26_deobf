package com.zelix;

import java.lang.invoke.MethodHandles;

public class pu extends py {
   i8[] p;
   int k;
   private static final long a = ess.a(5369091290159380273L, -6298840992421573954L, MethodHandles.lookup().lookupClass()).a(122430719184922L);

   public void i(Object[] var1) {
      i8[] var4 = (i8[])var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 77627562721141L;
      long var7 = var2 ^ 91017485118586L;
      x44.a<"i">(this, new Object[]{var5, var4}, -5969611291888118635L, var2);
      this.o();
      x44.a<"i">(this, new Object[]{var7}, -6284988750372155549L, var2);
   }

   public int m(Object[] var1) {
      i8 var2 = (i8)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 33005377291706L;
      long var7 = var3 ^ 22885626336619L;
      hk[] var9 = x44.a<"v">(3222984675049189538L, var3);

      Object var10000;
      label64: {
         label68: {
            try {
               var10000 = x44.a<"j">(this, 3942532533324250643L, var3);
               if (var9 != null) {
                  break label64;
               }

               if (var10000 != null) {
                  break label68;
               }
            } catch (gj var13) {
               throw x44.a<"v">(var13, 3189561213654248220L, var3);
            }

            int var10001 = (int)((double)x44.a<"j">(this, 2997671769332287412L, var3) * 1.5);
            Object[] var10004 = new Object[]{null, var7};
            var10004[0] = var10001;
            x44.a<"u">(this, x44.a<"v">(var10004, 3127893938003455195L, var3), 3942532533324250643L, var3);
            int var10 = 0;

            while (var10 < x44.a<"j">(this, 2997671769332287412L, var3)) {
               try {
                  if (var3 >= 0L) {
                     var10000 = x44.a<"j">(this, 3942532533324250643L, var3)
                        .put(x44.a<"j">(this, 2956325770531426543L, var3)[var10], x44.a<"j">(this, 3763502433407654099L, var3).R(var10, var5));
                     if (var9 != null) {
                        break label64;
                     }

                     var10++;
                  }

                  if (var9 == null) {
                     continue;
                  }
               } catch (gj var12) {
                  throw x44.a<"v">(var12, 3189561213654248220L, var3);
               }

               if (var3 >= 0L) {
                  break;
               }
            }
         }

         var10000 = x44.a<"j">(this, 3942532533324250643L, var3).get(var2);
      }

      Object var15 = var10000;

      try {
         if (var9 != null) {
            return (Integer)var15;
         }

         if (var15 == null) {
            return -1;
         }
      } catch (gj var11) {
         throw x44.a<"v">(var11, 3189561213654248220L, var3);
      }

      return (Integer)var15;
   }

   void p(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast [Lcom/zelix/i8;
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/pu.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 41637021835648
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 98325094636667
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w -1378291565509119801
      // 02d: lload 2
      // 02e: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 4
      // 035: arraylength
      // 036: istore 10
      // 038: new java/util/Vector
      // 03b: dup
      // 03c: iload 10
      // 03e: invokespecial java/util/Vector.<init> (I)V
      // 041: astore 11
      // 043: bipush 0
      // 044: istore 12
      // 046: astore 9
      // 048: iload 12
      // 04a: iload 10
      // 04c: if_icmpge 0a6
      // 04f: lload 2
      // 050: lconst_0
      // 051: lcmp
      // 052: iflt 11e
      // 055: aload 4
      // 057: aload 9
      // 059: ifnonnull 0f1
      // 05c: iload 12
      // 05e: aaload
      // 05f: lload 5
      // 061: bipush 1
      // 062: anewarray 2
      // 065: dup_x2
      // 066: dup_x2
      // 067: pop
      // 068: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: ldc2_w -1222232666810338647
      // 071: lload 2
      // 072: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: ifeq 09e
      // 07a: goto 087
      // 07d: ldc2_w -1430282772093244551
      // 080: lload 2
      // 081: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 11
      // 089: aload 4
      // 08b: iload 12
      // 08d: aaload
      // 08e: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 091: goto 09e
      // 094: ldc2_w -1430282772093244551
      // 097: lload 2
      // 098: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: iinc 12 1
      // 0a1: aload 9
      // 0a3: ifnull 048
      // 0a6: aload 0
      // 0a7: aload 11
      // 0a9: invokevirtual java/util/Vector.size ()I
      // 0ac: ldc2_w -1586152225951430703
      // 0af: lload 2
      // 0b0: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 0
      // 0b6: aload 0
      // 0b7: ldc2_w -1586152225951430703
      // 0ba: lload 2
      // 0bb: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: anewarray 125
      // 0c3: ldc2_w -1629178523335323510
      // 0c6: lload 2
      // 0c7: invokedynamic p (Ljava/lang/Object;[Lcom/zelix/i8;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: aload 11
      // 0ce: aload 0
      // 0cf: ldc2_w -1629178523335323510
      // 0d2: lload 2
      // 0d3: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: ldc2_w -898359213860729598
      // 0db: lload 2
      // 0dc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: aload 0
      // 0e2: ldc2_w -1629178523335323510
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 108
      // 0eb: lload 2
      // 0ec: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: ldc2_w -1415259983821051453
      // 0f4: lload 2
      // 0f5: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: aload 0
      // 0fb: aconst_null
      // 0fc: ldc2_w -660986736997122442
      // 0ff: lload 2
      // 100: invokedynamic p (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: aload 0
      // 106: lload 7
      // 108: bipush 1
      // 109: anewarray 2
      // 10c: dup_x2
      // 10d: dup_x2
      // 10e: pop
      // 10f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112: bipush 0
      // 113: swap
      // 114: aastore
      // 115: ldc2_w -1540983661583707648
      // 118: lload 2
      // 119: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: return
   }

   public boolean a(Object[] param1) {
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
      // 0c: getstatic com/zelix/pu.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -2872992076896910279
      // 15: lload 2
      // 16: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -2537810294622301921
      // 21: lload 2
      // 22: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 54
      // 2c: aload 0
      // 2d: ldc2_w -2521280190624206033
      // 30: lload 2
      // 31: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmpge 57
      // 39: goto 46
      // 3c: ldc2_w -2821264821253546105
      // 3f: lload 2
      // 40: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -2821264821253546105
      // 4d: lload 2
      // 4e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public pu(String var1, h8 var2, i8[] var3, long var4, _uo var6) {
      var4 = a ^ var4;
      long var7 = var4 ^ 113878288623630L;
      long var9 = var4 ^ 79022128658717L;
      super(var1, var9, var2, var6);
      x44.a<"j">(this, new Object[]{var7, var3}, -5017978513934449682L, var4);
   }

   public String I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 73460101214087L;
      i8[] var10000 = x44.a<"k">(this, 1425293922056268334L, var2);
      int var10003 = x44.a<"k">(this, 1341494960072466245L, var2);
      x44.a<"t">(this, var10003 + 1, 1341494960072466245L, var2);
      return var10000[var10003].w(var4);
   }

   public i8 z(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      return x44.a<"n">(this, 7663582909793735603L, var3)[var2];
   }

   private static gj a(gj var0) {
      return var0;
   }
}
