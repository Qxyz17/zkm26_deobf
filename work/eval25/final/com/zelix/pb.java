package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pb extends KeyAdapter {
   final s1 M;
   private static final long a = ess.a(6219653034822396942L, 4049367019308717567L, MethodHandles.lookup().lookupClass()).a(141250263528861L);
   private static final long b;

   pb(s1 var1) {
      this.M = var1;
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
      // 000: getstatic com/zelix/pb.a J
      // 003: ldc2_w 106176330919204
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 55582795458554
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 130806960388792
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 126831382961671
      // 01b: lxor
      // 01c: lstore 8
      // 01e: pop2
      // 01f: ldc2_w -8937615647850398099
      // 022: lload 2
      // 023: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 10
      // 02a: aload 1
      // 02b: aload 10
      // 02d: ifnull 086
      // 030: ldc2_w -9067389020944442869
      // 033: lload 2
      // 034: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: getstatic com/zelix/pb.b J
      // 03c: l2i
      // 03d: if_icmpne 13f
      // 040: goto 04d
      // 043: ldc2_w -8785639163433097486
      // 046: lload 2
      // 047: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 0
      // 04e: ldc2_w -9112881768486753210
      // 051: lload 2
      // 052: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/s1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: lload 8
      // 059: bipush 1
      // 05a: anewarray 16
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w -9037316920824615508
      // 069: lload 2
      // 06a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 1
      // 070: ldc2_w -7098385430336953127
      // 073: lload 2
      // 074: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: goto 086
      // 07c: ldc2_w -8785639163433097486
      // 07f: lload 2
      // 080: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: astore 11
      // 088: aload 10
      // 08a: ifnull 102
      // 08d: aload 11
      // 08f: aload 0
      // 090: ldc2_w -9112881768486753210
      // 093: lload 2
      // 094: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/s1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: ldc2_w -9007527336965356199
      // 09c: lload 2
      // 09d: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: if_acmpne 107
      // 0a5: goto 0b2
      // 0a8: ldc2_w -8785639163433097486
      // 0ab: lload 2
      // 0ac: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: ldc2_w -9112881768486753210
      // 0b6: lload 2
      // 0b7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/s1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: ldc2_w -8775796882756585692
      // 0bf: lload 2
      // 0c0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: aload 0
      // 0c6: ldc2_w -9112881768486753210
      // 0c9: lload 2
      // 0ca: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/s1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: ldc2_w -8972984083783063255
      // 0d2: lload 2
      // 0d3: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: lload 4
      // 0da: bipush 2
      // 0db: anewarray 16
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w -7367119380162504238
      // 0ef: lload 2
      // 0f0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: goto 102
      // 0f8: ldc2_w -8785639163433097486
      // 0fb: lload 2
      // 0fc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 10
      // 104: ifnonnull 13f
      // 107: aload 0
      // 108: ldc2_w -9112881768486753210
      // 10b: lload 2
      // 10c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/s1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: ldc2_w -8775796882756585692
      // 114: lload 2
      // 115: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/eq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: lload 6
      // 11c: bipush 1
      // 11d: anewarray 16
      // 120: dup_x2
      // 121: dup_x2
      // 122: pop
      // 123: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 126: bipush 0
      // 127: swap
      // 128: aastore
      // 129: ldc2_w -7150474681620497169
      // 12c: lload 2
      // 12d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: goto 13f
      // 135: ldc2_w -8785639163433097486
      // 138: lload 2
      // 139: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: return
   }

   static {
      long var0 = a ^ 3364552537016L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 8391315031778895189L;
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
