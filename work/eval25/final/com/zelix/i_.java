package com.zelix;

import java.io.DataOutputStream;
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

public class i_ extends i2 {
   private mx N;
   static _8z t;
   private ir p;
   private static final long a = ess.a(6263923541960440564L, -4359212627072414744L, MethodHandles.lookup().lookupClass()).a(81552665384724L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   String m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 44380071024048L;
      return x44.a<"i">(this, -8383790606780651550L, var2).N(var4);
   }

   public void J(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 5
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 129683512282286
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -5735359121590942685
      // 30: lload 2
      // 31: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 6
      // 38: aload 0
      // 39: lload 7
      // 3b: bipush 1
      // 3c: anewarray 277
      // 3f: dup_x2
      // 40: dup_x2
      // 41: pop
      // 42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45: bipush 0
      // 46: swap
      // 47: aastore
      // 48: ldc2_w -6026818023045852765
      // 4b: lload 2
      // 4c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 54: istore 9
      // 56: aload 4
      // 58: aload 0
      // 59: ldc2_w -5252665576362009762
      // 5c: lload 2
      // 5d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 67: checkcast com/zelix/mx
      // 6a: checkcast com/zelix/mx
      // 6d: astore 10
      // 6f: iload 9
      // 71: ifne 9d
      // 74: aload 10
      // 76: ifnull a8
      // 79: goto 86
      // 7c: ldc2_w -5593304945229737370
      // 7f: lload 2
      // 80: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 6
      // 88: aload 10
      // 8a: invokevirtual com/zelix/mx.B ()I
      // 8d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 90: goto 9d
      // 93: ldc2_w -5593304945229737370
      // 96: lload 2
      // 97: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: lload 2
      // 9e: lconst_0
      // 9f: lcmp
      // a0: iflt ba
      // a3: iload 9
      // a5: ifeq c7
      // a8: aload 6
      // aa: aload 0
      // ab: ldc2_w -5252665576362009762
      // ae: lload 2
      // af: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: invokevirtual com/zelix/mx.B ()I
      // b7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // ba: goto c7
      // bd: ldc2_w -5593304945229737370
      // c0: lload 2
      // c1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: return
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -4813852749984134795
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: iload 8
      // 2a: ifne 58
      // 2d: ldc2_w -5022389529887435256
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -4668335191447871696
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -4668335191447871696
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -5022389529887435256
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   public void k(Object[] var1) {
      _ug var2 = (_ug)var1[0];
      long var5 = (Long)var1[1];
      ei var4 = (ei)var1[2];
      _ur var3 = (_ur)var1[3];
      long var7 = var5 ^ 123055972984343L;
      long var9 = var5 ^ 99693718529540L;
      long var10001 = var5 ^ 40789535935972L;
      int var11 = (int)((var5 ^ 40789535935972L) >>> 48);
      int var12 = (int)((var5 ^ 40789535935972L) << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var5 ^ 100261124664742L;
      boolean var10000 = x44.a<"t">(-4358741141721122874L, var5);
      _yp var17 = (_yp)x44.a<"m">(-2779535365934003339L, var5)
         .R(
            x44.a<"l">(this, new Object[]{var14}, -4410755069826928167L, var5),
            (char)var11,
            var12,
            x44.a<"l">(this, new Object[]{var7}, -2461612451433867575L, var5),
            var13
         );
      boolean var16 = var10000;

      label32: {
         try {
            var21 = var17;
            if (var16) {
               break label32;
            }

            if (var17 == null) {
               return;
            }
         } catch (gj var20) {
            throw x44.a<"t">(var20, -4501950861857578621L, var5);
         }

         var21 = var17;
      }

      if (var21 == x44.a<"m">(-2614000040020730321L, var5)) {
         ir var18 = x44.a<"j">(this, new Object[]{var9}, -2389429721521193434L, var5);

         try {
            if (var5 > 0L && var18 != null) {
               x44.a<"w">(this, var18, -2771265910301885740L, var5);
            }
         } catch (gj var19) {
            throw x44.a<"t">(var19, -4501950861857578621L, var5);
         }
      }
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void s(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 111534839130684L;
      var4.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var2));
      var4.writeShort(x44.a<"o">(this, 1263498280992292300L, var2).B());
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"k">(7642, 5621929732856559058L ^ var2);
   }

   void o(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"o">(this, -7428447692698733396L, var3).v(var2);
   }

   boolean r(Object[] var1) {
      return false;
   }

   public void B(Object[] param1) {
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
      // 0e: checkcast java/util/Set
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 13860179763599
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 79403236548483
      // 20: lxor
      // 21: lstore 7
      // 23: dup2
      // 24: ldc2_w 8239758219067
      // 27: lxor
      // 28: lstore 9
      // 2a: pop2
      // 2b: ldc2_w -5968474420302013119
      // 2e: lload 2
      // 2f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: istore 11
      // 36: aload 0
      // 37: iload 11
      // 39: ifeq 72
      // 3c: lload 5
      // 3e: bipush 1
      // 3f: anewarray 277
      // 42: dup_x2
      // 43: dup_x2
      // 44: pop
      // 45: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: ldc2_w -5683195001731015253
      // 4e: lload 2
      // 4f: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: ifeq e3
      // 57: goto 64
      // 5a: ldc2_w -5594689151504592291
      // 5d: lload 2
      // 5e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 0
      // 65: goto 72
      // 68: ldc2_w -5594689151504592291
      // 6b: lload 2
      // 6c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: ldc2_w -5250645836501214363
      // 75: lload 2
      // 76: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 7e: lload 9
      // 80: dup2_x1
      // 81: pop2
      // 82: bipush 2
      // 83: anewarray 277
      // 86: dup_x1
      // 87: swap
      // 88: bipush 1
      // 89: swap
      // 8a: aastore
      // 8b: dup_x2
      // 8c: dup_x2
      // 8d: pop
      // 8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 91: bipush 0
      // 92: swap
      // 93: aastore
      // 94: ldc2_w -5988670857264831064
      // 97: lload 2
      // 98: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: astore 12
      // 9f: aload 12
      // a1: iload 11
      // a3: ifeq b8
      // a6: ifnull e3
      // a9: goto b6
      // ac: ldc2_w -5594689151504592291
      // af: lload 2
      // b0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: aload 12
      // b8: lload 7
      // ba: dup2_x1
      // bb: pop2
      // bc: invokestatic com/zelix/yn.x (JLjava/lang/String;)Lcom/zelix/hz;
      // bf: astore 13
      // c1: lload 2
      // c2: lconst_0
      // c3: lcmp
      // c4: ifle d6
      // c7: aload 13
      // c9: ifnull e3
      // cc: aload 4
      // ce: aload 13
      // d0: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // d5: pop
      // d6: goto e3
      // d9: ldc2_w -5594689151504592291
      // dc: lload 2
      // dd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: athrow
      // e3: return
   }

   public void p(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 93818366126755
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 864055557601181625
      // 18: lload 2
      // 19: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: ldc2_w 1294052221052236459
      // 24: lload 2
      // 25: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: iload 6
      // 2c: ifne 68
      // 2f: ifnull a9
      // 32: goto 3f
      // 35: ldc2_w 719100940973959676
      // 38: lload 2
      // 39: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: iload 6
      // 42: ifne 8e
      // 45: goto 52
      // 48: ldc2_w 719100940973959676
      // 4b: lload 2
      // 4c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: ldc2_w 1294052221052236459
      // 55: lload 2
      // 56: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: goto 68
      // 5e: ldc2_w 719100940973959676
      // 61: lload 2
      // 62: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: lload 4
      // 6a: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // 6d: aload 0
      // 6e: ldc2_w 900892323150733508
      // 71: lload 2
      // 72: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 7a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7d: ifne a9
      // 80: aload 0
      // 81: goto 8e
      // 84: ldc2_w 719100940973959676
      // 87: lload 2
      // 88: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: ldc2_w 900892323150733508
      // 91: lload 2
      // 92: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: aload 0
      // 98: ldc2_w 1294052221052236459
      // 9b: lload 2
      // 9c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: lload 4
      // a3: invokevirtual com/zelix/ir.w (J)Ljava/lang/String;
      // a6: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // a9: return
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"k">(this, -4761282759813885528L, var1).O(var4, var3, this, this.x());
   }

   public void r(Object[] param1) {
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
      // 00e: checkcast java/util/HashMap
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/HashMap
      // 018: astore 5
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 5432784367991
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 127891530335893
      // 027: lxor
      // 028: lstore 8
      // 02a: dup2
      // 02b: ldc2_w 85175906338036
      // 02e: lxor
      // 02f: lstore 10
      // 031: dup2
      // 032: ldc2_w 85774077581956
      // 035: lxor
      // 036: dup2
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 12
      // 03d: dup2
      // 03e: bipush 16
      // 040: lshl
      // 041: bipush 32
      // 043: lushr
      // 044: l2i
      // 045: istore 13
      // 047: dup2
      // 048: bipush 48
      // 04a: lshl
      // 04b: bipush 48
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 14
      // 051: pop2
      // 052: dup2
      // 053: ldc2_w 52999965145798
      // 056: lxor
      // 057: lstore 15
      // 059: pop2
      // 05a: ldc2_w -3106693066594656090
      // 05d: lload 3
      // 05e: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: ldc2_w -3599097019366482923
      // 066: lload 3
      // 067: invokedynamic m (JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 0
      // 06d: lload 15
      // 06f: bipush 1
      // 070: anewarray 277
      // 073: dup_x2
      // 074: dup_x2
      // 075: pop
      // 076: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 079: bipush 0
      // 07a: swap
      // 07b: aastore
      // 07c: ldc2_w -3050710761453754695
      // 07f: lload 3
      // 080: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: lload 6
      // 088: bipush 1
      // 089: anewarray 277
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w -3839613766564380247
      // 098: lload 3
      // 099: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: iload 12
      // 0a0: i2c
      // 0a1: swap
      // 0a2: iload 13
      // 0a4: swap
      // 0a5: iload 14
      // 0a7: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 0aa: checkcast com/zelix/_yp
      // 0ad: astore 18
      // 0af: istore 17
      // 0b1: aload 18
      // 0b3: iload 17
      // 0b5: ifne 0ca
      // 0b8: ifnull 0ef
      // 0bb: goto 0c8
      // 0be: ldc2_w -2961767043208628509
      // 0c1: lload 3
      // 0c2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 18
      // 0ca: ldc2_w -3508931531073422083
      // 0cd: lload 3
      // 0ce: invokedynamic m (JJ)Lcom/zelix/_yp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual com/zelix/_yp.equals (Ljava/lang/Object;)Z
      // 0d6: iload 17
      // 0d8: ifne 0ec
      // 0db: ifeq 0ef
      // 0de: goto 0eb
      // 0e1: ldc2_w -2961767043208628509
      // 0e4: lload 3
      // 0e5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: bipush 1
      // 0ec: goto 0f0
      // 0ef: bipush 0
      // 0f0: istore 19
      // 0f2: aload 0
      // 0f3: ldc2_w -3197575365644550181
      // 0f6: lload 3
      // 0f7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 0ff: astore 20
      // 101: iload 19
      // 103: ifeq 167
      // 106: aload 20
      // 108: aload 2
      // 109: bipush 1
      // 10a: lload 8
      // 10c: bipush 4
      // 10d: anewarray 277
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 3
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11e: bipush 2
      // 11f: swap
      // 120: aastore
      // 121: dup_x1
      // 122: swap
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x1
      // 127: swap
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w -3020122477321004520
      // 12e: lload 3
      // 12f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: astore 21
      // 136: aload 21
      // 138: aload 20
      // 13a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13d: lload 3
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 164
      // 143: ifne 162
      // 146: aload 0
      // 147: ldc2_w -3197575365644550181
      // 14a: lload 3
      // 14b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: aload 21
      // 152: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 155: goto 162
      // 158: ldc2_w -2961767043208628509
      // 15b: lload 3
      // 15c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: iload 17
      // 164: ifeq 280
      // 167: aload 18
      // 169: ldc2_w -3685809490464798385
      // 16c: lload 3
      // 16d: invokedynamic m (JJ)Lcom/zelix/_yp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: if_acmpeq 280
      // 175: goto 182
      // 178: ldc2_w -2961767043208628509
      // 17b: lload 3
      // 17c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: new com/zelix/xx
      // 185: dup
      // 186: invokespecial com/zelix/xx.<init> ()V
      // 189: astore 21
      // 18b: aload 20
      // 18d: aload 5
      // 18f: lload 10
      // 191: aload 21
      // 193: bipush 4
      // 194: anewarray 277
      // 197: dup_x1
      // 198: swap
      // 199: bipush 3
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x2
      // 19d: dup_x2
      // 19e: pop
      // 19f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a2: bipush 2
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: bipush 1
      // 1a8: swap
      // 1a9: aastore
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w -2938181774394090741
      // 1b2: lload 3
      // 1b3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: astore 22
      // 1ba: aload 22
      // 1bc: aload 20
      // 1be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c1: iload 17
      // 1c3: lload 3
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: ifle 217
      // 1c9: ifne 20f
      // 1cc: ifne 1fd
      // 1cf: goto 1dc
      // 1d2: ldc2_w -2961767043208628509
      // 1d5: lload 3
      // 1d6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: ldc2_w -3197575365644550181
      // 1e0: lload 3
      // 1e1: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: aload 22
      // 1e8: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 1eb: iload 17
      // 1ed: ifeq 280
      // 1f0: goto 1fd
      // 1f3: ldc2_w -2961767043208628509
      // 1f6: lload 3
      // 1f7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: aload 21
      // 1ff: invokevirtual com/zelix/xx.S ()Z
      // 202: goto 20f
      // 205: ldc2_w -2961767043208628509
      // 208: lload 3
      // 209: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: lload 3
      // 210: lconst_0
      // 211: lcmp
      // 212: ifle 261
      // 215: iload 17
      // 217: ifne 261
      // 21a: ifne 280
      // 21d: goto 22a
      // 220: ldc2_w -2961767043208628509
      // 223: lload 3
      // 224: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 20
      // 22c: aload 2
      // 22d: bipush 0
      // 22e: lload 8
      // 230: bipush 4
      // 231: anewarray 277
      // 234: dup_x2
      // 235: dup_x2
      // 236: pop
      // 237: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23a: bipush 3
      // 23b: swap
      // 23c: aastore
      // 23d: dup_x1
      // 23e: swap
      // 23f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 242: bipush 2
      // 243: swap
      // 244: aastore
      // 245: dup_x1
      // 246: swap
      // 247: bipush 1
      // 248: swap
      // 249: aastore
      // 24a: dup_x1
      // 24b: swap
      // 24c: bipush 0
      // 24d: swap
      // 24e: aastore
      // 24f: ldc2_w -3020122477321004520
      // 252: lload 3
      // 253: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: astore 22
      // 25a: aload 22
      // 25c: aload 20
      // 25e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 261: ifne 280
      // 264: aload 0
      // 265: ldc2_w -3197575365644550181
      // 268: lload 3
      // 269: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: aload 22
      // 270: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 273: goto 280
      // 276: ldc2_w -2961767043208628509
      // 279: lload 3
      // 27a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: athrow
      // 280: return
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void Y(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 4
      // 02a: pop
      // 02b: lload 6
      // 02d: dup2
      // 02e: ldc2_w 72960146490655
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 126095948473043
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 79095900938944
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 15524528719538
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 117006334697505
      // 04d: lxor
      // 04e: lstore 16
      // 050: dup2
      // 051: ldc2_w 61973130971424
      // 054: lxor
      // 055: dup2
      // 056: bipush 48
      // 058: lushr
      // 059: l2i
      // 05a: istore 18
      // 05c: dup2
      // 05d: bipush 16
      // 05f: lshl
      // 060: bipush 32
      // 062: lushr
      // 063: l2i
      // 064: istore 19
      // 066: dup2
      // 067: bipush 48
      // 069: lshl
      // 06a: bipush 48
      // 06c: lushr
      // 06d: l2i
      // 06e: istore 20
      // 070: pop2
      // 071: dup2
      // 072: ldc2_w 77429385308514
      // 075: lxor
      // 076: lstore 21
      // 078: pop2
      // 079: ldc2_w 1887524154404252251
      // 07c: lload 6
      // 07e: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 0
      // 084: ldc2_w 16774675915779199
      // 087: lload 6
      // 089: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 091: lload 16
      // 093: dup2_x1
      // 094: pop2
      // 095: bipush 2
      // 096: anewarray 277
      // 099: dup_x1
      // 09a: swap
      // 09b: bipush 1
      // 09c: swap
      // 09d: aastore
      // 09e: dup_x2
      // 09f: dup_x2
      // 0a0: pop
      // 0a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a4: bipush 0
      // 0a5: swap
      // 0a6: aastore
      // 0a7: ldc2_w 2015812189031912114
      // 0aa: lload 6
      // 0ac: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: astore 24
      // 0b3: istore 23
      // 0b5: aload 24
      // 0b7: iload 23
      // 0b9: ifeq 179
      // 0bc: ifnull 12f
      // 0bf: goto 0cd
      // 0c2: ldc2_w 378802436322551111
      // 0c5: lload 6
      // 0c7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 24
      // 0cf: iload 23
      // 0d1: ifeq 179
      // 0d4: goto 0e2
      // 0d7: ldc2_w 378802436322551111
      // 0da: lload 6
      // 0dc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: lload 14
      // 0e4: dup2_x1
      // 0e5: pop2
      // 0e6: bipush 2
      // 0e7: anewarray 277
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 1
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x2
      // 0f0: dup_x2
      // 0f1: pop
      // 0f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5: bipush 0
      // 0f6: swap
      // 0f7: aastore
      // 0f8: ldc2_w 1920281412508651448
      // 0fb: lload 6
      // 0fd: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: ifeq 12f
      // 105: goto 113
      // 108: ldc2_w 378802436322551111
      // 10b: lload 6
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 3
      // 114: lload 8
      // 116: aload 24
      // 118: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 11b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 120: pop
      // 121: goto 12f
      // 124: ldc2_w 378802436322551111
      // 127: lload 6
      // 129: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: ldc2_w 2137246144683020209
      // 132: lload 6
      // 134: invokedynamic i (JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: aload 0
      // 13a: lload 21
      // 13c: bipush 1
      // 13d: anewarray 277
      // 140: dup_x2
      // 141: dup_x2
      // 142: pop
      // 143: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 146: bipush 0
      // 147: swap
      // 148: aastore
      // 149: ldc2_w 436221231651337501
      // 14c: lload 6
      // 14e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: aload 0
      // 154: lload 10
      // 156: bipush 1
      // 157: anewarray 277
      // 15a: dup_x2
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w 1806653463197831693
      // 166: lload 6
      // 168: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: iload 18
      // 16f: i2c
      // 170: swap
      // 171: iload 19
      // 173: swap
      // 174: iload 20
      // 176: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 179: checkcast com/zelix/_yp
      // 17c: astore 25
      // 17e: aload 25
      // 180: ldc2_w 2269015503299992299
      // 183: lload 6
      // 185: invokedynamic i (JJ)Lcom/zelix/_yp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: if_acmpne 1cc
      // 18d: aload 0
      // 18e: lload 12
      // 190: bipush 1
      // 191: anewarray 277
      // 194: dup_x2
      // 195: dup_x2
      // 196: pop
      // 197: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19a: bipush 0
      // 19b: swap
      // 19c: aastore
      // 19d: ldc2_w 1878870860506217186
      // 1a0: lload 6
      // 1a2: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ir; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: astore 26
      // 1a9: lload 6
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: ifle 1be
      // 1b0: aload 26
      // 1b2: ifnull 1cc
      // 1b5: aload 2
      // 1b6: aload 26
      // 1b8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1bd: pop
      // 1be: goto 1cc
      // 1c1: ldc2_w 378802436322551111
      // 1c4: lload 6
      // 1c6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: return
   }

   static {
      long var9 = a ^ 130279980628441L;
      long var10001 = var9 ^ 84016148834577L;
      int var11 = (int)((var9 ^ 84016148834577L) >>> 32);
      int var12 = (int)((var9 ^ 84016148834577L) << 32 >>> 56);
      int var13 = (int)(var10001 << 40 >>> 40);
      long var14 = var9 ^ 11684177120350L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "×\u0015qI}\fiÞ\u0096«Ëæé\u0080à\u0013y\u0001#=Û¡-ë\u0007r×>Ä¬\u009elÞAB¶\u0094ÊUú¬tãlmNÐ\u001e° fE_î\u0085¡º¹\u008d¸Vq \u0095±\u008aæ\u00115Á}ä©\u00ad\u001e Ò(Ù\u0083ÜÞÎÂ Ë-\u0087Xê¡ªe\u0016\u0000B\u0088¥ÄÓË]\u001d\u007f±vå}X¨°l\\p8M\t \u0011Á\u0093E~\u001a\f+\u0083V¶T«\u0019ÉÂ/3ð\në\u008es\u0094X/£áGÒ;,*\u0010C§\u008aBq4Ä\u0090×&y\u0091P\u0092Ï\u0010±û<\u0000¢\u0015W?0\u0010Áõð<Û+º¶ûÈä\u0005\u0093¡yèP½\u00adºO7%ÕCðÆ\u001cÙÉ\u0012ÜÆ\u0019Xµ\u0001×\u0011\u0002\u008a~\n¦`\u0083\u009c\u0010R\u0000\u000eô\u0083o\u0003\u0084ýb\u0004ù\u0098c 5µÒÃû¶«\u0003o\u0086ÿÙ| lßâÅF\u009f\u0015êB\u0018.Úàç\u009bmé\u008fÀô ;÷í£Â²ÝK´J\u0099ÝUÍ\u008d3[\u008fëi\u0099ã³¹\u0006\u0081\u0002=h\u0007Í$(Ü'gi6\u0095v=Ä·ÜÏ,m\"Ø÷²=a¦§M(^ðvb\u0086QhA\u008f0\u0002\u0096Uø_õ@³õÙ\u008e6I\fâ*\u0004Ì\u001a=\u001b[\u0014lø·\"ÛÌ\u0091\u0095j`\u0087ÉW/ô\u0087o±~Pa=7B\u0001â}ÖVòï}\u00183%Y9\nßêBÌiX0,\u00844";
      int var6 = "×\u0015qI}\fiÞ\u0096«Ëæé\u0080à\u0013y\u0001#=Û¡-ë\u0007r×>Ä¬\u009elÞAB¶\u0094ÊUú¬tãlmNÐ\u001e° fE_î\u0085¡º¹\u008d¸Vq \u0095±\u008aæ\u00115Á}ä©\u00ad\u001e Ò(Ù\u0083ÜÞÎÂ Ë-\u0087Xê¡ªe\u0016\u0000B\u0088¥ÄÓË]\u001d\u007f±vå}X¨°l\\p8M\t \u0011Á\u0093E~\u001a\f+\u0083V¶T«\u0019ÉÂ/3ð\në\u008es\u0094X/£áGÒ;,*\u0010C§\u008aBq4Ä\u0090×&y\u0091P\u0092Ï\u0010±û<\u0000¢\u0015W?0\u0010Áõð<Û+º¶ûÈä\u0005\u0093¡yèP½\u00adºO7%ÕCðÆ\u001cÙÉ\u0012ÜÆ\u0019Xµ\u0001×\u0011\u0002\u008a~\n¦`\u0083\u009c\u0010R\u0000\u000eô\u0083o\u0003\u0084ýb\u0004ù\u0098c 5µÒÃû¶«\u0003o\u0086ÿÙ| lßâÅF\u009f\u0015êB\u0018.Úàç\u009bmé\u008fÀô ;÷í£Â²ÝK´J\u0099ÝUÍ\u008d3[\u008fëi\u0099ã³¹\u0006\u0081\u0002=h\u0007Í$(Ü'gi6\u0095v=Ä·ÜÏ,m\"Ø÷²=a¦§M(^ðvb\u0086QhA\u008f0\u0002\u0096Uø_õ@³õÙ\u008e6I\fâ*\u0004Ì\u001a=\u001b[\u0014lø·\"ÛÌ\u0091\u0095j`\u0087ÉW/ô\u0087o±~Pa=7B\u0001â}ÖVòï}\u00183%Y9\nßêBÌiX0,\u00844"
         .length();
      char var3 = 'X';
      int var17 = -1;

      label27:
      while (true) {
         String var18 = var4.substring(++var17, var17 + var3);
         byte var20 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var18.getBytes("ISO-8859-1"));
            String var25 = a(var8).intern();
            switch (var20) {
               case 0:
                  var7[var5++] = var25;
                  if ((var17 += var3) >= var6) {
                     c = var7;
                     d = new String[9];
                     x44.a<"v">(new _8z(var14), 5385875625485785254L, var9);
                     x44.a<"n">(5385875625485785254L, var9)
                        .s(
                           a<"k">(20433, 627812122271596348L ^ var9),
                           a<"k">(18816, 3320671062133422442L ^ var9),
                           x44.a<"n">(5476038849367832654L, var9),
                           var11,
                           (byte)var12,
                           var13
                        );
                     x44.a<"n">(5385875625485785254L, var9)
                        .s(
                           a<"k">(4779, 4125655527602577991L ^ var9),
                           a<"k">(27993, 7595935069758627260L ^ var9),
                           x44.a<"n">(5476038849367832654L, var9),
                           var11,
                           (byte)var12,
                           var13
                        );
                     x44.a<"n">(5385875625485785254L, var9)
                        .s(
                           a<"k">(14301, 1837842269005432630L ^ var9),
                           a<"k">(6052, 3240973682232584013L ^ var9),
                           x44.a<"n">(5218078531479178748L, var9),
                           var11,
                           (byte)var12,
                           var13
                        );
                     return;
                  }

                  var3 = var4.charAt(var17);
                  break;
               default:
                  var7[var5++] = var25;
                  if ((var17 += var3) < var6) {
                     var3 = var4.charAt(var17);
                     continue label27;
                  }

                  var4 = "Ô\u0085\u0097ã¢7\u00966^\u0000ô\u00adìáÔGÜ.>4äôDq\u0010OÔ\u0095UYt\f\u0007SÀþ¥\u009dµk^";
                  var6 = "Ô\u0085\u0097ã¢7\u00966^\u0000ô\u00adìáÔGÜ.>4äôDq\u0010OÔ\u0095UYt\f\u0007SÀþ¥\u009dµk^".length();
                  var3 = 24;
                  var17 = -1;
            }

            var18 = var4.substring(++var17, var17 + var3);
            var20 = 0;
         }
      }
   }

