package com.zelix;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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

public class qy implements MouseMotionListener {
   final q0 O;
   private static final long a = ess.a(2844170860672470036L, 1344432968160943880L, MethodHandles.lookup().lookupClass()).a(119721581389314L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void mouseDragged(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/qy.a J
      // 03: ldc2_w 28877645789935
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 77614712099515
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 127589073720845
      // 14: lxor
      // 15: lstore 6
      // 17: pop2
      // 18: ldc2_w -5535289472105276671
      // 1b: lload 2
      // 1c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 8
      // 23: aload 0
      // 24: ldc2_w -6278057483292523076
      // 27: lload 2
      // 28: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: lload 4
      // 2f: bipush 2
      // 30: anewarray 251
      // 33: dup_x2
      // 34: dup_x2
      // 35: pop
      // 36: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39: bipush 1
      // 3a: swap
      // 3b: aastore
      // 3c: dup_x1
      // 3d: swap
      // 3e: bipush 0
      // 3f: swap
      // 40: aastore
      // 41: ldc2_w -5513293485326954881
      // 44: lload 2
      // 45: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: aload 8
      // 4c: ifnull b3
      // 4f: ifeq d6
      // 52: goto 5f
      // 55: ldc2_w -5977941382141834715
      // 58: lload 2
      // 59: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc2_w -6278057483292523076
      // 63: lload 2
      // 64: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 8
      // 6b: ifnull cd
      // 6e: goto 7b
      // 71: ldc2_w -5977941382141834715
      // 74: lload 2
      // 75: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: lload 6
      // 7d: bipush 2
      // 7e: anewarray 251
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
      // 8f: ldc2_w -5199764076723943411
      // 92: lload 2
      // 93: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 9107
      // 9b: ldc2_w 5644400013979225854
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic l (IJ)I bsm=com/zelix/qy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: irem
      // a6: goto b3
      // a9: ldc2_w -5977941382141834715
      // ac: lload 2
      // ad: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: ifne d6
      // b6: aload 0
      // b7: ldc2_w -6278057483292523076
      // ba: lload 2
      // bb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: goto cd
      // c3: ldc2_w -5977941382141834715
      // c6: lload 2
      // c7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: ldc2_w -6026482440362081043
      // d0: lload 2
      // d1: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: return
   }

   qy(q0 var1) {
      this.O = var1;
   }

   @Override
   public void mouseMoved(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/qy.a J
      // 03: ldc2_w 116070592900461
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 58567365018937
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 8632730009999
      // 14: lxor
      // 15: lstore 6
      // 17: pop2
      // 18: ldc2_w 7254384610645134467
      // 1b: lload 2
      // 1c: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 8
      // 23: aload 0
      // 24: ldc2_w 9177676505796907582
      // 27: lload 2
      // 28: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: lload 4
      // 2f: bipush 2
      // 30: anewarray 251
      // 33: dup_x2
      // 34: dup_x2
      // 35: pop
      // 36: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39: bipush 1
      // 3a: swap
      // 3b: aastore
      // 3c: dup_x1
      // 3d: swap
      // 3e: bipush 0
      // 3f: swap
      // 40: aastore
      // 41: ldc2_w 7277442178102090237
      // 44: lload 2
      // 45: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: aload 8
      // 4c: ifnull b3
      // 4f: ifeq d6
      // 52: goto 5f
      // 55: ldc2_w 8829419421894237607
      // 58: lload 2
      // 59: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc2_w 9177676505796907582
      // 63: lload 2
      // 64: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 8
      // 6b: ifnull cd
      // 6e: goto 7b
      // 71: ldc2_w 8829419421894237607
      // 74: lload 2
      // 75: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: lload 6
      // 7d: bipush 2
      // 7e: anewarray 251
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
      // 8f: ldc2_w 6941394805719867279
      // 92: lload 2
      // 93: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 32464
      // 9b: ldc2_w 108135951198913598
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic l (IJ)I bsm=com/zelix/qy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: irem
      // a6: goto b3
      // a9: ldc2_w 8829419421894237607
      // ac: lload 2
      // ad: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: ifne d6
      // b6: aload 0
      // b7: ldc2_w 9177676505796907582
      // ba: lload 2
      // bb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: goto cd
      // c3: ldc2_w 8829419421894237607
      // c6: lload 2
      // c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: ldc2_w 8926083837250900847
      // d0: lload 2
      // d1: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: return
   }

   static {
      long var0 = a ^ 27014769430417L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "\u000fÏ0\u009dú±\u0012\u0087Y>÷xô\u009fhá";
      int var7 = "\u000fÏ0\u009dú±\u0012\u0087Y>÷xô\u009fhá".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
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
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4231;
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
            throw new RuntimeException("com/zelix/qy", var14);
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
         throw new RuntimeException("com/zelix/qy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
