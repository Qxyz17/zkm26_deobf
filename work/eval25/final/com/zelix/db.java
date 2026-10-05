package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class db {
   private int v;
   private Object[] o;
   private Set q;
   private int N;
   private int m;
   private static final long a = ess.a(-671189635771486403L, -3377576620347958609L, MethodHandles.lookup().lookupClass()).a(134835493625461L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public Object p(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/db.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 6290843653163863625
      // 09: lload 1
      // 0a: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 0
      // 11: getfield com/zelix/db.m I
      // 14: aload 3
      // 15: ifnonnull 4c
      // 18: ifne 47
      // 1b: goto 28
      // 1e: ldc2_w 6056434624359336078
      // 21: lload 1
      // 22: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: new com/zelix/gj
      // 2b: dup
      // 2c: sipush 13632
      // 2f: ldc2_w 3624378011795259641
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/db.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: ldc2_w 6056434624359336078
      // 40: lload 1
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/db.o [Ljava/lang/Object;
      // 4b: arraylength
      // 4c: istore 4
      // 4e: aload 0
      // 4f: getfield com/zelix/db.o [Ljava/lang/Object;
      // 52: aload 0
      // 53: getfield com/zelix/db.N I
      // 56: aaload
      // 57: astore 5
      // 59: aload 0
      // 5a: aload 0
      // 5b: getfield com/zelix/db.N I
      // 5e: bipush 1
      // 5f: iadd
      // 60: iload 4
      // 62: irem
      // 63: putfield com/zelix/db.N I
      // 66: aload 0
      // 67: dup
      // 68: getfield com/zelix/db.m I
      // 6b: bipush 1
      // 6c: isub
      // 6d: putfield com/zelix/db.m I
      // 70: aload 0
      // 71: getfield com/zelix/db.q Ljava/util/Set;
      // 74: aload 5
      // 76: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 7b: pop
      // 7c: aload 5
      // 7e: areturn
   }

   public void b(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0e: checkcast java/util/Enumeration
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/db.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 135421448844514
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 3037275796846687010
      // 26: lload 2
      // 27: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: astore 7
      // 2e: aload 4
      // 30: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 35: ifeq 4b
      // 38: aload 0
      // 39: aload 4
      // 3b: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 40: lload 5
      // 42: invokevirtual com/zelix/db.J (Ljava/lang/Object;J)Z
      // 45: pop
      // 46: aload 7
      // 48: ifnull 2e
      // 4b: lload 2
      // 4c: lconst_0
      // 4d: lcmp
      // 4e: ifle 46
      // 51: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = x44.a<"t">(-8888460640487629407L, var2);
      int var5 = this.o.length;
      Object[] var6 = new Object[var5 * 2];
      int var7 = 0;
      String var4 = var10000;

      label43:
      while (var7 < this.m) {
         int var8 = (this.N + var7) % var5;

         try {
            var6[var7] = this.o[var8];
            var7++;
         } catch (IllegalArgumentException var10) {
            boolean var10001 = false;
            throw x44.a<"t">(var10, -8654634353919567002L, var2);
         }

         while (true) {
            try {
               var10000 = var4;
               if (var2 >= 0L) {
                  if (var4 != null) {
                     return;
                  }

                  var10000 = var4;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (IllegalArgumentException var9) {
               boolean var14 = false;
               throw x44.a<"t">(var9, -8654634353919567002L, var2);
            }

            if (var2 >= 0L) {
               break label43;
            }
         }
      }

      this.N = 0;
      this.v = this.m;
      this.o = var6;
   }

   public boolean V(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      String var6 = x44.a<"w">(6144809521152412738L, var4);

      try {
         if (var6 != null) {
            return (boolean)this.m;
         }

         if (this.m == 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var7) {
         throw x44.a<"w">(var7, 6199179017458846341L, var4);
      }

      return (boolean)0;
   }

   public void m(Object[] var1) {
      Collection var2 = (Collection)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 119726161306899L;
      String var10000 = x44.a<"v">(-299623553958223149L, var3);
      Iterator var8 = var2.iterator();
      String var7 = var10000;

      while (var8.hasNext()) {
         Object var9 = var8.next();
         this.J(var9, var5);
         if (var7 != null) {
            break;
         }
      }
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 127339473944469L;
      int var4 = 1;
      int var5 = this.o.length;
      String var10000 = x44.a<"s">(-7905324042217026738L, var1);
      int var6 = 0;
      String var3 = var10000;

      while (true) {
         if (var6 < this.m) {
            int var7 = (this.N + var6) % var5;
            var8 = b<"y">(27517, 2005547201750380042L ^ var1) * var4 + this.o[var7].hashCode();
            if (var3 != null) {
               break;
            }

            var4 = var8;
            var6++;
            if (var3 == null) {
               continue;
            }
         }

         var8 = var4;
         break;
      }

      return var8;
   }

   public boolean J(Object param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/db.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 54112345119329
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -2179267836570371899
      // 12: lload 2
      // 13: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: astore 6
      // 1a: aload 0
      // 1b: getfield com/zelix/db.q Ljava/util/Set;
      // 1e: aload 1
      // 1f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 24: aload 6
      // 26: ifnonnull 4a
      // 29: ifne 45
      // 2c: goto 39
      // 2f: ldc2_w -2125425547029561854
      // 32: lload 2
      // 33: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
      // 3b: ldc2_w -2125425547029561854
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: getfield com/zelix/db.o [Ljava/lang/Object;
      // 49: arraylength
      // 4a: istore 7
      // 4c: aload 0
      // 4d: getfield com/zelix/db.m I
      // 50: aload 6
      // 52: ifnonnull a9
      // 55: iload 7
      // 57: if_icmpne 87
      // 5a: goto 67
      // 5d: ldc2_w -2125425547029561854
      // 60: lload 2
      // 61: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 0
      // 68: lload 4
      // 6a: bipush 1
      // 6b: anewarray 293
      // 6e: dup_x2
      // 6f: dup_x2
      // 70: pop
      // 71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74: bipush 0
      // 75: swap
      // 76: aastore
      // 77: ldc2_w -2154402917849705493
      // 7a: lload 2
      // 7b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: aload 0
      // 81: getfield com/zelix/db.o [Ljava/lang/Object;
      // 84: arraylength
      // 85: istore 7
      // 87: aload 0
      // 88: getfield com/zelix/db.o [Ljava/lang/Object;
      // 8b: aload 0
      // 8c: getfield com/zelix/db.v I
      // 8f: aload 1
      // 90: aastore
      // 91: aload 0
      // 92: aload 0
      // 93: getfield com/zelix/db.v I
      // 96: bipush 1
      // 97: iadd
      // 98: iload 7
      // 9a: irem
      // 9b: putfield com/zelix/db.v I
      // 9e: aload 0
      // 9f: dup
      // a0: getfield com/zelix/db.m I
      // a3: bipush 1
      // a4: iadd
      // a5: putfield com/zelix/db.m I
      // a8: bipush 1
      // a9: ireturn
   }

   public int y(Object[] var1) {
      return this.m;
   }

   public db(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/db.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 80249095515904
      // 0b: lxor
      // 0c: lstore 4
      // 0e: dup2
      // 0f: ldc2_w 102908819501268
      // 12: lxor
      // 13: lstore 6
      // 15: pop2
      // 16: ldc2_w -4258217453050012189
      // 19: lload 1
      // 1a: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: aload 0
      // 20: invokespecial java/lang/Object.<init> ()V
      // 23: aload 0
      // 24: bipush 0
      // 25: putfield com/zelix/db.N I
      // 28: astore 8
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield com/zelix/db.v I
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield com/zelix/db.m I
      // 34: aload 8
      // 36: ifnonnull b2
      // 39: iload 3
      // 3a: bipush 1
      // 3b: if_icmpgt 7b
      // 3e: goto 4b
      // 41: ldc2_w -4060397473978442972
      // 44: lload 1
      // 45: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: new java/lang/IllegalArgumentException
      // 4e: dup
      // 4f: new java/lang/StringBuilder
      // 52: dup
      // 53: invokespecial java/lang/StringBuilder.<init> ()V
      // 56: sipush 8779
      // 59: ldc2_w 8162461890345567321
      // 5c: lload 1
      // 5d: lxor
      // 5e: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/db.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: iload 3
      // 67: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: ldc2_w -4060397473978442972
      // 74: lload 1
      // 75: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 0
      // 7c: iload 3
      // 7d: anewarray 293
      // 80: checkcast [Ljava/lang/Object;
      // 83: putfield com/zelix/db.o [Ljava/lang/Object;
      // 86: aload 0
      // 87: iload 3
      // 88: lload 4
      // 8a: invokestatic com/zelix/sh.Q (IJ)I
      // 8d: lload 6
      // 8f: dup2_x1
      // 90: pop2
      // 91: bipush 2
      // 92: anewarray 293
      // 95: dup_x1
      // 96: swap
      // 97: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // a6: ldc2_w -4451492535366958291
      // a9: lload 1
      // aa: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: putfield com/zelix/db.q Ljava/util/Set;
      // b2: return
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/db.a J
      // 003: ldc2_w 50577616953172
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w -969408089856611441
      // 00b: lload 2
      // 00c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: aload 4
      // 016: ifnonnull 037
      // 019: aload 0
      // 01a: if_acmpne 036
      // 01d: goto 02a
      // 020: ldc2_w -1023812789258539704
      // 023: lload 2
      // 024: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: athrow
      // 02a: bipush 1
      // 02b: ireturn
      // 02c: ldc2_w -1023812789258539704
      // 02f: lload 2
      // 030: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: athrow
      // 036: aload 1
      // 037: instanceof com/zelix/db
      // 03a: aload 4
      // 03c: ifnonnull 103
      // 03f: ifeq 102
      // 042: goto 04f
      // 045: ldc2_w -1023812789258539704
      // 048: lload 2
      // 049: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: aload 1
      // 050: checkcast com/zelix/db
      // 053: astore 5
      // 055: aload 0
      // 056: getfield com/zelix/db.m I
      // 059: aload 4
      // 05b: ifnonnull 084
      // 05e: aload 5
      // 060: getfield com/zelix/db.m I
      // 063: if_icmpeq 07f
      // 066: goto 073
      // 069: ldc2_w -1023812789258539704
      // 06c: lload 2
      // 06d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: bipush 0
      // 074: ireturn
      // 075: ldc2_w -1023812789258539704
      // 078: lload 2
      // 079: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield com/zelix/db.o [Ljava/lang/Object;
      // 083: arraylength
      // 084: istore 6
      // 086: aload 5
      // 088: getfield com/zelix/db.o [Ljava/lang/Object;
      // 08b: arraylength
      // 08c: istore 7
      // 08e: bipush 0
      // 08f: istore 8
      // 091: iload 8
      // 093: aload 0
      // 094: getfield com/zelix/db.m I
      // 097: if_icmpge 100
      // 09a: aload 0
      // 09b: getfield com/zelix/db.N I
      // 09e: iload 8
      // 0a0: iadd
      // 0a1: iload 6
      // 0a3: irem
      // 0a4: istore 9
      // 0a6: aload 5
      // 0a8: getfield com/zelix/db.N I
      // 0ab: iload 8
      // 0ad: iadd
      // 0ae: iload 7
      // 0b0: irem
      // 0b1: istore 10
      // 0b3: aload 4
      // 0b5: ifnonnull 0fb
      // 0b8: aload 0
      // 0b9: getfield com/zelix/db.o [Ljava/lang/Object;
      // 0bc: iload 9
      // 0be: aaload
      // 0bf: aload 5
      // 0c1: getfield com/zelix/db.o [Ljava/lang/Object;
      // 0c4: iload 10
      // 0c6: aaload
      // 0c7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0ca: aload 4
      // 0cc: ifnonnull 101
      // 0cf: goto 0dc
      // 0d2: ldc2_w -1023812789258539704
      // 0d5: lload 2
      // 0d6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: ifne 0f8
      // 0df: goto 0ec
      // 0e2: ldc2_w -1023812789258539704
      // 0e5: lload 2
      // 0e6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: bipush 0
      // 0ed: ireturn
      // 0ee: ldc2_w -1023812789258539704
      // 0f1: lload 2
      // 0f2: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: iinc 8 1
      // 0fb: aload 4
      // 0fd: ifnull 091
      // 100: bipush 1
      // 101: ireturn
      // 102: bipush 0
      // 103: ireturn
   }

   public boolean X(Object[] var1) {
      Object var2 = var1[0];
      return this.q.contains(var2);
   }

   public db(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 62563063367086L;
      this(var3, b<"y">(23267, 3951886123248055187L ^ var1));
   }

   static {
      long var11 = a ^ 21690520875508L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "D{Øà)¦Ñ\"`ú;ÉLmÁYj\u009dÓäÌÅõa8o\u001f\u0091¤ö]\u001d¹ÖkX,8¦b\u0014÷äáçTd_\u0000§Ñ\tý0%DÖ\u0085ìÓS\u009dl~1Ä\u0097\bW\u0099÷å\\û¦¡Æ-à\u0019Å";
      int var19 = "D{Øà)¦Ñ\"`ú;ÉLmÁYj\u009dÓäÌÅõa8o\u001f\u0091¤ö]\u001d¹ÖkX,8¦b\u0014÷äáçTd_\u0000§Ñ\tý0%DÖ\u0085ìÓS\u009dl~1Ä\u0097\bW\u0099÷å\\û¦¡Æ-à\u0019Å"
         .length();
      char var16 = 24;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "´~N¶«l§\u0087&Y\\wn\u008d\u0018*";
            int var5 = "´~N¶«l§\u0087&Y\\wn\u008d\u0018*".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(
                  new byte[]{
                     (byte)((int)(var8 >>> 56)),
                     (byte)((int)(var8 >>> 48)),
                     (byte)((int)(var8 >>> 40)),
                     (byte)((int)(var8 >>> 32)),
                     (byte)((int)(var8 >>> 24)),
                     (byte)((int)(var8 >>> 16)),
                     (byte)((int)(var8 >>> 8)),
                     (byte)((int)var8)
                  }
               );
               long var10004 = ((long)var10[0] & 255L) << 56
                  | ((long)var10[1] & 255L) << 48
                  | ((long)var10[2] & 255L) << 40
                  | ((long)var10[3] & 255L) << 32
                  | ((long)var10[4] & 255L) << 24
                  | ((long)var10[5] & 255L) << 16
                  | ((long)var10[6] & 255L) << 8
                  | (long)var10[7] & 255L;
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            e = var6;
            f = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28718;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/db", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/db" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17894;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = e[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/db", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/db" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
