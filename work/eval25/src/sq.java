package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sq implements Set {
   private Set g;
   private static final long a = ess.a(-308312968220810322L, 1265738365331774906L, MethodHandles.lookup().lookupClass()).a(62049186091730L);
   private static final String b;

   @Override
   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final int size() {
      return this.g.size();
   }

   @Override
   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object[] toArray(Object[] var1) {
      long var2 = a ^ 64406524168017L;
      return x44.a<"m">(this.g, var1, 2207626752094489436L, var2);
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final boolean isEmpty() {
      long var1 = a ^ 55375079757259L;
      return x44.a<"o">(this.g, -3745917635174069342L, var1);
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Iterator iterator() {
      long var1 = a ^ 99553388663889L;
      long var3 = var1 ^ 28654192386678L;
      return new _rn(var3, this);
   }

   @Override
   public final boolean contains(Object var1) {
      return this.g.contains(var1);
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 106105868049111L;
      return x44.a<"k">(this.g, 5172255642066576997L, var1);
   }

   public sq(long param1, Set param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/sq.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 7016214130772834394
      // 09: lload 1
      // 0a: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: astore 4
      // 15: aload 4
      // 17: ifnonnull 45
      // 1a: aload 3
      // 1b: ifnonnull 40
      // 1e: goto 2b
      // 21: ldc2_w 9184992280013281018
      // 24: lload 1
      // 25: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: new java/lang/IllegalArgumentException
      // 2e: dup
      // 2f: getstatic com/zelix/sq.b Ljava/lang/String;
      // 32: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: ldc2_w 9184992280013281018
      // 39: lload 1
      // 3a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: aload 3
      // 42: putfield com/zelix/sq.g Ljava/util/Set;
      // 45: return
   }

   @Override
   public final boolean containsAll(Collection var1) {
      long var2 = a ^ 23585450805628L;
      return x44.a<"h">(this.g, var1, 5444792010311751676L, var2);
   }

   static {
      long var0 = a ^ 133642672421899L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(" :C'û7\u0010LÍ4\u0014\u0000iÛ\u0007y¢\u0010¬cª\u0010+M\u001cI-\u0000í\u001aL°".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
