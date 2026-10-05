package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ov implements List {
   private final List u;
   private static final long a = ess.a(-9089731938343705322L, 1056876806346461512L, MethodHandles.lookup().lookupClass()).a(74522902703390L);
   private static final String b;

   @Override
   public Object remove(int var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public List subList(int var1, int var2) {
      long var3 = a ^ 25961220059054L;
      long var5 = (var3 ^ 125266863587280L) >>> 16;
      int var7 = (int)((var3 ^ 125266863587280L) << 48 >>> 48);
      return new _ov(var5, (char)var7, x44.a<"j">(this.u, var1, var2, 7831879004819429320L, var3));
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public ListIterator listIterator() {
      long var1 = a ^ 107720735390213L;
      long var3 = var1 ^ 131496319578200L;
      return new m3(this, var3);
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object set(int var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public ListIterator listIterator(int var1) {
      long var2 = a ^ 100394519590649L;
      int var4 = (int)((var2 ^ 88656579001700L) >>> 48);
      long var5 = (var2 ^ 88656579001700L) << 16 >>> 16;
      return new m3((char)var4, this, var1, var5);
   }

   @Override
   public final int indexOf(Object var1) {
      long var2 = a ^ 10564468950847L;
      return x44.a<"k">(this.u, var1, -9211289883153123315L, var2);
   }

   @Override
   public final boolean containsAll(Collection var1) {
      long var2 = a ^ 92289206888725L;
      return x44.a<"i">(this.u, var1, 8627501361500845961L, var2);
   }

   @Override
   public final int lastIndexOf(Object var1) {
      long var2 = a ^ 97022793533141L;
      return x44.a<"i">(this.u, var1, 2016431419847255446L, var2);
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final boolean isEmpty() {
      return this.u.isEmpty();
   }

   @Override
   public void add(int var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final int size() {
      return this.u.size();
   }

   @Override
   public Object[] toArray(Object[] var1) {
      return this.u.toArray(var1);
   }

   public _ov(long param1, char param3, List param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: bipush 16
      // 03: lshl
      // 04: iload 3
      // 05: i2l
      // 06: bipush 48
      // 08: lshl
      // 09: bipush 48
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/_ov.a J
      // 10: lxor
      // 11: lstore 5
      // 13: ldc2_w 4802234050839862176
      // 16: lload 5
      // 18: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 0
      // 1e: invokespecial java/lang/Object.<init> ()V
      // 21: astore 7
      // 23: aload 7
      // 25: ifnonnull 57
      // 28: aload 4
      // 2a: ifnonnull 51
      // 2d: goto 3b
      // 30: ldc2_w 4659652341758682097
      // 33: lload 5
      // 35: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: new java/lang/IllegalArgumentException
      // 3e: dup
      // 3f: getstatic com/zelix/_ov.b Ljava/lang/String;
      // 42: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 45: athrow
      // 46: ldc2_w 4659652341758682097
      // 49: lload 5
      // 4b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 0
      // 52: aload 4
      // 54: putfield com/zelix/_ov.u Ljava/util/List;
      // 57: return
   }

   @Override
   public Object get(int var1) {
      return this.u.get(var1);
   }

   @Override
   public final boolean contains(Object var1) {
      return this.u.contains(var1);
   }

   @Override
   public Iterator iterator() {
      long var1 = a ^ 7391544382489L;
      long var3 = var1 ^ 48221640910055L;
      return new _y2(var3, this);
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 59316684571148L;
      return x44.a<"h">(this.u, 543301053295690873L, var1);
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean addAll(int var1, Collection var2) {
      throw new UnsupportedOperationException();
   }

   static {
      long var0 = a ^ 41445954609465L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001eÝ5ë\u008c£øe\u0012P\u0000\\\u0086ÂîÜÝ\u001dwÕÍ´Rqò\u0001×= ÝØ\u00ad".getBytes("ISO-8859-1"));
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
