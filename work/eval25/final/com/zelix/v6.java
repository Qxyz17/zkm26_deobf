package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v6 implements Serializable {
   public int Q;
   public v6 D;
   public int W;
   public String S;
   public int j;
   public v6 T;
   public int Z;
   public int B;
   private static final long a = ess.a(-4243933827124817667L, 7030512218573871966L, MethodHandles.lookup().lookupClass()).a(25001857959429L);
   private static final String b;

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/v6.a J
      // 03: ldc2_w 91327996400147
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 39058801042993
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w 6242152659396603
      // 13: lload 1
      // 14: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 5
      // 1b: aload 0
      // 1c: getfield com/zelix/v6.S Ljava/lang/String;
      // 1f: iload 5
      // 21: ifne 78
      // 24: ifnonnull 74
      // 27: goto 34
      // 2a: ldc2_w 1897031611932227994
      // 2d: lload 1
      // 2e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: ldc "<"
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: lload 3
      // 41: aload 0
      // 42: bipush 2
      // 43: anewarray 71
      // 46: dup_x1
      // 47: swap
      // 48: bipush 1
      // 49: swap
      // 4a: aastore
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: ldc2_w 2218014136856736058
      // 57: lload 1
      // 58: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: getstatic com/zelix/v6.b Ljava/lang/String;
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 69: areturn
      // 6a: ldc2_w 1897031611932227994
      // 6d: lload 1
      // 6e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: aload 0
      // 75: getfield com/zelix/v6.S Ljava/lang/String;
      // 78: areturn
   }

   public v6() {
   }

   public v6(int var1, String var2) {
      this.W = var1;
      this.S = var2;
   }

   public static v6 j(int var0, long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 53545355258751L;
      return K(var0, var3, null);
   }

   public static v6 K(int var0, long var1, String var3) {
      var1 = a ^ var1;
      switch (var0) {
         default:
            return new v6(var0, var3);
      }
   }

   static {
      long var0 = a ^ 32898809376513L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÞâZ.²;\u000b³".getBytes("ISO-8859-1"));
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
