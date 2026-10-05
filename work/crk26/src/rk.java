package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rk extends KeyAdapter {
   final rv W;
   private static final long a = prr.a(8113834550150622491L, 7294835563745703379L, MethodHandles.lookup().lookupClass()).a(194568625195345L);
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
      // 000: getstatic com/zelix/rk.a J
      // 003: ldc2_w 103885782800873
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 139152548617665
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 2162683687184
      // 014: lxor
      // 015: lstore 6
      // 017: dup2
      // 018: ldc2_w 9566845557354
      // 01b: lxor
      // 01c: lstore 8
      // 01e: pop2
      // 01f: ldc2_w 1677346279829037495
      // 022: lload 2
      // 023: invokedynamic j (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: astore 10
      // 02a: aload 1
      // 02b: aload 10
      // 02d: ifnonnull 086
      // 030: ldc2_w 1398840876193547837
      // 033: lload 2
      // 034: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: getstatic com/zelix/rk.b J
      // 03c: l2i
      // 03d: if_icmpne 141
      // 040: goto 04d
      // 043: ldc2_w 1071350920358999427
      // 046: lload 2
      // 047: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 0
      // 04e: ldc2_w 1055635023532233981
      // 051: lload 2
      // 052: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/rv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: lload 4
      // 059: bipush 1
      // 05a: anewarray 112
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w 1292081471702080227
      // 069: lload 2
      // 06a: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 1
      // 070: ldc2_w 1352797379637595241
      // 073: lload 2
      // 074: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: goto 086
      // 07c: ldc2_w 1071350920358999427
      // 07f: lload 2
      // 080: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: astore 11
      // 088: aload 10
      // 08a: ifnonnull 104
      // 08d: aload 11
      // 08f: aload 0
      // 090: ldc2_w 1055635023532233981
      // 093: lload 2
      // 094: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/rv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: ldc2_w 798325307069373138
      // 09c: lload 2
      // 09d: invokedynamic t (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: if_acmpne 109
      // 0a5: goto 0b2
      // 0a8: ldc2_w 1071350920358999427
      // 0ab: lload 2
      // 0ac: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: ldc2_w 1055635023532233981
      // 0b6: lload 2
      // 0b7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/rv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: ldc2_w 1684103483623656250
      // 0bf: lload 2
      // 0c0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/e_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: aload 0
      // 0c6: ldc2_w 1055635023532233981
      // 0c9: lload 2
      // 0ca: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/rv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: ldc2_w 770883444632967664
      // 0d2: lload 2
      // 0d3: invokedynamic t (Ljava/lang/Object;JJ)Ljavax/swing/JFrame; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: lload 6
      // 0da: dup2_x1
      // 0db: pop2
      // 0dc: bipush 2
      // 0dd: anewarray 112
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 1
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w 1386305631979000333
      // 0f1: lload 2
      // 0f2: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: goto 104
      // 0fa: ldc2_w 1071350920358999427
      // 0fd: lload 2
      // 0fe: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 10
      // 106: ifnull 141
      // 109: aload 0
      // 10a: ldc2_w 1055635023532233981
      // 10d: lload 2
      // 10e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/rv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ldc2_w 1684103483623656250
      // 116: lload 2
      // 117: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/e_; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: lload 8
      // 11e: bipush 1
      // 11f: anewarray 112
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w 1221204394728328126
      // 12e: lload 2
      // 12f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: goto 141
      // 137: ldc2_w 1071350920358999427
      // 13a: lload 2
      // 13b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: return
   }

   rk(rv var1) {
      this.W = var1;
   }

   static {
      long var0 = a ^ 79624360137514L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -8266040047753556803L;
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
