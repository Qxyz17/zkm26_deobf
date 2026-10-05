package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a5 extends KeyAdapter {
   final ut C;
   private static final long a = ess.a(9218665229545964980L, -5313238348941881848L, MethodHandles.lookup().lookupClass()).a(276580035726439L);
   private static final long b;

   a5(ut var1) {
      this.C = var1;
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
      // 000: getstatic com/zelix/a5.a J
      // 003: ldc2_w 72555105139207
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 74139853079032
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 103609278121187
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 70491032484343
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 65809272486599
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 22294470845676
      // 029: lxor
      // 02a: lstore 12
      // 02c: pop2
      // 02d: ldc2_w 1814709986199135413
      // 030: lload 2
      // 031: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: astore 14
      // 038: aload 1
      // 039: aload 14
      // 03b: ifnull 072
      // 03e: ldc2_w 1797562200482889939
      // 041: lload 2
      // 042: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: getstatic com/zelix/a5.b J
      // 04a: l2i
      // 04b: if_icmpne 224
      // 04e: goto 05b
      // 051: ldc2_w 519800288468833660
      // 054: lload 2
      // 055: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 1
      // 05c: ldc2_w 550961954568715777
      // 05f: lload 2
      // 060: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: goto 072
      // 068: ldc2_w 519800288468833660
      // 06b: lload 2
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: ldc2_w 2077287216384475386
      // 076: lload 2
      // 077: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: lload 4
      // 07e: bipush 2
      // 07f: anewarray 87
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w 2045836043198085076
      // 093: lload 2
      // 094: invokedynamic u (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: aload 14
      // 09b: ifnull 10c
      // 09e: if_acmpne 0e2
      // 0a1: goto 0ae
      // 0a4: ldc2_w 519800288468833660
      // 0a7: lload 2
      // 0a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: ldc2_w 2077287216384475386
      // 0b2: lload 2
      // 0b3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: lload 12
      // 0ba: bipush 1
      // 0bb: anewarray 87
      // 0be: dup_x2
      // 0bf: dup_x2
      // 0c0: pop
      // 0c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: ldc2_w 155876834071997868
      // 0ca: lload 2
      // 0cb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: aload 14
      // 0d2: ifnonnull 224
      // 0d5: goto 0e2
      // 0d8: ldc2_w 519800288468833660
      // 0db: lload 2
      // 0dc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: ldc2_w 550961954568715777
      // 0e6: lload 2
      // 0e7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: aload 0
      // 0ed: ldc2_w 2077287216384475386
      // 0f0: lload 2
      // 0f1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: ldc2_w 90837426041843616
      // 0f9: lload 2
      // 0fa: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: goto 10c
      // 102: ldc2_w 519800288468833660
      // 105: lload 2
      // 106: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: aload 14
      // 10e: ifnull 17f
      // 111: if_acmpne 155
      // 114: goto 121
      // 117: ldc2_w 519800288468833660
      // 11a: lload 2
      // 11b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 0
      // 122: ldc2_w 2077287216384475386
      // 125: lload 2
      // 126: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: lload 6
      // 12d: bipush 1
      // 12e: anewarray 87
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 0
      // 138: swap
      // 139: aastore
      // 13a: ldc2_w 146567190983206466
      // 13d: lload 2
      // 13e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: aload 14
      // 145: ifnonnull 224
      // 148: goto 155
      // 14b: ldc2_w 519800288468833660
      // 14e: lload 2
      // 14f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 1
      // 156: ldc2_w 550961954568715777
      // 159: lload 2
      // 15a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: aload 0
      // 160: ldc2_w 2077287216384475386
      // 163: lload 2
      // 164: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: ldc2_w 2022257136223294679
      // 16c: lload 2
      // 16d: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: goto 17f
      // 175: ldc2_w 519800288468833660
      // 178: lload 2
      // 179: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 14
      // 181: ifnull 1f2
      // 184: if_acmpne 1c8
      // 187: goto 194
      // 18a: ldc2_w 519800288468833660
      // 18d: lload 2
      // 18e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aload 0
      // 195: ldc2_w 2077287216384475386
      // 198: lload 2
      // 199: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: lload 8
      // 1a0: bipush 1
      // 1a1: anewarray 87
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 0
      // 1ab: swap
      // 1ac: aastore
      // 1ad: ldc2_w 281894831606767924
      // 1b0: lload 2
      // 1b1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: aload 14
      // 1b8: ifnonnull 224
      // 1bb: goto 1c8
      // 1be: ldc2_w 519800288468833660
      // 1c1: lload 2
      // 1c2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: aload 1
      // 1c9: ldc2_w 550961954568715777
      // 1cc: lload 2
      // 1cd: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: aload 0
      // 1d3: ldc2_w 2077287216384475386
      // 1d6: lload 2
      // 1d7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: ldc2_w 132561176822826274
      // 1df: lload 2
      // 1e0: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: goto 1f2
      // 1e8: ldc2_w 519800288468833660
      // 1eb: lload 2
      // 1ec: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: if_acmpne 224
      // 1f5: aload 0
      // 1f6: ldc2_w 2077287216384475386
      // 1f9: lload 2
      // 1fa: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/ut; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: lload 10
      // 201: bipush 1
      // 202: anewarray 87
      // 205: dup_x2
      // 206: dup_x2
      // 207: pop
      // 208: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20b: bipush 0
      // 20c: swap
      // 20d: aastore
      // 20e: ldc2_w 331907477893628167
      // 211: lload 2
      // 212: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: goto 224
      // 21a: ldc2_w 519800288468833660
      // 21d: lload 2
      // 21e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: return
   }

   static {
      long var0 = a ^ 97239110899456L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 6921438174194677850L;
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
