package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yd implements Enumeration {
   private Object[] Y;
   private int z;
   private int j;
   private static final long a = ess.a(5194837424606891419L, -8483872567974549736L, MethodHandles.lookup().lookupClass()).a(86324942040752L);
   private static final String b;

   public void m(Object[] param1) {
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
      // 04: checkcast java/util/Comparator
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/yd.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -3252577750250632232
      // 1d: lload 2
      // 1e: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 0
      // 26: aload 5
      // 28: ifnonnull 51
      // 2b: getfield com/zelix/yd.z I
      // 2e: ifle 50
      // 31: goto 3e
      // 34: ldc2_w -3304165083186989288
      // 37: lload 2
      // 38: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: new java/lang/IllegalStateException
      // 41: dup
      // 42: invokespecial java/lang/IllegalStateException.<init> ()V
      // 45: athrow
      // 46: ldc2_w -3304165083186989288
      // 49: lload 2
      // 4a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 0
      // 51: getfield com/zelix/yd.Y [Ljava/lang/Object;
      // 54: astore 6
      // 56: aload 0
      // 57: aload 0
      // 58: getfield com/zelix/yd.Y [Ljava/lang/Object;
      // 5b: bipush 1
      // 5c: anewarray 51
      // 5f: dup_x1
      // 60: swap
      // 61: bipush 0
      // 62: swap
      // 63: aastore
      // 64: ldc2_w -3298533607004148690
      // 67: lload 2
      // 68: invokedynamic u (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: putfield com/zelix/yd.Y [Ljava/lang/Object;
      // 70: aload 0
      // 71: getfield com/zelix/yd.Y [Ljava/lang/Object;
      // 74: aload 4
      // 76: ldc2_w -3458812839602733803
      // 79: lload 2
      // 7a: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: return
   }

   @Override
   public final boolean hasMoreElements() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/yd.a J
      // 03: ldc2_w 110682496817597
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -7736920765485707868
      // 0b: lload 1
      // 0c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: getfield com/zelix/yd.z I
      // 16: aload 3
      // 17: ifnonnull 3c
      // 1a: aload 0
      // 1b: getfield com/zelix/yd.j I
      // 1e: if_icmpge 3f
      // 21: goto 2e
      // 24: ldc2_w -7757075328388124316
      // 27: lload 1
      // 28: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 3c
      // 32: ldc2_w -7757075328388124316
      // 35: lload 1
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public final Object nextElement() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/yd.a J
      // 03: ldc2_w 86598429493313
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w -8836970773825020840
      // 0b: lload 1
      // 0c: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 3
      // 12: aload 0
      // 13: aload 3
      // 14: ifnonnull 57
      // 17: getfield com/zelix/yd.z I
      // 1a: aload 0
      // 1b: getfield com/zelix/yd.j I
      // 1e: if_icmplt 47
      // 21: goto 2e
      // 24: ldc2_w -8816500512452140904
      // 27: lload 1
      // 28: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: new java/util/NoSuchElementException
      // 31: dup
      // 32: aload 0
      // 33: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 36: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 39: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: ldc2_w -8816500512452140904
      // 40: lload 1
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/yd.Y [Ljava/lang/Object;
      // 4b: aload 0
      // 4c: dup
      // 4d: getfield com/zelix/yd.z I
      // 50: dup_x1
      // 51: bipush 1
      // 52: iadd
      // 53: putfield com/zelix/yd.z I
      // 56: aaload
      // 57: areturn
   }

   public static Enumeration S(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/util/Collection
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/yd.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: lload 1
      // 1a: dup2
      // 1b: ldc2_w 27750048478120
      // 1e: lxor
      // 1f: dup2
      // 20: bipush 48
      // 22: lushr
      // 23: l2i
      // 24: istore 4
      // 26: dup2
      // 27: bipush 16
      // 29: lshl
      // 2a: bipush 16
      // 2c: lushr
      // 2d: lstore 5
      // 2f: pop2
      // 30: pop2
      // 31: ldc2_w -6130045602356087831
      // 34: lload 1
      // 35: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 7
      // 3c: aload 3
      // 3d: aload 7
      // 3f: ifnonnull 68
      // 42: ifnonnull 67
      // 45: goto 52
      // 48: ldc2_w -6191307537837093079
      // 4b: lload 1
      // 4c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: new java/lang/IllegalArgumentException
      // 55: dup
      // 56: getstatic com/zelix/yd.b Ljava/lang/String;
      // 59: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 5c: athrow
      // 5d: ldc2_w -6191307537837093079
      // 60: lload 1
      // 61: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 3
      // 68: invokeinterface java/util/Collection.size ()I 1
      // 6d: anewarray 51
      // 70: checkcast [Ljava/lang/Object;
      // 73: astore 8
      // 75: bipush 0
      // 76: istore 9
      // 78: aload 3
      // 79: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 7e: astore 10
      // 80: aload 10
      // 82: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 87: ifeq 9e
      // 8a: aload 8
      // 8c: iload 9
      // 8e: iinc 9 1
      // 91: aload 10
      // 93: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 98: aastore
      // 99: aload 7
      // 9b: ifnull 80
      // 9e: lload 1
      // 9f: lconst_0
      // a0: lcmp
      // a1: iflt 99
      // a4: new com/zelix/yd
      // a7: dup
      // a8: iload 4
      // aa: i2c
      // ab: lload 5
      // ad: aload 8
      // af: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // b2: areturn
   }

   public yd(char param1, long param2, Object[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: lload 2
      // 06: bipush 16
      // 08: lshl
      // 09: bipush 16
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/yd.a J
      // 10: lxor
      // 11: lstore 5
      // 13: ldc2_w -4142548571861557370
      // 16: lload 5
      // 18: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 0
      // 1e: invokespecial java/lang/Object.<init> ()V
      // 21: astore 7
      // 23: aload 7
      // 25: ifnonnull 63
      // 28: aload 4
      // 2a: ifnonnull 4e
      // 2d: goto 3b
      // 30: ldc2_w -4144705161266666682
      // 33: lload 5
      // 35: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: new java/lang/IllegalArgumentException
      // 3e: dup
      // 3f: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 42: athrow
      // 43: ldc2_w -4144705161266666682
      // 46: lload 5
      // 48: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 4
      // 51: invokevirtual [Ljava/lang/Object;.clone ()Ljava/lang/Object;
      // 54: checkcast [Ljava/lang/Object;
      // 57: putfield com/zelix/yd.Y [Ljava/lang/Object;
      // 5a: aload 0
      // 5b: aload 0
      // 5c: getfield com/zelix/yd.Y [Ljava/lang/Object;
      // 5f: arraylength
      // 60: putfield com/zelix/yd.j I
      // 63: return
   }

   static {
      long var0 = a ^ 45401716709692L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008f¤ãmôrñó\n(FÍµM\u0090»\u0014N\u008cÜ¡íç(®º¢ãÛ\u009b\u0000«".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
