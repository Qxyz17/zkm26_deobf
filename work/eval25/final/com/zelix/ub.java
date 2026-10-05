package com.zelix;

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
import javax.swing.JFrame;

public class ub extends uj {
   ey M;
   en p;
   private static final long c = ess.a(8841271335027351913L, 8727474203338714748L, MethodHandles.lookup().lookupClass()).a(11373238033987L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ub(JFrame var1, int var2, short var3, String var4, pn var5, int var6, int var7, eq var8) {
      long var9 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ c;
      long var11 = var9 ^ 73081843741567L;
      super(var1, var11, var4, var5, var6, var8);
   }

   void S(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 36471657904402L;
      long var6 = var2 ^ 32579301688761L;
      long var8 = var2 ^ 120409143990423L;
      x44.a<"s">(
         this,
         new en(this, x44.a<"l">(this, -5402679116386116631L, var2), var8, false, x44.a<"l">(this, -6141178301222292618L, var2)),
         -5498008331966159937L,
         var2
      );
      x44.a<"s">(
         this, new ey(var6, this, x44.a<"l">(this, -5402679116386116631L, var2), x44.a<"l">(this, -6141178301222292618L, var2)), -6161383997592876308L, var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"x">(17536, 3988508563298529170L ^ var2),
         null,
         x44.a<"l">(this, -5498008331966159937L, var2),
         x44.a<"p">(new Object[]{c<"x">(27324, 8188980844666683823L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(
         x44.a<"l">(this, -5828574482245427290L, var2),
         c<"x">(23965, 5663346405584451212L ^ var2),
         null,
         x44.a<"l">(this, -6161383997592876308L, var2),
         x44.a<"p">(new Object[]{c<"x">(228, 4708882924143569905L ^ var2), var4}, -5592358899198416900L, var2),
         -5724195446017177767L,
         var2
      );
      x44.a<"h">(x44.a<"l">(this, -5828574482245427290L, var2), x44.a<"l">(this, -6161383997592876308L, var2), -5491807491691095246L, var2);
   }

   protected final void R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 19307919075270L;
      x44.a<"u">(new Object[]{c<"x">(3186, 6510267658014120463L ^ var2), var4}, -7554726856480850332L, var2);
   }

   static {
      long var0 = c ^ 9677046415189L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Q×\u001e\u0084F%AR°\u0089ùÐT4 \\\u0010oö@!ìÅ\u0084\u009eè\u009bÄ\u00adÃ\u001c\u0083\u0081@\nà#j\u009a\u0015\u001fë\u0090)ã\u0002ç!¸,Ê]Ò?\u0090ûü l®IÁZ¯ï.V\u0006\u001e\u009eÑÑZ\u0093\u008fQóÝN\"\tøÒJ\u0015Ù6â\u0014Ôz\u008að¬j¸¼«";
      int var8 = "Q×\u001e\u0084F%AR°\u0089ùÐT4 \\\u0010oö@!ìÅ\u0084\u009eè\u009bÄ\u00adÃ\u001c\u0083\u0081@\nà#j\u009a\u0015\u001fë\u0090)ã\u0002ç!¸,Ê]Ò?\u0090ûü l®IÁZ¯ï.V\u0006\u001e\u009eÑÑZ\u0093\u008fQóÝN\"\tøÒJ\u0015Ù6â\u0014Ôz\u008að¬j¸¼«"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     g = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "vH$Kû%ãþØ\u0005ÜøI\u0081SÚÿ:¬xÛµ\u0087\næ\\\u008eb\u0094\r´³\u0081©A\u001eªxý\u000fÁe\u0083dCÝ\u0010®8é\u0004ð\u0011äA\u0091\r~b}Jþâ¦þª\u0082Ô;ÅB£\tð[vÇGÌ\u008dB:Ô®\u001dº\u001d\u008dòÆ:M*¥Ù\u0012ëå\u008eã6¦\u009f©>";
                  var8 = "vH$Kû%ãþØ\u0005ÜøI\u0081SÚÿ:¬xÛµ\u0087\næ\\\u008eb\u0094\r´³\u0081©A\u001eªxý\u000fÁe\u0083dCÝ\u0010®8é\u0004ð\u0011äA\u0091\r~b}Jþâ¦þª\u0082Ô;ÅB£\tð[vÇGÌ\u008dB:Ô®\u001dº\u001d\u008dòÆ:M*¥Ù\u0012ëå\u008eã6¦\u009f©>"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18986;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ub", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/ub" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
