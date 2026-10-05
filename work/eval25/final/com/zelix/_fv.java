package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fv extends KeyAdapter implements ActionListener {
   final q_ t;
   private static final long a = ess.a(-4721992085555909816L, -7309338516816371978L, MethodHandles.lookup().lookupClass()).a(245861694430071L);
   private static final long b;

   _fv(q_ var1) {
      this.t = var1;
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
      // 000: getstatic com/zelix/_fv.a J
      // 003: ldc2_w 75871861979571
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 104949628067807
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 47825990560958
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 10365161869113
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 117995322187324
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w -8961689337396190837
      // 029: lload 2
      // 02a: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: aload 12
      // 034: ifnull 06b
      // 037: ldc2_w -8812310469888287339
      // 03a: lload 2
      // 03b: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: getstatic com/zelix/_fv.b J
      // 043: l2i
      // 044: if_icmpne 14d
      // 047: goto 054
      // 04a: ldc2_w -7073614175852004379
      // 04d: lload 2
      // 04e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 1
      // 055: ldc2_w -7285922702500879545
      // 058: lload 2
      // 059: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: goto 06b
      // 061: ldc2_w -7073614175852004379
      // 064: lload 2
      // 065: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: ldc2_w -9135700439886856284
      // 06f: lload 2
      // 070: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: lload 6
      // 077: bipush 2
      // 078: anewarray 21
      // 07b: dup_x2
      // 07c: dup_x2
      // 07d: pop
      // 07e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 081: bipush 1
      // 082: swap
      // 083: aastore
      // 084: dup_x1
      // 085: swap
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w -6969211321633283881
      // 08c: lload 2
      // 08d: invokedynamic s (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: aload 12
      // 094: ifnull 11b
      // 097: if_acmpne 0db
      // 09a: goto 0a7
      // 09d: ldc2_w -7073614175852004379
      // 0a0: lload 2
      // 0a1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: ldc2_w -9135700439886856284
      // 0ab: lload 2
      // 0ac: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: lload 10
      // 0b3: bipush 1
      // 0b4: anewarray 21
      // 0b7: dup_x2
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w -9169521487474002963
      // 0c3: lload 2
      // 0c4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: aload 12
      // 0cb: ifnonnull 14d
      // 0ce: goto 0db
      // 0d1: ldc2_w -7073614175852004379
      // 0d4: lload 2
      // 0d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 1
      // 0dc: ldc2_w -7285922702500879545
      // 0df: lload 2
      // 0e0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: aload 0
      // 0e6: ldc2_w -9135700439886856284
      // 0e9: lload 2
      // 0ea: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: lload 8
      // 0f1: dup2_x1
      // 0f2: pop2
      // 0f3: bipush 2
      // 0f4: anewarray 21
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: bipush 1
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: ldc2_w -8913957008127515159
      // 108: lload 2
      // 109: invokedynamic s (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: goto 11b
      // 111: ldc2_w -7073614175852004379
      // 114: lload 2
      // 115: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: if_acmpne 14d
      // 11e: aload 0
      // 11f: ldc2_w -9135700439886856284
      // 122: lload 2
      // 123: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: lload 4
      // 12a: bipush 1
      // 12b: anewarray 21
      // 12e: dup_x2
      // 12f: dup_x2
      // 130: pop
      // 131: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: ldc2_w -9069732398926694324
      // 13a: lload 2
      // 13b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: goto 14d
      // 143: ldc2_w -7073614175852004379
      // 146: lload 2
      // 147: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: return
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_fv.a J
      // 003: ldc2_w 81059410460033
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 92132072283117
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 43735871236236
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 6412486216459
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 114249275775502
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w -8677412016024705607
      // 029: lload 2
      // 02a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: ldc2_w -7103653758323357113
      // 035: lload 2
      // 036: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 0
      // 03c: ldc2_w -8861548727323198570
      // 03f: lload 2
      // 040: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: lload 6
      // 047: bipush 2
      // 048: anewarray 21
      // 04b: dup_x2
      // 04c: dup_x2
      // 04d: pop
      // 04e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 051: bipush 1
      // 052: swap
      // 053: aastore
      // 054: dup_x1
      // 055: swap
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: ldc2_w -7243354444667624219
      // 05c: lload 2
      // 05d: invokedynamic q (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 12
      // 064: ifnull 0eb
      // 067: if_acmpne 0ab
      // 06a: goto 077
      // 06d: ldc2_w -7356781886383816745
      // 070: lload 2
      // 071: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 0
      // 078: ldc2_w -8861548727323198570
      // 07b: lload 2
      // 07c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: lload 10
      // 083: bipush 1
      // 084: anewarray 21
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w -8895352043134191649
      // 093: lload 2
      // 094: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: aload 12
      // 09b: ifnonnull 11d
      // 09e: goto 0ab
      // 0a1: ldc2_w -7356781886383816745
      // 0a4: lload 2
      // 0a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 1
      // 0ac: ldc2_w -7103653758323357113
      // 0af: lload 2
      // 0b0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 0
      // 0b6: ldc2_w -8861548727323198570
      // 0b9: lload 2
      // 0ba: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 8
      // 0c1: dup2_x1
      // 0c2: pop2
      // 0c3: bipush 2
      // 0c4: anewarray 21
      // 0c7: dup_x1
      // 0c8: swap
      // 0c9: bipush 1
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x2
      // 0cd: dup_x2
      // 0ce: pop
      // 0cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w -9189225689150610981
      // 0d8: lload 2
      // 0d9: invokedynamic q (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: goto 0eb
      // 0e1: ldc2_w -7356781886383816745
      // 0e4: lload 2
      // 0e5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: if_acmpne 11d
      // 0ee: aload 0
      // 0ef: ldc2_w -8861548727323198570
      // 0f2: lload 2
      // 0f3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: lload 4
      // 0fa: bipush 1
      // 0fb: anewarray 21
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w -8785437828497310594
      // 10a: lload 2
      // 10b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: goto 11d
      // 113: ldc2_w -7356781886383816745
      // 116: lload 2
      // 117: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: return
   }

   static {
      long var0 = a ^ 123152335404140L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 7824892942908602867L;
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
