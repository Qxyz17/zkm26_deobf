package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _r5 extends KeyAdapter {
   final uw t;
   private static final long a = ess.a(-8225695764345319914L, 1918729090863522242L, MethodHandles.lookup().lookupClass()).a(98221875831455L);
   private static final long b;

   @Override
   public void keyPressed(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_r5.a J
      // 003: ldc2_w 111753446350608
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 12592685938427
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 32503452350641
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 48278961885832
      // 01b: lxor
      // 01c: lstore 8
      // 01e: pop2
      // 01f: ldc2_w -7199073953548660833
      // 022: lload 2
      // 023: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 10
      // 02a: aload 1
      // 02b: aload 10
      // 02d: ifnull 064
      // 030: ldc2_w -7401332563062341272
      // 033: lload 2
      // 034: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: getstatic com/zelix/_r5.b J
      // 03c: l2i
      // 03d: if_icmpne 19d
      // 040: goto 04d
      // 043: ldc2_w -8778070065131111378
      // 046: lload 2
      // 047: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 1
      // 04e: ldc2_w -8782443092868186182
      // 051: lload 2
      // 052: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: goto 064
      // 05a: ldc2_w -8778070065131111378
      // 05d: lload 2
      // 05e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 0
      // 065: ldc2_w -7370097160963307343
      // 068: lload 2
      // 069: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: ldc2_w -8815181409114604344
      // 071: lload 2
      // 072: invokedynamic j (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 10
      // 079: ifnull 0f1
      // 07c: if_acmpne 0c7
      // 07f: goto 08c
      // 082: ldc2_w -8778070065131111378
      // 085: lload 2
      // 086: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: aload 0
      // 08d: ldc2_w -7370097160963307343
      // 090: lload 2
      // 091: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 4
      // 098: dup2_x1
      // 099: pop2
      // 09a: bipush 2
      // 09b: anewarray 90
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 1
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w -6933944192647894990
      // 0af: lload 2
      // 0b0: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 10
      // 0b7: ifnonnull 19d
      // 0ba: goto 0c7
      // 0bd: ldc2_w -8778070065131111378
      // 0c0: lload 2
      // 0c1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: ldc2_w -8782443092868186182
      // 0cb: lload 2
      // 0cc: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: aload 0
      // 0d2: ldc2_w -7370097160963307343
      // 0d5: lload 2
      // 0d6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: ldc2_w -6968766408547405236
      // 0de: lload 2
      // 0df: invokedynamic j (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 0f1
      // 0e7: ldc2_w -8778070065131111378
      // 0ea: lload 2
      // 0eb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 10
      // 0f3: ifnull 164
      // 0f6: if_acmpne 13a
      // 0f9: goto 106
      // 0fc: ldc2_w -8778070065131111378
      // 0ff: lload 2
      // 100: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: ldc2_w -7370097160963307343
      // 10a: lload 2
      // 10b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: lload 6
      // 112: bipush 1
      // 113: anewarray 90
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -7007762565283470967
      // 122: lload 2
      // 123: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: aload 10
      // 12a: ifnonnull 19d
      // 12d: goto 13a
      // 130: ldc2_w -8778070065131111378
      // 133: lload 2
      // 134: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 1
      // 13b: ldc2_w -8782443092868186182
      // 13e: lload 2
      // 13f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: aload 0
      // 145: ldc2_w -7370097160963307343
      // 148: lload 2
      // 149: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: ldc2_w -8782375939458864803
      // 151: lload 2
      // 152: invokedynamic j (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: goto 164
      // 15a: ldc2_w -8778070065131111378
      // 15d: lload 2
      // 15e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: if_acmpne 19d
      // 167: aload 0
      // 168: ldc2_w -7370097160963307343
      // 16b: lload 2
      // 16c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/uw; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: lload 8
      // 173: dup2_x1
      // 174: pop2
      // 175: bipush 2
      // 176: anewarray 90
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 1
      // 17c: swap
      // 17d: aastore
      // 17e: dup_x2
      // 17f: dup_x2
      // 180: pop
      // 181: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: ldc2_w -8667534704677200769
      // 18a: lload 2
      // 18b: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: goto 19d
      // 193: ldc2_w -8778070065131111378
      // 196: lload 2
      // 197: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: return
   }

   _r5(uw var1) {
      this.t = var1;
   }

   static {
      long var0 = a ^ 99104323757467L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -717496052132168935L;
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
