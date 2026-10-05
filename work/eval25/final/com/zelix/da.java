package com.zelix;

import java.lang.invoke.MethodHandles;

public class da {
   private boolean L;
   private String h;
   private _x1 w;
   private da q;
   private String J;
   private static final long a = ess.a(-8883335245929240647L, 4999373630017453974L, MethodHandles.lookup().lookupClass()).a(165904074684178L);

   String N(Object[] var1) {
      return this.J;
   }

   da a(Object[] var1) {
      return this.q;
   }

   boolean O() {
      return this.L;
   }

   boolean r(long var1) {
      var1 = a ^ var1;
      boolean var3 = x44.a<"s">(-604138127418539047L, var1);

      da var10000;
      label33: {
         try {
            var10000 = this.q;
            if (var3) {
               break label33;
            }

            if (this.q == null) {
               return false;
            }
         } catch (gj var5) {
            throw x44.a<"s">(var5, -1707413618043738532L, var1);
         }

         var10000 = this;
      }

      try {
         if (var3) {
            return var10000.L;
         }

         if (!var10000.L) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, -1707413618043738532L, var1);
      }

      return false;
   }

   void E(Object[] var1) {
      String var2 = (String)var1[0];
      this.J = var2;
   }

   void l(Object[] var1) {
      String var2 = (String)var1[0];
      this.h = var2;
   }

   String x() {
      return this.h;
   }

   void a(_x1 var1, long var2) {
      var2 = a ^ var2;
      x44.a<"t">(this, var1, 28970623236199941L, var2);
   }

   da(String var1, String var2) {
      this.J = var1;
      this.h = var2;
   }

   void G(Object[] var1) {
      da var2 = (da)var1[0];
      this.q = var2;
   }

   da(String var1, String var2, boolean var3) {
      this.J = var1;
      this.h = var2;
      this.L = var3;
   }

   void M(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      this.L = var2;
   }

   String y(Object[] param1) {
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
      // 0c: getstatic com/zelix/da.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 4701422137447182676
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: new java/lang/StringBuilder
      // 20: dup
      // 21: invokespecial java/lang/StringBuilder.<init> ()V
      // 24: aload 0
      // 25: iload 4
      // 27: ifeq 4d
      // 2a: getfield com/zelix/da.J Ljava/lang/String;
      // 2d: ifnonnull 4c
      // 30: goto 3d
      // 33: ldc2_w 4871211708347518344
      // 36: lload 2
      // 37: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: ldc ""
      // 3f: goto 50
      // 42: ldc2_w 4871211708347518344
      // 45: lload 2
      // 46: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield com/zelix/da.J Ljava/lang/String;
      // 50: lload 2
      // 51: lconst_0
      // 52: lcmp
      // 53: iflt 62
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 0
      // 5a: iload 4
      // 5c: ifeq 82
      // 5f: getfield com/zelix/da.h Ljava/lang/String;
      // 62: ifnonnull 81
      // 65: goto 72
      // 68: ldc2_w 4871211708347518344
      // 6b: lload 2
      // 6c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: ldc ""
      // 74: goto 85
      // 77: ldc2_w 4871211708347518344
      // 7a: lload 2
      // 7b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: aload 0
      // 82: getfield com/zelix/da.h Ljava/lang/String;
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8b: areturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