   i_(h8 param1, int param2, _xx param3, _y4 param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i_.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 97984885421282
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 130179771947207
      // 015: lxor
      // 016: lstore 9
      // 018: dup2
      // 019: ldc2_w 87949878246250
      // 01c: lxor
      // 01d: lstore 11
      // 01f: dup2
      // 020: ldc2_w 111935704235457
      // 023: lxor
      // 024: lstore 13
      // 026: dup2
      // 027: ldc2_w 94873065322619
      // 02a: lxor
      // 02b: dup2
      // 02c: bipush 8
      // 02e: lushr
      // 02f: lstore 15
      // 031: dup2
      // 032: bipush 56
      // 034: lshl
      // 035: bipush 56
      // 037: lushr
      // 038: l2i
      // 039: istore 17
      // 03b: pop2
      // 03c: dup2
      // 03d: ldc2_w 17456924615139
      // 040: lxor
      // 041: lstore 18
      // 043: pop2
      // 044: ldc2_w -3505323303259537616
      // 047: lload 5
      // 049: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: aload 1
      // 050: iload 2
      // 051: lload 18
      // 053: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 056: aload 3
      // 057: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 05a: istore 21
      // 05c: aload 0
      // 05d: lload 15
      // 05f: iload 21
      // 061: iload 17
      // 063: i2b
      // 064: invokevirtual com/zelix/i_.N (JIB)Lcom/zelix/xl;
      // 067: astore 22
      // 069: istore 20
      // 06b: iload 20
      // 06d: ifeq 107
      // 070: aload 22
      // 072: ifnull 0d6
      // 075: goto 083
      // 078: ldc2_w -3446796330567847892
      // 07b: lload 5
      // 07d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: lload 5
      // 085: lconst_0
      // 086: lcmp
      // 087: iflt 0f9
      // 08a: aload 22
      // 08c: instanceof com/zelix/mx
      // 08f: ifeq 0d6
      // 092: goto 0a0
      // 095: ldc2_w -3446796330567847892
      // 098: lload 5
      // 09a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: aload 22
      // 0a3: checkcast com/zelix/mx
      // 0a6: ldc2_w -3075718532902520556
      // 0a9: lload 5
      // 0ab: invokedynamic p (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 4
      // 0b2: aload 0
      // 0b3: ldc2_w -3075718532902520556
      // 0b6: lload 5
      // 0b8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: aload 0
      // 0be: lload 9
      // 0c0: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c3: iload 20
      // 0c5: ifne 1a3
      // 0c8: goto 0d6
      // 0cb: ldc2_w -3446796330567847892
      // 0ce: lload 5
      // 0d0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: bipush 0
      // 0d8: lload 13
      // 0da: bipush 2
      // 0db: anewarray 277
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: ldc2_w -3522486520253476728
      // 0f2: lload 5
      // 0f4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: goto 107
      // 0fc: ldc2_w -3446796330567847892
      // 0ff: lload 5
      // 101: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: sipush 22696
      // 112: lload 5
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 12e
      // 119: ldc2_w 4918232883130214970
      // 11c: lload 5
      // 11e: lxor
      // 11f: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/i_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: iload 20
      // 126: ifeq 177
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: iload 21
      // 12e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 131: aload 22
      // 133: ifnull 17a
      // 136: goto 144
      // 139: ldc2_w -3446796330567847892
      // 13c: lload 5
      // 13e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: new java/lang/StringBuilder
      // 147: dup
      // 148: invokespecial java/lang/StringBuilder.<init> ()V
      // 14b: sipush 26503
      // 14e: ldc2_w 912037651778671892
      // 151: lload 5
      // 153: lxor
      // 154: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/i_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: aload 22
      // 15e: lload 11
      // 160: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 163: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 166: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 169: goto 177
      // 16c: ldc2_w -3446796330567847892
      // 16f: lload 5
      // 171: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: goto 17c
      // 17a: ldc ""
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 182: lload 7
      // 184: dup2_x1
      // 185: pop2
      // 186: bipush 2
      // 187: anewarray 277
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 1
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x2
      // 190: dup_x2
      // 191: pop
      // 192: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 195: bipush 0
      // 196: swap
      // 197: aastore
      // 198: ldc2_w -3403703589263025226
      // 19b: lload 5
      // 19d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: return
      // 1a3: return
   }

