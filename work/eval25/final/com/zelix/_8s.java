package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8s implements Map {
   private Map m;
   private static final long a = ess.a(-3096119374258013007L, 5325052110393352712L, MethodHandles.lookup().lookupClass()).a(30105003573000L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   @Override
   public final boolean containsValue(Object var1) {
      long var2 = a ^ 34472988550093L;
      return x44.a<"i">(x44.a<"m">(this, 2410628032196793408L, var2), var1, 2440357461697659986L, var2);
   }

   @Override
   public final int size() {
      long var1 = a ^ 11758616028728L;
      return x44.a<"h">(this, 2630472201378025909L, var1).size();
   }

   @Override
   public void putAll(Map var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Set keySet() {
      long var1 = a ^ 99709372001413L;
      long var3 = var1 ^ 93637422062737L;
      return new sq(var3, x44.a<"m">(this, 7943224501569723144L, var1).keySet());
   }

   @Override
   public Object put(Object var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Set entrySet() {
      long var1 = a ^ 68969125969721L;
      return x44.a<"u">(x44.a<"i">(this, 9043338604869060788L, var1).entrySet(), 8916711178860593170L, var1);
   }

   @Override
   public final Object get(Object var1) {
      long var2 = a ^ 130947059891260L;
      return x44.a<"l">(this, -4718315356954702927L, var2).get(var1);
   }

   public _8s(long var1, Map var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 7057628187052L;
      super();
      if (var3 == null) {
         int var10001 = a<"x">(4651, 3164259989413826234L ^ var1);
         Object[] var10004 = new Object[]{null, var4};
         var10004[0] = var10001;
         x44.a<"r">(this, x44.a<"q">(var10004, 4012584456064872476L, var1), 3054625611409153872L, var1);
         if (var1 > 0L) {
            return;
         }
      }

      x44.a<"r">(this, var3, 3054625611409153872L, var1);
   }

   @Override
   public Object remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final synchronized Enumeration B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.enumeration(x44.a<"i">(this, 2546830525034616428L, var2).keySet());
   }

   @Override
   public final synchronized Collection values() {
      long var1 = a ^ 28551789804040L;
      return x44.a<"t">(x44.a<"h">(this, 8696806854820695429L, var1).values(), 7429281461408159031L, var1);
   }

   public _8s(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 121411307154344L;
      super();
      int var10001 = a<"x">(32400, 7290483439331737604L ^ var1);
      Object[] var10004 = new Object[]{null, var3};
      var10004[0] = var10001;
      x44.a<"v">(this, x44.a<"u">(var10004, 6173300714740011544L, var1), 5215271483267628372L, var1);
   }

   public final Map n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 80700301661283L;
      return x44.a<"q">(new Object[]{x44.a<"m">(this, -5369395161213583288L, var2), var4}, -5736572500978098456L, var2);
   }

   @Override
   public final boolean isEmpty() {
      long var1 = a ^ 13693536755063L;
      return x44.a<"k">(x44.a<"o">(this, 6903550121362336506L, var1), 6826435356191783264L, var1);
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final boolean containsKey(Object var1) {
      long var2 = a ^ 91055936136723L;
      return x44.a<"k">(this, -1969752100498402914L, var2).containsKey(var1);
   }

   static {
      long var0 = a ^ 90310571204605L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "éÒV$_~6\u0017^ïÅ^¯z\u009f\u0003";
      int var7 = "éÒV$_~6\u0017^ïÅ^¯z\u009f\u0003".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9626;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_8s", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_8s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
