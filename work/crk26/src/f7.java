package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f7 implements Serializable {
   public String g;
   public int a;
   public int d;
   public int M;
   public f7 Y;
   public int P;
   public f7 X;
   public int v;
   private static final long b = prr.a(-8638967115964214634L, -2569222958563735003L, MethodHandles.lookup().lookupClass()).a(213255375856396L);
   private static final String c;

   public static f7 C(long var0, int var2, String var3) {
      var0 = b ^ var0;
      switch (var2) {
         default:
            return new f7(var2, var3);
      }
   }

   public f7(int var1, String var2) {
      this.v = var1;
      this.g = var2;
   }

   public f7() {
   }

   public static f7 S(int var0, long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 49818932979542L;
      return C(var3, var0, null);
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
      // 00: getstatic com/zelix/f7.b J
      // 03: ldc2_w 2404295528392
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 136528681790365
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w -4631870979797014538
      // 13: lload 1
      // 14: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 5
      // 1b: aload 0
      // 1c: getfield com/zelix/f7.g Ljava/lang/String;
      // 1f: aload 5
      // 21: ifnonnull 78
      // 24: ifnonnull 74
      // 27: goto 34
      // 2a: ldc2_w -6484158958525766220
      // 2d: lload 1
      // 2e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: ldc "<"
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: lload 3
      // 41: aload 0
      // 42: bipush 2
      // 43: anewarray 125
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
      // 54: ldc2_w -6497930846112482911
      // 57: lload 1
      // 58: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: getstatic com/zelix/f7.c Ljava/lang/String;
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 69: areturn
      // 6a: ldc2_w -6484158958525766220
      // 6d: lload 1
      // 6e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: aload 0
      // 75: getfield com/zelix/f7.g Ljava/lang/String;
      // 78: areturn
   }

   static {
      long var0 = b ^ 108271404249770L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ñ\u0080þÝ2î«\u0011".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
   }

   private static n9 a(n9 var0) {
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
