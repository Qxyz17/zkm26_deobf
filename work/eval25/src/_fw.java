package com.zelix;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fw implements PropertyChangeListener {
   final q_ X;
   private static final long a = ess.a(1756944593117257762L, -2313556817238021491L, MethodHandles.lookup().lookupClass()).a(58739006522502L);
   private static final String b;

   @Override
   public void propertyChange(PropertyChangeEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_fw.a J
      // 003: ldc2_w 85250416481172
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 69541849934274
      // 00d: lxor
      // 00e: lstore 4
      // 010: pop2
      // 011: ldc2_w 494757449769067767
      // 014: lload 2
      // 015: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: astore 6
      // 01c: aload 1
      // 01d: ldc2_w 2175040182223138171
      // 020: lload 2
      // 021: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: aload 6
      // 028: ifnull 05b
      // 02b: getstatic com/zelix/_fw.b Ljava/lang/String;
      // 02e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 031: ifeq 10a
      // 034: goto 041
      // 037: ldc2_w 58716703205101086
      // 03a: lload 2
      // 03b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: athrow
      // 041: aload 1
      // 042: ldc2_w 1768001098030687350
      // 045: lload 2
      // 046: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: checkcast java/lang/String
      // 04e: goto 05b
      // 051: ldc2_w 58716703205101086
      // 054: lload 2
      // 055: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: astore 7
      // 05d: aload 6
      // 05f: ifnull 0c7
      // 062: aload 7
      // 064: ifnull 089
      // 067: goto 074
      // 06a: ldc2_w 58716703205101086
      // 06d: lload 2
      // 06e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: aload 7
      // 076: invokevirtual java/lang/String.length ()I
      // 079: ifne 0cc
      // 07c: goto 089
      // 07f: ldc2_w 58716703205101086
      // 082: lload 2
      // 083: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 0
      // 08a: ldc2_w 291001097919186637
      // 08d: lload 2
      // 08e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: lload 4
      // 095: bipush 2
      // 096: anewarray 23
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 1
      // 0a0: swap
      // 0a1: aastore
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: bipush 0
      // 0a5: swap
      // 0a6: aastore
      // 0a7: ldc2_w 1888265510098068907
      // 0aa: lload 2
      // 0ab: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: bipush 0
      // 0b1: ldc2_w 512882661121749573
      // 0b4: lload 2
      // 0b5: invokedynamic o (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: goto 0c7
      // 0bd: ldc2_w 58716703205101086
      // 0c0: lload 2
      // 0c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 6
      // 0c9: ifnonnull 10a
      // 0cc: aload 0
      // 0cd: ldc2_w 291001097919186637
      // 0d0: lload 2
      // 0d1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/q_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: lload 4
      // 0d8: bipush 2
      // 0d9: anewarray 23
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 1
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 0
      // 0e8: swap
      // 0e9: aastore
      // 0ea: ldc2_w 1888265510098068907
      // 0ed: lload 2
      // 0ee: invokedynamic w (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: bipush 1
      // 0f4: ldc2_w 512882661121749573
      // 0f7: lload 2
      // 0f8: invokedynamic o (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: goto 10a
      // 100: ldc2_w 58716703205101086
      // 103: lload 2
      // 104: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: return
   }

   _fw(q_ var1) {
      this.X = var1;
   }

   static {
      long var0 = a ^ 117659423549646L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("8wÆöJ\u0091!äcA-û¨\u0005\u0013T".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
