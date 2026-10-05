package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ax {
   private final boolean P;
   int n;
   Map R;
   int C;
   private static final long a = ess.a(7630619279661110389L, 1309349498028792783L, MethodHandles.lookup().lookupClass()).a(42714758269998L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public ax(int var1, int var2, long var3, boolean var5) {
      var3 = a ^ var3;
      long var10001 = var3 ^ 85835765759779L;
      int var6 = (int)((var3 ^ 85835765759779L) >>> 32);
      int var7 = (int)((var3 ^ 85835765759779L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      this(var1, var2, 5, var5, var6, (char)var7, (short)var8);
   }

   public _y4 z(Object[] var1) {
      Object var3 = var1[0];
      _y4 var2 = (_y4)var1[1];
      return this.R.put(var3, var2);
   }

   public synchronized void t(Object[] var1) {
      Object var3 = var1[0];
      Object var2 = var1[1];
      long var4 = (Long)var1[2];
      Collection var6 = (Collection)var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 70489934432374L;
      long var9 = var4 ^ 135191891076354L;
      String var10000 = x44.a<"v">(7847471393519924707L, var4);
      _y4 var12 = (_y4)this.R.get(var3);
      String var11 = var10000;

      label30: {
         try {
            if (var11 != null || var12 != null) {
               break label30;
            }
         } catch (gj var15) {
            throw x44.a<"v">(var15, 7721254970087167495L, var4);
         }

         var12 = new _y4(false, x44.a<"j">(this, 7545947373856702144L, var4), var6.size(), x44.a<"j">(this, 7675236669277674529L, var4), var7);
         this.R.put(var3, var12);
      }

      for (Object var14 : var6) {
         var12.G(var2, var14, var9);
         if (var11 != null) {
            break;
         }
      }
   }

   public Set d(Object[] var1) {
      return this.R.keySet();
   }

   public Enumeration E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 17262861077942L;
      int var4 = (int)((var2 ^ 17262861077942L) >>> 48);
      int var5 = (int)((var2 ^ 17262861077942L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return new _8g((short)var4, var5, (short)var6, this.R.keySet());
   }

   public synchronized boolean N(Object[] param1) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Object
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 5
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Object
      // 20: astore 4
      // 22: pop
      // 23: getstatic com/zelix/ax.a J
      // 26: lload 5
      // 28: lxor
      // 29: lstore 5
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 94639869669603
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w -8378709667393072452
      // 38: lload 5
      // 3a: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: getfield com/zelix/ax.R Ljava/util/Map;
      // 43: aload 3
      // 44: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 49: checkcast com/zelix/_y4
      // 4c: astore 10
      // 4e: astore 9
      // 50: aload 10
      // 52: aload 9
      // 54: ifnonnull 77
      // 57: ifnonnull 75
      // 5a: goto 68
      // 5d: ldc2_w -8324782792085917352
      // 60: lload 5
      // 62: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: bipush 0
      // 69: ireturn
      // 6a: ldc2_w -8324782792085917352
      // 6d: lload 5
      // 6f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 10
      // 77: aload 2
      // 78: lload 7
      // 7a: aload 4
      // 7c: bipush 3
      // 7d: anewarray 166
      // 80: dup_x1
      // 81: swap
      // 82: bipush 2
      // 83: swap
      // 84: aastore
      // 85: dup_x2
      // 86: dup_x2
      // 87: pop
      // 88: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b: bipush 1
      // 8c: swap
      // 8d: aastore
      // 8e: dup_x1
      // 8f: swap
      // 90: bipush 0
      // 91: swap
      // 92: aastore
      // 93: ldc2_w -7713037221423991719
      // 96: lload 5
      // 98: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: ireturn
   }

   public synchronized boolean l(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Object
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/ax.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 135234622650882
      // 29: lxor
      // 2a: dup2
      // 2b: bipush 32
      // 2d: lushr
      // 2e: l2i
      // 2f: istore 6
      // 31: dup2
      // 32: bipush 32
      // 34: lshl
      // 35: bipush 48
      // 37: lushr
      // 38: l2i
      // 39: istore 7
      // 3b: dup2
      // 3c: bipush 48
      // 3e: lshl
      // 3f: bipush 48
      // 41: lushr
      // 42: l2i
      // 43: istore 8
      // 45: pop2
      // 46: pop2
      // 47: ldc2_w 6615730195752764107
      // 4a: lload 4
      // 4c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: aload 0
      // 52: getfield com/zelix/ax.R Ljava/util/Map;
      // 55: aload 2
      // 56: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5b: checkcast com/zelix/_y4
      // 5e: astore 10
      // 60: astore 9
      // 62: aload 10
      // 64: aload 9
      // 66: ifnonnull 89
      // 69: ifnonnull 87
      // 6c: goto 7a
      // 6f: ldc2_w 6633646484130881839
      // 72: lload 4
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: bipush 0
      // 7b: ireturn
      // 7c: ldc2_w 6633646484130881839
      // 7f: lload 4
      // 81: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 10
      // 89: iload 6
      // 8b: iload 7
      // 8d: i2s
      // 8e: iload 8
      // 90: i2c
      // 91: aload 3
      // 92: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 95: ireturn
   }

   public boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this.R, 6639851055794125817L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized void b(long var1, Object var3, Object var4, Object var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 23384195527698L;
      long var8 = var1 ^ 52417551833446L;
      String var10000 = x44.a<"r">(1189940957892643207L, var1);
      _y4 var11 = (_y4)this.R.get(var3);
      String var10 = var10000;

      label49: {
         label44: {
            try {
               var16 = var11;
               if (var10 != null) {
                  break label49;
               }

               if (var11 != null) {
                  break label44;
               }
            } catch (gj var14) {
               throw x44.a<"r">(var14, 1676250712103299683L, var1);
            }

            var11 = new _y4(
               false,
               x44.a<"n">(this, 1503290164908081828L, var1),
               x44.a<"n">(this, 929922377443891273L, var1),
               x44.a<"n">(this, 1650497027960954949L, var1),
               var6
            );

            try {
               var16 = var11;
               if (var1 < 0L) {
                  break label49;
               }

               var11.G(var4, var5, var8);
               this.R.put(var3, var11);
               if (var10 == null) {
                  return;
               }
            } catch (gj var13) {
               boolean var10001 = false;
               throw x44.a<"r">(var13, 1676250712103299683L, var1);
            }
         }

         try {
            var16 = var11;
         } catch (gj var12) {
            boolean var18 = false;
            throw x44.a<"r">(var12, 1676250712103299683L, var1);
         }
      }

      var16.G(var4, var5, var8);
   }

   public ax(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 118645702835654L;
      int var6 = (int)((var4 ^ 118645702835654L) >>> 32);
      int var7 = (int)((var4 ^ 118645702835654L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      this(a<"x">(30978, 4834315402984759955L ^ var4), a<"x">(4400, 505548325627087523L ^ var4), 5, false, var6, (char)var7, (short)var8);
   }

   public _y4 N(Object[] var1) {
      Object var2 = var1[0];
      return (_y4)this.R.get(var2);
   }

   public synchronized List i(long param1, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ax.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 18046062943119
      // 0b: lxor
      // 0c: lstore 5
      // 0e: pop2
      // 0f: ldc2_w 8330695819380222616
      // 12: lload 1
      // 13: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: getfield com/zelix/ax.R Ljava/util/Map;
      // 1c: aload 3
      // 1d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 22: checkcast com/zelix/_y4
      // 25: astore 8
      // 27: astore 7
      // 29: aload 8
      // 2b: aload 7
      // 2d: ifnonnull 4e
      // 30: ifnonnull 4c
      // 33: goto 40
      // 36: ldc2_w 8384623261118744956
      // 39: lload 1
      // 3a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aconst_null
      // 41: areturn
      // 42: ldc2_w 8384623261118744956
      // 45: lload 1
      // 46: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 8
      // 4e: aload 4
      // 50: lload 5
      // 52: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 55: areturn
   }

   public ax(int var1, int var2, char var3, int var4, short var5, int var6) {
      long var7 = ((long)var3 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      long var10001 = var7 ^ 59021975867422L;
      int var9 = (int)((var7 ^ 59021975867422L) >>> 32);
      int var10 = (int)((var7 ^ 59021975867422L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      this(var1, var2, var4, false, var9, (char)var10, (short)var11);
   }

   public ax(short var1, boolean var2, int var3, char var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 89637018446110L;
      int var7 = (int)((var5 ^ 89637018446110L) >>> 32);
      int var8 = (int)((var5 ^ 89637018446110L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      this(a<"x">(13143, 2223435407958342685L ^ var5), a<"x">(14882, 4919346419239908714L ^ var5), 5, var2, var7, (char)var8, (short)var9);
   }

   public int Z(Object[] var1) {
      return this.R.size();
   }

   public ax(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 33104224692973L;
      int var4 = (int)((var2 ^ 33104224692973L) >>> 32);
      int var5 = (int)((var2 ^ 33104224692973L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this(var1, a<"x">(4400, 505639516053101960L ^ var2), 5, false, var4, (char)var5, (short)var6);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized void o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 116176080870657L;
      Collection var7 = this.R.values();
      String var10000 = x44.a<"t">(1429237104999140049L, var2);
      Iterator var8 = var7.iterator();
      String var6 = var10000;

      label43:
      while (var8.hasNext()) {
         _y4 var9 = (_y4)var8.next();

         try {
            x44.a<"l">(var9, new Object[]{var4}, 815739412612617895L, var2);
         } catch (gj var11) {
            boolean var10001 = false;
            throw x44.a<"t">(var11, 1447082955930380597L, var2);
         }

         while (true) {
            try {
               var10000 = var6;
               if (var2 > 0L) {
                  if (var6 != null) {
                     return;
                  }

                  var10000 = var6;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var10) {
               boolean var15 = false;
               throw x44.a<"t">(var10, 1447082955930380597L, var2);
            }

            if (var2 > 0L) {
               break label43;
            }
         }
      }

      this.R.clear();
   }

   public _y4 X(Object[] var1) {
      Object var2 = var1[0];
      return (_y4)this.R.remove(var2);
   }

   public synchronized boolean f(Object[] var1) {
      long var5 = (Long)var1[0];
      Object var3 = var1[1];
      Object var2 = var1[2];
      Object var4 = var1[3];
      var5 = a ^ var5;
      long var7 = var5 ^ 36397737344741L;
      String var10000 = x44.a<"r">(6612405689725436615L, var5);
      _y4 var10 = (_y4)this.R.get(var3);
      String var9 = var10000;

      try {
         if (var9 != null) {
            return x44.a<"j">(var10, new Object[]{var7, var2, var4}, 6618236193342737728L, var5);
         }

         if (var10 == null) {
            return false;
         }
      } catch (gj var11) {
         throw x44.a<"r">(var11, 6630215832315355427L, var5);
      }

      return x44.a<"j">(var10, new Object[]{var7, var2, var4}, 6618236193342737728L, var5);
   }

   public boolean H(Object[] var1) {
      Object var2 = var1[0];
      return this.R.containsKey(var2);
   }

   public ax(int param1, int param2, int param3, boolean param4, int param5, char param6, short param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 5
      // 02: i2l
      // 03: bipush 32
      // 05: lshl
      // 06: iload 6
      // 08: i2l
      // 09: bipush 48
      // 0b: lshl
      // 0c: bipush 32
      // 0e: lushr
      // 0f: lor
      // 10: iload 7
      // 12: i2l
      // 13: bipush 48
      // 15: lshl
      // 16: bipush 48
      // 18: lushr
      // 19: lor
      // 1a: getstatic com/zelix/ax.a J
      // 1d: lxor
      // 1e: lstore 8
      // 20: lload 8
      // 22: dup2
      // 23: ldc2_w 84836951139298
      // 26: lxor
      // 27: lstore 10
      // 29: dup2
      // 2a: ldc2_w 12111135042169
      // 2d: lxor
      // 2e: lstore 12
      // 30: pop2
      // 31: aload 0
      // 32: invokespecial java/lang/Object.<init> ()V
      // 35: ldc2_w -4495007810716182374
      // 38: lload 8
      // 3a: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: iload 2
      // 41: ldc2_w -4196861474231446599
      // 44: lload 8
      // 46: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: astore 14
      // 4d: aload 0
      // 4e: iload 3
      // 4f: ldc2_w -2451438480828659372
      // 52: lload 8
      // 54: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: aload 0
      // 5a: iload 4
      // 5c: aload 14
      // 5e: ifnonnull b0
      // 61: putfield com/zelix/ax.P Z
      // 64: iload 4
      // 66: ifeq 9b
      // 69: goto 77
      // 6c: ldc2_w -4152811518575019138
      // 6f: lload 8
      // 71: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: aload 0
      // 78: new java/util/concurrent/ConcurrentHashMap
      // 7b: dup
      // 7c: iload 1
      // 7d: lload 12
      // 7f: invokestatic com/zelix/sh.Q (IJ)I
      // 82: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 85: putfield com/zelix/ax.R Ljava/util/Map;
      // 88: aload 14
      // 8a: ifnull d4
      // 8d: goto 9b
      // 90: ldc2_w -4152811518575019138
      // 93: lload 8
      // 95: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 0
      // 9c: iload 1
      // 9d: lload 12
      // 9f: invokestatic com/zelix/sh.Q (IJ)I
      // a2: goto b0
      // a5: ldc2_w -4152811518575019138
      // a8: lload 8
      // aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: lload 10
      // b2: bipush 2
      // b3: anewarray 166
      // b6: dup_x2
      // b7: dup_x2
      // b8: pop
      // b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bc: bipush 1
      // bd: swap
      // be: aastore
      // bf: dup_x1
      // c0: swap
      // c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c4: bipush 0
      // c5: swap
      // c6: aastore
      // c7: ldc2_w -2458443068387501486
      // ca: lload 8
      // cc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: putfield com/zelix/ax.R Ljava/util/Map;
      // d4: return
   }

   public Set E(Object[] var1) {
      return this.R.entrySet();
   }

   public synchronized List s(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var5 = var1[1];
      Object var2 = var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 138456676467212L;
      String var10000 = x44.a<"u">(-1595150828057202472L, var3);
      _y4 var9 = (_y4)this.R.get(var5);
      String var8 = var10000;

      try {
         if (var8 != null) {
            return x44.a<"m">(var9, new Object[]{var2, var6}, -767697193730531524L, var3);
         }

         if (var9 == null) {
            return null;
         }
      } catch (gj var10) {
         throw x44.a<"u">(var10, -1289055205136903364L, var3);
      }

      return x44.a<"m">(var9, new Object[]{var2, var6}, -767697193730531524L, var3);
   }

   static {
      long var0 = a ^ 94554445686739L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "¡`s\u0086}¼\u0088ûò¦«UR\u0091\u0099c";
      int var7 = "¡`s\u0086}¼\u0088ûò¦«UR\u0091\u0099c".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "9nYÂFüVãl\u0007I~,ZÑð";
                  var7 = "9nYÂFüVãl\u0007I~,ZÑð".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30547;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ax", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/ax" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
