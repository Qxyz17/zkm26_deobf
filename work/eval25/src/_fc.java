package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fc {
   private int q;
   private final String L;
   private static String J;
   private static final long a = ess.a(4169513492748437831L, -1215253049222441786L, MethodHandles.lookup().lookupClass()).a(276607873362748L);
   private static final long b;

   public static String g() {
      return J;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_fc.a J
      // 03: ldc2_w 9822596743373
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 109162772013481
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w -8192016926663701827
      // 13: lload 1
      // 14: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 5
      // 1b: aload 0
      // 1c: ldc2_w -7924567438542017822
      // 1f: lload 1
      // 20: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 5
      // 27: ifnull 83
      // 2a: ifnull 79
      // 2d: goto 3a
      // 30: ldc2_w -8095497294218949127
      // 33: lload 1
      // 34: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc2_w -7924567438542017822
      // 3e: lload 1
      // 3f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: lload 3
      // 45: dup2_x1
      // 46: pop2
      // 47: aload 0
      // 48: getfield com/zelix/_fc.q I
      // 4b: bipush 3
      // 4c: anewarray 51
      // 4f: dup_x1
      // 50: swap
      // 51: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 54: bipush 2
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 0
      // 63: swap
      // 64: aastore
      // 65: ldc2_w -7862517795436896063
      // 68: lload 1
      // 69: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: areturn
      // 6f: ldc2_w -8095497294218949127
      // 72: lload 1
      // 73: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: ldc2_w -7924567438542017822
      // 7d: lload 1
      // 7e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: areturn
   }

   public _fc(long var1, String var3) {
      var1 = a ^ var1;
      super();
      this.q = (int)b;
      String var10000 = x44.a<"w">(3728466098210781011L, var1);
      this.L = var3;
      String var4 = var10000;

      try {
         if (var4 == null) {
            x44.a<"w">(new String[1], 3795254103634087965L, var1);
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, 3623484760543211543L, var1);
      }
   }

   public static void X(String var0) {
      J = var0;
   }

   static {
      long var5 = a ^ 126079695401609L;
      if (x44.a<"u">(8940883611392932089L, var5) == null) {
         x44.a<"u">("KWSBob", 9136801237932165728L, var5);
      }

      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 3576988699402272457L;
      byte[] var4 = var0.doFinal(
         new byte[]{
            (byte)((int)(var2 >>> 56)),
            (byte)((int)(var2 >>> 48)),
            (byte)((int)(var2 >>> 40)),
            (byte)((int)(var2 >>> 32)),
            (byte)((int)(var2 >>> 24)),
            (byte)((int)(var2 >>> 16)),
            (byte)((int)(var2 >>> 8)),
            (byte)((int)var2)
         }
      );
      long var7 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
