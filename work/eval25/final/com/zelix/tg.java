package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tg extends KeyAdapter {
   final u5 Q;
   private static final long a = ess.a(-6468029570115541141L, -4159711950819622533L, MethodHandles.lookup().lookupClass()).a(247793796002615L);
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
      // 000: getstatic com/zelix/tg.a J
      // 003: ldc2_w 126741410150168
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 56510543822723
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 49763372712599
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 95126589997479
      // 01b: lxor
      // 01c: lstore 8
      // 01e: pop2
      // 01f: ldc2_w 2472274160854032341
      // 022: lload 2
      // 023: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 10
      // 02a: aload 1
      // 02b: aload 10
      // 02d: ifnull 064
      // 030: ldc2_w 2563203574979361715
      // 033: lload 2
      // 034: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: getstatic com/zelix/tg.b J
      // 03c: l2i
      // 03d: if_icmpne 18f
      // 040: goto 04d
      // 043: ldc2_w 4155065263037009307
      // 046: lload 2
      // 047: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 1
      // 04e: ldc2_w 4378912416936133985
      // 051: lload 2
      // 052: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: goto 064
      // 05a: ldc2_w 4155065263037009307
      // 05d: lload 2
      // 05e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 0
      // 065: ldc2_w 2309339280334798761
      // 068: lload 2
      // 069: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: ldc2_w 4189145307656541376
      // 071: lload 2
      // 072: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 10
      // 079: ifnull 0ea
      // 07c: if_acmpne 0c0
      // 07f: goto 08c
      // 082: ldc2_w 4155065263037009307
      // 085: lload 2
      // 086: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: aload 0
      // 08d: ldc2_w 2309339280334798761
      // 090: lload 2
      // 091: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 4
      // 098: bipush 1
      // 099: anewarray 42
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w 4136797374562688290
      // 0a8: lload 2
      // 0a9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: aload 10
      // 0b0: ifnonnull 18f
      // 0b3: goto 0c0
      // 0b6: ldc2_w 4155065263037009307
      // 0b9: lload 2
      // 0ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: ldc2_w 4378912416936133985
      // 0c4: lload 2
      // 0c5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: aload 0
      // 0cb: ldc2_w 2309339280334798761
      // 0ce: lload 2
      // 0cf: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: ldc2_w 2842032467236532151
      // 0d7: lload 2
      // 0d8: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: goto 0ea
      // 0e0: ldc2_w 4155065263037009307
      // 0e3: lload 2
      // 0e4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 10
      // 0ec: ifnull 15d
      // 0ef: if_acmpne 133
      // 0f2: goto 0ff
      // 0f5: ldc2_w 4155065263037009307
      // 0f8: lload 2
      // 0f9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 0
      // 100: ldc2_w 2309339280334798761
      // 103: lload 2
      // 104: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: lload 6
      // 10b: bipush 1
      // 10c: anewarray 42
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w 4073805501838957140
      // 11b: lload 2
      // 11c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: aload 10
      // 123: ifnonnull 18f
      // 126: goto 133
      // 129: ldc2_w 4155065263037009307
      // 12c: lload 2
      // 12d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: aload 1
      // 134: ldc2_w 4378912416936133985
      // 137: lload 2
      // 138: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: aload 0
      // 13e: ldc2_w 2309339280334798761
      // 141: lload 2
      // 142: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: ldc2_w 4230743645392502338
      // 14a: lload 2
      // 14b: invokedynamic i (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: goto 15d
      // 153: ldc2_w 4155065263037009307
      // 156: lload 2
      // 157: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: if_acmpne 18f
      // 160: aload 0
      // 161: ldc2_w 2309339280334798761
      // 164: lload 2
      // 165: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/u5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: lload 8
      // 16c: bipush 1
      // 16d: anewarray 42
      // 170: dup_x2
      // 171: dup_x2
      // 172: pop
      // 173: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 176: bipush 0
      // 177: swap
      // 178: aastore
      // 179: ldc2_w 4049843560067518233
      // 17c: lload 2
      // 17d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: goto 18f
      // 185: ldc2_w 4155065263037009307
      // 188: lload 2
      // 189: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: return
   }

   tg(u5 var1) {
      this.Q = var1;
   }

   static {
      long var0 = a ^ 52311752877938L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -94870981526505209L;
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
