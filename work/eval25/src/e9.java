package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public class e9 {
   final ax x;
   private static final long a = ess.a(3132393496726524734L, 2037009822401724883L, MethodHandles.lookup().lookupClass()).a(230034415427241L);

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public _y4 A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 97209791177761L;
      long var10001 = var2 ^ 139577314329866L;
      int var6 = (int)((var2 ^ 139577314329866L) >>> 32);
      int var7 = (int)((var2 ^ 139577314329866L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 19069191165974L;
      String var10000 = x44.a<"q">(4927117361831107940L, var2);
      _y4 var12 = new _y4(var9, x44.a<"i">(x44.a<"m">(this, 4649775792209968956L, var2), new Object[0], 5122117176697096327L, var2) * 2);
      String var11 = var10000;

      label44:
      for (Entry var14 : x44.a<"i">(x44.a<"m">(this, 4649775792209968956L, var2), new Object[0], 4981143806453123041L, var2)) {
         var10000 = (String)var14.getValue();

         label39:
         while (true) {
            _y4 var15 = (_y4)var10000;
            if (var11 != null) {
               return var15;
            }

            Iterator var16 = var15.U(var6, (short)var7, (short)var8).iterator();

            while (true) {
               if (var16.hasNext()) {
                  var10000 = (String)var16.next();
               } else {
                  var10000 = var11;
                  if (var2 >= 0L) {
                     break label39;
                  }
               }

               while (true) {
                  Entry var17 = (Entry)var10000;
                  var12.v(var4, var17.getKey(), (Collection)var17.getValue());
                  if (var11 != null) {
                     continue label44;
                  }

                  var10000 = var11;
                  if (var2 < 0L) {
                     continue label39;
                  }

                  if (var11 == null) {
                     break;
                  }

                  var10000 = var11;
                  if (var2 >= 0L) {
                     break label39;
                  }
               }
            }
         }

         if (var10000 != null) {
            break;
         }
      }

      return var12;
   }

   public e9(ax var1) {
      this.x = var1;
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return x44.a<"n">(x44.a<"j">(this, -1630198870764611877L, var2), new Object[]{var4}, -1573289538846105148L, var2);
   }

   public _y4 D(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/e9.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 77542173595658
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -8726892863351513113
      // 26: lload 2
      // 27: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: ldc2_w -9078086428407988801
      // 30: lload 2
      // 31: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/ax; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 4
      // 38: bipush 1
      // 39: anewarray 114
      // 3c: dup_x1
      // 3d: swap
      // 3e: bipush 0
      // 3f: swap
      // 40: aastore
      // 41: ldc2_w -9085359688468492679
      // 44: lload 2
      // 45: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: astore 8
      // 4c: astore 7
      // 4e: aload 8
      // 50: aload 7
      // 52: ifnonnull 7d
      // 55: ifnull 7e
      // 58: goto 65
      // 5b: ldc2_w -6978411309599071796
      // 5e: lload 2
      // 5f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: new com/zelix/_y4
      // 68: dup
      // 69: aload 8
      // 6b: lload 5
      // 6d: invokespecial com/zelix/_y4.<init> (Lcom/zelix/_y4;J)V
      // 70: goto 7d
      // 73: ldc2_w -6978411309599071796
      // 76: lload 2
      // 77: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: areturn
      // 7e: aconst_null
      // 7f: areturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
