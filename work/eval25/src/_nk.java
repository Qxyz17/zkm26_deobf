package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _nk implements Serializable {
   public _nk l;
   public int Q;
   public String D;
   public _nk N;
   public int p;
   public int A;
   public int R;
   public int T;
   private static final long a = ess.a(9069035588609524754L, -788230780322577578L, MethodHandles.lookup().lookupClass()).a(245143531964069L);
   private static final String b;

   public _nk(int var1, char var2, String var3, short var4, int var5) {
      long var6 = ((long)var2 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      super();
      x44.a<"r">(this, var1, -8021090689718096751L, var6);
      x44.a<"r">(this, var3, -7612524737185262381L, var6);
   }

   public _nk() {
   }

   public static _nk w(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 79934396891566L;
      Object[] var10004 = new Object[]{null, var1, null};
      var10004[0] = var4;
      return x44.a<"t">(var10004, 7330474318027828372L, var2);
   }

   public static _nk p(Object[] var0) {
      long var1 = (Long)var0[0];
      int var4 = (Integer)var0[1];
      String var3 = (String)var0[2];
      var1 = a ^ var1;
      long var10001 = var1 ^ 6822592246163L;
      int var5 = (int)((var1 ^ 6822592246163L) >>> 48);
      int var6 = (int)((var1 ^ 6822592246163L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      switch (var4) {
         default:
            return new _nk(var4, (char)var5, var3, (short)var6, var7);
      }
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
      // 00: getstatic com/zelix/_nk.a J
      // 03: ldc2_w 109620633376898
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 140558489017221
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w -1883704081840439301
      // 13: lload 1
      // 14: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 5
      // 1b: aload 0
      // 1c: ldc2_w -403964072364492563
      // 1f: lload 1
      // 20: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 5
      // 27: ifne 84
      // 2a: ifnonnull 7a
      // 2d: goto 3a
      // 30: ldc2_w -395212345628949909
      // 33: lload 1
      // 34: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: new java/lang/StringBuilder
      // 3d: dup
      // 3e: invokespecial java/lang/StringBuilder.<init> ()V
      // 41: ldc "<"
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: lload 3
      // 47: aload 0
      // 48: bipush 2
      // 49: anewarray 7
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
      // 5a: ldc2_w -2057119961253737330
      // 5d: lload 1
      // 5e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: getstatic com/zelix/_nk.b Ljava/lang/String;
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f: areturn
      // 70: ldc2_w -395212345628949909
      // 73: lload 1
      // 74: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: ldc2_w -403964072364492563
      // 7e: lload 1
      // 7f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: areturn
   }

   static {
      long var0 = a ^ 87161415045092L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("|\u0087\u0096NÝ\u009avã".getBytes("ISO-8859-1"));
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
