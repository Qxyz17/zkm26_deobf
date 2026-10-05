package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r4 {
   private final char[] d;
   private int D;
   r4 W;
   r4 s;
   private final String M;
   private static final long a = ess.a(-229075348458343729L, -6365641930391020299L, MethodHandles.lookup().lookupClass()).a(120604041788993L);
   private static final String b;

   boolean y(Object[] param1) {
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
      // 0c: getstatic com/zelix/r4.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 61108955921711
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -4644803786230711840
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: aload 0
      // 26: dup
      // 27: getfield com/zelix/r4.D I
      // 2a: bipush 1
      // 2b: iadd
      // 2c: dup_x1
      // 2d: putfield com/zelix/r4.D I
      // 30: aload 0
      // 31: getfield com/zelix/r4.d [C
      // 34: arraylength
      // 35: irem
      // 36: putfield com/zelix/r4.D I
      // 39: astore 6
      // 3b: aload 0
      // 3c: getfield com/zelix/r4.D I
      // 3f: aload 6
      // 41: ifnull bd
      // 44: ifne bc
      // 47: goto 54
      // 4a: ldc2_w -6815718131315815447
      // 4d: lload 2
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: ldc2_w -4744843439817590705
      // 58: lload 2
      // 59: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/r4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 6
      // 60: lload 2
      // 61: lconst_0
      // 62: lcmp
      // 63: ifle ac
      // 66: ifnull 9d
      // 69: goto 76
      // 6c: ldc2_w -6815718131315815447
      // 6f: lload 2
      // 70: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: ifnull ba
      // 79: goto 86
      // 7c: ldc2_w -6815718131315815447
      // 7f: lload 2
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 0
      // 87: ldc2_w -4744843439817590705
      // 8a: lload 2
      // 8b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/r4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: goto 9d
      // 93: ldc2_w -6815718131315815447
      // 96: lload 2
      // 97: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: lload 4
      // 9f: bipush 1
      // a0: anewarray 112
      // a3: dup_x2
      // a4: dup_x2
      // a5: pop
      // a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a9: bipush 0
      // aa: swap
      // ab: aastore
      // ac: ldc2_w -6441853735561006372
      // af: lload 2
      // b0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: istore 7
      // b7: iload 7
      // b9: ireturn
      // ba: bipush 1
      // bb: ireturn
      // bc: bipush 0
      // bd: ireturn
   }

   private void E(Object[] var1) {
      long var3 = (Long)var1[0];
      r4 var2 = (r4)var1[1];
      var3 = a ^ var3;
      x44.a<"u">(this, var2, -5685923628073640416L, var3);
   }

   r4(char[] var1, String var2) {
      this.d = var1;
      this.M = var2;
   }

   StringBuilder v(Object[] param1) {
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
      // 04: checkcast java/lang/StringBuilder
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/r4.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 61108955921711
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -5241777668515352277
      // 25: lload 3
      // 26: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 2
      // 2e: aload 0
      // 2f: getfield com/zelix/r4.d [C
      // 32: aload 0
      // 33: getfield com/zelix/r4.D I
      // 36: caload
      // 37: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 3a: aload 7
      // 3c: ifnull 91
      // 3f: pop
      // 40: aload 0
      // 41: ldc2_w -5652618438212936006
      // 44: lload 3
      // 45: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/r4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: ifnull 90
      // 4d: goto 5a
      // 50: ldc2_w -6223247822888746206
      // 53: lload 3
      // 54: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: ldc2_w -5652618438212936006
      // 5e: lload 3
      // 5f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/r4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: aload 2
      // 65: lload 5
      // 67: bipush 2
      // 68: anewarray 112
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 1
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 0
      // 77: swap
      // 78: aastore
      // 79: ldc2_w -6086620291775835503
      // 7c: lload 3
      // 7d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: pop
      // 83: goto 90
      // 86: ldc2_w -6223247822888746206
      // 89: lload 3
      // 8a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 2
      // 91: areturn
   }

   void J(Object[] param1) {
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
      // 0e: checkcast com/zelix/r4
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/r4.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 67323378486976
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -4308770864870505890
      // 25: lload 3
      // 26: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 2
      // 2e: aload 0
      // 2f: aload 7
      // 31: ifnull 66
      // 34: if_acmpne 59
      // 37: goto 44
      // 3a: ldc2_w -2677451197203861417
      // 3d: lload 3
      // 3e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: new java/lang/IllegalArgumentException
      // 47: dup
      // 48: getstatic com/zelix/r4.b Ljava/lang/String;
      // 4b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4e: athrow
      // 4f: ldc2_w -2677451197203861417
      // 52: lload 3
      // 53: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: aload 2
      // 5b: ldc2_w -4208453128794209295
      // 5e: lload 3
      // 5f: invokedynamic r (Ljava/lang/Object;Lcom/zelix/r4;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: aload 2
      // 65: aload 0
      // 66: lload 5
      // 68: dup2_x1
      // 69: pop2
      // 6a: bipush 2
      // 6b: anewarray 112
      // 6e: dup_x1
      // 6f: swap
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -2513885728828216527
      // 7f: lload 3
      // 80: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: return
   }

   r4(char[] var1) {
      this(var1, "");
   }

   static {
      long var0 = a ^ 67894850412138L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("k¿Þ\u0013-\u0004>äÄ\u009e\u0087\u009dá§\u0018Ø\u0086:À\u009dôC\u0000+Ø\u0086äß\n\u0085ëÛ".getBytes("ISO-8859-1"));
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
