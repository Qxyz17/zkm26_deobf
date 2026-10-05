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

public class kl extends kx {
   private static final long c = ess.a(266679254795777419L, 1134350196614227398L, MethodHandles.lookup().lookupClass()).a(97636262056307L);
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   protected void Y(Object[] var1) {
      _ur var6 = (_ur)var1[0];
      int var2 = (Integer)var1[1];
      int var7 = (Integer)var1[2];
      long var3 = (Long)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var3 ^ 66613990656034L;
      long var10 = var3 ^ 4538559877319L;
      x44.a<"o">(var6, new Object[]{this, var8}, -7613981933345079603L, var3);
      Object[] var10008 = new Object[]{null, null, null, null, var10, b<"l">(5911, 3400852370699084763L ^ var3)};
      var10008[3] = var5;
      var10008[2] = var7;
      var10008[1] = var2;
      var10008[0] = var6;
      x44.a<"o">(this, var10008, -7698716387196803538L, var3);
   }

   protected void U(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 54918385829176L;
      long var7 = var3 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var2, new Object[]{var7}, -6519786688485244235L, var3);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var3) + b<"l">(27197, 4030290375357511454L ^ var3);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var3), var10, -6519816233838018406L, var3);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"l">(12674, 3941676656047378191L ^ var2);
   }

   public kl(int var1, long var2) {
      var2 = c ^ var2;
      long var10001 = var2 ^ 79935916875373L;
      int var4 = (int)((var2 ^ 79935916875373L) >>> 32);
      int var5 = (int)((var2 ^ 79935916875373L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      super(var1, var4, (byte)var5, var6);
   }

   static {
      long var0 = c ^ 31275772437280L;
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
      String var6 = "\u0002\u007fÙ®¯\u000fë®,Qå\u0013= ÎÈ\u0088d\u007fi\u0014Û\u001eÀH\"Pæ!b|±\u008aºCrO\u001dÙéÉ*îíê\u008ck5ÇÍ<.Z¸v\u008a\u0082\u007f²ßÖeö,×¦wo\u0014ûcC+\u0002Þg\u0096\u0082\u008a\rÐæ#æ=Y¯$\u000e\u0019\u0001³æÍL¯n8+\u0018ÈeÃ\u0095\u001d\u0094\u0088É\u001f\u001fÜ\u001b\u0083»ÇWCÃU\u008c¢\\6\u0005\u009d9'c\u0084\bF )÷û^\u008d,\u009e\u0085\r`\rÜB\u009a\u0018VjÅ\u0012\u0000¡;";
      int var8 = "\u0002\u007fÙ®¯\u000fë®,Qå\u0013= ÎÈ\u0088d\u007fi\u0014Û\u001eÀH\"Pæ!b|±\u008aºCrO\u001dÙéÉ*îíê\u008ck5ÇÍ<.Z¸v\u008a\u0082\u007f²ßÖeö,×¦wo\u0014ûcC+\u0002Þg\u0096\u0082\u008a\rÐæ#æ=Y¯$\u000e\u0019\u0001³æÍL¯n8+\u0018ÈeÃ\u0095\u001d\u0094\u0088É\u001f\u001fÜ\u001b\u0083»ÇWCÃU\u008c¢\\6\u0005\u009d9'c\u0084\bF )÷û^\u008d,\u009e\u0085\r`\rÜB\u009a\u0018VjÅ\u0012\u0000¡;"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27904;
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
            throw new RuntimeException("com/zelix/kl", var10);
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
         throw new RuntimeException("com/zelix/kl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
