package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tl implements ActionListener, KeyListener {
   final um B;
   private static final long a = ess.a(1348853996799820322L, -3386138021044151093L, MethodHandles.lookup().lookupClass()).a(30613625603145L);
   private static final long b;

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   tl(um var1) {
      this.B = var1;
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
      // 000: getstatic com/zelix/tl.a J
      // 003: ldc2_w 6967187965384
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 18984293342708
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 114543307842497
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 75929295789022
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 48358140141388
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w -5153508181092514335
      // 029: lload 2
      // 02a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 12
      // 033: ifnull 0e8
      // 036: aload 1
      // 037: ldc2_w -6536203356896447897
      // 03a: lload 2
      // 03b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 0
      // 041: ldc2_w -6475012881336583135
      // 044: lload 2
      // 045: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: ldc2_w -6668308287190935510
      // 04d: lload 2
      // 04e: invokedynamic m (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: if_acmpne 0b9
      // 056: goto 063
      // 059: ldc2_w -5154847151221156992
      // 05c: lload 2
      // 05d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: aload 0
      // 064: ldc2_w -6475012881336583135
      // 067: lload 2
      // 068: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: lload 6
      // 06f: bipush 1
      // 070: anewarray 103
      // 073: dup_x2
      // 074: dup_x2
      // 075: pop
      // 076: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 079: bipush 0
      // 07a: swap
      // 07b: aastore
      // 07c: ldc2_w -6346745207282219411
      // 07f: lload 2
      // 080: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: ldc2_w -6475012881336583135
      // 089: lload 2
      // 08a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: lload 8
      // 091: bipush 1
      // 092: anewarray 103
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: ldc2_w -6872672640705695607
      // 0a1: lload 2
      // 0a2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aload 12
      // 0a9: ifnonnull 10a
      // 0ac: goto 0b9
      // 0af: ldc2_w -5154847151221156992
      // 0b2: lload 2
      // 0b3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: ldc2_w -6475012881336583135
      // 0bd: lload 2
      // 0be: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: lload 4
      // 0c5: bipush 1
      // 0c6: anewarray 103
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w -5081072397843459039
      // 0d5: lload 2
      // 0d6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: goto 0e8
      // 0de: ldc2_w -5154847151221156992
      // 0e1: lload 2
      // 0e2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: ldc2_w -6475012881336583135
      // 0ec: lload 2
      // 0ed: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: lload 10
      // 0f4: bipush 1
      // 0f5: anewarray 103
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w -4690518185474285880
      // 104: lload 2
      // 105: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: return
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
      // 000: getstatic com/zelix/tl.a J
      // 003: ldc2_w 44150366666323
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 69499049469551
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 77363417487450
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 118193349484613
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 6094087496919
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w -4332425540867637638
      // 029: lload 2
      // 02a: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: aload 12
      // 034: ifnull 06b
      // 037: ldc2_w -4450332967424615908
      // 03a: lload 2
      // 03b: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: getstatic com/zelix/tl.b J
      // 043: l2i
      // 044: if_icmpne 128
      // 047: goto 054
      // 04a: ldc2_w -4328694117347416037
      // 04d: lload 2
      // 04e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 1
      // 055: ldc2_w -2492060661646662450
      // 058: lload 2
      // 059: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: goto 06b
      // 061: ldc2_w -4328694117347416037
      // 064: lload 2
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: ldc2_w -2468240436235155526
      // 06f: lload 2
      // 070: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w -2815235198082833487
      // 078: lload 2
      // 079: invokedynamic n (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: if_acmpne 0d7
      // 081: aload 0
      // 082: ldc2_w -2468240436235155526
      // 085: lload 2
      // 086: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: lload 6
      // 08d: bipush 1
      // 08e: anewarray 103
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w -2562272563108528650
      // 09d: lload 2
      // 09e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: aload 0
      // 0a4: ldc2_w -2468240436235155526
      // 0a7: lload 2
      // 0a8: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: lload 8
      // 0af: bipush 1
      // 0b0: anewarray 103
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: ldc2_w -2664878821096256750
      // 0bf: lload 2
      // 0c0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: aload 12
      // 0c7: ifnonnull 128
      // 0ca: goto 0d7
      // 0cd: ldc2_w -4328694117347416037
      // 0d0: lload 2
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w -2468240436235155526
      // 0db: lload 2
      // 0dc: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: lload 4
      // 0e3: bipush 1
      // 0e4: anewarray 103
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w -4402468873398915142
      // 0f3: lload 2
      // 0f4: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: aload 0
      // 0fa: ldc2_w -2468240436235155526
      // 0fd: lload 2
      // 0fe: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/um; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: lload 10
      // 105: bipush 1
      // 106: anewarray 103
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -4216282952152914605
      // 115: lload 2
      // 116: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: goto 128
      // 11e: ldc2_w -4328694117347416037
      // 121: lload 2
      // 122: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: return
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   static {
      long var0 = a ^ 37974934345003L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -4590011558354652579L;
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
