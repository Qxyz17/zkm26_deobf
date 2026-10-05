package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _zk {
   private boolean Y;
   private static final long b = ess.a(-4223966225028932182L, 5361118849675473957L, MethodHandles.lookup().lookupClass()).a(101258289723879L);
   private static final String d;

   public void P(Object[] var1) {
      String var5 = (String)var1[0];
      long var2 = (Long)var1[1];
      String var4 = (String)var1[2];
      long var6 = var2 ^ 80421033973415L;
      x44.a<"m">(this, new Object[]{var5, var4, var6}, 7256249649596675585L, var2);
   }

   public abstract void D(Object[] var1);

   public abstract void t(Object[] var1);

   public abstract void f(Object[] var1);

   public abstract void i(Object[] var1);

   public abstract void w(Object[] var1);

   protected final String t(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/_zk.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 3851383264097086582
      // 1d: lload 2
      // 1e: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 4
      // 27: aload 5
      // 29: ifnonnull 78
      // 2c: ifnull 68
      // 2f: goto 3c
      // 32: ldc2_w 3893351532566794758
      // 35: lload 2
      // 36: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 4
      // 3e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 41: aload 5
      // 43: ifnonnull 78
      // 46: goto 53
      // 49: ldc2_w 3893351532566794758
      // 4c: lload 2
      // 4d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: ldc ":"
      // 55: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 58: ifne 7b
      // 5b: goto 68
      // 5e: ldc2_w 3893351532566794758
      // 61: lload 2
      // 62: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: getstatic com/zelix/_zk.d Ljava/lang/String;
      // 6b: goto 78
      // 6e: ldc2_w 3893351532566794758
      // 71: lload 2
      // 72: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: goto 7d
      // 7b: ldc " "
      // 7d: areturn
   }

   protected void X(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = b ^ var2;
      x44.a<"p">(this, var4, 330066674896179861L, var2);
   }

   public _zk(long var1) {
      var1 = b ^ var1;
      super();
      x44.a<"u">(this, true, 3402989817564674360L, var1);
   }

   public abstract void g(Object[] var1);

   protected boolean x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"m">(this, -398980230389732233L, var2);
   }

   public abstract void Y(Object[] var1);

   static {
      long var0 = b ^ 112460458469038L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¥Aö\\Óü¤¾".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      d = var5;
   }

   private static gj b(gj var0) {
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
