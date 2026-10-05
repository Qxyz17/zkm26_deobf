package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class q2 {
   private _8z a;
   private static final long b = ess.a(-8419164522306513424L, 5772130894252849762L, MethodHandles.lookup().lookupClass()).a(38348744847950L);
   private static final String c;

   public final int P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"m">(x44.a<"i">(this, 4273274525204156771L, var2), new Object[0], 2464973283585872003L, var2);
   }

   public _8s l(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 92224622273701L;
      Map var7 = x44.a<"o">(this, 372625383009758981L, var2).D(var4);

      try {
         return var7 != null ? new _8s(var5, var7) : null;
      } catch (IllegalArgumentException var8) {
         throw x44.a<"s">(var8, 568127372237364888L, var2);
      }
   }

   public q2(_8z param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/q2.b J
      // 1b: lxor
      // 1c: lstore 5
      // 1e: ldc2_w 5603844514790266048
      // 21: lload 5
      // 23: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: invokespecial java/lang/Object.<init> ()V
      // 2c: astore 7
      // 2e: aload 7
      // 30: ifnonnull 67
      // 33: aload 1
      // 34: ifnonnull 5b
      // 37: goto 45
      // 3a: ldc2_w 6090012616938622462
      // 3d: lload 5
      // 3f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: new java/lang/IllegalArgumentException
      // 48: dup
      // 49: getstatic com/zelix/q2.c Ljava/lang/String;
      // 4c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4f: athrow
      // 50: ldc2_w 6090012616938622462
      // 53: lload 5
      // 55: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: aload 1
      // 5d: ldc2_w 6218804985156828259
      // 60: lload 5
      // 62: invokedynamic v (Ljava/lang/Object;Lcom/zelix/_8z;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: return
   }

   public final Object X(Object[] var1) {
      Object var3 = var1[0];
      Object var2 = var1[1];
      long var4 = (Long)var1[2];
      var4 = b ^ var4;
      long var10001 = var4 ^ 32374901226177L;
      int var6 = (int)((var4 ^ 32374901226177L) >>> 48);
      int var7 = (int)((var4 ^ 32374901226177L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return x44.a<"m">(this, -6043334955458525681L, var4).R(var3, (char)var6, var7, var2, var8);
   }

   public final synchronized Enumeration q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"j">(x44.a<"n">(this, 23233575478831740L, var2), new Object[0], 519456009537462963L, var2);
   }

   @Override
   public final Object clone() {
      long var1 = b ^ 109377396750016L;
      long var3 = var1 ^ 125053970653941L;
      long var10001 = var1 ^ 45644081949150L;
      int var5 = (int)((var1 ^ 45644081949150L) >>> 32);
      int var6 = (int)((var1 ^ 45644081949150L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      return new q2(x44.a<"v">(new Object[]{x44.a<"j">(this, -1572121586244141056L, var1), var3}, -1382756102406828019L, var1), var5, var6, var7);
   }

   static {
      long var0 = b ^ 25047520680998L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("lQ9\u0084V£@4¤÷L·ÄØÝ)\u0011ü:b÷Ól`O\u0011\u001c3\u0012\u0002ËD".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