   private ir c(Object[] param1) {
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
      // 0c: getstatic com/zelix/i_.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 65011540214960
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 131030651886089
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 83384591698239
      // 25: lxor
      // 26: lstore 8
      // 28: pop2
      // 29: ldc2_w 48577438319063238
      // 2c: lload 2
      // 2d: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: lload 8
      // 35: invokevirtual com/zelix/i_.d (J)Lcom/zelix/hz;
      // 38: astore 11
      // 3a: istore 10
      // 3c: aload 11
      // 3e: iload 10
      // 40: ifeq 65
      // 43: invokevirtual com/zelix/hz.b ()Z
      // 46: ifeq c9
      // 49: goto 56
      // 4c: ldc2_w 2295858433815609306
      // 4f: lload 2
      // 50: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 11
      // 58: goto 65
      // 5b: ldc2_w 2295858433815609306
      // 5e: lload 2
      // 5f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 0
      // 66: ldc2_w 1920461578311415522
      // 69: lload 2
      // 6a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: lload 4
      // 71: invokevirtual com/zelix/mx.N (J)Ljava/lang/String;
      // 74: lload 6
      // 76: dup2_x1
      // 77: pop2
      // 78: bipush 2
      // 79: anewarray 277
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 1
      // 7f: swap
      // 80: aastore
      // 81: dup_x2
      // 82: dup_x2
      // 83: pop
      // 84: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 87: bipush 0
      // 88: swap
      // 89: aastore
      // 8a: ldc2_w 546999850910623428
      // 8d: lload 2
      // 8e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: astore 12
      // 95: aload 12
      // 97: iload 10
      // 99: lload 2
      // 9a: lconst_0
      // 9b: lcmp
      // 9c: ifle c4
      // 9f: ifeq c3
      // a2: arraylength
      // a3: bipush 1
      // a4: if_icmpne c9
      // a7: goto b4
      // aa: ldc2_w 2295858433815609306
      // ad: lload 2
      // ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 12
      // b6: goto c3
      // b9: ldc2_w 2295858433815609306
      // bc: lload 2
      // bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: athrow
      // c3: bipush 0
      // c4: aaload
      // c5: checkcast com/zelix/ir
      // c8: areturn
      // c9: aconst_null
      // ca: areturn
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12649;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/i_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/i_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
