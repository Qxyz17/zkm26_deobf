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

public class k7 extends k9 {
   private static final long c = ess.a(-5278077246157653673L, -3188764683705258839L, MethodHandles.lookup().lookupClass()).a(40661270598151L);
   private static final String[] n;
   private static final String[] p;
   private static final Map q = new HashMap(13);

   protected void Y(Object[] var1) {
      _ur var5 = (_ur)var1[0];
      int var4 = (Integer)var1[1];
      int var7 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      int var6 = (Integer)var1[4];
      long var8 = var2 ^ 4538559877319L;
      long var10 = var2 ^ 58469190253289L;
      x44.a<"o">(var5, new Object[]{var10, this}, -7508964585012238690L, var2);
      Object[] var10008 = new Object[]{null, null, null, null, var8, c<"n">(17822, 5544542192730636332L ^ var2)};
      var10008[3] = var6;
      var10008[2] = var7;
      var10008[1] = var4;
      var10008[0] = var5;
      x44.a<"o">(this, var10008, -7698716387196803538L, var2);
   }

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + c<"n">(25811, 2464748722035755148L ^ var2);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var10, -6519816233838018406L, var2);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return c<"n">(4094, 6622444334877786126L ^ var2);
   }

   public k7(int var1, long var2) {
      var2 = c ^ var2;
      long var10001 = var2 ^ 122116220889951L;
      int var4 = (int)((var2 ^ 122116220889951L) >>> 32);
      int var5 = (int)((var2 ^ 122116220889951L) << 32 >>> 40);
      int var6 = (int)(var10001 << 56 >>> 56);
      super(var1, var4, var5, (byte)var6);
   }

   static {
      long var0 = c ^ 29161570739206L;
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
      String var6 = "\u009b\u008cü\u0084`\u0002\u001aW\u000b&M.Tßí\u009añgÏ\u0012ãg\u009b\u0081\n³ñ\u0006\u00810Í\\1³|pì\u001a½\u001e\u0017·ÄiÔÎngb\u000e<ù\u001b\u0088ÃJå<(nÇTäÄ äM\u0094sé\u0091Ëö\u001ao\u0018\u0014QuØ\u000boB\b\u008f\u0089z(\u0098fEà}á\u0013l_X1\u001dK7lp\u001cÒÞ®\"Ê½\u0082Ý\u001cUt},Ð\u008b}M\u0082\u0081\u0083\u0080©mÀÏvó\u0099)\u0013Øq¥´mEbNª9Ëa¹5*±\u0093¢\u009a)~ö¯ßøõ\u000fÚ\u0018ß}\u0085Çi8õWÂì7ø¢\u009f\u0098¥è,.å·\u001b";
      int var8 = "\u009b\u008cü\u0084`\u0002\u001aW\u000b&M.Tßí\u009añgÏ\u0012ãg\u009b\u0081\n³ñ\u0006\u00810Í\\1³|pì\u001a½\u001e\u0017·ÄiÔÎngb\u000e<ù\u001b\u0088ÃJå<(nÇTäÄ äM\u0094sé\u0091Ëö\u001ao\u0018\u0014QuØ\u000boB\b\u008f\u0089z(\u0098fEà}á\u0013l_X1\u001dK7lp\u001cÒÞ®\"Ê½\u0082Ý\u001cUt},Ð\u008b}M\u0082\u0081\u0083\u0080©mÀÏvó\u0099)\u0013Øq¥´mEbNª9Ëa¹5*±\u0093¢\u009a)~ö¯ßøõ\u000fÚ\u0018ß}\u0085Çi8õWÂì7ø¢\u009f\u0098¥è,.å·\u001b"
         .length();
      char var5 = '@';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            n = var9;
            p = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23679;
      if (p[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = n[var5].getBytes("ISO-8859-1");
         p[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return p[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/k7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
