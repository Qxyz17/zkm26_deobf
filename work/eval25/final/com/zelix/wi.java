package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wi extends KeyAdapter {
   final u0 S;
   private static final long a = ess.a(9022614754436771363L, -5323379364622794682L, MethodHandles.lookup().lookupClass()).a(43069059244745L);
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
      // 000: getstatic com/zelix/wi.a J
      // 003: ldc2_w 115442979151487
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 61589992372257
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 135142784748349
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 45977371667739
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 34120861562137
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 1303305619469
      // 029: lxor
      // 02a: lstore 12
      // 02c: pop2
      // 02d: ldc2_w -1669317941727718065
      // 030: lload 2
      // 031: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: astore 14
      // 038: aload 1
      // 039: aload 14
      // 03b: ifnull 072
      // 03e: ldc2_w -1654940375421210327
      // 041: lload 2
      // 042: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: getstatic com/zelix/wi.b J
      // 04a: l2i
      // 04b: if_icmpne 283
      // 04e: goto 05b
      // 051: ldc2_w -581352531491316399
      // 054: lload 2
      // 055: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 1
      // 05c: ldc2_w -693789872024956933
      // 05f: lload 2
      // 060: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: goto 072
      // 068: ldc2_w -581352531491316399
      // 06b: lload 2
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: ldc2_w -607590449626640805
      // 076: lload 2
      // 077: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: ldc2_w -1381147400245243673
      // 07f: lload 2
      // 080: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 14
      // 087: ifnull 0f8
      // 08a: if_acmpne 0ce
      // 08d: goto 09a
      // 090: ldc2_w -581352531491316399
      // 093: lload 2
      // 094: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 0
      // 09b: ldc2_w -607590449626640805
      // 09e: lload 2
      // 09f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: lload 8
      // 0a6: bipush 1
      // 0a7: anewarray 58
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -998047390107098142
      // 0b6: lload 2
      // 0b7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: aload 14
      // 0be: ifnonnull 283
      // 0c1: goto 0ce
      // 0c4: ldc2_w -581352531491316399
      // 0c7: lload 2
      // 0c8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: ldc2_w -693789872024956933
      // 0d2: lload 2
      // 0d3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: aload 0
      // 0d9: ldc2_w -607590449626640805
      // 0dc: lload 2
      // 0dd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: ldc2_w -1100856213116412326
      // 0e5: lload 2
      // 0e6: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: goto 0f8
      // 0ee: ldc2_w -581352531491316399
      // 0f1: lload 2
      // 0f2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: aload 14
      // 0fa: ifnull 16b
      // 0fd: if_acmpne 141
      // 100: goto 10d
      // 103: ldc2_w -581352531491316399
      // 106: lload 2
      // 107: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: aload 0
      // 10e: ldc2_w -607590449626640805
      // 111: lload 2
      // 112: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: lload 10
      // 119: bipush 1
      // 11a: anewarray 58
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w -868360033910057032
      // 129: lload 2
      // 12a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: aload 14
      // 131: ifnonnull 283
      // 134: goto 141
      // 137: ldc2_w -581352531491316399
      // 13a: lload 2
      // 13b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 1
      // 142: ldc2_w -693789872024956933
      // 145: lload 2
      // 146: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: aload 0
      // 14c: ldc2_w -607590449626640805
      // 14f: lload 2
      // 150: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: ldc2_w -1355910844955737145
      // 158: lload 2
      // 159: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: goto 16b
      // 161: ldc2_w -581352531491316399
      // 164: lload 2
      // 165: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 14
      // 16d: ifnull 1de
      // 170: if_acmpne 1b4
      // 173: goto 180
      // 176: ldc2_w -581352531491316399
      // 179: lload 2
      // 17a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: aload 0
      // 181: ldc2_w -607590449626640805
      // 184: lload 2
      // 185: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: lload 4
      // 18c: bipush 1
      // 18d: anewarray 58
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 0
      // 197: swap
      // 198: aastore
      // 199: ldc2_w -1003731943854695506
      // 19c: lload 2
      // 19d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: aload 14
      // 1a4: ifnonnull 283
      // 1a7: goto 1b4
      // 1aa: ldc2_w -581352531491316399
      // 1ad: lload 2
      // 1ae: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 1
      // 1b5: ldc2_w -693789872024956933
      // 1b8: lload 2
      // 1b9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: aload 0
      // 1bf: ldc2_w -607590449626640805
      // 1c2: lload 2
      // 1c3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: ldc2_w -1303016843497937619
      // 1cb: lload 2
      // 1cc: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: goto 1de
      // 1d4: ldc2_w -581352531491316399
      // 1d7: lload 2
      // 1d8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: aload 14
      // 1e0: ifnull 251
      // 1e3: if_acmpne 227
      // 1e6: goto 1f3
      // 1e9: ldc2_w -581352531491316399
      // 1ec: lload 2
      // 1ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: aload 0
      // 1f4: ldc2_w -607590449626640805
      // 1f7: lload 2
      // 1f8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: lload 12
      // 1ff: bipush 1
      // 200: anewarray 58
      // 203: dup_x2
      // 204: dup_x2
      // 205: pop
      // 206: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: ldc2_w -1003391324338892594
      // 20f: lload 2
      // 210: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: aload 14
      // 217: ifnonnull 283
      // 21a: goto 227
      // 21d: ldc2_w -581352531491316399
      // 220: lload 2
      // 221: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: aload 1
      // 228: ldc2_w -693789872024956933
      // 22b: lload 2
      // 22c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: aload 0
      // 232: ldc2_w -607590449626640805
      // 235: lload 2
      // 236: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: ldc2_w -1140340329578580776
      // 23e: lload 2
      // 23f: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: goto 251
      // 247: ldc2_w -581352531491316399
      // 24a: lload 2
      // 24b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: if_acmpne 283
      // 254: aload 0
      // 255: ldc2_w -607590449626640805
      // 258: lload 2
      // 259: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u0; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: lload 6
      // 260: bipush 1
      // 261: anewarray 58
      // 264: dup_x2
      // 265: dup_x2
      // 266: pop
      // 267: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26a: bipush 0
      // 26b: swap
      // 26c: aastore
      // 26d: ldc2_w -1383954893795595603
      // 270: lload 2
      // 271: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: goto 283
      // 279: ldc2_w -581352531491316399
      // 27c: lload 2
      // 27d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: return
   }

   wi(u0 var1) {
      this.S = var1;
   }

   static {
      long var0 = a ^ 62940241344441L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 5087914602004001061L;
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
