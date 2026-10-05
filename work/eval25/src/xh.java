package com.zelix;

import java.io.DataOutputStream;
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

public class xh extends xe {
   static final w5 h;
   double F;
   private static final long a = ess.a(4365010164930835875L, 6640247322187205274L, MethodHandles.lookup().lookupClass()).a(61576376857076L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   protected int o(long var1) {
      return 2;
   }

   public String N(long var1) {
      return x44.a<"u">(x44.a<"i">(this, -4181091990737027940L, var1), -2547880202523127136L, var1);
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 137214445240483L;
      return x44.a<"n">(this, var4, -8747520741015904241L, var2);
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public String l(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      return b<"x">(6499, 8565020042319484611L ^ var4);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2389862582294602975L, var1).l());
      x44.a<"o">(var3, x44.a<"k">(this, -2671795716505574514L, var1), -2567499035739549490L, var1);
   }

   xh(int var1, _xx var2, short var3, _83 var4, char var5, int var6) {
      long var7 = ((long)var3 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      super(var1, var4);
      x44.a<"u">(this, x44.a<"n">(var2, 5988817684118616053L, var7), 6321609349475004127L, var7);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 92703790740844L;

      double var7;
      try {
         var7 = x44.a<"o">(x44.a<"w">(var4, -796692127355418879L, var2), -1606887216001645641L, var2);
      } catch (NumberFormatException var10) {
         throw new _su(var4 + b<"x">(16316, 6509832330716466213L ^ var2));
      }

      x44.a<"t">(this, var7, -1325270204927159042L, var2);
      x44.a<"o">(this, new Object[]{var5}, -937336034939244895L, var2);
   }

   static {
      long var9 = a ^ 72228835822439L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "\u0090¸\u009f.\u0001#·õòbã·\u0000ÎÞx(¨\u009d\u001bð\u00ad\u0015\u00047\u009a0\u001aE©\u0089*S½?\u0013I£¢vó\u0015ëß\"þ-q\u001c\u001dâ\u0091\u0004|~-\u0016";
      int var6 = "\u0090¸\u009f.\u0001#·õòbã·\u0000ÎÞx(¨\u009d\u001bð\u00ad\u0015\u00047\u009a0\u001aE©\u0089*S½?\u0013I£¢vó\u0015ëß\"þ-q\u001c\u001dâ\u0091\u0004|~-\u0016"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            h = x44.a<"h">(-6331897025162412414L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public w5 m(long var1) {
      return x44.a<"h">(-1014454931518049249L, var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4932;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/xh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/xh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
