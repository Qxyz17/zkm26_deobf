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

public class k6 extends kd {
   private static final long a = ess.a(-1963457171291228567L, -5468615513904762970L, MethodHandles.lookup().lookupClass()).a(175189043508313L);
   private static final String[] c;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   protected void Y(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var6 = (Long)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var6 ^ 4538559877319L;
      long var10 = var6 ^ 62464486610440L;
      x44.a<"o">(var2, new Object[]{var10, this}, -8320787926495092504L, var6);
      Object[] var10008 = new Object[]{null, null, null, null, var8, b<"w">(12268, 2779282089191146333L ^ var6)};
      var10008[3] = var5;
      var10008[2] = var4;
      var10008[1] = var3;
      var10008[0] = var2;
      x44.a<"o">(this, var10008, -7698716387196803538L, var6);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"w">(15225, 1745074993765293449L ^ var2);
   }

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + b<"w">(10394, 7944417843246116294L ^ var2);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var10, -6519816233838018406L, var2);
   }

   public k6(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 122418650006664L;
      super(var1, var4);
   }

   static {
      long var0 = a ^ 70314430853281L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = ",M-Q\u0088k\u001b=\u0000\u0011ð\b\u008dg*ý\u001b\t\u0080\u00adÒ\u001aò³\u001c@\u008d²y·Ô\u0019\u0005=\u0090æ\"õ&\u008b\u0007õêÀÐæ\u001evPë.\u0000ÿ7]*å\u00adíh÷ÍÎæîÆJä\u0007Å¨ö:~'NÓ±¬\u0012eIPÞ\u0088j\u0080T\u008aOüí©ëÆÛ¦n\u0085¸×\u0085v\u0004}(%.\u001asW4\u0011Ð±\u0097Zí-iî\u0003çH{Ücg> è ÙY\u0011wóÙãÌd(UÅ\f È^%,\u0089m¨\u0091\u0092\u008f½@'¡\u0017\u008d";
      int var8 = ",M-Q\u0088k\u001b=\u0000\u0011ð\b\u008dg*ý\u001b\t\u0080\u00adÒ\u001aò³\u001c@\u008d²y·Ô\u0019\u0005=\u0090æ\"õ&\u008b\u0007õêÀÐæ\u001evPë.\u0000ÿ7]*å\u00adíh÷ÍÎæîÆJä\u0007Å¨ö:~'NÓ±¬\u0012eIPÞ\u0088j\u0080T\u008aOüí©ëÆÛ¦n\u0085¸×\u0085v\u0004}(%.\u001asW4\u0011Ð±\u0097Zí-iî\u0003çH{Ücg> è ÙY\u0011wóÙãÌd(UÅ\f È^%,\u0089m¨\u0091\u0092\u008f½@'¡\u0017\u008d"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            k = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13695;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/k6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
