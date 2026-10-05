package com.zelix;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xx extends DataInputStream {
   private ByteArrayInputStream C;
   private byte[] P;
   private static String W;
   private static final long a = ess.a(-5156913483743334445L, -747227135537436681L, MethodHandles.lookup().lookupClass()).a(147531605876709L);
   private static final String b;
   private static final long c;

   public static void O(String var0) {
      W = var0;
   }

   public static String k() {
      return W;
   }

   @Override
   public void reset() {
      long var1 = a ^ 139278164225251L;
      x44.a<"n">(x44.a<"j">(this, -9050738208725810333L, var1), -8853490129949580856L, var1);
   }

   public static _xx Z(Object[] var0) {
      InputStream var2 = (InputStream)var0[0];
      long var3 = (Long)var0[1];
      int var1 = (Integer)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 109719430531994L;
      Object[] var10005 = new Object[]{null, null, null, true};
      var10005[2] = var5;
      var10005[1] = var1;
      var10005[0] = var2;
      return x44.a<"u">(var10005, 1556860043275580019L, var3);
   }

   public byte[] R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 1226741075002327962L, var2);
   }

   public static _xx F(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/io/InputStream
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Integer
      // 0f: invokevirtual java/lang/Integer.intValue ()I
      // 12: istore 1
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Long
      // 19: invokevirtual java/lang/Long.longValue ()J
      // 1c: lstore 2
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Boolean
      // 23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26: istore 4
      // 28: pop
      // 29: getstatic com/zelix/_xx.a J
      // 2c: lload 2
      // 2d: lxor
      // 2e: lstore 2
      // 2f: lload 2
      // 30: dup2
      // 31: ldc2_w 100361167892045
      // 34: lxor
      // 35: lstore 6
      // 37: pop2
      // 38: ldc2_w -534942369878985407
      // 3b: lload 2
      // 3c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: astore 8
      // 43: iload 1
      // 44: newarray 8
      // 46: astore 9
      // 48: bipush 0
      // 49: istore 10
      // 4b: iload 10
      // 4d: iload 1
      // 4e: if_icmpge a9
      // 51: aload 5
      // 53: aload 9
      // 55: iload 10
      // 57: getstatic com/zelix/_xx.c J
      // 5a: l2i
      // 5b: iload 1
      // 5c: iload 10
      // 5e: isub
      // 5f: ldc2_w -332681263507511197
      // 62: lload 2
      // 63: invokedynamic q (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: ldc2_w -1782768092143924996
      // 6b: lload 2
      // 6c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: dup
      // 72: istore 11
      // 74: lload 2
      // 75: lconst_0
      // 76: lcmp
      // 77: ifle a2
      // 7a: bipush -1
      // 7b: aload 8
      // 7d: ifnonnull a1
      // 80: if_icmpeq a9
      // 83: goto 90
      // 86: ldc2_w -62944656197897355
      // 89: lload 2
      // 8a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: iload 10
      // 92: iload 11
      // 94: goto a1
      // 97: ldc2_w -62944656197897355
      // 9a: lload 2
      // 9b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: iadd
      // a2: istore 10
      // a4: aload 8
      // a6: ifnull 4b
      // a9: new java/io/ByteArrayInputStream
      // ac: dup
      // ad: aload 9
      // af: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // b2: astore 12
      // b4: new com/zelix/_xx
      // b7: dup
      // b8: aload 12
      // ba: lload 6
      // bc: aload 9
      // be: iload 4
      // c0: invokespecial com/zelix/_xx.<init> (Ljava/io/ByteArrayInputStream;J[BZ)V
      // c3: astore 13
      // c5: aload 5
      // c7: ldc2_w -2295771697992360390
      // ca: lload 2
      // cb: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: aload 13
      // d2: lload 2
      // d3: lconst_0
      // d4: lcmp
      // d5: ifle 53
      // d8: areturn
      // d9: astore 14
      // db: aload 5
      // dd: ldc2_w -2295771697992360390
      // e0: lload 2
      // e1: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e6: aload 14
      // e8: athrow
   }

   public static _xx G(Object[] var0) {
      byte[] var1 = (byte[])var0[0];
      long var2 = (Long)var0[1];
      boolean var4 = (Boolean)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 56391442182020L;
      ByteArrayInputStream var7 = new ByteArrayInputStream(var1);
      return new _xx(var7, var5, var1, var4);
   }

   private _xx(ByteArrayInputStream var1, long var2, byte[] var4, boolean var5) {
      var2 = a ^ var2;
      super(var1);
      x44.a<"q">(this, var1, 7703695180815150063L, var2);
      if (var5) {
         try {
            MessageDigest var6 = x44.a<"r">(b, 7634993357245876569L, var2);
            x44.a<"q">(this, x44.a<"j">(var6, var4, 7906180648754876417L, var2), 7991080902744177786L, var2);
         } catch (NoSuchAlgorithmException var7) {
            x44.a<"q">(this, new byte[0], 7991080902744177786L, var2);
         }
      }
   }

   static {
      long var8 = a ^ 132733103558748L;
      if (x44.a<"q">(-4826866576760049455L, var8) != null) {
         x44.a<"q">("MhHkTc", -5049463207709109261L, var8);
      }

      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var8 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)((int)(var8 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var7 = var5.doFinal("\\\u0092~Äl!kø".getBytes("ISO-8859-1"));
      String var12 = a(var7).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var8 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var8 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -912094573710322833L;
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
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      c = var14;
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
