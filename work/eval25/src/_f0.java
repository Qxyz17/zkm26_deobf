package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _f0 extends KeyAdapter {
   final q_ W;
   private static final long a = ess.a(-8414609575175786550L, -5879875071727813185L, MethodHandles.lookup().lookupClass()).a(220587149166968L);
   private static final long b;

   _f0(q_ var1) {
      this.W = var1;
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
      // 000: getstatic com/zelix/_f0.a J
      // 003: ldc2_w 134723991118396
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 526864289035
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 113838407217579
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 81293006455482
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 88508535338422
      // 022: lxor
      // 023: lstore 10
      // 025: pop2
      // 026: ldc2_w 8013805550950010140
      // 029: lload 2
      // 02a: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: astore 12
      // 031: aload 1
      // 032: aload 12
      // 034: ifnull 06b
      // 037: ldc2_w 7575913184002814210
      // 03a: lload 2
      // 03b: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: getstatic com/zelix/_f0.b J
      // 043: l2i
      // 044: if_icmpne 14f
      // 047: goto 054
      // 04a: ldc2_w 7529498208114865647
      // 04d: lload 2
      // 04e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 1
      // 055: ldc2_w 8535549793060966352
      // 058: lload 2
      // 059: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: goto 06b
      // 061: ldc2_w 7529498208114865647
      // 064: lload 2
      // 065: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: ldc2_w 7968083198662856884
      // 06f: lload 2
      // 070: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 12
      // 077: ifnull 0fe
      // 07a: lload 10
      // 07c: dup2_x1
      // 07d: pop2
      // 07e: bipush 2
      // 07f: anewarray 100
      // 082: dup_x1
      // 083: swap
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w 8174906332723256304
      // 093: lload 2
      // 094: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/l7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: if_acmpne 0dd
      // 09c: goto 0a9
      // 09f: ldc2_w 7529498208114865647
      // 0a2: lload 2
      // 0a3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: ldc2_w 7968083198662856884
      // 0ad: lload 2
      // 0ae: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: lload 6
      // 0b5: bipush 1
      // 0b6: anewarray 100
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: ldc2_w 8231156462940281641
      // 0c5: lload 2
      // 0c6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: aload 12
      // 0cd: ifnonnull 14f
      // 0d0: goto 0dd
      // 0d3: ldc2_w 7529498208114865647
      // 0d6: lload 2
      // 0d7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 1
      // 0de: ldc2_w 8535549793060966352
      // 0e1: lload 2
      // 0e2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: aload 0
      // 0e8: ldc2_w 7968083198662856884
      // 0eb: lload 2
      // 0ec: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: goto 0fe
      // 0f4: ldc2_w 7529498208114865647
      // 0f7: lload 2
      // 0f8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: lload 8
      // 100: dup2_x1
      // 101: pop2
      // 102: bipush 2
      // 103: anewarray 100
      // 106: dup_x1
      // 107: swap
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w 7510381582594973278
      // 117: lload 2
      // 118: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/w6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: if_acmpne 14f
      // 120: aload 0
      // 121: ldc2_w 7968083198662856884
      // 124: lload 2
      // 125: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: lload 4
      // 12c: bipush 1
      // 12d: anewarray 100
      // 130: dup_x2
      // 131: dup_x2
      // 132: pop
      // 133: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 136: bipush 0
      // 137: swap
      // 138: aastore
      // 139: ldc2_w 8090921097593690701
      // 13c: lload 2
      // 13d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: goto 14f
      // 145: ldc2_w 7529498208114865647
      // 148: lload 2
      // 149: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: return
   }

   static {
      long var0 = a ^ 77429932589497L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -6360225545268744476L;
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
