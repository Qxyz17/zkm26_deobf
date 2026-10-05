package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Vector;

public class ok extends y1 implements _zg {
   private Vector w;
   private static final long a = ess.a(-3253250566516513832L, 2603022431408294740L, MethodHandles.lookup().lookupClass()).a(45176925720748L);

   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 71788796429941L;
      long var9 = var3 ^ 1133881831266L;
      long var11 = var3 ^ 12537943615230L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var14 = this.u(var9);
      int var13 = var10000;
      int var15 = 0;

      label32: {
         label31:
         while (true) {
            if (var15 < var14) {
               do {
                  try {
                     var18 = this;
                     if (var3 <= 0L) {
                        break label32;
                     }

                     var19 = this.a(var15);
                     if (var13 != 0) {
                        break label31;
                     }

                     var19.h(this, var2, var5);
                     var15++;
                     if (var13 == 0) {
                        continue label31;
                     }
                  } catch (gj var16) {
                     throw x44.a<"u">(var16, 7917612115825839061L, var3);
                  }
               } while (var3 < 0L);
            }

            var19 = var1;
            break;
         }

         var18 = (_zg)var19;
      }

      Object var17 = var18;
      x44.a<"m">(var17, new Object[]{x44.a<"m">(this, new Object[]{var11}, 8443435915984822742L, var3), var7}, 7686672430284179407L, var3);
   }

   public ok(int var1, long var2) {
      var2 = a ^ var2;
      super(var1);
      x44.a<"s">(this, new Vector(), 6089327743123490492L, var2);
   }

   public String x(Object[] param1) {
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
      // 0c: getstatic com/zelix/ok.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: new java/lang/StringBuffer
      // 15: dup
      // 16: invokespecial java/lang/StringBuffer.<init> ()V
      // 19: astore 5
      // 1b: aload 0
      // 1c: ldc2_w 8109797187803194038
      // 1f: lload 2
      // 20: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: invokevirtual java/util/Vector.size ()I
      // 28: istore 6
      // 2a: ldc2_w 8500069029033491849
      // 2d: lload 2
      // 2e: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: bipush 0
      // 34: istore 7
      // 36: istore 4
      // 38: iload 7
      // 3a: iload 6
      // 3c: if_icmpge ad
      // 3f: lload 2
      // 40: lconst_0
      // 41: lcmp
      // 42: iflt 62
      // 45: aload 5
      // 47: aload 0
      // 48: ldc2_w 8109797187803194038
      // 4b: lload 2
      // 4c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: iload 7
      // 53: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 56: checkcast java/lang/String
      // 59: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 5c: iload 4
      // 5e: ifeq b5
      // 61: pop
      // 62: iload 4
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt aa
      // 6a: ifeq a8
      // 6d: goto 7a
      // 70: ldc2_w 7684908018551344274
      // 73: lload 2
      // 74: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: iload 7
      // 7c: iload 6
      // 7e: bipush 1
      // 7f: isub
      // 80: if_icmpge a5
      // 83: goto 90
      // 86: ldc2_w 7684908018551344274
      // 89: lload 2
      // 8a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 5
      // 92: ldc "."
      // 94: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 97: pop
      // 98: goto a5
      // 9b: ldc2_w 7684908018551344274
      // 9e: lload 2
      // 9f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: iinc 7 1
      // a8: iload 4
      // aa: ifne 38
      // ad: lload 2
      // ae: lconst_0
      // af: lcmp
      // b0: ifle 3f
      // b3: aload 5
      // b5: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // b8: areturn
   }

   public void o(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"l">(this, -5640250847701998716L, var2).addElement(var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
