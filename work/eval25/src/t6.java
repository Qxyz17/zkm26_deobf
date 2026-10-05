package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class t6 implements Serializable {
   public int N;
   public int W;
   public t6 e;
   public int k;
   public t6 o;
   public int l;
   public String s;
   public int K;
   private static final long a = ess.a(-1116205379362444267L, 1045790153117966906L, MethodHandles.lookup().lookupClass()).a(151212296103209L);
   private static final String b;

   public t6(long var1, int var3, String var4) {
      var1 = a ^ var1;
      super();
      x44.a<"s">(this, var3, 8803549299789941390L, var1);
      x44.a<"s">(this, var4, 7256831423965740941L, var1);
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
      // 00: getstatic com/zelix/t6.a J
      // 03: ldc2_w 95984260842148
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 127519525030647
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w -1680520182177101779
      // 13: lload 1
      // 14: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 5
      // 1b: aload 0
      // 1c: ldc2_w -675524634040914536
      // 1f: lload 1
      // 20: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 5
      // 27: ifne 84
      // 2a: ifnonnull 7a
      // 2d: goto 3a
      // 30: ldc2_w -1090013527021659758
      // 33: lload 1
      // 34: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: new java/lang/StringBuilder
      // 3d: dup
      // 3e: invokespecial java/lang/StringBuilder.<init> ()V
      // 41: ldc "<"
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: lload 3
      // 47: aload 0
      // 48: bipush 2
      // 49: anewarray 127
      // 4c: dup_x1
      // 4d: swap
      // 4e: bipush 1
      // 4f: swap
      // 50: aastore
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w -1008339679203287556
      // 5d: lload 1
      // 5e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: getstatic com/zelix/t6.b Ljava/lang/String;
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f: areturn
      // 70: ldc2_w -1090013527021659758
      // 73: lload 1
      // 74: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: ldc2_w -675524634040914536
      // 7e: lload 1
      // 7f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: areturn
   }

   public t6() {
   }

   public static t6 Q(Object[] var0) {
      int var4 = (Integer)var0[0];
      String var3 = (String)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 117109940465303L;
      switch (var4) {
         default:
            return new t6(var5, var4, var3);
      }
   }

   static {
      long var0 = a ^ 123936506813505L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("dU(\u0093)iPí".getBytes("ISO-8859-1"));
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
