package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i5 extends KeyAdapter {
   final lbg n;
   private static final long a = prr.a(5717383600575271085L, -5022077053170484835L, MethodHandles.lookup().lookupClass()).a(72195174984792L);
   private static final long b;

   i5(lbg var1) {
      this.n = var1;
   }

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i5.a J
      // 003: ldc2_w 59505752406054
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 19392257805136
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 49697544291969
      // 014: lxor
      // 015: lstore 6
      // 017: pop2
      // 018: ldc2_w -5727739782878781466
      // 01b: lload 2
      // 01c: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: aload 1
      // 022: ldc2_w -5526196635066995232
      // 025: lload 2
      // 026: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: astore 9
      // 02d: astore 8
      // 02f: aload 1
      // 030: aload 8
      // 032: ifnull 061
      // 035: ldc2_w -5557242785503926348
      // 038: lload 2
      // 039: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: getstatic com/zelix/i5.b J
      // 041: l2i
      // 042: if_icmpne 111
      // 045: goto 052
      // 048: ldc2_w -6203156219221162775
      // 04b: lload 2
      // 04c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: aload 9
      // 054: goto 061
      // 057: ldc2_w -6203156219221162775
      // 05a: lload 2
      // 05b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 0
      // 062: ldc2_w -5635906638203900195
      // 065: lload 2
      // 066: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lbg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: ldc2_w -5617769392882170482
      // 06e: lload 2
      // 06f: invokedynamic u (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: aload 8
      // 076: ifnull 0df
      // 079: if_acmpne 0bd
      // 07c: goto 089
      // 07f: ldc2_w -6203156219221162775
      // 082: lload 2
      // 083: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: ldc2_w -5635906638203900195
      // 08d: lload 2
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lbg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: lload 4
      // 095: bipush 1
      // 096: anewarray 13
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: ldc2_w -6202661928377796719
      // 0a5: lload 2
      // 0a6: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 8
      // 0ad: ifnonnull 111
      // 0b0: goto 0bd
      // 0b3: ldc2_w -6203156219221162775
      // 0b6: lload 2
      // 0b7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 9
      // 0bf: aload 0
      // 0c0: ldc2_w -5635906638203900195
      // 0c3: lload 2
      // 0c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lbg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: ldc2_w -5999438872733717452
      // 0cc: lload 2
      // 0cd: invokedynamic u (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: goto 0df
      // 0d5: ldc2_w -6203156219221162775
      // 0d8: lload 2
      // 0d9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: if_acmpne 111
      // 0e2: aload 0
      // 0e3: ldc2_w -5635906638203900195
      // 0e6: lload 2
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lbg; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: lload 6
      // 0ee: bipush 1
      // 0ef: anewarray 13
      // 0f2: dup_x2
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w -6259355463964911283
      // 0fe: lload 2
      // 0ff: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: goto 111
      // 107: ldc2_w -6203156219221162775
      // 10a: lload 2
      // 10b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: return
   }

   static {
      long var0 = a ^ 106114375553285L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 8758445900691485948L;
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

   private static n9 a(n9 var0) {
      return var0;
   }
}
