package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hc extends h4 {
   byte[] M;
   byte[] X;
   byte[] y;
   int G;
   int T;
   int E;
   int Q;
   int x;
   private static final long a = ess.a(2546676182436172088L, 1608172092600380205L, MethodHandles.lookup().lookupClass()).a(56040903916321L);
   private static final long[] b;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   int Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 7343557673506980990L, var2);
   }

   int A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -4526546534020654568L, var2);
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var4);
   }

   byte[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 4226840549858417817L, var2);
   }

   public int G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -2872035889609700977L, var2);
   }

   public int g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -5304620954098630963L, var2);
   }

   byte[] x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 677122133657295129L, var2);
   }

   hc(h8 var1, int var2, String var3, int var4, char var5, _xx var6, _y4 var7, _y4 var8, int var9, PrintWriter var10, ej var11) {
      long var12 = ((long)var4 << 32 | (long)var5 << 48 >>> 32 | (long)var9 << 48 >>> 48) ^ a;
      long var14 = var12 ^ 33947735834253L;
      super(var1, var2, var3, var14, var6, var7);
      x44.a<"s">(this, var6.readUnsignedShort(), 1940488527108559425L, var12);
      x44.a<"s">(this, var6.readUnsignedShort(), 104767731624497375L, var12);
      x44.a<"s">(this, var6.readInt(), 2085430905674975137L, var12);
      x44.a<"s">(this, new byte[x44.a<"l">(this, 2085430905674975137L, var12)], 398563675863851958L, var12);
      var6.read(x44.a<"l">(this, 398563675863851958L, var12));
      x44.a<"s">(this, var6.readUnsignedShort(), 2214109052705736076L, var12);
      x44.a<"s">(this, new byte[x44.a<"l">(this, 2214109052705736076L, var12) * b<"k">(1759, 1214643092163147585L ^ var12)], 2096035122426646932L, var12);
      var6.read(x44.a<"l">(this, 2096035122426646932L, var12));
      x44.a<"s">(this, var6.readUnsignedShort(), 1912209358465022750L, var12);
      int var16 = this.C
         - b<"k">(16905, 76580621047427990L ^ var12)
         - x44.a<"l">(this, 2085430905674975137L, var12)
         - 2
         - x44.a<"l">(this, 2096035122426646932L, var12).length
         - 2;
      x44.a<"s">(this, new byte[var16], 1984282528624053237L, var12);
      var6.read(x44.a<"l">(this, 1984282528624053237L, var12));
   }

   byte[] Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -1384916744125390779L, var2);
   }

   static {
      long var0 = a ^ 140282925184606L;
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
      String var6 = "ÃZ\u0088\u008d·w\u0019¦ªy¨\u00ad\u0081Óò>";
      int var7 = "ÃZ\u0088\u008d·w\u0019¦ªy¨\u00ad\u0081Óò>".length();
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
      d = new Integer[2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16341;
      if (d[var3] == null) {
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/hc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
