package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l0 {
   ConcurrentHashMap V;
   int q;
   int M;
   private static final long a = ess.a(6205279951253369993L, 8804623042341543808L, MethodHandles.lookup().lookupClass()).a(147371500142012L);
   private static final long b;

   public Enumeration k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this.V, -3728531148672685476L, var2);
   }

   public l0(short var1, int var2, int var3, int var4, char var5, int var6) {
      long var7 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 33086561281872L;
      super();
      x44.a<"u">(this, var3, 6178237231404655457L, var7);
      x44.a<"u">(this, var6, 5960159965574626460L, var7);
      this.V = new ConcurrentHashMap(sh.Q(var2, var9));
   }

   public Map Y(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/l0.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: ldc2_w 4066049555237118313
      // 26: lload 4
      // 28: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 0
      // 2e: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // 31: aload 2
      // 32: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 35: checkcast com/zelix/_8z
      // 38: astore 7
      // 3a: astore 6
      // 3c: aload 7
      // 3e: aload 6
      // 40: ifnonnull 63
      // 43: ifnonnull 61
      // 46: goto 54
      // 49: ldc2_w 2323048316030578519
      // 4c: lload 4
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aconst_null
      // 55: areturn
      // 56: ldc2_w 2323048316030578519
      // 59: lload 4
      // 5b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 7
      // 63: aload 3
      // 64: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 67: areturn
   }

   public _8z S(Object[] var1) {
      Object var2 = var1[0];
      return (_8z)this.V.get(var2);
   }

   public Object C(long var1, Object var3, Object var4, Object var5, Object var6) {
      var1 = a ^ var1;
      long var7 = var1 ^ 78116409732223L;
      long var10001 = var1 ^ 100484297788747L;
      int var9 = (int)((var1 ^ 100484297788747L) >>> 32);
      int var10 = (int)((var1 ^ 100484297788747L) << 32 >>> 56);
      int var11 = (int)(var10001 << 40 >>> 40);
      String var10000 = x44.a<"u">(-5258806476953899520L, var1);
      _8z var13 = (_8z)this.V.get(var3);
      String var12 = var10000;

      label27: {
         try {
            if (var12 != null) {
               return var13;
            }

            if (var13 == null) {
               break label27;
            }
         } catch (gj var15) {
            throw x44.a<"u">(var15, -5812926684034572226L, var1);
         }

         return var13.s(var4, var5, var6, var9, (byte)var10, var11);
      }

      var13 = new _8z(var7, x44.a<"i">(this, -5904528648405362478L, var1), x44.a<"i">(this, -6267364074677500113L, var1));
      Object var14 = var13.s(var4, var5, var6, var9, (byte)var10, var11);
      x44.a<"m">(this.V, var3, var13, -5506579886285900573L, var1);
      return var14;
   }

   public boolean x(Object[] param1) {
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
      // 0c: checkcast java/lang/Object
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: getstatic com/zelix/l0.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: ldc2_w 7126931735360076771
      // 25: lload 2
      // 26: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 0
      // 2c: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // 2f: aload 4
      // 31: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 34: checkcast com/zelix/_8z
      // 37: astore 7
      // 39: astore 6
      // 3b: aload 7
      // 3d: aload 6
      // 3f: ifnonnull 60
      // 42: ifnonnull 5e
      // 45: goto 52
      // 48: ldc2_w 8842624365074920925
      // 4b: lload 2
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: ldc2_w 8842624365074920925
      // 57: lload 2
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 7
      // 60: aload 5
      // 62: invokevirtual com/zelix/_8z.g (Ljava/lang/Object;)Z
      // 65: ireturn
   }

   public l0(long var1, int var3, int var4) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 135839614992595L;
      int var5 = (int)((var1 ^ 135839614992595L) >>> 48);
      int var6 = (int)((var1 ^ 135839614992595L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this((short)var5, var3, var4, var6, (char)var7, 5);
   }

   public _8z P(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      var3 = a ^ var3;
      return (_8z)x44.a<"o">(this.V, var2, 4574135568923253709L, var3);
   }

   public Object h(Object[] param1) {
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
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 4
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Object
      // 1a: astore 2
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/Object
      // 21: astore 3
      // 22: pop
      // 23: getstatic com/zelix/l0.a J
      // 26: lload 4
      // 28: lxor
      // 29: lstore 4
      // 2b: lload 4
      // 2d: dup2
      // 2e: ldc2_w 119397601513968
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w -5378260967666897832
      // 38: lload 4
      // 3a: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // 43: aload 6
      // 45: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 48: checkcast com/zelix/_8z
      // 4b: astore 10
      // 4d: astore 9
      // 4f: aload 10
      // 51: aload 9
      // 53: ifnonnull 9c
      // 56: ifnull e6
      // 59: goto 67
      // 5c: ldc2_w -5977342679581400474
      // 5f: lload 4
      // 61: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 10
      // 69: aload 2
      // 6a: lload 7
      // 6c: aload 3
      // 6d: bipush 3
      // 6e: anewarray 85
      // 71: dup_x1
      // 72: swap
      // 73: bipush 2
      // 74: swap
      // 75: aastore
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 1
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x1
      // 80: swap
      // 81: bipush 0
      // 82: swap
      // 83: aastore
      // 84: ldc2_w -6085876732432152464
      // 87: lload 4
      // 89: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: goto 9c
      // 91: ldc2_w -5977342679581400474
      // 94: lload 4
      // 96: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: astore 11
      // 9e: aload 10
      // a0: aload 9
      // a2: ifnonnull e5
      // a5: bipush 0
      // a6: anewarray 85
      // a9: ldc2_w -5211495720325659365
      // ac: lload 4
      // ae: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: ifne e3
      // b6: goto c4
      // b9: ldc2_w -5977342679581400474
      // bc: lload 4
      // be: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: aload 0
      // c5: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // c8: aload 6
      // ca: ldc2_w -5451339605338500881
      // cd: lload 4
      // cf: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: pop
      // d5: goto e3
      // d8: ldc2_w -5977342679581400474
      // db: lload 4
      // dd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: athrow
      // e3: aload 11
      // e5: areturn
      // e6: aconst_null
      // e7: areturn
   }

   public l0(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 127596325319567L;
      int var4 = (int)((var2 ^ 127596325319567L) >>> 48);
      int var5 = (int)((var2 ^ 127596325319567L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      this((short)var4, var1, (int)b, var5, (char)var6, 5);
   }

   public Object U(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/Object
      // 21: astore 6
      // 23: pop
      // 24: getstatic com/zelix/l0.a J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: ldc2_w -6987129534104631796
      // 2d: lload 2
      // 2e: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // 37: aload 4
      // 39: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: checkcast com/zelix/_8z
      // 3f: astore 8
      // 41: astore 7
      // 43: aload 8
      // 45: aload 7
      // 47: ifnonnull 68
      // 4a: ifnonnull 66
      // 4d: goto 5a
      // 50: ldc2_w -8694172619578750926
      // 53: lload 2
      // 54: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aconst_null
      // 5b: areturn
      // 5c: ldc2_w -8694172619578750926
      // 5f: lload 2
      // 60: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 8
      // 68: aload 5
      // 6a: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 6d: astore 9
      // 6f: aload 9
      // 71: aload 7
      // 73: ifnonnull 9b
      // 76: ifnonnull 92
      // 79: goto 86
      // 7c: ldc2_w -8694172619578750926
      // 7f: lload 2
      // 80: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aconst_null
      // 87: areturn
      // 88: ldc2_w -8694172619578750926
      // 8b: lload 2
      // 8c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: aload 9
      // 94: aload 6
      // 96: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 9b: areturn
   }

   public boolean A(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Object
      // 18: astore 6
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Object
      // 20: astore 5
      // 22: pop
      // 23: getstatic com/zelix/l0.a J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 8270913308635
      // 2e: lxor
      // 2f: lstore 7
      // 31: pop2
      // 32: ldc2_w 8316075658952403564
      // 35: lload 3
      // 36: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: aload 0
      // 3c: getfield com/zelix/l0.V Ljava/util/concurrent/ConcurrentHashMap;
      // 3f: aload 2
      // 40: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 43: checkcast com/zelix/_8z
      // 46: astore 10
      // 48: astore 9
      // 4a: aload 10
      // 4c: aload 9
      // 4e: ifnonnull 6f
      // 51: ifnonnull 6d
      // 54: goto 61
      // 57: ldc2_w 7725925598357890130
      // 5a: lload 3
      // 5b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: bipush 0
      // 62: ireturn
      // 63: ldc2_w 7725925598357890130
      // 66: lload 3
      // 67: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 10
      // 6f: aload 6
      // 71: lload 7
      // 73: aload 5
      // 75: bipush 3
      // 76: anewarray 85
      // 79: dup_x1
      // 7a: swap
      // 7b: bipush 2
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x2
      // 7f: dup_x2
      // 80: pop
      // 81: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 84: bipush 1
      // 85: swap
      // 86: aastore
      // 87: dup_x1
      // 88: swap
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w 8331538390473858557
      // 8f: lload 3
      // 90: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: ireturn
   }

   static {
      long var0 = a ^ 103250655343278L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 7247179812615162221L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
