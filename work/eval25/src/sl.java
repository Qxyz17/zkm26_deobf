package com.zelix;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class sl implements MouseListener, ListSelectionListener, KeyListener {
   final um H;
   private static final long a = ess.a(5031511844913939607L, -6938609280888225301L, MethodHandles.lookup().lookupClass()).a(48434072017858L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sl.a J
      // 03: ldc2_w 89004185915705
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 72968490977891
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 130217780495850
      // 14: lxor
      // 15: lstore 6
      // 17: pop2
      // 18: ldc2_w 5897786888520576067
      // 1b: lload 2
      // 1c: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 8
      // 23: aload 8
      // 25: ifnull a5
      // 28: aload 1
      // 29: ldc2_w 5765796917179746341
      // 2c: lload 2
      // 2d: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: sipush 23692
      // 35: ldc2_w 8191237979732021163
      // 38: lload 2
      // 39: lxor
      // 3a: invokedynamic o (IJ)I bsm=com/zelix/sl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: if_icmpeq 76
      // 42: goto 4f
      // 45: ldc2_w 6337658916035775605
      // 48: lload 2
      // 49: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 1
      // 50: ldc2_w 5765796917179746341
      // 53: lload 2
      // 54: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: sipush 3292
      // 5c: ldc2_w 4867820840596234234
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic o (IJ)I bsm=com/zelix/sl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: if_icmpne d0
      // 69: goto 76
      // 6c: ldc2_w 6337658916035775605
      // 6f: lload 2
      // 70: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 0
      // 77: ldc2_w 6172920168238516766
      // 7a: lload 2
      // 7b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: lload 4
      // 82: bipush 1
      // 83: anewarray 62
      // 86: dup_x2
      // 87: dup_x2
      // 88: pop
      // 89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c: bipush 0
      // 8d: swap
      // 8e: aastore
      // 8f: ldc2_w 5641320023849381839
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: goto a5
      // 9b: ldc2_w 6337658916035775605
      // 9e: lload 2
      // 9f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: aload 0
      // a6: ldc2_w 6172920168238516766
      // a9: lload 2
      // aa: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: lload 6
      // b1: bipush 0
      // b2: bipush 2
      // b3: anewarray 62
      // b6: dup_x1
      // b7: swap
      // b8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // bb: bipush 1
      // bc: swap
      // bd: aastore
      // be: dup_x2
      // bf: dup_x2
      // c0: pop
      // c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c4: bipush 0
      // c5: swap
      // c6: aastore
      // c7: ldc2_w 5813201582707161901
      // ca: lload 2
      // cb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: return
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void valueChanged(ListSelectionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sl.a J
      // 03: ldc2_w 132673486548102
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 52998207954342
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 103586598434901
      // 14: lxor
      // 15: lstore 6
      // 17: pop2
      // 18: ldc2_w -6024112376464125444
      // 1b: lload 2
      // 1c: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 8
      // 23: aload 0
      // 24: ldc2_w -6334956676791634015
      // 27: lload 2
      // 28: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 8
      // 2f: ifnull ae
      // 32: lload 4
      // 34: bipush 1
      // 35: anewarray 62
      // 38: dup_x2
      // 39: dup_x2
      // 3a: pop
      // 3b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e: bipush 0
      // 3f: swap
      // 40: aastore
      // 41: ldc2_w -6084710708281780727
      // 44: lload 2
      // 45: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: ifne 97
      // 4d: goto 5a
      // 50: ldc2_w -6175337323257024054
      // 53: lload 2
      // 54: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: ldc2_w -6334956676791634015
      // 5e: lload 2
      // 5f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: lload 6
      // 66: bipush 0
      // 67: bipush 2
      // 68: anewarray 62
      // 6b: dup_x1
      // 6c: swap
      // 6d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
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
      // 7c: ldc2_w -5975277994056071534
      // 7f: lload 2
      // 80: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: aload 8
      // 87: ifnonnull cf
      // 8a: goto 97
      // 8d: ldc2_w -6175337323257024054
      // 90: lload 2
      // 91: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 0
      // 98: ldc2_w -6334956676791634015
      // 9b: lload 2
      // 9c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: goto ae
      // a4: ldc2_w -6175337323257024054
      // a7: lload 2
      // a8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: lload 6
      // b0: bipush 1
      // b1: bipush 2
      // b2: anewarray 62
      // b5: dup_x1
      // b6: swap
      // b7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ba: bipush 1
      // bb: swap
      // bc: aastore
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 0
      // c4: swap
      // c5: aastore
      // c6: ldc2_w -5975277994056071534
      // c9: lload 2
      // ca: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: return
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   sl(um var1) {
      this.H = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sl.a J
      // 03: ldc2_w 26890947808486
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 11934161885116
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 69172042799157
      // 14: lxor
      // 15: lstore 6
      // 17: pop2
      // 18: ldc2_w -8356871754144058980
      // 1b: lload 2
      // 1c: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: astore 8
      // 23: aload 8
      // 25: ifnull 72
      // 28: aload 1
      // 29: ldc2_w -7706509768926198759
      // 2c: lload 2
      // 2d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: bipush 2
      // 33: if_icmpne 9d
      // 36: goto 43
      // 39: ldc2_w -8490222411099106902
      // 3c: lload 2
      // 3d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: aload 0
      // 44: ldc2_w -8613742694944647231
      // 47: lload 2
      // 48: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: lload 4
      // 4f: bipush 1
      // 50: anewarray 62
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w -7811856204164894192
      // 5f: lload 2
      // 60: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: goto 72
      // 68: ldc2_w -8490222411099106902
      // 6b: lload 2
      // 6c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: ldc2_w -8613742694944647231
      // 76: lload 2
      // 77: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: lload 6
      // 7e: bipush 0
      // 7f: bipush 2
      // 80: anewarray 62
      // 83: dup_x1
      // 84: swap
      // 85: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
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
      // 94: ldc2_w -8253993597956167950
      // 97: lload 2
      // 98: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: return
   }

   static {
      long var0 = a ^ 89207668326347L;
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
      String var6 = "JöæÜîz\u000e.Êeó\u0082Ë\u0088ÔÁ";
      int var7 = "JöæÜîz\u000e.Êeó\u0082Ë\u0088ÔÁ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5798;
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
            throw new RuntimeException("com/zelix/sl", var14);
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
         throw new RuntimeException("com/zelix/sl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
