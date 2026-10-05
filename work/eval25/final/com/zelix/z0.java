package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class z0 extends jf implements _f6 {
   private String U;
   private List b;
   private static final long a = ess.a(-1649875977704225860L, -3781625639276793656L, MethodHandles.lookup().lookupClass()).a(161964362138356L);

   public z0(int var1, int var2, int var3, int var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 32793890592237L;
      super(var7, var1);
      x44.a<"q">(this, new ArrayList(), -3493076320901876183L, var5);
   }

   public List w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 23780494789949L;
      int[] var10000 = x44.a<"v">(-3939987697249949460L, var2);
      int var7 = x44.a<"n">(this, new Object[]{var4}, -3130574474291232537L, var2);
      ArrayList var8 = new ArrayList(var7);
      int var9 = 0;
      int[] var6 = var10000;

      label34:
      while (var9 < var7) {
         g0 var10 = (g0)this.e(var9);

         do {
            try {
               if (var2 > 0L) {
                  if (var6 != null) {
                     return var8;
                  }

                  var8.add(x44.a<"n">(var10, new Object[0], -3309512083940470482L, var2));
                  var9++;
               }

               if (var6 == null) {
                  continue label34;
               }
            } catch (gj var11) {
               throw x44.a<"v">(var11, -3859448163174351168L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var8;
   }

   public String o(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(this, 7718518890155922407L, var2) + "/";
   }

   public boolean R(long var1, String var3) {
      long var4 = var1 ^ 10908409034562L;
      return l_.y(var4, var3, x44.a<"l">(this, 1113200820940748680L, var1));
   }

   public void t(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_za
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 2
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 134528422017690
      // 20: lxor
      // 21: lstore 6
      // 23: pop2
      // 24: ldc2_w 9148277501292601163
      // 27: lload 3
      // 28: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 0
      // 2e: lload 6
      // 30: bipush 1
      // 31: anewarray 81
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w 7145691849331111744
      // 40: lload 3
      // 41: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: istore 9
      // 48: astore 8
      // 4a: new java/lang/StringBuilder
      // 4d: dup
      // 4e: invokespecial java/lang/StringBuilder.<init> ()V
      // 51: astore 10
      // 53: bipush 0
      // 54: istore 11
      // 56: iload 11
      // 58: iload 9
      // 5a: if_icmpge e5
      // 5d: aload 0
      // 5e: iload 11
      // 60: invokevirtual com/zelix/z0.e (I)Lcom/zelix/_za;
      // 63: checkcast com/zelix/zw
      // 66: bipush 0
      // 67: anewarray 81
      // 6a: ldc2_w 7328816409459435145
      // 6d: lload 3
      // 6e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: astore 12
      // 75: aload 0
      // 76: ldc2_w 7290538857954286722
      // 79: lload 3
      // 7a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: aload 12
      // 81: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 86: pop
      // 87: aload 10
      // 89: aload 12
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: pop
      // 8f: aload 8
      // 91: lload 3
      // 92: lconst_0
      // 93: lcmp
      // 94: iflt 9c
      // 97: ifnonnull fa
      // 9a: aload 8
      // 9c: lload 3
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: iflt e2
      // a2: ifnonnull e0
      // a5: goto b2
      // a8: ldc2_w 9067737963416963431
      // ab: lload 3
      // ac: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: iload 11
      // b4: iload 9
      // b6: bipush 1
      // b7: isub
      // b8: if_icmpge dd
      // bb: goto c8
      // be: ldc2_w 9067737963416963431
      // c1: lload 3
      // c2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 10
      // ca: ldc "."
      // cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cf: pop
      // d0: goto dd
      // d3: ldc2_w 9067737963416963431
      // d6: lload 3
      // d7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: athrow
      // dd: iinc 11 1
      // e0: aload 8
      // e2: ifnull 56
      // e5: aload 0
      // e6: aload 10
      // e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // eb: ldc2_w 7107719709088209497
      // ee: lload 3
      // ef: invokedynamic r (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f4: lload 3
      // f5: lconst_0
      // f6: lcmp
      // f7: iflt fa
      // fa: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
