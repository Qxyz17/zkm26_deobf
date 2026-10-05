package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ym implements sr {
   private be x;
   private int e;
   private static final long a = ess.a(3659770368269564503L, -3339092305633064440L, MethodHandles.lookup().lookupClass()).a(270281971492581L);
   private static final String c;

   @Override
   public int hashCode() {
      long var1 = a ^ 36294917955939L;
      return x44.a<"i">(this, -552347130690311413L, var1).hashCode() ^ x44.a<"i">(this, -362814882460320219L, var1);
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 2474989536573895096L, var2);
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      return c + x44.a<"l">(this, -1422505750432634736L, var2) + ">";
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_ym.a J
      // 03: ldc2_w 13183867972948
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6289526525975706718
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/_ym
      // 17: iload 4
      // 19: ifne a7
      // 1c: ifeq a6
      // 1f: goto 2c
      // 22: ldc2_w -6105064496233117508
      // 25: lload 2
      // 26: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/_ym
      // 30: astore 5
      // 32: aload 0
      // 33: iload 4
      // 35: ifne 6a
      // 38: ldc2_w -5448649898875803844
      // 3b: lload 2
      // 3c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: aload 5
      // 43: ldc2_w -5448649898875803844
      // 46: lload 2
      // 47: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: if_acmpne a4
      // 4f: goto 5c
      // 52: ldc2_w -6105064496233117508
      // 55: lload 2
      // 56: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: goto 6a
      // 60: ldc2_w -6105064496233117508
      // 63: lload 2
      // 64: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: ldc2_w -5278166852528279022
      // 6d: lload 2
      // 6e: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: iload 4
      // 75: ifne a1
      // 78: aload 5
      // 7a: ldc2_w -5278166852528279022
      // 7d: lload 2
      // 7e: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: if_icmpne a4
      // 86: goto 93
      // 89: ldc2_w -6105064496233117508
      // 8c: lload 2
      // 8d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: bipush 1
      // 94: goto a1
      // 97: ldc2_w -6105064496233117508
      // 9a: lload 2
      // 9b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: goto a5
      // a4: bipush 0
      // a5: ireturn
      // a6: bipush 0
      // a7: ireturn
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public int B(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      return -1;
   }

   public _ym(long var1, int var3, be var4) {
      var1 = a ^ var1;
      super();
      x44.a<"u">(this, -1, -4459585664627964210L, var1);
      x44.a<"u">(this, var3, -4459585664627964210L, var1);
      x44.a<"u">(this, var4, -4557941305146584096L, var1);
   }

   public int m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 7702309529255128630L, var2);
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 7914420469243182645L, var2);
   }

   public be F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 6174416181271774961L, var2);
   }

   static {
      long var0 = a ^ 41709475680538L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("]:\u008búØ-\u0014zaON\u0015%¹\u000evT\u0083\u0005\u0013Ä\u0099¦u".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
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
