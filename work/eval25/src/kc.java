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

public class kc extends kd {
   private static final long a = ess.a(-1907226304606691651L, 8498368599410434514L, MethodHandles.lookup().lookupClass()).a(215523392406313L);
   private static final String[] c;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public kc(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 22446374216059L;
      super(var3, var4);
   }

   protected void U(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 54918385829176L;
      long var7 = var2 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var4, new Object[]{var7}, -6519786688485244235L, var2);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var2) + b<"l">(13493, 5594226071406498722L ^ var2);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var2), var10, -6519816233838018406L, var2);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"l">(28842, 692522278140851217L ^ var2);
   }

   protected void Y(Object[] var1) {
      _ur var7 = (_ur)var1[0];
      int var6 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var2 ^ 4538559877319L;
      long var10 = var2 ^ 132813607044572L;
      x44.a<"o">(var7, new Object[]{var10, this}, -8268477417270875586L, var2);
      Object[] var10008 = new Object[]{null, null, null, null, var8, b<"l">(31407, 1133963432772252756L ^ var2)};
      var10008[3] = var5;
      var10008[2] = var4;
      var10008[1] = var6;
      var10008[0] = var7;
      x44.a<"o">(this, var10008, -7698716387196803538L, var2);
   }

   static {
      long var0 = a ^ 125630500536310L;
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
      String var6 = "\u0097\u0015Á\u001a~\u0098±»\u0090\u0081Í\u00869¯\\\b\u009f#°LD0ûÝo\u0087\nÆ\u008f\u009c8MýÙj{U\u0091@?\u009c\u0096Òtä ·\u0086d'.VêÙ\u0098äË¡Ç5&\t?\u0089\u009abu8C¶Ô\u0007õz\u001c~\u009f\u0088À\u00ad8½Ø*´àcüJ«3dBu¦s^\u00adü\u0019à± \u0099Á\u0091³\u0093\\.ºì\u0019r\u0084\u0005èÕÀ£ \u0017&0\u0013\u0019w[Ùd$\u0019ÀkxÚÿ\u0018p»\búi.ÈWû0ûç¿½¯!À©6®\u00170Üm";
      int var8 = "\u0097\u0015Á\u001a~\u0098±»\u0090\u0081Í\u00869¯\\\b\u009f#°LD0ûÝo\u0087\nÆ\u008f\u009c8MýÙj{U\u0091@?\u009c\u0096Òtä ·\u0086d'.VêÙ\u0098äË¡Ç5&\t?\u0089\u009abu8C¶Ô\u0007õz\u001c~\u009f\u0088À\u00ad8½Ø*´àcüJ«3dBu¦s^\u00adü\u0019à± \u0099Á\u0091³\u0093\\.ºì\u0019r\u0084\u0005èÕÀ£ \u0017&0\u0013\u0019w[Ùd$\u0019ÀkxÚÿ\u0018p»\búi.ÈWû0ûç¿½¯!À©6®\u00170Üm"
         .length();
      char var5 = 'P';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22325;
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
            throw new RuntimeException("com/zelix/kc", var10);
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
         throw new RuntimeException("com/zelix/kc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
