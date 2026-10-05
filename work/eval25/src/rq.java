package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class rq implements Serializable, Comparable {
   private w8 u;
   private w8 L;
   private w8 x;
   private static final long a = ess.a(375858856034072615L, 4424129135782503916L, MethodHandles.lookup().lookupClass()).a(268306599547774L);

   public List Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 86802718682583L;
      String var10000 = x44.a<"t">(7642034813278384905L, var2);
      ArrayList var7 = new ArrayList(x44.a<"h">(this, 7619498164801519632L, var2).size());
      String var6 = var10000;

      for (w8 var9 : x44.a<"h">(this, 7619498164801519632L, var2)) {
         do {
            try {
               String var10001 = var6;
               if (var2 > 0L) {
                  if (var6 != null) {
                     return var7;
                  }

                  var10001 = x44.a<"l">(var9, new Object[]{var4}, 7783018900682604781L, var2);
               }

               var7.add(var10001);
               if (var6 == null) {
                  break;
               }
            } catch (gj var10) {
               throw x44.a<"t">(var10, 8243686971773295896L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return var7;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = a ^ 88762720958657L;
      String var4 = x44.a<"v">(2591781456161618675L, var2);

      label27: {
         try {
            boolean var10000 = var1 instanceof rq;
            if (var4 != null) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (gj var6) {
            throw x44.a<"v">(var6, 4295686597716038882L, var2);
         }

         return false;
      }

      rq var5 = (rq)var1;
      return x44.a<"j">(this, 2326048299614276074L, var2).equals(x44.a<"j">(var5, 2326048299614276074L, var2));
   }

   public boolean z(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return x44.a<"k">(this, 8780993794878120469L, var2).contains(var4);
   }

   public rq(w8 var1, long var2, w8 var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 132594072136946L;
      super();
      String var10000 = x44.a<"w">(-4537693815658719230L, var2);
      x44.a<"t">(this, x44.a<"w">(new Object[]{var5}, -4454321084053881560L, var2), -4416117404217578725L, var2);
      x44.a<"k">(this, -4416117404217578725L, var2).addAll(var1);
      x44.a<"t">(this, var4, -4232236337588855155L, var2);
      x44.a<"t">(this, x44.a<"w">(new Object[]{var5}, -4454321084053881560L, var2), -4567707280496799012L, var2);
      String var7 = var10000;

      for (w8 var9 : x44.a<"k">(this, -4416117404217578725L, var2)) {
         x44.a<"k">(this, -4567707280496799012L, var2).addAll(var9);
         if (var7 != null) {
            break;
         }
      }
   }

   public boolean L(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"h">(this, -2098840172830068577L, var3).contains(var2);
   }

   public Set p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"w">(x44.a<"k">(this, 6324974264160058987L, var2), 6051949677846374480L, var2);
   }

   public Set z(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var3 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      return x44.a<"p">(x44.a<"l">(this, 108953519436388938L, var5), 165439111997553127L, var5);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 992493693491L;
      return x44.a<"h">(this, 8265680673715608344L, var1).hashCode();
   }

   public int Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 4114157026377196241L, var2).size();
   }

   public w8 U(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/rq
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/rq.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 26513417646537
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 6646678695784891705
      // 26: lload 2
      // 27: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: lload 5
      // 2e: bipush 1
      // 2f: anewarray 202
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w 6851226381098541075
      // 3e: lload 2
      // 3f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: astore 8
      // 46: astore 7
      // 48: aload 4
      // 4a: ldc2_w 6885348609491367456
      // 4d: lload 2
      // 4e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: astore 9
      // 55: aload 0
      // 56: ldc2_w 6885348609491367456
      // 59: lload 2
      // 5a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokeinterface com/zelix/w8.iterator ()Ljava/util/Iterator; 1
      // 64: astore 10
      // 66: aload 10
      // 68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6d: ifeq c8
      // 70: aload 10
      // 72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 77: checkcast com/zelix/w8
      // 7a: astore 11
      // 7c: aload 9
      // 7e: aload 7
      // 80: ifnonnull ca
      // 83: aload 11
      // 85: invokeinterface com/zelix/w8.contains (Ljava/lang/Object;)Z 2
      // 8a: aload 7
      // 8c: ifnonnull c2
      // 8f: goto 9c
      // 92: ldc2_w 4924471500953234216
      // 95: lload 2
      // 96: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: ifne c3
      // 9f: goto ac
      // a2: ldc2_w 4924471500953234216
      // a5: lload 2
      // a6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: aload 8
      // ae: aload 11
      // b0: invokeinterface com/zelix/w8.add (Ljava/lang/Object;)Z 2
      // b5: goto c2
      // b8: ldc2_w 4924471500953234216
      // bb: lload 2
      // bc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: pop
      // c3: aload 7
      // c5: ifnull 66
      // c8: aload 8
      // ca: areturn
   }

   public w8 A(Object[] param1) {
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
      // 004: checkcast com/zelix/rq
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/rq.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 6433411931846
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -922495984627946954
      // 025: lload 3
      // 026: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: lload 5
      // 02d: bipush 1
      // 02e: anewarray 202
      // 031: dup_x2
      // 032: dup_x2
      // 033: pop
      // 034: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 037: bipush 0
      // 038: swap
      // 039: aastore
      // 03a: ldc2_w -1145198685680480484
      // 03d: lload 3
      // 03e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: astore 8
      // 045: astore 7
      // 047: aload 0
      // 048: ldc2_w -1116134249639257809
      // 04b: lload 3
      // 04c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 7
      // 053: ifnonnull 0b4
      // 056: invokeinterface com/zelix/w8.size ()I 1
      // 05b: aload 2
      // 05c: ldc2_w -1116134249639257809
      // 05f: lload 3
      // 060: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokeinterface com/zelix/w8.size ()I 1
      // 06a: if_icmple 09d
      // 06d: goto 07a
      // 070: ldc2_w -1488402868989426649
      // 073: lload 3
      // 074: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 2
      // 07b: ldc2_w -1116134249639257809
      // 07e: lload 3
      // 07f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: astore 9
      // 086: aload 0
      // 087: ldc2_w -1116134249639257809
      // 08a: lload 3
      // 08b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: lload 3
      // 091: lconst_0
      // 092: lcmp
      // 093: ifle 0a7
      // 096: astore 10
      // 098: aload 7
      // 09a: ifnull 0c2
      // 09d: aload 0
      // 09e: ldc2_w -1116134249639257809
      // 0a1: lload 3
      // 0a2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: goto 0b4
      // 0aa: ldc2_w -1488402868989426649
      // 0ad: lload 3
      // 0ae: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: astore 9
      // 0b6: aload 2
      // 0b7: ldc2_w -1116134249639257809
      // 0ba: lload 3
      // 0bb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: astore 10
      // 0c2: aload 9
      // 0c4: invokeinterface com/zelix/w8.iterator ()Ljava/util/Iterator; 1
      // 0c9: astore 11
      // 0cb: aload 11
      // 0cd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d2: ifeq 12d
      // 0d5: aload 11
      // 0d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0dc: checkcast com/zelix/w8
      // 0df: astore 12
      // 0e1: aload 10
      // 0e3: aload 7
      // 0e5: ifnonnull 12f
      // 0e8: aload 12
      // 0ea: invokeinterface com/zelix/w8.contains (Ljava/lang/Object;)Z 2
      // 0ef: aload 7
      // 0f1: ifnonnull 127
      // 0f4: goto 101
      // 0f7: ldc2_w -1488402868989426649
      // 0fa: lload 3
      // 0fb: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: ifeq 128
      // 104: goto 111
      // 107: ldc2_w -1488402868989426649
      // 10a: lload 3
      // 10b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 8
      // 113: aload 12
      // 115: invokeinterface com/zelix/w8.add (Ljava/lang/Object;)Z 2
      // 11a: goto 127
      // 11d: ldc2_w -1488402868989426649
      // 120: lload 3
      // 121: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: pop
      // 128: aload 7
      // 12a: ifnull 0cb
      // 12d: aload 8
      // 12f: areturn
   }

   public rq U(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/rq
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/rq.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 35675675997369
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 27259402180206
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: aload 0
      // 2b: ldc2_w -7294124310673080049
      // 2e: lload 2
      // 2f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: bipush 1
      // 35: anewarray 202
      // 38: dup_x1
      // 39: swap
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w -7351103427777927031
      // 40: lload 2
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: astore 10
      // 48: ldc2_w -7024247177335371904
      // 4b: lload 2
      // 4c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: aload 10
      // 53: aload 4
      // 55: ldc2_w -7294124310673080049
      // 58: lload 2
      // 59: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: ldc2_w -7183181102171926456
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: pop
      // 68: astore 9
      // 6a: aload 10
      // 6c: aload 9
      // 6e: ifnonnull bc
      // 71: invokeinterface com/zelix/w8.size ()I 1
      // 76: ifle e3
      // 79: goto 86
      // 7c: ldc2_w -8723930032443823727
      // 7f: lload 2
      // 80: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 0
      // 87: ldc2_w -7118837018582403943
      // 8a: lload 2
      // 8b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: lload 5
      // 92: dup2_x1
      // 93: pop2
      // 94: bipush 2
      // 95: anewarray 202
      // 98: dup_x1
      // 99: swap
      // 9a: bipush 1
      // 9b: swap
      // 9c: aastore
      // 9d: dup_x2
      // 9e: dup_x2
      // 9f: pop
      // a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a3: bipush 0
      // a4: swap
      // a5: aastore
      // a6: ldc2_w -7343497643529031734
      // a9: lload 2
      // aa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: goto bc
      // b2: ldc2_w -8723930032443823727
      // b5: lload 2
      // b6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: astore 11
      // be: aload 11
      // c0: aload 4
      // c2: ldc2_w -7118837018582403943
      // c5: lload 2
      // c6: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/w8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: invokeinterface com/zelix/w8.addAll (Ljava/util/Collection;)Z 2
      // d0: pop
      // d1: new com/zelix/rq
      // d4: dup
      // d5: aload 11
      // d7: lload 7
      // d9: aload 10
      // db: invokespecial com/zelix/rq.<init> (Lcom/zelix/w8;JLcom/zelix/w8;)V
      // de: astore 12
      // e0: aload 12
      // e2: areturn
      // e3: aconst_null
      // e4: areturn
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 85191455219178L;
      long var4 = var2 ^ 122341525645680L;
      return x44.a<"m">(this, new Object[]{(rq)var1, var4}, -6937845726758878281L, var2);
   }

   public rq(long var1, w8 var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 27443431400836L;
      long var6 = var1 ^ 74751906914893L;
      super();
      x44.a<"s">(this, x44.a<"p">(new Object[]{var6}, -3706416341567835241L, var1), -3744188982779779676L, var1);
      x44.a<"l">(this, -3744188982779779676L, var1).add(var3);
      x44.a<"s">(this, x44.a<"p">(new Object[]{var4, var3}, -3806773914658603273L, var1), -3748358206765789134L, var1);
      x44.a<"s">(this, x44.a<"p">(new Object[]{var4, var3}, -3806773914658603273L, var1), -3593022551660438429L, var1);
   }

   public int C(Object[] param1) {
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
      // 004: checkcast com/zelix/rq
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/rq.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 10978658734838
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 47897798492098
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 7368084856362991428
      // 02d: lload 2
      // 02e: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 9
      // 035: aload 0
      // 036: lload 7
      // 038: bipush 1
      // 039: anewarray 202
      // 03c: dup_x2
      // 03d: dup_x2
      // 03e: pop
      // 03f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 042: bipush 0
      // 043: swap
      // 044: aastore
      // 045: ldc2_w 9020482702288561692
      // 048: lload 2
      // 049: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 4
      // 050: lload 7
      // 052: bipush 1
      // 053: anewarray 202
      // 056: dup_x2
      // 057: dup_x2
      // 058: pop
      // 059: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05c: bipush 0
      // 05d: swap
      // 05e: aastore
      // 05f: ldc2_w 9020482702288561692
      // 062: lload 2
      // 063: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: aload 9
      // 06a: ifnonnull 0ce
      // 06d: if_icmpge 089
      // 070: goto 07d
      // 073: ldc2_w 9091133293499453781
      // 076: lload 2
      // 077: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: bipush -1
      // 07e: ireturn
      // 07f: ldc2_w 9091133293499453781
      // 082: lload 2
      // 083: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: lload 7
      // 08c: bipush 1
      // 08d: anewarray 202
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w 9020482702288561692
      // 09c: lload 2
      // 09d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: aload 9
      // 0a4: ifnonnull 195
      // 0a7: aload 4
      // 0a9: lload 7
      // 0ab: bipush 1
      // 0ac: anewarray 202
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 9020482702288561692
      // 0bb: lload 2
      // 0bc: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: goto 0ce
      // 0c4: ldc2_w 9091133293499453781
      // 0c7: lload 2
      // 0c8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 10a
      // 0d4: if_icmpne 194
      // 0d7: aload 0
      // 0d8: lload 5
      // 0da: bipush 1
      // 0db: anewarray 202
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w 8832394739252850542
      // 0ea: lload 2
      // 0eb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: aload 4
      // 0f2: lload 5
      // 0f4: bipush 1
      // 0f5: anewarray 202
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 8832394739252850542
      // 104: lload 2
      // 105: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: lload 2
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 183
      // 110: aload 9
      // 112: ifnonnull 183
      // 115: goto 122
      // 118: ldc2_w 9091133293499453781
      // 11b: lload 2
      // 11c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: if_icmpge 13e
      // 125: goto 132
      // 128: ldc2_w 9091133293499453781
      // 12b: lload 2
      // 12c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: bipush -1
      // 133: ireturn
      // 134: ldc2_w 9091133293499453781
      // 137: lload 2
      // 138: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: aload 0
      // 13f: lload 5
      // 141: bipush 1
      // 142: anewarray 202
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 0
      // 14c: swap
      // 14d: aastore
      // 14e: ldc2_w 8832394739252850542
      // 151: lload 2
      // 152: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: aload 9
      // 159: ifnonnull 193
      // 15c: aload 4
      // 15e: lload 5
      // 160: bipush 1
      // 161: anewarray 202
      // 164: dup_x2
      // 165: dup_x2
      // 166: pop
      // 167: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: ldc2_w 8832394739252850542
      // 170: lload 2
      // 171: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: goto 183
      // 179: ldc2_w 9091133293499453781
      // 17c: lload 2
      // 17d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: if_icmpne 192
      // 186: bipush 0
      // 187: ireturn
      // 188: ldc2_w 9091133293499453781
      // 18b: lload 2
      // 18c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: bipush 1
      // 193: ireturn
      // 194: bipush 1
      // 195: ireturn
   }

   public int e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 6043427795703003763L, var2).size();
   }

   private static gj a(gj var0) {
      return var0;
   }
}
