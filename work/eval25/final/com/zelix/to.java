package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class to implements sr {
   private be g;
   private int n;
   private static final long a = ess.a(-8045978422164051247L, 2562965787991917798L, MethodHandles.lookup().lookupClass()).a(52308868401532L);
   private static final String c;

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 4256743129349L;
      int var4 = (int)((var2 ^ 4256743129349L) >>> 32);
      int var5 = (int)((var2 ^ 4256743129349L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return x44.a<"m">(this, -5557395232609010501L, var2).V(var4, (short)var5, (short)var6);
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
      // 00: getstatic com/zelix/to.a J
      // 03: ldc2_w 137493005030425
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 7409394099109793222
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/to
      // 17: iload 4
      // 19: ifne 70
      // 1c: ifeq 6f
      // 1f: goto 2c
      // 22: ldc2_w 7478507679849803369
      // 25: lload 2
      // 26: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/to
      // 30: astore 5
      // 32: aload 0
      // 33: ldc2_w 9163198735560778744
      // 36: lload 2
      // 37: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: iload 4
      // 3e: ifne 6a
      // 41: aload 5
      // 43: ldc2_w 9163198735560778744
      // 46: lload 2
      // 47: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: if_icmpne 6d
      // 4f: goto 5c
      // 52: ldc2_w 7478507679849803369
      // 55: lload 2
      // 56: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 6a
      // 60: ldc2_w 7478507679849803369
      // 63: lload 2
      // 64: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: bipush 0
      // 70: ireturn
   }

   public int B(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var2 = (Integer)var1[2];
      long var5 = (long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var2 << 48 >>> 48;
      return x44.a<"n">(this, 6137908185708923388L, var5);
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 2488804181679260801L, var2);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 22538216153550L;
      return x44.a<"m">(this, 791878996786665007L, var1);
   }

   public to(int var1, long var2, be var4) {
      var2 = a ^ var2;
      super();
      x44.a<"v">(this, -1, 446144338321660643L, var2);
      x44.a<"v">(this, var1, 446144338321660643L, var2);
      x44.a<"v">(this, var4, 2095402600954024783L, var2);
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 7856323483228539660L, var2);
   }

   public be i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -679743874968143670L, var2);
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      return c;
   }

   static {
      long var0 = a ^ 115773214556439L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ì\u0082ª\u0092ÿPyä¶\u001bÚê x\"\u0004".getBytes("ISO-8859-1"));
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
