package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xg extends KeyAdapter {
   final ux J;
   private static final long a = ess.a(390042356350887114L, 5779485141312758074L, MethodHandles.lookup().lookupClass()).a(90036059290804L);
   private static final long b;

   _xg(ux var1) {
      this.J = var1;
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
      // 000: getstatic com/zelix/_xg.a J
      // 003: ldc2_w 57825522071963
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 105288833983013
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 63924010785793
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 39601296122133
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 75121513599838
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w 4741517477723487319
      // 029: lload 2
      // 02a: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: aload 12
      // 034: ifnull 06b
      // 037: ldc2_w 4616292234364491825
      // 03a: lload 2
      // 03b: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: getstatic com/zelix/_xg.b J
      // 043: l2i
      // 044: if_icmpne 209
      // 047: goto 054
      // 04a: ldc2_w 5042568301209657065
      // 04d: lload 2
      // 04e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 1
      // 055: ldc2_w 6865470324420503267
      // 058: lload 2
      // 059: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: goto 06b
      // 061: ldc2_w 5042568301209657065
      // 064: lload 2
      // 065: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: ldc2_w 5039767136798102043
      // 06f: lload 2
      // 070: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w 6458403965478090562
      // 078: lload 2
      // 079: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: aload 12
      // 080: ifnull 0f1
      // 083: if_acmpne 0c7
      // 086: goto 093
      // 089: ldc2_w 5042568301209657065
      // 08c: lload 2
      // 08d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 0
      // 094: ldc2_w 5039767136798102043
      // 097: lload 2
      // 098: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: lload 6
      // 09f: bipush 1
      // 0a0: anewarray 92
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w 6551279563245403808
      // 0af: lload 2
      // 0b0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 12
      // 0b7: ifnonnull 209
      // 0ba: goto 0c7
      // 0bd: ldc2_w 5042568301209657065
      // 0c0: lload 2
      // 0c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: ldc2_w 6865470324420503267
      // 0cb: lload 2
      // 0cc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: aload 0
      // 0d2: ldc2_w 5039767136798102043
      // 0d5: lload 2
      // 0d6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: ldc2_w 5016254180176277449
      // 0de: lload 2
      // 0df: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 0f1
      // 0e7: ldc2_w 5042568301209657065
      // 0ea: lload 2
      // 0eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 12
      // 0f3: ifnull 164
      // 0f6: if_acmpne 13a
      // 0f9: goto 106
      // 0fc: ldc2_w 5042568301209657065
      // 0ff: lload 2
      // 100: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: ldc2_w 5039767136798102043
      // 10a: lload 2
      // 10b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: lload 10
      // 112: bipush 1
      // 113: anewarray 92
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w 4983790770518620201
      // 122: lload 2
      // 123: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: aload 12
      // 12a: ifnonnull 209
      // 12d: goto 13a
      // 130: ldc2_w 5042568301209657065
      // 133: lload 2
      // 134: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 1
      // 13b: ldc2_w 6865470324420503267
      // 13e: lload 2
      // 13f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: aload 0
      // 145: ldc2_w 5039767136798102043
      // 148: lload 2
      // 149: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: ldc2_w 4968284296916094005
      // 151: lload 2
      // 152: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: goto 164
      // 15a: ldc2_w 5042568301209657065
      // 15d: lload 2
      // 15e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 12
      // 166: ifnull 1d7
      // 169: if_acmpne 1ad
      // 16c: goto 179
      // 16f: ldc2_w 5042568301209657065
      // 172: lload 2
      // 173: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 0
      // 17a: ldc2_w 5039767136798102043
      // 17d: lload 2
      // 17e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: lload 8
      // 185: bipush 1
      // 186: anewarray 92
      // 189: dup_x2
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 6560365607642200534
      // 195: lload 2
      // 196: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: aload 12
      // 19d: ifnonnull 209
      // 1a0: goto 1ad
      // 1a3: ldc2_w 5042568301209657065
      // 1a6: lload 2
      // 1a7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 1
      // 1ae: ldc2_w 6865470324420503267
      // 1b1: lload 2
      // 1b2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: aload 0
      // 1b8: ldc2_w 5039767136798102043
      // 1bb: lload 2
      // 1bc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: ldc2_w 6427929316013317568
      // 1c4: lload 2
      // 1c5: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: goto 1d7
      // 1cd: ldc2_w 5042568301209657065
      // 1d0: lload 2
      // 1d1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: if_acmpne 209
      // 1da: aload 0
      // 1db: ldc2_w 5039767136798102043
      // 1de: lload 2
      // 1df: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/ux; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: lload 4
      // 1e6: bipush 1
      // 1e7: anewarray 92
      // 1ea: dup_x2
      // 1eb: dup_x2
      // 1ec: pop
      // 1ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f0: bipush 0
      // 1f1: swap
      // 1f2: aastore
      // 1f3: ldc2_w 5031384382980998069
      // 1f6: lload 2
      // 1f7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: goto 209
      // 1ff: ldc2_w 5042568301209657065
      // 202: lload 2
      // 203: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: return
   }

   static {
      long var0 = a ^ 34083351645986L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -7851297128867931468L;
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
