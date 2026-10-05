package com.zelix;

import java.io.File;
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
import javax.swing.ListModel;

public class q5 extends q0 {
   boolean B;
   String M;
   File T;
   private static final long a = ess.a(-7154937314290111882L, 5229824042908259624L, MethodHandles.lookup().lookupClass()).a(71261132217064L);
   private static final String[] i;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public q5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 74576772236934L;
      long var5 = var1 ^ 96145055510957L;
      super(var3);
      x44.a<"p">(this, true, -430696405169649192L, var1);
      x44.a<"p">(this, x44.a<"s">(b<"g">(24723, 2650363243673412808L ^ var1), -107296660723797614L, var1), -2213997876993856820L, var1);
      x44.a<"p">(this, new File(x44.a<"o">(this, -2213997876993856820L, var1)), -2130658320304938486L, var1);
      x44.a<"m">(this, new Object[]{var5}, -1974654416000961536L, var1);
   }

   public q5(long var1, ListModel var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 12588932650891L;
      long var6 = var1 ^ 126002172372042L;
      super(var3, var4);
      x44.a<"w">(this, true, 3450599602389752895L, var1);
      x44.a<"w">(this, x44.a<"t">(b<"g">(27352, 2336082558104451941L ^ var1), 3127164630625952885L, var1), 3792428093027073835L, var1);
      x44.a<"w">(this, new File(x44.a<"h">(this, 3792428093027073835L, var1)), 4001804937115121645L, var1);
      x44.a<"j">(this, new Object[]{var6}, 3566775785853542887L, var1);
   }

   public void I(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"s">(this, var2, 4678927569626657587L, var3);
   }

   private void N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 87827867302434L;
      x44.a<"i">(this, new _rt(this, var4), 2539379980419925212L, var2);
   }

   static {
      long var0 = a ^ 4718442756741L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Åû\u001cV\b)®³\u0000\u007fNA\u0083\u001fváXÎP¼¤½«ûßÿØè\u008cû\b\u0098\u00188\u0015Å0;\u0085Ñ\u0006ÐýýÑ\u0092Ô\u009b\f.k«lJ\u009cc#";
      int var8 = "Åû\u001cV\b)®³\u0000\u007fNA\u0083\u001fváXÎP¼¤½«ûßÿØè\u008cû\b\u0098\u00188\u0015Å0;\u0085Ñ\u0006ÐýýÑ\u0092Ô\u009b\f.k«lJ\u009cc#".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            i = var9;
            l = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28843;
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
            throw new RuntimeException("com/zelix/q5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         l[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/q5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
