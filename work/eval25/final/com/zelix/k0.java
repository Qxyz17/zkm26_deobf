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

public class k0 extends kx {
   private static final long c = ess.a(8760997829461545824L, -740794548597907899L, MethodHandles.lookup().lookupClass()).a(17211466058570L);
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      String var9 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + b<"x">(7343, 5050834320531795945L ^ var2);
      PrintWriter var10 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      var10.println(var9);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var9, -6519816233838018406L, var2);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"x">(9265, 2205464337527747801L ^ var2);
   }

   public k0(long var1, int var3) {
      var1 = c ^ var1;
      long var10001 = var1 ^ 15832693677061L;
      int var4 = (int)((var1 ^ 15832693677061L) >>> 32);
      int var5 = (int)((var1 ^ 15832693677061L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      super(var3, var4, (byte)var5, var6);
   }

   protected void Y(Object[] var1) {
      _ur var7 = (_ur)var1[0];
      int var2 = (Integer)var1[1];
      int var6 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      int var3 = (Integer)var1[4];
      long var8 = var4 ^ 25265529915113L;
      long var10 = var4 ^ 4538559877319L;
      x44.a<"o">(var7, new Object[]{var8, this}, -8102005351125870745L, var4);
      Object[] var10008 = new Object[]{null, null, null, null, var10, b<"x">(26711, 6936325266706658046L ^ var4)};
      var10008[3] = var3;
      var10008[2] = var6;
      var10008[1] = var2;
      var10008[0] = var7;
      x44.a<"o">(this, var10008, -7698716387196803538L, var4);
   }

   static {
      long var0 = c ^ 54711342022297L;
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
      String var6 = "í²yìïOÝ\u001bC\u008bx\u0000)´\u0086b@\r¾Ò÷\u0080\f\u0087P\u0092ÉZ\u008dPnZl¢ÓUìæÆ\u0005\u001b\u0004»+þ\u000eòÒõt\u0010½\u007fÀgÕ\u0084È£±(@ví½\u001b\u0003÷f¢\u009aOc%Ð\u0005ÁwÐYt¿ºáf6+Y\"c\u0091lÀ)'þ÷ë\u0096~\u001f¢+\u009b)8\u0087*\u0017 k\u0085Bê:\tÙÑ\u0088è«L\u0010\u0089zÔù¢l§\u001cºýP3Â¡ãÎ\u0000\u009bô4]$\u008b\u0088©f6cj\u008f>t?2Ç¬ð\"9";
      int var8 = "í²yìïOÝ\u001bC\u008bx\u0000)´\u0086b@\r¾Ò÷\u0080\f\u0087P\u0092ÉZ\u008dPnZl¢ÓUìæÆ\u0005\u001b\u0004»+þ\u000eòÒõt\u0010½\u007fÀgÕ\u0084È£±(@ví½\u001b\u0003÷f¢\u009aOc%Ð\u0005ÁwÐYt¿ºáf6+Y\"c\u0091lÀ)'þ÷ë\u0096~\u001f¢+\u009b)8\u0087*\u0017 k\u0085Bê:\tÙÑ\u0088è«L\u0010\u0089zÔù¢l§\u001cºýP3Â¡ãÎ\u0000\u009bô4]$\u008b\u0088©f6cj\u008f>t?2Ç¬ð\"9"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            k = var9;
            l = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 869;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
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
         throw new RuntimeException("com/zelix/k0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
