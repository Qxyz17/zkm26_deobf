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

public class kp extends kd {
   private static final long a = ess.a(5935285943800336374L, -8625354074723868614L, MethodHandles.lookup().lookupClass()).a(145107621011453L);
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public kp(int var1, int var2, short var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 23777887419529L;
      super(var4, var7);
   }

   protected void Y(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      int var5 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var6 = (Long)var1[3];
      int var2 = (Integer)var1[4];
      long var8 = var6 ^ 4538559877319L;
      long var10 = var6 ^ 93445360889826L;
      x44.a<"o">(var4, new Object[]{var10, this}, -7691759634204017239L, var6);
      Object[] var10008 = new Object[]{null, null, null, null, var8, b<"j">(23341, 3383195231053559684L ^ var6)};
      var10008[3] = var2;
      var10008[2] = var3;
      var10008[1] = var5;
      var10008[0] = var4;
      x44.a<"o">(this, var10008, -7698716387196803538L, var6);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"j">(1851, 7217070304401088979L ^ var2);
   }

   protected void U(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 54918385829176L;
      long var7 = var3 ^ 139384863496255L;
      PrintWriter var9 = x44.a<"i">(var2, new Object[]{var7}, -6519786688485244235L, var3);
      String var10 = x44.a<"q">(new Object[]{var5}, -4877505911717940249L, var3) + b<"j">(28990, 4055429987867440248L ^ var3);
      var9.println(var10);
      x44.a<"i">(x44.a<"h">(-4665292061875524829L, var3), var10, -6519816233838018406L, var3);
   }

   static {
      long var0 = a ^ 113902573428806L;
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
      String var6 = "O*Øl\t\u0084Dj\u0017\u008c1Ý\u0082\u0090\u0013cäó\u0017ÀQ\u0094[iHõnîBé\u0090½g\u008bÏ9<®Ñ\u0018ZºÁÿ¾õÄÚq\u0084\u001b\u0003=Â5ñQÝ\u0005R*´é\u0089åQ´àÙ\u001e\u001dz\u0090¯í¥\u0087Þï\u007f#\u0011%¹»\u009e\u0003\u008aö\u0011;ºR³øÝË0¨\u007fáÎú}ópÈíJÚ\u0005k\u001f¹íÍ\u0085½\u0080§\u0005\u0001¢½(à]\u001aüaùj@õ;\u0093¡\u0089\u0089\u0080\n·\u001dBÌQ";
      int var8 = "O*Øl\t\u0084Dj\u0017\u008c1Ý\u0082\u0090\u0013cäó\u0017ÀQ\u0094[iHõnîBé\u0090½g\u008bÏ9<®Ñ\u0018ZºÁÿ¾õÄÚq\u0084\u001b\u0003=Â5ñQÝ\u0005R*´é\u0089åQ´àÙ\u001e\u001dz\u0090¯í¥\u0087Þï\u007f#\u0011%¹»\u009e\u0003\u008aö\u0011;ºR³øÝË0¨\u007fáÎú}ópÈíJÚ\u0005k\u001f¹íÍ\u0085½\u0080§\u0005\u0001¢½(à]\u001aüaùj@õ;\u0093¡\u0089\u0089\u0080\n·\u001dBÌQ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30053;
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
            throw new RuntimeException("com/zelix/kp", var10);
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
         throw new RuntimeException("com/zelix/kp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
