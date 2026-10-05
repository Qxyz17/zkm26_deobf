package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _n8 {
   private Map z;
   private pg s;
   private pg H;
   private List g;
   private String T;
   private Map S;
   private static final long a = ess.a(-3549762396514796769L, 2743888602328967837L, MethodHandles.lookup().lookupClass()).a(276096574714924L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_n8.a J
      // 03: ldc2_w 135217281590641
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -6619948417270902358
      // 0b: lload 1
      // 0c: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: new java/lang/StringBuilder
      // 14: dup
      // 15: invokespecial java/lang/StringBuilder.<init> ()V
      // 18: astore 4
      // 1a: aload 0
      // 1b: ldc2_w -6774014503450655851
      // 1e: lload 1
      // 1f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: invokeinterface java/util/List.size ()I 1
      // 29: istore 5
      // 2b: bipush 0
      // 2c: istore 6
      // 2e: astore 3
      // 2f: iload 6
      // 31: iload 5
      // 33: if_icmpge a0
      // 36: aload 0
      // 37: ldc2_w -6774014503450655851
      // 3a: lload 1
      // 3b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: iload 6
      // 42: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 47: astore 7
      // 49: aload 3
      // 4a: ifnonnull 80
      // 4d: aload 7
      // 4f: instanceof com/zelix/pg
      // 52: ifeq 84
      // 55: goto 62
      // 58: ldc2_w -6614017137650113832
      // 5b: lload 1
      // 5c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 4
      // 64: aload 7
      // 66: checkcast com/zelix/pg
      // 69: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 6c: checkcast java/lang/String
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -6614017137650113832
      // 79: lload 1
      // 7a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 3
      // 81: ifnull 99
      // 84: aload 4
      // 86: aload 7
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8b: pop
      // 8c: goto 99
      // 8f: ldc2_w -6614017137650113832
      // 92: lload 1
      // 93: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: iinc 6 1
      // 9c: aload 3
      // 9d: ifnull 2f
      // a0: aload 4
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: astore 6
      // a7: aload 6
      // a9: areturn
   }

   public _n8(long var1, int var3) {
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      super();
      x44.a<"q">(this, new ArrayList(a<"w">(19144, 3563380091021660254L ^ var4)), 5676182713651440813L, var4);
   }

   public Enumeration e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"m">(this, 5649278394721614242L, var2) != null) {
            return Collections.enumeration(new ArrayList(x44.a<"m">(this, 5649278394721614242L, var2).keySet()));
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, 5223465022791290515L, var2);
      }

      return new ri();
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 5231760818938233121L, var2);
   }

   public String p(Object[] param1) {
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
      // 0c: getstatic com/zelix/_n8.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8800658586171232169
      // 15: lload 2
      // 16: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w 9085477413855900097
      // 21: lload 2
      // 22: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 56
      // 2c: ifnull 5a
      // 2f: goto 3c
      // 32: ldc2_w 8806021416971812059
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 9085477413855900097
      // 40: lload 2
      // 41: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 49: goto 56
      // 4c: ldc2_w 8806021416971812059
      // 4f: lload 2
      // 50: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: checkcast java/lang/String
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
   }

   public void h(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/_n8.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 7416721842639557478
      // 1c: lload 3
      // 1d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 5
      // 24: aload 2
      // 25: invokevirtual java/lang/String.length ()I
      // 28: aload 5
      // 2a: ifnonnull 5a
      // 2d: ifle 5b
      // 30: goto 3d
      // 33: ldc2_w 7420244099833602068
      // 36: lload 3
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: ldc2_w 7147660618474651993
      // 41: lload 3
      // 42: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 2
      // 48: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4d: goto 5a
      // 50: ldc2_w 7420244099833602068
      // 53: lload 3
      // 54: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: pop
      // 5b: return
   }

   public boolean w(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/_n8.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 54995701299275
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w 554014687162675771
      // 30: lload 4
      // 32: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: astore 8
      // 39: aload 0
      // 3a: ldc2_w 124976959885080184
      // 3d: lload 4
      // 3f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: aload 8
      // 46: ifnonnull 79
      // 49: ifnull da
      // 4c: goto 5a
      // 4f: ldc2_w 551476435995476297
      // 52: lload 4
      // 54: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: ldc2_w 124976959885080184
      // 5e: lload 4
      // 60: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: aload 3
      // 66: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6b: goto 79
      // 6e: ldc2_w 551476435995476297
      // 71: lload 4
      // 73: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: checkcast com/zelix/pg
      // 7c: astore 9
      // 7e: aload 9
      // 80: aload 8
      // 82: ifnonnull cc
      // 85: ifnull d8
      // 88: goto 96
      // 8b: ldc2_w 551476435995476297
      // 8e: lload 4
      // 90: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: aload 0
      // 97: ldc2_w 124976959885080184
      // 9a: lload 4
      // 9c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: aload 2
      // a2: aload 9
      // a4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a9: pop
      // aa: aload 0
      // ab: ldc2_w 211952265077271222
      // ae: lload 4
      // b0: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: aload 3
      // b6: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // bb: checkcast com/zelix/pg
      // be: goto cc
      // c1: ldc2_w 551476435995476297
      // c4: lload 4
      // c6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: athrow
      // cc: astore 10
      // ce: aload 10
      // d0: lload 6
      // d2: aload 2
      // d3: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // d6: bipush 1
      // d7: ireturn
      // d8: bipush 0
      // d9: ireturn
      // da: bipush 0
      // db: ireturn
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/_n8.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 7392599715389
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -2411652280293790973
      // 25: lload 3
      // 26: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: new com/zelix/pg
      // 2e: dup
      // 2f: lload 5
      // 31: aload 2
      // 32: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 35: astore 8
      // 37: astore 7
      // 39: aload 0
      // 3a: aload 7
      // 3c: ifnonnull 95
      // 3f: ldc2_w -2685211017971067541
      // 42: lload 3
      // 43: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: ifnonnull 87
      // 4b: goto 58
      // 4e: ldc2_w -2405086513739097999
      // 51: lload 3
      // 52: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: aload 2
      // 5a: ldc2_w -2426702868688381975
      // 5d: lload 3
      // 5e: invokedynamic p (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 0
      // 64: aload 8
      // 66: ldc2_w -2685211017971067541
      // 69: lload 3
      // 6a: invokedynamic p (Ljava/lang/Object;Lcom/zelix/pg;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: lload 3
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle b2
      // 75: aload 7
      // 77: ifnull a0
      // 7a: goto 87
      // 7d: ldc2_w -2405086513739097999
      // 80: lload 3
      // 81: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 0
      // 88: goto 95
      // 8b: ldc2_w -2405086513739097999
      // 8e: lload 3
      // 8f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 8
      // 97: ldc2_w -4392574811760921639
      // 9a: lload 3
      // 9b: invokedynamic p (Ljava/lang/Object;Lcom/zelix/pg;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: aload 0
      // a1: ldc2_w -2642208590177126084
      // a4: lload 3
      // a5: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: aload 8
      // ac: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // b1: pop
      // b2: return
   }

   public void m(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 125645206364978L;
      x44.a<"n">(this, -2811054413484222678L, var3).G(var5, var2);
   }

   public void I(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/_n8.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 56595399552727
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 17030189498076
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: ldc2_w 5650081031730068450
      // 02c: lload 3
      // 02d: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: astore 9
      // 034: aload 0
      // 035: ldc2_w 6047060787406299960
      // 038: lload 3
      // 039: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: ifnonnull 06c
      // 041: new com/zelix/_s2
      // 044: dup
      // 045: new java/lang/StringBuilder
      // 048: dup
      // 049: invokespecial java/lang/StringBuilder.<init> ()V
      // 04c: getstatic com/zelix/_n8.b Ljava/lang/String;
      // 04f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 052: aload 2
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 056: ldc "'"
      // 058: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05e: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // 061: athrow
      // 062: ldc2_w 5656067355417839760
      // 065: lload 3
      // 066: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: ldc2_w 5377803134055216547
      // 06f: lload 3
      // 070: invokedynamic k (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ifeq 07d
      // 078: aload 2
      // 079: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 07c: astore 2
      // 07d: new com/zelix/pg
      // 080: dup
      // 081: lload 7
      // 083: aload 2
      // 084: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 087: astore 10
      // 089: aload 0
      // 08a: ldc2_w 6047060787406299960
      // 08d: lload 3
      // 08e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 096: checkcast java/lang/String
      // 099: astore 11
      // 09b: aload 0
      // 09c: ldc2_w 5415682838711919471
      // 09f: lload 3
      // 0a0: lload 3
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 170
      // 0a6: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 9
      // 0ad: ifnonnull 16a
      // 0b0: ifnonnull 13b
      // 0b3: goto 0c0
      // 0b6: ldc2_w 5656067355417839760
      // 0b9: lload 3
      // 0ba: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: sipush 12879
      // 0c4: ldc2_w 4706847340499791274
      // 0c7: lload 3
      // 0c8: lxor
      // 0c9: invokedynamic w (IJ)I bsm=com/zelix/_n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: lload 5
      // 0d0: bipush 2
      // 0d1: anewarray 70
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 1
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: ldc2_w 5824462047697721191
      // 0e8: lload 3
      // 0e9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: ldc2_w 5415682838711919471
      // 0f1: lload 3
      // 0f2: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: aload 0
      // 0f8: sipush 4506
      // 0fb: ldc2_w 8943108597543751293
      // 0fe: lload 3
      // 0ff: lxor
      // 100: invokedynamic w (IJ)I bsm=com/zelix/_n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: lload 5
      // 107: bipush 2
      // 108: anewarray 70
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w 5824462047697721191
      // 11f: lload 3
      // 120: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: ldc2_w 5216679429925879713
      // 128: lload 3
      // 129: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: goto 13b
      // 131: ldc2_w 5656067355417839760
      // 134: lload 3
      // 135: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 0
      // 13c: ldc2_w 5415682838711919471
      // 13f: lload 3
      // 140: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 11
      // 147: aload 0
      // 148: ldc2_w 6047060787406299960
      // 14b: lload 3
      // 14c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 156: pop
      // 157: aload 0
      // 158: ldc2_w 5216679429925879713
      // 15b: lload 3
      // 15c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: aload 11
      // 163: aload 10
      // 165: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 16a: pop
      // 16b: aload 0
      // 16c: ldc2_w 5455535411518712285
      // 16f: lload 3
      // 170: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: aload 10
      // 177: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17c: pop
      // 17d: return
   }

   public pg o(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/_n8.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -5387314474270687049
      // 1d: lload 2
      // 1e: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 0
      // 26: ldc2_w -5534877172723464972
      // 29: lload 2
      // 2a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 5
      // 31: ifnonnull 62
      // 34: ifnull 66
      // 37: goto 44
      // 3a: ldc2_w -5392190226520411195
      // 3d: lload 2
      // 3e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 0
      // 45: ldc2_w -5534877172723464972
      // 48: lload 2
      // 49: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: aload 4
      // 50: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 55: goto 62
      // 58: ldc2_w -5392190226520411195
      // 5b: lload 2
      // 5c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: checkcast com/zelix/pg
      // 65: areturn
      // 66: aconst_null
      // 67: areturn
   }

   static {
      long var11 = a ^ 69236024434662L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("ú§\u0014Tí\u0005|Û\u008fôfþÅ|5\u009e\u00adw\u0091È\u0002Hn| ëÿk¯\u0089°\u008ed?À-µ\u0095ÔB".getBytes("ISO-8859-1"));
      String var19 = a(var15).intern();
      int var10001 = -1;
      b = var19;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\u0018átqD³\rÂåf\u0003kI&Àñ¸\u0098ô¾þ`\u001d5";
      int var5 = "\u0018átqD³\rÂåf\u0003kI&Àñ¸\u0098ô¾þ`\u001d5".length();
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
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      c = var6;
      d = new Integer[3];
   }

   private static gj a(gj var0) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 406;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_n8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("com/zelix/_n8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
