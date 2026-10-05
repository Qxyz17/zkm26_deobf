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
import javax.swing.JButton;

public class up extends u1 {
   private static final long ab = ess.a(2856297477476021883L, 5869090952470951484L, MethodHandles.lookup().lookupClass()).a(214172024809211L);
   private static final String[] ob;
   private static final String[] pb;
   private static final Map qb = new HashMap(13);

   void n(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 21979717691601L;
      x44.a<"p">(this, new JButton(d<"v">(7775, 4757921121082148207L ^ var3)), -393662656511089560L, var3);
      x44.a<"k">(
         x44.a<"o">(this, -393662656511089560L, var3),
         x44.a<"s">(new Object[]{d<"v">(18646, 6769620095470326755L ^ var3), var5}, -2044421046874016193L, var3),
         -49638879792129504L,
         var3
      );
      x44.a<"p">(this, new JButton(d<"v">(21449, 7090920692347652346L ^ var3)), -1831320018606347894L, var3);
      x44.a<"k">(x44.a<"o">(this, -1831320018606347894L, var3), var2, -49638879792129504L, var3);
      x44.a<"p">(this, new JButton(d<"v">(16359, 638759808506766549L ^ var3)), -344629655585709134L, var3);
      x44.a<"k">(
         x44.a<"o">(this, -344629655585709134L, var3),
         x44.a<"s">(new Object[]{d<"v">(18132, 6660872314322640352L ^ var3), var5}, -2044421046874016193L, var3),
         -49638879792129504L,
         var3
      );
      x44.a<"p">(this, new JButton(d<"v">(8088, 490795557915591849L ^ var3)), -73472020737196940L, var3);
      x44.a<"k">(
         x44.a<"o">(this, -73472020737196940L, var3),
         x44.a<"s">(new Object[]{d<"v">(29878, 1768001766411562880L ^ var3), var5}, -2044421046874016193L, var3),
         -49638879792129504L,
         var3
      );
   }

   up(long var1, String var3, String var4, u6 var5, sp var6, wc var7, _ur var8, eq var9) {
      var1 = ab ^ var1;
      long var10 = (var1 ^ 96183366284819L) >>> 16;
      int var12 = (int)((var1 ^ 96183366284819L) << 48 >>> 48);
      super(var3, var4, var5, var6, var10, var7, var8, var9, (short)var12);
   }

   static {
      long var0 = ab ^ 101341809883541L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u008deã\u0085ËéÀTK°\u001aäÚí°Ü¨|\u008fó&Z[\u0091\u0010\u0087¼\u0007¾\u0014M£D&¨ä\u008dE¹(-\u0010\\\u001bâ\u007f«\"\u009bg\u0087jÏ+ÑqÍ)\u0010\u001e%à_SÒ\u0098÷ØçAù:xáq 9=\u00861\nbm0:«\u0090,\u009c\u0093²´Ì/\u0000\u009a×\u00885Ì\u009e\u000b\u0087?'\u009eÇ\u0097";
      int var8 = "\u008deã\u0085ËéÀTK°\u001aäÚí°Ü¨|\u008fó&Z[\u0091\u0010\u0087¼\u0007¾\u0014M£D&¨ä\u008dE¹(-\u0010\\\u001bâ\u007f«\"\u009bg\u0087jÏ+ÑqÍ)\u0010\u001e%à_SÒ\u0098÷ØçAù:xáq 9=\u00861\nbm0:«\u0090,\u009c\u0093²´Ì/\u0000\u009a×\u00885Ì\u009e\u000b\u0087?'\u009eÇ\u0097"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     ob = var9;
                     pb = new String[7];
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

                  var6 = "\u00adh1û\u001fÿ<\u001bl\u0092Ú@¦´ÂÜã~AÑ¯\u0082\u0098\u0087è\u008a315Uÿ{\u0018 \u0007\u0091\u0084^!ú9\u008aCÃ6øsbæ=Ì/ÔÌ7øo";
                  var8 = "\u00adh1û\u001fÿ<\u001bl\u0092Ú@¦´ÂÜã~AÑ¯\u0082\u0098\u0087è\u008a315Uÿ{\u0018 \u0007\u0091\u0084^!ú9\u008aCÃ6øsbæ=Ì/ÔÌ7øo".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27592;
      if (pb[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])qb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               qb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/up", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = ob[var5].getBytes("ISO-8859-1");
         pb[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return pb[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/up" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
