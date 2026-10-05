package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _op extends _og {
   private int K;
   private int H;
   private int Q;
   private static final long b = ess.a(-821830802445608715L, -2816326715106068010L, MethodHandles.lookup().lookupClass()).a(26495782523541L);
   private static final String c;
   private static final long[] g;
   private static final Integer[] k;
   private static final Map l;

   public void W(int var1, DataOutputStream var2, int var3) {
   }

   public int m() {
      return this.Q;
   }

   public final boolean Y(Object[] var1) {
      int var6 = (Integer)var1[0];
      n var3 = (n)var1[1];
      int var2 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      return false;
   }

   public void o(int var1, long var2) {
      this.H = var1;
   }

   public int z(Object[] var1) {
      return sh.B(this.K);
   }

   public boolean W() {
      return true;
   }

   public _op(int var1, char var2, int var3, short var4, boolean var5, int var6) {
      long var7 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var9 = var7 ^ 114284001361332L;
      this(var3, var5, false, var6, var9);
   }

   public boolean b(Object[] param1) {
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
      // 0c: getstatic com/zelix/_op.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5491332466523623921
      // 15: lload 2
      // 16: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/_op.K I
      // 21: invokestatic com/zelix/sh.B (I)I
      // 24: aload 4
      // 26: ifnonnull 48
      // 29: bipush 1
      // 2a: if_icmpne 4b
      // 2d: goto 3a
      // 30: ldc2_w -5912237563841606275
      // 33: lload 2
      // 34: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 48
      // 3e: ldc2_w -5912237563841606275
      // 41: lload 2
      // 42: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: ireturn
   }

   public int d(long var1) {
      return 0;
   }

   public String K(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 74582230323246L;
      return x44.a<"n">(this, new Object[]{var4}, -5518067983514246462L, var2);
   }

   public _op(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 19858849926216L;
      this(0, true, true, 2, var3);
   }

   private _op(int param1, boolean param2, boolean param3, int param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_op.b J
      // 03: lload 5
      // 05: lxor
      // 06: lstore 5
      // 08: aload 0
      // 09: sipush 10841
      // 0c: ldc2_w 3438877657021065991
      // 0f: lload 5
      // 11: lxor
      // 12: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: invokespecial com/zelix/_og.<init> (I)V
      // 1a: aload 0
      // 1b: bipush -1
      // 1c: putfield com/zelix/_op.H I
      // 1f: ldc2_w -7552628131163665686
      // 22: lload 5
      // 24: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: aload 0
      // 2a: bipush -1
      // 2b: putfield com/zelix/_op.Q I
      // 2e: aload 0
      // 2f: bipush 0
      // 30: putfield com/zelix/_op.K I
      // 33: aload 0
      // 34: iload 4
      // 36: invokevirtual com/zelix/_op.g (I)V
      // 39: aload 0
      // 3a: iload 1
      // 3b: putfield com/zelix/_op.H I
      // 3e: astore 7
      // 40: iload 2
      // 41: aload 7
      // 43: ifnonnull 78
      // 46: ifeq 77
      // 49: goto 57
      // 4c: ldc2_w -8568395368867026536
      // 4f: lload 5
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 0
      // 58: sipush 6376
      // 5b: ldc2_w 8877316869421930931
      // 5e: lload 5
      // 60: lxor
      // 61: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: invokevirtual com/zelix/_op.g (I)V
      // 69: goto 77
      // 6c: ldc2_w -8568395368867026536
      // 6f: lload 5
      // 71: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: iload 3
      // 78: ifeq 9b
      // 7b: aload 0
      // 7c: sipush 23702
      // 7f: ldc2_w 3983015057253948876
      // 82: lload 5
      // 84: lxor
      // 85: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: invokevirtual com/zelix/_op.g (I)V
      // 8d: goto 9b
      // 90: ldc2_w -8568395368867026536
      // 93: lload 5
      // 95: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: return
   }

   public final boolean N(int var1, int var2, long var3) {
      return false;
   }

   public void j(Object[] var1) {
      d2 var4 = (d2)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 54836040803205L;
      this.K = this.K & x44.a<"j">(var4, new Object[]{var5}, 1554613681349012991L, var2);
   }

   public boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = (var2 ^ 46594892518408L) >>> 16;
      int var6 = (int)((var2 ^ 46594892518408L) << 48 >>> 48);
      return this.o(var4, b<"q">(22100, 2359440574400010218L ^ var2), (char)var6);
   }

   public _op(char var1, char var2, int var3, boolean var4, int var5) {
      long var6 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var6 ^ 67646295431104L;
      int var8 = (int)((var6 ^ 67646295431104L) >>> 32);
      int var9 = (int)((var6 ^ 67646295431104L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      this(var8, (char)var9, -1, (short)var10, var4, var5);
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean w(long var1) {
      var1 = b ^ var1;
      int[] var3 = x44.a<"s">(2128760282268926031L, var1);

      try {
         int var10000 = sh.B(this.K) & b<"q">(17329, 8019345457305438285L ^ var1);
         if (var3 != null) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, 266764917369185085L, var1);
      }

      return (boolean)0;
   }

   public int W() {
      return this.H;
   }

   public boolean F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      int[] var4 = x44.a<"v">(2449854643801406522L, var2);

      try {
         int var10000 = sh.B(this.K);
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"v">(var5, 4595638252388851528L, var2);
      }

      return (boolean)0;
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = (var2 ^ 35911680854464L) >>> 16;
      int var6 = (int)((var2 ^ 35911680854464L) << 48 >>> 48);
      return this.o(var4, b<"q">(28537, 4087057537276900108L ^ var2), (char)var6);
   }

   public void k(wd var1) {
      this.K = this.K | var1.k();
   }

   public void Y(int var1) {
      this.Q = var1;
   }

   public _op(int var1, long var2) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 131809377650886L;
      int var4 = (int)((var2 ^ 131809377650886L) >>> 32);
      int var5 = (int)((var2 ^ 131809377650886L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this(var4, (char)var5, -1, (short)var6, false, var1);
   }

   public boolean o(long var1, int var3, char var4) {
      long var5 = (var1 << 16 | (long)var4 << 48 >>> 48) ^ b;
      int[] var7 = x44.a<"q">(-6151720939001464987L, var5);

      try {
         int var10000 = sh.B(this.K) & var3;
         if (var7 != null) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var8) {
         throw x44.a<"q">(var8, -5433048606540688361L, var5);
      }

      return (boolean)0;
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void N(Object[] param1) {
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
      // 04: checkcast java/lang/Boolean
      // 07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/_op.b J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 81385420542236
      // 22: lxor
      // 23: lstore 5
      // 25: pop2
      // 26: ldc2_w -1505677794577647905
      // 29: lload 2
      // 2a: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: astore 7
      // 31: aload 7
      // 33: ifnonnull 66
      // 36: iload 4
      // 38: ifeq 71
      // 3b: goto 48
      // 3e: ldc2_w -782606606129211987
      // 41: lload 2
      // 42: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: sipush 22100
      // 4c: ldc2_w 2359429832938728253
      // 4f: lload 2
      // 50: lxor
      // 51: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: invokevirtual com/zelix/_op.g (I)V
      // 59: goto 66
      // 5c: ldc2_w -782606606129211987
      // 5f: lload 2
      // 60: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: lload 2
      // 67: lconst_0
      // 68: lcmp
      // 69: ifle 98
      // 6c: aload 7
      // 6e: ifnull a5
      // 71: aload 0
      // 72: ldc2_w -683503215276951002
      // 75: lload 2
      // 76: invokedynamic j (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: lload 5
      // 7d: bipush 2
      // 7e: anewarray 326
      // 81: dup_x2
      // 82: dup_x2
      // 83: pop
      // 84: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 87: bipush 1
      // 88: swap
      // 89: aastore
      // 8a: dup_x1
      // 8b: swap
      // 8c: bipush 0
      // 8d: swap
      // 8e: aastore
      // 8f: ldc2_w -1509448217660549851
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: goto a5
      // 9b: ldc2_w -782606606129211987
      // 9e: lload 2
      // 9f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: return
   }

   public final boolean I(long var1) {
      return true;
   }

   public void k(Object[] var1) {
      PrintWriter var2 = (PrintWriter)var1[0];
      long var3 = (Long)var1[1];
      StringBuilder var5 = (StringBuilder)var1[2];
      long var6 = var3 ^ 66799520812205L;
      long var8 = var3 ^ 104031253466172L;

      try {
         if (x44.a<"l">(this, new Object[]{var6}, 8473382133523785344L, var3)) {
            var2.println(var5.toString() + x44.a<"l">(this, new Object[]{var8}, 8032731987764428496L, var3));
         }
      } catch (gj var10) {
         throw x44.a<"t">(var10, 7799383204813065394L, var3);
      }
   }

   public _op(int var1, int var2, long var3) {
      var3 = b ^ var3;
      long var10001 = var3 ^ 96375151906329L;
      int var5 = (int)((var3 ^ 96375151906329L) >>> 32);
      int var6 = (int)((var3 ^ 96375151906329L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      this(var5, (char)var6, var1, (short)var7, false, var2);
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   public String t(Object[] param1) {
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
      // 0c: getstatic com/zelix/_op.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 62444309279804
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2928278716740515175
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: sipush 26711
      // 2b: ldc2_w 4410958158162733433
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: invokespecial java/lang/StringBuilder.<init> (I)V
      // 38: astore 7
      // 3a: astore 6
      // 3c: aload 7
      // 3e: getstatic com/zelix/_op.c Ljava/lang/String;
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: pop
      // 45: aload 7
      // 47: aload 0
      // 48: getfield com/zelix/_op.H I
      // 4b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4e: aload 6
      // 50: ifnonnull 9f
      // 53: pop
      // 54: aload 0
      // 55: lload 4
      // 57: bipush 1
      // 58: anewarray 326
      // 5b: dup_x2
      // 5c: dup_x2
      // 5d: pop
      // 5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61: bipush 0
      // 62: swap
      // 63: aastore
      // 64: ldc2_w -2897706281685097683
      // 67: lload 2
      // 68: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: ifeq 9d
      // 70: goto 7d
      // 73: ldc2_w -3934466637761975829
      // 76: lload 2
      // 77: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 7
      // 7f: sipush 12998
      // 82: ldc2_w 5391636613362414573
      // 85: lload 2
      // 86: lxor
      // 87: invokedynamic q (IJ)I bsm=com/zelix/_op.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 8f: pop
      // 90: goto 9d
      // 93: ldc2_w -3934466637761975829
      // 96: lload 2
      // 97: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: aload 7
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: areturn
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 37585498234552L;
      return new _kz(var1.m(), var1.r(), var10, var1.z(), var1.C(var8));
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.toString();
   }

   public void g(int var1) {
      this.K |= var1;
   }

   static {
      long var11 = b ^ 126516628889816L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("\u0093,ä\u0096H¢Ì\u0098".getBytes("ISO-8859-1"));
      String var22 = b(var15).intern();
      int var10001 = -1;
      c = var22;
      l = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "À\u000f\u0088\u0010'«àµÒ\u0086\u001fH<\u0089Z¬\u0010\u009b\u001fKï\u001b%ÉâñcSDL\u0010ú\u0011õà\\\"ÊÄ6å)\u0097\u0091'\níÖ";
      int var5 = "À\u000f\u0088\u0010'«àµÒ\u0086\u001fH<\u0089Z¬\u0010\u009b\u001fKï\u001b%ÉâñcSDL\u0010ú\u0011õà\\\"ÊÄ6å)\u0097\u0091'\níÖ".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
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
            long var29 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     g = var6;
                     k = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "\fVÔýó\tÏö\u0081ª\u00169c¾\u0007¸";
                  var5 = "\fVÔýó\tÏö\u0081ª\u00169c¾\u0007¸".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var27 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7014;
      if (k[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_op", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("com/zelix/_op" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
