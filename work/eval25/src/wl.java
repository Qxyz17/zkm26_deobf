package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wl extends KeyAdapter {
   final u7 H;
   private static final long a = ess.a(3709527030274630493L, -4492393726570113618L, MethodHandles.lookup().lookupClass()).a(71800582501754L);
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
      // 000: getstatic com/zelix/wl.a J
      // 003: ldc2_w 50848911789595
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 124372659446332
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 7742078693298
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 113677792753483
      // 01b: lxor
      // 01c: lstore 8
      // 01e: dup2
      // 01f: ldc2_w 46485114902923
      // 022: lxor
      // 023: lstore 10
      // 025: dup2
      // 026: ldc2_w 115738014242444
      // 029: lxor
      // 02a: lstore 12
      // 02c: pop2
      // 02d: ldc2_w -6022141995531939337
      // 030: lload 2
      // 031: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: astore 14
      // 038: aload 1
      // 039: aload 14
      // 03b: ifnull 072
      // 03e: ldc2_w -5931221394679892591
      // 041: lload 2
      // 042: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: getstatic com/zelix/wl.b J
      // 04a: l2i
      // 04b: if_icmpne 267
      // 04e: goto 05b
      // 051: ldc2_w -5206706203792402826
      // 054: lload 2
      // 055: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: aload 1
      // 05c: ldc2_w -5555401076367619261
      // 05f: lload 2
      // 060: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: goto 072
      // 068: ldc2_w -5206706203792402826
      // 06b: lload 2
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: astore 15
      // 074: aload 15
      // 076: aload 0
      // 077: ldc2_w -5961543967876068033
      // 07a: lload 2
      // 07b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: ldc2_w -5397591804800893394
      // 083: lload 2
      // 084: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: aload 14
      // 08b: ifnull 0f4
      // 08e: if_acmpne 0d2
      // 091: goto 09e
      // 094: ldc2_w -5206706203792402826
      // 097: lload 2
      // 098: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 0
      // 09f: ldc2_w -5961543967876068033
      // 0a2: lload 2
      // 0a3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: lload 10
      // 0aa: bipush 1
      // 0ab: anewarray 133
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: ldc2_w -5285700146930672533
      // 0ba: lload 2
      // 0bb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: aload 14
      // 0c2: ifnonnull 267
      // 0c5: goto 0d2
      // 0c8: ldc2_w -5206706203792402826
      // 0cb: lload 2
      // 0cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 15
      // 0d4: aload 0
      // 0d5: ldc2_w -5961543967876068033
      // 0d8: lload 2
      // 0d9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: ldc2_w -5929596892123546287
      // 0e1: lload 2
      // 0e2: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: goto 0f4
      // 0ea: ldc2_w -5206706203792402826
      // 0ed: lload 2
      // 0ee: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 14
      // 0f6: ifnull 15f
      // 0f9: if_acmpne 13d
      // 0fc: goto 109
      // 0ff: ldc2_w -5206706203792402826
      // 102: lload 2
      // 103: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 0
      // 10a: ldc2_w -5961543967876068033
      // 10d: lload 2
      // 10e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: lload 4
      // 115: bipush 1
      // 116: anewarray 133
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: ldc2_w -6064151546822695838
      // 125: lload 2
      // 126: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: aload 14
      // 12d: ifnonnull 267
      // 130: goto 13d
      // 133: ldc2_w -5206706203792402826
      // 136: lload 2
      // 137: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 15
      // 13f: aload 0
      // 140: ldc2_w -5961543967876068033
      // 143: lload 2
      // 144: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: ldc2_w -6167251206488887620
      // 14c: lload 2
      // 14d: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: goto 15f
      // 155: ldc2_w -5206706203792402826
      // 158: lload 2
      // 159: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 14
      // 161: ifnull 1ca
      // 164: if_acmpne 1a8
      // 167: goto 174
      // 16a: ldc2_w -5206706203792402826
      // 16d: lload 2
      // 16e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: aload 0
      // 175: ldc2_w -5961543967876068033
      // 178: lload 2
      // 179: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: lload 12
      // 180: bipush 1
      // 181: anewarray 133
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 0
      // 18b: swap
      // 18c: aastore
      // 18d: ldc2_w -6261618428625744486
      // 190: lload 2
      // 191: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: aload 14
      // 198: ifnonnull 267
      // 19b: goto 1a8
      // 19e: ldc2_w -5206706203792402826
      // 1a1: lload 2
      // 1a2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 15
      // 1aa: aload 0
      // 1ab: ldc2_w -5961543967876068033
      // 1ae: lload 2
      // 1af: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: ldc2_w -5662936604045641878
      // 1b7: lload 2
      // 1b8: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: goto 1ca
      // 1c0: ldc2_w -5206706203792402826
      // 1c3: lload 2
      // 1c4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 14
      // 1cc: ifnull 235
      // 1cf: if_acmpne 213
      // 1d2: goto 1df
      // 1d5: ldc2_w -5206706203792402826
      // 1d8: lload 2
      // 1d9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 0
      // 1e0: ldc2_w -5961543967876068033
      // 1e3: lload 2
      // 1e4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: lload 6
      // 1eb: bipush 1
      // 1ec: anewarray 133
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: ldc2_w -5322920811747333767
      // 1fb: lload 2
      // 1fc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: aload 14
      // 203: ifnonnull 267
      // 206: goto 213
      // 209: ldc2_w -5206706203792402826
      // 20c: lload 2
      // 20d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: aload 15
      // 215: aload 0
      // 216: ldc2_w -5961543967876068033
      // 219: lload 2
      // 21a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: ldc2_w -5559142985740401418
      // 222: lload 2
      // 223: invokedynamic k (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: goto 235
      // 22b: ldc2_w -5206706203792402826
      // 22e: lload 2
      // 22f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: if_acmpne 267
      // 238: aload 0
      // 239: ldc2_w -5961543967876068033
      // 23c: lload 2
      // 23d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/u7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: lload 8
      // 244: bipush 1
      // 245: anewarray 133
      // 248: dup_x2
      // 249: dup_x2
      // 24a: pop
      // 24b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24e: bipush 0
      // 24f: swap
      // 250: aastore
      // 251: ldc2_w -6032970499237143733
      // 254: lload 2
      // 255: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: goto 267
      // 25d: ldc2_w -5206706203792402826
      // 260: lload 2
      // 261: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: return
   }

   wl(u7 var1) {
      this.H = var1;
   }

   static {
      long var0 = a ^ 118360242408931L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -710132694099016543L;
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
