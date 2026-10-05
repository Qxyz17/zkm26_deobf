package com.zelix;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _zj implements PropertyChangeListener {
   final q_ W;
   private static final long a = ess.a(818092070510464540L, 3416022499475576357L, MethodHandles.lookup().lookupClass()).a(22707375136446L);
   private static final String b;

   @Override
   public void propertyChange(PropertyChangeEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_zj.a J
      // 03: ldc2_w 38595969680791
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 34558727245391
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 5825565596706009842
      // 14: lload 2
      // 15: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 1
      // 1d: ldc2_w 5200076237372865406
      // 20: lload 2
      // 21: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 6
      // 28: ifnull 58
      // 2b: getstatic com/zelix/_zj.b Ljava/lang/String;
      // 2e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31: ifeq fa
      // 34: goto 41
      // 37: ldc2_w 6314240532595507241
      // 3a: lload 2
      // 3b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 1
      // 42: ldc2_w 5659927338982175347
      // 45: lload 2
      // 46: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: goto 58
      // 4e: ldc2_w 6314240532595507241
      // 51: lload 2
      // 52: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: checkcast java/io/File
      // 5b: astore 7
      // 5d: aload 6
      // 5f: ifnull c8
      // 62: aload 7
      // 64: ifnull fa
      // 67: goto 74
      // 6a: ldc2_w 6314240532595507241
      // 6d: lload 2
      // 6e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: aload 0
      // 75: ldc2_w 5295866113607701545
      // 78: lload 2
      // 79: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: bipush 1
      // 7f: ldc2_w 5774740964975277285
      // 82: lload 2
      // 83: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: aload 0
      // 89: ldc2_w 5295866113607701545
      // 8c: lload 2
      // 8d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: lload 4
      // 94: dup2_x1
      // 95: pop2
      // 96: bipush 2
      // 97: anewarray 133
      // 9a: dup_x1
      // 9b: swap
      // 9c: bipush 1
      // 9d: swap
      // 9e: aastore
      // 9f: dup_x2
      // a0: dup_x2
      // a1: pop
      // a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a5: bipush 0
      // a6: swap
      // a7: aastore
      // a8: ldc2_w 6209080765107366912
      // ab: lload 2
      // ac: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/s2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: bipush 0
      // b2: ldc2_w 5239894509447450760
      // b5: lload 2
      // b6: invokedynamic j (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: goto c8
      // be: ldc2_w 6314240532595507241
      // c1: lload 2
      // c2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 0
      // c9: ldc2_w 5295866113607701545
      // cc: lload 2
      // cd: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: lload 4
      // d4: dup2_x1
      // d5: pop2
      // d6: bipush 2
      // d7: anewarray 133
      // da: dup_x1
      // db: swap
      // dc: bipush 1
      // dd: swap
      // de: aastore
      // df: dup_x2
      // e0: dup_x2
      // e1: pop
      // e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e5: bipush 0
      // e6: swap
      // e7: aastore
      // e8: ldc2_w 6209080765107366912
      // eb: lload 2
      // ec: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/s2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f1: ldc2_w 5992636785866304539
      // f4: lload 2
      // f5: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fa: return
   }

   _zj(q_ var1) {
      this.W = var1;
   }

   static {
      long var0 = a ^ 54362054630805L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(":d_ò}Ñ¿bj\u0096\u0096\u0013\u0000ó»%".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
