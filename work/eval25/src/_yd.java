package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _yd extends KeyAdapter {
   final u9 I;
   private static final long a = ess.a(-772135150853692498L, -5326628622974734653L, MethodHandles.lookup().lookupClass()).a(91742958823355L);
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
      // 000: getstatic com/zelix/_yd.a J
      // 003: ldc2_w 121817542357344
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 130367028553513
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 576123005607
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 106580019671646
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 50352527252638
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w 7599835708644758754
      // 029: lload 2
      // 02a: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: aload 12
      // 034: ifnull 06b
      // 037: ldc2_w 7540457467892379780
      // 03a: lload 2
      // 03b: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: getstatic com/zelix/_yd.b J
      // 043: l2i
      // 044: if_icmpne 1f5
      // 047: goto 054
      // 04a: ldc2_w 7821769956409373487
      // 04d: lload 2
      // 04e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 1
      // 055: ldc2_w 8643049435012255318
      // 058: lload 2
      // 059: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: goto 06b
      // 061: ldc2_w 7821769956409373487
      // 064: lload 2
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: astore 13
      // 06d: aload 13
      // 06f: aload 0
      // 070: ldc2_w 8549749974576914693
      // 073: lload 2
      // 074: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: ldc2_w 8071261238934027067
      // 07c: lload 2
      // 07d: invokedynamic n (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: aload 12
      // 084: ifnull 0ed
      // 087: if_acmpne 0cb
      // 08a: goto 097
      // 08d: ldc2_w 7821769956409373487
      // 090: lload 2
      // 091: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: aload 0
      // 098: ldc2_w 8549749974576914693
      // 09b: lload 2
      // 09c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: lload 10
      // 0a3: bipush 1
      // 0a4: anewarray 51
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 8336281881204316542
      // 0b3: lload 2
      // 0b4: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: aload 12
      // 0bb: ifnonnull 1f5
      // 0be: goto 0cb
      // 0c1: ldc2_w 7821769956409373487
      // 0c4: lload 2
      // 0c5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 13
      // 0cd: aload 0
      // 0ce: ldc2_w 8549749974576914693
      // 0d1: lload 2
      // 0d2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: ldc2_w 7539255051436816452
      // 0da: lload 2
      // 0db: invokedynamic n (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: goto 0ed
      // 0e3: ldc2_w 7821769956409373487
      // 0e6: lload 2
      // 0e7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 12
      // 0ef: ifnull 158
      // 0f2: if_acmpne 136
      // 0f5: goto 102
      // 0f8: ldc2_w 7821769956409373487
      // 0fb: lload 2
      // 0fc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 0
      // 103: ldc2_w 8549749974576914693
      // 106: lload 2
      // 107: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: lload 4
      // 10e: bipush 1
      // 10f: anewarray 51
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w 7981163318662242679
      // 11e: lload 2
      // 11f: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: aload 12
      // 126: ifnonnull 1f5
      // 129: goto 136
      // 12c: ldc2_w 7821769956409373487
      // 12f: lload 2
      // 130: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 13
      // 138: aload 0
      // 139: ldc2_w 8549749974576914693
      // 13c: lload 2
      // 13d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: ldc2_w 8393639490669752959
      // 145: lload 2
      // 146: invokedynamic n (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: goto 158
      // 14e: ldc2_w 7821769956409373487
      // 151: lload 2
      // 152: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: aload 12
      // 15a: ifnull 1c3
      // 15d: if_acmpne 1a1
      // 160: goto 16d
      // 163: ldc2_w 7821769956409373487
      // 166: lload 2
      // 167: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: aload 0
      // 16e: ldc2_w 8549749974576914693
      // 171: lload 2
      // 172: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: lload 6
      // 179: bipush 1
      // 17a: anewarray 51
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 0
      // 184: swap
      // 185: aastore
      // 186: ldc2_w 8301304225477356652
      // 189: lload 2
      // 18a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: aload 12
      // 191: ifnonnull 1f5
      // 194: goto 1a1
      // 197: ldc2_w 7821769956409373487
      // 19a: lload 2
      // 19b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 13
      // 1a3: aload 0
      // 1a4: ldc2_w 8549749974576914693
      // 1a7: lload 2
      // 1a8: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: ldc2_w 8632542199857545699
      // 1b0: lload 2
      // 1b1: invokedynamic n (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: goto 1c3
      // 1b9: ldc2_w 7821769956409373487
      // 1bc: lload 2
      // 1bd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: if_acmpne 1f5
      // 1c6: aload 0
      // 1c7: ldc2_w 8549749974576914693
      // 1ca: lload 2
      // 1cb: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: lload 8
      // 1d2: bipush 1
      // 1d3: anewarray 51
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w 7589571181264363102
      // 1e2: lload 2
      // 1e3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: goto 1f5
      // 1eb: ldc2_w 7821769956409373487
      // 1ee: lload 2
      // 1ef: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: return
   }

   _yd(u9 var1) {
      this.I = var1;
   }

   static {
      long var0 = a ^ 82003149955952L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -8531460241980025933L;
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
