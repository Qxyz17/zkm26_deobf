package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _om extends _o5 {
   private static final long c = ess.a(-3524726462780911295L, 7561082333459258410L, MethodHandles.lookup().lookupClass()).a(48937766299222L);
   private static final long t;

   void p(DataOutputStream var1, long var2) {
      x44.a<"i">(var1, this.k(), 5053185912282928432L, var2);
   }

   public int d(long var1) {
      return 5;
   }

   public _om(int var1, _op var2) {
      super(var1, var2);
   }

   public List E(long var1) {
      return null;
   }

   int T(Object[] var1) {
      long var2 = (Long)var1[0];
      _xx var4 = (_xx)var1[1];
      int var5 = var4.readInt();
      return this.p + var5;
   }

   public boolean f(short param1, short param2, int param3) {
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
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 32
      // 12: lshl
      // 13: bipush 32
      // 15: lushr
      // 16: lor
      // 17: lstore 4
      // 19: ldc2_w -4825946652062703421
      // 1c: lload 4
      // 1e: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 6
      // 25: aload 0
      // 26: invokevirtual com/zelix/_om.l ()I
      // 29: aload 6
      // 2b: ifnonnull 52
      // 2e: getstatic com/zelix/_om.t J
      // 31: l2i
      // 32: if_icmpne 55
      // 35: goto 43
      // 38: ldc2_w -6542978640425687153
      // 3b: lload 4
      // 3d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: bipush 1
      // 44: goto 52
      // 47: ldc2_w -6542978640425687153
      // 4a: lload 4
      // 4c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   _om(int var1, _xx var2, int var3, long var4, _y4 var6) {
      var4 = c ^ var4;
      long var7 = var4 ^ 97445378223327L;
      super(var7, var1, var2, var3, var6);
   }

   public _kz M(_kz param1, long param2, boolean param4, boolean param5, _fm param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 32610570959058
      // 05: lxor
      // 06: lstore 8
      // 08: dup2
      // 09: ldc2_w 136062345194104
      // 0c: lxor
      // 0d: lstore 10
      // 0f: dup2
      // 10: ldc2_w 118237195067467
      // 13: lxor
      // 14: lstore 12
      // 16: dup2
      // 17: ldc2_w 37585498234552
      // 1a: lxor
      // 1b: lstore 14
      // 1d: pop2
      // 1e: aload 1
      // 1f: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 22: astore 17
      // 24: ldc2_w 8522769916746197891
      // 27: lload 2
      // 28: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 1
      // 2e: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 31: astore 18
      // 33: aconst_null
      // 34: astore 19
      // 36: astore 16
      // 38: aload 18
      // 3a: arraylength
      // 3b: istore 20
      // 3d: aload 1
      // 3e: lload 8
      // 40: invokevirtual com/zelix/_kz.C (J)Ljava/util/Set;
      // 43: astore 21
      // 45: aload 0
      // 46: getfield com/zelix/_om.a I
      // 49: aload 16
      // 4b: ifnonnull c7
      // 4e: lookupswitch 120 2 200 36 201 68
      // 68: ldc2_w 7958589054196296911
      // 6b: lload 2
      // 6c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: new com/zelix/_kz
      // 75: dup
      // 76: aload 18
      // 78: aload 17
      // 7a: aload 1
      // 7b: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 7e: lload 14
      // 80: dup2_x1
      // 81: pop2
      // 82: aload 21
      // 84: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 87: areturn
      // 88: ldc2_w 7958589054196296911
      // 8b: lload 2
      // 8c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: iload 20
      // 94: bipush 1
      // 95: iadd
      // 96: lload 12
      // 98: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 9b: astore 19
      // 9d: aload 18
      // 9f: bipush 0
      // a0: aload 19
      // a2: bipush 0
      // a3: iload 20
      // a5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a8: aload 19
      // aa: iload 20
      // ac: getstatic com/zelix/n.e Lcom/zelix/n;
      // af: aastore
      // b0: new com/zelix/_kz
      // b3: dup
      // b4: aload 19
      // b6: aload 17
      // b8: aload 1
      // b9: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // bc: lload 14
      // be: dup2_x1
      // bf: pop2
      // c0: aload 21
      // c2: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // c5: areturn
      // c6: bipush 0
      // c7: aload 0
      // c8: getfield com/zelix/_om.a I
      // cb: lload 10
      // cd: bipush 3
      // ce: anewarray 19
      // d1: dup_x2
      // d2: dup_x2
      // d3: pop
      // d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d7: bipush 2
      // d8: swap
      // d9: aastore
      // da: dup_x1
      // db: swap
      // dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // df: bipush 1
      // e0: swap
      // e1: aastore
      // e2: dup_x1
      // e3: swap
      // e4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // e7: bipush 0
      // e8: swap
      // e9: aastore
      // ea: ldc2_w 8278319284505602977
      // ed: lload 2
      // ee: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f3: aconst_null
      // f4: areturn
   }

   static {
      long var0 = c ^ 61279339083540L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -173062625772597534L;
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
      t = var7;
   }

   private static gj b(gj var0) {
      return var0;
   }
}
