package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ty extends KeyAdapter {
   final tr k;
   private static final long a = prr.a(8735915523010097777L, 3807177192096203012L, MethodHandles.lookup().lookupClass()).a(45674090587563L);
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
      // 000: getstatic com/zelix/ty.a J
      // 003: ldc2_w 73695387471528
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 81438175415202
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 127940168053117
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 43243069997005
      // 01b: lxor
      // 01c: lstore 8
      // 01e: pop2
      // 01f: ldc2_w 5227045185516027514
      // 022: lload 2
      // 023: invokedynamic o (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 10
      // 02a: aload 1
      // 02b: aload 10
      // 02d: ifnonnull 064
      // 030: ldc2_w 5522748184746613232
      // 033: lload 2
      // 034: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: getstatic com/zelix/ty.b J
      // 03c: l2i
      // 03d: if_icmpne 18f
      // 040: goto 04d
      // 043: ldc2_w 5647451192261371118
      // 046: lload 2
      // 047: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 1
      // 04e: ldc2_w 5551542405971415972
      // 051: lload 2
      // 052: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: goto 064
      // 05a: ldc2_w 5647451192261371118
      // 05d: lload 2
      // 05e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 0
      // 065: ldc2_w 5755231670113800556
      // 068: lload 2
      // 069: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: ldc2_w 5899491668161899786
      // 071: lload 2
      // 072: invokedynamic q (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 10
      // 079: ifnonnull 0ea
      // 07c: if_acmpne 0c0
      // 07f: goto 08c
      // 082: ldc2_w 5647451192261371118
      // 085: lload 2
      // 086: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: aload 0
      // 08d: ldc2_w 5755231670113800556
      // 090: lload 2
      // 091: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 4
      // 098: bipush 1
      // 099: anewarray 79
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w 6044168963193523829
      // 0a8: lload 2
      // 0a9: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: aload 10
      // 0b0: ifnull 18f
      // 0b3: goto 0c0
      // 0b6: ldc2_w 5647451192261371118
      // 0b9: lload 2
      // 0ba: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: ldc2_w 5551542405971415972
      // 0c4: lload 2
      // 0c5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: aload 0
      // 0cb: ldc2_w 5755231670113800556
      // 0ce: lload 2
      // 0cf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: ldc2_w 5395277289343023235
      // 0d7: lload 2
      // 0d8: invokedynamic q (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: goto 0ea
      // 0e0: ldc2_w 5647451192261371118
      // 0e3: lload 2
      // 0e4: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 10
      // 0ec: ifnonnull 15d
      // 0ef: if_acmpne 133
      // 0f2: goto 0ff
      // 0f5: ldc2_w 5647451192261371118
      // 0f8: lload 2
      // 0f9: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 0
      // 100: ldc2_w 5755231670113800556
      // 103: lload 2
      // 104: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: lload 6
      // 10b: bipush 1
      // 10c: anewarray 79
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w 5695509695123526087
      // 11b: lload 2
      // 11c: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: aload 10
      // 123: ifnull 18f
      // 126: goto 133
      // 129: ldc2_w 5647451192261371118
      // 12c: lload 2
      // 12d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 1
      // 134: ldc2_w 5551542405971415972
      // 137: lload 2
      // 138: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: aload 0
      // 13e: ldc2_w 5755231670113800556
      // 141: lload 2
      // 142: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: ldc2_w 6058895938138339747
      // 14a: lload 2
      // 14b: invokedynamic q (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: goto 15d
      // 153: ldc2_w 5647451192261371118
      // 156: lload 2
      // 157: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: if_acmpne 18f
      // 160: aload 0
      // 161: ldc2_w 5755231670113800556
      // 164: lload 2
      // 165: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/tr; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: lload 8
      // 16c: bipush 1
      // 16d: anewarray 79
      // 170: dup_x2
      // 171: dup_x2
      // 172: pop
      // 173: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 176: bipush 0
      // 177: swap
      // 178: aastore
      // 179: ldc2_w 5369591774728212233
      // 17c: lload 2
      // 17d: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: goto 18f
      // 185: ldc2_w 5647451192261371118
      // 188: lload 2
      // 189: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: return
   }

   ty(tr var1) {
      this.k = var1;
   }

   static {
      long var0 = a ^ 134701075025526L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 3905334215914459877L;
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
